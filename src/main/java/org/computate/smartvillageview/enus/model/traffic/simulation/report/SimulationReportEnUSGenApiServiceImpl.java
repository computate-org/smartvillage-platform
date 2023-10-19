package org.computate.smartvillageview.enus.model.traffic.simulation.report;

import org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulationEnUSApiServiceImpl;
import org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation;
import org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLightEnUSApiServiceImpl;
import org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight;
import org.computate.smartvillageview.enus.request.SiteRequestEnUS;
import org.computate.smartvillageview.enus.model.user.SiteUser;
import org.computate.vertx.api.ApiRequest;
import org.computate.vertx.search.list.SearchResult;
import org.computate.vertx.verticle.EmailVerticle;
import org.computate.smartvillageview.enus.config.ConfigKeys;
import org.computate.vertx.api.BaseApiServiceImpl;
import io.vertx.ext.web.client.WebClient;
import java.util.Objects;
import io.vertx.core.WorkerExecutor;
import io.vertx.core.eventbus.EventBus;
import io.vertx.pgclient.PgPool;
import io.vertx.kafka.client.producer.KafkaProducer;
import io.vertx.core.json.impl.JsonUtil;
import io.vertx.ext.auth.authorization.AuthorizationProvider;
import io.vertx.ext.web.templ.handlebars.HandlebarsTemplateEngine;
import io.vertx.core.eventbus.DeliveryOptions;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.time.Instant;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import org.computate.search.response.solr.SolrResponse.StatsField;
import java.util.stream.Collectors;
import io.vertx.core.json.Json;
import org.apache.commons.lang3.StringUtils;
import java.security.Principal;
import org.apache.commons.lang3.exception.ExceptionUtils;
import java.io.PrintWriter;
import java.util.Collection;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import org.computate.search.serialize.ComputateZonedDateTimeSerializer;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import io.vertx.core.Handler;
import io.vertx.ext.web.RoutingContext;
import org.apache.commons.lang3.math.NumberUtils;
import io.vertx.ext.web.Router;
import io.vertx.core.Vertx;
import io.vertx.ext.reactivestreams.ReactiveReadStream;
import io.vertx.ext.reactivestreams.ReactiveWriteStream;
import io.vertx.core.MultiMap;
import io.vertx.ext.auth.oauth2.OAuth2Auth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.vertx.sqlclient.Transaction;
import io.vertx.sqlclient.SqlConnection;
import io.vertx.sqlclient.Tuple;
import io.vertx.sqlclient.Row;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.sql.Timestamp;
import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.AsyncResult;
import java.net.URLEncoder;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.CompositeFuture;
import io.vertx.core.http.HttpHeaders;
import java.nio.charset.Charset;
import io.vertx.ext.auth.authorization.RoleBasedAuthorization;
import io.vertx.ext.web.api.service.ServiceRequest;
import io.vertx.ext.web.api.service.ServiceResponse;
import io.vertx.ext.web.client.predicate.ResponsePredicate;
import java.util.HashMap;
import io.vertx.ext.auth.User;
import java.util.Optional;
import java.util.stream.Stream;
import java.net.URLDecoder;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Map.Entry;
import java.util.Iterator;
import org.computate.search.tool.SearchTool;
import org.computate.search.response.solr.SolrResponse;
import java.util.Base64;
import java.time.ZonedDateTime;
import org.apache.commons.lang3.BooleanUtils;
import org.computate.vertx.search.list.SearchList;
import org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReportPage;


/**
 * Translate: false
 * Generated: true
 **/
public class SimulationReportEnUSGenApiServiceImpl extends BaseApiServiceImpl implements SimulationReportEnUSGenApiService {

	protected static final Logger LOG = LoggerFactory.getLogger(SimulationReportEnUSGenApiServiceImpl.class);

	public SimulationReportEnUSGenApiServiceImpl(EventBus eventBus, JsonObject config, WorkerExecutor workerExecutor, PgPool pgPool, KafkaProducer<String, String> kafkaProducer, WebClient webClient, OAuth2Auth oauth2AuthenticationProvider, AuthorizationProvider authorizationProvider, HandlebarsTemplateEngine templateEngine) {
		super(eventBus, config, workerExecutor, pgPool, kafkaProducer, webClient, oauth2AuthenticationProvider, authorizationProvider, templateEngine);
	}

	// Search //

	@Override
	public void searchSimulationReport(ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler) {
		user(serviceRequest, SiteRequestEnUS.class, SiteUser.class, "smartabyar-smartvillage-enUS-SiteUser", "postSiteUserFuture", "patchSiteUserFuture").onSuccess(siteRequest -> {

			authorizationProvider.getAuthorizations(siteRequest.getUser()).onFailure(ex -> {
				String msg = String.format("401 UNAUTHORIZED user %s to %s %s", siteRequest.getUser().attributes().getJsonObject("accessToken").getString("preferred_username"), serviceRequest.getExtra().getString("method"), serviceRequest.getExtra().getString("uri"));
				eventHandler.handle(Future.succeededFuture(
					new ServiceResponse(401, "UNAUTHORIZED",
						Buffer.buffer().appendString(
							new JsonObject()
								.put("errorCode", "401")
								.put("errorMessage", msg)
								.encodePrettily()
							), MultiMap.caseInsensitiveMultiMap()
					)
				));
			}).onSuccess(b -> {
				if(
						!Optional.ofNullable(config.getString(ConfigKeys.AUTH_ROLE_REQUIRED + "_SimulationReport")).map(v -> RoleBasedAuthorization.create(v).match(siteRequest.getUser())).orElse(false)
						&& !Optional.ofNullable(Optional.ofNullable(config.getString(ConfigKeys.AUTH_ROLE_READ_REQUIRED + "_SimulationReport")).orElse(config.getString(ConfigKeys.AUTH_ROLE_REQUIRED + "_SimulationReport"))).map(v -> RoleBasedAuthorization.create(v).match(siteRequest.getUser())).orElse(false)
						) {
					String msg = String.format("401 UNAUTHORIZED user %s to %s %s", siteRequest.getUser().attributes().getJsonObject("accessToken").getString("preferred_username"), serviceRequest.getExtra().getString("method"), serviceRequest.getExtra().getString("uri"));
					eventHandler.handle(Future.succeededFuture(
						new ServiceResponse(401, "UNAUTHORIZED",
							Buffer.buffer().appendString(
								new JsonObject()
									.put("errorCode", "401")
									.put("errorMessage", msg)
									.encodePrettily()
								), MultiMap.caseInsensitiveMultiMap()
						)
					));
				} else {
					try {
						searchSimulationReportList(siteRequest, false, true, false).onSuccess(listSimulationReport -> {
							response200SearchSimulationReport(listSimulationReport).onSuccess(response -> {
								eventHandler.handle(Future.succeededFuture(response));
								LOG.debug(String.format("searchSimulationReport succeeded. "));
							}).onFailure(ex -> {
								LOG.error(String.format("searchSimulationReport failed. "), ex);
								error(siteRequest, eventHandler, ex);
							});
						}).onFailure(ex -> {
							LOG.error(String.format("searchSimulationReport failed. "), ex);
							error(siteRequest, eventHandler, ex);
						});
					} catch(Exception ex) {
						LOG.error(String.format("searchSimulationReport failed. "), ex);
						error(null, eventHandler, ex);
					}
				}
			});
		}).onFailure(ex -> {
			if("Inactive Token".equals(ex.getMessage()) || StringUtils.startsWith(ex.getMessage(), "invalid_grant:")) {
				try {
					eventHandler.handle(Future.succeededFuture(new ServiceResponse(302, "Found", null, MultiMap.caseInsensitiveMultiMap().add(HttpHeaders.LOCATION, "/logout?redirect_uri=" + URLEncoder.encode(serviceRequest.getExtra().getString("uri"), "UTF-8")))));
				} catch(Exception ex2) {
					LOG.error(String.format("searchSimulationReport failed. ", ex2));
					error(null, eventHandler, ex2);
				}
			} else if(StringUtils.startsWith(ex.getMessage(), "401 UNAUTHORIZED ")) {
				eventHandler.handle(Future.succeededFuture(
					new ServiceResponse(401, "UNAUTHORIZED",
						Buffer.buffer().appendString(
							new JsonObject()
								.put("errorCode", "401")
								.put("errorMessage", "SSO Resource Permission check returned DENY")
								.encodePrettily()
							), MultiMap.caseInsensitiveMultiMap()
							)
					));
			} else {
				LOG.error(String.format("searchSimulationReport failed. "), ex);
				error(null, eventHandler, ex);
			}
		});
	}


