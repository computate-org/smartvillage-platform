package org.computate.smartvillage.enus.model.traffic.simulation;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.computate.search.request.SearchRequest;
import org.computate.smartvillage.enus.config.ConfigKeys;
import org.computate.smartvillage.enus.model.traffic.simulation.TrafficSimulation;
import org.computate.smartvillage.enus.model.traffic.simulation.TrafficSimulationEnUSGenApiServiceImpl;
import org.computate.smartvillage.enus.vertx.MainVerticle;
import org.computate.vertx.search.list.SearchList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.vertx.config.ConfigRetriever;
import io.vertx.config.ConfigRetrieverOptions;
import io.vertx.config.ConfigStoreOptions;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Future;
import io.vertx.core.MultiMap;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpVersion;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.json.impl.JsonUtil;
import io.vertx.core.net.SocketAddress;
import io.vertx.ext.auth.User;
import io.vertx.ext.auth.oauth2.OAuth2Auth;
import io.vertx.ext.auth.oauth2.authorization.KeycloakAuthorization;
import io.vertx.ext.web.client.HttpRequest;
import io.vertx.ext.web.client.HttpResponse;
import io.vertx.ext.web.client.WebClientOptions;
import io.vertx.ext.web.client.impl.HttpResponseImpl;
import io.vertx.ext.web.client.impl.WebClientBase;
import io.vertx.junit5.RunTestOnContext;
import io.vertx.junit5.VertxExtension;
import io.vertx.junit5.VertxTestContext;
import io.vertx.kafka.client.producer.KafkaProducer;
import io.vertx.pgclient.PgPool;

@ExtendWith(VertxExtension.class)
public class TrafficSimulationTest {

	protected static final Logger LOG = LoggerFactory.getLogger(TrafficSimulationTest.class);

	@RegisterExtension
	public static RunTestOnContext runTestOnContextRule = new RunTestOnContext();

	private static Vertx vertx = Vertx.vertx();

	private static MainVerticle mainVerticle;

	private static OAuth2Auth oauth2AuthenticationProvider;

	private static WebClientBase webClient;

	private static PgPool pgPool;

	private KafkaProducer<String, String> kafkaProducer;

	private static String mainVerticleDeploymentId;

