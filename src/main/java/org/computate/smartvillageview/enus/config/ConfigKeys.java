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
package org.computate.smartvillageview.enus.config;

import org.computate.vertx.config.ComputateConfigKeys;

/**
 * Keyword: classSimpleNameConfigKeys
 */
public class ConfigKeys extends ComputateConfigKeys {

	/**
	 * 
	 **/
	public static final String SUMO_EXECUTABLE_PATH = "SUMO_EXECUTABLE_PATH";

	/**
	 * 
	 **/
	public static final String PYTHON_EXECUTABLE_PATH = "PYTHON_EXECUTABLE_PATH";

	/**
	 * 
	 **/
	public static final String YGGIO_HOST_NAME = "YGGIO_HOST_NAME";

	/**
	 * 
	 **/
	public static final String YGGIO_PORT = "YGGIO_PORT";

	/**
	 * 
	 **/
	public static final String YGGIO_SSL = "YGGIO_SSL";

	/**
	 * 
	 **/
	public static final String YGGIO_API_RELATIVE_URI_IotNode = "YGGIO_API_RELATIVE_URI_IotNode";

	/**
	 * 
	 **/
	public static final String YGGIO_AUTH_LOCAL_URI = "YGGIO_AUTH_LOCAL_URI";

	/**
	 * 
	 **/
	public static final String YGGIO_USERNAME = "YGGIO_USERNAME";

	/**
	 * 
	 **/
	public static final String YGGIO_PASSWORD = "YGGIO_PASSWORD";

	/**
	 * The Floating Car Data directory. 
	 **/
	public static final String FCD_SYNC_PATH = "FCD_SYNC_PATH";

	/**
	 * The max number of Floating Car Data records to load in a batch. 
	 **/
	public static final String FCD_MAX_RECORD_SIZE = "FCD_MAX_RECORD_SIZE";

	/**
	 * Whether the FIWARE Context Broker uses SSL. 
	 **/
	public static final String FIWARE_SSL = "FIWARE_SSL";

	/**
	 * The FIWARE Context Broker host name. 
	 **/
	public static final String FIWARE_HOST_NAME = "FIWARE_HOST_NAME";

	/**
	 * The FIWARE Context Broker port. 
	 **/
	public static final String FIWARE_PORT = "FIWARE_PORT";

	/**
	 * The FIWARE Context Broker v2 API URI prefix. 
	 **/
	public static final String FIWARE_API_URI = "FIWARE_API_URI";

	/**
	 * API counter resume TimeStep
	 */
	public static final String API_COUNTER_RESUME_TimeStep = "API_COUNTER_RESUME_TimeStep";

	/**
	 * API counter fetch TimeStep
	 */
	public static final String API_COUNTER_FETCH_TimeStep = "API_COUNTER_FETCH_TimeStep";

	/**
	 * API counter resume VehicleStep
	 */
	public static final String API_COUNTER_RESUME_VehicleStep = "API_COUNTER_RESUME_VehicleStep";

	/**
	 * API counter fetch VehicleStep
	 */
	public static final String API_COUNTER_FETCH_VehicleStep = "API_COUNTER_FETCH_VehicleStep";

	/**
	 * API counter fetch SitePage
	 */
	public static final String API_COUNTER_FETCH_SitePage = "API_COUNTER_FETCH_SitePage";

	/**
	 * API counter fetch SiteHtm
	 */
	public static final String API_COUNTER_FETCH_SiteHtm = "API_COUNTER_FETCH_SiteHtm";

	public static final String KAFKA_BROKERS = "KAFKA_BROKERS";
	public static final String KAFKA_GROUP = "KAFKA_GROUP";
	public static final String KAFKA_TOPIC_SUMO_RUN = "KAFKA_TOPIC_SUMO_RUN";
	public static final String KAFKA_TOPIC_SUMO_RUN_REPORT = "KAFKA_TOPIC_SUMO_RUN_REPORT";
	public static final String KAFKA_TOPIC_SUMO_STOP = "KAFKA_TOPIC_SUMO_STOP";
	public static final String KAFKA_TOPIC_SUMO_SIMULATION_INFO = "KAFKA_TOPIC_SUMO_SIMULATION_INFO";
	public static final String KAFKA_TOPIC_SUMO_SIMULATION_INFO_PATCH = "KAFKA_TOPIC_SUMO_SIMULATION_INFO_PATCH";
	public static final String KAFKA_TOPIC_SUMO_TRAFFIC_FLOW_OBSERVED_INFO = "KAFKA_TOPIC_SUMO_TRAFFIC_FLOW_OBSERVED_INFO";
	public static final String KAFKA_TOPIC_SUMO_TRAFFIC_FLOW_OBSERVED_INFO_PATCH = "KAFKA_TOPIC_SUMO_TRAFFIC_FLOW_OBSERVED_INFO_PATCH";
	public static final String KAFKA_SECURITY_PROTOCOL = "KAFKA_SECURITY_PROTOCOL";
	public static final String KAFKA_SSL_KEYSTORE_TYPE = "KAFKA_SSL_KEYSTORE_TYPE";
	public static final String KAFKA_SSL_KEYSTORE_LOCATION = "KAFKA_SSL_KEYSTORE_LOCATION";
	public static final String KAFKA_SSL_KEYSTORE_PASSWORD = "KAFKA_SSL_KEYSTORE_PASSWORD";
	public static final String KAFKA_SSL_TRUSTSTORE_TYPE = "KAFKA_SSL_TRUSTSTORE_TYPE";
	public static final String KAFKA_SSL_TRUSTSTORE_LOCATION = "KAFKA_SSL_TRUSTSTORE_LOCATION";
	public static final String KAFKA_SSL_TRUSTSTORE_PASSWORD = "KAFKA_SSL_TRUSTSTORE_PASSWORD";

	public static final String MQTT_ENABLED = "MQTT_ENABLED";
	public static final String MQTT_HOST = "MQTT_HOST";
	public static final String MQTT_PORT = "MQTT_PORT";
	public static final String MQTT_IOT_SUBSCRIBE_TOPIC = "MQTT_IOT_SUBSCRIBE_TOPIC";
	public static final String OPEN_TELEMETRY_ENABLED = "OPEN_TELEMETRY_ENABLED";
}
