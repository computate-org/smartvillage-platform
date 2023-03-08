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
import java.lang.Long;
import org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation;
import java.lang.String;
import org.computate.vertx.search.list.SearchList;
import java.math.BigDecimal;
import io.vertx.core.json.JsonArray;
import java.lang.Integer;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
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
 * ApiMethode: Search
 * <p>This class contains a comment <b>"ApiMethod: Search"</b>, which creates an API "Search". 
 * </p>
 * ApiMethode: GET
 * <p>This class contains a comment <b>"ApiMethod: GET"</b>, which creates an API "GET". 
 * </p>
 * ApiMethode: PATCH
 * <p>This class contains a comment <b>"ApiMethod: PATCH"</b>, which creates an API "PATCH". 
 * </p>
 * ApiMethode: POST
 * <p>This class contains a comment <b>"ApiMethod: POST"</b>, which creates an API "POST". 
 * </p>
 * ApiMethode: PUTImport
 * <p>This class contains a comment <b>"ApiMethod: PUTImport"</b>, which creates an API "PUTImport". 
 * </p>
 * ApiMethode: PATCHRunSimulation
 * <p>This class contains a comment <b>"ApiMethod: PATCHRunSimulation"</b>, which creates an API "PATCHRunSimulation". 
 * </p>
 * ApiMethode: SearchPage
 * <p>This class contains a comment <b>"ApiMethod: SearchPage"</b>, which creates an API "SearchPage". 
 * </p>
 * ApiTag.enUS: true
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
	public static final String PATCHRunSimulation_enUS_Uri = "/api/run-simulation-report";
	public static final String PATCHRunSimulation_enUS_ImageUri = "/png/api/run-simulation-report-999.png";
	public static final String SearchPage_enUS_Uri = "/simulation-report";
	public static final String SearchPage_enUS_ImageUri = "/png/simulation-report-999.png";

	public static final String SimulationReport_Color = "2017-shaded-spruce";
	public static final String SimulationReport_IconGroup = "duotone";
	public static final String SimulationReport_IconName = "file-chart-column";
	public static final Integer SimulationReport_Rows = 100;

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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:simulationKey">Find the entity simulationKey in Solr</a>
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
		this.simulationKey = SimulationReport.staticSetSimulationKey(siteRequest_, o);
	}
	public static Long staticSetSimulationKey(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected SimulationReport simulationKeyInit() {
		Wrap<Long> simulationKeyWrap = new Wrap<Long>().var("simulationKey");
		if(simulationKey == null) {
			_simulationKey(simulationKeyWrap);
			setSimulationKey(simulationKeyWrap.o);
		}
		return (SimulationReport)this;
	}

	public static Long staticSearchSimulationKey(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrSimulationKey(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSimulationKey(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrSimulationKey(siteRequest_, SimulationReport.staticSearchSimulationKey(siteRequest_, SimulationReport.staticSetSimulationKey(siteRequest_, o)));
	}

	public Long sqlSimulationKey() {
		return simulationKey;
	}

	//////////////////////
	// simulationSearch //
	//////////////////////


	/**	 The entity simulationSearch
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<TrafficSimulation> simulationSearch;

	/**	<br> The entity simulationSearch
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:simulationSearch">Find the entity simulationSearch in Solr</a>
	 * <br>
	 * @param promise is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _simulationSearch(Promise<SearchList<TrafficSimulation>> promise);

	public SearchList<TrafficSimulation> getSimulationSearch() {
		return simulationSearch;
	}

	public void setSimulationSearch(SearchList<TrafficSimulation> simulationSearch) {
		this.simulationSearch = simulationSearch;
	}
	public static SearchList<TrafficSimulation> staticSetSimulationSearch(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected Future<SearchList<TrafficSimulation>> simulationSearchPromise() {
		Promise<SearchList<TrafficSimulation>> promise = Promise.promise();
		Promise<SearchList<TrafficSimulation>> promise2 = Promise.promise();
		_simulationSearch(promise2);
		promise2.future().onSuccess(o -> {
			if(o != null && simulationSearch == null) {
				o.promiseDeepForClass(siteRequest_).onSuccess(a -> {
					setSimulationSearch(o);
					promise.complete(o);
				}).onFailure(ex -> {
					promise.fail(ex);
				});
			} else {
				promise.complete(o);
			}
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	/////////////////
	// simulation_ //
	/////////////////


	/**	 The entity simulation_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected TrafficSimulation simulation_;

	/**	<br> The entity simulation_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:simulation_">Find the entity simulation_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _simulation_(Wrap<TrafficSimulation> w);

	public TrafficSimulation getSimulation_() {
		return simulation_;
	}

	public void setSimulation_(TrafficSimulation simulation_) {
		this.simulation_ = simulation_;
	}
	public static TrafficSimulation staticSetSimulation_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected SimulationReport simulation_Init() {
		Wrap<TrafficSimulation> simulation_Wrap = new Wrap<TrafficSimulation>().var("simulation_");
		if(simulation_ == null) {
			_simulation_(simulation_Wrap);
			setSimulation_(simulation_Wrap.o);
		}
		return (SimulationReport)this;
	}

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

	/////////////////////
	// paramInitialPar //
	/////////////////////


	/**	 The entity paramInitialPar
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<BigDecimal> paramInitialPar = new ArrayList<BigDecimal>();

	/**	<br> The entity paramInitialPar
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:paramInitialPar">Find the entity paramInitialPar in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _paramInitialPar(List<BigDecimal> l);

	public List<BigDecimal> getParamInitialPar() {
		return paramInitialPar;
	}

	public void setParamInitialPar(List<BigDecimal> paramInitialPar) {
		this.paramInitialPar = paramInitialPar;
	}
	@JsonIgnore
	public void setParamInitialPar(String o) {
		BigDecimal l = SimulationReport.staticSetParamInitialPar(siteRequest_, o);
		if(l != null)
			addParamInitialPar(l);
	}
	public static BigDecimal staticSetParamInitialPar(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamInitialPar(Double o) {
		addParamInitialPar(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamInitialPar(Integer o) {
		addParamInitialPar(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamInitialPar(Number o) {
		addParamInitialPar(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	public SimulationReport addParamInitialPar(BigDecimal...objects) {
		for(BigDecimal o : objects) {
			addParamInitialPar(o);
		}
		return (SimulationReport)this;
	}
	public SimulationReport addParamInitialPar(BigDecimal o) {
		if(o != null)
			this.paramInitialPar.add(o);
		return (SimulationReport)this;
	}
	@JsonIgnore
	public void setParamInitialPar(JsonArray objects) {
		paramInitialPar.clear();
		if(objects == null)
			return;
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addParamInitialPar(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
		}
	}
	public SimulationReport addParamInitialPar(String o) {
		if(NumberUtils.isParsable(o)) {
			BigDecimal p = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
			addParamInitialPar(p);
		}
		return (SimulationReport)this;
	}
	protected SimulationReport paramInitialParInit() {
		_paramInitialPar(paramInitialPar);
		return (SimulationReport)this;
	}

	public static BigDecimal staticSearchParamInitialPar(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o;
	}

	public static String staticSearchStrParamInitialPar(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamInitialPar(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrParamInitialPar(siteRequest_, SimulationReport.staticSearchParamInitialPar(siteRequest_, SimulationReport.staticSetParamInitialPar(siteRequest_, o)));
	}

	public Number[] sqlParamInitialPar() {
		return paramInitialPar.stream().map(v -> (Number)v).toArray(Number[]::new);
	}

	//////////////
	// paramLam //
	//////////////


	/**	 The entity paramLam
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<BigDecimal> paramLam = new ArrayList<BigDecimal>();

	/**	<br> The entity paramLam
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:paramLam">Find the entity paramLam in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _paramLam(List<BigDecimal> l);

	public List<BigDecimal> getParamLam() {
		return paramLam;
	}

	public void setParamLam(List<BigDecimal> paramLam) {
		this.paramLam = paramLam;
	}
	@JsonIgnore
	public void setParamLam(String o) {
		BigDecimal l = SimulationReport.staticSetParamLam(siteRequest_, o);
		if(l != null)
			addParamLam(l);
	}
	public static BigDecimal staticSetParamLam(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamLam(Double o) {
		addParamLam(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamLam(Integer o) {
		addParamLam(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamLam(Number o) {
		addParamLam(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	public SimulationReport addParamLam(BigDecimal...objects) {
		for(BigDecimal o : objects) {
			addParamLam(o);
		}
		return (SimulationReport)this;
	}
	public SimulationReport addParamLam(BigDecimal o) {
		if(o != null)
			this.paramLam.add(o);
		return (SimulationReport)this;
	}
	@JsonIgnore
	public void setParamLam(JsonArray objects) {
		paramLam.clear();
		if(objects == null)
			return;
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addParamLam(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
		}
	}
	public SimulationReport addParamLam(String o) {
		if(NumberUtils.isParsable(o)) {
			BigDecimal p = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
			addParamLam(p);
		}
		return (SimulationReport)this;
	}
	protected SimulationReport paramLamInit() {
		_paramLam(paramLam);
		return (SimulationReport)this;
	}

	public static BigDecimal staticSearchParamLam(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o;
	}

	public static String staticSearchStrParamLam(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamLam(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrParamLam(siteRequest_, SimulationReport.staticSearchParamLam(siteRequest_, SimulationReport.staticSetParamLam(siteRequest_, o)));
	}

	public Number[] sqlParamLam() {
		return paramLam.stream().map(v -> (Number)v).toArray(Number[]::new);
	}

	//////////////////////
	// paramDemandScale //
	//////////////////////


	/**	 The entity paramDemandScale
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramDemandScale;

	/**	<br> The entity paramDemandScale
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:paramDemandScale">Find the entity paramDemandScale in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramDemandScale(Wrap<BigDecimal> w);

	public BigDecimal getParamDemandScale() {
		return paramDemandScale;
	}

	public void setParamDemandScale(BigDecimal paramDemandScale) {
		this.paramDemandScale = paramDemandScale;
	}
	@JsonIgnore
	public void setParamDemandScale(String o) {
		this.paramDemandScale = SimulationReport.staticSetParamDemandScale(siteRequest_, o);
	}
	public static BigDecimal staticSetParamDemandScale(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamDemandScale(Double o) {
		setParamDemandScale(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamDemandScale(Integer o) {
		setParamDemandScale(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamDemandScale(Number o) {
		setParamDemandScale(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected SimulationReport paramDemandScaleInit() {
		Wrap<BigDecimal> paramDemandScaleWrap = new Wrap<BigDecimal>().var("paramDemandScale");
		if(paramDemandScale == null) {
			_paramDemandScale(paramDemandScaleWrap);
			setParamDemandScale(paramDemandScaleWrap.o);
		}
		return (SimulationReport)this;
	}

	public static Double staticSearchParamDemandScale(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamDemandScale(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamDemandScale(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrParamDemandScale(siteRequest_, SimulationReport.staticSearchParamDemandScale(siteRequest_, SimulationReport.staticSetParamDemandScale(siteRequest_, o)));
	}

	public BigDecimal sqlParamDemandScale() {
		return paramDemandScale;
	}

	///////////////////
	// paramStepSize //
	///////////////////


	/**	 The entity paramStepSize
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramStepSize;

	/**	<br> The entity paramStepSize
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:paramStepSize">Find the entity paramStepSize in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramStepSize(Wrap<BigDecimal> w);

	public BigDecimal getParamStepSize() {
		return paramStepSize;
	}

	public void setParamStepSize(BigDecimal paramStepSize) {
		this.paramStepSize = paramStepSize;
	}
	@JsonIgnore
	public void setParamStepSize(String o) {
		this.paramStepSize = SimulationReport.staticSetParamStepSize(siteRequest_, o);
	}
	public static BigDecimal staticSetParamStepSize(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamStepSize(Double o) {
		setParamStepSize(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamStepSize(Integer o) {
		setParamStepSize(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamStepSize(Number o) {
		setParamStepSize(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected SimulationReport paramStepSizeInit() {
		Wrap<BigDecimal> paramStepSizeWrap = new Wrap<BigDecimal>().var("paramStepSize");
		if(paramStepSize == null) {
			_paramStepSize(paramStepSizeWrap);
			setParamStepSize(paramStepSizeWrap.o);
		}
		return (SimulationReport)this;
	}

	public static Double staticSearchParamStepSize(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamStepSize(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamStepSize(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrParamStepSize(siteRequest_, SimulationReport.staticSearchParamStepSize(siteRequest_, SimulationReport.staticSetParamStepSize(siteRequest_, o)));
	}

	public BigDecimal sqlParamStepSize() {
		return paramStepSize;
	}

	/////////////////////////
	// paramUpdateStepSize //
	/////////////////////////


	/**	 The entity paramUpdateStepSize
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer paramUpdateStepSize;

	/**	<br> The entity paramUpdateStepSize
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:paramUpdateStepSize">Find the entity paramUpdateStepSize in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramUpdateStepSize(Wrap<Integer> w);

	public Integer getParamUpdateStepSize() {
		return paramUpdateStepSize;
	}

	public void setParamUpdateStepSize(Integer paramUpdateStepSize) {
		this.paramUpdateStepSize = paramUpdateStepSize;
	}
	@JsonIgnore
	public void setParamUpdateStepSize(String o) {
		this.paramUpdateStepSize = SimulationReport.staticSetParamUpdateStepSize(siteRequest_, o);
	}
	public static Integer staticSetParamUpdateStepSize(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected SimulationReport paramUpdateStepSizeInit() {
		Wrap<Integer> paramUpdateStepSizeWrap = new Wrap<Integer>().var("paramUpdateStepSize");
		if(paramUpdateStepSize == null) {
			_paramUpdateStepSize(paramUpdateStepSizeWrap);
			setParamUpdateStepSize(paramUpdateStepSizeWrap.o);
		}
		return (SimulationReport)this;
	}

	public static Integer staticSearchParamUpdateStepSize(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrParamUpdateStepSize(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamUpdateStepSize(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrParamUpdateStepSize(siteRequest_, SimulationReport.staticSearchParamUpdateStepSize(siteRequest_, SimulationReport.staticSetParamUpdateStepSize(siteRequest_, o)));
	}

	public Integer sqlParamUpdateStepSize() {
		return paramUpdateStepSize;
	}

	//////////////////
	// paramRunTime //
	//////////////////


	/**	 The entity paramRunTime
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer paramRunTime;

	/**	<br> The entity paramRunTime
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:paramRunTime">Find the entity paramRunTime in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramRunTime(Wrap<Integer> w);

	public Integer getParamRunTime() {
		return paramRunTime;
	}

	public void setParamRunTime(Integer paramRunTime) {
		this.paramRunTime = paramRunTime;
	}
	@JsonIgnore
	public void setParamRunTime(String o) {
		this.paramRunTime = SimulationReport.staticSetParamRunTime(siteRequest_, o);
	}
	public static Integer staticSetParamRunTime(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected SimulationReport paramRunTimeInit() {
		Wrap<Integer> paramRunTimeWrap = new Wrap<Integer>().var("paramRunTime");
		if(paramRunTime == null) {
			_paramRunTime(paramRunTimeWrap);
			setParamRunTime(paramRunTimeWrap.o);
		}
		return (SimulationReport)this;
	}

	public static Integer staticSearchParamRunTime(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrParamRunTime(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamRunTime(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrParamRunTime(siteRequest_, SimulationReport.staticSearchParamRunTime(siteRequest_, SimulationReport.staticSetParamRunTime(siteRequest_, o)));
	}

	public Integer sqlParamRunTime() {
		return paramRunTime;
	}

	///////////////////////
	// paramTotalIterNum //
	///////////////////////


	/**	 The entity paramTotalIterNum
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer paramTotalIterNum;

	/**	<br> The entity paramTotalIterNum
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:paramTotalIterNum">Find the entity paramTotalIterNum in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramTotalIterNum(Wrap<Integer> w);

	public Integer getParamTotalIterNum() {
		return paramTotalIterNum;
	}

	public void setParamTotalIterNum(Integer paramTotalIterNum) {
		this.paramTotalIterNum = paramTotalIterNum;
	}
	@JsonIgnore
	public void setParamTotalIterNum(String o) {
		this.paramTotalIterNum = SimulationReport.staticSetParamTotalIterNum(siteRequest_, o);
	}
	public static Integer staticSetParamTotalIterNum(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected SimulationReport paramTotalIterNumInit() {
		Wrap<Integer> paramTotalIterNumWrap = new Wrap<Integer>().var("paramTotalIterNum");
		if(paramTotalIterNum == null) {
			_paramTotalIterNum(paramTotalIterNumWrap);
			setParamTotalIterNum(paramTotalIterNumWrap.o);
		}
		return (SimulationReport)this;
	}

	public static Integer staticSearchParamTotalIterNum(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrParamTotalIterNum(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamTotalIterNum(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrParamTotalIterNum(siteRequest_, SimulationReport.staticSearchParamTotalIterNum(siteRequest_, SimulationReport.staticSetParamTotalIterNum(siteRequest_, o)));
	}

	public Integer sqlParamTotalIterNum() {
		return paramTotalIterNum;
	}

	//////////////////////
	// paramItersPerPar //
	//////////////////////


	/**	 The entity paramItersPerPar
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer paramItersPerPar;

	/**	<br> The entity paramItersPerPar
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:paramItersPerPar">Find the entity paramItersPerPar in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramItersPerPar(Wrap<Integer> w);

	public Integer getParamItersPerPar() {
		return paramItersPerPar;
	}

	public void setParamItersPerPar(Integer paramItersPerPar) {
		this.paramItersPerPar = paramItersPerPar;
	}
	@JsonIgnore
	public void setParamItersPerPar(String o) {
		this.paramItersPerPar = SimulationReport.staticSetParamItersPerPar(siteRequest_, o);
	}
	public static Integer staticSetParamItersPerPar(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected SimulationReport paramItersPerParInit() {
		Wrap<Integer> paramItersPerParWrap = new Wrap<Integer>().var("paramItersPerPar");
		if(paramItersPerPar == null) {
			_paramItersPerPar(paramItersPerParWrap);
			setParamItersPerPar(paramItersPerParWrap.o);
		}
		return (SimulationReport)this;
	}

	public static Integer staticSearchParamItersPerPar(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrParamItersPerPar(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamItersPerPar(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrParamItersPerPar(siteRequest_, SimulationReport.staticSearchParamItersPerPar(siteRequest_, SimulationReport.staticSetParamItersPerPar(siteRequest_, o)));
	}

	public Integer sqlParamItersPerPar() {
		return paramItersPerPar;
	}

	///////////////////////
	// updatedParameters //
	///////////////////////


	/**	 The entity updatedParameters
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray updatedParameters;

	/**	<br> The entity updatedParameters
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:updatedParameters">Find the entity updatedParameters in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _updatedParameters(Wrap<JsonArray> w);

	public JsonArray getUpdatedParameters() {
		return updatedParameters;
	}

	public void setUpdatedParameters(JsonArray updatedParameters) {
		this.updatedParameters = updatedParameters;
	}
	@JsonIgnore
	public void setUpdatedParameters(String o) {
		this.updatedParameters = SimulationReport.staticSetUpdatedParameters(siteRequest_, o);
	}
	public static JsonArray staticSetUpdatedParameters(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonArray(o);
		}
		return null;
	}
	protected SimulationReport updatedParametersInit() {
		Wrap<JsonArray> updatedParametersWrap = new Wrap<JsonArray>().var("updatedParameters");
		if(updatedParameters == null) {
			_updatedParameters(updatedParametersWrap);
			setUpdatedParameters(updatedParametersWrap.o);
		}
		return (SimulationReport)this;
	}

	public static JsonArray staticSearchUpdatedParameters(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o;
	}

	public static String staticSearchStrUpdatedParameters(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUpdatedParameters(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrUpdatedParameters(siteRequest_, SimulationReport.staticSearchUpdatedParameters(siteRequest_, SimulationReport.staticSetUpdatedParameters(siteRequest_, o)));
	}

	public JsonArray sqlUpdatedParameters() {
		return updatedParameters;
	}

	////////////////////////
	// updatedPerformance //
	////////////////////////


	/**	 The entity updatedPerformance
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray updatedPerformance;

	/**	<br> The entity updatedPerformance
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:updatedPerformance">Find the entity updatedPerformance in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _updatedPerformance(Wrap<JsonArray> w);

	public JsonArray getUpdatedPerformance() {
		return updatedPerformance;
	}

	public void setUpdatedPerformance(JsonArray updatedPerformance) {
		this.updatedPerformance = updatedPerformance;
	}
	@JsonIgnore
	public void setUpdatedPerformance(String o) {
		this.updatedPerformance = SimulationReport.staticSetUpdatedPerformance(siteRequest_, o);
	}
	public static JsonArray staticSetUpdatedPerformance(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonArray(o);
		}
		return null;
	}
	protected SimulationReport updatedPerformanceInit() {
		Wrap<JsonArray> updatedPerformanceWrap = new Wrap<JsonArray>().var("updatedPerformance");
		if(updatedPerformance == null) {
			_updatedPerformance(updatedPerformanceWrap);
			setUpdatedPerformance(updatedPerformanceWrap.o);
		}
		return (SimulationReport)this;
	}

	public static JsonArray staticSearchUpdatedPerformance(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o;
	}

	public static String staticSearchStrUpdatedPerformance(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUpdatedPerformance(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrUpdatedPerformance(siteRequest_, SimulationReport.staticSearchUpdatedPerformance(siteRequest_, SimulationReport.staticSetUpdatedPerformance(siteRequest_, o)));
	}

	public JsonArray sqlUpdatedPerformance() {
		return updatedPerformance;
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
				simulationKeyInit();
				promise2.complete();
			} catch(Exception ex) {
				promise2.fail(ex);
			}
			return promise2.future();
		}).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			simulationSearchPromise().onSuccess(simulationSearch -> {
				promise2.complete();
			}).onFailure(ex -> {
				promise2.fail(ex);
			});
			return promise2.future();
		}).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				simulation_Init();
				simulationNameInit();
				paramInitialParInit();
				paramLamInit();
				paramDemandScaleInit();
				paramStepSizeInit();
				paramUpdateStepSizeInit();
				paramRunTimeInit();
				paramTotalIterNumInit();
				paramItersPerParInit();
				updatedParametersInit();
				updatedPerformanceInit();
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
			case "simulationKey":
				return oSimulationReport.simulationKey;
			case "simulationSearch":
				return oSimulationReport.simulationSearch;
			case "simulation_":
				return oSimulationReport.simulation_;
			case "simulationName":
				return oSimulationReport.simulationName;
			case "paramInitialPar":
				return oSimulationReport.paramInitialPar;
			case "paramLam":
				return oSimulationReport.paramLam;
			case "paramDemandScale":
				return oSimulationReport.paramDemandScale;
			case "paramStepSize":
				return oSimulationReport.paramStepSize;
			case "paramUpdateStepSize":
				return oSimulationReport.paramUpdateStepSize;
			case "paramRunTime":
				return oSimulationReport.paramRunTime;
			case "paramTotalIterNum":
				return oSimulationReport.paramTotalIterNum;
			case "paramItersPerPar":
				return oSimulationReport.paramItersPerPar;
			case "updatedParameters":
				return oSimulationReport.updatedParameters;
			case "updatedPerformance":
				return oSimulationReport.updatedPerformance;
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
			case "simulationKey":
				if(oSimulationReport.getSimulationKey() == null)
					oSimulationReport.setSimulationKey(val == null ? null : (NumberUtils.isCreatable(val.toString()) ? Long.parseLong(val.toString()) : -1));
				if(!saves.contains("simulationKey"))
					saves.add("simulationKey");
				return val;
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
		case "simulationKey":
			return SimulationReport.staticSetSimulationKey(siteRequest_, o);
		case "simulationName":
			return SimulationReport.staticSetSimulationName(siteRequest_, o);
		case "paramInitialPar":
			return SimulationReport.staticSetParamInitialPar(siteRequest_, o);
		case "paramLam":
			return SimulationReport.staticSetParamLam(siteRequest_, o);
		case "paramDemandScale":
			return SimulationReport.staticSetParamDemandScale(siteRequest_, o);
		case "paramStepSize":
			return SimulationReport.staticSetParamStepSize(siteRequest_, o);
		case "paramUpdateStepSize":
			return SimulationReport.staticSetParamUpdateStepSize(siteRequest_, o);
		case "paramRunTime":
			return SimulationReport.staticSetParamRunTime(siteRequest_, o);
		case "paramTotalIterNum":
			return SimulationReport.staticSetParamTotalIterNum(siteRequest_, o);
		case "paramItersPerPar":
			return SimulationReport.staticSetParamItersPerPar(siteRequest_, o);
		case "updatedParameters":
			return SimulationReport.staticSetUpdatedParameters(siteRequest_, o);
		case "updatedPerformance":
			return SimulationReport.staticSetUpdatedPerformance(siteRequest_, o);
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
		case "simulationKey":
			return SimulationReport.staticSearchSimulationKey(siteRequest_, (Long)o);
		case "simulationName":
			return SimulationReport.staticSearchSimulationName(siteRequest_, (String)o);
		case "paramInitialPar":
			return SimulationReport.staticSearchParamInitialPar(siteRequest_, (BigDecimal)o);
		case "paramLam":
			return SimulationReport.staticSearchParamLam(siteRequest_, (BigDecimal)o);
		case "paramDemandScale":
			return SimulationReport.staticSearchParamDemandScale(siteRequest_, (BigDecimal)o);
		case "paramStepSize":
			return SimulationReport.staticSearchParamStepSize(siteRequest_, (BigDecimal)o);
		case "paramUpdateStepSize":
			return SimulationReport.staticSearchParamUpdateStepSize(siteRequest_, (Integer)o);
		case "paramRunTime":
			return SimulationReport.staticSearchParamRunTime(siteRequest_, (Integer)o);
		case "paramTotalIterNum":
			return SimulationReport.staticSearchParamTotalIterNum(siteRequest_, (Integer)o);
		case "paramItersPerPar":
			return SimulationReport.staticSearchParamItersPerPar(siteRequest_, (Integer)o);
		case "updatedParameters":
			return SimulationReport.staticSearchUpdatedParameters(siteRequest_, (JsonArray)o);
		case "updatedPerformance":
			return SimulationReport.staticSearchUpdatedPerformance(siteRequest_, (JsonArray)o);
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
		case "simulationKey":
			return SimulationReport.staticSearchStrSimulationKey(siteRequest_, (Long)o);
		case "simulationName":
			return SimulationReport.staticSearchStrSimulationName(siteRequest_, (String)o);
		case "paramInitialPar":
			return SimulationReport.staticSearchStrParamInitialPar(siteRequest_, (BigDecimal)o);
		case "paramLam":
			return SimulationReport.staticSearchStrParamLam(siteRequest_, (BigDecimal)o);
		case "paramDemandScale":
			return SimulationReport.staticSearchStrParamDemandScale(siteRequest_, (Double)o);
		case "paramStepSize":
			return SimulationReport.staticSearchStrParamStepSize(siteRequest_, (Double)o);
		case "paramUpdateStepSize":
			return SimulationReport.staticSearchStrParamUpdateStepSize(siteRequest_, (Integer)o);
		case "paramRunTime":
			return SimulationReport.staticSearchStrParamRunTime(siteRequest_, (Integer)o);
		case "paramTotalIterNum":
			return SimulationReport.staticSearchStrParamTotalIterNum(siteRequest_, (Integer)o);
		case "paramItersPerPar":
			return SimulationReport.staticSearchStrParamItersPerPar(siteRequest_, (Integer)o);
		case "updatedParameters":
			return SimulationReport.staticSearchStrUpdatedParameters(siteRequest_, (JsonArray)o);
		case "updatedPerformance":
			return SimulationReport.staticSearchStrUpdatedPerformance(siteRequest_, (JsonArray)o);
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
		case "simulationKey":
			return SimulationReport.staticSearchFqSimulationKey(siteRequest_, o);
		case "simulationName":
			return SimulationReport.staticSearchFqSimulationName(siteRequest_, o);
		case "paramInitialPar":
			return SimulationReport.staticSearchFqParamInitialPar(siteRequest_, o);
		case "paramLam":
			return SimulationReport.staticSearchFqParamLam(siteRequest_, o);
		case "paramDemandScale":
			return SimulationReport.staticSearchFqParamDemandScale(siteRequest_, o);
		case "paramStepSize":
			return SimulationReport.staticSearchFqParamStepSize(siteRequest_, o);
		case "paramUpdateStepSize":
			return SimulationReport.staticSearchFqParamUpdateStepSize(siteRequest_, o);
		case "paramRunTime":
			return SimulationReport.staticSearchFqParamRunTime(siteRequest_, o);
		case "paramTotalIterNum":
			return SimulationReport.staticSearchFqParamTotalIterNum(siteRequest_, o);
		case "paramItersPerPar":
			return SimulationReport.staticSearchFqParamItersPerPar(siteRequest_, o);
		case "updatedParameters":
			return SimulationReport.staticSearchFqUpdatedParameters(siteRequest_, o);
		case "updatedPerformance":
			return SimulationReport.staticSearchFqUpdatedPerformance(siteRequest_, o);
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
			if("simulationkey".equals(varLower)) {
				if(val instanceof Long) {
					setSimulationKey((Long)val);
				} else {
					setSimulationKey(val == null ? null : val.toString());
				}
				saves.add("simulationKey");
				return val;
			} else if("simulationname".equals(varLower)) {
				if(val instanceof String) {
					setSimulationName((String)val);
				}
				saves.add("simulationName");
				return val;
			} else if("paraminitialpar".equals(varLower)) {
				if(val instanceof List<?>) {
					((List<BigDecimal>)val).stream().forEach(v -> addParamInitialPar(v));
				} else if(val instanceof JsonArray) {
					((JsonArray)val).stream().forEach(v -> setParamInitialPar(v.toString()));
				} else if(val instanceof BigDecimal[]) {
					Arrays.asList((BigDecimal[])val).stream().forEach(v -> setParamInitialPar((BigDecimal)v));
				} else if(val instanceof Number[]) {
					Arrays.asList((Number[])val).stream().forEach(v -> setParamInitialPar((Number)v));
				}
				if(!saves.contains("paramInitialPar")) {
					saves.add("paramInitialPar");
				}
				return val;
			} else if("paramlam".equals(varLower)) {
				if(val instanceof List<?>) {
					((List<BigDecimal>)val).stream().forEach(v -> addParamLam(v));
				} else if(val instanceof JsonArray) {
					((JsonArray)val).stream().forEach(v -> setParamLam(v.toString()));
				} else if(val instanceof BigDecimal[]) {
					Arrays.asList((BigDecimal[])val).stream().forEach(v -> setParamLam((BigDecimal)v));
				} else if(val instanceof Number[]) {
					Arrays.asList((Number[])val).stream().forEach(v -> setParamLam((Number)v));
				}
				if(!saves.contains("paramLam")) {
					saves.add("paramLam");
				}
				return val;
			} else if("paramdemandscale".equals(varLower)) {
				if(val instanceof String) {
					setParamDemandScale((String)val);
				} else if(val instanceof Number) {
					setParamDemandScale(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramDemandScale");
				return val;
			} else if("paramstepsize".equals(varLower)) {
				if(val instanceof String) {
					setParamStepSize((String)val);
				} else if(val instanceof Number) {
					setParamStepSize(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramStepSize");
				return val;
			} else if("paramupdatestepsize".equals(varLower)) {
				if(val instanceof Integer) {
					setParamUpdateStepSize((Integer)val);
				} else {
					setParamUpdateStepSize(val == null ? null : val.toString());
				}
				saves.add("paramUpdateStepSize");
				return val;
			} else if("paramruntime".equals(varLower)) {
				if(val instanceof Integer) {
					setParamRunTime((Integer)val);
				} else {
					setParamRunTime(val == null ? null : val.toString());
				}
				saves.add("paramRunTime");
				return val;
			} else if("paramtotaliternum".equals(varLower)) {
				if(val instanceof Integer) {
					setParamTotalIterNum((Integer)val);
				} else {
					setParamTotalIterNum(val == null ? null : val.toString());
				}
				saves.add("paramTotalIterNum");
				return val;
			} else if("paramitersperpar".equals(varLower)) {
				if(val instanceof Integer) {
					setParamItersPerPar((Integer)val);
				} else {
					setParamItersPerPar(val == null ? null : val.toString());
				}
				saves.add("paramItersPerPar");
				return val;
			} else if("updatedparameters".equals(varLower)) {
				if(val instanceof String) {
					setUpdatedParameters((String)val);
				} else if(val instanceof JsonArray) {
					setUpdatedParameters((JsonArray)val);
				}
				saves.add("updatedParameters");
				return val;
			} else if("updatedperformance".equals(varLower)) {
				if(val instanceof String) {
					setUpdatedPerformance((String)val);
				} else if(val instanceof JsonArray) {
					setUpdatedPerformance((JsonArray)val);
				}
				saves.add("updatedPerformance");
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
		if(simulationKey != null) {
			doc.put("simulationKey_docvalues_long", simulationKey);
		}
		if(simulationName != null) {
			doc.put("simulationName_docvalues_string", simulationName);
		}
		if(paramInitialPar != null) {
			JsonArray l = new JsonArray();
			doc.put("paramInitialPar_docvalues_doubles", l);
			for(BigDecimal o : paramInitialPar) {
				l.add(o);
			}
		}
		if(paramLam != null) {
			JsonArray l = new JsonArray();
			doc.put("paramLam_docvalues_doubles", l);
			for(BigDecimal o : paramLam) {
				l.add(o);
			}
		}
		if(paramDemandScale != null) {
			doc.put("paramDemandScale_docvalues_double", paramDemandScale.doubleValue());
		}
		if(paramStepSize != null) {
			doc.put("paramStepSize_docvalues_double", paramStepSize.doubleValue());
		}
		if(paramUpdateStepSize != null) {
			doc.put("paramUpdateStepSize_docvalues_int", paramUpdateStepSize);
		}
		if(paramRunTime != null) {
			doc.put("paramRunTime_docvalues_int", paramRunTime);
		}
		if(paramTotalIterNum != null) {
			doc.put("paramTotalIterNum_docvalues_int", paramTotalIterNum);
		}
		if(paramItersPerPar != null) {
			doc.put("paramItersPerPar_docvalues_int", paramItersPerPar);
		}
		if(updatedParameters != null) {
			doc.put("updatedParameters_docvalues_string", updatedParameters.toString());
		}
		if(updatedPerformance != null) {
			doc.put("updatedPerformance_docvalues_string", updatedPerformance.toString());
		}
		super.indexBaseModel(doc);

	}

	public static String varStoredSimulationReport(String entityVar) {
		switch(entityVar) {
			case "simulationKey":
				return "simulationKey_docvalues_long";
			case "simulationName":
				return "simulationName_docvalues_string";
			case "paramInitialPar":
				return "paramInitialPar_docvalues_doubles";
			case "paramLam":
				return "paramLam_docvalues_doubles";
			case "paramDemandScale":
				return "paramDemandScale_docvalues_double";
			case "paramStepSize":
				return "paramStepSize_docvalues_double";
			case "paramUpdateStepSize":
				return "paramUpdateStepSize_docvalues_int";
			case "paramRunTime":
				return "paramRunTime_docvalues_int";
			case "paramTotalIterNum":
				return "paramTotalIterNum_docvalues_int";
			case "paramItersPerPar":
				return "paramItersPerPar_docvalues_int";
			case "updatedParameters":
				return "updatedParameters_docvalues_string";
			case "updatedPerformance":
				return "updatedPerformance_docvalues_string";
			default:
				return BaseModel.varStoredBaseModel(entityVar);
		}
	}

	public static String varIndexedSimulationReport(String entityVar) {
		switch(entityVar) {
			case "simulationKey":
				return "simulationKey_docvalues_long";
			case "simulationName":
				return "simulationName_docvalues_string";
			case "paramInitialPar":
				return "paramInitialPar_docvalues_doubles";
			case "paramLam":
				return "paramLam_docvalues_doubles";
			case "paramDemandScale":
				return "paramDemandScale_docvalues_double";
			case "paramStepSize":
				return "paramStepSize_docvalues_double";
			case "paramUpdateStepSize":
				return "paramUpdateStepSize_docvalues_int";
			case "paramRunTime":
				return "paramRunTime_docvalues_int";
			case "paramTotalIterNum":
				return "paramTotalIterNum_docvalues_int";
			case "paramItersPerPar":
				return "paramItersPerPar_docvalues_int";
			case "updatedParameters":
				return "updatedParameters_docvalues_string";
			case "updatedPerformance":
				return "updatedPerformance_docvalues_string";
			default:
				return BaseModel.varIndexedBaseModel(entityVar);
		}
	}

	public static String searchVarSimulationReport(String searchVar) {
		switch(searchVar) {
			case "simulationKey_docvalues_long":
				return "simulationKey";
			case "simulationName_docvalues_string":
				return "simulationName";
			case "paramInitialPar_docvalues_doubles":
				return "paramInitialPar";
			case "paramLam_docvalues_doubles":
				return "paramLam";
			case "paramDemandScale_docvalues_double":
				return "paramDemandScale";
			case "paramStepSize_docvalues_double":
				return "paramStepSize";
			case "paramUpdateStepSize_docvalues_int":
				return "paramUpdateStepSize";
			case "paramRunTime_docvalues_int":
				return "paramRunTime";
			case "paramTotalIterNum_docvalues_int":
				return "paramTotalIterNum";
			case "paramItersPerPar_docvalues_int":
				return "paramItersPerPar";
			case "updatedParameters_docvalues_string":
				return "updatedParameters";
			case "updatedPerformance_docvalues_string":
				return "updatedPerformance";
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

		oSimulationReport.setSimulationKey(Optional.ofNullable(doc.get("simulationKey_docvalues_long")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setSimulationName(Optional.ofNullable(doc.get("simulationName_docvalues_string")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("paramInitialPar_docvalues_doubles")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oSimulationReport.addParamInitialPar(v.toString());
		});
		Optional.ofNullable((List<?>)doc.get("paramLam_docvalues_doubles")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oSimulationReport.addParamLam(v.toString());
		});
		oSimulationReport.setParamDemandScale(Optional.ofNullable(doc.get("paramDemandScale_docvalues_double")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setParamStepSize(Optional.ofNullable(doc.get("paramStepSize_docvalues_double")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setParamUpdateStepSize(Optional.ofNullable(doc.get("paramUpdateStepSize_docvalues_int")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setParamRunTime(Optional.ofNullable(doc.get("paramRunTime_docvalues_int")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setParamTotalIterNum(Optional.ofNullable(doc.get("paramTotalIterNum_docvalues_int")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setParamItersPerPar(Optional.ofNullable(doc.get("paramItersPerPar_docvalues_int")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setUpdatedParameters(Optional.ofNullable(doc.get("updatedParameters_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setUpdatedPerformance(Optional.ofNullable(doc.get("updatedPerformance_docvalues_string")).map(v -> v.toString()).orElse(null));

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
			if(!Objects.equals(simulationKey, original.getSimulationKey()))
				apiRequest.addVars("simulationKey");
			if(!Objects.equals(simulationName, original.getSimulationName()))
				apiRequest.addVars("simulationName");
			if(!Objects.equals(paramInitialPar, original.getParamInitialPar()))
				apiRequest.addVars("paramInitialPar");
			if(!Objects.equals(paramLam, original.getParamLam()))
				apiRequest.addVars("paramLam");
			if(!Objects.equals(paramDemandScale, original.getParamDemandScale()))
				apiRequest.addVars("paramDemandScale");
			if(!Objects.equals(paramStepSize, original.getParamStepSize()))
				apiRequest.addVars("paramStepSize");
			if(!Objects.equals(paramUpdateStepSize, original.getParamUpdateStepSize()))
				apiRequest.addVars("paramUpdateStepSize");
			if(!Objects.equals(paramRunTime, original.getParamRunTime()))
				apiRequest.addVars("paramRunTime");
			if(!Objects.equals(paramTotalIterNum, original.getParamTotalIterNum()))
				apiRequest.addVars("paramTotalIterNum");
			if(!Objects.equals(paramItersPerPar, original.getParamItersPerPar()))
				apiRequest.addVars("paramItersPerPar");
			if(!Objects.equals(updatedParameters, original.getUpdatedParameters()))
				apiRequest.addVars("updatedParameters");
			if(!Objects.equals(updatedPerformance, original.getUpdatedPerformance()))
				apiRequest.addVars("updatedPerformance");
			super.apiRequestBaseModel();
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(Optional.ofNullable(simulationKey).map(v -> "simulationKey: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(simulationName).map(v -> "simulationName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(paramInitialPar).map(v -> "paramInitialPar: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramLam).map(v -> "paramLam: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramDemandScale).map(v -> "paramDemandScale: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramStepSize).map(v -> "paramStepSize: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramUpdateStepSize).map(v -> "paramUpdateStepSize: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramRunTime).map(v -> "paramRunTime: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramTotalIterNum).map(v -> "paramTotalIterNum: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramItersPerPar).map(v -> "paramItersPerPar: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(updatedParameters).map(v -> "updatedParameters: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(updatedPerformance).map(v -> "updatedPerformance: " + v + "\n").orElse(""));
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "SimulationReport";
	public static final String VAR_simulationKey = "simulationKey";
	public static final String VAR_simulationSearch = "simulationSearch";
	public static final String VAR_simulation_ = "simulation_";
	public static final String VAR_simulationName = "simulationName";
	public static final String VAR_paramInitialPar = "paramInitialPar";
	public static final String VAR_paramLam = "paramLam";
	public static final String VAR_paramDemandScale = "paramDemandScale";
	public static final String VAR_paramStepSize = "paramStepSize";
	public static final String VAR_paramUpdateStepSize = "paramUpdateStepSize";
	public static final String VAR_paramRunTime = "paramRunTime";
	public static final String VAR_paramTotalIterNum = "paramTotalIterNum";
	public static final String VAR_paramItersPerPar = "paramItersPerPar";
	public static final String VAR_updatedParameters = "updatedParameters";
	public static final String VAR_updatedPerformance = "updatedPerformance";

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
		vars.add(VAR_simulationKey);
		vars.add(VAR_simulationName);
		vars.add(VAR_paramInitialPar);
		vars.add(VAR_paramLam);
		vars.add(VAR_paramDemandScale);
		vars.add(VAR_paramStepSize);
		vars.add(VAR_paramUpdateStepSize);
		vars.add(VAR_paramRunTime);
		vars.add(VAR_paramTotalIterNum);
		vars.add(VAR_paramItersPerPar);
		vars.add(VAR_updatedParameters);
		vars.add(VAR_updatedPerformance);
		BaseModel.varsFqBaseModel(vars);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return SimulationReport.varsRangeSimulationReport(new ArrayList<String>());
	}
	public static List<String> varsRangeSimulationReport(List<String> vars) {
		vars.add(VAR_paramDemandScale);
		vars.add(VAR_paramStepSize);
		vars.add(VAR_paramUpdateStepSize);
		vars.add(VAR_paramRunTime);
		vars.add(VAR_paramTotalIterNum);
		vars.add(VAR_paramItersPerPar);
		vars.add(VAR_updatedParameters);
		vars.add(VAR_updatedPerformance);
		BaseModel.varsRangeBaseModel(vars);
		return vars;
	}

	public static final String DISPLAY_NAME_simulationKey = "traffic simulation";
	public static final String DISPLAY_NAME_simulationSearch = "";
	public static final String DISPLAY_NAME_simulation_ = "";
	public static final String DISPLAY_NAME_simulationName = "simulation name";
	public static final String DISPLAY_NAME_paramInitialPar = "initial params";
	public static final String DISPLAY_NAME_paramLam = "Traffic Demand";
	public static final String DISPLAY_NAME_paramDemandScale = "demand scale";
	public static final String DISPLAY_NAME_paramStepSize = "step size";
	public static final String DISPLAY_NAME_paramUpdateStepSize = "update step size";
	public static final String DISPLAY_NAME_paramRunTime = "run time";
	public static final String DISPLAY_NAME_paramTotalIterNum = "total iterations";
	public static final String DISPLAY_NAME_paramItersPerPar = "iteration repetitions";
	public static final String DISPLAY_NAME_updatedParameters = "updated parameters";
	public static final String DISPLAY_NAME_updatedPerformance = "updated performance";

	public static String displayNameForClass(String var) {
		return SimulationReport.displayNameSimulationReport(var);
	}
	public static String displayNameSimulationReport(String var) {
		switch(var) {
		case VAR_simulationKey:
			return DISPLAY_NAME_simulationKey;
		case VAR_simulationSearch:
			return DISPLAY_NAME_simulationSearch;
		case VAR_simulation_:
			return DISPLAY_NAME_simulation_;
		case VAR_simulationName:
			return DISPLAY_NAME_simulationName;
		case VAR_paramInitialPar:
			return DISPLAY_NAME_paramInitialPar;
		case VAR_paramLam:
			return DISPLAY_NAME_paramLam;
		case VAR_paramDemandScale:
			return DISPLAY_NAME_paramDemandScale;
		case VAR_paramStepSize:
			return DISPLAY_NAME_paramStepSize;
		case VAR_paramUpdateStepSize:
			return DISPLAY_NAME_paramUpdateStepSize;
		case VAR_paramRunTime:
			return DISPLAY_NAME_paramRunTime;
		case VAR_paramTotalIterNum:
			return DISPLAY_NAME_paramTotalIterNum;
		case VAR_paramItersPerPar:
			return DISPLAY_NAME_paramItersPerPar;
		case VAR_updatedParameters:
			return DISPLAY_NAME_updatedParameters;
		case VAR_updatedPerformance:
			return DISPLAY_NAME_updatedPerformance;
		default:
			return BaseModel.displayNameBaseModel(var);
		}
	}

	public static String descriptionSimulationReport(String var) {
		switch(var) {
		case VAR_simulationKey:
			return "The traffic simulation for this report. ";
		case VAR_paramRunTime:
			return "Time duration of each simulated sample path. ";
		case VAR_paramTotalIterNum:
			return "Total iterations to update performance. ";
		case VAR_paramItersPerPar:
			return "Number of repeats per round. ";
		case VAR_updatedParameters:
			return "the resulting updated parameters after a simulation";
		case VAR_updatedPerformance:
			return "the resulting updated performance after a simulation";
			default:
				return BaseModel.descriptionBaseModel(var);
		}
	}

	public static String classSimpleNameSimulationReport(String var) {
		switch(var) {
		case VAR_simulationKey:
			return "Long";
		case VAR_simulationSearch:
			return "SearchList";
		case VAR_simulation_:
			return "TrafficSimulation";
		case VAR_simulationName:
			return "String";
		case VAR_paramInitialPar:
			return "List";
		case VAR_paramLam:
			return "List";
		case VAR_paramDemandScale:
			return "BigDecimal";
		case VAR_paramStepSize:
			return "BigDecimal";
		case VAR_paramUpdateStepSize:
			return "Integer";
		case VAR_paramRunTime:
			return "Integer";
		case VAR_paramTotalIterNum:
			return "Integer";
		case VAR_paramItersPerPar:
			return "Integer";
		case VAR_updatedParameters:
			return "JsonArray";
		case VAR_updatedPerformance:
			return "JsonArray";
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
		case VAR_simulationKey:
			return 3;
		case VAR_simulationName:
			return 3;
		case VAR_paramInitialPar:
			return 4;
		case VAR_paramLam:
			return 5;
		case VAR_paramDemandScale:
			return 6;
		case VAR_paramStepSize:
			return 6;
		case VAR_paramUpdateStepSize:
			return 6;
		case VAR_paramRunTime:
			return 7;
		case VAR_paramTotalIterNum:
			return 7;
		case VAR_paramItersPerPar:
			return 7;
		case VAR_updatedParameters:
			return 8;
		case VAR_updatedPerformance:
			return 9;
			default:
				return BaseModel.htmlRowBaseModel(var);
		}
	}

	public static Integer htmlCellSimulationReport(String var) {
		switch(var) {
		case VAR_simulationKey:
			return 1;
		case VAR_simulationName:
			return 2;
		case VAR_paramInitialPar:
			return 1;
		case VAR_paramLam:
			return 1;
		case VAR_paramDemandScale:
			return 1;
		case VAR_paramStepSize:
			return 2;
		case VAR_paramUpdateStepSize:
			return 3;
		case VAR_paramRunTime:
			return 1;
		case VAR_paramTotalIterNum:
			return 2;
		case VAR_paramItersPerPar:
			return 3;
		case VAR_updatedParameters:
			return 1;
		case VAR_updatedPerformance:
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
