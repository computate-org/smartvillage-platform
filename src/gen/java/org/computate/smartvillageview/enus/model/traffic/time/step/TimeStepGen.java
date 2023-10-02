package org.computate.smartvillageview.enus.model.traffic.time.step;

import org.computate.smartvillageview.enus.request.SiteRequestEnUS;
import org.computate.smartvillageview.enus.model.base.BaseModel;
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
import org.computate.smartvillageview.enus.result.base.BaseResult;
import java.lang.Long;
import java.lang.String;
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
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class TimeStepGen into the class TimeStep. 
 * </li><li>You can add a class comment "Model: true" if you wish to persist these TimeStep objects in a relational PostgreSQL database transactionally in the RESTful API. 
 * The code to persist and query the TimeStepGen data in the database will then be automatically generated. 
 * </li>
 * <h3>About the TimeStep class and it's generated class TimeStepGen&lt;BaseResult&gt;: </h3>extends TimeStepGen
 * <p>
 * This Java class extends a generated Java class TimeStepGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.time.step.TimeStep">Find the class TimeStep in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends TimeStepGen<BaseResult>
 * <p>This <code>class TimeStep extends TimeStepGen&lt;BaseResult&gt;</code>, which means it extends a newly generated TimeStepGen. 
 * The generated <code>class TimeStepGen extends BaseResult</code> which means that TimeStep extends TimeStepGen which extends BaseResult. 
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
 * <p>This class contains a comment <b>"ApiTag: Time Step"</b>, which groups all of the OpenAPIs for TimeStep objects under the tag "Time Step". 
 * </p>
 * <h2>ApiUri.enUS: /api/time-step</h2>
 * <p>This class contains a comment <b>"ApiUri: /api/time-step"</b>, which defines the base API URI for TimeStep objects as "/api/time-step" in the OpenAPI spec. 
 * </p>
 * <h2>Color: 2017-shaded-spruce</h2>
 * <p>This class contains a comment <b>"Color: 2017-shaded-spruce"</b>, which styles the TimeStep page "2017-shaded-spruce". 
 * This will reference a CSS class defined by the stylesheets in the project that starts with "w3-". 
 * A css class of "w3-2017-shaded-spruce" is expected to exist in the project stylesheets, and is inspired by W3 CSS colors. 
 * See: <a href="https://www.w3schools.com/w3css/w3css_colors.asp">https://www.w3schools.com/w3css/w3css_colors.asp</a>. 
 * </p>
 * <h2>IconGroup: duotone</h2>
 * <p>This class contains a comment <b>"IconGroup: duotone"</b>, which adds icons on the TimeStep page with a group of "duotone". 
 * This will reference a Font Awesome icon group that starts with "fa-" followed by the icon group "duotone", together is "fa-duotone". 
 * A Font Awesome icon group of "duotone" is expected to exist. 
 * The Font Awesome groups currently supported include: solid, regular, light, thin, duotone, sharp, and kit. 
 * See: <a href="https://fontawesome.com/docs/web/dig-deeper/styles">https://fontawesome.com/docs/web/dig-deeper/styles</a>. 
 * </p>
 * <h2>IconName: timer</h2>
 * <p>This class contains a comment <b>"IconName: timer"</b>, which adds icons on the TimeStep page with a name of "timer". 
 * This will reference a Font Awesome icon that starts with the icon group "fa-duotone fa-" followed by the icon name, which is "fa-duotone fa-timer". 
 * A Font Awesome icon of "fa-duotone fa-timer" is expected to exist. 
 * See: <a href="https://fontawesome.com/icons">https://fontawesome.com/icons</a>. 
 * </p>
 * <h2>Indexed: true</h2>
 * <p>This class contains a comment <b>"Indexed: true"</b>, which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * <h2>{@inheritDoc}</h2>
 * <p>By adding a class comment "{@inheritDoc}", the TimeStep class will inherit the helpful inherited class comments from the super class TimeStepGen. 
 * </p>
 * <h2>Rows: 100</h2>
 * <p>This class contains a comment <b>"Rows: 100"</b>, which means the TimeStep API will return a default of 100 records instead of 10 by default. 
 * Each API has built in pagination of the search records to ensure a user can query all the data a page at a time without running the application out of memory. 
 * </p>
 * <h2>Order: 7</h2>
 * <p>This class contains a comment <b>"Order: 7"</b>, which means this class will be sorted by the given number 7 ascending when code that relates to multiple classes at the same time is generated. 
 * </p>
 * <h2>Model: true</h2>
 * <h2>Page: true</h2>
 * <p>This class contains a comment <b>"Page: true"</b>, which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.smartvillageview.enus.model.traffic.time.step.TimeStepPage. 
 * </p>
 * <h2>SuperPage.enUS: BaseResultPage</h2>
 * <p>This class contains a comment <b>"SuperPage.enUS: BaseResultPage"</b>, which identifies the Java super class of the page code by it's class simple name "BaseResultPage". 
 * This means that the newly created class org.computate.smartvillageview.enus.model.traffic.time.step.TimeStepPage extends org.computate.smartvillageview.enus.result.base.BaseResultPage. 
 * </p>
 * <h2>Promise: true</h2>
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the TimeStep Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * This class contains a comment <b>"Role.enUS: SiteAdmin"</b>, which identifies the default role name "SiteAdmin" of the OAuth2/OpenID Connect user role required to access this TimeStep API. 
 * It's possible to reconfigure the roles required to access the TimeStep API by configuring an environment variable like this: 
 * </p>
 * <pre>AUTH_ROLE_REQUIRED_TimeStep: ["SiteAdmin"]</pre>
 * <h2>AName.enUS: a time step</h2>
 * <p>This class contains a comment <b>"AName.enUS: a time step"</b>, which identifies the language context to describe a TimeStep as "a time step". 
 * </p>
 * <p>
 * Delete the class TimeStep in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.time.step.TimeStep&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.traffic.time.step in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.time.step&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * Generated: true
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

	public static final String TimeStep_Color = "2017-shaded-spruce";
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.time.step.TimeStep&fq=entiteVar_enUS_indexed_string:simulationKey">Find the entity simulationKey in Solr</a>
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
			Optional.ofNullable(simulationKeyWrap.getO()).ifPresent(o -> {
				setSimulationKey(o);
			});
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.time.step.TimeStep&fq=entiteVar_enUS_indexed_string:path">Find the entity path in Solr</a>
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
			Optional.ofNullable(pathWrap.getO()).ifPresent(o -> {
				setPath(o);
			});
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.time.step.TimeStep&fq=entiteVar_enUS_indexed_string:time">Find the entity time in Solr</a>
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
	protected TimeStep timeInit() {
		Wrap<BigDecimal> timeWrap = new Wrap<BigDecimal>().var("time");
		if(time == null) {
			_time(timeWrap);
			Optional.ofNullable(timeWrap.getO()).ifPresent(o -> {
				setTime(o);
			});
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.time.step.TimeStep&fq=entiteVar_enUS_indexed_string:dateTime">Find the entity dateTime in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _dateTime(Wrap<ZonedDateTime> w);

	public ZonedDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(ZonedDateTime dateTime) {
		this.dateTime = Optional.ofNullable(dateTime).map(v -> v.truncatedTo(ChronoUnit.MILLIS)).orElse(null);
	}
	@JsonIgnore
	public void setDateTime(Instant o) {
		this.dateTime = o == null ? null : ZonedDateTime.from(o).truncatedTo(ChronoUnit.MILLIS);
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	@JsonIgnore
	public void setDateTime(String o) {
		this.dateTime = TimeStep.staticSetDateTime(siteRequest_, o);
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
	protected TimeStep dateTimeInit() {
		Wrap<ZonedDateTime> dateTimeWrap = new Wrap<ZonedDateTime>().var("dateTime");
		if(dateTime == null) {
			_dateTime(dateTimeWrap);
			Optional.ofNullable(dateTimeWrap.getO()).ifPresent(o -> {
				setDateTime(o);
			});
		}
		return (TimeStep)this;
	}

	public static Date staticSearchDateTime(SiteRequestEnUS siteRequest_, ZonedDateTime o) {
		return o == null ? null : Date.from(o.toInstant());
	}

	public static String staticSearchStrDateTime(SiteRequestEnUS siteRequest_, Date o) {
		return "\"" + DateTimeFormatter.ISO_DATE_TIME.format(o.toInstant().atOffset(ZoneOffset.UTC)) + "\"";
	}

	public static String staticSearchFqDateTime(SiteRequestEnUS siteRequest_, String o) {
		return TimeStep.staticSearchStrDateTime(siteRequest_, TimeStep.staticSearchDateTime(siteRequest_, TimeStep.staticSetDateTime(siteRequest_, o)));
	}

	public OffsetDateTime sqlDateTime() {
		return dateTime == null ? null : dateTime.toOffsetDateTime();
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
				dateTimeInit();
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
			case "dateTime":
				return oTimeStep.dateTime;
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
		case "dateTime":
			return TimeStep.staticSetDateTime(siteRequest_, o);
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
		case "dateTime":
			return TimeStep.staticSearchDateTime(siteRequest_, (ZonedDateTime)o);
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
		case "dateTime":
			return TimeStep.staticSearchStrDateTime(siteRequest_, (Date)o);
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
		case "dateTime":
			return TimeStep.staticSearchFqDateTime(siteRequest_, o);
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
			} else if("datetime".equals(varLower)) {
				if(val instanceof String) {
					setDateTime((String)val);
				} else if(val instanceof OffsetDateTime) {
					setDateTime(((OffsetDateTime)val).atZoneSameInstant(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))));
				}
				saves.add("dateTime");
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

			if(saves.contains("simulationKey")) {
				Long simulationKey = (Long)doc.get("simulationKey_docvalues_long");
				if(simulationKey != null)
					oTimeStep.setSimulationKey(simulationKey);
			}

			if(saves.contains("path")) {
				String path = (String)doc.get("path_docvalues_string");
				if(path != null)
					oTimeStep.setPath(path);
			}

			if(saves.contains("time")) {
				Double time = (Double)doc.get("time_docvalues_double");
				if(time != null)
					oTimeStep.setTime(time);
			}

			if(saves.contains("dateTime")) {
				Date dateTime = (Date)doc.get("dateTime_docvalues_date");
				if(dateTime != null)
					oTimeStep.setDateTime(dateTime);
			}
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
		if(dateTime != null) {
			doc.put("dateTime_docvalues_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(ZonedDateTime.ofInstant(dateTime.toInstant(), ZoneId.of("UTC"))));
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
			case "dateTime":
				return "dateTime_docvalues_date";
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
			case "dateTime":
				return "dateTime_docvalues_date";
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
			case "dateTime_docvalues_date":
				return "dateTime";
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
		oTimeStep.setDateTime(Optional.ofNullable(doc.get("dateTime_docvalues_date")).map(v -> v.toString()).orElse(null));

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
			if(!Objects.equals(time, original.getTime()) && time != null && original.getTime() != null && time.compareTo(original.getTime()) != 0)
				apiRequest.addVars("time");
			if(!Objects.equals(dateTime, original.getDateTime()))
				apiRequest.addVars("dateTime");
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
		sb.append(Optional.ofNullable(dateTime).map(v -> "dateTime: " + v + "\n").orElse(""));
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "TimeStep";
	public static final String VAR_simulationKey = "simulationKey";
	public static final String VAR_path = "path";
	public static final String VAR_time = "time";
	public static final String VAR_dateTime = "dateTime";

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
		vars.add(VAR_dateTime);
		BaseResult.varsFqBaseResult(vars);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return TimeStep.varsRangeTimeStep(new ArrayList<String>());
	}
	public static List<String> varsRangeTimeStep(List<String> vars) {
		vars.add(VAR_simulationKey);
		vars.add(VAR_time);
		vars.add(VAR_dateTime);
		BaseResult.varsRangeBaseResult(vars);
		return vars;
	}

	public static final String DISPLAY_NAME_simulationKey = "Simulation";
	public static final String DISPLAY_NAME_path = "Path";
	public static final String DISPLAY_NAME_time = "Time in seconds";
	public static final String DISPLAY_NAME_dateTime = "Date and Time in seconds";

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
		case VAR_dateTime:
			return DISPLAY_NAME_dateTime;
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
		case VAR_dateTime:
			return "The date and time in seconds. ";
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
		case VAR_dateTime:
			return "ZonedDateTime";
			default:
				return BaseResult.classSimpleNameBaseResult(var);
		}
	}

	public static Integer htmColumnTimeStep(String var) {
		switch(var) {
			default:
				return BaseResult.htmColumnBaseResult(var);
		}
	}

	public static Integer htmRowTimeStep(String var) {
		switch(var) {
		case VAR_simulationKey:
			return 3;
		case VAR_path:
			return 3;
		case VAR_time:
			return 3;
		case VAR_dateTime:
			return 4;
			default:
				return BaseResult.htmRowBaseResult(var);
		}
	}

	public static Integer htmCellTimeStep(String var) {
		switch(var) {
		case VAR_simulationKey:
			return 1;
		case VAR_path:
			return 2;
		case VAR_time:
			return 3;
		case VAR_dateTime:
			return 1;
			default:
				return BaseResult.htmCellBaseResult(var);
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
