package org.computate.smartvillageview.enus.config;

import org.computate.vertx.config.ComputateConfigKeys;

/**
 * Keyword: classSimpleNameConfigKeys
 */
public class ConfigKeys extends ComputateConfigKeys {

	/**
	 * Facebook Graph Version
	 **/
	public static final String FACEBOOK_GRAPH_VERSION = "FACEBOOK_GRAPH_VERSION";

	/**
	 * Facebook App ID
	 **/
	public static final String FACEBOOK_APP_ID = "FACEBOOK_APP_ID";

	/**
	 * 
	 **/
	public static final String QUAYIO_ORG = "QUAYIO_ORG";

	/**
	 * 
	 **/
	public static final String MAILING_LIST_URL = "MAILING_LIST_URL";

	/**
	 * 
	 **/
	public static final String SITE_PUBLIC_URL = "SITE_PUBLIC_URL";

	/**
	 * 
	 **/
	public static final String SITE_POM_GROUP_ID = "SITE_POM_GROUP_ID";

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
	public static final String DYNAMIC_PAGE_PATH = "DYNAMIC_PAGE_PATH";

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
	 * The name Github organization for the site. 
	 **/
	public static final String GITHUB_ORG = "GITHUB_ORG";

	/**
	 * The project powered by URL. 
	 **/
	public static final String SITE_POWERED_BY_URL = "SITE_POWERED_BY_URL";

	/**
	 * The project powered by organization name. 
	 **/
	public static final String SITE_POWERED_BY_NAME = "SITE_POWERED_BY_NAME";

	/**
	 * The project powered by image relative URI. 
	 **/
	public static final String SITE_POWERED_BY_IMAGE_URI = "SITE_POWERED_BY_IMAGE_URI";

	/**
	 * The Floating Car Data directory. 
	 **/
	public static final String FCD_SYNC_PATH = "FCD_SYNC_PATH";

	/**
	 * The max number of Floating Car Data records to load in a batch. 
	 **/
	public static final String FCD_MAX_RECORD_SIZE = "FCD_MAX_RECORD_SIZE";

	/**
	 * The max read buffer size to load in a batch. 
	 **/
	public static final String READ_BUFFER_SIZE = "READ_BUFFER_SIZE";

	/**
	 * Periodically check the sync operations to check that they are still progressing. 
	 * If not, fetch more data. 
	 **/
	public static final String API_CHECK_TIMER_MILLIS = "API_CHECK_TIMER_MILLIS";

	/**
	 * Map default location. 
	 **/
	public static final String DEFAULT_MAP_LOCATION = "DEFAULT_MAP_LOCATION";

	/**
	 * Map default zoom. 
	 **/
	public static final String DEFAULT_MAP_ZOOM = "DEFAULT_MAP_ZOOM";

	/**
	 * max number of times to retry
	 */
	public static final String ZOOKEEPER_MAX_RETRIES = "ZOOKEEPER_MAX_RETRIES";

	/**
	 * initial amount of time to wait between retries
	 */
	public static final String ZOOKEEPER_BASE_SLEEP_TIME_MILLIS = "ZOOKEEPER_BASE_SLEEP_TIME_MILLIS";

	/**
	 * max time in ms to sleep on each retry
	 */
	public static final String ZOOKEEPER_MAX_SLEEP_MILLIS = "ZOOKEEPER_MAX_SLEEP_MILLIS";

	/**
	 * Zookeeper connection timeout
	 */
	public static final String ZOOKEEPER_CONNECTION_TIMEOUT_MILLIS = "ZOOKEEPER_CONNECTION_TIMEOUT_MILLIS";

	/**
	 * Zookeeper session timeout
	 */
	public static final String ZOOKEEPER_SESSION_TIMEOUT_MILLIS = "ZOOKEEPER_SESSION_TIMEOUT_MILLIS";

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
	 * 
	 **/
	public static final String I18N_PATHS = "I18N_PATHS";

	/**
	 * 
	 **/
	public static final String DYNAMIC_PAGE_PATHS = "DYNAMIC_PAGE_PATHS";

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

	public static final String SOLR_SSL = "SOLR_SSL";

	public static final String KAFKA_BROKERS = "KAFKA_BROKERS";
	public static final String KAFKA_GROUP = "KAFKA_GROUP";
	public static final String KAFKA_TOPIC_SUMO_RUN = "KAFKA_TOPIC_SUMO_RUN";
	public static final String KAFKA_TOPIC_SUMO_RUN_REPORT = "KAFKA_TOPIC_SUMO_RUN_REPORT";
	public static final String KAFKA_SECURITY_PROTOCOL = "KAFKA_SECURITY_PROTOCOL";
	public static final String KAFKA_SSL_KEYSTORE_LOCATION = "KAFKA_SSL_KEYSTORE_LOCATION";
	public static final String KAFKA_SSL_KEYSTORE_PASSWORD = "KAFKA_SSL_KEYSTORE_PASSWORD";
	public static final String KAFKA_SSL_TRUSTSTORE_LOCATION = "KAFKA_SSL_TRUSTSTORE_LOCATION";
	public static final String KAFKA_SSL_TRUSTSTORE_PASSWORD = "KAFKA_SSL_TRUSTSTORE_PASSWORD";
}
