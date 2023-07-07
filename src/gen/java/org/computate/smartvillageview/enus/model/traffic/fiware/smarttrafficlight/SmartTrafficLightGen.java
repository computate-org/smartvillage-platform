package org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight;

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
import io.vertx.core.json.JsonArray;
import org.computate.vertx.search.list.SearchList;
import org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved;
import java.math.BigDecimal;
import java.lang.Integer;
import java.lang.Long;
import org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;

/**	
<ol>
0<h3>Suggestions that can generate more code for you: </h3></ol>
 * <li>You can add a class comment "SqlOrder: " followed by an Integer to sort this class compared when generating the SQL code to create and drop tables. 
 * The Order comment allows you do define which order the SQL code is generated. 
 * </li>
 * <h3>About the SmartTrafficLight class and it's generated class SmartTrafficLightGen&lt;BaseModel&gt;: </h3>extends SmartTrafficLightGen
 * <p>
 * This Java class extends a generated Java class SmartTrafficLightGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight">Find the class SmartTrafficLight in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends SmartTrafficLightGen<BaseModel>
 * <p>This <code>class SmartTrafficLight extends SmartTrafficLightGen&lt;BaseModel&gt;</code>, which means it extends a newly generated SmartTrafficLightGen. 
 * The generated <code>class SmartTrafficLightGen extends BaseModel</code> which means that SmartTrafficLight extends SmartTrafficLightGen which extends BaseModel. 
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
 * ApiMethode: SearchPage
 * <p>This class contains a comment <b>"ApiMethod: SearchPage"</b>, which creates an API "SearchPage". 
 * </p>
 * ApiTag.enUS: true
 * <p>This class contains a comment <b>"ApiTag: Smart Traffic Light"</b>, which groups all of the OpenAPIs for SmartTrafficLight objects under the tag "Smart Traffic Light". 
 * </p>
 * ApiUri.enUS: /api/smart-traffic-light
 * <p>This class contains a comment <b>"ApiUri: /api/smart-traffic-light"</b>, which defines the base API URI for SmartTrafficLight objects as "/api/smart-traffic-light" in the OpenAPI spec. 
 * </p>
 * Color: 2017-shaded-spruce
 * <p>This class contains a comment <b>"Color: 2017-shaded-spruce"</b>, which styles the SmartTrafficLight page "2017-shaded-spruce". 
 * This will reference a CSS class defined by the stylesheets in the project that starts with "w3-". 
 * A css class of "w3-2017-shaded-spruce" is expected to exist in the project stylesheets, and is inspired by W3 CSS colors. 
 * See: <a href="https://www.w3schools.com/w3css/w3css_colors.asp">https://www.w3schools.com/w3css/w3css_colors.asp</a>. 
 * </p>
 * IconGroup: duotone
 * <p>This class contains a comment <b>"IconGroup: duotone"</b>, which adds icons on the SmartTrafficLight page with a group of "duotone". 
 * This will reference a Font Awesome icon group that starts with "fa-" followed by the icon group "duotone", together is "fa-duotone". 
 * A Font Awesome icon group of "duotone" is expected to exist. 
 * The Font Awesome groups currently supported include: solid, regular, light, thin, duotone, sharp, and kit. 
 * See: <a href="https://fontawesome.com/docs/web/dig-deeper/styles">https://fontawesome.com/docs/web/dig-deeper/styles</a>. 
 * </p>
 * IconName: traffic-light-stop
 * <p>This class contains a comment <b>"IconName: traffic-light-stop"</b>, which adds icons on the SmartTrafficLight page with a name of "traffic-light-stop". 
 * This will reference a Font Awesome icon that starts with the icon group "fa-duotone fa-" followed by the icon name, which is "fa-duotone fa-traffic-light-stop". 
 * A Font Awesome icon of "fa-duotone fa-traffic-light-stop" is expected to exist. 
 * See: <a href="https://fontawesome.com/icons">https://fontawesome.com/icons</a>. 
 * </p>
 * Indexed: true
 * <p>This class contains a comment <b>"Indexed: true"</b>, which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * {@inheritDoc}
 * <p>By adding a class comment "{@inheritDoc}", the SmartTrafficLight class will inherit the helpful inherited class comments from the super class SmartTrafficLightGen. 
 * </p>
 * Rows: 100
 * <p>This class contains a comment <b>"Rows: 100"</b>, which means the SmartTrafficLight API will return a default of 100 records instead of 10 by default. 
 * Each API has built in pagination of the search records to ensure a user can query all the data a page at a time without running the application out of memory. 
 * </p>
 * Order: 8
 * <p>This class contains a comment <b>"Order: 8"</b>, which means this class will be sorted by the given number 8 ascending when code that relates to multiple classes at the same time is generated. 
 * </p>
 * Model: true
 * <p>This class contains a comment <b>"Model: true"</b>, which means this class will be stored in the database. 
 * Every protected void method that begins with "_" that contains a "Persist: true" comment will be a persisted field in the database table. 
 * </p>
 * Page: true
 * <p>This class contains a comment <b>"Page: true"</b>, which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLightPage. 
 * </p>
 * SuperPage.enUS: BaseModelPage
 * <p>This class contains a comment <b>"SuperPage.enUS: BaseModelPage"</b>, which identifies the Java super class of the page code by it's class simple name "BaseModelPage". 
 * This means that the newly created class org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLightPage extends org.computate.smartvillageview.enus.model.base.BaseModelPage. 
 * </p>
 * Promise: true
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the SmartTrafficLight Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * This class contains a comment <b>"Role.enUS: SiteAdmin"</b>, which identifies the default role name "SiteAdmin" of the OAuth2/OpenID Connect user role required to access this SmartTrafficLight API. 
 * It's possible to reconfigure the roles required to access the SmartTrafficLight API by configuring an environment variable like this: 
 * </p>
 * <pre>AUTH_ROLE_REQUIRED_SmartTrafficLight: ["SiteAdmin"]</pre>
 * AName.enUS: a smart traffic light
 * <p>This class contains a comment <b>"AName.enUS: a smart traffic light"</b>, which identifies the language context to describe a SmartTrafficLight as "a smart traffic light". 
 * </p>
 * <p>
 * Delete the class SmartTrafficLight in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class SmartTrafficLightGen<DEV> extends BaseModel {
	protected static final Logger LOG = LoggerFactory.getLogger(SmartTrafficLight.class);

	public static final String SmartTrafficLight_AName_enUS = "a smart traffic light";
	public static final String SmartTrafficLight_This_enUS = "this ";
	public static final String SmartTrafficLight_ThisName_enUS = "this smart traffic light";
	public static final String SmartTrafficLight_A_enUS = "a ";
	public static final String SmartTrafficLight_TheName_enUS = "the smart traffic light";
	public static final String SmartTrafficLight_NameSingular_enUS = "smart traffic light";
	public static final String SmartTrafficLight_NamePlural_enUS = "smart traffic lights";
	public static final String SmartTrafficLight_NameActual_enUS = "current smart traffic light";
	public static final String SmartTrafficLight_AllName_enUS = "all the smart traffic lights";
	public static final String SmartTrafficLight_SearchAllNameBy_enUS = "search smart traffic lights by ";
	public static final String SmartTrafficLight_Title_enUS = "smart traffic lights";
	public static final String SmartTrafficLight_ThePluralName_enUS = "the smart traffic lights";
	public static final String SmartTrafficLight_NoNameFound_enUS = "no smart traffic light found";
	public static final String SmartTrafficLight_ApiUri_enUS = "/api/smart-traffic-light";
	public static final String SmartTrafficLight_ApiUriSearchPage_enUS = "/smart-traffic-light";
	public static final String SmartTrafficLight_OfName_enUS = "of smart traffic light";
	public static final String SmartTrafficLight_ANameAdjective_enUS = "a smart traffic light";
	public static final String SmartTrafficLight_NameAdjectiveSingular_enUS = "smart traffic light";
	public static final String SmartTrafficLight_NameAdjectivePlural_enUS = "smart traffic lights";
	public static final String Search_enUS_Uri = "/api/smart-traffic-light";
	public static final String Search_enUS_ImageUri = "/png/api/smart-traffic-light-999.png";
	public static final String GET_enUS_Uri = "/api/smart-traffic-light/{id}";
	public static final String GET_enUS_ImageUri = "/png/api/smart-traffic-light/{id}-999.png";
	public static final String PATCH_enUS_Uri = "/api/smart-traffic-light";
	public static final String PATCH_enUS_ImageUri = "/png/api/smart-traffic-light-999.png";
	public static final String POST_enUS_Uri = "/api/smart-traffic-light";
	public static final String POST_enUS_ImageUri = "/png/api/smart-traffic-light-999.png";
	public static final String PUTImport_enUS_Uri = "/api/smart-traffic-light-import";
	public static final String PUTImport_enUS_ImageUri = "/png/api/smart-traffic-light-import-999.png";
	public static final String SearchPage_enUS_Uri = "/smart-traffic-light";
	public static final String SearchPage_enUS_ImageUri = "/png/smart-traffic-light-999.png";

	public static final String SmartTrafficLight_Color = "2017-shaded-spruce";
	public static final String SmartTrafficLight_IconGroup = "duotone";
	public static final String SmartTrafficLight_IconName = "traffic-light-stop";
	public static final Integer SmartTrafficLight_Rows = 100;

	//////////////
	// entityId //
	//////////////


	/**	 The entity entityId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String entityId;

	/**	<br> The entity entityId
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&fq=entiteVar_enUS_indexed_string:entityId">Find the entity entityId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _entityId(Wrap<String> w);

	public String getEntityId() {
		return entityId;
	}
	public void setEntityId(String o) {
		this.entityId = SmartTrafficLight.staticSetEntityId(siteRequest_, o);
	}
	public static String staticSetEntityId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SmartTrafficLight entityIdInit() {
		Wrap<String> entityIdWrap = new Wrap<String>().var("entityId");
		if(entityId == null) {
			_entityId(entityIdWrap);
			Optional.ofNullable(entityIdWrap.getO()).ifPresent(o -> {
				setEntityId(o);
			});
		}
		return (SmartTrafficLight)this;
	}

	public static String staticSearchEntityId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrEntityId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqEntityId(SiteRequestEnUS siteRequest_, String o) {
		return SmartTrafficLight.staticSearchStrEntityId(siteRequest_, SmartTrafficLight.staticSearchEntityId(siteRequest_, SmartTrafficLight.staticSetEntityId(siteRequest_, o)));
	}

	public String sqlEntityId() {
		return entityId;
	}

	///////////////////////////
	// smartTrafficLightName //
	///////////////////////////


	/**	 The entity smartTrafficLightName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String smartTrafficLightName;

	/**	<br> The entity smartTrafficLightName
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&fq=entiteVar_enUS_indexed_string:smartTrafficLightName">Find the entity smartTrafficLightName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _smartTrafficLightName(Wrap<String> w);

	public String getSmartTrafficLightName() {
		return smartTrafficLightName;
	}
	public void setSmartTrafficLightName(String o) {
		this.smartTrafficLightName = SmartTrafficLight.staticSetSmartTrafficLightName(siteRequest_, o);
	}
	public static String staticSetSmartTrafficLightName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SmartTrafficLight smartTrafficLightNameInit() {
		Wrap<String> smartTrafficLightNameWrap = new Wrap<String>().var("smartTrafficLightName");
		if(smartTrafficLightName == null) {
			_smartTrafficLightName(smartTrafficLightNameWrap);
			Optional.ofNullable(smartTrafficLightNameWrap.getO()).ifPresent(o -> {
				setSmartTrafficLightName(o);
			});
		}
		return (SmartTrafficLight)this;
	}

	public static String staticSearchSmartTrafficLightName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSmartTrafficLightName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSmartTrafficLightName(SiteRequestEnUS siteRequest_, String o) {
		return SmartTrafficLight.staticSearchStrSmartTrafficLightName(siteRequest_, SmartTrafficLight.staticSearchSmartTrafficLightName(siteRequest_, SmartTrafficLight.staticSetSmartTrafficLightName(siteRequest_, o)));
	}

	public String sqlSmartTrafficLightName() {
		return smartTrafficLightName;
	}

	//////////////////
	// routeIdNorth //
	//////////////////


	/**	 The entity routeIdNorth
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String routeIdNorth;

	/**	<br> The entity routeIdNorth
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&fq=entiteVar_enUS_indexed_string:routeIdNorth">Find the entity routeIdNorth in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _routeIdNorth(Wrap<String> w);

	public String getRouteIdNorth() {
		return routeIdNorth;
	}
	public void setRouteIdNorth(String o) {
		this.routeIdNorth = SmartTrafficLight.staticSetRouteIdNorth(siteRequest_, o);
	}
	public static String staticSetRouteIdNorth(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SmartTrafficLight routeIdNorthInit() {
		Wrap<String> routeIdNorthWrap = new Wrap<String>().var("routeIdNorth");
		if(routeIdNorth == null) {
			_routeIdNorth(routeIdNorthWrap);
			Optional.ofNullable(routeIdNorthWrap.getO()).ifPresent(o -> {
				setRouteIdNorth(o);
			});
		}
		return (SmartTrafficLight)this;
	}

	public static String staticSearchRouteIdNorth(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrRouteIdNorth(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqRouteIdNorth(SiteRequestEnUS siteRequest_, String o) {
		return SmartTrafficLight.staticSearchStrRouteIdNorth(siteRequest_, SmartTrafficLight.staticSearchRouteIdNorth(siteRequest_, SmartTrafficLight.staticSetRouteIdNorth(siteRequest_, o)));
	}

	public String sqlRouteIdNorth() {
		return routeIdNorth;
	}

	/////////////////
	// routeIdEast //
	/////////////////


	/**	 The entity routeIdEast
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String routeIdEast;

	/**	<br> The entity routeIdEast
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&fq=entiteVar_enUS_indexed_string:routeIdEast">Find the entity routeIdEast in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _routeIdEast(Wrap<String> w);

	public String getRouteIdEast() {
		return routeIdEast;
	}
	public void setRouteIdEast(String o) {
		this.routeIdEast = SmartTrafficLight.staticSetRouteIdEast(siteRequest_, o);
	}
	public static String staticSetRouteIdEast(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SmartTrafficLight routeIdEastInit() {
		Wrap<String> routeIdEastWrap = new Wrap<String>().var("routeIdEast");
		if(routeIdEast == null) {
			_routeIdEast(routeIdEastWrap);
			Optional.ofNullable(routeIdEastWrap.getO()).ifPresent(o -> {
				setRouteIdEast(o);
			});
		}
		return (SmartTrafficLight)this;
	}

	public static String staticSearchRouteIdEast(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrRouteIdEast(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqRouteIdEast(SiteRequestEnUS siteRequest_, String o) {
		return SmartTrafficLight.staticSearchStrRouteIdEast(siteRequest_, SmartTrafficLight.staticSearchRouteIdEast(siteRequest_, SmartTrafficLight.staticSetRouteIdEast(siteRequest_, o)));
	}

	public String sqlRouteIdEast() {
		return routeIdEast;
	}

	////////////////////////////
	// trafficFlowObservedIds //
	////////////////////////////


	/**	 The entity trafficFlowObservedIds
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> trafficFlowObservedIds = new ArrayList<String>();

	/**	<br> The entity trafficFlowObservedIds
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&fq=entiteVar_enUS_indexed_string:trafficFlowObservedIds">Find the entity trafficFlowObservedIds in Solr</a>
	 * <br>
	 * @param w is the entity already constructed. 
	 **/
	protected abstract void _trafficFlowObservedIds(List<String> w);

	public List<String> getTrafficFlowObservedIds() {
		return trafficFlowObservedIds;
	}

	public void setTrafficFlowObservedIds(List<String> trafficFlowObservedIds) {
		this.trafficFlowObservedIds = trafficFlowObservedIds;
	}
	public void setTrafficFlowObservedIds(String o) {
		String l = SmartTrafficLight.staticSetTrafficFlowObservedIds(siteRequest_, o);
		if(l != null)
			addTrafficFlowObservedIds(l);
	}
	public static String staticSetTrafficFlowObservedIds(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public SmartTrafficLight addTrafficFlowObservedIds(String...objects) {
		for(String o : objects) {
			addTrafficFlowObservedIds(o);
		}
		return (SmartTrafficLight)this;
	}
	public SmartTrafficLight addTrafficFlowObservedIds(String o) {
		if(o != null)
			this.trafficFlowObservedIds.add(o);
		return (SmartTrafficLight)this;
	}
	@JsonIgnore
	public void setTrafficFlowObservedIds(JsonArray objects) {
		trafficFlowObservedIds.clear();
		if(objects == null)
			return;
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addTrafficFlowObservedIds(o);
		}
	}
	protected SmartTrafficLight trafficFlowObservedIdsInit() {
		_trafficFlowObservedIds(trafficFlowObservedIds);
		return (SmartTrafficLight)this;
	}

	public static String staticSearchTrafficFlowObservedIds(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrTrafficFlowObservedIds(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqTrafficFlowObservedIds(SiteRequestEnUS siteRequest_, String o) {
		return SmartTrafficLight.staticSearchStrTrafficFlowObservedIds(siteRequest_, SmartTrafficLight.staticSearchTrafficFlowObservedIds(siteRequest_, SmartTrafficLight.staticSetTrafficFlowObservedIds(siteRequest_, o)));
	}

	///////////////////////////////
	// trafficFlowObservedSearch //
	///////////////////////////////


	/**	 The entity trafficFlowObservedSearch
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<TrafficFlowObserved> trafficFlowObservedSearch;

	/**	<br> The entity trafficFlowObservedSearch
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&fq=entiteVar_enUS_indexed_string:trafficFlowObservedSearch">Find the entity trafficFlowObservedSearch in Solr</a>
	 * <br>
	 * @param promise is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _trafficFlowObservedSearch(Promise<SearchList<TrafficFlowObserved>> promise);

	public SearchList<TrafficFlowObserved> getTrafficFlowObservedSearch() {
		return trafficFlowObservedSearch;
	}

	public void setTrafficFlowObservedSearch(SearchList<TrafficFlowObserved> trafficFlowObservedSearch) {
		this.trafficFlowObservedSearch = trafficFlowObservedSearch;
	}
	public static SearchList<TrafficFlowObserved> staticSetTrafficFlowObservedSearch(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected Future<SearchList<TrafficFlowObserved>> trafficFlowObservedSearchPromise() {
		Promise<SearchList<TrafficFlowObserved>> promise = Promise.promise();
		Promise<SearchList<TrafficFlowObserved>> promise2 = Promise.promise();
		_trafficFlowObservedSearch(promise2);
		promise2.future().onSuccess(o -> {
			if(o != null && trafficFlowObservedSearch == null) {
				o.promiseDeepForClass(siteRequest_).onSuccess(a -> {
					setTrafficFlowObservedSearch(o);
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

	//////////////////////////
	// trafficFlowObserveds //
	//////////////////////////


	/**	 The entity trafficFlowObserveds
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected List<TrafficFlowObserved> trafficFlowObserveds = new ArrayList<TrafficFlowObserved>();

	/**	<br> The entity trafficFlowObserveds
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&fq=entiteVar_enUS_indexed_string:trafficFlowObserveds">Find the entity trafficFlowObserveds in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _trafficFlowObserveds(List<TrafficFlowObserved> l);

	public List<TrafficFlowObserved> getTrafficFlowObserveds() {
		return trafficFlowObserveds;
	}

	public void setTrafficFlowObserveds(List<TrafficFlowObserved> trafficFlowObserveds) {
		this.trafficFlowObserveds = trafficFlowObserveds;
	}
	public static TrafficFlowObserved staticSetTrafficFlowObserveds(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	public SmartTrafficLight addTrafficFlowObserveds(TrafficFlowObserved...objects) {
		for(TrafficFlowObserved o : objects) {
			addTrafficFlowObserveds(o);
		}
		return (SmartTrafficLight)this;
	}
	public SmartTrafficLight addTrafficFlowObserveds(TrafficFlowObserved o) {
		if(o != null)
			this.trafficFlowObserveds.add(o);
		return (SmartTrafficLight)this;
	}
	protected SmartTrafficLight trafficFlowObservedsInit() {
		_trafficFlowObserveds(trafficFlowObserveds);
		return (SmartTrafficLight)this;
	}

	///////////////////////////////
	// trafficFlowObservedNorth_ //
	///////////////////////////////


	/**	 The entity trafficFlowObservedNorth_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected TrafficFlowObserved trafficFlowObservedNorth_;

	/**	<br> The entity trafficFlowObservedNorth_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&fq=entiteVar_enUS_indexed_string:trafficFlowObservedNorth_">Find the entity trafficFlowObservedNorth_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _trafficFlowObservedNorth_(Wrap<TrafficFlowObserved> w);

	public TrafficFlowObserved getTrafficFlowObservedNorth_() {
		return trafficFlowObservedNorth_;
	}

	public void setTrafficFlowObservedNorth_(TrafficFlowObserved trafficFlowObservedNorth_) {
		this.trafficFlowObservedNorth_ = trafficFlowObservedNorth_;
	}
	public static TrafficFlowObserved staticSetTrafficFlowObservedNorth_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected SmartTrafficLight trafficFlowObservedNorth_Init() {
		Wrap<TrafficFlowObserved> trafficFlowObservedNorth_Wrap = new Wrap<TrafficFlowObserved>().var("trafficFlowObservedNorth_");
		if(trafficFlowObservedNorth_ == null) {
			_trafficFlowObservedNorth_(trafficFlowObservedNorth_Wrap);
			Optional.ofNullable(trafficFlowObservedNorth_Wrap.getO()).ifPresent(o -> {
				setTrafficFlowObservedNorth_(o);
			});
		}
		return (SmartTrafficLight)this;
	}

	//////////////////////////////
	// trafficFlowObservedEast_ //
	//////////////////////////////


	/**	 The entity trafficFlowObservedEast_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected TrafficFlowObserved trafficFlowObservedEast_;

	/**	<br> The entity trafficFlowObservedEast_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&fq=entiteVar_enUS_indexed_string:trafficFlowObservedEast_">Find the entity trafficFlowObservedEast_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _trafficFlowObservedEast_(Wrap<TrafficFlowObserved> w);

	public TrafficFlowObserved getTrafficFlowObservedEast_() {
		return trafficFlowObservedEast_;
	}

	public void setTrafficFlowObservedEast_(TrafficFlowObserved trafficFlowObservedEast_) {
		this.trafficFlowObservedEast_ = trafficFlowObservedEast_;
	}
	public static TrafficFlowObserved staticSetTrafficFlowObservedEast_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected SmartTrafficLight trafficFlowObservedEast_Init() {
		Wrap<TrafficFlowObserved> trafficFlowObservedEast_Wrap = new Wrap<TrafficFlowObserved>().var("trafficFlowObservedEast_");
		if(trafficFlowObservedEast_ == null) {
			_trafficFlowObservedEast_(trafficFlowObservedEast_Wrap);
			Optional.ofNullable(trafficFlowObservedEast_Wrap.getO()).ifPresent(o -> {
				setTrafficFlowObservedEast_(o);
			});
		}
		return (SmartTrafficLight)this;
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&fq=entiteVar_enUS_indexed_string:paramAvgVehiclePerMinFromWestToEast">Find the entity paramAvgVehiclePerMinFromWestToEast in Solr</a>
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
		this.paramAvgVehiclePerMinFromWestToEast = SmartTrafficLight.staticSetParamAvgVehiclePerMinFromWestToEast(siteRequest_, o);
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
	protected SmartTrafficLight paramAvgVehiclePerMinFromWestToEastInit() {
		Wrap<BigDecimal> paramAvgVehiclePerMinFromWestToEastWrap = new Wrap<BigDecimal>().var("paramAvgVehiclePerMinFromWestToEast");
		if(paramAvgVehiclePerMinFromWestToEast == null) {
			_paramAvgVehiclePerMinFromWestToEast(paramAvgVehiclePerMinFromWestToEastWrap);
			Optional.ofNullable(paramAvgVehiclePerMinFromWestToEastWrap.getO()).ifPresent(o -> {
				setParamAvgVehiclePerMinFromWestToEast(o);
			});
		}
		return (SmartTrafficLight)this;
	}

	public static Double staticSearchParamAvgVehiclePerMinFromWestToEast(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamAvgVehiclePerMinFromWestToEast(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamAvgVehiclePerMinFromWestToEast(SiteRequestEnUS siteRequest_, String o) {
		return SmartTrafficLight.staticSearchStrParamAvgVehiclePerMinFromWestToEast(siteRequest_, SmartTrafficLight.staticSearchParamAvgVehiclePerMinFromWestToEast(siteRequest_, SmartTrafficLight.staticSetParamAvgVehiclePerMinFromWestToEast(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&fq=entiteVar_enUS_indexed_string:paramAvgVehiclePerMinFromSouthToNorth">Find the entity paramAvgVehiclePerMinFromSouthToNorth in Solr</a>
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
		this.paramAvgVehiclePerMinFromSouthToNorth = SmartTrafficLight.staticSetParamAvgVehiclePerMinFromSouthToNorth(siteRequest_, o);
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
	protected SmartTrafficLight paramAvgVehiclePerMinFromSouthToNorthInit() {
		Wrap<BigDecimal> paramAvgVehiclePerMinFromSouthToNorthWrap = new Wrap<BigDecimal>().var("paramAvgVehiclePerMinFromSouthToNorth");
		if(paramAvgVehiclePerMinFromSouthToNorth == null) {
			_paramAvgVehiclePerMinFromSouthToNorth(paramAvgVehiclePerMinFromSouthToNorthWrap);
			Optional.ofNullable(paramAvgVehiclePerMinFromSouthToNorthWrap.getO()).ifPresent(o -> {
				setParamAvgVehiclePerMinFromSouthToNorth(o);
			});
		}
		return (SmartTrafficLight)this;
	}

	public static Double staticSearchParamAvgVehiclePerMinFromSouthToNorth(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamAvgVehiclePerMinFromSouthToNorth(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamAvgVehiclePerMinFromSouthToNorth(SiteRequestEnUS siteRequest_, String o) {
		return SmartTrafficLight.staticSearchStrParamAvgVehiclePerMinFromSouthToNorth(siteRequest_, SmartTrafficLight.staticSearchParamAvgVehiclePerMinFromSouthToNorth(siteRequest_, SmartTrafficLight.staticSetParamAvgVehiclePerMinFromSouthToNorth(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&fq=entiteVar_enUS_indexed_string:paramVehicleDemandScalingFactor">Find the entity paramVehicleDemandScalingFactor in Solr</a>
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
		this.paramVehicleDemandScalingFactor = SmartTrafficLight.staticSetParamVehicleDemandScalingFactor(siteRequest_, o);
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
	protected SmartTrafficLight paramVehicleDemandScalingFactorInit() {
		Wrap<BigDecimal> paramVehicleDemandScalingFactorWrap = new Wrap<BigDecimal>().var("paramVehicleDemandScalingFactor");
		if(paramVehicleDemandScalingFactor == null) {
			setParamVehicleDemandScalingFactor("1");
		}
		return (SmartTrafficLight)this;
	}

	public static Double staticSearchParamVehicleDemandScalingFactor(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamVehicleDemandScalingFactor(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamVehicleDemandScalingFactor(SiteRequestEnUS siteRequest_, String o) {
		return SmartTrafficLight.staticSearchStrParamVehicleDemandScalingFactor(siteRequest_, SmartTrafficLight.staticSearchParamVehicleDemandScalingFactor(siteRequest_, SmartTrafficLight.staticSetParamVehicleDemandScalingFactor(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&fq=entiteVar_enUS_indexed_string:paramAvgPedestrianPerMinFromWestToEast">Find the entity paramAvgPedestrianPerMinFromWestToEast in Solr</a>
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
		this.paramAvgPedestrianPerMinFromWestToEast = SmartTrafficLight.staticSetParamAvgPedestrianPerMinFromWestToEast(siteRequest_, o);
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
	protected SmartTrafficLight paramAvgPedestrianPerMinFromWestToEastInit() {
		Wrap<BigDecimal> paramAvgPedestrianPerMinFromWestToEastWrap = new Wrap<BigDecimal>().var("paramAvgPedestrianPerMinFromWestToEast");
		if(paramAvgPedestrianPerMinFromWestToEast == null) {
			setParamAvgPedestrianPerMinFromWestToEast("5");
		}
		return (SmartTrafficLight)this;
	}

	public static Double staticSearchParamAvgPedestrianPerMinFromWestToEast(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamAvgPedestrianPerMinFromWestToEast(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamAvgPedestrianPerMinFromWestToEast(SiteRequestEnUS siteRequest_, String o) {
		return SmartTrafficLight.staticSearchStrParamAvgPedestrianPerMinFromWestToEast(siteRequest_, SmartTrafficLight.staticSearchParamAvgPedestrianPerMinFromWestToEast(siteRequest_, SmartTrafficLight.staticSetParamAvgPedestrianPerMinFromWestToEast(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&fq=entiteVar_enUS_indexed_string:paramAvgPedestrianPerMinFromSouthToNorth">Find the entity paramAvgPedestrianPerMinFromSouthToNorth in Solr</a>
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
		this.paramAvgPedestrianPerMinFromSouthToNorth = SmartTrafficLight.staticSetParamAvgPedestrianPerMinFromSouthToNorth(siteRequest_, o);
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
	protected SmartTrafficLight paramAvgPedestrianPerMinFromSouthToNorthInit() {
		Wrap<BigDecimal> paramAvgPedestrianPerMinFromSouthToNorthWrap = new Wrap<BigDecimal>().var("paramAvgPedestrianPerMinFromSouthToNorth");
		if(paramAvgPedestrianPerMinFromSouthToNorth == null) {
			setParamAvgPedestrianPerMinFromSouthToNorth("5");
		}
		return (SmartTrafficLight)this;
	}

	public static Double staticSearchParamAvgPedestrianPerMinFromSouthToNorth(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamAvgPedestrianPerMinFromSouthToNorth(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamAvgPedestrianPerMinFromSouthToNorth(SiteRequestEnUS siteRequest_, String o) {
		return SmartTrafficLight.staticSearchStrParamAvgPedestrianPerMinFromSouthToNorth(siteRequest_, SmartTrafficLight.staticSearchParamAvgPedestrianPerMinFromSouthToNorth(siteRequest_, SmartTrafficLight.staticSetParamAvgPedestrianPerMinFromSouthToNorth(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&fq=entiteVar_enUS_indexed_string:paramPedestrianDemandScalingFactor">Find the entity paramPedestrianDemandScalingFactor in Solr</a>
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
		this.paramPedestrianDemandScalingFactor = SmartTrafficLight.staticSetParamPedestrianDemandScalingFactor(siteRequest_, o);
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
	protected SmartTrafficLight paramPedestrianDemandScalingFactorInit() {
		Wrap<BigDecimal> paramPedestrianDemandScalingFactorWrap = new Wrap<BigDecimal>().var("paramPedestrianDemandScalingFactor");
		if(paramPedestrianDemandScalingFactor == null) {
			setParamPedestrianDemandScalingFactor("1");
		}
		return (SmartTrafficLight)this;
	}

	public static Double staticSearchParamPedestrianDemandScalingFactor(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamPedestrianDemandScalingFactor(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamPedestrianDemandScalingFactor(SiteRequestEnUS siteRequest_, String o) {
		return SmartTrafficLight.staticSearchStrParamPedestrianDemandScalingFactor(siteRequest_, SmartTrafficLight.staticSearchParamPedestrianDemandScalingFactor(siteRequest_, SmartTrafficLight.staticSetParamPedestrianDemandScalingFactor(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&fq=entiteVar_enUS_indexed_string:paramDemandScale">Find the entity paramDemandScale in Solr</a>
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
		BigDecimal l = SmartTrafficLight.staticSetParamDemandScale(siteRequest_, o);
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
	public SmartTrafficLight addParamDemandScale(BigDecimal...objects) {
		for(BigDecimal o : objects) {
			addParamDemandScale(o);
		}
		return (SmartTrafficLight)this;
	}
	public SmartTrafficLight addParamDemandScale(BigDecimal o) {
		if(o != null)
			this.paramDemandScale.add(o);
		return (SmartTrafficLight)this;
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
	public SmartTrafficLight addParamDemandScale(String o) {
		if(NumberUtils.isParsable(o)) {
			BigDecimal p = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
			addParamDemandScale(p);
		}
		return (SmartTrafficLight)this;
	}
	protected SmartTrafficLight paramDemandScaleInit() {
		_paramDemandScale(paramDemandScale);
		return (SmartTrafficLight)this;
	}

	public static BigDecimal staticSearchParamDemandScale(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o;
	}

	public static String staticSearchStrParamDemandScale(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamDemandScale(SiteRequestEnUS siteRequest_, String o) {
		return SmartTrafficLight.staticSearchStrParamDemandScale(siteRequest_, SmartTrafficLight.staticSearchParamDemandScale(siteRequest_, SmartTrafficLight.staticSetParamDemandScale(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&fq=entiteVar_enUS_indexed_string:paramMinGreenTimeSecWestEast">Find the entity paramMinGreenTimeSecWestEast in Solr</a>
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
		this.paramMinGreenTimeSecWestEast = SmartTrafficLight.staticSetParamMinGreenTimeSecWestEast(siteRequest_, o);
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
	protected SmartTrafficLight paramMinGreenTimeSecWestEastInit() {
		Wrap<BigDecimal> paramMinGreenTimeSecWestEastWrap = new Wrap<BigDecimal>().var("paramMinGreenTimeSecWestEast");
		if(paramMinGreenTimeSecWestEast == null) {
			_paramMinGreenTimeSecWestEast(paramMinGreenTimeSecWestEastWrap);
			Optional.ofNullable(paramMinGreenTimeSecWestEastWrap.getO()).ifPresent(o -> {
				setParamMinGreenTimeSecWestEast(o);
			});
		}
		return (SmartTrafficLight)this;
	}

	public static Double staticSearchParamMinGreenTimeSecWestEast(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamMinGreenTimeSecWestEast(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamMinGreenTimeSecWestEast(SiteRequestEnUS siteRequest_, String o) {
		return SmartTrafficLight.staticSearchStrParamMinGreenTimeSecWestEast(siteRequest_, SmartTrafficLight.staticSearchParamMinGreenTimeSecWestEast(siteRequest_, SmartTrafficLight.staticSetParamMinGreenTimeSecWestEast(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&fq=entiteVar_enUS_indexed_string:paramMaxGreenTimeSecWestEast">Find the entity paramMaxGreenTimeSecWestEast in Solr</a>
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
		this.paramMaxGreenTimeSecWestEast = SmartTrafficLight.staticSetParamMaxGreenTimeSecWestEast(siteRequest_, o);
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
	protected SmartTrafficLight paramMaxGreenTimeSecWestEastInit() {
		Wrap<BigDecimal> paramMaxGreenTimeSecWestEastWrap = new Wrap<BigDecimal>().var("paramMaxGreenTimeSecWestEast");
		if(paramMaxGreenTimeSecWestEast == null) {
			_paramMaxGreenTimeSecWestEast(paramMaxGreenTimeSecWestEastWrap);
			Optional.ofNullable(paramMaxGreenTimeSecWestEastWrap.getO()).ifPresent(o -> {
				setParamMaxGreenTimeSecWestEast(o);
			});
		}
		return (SmartTrafficLight)this;
	}

	public static Double staticSearchParamMaxGreenTimeSecWestEast(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamMaxGreenTimeSecWestEast(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamMaxGreenTimeSecWestEast(SiteRequestEnUS siteRequest_, String o) {
		return SmartTrafficLight.staticSearchStrParamMaxGreenTimeSecWestEast(siteRequest_, SmartTrafficLight.staticSearchParamMaxGreenTimeSecWestEast(siteRequest_, SmartTrafficLight.staticSetParamMaxGreenTimeSecWestEast(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&fq=entiteVar_enUS_indexed_string:paramMinGreenTimeSecSouthNorth">Find the entity paramMinGreenTimeSecSouthNorth in Solr</a>
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
		this.paramMinGreenTimeSecSouthNorth = SmartTrafficLight.staticSetParamMinGreenTimeSecSouthNorth(siteRequest_, o);
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
	protected SmartTrafficLight paramMinGreenTimeSecSouthNorthInit() {
		Wrap<BigDecimal> paramMinGreenTimeSecSouthNorthWrap = new Wrap<BigDecimal>().var("paramMinGreenTimeSecSouthNorth");
		if(paramMinGreenTimeSecSouthNorth == null) {
			_paramMinGreenTimeSecSouthNorth(paramMinGreenTimeSecSouthNorthWrap);
			Optional.ofNullable(paramMinGreenTimeSecSouthNorthWrap.getO()).ifPresent(o -> {
				setParamMinGreenTimeSecSouthNorth(o);
			});
		}
		return (SmartTrafficLight)this;
	}

	public static Double staticSearchParamMinGreenTimeSecSouthNorth(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamMinGreenTimeSecSouthNorth(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamMinGreenTimeSecSouthNorth(SiteRequestEnUS siteRequest_, String o) {
		return SmartTrafficLight.staticSearchStrParamMinGreenTimeSecSouthNorth(siteRequest_, SmartTrafficLight.staticSearchParamMinGreenTimeSecSouthNorth(siteRequest_, SmartTrafficLight.staticSetParamMinGreenTimeSecSouthNorth(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&fq=entiteVar_enUS_indexed_string:paramMaxGreenTimeSecSouthNorth">Find the entity paramMaxGreenTimeSecSouthNorth in Solr</a>
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
		this.paramMaxGreenTimeSecSouthNorth = SmartTrafficLight.staticSetParamMaxGreenTimeSecSouthNorth(siteRequest_, o);
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
	protected SmartTrafficLight paramMaxGreenTimeSecSouthNorthInit() {
		Wrap<BigDecimal> paramMaxGreenTimeSecSouthNorthWrap = new Wrap<BigDecimal>().var("paramMaxGreenTimeSecSouthNorth");
		if(paramMaxGreenTimeSecSouthNorth == null) {
			_paramMaxGreenTimeSecSouthNorth(paramMaxGreenTimeSecSouthNorthWrap);
			Optional.ofNullable(paramMaxGreenTimeSecSouthNorthWrap.getO()).ifPresent(o -> {
				setParamMaxGreenTimeSecSouthNorth(o);
			});
		}
		return (SmartTrafficLight)this;
	}

	public static Double staticSearchParamMaxGreenTimeSecSouthNorth(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamMaxGreenTimeSecSouthNorth(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamMaxGreenTimeSecSouthNorth(SiteRequestEnUS siteRequest_, String o) {
		return SmartTrafficLight.staticSearchStrParamMaxGreenTimeSecSouthNorth(siteRequest_, SmartTrafficLight.staticSearchParamMaxGreenTimeSecSouthNorth(siteRequest_, SmartTrafficLight.staticSetParamMaxGreenTimeSecSouthNorth(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&fq=entiteVar_enUS_indexed_string:paramPedestrianWaitThresholdSecNorthSouth">Find the entity paramPedestrianWaitThresholdSecNorthSouth in Solr</a>
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
		this.paramPedestrianWaitThresholdSecNorthSouth = SmartTrafficLight.staticSetParamPedestrianWaitThresholdSecNorthSouth(siteRequest_, o);
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
	protected SmartTrafficLight paramPedestrianWaitThresholdSecNorthSouthInit() {
		Wrap<BigDecimal> paramPedestrianWaitThresholdSecNorthSouthWrap = new Wrap<BigDecimal>().var("paramPedestrianWaitThresholdSecNorthSouth");
		if(paramPedestrianWaitThresholdSecNorthSouth == null) {
			setParamPedestrianWaitThresholdSecNorthSouth("10");
		}
		return (SmartTrafficLight)this;
	}

	public static Double staticSearchParamPedestrianWaitThresholdSecNorthSouth(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamPedestrianWaitThresholdSecNorthSouth(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamPedestrianWaitThresholdSecNorthSouth(SiteRequestEnUS siteRequest_, String o) {
		return SmartTrafficLight.staticSearchStrParamPedestrianWaitThresholdSecNorthSouth(siteRequest_, SmartTrafficLight.staticSearchParamPedestrianWaitThresholdSecNorthSouth(siteRequest_, SmartTrafficLight.staticSetParamPedestrianWaitThresholdSecNorthSouth(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&fq=entiteVar_enUS_indexed_string:paramPedestrianWaitThresholdSecWestEast">Find the entity paramPedestrianWaitThresholdSecWestEast in Solr</a>
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
		this.paramPedestrianWaitThresholdSecWestEast = SmartTrafficLight.staticSetParamPedestrianWaitThresholdSecWestEast(siteRequest_, o);
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
	protected SmartTrafficLight paramPedestrianWaitThresholdSecWestEastInit() {
		Wrap<BigDecimal> paramPedestrianWaitThresholdSecWestEastWrap = new Wrap<BigDecimal>().var("paramPedestrianWaitThresholdSecWestEast");
		if(paramPedestrianWaitThresholdSecWestEast == null) {
			setParamPedestrianWaitThresholdSecWestEast("10");
		}
		return (SmartTrafficLight)this;
	}

	public static Double staticSearchParamPedestrianWaitThresholdSecWestEast(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamPedestrianWaitThresholdSecWestEast(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamPedestrianWaitThresholdSecWestEast(SiteRequestEnUS siteRequest_, String o) {
		return SmartTrafficLight.staticSearchStrParamPedestrianWaitThresholdSecWestEast(siteRequest_, SmartTrafficLight.staticSearchParamPedestrianWaitThresholdSecWestEast(siteRequest_, SmartTrafficLight.staticSetParamPedestrianWaitThresholdSecWestEast(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&fq=entiteVar_enUS_indexed_string:paramVehicleQueueThresholdWestEast">Find the entity paramVehicleQueueThresholdWestEast in Solr</a>
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
		this.paramVehicleQueueThresholdWestEast = SmartTrafficLight.staticSetParamVehicleQueueThresholdWestEast(siteRequest_, o);
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
	protected SmartTrafficLight paramVehicleQueueThresholdWestEastInit() {
		Wrap<BigDecimal> paramVehicleQueueThresholdWestEastWrap = new Wrap<BigDecimal>().var("paramVehicleQueueThresholdWestEast");
		if(paramVehicleQueueThresholdWestEast == null) {
			_paramVehicleQueueThresholdWestEast(paramVehicleQueueThresholdWestEastWrap);
			Optional.ofNullable(paramVehicleQueueThresholdWestEastWrap.getO()).ifPresent(o -> {
				setParamVehicleQueueThresholdWestEast(o);
			});
		}
		return (SmartTrafficLight)this;
	}

	public static Double staticSearchParamVehicleQueueThresholdWestEast(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamVehicleQueueThresholdWestEast(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamVehicleQueueThresholdWestEast(SiteRequestEnUS siteRequest_, String o) {
		return SmartTrafficLight.staticSearchStrParamVehicleQueueThresholdWestEast(siteRequest_, SmartTrafficLight.staticSearchParamVehicleQueueThresholdWestEast(siteRequest_, SmartTrafficLight.staticSetParamVehicleQueueThresholdWestEast(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&fq=entiteVar_enUS_indexed_string:paramVehicleQueueThresholdSouthNorth">Find the entity paramVehicleQueueThresholdSouthNorth in Solr</a>
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
		this.paramVehicleQueueThresholdSouthNorth = SmartTrafficLight.staticSetParamVehicleQueueThresholdSouthNorth(siteRequest_, o);
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
	protected SmartTrafficLight paramVehicleQueueThresholdSouthNorthInit() {
		Wrap<BigDecimal> paramVehicleQueueThresholdSouthNorthWrap = new Wrap<BigDecimal>().var("paramVehicleQueueThresholdSouthNorth");
		if(paramVehicleQueueThresholdSouthNorth == null) {
			_paramVehicleQueueThresholdSouthNorth(paramVehicleQueueThresholdSouthNorthWrap);
			Optional.ofNullable(paramVehicleQueueThresholdSouthNorthWrap.getO()).ifPresent(o -> {
				setParamVehicleQueueThresholdSouthNorth(o);
			});
		}
		return (SmartTrafficLight)this;
	}

	public static Double staticSearchParamVehicleQueueThresholdSouthNorth(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamVehicleQueueThresholdSouthNorth(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamVehicleQueueThresholdSouthNorth(SiteRequestEnUS siteRequest_, String o) {
		return SmartTrafficLight.staticSearchStrParamVehicleQueueThresholdSouthNorth(siteRequest_, SmartTrafficLight.staticSearchParamVehicleQueueThresholdSouthNorth(siteRequest_, SmartTrafficLight.staticSetParamVehicleQueueThresholdSouthNorth(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&fq=entiteVar_enUS_indexed_string:paramPedestrianQueueThresholdNorthSouth">Find the entity paramPedestrianQueueThresholdNorthSouth in Solr</a>
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
		this.paramPedestrianQueueThresholdNorthSouth = SmartTrafficLight.staticSetParamPedestrianQueueThresholdNorthSouth(siteRequest_, o);
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
	protected SmartTrafficLight paramPedestrianQueueThresholdNorthSouthInit() {
		Wrap<BigDecimal> paramPedestrianQueueThresholdNorthSouthWrap = new Wrap<BigDecimal>().var("paramPedestrianQueueThresholdNorthSouth");
		if(paramPedestrianQueueThresholdNorthSouth == null) {
			setParamPedestrianQueueThresholdNorthSouth("6");
		}
		return (SmartTrafficLight)this;
	}

	public static Double staticSearchParamPedestrianQueueThresholdNorthSouth(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamPedestrianQueueThresholdNorthSouth(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamPedestrianQueueThresholdNorthSouth(SiteRequestEnUS siteRequest_, String o) {
		return SmartTrafficLight.staticSearchStrParamPedestrianQueueThresholdNorthSouth(siteRequest_, SmartTrafficLight.staticSearchParamPedestrianQueueThresholdNorthSouth(siteRequest_, SmartTrafficLight.staticSetParamPedestrianQueueThresholdNorthSouth(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&fq=entiteVar_enUS_indexed_string:paramPedestrianQueueThresholdWestEast">Find the entity paramPedestrianQueueThresholdWestEast in Solr</a>
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
		this.paramPedestrianQueueThresholdWestEast = SmartTrafficLight.staticSetParamPedestrianQueueThresholdWestEast(siteRequest_, o);
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
	protected SmartTrafficLight paramPedestrianQueueThresholdWestEastInit() {
		Wrap<BigDecimal> paramPedestrianQueueThresholdWestEastWrap = new Wrap<BigDecimal>().var("paramPedestrianQueueThresholdWestEast");
		if(paramPedestrianQueueThresholdWestEast == null) {
			setParamPedestrianQueueThresholdWestEast("6");
		}
		return (SmartTrafficLight)this;
	}

	public static Double staticSearchParamPedestrianQueueThresholdWestEast(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamPedestrianQueueThresholdWestEast(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamPedestrianQueueThresholdWestEast(SiteRequestEnUS siteRequest_, String o) {
		return SmartTrafficLight.staticSearchStrParamPedestrianQueueThresholdWestEast(siteRequest_, SmartTrafficLight.staticSearchParamPedestrianQueueThresholdWestEast(siteRequest_, SmartTrafficLight.staticSetParamPedestrianQueueThresholdWestEast(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&fq=entiteVar_enUS_indexed_string:paramStepSize">Find the entity paramStepSize in Solr</a>
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
		this.paramStepSize = SmartTrafficLight.staticSetParamStepSize(siteRequest_, o);
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
	protected SmartTrafficLight paramStepSizeInit() {
		Wrap<BigDecimal> paramStepSizeWrap = new Wrap<BigDecimal>().var("paramStepSize");
		if(paramStepSize == null) {
			setParamStepSize("1");
		}
		return (SmartTrafficLight)this;
	}

	public static Double staticSearchParamStepSize(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamStepSize(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamStepSize(SiteRequestEnUS siteRequest_, String o) {
		return SmartTrafficLight.staticSearchStrParamStepSize(siteRequest_, SmartTrafficLight.staticSearchParamStepSize(siteRequest_, SmartTrafficLight.staticSetParamStepSize(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&fq=entiteVar_enUS_indexed_string:paramRunTime">Find the entity paramRunTime in Solr</a>
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
		this.paramRunTime = SmartTrafficLight.staticSetParamRunTime(siteRequest_, o);
	}
	public static Integer staticSetParamRunTime(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected SmartTrafficLight paramRunTimeInit() {
		Wrap<Integer> paramRunTimeWrap = new Wrap<Integer>().var("paramRunTime");
		if(paramRunTime == null) {
			setParamRunTime("1000");
		}
		return (SmartTrafficLight)this;
	}

	public static Integer staticSearchParamRunTime(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrParamRunTime(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamRunTime(SiteRequestEnUS siteRequest_, String o) {
		return SmartTrafficLight.staticSearchStrParamRunTime(siteRequest_, SmartTrafficLight.staticSearchParamRunTime(siteRequest_, SmartTrafficLight.staticSetParamRunTime(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&fq=entiteVar_enUS_indexed_string:paramItersPerPar">Find the entity paramItersPerPar in Solr</a>
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
		this.paramItersPerPar = SmartTrafficLight.staticSetParamItersPerPar(siteRequest_, o);
	}
	public static Integer staticSetParamItersPerPar(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected SmartTrafficLight paramItersPerParInit() {
		Wrap<Integer> paramItersPerParWrap = new Wrap<Integer>().var("paramItersPerPar");
		if(paramItersPerPar == null) {
			setParamItersPerPar("3");
		}
		return (SmartTrafficLight)this;
	}

	public static Integer staticSearchParamItersPerPar(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrParamItersPerPar(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamItersPerPar(SiteRequestEnUS siteRequest_, String o) {
		return SmartTrafficLight.staticSearchStrParamItersPerPar(siteRequest_, SmartTrafficLight.staticSearchParamItersPerPar(siteRequest_, SmartTrafficLight.staticSetParamItersPerPar(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&fq=entiteVar_enUS_indexed_string:paramTotalIterNum">Find the entity paramTotalIterNum in Solr</a>
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
		this.paramTotalIterNum = SmartTrafficLight.staticSetParamTotalIterNum(siteRequest_, o);
	}
	public static Integer staticSetParamTotalIterNum(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected SmartTrafficLight paramTotalIterNumInit() {
		Wrap<Integer> paramTotalIterNumWrap = new Wrap<Integer>().var("paramTotalIterNum");
		if(paramTotalIterNum == null) {
			setParamTotalIterNum("5");
		}
		return (SmartTrafficLight)this;
	}

	public static Integer staticSearchParamTotalIterNum(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrParamTotalIterNum(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamTotalIterNum(SiteRequestEnUS siteRequest_, String o) {
		return SmartTrafficLight.staticSearchStrParamTotalIterNum(siteRequest_, SmartTrafficLight.staticSearchParamTotalIterNum(siteRequest_, SmartTrafficLight.staticSetParamTotalIterNum(siteRequest_, o)));
	}

	public Integer sqlParamTotalIterNum() {
		return paramTotalIterNum;
	}

	////////////////
	// reportKeys //
	////////////////


	/**	 The entity reportKeys
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonSerialize(contentUsing = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected List<Long> reportKeys = new ArrayList<Long>();

	/**	<br> The entity reportKeys
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&fq=entiteVar_enUS_indexed_string:reportKeys">Find the entity reportKeys in Solr</a>
	 * <br>
	 * @param w is the entity already constructed. 
	 **/
	protected abstract void _reportKeys(List<Long> w);

	public List<Long> getReportKeys() {
		return reportKeys;
	}

	public void setReportKeys(List<Long> reportKeys) {
		this.reportKeys = reportKeys;
	}
	@JsonIgnore
	public void setReportKeys(String o) {
		Long l = SmartTrafficLight.staticSetReportKeys(siteRequest_, o);
		if(l != null)
			addReportKeys(l);
	}
	public static Long staticSetReportKeys(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	public SmartTrafficLight addReportKeys(Long...objects) {
		for(Long o : objects) {
			addReportKeys(o);
		}
		return (SmartTrafficLight)this;
	}
	public SmartTrafficLight addReportKeys(Long o) {
		if(o != null)
			this.reportKeys.add(o);
		return (SmartTrafficLight)this;
	}
	@JsonIgnore
	public void setReportKeys(JsonArray objects) {
		reportKeys.clear();
		if(objects == null)
			return;
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			setReportKeys(o);
		}
	}
	public SmartTrafficLight addReportKeys(String o) {
		if(NumberUtils.isParsable(o)) {
			Long p = Long.parseLong(o);
			addReportKeys(p);
		}
		return (SmartTrafficLight)this;
	}
	protected SmartTrafficLight reportKeysInit() {
		_reportKeys(reportKeys);
		return (SmartTrafficLight)this;
	}

	public static Long staticSearchReportKeys(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrReportKeys(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqReportKeys(SiteRequestEnUS siteRequest_, String o) {
		return SmartTrafficLight.staticSearchStrReportKeys(siteRequest_, SmartTrafficLight.staticSearchReportKeys(siteRequest_, SmartTrafficLight.staticSetReportKeys(siteRequest_, o)));
	}

	public Number[] sqlReportKeys() {
		return reportKeys.stream().map(v -> (Number)v).toArray(Number[]::new);
	}

	////////////////////
	// tlsStatesPaths //
	////////////////////


	/**	 The entity tlsStatesPaths
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> tlsStatesPaths = new ArrayList<String>();

	/**	<br> The entity tlsStatesPaths
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&fq=entiteVar_enUS_indexed_string:tlsStatesPaths">Find the entity tlsStatesPaths in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _tlsStatesPaths(List<String> l);

	public List<String> getTlsStatesPaths() {
		return tlsStatesPaths;
	}

	public void setTlsStatesPaths(List<String> tlsStatesPaths) {
		this.tlsStatesPaths = tlsStatesPaths;
	}
	public void setTlsStatesPaths(String o) {
		String l = SmartTrafficLight.staticSetTlsStatesPaths(siteRequest_, o);
		if(l != null)
			addTlsStatesPaths(l);
	}
	public static String staticSetTlsStatesPaths(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public SmartTrafficLight addTlsStatesPaths(String...objects) {
		for(String o : objects) {
			addTlsStatesPaths(o);
		}
		return (SmartTrafficLight)this;
	}
	public SmartTrafficLight addTlsStatesPaths(String o) {
		if(o != null)
			this.tlsStatesPaths.add(o);
		return (SmartTrafficLight)this;
	}
	@JsonIgnore
	public void setTlsStatesPaths(JsonArray objects) {
		tlsStatesPaths.clear();
		if(objects == null)
			return;
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addTlsStatesPaths(o);
		}
	}
	protected SmartTrafficLight tlsStatesPathsInit() {
		_tlsStatesPaths(tlsStatesPaths);
		return (SmartTrafficLight)this;
	}

	public static String staticSearchTlsStatesPaths(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrTlsStatesPaths(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqTlsStatesPaths(SiteRequestEnUS siteRequest_, String o) {
		return SmartTrafficLight.staticSearchStrTlsStatesPaths(siteRequest_, SmartTrafficLight.staticSearchTlsStatesPaths(siteRequest_, SmartTrafficLight.staticSetTlsStatesPaths(siteRequest_, o)));
	}

	/////////////////////////
	// additionalFilePaths //
	/////////////////////////


	/**	 The entity additionalFilePaths
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> additionalFilePaths = new ArrayList<String>();

	/**	<br> The entity additionalFilePaths
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight&fq=entiteVar_enUS_indexed_string:additionalFilePaths">Find the entity additionalFilePaths in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _additionalFilePaths(List<String> l);

	public List<String> getAdditionalFilePaths() {
		return additionalFilePaths;
	}

	public void setAdditionalFilePaths(List<String> additionalFilePaths) {
		this.additionalFilePaths = additionalFilePaths;
	}
	public void setAdditionalFilePaths(String o) {
		String l = SmartTrafficLight.staticSetAdditionalFilePaths(siteRequest_, o);
		if(l != null)
			addAdditionalFilePaths(l);
	}
	public static String staticSetAdditionalFilePaths(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public SmartTrafficLight addAdditionalFilePaths(String...objects) {
		for(String o : objects) {
			addAdditionalFilePaths(o);
		}
		return (SmartTrafficLight)this;
	}
	public SmartTrafficLight addAdditionalFilePaths(String o) {
		if(o != null)
			this.additionalFilePaths.add(o);
		return (SmartTrafficLight)this;
	}
	@JsonIgnore
	public void setAdditionalFilePaths(JsonArray objects) {
		additionalFilePaths.clear();
		if(objects == null)
			return;
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addAdditionalFilePaths(o);
		}
	}
	protected SmartTrafficLight additionalFilePathsInit() {
		_additionalFilePaths(additionalFilePaths);
		return (SmartTrafficLight)this;
	}

	public static String staticSearchAdditionalFilePaths(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrAdditionalFilePaths(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAdditionalFilePaths(SiteRequestEnUS siteRequest_, String o) {
		return SmartTrafficLight.staticSearchStrAdditionalFilePaths(siteRequest_, SmartTrafficLight.staticSearchAdditionalFilePaths(siteRequest_, SmartTrafficLight.staticSetAdditionalFilePaths(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepSmartTrafficLight(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepSmartTrafficLight();
	}

	public Future<Void> promiseDeepSmartTrafficLight() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseSmartTrafficLight(promise2);
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

	public Future<Void> promiseSmartTrafficLight(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				entityIdInit();
				smartTrafficLightNameInit();
				routeIdNorthInit();
				routeIdEastInit();
				trafficFlowObservedIdsInit();
				promise2.complete();
			} catch(Exception ex) {
				promise2.fail(ex);
			}
			return promise2.future();
		}).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			trafficFlowObservedSearchPromise().onSuccess(trafficFlowObservedSearch -> {
				promise2.complete();
			}).onFailure(ex -> {
				promise2.fail(ex);
			});
			return promise2.future();
		}).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				trafficFlowObservedsInit();
				trafficFlowObservedNorth_Init();
				trafficFlowObservedEast_Init();
				paramAvgVehiclePerMinFromWestToEastInit();
				paramAvgVehiclePerMinFromSouthToNorthInit();
				paramVehicleDemandScalingFactorInit();
				paramAvgPedestrianPerMinFromWestToEastInit();
				paramAvgPedestrianPerMinFromSouthToNorthInit();
				paramPedestrianDemandScalingFactorInit();
				paramDemandScaleInit();
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
				paramStepSizeInit();
				paramRunTimeInit();
				paramItersPerParInit();
				paramTotalIterNumInit();
				reportKeysInit();
				tlsStatesPathsInit();
				additionalFilePathsInit();
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
		return promiseDeepSmartTrafficLight(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestSmartTrafficLight(SiteRequestEnUS siteRequest_) {
			super.siteRequestBaseModel(siteRequest_);
		if(trafficFlowObservedSearch != null)
			trafficFlowObservedSearch.setSiteRequest_(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestSmartTrafficLight(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainSmartTrafficLight(v);
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
	public Object obtainSmartTrafficLight(String var) {
		SmartTrafficLight oSmartTrafficLight = (SmartTrafficLight)this;
		switch(var) {
			case "entityId":
				return oSmartTrafficLight.entityId;
			case "smartTrafficLightName":
				return oSmartTrafficLight.smartTrafficLightName;
			case "routeIdNorth":
				return oSmartTrafficLight.routeIdNorth;
			case "routeIdEast":
				return oSmartTrafficLight.routeIdEast;
			case "trafficFlowObservedIds":
				return oSmartTrafficLight.trafficFlowObservedIds;
			case "trafficFlowObservedSearch":
				return oSmartTrafficLight.trafficFlowObservedSearch;
			case "trafficFlowObserveds":
				return oSmartTrafficLight.trafficFlowObserveds;
			case "trafficFlowObservedNorth_":
				return oSmartTrafficLight.trafficFlowObservedNorth_;
			case "trafficFlowObservedEast_":
				return oSmartTrafficLight.trafficFlowObservedEast_;
			case "paramAvgVehiclePerMinFromWestToEast":
				return oSmartTrafficLight.paramAvgVehiclePerMinFromWestToEast;
			case "paramAvgVehiclePerMinFromSouthToNorth":
				return oSmartTrafficLight.paramAvgVehiclePerMinFromSouthToNorth;
			case "paramVehicleDemandScalingFactor":
				return oSmartTrafficLight.paramVehicleDemandScalingFactor;
			case "paramAvgPedestrianPerMinFromWestToEast":
				return oSmartTrafficLight.paramAvgPedestrianPerMinFromWestToEast;
			case "paramAvgPedestrianPerMinFromSouthToNorth":
				return oSmartTrafficLight.paramAvgPedestrianPerMinFromSouthToNorth;
			case "paramPedestrianDemandScalingFactor":
				return oSmartTrafficLight.paramPedestrianDemandScalingFactor;
			case "paramDemandScale":
				return oSmartTrafficLight.paramDemandScale;
			case "paramMinGreenTimeSecWestEast":
				return oSmartTrafficLight.paramMinGreenTimeSecWestEast;
			case "paramMaxGreenTimeSecWestEast":
				return oSmartTrafficLight.paramMaxGreenTimeSecWestEast;
			case "paramMinGreenTimeSecSouthNorth":
				return oSmartTrafficLight.paramMinGreenTimeSecSouthNorth;
			case "paramMaxGreenTimeSecSouthNorth":
				return oSmartTrafficLight.paramMaxGreenTimeSecSouthNorth;
			case "paramPedestrianWaitThresholdSecNorthSouth":
				return oSmartTrafficLight.paramPedestrianWaitThresholdSecNorthSouth;
			case "paramPedestrianWaitThresholdSecWestEast":
				return oSmartTrafficLight.paramPedestrianWaitThresholdSecWestEast;
			case "paramVehicleQueueThresholdWestEast":
				return oSmartTrafficLight.paramVehicleQueueThresholdWestEast;
			case "paramVehicleQueueThresholdSouthNorth":
				return oSmartTrafficLight.paramVehicleQueueThresholdSouthNorth;
			case "paramPedestrianQueueThresholdNorthSouth":
				return oSmartTrafficLight.paramPedestrianQueueThresholdNorthSouth;
			case "paramPedestrianQueueThresholdWestEast":
				return oSmartTrafficLight.paramPedestrianQueueThresholdWestEast;
			case "paramStepSize":
				return oSmartTrafficLight.paramStepSize;
			case "paramRunTime":
				return oSmartTrafficLight.paramRunTime;
			case "paramItersPerPar":
				return oSmartTrafficLight.paramItersPerPar;
			case "paramTotalIterNum":
				return oSmartTrafficLight.paramTotalIterNum;
			case "reportKeys":
				return oSmartTrafficLight.reportKeys;
			case "tlsStatesPaths":
				return oSmartTrafficLight.tlsStatesPaths;
			case "additionalFilePaths":
				return oSmartTrafficLight.additionalFilePaths;
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
				o = relateSmartTrafficLight(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateSmartTrafficLight(String var, Object val) {
		SmartTrafficLight oSmartTrafficLight = (SmartTrafficLight)this;
		switch(var) {
			case "reportKeys":
				oSmartTrafficLight.addReportKeys((Long)val);
				if(!saves.contains("reportKeys"))
					saves.add("reportKeys");
				return val;
			default:
				return super.relateBaseModel(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetSmartTrafficLight(entityVar,  siteRequest_, o);
	}
	public static Object staticSetSmartTrafficLight(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "entityId":
			return SmartTrafficLight.staticSetEntityId(siteRequest_, o);
		case "smartTrafficLightName":
			return SmartTrafficLight.staticSetSmartTrafficLightName(siteRequest_, o);
		case "routeIdNorth":
			return SmartTrafficLight.staticSetRouteIdNorth(siteRequest_, o);
		case "routeIdEast":
			return SmartTrafficLight.staticSetRouteIdEast(siteRequest_, o);
		case "trafficFlowObservedIds":
			return SmartTrafficLight.staticSetTrafficFlowObservedIds(siteRequest_, o);
		case "paramAvgVehiclePerMinFromWestToEast":
			return SmartTrafficLight.staticSetParamAvgVehiclePerMinFromWestToEast(siteRequest_, o);
		case "paramAvgVehiclePerMinFromSouthToNorth":
			return SmartTrafficLight.staticSetParamAvgVehiclePerMinFromSouthToNorth(siteRequest_, o);
		case "paramVehicleDemandScalingFactor":
			return SmartTrafficLight.staticSetParamVehicleDemandScalingFactor(siteRequest_, o);
		case "paramAvgPedestrianPerMinFromWestToEast":
			return SmartTrafficLight.staticSetParamAvgPedestrianPerMinFromWestToEast(siteRequest_, o);
		case "paramAvgPedestrianPerMinFromSouthToNorth":
			return SmartTrafficLight.staticSetParamAvgPedestrianPerMinFromSouthToNorth(siteRequest_, o);
		case "paramPedestrianDemandScalingFactor":
			return SmartTrafficLight.staticSetParamPedestrianDemandScalingFactor(siteRequest_, o);
		case "paramDemandScale":
			return SmartTrafficLight.staticSetParamDemandScale(siteRequest_, o);
		case "paramMinGreenTimeSecWestEast":
			return SmartTrafficLight.staticSetParamMinGreenTimeSecWestEast(siteRequest_, o);
		case "paramMaxGreenTimeSecWestEast":
			return SmartTrafficLight.staticSetParamMaxGreenTimeSecWestEast(siteRequest_, o);
		case "paramMinGreenTimeSecSouthNorth":
			return SmartTrafficLight.staticSetParamMinGreenTimeSecSouthNorth(siteRequest_, o);
		case "paramMaxGreenTimeSecSouthNorth":
			return SmartTrafficLight.staticSetParamMaxGreenTimeSecSouthNorth(siteRequest_, o);
		case "paramPedestrianWaitThresholdSecNorthSouth":
			return SmartTrafficLight.staticSetParamPedestrianWaitThresholdSecNorthSouth(siteRequest_, o);
		case "paramPedestrianWaitThresholdSecWestEast":
			return SmartTrafficLight.staticSetParamPedestrianWaitThresholdSecWestEast(siteRequest_, o);
		case "paramVehicleQueueThresholdWestEast":
			return SmartTrafficLight.staticSetParamVehicleQueueThresholdWestEast(siteRequest_, o);
		case "paramVehicleQueueThresholdSouthNorth":
			return SmartTrafficLight.staticSetParamVehicleQueueThresholdSouthNorth(siteRequest_, o);
		case "paramPedestrianQueueThresholdNorthSouth":
			return SmartTrafficLight.staticSetParamPedestrianQueueThresholdNorthSouth(siteRequest_, o);
		case "paramPedestrianQueueThresholdWestEast":
			return SmartTrafficLight.staticSetParamPedestrianQueueThresholdWestEast(siteRequest_, o);
		case "paramStepSize":
			return SmartTrafficLight.staticSetParamStepSize(siteRequest_, o);
		case "paramRunTime":
			return SmartTrafficLight.staticSetParamRunTime(siteRequest_, o);
		case "paramItersPerPar":
			return SmartTrafficLight.staticSetParamItersPerPar(siteRequest_, o);
		case "paramTotalIterNum":
			return SmartTrafficLight.staticSetParamTotalIterNum(siteRequest_, o);
		case "reportKeys":
			return SmartTrafficLight.staticSetReportKeys(siteRequest_, o);
		case "tlsStatesPaths":
			return SmartTrafficLight.staticSetTlsStatesPaths(siteRequest_, o);
		case "additionalFilePaths":
			return SmartTrafficLight.staticSetAdditionalFilePaths(siteRequest_, o);
			default:
				return BaseModel.staticSetBaseModel(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchSmartTrafficLight(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchSmartTrafficLight(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "entityId":
			return SmartTrafficLight.staticSearchEntityId(siteRequest_, (String)o);
		case "smartTrafficLightName":
			return SmartTrafficLight.staticSearchSmartTrafficLightName(siteRequest_, (String)o);
		case "routeIdNorth":
			return SmartTrafficLight.staticSearchRouteIdNorth(siteRequest_, (String)o);
		case "routeIdEast":
			return SmartTrafficLight.staticSearchRouteIdEast(siteRequest_, (String)o);
		case "trafficFlowObservedIds":
			return SmartTrafficLight.staticSearchTrafficFlowObservedIds(siteRequest_, (String)o);
		case "paramAvgVehiclePerMinFromWestToEast":
			return SmartTrafficLight.staticSearchParamAvgVehiclePerMinFromWestToEast(siteRequest_, (BigDecimal)o);
		case "paramAvgVehiclePerMinFromSouthToNorth":
			return SmartTrafficLight.staticSearchParamAvgVehiclePerMinFromSouthToNorth(siteRequest_, (BigDecimal)o);
		case "paramVehicleDemandScalingFactor":
			return SmartTrafficLight.staticSearchParamVehicleDemandScalingFactor(siteRequest_, (BigDecimal)o);
		case "paramAvgPedestrianPerMinFromWestToEast":
			return SmartTrafficLight.staticSearchParamAvgPedestrianPerMinFromWestToEast(siteRequest_, (BigDecimal)o);
		case "paramAvgPedestrianPerMinFromSouthToNorth":
			return SmartTrafficLight.staticSearchParamAvgPedestrianPerMinFromSouthToNorth(siteRequest_, (BigDecimal)o);
		case "paramPedestrianDemandScalingFactor":
			return SmartTrafficLight.staticSearchParamPedestrianDemandScalingFactor(siteRequest_, (BigDecimal)o);
		case "paramDemandScale":
			return SmartTrafficLight.staticSearchParamDemandScale(siteRequest_, (BigDecimal)o);
		case "paramMinGreenTimeSecWestEast":
			return SmartTrafficLight.staticSearchParamMinGreenTimeSecWestEast(siteRequest_, (BigDecimal)o);
		case "paramMaxGreenTimeSecWestEast":
			return SmartTrafficLight.staticSearchParamMaxGreenTimeSecWestEast(siteRequest_, (BigDecimal)o);
		case "paramMinGreenTimeSecSouthNorth":
			return SmartTrafficLight.staticSearchParamMinGreenTimeSecSouthNorth(siteRequest_, (BigDecimal)o);
		case "paramMaxGreenTimeSecSouthNorth":
			return SmartTrafficLight.staticSearchParamMaxGreenTimeSecSouthNorth(siteRequest_, (BigDecimal)o);
		case "paramPedestrianWaitThresholdSecNorthSouth":
			return SmartTrafficLight.staticSearchParamPedestrianWaitThresholdSecNorthSouth(siteRequest_, (BigDecimal)o);
		case "paramPedestrianWaitThresholdSecWestEast":
			return SmartTrafficLight.staticSearchParamPedestrianWaitThresholdSecWestEast(siteRequest_, (BigDecimal)o);
		case "paramVehicleQueueThresholdWestEast":
			return SmartTrafficLight.staticSearchParamVehicleQueueThresholdWestEast(siteRequest_, (BigDecimal)o);
		case "paramVehicleQueueThresholdSouthNorth":
			return SmartTrafficLight.staticSearchParamVehicleQueueThresholdSouthNorth(siteRequest_, (BigDecimal)o);
		case "paramPedestrianQueueThresholdNorthSouth":
			return SmartTrafficLight.staticSearchParamPedestrianQueueThresholdNorthSouth(siteRequest_, (BigDecimal)o);
		case "paramPedestrianQueueThresholdWestEast":
			return SmartTrafficLight.staticSearchParamPedestrianQueueThresholdWestEast(siteRequest_, (BigDecimal)o);
		case "paramStepSize":
			return SmartTrafficLight.staticSearchParamStepSize(siteRequest_, (BigDecimal)o);
		case "paramRunTime":
			return SmartTrafficLight.staticSearchParamRunTime(siteRequest_, (Integer)o);
		case "paramItersPerPar":
			return SmartTrafficLight.staticSearchParamItersPerPar(siteRequest_, (Integer)o);
		case "paramTotalIterNum":
			return SmartTrafficLight.staticSearchParamTotalIterNum(siteRequest_, (Integer)o);
		case "reportKeys":
			return SmartTrafficLight.staticSearchReportKeys(siteRequest_, (Long)o);
		case "tlsStatesPaths":
			return SmartTrafficLight.staticSearchTlsStatesPaths(siteRequest_, (String)o);
		case "additionalFilePaths":
			return SmartTrafficLight.staticSearchAdditionalFilePaths(siteRequest_, (String)o);
			default:
				return BaseModel.staticSearchBaseModel(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrSmartTrafficLight(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrSmartTrafficLight(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "entityId":
			return SmartTrafficLight.staticSearchStrEntityId(siteRequest_, (String)o);
		case "smartTrafficLightName":
			return SmartTrafficLight.staticSearchStrSmartTrafficLightName(siteRequest_, (String)o);
		case "routeIdNorth":
			return SmartTrafficLight.staticSearchStrRouteIdNorth(siteRequest_, (String)o);
		case "routeIdEast":
			return SmartTrafficLight.staticSearchStrRouteIdEast(siteRequest_, (String)o);
		case "trafficFlowObservedIds":
			return SmartTrafficLight.staticSearchStrTrafficFlowObservedIds(siteRequest_, (String)o);
		case "paramAvgVehiclePerMinFromWestToEast":
			return SmartTrafficLight.staticSearchStrParamAvgVehiclePerMinFromWestToEast(siteRequest_, (Double)o);
		case "paramAvgVehiclePerMinFromSouthToNorth":
			return SmartTrafficLight.staticSearchStrParamAvgVehiclePerMinFromSouthToNorth(siteRequest_, (Double)o);
		case "paramVehicleDemandScalingFactor":
			return SmartTrafficLight.staticSearchStrParamVehicleDemandScalingFactor(siteRequest_, (Double)o);
		case "paramAvgPedestrianPerMinFromWestToEast":
			return SmartTrafficLight.staticSearchStrParamAvgPedestrianPerMinFromWestToEast(siteRequest_, (Double)o);
		case "paramAvgPedestrianPerMinFromSouthToNorth":
			return SmartTrafficLight.staticSearchStrParamAvgPedestrianPerMinFromSouthToNorth(siteRequest_, (Double)o);
		case "paramPedestrianDemandScalingFactor":
			return SmartTrafficLight.staticSearchStrParamPedestrianDemandScalingFactor(siteRequest_, (Double)o);
		case "paramDemandScale":
			return SmartTrafficLight.staticSearchStrParamDemandScale(siteRequest_, (BigDecimal)o);
		case "paramMinGreenTimeSecWestEast":
			return SmartTrafficLight.staticSearchStrParamMinGreenTimeSecWestEast(siteRequest_, (Double)o);
		case "paramMaxGreenTimeSecWestEast":
			return SmartTrafficLight.staticSearchStrParamMaxGreenTimeSecWestEast(siteRequest_, (Double)o);
		case "paramMinGreenTimeSecSouthNorth":
			return SmartTrafficLight.staticSearchStrParamMinGreenTimeSecSouthNorth(siteRequest_, (Double)o);
		case "paramMaxGreenTimeSecSouthNorth":
			return SmartTrafficLight.staticSearchStrParamMaxGreenTimeSecSouthNorth(siteRequest_, (Double)o);
		case "paramPedestrianWaitThresholdSecNorthSouth":
			return SmartTrafficLight.staticSearchStrParamPedestrianWaitThresholdSecNorthSouth(siteRequest_, (Double)o);
		case "paramPedestrianWaitThresholdSecWestEast":
			return SmartTrafficLight.staticSearchStrParamPedestrianWaitThresholdSecWestEast(siteRequest_, (Double)o);
		case "paramVehicleQueueThresholdWestEast":
			return SmartTrafficLight.staticSearchStrParamVehicleQueueThresholdWestEast(siteRequest_, (Double)o);
		case "paramVehicleQueueThresholdSouthNorth":
			return SmartTrafficLight.staticSearchStrParamVehicleQueueThresholdSouthNorth(siteRequest_, (Double)o);
		case "paramPedestrianQueueThresholdNorthSouth":
			return SmartTrafficLight.staticSearchStrParamPedestrianQueueThresholdNorthSouth(siteRequest_, (Double)o);
		case "paramPedestrianQueueThresholdWestEast":
			return SmartTrafficLight.staticSearchStrParamPedestrianQueueThresholdWestEast(siteRequest_, (Double)o);
		case "paramStepSize":
			return SmartTrafficLight.staticSearchStrParamStepSize(siteRequest_, (Double)o);
		case "paramRunTime":
			return SmartTrafficLight.staticSearchStrParamRunTime(siteRequest_, (Integer)o);
		case "paramItersPerPar":
			return SmartTrafficLight.staticSearchStrParamItersPerPar(siteRequest_, (Integer)o);
		case "paramTotalIterNum":
			return SmartTrafficLight.staticSearchStrParamTotalIterNum(siteRequest_, (Integer)o);
		case "reportKeys":
			return SmartTrafficLight.staticSearchStrReportKeys(siteRequest_, (Long)o);
		case "tlsStatesPaths":
			return SmartTrafficLight.staticSearchStrTlsStatesPaths(siteRequest_, (String)o);
		case "additionalFilePaths":
			return SmartTrafficLight.staticSearchStrAdditionalFilePaths(siteRequest_, (String)o);
			default:
				return BaseModel.staticSearchStrBaseModel(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqSmartTrafficLight(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqSmartTrafficLight(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "entityId":
			return SmartTrafficLight.staticSearchFqEntityId(siteRequest_, o);
		case "smartTrafficLightName":
			return SmartTrafficLight.staticSearchFqSmartTrafficLightName(siteRequest_, o);
		case "routeIdNorth":
			return SmartTrafficLight.staticSearchFqRouteIdNorth(siteRequest_, o);
		case "routeIdEast":
			return SmartTrafficLight.staticSearchFqRouteIdEast(siteRequest_, o);
		case "trafficFlowObservedIds":
			return SmartTrafficLight.staticSearchFqTrafficFlowObservedIds(siteRequest_, o);
		case "paramAvgVehiclePerMinFromWestToEast":
			return SmartTrafficLight.staticSearchFqParamAvgVehiclePerMinFromWestToEast(siteRequest_, o);
		case "paramAvgVehiclePerMinFromSouthToNorth":
			return SmartTrafficLight.staticSearchFqParamAvgVehiclePerMinFromSouthToNorth(siteRequest_, o);
		case "paramVehicleDemandScalingFactor":
			return SmartTrafficLight.staticSearchFqParamVehicleDemandScalingFactor(siteRequest_, o);
		case "paramAvgPedestrianPerMinFromWestToEast":
			return SmartTrafficLight.staticSearchFqParamAvgPedestrianPerMinFromWestToEast(siteRequest_, o);
		case "paramAvgPedestrianPerMinFromSouthToNorth":
			return SmartTrafficLight.staticSearchFqParamAvgPedestrianPerMinFromSouthToNorth(siteRequest_, o);
		case "paramPedestrianDemandScalingFactor":
			return SmartTrafficLight.staticSearchFqParamPedestrianDemandScalingFactor(siteRequest_, o);
		case "paramDemandScale":
			return SmartTrafficLight.staticSearchFqParamDemandScale(siteRequest_, o);
		case "paramMinGreenTimeSecWestEast":
			return SmartTrafficLight.staticSearchFqParamMinGreenTimeSecWestEast(siteRequest_, o);
		case "paramMaxGreenTimeSecWestEast":
			return SmartTrafficLight.staticSearchFqParamMaxGreenTimeSecWestEast(siteRequest_, o);
		case "paramMinGreenTimeSecSouthNorth":
			return SmartTrafficLight.staticSearchFqParamMinGreenTimeSecSouthNorth(siteRequest_, o);
		case "paramMaxGreenTimeSecSouthNorth":
			return SmartTrafficLight.staticSearchFqParamMaxGreenTimeSecSouthNorth(siteRequest_, o);
		case "paramPedestrianWaitThresholdSecNorthSouth":
			return SmartTrafficLight.staticSearchFqParamPedestrianWaitThresholdSecNorthSouth(siteRequest_, o);
		case "paramPedestrianWaitThresholdSecWestEast":
			return SmartTrafficLight.staticSearchFqParamPedestrianWaitThresholdSecWestEast(siteRequest_, o);
		case "paramVehicleQueueThresholdWestEast":
			return SmartTrafficLight.staticSearchFqParamVehicleQueueThresholdWestEast(siteRequest_, o);
		case "paramVehicleQueueThresholdSouthNorth":
			return SmartTrafficLight.staticSearchFqParamVehicleQueueThresholdSouthNorth(siteRequest_, o);
		case "paramPedestrianQueueThresholdNorthSouth":
			return SmartTrafficLight.staticSearchFqParamPedestrianQueueThresholdNorthSouth(siteRequest_, o);
		case "paramPedestrianQueueThresholdWestEast":
			return SmartTrafficLight.staticSearchFqParamPedestrianQueueThresholdWestEast(siteRequest_, o);
		case "paramStepSize":
			return SmartTrafficLight.staticSearchFqParamStepSize(siteRequest_, o);
		case "paramRunTime":
			return SmartTrafficLight.staticSearchFqParamRunTime(siteRequest_, o);
		case "paramItersPerPar":
			return SmartTrafficLight.staticSearchFqParamItersPerPar(siteRequest_, o);
		case "paramTotalIterNum":
			return SmartTrafficLight.staticSearchFqParamTotalIterNum(siteRequest_, o);
		case "reportKeys":
			return SmartTrafficLight.staticSearchFqReportKeys(siteRequest_, o);
		case "tlsStatesPaths":
			return SmartTrafficLight.staticSearchFqTlsStatesPaths(siteRequest_, o);
		case "additionalFilePaths":
			return SmartTrafficLight.staticSearchFqAdditionalFilePaths(siteRequest_, o);
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
					o = persistSmartTrafficLight(v, val);
				else if(o instanceof BaseModel) {
					BaseModel oBaseModel = (BaseModel)o;
					o = oBaseModel.persistForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object persistSmartTrafficLight(String var, Object val) {
		String varLower = var.toLowerCase();
			if("entityid".equals(varLower)) {
				if(val instanceof String) {
					setEntityId((String)val);
				}
				saves.add("entityId");
				return val;
			} else if("smarttrafficlightname".equals(varLower)) {
				if(val instanceof String) {
					setSmartTrafficLightName((String)val);
				}
				saves.add("smartTrafficLightName");
				return val;
			} else if("routeidnorth".equals(varLower)) {
				if(val instanceof String) {
					setRouteIdNorth((String)val);
				}
				saves.add("routeIdNorth");
				return val;
			} else if("routeideast".equals(varLower)) {
				if(val instanceof String) {
					setRouteIdEast((String)val);
				}
				saves.add("routeIdEast");
				return val;
			} else if("paramvehicledemandscalingfactor".equals(varLower)) {
				if(val instanceof String) {
					setParamVehicleDemandScalingFactor((String)val);
				} else if(val instanceof Number) {
					setParamVehicleDemandScalingFactor(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramVehicleDemandScalingFactor");
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
		} else {
			return super.persistBaseModel(var, val);
		}
	}

	/////////////
	// populate //
	/////////////

	@Override public void populateForClass(SolrResponse.Doc doc) {
		populateSmartTrafficLight(doc);
	}
	public void populateSmartTrafficLight(SolrResponse.Doc doc) {
		SmartTrafficLight oSmartTrafficLight = (SmartTrafficLight)this;
		saves = doc.get("saves_docvalues_strings");
		if(saves != null) {

			if(saves.contains("entityId")) {
				String entityId = (String)doc.get("entityId_docvalues_string");
				if(entityId != null)
					oSmartTrafficLight.setEntityId(entityId);
			}

			if(saves.contains("smartTrafficLightName")) {
				String smartTrafficLightName = (String)doc.get("smartTrafficLightName_docvalues_string");
				if(smartTrafficLightName != null)
					oSmartTrafficLight.setSmartTrafficLightName(smartTrafficLightName);
			}

			if(saves.contains("routeIdNorth")) {
				String routeIdNorth = (String)doc.get("routeIdNorth_docvalues_string");
				if(routeIdNorth != null)
					oSmartTrafficLight.setRouteIdNorth(routeIdNorth);
			}

			if(saves.contains("routeIdEast")) {
				String routeIdEast = (String)doc.get("routeIdEast_docvalues_string");
				if(routeIdEast != null)
					oSmartTrafficLight.setRouteIdEast(routeIdEast);
			}

			if(saves.contains("trafficFlowObservedIds")) {
				List<String> trafficFlowObservedIds = (List<String>)doc.get("trafficFlowObservedIds_docvalues_strings");
				if(trafficFlowObservedIds != null)
					oSmartTrafficLight.trafficFlowObservedIds.addAll(trafficFlowObservedIds);
			}

			if(saves.contains("paramAvgVehiclePerMinFromWestToEast")) {
				Double paramAvgVehiclePerMinFromWestToEast = (Double)doc.get("paramAvgVehiclePerMinFromWestToEast_docvalues_double");
				if(paramAvgVehiclePerMinFromWestToEast != null)
					oSmartTrafficLight.setParamAvgVehiclePerMinFromWestToEast(paramAvgVehiclePerMinFromWestToEast);
			}

			if(saves.contains("paramAvgVehiclePerMinFromSouthToNorth")) {
				Double paramAvgVehiclePerMinFromSouthToNorth = (Double)doc.get("paramAvgVehiclePerMinFromSouthToNorth_docvalues_double");
				if(paramAvgVehiclePerMinFromSouthToNorth != null)
					oSmartTrafficLight.setParamAvgVehiclePerMinFromSouthToNorth(paramAvgVehiclePerMinFromSouthToNorth);
			}

			if(saves.contains("paramVehicleDemandScalingFactor")) {
				Double paramVehicleDemandScalingFactor = (Double)doc.get("paramVehicleDemandScalingFactor_docvalues_double");
				if(paramVehicleDemandScalingFactor != null)
					oSmartTrafficLight.setParamVehicleDemandScalingFactor(paramVehicleDemandScalingFactor);
			}

			if(saves.contains("paramAvgPedestrianPerMinFromWestToEast")) {
				Double paramAvgPedestrianPerMinFromWestToEast = (Double)doc.get("paramAvgPedestrianPerMinFromWestToEast_docvalues_double");
				if(paramAvgPedestrianPerMinFromWestToEast != null)
					oSmartTrafficLight.setParamAvgPedestrianPerMinFromWestToEast(paramAvgPedestrianPerMinFromWestToEast);
			}

			if(saves.contains("paramAvgPedestrianPerMinFromSouthToNorth")) {
				Double paramAvgPedestrianPerMinFromSouthToNorth = (Double)doc.get("paramAvgPedestrianPerMinFromSouthToNorth_docvalues_double");
				if(paramAvgPedestrianPerMinFromSouthToNorth != null)
					oSmartTrafficLight.setParamAvgPedestrianPerMinFromSouthToNorth(paramAvgPedestrianPerMinFromSouthToNorth);
			}

			if(saves.contains("paramPedestrianDemandScalingFactor")) {
				Double paramPedestrianDemandScalingFactor = (Double)doc.get("paramPedestrianDemandScalingFactor_docvalues_double");
				if(paramPedestrianDemandScalingFactor != null)
					oSmartTrafficLight.setParamPedestrianDemandScalingFactor(paramPedestrianDemandScalingFactor);
			}

			if(saves.contains("paramDemandScale")) {
				List<BigDecimal> paramDemandScale = (List<BigDecimal>)doc.get("paramDemandScale_docvalues_doubles");
				if(paramDemandScale != null)
					oSmartTrafficLight.paramDemandScale.addAll(paramDemandScale);
			}

			if(saves.contains("paramMinGreenTimeSecWestEast")) {
				Double paramMinGreenTimeSecWestEast = (Double)doc.get("paramMinGreenTimeSecWestEast_docvalues_double");
				if(paramMinGreenTimeSecWestEast != null)
					oSmartTrafficLight.setParamMinGreenTimeSecWestEast(paramMinGreenTimeSecWestEast);
			}

			if(saves.contains("paramMaxGreenTimeSecWestEast")) {
				Double paramMaxGreenTimeSecWestEast = (Double)doc.get("paramMaxGreenTimeSecWestEast_docvalues_double");
				if(paramMaxGreenTimeSecWestEast != null)
					oSmartTrafficLight.setParamMaxGreenTimeSecWestEast(paramMaxGreenTimeSecWestEast);
			}

			if(saves.contains("paramMinGreenTimeSecSouthNorth")) {
				Double paramMinGreenTimeSecSouthNorth = (Double)doc.get("paramMinGreenTimeSecSouthNorth_docvalues_double");
				if(paramMinGreenTimeSecSouthNorth != null)
					oSmartTrafficLight.setParamMinGreenTimeSecSouthNorth(paramMinGreenTimeSecSouthNorth);
			}

			if(saves.contains("paramMaxGreenTimeSecSouthNorth")) {
				Double paramMaxGreenTimeSecSouthNorth = (Double)doc.get("paramMaxGreenTimeSecSouthNorth_docvalues_double");
				if(paramMaxGreenTimeSecSouthNorth != null)
					oSmartTrafficLight.setParamMaxGreenTimeSecSouthNorth(paramMaxGreenTimeSecSouthNorth);
			}

			if(saves.contains("paramPedestrianWaitThresholdSecNorthSouth")) {
				Double paramPedestrianWaitThresholdSecNorthSouth = (Double)doc.get("paramPedestrianWaitThresholdSecNorthSouth_docvalues_double");
				if(paramPedestrianWaitThresholdSecNorthSouth != null)
					oSmartTrafficLight.setParamPedestrianWaitThresholdSecNorthSouth(paramPedestrianWaitThresholdSecNorthSouth);
			}

			if(saves.contains("paramPedestrianWaitThresholdSecWestEast")) {
				Double paramPedestrianWaitThresholdSecWestEast = (Double)doc.get("paramPedestrianWaitThresholdSecWestEast_docvalues_double");
				if(paramPedestrianWaitThresholdSecWestEast != null)
					oSmartTrafficLight.setParamPedestrianWaitThresholdSecWestEast(paramPedestrianWaitThresholdSecWestEast);
			}

			if(saves.contains("paramVehicleQueueThresholdWestEast")) {
				Double paramVehicleQueueThresholdWestEast = (Double)doc.get("paramVehicleQueueThresholdWestEast_docvalues_double");
				if(paramVehicleQueueThresholdWestEast != null)
					oSmartTrafficLight.setParamVehicleQueueThresholdWestEast(paramVehicleQueueThresholdWestEast);
			}

			if(saves.contains("paramVehicleQueueThresholdSouthNorth")) {
				Double paramVehicleQueueThresholdSouthNorth = (Double)doc.get("paramVehicleQueueThresholdSouthNorth_docvalues_double");
				if(paramVehicleQueueThresholdSouthNorth != null)
					oSmartTrafficLight.setParamVehicleQueueThresholdSouthNorth(paramVehicleQueueThresholdSouthNorth);
			}

			if(saves.contains("paramPedestrianQueueThresholdNorthSouth")) {
				Double paramPedestrianQueueThresholdNorthSouth = (Double)doc.get("paramPedestrianQueueThresholdNorthSouth_docvalues_double");
				if(paramPedestrianQueueThresholdNorthSouth != null)
					oSmartTrafficLight.setParamPedestrianQueueThresholdNorthSouth(paramPedestrianQueueThresholdNorthSouth);
			}

			if(saves.contains("paramPedestrianQueueThresholdWestEast")) {
				Double paramPedestrianQueueThresholdWestEast = (Double)doc.get("paramPedestrianQueueThresholdWestEast_docvalues_double");
				if(paramPedestrianQueueThresholdWestEast != null)
					oSmartTrafficLight.setParamPedestrianQueueThresholdWestEast(paramPedestrianQueueThresholdWestEast);
			}

			if(saves.contains("paramStepSize")) {
				Double paramStepSize = (Double)doc.get("paramStepSize_docvalues_double");
				if(paramStepSize != null)
					oSmartTrafficLight.setParamStepSize(paramStepSize);
			}

			if(saves.contains("paramRunTime")) {
				Integer paramRunTime = (Integer)doc.get("paramRunTime_docvalues_int");
				if(paramRunTime != null)
					oSmartTrafficLight.setParamRunTime(paramRunTime);
			}

			if(saves.contains("paramItersPerPar")) {
				Integer paramItersPerPar = (Integer)doc.get("paramItersPerPar_docvalues_int");
				if(paramItersPerPar != null)
					oSmartTrafficLight.setParamItersPerPar(paramItersPerPar);
			}

			if(saves.contains("paramTotalIterNum")) {
				Integer paramTotalIterNum = (Integer)doc.get("paramTotalIterNum_docvalues_int");
				if(paramTotalIterNum != null)
					oSmartTrafficLight.setParamTotalIterNum(paramTotalIterNum);
			}

			List<Long> reportKeys = (List<Long>)doc.get("reportKeys_docvalues_longs");
			if(reportKeys != null)
				oSmartTrafficLight.reportKeys.addAll(reportKeys);
		}

		super.populateBaseModel(doc);
	}

	public void indexSmartTrafficLight(JsonObject doc) {
		if(entityId != null) {
			doc.put("entityId_docvalues_string", entityId);
		}
		if(smartTrafficLightName != null) {
			doc.put("smartTrafficLightName_docvalues_string", smartTrafficLightName);
		}
		if(routeIdNorth != null) {
			doc.put("routeIdNorth_docvalues_string", routeIdNorth);
		}
		if(routeIdEast != null) {
			doc.put("routeIdEast_docvalues_string", routeIdEast);
		}
		if(trafficFlowObservedIds != null) {
			JsonArray l = new JsonArray();
			doc.put("trafficFlowObservedIds_docvalues_strings", l);
			for(String o : trafficFlowObservedIds) {
				l.add(o);
			}
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
		if(paramDemandScale != null) {
			JsonArray l = new JsonArray();
			doc.put("paramDemandScale_docvalues_doubles", l);
			for(BigDecimal o : paramDemandScale) {
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
		if(reportKeys != null) {
			JsonArray l = new JsonArray();
			doc.put("reportKeys_docvalues_longs", l);
			for(Long o : reportKeys) {
				l.add(o);
			}
		}
		super.indexBaseModel(doc);

	}

	public static String varStoredSmartTrafficLight(String entityVar) {
		switch(entityVar) {
			case "entityId":
				return "entityId_docvalues_string";
			case "smartTrafficLightName":
				return "smartTrafficLightName_docvalues_string";
			case "routeIdNorth":
				return "routeIdNorth_docvalues_string";
			case "routeIdEast":
				return "routeIdEast_docvalues_string";
			case "trafficFlowObservedIds":
				return "trafficFlowObservedIds_docvalues_strings";
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
			case "paramDemandScale":
				return "paramDemandScale_docvalues_doubles";
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
			case "paramStepSize":
				return "paramStepSize_docvalues_double";
			case "paramRunTime":
				return "paramRunTime_docvalues_int";
			case "paramItersPerPar":
				return "paramItersPerPar_docvalues_int";
			case "paramTotalIterNum":
				return "paramTotalIterNum_docvalues_int";
			case "reportKeys":
				return "reportKeys_docvalues_longs";
			default:
				return BaseModel.varStoredBaseModel(entityVar);
		}
	}

	public static String varIndexedSmartTrafficLight(String entityVar) {
		switch(entityVar) {
			case "entityId":
				return "entityId_docvalues_string";
			case "smartTrafficLightName":
				return "smartTrafficLightName_docvalues_string";
			case "routeIdNorth":
				return "routeIdNorth_docvalues_string";
			case "routeIdEast":
				return "routeIdEast_docvalues_string";
			case "trafficFlowObservedIds":
				return "trafficFlowObservedIds_docvalues_strings";
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
			case "paramDemandScale":
				return "paramDemandScale_docvalues_doubles";
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
			case "paramStepSize":
				return "paramStepSize_docvalues_double";
			case "paramRunTime":
				return "paramRunTime_docvalues_int";
			case "paramItersPerPar":
				return "paramItersPerPar_docvalues_int";
			case "paramTotalIterNum":
				return "paramTotalIterNum_docvalues_int";
			case "reportKeys":
				return "reportKeys_docvalues_longs";
			default:
				return BaseModel.varIndexedBaseModel(entityVar);
		}
	}

	public static String searchVarSmartTrafficLight(String searchVar) {
		switch(searchVar) {
			case "entityId_docvalues_string":
				return "entityId";
			case "smartTrafficLightName_docvalues_string":
				return "smartTrafficLightName";
			case "routeIdNorth_docvalues_string":
				return "routeIdNorth";
			case "routeIdEast_docvalues_string":
				return "routeIdEast";
			case "trafficFlowObservedIds_docvalues_strings":
				return "trafficFlowObservedIds";
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
			case "paramDemandScale_docvalues_doubles":
				return "paramDemandScale";
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
			case "paramStepSize_docvalues_double":
				return "paramStepSize";
			case "paramRunTime_docvalues_int":
				return "paramRunTime";
			case "paramItersPerPar_docvalues_int":
				return "paramItersPerPar";
			case "paramTotalIterNum_docvalues_int":
				return "paramTotalIterNum";
			case "reportKeys_docvalues_longs":
				return "reportKeys";
			default:
				return BaseModel.searchVarBaseModel(searchVar);
		}
	}

	public static String varSearchSmartTrafficLight(String entityVar) {
		switch(entityVar) {
			default:
				return BaseModel.varSearchBaseModel(entityVar);
		}
	}

	public static String varSuggestedSmartTrafficLight(String entityVar) {
		switch(entityVar) {
			default:
				return BaseModel.varSuggestedBaseModel(entityVar);
		}
	}

	/////////////
	// store //
	/////////////

	@Override public void storeForClass(SolrResponse.Doc doc) {
		storeSmartTrafficLight(doc);
	}
	public void storeSmartTrafficLight(SolrResponse.Doc doc) {
		SmartTrafficLight oSmartTrafficLight = (SmartTrafficLight)this;

		oSmartTrafficLight.setEntityId(Optional.ofNullable(doc.get("entityId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSmartTrafficLight.setSmartTrafficLightName(Optional.ofNullable(doc.get("smartTrafficLightName_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSmartTrafficLight.setRouteIdNorth(Optional.ofNullable(doc.get("routeIdNorth_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSmartTrafficLight.setRouteIdEast(Optional.ofNullable(doc.get("routeIdEast_docvalues_string")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("trafficFlowObservedIds_docvalues_strings")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oSmartTrafficLight.addTrafficFlowObservedIds(v.toString());
		});
		oSmartTrafficLight.setParamAvgVehiclePerMinFromWestToEast(Optional.ofNullable(doc.get("paramAvgVehiclePerMinFromWestToEast_docvalues_double")).map(v -> v.toString()).orElse(null));
		oSmartTrafficLight.setParamAvgVehiclePerMinFromSouthToNorth(Optional.ofNullable(doc.get("paramAvgVehiclePerMinFromSouthToNorth_docvalues_double")).map(v -> v.toString()).orElse(null));
		oSmartTrafficLight.setParamVehicleDemandScalingFactor(Optional.ofNullable(doc.get("paramVehicleDemandScalingFactor_docvalues_double")).map(v -> v.toString()).orElse(null));
		oSmartTrafficLight.setParamAvgPedestrianPerMinFromWestToEast(Optional.ofNullable(doc.get("paramAvgPedestrianPerMinFromWestToEast_docvalues_double")).map(v -> v.toString()).orElse(null));
		oSmartTrafficLight.setParamAvgPedestrianPerMinFromSouthToNorth(Optional.ofNullable(doc.get("paramAvgPedestrianPerMinFromSouthToNorth_docvalues_double")).map(v -> v.toString()).orElse(null));
		oSmartTrafficLight.setParamPedestrianDemandScalingFactor(Optional.ofNullable(doc.get("paramPedestrianDemandScalingFactor_docvalues_double")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("paramDemandScale_docvalues_doubles")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oSmartTrafficLight.addParamDemandScale(v.toString());
		});
		oSmartTrafficLight.setParamMinGreenTimeSecWestEast(Optional.ofNullable(doc.get("paramMinGreenTimeSecWestEast_docvalues_double")).map(v -> v.toString()).orElse(null));
		oSmartTrafficLight.setParamMaxGreenTimeSecWestEast(Optional.ofNullable(doc.get("paramMaxGreenTimeSecWestEast_docvalues_double")).map(v -> v.toString()).orElse(null));
		oSmartTrafficLight.setParamMinGreenTimeSecSouthNorth(Optional.ofNullable(doc.get("paramMinGreenTimeSecSouthNorth_docvalues_double")).map(v -> v.toString()).orElse(null));
		oSmartTrafficLight.setParamMaxGreenTimeSecSouthNorth(Optional.ofNullable(doc.get("paramMaxGreenTimeSecSouthNorth_docvalues_double")).map(v -> v.toString()).orElse(null));
		oSmartTrafficLight.setParamPedestrianWaitThresholdSecNorthSouth(Optional.ofNullable(doc.get("paramPedestrianWaitThresholdSecNorthSouth_docvalues_double")).map(v -> v.toString()).orElse(null));
		oSmartTrafficLight.setParamPedestrianWaitThresholdSecWestEast(Optional.ofNullable(doc.get("paramPedestrianWaitThresholdSecWestEast_docvalues_double")).map(v -> v.toString()).orElse(null));
		oSmartTrafficLight.setParamVehicleQueueThresholdWestEast(Optional.ofNullable(doc.get("paramVehicleQueueThresholdWestEast_docvalues_double")).map(v -> v.toString()).orElse(null));
		oSmartTrafficLight.setParamVehicleQueueThresholdSouthNorth(Optional.ofNullable(doc.get("paramVehicleQueueThresholdSouthNorth_docvalues_double")).map(v -> v.toString()).orElse(null));
		oSmartTrafficLight.setParamPedestrianQueueThresholdNorthSouth(Optional.ofNullable(doc.get("paramPedestrianQueueThresholdNorthSouth_docvalues_double")).map(v -> v.toString()).orElse(null));
		oSmartTrafficLight.setParamPedestrianQueueThresholdWestEast(Optional.ofNullable(doc.get("paramPedestrianQueueThresholdWestEast_docvalues_double")).map(v -> v.toString()).orElse(null));
		oSmartTrafficLight.setParamStepSize(Optional.ofNullable(doc.get("paramStepSize_docvalues_double")).map(v -> v.toString()).orElse(null));
		oSmartTrafficLight.setParamRunTime(Optional.ofNullable(doc.get("paramRunTime_docvalues_int")).map(v -> v.toString()).orElse(null));
		oSmartTrafficLight.setParamItersPerPar(Optional.ofNullable(doc.get("paramItersPerPar_docvalues_int")).map(v -> v.toString()).orElse(null));
		oSmartTrafficLight.setParamTotalIterNum(Optional.ofNullable(doc.get("paramTotalIterNum_docvalues_int")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("reportKeys_docvalues_longs")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oSmartTrafficLight.addReportKeys(v.toString());
		});

		super.storeBaseModel(doc);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestSmartTrafficLight() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof SmartTrafficLight) {
			SmartTrafficLight original = (SmartTrafficLight)o;
			if(!Objects.equals(entityId, original.getEntityId()))
				apiRequest.addVars("entityId");
			if(!Objects.equals(smartTrafficLightName, original.getSmartTrafficLightName()))
				apiRequest.addVars("smartTrafficLightName");
			if(!Objects.equals(routeIdNorth, original.getRouteIdNorth()))
				apiRequest.addVars("routeIdNorth");
			if(!Objects.equals(routeIdEast, original.getRouteIdEast()))
				apiRequest.addVars("routeIdEast");
			if(!Objects.equals(trafficFlowObservedIds, original.getTrafficFlowObservedIds()))
				apiRequest.addVars("trafficFlowObservedIds");
			if(!Objects.equals(paramAvgVehiclePerMinFromWestToEast, original.getParamAvgVehiclePerMinFromWestToEast()) && paramAvgVehiclePerMinFromWestToEast != null && paramAvgVehiclePerMinFromWestToEast.compareTo(original.getParamAvgVehiclePerMinFromWestToEast()) != 0)
				apiRequest.addVars("paramAvgVehiclePerMinFromWestToEast");
			if(!Objects.equals(paramAvgVehiclePerMinFromSouthToNorth, original.getParamAvgVehiclePerMinFromSouthToNorth()) && paramAvgVehiclePerMinFromSouthToNorth != null && paramAvgVehiclePerMinFromSouthToNorth.compareTo(original.getParamAvgVehiclePerMinFromSouthToNorth()) != 0)
				apiRequest.addVars("paramAvgVehiclePerMinFromSouthToNorth");
			if(!Objects.equals(paramVehicleDemandScalingFactor, original.getParamVehicleDemandScalingFactor()) && paramVehicleDemandScalingFactor != null && paramVehicleDemandScalingFactor.compareTo(original.getParamVehicleDemandScalingFactor()) != 0)
				apiRequest.addVars("paramVehicleDemandScalingFactor");
			if(!Objects.equals(paramAvgPedestrianPerMinFromWestToEast, original.getParamAvgPedestrianPerMinFromWestToEast()) && paramAvgPedestrianPerMinFromWestToEast != null && paramAvgPedestrianPerMinFromWestToEast.compareTo(original.getParamAvgPedestrianPerMinFromWestToEast()) != 0)
				apiRequest.addVars("paramAvgPedestrianPerMinFromWestToEast");
			if(!Objects.equals(paramAvgPedestrianPerMinFromSouthToNorth, original.getParamAvgPedestrianPerMinFromSouthToNorth()) && paramAvgPedestrianPerMinFromSouthToNorth != null && paramAvgPedestrianPerMinFromSouthToNorth.compareTo(original.getParamAvgPedestrianPerMinFromSouthToNorth()) != 0)
				apiRequest.addVars("paramAvgPedestrianPerMinFromSouthToNorth");
			if(!Objects.equals(paramPedestrianDemandScalingFactor, original.getParamPedestrianDemandScalingFactor()) && paramPedestrianDemandScalingFactor != null && paramPedestrianDemandScalingFactor.compareTo(original.getParamPedestrianDemandScalingFactor()) != 0)
				apiRequest.addVars("paramPedestrianDemandScalingFactor");
			if(!Objects.equals(paramDemandScale, original.getParamDemandScale()))
				apiRequest.addVars("paramDemandScale");
			if(!Objects.equals(paramMinGreenTimeSecWestEast, original.getParamMinGreenTimeSecWestEast()) && paramMinGreenTimeSecWestEast != null && paramMinGreenTimeSecWestEast.compareTo(original.getParamMinGreenTimeSecWestEast()) != 0)
				apiRequest.addVars("paramMinGreenTimeSecWestEast");
			if(!Objects.equals(paramMaxGreenTimeSecWestEast, original.getParamMaxGreenTimeSecWestEast()) && paramMaxGreenTimeSecWestEast != null && paramMaxGreenTimeSecWestEast.compareTo(original.getParamMaxGreenTimeSecWestEast()) != 0)
				apiRequest.addVars("paramMaxGreenTimeSecWestEast");
			if(!Objects.equals(paramMinGreenTimeSecSouthNorth, original.getParamMinGreenTimeSecSouthNorth()) && paramMinGreenTimeSecSouthNorth != null && paramMinGreenTimeSecSouthNorth.compareTo(original.getParamMinGreenTimeSecSouthNorth()) != 0)
				apiRequest.addVars("paramMinGreenTimeSecSouthNorth");
			if(!Objects.equals(paramMaxGreenTimeSecSouthNorth, original.getParamMaxGreenTimeSecSouthNorth()) && paramMaxGreenTimeSecSouthNorth != null && paramMaxGreenTimeSecSouthNorth.compareTo(original.getParamMaxGreenTimeSecSouthNorth()) != 0)
				apiRequest.addVars("paramMaxGreenTimeSecSouthNorth");
			if(!Objects.equals(paramPedestrianWaitThresholdSecNorthSouth, original.getParamPedestrianWaitThresholdSecNorthSouth()) && paramPedestrianWaitThresholdSecNorthSouth != null && paramPedestrianWaitThresholdSecNorthSouth.compareTo(original.getParamPedestrianWaitThresholdSecNorthSouth()) != 0)
				apiRequest.addVars("paramPedestrianWaitThresholdSecNorthSouth");
			if(!Objects.equals(paramPedestrianWaitThresholdSecWestEast, original.getParamPedestrianWaitThresholdSecWestEast()) && paramPedestrianWaitThresholdSecWestEast != null && paramPedestrianWaitThresholdSecWestEast.compareTo(original.getParamPedestrianWaitThresholdSecWestEast()) != 0)
				apiRequest.addVars("paramPedestrianWaitThresholdSecWestEast");
			if(!Objects.equals(paramVehicleQueueThresholdWestEast, original.getParamVehicleQueueThresholdWestEast()) && paramVehicleQueueThresholdWestEast != null && paramVehicleQueueThresholdWestEast.compareTo(original.getParamVehicleQueueThresholdWestEast()) != 0)
				apiRequest.addVars("paramVehicleQueueThresholdWestEast");
			if(!Objects.equals(paramVehicleQueueThresholdSouthNorth, original.getParamVehicleQueueThresholdSouthNorth()) && paramVehicleQueueThresholdSouthNorth != null && paramVehicleQueueThresholdSouthNorth.compareTo(original.getParamVehicleQueueThresholdSouthNorth()) != 0)
				apiRequest.addVars("paramVehicleQueueThresholdSouthNorth");
			if(!Objects.equals(paramPedestrianQueueThresholdNorthSouth, original.getParamPedestrianQueueThresholdNorthSouth()) && paramPedestrianQueueThresholdNorthSouth != null && paramPedestrianQueueThresholdNorthSouth.compareTo(original.getParamPedestrianQueueThresholdNorthSouth()) != 0)
				apiRequest.addVars("paramPedestrianQueueThresholdNorthSouth");
			if(!Objects.equals(paramPedestrianQueueThresholdWestEast, original.getParamPedestrianQueueThresholdWestEast()) && paramPedestrianQueueThresholdWestEast != null && paramPedestrianQueueThresholdWestEast.compareTo(original.getParamPedestrianQueueThresholdWestEast()) != 0)
				apiRequest.addVars("paramPedestrianQueueThresholdWestEast");
			if(!Objects.equals(paramStepSize, original.getParamStepSize()) && paramStepSize != null && paramStepSize.compareTo(original.getParamStepSize()) != 0)
				apiRequest.addVars("paramStepSize");
			if(!Objects.equals(paramRunTime, original.getParamRunTime()))
				apiRequest.addVars("paramRunTime");
			if(!Objects.equals(paramItersPerPar, original.getParamItersPerPar()))
				apiRequest.addVars("paramItersPerPar");
			if(!Objects.equals(paramTotalIterNum, original.getParamTotalIterNum()))
				apiRequest.addVars("paramTotalIterNum");
			if(!Objects.equals(reportKeys, original.getReportKeys()))
				apiRequest.addVars("reportKeys");
			super.apiRequestBaseModel();
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(Optional.ofNullable(entityId).map(v -> "entityId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(smartTrafficLightName).map(v -> "smartTrafficLightName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(routeIdNorth).map(v -> "routeIdNorth: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(routeIdEast).map(v -> "routeIdEast: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(trafficFlowObservedIds).map(v -> "trafficFlowObservedIds: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramAvgVehiclePerMinFromWestToEast).map(v -> "paramAvgVehiclePerMinFromWestToEast: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramAvgVehiclePerMinFromSouthToNorth).map(v -> "paramAvgVehiclePerMinFromSouthToNorth: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramVehicleDemandScalingFactor).map(v -> "paramVehicleDemandScalingFactor: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramAvgPedestrianPerMinFromWestToEast).map(v -> "paramAvgPedestrianPerMinFromWestToEast: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramAvgPedestrianPerMinFromSouthToNorth).map(v -> "paramAvgPedestrianPerMinFromSouthToNorth: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramPedestrianDemandScalingFactor).map(v -> "paramPedestrianDemandScalingFactor: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramDemandScale).map(v -> "paramDemandScale: " + v + "\n").orElse(""));
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
		sb.append(Optional.ofNullable(paramStepSize).map(v -> "paramStepSize: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramRunTime).map(v -> "paramRunTime: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramItersPerPar).map(v -> "paramItersPerPar: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramTotalIterNum).map(v -> "paramTotalIterNum: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(reportKeys).map(v -> "reportKeys: " + v + "\n").orElse(""));
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "SmartTrafficLight";
	public static final String VAR_entityId = "entityId";
	public static final String VAR_smartTrafficLightName = "smartTrafficLightName";
	public static final String VAR_routeIdNorth = "routeIdNorth";
	public static final String VAR_routeIdEast = "routeIdEast";
	public static final String VAR_trafficFlowObservedIds = "trafficFlowObservedIds";
	public static final String VAR_trafficFlowObservedSearch = "trafficFlowObservedSearch";
	public static final String VAR_trafficFlowObserveds = "trafficFlowObserveds";
	public static final String VAR_trafficFlowObservedNorth_ = "trafficFlowObservedNorth_";
	public static final String VAR_trafficFlowObservedEast_ = "trafficFlowObservedEast_";
	public static final String VAR_paramAvgVehiclePerMinFromWestToEast = "paramAvgVehiclePerMinFromWestToEast";
	public static final String VAR_paramAvgVehiclePerMinFromSouthToNorth = "paramAvgVehiclePerMinFromSouthToNorth";
	public static final String VAR_paramVehicleDemandScalingFactor = "paramVehicleDemandScalingFactor";
	public static final String VAR_paramAvgPedestrianPerMinFromWestToEast = "paramAvgPedestrianPerMinFromWestToEast";
	public static final String VAR_paramAvgPedestrianPerMinFromSouthToNorth = "paramAvgPedestrianPerMinFromSouthToNorth";
	public static final String VAR_paramPedestrianDemandScalingFactor = "paramPedestrianDemandScalingFactor";
	public static final String VAR_paramDemandScale = "paramDemandScale";
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
	public static final String VAR_paramStepSize = "paramStepSize";
	public static final String VAR_paramRunTime = "paramRunTime";
	public static final String VAR_paramItersPerPar = "paramItersPerPar";
	public static final String VAR_paramTotalIterNum = "paramTotalIterNum";
	public static final String VAR_reportKeys = "reportKeys";
	public static final String VAR_tlsStatesPaths = "tlsStatesPaths";
	public static final String VAR_additionalFilePaths = "additionalFilePaths";

	public static List<String> varsQForClass() {
		return SmartTrafficLight.varsQSmartTrafficLight(new ArrayList<String>());
	}
	public static List<String> varsQSmartTrafficLight(List<String> vars) {
		BaseModel.varsQBaseModel(vars);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return SmartTrafficLight.varsFqSmartTrafficLight(new ArrayList<String>());
	}
	public static List<String> varsFqSmartTrafficLight(List<String> vars) {
		vars.add(VAR_entityId);
		vars.add(VAR_smartTrafficLightName);
		vars.add(VAR_routeIdNorth);
		vars.add(VAR_routeIdEast);
		vars.add(VAR_trafficFlowObservedIds);
		vars.add(VAR_paramAvgVehiclePerMinFromWestToEast);
		vars.add(VAR_paramAvgVehiclePerMinFromSouthToNorth);
		vars.add(VAR_paramVehicleDemandScalingFactor);
		vars.add(VAR_paramAvgPedestrianPerMinFromWestToEast);
		vars.add(VAR_paramAvgPedestrianPerMinFromSouthToNorth);
		vars.add(VAR_paramPedestrianDemandScalingFactor);
		vars.add(VAR_paramDemandScale);
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
		vars.add(VAR_reportKeys);
		BaseModel.varsFqBaseModel(vars);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return SmartTrafficLight.varsRangeSmartTrafficLight(new ArrayList<String>());
	}
	public static List<String> varsRangeSmartTrafficLight(List<String> vars) {
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
		BaseModel.varsRangeBaseModel(vars);
		return vars;
	}

	public static final String DISPLAY_NAME_entityId = "entity ID";
	public static final String DISPLAY_NAME_smartTrafficLightName = "smart traffic light name";
	public static final String DISPLAY_NAME_routeIdNorth = "route ID North";
	public static final String DISPLAY_NAME_routeIdEast = "route ID East";
	public static final String DISPLAY_NAME_trafficFlowObservedIds = "TrafficFlowObserveds";
	public static final String DISPLAY_NAME_trafficFlowObservedSearch = "";
	public static final String DISPLAY_NAME_trafficFlowObserveds = "";
	public static final String DISPLAY_NAME_trafficFlowObservedNorth_ = "";
	public static final String DISPLAY_NAME_trafficFlowObservedEast_ = "";
	public static final String DISPLAY_NAME_paramAvgVehiclePerMinFromWestToEast = "Average vehicle/min from WEST to EAST";
	public static final String DISPLAY_NAME_paramAvgVehiclePerMinFromSouthToNorth = "Average vehicle/min from SOUTH to NORTH";
	public static final String DISPLAY_NAME_paramVehicleDemandScalingFactor = "Demand scaling factor (multiplies all vehicle demands)";
	public static final String DISPLAY_NAME_paramAvgPedestrianPerMinFromWestToEast = "Average pedestrian/min from WEST to EAST";
	public static final String DISPLAY_NAME_paramAvgPedestrianPerMinFromSouthToNorth = "Average pedestrian/min from WEST to EAST";
	public static final String DISPLAY_NAME_paramPedestrianDemandScalingFactor = "Demand scaling factor (multiplies all pedestrian demands)";
	public static final String DISPLAY_NAME_paramDemandScale = "demand scale";
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
	public static final String DISPLAY_NAME_paramStepSize = "Simulation time step (sec)";
	public static final String DISPLAY_NAME_paramRunTime = "time for each round of traffic simulation (sec)";
	public static final String DISPLAY_NAME_paramItersPerPar = "Number of simulation repetitions with same input (for statistical accuracy)";
	public static final String DISPLAY_NAME_paramTotalIterNum = "Number of parameter update iterations before output";
	public static final String DISPLAY_NAME_reportKeys = "simulation reports";
	public static final String DISPLAY_NAME_tlsStatesPaths = "TLS States paths";
	public static final String DISPLAY_NAME_additionalFilePaths = "additional file paths";

	public static String displayNameForClass(String var) {
		return SmartTrafficLight.displayNameSmartTrafficLight(var);
	}
	public static String displayNameSmartTrafficLight(String var) {
		switch(var) {
		case VAR_entityId:
			return DISPLAY_NAME_entityId;
		case VAR_smartTrafficLightName:
			return DISPLAY_NAME_smartTrafficLightName;
		case VAR_routeIdNorth:
			return DISPLAY_NAME_routeIdNorth;
		case VAR_routeIdEast:
			return DISPLAY_NAME_routeIdEast;
		case VAR_trafficFlowObservedIds:
			return DISPLAY_NAME_trafficFlowObservedIds;
		case VAR_trafficFlowObservedSearch:
			return DISPLAY_NAME_trafficFlowObservedSearch;
		case VAR_trafficFlowObserveds:
			return DISPLAY_NAME_trafficFlowObserveds;
		case VAR_trafficFlowObservedNorth_:
			return DISPLAY_NAME_trafficFlowObservedNorth_;
		case VAR_trafficFlowObservedEast_:
			return DISPLAY_NAME_trafficFlowObservedEast_;
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
		case VAR_paramDemandScale:
			return DISPLAY_NAME_paramDemandScale;
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
		case VAR_paramStepSize:
			return DISPLAY_NAME_paramStepSize;
		case VAR_paramRunTime:
			return DISPLAY_NAME_paramRunTime;
		case VAR_paramItersPerPar:
			return DISPLAY_NAME_paramItersPerPar;
		case VAR_paramTotalIterNum:
			return DISPLAY_NAME_paramTotalIterNum;
		case VAR_reportKeys:
			return DISPLAY_NAME_reportKeys;
		case VAR_tlsStatesPaths:
			return DISPLAY_NAME_tlsStatesPaths;
		case VAR_additionalFilePaths:
			return DISPLAY_NAME_additionalFilePaths;
		default:
			return BaseModel.displayNameBaseModel(var);
		}
	}

	public static String descriptionSmartTrafficLight(String var) {
		switch(var) {
		case VAR_entityId:
			return "A unique ID for this Smart Data Model";
		case VAR_trafficFlowObservedIds:
			return "The related TrafficFlowObserved entities";
		case VAR_paramAvgVehiclePerMinFromWestToEast:
			return "Min: 1";
		case VAR_paramAvgVehiclePerMinFromSouthToNorth:
			return "Min: 1";
		case VAR_paramVehicleDemandScalingFactor:
			return "Min: 1";
		case VAR_paramAvgPedestrianPerMinFromWestToEast:
			return "Min: 1";
		case VAR_paramAvgPedestrianPerMinFromSouthToNorth:
			return "Min: 1";
		case VAR_paramPedestrianDemandScalingFactor:
			return "Min: 1";
		case VAR_paramMinGreenTimeSecWestEast:
			return "Min: 1";
		case VAR_paramMaxGreenTimeSecWestEast:
			return "Min: 1";
		case VAR_paramMinGreenTimeSecSouthNorth:
			return "Min: 1";
		case VAR_paramMaxGreenTimeSecSouthNorth:
			return "Min: 1";
		case VAR_paramPedestrianWaitThresholdSecNorthSouth:
			return "Min: 1";
		case VAR_paramPedestrianWaitThresholdSecWestEast:
			return "Min: 1";
		case VAR_paramVehicleQueueThresholdWestEast:
			return "Min: 1";
		case VAR_paramVehicleQueueThresholdSouthNorth:
			return "Min: 1";
		case VAR_paramPedestrianQueueThresholdNorthSouth:
			return "Min: 1";
		case VAR_paramPedestrianQueueThresholdWestEast:
			return "Min: 1";
		case VAR_paramStepSize:
			return "Min: 0.5";
		case VAR_paramRunTime:
			return "Time duration of each simulated sample path. ";
		case VAR_paramItersPerPar:
			return "Number of repeats per round. ";
		case VAR_paramTotalIterNum:
			return "Total iterations to update performance. ";
		case VAR_reportKeys:
			return "The generated reports for this smart traffic light";
		case VAR_tlsStatesPaths:
			return "The paths to all TLS States files";
		case VAR_additionalFilePaths:
			return "The paths to all the additional SUMO config files";
			default:
				return BaseModel.descriptionBaseModel(var);
		}
	}

	public static String classSimpleNameSmartTrafficLight(String var) {
		switch(var) {
		case VAR_entityId:
			return "String";
		case VAR_smartTrafficLightName:
			return "String";
		case VAR_routeIdNorth:
			return "String";
		case VAR_routeIdEast:
			return "String";
		case VAR_trafficFlowObservedIds:
			return "List";
		case VAR_trafficFlowObservedSearch:
			return "SearchList";
		case VAR_trafficFlowObserveds:
			return "List";
		case VAR_trafficFlowObservedNorth_:
			return "TrafficFlowObserved";
		case VAR_trafficFlowObservedEast_:
			return "TrafficFlowObserved";
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
		case VAR_paramDemandScale:
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
		case VAR_paramStepSize:
			return "BigDecimal";
		case VAR_paramRunTime:
			return "Integer";
		case VAR_paramItersPerPar:
			return "Integer";
		case VAR_paramTotalIterNum:
			return "Integer";
		case VAR_reportKeys:
			return "List";
		case VAR_tlsStatesPaths:
			return "List";
		case VAR_additionalFilePaths:
			return "List";
			default:
				return BaseModel.classSimpleNameBaseModel(var);
		}
	}

	public static Integer htmColumnSmartTrafficLight(String var) {
		switch(var) {
			default:
				return BaseModel.htmColumnBaseModel(var);
		}
	}

	public static Integer htmRowSmartTrafficLight(String var) {
		switch(var) {
		case VAR_entityId:
			return 5;
		case VAR_smartTrafficLightName:
			return 5;
		case VAR_routeIdNorth:
			return 6;
		case VAR_routeIdEast:
			return 6;
		case VAR_paramAvgVehiclePerMinFromWestToEast:
			return 7;
		case VAR_paramAvgVehiclePerMinFromSouthToNorth:
			return 7;
		case VAR_paramVehicleDemandScalingFactor:
			return 7;
		case VAR_paramAvgPedestrianPerMinFromWestToEast:
			return 8;
		case VAR_paramAvgPedestrianPerMinFromSouthToNorth:
			return 8;
		case VAR_paramPedestrianDemandScalingFactor:
			return 8;
		case VAR_paramMinGreenTimeSecWestEast:
			return 9;
		case VAR_paramMaxGreenTimeSecWestEast:
			return 9;
		case VAR_paramMinGreenTimeSecSouthNorth:
			return 10;
		case VAR_paramMaxGreenTimeSecSouthNorth:
			return 10;
		case VAR_paramPedestrianWaitThresholdSecNorthSouth:
			return 11;
		case VAR_paramPedestrianWaitThresholdSecWestEast:
			return 11;
		case VAR_paramVehicleQueueThresholdWestEast:
			return 12;
		case VAR_paramVehicleQueueThresholdSouthNorth:
			return 12;
		case VAR_paramPedestrianQueueThresholdNorthSouth:
			return 13;
		case VAR_paramPedestrianQueueThresholdWestEast:
			return 13;
		case VAR_paramStepSize:
			return 14;
		case VAR_paramRunTime:
			return 14;
		case VAR_paramItersPerPar:
			return 15;
		case VAR_paramTotalIterNum:
			return 15;
		case VAR_reportKeys:
			return 16;
			default:
				return BaseModel.htmRowBaseModel(var);
		}
	}

	public static Integer htmCellSmartTrafficLight(String var) {
		switch(var) {
		case VAR_entityId:
			return 1;
		case VAR_smartTrafficLightName:
			return 2;
		case VAR_routeIdNorth:
			return 2;
		case VAR_routeIdEast:
			return 3;
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
			return 2;
		case VAR_paramRunTime:
			return 1;
		case VAR_paramItersPerPar:
			return 1;
		case VAR_paramTotalIterNum:
			return 2;
		case VAR_reportKeys:
			return 1;
			default:
				return BaseModel.htmCellBaseModel(var);
		}
	}

	public static Integer lengthMinSmartTrafficLight(String var) {
		switch(var) {
			default:
				return BaseModel.lengthMinBaseModel(var);
		}
	}

	public static Integer lengthMaxSmartTrafficLight(String var) {
		switch(var) {
			default:
				return BaseModel.lengthMaxBaseModel(var);
		}
	}

	public static Integer maxSmartTrafficLight(String var) {
		switch(var) {
			default:
				return BaseModel.maxBaseModel(var);
		}
	}

	public static Integer minSmartTrafficLight(String var) {
		switch(var) {
			default:
				return BaseModel.minBaseModel(var);
		}
	}
}
