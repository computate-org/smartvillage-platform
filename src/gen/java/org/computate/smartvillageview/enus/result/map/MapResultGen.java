package org.computate.smartvillageview.enus.result.map;

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
import org.computate.smartvillageview.enus.result.base.BaseResult;
import java.lang.String;
import java.lang.Long;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.Instant;
import java.util.Locale;
import java.time.OffsetDateTime;
import java.lang.Double;
import io.vertx.pgclient.data.Point;
import org.computate.vertx.serialize.pgclient.PgClientPointSerializer;
import org.computate.vertx.serialize.pgclient.PgClientPointDeserializer;
import java.lang.Boolean;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;
import io.vertx.core.json.JsonObject;

/**	
<ol>
0<h3>Suggestions that can generate more code for you: </h3></ol>
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class MapResultGen into the class MapResult. 
 * </li><li>You can add a class comment "Model: true" if you wish to persist these MapResult objects in a relational PostgreSQL database transactionally in the RESTful API. 
 * The code to persist and query the MapResultGen data in the database will then be automatically generated. 
 * </li>
 * <h3>About the MapResult class and it's generated class MapResultGen&lt;BaseResult&gt;: </h3>extends MapResultGen
 * <p>
 * This Java class extends a generated Java class MapResultGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.map.MapResult">Find the class MapResult in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends MapResultGen<BaseResult>
 * <p>This <code>class MapResult extends MapResultGen&lt;BaseResult&gt;</code>, which means it extends a newly generated MapResultGen. 
 * The generated <code>class MapResultGen extends BaseResult</code> which means that MapResult extends MapResultGen which extends BaseResult. 
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
 * ApiMethode: SearchPage
 * <p>This class contains a comment <b>"ApiMethod: SearchPage"</b>, which creates an API "SearchPage". 
 * </p>
 * ApiTag.enUS: true
 * <p>This class contains a comment <b>"ApiTag: Map Result"</b>, which groups all of the OpenAPIs for MapResult objects under the tag "Map Result". 
 * </p>
 * ApiUri.enUS: /api/map-result
 * <p>This class contains a comment <b>"ApiUri: /api/map-result"</b>, which defines the base API URI for MapResult objects as "/api/map-result" in the OpenAPI spec. 
 * </p>
 * Color: 2017-shaded-spruce
 * <p>This class contains a comment <b>"Color: 2017-shaded-spruce"</b>, which styles the MapResult page "2017-shaded-spruce". 
 * This will reference a CSS class defined by the stylesheets in the project that starts with "w3-". 
 * A css class of "w3-2017-shaded-spruce" is expected to exist in the project stylesheets, and is inspired by W3 CSS colors. 
 * See: <a href="https://www.w3schools.com/w3css/w3css_colors.asp">https://www.w3schools.com/w3css/w3css_colors.asp</a>. 
 * </p>
 * IconGroup: duotone
 * <p>This class contains a comment <b>"IconGroup: duotone"</b>, which adds icons on the MapResult page with a group of "duotone". 
 * This will reference a Font Awesome icon group that starts with "fa-" followed by the icon group "duotone", together is "fa-duotone". 
 * A Font Awesome icon group of "duotone" is expected to exist. 
 * The Font Awesome groups currently supported include: solid, regular, light, thin, duotone, sharp, and kit. 
 * See: <a href="https://fontawesome.com/docs/web/dig-deeper/styles">https://fontawesome.com/docs/web/dig-deeper/styles</a>. 
 * </p>
 * IconName: map-location-dot
 * <p>This class contains a comment <b>"IconName: map-location-dot"</b>, which adds icons on the MapResult page with a name of "map-location-dot". 
 * This will reference a Font Awesome icon that starts with the icon group "fa-duotone fa-" followed by the icon name, which is "fa-duotone fa-map-location-dot". 
 * A Font Awesome icon of "fa-duotone fa-map-location-dot" is expected to exist. 
 * See: <a href="https://fontawesome.com/icons">https://fontawesome.com/icons</a>. 
 * </p>
 * Indexed: true
 * <p>This class contains a comment <b>"Indexed: true"</b>, which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * {@inheritDoc}
 * <p>By adding a class comment "{@inheritDoc}", the MapResult class will inherit the helpful inherited class comments from the super class MapResultGen. 
 * </p>
 * Rows: 100
 * <p>This class contains a comment <b>"Rows: 100"</b>, which means the MapResult API will return a default of 100 records instead of 10 by default. 
 * Each API has built in pagination of the search records to ensure a user can query all the data a page at a time without running the application out of memory. 
 * </p>
 * Order: 4
 * <p>This class contains a comment <b>"Order: 4"</b>, which means this class will be sorted by the given number 4 ascending when code that relates to multiple classes at the same time is generated. 
 * </p>
 * Model: true
 * Page: true
 * <p>This class contains a comment <b>"Page: true"</b>, which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.smartvillageview.enus.result.map.MapResultPage. 
 * </p>
 * SuperPage.enUS: BaseResultPage
 * <p>This class contains a comment <b>"SuperPage.enUS: BaseResultPage"</b>, which identifies the Java super class of the page code by it's class simple name "BaseResultPage". 
 * This means that the newly created class org.computate.smartvillageview.enus.result.map.MapResultPage extends org.computate.smartvillageview.enus.result.base.BaseResultPage. 
 * </p>
 * Promise: true
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the MapResult Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * This class contains a comment <b>"Role.enUS: SiteAdmin"</b>, which identifies the default role name "SiteAdmin" of the OAuth2/OpenID Connect user role required to access this MapResult API. 
 * It's possible to reconfigure the roles required to access the MapResult API by configuring an environment variable like this: 
 * </p>
 * <pre>AUTH_ROLE_REQUIRED_MapResult: ["SiteAdmin"]</pre>
 * AName.enUS: a map result
 * <p>This class contains a comment <b>"AName.enUS: a map result"</b>, which identifies the language context to describe a MapResult as "a map result". 
 * </p>
 * <p>
 * Delete the class MapResult in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.map.MapResult&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.result.map in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.result.map&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class MapResultGen<DEV> extends BaseResult {
	protected static final Logger LOG = LoggerFactory.getLogger(MapResult.class);

	public static final String MapResult_Description_enUS = "A reusable map class for all non-model search classes on the map";
	public static final String MapResult_AName_enUS = "a map result";
	public static final String MapResult_This_enUS = "this ";
	public static final String MapResult_ThisName_enUS = "this map result";
	public static final String MapResult_A_enUS = "a ";
	public static final String MapResult_TheName_enUS = "the map result";
	public static final String MapResult_NameSingular_enUS = "map result";
	public static final String MapResult_NamePlural_enUS = "map results";
	public static final String MapResult_NameActual_enUS = "current map result";
	public static final String MapResult_AllName_enUS = "all the map results";
	public static final String MapResult_SearchAllNameBy_enUS = "search map results by ";
	public static final String MapResult_Title_enUS = "map results";
	public static final String MapResult_ThePluralName_enUS = "the map results";
	public static final String MapResult_NoNameFound_enUS = "no map result found";
	public static final String MapResult_ApiUri_enUS = "/api/map-result";
	public static final String MapResult_ApiUriSearchPage_enUS = "/map-result";
	public static final String MapResult_OfName_enUS = "of map result";
	public static final String MapResult_ANameAdjective_enUS = "a map result";
	public static final String MapResult_NameAdjectiveSingular_enUS = "map result";
	public static final String MapResult_NameAdjectivePlural_enUS = "map results";
	public static final String Search_enUS_Uri = "/api/map-result";
	public static final String Search_enUS_ImageUri = "/png/api/map-result-999.png";
	public static final String GET_enUS_Uri = "/api/map-result/{id}";
	public static final String GET_enUS_ImageUri = "/png/api/map-result/{id}-999.png";
	public static final String SearchPage_enUS_Uri = "/map-result";
	public static final String SearchPage_enUS_ImageUri = "/png/map-result-999.png";

	public static final String MapResult_Color = "2017-shaded-spruce";
	public static final String MapResult_IconGroup = "duotone";
	public static final String MapResult_IconName = "map-location-dot";
	public static final Integer MapResult_Rows = 100;

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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.map.MapResult&fq=entiteVar_enUS_indexed_string:simulationName">Find the entity simulationName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _simulationName(Wrap<String> w);

	public String getSimulationName() {
		return simulationName;
	}
	public void setSimulationName(String o) {
		this.simulationName = MapResult.staticSetSimulationName(siteRequest_, o);
	}
	public static String staticSetSimulationName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected MapResult simulationNameInit() {
		Wrap<String> simulationNameWrap = new Wrap<String>().var("simulationName");
		if(simulationName == null) {
			_simulationName(simulationNameWrap);
			setSimulationName(simulationNameWrap.o);
		}
		return (MapResult)this;
	}

	public static String staticSearchSimulationName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSimulationName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSimulationName(SiteRequestEnUS siteRequest_, String o) {
		return MapResult.staticSearchStrSimulationName(siteRequest_, MapResult.staticSearchSimulationName(siteRequest_, MapResult.staticSetSimulationName(siteRequest_, o)));
	}

	public String sqlSimulationName() {
		return simulationName;
	}

	/////////////////
	// sumocfgPath //
	/////////////////


	/**	 The entity sumocfgPath
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String sumocfgPath;

	/**	<br> The entity sumocfgPath
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.map.MapResult&fq=entiteVar_enUS_indexed_string:sumocfgPath">Find the entity sumocfgPath in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _sumocfgPath(Wrap<String> w);

	public String getSumocfgPath() {
		return sumocfgPath;
	}
	public void setSumocfgPath(String o) {
		this.sumocfgPath = MapResult.staticSetSumocfgPath(siteRequest_, o);
	}
	public static String staticSetSumocfgPath(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected MapResult sumocfgPathInit() {
		Wrap<String> sumocfgPathWrap = new Wrap<String>().var("sumocfgPath");
		if(sumocfgPath == null) {
			_sumocfgPath(sumocfgPathWrap);
			setSumocfgPath(sumocfgPathWrap.o);
		}
		return (MapResult)this;
	}

	public static String staticSearchSumocfgPath(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSumocfgPath(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSumocfgPath(SiteRequestEnUS siteRequest_, String o) {
		return MapResult.staticSearchStrSumocfgPath(siteRequest_, MapResult.staticSearchSumocfgPath(siteRequest_, MapResult.staticSetSumocfgPath(siteRequest_, o)));
	}

	public String sqlSumocfgPath() {
		return sumocfgPath;
	}

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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.map.MapResult&fq=entiteVar_enUS_indexed_string:simulationKey">Find the entity simulationKey in Solr</a>
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
		this.simulationKey = MapResult.staticSetSimulationKey(siteRequest_, o);
	}
	public static Long staticSetSimulationKey(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected MapResult simulationKeyInit() {
		Wrap<Long> simulationKeyWrap = new Wrap<Long>().var("simulationKey");
		if(simulationKey == null) {
			_simulationKey(simulationKeyWrap);
			setSimulationKey(simulationKeyWrap.o);
		}
		return (MapResult)this;
	}

	public static Long staticSearchSimulationKey(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrSimulationKey(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSimulationKey(SiteRequestEnUS siteRequest_, String o) {
		return MapResult.staticSearchStrSimulationKey(siteRequest_, MapResult.staticSearchSimulationKey(siteRequest_, MapResult.staticSetSimulationKey(siteRequest_, o)));
	}

	public Long sqlSimulationKey() {
		return simulationKey;
	}

	////////////////
	// timeStepId //
	////////////////


	/**	 The entity timeStepId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String timeStepId;

	/**	<br> The entity timeStepId
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.map.MapResult&fq=entiteVar_enUS_indexed_string:timeStepId">Find the entity timeStepId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _timeStepId(Wrap<String> w);

	public String getTimeStepId() {
		return timeStepId;
	}
	public void setTimeStepId(String o) {
		this.timeStepId = MapResult.staticSetTimeStepId(siteRequest_, o);
	}
	public static String staticSetTimeStepId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected MapResult timeStepIdInit() {
		Wrap<String> timeStepIdWrap = new Wrap<String>().var("timeStepId");
		if(timeStepId == null) {
			_timeStepId(timeStepIdWrap);
			setTimeStepId(timeStepIdWrap.o);
		}
		return (MapResult)this;
	}

	public static String staticSearchTimeStepId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrTimeStepId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqTimeStepId(SiteRequestEnUS siteRequest_, String o) {
		return MapResult.staticSearchStrTimeStepId(siteRequest_, MapResult.staticSearchTimeStepId(siteRequest_, MapResult.staticSetTimeStepId(siteRequest_, o)));
	}

	public String sqlTimeStepId() {
		return timeStepId;
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.map.MapResult&fq=entiteVar_enUS_indexed_string:time">Find the entity time in Solr</a>
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
		this.time = MapResult.staticSetTime(siteRequest_, o);
	}
	public static BigDecimal staticSetTime(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setTime(Double o) {
		setTime(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setTime(Integer o) {
		setTime(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setTime(Number o) {
		setTime(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected MapResult timeInit() {
		Wrap<BigDecimal> timeWrap = new Wrap<BigDecimal>().var("time");
		if(time == null) {
			_time(timeWrap);
			setTime(timeWrap.o);
		}
		return (MapResult)this;
	}

	public static Double staticSearchTime(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrTime(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqTime(SiteRequestEnUS siteRequest_, String o) {
		return MapResult.staticSearchStrTime(siteRequest_, MapResult.staticSearchTime(siteRequest_, MapResult.staticSetTime(siteRequest_, o)));
	}

	public BigDecimal sqlTime() {
		return time;
	}

	//////////////
	// dateTime //
	//////////////


	/**	 The entity dateTime
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonDeserialize(using = ComputateZonedDateTimeDeserializer.class)
	@JsonSerialize(using = ComputateZonedDateTimeSerializer.class)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSSV'['VV']'")
	@JsonInclude(Include.NON_NULL)
	protected ZonedDateTime dateTime;

	/**	<br> The entity dateTime
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.map.MapResult&fq=entiteVar_enUS_indexed_string:dateTime">Find the entity dateTime in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _dateTime(Wrap<ZonedDateTime> w);

	public ZonedDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(ZonedDateTime dateTime) {
		this.dateTime = dateTime;
	}
	@JsonIgnore
	public void setDateTime(Instant o) {
		this.dateTime = o == null ? null : ZonedDateTime.from(o).truncatedTo(ChronoUnit.MILLIS);
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	@JsonIgnore
	public void setDateTime(String o) {
		this.dateTime = MapResult.staticSetDateTime(siteRequest_, o);
	}
	public static ZonedDateTime staticSetDateTime(SiteRequestEnUS siteRequest_, String o) {
		if(StringUtils.endsWith(o, "]"))
			return o == null ? null : ZonedDateTime.parse(o, ComputateZonedDateTimeSerializer.ZONED_DATE_TIME_FORMATTER);
		else if(StringUtils.endsWith(o, "Z"))
			return o == null ? null : Instant.parse(o).atZone(Optional.ofNullable(siteRequest_).map(r -> r.getConfig()).map(config -> config.getString(ConfigKeys.SITE_ZONE)).map(z -> ZoneId.of(z)).orElse(ZoneId.of("UTC"))).truncatedTo(ChronoUnit.MILLIS);
		else if(StringUtils.contains(o, "T"))
			return o == null ? null : ZonedDateTime.parse(o, DateTimeFormatter.ISO_DATE_TIME).truncatedTo(ChronoUnit.MILLIS);
		else
			return o == null ? null : LocalDate.parse(o, DateTimeFormatter.ISO_DATE).atStartOfDay(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	@JsonIgnore
	public void setDateTime(Date o) {
		this.dateTime = o == null ? null : ZonedDateTime.ofInstant(o.toInstant(), ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	protected MapResult dateTimeInit() {
		Wrap<ZonedDateTime> dateTimeWrap = new Wrap<ZonedDateTime>().var("dateTime");
		if(dateTime == null) {
			_dateTime(dateTimeWrap);
			setDateTime(dateTimeWrap.o);
		}
		return (MapResult)this;
	}

	public static Date staticSearchDateTime(SiteRequestEnUS siteRequest_, ZonedDateTime o) {
		return o == null ? null : Date.from(o.toInstant());
	}

	public static String staticSearchStrDateTime(SiteRequestEnUS siteRequest_, Date o) {
		return "\"" + DateTimeFormatter.ISO_DATE_TIME.format(o.toInstant().atOffset(ZoneOffset.UTC)) + "\"";
	}

	public static String staticSearchFqDateTime(SiteRequestEnUS siteRequest_, String o) {
		return MapResult.staticSearchStrDateTime(siteRequest_, MapResult.staticSearchDateTime(siteRequest_, MapResult.staticSetDateTime(siteRequest_, o)));
	}

	public OffsetDateTime sqlDateTime() {
		return dateTime == null ? null : dateTime.toOffsetDateTime();
	}

	///////
	// x //
	///////


	/**	 The entity x
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Double x;

	/**	<br> The entity x
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.map.MapResult&fq=entiteVar_enUS_indexed_string:x">Find the entity x in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _x(Wrap<Double> w);

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}
	@JsonIgnore
	public void setX(String o) {
		this.x = MapResult.staticSetX(siteRequest_, o);
	}
	public static Double staticSetX(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Double.parseDouble(o);
		return null;
	}
	protected MapResult xInit() {
		Wrap<Double> xWrap = new Wrap<Double>().var("x");
		if(x == null) {
			_x(xWrap);
			setX(xWrap.o);
		}
		return (MapResult)this;
	}

	public static Double staticSearchX(SiteRequestEnUS siteRequest_, Double o) {
		return o;
	}

	public static String staticSearchStrX(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqX(SiteRequestEnUS siteRequest_, String o) {
		return MapResult.staticSearchStrX(siteRequest_, MapResult.staticSearchX(siteRequest_, MapResult.staticSetX(siteRequest_, o)));
	}

	public Double sqlX() {
		return x;
	}

	///////
	// y //
	///////


	/**	 The entity y
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Double y;

	/**	<br> The entity y
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.map.MapResult&fq=entiteVar_enUS_indexed_string:y">Find the entity y in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _y(Wrap<Double> w);

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
	}
	@JsonIgnore
	public void setY(String o) {
		this.y = MapResult.staticSetY(siteRequest_, o);
	}
	public static Double staticSetY(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Double.parseDouble(o);
		return null;
	}
	protected MapResult yInit() {
		Wrap<Double> yWrap = new Wrap<Double>().var("y");
		if(y == null) {
			_y(yWrap);
			setY(yWrap.o);
		}
		return (MapResult)this;
	}

	public static Double staticSearchY(SiteRequestEnUS siteRequest_, Double o) {
		return o;
	}

	public static String staticSearchStrY(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqY(SiteRequestEnUS siteRequest_, String o) {
		return MapResult.staticSearchStrY(siteRequest_, MapResult.staticSearchY(siteRequest_, MapResult.staticSetY(siteRequest_, o)));
	}

	public Double sqlY() {
		return y;
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.map.MapResult&fq=entiteVar_enUS_indexed_string:location">Find the entity location in Solr</a>
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
		this.location = MapResult.staticSetLocation(siteRequest_, o);
	}
	public static Point staticSetLocation(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
			String[] vals = o.split(",");
			if(vals.length == 2 && NumberUtils.isParsable(vals[0]) && NumberUtils.isParsable(vals[1]))
				return new Point(Double.parseDouble(vals[0]), Double.parseDouble(vals[1]));
		}
		return null;
	}
	protected MapResult locationInit() {
		Wrap<Point> locationWrap = new Wrap<Point>().var("location");
		if(location == null) {
			_location(locationWrap);
			setLocation(locationWrap.o);
		}
		return (MapResult)this;
	}

	public static Point staticSearchLocation(SiteRequestEnUS siteRequest_, Point o) {
		return o;
	}

	public static String staticSearchStrLocation(SiteRequestEnUS siteRequest_, Point o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqLocation(SiteRequestEnUS siteRequest_, String o) {
		return MapResult.staticSearchStrLocation(siteRequest_, MapResult.staticSearchLocation(siteRequest_, MapResult.staticSetLocation(siteRequest_, o)));
	}

	public Point sqlLocation() {
		return location;
	}

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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.map.MapResult&fq=entiteVar_enUS_indexed_string:color">Find the entity color in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _color(Wrap<String> w);

	public String getColor() {
		return color;
	}
	public void setColor(String o) {
		this.color = MapResult.staticSetColor(siteRequest_, o);
	}
	public static String staticSetColor(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected MapResult colorInit() {
		Wrap<String> colorWrap = new Wrap<String>().var("color");
		if(color == null) {
			_color(colorWrap);
			setColor(colorWrap.o);
		}
		return (MapResult)this;
	}

	public static String staticSearchColor(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrColor(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqColor(SiteRequestEnUS siteRequest_, String o) {
		return MapResult.staticSearchStrColor(siteRequest_, MapResult.staticSearchColor(siteRequest_, MapResult.staticSetColor(siteRequest_, o)));
	}

	public String sqlColor() {
		return color;
	}

	//////////
	// step //
	//////////


	/**	 The entity step
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Boolean step;

	/**	<br> The entity step
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.map.MapResult&fq=entiteVar_enUS_indexed_string:step">Find the entity step in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _step(Wrap<Boolean> w);

	public Boolean getStep() {
		return step;
	}

	public void setStep(Boolean step) {
		this.step = step;
	}
	@JsonIgnore
	public void setStep(String o) {
		this.step = MapResult.staticSetStep(siteRequest_, o);
	}
	public static Boolean staticSetStep(SiteRequestEnUS siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected MapResult stepInit() {
		Wrap<Boolean> stepWrap = new Wrap<Boolean>().var("step");
		if(step == null) {
			_step(stepWrap);
			setStep(stepWrap.o);
		}
		return (MapResult)this;
	}

	public static Boolean staticSearchStep(SiteRequestEnUS siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrStep(SiteRequestEnUS siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqStep(SiteRequestEnUS siteRequest_, String o) {
		return MapResult.staticSearchStrStep(siteRequest_, MapResult.staticSearchStep(siteRequest_, MapResult.staticSetStep(siteRequest_, o)));
	}

	public Boolean sqlStep() {
		return step;
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepMapResult(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepMapResult();
	}

	public Future<Void> promiseDeepMapResult() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseMapResult(promise2);
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

	public Future<Void> promiseMapResult(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				simulationNameInit();
				sumocfgPathInit();
				simulationKeyInit();
				timeStepIdInit();
				timeInit();
				dateTimeInit();
				xInit();
				yInit();
				locationInit();
				colorInit();
				stepInit();
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
		return promiseDeepMapResult(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestMapResult(SiteRequestEnUS siteRequest_) {
			super.siteRequestBaseResult(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestMapResult(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainMapResult(v);
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
	public Object obtainMapResult(String var) {
		MapResult oMapResult = (MapResult)this;
		switch(var) {
			case "simulationName":
				return oMapResult.simulationName;
			case "sumocfgPath":
				return oMapResult.sumocfgPath;
			case "simulationKey":
				return oMapResult.simulationKey;
			case "timeStepId":
				return oMapResult.timeStepId;
			case "time":
				return oMapResult.time;
			case "dateTime":
				return oMapResult.dateTime;
			case "x":
				return oMapResult.x;
			case "y":
				return oMapResult.y;
			case "location":
				return oMapResult.location;
			case "color":
				return oMapResult.color;
			case "step":
				return oMapResult.step;
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
				o = relateMapResult(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateMapResult(String var, Object val) {
		MapResult oMapResult = (MapResult)this;
		switch(var) {
			default:
				return super.relateBaseResult(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetMapResult(entityVar,  siteRequest_, o);
	}
	public static Object staticSetMapResult(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "simulationName":
			return MapResult.staticSetSimulationName(siteRequest_, o);
		case "sumocfgPath":
			return MapResult.staticSetSumocfgPath(siteRequest_, o);
		case "simulationKey":
			return MapResult.staticSetSimulationKey(siteRequest_, o);
		case "timeStepId":
			return MapResult.staticSetTimeStepId(siteRequest_, o);
		case "time":
			return MapResult.staticSetTime(siteRequest_, o);
		case "dateTime":
			return MapResult.staticSetDateTime(siteRequest_, o);
		case "x":
			return MapResult.staticSetX(siteRequest_, o);
		case "y":
			return MapResult.staticSetY(siteRequest_, o);
		case "location":
			return MapResult.staticSetLocation(siteRequest_, o);
		case "color":
			return MapResult.staticSetColor(siteRequest_, o);
		case "step":
			return MapResult.staticSetStep(siteRequest_, o);
			default:
				return BaseResult.staticSetBaseResult(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchMapResult(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchMapResult(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "simulationName":
			return MapResult.staticSearchSimulationName(siteRequest_, (String)o);
		case "sumocfgPath":
			return MapResult.staticSearchSumocfgPath(siteRequest_, (String)o);
		case "simulationKey":
			return MapResult.staticSearchSimulationKey(siteRequest_, (Long)o);
		case "timeStepId":
			return MapResult.staticSearchTimeStepId(siteRequest_, (String)o);
		case "time":
			return MapResult.staticSearchTime(siteRequest_, (BigDecimal)o);
		case "dateTime":
			return MapResult.staticSearchDateTime(siteRequest_, (ZonedDateTime)o);
		case "x":
			return MapResult.staticSearchX(siteRequest_, (Double)o);
		case "y":
			return MapResult.staticSearchY(siteRequest_, (Double)o);
		case "location":
			return MapResult.staticSearchLocation(siteRequest_, (Point)o);
		case "color":
			return MapResult.staticSearchColor(siteRequest_, (String)o);
		case "step":
			return MapResult.staticSearchStep(siteRequest_, (Boolean)o);
			default:
				return BaseResult.staticSearchBaseResult(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrMapResult(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrMapResult(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "simulationName":
			return MapResult.staticSearchStrSimulationName(siteRequest_, (String)o);
		case "sumocfgPath":
			return MapResult.staticSearchStrSumocfgPath(siteRequest_, (String)o);
		case "simulationKey":
			return MapResult.staticSearchStrSimulationKey(siteRequest_, (Long)o);
		case "timeStepId":
			return MapResult.staticSearchStrTimeStepId(siteRequest_, (String)o);
		case "time":
			return MapResult.staticSearchStrTime(siteRequest_, (Double)o);
		case "dateTime":
			return MapResult.staticSearchStrDateTime(siteRequest_, (Date)o);
		case "x":
			return MapResult.staticSearchStrX(siteRequest_, (Double)o);
		case "y":
			return MapResult.staticSearchStrY(siteRequest_, (Double)o);
		case "location":
			return MapResult.staticSearchStrLocation(siteRequest_, (Point)o);
		case "color":
			return MapResult.staticSearchStrColor(siteRequest_, (String)o);
		case "step":
			return MapResult.staticSearchStrStep(siteRequest_, (Boolean)o);
			default:
				return BaseResult.staticSearchStrBaseResult(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqMapResult(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqMapResult(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "simulationName":
			return MapResult.staticSearchFqSimulationName(siteRequest_, o);
		case "sumocfgPath":
			return MapResult.staticSearchFqSumocfgPath(siteRequest_, o);
		case "simulationKey":
			return MapResult.staticSearchFqSimulationKey(siteRequest_, o);
		case "timeStepId":
			return MapResult.staticSearchFqTimeStepId(siteRequest_, o);
		case "time":
			return MapResult.staticSearchFqTime(siteRequest_, o);
		case "dateTime":
			return MapResult.staticSearchFqDateTime(siteRequest_, o);
		case "x":
			return MapResult.staticSearchFqX(siteRequest_, o);
		case "y":
			return MapResult.staticSearchFqY(siteRequest_, o);
		case "location":
			return MapResult.staticSearchFqLocation(siteRequest_, o);
		case "color":
			return MapResult.staticSearchFqColor(siteRequest_, o);
		case "step":
			return MapResult.staticSearchFqStep(siteRequest_, o);
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
					o = persistMapResult(v, val);
				else if(o instanceof BaseModel) {
					BaseModel oBaseModel = (BaseModel)o;
					o = oBaseModel.persistForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object persistMapResult(String var, Object val) {
		String varLower = var.toLowerCase();
			if("simulationname".equals(varLower)) {
				if(val instanceof String) {
					setSimulationName((String)val);
				}
				saves.add("simulationName");
				return val;
			} else if("sumocfgpath".equals(varLower)) {
				if(val instanceof String) {
					setSumocfgPath((String)val);
				}
				saves.add("sumocfgPath");
				return val;
			} else if("simulationkey".equals(varLower)) {
				if(val instanceof Long) {
					setSimulationKey((Long)val);
				} else {
					setSimulationKey(val == null ? null : val.toString());
				}
				saves.add("simulationKey");
				return val;
			} else if("timestepid".equals(varLower)) {
				if(val instanceof String) {
					setTimeStepId((String)val);
				}
				saves.add("timeStepId");
				return val;
			} else if("time".equals(varLower)) {
				if(val instanceof String) {
					setTime((String)val);
				} else if(val instanceof Number) {
					setTime(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("time");
				return val;
			} else if("datetime".equals(varLower)) {
				if(val instanceof String) {
					setDateTime((String)val);
				} else if(val instanceof OffsetDateTime) {
					setDateTime(((OffsetDateTime)val).atZoneSameInstant(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))));
				}
				saves.add("dateTime");
				return val;
			} else if("x".equals(varLower)) {
				if(val instanceof Double) {
					setX((Double)val);
				} else {
					setX(val == null ? null : val.toString());
				}
				saves.add("x");
				return val;
			} else if("y".equals(varLower)) {
				if(val instanceof Double) {
					setY((Double)val);
				} else {
					setY(val == null ? null : val.toString());
				}
				saves.add("y");
				return val;
			} else if("location".equals(varLower)) {
				if(val instanceof String) {
					setLocation((String)val);
				} else if(val instanceof Point) {
					setLocation((Point)val);
				}
				saves.add("location");
				return val;
			} else if("color".equals(varLower)) {
				if(val instanceof String) {
					setColor((String)val);
				}
				saves.add("color");
				return val;
			} else if("step".equals(varLower)) {
				if(val instanceof Boolean) {
					setStep((Boolean)val);
				} else {
					setStep(val == null ? null : val.toString());
				}
				saves.add("step");
				return val;
		} else {
			return super.persistBaseResult(var, val);
		}
	}

	/////////////
	// populate //
	/////////////

	@Override public void populateForClass(SolrResponse.Doc doc) {
		populateMapResult(doc);
	}
	public void populateMapResult(SolrResponse.Doc doc) {
		MapResult oMapResult = (MapResult)this;
		saves = doc.get("saves_docvalues_strings");
		if(saves != null) {
		}

		super.populateBaseResult(doc);
	}

	public void indexMapResult(JsonObject doc) {
		if(simulationName != null) {
			doc.put("simulationName_docvalues_string", simulationName);
		}
		if(sumocfgPath != null) {
			doc.put("sumocfgPath_docvalues_string", sumocfgPath);
		}
		if(simulationKey != null) {
			doc.put("simulationKey_docvalues_long", simulationKey);
		}
		if(timeStepId != null) {
			doc.put("timeStepId_docvalues_string", timeStepId);
		}
		if(time != null) {
			doc.put("time_docvalues_double", time.doubleValue());
		}
		if(dateTime != null) {
			doc.put("dateTime_docvalues_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(ZonedDateTime.ofInstant(dateTime.toInstant(), ZoneId.of("UTC"))));
		}
		if(location != null) {
			doc.put("location_docvalues_location", String.format("%s,%s", location.getX(), location.getY()));
		}
		if(color != null) {
			doc.put("color_docvalues_string", color);
		}
		if(step != null) {
			doc.put("step_docvalues_boolean", step);
		}
		super.indexBaseResult(doc);

	}

	public static String varStoredMapResult(String entityVar) {
		switch(entityVar) {
			case "simulationName":
				return "simulationName_docvalues_string";
			case "sumocfgPath":
				return "sumocfgPath_docvalues_string";
			case "simulationKey":
				return "simulationKey_docvalues_long";
			case "timeStepId":
				return "timeStepId_docvalues_string";
			case "time":
				return "time_docvalues_double";
			case "dateTime":
				return "dateTime_docvalues_date";
			case "location":
				return "location_docvalues_location";
			case "color":
				return "color_docvalues_string";
			case "step":
				return "step_docvalues_boolean";
			default:
				return BaseResult.varStoredBaseResult(entityVar);
		}
	}

	public static String varIndexedMapResult(String entityVar) {
		switch(entityVar) {
			case "simulationName":
				return "simulationName_docvalues_string";
			case "sumocfgPath":
				return "sumocfgPath_docvalues_string";
			case "simulationKey":
				return "simulationKey_docvalues_long";
			case "timeStepId":
				return "timeStepId_docvalues_string";
			case "time":
				return "time_docvalues_double";
			case "dateTime":
				return "dateTime_docvalues_date";
			case "location":
				return "location_docvalues_location";
			case "color":
				return "color_docvalues_string";
			case "step":
				return "step_docvalues_boolean";
			default:
				return BaseResult.varIndexedBaseResult(entityVar);
		}
	}

	public static String searchVarMapResult(String searchVar) {
		switch(searchVar) {
			case "simulationName_docvalues_string":
				return "simulationName";
			case "sumocfgPath_docvalues_string":
				return "sumocfgPath";
			case "simulationKey_docvalues_long":
				return "simulationKey";
			case "timeStepId_docvalues_string":
				return "timeStepId";
			case "time_docvalues_double":
				return "time";
			case "dateTime_docvalues_date":
				return "dateTime";
			case "location_docvalues_location":
				return "location";
			case "color_docvalues_string":
				return "color";
			case "step_docvalues_boolean":
				return "step";
			default:
				return BaseResult.searchVarBaseResult(searchVar);
		}
	}

	public static String varSearchMapResult(String entityVar) {
		switch(entityVar) {
			default:
				return BaseResult.varSearchBaseResult(entityVar);
		}
	}

	public static String varSuggestedMapResult(String entityVar) {
		switch(entityVar) {
			default:
				return BaseResult.varSuggestedBaseResult(entityVar);
		}
	}

	/////////////
	// store //
	/////////////

	@Override public void storeForClass(SolrResponse.Doc doc) {
		storeMapResult(doc);
	}
	public void storeMapResult(SolrResponse.Doc doc) {
		MapResult oMapResult = (MapResult)this;

		oMapResult.setSimulationName(Optional.ofNullable(doc.get("simulationName_docvalues_string")).map(v -> v.toString()).orElse(null));
		oMapResult.setSumocfgPath(Optional.ofNullable(doc.get("sumocfgPath_docvalues_string")).map(v -> v.toString()).orElse(null));
		oMapResult.setSimulationKey(Optional.ofNullable(doc.get("simulationKey_docvalues_long")).map(v -> v.toString()).orElse(null));
		oMapResult.setTimeStepId(Optional.ofNullable(doc.get("timeStepId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oMapResult.setTime(Optional.ofNullable(doc.get("time_docvalues_double")).map(v -> v.toString()).orElse(null));
		oMapResult.setDateTime(Optional.ofNullable(doc.get("dateTime_docvalues_date")).map(v -> v.toString()).orElse(null));
		oMapResult.setLocation(Optional.ofNullable(doc.get("location_docvalues_location")).map(v -> v.toString()).orElse(null));
		oMapResult.setColor(Optional.ofNullable(doc.get("color_docvalues_string")).map(v -> v.toString()).orElse(null));
		oMapResult.setStep(Optional.ofNullable(doc.get("step_docvalues_boolean")).map(v -> v.toString()).orElse(null));

		super.storeBaseResult(doc);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestMapResult() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof MapResult) {
			MapResult original = (MapResult)o;
			if(!Objects.equals(simulationName, original.getSimulationName()))
				apiRequest.addVars("simulationName");
			if(!Objects.equals(sumocfgPath, original.getSumocfgPath()))
				apiRequest.addVars("sumocfgPath");
			if(!Objects.equals(simulationKey, original.getSimulationKey()))
				apiRequest.addVars("simulationKey");
			if(!Objects.equals(timeStepId, original.getTimeStepId()))
				apiRequest.addVars("timeStepId");
			if(!Objects.equals(time, original.getTime()))
				apiRequest.addVars("time");
			if(!Objects.equals(dateTime, original.getDateTime()))
				apiRequest.addVars("dateTime");
			if(!Objects.equals(x, original.getX()))
				apiRequest.addVars("x");
			if(!Objects.equals(y, original.getY()))
				apiRequest.addVars("y");
			if(!Objects.equals(location, original.getLocation()))
				apiRequest.addVars("location");
			if(!Objects.equals(color, original.getColor()))
				apiRequest.addVars("color");
			if(!Objects.equals(step, original.getStep()))
				apiRequest.addVars("step");
			super.apiRequestBaseResult();
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(Optional.ofNullable(simulationName).map(v -> "simulationName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(sumocfgPath).map(v -> "sumocfgPath: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(simulationKey).map(v -> "simulationKey: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(timeStepId).map(v -> "timeStepId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(time).map(v -> "time: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(dateTime).map(v -> "dateTime: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(x).map(v -> "x: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(y).map(v -> "y: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(location).map(v -> "location: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(color).map(v -> "color: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(step).map(v -> "step: " + v + "\n").orElse(""));
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "MapResult";
	public static final String VAR_simulationName = "simulationName";
	public static final String VAR_sumocfgPath = "sumocfgPath";
	public static final String VAR_simulationKey = "simulationKey";
	public static final String VAR_timeStepId = "timeStepId";
	public static final String VAR_time = "time";
	public static final String VAR_dateTime = "dateTime";
	public static final String VAR_x = "x";
	public static final String VAR_y = "y";
	public static final String VAR_location = "location";
	public static final String VAR_color = "color";
	public static final String VAR_step = "step";

	public static List<String> varsQForClass() {
		return MapResult.varsQMapResult(new ArrayList<String>());
	}
	public static List<String> varsQMapResult(List<String> vars) {
		BaseResult.varsQBaseResult(vars);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return MapResult.varsFqMapResult(new ArrayList<String>());
	}
	public static List<String> varsFqMapResult(List<String> vars) {
		vars.add(VAR_simulationName);
		vars.add(VAR_sumocfgPath);
		vars.add(VAR_simulationKey);
		vars.add(VAR_time);
		vars.add(VAR_dateTime);
		vars.add(VAR_location);
		vars.add(VAR_color);
		vars.add(VAR_step);
		BaseResult.varsFqBaseResult(vars);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return MapResult.varsRangeMapResult(new ArrayList<String>());
	}
	public static List<String> varsRangeMapResult(List<String> vars) {
		vars.add(VAR_simulationKey);
		vars.add(VAR_time);
		vars.add(VAR_dateTime);
		vars.add(VAR_location);
		BaseResult.varsRangeBaseResult(vars);
		return vars;
	}

	public static final String DISPLAY_NAME_simulationName = "simulation name";
	public static final String DISPLAY_NAME_sumocfgPath = "sumocfg path";
	public static final String DISPLAY_NAME_simulationKey = "Simulation";
	public static final String DISPLAY_NAME_timeStepId = "Time Step";
	public static final String DISPLAY_NAME_time = "Time in seconds";
	public static final String DISPLAY_NAME_dateTime = "Date and Time";
	public static final String DISPLAY_NAME_x = "";
	public static final String DISPLAY_NAME_y = "";
	public static final String DISPLAY_NAME_location = "location";
	public static final String DISPLAY_NAME_color = "color";
	public static final String DISPLAY_NAME_step = "step";

	public static String displayNameForClass(String var) {
		return MapResult.displayNameMapResult(var);
	}
	public static String displayNameMapResult(String var) {
		switch(var) {
		case VAR_simulationName:
			return DISPLAY_NAME_simulationName;
		case VAR_sumocfgPath:
			return DISPLAY_NAME_sumocfgPath;
		case VAR_simulationKey:
			return DISPLAY_NAME_simulationKey;
		case VAR_timeStepId:
			return DISPLAY_NAME_timeStepId;
		case VAR_time:
			return DISPLAY_NAME_time;
		case VAR_dateTime:
			return DISPLAY_NAME_dateTime;
		case VAR_x:
			return DISPLAY_NAME_x;
		case VAR_y:
			return DISPLAY_NAME_y;
		case VAR_location:
			return DISPLAY_NAME_location;
		case VAR_color:
			return DISPLAY_NAME_color;
		case VAR_step:
			return DISPLAY_NAME_step;
		default:
			return BaseResult.displayNameBaseResult(var);
		}
	}

	public static String descriptionMapResult(String var) {
		switch(var) {
		case VAR_simulationKey:
			return "The simulation key. ";
		case VAR_timeStepId:
			return "The time step ID. ";
		case VAR_time:
			return "The time in seconds. ";
		case VAR_dateTime:
			return "The date and time. ";
			default:
				return BaseResult.descriptionBaseResult(var);
		}
	}

	public static String classSimpleNameMapResult(String var) {
		switch(var) {
		case VAR_simulationName:
			return "String";
		case VAR_sumocfgPath:
			return "String";
		case VAR_simulationKey:
			return "Long";
		case VAR_timeStepId:
			return "String";
		case VAR_time:
			return "BigDecimal";
		case VAR_dateTime:
			return "ZonedDateTime";
		case VAR_x:
			return "Double";
		case VAR_y:
			return "Double";
		case VAR_location:
			return "Point";
		case VAR_color:
			return "String";
		case VAR_step:
			return "Boolean";
			default:
				return BaseResult.classSimpleNameBaseResult(var);
		}
	}

	public static Integer htmColumnMapResult(String var) {
		switch(var) {
			default:
				return BaseResult.htmColumnBaseResult(var);
		}
	}

	public static Integer htmRowMapResult(String var) {
		switch(var) {
			default:
				return BaseResult.htmRowBaseResult(var);
		}
	}

	public static Integer htmCellMapResult(String var) {
		switch(var) {
			default:
				return BaseResult.htmCellBaseResult(var);
		}
	}

	public static Integer lengthMinMapResult(String var) {
		switch(var) {
			default:
				return BaseResult.lengthMinBaseResult(var);
		}
	}

	public static Integer lengthMaxMapResult(String var) {
		switch(var) {
			default:
				return BaseResult.lengthMaxBaseResult(var);
		}
	}

	public static Integer maxMapResult(String var) {
		switch(var) {
			default:
				return BaseResult.maxBaseResult(var);
		}
	}

	public static Integer minMapResult(String var) {
		switch(var) {
			default:
				return BaseResult.minBaseResult(var);
		}
	}
}
