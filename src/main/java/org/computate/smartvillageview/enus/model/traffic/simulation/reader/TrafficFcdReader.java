package org.computate.smartvillageview.enus.model.traffic.simulation.reader;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.file.Paths;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.PumpStreamHandler;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.wrap.Wrap;
import org.computate.smartvillageview.enus.config.ConfigKeys;
import org.computate.smartvillageview.enus.model.system.event.SystemEvent;
import org.computate.smartvillageview.enus.model.traffic.light.TrafficLight;
import org.computate.smartvillageview.enus.model.traffic.light.step.TrafficLightStep;
import org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep;
import org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation;
import org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulationEnUSGenApiServiceImpl;
import org.computate.smartvillageview.enus.model.traffic.time.step.TimeStep;
import org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStep;
import org.computate.smartvillageview.enus.request.SiteRequestEnUS;
import org.computate.smartvillageview.enus.result.base.BaseResult;
import org.computate.smartvillageview.enus.vertx.AsyncInputStream;
import org.computate.vertx.api.ApiCounter;
import org.computate.vertx.api.ApiRequest;
import org.computate.vertx.search.list.SearchList;

import io.vertx.core.CompositeFuture;
import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.WorkerExecutor;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.file.OpenOptions;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.parsetools.RecordParser;
import io.vertx.ext.web.api.service.ServiceRequest;
import io.vertx.ext.web.client.WebClient;

public class TrafficFcdReader extends TrafficFcdReaderGen<Object> {

//	public static final Integer FACET_LIMIT = 100;

	public static final Integer INT_COMMIT_WITHIN = 10000;

	public static final String STR_END_TIMESTEP = "</timestep>";
	public static final String STR_END_VEHICLE = "/>";

	public static final Long LONG_ZERO = 0L;

	public static final String REGEX_TIMESTEP = "<timestep\\s+time=\"([\\d\\.]+)\">";
	public static final String REGEX_VEHICLE = "<(vehicle|person)([^>]*)";
	public static final String REGEX_JUNCTION_TRAFFIC_LIGHT = "<junction([^>]* type=\"traffic_light\"[^>]*)";
	public static final String REGEX_TLS_STATE = "<tlsState([^>]* id=\"%s\"[^>]*)";
	public static final String REGEX_NET_FILE = "<net-file[^>]* value=\"([^\"]+)\"[^>]*";
	public static final String REGEX_ADDITIONAL_FILES = "<additional-files[^>]* value=\"([^>]*)\"[^>]*";
	public static final String REGEX_ATTR = "\\s+([^=\\s]+)=\"([^\"]*)\"";
	public static final String DELIM_NEWLINE = "\n";

