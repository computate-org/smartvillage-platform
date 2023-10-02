package org.computate.smartvillageview.enus.page;

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
import org.computate.smartvillageview.enus.page.PageLayout;
import org.computate.vertx.search.list.SearchList;
import org.computate.smartvillageview.enus.model.page.SitePage;
import java.lang.String;
import java.time.ZoneId;
import java.util.Locale;
import io.vertx.core.json.JsonArray;
import org.computate.search.response.solr.SolrResponse.Stats;
import org.computate.search.response.solr.SolrResponse.FacetCounts;
import java.lang.Integer;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;

/**	
<ol>
0<h3>Suggestions that can generate more code for you: </h3></ol>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these HomePage objects in a RESTful API. 
 * </li><li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class HomePageGen into the class HomePage. 
 * </li>
 * <h3>About the HomePage class and it's generated class HomePageGen&lt;PageLayout&gt;: </h3>extends HomePageGen
 * <p>
 * This Java class extends a generated Java class HomePageGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.HomePage">Find the class HomePage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends HomePageGen<PageLayout>
 * <p>This <code>class HomePage extends HomePageGen&lt;PageLayout&gt;</code>, which means it extends a newly generated HomePageGen. 
 * The generated <code>class HomePageGen extends PageLayout</code> which means that HomePage extends HomePageGen which extends PageLayout. 
 * This generated inheritance is a powerful feature that allows a lot of boiler plate code to be created for you automatically while still preserving inheritance through the power of Java Generic classes. 
 * </p>
 * <h2>Api: true</h2>
 * <h2>ApiTag.enUS: true</h2>
 * <h2>ApiUri.enUS: null</h2>
 * <h2>Color: null</h2>
 * <h2>IconGroup: null</h2>
 * <h2>IconName: null</h2>
 * <h2>Indexed: true</h2>
 * <h2>{@inheritDoc}</h2>
 * <p>By adding a class comment "{@inheritDoc}", the HomePage class will inherit the helpful inherited class comments from the super class HomePageGen. 
 * </p>
 * <h2>Rows: null</h2>
 * <h2>Model: true</h2>
 * <h2>Page: true</h2>
 * <h2>SuperPage.enUS: null</h2>
 * <h2>Promise: true</h2>
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the HomePage Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * <h2>AName.enUS: null</h2>
 * <p>
 * Delete the class HomePage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.HomePage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.page in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.page&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * Generated: true
 **/
public abstract class HomePageGen<DEV> extends PageLayout {
	protected static final Logger LOG = LoggerFactory.getLogger(HomePage.class);

	////////////////////////
	// searchListSitePage //
	////////////////////////


