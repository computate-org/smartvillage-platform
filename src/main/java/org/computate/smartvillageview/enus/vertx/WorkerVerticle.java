package org.computate.smartvillageview.enus.vertx;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.serialize.ComputateZonedDateTimeSerializer;
import org.computate.search.tool.TimeTool;
import org.computate.search.tool.XmlTool;
import org.computate.vertx.api.ApiCounter;
import org.computate.vertx.api.ApiRequest;
import org.computate.vertx.api.ApiCounter;
import org.computate.vertx.api.ApiRequest;
import org.computate.smartvillageview.enus.config.ConfigKeys;
import org.computate.smartvillageview.enus.request.SiteRequestEnUS;
import org.computate.smartvillageview.enus.model.page.SitePage;
import org.computate.smartvillageview.enus.model.htm.SiteHtm;
import org.computate.vertx.api.ApiCounter;
import org.computate.vertx.api.ApiRequest;
import org.computate.vertx.config.ComputateConfigKeys;
import org.computate.vertx.handlebars.AuthHelpers;
import org.computate.vertx.handlebars.DateHelpers;
import org.computate.vertx.handlebars.SiteHelpers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.jknack.handlebars.Context;
import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Jackson2Helper;
import com.github.jknack.handlebars.Template;
import com.github.jknack.handlebars.helper.ConditionalHelpers;
import com.github.jknack.handlebars.helper.StringHelpers;
import com.google.common.io.PatternFilenameFilter;

import io.vertx.config.yaml.YamlProcessor;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.CompositeFuture;
import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.WorkerExecutor;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.auth.authentication.TokenCredentials;
import io.vertx.ext.jdbc.JDBCClient;
import io.vertx.ext.mail.MailClient;
import io.vertx.ext.mail.MailConfig;
import io.vertx.ext.web.client.WebClient;
import io.vertx.ext.web.client.predicate.ResponsePredicate;
import io.vertx.ext.web.templ.handlebars.HandlebarsTemplateEngine;
import io.vertx.pgclient.PgConnectOptions;
import io.vertx.pgclient.PgPool;
import io.vertx.sqlclient.Cursor;
import io.vertx.sqlclient.PoolOptions;
import io.vertx.sqlclient.Row;
import io.vertx.sqlclient.RowStream;
import io.vertx.sqlclient.SqlConnection;
import java.time.LocalDateTime;
import io.vertx.ext.jdbc.JDBCClient;
import io.vertx.sqlclient.Cursor;
import io.vertx.sqlclient.SqlConnection;
import io.vertx.ext.web.client.predicate.ResponsePredicate;
import io.vertx.ext.auth.authentication.TokenCredentials;
import org.computate.smartvillageview.enus.model.iotnode.IotNode;
import org.computate.smartvillageview.enus.model.traffic.simulation.reader.TrafficFcdReader;
import org.computate.smartvillageview.enus.model.traffic.time.step.TimeStep;

import org.computate.smartvillageview.enus.model.user.SiteUser;
import org.computate.smartvillageview.enus.model.htm.SiteHtm;
import org.computate.smartvillageview.enus.model.traffic.time.step.TimeStep;
import org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation;
import org.computate.smartvillageview.enus.model.iotnode.IotNode;
import org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStep;
import org.computate.smartvillageview.enus.model.page.SitePage;

/**
 */
public class WorkerVerticle extends WorkerVerticleGen<AbstractVerticle> {
	private static final Logger LOG = LoggerFactory.getLogger(WorkerVerticle.class);

	public static final Integer FACET_LIMIT = 100;

	public final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm:ss VV");

	/**
	 * A io.vertx.ext.jdbc.JDBCClient for connecting to the relational database PostgreSQL. 
	 **/
	private PgPool pgPool;

	public PgPool getPgPool() {
		return pgPool;
	}

	public void setPgPool(PgPool pgPool) {
		this.pgPool = pgPool;
	}

	private WebClient webClient;

	WorkerExecutor workerExecutor;

	Integer commitWithin;

	HandlebarsTemplateEngine templateEngine;

	Handlebars handlebars;

	/**	
	 *	This is called by Vert.x when the verticle instance is deployed. 
	 *	Initialize a new site context object for storing information about the entire site in English. 
	 *	Setup the startPromise to handle the configuration steps and starting the server. 
	 **/
	@Override()
	public void start(Promise<Void> startPromise) throws Exception, Exception {
		commitWithin = config().getInteger(ConfigKeys.SOLR_WORKER_COMMIT_WITHIN_MILLIS);

		try {
			configureData().onSuccess(a -> 
				configureWebClient().onSuccess(b -> 
					configureHandlebars().onSuccess(c -> 
						configureSharedWorkerExecutor().onSuccess(d -> 
							configureEmail().onSuccess(e -> 
								importData().onSuccess(f -> 
									refreshAllData().onSuccess(g -> {
										startPromise.complete();
									}).onFailure(ex -> startPromise.fail(ex))
								).onFailure(ex -> startPromise.fail(ex))
							).onFailure(ex -> startPromise.fail(ex))
						).onFailure(ex -> startPromise.fail(ex))
					).onFailure(ex -> startPromise.fail(ex))
				).onFailure(ex -> startPromise.fail(ex))
			).onFailure(ex -> startPromise.fail(ex));
		} catch (Exception ex) {
			LOG.error("Couldn't start verticle. ", ex);
		}
	}

