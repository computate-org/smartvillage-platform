package org.computate.smartvillageview.enus.camel.tlc;

import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.ExpressionBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.vertx.VertxComponent;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.computate.smartvillageview.enus.config.ConfigKeys;
import org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport;
import org.computate.vertx.verticle.EmailVerticle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.core.json.JsonObject;

public class TlcCamelIntegration extends TlcCamelIntegrationGen<Object> {
	private static final Logger LOG = LoggerFactory.getLogger(TlcCamelIntegration.class);

	/**
	 * Val.Fail.enUS:The Camel Component was not configured properly. 
	 * Val.Complete.enUS:The Camel Component was configured properly. 
	 */
	public static Future<Void> configureCamel(Vertx vertx, JsonObject config) {
		Promise<Void> promise = Promise.promise();
		try {
			vertx.eventBus().consumer("smartabyar-smartvillage-enUS-SimulationReport-patchSimulationReportFuture", message -> {
				vertx.eventBus().request("smartabyar-smartvillage-enUS-SimulationReport", (JsonObject)message.body(), new DeliveryOptions().addHeader("action", "patchSimulationReportFuture")).onSuccess(a -> {
					message.reply(a.body());
				}).onFailure(ex -> {
					LOG.error("Patching SimulationReport failed. ", ex);
					message.reply(null);
				});
			});

			DefaultCamelContext camelContext = new DefaultCamelContext();
			VertxComponent vertxComponent = new VertxComponent();
			vertxComponent.setVertx(vertx);
			camelContext.addComponent("vertx", vertxComponent);
			RouteBuilder routeBuilder = new RouteBuilder() {
				public void configure() {
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
					.log("received SUMO run report event: ${body}")
					.bean(TlcCamelIntegration.class, "exchangeToJsonObject")
					.bean(SimulationReport.class, "patchSimulationReportFuture")
					.to("vertx:smartabyar-smartvillage-enUS-SimulationReport-patchSimulationReportFuture?exchangePattern=InOut")
					.end();

//					.setProperty(ConfigKeys.KIE_SERVER_BASE_URL, ExpressionBuilder.constantExpression(config.getString(ConfigKeys.KIE_SERVER_BASE_URL)))
//					.setProperty(ConfigKeys.KIE_SERVER_USERNAME, ExpressionBuilder.constantExpression(config.getString(ConfigKeys.KIE_SERVER_USERNAME)))
//					.setProperty(ConfigKeys.KIE_SERVER_PASSWORD, ExpressionBuilder.constantExpression(config.getString(ConfigKeys.KIE_SERVER_PASSWORD)))
//					.setProperty(ConfigKeys.KIE_SERVER_DEPLOYMENT_ID, ExpressionBuilder.constantExpression(config.getString(ConfigKeys.KIE_SERVER_DEPLOYMENT_ID)))
//					.bean(SimulationReport.class, "runRules")
//					.unmarshal().json(JsonLibrary.Jackson, SimulationReport.class)
//					.log("received response from rules: ${body.ruleMessage} for computer ${body.computerName} and ${body.eventStatus} event ${body.eventName} ${body.computerFound} ${body.ruleFound} ${body.jobCount} ${body.jobCountMax} ${body.problemCount} ${body.problemCountMax}")
//					.log("related jobs: /job?fq=eventName:${body.eventName}&fq=computerName:${body.computerName}")
//					.log("related problems: /problem?fq=eventName:${body.eventName}&fq=computerName:${body.computerName}")
//					.setProperty("SimulationReport", simple("${body}"))
//					.bean(SimulationReport.class, "eventBusImport")
//					.to("vertx:eventphenomenon-enUS-importMessage?exchangePattern=InOut")
//					.setBody(exchangeProperty("SimulationReport"))
//					.choice()
//					.when(simple("${body.createJob} == true"))
//						.setProperty(ConfigKeys.ANSIBLE_LAUNCH_URL, ExpressionBuilder.constantExpression(config.getString(ConfigKeys.ANSIBLE_LAUNCH_URL)))
//						.bean(SimulationReport.class, "eventToAnsible")
//						.log(LoggingLevel.INFO, "sending request to Ansible Tower: ${body}")
//						.setHeader(Exchange.HTTP_METHOD, constant("POST"))
//						.setHeader("Authorization", constant(String.format("Bearer %s", config.getString(ConfigKeys.ANSIBLE_TOKEN))))
//						.setHeader("Content-Type", constant(String.format("application/json")))
//						.toD(String.format("vertx-http:${header.%s}", ConfigKeys.ANSIBLE_LAUNCH_URL))
//						.log(LoggingLevel.INFO, "Ansible Tower job created: ${body}")
//						.bean(PhenomenalJob.class, "eventBus")
//						.to("vertx:eventphenomenon-enUS-fromAnsibleToPhenomenalJob?exchangePattern=InOut")
//					.endChoice()
//					.when(simple("${body.createProblem} == true"))
//						.bean(PhenomenalProblem.class, "messageToProblem")
//						.bean(PhenomenalProblem.class, "eventBusPost")
//						.to("vertx:eventphenomenon-enUS-fromMessageToProblem?exchangePattern=InOut")
//						.bean(PhenomenalProblem.class, "postPayload")
//						.unmarshal().json(JsonLibrary.Jackson, PhenomenalProblem.class)
//						.bean(PhenomenalProblem.class, "eventBusEmail")
//						.to(String.format("vertx:%s?exchangePattern=InOut", EmailVerticle.MAIL_EVENTBUS_ADDRESS))
//						.log(LoggingLevel.INFO, "Sent problem email")
//					.endChoice()
//					.otherwise()
//						.log(LoggingLevel.INFO, "No rules applied for this event")
//					.endChoice()
//					.end()
//					;
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
}
