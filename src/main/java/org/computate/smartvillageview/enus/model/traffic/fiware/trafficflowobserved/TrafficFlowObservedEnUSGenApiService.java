package org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved;

import io.vertx.ext.web.client.WebClient;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.serviceproxy.ServiceBinder;
import io.vertx.core.AsyncResult;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.ext.web.api.service.WebApiServiceGen;
import io.vertx.ext.web.api.service.ServiceRequest;
import io.vertx.ext.web.api.service.ServiceResponse;
import io.vertx.ext.web.templ.handlebars.HandlebarsTemplateEngine;
import io.vertx.core.WorkerExecutor;
import io.vertx.pgclient.PgPool;
import io.vertx.kafka.client.producer.KafkaProducer;
import io.vertx.ext.auth.oauth2.OAuth2Auth;
import io.vertx.ext.auth.authorization.AuthorizationProvider;

/**
 * Translate: false
 * Gen: false
 * Generated: true
 **/
@WebApiServiceGen
@ProxyGen
public interface TrafficFlowObservedEnUSGenApiService {
	static void registerService(EventBus eventBus, JsonObject config, WorkerExecutor workerExecutor, PgPool pgPool, KafkaProducer<String, String> kafkaProducer, WebClient webClient, OAuth2Auth oauth2AuthenticationProvider, AuthorizationProvider authorizationProvider, HandlebarsTemplateEngine templateEngine, Vertx vertx) {
		new ServiceBinder(vertx).setAddress("smartabyar-smartvillage-enUS-TrafficFlowObserved").register(TrafficFlowObservedEnUSGenApiService.class, new TrafficFlowObservedEnUSApiServiceImpl(eventBus, config, workerExecutor, pgPool, kafkaProducer, webClient, oauth2AuthenticationProvider, authorizationProvider, templateEngine));
	}

	public void searchTrafficFlowObserved(ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler);
	public void getTrafficFlowObserved(ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler);
	public void patchTrafficFlowObserved(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler);
	public void patchTrafficFlowObservedFuture(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler);
	public void postTrafficFlowObserved(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler);
	public void postTrafficFlowObservedFuture(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler);
	public void putimportTrafficFlowObserved(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler);
	public void putimportTrafficFlowObservedFuture(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler);
	public void searchpageTrafficFlowObservedId(ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler);
	public void searchpageTrafficFlowObserved(ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler);
}
