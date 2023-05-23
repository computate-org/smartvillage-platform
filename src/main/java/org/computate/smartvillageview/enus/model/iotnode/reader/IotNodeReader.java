package org.computate.smartvillageview.enus.model.iotnode.reader;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import org.computate.search.wrap.Wrap;
import org.computate.smartvillageview.enus.config.ConfigKeys;
import org.computate.smartvillageview.enus.model.iotnode.IotNode;
import org.computate.smartvillageview.enus.request.SiteRequestEnUS;
import org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep;

import com.github.jknack.handlebars.Handlebars;

import io.vertx.core.CompositeFuture;
import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.WorkerExecutor;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.auth.authentication.TokenCredentials;
import io.vertx.ext.web.client.WebClient;
import io.vertx.ext.web.client.predicate.ResponsePredicate;
import io.vertx.ext.web.templ.handlebars.HandlebarsTemplateEngine;

public class IotNodeReader extends IotNodeReaderGen<Object> {

	public IotNodeReader(Vertx vertx, WorkerExecutor workerExecutor, SiteRequestEnUS siteRequest, JsonObject config) {
		super();
		setSiteRequest_(siteRequest);
		setConfig(config);
		setVertx(vertx);
		setWorkerExecutor(workerExecutor);
	}

	public IotNodeReader() {
	}

	/**
	 * {@inheritDoc}
	 * Ignore: true
	 * Description: The current request object
	 */
	protected void _siteRequest_(Wrap<SiteRequestEnUS> w) {
	}

	protected void _config(Wrap<JsonObject> w) {
		w.o(siteRequest_.getConfig());
	}

	protected void _webClient(Wrap<WebClient> w) {
		w.o(siteRequest_.getWebClient());
	}

	protected void _vertx(Wrap<Vertx> w) {
	}

	protected void _workerExecutor(Wrap<WorkerExecutor> w) {
	}

	protected void _templateEngine(Wrap<HandlebarsTemplateEngine> w) {
	}

	protected void _handlebars(Wrap<Handlebars> w) {
	}

