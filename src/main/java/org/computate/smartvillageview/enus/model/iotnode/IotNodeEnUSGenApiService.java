package org.computate.smartvillageview.enus.model.iotnode;

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
import io.vertx.ext.auth.oauth2.OAuth2Auth;
import io.vertx.ext.auth.authorization.AuthorizationProvider;

/**
 * Translate: false
 * Gen: false
 **/
@WebApiServiceGen
@ProxyGen
public interface IotNodeEnUSGenApiService {
	static void registerService(EventBus eventBus, JsonObject config, WorkerExecutor workerExecutor, PgPool pgPool, WebClient webClient, OAuth2Auth oauth2AuthenticationProvider, AuthorizationProvider authorizationProvider, HandlebarsTemplateEngine templateEngine, Vertx vertx) {
		new ServiceBinder(vertx).setAddress("smart-village-view-enUS-IotNode").register(IotNodeEnUSGenApiService.class, new IotNodeEnUSApiServiceImpl(eventBus, config, workerExecutor, pgPool, webClient, oauth2AuthenticationProvider, authorizationProvider, templateEngine));
	}

	public void searchIotNode(ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler);
	public void patchIotNode(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler);
	public void patchIotNodeFuture(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler);
	public void postIotNode(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler);
	public void postIotNodeFuture(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler);
	public void putimportIotNode(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler);
	public void putimportIotNodeFuture(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler);
	public void searchpageIotNodeId(ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler);
	public void searchpageIotNode(ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler);
}
