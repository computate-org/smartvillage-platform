package org.computate.smartvillageview.enus.page.dynamic;

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
import org.computate.smartvillageview.enus.page.PageLayout;
import io.vertx.core.json.JsonObject;
import java.lang.String;
import org.computate.vertx.search.list.SearchList;
import org.computate.smartvillageview.enus.model.htm.SiteHtm;
import io.vertx.core.json.JsonArray;
import java.time.ZoneId;
import java.util.Locale;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;

/**	
 * <h1>Suggestions that can generate more code for you: </h1>
 * <ol>
 * <li>You can add a class comment "Api: true" if you wish to GET, POST, PATCH or PUT these DynamicPage objects in a RESTful API. 
 * </li>
 * </ol>
 * <h1>About the DynamicPage class and it's generated class DynamicPageGen&lt;PageLayout&gt;: </h1>
 * <p>
 * This Java class extends a generated Java class built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.dynamic.DynamicPage">Find the class DynamicPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * <p>
 * Delete the class DynamicPage in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.dynamic.DynamicPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.page.dynamic in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.page.dynamic&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smart-village-view in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smart\-village\-view&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class DynamicPageGen<DEV> extends PageLayout {
	protected static final Logger LOG = LoggerFactory.getLogger(DynamicPage.class);

	//////////
	// page //
	//////////

	/**	 The entity page
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject page;

	/**	<br> The entity page
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.dynamic.DynamicPage&fq=entiteVar_enUS_indexed_string:page">Find the entity page in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _page(Wrap<JsonObject> w);

	public JsonObject getPage() {
		return page;
	}

	public void setPage(JsonObject page) {
		this.page = page;
	}
	@JsonIgnore
	public void setPage(String o) {
		this.page = DynamicPage.staticSetPage(siteRequest_, o);
	}
	public static JsonObject staticSetPage(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected DynamicPage pageInit() {
		Wrap<JsonObject> pageWrap = new Wrap<JsonObject>().var("page");
		if(page == null) {
			_page(pageWrap);
			setPage(pageWrap.o);
		}
		return (DynamicPage)this;
	}

	public static JsonObject staticSearchPage(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrPage(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPage(SiteRequestEnUS siteRequest_, String o) {
		return DynamicPage.staticSearchStrPage(siteRequest_, DynamicPage.staticSearchPage(siteRequest_, DynamicPage.staticSetPage(siteRequest_, o)));
	}

	/////////
	// uri //
	/////////

	/**	 The entity uri
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected String uri;

	/**	<br> The entity uri
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.dynamic.DynamicPage&fq=entiteVar_enUS_indexed_string:uri">Find the entity uri in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _uri(Wrap<String> w);

	public String getUri() {
		return uri;
	}
	public void setUri(String o) {
		this.uri = DynamicPage.staticSetUri(siteRequest_, o);
	}
	public static String staticSetUri(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected DynamicPage uriInit() {
		Wrap<String> uriWrap = new Wrap<String>().var("uri");
		if(uri == null) {
			_uri(uriWrap);
			setUri(uriWrap.o);
		}
		return (DynamicPage)this;
	}

	public static String staticSearchUri(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrUri(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUri(SiteRequestEnUS siteRequest_, String o) {
		return DynamicPage.staticSearchStrUri(siteRequest_, DynamicPage.staticSearchUri(siteRequest_, DynamicPage.staticSetUri(siteRequest_, o)));
	}

	////////////
	// pageId //
	////////////

	/**	 The entity pageId
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected String pageId;

	/**	<br> The entity pageId
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.dynamic.DynamicPage&fq=entiteVar_enUS_indexed_string:pageId">Find the entity pageId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageId(Wrap<String> w);

	public String getPageId() {
		return pageId;
	}
	public void setPageId(String o) {
		this.pageId = DynamicPage.staticSetPageId(siteRequest_, o);
	}
	public static String staticSetPageId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected DynamicPage pageIdInit() {
		Wrap<String> pageIdWrap = new Wrap<String>().var("pageId");
		if(pageId == null) {
			_pageId(pageIdWrap);
			setPageId(pageIdWrap.o);
		}
		return (DynamicPage)this;
	}

	public static String staticSearchPageId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageId(SiteRequestEnUS siteRequest_, String o) {
		return DynamicPage.staticSearchStrPageId(siteRequest_, DynamicPage.staticSearchPageId(siteRequest_, DynamicPage.staticSetPageId(siteRequest_, o)));
	}

	//////////
	// vars //
	//////////

	/**	 The entity vars
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected Map<String, String> vars;

	/**	<br> The entity vars
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.dynamic.DynamicPage&fq=entiteVar_enUS_indexed_string:vars">Find the entity vars in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _vars(Wrap<Map<String, String>> w);

	public Map<String, String> getVars() {
		return vars;
	}

	public void setVars(Map<String, String> vars) {
		this.vars = vars;
	}
	public static Map<String, String> staticSetVars(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected DynamicPage varsInit() {
		Wrap<Map<String, String>> varsWrap = new Wrap<Map<String, String>>().var("vars");
		if(vars == null) {
			_vars(varsWrap);
			setVars(varsWrap.o);
		}
		return (DynamicPage)this;
	}

	/////////////////
	// filterLabel //
	/////////////////

	/**	 The entity filterLabel
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String filterLabel;

	/**	<br> The entity filterLabel
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.dynamic.DynamicPage&fq=entiteVar_enUS_indexed_string:filterLabel">Find the entity filterLabel in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _filterLabel(Wrap<String> w);

	public String getFilterLabel() {
		return filterLabel;
	}
	public void setFilterLabel(String o) {
		this.filterLabel = DynamicPage.staticSetFilterLabel(siteRequest_, o);
	}
	public static String staticSetFilterLabel(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected DynamicPage filterLabelInit() {
		Wrap<String> filterLabelWrap = new Wrap<String>().var("filterLabel");
		if(filterLabel == null) {
			_filterLabel(filterLabelWrap);
			setFilterLabel(filterLabelWrap.o);
		}
		return (DynamicPage)this;
	}

	public static String staticSearchFilterLabel(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrFilterLabel(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqFilterLabel(SiteRequestEnUS siteRequest_, String o) {
		return DynamicPage.staticSearchStrFilterLabel(siteRequest_, DynamicPage.staticSearchFilterLabel(siteRequest_, DynamicPage.staticSetFilterLabel(siteRequest_, o)));
	}

	/////////////
	// htmList //
	/////////////

	/**	 The entity htmList
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<SiteHtm> htmList;

	/**	<br> The entity htmList
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.dynamic.DynamicPage&fq=entiteVar_enUS_indexed_string:htmList">Find the entity htmList in Solr</a>
	 * <br>
	 * @param promise is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _htmList(Promise<SearchList<SiteHtm>> promise);

	public SearchList<SiteHtm> getHtmList() {
		return htmList;
	}

	public void setHtmList(SearchList<SiteHtm> htmList) {
		this.htmList = htmList;
	}
	public static SearchList<SiteHtm> staticSetHtmList(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected Future<SearchList<SiteHtm>> htmListPromise() {
		Promise<SearchList<SiteHtm>> promise = Promise.promise();
		Promise<SearchList<SiteHtm>> promise2 = Promise.promise();
		_htmList(promise2);
		promise2.future().onSuccess(o -> {
			if(o != null && htmList == null) {
				o.promiseDeepForClass(siteRequest_).onSuccess(a -> {
					setHtmList(o);
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
	public static final String htmListPromiseComplete1 = "Site HTML search list succeeded. ";
	public static final String htmListPromiseComplete = htmListPromiseComplete1;
	public static final String htmListPromiseFail1 = "Site HTML search list failed. ";
	public static final String htmListPromiseFail = htmListPromiseFail1;

	public static final String htmListLoopComplete1 = "Loop site HTML search list succeeded. ";
	public static final String htmListLoopComplete = htmListLoopComplete1;
	public static final String htmListLoopFail1 = "Loop site HTML search list failed. ";
	public static final String htmListLoopFail = htmListLoopFail1;


	//////////////
	// htmTitle //
	//////////////

	/**	 The entity htmTitle
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray htmTitle = new JsonArray();

	/**	<br> The entity htmTitle
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.dynamic.DynamicPage&fq=entiteVar_enUS_indexed_string:htmTitle">Find the entity htmTitle in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _htmTitle(JsonArray l);

	public JsonArray getHtmTitle() {
		return htmTitle;
	}

	public void setHtmTitle(JsonArray htmTitle) {
		this.htmTitle = htmTitle;
	}
	public static JsonArray staticSetHtmTitle(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected DynamicPage htmTitleInit() {
		_htmTitle(htmTitle);
		return (DynamicPage)this;
	}

	/////////////
	// htmMeta //
	/////////////

	/**	 The entity htmMeta
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray htmMeta = new JsonArray();

	/**	<br> The entity htmMeta
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.dynamic.DynamicPage&fq=entiteVar_enUS_indexed_string:htmMeta">Find the entity htmMeta in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _htmMeta(JsonArray l);

	public JsonArray getHtmMeta() {
		return htmMeta;
	}

	public void setHtmMeta(JsonArray htmMeta) {
		this.htmMeta = htmMeta;
	}
	public static JsonArray staticSetHtmMeta(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected DynamicPage htmMetaInit() {
		_htmMeta(htmMeta);
		return (DynamicPage)this;
	}

	/////////////
	// htmBody //
	/////////////

	/**	 The entity htmBody
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray htmBody = new JsonArray();

	/**	<br> The entity htmBody
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.dynamic.DynamicPage&fq=entiteVar_enUS_indexed_string:htmBody">Find the entity htmBody in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _htmBody(JsonArray l);

	public JsonArray getHtmBody() {
		return htmBody;
	}

	public void setHtmBody(JsonArray htmBody) {
		this.htmBody = htmBody;
	}
	public static JsonArray staticSetHtmBody(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected DynamicPage htmBodyInit() {
		_htmBody(htmBody);
		return (DynamicPage)this;
	}

	//////////////////
	// pageResponse //
	//////////////////

	/**	 The entity pageResponse
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageResponse;

	/**	<br> The entity pageResponse
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.dynamic.DynamicPage&fq=entiteVar_enUS_indexed_string:pageResponse">Find the entity pageResponse in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageResponse(Wrap<String> w);

	public String getPageResponse() {
		return pageResponse;
	}
	public void setPageResponse(String o) {
		this.pageResponse = DynamicPage.staticSetPageResponse(siteRequest_, o);
	}
	public static String staticSetPageResponse(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected DynamicPage pageResponseInit() {
		Wrap<String> pageResponseWrap = new Wrap<String>().var("pageResponse");
		if(pageResponse == null) {
			_pageResponse(pageResponseWrap);
			setPageResponse(pageResponseWrap.o);
		}
		return (DynamicPage)this;
	}

	public static String staticSearchPageResponse(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageResponse(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageResponse(SiteRequestEnUS siteRequest_, String o) {
		return DynamicPage.staticSearchStrPageResponse(siteRequest_, DynamicPage.staticSearchPageResponse(siteRequest_, DynamicPage.staticSetPageResponse(siteRequest_, o)));
	}

	///////////////////
	// defaultZoneId //
	///////////////////

	/**	 The entity defaultZoneId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String defaultZoneId;

	/**	<br> The entity defaultZoneId
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.dynamic.DynamicPage&fq=entiteVar_enUS_indexed_string:defaultZoneId">Find the entity defaultZoneId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultZoneId(Wrap<String> w);

	public String getDefaultZoneId() {
		return defaultZoneId;
	}
	public void setDefaultZoneId(String o) {
		this.defaultZoneId = DynamicPage.staticSetDefaultZoneId(siteRequest_, o);
	}
	public static String staticSetDefaultZoneId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected DynamicPage defaultZoneIdInit() {
		Wrap<String> defaultZoneIdWrap = new Wrap<String>().var("defaultZoneId");
		if(defaultZoneId == null) {
			_defaultZoneId(defaultZoneIdWrap);
			setDefaultZoneId(defaultZoneIdWrap.o);
		}
		return (DynamicPage)this;
	}

	public static String staticSearchDefaultZoneId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDefaultZoneId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultZoneId(SiteRequestEnUS siteRequest_, String o) {
		return DynamicPage.staticSearchStrDefaultZoneId(siteRequest_, DynamicPage.staticSearchDefaultZoneId(siteRequest_, DynamicPage.staticSetDefaultZoneId(siteRequest_, o)));
	}

	/////////////////////
	// defaultTimeZone //
	/////////////////////

	/**	 The entity defaultTimeZone
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected ZoneId defaultTimeZone;

	/**	<br> The entity defaultTimeZone
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.dynamic.DynamicPage&fq=entiteVar_enUS_indexed_string:defaultTimeZone">Find the entity defaultTimeZone in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultTimeZone(Wrap<ZoneId> w);

	public ZoneId getDefaultTimeZone() {
		return defaultTimeZone;
	}

	public void setDefaultTimeZone(ZoneId defaultTimeZone) {
		this.defaultTimeZone = defaultTimeZone;
	}
	public static ZoneId staticSetDefaultTimeZone(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected DynamicPage defaultTimeZoneInit() {
		Wrap<ZoneId> defaultTimeZoneWrap = new Wrap<ZoneId>().var("defaultTimeZone");
		if(defaultTimeZone == null) {
			_defaultTimeZone(defaultTimeZoneWrap);
			setDefaultTimeZone(defaultTimeZoneWrap.o);
		}
		return (DynamicPage)this;
	}

	/////////////////////
	// defaultLocaleId //
	/////////////////////

	/**	 The entity defaultLocaleId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String defaultLocaleId;

	/**	<br> The entity defaultLocaleId
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.dynamic.DynamicPage&fq=entiteVar_enUS_indexed_string:defaultLocaleId">Find the entity defaultLocaleId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultLocaleId(Wrap<String> w);

	public String getDefaultLocaleId() {
		return defaultLocaleId;
	}
	public void setDefaultLocaleId(String o) {
		this.defaultLocaleId = DynamicPage.staticSetDefaultLocaleId(siteRequest_, o);
	}
	public static String staticSetDefaultLocaleId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected DynamicPage defaultLocaleIdInit() {
		Wrap<String> defaultLocaleIdWrap = new Wrap<String>().var("defaultLocaleId");
		if(defaultLocaleId == null) {
			_defaultLocaleId(defaultLocaleIdWrap);
			setDefaultLocaleId(defaultLocaleIdWrap.o);
		}
		return (DynamicPage)this;
	}

	public static String staticSearchDefaultLocaleId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDefaultLocaleId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultLocaleId(SiteRequestEnUS siteRequest_, String o) {
		return DynamicPage.staticSearchStrDefaultLocaleId(siteRequest_, DynamicPage.staticSearchDefaultLocaleId(siteRequest_, DynamicPage.staticSetDefaultLocaleId(siteRequest_, o)));
	}

	///////////////////
	// defaultLocale //
	///////////////////

	/**	 The entity defaultLocale
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected Locale defaultLocale;

	/**	<br> The entity defaultLocale
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.dynamic.DynamicPage&fq=entiteVar_enUS_indexed_string:defaultLocale">Find the entity defaultLocale in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultLocale(Wrap<Locale> w);

	public Locale getDefaultLocale() {
		return defaultLocale;
	}

	public void setDefaultLocale(Locale defaultLocale) {
		this.defaultLocale = defaultLocale;
	}
	public static Locale staticSetDefaultLocale(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected DynamicPage defaultLocaleInit() {
		Wrap<Locale> defaultLocaleWrap = new Wrap<Locale>().var("defaultLocale");
		if(defaultLocale == null) {
			_defaultLocale(defaultLocaleWrap);
			setDefaultLocale(defaultLocaleWrap.o);
		}
		return (DynamicPage)this;
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepDynamicPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepDynamicPage();
	}

	public Future<Void> promiseDeepDynamicPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseDynamicPage(promise2);
		promise2.future().onSuccess(a -> {
			super.promiseDeepPageLayout(siteRequest_).onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseDynamicPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				pageInit();
				uriInit();
				pageIdInit();
				varsInit();
				filterLabelInit();
				promise2.complete();
			} catch(Exception ex) {
				promise2.fail(ex);
			}
			return promise2.future();
		}).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			htmListPromise().onSuccess(htmList -> {
				promise2.complete();
			}).onFailure(ex -> {
				promise2.fail(ex);
			});
			return promise2.future();
		}).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				htmTitleInit();
				htmMetaInit();
				htmBodyInit();
				pageResponseInit();
				defaultZoneIdInit();
				defaultTimeZoneInit();
				defaultLocaleIdInit();
				defaultLocaleInit();
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
		return promiseDeepDynamicPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestDynamicPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestPageLayout(siteRequest_);
		if(htmList != null)
			htmList.setSiteRequest_(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestDynamicPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainDynamicPage(v);
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
	public Object obtainDynamicPage(String var) {
		DynamicPage oDynamicPage = (DynamicPage)this;
		switch(var) {
			case "page":
				return oDynamicPage.page;
			case "uri":
				return oDynamicPage.uri;
			case "pageId":
				return oDynamicPage.pageId;
			case "vars":
				return oDynamicPage.vars;
			case "filterLabel":
				return oDynamicPage.filterLabel;
			case "htmList":
				return oDynamicPage.htmList;
			case "htmTitle":
				return oDynamicPage.htmTitle;
			case "htmMeta":
				return oDynamicPage.htmMeta;
			case "htmBody":
				return oDynamicPage.htmBody;
			case "pageResponse":
				return oDynamicPage.pageResponse;
			case "defaultZoneId":
				return oDynamicPage.defaultZoneId;
			case "defaultTimeZone":
				return oDynamicPage.defaultTimeZone;
			case "defaultLocaleId":
				return oDynamicPage.defaultLocaleId;
			case "defaultLocale":
				return oDynamicPage.defaultLocale;
			default:
				return super.obtainPageLayout(var);
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
				o = relateDynamicPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateDynamicPage(String var, Object val) {
		DynamicPage oDynamicPage = (DynamicPage)this;
		switch(var) {
			default:
				return super.relatePageLayout(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetDynamicPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetDynamicPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "page":
			return DynamicPage.staticSetPage(siteRequest_, o);
		case "uri":
			return DynamicPage.staticSetUri(siteRequest_, o);
		case "pageId":
			return DynamicPage.staticSetPageId(siteRequest_, o);
		case "filterLabel":
			return DynamicPage.staticSetFilterLabel(siteRequest_, o);
		case "pageResponse":
			return DynamicPage.staticSetPageResponse(siteRequest_, o);
		case "defaultZoneId":
			return DynamicPage.staticSetDefaultZoneId(siteRequest_, o);
		case "defaultLocaleId":
			return DynamicPage.staticSetDefaultLocaleId(siteRequest_, o);
			default:
				return PageLayout.staticSetPageLayout(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchDynamicPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchDynamicPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "page":
			return DynamicPage.staticSearchPage(siteRequest_, (JsonObject)o);
		case "uri":
			return DynamicPage.staticSearchUri(siteRequest_, (String)o);
		case "pageId":
			return DynamicPage.staticSearchPageId(siteRequest_, (String)o);
		case "filterLabel":
			return DynamicPage.staticSearchFilterLabel(siteRequest_, (String)o);
		case "pageResponse":
			return DynamicPage.staticSearchPageResponse(siteRequest_, (String)o);
		case "defaultZoneId":
			return DynamicPage.staticSearchDefaultZoneId(siteRequest_, (String)o);
		case "defaultLocaleId":
			return DynamicPage.staticSearchDefaultLocaleId(siteRequest_, (String)o);
			default:
				return PageLayout.staticSearchPageLayout(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrDynamicPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrDynamicPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "page":
			return DynamicPage.staticSearchStrPage(siteRequest_, (JsonObject)o);
		case "uri":
			return DynamicPage.staticSearchStrUri(siteRequest_, (String)o);
		case "pageId":
			return DynamicPage.staticSearchStrPageId(siteRequest_, (String)o);
		case "filterLabel":
			return DynamicPage.staticSearchStrFilterLabel(siteRequest_, (String)o);
		case "pageResponse":
			return DynamicPage.staticSearchStrPageResponse(siteRequest_, (String)o);
		case "defaultZoneId":
			return DynamicPage.staticSearchStrDefaultZoneId(siteRequest_, (String)o);
		case "defaultLocaleId":
			return DynamicPage.staticSearchStrDefaultLocaleId(siteRequest_, (String)o);
			default:
				return PageLayout.staticSearchStrPageLayout(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqDynamicPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqDynamicPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "page":
			return DynamicPage.staticSearchFqPage(siteRequest_, o);
		case "uri":
			return DynamicPage.staticSearchFqUri(siteRequest_, o);
		case "pageId":
			return DynamicPage.staticSearchFqPageId(siteRequest_, o);
		case "filterLabel":
			return DynamicPage.staticSearchFqFilterLabel(siteRequest_, o);
		case "pageResponse":
			return DynamicPage.staticSearchFqPageResponse(siteRequest_, o);
		case "defaultZoneId":
			return DynamicPage.staticSearchFqDefaultZoneId(siteRequest_, o);
		case "defaultLocaleId":
			return DynamicPage.staticSearchFqDefaultLocaleId(siteRequest_, o);
			default:
				return PageLayout.staticSearchFqPageLayout(entityVar,  siteRequest_, o);
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		return sb.toString();
	}

	public static final String[] DynamicPageVals = new String[] { htmListPromiseComplete1, htmListPromiseFail1, htmListLoopComplete1, htmListLoopFail1 };

	public static final String CLASS_SIMPLE_NAME = "DynamicPage";
	public static final String VAR_page = "page";
	public static final String VAR_uri = "uri";
	public static final String VAR_pageId = "pageId";
	public static final String VAR_vars = "vars";
	public static final String VAR_filterLabel = "filterLabel";
	public static final String VAR_htmList = "htmList";
	public static final String VAR_htmTitle = "htmTitle";
	public static final String VAR_htmMeta = "htmMeta";
	public static final String VAR_htmBody = "htmBody";
	public static final String VAR_pageResponse = "pageResponse";
	public static final String VAR_defaultZoneId = "defaultZoneId";
	public static final String VAR_defaultTimeZone = "defaultTimeZone";
	public static final String VAR_defaultLocaleId = "defaultLocaleId";
	public static final String VAR_defaultLocale = "defaultLocale";

	public static final String DISPLAY_NAME_page = "";
	public static final String DISPLAY_NAME_uri = "";
	public static final String DISPLAY_NAME_pageId = "";
	public static final String DISPLAY_NAME_vars = "";
	public static final String DISPLAY_NAME_filterLabel = "";
	public static final String DISPLAY_NAME_htmList = "";
	public static final String DISPLAY_NAME_htmTitle = "";
	public static final String DISPLAY_NAME_htmMeta = "";
	public static final String DISPLAY_NAME_htmBody = "";
	public static final String DISPLAY_NAME_pageResponse = "";
	public static final String DISPLAY_NAME_defaultZoneId = "";
	public static final String DISPLAY_NAME_defaultTimeZone = "";
	public static final String DISPLAY_NAME_defaultLocaleId = "";
	public static final String DISPLAY_NAME_defaultLocale = "";

	public static String displayNameForClass(String var) {
		return DynamicPage.displayNameDynamicPage(var);
	}
	public static String displayNameDynamicPage(String var) {
		switch(var) {
		case VAR_page:
			return DISPLAY_NAME_page;
		case VAR_uri:
			return DISPLAY_NAME_uri;
		case VAR_pageId:
			return DISPLAY_NAME_pageId;
		case VAR_vars:
			return DISPLAY_NAME_vars;
		case VAR_filterLabel:
			return DISPLAY_NAME_filterLabel;
		case VAR_htmList:
			return DISPLAY_NAME_htmList;
		case VAR_htmTitle:
			return DISPLAY_NAME_htmTitle;
		case VAR_htmMeta:
			return DISPLAY_NAME_htmMeta;
		case VAR_htmBody:
			return DISPLAY_NAME_htmBody;
		case VAR_pageResponse:
			return DISPLAY_NAME_pageResponse;
		case VAR_defaultZoneId:
			return DISPLAY_NAME_defaultZoneId;
		case VAR_defaultTimeZone:
			return DISPLAY_NAME_defaultTimeZone;
		case VAR_defaultLocaleId:
			return DISPLAY_NAME_defaultLocaleId;
		case VAR_defaultLocale:
			return DISPLAY_NAME_defaultLocale;
		default:
			return PageLayout.displayNamePageLayout(var);
		}
	}
}
