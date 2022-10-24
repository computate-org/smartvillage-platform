package org.computate.smartvillageview.enus.model.traffic.time.step;

import org.computate.smartvillageview.enus.request.SiteRequestEnUS;
import org.computate.smartvillageview.enus.model.base.BaseModel;
import org.computate.vertx.api.ApiRequest;
import org.computate.vertx.config.ComputateConfigKeys;
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
import org.computate.smartvillageview.enus.result.base.BaseResult;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;
import io.vertx.core.json.JsonObject;

/**	
 * <h1>Suggestions that can generate more code for you: </h1>
 * <ol>
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class TimeStepGen into the class TimeStep. 
 * </li>
 * <li>You can add a class comment "Model: true" if you wish to persist these TimeStep objects in a relational PostgreSQL database transactionally in the RESTful API. 
 * The code to persist and query the TimeStepGen data in the database will then be automatically generated. 
 * </li>
 * </ol>
 * <h1>About the TimeStep class and it's generated class TimeStepGen&lt;BaseResult&gt;: </h1>
 * <p>
 * This Java class extends a generated Java class built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.time.step.TimeStep">Find the class TimeStep in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * <p>This class contains a comment <b>"Indexed: true"</b>, which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * <p>This class contains a comment <b>"Page: true"</b>, which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.smartvillageview.enus.model.traffic.time.step.TimeStepPage. 
 * </p>
 * <p>This class contains a comment <b>"SuperPage.enUS: BaseResultPage"</b>, which identifies the Java super class of the page code by it's class simple name "BaseResultPage". 
 * This means that the newly created class org.computate.smartvillageview.enus.model.traffic.time.step.TimeStepPage extends org.computate.smartvillageview.enus.result.base.BaseResultPage. 
 * </p>
 * <p>This class contains a comment <b>"Api: true"</b>, which means this class will have Java Vert.x API backend code generated for these objects. 
 * </p>
 * <p>This class contains a comment <b>"ApiTag: Time Step"</b>, which groups all of the OpenAPIs for TimeStep objects under the tag "Time Step". 
 * </p>
 * <p>This class contains a comment <b>"ApiUri: /api/time-step"</b>, which defines the base API URI for TimeStep objects as "/api/time-step" in the OpenAPI spec. 
 * </p>
 * <p>This class contains a comment <b>"Rows: 100"</b>, which means the TimeStep API will return a default of 100 records instead of 10 by default. 
 * Each API has built in pagination of the search records to ensure a user can query all the data a page at a time without running the application out of memory. 
 * </p>
 * <p>This class contains a comment <b>"AName.enUS: a time step"</b>, which identifies the language context to describe a TimeStep as "a time step". 
 * </p>
 * <p>This class contains a comment <b>"Color: blue"</b>, which styles the TimeStep page "blue". 
 * This will reference a CSS class defined by the stylesheets in the project that starts with "w3-". 
 * A css class of "w3-blue" is expected to exist in the project stylesheets, and is inspired by W3 CSS colors. 
 * See: <a href="https://www.w3schools.com/w3css/w3css_colors.asp">https://www.w3schools.com/w3css/w3css_colors.asp</a>. 
 * </p>
 * <p>This class contains a comment <b>"IconGroup: duotone"</b>, which adds icons on the TimeStep page with a group of "duotone". 
 * This will reference a Font Awesome icon group defined by the stylesheets in the project that starts with "fa" followed by the first letter of the icon group, which is "fad". 
 * A Font Awesome icon group of "blue" is expected to exist. 
 * The Font Awesome groups currently supported include: solid, thin, duotone. 
 * See: <a href="https://www.w3schools.com/w3css/w3css_colors.asp">https://www.w3schools.com/w3css/w3css_colors.asp</a>. 
 * </p>
 * <p>
 * Delete the class TimeStep in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.time.step.TimeStep&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.traffic.time.step in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.time.step&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class TimeStepGen<DEV> extends BaseResult {
	protected static final Logger LOG = LoggerFactory.getLogger(TimeStep.class);

	public static final String TimeStep_AName_enUS = "a time step";
	public static final String TimeStep_This_enUS = "this ";
	public static final String TimeStep_ThisName_enUS = "this time step";
	public static final String TimeStep_A_enUS = "a ";
	public static final String TimeStep_TheName_enUS = "the time step";
	public static final String TimeStep_NameSingular_enUS = "time step";
	public static final String TimeStep_NamePlural_enUS = "time steps";
	public static final String TimeStep_NameActual_enUS = "current time step";
	public static final String TimeStep_AllName_enUS = "all the time steps";
	public static final String TimeStep_SearchAllNameBy_enUS = "search time steps by ";
	public static final String TimeStep_Title_enUS = "time steps";
	public static final String TimeStep_ThePluralName_enUS = "the time steps";
	public static final String TimeStep_NoNameFound_enUS = "no time step found";
	public static final String TimeStep_ApiUri_enUS = "/api/time-step";
	public static final String TimeStep_ApiUriSearchPage_enUS = "/time-step";
	public static final String TimeStep_OfName_enUS = "of time step";
	public static final String TimeStep_ANameAdjective_enUS = "a time step";
	public static final String TimeStep_NameAdjectiveSingular_enUS = "time step";
	public static final String TimeStep_NameAdjectivePlural_enUS = "time steps";
	public static final String Search_enUS_Uri = "/api/time-step";
	public static final String Search_enUS_ImageUri = "/png/api/time-step-999.png";
	public static final String GET_enUS_Uri = "/api/time-step/{id}";
	public static final String GET_enUS_ImageUri = "/png/api/time-step/{id}-999.png";
	public static final String PATCH_enUS_Uri = "/api/time-step";
	public static final String PATCH_enUS_ImageUri = "/png/api/time-step-999.png";
	public static final String POST_enUS_Uri = "/api/time-step";
	public static final String POST_enUS_ImageUri = "/png/api/time-step-999.png";
	public static final String PUTImport_enUS_Uri = "/api/time-step-import";
	public static final String PUTImport_enUS_ImageUri = "/png/api/time-step-import-999.png";
	public static final String SearchPage_enUS_Uri = "/time-step";
	public static final String SearchPage_enUS_ImageUri = "/png/time-step-999.png";

	public static final String TimeStep_Color = "blue";
	public static final String TimeStep_IconGroup = "duotone";
	public static final String TimeStep_IconName = "timer";
	public static final Integer TimeStep_Rows = 100;

	///////////////////
	// simulationKey //
	///////////////////

	/**	 The entity simulationKey
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long simulationKey;

	/**	<br> The entity simulationKey
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.time.step.TimeStep&fq=entiteVar_enUS_indexed_string:simulationKey">Find the entity simulationKey in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _simulationKey(Wrap<Long> w);

	public Long getSimulationKey() {
		return simulationKey;
	}

	public void setSimulationKey(Long simulationKey) {
		this.simulationKey = simulationKey;
	}
	@JsonIgnore
	public void setSimulationKey(String o) {
		this.simulationKey = TimeStep.staticSetSimulationKey(siteRequest_, o);
	}
	public static Long staticSetSimulationKey(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected TimeStep simulationKeyInit() {
		Wrap<Long> simulationKeyWrap = new Wrap<Long>().var("simulationKey");
		if(simulationKey == null) {
			_simulationKey(simulationKeyWrap);
			setSimulationKey(simulationKeyWrap.o);
		}
		return (TimeStep)this;
	}

	public static Long staticSearchSimulationKey(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrSimulationKey(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSimulationKey(SiteRequestEnUS siteRequest_, String o) {
		return TimeStep.staticSearchStrSimulationKey(siteRequest_, TimeStep.staticSearchSimulationKey(siteRequest_, TimeStep.staticSetSimulationKey(siteRequest_, o)));
	}

	public Long sqlSimulationKey() {
		return simulationKey;
	}

	//////////
	// path //
	//////////

	/**	 The entity path
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String path;

	/**	<br> The entity path
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.time.step.TimeStep&fq=entiteVar_enUS_indexed_string:path">Find the entity path in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _path(Wrap<String> w);

	public String getPath() {
		return path;
	}
	public void setPath(String o) {
		this.path = TimeStep.staticSetPath(siteRequest_, o);
	}
	public static String staticSetPath(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TimeStep pathInit() {
		Wrap<String> pathWrap = new Wrap<String>().var("path");
		if(path == null) {
			_path(pathWrap);
			setPath(pathWrap.o);
		}
		return (TimeStep)this;
	}

	public static String staticSearchPath(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPath(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPath(SiteRequestEnUS siteRequest_, String o) {
		return TimeStep.staticSearchStrPath(siteRequest_, TimeStep.staticSearchPath(siteRequest_, TimeStep.staticSetPath(siteRequest_, o)));
	}

	public String sqlPath() {
		return path;
	}

	//////////
	// time //
	//////////

	/**	 The entity time
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal time;

	/**	<br> The entity time
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.time.step.TimeStep&fq=entiteVar_enUS_indexed_string:time">Find the entity time in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _time(Wrap<BigDecimal> w);

	public BigDecimal getTime() {
		return time;
	}

	public void setTime(BigDecimal time) {
		this.time = time;
	}
	@JsonIgnore
	public void setTime(String o) {
		this.time = TimeStep.staticSetTime(siteRequest_, o);
	}
	public static BigDecimal staticSetTime(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setTime(Double o) {
			this.time = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setTime(Integer o) {
			this.time = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected TimeStep timeInit() {
		Wrap<BigDecimal> timeWrap = new Wrap<BigDecimal>().var("time");
		if(time == null) {
			_time(timeWrap);
			setTime(timeWrap.o);
		}
		return (TimeStep)this;
	}

	public static Double staticSearchTime(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrTime(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqTime(SiteRequestEnUS siteRequest_, String o) {
		return TimeStep.staticSearchStrTime(siteRequest_, TimeStep.staticSearchTime(siteRequest_, TimeStep.staticSetTime(siteRequest_, o)));
	}

	public BigDecimal sqlTime() {
		return time;
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepTimeStep(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepTimeStep();
	}

	public Future<Void> promiseDeepTimeStep() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseTimeStep(promise2);
		promise2.future().onSuccess(a -> {
			super.promiseDeepBaseResult(siteRequest_).onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseTimeStep(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				simulationKeyInit();
				pathInit();
				timeInit();
				promise2.complete();
			} catch(Exception ex) {
				promise2.fail(ex);
			}
			return promise2.future();
		}).onSuccess(a -> {
			promise.complete();
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	@Override public Future<Void> promiseDeepForClass(SiteRequestEnUS siteRequest_) {
		return promiseDeepTimeStep(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestTimeStep(SiteRequestEnUS siteRequest_) {
			super.siteRequestBaseResult(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestTimeStep(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainTimeStep(v);
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
	public Object obtainTimeStep(String var) {
		TimeStep oTimeStep = (TimeStep)this;
		switch(var) {
			case "simulationKey":
				return oTimeStep.simulationKey;
			case "path":
				return oTimeStep.path;
			case "time":
				return oTimeStep.time;
			default:
				return super.obtainBaseResult(var);
		}
	}

	///////////////
	// relate //
	///////////////

	@Override public boolean relateForClass(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = relateTimeStep(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateTimeStep(String var, Object val) {
		TimeStep oTimeStep = (TimeStep)this;
		switch(var) {
			default:
				return super.relateBaseResult(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetTimeStep(entityVar,  siteRequest_, o);
	}
	public static Object staticSetTimeStep(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "simulationKey":
			return TimeStep.staticSetSimulationKey(siteRequest_, o);
		case "path":
			return TimeStep.staticSetPath(siteRequest_, o);
		case "time":
			return TimeStep.staticSetTime(siteRequest_, o);
			default:
				return BaseResult.staticSetBaseResult(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchTimeStep(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchTimeStep(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "simulationKey":
			return TimeStep.staticSearchSimulationKey(siteRequest_, (Long)o);
		case "path":
			return TimeStep.staticSearchPath(siteRequest_, (String)o);
		case "time":
			return TimeStep.staticSearchTime(siteRequest_, (BigDecimal)o);
			default:
				return BaseResult.staticSearchBaseResult(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrTimeStep(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrTimeStep(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "simulationKey":
			return TimeStep.staticSearchStrSimulationKey(siteRequest_, (Long)o);
		case "path":
			return TimeStep.staticSearchStrPath(siteRequest_, (String)o);
		case "time":
			return TimeStep.staticSearchStrTime(siteRequest_, (Double)o);
			default:
				return BaseResult.staticSearchStrBaseResult(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqTimeStep(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqTimeStep(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "simulationKey":
			return TimeStep.staticSearchFqSimulationKey(siteRequest_, o);
		case "path":
			return TimeStep.staticSearchFqPath(siteRequest_, o);
		case "time":
			return TimeStep.staticSearchFqTime(siteRequest_, o);
			default:
				return BaseResult.staticSearchFqBaseResult(entityVar,  siteRequest_, o);
		}
	}

	/////////////
	// persist //
	/////////////

	@Override public boolean persistForClass(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		if(val != null) {
			for(String v : vars) {
				if(o == null)
					o = persistTimeStep(v, val);
				else if(o instanceof BaseModel) {
					BaseModel oBaseModel = (BaseModel)o;
					o = oBaseModel.persistForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object persistTimeStep(String var, Object val) {
		String varLower = var.toLowerCase();
			if("simulationkey".equals(varLower)) {
				if(val instanceof Long) {
					setSimulationKey((Long)val);
				} else {
					setSimulationKey(val == null ? null : val.toString());
				}
				saves.add("simulationKey");
				return val;
			} else if("path".equals(varLower)) {
				if(val instanceof String) {
					setPath((String)val);
				}
				saves.add("path");
				return val;
			} else if("time".equals(varLower)) {
				if(val instanceof String) {
					setTime((String)val);
				} else if(val instanceof Number) {
					setTime(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("time");
				return val;
			} else {
				return super.persistBaseResult(var, val);
			}
	}

	/////////////
	// populate //
	/////////////

	@Override public void populateForClass(SolrResponse.Doc doc) {
		populateTimeStep(doc);
	}
	public void populateTimeStep(SolrResponse.Doc doc) {
		TimeStep oTimeStep = (TimeStep)this;
		saves = doc.get("saves_docvalues_strings");
		if(saves != null) {
		}

		super.populateBaseResult(doc);
	}

	public void indexTimeStep(JsonObject doc) {
		if(simulationKey != null) {
			doc.put("simulationKey_docvalues_long", simulationKey);
		}
		if(path != null) {
			doc.put("path_docvalues_string", path);
		}
		if(time != null) {
			doc.put("time_docvalues_double", time.doubleValue());
		}
		super.indexBaseResult(doc);

	}

	public static String varStoredTimeStep(String entityVar) {
		switch(entityVar) {
			case "simulationKey":
				return "simulationKey_docvalues_long";
			case "path":
				return "path_docvalues_string";
			case "time":
				return "time_docvalues_double";
			default:
				return BaseResult.varStoredBaseResult(entityVar);
		}
	}

	public static String varIndexedTimeStep(String entityVar) {
		switch(entityVar) {
			case "simulationKey":
				return "simulationKey_docvalues_long";
			case "path":
				return "path_docvalues_string";
			case "time":
				return "time_docvalues_double";
			default:
				return BaseResult.varIndexedBaseResult(entityVar);
		}
	}

	public static String searchVarTimeStep(String searchVar) {
		switch(searchVar) {
			case "simulationKey_docvalues_long":
				return "simulationKey";
			case "path_docvalues_string":
				return "path";
			case "time_docvalues_double":
				return "time";
			default:
				return BaseResult.searchVarBaseResult(searchVar);
		}
	}

	public static String varSearchTimeStep(String entityVar) {
		switch(entityVar) {
			default:
				return BaseResult.varSearchBaseResult(entityVar);
		}
	}

	public static String varSuggestedTimeStep(String entityVar) {
		switch(entityVar) {
			default:
				return BaseResult.varSuggestedBaseResult(entityVar);
		}
	}

	/////////////
	// store //
	/////////////

	@Override public void storeForClass(SolrResponse.Doc doc) {
		storeTimeStep(doc);
	}
	public void storeTimeStep(SolrResponse.Doc doc) {
		TimeStep oTimeStep = (TimeStep)this;

		oTimeStep.setSimulationKey(Optional.ofNullable(doc.get("simulationKey_docvalues_long")).map(v -> v.toString()).orElse(null));
		oTimeStep.setPath(Optional.ofNullable(doc.get("path_docvalues_string")).map(v -> v.toString()).orElse(null));
		oTimeStep.setTime(Optional.ofNullable(doc.get("time_docvalues_double")).map(v -> v.toString()).orElse(null));

		super.storeBaseResult(doc);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestTimeStep() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof TimeStep) {
			TimeStep original = (TimeStep)o;
			if(!Objects.equals(simulationKey, original.getSimulationKey()))
				apiRequest.addVars("simulationKey");
			if(!Objects.equals(path, original.getPath()))
				apiRequest.addVars("path");
			if(!Objects.equals(time, original.getTime()))
				apiRequest.addVars("time");
			super.apiRequestBaseResult();
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(Optional.ofNullable(simulationKey).map(v -> "simulationKey: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(path).map(v -> "path: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(time).map(v -> "time: " + v + "\n").orElse(""));
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "TimeStep";
	public static final String VAR_simulationKey = "simulationKey";
	public static final String VAR_path = "path";
	public static final String VAR_time = "time";

	public static List<String> varsQForClass() {
		return TimeStep.varsQTimeStep(new ArrayList<String>());
	}
	public static List<String> varsQTimeStep(List<String> vars) {
		BaseResult.varsQBaseResult(vars);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return TimeStep.varsFqTimeStep(new ArrayList<String>());
	}
	public static List<String> varsFqTimeStep(List<String> vars) {
		vars.add(VAR_simulationKey);
		vars.add(VAR_path);
		vars.add(VAR_time);
		BaseResult.varsFqBaseResult(vars);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return TimeStep.varsRangeTimeStep(new ArrayList<String>());
	}
	public static List<String> varsRangeTimeStep(List<String> vars) {
		vars.add(VAR_simulationKey);
		vars.add(VAR_time);
		BaseResult.varsRangeBaseResult(vars);
		return vars;
	}

	public static final String DISPLAY_NAME_simulationKey = "Simulation";
	public static final String DISPLAY_NAME_path = "Path";
	public static final String DISPLAY_NAME_time = "Time in seconds";

	public static String displayNameForClass(String var) {
		return TimeStep.displayNameTimeStep(var);
	}
	public static String displayNameTimeStep(String var) {
		switch(var) {
		case VAR_simulationKey:
			return DISPLAY_NAME_simulationKey;
		case VAR_path:
			return DISPLAY_NAME_path;
		case VAR_time:
			return DISPLAY_NAME_time;
		default:
			return BaseResult.displayNameBaseResult(var);
		}
	}

	public static String descriptionTimeStep(String var) {
		switch(var) {
		case VAR_simulationKey:
			return "The simulation key. ";
		case VAR_path:
			return "The file path. ";
		case VAR_time:
			return "The time in seconds. ";
			default:
				return BaseResult.descriptionBaseResult(var);
		}
	}

	public static String classSimpleNameTimeStep(String var) {
		switch(var) {
		case VAR_simulationKey:
			return "Long";
		case VAR_path:
			return "String";
		case VAR_time:
			return "BigDecimal";
			default:
				return BaseResult.classSimpleNameBaseResult(var);
		}
	}

	public static Integer htmlColumnTimeStep(String var) {
		switch(var) {
			default:
				return BaseResult.htmlColumnBaseResult(var);
		}
	}

	public static Integer htmlRowTimeStep(String var) {
		switch(var) {
		case VAR_simulationKey:
			return 3;
		case VAR_path:
			return 3;
		case VAR_time:
			return 3;
			default:
				return BaseResult.htmlRowBaseResult(var);
		}
	}

	public static Integer htmlCellTimeStep(String var) {
		switch(var) {
		case VAR_simulationKey:
			return 1;
		case VAR_path:
			return 2;
		case VAR_time:
			return 3;
			default:
				return BaseResult.htmlCellBaseResult(var);
		}
	}

	public static Integer lengthMinTimeStep(String var) {
		switch(var) {
			default:
				return BaseResult.lengthMinBaseResult(var);
		}
	}

	public static Integer lengthMaxTimeStep(String var) {
		switch(var) {
			default:
				return BaseResult.lengthMaxBaseResult(var);
		}
	}

	public static Integer maxTimeStep(String var) {
		switch(var) {
			default:
				return BaseResult.maxBaseResult(var);
		}
	}

	public static Integer minTimeStep(String var) {
		switch(var) {
			default:
				return BaseResult.minBaseResult(var);
		}
	}
}
