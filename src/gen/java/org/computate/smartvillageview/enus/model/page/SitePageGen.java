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
import org.computate.smartvillageview.enus.result.base.BaseResult;
import java.lang.String;
import java.lang.Integer;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
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
 * <h1>About the SitePage class and it's generated class SitePageGen&lt;BaseResult&gt;: </h1>
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
 * <p>This class contains a comment <b>"Indexed: true"</b>, which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * <p>This class contains a comment <b>"Page: true"</b>, which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.smartvillageview.enus.model.page.SitePagePage. 
 * </p>
 * <p>This class contains a comment <b>"SuperPage.enUS: BaseResultPage"</b>, which identifies the Java super class of the page code by it's class simple name "BaseResultPage". 
 * This means that the newly created class org.computate.smartvillageview.enus.model.page.SitePagePage extends org.computate.smartvillageview.enus.result.base.BaseResultPage. 
 * </p>
 * <p>This class contains a comment <b>"Api: true"</b>, which means this class will have Java Vert.x API backend code generated for these objects. 
 * </p>
 * <p>This class contains a comment <b>"ApiTag: Page"</b>, which groups all of the OpenAPIs for SitePage objects under the tag "Page". 
 * </p>
 * <p>This class contains a comment <b>"ApiUri: /api/page"</b>, which defines the base API URI for SitePage objects as "/api/page" in the OpenAPI spec. 
 * </p>
 * <p>This class contains a comment <b>"AName.enUS: an article"</b>, which identifies the language context to describe a SitePage as "an article". 
 * </p>
 * <p>This class contains a comment <b>"Color: 2017-navy-peony"</b>, which styles the SitePage page "2017-navy-peony". 
 * This will reference a CSS class defined by the stylesheets in the project that starts with "w3-". 
 * A css class of "w3-2017-navy-peony" is expected to exist in the project stylesheets, and is inspired by W3 CSS colors. 
 * See: <a href="https://www.w3schools.com/w3css/w3css_colors.asp">https://www.w3schools.com/w3css/w3css_colors.asp</a>. 
 * </p>
 * <p>This class contains a comment <b>"IconGroup: duotone"</b>, which adds icons on the SitePage page with a group of "duotone". 
 * This will reference a Font Awesome icon group defined by the stylesheets in the project that starts with "fa" followed by the first letter of the icon group, which is "fad". 
 * A Font Awesome icon group of "2017-navy-peony" is expected to exist. 
 * The Font Awesome groups currently supported include: solid, thin, duotone. 
 * See: <a href="https://www.w3schools.com/w3css/w3css_colors.asp">https://www.w3schools.com/w3css/w3css_colors.asp</a>. 
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
public abstract class SitePageGen<DEV> extends BaseResult {
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

	public Future<Void> promiseSitePage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				siteNameInit();
				siteDisplayNameInit();
				staticBaseUrlInit();
				staticPathInit();
				siteBaseUrlInit();
				courseNumInit();
				lessonNumInit();
				uriInit();
				pageIdInit();
				h1Init();
				h2Init();
				authorInit();
				pageImageUriInit();
				pageImageWidthInit();
				pageImageHeightInit();
				pageImageTypeInit();
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
		return promiseDeepSitePage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestSitePage(SiteRequestEnUS siteRequest_) {
			super.siteRequestBaseResult(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestSitePage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
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
				return super.relateBaseResult(var, val);
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
			default:
				return BaseResult.staticSetBaseResult(entityVar,  siteRequest_, o);
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
			default:
				return BaseResult.staticSearchBaseResult(entityVar,  siteRequest_, o);
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
			default:
				return BaseResult.staticSearchStrBaseResult(entityVar,  siteRequest_, o);
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
			default:
				return super.persistBaseResult(var, val);
		}
	}

	/////////////
	// populate //
	/////////////

