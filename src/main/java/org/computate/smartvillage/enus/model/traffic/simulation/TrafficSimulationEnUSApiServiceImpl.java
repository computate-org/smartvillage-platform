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
package org.computate.smartvillage.enus.model.traffic.simulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.computate.smartvillage.enus.config.ConfigKeys;
import org.computate.smartvillage.enus.model.traffic.simulation.report.SimulationReport;
import org.computate.smartvillage.enus.request.SiteRequestEnUS;
import org.computate.vertx.api.ApiRequest;

import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.WorkerExecutor;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.auth.authorization.AuthorizationProvider;
import io.vertx.ext.auth.oauth2.OAuth2Auth;
import io.vertx.ext.web.client.WebClient;
import io.vertx.ext.web.templ.handlebars.HandlebarsTemplateEngine;
import io.vertx.kafka.client.producer.KafkaProducer;
import io.vertx.kafka.client.producer.KafkaProducerRecord;
import io.vertx.pgclient.PgPool;

/**
 * Translate: false
 **/
public class TrafficSimulationEnUSApiServiceImpl extends TrafficSimulationEnUSGenApiServiceImpl {

	public TrafficSimulationEnUSApiServiceImpl(EventBus eventBus, JsonObject config, WorkerExecutor workerExecutor, PgPool pgPool, KafkaProducer<String, String> kafkaProducer, WebClient webClient, OAuth2Auth oauth2AuthenticationProvider, AuthorizationProvider authorizationProvider, HandlebarsTemplateEngine templateEngine) {
		super(eventBus, config, workerExecutor, pgPool, kafkaProducer, webClient, oauth2AuthenticationProvider, authorizationProvider, templateEngine);
	}

	@Override
	public Future<TrafficSimulation> sqlPATCHTrafficSimulation(TrafficSimulation o, Boolean inheritPk) {
		SiteRequestEnUS siteRequest = o.getSiteRequest_();
		ApiRequest apiRequest = siteRequest.getApiRequest_();
		List<Long> pks = Optional.ofNullable(apiRequest).map(r -> r.getPks()).orElse(new ArrayList<>());
		List<String> classes = Optional.ofNullable(apiRequest).map(r -> r.getClasses()).orElse(new ArrayList<>());
		for(Long key : o.getReportKeys()) {
			pks.add(key);
			classes.add(SimulationReport.CLASS_SIMPLE_NAME);
		}
		return super.sqlPATCHTrafficSimulation(o, inheritPk);
	}

	@Override
	public Future<Void> sqlPOSTTrafficSimulation(TrafficSimulation o, Boolean inheritPk) {
		SiteRequestEnUS siteRequest = o.getSiteRequest_();
		ApiRequest apiRequest = siteRequest.getApiRequest_();
		List<Long> pks = Optional.ofNullable(apiRequest).map(r -> r.getPks()).orElse(new ArrayList<>());
		List<String> classes = Optional.ofNullable(apiRequest).map(r -> r.getClasses()).orElse(new ArrayList<>());
		for(Long key : o.getReportKeys()) {
			pks.add(key);
			classes.add(SimulationReport.CLASS_SIMPLE_NAME);
		}
		return super.sqlPOSTTrafficSimulation(o, inheritPk);
	}

	@Override
	public Future<TrafficSimulation> postTrafficSimulationFuture(SiteRequestEnUS siteRequest, Boolean inheritPk) {
		Promise<TrafficSimulation> promise = Promise.promise();
		super.postTrafficSimulationFuture(siteRequest, inheritPk).onSuccess(o -> {
			if(
					"false".equals(o.getSiteRequest_().getRequestVars().get("sendToSumo"))
					|| "false".equals(o.getSiteRequest_().getRequestVars().get("refresh"))
					) {
				promise.complete(o);
			} else {
				sendSumoSimulationInfo(o).onSuccess(b -> {
					promise.complete(o);
				}).onFailure(ex -> {
					promise.fail(ex);
				});
			}
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	@Override
	public Future<TrafficSimulation> patchTrafficSimulationFuture(TrafficSimulation o, Boolean inheritPk) {
		Promise<TrafficSimulation> promise = Promise.promise();
		super.patchTrafficSimulationFuture(o, inheritPk).onSuccess(a -> {
			if(
					"false".equals(o.getSiteRequest_().getRequestVars().get("sendToSumo"))
					|| "false".equals(o.getSiteRequest_().getRequestVars().get("refresh"))
					) {
				promise.complete(o);
			} else {
				sendSumoSimulationInfo(o).onSuccess(b -> {
					promise.complete(a);
				}).onFailure(ex -> {
					promise.fail(ex);
				});
			}
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> sendSumoSimulationInfo(TrafficSimulation o) {
		Promise<Void> promise = Promise.promise();
		LOG.info("Sending location info record to kafka");
		try {
			JsonObject body = JsonObject.mapFrom(o);
			String topic = config.getString(ConfigKeys.KAFKA_TOPIC_SUMO_SIMULATION_INFO);
			KafkaProducerRecord<String, String> record = KafkaProducerRecord.create(topic, body.encode());
			kafkaProducer.send(record).onSuccess(recordMetadata -> {
				LOG.info(String.format("Sent record to kafka topic %s: %s", topic, body.encode()));
				promise.complete();
			}).onFailure(ex -> {
				LOG.error(String.format("Could not send record to kafka topic %s: %s", topic, body.encode()), ex);
				promise.fail(ex);
			});
		} catch(Exception ex) {
			LOG.error(String.format("Could not send record to kafka: %s", Optional.ofNullable(JsonObject.mapFrom(o)).map(b -> b.encode()).orElse("")), ex);
			promise.fail(ex);
		}
		return promise.future();
	}
}
