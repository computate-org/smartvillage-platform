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
package org.computate.smartvillage.enus.vertx;

import org.computate.vertx.api.ApiRequest;

import java.util.Optional;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.computate.search.serialize.ComputateLocalDateSerializer;
import org.computate.search.serialize.ComputateLocalDateDeserializer;
import org.computate.search.serialize.ComputateZonedDateTimeSerializer;
import org.computate.search.serialize.ComputateZonedDateTimeDeserializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.math.MathContext;
import org.apache.commons.lang3.math.NumberUtils;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.math.RoundingMode;
import java.util.Map;
import io.vertx.core.AbstractVerticle;
import org.computate.search.wrap.Wrap;
import org.computate.smartvillage.enus.config.ConfigKeys;
import org.computate.smartvillage.enus.model.base.BaseModel;
import org.computate.smartvillage.enus.request.SiteRequestEnUS;
import org.computate.smartvillage.enus.vertx.MainVerticle;

import io.vertx.core.Promise;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;

/**
 * <ol>
<h3>Suggestions that can generate more code for you: </h3> * </ol>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these MainVerticle objects in a RESTful API. 
 * </li><li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class MainVerticleGen into the class MainVerticle. 
 * </li>
 * <h3>About the MainVerticle class and it's generated class MainVerticleGen&lt;AbstractVerticle&gt;: </h3>extends MainVerticleGen
 * <p>
 * This Java class extends a generated Java class MainVerticleGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.vertx.MainVerticle">Find the class MainVerticle in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends MainVerticleGen<AbstractVerticle>
 * <p>This <code>class MainVerticle extends MainVerticleGen&lt;AbstractVerticle&gt;</code>, which means it extends a newly generated MainVerticleGen. 
 * The generated <code>class MainVerticleGen extends AbstractVerticle</code> which means that MainVerticle extends MainVerticleGen which extends AbstractVerticle. 
 * This generated inheritance is a powerful feature that allows a lot of boiler plate code to be created for you automatically while still preserving inheritance through the power of Java Generic classes. 
 * </p>
 * <h2>Api: true</h2>
 * <h2>ApiTag.enUS: true</h2>
 * <h2>ApiUri.enUS: null</h2>
 * <h2>Color: null</h2>
 * <h2>IconGroup: null</h2>
 * <h2>IconName: null</h2>
 * <h2>Indexed: true</h2>
 * <h2>{@inheritDoc}</h2>
 * <p>By adding a class comment "{@inheritDoc}", the MainVerticle class will inherit the helpful inherited class comments from the super class MainVerticleGen. 
 * </p>
 * <h2>Rows: null</h2>
 * <h2>Model: true</h2>
 * <h2>Page: true</h2>
 * <h2>SuperPage.enUS: null</h2>
 * <h2>Promise: true</h2>
 * <h2>AName.enUS: null</h2>
 * <p>
 * Delete the class MainVerticle in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.vertx.MainVerticle&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillage.enus.vertx in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillage.enus.vertx&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartvillage-platform in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * Generated: true
 **/
public abstract class MainVerticleGen<DEV> extends AbstractVerticle {
	protected static final Logger LOG = LoggerFactory.getLogger(MainVerticle.class);

	public static final String SITE_NAME = "smartvillage-platform";
	public static final String configureKafkaSuccess1 = "The Kafka producer was initialized successfully. ";
	public static final String configureKafkaSuccess = configureKafkaSuccess1;

	public static final String configureMqttSuccess1 = "The MQTT client was initialized successfully. ";
	public static final String configureMqttSuccess = configureMqttSuccess1;
	public static final String configureMqttFail1 = "The MQTT client failed to initialize. ";
	public static final String configureMqttFail = configureMqttFail1;

	public static final String configureDataConnectionError1 = "Could not open the database client connection. ";
	public static final String configureDataConnectionError = configureDataConnectionError1;
	public static final String configureDataConnectionSuccess1 = "The database client connection was successful. ";
	public static final String configureDataConnectionSuccess = configureDataConnectionSuccess1;
	public static final String configureDataInitError1 = "Could not initialize the database. ";
	public static final String configureDataInitError = configureDataInitError1;
	public static final String configureDataInitSuccess1 = "The database was initialized successfully. ";
	public static final String configureDataInitSuccess = configureDataInitSuccess1;

