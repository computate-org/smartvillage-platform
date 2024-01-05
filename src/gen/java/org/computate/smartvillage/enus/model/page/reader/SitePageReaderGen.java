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
package org.computate.smartvillage.enus.model.page.reader;

import org.computate.smartvillage.enus.request.SiteRequestEnUS;
import java.lang.Object;
import org.computate.smartvillage.enus.model.base.BaseModel;
import org.computate.vertx.api.ApiRequest;
import org.computate.smartvillage.enus.config.ConfigKeys;
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
import io.vertx.core.Vertx;
import io.vertx.core.WorkerExecutor;
import io.vertx.kafka.client.producer.KafkaProducer;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.client.WebClient;
import io.vertx.ext.web.templ.handlebars.HandlebarsTemplateEngine;
import com.github.jknack.handlebars.Handlebars;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;

/**
 * <ol>
<h3>Suggestions that can generate more code for you: </h3> * </ol>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these SitePageReader objects in a RESTful API. 
 * </li>
 * <h3>About the SitePageReader class and it's generated class SitePageReaderGen&lt;Object&gt;: </h3>extends SitePageReaderGen
 * <p>
 * This Java class extends a generated Java class SitePageReaderGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.page.reader.SitePageReader">Find the class SitePageReader in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends SitePageReaderGen<Object>
 * <p>This <code>class SitePageReader extends SitePageReaderGen&lt;Object&gt;</code>, which means it extends a newly generated SitePageReaderGen. 
 * The generated <code>class SitePageReaderGen extends Object</code> which means that SitePageReader extends SitePageReaderGen which extends Object. 
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
 * <p>By adding a class comment "{@inheritDoc}", the SitePageReader class will inherit the helpful inherited class comments from the super class SitePageReaderGen. 
 * </p>
 * <h2>Rows: null</h2>
 * <h2>Model: true</h2>
 * <h2>Page: true</h2>
 * <h2>SuperPage.enUS: null</h2>
 * <h2>Promise: true</h2>
 * <h2>AName.enUS: null</h2>
 * <p>
 * Delete the class SitePageReader in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.page.reader.SitePageReader&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillage.enus.model.page.reader in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillage.enus.model.page.reader&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartvillage-platform in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartvillage\-platform&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * Generated: true
 **/
public abstract class SitePageReaderGen<DEV> extends Object {
	protected static final Logger LOG = LoggerFactory.getLogger(SitePageReader.class);

	public SitePageReaderGen(Vertx vertx, WorkerExecutor workerExecutor, KafkaProducer<String, String> kafkaProducer, SiteRequestEnUS siteRequest, JsonObject config) {
		super();
		setSiteRequest_(siteRequest);
		setConfig(config);
		setVertx(vertx);
		setWorkerExecutor(workerExecutor);
		setKafkaProducer(kafkaProducer);
	}

	public SitePageReaderGen() {
	}

	//////////////////
	// siteRequest_ //
	//////////////////


