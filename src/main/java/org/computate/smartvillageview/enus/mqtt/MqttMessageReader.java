package org.computate.smartvillageview.enus.mqtt;

import org.computate.smartvillageview.enus.config.ConfigKeys;

import io.vertx.core.json.JsonObject;
import io.vertx.mqtt.MqttClient;

public class MqttMessageReader {

	public final static Integer MQTT_QOS_AT_MOST_ONCE = 0;
	public final static Integer MQTT_QOS_AT_LEAST_ONCE = 1;
	public final static Integer MQTT_QOS_EXACTLY_ONCE = 2;

	public MqttMessageReader(MqttClient mqttClient, JsonObject config) {
		mqttClient.publishHandler(message -> {
			System.out.println("There are new message in topic: " + message.topicName());
			System.out.println("Content(as string) of the message: " + message.payload().toString());
			System.out.println("QoS: " + message.qosLevel());
		}).subscribe(config.getString(ConfigKeys.MQTT_IOT_SUBSCRIBE_TOPIC), MQTT_QOS_EXACTLY_ONCE);
	}
}