	/**	 The entity searchListSitePage
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<SitePage> searchListSitePage;

	/**	<br> The entity searchListSitePage
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.HomePage&fq=entiteVar_enUS_indexed_string:searchListSitePage">Find the entity searchListSitePage in Solr</a>
	 * <br>
	 * @param promise is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchListSitePage(Promise<SearchList<SitePage>> promise);

	public SearchList<SitePage> getSearchListSitePage() {
		return searchListSitePage;
	}

	public void setSearchListSitePage(SearchList<SitePage> searchListSitePage) {
		this.searchListSitePage = searchListSitePage;
	}
	public static SearchList<SitePage> staticSetSearchListSitePage(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected Future<SearchList<SitePage>> searchListSitePagePromise() {
		Promise<SearchList<SitePage>> promise = Promise.promise();
		Promise<SearchList<SitePage>> promise2 = Promise.promise();
		_searchListSitePage(promise2);
		promise2.future().onSuccess(o -> {
			if(o != null && searchListSitePage == null) {
				o.promiseDeepForClass(siteRequest_).onSuccess(a -> {
					setSearchListSitePage(o);
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.HomePage&fq=entiteVar_enUS_indexed_string:pageResponse">Find the entity pageResponse in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageResponse(Wrap<String> w);

	public String getPageResponse() {
		return pageResponse;
	}
	public void setPageResponse(String o) {
		this.pageResponse = HomePage.staticSetPageResponse(siteRequest_, o);
	}
	public static String staticSetPageResponse(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected HomePage pageResponseInit() {
		Wrap<String> pageResponseWrap = new Wrap<String>().var("pageResponse");
		if(pageResponse == null) {
			_pageResponse(pageResponseWrap);
			Optional.ofNullable(pageResponseWrap.getO()).ifPresent(o -> {
				setPageResponse(o);
			});
		}
		return (HomePage)this;
	}

	public static String staticSearchPageResponse(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageResponse(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageResponse(SiteRequestEnUS siteRequest_, String o) {
		return HomePage.staticSearchStrPageResponse(siteRequest_, HomePage.staticSearchPageResponse(siteRequest_, HomePage.staticSetPageResponse(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.HomePage&fq=entiteVar_enUS_indexed_string:defaultZoneId">Find the entity defaultZoneId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultZoneId(Wrap<String> w);

	public String getDefaultZoneId() {
		return defaultZoneId;
	}
	public void setDefaultZoneId(String o) {
		this.defaultZoneId = HomePage.staticSetDefaultZoneId(siteRequest_, o);
	}
	public static String staticSetDefaultZoneId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected HomePage defaultZoneIdInit() {
		Wrap<String> defaultZoneIdWrap = new Wrap<String>().var("defaultZoneId");
		if(defaultZoneId == null) {
			_defaultZoneId(defaultZoneIdWrap);
			Optional.ofNullable(defaultZoneIdWrap.getO()).ifPresent(o -> {
				setDefaultZoneId(o);
			});
		}
		return (HomePage)this;
	}

	public static String staticSearchDefaultZoneId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDefaultZoneId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultZoneId(SiteRequestEnUS siteRequest_, String o) {
		return HomePage.staticSearchStrDefaultZoneId(siteRequest_, HomePage.staticSearchDefaultZoneId(siteRequest_, HomePage.staticSetDefaultZoneId(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.HomePage&fq=entiteVar_enUS_indexed_string:defaultTimeZone">Find the entity defaultTimeZone in Solr</a>
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
	protected HomePage defaultTimeZoneInit() {
		Wrap<ZoneId> defaultTimeZoneWrap = new Wrap<ZoneId>().var("defaultTimeZone");
		if(defaultTimeZone == null) {
			_defaultTimeZone(defaultTimeZoneWrap);
			Optional.ofNullable(defaultTimeZoneWrap.getO()).ifPresent(o -> {
				setDefaultTimeZone(o);
			});
		}
		return (HomePage)this;
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.HomePage&fq=entiteVar_enUS_indexed_string:defaultLocaleId">Find the entity defaultLocaleId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultLocaleId(Wrap<String> w);

	public String getDefaultLocaleId() {
		return defaultLocaleId;
	}
	public void setDefaultLocaleId(String o) {
		this.defaultLocaleId = HomePage.staticSetDefaultLocaleId(siteRequest_, o);
	}
	public static String staticSetDefaultLocaleId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected HomePage defaultLocaleIdInit() {
		Wrap<String> defaultLocaleIdWrap = new Wrap<String>().var("defaultLocaleId");
		if(defaultLocaleId == null) {
			_defaultLocaleId(defaultLocaleIdWrap);
			Optional.ofNullable(defaultLocaleIdWrap.getO()).ifPresent(o -> {
				setDefaultLocaleId(o);
			});
		}
		return (HomePage)this;
	}

	public static String staticSearchDefaultLocaleId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDefaultLocaleId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultLocaleId(SiteRequestEnUS siteRequest_, String o) {
		return HomePage.staticSearchStrDefaultLocaleId(siteRequest_, HomePage.staticSearchDefaultLocaleId(siteRequest_, HomePage.staticSetDefaultLocaleId(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.HomePage&fq=entiteVar_enUS_indexed_string:defaultLocale">Find the entity defaultLocale in Solr</a>
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
	protected HomePage defaultLocaleInit() {
		Wrap<Locale> defaultLocaleWrap = new Wrap<Locale>().var("defaultLocale");
		if(defaultLocale == null) {
			_defaultLocale(defaultLocaleWrap);
			Optional.ofNullable(defaultLocaleWrap.getO()).ifPresent(o -> {
				setDefaultLocale(o);
			});
		}
		return (HomePage)this;
	}

	//////////////////////////
	// defaultFieldListVars //
	//////////////////////////


	/**	 The entity defaultFieldListVars
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> defaultFieldListVars = new ArrayList<String>();

	/**	<br> The entity defaultFieldListVars
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.HomePage&fq=entiteVar_enUS_indexed_string:defaultFieldListVars">Find the entity defaultFieldListVars in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _defaultFieldListVars(List<String> l);

	public List<String> getDefaultFieldListVars() {
		return defaultFieldListVars;
	}

	public void setDefaultFieldListVars(List<String> defaultFieldListVars) {
		this.defaultFieldListVars = defaultFieldListVars;
	}
	public void setDefaultFieldListVars(String o) {
		String l = HomePage.staticSetDefaultFieldListVars(siteRequest_, o);
		if(l != null)
			addDefaultFieldListVars(l);
	}
	public static String staticSetDefaultFieldListVars(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public HomePage addDefaultFieldListVars(String...objects) {
		for(String o : objects) {
			addDefaultFieldListVars(o);
		}
		return (HomePage)this;
	}
	public HomePage addDefaultFieldListVars(String o) {
		if(o != null)
			this.defaultFieldListVars.add(o);
		return (HomePage)this;
	}
	@JsonIgnore
	public void setDefaultFieldListVars(JsonArray objects) {
		defaultFieldListVars.clear();
		if(objects == null)
			return;
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addDefaultFieldListVars(o);
		}
	}
	protected HomePage defaultFieldListVarsInit() {
		_defaultFieldListVars(defaultFieldListVars);
		return (HomePage)this;
	}

	public static String staticSearchDefaultFieldListVars(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDefaultFieldListVars(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultFieldListVars(SiteRequestEnUS siteRequest_, String o) {
		return HomePage.staticSearchStrDefaultFieldListVars(siteRequest_, HomePage.staticSearchDefaultFieldListVars(siteRequest_, HomePage.staticSetDefaultFieldListVars(siteRequest_, o)));
	}

	//////////////////////
	// defaultStatsVars //
	//////////////////////


	/**	 The entity defaultStatsVars
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> defaultStatsVars = new ArrayList<String>();

	/**	<br> The entity defaultStatsVars
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.HomePage&fq=entiteVar_enUS_indexed_string:defaultStatsVars">Find the entity defaultStatsVars in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _defaultStatsVars(List<String> l);

	public List<String> getDefaultStatsVars() {
		return defaultStatsVars;
	}

	public void setDefaultStatsVars(List<String> defaultStatsVars) {
		this.defaultStatsVars = defaultStatsVars;
	}
	public void setDefaultStatsVars(String o) {
		String l = HomePage.staticSetDefaultStatsVars(siteRequest_, o);
		if(l != null)
			addDefaultStatsVars(l);
	}
	public static String staticSetDefaultStatsVars(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public HomePage addDefaultStatsVars(String...objects) {
		for(String o : objects) {
			addDefaultStatsVars(o);
		}
		return (HomePage)this;
	}
	public HomePage addDefaultStatsVars(String o) {
		if(o != null)
			this.defaultStatsVars.add(o);
		return (HomePage)this;
	}
	@JsonIgnore
	public void setDefaultStatsVars(JsonArray objects) {
		defaultStatsVars.clear();
		if(objects == null)
			return;
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addDefaultStatsVars(o);
		}
	}
	protected HomePage defaultStatsVarsInit() {
		_defaultStatsVars(defaultStatsVars);
		return (HomePage)this;
	}

	public static String staticSearchDefaultStatsVars(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDefaultStatsVars(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultStatsVars(SiteRequestEnUS siteRequest_, String o) {
		return HomePage.staticSearchStrDefaultStatsVars(siteRequest_, HomePage.staticSearchDefaultStatsVars(siteRequest_, HomePage.staticSetDefaultStatsVars(siteRequest_, o)));
	}

	//////////////////////
	// defaultPivotVars //
	//////////////////////


	/**	 The entity defaultPivotVars
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> defaultPivotVars = new ArrayList<String>();

	/**	<br> The entity defaultPivotVars
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.HomePage&fq=entiteVar_enUS_indexed_string:defaultPivotVars">Find the entity defaultPivotVars in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _defaultPivotVars(List<String> l);

	public List<String> getDefaultPivotVars() {
		return defaultPivotVars;
	}

	public void setDefaultPivotVars(List<String> defaultPivotVars) {
		this.defaultPivotVars = defaultPivotVars;
	}
	public void setDefaultPivotVars(String o) {
		String l = HomePage.staticSetDefaultPivotVars(siteRequest_, o);
		if(l != null)
			addDefaultPivotVars(l);
	}
	public static String staticSetDefaultPivotVars(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public HomePage addDefaultPivotVars(String...objects) {
		for(String o : objects) {
			addDefaultPivotVars(o);
		}
		return (HomePage)this;
	}
	public HomePage addDefaultPivotVars(String o) {
		if(o != null)
			this.defaultPivotVars.add(o);
		return (HomePage)this;
	}
	@JsonIgnore
	public void setDefaultPivotVars(JsonArray objects) {
		defaultPivotVars.clear();
		if(objects == null)
			return;
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addDefaultPivotVars(o);
		}
	}
	protected HomePage defaultPivotVarsInit() {
		_defaultPivotVars(defaultPivotVars);
		return (HomePage)this;
	}

	public static String staticSearchDefaultPivotVars(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDefaultPivotVars(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultPivotVars(SiteRequestEnUS siteRequest_, String o) {
		return HomePage.staticSearchStrDefaultPivotVars(siteRequest_, HomePage.staticSearchDefaultPivotVars(siteRequest_, HomePage.staticSetDefaultPivotVars(siteRequest_, o)));
	}

	//////////////////
	// listSitePage //
	//////////////////


	/**	 The entity listSitePage
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listSitePage = new JsonArray();

	/**	<br> The entity listSitePage
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.HomePage&fq=entiteVar_enUS_indexed_string:listSitePage">Find the entity listSitePage in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _listSitePage(JsonArray l);

	public JsonArray getListSitePage() {
		return listSitePage;
	}

	public void setListSitePage(JsonArray listSitePage) {
		this.listSitePage = listSitePage;
	}
	@JsonIgnore
	public void setListSitePage(String o) {
		this.listSitePage = HomePage.staticSetListSitePage(siteRequest_, o);
	}
	public static JsonArray staticSetListSitePage(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonArray(o);
		}
		return null;
	}
	protected HomePage listSitePageInit() {
		_listSitePage(listSitePage);
		return (HomePage)this;
	}

	public static String staticSearchListSitePage(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o.toString();
	}

	public static String staticSearchStrListSitePage(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqListSitePage(SiteRequestEnUS siteRequest_, String o) {
		return HomePage.staticSearchStrListSitePage(siteRequest_, HomePage.staticSearchListSitePage(siteRequest_, HomePage.staticSetListSitePage(siteRequest_, o)));
	}

	///////////
	// stats //
	///////////


	/**	 The entity stats
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Stats stats;

	/**	<br> The entity stats
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.HomePage&fq=entiteVar_enUS_indexed_string:stats">Find the entity stats in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _stats(Wrap<Stats> w);

	public Stats getStats() {
		return stats;
	}

	public void setStats(Stats stats) {
		this.stats = stats;
	}
	public static Stats staticSetStats(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected HomePage statsInit() {
		Wrap<Stats> statsWrap = new Wrap<Stats>().var("stats");
		if(stats == null) {
			_stats(statsWrap);
			Optional.ofNullable(statsWrap.getO()).ifPresent(o -> {
				setStats(o);
			});
		}
		return (HomePage)this;
	}

	/////////////////
	// facetCounts //
	/////////////////


	/**	 The entity facetCounts
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected FacetCounts facetCounts;

	/**	<br> The entity facetCounts
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.HomePage&fq=entiteVar_enUS_indexed_string:facetCounts">Find the entity facetCounts in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _facetCounts(Wrap<FacetCounts> w);

	public FacetCounts getFacetCounts() {
		return facetCounts;
	}

	public void setFacetCounts(FacetCounts facetCounts) {
		this.facetCounts = facetCounts;
	}
	public static FacetCounts staticSetFacetCounts(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected HomePage facetCountsInit() {
		Wrap<FacetCounts> facetCountsWrap = new Wrap<FacetCounts>().var("facetCounts");
		if(facetCounts == null) {
			_facetCounts(facetCountsWrap);
			Optional.ofNullable(facetCountsWrap.getO()).ifPresent(o -> {
				setFacetCounts(o);
			});
		}
		return (HomePage)this;
	}

	///////////////////
	// sitePageCount //
	///////////////////


	/**	 The entity sitePageCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer sitePageCount;

	/**	<br> The entity sitePageCount
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.HomePage&fq=entiteVar_enUS_indexed_string:sitePageCount">Find the entity sitePageCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _sitePageCount(Wrap<Integer> w);

	public Integer getSitePageCount() {
		return sitePageCount;
	}

	public void setSitePageCount(Integer sitePageCount) {
		this.sitePageCount = sitePageCount;
	}
	@JsonIgnore
	public void setSitePageCount(String o) {
		this.sitePageCount = HomePage.staticSetSitePageCount(siteRequest_, o);
	}
	public static Integer staticSetSitePageCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected HomePage sitePageCountInit() {
		Wrap<Integer> sitePageCountWrap = new Wrap<Integer>().var("sitePageCount");
		if(sitePageCount == null) {
			_sitePageCount(sitePageCountWrap);
			Optional.ofNullable(sitePageCountWrap.getO()).ifPresent(o -> {
				setSitePageCount(o);
			});
		}
		return (HomePage)this;
	}

	public static Integer staticSearchSitePageCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrSitePageCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSitePageCount(SiteRequestEnUS siteRequest_, String o) {
		return HomePage.staticSearchStrSitePageCount(siteRequest_, HomePage.staticSearchSitePageCount(siteRequest_, HomePage.staticSetSitePageCount(siteRequest_, o)));
	}

	///////////////
	// sitePages //
	///////////////


	/**	 The entity sitePages
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<SitePage> sitePages;

	/**	<br> The entity sitePages
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.HomePage&fq=entiteVar_enUS_indexed_string:sitePages">Find the entity sitePages in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _sitePages(Wrap<List<SitePage>> w);

	public List<SitePage> getSitePages() {
		return sitePages;
	}

	public void setSitePages(List<SitePage> sitePages) {
		this.sitePages = sitePages;
	}
	public static SitePage staticSetSitePages(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	public HomePage addSitePages(SitePage...objects) {
		for(SitePage o : objects) {
			addSitePages(o);
		}
		return (HomePage)this;
	}
	public HomePage addSitePages(SitePage o) {
		if(o != null)
			this.sitePages.add(o);
		return (HomePage)this;
	}
	protected HomePage sitePagesInit() {
		Wrap<List<SitePage>> sitePagesWrap = new Wrap<List<SitePage>>().var("sitePages");
		if(sitePages == null) {
			_sitePages(sitePagesWrap);
			Optional.ofNullable(sitePagesWrap.getO()).ifPresent(o -> {
				setSitePages(o);
			});
		}
		return (HomePage)this;
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepHomePage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepHomePage();
	}

	public Future<Void> promiseDeepHomePage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseHomePage(promise2);
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

	public Future<Void> promiseHomePage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				promise2.complete();
			} catch(Exception ex) {
				promise2.fail(ex);
			}
			return promise2.future();
		}).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			searchListSitePagePromise().onSuccess(searchListSitePage -> {
				promise2.complete();
			}).onFailure(ex -> {
				promise2.fail(ex);
			});
			return promise2.future();
		}).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				pageResponseInit();
				defaultZoneIdInit();
				defaultTimeZoneInit();
				defaultLocaleIdInit();
				defaultLocaleInit();
				defaultFieldListVarsInit();
				defaultStatsVarsInit();
				defaultPivotVarsInit();
				listSitePageInit();
				statsInit();
				facetCountsInit();
				sitePageCountInit();
				sitePagesInit();
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
		return promiseDeepHomePage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestHomePage(SiteRequestEnUS siteRequest_) {
			super.siteRequestPageLayout(siteRequest_);
		if(searchListSitePage != null)
			searchListSitePage.setSiteRequest_(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestHomePage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainHomePage(v);
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
	public Object obtainHomePage(String var) {
		HomePage oHomePage = (HomePage)this;
		switch(var) {
			case "searchListSitePage":
				return oHomePage.searchListSitePage;
			case "pageResponse":
				return oHomePage.pageResponse;
			case "defaultZoneId":
				return oHomePage.defaultZoneId;
			case "defaultTimeZone":
				return oHomePage.defaultTimeZone;
			case "defaultLocaleId":
				return oHomePage.defaultLocaleId;
			case "defaultLocale":
				return oHomePage.defaultLocale;
			case "defaultFieldListVars":
				return oHomePage.defaultFieldListVars;
			case "defaultStatsVars":
				return oHomePage.defaultStatsVars;
			case "defaultPivotVars":
				return oHomePage.defaultPivotVars;
			case "listSitePage":
				return oHomePage.listSitePage;
			case "stats":
				return oHomePage.stats;
			case "facetCounts":
				return oHomePage.facetCounts;
			case "sitePageCount":
				return oHomePage.sitePageCount;
			case "sitePages":
				return oHomePage.sitePages;
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
				o = relateHomePage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateHomePage(String var, Object val) {
		HomePage oHomePage = (HomePage)this;
		switch(var) {
			default:
				return super.relatePageLayout(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetHomePage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetHomePage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "pageResponse":
			return HomePage.staticSetPageResponse(siteRequest_, o);
		case "defaultZoneId":
			return HomePage.staticSetDefaultZoneId(siteRequest_, o);
		case "defaultLocaleId":
			return HomePage.staticSetDefaultLocaleId(siteRequest_, o);
		case "defaultFieldListVars":
			return HomePage.staticSetDefaultFieldListVars(siteRequest_, o);
		case "defaultStatsVars":
			return HomePage.staticSetDefaultStatsVars(siteRequest_, o);
		case "defaultPivotVars":
			return HomePage.staticSetDefaultPivotVars(siteRequest_, o);
		case "listSitePage":
			return HomePage.staticSetListSitePage(siteRequest_, o);
		case "sitePageCount":
			return HomePage.staticSetSitePageCount(siteRequest_, o);
			default:
				return PageLayout.staticSetPageLayout(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchHomePage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchHomePage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "pageResponse":
			return HomePage.staticSearchPageResponse(siteRequest_, (String)o);
		case "defaultZoneId":
			return HomePage.staticSearchDefaultZoneId(siteRequest_, (String)o);
		case "defaultLocaleId":
			return HomePage.staticSearchDefaultLocaleId(siteRequest_, (String)o);
		case "defaultFieldListVars":
			return HomePage.staticSearchDefaultFieldListVars(siteRequest_, (String)o);
		case "defaultStatsVars":
			return HomePage.staticSearchDefaultStatsVars(siteRequest_, (String)o);
		case "defaultPivotVars":
			return HomePage.staticSearchDefaultPivotVars(siteRequest_, (String)o);
		case "listSitePage":
			return HomePage.staticSearchListSitePage(siteRequest_, (JsonArray)o);
		case "sitePageCount":
			return HomePage.staticSearchSitePageCount(siteRequest_, (Integer)o);
			default:
				return PageLayout.staticSearchPageLayout(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrHomePage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrHomePage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "pageResponse":
			return HomePage.staticSearchStrPageResponse(siteRequest_, (String)o);
		case "defaultZoneId":
			return HomePage.staticSearchStrDefaultZoneId(siteRequest_, (String)o);
		case "defaultLocaleId":
			return HomePage.staticSearchStrDefaultLocaleId(siteRequest_, (String)o);
		case "defaultFieldListVars":
			return HomePage.staticSearchStrDefaultFieldListVars(siteRequest_, (String)o);
		case "defaultStatsVars":
			return HomePage.staticSearchStrDefaultStatsVars(siteRequest_, (String)o);
		case "defaultPivotVars":
			return HomePage.staticSearchStrDefaultPivotVars(siteRequest_, (String)o);
		case "listSitePage":
			return HomePage.staticSearchStrListSitePage(siteRequest_, (String)o);
		case "sitePageCount":
			return HomePage.staticSearchStrSitePageCount(siteRequest_, (Integer)o);
			default:
				return PageLayout.staticSearchStrPageLayout(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqHomePage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqHomePage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "pageResponse":
			return HomePage.staticSearchFqPageResponse(siteRequest_, o);
		case "defaultZoneId":
			return HomePage.staticSearchFqDefaultZoneId(siteRequest_, o);
		case "defaultLocaleId":
			return HomePage.staticSearchFqDefaultLocaleId(siteRequest_, o);
		case "defaultFieldListVars":
			return HomePage.staticSearchFqDefaultFieldListVars(siteRequest_, o);
		case "defaultStatsVars":
			return HomePage.staticSearchFqDefaultStatsVars(siteRequest_, o);
		case "defaultPivotVars":
			return HomePage.staticSearchFqDefaultPivotVars(siteRequest_, o);
		case "listSitePage":
			return HomePage.staticSearchFqListSitePage(siteRequest_, o);
		case "sitePageCount":
			return HomePage.staticSearchFqSitePageCount(siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "HomePage";
	public static final String VAR_searchListSitePage = "searchListSitePage";
	public static final String VAR_pageResponse = "pageResponse";
	public static final String VAR_defaultZoneId = "defaultZoneId";
	public static final String VAR_defaultTimeZone = "defaultTimeZone";
	public static final String VAR_defaultLocaleId = "defaultLocaleId";
	public static final String VAR_defaultLocale = "defaultLocale";
	public static final String VAR_defaultFieldListVars = "defaultFieldListVars";
	public static final String VAR_defaultStatsVars = "defaultStatsVars";
	public static final String VAR_defaultPivotVars = "defaultPivotVars";
	public static final String VAR_listSitePage = "listSitePage";
	public static final String VAR_stats = "stats";
	public static final String VAR_facetCounts = "facetCounts";
	public static final String VAR_sitePageCount = "sitePageCount";
	public static final String VAR_sitePages = "sitePages";

	public static final String DISPLAY_NAME_searchListSitePage = "";
	public static final String DISPLAY_NAME_pageResponse = "";
	public static final String DISPLAY_NAME_defaultZoneId = "";
	public static final String DISPLAY_NAME_defaultTimeZone = "";
	public static final String DISPLAY_NAME_defaultLocaleId = "";
	public static final String DISPLAY_NAME_defaultLocale = "";
	public static final String DISPLAY_NAME_defaultFieldListVars = "";
	public static final String DISPLAY_NAME_defaultStatsVars = "";
	public static final String DISPLAY_NAME_defaultPivotVars = "";
	public static final String DISPLAY_NAME_listSitePage = "";
	public static final String DISPLAY_NAME_stats = "";
	public static final String DISPLAY_NAME_facetCounts = "";
	public static final String DISPLAY_NAME_sitePageCount = "";
	public static final String DISPLAY_NAME_sitePages = "";

	public static String displayNameForClass(String var) {
		return HomePage.displayNameHomePage(var);
	}
	public static String displayNameHomePage(String var) {
		switch(var) {
		case VAR_searchListSitePage:
			return DISPLAY_NAME_searchListSitePage;
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
		case VAR_defaultFieldListVars:
			return DISPLAY_NAME_defaultFieldListVars;
		case VAR_defaultStatsVars:
			return DISPLAY_NAME_defaultStatsVars;
		case VAR_defaultPivotVars:
			return DISPLAY_NAME_defaultPivotVars;
		case VAR_listSitePage:
			return DISPLAY_NAME_listSitePage;
		case VAR_stats:
			return DISPLAY_NAME_stats;
		case VAR_facetCounts:
			return DISPLAY_NAME_facetCounts;
		case VAR_sitePageCount:
			return DISPLAY_NAME_sitePageCount;
		case VAR_sitePages:
			return DISPLAY_NAME_sitePages;
		default:
			return PageLayout.displayNamePageLayout(var);
		}
	}
}