	/**
	 * Val.Fail.enUS:Handlebars was not configured properly. 
	 * Val.Complete.enUS:Handlebars was configured properly. 
	 */
	private Future<Void> configureHandlebars() {
		Promise<Void> promise = Promise.promise();
		try {
			templateEngine = HandlebarsTemplateEngine.create(vertx);
			handlebars = (Handlebars)templateEngine.unwrap();

			handlebars.registerHelpers(ConditionalHelpers.class);
			handlebars.registerHelpers(StringHelpers.class);
			handlebars.registerHelpers(AuthHelpers.class);
			handlebars.registerHelpers(SiteHelpers.class);
			handlebars.registerHelpers(DateHelpers.class);
			handlebars.registerHelper("json", Jackson2Helper.INSTANCE);

			LOG.info(configureHandlebarsComplete);
			promise.complete();
		} catch(Exception ex) {
			LOG.error(configureHandlebarsFail, ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	/**	
	 **/
	private Future<Void> configureWebClient() {
		Promise<Void> promise = Promise.promise();

		try {
			webClient = WebClient.create(vertx);
			promise.complete();
		} catch(Exception ex) {
			LOG.error("Unable to configure site context. ", ex);
			promise.fail(ex);
		}

		return promise.future();
	}

	/**	
	 * 
	 * Val.ConnectionError.enUS:Could not open the database client connection. 
	 * Val.ConnectionSuccess.enUS:The database client connection was successful. 
	 * 
	 * Val.InitError.enUS:Could not initialize the database tables. 
	 * Val.InitSuccess.enUS:The database tables were created successfully. 
	 * 
	 *	Configure shared database connections across the cluster for massive scaling of the application. 
	 *	Return a promise that configures a shared database client connection. 
	 *	Load the database configuration into a shared io.vertx.ext.jdbc.JDBCClient for a scalable, clustered datasource connection pool. 
	 *	Initialize the database tables if not already created for the first time. 
	 **/
	private Future<Void> configureData() {
		Promise<Void> promise = Promise.promise();
		try {
			PgConnectOptions pgOptions = new PgConnectOptions();
			Integer jdbcMaxPoolSize = config().getInteger(ConfigKeys.JDBC_MAX_POOL_SIZE, 1);

			pgOptions.setPort(config().getInteger(ConfigKeys.JDBC_PORT));
			pgOptions.setHost(config().getString(ConfigKeys.JDBC_HOST));
			pgOptions.setDatabase(config().getString(ConfigKeys.JDBC_DATABASE));
			pgOptions.setUser(config().getString(ConfigKeys.JDBC_USERNAME));
			pgOptions.setPassword(config().getString(ConfigKeys.JDBC_PASSWORD));
			pgOptions.setIdleTimeout(config().getInteger(ConfigKeys.JDBC_MAX_IDLE_TIME, 24));
			pgOptions.setIdleTimeoutUnit(TimeUnit.HOURS);
			pgOptions.setConnectTimeout(config().getInteger(ConfigKeys.JDBC_CONNECT_TIMEOUT, 86400000));

			PoolOptions poolOptions = new PoolOptions();
			poolOptions.setMaxSize(jdbcMaxPoolSize);
			poolOptions.setMaxWaitQueueSize(config().getInteger(ConfigKeys.JDBC_MAX_WAIT_QUEUE_SIZE, 10));

			pgPool = PgPool.pool(vertx, pgOptions, poolOptions);

			LOG.info(configureDataInitSuccess);
			promise.complete();
		} catch (Exception ex) {
			LOG.error(configureDataInitError, ex);
			promise.fail(ex);
		}

		return promise.future();
	}

	/**	
	 * Val.Fail.enUS:Could not configure the shared worker executor. 
	 * Val.Complete.enUS:The shared worker executor "{}" was configured successfully. 
	 * 
	 *	Configure a shared worker executor for running blocking tasks in the background. 
	 *	Return a promise that configures the shared worker executor. 
	 **/
	private Future<Void> configureSharedWorkerExecutor() {
		Promise<Void> promise = Promise.promise();
		try {
			String name = "WorkerVerticle-WorkerExecutor";
			Integer workerPoolSize = System.getenv(ConfigKeys.WORKER_POOL_SIZE) == null ? 5 : Integer.parseInt(System.getenv(ConfigKeys.WORKER_POOL_SIZE));
			workerExecutor = vertx.createSharedWorkerExecutor(name, workerPoolSize);
			LOG.info(configureSharedWorkerExecutorComplete, name);
			promise.complete();
		} catch (Exception ex) {
			LOG.error(configureSharedWorkerExecutorFail, ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	/**	
	 * Configure sending email. 
	 * Val.Complete.enUS:Configure sending email succeeded. 
	 * Val.Fail.enUS:Configure sending email failed. 
	 **/
	private Future<Void> configureEmail() {
		Promise<Void> promise = Promise.promise();
		try {
			String emailHost = config().getString(ConfigKeys.EMAIL_HOST);
			if(StringUtils.isNotBlank(emailHost)) {
				MailConfig mailConfig = new MailConfig();
				mailConfig.setHostname(emailHost);
				mailConfig.setPort(config().getInteger(ConfigKeys.EMAIL_PORT));
				mailConfig.setSsl(config().getBoolean(ConfigKeys.EMAIL_SSL));
				mailConfig.setUsername(config().getString(ConfigKeys.EMAIL_USERNAME));
				mailConfig.setPassword(config().getString(ConfigKeys.EMAIL_PASSWORD));
				MailClient.createShared(vertx, mailConfig);
				LOG.info(configureEmailComplete);
				promise.complete();
			} else {
				LOG.info(configureEmailComplete);
				promise.complete();
			}
		} catch (Exception ex) {
			LOG.error(configureEmailFail, ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	/**
	 * Val.Scheduling.enUS:Scheduling the %s import at %s
	 * Val.Skip.enUS:Skip importing %s data. 
	 * Val.Fail.enUS:Scheduling the import of %s data failed. 
	 */
	private Future<Void> importTimer(String classSimpleName) {
		Promise<Void> promise = Promise.promise();
		if(config().getBoolean(String.format("%s_%s", ConfigKeys.ENABLE_IMPORT_DATA, classSimpleName), true)) {
			// Load the import start time and period configuration. 
			String importStartTime = config().getString(String.format("%s_%s", ConfigKeys.IMPORT_DATA_START_TIME, classSimpleName));
			String importPeriod = config().getString(String.format("%s_%s", ConfigKeys.IMPORT_DATA_PERIOD, classSimpleName));
			// Get the duration of the import period. 
			// Calculate the next start time, or the next start time after that, if the start time is in less than a minute, 
			// to give the following code enough time to complete it's calculations to ensure the import starts correctly. 

			Duration nextStartDuration = null;
			ZonedDateTime nextStartTime = null;
			if(importPeriod != null) {
				Duration duration = TimeTool.parseNextDuration(importPeriod);
				if(importStartTime == null) {
					nextStartTime = Optional.of(ZonedDateTime.now(ZoneId.of(config().getString(ConfigKeys.SITE_ZONE))))
							.map(t -> Duration.between(Instant.now(), t).toMinutes() < 1L ? t.plus(duration) : t).get();
				} else {
					nextStartTime = Optional.of(ZonedDateTime.now(ZoneId.of(config().getString(ConfigKeys.SITE_ZONE))))
							.map(t -> Duration.between(Instant.now(), t).toMinutes() < 1L ? t.plus(duration) : t).get();
				}

				// Get the time now for the import start time zone. 
				ZonedDateTime now = ZonedDateTime.now(nextStartTime.getZone());
				BigDecimal[] divideAndRemainder = BigDecimal.valueOf(Duration.between(now, nextStartTime).toMillis())
						.divideAndRemainder(BigDecimal.valueOf(duration.toMillis()));
				nextStartDuration = Duration.between(now, nextStartTime);
				if(divideAndRemainder[0].compareTo(BigDecimal.ONE) >= 0) {
					nextStartDuration = Duration.ofMillis(divideAndRemainder[1].longValueExact());
					nextStartTime = now.plus(nextStartDuration);
				}
				LOG.info(String.format(importTimerScheduling, classSimpleName, nextStartTime.format(TIME_FORMAT)));
			}
			ZonedDateTime nextStartTime2 = nextStartTime;

			if(importStartTime == null) {
				importDataClass(classSimpleName, nextStartTime2).onSuccess(a -> {
					promise.complete();
				}).onFailure(ex -> {
					LOG.error(String.format(importTimerFail, classSimpleName), ex);
					promise.fail(ex);
				});
			} else {
				vertx.setTimer(nextStartDuration.toMillis(), a -> {
					importDataClass(classSimpleName, nextStartTime2);
				});
				promise.complete();
			}
		} else {
			LOG.info(String.format(importTimerSkip, classSimpleName));
			promise.complete();
		}
		return promise.future();
	}

	/**	
	 * Import initial data
	 * Val.Skip.enUS:The data import is disabled. 
	 **/
	private Future<Void> importData() {
		Promise<Void> promise = Promise.promise();
		if(config().getBoolean(ConfigKeys.ENABLE_IMPORT_DATA)) {
			importTimer("IotNode").onSuccess(a -> {
				importTimer("SitePage").onSuccess(b -> {
					importTimer(TimeStep.CLASS_SIMPLE_NAME).onSuccess(c -> {
						promise.complete();
					});
				});
			});
		}
		else {
			LOG.info(importDataSkip);
			promise.complete();
		}
		return promise.future();
	}

	/**
	 * Description: Import initial data
	 * Val.Complete.enUS:Configuring the import of %s data completed. 
	 * Val.Fail.enUS:Configuring the import of %s data failed. 
	 */
	private Future<Void> importDataClass(String classSimpleName, ZonedDateTime startDateTime) {
		Promise<Void> promise = Promise.promise();
		if(IotNode.CLASS_SIMPLE_NAME.equals(classSimpleName)) {
			importDataIotNode().onComplete(a -> {
				String importPeriod = config().getString(String.format("%s_%s", ConfigKeys.IMPORT_DATA_PERIOD, classSimpleName));
				if(importPeriod != null && startDateTime != null) {
					Duration duration = TimeTool.parseNextDuration(importPeriod);
					ZonedDateTime nextStartTime = startDateTime.plus(duration);
					LOG.info(String.format(importTimerScheduling, classSimpleName, nextStartTime.format(TIME_FORMAT)));
					Duration nextStartDuration = Duration.between(Instant.now(), nextStartTime);
					vertx.setTimer(nextStartDuration.toMillis(), b -> {
						importDataClass(classSimpleName, nextStartTime);
					});
					promise.complete();
				} else {
					promise.complete();
				}
			});
		} else if(SitePage.CLASS_SIMPLE_NAME.equals(classSimpleName)) {
			importDataSitePage().onComplete(a -> {
				String importPeriod = config().getString(String.format("%s_%s", ConfigKeys.IMPORT_DATA_PERIOD, classSimpleName));
				if(importPeriod != null && startDateTime != null) {
					Duration duration = TimeTool.parseNextDuration(importPeriod);
					ZonedDateTime nextStartTime = startDateTime.plus(duration);
					LOG.info(String.format(importTimerScheduling, classSimpleName, nextStartTime.format(TIME_FORMAT)));
					Duration nextStartDuration = Duration.between(Instant.now(), nextStartTime);
					vertx.setTimer(nextStartDuration.toMillis(), b -> {
						importDataClass(classSimpleName, nextStartTime);
					});
					promise.complete();
				} else {
					promise.complete();
				}
			});
		} else if(TimeStep.CLASS_SIMPLE_NAME.equals(classSimpleName)) {
			SiteRequestEnUS siteRequest = new SiteRequestEnUS();
			siteRequest.setConfig(config());
			siteRequest.setWebClient(webClient);
			siteRequest.initDeepSiteRequestEnUS(siteRequest);
			TrafficFcdReader reader = new TrafficFcdReader();
			reader.setVertx(vertx);
			reader.setWorkerExecutor(workerExecutor);
			reader.initDeepForClass(siteRequest);
			reader.importFcd().onComplete(a -> {
				String importPeriod = config().getString(String.format("%s_%s", ConfigKeys.IMPORT_DATA_PERIOD, classSimpleName));
				if(importPeriod != null && startDateTime != null) {
					Duration duration = TimeTool.parseNextDuration(importPeriod);
					ZonedDateTime nextStartTime = startDateTime.plus(duration);
					LOG.info(String.format(importTimerScheduling, classSimpleName, nextStartTime.format(TIME_FORMAT)));
					Duration nextStartDuration = Duration.between(Instant.now(), nextStartTime);
					vertx.setTimer(nextStartDuration.toMillis(), b -> {
						importDataClass(classSimpleName, nextStartTime);
					});
					promise.complete();
				} else {
					promise.complete();
				}
			});
		}
		return promise.future();
	}

	/**
	 * Description: Import IOT Node data
	 * Val.Complete.enUS:Importing %s data completed. 
	 * Val.Fail.enUS:Importing %s data failed. 
	 */
	private Future<Void> importDataIotNode() {
		Promise<Void> promise = Promise.promise();
		webClient.post(config().getInteger(ConfigKeys.YGGIO_PORT), config().getString(ConfigKeys.YGGIO_HOST_NAME), config().getString(ConfigKeys.YGGIO_AUTH_LOCAL_URI))
				.ssl(config().getBoolean(ConfigKeys.YGGIO_SSL))
				.expect(ResponsePredicate.SC_OK)
				.putHeader("Content-Type", "application/json")
				.sendJsonObject(new JsonObject()
						.put("username", config().getString(ConfigKeys.YGGIO_USERNAME))
						.put("password", config().getString(ConfigKeys.YGGIO_PASSWORD))
						)
				.onSuccess(tokenResponse -> {
			JsonObject token = tokenResponse.bodyAsJsonObject();
			webClient.get(config().getInteger(ConfigKeys.YGGIO_PORT), config().getString(ConfigKeys.YGGIO_HOST_NAME), config().getString(ConfigKeys.YGGIO_API_RELATIVE_URI_IotNode))
					.ssl(config().getBoolean(ConfigKeys.YGGIO_SSL))
					.authentication(new TokenCredentials(token.getString("token")))
					.expect(ResponsePredicate.SC_OK)
					.send()
					.onSuccess(response -> {
				JsonArray data = response.bodyAsJsonArray();
				List<Future> futures = new ArrayList<>();

				data.stream().forEach(row -> {
					JsonObject json = (JsonObject)row;
					String id = json.getString("_id");

					JsonObject body = new JsonObject()
							.put(IotNode.VAR_saves, new JsonArray()
									.add(IotNode.VAR_inheritPk)
									.add(IotNode.VAR_json)
									)
							.put(IotNode.VAR_json, json)
							.put(IotNode.VAR_pk, id)
							;

					JsonObject params = new JsonObject();
					params.put("body", body);
					params.put("path", new JsonObject());
					params.put("cookie", new JsonObject());
					params.put("query", new JsonObject().put("commitWithin", 10000).put("q", "*:*").put("var", new JsonArray().add("refresh:false")));
					JsonObject context = new JsonObject().put("params", params);
					JsonObject request = new JsonObject().put("context", context);
					futures.add(vertx.eventBus().request(String.format("smart-village-view-enUS-%s", IotNode.CLASS_SIMPLE_NAME), request, new DeliveryOptions().addHeader("action", String.format("putimport%sFuture", IotNode.CLASS_SIMPLE_NAME))));
				});
				CompositeFuture.all(futures).onSuccess(a -> {
					LOG.info(String.format(importDataIotNodeComplete, IotNode.CLASS_SIMPLE_NAME));
					promise.complete();
				}).onFailure(ex -> {
					LOG.error(String.format(importDataIotNodeFail, IotNode.CLASS_SIMPLE_NAME), ex);
					promise.fail(ex);
				});
			}).onFailure(ex -> {
				LOG.error(String.format(importDataIotNodeFail, IotNode.CLASS_SIMPLE_NAME), ex);
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			LOG.error(String.format(importDataIotNodeFail, IotNode.CLASS_SIMPLE_NAME), ex);
			promise.fail(ex);
		});
		return promise.future();
	}

	/**
	 * Description: Import Site HTML data
	 * Val.Complete.enUS:Importing %s data completed. 
	 * Val.Fail.enUS:Importing %s data failed. 
	 */
	private Future<Void> importDataSitePage() {
		Promise<Void> promise = Promise.promise();
		String dynamicPagePath = config().getString(ConfigKeys.DYNAMIC_PAGE_PATH);
		File pageDir = new File(Optional.ofNullable(dynamicPagePath).orElse(getClass().getClassLoader().getResource("page").getFile()));
		String[] fileNames = pageDir.list(new PatternFilenameFilter("^.*.yml$"));
		List<Future> futures = new ArrayList<>();
		YamlProcessor yamlProcessor = new YamlProcessor();

		for(String fileName : fileNames) {
			futures.add(importSitePage(yamlProcessor, Paths.get(pageDir.getAbsolutePath(), fileName).toString()));
		}
		CompositeFuture.all(futures).onSuccess(a -> {
			LOG.info(String.format(importDataSitePageComplete, SitePage.CLASS_SIMPLE_NAME));
			promise.complete();
		}).onFailure(ex -> {
			LOG.error(String.format(importDataSitePageFail, SitePage.CLASS_SIMPLE_NAME), ex);
			promise.fail(ex);
		});
		return promise.future();
	}

	/**
	 * Description: Import page
	 * Val.Complete.enUS:Importing page %s completed. 
	 * Val.Fail.enUS:Importing page %s failed. 
	 */
	private Future<Void> importSitePage(YamlProcessor yamlProcessor, String path) {
		Promise<Void> promise = Promise.promise();
		ZonedDateTime now = ZonedDateTime.now(ZoneId.of(config().getString(ConfigKeys.SITE_ZONE)));
		vertx.fileSystem().readFile(path).onSuccess(buffer -> {
			yamlProcessor.process(vertx, null, buffer).onSuccess(json -> {
				try {
					String pageId = StringUtils.substringBeforeLast(StringUtils.substringAfterLast(path, "/"), ".");
					SiteRequestEnUS siteRequest = new SiteRequestEnUS();
					siteRequest.setConfig(config());
					siteRequest.setWebClient(webClient);
					siteRequest.initDeepSiteRequestEnUS(siteRequest);

					SitePage page = new SitePage();
					page.setSiteRequest_(siteRequest);
					page.setId(pageId);
					page.setObjectId(pageId);
					page.setPageId(pageId);
					page.setObjectTitle(json.getString("title"));
					page.setCreated(json.getString("created"));
					page.setCourseNum(json.getInteger(SitePage.VAR_courseNum));
					page.setLessonNum(json.getInteger(SitePage.VAR_lessonNum));
					page.setAuthor(json.getString("author"));
					page.setUri(json.getString("uri"));
					page.setPageImageUri(json.getString(SitePage.VAR_pageImageUri));
					page.promiseDeepForClass(siteRequest).onSuccess(a -> {
						try {
							JsonObject importBody = new JsonObject();
							JsonArray importItems = new JsonArray();
							List<Future> futures = new ArrayList<>();
							Stack<String> stack = new Stack<>();
							JsonObject pageBody1 = JsonObject.mapFrom(page);
							json.put("page", pageBody1);

							Optional.ofNullable(json.getString("h1")).ifPresent(val -> {
								try {
									Template template = handlebars.compileInline(val);
									Context engineContext = Context.newBuilder(json.getMap()).resolver(templateEngine.getResolvers()).build();
									page.setH1(Buffer.buffer(template.apply(engineContext)).toString());
								} catch (IOException ex) {
									ExceptionUtils.rethrow(ex);
								}
							});
							Optional.ofNullable(json.getString("h2")).ifPresent(val -> {
								try {
									Template template = handlebars.compileInline(val);
									Context engineContext = Context.newBuilder(json.getMap()).resolver(templateEngine.getResolvers()).build();
									page.setH2(Buffer.buffer(template.apply(engineContext)).toString());
								} catch (IOException ex) {
									ExceptionUtils.rethrow(ex);
								}
							});
			
							stack.push("html");
							stack.push("body");
							Long sequenceNum = 0L;
							for(String htmGroup : json.fieldNames()) {
								if(StringUtils.startsWith(htmGroup, "htm")) {
									JsonArray pageItems = json.getJsonArray(htmGroup);
									sequenceNum = importSiteHtm(page, json, stack, pageId, htmGroup, pageItems, futures, sequenceNum);
								}
							}
							JsonObject pageBody2 = JsonObject.mapFrom(page);
							json.put("page", pageBody2);
			
							CompositeFuture.all(futures).onSuccess(b -> {
								JsonObject pageParams = new JsonObject();
								pageParams.put("body", pageBody2);
								pageParams.put("path", new JsonObject());
								pageParams.put("cookie", new JsonObject());
								pageParams.put("query", new JsonObject().put("commitWithin", 1000).put("q", "*:*").put("var", new JsonArray().add("refresh:false")));
								JsonObject pageContext = new JsonObject().put("params", pageParams);
								JsonObject pageRequest = new JsonObject().put("context", pageContext);
								vertx.eventBus().request(String.format("smart-village-view-enUS-%s", SitePage.CLASS_SIMPLE_NAME), pageRequest, new DeliveryOptions().addHeader("action", String.format("putimport%sFuture", SitePage.CLASS_SIMPLE_NAME))).onSuccess(c -> {
									String solrHostName = config().getString(ComputateConfigKeys.SOLR_HOST_NAME);
									Integer solrPort = config().getInteger(ComputateConfigKeys.SOLR_PORT);
									String solrCollection = config().getString(ComputateConfigKeys.SOLR_COLLECTION);
									String solrRequestUri = String.format("/solr/%s/update%s", solrCollection, "?commitWithin=1000&overwrite=true&wt=json");
									String deleteQuery = String.format("classSimpleName_docvalues_string:%s AND created_docvalues_date:[* TO %s]", SiteHtm.CLASS_SIMPLE_NAME, SiteHtm.staticSearchStrCreated(null, SiteHtm.staticSearchCreated(null, now)));
									String deleteXml = String.format("<delete><query>%s</query></delete>", deleteQuery);
									webClient.post(solrPort, solrHostName, solrRequestUri)
											.putHeader("Content-Type", "text/xml")
											.sendBuffer(Buffer.buffer().appendString(deleteXml))
											.onSuccess(d -> {
										try {
											LOG.info(String.format(importSitePageComplete, SitePage.CLASS_SIMPLE_NAME));
											promise.complete();
										} catch(Exception ex) {
											LOG.error(String.format("Could not read response from Solr: http://%s:%s%s", solrHostName, solrPort, solrRequestUri), ex);
											promise.fail(ex);
										}
									}).onFailure(ex -> {
										LOG.error(String.format("Search failed. "), new RuntimeException(ex));
										promise.fail(ex);
									});
								}).onFailure(ex -> {
									LOG.error(String.format(importSitePageFail, SitePage.CLASS_SIMPLE_NAME), ex);
									promise.fail(ex);
								});
							}).onFailure(ex -> {
								LOG.error(String.format(importSitePageFail, SitePage.CLASS_SIMPLE_NAME), ex);
								promise.fail(ex);
							});
						} catch(Exception ex) {
							LOG.error(String.format(importSitePageFail, SitePage.CLASS_SIMPLE_NAME), ex);
							promise.fail(ex);
						}
					}).onFailure(ex -> {
						LOG.error(String.format(importSitePageFail, SitePage.CLASS_SIMPLE_NAME), ex);
						promise.fail(ex);
					});
				} catch(Exception ex) {
					LOG.error(String.format(importSitePageFail, SitePage.CLASS_SIMPLE_NAME), ex);
					promise.fail(ex);
				}
			}).onFailure(ex -> {
				LOG.error(String.format(importSitePageFail, SitePage.CLASS_SIMPLE_NAME), ex);
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			LOG.error(String.format(importSitePageFail, SitePage.CLASS_SIMPLE_NAME), ex);
			promise.fail(ex);
		});
		return promise.future();
	}

	private Long importSiteHtm(SitePage page, JsonObject json, Stack<String> stack, String pageId, String htmGroup, JsonArray pageItems, List<Future> futures, Long sequenceNum) throws Exception {
		Double sort = 0D;
		for(Integer i = 0; i < pageItems.size(); i++) {
			// Process a page item, one at a time
			JsonObject pageItem = (JsonObject)pageItems.getValue(i);
			String uri = json.getString(SiteHtm.VAR_uri);
			Object in = pageItem.getValue("in");
			String e = pageItem.getString("e");
			String each = pageItem.getString("each");
			JsonObject a = pageItem.getJsonObject(SiteHtm.VAR_a);
			Boolean eNoWrapParent = false;
			Boolean eNoWrap = false;
			String tabs = "";

			if(e != null) {
				// Stack the element and determine element name, wrap and tabs
				String localNameParent = stack.isEmpty() ? null : stack.peek();
				eNoWrapParent = localNameParent == null || XmlTool.HTML_ELEMENTS_NO_WRAP.contains(localNameParent);
				eNoWrap = localNameParent == null || XmlTool.HTML_ELEMENTS_NO_WRAP.contains(e);
				tabs = String.join("", Collections.nCopies(stack.size(), "  "));
				stack.push(e);
			}

			{
				// Import the start of the element
				sequenceNum++;
				JsonObject importItem = new JsonObject();
				if(e != null)
					importItem.put(SiteHtm.VAR_eBefore, e);
				String text = pageItem.getString(SiteHtm.VAR_text);
				if(text != null) {
					// Split text by lines and index each line as it's own value
					Template template = handlebars.compileInline(text);
					Context engineContext = Context.newBuilder(json.getMap()).resolver(templateEngine.getResolvers()).build();
					Buffer buffer = Buffer.buffer(template.apply(engineContext));
					String[] strs = buffer.toString().split("\r?\n");
					importItem.put(SiteHtm.VAR_text, new JsonArray().addAll(new JsonArray(Arrays.asList(strs))));
					page.addObjectText(strs);
				}
				if(!eNoWrapParent && !tabs.isEmpty()) {
					importItem.put(SiteHtm.VAR_tabs, tabs);
				}
				if(!eNoWrap) {
					importItem.put(SiteHtm.VAR_newLine, true);
				}
				importItem.put(SiteHtm.VAR_saves, new JsonArray()
						.add(SiteHtm.VAR_eBefore)
						.add(SiteHtm.VAR_a)
						.add(SiteHtm.VAR_htmBefore)
						.add(SiteHtm.VAR_sequenceNum)
						.add(SiteHtm.VAR_htmGroup)
						.add(SiteHtm.VAR_pageId)
						.add(SiteHtm.VAR_tabs)
						.add(SiteHtm.VAR_uri)
						.add(SiteHtm.VAR_text)
						);
				importItem.put(SiteHtm.VAR_created, ComputateZonedDateTimeSerializer.ZONED_DATE_TIME_FORMATTER.format(ZonedDateTime.now()));
				importItem.put(SiteHtm.VAR_pageId, pageId);
				importItem.put(SiteHtm.VAR_htmGroup, htmGroup);
				importItem.put(SiteHtm.VAR_sequenceNum, sequenceNum);
				importItem.put(SiteHtm.VAR_uri, uri);
				if(a != null) {
					// Process element attributes
					JsonObject attrs = new JsonObject();
					for(String field : a.fieldNames()) {
						// Get the value of the attribute and process template values before indexing the attribute
						String val = a.getString(field);
						if(val != null) {
							Template template = handlebars.compileInline(val);
							Context engineContext = Context.newBuilder(json.getMap()).resolver(templateEngine.getResolvers()).build();
							Buffer buffer = Buffer.buffer(template.apply(engineContext));
							attrs.put(field, buffer.toString());
						}
					}
					importItem.put(SiteHtm.VAR_a, attrs);
				}
				importItem.put(SiteHtm.VAR_id, String.format("%s_%s", SiteHtm.CLASS_SIMPLE_NAME, sequenceNum));
				for(Integer j=1; j <= stack.size(); j++) {
					// Add sort values for the element at each level of the stack
					importItem.put("sort" + j, stack.get(j - 1));
				}
	
				// Add this element import to the list of futures that will all be requested in a CompositeFuture
				JsonObject htmParams = new JsonObject();
				htmParams.put("body", importItem);
				htmParams.put("path", new JsonObject());
				htmParams.put("cookie", new JsonObject());
				htmParams.put("query", new JsonObject().put("commitWithin", 1000).put("q", "*:*").put("var", new JsonArray().add("refresh:false")));
				JsonObject htmContext = new JsonObject().put("params", htmParams);
				JsonObject htmRequest = new JsonObject().put("context", htmContext);
				futures.add(vertx.eventBus().request(String.format("smart-village-view-enUS-%s", SiteHtm.CLASS_SIMPLE_NAME), htmRequest, new DeliveryOptions().addHeader("action", String.format("putimport%sFuture", SiteHtm.CLASS_SIMPLE_NAME))));
			}

			if(each != null) {
				// Process the "each" element by evaluating the template and processing the values
				Template template = handlebars.compileInline(String.format("{{json %s }}", each));
				Context engineContext = Context.newBuilder(json.getMap()).resolver(templateEngine.getResolvers()).build();
				Buffer buffer = Buffer.buffer(template.apply(engineContext));
				String eachVar = pageItem.getString("eachVar", "item");
				String indexVar = pageItem.getString("indexVar", "@index");
				JsonArray eachArray = new JsonArray(buffer);

				if(in != null) {
					for(Integer j=0; j < eachArray.size(); j++) {
						JsonObject eachJson = eachArray.getJsonObject(j);
						JsonObject json2 = json.copy();
						json2.put(eachVar, eachJson);
						json2.put(indexVar, j);
						// Process nested elements of the "in" value
						if(in instanceof JsonObject) {
							// Process the nested JsonObject of the "in" value
							sequenceNum = importSiteHtm(page, json2, stack, pageId, htmGroup, new JsonArray().add(in), futures, sequenceNum);
						} else if(in instanceof JsonArray) {
							// Process the each of the nested JsonObjects in the array of the "in" value
							sequenceNum = importSiteHtm(page, json2, stack, pageId, htmGroup, (JsonArray)in, futures, sequenceNum);
						}
					}
				}
				json.remove(eachVar);
			} else {
				if(in != null) {
					// Process nested elements of the "in" value
					if(in instanceof JsonObject) {
						// Process the nested JsonObject of the "in" value
						sequenceNum = importSiteHtm(page, json, stack, pageId, htmGroup, new JsonArray().add(in), futures, sequenceNum);
					} else if(in instanceof JsonArray) {
						// Process the each of the nested JsonObjects in the array of the "in" value
						sequenceNum = importSiteHtm(page, json, stack, pageId, htmGroup, (JsonArray)in, futures, sequenceNum);
					}
				}
			}

			if(e != null) {
				// Import the end of the element
				sequenceNum++;
				JsonObject importItem = new JsonObject();
				importItem.put(SiteHtm.VAR_eAfter, e);
				if(!eNoWrap && !tabs.isEmpty()) {
					importItem.put(SiteHtm.VAR_tabs, tabs);
				}
				if(!eNoWrapParent) {
					importItem.put(SiteHtm.VAR_newLine, true);
				}
				importItem.put(SiteHtm.VAR_saves, new JsonArray()
						.add(SiteHtm.VAR_eAfter)
						.add(SiteHtm.VAR_htmAfter)
						.add(SiteHtm.VAR_sequenceNum)
						.add(SiteHtm.VAR_htmGroup)
						.add(SiteHtm.VAR_pageId)
						.add(SiteHtm.VAR_tabs)
						.add(SiteHtm.VAR_uri)
						);
				importItem.put(SiteHtm.VAR_created, ComputateZonedDateTimeSerializer.ZONED_DATE_TIME_FORMATTER.format(ZonedDateTime.now()));
				importItem.put(SiteHtm.VAR_pageId, pageId);
				importItem.put(SiteHtm.VAR_htmGroup, htmGroup);
				importItem.put(SiteHtm.VAR_sequenceNum, sequenceNum);
				importItem.put(SiteHtm.VAR_uri, uri);
				importItem.put(SiteHtm.VAR_id, String.format("%s_%s", SiteHtm.CLASS_SIMPLE_NAME, sequenceNum));
				for(Integer j=1; j <= stack.size(); j++) {
					importItem.put("sort" + j, stack.get(j - 1));
				}
	
				JsonObject htmParams = new JsonObject();
				htmParams.put("body", importItem);
				htmParams.put("path", new JsonObject());
				htmParams.put("cookie", new JsonObject());
				htmParams.put("query", new JsonObject().put("commitWithin", 1000).put("q", "*:*").put("var", new JsonArray().add("refresh:false")));
				JsonObject htmContext = new JsonObject().put("params", htmParams);
				JsonObject htmRequest = new JsonObject().put("context", htmContext);
				futures.add(vertx.eventBus().request(String.format("smart-village-view-enUS-%s", SiteHtm.CLASS_SIMPLE_NAME), htmRequest, new DeliveryOptions().addHeader("action", String.format("putimport%sFuture", SiteHtm.CLASS_SIMPLE_NAME))));
			}

			if(e != null) {
				stack.pop();
			}
		}
		return sequenceNum;
	}

	/**
	 * Val.Complete.enUS:Refresh all data completed. 
	 * Val.Started.enUS:Refresh all data started. 
	 * Val.Fail.enUS:Refresh all data failed. 
	 * Val.Skip.enUS:Refresh all data skipped. 
	 **/
	private Future<Void> refreshAllData() {
		Promise<Void> promise = Promise.promise();
		try {
			if(config().getBoolean(ConfigKeys.ENABLE_REFRESH_DATA, false)) {
				LOG.info(refreshAllDataStarted);
				refreshData(SiteUser.CLASS_SIMPLE_NAME).onSuccess(q -> {
					refreshData(SiteHtm.CLASS_SIMPLE_NAME).onSuccess(q1 -> {
						refreshData(TimeStep.CLASS_SIMPLE_NAME).onSuccess(q2 -> {
							refreshData(TrafficSimulation.CLASS_SIMPLE_NAME).onSuccess(q3 -> {
								refreshData(IotNode.CLASS_SIMPLE_NAME).onSuccess(q4 -> {
									refreshData(VehicleStep.CLASS_SIMPLE_NAME).onSuccess(q5 -> {
										refreshData(SitePage.CLASS_SIMPLE_NAME).onSuccess(q6 -> {
											LOG.info(refreshAllDataComplete);
											promise.complete();
										}).onFailure(ex -> {
											LOG.error(refreshAllDataFail, ex);
											promise.fail(ex);
										});
									}).onFailure(ex -> {
										LOG.error(refreshAllDataFail, ex);
										promise.fail(ex);
									});
								}).onFailure(ex -> {
									LOG.error(refreshAllDataFail, ex);
									promise.fail(ex);
								});
							}).onFailure(ex -> {
								LOG.error(refreshAllDataFail, ex);
								promise.fail(ex);
							});
						}).onFailure(ex -> {
							LOG.error(refreshAllDataFail, ex);
							promise.fail(ex);
						});
					}).onFailure(ex -> {
						LOG.error(refreshAllDataFail, ex);
						promise.fail(ex);
					});
				}).onFailure(ex -> {
					LOG.error(refreshAllDataFail, ex);
					promise.fail(ex);
				});
			} else {
				LOG.info(refreshAllDataSkip);
				promise.complete();
			}
		} catch(Exception ex) {
			LOG.error(refreshAllDataFail, ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	/**
	 * Sync %s data from the database to Solr. 
	 * Refresh %s data from the database to Solr. 
	 * Val.Complete.enUS:%s refresh completed. 
	 * Val.Started.enUS:%s data sync started. 
	 * Val.Skip.enUS:%s refresh skipped. 
	 * Val.Fail.enUS:%s refresh failed. 
	 * Val.CounterResetFail.enUS:%s data sync failed to reset counter. 
	 **/
	private Future<Void> refreshData(String tableName) {
		Promise<Void> promise = Promise.promise();
		if(config().getBoolean(String.format("%s_%s", ConfigKeys.ENABLE_REFRESH_DATA, tableName), false)) {
			vertx.setTimer(10000, timer -> {
				try {
					LOG.info(String.format(refreshDataStarted, tableName));
					pgPool.withTransaction(sqlConnection -> {
						Promise<Void> promise1 = Promise.promise();
						sqlConnection.query(String.format("SELECT count(pk) FROM %s", tableName)).execute().onSuccess(countRowSet -> {
							try {
								Optional<Long> rowCountOptional = Optional.ofNullable(countRowSet.iterator().next()).map(row -> row.getLong(0));
								if(rowCountOptional.isPresent()) {
									Integer apiCounterResume = config().getInteger(ConfigKeys.API_COUNTER_RESUME);
									Integer apiCounterFetch = config().getInteger(ConfigKeys.API_COUNTER_FETCH);
									ApiCounter apiCounter = new ApiCounter();
		
									SiteRequestEnUS siteRequest = new SiteRequestEnUS();
									siteRequest.setConfig(config());
									siteRequest.initDeepSiteRequestEnUS(siteRequest);
			
									ApiRequest apiRequest = new ApiRequest();
									apiRequest.setRows(apiCounterFetch.longValue());
									apiRequest.setNumFound(rowCountOptional.get());
									apiRequest.setNumPATCH(apiCounter.getQueueNum());
									apiRequest.setCreated(ZonedDateTime.now(ZoneId.of(config().getString(ConfigKeys.SITE_ZONE))));
									apiRequest.initDeepApiRequest(siteRequest);
									vertx.eventBus().publish(String.format("websocket%s", tableName), JsonObject.mapFrom(apiRequest));
			
									sqlConnection.prepare(String.format("SELECT pk FROM %s", tableName)).onSuccess(preparedStatement -> {
										apiCounter.setQueueNum(0L);
										apiCounter.setTotalNum(0L);
										try {
											RowStream<Row> stream = preparedStatement.createStream(apiCounterFetch);
											stream.pause();
											stream.fetch(apiCounterFetch);
											stream.exceptionHandler(ex -> {
												LOG.error(String.format(refreshDataFail, tableName), new RuntimeException(ex));
												promise1.fail(ex);
											});
											stream.endHandler(v -> {
												LOG.info(String.format(refreshDataComplete, tableName));
												promise1.complete();
											});
											stream.handler(row -> {
												apiCounter.incrementQueueNum();
												try {
													vertx.eventBus().request(
															String.format("smart-village-view-enUS-%s", tableName)
															, new JsonObject().put(
																	"context"
																	, new JsonObject().put(
																			"params"
																			, new JsonObject()
																					.put("body", new JsonObject().put("pk", row.getLong(0).toString()))
																					.put("path", new JsonObject())
																					.put("cookie", new JsonObject())
																					.put("query", new JsonObject().put("q", "*:*").put("fq", new JsonArray().add("pk:" + row.getLong(0))).put("var", new JsonArray().add("refresh:false")))
																	)
															)
															, new DeliveryOptions().addHeader("action", String.format("patch%sFuture", tableName))).onSuccess(a -> {
														apiCounter.incrementTotalNum();
														apiCounter.decrementQueueNum();
														if(apiCounter.getQueueNum().compareTo(apiCounterResume.longValue()) == 0) {
															stream.fetch(apiCounterFetch);
															apiRequest.setNumPATCH(apiCounter.getTotalNum());
															apiRequest.setTimeRemaining(apiRequest.calculateTimeRemaining());
															vertx.eventBus().publish(String.format("websocket%s", tableName), JsonObject.mapFrom(apiRequest));
														}
													}).onFailure(ex -> {
														LOG.error(String.format(refreshDataFail, tableName), ex);
														promise1.fail(ex);
													});
												} catch (Exception ex) {
													LOG.error(String.format(refreshDataFail, tableName), ex);
													promise1.fail(ex);
												}
											});
										} catch (Exception ex) {
											LOG.error(String.format(refreshDataFail, tableName), ex);
											promise1.fail(ex);
										}
									}).onFailure(ex -> {
										LOG.error(String.format(refreshDataFail, tableName), ex);
										promise1.fail(ex);
									});
								} else {
									promise1.complete();
								}
							} catch (Exception ex) {
								LOG.error(String.format(refreshDataFail, tableName), ex);
								promise1.fail(ex);
							}
						}).onFailure(ex -> {
							LOG.error(String.format(refreshDataFail, tableName), ex);
							promise1.fail(ex);
						});
						return promise1.future();
					}).onSuccess(a -> {
						promise.complete();
					}).onFailure(ex -> {
						LOG.error(String.format(refreshDataFail, tableName), ex);
						promise.fail(ex);
					});
				} catch (Exception ex) {
					LOG.error(String.format(refreshDataFail, tableName), ex);
					promise.fail(ex);
				}
			});
		} else {
			LOG.info(String.format(refreshDataSkip, tableName));
			promise.complete();
		}
		return promise.future();
	}
}
