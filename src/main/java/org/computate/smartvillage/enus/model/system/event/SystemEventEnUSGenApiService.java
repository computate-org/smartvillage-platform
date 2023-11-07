/*
 * Copyright (c) 2018-2022 Computate Limited Liability Company in Utah, USA,
 * and the Smarta Byar Smart Village FIWARE IHub. 
 *
 * This program and the accompanying materials are made available under the
 * terms of the GNU GENERAL PUBLIC LICENSE Version 3 which is available at
 * 
 * https://www.gnu.org/licenses/gpl-3.0.en.html
 * 
 * You may not propagate or modify a covered work except as expressly provided 
 * under this License. Any attempt otherwise to propagate or modify it is void, 
 * and will automatically terminate your rights under this License (including 
 * any patent licenses granted under the third paragraph of section 11).
 */
package org.computate.smartvillage.enus.model.system.event;

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
public interface SystemEventEnUSGenApiService {
	static void registerService(EventBus eventBus, JsonObject config, WorkerExecutor workerExecutor, PgPool pgPool, KafkaProducer<String, String> kafkaProducer, WebClient webClient, OAuth2Auth oauth2AuthenticationProvider, AuthorizationProvider authorizationProvider, HandlebarsTemplateEngine templateEngine, Vertx vertx) {
		new ServiceBinder(vertx).setAddress(SystemEvent.CLASS_API_ADDRESS).register(SystemEventEnUSGenApiService.class, new SystemEventEnUSApiServiceImpl(eventBus, config, workerExecutor, pgPool, kafkaProducer, webClient, oauth2AuthenticationProvider, authorizationProvider, templateEngine));
	}

	public void searchSystemEvent(ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler);
	public void getSystemEvent(ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler);
	public void postSystemEvent(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler);
	public void postSystemEventFuture(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler);
	public void patchSystemEvent(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler);
	public void patchSystemEventFuture(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler);
	public void putimportSystemEvent(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler);
	public void putimportSystemEventFuture(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler);
	public void searchpageSystemEventId(ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler);
	public void searchpageSystemEvent(ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler);
}
