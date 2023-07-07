package org.computate.smartvillageview.enus.model.traffic.light;

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
import org.computate.smartvillageview.enus.result.map.MapResultPage;
import org.computate.vertx.search.list.SearchList;
import org.computate.smartvillageview.enus.model.traffic.light.TrafficLight;
import io.vertx.core.json.JsonArray;
import java.lang.Integer;
import java.lang.String;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;

/**	
<ol>
0<h3>Suggestions that can generate more code for you: </h3></ol>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these TrafficLightGenPage objects in a RESTful API. 
 * </li><li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class TrafficLightGenPageGen into the class TrafficLightGenPage. 
 * </li>
 * <h3>About the TrafficLightGenPage class and it's generated class TrafficLightGenPageGen&lt;MapResultPage&gt;: </h3>extends TrafficLightGenPageGen
 * <p>
 * This Java class extends a generated Java class TrafficLightGenPageGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLightGenPage">Find the class TrafficLightGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends TrafficLightGenPageGen<MapResultPage>
 * <p>This <code>class TrafficLightGenPage extends TrafficLightGenPageGen&lt;MapResultPage&gt;</code>, which means it extends a newly generated TrafficLightGenPageGen. 
 * The generated <code>class TrafficLightGenPageGen extends MapResultPage</code> which means that TrafficLightGenPage extends TrafficLightGenPageGen which extends MapResultPage. 
 * This generated inheritance is a powerful feature that allows a lot of boiler plate code to be created for you automatically while still preserving inheritance through the power of Java Generic classes. 
 * </p>
 * Api: true
 * ApiTag.enUS: true
 * ApiUri.enUS: null
 * Color: null
 * IconGroup: null
 * IconName: null
 * Indexed: true
 * {@inheritDoc}
 * <p>By adding a class comment "{@inheritDoc}", the TrafficLightGenPage class will inherit the helpful inherited class comments from the super class TrafficLightGenPageGen. 
 * </p>
 * Rows: null
 * Model: true
 * Page: true
 * SuperPage.enUS: null
 * Promise: true
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the TrafficLightGenPage Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * Delete the class TrafficLightGenPage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLightGenPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.traffic.light in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class TrafficLightGenPageGen<DEV> extends MapResultPage {
	protected static final Logger LOG = LoggerFactory.getLogger(TrafficLightGenPage.class);

	/////////////////////////////
	// searchListTrafficLight_ //
	/////////////////////////////


	/**	 The entity searchListTrafficLight_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<TrafficLight> searchListTrafficLight_;

	/**	<br> The entity searchListTrafficLight_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLightGenPage&fq=entiteVar_enUS_indexed_string:searchListTrafficLight_">Find the entity searchListTrafficLight_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchListTrafficLight_(Wrap<SearchList<TrafficLight>> w);

	public SearchList<TrafficLight> getSearchListTrafficLight_() {
		return searchListTrafficLight_;
	}

	public void setSearchListTrafficLight_(SearchList<TrafficLight> searchListTrafficLight_) {
		this.searchListTrafficLight_ = searchListTrafficLight_;
	}
	public static SearchList<TrafficLight> staticSetSearchListTrafficLight_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected TrafficLightGenPage searchListTrafficLight_Init() {
		Wrap<SearchList<TrafficLight>> searchListTrafficLight_Wrap = new Wrap<SearchList<TrafficLight>>().var("searchListTrafficLight_");
		if(searchListTrafficLight_ == null) {
			_searchListTrafficLight_(searchListTrafficLight_Wrap);
			Optional.ofNullable(searchListTrafficLight_Wrap.getO()).ifPresent(o -> {
				setSearchListTrafficLight_(o);
			});
		}
		return (TrafficLightGenPage)this;
	}

	//////////////////////
	// listTrafficLight //
	//////////////////////


	/**	 The entity listTrafficLight
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listTrafficLight = new JsonArray();

	/**	<br> The entity listTrafficLight
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLightGenPage&fq=entiteVar_enUS_indexed_string:listTrafficLight">Find the entity listTrafficLight in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _listTrafficLight(JsonArray l);

	public JsonArray getListTrafficLight() {
		return listTrafficLight;
	}

	public void setListTrafficLight(JsonArray listTrafficLight) {
		this.listTrafficLight = listTrafficLight;
	}
	@JsonIgnore
	public void setListTrafficLight(String o) {
		this.listTrafficLight = TrafficLightGenPage.staticSetListTrafficLight(siteRequest_, o);
	}
	public static JsonArray staticSetListTrafficLight(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonArray(o);
		}
		return null;
	}
	protected TrafficLightGenPage listTrafficLightInit() {
		_listTrafficLight(listTrafficLight);
		return (TrafficLightGenPage)this;
	}

	public static String staticSearchListTrafficLight(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o.toString();
	}

	public static String staticSearchStrListTrafficLight(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqListTrafficLight(SiteRequestEnUS siteRequest_, String o) {
		return TrafficLightGenPage.staticSearchStrListTrafficLight(siteRequest_, TrafficLightGenPage.staticSearchListTrafficLight(siteRequest_, TrafficLightGenPage.staticSetListTrafficLight(siteRequest_, o)));
	}

	///////////////////////
	// trafficLightCount //
	///////////////////////


	/**	 The entity trafficLightCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer trafficLightCount;

	/**	<br> The entity trafficLightCount
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLightGenPage&fq=entiteVar_enUS_indexed_string:trafficLightCount">Find the entity trafficLightCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _trafficLightCount(Wrap<Integer> w);

	public Integer getTrafficLightCount() {
		return trafficLightCount;
	}

	public void setTrafficLightCount(Integer trafficLightCount) {
		this.trafficLightCount = trafficLightCount;
	}
	@JsonIgnore
	public void setTrafficLightCount(String o) {
		this.trafficLightCount = TrafficLightGenPage.staticSetTrafficLightCount(siteRequest_, o);
	}
	public static Integer staticSetTrafficLightCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected TrafficLightGenPage trafficLightCountInit() {
		Wrap<Integer> trafficLightCountWrap = new Wrap<Integer>().var("trafficLightCount");
		if(trafficLightCount == null) {
			_trafficLightCount(trafficLightCountWrap);
			Optional.ofNullable(trafficLightCountWrap.getO()).ifPresent(o -> {
				setTrafficLightCount(o);
			});
		}
		return (TrafficLightGenPage)this;
	}

	public static Integer staticSearchTrafficLightCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrTrafficLightCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqTrafficLightCount(SiteRequestEnUS siteRequest_, String o) {
		return TrafficLightGenPage.staticSearchStrTrafficLightCount(siteRequest_, TrafficLightGenPage.staticSearchTrafficLightCount(siteRequest_, TrafficLightGenPage.staticSetTrafficLightCount(siteRequest_, o)));
	}

	///////////////////
	// trafficLight_ //
	///////////////////


	/**	 The entity trafficLight_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected TrafficLight trafficLight_;

	/**	<br> The entity trafficLight_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLightGenPage&fq=entiteVar_enUS_indexed_string:trafficLight_">Find the entity trafficLight_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _trafficLight_(Wrap<TrafficLight> w);

	public TrafficLight getTrafficLight_() {
		return trafficLight_;
	}

	public void setTrafficLight_(TrafficLight trafficLight_) {
		this.trafficLight_ = trafficLight_;
	}
	public static TrafficLight staticSetTrafficLight_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected TrafficLightGenPage trafficLight_Init() {
		Wrap<TrafficLight> trafficLight_Wrap = new Wrap<TrafficLight>().var("trafficLight_");
		if(trafficLight_ == null) {
			_trafficLight_(trafficLight_Wrap);
			Optional.ofNullable(trafficLight_Wrap.getO()).ifPresent(o -> {
				setTrafficLight_(o);
			});
		}
		return (TrafficLightGenPage)this;
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLightGenPage&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = TrafficLightGenPage.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficLightGenPage idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			Optional.ofNullable(idWrap.getO()).ifPresent(o -> {
				setId(o);
			});
		}
		return (TrafficLightGenPage)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return TrafficLightGenPage.staticSearchStrId(siteRequest_, TrafficLightGenPage.staticSearchId(siteRequest_, TrafficLightGenPage.staticSetId(siteRequest_, o)));
	}

	/////////////////////////
	// pageUriTrafficLight //
	/////////////////////////


	/**	 The entity pageUriTrafficLight
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUriTrafficLight;

	/**	<br> The entity pageUriTrafficLight
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLightGenPage&fq=entiteVar_enUS_indexed_string:pageUriTrafficLight">Find the entity pageUriTrafficLight in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUriTrafficLight(Wrap<String> c);

	public String getPageUriTrafficLight() {
		return pageUriTrafficLight;
	}
	public void setPageUriTrafficLight(String o) {
		this.pageUriTrafficLight = TrafficLightGenPage.staticSetPageUriTrafficLight(siteRequest_, o);
	}
	public static String staticSetPageUriTrafficLight(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficLightGenPage pageUriTrafficLightInit() {
		Wrap<String> pageUriTrafficLightWrap = new Wrap<String>().var("pageUriTrafficLight");
		if(pageUriTrafficLight == null) {
			_pageUriTrafficLight(pageUriTrafficLightWrap);
			Optional.ofNullable(pageUriTrafficLightWrap.getO()).ifPresent(o -> {
				setPageUriTrafficLight(o);
			});
		}
		return (TrafficLightGenPage)this;
	}

	public static String staticSearchPageUriTrafficLight(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUriTrafficLight(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUriTrafficLight(SiteRequestEnUS siteRequest_, String o) {
		return TrafficLightGenPage.staticSearchStrPageUriTrafficLight(siteRequest_, TrafficLightGenPage.staticSearchPageUriTrafficLight(siteRequest_, TrafficLightGenPage.staticSetPageUriTrafficLight(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepTrafficLightGenPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepTrafficLightGenPage();
	}

	public Future<Void> promiseDeepTrafficLightGenPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseTrafficLightGenPage(promise2);
		promise2.future().onSuccess(a -> {
			super.promiseDeepMapResultPage(siteRequest_).onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseTrafficLightGenPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				searchListTrafficLight_Init();
				listTrafficLightInit();
				trafficLightCountInit();
				trafficLight_Init();
				idInit();
				pageUriTrafficLightInit();
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
		return promiseDeepTrafficLightGenPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestTrafficLightGenPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestMapResultPage(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestTrafficLightGenPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainTrafficLightGenPage(v);
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
	public Object obtainTrafficLightGenPage(String var) {
		TrafficLightGenPage oTrafficLightGenPage = (TrafficLightGenPage)this;
		switch(var) {
			case "searchListTrafficLight_":
				return oTrafficLightGenPage.searchListTrafficLight_;
			case "listTrafficLight":
				return oTrafficLightGenPage.listTrafficLight;
			case "trafficLightCount":
				return oTrafficLightGenPage.trafficLightCount;
			case "trafficLight_":
				return oTrafficLightGenPage.trafficLight_;
			case "id":
				return oTrafficLightGenPage.id;
			case "pageUriTrafficLight":
				return oTrafficLightGenPage.pageUriTrafficLight;
			default:
				return super.obtainMapResultPage(var);
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
				o = relateTrafficLightGenPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateTrafficLightGenPage(String var, Object val) {
		TrafficLightGenPage oTrafficLightGenPage = (TrafficLightGenPage)this;
		switch(var) {
			default:
				return super.relateMapResultPage(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetTrafficLightGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetTrafficLightGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listTrafficLight":
			return TrafficLightGenPage.staticSetListTrafficLight(siteRequest_, o);
		case "trafficLightCount":
			return TrafficLightGenPage.staticSetTrafficLightCount(siteRequest_, o);
		case "id":
			return TrafficLightGenPage.staticSetId(siteRequest_, o);
		case "pageUriTrafficLight":
			return TrafficLightGenPage.staticSetPageUriTrafficLight(siteRequest_, o);
			default:
				return MapResultPage.staticSetMapResultPage(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchTrafficLightGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchTrafficLightGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listTrafficLight":
			return TrafficLightGenPage.staticSearchListTrafficLight(siteRequest_, (JsonArray)o);
		case "trafficLightCount":
			return TrafficLightGenPage.staticSearchTrafficLightCount(siteRequest_, (Integer)o);
		case "id":
			return TrafficLightGenPage.staticSearchId(siteRequest_, (String)o);
		case "pageUriTrafficLight":
			return TrafficLightGenPage.staticSearchPageUriTrafficLight(siteRequest_, (String)o);
			default:
				return MapResultPage.staticSearchMapResultPage(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrTrafficLightGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrTrafficLightGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listTrafficLight":
			return TrafficLightGenPage.staticSearchStrListTrafficLight(siteRequest_, (String)o);
		case "trafficLightCount":
			return TrafficLightGenPage.staticSearchStrTrafficLightCount(siteRequest_, (Integer)o);
		case "id":
			return TrafficLightGenPage.staticSearchStrId(siteRequest_, (String)o);
		case "pageUriTrafficLight":
			return TrafficLightGenPage.staticSearchStrPageUriTrafficLight(siteRequest_, (String)o);
			default:
				return MapResultPage.staticSearchStrMapResultPage(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqTrafficLightGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqTrafficLightGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listTrafficLight":
			return TrafficLightGenPage.staticSearchFqListTrafficLight(siteRequest_, o);
		case "trafficLightCount":
			return TrafficLightGenPage.staticSearchFqTrafficLightCount(siteRequest_, o);
		case "id":
			return TrafficLightGenPage.staticSearchFqId(siteRequest_, o);
		case "pageUriTrafficLight":
			return TrafficLightGenPage.staticSearchFqPageUriTrafficLight(siteRequest_, o);
			default:
				return MapResultPage.staticSearchFqMapResultPage(entityVar,  siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "TrafficLightGenPage";
	public static final String VAR_searchListTrafficLight_ = "searchListTrafficLight_";
	public static final String VAR_listTrafficLight = "listTrafficLight";
	public static final String VAR_trafficLightCount = "trafficLightCount";
	public static final String VAR_trafficLight_ = "trafficLight_";
	public static final String VAR_id = "id";
	public static final String VAR_pageUriTrafficLight = "pageUriTrafficLight";

	public static final String DISPLAY_NAME_searchListTrafficLight_ = "";
	public static final String DISPLAY_NAME_listTrafficLight = "";
	public static final String DISPLAY_NAME_trafficLightCount = "";
	public static final String DISPLAY_NAME_trafficLight_ = "";
	public static final String DISPLAY_NAME_id = "";
	public static final String DISPLAY_NAME_pageUriTrafficLight = "";

	public static String displayNameForClass(String var) {
		return TrafficLightGenPage.displayNameTrafficLightGenPage(var);
	}
	public static String displayNameTrafficLightGenPage(String var) {
		switch(var) {
		case VAR_searchListTrafficLight_:
			return DISPLAY_NAME_searchListTrafficLight_;
		case VAR_listTrafficLight:
			return DISPLAY_NAME_listTrafficLight;
		case VAR_trafficLightCount:
			return DISPLAY_NAME_trafficLightCount;
		case VAR_trafficLight_:
			return DISPLAY_NAME_trafficLight_;
		case VAR_id:
			return DISPLAY_NAME_id;
		case VAR_pageUriTrafficLight:
			return DISPLAY_NAME_pageUriTrafficLight;
		default:
			return MapResultPage.displayNameMapResultPage(var);
		}
	}
}
