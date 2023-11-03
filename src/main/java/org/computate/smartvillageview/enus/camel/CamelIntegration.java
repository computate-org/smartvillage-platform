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
package org.computate.smartvillageview.enus.camel;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.vertx.VertxComponent;
import org.apache.camel.impl.DefaultCamelContext;
import org.computate.smartvillageview.enus.config.ConfigKeys;
import org.computate.smartvillageview.enus.model.htm.SiteHtm;
import org.computate.smartvillageview.enus.model.page.SitePage;
import org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved;
import org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation;
import org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport;
import org.computate.smartvillageview.enus.vertx.MainVerticle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

public class CamelIntegration extends CamelIntegrationGen<Object> {
	private static final Logger LOG = LoggerFactory.getLogger(CamelIntegration.class);

	/**
	 * Val.Fail.enUS:The Camel Component was not configured properly. 
	 * Val.Complete.enUS:The Camel Component was configured properly. 
	 */
	public static Future<Void> configureCamel(Vertx vertx, JsonObject config) {
		Promise<Void> promise = Promise.promise();
		try {

			String importPageConsumer = String.format("%s-%s-%s-%s", MainVerticle.SITE_NAME, "enUS", SitePage.CLASS_SIMPLE_NAME, String.format("putimport%sFuture", SitePage.CLASS_SIMPLE_NAME));
			vertx.eventBus().consumer(importPageConsumer, message -> {
				vertx.eventBus().request(String.format("%s-%s-%s", MainVerticle.SITE_NAME, "enUS", SitePage.CLASS_SIMPLE_NAME), (JsonObject)message.body(), new DeliveryOptions().addHeader("action", String.format("putimport%sFuture", SitePage.CLASS_SIMPLE_NAME))).onSuccess(a -> {
					message.reply(a.body());
				}).onFailure(ex -> {
					LOG.error(String.format("Importing %s failed. ", SitePage.CLASS_SIMPLE_NAME), ex);
					message.reply(null);
				});
			});

			String importHtmConsumer = String.format("%s-%s-%s-%s", MainVerticle.SITE_NAME, "enUS", SiteHtm.CLASS_SIMPLE_NAME, String.format("putimport%sFuture", SiteHtm.CLASS_SIMPLE_NAME));
			vertx.eventBus().consumer(importHtmConsumer, message -> {
				vertx.eventBus().request(String.format("%s-%s-%s", MainVerticle.SITE_NAME, "enUS", SiteHtm.CLASS_SIMPLE_NAME), (JsonObject)message.body(), new DeliveryOptions().addHeader("action", String.format("putimport%sFuture", SiteHtm.CLASS_SIMPLE_NAME))).onSuccess(a -> {
					message.reply(a.body());
				}).onFailure(ex -> {
					LOG.error(String.format("Importing %s failed. ", SiteHtm.CLASS_SIMPLE_NAME), ex);
					message.reply(null);
				});
			});

			vertx.eventBus().consumer(String.format("%s-%s-%s-%s", MainVerticle.SITE_NAME, "enUS", SiteHtm.CLASS_SIMPLE_NAME, String.format("putimport%sFuture", SiteHtm.CLASS_SIMPLE_NAME)), message -> {
				vertx.eventBus().request(String.format("%s-%s-%s", MainVerticle.SITE_NAME, "enUS", SiteHtm.CLASS_SIMPLE_NAME), (JsonObject)message.body(), new DeliveryOptions().addHeader("action", String.format("putimport%sFuture", SiteHtm.CLASS_SIMPLE_NAME))).onSuccess(a -> {
					message.reply(a.body());
				}).onFailure(ex -> {
					LOG.error(String.format("Importing %s failed. ", SiteHtm.CLASS_SIMPLE_NAME), ex);
					message.reply(null);
				});
			});

			vertx.eventBus().consumer(String.format("%s-%s-%s-%s", MainVerticle.SITE_NAME, "enUS", SimulationReport.CLASS_SIMPLE_NAME, "patchSimulationReportFuture"), message -> {
				vertx.eventBus().request(String.format("%s-%s-%s", MainVerticle.SITE_NAME, "enUS", SimulationReport.CLASS_SIMPLE_NAME), (JsonObject)message.body(), new DeliveryOptions().addHeader("action", "patchSimulationReportFuture")).onSuccess(a -> {
					message.reply(a.body());
				}).onFailure(ex -> {
					LOG.error("Patching SimulationReport failed. ", ex);
					message.reply(null);
				});
			});

			vertx.eventBus().consumer(String.format("%s-%s-%s-%s", MainVerticle.SITE_NAME, "enUS", TrafficSimulation.CLASS_SIMPLE_NAME, "patchMessage"), message -> {
				vertx.eventBus().request(String.format("%s-%s-%s", MainVerticle.SITE_NAME, "enUS", TrafficSimulation.CLASS_SIMPLE_NAME), (JsonObject)message.body(), new DeliveryOptions().addHeader("action", "patchTrafficSimulationFuture")).onSuccess(a -> {
					message.reply(a.body());
				}).onFailure(ex -> {
					LOG.error(String.format("Patching %s failed. ", TrafficSimulation.CLASS_SIMPLE_NAME), ex);
					message.reply(null);
				});
			});

			DefaultCamelContext camelContext = new DefaultCamelContext();
			VertxComponent vertxComponent = new VertxComponent();
			vertxComponent.setVertx(vertx);
			camelContext.addComponent("vertx", vertxComponent);
			RouteBuilder routeBuilder = new RouteBuilder() {
				public void configure() {
					String securityProtocol = config.getString(ConfigKeys.KAFKA_SECURITY_PROTOCOL);

					from(String.format("vertx-kafka:%s?bootstrapServers=%s&groupId=%s&securityProtocol=%s&sslKeystoreLocation=%s&sslKeystorePassword=%s&sslTruststoreLocation=%s&sslTruststorePassword=%s&seekToPosition=end"
							, config.getString(ConfigKeys.KAFKA_TOPIC_SUMO_RUN_REPORT)
							, config.getString(ConfigKeys.KAFKA_BROKERS)
							, config.getString(ConfigKeys.KAFKA_GROUP)
							, config.getString(ConfigKeys.KAFKA_SECURITY_PROTOCOL)
							, config.getString(ConfigKeys.KAFKA_SSL_KEYSTORE_LOCATION)
							, config.getString(ConfigKeys.KAFKA_SSL_KEYSTORE_PASSWORD)
							, config.getString(ConfigKeys.KAFKA_SSL_TRUSTSTORE_LOCATION)
							, config.getString(ConfigKeys.KAFKA_SSL_TRUSTSTORE_PASSWORD)
							))
							.log(String.format("received %s event: ${body}", config.getString(ConfigKeys.KAFKA_TOPIC_SUMO_RUN_REPORT)))
							.bean(CamelIntegration.class, "exchangeToJsonObject")
							.bean(CamelIntegration.class, "wrapPkBodyInExchangeContext")
							.to("vertx:smartabyar-smartvillage-enUS-SimulationReport-patchSimulationReportFuture?exchangePattern=InOut")
					.end();

					from(String.format("vertx-kafka:%s?bootstrapServers=%s&groupId=%s&securityProtocol=%s&sslKeystoreLocation=%s&sslKeystorePassword=%s&sslTruststoreLocation=%s&sslTruststorePassword=%s&seekToPosition=end"
							, config.getString(ConfigKeys.KAFKA_TOPIC_SUMO_SIMULATION_INFO_PATCH)
							, config.getString(ConfigKeys.KAFKA_BROKERS)
							, config.getString(ConfigKeys.KAFKA_GROUP)
							, config.getString(ConfigKeys.KAFKA_SECURITY_PROTOCOL)
							, config.getString(ConfigKeys.KAFKA_SSL_KEYSTORE_LOCATION)
							, config.getString(ConfigKeys.KAFKA_SSL_KEYSTORE_PASSWORD)
							, config.getString(ConfigKeys.KAFKA_SSL_TRUSTSTORE_LOCATION)
							, config.getString(ConfigKeys.KAFKA_SSL_TRUSTSTORE_PASSWORD)
							))
							.log(String.format("received %s event: ${body}", config.getString(ConfigKeys.KAFKA_TOPIC_SUMO_SIMULATION_INFO_PATCH)))
							.bean(CamelIntegration.class, "exchangeToJsonObject")
							.bean(CamelIntegration.class, "wrapPkBodyInExchangeContext")
							.bean(CamelIntegration.class, "sendToSumoFalse")
							.to(String.format("vertx:%s-%s-%s-%s?exchangePattern=InOut", MainVerticle.SITE_NAME, "enUS", TrafficSimulation.CLASS_SIMPLE_NAME, "patchMessage"))
					.end();

					from(String.format("vertx-kafka:%s?bootstrapServers=%s&groupId=%s&securityProtocol=%s&sslKeystoreLocation=%s&sslKeystorePassword=%s&sslTruststoreLocation=%s&sslTruststorePassword=%s&seekToPosition=end"
							, config.getString(ConfigKeys.KAFKA_TOPIC_SUMO_TRAFFIC_FLOW_OBSERVED_INFO_PATCH)
							, config.getString(ConfigKeys.KAFKA_BROKERS)
							, config.getString(ConfigKeys.KAFKA_GROUP)
							, config.getString(ConfigKeys.KAFKA_SECURITY_PROTOCOL)
							, config.getString(ConfigKeys.KAFKA_SSL_KEYSTORE_LOCATION)
							, config.getString(ConfigKeys.KAFKA_SSL_KEYSTORE_PASSWORD)
							, config.getString(ConfigKeys.KAFKA_SSL_TRUSTSTORE_LOCATION)
							, config.getString(ConfigKeys.KAFKA_SSL_TRUSTSTORE_PASSWORD)
							))
							.log(String.format("received %s event: ${body}", config.getString(ConfigKeys.KAFKA_TOPIC_SUMO_TRAFFIC_FLOW_OBSERVED_INFO_PATCH)))
							.bean(CamelIntegration.class, "exchangeToJsonObject")
							.bean(CamelIntegration.class, "wrapPkBodyInExchangeContext")
							.bean(CamelIntegration.class, "sendToSumoFalse")
							.to(String.format("vertx:%s-%s-%s-%s?exchangePattern=InOut", MainVerticle.SITE_NAME, "enUS", TrafficFlowObserved.CLASS_SIMPLE_NAME, "patchMessage"))
					.end();
				}
			};
			routeBuilder.addRoutesToCamelContext(camelContext);
			camelContext.start();
			LOG.info(configureCamelComplete);
			promise.complete();
		} catch(Exception ex) {
			LOG.error(configureCamelFail);
			promise.fail(ex);
		}

		return promise.future();
	}

