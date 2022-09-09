package org.computate.smartvillageview.enus.model.traffic.person.step;

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
import java.lang.Void;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import java.lang.Double;
import io.vertx.pgclient.data.Point;
import org.computate.vertx.serialize.pgclient.PgClientPointSerializer;
import org.computate.vertx.serialize.pgclient.PgClientPointDeserializer;
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
import java.lang.Boolean;
import io.vertx.core.json.JsonArray;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;
import io.vertx.core.json.JsonObject;

/**	
 * <h1>Suggestions that can generate more code for you: </h1>
 * <ol>
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class PersonStepGen into the class PersonStep. 
 * </li>
 * <li>You can add a class comment "Model: true" if you wish to persist these PersonStep objects in a relational PostgreSQL database transactionally in the RESTful API. 
 * The code to persist and query the PersonStepGen data in the database will then be automatically generated. 
 * </li>
 * </ol>
 * <h1>About the PersonStep class and it's generated class PersonStepGen&lt;Object&gt;: </h1>
 * <p>
 * This Java class extends a generated Java class built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep">Find the class PersonStep in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * <p>This class contains a comment "Indexed: true", which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * <p>This class contains a comment "Page: true", which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.smartvillageview.enus.model.traffic.person.step.PersonStepPage. 
 * </p>
 * <p>This class contains a comment "SuperPage.enUS: PageLayout", which identifies the Java super class of the page code by it's class simple name "PageLayout". 
 * This means that the newly created class org.computate.smartvillageview.enus.model.traffic.person.step.PersonStepPage extends org.computate.smartvillageview.enus.page.PageLayout. 
 * </p>
 * <p>This class contains a comment "Api: true", which means this class will have Java Vert.x API backend code generated for these objects. 
 * </p>
 * <p>This class contains a comment "ApiTag: Person Step", which groups all of the OpenAPIs for PersonStep objects under the tag "Person Step". 
 * </p>
 * <p>This class contains a comment "ApiUri: /api/person-step", which defines the base API URI for PersonStep objects as "/api/person-step" in the OpenAPI spec. 
 * </p>
 * <p>This class contains a comment "Rows: 100", which means the PersonStep API will return a default of 100 records instead of 10 by default. 
 * Each API has built in pagination of the search records to ensure a user can query all the data a page at a time without running the application out of memory. 
 * </p>
 * <p>
 * Delete the class PersonStep in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.traffic.person.step in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smart-village-view in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smart\-village\-view&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class PersonStepGen<DEV> extends Object {
	protected static final Logger LOG = LoggerFactory.getLogger(PersonStep.class);

	public static final String PersonStep_AName_enUS = "a person step";
	public static final String PersonStep_This_enUS = "this ";
	public static final String PersonStep_ThisName_enUS = "this person step";
	public static final String PersonStep_A_enUS = "a ";
	public static final String PersonStep_TheName_enUS = "the person step";
	public static final String PersonStep_NameSingular_enUS = "person step";
	public static final String PersonStep_NamePlural_enUS = "person steps";
	public static final String PersonStep_NameActual_enUS = "current person step";
	public static final String PersonStep_AllName_enUS = "all the person steps";
	public static final String PersonStep_SearchAllNameBy_enUS = "search person steps by ";
	public static final String PersonStep_Title_enUS = "person steps";
	public static final String PersonStep_ThePluralName_enUS = "the person steps";
	public static final String PersonStep_NoNameFound_enUS = "no person step found";
	public static final String PersonStep_ApiUri_enUS = "/api/person-step";
	public static final String PersonStep_ApiUriSearchPage_enUS = "/person-step";
	public static final String PersonStep_OfName_enUS = "of person step";
	public static final String PersonStep_ANameAdjective_enUS = "a person step";
	public static final String PersonStep_NameAdjectiveSingular_enUS = "person step";
	public static final String PersonStep_NameAdjectivePlural_enUS = "person steps";
	public static final String Search_enUS_Uri = "/api/person-step";
	public static final String Search_enUS_ImageUri = "/png/api/person-step-999.png";
	public static final String GET_enUS_Uri = "/api/person-step/{id}";
	public static final String GET_enUS_ImageUri = "/png/api/person-step/{id}-999.png";
	public static final String PATCH_enUS_Uri = "/api/person-step";
	public static final String PATCH_enUS_ImageUri = "/png/api/person-step-999.png";
	public static final String POST_enUS_Uri = "/api/person-step";
	public static final String POST_enUS_ImageUri = "/png/api/person-step-999.png";
	public static final String PUTImport_enUS_Uri = "/api/person-step-import";
	public static final String PUTImport_enUS_ImageUri = "/png/api/person-step-import-999.png";
	public static final String SearchPage_enUS_Uri = "/person-step";
	public static final String SearchPage_enUS_ImageUri = "/png/person-step-999.png";

	public static final String PersonStep_Color = "blue";
	public static final String PersonStep_IconGroup = "duotone";
	public static final String PersonStep_IconName = "map-location-dot";
	public static final Integer PersonStep_Rows = 100;

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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:siteRequest_">Find the entity siteRequest_ in Solr</a>
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
	protected PersonStep siteRequest_Init() {
		Wrap<SiteRequestEnUS> siteRequest_Wrap = new Wrap<SiteRequestEnUS>().var("siteRequest_");
		if(siteRequest_ == null) {
			_siteRequest_(siteRequest_Wrap);
			setSiteRequest_(siteRequest_Wrap.o);
		}
		return (PersonStep)this;
	}

	///////////////////
	// promiseBefore //
	///////////////////

	/**	 The entity promiseBefore
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected Void promiseBefore;

	/**	<br> The entity promiseBefore
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:promiseBefore">Find the entity promiseBefore in Solr</a>
	 * <br>
	 * @param promise is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _promiseBefore(Promise<Void> promise);

	public Void getPromiseBefore() {
		return promiseBefore;
	}

	public void setPromiseBefore(Void promiseBefore) {
		this.promiseBefore = promiseBefore;
	}
	public static Void staticSetPromiseBefore(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected Future<Void> promiseBeforePromise() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		_promiseBefore(promise2);
		promise2.future().onSuccess(o -> {
			setPromiseBefore(o);
			promise.complete(o);
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:simulationKey">Find the entity simulationKey in Solr</a>
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
		this.simulationKey = PersonStep.staticSetSimulationKey(siteRequest_, o);
	}
	public static Long staticSetSimulationKey(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected PersonStep simulationKeyInit() {
		Wrap<Long> simulationKeyWrap = new Wrap<Long>().var("simulationKey");
		if(simulationKey == null) {
			_simulationKey(simulationKeyWrap);
			setSimulationKey(simulationKeyWrap.o);
		}
		return (PersonStep)this;
	}

	public static Long staticSearchSimulationKey(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrSimulationKey(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSimulationKey(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrSimulationKey(siteRequest_, PersonStep.staticSearchSimulationKey(siteRequest_, PersonStep.staticSetSimulationKey(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:timeStepId">Find the entity timeStepId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _timeStepId(Wrap<String> w);

	public String getTimeStepId() {
		return timeStepId;
	}
	public void setTimeStepId(String o) {
		this.timeStepId = PersonStep.staticSetTimeStepId(siteRequest_, o);
	}
	public static String staticSetTimeStepId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PersonStep timeStepIdInit() {
		Wrap<String> timeStepIdWrap = new Wrap<String>().var("timeStepId");
		if(timeStepId == null) {
			_timeStepId(timeStepIdWrap);
			setTimeStepId(timeStepIdWrap.o);
		}
		return (PersonStep)this;
	}

	public static String staticSearchTimeStepId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrTimeStepId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqTimeStepId(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrTimeStepId(siteRequest_, PersonStep.staticSearchTimeStepId(siteRequest_, PersonStep.staticSetTimeStepId(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:time">Find the entity time in Solr</a>
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
		this.time = PersonStep.staticSetTime(siteRequest_, o);
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
	protected PersonStep timeInit() {
		Wrap<BigDecimal> timeWrap = new Wrap<BigDecimal>().var("time");
		if(time == null) {
			_time(timeWrap);
			setTime(timeWrap.o);
		}
		return (PersonStep)this;
	}

	public static Double staticSearchTime(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrTime(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqTime(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrTime(siteRequest_, PersonStep.staticSearchTime(siteRequest_, PersonStep.staticSetTime(siteRequest_, o)));
	}

	public BigDecimal sqlTime() {
		return time;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:x">Find the entity x in Solr</a>
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
		this.x = PersonStep.staticSetX(siteRequest_, o);
	}
	public static Double staticSetX(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Double.parseDouble(o);
		return null;
	}
	protected PersonStep xInit() {
		Wrap<Double> xWrap = new Wrap<Double>().var("x");
		if(x == null) {
			_x(xWrap);
			setX(xWrap.o);
		}
		return (PersonStep)this;
	}

	public static Double staticSearchX(SiteRequestEnUS siteRequest_, Double o) {
		return o;
	}

	public static String staticSearchStrX(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqX(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrX(siteRequest_, PersonStep.staticSearchX(siteRequest_, PersonStep.staticSetX(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:y">Find the entity y in Solr</a>
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
		this.y = PersonStep.staticSetY(siteRequest_, o);
	}
	public static Double staticSetY(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Double.parseDouble(o);
		return null;
	}
	protected PersonStep yInit() {
		Wrap<Double> yWrap = new Wrap<Double>().var("y");
		if(y == null) {
			_y(yWrap);
			setY(yWrap.o);
		}
		return (PersonStep)this;
	}

	public static Double staticSearchY(SiteRequestEnUS siteRequest_, Double o) {
		return o;
	}

	public static String staticSearchStrY(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqY(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrY(siteRequest_, PersonStep.staticSearchY(siteRequest_, PersonStep.staticSetY(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:location">Find the entity location in Solr</a>
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
		this.location = PersonStep.staticSetLocation(siteRequest_, o);
	}
	public static Point staticSetLocation(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
			String[] vals = o.split(",");
			if(vals.length == 2 && NumberUtils.isParsable(vals[0]) && NumberUtils.isParsable(vals[1]))
				return new Point(Double.parseDouble(vals[0]), Double.parseDouble(vals[1]));
		}
		return null;
	}
	protected PersonStep locationInit() {
		Wrap<Point> locationWrap = new Wrap<Point>().var("location");
		if(location == null) {
			_location(locationWrap);
			setLocation(locationWrap.o);
		}
		return (PersonStep)this;
	}

	public static Point staticSearchLocation(SiteRequestEnUS siteRequest_, Point o) {
		return o;
	}

	public static String staticSearchStrLocation(SiteRequestEnUS siteRequest_, Point o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqLocation(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrLocation(siteRequest_, PersonStep.staticSearchLocation(siteRequest_, PersonStep.staticSetLocation(siteRequest_, o)));
	}

	public Point sqlLocation() {
		return location;
	}

	//////////////
	// personId //
	//////////////

	/**	 The entity personId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String personId;

	/**	<br> The entity personId
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:personId">Find the entity personId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _personId(Wrap<String> w);

	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String o) {
		this.personId = PersonStep.staticSetPersonId(siteRequest_, o);
	}
	public static String staticSetPersonId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PersonStep personIdInit() {
		Wrap<String> personIdWrap = new Wrap<String>().var("personId");
		if(personId == null) {
			_personId(personIdWrap);
			setPersonId(personIdWrap.o);
		}
		return (PersonStep)this;
	}

	public static String staticSearchPersonId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPersonId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPersonId(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrPersonId(siteRequest_, PersonStep.staticSearchPersonId(siteRequest_, PersonStep.staticSetPersonId(siteRequest_, o)));
	}

	public String sqlPersonId() {
		return personId;
	}

	////////////////
	// personType //
	////////////////

	/**	 The entity personType
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String personType;

	/**	<br> The entity personType
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:personType">Find the entity personType in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _personType(Wrap<String> w);

	public String getPersonType() {
		return personType;
	}
	public void setPersonType(String o) {
		this.personType = PersonStep.staticSetPersonType(siteRequest_, o);
	}
	public static String staticSetPersonType(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PersonStep personTypeInit() {
		Wrap<String> personTypeWrap = new Wrap<String>().var("personType");
		if(personType == null) {
			_personType(personTypeWrap);
			setPersonType(personTypeWrap.o);
		}
		return (PersonStep)this;
	}

	public static String staticSearchPersonType(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPersonType(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPersonType(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrPersonType(siteRequest_, PersonStep.staticSearchPersonType(siteRequest_, PersonStep.staticSetPersonType(siteRequest_, o)));
	}

	public String sqlPersonType() {
		return personType;
	}

	///////////
	// angle //
	///////////

	/**	 The entity angle
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal angle;

	/**	<br> The entity angle
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:angle">Find the entity angle in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _angle(Wrap<BigDecimal> w);

	public BigDecimal getAngle() {
		return angle;
	}

	public void setAngle(BigDecimal angle) {
		this.angle = angle;
	}
	@JsonIgnore
	public void setAngle(String o) {
		this.angle = PersonStep.staticSetAngle(siteRequest_, o);
	}
	public static BigDecimal staticSetAngle(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setAngle(Double o) {
			this.angle = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setAngle(Integer o) {
			this.angle = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected PersonStep angleInit() {
		Wrap<BigDecimal> angleWrap = new Wrap<BigDecimal>().var("angle");
		if(angle == null) {
			_angle(angleWrap);
			setAngle(angleWrap.o);
		}
		return (PersonStep)this;
	}

	public static Double staticSearchAngle(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrAngle(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAngle(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrAngle(siteRequest_, PersonStep.staticSearchAngle(siteRequest_, PersonStep.staticSetAngle(siteRequest_, o)));
	}

	public BigDecimal sqlAngle() {
		return angle;
	}

	///////////
	// speed //
	///////////

	/**	 The entity speed
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal speed;

	/**	<br> The entity speed
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:speed">Find the entity speed in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _speed(Wrap<BigDecimal> w);

	public BigDecimal getSpeed() {
		return speed;
	}

	public void setSpeed(BigDecimal speed) {
		this.speed = speed;
	}
	@JsonIgnore
	public void setSpeed(String o) {
		this.speed = PersonStep.staticSetSpeed(siteRequest_, o);
	}
	public static BigDecimal staticSetSpeed(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setSpeed(Double o) {
			this.speed = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setSpeed(Integer o) {
			this.speed = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected PersonStep speedInit() {
		Wrap<BigDecimal> speedWrap = new Wrap<BigDecimal>().var("speed");
		if(speed == null) {
			_speed(speedWrap);
			setSpeed(speedWrap.o);
		}
		return (PersonStep)this;
	}

	public static Double staticSearchSpeed(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrSpeed(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSpeed(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrSpeed(siteRequest_, PersonStep.staticSearchSpeed(siteRequest_, PersonStep.staticSetSpeed(siteRequest_, o)));
	}

	public BigDecimal sqlSpeed() {
		return speed;
	}

	/////////
	// pos //
	/////////

	/**	 The entity pos
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal pos;

	/**	<br> The entity pos
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:pos">Find the entity pos in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pos(Wrap<BigDecimal> w);

	public BigDecimal getPos() {
		return pos;
	}

	public void setPos(BigDecimal pos) {
		this.pos = pos;
	}
	@JsonIgnore
	public void setPos(String o) {
		this.pos = PersonStep.staticSetPos(siteRequest_, o);
	}
	public static BigDecimal staticSetPos(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setPos(Double o) {
			this.pos = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setPos(Integer o) {
			this.pos = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected PersonStep posInit() {
		Wrap<BigDecimal> posWrap = new Wrap<BigDecimal>().var("pos");
		if(pos == null) {
			_pos(posWrap);
			setPos(posWrap.o);
		}
		return (PersonStep)this;
	}

	public static Double staticSearchPos(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrPos(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPos(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrPos(siteRequest_, PersonStep.staticSearchPos(siteRequest_, PersonStep.staticSetPos(siteRequest_, o)));
	}

	public BigDecimal sqlPos() {
		return pos;
	}

	///////////
	// slope //
	///////////

	/**	 The entity slope
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal slope;

	/**	<br> The entity slope
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:slope">Find the entity slope in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _slope(Wrap<BigDecimal> w);

	public BigDecimal getSlope() {
		return slope;
	}

	public void setSlope(BigDecimal slope) {
		this.slope = slope;
	}
	@JsonIgnore
	public void setSlope(String o) {
		this.slope = PersonStep.staticSetSlope(siteRequest_, o);
	}
	public static BigDecimal staticSetSlope(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setSlope(Double o) {
			this.slope = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setSlope(Integer o) {
			this.slope = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected PersonStep slopeInit() {
		Wrap<BigDecimal> slopeWrap = new Wrap<BigDecimal>().var("slope");
		if(slope == null) {
			_slope(slopeWrap);
			setSlope(slopeWrap.o);
		}
		return (PersonStep)this;
	}

	public static Double staticSearchSlope(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrSlope(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSlope(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrSlope(siteRequest_, PersonStep.staticSearchSlope(siteRequest_, PersonStep.staticSetSlope(siteRequest_, o)));
	}

	public BigDecimal sqlSlope() {
		return slope;
	}

	///////////////
	// inheritPk //
	///////////////

	/**	 The entity inheritPk
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String inheritPk;

	/**	<br> The entity inheritPk
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:inheritPk">Find the entity inheritPk in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _inheritPk(Wrap<String> w);

	public String getInheritPk() {
		return inheritPk;
	}
	public void setInheritPk(String o) {
		this.inheritPk = PersonStep.staticSetInheritPk(siteRequest_, o);
	}
	public static String staticSetInheritPk(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PersonStep inheritPkInit() {
		Wrap<String> inheritPkWrap = new Wrap<String>().var("inheritPk");
		if(inheritPk == null) {
			_inheritPk(inheritPkWrap);
			setInheritPk(inheritPkWrap.o);
		}
		return (PersonStep)this;
	}

	public static String staticSearchInheritPk(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrInheritPk(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqInheritPk(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrInheritPk(siteRequest_, PersonStep.staticSearchInheritPk(siteRequest_, PersonStep.staticSetInheritPk(siteRequest_, o)));
	}

	public String sqlInheritPk() {
		return inheritPk;
	}

	/////////////
	// created //
	/////////////

	/**	 The entity created
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonDeserialize(using = ComputateZonedDateTimeDeserializer.class)
	@JsonSerialize(using = ComputateZonedDateTimeSerializer.class)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSSV'['VV']'")
	@JsonInclude(Include.NON_NULL)
	protected ZonedDateTime created;

	/**	<br> The entity created
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:created">Find the entity created in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _created(Wrap<ZonedDateTime> w);

	public ZonedDateTime getCreated() {
		return created;
	}

	public void setCreated(ZonedDateTime created) {
		this.created = created;
	}
	@JsonIgnore
	public void setCreated(Instant o) {
		this.created = o == null ? null : ZonedDateTime.from(o).truncatedTo(ChronoUnit.MILLIS);
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	@JsonIgnore
	public void setCreated(String o) {
		this.created = PersonStep.staticSetCreated(siteRequest_, o);
	}
	public static ZonedDateTime staticSetCreated(SiteRequestEnUS siteRequest_, String o) {
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
	public void setCreated(Date o) {
		this.created = o == null ? null : ZonedDateTime.ofInstant(o.toInstant(), ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	protected PersonStep createdInit() {
		Wrap<ZonedDateTime> createdWrap = new Wrap<ZonedDateTime>().var("created");
		if(created == null) {
			_created(createdWrap);
			setCreated(createdWrap.o);
		}
		return (PersonStep)this;
	}

	public static Date staticSearchCreated(SiteRequestEnUS siteRequest_, ZonedDateTime o) {
		return o == null ? null : Date.from(o.toInstant());
	}

	public static String staticSearchStrCreated(SiteRequestEnUS siteRequest_, Date o) {
		return "\"" + DateTimeFormatter.ISO_DATE_TIME.format(o.toInstant().atOffset(ZoneOffset.UTC)) + "\"";
	}

	public static String staticSearchFqCreated(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrCreated(siteRequest_, PersonStep.staticSearchCreated(siteRequest_, PersonStep.staticSetCreated(siteRequest_, o)));
	}

	public OffsetDateTime sqlCreated() {
		return created == null ? null : created.toOffsetDateTime();
	}

	//////////////
	// modified //
	//////////////

	/**	 The entity modified
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonDeserialize(using = ComputateZonedDateTimeDeserializer.class)
	@JsonSerialize(using = ComputateZonedDateTimeSerializer.class)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSSV'['VV']'")
	@JsonInclude(Include.NON_NULL)
	protected ZonedDateTime modified;

	/**	<br> The entity modified
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:modified">Find the entity modified in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _modified(Wrap<ZonedDateTime> w);

	public ZonedDateTime getModified() {
		return modified;
	}

	public void setModified(ZonedDateTime modified) {
		this.modified = modified;
	}
	@JsonIgnore
	public void setModified(Instant o) {
		this.modified = o == null ? null : ZonedDateTime.from(o).truncatedTo(ChronoUnit.MILLIS);
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	@JsonIgnore
	public void setModified(String o) {
		this.modified = PersonStep.staticSetModified(siteRequest_, o);
	}
	public static ZonedDateTime staticSetModified(SiteRequestEnUS siteRequest_, String o) {
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
	public void setModified(Date o) {
		this.modified = o == null ? null : ZonedDateTime.ofInstant(o.toInstant(), ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	protected PersonStep modifiedInit() {
		Wrap<ZonedDateTime> modifiedWrap = new Wrap<ZonedDateTime>().var("modified");
		if(modified == null) {
			_modified(modifiedWrap);
			setModified(modifiedWrap.o);
		}
		return (PersonStep)this;
	}

	public static Date staticSearchModified(SiteRequestEnUS siteRequest_, ZonedDateTime o) {
		return o == null ? null : Date.from(o.toInstant());
	}

	public static String staticSearchStrModified(SiteRequestEnUS siteRequest_, Date o) {
		return "\"" + DateTimeFormatter.ISO_DATE_TIME.format(o.toInstant().atOffset(ZoneOffset.UTC)) + "\"";
	}

	public static String staticSearchFqModified(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrModified(siteRequest_, PersonStep.staticSearchModified(siteRequest_, PersonStep.staticSetModified(siteRequest_, o)));
	}

	//////////////
	// archived //
	//////////////

	/**	 The entity archived
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Boolean archived;

	/**	<br> The entity archived
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:archived">Find the entity archived in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _archived(Wrap<Boolean> w);

	public Boolean getArchived() {
		return archived;
	}

	public void setArchived(Boolean archived) {
		this.archived = archived;
	}
	@JsonIgnore
	public void setArchived(String o) {
		this.archived = PersonStep.staticSetArchived(siteRequest_, o);
	}
	public static Boolean staticSetArchived(SiteRequestEnUS siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected PersonStep archivedInit() {
		Wrap<Boolean> archivedWrap = new Wrap<Boolean>().var("archived");
		if(archived == null) {
			_archived(archivedWrap);
			setArchived(archivedWrap.o);
		}
		return (PersonStep)this;
	}

	public static Boolean staticSearchArchived(SiteRequestEnUS siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrArchived(SiteRequestEnUS siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqArchived(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrArchived(siteRequest_, PersonStep.staticSearchArchived(siteRequest_, PersonStep.staticSetArchived(siteRequest_, o)));
	}

	public Boolean sqlArchived() {
		return archived;
	}

	/////////////
	// deleted //
	/////////////

	/**	 The entity deleted
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Boolean deleted;

	/**	<br> The entity deleted
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:deleted">Find the entity deleted in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _deleted(Wrap<Boolean> w);

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	@JsonIgnore
	public void setDeleted(String o) {
		this.deleted = PersonStep.staticSetDeleted(siteRequest_, o);
	}
	public static Boolean staticSetDeleted(SiteRequestEnUS siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected PersonStep deletedInit() {
		Wrap<Boolean> deletedWrap = new Wrap<Boolean>().var("deleted");
		if(deleted == null) {
			_deleted(deletedWrap);
			setDeleted(deletedWrap.o);
		}
		return (PersonStep)this;
	}

	public static Boolean staticSearchDeleted(SiteRequestEnUS siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrDeleted(SiteRequestEnUS siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDeleted(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrDeleted(siteRequest_, PersonStep.staticSearchDeleted(siteRequest_, PersonStep.staticSetDeleted(siteRequest_, o)));
	}

	public Boolean sqlDeleted() {
		return deleted;
	}

	////////////////////////
	// classCanonicalName //
	////////////////////////

	/**	 The entity classCanonicalName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String classCanonicalName;

	/**	<br> The entity classCanonicalName
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:classCanonicalName">Find the entity classCanonicalName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _classCanonicalName(Wrap<String> w);

	public String getClassCanonicalName() {
		return classCanonicalName;
	}
	public void setClassCanonicalName(String o) {
		this.classCanonicalName = PersonStep.staticSetClassCanonicalName(siteRequest_, o);
	}
	public static String staticSetClassCanonicalName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PersonStep classCanonicalNameInit() {
		Wrap<String> classCanonicalNameWrap = new Wrap<String>().var("classCanonicalName");
		if(classCanonicalName == null) {
			_classCanonicalName(classCanonicalNameWrap);
			setClassCanonicalName(classCanonicalNameWrap.o);
		}
		return (PersonStep)this;
	}

	public static String staticSearchClassCanonicalName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrClassCanonicalName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqClassCanonicalName(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrClassCanonicalName(siteRequest_, PersonStep.staticSearchClassCanonicalName(siteRequest_, PersonStep.staticSetClassCanonicalName(siteRequest_, o)));
	}

	/////////////////////
	// classSimpleName //
	/////////////////////

	/**	 The entity classSimpleName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String classSimpleName;

	/**	<br> The entity classSimpleName
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:classSimpleName">Find the entity classSimpleName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _classSimpleName(Wrap<String> w);

	public String getClassSimpleName() {
		return classSimpleName;
	}
	public void setClassSimpleName(String o) {
		this.classSimpleName = PersonStep.staticSetClassSimpleName(siteRequest_, o);
	}
	public static String staticSetClassSimpleName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PersonStep classSimpleNameInit() {
		Wrap<String> classSimpleNameWrap = new Wrap<String>().var("classSimpleName");
		if(classSimpleName == null) {
			_classSimpleName(classSimpleNameWrap);
			setClassSimpleName(classSimpleNameWrap.o);
		}
		return (PersonStep)this;
	}

	public static String staticSearchClassSimpleName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrClassSimpleName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqClassSimpleName(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrClassSimpleName(siteRequest_, PersonStep.staticSearchClassSimpleName(siteRequest_, PersonStep.staticSetClassSimpleName(siteRequest_, o)));
	}

	/////////////////////////
	// classCanonicalNames //
	/////////////////////////

	/**	 The entity classCanonicalNames
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> classCanonicalNames = new ArrayList<String>();

	/**	<br> The entity classCanonicalNames
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:classCanonicalNames">Find the entity classCanonicalNames in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _classCanonicalNames(List<String> l);

	public List<String> getClassCanonicalNames() {
		return classCanonicalNames;
	}

	public void setClassCanonicalNames(List<String> classCanonicalNames) {
		this.classCanonicalNames = classCanonicalNames;
	}
	public static String staticSetClassCanonicalNames(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public PersonStep addClassCanonicalNames(String...objects) {
		for(String o : objects) {
			addClassCanonicalNames(o);
		}
		return (PersonStep)this;
	}
	public PersonStep addClassCanonicalNames(String o) {
		if(o != null)
			this.classCanonicalNames.add(o);
		return (PersonStep)this;
	}
	@JsonIgnore
	public void setClassCanonicalNames(JsonArray objects) {
		classCanonicalNames.clear();
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addClassCanonicalNames(o);
		}
	}
	protected PersonStep classCanonicalNamesInit() {
		_classCanonicalNames(classCanonicalNames);
		return (PersonStep)this;
	}

	public static String staticSearchClassCanonicalNames(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrClassCanonicalNames(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqClassCanonicalNames(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrClassCanonicalNames(siteRequest_, PersonStep.staticSearchClassCanonicalNames(siteRequest_, PersonStep.staticSetClassCanonicalNames(siteRequest_, o)));
	}

	///////////////
	// sessionId //
	///////////////

	/**	 The entity sessionId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String sessionId;

	/**	<br> The entity sessionId
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:sessionId">Find the entity sessionId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _sessionId(Wrap<String> w);

	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String o) {
		this.sessionId = PersonStep.staticSetSessionId(siteRequest_, o);
	}
	public static String staticSetSessionId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PersonStep sessionIdInit() {
		Wrap<String> sessionIdWrap = new Wrap<String>().var("sessionId");
		if(sessionId == null) {
			_sessionId(sessionIdWrap);
			setSessionId(sessionIdWrap.o);
		}
		return (PersonStep)this;
	}

	public static String staticSearchSessionId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSessionId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSessionId(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrSessionId(siteRequest_, PersonStep.staticSearchSessionId(siteRequest_, PersonStep.staticSetSessionId(siteRequest_, o)));
	}

	public String sqlSessionId() {
		return sessionId;
	}

	/////////////
	// userKey //
	/////////////

	/**	 The entity userKey
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long userKey;

	/**	<br> The entity userKey
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:userKey">Find the entity userKey in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _userKey(Wrap<Long> c);

	public Long getUserKey() {
		return userKey;
	}

	public void setUserKey(Long userKey) {
		this.userKey = userKey;
	}
	@JsonIgnore
	public void setUserKey(String o) {
		this.userKey = PersonStep.staticSetUserKey(siteRequest_, o);
	}
	public static Long staticSetUserKey(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected PersonStep userKeyInit() {
		Wrap<Long> userKeyWrap = new Wrap<Long>().var("userKey");
		if(userKey == null) {
			_userKey(userKeyWrap);
			setUserKey(userKeyWrap.o);
		}
		return (PersonStep)this;
	}

	public static Long staticSearchUserKey(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrUserKey(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUserKey(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrUserKey(siteRequest_, PersonStep.staticSearchUserKey(siteRequest_, PersonStep.staticSetUserKey(siteRequest_, o)));
	}

	public Long sqlUserKey() {
		return userKey;
	}

	///////////
	// saves //
	///////////

	/**	 The entity saves
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> saves = new ArrayList<String>();

	/**	<br> The entity saves
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:saves">Find the entity saves in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _saves(List<String> l);

	public List<String> getSaves() {
		return saves;
	}

	public void setSaves(List<String> saves) {
		this.saves = saves;
	}
	public static String staticSetSaves(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public PersonStep addSaves(String...objects) {
		for(String o : objects) {
			addSaves(o);
		}
		return (PersonStep)this;
	}
	public PersonStep addSaves(String o) {
		if(o != null)
			this.saves.add(o);
		return (PersonStep)this;
	}
	@JsonIgnore
	public void setSaves(JsonArray objects) {
		saves.clear();
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addSaves(o);
		}
	}
	protected PersonStep savesInit() {
		_saves(saves);
		return (PersonStep)this;
	}

	public static String staticSearchSaves(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSaves(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSaves(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrSaves(siteRequest_, PersonStep.staticSearchSaves(siteRequest_, PersonStep.staticSetSaves(siteRequest_, o)));
	}

	/////////////////
	// objectTitle //
	/////////////////

	/**	 The entity objectTitle
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String objectTitle;

	/**	<br> The entity objectTitle
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:objectTitle">Find the entity objectTitle in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _objectTitle(Wrap<String> w);

	public String getObjectTitle() {
		return objectTitle;
	}
	public void setObjectTitle(String o) {
		this.objectTitle = PersonStep.staticSetObjectTitle(siteRequest_, o);
	}
	public static String staticSetObjectTitle(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PersonStep objectTitleInit() {
		Wrap<String> objectTitleWrap = new Wrap<String>().var("objectTitle");
		if(objectTitle == null) {
			_objectTitle(objectTitleWrap);
			setObjectTitle(objectTitleWrap.o);
		}
		return (PersonStep)this;
	}

	public static String staticSearchObjectTitle(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrObjectTitle(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqObjectTitle(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrObjectTitle(siteRequest_, PersonStep.staticSearchObjectTitle(siteRequest_, PersonStep.staticSetObjectTitle(siteRequest_, o)));
	}

	//////////////
	// objectId //
	//////////////

	/**	 The entity objectId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String objectId;

	/**	<br> The entity objectId
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:objectId">Find the entity objectId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _objectId(Wrap<String> w);

	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String o) {
		this.objectId = PersonStep.staticSetObjectId(siteRequest_, o);
	}
	public static String staticSetObjectId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PersonStep objectIdInit() {
		Wrap<String> objectIdWrap = new Wrap<String>().var("objectId");
		if(objectId == null) {
			_objectId(objectIdWrap);
			setObjectId(objectIdWrap.o);
		}
		return (PersonStep)this;
	}

	public static String staticSearchObjectId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrObjectId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqObjectId(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrObjectId(siteRequest_, PersonStep.staticSearchObjectId(siteRequest_, PersonStep.staticSetObjectId(siteRequest_, o)));
	}

	public String sqlObjectId() {
		return objectId;
	}

	///////////////////
	// objectNameVar //
	///////////////////

	/**	 The entity objectNameVar
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String objectNameVar;

	/**	<br> The entity objectNameVar
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:objectNameVar">Find the entity objectNameVar in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _objectNameVar(Wrap<String> w);

	public String getObjectNameVar() {
		return objectNameVar;
	}
	public void setObjectNameVar(String o) {
		this.objectNameVar = PersonStep.staticSetObjectNameVar(siteRequest_, o);
	}
	public static String staticSetObjectNameVar(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PersonStep objectNameVarInit() {
		Wrap<String> objectNameVarWrap = new Wrap<String>().var("objectNameVar");
		if(objectNameVar == null) {
			_objectNameVar(objectNameVarWrap);
			setObjectNameVar(objectNameVarWrap.o);
		}
		return (PersonStep)this;
	}

	public static String staticSearchObjectNameVar(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrObjectNameVar(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqObjectNameVar(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrObjectNameVar(siteRequest_, PersonStep.staticSearchObjectNameVar(siteRequest_, PersonStep.staticSetObjectNameVar(siteRequest_, o)));
	}

	///////////////////
	// objectSuggest //
	///////////////////

	/**	 The entity objectSuggest
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String objectSuggest;

	/**	<br> The entity objectSuggest
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:objectSuggest">Find the entity objectSuggest in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _objectSuggest(Wrap<String> w);

	public String getObjectSuggest() {
		return objectSuggest;
	}
	public void setObjectSuggest(String o) {
		this.objectSuggest = PersonStep.staticSetObjectSuggest(siteRequest_, o);
	}
	public static String staticSetObjectSuggest(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PersonStep objectSuggestInit() {
		Wrap<String> objectSuggestWrap = new Wrap<String>().var("objectSuggest");
		if(objectSuggest == null) {
			_objectSuggest(objectSuggestWrap);
			setObjectSuggest(objectSuggestWrap.o);
		}
		return (PersonStep)this;
	}

	public static String staticSearchObjectSuggest(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrObjectSuggest(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqObjectSuggest(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrObjectSuggest(siteRequest_, PersonStep.staticSearchObjectSuggest(siteRequest_, PersonStep.staticSetObjectSuggest(siteRequest_, o)));
	}

	////////////////
	// objectText //
	////////////////

	/**	 The entity objectText
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String objectText;

	/**	<br> The entity objectText
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:objectText">Find the entity objectText in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _objectText(Wrap<String> w);

	public String getObjectText() {
		return objectText;
	}
	public void setObjectText(String o) {
		this.objectText = PersonStep.staticSetObjectText(siteRequest_, o);
	}
	public static String staticSetObjectText(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PersonStep objectTextInit() {
		Wrap<String> objectTextWrap = new Wrap<String>().var("objectText");
		if(objectText == null) {
			_objectText(objectTextWrap);
			setObjectText(objectTextWrap.o);
		}
		return (PersonStep)this;
	}

	public static String staticSearchObjectText(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrObjectText(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqObjectText(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrObjectText(siteRequest_, PersonStep.staticSearchObjectText(siteRequest_, PersonStep.staticSetObjectText(siteRequest_, o)));
	}

	///////////////
	// pageUrlId //
	///////////////

	/**	 The entity pageUrlId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUrlId;

	/**	<br> The entity pageUrlId
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:pageUrlId">Find the entity pageUrlId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUrlId(Wrap<String> w);

	public String getPageUrlId() {
		return pageUrlId;
	}
	public void setPageUrlId(String o) {
		this.pageUrlId = PersonStep.staticSetPageUrlId(siteRequest_, o);
	}
	public static String staticSetPageUrlId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PersonStep pageUrlIdInit() {
		Wrap<String> pageUrlIdWrap = new Wrap<String>().var("pageUrlId");
		if(pageUrlId == null) {
			_pageUrlId(pageUrlIdWrap);
			setPageUrlId(pageUrlIdWrap.o);
		}
		return (PersonStep)this;
	}

	public static String staticSearchPageUrlId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUrlId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUrlId(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrPageUrlId(siteRequest_, PersonStep.staticSearchPageUrlId(siteRequest_, PersonStep.staticSetPageUrlId(siteRequest_, o)));
	}

	///////////////
	// pageUrlPk //
	///////////////

	/**	 The entity pageUrlPk
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUrlPk;

	/**	<br> The entity pageUrlPk
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:pageUrlPk">Find the entity pageUrlPk in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUrlPk(Wrap<String> w);

	public String getPageUrlPk() {
		return pageUrlPk;
	}
	public void setPageUrlPk(String o) {
		this.pageUrlPk = PersonStep.staticSetPageUrlPk(siteRequest_, o);
	}
	public static String staticSetPageUrlPk(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PersonStep pageUrlPkInit() {
		Wrap<String> pageUrlPkWrap = new Wrap<String>().var("pageUrlPk");
		if(pageUrlPk == null) {
			_pageUrlPk(pageUrlPkWrap);
			setPageUrlPk(pageUrlPkWrap.o);
		}
		return (PersonStep)this;
	}

	public static String staticSearchPageUrlPk(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUrlPk(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUrlPk(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrPageUrlPk(siteRequest_, PersonStep.staticSearchPageUrlPk(siteRequest_, PersonStep.staticSetPageUrlPk(siteRequest_, o)));
	}

	////////////////
	// pageUrlApi //
	////////////////

	/**	 The entity pageUrlApi
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUrlApi;

	/**	<br> The entity pageUrlApi
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:pageUrlApi">Find the entity pageUrlApi in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUrlApi(Wrap<String> w);

	public String getPageUrlApi() {
		return pageUrlApi;
	}
	public void setPageUrlApi(String o) {
		this.pageUrlApi = PersonStep.staticSetPageUrlApi(siteRequest_, o);
	}
	public static String staticSetPageUrlApi(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PersonStep pageUrlApiInit() {
		Wrap<String> pageUrlApiWrap = new Wrap<String>().var("pageUrlApi");
		if(pageUrlApi == null) {
			_pageUrlApi(pageUrlApiWrap);
			setPageUrlApi(pageUrlApiWrap.o);
		}
		return (PersonStep)this;
	}

	public static String staticSearchPageUrlApi(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUrlApi(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUrlApi(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrPageUrlApi(siteRequest_, PersonStep.staticSearchPageUrlApi(siteRequest_, PersonStep.staticSetPageUrlApi(siteRequest_, o)));
	}

	////////
	// id //
	////////

	/**	 The entity id
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String id;

	/**	<br> The entity id
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = PersonStep.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PersonStep idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			setId(idWrap.o);
		}
		return (PersonStep)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrId(siteRequest_, PersonStep.staticSearchId(siteRequest_, PersonStep.staticSetId(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepPersonStep(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepPersonStep();
	}

	public Future<Void> promiseDeepPersonStep() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promisePersonStep(promise2);
		promise2.future().onSuccess(a -> {
			promise.complete();
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promisePersonStep(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				siteRequest_Init();
				promise2.complete();
			} catch(Exception ex) {
				promise2.fail(ex);
			}
			return promise2.future();
		}).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			promiseBeforePromise().onSuccess(promiseBefore -> {
				promise2.complete();
			}).onFailure(ex -> {
				promise2.fail(ex);
			});
			return promise2.future();
		}).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				simulationKeyInit();
				timeStepIdInit();
				timeInit();
				xInit();
				yInit();
				locationInit();
				personIdInit();
				personTypeInit();
				angleInit();
				speedInit();
				posInit();
				slopeInit();
				inheritPkInit();
				createdInit();
				modifiedInit();
				archivedInit();
				deletedInit();
				classCanonicalNameInit();
				classSimpleNameInit();
				classCanonicalNamesInit();
				sessionIdInit();
				userKeyInit();
				savesInit();
				objectTitleInit();
				objectIdInit();
				objectNameVarInit();
				objectSuggestInit();
				objectTextInit();
				pageUrlIdInit();
				pageUrlPkInit();
				pageUrlApiInit();
				idInit();
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

	public Future<Void> promiseDeepForClass(SiteRequestEnUS siteRequest_) {
		return promiseDeepPersonStep(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestPersonStep(SiteRequestEnUS siteRequest_) {
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestPersonStep(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainPersonStep(v);
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
	public Object obtainPersonStep(String var) {
		PersonStep oPersonStep = (PersonStep)this;
		switch(var) {
			case "siteRequest_":
				return oPersonStep.siteRequest_;
			case "promiseBefore":
				return oPersonStep.promiseBefore;
			case "simulationKey":
				return oPersonStep.simulationKey;
			case "timeStepId":
				return oPersonStep.timeStepId;
			case "time":
				return oPersonStep.time;
			case "x":
				return oPersonStep.x;
			case "y":
				return oPersonStep.y;
			case "location":
				return oPersonStep.location;
			case "personId":
				return oPersonStep.personId;
			case "personType":
				return oPersonStep.personType;
			case "angle":
				return oPersonStep.angle;
			case "speed":
				return oPersonStep.speed;
			case "pos":
				return oPersonStep.pos;
			case "slope":
				return oPersonStep.slope;
			case "inheritPk":
				return oPersonStep.inheritPk;
			case "created":
				return oPersonStep.created;
			case "modified":
				return oPersonStep.modified;
			case "archived":
				return oPersonStep.archived;
			case "deleted":
				return oPersonStep.deleted;
			case "classCanonicalName":
				return oPersonStep.classCanonicalName;
			case "classSimpleName":
				return oPersonStep.classSimpleName;
			case "classCanonicalNames":
				return oPersonStep.classCanonicalNames;
			case "sessionId":
				return oPersonStep.sessionId;
			case "userKey":
				return oPersonStep.userKey;
			case "saves":
				return oPersonStep.saves;
			case "objectTitle":
				return oPersonStep.objectTitle;
			case "objectId":
				return oPersonStep.objectId;
			case "objectNameVar":
				return oPersonStep.objectNameVar;
			case "objectSuggest":
				return oPersonStep.objectSuggest;
			case "objectText":
				return oPersonStep.objectText;
			case "pageUrlId":
				return oPersonStep.pageUrlId;
			case "pageUrlPk":
				return oPersonStep.pageUrlPk;
			case "pageUrlApi":
				return oPersonStep.pageUrlApi;
			case "id":
				return oPersonStep.id;
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
				o = relatePersonStep(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relatePersonStep(String var, Object val) {
		PersonStep oPersonStep = (PersonStep)this;
		switch(var) {
			default:
				return null;
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetPersonStep(entityVar,  siteRequest_, o);
	}
	public static Object staticSetPersonStep(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "simulationKey":
			return PersonStep.staticSetSimulationKey(siteRequest_, o);
		case "timeStepId":
			return PersonStep.staticSetTimeStepId(siteRequest_, o);
		case "time":
			return PersonStep.staticSetTime(siteRequest_, o);
		case "x":
			return PersonStep.staticSetX(siteRequest_, o);
		case "y":
			return PersonStep.staticSetY(siteRequest_, o);
		case "location":
			return PersonStep.staticSetLocation(siteRequest_, o);
		case "personId":
			return PersonStep.staticSetPersonId(siteRequest_, o);
		case "personType":
			return PersonStep.staticSetPersonType(siteRequest_, o);
		case "angle":
			return PersonStep.staticSetAngle(siteRequest_, o);
		case "speed":
			return PersonStep.staticSetSpeed(siteRequest_, o);
		case "pos":
			return PersonStep.staticSetPos(siteRequest_, o);
		case "slope":
			return PersonStep.staticSetSlope(siteRequest_, o);
		case "inheritPk":
			return PersonStep.staticSetInheritPk(siteRequest_, o);
		case "created":
			return PersonStep.staticSetCreated(siteRequest_, o);
		case "modified":
			return PersonStep.staticSetModified(siteRequest_, o);
		case "archived":
			return PersonStep.staticSetArchived(siteRequest_, o);
		case "deleted":
			return PersonStep.staticSetDeleted(siteRequest_, o);
		case "classCanonicalName":
			return PersonStep.staticSetClassCanonicalName(siteRequest_, o);
		case "classSimpleName":
			return PersonStep.staticSetClassSimpleName(siteRequest_, o);
		case "classCanonicalNames":
			return PersonStep.staticSetClassCanonicalNames(siteRequest_, o);
		case "sessionId":
			return PersonStep.staticSetSessionId(siteRequest_, o);
		case "userKey":
			return PersonStep.staticSetUserKey(siteRequest_, o);
		case "saves":
			return PersonStep.staticSetSaves(siteRequest_, o);
		case "objectTitle":
			return PersonStep.staticSetObjectTitle(siteRequest_, o);
		case "objectId":
			return PersonStep.staticSetObjectId(siteRequest_, o);
		case "objectNameVar":
			return PersonStep.staticSetObjectNameVar(siteRequest_, o);
		case "objectSuggest":
			return PersonStep.staticSetObjectSuggest(siteRequest_, o);
		case "objectText":
			return PersonStep.staticSetObjectText(siteRequest_, o);
		case "pageUrlId":
			return PersonStep.staticSetPageUrlId(siteRequest_, o);
		case "pageUrlPk":
			return PersonStep.staticSetPageUrlPk(siteRequest_, o);
		case "pageUrlApi":
			return PersonStep.staticSetPageUrlApi(siteRequest_, o);
		case "id":
			return PersonStep.staticSetId(siteRequest_, o);
			default:
				return null;
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchPersonStep(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchPersonStep(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "simulationKey":
			return PersonStep.staticSearchSimulationKey(siteRequest_, (Long)o);
		case "timeStepId":
			return PersonStep.staticSearchTimeStepId(siteRequest_, (String)o);
		case "time":
			return PersonStep.staticSearchTime(siteRequest_, (BigDecimal)o);
		case "x":
			return PersonStep.staticSearchX(siteRequest_, (Double)o);
		case "y":
			return PersonStep.staticSearchY(siteRequest_, (Double)o);
		case "location":
			return PersonStep.staticSearchLocation(siteRequest_, (Point)o);
		case "personId":
			return PersonStep.staticSearchPersonId(siteRequest_, (String)o);
		case "personType":
			return PersonStep.staticSearchPersonType(siteRequest_, (String)o);
		case "angle":
			return PersonStep.staticSearchAngle(siteRequest_, (BigDecimal)o);
		case "speed":
			return PersonStep.staticSearchSpeed(siteRequest_, (BigDecimal)o);
		case "pos":
			return PersonStep.staticSearchPos(siteRequest_, (BigDecimal)o);
		case "slope":
			return PersonStep.staticSearchSlope(siteRequest_, (BigDecimal)o);
		case "inheritPk":
			return PersonStep.staticSearchInheritPk(siteRequest_, (String)o);
		case "created":
			return PersonStep.staticSearchCreated(siteRequest_, (ZonedDateTime)o);
		case "modified":
			return PersonStep.staticSearchModified(siteRequest_, (ZonedDateTime)o);
		case "archived":
			return PersonStep.staticSearchArchived(siteRequest_, (Boolean)o);
		case "deleted":
			return PersonStep.staticSearchDeleted(siteRequest_, (Boolean)o);
		case "classCanonicalName":
			return PersonStep.staticSearchClassCanonicalName(siteRequest_, (String)o);
		case "classSimpleName":
			return PersonStep.staticSearchClassSimpleName(siteRequest_, (String)o);
		case "classCanonicalNames":
			return PersonStep.staticSearchClassCanonicalNames(siteRequest_, (String)o);
		case "sessionId":
			return PersonStep.staticSearchSessionId(siteRequest_, (String)o);
		case "userKey":
			return PersonStep.staticSearchUserKey(siteRequest_, (Long)o);
		case "saves":
			return PersonStep.staticSearchSaves(siteRequest_, (String)o);
		case "objectTitle":
			return PersonStep.staticSearchObjectTitle(siteRequest_, (String)o);
		case "objectId":
			return PersonStep.staticSearchObjectId(siteRequest_, (String)o);
		case "objectNameVar":
			return PersonStep.staticSearchObjectNameVar(siteRequest_, (String)o);
		case "objectSuggest":
			return PersonStep.staticSearchObjectSuggest(siteRequest_, (String)o);
		case "objectText":
			return PersonStep.staticSearchObjectText(siteRequest_, (String)o);
		case "pageUrlId":
			return PersonStep.staticSearchPageUrlId(siteRequest_, (String)o);
		case "pageUrlPk":
			return PersonStep.staticSearchPageUrlPk(siteRequest_, (String)o);
		case "pageUrlApi":
			return PersonStep.staticSearchPageUrlApi(siteRequest_, (String)o);
		case "id":
			return PersonStep.staticSearchId(siteRequest_, (String)o);
			default:
				return null;
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrPersonStep(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrPersonStep(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "simulationKey":
			return PersonStep.staticSearchStrSimulationKey(siteRequest_, (Long)o);
		case "timeStepId":
			return PersonStep.staticSearchStrTimeStepId(siteRequest_, (String)o);
		case "time":
			return PersonStep.staticSearchStrTime(siteRequest_, (Double)o);
		case "x":
			return PersonStep.staticSearchStrX(siteRequest_, (Double)o);
		case "y":
			return PersonStep.staticSearchStrY(siteRequest_, (Double)o);
		case "location":
			return PersonStep.staticSearchStrLocation(siteRequest_, (Point)o);
		case "personId":
			return PersonStep.staticSearchStrPersonId(siteRequest_, (String)o);
		case "personType":
			return PersonStep.staticSearchStrPersonType(siteRequest_, (String)o);
		case "angle":
			return PersonStep.staticSearchStrAngle(siteRequest_, (Double)o);
		case "speed":
			return PersonStep.staticSearchStrSpeed(siteRequest_, (Double)o);
		case "pos":
			return PersonStep.staticSearchStrPos(siteRequest_, (Double)o);
		case "slope":
			return PersonStep.staticSearchStrSlope(siteRequest_, (Double)o);
		case "inheritPk":
			return PersonStep.staticSearchStrInheritPk(siteRequest_, (String)o);
		case "created":
			return PersonStep.staticSearchStrCreated(siteRequest_, (Date)o);
		case "modified":
			return PersonStep.staticSearchStrModified(siteRequest_, (Date)o);
		case "archived":
			return PersonStep.staticSearchStrArchived(siteRequest_, (Boolean)o);
		case "deleted":
			return PersonStep.staticSearchStrDeleted(siteRequest_, (Boolean)o);
		case "classCanonicalName":
			return PersonStep.staticSearchStrClassCanonicalName(siteRequest_, (String)o);
		case "classSimpleName":
			return PersonStep.staticSearchStrClassSimpleName(siteRequest_, (String)o);
		case "classCanonicalNames":
			return PersonStep.staticSearchStrClassCanonicalNames(siteRequest_, (String)o);
		case "sessionId":
			return PersonStep.staticSearchStrSessionId(siteRequest_, (String)o);
		case "userKey":
			return PersonStep.staticSearchStrUserKey(siteRequest_, (Long)o);
		case "saves":
			return PersonStep.staticSearchStrSaves(siteRequest_, (String)o);
		case "objectTitle":
			return PersonStep.staticSearchStrObjectTitle(siteRequest_, (String)o);
		case "objectId":
			return PersonStep.staticSearchStrObjectId(siteRequest_, (String)o);
		case "objectNameVar":
			return PersonStep.staticSearchStrObjectNameVar(siteRequest_, (String)o);
		case "objectSuggest":
			return PersonStep.staticSearchStrObjectSuggest(siteRequest_, (String)o);
		case "objectText":
			return PersonStep.staticSearchStrObjectText(siteRequest_, (String)o);
		case "pageUrlId":
			return PersonStep.staticSearchStrPageUrlId(siteRequest_, (String)o);
		case "pageUrlPk":
			return PersonStep.staticSearchStrPageUrlPk(siteRequest_, (String)o);
		case "pageUrlApi":
			return PersonStep.staticSearchStrPageUrlApi(siteRequest_, (String)o);
		case "id":
			return PersonStep.staticSearchStrId(siteRequest_, (String)o);
			default:
				return null;
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqPersonStep(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqPersonStep(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "simulationKey":
			return PersonStep.staticSearchFqSimulationKey(siteRequest_, o);
		case "timeStepId":
			return PersonStep.staticSearchFqTimeStepId(siteRequest_, o);
		case "time":
			return PersonStep.staticSearchFqTime(siteRequest_, o);
		case "x":
			return PersonStep.staticSearchFqX(siteRequest_, o);
		case "y":
			return PersonStep.staticSearchFqY(siteRequest_, o);
		case "location":
			return PersonStep.staticSearchFqLocation(siteRequest_, o);
		case "personId":
			return PersonStep.staticSearchFqPersonId(siteRequest_, o);
		case "personType":
			return PersonStep.staticSearchFqPersonType(siteRequest_, o);
		case "angle":
			return PersonStep.staticSearchFqAngle(siteRequest_, o);
		case "speed":
			return PersonStep.staticSearchFqSpeed(siteRequest_, o);
		case "pos":
			return PersonStep.staticSearchFqPos(siteRequest_, o);
		case "slope":
			return PersonStep.staticSearchFqSlope(siteRequest_, o);
		case "inheritPk":
			return PersonStep.staticSearchFqInheritPk(siteRequest_, o);
		case "created":
			return PersonStep.staticSearchFqCreated(siteRequest_, o);
		case "modified":
			return PersonStep.staticSearchFqModified(siteRequest_, o);
		case "archived":
			return PersonStep.staticSearchFqArchived(siteRequest_, o);
		case "deleted":
			return PersonStep.staticSearchFqDeleted(siteRequest_, o);
		case "classCanonicalName":
			return PersonStep.staticSearchFqClassCanonicalName(siteRequest_, o);
		case "classSimpleName":
			return PersonStep.staticSearchFqClassSimpleName(siteRequest_, o);
		case "classCanonicalNames":
			return PersonStep.staticSearchFqClassCanonicalNames(siteRequest_, o);
		case "sessionId":
			return PersonStep.staticSearchFqSessionId(siteRequest_, o);
		case "userKey":
			return PersonStep.staticSearchFqUserKey(siteRequest_, o);
		case "saves":
			return PersonStep.staticSearchFqSaves(siteRequest_, o);
		case "objectTitle":
			return PersonStep.staticSearchFqObjectTitle(siteRequest_, o);
		case "objectId":
			return PersonStep.staticSearchFqObjectId(siteRequest_, o);
		case "objectNameVar":
			return PersonStep.staticSearchFqObjectNameVar(siteRequest_, o);
		case "objectSuggest":
			return PersonStep.staticSearchFqObjectSuggest(siteRequest_, o);
		case "objectText":
			return PersonStep.staticSearchFqObjectText(siteRequest_, o);
		case "pageUrlId":
			return PersonStep.staticSearchFqPageUrlId(siteRequest_, o);
		case "pageUrlPk":
			return PersonStep.staticSearchFqPageUrlPk(siteRequest_, o);
		case "pageUrlApi":
			return PersonStep.staticSearchFqPageUrlApi(siteRequest_, o);
		case "id":
			return PersonStep.staticSearchFqId(siteRequest_, o);
			default:
				return null;
		}
	}

	/////////////
	// persist //
	/////////////

	public boolean persistForClass(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		if(val != null) {
			for(String v : vars) {
				if(o == null)
					o = persistPersonStep(v, val);
				else if(o instanceof BaseModel) {
					BaseModel oBaseModel = (BaseModel)o;
					o = oBaseModel.persistForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object persistPersonStep(String var, Object val) {
		switch(var.toLowerCase()) {
			case "simulationkey":
				if(val instanceof Long)
					setSimulationKey((Long)val);
				else if(val instanceof String)
					setSimulationKey((String)val);
				saves.add("simulationKey");
				return val;
			case "timestepid":
				if(val instanceof String)
					setTimeStepId((String)val);
				saves.add("timeStepId");
				return val;
			case "time":
				if(val instanceof String)
					setTime((String)val);
				else if(val instanceof Number)
					setTime(new BigDecimal(((Number)val).doubleValue()));
				saves.add("time");
				return val;
			case "x":
				if(val instanceof Double)
					setX((Double)val);
				else if(val instanceof String)
					setX((String)val);
				saves.add("x");
				return val;
			case "y":
				if(val instanceof Double)
					setY((Double)val);
				else if(val instanceof String)
					setY((String)val);
				saves.add("y");
				return val;
			case "location":
				if(val instanceof String)
					setLocation((String)val);
				else if(val instanceof Point)
					setLocation((Point)val);
				saves.add("location");
				return val;
			case "personid":
				if(val instanceof String)
					setPersonId((String)val);
				saves.add("personId");
				return val;
			case "persontype":
				if(val instanceof String)
					setPersonType((String)val);
				saves.add("personType");
				return val;
			case "angle":
				if(val instanceof String)
					setAngle((String)val);
				else if(val instanceof Number)
					setAngle(new BigDecimal(((Number)val).doubleValue()));
				saves.add("angle");
				return val;
			case "speed":
				if(val instanceof String)
					setSpeed((String)val);
				else if(val instanceof Number)
					setSpeed(new BigDecimal(((Number)val).doubleValue()));
				saves.add("speed");
				return val;
			case "pos":
				if(val instanceof String)
					setPos((String)val);
				else if(val instanceof Number)
					setPos(new BigDecimal(((Number)val).doubleValue()));
				saves.add("pos");
				return val;
			case "slope":
				if(val instanceof String)
					setSlope((String)val);
				else if(val instanceof Number)
					setSlope(new BigDecimal(((Number)val).doubleValue()));
				saves.add("slope");
				return val;
			case "inheritpk":
				if(val instanceof String)
					setInheritPk((String)val);
				saves.add("inheritPk");
				return val;
			case "created":
				if(val instanceof ZonedDateTime)
					setCreated((ZonedDateTime)val);
				else if(val instanceof String)
					setCreated((String)val);
				else if(val instanceof OffsetDateTime)
					setCreated(((OffsetDateTime)val).atZoneSameInstant(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))));
				saves.add("created");
				return val;
			case "archived":
				if(val instanceof Boolean)
					setArchived((Boolean)val);
				else if(val instanceof String)
					setArchived((String)val);
				saves.add("archived");
				return val;
			case "deleted":
				if(val instanceof Boolean)
					setDeleted((Boolean)val);
				else if(val instanceof String)
					setDeleted((String)val);
				saves.add("deleted");
				return val;
			case "sessionid":
				if(val instanceof String)
					setSessionId((String)val);
				saves.add("sessionId");
				return val;
			case "userkey":
				if(val instanceof Long)
					setUserKey((Long)val);
				else if(val instanceof String)
					setUserKey((String)val);
				saves.add("userKey");
				return val;
			case "objectid":
				if(val instanceof String)
					setObjectId((String)val);
				saves.add("objectId");
				return val;
			default:
				return null;
		}
	}

	/////////////
	// populate //
	/////////////

	public void populateForClass(SolrResponse.Doc doc) {
		populatePersonStep(doc);
	}
	public void populatePersonStep(SolrResponse.Doc doc) {
		PersonStep oPersonStep = (PersonStep)this;
		saves = doc.get("saves_docvalues_strings");
		if(saves != null) {
		}
	}

	public void indexPersonStep(JsonObject doc) {
		if(simulationKey != null) {
			doc.put("simulationKey_docvalues_long", simulationKey);
		}
		if(timeStepId != null) {
			doc.put("timeStepId_docvalues_string", timeStepId);
		}
		if(time != null) {
			doc.put("time_docvalues_double", time.doubleValue());
		}
		if(location != null) {
			doc.put("location_docvalues_location", String.format("%s,%s", location.getX(), location.getY()));
		}
		if(personId != null) {
			doc.put("personId_docvalues_string", personId);
		}
		if(personType != null) {
			doc.put("personType_docvalues_string", personType);
		}
		if(angle != null) {
			doc.put("angle_docvalues_double", angle.doubleValue());
		}
		if(speed != null) {
			doc.put("speed_docvalues_double", speed.doubleValue());
		}
		if(pos != null) {
			doc.put("pos_docvalues_double", pos.doubleValue());
		}
		if(slope != null) {
			doc.put("slope_docvalues_double", slope.doubleValue());
		}
		if(inheritPk != null) {
			doc.put("inheritPk_docvalues_string", inheritPk);
		}
		if(created != null) {
			doc.put("created_docvalues_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(ZonedDateTime.ofInstant(created.toInstant(), ZoneId.of("UTC"))));
		}
		if(modified != null) {
			doc.put("modified_docvalues_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(ZonedDateTime.ofInstant(modified.toInstant(), ZoneId.of("UTC"))));
		}
		if(archived != null) {
			doc.put("archived_docvalues_boolean", archived);
		}
		if(deleted != null) {
			doc.put("deleted_docvalues_boolean", deleted);
		}
		if(classCanonicalName != null) {
			doc.put("classCanonicalName_docvalues_string", classCanonicalName);
		}
		if(classSimpleName != null) {
			doc.put("classSimpleName_docvalues_string", classSimpleName);
		}
		if(classCanonicalNames != null) {
			JsonArray l = new JsonArray();
			doc.put("classCanonicalNames_docvalues_strings", l);
			for(String o : classCanonicalNames) {
				l.add(o);
			}
		}
		if(sessionId != null) {
			doc.put("sessionId_docvalues_string", sessionId);
		}
		if(userKey != null) {
			doc.put("userKey_docvalues_long", userKey);
		}
		if(saves != null) {
			JsonArray l = new JsonArray();
			doc.put("saves_docvalues_strings", l);
			for(String o : saves) {
				l.add(o);
			}
		}
		if(objectTitle != null) {
			doc.put("objectTitle_docvalues_string", objectTitle);
		}
		if(objectId != null) {
			doc.put("objectId_docvalues_string", objectId);
		}
		if(objectSuggest != null) {
			doc.put("objectSuggest_suggested", objectSuggest);
		}
		if(objectText != null) {
			doc.put("objectText_text_enUS", objectText.toString());
		}
		if(pageUrlId != null) {
			doc.put("pageUrlId_docvalues_string", pageUrlId);
		}
		if(pageUrlPk != null) {
			doc.put("pageUrlPk_docvalues_string", pageUrlPk);
		}
		if(pageUrlApi != null) {
			doc.put("pageUrlApi_docvalues_string", pageUrlApi);
		}
		if(id != null) {
			doc.put("id", id);
		}
	}

	public static String varStoredPersonStep(String entityVar) {
		switch(entityVar) {
			case "simulationKey":
				return "simulationKey_docvalues_long";
			case "timeStepId":
				return "timeStepId_docvalues_string";
			case "time":
				return "time_docvalues_double";
			case "location":
				return "location_docvalues_location";
			case "personId":
				return "personId_docvalues_string";
			case "personType":
				return "personType_docvalues_string";
			case "angle":
				return "angle_docvalues_double";
			case "speed":
				return "speed_docvalues_double";
			case "pos":
				return "pos_docvalues_double";
			case "slope":
				return "slope_docvalues_double";
			case "inheritPk":
				return "inheritPk_docvalues_string";
			case "created":
				return "created_docvalues_date";
			case "modified":
				return "modified_docvalues_date";
			case "archived":
				return "archived_docvalues_boolean";
			case "deleted":
				return "deleted_docvalues_boolean";
			case "classCanonicalName":
				return "classCanonicalName_docvalues_string";
			case "classSimpleName":
				return "classSimpleName_docvalues_string";
			case "classCanonicalNames":
				return "classCanonicalNames_docvalues_strings";
			case "sessionId":
				return "sessionId_docvalues_string";
			case "userKey":
				return "userKey_docvalues_long";
			case "saves":
				return "saves_docvalues_strings";
			case "objectTitle":
				return "objectTitle_docvalues_string";
			case "objectId":
				return "objectId_docvalues_string";
			case "pageUrlId":
				return "pageUrlId_docvalues_string";
			case "pageUrlPk":
				return "pageUrlPk_docvalues_string";
			case "pageUrlApi":
				return "pageUrlApi_docvalues_string";
			default:
				return null;
		}
	}

	public static String varIndexedPersonStep(String entityVar) {
		switch(entityVar) {
			case "simulationKey":
				return "simulationKey_docvalues_long";
			case "timeStepId":
				return "timeStepId_docvalues_string";
			case "time":
				return "time_docvalues_double";
			case "location":
				return "location_docvalues_location";
			case "personId":
				return "personId_docvalues_string";
			case "personType":
				return "personType_docvalues_string";
			case "angle":
				return "angle_docvalues_double";
			case "speed":
				return "speed_docvalues_double";
			case "pos":
				return "pos_docvalues_double";
			case "slope":
				return "slope_docvalues_double";
			case "inheritPk":
				return "inheritPk_docvalues_string";
			case "created":
				return "created_docvalues_date";
			case "modified":
				return "modified_docvalues_date";
			case "archived":
				return "archived_docvalues_boolean";
			case "deleted":
				return "deleted_docvalues_boolean";
			case "classCanonicalName":
				return "classCanonicalName_docvalues_string";
			case "classSimpleName":
				return "classSimpleName_docvalues_string";
			case "classCanonicalNames":
				return "classCanonicalNames_docvalues_strings";
			case "sessionId":
				return "sessionId_docvalues_string";
			case "userKey":
				return "userKey_docvalues_long";
			case "saves":
				return "saves_docvalues_strings";
			case "objectTitle":
				return "objectTitle_docvalues_string";
			case "objectId":
				return "objectId_docvalues_string";
			case "objectSuggest":
				return "objectSuggest_suggested";
			case "objectText":
				return "objectText_text_enUS";
			case "pageUrlId":
				return "pageUrlId_docvalues_string";
			case "pageUrlPk":
				return "pageUrlPk_docvalues_string";
			case "pageUrlApi":
				return "pageUrlApi_docvalues_string";
			case "id":
				return "id";
			default:
				return null;
		}
	}

	public static String searchVarPersonStep(String searchVar) {
		switch(searchVar) {
			case "simulationKey_docvalues_long":
				return "simulationKey";
			case "timeStepId_docvalues_string":
				return "timeStepId";
			case "time_docvalues_double":
				return "time";
			case "location_docvalues_location":
				return "location";
			case "personId_docvalues_string":
				return "personId";
			case "personType_docvalues_string":
				return "personType";
			case "angle_docvalues_double":
				return "angle";
			case "speed_docvalues_double":
				return "speed";
			case "pos_docvalues_double":
				return "pos";
			case "slope_docvalues_double":
				return "slope";
			case "inheritPk_docvalues_string":
				return "inheritPk";
			case "created_docvalues_date":
				return "created";
			case "modified_docvalues_date":
				return "modified";
			case "archived_docvalues_boolean":
				return "archived";
			case "deleted_docvalues_boolean":
				return "deleted";
			case "classCanonicalName_docvalues_string":
				return "classCanonicalName";
			case "classSimpleName_docvalues_string":
				return "classSimpleName";
			case "classCanonicalNames_docvalues_strings":
				return "classCanonicalNames";
			case "sessionId_docvalues_string":
				return "sessionId";
			case "userKey_docvalues_long":
				return "userKey";
			case "saves_docvalues_strings":
				return "saves";
			case "objectTitle_docvalues_string":
				return "objectTitle";
			case "objectId_docvalues_string":
				return "objectId";
			case "objectSuggest_suggested":
				return "objectSuggest";
			case "objectText_text_enUS":
				return "objectText";
			case "pageUrlId_docvalues_string":
				return "pageUrlId";
			case "pageUrlPk_docvalues_string":
				return "pageUrlPk";
			case "pageUrlApi_docvalues_string":
				return "pageUrlApi";
			case "id":
				return "id";
			default:
				return null;
		}
	}

	public static String varSearchPersonStep(String entityVar) {
		switch(entityVar) {
			case "objectText":
				return "objectText_text_enUS";
			case "objectSuggest":
				return "objectSuggest_suggested";
			default:
				return null;
		}
	}

	public static String varSuggestedPersonStep(String entityVar) {
		switch(entityVar) {
			case "objectSuggest":
				return "objectSuggest_suggested";
			default:
				return null;
		}
	}

	/////////////
	// store //
	/////////////

	public void storeForClass(SolrResponse.Doc doc) {
		storePersonStep(doc);
	}
	public void storePersonStep(SolrResponse.Doc doc) {
		PersonStep oPersonStep = (PersonStep)this;

		oPersonStep.setSimulationKey(Optional.ofNullable(doc.get("simulationKey_docvalues_long")).map(v -> v.toString()).orElse(null));
		oPersonStep.setTimeStepId(Optional.ofNullable(doc.get("timeStepId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oPersonStep.setTime(Optional.ofNullable(doc.get("time_docvalues_double")).map(v -> v.toString()).orElse(null));
		oPersonStep.setLocation(Optional.ofNullable(doc.get("location_docvalues_location")).map(v -> v.toString()).orElse(null));
		oPersonStep.setPersonId(Optional.ofNullable(doc.get("personId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oPersonStep.setPersonType(Optional.ofNullable(doc.get("personType_docvalues_string")).map(v -> v.toString()).orElse(null));
		oPersonStep.setAngle(Optional.ofNullable(doc.get("angle_docvalues_double")).map(v -> v.toString()).orElse(null));
		oPersonStep.setSpeed(Optional.ofNullable(doc.get("speed_docvalues_double")).map(v -> v.toString()).orElse(null));
		oPersonStep.setPos(Optional.ofNullable(doc.get("pos_docvalues_double")).map(v -> v.toString()).orElse(null));
		oPersonStep.setSlope(Optional.ofNullable(doc.get("slope_docvalues_double")).map(v -> v.toString()).orElse(null));
		oPersonStep.setInheritPk(Optional.ofNullable(doc.get("inheritPk_docvalues_string")).map(v -> v.toString()).orElse(null));
		oPersonStep.setCreated(Optional.ofNullable(doc.get("created_docvalues_date")).map(v -> v.toString()).orElse(null));
		oPersonStep.setModified(Optional.ofNullable(doc.get("modified_docvalues_date")).map(v -> v.toString()).orElse(null));
		oPersonStep.setArchived(Optional.ofNullable(doc.get("archived_docvalues_boolean")).map(v -> v.toString()).orElse(null));
		oPersonStep.setDeleted(Optional.ofNullable(doc.get("deleted_docvalues_boolean")).map(v -> v.toString()).orElse(null));
		oPersonStep.setClassCanonicalName(Optional.ofNullable(doc.get("classCanonicalName_docvalues_string")).map(v -> v.toString()).orElse(null));
		oPersonStep.setClassSimpleName(Optional.ofNullable(doc.get("classSimpleName_docvalues_string")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("classCanonicalNames_docvalues_strings")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oPersonStep.addClassCanonicalNames(v.toString());
		});
		oPersonStep.setSessionId(Optional.ofNullable(doc.get("sessionId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oPersonStep.setUserKey(Optional.ofNullable(doc.get("userKey_docvalues_long")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("saves_docvalues_strings")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oPersonStep.addSaves(v.toString());
		});
		oPersonStep.setObjectTitle(Optional.ofNullable(doc.get("objectTitle_docvalues_string")).map(v -> v.toString()).orElse(null));
		oPersonStep.setObjectId(Optional.ofNullable(doc.get("objectId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oPersonStep.setObjectSuggest(Optional.ofNullable(doc.get("objectSuggest_suggested")).map(v -> v.toString()).orElse(null));
		oPersonStep.setObjectText(Optional.ofNullable(doc.get("objectText_indexedstored_string")).map(v -> v.toString()).orElse(null));
		oPersonStep.setPageUrlId(Optional.ofNullable(doc.get("pageUrlId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oPersonStep.setPageUrlPk(Optional.ofNullable(doc.get("pageUrlPk_docvalues_string")).map(v -> v.toString()).orElse(null));
		oPersonStep.setPageUrlApi(Optional.ofNullable(doc.get("pageUrlApi_docvalues_string")).map(v -> v.toString()).orElse(null));
		String id = (String)doc.get("id");
		oPersonStep.setId(id);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestPersonStep() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof PersonStep) {
			PersonStep original = (PersonStep)o;
			if(!Objects.equals(simulationKey, original.getSimulationKey()))
				apiRequest.addVars("simulationKey");
			if(!Objects.equals(timeStepId, original.getTimeStepId()))
				apiRequest.addVars("timeStepId");
			if(!Objects.equals(time, original.getTime()))
				apiRequest.addVars("time");
			if(!Objects.equals(x, original.getX()))
				apiRequest.addVars("x");
			if(!Objects.equals(y, original.getY()))
				apiRequest.addVars("y");
			if(!Objects.equals(location, original.getLocation()))
				apiRequest.addVars("location");
			if(!Objects.equals(personId, original.getPersonId()))
				apiRequest.addVars("personId");
			if(!Objects.equals(personType, original.getPersonType()))
				apiRequest.addVars("personType");
			if(!Objects.equals(angle, original.getAngle()))
				apiRequest.addVars("angle");
			if(!Objects.equals(speed, original.getSpeed()))
				apiRequest.addVars("speed");
			if(!Objects.equals(pos, original.getPos()))
				apiRequest.addVars("pos");
			if(!Objects.equals(slope, original.getSlope()))
				apiRequest.addVars("slope");
			if(!Objects.equals(inheritPk, original.getInheritPk()))
				apiRequest.addVars("inheritPk");
			if(!Objects.equals(created, original.getCreated()))
				apiRequest.addVars("created");
			if(!Objects.equals(modified, original.getModified()))
				apiRequest.addVars("modified");
			if(!Objects.equals(archived, original.getArchived()))
				apiRequest.addVars("archived");
			if(!Objects.equals(deleted, original.getDeleted()))
				apiRequest.addVars("deleted");
			if(!Objects.equals(classCanonicalName, original.getClassCanonicalName()))
				apiRequest.addVars("classCanonicalName");
			if(!Objects.equals(classSimpleName, original.getClassSimpleName()))
				apiRequest.addVars("classSimpleName");
			if(!Objects.equals(classCanonicalNames, original.getClassCanonicalNames()))
				apiRequest.addVars("classCanonicalNames");
			if(!Objects.equals(sessionId, original.getSessionId()))
				apiRequest.addVars("sessionId");
			if(!Objects.equals(userKey, original.getUserKey()))
				apiRequest.addVars("userKey");
			if(!Objects.equals(saves, original.getSaves()))
				apiRequest.addVars("saves");
			if(!Objects.equals(objectTitle, original.getObjectTitle()))
				apiRequest.addVars("objectTitle");
			if(!Objects.equals(objectId, original.getObjectId()))
				apiRequest.addVars("objectId");
			if(!Objects.equals(objectSuggest, original.getObjectSuggest()))
				apiRequest.addVars("objectSuggest");
			if(!Objects.equals(objectText, original.getObjectText()))
				apiRequest.addVars("objectText");
			if(!Objects.equals(pageUrlId, original.getPageUrlId()))
				apiRequest.addVars("pageUrlId");
			if(!Objects.equals(pageUrlPk, original.getPageUrlPk()))
				apiRequest.addVars("pageUrlPk");
			if(!Objects.equals(pageUrlApi, original.getPageUrlApi()))
				apiRequest.addVars("pageUrlApi");
			if(!Objects.equals(id, original.getId()))
				apiRequest.addVars("id");
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Optional.ofNullable(simulationKey).map(v -> "simulationKey: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(timeStepId).map(v -> "timeStepId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(time).map(v -> "time: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(x).map(v -> "x: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(y).map(v -> "y: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(location).map(v -> "location: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(personId).map(v -> "personId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(personType).map(v -> "personType: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(angle).map(v -> "angle: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(speed).map(v -> "speed: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pos).map(v -> "pos: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(slope).map(v -> "slope: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(inheritPk).map(v -> "inheritPk: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(created).map(v -> "created: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(modified).map(v -> "modified: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(archived).map(v -> "archived: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(deleted).map(v -> "deleted: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(classCanonicalName).map(v -> "classCanonicalName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(classSimpleName).map(v -> "classSimpleName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(classCanonicalNames).map(v -> "classCanonicalNames: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(sessionId).map(v -> "sessionId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(userKey).map(v -> "userKey: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(saves).map(v -> "saves: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(objectTitle).map(v -> "objectTitle: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(objectId).map(v -> "objectId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(objectSuggest).map(v -> "objectSuggest: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(objectText).map(v -> "objectText: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(pageUrlId).map(v -> "pageUrlId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(pageUrlPk).map(v -> "pageUrlPk: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(pageUrlApi).map(v -> "pageUrlApi: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(id).map(v -> "id: \"" + v + "\"\n" ).orElse(""));
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "PersonStep";
	public static final String VAR_siteRequest_ = "siteRequest_";
	public static final String VAR_promiseBefore = "promiseBefore";
	public static final String VAR_simulationKey = "simulationKey";
	public static final String VAR_timeStepId = "timeStepId";
	public static final String VAR_time = "time";
	public static final String VAR_x = "x";
	public static final String VAR_y = "y";
	public static final String VAR_location = "location";
	public static final String VAR_personId = "personId";
	public static final String VAR_personType = "personType";
	public static final String VAR_angle = "angle";
	public static final String VAR_speed = "speed";
	public static final String VAR_pos = "pos";
	public static final String VAR_slope = "slope";
	public static final String VAR_inheritPk = "inheritPk";
	public static final String VAR_created = "created";
	public static final String VAR_modified = "modified";
	public static final String VAR_archived = "archived";
	public static final String VAR_deleted = "deleted";
	public static final String VAR_classCanonicalName = "classCanonicalName";
	public static final String VAR_classSimpleName = "classSimpleName";
	public static final String VAR_classCanonicalNames = "classCanonicalNames";
	public static final String VAR_sessionId = "sessionId";
	public static final String VAR_userKey = "userKey";
	public static final String VAR_saves = "saves";
	public static final String VAR_objectTitle = "objectTitle";
	public static final String VAR_objectId = "objectId";
	public static final String VAR_objectNameVar = "objectNameVar";
	public static final String VAR_objectSuggest = "objectSuggest";
	public static final String VAR_objectText = "objectText";
	public static final String VAR_pageUrlId = "pageUrlId";
	public static final String VAR_pageUrlPk = "pageUrlPk";
	public static final String VAR_pageUrlApi = "pageUrlApi";
	public static final String VAR_id = "id";

	public static List<String> varsQForClass() {
		return PersonStep.varsQPersonStep(new ArrayList<String>());
	}
	public static List<String> varsQPersonStep(List<String> vars) {
		vars.add(VAR_objectSuggest);
		vars.add(VAR_objectText);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return PersonStep.varsFqPersonStep(new ArrayList<String>());
	}
	public static List<String> varsFqPersonStep(List<String> vars) {
		vars.add(VAR_simulationKey);
		vars.add(VAR_timeStepId);
		vars.add(VAR_time);
		vars.add(VAR_location);
		vars.add(VAR_personId);
		vars.add(VAR_personType);
		vars.add(VAR_angle);
		vars.add(VAR_speed);
		vars.add(VAR_pos);
		vars.add(VAR_slope);
		vars.add(VAR_created);
		vars.add(VAR_modified);
		vars.add(VAR_classSimpleName);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return PersonStep.varsRangePersonStep(new ArrayList<String>());
	}
	public static List<String> varsRangePersonStep(List<String> vars) {
		vars.add(VAR_simulationKey);
		vars.add(VAR_time);
		vars.add(VAR_location);
		vars.add(VAR_angle);
		vars.add(VAR_speed);
		vars.add(VAR_pos);
		vars.add(VAR_slope);
		vars.add(VAR_created);
		vars.add(VAR_modified);
		return vars;
	}

	public static final String DISPLAY_NAME_siteRequest_ = "";
	public static final String DISPLAY_NAME_promiseBefore = "";
	public static final String DISPLAY_NAME_simulationKey = "Simulation";
	public static final String DISPLAY_NAME_timeStepId = "Time Step";
	public static final String DISPLAY_NAME_time = "Time in seconds";
	public static final String DISPLAY_NAME_x = "";
	public static final String DISPLAY_NAME_y = "";
	public static final String DISPLAY_NAME_location = "location";
	public static final String DISPLAY_NAME_personId = "person ID";
	public static final String DISPLAY_NAME_personType = "person type";
	public static final String DISPLAY_NAME_angle = "Angle in degrees";
	public static final String DISPLAY_NAME_speed = "Speed";
	public static final String DISPLAY_NAME_pos = "Position";
	public static final String DISPLAY_NAME_slope = "Slope";
	public static final String DISPLAY_NAME_inheritPk = "";
	public static final String DISPLAY_NAME_created = "created";
	public static final String DISPLAY_NAME_modified = "modified";
	public static final String DISPLAY_NAME_archived = "archived";
	public static final String DISPLAY_NAME_deleted = "deleted";
	public static final String DISPLAY_NAME_classCanonicalName = "";
	public static final String DISPLAY_NAME_classSimpleName = "object type";
	public static final String DISPLAY_NAME_classCanonicalNames = "";
	public static final String DISPLAY_NAME_sessionId = "";
	public static final String DISPLAY_NAME_userKey = "";
	public static final String DISPLAY_NAME_saves = "";
	public static final String DISPLAY_NAME_objectTitle = "";
	public static final String DISPLAY_NAME_objectId = "ID";
	public static final String DISPLAY_NAME_objectNameVar = "";
	public static final String DISPLAY_NAME_objectSuggest = "autosuggest";
	public static final String DISPLAY_NAME_objectText = "text";
	public static final String DISPLAY_NAME_pageUrlId = "";
	public static final String DISPLAY_NAME_pageUrlPk = "";
	public static final String DISPLAY_NAME_pageUrlApi = "";
	public static final String DISPLAY_NAME_id = "";

	public static String displayNameForClass(String var) {
		return PersonStep.displayNamePersonStep(var);
	}
	public static String displayNamePersonStep(String var) {
		switch(var) {
		case VAR_siteRequest_:
			return DISPLAY_NAME_siteRequest_;
		case VAR_promiseBefore:
			return DISPLAY_NAME_promiseBefore;
		case VAR_simulationKey:
			return DISPLAY_NAME_simulationKey;
		case VAR_timeStepId:
			return DISPLAY_NAME_timeStepId;
		case VAR_time:
			return DISPLAY_NAME_time;
		case VAR_x:
			return DISPLAY_NAME_x;
		case VAR_y:
			return DISPLAY_NAME_y;
		case VAR_location:
			return DISPLAY_NAME_location;
		case VAR_personId:
			return DISPLAY_NAME_personId;
		case VAR_personType:
			return DISPLAY_NAME_personType;
		case VAR_angle:
			return DISPLAY_NAME_angle;
		case VAR_speed:
			return DISPLAY_NAME_speed;
		case VAR_pos:
			return DISPLAY_NAME_pos;
		case VAR_slope:
			return DISPLAY_NAME_slope;
		case VAR_inheritPk:
			return DISPLAY_NAME_inheritPk;
		case VAR_created:
			return DISPLAY_NAME_created;
		case VAR_modified:
			return DISPLAY_NAME_modified;
		case VAR_archived:
			return DISPLAY_NAME_archived;
		case VAR_deleted:
			return DISPLAY_NAME_deleted;
		case VAR_classCanonicalName:
			return DISPLAY_NAME_classCanonicalName;
		case VAR_classSimpleName:
			return DISPLAY_NAME_classSimpleName;
		case VAR_classCanonicalNames:
			return DISPLAY_NAME_classCanonicalNames;
		case VAR_sessionId:
			return DISPLAY_NAME_sessionId;
		case VAR_userKey:
			return DISPLAY_NAME_userKey;
		case VAR_saves:
			return DISPLAY_NAME_saves;
		case VAR_objectTitle:
			return DISPLAY_NAME_objectTitle;
		case VAR_objectId:
			return DISPLAY_NAME_objectId;
		case VAR_objectNameVar:
			return DISPLAY_NAME_objectNameVar;
		case VAR_objectSuggest:
			return DISPLAY_NAME_objectSuggest;
		case VAR_objectText:
			return DISPLAY_NAME_objectText;
		case VAR_pageUrlId:
			return DISPLAY_NAME_pageUrlId;
		case VAR_pageUrlPk:
			return DISPLAY_NAME_pageUrlPk;
		case VAR_pageUrlApi:
			return DISPLAY_NAME_pageUrlApi;
		case VAR_id:
			return DISPLAY_NAME_id;
		default:
			return null;
		}
	}

	public static String descriptionPersonStep(String var) {
		switch(var) {
		case VAR_siteRequest_:
			return "The current request object";
		case VAR_promiseBefore:
			return "An asynchronous method for searching for a computer related to this message";
		case VAR_simulationKey:
			return "The simulation key. ";
		case VAR_timeStepId:
			return "The time step ID. ";
		case VAR_time:
			return "The time in seconds. ";
		case VAR_inheritPk:
			return "An optional inherited primary key from a legacy system for this object in the database";
		case VAR_created:
			return "A created timestamp for this record in the database";
		case VAR_modified:
			return "A modified timestamp for this record in the database";
		case VAR_archived:
			return "For archiving this record";
		case VAR_deleted:
			return "For deleting this record";
		case VAR_classCanonicalName:
			return "the canonical name of this Java class";
		case VAR_classSimpleName:
			return "The simple name of this Java class";
		case VAR_classCanonicalNames:
			return "All the inherited canonical names of this Java class";
		case VAR_sessionId:
			return "The session ID of the user that created this object";
		case VAR_userKey:
			return "The primary key of the user that created this record";
		case VAR_saves:
			return "A list of fields that are saved for this record in the database";
		case VAR_objectTitle:
			return "The title of this object";
		case VAR_objectId:
			return "A URL friendly unique ID for this object";
		case VAR_objectNameVar:
			return "The var that identifies this type of object in the API";
		case VAR_objectSuggest:
			return "The indexed field in the search engine for this record while using autosuggest";
		case VAR_objectText:
			return "The full text search field in the search engine for this record while using autosuggest";
		case VAR_pageUrlId:
			return "The link by name for this object in the UI";
		case VAR_pageUrlPk:
			return "The link by primary key for this object in the UI";
		case VAR_pageUrlApi:
			return "The link to this object in the API";
		case VAR_id:
			return "The unique key for this record in the search engine";
			default:
				return null;
		}
	}

	public static String classSimpleNamePersonStep(String var) {
		switch(var) {
		case VAR_siteRequest_:
			return "SiteRequestEnUS";
		case VAR_promiseBefore:
			return "Void";
		case VAR_simulationKey:
			return "Long";
		case VAR_timeStepId:
			return "String";
		case VAR_time:
			return "BigDecimal";
		case VAR_x:
			return "Double";
		case VAR_y:
			return "Double";
		case VAR_location:
			return "Point";
		case VAR_personId:
			return "String";
		case VAR_personType:
			return "String";
		case VAR_angle:
			return "BigDecimal";
		case VAR_speed:
			return "BigDecimal";
		case VAR_pos:
			return "BigDecimal";
		case VAR_slope:
			return "BigDecimal";
		case VAR_inheritPk:
			return "String";
		case VAR_created:
			return "ZonedDateTime";
		case VAR_modified:
			return "ZonedDateTime";
		case VAR_archived:
			return "Boolean";
		case VAR_deleted:
			return "Boolean";
		case VAR_classCanonicalName:
			return "String";
		case VAR_classSimpleName:
			return "String";
		case VAR_classCanonicalNames:
			return "List";
		case VAR_sessionId:
			return "String";
		case VAR_userKey:
			return "Long";
		case VAR_saves:
			return "List";
		case VAR_objectTitle:
			return "String";
		case VAR_objectId:
			return "String";
		case VAR_objectNameVar:
			return "String";
		case VAR_objectSuggest:
			return "String";
		case VAR_objectText:
			return "String";
		case VAR_pageUrlId:
			return "String";
		case VAR_pageUrlPk:
			return "String";
		case VAR_pageUrlApi:
			return "String";
		case VAR_id:
			return "String";
			default:
				return null;
		}
	}

	public static Integer htmlColumnPersonStep(String var) {
		switch(var) {
		case VAR_created:
			return 1;
		case VAR_objectTitle:
			return 2;
			default:
				return null;
		}
	}

	public static Integer htmlRowPersonStep(String var) {
		switch(var) {
		case VAR_simulationKey:
			return 3;
		case VAR_timeStepId:
			return 3;
		case VAR_time:
			return 4;
		case VAR_location:
			return 4;
		case VAR_personId:
			return 4;
		case VAR_personType:
			return 4;
		case VAR_angle:
			return 5;
		case VAR_speed:
			return 5;
		case VAR_pos:
			return 5;
		case VAR_slope:
			return 5;
		case VAR_created:
			return 1;
		case VAR_modified:
			return 1;
		case VAR_archived:
			return 2;
		case VAR_deleted:
			return 2;
		case VAR_objectId:
			return 1;
			default:
				return null;
		}
	}

	public static Integer htmlCellPersonStep(String var) {
		switch(var) {
		case VAR_simulationKey:
			return 1;
		case VAR_timeStepId:
			return 2;
		case VAR_time:
			return 1;
		case VAR_location:
			return 2;
		case VAR_personId:
			return 3;
		case VAR_personType:
			return 4;
		case VAR_angle:
			return 1;
		case VAR_speed:
			return 2;
		case VAR_pos:
			return 3;
		case VAR_slope:
			return 4;
		case VAR_created:
			return 2;
		case VAR_modified:
			return 3;
		case VAR_archived:
			return 1;
		case VAR_deleted:
			return 2;
		case VAR_objectId:
			return 4;
			default:
				return null;
		}
	}

	public static Integer lengthMinPersonStep(String var) {
		switch(var) {
			default:
				return null;
		}
	}

	public static Integer lengthMaxPersonStep(String var) {
		switch(var) {
			default:
				return null;
		}
	}

	public static Integer maxPersonStep(String var) {
		switch(var) {
			default:
				return null;
		}
	}

	public static Integer minPersonStep(String var) {
		switch(var) {
			default:
				return null;
		}
	}
}
