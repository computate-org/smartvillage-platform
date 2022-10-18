package org.computate.smartvillageview.enus.model.page.reader;

import org.computate.smartvillageview.enus.request.SiteRequestEnUS;
import org.computate.smartvillageview.enus.model.base.BaseModel;
import org.computate.vertx.api.ApiRequest;
import org.computate.smartvillageview.enus.config.ConfigKeys;
import java.util.Optional;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import java.util.Objects;
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
import java.lang.Object;
import io.vertx.core.Vertx;
import io.vertx.core.WorkerExecutor;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.client.WebClient;
import io.vertx.ext.web.templ.handlebars.HandlebarsTemplateEngine;
import com.github.jknack.handlebars.Handlebars;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;

/**	
 * <h1>Suggestions that can generate more code for you: </h1>
 * <ol>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these SitePageReader objects in a RESTful API. 
 * </li>
 * </ol>
 * <h1>About the SitePageReader class and it's generated class SitePageReaderGen&lt;Object&gt;: </h1>
 * <p>
 * This Java class extends a generated Java class built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.reader.SitePageReader">Find the class SitePageReader in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * <p>
 * Delete the class SitePageReader in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.reader.SitePageReader&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.page.reader in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.reader&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smart-village-view in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smart\-village\-view&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class SitePageReaderGen<DEV> extends Object {
	protected static final Logger LOG = LoggerFactory.getLogger(SitePageReader.class);

	public SitePageReaderGen(Vertx vertx, WorkerExecutor workerExecutor, SiteRequestEnUS siteRequest, JsonObject config) {
		super();
		setSiteRequest_(siteRequest);
		setConfig(config);
		setVertx(vertx);
		setWorkerExecutor(workerExecutor);
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.reader.SitePageReader&fq=entiteVar_enUS_indexed_string:siteRequest_">Find the entity siteRequest_ in Solr</a>
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
			setSiteRequest_(siteRequest_Wrap.o);
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.reader.SitePageReader&fq=entiteVar_enUS_indexed_string:config">Find the entity config in Solr</a>
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
			setConfig(configWrap.o);
		}
		return (SitePageReader)this;
	}

	public static JsonObject staticSearchConfig(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrConfig(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqConfig(SiteRequestEnUS siteRequest_, String o) {
		return SitePageReader.staticSearchStrConfig(siteRequest_, SitePageReader.staticSearchConfig(siteRequest_, SitePageReader.staticSetConfig(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.reader.SitePageReader&fq=entiteVar_enUS_indexed_string:webClient">Find the entity webClient in Solr</a>
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
			setWebClient(webClientWrap.o);
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.reader.SitePageReader&fq=entiteVar_enUS_indexed_string:vertx">Find the entity vertx in Solr</a>
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
			setVertx(vertxWrap.o);
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.reader.SitePageReader&fq=entiteVar_enUS_indexed_string:workerExecutor">Find the entity workerExecutor in Solr</a>
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
			setWorkerExecutor(workerExecutorWrap.o);
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.reader.SitePageReader&fq=entiteVar_enUS_indexed_string:templateEngine">Find the entity templateEngine in Solr</a>
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
			setTemplateEngine(templateEngineWrap.o);
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.reader.SitePageReader&fq=entiteVar_enUS_indexed_string:handlebars">Find the entity handlebars in Solr</a>
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
			setHandlebars(handlebarsWrap.o);
		}
		return (SitePageReader)this;
	}
	public static final String importDataSitePageComplete1 = "Importing %s data completed. ";
	public static final String importDataSitePageComplete = importDataSitePageComplete1;
	public static final String importDataSitePageFail1 = "Importing %s data failed. ";
	public static final String importDataSitePageFail = importDataSitePageFail1;

	public static final String importSitePageComplete1 = "Importing page %s completed. ";
	public static final String importSitePageComplete = importSitePageComplete1;
	public static final String importSitePageFail1 = "Importing page %s failed. ";
	public static final String importSitePageFail = importSitePageFail1;


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
			return SitePageReader.staticSearchStrConfig(siteRequest_, (JsonObject)o);
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

	public static final String[] SitePageReaderVals = new String[] { importDataSitePageComplete1, importDataSitePageFail1, importSitePageComplete1, importSitePageFail1 };

	public static final String CLASS_SIMPLE_NAME = "SitePageReader";
	public static final String VAR_siteRequest_ = "siteRequest_";
	public static final String VAR_config = "config";
	public static final String VAR_webClient = "webClient";
	public static final String VAR_vertx = "vertx";
	public static final String VAR_workerExecutor = "workerExecutor";
	public static final String VAR_templateEngine = "templateEngine";
	public static final String VAR_handlebars = "handlebars";

	public static final String DISPLAY_NAME_siteRequest_ = "";
	public static final String DISPLAY_NAME_config = "";
	public static final String DISPLAY_NAME_webClient = "";
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
