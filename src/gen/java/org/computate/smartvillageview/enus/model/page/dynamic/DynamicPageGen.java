package org.computate.smartvillageview.enus.model.page.dynamic;

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
import org.computate.vertx.search.list.SearchList;
import org.computate.smartvillageview.enus.model.html.SiteHtml;
import java.lang.String;
import java.time.ZoneId;
import java.util.Locale;
import io.vertx.core.json.JsonArray;
import java.lang.Integer;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;

/**	
 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.dynamic.DynamicPage">Find the class DynamicPage in Solr. </a>
 * <br><br>Delete the class DynamicPage in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.dynamic.DynamicPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>Delete  the package org.computate.smartvillageview.enus.model.page.dynamic in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.dynamic&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>Delete  the project smart-village-view in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smart\-village\-view&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>
 **/
public abstract class DynamicPageGen<DEV> extends PageLayout {
	protected static final Logger LOG = LoggerFactory.getLogger(DynamicPage.class);

	/////////////////////////
	// searchListSiteHtml_ //
	/////////////////////////

	/**	 The entity searchListSiteHtml_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<SiteHtml> searchListSiteHtml_;

	/**	<br> The entity searchListSiteHtml_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.dynamic.DynamicPage&fq=entiteVar_enUS_indexed_string:searchListSiteHtml_">Find the entity searchListSiteHtml_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchListSiteHtml_(Wrap<SearchList<SiteHtml>> w);

	public SearchList<SiteHtml> getSearchListSiteHtml_() {
		return searchListSiteHtml_;
	}

	public void setSearchListSiteHtml_(SearchList<SiteHtml> searchListSiteHtml_) {
		this.searchListSiteHtml_ = searchListSiteHtml_;
	}
	public static SearchList<SiteHtml> staticSetSearchListSiteHtml_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected DynamicPage searchListSiteHtml_Init() {
		Wrap<SearchList<SiteHtml>> searchListSiteHtml_Wrap = new Wrap<SearchList<SiteHtml>>().var("searchListSiteHtml_");
		if(searchListSiteHtml_ == null) {
			_searchListSiteHtml_(searchListSiteHtml_Wrap);
			setSearchListSiteHtml_(searchListSiteHtml_Wrap.o);
		}
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.dynamic.DynamicPage&fq=entiteVar_enUS_indexed_string:pageResponse">Find the entity pageResponse in Solr</a>
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.dynamic.DynamicPage&fq=entiteVar_enUS_indexed_string:defaultZoneId">Find the entity defaultZoneId in Solr</a>
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.dynamic.DynamicPage&fq=entiteVar_enUS_indexed_string:defaultTimeZone">Find the entity defaultTimeZone in Solr</a>
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.dynamic.DynamicPage&fq=entiteVar_enUS_indexed_string:defaultLocaleId">Find the entity defaultLocaleId in Solr</a>
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.dynamic.DynamicPage&fq=entiteVar_enUS_indexed_string:defaultLocale">Find the entity defaultLocale in Solr</a>
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

	//////////////////
	// listSiteHtml //
	//////////////////

	/**	 The entity listSiteHtml
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listSiteHtml = new JsonArray();

	/**	<br> The entity listSiteHtml
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.dynamic.DynamicPage&fq=entiteVar_enUS_indexed_string:listSiteHtml">Find the entity listSiteHtml in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _listSiteHtml(JsonArray l);

	public JsonArray getListSiteHtml() {
		return listSiteHtml;
	}

	public void setListSiteHtml(JsonArray listSiteHtml) {
		this.listSiteHtml = listSiteHtml;
	}
	public static JsonArray staticSetListSiteHtml(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected DynamicPage listSiteHtmlInit() {
		_listSiteHtml(listSiteHtml);
		return (DynamicPage)this;
	}

	///////////////////
	// SiteHtmlCount //
	///////////////////

	/**	 The entity SiteHtmlCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer SiteHtmlCount;

	/**	<br> The entity SiteHtmlCount
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.dynamic.DynamicPage&fq=entiteVar_enUS_indexed_string:SiteHtmlCount">Find the entity SiteHtmlCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _SiteHtmlCount(Wrap<Integer> w);

	public Integer getSiteHtmlCount() {
		return SiteHtmlCount;
	}

	public void setSiteHtmlCount(Integer SiteHtmlCount) {
		this.SiteHtmlCount = SiteHtmlCount;
	}
	@JsonIgnore
	public void setSiteHtmlCount(String o) {
		this.SiteHtmlCount = DynamicPage.staticSetSiteHtmlCount(siteRequest_, o);
	}
	public static Integer staticSetSiteHtmlCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected DynamicPage SiteHtmlCountInit() {
		Wrap<Integer> SiteHtmlCountWrap = new Wrap<Integer>().var("SiteHtmlCount");
		if(SiteHtmlCount == null) {
			_SiteHtmlCount(SiteHtmlCountWrap);
			setSiteHtmlCount(SiteHtmlCountWrap.o);
		}
		return (DynamicPage)this;
	}

	public static Integer staticSearchSiteHtmlCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrSiteHtmlCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSiteHtmlCount(SiteRequestEnUS siteRequest_, String o) {
		return DynamicPage.staticSearchStrSiteHtmlCount(siteRequest_, DynamicPage.staticSearchSiteHtmlCount(siteRequest_, DynamicPage.staticSetSiteHtmlCount(siteRequest_, o)));
	}

	///////////////
	// SiteHtml_ //
	///////////////

	/**	 The entity SiteHtml_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected SiteHtml SiteHtml_;

	/**	<br> The entity SiteHtml_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.dynamic.DynamicPage&fq=entiteVar_enUS_indexed_string:SiteHtml_">Find the entity SiteHtml_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _SiteHtml_(Wrap<SiteHtml> w);

	public SiteHtml getSiteHtml_() {
		return SiteHtml_;
	}

	public void setSiteHtml_(SiteHtml SiteHtml_) {
		this.SiteHtml_ = SiteHtml_;
	}
	public static SiteHtml staticSetSiteHtml_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected DynamicPage SiteHtml_Init() {
		Wrap<SiteHtml> SiteHtml_Wrap = new Wrap<SiteHtml>().var("SiteHtml_");
		if(SiteHtml_ == null) {
			_SiteHtml_(SiteHtml_Wrap);
			setSiteHtml_(SiteHtml_Wrap.o);
		}
		return (DynamicPage)this;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.page.dynamic.DynamicPage&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = DynamicPage.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected DynamicPage idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			setId(idWrap.o);
		}
		return (DynamicPage)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return DynamicPage.staticSearchStrId(siteRequest_, DynamicPage.staticSearchId(siteRequest_, DynamicPage.staticSetId(siteRequest_, o)));
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
				searchListSiteHtml_Init();
				pageResponseInit();
				defaultZoneIdInit();
				defaultTimeZoneInit();
				defaultLocaleIdInit();
				defaultLocaleInit();
				listSiteHtmlInit();
				SiteHtmlCountInit();
				SiteHtml_Init();
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

	@Override public Future<Void> promiseDeepForClass(SiteRequestEnUS siteRequest_) {
		return promiseDeepDynamicPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestDynamicPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestPageLayout(siteRequest_);
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
			case "searchListSiteHtml_":
				return oDynamicPage.searchListSiteHtml_;
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
			case "listSiteHtml":
				return oDynamicPage.listSiteHtml;
			case "SiteHtmlCount":
				return oDynamicPage.SiteHtmlCount;
			case "SiteHtml_":
				return oDynamicPage.SiteHtml_;
			case "id":
				return oDynamicPage.id;
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
		case "pageResponse":
			return DynamicPage.staticSetPageResponse(siteRequest_, o);
		case "defaultZoneId":
			return DynamicPage.staticSetDefaultZoneId(siteRequest_, o);
		case "defaultLocaleId":
			return DynamicPage.staticSetDefaultLocaleId(siteRequest_, o);
		case "SiteHtmlCount":
			return DynamicPage.staticSetSiteHtmlCount(siteRequest_, o);
		case "id":
			return DynamicPage.staticSetId(siteRequest_, o);
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
		case "pageResponse":
			return DynamicPage.staticSearchPageResponse(siteRequest_, (String)o);
		case "defaultZoneId":
			return DynamicPage.staticSearchDefaultZoneId(siteRequest_, (String)o);
		case "defaultLocaleId":
			return DynamicPage.staticSearchDefaultLocaleId(siteRequest_, (String)o);
		case "SiteHtmlCount":
			return DynamicPage.staticSearchSiteHtmlCount(siteRequest_, (Integer)o);
		case "id":
			return DynamicPage.staticSearchId(siteRequest_, (String)o);
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
		case "pageResponse":
			return DynamicPage.staticSearchStrPageResponse(siteRequest_, (String)o);
		case "defaultZoneId":
			return DynamicPage.staticSearchStrDefaultZoneId(siteRequest_, (String)o);
		case "defaultLocaleId":
			return DynamicPage.staticSearchStrDefaultLocaleId(siteRequest_, (String)o);
		case "SiteHtmlCount":
			return DynamicPage.staticSearchStrSiteHtmlCount(siteRequest_, (Integer)o);
		case "id":
			return DynamicPage.staticSearchStrId(siteRequest_, (String)o);
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
		case "pageResponse":
			return DynamicPage.staticSearchFqPageResponse(siteRequest_, o);
		case "defaultZoneId":
			return DynamicPage.staticSearchFqDefaultZoneId(siteRequest_, o);
		case "defaultLocaleId":
			return DynamicPage.staticSearchFqDefaultLocaleId(siteRequest_, o);
		case "SiteHtmlCount":
			return DynamicPage.staticSearchFqSiteHtmlCount(siteRequest_, o);
		case "id":
			return DynamicPage.staticSearchFqId(siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "DynamicPage";
	public static final String VAR_searchListSiteHtml_ = "searchListSiteHtml_";
	public static final String VAR_pageResponse = "pageResponse";
	public static final String VAR_defaultZoneId = "defaultZoneId";
	public static final String VAR_defaultTimeZone = "defaultTimeZone";
	public static final String VAR_defaultLocaleId = "defaultLocaleId";
	public static final String VAR_defaultLocale = "defaultLocale";
	public static final String VAR_listSiteHtml = "listSiteHtml";
	public static final String VAR_SiteHtmlCount = "SiteHtmlCount";
	public static final String VAR_SiteHtml_ = "SiteHtml_";
	public static final String VAR_id = "id";

	public static final String DISPLAY_NAME_searchListSiteHtml_ = "";
	public static final String DISPLAY_NAME_pageResponse = "";
	public static final String DISPLAY_NAME_defaultZoneId = "";
	public static final String DISPLAY_NAME_defaultTimeZone = "";
	public static final String DISPLAY_NAME_defaultLocaleId = "";
	public static final String DISPLAY_NAME_defaultLocale = "";
	public static final String DISPLAY_NAME_listSiteHtml = "";
	public static final String DISPLAY_NAME_SiteHtmlCount = "";
	public static final String DISPLAY_NAME_SiteHtml_ = "";
	public static final String DISPLAY_NAME_id = "";

	public static String displayNameForClass(String var) {
		return DynamicPage.displayNameDynamicPage(var);
	}
	public static String displayNameDynamicPage(String var) {
		switch(var) {
		case VAR_searchListSiteHtml_:
			return DISPLAY_NAME_searchListSiteHtml_;
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
		case VAR_listSiteHtml:
			return DISPLAY_NAME_listSiteHtml;
		case VAR_SiteHtmlCount:
			return DISPLAY_NAME_SiteHtmlCount;
		case VAR_SiteHtml_:
			return DISPLAY_NAME_SiteHtml_;
		case VAR_id:
			return DISPLAY_NAME_id;
		default:
			return PageLayout.displayNamePageLayout(var);
		}
	}
}
