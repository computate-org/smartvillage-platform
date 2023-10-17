package org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved;

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
import java.lang.String;
import org.computate.vertx.search.list.SearchList;
import org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation;
import io.vertx.pgclient.data.Polygon;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.BeanDescription;
import java.util.stream.Collectors;
import io.vertx.core.json.Json;
import io.vertx.pgclient.data.Point;
import org.computate.vertx.serialize.pgclient.PgClientPolygonSerializer;
import org.computate.vertx.serialize.pgclient.PgClientPolygonDeserializer;
import java.math.BigDecimal;
import java.lang.Boolean;
import org.computate.vertx.serialize.pgclient.PgClientPointSerializer;
import org.computate.vertx.serialize.pgclient.PgClientPointDeserializer;
import java.lang.Integer;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;

/**
 * <ol>
<h3>Suggestions that can generate more code for you: </h3> * </ol>
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class CrowdFlowObservedGen into the class CrowdFlowObserved. 
 * </li>
 * <h3>About the CrowdFlowObserved class and it's generated class CrowdFlowObservedGen&lt;BaseModel&gt;: </h3>extends CrowdFlowObservedGen
 * <p>
 * This Java class extends a generated Java class CrowdFlowObservedGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObserved">Find the class CrowdFlowObserved in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends CrowdFlowObservedGen<BaseModel>
 * <p>This <code>class CrowdFlowObserved extends CrowdFlowObservedGen&lt;BaseModel&gt;</code>, which means it extends a newly generated CrowdFlowObservedGen. 
 * The generated <code>class CrowdFlowObservedGen extends BaseModel</code> which means that CrowdFlowObserved extends CrowdFlowObservedGen which extends BaseModel. 
 * This generated inheritance is a powerful feature that allows a lot of boiler plate code to be created for you automatically while still preserving inheritance through the power of Java Generic classes. 
 * </p>
 * <h2>Api: true</h2>
 * <p>This class contains a comment <b>"Api: true"</b>, which means this class will have Java Vert.x API backend code generated for these objects. 
 * </p>
 * <h2>ApiMethode: Search</h2>
 * <p>This class contains a comment <b>"ApiMethod: Search"</b>, which creates an API "Search". 
 * </p>
 * <h2>ApiMethode: GET</h2>
 * <p>This class contains a comment <b>"ApiMethod: GET"</b>, which creates an API "GET". 
 * </p>
 * <h2>ApiMethode: PATCH</h2>
 * <p>This class contains a comment <b>"ApiMethod: PATCH"</b>, which creates an API "PATCH". 
 * </p>
 * <h2>ApiMethode: POST</h2>
 * <p>This class contains a comment <b>"ApiMethod: POST"</b>, which creates an API "POST". 
 * </p>
 * <h2>ApiMethode: PUTImport</h2>
 * <p>This class contains a comment <b>"ApiMethod: PUTImport"</b>, which creates an API "PUTImport". 
 * </p>
 * <h2>ApiMethode: SearchPage</h2>
 * <p>This class contains a comment <b>"ApiMethod: SearchPage"</b>, which creates an API "SearchPage". 
 * </p>
 * <h2>ApiTag.enUS: true</h2>
 * <p>This class contains a comment <b>"ApiTag: CrowdFlowObserved"</b>, which groups all of the OpenAPIs for CrowdFlowObserved objects under the tag "CrowdFlowObserved". 
 * </p>
 * <h2>ApiUri.enUS: /api/crowd-flow-observed</h2>
 * <p>This class contains a comment <b>"ApiUri: /api/crowd-flow-observed"</b>, which defines the base API URI for CrowdFlowObserved objects as "/api/crowd-flow-observed" in the OpenAPI spec. 
 * </p>
 * <h2>Color: 2017-shaded-spruce</h2>
 * <p>This class contains a comment <b>"Color: 2017-shaded-spruce"</b>, which styles the CrowdFlowObserved page "2017-shaded-spruce". 
 * This will reference a CSS class defined by the stylesheets in the project that starts with "w3-". 
 * A css class of "w3-2017-shaded-spruce" is expected to exist in the project stylesheets, and is inspired by W3 CSS colors. 
 * See: <a href="https://www.w3schools.com/w3css/w3css_colors.asp">https://www.w3schools.com/w3css/w3css_colors.asp</a>. 
 * </p>
 * <h2>IconGroup: duotone</h2>
 * <p>This class contains a comment <b>"IconGroup: duotone"</b>, which adds icons on the CrowdFlowObserved page with a group of "duotone". 
 * This will reference a Font Awesome icon group that starts with "fa-" followed by the icon group "duotone", together is "fa-duotone". 
 * A Font Awesome icon group of "duotone" is expected to exist. 
 * The Font Awesome groups currently supported include: solid, regular, light, thin, duotone, sharp, and kit. 
 * See: <a href="https://fontawesome.com/docs/web/dig-deeper/styles">https://fontawesome.com/docs/web/dig-deeper/styles</a>. 
 * </p>
 * <h2>IconName: map-location-dot</h2>
 * <p>This class contains a comment <b>"IconName: map-location-dot"</b>, which adds icons on the CrowdFlowObserved page with a name of "map-location-dot". 
 * This will reference a Font Awesome icon that starts with the icon group "fa-duotone fa-" followed by the icon name, which is "fa-duotone fa-map-location-dot". 
 * A Font Awesome icon of "fa-duotone fa-map-location-dot" is expected to exist. 
 * See: <a href="https://fontawesome.com/icons">https://fontawesome.com/icons</a>. 
 * </p>
 * <h2>Indexed: true</h2>
 * <p>This class contains a comment <b>"Indexed: true"</b>, which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * <h2>{@inheritDoc}</h2>
 * <p>By adding a class comment "{@inheritDoc}", the CrowdFlowObserved class will inherit the helpful inherited class comments from the super class CrowdFlowObservedGen. 
 * </p>
 * <h2>Rows: 100</h2>
 * <p>This class contains a comment <b>"Rows: 100"</b>, which means the CrowdFlowObserved API will return a default of 100 records instead of 10 by default. 
 * Each API has built in pagination of the search records to ensure a user can query all the data a page at a time without running the application out of memory. 
 * </p>
 * <h2>Order: 1</h2>
 * <p>This class contains a comment <b>"Order: 1"</b>, which means this class will be sorted by the given number 1 ascending when code that relates to multiple classes at the same time is generated. 
 * </p>
 * <h2>SqlOrder: 1</h2>
 * <p>This class contains a comment <b>"SqlOrder: 1"</b>, which means this class will be sorted by the given number 1 ascending when SQL code to create and drop the tables is generated. 
 * </p>
 * <h2>Model: true</h2>
 * <p>This class contains a comment <b>"Model: true"</b>, which means this class will be stored in the database. 
 * Every protected void method that begins with "_" that contains a "Persist: true" comment will be a persisted field in the database table. 
 * </p>
 * <h2>Page: true</h2>
 * <p>This class contains a comment <b>"Page: true"</b>, which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObservedPage. 
 * </p>
 * <h2>SuperPage.enUS: BaseModelPage</h2>
 * <p>This class contains a comment <b>"SuperPage.enUS: BaseModelPage"</b>, which identifies the Java super class of the page code by it's class simple name "BaseModelPage". 
 * This means that the newly created class org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObservedPage extends org.computate.smartvillageview.enus.model.base.BaseModelPage. 
 * </p>
 * <h2>Promise: true</h2>
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the CrowdFlowObserved Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * <h2>Role.enUS: SiteAdmin</h2>
 * <p>
 * This class contains a comment <b>"Role.enUS: SiteAdmin"</b>, which identifies the default role name "SiteAdmin" of the OAuth2/OpenID Connect user role required to access this CrowdFlowObserved API. 
 * It's possible to reconfigure the roles required to access the CrowdFlowObserved API by configuring an environment variable like this: 
 * </p>
 * <pre>AUTH_ROLE_REQUIRED_CrowdFlowObserved: ["SiteAdmin"]</pre>
 * <h2>AName.enUS: a CrowdFlowObserved</h2>
 * <p>This class contains a comment <b>"AName.enUS: a CrowdFlowObserved"</b>, which identifies the language context to describe a CrowdFlowObserved as "a CrowdFlowObserved". 
 * </p>
 * <p>
 * Delete the class CrowdFlowObserved in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObserved&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * Generated: true
 **/
public abstract class CrowdFlowObservedGen<DEV> extends BaseModel {
	protected static final Logger LOG = LoggerFactory.getLogger(CrowdFlowObserved.class);

	public static final String CrowdFlowObserved_Description_enUS = "ApiTag.enUS: CrowdFlowObserved";
	public static final String CrowdFlowObserved_AName_enUS = "a CrowdFlowObserved";
	public static final String CrowdFlowObserved_This_enUS = "this ";
	public static final String CrowdFlowObserved_ThisName_enUS = "this CrowdFlowObserved";
	public static final String CrowdFlowObserved_A_enUS = "a ";
	public static final String CrowdFlowObserved_TheName_enUS = "the CrowdFlowObserved";
	public static final String CrowdFlowObserved_NameSingular_enUS = "CrowdFlowObserved";
	public static final String CrowdFlowObserved_NamePlural_enUS = "CrowdFlowObserveds";
	public static final String CrowdFlowObserved_NameActual_enUS = "current CrowdFlowObserved";
	public static final String CrowdFlowObserved_AllName_enUS = "all the CrowdFlowObserveds";
	public static final String CrowdFlowObserved_SearchAllNameBy_enUS = "search CrowdFlowObserveds by ";
	public static final String CrowdFlowObserved_Title_enUS = "CrowdFlowObserveds";
	public static final String CrowdFlowObserved_ThePluralName_enUS = "the CrowdFlowObserveds";
	public static final String CrowdFlowObserved_NoNameFound_enUS = "no CrowdFlowObserved found";
	public static final String CrowdFlowObserved_ApiUri_enUS = "/api/crowd-flow-observed";
	public static final String CrowdFlowObserved_ApiUriSearchPage_enUS = "/crowd-flow-observed";
	public static final String CrowdFlowObserved_OfName_enUS = "of CrowdFlowObserved";
	public static final String CrowdFlowObserved_ANameAdjective_enUS = "a CrowdFlowObserved";
	public static final String CrowdFlowObserved_NameAdjectiveSingular_enUS = "CrowdFlowObserved";
	public static final String CrowdFlowObserved_NameAdjectivePlural_enUS = "CrowdFlowObserveds";
	public static final String Search_enUS_Uri = "/api/crowd-flow-observed";
	public static final String Search_enUS_ImageUri = "/png/api/crowd-flow-observed-999.png";
	public static final String GET_enUS_Uri = "/api/crowd-flow-observed/{id}";
	public static final String GET_enUS_ImageUri = "/png/api/crowd-flow-observed/{id}-999.png";
	public static final String PATCH_enUS_Uri = "/api/crowd-flow-observed";
	public static final String PATCH_enUS_ImageUri = "/png/api/crowd-flow-observed-999.png";
	public static final String POST_enUS_Uri = "/api/crowd-flow-observed";
	public static final String POST_enUS_ImageUri = "/png/api/crowd-flow-observed-999.png";
	public static final String PUTImport_enUS_Uri = "/api/crowd-flow-observed-import";
	public static final String PUTImport_enUS_ImageUri = "/png/api/crowd-flow-observed-import-999.png";
	public static final String SearchPage_enUS_Uri = "/crowd-flow-observed";
	public static final String SearchPage_enUS_ImageUri = "/png/crowd-flow-observed-999.png";

	public static final String CrowdFlowObserved_Color = "2017-shaded-spruce";
	public static final String CrowdFlowObserved_IconGroup = "duotone";
	public static final String CrowdFlowObserved_IconName = "map-location-dot";
	public static final Integer CrowdFlowObserved_Rows = 100;

	///////////
	// color //
	///////////


