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
package org.computate.smartvillage.enus.model.iotnode;

import java.util.Optional;

import org.computate.search.tool.SearchTool;
import org.computate.smartvillage.enus.config.ConfigKeys;

import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.WorkerExecutor;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.auth.authorization.AuthorizationProvider;
import io.vertx.ext.auth.oauth2.OAuth2Auth;
import io.vertx.ext.web.client.WebClient;
import io.vertx.ext.web.client.predicate.ResponsePredicate;
import io.vertx.ext.web.templ.handlebars.HandlebarsTemplateEngine;
import io.vertx.kafka.client.producer.KafkaProducer;
import io.vertx.pgclient.PgPool;

/**
 * Translate: false
 **/
public class IotNodeEnUSApiServiceImpl extends IotNodeEnUSGenApiServiceImpl {

	public IotNodeEnUSApiServiceImpl(EventBus eventBus, JsonObject config, WorkerExecutor workerExecutor, PgPool pgPool, KafkaProducer<String, String> kafkaProducer, WebClient webClient, OAuth2Auth oauth2AuthenticationProvider, AuthorizationProvider authorizationProvider, HandlebarsTemplateEngine templateEngine) {
		super(eventBus, config, workerExecutor, pgPool, kafkaProducer, webClient, oauth2AuthenticationProvider, authorizationProvider, templateEngine);
	}

//	@Override
//	public Future<Void> persistIotNode(IotNode o, Boolean patch) {
//		Promise<Void> promise = Promise.promise();
//		super.persistIotNode(o, patch).onComplete(a -> {
//			o.promiseDeepIotNode().onSuccess(b -> {
//				JsonObject json = fiwareIotNode(o, patch);
//				if(json.size() > 0) {
//					webClient.request(
//									patch ? HttpMethod.PUT : HttpMethod.POST 
//									, config.getInteger(ConfigKeys.FIWARE_PORT)
//									, config.getString(ConfigKeys.FIWARE_HOST_NAME)
//									, String.format("%s/entities%s", config.getString(ConfigKeys.FIWARE_API_URI), patch ? String.format("/%s/attrs", SearchTool.urlEncode(o.getNodeId())) : "")
//							).ssl(config.getBoolean(ConfigKeys.FIWARE_SSL))
//							.putHeader("Content-Type", "application/json")
//							.sendBuffer(json.toBuffer())
//							.onSuccess(c -> {
//						if(c.statusCode() == 200 || c.statusCode() == 201 || c.statusCode() == 204 || c.statusCode() == 422) {
//							promise.complete();
//						} else {
//							RuntimeException ex = new RuntimeException();
//							LOG.error(String.format("indexIotNode failed: %s", c.statusMessage()), ex);
//							json.toString();
//							o.toString();
//							promise.fail(ex);
//						}
//					}).onFailure(ex -> {
//						promise.fail(ex);
//					});
//				} else {
//					promise.complete();
//				}
//			}).onFailure(ex -> {
//				promise.fail(ex);
//			});
//		}).onFailure(ex -> {
//			promise.fail(ex);
//		});
//		return promise.future();
//	}

	public JsonObject fiwareIotNode(IotNode o, Boolean patch) {
		JsonObject json = new JsonObject();
		if(!patch) {
			json.put("id", o.getNodeId());
			json.put("type", IotNode.CLASS_SIMPLE_NAME);
		}
		Optional.ofNullable(o.getLocation()).ifPresent(v -> {
			json.put("location", new JsonObject().put("type", "StructuredValue").put("metadata", new JsonObject())
					.put("value", new JsonObject()
							.put("type", "Point")
							.put("coordinates", new JsonArray().add(v.getX()).add(v.getY()))
							)
					);
		});
		Optional.ofNullable(o.getJson_temperature()).ifPresent(v -> {
			json.put("temperature", new JsonObject().put("type", "Number").put("metadata", new JsonObject()).put("value", v.doubleValue()));
		});
		return json;
	}
}