	public static final String configureOpenApiError1 = "Could not configure the auth server and API. ";
	public static final String configureOpenApiError = configureOpenApiError1;
	public static final String configureOpenApiSuccess1 = "The auth server and API was configured successfully. ";
	public static final String configureOpenApiSuccess = configureOpenApiSuccess1;

	public static final String configureConfigComplete1 = "The config was configured successfully. ";
	public static final String configureConfigComplete = configureConfigComplete1;
	public static final String configureConfigFail1 = "Could not configure the config(). ";
	public static final String configureConfigFail = configureConfigFail1;

	public static final String configureSharedWorkerExecutorFail1 = "Could not configure the shared worker executor. ";
	public static final String configureSharedWorkerExecutorFail = configureSharedWorkerExecutorFail1;
	public static final String configureSharedWorkerExecutorComplete1 = "The shared worker executor \"{}\" was configured successfully. ";
	public static final String configureSharedWorkerExecutorComplete = configureSharedWorkerExecutorComplete1;

	public static final String configureOpenTelemetryComplete1 = "Open Telemetry was configured successfully. ";
	public static final String configureOpenTelemetryComplete = configureOpenTelemetryComplete1;
	public static final String configureOpenTelemetryFail1 = "Could not configure Open Telemetry. ";
	public static final String configureOpenTelemetryFail = configureOpenTelemetryFail1;

	public static final String configureHealthChecksComplete1 = "The health checks were configured successfully. ";
	public static final String configureHealthChecksComplete = configureHealthChecksComplete1;
	public static final String configureHealthChecksFail1 = "Could not configure the health checks. ";
	public static final String configureHealthChecksFail = configureHealthChecksFail1;
	public static final String configureHealthChecksErrorDatabase1 = "The database is not configured properly. ";
	public static final String configureHealthChecksErrorDatabase = configureHealthChecksErrorDatabase1;
	public static final String configureHealthChecksEmptySolr1 = "The Solr search engine is empty. ";
	public static final String configureHealthChecksEmptySolr = configureHealthChecksEmptySolr1;
	public static final String configureHealthChecksErrorSolr1 = "The Solr search engine is not configured properly. ";
	public static final String configureHealthChecksErrorSolr = configureHealthChecksErrorSolr1;
	public static final String configureHealthChecksErrorVertx1 = "The Vert.x application is not configured properly. ";
	public static final String configureHealthChecksErrorVertx = configureHealthChecksErrorVertx1;

	public static final String configureWebsocketsComplete1 = "Configure websockets succeeded. ";
	public static final String configureWebsocketsComplete = configureWebsocketsComplete1;
	public static final String configureWebsocketsFail1 = "Configure websockets failed. ";
	public static final String configureWebsocketsFail = configureWebsocketsFail1;

	public static final String configureEmailComplete1 = "Configure sending email succeeded. ";
	public static final String configureEmailComplete = configureEmailComplete1;
	public static final String configureEmailFail1 = "Configure sending email failed. ";
	public static final String configureEmailFail = configureEmailFail1;

	public static final String configureHandlebarsFail1 = "Handlebars was not configured properly. ";
	public static final String configureHandlebarsFail = configureHandlebarsFail1;
	public static final String configureHandlebarsComplete1 = "Handlebars was configured properly. ";
	public static final String configureHandlebarsComplete = configureHandlebarsComplete1;

	public static final String configureApiFail1 = "The API was not configured properly. ";
	public static final String configureApiFail = configureApiFail1;
	public static final String configureApiComplete1 = "The API was configured properly. ";
	public static final String configureApiComplete = configureApiComplete1;

	public static final String configureUiFail1 = "The UI was not configured properly. ";
	public static final String configureUiFail = configureUiFail1;
	public static final String configureUiComplete1 = "The UI was configured properly. ";
	public static final String configureUiComplete = configureUiComplete1;

