package org.computate.smartvillageview.enus.model.system.event;

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
import java.lang.Object;
import java.lang.Void;
import java.lang.String;
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
import java.lang.Integer;
import java.lang.Boolean;
import io.vertx.core.json.JsonArray;
import java.lang.Long;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;
import io.vertx.core.json.JsonObject;

/**	
<ol>
0<h3>Suggestions that can generate more code for you: </h3></ol>
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class SystemEventGen into the class SystemEvent. 
 * </li><li>You can add a class comment "Rows: 100" if you wish the SystemEvent API to return more or less than 10 records by default. 
 * In this case, the API will return 100 records from the API instead of 10 by default. 
 * Each API has built in pagination of the search records to ensure a user can query all the data a page at a time without running the application out of memory. 
 * </li><li>You can add a class comment "Model: true" if you wish to persist these SystemEvent objects in a relational PostgreSQL database transactionally in the RESTful API. 
 * The code to persist and query the SystemEventGen data in the database will then be automatically generated. 
 * </li>
 * <h3>About the SystemEvent class and it's generated class SystemEventGen&lt;Object&gt;: </h3>extends SystemEventGen
 * <p>
 * This Java class extends a generated Java class SystemEventGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEvent">Find the class SystemEvent in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends SystemEventGen<Object>
 * <p>This <code>class SystemEvent extends SystemEventGen&lt;Object&gt;</code>, which means it extends a newly generated SystemEventGen. 
 * The generated <code>class SystemEventGen extends Object</code> which means that SystemEvent extends SystemEventGen which extends Object. 
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
 * <h2>ApiMethode: POST</h2>
 * <p>This class contains a comment <b>"ApiMethod: POST"</b>, which creates an API "POST". 
 * </p>
 * <h2>ApiMethode: PATCH</h2>
 * <p>This class contains a comment <b>"ApiMethod: PATCH"</b>, which creates an API "PATCH". 
 * </p>
 * <h2>ApiMethode: PUTImport</h2>
 * <p>This class contains a comment <b>"ApiMethod: PUTImport"</b>, which creates an API "PUTImport". 
 * </p>
 * <h2>ApiMethode: SearchPage</h2>
 * <p>This class contains a comment <b>"ApiMethod: SearchPage"</b>, which creates an API "SearchPage". 
 * </p>
 * <h2>ApiTag.enUS: true</h2>
 * <p>This class contains a comment <b>"ApiTag: System Event"</b>, which groups all of the OpenAPIs for SystemEvent objects under the tag "System Event". 
 * </p>
 * <h2>ApiUri.enUS: /api/system-event</h2>
 * <p>This class contains a comment <b>"ApiUri: /api/system-event"</b>, which defines the base API URI for SystemEvent objects as "/api/system-event" in the OpenAPI spec. 
 * </p>
 * <h2>Color: 2017-shaded-spruce</h2>
 * <p>This class contains a comment <b>"Color: 2017-shaded-spruce"</b>, which styles the SystemEvent page "2017-shaded-spruce". 
 * This will reference a CSS class defined by the stylesheets in the project that starts with "w3-". 
 * A css class of "w3-2017-shaded-spruce" is expected to exist in the project stylesheets, and is inspired by W3 CSS colors. 
 * See: <a href="https://www.w3schools.com/w3css/w3css_colors.asp">https://www.w3schools.com/w3css/w3css_colors.asp</a>. 
 * </p>
 * <h2>IconGroup: duotone</h2>
 * <p>This class contains a comment <b>"IconGroup: duotone"</b>, which adds icons on the SystemEvent page with a group of "duotone". 
 * This will reference a Font Awesome icon group that starts with "fa-" followed by the icon group "duotone", together is "fa-duotone". 
 * A Font Awesome icon group of "duotone" is expected to exist. 
 * The Font Awesome groups currently supported include: solid, regular, light, thin, duotone, sharp, and kit. 
 * See: <a href="https://fontawesome.com/docs/web/dig-deeper/styles">https://fontawesome.com/docs/web/dig-deeper/styles</a>. 
 * </p>
 * <h2>IconName: square-terminal</h2>
 * <p>This class contains a comment <b>"IconName: square-terminal"</b>, which adds icons on the SystemEvent page with a name of "square-terminal". 
 * This will reference a Font Awesome icon that starts with the icon group "fa-duotone fa-" followed by the icon name, which is "fa-duotone fa-square-terminal". 
 * A Font Awesome icon of "fa-duotone fa-square-terminal" is expected to exist. 
 * See: <a href="https://fontawesome.com/icons">https://fontawesome.com/icons</a>. 
 * </p>
 * <h2>Indexed: true</h2>
 * <p>This class contains a comment <b>"Indexed: true"</b>, which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * <h2>{@inheritDoc}</h2>
 * <p>By adding a class comment "{@inheritDoc}", the SystemEvent class will inherit the helpful inherited class comments from the super class SystemEventGen. 
 * </p>
 * <h2>Rows: null</h2>
 * <h2>Order: 102</h2>
 * <p>This class contains a comment <b>"Order: 102"</b>, which means this class will be sorted by the given number 102 ascending when code that relates to multiple classes at the same time is generated. 
 * </p>
 * <h2>SqlOrder: 102</h2>
 * <p>This class contains a comment <b>"SqlOrder: 102"</b>, which means this class will be sorted by the given number 102 ascending when SQL code to create and drop the tables is generated. 
 * </p>
 * <h2>Model: true</h2>
 * <h2>Page: true</h2>
 * <p>This class contains a comment <b>"Page: true"</b>, which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.smartvillageview.enus.model.system.event.SystemEventPage. 
 * </p>
 * <h2>SuperPage.enUS: PageLayout</h2>
 * <p>This class contains a comment <b>"SuperPage.enUS: PageLayout"</b>, which identifies the Java super class of the page code by it's class simple name "PageLayout". 
 * This means that the newly created class org.computate.smartvillageview.enus.model.system.event.SystemEventPage extends org.computate.smartvillageview.enus.page.PageLayout. 
 * </p>
 * <h2>Promise: true</h2>
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the SystemEvent Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * This class contains a comment <b>"Role.enUS: SiteAdmin"</b>, which identifies the default role name "SiteAdmin" of the OAuth2/OpenID Connect user role required to access this SystemEvent API. 
 * It's possible to reconfigure the roles required to access the SystemEvent API by configuring an environment variable like this: 
 * </p>
 * <pre>AUTH_ROLE_REQUIRED_SystemEvent: ["SiteAdmin"]</pre>
 * <h2>AName.enUS: a system event</h2>
 * <p>This class contains a comment <b>"AName.enUS: a system event"</b>, which identifies the language context to describe a SystemEvent as "a system event". 
 * </p>
 * <p>
 * Delete the class SystemEvent in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEvent&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.system.event in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * Generated: true
 **/
public abstract class SystemEventGen<DEV> extends Object {
	protected static final Logger LOG = LoggerFactory.getLogger(SystemEvent.class);

	public static final String SystemEvent_Description_enUS = "A system event";
	public static final String SystemEvent_AName_enUS = "a system event";
	public static final String SystemEvent_This_enUS = "this ";
	public static final String SystemEvent_ThisName_enUS = "this system event";
	public static final String SystemEvent_A_enUS = "a ";
	public static final String SystemEvent_TheName_enUS = "the system event";
	public static final String SystemEvent_NameSingular_enUS = "system event";
	public static final String SystemEvent_NamePlural_enUS = "system events";
	public static final String SystemEvent_NameActual_enUS = "current system event";
	public static final String SystemEvent_AllName_enUS = "all the system events";
	public static final String SystemEvent_SearchAllNameBy_enUS = "search system events by ";
	public static final String SystemEvent_Title_enUS = "system events";
	public static final String SystemEvent_ThePluralName_enUS = "the system events";
	public static final String SystemEvent_NoNameFound_enUS = "no system event found";
	public static final String SystemEvent_ApiUri_enUS = "/api/system-event";
	public static final String SystemEvent_ApiUriSearchPage_enUS = "/system-event";
	public static final String SystemEvent_OfName_enUS = "of system event";
	public static final String SystemEvent_ANameAdjective_enUS = "a system event";
	public static final String SystemEvent_NameAdjectiveSingular_enUS = "system event";
	public static final String SystemEvent_NameAdjectivePlural_enUS = "system events";
	public static final String Search_enUS_Uri = "/api/system-event";
	public static final String Search_enUS_ImageUri = "/png/api/system-event-999.png";
	public static final String GET_enUS_Uri = "/api/system-event/{id}";
	public static final String GET_enUS_ImageUri = "/png/api/system-event/{id}-999.png";
	public static final String POST_enUS_Uri = "/api/system-event";
	public static final String POST_enUS_ImageUri = "/png/api/system-event-999.png";
	public static final String PATCH_enUS_Uri = "/api/system-event";
	public static final String PATCH_enUS_ImageUri = "/png/api/system-event-999.png";
	public static final String PUTImport_enUS_Uri = "/api/system-event-import";
	public static final String PUTImport_enUS_ImageUri = "/png/api/system-event-import-999.png";
	public static final String SearchPage_enUS_Uri = "/system-event";
	public static final String SearchPage_enUS_ImageUri = "/png/system-event-999.png";

