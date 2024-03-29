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
package org.computate.smartvillage.enus.model.page;

import io.vertx.ext.auth.authorization.AuthorizationProvider;
import io.vertx.ext.auth.oauth2.OAuth2Auth;
import io.vertx.ext.web.client.WebClient;
import io.vertx.core.eventbus.EventBus;

import org.computate.smartvillage.enus.model.htm.SiteHtm;
import org.computate.smartvillage.enus.request.SiteRequestEnUS;

import io.vertx.core.Future;
import io.vertx.core.WorkerExecutor;
import io.vertx.core.json.JsonObject;
import io.vertx.pgclient.PgPool;
import io.vertx.ext.web.templ.handlebars.HandlebarsTemplateEngine;
import io.vertx.kafka.client.producer.KafkaProducer;

/**
 * Translate: false
 **/
public class SitePageEnUSApiServiceImpl extends SitePageEnUSGenApiServiceImpl {

	public SitePageEnUSApiServiceImpl(EventBus eventBus, JsonObject config, WorkerExecutor workerExecutor, PgPool pgPool, KafkaProducer<String, String> kafkaProducer, WebClient webClient, OAuth2Auth oauth2AuthenticationProvider, AuthorizationProvider authorizationProvider, HandlebarsTemplateEngine templateEngine) {
		super(eventBus, config, workerExecutor, pgPool, kafkaProducer, webClient, oauth2AuthenticationProvider, authorizationProvider, templateEngine);
	}

	@Override
	public Future<SitePage> patchSitePageFuture(SitePage o, Boolean inheritPk) {
		return super.patchSitePageFuture(o, inheritPk)
				.onSuccess(o2 -> LOG.info("PATCH SitePage {} succeeded", o2.getId()))
				.onFailure(ex -> LOG.error("PATCH SitePage {} failed", o.getId(), ex))
				;
	}

	@Override
	public Future<SitePage> postSitePageFuture(SiteRequestEnUS siteRequest, Boolean inheritPk) {
		return super.postSitePageFuture(siteRequest, inheritPk)
				.onSuccess(o2 -> LOG.info("POST SitePage {} succeeded", o2.getId()))
				.onFailure(ex -> LOG.error("POST SitePage failed", ex))
				;
	}
}
