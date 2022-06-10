package org.computate.smartvillageview.enus.model.traffic.simulation.reader;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.computate.search.wrap.Wrap;
import org.computate.smartvillageview.enus.config.ConfigKeys;
import org.computate.smartvillageview.enus.model.page.SitePage;
import org.computate.smartvillageview.enus.model.traffic.time.step.TimeStep;
import org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStep;
import org.computate.smartvillageview.enus.request.SiteRequestEnUS;
import org.computate.vertx.api.ApiCounter;
import org.computate.vertx.api.ApiRequest;

import io.vertx.core.CompositeFuture;
import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.WorkerExecutor;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.core.file.OpenOptions;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.parsetools.RecordParser;
import io.vertx.ext.web.client.WebClient;

public class TrafficFcdReader extends TrafficFcdReaderGen<Object> {

//	public static final Integer FACET_LIMIT = 100;

	public static final Integer INT_COMMIT_WITHIN = 10000;

	public static final String STR_END_TIMESTEP = "</timestep>";

	public static final Long LONG_ZERO = 0L;

	public static final String REGEX_TIMESTEP = "<timestep\\s+time=\"([\\d\\.]+)\">";
	public static final String REGEX_VEHICLE = "<vehicle([^>]*)/>";
	public static final String REGEX_ATTR = "\\s+([^=])=\"([^\"]*)\"";

	public TrafficFcdReader(Vertx vertx, WorkerExecutor workerExecutor, SiteRequestEnUS siteRequest, JsonObject config) {
		super();
		setSiteRequest_(siteRequest);
		setConfig(config);
		setVertx(vertx);
		setWorkerExecutor(workerExecutor);
	}

	public TrafficFcdReader() {
	}

	/**
	 * {@inheritDoc}
	 * Ignore: true
	 * Description: The current request object
	 */
	protected void _siteRequest_(Wrap<SiteRequestEnUS> w) {
	}

	protected void _config(Wrap<JsonObject> w) {
		w.o(siteRequest_.getConfig());
	}

	protected void _webClient(Wrap<WebClient> w) {
		w.o(siteRequest_.getWebClient());
	}

	protected void _vertx(Wrap<Vertx> w) {
	}

	protected void _workerExecutor(Wrap<WorkerExecutor> w) {
	}

