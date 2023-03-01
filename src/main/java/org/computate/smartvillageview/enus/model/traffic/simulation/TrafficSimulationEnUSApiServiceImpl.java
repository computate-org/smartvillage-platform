package org.computate.smartvillageview.enus.model.traffic.simulation;

import java.util.Optional;

import org.computate.smartvillageview.enus.config.ConfigKeys;
import org.computate.smartvillageview.enus.request.SiteRequestEnUS;

import io.vertx.core.Future;
import io.vertx.core.WorkerExecutor;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.auth.authorization.AuthorizationProvider;
import io.vertx.ext.auth.oauth2.OAuth2Auth;
import io.vertx.ext.web.client.WebClient;
import io.vertx.ext.web.templ.handlebars.HandlebarsTemplateEngine;
import io.vertx.kafka.client.producer.KafkaProducer;
import io.vertx.pgclient.PgPool;

/**
 * Translate: false
 **/
public class TrafficSimulationEnUSApiServiceImpl extends TrafficSimulationEnUSGenApiServiceImpl {

	public TrafficSimulationEnUSApiServiceImpl(EventBus eventBus, JsonObject config, WorkerExecutor workerExecutor, PgPool pgPool, KafkaProducer<String, String> kafkaProducer, WebClient webClient, OAuth2Auth oauth2AuthenticationProvider, AuthorizationProvider authorizationProvider, HandlebarsTemplateEngine templateEngine) {
		super(eventBus, config, workerExecutor, pgPool, kafkaProducer, webClient, oauth2AuthenticationProvider, authorizationProvider, templateEngine);
	}

	@Override
	public Future<TrafficSimulation> postTrafficSimulationFuture(SiteRequestEnUS siteRequest, Boolean inheritPk) {
		// TODO Auto-generated method stub
		return super.postTrafficSimulationFuture(siteRequest, inheritPk);
	}

	@Override
	public Future<TrafficSimulation> patchTrafficSimulationFuture(TrafficSimulation o, Boolean inheritPk) {
		// TODO Auto-generated method stub
		return super.patchTrafficSimulationFuture(o, inheritPk);
	}
}
