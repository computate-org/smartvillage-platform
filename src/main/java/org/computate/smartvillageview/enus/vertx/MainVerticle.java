package org.computate.smartvillageview.enus.vertx;

import java.net.URLDecoder;
import java.text.Normalizer;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

import org.apache.camel.CamelContext;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.tool.SearchTool;
import org.computate.smartvillageview.enus.config.ConfigKeys;
import org.computate.smartvillageview.enus.model.htm.SiteHtmEnUSGenApiService;
import org.computate.smartvillageview.enus.model.iotnode.IotNodeEnUSGenApiService;
import org.computate.smartvillageview.enus.model.page.SitePage;
import org.computate.smartvillageview.enus.model.page.SitePageEnUSGenApiService;
import org.computate.smartvillageview.enus.model.system.event.SystemEventEnUSGenApiService;
import org.computate.smartvillageview.enus.model.traffic.light.TrafficLightEnUSGenApiService;
import org.computate.smartvillageview.enus.model.traffic.light.step.TrafficLightStepEnUSGenApiService;
import org.computate.smartvillageview.enus.model.traffic.person.step.PersonStepEnUSGenApiService;
import org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulationEnUSGenApiService;
import org.computate.smartvillageview.enus.model.traffic.time.step.TimeStepEnUSGenApiService;
import org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepEnUSGenApiService;
import org.computate.smartvillageview.enus.model.user.SiteUserEnUSGenApiService;
import org.computate.smartvillageview.enus.page.HomePage;
import org.computate.smartvillageview.enus.page.dynamic.DynamicPage;
import org.computate.smartvillageview.enus.request.SiteRequestEnUS;
import org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepEnUSGenApiService;
import org.computate.smartvillageview.enus.result.map.MapResultEnUSGenApiService;
import org.computate.vertx.handlebars.AuthHelpers;
import org.computate.vertx.handlebars.DateHelpers;
import org.computate.vertx.handlebars.SiteHelpers;
import org.computate.vertx.openapi.OpenApi3Generator;
import org.computate.vertx.search.list.SearchList;
import org.computate.vertx.verticle.EmailVerticle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Jackson2Helper;
import com.github.jknack.handlebars.helper.ConditionalHelpers;
import com.github.jknack.handlebars.helper.StringHelpers;

import io.vertx.config.ConfigRetriever;
import io.vertx.config.ConfigRetrieverOptions;
import io.vertx.config.ConfigStoreOptions;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Future;
import io.vertx.core.MultiMap;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import io.vertx.core.WorkerExecutor;
import io.vertx.core.eventbus.EventBusOptions;
import io.vertx.core.http.Cookie;
import io.vertx.core.http.HttpClientOptions;
import io.vertx.core.http.HttpHeaders;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.core.impl.VertxImpl;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.net.JksOptions;
import io.vertx.core.net.PemKeyCertOptions;
import io.vertx.core.spi.cluster.ClusterManager;
import io.vertx.core.spi.cluster.NodeInfo;
import io.vertx.ext.auth.authorization.AuthorizationProvider;
import io.vertx.ext.auth.oauth2.OAuth2Auth;
import io.vertx.ext.auth.oauth2.OAuth2FlowType;
import io.vertx.ext.auth.oauth2.OAuth2Options;
import io.vertx.ext.auth.oauth2.authorization.KeycloakAuthorization;
import io.vertx.ext.auth.oauth2.providers.OpenIDConnectAuth;
import io.vertx.ext.bridge.PermittedOptions;
import io.vertx.ext.healthchecks.HealthCheckHandler;
import io.vertx.ext.healthchecks.Status;
import io.vertx.ext.mail.MailClient;
import io.vertx.ext.mail.MailConfig;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.Session;
import io.vertx.ext.web.api.service.ServiceRequest;
import io.vertx.ext.web.client.WebClient;
import io.vertx.ext.web.handler.OAuth2AuthHandler;
import io.vertx.ext.web.handler.SessionHandler;
import io.vertx.ext.web.handler.StaticHandler;
import io.vertx.ext.web.handler.TemplateHandler;
import io.vertx.ext.web.handler.sockjs.SockJSBridgeOptions;
import io.vertx.ext.web.handler.sockjs.SockJSHandler;
import io.vertx.ext.web.openapi.RouterBuilder;
import io.vertx.ext.web.sstore.LocalSessionStore;
import io.vertx.ext.web.templ.handlebars.HandlebarsTemplateEngine;
import io.vertx.pgclient.PgConnectOptions;
import io.vertx.pgclient.PgPool;
import io.vertx.spi.cluster.zookeeper.ZookeeperClusterManager;
import io.vertx.sqlclient.PoolOptions;



/**
 * Description: A Java class to start the Vert.x application as a main method. 
 * Keyword: classSimpleNameVerticle
 **/
public class MainVerticle extends MainVerticleGen<AbstractVerticle> {
	private static final Logger LOG = LoggerFactory.getLogger(MainVerticle.class);

	private Integer siteInstances;
	private Integer workerPoolSize;
	private Integer jdbcMaxPoolSize; 
	private Integer jdbcMaxWaitQueueSize;
	private CamelContext camelContext;

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

	private Router router;

	WorkerExecutor workerExecutor;

	OAuth2Auth oauth2AuthenticationProvider;

	AuthorizationProvider authorizationProvider;

	HandlebarsTemplateEngine templateEngine;

	Handlebars handlebars;

	TemplateHandler templateHandler;