	/**
	 * Description: Import all the data related to IOT Nodes
	 */
	public Future<Void> importData() {
		Promise<Void> promise = Promise.promise();
		importDataIotNode().onSuccess(a -> {
			importDataIotNodeStep().onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	/**
	 * Description: Import IOT Node data
	 * Val.Complete.enUS:Importing %s data completed. 
	 * Val.Fail.enUS:Importing %s data failed. 
	 */
	public Future<Void> importDataIotNode() {
		Promise<Void> promise = Promise.promise();
		webClient.post(config.getInteger(ConfigKeys.YGGIO_PORT), config.getString(ConfigKeys.YGGIO_HOST_NAME), config.getString(ConfigKeys.YGGIO_AUTH_LOCAL_URI))
				.ssl(config.getBoolean(ConfigKeys.YGGIO_SSL))
				.expect(ResponsePredicate.SC_OK)
				.putHeader("Content-Type", "application/json")
				.sendJsonObject(new JsonObject()
						.put("username", config.getString(ConfigKeys.YGGIO_USERNAME))
						.put("password", config.getString(ConfigKeys.YGGIO_PASSWORD))
						)
				.onSuccess(tokenResponse -> {
			JsonObject token = tokenResponse.bodyAsJsonObject();
			webClient.get(config.getInteger(ConfigKeys.YGGIO_PORT), config.getString(ConfigKeys.YGGIO_HOST_NAME), config.getString(ConfigKeys.YGGIO_API_RELATIVE_URI_IotNode))
					.ssl(config.getBoolean(ConfigKeys.YGGIO_SSL))
					.authentication(new TokenCredentials(token.getString("token")))
					.expect(ResponsePredicate.SC_OK)
					.send()
					.onSuccess(response -> {
				JsonArray data = response.bodyAsJsonArray();
				List<Future> futures = new ArrayList<>();

				data.stream().forEach(row -> {
					JsonObject json = (JsonObject)row;
					String nodeId = json.getString("_id");

					JsonObject body = new JsonObject()
							.put(IotNode.VAR_saves, new JsonArray()
									.add(IotNode.VAR_inheritPk)
									.add(IotNode.VAR_json)
									)
							.put(IotNode.VAR_json, json)
							.put(IotNode.VAR_nodeId, nodeId)
							.put(IotNode.VAR_id, nodeId)
							;

					JsonObject params = new JsonObject();
					params.put("body", body);
					params.put("path", new JsonObject());
					params.put("cookie", new JsonObject());
					params.put("query", new JsonObject().put("commitWithin", 10000).put("q", "*:*").put("var", new JsonArray().add("refresh:false")));
					JsonObject context = new JsonObject().put("params", params);
					JsonObject request = new JsonObject().put("context", context);
					futures.add(vertx.eventBus().request(String.format("smartabyar-smartvillage-enUS-%s", IotNode.CLASS_SIMPLE_NAME), request, new DeliveryOptions().addHeader("action", String.format("putimport%sFuture", IotNode.CLASS_SIMPLE_NAME))));
				});
				CompositeFuture.all(futures).onSuccess(a -> {
					LOG.info(String.format(importDataIotNodeComplete, IotNode.CLASS_SIMPLE_NAME));
					promise.complete();
				}).onFailure(ex -> {
					LOG.error(String.format(importDataIotNodeFail, IotNode.CLASS_SIMPLE_NAME), ex);
					promise.fail(ex);
				});
			}).onFailure(ex -> {
				LOG.error(String.format(importDataIotNodeFail, IotNode.CLASS_SIMPLE_NAME), ex);
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			LOG.error(String.format(importDataIotNodeFail, IotNode.CLASS_SIMPLE_NAME), ex);
			promise.fail(ex);
		});
		return promise.future();
	}

	/**
	 * Description: Import IOT Node Step data
	 * Val.Complete.enUS:Importing %s data completed. 
	 * Val.Fail.enUS:Importing %s data failed. 
	 */
	public Future<Void> importDataIotNodeStep() {
		Promise<Void> promise = Promise.promise();
		OffsetDateTime now = OffsetDateTime.now(ZoneId.of("UTC"));
		webClient.post(config.getInteger(ConfigKeys.YGGIO_PORT), config.getString(ConfigKeys.YGGIO_HOST_NAME), config.getString(ConfigKeys.YGGIO_AUTH_LOCAL_URI))
				.ssl(config.getBoolean(ConfigKeys.YGGIO_SSL))
				.expect(ResponsePredicate.SC_OK)
				.putHeader("Content-Type", "application/json")
				.sendJsonObject(new JsonObject()
						.put("username", config.getString(ConfigKeys.YGGIO_USERNAME))
						.put("password", config.getString(ConfigKeys.YGGIO_PASSWORD))
						)
				.onSuccess(tokenResponse -> {
			JsonObject token = tokenResponse.bodyAsJsonObject();
			webClient.get(config.getInteger(ConfigKeys.YGGIO_PORT), config.getString(ConfigKeys.YGGIO_HOST_NAME), config.getString(ConfigKeys.YGGIO_API_RELATIVE_URI_IotNode))
					.ssl(config.getBoolean(ConfigKeys.YGGIO_SSL))
					.authentication(new TokenCredentials(token.getString("token")))
					.expect(ResponsePredicate.SC_OK)
					.send()
					.onSuccess(response -> {
				JsonArray data = response.bodyAsJsonArray();
				List<Future> futures = new ArrayList<>();

				data.stream().forEach(row -> {
					JsonObject json = (JsonObject)row;
					String id = String.format("%s_%s", json.getString("_id"), now.toString());

					JsonObject body = new JsonObject()
							.put(IotNodeStep.VAR_saves, new JsonArray()
									.add(IotNodeStep.VAR_inheritPk)
									.add(IotNodeStep.VAR_json)
									)
							.put(IotNodeStep.VAR_json, json)
							.put(IotNodeStep.VAR_id, id)
							;

					JsonObject params = new JsonObject();
					params.put("body", body);
					params.put("path", new JsonObject());
					params.put("cookie", new JsonObject());
					params.put("query", new JsonObject().put("commitWithin", 10000).put("q", "*:*").put("var", new JsonArray().add("refresh:false")));
					JsonObject context = new JsonObject().put("params", params);
					JsonObject request = new JsonObject().put("context", context);
					futures.add(vertx.eventBus().request(String.format("smartabyar-smartvillage-enUS-%s", IotNodeStep.CLASS_SIMPLE_NAME), request, new DeliveryOptions().addHeader("action", String.format("putimport%sFuture", IotNodeStep.CLASS_SIMPLE_NAME))));
				});
				CompositeFuture.all(futures).onSuccess(a -> {
					LOG.info(String.format(importDataIotNodeStepComplete, IotNodeStep.CLASS_SIMPLE_NAME));
					promise.complete();
				}).onFailure(ex -> {
					LOG.error(String.format(importDataIotNodeStepFail, IotNodeStep.CLASS_SIMPLE_NAME), ex);
					promise.fail(ex);
				});
			}).onFailure(ex -> {
				LOG.error(String.format(importDataIotNodeStepFail, IotNodeStep.CLASS_SIMPLE_NAME), ex);
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			LOG.error(String.format(importDataIotNodeStepFail, IotNodeStep.CLASS_SIMPLE_NAME), ex);
			promise.fail(ex);
		});
		return promise.future();
	}
}
