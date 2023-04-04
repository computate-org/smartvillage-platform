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
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.traffic.simulation.report in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
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

	////////////////
	// reportName //
	////////////////


	/**	 The entity reportName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String reportName;

	/**	<br> The entity reportName
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:reportName">Find the entity reportName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _reportName(Wrap<String> w);

	public String getReportName() {
		return reportName;
	}
	public void setReportName(String o) {
		this.reportName = SimulationReport.staticSetReportName(siteRequest_, o);
	}
	public static String staticSetReportName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SimulationReport reportNameInit() {
		Wrap<String> reportNameWrap = new Wrap<String>().var("reportName");
		if(reportName == null) {
			_reportName(reportNameWrap);
			setReportName(reportNameWrap.o);
		}
		return (SimulationReport)this;
	}

	public static String staticSearchReportName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrReportName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqReportName(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrReportName(siteRequest_, SimulationReport.staticSearchReportName(siteRequest_, SimulationReport.staticSetReportName(siteRequest_, o)));
	}

	public String sqlReportName() {
		return reportName;
	}

	/////////////////////////////////////////
	// paramAvgVehiclePerMinFromWestToEast //
	/////////////////////////////////////////


	/**	 The entity paramAvgVehiclePerMinFromWestToEast
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramAvgVehiclePerMinFromWestToEast;

	/**	<br> The entity paramAvgVehiclePerMinFromWestToEast
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:paramAvgVehiclePerMinFromWestToEast">Find the entity paramAvgVehiclePerMinFromWestToEast in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramAvgVehiclePerMinFromWestToEast(Wrap<BigDecimal> w);

	public BigDecimal getParamAvgVehiclePerMinFromWestToEast() {
		return paramAvgVehiclePerMinFromWestToEast;
	}

	public void setParamAvgVehiclePerMinFromWestToEast(BigDecimal paramAvgVehiclePerMinFromWestToEast) {
		this.paramAvgVehiclePerMinFromWestToEast = paramAvgVehiclePerMinFromWestToEast;
	}
	@JsonIgnore
	public void setParamAvgVehiclePerMinFromWestToEast(String o) {
		this.paramAvgVehiclePerMinFromWestToEast = SimulationReport.staticSetParamAvgVehiclePerMinFromWestToEast(siteRequest_, o);
	}
	public static BigDecimal staticSetParamAvgVehiclePerMinFromWestToEast(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamAvgVehiclePerMinFromWestToEast(Double o) {
		setParamAvgVehiclePerMinFromWestToEast(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamAvgVehiclePerMinFromWestToEast(Integer o) {
		setParamAvgVehiclePerMinFromWestToEast(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamAvgVehiclePerMinFromWestToEast(Number o) {
		setParamAvgVehiclePerMinFromWestToEast(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected SimulationReport paramAvgVehiclePerMinFromWestToEastInit() {
		Wrap<BigDecimal> paramAvgVehiclePerMinFromWestToEastWrap = new Wrap<BigDecimal>().var("paramAvgVehiclePerMinFromWestToEast");
		if(paramAvgVehiclePerMinFromWestToEast == null) {
			_paramAvgVehiclePerMinFromWestToEast(paramAvgVehiclePerMinFromWestToEastWrap);
			setParamAvgVehiclePerMinFromWestToEast(paramAvgVehiclePerMinFromWestToEastWrap.o);
		}
		return (SimulationReport)this;
	}

	public static Double staticSearchParamAvgVehiclePerMinFromWestToEast(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamAvgVehiclePerMinFromWestToEast(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamAvgVehiclePerMinFromWestToEast(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrParamAvgVehiclePerMinFromWestToEast(siteRequest_, SimulationReport.staticSearchParamAvgVehiclePerMinFromWestToEast(siteRequest_, SimulationReport.staticSetParamAvgVehiclePerMinFromWestToEast(siteRequest_, o)));
	}

	public BigDecimal sqlParamAvgVehiclePerMinFromWestToEast() {
		return paramAvgVehiclePerMinFromWestToEast;
	}

	///////////////////////////////////////////
	// paramAvgVehiclePerMinFromSouthToNorth //
	///////////////////////////////////////////


	/**	 The entity paramAvgVehiclePerMinFromSouthToNorth
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramAvgVehiclePerMinFromSouthToNorth;

	/**	<br> The entity paramAvgVehiclePerMinFromSouthToNorth
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:paramAvgVehiclePerMinFromSouthToNorth">Find the entity paramAvgVehiclePerMinFromSouthToNorth in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramAvgVehiclePerMinFromSouthToNorth(Wrap<BigDecimal> w);

	public BigDecimal getParamAvgVehiclePerMinFromSouthToNorth() {
		return paramAvgVehiclePerMinFromSouthToNorth;
	}

	public void setParamAvgVehiclePerMinFromSouthToNorth(BigDecimal paramAvgVehiclePerMinFromSouthToNorth) {
		this.paramAvgVehiclePerMinFromSouthToNorth = paramAvgVehiclePerMinFromSouthToNorth;
	}
	@JsonIgnore
	public void setParamAvgVehiclePerMinFromSouthToNorth(String o) {
		this.paramAvgVehiclePerMinFromSouthToNorth = SimulationReport.staticSetParamAvgVehiclePerMinFromSouthToNorth(siteRequest_, o);
	}
	public static BigDecimal staticSetParamAvgVehiclePerMinFromSouthToNorth(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamAvgVehiclePerMinFromSouthToNorth(Double o) {
		setParamAvgVehiclePerMinFromSouthToNorth(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamAvgVehiclePerMinFromSouthToNorth(Integer o) {
		setParamAvgVehiclePerMinFromSouthToNorth(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamAvgVehiclePerMinFromSouthToNorth(Number o) {
		setParamAvgVehiclePerMinFromSouthToNorth(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected SimulationReport paramAvgVehiclePerMinFromSouthToNorthInit() {
		Wrap<BigDecimal> paramAvgVehiclePerMinFromSouthToNorthWrap = new Wrap<BigDecimal>().var("paramAvgVehiclePerMinFromSouthToNorth");
		if(paramAvgVehiclePerMinFromSouthToNorth == null) {
			_paramAvgVehiclePerMinFromSouthToNorth(paramAvgVehiclePerMinFromSouthToNorthWrap);
			setParamAvgVehiclePerMinFromSouthToNorth(paramAvgVehiclePerMinFromSouthToNorthWrap.o);
		}
		return (SimulationReport)this;
	}

	public static Double staticSearchParamAvgVehiclePerMinFromSouthToNorth(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamAvgVehiclePerMinFromSouthToNorth(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamAvgVehiclePerMinFromSouthToNorth(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrParamAvgVehiclePerMinFromSouthToNorth(siteRequest_, SimulationReport.staticSearchParamAvgVehiclePerMinFromSouthToNorth(siteRequest_, SimulationReport.staticSetParamAvgVehiclePerMinFromSouthToNorth(siteRequest_, o)));
	}

	public BigDecimal sqlParamAvgVehiclePerMinFromSouthToNorth() {
		return paramAvgVehiclePerMinFromSouthToNorth;
	}

	/////////////////////////////////////
	// paramVehicleDemandScalingFactor //
	/////////////////////////////////////


	/**	 The entity paramVehicleDemandScalingFactor
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramVehicleDemandScalingFactor;

	/**	<br> The entity paramVehicleDemandScalingFactor
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:paramVehicleDemandScalingFactor">Find the entity paramVehicleDemandScalingFactor in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramVehicleDemandScalingFactor(Wrap<BigDecimal> w);

	public BigDecimal getParamVehicleDemandScalingFactor() {
		return paramVehicleDemandScalingFactor;
	}

	public void setParamVehicleDemandScalingFactor(BigDecimal paramVehicleDemandScalingFactor) {
		this.paramVehicleDemandScalingFactor = paramVehicleDemandScalingFactor;
	}
	@JsonIgnore
	public void setParamVehicleDemandScalingFactor(String o) {
		this.paramVehicleDemandScalingFactor = SimulationReport.staticSetParamVehicleDemandScalingFactor(siteRequest_, o);
	}
	public static BigDecimal staticSetParamVehicleDemandScalingFactor(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamVehicleDemandScalingFactor(Double o) {
		setParamVehicleDemandScalingFactor(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamVehicleDemandScalingFactor(Integer o) {
		setParamVehicleDemandScalingFactor(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamVehicleDemandScalingFactor(Number o) {
		setParamVehicleDemandScalingFactor(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected SimulationReport paramVehicleDemandScalingFactorInit() {
		Wrap<BigDecimal> paramVehicleDemandScalingFactorWrap = new Wrap<BigDecimal>().var("paramVehicleDemandScalingFactor");
		if(paramVehicleDemandScalingFactor == null) {
			_paramVehicleDemandScalingFactor(paramVehicleDemandScalingFactorWrap);
			setParamVehicleDemandScalingFactor(paramVehicleDemandScalingFactorWrap.o);
		}
		return (SimulationReport)this;
	}

	public static Double staticSearchParamVehicleDemandScalingFactor(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamVehicleDemandScalingFactor(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamVehicleDemandScalingFactor(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrParamVehicleDemandScalingFactor(siteRequest_, SimulationReport.staticSearchParamVehicleDemandScalingFactor(siteRequest_, SimulationReport.staticSetParamVehicleDemandScalingFactor(siteRequest_, o)));
	}

	public BigDecimal sqlParamVehicleDemandScalingFactor() {
		return paramVehicleDemandScalingFactor;
	}

	////////////////////////////////////////////
	// paramAvgPedestrianPerMinFromWestToEast //
	////////////////////////////////////////////


	/**	 The entity paramAvgPedestrianPerMinFromWestToEast
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramAvgPedestrianPerMinFromWestToEast;

	/**	<br> The entity paramAvgPedestrianPerMinFromWestToEast
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:paramAvgPedestrianPerMinFromWestToEast">Find the entity paramAvgPedestrianPerMinFromWestToEast in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramAvgPedestrianPerMinFromWestToEast(Wrap<BigDecimal> w);

	public BigDecimal getParamAvgPedestrianPerMinFromWestToEast() {
		return paramAvgPedestrianPerMinFromWestToEast;
	}

	public void setParamAvgPedestrianPerMinFromWestToEast(BigDecimal paramAvgPedestrianPerMinFromWestToEast) {
		this.paramAvgPedestrianPerMinFromWestToEast = paramAvgPedestrianPerMinFromWestToEast;
	}
	@JsonIgnore
	public void setParamAvgPedestrianPerMinFromWestToEast(String o) {
		this.paramAvgPedestrianPerMinFromWestToEast = SimulationReport.staticSetParamAvgPedestrianPerMinFromWestToEast(siteRequest_, o);
	}
	public static BigDecimal staticSetParamAvgPedestrianPerMinFromWestToEast(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamAvgPedestrianPerMinFromWestToEast(Double o) {
		setParamAvgPedestrianPerMinFromWestToEast(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamAvgPedestrianPerMinFromWestToEast(Integer o) {
		setParamAvgPedestrianPerMinFromWestToEast(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamAvgPedestrianPerMinFromWestToEast(Number o) {
		setParamAvgPedestrianPerMinFromWestToEast(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected SimulationReport paramAvgPedestrianPerMinFromWestToEastInit() {
		Wrap<BigDecimal> paramAvgPedestrianPerMinFromWestToEastWrap = new Wrap<BigDecimal>().var("paramAvgPedestrianPerMinFromWestToEast");
		if(paramAvgPedestrianPerMinFromWestToEast == null) {
			_paramAvgPedestrianPerMinFromWestToEast(paramAvgPedestrianPerMinFromWestToEastWrap);
			setParamAvgPedestrianPerMinFromWestToEast(paramAvgPedestrianPerMinFromWestToEastWrap.o);
		}
		return (SimulationReport)this;
	}

	public static Double staticSearchParamAvgPedestrianPerMinFromWestToEast(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamAvgPedestrianPerMinFromWestToEast(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamAvgPedestrianPerMinFromWestToEast(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrParamAvgPedestrianPerMinFromWestToEast(siteRequest_, SimulationReport.staticSearchParamAvgPedestrianPerMinFromWestToEast(siteRequest_, SimulationReport.staticSetParamAvgPedestrianPerMinFromWestToEast(siteRequest_, o)));
	}

	public BigDecimal sqlParamAvgPedestrianPerMinFromWestToEast() {
		return paramAvgPedestrianPerMinFromWestToEast;
	}

	//////////////////////////////////////////////
	// paramAvgPedestrianPerMinFromSouthToNorth //
	//////////////////////////////////////////////


	/**	 The entity paramAvgPedestrianPerMinFromSouthToNorth
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramAvgPedestrianPerMinFromSouthToNorth;

	/**	<br> The entity paramAvgPedestrianPerMinFromSouthToNorth
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:paramAvgPedestrianPerMinFromSouthToNorth">Find the entity paramAvgPedestrianPerMinFromSouthToNorth in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramAvgPedestrianPerMinFromSouthToNorth(Wrap<BigDecimal> w);

	public BigDecimal getParamAvgPedestrianPerMinFromSouthToNorth() {
		return paramAvgPedestrianPerMinFromSouthToNorth;
	}

	public void setParamAvgPedestrianPerMinFromSouthToNorth(BigDecimal paramAvgPedestrianPerMinFromSouthToNorth) {
		this.paramAvgPedestrianPerMinFromSouthToNorth = paramAvgPedestrianPerMinFromSouthToNorth;
	}
	@JsonIgnore
	public void setParamAvgPedestrianPerMinFromSouthToNorth(String o) {
		this.paramAvgPedestrianPerMinFromSouthToNorth = SimulationReport.staticSetParamAvgPedestrianPerMinFromSouthToNorth(siteRequest_, o);
	}
	public static BigDecimal staticSetParamAvgPedestrianPerMinFromSouthToNorth(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamAvgPedestrianPerMinFromSouthToNorth(Double o) {
		setParamAvgPedestrianPerMinFromSouthToNorth(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamAvgPedestrianPerMinFromSouthToNorth(Integer o) {
		setParamAvgPedestrianPerMinFromSouthToNorth(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamAvgPedestrianPerMinFromSouthToNorth(Number o) {
		setParamAvgPedestrianPerMinFromSouthToNorth(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected SimulationReport paramAvgPedestrianPerMinFromSouthToNorthInit() {
		Wrap<BigDecimal> paramAvgPedestrianPerMinFromSouthToNorthWrap = new Wrap<BigDecimal>().var("paramAvgPedestrianPerMinFromSouthToNorth");
		if(paramAvgPedestrianPerMinFromSouthToNorth == null) {
			_paramAvgPedestrianPerMinFromSouthToNorth(paramAvgPedestrianPerMinFromSouthToNorthWrap);
			setParamAvgPedestrianPerMinFromSouthToNorth(paramAvgPedestrianPerMinFromSouthToNorthWrap.o);
		}
		return (SimulationReport)this;
	}

	public static Double staticSearchParamAvgPedestrianPerMinFromSouthToNorth(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamAvgPedestrianPerMinFromSouthToNorth(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamAvgPedestrianPerMinFromSouthToNorth(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrParamAvgPedestrianPerMinFromSouthToNorth(siteRequest_, SimulationReport.staticSearchParamAvgPedestrianPerMinFromSouthToNorth(siteRequest_, SimulationReport.staticSetParamAvgPedestrianPerMinFromSouthToNorth(siteRequest_, o)));
	}

	public BigDecimal sqlParamAvgPedestrianPerMinFromSouthToNorth() {
		return paramAvgPedestrianPerMinFromSouthToNorth;
	}

	////////////////////////////////////////
	// paramPedestrianDemandScalingFactor //
	////////////////////////////////////////


	/**	 The entity paramPedestrianDemandScalingFactor
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramPedestrianDemandScalingFactor;

	/**	<br> The entity paramPedestrianDemandScalingFactor
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:paramPedestrianDemandScalingFactor">Find the entity paramPedestrianDemandScalingFactor in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramPedestrianDemandScalingFactor(Wrap<BigDecimal> w);

	public BigDecimal getParamPedestrianDemandScalingFactor() {
		return paramPedestrianDemandScalingFactor;
	}

	public void setParamPedestrianDemandScalingFactor(BigDecimal paramPedestrianDemandScalingFactor) {
		this.paramPedestrianDemandScalingFactor = paramPedestrianDemandScalingFactor;
	}
	@JsonIgnore
	public void setParamPedestrianDemandScalingFactor(String o) {
		this.paramPedestrianDemandScalingFactor = SimulationReport.staticSetParamPedestrianDemandScalingFactor(siteRequest_, o);
	}
	public static BigDecimal staticSetParamPedestrianDemandScalingFactor(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamPedestrianDemandScalingFactor(Double o) {
		setParamPedestrianDemandScalingFactor(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamPedestrianDemandScalingFactor(Integer o) {
		setParamPedestrianDemandScalingFactor(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamPedestrianDemandScalingFactor(Number o) {
		setParamPedestrianDemandScalingFactor(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected SimulationReport paramPedestrianDemandScalingFactorInit() {
		Wrap<BigDecimal> paramPedestrianDemandScalingFactorWrap = new Wrap<BigDecimal>().var("paramPedestrianDemandScalingFactor");
		if(paramPedestrianDemandScalingFactor == null) {
			_paramPedestrianDemandScalingFactor(paramPedestrianDemandScalingFactorWrap);
			setParamPedestrianDemandScalingFactor(paramPedestrianDemandScalingFactorWrap.o);
		}
		return (SimulationReport)this;
	}

	public static Double staticSearchParamPedestrianDemandScalingFactor(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamPedestrianDemandScalingFactor(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamPedestrianDemandScalingFactor(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrParamPedestrianDemandScalingFactor(siteRequest_, SimulationReport.staticSearchParamPedestrianDemandScalingFactor(siteRequest_, SimulationReport.staticSetParamPedestrianDemandScalingFactor(siteRequest_, o)));
	}

	public BigDecimal sqlParamPedestrianDemandScalingFactor() {
		return paramPedestrianDemandScalingFactor;
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

	//////////////////////////////////
	// paramMinGreenTimeSecWestEast //
	//////////////////////////////////


	/**	 The entity paramMinGreenTimeSecWestEast
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramMinGreenTimeSecWestEast;

	/**	<br> The entity paramMinGreenTimeSecWestEast
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:paramMinGreenTimeSecWestEast">Find the entity paramMinGreenTimeSecWestEast in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramMinGreenTimeSecWestEast(Wrap<BigDecimal> w);

	public BigDecimal getParamMinGreenTimeSecWestEast() {
		return paramMinGreenTimeSecWestEast;
	}

	public void setParamMinGreenTimeSecWestEast(BigDecimal paramMinGreenTimeSecWestEast) {
		this.paramMinGreenTimeSecWestEast = paramMinGreenTimeSecWestEast;
	}
	@JsonIgnore
	public void setParamMinGreenTimeSecWestEast(String o) {
		this.paramMinGreenTimeSecWestEast = SimulationReport.staticSetParamMinGreenTimeSecWestEast(siteRequest_, o);
	}
	public static BigDecimal staticSetParamMinGreenTimeSecWestEast(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamMinGreenTimeSecWestEast(Double o) {
		setParamMinGreenTimeSecWestEast(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamMinGreenTimeSecWestEast(Integer o) {
		setParamMinGreenTimeSecWestEast(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamMinGreenTimeSecWestEast(Number o) {
		setParamMinGreenTimeSecWestEast(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected SimulationReport paramMinGreenTimeSecWestEastInit() {
		Wrap<BigDecimal> paramMinGreenTimeSecWestEastWrap = new Wrap<BigDecimal>().var("paramMinGreenTimeSecWestEast");
		if(paramMinGreenTimeSecWestEast == null) {
			_paramMinGreenTimeSecWestEast(paramMinGreenTimeSecWestEastWrap);
			setParamMinGreenTimeSecWestEast(paramMinGreenTimeSecWestEastWrap.o);
		}
		return (SimulationReport)this;
	}

	public static Double staticSearchParamMinGreenTimeSecWestEast(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamMinGreenTimeSecWestEast(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamMinGreenTimeSecWestEast(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrParamMinGreenTimeSecWestEast(siteRequest_, SimulationReport.staticSearchParamMinGreenTimeSecWestEast(siteRequest_, SimulationReport.staticSetParamMinGreenTimeSecWestEast(siteRequest_, o)));
	}

	public BigDecimal sqlParamMinGreenTimeSecWestEast() {
		return paramMinGreenTimeSecWestEast;
	}

	//////////////////////////////////
	// paramMaxGreenTimeSecWestEast //
	//////////////////////////////////


	/**	 The entity paramMaxGreenTimeSecWestEast
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramMaxGreenTimeSecWestEast;

	/**	<br> The entity paramMaxGreenTimeSecWestEast
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:paramMaxGreenTimeSecWestEast">Find the entity paramMaxGreenTimeSecWestEast in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramMaxGreenTimeSecWestEast(Wrap<BigDecimal> w);

	public BigDecimal getParamMaxGreenTimeSecWestEast() {
		return paramMaxGreenTimeSecWestEast;
	}

	public void setParamMaxGreenTimeSecWestEast(BigDecimal paramMaxGreenTimeSecWestEast) {
		this.paramMaxGreenTimeSecWestEast = paramMaxGreenTimeSecWestEast;
	}
	@JsonIgnore
	public void setParamMaxGreenTimeSecWestEast(String o) {
		this.paramMaxGreenTimeSecWestEast = SimulationReport.staticSetParamMaxGreenTimeSecWestEast(siteRequest_, o);
	}
	public static BigDecimal staticSetParamMaxGreenTimeSecWestEast(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamMaxGreenTimeSecWestEast(Double o) {
		setParamMaxGreenTimeSecWestEast(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamMaxGreenTimeSecWestEast(Integer o) {
		setParamMaxGreenTimeSecWestEast(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamMaxGreenTimeSecWestEast(Number o) {
		setParamMaxGreenTimeSecWestEast(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected SimulationReport paramMaxGreenTimeSecWestEastInit() {
		Wrap<BigDecimal> paramMaxGreenTimeSecWestEastWrap = new Wrap<BigDecimal>().var("paramMaxGreenTimeSecWestEast");
		if(paramMaxGreenTimeSecWestEast == null) {
			_paramMaxGreenTimeSecWestEast(paramMaxGreenTimeSecWestEastWrap);
			setParamMaxGreenTimeSecWestEast(paramMaxGreenTimeSecWestEastWrap.o);
		}
		return (SimulationReport)this;
	}

	public static Double staticSearchParamMaxGreenTimeSecWestEast(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamMaxGreenTimeSecWestEast(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamMaxGreenTimeSecWestEast(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrParamMaxGreenTimeSecWestEast(siteRequest_, SimulationReport.staticSearchParamMaxGreenTimeSecWestEast(siteRequest_, SimulationReport.staticSetParamMaxGreenTimeSecWestEast(siteRequest_, o)));
	}

	public BigDecimal sqlParamMaxGreenTimeSecWestEast() {
		return paramMaxGreenTimeSecWestEast;
	}

	////////////////////////////////////
	// paramMinGreenTimeSecSouthNorth //
	////////////////////////////////////


	/**	 The entity paramMinGreenTimeSecSouthNorth
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramMinGreenTimeSecSouthNorth;

	/**	<br> The entity paramMinGreenTimeSecSouthNorth
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:paramMinGreenTimeSecSouthNorth">Find the entity paramMinGreenTimeSecSouthNorth in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramMinGreenTimeSecSouthNorth(Wrap<BigDecimal> w);

	public BigDecimal getParamMinGreenTimeSecSouthNorth() {
		return paramMinGreenTimeSecSouthNorth;
	}

	public void setParamMinGreenTimeSecSouthNorth(BigDecimal paramMinGreenTimeSecSouthNorth) {
		this.paramMinGreenTimeSecSouthNorth = paramMinGreenTimeSecSouthNorth;
	}
	@JsonIgnore
	public void setParamMinGreenTimeSecSouthNorth(String o) {
		this.paramMinGreenTimeSecSouthNorth = SimulationReport.staticSetParamMinGreenTimeSecSouthNorth(siteRequest_, o);
	}
	public static BigDecimal staticSetParamMinGreenTimeSecSouthNorth(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamMinGreenTimeSecSouthNorth(Double o) {
		setParamMinGreenTimeSecSouthNorth(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamMinGreenTimeSecSouthNorth(Integer o) {
		setParamMinGreenTimeSecSouthNorth(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamMinGreenTimeSecSouthNorth(Number o) {
		setParamMinGreenTimeSecSouthNorth(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected SimulationReport paramMinGreenTimeSecSouthNorthInit() {
		Wrap<BigDecimal> paramMinGreenTimeSecSouthNorthWrap = new Wrap<BigDecimal>().var("paramMinGreenTimeSecSouthNorth");
		if(paramMinGreenTimeSecSouthNorth == null) {
			_paramMinGreenTimeSecSouthNorth(paramMinGreenTimeSecSouthNorthWrap);
			setParamMinGreenTimeSecSouthNorth(paramMinGreenTimeSecSouthNorthWrap.o);
		}
		return (SimulationReport)this;
	}

	public static Double staticSearchParamMinGreenTimeSecSouthNorth(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamMinGreenTimeSecSouthNorth(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamMinGreenTimeSecSouthNorth(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrParamMinGreenTimeSecSouthNorth(siteRequest_, SimulationReport.staticSearchParamMinGreenTimeSecSouthNorth(siteRequest_, SimulationReport.staticSetParamMinGreenTimeSecSouthNorth(siteRequest_, o)));
	}

	public BigDecimal sqlParamMinGreenTimeSecSouthNorth() {
		return paramMinGreenTimeSecSouthNorth;
	}

	////////////////////////////////////
	// paramMaxGreenTimeSecSouthNorth //
	////////////////////////////////////


	/**	 The entity paramMaxGreenTimeSecSouthNorth
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramMaxGreenTimeSecSouthNorth;

	/**	<br> The entity paramMaxGreenTimeSecSouthNorth
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:paramMaxGreenTimeSecSouthNorth">Find the entity paramMaxGreenTimeSecSouthNorth in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramMaxGreenTimeSecSouthNorth(Wrap<BigDecimal> w);

	public BigDecimal getParamMaxGreenTimeSecSouthNorth() {
		return paramMaxGreenTimeSecSouthNorth;
	}

	public void setParamMaxGreenTimeSecSouthNorth(BigDecimal paramMaxGreenTimeSecSouthNorth) {
		this.paramMaxGreenTimeSecSouthNorth = paramMaxGreenTimeSecSouthNorth;
	}
	@JsonIgnore
	public void setParamMaxGreenTimeSecSouthNorth(String o) {
		this.paramMaxGreenTimeSecSouthNorth = SimulationReport.staticSetParamMaxGreenTimeSecSouthNorth(siteRequest_, o);
	}
	public static BigDecimal staticSetParamMaxGreenTimeSecSouthNorth(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamMaxGreenTimeSecSouthNorth(Double o) {
		setParamMaxGreenTimeSecSouthNorth(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamMaxGreenTimeSecSouthNorth(Integer o) {
		setParamMaxGreenTimeSecSouthNorth(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamMaxGreenTimeSecSouthNorth(Number o) {
		setParamMaxGreenTimeSecSouthNorth(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected SimulationReport paramMaxGreenTimeSecSouthNorthInit() {
		Wrap<BigDecimal> paramMaxGreenTimeSecSouthNorthWrap = new Wrap<BigDecimal>().var("paramMaxGreenTimeSecSouthNorth");
		if(paramMaxGreenTimeSecSouthNorth == null) {
			_paramMaxGreenTimeSecSouthNorth(paramMaxGreenTimeSecSouthNorthWrap);
			setParamMaxGreenTimeSecSouthNorth(paramMaxGreenTimeSecSouthNorthWrap.o);
		}
		return (SimulationReport)this;
	}

	public static Double staticSearchParamMaxGreenTimeSecSouthNorth(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamMaxGreenTimeSecSouthNorth(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamMaxGreenTimeSecSouthNorth(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrParamMaxGreenTimeSecSouthNorth(siteRequest_, SimulationReport.staticSearchParamMaxGreenTimeSecSouthNorth(siteRequest_, SimulationReport.staticSetParamMaxGreenTimeSecSouthNorth(siteRequest_, o)));
	}

	public BigDecimal sqlParamMaxGreenTimeSecSouthNorth() {
		return paramMaxGreenTimeSecSouthNorth;
	}

	///////////////////////////////////////////////
	// paramPedestrianWaitThresholdSecNorthSouth //
	///////////////////////////////////////////////


	/**	 The entity paramPedestrianWaitThresholdSecNorthSouth
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramPedestrianWaitThresholdSecNorthSouth;

	/**	<br> The entity paramPedestrianWaitThresholdSecNorthSouth
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:paramPedestrianWaitThresholdSecNorthSouth">Find the entity paramPedestrianWaitThresholdSecNorthSouth in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramPedestrianWaitThresholdSecNorthSouth(Wrap<BigDecimal> w);

	public BigDecimal getParamPedestrianWaitThresholdSecNorthSouth() {
		return paramPedestrianWaitThresholdSecNorthSouth;
	}

	public void setParamPedestrianWaitThresholdSecNorthSouth(BigDecimal paramPedestrianWaitThresholdSecNorthSouth) {
		this.paramPedestrianWaitThresholdSecNorthSouth = paramPedestrianWaitThresholdSecNorthSouth;
	}
	@JsonIgnore
	public void setParamPedestrianWaitThresholdSecNorthSouth(String o) {
		this.paramPedestrianWaitThresholdSecNorthSouth = SimulationReport.staticSetParamPedestrianWaitThresholdSecNorthSouth(siteRequest_, o);
	}
	public static BigDecimal staticSetParamPedestrianWaitThresholdSecNorthSouth(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamPedestrianWaitThresholdSecNorthSouth(Double o) {
		setParamPedestrianWaitThresholdSecNorthSouth(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamPedestrianWaitThresholdSecNorthSouth(Integer o) {
		setParamPedestrianWaitThresholdSecNorthSouth(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamPedestrianWaitThresholdSecNorthSouth(Number o) {
		setParamPedestrianWaitThresholdSecNorthSouth(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected SimulationReport paramPedestrianWaitThresholdSecNorthSouthInit() {
		Wrap<BigDecimal> paramPedestrianWaitThresholdSecNorthSouthWrap = new Wrap<BigDecimal>().var("paramPedestrianWaitThresholdSecNorthSouth");
		if(paramPedestrianWaitThresholdSecNorthSouth == null) {
			_paramPedestrianWaitThresholdSecNorthSouth(paramPedestrianWaitThresholdSecNorthSouthWrap);
			setParamPedestrianWaitThresholdSecNorthSouth(paramPedestrianWaitThresholdSecNorthSouthWrap.o);
		}
		return (SimulationReport)this;
	}

	public static Double staticSearchParamPedestrianWaitThresholdSecNorthSouth(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamPedestrianWaitThresholdSecNorthSouth(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamPedestrianWaitThresholdSecNorthSouth(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrParamPedestrianWaitThresholdSecNorthSouth(siteRequest_, SimulationReport.staticSearchParamPedestrianWaitThresholdSecNorthSouth(siteRequest_, SimulationReport.staticSetParamPedestrianWaitThresholdSecNorthSouth(siteRequest_, o)));
	}

	public BigDecimal sqlParamPedestrianWaitThresholdSecNorthSouth() {
		return paramPedestrianWaitThresholdSecNorthSouth;
	}

	/////////////////////////////////////////////
	// paramPedestrianWaitThresholdSecWestEast //
	/////////////////////////////////////////////


	/**	 The entity paramPedestrianWaitThresholdSecWestEast
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramPedestrianWaitThresholdSecWestEast;

	/**	<br> The entity paramPedestrianWaitThresholdSecWestEast
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:paramPedestrianWaitThresholdSecWestEast">Find the entity paramPedestrianWaitThresholdSecWestEast in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramPedestrianWaitThresholdSecWestEast(Wrap<BigDecimal> w);

	public BigDecimal getParamPedestrianWaitThresholdSecWestEast() {
		return paramPedestrianWaitThresholdSecWestEast;
	}

	public void setParamPedestrianWaitThresholdSecWestEast(BigDecimal paramPedestrianWaitThresholdSecWestEast) {
		this.paramPedestrianWaitThresholdSecWestEast = paramPedestrianWaitThresholdSecWestEast;
	}
	@JsonIgnore
	public void setParamPedestrianWaitThresholdSecWestEast(String o) {
		this.paramPedestrianWaitThresholdSecWestEast = SimulationReport.staticSetParamPedestrianWaitThresholdSecWestEast(siteRequest_, o);
	}
	public static BigDecimal staticSetParamPedestrianWaitThresholdSecWestEast(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamPedestrianWaitThresholdSecWestEast(Double o) {
		setParamPedestrianWaitThresholdSecWestEast(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamPedestrianWaitThresholdSecWestEast(Integer o) {
		setParamPedestrianWaitThresholdSecWestEast(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamPedestrianWaitThresholdSecWestEast(Number o) {
		setParamPedestrianWaitThresholdSecWestEast(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected SimulationReport paramPedestrianWaitThresholdSecWestEastInit() {
		Wrap<BigDecimal> paramPedestrianWaitThresholdSecWestEastWrap = new Wrap<BigDecimal>().var("paramPedestrianWaitThresholdSecWestEast");
		if(paramPedestrianWaitThresholdSecWestEast == null) {
			_paramPedestrianWaitThresholdSecWestEast(paramPedestrianWaitThresholdSecWestEastWrap);
			setParamPedestrianWaitThresholdSecWestEast(paramPedestrianWaitThresholdSecWestEastWrap.o);
		}
		return (SimulationReport)this;
	}

	public static Double staticSearchParamPedestrianWaitThresholdSecWestEast(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamPedestrianWaitThresholdSecWestEast(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamPedestrianWaitThresholdSecWestEast(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrParamPedestrianWaitThresholdSecWestEast(siteRequest_, SimulationReport.staticSearchParamPedestrianWaitThresholdSecWestEast(siteRequest_, SimulationReport.staticSetParamPedestrianWaitThresholdSecWestEast(siteRequest_, o)));
	}

	public BigDecimal sqlParamPedestrianWaitThresholdSecWestEast() {
		return paramPedestrianWaitThresholdSecWestEast;
	}

	////////////////////////////////////////
	// paramVehicleQueueThresholdWestEast //
	////////////////////////////////////////


	/**	 The entity paramVehicleQueueThresholdWestEast
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramVehicleQueueThresholdWestEast;

	/**	<br> The entity paramVehicleQueueThresholdWestEast
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:paramVehicleQueueThresholdWestEast">Find the entity paramVehicleQueueThresholdWestEast in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramVehicleQueueThresholdWestEast(Wrap<BigDecimal> w);

	public BigDecimal getParamVehicleQueueThresholdWestEast() {
		return paramVehicleQueueThresholdWestEast;
	}

	public void setParamVehicleQueueThresholdWestEast(BigDecimal paramVehicleQueueThresholdWestEast) {
		this.paramVehicleQueueThresholdWestEast = paramVehicleQueueThresholdWestEast;
	}
	@JsonIgnore
	public void setParamVehicleQueueThresholdWestEast(String o) {
		this.paramVehicleQueueThresholdWestEast = SimulationReport.staticSetParamVehicleQueueThresholdWestEast(siteRequest_, o);
	}
	public static BigDecimal staticSetParamVehicleQueueThresholdWestEast(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamVehicleQueueThresholdWestEast(Double o) {
		setParamVehicleQueueThresholdWestEast(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamVehicleQueueThresholdWestEast(Integer o) {
		setParamVehicleQueueThresholdWestEast(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamVehicleQueueThresholdWestEast(Number o) {
		setParamVehicleQueueThresholdWestEast(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected SimulationReport paramVehicleQueueThresholdWestEastInit() {
		Wrap<BigDecimal> paramVehicleQueueThresholdWestEastWrap = new Wrap<BigDecimal>().var("paramVehicleQueueThresholdWestEast");
		if(paramVehicleQueueThresholdWestEast == null) {
			_paramVehicleQueueThresholdWestEast(paramVehicleQueueThresholdWestEastWrap);
			setParamVehicleQueueThresholdWestEast(paramVehicleQueueThresholdWestEastWrap.o);
		}
		return (SimulationReport)this;
	}

	public static Double staticSearchParamVehicleQueueThresholdWestEast(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamVehicleQueueThresholdWestEast(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamVehicleQueueThresholdWestEast(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrParamVehicleQueueThresholdWestEast(siteRequest_, SimulationReport.staticSearchParamVehicleQueueThresholdWestEast(siteRequest_, SimulationReport.staticSetParamVehicleQueueThresholdWestEast(siteRequest_, o)));
	}

	public BigDecimal sqlParamVehicleQueueThresholdWestEast() {
		return paramVehicleQueueThresholdWestEast;
	}

	//////////////////////////////////////////
	// paramVehicleQueueThresholdSouthNorth //
	//////////////////////////////////////////


	/**	 The entity paramVehicleQueueThresholdSouthNorth
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramVehicleQueueThresholdSouthNorth;

	/**	<br> The entity paramVehicleQueueThresholdSouthNorth
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:paramVehicleQueueThresholdSouthNorth">Find the entity paramVehicleQueueThresholdSouthNorth in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramVehicleQueueThresholdSouthNorth(Wrap<BigDecimal> w);

	public BigDecimal getParamVehicleQueueThresholdSouthNorth() {
		return paramVehicleQueueThresholdSouthNorth;
	}

	public void setParamVehicleQueueThresholdSouthNorth(BigDecimal paramVehicleQueueThresholdSouthNorth) {
		this.paramVehicleQueueThresholdSouthNorth = paramVehicleQueueThresholdSouthNorth;
	}
	@JsonIgnore
	public void setParamVehicleQueueThresholdSouthNorth(String o) {
		this.paramVehicleQueueThresholdSouthNorth = SimulationReport.staticSetParamVehicleQueueThresholdSouthNorth(siteRequest_, o);
	}
	public static BigDecimal staticSetParamVehicleQueueThresholdSouthNorth(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamVehicleQueueThresholdSouthNorth(Double o) {
		setParamVehicleQueueThresholdSouthNorth(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamVehicleQueueThresholdSouthNorth(Integer o) {
		setParamVehicleQueueThresholdSouthNorth(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamVehicleQueueThresholdSouthNorth(Number o) {
		setParamVehicleQueueThresholdSouthNorth(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected SimulationReport paramVehicleQueueThresholdSouthNorthInit() {
		Wrap<BigDecimal> paramVehicleQueueThresholdSouthNorthWrap = new Wrap<BigDecimal>().var("paramVehicleQueueThresholdSouthNorth");
		if(paramVehicleQueueThresholdSouthNorth == null) {
			_paramVehicleQueueThresholdSouthNorth(paramVehicleQueueThresholdSouthNorthWrap);
			setParamVehicleQueueThresholdSouthNorth(paramVehicleQueueThresholdSouthNorthWrap.o);
		}
		return (SimulationReport)this;
	}

	public static Double staticSearchParamVehicleQueueThresholdSouthNorth(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamVehicleQueueThresholdSouthNorth(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamVehicleQueueThresholdSouthNorth(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrParamVehicleQueueThresholdSouthNorth(siteRequest_, SimulationReport.staticSearchParamVehicleQueueThresholdSouthNorth(siteRequest_, SimulationReport.staticSetParamVehicleQueueThresholdSouthNorth(siteRequest_, o)));
	}

	public BigDecimal sqlParamVehicleQueueThresholdSouthNorth() {
		return paramVehicleQueueThresholdSouthNorth;
	}

	/////////////////////////////////////////////
	// paramPedestrianQueueThresholdNorthSouth //
	/////////////////////////////////////////////


	/**	 The entity paramPedestrianQueueThresholdNorthSouth
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramPedestrianQueueThresholdNorthSouth;

	/**	<br> The entity paramPedestrianQueueThresholdNorthSouth
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:paramPedestrianQueueThresholdNorthSouth">Find the entity paramPedestrianQueueThresholdNorthSouth in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramPedestrianQueueThresholdNorthSouth(Wrap<BigDecimal> w);

	public BigDecimal getParamPedestrianQueueThresholdNorthSouth() {
		return paramPedestrianQueueThresholdNorthSouth;
	}

	public void setParamPedestrianQueueThresholdNorthSouth(BigDecimal paramPedestrianQueueThresholdNorthSouth) {
		this.paramPedestrianQueueThresholdNorthSouth = paramPedestrianQueueThresholdNorthSouth;
	}
	@JsonIgnore
	public void setParamPedestrianQueueThresholdNorthSouth(String o) {
		this.paramPedestrianQueueThresholdNorthSouth = SimulationReport.staticSetParamPedestrianQueueThresholdNorthSouth(siteRequest_, o);
	}
	public static BigDecimal staticSetParamPedestrianQueueThresholdNorthSouth(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamPedestrianQueueThresholdNorthSouth(Double o) {
		setParamPedestrianQueueThresholdNorthSouth(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamPedestrianQueueThresholdNorthSouth(Integer o) {
		setParamPedestrianQueueThresholdNorthSouth(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamPedestrianQueueThresholdNorthSouth(Number o) {
		setParamPedestrianQueueThresholdNorthSouth(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected SimulationReport paramPedestrianQueueThresholdNorthSouthInit() {
		Wrap<BigDecimal> paramPedestrianQueueThresholdNorthSouthWrap = new Wrap<BigDecimal>().var("paramPedestrianQueueThresholdNorthSouth");
		if(paramPedestrianQueueThresholdNorthSouth == null) {
			_paramPedestrianQueueThresholdNorthSouth(paramPedestrianQueueThresholdNorthSouthWrap);
			setParamPedestrianQueueThresholdNorthSouth(paramPedestrianQueueThresholdNorthSouthWrap.o);
		}
		return (SimulationReport)this;
	}

	public static Double staticSearchParamPedestrianQueueThresholdNorthSouth(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamPedestrianQueueThresholdNorthSouth(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamPedestrianQueueThresholdNorthSouth(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrParamPedestrianQueueThresholdNorthSouth(siteRequest_, SimulationReport.staticSearchParamPedestrianQueueThresholdNorthSouth(siteRequest_, SimulationReport.staticSetParamPedestrianQueueThresholdNorthSouth(siteRequest_, o)));
	}

	public BigDecimal sqlParamPedestrianQueueThresholdNorthSouth() {
		return paramPedestrianQueueThresholdNorthSouth;
	}

	///////////////////////////////////////////
	// paramPedestrianQueueThresholdWestEast //
	///////////////////////////////////////////


	/**	 The entity paramPedestrianQueueThresholdWestEast
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramPedestrianQueueThresholdWestEast;

	/**	<br> The entity paramPedestrianQueueThresholdWestEast
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:paramPedestrianQueueThresholdWestEast">Find the entity paramPedestrianQueueThresholdWestEast in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramPedestrianQueueThresholdWestEast(Wrap<BigDecimal> w);

	public BigDecimal getParamPedestrianQueueThresholdWestEast() {
		return paramPedestrianQueueThresholdWestEast;
	}

	public void setParamPedestrianQueueThresholdWestEast(BigDecimal paramPedestrianQueueThresholdWestEast) {
		this.paramPedestrianQueueThresholdWestEast = paramPedestrianQueueThresholdWestEast;
	}
	@JsonIgnore
	public void setParamPedestrianQueueThresholdWestEast(String o) {
		this.paramPedestrianQueueThresholdWestEast = SimulationReport.staticSetParamPedestrianQueueThresholdWestEast(siteRequest_, o);
	}
	public static BigDecimal staticSetParamPedestrianQueueThresholdWestEast(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamPedestrianQueueThresholdWestEast(Double o) {
		setParamPedestrianQueueThresholdWestEast(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamPedestrianQueueThresholdWestEast(Integer o) {
		setParamPedestrianQueueThresholdWestEast(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamPedestrianQueueThresholdWestEast(Number o) {
		setParamPedestrianQueueThresholdWestEast(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected SimulationReport paramPedestrianQueueThresholdWestEastInit() {
		Wrap<BigDecimal> paramPedestrianQueueThresholdWestEastWrap = new Wrap<BigDecimal>().var("paramPedestrianQueueThresholdWestEast");
		if(paramPedestrianQueueThresholdWestEast == null) {
			_paramPedestrianQueueThresholdWestEast(paramPedestrianQueueThresholdWestEastWrap);
			setParamPedestrianQueueThresholdWestEast(paramPedestrianQueueThresholdWestEastWrap.o);
		}
		return (SimulationReport)this;
	}

	public static Double staticSearchParamPedestrianQueueThresholdWestEast(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamPedestrianQueueThresholdWestEast(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamPedestrianQueueThresholdWestEast(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrParamPedestrianQueueThresholdWestEast(siteRequest_, SimulationReport.staticSearchParamPedestrianQueueThresholdWestEast(siteRequest_, SimulationReport.staticSetParamPedestrianQueueThresholdWestEast(siteRequest_, o)));
	}

	public BigDecimal sqlParamPedestrianQueueThresholdWestEast() {
		return paramPedestrianQueueThresholdWestEast;
	}

	//////////////////////
	// paramDemandScale //
	//////////////////////


	/**	 The entity paramDemandScale
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<BigDecimal> paramDemandScale = new ArrayList<BigDecimal>();

	/**	<br> The entity paramDemandScale
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:paramDemandScale">Find the entity paramDemandScale in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _paramDemandScale(List<BigDecimal> l);

	public List<BigDecimal> getParamDemandScale() {
		return paramDemandScale;
	}

	public void setParamDemandScale(List<BigDecimal> paramDemandScale) {
		this.paramDemandScale = paramDemandScale;
	}
	@JsonIgnore
	public void setParamDemandScale(String o) {
		BigDecimal l = SimulationReport.staticSetParamDemandScale(siteRequest_, o);
		if(l != null)
			addParamDemandScale(l);
	}
	public static BigDecimal staticSetParamDemandScale(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamDemandScale(Double o) {
		addParamDemandScale(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamDemandScale(Integer o) {
		addParamDemandScale(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamDemandScale(Number o) {
		addParamDemandScale(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	public SimulationReport addParamDemandScale(BigDecimal...objects) {
		for(BigDecimal o : objects) {
			addParamDemandScale(o);
		}
		return (SimulationReport)this;
	}
	public SimulationReport addParamDemandScale(BigDecimal o) {
		if(o != null)
			this.paramDemandScale.add(o);
		return (SimulationReport)this;
	}
	@JsonIgnore
	public void setParamDemandScale(JsonArray objects) {
		paramDemandScale.clear();
		if(objects == null)
			return;
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addParamDemandScale(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
		}
	}
	public SimulationReport addParamDemandScale(String o) {
		if(NumberUtils.isParsable(o)) {
			BigDecimal p = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
			addParamDemandScale(p);
		}
		return (SimulationReport)this;
	}
	protected SimulationReport paramDemandScaleInit() {
		_paramDemandScale(paramDemandScale);
		return (SimulationReport)this;
	}

	public static BigDecimal staticSearchParamDemandScale(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o;
	}

	public static String staticSearchStrParamDemandScale(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamDemandScale(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrParamDemandScale(siteRequest_, SimulationReport.staticSearchParamDemandScale(siteRequest_, SimulationReport.staticSetParamDemandScale(siteRequest_, o)));
	}

	public Number[] sqlParamDemandScale() {
		return paramDemandScale.stream().map(v -> (Number)v).toArray(Number[]::new);
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

	//////////////////
	// reportStatus //
	//////////////////

	public static final String reportStatusStopped1_enUS = " Stopped";
	public static final String reportStatusStopped_enUS = reportStatusStopped1_enUS;
	public static final String reportStatusCompleted1_enUS = " Completed";
	public static final String reportStatusCompleted_enUS = reportStatusCompleted1_enUS;
	public static final String reportStatusRunning1_enUS = " Running";
	public static final String reportStatusRunning_enUS = reportStatusRunning1_enUS;
	public static final String reportStatusError1_enUS = " Error";
	public static final String reportStatusError_enUS = reportStatusError1_enUS;

	/**	 The entity reportStatus
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String reportStatus;

	/**	<br> The entity reportStatus
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:reportStatus">Find the entity reportStatus in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _reportStatus(Wrap<String> w);

	public String getReportStatus() {
		return reportStatus;
	}
	public void setReportStatus(String o) {
		this.reportStatus = SimulationReport.staticSetReportStatus(siteRequest_, o);
	}
	public static String staticSetReportStatus(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SimulationReport reportStatusInit() {
		Wrap<String> reportStatusWrap = new Wrap<String>().var("reportStatus");
		if(reportStatus == null) {
			_reportStatus(reportStatusWrap);
			setReportStatus(reportStatusWrap.o);
		}
		return (SimulationReport)this;
	}

	public static String staticSearchReportStatus(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrReportStatus(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqReportStatus(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrReportStatus(siteRequest_, SimulationReport.staticSearchReportStatus(siteRequest_, SimulationReport.staticSetReportStatus(siteRequest_, o)));
	}

	public String sqlReportStatus() {
		return reportStatus;
	}

	////////////////////
	// reportProgress //
	////////////////////


	/**	 The entity reportProgress
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer reportProgress;

	/**	<br> The entity reportProgress
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:reportProgress">Find the entity reportProgress in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _reportProgress(Wrap<Integer> w);

	public Integer getReportProgress() {
		return reportProgress;
	}

	public void setReportProgress(Integer reportProgress) {
		this.reportProgress = reportProgress;
	}
	@JsonIgnore
	public void setReportProgress(String o) {
		this.reportProgress = SimulationReport.staticSetReportProgress(siteRequest_, o);
	}
	public static Integer staticSetReportProgress(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected SimulationReport reportProgressInit() {
		Wrap<Integer> reportProgressWrap = new Wrap<Integer>().var("reportProgress");
		if(reportProgress == null) {
			_reportProgress(reportProgressWrap);
			setReportProgress(reportProgressWrap.o);
		}
		return (SimulationReport)this;
	}

	public static Integer staticSearchReportProgress(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrReportProgress(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqReportProgress(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrReportProgress(siteRequest_, SimulationReport.staticSearchReportProgress(siteRequest_, SimulationReport.staticSetReportProgress(siteRequest_, o)));
	}

	public Integer sqlReportProgress() {
		return reportProgress;
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

	//////////////////////////////////////////////
	// updatedPerformanceWaitWestEastVehicleSec //
	//////////////////////////////////////////////


	/**	 The entity updatedPerformanceWaitWestEastVehicleSec
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray updatedPerformanceWaitWestEastVehicleSec;

	/**	<br> The entity updatedPerformanceWaitWestEastVehicleSec
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:updatedPerformanceWaitWestEastVehicleSec">Find the entity updatedPerformanceWaitWestEastVehicleSec in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _updatedPerformanceWaitWestEastVehicleSec(Wrap<JsonArray> w);

	public JsonArray getUpdatedPerformanceWaitWestEastVehicleSec() {
		return updatedPerformanceWaitWestEastVehicleSec;
	}

	public void setUpdatedPerformanceWaitWestEastVehicleSec(JsonArray updatedPerformanceWaitWestEastVehicleSec) {
		this.updatedPerformanceWaitWestEastVehicleSec = updatedPerformanceWaitWestEastVehicleSec;
	}
	@JsonIgnore
	public void setUpdatedPerformanceWaitWestEastVehicleSec(String o) {
		this.updatedPerformanceWaitWestEastVehicleSec = SimulationReport.staticSetUpdatedPerformanceWaitWestEastVehicleSec(siteRequest_, o);
	}
	public static JsonArray staticSetUpdatedPerformanceWaitWestEastVehicleSec(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonArray(o);
		}
		return null;
	}
	protected SimulationReport updatedPerformanceWaitWestEastVehicleSecInit() {
		Wrap<JsonArray> updatedPerformanceWaitWestEastVehicleSecWrap = new Wrap<JsonArray>().var("updatedPerformanceWaitWestEastVehicleSec");
		if(updatedPerformanceWaitWestEastVehicleSec == null) {
			_updatedPerformanceWaitWestEastVehicleSec(updatedPerformanceWaitWestEastVehicleSecWrap);
			setUpdatedPerformanceWaitWestEastVehicleSec(updatedPerformanceWaitWestEastVehicleSecWrap.o);
		}
		return (SimulationReport)this;
	}

	public static JsonArray staticSearchUpdatedPerformanceWaitWestEastVehicleSec(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o;
	}

	public static String staticSearchStrUpdatedPerformanceWaitWestEastVehicleSec(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUpdatedPerformanceWaitWestEastVehicleSec(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrUpdatedPerformanceWaitWestEastVehicleSec(siteRequest_, SimulationReport.staticSearchUpdatedPerformanceWaitWestEastVehicleSec(siteRequest_, SimulationReport.staticSetUpdatedPerformanceWaitWestEastVehicleSec(siteRequest_, o)));
	}

	////////////////////////////////////////////////
	// updatedPerformanceWaitSouthNorthVehicleSec //
	////////////////////////////////////////////////


	/**	 The entity updatedPerformanceWaitSouthNorthVehicleSec
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray updatedPerformanceWaitSouthNorthVehicleSec;

	/**	<br> The entity updatedPerformanceWaitSouthNorthVehicleSec
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:updatedPerformanceWaitSouthNorthVehicleSec">Find the entity updatedPerformanceWaitSouthNorthVehicleSec in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _updatedPerformanceWaitSouthNorthVehicleSec(Wrap<JsonArray> w);

	public JsonArray getUpdatedPerformanceWaitSouthNorthVehicleSec() {
		return updatedPerformanceWaitSouthNorthVehicleSec;
	}

	public void setUpdatedPerformanceWaitSouthNorthVehicleSec(JsonArray updatedPerformanceWaitSouthNorthVehicleSec) {
		this.updatedPerformanceWaitSouthNorthVehicleSec = updatedPerformanceWaitSouthNorthVehicleSec;
	}
	@JsonIgnore
	public void setUpdatedPerformanceWaitSouthNorthVehicleSec(String o) {
		this.updatedPerformanceWaitSouthNorthVehicleSec = SimulationReport.staticSetUpdatedPerformanceWaitSouthNorthVehicleSec(siteRequest_, o);
	}
	public static JsonArray staticSetUpdatedPerformanceWaitSouthNorthVehicleSec(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonArray(o);
		}
		return null;
	}
	protected SimulationReport updatedPerformanceWaitSouthNorthVehicleSecInit() {
		Wrap<JsonArray> updatedPerformanceWaitSouthNorthVehicleSecWrap = new Wrap<JsonArray>().var("updatedPerformanceWaitSouthNorthVehicleSec");
		if(updatedPerformanceWaitSouthNorthVehicleSec == null) {
			_updatedPerformanceWaitSouthNorthVehicleSec(updatedPerformanceWaitSouthNorthVehicleSecWrap);
			setUpdatedPerformanceWaitSouthNorthVehicleSec(updatedPerformanceWaitSouthNorthVehicleSecWrap.o);
		}
		return (SimulationReport)this;
	}

	public static JsonArray staticSearchUpdatedPerformanceWaitSouthNorthVehicleSec(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o;
	}

	public static String staticSearchStrUpdatedPerformanceWaitSouthNorthVehicleSec(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUpdatedPerformanceWaitSouthNorthVehicleSec(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrUpdatedPerformanceWaitSouthNorthVehicleSec(siteRequest_, SimulationReport.staticSearchUpdatedPerformanceWaitSouthNorthVehicleSec(siteRequest_, SimulationReport.staticSetUpdatedPerformanceWaitSouthNorthVehicleSec(siteRequest_, o)));
	}

	/////////////////////////////////////////
	// updatedPerformanceWaitAllVehicleSec //
	/////////////////////////////////////////


	/**	 The entity updatedPerformanceWaitAllVehicleSec
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray updatedPerformanceWaitAllVehicleSec;

	/**	<br> The entity updatedPerformanceWaitAllVehicleSec
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:updatedPerformanceWaitAllVehicleSec">Find the entity updatedPerformanceWaitAllVehicleSec in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _updatedPerformanceWaitAllVehicleSec(Wrap<JsonArray> w);

	public JsonArray getUpdatedPerformanceWaitAllVehicleSec() {
		return updatedPerformanceWaitAllVehicleSec;
	}

	public void setUpdatedPerformanceWaitAllVehicleSec(JsonArray updatedPerformanceWaitAllVehicleSec) {
		this.updatedPerformanceWaitAllVehicleSec = updatedPerformanceWaitAllVehicleSec;
	}
	@JsonIgnore
	public void setUpdatedPerformanceWaitAllVehicleSec(String o) {
		this.updatedPerformanceWaitAllVehicleSec = SimulationReport.staticSetUpdatedPerformanceWaitAllVehicleSec(siteRequest_, o);
	}
	public static JsonArray staticSetUpdatedPerformanceWaitAllVehicleSec(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonArray(o);
		}
		return null;
	}
	protected SimulationReport updatedPerformanceWaitAllVehicleSecInit() {
		Wrap<JsonArray> updatedPerformanceWaitAllVehicleSecWrap = new Wrap<JsonArray>().var("updatedPerformanceWaitAllVehicleSec");
		if(updatedPerformanceWaitAllVehicleSec == null) {
			_updatedPerformanceWaitAllVehicleSec(updatedPerformanceWaitAllVehicleSecWrap);
			setUpdatedPerformanceWaitAllVehicleSec(updatedPerformanceWaitAllVehicleSecWrap.o);
		}
		return (SimulationReport)this;
	}

	public static JsonArray staticSearchUpdatedPerformanceWaitAllVehicleSec(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o;
	}

	public static String staticSearchStrUpdatedPerformanceWaitAllVehicleSec(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUpdatedPerformanceWaitAllVehicleSec(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrUpdatedPerformanceWaitAllVehicleSec(siteRequest_, SimulationReport.staticSearchUpdatedPerformanceWaitAllVehicleSec(siteRequest_, SimulationReport.staticSetUpdatedPerformanceWaitAllVehicleSec(siteRequest_, o)));
	}

	////////////////////////////////////////////
	// updatedPerformanceWaitAllPedestrianSec //
	////////////////////////////////////////////


	/**	 The entity updatedPerformanceWaitAllPedestrianSec
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray updatedPerformanceWaitAllPedestrianSec;

	/**	<br> The entity updatedPerformanceWaitAllPedestrianSec
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:updatedPerformanceWaitAllPedestrianSec">Find the entity updatedPerformanceWaitAllPedestrianSec in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _updatedPerformanceWaitAllPedestrianSec(Wrap<JsonArray> w);

	public JsonArray getUpdatedPerformanceWaitAllPedestrianSec() {
		return updatedPerformanceWaitAllPedestrianSec;
	}

	public void setUpdatedPerformanceWaitAllPedestrianSec(JsonArray updatedPerformanceWaitAllPedestrianSec) {
		this.updatedPerformanceWaitAllPedestrianSec = updatedPerformanceWaitAllPedestrianSec;
	}
	@JsonIgnore
	public void setUpdatedPerformanceWaitAllPedestrianSec(String o) {
		this.updatedPerformanceWaitAllPedestrianSec = SimulationReport.staticSetUpdatedPerformanceWaitAllPedestrianSec(siteRequest_, o);
	}
	public static JsonArray staticSetUpdatedPerformanceWaitAllPedestrianSec(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonArray(o);
		}
		return null;
	}
	protected SimulationReport updatedPerformanceWaitAllPedestrianSecInit() {
		Wrap<JsonArray> updatedPerformanceWaitAllPedestrianSecWrap = new Wrap<JsonArray>().var("updatedPerformanceWaitAllPedestrianSec");
		if(updatedPerformanceWaitAllPedestrianSec == null) {
			_updatedPerformanceWaitAllPedestrianSec(updatedPerformanceWaitAllPedestrianSecWrap);
			setUpdatedPerformanceWaitAllPedestrianSec(updatedPerformanceWaitAllPedestrianSecWrap.o);
		}
		return (SimulationReport)this;
	}

	public static JsonArray staticSearchUpdatedPerformanceWaitAllPedestrianSec(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o;
	}

	public static String staticSearchStrUpdatedPerformanceWaitAllPedestrianSec(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUpdatedPerformanceWaitAllPedestrianSec(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrUpdatedPerformanceWaitAllPedestrianSec(siteRequest_, SimulationReport.staticSearchUpdatedPerformanceWaitAllPedestrianSec(siteRequest_, SimulationReport.staticSetUpdatedPerformanceWaitAllPedestrianSec(siteRequest_, o)));
	}

	///////////////////////////////////////////////////
	// updatedPerformanceWaitAllVehiclePedestrianSec //
	///////////////////////////////////////////////////


	/**	 The entity updatedPerformanceWaitAllVehiclePedestrianSec
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray updatedPerformanceWaitAllVehiclePedestrianSec;

	/**	<br> The entity updatedPerformanceWaitAllVehiclePedestrianSec
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport&fq=entiteVar_enUS_indexed_string:updatedPerformanceWaitAllVehiclePedestrianSec">Find the entity updatedPerformanceWaitAllVehiclePedestrianSec in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _updatedPerformanceWaitAllVehiclePedestrianSec(Wrap<JsonArray> w);

	public JsonArray getUpdatedPerformanceWaitAllVehiclePedestrianSec() {
		return updatedPerformanceWaitAllVehiclePedestrianSec;
	}

	public void setUpdatedPerformanceWaitAllVehiclePedestrianSec(JsonArray updatedPerformanceWaitAllVehiclePedestrianSec) {
		this.updatedPerformanceWaitAllVehiclePedestrianSec = updatedPerformanceWaitAllVehiclePedestrianSec;
	}
	@JsonIgnore
	public void setUpdatedPerformanceWaitAllVehiclePedestrianSec(String o) {
		this.updatedPerformanceWaitAllVehiclePedestrianSec = SimulationReport.staticSetUpdatedPerformanceWaitAllVehiclePedestrianSec(siteRequest_, o);
	}
	public static JsonArray staticSetUpdatedPerformanceWaitAllVehiclePedestrianSec(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonArray(o);
		}
		return null;
	}
	protected SimulationReport updatedPerformanceWaitAllVehiclePedestrianSecInit() {
		Wrap<JsonArray> updatedPerformanceWaitAllVehiclePedestrianSecWrap = new Wrap<JsonArray>().var("updatedPerformanceWaitAllVehiclePedestrianSec");
		if(updatedPerformanceWaitAllVehiclePedestrianSec == null) {
			_updatedPerformanceWaitAllVehiclePedestrianSec(updatedPerformanceWaitAllVehiclePedestrianSecWrap);
			setUpdatedPerformanceWaitAllVehiclePedestrianSec(updatedPerformanceWaitAllVehiclePedestrianSecWrap.o);
		}
		return (SimulationReport)this;
	}

	public static JsonArray staticSearchUpdatedPerformanceWaitAllVehiclePedestrianSec(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o;
	}

	public static String staticSearchStrUpdatedPerformanceWaitAllVehiclePedestrianSec(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUpdatedPerformanceWaitAllVehiclePedestrianSec(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReport.staticSearchStrUpdatedPerformanceWaitAllVehiclePedestrianSec(siteRequest_, SimulationReport.staticSearchUpdatedPerformanceWaitAllVehiclePedestrianSec(siteRequest_, SimulationReport.staticSetUpdatedPerformanceWaitAllVehiclePedestrianSec(siteRequest_, o)));
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
				reportNameInit();
				paramAvgVehiclePerMinFromWestToEastInit();
				paramAvgVehiclePerMinFromSouthToNorthInit();
				paramVehicleDemandScalingFactorInit();
				paramAvgPedestrianPerMinFromWestToEastInit();
				paramAvgPedestrianPerMinFromSouthToNorthInit();
				paramPedestrianDemandScalingFactorInit();
				paramLamInit();
				paramMinGreenTimeSecWestEastInit();
				paramMaxGreenTimeSecWestEastInit();
				paramMinGreenTimeSecSouthNorthInit();
				paramMaxGreenTimeSecSouthNorthInit();
				paramPedestrianWaitThresholdSecNorthSouthInit();
				paramPedestrianWaitThresholdSecWestEastInit();
				paramVehicleQueueThresholdWestEastInit();
				paramVehicleQueueThresholdSouthNorthInit();
				paramPedestrianQueueThresholdNorthSouthInit();
				paramPedestrianQueueThresholdWestEastInit();
				paramDemandScaleInit();
				paramInitialParInit();
				paramStepSizeInit();
				paramRunTimeInit();
				paramItersPerParInit();
				paramTotalIterNumInit();
				reportStatusInit();
				reportProgressInit();
				updatedParametersInit();
				updatedPerformanceInit();
				updatedPerformanceWaitWestEastVehicleSecInit();
				updatedPerformanceWaitSouthNorthVehicleSecInit();
				updatedPerformanceWaitAllVehicleSecInit();
				updatedPerformanceWaitAllPedestrianSecInit();
				updatedPerformanceWaitAllVehiclePedestrianSecInit();
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
			case "reportName":
				return oSimulationReport.reportName;
			case "paramAvgVehiclePerMinFromWestToEast":
				return oSimulationReport.paramAvgVehiclePerMinFromWestToEast;
			case "paramAvgVehiclePerMinFromSouthToNorth":
				return oSimulationReport.paramAvgVehiclePerMinFromSouthToNorth;
			case "paramVehicleDemandScalingFactor":
				return oSimulationReport.paramVehicleDemandScalingFactor;
			case "paramAvgPedestrianPerMinFromWestToEast":
				return oSimulationReport.paramAvgPedestrianPerMinFromWestToEast;
			case "paramAvgPedestrianPerMinFromSouthToNorth":
				return oSimulationReport.paramAvgPedestrianPerMinFromSouthToNorth;
			case "paramPedestrianDemandScalingFactor":
				return oSimulationReport.paramPedestrianDemandScalingFactor;
			case "paramLam":
				return oSimulationReport.paramLam;
			case "paramMinGreenTimeSecWestEast":
				return oSimulationReport.paramMinGreenTimeSecWestEast;
			case "paramMaxGreenTimeSecWestEast":
				return oSimulationReport.paramMaxGreenTimeSecWestEast;
			case "paramMinGreenTimeSecSouthNorth":
				return oSimulationReport.paramMinGreenTimeSecSouthNorth;
			case "paramMaxGreenTimeSecSouthNorth":
				return oSimulationReport.paramMaxGreenTimeSecSouthNorth;
			case "paramPedestrianWaitThresholdSecNorthSouth":
				return oSimulationReport.paramPedestrianWaitThresholdSecNorthSouth;
			case "paramPedestrianWaitThresholdSecWestEast":
				return oSimulationReport.paramPedestrianWaitThresholdSecWestEast;
			case "paramVehicleQueueThresholdWestEast":
				return oSimulationReport.paramVehicleQueueThresholdWestEast;
			case "paramVehicleQueueThresholdSouthNorth":
				return oSimulationReport.paramVehicleQueueThresholdSouthNorth;
			case "paramPedestrianQueueThresholdNorthSouth":
				return oSimulationReport.paramPedestrianQueueThresholdNorthSouth;
			case "paramPedestrianQueueThresholdWestEast":
				return oSimulationReport.paramPedestrianQueueThresholdWestEast;
			case "paramDemandScale":
				return oSimulationReport.paramDemandScale;
			case "paramInitialPar":
				return oSimulationReport.paramInitialPar;
			case "paramStepSize":
				return oSimulationReport.paramStepSize;
			case "paramRunTime":
				return oSimulationReport.paramRunTime;
			case "paramItersPerPar":
				return oSimulationReport.paramItersPerPar;
			case "paramTotalIterNum":
				return oSimulationReport.paramTotalIterNum;
			case "reportStatus":
				return oSimulationReport.reportStatus;
			case "reportProgress":
				return oSimulationReport.reportProgress;
			case "updatedParameters":
				return oSimulationReport.updatedParameters;
			case "updatedPerformance":
				return oSimulationReport.updatedPerformance;
			case "updatedPerformanceWaitWestEastVehicleSec":
				return oSimulationReport.updatedPerformanceWaitWestEastVehicleSec;
			case "updatedPerformanceWaitSouthNorthVehicleSec":
				return oSimulationReport.updatedPerformanceWaitSouthNorthVehicleSec;
			case "updatedPerformanceWaitAllVehicleSec":
				return oSimulationReport.updatedPerformanceWaitAllVehicleSec;
			case "updatedPerformanceWaitAllPedestrianSec":
				return oSimulationReport.updatedPerformanceWaitAllPedestrianSec;
			case "updatedPerformanceWaitAllVehiclePedestrianSec":
				return oSimulationReport.updatedPerformanceWaitAllVehiclePedestrianSec;
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
		case "reportName":
			return SimulationReport.staticSetReportName(siteRequest_, o);
		case "paramAvgVehiclePerMinFromWestToEast":
			return SimulationReport.staticSetParamAvgVehiclePerMinFromWestToEast(siteRequest_, o);
		case "paramAvgVehiclePerMinFromSouthToNorth":
			return SimulationReport.staticSetParamAvgVehiclePerMinFromSouthToNorth(siteRequest_, o);
		case "paramVehicleDemandScalingFactor":
			return SimulationReport.staticSetParamVehicleDemandScalingFactor(siteRequest_, o);
		case "paramAvgPedestrianPerMinFromWestToEast":
			return SimulationReport.staticSetParamAvgPedestrianPerMinFromWestToEast(siteRequest_, o);
		case "paramAvgPedestrianPerMinFromSouthToNorth":
			return SimulationReport.staticSetParamAvgPedestrianPerMinFromSouthToNorth(siteRequest_, o);
		case "paramPedestrianDemandScalingFactor":
			return SimulationReport.staticSetParamPedestrianDemandScalingFactor(siteRequest_, o);
		case "paramLam":
			return SimulationReport.staticSetParamLam(siteRequest_, o);
		case "paramMinGreenTimeSecWestEast":
			return SimulationReport.staticSetParamMinGreenTimeSecWestEast(siteRequest_, o);
		case "paramMaxGreenTimeSecWestEast":
			return SimulationReport.staticSetParamMaxGreenTimeSecWestEast(siteRequest_, o);
		case "paramMinGreenTimeSecSouthNorth":
			return SimulationReport.staticSetParamMinGreenTimeSecSouthNorth(siteRequest_, o);
		case "paramMaxGreenTimeSecSouthNorth":
			return SimulationReport.staticSetParamMaxGreenTimeSecSouthNorth(siteRequest_, o);
		case "paramPedestrianWaitThresholdSecNorthSouth":
			return SimulationReport.staticSetParamPedestrianWaitThresholdSecNorthSouth(siteRequest_, o);
		case "paramPedestrianWaitThresholdSecWestEast":
			return SimulationReport.staticSetParamPedestrianWaitThresholdSecWestEast(siteRequest_, o);
		case "paramVehicleQueueThresholdWestEast":
			return SimulationReport.staticSetParamVehicleQueueThresholdWestEast(siteRequest_, o);
		case "paramVehicleQueueThresholdSouthNorth":
			return SimulationReport.staticSetParamVehicleQueueThresholdSouthNorth(siteRequest_, o);
		case "paramPedestrianQueueThresholdNorthSouth":
			return SimulationReport.staticSetParamPedestrianQueueThresholdNorthSouth(siteRequest_, o);
		case "paramPedestrianQueueThresholdWestEast":
			return SimulationReport.staticSetParamPedestrianQueueThresholdWestEast(siteRequest_, o);
		case "paramDemandScale":
			return SimulationReport.staticSetParamDemandScale(siteRequest_, o);
		case "paramInitialPar":
			return SimulationReport.staticSetParamInitialPar(siteRequest_, o);
		case "paramStepSize":
			return SimulationReport.staticSetParamStepSize(siteRequest_, o);
		case "paramRunTime":
			return SimulationReport.staticSetParamRunTime(siteRequest_, o);
		case "paramItersPerPar":
			return SimulationReport.staticSetParamItersPerPar(siteRequest_, o);
		case "paramTotalIterNum":
			return SimulationReport.staticSetParamTotalIterNum(siteRequest_, o);
		case "reportStatus":
			return SimulationReport.staticSetReportStatus(siteRequest_, o);
		case "reportProgress":
			return SimulationReport.staticSetReportProgress(siteRequest_, o);
		case "updatedParameters":
			return SimulationReport.staticSetUpdatedParameters(siteRequest_, o);
		case "updatedPerformance":
			return SimulationReport.staticSetUpdatedPerformance(siteRequest_, o);
		case "updatedPerformanceWaitWestEastVehicleSec":
			return SimulationReport.staticSetUpdatedPerformanceWaitWestEastVehicleSec(siteRequest_, o);
		case "updatedPerformanceWaitSouthNorthVehicleSec":
			return SimulationReport.staticSetUpdatedPerformanceWaitSouthNorthVehicleSec(siteRequest_, o);
		case "updatedPerformanceWaitAllVehicleSec":
			return SimulationReport.staticSetUpdatedPerformanceWaitAllVehicleSec(siteRequest_, o);
		case "updatedPerformanceWaitAllPedestrianSec":
			return SimulationReport.staticSetUpdatedPerformanceWaitAllPedestrianSec(siteRequest_, o);
		case "updatedPerformanceWaitAllVehiclePedestrianSec":
			return SimulationReport.staticSetUpdatedPerformanceWaitAllVehiclePedestrianSec(siteRequest_, o);
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
		case "reportName":
			return SimulationReport.staticSearchReportName(siteRequest_, (String)o);
		case "paramAvgVehiclePerMinFromWestToEast":
			return SimulationReport.staticSearchParamAvgVehiclePerMinFromWestToEast(siteRequest_, (BigDecimal)o);
		case "paramAvgVehiclePerMinFromSouthToNorth":
			return SimulationReport.staticSearchParamAvgVehiclePerMinFromSouthToNorth(siteRequest_, (BigDecimal)o);
		case "paramVehicleDemandScalingFactor":
			return SimulationReport.staticSearchParamVehicleDemandScalingFactor(siteRequest_, (BigDecimal)o);
		case "paramAvgPedestrianPerMinFromWestToEast":
			return SimulationReport.staticSearchParamAvgPedestrianPerMinFromWestToEast(siteRequest_, (BigDecimal)o);
		case "paramAvgPedestrianPerMinFromSouthToNorth":
			return SimulationReport.staticSearchParamAvgPedestrianPerMinFromSouthToNorth(siteRequest_, (BigDecimal)o);
		case "paramPedestrianDemandScalingFactor":
			return SimulationReport.staticSearchParamPedestrianDemandScalingFactor(siteRequest_, (BigDecimal)o);
		case "paramLam":
			return SimulationReport.staticSearchParamLam(siteRequest_, (BigDecimal)o);
		case "paramMinGreenTimeSecWestEast":
			return SimulationReport.staticSearchParamMinGreenTimeSecWestEast(siteRequest_, (BigDecimal)o);
		case "paramMaxGreenTimeSecWestEast":
			return SimulationReport.staticSearchParamMaxGreenTimeSecWestEast(siteRequest_, (BigDecimal)o);
		case "paramMinGreenTimeSecSouthNorth":
			return SimulationReport.staticSearchParamMinGreenTimeSecSouthNorth(siteRequest_, (BigDecimal)o);
		case "paramMaxGreenTimeSecSouthNorth":
			return SimulationReport.staticSearchParamMaxGreenTimeSecSouthNorth(siteRequest_, (BigDecimal)o);
		case "paramPedestrianWaitThresholdSecNorthSouth":
			return SimulationReport.staticSearchParamPedestrianWaitThresholdSecNorthSouth(siteRequest_, (BigDecimal)o);
		case "paramPedestrianWaitThresholdSecWestEast":
			return SimulationReport.staticSearchParamPedestrianWaitThresholdSecWestEast(siteRequest_, (BigDecimal)o);
		case "paramVehicleQueueThresholdWestEast":
			return SimulationReport.staticSearchParamVehicleQueueThresholdWestEast(siteRequest_, (BigDecimal)o);
		case "paramVehicleQueueThresholdSouthNorth":
			return SimulationReport.staticSearchParamVehicleQueueThresholdSouthNorth(siteRequest_, (BigDecimal)o);
		case "paramPedestrianQueueThresholdNorthSouth":
			return SimulationReport.staticSearchParamPedestrianQueueThresholdNorthSouth(siteRequest_, (BigDecimal)o);
		case "paramPedestrianQueueThresholdWestEast":
			return SimulationReport.staticSearchParamPedestrianQueueThresholdWestEast(siteRequest_, (BigDecimal)o);
		case "paramDemandScale":
			return SimulationReport.staticSearchParamDemandScale(siteRequest_, (BigDecimal)o);
		case "paramInitialPar":
			return SimulationReport.staticSearchParamInitialPar(siteRequest_, (BigDecimal)o);
		case "paramStepSize":
			return SimulationReport.staticSearchParamStepSize(siteRequest_, (BigDecimal)o);
		case "paramRunTime":
			return SimulationReport.staticSearchParamRunTime(siteRequest_, (Integer)o);
		case "paramItersPerPar":
			return SimulationReport.staticSearchParamItersPerPar(siteRequest_, (Integer)o);
		case "paramTotalIterNum":
			return SimulationReport.staticSearchParamTotalIterNum(siteRequest_, (Integer)o);
		case "reportStatus":
			return SimulationReport.staticSearchReportStatus(siteRequest_, (String)o);
		case "reportProgress":
			return SimulationReport.staticSearchReportProgress(siteRequest_, (Integer)o);
		case "updatedParameters":
			return SimulationReport.staticSearchUpdatedParameters(siteRequest_, (JsonArray)o);
		case "updatedPerformance":
			return SimulationReport.staticSearchUpdatedPerformance(siteRequest_, (JsonArray)o);
		case "updatedPerformanceWaitWestEastVehicleSec":
			return SimulationReport.staticSearchUpdatedPerformanceWaitWestEastVehicleSec(siteRequest_, (JsonArray)o);
		case "updatedPerformanceWaitSouthNorthVehicleSec":
			return SimulationReport.staticSearchUpdatedPerformanceWaitSouthNorthVehicleSec(siteRequest_, (JsonArray)o);
		case "updatedPerformanceWaitAllVehicleSec":
			return SimulationReport.staticSearchUpdatedPerformanceWaitAllVehicleSec(siteRequest_, (JsonArray)o);
		case "updatedPerformanceWaitAllPedestrianSec":
			return SimulationReport.staticSearchUpdatedPerformanceWaitAllPedestrianSec(siteRequest_, (JsonArray)o);
		case "updatedPerformanceWaitAllVehiclePedestrianSec":
			return SimulationReport.staticSearchUpdatedPerformanceWaitAllVehiclePedestrianSec(siteRequest_, (JsonArray)o);
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
		case "reportName":
			return SimulationReport.staticSearchStrReportName(siteRequest_, (String)o);
		case "paramAvgVehiclePerMinFromWestToEast":
			return SimulationReport.staticSearchStrParamAvgVehiclePerMinFromWestToEast(siteRequest_, (Double)o);
		case "paramAvgVehiclePerMinFromSouthToNorth":
			return SimulationReport.staticSearchStrParamAvgVehiclePerMinFromSouthToNorth(siteRequest_, (Double)o);
		case "paramVehicleDemandScalingFactor":
			return SimulationReport.staticSearchStrParamVehicleDemandScalingFactor(siteRequest_, (Double)o);
		case "paramAvgPedestrianPerMinFromWestToEast":
			return SimulationReport.staticSearchStrParamAvgPedestrianPerMinFromWestToEast(siteRequest_, (Double)o);
		case "paramAvgPedestrianPerMinFromSouthToNorth":
			return SimulationReport.staticSearchStrParamAvgPedestrianPerMinFromSouthToNorth(siteRequest_, (Double)o);
		case "paramPedestrianDemandScalingFactor":
			return SimulationReport.staticSearchStrParamPedestrianDemandScalingFactor(siteRequest_, (Double)o);
		case "paramLam":
			return SimulationReport.staticSearchStrParamLam(siteRequest_, (BigDecimal)o);
		case "paramMinGreenTimeSecWestEast":
			return SimulationReport.staticSearchStrParamMinGreenTimeSecWestEast(siteRequest_, (Double)o);
		case "paramMaxGreenTimeSecWestEast":
			return SimulationReport.staticSearchStrParamMaxGreenTimeSecWestEast(siteRequest_, (Double)o);
		case "paramMinGreenTimeSecSouthNorth":
			return SimulationReport.staticSearchStrParamMinGreenTimeSecSouthNorth(siteRequest_, (Double)o);
		case "paramMaxGreenTimeSecSouthNorth":
			return SimulationReport.staticSearchStrParamMaxGreenTimeSecSouthNorth(siteRequest_, (Double)o);
		case "paramPedestrianWaitThresholdSecNorthSouth":
			return SimulationReport.staticSearchStrParamPedestrianWaitThresholdSecNorthSouth(siteRequest_, (Double)o);
		case "paramPedestrianWaitThresholdSecWestEast":
			return SimulationReport.staticSearchStrParamPedestrianWaitThresholdSecWestEast(siteRequest_, (Double)o);
		case "paramVehicleQueueThresholdWestEast":
			return SimulationReport.staticSearchStrParamVehicleQueueThresholdWestEast(siteRequest_, (Double)o);
		case "paramVehicleQueueThresholdSouthNorth":
			return SimulationReport.staticSearchStrParamVehicleQueueThresholdSouthNorth(siteRequest_, (Double)o);
		case "paramPedestrianQueueThresholdNorthSouth":
			return SimulationReport.staticSearchStrParamPedestrianQueueThresholdNorthSouth(siteRequest_, (Double)o);
		case "paramPedestrianQueueThresholdWestEast":
			return SimulationReport.staticSearchStrParamPedestrianQueueThresholdWestEast(siteRequest_, (Double)o);
		case "paramDemandScale":
			return SimulationReport.staticSearchStrParamDemandScale(siteRequest_, (BigDecimal)o);
		case "paramInitialPar":
			return SimulationReport.staticSearchStrParamInitialPar(siteRequest_, (BigDecimal)o);
		case "paramStepSize":
			return SimulationReport.staticSearchStrParamStepSize(siteRequest_, (Double)o);
		case "paramRunTime":
			return SimulationReport.staticSearchStrParamRunTime(siteRequest_, (Integer)o);
		case "paramItersPerPar":
			return SimulationReport.staticSearchStrParamItersPerPar(siteRequest_, (Integer)o);
		case "paramTotalIterNum":
			return SimulationReport.staticSearchStrParamTotalIterNum(siteRequest_, (Integer)o);
		case "reportStatus":
			return SimulationReport.staticSearchStrReportStatus(siteRequest_, (String)o);
		case "reportProgress":
			return SimulationReport.staticSearchStrReportProgress(siteRequest_, (Integer)o);
		case "updatedParameters":
			return SimulationReport.staticSearchStrUpdatedParameters(siteRequest_, (JsonArray)o);
		case "updatedPerformance":
			return SimulationReport.staticSearchStrUpdatedPerformance(siteRequest_, (JsonArray)o);
		case "updatedPerformanceWaitWestEastVehicleSec":
			return SimulationReport.staticSearchStrUpdatedPerformanceWaitWestEastVehicleSec(siteRequest_, (JsonArray)o);
		case "updatedPerformanceWaitSouthNorthVehicleSec":
			return SimulationReport.staticSearchStrUpdatedPerformanceWaitSouthNorthVehicleSec(siteRequest_, (JsonArray)o);
		case "updatedPerformanceWaitAllVehicleSec":
			return SimulationReport.staticSearchStrUpdatedPerformanceWaitAllVehicleSec(siteRequest_, (JsonArray)o);
		case "updatedPerformanceWaitAllPedestrianSec":
			return SimulationReport.staticSearchStrUpdatedPerformanceWaitAllPedestrianSec(siteRequest_, (JsonArray)o);
		case "updatedPerformanceWaitAllVehiclePedestrianSec":
			return SimulationReport.staticSearchStrUpdatedPerformanceWaitAllVehiclePedestrianSec(siteRequest_, (JsonArray)o);
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
		case "reportName":
			return SimulationReport.staticSearchFqReportName(siteRequest_, o);
		case "paramAvgVehiclePerMinFromWestToEast":
			return SimulationReport.staticSearchFqParamAvgVehiclePerMinFromWestToEast(siteRequest_, o);
		case "paramAvgVehiclePerMinFromSouthToNorth":
			return SimulationReport.staticSearchFqParamAvgVehiclePerMinFromSouthToNorth(siteRequest_, o);
		case "paramVehicleDemandScalingFactor":
			return SimulationReport.staticSearchFqParamVehicleDemandScalingFactor(siteRequest_, o);
		case "paramAvgPedestrianPerMinFromWestToEast":
			return SimulationReport.staticSearchFqParamAvgPedestrianPerMinFromWestToEast(siteRequest_, o);
		case "paramAvgPedestrianPerMinFromSouthToNorth":
			return SimulationReport.staticSearchFqParamAvgPedestrianPerMinFromSouthToNorth(siteRequest_, o);
		case "paramPedestrianDemandScalingFactor":
			return SimulationReport.staticSearchFqParamPedestrianDemandScalingFactor(siteRequest_, o);
		case "paramLam":
			return SimulationReport.staticSearchFqParamLam(siteRequest_, o);
		case "paramMinGreenTimeSecWestEast":
			return SimulationReport.staticSearchFqParamMinGreenTimeSecWestEast(siteRequest_, o);
		case "paramMaxGreenTimeSecWestEast":
			return SimulationReport.staticSearchFqParamMaxGreenTimeSecWestEast(siteRequest_, o);
		case "paramMinGreenTimeSecSouthNorth":
			return SimulationReport.staticSearchFqParamMinGreenTimeSecSouthNorth(siteRequest_, o);
		case "paramMaxGreenTimeSecSouthNorth":
			return SimulationReport.staticSearchFqParamMaxGreenTimeSecSouthNorth(siteRequest_, o);
		case "paramPedestrianWaitThresholdSecNorthSouth":
			return SimulationReport.staticSearchFqParamPedestrianWaitThresholdSecNorthSouth(siteRequest_, o);
		case "paramPedestrianWaitThresholdSecWestEast":
			return SimulationReport.staticSearchFqParamPedestrianWaitThresholdSecWestEast(siteRequest_, o);
		case "paramVehicleQueueThresholdWestEast":
			return SimulationReport.staticSearchFqParamVehicleQueueThresholdWestEast(siteRequest_, o);
		case "paramVehicleQueueThresholdSouthNorth":
			return SimulationReport.staticSearchFqParamVehicleQueueThresholdSouthNorth(siteRequest_, o);
		case "paramPedestrianQueueThresholdNorthSouth":
			return SimulationReport.staticSearchFqParamPedestrianQueueThresholdNorthSouth(siteRequest_, o);
		case "paramPedestrianQueueThresholdWestEast":
			return SimulationReport.staticSearchFqParamPedestrianQueueThresholdWestEast(siteRequest_, o);
		case "paramDemandScale":
			return SimulationReport.staticSearchFqParamDemandScale(siteRequest_, o);
		case "paramInitialPar":
			return SimulationReport.staticSearchFqParamInitialPar(siteRequest_, o);
		case "paramStepSize":
			return SimulationReport.staticSearchFqParamStepSize(siteRequest_, o);
		case "paramRunTime":
			return SimulationReport.staticSearchFqParamRunTime(siteRequest_, o);
		case "paramItersPerPar":
			return SimulationReport.staticSearchFqParamItersPerPar(siteRequest_, o);
		case "paramTotalIterNum":
			return SimulationReport.staticSearchFqParamTotalIterNum(siteRequest_, o);
		case "reportStatus":
			return SimulationReport.staticSearchFqReportStatus(siteRequest_, o);
		case "reportProgress":
			return SimulationReport.staticSearchFqReportProgress(siteRequest_, o);
		case "updatedParameters":
			return SimulationReport.staticSearchFqUpdatedParameters(siteRequest_, o);
		case "updatedPerformance":
			return SimulationReport.staticSearchFqUpdatedPerformance(siteRequest_, o);
		case "updatedPerformanceWaitWestEastVehicleSec":
			return SimulationReport.staticSearchFqUpdatedPerformanceWaitWestEastVehicleSec(siteRequest_, o);
		case "updatedPerformanceWaitSouthNorthVehicleSec":
			return SimulationReport.staticSearchFqUpdatedPerformanceWaitSouthNorthVehicleSec(siteRequest_, o);
		case "updatedPerformanceWaitAllVehicleSec":
			return SimulationReport.staticSearchFqUpdatedPerformanceWaitAllVehicleSec(siteRequest_, o);
		case "updatedPerformanceWaitAllPedestrianSec":
			return SimulationReport.staticSearchFqUpdatedPerformanceWaitAllPedestrianSec(siteRequest_, o);
		case "updatedPerformanceWaitAllVehiclePedestrianSec":
			return SimulationReport.staticSearchFqUpdatedPerformanceWaitAllVehiclePedestrianSec(siteRequest_, o);
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
			} else if("reportname".equals(varLower)) {
				if(val instanceof String) {
					setReportName((String)val);
				}
				saves.add("reportName");
				return val;
			} else if("paramavgvehicleperminfromwesttoeast".equals(varLower)) {
				if(val instanceof String) {
					setParamAvgVehiclePerMinFromWestToEast((String)val);
				} else if(val instanceof Number) {
					setParamAvgVehiclePerMinFromWestToEast(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramAvgVehiclePerMinFromWestToEast");
				return val;
			} else if("paramavgvehicleperminfromsouthtonorth".equals(varLower)) {
				if(val instanceof String) {
					setParamAvgVehiclePerMinFromSouthToNorth((String)val);
				} else if(val instanceof Number) {
					setParamAvgVehiclePerMinFromSouthToNorth(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramAvgVehiclePerMinFromSouthToNorth");
				return val;
			} else if("paramvehicledemandscalingfactor".equals(varLower)) {
				if(val instanceof String) {
					setParamVehicleDemandScalingFactor((String)val);
				} else if(val instanceof Number) {
					setParamVehicleDemandScalingFactor(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramVehicleDemandScalingFactor");
				return val;
			} else if("paramavgpedestrianperminfromwesttoeast".equals(varLower)) {
				if(val instanceof String) {
					setParamAvgPedestrianPerMinFromWestToEast((String)val);
				} else if(val instanceof Number) {
					setParamAvgPedestrianPerMinFromWestToEast(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramAvgPedestrianPerMinFromWestToEast");
				return val;
			} else if("paramavgpedestrianperminfromsouthtonorth".equals(varLower)) {
				if(val instanceof String) {
					setParamAvgPedestrianPerMinFromSouthToNorth((String)val);
				} else if(val instanceof Number) {
					setParamAvgPedestrianPerMinFromSouthToNorth(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramAvgPedestrianPerMinFromSouthToNorth");
				return val;
			} else if("parampedestriandemandscalingfactor".equals(varLower)) {
				if(val instanceof String) {
					setParamPedestrianDemandScalingFactor((String)val);
				} else if(val instanceof Number) {
					setParamPedestrianDemandScalingFactor(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramPedestrianDemandScalingFactor");
				return val;
			} else if("parammingreentimesecwesteast".equals(varLower)) {
				if(val instanceof String) {
					setParamMinGreenTimeSecWestEast((String)val);
				} else if(val instanceof Number) {
					setParamMinGreenTimeSecWestEast(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramMinGreenTimeSecWestEast");
				return val;
			} else if("parammaxgreentimesecwesteast".equals(varLower)) {
				if(val instanceof String) {
					setParamMaxGreenTimeSecWestEast((String)val);
				} else if(val instanceof Number) {
					setParamMaxGreenTimeSecWestEast(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramMaxGreenTimeSecWestEast");
				return val;
			} else if("parammingreentimesecsouthnorth".equals(varLower)) {
				if(val instanceof String) {
					setParamMinGreenTimeSecSouthNorth((String)val);
				} else if(val instanceof Number) {
					setParamMinGreenTimeSecSouthNorth(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramMinGreenTimeSecSouthNorth");
				return val;
			} else if("parammaxgreentimesecsouthnorth".equals(varLower)) {
				if(val instanceof String) {
					setParamMaxGreenTimeSecSouthNorth((String)val);
				} else if(val instanceof Number) {
					setParamMaxGreenTimeSecSouthNorth(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramMaxGreenTimeSecSouthNorth");
				return val;
			} else if("parampedestrianwaitthresholdsecnorthsouth".equals(varLower)) {
				if(val instanceof String) {
					setParamPedestrianWaitThresholdSecNorthSouth((String)val);
				} else if(val instanceof Number) {
					setParamPedestrianWaitThresholdSecNorthSouth(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramPedestrianWaitThresholdSecNorthSouth");
				return val;
			} else if("parampedestrianwaitthresholdsecwesteast".equals(varLower)) {
				if(val instanceof String) {
					setParamPedestrianWaitThresholdSecWestEast((String)val);
				} else if(val instanceof Number) {
					setParamPedestrianWaitThresholdSecWestEast(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramPedestrianWaitThresholdSecWestEast");
				return val;
			} else if("paramvehiclequeuethresholdwesteast".equals(varLower)) {
				if(val instanceof String) {
					setParamVehicleQueueThresholdWestEast((String)val);
				} else if(val instanceof Number) {
					setParamVehicleQueueThresholdWestEast(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramVehicleQueueThresholdWestEast");
				return val;
			} else if("paramvehiclequeuethresholdsouthnorth".equals(varLower)) {
				if(val instanceof String) {
					setParamVehicleQueueThresholdSouthNorth((String)val);
				} else if(val instanceof Number) {
					setParamVehicleQueueThresholdSouthNorth(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramVehicleQueueThresholdSouthNorth");
				return val;
			} else if("parampedestrianqueuethresholdnorthsouth".equals(varLower)) {
				if(val instanceof String) {
					setParamPedestrianQueueThresholdNorthSouth((String)val);
				} else if(val instanceof Number) {
					setParamPedestrianQueueThresholdNorthSouth(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramPedestrianQueueThresholdNorthSouth");
				return val;
			} else if("parampedestrianqueuethresholdwesteast".equals(varLower)) {
				if(val instanceof String) {
					setParamPedestrianQueueThresholdWestEast((String)val);
				} else if(val instanceof Number) {
					setParamPedestrianQueueThresholdWestEast(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramPedestrianQueueThresholdWestEast");
				return val;
			} else if("paramdemandscale".equals(varLower)) {
				if(val instanceof List<?>) {
					((List<BigDecimal>)val).stream().forEach(v -> addParamDemandScale(v));
				} else if(val instanceof JsonArray) {
					((JsonArray)val).stream().forEach(v -> setParamDemandScale(v.toString()));
				} else if(val instanceof BigDecimal[]) {
					Arrays.asList((BigDecimal[])val).stream().forEach(v -> setParamDemandScale((BigDecimal)v));
				} else if(val instanceof Number[]) {
					Arrays.asList((Number[])val).stream().forEach(v -> setParamDemandScale((Number)v));
				}
				if(!saves.contains("paramDemandScale")) {
					saves.add("paramDemandScale");
				}
				return val;
			} else if("paramstepsize".equals(varLower)) {
				if(val instanceof String) {
					setParamStepSize((String)val);
				} else if(val instanceof Number) {
					setParamStepSize(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramStepSize");
				return val;
			} else if("paramruntime".equals(varLower)) {
				if(val instanceof Integer) {
					setParamRunTime((Integer)val);
				} else {
					setParamRunTime(val == null ? null : val.toString());
				}
				saves.add("paramRunTime");
				return val;
			} else if("paramitersperpar".equals(varLower)) {
				if(val instanceof Integer) {
					setParamItersPerPar((Integer)val);
				} else {
					setParamItersPerPar(val == null ? null : val.toString());
				}
				saves.add("paramItersPerPar");
				return val;
			} else if("paramtotaliternum".equals(varLower)) {
				if(val instanceof Integer) {
					setParamTotalIterNum((Integer)val);
				} else {
					setParamTotalIterNum(val == null ? null : val.toString());
				}
				saves.add("paramTotalIterNum");
				return val;
			} else if("reportstatus".equals(varLower)) {
				if(val instanceof String) {
					setReportStatus((String)val);
				}
				saves.add("reportStatus");
				return val;
			} else if("reportprogress".equals(varLower)) {
				if(val instanceof Integer) {
					setReportProgress((Integer)val);
				} else {
					setReportProgress(val == null ? null : val.toString());
				}
				saves.add("reportProgress");
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
		if(reportName != null) {
			doc.put("reportName_docvalues_string", reportName);
		}
		if(paramAvgVehiclePerMinFromWestToEast != null) {
			doc.put("paramAvgVehiclePerMinFromWestToEast_docvalues_double", paramAvgVehiclePerMinFromWestToEast.doubleValue());
		}
		if(paramAvgVehiclePerMinFromSouthToNorth != null) {
			doc.put("paramAvgVehiclePerMinFromSouthToNorth_docvalues_double", paramAvgVehiclePerMinFromSouthToNorth.doubleValue());
		}
		if(paramVehicleDemandScalingFactor != null) {
			doc.put("paramVehicleDemandScalingFactor_docvalues_double", paramVehicleDemandScalingFactor.doubleValue());
		}
		if(paramAvgPedestrianPerMinFromWestToEast != null) {
			doc.put("paramAvgPedestrianPerMinFromWestToEast_docvalues_double", paramAvgPedestrianPerMinFromWestToEast.doubleValue());
		}
		if(paramAvgPedestrianPerMinFromSouthToNorth != null) {
			doc.put("paramAvgPedestrianPerMinFromSouthToNorth_docvalues_double", paramAvgPedestrianPerMinFromSouthToNorth.doubleValue());
		}
		if(paramPedestrianDemandScalingFactor != null) {
			doc.put("paramPedestrianDemandScalingFactor_docvalues_double", paramPedestrianDemandScalingFactor.doubleValue());
		}
		if(paramLam != null) {
			JsonArray l = new JsonArray();
			doc.put("paramLam_docvalues_doubles", l);
			for(BigDecimal o : paramLam) {
				l.add(o);
			}
		}
		if(paramMinGreenTimeSecWestEast != null) {
			doc.put("paramMinGreenTimeSecWestEast_docvalues_double", paramMinGreenTimeSecWestEast.doubleValue());
		}
		if(paramMaxGreenTimeSecWestEast != null) {
			doc.put("paramMaxGreenTimeSecWestEast_docvalues_double", paramMaxGreenTimeSecWestEast.doubleValue());
		}
		if(paramMinGreenTimeSecSouthNorth != null) {
			doc.put("paramMinGreenTimeSecSouthNorth_docvalues_double", paramMinGreenTimeSecSouthNorth.doubleValue());
		}
		if(paramMaxGreenTimeSecSouthNorth != null) {
			doc.put("paramMaxGreenTimeSecSouthNorth_docvalues_double", paramMaxGreenTimeSecSouthNorth.doubleValue());
		}
		if(paramPedestrianWaitThresholdSecNorthSouth != null) {
			doc.put("paramPedestrianWaitThresholdSecNorthSouth_docvalues_double", paramPedestrianWaitThresholdSecNorthSouth.doubleValue());
		}
		if(paramPedestrianWaitThresholdSecWestEast != null) {
			doc.put("paramPedestrianWaitThresholdSecWestEast_docvalues_double", paramPedestrianWaitThresholdSecWestEast.doubleValue());
		}
		if(paramVehicleQueueThresholdWestEast != null) {
			doc.put("paramVehicleQueueThresholdWestEast_docvalues_double", paramVehicleQueueThresholdWestEast.doubleValue());
		}
		if(paramVehicleQueueThresholdSouthNorth != null) {
			doc.put("paramVehicleQueueThresholdSouthNorth_docvalues_double", paramVehicleQueueThresholdSouthNorth.doubleValue());
		}
		if(paramPedestrianQueueThresholdNorthSouth != null) {
			doc.put("paramPedestrianQueueThresholdNorthSouth_docvalues_double", paramPedestrianQueueThresholdNorthSouth.doubleValue());
		}
		if(paramPedestrianQueueThresholdWestEast != null) {
			doc.put("paramPedestrianQueueThresholdWestEast_docvalues_double", paramPedestrianQueueThresholdWestEast.doubleValue());
		}
		if(paramDemandScale != null) {
			JsonArray l = new JsonArray();
			doc.put("paramDemandScale_docvalues_doubles", l);
			for(BigDecimal o : paramDemandScale) {
				l.add(o);
			}
		}
		if(paramInitialPar != null) {
			JsonArray l = new JsonArray();
			doc.put("paramInitialPar_docvalues_doubles", l);
			for(BigDecimal o : paramInitialPar) {
				l.add(o);
			}
		}
		if(paramStepSize != null) {
			doc.put("paramStepSize_docvalues_double", paramStepSize.doubleValue());
		}
		if(paramRunTime != null) {
			doc.put("paramRunTime_docvalues_int", paramRunTime);
		}
		if(paramItersPerPar != null) {
			doc.put("paramItersPerPar_docvalues_int", paramItersPerPar);
		}
		if(paramTotalIterNum != null) {
			doc.put("paramTotalIterNum_docvalues_int", paramTotalIterNum);
		}
		if(reportStatus != null) {
			doc.put("reportStatus_docvalues_string", reportStatus);
		}
		if(reportProgress != null) {
			doc.put("reportProgress_docvalues_int", reportProgress);
		}
		if(updatedParameters != null) {
			doc.put("updatedParameters_docvalues_string", updatedParameters.toString());
		}
		if(updatedPerformance != null) {
			doc.put("updatedPerformance_docvalues_string", updatedPerformance.toString());
		}
		if(updatedPerformanceWaitWestEastVehicleSec != null) {
			doc.put("updatedPerformanceWaitWestEastVehicleSec_docvalues_string", updatedPerformanceWaitWestEastVehicleSec.toString());
		}
		if(updatedPerformanceWaitSouthNorthVehicleSec != null) {
			doc.put("updatedPerformanceWaitSouthNorthVehicleSec_docvalues_string", updatedPerformanceWaitSouthNorthVehicleSec.toString());
		}
		if(updatedPerformanceWaitAllVehicleSec != null) {
			doc.put("updatedPerformanceWaitAllVehicleSec_docvalues_string", updatedPerformanceWaitAllVehicleSec.toString());
		}
		if(updatedPerformanceWaitAllPedestrianSec != null) {
			doc.put("updatedPerformanceWaitAllPedestrianSec_docvalues_string", updatedPerformanceWaitAllPedestrianSec.toString());
		}
		if(updatedPerformanceWaitAllVehiclePedestrianSec != null) {
			doc.put("updatedPerformanceWaitAllVehiclePedestrianSec_docvalues_string", updatedPerformanceWaitAllVehiclePedestrianSec.toString());
		}
		super.indexBaseModel(doc);

	}

	public static String varStoredSimulationReport(String entityVar) {
		switch(entityVar) {
			case "simulationKey":
				return "simulationKey_docvalues_long";
			case "simulationName":
				return "simulationName_docvalues_string";
			case "reportName":
				return "reportName_docvalues_string";
			case "paramAvgVehiclePerMinFromWestToEast":
				return "paramAvgVehiclePerMinFromWestToEast_docvalues_double";
			case "paramAvgVehiclePerMinFromSouthToNorth":
				return "paramAvgVehiclePerMinFromSouthToNorth_docvalues_double";
			case "paramVehicleDemandScalingFactor":
				return "paramVehicleDemandScalingFactor_docvalues_double";
			case "paramAvgPedestrianPerMinFromWestToEast":
				return "paramAvgPedestrianPerMinFromWestToEast_docvalues_double";
			case "paramAvgPedestrianPerMinFromSouthToNorth":
				return "paramAvgPedestrianPerMinFromSouthToNorth_docvalues_double";
			case "paramPedestrianDemandScalingFactor":
				return "paramPedestrianDemandScalingFactor_docvalues_double";
			case "paramLam":
				return "paramLam_docvalues_doubles";
			case "paramMinGreenTimeSecWestEast":
				return "paramMinGreenTimeSecWestEast_docvalues_double";
			case "paramMaxGreenTimeSecWestEast":
				return "paramMaxGreenTimeSecWestEast_docvalues_double";
			case "paramMinGreenTimeSecSouthNorth":
				return "paramMinGreenTimeSecSouthNorth_docvalues_double";
			case "paramMaxGreenTimeSecSouthNorth":
				return "paramMaxGreenTimeSecSouthNorth_docvalues_double";
			case "paramPedestrianWaitThresholdSecNorthSouth":
				return "paramPedestrianWaitThresholdSecNorthSouth_docvalues_double";
			case "paramPedestrianWaitThresholdSecWestEast":
				return "paramPedestrianWaitThresholdSecWestEast_docvalues_double";
			case "paramVehicleQueueThresholdWestEast":
				return "paramVehicleQueueThresholdWestEast_docvalues_double";
			case "paramVehicleQueueThresholdSouthNorth":
				return "paramVehicleQueueThresholdSouthNorth_docvalues_double";
			case "paramPedestrianQueueThresholdNorthSouth":
				return "paramPedestrianQueueThresholdNorthSouth_docvalues_double";
			case "paramPedestrianQueueThresholdWestEast":
				return "paramPedestrianQueueThresholdWestEast_docvalues_double";
			case "paramDemandScale":
				return "paramDemandScale_docvalues_doubles";
			case "paramInitialPar":
				return "paramInitialPar_docvalues_doubles";
			case "paramStepSize":
				return "paramStepSize_docvalues_double";
			case "paramRunTime":
				return "paramRunTime_docvalues_int";
			case "paramItersPerPar":
				return "paramItersPerPar_docvalues_int";
			case "paramTotalIterNum":
				return "paramTotalIterNum_docvalues_int";
			case "reportStatus":
				return "reportStatus_docvalues_string";
			case "reportProgress":
				return "reportProgress_docvalues_int";
			case "updatedParameters":
				return "updatedParameters_docvalues_string";
			case "updatedPerformance":
				return "updatedPerformance_docvalues_string";
			case "updatedPerformanceWaitWestEastVehicleSec":
				return "updatedPerformanceWaitWestEastVehicleSec_docvalues_string";
			case "updatedPerformanceWaitSouthNorthVehicleSec":
				return "updatedPerformanceWaitSouthNorthVehicleSec_docvalues_string";
			case "updatedPerformanceWaitAllVehicleSec":
				return "updatedPerformanceWaitAllVehicleSec_docvalues_string";
			case "updatedPerformanceWaitAllPedestrianSec":
				return "updatedPerformanceWaitAllPedestrianSec_docvalues_string";
			case "updatedPerformanceWaitAllVehiclePedestrianSec":
				return "updatedPerformanceWaitAllVehiclePedestrianSec_docvalues_string";
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
			case "reportName":
				return "reportName_docvalues_string";
			case "paramAvgVehiclePerMinFromWestToEast":
				return "paramAvgVehiclePerMinFromWestToEast_docvalues_double";
			case "paramAvgVehiclePerMinFromSouthToNorth":
				return "paramAvgVehiclePerMinFromSouthToNorth_docvalues_double";
			case "paramVehicleDemandScalingFactor":
				return "paramVehicleDemandScalingFactor_docvalues_double";
			case "paramAvgPedestrianPerMinFromWestToEast":
				return "paramAvgPedestrianPerMinFromWestToEast_docvalues_double";
			case "paramAvgPedestrianPerMinFromSouthToNorth":
				return "paramAvgPedestrianPerMinFromSouthToNorth_docvalues_double";
			case "paramPedestrianDemandScalingFactor":
				return "paramPedestrianDemandScalingFactor_docvalues_double";
			case "paramLam":
				return "paramLam_docvalues_doubles";
			case "paramMinGreenTimeSecWestEast":
				return "paramMinGreenTimeSecWestEast_docvalues_double";
			case "paramMaxGreenTimeSecWestEast":
				return "paramMaxGreenTimeSecWestEast_docvalues_double";
			case "paramMinGreenTimeSecSouthNorth":
				return "paramMinGreenTimeSecSouthNorth_docvalues_double";
			case "paramMaxGreenTimeSecSouthNorth":
				return "paramMaxGreenTimeSecSouthNorth_docvalues_double";
			case "paramPedestrianWaitThresholdSecNorthSouth":
				return "paramPedestrianWaitThresholdSecNorthSouth_docvalues_double";
			case "paramPedestrianWaitThresholdSecWestEast":
				return "paramPedestrianWaitThresholdSecWestEast_docvalues_double";
			case "paramVehicleQueueThresholdWestEast":
				return "paramVehicleQueueThresholdWestEast_docvalues_double";
			case "paramVehicleQueueThresholdSouthNorth":
				return "paramVehicleQueueThresholdSouthNorth_docvalues_double";
			case "paramPedestrianQueueThresholdNorthSouth":
				return "paramPedestrianQueueThresholdNorthSouth_docvalues_double";
			case "paramPedestrianQueueThresholdWestEast":
				return "paramPedestrianQueueThresholdWestEast_docvalues_double";
			case "paramDemandScale":
				return "paramDemandScale_docvalues_doubles";
			case "paramInitialPar":
				return "paramInitialPar_docvalues_doubles";
			case "paramStepSize":
				return "paramStepSize_docvalues_double";
			case "paramRunTime":
				return "paramRunTime_docvalues_int";
			case "paramItersPerPar":
				return "paramItersPerPar_docvalues_int";
			case "paramTotalIterNum":
				return "paramTotalIterNum_docvalues_int";
			case "reportStatus":
				return "reportStatus_docvalues_string";
			case "reportProgress":
				return "reportProgress_docvalues_int";
			case "updatedParameters":
				return "updatedParameters_docvalues_string";
			case "updatedPerformance":
				return "updatedPerformance_docvalues_string";
			case "updatedPerformanceWaitWestEastVehicleSec":
				return "updatedPerformanceWaitWestEastVehicleSec_docvalues_string";
			case "updatedPerformanceWaitSouthNorthVehicleSec":
				return "updatedPerformanceWaitSouthNorthVehicleSec_docvalues_string";
			case "updatedPerformanceWaitAllVehicleSec":
				return "updatedPerformanceWaitAllVehicleSec_docvalues_string";
			case "updatedPerformanceWaitAllPedestrianSec":
				return "updatedPerformanceWaitAllPedestrianSec_docvalues_string";
			case "updatedPerformanceWaitAllVehiclePedestrianSec":
				return "updatedPerformanceWaitAllVehiclePedestrianSec_docvalues_string";
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
			case "reportName_docvalues_string":
				return "reportName";
			case "paramAvgVehiclePerMinFromWestToEast_docvalues_double":
				return "paramAvgVehiclePerMinFromWestToEast";
			case "paramAvgVehiclePerMinFromSouthToNorth_docvalues_double":
				return "paramAvgVehiclePerMinFromSouthToNorth";
			case "paramVehicleDemandScalingFactor_docvalues_double":
				return "paramVehicleDemandScalingFactor";
			case "paramAvgPedestrianPerMinFromWestToEast_docvalues_double":
				return "paramAvgPedestrianPerMinFromWestToEast";
			case "paramAvgPedestrianPerMinFromSouthToNorth_docvalues_double":
				return "paramAvgPedestrianPerMinFromSouthToNorth";
			case "paramPedestrianDemandScalingFactor_docvalues_double":
				return "paramPedestrianDemandScalingFactor";
			case "paramLam_docvalues_doubles":
				return "paramLam";
			case "paramMinGreenTimeSecWestEast_docvalues_double":
				return "paramMinGreenTimeSecWestEast";
			case "paramMaxGreenTimeSecWestEast_docvalues_double":
				return "paramMaxGreenTimeSecWestEast";
			case "paramMinGreenTimeSecSouthNorth_docvalues_double":
				return "paramMinGreenTimeSecSouthNorth";
			case "paramMaxGreenTimeSecSouthNorth_docvalues_double":
				return "paramMaxGreenTimeSecSouthNorth";
			case "paramPedestrianWaitThresholdSecNorthSouth_docvalues_double":
				return "paramPedestrianWaitThresholdSecNorthSouth";
			case "paramPedestrianWaitThresholdSecWestEast_docvalues_double":
				return "paramPedestrianWaitThresholdSecWestEast";
			case "paramVehicleQueueThresholdWestEast_docvalues_double":
				return "paramVehicleQueueThresholdWestEast";
			case "paramVehicleQueueThresholdSouthNorth_docvalues_double":
				return "paramVehicleQueueThresholdSouthNorth";
			case "paramPedestrianQueueThresholdNorthSouth_docvalues_double":
				return "paramPedestrianQueueThresholdNorthSouth";
			case "paramPedestrianQueueThresholdWestEast_docvalues_double":
				return "paramPedestrianQueueThresholdWestEast";
			case "paramDemandScale_docvalues_doubles":
				return "paramDemandScale";
			case "paramInitialPar_docvalues_doubles":
				return "paramInitialPar";
			case "paramStepSize_docvalues_double":
				return "paramStepSize";
			case "paramRunTime_docvalues_int":
				return "paramRunTime";
			case "paramItersPerPar_docvalues_int":
				return "paramItersPerPar";
			case "paramTotalIterNum_docvalues_int":
				return "paramTotalIterNum";
			case "reportStatus_docvalues_string":
				return "reportStatus";
			case "reportProgress_docvalues_int":
				return "reportProgress";
			case "updatedParameters_docvalues_string":
				return "updatedParameters";
			case "updatedPerformance_docvalues_string":
				return "updatedPerformance";
			case "updatedPerformanceWaitWestEastVehicleSec_docvalues_string":
				return "updatedPerformanceWaitWestEastVehicleSec";
			case "updatedPerformanceWaitSouthNorthVehicleSec_docvalues_string":
				return "updatedPerformanceWaitSouthNorthVehicleSec";
			case "updatedPerformanceWaitAllVehicleSec_docvalues_string":
				return "updatedPerformanceWaitAllVehicleSec";
			case "updatedPerformanceWaitAllPedestrianSec_docvalues_string":
				return "updatedPerformanceWaitAllPedestrianSec";
			case "updatedPerformanceWaitAllVehiclePedestrianSec_docvalues_string":
				return "updatedPerformanceWaitAllVehiclePedestrianSec";
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
		oSimulationReport.setReportName(Optional.ofNullable(doc.get("reportName_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setParamAvgVehiclePerMinFromWestToEast(Optional.ofNullable(doc.get("paramAvgVehiclePerMinFromWestToEast_docvalues_double")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setParamAvgVehiclePerMinFromSouthToNorth(Optional.ofNullable(doc.get("paramAvgVehiclePerMinFromSouthToNorth_docvalues_double")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setParamVehicleDemandScalingFactor(Optional.ofNullable(doc.get("paramVehicleDemandScalingFactor_docvalues_double")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setParamAvgPedestrianPerMinFromWestToEast(Optional.ofNullable(doc.get("paramAvgPedestrianPerMinFromWestToEast_docvalues_double")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setParamAvgPedestrianPerMinFromSouthToNorth(Optional.ofNullable(doc.get("paramAvgPedestrianPerMinFromSouthToNorth_docvalues_double")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setParamPedestrianDemandScalingFactor(Optional.ofNullable(doc.get("paramPedestrianDemandScalingFactor_docvalues_double")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("paramLam_docvalues_doubles")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oSimulationReport.addParamLam(v.toString());
		});
		oSimulationReport.setParamMinGreenTimeSecWestEast(Optional.ofNullable(doc.get("paramMinGreenTimeSecWestEast_docvalues_double")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setParamMaxGreenTimeSecWestEast(Optional.ofNullable(doc.get("paramMaxGreenTimeSecWestEast_docvalues_double")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setParamMinGreenTimeSecSouthNorth(Optional.ofNullable(doc.get("paramMinGreenTimeSecSouthNorth_docvalues_double")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setParamMaxGreenTimeSecSouthNorth(Optional.ofNullable(doc.get("paramMaxGreenTimeSecSouthNorth_docvalues_double")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setParamPedestrianWaitThresholdSecNorthSouth(Optional.ofNullable(doc.get("paramPedestrianWaitThresholdSecNorthSouth_docvalues_double")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setParamPedestrianWaitThresholdSecWestEast(Optional.ofNullable(doc.get("paramPedestrianWaitThresholdSecWestEast_docvalues_double")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setParamVehicleQueueThresholdWestEast(Optional.ofNullable(doc.get("paramVehicleQueueThresholdWestEast_docvalues_double")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setParamVehicleQueueThresholdSouthNorth(Optional.ofNullable(doc.get("paramVehicleQueueThresholdSouthNorth_docvalues_double")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setParamPedestrianQueueThresholdNorthSouth(Optional.ofNullable(doc.get("paramPedestrianQueueThresholdNorthSouth_docvalues_double")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setParamPedestrianQueueThresholdWestEast(Optional.ofNullable(doc.get("paramPedestrianQueueThresholdWestEast_docvalues_double")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("paramDemandScale_docvalues_doubles")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oSimulationReport.addParamDemandScale(v.toString());
		});
		Optional.ofNullable((List<?>)doc.get("paramInitialPar_docvalues_doubles")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oSimulationReport.addParamInitialPar(v.toString());
		});
		oSimulationReport.setParamStepSize(Optional.ofNullable(doc.get("paramStepSize_docvalues_double")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setParamRunTime(Optional.ofNullable(doc.get("paramRunTime_docvalues_int")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setParamItersPerPar(Optional.ofNullable(doc.get("paramItersPerPar_docvalues_int")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setParamTotalIterNum(Optional.ofNullable(doc.get("paramTotalIterNum_docvalues_int")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setReportStatus(Optional.ofNullable(doc.get("reportStatus_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setReportProgress(Optional.ofNullable(doc.get("reportProgress_docvalues_int")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setUpdatedParameters(Optional.ofNullable(doc.get("updatedParameters_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setUpdatedPerformance(Optional.ofNullable(doc.get("updatedPerformance_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setUpdatedPerformanceWaitWestEastVehicleSec(Optional.ofNullable(doc.get("updatedPerformanceWaitWestEastVehicleSec_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setUpdatedPerformanceWaitSouthNorthVehicleSec(Optional.ofNullable(doc.get("updatedPerformanceWaitSouthNorthVehicleSec_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setUpdatedPerformanceWaitAllVehicleSec(Optional.ofNullable(doc.get("updatedPerformanceWaitAllVehicleSec_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setUpdatedPerformanceWaitAllPedestrianSec(Optional.ofNullable(doc.get("updatedPerformanceWaitAllPedestrianSec_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSimulationReport.setUpdatedPerformanceWaitAllVehiclePedestrianSec(Optional.ofNullable(doc.get("updatedPerformanceWaitAllVehiclePedestrianSec_docvalues_string")).map(v -> v.toString()).orElse(null));

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
			if(!Objects.equals(reportName, original.getReportName()))
				apiRequest.addVars("reportName");
			if(!Objects.equals(paramAvgVehiclePerMinFromWestToEast, original.getParamAvgVehiclePerMinFromWestToEast()))
				apiRequest.addVars("paramAvgVehiclePerMinFromWestToEast");
			if(!Objects.equals(paramAvgVehiclePerMinFromSouthToNorth, original.getParamAvgVehiclePerMinFromSouthToNorth()))
				apiRequest.addVars("paramAvgVehiclePerMinFromSouthToNorth");
			if(!Objects.equals(paramVehicleDemandScalingFactor, original.getParamVehicleDemandScalingFactor()))
				apiRequest.addVars("paramVehicleDemandScalingFactor");
			if(!Objects.equals(paramAvgPedestrianPerMinFromWestToEast, original.getParamAvgPedestrianPerMinFromWestToEast()))
				apiRequest.addVars("paramAvgPedestrianPerMinFromWestToEast");
			if(!Objects.equals(paramAvgPedestrianPerMinFromSouthToNorth, original.getParamAvgPedestrianPerMinFromSouthToNorth()))
				apiRequest.addVars("paramAvgPedestrianPerMinFromSouthToNorth");
			if(!Objects.equals(paramPedestrianDemandScalingFactor, original.getParamPedestrianDemandScalingFactor()))
				apiRequest.addVars("paramPedestrianDemandScalingFactor");
			if(!Objects.equals(paramLam, original.getParamLam()))
				apiRequest.addVars("paramLam");
			if(!Objects.equals(paramMinGreenTimeSecWestEast, original.getParamMinGreenTimeSecWestEast()))
				apiRequest.addVars("paramMinGreenTimeSecWestEast");
			if(!Objects.equals(paramMaxGreenTimeSecWestEast, original.getParamMaxGreenTimeSecWestEast()))
				apiRequest.addVars("paramMaxGreenTimeSecWestEast");
			if(!Objects.equals(paramMinGreenTimeSecSouthNorth, original.getParamMinGreenTimeSecSouthNorth()))
				apiRequest.addVars("paramMinGreenTimeSecSouthNorth");
			if(!Objects.equals(paramMaxGreenTimeSecSouthNorth, original.getParamMaxGreenTimeSecSouthNorth()))
				apiRequest.addVars("paramMaxGreenTimeSecSouthNorth");
			if(!Objects.equals(paramPedestrianWaitThresholdSecNorthSouth, original.getParamPedestrianWaitThresholdSecNorthSouth()))
				apiRequest.addVars("paramPedestrianWaitThresholdSecNorthSouth");
			if(!Objects.equals(paramPedestrianWaitThresholdSecWestEast, original.getParamPedestrianWaitThresholdSecWestEast()))
				apiRequest.addVars("paramPedestrianWaitThresholdSecWestEast");
			if(!Objects.equals(paramVehicleQueueThresholdWestEast, original.getParamVehicleQueueThresholdWestEast()))
				apiRequest.addVars("paramVehicleQueueThresholdWestEast");
			if(!Objects.equals(paramVehicleQueueThresholdSouthNorth, original.getParamVehicleQueueThresholdSouthNorth()))
				apiRequest.addVars("paramVehicleQueueThresholdSouthNorth");
			if(!Objects.equals(paramPedestrianQueueThresholdNorthSouth, original.getParamPedestrianQueueThresholdNorthSouth()))
				apiRequest.addVars("paramPedestrianQueueThresholdNorthSouth");
			if(!Objects.equals(paramPedestrianQueueThresholdWestEast, original.getParamPedestrianQueueThresholdWestEast()))
				apiRequest.addVars("paramPedestrianQueueThresholdWestEast");
			if(!Objects.equals(paramDemandScale, original.getParamDemandScale()))
				apiRequest.addVars("paramDemandScale");
			if(!Objects.equals(paramInitialPar, original.getParamInitialPar()))
				apiRequest.addVars("paramInitialPar");
			if(!Objects.equals(paramStepSize, original.getParamStepSize()))
				apiRequest.addVars("paramStepSize");
			if(!Objects.equals(paramRunTime, original.getParamRunTime()))
				apiRequest.addVars("paramRunTime");
			if(!Objects.equals(paramItersPerPar, original.getParamItersPerPar()))
				apiRequest.addVars("paramItersPerPar");
			if(!Objects.equals(paramTotalIterNum, original.getParamTotalIterNum()))
				apiRequest.addVars("paramTotalIterNum");
			if(!Objects.equals(reportStatus, original.getReportStatus()))
				apiRequest.addVars("reportStatus");
			if(!Objects.equals(reportProgress, original.getReportProgress()))
				apiRequest.addVars("reportProgress");
			if(!Objects.equals(updatedParameters, original.getUpdatedParameters()))
				apiRequest.addVars("updatedParameters");
			if(!Objects.equals(updatedPerformance, original.getUpdatedPerformance()))
				apiRequest.addVars("updatedPerformance");
			if(!Objects.equals(updatedPerformanceWaitWestEastVehicleSec, original.getUpdatedPerformanceWaitWestEastVehicleSec()))
				apiRequest.addVars("updatedPerformanceWaitWestEastVehicleSec");
			if(!Objects.equals(updatedPerformanceWaitSouthNorthVehicleSec, original.getUpdatedPerformanceWaitSouthNorthVehicleSec()))
				apiRequest.addVars("updatedPerformanceWaitSouthNorthVehicleSec");
			if(!Objects.equals(updatedPerformanceWaitAllVehicleSec, original.getUpdatedPerformanceWaitAllVehicleSec()))
				apiRequest.addVars("updatedPerformanceWaitAllVehicleSec");
			if(!Objects.equals(updatedPerformanceWaitAllPedestrianSec, original.getUpdatedPerformanceWaitAllPedestrianSec()))
				apiRequest.addVars("updatedPerformanceWaitAllPedestrianSec");
			if(!Objects.equals(updatedPerformanceWaitAllVehiclePedestrianSec, original.getUpdatedPerformanceWaitAllVehiclePedestrianSec()))
				apiRequest.addVars("updatedPerformanceWaitAllVehiclePedestrianSec");
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
		sb.append(Optional.ofNullable(reportName).map(v -> "reportName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(paramAvgVehiclePerMinFromWestToEast).map(v -> "paramAvgVehiclePerMinFromWestToEast: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramAvgVehiclePerMinFromSouthToNorth).map(v -> "paramAvgVehiclePerMinFromSouthToNorth: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramVehicleDemandScalingFactor).map(v -> "paramVehicleDemandScalingFactor: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramAvgPedestrianPerMinFromWestToEast).map(v -> "paramAvgPedestrianPerMinFromWestToEast: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramAvgPedestrianPerMinFromSouthToNorth).map(v -> "paramAvgPedestrianPerMinFromSouthToNorth: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramPedestrianDemandScalingFactor).map(v -> "paramPedestrianDemandScalingFactor: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramLam).map(v -> "paramLam: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramMinGreenTimeSecWestEast).map(v -> "paramMinGreenTimeSecWestEast: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramMaxGreenTimeSecWestEast).map(v -> "paramMaxGreenTimeSecWestEast: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramMinGreenTimeSecSouthNorth).map(v -> "paramMinGreenTimeSecSouthNorth: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramMaxGreenTimeSecSouthNorth).map(v -> "paramMaxGreenTimeSecSouthNorth: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramPedestrianWaitThresholdSecNorthSouth).map(v -> "paramPedestrianWaitThresholdSecNorthSouth: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramPedestrianWaitThresholdSecWestEast).map(v -> "paramPedestrianWaitThresholdSecWestEast: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramVehicleQueueThresholdWestEast).map(v -> "paramVehicleQueueThresholdWestEast: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramVehicleQueueThresholdSouthNorth).map(v -> "paramVehicleQueueThresholdSouthNorth: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramPedestrianQueueThresholdNorthSouth).map(v -> "paramPedestrianQueueThresholdNorthSouth: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramPedestrianQueueThresholdWestEast).map(v -> "paramPedestrianQueueThresholdWestEast: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramDemandScale).map(v -> "paramDemandScale: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramInitialPar).map(v -> "paramInitialPar: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramStepSize).map(v -> "paramStepSize: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramRunTime).map(v -> "paramRunTime: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramItersPerPar).map(v -> "paramItersPerPar: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramTotalIterNum).map(v -> "paramTotalIterNum: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(reportStatus).map(v -> "reportStatus: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(reportProgress).map(v -> "reportProgress: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(updatedParameters).map(v -> "updatedParameters: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(updatedPerformance).map(v -> "updatedPerformance: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(updatedPerformanceWaitWestEastVehicleSec).map(v -> "updatedPerformanceWaitWestEastVehicleSec: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(updatedPerformanceWaitSouthNorthVehicleSec).map(v -> "updatedPerformanceWaitSouthNorthVehicleSec: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(updatedPerformanceWaitAllVehicleSec).map(v -> "updatedPerformanceWaitAllVehicleSec: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(updatedPerformanceWaitAllPedestrianSec).map(v -> "updatedPerformanceWaitAllPedestrianSec: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(updatedPerformanceWaitAllVehiclePedestrianSec).map(v -> "updatedPerformanceWaitAllVehiclePedestrianSec: " + v + "\n").orElse(""));
		return sb.toString();
	}

	public static final String[] SimulationReportVals = new String[] { reportStatusStopped1_enUS, reportStatusCompleted1_enUS, reportStatusRunning1_enUS, reportStatusError1_enUS };

	public static final String CLASS_SIMPLE_NAME = "SimulationReport";
	public static final String VAR_simulationKey = "simulationKey";
	public static final String VAR_simulationSearch = "simulationSearch";
	public static final String VAR_simulation_ = "simulation_";
	public static final String VAR_simulationName = "simulationName";
	public static final String VAR_reportName = "reportName";
	public static final String VAR_paramAvgVehiclePerMinFromWestToEast = "paramAvgVehiclePerMinFromWestToEast";
	public static final String VAR_paramAvgVehiclePerMinFromSouthToNorth = "paramAvgVehiclePerMinFromSouthToNorth";
	public static final String VAR_paramVehicleDemandScalingFactor = "paramVehicleDemandScalingFactor";
	public static final String VAR_paramAvgPedestrianPerMinFromWestToEast = "paramAvgPedestrianPerMinFromWestToEast";
	public static final String VAR_paramAvgPedestrianPerMinFromSouthToNorth = "paramAvgPedestrianPerMinFromSouthToNorth";
	public static final String VAR_paramPedestrianDemandScalingFactor = "paramPedestrianDemandScalingFactor";
	public static final String VAR_paramLam = "paramLam";
	public static final String VAR_paramMinGreenTimeSecWestEast = "paramMinGreenTimeSecWestEast";
	public static final String VAR_paramMaxGreenTimeSecWestEast = "paramMaxGreenTimeSecWestEast";
	public static final String VAR_paramMinGreenTimeSecSouthNorth = "paramMinGreenTimeSecSouthNorth";
	public static final String VAR_paramMaxGreenTimeSecSouthNorth = "paramMaxGreenTimeSecSouthNorth";
	public static final String VAR_paramPedestrianWaitThresholdSecNorthSouth = "paramPedestrianWaitThresholdSecNorthSouth";
	public static final String VAR_paramPedestrianWaitThresholdSecWestEast = "paramPedestrianWaitThresholdSecWestEast";
	public static final String VAR_paramVehicleQueueThresholdWestEast = "paramVehicleQueueThresholdWestEast";
	public static final String VAR_paramVehicleQueueThresholdSouthNorth = "paramVehicleQueueThresholdSouthNorth";
	public static final String VAR_paramPedestrianQueueThresholdNorthSouth = "paramPedestrianQueueThresholdNorthSouth";
	public static final String VAR_paramPedestrianQueueThresholdWestEast = "paramPedestrianQueueThresholdWestEast";
	public static final String VAR_paramDemandScale = "paramDemandScale";
	public static final String VAR_paramInitialPar = "paramInitialPar";
	public static final String VAR_paramStepSize = "paramStepSize";
	public static final String VAR_paramRunTime = "paramRunTime";
	public static final String VAR_paramItersPerPar = "paramItersPerPar";
	public static final String VAR_paramTotalIterNum = "paramTotalIterNum";
	public static final String VAR_reportStatus = "reportStatus";
	public static final String VAR_reportProgress = "reportProgress";
	public static final String VAR_updatedParameters = "updatedParameters";
	public static final String VAR_updatedPerformance = "updatedPerformance";
	public static final String VAR_updatedPerformanceWaitWestEastVehicleSec = "updatedPerformanceWaitWestEastVehicleSec";
	public static final String VAR_updatedPerformanceWaitSouthNorthVehicleSec = "updatedPerformanceWaitSouthNorthVehicleSec";
	public static final String VAR_updatedPerformanceWaitAllVehicleSec = "updatedPerformanceWaitAllVehicleSec";
	public static final String VAR_updatedPerformanceWaitAllPedestrianSec = "updatedPerformanceWaitAllPedestrianSec";
	public static final String VAR_updatedPerformanceWaitAllVehiclePedestrianSec = "updatedPerformanceWaitAllVehiclePedestrianSec";

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
		vars.add(VAR_reportName);
		vars.add(VAR_paramAvgVehiclePerMinFromWestToEast);
		vars.add(VAR_paramAvgVehiclePerMinFromSouthToNorth);
		vars.add(VAR_paramVehicleDemandScalingFactor);
		vars.add(VAR_paramAvgPedestrianPerMinFromWestToEast);
		vars.add(VAR_paramAvgPedestrianPerMinFromSouthToNorth);
		vars.add(VAR_paramPedestrianDemandScalingFactor);
		vars.add(VAR_paramLam);
		vars.add(VAR_paramMinGreenTimeSecWestEast);
		vars.add(VAR_paramMaxGreenTimeSecWestEast);
		vars.add(VAR_paramMinGreenTimeSecSouthNorth);
		vars.add(VAR_paramMaxGreenTimeSecSouthNorth);
		vars.add(VAR_paramPedestrianWaitThresholdSecNorthSouth);
		vars.add(VAR_paramPedestrianWaitThresholdSecWestEast);
		vars.add(VAR_paramVehicleQueueThresholdWestEast);
		vars.add(VAR_paramVehicleQueueThresholdSouthNorth);
		vars.add(VAR_paramPedestrianQueueThresholdNorthSouth);
		vars.add(VAR_paramPedestrianQueueThresholdWestEast);
		vars.add(VAR_paramDemandScale);
		vars.add(VAR_paramInitialPar);
		vars.add(VAR_paramStepSize);
		vars.add(VAR_paramRunTime);
		vars.add(VAR_paramItersPerPar);
		vars.add(VAR_paramTotalIterNum);
		vars.add(VAR_reportStatus);
		vars.add(VAR_reportProgress);
		vars.add(VAR_updatedParameters);
		vars.add(VAR_updatedPerformance);
		vars.add(VAR_updatedPerformanceWaitWestEastVehicleSec);
		vars.add(VAR_updatedPerformanceWaitSouthNorthVehicleSec);
		vars.add(VAR_updatedPerformanceWaitAllVehicleSec);
		vars.add(VAR_updatedPerformanceWaitAllPedestrianSec);
		vars.add(VAR_updatedPerformanceWaitAllVehiclePedestrianSec);
		BaseModel.varsFqBaseModel(vars);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return SimulationReport.varsRangeSimulationReport(new ArrayList<String>());
	}
	public static List<String> varsRangeSimulationReport(List<String> vars) {
		vars.add(VAR_paramAvgVehiclePerMinFromWestToEast);
		vars.add(VAR_paramAvgVehiclePerMinFromSouthToNorth);
		vars.add(VAR_paramVehicleDemandScalingFactor);
		vars.add(VAR_paramAvgPedestrianPerMinFromWestToEast);
		vars.add(VAR_paramAvgPedestrianPerMinFromSouthToNorth);
		vars.add(VAR_paramPedestrianDemandScalingFactor);
		vars.add(VAR_paramMinGreenTimeSecWestEast);
		vars.add(VAR_paramMaxGreenTimeSecWestEast);
		vars.add(VAR_paramMinGreenTimeSecSouthNorth);
		vars.add(VAR_paramMaxGreenTimeSecSouthNorth);
		vars.add(VAR_paramPedestrianWaitThresholdSecNorthSouth);
		vars.add(VAR_paramPedestrianWaitThresholdSecWestEast);
		vars.add(VAR_paramVehicleQueueThresholdWestEast);
		vars.add(VAR_paramVehicleQueueThresholdSouthNorth);
		vars.add(VAR_paramPedestrianQueueThresholdNorthSouth);
		vars.add(VAR_paramPedestrianQueueThresholdWestEast);
		vars.add(VAR_paramStepSize);
		vars.add(VAR_paramRunTime);
		vars.add(VAR_paramItersPerPar);
		vars.add(VAR_paramTotalIterNum);
		vars.add(VAR_reportProgress);
		vars.add(VAR_updatedParameters);
		vars.add(VAR_updatedPerformance);
		vars.add(VAR_updatedPerformanceWaitWestEastVehicleSec);
		vars.add(VAR_updatedPerformanceWaitSouthNorthVehicleSec);
		vars.add(VAR_updatedPerformanceWaitAllVehicleSec);
		vars.add(VAR_updatedPerformanceWaitAllPedestrianSec);
		vars.add(VAR_updatedPerformanceWaitAllVehiclePedestrianSec);
		BaseModel.varsRangeBaseModel(vars);
		return vars;
	}

	public static final String DISPLAY_NAME_simulationKey = "traffic simulation";
	public static final String DISPLAY_NAME_simulationSearch = "";
	public static final String DISPLAY_NAME_simulation_ = "";
	public static final String DISPLAY_NAME_simulationName = "simulation name";
	public static final String DISPLAY_NAME_reportName = "report name";
	public static final String DISPLAY_NAME_paramAvgVehiclePerMinFromWestToEast = "Average vehicle/min from WEST to EAST";
	public static final String DISPLAY_NAME_paramAvgVehiclePerMinFromSouthToNorth = "Average vehicle/min from SOUTH to NORTH";
	public static final String DISPLAY_NAME_paramVehicleDemandScalingFactor = "Demand scaling factor (multiplies all vehicle demands)";
	public static final String DISPLAY_NAME_paramAvgPedestrianPerMinFromWestToEast = "Average pedestrian/min from WEST to EAST";
	public static final String DISPLAY_NAME_paramAvgPedestrianPerMinFromSouthToNorth = "Average pedestrian/min from WEST to EAST";
	public static final String DISPLAY_NAME_paramPedestrianDemandScalingFactor = "Demand scaling factor (multiplies all pedestrian demands)";
	public static final String DISPLAY_NAME_paramLam = "traffic demand";
	public static final String DISPLAY_NAME_paramMinGreenTimeSecWestEast = "Min GREEN time for WEST-EAST traffic (sec)";
	public static final String DISPLAY_NAME_paramMaxGreenTimeSecWestEast = "Max GREEN time for WEST-EAST traffic (sec)";
	public static final String DISPLAY_NAME_paramMinGreenTimeSecSouthNorth = "Min GREEN time for SOUTH-NORTH traffic (sec)";
	public static final String DISPLAY_NAME_paramMaxGreenTimeSecSouthNorth = "Max GREEN time for SOUTH-NORTH traffic (sec)";
	public static final String DISPLAY_NAME_paramPedestrianWaitThresholdSecNorthSouth = "Pedestrian waiting time tolerance threshold for NORTH-SOUTH (sec)";
	public static final String DISPLAY_NAME_paramPedestrianWaitThresholdSecWestEast = "Pedestrian waiting time tolerance threshold for WEST-EAST (sec)";
	public static final String DISPLAY_NAME_paramVehicleQueueThresholdWestEast = "Vehicle queue length threshold between low-high content for WEST-EAST";
	public static final String DISPLAY_NAME_paramVehicleQueueThresholdSouthNorth = "Vehicle queue length threshold between low-high content for SOUTH-NORTH";
	public static final String DISPLAY_NAME_paramPedestrianQueueThresholdNorthSouth = "Pedestrian queue length threshold between low-high content for NORTH-SOUTH";
	public static final String DISPLAY_NAME_paramPedestrianQueueThresholdWestEast = "Pedestrian queue length threshold between low-high content for WEST-EAST";
	public static final String DISPLAY_NAME_paramDemandScale = "demand scale";
	public static final String DISPLAY_NAME_paramInitialPar = "initial params";
	public static final String DISPLAY_NAME_paramStepSize = "Simulation time step (sec)";
	public static final String DISPLAY_NAME_paramRunTime = "time for each round of traffic simulation (sec)";
	public static final String DISPLAY_NAME_paramItersPerPar = "Number of simulation repetitions with same input (for statistical accuracy)";
	public static final String DISPLAY_NAME_paramTotalIterNum = "Number of parameter update iterations before output";
	public static final String DISPLAY_NAME_reportStatus = "report status";
	public static final String DISPLAY_NAME_reportProgress = "report progress";
	public static final String DISPLAY_NAME_updatedParameters = "updated parameters";
	public static final String DISPLAY_NAME_updatedPerformance = "updated performance";
	public static final String DISPLAY_NAME_updatedPerformanceWaitWestEastVehicleSec = "Average waiting time for WEST-EAST vehicles (sec)";
	public static final String DISPLAY_NAME_updatedPerformanceWaitSouthNorthVehicleSec = "Average waiting time for SOUTH-NORTH vehicles (sec)";
	public static final String DISPLAY_NAME_updatedPerformanceWaitAllVehicleSec = "Average waiting time for all vehicles (sec)";
	public static final String DISPLAY_NAME_updatedPerformanceWaitAllPedestrianSec = "Average waiting time for pedestrians (sec)";
	public static final String DISPLAY_NAME_updatedPerformanceWaitAllVehiclePedestrianSec = "Average waiting time for vehicles and pedestrians (sec)";

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
		case VAR_reportName:
			return DISPLAY_NAME_reportName;
		case VAR_paramAvgVehiclePerMinFromWestToEast:
			return DISPLAY_NAME_paramAvgVehiclePerMinFromWestToEast;
		case VAR_paramAvgVehiclePerMinFromSouthToNorth:
			return DISPLAY_NAME_paramAvgVehiclePerMinFromSouthToNorth;
		case VAR_paramVehicleDemandScalingFactor:
			return DISPLAY_NAME_paramVehicleDemandScalingFactor;
		case VAR_paramAvgPedestrianPerMinFromWestToEast:
			return DISPLAY_NAME_paramAvgPedestrianPerMinFromWestToEast;
		case VAR_paramAvgPedestrianPerMinFromSouthToNorth:
			return DISPLAY_NAME_paramAvgPedestrianPerMinFromSouthToNorth;
		case VAR_paramPedestrianDemandScalingFactor:
			return DISPLAY_NAME_paramPedestrianDemandScalingFactor;
		case VAR_paramLam:
			return DISPLAY_NAME_paramLam;
		case VAR_paramMinGreenTimeSecWestEast:
			return DISPLAY_NAME_paramMinGreenTimeSecWestEast;
		case VAR_paramMaxGreenTimeSecWestEast:
			return DISPLAY_NAME_paramMaxGreenTimeSecWestEast;
		case VAR_paramMinGreenTimeSecSouthNorth:
			return DISPLAY_NAME_paramMinGreenTimeSecSouthNorth;
		case VAR_paramMaxGreenTimeSecSouthNorth:
			return DISPLAY_NAME_paramMaxGreenTimeSecSouthNorth;
		case VAR_paramPedestrianWaitThresholdSecNorthSouth:
			return DISPLAY_NAME_paramPedestrianWaitThresholdSecNorthSouth;
		case VAR_paramPedestrianWaitThresholdSecWestEast:
			return DISPLAY_NAME_paramPedestrianWaitThresholdSecWestEast;
		case VAR_paramVehicleQueueThresholdWestEast:
			return DISPLAY_NAME_paramVehicleQueueThresholdWestEast;
		case VAR_paramVehicleQueueThresholdSouthNorth:
			return DISPLAY_NAME_paramVehicleQueueThresholdSouthNorth;
		case VAR_paramPedestrianQueueThresholdNorthSouth:
			return DISPLAY_NAME_paramPedestrianQueueThresholdNorthSouth;
		case VAR_paramPedestrianQueueThresholdWestEast:
			return DISPLAY_NAME_paramPedestrianQueueThresholdWestEast;
		case VAR_paramDemandScale:
			return DISPLAY_NAME_paramDemandScale;
		case VAR_paramInitialPar:
			return DISPLAY_NAME_paramInitialPar;
		case VAR_paramStepSize:
			return DISPLAY_NAME_paramStepSize;
		case VAR_paramRunTime:
			return DISPLAY_NAME_paramRunTime;
		case VAR_paramItersPerPar:
			return DISPLAY_NAME_paramItersPerPar;
		case VAR_paramTotalIterNum:
			return DISPLAY_NAME_paramTotalIterNum;
		case VAR_reportStatus:
			return DISPLAY_NAME_reportStatus;
		case VAR_reportProgress:
			return DISPLAY_NAME_reportProgress;
		case VAR_updatedParameters:
			return DISPLAY_NAME_updatedParameters;
		case VAR_updatedPerformance:
			return DISPLAY_NAME_updatedPerformance;
		case VAR_updatedPerformanceWaitWestEastVehicleSec:
			return DISPLAY_NAME_updatedPerformanceWaitWestEastVehicleSec;
		case VAR_updatedPerformanceWaitSouthNorthVehicleSec:
			return DISPLAY_NAME_updatedPerformanceWaitSouthNorthVehicleSec;
		case VAR_updatedPerformanceWaitAllVehicleSec:
			return DISPLAY_NAME_updatedPerformanceWaitAllVehicleSec;
		case VAR_updatedPerformanceWaitAllPedestrianSec:
			return DISPLAY_NAME_updatedPerformanceWaitAllPedestrianSec;
		case VAR_updatedPerformanceWaitAllVehiclePedestrianSec:
			return DISPLAY_NAME_updatedPerformanceWaitAllVehiclePedestrianSec;
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
		case VAR_paramItersPerPar:
			return "Number of repeats per round. ";
		case VAR_paramTotalIterNum:
			return "Total iterations to update performance. ";
		case VAR_reportStatus:
			return "The current status of the simulation report. ";
		case VAR_reportProgress:
			return "The percent progress of the simulation report. ";
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
		case VAR_reportName:
			return "String";
		case VAR_paramAvgVehiclePerMinFromWestToEast:
			return "BigDecimal";
		case VAR_paramAvgVehiclePerMinFromSouthToNorth:
			return "BigDecimal";
		case VAR_paramVehicleDemandScalingFactor:
			return "BigDecimal";
		case VAR_paramAvgPedestrianPerMinFromWestToEast:
			return "BigDecimal";
		case VAR_paramAvgPedestrianPerMinFromSouthToNorth:
			return "BigDecimal";
		case VAR_paramPedestrianDemandScalingFactor:
			return "BigDecimal";
		case VAR_paramLam:
			return "List";
		case VAR_paramMinGreenTimeSecWestEast:
			return "BigDecimal";
		case VAR_paramMaxGreenTimeSecWestEast:
			return "BigDecimal";
		case VAR_paramMinGreenTimeSecSouthNorth:
			return "BigDecimal";
		case VAR_paramMaxGreenTimeSecSouthNorth:
			return "BigDecimal";
		case VAR_paramPedestrianWaitThresholdSecNorthSouth:
			return "BigDecimal";
		case VAR_paramPedestrianWaitThresholdSecWestEast:
			return "BigDecimal";
		case VAR_paramVehicleQueueThresholdWestEast:
			return "BigDecimal";
		case VAR_paramVehicleQueueThresholdSouthNorth:
			return "BigDecimal";
		case VAR_paramPedestrianQueueThresholdNorthSouth:
			return "BigDecimal";
		case VAR_paramPedestrianQueueThresholdWestEast:
			return "BigDecimal";
		case VAR_paramDemandScale:
			return "List";
		case VAR_paramInitialPar:
			return "List";
		case VAR_paramStepSize:
			return "BigDecimal";
		case VAR_paramRunTime:
			return "Integer";
		case VAR_paramItersPerPar:
			return "Integer";
		case VAR_paramTotalIterNum:
			return "Integer";
		case VAR_reportStatus:
			return "String";
		case VAR_reportProgress:
			return "Integer";
		case VAR_updatedParameters:
			return "JsonArray";
		case VAR_updatedPerformance:
			return "JsonArray";
		case VAR_updatedPerformanceWaitWestEastVehicleSec:
			return "JsonArray";
		case VAR_updatedPerformanceWaitSouthNorthVehicleSec:
			return "JsonArray";
		case VAR_updatedPerformanceWaitAllVehicleSec:
			return "JsonArray";
		case VAR_updatedPerformanceWaitAllPedestrianSec:
			return "JsonArray";
		case VAR_updatedPerformanceWaitAllVehiclePedestrianSec:
			return "JsonArray";
			default:
				return BaseModel.classSimpleNameBaseModel(var);
		}
	}

	public static Integer htmColumnSimulationReport(String var) {
		switch(var) {
			default:
				return BaseModel.htmColumnBaseModel(var);
		}
	}

	public static Integer htmRowSimulationReport(String var) {
		switch(var) {
		case VAR_simulationKey:
			return 3;
		case VAR_reportName:
			return 3;
		case VAR_paramAvgVehiclePerMinFromWestToEast:
			return 4;
		case VAR_paramAvgVehiclePerMinFromSouthToNorth:
			return 4;
		case VAR_paramVehicleDemandScalingFactor:
			return 4;
		case VAR_paramAvgPedestrianPerMinFromWestToEast:
			return 5;
		case VAR_paramAvgPedestrianPerMinFromSouthToNorth:
			return 5;
		case VAR_paramPedestrianDemandScalingFactor:
			return 5;
		case VAR_paramMinGreenTimeSecWestEast:
			return 6;
		case VAR_paramMaxGreenTimeSecWestEast:
			return 6;
		case VAR_paramMinGreenTimeSecSouthNorth:
			return 7;
		case VAR_paramMaxGreenTimeSecSouthNorth:
			return 7;
		case VAR_paramPedestrianWaitThresholdSecNorthSouth:
			return 8;
		case VAR_paramPedestrianWaitThresholdSecWestEast:
			return 8;
		case VAR_paramVehicleQueueThresholdWestEast:
			return 9;
		case VAR_paramVehicleQueueThresholdSouthNorth:
			return 9;
		case VAR_paramPedestrianQueueThresholdNorthSouth:
			return 10;
		case VAR_paramPedestrianQueueThresholdWestEast:
			return 10;
		case VAR_paramStepSize:
			return 11;
		case VAR_paramRunTime:
			return 11;
		case VAR_paramItersPerPar:
			return 12;
		case VAR_paramTotalIterNum:
			return 12;
		case VAR_reportStatus:
			return 12;
		case VAR_reportProgress:
			return 12;
		case VAR_updatedParameters:
			return 13;
		case VAR_updatedPerformanceWaitWestEastVehicleSec:
			return 15;
		case VAR_updatedPerformanceWaitSouthNorthVehicleSec:
			return 16;
		case VAR_updatedPerformanceWaitAllVehicleSec:
			return 17;
		case VAR_updatedPerformanceWaitAllPedestrianSec:
			return 18;
		case VAR_updatedPerformanceWaitAllVehiclePedestrianSec:
			return 18;
			default:
				return BaseModel.htmRowBaseModel(var);
		}
	}

	public static Integer htmCellSimulationReport(String var) {
		switch(var) {
		case VAR_simulationKey:
			return 1;
		case VAR_reportName:
			return 2;
		case VAR_paramAvgVehiclePerMinFromWestToEast:
			return 1;
		case VAR_paramAvgVehiclePerMinFromSouthToNorth:
			return 2;
		case VAR_paramVehicleDemandScalingFactor:
			return 3;
		case VAR_paramAvgPedestrianPerMinFromWestToEast:
			return 1;
		case VAR_paramAvgPedestrianPerMinFromSouthToNorth:
			return 2;
		case VAR_paramPedestrianDemandScalingFactor:
			return 3;
		case VAR_paramMinGreenTimeSecWestEast:
			return 1;
		case VAR_paramMaxGreenTimeSecWestEast:
			return 2;
		case VAR_paramMinGreenTimeSecSouthNorth:
			return 1;
		case VAR_paramMaxGreenTimeSecSouthNorth:
			return 2;
		case VAR_paramPedestrianWaitThresholdSecNorthSouth:
			return 1;
		case VAR_paramPedestrianWaitThresholdSecWestEast:
			return 2;
		case VAR_paramVehicleQueueThresholdWestEast:
			return 1;
		case VAR_paramVehicleQueueThresholdSouthNorth:
			return 2;
		case VAR_paramPedestrianQueueThresholdNorthSouth:
			return 1;
		case VAR_paramPedestrianQueueThresholdWestEast:
			return 2;
		case VAR_paramStepSize:
			return 1;
		case VAR_paramRunTime:
			return 2;
		case VAR_paramItersPerPar:
			return 1;
		case VAR_paramTotalIterNum:
			return 2;
		case VAR_reportStatus:
			return 3;
		case VAR_reportProgress:
			return 3;
		case VAR_updatedParameters:
			return 1;
		case VAR_updatedPerformanceWaitWestEastVehicleSec:
			return 1;
		case VAR_updatedPerformanceWaitSouthNorthVehicleSec:
			return 1;
		case VAR_updatedPerformanceWaitAllVehicleSec:
			return 1;
		case VAR_updatedPerformanceWaitAllPedestrianSec:
			return 1;
		case VAR_updatedPerformanceWaitAllVehiclePedestrianSec:
			return 1;
			default:
				return BaseModel.htmCellBaseModel(var);
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