	/**	
	 *	The main method for the Vert.x application that runs the Vert.x Runner class
	 **/
	public static void  main(String[] args) {
		Vertx vertx = Vertx.vertx();
		String configPath = System.getenv(ConfigKeys.CONFIG_PATH);
		configureConfig(vertx).onSuccess(config -> {
			try {
				Future<Void> originalFuture = Future.future(a -> a.complete());
				Future<Void> future = originalFuture;
				WebClient webClient = WebClient.create(vertx);
				Boolean runOpenApi3Generator = Optional.ofNullable(config.getBoolean(ConfigKeys.RUN_OPENAPI3_GENERATOR)).orElse(false);
				Boolean runSqlGenerator = Optional.ofNullable(config.getBoolean(ConfigKeys.RUN_SQL_GENERATOR)).orElse(false);
				Boolean runArticleGenerator = Optional.ofNullable(config.getBoolean(ConfigKeys.RUN_ARTICLE_GENERATOR)).orElse(false);

				if(runOpenApi3Generator || runSqlGenerator || runArticleGenerator) {
					SiteRequestEnUS siteRequest = new SiteRequestEnUS();
					siteRequest.setConfig(config);
					siteRequest.setWebClient(webClient);
					siteRequest.initDeepSiteRequestEnUS();
					OpenApi3Generator api = new OpenApi3Generator();
					api.setWebClient(webClient);
					api.setConfig(config);
					api.initDeepOpenApi3Generator(siteRequest);
					if(runOpenApi3Generator)
						future = future.compose(a -> api.writeOpenApi());
					if(runSqlGenerator)
						future = future.compose(a -> api.writeSql());
					if(runArticleGenerator)
						future = future.compose(a -> api.writeArticle());
					future.compose(a -> vertx.close());
				} else {
					future = future.compose(a -> run(config));
					future.compose(a -> vertx.close());
				}
			} catch(Exception ex) {
				LOG.error(String.format("Error loading config: %s", configPath), ex);
				vertx.close();
			}
		}).onFailure(ex -> {
			LOG.error(String.format("Error loading config: %s", configPath), ex);
			vertx.close();
		});
	}

	public static void  runOpenApi3Generator(String[] args, Vertx vertx, JsonObject config) {
		OpenApi3Generator api = new OpenApi3Generator();
		WebClient webClient = WebClient.create(vertx);
		SiteRequestEnUS siteRequest = new SiteRequestEnUS();
		siteRequest.setConfig(config);
		siteRequest.setWebClient(webClient);
		api.setWebClient(webClient);
		api.setConfig(config);
		siteRequest.initDeepSiteRequestEnUS();
		api.initDeepOpenApi3Generator(siteRequest);
		api.writeOpenApi().onSuccess(a -> {
			LOG.info("Write OpenAPI completed. ");
			vertx.close();
		}).onFailure(ex -> {
			LOG.error("Write OpenAPI failed. ", ex);
			vertx.close();
		});
	}