	public static final String startServerErrorServer1 = "The server is not configured properly. ";
	public static final String startServerErrorServer = startServerErrorServer1;
	public static final String startServerSuccessServer1 = "The HTTP server is running: %s";
	public static final String startServerSuccessServer = startServerSuccessServer1;
	public static final String startServerBeforeServer1 = "HTTP server starting: %s";
	public static final String startServerBeforeServer = startServerBeforeServer1;
	public static final String startServerSsl1 = "Configuring SSL: %s";
	public static final String startServerSsl = startServerSsl1;

	public static final String stopPgPoolFail1 = "Could not close the database client connection. ";
	public static final String stopPgPoolFail = stopPgPoolFail1;
	public static final String stopPgPoolComplete1 = "The database client connection was closed. ";
	public static final String stopPgPoolComplete = stopPgPoolComplete1;

	public static final String stopMqttFail1 = "Could not close the MQTT client connection. ";
	public static final String stopMqttFail = stopMqttFail1;
	public static final String stopMqttComplete1 = "The MQTT client connection was closed. ";
	public static final String stopMqttComplete = stopMqttComplete1;


	//////////////
	// initDeep //
	//////////////

	public MainVerticle initDeepMainVerticle(SiteRequestEnUS siteRequest_) {
		initDeepMainVerticle();
		return (MainVerticle)this;
	}

	public void initDeepMainVerticle() {
		initMainVerticle();
	}

	public void initMainVerticle() {
	}

	public void initDeepForClass(SiteRequestEnUS siteRequest_) {
		initDeepMainVerticle(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainMainVerticle(v);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.obtainForClass(v);
			}
			else if(o instanceof Map) {
				Map<?, ?> map = (Map<?, ?>)o;
				o = map.get(v);
			}
		}
		return o;
	}
	public Object obtainMainVerticle(String var) {
		MainVerticle oMainVerticle = (MainVerticle)this;
		switch(var) {
			default:
				return null;
		}
	}

	///////////////
	// relate //
	///////////////

	public boolean relateForClass(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = relateMainVerticle(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateMainVerticle(String var, Object val) {
		MainVerticle oMainVerticle = (MainVerticle)this;
		switch(var) {
			default:
				return null;
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetMainVerticle(entityVar,  siteRequest_, o);
	}
	public static Object staticSetMainVerticle(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
			default:
				return null;
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchMainVerticle(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchMainVerticle(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
			default:
				return null;
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrMainVerticle(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrMainVerticle(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
			default:
				return null;
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqMainVerticle(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqMainVerticle(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
			default:
				return null;
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		return sb.toString();
	}

	public static final String[] MainVerticleVals = new String[] { configureKafkaSuccess1, configureMqttSuccess1, configureMqttFail1, configureDataConnectionError1, configureDataConnectionSuccess1, configureDataInitError1, configureDataInitSuccess1, configureOpenApiError1, configureOpenApiSuccess1, configureConfigComplete1, configureConfigFail1, configureSharedWorkerExecutorFail1, configureSharedWorkerExecutorComplete1, configureOpenTelemetryComplete1, configureOpenTelemetryFail1, configureHealthChecksComplete1, configureHealthChecksFail1, configureHealthChecksErrorDatabase1, configureHealthChecksEmptySolr1, configureHealthChecksErrorSolr1, configureHealthChecksErrorVertx1, configureWebsocketsComplete1, configureWebsocketsFail1, configureEmailComplete1, configureEmailFail1, configureHandlebarsFail1, configureHandlebarsComplete1, configureApiFail1, configureApiComplete1, configureUiFail1, configureUiComplete1, startServerErrorServer1, startServerSuccessServer1, startServerBeforeServer1, startServerSsl1, stopPgPoolFail1, stopPgPoolComplete1, stopMqttFail1, stopMqttComplete1 };

	public static final String CLASS_SIMPLE_NAME = "MainVerticle";


	public static String displayNameForClass(String var) {
		return MainVerticle.displayNameMainVerticle(var);
	}
	public static String displayNameMainVerticle(String var) {
		switch(var) {
		default:
			return null;
		}
	}
}