	/**	 The entity siteRequest_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SiteRequestEnUS siteRequest_;

	/**	<br> The entity siteRequest_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.page.reader.SitePageReader&fq=entiteVar_enUS_indexed_string:siteRequest_">Find the entity siteRequest_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _siteRequest_(Wrap<SiteRequestEnUS> w);

	public SiteRequestEnUS getSiteRequest_() {
		return siteRequest_;
	}

	public void setSiteRequest_(SiteRequestEnUS siteRequest_) {
		this.siteRequest_ = siteRequest_;
	}
	public static SiteRequestEnUS staticSetSiteRequest_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected SitePageReader siteRequest_Init() {
		Wrap<SiteRequestEnUS> siteRequest_Wrap = new Wrap<SiteRequestEnUS>().var("siteRequest_");
		if(siteRequest_ == null) {
			_siteRequest_(siteRequest_Wrap);
			Optional.ofNullable(siteRequest_Wrap.getO()).ifPresent(o -> {
				setSiteRequest_(o);
			});
		}
		return (SitePageReader)this;
	}

	////////////
	// config //
	////////////


	/**	 The entity config
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject config;

	/**	<br> The entity config
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.page.reader.SitePageReader&fq=entiteVar_enUS_indexed_string:config">Find the entity config in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _config(Wrap<JsonObject> w);

	public JsonObject getConfig() {
		return config;
	}

	public void setConfig(JsonObject config) {
		this.config = config;
	}
	@JsonIgnore
	public void setConfig(String o) {
		this.config = SitePageReader.staticSetConfig(siteRequest_, o);
	}
	public static JsonObject staticSetConfig(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected SitePageReader configInit() {
		Wrap<JsonObject> configWrap = new Wrap<JsonObject>().var("config");
		if(config == null) {
			_config(configWrap);
			Optional.ofNullable(configWrap.getO()).ifPresent(o -> {
				setConfig(o);
			});
		}
		return (SitePageReader)this;
	}

	public static String staticSearchConfig(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o.toString();
	}

	public static String staticSearchStrConfig(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqConfig(SiteRequestEnUS siteRequest_, String o) {
		return SitePageReader.staticSearchConfig(siteRequest_, SitePageReader.staticSetConfig(siteRequest_, o)).toString();
	}

	///////////////
	// webClient //
	///////////////


	/**	 The entity webClient
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected WebClient webClient;

	/**	<br> The entity webClient
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.page.reader.SitePageReader&fq=entiteVar_enUS_indexed_string:webClient">Find the entity webClient in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _webClient(Wrap<WebClient> w);

	public WebClient getWebClient() {
		return webClient;
	}

	public void setWebClient(WebClient webClient) {
		this.webClient = webClient;
	}
	public static WebClient staticSetWebClient(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected SitePageReader webClientInit() {
		Wrap<WebClient> webClientWrap = new Wrap<WebClient>().var("webClient");
		if(webClient == null) {
			_webClient(webClientWrap);
			Optional.ofNullable(webClientWrap.getO()).ifPresent(o -> {
				setWebClient(o);
			});
		}
		return (SitePageReader)this;
	}

	///////////////////
	// kafkaProducer //
	///////////////////


	/**	 The entity kafkaProducer
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected KafkaProducer<String, String> kafkaProducer;

	/**	<br> The entity kafkaProducer
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.page.reader.SitePageReader&fq=entiteVar_enUS_indexed_string:kafkaProducer">Find the entity kafkaProducer in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _kafkaProducer(Wrap<KafkaProducer<String, String>> w);

	public KafkaProducer<String, String> getKafkaProducer() {
		return kafkaProducer;
	}

	public void setKafkaProducer(KafkaProducer<String, String> kafkaProducer) {
		this.kafkaProducer = kafkaProducer;
	}
	public static KafkaProducer<String, String> staticSetKafkaProducer(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected SitePageReader kafkaProducerInit() {
		Wrap<KafkaProducer<String, String>> kafkaProducerWrap = new Wrap<KafkaProducer<String, String>>().var("kafkaProducer");
		if(kafkaProducer == null) {
			_kafkaProducer(kafkaProducerWrap);
			Optional.ofNullable(kafkaProducerWrap.getO()).ifPresent(o -> {
				setKafkaProducer(o);
			});
		}
		return (SitePageReader)this;
	}

	///////////
	// vertx //
	///////////


	/**	 The entity vertx
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Vertx vertx;

	/**	<br> The entity vertx
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.page.reader.SitePageReader&fq=entiteVar_enUS_indexed_string:vertx">Find the entity vertx in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _vertx(Wrap<Vertx> w);

	public Vertx getVertx() {
		return vertx;
	}

	public void setVertx(Vertx vertx) {
		this.vertx = vertx;
	}
	public static Vertx staticSetVertx(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected SitePageReader vertxInit() {
		Wrap<Vertx> vertxWrap = new Wrap<Vertx>().var("vertx");
		if(vertx == null) {
			_vertx(vertxWrap);
			Optional.ofNullable(vertxWrap.getO()).ifPresent(o -> {
				setVertx(o);
			});
		}
		return (SitePageReader)this;
	}

	////////////////////
	// workerExecutor //
	////////////////////


	/**	 The entity workerExecutor
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected WorkerExecutor workerExecutor;

	/**	<br> The entity workerExecutor
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.page.reader.SitePageReader&fq=entiteVar_enUS_indexed_string:workerExecutor">Find the entity workerExecutor in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _workerExecutor(Wrap<WorkerExecutor> w);

	public WorkerExecutor getWorkerExecutor() {
		return workerExecutor;
	}

	public void setWorkerExecutor(WorkerExecutor workerExecutor) {
		this.workerExecutor = workerExecutor;
	}
	public static WorkerExecutor staticSetWorkerExecutor(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected SitePageReader workerExecutorInit() {
		Wrap<WorkerExecutor> workerExecutorWrap = new Wrap<WorkerExecutor>().var("workerExecutor");
		if(workerExecutor == null) {
			_workerExecutor(workerExecutorWrap);
			Optional.ofNullable(workerExecutorWrap.getO()).ifPresent(o -> {
				setWorkerExecutor(o);
			});
		}
		return (SitePageReader)this;
	}

	////////////////////
	// templateEngine //
	////////////////////


	/**	 The entity templateEngine
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected HandlebarsTemplateEngine templateEngine;

	/**	<br> The entity templateEngine
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.page.reader.SitePageReader&fq=entiteVar_enUS_indexed_string:templateEngine">Find the entity templateEngine in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _templateEngine(Wrap<HandlebarsTemplateEngine> w);

	public HandlebarsTemplateEngine getTemplateEngine() {
		return templateEngine;
	}

	public void setTemplateEngine(HandlebarsTemplateEngine templateEngine) {
		this.templateEngine = templateEngine;
	}
	public static HandlebarsTemplateEngine staticSetTemplateEngine(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected SitePageReader templateEngineInit() {
		Wrap<HandlebarsTemplateEngine> templateEngineWrap = new Wrap<HandlebarsTemplateEngine>().var("templateEngine");
		if(templateEngine == null) {
			_templateEngine(templateEngineWrap);
			Optional.ofNullable(templateEngineWrap.getO()).ifPresent(o -> {
				setTemplateEngine(o);
			});
		}
		return (SitePageReader)this;
	}

	////////////////
	// handlebars //
	////////////////


	/**	 The entity handlebars
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Handlebars handlebars;

	/**	<br> The entity handlebars
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.page.reader.SitePageReader&fq=entiteVar_enUS_indexed_string:handlebars">Find the entity handlebars in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _handlebars(Wrap<Handlebars> w);

	public Handlebars getHandlebars() {
		return handlebars;
	}

	public void setHandlebars(Handlebars handlebars) {
		this.handlebars = handlebars;
	}
	public static Handlebars staticSetHandlebars(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected SitePageReader handlebarsInit() {
		Wrap<Handlebars> handlebarsWrap = new Wrap<Handlebars>().var("handlebars");
		if(handlebars == null) {
			_handlebars(handlebarsWrap);
			Optional.ofNullable(handlebarsWrap.getO()).ifPresent(o -> {
				setHandlebars(o);
			});
		}
		return (SitePageReader)this;
	}
	public static final String i18nGeneratorComplete1 = "Importing %s data completed. ";
	public static final String i18nGeneratorComplete = i18nGeneratorComplete1;
	public static final String i18nGeneratorFail1 = "Importing %s data failed. ";
	public static final String i18nGeneratorFail = i18nGeneratorFail1;

	public static final String i18nGeneratorPathComplete1 = "Generating i18n path for page %s completed. ";
	public static final String i18nGeneratorPathComplete = i18nGeneratorPathComplete1;
	public static final String i18nGeneratorPathFail1 = "Generating i18n path for page %s failed. ";
	public static final String i18nGeneratorPathFail = i18nGeneratorPathFail1;

	public static final String deletePageDataComplete1 = "Importing %s data completed. ";
	public static final String deletePageDataComplete = deletePageDataComplete1;
	public static final String deletePageDataFail1 = "Importing %s data failed. ";
	public static final String deletePageDataFail = deletePageDataFail1;

	public static final String importDataSitePagesComplete1 = "Importing all %s data completed. ";
	public static final String importDataSitePagesComplete = importDataSitePagesComplete1;
	public static final String importDataSitePagesFail1 = "Importing all %s data failed. ";
	public static final String importDataSitePagesFail = importDataSitePagesFail1;

	public static final String importDataSitePageComplete1 = "Importing %s data completed. ";
	public static final String importDataSitePageComplete = importDataSitePageComplete1;
	public static final String importDataSitePageFail1 = "Importing %s data failed. ";
	public static final String importDataSitePageFail = importDataSitePageFail1;

	public static final String importFuturesFail1 = "Importing futures failed. ";
	public static final String importFuturesFail = importFuturesFail1;

	public static final String importSitePageComplete1 = "Importing page completed: %s";
	public static final String importSitePageComplete = importSitePageComplete1;
	public static final String importSitePageFail1 = "Importing page failed: %s";
	public static final String importSitePageFail = importSitePageFail1;

	public static final String importSiteHtmComplete1 = "Importing page htm completed";
	public static final String importSiteHtmComplete = importSiteHtmComplete1;
	public static final String importSiteHtmFail1 = "Importing page htm failed: %s";
	public static final String importSiteHtmFail = importSiteHtmFail1;


	//////////////
	// initDeep //
	//////////////

	public SitePageReader initDeepSitePageReader(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		initDeepSitePageReader();
		return (SitePageReader)this;
	}

	public void initDeepSitePageReader() {
		initSitePageReader();
	}

	public void initSitePageReader() {
				siteRequest_Init();
				configInit();
				webClientInit();
				kafkaProducerInit();
				vertxInit();
				workerExecutorInit();
				templateEngineInit();
				handlebarsInit();
	}

	public void initDeepForClass(SiteRequestEnUS siteRequest_) {
		initDeepSitePageReader(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestSitePageReader(SiteRequestEnUS siteRequest_) {
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestSitePageReader(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainSitePageReader(v);
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
	public Object obtainSitePageReader(String var) {
		SitePageReader oSitePageReader = (SitePageReader)this;
		switch(var) {
			case "siteRequest_":
				return oSitePageReader.siteRequest_;
			case "config":
				return oSitePageReader.config;
			case "webClient":
				return oSitePageReader.webClient;
			case "kafkaProducer":
				return oSitePageReader.kafkaProducer;
			case "vertx":
				return oSitePageReader.vertx;
			case "workerExecutor":
				return oSitePageReader.workerExecutor;
			case "templateEngine":
				return oSitePageReader.templateEngine;
			case "handlebars":
				return oSitePageReader.handlebars;
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
				o = relateSitePageReader(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateSitePageReader(String var, Object val) {
		SitePageReader oSitePageReader = (SitePageReader)this;
		switch(var) {
			default:
				return null;
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetSitePageReader(entityVar,  siteRequest_, o);
	}
	public static Object staticSetSitePageReader(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "config":
			return SitePageReader.staticSetConfig(siteRequest_, o);
			default:
				return null;
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchSitePageReader(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchSitePageReader(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "config":
			return SitePageReader.staticSearchConfig(siteRequest_, (JsonObject)o);
			default:
				return null;
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrSitePageReader(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrSitePageReader(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "config":
			return SitePageReader.staticSearchStrConfig(siteRequest_, (String)o);
			default:
				return null;
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqSitePageReader(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqSitePageReader(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "config":
			return SitePageReader.staticSearchFqConfig(siteRequest_, o);
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

	public static final String[] SitePageReaderVals = new String[] { i18nGeneratorComplete1, i18nGeneratorFail1, i18nGeneratorPathComplete1, i18nGeneratorPathFail1, deletePageDataComplete1, deletePageDataFail1, importDataSitePagesComplete1, importDataSitePagesFail1, importDataSitePageComplete1, importDataSitePageFail1, importFuturesFail1, importSitePageComplete1, importSitePageFail1, importSiteHtmComplete1, importSiteHtmFail1 };

	public static final String CLASS_SIMPLE_NAME = "SitePageReader";
	public static final String VAR_siteRequest_ = "siteRequest_";
	public static final String VAR_config = "config";
	public static final String VAR_webClient = "webClient";
	public static final String VAR_kafkaProducer = "kafkaProducer";
	public static final String VAR_vertx = "vertx";
	public static final String VAR_workerExecutor = "workerExecutor";
	public static final String VAR_templateEngine = "templateEngine";
	public static final String VAR_handlebars = "handlebars";

	public static final String DISPLAY_NAME_siteRequest_ = "";
	public static final String DISPLAY_NAME_config = "";
	public static final String DISPLAY_NAME_webClient = "";
	public static final String DISPLAY_NAME_kafkaProducer = "";
	public static final String DISPLAY_NAME_vertx = "";
	public static final String DISPLAY_NAME_workerExecutor = "";
	public static final String DISPLAY_NAME_templateEngine = "";
	public static final String DISPLAY_NAME_handlebars = "";

	public static String displayNameForClass(String var) {
		return SitePageReader.displayNameSitePageReader(var);
	}
	public static String displayNameSitePageReader(String var) {
		switch(var) {
		case VAR_siteRequest_:
			return DISPLAY_NAME_siteRequest_;
		case VAR_config:
			return DISPLAY_NAME_config;
		case VAR_webClient:
			return DISPLAY_NAME_webClient;
		case VAR_kafkaProducer:
			return DISPLAY_NAME_kafkaProducer;
		case VAR_vertx:
			return DISPLAY_NAME_vertx;
		case VAR_workerExecutor:
			return DISPLAY_NAME_workerExecutor;
		case VAR_templateEngine:
			return DISPLAY_NAME_templateEngine;
		case VAR_handlebars:
			return DISPLAY_NAME_handlebars;
		default:
			return null;
		}
	}
}
