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
package org.computate.smartvillage.enus.mqtt;

import org.computate.smartvillage.enus.config.ConfigKeys;

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