	/**
	 * Val.Complete.enUS:Syncing FCD files completed. 
	 * Val.Fail.enUS:Syncing FCD files failed. 
	 * Val.Skip.enUS:Skip importing FCD files. 
	 * Val.Started.enUS:Started importing FCD files. 
	 **/
	public Future<Void> importFcd() {
		Promise<Void> promise = Promise.promise();
		LOG.info(importFcdStarted);
		Long millis = 1000L * config.getLong(ConfigKeys.REFRESH_DATA_PAUSE_IN_SECONDS, 10L);
		vertx.setTimer(millis, a -> {
			workerExecutor.executeBlocking(blockingCodeHandler -> {
				importFcdFileList().onSuccess(c -> {
					LOG.info(importFcdComplete);
					promise.complete();
				}).onFailure(ex -> {
					LOG.error(importFcdFail, ex);
					promise.fail(ex);
				});
			}, false).onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				LOG.error(String.format(importFcdFail), ex);
				promise.fail(ex);
			});
		});
		return promise.future();
	}

	/**
	 * Val.Started.enUS:Syncing FCD files started. 
	 * Val.Complete.enUS:Syncing FCD files completed. 
	 * Val.Skip.enUS:Syncing FCD files is disabled. 
	 * Val.Fail.enUS:Syncing FCD files failed. 
	 **/
	private Future<ApiRequest> importFcdFileList() {
		Promise<ApiRequest> promise = Promise.promise();
		ZonedDateTime now = ZonedDateTime.now(ZoneId.of(config.getString(ConfigKeys.SITE_ZONE)));
		try {
			String path = config.getString(ConfigKeys.FCD_SYNC_PATH);
			vertx.fileSystem().readDir(path).onSuccess(fileNames -> {
				List<Future> futures = new ArrayList<>();
				fileNames.forEach(fileName -> {
					futures.add(Future.future(promise1 -> {
						importFcdFile(fileName).onSuccess(a -> {
							promise1.complete();
						}).onFailure(ex -> {
							LOG.error(importFcdFileListFail, ex);
							promise1.fail(ex);
						});
					}));
				});
				CompositeFuture.all(futures).onSuccess( a -> {
					try {
						String solrHostName = config.getString(ConfigKeys.SOLR_HOST_NAME);
						Integer solrPort = config.getInteger(ConfigKeys.SOLR_PORT);
						String solrCollection = config.getString(ConfigKeys.SOLR_COLLECTION);
						String solrRequestUri = String.format("/solr/%s/update%s", solrCollection, "?commitWithin=1000&overwrite=true&wt=json");
						String deleteQuery = String.format("classSimpleName_docvalues_string:(%s OR %s) AND (created_docvalues_date:[* TO %s] OR (*:* AND -created_docvalues_date:[* TO *]))", TimeStep.CLASS_SIMPLE_NAME, VehicleStep.CLASS_SIMPLE_NAME, TimeStep.staticSearchStrCreated(null, TimeStep.staticSearchCreated(null, now)));
						String deleteXml = String.format("<delete><query>%s</query></delete>", deleteQuery);
						webClient.post(solrPort, solrHostName, solrRequestUri)
								.putHeader("Content-Type", "text/xml")
								.sendBuffer(Buffer.buffer().appendString(deleteXml))
								.onSuccess(d -> {
							try {
								promise.complete();
							} catch(Exception ex) {
								LOG.error(String.format("Could not read response from Solr: http://%s:%s%s", solrHostName, solrPort, solrRequestUri), ex);
								promise.fail(ex);
							}
						}).onFailure(ex -> {
							LOG.error(String.format("Search failed. "), new RuntimeException(ex));
							promise.fail(ex);
						});
					} catch(Exception ex) {
						LOG.error(importFcdFileListFail, ex);
						promise.fail(ex);
					}
				}).onFailure(ex -> {
					LOG.error(importFcdFileListFail, ex);
					promise.fail(ex);
				});
			}).onFailure(ex -> {
				LOG.error(importFcdFileListFail, ex);
				promise.fail(ex);
			});
		} catch (Exception ex) {
			LOG.error(importFcdFileListFail, ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	/**
	 * Val.Started.enUS:Syncing FCD file started: %s
	 * Val.Complete.enUS:Syncing FCD file completed: %s
	 * Val.Fail.enUS:Syncing FCD file failed: %s
	 **/
	private Future<ApiRequest> importFcdFile(String path) {
		Promise<ApiRequest> promise = Promise.promise();
		vertx.fileSystem().open(path, new OpenOptions().setRead(true)).onSuccess(fileStream -> {
			try {
				LOG.info(String.format(importFcdFileStarted, path));
				Optional.ofNullable(config.getInteger(ConfigKeys.READ_BUFFER_SIZE)).ifPresent(readBufferSize -> {
					fileStream.setReadBufferSize(readBufferSize);
				});
				ApiCounter apiCounter = new ApiCounter();
				Long apiCounterResume = config.getLong(ConfigKeys.API_COUNTER_RESUME);
				Long apiCounterFetch = config.getLong(ConfigKeys.API_COUNTER_FETCH);
				apiCounter.setTotalNum(0L);

				RecordParser recordParser = RecordParser.newDelimited(STR_END_TIMESTEP, fileStream);
				Optional.ofNullable(config.getInteger(ConfigKeys.FCD_MAX_RECORD_SIZE)).ifPresent(ftpMaxRecordSize -> {
					recordParser.maxRecordSize(ftpMaxRecordSize);
				});

				recordParser.pause();

//				Long periodicId = vertx.setPeriodic(config.getLong(ConfigKeys.API_CHECK_TIMER_MILLIS), periodicHandler -> {
//					if(apiCounter.getTotalNum().equals(apiCounter.getTotalNumOld())) {
//						LOG.info("FETCH FROM PERIODIC TIMER");
//						apiCounter.setTotalNum(apiCounter.getQueueNum());
//						recordParser.fetch(apiCounterFetch);
//						apiCounter.incrementTotalNum(apiCounterFetch);
//					}
//					apiCounter.setQueueNumOld(apiCounter.getQueueNum());
//					apiCounter.setTotalNumOld(apiCounter.getTotalNum());
//				});

				SiteRequestEnUS siteRequest = new SiteRequestEnUS();
				siteRequest.setConfig(config);
				siteRequest.initDeepSiteRequestEnUS(siteRequest);

				Long numFound = apiCounter.getTotalNum();
				ApiRequest apiRequest = new ApiRequest();
				apiRequest.setRows(apiCounterFetch);
				apiRequest.setNumFound(numFound);
				apiRequest.setNumPATCH(0L);
				apiRequest.setCreated(ZonedDateTime.now(ZoneId.of(config.getString(ConfigKeys.SITE_ZONE))));
				apiRequest.initDeepApiRequest(siteRequest);

				recordParser.handler(bufferedText -> {
					try {
						importFcdHandleBody(path, bufferedText, apiRequest, recordParser, apiCounter, apiCounterResume, apiCounterFetch).onSuccess(a -> {
						}).onFailure(ex -> {
							LOG.error(String.format(importFcdFileFail, path), ex);
							promise.fail(ex);
						});
					} catch (Exception ex) {
						LOG.error(String.format(importFcdFileFail, path), ex);
						promise.fail(ex);
					}
				}).exceptionHandler(ex -> {
					LOG.error(String.format(importFcdFileFail, path), new RuntimeException(ex));
					promise.fail(ex);
				}).endHandler(v -> {
					fileStream.flush();
					fileStream.close();
					vertx.eventBus().publish(String.format("websocket%s", TimeStep.CLASS_SIMPLE_NAME), JsonObject.mapFrom(apiRequest));
					promise.complete(apiRequest);
				});
				recordParser.fetch(apiCounterFetch);
				apiCounter.incrementTotalNum(apiCounterFetch);
			} catch (Exception ex) {
				LOG.error(String.format(importFcdFileFail, path), ex);
				promise.fail(ex);
			}
		}).onFailure(ex -> {
			LOG.error(String.format(importFcdFileFail, path), ex);
			promise.fail(ex);
		});
		return promise.future();
	}

	/**
	 * Val.Started.enUS:Syncing FCD record started: %s
	 * Val.Complete.enUS:Syncing FCD record completed: %s
	 * Val.Fail.enUS:Syncing FCD record failed: %s
	 * Val.WebSocket.enUS:websocket%s
	 */
	private Future<Void> importFcdHandleBody(String path, Buffer bufferedLine, ApiRequest apiRequest, RecordParser recordParser, ApiCounter apiCounter, Long apiCounterResume, Long apiCounterFetch) {
		Promise<Void> promise = Promise.promise();
		TimeStep timeStep = importTimeStepText(path, bufferedLine);
		if(timeStep != null) {
			String id = timeStep.getId();
			JsonObject params = new JsonObject();
			JsonObject body = JsonObject.mapFrom(timeStep);
			params.put("body", body);
			params.put("path", new JsonObject());
			params.put("cookie", new JsonObject());
			params.put("query", new JsonObject().put("commitWithin", 10000).put("q", "*:*").put("var", new JsonArray().add("refresh:false")));
			JsonObject context = new JsonObject().put("params", params);
			JsonObject request = new JsonObject().put("context", context);
			vertx.eventBus().request(
					String.format("%s-enUS-%s", config.getString(ConfigKeys.SITE_NAME), TimeStep.CLASS_SIMPLE_NAME)
					, request
					, new DeliveryOptions().addHeader("action", String.format("putimport%sFuture", TimeStep.CLASS_SIMPLE_NAME))
					).onSuccess(a -> {
				apiCounter.incrementQueueNum();
				if(apiCounterResume.compareTo(apiCounter.getTotalNum() - apiCounter.getQueueNum()) >= LONG_ZERO) {
					recordParser.fetch(apiCounterFetch);
					apiCounter.incrementTotalNum(apiCounterFetch);
					apiRequest.setNumPATCH(apiCounter.getTotalNum());
					apiRequest.setTimeRemaining(apiRequest.calculateTimeRemaining());
					vertx.eventBus().publish(String.format(importFcdHandleBodyWebSocket, TimeStep.CLASS_SIMPLE_NAME), JsonObject.mapFrom(apiRequest));
				}
				promise.complete();
			}).onFailure(ex -> {
				LOG.error(String.format(importFcdHandleBodyFail, id), ex);
				promise.fail(ex);
			});
		} else {
			apiCounter.incrementQueueNum();
			promise.complete();
		}
		return promise.future();
	}

	private TimeStep importTimeStepText(String path, Buffer bufferedText) {
		String text = bufferedText.toString();
		TimeStep timeStep = null;
		Matcher m = Pattern.compile(REGEX_TIMESTEP, Pattern.MULTILINE).matcher(text);
		if(m.find()) {
			timeStep = new TimeStep();
			timeStep.setTime(m.group(1));
			String id = String.format("%s_%s", path, timeStep.getTime().toString());
			timeStep.setCreated(ZonedDateTime.now());
			timeStep.setPath(path);
			timeStep.setId(id);
			timeStep.setInheritPk(id);
		}
		return timeStep;
	}

	private List<VehicleStep> importVehicleStepText(Buffer bufferedText) {
		String text = bufferedText.toString();
		List<VehicleStep> vehicleSteps = new ArrayList<>();
		Matcher m = Pattern.compile(REGEX_VEHICLE, Pattern.MULTILINE).matcher(text);
		boolean found = m.find();
		while (found) {
			String attrs = m.group(m.groupCount());
			Matcher m2 = Pattern.compile(REGEX_ATTR, Pattern.MULTILINE).matcher(text);
			boolean found2 = m2.find();
			while (found2) {
				String var = m.group(1);
				String val = m.group(2);
				VehicleStep vehicleStep = new VehicleStep();
				vehicleStep.persistForClass(var, val);
				vehicleSteps.add(vehicleStep);
				found = m.find();
			}
		}
		return vehicleSteps;
	}
}
