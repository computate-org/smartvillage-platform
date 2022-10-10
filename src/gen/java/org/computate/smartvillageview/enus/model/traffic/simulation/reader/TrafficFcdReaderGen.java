package org.computate.smartvillageview.enus.model.traffic.simulation.reader;

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
import io.vertx.core.eventbus.EventBus;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;

/**	
 * <h1>Suggestions that can generate more code for you: </h1>
 * <ol>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these TrafficFcdReader objects in a RESTful API. 
 * </li>
 * </ol>
 * <h1>About the TrafficFcdReader class and it's generated class TrafficFcdReaderGen&lt;Object&gt;: </h1>
 * <p>
 * This Java class extends a generated Java class built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.reader.TrafficFcdReader">Find the class TrafficFcdReader in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * <p>
 * Delete the class TrafficFcdReader in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.reader.TrafficFcdReader&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.traffic.simulation.reader in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.reader&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smart-village-view in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smart\-village\-view&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class TrafficFcdReaderGen<DEV> extends Object {
	protected static final Logger LOG = LoggerFactory.getLogger(TrafficFcdReader.class);

	public TrafficFcdReaderGen(Vertx vertx, WorkerExecutor workerExecutor, SiteRequestEnUS siteRequest, JsonObject config) {
		super();
		setSiteRequest_(siteRequest);
		setConfig(config);
		setVertx(vertx);
		setWorkerExecutor(workerExecutor);
		setEventBus(vertx.eventBus());
	}

	public TrafficFcdReaderGen() {
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.reader.TrafficFcdReader&fq=entiteVar_enUS_indexed_string:siteRequest_">Find the entity siteRequest_ in Solr</a>
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
	protected TrafficFcdReader siteRequest_Init() {
		Wrap<SiteRequestEnUS> siteRequest_Wrap = new Wrap<SiteRequestEnUS>().var("siteRequest_");
		if(siteRequest_ == null) {
			_siteRequest_(siteRequest_Wrap);
			setSiteRequest_(siteRequest_Wrap.o);
		}
		return (TrafficFcdReader)this;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.reader.TrafficFcdReader&fq=entiteVar_enUS_indexed_string:config">Find the entity config in Solr</a>
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
		this.config = TrafficFcdReader.staticSetConfig(siteRequest_, o);
	}
	public static JsonObject staticSetConfig(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected TrafficFcdReader configInit() {
		Wrap<JsonObject> configWrap = new Wrap<JsonObject>().var("config");
		if(config == null) {
			_config(configWrap);
			setConfig(configWrap.o);
		}
		return (TrafficFcdReader)this;
	}

	public static JsonObject staticSearchConfig(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrConfig(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqConfig(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFcdReader.staticSearchStrConfig(siteRequest_, TrafficFcdReader.staticSearchConfig(siteRequest_, TrafficFcdReader.staticSetConfig(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.reader.TrafficFcdReader&fq=entiteVar_enUS_indexed_string:webClient">Find the entity webClient in Solr</a>
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
	protected TrafficFcdReader webClientInit() {
		Wrap<WebClient> webClientWrap = new Wrap<WebClient>().var("webClient");
		if(webClient == null) {
			_webClient(webClientWrap);
			setWebClient(webClientWrap.o);
		}
		return (TrafficFcdReader)this;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.reader.TrafficFcdReader&fq=entiteVar_enUS_indexed_string:vertx">Find the entity vertx in Solr</a>
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
	protected TrafficFcdReader vertxInit() {
		Wrap<Vertx> vertxWrap = new Wrap<Vertx>().var("vertx");
		if(vertx == null) {
			_vertx(vertxWrap);
			setVertx(vertxWrap.o);
		}
		return (TrafficFcdReader)this;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.reader.TrafficFcdReader&fq=entiteVar_enUS_indexed_string:workerExecutor">Find the entity workerExecutor in Solr</a>
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
	protected TrafficFcdReader workerExecutorInit() {
		Wrap<WorkerExecutor> workerExecutorWrap = new Wrap<WorkerExecutor>().var("workerExecutor");
		if(workerExecutor == null) {
			_workerExecutor(workerExecutorWrap);
			setWorkerExecutor(workerExecutorWrap.o);
		}
		return (TrafficFcdReader)this;
	}

	//////////////
	// eventBus //
	//////////////

	/**	 The entity eventBus
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected EventBus eventBus;

	/**	<br> The entity eventBus
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.reader.TrafficFcdReader&fq=entiteVar_enUS_indexed_string:eventBus">Find the entity eventBus in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _eventBus(Wrap<EventBus> w);

	public EventBus getEventBus() {
		return eventBus;
	}

	public void setEventBus(EventBus eventBus) {
		this.eventBus = eventBus;
	}
	public static EventBus staticSetEventBus(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected TrafficFcdReader eventBusInit() {
		Wrap<EventBus> eventBusWrap = new Wrap<EventBus>().var("eventBus");
		if(eventBus == null) {
			_eventBus(eventBusWrap);
			setEventBus(eventBusWrap.o);
		}
		return (TrafficFcdReader)this;
	}
	public static final String importFcdComplete1 = "Syncing FCD files completed. ";
	public static final String importFcdComplete = importFcdComplete1;
	public static final String importFcdFail1 = "Syncing FCD files failed. ";
	public static final String importFcdFail = importFcdFail1;
	public static final String importFcdSkip1 = "Skip importing FCD files. ";
	public static final String importFcdSkip = importFcdSkip1;
	public static final String importFcdStarted1 = "Started importing FCD files. ";
	public static final String importFcdStarted = importFcdStarted1;

	public static final String importSystemEventStarted1 = "Syncing FCD record started: %s";
	public static final String importSystemEventStarted = importSystemEventStarted1;
	public static final String importSystemEventComplete1 = "Syncing FCD record completed: %s";
	public static final String importSystemEventComplete = importSystemEventComplete1;
	public static final String importSystemEventFail1 = "Syncing FCD record failed: %s";
	public static final String importSystemEventFail = importSystemEventFail1;
	public static final String importSystemEventWebSocket1 = "websocket%s";
	public static final String importSystemEventWebSocket = importSystemEventWebSocket1;

	public static final String importTrafficSimulationFutureComplete1 = "Syncing Traffic simulation import complete: %s";
	public static final String importTrafficSimulationFutureComplete = importTrafficSimulationFutureComplete1;
	public static final String importTrafficSimulationFutureFail1 = "Syncing Traffic simulation import failed: %s";
	public static final String importTrafficSimulationFutureFail = importTrafficSimulationFutureFail1;

	public static final String obtainSumoAdditionalFilesComplete1 = "Syncing sumocfg file complete: %s";
	public static final String obtainSumoAdditionalFilesComplete = obtainSumoAdditionalFilesComplete1;
	public static final String obtainSumoAdditionalFilesFail1 = "Syncing sumocfg file failed: %s";
	public static final String obtainSumoAdditionalFilesFail = obtainSumoAdditionalFilesFail1;

	public static final String obtainSumoAdditionalFilePathsComplete1 = "Syncing SUMO net file complete: %s";
	public static final String obtainSumoAdditionalFilePathsComplete = obtainSumoAdditionalFilePathsComplete1;
	public static final String obtainSumoAdditionalFilePathsFail1 = "Syncing SUMO net file failed: %s";
	public static final String obtainSumoAdditionalFilePathsFail = obtainSumoAdditionalFilePathsFail1;

	public static final String obtainTlsStatesFilesComplete1 = "Syncing sumocfg file complete: %s";
	public static final String obtainTlsStatesFilesComplete = obtainTlsStatesFilesComplete1;
	public static final String obtainTlsStatesFilesFail1 = "Syncing sumocfg file failed: %s";
	public static final String obtainTlsStatesFilesFail = obtainTlsStatesFilesFail1;

	public static final String obtainTlsStatesPathsComplete1 = "Syncing SUMO net file complete: %s";
	public static final String obtainTlsStatesPathsComplete = obtainTlsStatesPathsComplete1;
	public static final String obtainTlsStatesPathsFail1 = "Syncing SUMO net file failed: %s";
	public static final String obtainTlsStatesPathsFail = obtainTlsStatesPathsFail1;

	public static final String importSumoNetFilesComplete1 = "Syncing sumocfg file complete: %s";
	public static final String importSumoNetFilesComplete = importSumoNetFilesComplete1;
	public static final String importSumoNetFilesFail1 = "Syncing sumocfg file failed: %s";
	public static final String importSumoNetFilesFail = importSumoNetFilesFail1;

	public static final String importSumoNetFilePathComplete1 = "Syncing SUMO net file complete: %s";
	public static final String importSumoNetFilePathComplete = importSumoNetFilePathComplete1;
	public static final String importSumoNetFilePathFail1 = "Syncing SUMO net file failed: %s";
	public static final String importSumoNetFilePathFail = importSumoNetFilePathFail1;

	public static final String importTrafficLightHandleBodyStarted1 = "Syncing Traffic Light record started: %s";
	public static final String importTrafficLightHandleBodyStarted = importTrafficLightHandleBodyStarted1;
	public static final String importTrafficLightHandleBodyComplete1 = "Syncing Traffic Light record completed: %s";
	public static final String importTrafficLightHandleBodyComplete = importTrafficLightHandleBodyComplete1;
	public static final String importTrafficLightHandleBodyFail1 = "Syncing Traffic Light record failed: %s";
	public static final String importTrafficLightHandleBodyFail = importTrafficLightHandleBodyFail1;
	public static final String importTrafficLightHandleBodyWebSocket1 = "websocket%s";
	public static final String importTrafficLightHandleBodyWebSocket = importTrafficLightHandleBodyWebSocket1;

	public static final String importTlsStatesFileComplete1 = "Syncing SUMO net file complete: %s";
	public static final String importTlsStatesFileComplete = importTlsStatesFileComplete1;
	public static final String importTlsStatesFileFail1 = "Syncing SUMO net file failed: %s";
	public static final String importTlsStatesFileFail = importTlsStatesFileFail1;

	public static final String importTrafficLightStepHandleBodyStarted1 = "Syncing Traffic Light record started: %s";
	public static final String importTrafficLightStepHandleBodyStarted = importTrafficLightStepHandleBodyStarted1;
	public static final String importTrafficLightStepHandleBodyComplete1 = "Syncing Traffic Light record completed: %s";
	public static final String importTrafficLightStepHandleBodyComplete = importTrafficLightStepHandleBodyComplete1;
	public static final String importTrafficLightStepHandleBodyFail1 = "Syncing Traffic Light record failed: %s";
	public static final String importTrafficLightStepHandleBodyFail = importTrafficLightStepHandleBodyFail1;
	public static final String importTrafficLightStepHandleBodyWebSocket1 = "websocket%s";
	public static final String importTrafficLightStepHandleBodyWebSocket = importTrafficLightStepHandleBodyWebSocket1;

	public static final String importFcdFileListStarted1 = "Syncing FCD files started. ";
	public static final String importFcdFileListStarted = importFcdFileListStarted1;
	public static final String importFcdFileListComplete1 = "Syncing FCD files completed. ";
	public static final String importFcdFileListComplete = importFcdFileListComplete1;
	public static final String importFcdFileListSkip1 = "Syncing FCD files is disabled. ";
	public static final String importFcdFileListSkip = importFcdFileListSkip1;
	public static final String importFcdFileListFail1 = "Syncing FCD files failed. ";
	public static final String importFcdFileListFail = importFcdFileListFail1;

	public static final String importFcdFileStarted1 = "Syncing FCD file started: %s";
	public static final String importFcdFileStarted = importFcdFileStarted1;
	public static final String importFcdFileComplete1 = "Syncing FCD file completed: %s";
	public static final String importFcdFileComplete = importFcdFileComplete1;
	public static final String importFcdFileFail1 = "Syncing FCD file failed: %s";
	public static final String importFcdFileFail = importFcdFileFail1;

	public static final String importFcdHandleBodyStarted1 = "Syncing FCD record started: %s";
	public static final String importFcdHandleBodyStarted = importFcdHandleBodyStarted1;
	public static final String importFcdHandleBodyComplete1 = "Syncing FCD record completed: %s";
	public static final String importFcdHandleBodyComplete = importFcdHandleBodyComplete1;
	public static final String importFcdHandleBodyFail1 = "Syncing FCD record failed: %s";
	public static final String importFcdHandleBodyFail = importFcdHandleBodyFail1;
	public static final String importFcdHandleBodyWebSocket1 = "websocket%s";
	public static final String importFcdHandleBodyWebSocket = importFcdHandleBodyWebSocket1;

	public static final String importVehicleStarted1 = "Syncing FCD vehicle started: %s";
	public static final String importVehicleStarted = importVehicleStarted1;
	public static final String importVehicleComplete1 = "Syncing FCD vehicle completed: %s";
	public static final String importVehicleComplete = importVehicleComplete1;
	public static final String importVehicleFail1 = "Syncing FCD vehicle failed: %s";
	public static final String importVehicleFail = importVehicleFail1;

	public static final String importFcdVehicleStepStarted1 = "Syncing FCD record started: %s";
	public static final String importFcdVehicleStepStarted = importFcdVehicleStepStarted1;
	public static final String importFcdVehicleStepComplete1 = "Syncing FCD record completed: %s";
	public static final String importFcdVehicleStepComplete = importFcdVehicleStepComplete1;
	public static final String importFcdVehicleStepFail1 = "Syncing FCD record failed: %s";
	public static final String importFcdVehicleStepFail = importFcdVehicleStepFail1;
	public static final String importFcdVehicleStepWebSocket1 = "websocket%s";
	public static final String importFcdVehicleStepWebSocket = importFcdVehicleStepWebSocket1;


	//////////////
	// initDeep //
	//////////////

	public TrafficFcdReader initDeepTrafficFcdReader(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		initDeepTrafficFcdReader();
		return (TrafficFcdReader)this;
	}

	public void initDeepTrafficFcdReader() {
		initTrafficFcdReader();
	}

	public void initTrafficFcdReader() {
				siteRequest_Init();
				configInit();
				webClientInit();
				vertxInit();
				workerExecutorInit();
				eventBusInit();
	}

	public void initDeepForClass(SiteRequestEnUS siteRequest_) {
		initDeepTrafficFcdReader(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestTrafficFcdReader(SiteRequestEnUS siteRequest_) {
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestTrafficFcdReader(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainTrafficFcdReader(v);
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
	public Object obtainTrafficFcdReader(String var) {
		TrafficFcdReader oTrafficFcdReader = (TrafficFcdReader)this;
		switch(var) {
			case "siteRequest_":
				return oTrafficFcdReader.siteRequest_;
			case "config":
				return oTrafficFcdReader.config;
			case "webClient":
				return oTrafficFcdReader.webClient;
			case "vertx":
				return oTrafficFcdReader.vertx;
			case "workerExecutor":
				return oTrafficFcdReader.workerExecutor;
			case "eventBus":
				return oTrafficFcdReader.eventBus;
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
				o = relateTrafficFcdReader(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateTrafficFcdReader(String var, Object val) {
		TrafficFcdReader oTrafficFcdReader = (TrafficFcdReader)this;
		switch(var) {
			default:
				return null;
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetTrafficFcdReader(entityVar,  siteRequest_, o);
	}
	public static Object staticSetTrafficFcdReader(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "config":
			return TrafficFcdReader.staticSetConfig(siteRequest_, o);
			default:
				return null;
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchTrafficFcdReader(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchTrafficFcdReader(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "config":
			return TrafficFcdReader.staticSearchConfig(siteRequest_, (JsonObject)o);
			default:
				return null;
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrTrafficFcdReader(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrTrafficFcdReader(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "config":
			return TrafficFcdReader.staticSearchStrConfig(siteRequest_, (JsonObject)o);
			default:
				return null;
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqTrafficFcdReader(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqTrafficFcdReader(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "config":
			return TrafficFcdReader.staticSearchFqConfig(siteRequest_, o);
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

	public static final String[] TrafficFcdReaderVals = new String[] { importFcdComplete1, importFcdFail1, importFcdSkip1, importFcdStarted1, importSystemEventStarted1, importSystemEventComplete1, importSystemEventFail1, importSystemEventWebSocket1, importTrafficSimulationFutureComplete1, importTrafficSimulationFutureFail1, obtainSumoAdditionalFilesComplete1, obtainSumoAdditionalFilesFail1, obtainSumoAdditionalFilePathsComplete1, obtainSumoAdditionalFilePathsFail1, obtainTlsStatesFilesComplete1, obtainTlsStatesFilesFail1, obtainTlsStatesPathsComplete1, obtainTlsStatesPathsFail1, importSumoNetFilesComplete1, importSumoNetFilesFail1, importSumoNetFilePathComplete1, importSumoNetFilePathFail1, importTrafficLightHandleBodyStarted1, importTrafficLightHandleBodyComplete1, importTrafficLightHandleBodyFail1, importTrafficLightHandleBodyWebSocket1, importTlsStatesFileComplete1, importTlsStatesFileFail1, importTrafficLightStepHandleBodyStarted1, importTrafficLightStepHandleBodyComplete1, importTrafficLightStepHandleBodyFail1, importTrafficLightStepHandleBodyWebSocket1, importFcdFileListStarted1, importFcdFileListComplete1, importFcdFileListSkip1, importFcdFileListFail1, importFcdFileStarted1, importFcdFileComplete1, importFcdFileFail1, importFcdHandleBodyStarted1, importFcdHandleBodyComplete1, importFcdHandleBodyFail1, importFcdHandleBodyWebSocket1, importVehicleStarted1, importVehicleComplete1, importVehicleFail1, importFcdVehicleStepStarted1, importFcdVehicleStepComplete1, importFcdVehicleStepFail1, importFcdVehicleStepWebSocket1 };

	public static final String CLASS_SIMPLE_NAME = "TrafficFcdReader";
	public static final String VAR_siteRequest_ = "siteRequest_";
	public static final String VAR_config = "config";
	public static final String VAR_webClient = "webClient";
	public static final String VAR_vertx = "vertx";
	public static final String VAR_workerExecutor = "workerExecutor";
	public static final String VAR_eventBus = "eventBus";

	public static final String DISPLAY_NAME_siteRequest_ = "";
	public static final String DISPLAY_NAME_config = "";
	public static final String DISPLAY_NAME_webClient = "";
	public static final String DISPLAY_NAME_vertx = "";
	public static final String DISPLAY_NAME_workerExecutor = "";
	public static final String DISPLAY_NAME_eventBus = "";

	public static String displayNameForClass(String var) {
		return TrafficFcdReader.displayNameTrafficFcdReader(var);
	}
	public static String displayNameTrafficFcdReader(String var) {
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
		case VAR_eventBus:
			return DISPLAY_NAME_eventBus;
		default:
			return null;
		}
	}
}