	public TrafficFcdReader(Vertx vertx, WorkerExecutor workerExecutor, SiteRequestEnUS siteRequest, JsonObject config) {
		super();
		setSiteRequest_(siteRequest);
		setConfig(config);
		setVertx(vertx);
		setWorkerExecutor(workerExecutor);
		setEventBus(vertx.eventBus());
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

	protected void _eventBus(Wrap<EventBus> w) {
	}

	/**
	 * Val.Complete.enUS:Syncing FCD files completed. 
	 * Val.Fail.enUS:Syncing FCD files failed. 
	 * Val.Skip.enUS:Skip importing FCD files. 
	 * Val.Started.enUS:Started importing FCD files. 
	 **/
	public Future<Void> importFcd() {
		Promise<Void> promise = Promise.promise();
		ZonedDateTime now = ZonedDateTime.now(ZoneId.of(config.getString(ConfigKeys.SITE_ZONE)));
		SystemEvent systemEvent = new SystemEvent();
		String id = String.format("%s_%s", SystemEvent.CLASS_SIMPLE_NAME, UUID.randomUUID());
		systemEvent.setCreated(now);
		systemEvent.setId(id);
		systemEvent.setObjectId(id);
		systemEvent.setInheritPk(id);
		systemEvent.setStatus(SystemEvent.statusStarted_enUS);

		LOG.info(importFcdStarted);
		workerExecutor.executeBlocking(blockingCodeHandler -> {
			importSystemEvent(systemEvent).onSuccess(a -> {
				searchTrafficSimulation().onSuccess(b -> {
					systemEvent.setCompleted(ZonedDateTime.now(ZoneId.of(config.getString(ConfigKeys.SITE_ZONE))));
					systemEvent.setStatus(SystemEvent.statusCompleted_enUS);
					importSystemEvent(systemEvent).onSuccess(c -> {
						LOG.info(importFcdComplete);
						promise.complete();
					}).onFailure(ex -> {
						LOG.error(importFcdFail, ex);
						promise.fail(ex);
					});
				}).onFailure(ex -> {
					LOG.error(importFcdFail, ex);
					systemEvent.setCompleted(ZonedDateTime.now(ZoneId.of(config.getString(ConfigKeys.SITE_ZONE))));
					systemEvent.setStatus(SystemEvent.statusError_enUS);
					importSystemEvent(systemEvent).onSuccess(c -> {
						promise.complete();
					}).onFailure(ex2 -> {
						LOG.error(importFcdFail, ex2);
						promise.fail(ex2);
					});
				});
			}).onFailure(ex -> {
				LOG.error(importFcdFail, ex);
				systemEvent.setCompleted(ZonedDateTime.now(ZoneId.of(config.getString(ConfigKeys.SITE_ZONE))));
				systemEvent.setStatus(SystemEvent.statusError_enUS);
				importSystemEvent(systemEvent).onSuccess(c -> {
					promise.complete();
				}).onFailure(ex2 -> {
					LOG.error(importFcdFail, ex2);
					promise.fail(ex2);
				});
			});
		}, false).onSuccess(b -> {
			promise.complete();
		}).onFailure(ex -> {
			LOG.error(String.format(importFcdFail), ex);
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
	private Future<Void> importSystemEvent(SystemEvent systemEvent) {
		Promise<Void> promise = Promise.promise();
		String id = systemEvent.getId();
		JsonObject params = new JsonObject();
		JsonObject body = JsonObject.mapFrom(systemEvent);
		params.put("body", body);
		params.put("path", new JsonObject());
		params.put("cookie", new JsonObject());
		params.put("query", new JsonObject().put("softCommit", true).put("q", "*:*").put("var", new JsonArray().add("refresh:false")));
		JsonObject context = new JsonObject().put("params", params);
		JsonObject request = new JsonObject().put("context", context);
		vertx.eventBus().request(
				String.format("%s-enUS-%s", config.getString(ConfigKeys.SITE_NAME), SystemEvent.CLASS_SIMPLE_NAME)
				, request
				, new DeliveryOptions().addHeader("action", String.format("putimport%sFuture", SystemEvent.CLASS_SIMPLE_NAME))
				).onSuccess(a -> {
			promise.complete();
		}).onFailure(ex -> {
			LOG.error(String.format(importFcdHandleBodyFail, id), ex);
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> searchTrafficSimulation() {
		Promise<Void> promise = Promise.promise();
		try {
			TrafficSimulationEnUSGenApiServiceImpl service = new TrafficSimulationEnUSGenApiServiceImpl(null, config, workerExecutor, null, webClient, null, null, null);
			JsonObject body = new JsonObject();
			SiteRequestEnUS siteRequest = service.generateSiteRequest(null, null, null, body, SiteRequestEnUS.class);
			ServiceRequest serviceRequest = new ServiceRequest();
			serviceRequest.setParams(
					new JsonObject()
					.put("query", new JsonObject().put("fq", new JsonArray().add(TrafficSimulation.VAR_sumocfgPath)))
					.put("path", new JsonObject())
					.put("cookie", new JsonObject())
					);
			siteRequest.setServiceRequest(serviceRequest);
			service.searchTrafficSimulationList(siteRequest, false, true, true).onSuccess(listTrafficSimulation -> {
				try {
					ApiRequest apiRequest = new ApiRequest();
					apiRequest.setRows(listTrafficSimulation.getRequest().getRows());
					apiRequest.setNumFound(listTrafficSimulation.getResponse().getResponse().getNumFound());
					apiRequest.setNumPATCH(0L);
					apiRequest.initDeepApiRequest(siteRequest);
					siteRequest.setApiRequest_(apiRequest);
					if(apiRequest.getNumFound() == 1L)
						apiRequest.setOriginal(listTrafficSimulation.first());
					apiRequest.setPk(Optional.ofNullable(listTrafficSimulation.first()).map(o2 -> o2.getPk()).orElse(null));
					eventBus.publish("websocketTrafficSimulation", JsonObject.mapFrom(apiRequest).toString());

					listRecursiveTrafficSimulation(service, apiRequest, listTrafficSimulation).onSuccess(e -> {
						LOG.debug(String.format("searchTrafficSimulation succeeded. "));
						promise.complete();
					}).onFailure(ex -> {
						promise.fail(ex);
					});
				} catch(Exception ex) {
					LOG.error(String.format("searchTrafficSimulation failed. "), ex);
					promise.fail(ex);
				}
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		} catch(Exception ex) {
			LOG.error(String.format("searchTrafficSimulation failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}


	public Future<Void> listRecursiveTrafficSimulation(TrafficSimulationEnUSGenApiServiceImpl service, ApiRequest apiRequest, SearchList<TrafficSimulation> listTrafficSimulation) {
		Promise<Void> promise = Promise.promise();
		List<Future> futures = new ArrayList<>();
		SiteRequestEnUS siteRequest = listTrafficSimulation.getSiteRequest_(SiteRequestEnUS.class);
		listTrafficSimulation.getList().forEach(trafficSimulation -> {
			SiteRequestEnUS siteRequest2 = service.generateSiteRequest(siteRequest.getUser(), siteRequest.getUserPrincipal(), siteRequest.getServiceRequest(), siteRequest.getJsonObject(), SiteRequestEnUS.class);
			trafficSimulation.setSiteRequest_(siteRequest2);
			siteRequest2.setApiRequest_(siteRequest.getApiRequest_());
			futures.add(Future.future(promise1 -> {
				importTrafficSimulationFuture(trafficSimulation, false).onSuccess(a -> {
					promise1.complete();
				}).onFailure(ex -> {
					LOG.error(String.format("listRecursiveTrafficSimulation failed. "), ex);
					promise1.fail(ex);
				});
			}));
		});
		CompositeFuture.all(futures).onSuccess( a -> {
			if(apiRequest != null) {
				apiRequest.setNumPATCH(apiRequest.getNumPATCH() + listTrafficSimulation.getResponse().getResponse().getDocs().size());
				if(apiRequest.getNumFound() == 1L)
					listTrafficSimulation.first().apiRequestTrafficSimulation();
				eventBus.publish("websocketTrafficSimulation", JsonObject.mapFrom(apiRequest).toString());
			}
			listTrafficSimulation.next().onSuccess(next -> {
				if(next) {
					listRecursiveTrafficSimulation(service, apiRequest, listTrafficSimulation).onSuccess(b -> {
						promise.complete();
					}).onFailure(ex -> {
						promise.fail(ex);
					});
				} else {
					promise.complete();
				}
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	/**
	 * Val.Complete.enUS:Syncing Traffic simulation import complete: %s
	 * Val.Fail.enUS:Syncing Traffic simulation import failed: %s
	 */
	public Future<TrafficSimulation> importTrafficSimulationFuture(TrafficSimulation trafficSimulation, Boolean inheritPk) {
		Promise<TrafficSimulation> promise = Promise.promise();
		try {
			String sumocfgPath = trafficSimulation.getSumocfgPath();
			obtainSumoAdditionalFiles(sumocfgPath, trafficSimulation).onSuccess(a -> {
				importSumoNetFiles(sumocfgPath, trafficSimulation).onSuccess(b -> {
					LOG.info(String.format(importTrafficSimulationFutureComplete, trafficSimulation.getId()));
					promise.complete();
				}).onFailure(ex -> {
					promise.fail(ex);
				});
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		} catch(Exception ex) {
			LOG.error(String.format("importTrafficSimulationFuture failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	/**
	 * Val.Complete.enUS:Syncing sumocfg file complete: %s
	 * Val.Fail.enUS:Syncing sumocfg file failed: %s
	 */
	public Future<TrafficSimulation> obtainSumoAdditionalFiles(String sumocfgPath, TrafficSimulation trafficSimulation) {
		Promise<TrafficSimulation> promise = Promise.promise();

		vertx.fileSystem().open(sumocfgPath, new OpenOptions().setRead(true)).onSuccess(sumocfgAsyncFile -> {
			try {
				ApiCounter apiCounter = new ApiCounter();
				Long apiCounterResume = 10L;
				Long apiCounterFetch = 10L;
				apiCounter.setTotalNum(0L);
	
				RecordParser recordParser = RecordParser.newDelimited(DELIM_NEWLINE, sumocfgAsyncFile);
				Optional.ofNullable(config.getInteger(ConfigKeys.FCD_MAX_RECORD_SIZE)).ifPresent(ftpMaxRecordSize -> {
					recordParser.maxRecordSize(ftpMaxRecordSize);
				});
				recordParser.pause();
				recordParser.handler(bufferedText -> {
					String str = bufferedText.toString().trim();
					if(str.startsWith("<additional-files ")) {
						obtainSumoAdditionalFilePaths(trafficSimulation, str).onComplete(a -> {
							apiCounter.incrementQueueNum();
							if(apiCounterResume.compareTo(apiCounter.getTotalNum() - apiCounter.getQueueNum()) >= LONG_ZERO) {
								recordParser.fetch(apiCounterFetch);
								LOG.info(String.format("FETCHING additional file %s - %s = %s", apiCounter.getTotalNum(), apiCounter.getQueueNum(), apiCounter.getTotalNum() - apiCounter.getQueueNum()));
							}
						});
					} else {
						apiCounter.incrementQueueNum();
						if(apiCounterResume.compareTo(apiCounter.getTotalNum() - apiCounter.getQueueNum()) >= LONG_ZERO) {
							recordParser.fetch(apiCounterFetch);
							LOG.info(String.format("FETCHING additional file %s - %s = %s", apiCounter.getTotalNum(), apiCounter.getQueueNum(), apiCounter.getTotalNum() - apiCounter.getQueueNum()));
						}
					}
				}).exceptionHandler(ex -> {
					LOG.error(String.format(obtainSumoAdditionalFilesFail, sumocfgPath), new RuntimeException(ex));
					promise.fail(ex);
				}).endHandler(v -> {
					LOG.info(String.format(obtainSumoAdditionalFilesComplete, sumocfgPath));
					promise.complete();
				});
				recordParser.fetch(apiCounterFetch);
			} catch(Exception ex) {
				LOG.error(String.format(obtainSumoAdditionalFilesFail, sumocfgPath), new RuntimeException(ex));
				promise.fail(ex);
			}
		}).onFailure(ex -> {
			LOG.error(String.format(obtainSumoAdditionalFilesFail, sumocfgPath), new RuntimeException(ex));
			promise.fail(ex);
		});
		return promise.future();
	}

	/**
	 * Val.Complete.enUS:Syncing SUMO net file complete: %s
	 * Val.Fail.enUS:Syncing SUMO net file failed: %s
	 */
	public Future<TrafficSimulation> obtainSumoAdditionalFilePaths(TrafficSimulation trafficSimulation, String text) {
		Promise<TrafficSimulation> promise = Promise.promise();

		try {
			Matcher m = Pattern.compile(REGEX_ADDITIONAL_FILES, Pattern.MULTILINE).matcher(text);
			boolean found = m.find();
			if (found) {
				String sumoAdditionalFileNames = m.group(1);
				Arrays.asList(sumoAdditionalFileNames.split(",")).stream().forEach(sumoAdditionalFileName -> {
					trafficSimulation.addAdditionalFilePaths(Paths.get(Paths.get(trafficSimulation.getSumocfgPath()).getParent().toString(), sumoAdditionalFileName).toString());
				});
			}
			promise.complete(trafficSimulation);
		} catch(Exception ex) {
			LOG.error(String.format("importSumoNetFile failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	/**
	 * Val.Complete.enUS:Syncing sumocfg file complete: %s
	 * Val.Fail.enUS:Syncing sumocfg file failed: %s
	 */
	public Future<TrafficSimulation> importSumoNetFiles(String sumocfgPath, TrafficSimulation trafficSimulation) {
		Promise<TrafficSimulation> promise = Promise.promise();

		vertx.fileSystem().open(sumocfgPath, new OpenOptions().setRead(true)).onSuccess(sumocfgAsyncFile -> {
			try {
				ApiCounter apiCounter = new ApiCounter();
				Long apiCounterResume = 10L;
				Long apiCounterFetch = 10L;
				apiCounter.setTotalNum(0L);
	
				RecordParser recordParser = RecordParser.newDelimited(DELIM_NEWLINE, sumocfgAsyncFile);
				Optional.ofNullable(config.getInteger(ConfigKeys.FCD_MAX_RECORD_SIZE)).ifPresent(ftpMaxRecordSize -> {
					recordParser.maxRecordSize(ftpMaxRecordSize);
				});
				recordParser.pause();
				recordParser.handler(bufferedText -> {
					String str = bufferedText.toString().trim();
					if(str.startsWith("<net-file ")) {
						importSumoNetFilePath(trafficSimulation, str).onComplete(a -> {
							apiCounter.incrementQueueNum();
							if(apiCounterResume.compareTo(apiCounter.getTotalNum() - apiCounter.getQueueNum()) >= LONG_ZERO) {
								recordParser.fetch(apiCounterFetch);
								LOG.info(String.format("FETCHING net file %s - %s = %s", apiCounter.getTotalNum(), apiCounter.getQueueNum(), apiCounter.getTotalNum() - apiCounter.getQueueNum()));
							}
						});
					} else {
						apiCounter.incrementQueueNum();
						if(apiCounterResume.compareTo(apiCounter.getTotalNum() - apiCounter.getQueueNum()) >= LONG_ZERO) {
							recordParser.fetch(apiCounterFetch);
							LOG.info(String.format("FETCHING net file %s - %s = %s", apiCounter.getTotalNum(), apiCounter.getQueueNum(), apiCounter.getTotalNum() - apiCounter.getQueueNum()));
						}
					}
				}).exceptionHandler(ex -> {
					LOG.error(String.format(importSumoNetFilesFail, sumocfgPath), new RuntimeException(ex));
					promise.fail(ex);
				}).endHandler(v -> {
					LOG.info(String.format(importSumoNetFilesComplete, sumocfgPath));
					promise.complete();
				});
				recordParser.fetch(apiCounterFetch);
			} catch(Exception ex) {
				LOG.error(String.format(importSumoNetFilesFail, sumocfgPath), new RuntimeException(ex));
				promise.fail(ex);
			}
		}).onFailure(ex -> {
			LOG.error(String.format(importSumoNetFilesFail, sumocfgPath), new RuntimeException(ex));
			promise.fail(ex);
		});
		return promise.future();
	}

	/**
	 * Val.Complete.enUS:Syncing SUMO net file complete: %s
	 * Val.Fail.enUS:Syncing SUMO net file failed: %s
	 */
	public Future<TrafficSimulation> importSumoNetFilePath(TrafficSimulation trafficSimulation, String sumoNetFile) {
		SiteRequestEnUS siteRequest = trafficSimulation.getSiteRequest_();
		Promise<TrafficSimulation> promise = Promise.promise();

		try {
			Matcher m = Pattern.compile(REGEX_NET_FILE, Pattern.MULTILINE).matcher(sumoNetFile);
			boolean found = m.find();
			if (found) {
				String netFileName = m.group(1);
				String netFilePath = Paths.get(Paths.get(trafficSimulation.getSumocfgPath()).getParent().toString(), netFileName).toString();
				trafficSimulation.setNetFilePath(netFilePath);
				ApiRequest apiRequest = siteRequest.getApiRequest_();
				vertx.fileSystem().open(netFilePath, new OpenOptions().setRead(true)).onSuccess(sumoNetAsyncFile -> {
					ApiCounter apiCounter = new ApiCounter();
					Long apiCounterResume = config.getLong(ConfigKeys.API_COUNTER_RESUME_VehicleStep);
					Long apiCounterFetch = config.getLong(ConfigKeys.API_COUNTER_FETCH_VehicleStep);
					apiCounter.setTotalNum(0L);
	
					RecordParser recordParser = RecordParser.newDelimited(DELIM_NEWLINE, sumoNetAsyncFile);
					Optional.ofNullable(config.getInteger(ConfigKeys.FCD_MAX_RECORD_SIZE)).ifPresent(ftpMaxRecordSize -> {
						recordParser.maxRecordSize(ftpMaxRecordSize);
					});
					recordParser.pause();
					recordParser.handler(bufferedText -> {
						String str = bufferedText.toString().trim();
						if(str.startsWith("<junction ") && str.contains(" type=\"traffic_light\"")) {
							importTrafficLightHandleBody(trafficSimulation, netFilePath, str, apiRequest, recordParser).onComplete(a -> {
								apiCounter.incrementQueueNum();
								if(apiCounterResume.compareTo(apiCounter.getTotalNum() - apiCounter.getQueueNum()) >= LONG_ZERO) {
									recordParser.fetch(apiCounterFetch);
									LOG.info(String.format("FETCHING traffic light %s - %s = %s", apiCounter.getTotalNum(), apiCounter.getQueueNum(), apiCounter.getTotalNum() - apiCounter.getQueueNum()));
									apiCounter.incrementTotalNum(apiCounterFetch);
									apiRequest.setNumPATCH(apiCounter.getTotalNum());
									apiRequest.setTimeRemaining(apiRequest.calculateTimeRemaining());
									vertx.eventBus().publish(String.format(importTrafficLightHandleBodyWebSocket, TrafficLight.CLASS_SIMPLE_NAME), JsonObject.mapFrom(apiRequest));
								}
							});
						} else {
							apiCounter.incrementQueueNum();
							if(apiCounterResume.compareTo(apiCounter.getTotalNum() - apiCounter.getQueueNum()) >= LONG_ZERO) {
								recordParser.fetch(apiCounterFetch);
								LOG.info(String.format("FETCHING traffic light %s - %s = %s", apiCounter.getTotalNum(), apiCounter.getQueueNum(), apiCounter.getTotalNum() - apiCounter.getQueueNum()));
								apiCounter.incrementTotalNum(apiCounterFetch);
								apiRequest.setNumPATCH(apiCounter.getTotalNum());
								apiRequest.setTimeRemaining(apiRequest.calculateTimeRemaining());
								vertx.eventBus().publish(String.format(importTrafficLightHandleBodyWebSocket, TrafficLight.CLASS_SIMPLE_NAME), JsonObject.mapFrom(apiRequest));
							}
						}
					}).exceptionHandler(ex -> {
						LOG.error(String.format(importSumoNetFilePathFail, sumoNetFile), new RuntimeException(ex));
						promise.fail(ex);
					}).endHandler(v -> {
						vertx.eventBus().publish(String.format("websocket%s", TimeStep.CLASS_SIMPLE_NAME), JsonObject.mapFrom(apiRequest));
						LOG.info(String.format(importSumoNetFilePathComplete, sumoNetFile));
						promise.complete();
					});
					recordParser.fetch(10);
				}).onFailure(ex -> {
					promise.fail(ex);
				});
			} else {
				promise.complete();
			}
		} catch(Exception ex) {
			LOG.error(String.format("importSumoNetFile failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	/**
	 * Val.Started.enUS:Syncing Traffic Light record started: %s
	 * Val.Complete.enUS:Syncing Traffic Light record completed: %s
	 * Val.Fail.enUS:Syncing Traffic Light record failed: %s
	 * Val.WebSocket.enUS:websocket%s
	 */
	private Future<Void> importTrafficLightHandleBody(TrafficSimulation trafficSimulation, String netFilePath, String str, ApiRequest apiRequest, RecordParser recordParser) {
		Promise<Void> promise = Promise.promise();
		try {
			TrafficLight trafficLight = importTrafficLightText(netFilePath, str);
			if(trafficLight != null) {
				String id = trafficLight.getId();
				JsonObject params = new JsonObject();
				JsonObject body = JsonObject.mapFrom(trafficLight);
				params.put("body", body);
				params.put("path", new JsonObject());
				params.put("cookie", new JsonObject());
				params.put("query", new JsonObject().put("commitWithin", 10000).put("q", "*:*").put("var", new JsonArray().add("refresh:false")));
				JsonObject context = new JsonObject().put("params", params);
				JsonObject request = new JsonObject().put("context", context);
				vertx.eventBus().request(
						String.format("%s-enUS-%s", config.getString(ConfigKeys.SITE_NAME), TrafficLight.CLASS_SIMPLE_NAME)
						, request
						, new DeliveryOptions().addHeader("action", String.format("putimport%sFuture", TrafficLight.CLASS_SIMPLE_NAME))
						).onSuccess(a -> {
					try {
						List<Future> futures = new ArrayList<>();
						trafficSimulation.getTlsStatesPaths().forEach(tlsStatesPath -> {
							futures.add(Future.future(promise1 -> {
								importTlsStatesFile(trafficLight, tlsStatesPath).onSuccess(b -> {
									promise1.complete();
								}).onFailure(ex -> {
									LOG.error(importTrafficLightHandleBodyFail, ex);
									promise1.fail(ex);
								});
							}));
						});
						CompositeFuture.all(futures).onSuccess(b -> {
							promise.complete();
						}).onFailure(ex -> {
							LOG.error(importTrafficLightHandleBodyFail, ex);
							promise.fail(ex);
						});
					} catch(Exception ex) {
						LOG.error(String.format(importTrafficLightHandleBodyFail, id), ex);
						promise.fail(ex);
					}
				}).onFailure(ex -> {
					LOG.error(String.format(importTrafficLightHandleBodyFail, id), ex);
					promise.fail(ex);
				});
			} else {
				promise.complete();
			}
		} catch(Exception ex) {
			LOG.error(String.format("importTrafficLightHandleBody failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	private TrafficLight importTrafficLightText(String netFilePath, String text) {
		TrafficLight result = null;
		try {
			Matcher m = Pattern.compile(REGEX_JUNCTION_TRAFFIC_LIGHT, Pattern.MULTILINE).matcher(text);
			boolean found = m.find();
			if (found) {
				String attrs = m.group(1);
				Matcher m2 = Pattern.compile(REGEX_ATTR, Pattern.MULTILINE).matcher(attrs);
				boolean found2 = m2.find();
				TrafficLight trafficLight = new TrafficLight();
				while (found2) {
					String var = m2.group(1);
					String val = m2.group(2);
					if("id".equals(var)) {
						trafficLight.setTrafficLightId(val);
					} else if("type".equals(var)) {
						trafficLight.setTrafficLightType(val);
					} else {
						if(trafficLight.persistForClass(var, val))
							trafficLight.addSaves(var);
					}
					found2 = m2.find();
				}
				if(trafficLight.getX() != null && trafficLight.getY() != null) {
					DefaultExecutor executor = new DefaultExecutor();
					ByteArrayOutputStream stdout = new ByteArrayOutputStream();
					ByteArrayOutputStream stderr = new ByteArrayOutputStream();
					PumpStreamHandler streamHandler = new PumpStreamHandler(stdout, stderr);
					DefaultExecuteResultHandler resultHandler = new DefaultExecuteResultHandler();
					executor.setStreamHandler(streamHandler);
					CommandLine commandLine = CommandLine.parse("/bin/sh -c");
					commandLine.addArguments(String.format("'/home/ctate/python/bin/python -u -c \"import sumolib; net = sumolib.net.readNet('\"'\"'%s'\"'\"'); print(net.convertXY2LonLat(%s, %s));\"'", netFilePath, trafficLight.getX(), trafficLight.getY()), false);
					Map<String, String> env = new HashMap<>();
					executor.execute(commandLine, env, resultHandler);
					resultHandler.waitFor();
					String output = stdout.toString().trim().replaceAll("[\\(\\) ]", "");
					String error = stderr.toString().trim();
					stdout.close();
					stderr.close();
					String[] parts = output.split(",");
					trafficLight.setX(parts[0]);
					trafficLight.setY(parts[1]);
				}
	
				String id = String.format("%s_%s", TrafficLight.CLASS_SIMPLE_NAME, trafficLight.getTrafficLightId());
				trafficLight.setCreated(ZonedDateTime.now());
				trafficLight.setId(id);
				trafficLight.setObjectId(id);
				trafficLight.setInheritPk(id);
				result = trafficLight;
				found = m.find();
			}
		} catch(Exception ex) {
			LOG.error(String.format("importTrafficLightHandleBody failed. "), ex);
			ExceptionUtils.rethrow(ex);
		}
		return result;
	}

	/**
	 * Val.Complete.enUS:Syncing SUMO net file complete: %s
	 * Val.Fail.enUS:Syncing SUMO net file failed: %s
	 */
	public Future<TrafficSimulation> importTlsStatesFile(TrafficLight trafficLight, String additionalFilePath) {
		SiteRequestEnUS siteRequest = trafficLight.getSiteRequest_();
		Promise<TrafficSimulation> promise = Promise.promise();

		try {
			ApiRequest apiRequest = siteRequest.getApiRequest_();
			vertx.fileSystem().open(additionalFilePath, new OpenOptions().setRead(true)).onSuccess(additionalAsyncFile -> {
				ApiCounter apiCounter = new ApiCounter();
				Long apiCounterResume = config.getLong(ConfigKeys.API_COUNTER_RESUME_VehicleStep);
				Long apiCounterFetch = config.getLong(ConfigKeys.API_COUNTER_FETCH_VehicleStep);
				apiCounter.setTotalNum(0L);

				RecordParser recordParser = RecordParser.newDelimited(String.format(DELIM_NEWLINE, trafficLight.getTrafficLightId()), additionalAsyncFile);
				Optional.ofNullable(config.getInteger(ConfigKeys.FCD_MAX_RECORD_SIZE)).ifPresent(ftpMaxRecordSize -> {
					recordParser.maxRecordSize(ftpMaxRecordSize);
				});
				recordParser.pause();
				recordParser.handler(bufferedText -> {
					String str = bufferedText.toString().trim();
					if(str.startsWith("<tlsState ")) {
						importTrafficLightStepHandleBody(trafficLight, additionalFilePath, str, apiRequest, recordParser).onComplete(a -> {
							apiCounter.incrementQueueNum();
							if(apiCounterResume.compareTo(apiCounter.getTotalNum() - apiCounter.getQueueNum()) >= LONG_ZERO) {
								recordParser.fetch(apiCounterFetch);
								LOG.info(String.format("FETCHING TLS state %s - %s = %s", apiCounter.getTotalNum(), apiCounter.getQueueNum(), apiCounter.getTotalNum() - apiCounter.getQueueNum()));
								apiCounter.incrementTotalNum(apiCounterFetch);
								apiRequest.setNumPATCH(apiCounter.getTotalNum());
								apiRequest.setTimeRemaining(apiRequest.calculateTimeRemaining());
								vertx.eventBus().publish(String.format(importTrafficLightHandleBodyWebSocket, TrafficLight.CLASS_SIMPLE_NAME), JsonObject.mapFrom(apiRequest));
							}
						});
					} else {
						apiCounter.incrementQueueNum();
						if(apiCounterResume.compareTo(apiCounter.getTotalNum() - apiCounter.getQueueNum()) >= LONG_ZERO) {
							recordParser.fetch(apiCounterFetch);
							LOG.info(String.format("FETCHING TLS state %s - %s = %s", apiCounter.getTotalNum(), apiCounter.getQueueNum(), apiCounter.getTotalNum() - apiCounter.getQueueNum()));
							apiCounter.incrementTotalNum(apiCounterFetch);
							apiRequest.setNumPATCH(apiCounter.getTotalNum());
							apiRequest.setTimeRemaining(apiRequest.calculateTimeRemaining());
							vertx.eventBus().publish(String.format(importTrafficLightHandleBodyWebSocket, TrafficLight.CLASS_SIMPLE_NAME), JsonObject.mapFrom(apiRequest));
						}
					}
				}).exceptionHandler(ex -> {
					LOG.error(String.format(importTlsStatesFileFail, additionalFilePath), new RuntimeException(ex));
					promise.fail(ex);
				}).endHandler(v -> {
					vertx.eventBus().publish(String.format("websocket%s", TimeStep.CLASS_SIMPLE_NAME), JsonObject.mapFrom(apiRequest));
					LOG.info(String.format(importTlsStatesFileComplete, additionalFilePath));
					promise.complete();
				});
				recordParser.fetch(10);
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		} catch(Exception ex) {
			LOG.error(String.format("importTlsStatesFile failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	/**
	 * Val.Started.enUS:Syncing Traffic Light record started: %s
	 * Val.Complete.enUS:Syncing Traffic Light record completed: %s
	 * Val.Fail.enUS:Syncing Traffic Light record failed: %s
	 * Val.WebSocket.enUS:websocket%s
	 */
	private Future<Void> importTrafficLightStepHandleBody(TrafficLight trafficLight, String path, String str, ApiRequest apiRequest, RecordParser recordParser) {
		Promise<Void> promise = Promise.promise();
		TrafficLightStep trafficLightStep = importTrafficLightStepText(trafficLight, path, str);
		if(trafficLightStep != null) {
			String id = trafficLightStep.getId();
			JsonObject params = new JsonObject();
			JsonObject body = JsonObject.mapFrom(trafficLightStep);
			params.put("body", body);
			params.put("path", new JsonObject());
			params.put("cookie", new JsonObject());
			params.put("query", new JsonObject().put("commitWithin", 10000).put("q", "*:*").put("var", new JsonArray().add("refresh:false")));
			JsonObject context = new JsonObject().put("params", params);
			JsonObject request = new JsonObject().put("context", context);
			vertx.eventBus().request(
					String.format("%s-enUS-%s", config.getString(ConfigKeys.SITE_NAME), TrafficLightStep.CLASS_SIMPLE_NAME)
					, request
					, new DeliveryOptions().addHeader("action", String.format("putimport%sFuture", TrafficLightStep.CLASS_SIMPLE_NAME))
					).onSuccess(a -> {
				try {
					promise.complete();
				} catch(Exception ex) {
					LOG.error(String.format(importTrafficLightStepHandleBodyFail, id), ex);
					promise.fail(ex);
				}
			}).onFailure(ex -> {
				LOG.error(String.format(importTrafficLightStepHandleBodyFail, id), ex);
				promise.fail(ex);
			});
		} else {
			promise.complete();
		}
		return promise.future();
	}

	private TrafficLightStep importTrafficLightStepText(TrafficLight trafficLight, String path, String text) {
		Matcher m = Pattern.compile(REGEX_JUNCTION_TRAFFIC_LIGHT, Pattern.MULTILINE).matcher(text);
		TrafficLightStep result = null;
		boolean found = m.find();
		if (found) {
			String attrs = m.group(2);
			Matcher m2 = Pattern.compile(REGEX_ATTR, Pattern.MULTILINE).matcher(attrs);
			boolean found2 = m2.find();
			TrafficLightStep trafficLightStep = new TrafficLightStep();
			while (found2) {
				String var = m2.group(1);
				String val = m2.group(2);
				if("id".equals(var)) {
					trafficLightStep.setTrafficLightId(val);
				} else if("type".equals(var)) {
					trafficLightStep.setTrafficLightType(val);
				} else {
					if(trafficLightStep.persistForClass(var, val))
						trafficLightStep.addSaves(var);
				}
				found2 = m2.find();
			}

			String id = String.format("%s_%s_%s", TrafficLightStep.CLASS_SIMPLE_NAME, trafficLight.getTrafficLightId(), trafficLightStep.getTime().toString());
			trafficLightStep.setCreated(ZonedDateTime.now());
			trafficLightStep.setId(id);
			trafficLightStep.setObjectId(id);
			trafficLightStep.setInheritPk(id);
			trafficLightStep.setTime(trafficLightStep.getTime());
			result = trafficLightStep;
			found = m.find();
		}
		return result;
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
				Long apiCounterResume = config.getLong(ConfigKeys.API_COUNTER_RESUME_TimeStep);
				Long apiCounterFetch = config.getLong(ConfigKeys.API_COUNTER_FETCH_TimeStep);
				apiCounter.setTotalNum(0L);

				RecordParser recordParser = RecordParser.newDelimited(STR_END_TIMESTEP, fileStream);
				Optional.ofNullable(config.getInteger(ConfigKeys.FCD_MAX_RECORD_SIZE)).ifPresent(ftpMaxRecordSize -> {
					recordParser.maxRecordSize(ftpMaxRecordSize);
				});

				recordParser.pause();

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
					importFcdHandleBody(path, bufferedText, apiRequest, recordParser).onComplete(a -> {
						apiCounter.incrementQueueNum();
						if(apiCounterResume.compareTo(apiCounter.getTotalNum() - apiCounter.getQueueNum()) >= LONG_ZERO) {
							recordParser.fetch(apiCounterFetch);
							LOG.info(String.format("FETCHING TLS state %s - %s = %s", apiCounter.getTotalNum(), apiCounter.getQueueNum(), apiCounter.getTotalNum() - apiCounter.getQueueNum()));
							apiCounter.incrementTotalNum(apiCounterFetch);
							apiRequest.setNumPATCH(apiCounter.getTotalNum());
							apiRequest.setTimeRemaining(apiRequest.calculateTimeRemaining());
							vertx.eventBus().publish(String.format(importTrafficLightHandleBodyWebSocket, TrafficLight.CLASS_SIMPLE_NAME), JsonObject.mapFrom(apiRequest));
						}
					});
				}).exceptionHandler(ex -> {
					LOG.error(String.format(importFcdFileFail, path), new RuntimeException(ex));
					promise.fail(ex);
				}).endHandler(v -> {
//					fileStream.flush();
//					fileStream.close();
					vertx.eventBus().publish(String.format("websocket%s", TimeStep.CLASS_SIMPLE_NAME), JsonObject.mapFrom(apiRequest));
					LOG.info(String.format(importFcdFileComplete, path));
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
	private Future<Void> importFcdHandleBody(String path, Buffer bufferedText, ApiRequest apiRequest, RecordParser recordParser) {
		Promise<Void> promise = Promise.promise();
		TimeStep timeStep = importTimeStepText(path, bufferedText);
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
				try {
					importVehicle(timeStep, bufferedText).onSuccess(b -> {
						promise.complete();
					}).onFailure(ex -> {
						LOG.error(importFcdFileListFail, ex);
						promise.fail(ex);
					});
				} catch(Exception ex) {
					LOG.error(String.format(importFcdHandleBodyFail, id), ex);
					promise.fail(ex);
				}
			}).onFailure(ex -> {
				LOG.error(String.format(importFcdHandleBodyFail, id), ex);
				promise.fail(ex);
			});
		} else {
			promise.complete();
		}
		return promise.future();
	}

	/**
	 * Val.Started.enUS:Syncing FCD vehicle started: %s
	 * Val.Complete.enUS:Syncing FCD vehicle completed: %s
	 * Val.Fail.enUS:Syncing FCD vehicle failed: %s
	 **/
	private Future<ApiRequest> importVehicle(TimeStep timeStep, Buffer bufferedText) {
		Promise<ApiRequest> promise = Promise.promise();
		try {
			ApiCounter apiCounter = new ApiCounter();
			Long apiCounterResume = config.getLong(ConfigKeys.API_COUNTER_RESUME_VehicleStep);
			Long apiCounterFetch = config.getLong(ConfigKeys.API_COUNTER_FETCH_VehicleStep);
			apiCounter.setTotalNum(0L);

			InputStream is = new ByteArrayInputStream(bufferedText.getBytes());
			AsyncInputStream ais = new AsyncInputStream(vertx, vertx.getOrCreateContext(), is);
			RecordParser recordParser = RecordParser.newDelimited(STR_END_VEHICLE, ais);

			recordParser.pause();

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

			recordParser.handler(bufferedText2 -> {
				BaseResult vehicleStep = importVehicleStepText(timeStep, bufferedText2);
				if(vehicleStep == null) {
					promise.complete();
				} else {
					importFcdVehicleStep(timeStep, vehicleStep, apiRequest, recordParser).onSuccess(b -> {
						apiCounter.incrementQueueNum();
						if(apiCounterResume.compareTo(apiCounter.getTotalNum() - apiCounter.getQueueNum()) >= LONG_ZERO) {
							recordParser.fetch(apiCounterFetch);
							LOG.info(String.format("FETCHING TLS state %s - %s = %s", apiCounter.getTotalNum(), apiCounter.getQueueNum(), apiCounter.getTotalNum() - apiCounter.getQueueNum()));
							apiCounter.incrementTotalNum(apiCounterFetch);
							apiRequest.setNumPATCH(apiCounter.getTotalNum());
							apiRequest.setTimeRemaining(apiRequest.calculateTimeRemaining());
							vertx.eventBus().publish(String.format(importTrafficLightHandleBodyWebSocket, TrafficLight.CLASS_SIMPLE_NAME), JsonObject.mapFrom(apiRequest));
						}
					});
				}
			}).exceptionHandler(ex -> {
				LOG.error(String.format(importVehicleFail, timeStep.getPath()), new RuntimeException(ex));
				promise.fail(ex);
			}).endHandler(v -> {
//					fileStream.flush();
//					fileStream.close();
				vertx.eventBus().publish(String.format("websocket%s", TimeStep.CLASS_SIMPLE_NAME), JsonObject.mapFrom(apiRequest));
				LOG.info(String.format(importVehicleComplete, timeStep.getPath()));
				promise.complete(apiRequest);
			});
			recordParser.fetch(apiCounterFetch);
			apiCounter.incrementTotalNum(apiCounterFetch);
		} catch (Exception ex) {
			LOG.error(String.format(importVehicleFail, timeStep.getPath()), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	/**
	 * Val.Started.enUS:Syncing FCD record started: %s
	 * Val.Complete.enUS:Syncing FCD record completed: %s
	 * Val.Fail.enUS:Syncing FCD record failed: %s
	 * Val.WebSocket.enUS:websocket%s
	 */
	private Future<Void> importFcdVehicleStep(TimeStep timeStep, BaseResult vehicleStep, ApiRequest apiRequest, RecordParser recordParser) {
		Promise<Void> promise = Promise.promise();
		if(timeStep != null && vehicleStep != null) {
			String id = vehicleStep.getId();
			JsonObject params = new JsonObject();
			JsonObject body = JsonObject.mapFrom(vehicleStep);
			params.put("body", body);
			params.put("path", new JsonObject());
			params.put("cookie", new JsonObject());
			params.put("query", new JsonObject().put("commitWithin", 10000).put("q", "*:*").put("var", new JsonArray().add("refresh:false")));
			JsonObject context = new JsonObject().put("params", params);
			JsonObject request = new JsonObject().put("context", context);
			vertx.eventBus().request(
					String.format("%s-enUS-%s", config.getString(ConfigKeys.SITE_NAME), vehicleStep.getClass().getSimpleName())
					, request
					, new DeliveryOptions().addHeader("action", String.format("putimport%sFuture", vehicleStep.getClass().getSimpleName()))
					).onSuccess(a -> {
				promise.complete();
			}).onFailure(ex -> {
				LOG.error(String.format(importFcdHandleBodyFail, id), ex);
				promise.fail(ex);
			});
		} else {
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
			String id = String.format("%s_%s", StringUtils.replace(path, "/", "_"), timeStep.getTime().toString());
			timeStep.setCreated(ZonedDateTime.now());
			timeStep.setPath(path);
			timeStep.setId(id);
			timeStep.setObjectId(id);
			timeStep.setInheritPk(id);
		}
		return timeStep;
	}

	private BaseResult importVehicleStepText(TimeStep timeStep, Buffer bufferedText) {
		String text = bufferedText.toString();
		Matcher m = Pattern.compile(REGEX_VEHICLE, Pattern.MULTILINE).matcher(text);
		BaseResult result = null;
		boolean found = m.find();
		if (found) {
			String vehicleType = m.group(1);
			String attrs = m.group(2);
			if("vehicle".equals(vehicleType)) {
				Matcher m2 = Pattern.compile(REGEX_ATTR, Pattern.MULTILINE).matcher(attrs);
				boolean found2 = m2.find();
				VehicleStep vehicleStep = new VehicleStep();
				while (found2) {
					String var = m2.group(1);
					String val = m2.group(2);
					if("id".equals(var)) {
						vehicleStep.setVehicleId(val);
					} else if("type".equals(var)) {
						vehicleStep.setVehicleType(val);
					} else {
						if(vehicleStep.persistForClass(var, val))
							vehicleStep.addSaves(var);
					}
					found2 = m2.find();
				}
	
				String id = String.format("%s_%s", timeStep.getId(), vehicleStep.getVehicleId());
				vehicleStep.setCreated(ZonedDateTime.now());
				vehicleStep.setId(id);
				vehicleStep.setObjectId(id);
				vehicleStep.setInheritPk(id);
				vehicleStep.setTime(timeStep.getTime());
				vehicleStep.setTimeStepId(timeStep.getId());
				result = vehicleStep;
			} else if("person".equals(vehicleType)) {
				Matcher m2 = Pattern.compile(REGEX_ATTR, Pattern.MULTILINE).matcher(attrs);
				boolean found2 = m2.find();
				PersonStep personStep = new PersonStep();
				while (found2) {
					String var = m2.group(1);
					String val = m2.group(2);
					if("id".equals(var)) {
						personStep.setPersonId(val);
					} else if("type".equals(var)) {
						personStep.setPersonType(val);
					} else {
						if(personStep.persistForClass(var, val))
							personStep.addSaves(var);
					}
					found2 = m2.find();
				}
	
				String id = String.format("%s_%s", timeStep.getId(), personStep.getPersonId());
				personStep.setCreated(ZonedDateTime.now());
				personStep.setId(id);
				personStep.setObjectId(id);
				personStep.setInheritPk(id);
				personStep.setTime(timeStep.getTime());
				personStep.setTimeStepId(timeStep.getId());
				result = personStep;
			}

			found = m.find();
		}
		return result;
	}
}
