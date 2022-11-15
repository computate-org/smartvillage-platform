package org.computate.smartvillageview.enus.model.traffic.simulation;

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
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.time.Instant;
import java.util.Locale;
import java.time.OffsetDateTime;
import java.math.BigDecimal;
import io.vertx.core.json.JsonArray;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;

/**	
 * <h3>About the TrafficSimulation class and it's generated class TrafficSimulationGen&lt;BaseModel&gt;: </h3>extends TrafficSimulationGen
 * <p>
 * This Java class extends a generated Java class TrafficSimulationGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation">Find the class TrafficSimulation in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends TrafficSimulationGen<BaseModel>
 * <p>This <code>class TrafficSimulation extends TrafficSimulationGen&lt;BaseModel&gt;</code>, which means it extends a newly generated TrafficSimulationGen. 
 * The generated <code>class TrafficSimulationGen extends BaseModel</code> which means that TrafficSimulation extends TrafficSimulationGen which extends BaseModel. 
 * This generated inheritance is a powerful feature that allows a lot of boiler plate code to be created for you automatically while still preserving inheritance through the power of Java Generic classes. 
 * </p>
 * Api: true
 * <p>This class contains a comment <b>"Api: true"</b>, which means this class will have Java Vert.x API backend code generated for these objects. 
 * </p>
 * ApiTag.enUS: Traffic Simulation
 * <p>This class contains a comment <b>"ApiTag: Traffic Simulation"</b>, which groups all of the OpenAPIs for TrafficSimulation objects under the tag "Traffic Simulation". 
 * </p>
 * ApiUri.enUS: /api/traffic-simulation
 * <p>This class contains a comment <b>"ApiUri: /api/traffic-simulation"</b>, which defines the base API URI for TrafficSimulation objects as "/api/traffic-simulation" in the OpenAPI spec. 
 * </p>
 * Color: 2017-shaded-spruce
 * <p>This class contains a comment <b>"Color: 2017-shaded-spruce"</b>, which styles the TrafficSimulation page "2017-shaded-spruce". 
 * This will reference a CSS class defined by the stylesheets in the project that starts with "w3-". 
 * A css class of "w3-2017-shaded-spruce" is expected to exist in the project stylesheets, and is inspired by W3 CSS colors. 
 * See: <a href="https://www.w3schools.com/w3css/w3css_colors.asp">https://www.w3schools.com/w3css/w3css_colors.asp</a>. 
 * </p>
 * IconGroup: duotone
 * <p>This class contains a comment <b>"IconGroup: duotone"</b>, which adds icons on the TrafficSimulation page with a group of "duotone". 
 * This will reference a Font Awesome icon group that starts with "fa-" followed by the icon group "duotone", together is "fa-duotone". 
 * A Font Awesome icon group of "duotone" is expected to exist. 
 * The Font Awesome groups currently supported include: solid, regular, light, thin, duotone, and sharp. 
 * See: <a href="https://fontawesome.com/docs/web/dig-deeper/styles">https://fontawesome.com/docs/web/dig-deeper/styles</a>. 
 * </p>
 * IconName: traffic-light-stop
 * <p>This class contains a comment <b>"IconName: traffic-light-stop"</b>, which adds icons on the TrafficSimulation page with a name of "traffic-light-stop". 
 * This will reference a Font Awesome icon that starts with the icon group "fa-duotone fa-" followed by the icon name, which is "fa-duotone fa-traffic-light-stop". 
 * A Font Awesome icon of "fa-duotone fa-traffic-light-stop" is expected to exist. 
 * See: <a href="https://fontawesome.com/icons">https://fontawesome.com/icons</a>. 
 * </p>
 * Indexed: true
 * <p>This class contains a comment <b>"Indexed: true"</b>, which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * {@inheritDoc}
 * <p>By adding a class comment "{@inheritDoc}", the TrafficSimulation class will inherit the helpful inherited class comments from the super class TrafficSimulationGen. 
 * </p>
 * Rows: 100
 * <p>This class contains a comment <b>"Rows: 100"</b>, which means the TrafficSimulation API will return a default of 100 records instead of 10 by default. 
 * Each API has built in pagination of the search records to ensure a user can query all the data a page at a time without running the application out of memory. 
 * </p>
 * Order: 5
 * <p>This class contains a comment <b>"Order: 5"</b>, which means this class will be sorted by the given number 5 ascending when code that relates to multiple classes at the same time is generated. 
 * </p>
 * SqlOrder: 2
 * <p>This class contains a comment <b>"SqlOrder: 2"</b>, which means this class will be sorted by the given number 2 ascending when SQL code to create and drop the tables is generated. 
 * </p>
 * Model: true
 * <p>This class contains a comment <b>"Model: true"</b>, which means this class will be stored in the database. 
 * Every protected void method that begins with "_" that contains a "Persist: true" comment will be a persisted field in the database table. 
 * </p>
 * Page: true
 * <p>This class contains a comment <b>"Page: true"</b>, which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulationPage. 
 * </p>
 * SuperPage.enUS: BaseModelPage
 * <p>This class contains a comment <b>"SuperPage.enUS: BaseModelPage"</b>, which identifies the Java super class of the page code by it's class simple name "BaseModelPage". 
 * This means that the newly created class org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulationPage extends org.computate.smartvillageview.enus.model.base.BaseModelPage. 
 * </p>
 * Promise: true
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the TrafficSimulation Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * This class contains a comment <b>"Role.enUS: SiteAdmin"</b>, which identifies the default role name "SiteAdmin" of the OAuth2/OpenID Connect user role required to access this TrafficSimulation API. 
 * It's possible to reconfigure the roles required to access the TrafficSimulation API by configuring an environment variable like this: 
 * </p>
 * <pre>AUTH_ROLES_REQUIRED_TrafficSimulation: ["SiteAdmin"]</pre>
 * AName.enUS: a traffic simulation
 * <p>This class contains a comment <b>"AName.enUS: a traffic simulation"</b>, which identifies the language context to describe a TrafficSimulation as "a traffic simulation". 
 * </p>
 * <p>
 * Delete the class TrafficSimulation in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.traffic.simulation in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class TrafficSimulationGen<DEV> extends BaseModel {
	protected static final Logger LOG = LoggerFactory.getLogger(TrafficSimulation.class);

	public static final String TrafficSimulation_AName_enUS = "a traffic simulation";
	public static final String TrafficSimulation_This_enUS = "this ";
	public static final String TrafficSimulation_ThisName_enUS = "this traffic simulation";
	public static final String TrafficSimulation_A_enUS = "a ";
	public static final String TrafficSimulation_TheName_enUS = "the traffic simulation";
	public static final String TrafficSimulation_NameSingular_enUS = "traffic simulation";
	public static final String TrafficSimulation_NamePlural_enUS = "traffic simulations";
	public static final String TrafficSimulation_NameActual_enUS = "current traffic simulation";
	public static final String TrafficSimulation_AllName_enUS = "all the traffic simulations";
	public static final String TrafficSimulation_SearchAllNameBy_enUS = "search traffic simulations by ";
	public static final String TrafficSimulation_Title_enUS = "traffic simulations";
	public static final String TrafficSimulation_ThePluralName_enUS = "the traffic simulations";
	public static final String TrafficSimulation_NoNameFound_enUS = "no traffic simulation found";
	public static final String TrafficSimulation_ApiUri_enUS = "/api/traffic-simulation";
	public static final String TrafficSimulation_ApiUriSearchPage_enUS = "/traffic-simulation";
	public static final String TrafficSimulation_OfName_enUS = "of traffic simulation";
	public static final String TrafficSimulation_ANameAdjective_enUS = "a traffic simulation";
	public static final String TrafficSimulation_NameAdjectiveSingular_enUS = "traffic simulation";
	public static final String TrafficSimulation_NameAdjectivePlural_enUS = "traffic simulations";
	public static final String Search_enUS_Uri = "/api/traffic-simulation";
	public static final String Search_enUS_ImageUri = "/png/api/traffic-simulation-999.png";
	public static final String GET_enUS_Uri = "/api/traffic-simulation/{id}";
	public static final String GET_enUS_ImageUri = "/png/api/traffic-simulation/{id}-999.png";
	public static final String PATCH_enUS_Uri = "/api/traffic-simulation";
	public static final String PATCH_enUS_ImageUri = "/png/api/traffic-simulation-999.png";
	public static final String POST_enUS_Uri = "/api/traffic-simulation";
	public static final String POST_enUS_ImageUri = "/png/api/traffic-simulation-999.png";
	public static final String PUTImport_enUS_Uri = "/api/traffic-simulation-import";
	public static final String PUTImport_enUS_ImageUri = "/png/api/traffic-simulation-import-999.png";
	public static final String SearchPage_enUS_Uri = "/traffic-simulation";
	public static final String SearchPage_enUS_ImageUri = "/png/traffic-simulation-999.png";
	public static final String MapSearchPage_enUS_Uri = "/traffic-simulation-map";
	public static final String MapSearchPage_enUS_ImageUri = "/png/traffic-simulation-map-999.png";

	public static final String TrafficSimulation_Color = "2017-shaded-spruce";
	public static final String TrafficSimulation_IconGroup = "duotone";
	public static final String TrafficSimulation_IconName = "traffic-light-stop";
	public static final Integer TrafficSimulation_Rows = 100;

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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:simulationName">Find the entity simulationName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _simulationName(Wrap<String> w);

	public String getSimulationName() {
		return simulationName;
	}
	public void setSimulationName(String o) {
		this.simulationName = TrafficSimulation.staticSetSimulationName(siteRequest_, o);
	}
	public static String staticSetSimulationName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficSimulation simulationNameInit() {
		Wrap<String> simulationNameWrap = new Wrap<String>().var("simulationName");
		if(simulationName == null) {
			_simulationName(simulationNameWrap);
			setSimulationName(simulationNameWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static String staticSearchSimulationName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSimulationName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSimulationName(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrSimulationName(siteRequest_, TrafficSimulation.staticSearchSimulationName(siteRequest_, TrafficSimulation.staticSetSimulationName(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:sumocfgPath">Find the entity sumocfgPath in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _sumocfgPath(Wrap<String> w);

	public String getSumocfgPath() {
		return sumocfgPath;
	}
	public void setSumocfgPath(String o) {
		this.sumocfgPath = TrafficSimulation.staticSetSumocfgPath(siteRequest_, o);
	}
	public static String staticSetSumocfgPath(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficSimulation sumocfgPathInit() {
		Wrap<String> sumocfgPathWrap = new Wrap<String>().var("sumocfgPath");
		if(sumocfgPath == null) {
			_sumocfgPath(sumocfgPathWrap);
			setSumocfgPath(sumocfgPathWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static String staticSearchSumocfgPath(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSumocfgPath(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSumocfgPath(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrSumocfgPath(siteRequest_, TrafficSimulation.staticSearchSumocfgPath(siteRequest_, TrafficSimulation.staticSetSumocfgPath(siteRequest_, o)));
	}

	public String sqlSumocfgPath() {
		return sumocfgPath;
	}

	/////////////////
	// fcdFilePath //
	/////////////////


	/**	 The entity fcdFilePath
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String fcdFilePath;

	/**	<br> The entity fcdFilePath
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:fcdFilePath">Find the entity fcdFilePath in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _fcdFilePath(Wrap<String> w);

	public String getFcdFilePath() {
		return fcdFilePath;
	}
	public void setFcdFilePath(String o) {
		this.fcdFilePath = TrafficSimulation.staticSetFcdFilePath(siteRequest_, o);
	}
	public static String staticSetFcdFilePath(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficSimulation fcdFilePathInit() {
		Wrap<String> fcdFilePathWrap = new Wrap<String>().var("fcdFilePath");
		if(fcdFilePath == null) {
			_fcdFilePath(fcdFilePathWrap);
			setFcdFilePath(fcdFilePathWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static String staticSearchFcdFilePath(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrFcdFilePath(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqFcdFilePath(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrFcdFilePath(siteRequest_, TrafficSimulation.staticSearchFcdFilePath(siteRequest_, TrafficSimulation.staticSetFcdFilePath(siteRequest_, o)));
	}

	public String sqlFcdFilePath() {
		return fcdFilePath;
	}

	/////////////////
	// netFilePath //
	/////////////////


	/**	 The entity netFilePath
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String netFilePath;

	/**	<br> The entity netFilePath
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:netFilePath">Find the entity netFilePath in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _netFilePath(Wrap<String> w);

	public String getNetFilePath() {
		return netFilePath;
	}
	public void setNetFilePath(String o) {
		this.netFilePath = TrafficSimulation.staticSetNetFilePath(siteRequest_, o);
	}
	public static String staticSetNetFilePath(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficSimulation netFilePathInit() {
		Wrap<String> netFilePathWrap = new Wrap<String>().var("netFilePath");
		if(netFilePath == null) {
			_netFilePath(netFilePathWrap);
			setNetFilePath(netFilePathWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static String staticSearchNetFilePath(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrNetFilePath(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqNetFilePath(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrNetFilePath(siteRequest_, TrafficSimulation.staticSearchNetFilePath(siteRequest_, TrafficSimulation.staticSetNetFilePath(siteRequest_, o)));
	}

	public String sqlNetFilePath() {
		return netFilePath;
	}

	///////////////////
	// startDateTime //
	///////////////////


	/**	 The entity startDateTime
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonDeserialize(using = ComputateZonedDateTimeDeserializer.class)
	@JsonSerialize(using = ComputateZonedDateTimeSerializer.class)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSSV'['VV']'")
	@JsonInclude(Include.NON_NULL)
	protected ZonedDateTime startDateTime;

	/**	<br> The entity startDateTime
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:startDateTime">Find the entity startDateTime in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _startDateTime(Wrap<ZonedDateTime> w);

	public ZonedDateTime getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(ZonedDateTime startDateTime) {
		this.startDateTime = startDateTime;
	}
	@JsonIgnore
	public void setStartDateTime(Instant o) {
		this.startDateTime = o == null ? null : ZonedDateTime.from(o).truncatedTo(ChronoUnit.MILLIS);
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	@JsonIgnore
	public void setStartDateTime(String o) {
		this.startDateTime = TrafficSimulation.staticSetStartDateTime(siteRequest_, o);
	}
	public static ZonedDateTime staticSetStartDateTime(SiteRequestEnUS siteRequest_, String o) {
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
	public void setStartDateTime(Date o) {
		this.startDateTime = o == null ? null : ZonedDateTime.ofInstant(o.toInstant(), ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	protected TrafficSimulation startDateTimeInit() {
		Wrap<ZonedDateTime> startDateTimeWrap = new Wrap<ZonedDateTime>().var("startDateTime");
		if(startDateTime == null) {
			_startDateTime(startDateTimeWrap);
			setStartDateTime(startDateTimeWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static Date staticSearchStartDateTime(SiteRequestEnUS siteRequest_, ZonedDateTime o) {
		return o == null ? null : Date.from(o.toInstant());
	}

	public static String staticSearchStrStartDateTime(SiteRequestEnUS siteRequest_, Date o) {
		return "\"" + DateTimeFormatter.ISO_DATE_TIME.format(o.toInstant().atOffset(ZoneOffset.UTC)) + "\"";
	}

	public static String staticSearchFqStartDateTime(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrStartDateTime(siteRequest_, TrafficSimulation.staticSearchStartDateTime(siteRequest_, TrafficSimulation.staticSetStartDateTime(siteRequest_, o)));
	}

	public OffsetDateTime sqlStartDateTime() {
		return startDateTime == null ? null : startDateTime.toOffsetDateTime();
	}

	//////////////////
	// startSeconds //
	//////////////////


	/**	 The entity startSeconds
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal startSeconds;

	/**	<br> The entity startSeconds
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:startSeconds">Find the entity startSeconds in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _startSeconds(Wrap<BigDecimal> w);

	public BigDecimal getStartSeconds() {
		return startSeconds;
	}

	public void setStartSeconds(BigDecimal startSeconds) {
		this.startSeconds = startSeconds;
	}
	@JsonIgnore
	public void setStartSeconds(String o) {
		this.startSeconds = TrafficSimulation.staticSetStartSeconds(siteRequest_, o);
	}
	public static BigDecimal staticSetStartSeconds(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setStartSeconds(Double o) {
			this.startSeconds = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setStartSeconds(Integer o) {
			this.startSeconds = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected TrafficSimulation startSecondsInit() {
		Wrap<BigDecimal> startSecondsWrap = new Wrap<BigDecimal>().var("startSeconds");
		if(startSeconds == null) {
			_startSeconds(startSecondsWrap);
			setStartSeconds(startSecondsWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static Double staticSearchStartSeconds(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrStartSeconds(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqStartSeconds(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrStartSeconds(siteRequest_, TrafficSimulation.staticSearchStartSeconds(siteRequest_, TrafficSimulation.staticSetStartSeconds(siteRequest_, o)));
	}

	public BigDecimal sqlStartSeconds() {
		return startSeconds;
	}

	////////////////
	// endSeconds //
	////////////////


	/**	 The entity endSeconds
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal endSeconds;

	/**	<br> The entity endSeconds
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:endSeconds">Find the entity endSeconds in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _endSeconds(Wrap<BigDecimal> w);

	public BigDecimal getEndSeconds() {
		return endSeconds;
	}

	public void setEndSeconds(BigDecimal endSeconds) {
		this.endSeconds = endSeconds;
	}
	@JsonIgnore
	public void setEndSeconds(String o) {
		this.endSeconds = TrafficSimulation.staticSetEndSeconds(siteRequest_, o);
	}
	public static BigDecimal staticSetEndSeconds(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setEndSeconds(Double o) {
			this.endSeconds = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setEndSeconds(Integer o) {
			this.endSeconds = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected TrafficSimulation endSecondsInit() {
		Wrap<BigDecimal> endSecondsWrap = new Wrap<BigDecimal>().var("endSeconds");
		if(endSeconds == null) {
			_endSeconds(endSecondsWrap);
			setEndSeconds(endSecondsWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static Double staticSearchEndSeconds(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrEndSeconds(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqEndSeconds(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrEndSeconds(siteRequest_, TrafficSimulation.staticSearchEndSeconds(siteRequest_, TrafficSimulation.staticSetEndSeconds(siteRequest_, o)));
	}

	public BigDecimal sqlEndSeconds() {
		return endSeconds;
	}

	/////////////////
	// stepSeconds //
	/////////////////


	/**	 The entity stepSeconds
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal stepSeconds;

	/**	<br> The entity stepSeconds
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:stepSeconds">Find the entity stepSeconds in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _stepSeconds(Wrap<BigDecimal> w);

	public BigDecimal getStepSeconds() {
		return stepSeconds;
	}

	public void setStepSeconds(BigDecimal stepSeconds) {
		this.stepSeconds = stepSeconds;
	}
	@JsonIgnore
	public void setStepSeconds(String o) {
		this.stepSeconds = TrafficSimulation.staticSetStepSeconds(siteRequest_, o);
	}
	public static BigDecimal staticSetStepSeconds(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setStepSeconds(Double o) {
			this.stepSeconds = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setStepSeconds(Integer o) {
			this.stepSeconds = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected TrafficSimulation stepSecondsInit() {
		Wrap<BigDecimal> stepSecondsWrap = new Wrap<BigDecimal>().var("stepSeconds");
		if(stepSeconds == null) {
			_stepSeconds(stepSecondsWrap);
			setStepSeconds(stepSecondsWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static Double staticSearchStepSeconds(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrStepSeconds(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqStepSeconds(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrStepSeconds(siteRequest_, TrafficSimulation.staticSearchStepSeconds(siteRequest_, TrafficSimulation.staticSetStepSeconds(siteRequest_, o)));
	}

	public BigDecimal sqlStepSeconds() {
		return stepSeconds;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:tlsStatesPaths">Find the entity tlsStatesPaths in Solr</a>
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
	public static String staticSetTlsStatesPaths(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public TrafficSimulation addTlsStatesPaths(String...objects) {
		for(String o : objects) {
			addTlsStatesPaths(o);
		}
		return (TrafficSimulation)this;
	}
	public TrafficSimulation addTlsStatesPaths(String o) {
		if(o != null)
			this.tlsStatesPaths.add(o);
		return (TrafficSimulation)this;
	}
	@JsonIgnore
	public void setTlsStatesPaths(JsonArray objects) {
		tlsStatesPaths.clear();
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addTlsStatesPaths(o);
		}
	}
	protected TrafficSimulation tlsStatesPathsInit() {
		_tlsStatesPaths(tlsStatesPaths);
		return (TrafficSimulation)this;
	}

	public static String staticSearchTlsStatesPaths(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrTlsStatesPaths(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqTlsStatesPaths(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrTlsStatesPaths(siteRequest_, TrafficSimulation.staticSearchTlsStatesPaths(siteRequest_, TrafficSimulation.staticSetTlsStatesPaths(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:additionalFilePaths">Find the entity additionalFilePaths in Solr</a>
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
	public static String staticSetAdditionalFilePaths(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public TrafficSimulation addAdditionalFilePaths(String...objects) {
		for(String o : objects) {
			addAdditionalFilePaths(o);
		}
		return (TrafficSimulation)this;
	}
	public TrafficSimulation addAdditionalFilePaths(String o) {
		if(o != null)
			this.additionalFilePaths.add(o);
		return (TrafficSimulation)this;
	}
	@JsonIgnore
	public void setAdditionalFilePaths(JsonArray objects) {
		additionalFilePaths.clear();
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addAdditionalFilePaths(o);
		}
	}
	protected TrafficSimulation additionalFilePathsInit() {
		_additionalFilePaths(additionalFilePaths);
		return (TrafficSimulation)this;
	}

	public static String staticSearchAdditionalFilePaths(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrAdditionalFilePaths(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAdditionalFilePaths(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrAdditionalFilePaths(siteRequest_, TrafficSimulation.staticSearchAdditionalFilePaths(siteRequest_, TrafficSimulation.staticSetAdditionalFilePaths(siteRequest_, o)));
	}


	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepTrafficSimulation(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepTrafficSimulation();
	}

	public Future<Void> promiseDeepTrafficSimulation() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseTrafficSimulation(promise2);
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

	public Future<Void> promiseTrafficSimulation(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				simulationNameInit();
				sumocfgPathInit();
				fcdFilePathInit();
				netFilePathInit();
				startDateTimeInit();
				startSecondsInit();
				endSecondsInit();
				stepSecondsInit();
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
		return promiseDeepTrafficSimulation(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestTrafficSimulation(SiteRequestEnUS siteRequest_) {
			super.siteRequestBaseModel(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestTrafficSimulation(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainTrafficSimulation(v);
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
	public Object obtainTrafficSimulation(String var) {
		TrafficSimulation oTrafficSimulation = (TrafficSimulation)this;
		switch(var) {
			case "simulationName":
				return oTrafficSimulation.simulationName;
			case "sumocfgPath":
				return oTrafficSimulation.sumocfgPath;
			case "fcdFilePath":
				return oTrafficSimulation.fcdFilePath;
			case "netFilePath":
				return oTrafficSimulation.netFilePath;
			case "startDateTime":
				return oTrafficSimulation.startDateTime;
			case "startSeconds":
				return oTrafficSimulation.startSeconds;
			case "endSeconds":
				return oTrafficSimulation.endSeconds;
			case "stepSeconds":
				return oTrafficSimulation.stepSeconds;
			case "tlsStatesPaths":
				return oTrafficSimulation.tlsStatesPaths;
			case "additionalFilePaths":
				return oTrafficSimulation.additionalFilePaths;
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
				o = relateTrafficSimulation(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateTrafficSimulation(String var, Object val) {
		TrafficSimulation oTrafficSimulation = (TrafficSimulation)this;
		switch(var) {
			default:
				return super.relateBaseModel(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetTrafficSimulation(entityVar,  siteRequest_, o);
	}
	public static Object staticSetTrafficSimulation(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "simulationName":
			return TrafficSimulation.staticSetSimulationName(siteRequest_, o);
		case "sumocfgPath":
			return TrafficSimulation.staticSetSumocfgPath(siteRequest_, o);
		case "fcdFilePath":
			return TrafficSimulation.staticSetFcdFilePath(siteRequest_, o);
		case "netFilePath":
			return TrafficSimulation.staticSetNetFilePath(siteRequest_, o);
		case "startDateTime":
			return TrafficSimulation.staticSetStartDateTime(siteRequest_, o);
		case "startSeconds":
			return TrafficSimulation.staticSetStartSeconds(siteRequest_, o);
		case "endSeconds":
			return TrafficSimulation.staticSetEndSeconds(siteRequest_, o);
		case "stepSeconds":
			return TrafficSimulation.staticSetStepSeconds(siteRequest_, o);
		case "tlsStatesPaths":
			return TrafficSimulation.staticSetTlsStatesPaths(siteRequest_, o);
		case "additionalFilePaths":
			return TrafficSimulation.staticSetAdditionalFilePaths(siteRequest_, o);
			default:
				return BaseModel.staticSetBaseModel(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchTrafficSimulation(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchTrafficSimulation(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "simulationName":
			return TrafficSimulation.staticSearchSimulationName(siteRequest_, (String)o);
		case "sumocfgPath":
			return TrafficSimulation.staticSearchSumocfgPath(siteRequest_, (String)o);
		case "fcdFilePath":
			return TrafficSimulation.staticSearchFcdFilePath(siteRequest_, (String)o);
		case "netFilePath":
			return TrafficSimulation.staticSearchNetFilePath(siteRequest_, (String)o);
		case "startDateTime":
			return TrafficSimulation.staticSearchStartDateTime(siteRequest_, (ZonedDateTime)o);
		case "startSeconds":
			return TrafficSimulation.staticSearchStartSeconds(siteRequest_, (BigDecimal)o);
		case "endSeconds":
			return TrafficSimulation.staticSearchEndSeconds(siteRequest_, (BigDecimal)o);
		case "stepSeconds":
			return TrafficSimulation.staticSearchStepSeconds(siteRequest_, (BigDecimal)o);
		case "tlsStatesPaths":
			return TrafficSimulation.staticSearchTlsStatesPaths(siteRequest_, (String)o);
		case "additionalFilePaths":
			return TrafficSimulation.staticSearchAdditionalFilePaths(siteRequest_, (String)o);
			default:
				return BaseModel.staticSearchBaseModel(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrTrafficSimulation(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrTrafficSimulation(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "simulationName":
			return TrafficSimulation.staticSearchStrSimulationName(siteRequest_, (String)o);
		case "sumocfgPath":
			return TrafficSimulation.staticSearchStrSumocfgPath(siteRequest_, (String)o);
		case "fcdFilePath":
			return TrafficSimulation.staticSearchStrFcdFilePath(siteRequest_, (String)o);
		case "netFilePath":
			return TrafficSimulation.staticSearchStrNetFilePath(siteRequest_, (String)o);
		case "startDateTime":
			return TrafficSimulation.staticSearchStrStartDateTime(siteRequest_, (Date)o);
		case "startSeconds":
			return TrafficSimulation.staticSearchStrStartSeconds(siteRequest_, (Double)o);
		case "endSeconds":
			return TrafficSimulation.staticSearchStrEndSeconds(siteRequest_, (Double)o);
		case "stepSeconds":
			return TrafficSimulation.staticSearchStrStepSeconds(siteRequest_, (Double)o);
		case "tlsStatesPaths":
			return TrafficSimulation.staticSearchStrTlsStatesPaths(siteRequest_, (String)o);
		case "additionalFilePaths":
			return TrafficSimulation.staticSearchStrAdditionalFilePaths(siteRequest_, (String)o);
			default:
				return BaseModel.staticSearchStrBaseModel(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqTrafficSimulation(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqTrafficSimulation(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "simulationName":
			return TrafficSimulation.staticSearchFqSimulationName(siteRequest_, o);
		case "sumocfgPath":
			return TrafficSimulation.staticSearchFqSumocfgPath(siteRequest_, o);
		case "fcdFilePath":
			return TrafficSimulation.staticSearchFqFcdFilePath(siteRequest_, o);
		case "netFilePath":
			return TrafficSimulation.staticSearchFqNetFilePath(siteRequest_, o);
		case "startDateTime":
			return TrafficSimulation.staticSearchFqStartDateTime(siteRequest_, o);
		case "startSeconds":
			return TrafficSimulation.staticSearchFqStartSeconds(siteRequest_, o);
		case "endSeconds":
			return TrafficSimulation.staticSearchFqEndSeconds(siteRequest_, o);
		case "stepSeconds":
			return TrafficSimulation.staticSearchFqStepSeconds(siteRequest_, o);
		case "tlsStatesPaths":
			return TrafficSimulation.staticSearchFqTlsStatesPaths(siteRequest_, o);
		case "additionalFilePaths":
			return TrafficSimulation.staticSearchFqAdditionalFilePaths(siteRequest_, o);
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
					o = persistTrafficSimulation(v, val);
				else if(o instanceof BaseModel) {
					BaseModel oBaseModel = (BaseModel)o;
					o = oBaseModel.persistForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object persistTrafficSimulation(String var, Object val) {
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
			} else if("fcdfilepath".equals(varLower)) {
				if(val instanceof String) {
					setFcdFilePath((String)val);
				}
				saves.add("fcdFilePath");
				return val;
			} else if("netfilepath".equals(varLower)) {
				if(val instanceof String) {
					setNetFilePath((String)val);
				}
				saves.add("netFilePath");
				return val;
			} else if("startdatetime".equals(varLower)) {
				if(val instanceof String) {
					setStartDateTime((String)val);
				} else if(val instanceof OffsetDateTime) {
					setStartDateTime(((OffsetDateTime)val).atZoneSameInstant(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))));
				}
				saves.add("startDateTime");
				return val;
			} else if("startseconds".equals(varLower)) {
				if(val instanceof String) {
					setStartSeconds((String)val);
				} else if(val instanceof Number) {
					setStartSeconds(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("startSeconds");
				return val;
			} else if("endseconds".equals(varLower)) {
				if(val instanceof String) {
					setEndSeconds((String)val);
				} else if(val instanceof Number) {
					setEndSeconds(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("endSeconds");
				return val;
			} else if("stepseconds".equals(varLower)) {
				if(val instanceof String) {
					setStepSeconds((String)val);
				} else if(val instanceof Number) {
					setStepSeconds(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("stepSeconds");
				return val;
		} else {
			return super.persistBaseModel(var, val);
		}
	}

	/////////////
	// populate //
	/////////////

	@Override public void populateForClass(SolrResponse.Doc doc) {
		populateTrafficSimulation(doc);
	}
	public void populateTrafficSimulation(SolrResponse.Doc doc) {
		TrafficSimulation oTrafficSimulation = (TrafficSimulation)this;
		saves = doc.get("saves_docvalues_strings");
		if(saves != null) {
		}

		super.populateBaseModel(doc);
	}

	public void indexTrafficSimulation(JsonObject doc) {
		if(simulationName != null) {
			doc.put("simulationName_docvalues_string", simulationName);
		}
		if(sumocfgPath != null) {
			doc.put("sumocfgPath_docvalues_string", sumocfgPath);
		}
		if(fcdFilePath != null) {
			doc.put("fcdFilePath_docvalues_string", fcdFilePath);
		}
		if(netFilePath != null) {
			doc.put("netFilePath_docvalues_string", netFilePath);
		}
		if(startDateTime != null) {
			doc.put("startDateTime_docvalues_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(ZonedDateTime.ofInstant(startDateTime.toInstant(), ZoneId.of("UTC"))));
		}
		if(startSeconds != null) {
			doc.put("startSeconds_docvalues_double", startSeconds.doubleValue());
		}
		if(endSeconds != null) {
			doc.put("endSeconds_docvalues_double", endSeconds.doubleValue());
		}
		if(stepSeconds != null) {
			doc.put("stepSeconds_docvalues_double", stepSeconds.doubleValue());
		}
		super.indexBaseModel(doc);

	}

	public static String varStoredTrafficSimulation(String entityVar) {
		switch(entityVar) {
			case "simulationName":
				return "simulationName_docvalues_string";
			case "sumocfgPath":
				return "sumocfgPath_docvalues_string";
			case "fcdFilePath":
				return "fcdFilePath_docvalues_string";
			case "netFilePath":
				return "netFilePath_docvalues_string";
			case "startDateTime":
				return "startDateTime_docvalues_date";
			case "startSeconds":
				return "startSeconds_docvalues_double";
			case "endSeconds":
				return "endSeconds_docvalues_double";
			case "stepSeconds":
				return "stepSeconds_docvalues_double";
			default:
				return BaseModel.varStoredBaseModel(entityVar);
		}
	}

	public static String varIndexedTrafficSimulation(String entityVar) {
		switch(entityVar) {
			case "simulationName":
				return "simulationName_docvalues_string";
			case "sumocfgPath":
				return "sumocfgPath_docvalues_string";
			case "fcdFilePath":
				return "fcdFilePath_docvalues_string";
			case "netFilePath":
				return "netFilePath_docvalues_string";
			case "startDateTime":
				return "startDateTime_docvalues_date";
			case "startSeconds":
				return "startSeconds_docvalues_double";
			case "endSeconds":
				return "endSeconds_docvalues_double";
			case "stepSeconds":
				return "stepSeconds_docvalues_double";
			default:
				return BaseModel.varIndexedBaseModel(entityVar);
		}
	}

	public static String searchVarTrafficSimulation(String searchVar) {
		switch(searchVar) {
			case "simulationName_docvalues_string":
				return "simulationName";
			case "sumocfgPath_docvalues_string":
				return "sumocfgPath";
			case "fcdFilePath_docvalues_string":
				return "fcdFilePath";
			case "netFilePath_docvalues_string":
				return "netFilePath";
			case "startDateTime_docvalues_date":
				return "startDateTime";
			case "startSeconds_docvalues_double":
				return "startSeconds";
			case "endSeconds_docvalues_double":
				return "endSeconds";
			case "stepSeconds_docvalues_double":
				return "stepSeconds";
			default:
				return BaseModel.searchVarBaseModel(searchVar);
		}
	}

	public static String varSearchTrafficSimulation(String entityVar) {
		switch(entityVar) {
			default:
				return BaseModel.varSearchBaseModel(entityVar);
		}
	}

	public static String varSuggestedTrafficSimulation(String entityVar) {
		switch(entityVar) {
			default:
				return BaseModel.varSuggestedBaseModel(entityVar);
		}
	}

	/////////////
	// store //
	/////////////

	@Override public void storeForClass(SolrResponse.Doc doc) {
		storeTrafficSimulation(doc);
	}
	public void storeTrafficSimulation(SolrResponse.Doc doc) {
		TrafficSimulation oTrafficSimulation = (TrafficSimulation)this;

		oTrafficSimulation.setSimulationName(Optional.ofNullable(doc.get("simulationName_docvalues_string")).map(v -> v.toString()).orElse(null));
		oTrafficSimulation.setSumocfgPath(Optional.ofNullable(doc.get("sumocfgPath_docvalues_string")).map(v -> v.toString()).orElse(null));
		oTrafficSimulation.setFcdFilePath(Optional.ofNullable(doc.get("fcdFilePath_docvalues_string")).map(v -> v.toString()).orElse(null));
		oTrafficSimulation.setNetFilePath(Optional.ofNullable(doc.get("netFilePath_docvalues_string")).map(v -> v.toString()).orElse(null));
		oTrafficSimulation.setStartDateTime(Optional.ofNullable(doc.get("startDateTime_docvalues_date")).map(v -> v.toString()).orElse(null));
		oTrafficSimulation.setStartSeconds(Optional.ofNullable(doc.get("startSeconds_docvalues_double")).map(v -> v.toString()).orElse(null));
		oTrafficSimulation.setEndSeconds(Optional.ofNullable(doc.get("endSeconds_docvalues_double")).map(v -> v.toString()).orElse(null));
		oTrafficSimulation.setStepSeconds(Optional.ofNullable(doc.get("stepSeconds_docvalues_double")).map(v -> v.toString()).orElse(null));

		super.storeBaseModel(doc);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestTrafficSimulation() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof TrafficSimulation) {
			TrafficSimulation original = (TrafficSimulation)o;
			if(!Objects.equals(simulationName, original.getSimulationName()))
				apiRequest.addVars("simulationName");
			if(!Objects.equals(sumocfgPath, original.getSumocfgPath()))
				apiRequest.addVars("sumocfgPath");
			if(!Objects.equals(fcdFilePath, original.getFcdFilePath()))
				apiRequest.addVars("fcdFilePath");
			if(!Objects.equals(netFilePath, original.getNetFilePath()))
				apiRequest.addVars("netFilePath");
			if(!Objects.equals(startDateTime, original.getStartDateTime()))
				apiRequest.addVars("startDateTime");
			if(!Objects.equals(startSeconds, original.getStartSeconds()))
				apiRequest.addVars("startSeconds");
			if(!Objects.equals(endSeconds, original.getEndSeconds()))
				apiRequest.addVars("endSeconds");
			if(!Objects.equals(stepSeconds, original.getStepSeconds()))
				apiRequest.addVars("stepSeconds");
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
		sb.append(Optional.ofNullable(sumocfgPath).map(v -> "sumocfgPath: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(fcdFilePath).map(v -> "fcdFilePath: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(netFilePath).map(v -> "netFilePath: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(startDateTime).map(v -> "startDateTime: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(startSeconds).map(v -> "startSeconds: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(endSeconds).map(v -> "endSeconds: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(stepSeconds).map(v -> "stepSeconds: " + v + "\n").orElse(""));
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "TrafficSimulation";
	public static final String VAR_simulationName = "simulationName";
	public static final String VAR_sumocfgPath = "sumocfgPath";
	public static final String VAR_fcdFilePath = "fcdFilePath";
	public static final String VAR_netFilePath = "netFilePath";
	public static final String VAR_startDateTime = "startDateTime";
	public static final String VAR_startSeconds = "startSeconds";
	public static final String VAR_endSeconds = "endSeconds";
	public static final String VAR_stepSeconds = "stepSeconds";
	public static final String VAR_tlsStatesPaths = "tlsStatesPaths";
	public static final String VAR_additionalFilePaths = "additionalFilePaths";

	public static List<String> varsQForClass() {
		return TrafficSimulation.varsQTrafficSimulation(new ArrayList<String>());
	}
	public static List<String> varsQTrafficSimulation(List<String> vars) {
		BaseModel.varsQBaseModel(vars);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return TrafficSimulation.varsFqTrafficSimulation(new ArrayList<String>());
	}
	public static List<String> varsFqTrafficSimulation(List<String> vars) {
		vars.add(VAR_simulationName);
		vars.add(VAR_sumocfgPath);
		vars.add(VAR_fcdFilePath);
		vars.add(VAR_netFilePath);
		vars.add(VAR_startDateTime);
		vars.add(VAR_startSeconds);
		vars.add(VAR_endSeconds);
		vars.add(VAR_stepSeconds);
		BaseModel.varsFqBaseModel(vars);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return TrafficSimulation.varsRangeTrafficSimulation(new ArrayList<String>());
	}
	public static List<String> varsRangeTrafficSimulation(List<String> vars) {
		vars.add(VAR_startDateTime);
		vars.add(VAR_startSeconds);
		vars.add(VAR_endSeconds);
		vars.add(VAR_stepSeconds);
		BaseModel.varsRangeBaseModel(vars);
		return vars;
	}

	public static final String DISPLAY_NAME_simulationName = "simulation name";
	public static final String DISPLAY_NAME_sumocfgPath = "sumocfg path";
	public static final String DISPLAY_NAME_fcdFilePath = "Floating Car Data file path";
	public static final String DISPLAY_NAME_netFilePath = "net file path";
	public static final String DISPLAY_NAME_startDateTime = "Start date and Time";
	public static final String DISPLAY_NAME_startSeconds = "start seconds";
	public static final String DISPLAY_NAME_endSeconds = "end seconds";
	public static final String DISPLAY_NAME_stepSeconds = "step seconds";
	public static final String DISPLAY_NAME_tlsStatesPaths = "TLS States paths";
	public static final String DISPLAY_NAME_additionalFilePaths = "additional file paths";

	public static String displayNameForClass(String var) {
		return TrafficSimulation.displayNameTrafficSimulation(var);
	}
	public static String displayNameTrafficSimulation(String var) {
		switch(var) {
		case VAR_simulationName:
			return DISPLAY_NAME_simulationName;
		case VAR_sumocfgPath:
			return DISPLAY_NAME_sumocfgPath;
		case VAR_fcdFilePath:
			return DISPLAY_NAME_fcdFilePath;
		case VAR_netFilePath:
			return DISPLAY_NAME_netFilePath;
		case VAR_startDateTime:
			return DISPLAY_NAME_startDateTime;
		case VAR_startSeconds:
			return DISPLAY_NAME_startSeconds;
		case VAR_endSeconds:
			return DISPLAY_NAME_endSeconds;
		case VAR_stepSeconds:
			return DISPLAY_NAME_stepSeconds;
		case VAR_tlsStatesPaths:
			return DISPLAY_NAME_tlsStatesPaths;
		case VAR_additionalFilePaths:
			return DISPLAY_NAME_additionalFilePaths;
		default:
			return BaseModel.displayNameBaseModel(var);
		}
	}

	public static String descriptionTrafficSimulation(String var) {
		switch(var) {
		case VAR_startDateTime:
			return "The start date and time. ";
		case VAR_startSeconds:
			return "-b, --begin TIME Defines the begin time in seconds; The simulation starts at this time";
		case VAR_endSeconds:
			return "-e, --end TIME Defines the end time in seconds; The simulation ends at this time";
		case VAR_stepSeconds:
			return "--step-length TIME Defines the step duration in seconds";
		case VAR_tlsStatesPaths:
			return "The paths to all TLS States files";
		case VAR_additionalFilePaths:
			return "The paths to all the additional SUMO config files";
			default:
				return BaseModel.descriptionBaseModel(var);
		}
	}

	public static String classSimpleNameTrafficSimulation(String var) {
		switch(var) {
		case VAR_simulationName:
			return "String";
		case VAR_sumocfgPath:
			return "String";
		case VAR_fcdFilePath:
			return "String";
		case VAR_netFilePath:
			return "String";
		case VAR_startDateTime:
			return "ZonedDateTime";
		case VAR_startSeconds:
			return "BigDecimal";
		case VAR_endSeconds:
			return "BigDecimal";
		case VAR_stepSeconds:
			return "BigDecimal";
		case VAR_tlsStatesPaths:
			return "List";
		case VAR_additionalFilePaths:
			return "List";
			default:
				return BaseModel.classSimpleNameBaseModel(var);
		}
	}

	public static Integer htmlColumnTrafficSimulation(String var) {
		switch(var) {
			default:
				return BaseModel.htmlColumnBaseModel(var);
		}
	}

	public static Integer htmlRowTrafficSimulation(String var) {
		switch(var) {
		case VAR_simulationName:
			return 3;
		case VAR_sumocfgPath:
			return 4;
		case VAR_fcdFilePath:
			return 5;
		case VAR_startDateTime:
			return 6;
		case VAR_startSeconds:
			return 7;
		case VAR_endSeconds:
			return 7;
		case VAR_stepSeconds:
			return 7;
			default:
				return BaseModel.htmlRowBaseModel(var);
		}
	}

	public static Integer htmlCellTrafficSimulation(String var) {
		switch(var) {
		case VAR_simulationName:
			return 1;
		case VAR_sumocfgPath:
			return 1;
		case VAR_fcdFilePath:
			return 1;
		case VAR_startDateTime:
			return 1;
		case VAR_startSeconds:
			return 1;
		case VAR_endSeconds:
			return 2;
		case VAR_stepSeconds:
			return 3;
			default:
				return BaseModel.htmlCellBaseModel(var);
		}
	}

	public static Integer lengthMinTrafficSimulation(String var) {
		switch(var) {
			default:
				return BaseModel.lengthMinBaseModel(var);
		}
	}

	public static Integer lengthMaxTrafficSimulation(String var) {
		switch(var) {
			default:
				return BaseModel.lengthMaxBaseModel(var);
		}
	}

	public static Integer maxTrafficSimulation(String var) {
		switch(var) {
			default:
				return BaseModel.maxBaseModel(var);
		}
	}

	public static Integer minTrafficSimulation(String var) {
		switch(var) {
			default:
				return BaseModel.minBaseModel(var);
		}
	}
}