	/**
	 * Description: Converts a Camel exchange message to a JsonObject. 
	 */
	public JsonObject exchangeToJsonObject(Exchange exchange) {
		String str = (String)exchange.getIn().getBody();
		JsonObject body = new JsonObject(str);
		return body;
	}

	/**
	 * Description: Prepares a message record to be put on the event bus
	 */
	public JsonObject wrapPkBodyInExchangeContext(JsonObject exchangeBody) {

		JsonObject params = new JsonObject();
		params.put("body", exchangeBody);
		params.put("cookie", new JsonObject());
		params.put("header", new JsonObject());
		params.put("form", new JsonObject());
		params.put("path", new JsonObject());
		JsonObject query = new JsonObject();
		query.put("softCommit", true);
		query.put("fq", new JsonArray().add(String.format("pk:%s", exchangeBody.getString("pk"))));
		params.put("query", query);
		JsonObject context = new JsonObject().put("params", params);
		JsonObject json = new JsonObject().put("context", context);
		return json;
	}

	/**
	 * Description: Prepares a message record to be put on the event bus
	 */
	public JsonObject sendToSumoFalse(JsonObject json) {

		JsonObject context = json.getJsonObject("context");
		JsonObject params = context.getJsonObject("params");
		JsonObject query = params.getJsonObject("query");
		query.put("var", new JsonArray().add("sendToSumo:false"));
		return json;
	}
}
