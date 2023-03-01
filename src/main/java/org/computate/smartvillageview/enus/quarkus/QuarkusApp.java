package org.computate.smartvillageview.enus.quarkus;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.computate.smartvillageview.enus.config.ConfigKeys;
import org.computate.smartvillageview.enus.request.SiteRequestEnUS;
import org.computate.smartvillageview.enus.vertx.MainVerticle;
import org.computate.vertx.openapi.OpenApi3Generator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.StartupEvent;
import io.quarkus.runtime.annotations.QuarkusMain;
import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.ext.web.client.WebClient;
import io.vertx.ext.web.client.WebClientOptions;


@QuarkusMain
@ApplicationScoped
public class QuarkusApp extends MainVerticle {
	private static final Logger LOG = LoggerFactory.getLogger(QuarkusApp.class);

	@Inject
	Vertx vertx;

	public static void main(String...args) {
		Quarkus.run(args);
	}

	public void init(@Observes StartupEvent ev) {
		String configPath = System.getenv(ConfigKeys.CONFIG_PATH);
		configureConfig(vertx).onSuccess(config -> {
			try {
				Future<Void> originalFuture = Future.future(a -> a.complete());
				Future<Void> future = originalFuture;
				WebClient webClient = WebClient.create(vertx, new WebClientOptions().setVerifyHost(false).setTrustAll(true));
				Boolean runOpenApi3Generator = Optional.ofNullable(config.getBoolean(ConfigKeys.RUN_OPENAPI3_GENERATOR)).orElse(false);
				Boolean runSqlGenerator = Optional.ofNullable(config.getBoolean(ConfigKeys.RUN_SQL_GENERATOR)).orElse(false);
				Boolean runArticleGenerator = Optional.ofNullable(config.getBoolean(ConfigKeys.RUN_ARTICLE_GENERATOR)).orElse(false);

				if(runOpenApi3Generator || runSqlGenerator || runArticleGenerator) {
					SiteRequestEnUS siteRequest = new SiteRequestEnUS();
					siteRequest.setConfig(config);
					siteRequest.setWebClient(webClient);
					siteRequest.initDeepSiteRequestEnUS();
					OpenApi3Generator api = new OpenApi3Generator();
					api.setWebClient(webClient);
					api.setConfig(config);
					api.initDeepOpenApi3Generator(siteRequest);
					if(runOpenApi3Generator)
						future = future.compose(a -> api.writeOpenApi());
					if(runSqlGenerator)
						future = future.compose(a -> api.writeSql());
					if(runArticleGenerator)
						future = future.compose(a -> api.writeArticle());
					future.compose(a -> vertx.close());
				} else {
					future = future.compose(a -> run(config));
					future.compose(a -> vertx.close());
				}
			} catch(Exception ex) {
				LOG.error(String.format("Error loading config: %s", configPath), ex);
				vertx.close();
			}
		}).onFailure(ex -> {
			LOG.error(String.format("Error loading config: %s", configPath), ex);
			vertx.close();
		});
	}
}
