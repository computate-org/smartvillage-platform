package org.computate.smartvillageview.enus.model.traffic.simulation;

import java.util.ArrayList;

import org.computate.smartvillageview.enus.config.ConfigKeys;
import org.computate.smartvillageview.enus.vertx.MainVerticle;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
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
import io.vertx.core.net.SocketAddress;
import io.vertx.ext.auth.User;
import io.vertx.ext.auth.oauth2.OAuth2Auth;
import io.vertx.ext.auth.oauth2.authorization.KeycloakAuthorization;
import io.vertx.ext.unit.Async;
import io.vertx.ext.unit.TestContext;
import io.vertx.ext.unit.junit.RunTestOnContext;
import io.vertx.ext.unit.junit.Timeout;
import io.vertx.ext.unit.junit.VertxUnitRunner;
import io.vertx.ext.web.client.HttpRequest;
import io.vertx.ext.web.client.HttpResponse;
import io.vertx.ext.web.client.WebClient;
import io.vertx.ext.web.client.WebClientOptions;
import io.vertx.ext.web.client.impl.HttpResponseImpl;
import io.vertx.ext.web.client.impl.WebClientBase;

@RunWith(VertxUnitRunner.class)
public class TrafficSimulationTest {

	protected static final Logger LOG = LoggerFactory.getLogger(TrafficSimulationTest.class);

	@Rule
	public RunTestOnContext runTestOnContextRule = new RunTestOnContext();

	@Rule
	public Timeout timeoutRule = Timeout.seconds(10);

	@Spy
	private MainVerticle mainVerticle = new MainVerticle();

	@Mock
	private OAuth2Auth oauth2AuthenticationProvider;

	@Spy
	private WebClientBase webClient = new WebClientBase(null, new WebClientOptions());

//	@Spy
//	private TrafficSimulationEnUSGenApiServiceImpl service;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.openMocks(this);
		Mockito.doReturn(Future.succeededFuture()).when(mainVerticle).configureData();
		Mockito.doReturn(Future.succeededFuture()).when(mainVerticle).configureOpenApi();
		Mockito.doReturn(Future.succeededFuture()).when(mainVerticle).configureHealthChecks();
		Mockito.doReturn(Future.succeededFuture()).when(mainVerticle).configureWebsockets();
		Mockito.doReturn(Future.succeededFuture()).when(mainVerticle).configureWebClient();
		Mockito.doReturn(Future.succeededFuture()).when(mainVerticle).configureUi();
		Mockito.doReturn(Future.succeededFuture()).when(mainVerticle).startServer();
		Mockito.doCallRealMethod().when(mainVerticle).start(Mockito.any());

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

//		HttpRequest<Buffer> search = new HttpRequestImpl<Buffer>();
		Mockito.doCallRealMethod().when(webClient).request(Mockito.any(HttpMethod.class), Mockito.anyInt(), Mockito.anyString(), Mockito.anyString());
		Mockito.doCallRealMethod().when(webClient).request(Mockito.any(HttpMethod.class), Mockito.any(SocketAddress.class), Mockito.anyInt(), Mockito.anyString(), Mockito.anyString());
		mainVerticle.setWebClient(webClient);
		Mockito.doAnswer(new Answer<HttpRequest<Buffer>>() {
			@Override
			public HttpRequest<Buffer> answer(InvocationOnMock invocation) throws Throwable {
				HttpRequest<Buffer> originalHttpRequest = webClient.request(HttpMethod.GET, null, 80, "localhost", "");
				HttpRequest<Buffer> httpRequest = Mockito.spy(originalHttpRequest);
				Buffer responseBuffer = Buffer.buffer(new JsonObject().put("stuff", "things").toString());
				HttpResponse<Buffer> httpResponse = new HttpResponseImpl<Buffer>(HttpVersion.HTTP_2, 200, "OK", MultiMap.caseInsensitiveMultiMap(), MultiMap.caseInsensitiveMultiMap(), new ArrayList<String>(), responseBuffer, new ArrayList<String>());
				Mockito.doReturn(Future.succeededFuture(httpResponse)).when(httpRequest).send();
				return httpRequest;
			}
		}).when(webClient).get(Mockito.anyInt(), Mockito.anyString(), Mockito.anyString());
	}

	@After
	public void tearDown() throws Exception {
	}

	public static Future<JsonObject> configureConfig(Vertx vertx) {
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

	@Test
	public void test(TestContext testContext) {
		Vertx vertx = runTestOnContextRule.vertx();

		Async async = testContext.async();
		configureConfig(vertx).onSuccess(config -> {
			String address = String.format("%s-%s-%s", config.getString(ConfigKeys.SITE_NAME), "enUS", TrafficSimulation.CLASS_SIMPLE_NAME);
			DeploymentOptions deploymentOptions = new DeploymentOptions();
			deploymentOptions.setConfig(config);

			vertx.deployVerticle(mainVerticle, deploymentOptions).onSuccess(a -> {
				JsonObject params = new JsonObject();
				params.put("body", null);
				params.put("path", new JsonObject());
				params.put("cookie", new JsonObject());
				params.put("header", new JsonObject());
				params.put("form", new JsonObject());
				params.put("query", new JsonObject());
				JsonObject context = new JsonObject().put("params", params).put("user", new JsonObject().put("access_token", "..."));
				JsonObject json = new JsonObject().put("context", context);

				vertx.eventBus().request(address, json, new DeliveryOptions().addHeader("action", "searchTrafficSimulation")).onSuccess(response -> {
					testContext.assertEquals("value", "something");
					async.complete();
				});
			});
		});
	}

}
