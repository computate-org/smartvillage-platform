package org.computate.smartvillageview.enus.model.htm;

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
public class SiteHtmEnUSApiServiceImpl extends SiteHtmEnUSGenApiServiceImpl {

	public SiteHtmEnUSApiServiceImpl(EventBus eventBus, JsonObject config, WorkerExecutor workerExecutor, PgPool pgPool, KafkaProducer<String, String> kafkaProducer, WebClient webClient, OAuth2Auth oauth2AuthenticationProvider, AuthorizationProvider authorizationProvider, HandlebarsTemplateEngine templateEngine) {
		super(eventBus, config, workerExecutor, pgPool, kafkaProducer, webClient, oauth2AuthenticationProvider, authorizationProvider, templateEngine);
	}

	@Override
	public Future<SiteHtm> patchSiteHtmFuture(SiteHtm o, Boolean inheritPk) {
		return super.patchSiteHtmFuture(o, inheritPk)
				.onSuccess(o2 -> LOG.info("PATCH SiteHtm {} succeeded", o2.getId()))
				.onFailure(ex -> LOG.error("PATCH SiteHtm {} failed", o.getId(), ex))
				;
	}

	@Override
	public Future<SiteHtm> postSiteHtmFuture(SiteRequestEnUS siteRequest, Boolean inheritPk) {
		return super.postSiteHtmFuture(siteRequest, inheritPk)
				.onSuccess(o2 -> LOG.info("POST SiteHtm {} succeeded", o2.getId()))
				.onFailure(ex -> LOG.error("POST SiteHtm failed", ex))
				;
	}
}
