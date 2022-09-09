package org.computate.smartvillageview.enus.model.page;

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
import java.lang.String;
import java.lang.Void;
import java.lang.Integer;
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
import java.lang.Long;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;
import io.vertx.core.json.JsonObject;

/**	
 * <h1>Suggestions that can generate more code for you: </h1>
 * <ol>
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class SitePageGen into the class SitePage. 
 * </li>
 * <li>You can add a class comment "Model: true" if you wish to persist these SitePage objects in a relational PostgreSQL database transactionally in the RESTful API. 
 * The code to persist and query the SitePageGen data in the database will then be automatically generated. 
 * </li>
 * <li>You can add a class comment "Rows: 100" if you wish the SitePage API to return more or less than 10 records by default. 
 * In this case, the API will return 100 records from the API instead of 10 by default. 
 * Each API has built in pagination of the search records to ensure a user can query all the data a page at a time without running the application out of memory. 
 * </li>
 * </ol>
 * <h1>About the SitePage class and it's generated class SitePageGen&lt;Object&gt;: </h1>
 * <p>
 * This Java class extends a generated Java class built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage">Find the class SitePage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * <p>This class contains a comment "Indexed: true", which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * <p>This class contains a comment "Page: true", which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.smartvillageview.enus.model.page.SitePagePage. 
 * </p>
 * <p>This class contains a comment "SuperPage.enUS: PageLayout", which identifies the Java super class of the page code by it's class simple name "PageLayout". 
 * This means that the newly created class org.computate.smartvillageview.enus.model.page.SitePagePage extends org.computate.smartvillageview.enus.page.PageLayout. 
 * </p>
 * <p>This class contains a comment "Api: true", which means this class will have Java Vert.x API backend code generated for these objects. 
 * </p>
 * <p>This class contains a comment "ApiTag: Page", which groups all of the OpenAPIs for SitePage objects under the tag "Page". 
 * </p>
 * <p>This class contains a comment "ApiUri: /api/page", which defines the base API URI for SitePage objects as "/api/page" in the OpenAPI spec. 
 * </p>
 * <p>
 * Delete the class SitePage in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.page in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.page&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smart-village-view in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smart\-village\-view&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class SitePageGen<DEV> extends Object {
	protected static final Logger LOG = LoggerFactory.getLogger(SitePage.class);

	public static final String SitePage_Description_enUS = "An article in the site. ";
	public static final String SitePage_AName_enUS = "an article";
	public static final String SitePage_This_enUS = "this ";
	public static final String SitePage_ThisName_enUS = "this article";
	public static final String SitePage_A_enUS = "a ";
	public static final String SitePage_TheName_enUS = "thearticle";
	public static final String SitePage_NameSingular_enUS = "article";
	public static final String SitePage_NamePlural_enUS = "articles";
	public static final String SitePage_NameActual_enUS = "current article";
	public static final String SitePage_AllName_enUS = "all the articles";
	public static final String SitePage_SearchAllNameBy_enUS = "search articles by ";
	public static final String SitePage_Title_enUS = "articles";
	public static final String SitePage_ThePluralName_enUS = "the articles";
	public static final String SitePage_NoNameFound_enUS = "no article found";
	public static final String SitePage_ApiUri_enUS = "/api/page";
	public static final String SitePage_ApiUriSearchPage_enUS = "/page";
	public static final String SitePage_OfName_enUS = "of article";
	public static final String SitePage_ANameAdjective_enUS = "an article";
	public static final String SitePage_NameAdjectiveSingular_enUS = "article";
	public static final String SitePage_NameAdjectivePlural_enUS = "articles";
	public static final String Search_enUS_Uri = "/api/page";
	public static final String Search_enUS_ImageUri = "/png/api/page-999.png";
	public static final String GET_enUS_Uri = "/api/page/{id}";
	public static final String GET_enUS_ImageUri = "/png/api/page/{id}-999.png";
	public static final String POST_enUS_Uri = "/api/page";
	public static final String POST_enUS_ImageUri = "/png/api/page-999.png";
	public static final String PATCH_enUS_Uri = "/api/page";
	public static final String PATCH_enUS_ImageUri = "/png/api/page-999.png";
	public static final String PUTImport_enUS_Uri = "/api/page-import";
	public static final String PUTImport_enUS_ImageUri = "/png/api/page-import-999.png";
	public static final String SearchPage_enUS_Uri = "/page";
	public static final String SearchPage_enUS_ImageUri = "/png/page-999.png";

	public static final String SitePage_Color = "2017-navy-peony";
	public static final String SitePage_IconGroup = "duotone";
	public static final String SitePage_IconName = "newspaper";

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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:siteRequest_">Find the entity siteRequest_ in Solr</a>
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
	protected SitePage siteRequest_Init() {
		Wrap<SiteRequestEnUS> siteRequest_Wrap = new Wrap<SiteRequestEnUS>().var("siteRequest_");
		if(siteRequest_ == null) {
			_siteRequest_(siteRequest_Wrap);
			setSiteRequest_(siteRequest_Wrap.o);
		}
		return (SitePage)this;
	}

	//////////////
	// siteName //
	//////////////

	/**	 The entity siteName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String siteName;

	/**	<br> The entity siteName
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:siteName">Find the entity siteName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _siteName(Wrap<String> w);

	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String o) {
		this.siteName = SitePage.staticSetSiteName(siteRequest_, o);
	}
	public static String staticSetSiteName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SitePage siteNameInit() {
		Wrap<String> siteNameWrap = new Wrap<String>().var("siteName");
		if(siteName == null) {
			_siteName(siteNameWrap);
			setSiteName(siteNameWrap.o);
		}
		return (SitePage)this;
	}

	public static String staticSearchSiteName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSiteName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSiteName(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrSiteName(siteRequest_, SitePage.staticSearchSiteName(siteRequest_, SitePage.staticSetSiteName(siteRequest_, o)));
	}

	/////////////////////
	// siteDisplayName //
	/////////////////////

	/**	 The entity siteDisplayName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String siteDisplayName;

	/**	<br> The entity siteDisplayName
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:siteDisplayName">Find the entity siteDisplayName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _siteDisplayName(Wrap<String> w);

	public String getSiteDisplayName() {
		return siteDisplayName;
	}
	public void setSiteDisplayName(String o) {
		this.siteDisplayName = SitePage.staticSetSiteDisplayName(siteRequest_, o);
	}
	public static String staticSetSiteDisplayName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SitePage siteDisplayNameInit() {
		Wrap<String> siteDisplayNameWrap = new Wrap<String>().var("siteDisplayName");
		if(siteDisplayName == null) {
			_siteDisplayName(siteDisplayNameWrap);
			setSiteDisplayName(siteDisplayNameWrap.o);
		}
		return (SitePage)this;
	}

	public static String staticSearchSiteDisplayName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSiteDisplayName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSiteDisplayName(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrSiteDisplayName(siteRequest_, SitePage.staticSearchSiteDisplayName(siteRequest_, SitePage.staticSetSiteDisplayName(siteRequest_, o)));
	}

	///////////////////
	// staticBaseUrl //
	///////////////////

	/**	 The entity staticBaseUrl
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String staticBaseUrl;

	/**	<br> The entity staticBaseUrl
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:staticBaseUrl">Find the entity staticBaseUrl in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _staticBaseUrl(Wrap<String> w);

	public String getStaticBaseUrl() {
		return staticBaseUrl;
	}
	public void setStaticBaseUrl(String o) {
		this.staticBaseUrl = SitePage.staticSetStaticBaseUrl(siteRequest_, o);
	}
	public static String staticSetStaticBaseUrl(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SitePage staticBaseUrlInit() {
		Wrap<String> staticBaseUrlWrap = new Wrap<String>().var("staticBaseUrl");
		if(staticBaseUrl == null) {
			_staticBaseUrl(staticBaseUrlWrap);
			setStaticBaseUrl(staticBaseUrlWrap.o);
		}
		return (SitePage)this;
	}

	public static String staticSearchStaticBaseUrl(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrStaticBaseUrl(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqStaticBaseUrl(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrStaticBaseUrl(siteRequest_, SitePage.staticSearchStaticBaseUrl(siteRequest_, SitePage.staticSetStaticBaseUrl(siteRequest_, o)));
	}

	////////////////
	// staticPath //
	////////////////

	/**	 The entity staticPath
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String staticPath;

	/**	<br> The entity staticPath
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:staticPath">Find the entity staticPath in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _staticPath(Wrap<String> w);

	public String getStaticPath() {
		return staticPath;
	}
	public void setStaticPath(String o) {
		this.staticPath = SitePage.staticSetStaticPath(siteRequest_, o);
	}
	public static String staticSetStaticPath(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SitePage staticPathInit() {
		Wrap<String> staticPathWrap = new Wrap<String>().var("staticPath");
		if(staticPath == null) {
			_staticPath(staticPathWrap);
			setStaticPath(staticPathWrap.o);
		}
		return (SitePage)this;
	}

	public static String staticSearchStaticPath(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrStaticPath(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqStaticPath(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrStaticPath(siteRequest_, SitePage.staticSearchStaticPath(siteRequest_, SitePage.staticSetStaticPath(siteRequest_, o)));
	}

	/////////////////
	// siteBaseUrl //
	/////////////////

	/**	 The entity siteBaseUrl
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String siteBaseUrl;

	/**	<br> The entity siteBaseUrl
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:siteBaseUrl">Find the entity siteBaseUrl in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _siteBaseUrl(Wrap<String> w);

	public String getSiteBaseUrl() {
		return siteBaseUrl;
	}
	public void setSiteBaseUrl(String o) {
		this.siteBaseUrl = SitePage.staticSetSiteBaseUrl(siteRequest_, o);
	}
	public static String staticSetSiteBaseUrl(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SitePage siteBaseUrlInit() {
		Wrap<String> siteBaseUrlWrap = new Wrap<String>().var("siteBaseUrl");
		if(siteBaseUrl == null) {
			_siteBaseUrl(siteBaseUrlWrap);
			setSiteBaseUrl(siteBaseUrlWrap.o);
		}
		return (SitePage)this;
	}

	public static String staticSearchSiteBaseUrl(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSiteBaseUrl(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSiteBaseUrl(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrSiteBaseUrl(siteRequest_, SitePage.staticSearchSiteBaseUrl(siteRequest_, SitePage.staticSetSiteBaseUrl(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:promiseBefore">Find the entity promiseBefore in Solr</a>
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

	///////////////
	// courseNum //
	///////////////

	/**	 The entity courseNum
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer courseNum;

	/**	<br> The entity courseNum
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:courseNum">Find the entity courseNum in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _courseNum(Wrap<Integer> w);

	public Integer getCourseNum() {
		return courseNum;
	}

	public void setCourseNum(Integer courseNum) {
		this.courseNum = courseNum;
	}
	@JsonIgnore
	public void setCourseNum(String o) {
		this.courseNum = SitePage.staticSetCourseNum(siteRequest_, o);
	}
	public static Integer staticSetCourseNum(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected SitePage courseNumInit() {
		Wrap<Integer> courseNumWrap = new Wrap<Integer>().var("courseNum");
		if(courseNum == null) {
			_courseNum(courseNumWrap);
			setCourseNum(courseNumWrap.o);
		}
		return (SitePage)this;
	}

	public static Integer staticSearchCourseNum(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrCourseNum(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqCourseNum(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrCourseNum(siteRequest_, SitePage.staticSearchCourseNum(siteRequest_, SitePage.staticSetCourseNum(siteRequest_, o)));
	}

	public Integer sqlCourseNum() {
		return courseNum;
	}

	///////////////
	// lessonNum //
	///////////////

	/**	 The entity lessonNum
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer lessonNum;

	/**	<br> The entity lessonNum
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:lessonNum">Find the entity lessonNum in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _lessonNum(Wrap<Integer> w);

	public Integer getLessonNum() {
		return lessonNum;
	}

	public void setLessonNum(Integer lessonNum) {
		this.lessonNum = lessonNum;
	}
	@JsonIgnore
	public void setLessonNum(String o) {
		this.lessonNum = SitePage.staticSetLessonNum(siteRequest_, o);
	}
	public static Integer staticSetLessonNum(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected SitePage lessonNumInit() {
		Wrap<Integer> lessonNumWrap = new Wrap<Integer>().var("lessonNum");
		if(lessonNum == null) {
			_lessonNum(lessonNumWrap);
			setLessonNum(lessonNumWrap.o);
		}
		return (SitePage)this;
	}

	public static Integer staticSearchLessonNum(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrLessonNum(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqLessonNum(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrLessonNum(siteRequest_, SitePage.staticSearchLessonNum(siteRequest_, SitePage.staticSetLessonNum(siteRequest_, o)));
	}

	public Integer sqlLessonNum() {
		return lessonNum;
	}

	/////////
	// uri //
	/////////

	/**	 The entity uri
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String uri;

	/**	<br> The entity uri
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:uri">Find the entity uri in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _uri(Wrap<String> w);

	public String getUri() {
		return uri;
	}
	public void setUri(String o) {
		this.uri = SitePage.staticSetUri(siteRequest_, o);
	}
	public static String staticSetUri(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SitePage uriInit() {
		Wrap<String> uriWrap = new Wrap<String>().var("uri");
		if(uri == null) {
			_uri(uriWrap);
			setUri(uriWrap.o);
		}
		return (SitePage)this;
	}

	public static String staticSearchUri(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrUri(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUri(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrUri(siteRequest_, SitePage.staticSearchUri(siteRequest_, SitePage.staticSetUri(siteRequest_, o)));
	}

	public String sqlUri() {
		return uri;
	}

	////////////
	// pageId //
	////////////

	/**	 The entity pageId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageId;

	/**	<br> The entity pageId
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:pageId">Find the entity pageId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageId(Wrap<String> w);

	public String getPageId() {
		return pageId;
	}
	public void setPageId(String o) {
		this.pageId = SitePage.staticSetPageId(siteRequest_, o);
	}
	public static String staticSetPageId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SitePage pageIdInit() {
		Wrap<String> pageIdWrap = new Wrap<String>().var("pageId");
		if(pageId == null) {
			_pageId(pageIdWrap);
			setPageId(pageIdWrap.o);
		}
		return (SitePage)this;
	}

	public static String staticSearchPageId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageId(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrPageId(siteRequest_, SitePage.staticSearchPageId(siteRequest_, SitePage.staticSetPageId(siteRequest_, o)));
	}

	public String sqlPageId() {
		return pageId;
	}

	////////
	// h1 //
	////////

	/**	 The entity h1
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String h1;

	/**	<br> The entity h1
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:h1">Find the entity h1 in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _h1(Wrap<String> w);

	public String getH1() {
		return h1;
	}
	public void setH1(String o) {
		this.h1 = SitePage.staticSetH1(siteRequest_, o);
	}
	public static String staticSetH1(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SitePage h1Init() {
		Wrap<String> h1Wrap = new Wrap<String>().var("h1");
		if(h1 == null) {
			_h1(h1Wrap);
			setH1(h1Wrap.o);
		}
		return (SitePage)this;
	}

	public static String staticSearchH1(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrH1(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqH1(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrH1(siteRequest_, SitePage.staticSearchH1(siteRequest_, SitePage.staticSetH1(siteRequest_, o)));
	}

	public String sqlH1() {
		return h1;
	}

	////////
	// h2 //
	////////

	/**	 The entity h2
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String h2;

	/**	<br> The entity h2
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:h2">Find the entity h2 in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _h2(Wrap<String> w);

	public String getH2() {
		return h2;
	}
	public void setH2(String o) {
		this.h2 = SitePage.staticSetH2(siteRequest_, o);
	}
	public static String staticSetH2(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SitePage h2Init() {
		Wrap<String> h2Wrap = new Wrap<String>().var("h2");
		if(h2 == null) {
			_h2(h2Wrap);
			setH2(h2Wrap.o);
		}
		return (SitePage)this;
	}

	public static String staticSearchH2(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrH2(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqH2(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrH2(siteRequest_, SitePage.staticSearchH2(siteRequest_, SitePage.staticSetH2(siteRequest_, o)));
	}

	public String sqlH2() {
		return h2;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:inheritPk">Find the entity inheritPk in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _inheritPk(Wrap<String> w);

	public String getInheritPk() {
		return inheritPk;
	}
	public void setInheritPk(String o) {
		this.inheritPk = SitePage.staticSetInheritPk(siteRequest_, o);
	}
	public static String staticSetInheritPk(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SitePage inheritPkInit() {
		Wrap<String> inheritPkWrap = new Wrap<String>().var("inheritPk");
		if(inheritPk == null) {
			_inheritPk(inheritPkWrap);
			setInheritPk(inheritPkWrap.o);
		}
		return (SitePage)this;
	}

	public static String staticSearchInheritPk(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrInheritPk(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqInheritPk(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrInheritPk(siteRequest_, SitePage.staticSearchInheritPk(siteRequest_, SitePage.staticSetInheritPk(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:created">Find the entity created in Solr</a>
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
		this.created = SitePage.staticSetCreated(siteRequest_, o);
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
	protected SitePage createdInit() {
		Wrap<ZonedDateTime> createdWrap = new Wrap<ZonedDateTime>().var("created");
		if(created == null) {
			_created(createdWrap);
			setCreated(createdWrap.o);
		}
		return (SitePage)this;
	}

	public static Date staticSearchCreated(SiteRequestEnUS siteRequest_, ZonedDateTime o) {
		return o == null ? null : Date.from(o.toInstant());
	}

	public static String staticSearchStrCreated(SiteRequestEnUS siteRequest_, Date o) {
		return "\"" + DateTimeFormatter.ISO_DATE_TIME.format(o.toInstant().atOffset(ZoneOffset.UTC)) + "\"";
	}

	public static String staticSearchFqCreated(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrCreated(siteRequest_, SitePage.staticSearchCreated(siteRequest_, SitePage.staticSetCreated(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:modified">Find the entity modified in Solr</a>
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
		this.modified = SitePage.staticSetModified(siteRequest_, o);
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
	protected SitePage modifiedInit() {
		Wrap<ZonedDateTime> modifiedWrap = new Wrap<ZonedDateTime>().var("modified");
		if(modified == null) {
			_modified(modifiedWrap);
			setModified(modifiedWrap.o);
		}
		return (SitePage)this;
	}

	public static Date staticSearchModified(SiteRequestEnUS siteRequest_, ZonedDateTime o) {
		return o == null ? null : Date.from(o.toInstant());
	}

	public static String staticSearchStrModified(SiteRequestEnUS siteRequest_, Date o) {
		return "\"" + DateTimeFormatter.ISO_DATE_TIME.format(o.toInstant().atOffset(ZoneOffset.UTC)) + "\"";
	}

	public static String staticSearchFqModified(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrModified(siteRequest_, SitePage.staticSearchModified(siteRequest_, SitePage.staticSetModified(siteRequest_, o)));
	}

	////////////
	// author //
	////////////

	/**	 The entity author
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String author;

	/**	<br> The entity author
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:author">Find the entity author in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _author(Wrap<String> w);

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String o) {
		this.author = SitePage.staticSetAuthor(siteRequest_, o);
	}
	public static String staticSetAuthor(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SitePage authorInit() {
		Wrap<String> authorWrap = new Wrap<String>().var("author");
		if(author == null) {
			_author(authorWrap);
			setAuthor(authorWrap.o);
		}
		return (SitePage)this;
	}

	public static String staticSearchAuthor(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrAuthor(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAuthor(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrAuthor(siteRequest_, SitePage.staticSearchAuthor(siteRequest_, SitePage.staticSetAuthor(siteRequest_, o)));
	}

	public String sqlAuthor() {
		return author;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:pageImageUri">Find the entity pageImageUri in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageImageUri(Wrap<String> w);

	public String getPageImageUri() {
		return pageImageUri;
	}
	public void setPageImageUri(String o) {
		this.pageImageUri = SitePage.staticSetPageImageUri(siteRequest_, o);
	}
	public static String staticSetPageImageUri(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SitePage pageImageUriInit() {
		Wrap<String> pageImageUriWrap = new Wrap<String>().var("pageImageUri");
		if(pageImageUri == null) {
			_pageImageUri(pageImageUriWrap);
			setPageImageUri(pageImageUriWrap.o);
		}
		return (SitePage)this;
	}

	public static String staticSearchPageImageUri(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageImageUri(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageImageUri(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrPageImageUri(siteRequest_, SitePage.staticSearchPageImageUri(siteRequest_, SitePage.staticSetPageImageUri(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:pageImageWidth">Find the entity pageImageWidth in Solr</a>
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
		this.pageImageWidth = SitePage.staticSetPageImageWidth(siteRequest_, o);
	}
	public static Integer staticSetPageImageWidth(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected SitePage pageImageWidthInit() {
		Wrap<Integer> pageImageWidthWrap = new Wrap<Integer>().var("pageImageWidth");
		if(pageImageWidth == null) {
			_pageImageWidth(pageImageWidthWrap);
			setPageImageWidth(pageImageWidthWrap.o);
		}
		return (SitePage)this;
	}

	public static Integer staticSearchPageImageWidth(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrPageImageWidth(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageImageWidth(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrPageImageWidth(siteRequest_, SitePage.staticSearchPageImageWidth(siteRequest_, SitePage.staticSetPageImageWidth(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:pageImageHeight">Find the entity pageImageHeight in Solr</a>
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
		this.pageImageHeight = SitePage.staticSetPageImageHeight(siteRequest_, o);
	}
	public static Integer staticSetPageImageHeight(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected SitePage pageImageHeightInit() {
		Wrap<Integer> pageImageHeightWrap = new Wrap<Integer>().var("pageImageHeight");
		if(pageImageHeight == null) {
			_pageImageHeight(pageImageHeightWrap);
			setPageImageHeight(pageImageHeightWrap.o);
		}
		return (SitePage)this;
	}

	public static Integer staticSearchPageImageHeight(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrPageImageHeight(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageImageHeight(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrPageImageHeight(siteRequest_, SitePage.staticSearchPageImageHeight(siteRequest_, SitePage.staticSetPageImageHeight(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:pageImageType">Find the entity pageImageType in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageImageType(Wrap<String> c);

	public String getPageImageType() {
		return pageImageType;
	}
	public void setPageImageType(String o) {
		this.pageImageType = SitePage.staticSetPageImageType(siteRequest_, o);
	}
	public static String staticSetPageImageType(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SitePage pageImageTypeInit() {
		Wrap<String> pageImageTypeWrap = new Wrap<String>().var("pageImageType");
		if(pageImageType == null) {
			_pageImageType(pageImageTypeWrap);
			setPageImageType(pageImageTypeWrap.o);
		}
		return (SitePage)this;
	}

	public static String staticSearchPageImageType(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageImageType(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageImageType(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrPageImageType(siteRequest_, SitePage.staticSearchPageImageType(siteRequest_, SitePage.staticSetPageImageType(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:archived">Find the entity archived in Solr</a>
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
		this.archived = SitePage.staticSetArchived(siteRequest_, o);
	}
	public static Boolean staticSetArchived(SiteRequestEnUS siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected SitePage archivedInit() {
		Wrap<Boolean> archivedWrap = new Wrap<Boolean>().var("archived");
		if(archived == null) {
			_archived(archivedWrap);
			setArchived(archivedWrap.o);
		}
		return (SitePage)this;
	}

	public static Boolean staticSearchArchived(SiteRequestEnUS siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrArchived(SiteRequestEnUS siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqArchived(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrArchived(siteRequest_, SitePage.staticSearchArchived(siteRequest_, SitePage.staticSetArchived(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:deleted">Find the entity deleted in Solr</a>
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
		this.deleted = SitePage.staticSetDeleted(siteRequest_, o);
	}
	public static Boolean staticSetDeleted(SiteRequestEnUS siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected SitePage deletedInit() {
		Wrap<Boolean> deletedWrap = new Wrap<Boolean>().var("deleted");
		if(deleted == null) {
			_deleted(deletedWrap);
			setDeleted(deletedWrap.o);
		}
		return (SitePage)this;
	}

	public static Boolean staticSearchDeleted(SiteRequestEnUS siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrDeleted(SiteRequestEnUS siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDeleted(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrDeleted(siteRequest_, SitePage.staticSearchDeleted(siteRequest_, SitePage.staticSetDeleted(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:classCanonicalName">Find the entity classCanonicalName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _classCanonicalName(Wrap<String> w);

	public String getClassCanonicalName() {
		return classCanonicalName;
	}
	public void setClassCanonicalName(String o) {
		this.classCanonicalName = SitePage.staticSetClassCanonicalName(siteRequest_, o);
	}
	public static String staticSetClassCanonicalName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SitePage classCanonicalNameInit() {
		Wrap<String> classCanonicalNameWrap = new Wrap<String>().var("classCanonicalName");
		if(classCanonicalName == null) {
			_classCanonicalName(classCanonicalNameWrap);
			setClassCanonicalName(classCanonicalNameWrap.o);
		}
		return (SitePage)this;
	}

	public static String staticSearchClassCanonicalName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrClassCanonicalName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqClassCanonicalName(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrClassCanonicalName(siteRequest_, SitePage.staticSearchClassCanonicalName(siteRequest_, SitePage.staticSetClassCanonicalName(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:classSimpleName">Find the entity classSimpleName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _classSimpleName(Wrap<String> w);

	public String getClassSimpleName() {
		return classSimpleName;
	}
	public void setClassSimpleName(String o) {
		this.classSimpleName = SitePage.staticSetClassSimpleName(siteRequest_, o);
	}
	public static String staticSetClassSimpleName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SitePage classSimpleNameInit() {
		Wrap<String> classSimpleNameWrap = new Wrap<String>().var("classSimpleName");
		if(classSimpleName == null) {
			_classSimpleName(classSimpleNameWrap);
			setClassSimpleName(classSimpleNameWrap.o);
		}
		return (SitePage)this;
	}

	public static String staticSearchClassSimpleName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrClassSimpleName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqClassSimpleName(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrClassSimpleName(siteRequest_, SitePage.staticSearchClassSimpleName(siteRequest_, SitePage.staticSetClassSimpleName(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:classCanonicalNames">Find the entity classCanonicalNames in Solr</a>
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
	public SitePage addClassCanonicalNames(String...objects) {
		for(String o : objects) {
			addClassCanonicalNames(o);
		}
		return (SitePage)this;
	}
	public SitePage addClassCanonicalNames(String o) {
		if(o != null)
			this.classCanonicalNames.add(o);
		return (SitePage)this;
	}
	@JsonIgnore
	public void setClassCanonicalNames(JsonArray objects) {
		classCanonicalNames.clear();
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addClassCanonicalNames(o);
		}
	}
	protected SitePage classCanonicalNamesInit() {
		_classCanonicalNames(classCanonicalNames);
		return (SitePage)this;
	}

	public static String staticSearchClassCanonicalNames(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrClassCanonicalNames(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqClassCanonicalNames(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrClassCanonicalNames(siteRequest_, SitePage.staticSearchClassCanonicalNames(siteRequest_, SitePage.staticSetClassCanonicalNames(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:sessionId">Find the entity sessionId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _sessionId(Wrap<String> w);

	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String o) {
		this.sessionId = SitePage.staticSetSessionId(siteRequest_, o);
	}
	public static String staticSetSessionId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SitePage sessionIdInit() {
		Wrap<String> sessionIdWrap = new Wrap<String>().var("sessionId");
		if(sessionId == null) {
			_sessionId(sessionIdWrap);
			setSessionId(sessionIdWrap.o);
		}
		return (SitePage)this;
	}

	public static String staticSearchSessionId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSessionId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSessionId(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrSessionId(siteRequest_, SitePage.staticSearchSessionId(siteRequest_, SitePage.staticSetSessionId(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:userKey">Find the entity userKey in Solr</a>
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
		this.userKey = SitePage.staticSetUserKey(siteRequest_, o);
	}
	public static Long staticSetUserKey(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected SitePage userKeyInit() {
		Wrap<Long> userKeyWrap = new Wrap<Long>().var("userKey");
		if(userKey == null) {
			_userKey(userKeyWrap);
			setUserKey(userKeyWrap.o);
		}
		return (SitePage)this;
	}

	public static Long staticSearchUserKey(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrUserKey(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUserKey(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrUserKey(siteRequest_, SitePage.staticSearchUserKey(siteRequest_, SitePage.staticSetUserKey(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:saves">Find the entity saves in Solr</a>
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
	public SitePage addSaves(String...objects) {
		for(String o : objects) {
			addSaves(o);
		}
		return (SitePage)this;
	}
	public SitePage addSaves(String o) {
		if(o != null)
			this.saves.add(o);
		return (SitePage)this;
	}
	@JsonIgnore
	public void setSaves(JsonArray objects) {
		saves.clear();
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addSaves(o);
		}
	}
	protected SitePage savesInit() {
		_saves(saves);
		return (SitePage)this;
	}

	public static String staticSearchSaves(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSaves(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSaves(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrSaves(siteRequest_, SitePage.staticSearchSaves(siteRequest_, SitePage.staticSetSaves(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:objectTitle">Find the entity objectTitle in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _objectTitle(Wrap<String> w);

	public String getObjectTitle() {
		return objectTitle;
	}
	public void setObjectTitle(String o) {
		this.objectTitle = SitePage.staticSetObjectTitle(siteRequest_, o);
	}
	public static String staticSetObjectTitle(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SitePage objectTitleInit() {
		Wrap<String> objectTitleWrap = new Wrap<String>().var("objectTitle");
		if(objectTitle == null) {
			_objectTitle(objectTitleWrap);
			setObjectTitle(objectTitleWrap.o);
		}
		return (SitePage)this;
	}

	public static String staticSearchObjectTitle(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrObjectTitle(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqObjectTitle(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrObjectTitle(siteRequest_, SitePage.staticSearchObjectTitle(siteRequest_, SitePage.staticSetObjectTitle(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:objectId">Find the entity objectId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _objectId(Wrap<String> w);

	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String o) {
		this.objectId = SitePage.staticSetObjectId(siteRequest_, o);
	}
	public static String staticSetObjectId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SitePage objectIdInit() {
		Wrap<String> objectIdWrap = new Wrap<String>().var("objectId");
		if(objectId == null) {
			_objectId(objectIdWrap);
			setObjectId(objectIdWrap.o);
		}
		return (SitePage)this;
	}

	public static String staticSearchObjectId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrObjectId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqObjectId(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrObjectId(siteRequest_, SitePage.staticSearchObjectId(siteRequest_, SitePage.staticSetObjectId(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:objectNameVar">Find the entity objectNameVar in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _objectNameVar(Wrap<String> w);

	public String getObjectNameVar() {
		return objectNameVar;
	}
	public void setObjectNameVar(String o) {
		this.objectNameVar = SitePage.staticSetObjectNameVar(siteRequest_, o);
	}
	public static String staticSetObjectNameVar(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SitePage objectNameVarInit() {
		Wrap<String> objectNameVarWrap = new Wrap<String>().var("objectNameVar");
		if(objectNameVar == null) {
			_objectNameVar(objectNameVarWrap);
			setObjectNameVar(objectNameVarWrap.o);
		}
		return (SitePage)this;
	}

	public static String staticSearchObjectNameVar(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrObjectNameVar(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqObjectNameVar(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrObjectNameVar(siteRequest_, SitePage.staticSearchObjectNameVar(siteRequest_, SitePage.staticSetObjectNameVar(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:objectSuggest">Find the entity objectSuggest in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _objectSuggest(Wrap<String> w);

	public String getObjectSuggest() {
		return objectSuggest;
	}
	public void setObjectSuggest(String o) {
		this.objectSuggest = SitePage.staticSetObjectSuggest(siteRequest_, o);
	}
	public static String staticSetObjectSuggest(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SitePage objectSuggestInit() {
		Wrap<String> objectSuggestWrap = new Wrap<String>().var("objectSuggest");
		if(objectSuggest == null) {
			_objectSuggest(objectSuggestWrap);
			setObjectSuggest(objectSuggestWrap.o);
		}
		return (SitePage)this;
	}

	public static String staticSearchObjectSuggest(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrObjectSuggest(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqObjectSuggest(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrObjectSuggest(siteRequest_, SitePage.staticSearchObjectSuggest(siteRequest_, SitePage.staticSetObjectSuggest(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:objectText">Find the entity objectText in Solr</a>
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
	public static String staticSetObjectText(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public SitePage addObjectText(String...objects) {
		for(String o : objects) {
			addObjectText(o);
		}
		return (SitePage)this;
	}
	public SitePage addObjectText(String o) {
		if(o != null)
			this.objectText.add(o);
		return (SitePage)this;
	}
	@JsonIgnore
	public void setObjectText(JsonArray objects) {
		objectText.clear();
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addObjectText(o);
		}
	}
	protected SitePage objectTextInit() {
		_objectText(objectText);
		return (SitePage)this;
	}

	public static String staticSearchObjectText(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrObjectText(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqObjectText(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrObjectText(siteRequest_, SitePage.staticSearchObjectText(siteRequest_, SitePage.staticSetObjectText(siteRequest_, o)));
	}

	public List<String> sqlObjectText() {
		return objectText;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:pageUrlId">Find the entity pageUrlId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUrlId(Wrap<String> w);

	public String getPageUrlId() {
		return pageUrlId;
	}
	public void setPageUrlId(String o) {
		this.pageUrlId = SitePage.staticSetPageUrlId(siteRequest_, o);
	}
	public static String staticSetPageUrlId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SitePage pageUrlIdInit() {
		Wrap<String> pageUrlIdWrap = new Wrap<String>().var("pageUrlId");
		if(pageUrlId == null) {
			_pageUrlId(pageUrlIdWrap);
			setPageUrlId(pageUrlIdWrap.o);
		}
		return (SitePage)this;
	}

	public static String staticSearchPageUrlId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUrlId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUrlId(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrPageUrlId(siteRequest_, SitePage.staticSearchPageUrlId(siteRequest_, SitePage.staticSetPageUrlId(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:pageUrlPk">Find the entity pageUrlPk in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUrlPk(Wrap<String> w);

	public String getPageUrlPk() {
		return pageUrlPk;
	}
	public void setPageUrlPk(String o) {
		this.pageUrlPk = SitePage.staticSetPageUrlPk(siteRequest_, o);
	}
	public static String staticSetPageUrlPk(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SitePage pageUrlPkInit() {
		Wrap<String> pageUrlPkWrap = new Wrap<String>().var("pageUrlPk");
		if(pageUrlPk == null) {
			_pageUrlPk(pageUrlPkWrap);
			setPageUrlPk(pageUrlPkWrap.o);
		}
		return (SitePage)this;
	}

	public static String staticSearchPageUrlPk(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUrlPk(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUrlPk(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrPageUrlPk(siteRequest_, SitePage.staticSearchPageUrlPk(siteRequest_, SitePage.staticSetPageUrlPk(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:pageUrlApi">Find the entity pageUrlApi in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUrlApi(Wrap<String> w);

	public String getPageUrlApi() {
		return pageUrlApi;
	}
	public void setPageUrlApi(String o) {
		this.pageUrlApi = SitePage.staticSetPageUrlApi(siteRequest_, o);
	}
	public static String staticSetPageUrlApi(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SitePage pageUrlApiInit() {
		Wrap<String> pageUrlApiWrap = new Wrap<String>().var("pageUrlApi");
		if(pageUrlApi == null) {
			_pageUrlApi(pageUrlApiWrap);
			setPageUrlApi(pageUrlApiWrap.o);
		}
		return (SitePage)this;
	}

	public static String staticSearchPageUrlApi(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUrlApi(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUrlApi(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrPageUrlApi(siteRequest_, SitePage.staticSearchPageUrlApi(siteRequest_, SitePage.staticSetPageUrlApi(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.SitePage&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = SitePage.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SitePage idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			setId(idWrap.o);
		}
		return (SitePage)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return SitePage.staticSearchStrId(siteRequest_, SitePage.staticSearchId(siteRequest_, SitePage.staticSetId(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepSitePage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepSitePage();
	}

	public Future<Void> promiseDeepSitePage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseSitePage(promise2);
		promise2.future().onSuccess(a -> {
			promise.complete();
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseSitePage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				siteRequest_Init();
				siteNameInit();
				siteDisplayNameInit();
				staticBaseUrlInit();
				staticPathInit();
				siteBaseUrlInit();
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
				courseNumInit();
				lessonNumInit();
				uriInit();
				pageIdInit();
				h1Init();
				h2Init();
				inheritPkInit();
				createdInit();
				modifiedInit();
				authorInit();
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
		return promiseDeepSitePage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestSitePage(SiteRequestEnUS siteRequest_) {
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestSitePage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainSitePage(v);
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
	public Object obtainSitePage(String var) {
		SitePage oSitePage = (SitePage)this;
		switch(var) {
			case "siteRequest_":
				return oSitePage.siteRequest_;
			case "siteName":
				return oSitePage.siteName;
			case "siteDisplayName":
				return oSitePage.siteDisplayName;
			case "staticBaseUrl":
				return oSitePage.staticBaseUrl;
			case "staticPath":
				return oSitePage.staticPath;
			case "siteBaseUrl":
				return oSitePage.siteBaseUrl;
			case "promiseBefore":
				return oSitePage.promiseBefore;
			case "courseNum":
				return oSitePage.courseNum;
			case "lessonNum":
				return oSitePage.lessonNum;
			case "uri":
				return oSitePage.uri;
			case "pageId":
				return oSitePage.pageId;
			case "h1":
				return oSitePage.h1;
			case "h2":
				return oSitePage.h2;
			case "inheritPk":
				return oSitePage.inheritPk;
			case "created":
				return oSitePage.created;
			case "modified":
				return oSitePage.modified;
			case "author":
				return oSitePage.author;
			case "pageImageUri":
				return oSitePage.pageImageUri;
			case "pageImageWidth":
				return oSitePage.pageImageWidth;
			case "pageImageHeight":
				return oSitePage.pageImageHeight;
			case "pageImageType":
				return oSitePage.pageImageType;
			case "archived":
				return oSitePage.archived;
			case "deleted":
				return oSitePage.deleted;
			case "classCanonicalName":
				return oSitePage.classCanonicalName;
			case "classSimpleName":
				return oSitePage.classSimpleName;
			case "classCanonicalNames":
				return oSitePage.classCanonicalNames;
			case "sessionId":
				return oSitePage.sessionId;
			case "userKey":
				return oSitePage.userKey;
			case "saves":
				return oSitePage.saves;
			case "objectTitle":
				return oSitePage.objectTitle;
			case "objectId":
				return oSitePage.objectId;
			case "objectNameVar":
				return oSitePage.objectNameVar;
			case "objectSuggest":
				return oSitePage.objectSuggest;
			case "objectText":
				return oSitePage.objectText;
			case "pageUrlId":
				return oSitePage.pageUrlId;
			case "pageUrlPk":
				return oSitePage.pageUrlPk;
			case "pageUrlApi":
				return oSitePage.pageUrlApi;
			case "id":
				return oSitePage.id;
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
				o = relateSitePage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateSitePage(String var, Object val) {
		SitePage oSitePage = (SitePage)this;
		switch(var) {
			default:
				return null;
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetSitePage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetSitePage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "siteName":
			return SitePage.staticSetSiteName(siteRequest_, o);
		case "siteDisplayName":
			return SitePage.staticSetSiteDisplayName(siteRequest_, o);
		case "staticBaseUrl":
			return SitePage.staticSetStaticBaseUrl(siteRequest_, o);
		case "staticPath":
			return SitePage.staticSetStaticPath(siteRequest_, o);
		case "siteBaseUrl":
			return SitePage.staticSetSiteBaseUrl(siteRequest_, o);
		case "courseNum":
			return SitePage.staticSetCourseNum(siteRequest_, o);
		case "lessonNum":
			return SitePage.staticSetLessonNum(siteRequest_, o);
		case "uri":
			return SitePage.staticSetUri(siteRequest_, o);
		case "pageId":
			return SitePage.staticSetPageId(siteRequest_, o);
		case "h1":
			return SitePage.staticSetH1(siteRequest_, o);
		case "h2":
			return SitePage.staticSetH2(siteRequest_, o);
		case "inheritPk":
			return SitePage.staticSetInheritPk(siteRequest_, o);
		case "created":
			return SitePage.staticSetCreated(siteRequest_, o);
		case "modified":
			return SitePage.staticSetModified(siteRequest_, o);
		case "author":
			return SitePage.staticSetAuthor(siteRequest_, o);
		case "pageImageUri":
			return SitePage.staticSetPageImageUri(siteRequest_, o);
		case "pageImageWidth":
			return SitePage.staticSetPageImageWidth(siteRequest_, o);
		case "pageImageHeight":
			return SitePage.staticSetPageImageHeight(siteRequest_, o);
		case "pageImageType":
			return SitePage.staticSetPageImageType(siteRequest_, o);
		case "archived":
			return SitePage.staticSetArchived(siteRequest_, o);
		case "deleted":
			return SitePage.staticSetDeleted(siteRequest_, o);
		case "classCanonicalName":
			return SitePage.staticSetClassCanonicalName(siteRequest_, o);
		case "classSimpleName":
			return SitePage.staticSetClassSimpleName(siteRequest_, o);
		case "classCanonicalNames":
			return SitePage.staticSetClassCanonicalNames(siteRequest_, o);
		case "sessionId":
			return SitePage.staticSetSessionId(siteRequest_, o);
		case "userKey":
			return SitePage.staticSetUserKey(siteRequest_, o);
		case "saves":
			return SitePage.staticSetSaves(siteRequest_, o);
		case "objectTitle":
			return SitePage.staticSetObjectTitle(siteRequest_, o);
		case "objectId":
			return SitePage.staticSetObjectId(siteRequest_, o);
		case "objectNameVar":
			return SitePage.staticSetObjectNameVar(siteRequest_, o);
		case "objectSuggest":
			return SitePage.staticSetObjectSuggest(siteRequest_, o);
		case "objectText":
			return SitePage.staticSetObjectText(siteRequest_, o);
		case "pageUrlId":
			return SitePage.staticSetPageUrlId(siteRequest_, o);
		case "pageUrlPk":
			return SitePage.staticSetPageUrlPk(siteRequest_, o);
		case "pageUrlApi":
			return SitePage.staticSetPageUrlApi(siteRequest_, o);
		case "id":
			return SitePage.staticSetId(siteRequest_, o);
			default:
				return null;
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchSitePage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchSitePage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "siteName":
			return SitePage.staticSearchSiteName(siteRequest_, (String)o);
		case "siteDisplayName":
			return SitePage.staticSearchSiteDisplayName(siteRequest_, (String)o);
		case "staticBaseUrl":
			return SitePage.staticSearchStaticBaseUrl(siteRequest_, (String)o);
		case "staticPath":
			return SitePage.staticSearchStaticPath(siteRequest_, (String)o);
		case "siteBaseUrl":
			return SitePage.staticSearchSiteBaseUrl(siteRequest_, (String)o);
		case "courseNum":
			return SitePage.staticSearchCourseNum(siteRequest_, (Integer)o);
		case "lessonNum":
			return SitePage.staticSearchLessonNum(siteRequest_, (Integer)o);
		case "uri":
			return SitePage.staticSearchUri(siteRequest_, (String)o);
		case "pageId":
			return SitePage.staticSearchPageId(siteRequest_, (String)o);
		case "h1":
			return SitePage.staticSearchH1(siteRequest_, (String)o);
		case "h2":
			return SitePage.staticSearchH2(siteRequest_, (String)o);
		case "inheritPk":
			return SitePage.staticSearchInheritPk(siteRequest_, (String)o);
		case "created":
			return SitePage.staticSearchCreated(siteRequest_, (ZonedDateTime)o);
		case "modified":
			return SitePage.staticSearchModified(siteRequest_, (ZonedDateTime)o);
		case "author":
			return SitePage.staticSearchAuthor(siteRequest_, (String)o);
		case "pageImageUri":
			return SitePage.staticSearchPageImageUri(siteRequest_, (String)o);
		case "pageImageWidth":
			return SitePage.staticSearchPageImageWidth(siteRequest_, (Integer)o);
		case "pageImageHeight":
			return SitePage.staticSearchPageImageHeight(siteRequest_, (Integer)o);
		case "pageImageType":
			return SitePage.staticSearchPageImageType(siteRequest_, (String)o);
		case "archived":
			return SitePage.staticSearchArchived(siteRequest_, (Boolean)o);
		case "deleted":
			return SitePage.staticSearchDeleted(siteRequest_, (Boolean)o);
		case "classCanonicalName":
			return SitePage.staticSearchClassCanonicalName(siteRequest_, (String)o);
		case "classSimpleName":
			return SitePage.staticSearchClassSimpleName(siteRequest_, (String)o);
		case "classCanonicalNames":
			return SitePage.staticSearchClassCanonicalNames(siteRequest_, (String)o);
		case "sessionId":
			return SitePage.staticSearchSessionId(siteRequest_, (String)o);
		case "userKey":
			return SitePage.staticSearchUserKey(siteRequest_, (Long)o);
		case "saves":
			return SitePage.staticSearchSaves(siteRequest_, (String)o);
		case "objectTitle":
			return SitePage.staticSearchObjectTitle(siteRequest_, (String)o);
		case "objectId":
			return SitePage.staticSearchObjectId(siteRequest_, (String)o);
		case "objectNameVar":
			return SitePage.staticSearchObjectNameVar(siteRequest_, (String)o);
		case "objectSuggest":
			return SitePage.staticSearchObjectSuggest(siteRequest_, (String)o);
		case "objectText":
			return SitePage.staticSearchObjectText(siteRequest_, (String)o);
		case "pageUrlId":
			return SitePage.staticSearchPageUrlId(siteRequest_, (String)o);
		case "pageUrlPk":
			return SitePage.staticSearchPageUrlPk(siteRequest_, (String)o);
		case "pageUrlApi":
			return SitePage.staticSearchPageUrlApi(siteRequest_, (String)o);
		case "id":
			return SitePage.staticSearchId(siteRequest_, (String)o);
			default:
				return null;
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrSitePage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrSitePage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "siteName":
			return SitePage.staticSearchStrSiteName(siteRequest_, (String)o);
		case "siteDisplayName":
			return SitePage.staticSearchStrSiteDisplayName(siteRequest_, (String)o);
		case "staticBaseUrl":
			return SitePage.staticSearchStrStaticBaseUrl(siteRequest_, (String)o);
		case "staticPath":
			return SitePage.staticSearchStrStaticPath(siteRequest_, (String)o);
		case "siteBaseUrl":
			return SitePage.staticSearchStrSiteBaseUrl(siteRequest_, (String)o);
		case "courseNum":
			return SitePage.staticSearchStrCourseNum(siteRequest_, (Integer)o);
		case "lessonNum":
			return SitePage.staticSearchStrLessonNum(siteRequest_, (Integer)o);
		case "uri":
			return SitePage.staticSearchStrUri(siteRequest_, (String)o);
		case "pageId":
			return SitePage.staticSearchStrPageId(siteRequest_, (String)o);
		case "h1":
			return SitePage.staticSearchStrH1(siteRequest_, (String)o);
		case "h2":
			return SitePage.staticSearchStrH2(siteRequest_, (String)o);
		case "inheritPk":
			return SitePage.staticSearchStrInheritPk(siteRequest_, (String)o);
		case "created":
			return SitePage.staticSearchStrCreated(siteRequest_, (Date)o);
		case "modified":
			return SitePage.staticSearchStrModified(siteRequest_, (Date)o);
		case "author":
			return SitePage.staticSearchStrAuthor(siteRequest_, (String)o);
		case "pageImageUri":
			return SitePage.staticSearchStrPageImageUri(siteRequest_, (String)o);
		case "pageImageWidth":
			return SitePage.staticSearchStrPageImageWidth(siteRequest_, (Integer)o);
		case "pageImageHeight":
			return SitePage.staticSearchStrPageImageHeight(siteRequest_, (Integer)o);
		case "pageImageType":
			return SitePage.staticSearchStrPageImageType(siteRequest_, (String)o);
		case "archived":
			return SitePage.staticSearchStrArchived(siteRequest_, (Boolean)o);
		case "deleted":
			return SitePage.staticSearchStrDeleted(siteRequest_, (Boolean)o);
		case "classCanonicalName":
			return SitePage.staticSearchStrClassCanonicalName(siteRequest_, (String)o);
		case "classSimpleName":
			return SitePage.staticSearchStrClassSimpleName(siteRequest_, (String)o);
		case "classCanonicalNames":
			return SitePage.staticSearchStrClassCanonicalNames(siteRequest_, (String)o);
		case "sessionId":
			return SitePage.staticSearchStrSessionId(siteRequest_, (String)o);
		case "userKey":
			return SitePage.staticSearchStrUserKey(siteRequest_, (Long)o);
		case "saves":
			return SitePage.staticSearchStrSaves(siteRequest_, (String)o);
		case "objectTitle":
			return SitePage.staticSearchStrObjectTitle(siteRequest_, (String)o);
		case "objectId":
			return SitePage.staticSearchStrObjectId(siteRequest_, (String)o);
		case "objectNameVar":
			return SitePage.staticSearchStrObjectNameVar(siteRequest_, (String)o);
		case "objectSuggest":
			return SitePage.staticSearchStrObjectSuggest(siteRequest_, (String)o);
		case "objectText":
			return SitePage.staticSearchStrObjectText(siteRequest_, (String)o);
		case "pageUrlId":
			return SitePage.staticSearchStrPageUrlId(siteRequest_, (String)o);
		case "pageUrlPk":
			return SitePage.staticSearchStrPageUrlPk(siteRequest_, (String)o);
		case "pageUrlApi":
			return SitePage.staticSearchStrPageUrlApi(siteRequest_, (String)o);
		case "id":
			return SitePage.staticSearchStrId(siteRequest_, (String)o);
			default:
				return null;
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqSitePage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqSitePage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "siteName":
			return SitePage.staticSearchFqSiteName(siteRequest_, o);
		case "siteDisplayName":
			return SitePage.staticSearchFqSiteDisplayName(siteRequest_, o);
		case "staticBaseUrl":
			return SitePage.staticSearchFqStaticBaseUrl(siteRequest_, o);
		case "staticPath":
			return SitePage.staticSearchFqStaticPath(siteRequest_, o);
		case "siteBaseUrl":
			return SitePage.staticSearchFqSiteBaseUrl(siteRequest_, o);
		case "courseNum":
			return SitePage.staticSearchFqCourseNum(siteRequest_, o);
		case "lessonNum":
			return SitePage.staticSearchFqLessonNum(siteRequest_, o);
		case "uri":
			return SitePage.staticSearchFqUri(siteRequest_, o);
		case "pageId":
			return SitePage.staticSearchFqPageId(siteRequest_, o);
		case "h1":
			return SitePage.staticSearchFqH1(siteRequest_, o);
		case "h2":
			return SitePage.staticSearchFqH2(siteRequest_, o);
		case "inheritPk":
			return SitePage.staticSearchFqInheritPk(siteRequest_, o);
		case "created":
			return SitePage.staticSearchFqCreated(siteRequest_, o);
		case "modified":
			return SitePage.staticSearchFqModified(siteRequest_, o);
		case "author":
			return SitePage.staticSearchFqAuthor(siteRequest_, o);
		case "pageImageUri":
			return SitePage.staticSearchFqPageImageUri(siteRequest_, o);
		case "pageImageWidth":
			return SitePage.staticSearchFqPageImageWidth(siteRequest_, o);
		case "pageImageHeight":
			return SitePage.staticSearchFqPageImageHeight(siteRequest_, o);
		case "pageImageType":
			return SitePage.staticSearchFqPageImageType(siteRequest_, o);
		case "archived":
			return SitePage.staticSearchFqArchived(siteRequest_, o);
		case "deleted":
			return SitePage.staticSearchFqDeleted(siteRequest_, o);
		case "classCanonicalName":
			return SitePage.staticSearchFqClassCanonicalName(siteRequest_, o);
		case "classSimpleName":
			return SitePage.staticSearchFqClassSimpleName(siteRequest_, o);
		case "classCanonicalNames":
			return SitePage.staticSearchFqClassCanonicalNames(siteRequest_, o);
		case "sessionId":
			return SitePage.staticSearchFqSessionId(siteRequest_, o);
		case "userKey":
			return SitePage.staticSearchFqUserKey(siteRequest_, o);
		case "saves":
			return SitePage.staticSearchFqSaves(siteRequest_, o);
		case "objectTitle":
			return SitePage.staticSearchFqObjectTitle(siteRequest_, o);
		case "objectId":
			return SitePage.staticSearchFqObjectId(siteRequest_, o);
		case "objectNameVar":
			return SitePage.staticSearchFqObjectNameVar(siteRequest_, o);
		case "objectSuggest":
			return SitePage.staticSearchFqObjectSuggest(siteRequest_, o);
		case "objectText":
			return SitePage.staticSearchFqObjectText(siteRequest_, o);
		case "pageUrlId":
			return SitePage.staticSearchFqPageUrlId(siteRequest_, o);
		case "pageUrlPk":
			return SitePage.staticSearchFqPageUrlPk(siteRequest_, o);
		case "pageUrlApi":
			return SitePage.staticSearchFqPageUrlApi(siteRequest_, o);
		case "id":
			return SitePage.staticSearchFqId(siteRequest_, o);
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
					o = persistSitePage(v, val);
				else if(o instanceof BaseModel) {
					BaseModel oBaseModel = (BaseModel)o;
					o = oBaseModel.persistForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object persistSitePage(String var, Object val) {
		switch(var.toLowerCase()) {
			case "coursenum":
				if(val instanceof Integer)
					setCourseNum((Integer)val);
				else if(val instanceof String)
					setCourseNum((String)val);
				saves.add("courseNum");
				return val;
			case "lessonnum":
				if(val instanceof Integer)
					setLessonNum((Integer)val);
				else if(val instanceof String)
					setLessonNum((String)val);
				saves.add("lessonNum");
				return val;
			case "uri":
				if(val instanceof String)
					setUri((String)val);
				saves.add("uri");
				return val;
			case "pageid":
				if(val instanceof String)
					setPageId((String)val);
				saves.add("pageId");
				return val;
			case "h1":
				if(val instanceof String)
					setH1((String)val);
				saves.add("h1");
				return val;
			case "h2":
				if(val instanceof String)
					setH2((String)val);
				saves.add("h2");
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
			case "author":
				if(val instanceof String)
					setAuthor((String)val);
				saves.add("author");
				return val;
			case "pageimageuri":
				if(val instanceof String)
					setPageImageUri((String)val);
				saves.add("pageImageUri");
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
			case "objecttext":
				if(val instanceof List<?>)
					((List<String>)val).stream().forEach(v -> addObjectText(v));
				else if(val instanceof JsonArray)
					((JsonArray)val).stream().forEach(v -> addObjectText(v.toString()));
				if(!saves.contains("objectText"))
					saves.add("objectText");
				return val;
			default:
				return null;
		}
	}

	/////////////
	// populate //
	/////////////

	public void populateForClass(SolrResponse.Doc doc) {
		populateSitePage(doc);
	}
	public void populateSitePage(SolrResponse.Doc doc) {
		SitePage oSitePage = (SitePage)this;
		saves = doc.get("saves_docvalues_strings");
		if(saves != null) {
		}
	}

	public void indexSitePage(JsonObject doc) {
		if(courseNum != null) {
			doc.put("courseNum_docvalues_int", courseNum);
		}
		if(lessonNum != null) {
			doc.put("lessonNum_docvalues_int", lessonNum);
		}
		if(uri != null) {
			doc.put("uri_docvalues_string", uri);
		}
		if(pageId != null) {
			doc.put("pageId_docvalues_string", pageId);
		}
		if(h1 != null) {
			doc.put("h1_docvalues_string", h1);
		}
		if(h2 != null) {
			doc.put("h2_docvalues_string", h2);
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
		if(author != null) {
			doc.put("author_docvalues_string", author);
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

	public static String varStoredSitePage(String entityVar) {
		switch(entityVar) {
			case "courseNum":
				return "courseNum_docvalues_int";
			case "lessonNum":
				return "lessonNum_docvalues_int";
			case "uri":
				return "uri_docvalues_string";
			case "pageId":
				return "pageId_docvalues_string";
			case "h1":
				return "h1_docvalues_string";
			case "h2":
				return "h2_docvalues_string";
			case "inheritPk":
				return "inheritPk_docvalues_string";
			case "created":
				return "created_docvalues_date";
			case "modified":
				return "modified_docvalues_date";
			case "author":
				return "author_docvalues_string";
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

	public static String varIndexedSitePage(String entityVar) {
		switch(entityVar) {
			case "courseNum":
				return "courseNum_docvalues_int";
			case "lessonNum":
				return "lessonNum_docvalues_int";
			case "uri":
				return "uri_docvalues_string";
			case "pageId":
				return "pageId_docvalues_string";
			case "h1":
				return "h1_docvalues_string";
			case "h2":
				return "h2_docvalues_string";
			case "inheritPk":
				return "inheritPk_docvalues_string";
			case "created":
				return "created_docvalues_date";
			case "modified":
				return "modified_docvalues_date";
			case "author":
				return "author_docvalues_string";
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

	public static String searchVarSitePage(String searchVar) {
		switch(searchVar) {
			case "courseNum_docvalues_int":
				return "courseNum";
			case "lessonNum_docvalues_int":
				return "lessonNum";
			case "uri_docvalues_string":
				return "uri";
			case "pageId_docvalues_string":
				return "pageId";
			case "h1_docvalues_string":
				return "h1";
			case "h2_docvalues_string":
				return "h2";
			case "inheritPk_docvalues_string":
				return "inheritPk";
			case "created_docvalues_date":
				return "created";
			case "modified_docvalues_date":
				return "modified";
			case "author_docvalues_string":
				return "author";
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

	public static String varSearchSitePage(String entityVar) {
		switch(entityVar) {
			case "objectText":
				return "objectText_text_enUS";
			case "objectSuggest":
				return "objectSuggest_suggested";
			default:
				return null;
		}
	}

	public static String varSuggestedSitePage(String entityVar) {
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
		storeSitePage(doc);
	}
	public void storeSitePage(SolrResponse.Doc doc) {
		SitePage oSitePage = (SitePage)this;

		oSitePage.setCourseNum(Optional.ofNullable(doc.get("courseNum_docvalues_int")).map(v -> v.toString()).orElse(null));
		oSitePage.setLessonNum(Optional.ofNullable(doc.get("lessonNum_docvalues_int")).map(v -> v.toString()).orElse(null));
		oSitePage.setUri(Optional.ofNullable(doc.get("uri_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSitePage.setPageId(Optional.ofNullable(doc.get("pageId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSitePage.setH1(Optional.ofNullable(doc.get("h1_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSitePage.setH2(Optional.ofNullable(doc.get("h2_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSitePage.setInheritPk(Optional.ofNullable(doc.get("inheritPk_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSitePage.setCreated(Optional.ofNullable(doc.get("created_docvalues_date")).map(v -> v.toString()).orElse(null));
		oSitePage.setModified(Optional.ofNullable(doc.get("modified_docvalues_date")).map(v -> v.toString()).orElse(null));
		oSitePage.setAuthor(Optional.ofNullable(doc.get("author_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSitePage.setPageImageUri(Optional.ofNullable(doc.get("pageImageUri_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSitePage.setArchived(Optional.ofNullable(doc.get("archived_docvalues_boolean")).map(v -> v.toString()).orElse(null));
		oSitePage.setDeleted(Optional.ofNullable(doc.get("deleted_docvalues_boolean")).map(v -> v.toString()).orElse(null));
		oSitePage.setClassCanonicalName(Optional.ofNullable(doc.get("classCanonicalName_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSitePage.setClassSimpleName(Optional.ofNullable(doc.get("classSimpleName_docvalues_string")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("classCanonicalNames_docvalues_strings")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oSitePage.addClassCanonicalNames(v.toString());
		});
		oSitePage.setSessionId(Optional.ofNullable(doc.get("sessionId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSitePage.setUserKey(Optional.ofNullable(doc.get("userKey_docvalues_long")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("saves_docvalues_strings")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oSitePage.addSaves(v.toString());
		});
		oSitePage.setObjectTitle(Optional.ofNullable(doc.get("objectTitle_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSitePage.setObjectId(Optional.ofNullable(doc.get("objectId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSitePage.setObjectSuggest(Optional.ofNullable(doc.get("objectSuggest_suggested")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("objectText_text_enUS")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oSitePage.addObjectText(v.toString());
		});
		oSitePage.setPageUrlId(Optional.ofNullable(doc.get("pageUrlId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSitePage.setPageUrlPk(Optional.ofNullable(doc.get("pageUrlPk_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSitePage.setPageUrlApi(Optional.ofNullable(doc.get("pageUrlApi_docvalues_string")).map(v -> v.toString()).orElse(null));
		String id = (String)doc.get("id");
		oSitePage.setId(id);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestSitePage() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof SitePage) {
			SitePage original = (SitePage)o;
			if(!Objects.equals(courseNum, original.getCourseNum()))
				apiRequest.addVars("courseNum");
			if(!Objects.equals(lessonNum, original.getLessonNum()))
				apiRequest.addVars("lessonNum");
			if(!Objects.equals(uri, original.getUri()))
				apiRequest.addVars("uri");
			if(!Objects.equals(pageId, original.getPageId()))
				apiRequest.addVars("pageId");
			if(!Objects.equals(h1, original.getH1()))
				apiRequest.addVars("h1");
			if(!Objects.equals(h2, original.getH2()))
				apiRequest.addVars("h2");
			if(!Objects.equals(inheritPk, original.getInheritPk()))
				apiRequest.addVars("inheritPk");
			if(!Objects.equals(created, original.getCreated()))
				apiRequest.addVars("created");
			if(!Objects.equals(modified, original.getModified()))
				apiRequest.addVars("modified");
			if(!Objects.equals(author, original.getAuthor()))
				apiRequest.addVars("author");
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
		sb.append(Optional.ofNullable(courseNum).map(v -> "courseNum: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(lessonNum).map(v -> "lessonNum: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(uri).map(v -> "uri: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(pageId).map(v -> "pageId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(h1).map(v -> "h1: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(h2).map(v -> "h2: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(inheritPk).map(v -> "inheritPk: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(created).map(v -> "created: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(modified).map(v -> "modified: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(author).map(v -> "author: \"" + v + "\"\n" ).orElse(""));
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

	public static final String CLASS_SIMPLE_NAME = "SitePage";
	public static final String VAR_siteRequest_ = "siteRequest_";
	public static final String VAR_siteName = "siteName";
	public static final String VAR_siteDisplayName = "siteDisplayName";
	public static final String VAR_staticBaseUrl = "staticBaseUrl";
	public static final String VAR_staticPath = "staticPath";
	public static final String VAR_siteBaseUrl = "siteBaseUrl";
	public static final String VAR_promiseBefore = "promiseBefore";
	public static final String VAR_courseNum = "courseNum";
	public static final String VAR_lessonNum = "lessonNum";
	public static final String VAR_uri = "uri";
	public static final String VAR_pageId = "pageId";
	public static final String VAR_h1 = "h1";
	public static final String VAR_h2 = "h2";
	public static final String VAR_inheritPk = "inheritPk";
	public static final String VAR_created = "created";
	public static final String VAR_modified = "modified";
	public static final String VAR_author = "author";
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
	public static final String VAR_objectNameVar = "objectNameVar";
	public static final String VAR_objectSuggest = "objectSuggest";
	public static final String VAR_objectText = "objectText";
	public static final String VAR_pageUrlId = "pageUrlId";
	public static final String VAR_pageUrlPk = "pageUrlPk";
	public static final String VAR_pageUrlApi = "pageUrlApi";
	public static final String VAR_id = "id";

	public static List<String> varsQForClass() {
		return SitePage.varsQSitePage(new ArrayList<String>());
	}
	public static List<String> varsQSitePage(List<String> vars) {
		vars.add(VAR_objectSuggest);
		vars.add(VAR_objectText);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return SitePage.varsFqSitePage(new ArrayList<String>());
	}
	public static List<String> varsFqSitePage(List<String> vars) {
		vars.add(VAR_courseNum);
		vars.add(VAR_lessonNum);
		vars.add(VAR_uri);
		vars.add(VAR_pageId);
		vars.add(VAR_created);
		vars.add(VAR_author);
		vars.add(VAR_pageImageUri);
		vars.add(VAR_classSimpleName);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return SitePage.varsRangeSitePage(new ArrayList<String>());
	}
	public static List<String> varsRangeSitePage(List<String> vars) {
		vars.add(VAR_courseNum);
		vars.add(VAR_lessonNum);
		vars.add(VAR_created);
		return vars;
	}

	public static final String DISPLAY_NAME_siteRequest_ = "";
	public static final String DISPLAY_NAME_siteName = "";
	public static final String DISPLAY_NAME_siteDisplayName = "";
	public static final String DISPLAY_NAME_staticBaseUrl = "";
	public static final String DISPLAY_NAME_staticPath = "";
	public static final String DISPLAY_NAME_siteBaseUrl = "";
	public static final String DISPLAY_NAME_promiseBefore = "";
	public static final String DISPLAY_NAME_courseNum = "Course Number";
	public static final String DISPLAY_NAME_lessonNum = "Lesson Number";
	public static final String DISPLAY_NAME_uri = "URI";
	public static final String DISPLAY_NAME_pageId = "Page ID";
	public static final String DISPLAY_NAME_h1 = "header 1";
	public static final String DISPLAY_NAME_h2 = "header 2";
	public static final String DISPLAY_NAME_inheritPk = "";
	public static final String DISPLAY_NAME_created = "created";
	public static final String DISPLAY_NAME_modified = "modified";
	public static final String DISPLAY_NAME_author = "author";
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
	public static final String DISPLAY_NAME_objectNameVar = "";
	public static final String DISPLAY_NAME_objectSuggest = "autosuggest";
	public static final String DISPLAY_NAME_objectText = "text";
	public static final String DISPLAY_NAME_pageUrlId = "";
	public static final String DISPLAY_NAME_pageUrlPk = "";
	public static final String DISPLAY_NAME_pageUrlApi = "";
	public static final String DISPLAY_NAME_id = "";

	public static String displayNameForClass(String var) {
		return SitePage.displayNameSitePage(var);
	}
	public static String displayNameSitePage(String var) {
		switch(var) {
		case VAR_siteRequest_:
			return DISPLAY_NAME_siteRequest_;
		case VAR_siteName:
			return DISPLAY_NAME_siteName;
		case VAR_siteDisplayName:
			return DISPLAY_NAME_siteDisplayName;
		case VAR_staticBaseUrl:
			return DISPLAY_NAME_staticBaseUrl;
		case VAR_staticPath:
			return DISPLAY_NAME_staticPath;
		case VAR_siteBaseUrl:
			return DISPLAY_NAME_siteBaseUrl;
		case VAR_promiseBefore:
			return DISPLAY_NAME_promiseBefore;
		case VAR_courseNum:
			return DISPLAY_NAME_courseNum;
		case VAR_lessonNum:
			return DISPLAY_NAME_lessonNum;
		case VAR_uri:
			return DISPLAY_NAME_uri;
		case VAR_pageId:
			return DISPLAY_NAME_pageId;
		case VAR_h1:
			return DISPLAY_NAME_h1;
		case VAR_h2:
			return DISPLAY_NAME_h2;
		case VAR_inheritPk:
			return DISPLAY_NAME_inheritPk;
		case VAR_created:
			return DISPLAY_NAME_created;
		case VAR_modified:
			return DISPLAY_NAME_modified;
		case VAR_author:
			return DISPLAY_NAME_author;
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

	public static String descriptionSitePage(String var) {
		switch(var) {
		case VAR_siteRequest_:
			return "The current request object";
		case VAR_promiseBefore:
			return "An asynchronous method for searching for a computer related to this message";
		case VAR_courseNum:
			return "The course number for this page. ";
		case VAR_lessonNum:
			return "The lesson number for this page. ";
		case VAR_uri:
			return "The relative URI for this page. ";
		case VAR_pageId:
			return "The ID for this page. ";
		case VAR_h1:
			return "The 1st header of this page. ";
		case VAR_h2:
			return "The 2nd header of this page. ";
		case VAR_inheritPk:
			return "An optional inherited primary key from a legacy system for this object in the database";
		case VAR_created:
			return "A created timestamp for this record in the database";
		case VAR_modified:
			return "A modified timestamp for this record in the database";
		case VAR_author:
			return "The author";
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

	public static String classSimpleNameSitePage(String var) {
		switch(var) {
		case VAR_siteRequest_:
			return "SiteRequestEnUS";
		case VAR_siteName:
			return "String";
		case VAR_siteDisplayName:
			return "String";
		case VAR_staticBaseUrl:
			return "String";
		case VAR_staticPath:
			return "String";
		case VAR_siteBaseUrl:
			return "String";
		case VAR_promiseBefore:
			return "Void";
		case VAR_courseNum:
			return "Integer";
		case VAR_lessonNum:
			return "Integer";
		case VAR_uri:
			return "String";
		case VAR_pageId:
			return "String";
		case VAR_h1:
			return "String";
		case VAR_h2:
			return "String";
		case VAR_inheritPk:
			return "String";
		case VAR_created:
			return "ZonedDateTime";
		case VAR_modified:
			return "ZonedDateTime";
		case VAR_author:
			return "String";
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
		case VAR_objectNameVar:
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

	public static Integer htmlColumnSitePage(String var) {
		switch(var) {
		case VAR_uri:
			return 4;
		case VAR_created:
			return 1;
		case VAR_objectTitle:
			return 2;
			default:
				return null;
		}
	}

	public static Integer htmlRowSitePage(String var) {
		switch(var) {
		case VAR_uri:
			return 3;
		case VAR_pageId:
			return 3;
		case VAR_created:
			return 1;
		case VAR_modified:
			return 1;
		case VAR_author:
			return 3;
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

	public static Integer htmlCellSitePage(String var) {
		switch(var) {
		case VAR_uri:
			return 2;
		case VAR_pageId:
			return 1;
		case VAR_created:
			return 2;
		case VAR_modified:
			return 3;
		case VAR_author:
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

	public static Integer lengthMinSitePage(String var) {
		switch(var) {
			default:
				return null;
		}
	}

	public static Integer lengthMaxSitePage(String var) {
		switch(var) {
			default:
				return null;
		}
	}

	public static Integer maxSitePage(String var) {
		switch(var) {
			default:
				return null;
		}
	}

	public static Integer minSitePage(String var) {
		switch(var) {
			default:
				return null;
		}
	}
}