	public static final String SystemEvent_Color = "2017-shaded-spruce";
	public static final String SystemEvent_IconGroup = "duotone";
	public static final String SystemEvent_IconName = "square-terminal";

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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEvent&fq=entiteVar_enUS_indexed_string:siteRequest_">Find the entity siteRequest_ in Solr</a>
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
	protected SystemEvent siteRequest_Init() {
		Wrap<SiteRequestEnUS> siteRequest_Wrap = new Wrap<SiteRequestEnUS>().var("siteRequest_");
		if(siteRequest_ == null) {
			_siteRequest_(siteRequest_Wrap);
			Optional.ofNullable(siteRequest_Wrap.getO()).ifPresent(o -> {
				setSiteRequest_(o);
			});
		}
		return (SystemEvent)this;
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEvent&fq=entiteVar_enUS_indexed_string:promiseBefore">Find the entity promiseBefore in Solr</a>
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

	//////////
	// type //
	//////////


	/**	 The entity type
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String type;

	/**	<br> The entity type
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEvent&fq=entiteVar_enUS_indexed_string:type">Find the entity type in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _type(Wrap<String> w);

	public String getType() {
		return type;
	}
	public void setType(String o) {
		this.type = SystemEvent.staticSetType(siteRequest_, o);
	}
	public static String staticSetType(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SystemEvent typeInit() {
		Wrap<String> typeWrap = new Wrap<String>().var("type");
		if(type == null) {
			_type(typeWrap);
			Optional.ofNullable(typeWrap.getO()).ifPresent(o -> {
				setType(o);
			});
		}
		return (SystemEvent)this;
	}

	public static String staticSearchType(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrType(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqType(SiteRequestEnUS siteRequest_, String o) {
		return SystemEvent.staticSearchStrType(siteRequest_, SystemEvent.staticSearchType(siteRequest_, SystemEvent.staticSetType(siteRequest_, o)));
	}

	public String sqlType() {
		return type;
	}

	/////////////
	// message //
	/////////////


	/**	 The entity message
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String message;

	/**	<br> The entity message
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEvent&fq=entiteVar_enUS_indexed_string:message">Find the entity message in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _message(Wrap<String> w);

	public String getMessage() {
		return message;
	}
	public void setMessage(String o) {
		this.message = SystemEvent.staticSetMessage(siteRequest_, o);
	}
	public static String staticSetMessage(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SystemEvent messageInit() {
		Wrap<String> messageWrap = new Wrap<String>().var("message");
		if(message == null) {
			_message(messageWrap);
			Optional.ofNullable(messageWrap.getO()).ifPresent(o -> {
				setMessage(o);
			});
		}
		return (SystemEvent)this;
	}

	public static String staticSearchMessage(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrMessage(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqMessage(SiteRequestEnUS siteRequest_, String o) {
		return SystemEvent.staticSearchStrMessage(siteRequest_, SystemEvent.staticSearchMessage(siteRequest_, SystemEvent.staticSetMessage(siteRequest_, o)));
	}

	public String sqlMessage() {
		return message;
	}

	////////////
	// status //
	////////////

	public static final String statusStarted1_enUS = "Started";
	public static final String statusStarted_enUS = statusStarted1_enUS;
	public static final String statusCompleted1_enUS = "Completed";
	public static final String statusCompleted_enUS = statusCompleted1_enUS;
	public static final String statusError1_enUS = "Error";
	public static final String statusError_enUS = statusError1_enUS;

	/**	 The entity status
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String status;

	/**	<br> The entity status
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEvent&fq=entiteVar_enUS_indexed_string:status">Find the entity status in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _status(Wrap<String> w);

	public String getStatus() {
		return status;
	}
	public void setStatus(String o) {
		this.status = SystemEvent.staticSetStatus(siteRequest_, o);
	}
	public static String staticSetStatus(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SystemEvent statusInit() {
		Wrap<String> statusWrap = new Wrap<String>().var("status");
		if(status == null) {
			_status(statusWrap);
			Optional.ofNullable(statusWrap.getO()).ifPresent(o -> {
				setStatus(o);
			});
		}
		return (SystemEvent)this;
	}

	public static String staticSearchStatus(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrStatus(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqStatus(SiteRequestEnUS siteRequest_, String o) {
		return SystemEvent.staticSearchStrStatus(siteRequest_, SystemEvent.staticSearchStatus(siteRequest_, SystemEvent.staticSetStatus(siteRequest_, o)));
	}

	public String sqlStatus() {
		return status;
	}

	///////////////
	// completed //
	///////////////


	/**	 The entity completed
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonDeserialize(using = ComputateZonedDateTimeDeserializer.class)
	@JsonSerialize(using = ComputateZonedDateTimeSerializer.class)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSSV'['VV']'")
	@JsonInclude(Include.NON_NULL)
	protected ZonedDateTime completed;

	/**	<br> The entity completed
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEvent&fq=entiteVar_enUS_indexed_string:completed">Find the entity completed in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _completed(Wrap<ZonedDateTime> w);

	public ZonedDateTime getCompleted() {
		return completed;
	}

	public void setCompleted(ZonedDateTime completed) {
		this.completed = Optional.ofNullable(completed).map(v -> v.truncatedTo(ChronoUnit.MILLIS)).orElse(null);
	}
	@JsonIgnore
	public void setCompleted(Instant o) {
		this.completed = o == null ? null : ZonedDateTime.from(o).truncatedTo(ChronoUnit.MILLIS);
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	@JsonIgnore
	public void setCompleted(String o) {
		this.completed = SystemEvent.staticSetCompleted(siteRequest_, o);
	}
	public static ZonedDateTime staticSetCompleted(SiteRequestEnUS siteRequest_, String o) {
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
	public void setCompleted(Date o) {
		this.completed = o == null ? null : ZonedDateTime.ofInstant(o.toInstant(), ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	protected SystemEvent completedInit() {
		Wrap<ZonedDateTime> completedWrap = new Wrap<ZonedDateTime>().var("completed");
		if(completed == null) {
			_completed(completedWrap);
			Optional.ofNullable(completedWrap.getO()).ifPresent(o -> {
				setCompleted(o);
			});
		}
		return (SystemEvent)this;
	}

	public static Date staticSearchCompleted(SiteRequestEnUS siteRequest_, ZonedDateTime o) {
		return o == null ? null : Date.from(o.toInstant());
	}

	public static String staticSearchStrCompleted(SiteRequestEnUS siteRequest_, Date o) {
		return "\"" + DateTimeFormatter.ISO_DATE_TIME.format(o.toInstant().atOffset(ZoneOffset.UTC)) + "\"";
	}

	public static String staticSearchFqCompleted(SiteRequestEnUS siteRequest_, String o) {
		return SystemEvent.staticSearchStrCompleted(siteRequest_, SystemEvent.staticSearchCompleted(siteRequest_, SystemEvent.staticSetCompleted(siteRequest_, o)));
	}

	public OffsetDateTime sqlCompleted() {
		return completed == null ? null : completed.toOffsetDateTime();
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEvent&fq=entiteVar_enUS_indexed_string:inheritPk">Find the entity inheritPk in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _inheritPk(Wrap<String> w);

	public String getInheritPk() {
		return inheritPk;
	}
	public void setInheritPk(String o) {
		this.inheritPk = SystemEvent.staticSetInheritPk(siteRequest_, o);
	}
	public static String staticSetInheritPk(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SystemEvent inheritPkInit() {
		Wrap<String> inheritPkWrap = new Wrap<String>().var("inheritPk");
		if(inheritPk == null) {
			_inheritPk(inheritPkWrap);
			Optional.ofNullable(inheritPkWrap.getO()).ifPresent(o -> {
				setInheritPk(o);
			});
		}
		return (SystemEvent)this;
	}

	public static String staticSearchInheritPk(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrInheritPk(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqInheritPk(SiteRequestEnUS siteRequest_, String o) {
		return SystemEvent.staticSearchStrInheritPk(siteRequest_, SystemEvent.staticSearchInheritPk(siteRequest_, SystemEvent.staticSetInheritPk(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEvent&fq=entiteVar_enUS_indexed_string:created">Find the entity created in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _created(Wrap<ZonedDateTime> w);

	public ZonedDateTime getCreated() {
		return created;
	}

	public void setCreated(ZonedDateTime created) {
		this.created = Optional.ofNullable(created).map(v -> v.truncatedTo(ChronoUnit.MILLIS)).orElse(null);
	}
	@JsonIgnore
	public void setCreated(Instant o) {
		this.created = o == null ? null : ZonedDateTime.from(o).truncatedTo(ChronoUnit.MILLIS);
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	@JsonIgnore
	public void setCreated(String o) {
		this.created = SystemEvent.staticSetCreated(siteRequest_, o);
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
	protected SystemEvent createdInit() {
		Wrap<ZonedDateTime> createdWrap = new Wrap<ZonedDateTime>().var("created");
		if(created == null) {
			_created(createdWrap);
			Optional.ofNullable(createdWrap.getO()).ifPresent(o -> {
				setCreated(o);
			});
		}
		return (SystemEvent)this;
	}

	public static Date staticSearchCreated(SiteRequestEnUS siteRequest_, ZonedDateTime o) {
		return o == null ? null : Date.from(o.toInstant());
	}

	public static String staticSearchStrCreated(SiteRequestEnUS siteRequest_, Date o) {
		return "\"" + DateTimeFormatter.ISO_DATE_TIME.format(o.toInstant().atOffset(ZoneOffset.UTC)) + "\"";
	}

	public static String staticSearchFqCreated(SiteRequestEnUS siteRequest_, String o) {
		return SystemEvent.staticSearchStrCreated(siteRequest_, SystemEvent.staticSearchCreated(siteRequest_, SystemEvent.staticSetCreated(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEvent&fq=entiteVar_enUS_indexed_string:modified">Find the entity modified in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _modified(Wrap<ZonedDateTime> w);

	public ZonedDateTime getModified() {
		return modified;
	}

	public void setModified(ZonedDateTime modified) {
		this.modified = Optional.ofNullable(modified).map(v -> v.truncatedTo(ChronoUnit.MILLIS)).orElse(null);
	}
	@JsonIgnore
	public void setModified(Instant o) {
		this.modified = o == null ? null : ZonedDateTime.from(o).truncatedTo(ChronoUnit.MILLIS);
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	@JsonIgnore
	public void setModified(String o) {
		this.modified = SystemEvent.staticSetModified(siteRequest_, o);
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
	protected SystemEvent modifiedInit() {
		Wrap<ZonedDateTime> modifiedWrap = new Wrap<ZonedDateTime>().var("modified");
		if(modified == null) {
			_modified(modifiedWrap);
			Optional.ofNullable(modifiedWrap.getO()).ifPresent(o -> {
				setModified(o);
			});
		}
		return (SystemEvent)this;
	}

	public static Date staticSearchModified(SiteRequestEnUS siteRequest_, ZonedDateTime o) {
		return o == null ? null : Date.from(o.toInstant());
	}

	public static String staticSearchStrModified(SiteRequestEnUS siteRequest_, Date o) {
		return "\"" + DateTimeFormatter.ISO_DATE_TIME.format(o.toInstant().atOffset(ZoneOffset.UTC)) + "\"";
	}

	public static String staticSearchFqModified(SiteRequestEnUS siteRequest_, String o) {
		return SystemEvent.staticSearchStrModified(siteRequest_, SystemEvent.staticSearchModified(siteRequest_, SystemEvent.staticSetModified(siteRequest_, o)));
	}

	//////////////////
	// pageImageUri //
	//////////////////


	/**	 The entity pageImageUri
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageImageUri;

	/**	<br> The entity pageImageUri
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEvent&fq=entiteVar_enUS_indexed_string:pageImageUri">Find the entity pageImageUri in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageImageUri(Wrap<String> w);

	public String getPageImageUri() {
		return pageImageUri;
	}
	public void setPageImageUri(String o) {
		this.pageImageUri = SystemEvent.staticSetPageImageUri(siteRequest_, o);
	}
	public static String staticSetPageImageUri(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SystemEvent pageImageUriInit() {
		Wrap<String> pageImageUriWrap = new Wrap<String>().var("pageImageUri");
		if(pageImageUri == null) {
			_pageImageUri(pageImageUriWrap);
			Optional.ofNullable(pageImageUriWrap.getO()).ifPresent(o -> {
				setPageImageUri(o);
			});
		}
		return (SystemEvent)this;
	}

	public static String staticSearchPageImageUri(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageImageUri(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageImageUri(SiteRequestEnUS siteRequest_, String o) {
		return SystemEvent.staticSearchStrPageImageUri(siteRequest_, SystemEvent.staticSearchPageImageUri(siteRequest_, SystemEvent.staticSetPageImageUri(siteRequest_, o)));
	}

	public String sqlPageImageUri() {
		return pageImageUri;
	}

	////////////////////
	// pageImageWidth //
	////////////////////


	/**	 The entity pageImageWidth
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer pageImageWidth;

	/**	<br> The entity pageImageWidth
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEvent&fq=entiteVar_enUS_indexed_string:pageImageWidth">Find the entity pageImageWidth in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageImageWidth(Wrap<Integer> w);

	public Integer getPageImageWidth() {
		return pageImageWidth;
	}

	public void setPageImageWidth(Integer pageImageWidth) {
		this.pageImageWidth = pageImageWidth;
	}
	@JsonIgnore
	public void setPageImageWidth(String o) {
		this.pageImageWidth = SystemEvent.staticSetPageImageWidth(siteRequest_, o);
	}
	public static Integer staticSetPageImageWidth(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected SystemEvent pageImageWidthInit() {
		Wrap<Integer> pageImageWidthWrap = new Wrap<Integer>().var("pageImageWidth");
		if(pageImageWidth == null) {
			_pageImageWidth(pageImageWidthWrap);
			Optional.ofNullable(pageImageWidthWrap.getO()).ifPresent(o -> {
				setPageImageWidth(o);
			});
		}
		return (SystemEvent)this;
	}

	public static Integer staticSearchPageImageWidth(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrPageImageWidth(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageImageWidth(SiteRequestEnUS siteRequest_, String o) {
		return SystemEvent.staticSearchStrPageImageWidth(siteRequest_, SystemEvent.staticSearchPageImageWidth(siteRequest_, SystemEvent.staticSetPageImageWidth(siteRequest_, o)));
	}

	/////////////////////
	// pageImageHeight //
	/////////////////////


	/**	 The entity pageImageHeight
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer pageImageHeight;

	/**	<br> The entity pageImageHeight
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEvent&fq=entiteVar_enUS_indexed_string:pageImageHeight">Find the entity pageImageHeight in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageImageHeight(Wrap<Integer> c);

	public Integer getPageImageHeight() {
		return pageImageHeight;
	}

	public void setPageImageHeight(Integer pageImageHeight) {
		this.pageImageHeight = pageImageHeight;
	}
	@JsonIgnore
	public void setPageImageHeight(String o) {
		this.pageImageHeight = SystemEvent.staticSetPageImageHeight(siteRequest_, o);
	}
	public static Integer staticSetPageImageHeight(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected SystemEvent pageImageHeightInit() {
		Wrap<Integer> pageImageHeightWrap = new Wrap<Integer>().var("pageImageHeight");
		if(pageImageHeight == null) {
			_pageImageHeight(pageImageHeightWrap);
			Optional.ofNullable(pageImageHeightWrap.getO()).ifPresent(o -> {
				setPageImageHeight(o);
			});
		}
		return (SystemEvent)this;
	}

	public static Integer staticSearchPageImageHeight(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrPageImageHeight(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageImageHeight(SiteRequestEnUS siteRequest_, String o) {
		return SystemEvent.staticSearchStrPageImageHeight(siteRequest_, SystemEvent.staticSearchPageImageHeight(siteRequest_, SystemEvent.staticSetPageImageHeight(siteRequest_, o)));
	}

	///////////////////
	// pageImageType //
	///////////////////


	/**	 The entity pageImageType
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageImageType;

	/**	<br> The entity pageImageType
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEvent&fq=entiteVar_enUS_indexed_string:pageImageType">Find the entity pageImageType in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageImageType(Wrap<String> c);

	public String getPageImageType() {
		return pageImageType;
	}
	public void setPageImageType(String o) {
		this.pageImageType = SystemEvent.staticSetPageImageType(siteRequest_, o);
	}
	public static String staticSetPageImageType(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SystemEvent pageImageTypeInit() {
		Wrap<String> pageImageTypeWrap = new Wrap<String>().var("pageImageType");
		if(pageImageType == null) {
			_pageImageType(pageImageTypeWrap);
			Optional.ofNullable(pageImageTypeWrap.getO()).ifPresent(o -> {
				setPageImageType(o);
			});
		}
		return (SystemEvent)this;
	}

	public static String staticSearchPageImageType(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageImageType(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageImageType(SiteRequestEnUS siteRequest_, String o) {
		return SystemEvent.staticSearchStrPageImageType(siteRequest_, SystemEvent.staticSearchPageImageType(siteRequest_, SystemEvent.staticSetPageImageType(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEvent&fq=entiteVar_enUS_indexed_string:archived">Find the entity archived in Solr</a>
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
		this.archived = SystemEvent.staticSetArchived(siteRequest_, o);
	}
	public static Boolean staticSetArchived(SiteRequestEnUS siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected SystemEvent archivedInit() {
		Wrap<Boolean> archivedWrap = new Wrap<Boolean>().var("archived");
		if(archived == null) {
			_archived(archivedWrap);
			Optional.ofNullable(archivedWrap.getO()).ifPresent(o -> {
				setArchived(o);
			});
		}
		return (SystemEvent)this;
	}

	public static Boolean staticSearchArchived(SiteRequestEnUS siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrArchived(SiteRequestEnUS siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqArchived(SiteRequestEnUS siteRequest_, String o) {
		return SystemEvent.staticSearchStrArchived(siteRequest_, SystemEvent.staticSearchArchived(siteRequest_, SystemEvent.staticSetArchived(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEvent&fq=entiteVar_enUS_indexed_string:deleted">Find the entity deleted in Solr</a>
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
		this.deleted = SystemEvent.staticSetDeleted(siteRequest_, o);
	}
	public static Boolean staticSetDeleted(SiteRequestEnUS siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected SystemEvent deletedInit() {
		Wrap<Boolean> deletedWrap = new Wrap<Boolean>().var("deleted");
		if(deleted == null) {
			_deleted(deletedWrap);
			Optional.ofNullable(deletedWrap.getO()).ifPresent(o -> {
				setDeleted(o);
			});
		}
		return (SystemEvent)this;
	}

	public static Boolean staticSearchDeleted(SiteRequestEnUS siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrDeleted(SiteRequestEnUS siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDeleted(SiteRequestEnUS siteRequest_, String o) {
		return SystemEvent.staticSearchStrDeleted(siteRequest_, SystemEvent.staticSearchDeleted(siteRequest_, SystemEvent.staticSetDeleted(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEvent&fq=entiteVar_enUS_indexed_string:classCanonicalName">Find the entity classCanonicalName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _classCanonicalName(Wrap<String> w);

	public String getClassCanonicalName() {
		return classCanonicalName;
	}
	public void setClassCanonicalName(String o) {
		this.classCanonicalName = SystemEvent.staticSetClassCanonicalName(siteRequest_, o);
	}
	public static String staticSetClassCanonicalName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SystemEvent classCanonicalNameInit() {
		Wrap<String> classCanonicalNameWrap = new Wrap<String>().var("classCanonicalName");
		if(classCanonicalName == null) {
			_classCanonicalName(classCanonicalNameWrap);
			Optional.ofNullable(classCanonicalNameWrap.getO()).ifPresent(o -> {
				setClassCanonicalName(o);
			});
		}
		return (SystemEvent)this;
	}

	public static String staticSearchClassCanonicalName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrClassCanonicalName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqClassCanonicalName(SiteRequestEnUS siteRequest_, String o) {
		return SystemEvent.staticSearchStrClassCanonicalName(siteRequest_, SystemEvent.staticSearchClassCanonicalName(siteRequest_, SystemEvent.staticSetClassCanonicalName(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEvent&fq=entiteVar_enUS_indexed_string:classSimpleName">Find the entity classSimpleName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _classSimpleName(Wrap<String> w);

	public String getClassSimpleName() {
		return classSimpleName;
	}
	public void setClassSimpleName(String o) {
		this.classSimpleName = SystemEvent.staticSetClassSimpleName(siteRequest_, o);
	}
	public static String staticSetClassSimpleName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SystemEvent classSimpleNameInit() {
		Wrap<String> classSimpleNameWrap = new Wrap<String>().var("classSimpleName");
		if(classSimpleName == null) {
			_classSimpleName(classSimpleNameWrap);
			Optional.ofNullable(classSimpleNameWrap.getO()).ifPresent(o -> {
				setClassSimpleName(o);
			});
		}
		return (SystemEvent)this;
	}

	public static String staticSearchClassSimpleName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrClassSimpleName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqClassSimpleName(SiteRequestEnUS siteRequest_, String o) {
		return SystemEvent.staticSearchStrClassSimpleName(siteRequest_, SystemEvent.staticSearchClassSimpleName(siteRequest_, SystemEvent.staticSetClassSimpleName(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEvent&fq=entiteVar_enUS_indexed_string:classCanonicalNames">Find the entity classCanonicalNames in Solr</a>
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
	public void setClassCanonicalNames(String o) {
		String l = SystemEvent.staticSetClassCanonicalNames(siteRequest_, o);
		if(l != null)
			addClassCanonicalNames(l);
	}
	public static String staticSetClassCanonicalNames(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public SystemEvent addClassCanonicalNames(String...objects) {
		for(String o : objects) {
			addClassCanonicalNames(o);
		}
		return (SystemEvent)this;
	}
	public SystemEvent addClassCanonicalNames(String o) {
		if(o != null)
			this.classCanonicalNames.add(o);
		return (SystemEvent)this;
	}
	@JsonIgnore
	public void setClassCanonicalNames(JsonArray objects) {
		classCanonicalNames.clear();
		if(objects == null)
			return;
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addClassCanonicalNames(o);
		}
	}
	protected SystemEvent classCanonicalNamesInit() {
		_classCanonicalNames(classCanonicalNames);
		return (SystemEvent)this;
	}

	public static String staticSearchClassCanonicalNames(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrClassCanonicalNames(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqClassCanonicalNames(SiteRequestEnUS siteRequest_, String o) {
		return SystemEvent.staticSearchStrClassCanonicalNames(siteRequest_, SystemEvent.staticSearchClassCanonicalNames(siteRequest_, SystemEvent.staticSetClassCanonicalNames(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEvent&fq=entiteVar_enUS_indexed_string:sessionId">Find the entity sessionId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _sessionId(Wrap<String> w);

	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String o) {
		this.sessionId = SystemEvent.staticSetSessionId(siteRequest_, o);
	}
	public static String staticSetSessionId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SystemEvent sessionIdInit() {
		Wrap<String> sessionIdWrap = new Wrap<String>().var("sessionId");
		if(sessionId == null) {
			_sessionId(sessionIdWrap);
			Optional.ofNullable(sessionIdWrap.getO()).ifPresent(o -> {
				setSessionId(o);
			});
		}
		return (SystemEvent)this;
	}

	public static String staticSearchSessionId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSessionId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSessionId(SiteRequestEnUS siteRequest_, String o) {
		return SystemEvent.staticSearchStrSessionId(siteRequest_, SystemEvent.staticSearchSessionId(siteRequest_, SystemEvent.staticSetSessionId(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEvent&fq=entiteVar_enUS_indexed_string:userKey">Find the entity userKey in Solr</a>
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
		this.userKey = SystemEvent.staticSetUserKey(siteRequest_, o);
	}
	public static Long staticSetUserKey(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected SystemEvent userKeyInit() {
		Wrap<Long> userKeyWrap = new Wrap<Long>().var("userKey");
		if(userKey == null) {
			_userKey(userKeyWrap);
			Optional.ofNullable(userKeyWrap.getO()).ifPresent(o -> {
				setUserKey(o);
			});
		}
		return (SystemEvent)this;
	}

	public static Long staticSearchUserKey(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrUserKey(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUserKey(SiteRequestEnUS siteRequest_, String o) {
		return SystemEvent.staticSearchStrUserKey(siteRequest_, SystemEvent.staticSearchUserKey(siteRequest_, SystemEvent.staticSetUserKey(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEvent&fq=entiteVar_enUS_indexed_string:saves">Find the entity saves in Solr</a>
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
	public void setSaves(String o) {
		String l = SystemEvent.staticSetSaves(siteRequest_, o);
		if(l != null)
			addSaves(l);
	}
	public static String staticSetSaves(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public SystemEvent addSaves(String...objects) {
		for(String o : objects) {
			addSaves(o);
		}
		return (SystemEvent)this;
	}
	public SystemEvent addSaves(String o) {
		if(o != null)
			this.saves.add(o);
		return (SystemEvent)this;
	}
	@JsonIgnore
	public void setSaves(JsonArray objects) {
		saves.clear();
		if(objects == null)
			return;
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addSaves(o);
		}
	}
	protected SystemEvent savesInit() {
		_saves(saves);
		return (SystemEvent)this;
	}

	public static String staticSearchSaves(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSaves(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSaves(SiteRequestEnUS siteRequest_, String o) {
		return SystemEvent.staticSearchStrSaves(siteRequest_, SystemEvent.staticSearchSaves(siteRequest_, SystemEvent.staticSetSaves(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEvent&fq=entiteVar_enUS_indexed_string:objectTitle">Find the entity objectTitle in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _objectTitle(Wrap<String> w);

	public String getObjectTitle() {
		return objectTitle;
	}
	public void setObjectTitle(String o) {
		this.objectTitle = SystemEvent.staticSetObjectTitle(siteRequest_, o);
	}
	public static String staticSetObjectTitle(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SystemEvent objectTitleInit() {
		Wrap<String> objectTitleWrap = new Wrap<String>().var("objectTitle");
		if(objectTitle == null) {
			_objectTitle(objectTitleWrap);
			Optional.ofNullable(objectTitleWrap.getO()).ifPresent(o -> {
				setObjectTitle(o);
			});
		}
		return (SystemEvent)this;
	}

	public static String staticSearchObjectTitle(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrObjectTitle(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqObjectTitle(SiteRequestEnUS siteRequest_, String o) {
		return SystemEvent.staticSearchStrObjectTitle(siteRequest_, SystemEvent.staticSearchObjectTitle(siteRequest_, SystemEvent.staticSetObjectTitle(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEvent&fq=entiteVar_enUS_indexed_string:objectId">Find the entity objectId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _objectId(Wrap<String> w);

	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String o) {
		this.objectId = SystemEvent.staticSetObjectId(siteRequest_, o);
	}
	public static String staticSetObjectId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SystemEvent objectIdInit() {
		Wrap<String> objectIdWrap = new Wrap<String>().var("objectId");
		if(objectId == null) {
			_objectId(objectIdWrap);
			Optional.ofNullable(objectIdWrap.getO()).ifPresent(o -> {
				setObjectId(o);
			});
		}
		return (SystemEvent)this;
	}

	public static String staticSearchObjectId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrObjectId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqObjectId(SiteRequestEnUS siteRequest_, String o) {
		return SystemEvent.staticSearchStrObjectId(siteRequest_, SystemEvent.staticSearchObjectId(siteRequest_, SystemEvent.staticSetObjectId(siteRequest_, o)));
	}

	public String sqlObjectId() {
		return objectId;
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEvent&fq=entiteVar_enUS_indexed_string:objectSuggest">Find the entity objectSuggest in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _objectSuggest(Wrap<String> w);

	public String getObjectSuggest() {
		return objectSuggest;
	}
	public void setObjectSuggest(String o) {
		this.objectSuggest = SystemEvent.staticSetObjectSuggest(siteRequest_, o);
	}
	public static String staticSetObjectSuggest(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SystemEvent objectSuggestInit() {
		Wrap<String> objectSuggestWrap = new Wrap<String>().var("objectSuggest");
		if(objectSuggest == null) {
			_objectSuggest(objectSuggestWrap);
			Optional.ofNullable(objectSuggestWrap.getO()).ifPresent(o -> {
				setObjectSuggest(o);
			});
		}
		return (SystemEvent)this;
	}

	public static String staticSearchObjectSuggest(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrObjectSuggest(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqObjectSuggest(SiteRequestEnUS siteRequest_, String o) {
		return SystemEvent.staticSearchStrObjectSuggest(siteRequest_, SystemEvent.staticSearchObjectSuggest(siteRequest_, SystemEvent.staticSetObjectSuggest(siteRequest_, o)));
	}

	////////////////
	// objectText //
	////////////////


	/**	 The entity objectText
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> objectText = new ArrayList<String>();

	/**	<br> The entity objectText
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEvent&fq=entiteVar_enUS_indexed_string:objectText">Find the entity objectText in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _objectText(List<String> l);

	public List<String> getObjectText() {
		return objectText;
	}

	public void setObjectText(List<String> objectText) {
		this.objectText = objectText;
	}
	public void setObjectText(String o) {
		String l = SystemEvent.staticSetObjectText(siteRequest_, o);
		if(l != null)
			addObjectText(l);
	}
	public static String staticSetObjectText(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public SystemEvent addObjectText(String...objects) {
		for(String o : objects) {
			addObjectText(o);
		}
		return (SystemEvent)this;
	}
	public SystemEvent addObjectText(String o) {
		if(o != null)
			this.objectText.add(o);
		return (SystemEvent)this;
	}
	@JsonIgnore
	public void setObjectText(JsonArray objects) {
		objectText.clear();
		if(objects == null)
			return;
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addObjectText(o);
		}
	}
	protected SystemEvent objectTextInit() {
		_objectText(objectText);
		return (SystemEvent)this;
	}

	public static String staticSearchObjectText(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrObjectText(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqObjectText(SiteRequestEnUS siteRequest_, String o) {
		return SystemEvent.staticSearchStrObjectText(siteRequest_, SystemEvent.staticSearchObjectText(siteRequest_, SystemEvent.staticSetObjectText(siteRequest_, o)));
	}

	public String[] sqlObjectText() {
		return objectText.stream().map(v -> (String)v).toArray(String[]::new);
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEvent&fq=entiteVar_enUS_indexed_string:pageUrlId">Find the entity pageUrlId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUrlId(Wrap<String> w);

	public String getPageUrlId() {
		return pageUrlId;
	}
	public void setPageUrlId(String o) {
		this.pageUrlId = SystemEvent.staticSetPageUrlId(siteRequest_, o);
	}
	public static String staticSetPageUrlId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SystemEvent pageUrlIdInit() {
		Wrap<String> pageUrlIdWrap = new Wrap<String>().var("pageUrlId");
		if(pageUrlId == null) {
			_pageUrlId(pageUrlIdWrap);
			Optional.ofNullable(pageUrlIdWrap.getO()).ifPresent(o -> {
				setPageUrlId(o);
			});
		}
		return (SystemEvent)this;
	}

	public static String staticSearchPageUrlId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUrlId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUrlId(SiteRequestEnUS siteRequest_, String o) {
		return SystemEvent.staticSearchStrPageUrlId(siteRequest_, SystemEvent.staticSearchPageUrlId(siteRequest_, SystemEvent.staticSetPageUrlId(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEvent&fq=entiteVar_enUS_indexed_string:pageUrlPk">Find the entity pageUrlPk in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUrlPk(Wrap<String> w);

	public String getPageUrlPk() {
		return pageUrlPk;
	}
	public void setPageUrlPk(String o) {
		this.pageUrlPk = SystemEvent.staticSetPageUrlPk(siteRequest_, o);
	}
	public static String staticSetPageUrlPk(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SystemEvent pageUrlPkInit() {
		Wrap<String> pageUrlPkWrap = new Wrap<String>().var("pageUrlPk");
		if(pageUrlPk == null) {
			_pageUrlPk(pageUrlPkWrap);
			Optional.ofNullable(pageUrlPkWrap.getO()).ifPresent(o -> {
				setPageUrlPk(o);
			});
		}
		return (SystemEvent)this;
	}

	public static String staticSearchPageUrlPk(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUrlPk(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUrlPk(SiteRequestEnUS siteRequest_, String o) {
		return SystemEvent.staticSearchStrPageUrlPk(siteRequest_, SystemEvent.staticSearchPageUrlPk(siteRequest_, SystemEvent.staticSetPageUrlPk(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEvent&fq=entiteVar_enUS_indexed_string:pageUrlApi">Find the entity pageUrlApi in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUrlApi(Wrap<String> w);

	public String getPageUrlApi() {
		return pageUrlApi;
	}
	public void setPageUrlApi(String o) {
		this.pageUrlApi = SystemEvent.staticSetPageUrlApi(siteRequest_, o);
	}
	public static String staticSetPageUrlApi(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SystemEvent pageUrlApiInit() {
		Wrap<String> pageUrlApiWrap = new Wrap<String>().var("pageUrlApi");
		if(pageUrlApi == null) {
			_pageUrlApi(pageUrlApiWrap);
			Optional.ofNullable(pageUrlApiWrap.getO()).ifPresent(o -> {
				setPageUrlApi(o);
			});
		}
		return (SystemEvent)this;
	}

	public static String staticSearchPageUrlApi(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUrlApi(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUrlApi(SiteRequestEnUS siteRequest_, String o) {
		return SystemEvent.staticSearchStrPageUrlApi(siteRequest_, SystemEvent.staticSearchPageUrlApi(siteRequest_, SystemEvent.staticSetPageUrlApi(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEvent&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = SystemEvent.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SystemEvent idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			Optional.ofNullable(idWrap.getO()).ifPresent(o -> {
				setId(o);
			});
		}
		return (SystemEvent)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return SystemEvent.staticSearchStrId(siteRequest_, SystemEvent.staticSearchId(siteRequest_, SystemEvent.staticSetId(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepSystemEvent(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepSystemEvent();
	}

	public Future<Void> promiseDeepSystemEvent() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseSystemEvent(promise2);
		promise2.future().onSuccess(a -> {
			promise.complete();
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseSystemEvent(Promise<Void> promise) {
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
				typeInit();
				messageInit();
				statusInit();
				completedInit();
				inheritPkInit();
				createdInit();
				modifiedInit();
				pageImageUriInit();
				pageImageWidthInit();
				pageImageHeightInit();
				pageImageTypeInit();
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
		return promiseDeepSystemEvent(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestSystemEvent(SiteRequestEnUS siteRequest_) {
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestSystemEvent(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainSystemEvent(v);
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
	public Object obtainSystemEvent(String var) {
		SystemEvent oSystemEvent = (SystemEvent)this;
		switch(var) {
			case "siteRequest_":
				return oSystemEvent.siteRequest_;
			case "promiseBefore":
				return oSystemEvent.promiseBefore;
			case "type":
				return oSystemEvent.type;
			case "message":
				return oSystemEvent.message;
			case "status":
				return oSystemEvent.status;
			case "completed":
				return oSystemEvent.completed;
			case "inheritPk":
				return oSystemEvent.inheritPk;
			case "created":
				return oSystemEvent.created;
			case "modified":
				return oSystemEvent.modified;
			case "pageImageUri":
				return oSystemEvent.pageImageUri;
			case "pageImageWidth":
				return oSystemEvent.pageImageWidth;
			case "pageImageHeight":
				return oSystemEvent.pageImageHeight;
			case "pageImageType":
				return oSystemEvent.pageImageType;
			case "archived":
				return oSystemEvent.archived;
			case "deleted":
				return oSystemEvent.deleted;
			case "classCanonicalName":
				return oSystemEvent.classCanonicalName;
			case "classSimpleName":
				return oSystemEvent.classSimpleName;
			case "classCanonicalNames":
				return oSystemEvent.classCanonicalNames;
			case "sessionId":
				return oSystemEvent.sessionId;
			case "userKey":
				return oSystemEvent.userKey;
			case "saves":
				return oSystemEvent.saves;
			case "objectTitle":
				return oSystemEvent.objectTitle;
			case "objectId":
				return oSystemEvent.objectId;
			case "objectSuggest":
				return oSystemEvent.objectSuggest;
			case "objectText":
				return oSystemEvent.objectText;
			case "pageUrlId":
				return oSystemEvent.pageUrlId;
			case "pageUrlPk":
				return oSystemEvent.pageUrlPk;
			case "pageUrlApi":
				return oSystemEvent.pageUrlApi;
			case "id":
				return oSystemEvent.id;
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
				o = relateSystemEvent(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateSystemEvent(String var, Object val) {
		SystemEvent oSystemEvent = (SystemEvent)this;
		switch(var) {
			default:
				return null;
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetSystemEvent(entityVar,  siteRequest_, o);
	}
	public static Object staticSetSystemEvent(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "type":
			return SystemEvent.staticSetType(siteRequest_, o);
		case "message":
			return SystemEvent.staticSetMessage(siteRequest_, o);
		case "status":
			return SystemEvent.staticSetStatus(siteRequest_, o);
		case "completed":
			return SystemEvent.staticSetCompleted(siteRequest_, o);
		case "inheritPk":
			return SystemEvent.staticSetInheritPk(siteRequest_, o);
		case "created":
			return SystemEvent.staticSetCreated(siteRequest_, o);
		case "modified":
			return SystemEvent.staticSetModified(siteRequest_, o);
		case "pageImageUri":
			return SystemEvent.staticSetPageImageUri(siteRequest_, o);
		case "pageImageWidth":
			return SystemEvent.staticSetPageImageWidth(siteRequest_, o);
		case "pageImageHeight":
			return SystemEvent.staticSetPageImageHeight(siteRequest_, o);
		case "pageImageType":
			return SystemEvent.staticSetPageImageType(siteRequest_, o);
		case "archived":
			return SystemEvent.staticSetArchived(siteRequest_, o);
		case "deleted":
			return SystemEvent.staticSetDeleted(siteRequest_, o);
		case "classCanonicalName":
			return SystemEvent.staticSetClassCanonicalName(siteRequest_, o);
		case "classSimpleName":
			return SystemEvent.staticSetClassSimpleName(siteRequest_, o);
		case "classCanonicalNames":
			return SystemEvent.staticSetClassCanonicalNames(siteRequest_, o);
		case "sessionId":
			return SystemEvent.staticSetSessionId(siteRequest_, o);
		case "userKey":
			return SystemEvent.staticSetUserKey(siteRequest_, o);
		case "saves":
			return SystemEvent.staticSetSaves(siteRequest_, o);
		case "objectTitle":
			return SystemEvent.staticSetObjectTitle(siteRequest_, o);
		case "objectId":
			return SystemEvent.staticSetObjectId(siteRequest_, o);
		case "objectSuggest":
			return SystemEvent.staticSetObjectSuggest(siteRequest_, o);
		case "objectText":
			return SystemEvent.staticSetObjectText(siteRequest_, o);
		case "pageUrlId":
			return SystemEvent.staticSetPageUrlId(siteRequest_, o);
		case "pageUrlPk":
			return SystemEvent.staticSetPageUrlPk(siteRequest_, o);
		case "pageUrlApi":
			return SystemEvent.staticSetPageUrlApi(siteRequest_, o);
		case "id":
			return SystemEvent.staticSetId(siteRequest_, o);
			default:
				return null;
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchSystemEvent(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchSystemEvent(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "type":
			return SystemEvent.staticSearchType(siteRequest_, (String)o);
		case "message":
			return SystemEvent.staticSearchMessage(siteRequest_, (String)o);
		case "status":
			return SystemEvent.staticSearchStatus(siteRequest_, (String)o);
		case "completed":
			return SystemEvent.staticSearchCompleted(siteRequest_, (ZonedDateTime)o);
		case "inheritPk":
			return SystemEvent.staticSearchInheritPk(siteRequest_, (String)o);
		case "created":
			return SystemEvent.staticSearchCreated(siteRequest_, (ZonedDateTime)o);
		case "modified":
			return SystemEvent.staticSearchModified(siteRequest_, (ZonedDateTime)o);
		case "pageImageUri":
			return SystemEvent.staticSearchPageImageUri(siteRequest_, (String)o);
		case "pageImageWidth":
			return SystemEvent.staticSearchPageImageWidth(siteRequest_, (Integer)o);
		case "pageImageHeight":
			return SystemEvent.staticSearchPageImageHeight(siteRequest_, (Integer)o);
		case "pageImageType":
			return SystemEvent.staticSearchPageImageType(siteRequest_, (String)o);
		case "archived":
			return SystemEvent.staticSearchArchived(siteRequest_, (Boolean)o);
		case "deleted":
			return SystemEvent.staticSearchDeleted(siteRequest_, (Boolean)o);
		case "classCanonicalName":
			return SystemEvent.staticSearchClassCanonicalName(siteRequest_, (String)o);
		case "classSimpleName":
			return SystemEvent.staticSearchClassSimpleName(siteRequest_, (String)o);
		case "classCanonicalNames":
			return SystemEvent.staticSearchClassCanonicalNames(siteRequest_, (String)o);
		case "sessionId":
			return SystemEvent.staticSearchSessionId(siteRequest_, (String)o);
		case "userKey":
			return SystemEvent.staticSearchUserKey(siteRequest_, (Long)o);
		case "saves":
			return SystemEvent.staticSearchSaves(siteRequest_, (String)o);
		case "objectTitle":
			return SystemEvent.staticSearchObjectTitle(siteRequest_, (String)o);
		case "objectId":
			return SystemEvent.staticSearchObjectId(siteRequest_, (String)o);
		case "objectSuggest":
			return SystemEvent.staticSearchObjectSuggest(siteRequest_, (String)o);
		case "objectText":
			return SystemEvent.staticSearchObjectText(siteRequest_, (String)o);
		case "pageUrlId":
			return SystemEvent.staticSearchPageUrlId(siteRequest_, (String)o);
		case "pageUrlPk":
			return SystemEvent.staticSearchPageUrlPk(siteRequest_, (String)o);
		case "pageUrlApi":
			return SystemEvent.staticSearchPageUrlApi(siteRequest_, (String)o);
		case "id":
			return SystemEvent.staticSearchId(siteRequest_, (String)o);
			default:
				return null;
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrSystemEvent(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrSystemEvent(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "type":
			return SystemEvent.staticSearchStrType(siteRequest_, (String)o);
		case "message":
			return SystemEvent.staticSearchStrMessage(siteRequest_, (String)o);
		case "status":
			return SystemEvent.staticSearchStrStatus(siteRequest_, (String)o);
		case "completed":
			return SystemEvent.staticSearchStrCompleted(siteRequest_, (Date)o);
		case "inheritPk":
			return SystemEvent.staticSearchStrInheritPk(siteRequest_, (String)o);
		case "created":
			return SystemEvent.staticSearchStrCreated(siteRequest_, (Date)o);
		case "modified":
			return SystemEvent.staticSearchStrModified(siteRequest_, (Date)o);
		case "pageImageUri":
			return SystemEvent.staticSearchStrPageImageUri(siteRequest_, (String)o);
		case "pageImageWidth":
			return SystemEvent.staticSearchStrPageImageWidth(siteRequest_, (Integer)o);
		case "pageImageHeight":
			return SystemEvent.staticSearchStrPageImageHeight(siteRequest_, (Integer)o);
		case "pageImageType":
			return SystemEvent.staticSearchStrPageImageType(siteRequest_, (String)o);
		case "archived":
			return SystemEvent.staticSearchStrArchived(siteRequest_, (Boolean)o);
		case "deleted":
			return SystemEvent.staticSearchStrDeleted(siteRequest_, (Boolean)o);
		case "classCanonicalName":
			return SystemEvent.staticSearchStrClassCanonicalName(siteRequest_, (String)o);
		case "classSimpleName":
			return SystemEvent.staticSearchStrClassSimpleName(siteRequest_, (String)o);
		case "classCanonicalNames":
			return SystemEvent.staticSearchStrClassCanonicalNames(siteRequest_, (String)o);
		case "sessionId":
			return SystemEvent.staticSearchStrSessionId(siteRequest_, (String)o);
		case "userKey":
			return SystemEvent.staticSearchStrUserKey(siteRequest_, (Long)o);
		case "saves":
			return SystemEvent.staticSearchStrSaves(siteRequest_, (String)o);
		case "objectTitle":
			return SystemEvent.staticSearchStrObjectTitle(siteRequest_, (String)o);
		case "objectId":
			return SystemEvent.staticSearchStrObjectId(siteRequest_, (String)o);
		case "objectSuggest":
			return SystemEvent.staticSearchStrObjectSuggest(siteRequest_, (String)o);
		case "objectText":
			return SystemEvent.staticSearchStrObjectText(siteRequest_, (String)o);
		case "pageUrlId":
			return SystemEvent.staticSearchStrPageUrlId(siteRequest_, (String)o);
		case "pageUrlPk":
			return SystemEvent.staticSearchStrPageUrlPk(siteRequest_, (String)o);
		case "pageUrlApi":
			return SystemEvent.staticSearchStrPageUrlApi(siteRequest_, (String)o);
		case "id":
			return SystemEvent.staticSearchStrId(siteRequest_, (String)o);
			default:
				return null;
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqSystemEvent(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqSystemEvent(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "type":
			return SystemEvent.staticSearchFqType(siteRequest_, o);
		case "message":
			return SystemEvent.staticSearchFqMessage(siteRequest_, o);
		case "status":
			return SystemEvent.staticSearchFqStatus(siteRequest_, o);
		case "completed":
			return SystemEvent.staticSearchFqCompleted(siteRequest_, o);
		case "inheritPk":
			return SystemEvent.staticSearchFqInheritPk(siteRequest_, o);
		case "created":
			return SystemEvent.staticSearchFqCreated(siteRequest_, o);
		case "modified":
			return SystemEvent.staticSearchFqModified(siteRequest_, o);
		case "pageImageUri":
			return SystemEvent.staticSearchFqPageImageUri(siteRequest_, o);
		case "pageImageWidth":
			return SystemEvent.staticSearchFqPageImageWidth(siteRequest_, o);
		case "pageImageHeight":
			return SystemEvent.staticSearchFqPageImageHeight(siteRequest_, o);
		case "pageImageType":
			return SystemEvent.staticSearchFqPageImageType(siteRequest_, o);
		case "archived":
			return SystemEvent.staticSearchFqArchived(siteRequest_, o);
		case "deleted":
			return SystemEvent.staticSearchFqDeleted(siteRequest_, o);
		case "classCanonicalName":
			return SystemEvent.staticSearchFqClassCanonicalName(siteRequest_, o);
		case "classSimpleName":
			return SystemEvent.staticSearchFqClassSimpleName(siteRequest_, o);
		case "classCanonicalNames":
			return SystemEvent.staticSearchFqClassCanonicalNames(siteRequest_, o);
		case "sessionId":
			return SystemEvent.staticSearchFqSessionId(siteRequest_, o);
		case "userKey":
			return SystemEvent.staticSearchFqUserKey(siteRequest_, o);
		case "saves":
			return SystemEvent.staticSearchFqSaves(siteRequest_, o);
		case "objectTitle":
			return SystemEvent.staticSearchFqObjectTitle(siteRequest_, o);
		case "objectId":
			return SystemEvent.staticSearchFqObjectId(siteRequest_, o);
		case "objectSuggest":
			return SystemEvent.staticSearchFqObjectSuggest(siteRequest_, o);
		case "objectText":
			return SystemEvent.staticSearchFqObjectText(siteRequest_, o);
		case "pageUrlId":
			return SystemEvent.staticSearchFqPageUrlId(siteRequest_, o);
		case "pageUrlPk":
			return SystemEvent.staticSearchFqPageUrlPk(siteRequest_, o);
		case "pageUrlApi":
			return SystemEvent.staticSearchFqPageUrlApi(siteRequest_, o);
		case "id":
			return SystemEvent.staticSearchFqId(siteRequest_, o);
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
					o = persistSystemEvent(v, val);
				else if(o instanceof BaseModel) {
					BaseModel oBaseModel = (BaseModel)o;
					o = oBaseModel.persistForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object persistSystemEvent(String var, Object val) {
		String varLower = var.toLowerCase();
			if("type".equals(varLower)) {
				if(val instanceof String) {
					setType((String)val);
				}
				saves.add("type");
				return val;
			} else if("message".equals(varLower)) {
				if(val instanceof String) {
					setMessage((String)val);
				}
				saves.add("message");
				return val;
			} else if("status".equals(varLower)) {
				if(val instanceof String) {
					setStatus((String)val);
				}
				saves.add("status");
				return val;
			} else if("completed".equals(varLower)) {
				if(val instanceof String) {
					setCompleted((String)val);
				} else if(val instanceof OffsetDateTime) {
					setCompleted(((OffsetDateTime)val).atZoneSameInstant(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))));
				}
				saves.add("completed");
				return val;
			} else if("inheritpk".equals(varLower)) {
				if(val instanceof String) {
					setInheritPk((String)val);
				}
				saves.add("inheritPk");
				return val;
			} else if("created".equals(varLower)) {
				if(val instanceof String) {
					setCreated((String)val);
				} else if(val instanceof OffsetDateTime) {
					setCreated(((OffsetDateTime)val).atZoneSameInstant(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))));
				}
				saves.add("created");
				return val;
			} else if("pageimageuri".equals(varLower)) {
				if(val instanceof String) {
					setPageImageUri((String)val);
				}
				saves.add("pageImageUri");
				return val;
			} else if("archived".equals(varLower)) {
				if(val instanceof Boolean) {
					setArchived((Boolean)val);
				} else {
					setArchived(val == null ? null : val.toString());
				}
				saves.add("archived");
				return val;
			} else if("deleted".equals(varLower)) {
				if(val instanceof Boolean) {
					setDeleted((Boolean)val);
				} else {
					setDeleted(val == null ? null : val.toString());
				}
				saves.add("deleted");
				return val;
			} else if("sessionid".equals(varLower)) {
				if(val instanceof String) {
					setSessionId((String)val);
				}
				saves.add("sessionId");
				return val;
			} else if("userkey".equals(varLower)) {
				if(val instanceof Long) {
					setUserKey((Long)val);
				} else {
					setUserKey(val == null ? null : val.toString());
				}
				saves.add("userKey");
				return val;
			} else if("objectid".equals(varLower)) {
				if(val instanceof String) {
					setObjectId((String)val);
				}
				saves.add("objectId");
				return val;
			} else if("objecttext".equals(varLower)) {
				if(val instanceof List<?>) {
					((List<String>)val).stream().forEach(v -> addObjectText(v));
				} else if(val instanceof JsonArray) {
					((JsonArray)val).stream().forEach(v -> setObjectText(v.toString()));
				} else if(val instanceof String[]) {
					Arrays.asList((String[])val).stream().forEach(v -> setObjectText((String)v));
				}
				if(!saves.contains("objectText")) {
					saves.add("objectText");
				}
				return val;
		} else {
			return null;
		}
	}

	/////////////
	// populate //
	/////////////

	public void populateForClass(SolrResponse.Doc doc) {
		populateSystemEvent(doc);
	}
	public void populateSystemEvent(SolrResponse.Doc doc) {
		SystemEvent oSystemEvent = (SystemEvent)this;
		saves = doc.get("saves_docvalues_strings");
		if(saves != null) {

			if(saves.contains("type")) {
				String type = (String)doc.get("type_docvalues_string");
				if(type != null)
					oSystemEvent.setType(type);
			}

			if(saves.contains("message")) {
				String message = (String)doc.get("message_stored_string");
				if(message != null)
					oSystemEvent.setMessage(message);
			}

			if(saves.contains("status")) {
				String status = (String)doc.get("status_stored_string");
				if(status != null)
					oSystemEvent.setStatus(status);
			}

			if(saves.contains("completed")) {
				Date completed = (Date)doc.get("completed_docvalues_date");
				if(completed != null)
					oSystemEvent.setCompleted(completed);
			}

			if(saves.contains("inheritPk")) {
				String inheritPk = (String)doc.get("inheritPk_docvalues_string");
				if(inheritPk != null)
					oSystemEvent.setInheritPk(inheritPk);
			}

			if(saves.contains("created")) {
				Date created = (Date)doc.get("created_docvalues_date");
				if(created != null)
					oSystemEvent.setCreated(created);
			}

			if(saves.contains("modified")) {
				Date modified = (Date)doc.get("modified_docvalues_date");
				if(modified != null)
					oSystemEvent.setModified(modified);
			}

			if(saves.contains("pageImageUri")) {
				String pageImageUri = (String)doc.get("pageImageUri_docvalues_string");
				if(pageImageUri != null)
					oSystemEvent.setPageImageUri(pageImageUri);
			}

			if(saves.contains("archived")) {
				Boolean archived = (Boolean)doc.get("archived_docvalues_boolean");
				if(archived != null)
					oSystemEvent.setArchived(archived);
			}

			if(saves.contains("deleted")) {
				Boolean deleted = (Boolean)doc.get("deleted_docvalues_boolean");
				if(deleted != null)
					oSystemEvent.setDeleted(deleted);
			}

			if(saves.contains("classCanonicalName")) {
				String classCanonicalName = (String)doc.get("classCanonicalName_docvalues_string");
				if(classCanonicalName != null)
					oSystemEvent.setClassCanonicalName(classCanonicalName);
			}

			if(saves.contains("classSimpleName")) {
				String classSimpleName = (String)doc.get("classSimpleName_docvalues_string");
				if(classSimpleName != null)
					oSystemEvent.setClassSimpleName(classSimpleName);
			}

			if(saves.contains("classCanonicalNames")) {
				List<String> classCanonicalNames = (List<String>)doc.get("classCanonicalNames_docvalues_strings");
				if(classCanonicalNames != null)
					oSystemEvent.classCanonicalNames.addAll(classCanonicalNames);
			}

			if(saves.contains("sessionId")) {
				String sessionId = (String)doc.get("sessionId_docvalues_string");
				if(sessionId != null)
					oSystemEvent.setSessionId(sessionId);
			}

			if(saves.contains("userKey")) {
				Long userKey = (Long)doc.get("userKey_docvalues_long");
				if(userKey != null)
					oSystemEvent.setUserKey(userKey);
			}

			if(saves.contains("saves")) {
				List<String> saves = (List<String>)doc.get("saves_docvalues_strings");
				if(saves != null)
					oSystemEvent.saves.addAll(saves);
			}

			if(saves.contains("objectTitle")) {
				String objectTitle = (String)doc.get("objectTitle_docvalues_string");
				if(objectTitle != null)
					oSystemEvent.setObjectTitle(objectTitle);
			}

			if(saves.contains("objectId")) {
				String objectId = (String)doc.get("objectId_docvalues_string");
				if(objectId != null)
					oSystemEvent.setObjectId(objectId);
			}

			if(saves.contains("objectSuggest")) {
				String objectSuggest = (String)doc.get("objectSuggest_suggested");
				oSystemEvent.setObjectSuggest(objectSuggest);
			}

			if(saves.contains("pageUrlId")) {
				String pageUrlId = (String)doc.get("pageUrlId_docvalues_string");
				if(pageUrlId != null)
					oSystemEvent.setPageUrlId(pageUrlId);
			}

			if(saves.contains("pageUrlPk")) {
				String pageUrlPk = (String)doc.get("pageUrlPk_docvalues_string");
				if(pageUrlPk != null)
					oSystemEvent.setPageUrlPk(pageUrlPk);
			}

			if(saves.contains("pageUrlApi")) {
				String pageUrlApi = (String)doc.get("pageUrlApi_docvalues_string");
				if(pageUrlApi != null)
					oSystemEvent.setPageUrlApi(pageUrlApi);
			}

			String id = (String)doc.get("id");
			oSystemEvent.setId(id);
		}
	}

	public void indexSystemEvent(JsonObject doc) {
		if(type != null) {
			doc.put("type_docvalues_string", type);
		}
		if(message != null) {
			doc.put("message_stored_string", message);
		}
		if(status != null) {
			doc.put("status_stored_string", status);
		}
		if(completed != null) {
			doc.put("completed_docvalues_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(ZonedDateTime.ofInstant(completed.toInstant(), ZoneId.of("UTC"))));
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
		if(pageImageUri != null) {
			doc.put("pageImageUri_docvalues_string", pageImageUri);
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
			JsonArray l = new JsonArray();
			doc.put("objectText_text_enUS", l);
			for(String o : objectText) {
				l.add(o);
			}
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

	public static String varStoredSystemEvent(String entityVar) {
		switch(entityVar) {
			case "type":
				return "type_docvalues_string";
			case "message":
				return "message_stored_string";
			case "status":
				return "status_stored_string";
			case "completed":
				return "completed_docvalues_date";
			case "inheritPk":
				return "inheritPk_docvalues_string";
			case "created":
				return "created_docvalues_date";
			case "modified":
				return "modified_docvalues_date";
			case "pageImageUri":
				return "pageImageUri_docvalues_string";
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

	public static String varIndexedSystemEvent(String entityVar) {
		switch(entityVar) {
			case "type":
				return "type_docvalues_string";
			case "completed":
				return "completed_docvalues_date";
			case "inheritPk":
				return "inheritPk_docvalues_string";
			case "created":
				return "created_docvalues_date";
			case "modified":
				return "modified_docvalues_date";
			case "pageImageUri":
				return "pageImageUri_docvalues_string";
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

	public static String searchVarSystemEvent(String searchVar) {
		switch(searchVar) {
			case "type_docvalues_string":
				return "type";
			case "completed_docvalues_date":
				return "completed";
			case "inheritPk_docvalues_string":
				return "inheritPk";
			case "created_docvalues_date":
				return "created";
			case "modified_docvalues_date":
				return "modified";
			case "pageImageUri_docvalues_string":
				return "pageImageUri";
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

	public static String varSearchSystemEvent(String entityVar) {
		switch(entityVar) {
			case "objectText":
				return "objectText_text_enUS";
			case "objectSuggest":
				return "objectSuggest_suggested";
			default:
				return null;
		}
	}

	public static String varSuggestedSystemEvent(String entityVar) {
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
		storeSystemEvent(doc);
	}
	public void storeSystemEvent(SolrResponse.Doc doc) {
		SystemEvent oSystemEvent = (SystemEvent)this;

		oSystemEvent.setType(Optional.ofNullable(doc.get("type_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSystemEvent.setMessage(Optional.ofNullable(doc.get("message_stored_string")).map(v -> v.toString()).orElse(null));
		oSystemEvent.setStatus(Optional.ofNullable(doc.get("status_stored_string")).map(v -> v.toString()).orElse(null));
		oSystemEvent.setCompleted(Optional.ofNullable(doc.get("completed_docvalues_date")).map(v -> v.toString()).orElse(null));
		oSystemEvent.setInheritPk(Optional.ofNullable(doc.get("inheritPk_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSystemEvent.setCreated(Optional.ofNullable(doc.get("created_docvalues_date")).map(v -> v.toString()).orElse(null));
		oSystemEvent.setModified(Optional.ofNullable(doc.get("modified_docvalues_date")).map(v -> v.toString()).orElse(null));
		oSystemEvent.setPageImageUri(Optional.ofNullable(doc.get("pageImageUri_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSystemEvent.setArchived(Optional.ofNullable(doc.get("archived_docvalues_boolean")).map(v -> v.toString()).orElse(null));
		oSystemEvent.setDeleted(Optional.ofNullable(doc.get("deleted_docvalues_boolean")).map(v -> v.toString()).orElse(null));
		oSystemEvent.setClassCanonicalName(Optional.ofNullable(doc.get("classCanonicalName_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSystemEvent.setClassSimpleName(Optional.ofNullable(doc.get("classSimpleName_docvalues_string")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("classCanonicalNames_docvalues_strings")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oSystemEvent.addClassCanonicalNames(v.toString());
		});
		oSystemEvent.setSessionId(Optional.ofNullable(doc.get("sessionId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSystemEvent.setUserKey(Optional.ofNullable(doc.get("userKey_docvalues_long")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("saves_docvalues_strings")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oSystemEvent.addSaves(v.toString());
		});
		oSystemEvent.setObjectTitle(Optional.ofNullable(doc.get("objectTitle_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSystemEvent.setObjectId(Optional.ofNullable(doc.get("objectId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSystemEvent.setObjectSuggest(Optional.ofNullable(doc.get("objectSuggest_suggested")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("objectText_text_enUS")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oSystemEvent.addObjectText(v.toString());
		});
		oSystemEvent.setPageUrlId(Optional.ofNullable(doc.get("pageUrlId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSystemEvent.setPageUrlPk(Optional.ofNullable(doc.get("pageUrlPk_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSystemEvent.setPageUrlApi(Optional.ofNullable(doc.get("pageUrlApi_docvalues_string")).map(v -> v.toString()).orElse(null));
		String id = (String)doc.get("id");
		oSystemEvent.setId(id);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestSystemEvent() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof SystemEvent) {
			SystemEvent original = (SystemEvent)o;
			if(!Objects.equals(type, original.getType()))
				apiRequest.addVars("type");
			if(!Objects.equals(message, original.getMessage()))
				apiRequest.addVars("message");
			if(!Objects.equals(status, original.getStatus()))
				apiRequest.addVars("status");
			if(!Objects.equals(completed, original.getCompleted()))
				apiRequest.addVars("completed");
			if(!Objects.equals(inheritPk, original.getInheritPk()))
				apiRequest.addVars("inheritPk");
			if(!Objects.equals(created, original.getCreated()))
				apiRequest.addVars("created");
			if(!Objects.equals(modified, original.getModified()))
				apiRequest.addVars("modified");
			if(!Objects.equals(pageImageUri, original.getPageImageUri()))
				apiRequest.addVars("pageImageUri");
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
		sb.append(Optional.ofNullable(type).map(v -> "type: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(message).map(v -> "message: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(status).map(v -> "status: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(completed).map(v -> "completed: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(inheritPk).map(v -> "inheritPk: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(created).map(v -> "created: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(modified).map(v -> "modified: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pageImageUri).map(v -> "pageImageUri: \"" + v + "\"\n" ).orElse(""));
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
		sb.append(Optional.ofNullable(objectText).map(v -> "objectText: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pageUrlId).map(v -> "pageUrlId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(pageUrlPk).map(v -> "pageUrlPk: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(pageUrlApi).map(v -> "pageUrlApi: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(id).map(v -> "id: \"" + v + "\"\n" ).orElse(""));
		return sb.toString();
	}

	public static final String[] SystemEventVals = new String[] { statusStarted1_enUS, statusCompleted1_enUS, statusError1_enUS };

	public static final String CLASS_SIMPLE_NAME = "SystemEvent";
	public static final String VAR_siteRequest_ = "siteRequest_";
	public static final String VAR_promiseBefore = "promiseBefore";
	public static final String VAR_type = "type";
	public static final String VAR_message = "message";
	public static final String VAR_status = "status";
	public static final String VAR_completed = "completed";
	public static final String VAR_inheritPk = "inheritPk";
	public static final String VAR_created = "created";
	public static final String VAR_modified = "modified";
	public static final String VAR_pageImageUri = "pageImageUri";
	public static final String VAR_pageImageWidth = "pageImageWidth";
	public static final String VAR_pageImageHeight = "pageImageHeight";
	public static final String VAR_pageImageType = "pageImageType";
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
	public static final String VAR_objectSuggest = "objectSuggest";
	public static final String VAR_objectText = "objectText";
	public static final String VAR_pageUrlId = "pageUrlId";
	public static final String VAR_pageUrlPk = "pageUrlPk";
	public static final String VAR_pageUrlApi = "pageUrlApi";
	public static final String VAR_id = "id";

	public static List<String> varsQForClass() {
		return SystemEvent.varsQSystemEvent(new ArrayList<String>());
	}
	public static List<String> varsQSystemEvent(List<String> vars) {
		vars.add(VAR_objectSuggest);
		vars.add(VAR_objectText);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return SystemEvent.varsFqSystemEvent(new ArrayList<String>());
	}
	public static List<String> varsFqSystemEvent(List<String> vars) {
		vars.add(VAR_completed);
		vars.add(VAR_created);
		vars.add(VAR_pageImageUri);
		vars.add(VAR_classSimpleName);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return SystemEvent.varsRangeSystemEvent(new ArrayList<String>());
	}
	public static List<String> varsRangeSystemEvent(List<String> vars) {
		vars.add(VAR_completed);
		vars.add(VAR_created);
		return vars;
	}

	public static final String DISPLAY_NAME_siteRequest_ = "";
	public static final String DISPLAY_NAME_promiseBefore = "";
	public static final String DISPLAY_NAME_type = "type";
	public static final String DISPLAY_NAME_message = "message";
	public static final String DISPLAY_NAME_status = "message";
	public static final String DISPLAY_NAME_completed = "completed";
	public static final String DISPLAY_NAME_inheritPk = "";
	public static final String DISPLAY_NAME_created = "created";
	public static final String DISPLAY_NAME_modified = "modified";
	public static final String DISPLAY_NAME_pageImageUri = "imageUri";
	public static final String DISPLAY_NAME_pageImageWidth = "";
	public static final String DISPLAY_NAME_pageImageHeight = "";
	public static final String DISPLAY_NAME_pageImageType = "";
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
	public static final String DISPLAY_NAME_objectSuggest = "autosuggest";
	public static final String DISPLAY_NAME_objectText = "text";
	public static final String DISPLAY_NAME_pageUrlId = "";
	public static final String DISPLAY_NAME_pageUrlPk = "";
	public static final String DISPLAY_NAME_pageUrlApi = "";
	public static final String DISPLAY_NAME_id = "";

	public static String displayNameForClass(String var) {
		return SystemEvent.displayNameSystemEvent(var);
	}
	public static String displayNameSystemEvent(String var) {
		switch(var) {
		case VAR_siteRequest_:
			return DISPLAY_NAME_siteRequest_;
		case VAR_promiseBefore:
			return DISPLAY_NAME_promiseBefore;
		case VAR_type:
			return DISPLAY_NAME_type;
		case VAR_message:
			return DISPLAY_NAME_message;
		case VAR_status:
			return DISPLAY_NAME_status;
		case VAR_completed:
			return DISPLAY_NAME_completed;
		case VAR_inheritPk:
			return DISPLAY_NAME_inheritPk;
		case VAR_created:
			return DISPLAY_NAME_created;
		case VAR_modified:
			return DISPLAY_NAME_modified;
		case VAR_pageImageUri:
			return DISPLAY_NAME_pageImageUri;
		case VAR_pageImageWidth:
			return DISPLAY_NAME_pageImageWidth;
		case VAR_pageImageHeight:
			return DISPLAY_NAME_pageImageHeight;
		case VAR_pageImageType:
			return DISPLAY_NAME_pageImageType;
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

	public static String descriptionSystemEvent(String var) {
		switch(var) {
		case VAR_siteRequest_:
			return "The current request object";
		case VAR_promiseBefore:
			return "An asynchronous method for searching for a computer related to this message";
		case VAR_type:
			return "The system event type";
		case VAR_message:
			return "The system event message";
		case VAR_status:
			return "The system event message";
		case VAR_completed:
			return "An optional time this event completed";
		case VAR_inheritPk:
			return "An optional inherited primary key from a legacy system for this object in the database";
		case VAR_created:
			return "A created timestamp for this record in the database";
		case VAR_modified:
			return "A modified timestamp for this record in the database";
		case VAR_pageImageUri:
			return "The page image URI";
		case VAR_pageImageWidth:
			return "The image width";
		case VAR_pageImageHeight:
			return "The image height";
		case VAR_pageImageType:
			return "The image height";
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

	public static String classSimpleNameSystemEvent(String var) {
		switch(var) {
		case VAR_siteRequest_:
			return "SiteRequestEnUS";
		case VAR_promiseBefore:
			return "Void";
		case VAR_type:
			return "String";
		case VAR_message:
			return "String";
		case VAR_status:
			return "String";
		case VAR_completed:
			return "ZonedDateTime";
		case VAR_inheritPk:
			return "String";
		case VAR_created:
			return "ZonedDateTime";
		case VAR_modified:
			return "ZonedDateTime";
		case VAR_pageImageUri:
			return "String";
		case VAR_pageImageWidth:
			return "Integer";
		case VAR_pageImageHeight:
			return "Integer";
		case VAR_pageImageType:
			return "String";
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
		case VAR_objectSuggest:
			return "String";
		case VAR_objectText:
			return "List";
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

	public static Integer htmColumnSystemEvent(String var) {
		switch(var) {
		case VAR_type:
			return 2;
		case VAR_message:
			return 3;
		case VAR_status:
			return 3;
		case VAR_completed:
			return 4;
		case VAR_created:
			return 1;
		case VAR_objectTitle:
			return 2;
			default:
				return null;
		}
	}

	public static Integer htmRowSystemEvent(String var) {
		switch(var) {
		case VAR_type:
			return 3;
		case VAR_message:
			return 3;
		case VAR_status:
			return 3;
		case VAR_completed:
			return 3;
		case VAR_created:
			return 1;
		case VAR_modified:
			return 1;
		case VAR_pageImageUri:
			return 4;
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

	public static Integer htmCellSystemEvent(String var) {
		switch(var) {
		case VAR_type:
			return 1;
		case VAR_message:
			return 2;
		case VAR_status:
			return 2;
		case VAR_completed:
			return 3;
		case VAR_created:
			return 4;
		case VAR_modified:
			return 3;
		case VAR_pageImageUri:
			return 1;
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

	public static Integer lengthMinSystemEvent(String var) {
		switch(var) {
			default:
				return null;
		}
	}

	public static Integer lengthMaxSystemEvent(String var) {
		switch(var) {
			default:
				return null;
		}
	}

	public static Integer maxSystemEvent(String var) {
		switch(var) {
			default:
				return null;
		}
	}

	public static Integer minSystemEvent(String var) {
		switch(var) {
			default:
				return null;
		}
	}
}
