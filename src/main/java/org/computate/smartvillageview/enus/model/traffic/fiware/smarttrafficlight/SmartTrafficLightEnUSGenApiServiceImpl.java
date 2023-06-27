package org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight;

import org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReportEnUSApiServiceImpl;
import org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport;
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


/**
 * Translate: false
 **/
public class SmartTrafficLightEnUSGenApiServiceImpl extends BaseApiServiceImpl implements SmartTrafficLightEnUSGenApiService {

	protected static final Logger LOG = LoggerFactory.getLogger(SmartTrafficLightEnUSGenApiServiceImpl.class);

	public SmartTrafficLightEnUSGenApiServiceImpl(EventBus eventBus, JsonObject config, WorkerExecutor workerExecutor, PgPool pgPool, KafkaProducer<String, String> kafkaProducer, WebClient webClient, OAuth2Auth oauth2AuthenticationProvider, AuthorizationProvider authorizationProvider, HandlebarsTemplateEngine templateEngine) {
		super(eventBus, config, workerExecutor, pgPool, kafkaProducer, webClient, oauth2AuthenticationProvider, authorizationProvider, templateEngine);
	}

	// Search //

	@Override
	public void searchSmartTrafficLight(ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler) {
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
				if(!Optional.ofNullable(config.getString(ConfigKeys.AUTH_ROLE_REQUIRED + "_SmartTrafficLight")).map(v -> RoleBasedAuthorization.create(v).match(siteRequest.getUser())).orElse(false)) {
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
						searchSmartTrafficLightList(siteRequest, false, true, false).onSuccess(listSmartTrafficLight -> {
							response200SearchSmartTrafficLight(listSmartTrafficLight).onSuccess(response -> {
								eventHandler.handle(Future.succeededFuture(response));
								LOG.debug(String.format("searchSmartTrafficLight succeeded. "));
							}).onFailure(ex -> {
								LOG.error(String.format("searchSmartTrafficLight failed. "), ex);
								error(siteRequest, eventHandler, ex);
							});
						}).onFailure(ex -> {
							LOG.error(String.format("searchSmartTrafficLight failed. "), ex);
							error(siteRequest, eventHandler, ex);
						});
					} catch(Exception ex) {
						LOG.error(String.format("searchSmartTrafficLight failed. "), ex);
						error(null, eventHandler, ex);
					}
				}
			});
		}).onFailure(ex -> {
			if("Inactive Token".equals(ex.getMessage()) || StringUtils.startsWith(ex.getMessage(), "invalid_grant:")) {
				try {
					eventHandler.handle(Future.succeededFuture(new ServiceResponse(302, "Found", null, MultiMap.caseInsensitiveMultiMap().add(HttpHeaders.LOCATION, "/logout?redirect_uri=" + URLEncoder.encode(serviceRequest.getExtra().getString("uri"), "UTF-8")))));
				} catch(Exception ex2) {
					LOG.error(String.format("searchSmartTrafficLight failed. ", ex2));
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
				LOG.error(String.format("searchSmartTrafficLight failed. "), ex);
				error(null, eventHandler, ex);
			}
		});
	}


	public Future<ServiceResponse> response200SearchSmartTrafficLight(SearchList<SmartTrafficLight> listSmartTrafficLight) {
		Promise<ServiceResponse> promise = Promise.promise();
		try {
			SiteRequestEnUS siteRequest = listSmartTrafficLight.getSiteRequest_(SiteRequestEnUS.class);
			List<String> fls = listSmartTrafficLight.getRequest().getFields();
			JsonObject json = new JsonObject();
			JsonArray l = new JsonArray();
			listSmartTrafficLight.getList().stream().forEach(o -> {
				JsonObject json2 = JsonObject.mapFrom(o);
				if(fls.size() > 0) {
					Set<String> fieldNames = new HashSet<String>();
					for(String fieldName : json2.fieldNames()) {
						String v = SmartTrafficLight.varIndexedSmartTrafficLight(fieldName);
						if(v != null)
							fieldNames.add(SmartTrafficLight.varIndexedSmartTrafficLight(fieldName));
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
			response200Search(listSmartTrafficLight.getRequest(), listSmartTrafficLight.getResponse(), json);
			promise.complete(ServiceResponse.completedWithJson(Buffer.buffer(Optional.ofNullable(json).orElse(new JsonObject()).encodePrettily())));
		} catch(Exception ex) {
			LOG.error(String.format("response200SearchSmartTrafficLight failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}
	public void responsePivotSearchSmartTrafficLight(List<SolrResponse.Pivot> pivots, JsonArray pivotArray) {
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
					responsePivotSearchSmartTrafficLight(pivotFields2, pivotArray2);
				}
			}
		}
	}

	// GET //

	@Override
	public void getSmartTrafficLight(ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler) {
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
				if(!Optional.ofNullable(config.getString(ConfigKeys.AUTH_ROLE_REQUIRED + "_SmartTrafficLight")).map(v -> RoleBasedAuthorization.create(v).match(siteRequest.getUser())).orElse(false)) {
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
						searchSmartTrafficLightList(siteRequest, false, true, false).onSuccess(listSmartTrafficLight -> {
							response200GETSmartTrafficLight(listSmartTrafficLight).onSuccess(response -> {
								eventHandler.handle(Future.succeededFuture(response));
								LOG.debug(String.format("getSmartTrafficLight succeeded. "));
							}).onFailure(ex -> {
								LOG.error(String.format("getSmartTrafficLight failed. "), ex);
								error(siteRequest, eventHandler, ex);
							});
						}).onFailure(ex -> {
							LOG.error(String.format("getSmartTrafficLight failed. "), ex);
							error(siteRequest, eventHandler, ex);
						});
					} catch(Exception ex) {
						LOG.error(String.format("getSmartTrafficLight failed. "), ex);
						error(null, eventHandler, ex);
					}
				}
			});
		}).onFailure(ex -> {
			if("Inactive Token".equals(ex.getMessage()) || StringUtils.startsWith(ex.getMessage(), "invalid_grant:")) {
				try {
					eventHandler.handle(Future.succeededFuture(new ServiceResponse(302, "Found", null, MultiMap.caseInsensitiveMultiMap().add(HttpHeaders.LOCATION, "/logout?redirect_uri=" + URLEncoder.encode(serviceRequest.getExtra().getString("uri"), "UTF-8")))));
				} catch(Exception ex2) {
					LOG.error(String.format("getSmartTrafficLight failed. ", ex2));
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
				LOG.error(String.format("getSmartTrafficLight failed. "), ex);
				error(null, eventHandler, ex);
			}
		});
	}


	public Future<ServiceResponse> response200GETSmartTrafficLight(SearchList<SmartTrafficLight> listSmartTrafficLight) {
		Promise<ServiceResponse> promise = Promise.promise();
		try {
			SiteRequestEnUS siteRequest = listSmartTrafficLight.getSiteRequest_(SiteRequestEnUS.class);
			JsonObject json = JsonObject.mapFrom(listSmartTrafficLight.getList().stream().findFirst().orElse(null));
			promise.complete(ServiceResponse.completedWithJson(Buffer.buffer(Optional.ofNullable(json).orElse(new JsonObject()).encodePrettily())));
		} catch(Exception ex) {
			LOG.error(String.format("response200GETSmartTrafficLight failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	// PATCH //

	@Override
	public void patchSmartTrafficLight(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler) {
		LOG.debug(String.format("patchSmartTrafficLight started. "));
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
				if(!Optional.ofNullable(config.getString(ConfigKeys.AUTH_ROLE_REQUIRED + "_SmartTrafficLight")).map(v -> RoleBasedAuthorization.create(v).match(siteRequest.getUser())).orElse(false)) {
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
						searchSmartTrafficLightList(siteRequest, false, true, true).onSuccess(listSmartTrafficLight -> {
							try {
								if(listSmartTrafficLight.getResponse().getResponse().getNumFound() > 1
										&& !Optional.ofNullable(config.getString(ConfigKeys.AUTH_ROLE_REQUIRED + "_SmartTrafficLight")).map(v -> RoleBasedAuthorization.create(v).match(siteRequest.getUser())).orElse(false)
										) {
									String message = String.format("roles required: " + config.getString(ConfigKeys.AUTH_ROLE_REQUIRED + "_SmartTrafficLight"));
									LOG.error(message);
									error(siteRequest, eventHandler, new RuntimeException(message));
								} else {

									ApiRequest apiRequest = new ApiRequest();
									apiRequest.setRows(listSmartTrafficLight.getRequest().getRows());
									apiRequest.setNumFound(listSmartTrafficLight.getResponse().getResponse().getNumFound());
									apiRequest.setNumPATCH(0L);
									apiRequest.initDeepApiRequest(siteRequest);
									siteRequest.setApiRequest_(apiRequest);
									if(apiRequest.getNumFound() == 1L)
										apiRequest.setOriginal(listSmartTrafficLight.first());
									apiRequest.setPk(Optional.ofNullable(listSmartTrafficLight.first()).map(o2 -> o2.getPk()).orElse(null));
									eventBus.publish("websocketSmartTrafficLight", JsonObject.mapFrom(apiRequest).toString());

									listPATCHSmartTrafficLight(apiRequest, listSmartTrafficLight).onSuccess(e -> {
										response200PATCHSmartTrafficLight(siteRequest).onSuccess(response -> {
											LOG.debug(String.format("patchSmartTrafficLight succeeded. "));
											eventHandler.handle(Future.succeededFuture(response));
										}).onFailure(ex -> {
											LOG.error(String.format("patchSmartTrafficLight failed. "), ex);
											error(siteRequest, eventHandler, ex);
										});
									}).onFailure(ex -> {
										LOG.error(String.format("patchSmartTrafficLight failed. "), ex);
										error(siteRequest, eventHandler, ex);
									});
								}
							} catch(Exception ex) {
								LOG.error(String.format("patchSmartTrafficLight failed. "), ex);
								error(siteRequest, eventHandler, ex);
							}
						}).onFailure(ex -> {
							LOG.error(String.format("patchSmartTrafficLight failed. "), ex);
							error(siteRequest, eventHandler, ex);
						});
					} catch(Exception ex) {
						LOG.error(String.format("patchSmartTrafficLight failed. "), ex);
						error(null, eventHandler, ex);
					}
				}
			});
		}).onFailure(ex -> {
			if("Inactive Token".equals(ex.getMessage()) || StringUtils.startsWith(ex.getMessage(), "invalid_grant:")) {
				try {
					eventHandler.handle(Future.succeededFuture(new ServiceResponse(302, "Found", null, MultiMap.caseInsensitiveMultiMap().add(HttpHeaders.LOCATION, "/logout?redirect_uri=" + URLEncoder.encode(serviceRequest.getExtra().getString("uri"), "UTF-8")))));
				} catch(Exception ex2) {
					LOG.error(String.format("patchSmartTrafficLight failed. ", ex2));
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
				LOG.error(String.format("patchSmartTrafficLight failed. "), ex);
				error(null, eventHandler, ex);
			}
		});
	}


	public Future<Void> listPATCHSmartTrafficLight(ApiRequest apiRequest, SearchList<SmartTrafficLight> listSmartTrafficLight) {
		Promise<Void> promise = Promise.promise();
		List<Future> futures = new ArrayList<>();
		SiteRequestEnUS siteRequest = listSmartTrafficLight.getSiteRequest_(SiteRequestEnUS.class);
		listSmartTrafficLight.getList().forEach(o -> {
			SiteRequestEnUS siteRequest2 = generateSiteRequest(siteRequest.getUser(), siteRequest.getUserPrincipal(), siteRequest.getServiceRequest(), siteRequest.getJsonObject(), SiteRequestEnUS.class);
			o.setSiteRequest_(siteRequest2);
			siteRequest2.setApiRequest_(siteRequest.getApiRequest_());
			futures.add(Future.future(promise1 -> {
				patchSmartTrafficLightFuture(o, false).onSuccess(a -> {
					promise1.complete();
				}).onFailure(ex -> {
					LOG.error(String.format("listPATCHSmartTrafficLight failed. "), ex);
					promise1.fail(ex);
				});
			}));
		});
		CompositeFuture.all(futures).onSuccess( a -> {
			listSmartTrafficLight.next().onSuccess(next -> {
				if(next) {
					listPATCHSmartTrafficLight(apiRequest, listSmartTrafficLight).onSuccess(b -> {
						promise.complete();
					}).onFailure(ex -> {
						LOG.error(String.format("listPATCHSmartTrafficLight failed. "), ex);
						promise.fail(ex);
					});
				} else {
					promise.complete();
				}
			}).onFailure(ex -> {
				LOG.error(String.format("listPATCHSmartTrafficLight failed. "), ex);
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			LOG.error(String.format("listPATCHSmartTrafficLight failed. "), ex);
			promise.fail(ex);
		});
		return promise.future();
	}

	@Override
	public void patchSmartTrafficLightFuture(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler) {
		user(serviceRequest, SiteRequestEnUS.class, SiteUser.class, "smartabyar-smartvillage-enUS-SiteUser", "postSiteUserFuture", "patchSiteUserFuture").onSuccess(siteRequest -> {
			try {
				siteRequest.setJsonObject(body);
				serviceRequest.getParams().getJsonObject("query").put("rows", 1);
				searchSmartTrafficLightList(siteRequest, false, true, true).onSuccess(listSmartTrafficLight -> {
					try {
						SmartTrafficLight o = listSmartTrafficLight.first();
						if(o != null && listSmartTrafficLight.getResponse().getResponse().getNumFound() == 1) {
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
							apiRequest.setPk(Optional.ofNullable(listSmartTrafficLight.first()).map(o2 -> o2.getPk()).orElse(null));
							eventBus.publish("websocketSmartTrafficLight", JsonObject.mapFrom(apiRequest).toString());
							patchSmartTrafficLightFuture(o, false).onSuccess(o2 -> {
								if(apiRequest != null) {
									apiRequest.setNumPATCH(apiRequest.getNumPATCH() + listSmartTrafficLight.getResponse().getResponse().getDocs().size());
									if(apiRequest.getNumFound() == 1L)
										o2.apiRequestSmartTrafficLight();
									eventBus.publish("websocketSmartTrafficLight", JsonObject.mapFrom(apiRequest).toString());
								}
								eventHandler.handle(Future.succeededFuture(ServiceResponse.completedWithJson(Buffer.buffer(new JsonObject().encodePrettily()))));
							}).onFailure(ex -> {
								eventHandler.handle(Future.failedFuture(ex));
							});
						} else {
							eventHandler.handle(Future.succeededFuture(ServiceResponse.completedWithJson(Buffer.buffer(new JsonObject().encodePrettily()))));
						}
					} catch(Exception ex) {
						LOG.error(String.format("patchSmartTrafficLight failed. "), ex);
						error(siteRequest, eventHandler, ex);
					}
				}).onFailure(ex -> {
					LOG.error(String.format("patchSmartTrafficLight failed. "), ex);
					error(siteRequest, eventHandler, ex);
				});
			} catch(Exception ex) {
				LOG.error(String.format("patchSmartTrafficLight failed. "), ex);
				error(null, eventHandler, ex);
			}
		}).onFailure(ex -> {
			LOG.error(String.format("patchSmartTrafficLight failed. "), ex);
			error(null, eventHandler, ex);
		});
	}

	public Future<SmartTrafficLight> patchSmartTrafficLightFuture(SmartTrafficLight o, Boolean inheritPk) {
		SiteRequestEnUS siteRequest = o.getSiteRequest_();
		Promise<SmartTrafficLight> promise = Promise.promise();

		try {
			ApiRequest apiRequest = siteRequest.getApiRequest_();
			Promise<SmartTrafficLight> promise1 = Promise.promise();
			pgPool.withTransaction(sqlConnection -> {
				siteRequest.setSqlConnection(sqlConnection);
				sqlPATCHSmartTrafficLight(o, inheritPk).onSuccess(smartTrafficLight -> {
					persistSmartTrafficLight(smartTrafficLight).onSuccess(c -> {
						relateSmartTrafficLight(smartTrafficLight).onSuccess(d -> {
							indexSmartTrafficLight(smartTrafficLight).onSuccess(e -> {
								promise1.complete(smartTrafficLight);
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
			}).compose(smartTrafficLight -> {
				Promise<SmartTrafficLight> promise2 = Promise.promise();
				refreshSmartTrafficLight(smartTrafficLight).onSuccess(a -> {
					promise2.complete(smartTrafficLight);
				}).onFailure(ex -> {
					promise2.fail(ex);
				});
				return promise2.future();
			}).onSuccess(smartTrafficLight -> {
				promise.complete(smartTrafficLight);
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		} catch(Exception ex) {
			LOG.error(String.format("patchSmartTrafficLightFuture failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	public Future<SmartTrafficLight> sqlPATCHSmartTrafficLight(SmartTrafficLight o, Boolean inheritPk) {
		Promise<SmartTrafficLight> promise = Promise.promise();
		try {
			SiteRequestEnUS siteRequest = o.getSiteRequest_();
			ApiRequest apiRequest = siteRequest.getApiRequest_();
			List<Long> pks = Optional.ofNullable(apiRequest).map(r -> r.getPks()).orElse(new ArrayList<>());
			List<String> classes = Optional.ofNullable(apiRequest).map(r -> r.getClasses()).orElse(new ArrayList<>());
			SqlConnection sqlConnection = siteRequest.getSqlConnection();
			Integer num = 1;
			StringBuilder bSql = new StringBuilder("UPDATE SmartTrafficLight SET ");
			List<Object> bParams = new ArrayList<Object>();
			Long pk = o.getPk();
			JsonObject jsonObject = siteRequest.getJsonObject();
			Set<String> methodNames = jsonObject.fieldNames();
			SmartTrafficLight o2 = new SmartTrafficLight();
			o2.setSiteRequest_(siteRequest);
			List<Future> futures1 = new ArrayList<>();
			List<Future> futures2 = new ArrayList<>();

			for(String entityVar : methodNames) {
				switch(entityVar) {
					case "setInheritPk":
							o2.setInheritPk(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SmartTrafficLight.VAR_inheritPk + "=$" + num);
							num++;
							bParams.add(o2.sqlInheritPk());
						break;
					case "setArchived":
							o2.setArchived(jsonObject.getBoolean(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SmartTrafficLight.VAR_archived + "=$" + num);
							num++;
							bParams.add(o2.sqlArchived());
						break;
					case "setDeleted":
							o2.setDeleted(jsonObject.getBoolean(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SmartTrafficLight.VAR_deleted + "=$" + num);
							num++;
							bParams.add(o2.sqlDeleted());
						break;
					case "setEntityId":
							o2.setEntityId(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SmartTrafficLight.VAR_entityId + "=$" + num);
							num++;
							bParams.add(o2.sqlEntityId());
						break;
					case "setSmartTrafficLightName":
							o2.setSmartTrafficLightName(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SmartTrafficLight.VAR_smartTrafficLightName + "=$" + num);
							num++;
							bParams.add(o2.sqlSmartTrafficLightName());
						break;
					case "setRouteIdNorth":
							o2.setRouteIdNorth(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SmartTrafficLight.VAR_routeIdNorth + "=$" + num);
							num++;
							bParams.add(o2.sqlRouteIdNorth());
						break;
					case "setRouteIdEast":
							o2.setRouteIdEast(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SmartTrafficLight.VAR_routeIdEast + "=$" + num);
							num++;
							bParams.add(o2.sqlRouteIdEast());
						break;
					case "setParamVehicleDemandScalingFactor":
							o2.setParamVehicleDemandScalingFactor(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SmartTrafficLight.VAR_paramVehicleDemandScalingFactor + "=$" + num);
							num++;
							bParams.add(o2.sqlParamVehicleDemandScalingFactor());
						break;
					case "setParamStepSize":
							o2.setParamStepSize(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SmartTrafficLight.VAR_paramStepSize + "=$" + num);
							num++;
							bParams.add(o2.sqlParamStepSize());
						break;
					case "setParamRunTime":
							o2.setParamRunTime(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SmartTrafficLight.VAR_paramRunTime + "=$" + num);
							num++;
							bParams.add(o2.sqlParamRunTime());
						break;
					case "setParamItersPerPar":
							o2.setParamItersPerPar(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SmartTrafficLight.VAR_paramItersPerPar + "=$" + num);
							num++;
							bParams.add(o2.sqlParamItersPerPar());
						break;
					case "setParamTotalIterNum":
							o2.setParamTotalIterNum(jsonObject.getString(entityVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(SmartTrafficLight.VAR_paramTotalIterNum + "=$" + num);
							num++;
							bParams.add(o2.sqlParamTotalIterNum());
						break;
					case "setReportKeys":
						JsonArray setReportKeysValues = Optional.ofNullable(jsonObject.getJsonArray(entityVar)).orElse(new JsonArray());
						setReportKeysValues.stream().map(oVal -> oVal.toString()).forEach(val -> {
							futures2.add(Future.future(promise2 -> {
								search(siteRequest).query(SimulationReport.class, val, inheritPk).onSuccess(pk2 -> {
									if(!pks.contains(pk2)) {
										pks.add(pk2);
										classes.add("SimulationReport");
									}
									sql(siteRequest).update(SimulationReport.class, pk2).set(SimulationReport.VAR_smartTrafficLightKey, SmartTrafficLight.class, pk).onSuccess(a -> {
										promise2.complete();
									}).onFailure(ex -> {
										promise2.fail(ex);
									});
								}).onFailure(ex -> {
									promise2.fail(ex);
								});
							}));
						});
						Optional.ofNullable(o.getReportKeys()).orElse(Arrays.asList()).stream().filter(oVal -> oVal != null && !setReportKeysValues.contains(oVal.toString())).forEach(pk2 -> {
							if(!pks.contains(pk2)) {
								pks.add(pk2);
								classes.add("SimulationReport");
							}
							futures2.add(Future.future(promise2 -> {
								sql(siteRequest).update(SimulationReport.class, pk2).setToNull(SimulationReport.VAR_smartTrafficLightKey, SmartTrafficLight.class, pk2).onSuccess(a -> {
									promise2.complete();
								}).onFailure(ex -> {
									promise2.fail(ex);
								});
							}));
						});
						break;
					case "addAllReportKeys":
						JsonArray addAllReportKeysValues = Optional.ofNullable(jsonObject.getJsonArray(entityVar)).orElse(new JsonArray());
						addAllReportKeysValues.stream().map(oVal -> oVal.toString()).forEach(val -> {
							futures2.add(Future.future(promise2 -> {
								search(siteRequest).query(SimulationReport.class, val, inheritPk).onSuccess(pk2 -> {
									if(!pks.contains(pk2)) {
										pks.add(pk2);
										classes.add("SimulationReport");
									}
									sql(siteRequest).update(SimulationReport.class, pk2).set(SimulationReport.VAR_smartTrafficLightKey, SmartTrafficLight.class, pk).onSuccess(a -> {
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
					case "addReportKeys":
						Optional.ofNullable(jsonObject.getString(entityVar)).ifPresent(val -> {
							futures2.add(Future.future(promise2 -> {
								search(siteRequest).query(SimulationReport.class, val, inheritPk).onSuccess(pk2 -> {
									if(!pks.contains(pk2)) {
										pks.add(pk2);
										classes.add("SimulationReport");
									}
									sql(siteRequest).update(SimulationReport.class, pk2).set(SimulationReport.VAR_smartTrafficLightKey, SmartTrafficLight.class, pk).onSuccess(a -> {
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
					case "removeReportKeys":
						Optional.ofNullable(jsonObject.getString(entityVar)).map(val -> Long.parseLong(val)).ifPresent(pk2 -> {
							if(!pks.contains(pk2)) {
								pks.add(pk2);
								classes.add("SimulationReport");
							}
							futures2.add(Future.future(promise2 -> {
								sql(siteRequest).update(SimulationReport.class, pk2).setToNull(SimulationReport.VAR_smartTrafficLightKey, SmartTrafficLight.class, pk2).onSuccess(a -> {
									promise2.complete();
								}).onFailure(ex -> {
									promise2.fail(ex);
								});
							}));
						});
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
						RuntimeException ex2 = new RuntimeException("value SmartTrafficLight failed", ex);
						LOG.error(String.format("relateSmartTrafficLight failed. "), ex2);
						a.handle(Future.failedFuture(ex2));
					});
				}));
			}
			CompositeFuture.all(futures1).onSuccess(a -> {
				CompositeFuture.all(futures2).onSuccess(b -> {
					SmartTrafficLight o3 = new SmartTrafficLight();
					o3.setSiteRequest_(o.getSiteRequest_());
					o3.setPk(pk);
					promise.complete(o3);
				}).onFailure(ex -> {
					LOG.error(String.format("sqlPATCHSmartTrafficLight failed. "), ex);
					promise.fail(ex);
				});
			}).onFailure(ex -> {
				LOG.error(String.format("sqlPATCHSmartTrafficLight failed. "), ex);
				promise.fail(ex);
			});
		} catch(Exception ex) {
			LOG.error(String.format("sqlPATCHSmartTrafficLight failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	public Future<ServiceResponse> response200PATCHSmartTrafficLight(SiteRequestEnUS siteRequest) {
		Promise<ServiceResponse> promise = Promise.promise();
		try {
			JsonObject json = new JsonObject();
			promise.complete(ServiceResponse.completedWithJson(Buffer.buffer(Optional.ofNullable(json).orElse(new JsonObject()).encodePrettily())));
		} catch(Exception ex) {
			LOG.error(String.format("response200PATCHSmartTrafficLight failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	// POST //

	@Override
	public void postSmartTrafficLight(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler) {
		LOG.debug(String.format("postSmartTrafficLight started. "));
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
				if(!Optional.ofNullable(config.getString(ConfigKeys.AUTH_ROLE_REQUIRED + "_SmartTrafficLight")).map(v -> RoleBasedAuthorization.create(v).match(siteRequest.getUser())).orElse(false)) {
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
						eventBus.publish("websocketSmartTrafficLight", JsonObject.mapFrom(apiRequest).toString());
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
						eventBus.request("smartabyar-smartvillage-enUS-SmartTrafficLight", json, new DeliveryOptions().addHeader("action", "postSmartTrafficLightFuture")).onSuccess(a -> {
							JsonObject responseMessage = (JsonObject)a.body();
							JsonObject responseBody = new JsonObject(Buffer.buffer(JsonUtil.BASE64_DECODER.decode(responseMessage.getString("payload"))));
							apiRequest.setPk(Long.parseLong(responseBody.getString("pk")));
							eventHandler.handle(Future.succeededFuture(ServiceResponse.completedWithJson(Buffer.buffer(responseBody.encodePrettily()))));
							LOG.debug(String.format("postSmartTrafficLight succeeded. "));
						}).onFailure(ex -> {
							LOG.error(String.format("postSmartTrafficLight failed. "), ex);
							error(siteRequest, eventHandler, ex);
						});
					} catch(Exception ex) {
						LOG.error(String.format("postSmartTrafficLight failed. "), ex);
						error(null, eventHandler, ex);
					}
				}
			});
		}).onFailure(ex -> {
			if("Inactive Token".equals(ex.getMessage()) || StringUtils.startsWith(ex.getMessage(), "invalid_grant:")) {
				try {
					eventHandler.handle(Future.succeededFuture(new ServiceResponse(302, "Found", null, MultiMap.caseInsensitiveMultiMap().add(HttpHeaders.LOCATION, "/logout?redirect_uri=" + URLEncoder.encode(serviceRequest.getExtra().getString("uri"), "UTF-8")))));
				} catch(Exception ex2) {
					LOG.error(String.format("postSmartTrafficLight failed. ", ex2));
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
				LOG.error(String.format("postSmartTrafficLight failed. "), ex);
				error(null, eventHandler, ex);
			}
		});
	}


	@Override
	public void postSmartTrafficLightFuture(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler) {
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
			postSmartTrafficLightFuture(siteRequest, false).onSuccess(o -> {
				eventHandler.handle(Future.succeededFuture(ServiceResponse.completedWithJson(Buffer.buffer(JsonObject.mapFrom(o).encodePrettily()))));
			}).onFailure(ex -> {
				eventHandler.handle(Future.failedFuture(ex));
			});
		}).onFailure(ex -> {
			if("Inactive Token".equals(ex.getMessage()) || StringUtils.startsWith(ex.getMessage(), "invalid_grant:")) {
				try {
					eventHandler.handle(Future.succeededFuture(new ServiceResponse(302, "Found", null, MultiMap.caseInsensitiveMultiMap().add(HttpHeaders.LOCATION, "/logout?redirect_uri=" + URLEncoder.encode(serviceRequest.getExtra().getString("uri"), "UTF-8")))));
				} catch(Exception ex2) {
					LOG.error(String.format("postSmartTrafficLight failed. ", ex2));
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
				LOG.error(String.format("postSmartTrafficLight failed. "), ex);
				error(null, eventHandler, ex);
			}
		});
	}

	public Future<SmartTrafficLight> postSmartTrafficLightFuture(SiteRequestEnUS siteRequest, Boolean inheritPk) {
		Promise<SmartTrafficLight> promise = Promise.promise();

		try {
			pgPool.withTransaction(sqlConnection -> {
				Promise<SmartTrafficLight> promise1 = Promise.promise();
				siteRequest.setSqlConnection(sqlConnection);
				createSmartTrafficLight(siteRequest).onSuccess(smartTrafficLight -> {
					sqlPOSTSmartTrafficLight(smartTrafficLight, inheritPk).onSuccess(b -> {
						persistSmartTrafficLight(smartTrafficLight).onSuccess(c -> {
							relateSmartTrafficLight(smartTrafficLight).onSuccess(d -> {
								indexSmartTrafficLight(smartTrafficLight).onSuccess(e -> {
									promise1.complete(smartTrafficLight);
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
			}).compose(smartTrafficLight -> {
				Promise<SmartTrafficLight> promise2 = Promise.promise();
				refreshSmartTrafficLight(smartTrafficLight).onSuccess(a -> {
					try {
						ApiRequest apiRequest = siteRequest.getApiRequest_();
						if(apiRequest != null) {
							apiRequest.setNumPATCH(apiRequest.getNumPATCH() + 1);
							smartTrafficLight.apiRequestSmartTrafficLight();
							eventBus.publish("websocketSmartTrafficLight", JsonObject.mapFrom(apiRequest).toString());
						}
						promise2.complete(smartTrafficLight);
					} catch(Exception ex) {
						LOG.error(String.format("postSmartTrafficLightFuture failed. "), ex);
						promise.fail(ex);
					}
				}).onFailure(ex -> {
					promise2.fail(ex);
				});
				return promise2.future();
			}).onSuccess(smartTrafficLight -> {
				promise.complete(smartTrafficLight);
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		} catch(Exception ex) {
			LOG.error(String.format("postSmartTrafficLightFuture failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	public Future<Void> sqlPOSTSmartTrafficLight(SmartTrafficLight o, Boolean inheritPk) {
		Promise<Void> promise = Promise.promise();
		try {
			SiteRequestEnUS siteRequest = o.getSiteRequest_();
			ApiRequest apiRequest = siteRequest.getApiRequest_();
			List<Long> pks = Optional.ofNullable(apiRequest).map(r -> r.getPks()).orElse(new ArrayList<>());
			List<String> classes = Optional.ofNullable(apiRequest).map(r -> r.getClasses()).orElse(new ArrayList<>());
			SqlConnection sqlConnection = siteRequest.getSqlConnection();
			Integer num = 1;
			StringBuilder bSql = new StringBuilder("UPDATE SmartTrafficLight SET ");
			List<Object> bParams = new ArrayList<Object>();
			Long pk = o.getPk();
			JsonObject jsonObject = siteRequest.getJsonObject();
			SmartTrafficLight o2 = new SmartTrafficLight();
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
					case SmartTrafficLight.VAR_inheritPk:
						o2.setInheritPk(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SmartTrafficLight.VAR_inheritPk + "=$" + num);
						num++;
						bParams.add(o2.sqlInheritPk());
						break;
					case SmartTrafficLight.VAR_created:
						o2.setCreated(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SmartTrafficLight.VAR_created + "=$" + num);
						num++;
						bParams.add(o2.sqlCreated());
						break;
					case SmartTrafficLight.VAR_archived:
						o2.setArchived(jsonObject.getBoolean(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SmartTrafficLight.VAR_archived + "=$" + num);
						num++;
						bParams.add(o2.sqlArchived());
						break;
					case SmartTrafficLight.VAR_deleted:
						o2.setDeleted(jsonObject.getBoolean(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SmartTrafficLight.VAR_deleted + "=$" + num);
						num++;
						bParams.add(o2.sqlDeleted());
						break;
					case SmartTrafficLight.VAR_sessionId:
						o2.setSessionId(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SmartTrafficLight.VAR_sessionId + "=$" + num);
						num++;
						bParams.add(o2.sqlSessionId());
						break;
					case SmartTrafficLight.VAR_userKey:
						o2.setUserKey(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SmartTrafficLight.VAR_userKey + "=$" + num);
						num++;
						bParams.add(o2.sqlUserKey());
						break;
					case SmartTrafficLight.VAR_entityId:
						o2.setEntityId(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SmartTrafficLight.VAR_entityId + "=$" + num);
						num++;
						bParams.add(o2.sqlEntityId());
						break;
					case SmartTrafficLight.VAR_smartTrafficLightName:
						o2.setSmartTrafficLightName(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SmartTrafficLight.VAR_smartTrafficLightName + "=$" + num);
						num++;
						bParams.add(o2.sqlSmartTrafficLightName());
						break;
					case SmartTrafficLight.VAR_routeIdNorth:
						o2.setRouteIdNorth(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SmartTrafficLight.VAR_routeIdNorth + "=$" + num);
						num++;
						bParams.add(o2.sqlRouteIdNorth());
						break;
					case SmartTrafficLight.VAR_routeIdEast:
						o2.setRouteIdEast(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SmartTrafficLight.VAR_routeIdEast + "=$" + num);
						num++;
						bParams.add(o2.sqlRouteIdEast());
						break;
					case SmartTrafficLight.VAR_paramVehicleDemandScalingFactor:
						o2.setParamVehicleDemandScalingFactor(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SmartTrafficLight.VAR_paramVehicleDemandScalingFactor + "=$" + num);
						num++;
						bParams.add(o2.sqlParamVehicleDemandScalingFactor());
						break;
					case SmartTrafficLight.VAR_paramStepSize:
						o2.setParamStepSize(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SmartTrafficLight.VAR_paramStepSize + "=$" + num);
						num++;
						bParams.add(o2.sqlParamStepSize());
						break;
					case SmartTrafficLight.VAR_paramRunTime:
						o2.setParamRunTime(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SmartTrafficLight.VAR_paramRunTime + "=$" + num);
						num++;
						bParams.add(o2.sqlParamRunTime());
						break;
					case SmartTrafficLight.VAR_paramItersPerPar:
						o2.setParamItersPerPar(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SmartTrafficLight.VAR_paramItersPerPar + "=$" + num);
						num++;
						bParams.add(o2.sqlParamItersPerPar());
						break;
					case SmartTrafficLight.VAR_paramTotalIterNum:
						o2.setParamTotalIterNum(jsonObject.getString(entityVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(SmartTrafficLight.VAR_paramTotalIterNum + "=$" + num);
						num++;
						bParams.add(o2.sqlParamTotalIterNum());
						break;
					case SmartTrafficLight.VAR_reportKeys:
						Optional.ofNullable(jsonObject.getJsonArray(entityVar)).orElse(new JsonArray()).stream().map(oVal -> oVal.toString()).forEach(val -> {
							futures2.add(Future.future(promise2 -> {
								search(siteRequest).query(SimulationReport.class, val, inheritPk).onSuccess(pk2 -> {
									if(!pks.contains(pk2)) {
										pks.add(pk2);
										classes.add("SimulationReport");
									}
									sql(siteRequest).update(SimulationReport.class, pk2).set(SimulationReport.VAR_smartTrafficLightKey, SmartTrafficLight.class, pk).onSuccess(a -> {
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
						RuntimeException ex2 = new RuntimeException("value SmartTrafficLight failed", ex);
						LOG.error(String.format("relateSmartTrafficLight failed. "), ex2);
						a.handle(Future.failedFuture(ex2));
					});
				}));
			}
			CompositeFuture.all(futures1).onSuccess(a -> {
				CompositeFuture.all(futures2).onSuccess(b -> {
					promise.complete();
				}).onFailure(ex -> {
					LOG.error(String.format("sqlPOSTSmartTrafficLight failed. "), ex);
					promise.fail(ex);
				});
			}).onFailure(ex -> {
				LOG.error(String.format("sqlPOSTSmartTrafficLight failed. "), ex);
				promise.fail(ex);
			});
		} catch(Exception ex) {
			LOG.error(String.format("sqlPOSTSmartTrafficLight failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	public Future<ServiceResponse> response200POSTSmartTrafficLight(SmartTrafficLight o) {
		Promise<ServiceResponse> promise = Promise.promise();
		try {
			SiteRequestEnUS siteRequest = o.getSiteRequest_();
			JsonObject json = JsonObject.mapFrom(o);
			promise.complete(ServiceResponse.completedWithJson(Buffer.buffer(Optional.ofNullable(json).orElse(new JsonObject()).encodePrettily())));
		} catch(Exception ex) {
			LOG.error(String.format("response200POSTSmartTrafficLight failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	// PUTImport //

	@Override
	public void putimportSmartTrafficLight(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler) {
		LOG.debug(String.format("putimportSmartTrafficLight started. "));
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
				if(!Optional.ofNullable(config.getString(ConfigKeys.AUTH_ROLE_REQUIRED + "_SmartTrafficLight")).map(v -> RoleBasedAuthorization.create(v).match(siteRequest.getUser())).orElse(false)) {
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
						try {
							ApiRequest apiRequest = new ApiRequest();
							JsonArray jsonArray = Optional.ofNullable(siteRequest.getJsonObject()).map(o -> o.getJsonArray("list")).orElse(new JsonArray());
							apiRequest.setRows(Long.valueOf(jsonArray.size()));
							apiRequest.setNumFound(Long.valueOf(jsonArray.size()));
							apiRequest.setNumPATCH(0L);
							apiRequest.initDeepApiRequest(siteRequest);
							siteRequest.setApiRequest_(apiRequest);
							eventBus.publish("websocketSmartTrafficLight", JsonObject.mapFrom(apiRequest).toString());
							varsSmartTrafficLight(siteRequest).onSuccess(d -> {
								listPUTImportSmartTrafficLight(apiRequest, siteRequest).onSuccess(e -> {
									response200PUTImportSmartTrafficLight(siteRequest).onSuccess(response -> {
										LOG.debug(String.format("putimportSmartTrafficLight succeeded. "));
										eventHandler.handle(Future.succeededFuture(response));
									}).onFailure(ex -> {
										LOG.error(String.format("putimportSmartTrafficLight failed. "), ex);
										error(siteRequest, eventHandler, ex);
									});
								}).onFailure(ex -> {
									LOG.error(String.format("putimportSmartTrafficLight failed. "), ex);
									error(siteRequest, eventHandler, ex);
								});
							}).onFailure(ex -> {
								LOG.error(String.format("putimportSmartTrafficLight failed. "), ex);
								error(siteRequest, eventHandler, ex);
							});
						} catch(Exception ex) {
							LOG.error(String.format("putimportSmartTrafficLight failed. "), ex);
							error(siteRequest, eventHandler, ex);
						}
					} catch(Exception ex) {
						LOG.error(String.format("putimportSmartTrafficLight failed. "), ex);
						error(null, eventHandler, ex);
					}
				}
			});
		}).onFailure(ex -> {
			if("Inactive Token".equals(ex.getMessage()) || StringUtils.startsWith(ex.getMessage(), "invalid_grant:")) {
				try {
					eventHandler.handle(Future.succeededFuture(new ServiceResponse(302, "Found", null, MultiMap.caseInsensitiveMultiMap().add(HttpHeaders.LOCATION, "/logout?redirect_uri=" + URLEncoder.encode(serviceRequest.getExtra().getString("uri"), "UTF-8")))));
				} catch(Exception ex2) {
					LOG.error(String.format("putimportSmartTrafficLight failed. ", ex2));
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
				LOG.error(String.format("putimportSmartTrafficLight failed. "), ex);
				error(null, eventHandler, ex);
			}
		});
	}


	public Future<Void> listPUTImportSmartTrafficLight(ApiRequest apiRequest, SiteRequestEnUS siteRequest) {
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
					eventBus.request("smartabyar-smartvillage-enUS-SmartTrafficLight", json, new DeliveryOptions().addHeader("action", "putimportSmartTrafficLightFuture")).onSuccess(a -> {
						promise1.complete();
					}).onFailure(ex -> {
						LOG.error(String.format("listPUTImportSmartTrafficLight failed. "), ex);
						promise1.fail(ex);
					});
				}));
			});
			CompositeFuture.all(futures).onSuccess(a -> {
				apiRequest.setNumPATCH(apiRequest.getNumPATCH() + 1);
				promise.complete();
			}).onFailure(ex -> {
				LOG.error(String.format("listPUTImportSmartTrafficLight failed. "), ex);
				promise.fail(ex);
			});
		} catch(Exception ex) {
			LOG.error(String.format("listPUTImportSmartTrafficLight failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	@Override
	public void putimportSmartTrafficLightFuture(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler) {
		user(serviceRequest, SiteRequestEnUS.class, SiteUser.class, "smartabyar-smartvillage-enUS-SiteUser", "postSiteUserFuture", "patchSiteUserFuture").onSuccess(siteRequest -> {
			try {
				ApiRequest apiRequest = new ApiRequest();
				apiRequest.setRows(1L);
				apiRequest.setNumFound(1L);
				apiRequest.setNumPATCH(0L);
				apiRequest.initDeepApiRequest(siteRequest);
				siteRequest.setApiRequest_(apiRequest);
				body.put("inheritPk", body.getValue("pk"));
				if(Optional.ofNullable(serviceRequest.getParams()).map(p -> p.getJsonObject("query")).map( q -> q.getJsonArray("var")).orElse(new JsonArray()).stream().filter(s -> "refresh:false".equals(s)).count() > 0L) {
					siteRequest.getRequestVars().put( "refresh", "false" );
				}

				SearchList<SmartTrafficLight> searchList = new SearchList<SmartTrafficLight>();
				searchList.setStore(true);
				searchList.q("*:*");
				searchList.setC(SmartTrafficLight.class);
				searchList.fq("deleted_docvalues_boolean:false");
				searchList.fq("archived_docvalues_boolean:false");
				searchList.fq("inheritPk_docvalues_string:" + SearchTool.escapeQueryChars(body.getString(SmartTrafficLight.VAR_pk)));
				searchList.promiseDeepForClass(siteRequest).onSuccess(a -> {
					try {
						if(searchList.size() >= 1) {
							SmartTrafficLight o = searchList.getList().stream().findFirst().orElse(null);
							SmartTrafficLight o2 = new SmartTrafficLight();
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
								patchSmartTrafficLightFuture(o, true).onSuccess(b -> {
									LOG.debug("Import SmartTrafficLight {} succeeded, modified SmartTrafficLight. ", body.getValue(SmartTrafficLight.VAR_pk));
									eventHandler.handle(Future.succeededFuture());
								}).onFailure(ex -> {
									LOG.error(String.format("putimportSmartTrafficLightFuture failed. "), ex);
									eventHandler.handle(Future.failedFuture(ex));
								});
							} else {
								eventHandler.handle(Future.succeededFuture());
							}
						} else {
							postSmartTrafficLightFuture(siteRequest, true).onSuccess(b -> {
								LOG.debug("Import SmartTrafficLight {} succeeded, created new SmartTrafficLight. ", body.getValue(SmartTrafficLight.VAR_pk));
								eventHandler.handle(Future.succeededFuture());
							}).onFailure(ex -> {
								LOG.error(String.format("putimportSmartTrafficLightFuture failed. "), ex);
								eventHandler.handle(Future.failedFuture(ex));
							});
						}
					} catch(Exception ex) {
						LOG.error(String.format("putimportSmartTrafficLightFuture failed. "), ex);
						eventHandler.handle(Future.failedFuture(ex));
					}
				}).onFailure(ex -> {
					LOG.error(String.format("putimportSmartTrafficLightFuture failed. "), ex);
					eventHandler.handle(Future.failedFuture(ex));
				});
			} catch(Exception ex) {
				LOG.error(String.format("putimportSmartTrafficLightFuture failed. "), ex);
				eventHandler.handle(Future.failedFuture(ex));
			}
		}).onFailure(ex -> {
			if("Inactive Token".equals(ex.getMessage()) || StringUtils.startsWith(ex.getMessage(), "invalid_grant:")) {
				try {
					eventHandler.handle(Future.succeededFuture(new ServiceResponse(302, "Found", null, MultiMap.caseInsensitiveMultiMap().add(HttpHeaders.LOCATION, "/logout?redirect_uri=" + URLEncoder.encode(serviceRequest.getExtra().getString("uri"), "UTF-8")))));
				} catch(Exception ex2) {
					LOG.error(String.format("putimportSmartTrafficLight failed. ", ex2));
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
				LOG.error(String.format("putimportSmartTrafficLight failed. "), ex);
				error(null, eventHandler, ex);
			}
		});
	}

	public Future<ServiceResponse> response200PUTImportSmartTrafficLight(SiteRequestEnUS siteRequest) {
		Promise<ServiceResponse> promise = Promise.promise();
		try {
			JsonObject json = new JsonObject();
			promise.complete(ServiceResponse.completedWithJson(Buffer.buffer(Optional.ofNullable(json).orElse(new JsonObject()).encodePrettily())));
		} catch(Exception ex) {
			LOG.error(String.format("response200PUTImportSmartTrafficLight failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	// SearchPage //

	@Override
	public void searchpageSmartTrafficLightId(ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler) {
		searchpageSmartTrafficLight(serviceRequest, eventHandler);
	}

	@Override
	public void searchpageSmartTrafficLight(ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler) {
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
				if(!Optional.ofNullable(config.getString(ConfigKeys.AUTH_ROLE_REQUIRED + "_SmartTrafficLight")).map(v -> RoleBasedAuthorization.create(v).match(siteRequest.getUser())).orElse(false)) {
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
						searchSmartTrafficLightList(siteRequest, false, true, false).onSuccess(listSmartTrafficLight -> {
							response200SearchPageSmartTrafficLight(listSmartTrafficLight).onSuccess(response -> {
								eventHandler.handle(Future.succeededFuture(response));
								LOG.debug(String.format("searchpageSmartTrafficLight succeeded. "));
							}).onFailure(ex -> {
								LOG.error(String.format("searchpageSmartTrafficLight failed. "), ex);
								error(siteRequest, eventHandler, ex);
							});
						}).onFailure(ex -> {
							LOG.error(String.format("searchpageSmartTrafficLight failed. "), ex);
							error(siteRequest, eventHandler, ex);
						});
					} catch(Exception ex) {
						LOG.error(String.format("searchpageSmartTrafficLight failed. "), ex);
						error(null, eventHandler, ex);
					}
				}
			});
		}).onFailure(ex -> {
			if("Inactive Token".equals(ex.getMessage()) || StringUtils.startsWith(ex.getMessage(), "invalid_grant:")) {
				try {
					eventHandler.handle(Future.succeededFuture(new ServiceResponse(302, "Found", null, MultiMap.caseInsensitiveMultiMap().add(HttpHeaders.LOCATION, "/logout?redirect_uri=" + URLEncoder.encode(serviceRequest.getExtra().getString("uri"), "UTF-8")))));
				} catch(Exception ex2) {
					LOG.error(String.format("searchpageSmartTrafficLight failed. ", ex2));
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
				LOG.error(String.format("searchpageSmartTrafficLight failed. "), ex);
				error(null, eventHandler, ex);
			}
		});
	}


	public void searchpageSmartTrafficLightPageInit(SmartTrafficLightPage page, SearchList<SmartTrafficLight> listSmartTrafficLight) {
	}

	public String templateSearchPageSmartTrafficLight() {
		return Optional.ofNullable(config.getString(ConfigKeys.TEMPLATE_PATH)).orElse("templates") + "/enUS/SmartTrafficLightPage";
	}
	public Future<ServiceResponse> response200SearchPageSmartTrafficLight(SearchList<SmartTrafficLight> listSmartTrafficLight) {
		Promise<ServiceResponse> promise = Promise.promise();
		try {
			SiteRequestEnUS siteRequest = listSmartTrafficLight.getSiteRequest_(SiteRequestEnUS.class);
			SmartTrafficLightPage page = new SmartTrafficLightPage();
			MultiMap requestHeaders = MultiMap.caseInsensitiveMultiMap();
			siteRequest.setRequestHeaders(requestHeaders);

			if(listSmartTrafficLight.size() == 1)
				siteRequest.setRequestPk(listSmartTrafficLight.get(0).getPk());
			page.setSearchListSmartTrafficLight_(listSmartTrafficLight);
			page.setSiteRequest_(siteRequest);
			page.promiseDeepSmartTrafficLightPage(siteRequest).onSuccess(a -> {
				JsonObject json = JsonObject.mapFrom(page);
				json.put(ConfigKeys.STATIC_BASE_URL, config.getString(ConfigKeys.STATIC_BASE_URL));
				json.put(ConfigKeys.GITHUB_ORG, config.getString(ConfigKeys.GITHUB_ORG));
				json.put(ConfigKeys.SITE_NAME, config.getString(ConfigKeys.SITE_NAME));
				json.put(ConfigKeys.SITE_DISPLAY_NAME, config.getString(ConfigKeys.SITE_DISPLAY_NAME));
				json.put(ConfigKeys.SITE_POWERED_BY_URL, config.getString(ConfigKeys.SITE_POWERED_BY_URL));
				json.put(ConfigKeys.SITE_POWERED_BY_NAME, config.getString(ConfigKeys.SITE_POWERED_BY_NAME));
				json.put(ConfigKeys.SITE_POWERED_BY_IMAGE_URI, config.getString(ConfigKeys.SITE_POWERED_BY_IMAGE_URI));
				templateEngine.render(json, templateSearchPageSmartTrafficLight()).onSuccess(buffer -> {
					promise.complete(new ServiceResponse(200, "OK", buffer, requestHeaders));
				}).onFailure(ex -> {
					promise.fail(ex);
				});
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		} catch(Exception ex) {
			LOG.error(String.format("response200SearchPageSmartTrafficLight failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	// General //

	public Future<SmartTrafficLight> createSmartTrafficLight(SiteRequestEnUS siteRequest) {
		Promise<SmartTrafficLight> promise = Promise.promise();
		try {
			SqlConnection sqlConnection = siteRequest.getSqlConnection();
			String userId = siteRequest.getUserId();
			Long userKey = siteRequest.getUserKey();
			ZonedDateTime created = Optional.ofNullable(siteRequest.getJsonObject()).map(j -> j.getString("created")).map(s -> ZonedDateTime.parse(s, ComputateZonedDateTimeSerializer.ZONED_DATE_TIME_FORMATTER.withZone(ZoneId.of(config.getString(ConfigKeys.SITE_ZONE))))).orElse(ZonedDateTime.now(ZoneId.of(config.getString(ConfigKeys.SITE_ZONE))));

			sqlConnection.preparedQuery("INSERT INTO SmartTrafficLight(created, userKey) VALUES($1, $2) RETURNING pk")
					.collecting(Collectors.toList())
					.execute(Tuple.of(created.toOffsetDateTime(), userKey)).onSuccess(result -> {
				Row createLine = result.value().stream().findFirst().orElseGet(() -> null);
				Long pk = createLine.getLong(0);
				SmartTrafficLight o = new SmartTrafficLight();
				o.setPk(pk);
				o.setSiteRequest_(siteRequest);
				promise.complete(o);
			}).onFailure(ex -> {
				RuntimeException ex2 = new RuntimeException(ex);
				LOG.error("createSmartTrafficLight failed. ", ex2);
				promise.fail(ex2);
			});
		} catch(Exception ex) {
			LOG.error(String.format("createSmartTrafficLight failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	public void searchSmartTrafficLightQ(SearchList<SmartTrafficLight> searchList, String entityVar, String valueIndexed, String varIndexed) {
		searchList.q(varIndexed + ":" + ("*".equals(valueIndexed) ? valueIndexed : SearchTool.escapeQueryChars(valueIndexed)));
		if(!"*".equals(entityVar)) {
		}
	}

	public String searchSmartTrafficLightFq(SearchList<SmartTrafficLight> searchList, String entityVar, String valueIndexed, String varIndexed) {
		if(varIndexed == null)
			throw new RuntimeException(String.format("\"%s\" is not an indexed entity. ", entityVar));
		if(StringUtils.startsWith(valueIndexed, "[")) {
			String[] fqs = StringUtils.substringBefore(StringUtils.substringAfter(valueIndexed, "["), "]").split(" TO ");
			if(fqs.length != 2)
				throw new RuntimeException(String.format("\"%s\" invalid range query. ", valueIndexed));
			String fq1 = fqs[0].equals("*") ? fqs[0] : SmartTrafficLight.staticSearchFqForClass(entityVar, searchList.getSiteRequest_(SiteRequestEnUS.class), fqs[0]);
			String fq2 = fqs[1].equals("*") ? fqs[1] : SmartTrafficLight.staticSearchFqForClass(entityVar, searchList.getSiteRequest_(SiteRequestEnUS.class), fqs[1]);
			 return varIndexed + ":[" + fq1 + " TO " + fq2 + "]";
		} else {
			return varIndexed + ":" + SearchTool.escapeQueryChars(SmartTrafficLight.staticSearchFqForClass(entityVar, searchList.getSiteRequest_(SiteRequestEnUS.class), valueIndexed)).replace("\\", "\\\\");
		}
	}

	public void searchSmartTrafficLightSort(SearchList<SmartTrafficLight> searchList, String entityVar, String valueIndexed, String varIndexed) {
		if(varIndexed == null)
			throw new RuntimeException(String.format("\"%s\" is not an indexed entity. ", entityVar));
		searchList.sort(varIndexed, valueIndexed);
	}

	public void searchSmartTrafficLightRows(SearchList<SmartTrafficLight> searchList, Long valueRows) {
			searchList.rows(valueRows != null ? valueRows : 10L);
	}

	public void searchSmartTrafficLightStart(SearchList<SmartTrafficLight> searchList, Long valueStart) {
		searchList.start(valueStart);
	}

	public void searchSmartTrafficLightVar(SearchList<SmartTrafficLight> searchList, String var, String value) {
		searchList.getSiteRequest_(SiteRequestEnUS.class).getRequestVars().put(var, value);
	}

	public void searchSmartTrafficLightUri(SearchList<SmartTrafficLight> searchList) {
	}

	public Future<ServiceResponse> varsSmartTrafficLight(SiteRequestEnUS siteRequest) {
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
					LOG.error(String.format("searchSmartTrafficLight failed. "), ex);
					promise.fail(ex);
				}
			});
			promise.complete();
		} catch(Exception ex) {
			LOG.error(String.format("searchSmartTrafficLight failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	public Future<SearchList<SmartTrafficLight>> searchSmartTrafficLightList(SiteRequestEnUS siteRequest, Boolean populate, Boolean store, Boolean modify) {
		Promise<SearchList<SmartTrafficLight>> promise = Promise.promise();
		try {
			ServiceRequest serviceRequest = siteRequest.getServiceRequest();
			String entityListStr = siteRequest.getServiceRequest().getParams().getJsonObject("query").getString("fl");
			String[] entityList = entityListStr == null ? null : entityListStr.split(",\\s*");
			SearchList<SmartTrafficLight> searchList = new SearchList<SmartTrafficLight>();
			String facetRange = null;
			Date facetRangeStart = null;
			Date facetRangeEnd = null;
			String facetRangeGap = null;
			String statsField = null;
			String statsFieldIndexed = null;
			searchList.setPopulate(populate);
			searchList.setStore(store);
			searchList.q("*:*");
			searchList.setC(SmartTrafficLight.class);
			searchList.setSiteRequest_(siteRequest);
			if(entityList != null) {
				for(String v : entityList) {
					searchList.fl(SmartTrafficLight.varIndexedSmartTrafficLight(v));
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
								varsIndexed[i] = SmartTrafficLight.varIndexedSmartTrafficLight(entityVar);
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
										varIndexed = SmartTrafficLight.varIndexedSmartTrafficLight(entityVar);
										String entityQ = searchSmartTrafficLightFq(searchList, entityVar, valueIndexed, varIndexed);
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
										varIndexed = SmartTrafficLight.varIndexedSmartTrafficLight(entityVar);
										String entityFq = searchSmartTrafficLightFq(searchList, entityVar, valueIndexed, varIndexed);
										mFq.appendReplacement(sb, entityFq);
										foundFq = mFq.find();
									}
									mFq.appendTail(sb);
									searchList.fq(sb.toString());
								}
							} else if(paramName.equals("sort")) {
								entityVar = StringUtils.trim(StringUtils.substringBefore((String)paramObject, " "));
								valueIndexed = StringUtils.trim(StringUtils.substringAfter((String)paramObject, " "));
								varIndexed = SmartTrafficLight.varIndexedSmartTrafficLight(entityVar);
								searchSmartTrafficLightSort(searchList, entityVar, valueIndexed, varIndexed);
							} else if(paramName.equals("start")) {
								valueStart = paramObject instanceof Long ? (Long)paramObject : Long.parseLong(paramObject.toString());
								searchSmartTrafficLightStart(searchList, valueStart);
							} else if(paramName.equals("rows")) {
								valueRows = paramObject instanceof Long ? (Long)paramObject : Long.parseLong(paramObject.toString());
								searchSmartTrafficLightRows(searchList, valueRows);
							} else if(paramName.equals("stats")) {
								searchList.stats((Boolean)paramObject);
							} else if(paramName.equals("stats.field")) {
								Matcher mStats = Pattern.compile("(?:(\\{![^\\}]+\\}))?(.*)").matcher((String)paramObject);
								boolean foundStats = mStats.find();
								if(foundStats) {
									String solrLocalParams = mStats.group(1);
									entityVar = mStats.group(2).trim();
									varIndexed = SmartTrafficLight.varIndexedSmartTrafficLight(entityVar);
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
									varIndexed = SmartTrafficLight.varIndexedSmartTrafficLight(entityVar);
									searchList.facetRange((solrLocalParams == null ? "" : solrLocalParams) + varIndexed);
									facetRange = entityVar;
								}
							} else if(paramName.equals("facet.field")) {
								entityVar = (String)paramObject;
								varIndexed = SmartTrafficLight.varIndexedSmartTrafficLight(entityVar);
								if(varIndexed != null)
									searchList.facetField(varIndexed);
							} else if(paramName.equals("var")) {
								entityVar = StringUtils.trim(StringUtils.substringBefore((String)paramObject, ":"));
								valueIndexed = URLDecoder.decode(StringUtils.trim(StringUtils.substringAfter((String)paramObject, ":")), "UTF-8");
								searchSmartTrafficLightVar(searchList, entityVar, valueIndexed);
							} else if(paramName.equals("cursorMark")) {
								valueCursorMark = (String)paramObject;
								searchList.cursorMark((String)paramObject);
							}
						}
						searchSmartTrafficLightUri(searchList);
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
			searchSmartTrafficLight2(siteRequest, populate, store, modify, searchList);
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
						LOG.error(String.format("searchSmartTrafficLight failed. "), ex);
						promise.fail(ex);
					});
				} else {
					promise.complete(searchList);
				}
			}).onFailure(ex -> {
				LOG.error(String.format("searchSmartTrafficLight failed. "), ex);
				promise.fail(ex);
			});
		} catch(Exception ex) {
			LOG.error(String.format("searchSmartTrafficLight failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}
	public void searchSmartTrafficLight2(SiteRequestEnUS siteRequest, Boolean populate, Boolean store, Boolean modify, SearchList<SmartTrafficLight> searchList) {
	}

	public Future<Void> persistSmartTrafficLight(SmartTrafficLight o) {
		Promise<Void> promise = Promise.promise();
		try {
			SiteRequestEnUS siteRequest = o.getSiteRequest_();
			SqlConnection sqlConnection = siteRequest.getSqlConnection();
			Long pk = o.getPk();
			sqlConnection.preparedQuery("SELECT * FROM SmartTrafficLight WHERE pk=$1")
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
									LOG.error(String.format("persistSmartTrafficLight failed. "), e);
								}
							}
						}
					}
					promise.complete();
				} catch(Exception ex) {
					LOG.error(String.format("persistSmartTrafficLight failed. "), ex);
					promise.fail(ex);
				}
			}).onFailure(ex -> {
				RuntimeException ex2 = new RuntimeException(ex);
				LOG.error(String.format("persistSmartTrafficLight failed. "), ex2);
				promise.fail(ex2);
			});
		} catch(Exception ex) {
			LOG.error(String.format("persistSmartTrafficLight failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	public Future<Void> relateSmartTrafficLight(SmartTrafficLight o) {
		Promise<Void> promise = Promise.promise();
		try {
			SiteRequestEnUS siteRequest = o.getSiteRequest_();
			SqlConnection sqlConnection = siteRequest.getSqlConnection();
			Long pk = o.getPk();
			sqlConnection.preparedQuery("SELECT pk as pk2, 'reportKeys' from SimulationReport where smartTrafficLightKey=$1")
					.collecting(Collectors.toList())
					.execute(Tuple.of(pk)
					).onSuccess(result -> {
				try {
					if(result != null) {
						for(Row definition : result.value()) {
							o.relateForClass(definition.getString(1), definition.getLong(0));
						}
					}
					promise.complete();
				} catch(Exception ex) {
					LOG.error(String.format("relateSmartTrafficLight failed. "), ex);
					promise.fail(ex);
				}
			}).onFailure(ex -> {
				RuntimeException ex2 = new RuntimeException(ex);
				LOG.error(String.format("relateSmartTrafficLight failed. "), ex2);
				promise.fail(ex2);
			});
		} catch(Exception ex) {
			LOG.error(String.format("relateSmartTrafficLight failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	public Future<Void> indexSmartTrafficLight(SmartTrafficLight o) {
		Promise<Void> promise = Promise.promise();
		try {
			SiteRequestEnUS siteRequest = o.getSiteRequest_();
			ApiRequest apiRequest = siteRequest.getApiRequest_();
			o.promiseDeepForClass(siteRequest).onSuccess(a -> {
				JsonObject json = new JsonObject();
				JsonObject add = new JsonObject();
				json.put("add", add);
				JsonObject doc = new JsonObject();
				add.put("doc", doc);
				o.indexSmartTrafficLight(doc);
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
					promise.complete();
				}).onFailure(ex -> {
					LOG.error(String.format("indexSmartTrafficLight failed. "), new RuntimeException(ex));
					promise.fail(ex);
				});
			}).onFailure(ex -> {
				LOG.error(String.format("indexSmartTrafficLight failed. "), ex);
				promise.fail(ex);
			});
		} catch(Exception ex) {
			LOG.error(String.format("indexSmartTrafficLight failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	public String searchVar(String varIndexed) {
		return SmartTrafficLight.searchVarSmartTrafficLight(varIndexed);
	}

	public Future<Void> refreshSmartTrafficLight(SmartTrafficLight o) {
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

					if("SimulationReport".equals(classSimpleName2) && pk2 != null) {
						SearchList<SimulationReport> searchList2 = new SearchList<SimulationReport>();
						searchList2.setStore(true);
						searchList2.q("*:*");
						searchList2.setC(SimulationReport.class);
						searchList2.fq("pk_docvalues_long:" + pk2);
						searchList2.rows(1L);
						futures.add(Future.future(promise2 -> {
							searchList2.promiseDeepSearchList(siteRequest).onSuccess(b -> {
								SimulationReport o2 = searchList2.getList().stream().findFirst().orElse(null);
								if(o2 != null) {
									JsonObject params = new JsonObject();
									params.put("body", new JsonObject());
									params.put("cookie", new JsonObject());
									params.put("path", new JsonObject());
									params.put("query", new JsonObject().put("q", "*:*").put("fq", new JsonArray().add("pk:" + pk2)).put("var", new JsonArray().add("refresh:false")));
									JsonObject context = new JsonObject().put("params", params).put("user", siteRequest.getUserPrincipal());
									JsonObject json = new JsonObject().put("context", context);
									eventBus.request("smartabyar-smartvillage-enUS-SimulationReport", json, new DeliveryOptions().addHeader("action", "patchSimulationReportFuture")).onSuccess(c -> {
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
					eventBus.request("smartabyar-smartvillage-enUS-SmartTrafficLight", json, new DeliveryOptions().addHeader("action", "patchSmartTrafficLightFuture")).onSuccess(c -> {
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
			LOG.error(String.format("refreshSmartTrafficLight failed. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}
}
