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
import org.computate.smartvillageview.enus.result.base.BaseResultPage;
import org.computate.vertx.search.list.SearchList;
import org.computate.smartvillageview.enus.result.map.MapResult;
import io.vertx.core.json.JsonArray;
import java.lang.Integer;
import java.lang.String;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;

/**	
<ol>
0<h3>Suggestions that can generate more code for you: </h3></ol>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these MapResultGenPage objects in a RESTful API. 
 * </li><li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class MapResultGenPageGen into the class MapResultGenPage. 
 * </li>
 * <h3>About the MapResultGenPage class and it's generated class MapResultGenPageGen&lt;BaseResultPage&gt;: </h3>extends MapResultGenPageGen
 * <p>
 * This Java class extends a generated Java class MapResultGenPageGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.map.MapResultGenPage">Find the class MapResultGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends MapResultGenPageGen<BaseResultPage>
 * <p>This <code>class MapResultGenPage extends MapResultGenPageGen&lt;BaseResultPage&gt;</code>, which means it extends a newly generated MapResultGenPageGen. 
 * The generated <code>class MapResultGenPageGen extends BaseResultPage</code> which means that MapResultGenPage extends MapResultGenPageGen which extends BaseResultPage. 
 * This generated inheritance is a powerful feature that allows a lot of boiler plate code to be created for you automatically while still preserving inheritance through the power of Java Generic classes. 
 * </p>
 * Api: true
 * ApiTag.enUS: null
 * ApiUri.enUS: null
 * Color: null
 * IconGroup: null
 * IconName: null
 * Indexed: true
 * {@inheritDoc}
 * <p>By adding a class comment "{@inheritDoc}", the MapResultGenPage class will inherit the helpful inherited class comments from the super class MapResultGenPageGen. 
 * </p>
 * Rows: null
 * Model: true
 * Page: true
 * SuperPage.enUS: null
 * Promise: true
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the MapResultGenPage Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * AName.enUS: null
 * <p>
 * Delete the class MapResultGenPage in Solr: 
 * curl 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.map.MapResultGenPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.result.map in Solr: 
 * curl 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.result.map&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class MapResultGenPageGen<DEV> extends BaseResultPage {
	protected static final Logger LOG = LoggerFactory.getLogger(MapResultGenPage.class);

	//////////////////////////
	// searchListMapResult_ //
	//////////////////////////


	/**	 The entity searchListMapResult_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<MapResult> searchListMapResult_;

	/**	<br> The entity searchListMapResult_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.map.MapResultGenPage&fq=entiteVar_enUS_indexed_string:searchListMapResult_">Find the entity searchListMapResult_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchListMapResult_(Wrap<SearchList<MapResult>> w);

	public SearchList<MapResult> getSearchListMapResult_() {
		return searchListMapResult_;
	}

	public void setSearchListMapResult_(SearchList<MapResult> searchListMapResult_) {
		this.searchListMapResult_ = searchListMapResult_;
	}
	public static SearchList<MapResult> staticSetSearchListMapResult_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected MapResultGenPage searchListMapResult_Init() {
		Wrap<SearchList<MapResult>> searchListMapResult_Wrap = new Wrap<SearchList<MapResult>>().var("searchListMapResult_");
		if(searchListMapResult_ == null) {
			_searchListMapResult_(searchListMapResult_Wrap);
			setSearchListMapResult_(searchListMapResult_Wrap.o);
		}
		return (MapResultGenPage)this;
	}

	///////////////////
	// listMapResult //
	///////////////////


	/**	 The entity listMapResult
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listMapResult = new JsonArray();

	/**	<br> The entity listMapResult
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.map.MapResultGenPage&fq=entiteVar_enUS_indexed_string:listMapResult">Find the entity listMapResult in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _listMapResult(JsonArray l);

	public JsonArray getListMapResult() {
		return listMapResult;
	}

	public void setListMapResult(JsonArray listMapResult) {
		this.listMapResult = listMapResult;
	}
	public static JsonArray staticSetListMapResult(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected MapResultGenPage listMapResultInit() {
		_listMapResult(listMapResult);
		return (MapResultGenPage)this;
	}

	////////////////////
	// mapResultCount //
	////////////////////


	/**	 The entity mapResultCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer mapResultCount;

	/**	<br> The entity mapResultCount
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.map.MapResultGenPage&fq=entiteVar_enUS_indexed_string:mapResultCount">Find the entity mapResultCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _mapResultCount(Wrap<Integer> w);

	public Integer getMapResultCount() {
		return mapResultCount;
	}

	public void setMapResultCount(Integer mapResultCount) {
		this.mapResultCount = mapResultCount;
	}
	@JsonIgnore
	public void setMapResultCount(String o) {
		this.mapResultCount = MapResultGenPage.staticSetMapResultCount(siteRequest_, o);
	}
	public static Integer staticSetMapResultCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected MapResultGenPage mapResultCountInit() {
		Wrap<Integer> mapResultCountWrap = new Wrap<Integer>().var("mapResultCount");
		if(mapResultCount == null) {
			_mapResultCount(mapResultCountWrap);
			setMapResultCount(mapResultCountWrap.o);
		}
		return (MapResultGenPage)this;
	}

	public static Integer staticSearchMapResultCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrMapResultCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqMapResultCount(SiteRequestEnUS siteRequest_, String o) {
		return MapResultGenPage.staticSearchStrMapResultCount(siteRequest_, MapResultGenPage.staticSearchMapResultCount(siteRequest_, MapResultGenPage.staticSetMapResultCount(siteRequest_, o)));
	}

	////////////////
	// mapResult_ //
	////////////////


	/**	 The entity mapResult_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected MapResult mapResult_;

	/**	<br> The entity mapResult_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.map.MapResultGenPage&fq=entiteVar_enUS_indexed_string:mapResult_">Find the entity mapResult_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _mapResult_(Wrap<MapResult> w);

	public MapResult getMapResult_() {
		return mapResult_;
	}

	public void setMapResult_(MapResult mapResult_) {
		this.mapResult_ = mapResult_;
	}
	public static MapResult staticSetMapResult_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected MapResultGenPage mapResult_Init() {
		Wrap<MapResult> mapResult_Wrap = new Wrap<MapResult>().var("mapResult_");
		if(mapResult_ == null) {
			_mapResult_(mapResult_Wrap);
			setMapResult_(mapResult_Wrap.o);
		}
		return (MapResultGenPage)this;
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.map.MapResultGenPage&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = MapResultGenPage.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected MapResultGenPage idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			setId(idWrap.o);
		}
		return (MapResultGenPage)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return MapResultGenPage.staticSearchStrId(siteRequest_, MapResultGenPage.staticSearchId(siteRequest_, MapResultGenPage.staticSetId(siteRequest_, o)));
	}

	//////////////////////
	// pageUriMapResult //
	//////////////////////


	/**	 The entity pageUriMapResult
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUriMapResult;

	/**	<br> The entity pageUriMapResult
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.map.MapResultGenPage&fq=entiteVar_enUS_indexed_string:pageUriMapResult">Find the entity pageUriMapResult in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUriMapResult(Wrap<String> c);

	public String getPageUriMapResult() {
		return pageUriMapResult;
	}
	public void setPageUriMapResult(String o) {
		this.pageUriMapResult = MapResultGenPage.staticSetPageUriMapResult(siteRequest_, o);
	}
	public static String staticSetPageUriMapResult(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected MapResultGenPage pageUriMapResultInit() {
		Wrap<String> pageUriMapResultWrap = new Wrap<String>().var("pageUriMapResult");
		if(pageUriMapResult == null) {
			_pageUriMapResult(pageUriMapResultWrap);
			setPageUriMapResult(pageUriMapResultWrap.o);
		}
		return (MapResultGenPage)this;
	}

	public static String staticSearchPageUriMapResult(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUriMapResult(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUriMapResult(SiteRequestEnUS siteRequest_, String o) {
		return MapResultGenPage.staticSearchStrPageUriMapResult(siteRequest_, MapResultGenPage.staticSearchPageUriMapResult(siteRequest_, MapResultGenPage.staticSetPageUriMapResult(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepMapResultGenPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepMapResultGenPage();
	}

	public Future<Void> promiseDeepMapResultGenPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseMapResultGenPage(promise2);
		promise2.future().onSuccess(a -> {
			super.promiseDeepBaseResultPage(siteRequest_).onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseMapResultGenPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				searchListMapResult_Init();
				listMapResultInit();
				mapResultCountInit();
				mapResult_Init();
				idInit();
				pageUriMapResultInit();
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
		return promiseDeepMapResultGenPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestMapResultGenPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestBaseResultPage(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestMapResultGenPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainMapResultGenPage(v);
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
	public Object obtainMapResultGenPage(String var) {
		MapResultGenPage oMapResultGenPage = (MapResultGenPage)this;
		switch(var) {
			case "searchListMapResult_":
				return oMapResultGenPage.searchListMapResult_;
			case "listMapResult":
				return oMapResultGenPage.listMapResult;
			case "mapResultCount":
				return oMapResultGenPage.mapResultCount;
			case "mapResult_":
				return oMapResultGenPage.mapResult_;
			case "id":
				return oMapResultGenPage.id;
			case "pageUriMapResult":
				return oMapResultGenPage.pageUriMapResult;
			default:
				return super.obtainBaseResultPage(var);
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
				o = relateMapResultGenPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateMapResultGenPage(String var, Object val) {
		MapResultGenPage oMapResultGenPage = (MapResultGenPage)this;
		switch(var) {
			default:
				return super.relateBaseResultPage(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetMapResultGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetMapResultGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "mapResultCount":
			return MapResultGenPage.staticSetMapResultCount(siteRequest_, o);
		case "id":
			return MapResultGenPage.staticSetId(siteRequest_, o);
		case "pageUriMapResult":
			return MapResultGenPage.staticSetPageUriMapResult(siteRequest_, o);
			default:
				return BaseResultPage.staticSetBaseResultPage(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchMapResultGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchMapResultGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "mapResultCount":
			return MapResultGenPage.staticSearchMapResultCount(siteRequest_, (Integer)o);
		case "id":
			return MapResultGenPage.staticSearchId(siteRequest_, (String)o);
		case "pageUriMapResult":
			return MapResultGenPage.staticSearchPageUriMapResult(siteRequest_, (String)o);
			default:
				return BaseResultPage.staticSearchBaseResultPage(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrMapResultGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrMapResultGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "mapResultCount":
			return MapResultGenPage.staticSearchStrMapResultCount(siteRequest_, (Integer)o);
		case "id":
			return MapResultGenPage.staticSearchStrId(siteRequest_, (String)o);
		case "pageUriMapResult":
			return MapResultGenPage.staticSearchStrPageUriMapResult(siteRequest_, (String)o);
			default:
				return BaseResultPage.staticSearchStrBaseResultPage(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqMapResultGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqMapResultGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "mapResultCount":
			return MapResultGenPage.staticSearchFqMapResultCount(siteRequest_, o);
		case "id":
			return MapResultGenPage.staticSearchFqId(siteRequest_, o);
		case "pageUriMapResult":
			return MapResultGenPage.staticSearchFqPageUriMapResult(siteRequest_, o);
			default:
				return BaseResultPage.staticSearchFqBaseResultPage(entityVar,  siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "MapResultGenPage";
	public static final String VAR_searchListMapResult_ = "searchListMapResult_";
	public static final String VAR_listMapResult = "listMapResult";
	public static final String VAR_mapResultCount = "mapResultCount";
	public static final String VAR_mapResult_ = "mapResult_";
	public static final String VAR_id = "id";
	public static final String VAR_pageUriMapResult = "pageUriMapResult";

	public static final String DISPLAY_NAME_searchListMapResult_ = "";
	public static final String DISPLAY_NAME_listMapResult = "";
	public static final String DISPLAY_NAME_mapResultCount = "";
	public static final String DISPLAY_NAME_mapResult_ = "";
	public static final String DISPLAY_NAME_id = "";
	public static final String DISPLAY_NAME_pageUriMapResult = "";

	public static String displayNameForClass(String var) {
		return MapResultGenPage.displayNameMapResultGenPage(var);
	}
	public static String displayNameMapResultGenPage(String var) {
		switch(var) {
		case VAR_searchListMapResult_:
			return DISPLAY_NAME_searchListMapResult_;
		case VAR_listMapResult:
			return DISPLAY_NAME_listMapResult;
		case VAR_mapResultCount:
			return DISPLAY_NAME_mapResultCount;
		case VAR_mapResult_:
			return DISPLAY_NAME_mapResult_;
		case VAR_id:
			return DISPLAY_NAME_id;
		case VAR_pageUriMapResult:
			return DISPLAY_NAME_pageUriMapResult;
		default:
			return BaseResultPage.displayNameBaseResultPage(var);
		}
	}
}