	@BeforeAll
	public static void beforeClass(VertxTestContext testContext) throws Exception {
		vertx = runTestOnContextRule.vertx();
		mainVerticle = Mockito.spy(MainVerticle.class);
		oauth2AuthenticationProvider = Mockito.mock(OAuth2Auth.class);
		webClient = Mockito.spy(new WebClientBase(null, new WebClientOptions()));

		Mockito.doReturn(Future.succeededFuture()).when(mainVerticle).configureData();
		Mockito.doReturn(Future.succeededFuture()).when(mainVerticle).configureOpenApi();
		Mockito.doReturn(Future.succeededFuture()).when(mainVerticle).configureHealthChecks();
		Mockito.doReturn(Future.succeededFuture()).when(mainVerticle).configureWebsockets();
		Mockito.doReturn(Future.succeededFuture()).when(mainVerticle).configureWebClient();
		Mockito.doReturn(Future.succeededFuture()).when(mainVerticle).configureUi();
		Mockito.doReturn(Future.succeededFuture()).when(mainVerticle).configureKafka();
		Mockito.doReturn(Future.succeededFuture()).when(mainVerticle).startServer();
//		Mockito.doCallRealMethod().when(mainVerticle).stop(Mockito.any());
//		Mockito.doCallRealMethod().when(mainVerticle).stop();
//		Mockito.doCallRealMethod().when(mainVerticle).start(Mockito.any());

		JsonObject principal = new JsonObject();
		User user = User.create(principal);
		user.attributes().put("accessToken", new JsonObject()
				.put("resource_access", new JsonObject())
				.put("realm_access", new JsonObject().put("roles", new JsonArray().add("SiteAdmin")))
				.put("sub", "test")
				.put("userName", "test")
				.put("userFirstName", "Jon")
				.put("userLastName", "Jonsson")
				.put("userFullName", "Jon Jonsson")
				.put("userId", "test")
				.put("userEmail", "test@mailinator.com")
				);
		Mockito.doReturn(Future.succeededFuture(user)).when(oauth2AuthenticationProvider).authenticate(Mockito.any(JsonObject.class));
		mainVerticle.setOauth2AuthenticationProvider(oauth2AuthenticationProvider);
		mainVerticle.setAuthorizationProvider(KeycloakAuthorization.create());

		Mockito.doCallRealMethod().when(webClient).request(Mockito.any(HttpMethod.class), Mockito.anyInt(), Mockito.anyString(), Mockito.anyString());
		Mockito.doCallRealMethod().when(webClient).request(Mockito.any(HttpMethod.class), Mockito.any(SocketAddress.class), Mockito.anyInt(), Mockito.anyString(), Mockito.anyString());
		mainVerticle.setWebClient(webClient);

		Mockito.doAnswer(new Answer<HttpRequest<Buffer>>() {
			@Override
			public HttpRequest<Buffer> answer(InvocationOnMock invocation) throws Throwable {
				HttpRequest<Buffer> originalHttpRequest = webClient.request(HttpMethod.GET, null, 80, "localhost", "");
				HttpRequest<Buffer> httpRequest = Mockito.spy(originalHttpRequest);
				String jsonResponse = new String(Files.readAllBytes(Paths.get("src", "test", "resources", "org", "computate", "smartvillage", "enus", "model", "user", "searchSiteUser.json").toAbsolutePath()), SearchRequest.UTF_8);
				Buffer responseBuffer = Buffer.buffer(jsonResponse);
				HttpResponse<Buffer> httpResponse = new HttpResponseImpl<Buffer>(HttpVersion.HTTP_2, 200, "OK", MultiMap.caseInsensitiveMultiMap(), MultiMap.caseInsensitiveMultiMap(), new ArrayList<String>(), responseBuffer, new ArrayList<String>());
				Mockito.doReturn(Future.succeededFuture(httpResponse)).when(httpRequest).send();
				return httpRequest;
			}
		}).when(webClient).get(Mockito.anyInt(), Mockito.anyString(), Mockito.eq("/solr/smartabyar-smartvillage/select?q=*%3A*&fq=userId_docvalues_string%3Atest&fq=classCanonicalNames_docvalues_strings%3Aorg.computate.smartvillage.enus.model.user.SiteUser&fq=deleted_docvalues_boolean%3Afalse&fq=archived_docvalues_boolean%3Afalse&rows=10&start=0"));

		configureConfig().onSuccess(config -> {
			DeploymentOptions deploymentOptions = new DeploymentOptions();
			deploymentOptions.setConfig(config);

			vertx.deployVerticle(mainVerticle, deploymentOptions, testContext.succeedingThenComplete());
		}).onFailure(ex -> {
			testContext.failNow(ex);
		});
	}

	@BeforeEach
	public void before(VertxTestContext testContext) throws Exception {

		MockitoAnnotations.openMocks(this);
		testContext.completeNow();
	}