	public static Future<Void> run(JsonObject config) {
		Promise<Void> promise = Promise.promise();
		Boolean enableZookeeperCluster = Optional.ofNullable(config.getBoolean(ConfigKeys.ENABLE_ZOOKEEPER_CLUSTER)).orElse(false);
		VertxOptions vertxOptions = new VertxOptions();
		EventBusOptions eventBusOptions = new EventBusOptions();

		if(enableZookeeperCluster) {
			JsonObject zkConfig = new JsonObject();
			String hostname = config.getString(ConfigKeys.HOSTNAME);
			String openshiftService = config.getString(ConfigKeys.OPENSHIFT_SERVICE);
			String zookeeperHostName = config.getString(ConfigKeys.ZOOKEEPER_HOST_NAME);
			Integer zookeeperPort = config.getInteger(ConfigKeys.ZOOKEEPER_PORT);
			String zookeeperHosts = Optional.ofNullable(config.getString(ConfigKeys.ZOOKEEPER_HOSTS)).orElse(zookeeperHostName + ":" + zookeeperPort);
			String clusterHostName = config.getString(ConfigKeys.CLUSTER_HOST_NAME);
			Integer clusterPort = config.getInteger(ConfigKeys.CLUSTER_PORT);
			String clusterPublicHostName = config.getString(ConfigKeys.CLUSTER_PUBLIC_HOST_NAME);
			Integer clusterPublicPort = config.getInteger(ConfigKeys.CLUSTER_PUBLIC_PORT);
			Integer zookeeperBaseSleepTimeMillis = config.getInteger(ConfigKeys.ZOOKEEPER_BASE_SLEEP_TIME_MILLIS);
			Integer zookeeperMaxSleepMillis = config.getInteger(ConfigKeys.ZOOKEEPER_MAX_SLEEP_MILLIS);
			Integer zookeeperMaxRetries = config.getInteger(ConfigKeys.ZOOKEEPER_MAX_RETRIES);
			Integer zookeeperConnectionTimeoutMillis = config.getInteger(ConfigKeys.ZOOKEEPER_CONNECTION_TIMEOUT_MILLIS);
			Integer zookeeperSessionTimeoutMillis = config.getInteger(ConfigKeys.ZOOKEEPER_SESSION_TIMEOUT_MILLIS);
			zkConfig.put("zookeeperHosts", zookeeperHosts);
			zkConfig.put("sessionTimeout", zookeeperSessionTimeoutMillis);
			zkConfig.put("connectTimeout", zookeeperConnectionTimeoutMillis);
			zkConfig.put("rootPath", "smart-village-view");
			zkConfig.put("retry", new JsonObject()
					.put("initialSleepTime", zookeeperBaseSleepTimeMillis)
					.put("intervalTimes", zookeeperMaxSleepMillis)
					.put("maxTimes", zookeeperMaxRetries)
			);
			ClusterManager clusterManager = new ZookeeperClusterManager(zkConfig);

			if(clusterHostName == null) {
				clusterHostName = hostname;
			}
			if(clusterPublicHostName == null) {
				if(hostname != null && openshiftService != null) {
					clusterPublicHostName = hostname + "." + openshiftService;
				}
			}
			if(clusterHostName != null) {
				LOG.info(String.format("%s: %s", ConfigKeys.CLUSTER_HOST_NAME, clusterHostName));
				eventBusOptions.setHost(clusterHostName);
			}
			if(clusterPort != null) {
				LOG.info(String.format("%s: %s", ConfigKeys.CLUSTER_PORT, clusterPort));
				eventBusOptions.setPort(clusterPort);
			}
			if(clusterPublicHostName != null) {
				LOG.info(String.format("%s: %s", ConfigKeys.CLUSTER_PUBLIC_HOST_NAME, clusterPublicHostName));
				eventBusOptions.setClusterPublicHost(clusterPublicHostName);
			}
			if(clusterPublicPort != null) {
				LOG.info(String.format("%s: %s", ConfigKeys.CLUSTER_PUBLIC_PORT, clusterPublicPort));
				eventBusOptions.setClusterPublicPort(clusterPublicPort);
			}
			vertxOptions.setClusterManager(clusterManager);
		}
		Long vertxWarningExceptionSeconds = config.getLong(ConfigKeys.VERTX_WARNING_EXCEPTION_SECONDS);
		Long vertxMaxEventLoopExecuteTime = config.getLong(ConfigKeys.VERTX_MAX_EVENT_LOOP_EXECUTE_TIME);
		Integer siteInstances = config.getInteger(ConfigKeys.SITE_INSTANCES);
		vertxOptions.setEventBusOptions(eventBusOptions);
		vertxOptions.setWarningExceptionTime(vertxWarningExceptionSeconds);
		vertxOptions.setWarningExceptionTimeUnit(TimeUnit.SECONDS);
		vertxOptions.setMaxEventLoopExecuteTime(vertxMaxEventLoopExecuteTime);
		vertxOptions.setMaxEventLoopExecuteTimeUnit(TimeUnit.SECONDS);
		vertxOptions.setWorkerPoolSize(config.getInteger(ConfigKeys.WORKER_POOL_SIZE));
		Consumer<Vertx> runner = vertx -> {
			try {
				DeploymentOptions deploymentOptions = new DeploymentOptions();
				deploymentOptions.setInstances(siteInstances);
				deploymentOptions.setConfig(config);
	
				DeploymentOptions emailVerticleDeploymentOptions = new DeploymentOptions();
				emailVerticleDeploymentOptions.setConfig(config);
				emailVerticleDeploymentOptions.setWorker(true);
	
				DeploymentOptions WorkerVerticleDeploymentOptions = new DeploymentOptions();
				WorkerVerticleDeploymentOptions.setConfig(config);
				WorkerVerticleDeploymentOptions.setInstances(1);
	
				vertx.deployVerticle(MainVerticle.class, deploymentOptions).onSuccess(a -> {
					LOG.info("Started main verticle. ");
					vertx.deployVerticle(WorkerVerticle.class, WorkerVerticleDeploymentOptions).onSuccess(b -> {
						LOG.info("Started worker verticle. ");
						vertx.deployVerticle(EmailVerticle.class, emailVerticleDeploymentOptions).onSuccess(c -> {
							LOG.info("Started email verticle. ");
						}).onFailure(ex -> {
							LOG.error("Failed to start worker verticle. ", ex);
						});
					}).onFailure(ex -> {
						LOG.error("Failed to start worker verticle. ", ex);
					});
				}).onFailure(ex -> {
					LOG.error("Failed to start main verticle. ", ex);
				});
			} catch (Throwable ex) {
				LOG.error("Creating clustered Vertx failed. ", ex);
				ExceptionUtils.rethrow(ex);
			}
		};

		if(enableZookeeperCluster) {
			Vertx.clusteredVertx(vertxOptions).onSuccess(vertx -> {
				runner.accept(vertx);
				promise.complete();
			}).onFailure(ex -> {
				LOG.error("Creating clustered Vertx failed. ", ex);
				promise.fail(ex);
			});
		} else {
			Vertx vertx = Vertx.vertx(vertxOptions);
			runner.accept(vertx);
			promise.complete();
		}
		return promise.future();
	}