	public Future<ServiceResponse> response200SearchSimulationReport(SearchList<SimulationReport> listSimulationReport) {
		Promise<ServiceResponse> promise = Promise.promise();
		try {
			SiteRequestEnUS siteRequest = listSimulationReport.getSiteRequest_(SiteRequestEnUS.class);
			List<String> fls = listSimulationReport.getRequest().getFields();
			JsonObject json = new JsonObject();
			JsonArray l = new JsonArray();
			listSimulationReport.getList().stream().forEach(o -> {
				JsonObject json2 = JsonObject.mapFrom(o);
				if(fls.size() > 0) {
					Set<String> fieldNames = new HashSet<String>();
					for(String fieldName : json2.fieldNames()) {
						String v = SimulationReport.varIndexedSimulationReport(fieldName);
						if(v != null)
							fieldNames.add(SimulationReport.varIndexedSimulationReport(fieldName));
					}
					if(fls.size() == 1 && fls.stream().findFirst().orElse(null).equals("saves_docvalues_strings")) {
						fieldNames.removeAll(Optional.ofNullable(json2.getJsonArray("saves_docvalues_strings")).orElse(new JsonArray()).stream().map(s -> s.toString()).collect(Collectors.toList()));
						fieldNames.remove("pk_docvalues_long");
						fieldNames.remove("created_docvalues_date");
					}
					else if(fls.size() >= 1) {
						fieldNames.removeAll(fls);
					}
					for(String fieldName : fieldNames) {
						if(!fls.contains(fieldName))
							json2.remove(fieldName);
					}
				}
				l.add(json2);
			});
			json.put("list", l);
			response200Search(listSimulationReport.getRequest(), listSimulationReport.getResponse(), json);
			promise.complete(ServiceResponse.completedWithJson(Buffer.buffer(Optional.ofNullable(json).orElse(new JsonObject()).encodePrettily())));
		} catch(Exception ex) {
			LOG.error(String.format("response200SearchSimulationReport failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}
	public void responsePivotSearchSimulationReport(List<SolrResponse.Pivot> pivots, JsonArray pivotArray) {
		if(pivots != null) {
			for(SolrResponse.Pivot pivotField : pivots) {
				String entityIndexed = pivotField.getField();
				String entityVar = StringUtils.substringBefore(entityIndexed, "_docvalues_");
				JsonObject pivotJson = new JsonObject();
				pivotArray.add(pivotJson);
				pivotJson.put("field", entityVar);
				pivotJson.put("value", pivotField.getValue());
				pivotJson.put("count", pivotField.getCount());
				Collection<SolrResponse.PivotRange> pivotRanges = pivotField.getRanges().values();
				List<SolrResponse.Pivot> pivotFields2 = pivotField.getPivotList();
				if(pivotRanges != null) {
					JsonObject rangeJson = new JsonObject();
					pivotJson.put("ranges", rangeJson);
					for(SolrResponse.PivotRange rangeFacet : pivotRanges) {
						JsonObject rangeFacetJson = new JsonObject();
						String rangeFacetVar = StringUtils.substringBefore(rangeFacet.getName(), "_docvalues_");
						rangeJson.put(rangeFacetVar, rangeFacetJson);
						JsonObject rangeFacetCountsObject = new JsonObject();
						rangeFacetJson.put("counts", rangeFacetCountsObject);
						rangeFacet.getCounts().forEach((value, count) -> {
							rangeFacetCountsObject.put(value, count);
						});
					}
				}
				if(pivotFields2 != null) {
					JsonArray pivotArray2 = new JsonArray();
					pivotJson.put("pivot", pivotArray2);
					responsePivotSearchSimulationReport(pivotFields2, pivotArray2);
				}
			}
		}
	}

	// GET //

	@Override
	public void getSimulationReport(ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler) {
		user(serviceRequest, SiteRequestEnUS.class, SiteUser.class, "smartabyar-smartvillage-enUS-SiteUser", "postSiteUserFuture", "patchSiteUserFuture").onSuccess(siteRequest -> {

			authorizationProvider.getAuthorizations(siteRequest.getUser()).onFailure(ex -> {
				String msg = String.format("401 UNAUTHORIZED user %s to %s %s", siteRequest.getUser().attributes().getJsonObject("accessToken").getString("preferred_username"), serviceRequest.getExtra().getString("method"), serviceRequest.getExtra().getString("uri"));
				eventHandler.handle(Future.succeededFuture(
					new ServiceResponse(401, "UNAUTHORIZED",
						Buffer.buffer().appendString(
							new JsonObject()
								.put("errorCode", "401")
								.put("errorMessage", msg)
								.encodePrettily()
							), MultiMap.caseInsensitiveMultiMap()
					)
				));
			}).onSuccess(b -> {
				if(
						!Optional.ofNullable(config.getString(ConfigKeys.AUTH_ROLE_REQUIRED + "_SimulationReport")).map(v -> RoleBasedAuthorization.create(v).match(siteRequest.getUser())).orElse(false)
						&& !Optional.ofNullable(Optional.ofNullable(config.getString(ConfigKeys.AUTH_ROLE_READ_REQUIRED + "_SimulationReport")).orElse(config.getString(ConfigKeys.AUTH_ROLE_REQUIRED + "_SimulationReport"))).map(v -> RoleBasedAuthorization.create(v).match(siteRequest.getUser())).orElse(false)
						) {
					String msg = String.format("401 UNAUTHORIZED user %s to %s %s", siteRequest.getUser().attributes().getJsonObject("accessToken").getString("preferred_username"), serviceRequest.getExtra().getString("method"), serviceRequest.getExtra().getString("uri"));
					eventHandler.handle(Future.succeededFuture(
						new ServiceResponse(401, "UNAUTHORIZED",
							Buffer.buffer().appendString(
								new JsonObject()
									.put("errorCode", "401")
									.put("errorMessage", msg)
									.encodePrettily()
								), MultiMap.caseInsensitiveMultiMap()
						)
					));
				} else {
					try {
						searchSimulationReportList(siteRequest, false, true, false).onSuccess(listSimulationReport -> {
							response200GETSimulationReport(listSimulationReport).onSuccess(response -> {
								eventHandler.handle(Future.succeededFuture(response));
								LOG.debug(String.format("getSimulationReport succeeded. "));
							}).onFailure(ex -> {
								LOG.error(String.format("getSimulationReport failed. "), ex);
								error(siteRequest, eventHandler, ex);
							});
						}).onFailure(ex -> {
							LOG.error(String.format("getSimulationReport failed. "), ex);
							error(siteRequest, eventHandler, ex);
						});
					} catch(Exception ex) {
						LOG.error(String.format("getSimulationReport failed. "), ex);
						error(null, eventHandler, ex);
					}
				}
			});
		}).onFailure(ex -> {
			if("Inactive Token".equals(ex.getMessage()) || StringUtils.startsWith(ex.getMessage(), "invalid_grant:")) {
				try {
					eventHandler.handle(Future.succeededFuture(new ServiceResponse(302, "Found", null, MultiMap.caseInsensitiveMultiMap().add(HttpHeaders.LOCATION, "/logout?redirect_uri=" + URLEncoder.encode(serviceRequest.getExtra().getString("uri"), "UTF-8")))));
				} catch(Exception ex2) {
					LOG.error(String.format("getSimulationReport failed. ", ex2));
					error(null, eventHandler, ex2);
				}
			} else if(StringUtils.startsWith(ex.getMessage(), "401 UNAUTHORIZED ")) {
				eventHandler.handle(Future.succeededFuture(
					new ServiceResponse(401, "UNAUTHORIZED",
						Buffer.buffer().appendString(
							new JsonObject()
								.put("errorCode", "401")
								.put("errorMessage", "SSO Resource Permission check returned DENY")
								.encodePrettily()
							), MultiMap.caseInsensitiveMultiMap()
							)
					));
			} else {
				LOG.error(String.format("getSimulationReport failed. "), ex);
				error(null, eventHandler, ex);
			}
		});
	}


	public Future<ServiceResponse> response200GETSimulationReport(SearchList<SimulationReport> listSimulationReport) {
		Promise<ServiceResponse> promise = Promise.promise();
		try {
			SiteRequestEnUS siteRequest = listSimulationReport.getSiteRequest_(SiteRequestEnUS.class);
			JsonObject json = JsonObject.mapFrom(listSimulationReport.getList().stream().findFirst().orElse(null));
			promise.complete(ServiceResponse.completedWithJson(Buffer.buffer(Optional.ofNullable(json).orElse(new JsonObject()).encodePrettily())));
		} catch(Exception ex) {
			LOG.error(String.format("response200GETSimulationReport failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	// PATCH //

	@Override
	public void patchSimulationReport(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler) {
		LOG.debug(String.format("patchSimulationReport started. "));
		user(serviceRequest, SiteRequestEnUS.class, SiteUser.class, "smartabyar-smartvillage-enUS-SiteUser", "postSiteUserFuture", "patchSiteUserFuture").onSuccess(siteRequest -> {

			authorizationProvider.getAuthorizations(siteRequest.getUser()).onFailure(ex -> {
				String msg = String.format("401 UNAUTHORIZED user %s to %s %s", siteRequest.getUser().attributes().getJsonObject("accessToken").getString("preferred_username"), serviceRequest.getExtra().getString("method"), serviceRequest.getExtra().getString("uri"));
				eventHandler.handle(Future.succeededFuture(
					new ServiceResponse(401, "UNAUTHORIZED",
						Buffer.buffer().appendString(
							new JsonObject()
								.put("errorCode", "401")
								.put("errorMessage", msg)
								.encodePrettily()
							), MultiMap.caseInsensitiveMultiMap()
					)
				));
			}).onSuccess(b -> {
				if(
						!Optional.ofNullable(config.getString(ConfigKeys.AUTH_ROLE_REQUIRED + "_SimulationReport")).map(v -> RoleBasedAuthorization.create(v).match(siteRequest.getUser())).orElse(false)
						|| !Optional.ofNullable(Optional.ofNullable(config.getString(ConfigKeys.AUTH_ROLE_READ_REQUIRED + "_SimulationReport")).orElse(config.getString(ConfigKeys.AUTH_ROLE_REQUIRED + "_SimulationReport"))).map(v -> RoleBasedAuthorization.create(v).match(siteRequest.getUser())).orElse(false)
						) {
					String msg = String.format("401 UNAUTHORIZED user %s to %s %s", siteRequest.getUser().attributes().getJsonObject("accessToken").getString("preferred_username"), serviceRequest.getExtra().getString("method"), serviceRequest.getExtra().getString("uri"));
					eventHandler.handle(Future.succeededFuture(
						new ServiceResponse(401, "UNAUTHORIZED",
							Buffer.buffer().appendString(
								new JsonObject()
									.put("errorCode", "401")
									.put("errorMessage", msg)
									.encodePrettily()
								), MultiMap.caseInsensitiveMultiMap()
						)
					));
				} else {
					try {
						searchSimulationReportList(siteRequest, false, true, true).onSuccess(listSimulationReport -> {
							try {
								if(listSimulationReport.getResponse().getResponse().getNumFound() > 1
										&& !Optional.ofNullable(config.getString(ConfigKeys.AUTH_ROLE_REQUIRED + "_SimulationReport")).map(v -> RoleBasedAuthorization.create(v).match(siteRequest.getUser())).orElse(false)
										) {
									String message = String.format("roles required: " + config.getString(ConfigKeys.AUTH_ROLE_REQUIRED + "_SimulationReport"));
									LOG.error(message);
									error(siteRequest, eventHandler, new RuntimeException(message));
								} else {

									ApiRequest apiRequest = new ApiRequest();
									apiRequest.setRows(listSimulationReport.getRequest().getRows());
									apiRequest.setNumFound(listSimulationReport.getResponse().getResponse().getNumFound());
									apiRequest.setNumPATCH(0L);
									apiRequest.initDeepApiRequest(siteRequest);
									siteRequest.setApiRequest_(apiRequest);
									if(apiRequest.getNumFound() == 1L)
										apiRequest.setOriginal(listSimulationReport.first());
									apiRequest.setPk(Optional.ofNullable(listSimulationReport.first()).map(o2 -> o2.getPk()).orElse(null));
									eventBus.publish("websocketSimulationReport", JsonObject.mapFrom(apiRequest).toString());

									listPATCHSimulationReport(apiRequest, listSimulationReport).onSuccess(e -> {
										response200PATCHSimulationReport(siteRequest).onSuccess(response -> {
											LOG.debug(String.format("patchSimulationReport succeeded. "));
											eventHandler.handle(Future.succeededFuture(response));
										}).onFailure(ex -> {
											LOG.error(String.format("patchSimulationReport failed. "), ex);
											error(siteRequest, eventHandler, ex);
										});
									}).onFailure(ex -> {
										LOG.error(String.format("patchSimulationReport failed. "), ex);
										error(siteRequest, eventHandler, ex);
									});
								}
							} catch(Exception ex) {
								LOG.error(String.format("patchSimulationReport failed. "), ex);
								error(siteRequest, eventHandler, ex);
							}
						}).onFailure(ex -> {
							LOG.error(String.format("patchSimulationReport failed. "), ex);
							error(siteRequest, eventHandler, ex);
						});
					} catch(Exception ex) {
						LOG.error(String.format("patchSimulationReport failed. "), ex);
						error(null, eventHandler, ex);
					}
				}
			});
		}).onFailure(ex -> {
			if("Inactive Token".equals(ex.getMessage()) || StringUtils.startsWith(ex.getMessage(), "invalid_grant:")) {
				try {
					eventHandler.handle(Future.succeededFuture(new ServiceResponse(302, "Found", null, MultiMap.caseInsensitiveMultiMap().add(HttpHeaders.LOCATION, "/logout?redirect_uri=" + URLEncoder.encode(serviceRequest.getExtra().getString("uri"), "UTF-8")))));
				} catch(Exception ex2) {
					LOG.error(String.format("patchSimulationReport failed. ", ex2));
					error(null, eventHandler, ex2);
				}
			} else if(StringUtils.startsWith(ex.getMessage(), "401 UNAUTHORIZED ")) {
				eventHandler.handle(Future.succeededFuture(
					new ServiceResponse(401, "UNAUTHORIZED",
						Buffer.buffer().appendString(
							new JsonObject()
								.put("errorCode", "401")
								.put("errorMessage", "SSO Resource Permission check returned DENY")
								.encodePrettily()
							), MultiMap.caseInsensitiveMultiMap()
							)
					));
			} else {
				LOG.error(String.format("patchSimulationReport failed. "), ex);
				error(null, eventHandler, ex);
			}
		});
	}


	public Future<Void> listPATCHSimulationReport(ApiRequest apiRequest, SearchList<SimulationReport> listSimulationReport) {
		Promise<Void> promise = Promise.promise();
		List<Future> futures = new ArrayList<>();
		SiteRequestEnUS siteRequest = listSimulationReport.getSiteRequest_(SiteRequestEnUS.class);
		listSimulationReport.getList().forEach(o -> {
			SiteRequestEnUS siteRequest2 = generateSiteRequest(siteRequest.getUser(), siteRequest.getUserPrincipal(), siteRequest.getServiceRequest(), siteRequest.getJsonObject(), SiteRequestEnUS.class);
			o.setSiteRequest_(siteRequest2);
			siteRequest2.setApiRequest_(siteRequest.getApiRequest_());
			futures.add(Future.future(promise1 -> {
				patchSimulationReportFuture(o, false).onSuccess(a -> {
					promise1.complete();
				}).onFailure(ex -> {
					LOG.error(String.format("listPATCHSimulationReport failed. "), ex);
					promise1.fail(ex);
				});
			}));
		});
		CompositeFuture.all(futures).onSuccess( a -> {
			listSimulationReport.next().onSuccess(next -> {
				if(next) {
					listPATCHSimulationReport(apiRequest, listSimulationReport).onSuccess(b -> {
						promise.complete();
					}).onFailure(ex -> {
						LOG.error(String.format("listPATCHSimulationReport failed. "), ex);
						promise.fail(ex);
					});
				} else {
					promise.complete();
				}
			}).onFailure(ex -> {
				LOG.error(String.format("listPATCHSimulationReport failed. "), ex);
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			LOG.error(String.format("listPATCHSimulationReport failed. "), ex);
			promise.fail(ex);
		});
		return promise.future();
	}

	@Override
	public void patchSimulationReportFuture(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler) {
		user(serviceRequest, SiteRequestEnUS.class, SiteUser.class, "smartabyar-smartvillage-enUS-SiteUser", "postSiteUserFuture", "patchSiteUserFuture").onSuccess(siteRequest -> {
			try {
				siteRequest.setJsonObject(body);
				serviceRequest.getParams().getJsonObject("query").put("rows", 1);
				searchSimulationReportList(siteRequest, false, true, true).onSuccess(listSimulationReport -> {
					try {
						SimulationReport o = listSimulationReport.first();
						if(o != null && listSimulationReport.getResponse().getResponse().getNumFound() == 1) {
							ApiRequest apiRequest = new ApiRequest();
							apiRequest.setRows(1L);
							apiRequest.setNumFound(1L);
							apiRequest.setNumPATCH(0L);
							apiRequest.initDeepApiRequest(siteRequest);
							siteRequest.setApiRequest_(apiRequest);
							if(Optional.ofNullable(serviceRequest.getParams()).map(p -> p.getJsonObject("query")).map( q -> q.getJsonArray("var")).orElse(new JsonArray()).stream().filter(s -> "refresh:false".equals(s)).count() > 0L) {
								siteRequest.getRequestVars().put( "refresh", "false" );
							}
							if(apiRequest.getNumFound() == 1L)
								apiRequest.setOriginal(o);
							apiRequest.setPk(Optional.ofNullable(listSimulationReport.first()).map(o2 -> o2.getPk()).orElse(null));
							patchSimulationReportFuture(o, false).onSuccess(o2 -> {
								eventHandler.handle(Future.succeededFuture(ServiceResponse.completedWithJson(Buffer.buffer(new JsonObject().encodePrettily()))));
							}).onFailure(ex -> {
								eventHandler.handle(Future.failedFuture(ex));
							});
						} else {
							eventHandler.handle(Future.succeededFuture(ServiceResponse.completedWithJson(Buffer.buffer(new JsonObject().encodePrettily()))));
						}
					} catch(Exception ex) {
						LOG.error(String.format("patchSimulationReport failed. "), ex);
						error(siteRequest, eventHandler, ex);
					}
				}).onFailure(ex -> {
					LOG.error(String.format("patchSimulationReport failed. "), ex);
					error(siteRequest, eventHandler, ex);
				});
			} catch(Exception ex) {
				LOG.error(String.format("patchSimulationReport failed. "), ex);
				error(null, eventHandler, ex);
			}
		}).onFailure(ex -> {
			LOG.error(String.format("patchSimulationReport failed. "), ex);
			error(null, eventHandler, ex);
		});
	}

	public Future<SimulationReport> patchSimulationReportFuture(SimulationReport o, Boolean inheritPk) {
		SiteRequestEnUS siteRequest = o.getSiteRequest_();
		Promise<SimulationReport> promise = Promise.promise();

		try {
			ApiRequest apiRequest = siteRequest.getApiRequest_();
			Promise<SimulationReport> promise1 = Promise.promise();
			pgPool.withTransaction(sqlConnection -> {
				siteRequest.setSqlConnection(sqlConnection);
				varsSimulationReport(siteRequest).onSuccess(a -> {
					sqlPATCHSimulationReport(o, inheritPk).onSuccess(simulationReport -> {
						persistSimulationReport(simulationReport).onSuccess(c -> {
							relateSimulationReport(simulationReport).onSuccess(d -> {
								indexSimulationReport(simulationReport).onSuccess(o2 -> {
									if(apiRequest != null) {
										apiRequest.setNumPATCH(apiRequest.getNumPATCH() + 1);
										if(apiRequest.getNumFound() == 1L && Optional.ofNullable(siteRequest.getJsonObject()).map(json -> json.size() > 0).orElse(false)) {
											o2.apiRequestSimulationReport();
											if(apiRequest.getVars().size() > 0)
												eventBus.publish("websocketSimulationReport", JsonObject.mapFrom(apiRequest).toString());
										}
									}
									promise1.complete(simulationReport);
								}).onFailure(ex -> {
									promise1.fail(ex);
								});
							}).onFailure(ex -> {
								promise1.fail(ex);
							});
						}).onFailure(ex -> {
							promise1.fail(ex);
						});
					}).onFailure(ex -> {
						promise1.fail(ex);
					});
				}).onFailure(ex -> {
					promise1.fail(ex);
				});
				return promise1.future();
			}).onSuccess(a -> {
				siteRequest.setSqlConnection(null);
			}).onFailure(ex -> {
				siteRequest.setSqlConnection(null);
				promise.fail(ex);
			}).compose(simulationReport -> {
				Promise<SimulationReport> promise2 = Promise.promise();
				refreshSimulationReport(simulationReport).onSuccess(a -> {
					promise2.complete(simulationReport);
				}).onFailure(ex -> {
					promise2.fail(ex);
				});
				return promise2.future();
			}).onSuccess(simulationReport -> {
				promise.complete(simulationReport);
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		} catch(Exception ex) {
			LOG.error(String.format("patchSimulationReportFuture failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	public Future<SimulationReport> sqlPATCHSimulationReport(SimulationReport o, Boolean inheritPk) {
		Promise<SimulationReport> promise = Promise.promise();
		try {
			SiteRequestEnUS siteRequest = o.getSiteRequest_();
			ApiRequest apiRequest = siteRequest.getApiRequest_();
			List<Long> pks = Optional.ofNullable(apiRequest).map(r -> r.getPks()).orElse(new ArrayList<>());
			List<String> classes = Optional.ofNullable(apiRequest).map(r -> r.getClasses()).orElse(new ArrayList<>());
			SqlConnection sqlConnection = siteRequest.getSqlConnection();
			Integer num = 1;
			StringBuilder bSql = new StringBuilder("UPDATE SimulationReport SET ");
			List<Object> bParams = new ArrayList<Object>();
			Long pk = o.getPk();
			JsonObject jsonObject = siteRequest.getJsonObject();
			Set<String> methodNames = jsonObject.fieldNames();
			SimulationReport o2 = new SimulationReport();
			o2.setSiteRequest_(siteRequest);
			List<Future> futures1 = new ArrayList<>();
			List<Future> futures2 = new ArrayList<>();

			for(String entityVar : methodNames) {
				switch(entityVar) {
					case "setInheritPk":
							o2.setInheritPk(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_inheritPk + "=$" + num);
							num++;
							bParams.add(o2.sqlInheritPk());
						break;
					case "setCreated":
							o2.setCreated(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_created + "=$" + num);
							num++;
							bParams.add(o2.sqlCreated());
						break;
					case "setArchived":
							o2.setArchived(jsonObject.getBoolean(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_archived + "=$" + num);
							num++;
							bParams.add(o2.sqlArchived());
						break;
					case "setDeleted":
							o2.setDeleted(jsonObject.getBoolean(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_deleted + "=$" + num);
							num++;
							bParams.add(o2.sqlDeleted());
						break;
					case "setSessionId":
							o2.setSessionId(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_sessionId + "=$" + num);
							num++;
							bParams.add(o2.sqlSessionId());
						break;
					case "setUserKey":
							o2.setUserKey(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_userKey + "=$" + num);
							num++;
							bParams.add(o2.sqlUserKey());
						break;
					case "setParamPedestrianWaitThresholdSecWestEast":
							o2.setParamPedestrianWaitThresholdSecWestEast(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramPedestrianWaitThresholdSecWestEast + "=$" + num);
							num++;
							bParams.add(o2.sqlParamPedestrianWaitThresholdSecWestEast());
						break;
					case "setParamVehicleQueueThresholdWestEast":
							o2.setParamVehicleQueueThresholdWestEast(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramVehicleQueueThresholdWestEast + "=$" + num);
							num++;
							bParams.add(o2.sqlParamVehicleQueueThresholdWestEast());
						break;
					case "setParamVehicleQueueThresholdSouthNorth":
							o2.setParamVehicleQueueThresholdSouthNorth(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramVehicleQueueThresholdSouthNorth + "=$" + num);
							num++;
							bParams.add(o2.sqlParamVehicleQueueThresholdSouthNorth());
						break;
					case "setParamPedestrianQueueThresholdNorthSouth":
							o2.setParamPedestrianQueueThresholdNorthSouth(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramPedestrianQueueThresholdNorthSouth + "=$" + num);
							num++;
							bParams.add(o2.sqlParamPedestrianQueueThresholdNorthSouth());
						break;
					case "setParamPedestrianQueueThresholdWestEast":
							o2.setParamPedestrianQueueThresholdWestEast(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramPedestrianQueueThresholdWestEast + "=$" + num);
							num++;
							bParams.add(o2.sqlParamPedestrianQueueThresholdWestEast());
						break;
					case "setParamDemandScale":
							o2.setParamDemandScale(jsonObject.getJsonArray(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramDemandScale + "=$" + num);
							num++;
							bParams.add(o2.sqlParamDemandScale());
						break;
					case "setParamStepSize":
							o2.setParamStepSize(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramStepSize + "=$" + num);
							num++;
							bParams.add(o2.sqlParamStepSize());
						break;
					case "setParamRunTime":
							o2.setParamRunTime(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramRunTime + "=$" + num);
							num++;
							bParams.add(o2.sqlParamRunTime());
						break;
					case "setParamItersPerPar":
							o2.setParamItersPerPar(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramItersPerPar + "=$" + num);
							num++;
							bParams.add(o2.sqlParamItersPerPar());
						break;
					case "setParamTotalIterNum":
							o2.setParamTotalIterNum(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramTotalIterNum + "=$" + num);
							num++;
							bParams.add(o2.sqlParamTotalIterNum());
						break;
					case "setUpdatedParameters":
							o2.setUpdatedParameters(jsonObject.getJsonArray(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_updatedParameters + "=$" + num);
							num++;
							bParams.add(o2.sqlUpdatedParameters());
						break;
					case "setUpdatedPerformance":
							o2.setUpdatedPerformance(jsonObject.getJsonArray(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_updatedPerformance + "=$" + num);
							num++;
							bParams.add(o2.sqlUpdatedPerformance());
						break;
					case "setAverageQueueLength":
							o2.setAverageQueueLength(jsonObject.getJsonArray(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_averageQueueLength + "=$" + num);
							num++;
							bParams.add(o2.sqlAverageQueueLength());
						break;
					case "setReportStatus":
							o2.setReportStatus(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_reportStatus + "=$" + num);
							num++;
							bParams.add(o2.sqlReportStatus());
						break;
					case "setReportProgress":
							o2.setReportProgress(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_reportProgress + "=$" + num);
							num++;
							bParams.add(o2.sqlReportProgress());
						break;
					case "setReportName":
							o2.setReportName(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_reportName + "=$" + num);
							num++;
							bParams.add(o2.sqlReportName());
						break;
					case "setLocation":
							o2.setLocation(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_location + "=$" + num);
							num++;
							bParams.add(o2.sqlLocation());
						break;
					case "setSimulationKey":
						Optional.ofNullable(jsonObject.getString(entityVar)).ifPresent(val -> {
							futures1.add(Future.future(promise2 -> {
								search(siteRequest).query(TrafficSimulation.class, val, inheritPk).onSuccess(pk2 -> {
									if(!pks.contains(pk2)) {
										pks.add(pk2);
										classes.add("TrafficSimulation");
									}
									sql(siteRequest).update(SimulationReport.class, pk).set(SimulationReport.VAR_simulationKey, TrafficSimulation.class, pk2).onSuccess(a -> {
										promise2.complete();
									}).onFailure(ex -> {
										promise2.fail(ex);
									});
								}).onFailure(ex -> {
									promise2.fail(ex);
								});
							}));
						});
						break;
					case "removeSimulationKey":
						Optional.ofNullable(jsonObject.getString(entityVar)).map(val -> Long.parseLong(val)).ifPresent(pk2 -> {
							if(!pks.contains(pk2)) {
								pks.add(pk2);
								classes.add("TrafficSimulation");
							}
							futures2.add(Future.future(promise2 -> {
									sql(siteRequest).update(SimulationReport.class, pk).setToNull(SimulationReport.VAR_simulationKey, TrafficSimulation.class, pk2).onSuccess(a -> {
									promise2.complete();
								}).onFailure(ex -> {
									promise2.fail(ex);
								});
							}));
						});
						break;
					case "setSmartTrafficLightKey":
						Optional.ofNullable(jsonObject.getString(entityVar)).ifPresent(val -> {
							futures1.add(Future.future(promise2 -> {
								search(siteRequest).query(SmartTrafficLight.class, val, inheritPk).onSuccess(pk2 -> {
									if(!pks.contains(pk2)) {
										pks.add(pk2);
										classes.add("SmartTrafficLight");
									}
									sql(siteRequest).update(SimulationReport.class, pk).set(SimulationReport.VAR_smartTrafficLightKey, SmartTrafficLight.class, pk2).onSuccess(a -> {
										promise2.complete();
									}).onFailure(ex -> {
										promise2.fail(ex);
									});
								}).onFailure(ex -> {
									promise2.fail(ex);
								});
							}));
						});
						break;
					case "removeSmartTrafficLightKey":
						Optional.ofNullable(jsonObject.getString(entityVar)).map(val -> Long.parseLong(val)).ifPresent(pk2 -> {
							if(!pks.contains(pk2)) {
								pks.add(pk2);
								classes.add("SmartTrafficLight");
							}
							futures2.add(Future.future(promise2 -> {
									sql(siteRequest).update(SimulationReport.class, pk).setToNull(SimulationReport.VAR_smartTrafficLightKey, SmartTrafficLight.class, pk2).onSuccess(a -> {
									promise2.complete();
								}).onFailure(ex -> {
									promise2.fail(ex);
								});
							}));
						});
						break;
					case "setSimulationName":
							o2.setSimulationName(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_simulationName + "=$" + num);
							num++;
							bParams.add(o2.sqlSimulationName());
						break;
					case "setSmartTrafficLightId":
							o2.setSmartTrafficLightId(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_smartTrafficLightId + "=$" + num);
							num++;
							bParams.add(o2.sqlSmartTrafficLightId());
						break;
					case "setSmartTrafficLightName":
							o2.setSmartTrafficLightName(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_smartTrafficLightName + "=$" + num);
							num++;
							bParams.add(o2.sqlSmartTrafficLightName());
						break;
					case "setParamAvgVehiclePerMinFromWestToEast":
							o2.setParamAvgVehiclePerMinFromWestToEast(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramAvgVehiclePerMinFromWestToEast + "=$" + num);
							num++;
							bParams.add(o2.sqlParamAvgVehiclePerMinFromWestToEast());
						break;
					case "setParamAvgVehiclePerMinFromSouthToNorth":
							o2.setParamAvgVehiclePerMinFromSouthToNorth(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramAvgVehiclePerMinFromSouthToNorth + "=$" + num);
							num++;
							bParams.add(o2.sqlParamAvgVehiclePerMinFromSouthToNorth());
						break;
					case "setParamVehicleDemandScalingFactor":
							o2.setParamVehicleDemandScalingFactor(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramVehicleDemandScalingFactor + "=$" + num);
							num++;
							bParams.add(o2.sqlParamVehicleDemandScalingFactor());
						break;
					case "setParamAvgPedestrianPerMinFromWestToEast":
							o2.setParamAvgPedestrianPerMinFromWestToEast(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramAvgPedestrianPerMinFromWestToEast + "=$" + num);
							num++;
							bParams.add(o2.sqlParamAvgPedestrianPerMinFromWestToEast());
						break;
					case "setParamAvgPedestrianPerMinFromSouthToNorth":
							o2.setParamAvgPedestrianPerMinFromSouthToNorth(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramAvgPedestrianPerMinFromSouthToNorth + "=$" + num);
							num++;
							bParams.add(o2.sqlParamAvgPedestrianPerMinFromSouthToNorth());
						break;
					case "setParamPedestrianDemandScalingFactor":
							o2.setParamPedestrianDemandScalingFactor(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramPedestrianDemandScalingFactor + "=$" + num);
							num++;
							bParams.add(o2.sqlParamPedestrianDemandScalingFactor());
						break;
					case "setParamMinGreenTimeSecWestEast":
							o2.setParamMinGreenTimeSecWestEast(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramMinGreenTimeSecWestEast + "=$" + num);
							num++;
							bParams.add(o2.sqlParamMinGreenTimeSecWestEast());
						break;
					case "setParamMaxGreenTimeSecWestEast":
							o2.setParamMaxGreenTimeSecWestEast(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramMaxGreenTimeSecWestEast + "=$" + num);
							num++;
							bParams.add(o2.sqlParamMaxGreenTimeSecWestEast());
						break;
					case "setParamMinGreenTimeSecSouthNorth":
							o2.setParamMinGreenTimeSecSouthNorth(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramMinGreenTimeSecSouthNorth + "=$" + num);
							num++;
							bParams.add(o2.sqlParamMinGreenTimeSecSouthNorth());
						break;
					case "setParamMaxGreenTimeSecSouthNorth":
							o2.setParamMaxGreenTimeSecSouthNorth(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramMaxGreenTimeSecSouthNorth + "=$" + num);
							num++;
							bParams.add(o2.sqlParamMaxGreenTimeSecSouthNorth());
						break;
					case "setParamPedestrianWaitThresholdSecNorthSouth":
							o2.setParamPedestrianWaitThresholdSecNorthSouth(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramPedestrianWaitThresholdSecNorthSouth + "=$" + num);
							num++;
							bParams.add(o2.sqlParamPedestrianWaitThresholdSecNorthSouth());
						break;
				}
			}
			bSql.append(" WHERE pk=$" + num);
			if(bParams.size() > 0) {
				bParams.add(pk);
				num++;
				futures2.add(0, Future.future(a -> {
					sqlConnection.preparedQuery(bSql.toString())
							.execute(Tuple.tuple(bParams)
							).onSuccess(b -> {
						a.handle(Future.succeededFuture());
					}).onFailure(ex -> {
						RuntimeException ex2 = new RuntimeException("value SimulationReport failed", ex);
						LOG.error(String.format("relateSimulationReport failed. "), ex2);
						a.handle(Future.failedFuture(ex2));
					});
				}));
			}
			CompositeFuture.all(futures1).onSuccess(a -> {
				CompositeFuture.all(futures2).onSuccess(b -> {
					SimulationReport o3 = new SimulationReport();
					o3.setSiteRequest_(o.getSiteRequest_());
					o3.setPk(pk);
					promise.complete(o3);
				}).onFailure(ex -> {
					LOG.error(String.format("sqlPATCHSimulationReport failed. "), ex);
					promise.fail(ex);
				});
			}).onFailure(ex -> {
				LOG.error(String.format("sqlPATCHSimulationReport failed. "), ex);
				promise.fail(ex);
			});
		} catch(Exception ex) {
			LOG.error(String.format("sqlPATCHSimulationReport failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	public Future<ServiceResponse> response200PATCHSimulationReport(SiteRequestEnUS siteRequest) {
		Promise<ServiceResponse> promise = Promise.promise();
		try {
			JsonObject json = new JsonObject();
			promise.complete(ServiceResponse.completedWithJson(Buffer.buffer(Optional.ofNullable(json).orElse(new JsonObject()).encodePrettily())));
		} catch(Exception ex) {
			LOG.error(String.format("response200PATCHSimulationReport failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	// POST //

	@Override
	public void postSimulationReport(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler) {
		LOG.debug(String.format("postSimulationReport started. "));
		user(serviceRequest, SiteRequestEnUS.class, SiteUser.class, "smartabyar-smartvillage-enUS-SiteUser", "postSiteUserFuture", "patchSiteUserFuture").onSuccess(siteRequest -> {

			authorizationProvider.getAuthorizations(siteRequest.getUser()).onFailure(ex -> {
				String msg = String.format("401 UNAUTHORIZED user %s to %s %s", siteRequest.getUser().attributes().getJsonObject("accessToken").getString("preferred_username"), serviceRequest.getExtra().getString("method"), serviceRequest.getExtra().getString("uri"));
				eventHandler.handle(Future.succeededFuture(
					new ServiceResponse(401, "UNAUTHORIZED",
						Buffer.buffer().appendString(
							new JsonObject()
								.put("errorCode", "401")
								.put("errorMessage", msg)
								.encodePrettily()
							), MultiMap.caseInsensitiveMultiMap()
					)
				));
			}).onSuccess(b -> {
				if(
						!Optional.ofNullable(config.getString(ConfigKeys.AUTH_ROLE_REQUIRED + "_SimulationReport")).map(v -> RoleBasedAuthorization.create(v).match(siteRequest.getUser())).orElse(false)
						|| !Optional.ofNullable(Optional.ofNullable(config.getString(ConfigKeys.AUTH_ROLE_READ_REQUIRED + "_SimulationReport")).orElse(config.getString(ConfigKeys.AUTH_ROLE_REQUIRED + "_SimulationReport"))).map(v -> RoleBasedAuthorization.create(v).match(siteRequest.getUser())).orElse(false)
						) {
					String msg = String.format("401 UNAUTHORIZED user %s to %s %s", siteRequest.getUser().attributes().getJsonObject("accessToken").getString("preferred_username"), serviceRequest.getExtra().getString("method"), serviceRequest.getExtra().getString("uri"));
					eventHandler.handle(Future.succeededFuture(
						new ServiceResponse(401, "UNAUTHORIZED",
							Buffer.buffer().appendString(
								new JsonObject()
									.put("errorCode", "401")
									.put("errorMessage", msg)
									.encodePrettily()
								), MultiMap.caseInsensitiveMultiMap()
						)
					));
				} else {
					try {
						ApiRequest apiRequest = new ApiRequest();
						apiRequest.setRows(1L);
						apiRequest.setNumFound(1L);
						apiRequest.setNumPATCH(0L);
						apiRequest.initDeepApiRequest(siteRequest);
						siteRequest.setApiRequest_(apiRequest);
						eventBus.publish("websocketSimulationReport", JsonObject.mapFrom(apiRequest).toString());
						JsonObject params = new JsonObject();
						params.put("body", siteRequest.getJsonObject());
						params.put("path", new JsonObject());
						params.put("cookie", new JsonObject());
						params.put("header", new JsonObject());
						params.put("form", new JsonObject());
						JsonObject query = new JsonObject();
						Boolean softCommit = Optional.ofNullable(siteRequest.getServiceRequest().getParams()).map(p -> p.getJsonObject("query")).map( q -> q.getBoolean("softCommit")).orElse(null);
						Integer commitWithin = Optional.ofNullable(siteRequest.getServiceRequest().getParams()).map(p -> p.getJsonObject("query")).map( q -> q.getInteger("commitWithin")).orElse(null);
						if(softCommit == null && commitWithin == null)
							softCommit = true;
						if(softCommit != null)
							query.put("softCommit", softCommit);
						if(commitWithin != null)
							query.put("commitWithin", commitWithin);
						params.put("query", query);
						JsonObject context = new JsonObject().put("params", params).put("user", siteRequest.getUserPrincipal());
						JsonObject json = new JsonObject().put("context", context);
						eventBus.request("smartabyar-smartvillage-enUS-SimulationReport", json, new DeliveryOptions().addHeader("action", "postSimulationReportFuture")).onSuccess(a -> {
							JsonObject responseMessage = (JsonObject)a.body();
							JsonObject responseBody = new JsonObject(Buffer.buffer(JsonUtil.BASE64_DECODER.decode(responseMessage.getString("payload"))));
							apiRequest.setPk(Long.parseLong(responseBody.getString("pk")));
							eventHandler.handle(Future.succeededFuture(ServiceResponse.completedWithJson(Buffer.buffer(responseBody.encodePrettily()))));
							LOG.debug(String.format("postSimulationReport succeeded. "));
						}).onFailure(ex -> {
							LOG.error(String.format("postSimulationReport failed. "), ex);
							error(siteRequest, eventHandler, ex);
						});
					} catch(Exception ex) {
						LOG.error(String.format("postSimulationReport failed. "), ex);
						error(null, eventHandler, ex);
					}
				}
			});
		}).onFailure(ex -> {
			if("Inactive Token".equals(ex.getMessage()) || StringUtils.startsWith(ex.getMessage(), "invalid_grant:")) {
				try {
					eventHandler.handle(Future.succeededFuture(new ServiceResponse(302, "Found", null, MultiMap.caseInsensitiveMultiMap().add(HttpHeaders.LOCATION, "/logout?redirect_uri=" + URLEncoder.encode(serviceRequest.getExtra().getString("uri"), "UTF-8")))));
				} catch(Exception ex2) {
					LOG.error(String.format("postSimulationReport failed. ", ex2));
					error(null, eventHandler, ex2);
				}
			} else if(StringUtils.startsWith(ex.getMessage(), "401 UNAUTHORIZED ")) {
				eventHandler.handle(Future.succeededFuture(
					new ServiceResponse(401, "UNAUTHORIZED",
						Buffer.buffer().appendString(
							new JsonObject()
								.put("errorCode", "401")
								.put("errorMessage", "SSO Resource Permission check returned DENY")
								.encodePrettily()
							), MultiMap.caseInsensitiveMultiMap()
							)
					));
			} else {
				LOG.error(String.format("postSimulationReport failed. "), ex);
				error(null, eventHandler, ex);
			}
		});
	}


	@Override
	public void postSimulationReportFuture(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler) {
		user(serviceRequest, SiteRequestEnUS.class, SiteUser.class, "smartabyar-smartvillage-enUS-SiteUser", "postSiteUserFuture", "patchSiteUserFuture").onSuccess(siteRequest -> {
			ApiRequest apiRequest = new ApiRequest();
			apiRequest.setRows(1L);
			apiRequest.setNumFound(1L);
			apiRequest.setNumPATCH(0L);
			apiRequest.initDeepApiRequest(siteRequest);
			siteRequest.setApiRequest_(apiRequest);
			if(Optional.ofNullable(serviceRequest.getParams()).map(p -> p.getJsonObject("query")).map( q -> q.getJsonArray("var")).orElse(new JsonArray()).stream().filter(s -> "refresh:false".equals(s)).count() > 0L) {
				siteRequest.getRequestVars().put( "refresh", "false" );
			}
			postSimulationReportFuture(siteRequest, false).onSuccess(o -> {
				eventHandler.handle(Future.succeededFuture(ServiceResponse.completedWithJson(Buffer.buffer(JsonObject.mapFrom(o).encodePrettily()))));
			}).onFailure(ex -> {
				eventHandler.handle(Future.failedFuture(ex));
			});
		}).onFailure(ex -> {
			if("Inactive Token".equals(ex.getMessage()) || StringUtils.startsWith(ex.getMessage(), "invalid_grant:")) {
				try {
					eventHandler.handle(Future.succeededFuture(new ServiceResponse(302, "Found", null, MultiMap.caseInsensitiveMultiMap().add(HttpHeaders.LOCATION, "/logout?redirect_uri=" + URLEncoder.encode(serviceRequest.getExtra().getString("uri"), "UTF-8")))));
				} catch(Exception ex2) {
					LOG.error(String.format("postSimulationReport failed. ", ex2));
					error(null, eventHandler, ex2);
				}
			} else if(StringUtils.startsWith(ex.getMessage(), "401 UNAUTHORIZED ")) {
				eventHandler.handle(Future.succeededFuture(
					new ServiceResponse(401, "UNAUTHORIZED",
						Buffer.buffer().appendString(
							new JsonObject()
								.put("errorCode", "401")
								.put("errorMessage", "SSO Resource Permission check returned DENY")
								.encodePrettily()
							), MultiMap.caseInsensitiveMultiMap()
							)
					));
			} else {
				LOG.error(String.format("postSimulationReport failed. "), ex);
				error(null, eventHandler, ex);
			}
		});
	}

	public Future<SimulationReport> postSimulationReportFuture(SiteRequestEnUS siteRequest, Boolean inheritPk) {
		Promise<SimulationReport> promise = Promise.promise();

		try {
			pgPool.withTransaction(sqlConnection -> {
				Promise<SimulationReport> promise1 = Promise.promise();
				siteRequest.setSqlConnection(sqlConnection);
				varsSimulationReport(siteRequest).onSuccess(a -> {
					createSimulationReport(siteRequest).onSuccess(simulationReport -> {
						sqlPOSTSimulationReport(simulationReport, inheritPk).onSuccess(b -> {
							persistSimulationReport(simulationReport).onSuccess(c -> {
								relateSimulationReport(simulationReport).onSuccess(d -> {
									indexSimulationReport(simulationReport).onSuccess(o2 -> {
										promise1.complete(simulationReport);
									}).onFailure(ex -> {
										promise1.fail(ex);
									});
								}).onFailure(ex -> {
									promise1.fail(ex);
								});
							}).onFailure(ex -> {
								promise1.fail(ex);
							});
						}).onFailure(ex -> {
							promise1.fail(ex);
						});
					}).onFailure(ex -> {
						promise1.fail(ex);
					});
				}).onFailure(ex -> {
					promise1.fail(ex);
				});
				return promise1.future();
			}).onSuccess(a -> {
				siteRequest.setSqlConnection(null);
			}).onFailure(ex -> {
				siteRequest.setSqlConnection(null);
				promise.fail(ex);
			}).compose(simulationReport -> {
				Promise<SimulationReport> promise2 = Promise.promise();
				refreshSimulationReport(simulationReport).onSuccess(a -> {
					try {
						ApiRequest apiRequest = siteRequest.getApiRequest_();
						if(apiRequest != null) {
							apiRequest.setNumPATCH(apiRequest.getNumPATCH() + 1);
							simulationReport.apiRequestSimulationReport();
							eventBus.publish("websocketSimulationReport", JsonObject.mapFrom(apiRequest).toString());
						}
						promise2.complete(simulationReport);
					} catch(Exception ex) {
						LOG.error(String.format("postSimulationReportFuture failed. "), ex);
						promise.fail(ex);
					}
				}).onFailure(ex -> {
					promise2.fail(ex);
				});
				return promise2.future();
			}).onSuccess(simulationReport -> {
				promise.complete(simulationReport);
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		} catch(Exception ex) {
			LOG.error(String.format("postSimulationReportFuture failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	public Future<Void> sqlPOSTSimulationReport(SimulationReport o, Boolean inheritPk) {
		Promise<Void> promise = Promise.promise();
		try {
			SiteRequestEnUS siteRequest = o.getSiteRequest_();
			ApiRequest apiRequest = siteRequest.getApiRequest_();
			List<Long> pks = Optional.ofNullable(apiRequest).map(r -> r.getPks()).orElse(new ArrayList<>());
			List<String> classes = Optional.ofNullable(apiRequest).map(r -> r.getClasses()).orElse(new ArrayList<>());
			SqlConnection sqlConnection = siteRequest.getSqlConnection();
			Integer num = 1;
			StringBuilder bSql = new StringBuilder("UPDATE SimulationReport SET ");
			List<Object> bParams = new ArrayList<Object>();
			Long pk = o.getPk();
			JsonObject jsonObject = siteRequest.getJsonObject();
			SimulationReport o2 = new SimulationReport();
			o2.setSiteRequest_(siteRequest);
			List<Future> futures1 = new ArrayList<>();
			List<Future> futures2 = new ArrayList<>();

			if(siteRequest.getSessionId() != null) {
				if(bParams.size() > 0) {
					bSql.append(", ");
				}
				bSql.append("sessionId=$" + num);
				num++;
				bParams.add(siteRequest.getSessionId());
			}
			if(siteRequest.getUserKey() != null) {
				if(bParams.size() > 0) {
					bSql.append(", ");
				}
				bSql.append("userKey=$" + num);
				num++;
				bParams.add(siteRequest.getUserKey());
			}

			if(jsonObject != null) {
				Set<String> entityVars = jsonObject.fieldNames();
				for(String entityVar : entityVars) {
					switch(entityVar) {
					case SimulationReport.VAR_inheritPk:
						o2.setInheritPk(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_inheritPk + "=$" + num);
						num++;
						bParams.add(o2.sqlInheritPk());
						break;
					case SimulationReport.VAR_created:
						o2.setCreated(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_created + "=$" + num);
						num++;
						bParams.add(o2.sqlCreated());
						break;
					case SimulationReport.VAR_archived:
						o2.setArchived(jsonObject.getBoolean(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_archived + "=$" + num);
						num++;
						bParams.add(o2.sqlArchived());
						break;
					case SimulationReport.VAR_deleted:
						o2.setDeleted(jsonObject.getBoolean(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_deleted + "=$" + num);
						num++;
						bParams.add(o2.sqlDeleted());
						break;
					case SimulationReport.VAR_sessionId:
						o2.setSessionId(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_sessionId + "=$" + num);
						num++;
						bParams.add(o2.sqlSessionId());
						break;
					case SimulationReport.VAR_userKey:
						o2.setUserKey(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_userKey + "=$" + num);
						num++;
						bParams.add(o2.sqlUserKey());
						break;
					case SimulationReport.VAR_paramPedestrianWaitThresholdSecWestEast:
						o2.setParamPedestrianWaitThresholdSecWestEast(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramPedestrianWaitThresholdSecWestEast + "=$" + num);
						num++;
						bParams.add(o2.sqlParamPedestrianWaitThresholdSecWestEast());
						break;
					case SimulationReport.VAR_paramVehicleQueueThresholdWestEast:
						o2.setParamVehicleQueueThresholdWestEast(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramVehicleQueueThresholdWestEast + "=$" + num);
						num++;
						bParams.add(o2.sqlParamVehicleQueueThresholdWestEast());
						break;
					case SimulationReport.VAR_paramVehicleQueueThresholdSouthNorth:
						o2.setParamVehicleQueueThresholdSouthNorth(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramVehicleQueueThresholdSouthNorth + "=$" + num);
						num++;
						bParams.add(o2.sqlParamVehicleQueueThresholdSouthNorth());
						break;
					case SimulationReport.VAR_paramPedestrianQueueThresholdNorthSouth:
						o2.setParamPedestrianQueueThresholdNorthSouth(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramPedestrianQueueThresholdNorthSouth + "=$" + num);
						num++;
						bParams.add(o2.sqlParamPedestrianQueueThresholdNorthSouth());
						break;
					case SimulationReport.VAR_paramPedestrianQueueThresholdWestEast:
						o2.setParamPedestrianQueueThresholdWestEast(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramPedestrianQueueThresholdWestEast + "=$" + num);
						num++;
						bParams.add(o2.sqlParamPedestrianQueueThresholdWestEast());
						break;
					case SimulationReport.VAR_paramDemandScale:
						o2.setParamDemandScale(jsonObject.getJsonArray(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramDemandScale + "=$" + num);
						num++;
						bParams.add(o2.sqlParamDemandScale());
						break;
					case SimulationReport.VAR_paramStepSize:
						o2.setParamStepSize(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramStepSize + "=$" + num);
						num++;
						bParams.add(o2.sqlParamStepSize());
						break;
					case SimulationReport.VAR_paramRunTime:
						o2.setParamRunTime(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramRunTime + "=$" + num);
						num++;
						bParams.add(o2.sqlParamRunTime());
						break;
					case SimulationReport.VAR_paramItersPerPar:
						o2.setParamItersPerPar(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramItersPerPar + "=$" + num);
						num++;
						bParams.add(o2.sqlParamItersPerPar());
						break;
					case SimulationReport.VAR_paramTotalIterNum:
						o2.setParamTotalIterNum(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramTotalIterNum + "=$" + num);
						num++;
						bParams.add(o2.sqlParamTotalIterNum());
						break;
					case SimulationReport.VAR_updatedParameters:
						o2.setUpdatedParameters(jsonObject.getJsonArray(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_updatedParameters + "=$" + num);
						num++;
						bParams.add(o2.sqlUpdatedParameters());
						break;
					case SimulationReport.VAR_updatedPerformance:
						o2.setUpdatedPerformance(jsonObject.getJsonArray(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_updatedPerformance + "=$" + num);
						num++;
						bParams.add(o2.sqlUpdatedPerformance());
						break;
					case SimulationReport.VAR_averageQueueLength:
						o2.setAverageQueueLength(jsonObject.getJsonArray(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_averageQueueLength + "=$" + num);
						num++;
						bParams.add(o2.sqlAverageQueueLength());
						break;
					case SimulationReport.VAR_reportStatus:
						o2.setReportStatus(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_reportStatus + "=$" + num);
						num++;
						bParams.add(o2.sqlReportStatus());
						break;
					case SimulationReport.VAR_reportProgress:
						o2.setReportProgress(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_reportProgress + "=$" + num);
						num++;
						bParams.add(o2.sqlReportProgress());
						break;
					case SimulationReport.VAR_reportName:
						o2.setReportName(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_reportName + "=$" + num);
						num++;
						bParams.add(o2.sqlReportName());
						break;
					case SimulationReport.VAR_location:
						o2.setLocation(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_location + "=$" + num);
						num++;
						bParams.add(o2.sqlLocation());
						break;
					case SimulationReport.VAR_simulationKey:
						Optional.ofNullable(jsonObject.getString(entityVar)).ifPresent(val -> {
							futures1.add(Future.future(promise2 -> {
								search(siteRequest).query(TrafficSimulation.class, val, inheritPk).onSuccess(pk2 -> {
									if(!pks.contains(pk2)) {
										pks.add(pk2);
										classes.add("TrafficSimulation");
									}
									sql(siteRequest).update(SimulationReport.class, pk).set(SimulationReport.VAR_simulationKey, TrafficSimulation.class, pk2).onSuccess(a -> {
										promise2.complete();
									}).onFailure(ex -> {
										promise2.fail(ex);
									});
								}).onFailure(ex -> {
									promise2.fail(ex);
								});
							}));
						});
						break;
					case SimulationReport.VAR_smartTrafficLightKey:
						Optional.ofNullable(jsonObject.getString(entityVar)).ifPresent(val -> {
							futures1.add(Future.future(promise2 -> {
								search(siteRequest).query(SmartTrafficLight.class, val, inheritPk).onSuccess(pk2 -> {
									if(!pks.contains(pk2)) {
										pks.add(pk2);
										classes.add("SmartTrafficLight");
									}
									sql(siteRequest).update(SimulationReport.class, pk).set(SimulationReport.VAR_smartTrafficLightKey, SmartTrafficLight.class, pk2).onSuccess(a -> {
										promise2.complete();
									}).onFailure(ex -> {
										promise2.fail(ex);
									});
								}).onFailure(ex -> {
									promise2.fail(ex);
								});
							}));
						});
						break;
					case SimulationReport.VAR_simulationName:
						o2.setSimulationName(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_simulationName + "=$" + num);
						num++;
						bParams.add(o2.sqlSimulationName());
						break;
					case SimulationReport.VAR_smartTrafficLightId:
						o2.setSmartTrafficLightId(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_smartTrafficLightId + "=$" + num);
						num++;
						bParams.add(o2.sqlSmartTrafficLightId());
						break;
					case SimulationReport.VAR_smartTrafficLightName:
						o2.setSmartTrafficLightName(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_smartTrafficLightName + "=$" + num);
						num++;
						bParams.add(o2.sqlSmartTrafficLightName());
						break;
					case SimulationReport.VAR_paramAvgVehiclePerMinFromWestToEast:
						o2.setParamAvgVehiclePerMinFromWestToEast(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramAvgVehiclePerMinFromWestToEast + "=$" + num);
						num++;
						bParams.add(o2.sqlParamAvgVehiclePerMinFromWestToEast());
						break;
					case SimulationReport.VAR_paramAvgVehiclePerMinFromSouthToNorth:
						o2.setParamAvgVehiclePerMinFromSouthToNorth(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramAvgVehiclePerMinFromSouthToNorth + "=$" + num);
						num++;
						bParams.add(o2.sqlParamAvgVehiclePerMinFromSouthToNorth());
						break;
					case SimulationReport.VAR_paramVehicleDemandScalingFactor:
						o2.setParamVehicleDemandScalingFactor(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramVehicleDemandScalingFactor + "=$" + num);
						num++;
						bParams.add(o2.sqlParamVehicleDemandScalingFactor());
						break;
					case SimulationReport.VAR_paramAvgPedestrianPerMinFromWestToEast:
						o2.setParamAvgPedestrianPerMinFromWestToEast(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramAvgPedestrianPerMinFromWestToEast + "=$" + num);
						num++;
						bParams.add(o2.sqlParamAvgPedestrianPerMinFromWestToEast());
						break;
					case SimulationReport.VAR_paramAvgPedestrianPerMinFromSouthToNorth:
						o2.setParamAvgPedestrianPerMinFromSouthToNorth(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramAvgPedestrianPerMinFromSouthToNorth + "=$" + num);
						num++;
						bParams.add(o2.sqlParamAvgPedestrianPerMinFromSouthToNorth());
						break;
					case SimulationReport.VAR_paramPedestrianDemandScalingFactor:
						o2.setParamPedestrianDemandScalingFactor(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramPedestrianDemandScalingFactor + "=$" + num);
						num++;
						bParams.add(o2.sqlParamPedestrianDemandScalingFactor());
						break;
					case SimulationReport.VAR_paramMinGreenTimeSecWestEast:
						o2.setParamMinGreenTimeSecWestEast(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramMinGreenTimeSecWestEast + "=$" + num);
						num++;
						bParams.add(o2.sqlParamMinGreenTimeSecWestEast());
						break;
					case SimulationReport.VAR_paramMaxGreenTimeSecWestEast:
						o2.setParamMaxGreenTimeSecWestEast(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramMaxGreenTimeSecWestEast + "=$" + num);
						num++;
						bParams.add(o2.sqlParamMaxGreenTimeSecWestEast());
						break;
					case SimulationReport.VAR_paramMinGreenTimeSecSouthNorth:
						o2.setParamMinGreenTimeSecSouthNorth(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramMinGreenTimeSecSouthNorth + "=$" + num);
						num++;
						bParams.add(o2.sqlParamMinGreenTimeSecSouthNorth());
						break;
					case SimulationReport.VAR_paramMaxGreenTimeSecSouthNorth:
						o2.setParamMaxGreenTimeSecSouthNorth(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramMaxGreenTimeSecSouthNorth + "=$" + num);
						num++;
						bParams.add(o2.sqlParamMaxGreenTimeSecSouthNorth());
						break;
					case SimulationReport.VAR_paramPedestrianWaitThresholdSecNorthSouth:
						o2.setParamPedestrianWaitThresholdSecNorthSouth(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramPedestrianWaitThresholdSecNorthSouth + "=$" + num);
						num++;
						bParams.add(o2.sqlParamPedestrianWaitThresholdSecNorthSouth());
						break;
					}
				}
			}
			bSql.append(" WHERE pk=$" + num);
			if(bParams.size() > 0) {
			bParams.add(pk);
			num++;
				futures2.add(0, Future.future(a -> {
					sqlConnection.preparedQuery(bSql.toString())
							.execute(Tuple.tuple(bParams)
							).onSuccess(b -> {
						a.handle(Future.succeededFuture());
					}).onFailure(ex -> {
						RuntimeException ex2 = new RuntimeException("value SimulationReport failed", ex);
						LOG.error(String.format("relateSimulationReport failed. "), ex2);
						a.handle(Future.failedFuture(ex2));
					});
				}));
			}
			CompositeFuture.all(futures1).onSuccess(a -> {
				CompositeFuture.all(futures2).onSuccess(b -> {
					promise.complete();
				}).onFailure(ex -> {
					LOG.error(String.format("sqlPOSTSimulationReport failed. "), ex);
					promise.fail(ex);
				});
			}).onFailure(ex -> {
				LOG.error(String.format("sqlPOSTSimulationReport failed. "), ex);
				promise.fail(ex);
			});
		} catch(Exception ex) {
			LOG.error(String.format("sqlPOSTSimulationReport failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	public Future<ServiceResponse> response200POSTSimulationReport(SimulationReport o) {
		Promise<ServiceResponse> promise = Promise.promise();
		try {
			SiteRequestEnUS siteRequest = o.getSiteRequest_();
			JsonObject json = JsonObject.mapFrom(o);
			promise.complete(ServiceResponse.completedWithJson(Buffer.buffer(Optional.ofNullable(json).orElse(new JsonObject()).encodePrettily())));
		} catch(Exception ex) {
			LOG.error(String.format("response200POSTSimulationReport failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	// PUTImport //

	@Override
	public void putimportSimulationReport(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler) {
		LOG.debug(String.format("putimportSimulationReport started. "));
		user(serviceRequest, SiteRequestEnUS.class, SiteUser.class, "smartabyar-smartvillage-enUS-SiteUser", "postSiteUserFuture", "patchSiteUserFuture").onSuccess(siteRequest -> {

			authorizationProvider.getAuthorizations(siteRequest.getUser()).onFailure(ex -> {
				String msg = String.format("401 UNAUTHORIZED user %s to %s %s", siteRequest.getUser().attributes().getJsonObject("accessToken").getString("preferred_username"), serviceRequest.getExtra().getString("method"), serviceRequest.getExtra().getString("uri"));
				eventHandler.handle(Future.succeededFuture(
					new ServiceResponse(401, "UNAUTHORIZED",
						Buffer.buffer().appendString(
							new JsonObject()
								.put("errorCode", "401")
								.put("errorMessage", msg)
								.encodePrettily()
							), MultiMap.caseInsensitiveMultiMap()
					)
				));
			}).onSuccess(b -> {
				if(
						!Optional.ofNullable(config.getString(ConfigKeys.AUTH_ROLE_REQUIRED + "_SimulationReport")).map(v -> RoleBasedAuthorization.create(v).match(siteRequest.getUser())).orElse(false)
						|| !Optional.ofNullable(Optional.ofNullable(config.getString(ConfigKeys.AUTH_ROLE_READ_REQUIRED + "_SimulationReport")).orElse(config.getString(ConfigKeys.AUTH_ROLE_REQUIRED + "_SimulationReport"))).map(v -> RoleBasedAuthorization.create(v).match(siteRequest.getUser())).orElse(false)
						) {
					String msg = String.format("401 UNAUTHORIZED user %s to %s %s", siteRequest.getUser().attributes().getJsonObject("accessToken").getString("preferred_username"), serviceRequest.getExtra().getString("method"), serviceRequest.getExtra().getString("uri"));
					eventHandler.handle(Future.succeededFuture(
						new ServiceResponse(401, "UNAUTHORIZED",
							Buffer.buffer().appendString(
								new JsonObject()
									.put("errorCode", "401")
									.put("errorMessage", msg)
									.encodePrettily()
								), MultiMap.caseInsensitiveMultiMap()
						)
					));
				} else {
					try {
						ApiRequest apiRequest = new ApiRequest();
						JsonArray jsonArray = Optional.ofNullable(siteRequest.getJsonObject()).map(o -> o.getJsonArray("list")).orElse(new JsonArray());
						apiRequest.setRows(Long.valueOf(jsonArray.size()));
						apiRequest.setNumFound(Long.valueOf(jsonArray.size()));
						apiRequest.setNumPATCH(0L);
						apiRequest.initDeepApiRequest(siteRequest);
						siteRequest.setApiRequest_(apiRequest);
						eventBus.publish("websocketSimulationReport", JsonObject.mapFrom(apiRequest).toString());
						varsSimulationReport(siteRequest).onSuccess(d -> {
							listPUTImportSimulationReport(apiRequest, siteRequest).onSuccess(e -> {
								response200PUTImportSimulationReport(siteRequest).onSuccess(response -> {
									LOG.debug(String.format("putimportSimulationReport succeeded. "));
									eventHandler.handle(Future.succeededFuture(response));
								}).onFailure(ex -> {
									LOG.error(String.format("putimportSimulationReport failed. "), ex);
									error(siteRequest, eventHandler, ex);
								});
							}).onFailure(ex -> {
								LOG.error(String.format("putimportSimulationReport failed. "), ex);
								error(siteRequest, eventHandler, ex);
							});
						}).onFailure(ex -> {
							LOG.error(String.format("putimportSimulationReport failed. "), ex);
							error(siteRequest, eventHandler, ex);
						});
					} catch(Exception ex) {
						LOG.error(String.format("putimportSimulationReport failed. "), ex);
						error(null, eventHandler, ex);
					}
				}
			});
		}).onFailure(ex -> {
			if("Inactive Token".equals(ex.getMessage()) || StringUtils.startsWith(ex.getMessage(), "invalid_grant:")) {
				try {
					eventHandler.handle(Future.succeededFuture(new ServiceResponse(302, "Found", null, MultiMap.caseInsensitiveMultiMap().add(HttpHeaders.LOCATION, "/logout?redirect_uri=" + URLEncoder.encode(serviceRequest.getExtra().getString("uri"), "UTF-8")))));
				} catch(Exception ex2) {
					LOG.error(String.format("putimportSimulationReport failed. ", ex2));
					error(null, eventHandler, ex2);
				}
			} else if(StringUtils.startsWith(ex.getMessage(), "401 UNAUTHORIZED ")) {
				eventHandler.handle(Future.succeededFuture(
					new ServiceResponse(401, "UNAUTHORIZED",
						Buffer.buffer().appendString(
							new JsonObject()
								.put("errorCode", "401")
								.put("errorMessage", "SSO Resource Permission check returned DENY")
								.encodePrettily()
							), MultiMap.caseInsensitiveMultiMap()
							)
					));
			} else {
				LOG.error(String.format("putimportSimulationReport failed. "), ex);
				error(null, eventHandler, ex);
			}
		});
	}


	public Future<Void> listPUTImportSimulationReport(ApiRequest apiRequest, SiteRequestEnUS siteRequest) {
		Promise<Void> promise = Promise.promise();
		List<Future> futures = new ArrayList<>();
		JsonArray jsonArray = Optional.ofNullable(siteRequest.getJsonObject()).map(o -> o.getJsonArray("list")).orElse(new JsonArray());
		try {
			jsonArray.forEach(obj -> {
				futures.add(Future.future(promise1 -> {
					JsonObject params = new JsonObject();
					params.put("body", obj);
					params.put("path", new JsonObject());
					params.put("cookie", new JsonObject());
					params.put("header", new JsonObject());
					params.put("form", new JsonObject());
					JsonObject query = new JsonObject();
					Boolean softCommit = Optional.ofNullable(siteRequest.getServiceRequest().getParams()).map(p -> p.getJsonObject("query")).map( q -> q.getBoolean("softCommit")).orElse(null);
					Integer commitWithin = Optional.ofNullable(siteRequest.getServiceRequest().getParams()).map(p -> p.getJsonObject("query")).map( q -> q.getInteger("commitWithin")).orElse(null);
					if(softCommit == null && commitWithin == null)
						softCommit = true;
					if(softCommit != null)
						query.put("softCommit", softCommit);
					if(commitWithin != null)
						query.put("commitWithin", commitWithin);
					params.put("query", query);
					JsonObject context = new JsonObject().put("params", params).put("user", siteRequest.getUserPrincipal());
					JsonObject json = new JsonObject().put("context", context);
					eventBus.request("smartabyar-smartvillage-enUS-SimulationReport", json, new DeliveryOptions().addHeader("action", "putimportSimulationReportFuture")).onSuccess(a -> {
						promise1.complete();
					}).onFailure(ex -> {
						LOG.error(String.format("listPUTImportSimulationReport failed. "), ex);
						promise1.fail(ex);
					});
				}));
			});
			CompositeFuture.all(futures).onSuccess(a -> {
				apiRequest.setNumPATCH(apiRequest.getNumPATCH() + 1);
				promise.complete();
			}).onFailure(ex -> {
				LOG.error(String.format("listPUTImportSimulationReport failed. "), ex);
				promise.fail(ex);
			});
		} catch(Exception ex) {
			LOG.error(String.format("listPUTImportSimulationReport failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	@Override
	public void putimportSimulationReportFuture(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler) {
		user(serviceRequest, SiteRequestEnUS.class, SiteUser.class, "smartabyar-smartvillage-enUS-SiteUser", "postSiteUserFuture", "patchSiteUserFuture").onSuccess(siteRequest -> {
			try {
				ApiRequest apiRequest = new ApiRequest();
				apiRequest.setRows(1L);
				apiRequest.setNumFound(1L);
				apiRequest.setNumPATCH(0L);
				apiRequest.initDeepApiRequest(siteRequest);
				siteRequest.setApiRequest_(apiRequest);
				String inheritPk = Optional.ofNullable(body.getString(SimulationReport.VAR_pk)).orElse(body.getString(SimulationReport.VAR_id));
				body.put("inheritPk", inheritPk);
				if(Optional.ofNullable(serviceRequest.getParams()).map(p -> p.getJsonObject("query")).map( q -> q.getJsonArray("var")).orElse(new JsonArray()).stream().filter(s -> "refresh:false".equals(s)).count() > 0L) {
					siteRequest.getRequestVars().put( "refresh", "false" );
				}

				SearchList<SimulationReport> searchList = new SearchList<SimulationReport>();
				searchList.setStore(true);
				searchList.q("*:*");
				searchList.setC(SimulationReport.class);
				searchList.fq("deleted_docvalues_boolean:false");
				searchList.fq("archived_docvalues_boolean:false");
				searchList.fq("inheritPk_docvalues_string:" + SearchTool.escapeQueryChars(inheritPk));
				searchList.promiseDeepForClass(siteRequest).onSuccess(a -> {
					try {
						if(searchList.size() >= 1) {
							SimulationReport o = searchList.getList().stream().findFirst().orElse(null);
							SimulationReport o2 = new SimulationReport();
							o2.setSiteRequest_(siteRequest);
							JsonObject body2 = new JsonObject();
							for(String f : body.fieldNames()) {
								Object bodyVal = body.getValue(f);
								if(bodyVal instanceof JsonArray) {
									JsonArray bodyVals = (JsonArray)bodyVal;
									Collection<?> vals = (Collection<?>)o.obtainForClass(f);
									if(bodyVals.size() == vals.size()) {
										Boolean match = true;
										for(Object val : vals) {
											if(val != null) {
												if(!bodyVals.contains(val.toString())) {
													match = false;
													break;
												}
											} else {
												match = false;
												break;
											}
										}
										vals.clear();
										body2.put("set" + StringUtils.capitalize(f), bodyVal);
									} else {
										vals.clear();
										body2.put("set" + StringUtils.capitalize(f), bodyVal);
									}
								} else {
									o2.persistForClass(f, bodyVal);
									o2.relateForClass(f, bodyVal);
									if(!StringUtils.containsAny(f, "pk", "created", "setCreated") && !Objects.equals(o.obtainForClass(f), o2.obtainForClass(f)))
										body2.put("set" + StringUtils.capitalize(f), bodyVal);
								}
							}
							for(String f : Optional.ofNullable(o.getSaves()).orElse(new ArrayList<>())) {
								if(!body.fieldNames().contains(f)) {
									if(!StringUtils.containsAny(f, "pk", "created", "setCreated") && !Objects.equals(o.obtainForClass(f), o2.obtainForClass(f)))
										body2.putNull("set" + StringUtils.capitalize(f));
								}
							}
							if(body2.size() > 0) {
								siteRequest.setJsonObject(body2);
								patchSimulationReportFuture(o, true).onSuccess(b -> {
									LOG.debug("Import SimulationReport {} succeeded, modified SimulationReport. ", body.getValue(SimulationReport.VAR_pk));
									eventHandler.handle(Future.succeededFuture());
								}).onFailure(ex -> {
									LOG.error(String.format("putimportSimulationReportFuture failed. "), ex);
									eventHandler.handle(Future.failedFuture(ex));
								});
							} else {
								eventHandler.handle(Future.succeededFuture());
							}
						} else {
							postSimulationReportFuture(siteRequest, true).onSuccess(b -> {
								LOG.debug("Import SimulationReport {} succeeded, created new SimulationReport. ", body.getValue(SimulationReport.VAR_pk));
								eventHandler.handle(Future.succeededFuture());
							}).onFailure(ex -> {
								LOG.error(String.format("putimportSimulationReportFuture failed. "), ex);
								eventHandler.handle(Future.failedFuture(ex));
							});
						}
					} catch(Exception ex) {
						LOG.error(String.format("putimportSimulationReportFuture failed. "), ex);
						eventHandler.handle(Future.failedFuture(ex));
					}
				}).onFailure(ex -> {
					LOG.error(String.format("putimportSimulationReportFuture failed. "), ex);
					eventHandler.handle(Future.failedFuture(ex));
				});
			} catch(Exception ex) {
				LOG.error(String.format("putimportSimulationReportFuture failed. "), ex);
				eventHandler.handle(Future.failedFuture(ex));
			}
		}).onFailure(ex -> {
			if("Inactive Token".equals(ex.getMessage()) || StringUtils.startsWith(ex.getMessage(), "invalid_grant:")) {
				try {
					eventHandler.handle(Future.succeededFuture(new ServiceResponse(302, "Found", null, MultiMap.caseInsensitiveMultiMap().add(HttpHeaders.LOCATION, "/logout?redirect_uri=" + URLEncoder.encode(serviceRequest.getExtra().getString("uri"), "UTF-8")))));
				} catch(Exception ex2) {
					LOG.error(String.format("putimportSimulationReport failed. ", ex2));
					error(null, eventHandler, ex2);
				}
			} else if(StringUtils.startsWith(ex.getMessage(), "401 UNAUTHORIZED ")) {
				eventHandler.handle(Future.succeededFuture(
					new ServiceResponse(401, "UNAUTHORIZED",
						Buffer.buffer().appendString(
							new JsonObject()
								.put("errorCode", "401")
								.put("errorMessage", "SSO Resource Permission check returned DENY")
								.encodePrettily()
							), MultiMap.caseInsensitiveMultiMap()
							)
					));
			} else {
				LOG.error(String.format("putimportSimulationReport failed. "), ex);
				error(null, eventHandler, ex);
			}
		});
	}

	public Future<ServiceResponse> response200PUTImportSimulationReport(SiteRequestEnUS siteRequest) {
		Promise<ServiceResponse> promise = Promise.promise();
		try {
			JsonObject json = new JsonObject();
			promise.complete(ServiceResponse.completedWithJson(Buffer.buffer(Optional.ofNullable(json).orElse(new JsonObject()).encodePrettily())));
		} catch(Exception ex) {
			LOG.error(String.format("response200PUTImportSimulationReport failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	// PUTCopy //

	@Override
	public void putcopySimulationReport(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler) {
		LOG.debug(String.format("putcopySimulationReport started. "));
		user(serviceRequest, SiteRequestEnUS.class, SiteUser.class, "smartabyar-smartvillage-enUS-SiteUser", "postSiteUserFuture", "patchSiteUserFuture").onSuccess(siteRequest -> {

			authorizationProvider.getAuthorizations(siteRequest.getUser()).onFailure(ex -> {
				String msg = String.format("401 UNAUTHORIZED user %s to %s %s", siteRequest.getUser().attributes().getJsonObject("accessToken").getString("preferred_username"), serviceRequest.getExtra().getString("method"), serviceRequest.getExtra().getString("uri"));
				eventHandler.handle(Future.succeededFuture(
					new ServiceResponse(401, "UNAUTHORIZED",
						Buffer.buffer().appendString(
							new JsonObject()
								.put("errorCode", "401")
								.put("errorMessage", msg)
								.encodePrettily()
							), MultiMap.caseInsensitiveMultiMap()
					)
				));
			}).onSuccess(b -> {
				if(
						!Optional.ofNullable(config.getString(ConfigKeys.AUTH_ROLE_REQUIRED + "_SimulationReport")).map(v -> RoleBasedAuthorization.create(v).match(siteRequest.getUser())).orElse(false)
						|| !Optional.ofNullable(Optional.ofNullable(config.getString(ConfigKeys.AUTH_ROLE_READ_REQUIRED + "_SimulationReport")).orElse(config.getString(ConfigKeys.AUTH_ROLE_REQUIRED + "_SimulationReport"))).map(v -> RoleBasedAuthorization.create(v).match(siteRequest.getUser())).orElse(false)
						) {
					String msg = String.format("401 UNAUTHORIZED user %s to %s %s", siteRequest.getUser().attributes().getJsonObject("accessToken").getString("preferred_username"), serviceRequest.getExtra().getString("method"), serviceRequest.getExtra().getString("uri"));
					eventHandler.handle(Future.succeededFuture(
						new ServiceResponse(401, "UNAUTHORIZED",
							Buffer.buffer().appendString(
								new JsonObject()
									.put("errorCode", "401")
									.put("errorMessage", msg)
									.encodePrettily()
								), MultiMap.caseInsensitiveMultiMap()
						)
					));
				} else {
					try {
						searchSimulationReportList(siteRequest, false, true, true).onSuccess(listSimulationReport -> {
							ApiRequest apiRequest = new ApiRequest();
							apiRequest.setRows(listSimulationReport.getRequest().getRows());
							apiRequest.setNumFound(listSimulationReport.getResponse().getResponse().getNumFound());
							apiRequest.setNumPATCH(0L);
							apiRequest.initDeepApiRequest(siteRequest);
							siteRequest.setApiRequest_(apiRequest);
							eventBus.publish("websocketSimulationReport", JsonObject.mapFrom(apiRequest).toString());
							listPUTCopySimulationReport(apiRequest, listSimulationReport).onSuccess(o -> {
								response200PUTCopySimulationReport(o).onSuccess(response -> {
									LOG.debug(String.format("putcopySimulationReport succeeded. "));
									eventHandler.handle(Future.succeededFuture(response));
								}).onFailure(ex -> {
									LOG.error(String.format("putcopySimulationReport failed. "), ex);
									error(siteRequest, eventHandler, ex);
								});
							}).onFailure(ex -> {
								LOG.error(String.format("putcopySimulationReport failed. "), ex);
								error(siteRequest, eventHandler, ex);
							});
						}).onFailure(ex -> {
							LOG.error(String.format("putcopySimulationReport failed. "), ex);
							error(siteRequest, eventHandler, ex);
						});
					} catch(Exception ex) {
						LOG.error(String.format("putcopySimulationReport failed. "), ex);
						error(null, eventHandler, ex);
					}
				}
			});
		}).onFailure(ex -> {
			if("Inactive Token".equals(ex.getMessage()) || StringUtils.startsWith(ex.getMessage(), "invalid_grant:")) {
				try {
					eventHandler.handle(Future.succeededFuture(new ServiceResponse(302, "Found", null, MultiMap.caseInsensitiveMultiMap().add(HttpHeaders.LOCATION, "/logout?redirect_uri=" + URLEncoder.encode(serviceRequest.getExtra().getString("uri"), "UTF-8")))));
				} catch(Exception ex2) {
					LOG.error(String.format("putcopySimulationReport failed. ", ex2));
					error(null, eventHandler, ex2);
				}
			} else if(StringUtils.startsWith(ex.getMessage(), "401 UNAUTHORIZED ")) {
				eventHandler.handle(Future.succeededFuture(
					new ServiceResponse(401, "UNAUTHORIZED",
						Buffer.buffer().appendString(
							new JsonObject()
								.put("errorCode", "401")
								.put("errorMessage", "SSO Resource Permission check returned DENY")
								.encodePrettily()
							), MultiMap.caseInsensitiveMultiMap()
							)
					));
			} else {
				LOG.error(String.format("putcopySimulationReport failed. "), ex);
				error(null, eventHandler, ex);
			}
		});
	}


	public Future<SimulationReport> listPUTCopySimulationReport(ApiRequest apiRequest, SearchList<SimulationReport> listSimulationReport) {
		Promise<SimulationReport> promise = Promise.promise();
		if(listSimulationReport.getSize() == 1) {
			SiteRequestEnUS siteRequest = listSimulationReport.getSiteRequest_(SiteRequestEnUS.class);
			SiteRequestEnUS siteRequest2 = siteRequest.copy();
			siteRequest2.setApiRequest_(siteRequest.getApiRequest_());
			SimulationReport o = listSimulationReport.first();
			o.setSiteRequest_(siteRequest2);
			putcopySimulationReportFuture(siteRequest2, JsonObject.mapFrom(o)).onSuccess(o2 -> {
				apiRequest.setNumPATCH(apiRequest.getNumPATCH() + listSimulationReport.size());
				promise.complete(o2);
			}).onFailure(ex -> {
				LOG.error(String.format("listPUTCopySimulationReport failed. "), ex);
				error(listSimulationReport.getSiteRequest_(SiteRequestEnUS.class), null, ex);
			});
		} else {
			List<Future> futures = new ArrayList<>();
			SiteRequestEnUS siteRequest = listSimulationReport.getSiteRequest_(SiteRequestEnUS.class);
			listSimulationReport.getList().forEach(o -> {
				SiteRequestEnUS siteRequest2 = siteRequest.copy();
				siteRequest2.setApiRequest_(siteRequest.getApiRequest_());
				o.setSiteRequest_(siteRequest2);
				futures.add(
					putcopySimulationReportFuture(siteRequest2, JsonObject.mapFrom(o)).onFailure(ex -> {
						LOG.error(String.format("listPUTCopySimulationReport failed. "), ex);
						error(siteRequest, null, ex);
					})
				);
			});
			CompositeFuture.all(futures).onSuccess(a -> {
				apiRequest.setNumPATCH(apiRequest.getNumPATCH() + listSimulationReport.size());
				listSimulationReport.next().onSuccess(next -> {
					if(next) {
						listPUTCopySimulationReport(apiRequest, listSimulationReport).onSuccess(b -> {
							promise.complete();
						}).onFailure(ex -> {
							LOG.error(String.format("listPUTCopySimulationReport failed. "), ex);
							promise.fail(ex);
						});
					} else {
						promise.complete();
					}
				}).onFailure(ex -> {
					LOG.error(String.format("listPUTCopySimulationReport failed. "), ex);
					error(listSimulationReport.getSiteRequest_(SiteRequestEnUS.class), null, ex);
				});
			}).onFailure(ex -> {
				LOG.error(String.format("listPUTCopySimulationReport failed. "), ex);
				error(listSimulationReport.getSiteRequest_(SiteRequestEnUS.class), null, ex);
			});
		}
		return promise.future();
	}

	public Future<SimulationReport> putcopySimulationReportFuture(SiteRequestEnUS siteRequest, JsonObject jsonObject) {
		Promise<SimulationReport> promise = Promise.promise();

		try {

			jsonObject.put("saves", Optional.ofNullable(jsonObject.getJsonArray("saves")).orElse(new JsonArray()));
			JsonObject jsonPatch = Optional.ofNullable(siteRequest.getJsonObject()).map(o -> o.getJsonObject("patch")).orElse(new JsonObject());
			jsonPatch.stream().forEach(o -> {
				if(o.getValue() == null)
					jsonObject.remove(o.getKey());
				else
					jsonObject.put(o.getKey(), o.getValue());
				if(!jsonObject.getJsonArray("saves").contains(o.getKey()))
					jsonObject.getJsonArray("saves").add(o.getKey());
			});

			pgPool.withTransaction(sqlConnection -> {
				Promise<SimulationReport> promise1 = Promise.promise();
				siteRequest.setSqlConnection(sqlConnection);
				createSimulationReport(siteRequest).onSuccess(simulationReport -> {
					sqlPUTCopySimulationReport(simulationReport, jsonObject).onSuccess(b -> {
						persistSimulationReport(simulationReport).onSuccess(c -> {
							relateSimulationReport(simulationReport).onSuccess(d -> {
								indexSimulationReport(simulationReport).onSuccess(o2 -> {
									promise1.complete(simulationReport);
								}).onFailure(ex -> {
									promise1.fail(ex);
								});
							}).onFailure(ex -> {
								promise1.fail(ex);
							});
						}).onFailure(ex -> {
							promise1.fail(ex);
						});
					}).onFailure(ex -> {
						promise1.fail(ex);
					});
				}).onFailure(ex -> {
					promise1.fail(ex);
				});
				return promise1.future();
			}).onSuccess(a -> {
				siteRequest.setSqlConnection(null);
			}).onFailure(ex -> {
				siteRequest.setSqlConnection(null);
				promise.fail(ex);
			}).compose(simulationReport -> {
				Promise<SimulationReport> promise2 = Promise.promise();
				refreshSimulationReport(simulationReport).onSuccess(a -> {
					try {
						ApiRequest apiRequest = siteRequest.getApiRequest_();
						if(apiRequest != null) {
							apiRequest.setNumPATCH(apiRequest.getNumPATCH() + 1);
							simulationReport.apiRequestSimulationReport();
							eventBus.publish("websocketSimulationReport", JsonObject.mapFrom(apiRequest).toString());
						}
						promise2.complete(simulationReport);
					} catch(Exception ex) {
						LOG.error(String.format("putcopySimulationReportFuture failed. "), ex);
						promise.fail(ex);
					}
				}).onFailure(ex -> {
					promise2.fail(ex);
				});
				return promise2.future();
			}).onSuccess(simulationReport -> {
				promise.complete(simulationReport);
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		} catch(Exception ex) {
			LOG.error(String.format("putcopySimulationReportFuture failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	public Future<Void> sqlPUTCopySimulationReport(SimulationReport o, JsonObject jsonObject) {
		Promise<Void> promise = Promise.promise();
		try {
			SiteRequestEnUS siteRequest = o.getSiteRequest_();
			ApiRequest apiRequest = siteRequest.getApiRequest_();
			List<Long> pks = Optional.ofNullable(apiRequest).map(r -> r.getPks()).orElse(new ArrayList<>());
			List<String> classes = Optional.ofNullable(apiRequest).map(r -> r.getClasses()).orElse(new ArrayList<>());
			SqlConnection sqlConnection = siteRequest.getSqlConnection();
			Integer num = 1;
			StringBuilder bSql = new StringBuilder("UPDATE SimulationReport SET ");
			List<Object> bParams = new ArrayList<Object>();
			SimulationReport o2 = new SimulationReport();
			o2.setSiteRequest_(siteRequest);
			Long pk = o.getPk();
			List<Future> futures1 = new ArrayList<>();
			List<Future> futures2 = new ArrayList<>();

			if(jsonObject != null) {
				JsonArray entityVars = jsonObject.getJsonArray("saves");
				for(Integer i = 0; i < entityVars.size(); i++) {
					String entityVar = entityVars.getString(i);
					switch(entityVar) {
					case SimulationReport.VAR_inheritPk:
						o2.setInheritPk(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_inheritPk + "=$" + num);
						num++;
						bParams.add(o2.sqlInheritPk());
						break;
					case SimulationReport.VAR_created:
						o2.setCreated(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_created + "=$" + num);
						num++;
						bParams.add(o2.sqlCreated());
						break;
					case SimulationReport.VAR_archived:
						o2.setArchived(jsonObject.getBoolean(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_archived + "=$" + num);
						num++;
						bParams.add(o2.sqlArchived());
						break;
					case SimulationReport.VAR_deleted:
						o2.setDeleted(jsonObject.getBoolean(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_deleted + "=$" + num);
						num++;
						bParams.add(o2.sqlDeleted());
						break;
					case SimulationReport.VAR_sessionId:
						o2.setSessionId(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_sessionId + "=$" + num);
						num++;
						bParams.add(o2.sqlSessionId());
						break;
					case SimulationReport.VAR_userKey:
						o2.setUserKey(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_userKey + "=$" + num);
						num++;
						bParams.add(o2.sqlUserKey());
						break;
					case SimulationReport.VAR_paramPedestrianWaitThresholdSecWestEast:
						o2.setParamPedestrianWaitThresholdSecWestEast(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramPedestrianWaitThresholdSecWestEast + "=$" + num);
						num++;
						bParams.add(o2.sqlParamPedestrianWaitThresholdSecWestEast());
						break;
					case SimulationReport.VAR_paramVehicleQueueThresholdWestEast:
						o2.setParamVehicleQueueThresholdWestEast(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramVehicleQueueThresholdWestEast + "=$" + num);
						num++;
						bParams.add(o2.sqlParamVehicleQueueThresholdWestEast());
						break;
					case SimulationReport.VAR_paramVehicleQueueThresholdSouthNorth:
						o2.setParamVehicleQueueThresholdSouthNorth(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramVehicleQueueThresholdSouthNorth + "=$" + num);
						num++;
						bParams.add(o2.sqlParamVehicleQueueThresholdSouthNorth());
						break;
					case SimulationReport.VAR_paramPedestrianQueueThresholdNorthSouth:
						o2.setParamPedestrianQueueThresholdNorthSouth(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramPedestrianQueueThresholdNorthSouth + "=$" + num);
						num++;
						bParams.add(o2.sqlParamPedestrianQueueThresholdNorthSouth());
						break;
					case SimulationReport.VAR_paramPedestrianQueueThresholdWestEast:
						o2.setParamPedestrianQueueThresholdWestEast(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramPedestrianQueueThresholdWestEast + "=$" + num);
						num++;
						bParams.add(o2.sqlParamPedestrianQueueThresholdWestEast());
						break;
					case SimulationReport.VAR_paramDemandScale:
						o2.setParamDemandScale(jsonObject.getJsonArray(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramDemandScale + "=$" + num);
						num++;
						bParams.add(o2.sqlParamDemandScale());
						break;
					case SimulationReport.VAR_paramStepSize:
						o2.setParamStepSize(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramStepSize + "=$" + num);
						num++;
						bParams.add(o2.sqlParamStepSize());
						break;
					case SimulationReport.VAR_paramRunTime:
						o2.setParamRunTime(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramRunTime + "=$" + num);
						num++;
						bParams.add(o2.sqlParamRunTime());
						break;
					case SimulationReport.VAR_paramItersPerPar:
						o2.setParamItersPerPar(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramItersPerPar + "=$" + num);
						num++;
						bParams.add(o2.sqlParamItersPerPar());
						break;
					case SimulationReport.VAR_paramTotalIterNum:
						o2.setParamTotalIterNum(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramTotalIterNum + "=$" + num);
						num++;
						bParams.add(o2.sqlParamTotalIterNum());
						break;
					case SimulationReport.VAR_updatedParameters:
						o2.setUpdatedParameters(jsonObject.getJsonArray(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_updatedParameters + "=$" + num);
						num++;
						bParams.add(o2.sqlUpdatedParameters());
						break;
					case SimulationReport.VAR_updatedPerformance:
						o2.setUpdatedPerformance(jsonObject.getJsonArray(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_updatedPerformance + "=$" + num);
						num++;
						bParams.add(o2.sqlUpdatedPerformance());
						break;
					case SimulationReport.VAR_averageQueueLength:
						o2.setAverageQueueLength(jsonObject.getJsonArray(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_averageQueueLength + "=$" + num);
						num++;
						bParams.add(o2.sqlAverageQueueLength());
						break;
					case SimulationReport.VAR_reportStatus:
						o2.setReportStatus(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_reportStatus + "=$" + num);
						num++;
						bParams.add(o2.sqlReportStatus());
						break;
					case SimulationReport.VAR_reportProgress:
						o2.setReportProgress(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_reportProgress + "=$" + num);
						num++;
						bParams.add(o2.sqlReportProgress());
						break;
					case SimulationReport.VAR_reportName:
						o2.setReportName(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_reportName + "=$" + num);
						num++;
						bParams.add(o2.sqlReportName());
						break;
					case SimulationReport.VAR_location:
						o2.setLocation(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_location + "=$" + num);
						num++;
						bParams.add(o2.sqlLocation());
						break;
					case SimulationReport.VAR_simulationKey:
						Optional.ofNullable(jsonObject.getString(entityVar)).ifPresent(val -> {
							futures1.add(Future.future(promise2 -> {
								search(siteRequest).query(TrafficSimulation.class, val, false).onSuccess(pk2 -> {
									if(!pks.contains(pk2)) {
										pks.add(pk2);
										classes.add("TrafficSimulation");
									}
									sql(siteRequest).update(SimulationReport.class, pk).set(SimulationReport.VAR_simulationKey, TrafficSimulation.class, pk2).onSuccess(a -> {
										promise2.complete();
									}).onFailure(ex -> {
										promise2.fail(ex);
									});
								}).onFailure(ex -> {
									promise2.fail(ex);
								});
							}));
						});
						break;
					case SimulationReport.VAR_smartTrafficLightKey:
						Optional.ofNullable(jsonObject.getString(entityVar)).ifPresent(val -> {
							futures1.add(Future.future(promise2 -> {
								search(siteRequest).query(SmartTrafficLight.class, val, false).onSuccess(pk2 -> {
									if(!pks.contains(pk2)) {
										pks.add(pk2);
										classes.add("SmartTrafficLight");
									}
									sql(siteRequest).update(SimulationReport.class, pk).set(SimulationReport.VAR_smartTrafficLightKey, SmartTrafficLight.class, pk2).onSuccess(a -> {
										promise2.complete();
									}).onFailure(ex -> {
										promise2.fail(ex);
									});
								}).onFailure(ex -> {
									promise2.fail(ex);
								});
							}));
						});
						break;
					case SimulationReport.VAR_simulationName:
						o2.setSimulationName(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_simulationName + "=$" + num);
						num++;
						bParams.add(o2.sqlSimulationName());
						break;
					case SimulationReport.VAR_smartTrafficLightId:
						o2.setSmartTrafficLightId(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_smartTrafficLightId + "=$" + num);
						num++;
						bParams.add(o2.sqlSmartTrafficLightId());
						break;
					case SimulationReport.VAR_smartTrafficLightName:
						o2.setSmartTrafficLightName(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_smartTrafficLightName + "=$" + num);
						num++;
						bParams.add(o2.sqlSmartTrafficLightName());
						break;
					case SimulationReport.VAR_paramAvgVehiclePerMinFromWestToEast:
						o2.setParamAvgVehiclePerMinFromWestToEast(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramAvgVehiclePerMinFromWestToEast + "=$" + num);
						num++;
						bParams.add(o2.sqlParamAvgVehiclePerMinFromWestToEast());
						break;
					case SimulationReport.VAR_paramAvgVehiclePerMinFromSouthToNorth:
						o2.setParamAvgVehiclePerMinFromSouthToNorth(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramAvgVehiclePerMinFromSouthToNorth + "=$" + num);
						num++;
						bParams.add(o2.sqlParamAvgVehiclePerMinFromSouthToNorth());
						break;
					case SimulationReport.VAR_paramVehicleDemandScalingFactor:
						o2.setParamVehicleDemandScalingFactor(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramVehicleDemandScalingFactor + "=$" + num);
						num++;
						bParams.add(o2.sqlParamVehicleDemandScalingFactor());
						break;
					case SimulationReport.VAR_paramAvgPedestrianPerMinFromWestToEast:
						o2.setParamAvgPedestrianPerMinFromWestToEast(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramAvgPedestrianPerMinFromWestToEast + "=$" + num);
						num++;
						bParams.add(o2.sqlParamAvgPedestrianPerMinFromWestToEast());
						break;
					case SimulationReport.VAR_paramAvgPedestrianPerMinFromSouthToNorth:
						o2.setParamAvgPedestrianPerMinFromSouthToNorth(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramAvgPedestrianPerMinFromSouthToNorth + "=$" + num);
						num++;
						bParams.add(o2.sqlParamAvgPedestrianPerMinFromSouthToNorth());
						break;
					case SimulationReport.VAR_paramPedestrianDemandScalingFactor:
						o2.setParamPedestrianDemandScalingFactor(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramPedestrianDemandScalingFactor + "=$" + num);
						num++;
						bParams.add(o2.sqlParamPedestrianDemandScalingFactor());
						break;
					case SimulationReport.VAR_paramMinGreenTimeSecWestEast:
						o2.setParamMinGreenTimeSecWestEast(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramMinGreenTimeSecWestEast + "=$" + num);
						num++;
						bParams.add(o2.sqlParamMinGreenTimeSecWestEast());
						break;
					case SimulationReport.VAR_paramMaxGreenTimeSecWestEast:
						o2.setParamMaxGreenTimeSecWestEast(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramMaxGreenTimeSecWestEast + "=$" + num);
						num++;
						bParams.add(o2.sqlParamMaxGreenTimeSecWestEast());
						break;
					case SimulationReport.VAR_paramMinGreenTimeSecSouthNorth:
						o2.setParamMinGreenTimeSecSouthNorth(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramMinGreenTimeSecSouthNorth + "=$" + num);
						num++;
						bParams.add(o2.sqlParamMinGreenTimeSecSouthNorth());
						break;
					case SimulationReport.VAR_paramMaxGreenTimeSecSouthNorth:
						o2.setParamMaxGreenTimeSecSouthNorth(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramMaxGreenTimeSecSouthNorth + "=$" + num);
						num++;
						bParams.add(o2.sqlParamMaxGreenTimeSecSouthNorth());
						break;
					case SimulationReport.VAR_paramPedestrianWaitThresholdSecNorthSouth:
						o2.setParamPedestrianWaitThresholdSecNorthSouth(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SimulationReport.VAR_paramPedestrianWaitThresholdSecNorthSouth + "=$" + num);
						num++;
						bParams.add(o2.sqlParamPedestrianWaitThresholdSecNorthSouth());
						break;
					}
				}
			}
			bSql.append(" WHERE pk=$" + num);
			if(bParams.size() > 0) {
			bParams.add(pk);
			num++;
				futures2.add(0, Future.future(a -> {
					sqlConnection.preparedQuery(bSql.toString())
							.execute(Tuple.tuple(bParams)
							).onSuccess(b -> {
						a.handle(Future.succeededFuture());
					}).onFailure(ex -> {
						RuntimeException ex2 = new RuntimeException("value SimulationReport failed", ex);
						LOG.error(String.format("relateSimulationReport failed. "), ex2);
						a.handle(Future.failedFuture(ex2));
					});
				}));
			}
			CompositeFuture.all(futures1).onSuccess(a -> {
				CompositeFuture.all(futures2).onSuccess(b -> {
					promise.complete();
				}).onFailure(ex -> {
					LOG.error(String.format("sqlPUTCopySimulationReport failed. "), ex);
					promise.fail(ex);
				});
			}).onFailure(ex -> {
				LOG.error(String.format("sqlPUTCopySimulationReport failed. "), ex);
				promise.fail(ex);
			});
		} catch(Exception ex) {
			LOG.error(String.format("sqlPUTCopySimulationReport failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	public Future<ServiceResponse> response200PUTCopySimulationReport(SimulationReport o) {
		Promise<ServiceResponse> promise = Promise.promise();
		try {
			JsonObject json = JsonObject.mapFrom(o);
			promise.complete(ServiceResponse.completedWithJson(Buffer.buffer(Optional.ofNullable(json).orElse(new JsonObject()).encodePrettily())));
		} catch(Exception ex) {
			LOG.error(String.format("response200PUTCopySimulationReport failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	// PATCHRunSimulation //

	@Override
	public void patchrunsimulationSimulationReport(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler) {
		LOG.debug(String.format("patchrunsimulationSimulationReport started. "));
		user(serviceRequest, SiteRequestEnUS.class, SiteUser.class, "smartabyar-smartvillage-enUS-SiteUser", "postSiteUserFuture", "patchSiteUserFuture").onSuccess(siteRequest -> {

			authorizationProvider.getAuthorizations(siteRequest.getUser()).onFailure(ex -> {
				String msg = String.format("401 UNAUTHORIZED user %s to %s %s", siteRequest.getUser().attributes().getJsonObject("accessToken").getString("preferred_username"), serviceRequest.getExtra().getString("method"), serviceRequest.getExtra().getString("uri"));
				eventHandler.handle(Future.succeededFuture(
					new ServiceResponse(401, "UNAUTHORIZED",
						Buffer.buffer().appendString(
							new JsonObject()
								.put("errorCode", "401")
								.put("errorMessage", msg)
								.encodePrettily()
							), MultiMap.caseInsensitiveMultiMap()
					)
				));
			}).onSuccess(b -> {
				if(
						!Optional.ofNullable(config.getString(ConfigKeys.AUTH_ROLE_REQUIRED + "_SimulationReport")).map(v -> RoleBasedAuthorization.create(v).match(siteRequest.getUser())).orElse(false)
						|| !Optional.ofNullable(Optional.ofNullable(config.getString(ConfigKeys.AUTH_ROLE_READ_REQUIRED + "_SimulationReport")).orElse(config.getString(ConfigKeys.AUTH_ROLE_REQUIRED + "_SimulationReport"))).map(v -> RoleBasedAuthorization.create(v).match(siteRequest.getUser())).orElse(false)
						) {
					String msg = String.format("401 UNAUTHORIZED user %s to %s %s", siteRequest.getUser().attributes().getJsonObject("accessToken").getString("preferred_username"), serviceRequest.getExtra().getString("method"), serviceRequest.getExtra().getString("uri"));
					eventHandler.handle(Future.succeededFuture(
						new ServiceResponse(401, "UNAUTHORIZED",
							Buffer.buffer().appendString(
								new JsonObject()
									.put("errorCode", "401")
									.put("errorMessage", msg)
									.encodePrettily()
								), MultiMap.caseInsensitiveMultiMap()
						)
					));
				} else {
					try {
						searchSimulationReportList(siteRequest, false, true, true).onSuccess(listSimulationReport -> {
							try {
								if(listSimulationReport.getResponse().getResponse().getNumFound() > 1
										&& !Optional.ofNullable(config.getString(ConfigKeys.AUTH_ROLE_REQUIRED + "_SimulationReport")).map(v -> RoleBasedAuthorization.create(v).match(siteRequest.getUser())).orElse(false)
										) {
									String message = String.format("roles required: " + config.getString(ConfigKeys.AUTH_ROLE_REQUIRED + "_SimulationReport"));
									LOG.error(message);
									error(siteRequest, eventHandler, new RuntimeException(message));
								} else {

									ApiRequest apiRequest = new ApiRequest();
									apiRequest.setRows(listSimulationReport.getRequest().getRows());
									apiRequest.setNumFound(listSimulationReport.getResponse().getResponse().getNumFound());
									apiRequest.setNumPATCH(0L);
									apiRequest.initDeepApiRequest(siteRequest);
									siteRequest.setApiRequest_(apiRequest);
									if(apiRequest.getNumFound() == 1L)
										apiRequest.setOriginal(listSimulationReport.first());
									apiRequest.setPk(Optional.ofNullable(listSimulationReport.first()).map(o2 -> o2.getPk()).orElse(null));
									eventBus.publish("websocketSimulationReport", JsonObject.mapFrom(apiRequest).toString());

									listPATCHRunSimulationSimulationReport(apiRequest, listSimulationReport).onSuccess(e -> {
										response200PATCHRunSimulationSimulationReport(siteRequest).onSuccess(response -> {
											LOG.debug(String.format("patchrunsimulationSimulationReport succeeded. "));
											eventHandler.handle(Future.succeededFuture(response));
										}).onFailure(ex -> {
											LOG.error(String.format("patchrunsimulationSimulationReport failed. "), ex);
											error(siteRequest, eventHandler, ex);
										});
									}).onFailure(ex -> {
										LOG.error(String.format("patchrunsimulationSimulationReport failed. "), ex);
										error(siteRequest, eventHandler, ex);
									});
								}
							} catch(Exception ex) {
								LOG.error(String.format("patchrunsimulationSimulationReport failed. "), ex);
								error(siteRequest, eventHandler, ex);
							}
						}).onFailure(ex -> {
							LOG.error(String.format("patchrunsimulationSimulationReport failed. "), ex);
							error(siteRequest, eventHandler, ex);
						});
					} catch(Exception ex) {
						LOG.error(String.format("patchrunsimulationSimulationReport failed. "), ex);
						error(null, eventHandler, ex);
					}
				}
			});
		}).onFailure(ex -> {
			if("Inactive Token".equals(ex.getMessage()) || StringUtils.startsWith(ex.getMessage(), "invalid_grant:")) {
				try {
					eventHandler.handle(Future.succeededFuture(new ServiceResponse(302, "Found", null, MultiMap.caseInsensitiveMultiMap().add(HttpHeaders.LOCATION, "/logout?redirect_uri=" + URLEncoder.encode(serviceRequest.getExtra().getString("uri"), "UTF-8")))));
				} catch(Exception ex2) {
					LOG.error(String.format("patchrunsimulationSimulationReport failed. ", ex2));
					error(null, eventHandler, ex2);
				}
			} else if(StringUtils.startsWith(ex.getMessage(), "401 UNAUTHORIZED ")) {
				eventHandler.handle(Future.succeededFuture(
					new ServiceResponse(401, "UNAUTHORIZED",
						Buffer.buffer().appendString(
							new JsonObject()
								.put("errorCode", "401")
								.put("errorMessage", "SSO Resource Permission check returned DENY")
								.encodePrettily()
							), MultiMap.caseInsensitiveMultiMap()
							)
					));
			} else {
				LOG.error(String.format("patchrunsimulationSimulationReport failed. "), ex);
				error(null, eventHandler, ex);
			}
		});
	}


	public Future<Void> listPATCHRunSimulationSimulationReport(ApiRequest apiRequest, SearchList<SimulationReport> listSimulationReport) {
		Promise<Void> promise = Promise.promise();
		List<Future> futures = new ArrayList<>();
		SiteRequestEnUS siteRequest = listSimulationReport.getSiteRequest_(SiteRequestEnUS.class);
		listSimulationReport.getList().forEach(o -> {
			SiteRequestEnUS siteRequest2 = generateSiteRequest(siteRequest.getUser(), siteRequest.getUserPrincipal(), siteRequest.getServiceRequest(), siteRequest.getJsonObject(), SiteRequestEnUS.class);
			o.setSiteRequest_(siteRequest2);
			siteRequest2.setApiRequest_(siteRequest.getApiRequest_());
			futures.add(Future.future(promise1 -> {
				patchrunsimulationSimulationReportFuture(o, false).onSuccess(a -> {
					promise1.complete();
				}).onFailure(ex -> {
					LOG.error(String.format("listPATCHRunSimulationSimulationReport failed. "), ex);
					promise1.fail(ex);
				});
			}));
		});
		CompositeFuture.all(futures).onSuccess( a -> {
			listSimulationReport.next().onSuccess(next -> {
				if(next) {
					listPATCHRunSimulationSimulationReport(apiRequest, listSimulationReport).onSuccess(b -> {
						promise.complete();
					}).onFailure(ex -> {
						LOG.error(String.format("listPATCHRunSimulationSimulationReport failed. "), ex);
						promise.fail(ex);
					});
				} else {
					promise.complete();
				}
			}).onFailure(ex -> {
				LOG.error(String.format("listPATCHRunSimulationSimulationReport failed. "), ex);
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			LOG.error(String.format("listPATCHRunSimulationSimulationReport failed. "), ex);
			promise.fail(ex);
		});
		return promise.future();
	}

	@Override
	public void patchrunsimulationSimulationReportFuture(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler) {
		user(serviceRequest, SiteRequestEnUS.class, SiteUser.class, "smartabyar-smartvillage-enUS-SiteUser", "postSiteUserFuture", "patchSiteUserFuture").onSuccess(siteRequest -> {
			try {
				siteRequest.setJsonObject(body);
				serviceRequest.getParams().getJsonObject("query").put("rows", 1);
				searchSimulationReportList(siteRequest, false, true, true).onSuccess(listSimulationReport -> {
					try {
						SimulationReport o = listSimulationReport.first();
						if(o != null && listSimulationReport.getResponse().getResponse().getNumFound() == 1) {
							ApiRequest apiRequest = new ApiRequest();
							apiRequest.setRows(1L);
							apiRequest.setNumFound(1L);
							apiRequest.setNumPATCH(0L);
							apiRequest.initDeepApiRequest(siteRequest);
							siteRequest.setApiRequest_(apiRequest);
							if(Optional.ofNullable(serviceRequest.getParams()).map(p -> p.getJsonObject("query")).map( q -> q.getJsonArray("var")).orElse(new JsonArray()).stream().filter(s -> "refresh:false".equals(s)).count() > 0L) {
								siteRequest.getRequestVars().put( "refresh", "false" );
							}
							if(apiRequest.getNumFound() == 1L)
								apiRequest.setOriginal(o);
							apiRequest.setPk(Optional.ofNullable(listSimulationReport.first()).map(o2 -> o2.getPk()).orElse(null));
							patchrunsimulationSimulationReportFuture(o, false).onSuccess(o2 -> {
								eventHandler.handle(Future.succeededFuture(ServiceResponse.completedWithJson(Buffer.buffer(new JsonObject().encodePrettily()))));
							}).onFailure(ex -> {
								eventHandler.handle(Future.failedFuture(ex));
							});
						} else {
							eventHandler.handle(Future.succeededFuture(ServiceResponse.completedWithJson(Buffer.buffer(new JsonObject().encodePrettily()))));
						}
					} catch(Exception ex) {
						LOG.error(String.format("patchrunsimulationSimulationReport failed. "), ex);
						error(siteRequest, eventHandler, ex);
					}
				}).onFailure(ex -> {
					LOG.error(String.format("patchrunsimulationSimulationReport failed. "), ex);
					error(siteRequest, eventHandler, ex);
				});
			} catch(Exception ex) {
				LOG.error(String.format("patchrunsimulationSimulationReport failed. "), ex);
				error(null, eventHandler, ex);
			}
		}).onFailure(ex -> {
			LOG.error(String.format("patchrunsimulationSimulationReport failed. "), ex);
			error(null, eventHandler, ex);
		});
	}

	public Future<SimulationReport> patchrunsimulationSimulationReportFuture(SimulationReport o, Boolean inheritPk) {
		SiteRequestEnUS siteRequest = o.getSiteRequest_();
		Promise<SimulationReport> promise = Promise.promise();

		try {
			ApiRequest apiRequest = siteRequest.getApiRequest_();
			Promise<SimulationReport> promise1 = Promise.promise();
			pgPool.withTransaction(sqlConnection -> {
				siteRequest.setSqlConnection(sqlConnection);
				varsSimulationReport(siteRequest).onSuccess(a -> {
					sqlPATCHRunSimulationSimulationReport(o, inheritPk).onSuccess(simulationReport -> {
						persistSimulationReport(simulationReport).onSuccess(c -> {
							relateSimulationReport(simulationReport).onSuccess(d -> {
								indexSimulationReport(simulationReport).onSuccess(o2 -> {
									if(apiRequest != null) {
										apiRequest.setNumPATCH(apiRequest.getNumPATCH() + 1);
										if(apiRequest.getNumFound() == 1L && Optional.ofNullable(siteRequest.getJsonObject()).map(json -> json.size() > 0).orElse(false)) {
											o2.apiRequestSimulationReport();
											if(apiRequest.getVars().size() > 0)
												eventBus.publish("websocketSimulationReport", JsonObject.mapFrom(apiRequest).toString());
										}
									}
									promise1.complete(simulationReport);
								}).onFailure(ex -> {
									promise1.fail(ex);
								});
							}).onFailure(ex -> {
								promise1.fail(ex);
							});
						}).onFailure(ex -> {
							promise1.fail(ex);
						});
					}).onFailure(ex -> {
						promise1.fail(ex);
					});
				}).onFailure(ex -> {
					promise1.fail(ex);
				});
				return promise1.future();
			}).onSuccess(a -> {
				siteRequest.setSqlConnection(null);
			}).onFailure(ex -> {
				siteRequest.setSqlConnection(null);
				promise.fail(ex);
			}).compose(simulationReport -> {
				Promise<SimulationReport> promise2 = Promise.promise();
				refreshSimulationReport(simulationReport).onSuccess(a -> {
					promise2.complete(simulationReport);
				}).onFailure(ex -> {
					promise2.fail(ex);
				});
				return promise2.future();
			}).onSuccess(simulationReport -> {
				promise.complete(simulationReport);
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		} catch(Exception ex) {
			LOG.error(String.format("patchrunsimulationSimulationReportFuture failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	public Future<SimulationReport> sqlPATCHRunSimulationSimulationReport(SimulationReport o, Boolean inheritPk) {
		Promise<SimulationReport> promise = Promise.promise();
		try {
			SiteRequestEnUS siteRequest = o.getSiteRequest_();
			ApiRequest apiRequest = siteRequest.getApiRequest_();
			List<Long> pks = Optional.ofNullable(apiRequest).map(r -> r.getPks()).orElse(new ArrayList<>());
			List<String> classes = Optional.ofNullable(apiRequest).map(r -> r.getClasses()).orElse(new ArrayList<>());
			SqlConnection sqlConnection = siteRequest.getSqlConnection();
			Integer num = 1;
			StringBuilder bSql = new StringBuilder("UPDATE SimulationReport SET ");
			List<Object> bParams = new ArrayList<Object>();
			Long pk = o.getPk();
			JsonObject jsonObject = siteRequest.getJsonObject();
			Set<String> methodNames = jsonObject.fieldNames();
			SimulationReport o2 = new SimulationReport();
			o2.setSiteRequest_(siteRequest);
			List<Future> futures1 = new ArrayList<>();
			List<Future> futures2 = new ArrayList<>();

			for(String entityVar : methodNames) {
				switch(entityVar) {
					case "setInheritPk":
							o2.setInheritPk(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_inheritPk + "=$" + num);
							num++;
							bParams.add(o2.sqlInheritPk());
						break;
					case "setCreated":
							o2.setCreated(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_created + "=$" + num);
							num++;
							bParams.add(o2.sqlCreated());
						break;
					case "setArchived":
							o2.setArchived(jsonObject.getBoolean(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_archived + "=$" + num);
							num++;
							bParams.add(o2.sqlArchived());
						break;
					case "setDeleted":
							o2.setDeleted(jsonObject.getBoolean(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_deleted + "=$" + num);
							num++;
							bParams.add(o2.sqlDeleted());
						break;
					case "setSessionId":
							o2.setSessionId(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_sessionId + "=$" + num);
							num++;
							bParams.add(o2.sqlSessionId());
						break;
					case "setUserKey":
							o2.setUserKey(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_userKey + "=$" + num);
							num++;
							bParams.add(o2.sqlUserKey());
						break;
					case "setParamPedestrianWaitThresholdSecWestEast":
							o2.setParamPedestrianWaitThresholdSecWestEast(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramPedestrianWaitThresholdSecWestEast + "=$" + num);
							num++;
							bParams.add(o2.sqlParamPedestrianWaitThresholdSecWestEast());
						break;
					case "setParamVehicleQueueThresholdWestEast":
							o2.setParamVehicleQueueThresholdWestEast(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramVehicleQueueThresholdWestEast + "=$" + num);
							num++;
							bParams.add(o2.sqlParamVehicleQueueThresholdWestEast());
						break;
					case "setParamVehicleQueueThresholdSouthNorth":
							o2.setParamVehicleQueueThresholdSouthNorth(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramVehicleQueueThresholdSouthNorth + "=$" + num);
							num++;
							bParams.add(o2.sqlParamVehicleQueueThresholdSouthNorth());
						break;
					case "setParamPedestrianQueueThresholdNorthSouth":
							o2.setParamPedestrianQueueThresholdNorthSouth(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramPedestrianQueueThresholdNorthSouth + "=$" + num);
							num++;
							bParams.add(o2.sqlParamPedestrianQueueThresholdNorthSouth());
						break;
					case "setParamPedestrianQueueThresholdWestEast":
							o2.setParamPedestrianQueueThresholdWestEast(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramPedestrianQueueThresholdWestEast + "=$" + num);
							num++;
							bParams.add(o2.sqlParamPedestrianQueueThresholdWestEast());
						break;
					case "setParamDemandScale":
							o2.setParamDemandScale(jsonObject.getJsonArray(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramDemandScale + "=$" + num);
							num++;
							bParams.add(o2.sqlParamDemandScale());
						break;
					case "setParamStepSize":
							o2.setParamStepSize(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramStepSize + "=$" + num);
							num++;
							bParams.add(o2.sqlParamStepSize());
						break;
					case "setParamRunTime":
							o2.setParamRunTime(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramRunTime + "=$" + num);
							num++;
							bParams.add(o2.sqlParamRunTime());
						break;
					case "setParamItersPerPar":
							o2.setParamItersPerPar(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramItersPerPar + "=$" + num);
							num++;
							bParams.add(o2.sqlParamItersPerPar());
						break;
					case "setParamTotalIterNum":
							o2.setParamTotalIterNum(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramTotalIterNum + "=$" + num);
							num++;
							bParams.add(o2.sqlParamTotalIterNum());
						break;
					case "setUpdatedParameters":
							o2.setUpdatedParameters(jsonObject.getJsonArray(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_updatedParameters + "=$" + num);
							num++;
							bParams.add(o2.sqlUpdatedParameters());
						break;
					case "setUpdatedPerformance":
							o2.setUpdatedPerformance(jsonObject.getJsonArray(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_updatedPerformance + "=$" + num);
							num++;
							bParams.add(o2.sqlUpdatedPerformance());
						break;
					case "setAverageQueueLength":
							o2.setAverageQueueLength(jsonObject.getJsonArray(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_averageQueueLength + "=$" + num);
							num++;
							bParams.add(o2.sqlAverageQueueLength());
						break;
					case "setReportStatus":
							o2.setReportStatus(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_reportStatus + "=$" + num);
							num++;
							bParams.add(o2.sqlReportStatus());
						break;
					case "setReportProgress":
							o2.setReportProgress(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_reportProgress + "=$" + num);
							num++;
							bParams.add(o2.sqlReportProgress());
						break;
					case "setReportName":
							o2.setReportName(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_reportName + "=$" + num);
							num++;
							bParams.add(o2.sqlReportName());
						break;
					case "setLocation":
							o2.setLocation(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_location + "=$" + num);
							num++;
							bParams.add(o2.sqlLocation());
						break;
					case "setSimulationKey":
						Optional.ofNullable(jsonObject.getString(entityVar)).ifPresent(val -> {
							futures1.add(Future.future(promise2 -> {
								search(siteRequest).query(TrafficSimulation.class, val, inheritPk).onSuccess(pk2 -> {
									if(!pks.contains(pk2)) {
										pks.add(pk2);
										classes.add("TrafficSimulation");
									}
									sql(siteRequest).update(SimulationReport.class, pk).set(SimulationReport.VAR_simulationKey, TrafficSimulation.class, pk2).onSuccess(a -> {
										promise2.complete();
									}).onFailure(ex -> {
										promise2.fail(ex);
									});
								}).onFailure(ex -> {
									promise2.fail(ex);
								});
							}));
						});
						break;
					case "removeSimulationKey":
						Optional.ofNullable(jsonObject.getString(entityVar)).map(val -> Long.parseLong(val)).ifPresent(pk2 -> {
							if(!pks.contains(pk2)) {
								pks.add(pk2);
								classes.add("TrafficSimulation");
							}
							futures2.add(Future.future(promise2 -> {
									sql(siteRequest).update(SimulationReport.class, pk).setToNull(SimulationReport.VAR_simulationKey, TrafficSimulation.class, pk2).onSuccess(a -> {
									promise2.complete();
								}).onFailure(ex -> {
									promise2.fail(ex);
								});
							}));
						});
						break;
					case "setSmartTrafficLightKey":
						Optional.ofNullable(jsonObject.getString(entityVar)).ifPresent(val -> {
							futures1.add(Future.future(promise2 -> {
								search(siteRequest).query(SmartTrafficLight.class, val, inheritPk).onSuccess(pk2 -> {
									if(!pks.contains(pk2)) {
										pks.add(pk2);
										classes.add("SmartTrafficLight");
									}
									sql(siteRequest).update(SimulationReport.class, pk).set(SimulationReport.VAR_smartTrafficLightKey, SmartTrafficLight.class, pk2).onSuccess(a -> {
										promise2.complete();
									}).onFailure(ex -> {
										promise2.fail(ex);
									});
								}).onFailure(ex -> {
									promise2.fail(ex);
								});
							}));
						});
						break;
					case "removeSmartTrafficLightKey":
						Optional.ofNullable(jsonObject.getString(entityVar)).map(val -> Long.parseLong(val)).ifPresent(pk2 -> {
							if(!pks.contains(pk2)) {
								pks.add(pk2);
								classes.add("SmartTrafficLight");
							}
							futures2.add(Future.future(promise2 -> {
									sql(siteRequest).update(SimulationReport.class, pk).setToNull(SimulationReport.VAR_smartTrafficLightKey, SmartTrafficLight.class, pk2).onSuccess(a -> {
									promise2.complete();
								}).onFailure(ex -> {
									promise2.fail(ex);
								});
							}));
						});
						break;
					case "setSimulationName":
							o2.setSimulationName(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_simulationName + "=$" + num);
							num++;
							bParams.add(o2.sqlSimulationName());
						break;
					case "setSmartTrafficLightId":
							o2.setSmartTrafficLightId(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_smartTrafficLightId + "=$" + num);
							num++;
							bParams.add(o2.sqlSmartTrafficLightId());
						break;
					case "setSmartTrafficLightName":
							o2.setSmartTrafficLightName(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_smartTrafficLightName + "=$" + num);
							num++;
							bParams.add(o2.sqlSmartTrafficLightName());
						break;
					case "setParamAvgVehiclePerMinFromWestToEast":
							o2.setParamAvgVehiclePerMinFromWestToEast(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramAvgVehiclePerMinFromWestToEast + "=$" + num);
							num++;
							bParams.add(o2.sqlParamAvgVehiclePerMinFromWestToEast());
						break;
					case "setParamAvgVehiclePerMinFromSouthToNorth":
							o2.setParamAvgVehiclePerMinFromSouthToNorth(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramAvgVehiclePerMinFromSouthToNorth + "=$" + num);
							num++;
							bParams.add(o2.sqlParamAvgVehiclePerMinFromSouthToNorth());
						break;
					case "setParamVehicleDemandScalingFactor":
							o2.setParamVehicleDemandScalingFactor(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramVehicleDemandScalingFactor + "=$" + num);
							num++;
							bParams.add(o2.sqlParamVehicleDemandScalingFactor());
						break;
					case "setParamAvgPedestrianPerMinFromWestToEast":
							o2.setParamAvgPedestrianPerMinFromWestToEast(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramAvgPedestrianPerMinFromWestToEast + "=$" + num);
							num++;
							bParams.add(o2.sqlParamAvgPedestrianPerMinFromWestToEast());
						break;
					case "setParamAvgPedestrianPerMinFromSouthToNorth":
							o2.setParamAvgPedestrianPerMinFromSouthToNorth(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramAvgPedestrianPerMinFromSouthToNorth + "=$" + num);
							num++;
							bParams.add(o2.sqlParamAvgPedestrianPerMinFromSouthToNorth());
						break;
					case "setParamPedestrianDemandScalingFactor":
							o2.setParamPedestrianDemandScalingFactor(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramPedestrianDemandScalingFactor + "=$" + num);
							num++;
							bParams.add(o2.sqlParamPedestrianDemandScalingFactor());
						break;
					case "setParamMinGreenTimeSecWestEast":
							o2.setParamMinGreenTimeSecWestEast(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramMinGreenTimeSecWestEast + "=$" + num);
							num++;
							bParams.add(o2.sqlParamMinGreenTimeSecWestEast());
						break;
					case "setParamMaxGreenTimeSecWestEast":
							o2.setParamMaxGreenTimeSecWestEast(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramMaxGreenTimeSecWestEast + "=$" + num);
							num++;
							bParams.add(o2.sqlParamMaxGreenTimeSecWestEast());
						break;
					case "setParamMinGreenTimeSecSouthNorth":
							o2.setParamMinGreenTimeSecSouthNorth(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramMinGreenTimeSecSouthNorth + "=$" + num);
							num++;
							bParams.add(o2.sqlParamMinGreenTimeSecSouthNorth());
						break;
					case "setParamMaxGreenTimeSecSouthNorth":
							o2.setParamMaxGreenTimeSecSouthNorth(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramMaxGreenTimeSecSouthNorth + "=$" + num);
							num++;
							bParams.add(o2.sqlParamMaxGreenTimeSecSouthNorth());
						break;
					case "setParamPedestrianWaitThresholdSecNorthSouth":
							o2.setParamPedestrianWaitThresholdSecNorthSouth(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SimulationReport.VAR_paramPedestrianWaitThresholdSecNorthSouth + "=$" + num);
							num++;
							bParams.add(o2.sqlParamPedestrianWaitThresholdSecNorthSouth());
						break;
				}
			}
			bSql.append(" WHERE pk=$" + num);
			if(bParams.size() > 0) {
				bParams.add(pk);
				num++;
				futures2.add(0, Future.future(a -> {
					sqlConnection.preparedQuery(bSql.toString())
							.execute(Tuple.tuple(bParams)
							).onSuccess(b -> {
						a.handle(Future.succeededFuture());
					}).onFailure(ex -> {
						RuntimeException ex2 = new RuntimeException("value SimulationReport failed", ex);
						LOG.error(String.format("relateSimulationReport failed. "), ex2);
						a.handle(Future.failedFuture(ex2));
					});
				}));
			}
			CompositeFuture.all(futures1).onSuccess(a -> {
				CompositeFuture.all(futures2).onSuccess(b -> {
					SimulationReport o3 = new SimulationReport();
					o3.setSiteRequest_(o.getSiteRequest_());
					o3.setPk(pk);
					promise.complete(o3);
				}).onFailure(ex -> {
					LOG.error(String.format("sqlPATCHRunSimulationSimulationReport failed. "), ex);
					promise.fail(ex);
				});
			}).onFailure(ex -> {
				LOG.error(String.format("sqlPATCHRunSimulationSimulationReport failed. "), ex);
				promise.fail(ex);
			});
		} catch(Exception ex) {
			LOG.error(String.format("sqlPATCHRunSimulationSimulationReport failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	public Future<ServiceResponse> response200PATCHRunSimulationSimulationReport(SiteRequestEnUS siteRequest) {
		Promise<ServiceResponse> promise = Promise.promise();
		try {
			JsonObject json = new JsonObject();
			promise.complete(ServiceResponse.completedWithJson(Buffer.buffer(Optional.ofNullable(json).orElse(new JsonObject()).encodePrettily())));
		} catch(Exception ex) {
			LOG.error(String.format("response200PATCHRunSimulationSimulationReport failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	// SearchPage //

	@Override
	public void searchpageSimulationReportId(ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler) {
		searchpageSimulationReport(serviceRequest, eventHandler);
	}

	@Override
	public void searchpageSimulationReport(ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler) {
		user(serviceRequest, SiteRequestEnUS.class, SiteUser.class, "smartabyar-smartvillage-enUS-SiteUser", "postSiteUserFuture", "patchSiteUserFuture").onSuccess(siteRequest -> {

			authorizationProvider.getAuthorizations(siteRequest.getUser()).onFailure(ex -> {
				String msg = String.format("401 UNAUTHORIZED user %s to %s %s", siteRequest.getUser().attributes().getJsonObject("accessToken").getString("preferred_username"), serviceRequest.getExtra().getString("method"), serviceRequest.getExtra().getString("uri"));
				eventHandler.handle(Future.succeededFuture(
					new ServiceResponse(401, "UNAUTHORIZED",
						Buffer.buffer().appendString(
							new JsonObject()
								.put("errorCode", "401")
								.put("errorMessage", msg)
								.encodePrettily()
							), MultiMap.caseInsensitiveMultiMap()
					)
				));
			}).onSuccess(b -> {
				if(
						!Optional.ofNullable(config.getString(ConfigKeys.AUTH_ROLE_REQUIRED + "_SimulationReport")).map(v -> RoleBasedAuthorization.create(v).match(siteRequest.getUser())).orElse(false)
						&& !Optional.ofNullable(Optional.ofNullable(config.getString(ConfigKeys.AUTH_ROLE_READ_REQUIRED + "_SimulationReport")).orElse(config.getString(ConfigKeys.AUTH_ROLE_REQUIRED + "_SimulationReport"))).map(v -> RoleBasedAuthorization.create(v).match(siteRequest.getUser())).orElse(false)
						) {
					String msg = String.format("401 UNAUTHORIZED user %s to %s %s", siteRequest.getUser().attributes().getJsonObject("accessToken").getString("preferred_username"), serviceRequest.getExtra().getString("method"), serviceRequest.getExtra().getString("uri"));
					eventHandler.handle(Future.succeededFuture(
						new ServiceResponse(401, "UNAUTHORIZED",
							Buffer.buffer().appendString(
								new JsonObject()
									.put("errorCode", "401")
									.put("errorMessage", msg)
									.encodePrettily()
								), MultiMap.caseInsensitiveMultiMap()
						)
					));
				} else {
					try {
						searchSimulationReportList(siteRequest, false, true, false).onSuccess(listSimulationReport -> {
							response200SearchPageSimulationReport(listSimulationReport).onSuccess(response -> {
								eventHandler.handle(Future.succeededFuture(response));
								LOG.debug(String.format("searchpageSimulationReport succeeded. "));
							}).onFailure(ex -> {
								LOG.error(String.format("searchpageSimulationReport failed. "), ex);
								error(siteRequest, eventHandler, ex);
							});
						}).onFailure(ex -> {
							LOG.error(String.format("searchpageSimulationReport failed. "), ex);
							error(siteRequest, eventHandler, ex);
						});
					} catch(Exception ex) {
						LOG.error(String.format("searchpageSimulationReport failed. "), ex);
						error(null, eventHandler, ex);
					}
				}
			});
		}).onFailure(ex -> {
			if("Inactive Token".equals(ex.getMessage()) || StringUtils.startsWith(ex.getMessage(), "invalid_grant:")) {
				try {
					eventHandler.handle(Future.succeededFuture(new ServiceResponse(302, "Found", null, MultiMap.caseInsensitiveMultiMap().add(HttpHeaders.LOCATION, "/logout?redirect_uri=" + URLEncoder.encode(serviceRequest.getExtra().getString("uri"), "UTF-8")))));
				} catch(Exception ex2) {
					LOG.error(String.format("searchpageSimulationReport failed. ", ex2));
					error(null, eventHandler, ex2);
				}
			} else if(StringUtils.startsWith(ex.getMessage(), "401 UNAUTHORIZED ")) {
				eventHandler.handle(Future.succeededFuture(
					new ServiceResponse(401, "UNAUTHORIZED",
						Buffer.buffer().appendString(
							new JsonObject()
								.put("errorCode", "401")
								.put("errorMessage", "SSO Resource Permission check returned DENY")
								.encodePrettily()
							), MultiMap.caseInsensitiveMultiMap()
							)
					));
			} else {
				LOG.error(String.format("searchpageSimulationReport failed. "), ex);
				error(null, eventHandler, ex);
			}
		});
	}


	public void searchpageSimulationReportPageInit(SimulationReportPage page, SearchList<SimulationReport> listSimulationReport) {
	}

	public String templateSearchPageSimulationReport() {
		return Optional.ofNullable(config.getString(ConfigKeys.TEMPLATE_PATH)).orElse("templates") + "/enUS/SimulationReportPage";
	}
	public Future<ServiceResponse> response200SearchPageSimulationReport(SearchList<SimulationReport> listSimulationReport) {
		Promise<ServiceResponse> promise = Promise.promise();
		try {
			SiteRequestEnUS siteRequest = listSimulationReport.getSiteRequest_(SiteRequestEnUS.class);
			SimulationReportPage page = new SimulationReportPage();
			MultiMap requestHeaders = MultiMap.caseInsensitiveMultiMap();
			siteRequest.setRequestHeaders(requestHeaders);

			if(listSimulationReport.size() == 1)
				siteRequest.setRequestPk(listSimulationReport.get(0).getPk());
			page.setSearchListSimulationReport_(listSimulationReport);
			page.setSiteRequest_(siteRequest);
			page.promiseDeepSimulationReportPage(siteRequest).onSuccess(a -> {
				JsonObject json = JsonObject.mapFrom(page);
				json.put(ConfigKeys.STATIC_BASE_URL, config.getString(ConfigKeys.STATIC_BASE_URL));
				json.put(ConfigKeys.GITHUB_ORG, config.getString(ConfigKeys.GITHUB_ORG));
				json.put(ConfigKeys.SITE_NAME, config.getString(ConfigKeys.SITE_NAME));
				json.put(ConfigKeys.SITE_DISPLAY_NAME, config.getString(ConfigKeys.SITE_DISPLAY_NAME));
				json.put(ConfigKeys.SITE_POWERED_BY_URL, config.getString(ConfigKeys.SITE_POWERED_BY_URL));
				json.put(ConfigKeys.SITE_POWERED_BY_NAME, config.getString(ConfigKeys.SITE_POWERED_BY_NAME));
				json.put(ConfigKeys.SITE_POWERED_BY_IMAGE_URI, config.getString(ConfigKeys.SITE_POWERED_BY_IMAGE_URI));
				templateEngine.render(json, templateSearchPageSimulationReport()).onSuccess(buffer -> {
					promise.complete(new ServiceResponse(200, "OK", buffer, requestHeaders));
				}).onFailure(ex -> {
					promise.fail(ex);
				});
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		} catch(Exception ex) {
			LOG.error(String.format("response200SearchPageSimulationReport failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	// General //

	public Future<SimulationReport> createSimulationReport(SiteRequestEnUS siteRequest) {
		Promise<SimulationReport> promise = Promise.promise();
		try {
			SqlConnection sqlConnection = siteRequest.getSqlConnection();
			String userId = siteRequest.getUserId();
			Long userKey = siteRequest.getUserKey();
			ZonedDateTime created = Optional.ofNullable(siteRequest.getJsonObject()).map(j -> j.getString("created")).map(s -> ZonedDateTime.parse(s, ComputateZonedDateTimeSerializer.ZONED_DATE_TIME_FORMATTER.withZone(ZoneId.of(config.getString(ConfigKeys.SITE_ZONE))))).orElse(ZonedDateTime.now(ZoneId.of(config.getString(ConfigKeys.SITE_ZONE))));

			sqlConnection.preparedQuery("INSERT INTO SimulationReport(created, userKey) VALUES($1, $2) RETURNING pk")
					.collecting(Collectors.toList())
					.execute(Tuple.of(created.toOffsetDateTime(), userKey)).onSuccess(result -> {
				Row createLine = result.value().stream().findFirst().orElseGet(() -> null);
				Long pk = createLine.getLong(0);
				SimulationReport o = new SimulationReport();
				o.setPk(pk);
				o.setSiteRequest_(siteRequest);
				promise.complete(o);
			}).onFailure(ex -> {
				RuntimeException ex2 = new RuntimeException(ex);
				LOG.error("createSimulationReport failed. ", ex2);
				promise.fail(ex2);
			});
		} catch(Exception ex) {
			LOG.error(String.format("createSimulationReport failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	public void searchSimulationReportQ(SearchList<SimulationReport> searchList, String entityVar, String valueIndexed, String varIndexed) {
		searchList.q(varIndexed + ":" + ("*".equals(valueIndexed) ? valueIndexed : SearchTool.escapeQueryChars(valueIndexed)));
		if(!"*".equals(entityVar)) {
		}
	}

	public String searchSimulationReportFq(SearchList<SimulationReport> searchList, String entityVar, String valueIndexed, String varIndexed) {
		if(varIndexed == null)
			throw new RuntimeException(String.format("\"%s\" is not an indexed entity. ", entityVar));
		if(StringUtils.startsWith(valueIndexed, "[")) {
			String[] fqs = StringUtils.substringBefore(StringUtils.substringAfter(valueIndexed, "["), "]").split(" TO ");
			if(fqs.length != 2)
				throw new RuntimeException(String.format("\"%s\" invalid range query. ", valueIndexed));
			String fq1 = fqs[0].equals("*") ? fqs[0] : SimulationReport.staticSearchFqForClass(entityVar, searchList.getSiteRequest_(SiteRequestEnUS.class), fqs[0]);
			String fq2 = fqs[1].equals("*") ? fqs[1] : SimulationReport.staticSearchFqForClass(entityVar, searchList.getSiteRequest_(SiteRequestEnUS.class), fqs[1]);
			 return varIndexed + ":[" + fq1 + " TO " + fq2 + "]";
		} else {
			return varIndexed + ":" + SearchTool.escapeQueryChars(SimulationReport.staticSearchFqForClass(entityVar, searchList.getSiteRequest_(SiteRequestEnUS.class), valueIndexed)).replace("\\", "\\\\");
		}
	}

	public void searchSimulationReportSort(SearchList<SimulationReport> searchList, String entityVar, String valueIndexed, String varIndexed) {
		if(varIndexed == null)
			throw new RuntimeException(String.format("\"%s\" is not an indexed entity. ", entityVar));
		searchList.sort(varIndexed, valueIndexed);
	}

	public void searchSimulationReportRows(SearchList<SimulationReport> searchList, Long valueRows) {
			searchList.rows(valueRows != null ? valueRows : 10L);
	}

	public void searchSimulationReportStart(SearchList<SimulationReport> searchList, Long valueStart) {
		searchList.start(valueStart);
	}

	public void searchSimulationReportVar(SearchList<SimulationReport> searchList, String var, String value) {
		searchList.getSiteRequest_(SiteRequestEnUS.class).getRequestVars().put(var, value);
	}

	public void searchSimulationReportUri(SearchList<SimulationReport> searchList) {
	}

	public Future<ServiceResponse> varsSimulationReport(SiteRequestEnUS siteRequest) {
		Promise<ServiceResponse> promise = Promise.promise();
		try {
			ServiceRequest serviceRequest = siteRequest.getServiceRequest();

			serviceRequest.getParams().getJsonObject("query").stream().filter(paramRequest -> "var".equals(paramRequest.getKey()) && paramRequest.getValue() != null).findFirst().ifPresent(paramRequest -> {
				String entityVar = null;
				String valueIndexed = null;
				Object paramValuesObject = paramRequest.getValue();
				JsonArray paramObjects = paramValuesObject instanceof JsonArray ? (JsonArray)paramValuesObject : new JsonArray().add(paramValuesObject);

				try {
					for(Object paramObject : paramObjects) {
						entityVar = StringUtils.trim(StringUtils.substringBefore((String)paramObject, ":"));
						valueIndexed = URLDecoder.decode(StringUtils.trim(StringUtils.substringAfter((String)paramObject, ":")), "UTF-8");
						siteRequest.getRequestVars().put(entityVar, valueIndexed);
					}
				} catch(Exception ex) {
					LOG.error(String.format("searchSimulationReport failed. "), ex);
					promise.fail(ex);
				}
			});
			promise.complete();
		} catch(Exception ex) {
			LOG.error(String.format("searchSimulationReport failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	public Future<SearchList<SimulationReport>> searchSimulationReportList(SiteRequestEnUS siteRequest, Boolean populate, Boolean store, Boolean modify) {
		Promise<SearchList<SimulationReport>> promise = Promise.promise();
		try {
			ServiceRequest serviceRequest = siteRequest.getServiceRequest();
			String entityListStr = siteRequest.getServiceRequest().getParams().getJsonObject("query").getString("fl");
			String[] entityList = entityListStr == null ? null : entityListStr.split(",\\s*");
			SearchList<SimulationReport> searchList = new SearchList<SimulationReport>();
			String facetRange = null;
			Date facetRangeStart = null;
			Date facetRangeEnd = null;
			String facetRangeGap = null;
			String statsField = null;
			String statsFieldIndexed = null;
			searchList.setPopulate(populate);
			searchList.setStore(store);
			searchList.q("*:*");
			searchList.setC(SimulationReport.class);
			searchList.setSiteRequest_(siteRequest);
			if(entityList != null) {
				for(String v : entityList) {
					searchList.fl(SimulationReport.varIndexedSimulationReport(v));
				}
			}

			String id = serviceRequest.getParams().getJsonObject("path").getString("id");
			if(id != null && NumberUtils.isCreatable(id)) {
				searchList.fq("(pk_docvalues_long:" + SearchTool.escapeQueryChars(id) + " OR objectId_docvalues_string:" + SearchTool.escapeQueryChars(id) + ")");
			} else if(id != null) {
				searchList.fq("objectId_docvalues_string:" + SearchTool.escapeQueryChars(id));
			}

			for(String paramName : serviceRequest.getParams().getJsonObject("query").fieldNames()) {
				Object paramValuesObject = serviceRequest.getParams().getJsonObject("query").getValue(paramName);
				String entityVar = null;
				String valueIndexed = null;
				String varIndexed = null;
				String valueSort = null;
				Long valueStart = null;
				Long valueRows = null;
				String valueCursorMark = null;
				JsonArray paramObjects = paramValuesObject instanceof JsonArray ? (JsonArray)paramValuesObject : new JsonArray().add(paramValuesObject);

				try {
					if(paramValuesObject != null && "facet.pivot".equals(paramName)) {
						Matcher mFacetPivot = Pattern.compile("(?:(\\{![^\\}]+\\}))?(.*)").matcher(StringUtils.join(paramObjects.getList().toArray(), ","));
						boolean foundFacetPivot = mFacetPivot.find();
						if(foundFacetPivot) {
							String solrLocalParams = mFacetPivot.group(1);
							String[] entityVars = mFacetPivot.group(2).trim().split(",");
							String[] varsIndexed = new String[entityVars.length];
							for(Integer i = 0; i < entityVars.length; i++) {
								entityVar = entityVars[i];
								varsIndexed[i] = SimulationReport.varIndexedSimulationReport(entityVar);
							}
							searchList.facetPivot((solrLocalParams == null ? "" : solrLocalParams) + StringUtils.join(varsIndexed, ","));
						}
					} else if(paramValuesObject != null) {
						for(Object paramObject : paramObjects) {
							if(paramName.equals("q")) {
								Matcher mQ = Pattern.compile("(\\w+):(.+?(?=(\\)|\\s+OR\\s+|\\s+AND\\s+|\\^|$)))").matcher((String)paramObject);
								boolean foundQ = mQ.find();
								if(foundQ) {
									StringBuffer sb = new StringBuffer();
									while(foundQ) {
										entityVar = mQ.group(1).trim();
										valueIndexed = mQ.group(2).trim();
										varIndexed = SimulationReport.varIndexedSimulationReport(entityVar);
										String entityQ = searchSimulationReportFq(searchList, entityVar, valueIndexed, varIndexed);
										mQ.appendReplacement(sb, entityQ);
										foundQ = mQ.find();
									}
									mQ.appendTail(sb);
									searchList.q(sb.toString());
								}
							} else if(paramName.equals("fq")) {
								Matcher mFq = Pattern.compile("(\\w+):(.+?(?=(\\)|\\s+OR\\s+|\\s+AND\\s+|$)))").matcher((String)paramObject);
								boolean foundFq = mFq.find();
								if(foundFq) {
									StringBuffer sb = new StringBuffer();
									while(foundFq) {
										entityVar = mFq.group(1).trim();
										valueIndexed = mFq.group(2).trim();
										varIndexed = SimulationReport.varIndexedSimulationReport(entityVar);
										String entityFq = searchSimulationReportFq(searchList, entityVar, valueIndexed, varIndexed);
										mFq.appendReplacement(sb, entityFq);
										foundFq = mFq.find();
									}
									mFq.appendTail(sb);
									searchList.fq(sb.toString());
								}
							} else if(paramName.equals("sort")) {
								entityVar = StringUtils.trim(StringUtils.substringBefore((String)paramObject, " "));
								valueIndexed = StringUtils.trim(StringUtils.substringAfter((String)paramObject, " "));
								varIndexed = SimulationReport.varIndexedSimulationReport(entityVar);
								searchSimulationReportSort(searchList, entityVar, valueIndexed, varIndexed);
							} else if(paramName.equals("start")) {
								valueStart = paramObject instanceof Long ? (Long)paramObject : Long.parseLong(paramObject.toString());
								searchSimulationReportStart(searchList, valueStart);
							} else if(paramName.equals("rows")) {
								valueRows = paramObject instanceof Long ? (Long)paramObject : Long.parseLong(paramObject.toString());
								searchSimulationReportRows(searchList, valueRows);
							} else if(paramName.equals("stats")) {
								searchList.stats((Boolean)paramObject);
							} else if(paramName.equals("stats.field")) {
								Matcher mStats = Pattern.compile("(?:(\\{![^\\}]+\\}))?(.*)").matcher((String)paramObject);
								boolean foundStats = mStats.find();
								if(foundStats) {
									String solrLocalParams = mStats.group(1);
									entityVar = mStats.group(2).trim();
									varIndexed = SimulationReport.varIndexedSimulationReport(entityVar);
									searchList.statsField((solrLocalParams == null ? "" : solrLocalParams) + varIndexed);
									statsField = entityVar;
									statsFieldIndexed = varIndexed;
								}
							} else if(paramName.equals("facet")) {
								searchList.facet((Boolean)paramObject);
							} else if(paramName.equals("facet.range.start")) {
								String startMathStr = (String)paramObject;
								Date start = SearchTool.parseMath(startMathStr);
								searchList.facetRangeStart(start.toInstant().toString());
								facetRangeStart = start;
							} else if(paramName.equals("facet.range.end")) {
								String endMathStr = (String)paramObject;
								Date end = SearchTool.parseMath(endMathStr);
								searchList.facetRangeEnd(end.toInstant().toString());
								facetRangeEnd = end;
							} else if(paramName.equals("facet.range.gap")) {
								String gap = (String)paramObject;
								searchList.facetRangeGap(gap);
								facetRangeGap = gap;
							} else if(paramName.equals("facet.range")) {
								Matcher mFacetRange = Pattern.compile("(?:(\\{![^\\}]+\\}))?(.*)").matcher((String)paramObject);
								boolean foundFacetRange = mFacetRange.find();
								if(foundFacetRange) {
									String solrLocalParams = mFacetRange.group(1);
									entityVar = mFacetRange.group(2).trim();
									varIndexed = SimulationReport.varIndexedSimulationReport(entityVar);
									searchList.facetRange((solrLocalParams == null ? "" : solrLocalParams) + varIndexed);
									facetRange = entityVar;
								}
							} else if(paramName.equals("facet.field")) {
								entityVar = (String)paramObject;
								varIndexed = SimulationReport.varIndexedSimulationReport(entityVar);
								if(varIndexed != null)
									searchList.facetField(varIndexed);
							} else if(paramName.equals("var")) {
								entityVar = StringUtils.trim(StringUtils.substringBefore((String)paramObject, ":"));
								valueIndexed = URLDecoder.decode(StringUtils.trim(StringUtils.substringAfter((String)paramObject, ":")), "UTF-8");
								searchSimulationReportVar(searchList, entityVar, valueIndexed);
							} else if(paramName.equals("cursorMark")) {
								valueCursorMark = (String)paramObject;
								searchList.cursorMark((String)paramObject);
							}
						}
						searchSimulationReportUri(searchList);
					}
				} catch(Exception e) {
					ExceptionUtils.rethrow(e);
				}
			}
			if("*:*".equals(searchList.getQuery()) && searchList.getSorts().size() == 0) {
				searchList.sort("created_docvalues_date", "desc");
			}
			String facetRange2 = facetRange;
			Date facetRangeStart2 = facetRangeStart;
			Date facetRangeEnd2 = facetRangeEnd;
			String facetRangeGap2 = facetRangeGap;
			String statsField2 = statsField;
			String statsFieldIndexed2 = statsFieldIndexed;
			searchSimulationReport2(siteRequest, populate, store, modify, searchList);
			searchList.promiseDeepForClass(siteRequest).onSuccess(a -> {
				if(facetRange2 != null && statsField2 != null && facetRange2.equals(statsField2)) {
					StatsField stats = searchList.getResponse().getStats().getStatsFields().get(statsFieldIndexed2);
					Instant min = Optional.ofNullable(stats.getMin()).map(val -> Instant.parse(val.toString())).orElse(Instant.now());
					Instant max = Optional.ofNullable(stats.getMax()).map(val -> Instant.parse(val.toString())).orElse(Instant.now());
					if(min.equals(max)) {
						min = min.minus(1, ChronoUnit.DAYS);
						max = max.plus(2, ChronoUnit.DAYS);
					}
					Duration duration = Duration.between(min, max);
					String gap = "DAY";
					if(duration.toDays() >= 365)
						gap = "YEAR";
					else if(duration.toDays() >= 28)
						gap = "MONTH";
					else if(duration.toDays() >= 1)
						gap = "DAY";
					else if(duration.toHours() >= 1)
						gap = "HOUR";
					else if(duration.toMinutes() >= 1)
						gap = "MINUTE";
					else if(duration.toMillis() >= 1000)
						gap = "SECOND";
					else if(duration.toMillis() >= 1)
						gap = "MILLI";

					if(facetRangeStart2 == null)
						searchList.facetRangeStart(min.toString());
					if(facetRangeEnd2 == null)
						searchList.facetRangeEnd(max.toString());
					if(facetRangeGap2 == null)
						searchList.facetRangeGap(String.format("+1%s", gap));
					searchList.query().onSuccess(b -> {
						promise.complete(searchList);
					}).onFailure(ex -> {
						LOG.error(String.format("searchSimulationReport failed. "), ex);
						promise.fail(ex);
					});
				} else {
					promise.complete(searchList);
				}
			}).onFailure(ex -> {
				LOG.error(String.format("searchSimulationReport failed. "), ex);
				promise.fail(ex);
			});
		} catch(Exception ex) {
			LOG.error(String.format("searchSimulationReport failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}
	public void searchSimulationReport2(SiteRequestEnUS siteRequest, Boolean populate, Boolean store, Boolean modify, SearchList<SimulationReport> searchList) {
	}

	public Future<Void> persistSimulationReport(SimulationReport o) {
		Promise<Void> promise = Promise.promise();
		try {
			SiteRequestEnUS siteRequest = o.getSiteRequest_();
			SqlConnection sqlConnection = siteRequest.getSqlConnection();
			Long pk = o.getPk();
			sqlConnection.preparedQuery("SELECT * FROM SimulationReport WHERE pk=$1")
					.collecting(Collectors.toList())
					.execute(Tuple.of(pk)
					).onSuccess(result -> {
				try {
					for(Row definition : result.value()) {
						for(Integer i = 0; i < definition.size(); i++) {
							String columnName = definition.getColumnName(i);
							Object columnValue = definition.getValue(i);
							if(!"pk".equals(columnName)) {
								try {
									o.persistForClass(columnName, columnValue);
								} catch(Exception e) {
									LOG.error(String.format("persistSimulationReport failed. "), e);
								}
							}
						}
					}
					promise.complete();
				} catch(Exception ex) {
					LOG.error(String.format("persistSimulationReport failed. "), ex);
					promise.fail(ex);
				}
			}).onFailure(ex -> {
				RuntimeException ex2 = new RuntimeException(ex);
				LOG.error(String.format("persistSimulationReport failed. "), ex2);
				promise.fail(ex2);
			});
		} catch(Exception ex) {
			LOG.error(String.format("persistSimulationReport failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	public Future<Void> relateSimulationReport(SimulationReport o) {
		Promise<Void> promise = Promise.promise();
		try {
			SiteRequestEnUS siteRequest = o.getSiteRequest_();
			SqlConnection sqlConnection = siteRequest.getSqlConnection();
			Long pk = o.getPk();
			sqlConnection.preparedQuery("SELECT simulationKey as pk1, 'simulationKey' from SimulationReport where pk=$1 UNION SELECT smartTrafficLightKey as pk1, 'smartTrafficLightKey' from SimulationReport where pk=$2")
					.collecting(Collectors.toList())
					.execute(Tuple.of(pk, pk)
					).onSuccess(result -> {
				try {
					if(result != null) {
						for(Row definition : result.value()) {
							o.relateForClass(definition.getString(1), definition.getLong(0));
						}
					}
					promise.complete();
				} catch(Exception ex) {
					LOG.error(String.format("relateSimulationReport failed. "), ex);
					promise.fail(ex);
				}
			}).onFailure(ex -> {
				RuntimeException ex2 = new RuntimeException(ex);
				LOG.error(String.format("relateSimulationReport failed. "), ex2);
				promise.fail(ex2);
			});
		} catch(Exception ex) {
			LOG.error(String.format("relateSimulationReport failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	public Future<SimulationReport> indexSimulationReport(SimulationReport o) {
		Promise<SimulationReport> promise = Promise.promise();
		try {
			SiteRequestEnUS siteRequest = o.getSiteRequest_();
			ApiRequest apiRequest = siteRequest.getApiRequest_();
			o.promiseDeepForClass(siteRequest).onSuccess(a -> {
				JsonObject json = new JsonObject();
				JsonObject add = new JsonObject();
				json.put("add", add);
				JsonObject doc = new JsonObject();
				add.put("doc", doc);
				o.indexSimulationReport(doc);
				String solrHostName = siteRequest.getConfig().getString(ConfigKeys.SOLR_HOST_NAME);
				Integer solrPort = siteRequest.getConfig().getInteger(ConfigKeys.SOLR_PORT);
				String solrCollection = siteRequest.getConfig().getString(ConfigKeys.SOLR_COLLECTION);
				Boolean solrSsl = siteRequest.getConfig().getBoolean(ConfigKeys.SOLR_SSL);
				Boolean softCommit = Optional.ofNullable(siteRequest.getServiceRequest().getParams()).map(p -> p.getJsonObject("query")).map( q -> q.getBoolean("softCommit")).orElse(null);
				Integer commitWithin = Optional.ofNullable(siteRequest.getServiceRequest().getParams()).map(p -> p.getJsonObject("query")).map( q -> q.getInteger("commitWithin")).orElse(null);
					if(softCommit == null && commitWithin == null)
						softCommit = true;
					else if(softCommit == null)
						softCommit = false;
				String solrRequestUri = String.format("/solr/%s/update%s%s%s", solrCollection, "?overwrite=true&wt=json", softCommit ? "&softCommit=true" : "", commitWithin != null ? ("&commitWithin=" + commitWithin) : "");
				webClient.post(solrPort, solrHostName, solrRequestUri).ssl(solrSsl).putHeader("Content-Type", "application/json").expect(ResponsePredicate.SC_OK).sendBuffer(json.toBuffer()).onSuccess(b -> {
					promise.complete(o);
				}).onFailure(ex -> {
					LOG.error(String.format("indexSimulationReport failed. "), new RuntimeException(ex));
					promise.fail(ex);
				});
			}).onFailure(ex -> {
				LOG.error(String.format("indexSimulationReport failed. "), ex);
				promise.fail(ex);
			});
		} catch(Exception ex) {
			LOG.error(String.format("indexSimulationReport failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	public String searchVar(String varIndexed) {
		return SimulationReport.searchVarSimulationReport(varIndexed);
	}

	public Future<Void> refreshSimulationReport(SimulationReport o) {
		Promise<Void> promise = Promise.promise();
		SiteRequestEnUS siteRequest = o.getSiteRequest_();
		try {
			ApiRequest apiRequest = siteRequest.getApiRequest_();
			List<Long> pks = Optional.ofNullable(apiRequest).map(r -> r.getPks()).orElse(new ArrayList<>());
			List<String> classes = Optional.ofNullable(apiRequest).map(r -> r.getClasses()).orElse(new ArrayList<>());
			Boolean refresh = !"false".equals(siteRequest.getRequestVars().get("refresh"));
			if(refresh && !Optional.ofNullable(siteRequest.getJsonObject()).map(JsonObject::isEmpty).orElse(true)) {
				List<Future> futures = new ArrayList<>();

				for(int i=0; i < pks.size(); i++) {
					Long pk2 = pks.get(i);
					String classSimpleName2 = classes.get(i);

					if("TrafficSimulation".equals(classSimpleName2) && pk2 != null) {
						SearchList<TrafficSimulation> searchList2 = new SearchList<TrafficSimulation>();
						searchList2.setStore(true);
						searchList2.q("*:*");
						searchList2.setC(TrafficSimulation.class);
						searchList2.fq("pk_docvalues_long:" + pk2);
						searchList2.rows(1L);
						futures.add(Future.future(promise2 -> {
							searchList2.promiseDeepSearchList(siteRequest).onSuccess(b -> {
								TrafficSimulation o2 = searchList2.getList().stream().findFirst().orElse(null);
								if(o2 != null) {
									JsonObject params = new JsonObject();
									params.put("body", new JsonObject());
									params.put("cookie", new JsonObject());
									params.put("path", new JsonObject());
									params.put("query", new JsonObject().put("q", "*:*").put("fq", new JsonArray().add("pk:" + pk2)).put("var", new JsonArray().add("refresh:false")));
									JsonObject context = new JsonObject().put("params", params).put("user", siteRequest.getUserPrincipal());
									JsonObject json = new JsonObject().put("context", context);
									eventBus.request("smartabyar-smartvillage-enUS-TrafficSimulation", json, new DeliveryOptions().addHeader("action", "patchTrafficSimulationFuture")).onSuccess(c -> {
										JsonObject responseMessage = (JsonObject)c.body();
										Integer statusCode = responseMessage.getInteger("statusCode");
										if(statusCode.equals(200))
											promise2.complete();
										else
											promise2.fail(new RuntimeException(responseMessage.getString("statusMessage")));
									}).onFailure(ex -> {
										promise2.fail(ex);
									});
								}
							}).onFailure(ex -> {
								promise2.fail(ex);
							});
						}));
					}

					if("SmartTrafficLight".equals(classSimpleName2) && pk2 != null) {
						SearchList<SmartTrafficLight> searchList2 = new SearchList<SmartTrafficLight>();
						searchList2.setStore(true);
						searchList2.q("*:*");
						searchList2.setC(SmartTrafficLight.class);
						searchList2.fq("pk_docvalues_long:" + pk2);
						searchList2.rows(1L);
						futures.add(Future.future(promise2 -> {
							searchList2.promiseDeepSearchList(siteRequest).onSuccess(b -> {
								SmartTrafficLight o2 = searchList2.getList().stream().findFirst().orElse(null);
								if(o2 != null) {
									JsonObject params = new JsonObject();
									params.put("body", new JsonObject());
									params.put("cookie", new JsonObject());
									params.put("path", new JsonObject());
									params.put("query", new JsonObject().put("q", "*:*").put("fq", new JsonArray().add("pk:" + pk2)).put("var", new JsonArray().add("refresh:false")));
									JsonObject context = new JsonObject().put("params", params).put("user", siteRequest.getUserPrincipal());
									JsonObject json = new JsonObject().put("context", context);
									eventBus.request("smartabyar-smartvillage-enUS-SmartTrafficLight", json, new DeliveryOptions().addHeader("action", "patchSmartTrafficLightFuture")).onSuccess(c -> {
										JsonObject responseMessage = (JsonObject)c.body();
										Integer statusCode = responseMessage.getInteger("statusCode");
										if(statusCode.equals(200))
											promise2.complete();
										else
											promise2.fail(new RuntimeException(responseMessage.getString("statusMessage")));
									}).onFailure(ex -> {
										promise2.fail(ex);
									});
								}
							}).onFailure(ex -> {
								promise2.fail(ex);
							});
						}));
					}
				}

				CompositeFuture.all(futures).onSuccess(b -> {
					JsonObject params = new JsonObject();
					params.put("body", new JsonObject());
					params.put("cookie", new JsonObject());
					params.put("header", new JsonObject());
					params.put("form", new JsonObject());
					params.put("path", new JsonObject());
					JsonObject query = new JsonObject();
					Boolean softCommit = Optional.ofNullable(siteRequest.getServiceRequest().getParams()).map(p -> p.getJsonObject("query")).map( q -> q.getBoolean("softCommit")).orElse(null);
					Integer commitWithin = Optional.ofNullable(siteRequest.getServiceRequest().getParams()).map(p -> p.getJsonObject("query")).map( q -> q.getInteger("commitWithin")).orElse(null);
					if(softCommit == null && commitWithin == null)
						softCommit = true;
					if(softCommit != null)
						query.put("softCommit", softCommit);
					if(commitWithin != null)
						query.put("commitWithin", commitWithin);
					query.put("q", "*:*").put("fq", new JsonArray().add("pk:" + o.getPk())).put("var", new JsonArray().add("refresh:false"));
					params.put("query", query);
					JsonObject context = new JsonObject().put("params", params).put("user", siteRequest.getUserPrincipal());
					JsonObject json = new JsonObject().put("context", context);
					eventBus.request("smartabyar-smartvillage-enUS-SimulationReport", json, new DeliveryOptions().addHeader("action", "patchSimulationReportFuture")).onSuccess(c -> {
						JsonObject responseMessage = (JsonObject)c.body();
						Integer statusCode = responseMessage.getInteger("statusCode");
						if(statusCode.equals(200))
							promise.complete();
						else
							promise.fail(new RuntimeException(responseMessage.getString("statusMessage")));
					}).onFailure(ex -> {
						LOG.error("Refresh relations failed. ", ex);
						promise.fail(ex);
					});
				}).onFailure(ex -> {
					LOG.error("Refresh relations failed. ", ex);
					promise.fail(ex);
				});
			} else {
				promise.complete();
			}
		} catch(Exception ex) {
			LOG.error(String.format("refreshSimulationReport failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}
}
