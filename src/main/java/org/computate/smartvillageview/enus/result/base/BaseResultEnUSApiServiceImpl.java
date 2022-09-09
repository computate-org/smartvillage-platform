package org.computate.smartvillageview.enus.result.base;

import io.vertx.ext.auth.authorization.AuthorizationProvider;
import io.vertx.ext.auth.oauth2.OAuth2Auth;
import io.vertx.ext.web.client.WebClient;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.WorkerExecutor;
import io.vertx.core.json.JsonObject;
import io.vertx.pgclient.PgPool;
import io.vertx.ext.web.templ.handlebars.HandlebarsTemplateEngine;

/**
 * Translate: false
 **/
public class BaseResultEnUSApiServiceImpl extends BaseResultEnUSGenApiServiceImpl {

	public BaseResultEnUSApiServiceImpl(EventBus eventBus, JsonObject config, WorkerExecutor workerExecutor, PgPool pgPool, WebClient webClient, OAuth2Auth oauth2AuthenticationProvider, AuthorizationProvider authorizationProvider, HandlebarsTemplateEngine templateEngine) {
		super(eventBus, config, workerExecutor, pgPool, webClient, oauth2AuthenticationProvider, authorizationProvider, templateEngine);
	}
}
