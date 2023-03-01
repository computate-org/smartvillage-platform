package org.computate.smartvillageview.enus.model.traffic.simulation.report;

import org.computate.smartvillageview.enus.request.SiteRequestEnUS;
import org.computate.smartvillageview.enus.model.base.BaseModel;
import io.vertx.core.json.JsonObject;
import java.util.Date;
import java.util.Set;
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
import java.lang.String;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;

/**	
 * <h3>About the SimulationReport class and it's generated class SimulationReportGen&lt;BaseModel&gt;: </h3>extends SimulationReportGen
 * <p>
 * This Java class extends a generated Java class SimulationReportGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport">Find the class SimulationReport in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends SimulationReportGen<BaseModel>
 * <p>This <code>class SimulationReport extends SimulationReportGen&lt;BaseModel&gt;</code>, which means it extends a newly generated SimulationReportGen. 
 * The generated <code>class SimulationReportGen extends BaseModel</code> which means that SimulationReport extends SimulationReportGen which extends BaseModel. 
 * This generated inheritance is a powerful feature that allows a lot of boiler plate code to be created for you automatically while still preserving inheritance through the power of Java Generic classes. 
 * </p>
 * Api: true
 * <p>This class contains a comment <b>"Api: true"</b>, which means this class will have Java Vert.x API backend code generated for these objects. 
 * </p>
 * ApiTag.enUS: SimulationReport
 * <p>This class contains a comment <b>"ApiTag: SimulationReport"</b>, which groups all of the OpenAPIs for SimulationReport objects under the tag "SimulationReport". 
 * </p>
 * ApiUri.enUS: /api/simulation-report
 * <p>This class contains a comment <b>"ApiUri: /api/simulation-report"</b>, which defines the base API URI for SimulationReport objects as "/api/simulation-report" in the OpenAPI spec. 
 * </p>
 * Color: 2017-shaded-spruce
 * <p>This class contains a comment <b>"Color: 2017-shaded-spruce"</b>, which styles the SimulationReport page "2017-shaded-spruce". 
 * This will reference a CSS class defined by the stylesheets in the project that starts with "w3-". 
 * A css class of "w3-2017-shaded-spruce" is expected to exist in the project stylesheets, and is inspired by W3 CSS colors. 
 * See: <a href="https://www.w3schools.com/w3css/w3css_colors.asp">https://www.w3schools.com/w3css/w3css_colors.asp</a>. 
 * </p>
 * IconGroup: duotone
 * <p>This class contains a comment <b>"IconGroup: duotone"</b>, which adds icons on the SimulationReport page with a group of "duotone". 
 * This will reference a Font Awesome icon group that starts with "fa-" followed by the icon group "duotone", together is "fa-duotone". 
 * A Font Awesome icon group of "duotone" is expected to exist. 
 * The Font Awesome groups currently supported include: solid, regular, light, thin, duotone, sharp, and kit. 
 * See: <a href="https://fontawesome.com/docs/web/dig-deeper/styles">https://fontawesome.com/docs/web/dig-deeper/styles</a>. 
 * </p>
 * IconName: file-chart-column
 * <p>This class contains a comment <b>"IconName: file-chart-column"</b>, which adds icons on the SimulationReport page with a name of "file-chart-column". 
 * This will reference a Font Awesome icon that starts with the icon group "fa-duotone fa-" followed by the icon name, which is "fa-duotone fa-file-chart-column". 
 * A Font Awesome icon of "fa-duotone fa-file-chart-column" is expected to exist. 
 * See: <a href="https://fontawesome.com/icons">https://fontawesome.com/icons</a>. 
 * </p>
 * Indexed: true
 * <p>This class contains a comment <b>"Indexed: true"</b>, which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * {@inheritDoc}
 * <p>By adding a class comment "{@inheritDoc}", the SimulationReport class will inherit the helpful inherited class comments from the super class SimulationReportGen. 
 * </p>
 * Rows: 100
 * <p>This class contains a comment <b>"Rows: 100"</b>, which means the SimulationReport API will return a default of 100 records instead of 10 by default. 
 * Each API has built in pagination of the search records to ensure a user can query all the data a page at a time without running the application out of memory. 
 * </p>
 * Order: 9
 * <p>This class contains a comment <b>"Order: 9"</b>, which means this class will be sorted by the given number 9 ascending when code that relates to multiple classes at the same time is generated. 
 * </p>
 * SqlOrder: 3
 * <p>This class contains a comment <b>"SqlOrder: 3"</b>, which means this class will be sorted by the given number 3 ascending when SQL code to create and drop the tables is generated. 
 * </p>
 * Model: true
 * <p>This class contains a comment <b>"Model: true"</b>, which means this class will be stored in the database. 
 * Every protected void method that begins with "_" that contains a "Persist: true" comment will be a persisted field in the database table. 
 * </p>
 * Page: true
 * <p>This class contains a comment <b>"Page: true"</b>, which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReportPage. 
 * </p>
 * SuperPage.enUS: BaseModelPage
 * <p>This class contains a comment <b>"SuperPage.enUS: BaseModelPage"</b>, which identifies the Java super class of the page code by it's class simple name "BaseModelPage". 
 * This means that the newly created class org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReportPage extends org.computate.smartvillageview.enus.model.base.BaseModelPage. 
 * </p>
 * Promise: true
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the SimulationReport Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
 * </p>
 * <p>
 *   Adding protected void methods beginning with an underscore with a Promise as the only parameter will automatically set `Promise: true`. 
 * </p>
 * <p>
 *   <pre>
 *   
 *   	protected void _promiseBefore(Promise&lt;Void&gt; promise) {
 *   		promise.complete();
 *   	}
 *   </pre>
 * </p>
 * <p>
 *   Java classes with the `Model: true` will automatically set `Promise: true`. 
 * </p>
 * <p>
 *   If a super class of this Java class with `Model: true`, then the child class will also inherit `Promise: true`. 
 * </p>
 * Role.enUS: SiteAdmin
 * <p>
 * This class contains a comment <b>"Role.enUS: SiteAdmin"</b>, which identifies the default role name "SiteAdmin" of the OAuth2/OpenID Connect user role required to access this SimulationReport API. 
 * It's possible to reconfigure the roles required to access the SimulationReport API by configuring an environment variable like this: 
 * </p>
 * <pre>AUTH_ROLE_REQUIRED_SimulationReport: ["SiteAdmin"]</pre>
 * AName.enUS: a simulation report
 * <p>This class contains a comment <b>"AName.enUS: a simulation report"</b>, which identifies the language context to describe a SimulationReport as "a simulation report". 
 * </p>
 * <p>
 * Delete the class SimulationReport in Solr: 
 * curl 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.traffic.simulation.report in Solr: 
 * curl 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class SimulationReportGen<DEV> extends BaseModel {
	protected static final Logger LOG = LoggerFactory.getLogger(SimulationReport.class);

	public static final String SimulationReport_AName_enUS = "a simulation report";
	public static final String SimulationReport_This_enUS = "this ";
	public static final String SimulationReport_ThisName_enUS = "this simulation report";
	public static final String SimulationReport_A_enUS = "a ";
	public static final String SimulationReport_TheName_enUS = "the simulation report";
	public static final String SimulationReport_NameSingular_enUS = "simulation report";
	public static final String SimulationReport_NamePlural_enUS = "simulation reports";
	public static final String SimulationReport_NameActual_enUS = "current simulation report";
	public static final String SimulationReport_AllName_enUS = "all the simulation reports";
	public static final String SimulationReport_SearchAllNameBy_enUS = "search simulation reports by ";
	public static final String SimulationReport_Title_enUS = "simulation reports";
	public static final String SimulationReport_ThePluralName_enUS = "the simulation reports";
	public static final String SimulationReport_NoNameFound_enUS = "no simulation report found";
	public static final String SimulationReport_ApiUri_enUS = "/api/simulation-report";
	public static final String SimulationReport_ApiUriSearchPage_enUS = "/simulation-report";
	public static final String SimulationReport_OfName_enUS = "of simulation report";
	public static final String SimulationReport_ANameAdjective_enUS = "a simulation report";
	public static final String SimulationReport_NameAdjectiveSingular_enUS = "simulation report";
	public static final String SimulationReport_NameAdjectivePlural_enUS = "simulation reports";
	public static final String Search_enUS_Uri = "/api/simulation-report";
	public static final String Search_enUS_ImageUri = "/png/api/simulation-report-999.png";
	public static final String GET_enUS_Uri = "/api/simulation-report/{id}";
	public static final String GET_enUS_ImageUri = "/png/api/simulation-report/{id}-999.png";
	public static final String PATCH_enUS_Uri = "/api/simulation-report";
	public static final String PATCH_enUS_ImageUri = "/png/api/simulation-report-999.png";
	public static final String POST_enUS_Uri = "/api/simulation-report";
	public static final String POST_enUS_ImageUri = "/png/api/simulation-report-999.png";
	public static final String PUTImport_enUS_Uri = "/api/simulation-report-import";
	public static final String PUTImport_enUS_ImageUri = "/png/api/simulation-report-import-999.png";
	public static final String SearchPage_enUS_Uri = "/simulation-report";
	public static final String SearchPage_enUS_ImageUri = "/png/simulation-report-999.png";

	public static final String SimulationReport_Color = "2017-shaded-spruce";
	public static final String SimulationReport_IconGroup = "duotone";
	public static final String SimulationReport_IconName = "file-chart-column";
	public static final Integer SimulationReport_Rows = 100;

	////////////////////
	// simulationName //
	////////////////////


	/**	 The entity simulationName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String simulationName;

	/**	<br> The entity simulationName
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:simulationName">Find the entity simulationName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _simulationName(Wrap<String> w);

	public String getSimulationName() {
		return simulationName;
	}
	public void setSimulationName(String o) {
		this.simulationName = SimulationReport.staticSetSimulationName(siteRequest_, o);
	}
	public static String staticSetSimulationName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SimulationReport simulationNameInit() {
		Wrap<String> simulationNameWrap = new Wrap<String>().var("simulationName");
		if(simulationName == null) {
			_simulationName(simulationNameWrap);
			setSimulationName(simulationNameWrap.o);
		}
		return (SimulationReport)this;
	}

	public static String staticSearchSimulationName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSimulationName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSimulationName(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrSimulationName(siteRequest_, SimulationReport.staticSearchSimulationName(siteRequest_, SimulationReport.staticSetSimulationName(siteRequest_, o)));
	}

	public String sqlSimulationName() {
		return simulationName;
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepSimulationReport(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepSimulationReport();
	}

	public Future<Void> promiseDeepSimulationReport() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseSimulationReport(promise2);
		promise2.future().onSuccess(a -> {
			super.promiseDeepBaseModel(siteRequest_).onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseSimulationReport(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				simulationNameInit();
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
		return promiseDeepSimulationReport(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestSimulationReport(SiteRequestEnUS siteRequest_) {
			super.siteRequestBaseModel(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestSimulationReport(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainSimulationReport(v);
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
	public Object obtainSimulationReport(String var) {
		SimulationReport oSimulationReport = (SimulationReport)this;
		switch(var) {
			case "simulationName":
				return oSimulationReport.simulationName;
			default:
				return super.obtainBaseModel(var);
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
				o = relateSimulationReport(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateSimulationReport(String var, Object val) {
		SimulationReport oSimulationReport = (SimulationReport)this;
		switch(var) {
			default:
				return super.relateBaseModel(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetSimulationReport(entityVar,  siteRequest_, o);
	}
	public static Object staticSetSimulationReport(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "simulationName":
			return SimulationReport.staticSetSimulationName(siteRequest_, o);
			default:
				return BaseModel.staticSetBaseModel(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchSimulationReport(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchSimulationReport(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "simulationName":
			return SimulationReport.staticSearchSimulationName(siteRequest_, (String)o);
			default:
				return BaseModel.staticSearchBaseModel(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrSimulationReport(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrSimulationReport(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "simulationName":
			return SimulationReport.staticSearchStrSimulationName(siteRequest_, (String)o);
			default:
				return BaseModel.staticSearchStrBaseModel(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqSimulationReport(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqSimulationReport(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "simulationName":
			return SimulationReport.staticSearchFqSimulationName(siteRequest_, o);
			default:
				return BaseModel.staticSearchFqBaseModel(entityVar,  siteRequest_, o);
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
					o = persistSimulationReport(v, val);
				else if(o instanceof BaseModel) {
					BaseModel oBaseModel = (BaseModel)o;
					o = oBaseModel.persistForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object persistSimulationReport(String var, Object val) {
		String varLower = var.toLowerCase();
			if("simulationname".equals(varLower)) {
				if(val instanceof String) {
					setSimulationName((String)val);
				}
				saves.add("simulationName");
				return val;
		} else {
			return super.persistBaseModel(var, val);
		}
	}

	/////////////
	// populate //
	/////////////

	@Override public void populateForClass(SolrResponse.Doc doc) {
		populateSimulationReport(doc);
	}
	public void populateSimulationReport(SolrResponse.Doc doc) {
		SimulationReport oSimulationReport = (SimulationReport)this;
		saves = doc.get("saves_docvalues_strings");
		if(saves != null) {
		}

		super.populateBaseModel(doc);
	}

	public void indexSimulationReport(JsonObject doc) {
		if(simulationName != null) {
			doc.put("simulationName_docvalues_string", simulationName);
		}
		super.indexBaseModel(doc);

	}

	public static String varStoredSimulationReport(String entityVar) {
		switch(entityVar) {
			case "simulationName":
				return "simulationName_docvalues_string";
			default:
				return BaseModel.varStoredBaseModel(entityVar);
		}
	}

	public static String varIndexedSimulationReport(String entityVar) {
		switch(entityVar) {
			case "simulationName":
				return "simulationName_docvalues_string";
			default:
				return BaseModel.varIndexedBaseModel(entityVar);
		}
	}

	public static String searchVarSimulationReport(String searchVar) {
		switch(searchVar) {
			case "simulationName_docvalues_string":
				return "simulationName";
			default:
				return BaseModel.searchVarBaseModel(searchVar);
		}
	}

	public static String varSearchSimulationReport(String entityVar) {
		switch(entityVar) {
			default:
				return BaseModel.varSearchBaseModel(entityVar);
		}
	}

	public static String varSuggestedSimulationReport(String entityVar) {
		switch(entityVar) {
			default:
				return BaseModel.varSuggestedBaseModel(entityVar);
		}
	}

	/////////////
	// store //
	/////////////

	@Override public void storeForClass(SolrResponse.Doc doc) {
		storeSimulationReport(doc);
	}
	public void storeSimulationReport(SolrResponse.Doc doc) {
		SimulationReport oSimulationReport = (SimulationReport)this;

		oSimulationReport.setSimulationName(Optional.ofNullable(doc.get("simulationName_docvalues_string")).map(v -> v.toString()).orElse(null));

		super.storeBaseModel(doc);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestSimulationReport() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof SimulationReport) {
			SimulationReport original = (SimulationReport)o;
			if(!Objects.equals(simulationName, original.getSimulationName()))
				apiRequest.addVars("simulationName");
			super.apiRequestBaseModel();
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(Optional.ofNullable(simulationName).map(v -> "simulationName: \"" + v + "\"\n" ).orElse(""));
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "SimulationReport";
	public static final String VAR_simulationName = "simulationName";

	public static List<String> varsQForClass() {
		return SimulationReport.varsQSimulationReport(new ArrayList<String>());
	}
	public static List<String> varsQSimulationReport(List<String> vars) {
		BaseModel.varsQBaseModel(vars);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return SimulationReport.varsFqSimulationReport(new ArrayList<String>());
	}
	public static List<String> varsFqSimulationReport(List<String> vars) {
		vars.add(VAR_simulationName);
		BaseModel.varsFqBaseModel(vars);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return SimulationReport.varsRangeSimulationReport(new ArrayList<String>());
	}
	public static List<String> varsRangeSimulationReport(List<String> vars) {
		BaseModel.varsRangeBaseModel(vars);
		return vars;
	}

	public static final String DISPLAY_NAME_simulationName = "simulation name";

	public static String displayNameForClass(String var) {
		return SimulationReport.displayNameSimulationReport(var);
	}
	public static String displayNameSimulationReport(String var) {
		switch(var) {
		case VAR_simulationName:
			return DISPLAY_NAME_simulationName;
		default:
			return BaseModel.displayNameBaseModel(var);
		}
	}

	public static String descriptionSimulationReport(String var) {
		switch(var) {
			default:
				return BaseModel.descriptionBaseModel(var);
		}
	}

	public static String classSimpleNameSimulationReport(String var) {
		switch(var) {
		case VAR_simulationName:
			return "String";
			default:
				return BaseModel.classSimpleNameBaseModel(var);
		}
	}

	public static Integer htmlColumnSimulationReport(String var) {
		switch(var) {
			default:
				return BaseModel.htmlColumnBaseModel(var);
		}
	}

	public static Integer htmlRowSimulationReport(String var) {
		switch(var) {
		case VAR_simulationName:
			return 3;
			default:
				return BaseModel.htmlRowBaseModel(var);
		}
	}

	public static Integer htmlCellSimulationReport(String var) {
		switch(var) {
		case VAR_simulationName:
			return 1;
			default:
				return BaseModel.htmlCellBaseModel(var);
		}
	}

	public static Integer lengthMinSimulationReport(String var) {
		switch(var) {
			default:
				return BaseModel.lengthMinBaseModel(var);
		}
	}

	public static Integer lengthMaxSimulationReport(String var) {
		switch(var) {
			default:
				return BaseModel.lengthMaxBaseModel(var);
		}
	}

	public static Integer maxSimulationReport(String var) {
		switch(var) {
			default:
				return BaseModel.maxBaseModel(var);
		}
	}

	public static Integer minSimulationReport(String var) {
		switch(var) {
			default:
				return BaseModel.minBaseModel(var);
		}
	}
}