	/**
	 * This is called by Vert.x when the verticle instance is deployed. 
	 * Initialize a new site context object for storing information about the entire site in English. 
	 * Setup the startPromise to handle the configuration steps and starting the server. 
	 **/
	@Override()
	public void  start(Promise<Void> startPromise) throws Exception, Exception {
		try {
			configureWebClient().onComplete(a ->
				configureData().onComplete(b -> 
					configureOpenApi().onComplete(d -> 
						configureHealthChecks().onComplete(e -> 
							configureSharedWorkerExecutor().onComplete(f -> 
								configureWebsockets().onComplete(g -> 
									configureEmail().onComplete(i -> 
										configureHandlebars().onComplete(j -> 
											configureApi().onComplete(k -> 
												configureUi().onComplete(l -> 
													configureCamel().onComplete(m -> 
														startServer().onComplete(n -> startPromise.complete())
													).onFailure(ex -> startPromise.fail(ex))
												).onFailure(ex -> startPromise.fail(ex))
											).onFailure(ex -> startPromise.fail(ex))
										).onFailure(ex -> startPromise.fail(ex))
									).onFailure(ex -> startPromise.fail(ex))
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
	 * Val.InitError.enUS:Could not initialize the database. 
	 * Val.InitSuccess.enUS:The database was initialized successfully. 
	 * 
	 *	Configure shared database connections across the cluster for massive scaling of the application. 
	 *	Return a promise that configures a shared database client connection. 
	 *	Load the database configuration into a shared io.vertx.ext.jdbc.JDBCClient for a scalable, clustered datasource connection pool. 
	 **/
	private Future<Void> configureData() {
		Promise<Void> promise = Promise.promise();
		try {
			PgConnectOptions pgOptions = new PgConnectOptions();
			pgOptions.setPort(config().getInteger(ConfigKeys.JDBC_PORT));
			pgOptions.setHost(config().getString(ConfigKeys.JDBC_HOST));
			pgOptions.setDatabase(config().getString(ConfigKeys.JDBC_DATABASE));
			pgOptions.setUser(config().getString(ConfigKeys.JDBC_USERNAME));
			pgOptions.setPassword(config().getString(ConfigKeys.JDBC_PASSWORD));
			pgOptions.setIdleTimeout(config().getInteger(ConfigKeys.JDBC_MAX_IDLE_TIME, 10));
			pgOptions.setIdleTimeoutUnit(TimeUnit.SECONDS);
			pgOptions.setConnectTimeout(config().getInteger(ConfigKeys.JDBC_CONNECT_TIMEOUT, 5));

			PoolOptions poolOptions = new PoolOptions();
			jdbcMaxPoolSize = config().getInteger(ConfigKeys.JDBC_MAX_POOL_SIZE, 1);
			jdbcMaxWaitQueueSize = config().getInteger(ConfigKeys.JDBC_MAX_WAIT_QUEUE_SIZE, 10);
			poolOptions.setMaxSize(jdbcMaxPoolSize);
			poolOptions.setMaxWaitQueueSize(jdbcMaxWaitQueueSize);

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
	 * 
	 * Val.Error.enUS:Could not configure the auth server and API. 
	 * Val.Success.enUS:The auth server and API was configured successfully. 
	 * 
	 *	Configure the connection to the auth server and setup the routes based on the OpenAPI definition. 
	 *	Setup a callback route when returning from the auth server after successful authentication. 
	 *	Setup a logout route for logging out completely of the application. 
	 *	Return a promise that configures the authentication server and OpenAPI. 
	 **/
	private Future<Void> configureOpenApi() {
		Promise<Void> promise = Promise.promise();
		try {
			String siteBaseUrl = config().getString(ConfigKeys.SITE_BASE_URL);

			OAuth2Options oauth2ClientOptions = new OAuth2Options();
			Boolean authSsl = config().getBoolean(ConfigKeys.AUTH_SSL);
			String authHostName = config().getString(ConfigKeys.AUTH_HOST_NAME);
			Integer authPort = config().getInteger(ConfigKeys.AUTH_PORT);
			String authUrl = String.format("%s://%s%s/auth", (authSsl ? "https" : "http"), authHostName, (authPort == 443 || authPort == 80 ? "" : ":" + authPort));
			oauth2ClientOptions.setSite(authUrl + "/realms/" + config().getString(ConfigKeys.AUTH_REALM));
			oauth2ClientOptions.setTenant(config().getString(ConfigKeys.AUTH_REALM));
			oauth2ClientOptions.setClientId(config().getString(ConfigKeys.AUTH_RESOURCE));
			oauth2ClientOptions.setClientSecret(config().getString(ConfigKeys.AUTH_SECRET));
			oauth2ClientOptions.setFlow(OAuth2FlowType.AUTH_CODE);
			oauth2ClientOptions.setAuthorizationPath("/oauth/authorize");
			JsonObject extraParams = new JsonObject();
			extraParams.put("scope", "profile");
			oauth2ClientOptions.setExtraParameters(extraParams);
			oauth2ClientOptions.setHttpClientOptions(new HttpClientOptions().setConnectTimeout(120000));

			OpenIDConnectAuth.discover(vertx, oauth2ClientOptions, a -> {
				if(a.succeeded()) {
					oauth2AuthenticationProvider = a.result();

					authorizationProvider = KeycloakAuthorization.create();

					OAuth2AuthHandler oauth2AuthHandler = OAuth2AuthHandler.create(vertx, oauth2AuthenticationProvider, siteBaseUrl + "/callback");
					{
						Router tempRouter = Router.router(vertx);
						oauth2AuthHandler.setupCallback(tempRouter.get("/callback"));
					}
			
					//ClusteredSessionStore sessionStore = ClusteredSessionStore.create(vertx);
					LocalSessionStore sessionStore = LocalSessionStore.create(vertx, "ActiveLearningStudio-API-sessions");
					SessionHandler sessionHandler = SessionHandler.create(sessionStore);
					if(StringUtils.startsWith(siteBaseUrl, "https://"))
						sessionHandler.setCookieSecureFlag(true);
			
					RouterBuilder.create(vertx, "webroot/openapi3-enUS.yml", b -> {
						if (b.succeeded()) {
							RouterBuilder routerBuilder = b.result();
							routerBuilder.mountServicesFromExtensions();
			
							routerBuilder.serviceExtraPayloadMapper(routingContext -> new JsonObject()
									.put("uri", routingContext.request().uri())
									.put("method", routingContext.request().method().name())
									);
							routerBuilder.rootHandler(sessionHandler);
							routerBuilder.securityHandler("openIdConnect", oauth2AuthHandler);
							routerBuilder.operation("callback").handler(ctx -> {
			
								// Handle the callback of the flow
								final String code = ctx.request().getParam("code");
			
								// code is a require value
								if (code == null) {
									ctx.fail(400);
									return;
								}
			
								final String state = ctx.request().getParam("state");
			
								final JsonObject config = new JsonObject().put("code", code);
			
								config.put("redirectUri", siteBaseUrl + "/callback");
			
								oauth2AuthenticationProvider.authenticate(config, res -> {
									if (res.failed()) {
										LOG.error("Failed to authenticate user. ", res.cause());
										ctx.fail(res.cause());
									} else {
										ctx.setUser(res.result());
										Session session = ctx.session();
										if (session != null) {
											// the user has upgraded from unauthenticated to authenticated
											// session should be upgraded as recommended by owasp
											Cookie cookie = Cookie.cookie("sessionIdBefore", session.id());
											if(StringUtils.startsWith(siteBaseUrl, "https://"))
												cookie.setSecure(true);
											ctx.addCookie(cookie);
											session.regenerateId();
											String redirectUri = session.get("redirect_uri");
											// we should redirect the UA so this link becomes invalid
											ctx.response()
													// disable all caching
													.putHeader(HttpHeaders.CACHE_CONTROL, "no-cache, no-store, must-revalidate")
													.putHeader("Pragma", "no-cache")
													.putHeader(HttpHeaders.EXPIRES, "0")
													// redirect (when there is no state, redirect to home
													.putHeader(HttpHeaders.LOCATION, redirectUri != null ? redirectUri : "/")
													.setStatusCode(302)
													.end("Redirecting to " + (redirectUri != null ? redirectUri : "/") + ".");
										} else {
											// there is no session object so we cannot keep state
											ctx.reroute(state != null ? state : "/");
										}
									}
								});
							});
							routerBuilder.operation("callback").failureHandler(ex -> {
								LOG.error("Failed callback. ", ex);
							});
			
							routerBuilder.operation("logout").handler(rc -> {
								String redirectUri = rc.request().params().get("redirect_uri");
								if(redirectUri == null)
									redirectUri = "/";
								rc.clearUser();
								rc.response()
										.putHeader(HttpHeaders.LOCATION, redirectUri)
										.setStatusCode(302)
										.end("Redirecting to " + redirectUri + ".");
							});
							routerBuilder.operation("logout").handler(c -> {});
			
							router = routerBuilder.createRouter();
			
							LOG.info(configureOpenApiSuccess);
							promise.complete();
						} else {
							Exception ex = new RuntimeException("OpenID Connect Discovery failed", b.cause());
							LOG.error(configureOpenApiError, ex);
							promise.fail(ex);
						}
					});
				} else {
					Exception ex = new RuntimeException("OpenID Connect Discovery failed", a.cause());
					LOG.error(configureOpenApiError, ex);
					promise.fail(ex);
				}
			});
		} catch (Exception ex) {
			LOG.error(configureOpenApiError, ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	/**	
	 * Val.Complete.enUS:The config was configured successfully. 
	 * Val.Fail.enUS:Could not configure the config(). 
	 **/
	public static Future<JsonObject> configureConfig(Vertx vertx) {
		Promise<JsonObject> promise = Promise.promise();

		try {
			ConfigRetrieverOptions retrieverOptions = new ConfigRetrieverOptions();

			retrieverOptions.addStore(new ConfigStoreOptions().setType("file").setFormat("yaml").setConfig(new JsonObject().put("path", "application.yml")));

			String configPath = System.getenv(ConfigKeys.CONFIG_PATH);
			if(StringUtils.isNotBlank(configPath)) {
				ConfigStoreOptions configIni = new ConfigStoreOptions().setType("file").setFormat("yaml").setConfig(new JsonObject().put("path", configPath));
				retrieverOptions.addStore(configIni);
			}

			ConfigStoreOptions storeEnv = new ConfigStoreOptions().setType("env");
			retrieverOptions.addStore(storeEnv);

			ConfigRetriever configRetriever = ConfigRetriever.create(vertx, retrieverOptions);
			configRetriever.getConfig().onSuccess(config -> {
				LOG.info("The config was configured successfully. ");
				promise.complete(config);
			}).onFailure(ex -> {
				LOG.error("Unable to configure site context. ", ex);
				promise.fail(ex);
			});
		} catch(Exception ex) {
			LOG.error("Unable to configure site context. ", ex);
			promise.fail(ex);
		}

		return promise.future();
	}

	/**
	 * 
	 * Val.Fail.enUS:Could not configure the shared worker executor. 
	 * Val.Complete.enUS:The shared worker executor "{}" was configured successfully. 
	 * 
	 *	Configure a shared worker executor for running blocking tasks in the background. 
	 *	Return a promise that configures the shared worker executor. 
	 **/
	private Future<Void> configureSharedWorkerExecutor() {
		Promise<Void> promise = Promise.promise();
		try {
			String name = "MainVerticle-WorkerExecutor";
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
	 * Val.Complete.enUS:The health checks were configured successfully. 
	 * Val.Fail.enUS:Could not configure the health checks. 
	 * Val.ErrorDatabase.enUS:The database is not configured properly. 
	 * Val.EmptySolr.enUS:The Solr search engine is empty. 
	 * Val.ErrorSolr.enUS:The Solr search engine is not configured properly. 
	 * Val.ErrorVertx.enUS:The Vert.x application is not configured properly. 
	 *	Configure health checks for the status of the website and it's dependent services. 
	 *	Return a promise that configures the health checks. 
	 **/
	private Future<Void> configureHealthChecks() {
		Promise<Void> promise = Promise.promise();
		try {
			ClusterManager clusterManager = ((VertxImpl)vertx).getClusterManager();
			HealthCheckHandler healthCheckHandler = HealthCheckHandler.create(vertx);
			siteInstances = Optional.ofNullable(System.getenv(ConfigKeys.SITE_INSTANCES)).map(s -> Integer.parseInt(s)).orElse(1);
			workerPoolSize = System.getenv(ConfigKeys.WORKER_POOL_SIZE) == null ? null : Integer.parseInt(System.getenv(ConfigKeys.WORKER_POOL_SIZE));

			healthCheckHandler.register("vertx", 2000, a -> {
				a.complete(Status.OK(new JsonObject().put(ConfigKeys.SITE_INSTANCES, siteInstances).put("workerPoolSize", workerPoolSize)));
			});
			if(clusterManager != null) {
				healthCheckHandler.register("cluster", 2000, a -> {
					NodeInfo nodeInfo = clusterManager.getNodeInfo();
					JsonArray nodeArray = new JsonArray();
					clusterManager.getNodes().forEach(node -> nodeArray.add(node));
					a.complete(Status.OK(new JsonObject()
							.put("nodeId", clusterManager.getNodeId())
							.put("nodes", nodeArray)
							));
				});
			}
			router.get("/health").handler(healthCheckHandler);
			LOG.info(configureHealthChecksComplete);
			promise.complete();
		} catch (Exception ex) {
			LOG.error(configureHealthChecksFail, ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	/**	
	 * Configure websockets for realtime messages. 
	 * Val.Complete.enUS:Configure websockets succeeded. 
	 * Val.Fail.enUS:Configure websockets failed. 
	 **/
	private Future<Void> configureWebsockets() {
		Promise<Void> promise = Promise.promise();
		try {
			SockJSBridgeOptions options = new SockJSBridgeOptions()
					.addOutboundPermitted(new PermittedOptions().setAddressRegex("websocket.*"))
					;
			router.mountSubRouter("/eventbus", SockJSHandler.create(vertx).bridge(options));
			LOG.info(configureWebsocketsComplete);
			promise.complete();
		} catch (Exception ex) {
			LOG.error(configureWebsocketsFail, ex);
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

			String templatePath = config().getString(ConfigKeys.TEMPLATE_PATH);
			if(StringUtils.isBlank(templatePath))
				templateHandler = TemplateHandler.create(templateEngine);
			else
				templateHandler = TemplateHandler.create(templateEngine, templatePath, "text/html");

			LOG.info(configureHandlebarsComplete);
			promise.complete();
		} catch(Exception ex) {
			LOG.error(configureHandlebarsFail, ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	/**
	 * Val.Fail.enUS:The API was not configured properly. 
	 * Val.Complete.enUS:The API was configured properly. 
	 */
	private Future<Void> configureApi() {
		Promise<Void> promise = Promise.promise();
		try {
			SiteUserEnUSGenApiService.registerService(vertx.eventBus(), config(), workerExecutor, pgPool, webClient, oauth2AuthenticationProvider, authorizationProvider, templateEngine, vertx);
			SitePageEnUSGenApiService.registerService(vertx.eventBus(), config(), workerExecutor, pgPool, webClient, oauth2AuthenticationProvider, authorizationProvider, templateEngine, vertx);
			SiteHtmEnUSGenApiService.registerService(vertx.eventBus(), config(), workerExecutor, pgPool, webClient, oauth2AuthenticationProvider, authorizationProvider, templateEngine, vertx);
			SystemEventEnUSGenApiService.registerService(vertx.eventBus(), config(), workerExecutor, pgPool, webClient, oauth2AuthenticationProvider, authorizationProvider, templateEngine, vertx);
			IotNodeEnUSGenApiService.registerService(vertx.eventBus(), config(), workerExecutor, pgPool, webClient, oauth2AuthenticationProvider, authorizationProvider, templateEngine, vertx);
			IotNodeStepEnUSGenApiService.registerService(vertx.eventBus(), config(), workerExecutor, pgPool, webClient, oauth2AuthenticationProvider, authorizationProvider, templateEngine, vertx);
			MapResultEnUSGenApiService.registerService(vertx.eventBus(), config(), workerExecutor, pgPool, webClient, oauth2AuthenticationProvider, authorizationProvider, templateEngine, vertx);
			TimeStepEnUSGenApiService.registerService(vertx.eventBus(), config(), workerExecutor, pgPool, webClient, oauth2AuthenticationProvider, authorizationProvider, templateEngine, vertx);
			VehicleStepEnUSGenApiService.registerService(vertx.eventBus(), config(), workerExecutor, pgPool, webClient, oauth2AuthenticationProvider, authorizationProvider, templateEngine, vertx);
			PersonStepEnUSGenApiService.registerService(vertx.eventBus(), config(), workerExecutor, pgPool, webClient, oauth2AuthenticationProvider, authorizationProvider, templateEngine, vertx);
			TrafficSimulationEnUSGenApiService.registerService(vertx.eventBus(), config(), workerExecutor, pgPool, webClient, oauth2AuthenticationProvider, authorizationProvider, templateEngine, vertx);
			TrafficLightEnUSGenApiService.registerService(vertx.eventBus(), config(), workerExecutor, pgPool, webClient, oauth2AuthenticationProvider, authorizationProvider, templateEngine, vertx);
			TrafficLightStepEnUSGenApiService.registerService(vertx.eventBus(), config(), workerExecutor, pgPool, webClient, oauth2AuthenticationProvider, authorizationProvider, templateEngine, vertx);

			LOG.info(configureApiComplete);
			promise.complete();
		} catch(Exception ex) {
			LOG.error(configureApiFail, ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	/**
	 * Val.Fail.enUS:The UI was not configured properly. 
	 * Val.Complete.enUS:The UI was configured properly. 
	 */
	private Future<Void> configureUi() {
		Promise<Void> promise = Promise.promise();
		try {
			String staticPath = config().getString(ConfigKeys.STATIC_PATH);

			router.get("/").handler(a -> {
				a.reroute("/template/enUS/HomePage");
			});
 
			router.get("/api").handler(ctx -> {
				ctx.reroute("/template/enUS/openapi");
			});

			router.get("/template/enUS/HomePage").handler(ctx -> {
				try {
					ctx.put(ConfigKeys.STATIC_BASE_URL, config().getString(ConfigKeys.STATIC_BASE_URL));
					HomePage t = new HomePage();
					JsonObject query = new JsonObject();
					MultiMap queryParams = ctx.queryParams();
					for(String name : queryParams.names()) {
						JsonArray array = query.getJsonArray(name);
						List<String> vals = queryParams.getAll(name);
						if(array == null) {
							array = new JsonArray();
							query.put(name, array);
						}
						for(String val : vals) {
							array.add(val);
						}
					}
					ServiceRequest serviceRequest = new ServiceRequest(
							new JsonObject().put("path", JsonObject.mapFrom(ctx.pathParams())).put("query", query).put("cookie", JsonObject.mapFrom(ctx.cookieMap()))
							, ctx.request().headers()
							, Optional.ofNullable(ctx.user()).map(u -> u.principal()).orElse(null)
							, new JsonObject()
							);
					SiteRequestEnUS siteRequest = new SiteRequestEnUS();
					siteRequest.setConfig(config());
					siteRequest.setServiceRequest(serviceRequest);
					siteRequest.setRequestHeaders(ctx.request().headers());
					siteRequest.setWebClient(webClient);
					siteRequest.initDeepSiteRequestEnUS();
					t.promiseDeepForClass(siteRequest).onSuccess(a -> {
						try {
							JsonObject json = JsonObject.mapFrom(t);
							json.forEach(entry -> {
								ctx.put(entry.getKey(), entry.getValue());
							});
							ctx.next();
						} catch(Exception ex) {
							LOG.error("Failed to load home page. ", ex);
							ctx.fail(ex);
						}
					}).onFailure(ex -> {
						LOG.error("Failed to load home page. ", ex);
						ctx.fail(ex);
					});
				} catch(Exception ex) {
					LOG.error("Failed to load home page. ", ex);
					ctx.fail(ex);
				}
			});

			router.getWithRegex("(?<uri>\\/(?<lang>(?<lang1>[a-z][a-z])-(?<lang2>[a-z][a-z]))\\/.*)").handler(ctx -> {
				String uri = ctx.pathParam("uri");
				String lang = String.format("%s%s", ctx.pathParam("lang1"), ctx.pathParam("lang2").toUpperCase());
				JsonObject query = new JsonObject();
				MultiMap queryParams = ctx.queryParams();
				for(String name : queryParams.names()) {
					JsonArray array = query.getJsonArray(name);
					List<String> vals = queryParams.getAll(name);
					if(array == null) {
						array = new JsonArray();
						query.put(name, array);
					}
					for(String val : vals) {
						array.add(val);
					}
				}
				ServiceRequest serviceRequest = new ServiceRequest(
						new JsonObject().put("path", JsonObject.mapFrom(ctx.pathParams())).put("query", query).put("cookie", JsonObject.mapFrom(ctx.cookieMap()))
						, ctx.request().headers()
						, Optional.ofNullable(ctx.user()).map(u -> u.principal()).orElse(null)
						, new JsonObject()
						);

				SiteRequestEnUS siteRequest = new SiteRequestEnUS();
				siteRequest.setConfig(config());
				siteRequest.setWebClient(webClient);
				siteRequest.setServiceRequest(serviceRequest);
				siteRequest.setRequestHeaders(ctx.request().headers());
				siteRequest.initDeepSiteRequestEnUS();
				SearchList<SitePage> l = new SearchList<>();
				l.q("*:*");
				l.setC(SitePage.class);
				l.fq(String.format("%s_docvalues_string:%s", SitePage.VAR_uri, SearchTool.escapeQueryChars(uri)));
				l.setStore(true);
				ctx.response().headers().add("Content-Type", "text/html");
				l.promiseDeepForClass(siteRequest).onSuccess(a -> {
					SitePage result = l.first();
					try {
						DynamicPage page = new DynamicPage();
						page.setPage(JsonObject.mapFrom(result));
						page.setUri(uri);
						page.promiseDeepForClass(siteRequest).onSuccess(b -> {
							JsonObject json = JsonObject.mapFrom(page);
							json.put(ConfigKeys.STATIC_BASE_URL, config().getString(ConfigKeys.STATIC_BASE_URL));
							json.put(ConfigKeys.SITE_BASE_URL, config().getString(ConfigKeys.SITE_BASE_URL));
							json.put(ConfigKeys.GITHUB_ORG, config().getString(ConfigKeys.GITHUB_ORG));
							json.put(ConfigKeys.SITE_NAME, config().getString(ConfigKeys.SITE_NAME));
							json.put(ConfigKeys.SITE_DISPLAY_NAME, config().getString(ConfigKeys.SITE_DISPLAY_NAME));
							json.put(ConfigKeys.SITE_POWERED_BY_URL, config().getString(ConfigKeys.SITE_POWERED_BY_URL));
							json.put(ConfigKeys.SITE_POWERED_BY_NAME, config().getString(ConfigKeys.SITE_POWERED_BY_NAME));
							json.put(ConfigKeys.SITE_POWERED_BY_IMAGE_URI, config().getString(ConfigKeys.SITE_POWERED_BY_IMAGE_URI));
							templateEngine.render(json, Optional.ofNullable(config().getString(ConfigKeys.TEMPLATE_PATH)).orElse("templates") + "/" + lang + "/DynamicPage").onSuccess(buffer -> {
								try {
									ctx.response().end(buffer);
								} catch(Exception ex) {
									LOG.error(String.format("Failed to render page %s", uri), ex);
									ctx.fail(ex);
								}
							}).onFailure(ex -> {
								LOG.error(String.format("Failed to render page %s", uri), ex);
								ctx.fail(ex);
							});
						}).onFailure(ex -> {
							LOG.error(String.format("Failed to render page %s", uri), ex);
							ctx.fail(ex);
						});
					} catch (Exception ex) {
						LOG.error(String.format("Failed to render page %s", uri), ex);
						ctx.fail(ex);
					}
					
				}).onFailure(ex -> {
					LOG.error(String.format("Failed to render page %s", uri), ex);
					ctx.fail(ex);
				});
			});

			router.get("/template/*").handler(ctx -> {
				try {
					ctx.put(ConfigKeys.STATIC_BASE_URL, config().getString(ConfigKeys.STATIC_BASE_URL));
					ctx.put(ConfigKeys.GITHUB_ORG, config().getString(ConfigKeys.GITHUB_ORG));
					ctx.put(ConfigKeys.SITE_NAME, config().getString(ConfigKeys.SITE_NAME));
					ctx.put(ConfigKeys.SITE_DISPLAY_NAME, config().getString(ConfigKeys.SITE_DISPLAY_NAME));
					ctx.put(ConfigKeys.SITE_POWERED_BY_URL, config().getString(ConfigKeys.SITE_POWERED_BY_URL));
					ctx.put(ConfigKeys.SITE_POWERED_BY_NAME, config().getString(ConfigKeys.SITE_POWERED_BY_NAME));
					ctx.put(ConfigKeys.SITE_POWERED_BY_IMAGE_URI, config().getString(ConfigKeys.SITE_POWERED_BY_IMAGE_URI));
					ctx.next();
				} catch(Exception ex) {
					LOG.error("Failed to load page. ", ex);
					ctx.fail(ex);
				}
			});
			router.get("/template/*").handler(templateHandler);

			StaticHandler staticHandler = StaticHandler.create().setCachingEnabled(false).setFilesReadOnly(false);
			if(staticPath != null) {
				staticHandler.setAllowRootFileSystemAccess(true);
				staticHandler.setWebRoot(staticPath);
			}
			router.route("/static/*").handler(staticHandler);

			LOG.info(configureUiComplete);
			promise.complete();
		} catch(Exception ex) {
			LOG.error(configureUiFail);
			promise.fail(ex);
		}
		return promise.future();
	}

	public Future<Void> putVarsInRoutingContext(RoutingContext ctx) {
		Promise<Void> promise = Promise.promise();
		try {
			for(Entry<String, String> entry : ctx.queryParams()) {
				String paramName = entry.getKey();
				String paramObject = entry.getValue();
				String entityVar = null;
				String valueIndexed = null;

				switch(paramName) {
					case "var":
						entityVar = StringUtils.trim(StringUtils.substringBefore((String)paramObject, ":"));
						valueIndexed = URLDecoder.decode(StringUtils.trim(StringUtils.substringAfter((String)paramObject, ":")), "UTF-8");
						ctx.put(entityVar, valueIndexed);
						break;
				}
				promise.complete();
			}
		} catch(Exception ex) {
			LOG.error(String.format("putVarsInRoutingContext failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	/**
	 * Val.Fail.enUS:The Camel Component was not configured properly. 
	 * Val.Complete.enUS:The Camel Component was configured properly. 
	 */
	private Future<Void> configureCamel() {
		Promise<Void> promise = Promise.promise();
		promise.complete();

		return promise.future();
	}

	/**	
	 * 
	 * Val.ErrorServer.enUS:The server is not configured properly. 
	 * Val.SuccessServer.enUS:The HTTP server is running: %s
	 * Val.BeforeServer.enUS:HTTP server starting: %s
	 * Val.Ssl.enUS:Configuring SSL: %s
	 * 
	 *	Start the Vert.x server. 
	 **/
	private Future<Void> startServer() {
		Promise<Void> promise = Promise.promise();

		try {
			Boolean sslPassthrough = config().getBoolean(ConfigKeys.SSL_PASSTHROUGH, false);
			String siteBaseUrl = config().getString(ConfigKeys.SITE_BASE_URL);
			Integer sitePort = config().getInteger(ConfigKeys.SITE_PORT);
			String sslJksPath = config().getString(ConfigKeys.SSL_JKS_PATH);
			String sslPrivateKeyPath = config().getString(ConfigKeys.SSL_KEY_PATH);
			String sslCertPath = config().getString(ConfigKeys.SSL_CERT_PATH);
			HttpServerOptions options = new HttpServerOptions();
			if(sslPassthrough) {
				if(sslPrivateKeyPath != null && sslCertPath != null) {
					options.setPemKeyCertOptions(new PemKeyCertOptions().setKeyPath(sslPrivateKeyPath).setCertPath(sslCertPath));
					LOG.info(String.format(startServerSsl, sslPrivateKeyPath));
					LOG.info(String.format(startServerSsl, sslCertPath));
				} else if(sslJksPath != null) {
					options.setKeyStoreOptions(new JksOptions().setPath(sslJksPath).setPassword(config().getString(ConfigKeys.SSL_JKS_PASSWORD)));
					LOG.info(String.format(startServerSsl, sslJksPath));
				}
				options.setSsl(true);
			}
			options.setPort(sitePort);
	
			LOG.info(String.format(startServerBeforeServer, siteBaseUrl));
			vertx.createHttpServer(options).requestHandler(router).listen(ar -> {
				if (ar.succeeded()) {
					LOG.info(String.format(startServerSuccessServer, siteBaseUrl));
					promise.complete();
				} else {
					LOG.error(startServerErrorServer, ar.cause());
					promise.fail(ar.cause());
				}
			});
		} catch (Exception ex) {
			LOG.error(startServerErrorServer, ex);
			promise.fail(ex);
		}

		return promise.future();
	}

	/**	
	 *	This is called by Vert.x when the verticle instance is undeployed. 
	 *	Setup the stopPromise to handle tearing down the server. 
	 * Val.Fail.enUS:Could not close the database client connection. 
	 * Val.Complete.enUS:The database client connection was closed. 
	 **/
	@Override()
	public void  stop(Promise<Void> promise) throws Exception, Exception {
		if(pgPool != null) {
			pgPool.close().onSuccess(a -> {
				LOG.info(stopComplete);
				promise.complete();
			}).onFailure(ex -> {
				LOG.error(stopFail, ex);
				promise.fail(ex);
			});
		}
	}

	public String toId(String s) {
		if(s != null) {
			s = Normalizer.normalize(s, Normalizer.Form.NFD);
			s = StringUtils.lowerCase(s);
			s = StringUtils.trim(s);
			s = StringUtils.replacePattern(s, "\\s{1,}", "-");
			s = StringUtils.replacePattern(s, "[^\\w-]", "");
			s = StringUtils.replacePattern(s, "-{2,}", "-");
		}

		return s;
	}
}