	public static Future<JsonObject> configureConfig() {
		Promise<JsonObject> promise = Promise.promise();

		try {
			ConfigRetrieverOptions retrieverOptions = new ConfigRetrieverOptions();

			retrieverOptions.addStore(new ConfigStoreOptions().setType("file").setFormat("yaml").setConfig(new JsonObject().put("path", "application.yml")));

			ConfigRetriever configRetriever = ConfigRetriever.create(vertx, retrieverOptions);
			configRetriever.getConfig().onSuccess(config -> {
				LOG.info("The config was configured successfully. ");
				promise.complete(config);
			}).onFailure(ex -> {
				LOG.error("Unable to configure site context. ", ex);
				promise.fail(ex);
			});
		} catch(Exception ex) {
			LOG.error("Unable to configure site context. ", ex);
			promise.fail(ex);
		}

		return promise.future();
	}

//	@Test
//	public void testSearch(VertxTestContext testContext) {
//		JsonObject config = mainVerticle.config();
//
//		Mockito.doAnswer(new Answer<HttpRequest<Buffer>>() {
//			@Override
//			public HttpRequest<Buffer> answer(InvocationOnMock invocation) throws Throwable {
//				HttpRequest<Buffer> originalHttpRequest = webClient.request(HttpMethod.GET, null, 80, "localhost", "");
//				HttpRequest<Buffer> httpRequest = Mockito.spy(originalHttpRequest);
//				String jsonResponse = new String(Files.readAllBytes(Paths.get("src", "test", "resources", "org", "computate", "smartvillage", "enus", "model", "traffic", "simulation", "searchTrafficSimulation.json").toAbsolutePath()), SearchRequest.UTF_8);
//				Buffer responseBuffer = Buffer.buffer(jsonResponse);
//				HttpResponse<Buffer> httpResponse = new HttpResponseImpl<Buffer>(HttpVersion.HTTP_2, 200, "OK", MultiMap.caseInsensitiveMultiMap(), MultiMap.caseInsensitiveMultiMap(), new ArrayList<String>(), responseBuffer, new ArrayList<String>());
//				Mockito.doReturn(Future.succeededFuture(httpResponse)).when(httpRequest).send();
//				return httpRequest;
//			}
//		}).when(webClient).get(Mockito.anyInt(), Mockito.anyString(), Mockito.eq("/solr/smartabyar-smartvillage/select?q=*%3A*&fq=classCanonicalNames_docvalues_strings%3Aorg.computate.smartvillage.enus.model.traffic.simulation.TrafficSimulation&fq=deleted_docvalues_boolean%3Afalse&fq=archived_docvalues_boolean%3Afalse&sort=created_docvalues_date+desc&rows=10&start=0"));
//
//		String address = String.format("%s-%s-%s", config.getString(ConfigKeys.SITE_NAME), "enUS", TrafficSimulation.CLASS_SIMPLE_NAME);
//
//		JsonObject params = new JsonObject();
//		params.put("body", null);
//		params.put("path", new JsonObject());
//		params.put("cookie", new JsonObject());
//		params.put("header", new JsonObject());
//		params.put("form", new JsonObject());
//		params.put("query", new JsonObject()
//				.put("rows", "10")
//				.put("start", "0")
////				.put("facet.range.gap", "+1DAY")
////				.put("facet.range.start", "2022-12-14T00:00:00.000[America/Denver]")
////				.put("facet.range.start", "2022-12-21T00:00:00.000[America/Denver]")
////				.put("facet.range", "{!tag=r1}created")
////				.put("facet.pivot", "{!range=r1}classSimpleName")
//				);
//		JsonObject context = new JsonObject().put("params", params).put("user", new JsonObject().put("access_token", "..."));
//		JsonObject json = new JsonObject().put("context", context);
//
//		vertx.eventBus().request(address, json, new DeliveryOptions().addHeader("action", "searchTrafficSimulation")).onSuccess(response -> {
//			JsonObject body = (JsonObject)response.body();
//			JsonObject responseBody = new JsonObject(Buffer.buffer(JsonUtil.BASE64_DECODER.decode(body.getString("payload"))));
//			Assertions.assertEquals(1L, responseBody.getLong("foundNum"));
//			Assertions.assertEquals(1L, responseBody.getLong("returnedNum"));
//			Assertions.assertEquals(0L, responseBody.getLong("startNum"));
//			testContext.completeNow();
//		}).onFailure(ex -> {
//			testContext.failNow(ex);
//		});
//	}

	@Test
	public void testServiceMethods(VertxTestContext testContext) {
		TrafficSimulationEnUSGenApiServiceImpl service = new TrafficSimulationEnUSGenApiServiceImpl(vertx.eventBus(), mainVerticle.config(), null, pgPool, kafkaProducer, webClient, oauth2AuthenticationProvider, null, null);
		SearchList<TrafficSimulation> searchList = new SearchList<>();

		try {
			service.searchTrafficSimulationSort(searchList, null, null, null);
			testContext.failNow("Should throw an exception");
		} catch(Exception ex) {
		}
		service.searchTrafficSimulationSort(searchList, TrafficSimulation.VAR_id, "asc", String.format("%s_indexed_string", TrafficSimulation.VAR_id));
		Assertions.assertEquals(1, searchList.getSorts().size());

		service.searchTrafficSimulationRows(searchList, null);
		Assertions.assertEquals(10L, searchList.getRows());
		service.searchTrafficSimulationRows(searchList, 20L);
		Assertions.assertEquals(20L, searchList.getRows());
		testContext.completeNow();
	}

}