	@Override public void populateForClass(SolrResponse.Doc doc) {
		populateSitePage(doc);
	}
	public void populateSitePage(SolrResponse.Doc doc) {
		SitePage oSitePage = (SitePage)this;
		saves = doc.get("saves_docvalues_strings");
		if(saves != null) {
		}

		super.populateBaseResult(doc);
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
		if(author != null) {
			doc.put("author_docvalues_string", author);
		}
		if(pageImageUri != null) {
			doc.put("pageImageUri_docvalues_string", pageImageUri);
		}
		super.indexBaseResult(doc);

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
			case "author":
				return "author_docvalues_string";
			case "pageImageUri":
				return "pageImageUri_docvalues_string";
			default:
				return BaseResult.varStoredBaseResult(entityVar);
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
			case "author":
				return "author_docvalues_string";
			case "pageImageUri":
				return "pageImageUri_docvalues_string";
			default:
				return BaseResult.varIndexedBaseResult(entityVar);
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
			case "author_docvalues_string":
				return "author";
			case "pageImageUri_docvalues_string":
				return "pageImageUri";
			default:
				return BaseResult.searchVarBaseResult(searchVar);
		}
	}

	public static String varSearchSitePage(String entityVar) {
		switch(entityVar) {
			default:
				return BaseResult.varSearchBaseResult(entityVar);
		}
	}

	public static String varSuggestedSitePage(String entityVar) {
		switch(entityVar) {
			default:
				return BaseResult.varSuggestedBaseResult(entityVar);
		}
	}

	/////////////
	// store //
	/////////////

	@Override public void storeForClass(SolrResponse.Doc doc) {
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
		oSitePage.setAuthor(Optional.ofNullable(doc.get("author_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSitePage.setPageImageUri(Optional.ofNullable(doc.get("pageImageUri_docvalues_string")).map(v -> v.toString()).orElse(null));

		super.storeBaseResult(doc);
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
			if(!Objects.equals(author, original.getAuthor()))
				apiRequest.addVars("author");
			if(!Objects.equals(pageImageUri, original.getPageImageUri()))
				apiRequest.addVars("pageImageUri");
			super.apiRequestBaseResult();
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(Optional.ofNullable(courseNum).map(v -> "courseNum: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(lessonNum).map(v -> "lessonNum: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(uri).map(v -> "uri: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(pageId).map(v -> "pageId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(h1).map(v -> "h1: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(h2).map(v -> "h2: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(author).map(v -> "author: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(pageImageUri).map(v -> "pageImageUri: \"" + v + "\"\n" ).orElse(""));
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "SitePage";
	public static final String VAR_siteName = "siteName";
	public static final String VAR_siteDisplayName = "siteDisplayName";
	public static final String VAR_staticBaseUrl = "staticBaseUrl";
	public static final String VAR_staticPath = "staticPath";
	public static final String VAR_siteBaseUrl = "siteBaseUrl";
	public static final String VAR_courseNum = "courseNum";
	public static final String VAR_lessonNum = "lessonNum";
	public static final String VAR_uri = "uri";
	public static final String VAR_pageId = "pageId";
	public static final String VAR_h1 = "h1";
	public static final String VAR_h2 = "h2";
	public static final String VAR_author = "author";
	public static final String VAR_pageImageUri = "pageImageUri";
	public static final String VAR_pageImageWidth = "pageImageWidth";
	public static final String VAR_pageImageHeight = "pageImageHeight";
	public static final String VAR_pageImageType = "pageImageType";

	public static List<String> varsQForClass() {
		return SitePage.varsQSitePage(new ArrayList<String>());
	}
	public static List<String> varsQSitePage(List<String> vars) {
		BaseResult.varsQBaseResult(vars);
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
		vars.add(VAR_author);
		vars.add(VAR_pageImageUri);
		BaseResult.varsFqBaseResult(vars);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return SitePage.varsRangeSitePage(new ArrayList<String>());
	}
	public static List<String> varsRangeSitePage(List<String> vars) {
		vars.add(VAR_courseNum);
		vars.add(VAR_lessonNum);
		BaseResult.varsRangeBaseResult(vars);
		return vars;
	}

	public static final String DISPLAY_NAME_siteName = "";
	public static final String DISPLAY_NAME_siteDisplayName = "";
	public static final String DISPLAY_NAME_staticBaseUrl = "";
	public static final String DISPLAY_NAME_staticPath = "";
	public static final String DISPLAY_NAME_siteBaseUrl = "";
	public static final String DISPLAY_NAME_courseNum = "Course Number";
	public static final String DISPLAY_NAME_lessonNum = "Lesson Number";
	public static final String DISPLAY_NAME_uri = "URI";
	public static final String DISPLAY_NAME_pageId = "Page ID";
	public static final String DISPLAY_NAME_h1 = "header 1";
	public static final String DISPLAY_NAME_h2 = "header 2";
	public static final String DISPLAY_NAME_author = "author";
	public static final String DISPLAY_NAME_pageImageUri = "imageUri";
	public static final String DISPLAY_NAME_pageImageWidth = "";
	public static final String DISPLAY_NAME_pageImageHeight = "";
	public static final String DISPLAY_NAME_pageImageType = "";

	public static String displayNameForClass(String var) {
		return SitePage.displayNameSitePage(var);
	}
	public static String displayNameSitePage(String var) {
		switch(var) {
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
		default:
			return BaseResult.displayNameBaseResult(var);
		}
	}

	public static String descriptionSitePage(String var) {
		switch(var) {
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
			default:
				return BaseResult.descriptionBaseResult(var);
		}
	}

	public static String classSimpleNameSitePage(String var) {
		switch(var) {
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
			default:
				return BaseResult.classSimpleNameBaseResult(var);
		}
	}

	public static Integer htmlColumnSitePage(String var) {
		switch(var) {
		case VAR_uri:
			return 4;
			default:
				return BaseResult.htmlColumnBaseResult(var);
		}
	}

	public static Integer htmlRowSitePage(String var) {
		switch(var) {
		case VAR_uri:
			return 3;
		case VAR_pageId:
			return 3;
		case VAR_author:
			return 3;
		case VAR_pageImageUri:
			return 4;
			default:
				return BaseResult.htmlRowBaseResult(var);
		}
	}

	public static Integer htmlCellSitePage(String var) {
		switch(var) {
		case VAR_uri:
			return 2;
		case VAR_pageId:
			return 1;
		case VAR_author:
			return 3;
		case VAR_pageImageUri:
			return 1;
			default:
				return BaseResult.htmlCellBaseResult(var);
		}
	}

	public static Integer lengthMinSitePage(String var) {
		switch(var) {
			default:
				return BaseResult.lengthMinBaseResult(var);
		}
	}

	public static Integer lengthMaxSitePage(String var) {
		switch(var) {
			default:
				return BaseResult.lengthMaxBaseResult(var);
		}
	}

	public static Integer maxSitePage(String var) {
		switch(var) {
			default:
				return BaseResult.maxBaseResult(var);
		}
	}

	public static Integer minSitePage(String var) {
		switch(var) {
			default:
				return BaseResult.minBaseResult(var);
		}
	}
}