	/**	 The entity color
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String color;

	/**	<br> The entity color
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObserved&fq=entiteVar_enUS_indexed_string:color">Find the entity color in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _color(Wrap<String> w);

	public String getColor() {
		return color;
	}
	public void setColor(String o) {
		this.color = CrowdFlowObserved.staticSetColor(siteRequest_, o);
	}
	public static String staticSetColor(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected CrowdFlowObserved colorInit() {
		Wrap<String> colorWrap = new Wrap<String>().var("color");
		if(color == null) {
			_color(colorWrap);
			Optional.ofNullable(colorWrap.getO()).ifPresent(o -> {
				setColor(o);
			});
		}
		return (CrowdFlowObserved)this;
	}

	public static String staticSearchColor(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrColor(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqColor(SiteRequestEnUS siteRequest_, String o) {
		return CrowdFlowObserved.staticSearchStrColor(siteRequest_, CrowdFlowObserved.staticSearchColor(siteRequest_, CrowdFlowObserved.staticSetColor(siteRequest_, o)));
	}

	public String sqlColor() {
		return color;
	}

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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObserved&fq=entiteVar_enUS_indexed_string:entityId">Find the entity entityId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _entityId(Wrap<String> w);

	public String getEntityId() {
		return entityId;
	}
	public void setEntityId(String o) {
		this.entityId = CrowdFlowObserved.staticSetEntityId(siteRequest_, o);
	}
	public static String staticSetEntityId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected CrowdFlowObserved entityIdInit() {
		Wrap<String> entityIdWrap = new Wrap<String>().var("entityId");
		if(entityId == null) {
			_entityId(entityIdWrap);
			Optional.ofNullable(entityIdWrap.getO()).ifPresent(o -> {
				setEntityId(o);
			});
		}
		return (CrowdFlowObserved)this;
	}

	public static String staticSearchEntityId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrEntityId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqEntityId(SiteRequestEnUS siteRequest_, String o) {
		return CrowdFlowObserved.staticSearchStrEntityId(siteRequest_, CrowdFlowObserved.staticSearchEntityId(siteRequest_, CrowdFlowObserved.staticSetEntityId(siteRequest_, o)));
	}

	public String sqlEntityId() {
		return entityId;
	}

	/////////////////////////
	// trafficSimulationId //
	/////////////////////////


	/**	 The entity trafficSimulationId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String trafficSimulationId;

	/**	<br> The entity trafficSimulationId
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObserved&fq=entiteVar_enUS_indexed_string:trafficSimulationId">Find the entity trafficSimulationId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _trafficSimulationId(Wrap<String> w);

	public String getTrafficSimulationId() {
		return trafficSimulationId;
	}
	public void setTrafficSimulationId(String o) {
		this.trafficSimulationId = CrowdFlowObserved.staticSetTrafficSimulationId(siteRequest_, o);
	}
	public static String staticSetTrafficSimulationId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected CrowdFlowObserved trafficSimulationIdInit() {
		Wrap<String> trafficSimulationIdWrap = new Wrap<String>().var("trafficSimulationId");
		if(trafficSimulationId == null) {
			_trafficSimulationId(trafficSimulationIdWrap);
			Optional.ofNullable(trafficSimulationIdWrap.getO()).ifPresent(o -> {
				setTrafficSimulationId(o);
			});
		}
		return (CrowdFlowObserved)this;
	}

	public static String staticSearchTrafficSimulationId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrTrafficSimulationId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqTrafficSimulationId(SiteRequestEnUS siteRequest_, String o) {
		return CrowdFlowObserved.staticSearchStrTrafficSimulationId(siteRequest_, CrowdFlowObserved.staticSearchTrafficSimulationId(siteRequest_, CrowdFlowObserved.staticSetTrafficSimulationId(siteRequest_, o)));
	}

	public String sqlTrafficSimulationId() {
		return trafficSimulationId;
	}

	/////////////////////////////
	// trafficSimulationSearch //
	/////////////////////////////


	/**	 The entity trafficSimulationSearch
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<TrafficSimulation> trafficSimulationSearch;

	/**	<br> The entity trafficSimulationSearch
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObserved&fq=entiteVar_enUS_indexed_string:trafficSimulationSearch">Find the entity trafficSimulationSearch in Solr</a>
	 * <br>
	 * @param promise is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _trafficSimulationSearch(Promise<SearchList<TrafficSimulation>> promise);

	public SearchList<TrafficSimulation> getTrafficSimulationSearch() {
		return trafficSimulationSearch;
	}

	public void setTrafficSimulationSearch(SearchList<TrafficSimulation> trafficSimulationSearch) {
		this.trafficSimulationSearch = trafficSimulationSearch;
	}
	public static SearchList<TrafficSimulation> staticSetTrafficSimulationSearch(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected Future<SearchList<TrafficSimulation>> trafficSimulationSearchPromise() {
		Promise<SearchList<TrafficSimulation>> promise = Promise.promise();
		Promise<SearchList<TrafficSimulation>> promise2 = Promise.promise();
		_trafficSimulationSearch(promise2);
		promise2.future().onSuccess(o -> {
			if(o != null && trafficSimulationSearch == null) {
				o.promiseDeepForClass(siteRequest_).onSuccess(a -> {
					setTrafficSimulationSearch(o);
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

	////////////////////////
	// trafficSimulation_ //
	////////////////////////


	/**	 The entity trafficSimulation_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected TrafficSimulation trafficSimulation_;

	/**	<br> The entity trafficSimulation_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObserved&fq=entiteVar_enUS_indexed_string:trafficSimulation_">Find the entity trafficSimulation_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _trafficSimulation_(Wrap<TrafficSimulation> w);

	public TrafficSimulation getTrafficSimulation_() {
		return trafficSimulation_;
	}

	public void setTrafficSimulation_(TrafficSimulation trafficSimulation_) {
		this.trafficSimulation_ = trafficSimulation_;
	}
	public static TrafficSimulation staticSetTrafficSimulation_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected CrowdFlowObserved trafficSimulation_Init() {
		Wrap<TrafficSimulation> trafficSimulation_Wrap = new Wrap<TrafficSimulation>().var("trafficSimulation_");
		if(trafficSimulation_ == null) {
			_trafficSimulation_(trafficSimulation_Wrap);
			Optional.ofNullable(trafficSimulation_Wrap.getO()).ifPresent(o -> {
				setTrafficSimulation_(o);
			});
		}
		return (CrowdFlowObserved)this;
	}

	///////////////////
	// walkingAreaId //
	///////////////////


	/**	 The entity walkingAreaId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String walkingAreaId;

	/**	<br> The entity walkingAreaId
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObserved&fq=entiteVar_enUS_indexed_string:walkingAreaId">Find the entity walkingAreaId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _walkingAreaId(Wrap<String> w);

	public String getWalkingAreaId() {
		return walkingAreaId;
	}
	public void setWalkingAreaId(String o) {
		this.walkingAreaId = CrowdFlowObserved.staticSetWalkingAreaId(siteRequest_, o);
	}
	public static String staticSetWalkingAreaId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected CrowdFlowObserved walkingAreaIdInit() {
		Wrap<String> walkingAreaIdWrap = new Wrap<String>().var("walkingAreaId");
		if(walkingAreaId == null) {
			_walkingAreaId(walkingAreaIdWrap);
			Optional.ofNullable(walkingAreaIdWrap.getO()).ifPresent(o -> {
				setWalkingAreaId(o);
			});
		}
		return (CrowdFlowObserved)this;
	}

	public static String staticSearchWalkingAreaId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrWalkingAreaId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqWalkingAreaId(SiteRequestEnUS siteRequest_, String o) {
		return CrowdFlowObserved.staticSearchStrWalkingAreaId(siteRequest_, CrowdFlowObserved.staticSearchWalkingAreaId(siteRequest_, CrowdFlowObserved.staticSetWalkingAreaId(siteRequest_, o)));
	}

	public String sqlWalkingAreaId() {
		return walkingAreaId;
	}

	///////////////////
	// alternateName //
	///////////////////


	/**	 The entity alternateName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String alternateName;

	/**	<br> The entity alternateName
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObserved&fq=entiteVar_enUS_indexed_string:alternateName">Find the entity alternateName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _alternateName(Wrap<String> w);

	public String getAlternateName() {
		return alternateName;
	}
	public void setAlternateName(String o) {
		this.alternateName = CrowdFlowObserved.staticSetAlternateName(siteRequest_, o);
	}
	public static String staticSetAlternateName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected CrowdFlowObserved alternateNameInit() {
		Wrap<String> alternateNameWrap = new Wrap<String>().var("alternateName");
		if(alternateName == null) {
			_alternateName(alternateNameWrap);
			Optional.ofNullable(alternateNameWrap.getO()).ifPresent(o -> {
				setAlternateName(o);
			});
		}
		return (CrowdFlowObserved)this;
	}

	public static String staticSearchAlternateName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrAlternateName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAlternateName(SiteRequestEnUS siteRequest_, String o) {
		return CrowdFlowObserved.staticSearchStrAlternateName(siteRequest_, CrowdFlowObserved.staticSearchAlternateName(siteRequest_, CrowdFlowObserved.staticSetAlternateName(siteRequest_, o)));
	}

	public String sqlAlternateName() {
		return alternateName;
	}

	////////////////
	// areaServed //
	////////////////


	/**	 The entity areaServed
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonDeserialize(using = PgClientPolygonDeserializer.class)
	@JsonSerialize(using = PgClientPolygonSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Polygon areaServed;

	/**	<br> The entity areaServed
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObserved&fq=entiteVar_enUS_indexed_string:areaServed">Find the entity areaServed in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _areaServed(Wrap<Polygon> w);

	public Polygon getAreaServed() {
		return areaServed;
	}

	public void setAreaServed(Polygon areaServed) {
		this.areaServed = areaServed;
	}
	@JsonIgnore
	public void setAreaServed(String o) {
		this.areaServed = CrowdFlowObserved.staticSetAreaServed(siteRequest_, o);
	}
	public static Polygon staticSetAreaServed(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
			try {
				Polygon shape = null;
				if(StringUtils.isNotBlank(o)) {
					ObjectMapper objectMapper = new ObjectMapper();
					SimpleModule module = new SimpleModule();
					module.setDeserializerModifier(new BeanDeserializerModifier() {
						@Override
						public JsonDeserializer<?> modifyDeserializer(DeserializationConfig config, BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
							if (beanDesc.getBeanClass() == Polygon.class) {
								return new PgClientPolygonDeserializer();
							}
							return deserializer;
						}
					});
					objectMapper.registerModule(module);
					shape = objectMapper.readValue(Json.encode(o), Polygon.class);
				}
				return shape;
			} catch(Exception ex) {
				ExceptionUtils.rethrow(ex);
			}
		}
		return null;
	}
	public void setAreaServed(JsonObject o) {
		this.areaServed = CrowdFlowObserved.staticSetAreaServed(siteRequest_, o);
	}
	public static Polygon staticSetAreaServed(SiteRequestEnUS siteRequest_, JsonObject o) {
		if(o != null) {
			try {
				Polygon shape = new Polygon();
				o.getJsonArray("coordinates").stream().map(a -> (JsonArray)a).forEach(g -> {
					g.stream().map(a -> (JsonArray)a).forEach(points -> {
						shape.addPoint(new Point(Double.parseDouble(points.getString(0)), Double.parseDouble(points.getString(1))));
					});
				});
				return shape;
			} catch(Exception ex) {
				ExceptionUtils.rethrow(ex);
			}
		}
		return null;
	}
	protected CrowdFlowObserved areaServedInit() {
		Wrap<Polygon> areaServedWrap = new Wrap<Polygon>().var("areaServed");
		if(areaServed == null) {
			_areaServed(areaServedWrap);
			Optional.ofNullable(areaServedWrap.getO()).ifPresent(o -> {
				setAreaServed(o);
			});
		}
		return (CrowdFlowObserved)this;
	}

	public static Polygon staticSearchAreaServed(SiteRequestEnUS siteRequest_, Polygon o) {
		return o;
	}

	public static String staticSearchStrAreaServed(SiteRequestEnUS siteRequest_, Polygon o) {
		JsonArray pointsArray = new JsonArray();
		o.getPoints().stream().map(point -> new JsonArray().add(Double.valueOf(point.getX())).add(Double.valueOf(point.getY()))).collect(Collectors.toList()).forEach(pointArray -> pointsArray.add(pointArray));
		return new JsonObject().put("type", "LineString").put("coordinates", pointsArray).toString();
	}

	public static String staticSearchFqAreaServed(SiteRequestEnUS siteRequest_, String o) {
		return CrowdFlowObserved.staticSearchStrAreaServed(siteRequest_, CrowdFlowObserved.staticSearchAreaServed(siteRequest_, CrowdFlowObserved.staticSetAreaServed(siteRequest_, o)));
	}

	public Polygon sqlAreaServed() {
		return areaServed;
	}

	///////////////////////
	// averageCrowdSpeed //
	///////////////////////


	/**	 The entity averageCrowdSpeed
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal averageCrowdSpeed;

	/**	<br> The entity averageCrowdSpeed
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObserved&fq=entiteVar_enUS_indexed_string:averageCrowdSpeed">Find the entity averageCrowdSpeed in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _averageCrowdSpeed(Wrap<BigDecimal> w);

	public BigDecimal getAverageCrowdSpeed() {
		return averageCrowdSpeed;
	}

	public void setAverageCrowdSpeed(BigDecimal averageCrowdSpeed) {
		this.averageCrowdSpeed = averageCrowdSpeed;
	}
	@JsonIgnore
	public void setAverageCrowdSpeed(String o) {
		this.averageCrowdSpeed = CrowdFlowObserved.staticSetAverageCrowdSpeed(siteRequest_, o);
	}
	public static BigDecimal staticSetAverageCrowdSpeed(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setAverageCrowdSpeed(Double o) {
		setAverageCrowdSpeed(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setAverageCrowdSpeed(Integer o) {
		setAverageCrowdSpeed(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setAverageCrowdSpeed(Number o) {
		setAverageCrowdSpeed(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected CrowdFlowObserved averageCrowdSpeedInit() {
		Wrap<BigDecimal> averageCrowdSpeedWrap = new Wrap<BigDecimal>().var("averageCrowdSpeed");
		if(averageCrowdSpeed == null) {
			_averageCrowdSpeed(averageCrowdSpeedWrap);
			Optional.ofNullable(averageCrowdSpeedWrap.getO()).ifPresent(o -> {
				setAverageCrowdSpeed(o);
			});
		}
		return (CrowdFlowObserved)this;
	}

	public static Double staticSearchAverageCrowdSpeed(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrAverageCrowdSpeed(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAverageCrowdSpeed(SiteRequestEnUS siteRequest_, String o) {
		return CrowdFlowObserved.staticSearchStrAverageCrowdSpeed(siteRequest_, CrowdFlowObserved.staticSearchAverageCrowdSpeed(siteRequest_, CrowdFlowObserved.staticSetAverageCrowdSpeed(siteRequest_, o)));
	}

	public BigDecimal sqlAverageCrowdSpeed() {
		return averageCrowdSpeed;
	}

	////////////////////////
	// averageHeadwayTime //
	////////////////////////


	/**	 The entity averageHeadwayTime
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal averageHeadwayTime;

	/**	<br> The entity averageHeadwayTime
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObserved&fq=entiteVar_enUS_indexed_string:averageHeadwayTime">Find the entity averageHeadwayTime in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _averageHeadwayTime(Wrap<BigDecimal> w);

	public BigDecimal getAverageHeadwayTime() {
		return averageHeadwayTime;
	}

	public void setAverageHeadwayTime(BigDecimal averageHeadwayTime) {
		this.averageHeadwayTime = averageHeadwayTime;
	}
	@JsonIgnore
	public void setAverageHeadwayTime(String o) {
		this.averageHeadwayTime = CrowdFlowObserved.staticSetAverageHeadwayTime(siteRequest_, o);
	}
	public static BigDecimal staticSetAverageHeadwayTime(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setAverageHeadwayTime(Double o) {
		setAverageHeadwayTime(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setAverageHeadwayTime(Integer o) {
		setAverageHeadwayTime(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setAverageHeadwayTime(Number o) {
		setAverageHeadwayTime(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected CrowdFlowObserved averageHeadwayTimeInit() {
		Wrap<BigDecimal> averageHeadwayTimeWrap = new Wrap<BigDecimal>().var("averageHeadwayTime");
		if(averageHeadwayTime == null) {
			_averageHeadwayTime(averageHeadwayTimeWrap);
			Optional.ofNullable(averageHeadwayTimeWrap.getO()).ifPresent(o -> {
				setAverageHeadwayTime(o);
			});
		}
		return (CrowdFlowObserved)this;
	}

	public static Double staticSearchAverageHeadwayTime(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrAverageHeadwayTime(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAverageHeadwayTime(SiteRequestEnUS siteRequest_, String o) {
		return CrowdFlowObserved.staticSearchStrAverageHeadwayTime(siteRequest_, CrowdFlowObserved.staticSearchAverageHeadwayTime(siteRequest_, CrowdFlowObserved.staticSetAverageHeadwayTime(siteRequest_, o)));
	}

	public BigDecimal sqlAverageHeadwayTime() {
		return averageHeadwayTime;
	}

	///////////////
	// congested //
	///////////////


	/**	 The entity congested
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Boolean congested;

	/**	<br> The entity congested
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObserved&fq=entiteVar_enUS_indexed_string:congested">Find the entity congested in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _congested(Wrap<Boolean> w);

	public Boolean getCongested() {
		return congested;
	}

	public void setCongested(Boolean congested) {
		this.congested = congested;
	}
	@JsonIgnore
	public void setCongested(String o) {
		this.congested = CrowdFlowObserved.staticSetCongested(siteRequest_, o);
	}
	public static Boolean staticSetCongested(SiteRequestEnUS siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected CrowdFlowObserved congestedInit() {
		Wrap<Boolean> congestedWrap = new Wrap<Boolean>().var("congested");
		if(congested == null) {
			_congested(congestedWrap);
			Optional.ofNullable(congestedWrap.getO()).ifPresent(o -> {
				setCongested(o);
			});
		}
		return (CrowdFlowObserved)this;
	}

	public static Boolean staticSearchCongested(SiteRequestEnUS siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrCongested(SiteRequestEnUS siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqCongested(SiteRequestEnUS siteRequest_, String o) {
		return CrowdFlowObserved.staticSearchStrCongested(siteRequest_, CrowdFlowObserved.staticSearchCongested(siteRequest_, CrowdFlowObserved.staticSetCongested(siteRequest_, o)));
	}

	public Boolean sqlCongested() {
		return congested;
	}

	//////////////////
	// dataProvider //
	//////////////////


	/**	 The entity dataProvider
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String dataProvider;

	/**	<br> The entity dataProvider
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObserved&fq=entiteVar_enUS_indexed_string:dataProvider">Find the entity dataProvider in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _dataProvider(Wrap<String> w);

	public String getDataProvider() {
		return dataProvider;
	}
	public void setDataProvider(String o) {
		this.dataProvider = CrowdFlowObserved.staticSetDataProvider(siteRequest_, o);
	}
	public static String staticSetDataProvider(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected CrowdFlowObserved dataProviderInit() {
		Wrap<String> dataProviderWrap = new Wrap<String>().var("dataProvider");
		if(dataProvider == null) {
			_dataProvider(dataProviderWrap);
			Optional.ofNullable(dataProviderWrap.getO()).ifPresent(o -> {
				setDataProvider(o);
			});
		}
		return (CrowdFlowObserved)this;
	}

	public static String staticSearchDataProvider(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDataProvider(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDataProvider(SiteRequestEnUS siteRequest_, String o) {
		return CrowdFlowObserved.staticSearchStrDataProvider(siteRequest_, CrowdFlowObserved.staticSearchDataProvider(siteRequest_, CrowdFlowObserved.staticSetDataProvider(siteRequest_, o)));
	}

	public String sqlDataProvider() {
		return dataProvider;
	}

	/////////////////
	// dateCreated //
	/////////////////


	/**	 The entity dateCreated
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String dateCreated;

	/**	<br> The entity dateCreated
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObserved&fq=entiteVar_enUS_indexed_string:dateCreated">Find the entity dateCreated in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _dateCreated(Wrap<String> w);

	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String o) {
		this.dateCreated = CrowdFlowObserved.staticSetDateCreated(siteRequest_, o);
	}
	public static String staticSetDateCreated(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected CrowdFlowObserved dateCreatedInit() {
		Wrap<String> dateCreatedWrap = new Wrap<String>().var("dateCreated");
		if(dateCreated == null) {
			_dateCreated(dateCreatedWrap);
			Optional.ofNullable(dateCreatedWrap.getO()).ifPresent(o -> {
				setDateCreated(o);
			});
		}
		return (CrowdFlowObserved)this;
	}

	public static String staticSearchDateCreated(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDateCreated(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDateCreated(SiteRequestEnUS siteRequest_, String o) {
		return CrowdFlowObserved.staticSearchStrDateCreated(siteRequest_, CrowdFlowObserved.staticSearchDateCreated(siteRequest_, CrowdFlowObserved.staticSetDateCreated(siteRequest_, o)));
	}

	public String sqlDateCreated() {
		return dateCreated;
	}

	//////////////////
	// dateModified //
	//////////////////


	/**	 The entity dateModified
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String dateModified;

	/**	<br> The entity dateModified
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObserved&fq=entiteVar_enUS_indexed_string:dateModified">Find the entity dateModified in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _dateModified(Wrap<String> w);

	public String getDateModified() {
		return dateModified;
	}
	public void setDateModified(String o) {
		this.dateModified = CrowdFlowObserved.staticSetDateModified(siteRequest_, o);
	}
	public static String staticSetDateModified(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected CrowdFlowObserved dateModifiedInit() {
		Wrap<String> dateModifiedWrap = new Wrap<String>().var("dateModified");
		if(dateModified == null) {
			_dateModified(dateModifiedWrap);
			Optional.ofNullable(dateModifiedWrap.getO()).ifPresent(o -> {
				setDateModified(o);
			});
		}
		return (CrowdFlowObserved)this;
	}

	public static String staticSearchDateModified(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDateModified(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDateModified(SiteRequestEnUS siteRequest_, String o) {
		return CrowdFlowObserved.staticSearchStrDateModified(siteRequest_, CrowdFlowObserved.staticSearchDateModified(siteRequest_, CrowdFlowObserved.staticSetDateModified(siteRequest_, o)));
	}

	public String sqlDateModified() {
		return dateModified;
	}

	//////////////////
	// dateObserved //
	//////////////////


	/**	 The entity dateObserved
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String dateObserved;

	/**	<br> The entity dateObserved
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObserved&fq=entiteVar_enUS_indexed_string:dateObserved">Find the entity dateObserved in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _dateObserved(Wrap<String> w);

	public String getDateObserved() {
		return dateObserved;
	}
	public void setDateObserved(String o) {
		this.dateObserved = CrowdFlowObserved.staticSetDateObserved(siteRequest_, o);
	}
	public static String staticSetDateObserved(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected CrowdFlowObserved dateObservedInit() {
		Wrap<String> dateObservedWrap = new Wrap<String>().var("dateObserved");
		if(dateObserved == null) {
			_dateObserved(dateObservedWrap);
			Optional.ofNullable(dateObservedWrap.getO()).ifPresent(o -> {
				setDateObserved(o);
			});
		}
		return (CrowdFlowObserved)this;
	}

	public static String staticSearchDateObserved(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDateObserved(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDateObserved(SiteRequestEnUS siteRequest_, String o) {
		return CrowdFlowObserved.staticSearchStrDateObserved(siteRequest_, CrowdFlowObserved.staticSearchDateObserved(siteRequest_, CrowdFlowObserved.staticSetDateObserved(siteRequest_, o)));
	}

	public String sqlDateObserved() {
		return dateObserved;
	}

	//////////////////////
	// dateObservedFrom //
	//////////////////////


	/**	 The entity dateObservedFrom
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String dateObservedFrom;

	/**	<br> The entity dateObservedFrom
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObserved&fq=entiteVar_enUS_indexed_string:dateObservedFrom">Find the entity dateObservedFrom in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _dateObservedFrom(Wrap<String> w);

	public String getDateObservedFrom() {
		return dateObservedFrom;
	}
	public void setDateObservedFrom(String o) {
		this.dateObservedFrom = CrowdFlowObserved.staticSetDateObservedFrom(siteRequest_, o);
	}
	public static String staticSetDateObservedFrom(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected CrowdFlowObserved dateObservedFromInit() {
		Wrap<String> dateObservedFromWrap = new Wrap<String>().var("dateObservedFrom");
		if(dateObservedFrom == null) {
			_dateObservedFrom(dateObservedFromWrap);
			Optional.ofNullable(dateObservedFromWrap.getO()).ifPresent(o -> {
				setDateObservedFrom(o);
			});
		}
		return (CrowdFlowObserved)this;
	}

	public static String staticSearchDateObservedFrom(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDateObservedFrom(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDateObservedFrom(SiteRequestEnUS siteRequest_, String o) {
		return CrowdFlowObserved.staticSearchStrDateObservedFrom(siteRequest_, CrowdFlowObserved.staticSearchDateObservedFrom(siteRequest_, CrowdFlowObserved.staticSetDateObservedFrom(siteRequest_, o)));
	}

	public String sqlDateObservedFrom() {
		return dateObservedFrom;
	}

	////////////////////
	// dateObservedTo //
	////////////////////


	/**	 The entity dateObservedTo
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String dateObservedTo;

	/**	<br> The entity dateObservedTo
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObserved&fq=entiteVar_enUS_indexed_string:dateObservedTo">Find the entity dateObservedTo in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _dateObservedTo(Wrap<String> w);

	public String getDateObservedTo() {
		return dateObservedTo;
	}
	public void setDateObservedTo(String o) {
		this.dateObservedTo = CrowdFlowObserved.staticSetDateObservedTo(siteRequest_, o);
	}
	public static String staticSetDateObservedTo(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected CrowdFlowObserved dateObservedToInit() {
		Wrap<String> dateObservedToWrap = new Wrap<String>().var("dateObservedTo");
		if(dateObservedTo == null) {
			_dateObservedTo(dateObservedToWrap);
			Optional.ofNullable(dateObservedToWrap.getO()).ifPresent(o -> {
				setDateObservedTo(o);
			});
		}
		return (CrowdFlowObserved)this;
	}

	public static String staticSearchDateObservedTo(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDateObservedTo(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDateObservedTo(SiteRequestEnUS siteRequest_, String o) {
		return CrowdFlowObserved.staticSearchStrDateObservedTo(siteRequest_, CrowdFlowObserved.staticSearchDateObservedTo(siteRequest_, CrowdFlowObserved.staticSetDateObservedTo(siteRequest_, o)));
	}

	public String sqlDateObservedTo() {
		return dateObservedTo;
	}

	/////////////////
	// description //
	/////////////////


	/**	 The entity description
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String description;

	/**	<br> The entity description
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObserved&fq=entiteVar_enUS_indexed_string:description">Find the entity description in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _description(Wrap<String> w);

	public String getDescription() {
		return description;
	}
	public void setDescription(String o) {
		this.description = CrowdFlowObserved.staticSetDescription(siteRequest_, o);
	}
	public static String staticSetDescription(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected CrowdFlowObserved descriptionInit() {
		Wrap<String> descriptionWrap = new Wrap<String>().var("description");
		if(description == null) {
			_description(descriptionWrap);
			Optional.ofNullable(descriptionWrap.getO()).ifPresent(o -> {
				setDescription(o);
			});
		}
		return (CrowdFlowObserved)this;
	}

	public static String staticSearchDescription(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDescription(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDescription(SiteRequestEnUS siteRequest_, String o) {
		return CrowdFlowObserved.staticSearchStrDescription(siteRequest_, CrowdFlowObserved.staticSearchDescription(siteRequest_, CrowdFlowObserved.staticSetDescription(siteRequest_, o)));
	}

	public String sqlDescription() {
		return description;
	}

	///////////////
	// direction //
	///////////////


	/**	 The entity direction
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String direction;

	/**	<br> The entity direction
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObserved&fq=entiteVar_enUS_indexed_string:direction">Find the entity direction in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _direction(Wrap<String> w);

	public String getDirection() {
		return direction;
	}
	public void setDirection(String o) {
		this.direction = CrowdFlowObserved.staticSetDirection(siteRequest_, o);
	}
	public static String staticSetDirection(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected CrowdFlowObserved directionInit() {
		Wrap<String> directionWrap = new Wrap<String>().var("direction");
		if(direction == null) {
			_direction(directionWrap);
			Optional.ofNullable(directionWrap.getO()).ifPresent(o -> {
				setDirection(o);
			});
		}
		return (CrowdFlowObserved)this;
	}

	public static String staticSearchDirection(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDirection(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDirection(SiteRequestEnUS siteRequest_, String o) {
		return CrowdFlowObserved.staticSearchStrDirection(siteRequest_, CrowdFlowObserved.staticSearchDirection(siteRequest_, CrowdFlowObserved.staticSetDirection(siteRequest_, o)));
	}

	public String sqlDirection() {
		return direction;
	}

	//////////////
	// location //
	//////////////


	/**	 The entity location
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonDeserialize(using = PgClientPointDeserializer.class)
	@JsonSerialize(using = PgClientPointSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Point location;

	/**	<br> The entity location
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObserved&fq=entiteVar_enUS_indexed_string:location">Find the entity location in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _location(Wrap<Point> w);

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point location) {
		this.location = location;
	}
	@JsonIgnore
	public void setLocation(String o) {
		this.location = CrowdFlowObserved.staticSetLocation(siteRequest_, o);
	}
	public static Point staticSetLocation(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
			Matcher m = Pattern.compile("\\{[\\w\\W]*\"coordinates\"\\s*:\\s*\\[\\s*(\\d*\\.\\d*)\\s*,\\s*(\\d*\\.\\d*)\\]").matcher(o);
			if(m.find())
				return new Point(Double.parseDouble(m.group(1)), Double.parseDouble(m.group(2)));
			m = Pattern.compile("\\s*(\\d*\\.\\d*)\\s*,\\s*(\\d*\\.\\d*)").matcher(o);
			if(m.find())
				return new Point(Double.parseDouble(m.group(1)), Double.parseDouble(m.group(2)));
			throw new RuntimeException(String.format("Invalid point format \"%s\", try these formats instead: 55.633703,13.49254 or {\"type\":\"Point\",\"coordinates\":[55.633703,13.49254]}", o));
		}
		return null;
	}
	protected CrowdFlowObserved locationInit() {
		Wrap<Point> locationWrap = new Wrap<Point>().var("location");
		if(location == null) {
			_location(locationWrap);
			Optional.ofNullable(locationWrap.getO()).ifPresent(o -> {
				setLocation(o);
			});
		}
		return (CrowdFlowObserved)this;
	}

	public static Point staticSearchLocation(SiteRequestEnUS siteRequest_, Point o) {
		return o;
	}

	public static String staticSearchStrLocation(SiteRequestEnUS siteRequest_, Point o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqLocation(SiteRequestEnUS siteRequest_, String o) {
		return CrowdFlowObserved.staticSearchStrLocation(siteRequest_, CrowdFlowObserved.staticSearchLocation(siteRequest_, CrowdFlowObserved.staticSetLocation(siteRequest_, o)));
	}

	public Point sqlLocation() {
		return location;
	}

	//////////
	// name //
	//////////


	/**	 The entity name
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String name;

	/**	<br> The entity name
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObserved&fq=entiteVar_enUS_indexed_string:name">Find the entity name in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _name(Wrap<String> w);

	public String getName() {
		return name;
	}
	public void setName(String o) {
		this.name = CrowdFlowObserved.staticSetName(siteRequest_, o);
	}
	public static String staticSetName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected CrowdFlowObserved nameInit() {
		Wrap<String> nameWrap = new Wrap<String>().var("name");
		if(name == null) {
			_name(nameWrap);
			Optional.ofNullable(nameWrap.getO()).ifPresent(o -> {
				setName(o);
			});
		}
		return (CrowdFlowObserved)this;
	}

	public static String staticSearchName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqName(SiteRequestEnUS siteRequest_, String o) {
		return CrowdFlowObserved.staticSearchStrName(siteRequest_, CrowdFlowObserved.staticSearchName(siteRequest_, CrowdFlowObserved.staticSetName(siteRequest_, o)));
	}

	public String sqlName() {
		return name;
	}

	///////////////
	// occupancy //
	///////////////


	/**	 The entity occupancy
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal occupancy;

	/**	<br> The entity occupancy
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObserved&fq=entiteVar_enUS_indexed_string:occupancy">Find the entity occupancy in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _occupancy(Wrap<BigDecimal> w);

	public BigDecimal getOccupancy() {
		return occupancy;
	}

	public void setOccupancy(BigDecimal occupancy) {
		this.occupancy = occupancy;
	}
	@JsonIgnore
	public void setOccupancy(String o) {
		this.occupancy = CrowdFlowObserved.staticSetOccupancy(siteRequest_, o);
	}
	public static BigDecimal staticSetOccupancy(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setOccupancy(Double o) {
		setOccupancy(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setOccupancy(Integer o) {
		setOccupancy(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setOccupancy(Number o) {
		setOccupancy(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected CrowdFlowObserved occupancyInit() {
		Wrap<BigDecimal> occupancyWrap = new Wrap<BigDecimal>().var("occupancy");
		if(occupancy == null) {
			_occupancy(occupancyWrap);
			Optional.ofNullable(occupancyWrap.getO()).ifPresent(o -> {
				setOccupancy(o);
			});
		}
		return (CrowdFlowObserved)this;
	}

	public static Double staticSearchOccupancy(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrOccupancy(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqOccupancy(SiteRequestEnUS siteRequest_, String o) {
		return CrowdFlowObserved.staticSearchStrOccupancy(siteRequest_, CrowdFlowObserved.staticSearchOccupancy(siteRequest_, CrowdFlowObserved.staticSetOccupancy(siteRequest_, o)));
	}

	public BigDecimal sqlOccupancy() {
		return occupancy;
	}

	///////////
	// owner //
	///////////


	/**	 The entity owner
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject owner;

	/**	<br> The entity owner
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObserved&fq=entiteVar_enUS_indexed_string:owner">Find the entity owner in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _owner(Wrap<JsonObject> w);

	public JsonObject getOwner() {
		return owner;
	}

	public void setOwner(JsonObject owner) {
		this.owner = owner;
	}
	@JsonIgnore
	public void setOwner(String o) {
		this.owner = CrowdFlowObserved.staticSetOwner(siteRequest_, o);
	}
	public static JsonObject staticSetOwner(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected CrowdFlowObserved ownerInit() {
		Wrap<JsonObject> ownerWrap = new Wrap<JsonObject>().var("owner");
		if(owner == null) {
			_owner(ownerWrap);
			Optional.ofNullable(ownerWrap.getO()).ifPresent(o -> {
				setOwner(o);
			});
		}
		return (CrowdFlowObserved)this;
	}

	public static String staticSearchOwner(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o.toString();
	}

	public static String staticSearchStrOwner(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqOwner(SiteRequestEnUS siteRequest_, String o) {
		return CrowdFlowObserved.staticSearchStrOwner(siteRequest_, CrowdFlowObserved.staticSearchOwner(siteRequest_, CrowdFlowObserved.staticSetOwner(siteRequest_, o)));
	}

	public JsonObject sqlOwner() {
		return owner;
	}

	/////////////////
	// peopleCount //
	/////////////////


	/**	 The entity peopleCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer peopleCount;

	/**	<br> The entity peopleCount
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObserved&fq=entiteVar_enUS_indexed_string:peopleCount">Find the entity peopleCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _peopleCount(Wrap<Integer> w);

	public Integer getPeopleCount() {
		return peopleCount;
	}

	public void setPeopleCount(Integer peopleCount) {
		this.peopleCount = peopleCount;
	}
	@JsonIgnore
	public void setPeopleCount(String o) {
		this.peopleCount = CrowdFlowObserved.staticSetPeopleCount(siteRequest_, o);
	}
	public static Integer staticSetPeopleCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected CrowdFlowObserved peopleCountInit() {
		Wrap<Integer> peopleCountWrap = new Wrap<Integer>().var("peopleCount");
		if(peopleCount == null) {
			_peopleCount(peopleCountWrap);
			Optional.ofNullable(peopleCountWrap.getO()).ifPresent(o -> {
				setPeopleCount(o);
			});
		}
		return (CrowdFlowObserved)this;
	}

	public static Integer staticSearchPeopleCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrPeopleCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPeopleCount(SiteRequestEnUS siteRequest_, String o) {
		return CrowdFlowObserved.staticSearchStrPeopleCount(siteRequest_, CrowdFlowObserved.staticSearchPeopleCount(siteRequest_, CrowdFlowObserved.staticSetPeopleCount(siteRequest_, o)));
	}

	public Integer sqlPeopleCount() {
		return peopleCount;
	}

	////////////////////
	// refRoadSegment //
	////////////////////


	/**	 The entity refRoadSegment
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject refRoadSegment;

	/**	<br> The entity refRoadSegment
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObserved&fq=entiteVar_enUS_indexed_string:refRoadSegment">Find the entity refRoadSegment in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _refRoadSegment(Wrap<JsonObject> w);

	public JsonObject getRefRoadSegment() {
		return refRoadSegment;
	}

	public void setRefRoadSegment(JsonObject refRoadSegment) {
		this.refRoadSegment = refRoadSegment;
	}
	@JsonIgnore
	public void setRefRoadSegment(String o) {
		this.refRoadSegment = CrowdFlowObserved.staticSetRefRoadSegment(siteRequest_, o);
	}
	public static JsonObject staticSetRefRoadSegment(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected CrowdFlowObserved refRoadSegmentInit() {
		Wrap<JsonObject> refRoadSegmentWrap = new Wrap<JsonObject>().var("refRoadSegment");
		if(refRoadSegment == null) {
			_refRoadSegment(refRoadSegmentWrap);
			Optional.ofNullable(refRoadSegmentWrap.getO()).ifPresent(o -> {
				setRefRoadSegment(o);
			});
		}
		return (CrowdFlowObserved)this;
	}

	public static String staticSearchRefRoadSegment(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o.toString();
	}

	public static String staticSearchStrRefRoadSegment(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqRefRoadSegment(SiteRequestEnUS siteRequest_, String o) {
		return CrowdFlowObserved.staticSearchStrRefRoadSegment(siteRequest_, CrowdFlowObserved.staticSearchRefRoadSegment(siteRequest_, CrowdFlowObserved.staticSetRefRoadSegment(siteRequest_, o)));
	}

	public JsonObject sqlRefRoadSegment() {
		return refRoadSegment;
	}

	/////////////
	// seeAlso //
	/////////////


	/**	 The entity seeAlso
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject seeAlso;

	/**	<br> The entity seeAlso
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObserved&fq=entiteVar_enUS_indexed_string:seeAlso">Find the entity seeAlso in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _seeAlso(Wrap<JsonObject> w);

	public JsonObject getSeeAlso() {
		return seeAlso;
	}

	public void setSeeAlso(JsonObject seeAlso) {
		this.seeAlso = seeAlso;
	}
	@JsonIgnore
	public void setSeeAlso(String o) {
		this.seeAlso = CrowdFlowObserved.staticSetSeeAlso(siteRequest_, o);
	}
	public static JsonObject staticSetSeeAlso(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected CrowdFlowObserved seeAlsoInit() {
		Wrap<JsonObject> seeAlsoWrap = new Wrap<JsonObject>().var("seeAlso");
		if(seeAlso == null) {
			_seeAlso(seeAlsoWrap);
			Optional.ofNullable(seeAlsoWrap.getO()).ifPresent(o -> {
				setSeeAlso(o);
			});
		}
		return (CrowdFlowObserved)this;
	}

	public static String staticSearchSeeAlso(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o.toString();
	}

	public static String staticSearchStrSeeAlso(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSeeAlso(SiteRequestEnUS siteRequest_, String o) {
		return CrowdFlowObserved.staticSearchStrSeeAlso(siteRequest_, CrowdFlowObserved.staticSearchSeeAlso(siteRequest_, CrowdFlowObserved.staticSetSeeAlso(siteRequest_, o)));
	}

	public JsonObject sqlSeeAlso() {
		return seeAlso;
	}

	////////////
	// source //
	////////////


	/**	 The entity source
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String source;

	/**	<br> The entity source
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObserved&fq=entiteVar_enUS_indexed_string:source">Find the entity source in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _source(Wrap<String> w);

	public String getSource() {
		return source;
	}
	public void setSource(String o) {
		this.source = CrowdFlowObserved.staticSetSource(siteRequest_, o);
	}
	public static String staticSetSource(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected CrowdFlowObserved sourceInit() {
		Wrap<String> sourceWrap = new Wrap<String>().var("source");
		if(source == null) {
			_source(sourceWrap);
			Optional.ofNullable(sourceWrap.getO()).ifPresent(o -> {
				setSource(o);
			});
		}
		return (CrowdFlowObserved)this;
	}

	public static String staticSearchSource(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSource(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSource(SiteRequestEnUS siteRequest_, String o) {
		return CrowdFlowObserved.staticSearchStrSource(siteRequest_, CrowdFlowObserved.staticSearchSource(siteRequest_, CrowdFlowObserved.staticSetSource(siteRequest_, o)));
	}

	public String sqlSource() {
		return source;
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepCrowdFlowObserved(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepCrowdFlowObserved();
	}

	public Future<Void> promiseDeepCrowdFlowObserved() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseCrowdFlowObserved(promise2);
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

	public Future<Void> promiseCrowdFlowObserved(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				colorInit();
				entityIdInit();
				trafficSimulationIdInit();
				promise2.complete();
			} catch(Exception ex) {
				promise2.fail(ex);
			}
			return promise2.future();
		}).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			trafficSimulationSearchPromise().onSuccess(trafficSimulationSearch -> {
				promise2.complete();
			}).onFailure(ex -> {
				promise2.fail(ex);
			});
			return promise2.future();
		}).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				trafficSimulation_Init();
				walkingAreaIdInit();
				alternateNameInit();
				areaServedInit();
				averageCrowdSpeedInit();
				averageHeadwayTimeInit();
				congestedInit();
				dataProviderInit();
				dateCreatedInit();
				dateModifiedInit();
				dateObservedInit();
				dateObservedFromInit();
				dateObservedToInit();
				descriptionInit();
				directionInit();
				locationInit();
				nameInit();
				occupancyInit();
				ownerInit();
				peopleCountInit();
				refRoadSegmentInit();
				seeAlsoInit();
				sourceInit();
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
		return promiseDeepCrowdFlowObserved(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestCrowdFlowObserved(SiteRequestEnUS siteRequest_) {
			super.siteRequestBaseModel(siteRequest_);
		if(trafficSimulationSearch != null)
			trafficSimulationSearch.setSiteRequest_(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestCrowdFlowObserved(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainCrowdFlowObserved(v);
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
	public Object obtainCrowdFlowObserved(String var) {
		CrowdFlowObserved oCrowdFlowObserved = (CrowdFlowObserved)this;
		switch(var) {
			case "color":
				return oCrowdFlowObserved.color;
			case "entityId":
				return oCrowdFlowObserved.entityId;
			case "trafficSimulationId":
				return oCrowdFlowObserved.trafficSimulationId;
			case "trafficSimulationSearch":
				return oCrowdFlowObserved.trafficSimulationSearch;
			case "trafficSimulation_":
				return oCrowdFlowObserved.trafficSimulation_;
			case "walkingAreaId":
				return oCrowdFlowObserved.walkingAreaId;
			case "alternateName":
				return oCrowdFlowObserved.alternateName;
			case "areaServed":
				return oCrowdFlowObserved.areaServed;
			case "averageCrowdSpeed":
				return oCrowdFlowObserved.averageCrowdSpeed;
			case "averageHeadwayTime":
				return oCrowdFlowObserved.averageHeadwayTime;
			case "congested":
				return oCrowdFlowObserved.congested;
			case "dataProvider":
				return oCrowdFlowObserved.dataProvider;
			case "dateCreated":
				return oCrowdFlowObserved.dateCreated;
			case "dateModified":
				return oCrowdFlowObserved.dateModified;
			case "dateObserved":
				return oCrowdFlowObserved.dateObserved;
			case "dateObservedFrom":
				return oCrowdFlowObserved.dateObservedFrom;
			case "dateObservedTo":
				return oCrowdFlowObserved.dateObservedTo;
			case "description":
				return oCrowdFlowObserved.description;
			case "direction":
				return oCrowdFlowObserved.direction;
			case "location":
				return oCrowdFlowObserved.location;
			case "name":
				return oCrowdFlowObserved.name;
			case "occupancy":
				return oCrowdFlowObserved.occupancy;
			case "owner":
				return oCrowdFlowObserved.owner;
			case "peopleCount":
				return oCrowdFlowObserved.peopleCount;
			case "refRoadSegment":
				return oCrowdFlowObserved.refRoadSegment;
			case "seeAlso":
				return oCrowdFlowObserved.seeAlso;
			case "source":
				return oCrowdFlowObserved.source;
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
				o = relateCrowdFlowObserved(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateCrowdFlowObserved(String var, Object val) {
		CrowdFlowObserved oCrowdFlowObserved = (CrowdFlowObserved)this;
		switch(var) {
			default:
				return super.relateBaseModel(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetCrowdFlowObserved(entityVar,  siteRequest_, o);
	}
	public static Object staticSetCrowdFlowObserved(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "color":
			return CrowdFlowObserved.staticSetColor(siteRequest_, o);
		case "entityId":
			return CrowdFlowObserved.staticSetEntityId(siteRequest_, o);
		case "trafficSimulationId":
			return CrowdFlowObserved.staticSetTrafficSimulationId(siteRequest_, o);
		case "walkingAreaId":
			return CrowdFlowObserved.staticSetWalkingAreaId(siteRequest_, o);
		case "alternateName":
			return CrowdFlowObserved.staticSetAlternateName(siteRequest_, o);
		case "areaServed":
			return CrowdFlowObserved.staticSetAreaServed(siteRequest_, o);
		case "averageCrowdSpeed":
			return CrowdFlowObserved.staticSetAverageCrowdSpeed(siteRequest_, o);
		case "averageHeadwayTime":
			return CrowdFlowObserved.staticSetAverageHeadwayTime(siteRequest_, o);
		case "congested":
			return CrowdFlowObserved.staticSetCongested(siteRequest_, o);
		case "dataProvider":
			return CrowdFlowObserved.staticSetDataProvider(siteRequest_, o);
		case "dateCreated":
			return CrowdFlowObserved.staticSetDateCreated(siteRequest_, o);
		case "dateModified":
			return CrowdFlowObserved.staticSetDateModified(siteRequest_, o);
		case "dateObserved":
			return CrowdFlowObserved.staticSetDateObserved(siteRequest_, o);
		case "dateObservedFrom":
			return CrowdFlowObserved.staticSetDateObservedFrom(siteRequest_, o);
		case "dateObservedTo":
			return CrowdFlowObserved.staticSetDateObservedTo(siteRequest_, o);
		case "description":
			return CrowdFlowObserved.staticSetDescription(siteRequest_, o);
		case "direction":
			return CrowdFlowObserved.staticSetDirection(siteRequest_, o);
		case "location":
			return CrowdFlowObserved.staticSetLocation(siteRequest_, o);
		case "name":
			return CrowdFlowObserved.staticSetName(siteRequest_, o);
		case "occupancy":
			return CrowdFlowObserved.staticSetOccupancy(siteRequest_, o);
		case "owner":
			return CrowdFlowObserved.staticSetOwner(siteRequest_, o);
		case "peopleCount":
			return CrowdFlowObserved.staticSetPeopleCount(siteRequest_, o);
		case "refRoadSegment":
			return CrowdFlowObserved.staticSetRefRoadSegment(siteRequest_, o);
		case "seeAlso":
			return CrowdFlowObserved.staticSetSeeAlso(siteRequest_, o);
		case "source":
			return CrowdFlowObserved.staticSetSource(siteRequest_, o);
			default:
				return BaseModel.staticSetBaseModel(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchCrowdFlowObserved(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchCrowdFlowObserved(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "color":
			return CrowdFlowObserved.staticSearchColor(siteRequest_, (String)o);
		case "entityId":
			return CrowdFlowObserved.staticSearchEntityId(siteRequest_, (String)o);
		case "trafficSimulationId":
			return CrowdFlowObserved.staticSearchTrafficSimulationId(siteRequest_, (String)o);
		case "walkingAreaId":
			return CrowdFlowObserved.staticSearchWalkingAreaId(siteRequest_, (String)o);
		case "alternateName":
			return CrowdFlowObserved.staticSearchAlternateName(siteRequest_, (String)o);
		case "areaServed":
			return CrowdFlowObserved.staticSearchAreaServed(siteRequest_, (Polygon)o);
		case "averageCrowdSpeed":
			return CrowdFlowObserved.staticSearchAverageCrowdSpeed(siteRequest_, (BigDecimal)o);
		case "averageHeadwayTime":
			return CrowdFlowObserved.staticSearchAverageHeadwayTime(siteRequest_, (BigDecimal)o);
		case "congested":
			return CrowdFlowObserved.staticSearchCongested(siteRequest_, (Boolean)o);
		case "dataProvider":
			return CrowdFlowObserved.staticSearchDataProvider(siteRequest_, (String)o);
		case "dateCreated":
			return CrowdFlowObserved.staticSearchDateCreated(siteRequest_, (String)o);
		case "dateModified":
			return CrowdFlowObserved.staticSearchDateModified(siteRequest_, (String)o);
		case "dateObserved":
			return CrowdFlowObserved.staticSearchDateObserved(siteRequest_, (String)o);
		case "dateObservedFrom":
			return CrowdFlowObserved.staticSearchDateObservedFrom(siteRequest_, (String)o);
		case "dateObservedTo":
			return CrowdFlowObserved.staticSearchDateObservedTo(siteRequest_, (String)o);
		case "description":
			return CrowdFlowObserved.staticSearchDescription(siteRequest_, (String)o);
		case "direction":
			return CrowdFlowObserved.staticSearchDirection(siteRequest_, (String)o);
		case "location":
			return CrowdFlowObserved.staticSearchLocation(siteRequest_, (Point)o);
		case "name":
			return CrowdFlowObserved.staticSearchName(siteRequest_, (String)o);
		case "occupancy":
			return CrowdFlowObserved.staticSearchOccupancy(siteRequest_, (BigDecimal)o);
		case "owner":
			return CrowdFlowObserved.staticSearchOwner(siteRequest_, (JsonObject)o);
		case "peopleCount":
			return CrowdFlowObserved.staticSearchPeopleCount(siteRequest_, (Integer)o);
		case "refRoadSegment":
			return CrowdFlowObserved.staticSearchRefRoadSegment(siteRequest_, (JsonObject)o);
		case "seeAlso":
			return CrowdFlowObserved.staticSearchSeeAlso(siteRequest_, (JsonObject)o);
		case "source":
			return CrowdFlowObserved.staticSearchSource(siteRequest_, (String)o);
			default:
				return BaseModel.staticSearchBaseModel(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrCrowdFlowObserved(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrCrowdFlowObserved(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "color":
			return CrowdFlowObserved.staticSearchStrColor(siteRequest_, (String)o);
		case "entityId":
			return CrowdFlowObserved.staticSearchStrEntityId(siteRequest_, (String)o);
		case "trafficSimulationId":
			return CrowdFlowObserved.staticSearchStrTrafficSimulationId(siteRequest_, (String)o);
		case "walkingAreaId":
			return CrowdFlowObserved.staticSearchStrWalkingAreaId(siteRequest_, (String)o);
		case "alternateName":
			return CrowdFlowObserved.staticSearchStrAlternateName(siteRequest_, (String)o);
		case "areaServed":
			return CrowdFlowObserved.staticSearchStrAreaServed(siteRequest_, (Polygon)o);
		case "averageCrowdSpeed":
			return CrowdFlowObserved.staticSearchStrAverageCrowdSpeed(siteRequest_, (Double)o);
		case "averageHeadwayTime":
			return CrowdFlowObserved.staticSearchStrAverageHeadwayTime(siteRequest_, (Double)o);
		case "congested":
			return CrowdFlowObserved.staticSearchStrCongested(siteRequest_, (Boolean)o);
		case "dataProvider":
			return CrowdFlowObserved.staticSearchStrDataProvider(siteRequest_, (String)o);
		case "dateCreated":
			return CrowdFlowObserved.staticSearchStrDateCreated(siteRequest_, (String)o);
		case "dateModified":
			return CrowdFlowObserved.staticSearchStrDateModified(siteRequest_, (String)o);
		case "dateObserved":
			return CrowdFlowObserved.staticSearchStrDateObserved(siteRequest_, (String)o);
		case "dateObservedFrom":
			return CrowdFlowObserved.staticSearchStrDateObservedFrom(siteRequest_, (String)o);
		case "dateObservedTo":
			return CrowdFlowObserved.staticSearchStrDateObservedTo(siteRequest_, (String)o);
		case "description":
			return CrowdFlowObserved.staticSearchStrDescription(siteRequest_, (String)o);
		case "direction":
			return CrowdFlowObserved.staticSearchStrDirection(siteRequest_, (String)o);
		case "location":
			return CrowdFlowObserved.staticSearchStrLocation(siteRequest_, (Point)o);
		case "name":
			return CrowdFlowObserved.staticSearchStrName(siteRequest_, (String)o);
		case "occupancy":
			return CrowdFlowObserved.staticSearchStrOccupancy(siteRequest_, (Double)o);
		case "owner":
			return CrowdFlowObserved.staticSearchStrOwner(siteRequest_, (String)o);
		case "peopleCount":
			return CrowdFlowObserved.staticSearchStrPeopleCount(siteRequest_, (Integer)o);
		case "refRoadSegment":
			return CrowdFlowObserved.staticSearchStrRefRoadSegment(siteRequest_, (String)o);
		case "seeAlso":
			return CrowdFlowObserved.staticSearchStrSeeAlso(siteRequest_, (String)o);
		case "source":
			return CrowdFlowObserved.staticSearchStrSource(siteRequest_, (String)o);
			default:
				return BaseModel.staticSearchStrBaseModel(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqCrowdFlowObserved(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqCrowdFlowObserved(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "color":
			return CrowdFlowObserved.staticSearchFqColor(siteRequest_, o);
		case "entityId":
			return CrowdFlowObserved.staticSearchFqEntityId(siteRequest_, o);
		case "trafficSimulationId":
			return CrowdFlowObserved.staticSearchFqTrafficSimulationId(siteRequest_, o);
		case "walkingAreaId":
			return CrowdFlowObserved.staticSearchFqWalkingAreaId(siteRequest_, o);
		case "alternateName":
			return CrowdFlowObserved.staticSearchFqAlternateName(siteRequest_, o);
		case "areaServed":
			return CrowdFlowObserved.staticSearchFqAreaServed(siteRequest_, o);
		case "averageCrowdSpeed":
			return CrowdFlowObserved.staticSearchFqAverageCrowdSpeed(siteRequest_, o);
		case "averageHeadwayTime":
			return CrowdFlowObserved.staticSearchFqAverageHeadwayTime(siteRequest_, o);
		case "congested":
			return CrowdFlowObserved.staticSearchFqCongested(siteRequest_, o);
		case "dataProvider":
			return CrowdFlowObserved.staticSearchFqDataProvider(siteRequest_, o);
		case "dateCreated":
			return CrowdFlowObserved.staticSearchFqDateCreated(siteRequest_, o);
		case "dateModified":
			return CrowdFlowObserved.staticSearchFqDateModified(siteRequest_, o);
		case "dateObserved":
			return CrowdFlowObserved.staticSearchFqDateObserved(siteRequest_, o);
		case "dateObservedFrom":
			return CrowdFlowObserved.staticSearchFqDateObservedFrom(siteRequest_, o);
		case "dateObservedTo":
			return CrowdFlowObserved.staticSearchFqDateObservedTo(siteRequest_, o);
		case "description":
			return CrowdFlowObserved.staticSearchFqDescription(siteRequest_, o);
		case "direction":
			return CrowdFlowObserved.staticSearchFqDirection(siteRequest_, o);
		case "location":
			return CrowdFlowObserved.staticSearchFqLocation(siteRequest_, o);
		case "name":
			return CrowdFlowObserved.staticSearchFqName(siteRequest_, o);
		case "occupancy":
			return CrowdFlowObserved.staticSearchFqOccupancy(siteRequest_, o);
		case "owner":
			return CrowdFlowObserved.staticSearchFqOwner(siteRequest_, o);
		case "peopleCount":
			return CrowdFlowObserved.staticSearchFqPeopleCount(siteRequest_, o);
		case "refRoadSegment":
			return CrowdFlowObserved.staticSearchFqRefRoadSegment(siteRequest_, o);
		case "seeAlso":
			return CrowdFlowObserved.staticSearchFqSeeAlso(siteRequest_, o);
		case "source":
			return CrowdFlowObserved.staticSearchFqSource(siteRequest_, o);
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
					o = persistCrowdFlowObserved(v, val);
				else if(o instanceof BaseModel) {
					BaseModel oBaseModel = (BaseModel)o;
					o = oBaseModel.persistForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object persistCrowdFlowObserved(String var, Object val) {
		String varLower = var.toLowerCase();
			if("color".equals(varLower)) {
				if(val instanceof String) {
					setColor((String)val);
				}
				saves.add("color");
				return val;
			} else if("entityid".equals(varLower)) {
				if(val instanceof String) {
					setEntityId((String)val);
				}
				saves.add("entityId");
				return val;
			} else if("trafficsimulationid".equals(varLower)) {
				if(val instanceof String) {
					setTrafficSimulationId((String)val);
				}
				saves.add("trafficSimulationId");
				return val;
			} else if("walkingareaid".equals(varLower)) {
				if(val instanceof String) {
					setWalkingAreaId((String)val);
				}
				saves.add("walkingAreaId");
				return val;
			} else if("alternatename".equals(varLower)) {
				if(val instanceof String) {
					setAlternateName((String)val);
				}
				saves.add("alternateName");
				return val;
			} else if("areaserved".equals(varLower)) {
				if(val instanceof Polygon) {
					setAreaServed((Polygon)val);
				} else {
					setAreaServed(val == null ? null : val.toString());
				}
				saves.add("areaServed");
				return val;
			} else if("averagecrowdspeed".equals(varLower)) {
				if(val instanceof String) {
					setAverageCrowdSpeed((String)val);
				} else if(val instanceof Number) {
					setAverageCrowdSpeed(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("averageCrowdSpeed");
				return val;
			} else if("averageheadwaytime".equals(varLower)) {
				if(val instanceof String) {
					setAverageHeadwayTime((String)val);
				} else if(val instanceof Number) {
					setAverageHeadwayTime(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("averageHeadwayTime");
				return val;
			} else if("congested".equals(varLower)) {
				if(val instanceof Boolean) {
					setCongested((Boolean)val);
				} else {
					setCongested(val == null ? null : val.toString());
				}
				saves.add("congested");
				return val;
			} else if("dataprovider".equals(varLower)) {
				if(val instanceof String) {
					setDataProvider((String)val);
				}
				saves.add("dataProvider");
				return val;
			} else if("datecreated".equals(varLower)) {
				if(val instanceof String) {
					setDateCreated((String)val);
				}
				saves.add("dateCreated");
				return val;
			} else if("datemodified".equals(varLower)) {
				if(val instanceof String) {
					setDateModified((String)val);
				}
				saves.add("dateModified");
				return val;
			} else if("dateobserved".equals(varLower)) {
				if(val instanceof String) {
					setDateObserved((String)val);
				}
				saves.add("dateObserved");
				return val;
			} else if("dateobservedfrom".equals(varLower)) {
				if(val instanceof String) {
					setDateObservedFrom((String)val);
				}
				saves.add("dateObservedFrom");
				return val;
			} else if("dateobservedto".equals(varLower)) {
				if(val instanceof String) {
					setDateObservedTo((String)val);
				}
				saves.add("dateObservedTo");
				return val;
			} else if("description".equals(varLower)) {
				if(val instanceof String) {
					setDescription((String)val);
				}
				saves.add("description");
				return val;
			} else if("direction".equals(varLower)) {
				if(val instanceof String) {
					setDirection((String)val);
				}
				saves.add("direction");
				return val;
			} else if("location".equals(varLower)) {
				if(val instanceof String) {
					setLocation((String)val);
				} else if(val instanceof Point) {
					setLocation((Point)val);
				}
				saves.add("location");
				return val;
			} else if("name".equals(varLower)) {
				if(val instanceof String) {
					setName((String)val);
				}
				saves.add("name");
				return val;
			} else if("occupancy".equals(varLower)) {
				if(val instanceof String) {
					setOccupancy((String)val);
				} else if(val instanceof Number) {
					setOccupancy(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("occupancy");
				return val;
			} else if("owner".equals(varLower)) {
				if(val instanceof String) {
					setOwner((String)val);
				} else if(val instanceof JsonObject) {
					setOwner((JsonObject)val);
				}
				saves.add("owner");
				return val;
			} else if("peoplecount".equals(varLower)) {
				if(val instanceof Integer) {
					setPeopleCount((Integer)val);
				} else {
					setPeopleCount(val == null ? null : val.toString());
				}
				saves.add("peopleCount");
				return val;
			} else if("refroadsegment".equals(varLower)) {
				if(val instanceof String) {
					setRefRoadSegment((String)val);
				} else if(val instanceof JsonObject) {
					setRefRoadSegment((JsonObject)val);
				}
				saves.add("refRoadSegment");
				return val;
			} else if("seealso".equals(varLower)) {
				if(val instanceof String) {
					setSeeAlso((String)val);
				} else if(val instanceof JsonObject) {
					setSeeAlso((JsonObject)val);
				}
				saves.add("seeAlso");
				return val;
			} else if("source".equals(varLower)) {
				if(val instanceof String) {
					setSource((String)val);
				}
				saves.add("source");
				return val;
		} else {
			return super.persistBaseModel(var, val);
		}
	}

	/////////////
	// populate //
	/////////////

	@Override public void populateForClass(SolrResponse.Doc doc) {
		populateCrowdFlowObserved(doc);
	}
	public void populateCrowdFlowObserved(SolrResponse.Doc doc) {
		CrowdFlowObserved oCrowdFlowObserved = (CrowdFlowObserved)this;
		saves = Optional.ofNullable((ArrayList<String>)doc.get("saves_docvalues_strings")).orElse(new ArrayList<String>());
		if(saves != null) {

			if(saves.contains("color")) {
				String color = (String)doc.get("color_docvalues_string");
				if(color != null)
					oCrowdFlowObserved.setColor(color);
			}

			if(saves.contains("entityId")) {
				String entityId = (String)doc.get("entityId_docvalues_string");
				if(entityId != null)
					oCrowdFlowObserved.setEntityId(entityId);
			}

			if(saves.contains("trafficSimulationId")) {
				String trafficSimulationId = (String)doc.get("trafficSimulationId_docvalues_string");
				if(trafficSimulationId != null)
					oCrowdFlowObserved.setTrafficSimulationId(trafficSimulationId);
			}

			if(saves.contains("walkingAreaId")) {
				String walkingAreaId = (String)doc.get("walkingAreaId_docvalues_string");
				if(walkingAreaId != null)
					oCrowdFlowObserved.setWalkingAreaId(walkingAreaId);
			}

			if(saves.contains("alternateName")) {
				String alternateName = (String)doc.get("alternateName_docvalues_string");
				if(alternateName != null)
					oCrowdFlowObserved.setAlternateName(alternateName);
			}

			if(saves.contains("areaServed")) {
				Polygon areaServed = (Polygon)doc.get("areaServed_docvalues_location");
				if(areaServed != null)
					oCrowdFlowObserved.setAreaServed(areaServed);
			}

			if(saves.contains("averageCrowdSpeed")) {
				Double averageCrowdSpeed = (Double)doc.get("averageCrowdSpeed_docvalues_double");
				if(averageCrowdSpeed != null)
					oCrowdFlowObserved.setAverageCrowdSpeed(averageCrowdSpeed);
			}

			if(saves.contains("averageHeadwayTime")) {
				Double averageHeadwayTime = (Double)doc.get("averageHeadwayTime_docvalues_double");
				if(averageHeadwayTime != null)
					oCrowdFlowObserved.setAverageHeadwayTime(averageHeadwayTime);
			}

			if(saves.contains("congested")) {
				Boolean congested = (Boolean)doc.get("congested_docvalues_boolean");
				if(congested != null)
					oCrowdFlowObserved.setCongested(congested);
			}

			if(saves.contains("dataProvider")) {
				String dataProvider = (String)doc.get("dataProvider_docvalues_string");
				if(dataProvider != null)
					oCrowdFlowObserved.setDataProvider(dataProvider);
			}

			if(saves.contains("dateCreated")) {
				String dateCreated = (String)doc.get("dateCreated_docvalues_string");
				if(dateCreated != null)
					oCrowdFlowObserved.setDateCreated(dateCreated);
			}

			if(saves.contains("dateModified")) {
				String dateModified = (String)doc.get("dateModified_docvalues_string");
				if(dateModified != null)
					oCrowdFlowObserved.setDateModified(dateModified);
			}

			if(saves.contains("dateObserved")) {
				String dateObserved = (String)doc.get("dateObserved_docvalues_string");
				if(dateObserved != null)
					oCrowdFlowObserved.setDateObserved(dateObserved);
			}

			if(saves.contains("dateObservedFrom")) {
				String dateObservedFrom = (String)doc.get("dateObservedFrom_docvalues_string");
				if(dateObservedFrom != null)
					oCrowdFlowObserved.setDateObservedFrom(dateObservedFrom);
			}

			if(saves.contains("dateObservedTo")) {
				String dateObservedTo = (String)doc.get("dateObservedTo_docvalues_string");
				if(dateObservedTo != null)
					oCrowdFlowObserved.setDateObservedTo(dateObservedTo);
			}

			if(saves.contains("description")) {
				String description = (String)doc.get("description_docvalues_string");
				if(description != null)
					oCrowdFlowObserved.setDescription(description);
			}

			if(saves.contains("direction")) {
				String direction = (String)doc.get("direction_docvalues_string");
				if(direction != null)
					oCrowdFlowObserved.setDirection(direction);
			}

			if(saves.contains("location")) {
				Point location = (Point)doc.get("location_docvalues_location");
				if(location != null)
					oCrowdFlowObserved.setLocation(location);
			}

			if(saves.contains("name")) {
				String name = (String)doc.get("name_docvalues_string");
				if(name != null)
					oCrowdFlowObserved.setName(name);
			}

			if(saves.contains("occupancy")) {
				Double occupancy = (Double)doc.get("occupancy_docvalues_double");
				if(occupancy != null)
					oCrowdFlowObserved.setOccupancy(occupancy);
			}

			if(saves.contains("owner")) {
				String owner = (String)doc.get("owner_docvalues_string");
				if(owner != null)
					oCrowdFlowObserved.setOwner(owner);
			}

			if(saves.contains("peopleCount")) {
				Integer peopleCount = (Integer)doc.get("peopleCount_docvalues_int");
				if(peopleCount != null)
					oCrowdFlowObserved.setPeopleCount(peopleCount);
			}

			if(saves.contains("refRoadSegment")) {
				String refRoadSegment = (String)doc.get("refRoadSegment_docvalues_string");
				if(refRoadSegment != null)
					oCrowdFlowObserved.setRefRoadSegment(refRoadSegment);
			}

			if(saves.contains("seeAlso")) {
				String seeAlso = (String)doc.get("seeAlso_docvalues_string");
				if(seeAlso != null)
					oCrowdFlowObserved.setSeeAlso(seeAlso);
			}

			if(saves.contains("source")) {
				String source = (String)doc.get("source_docvalues_string");
				if(source != null)
					oCrowdFlowObserved.setSource(source);
			}
		}

		super.populateBaseModel(doc);
	}

	public void indexCrowdFlowObserved(JsonObject doc) {
		if(color != null) {
			doc.put("color_docvalues_string", color);
		}
		if(entityId != null) {
			doc.put("entityId_docvalues_string", entityId);
		}
		if(trafficSimulationId != null) {
			doc.put("trafficSimulationId_docvalues_string", trafficSimulationId);
		}
		if(walkingAreaId != null) {
			doc.put("walkingAreaId_docvalues_string", walkingAreaId);
		}
		if(alternateName != null) {
			doc.put("alternateName_docvalues_string", alternateName);
		}
		if(areaServed != null) {
			JsonArray pointsArray = new JsonArray();
			areaServed.getPoints().stream().map(point -> new JsonArray().add(Double.valueOf(point.getX())).add(Double.valueOf(point.getY()))).collect(Collectors.toList()).forEach(pointArray -> pointsArray.add(pointArray));
			doc.put("areaServed_docvalues_location", new JsonObject().put("type", "LineString").put("coordinates", pointsArray).toString());
		}
		if(averageCrowdSpeed != null) {
			doc.put("averageCrowdSpeed_docvalues_double", averageCrowdSpeed.doubleValue());
		}
		if(averageHeadwayTime != null) {
			doc.put("averageHeadwayTime_docvalues_double", averageHeadwayTime.doubleValue());
		}
		if(congested != null) {
			doc.put("congested_docvalues_boolean", congested);
		}
		if(dataProvider != null) {
			doc.put("dataProvider_docvalues_string", dataProvider);
		}
		if(dateCreated != null) {
			doc.put("dateCreated_docvalues_string", dateCreated);
		}
		if(dateModified != null) {
			doc.put("dateModified_docvalues_string", dateModified);
		}
		if(dateObserved != null) {
			doc.put("dateObserved_docvalues_string", dateObserved);
		}
		if(dateObservedFrom != null) {
			doc.put("dateObservedFrom_docvalues_string", dateObservedFrom);
		}
		if(dateObservedTo != null) {
			doc.put("dateObservedTo_docvalues_string", dateObservedTo);
		}
		if(description != null) {
			doc.put("description_docvalues_string", description);
		}
		if(direction != null) {
			doc.put("direction_docvalues_string", direction);
		}
		if(location != null) {
			doc.put("location_docvalues_location", String.format("%s,%s", location.getX(), location.getY()));
		}
		if(name != null) {
			doc.put("name_docvalues_string", name);
		}
		if(occupancy != null) {
			doc.put("occupancy_docvalues_double", occupancy.doubleValue());
		}
		if(owner != null) {
			doc.put("owner_docvalues_string", owner.toString());
		}
		if(peopleCount != null) {
			doc.put("peopleCount_docvalues_int", peopleCount);
		}
		if(refRoadSegment != null) {
			doc.put("refRoadSegment_docvalues_string", refRoadSegment.toString());
		}
		if(seeAlso != null) {
			doc.put("seeAlso_docvalues_string", seeAlso.toString());
		}
		if(source != null) {
			doc.put("source_docvalues_string", source);
		}
		super.indexBaseModel(doc);

	}

	public static String varStoredCrowdFlowObserved(String entityVar) {
		switch(entityVar) {
			case "color":
				return "color_docvalues_string";
			case "entityId":
				return "entityId_docvalues_string";
			case "trafficSimulationId":
				return "trafficSimulationId_docvalues_string";
			case "walkingAreaId":
				return "walkingAreaId_docvalues_string";
			case "alternateName":
				return "alternateName_docvalues_string";
			case "areaServed":
				return "areaServed_docvalues_location";
			case "averageCrowdSpeed":
				return "averageCrowdSpeed_docvalues_double";
			case "averageHeadwayTime":
				return "averageHeadwayTime_docvalues_double";
			case "congested":
				return "congested_docvalues_boolean";
			case "dataProvider":
				return "dataProvider_docvalues_string";
			case "dateCreated":
				return "dateCreated_docvalues_string";
			case "dateModified":
				return "dateModified_docvalues_string";
			case "dateObserved":
				return "dateObserved_docvalues_string";
			case "dateObservedFrom":
				return "dateObservedFrom_docvalues_string";
			case "dateObservedTo":
				return "dateObservedTo_docvalues_string";
			case "description":
				return "description_docvalues_string";
			case "direction":
				return "direction_docvalues_string";
			case "location":
				return "location_docvalues_location";
			case "name":
				return "name_docvalues_string";
			case "occupancy":
				return "occupancy_docvalues_double";
			case "owner":
				return "owner_docvalues_string";
			case "peopleCount":
				return "peopleCount_docvalues_int";
			case "refRoadSegment":
				return "refRoadSegment_docvalues_string";
			case "seeAlso":
				return "seeAlso_docvalues_string";
			case "source":
				return "source_docvalues_string";
			default:
				return BaseModel.varStoredBaseModel(entityVar);
		}
	}

	public static String varIndexedCrowdFlowObserved(String entityVar) {
		switch(entityVar) {
			case "color":
				return "color_docvalues_string";
			case "entityId":
				return "entityId_docvalues_string";
			case "trafficSimulationId":
				return "trafficSimulationId_docvalues_string";
			case "walkingAreaId":
				return "walkingAreaId_docvalues_string";
			case "alternateName":
				return "alternateName_docvalues_string";
			case "areaServed":
				return "areaServed_docvalues_location";
			case "averageCrowdSpeed":
				return "averageCrowdSpeed_docvalues_double";
			case "averageHeadwayTime":
				return "averageHeadwayTime_docvalues_double";
			case "congested":
				return "congested_docvalues_boolean";
			case "dataProvider":
				return "dataProvider_docvalues_string";
			case "dateCreated":
				return "dateCreated_docvalues_string";
			case "dateModified":
				return "dateModified_docvalues_string";
			case "dateObserved":
				return "dateObserved_docvalues_string";
			case "dateObservedFrom":
				return "dateObservedFrom_docvalues_string";
			case "dateObservedTo":
				return "dateObservedTo_docvalues_string";
			case "description":
				return "description_docvalues_string";
			case "direction":
				return "direction_docvalues_string";
			case "location":
				return "location_docvalues_location";
			case "name":
				return "name_docvalues_string";
			case "occupancy":
				return "occupancy_docvalues_double";
			case "owner":
				return "owner_docvalues_string";
			case "peopleCount":
				return "peopleCount_docvalues_int";
			case "refRoadSegment":
				return "refRoadSegment_docvalues_string";
			case "seeAlso":
				return "seeAlso_docvalues_string";
			case "source":
				return "source_docvalues_string";
			default:
				return BaseModel.varIndexedBaseModel(entityVar);
		}
	}

	public static String searchVarCrowdFlowObserved(String searchVar) {
		switch(searchVar) {
			case "color_docvalues_string":
				return "color";
			case "entityId_docvalues_string":
				return "entityId";
			case "trafficSimulationId_docvalues_string":
				return "trafficSimulationId";
			case "walkingAreaId_docvalues_string":
				return "walkingAreaId";
			case "alternateName_docvalues_string":
				return "alternateName";
			case "areaServed_docvalues_location":
				return "areaServed";
			case "averageCrowdSpeed_docvalues_double":
				return "averageCrowdSpeed";
			case "averageHeadwayTime_docvalues_double":
				return "averageHeadwayTime";
			case "congested_docvalues_boolean":
				return "congested";
			case "dataProvider_docvalues_string":
				return "dataProvider";
			case "dateCreated_docvalues_string":
				return "dateCreated";
			case "dateModified_docvalues_string":
				return "dateModified";
			case "dateObserved_docvalues_string":
				return "dateObserved";
			case "dateObservedFrom_docvalues_string":
				return "dateObservedFrom";
			case "dateObservedTo_docvalues_string":
				return "dateObservedTo";
			case "description_docvalues_string":
				return "description";
			case "direction_docvalues_string":
				return "direction";
			case "location_docvalues_location":
				return "location";
			case "name_docvalues_string":
				return "name";
			case "occupancy_docvalues_double":
				return "occupancy";
			case "owner_docvalues_string":
				return "owner";
			case "peopleCount_docvalues_int":
				return "peopleCount";
			case "refRoadSegment_docvalues_string":
				return "refRoadSegment";
			case "seeAlso_docvalues_string":
				return "seeAlso";
			case "source_docvalues_string":
				return "source";
			default:
				return BaseModel.searchVarBaseModel(searchVar);
		}
	}

	public static String varSearchCrowdFlowObserved(String entityVar) {
		switch(entityVar) {
			default:
				return BaseModel.varSearchBaseModel(entityVar);
		}
	}

	public static String varSuggestedCrowdFlowObserved(String entityVar) {
		switch(entityVar) {
			default:
				return BaseModel.varSuggestedBaseModel(entityVar);
		}
	}

	/////////////
	// store //
	/////////////

	@Override public void storeForClass(SolrResponse.Doc doc) {
		storeCrowdFlowObserved(doc);
	}
	public void storeCrowdFlowObserved(SolrResponse.Doc doc) {
		CrowdFlowObserved oCrowdFlowObserved = (CrowdFlowObserved)this;
		SiteRequestEnUS siteRequest = oCrowdFlowObserved.getSiteRequest_();

		oCrowdFlowObserved.setColor(Optional.ofNullable(doc.get("color_docvalues_string")).map(v -> v.toString()).orElse(null));
		oCrowdFlowObserved.setEntityId(Optional.ofNullable(doc.get("entityId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oCrowdFlowObserved.setTrafficSimulationId(Optional.ofNullable(doc.get("trafficSimulationId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oCrowdFlowObserved.setWalkingAreaId(Optional.ofNullable(doc.get("walkingAreaId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oCrowdFlowObserved.setAlternateName(Optional.ofNullable(doc.get("alternateName_docvalues_string")).map(v -> v.toString()).orElse(null));
		oCrowdFlowObserved.setAreaServed(Optional.ofNullable(doc.get("areaServed_docvalues_location")).map(v -> v.toString()).orElse(null));
		oCrowdFlowObserved.setAverageCrowdSpeed(Optional.ofNullable(doc.get("averageCrowdSpeed_docvalues_double")).map(v -> v.toString()).orElse(null));
		oCrowdFlowObserved.setAverageHeadwayTime(Optional.ofNullable(doc.get("averageHeadwayTime_docvalues_double")).map(v -> v.toString()).orElse(null));
		oCrowdFlowObserved.setCongested(Optional.ofNullable(doc.get("congested_docvalues_boolean")).map(v -> v.toString()).orElse(null));
		oCrowdFlowObserved.setDataProvider(Optional.ofNullable(doc.get("dataProvider_docvalues_string")).map(v -> v.toString()).orElse(null));
		oCrowdFlowObserved.setDateCreated(Optional.ofNullable(doc.get("dateCreated_docvalues_string")).map(v -> v.toString()).orElse(null));
		oCrowdFlowObserved.setDateModified(Optional.ofNullable(doc.get("dateModified_docvalues_string")).map(v -> v.toString()).orElse(null));
		oCrowdFlowObserved.setDateObserved(Optional.ofNullable(doc.get("dateObserved_docvalues_string")).map(v -> v.toString()).orElse(null));
		oCrowdFlowObserved.setDateObservedFrom(Optional.ofNullable(doc.get("dateObservedFrom_docvalues_string")).map(v -> v.toString()).orElse(null));
		oCrowdFlowObserved.setDateObservedTo(Optional.ofNullable(doc.get("dateObservedTo_docvalues_string")).map(v -> v.toString()).orElse(null));
		oCrowdFlowObserved.setDescription(Optional.ofNullable(doc.get("description_docvalues_string")).map(v -> v.toString()).orElse(null));
		oCrowdFlowObserved.setDirection(Optional.ofNullable(doc.get("direction_docvalues_string")).map(v -> v.toString()).orElse(null));
		oCrowdFlowObserved.setLocation(Optional.ofNullable(doc.get("location_docvalues_location")).map(v -> v.toString()).orElse(null));
		oCrowdFlowObserved.setName(Optional.ofNullable(doc.get("name_docvalues_string")).map(v -> v.toString()).orElse(null));
		oCrowdFlowObserved.setOccupancy(Optional.ofNullable(doc.get("occupancy_docvalues_double")).map(v -> v.toString()).orElse(null));
		oCrowdFlowObserved.setOwner(Optional.ofNullable(doc.get("owner_docvalues_string")).map(v -> v.toString()).orElse(null));
		oCrowdFlowObserved.setPeopleCount(Optional.ofNullable(doc.get("peopleCount_docvalues_int")).map(v -> v.toString()).orElse(null));
		oCrowdFlowObserved.setRefRoadSegment(Optional.ofNullable(doc.get("refRoadSegment_docvalues_string")).map(v -> v.toString()).orElse(null));
		oCrowdFlowObserved.setSeeAlso(Optional.ofNullable(doc.get("seeAlso_docvalues_string")).map(v -> v.toString()).orElse(null));
		oCrowdFlowObserved.setSource(Optional.ofNullable(doc.get("source_docvalues_string")).map(v -> v.toString()).orElse(null));

		super.storeBaseModel(doc);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestCrowdFlowObserved() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof CrowdFlowObserved) {
			CrowdFlowObserved original = (CrowdFlowObserved)o;
			if(!Objects.equals(color, original.getColor()))
				apiRequest.addVars("color");
			if(!Objects.equals(entityId, original.getEntityId()))
				apiRequest.addVars("entityId");
			if(!Objects.equals(trafficSimulationId, original.getTrafficSimulationId()))
				apiRequest.addVars("trafficSimulationId");
			if(!Objects.equals(walkingAreaId, original.getWalkingAreaId()))
				apiRequest.addVars("walkingAreaId");
			if(!Objects.equals(alternateName, original.getAlternateName()))
				apiRequest.addVars("alternateName");
			if(!Objects.equals(areaServed, original.getAreaServed()))
				apiRequest.addVars("areaServed");
			if(!Objects.equals(averageCrowdSpeed, original.getAverageCrowdSpeed()) && averageCrowdSpeed != null && original.getAverageCrowdSpeed() != null && averageCrowdSpeed.compareTo(original.getAverageCrowdSpeed()) != 0)
				apiRequest.addVars("averageCrowdSpeed");
			if(!Objects.equals(averageHeadwayTime, original.getAverageHeadwayTime()) && averageHeadwayTime != null && original.getAverageHeadwayTime() != null && averageHeadwayTime.compareTo(original.getAverageHeadwayTime()) != 0)
				apiRequest.addVars("averageHeadwayTime");
			if(!Objects.equals(congested, original.getCongested()))
				apiRequest.addVars("congested");
			if(!Objects.equals(dataProvider, original.getDataProvider()))
				apiRequest.addVars("dataProvider");
			if(!Objects.equals(dateCreated, original.getDateCreated()))
				apiRequest.addVars("dateCreated");
			if(!Objects.equals(dateModified, original.getDateModified()))
				apiRequest.addVars("dateModified");
			if(!Objects.equals(dateObserved, original.getDateObserved()))
				apiRequest.addVars("dateObserved");
			if(!Objects.equals(dateObservedFrom, original.getDateObservedFrom()))
				apiRequest.addVars("dateObservedFrom");
			if(!Objects.equals(dateObservedTo, original.getDateObservedTo()))
				apiRequest.addVars("dateObservedTo");
			if(!Objects.equals(description, original.getDescription()))
				apiRequest.addVars("description");
			if(!Objects.equals(direction, original.getDirection()))
				apiRequest.addVars("direction");
			if(!Objects.equals(location, original.getLocation()))
				apiRequest.addVars("location");
			if(!Objects.equals(name, original.getName()))
				apiRequest.addVars("name");
			if(!Objects.equals(occupancy, original.getOccupancy()) && occupancy != null && original.getOccupancy() != null && occupancy.compareTo(original.getOccupancy()) != 0)
				apiRequest.addVars("occupancy");
			if(!Objects.equals(owner, original.getOwner()))
				apiRequest.addVars("owner");
			if(!Objects.equals(peopleCount, original.getPeopleCount()))
				apiRequest.addVars("peopleCount");
			if(!Objects.equals(refRoadSegment, original.getRefRoadSegment()))
				apiRequest.addVars("refRoadSegment");
			if(!Objects.equals(seeAlso, original.getSeeAlso()))
				apiRequest.addVars("seeAlso");
			if(!Objects.equals(source, original.getSource()))
				apiRequest.addVars("source");
			super.apiRequestBaseModel();
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(Optional.ofNullable(color).map(v -> "color: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(entityId).map(v -> "entityId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(trafficSimulationId).map(v -> "trafficSimulationId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(walkingAreaId).map(v -> "walkingAreaId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(alternateName).map(v -> "alternateName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(areaServed).map(v -> "areaServed: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(averageCrowdSpeed).map(v -> "averageCrowdSpeed: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(averageHeadwayTime).map(v -> "averageHeadwayTime: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(congested).map(v -> "congested: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(dataProvider).map(v -> "dataProvider: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(dateCreated).map(v -> "dateCreated: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(dateModified).map(v -> "dateModified: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(dateObserved).map(v -> "dateObserved: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(dateObservedFrom).map(v -> "dateObservedFrom: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(dateObservedTo).map(v -> "dateObservedTo: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(description).map(v -> "description: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(direction).map(v -> "direction: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(location).map(v -> "location: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(name).map(v -> "name: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(occupancy).map(v -> "occupancy: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(owner).map(v -> "owner: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(peopleCount).map(v -> "peopleCount: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(refRoadSegment).map(v -> "refRoadSegment: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(seeAlso).map(v -> "seeAlso: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(source).map(v -> "source: \"" + v + "\"\n" ).orElse(""));
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "CrowdFlowObserved";
	public static final String VAR_color = "color";
	public static final String VAR_entityId = "entityId";
	public static final String VAR_trafficSimulationId = "trafficSimulationId";
	public static final String VAR_trafficSimulationSearch = "trafficSimulationSearch";
	public static final String VAR_trafficSimulation_ = "trafficSimulation_";
	public static final String VAR_walkingAreaId = "walkingAreaId";
	public static final String VAR_alternateName = "alternateName";
	public static final String VAR_areaServed = "areaServed";
	public static final String VAR_averageCrowdSpeed = "averageCrowdSpeed";
	public static final String VAR_averageHeadwayTime = "averageHeadwayTime";
	public static final String VAR_congested = "congested";
	public static final String VAR_dataProvider = "dataProvider";
	public static final String VAR_dateCreated = "dateCreated";
	public static final String VAR_dateModified = "dateModified";
	public static final String VAR_dateObserved = "dateObserved";
	public static final String VAR_dateObservedFrom = "dateObservedFrom";
	public static final String VAR_dateObservedTo = "dateObservedTo";
	public static final String VAR_description = "description";
	public static final String VAR_direction = "direction";
	public static final String VAR_location = "location";
	public static final String VAR_name = "name";
	public static final String VAR_occupancy = "occupancy";
	public static final String VAR_owner = "owner";
	public static final String VAR_peopleCount = "peopleCount";
	public static final String VAR_refRoadSegment = "refRoadSegment";
	public static final String VAR_seeAlso = "seeAlso";
	public static final String VAR_source = "source";

	public static List<String> varsQForClass() {
		return CrowdFlowObserved.varsQCrowdFlowObserved(new ArrayList<String>());
	}
	public static List<String> varsQCrowdFlowObserved(List<String> vars) {
		BaseModel.varsQBaseModel(vars);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return CrowdFlowObserved.varsFqCrowdFlowObserved(new ArrayList<String>());
	}
	public static List<String> varsFqCrowdFlowObserved(List<String> vars) {
		vars.add(VAR_color);
		vars.add(VAR_entityId);
		vars.add(VAR_trafficSimulationId);
		vars.add(VAR_walkingAreaId);
		vars.add(VAR_alternateName);
		vars.add(VAR_areaServed);
		vars.add(VAR_averageCrowdSpeed);
		vars.add(VAR_averageHeadwayTime);
		vars.add(VAR_congested);
		vars.add(VAR_dataProvider);
		vars.add(VAR_dateCreated);
		vars.add(VAR_dateModified);
		vars.add(VAR_dateObserved);
		vars.add(VAR_dateObservedFrom);
		vars.add(VAR_dateObservedTo);
		vars.add(VAR_description);
		vars.add(VAR_direction);
		vars.add(VAR_location);
		vars.add(VAR_name);
		vars.add(VAR_occupancy);
		vars.add(VAR_owner);
		vars.add(VAR_peopleCount);
		vars.add(VAR_refRoadSegment);
		vars.add(VAR_seeAlso);
		vars.add(VAR_source);
		BaseModel.varsFqBaseModel(vars);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return CrowdFlowObserved.varsRangeCrowdFlowObserved(new ArrayList<String>());
	}
	public static List<String> varsRangeCrowdFlowObserved(List<String> vars) {
		vars.add(VAR_averageCrowdSpeed);
		vars.add(VAR_averageHeadwayTime);
		vars.add(VAR_location);
		vars.add(VAR_occupancy);
		vars.add(VAR_owner);
		vars.add(VAR_peopleCount);
		vars.add(VAR_refRoadSegment);
		vars.add(VAR_seeAlso);
		BaseModel.varsRangeBaseModel(vars);
		return vars;
	}

	public static final String DISPLAY_NAME_color = "color";
	public static final String DISPLAY_NAME_entityId = "entity ID";
	public static final String DISPLAY_NAME_trafficSimulationId = "traffic simulation ID";
	public static final String DISPLAY_NAME_trafficSimulationSearch = "";
	public static final String DISPLAY_NAME_trafficSimulation_ = "";
	public static final String DISPLAY_NAME_walkingAreaId = "walking area ID";
	public static final String DISPLAY_NAME_alternateName = "alternate name";
	public static final String DISPLAY_NAME_areaServed = "area served";
	public static final String DISPLAY_NAME_averageCrowdSpeed = "average crowd speed";
	public static final String DISPLAY_NAME_averageHeadwayTime = "average headway time";
	public static final String DISPLAY_NAME_congested = "congested";
	public static final String DISPLAY_NAME_dataProvider = "data provider";
	public static final String DISPLAY_NAME_dateCreated = "date created";
	public static final String DISPLAY_NAME_dateModified = "date modified";
	public static final String DISPLAY_NAME_dateObserved = "date observed";
	public static final String DISPLAY_NAME_dateObservedFrom = "date observed from";
	public static final String DISPLAY_NAME_dateObservedTo = "date observed to";
	public static final String DISPLAY_NAME_description = "description";
	public static final String DISPLAY_NAME_direction = "direction";
	public static final String DISPLAY_NAME_location = "location";
	public static final String DISPLAY_NAME_name = "name";
	public static final String DISPLAY_NAME_occupancy = "occupancy";
	public static final String DISPLAY_NAME_owner = "owner";
	public static final String DISPLAY_NAME_peopleCount = "people count";
	public static final String DISPLAY_NAME_refRoadSegment = "ref road segment";
	public static final String DISPLAY_NAME_seeAlso = "see also";
	public static final String DISPLAY_NAME_source = "source";

	public static String displayNameForClass(String var) {
		return CrowdFlowObserved.displayNameCrowdFlowObserved(var);
	}
	public static String displayNameCrowdFlowObserved(String var) {
		switch(var) {
		case VAR_color:
			return DISPLAY_NAME_color;
		case VAR_entityId:
			return DISPLAY_NAME_entityId;
		case VAR_trafficSimulationId:
			return DISPLAY_NAME_trafficSimulationId;
		case VAR_trafficSimulationSearch:
			return DISPLAY_NAME_trafficSimulationSearch;
		case VAR_trafficSimulation_:
			return DISPLAY_NAME_trafficSimulation_;
		case VAR_walkingAreaId:
			return DISPLAY_NAME_walkingAreaId;
		case VAR_alternateName:
			return DISPLAY_NAME_alternateName;
		case VAR_areaServed:
			return DISPLAY_NAME_areaServed;
		case VAR_averageCrowdSpeed:
			return DISPLAY_NAME_averageCrowdSpeed;
		case VAR_averageHeadwayTime:
			return DISPLAY_NAME_averageHeadwayTime;
		case VAR_congested:
			return DISPLAY_NAME_congested;
		case VAR_dataProvider:
			return DISPLAY_NAME_dataProvider;
		case VAR_dateCreated:
			return DISPLAY_NAME_dateCreated;
		case VAR_dateModified:
			return DISPLAY_NAME_dateModified;
		case VAR_dateObserved:
			return DISPLAY_NAME_dateObserved;
		case VAR_dateObservedFrom:
			return DISPLAY_NAME_dateObservedFrom;
		case VAR_dateObservedTo:
			return DISPLAY_NAME_dateObservedTo;
		case VAR_description:
			return DISPLAY_NAME_description;
		case VAR_direction:
			return DISPLAY_NAME_direction;
		case VAR_location:
			return DISPLAY_NAME_location;
		case VAR_name:
			return DISPLAY_NAME_name;
		case VAR_occupancy:
			return DISPLAY_NAME_occupancy;
		case VAR_owner:
			return DISPLAY_NAME_owner;
		case VAR_peopleCount:
			return DISPLAY_NAME_peopleCount;
		case VAR_refRoadSegment:
			return DISPLAY_NAME_refRoadSegment;
		case VAR_seeAlso:
			return DISPLAY_NAME_seeAlso;
		case VAR_source:
			return DISPLAY_NAME_source;
		default:
			return BaseModel.displayNameBaseModel(var);
		}
	}

	public static String descriptionCrowdFlowObserved(String var) {
		switch(var) {
		case VAR_entityId:
			return "A unique ID for this Smart Data Model";
		case VAR_trafficSimulationId:
			return "The Traffic Simulation ID";
		case VAR_walkingAreaId:
			return "The walking area ID of pedestrians in SUMO";
		case VAR_alternateName:
			return "An alternative name for this item";
		case VAR_areaServed:
			return "The geographic area where a service or offered item is provided";
		case VAR_averageCrowdSpeed:
			return "Average speed of the crowd transiting during the observation period";
		case VAR_averageHeadwayTime:
			return "Average headway time. Headway time is the time elapsed between two consecutive persons";
		case VAR_congested:
			return "Flags whether there was a crowd congestion during the observation period in the referred walkway. The absence of this attribute means no crowd congestion";
		case VAR_dataProvider:
			return "A sequence of characters identifying the provider of the harmonised data entity.";
		case VAR_dateCreated:
			return "Entity creation timestamp. This will usually be allocated by the storage platform.";
		case VAR_dateModified:
			return "Timestamp of the last modification of the entity. This will usually be allocated by the storage platform.";
		case VAR_dateObserved:
			return "The date and time of this observation in ISO8601 UTC format. It can be represented by an specific time instant or by an ISO8601 interval. As a workaround for the lack of support of Orion Context Broker for datetime intervals, it can be used two separate attributes: `dateObservedFrom`, `dateObservedTo`";
		case VAR_dateObservedFrom:
			return "Observation period start date and time. See `dateObserved`.";
		case VAR_dateObservedTo:
			return "Observation period end date and time. See `dateObserved`.";
		case VAR_description:
			return "A description of this item";
		case VAR_direction:
			return "Usual direction of travel in the walkway referred by this observation with respect to the city center. Enum:'inbound, outbound'";
		case VAR_location:
			return "Geojson reference to the item. It can be Point, LineString, Polygon, MultiPoint, MultiLineString or MultiPolygon";
		case VAR_name:
			return "The name of this item.";
		case VAR_occupancy:
			return "Fraction of the observation time where a person has been occupying the observed walkway";
		case VAR_owner:
			return "A List containing a JSON encoded sequence of characters referencing the unique Ids of the owner(s)";
		case VAR_peopleCount:
			return "Total number of people detected during this observation.";
		case VAR_refRoadSegment:
			return "Concerned road segment on which the observation has been made";
		case VAR_seeAlso:
			return "list of uri pointing to additional resources about the item";
		case VAR_source:
			return "A sequence of characters giving the original source of the entity data as a URL. Recommended to be the fully qualified domain name of the source provider, or the URL to the source object.";
			default:
				return BaseModel.descriptionBaseModel(var);
		}
	}

	public static String classSimpleNameCrowdFlowObserved(String var) {
		switch(var) {
		case VAR_color:
			return "String";
		case VAR_entityId:
			return "String";
		case VAR_trafficSimulationId:
			return "String";
		case VAR_trafficSimulationSearch:
			return "SearchList";
		case VAR_trafficSimulation_:
			return "TrafficSimulation";
		case VAR_walkingAreaId:
			return "String";
		case VAR_alternateName:
			return "String";
		case VAR_areaServed:
			return "Polygon";
		case VAR_averageCrowdSpeed:
			return "BigDecimal";
		case VAR_averageHeadwayTime:
			return "BigDecimal";
		case VAR_congested:
			return "Boolean";
		case VAR_dataProvider:
			return "String";
		case VAR_dateCreated:
			return "String";
		case VAR_dateModified:
			return "String";
		case VAR_dateObserved:
			return "String";
		case VAR_dateObservedFrom:
			return "String";
		case VAR_dateObservedTo:
			return "String";
		case VAR_description:
			return "String";
		case VAR_direction:
			return "String";
		case VAR_location:
			return "Point";
		case VAR_name:
			return "String";
		case VAR_occupancy:
			return "BigDecimal";
		case VAR_owner:
			return "JsonObject";
		case VAR_peopleCount:
			return "Integer";
		case VAR_refRoadSegment:
			return "JsonObject";
		case VAR_seeAlso:
			return "JsonObject";
		case VAR_source:
			return "String";
			default:
				return BaseModel.classSimpleNameBaseModel(var);
		}
	}

	public static Integer htmColumnCrowdFlowObserved(String var) {
		switch(var) {
			default:
				return BaseModel.htmColumnBaseModel(var);
		}
	}

	public static Integer htmRowCrowdFlowObserved(String var) {
		switch(var) {
		case VAR_color:
			return 3;
		case VAR_entityId:
			return 5;
		case VAR_trafficSimulationId:
			return 5;
		case VAR_walkingAreaId:
			return 3;
		case VAR_alternateName:
			return 3;
		case VAR_areaServed:
			return 3;
		case VAR_averageCrowdSpeed:
			return 4;
		case VAR_averageHeadwayTime:
			return 4;
		case VAR_congested:
			return 4;
		case VAR_dataProvider:
			return 5;
		case VAR_dateCreated:
			return 5;
		case VAR_dateModified:
			return 5;
		case VAR_dateObserved:
			return 6;
		case VAR_dateObservedFrom:
			return 6;
		case VAR_dateObservedTo:
			return 6;
		case VAR_description:
			return 7;
		case VAR_direction:
			return 7;
		case VAR_location:
			return 7;
		case VAR_name:
			return 8;
		case VAR_occupancy:
			return 8;
		case VAR_owner:
			return 8;
		case VAR_peopleCount:
			return 9;
		case VAR_refRoadSegment:
			return 9;
		case VAR_seeAlso:
			return 9;
		case VAR_source:
			return 10;
			default:
				return BaseModel.htmRowBaseModel(var);
		}
	}

	public static Integer htmCellCrowdFlowObserved(String var) {
		switch(var) {
		case VAR_color:
			return 3;
		case VAR_entityId:
			return 1;
		case VAR_trafficSimulationId:
			return 2;
		case VAR_walkingAreaId:
			return 1;
		case VAR_alternateName:
			return 2;
		case VAR_areaServed:
			return 3;
		case VAR_averageCrowdSpeed:
			return 1;
		case VAR_averageHeadwayTime:
			return 2;
		case VAR_congested:
			return 3;
		case VAR_dataProvider:
			return 1;
		case VAR_dateCreated:
			return 2;
		case VAR_dateModified:
			return 3;
		case VAR_dateObserved:
			return 1;
		case VAR_dateObservedFrom:
			return 2;
		case VAR_dateObservedTo:
			return 3;
		case VAR_description:
			return 1;
		case VAR_direction:
			return 2;
		case VAR_location:
			return 3;
		case VAR_name:
			return 1;
		case VAR_occupancy:
			return 2;
		case VAR_owner:
			return 3;
		case VAR_peopleCount:
			return 1;
		case VAR_refRoadSegment:
			return 2;
		case VAR_seeAlso:
			return 3;
		case VAR_source:
			return 1;
			default:
				return BaseModel.htmCellBaseModel(var);
		}
	}

	public static Integer lengthMinCrowdFlowObserved(String var) {
		switch(var) {
			default:
				return BaseModel.lengthMinBaseModel(var);
		}
	}

	public static Integer lengthMaxCrowdFlowObserved(String var) {
		switch(var) {
			default:
				return BaseModel.lengthMaxBaseModel(var);
		}
	}

	public static Integer maxCrowdFlowObserved(String var) {
		switch(var) {
			default:
				return BaseModel.maxBaseModel(var);
		}
	}

	public static Integer minCrowdFlowObserved(String var) {
		switch(var) {
			default:
				return BaseModel.minBaseModel(var);
		}
	}
}
