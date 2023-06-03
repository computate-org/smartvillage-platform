package org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight;

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
import org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight;
import io.vertx.core.json.JsonArray;
import java.lang.Integer;
import java.lang.String;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;

/**	
<ol>
0<h3>Suggestions that can generate more code for you: </h3></ol>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these SmartTrafficLightGenPage objects in a RESTful API. 
 * </li><li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class SmartTrafficLightGenPageGen into the class SmartTrafficLightGenPage. 
 * </li>
 * <h3>About the SmartTrafficLightGenPage class and it's generated class SmartTrafficLightGenPageGen&lt;MapResultPage&gt;: </h3>extends SmartTrafficLightGenPageGen
 * <p>
 * This Java class extends a generated Java class SmartTrafficLightGenPageGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLightGenPage">Find the class SmartTrafficLightGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends SmartTrafficLightGenPageGen<MapResultPage>
 * <p>This <code>class SmartTrafficLightGenPage extends SmartTrafficLightGenPageGen&lt;MapResultPage&gt;</code>, which means it extends a newly generated SmartTrafficLightGenPageGen. 
 * The generated <code>class SmartTrafficLightGenPageGen extends MapResultPage</code> which means that SmartTrafficLightGenPage extends SmartTrafficLightGenPageGen which extends MapResultPage. 
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
 * <p>By adding a class comment "{@inheritDoc}", the SmartTrafficLightGenPage class will inherit the helpful inherited class comments from the super class SmartTrafficLightGenPageGen. 
 * </p>
 * Rows: null
 * Model: true
 * Page: true
 * SuperPage.enUS: null
 * Promise: true
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the SmartTrafficLightGenPage Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * Delete the class SmartTrafficLightGenPage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLightGenPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class SmartTrafficLightGenPageGen<DEV> extends MapResultPage {
	protected static final Logger LOG = LoggerFactory.getLogger(SmartTrafficLightGenPage.class);

	//////////////////////////////////
	// searchListSmartTrafficLight_ //
	//////////////////////////////////


	/**	 The entity searchListSmartTrafficLight_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<SmartTrafficLight> searchListSmartTrafficLight_;

	/**	<br> The entity searchListSmartTrafficLight_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLightGenPage&fq=entiteVar_enUS_indexed_string:searchListSmartTrafficLight_">Find the entity searchListSmartTrafficLight_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchListSmartTrafficLight_(Wrap<SearchList<SmartTrafficLight>> w);

	public SearchList<SmartTrafficLight> getSearchListSmartTrafficLight_() {
		return searchListSmartTrafficLight_;
	}

	public void setSearchListSmartTrafficLight_(SearchList<SmartTrafficLight> searchListSmartTrafficLight_) {
		this.searchListSmartTrafficLight_ = searchListSmartTrafficLight_;
	}
	public static SearchList<SmartTrafficLight> staticSetSearchListSmartTrafficLight_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected SmartTrafficLightGenPage searchListSmartTrafficLight_Init() {
		Wrap<SearchList<SmartTrafficLight>> searchListSmartTrafficLight_Wrap = new Wrap<SearchList<SmartTrafficLight>>().var("searchListSmartTrafficLight_");
		if(searchListSmartTrafficLight_ == null) {
			_searchListSmartTrafficLight_(searchListSmartTrafficLight_Wrap);
			setSearchListSmartTrafficLight_(searchListSmartTrafficLight_Wrap.o);
		}
		return (SmartTrafficLightGenPage)this;
	}

	///////////////////////////
	// listSmartTrafficLight //
	///////////////////////////


	/**	 The entity listSmartTrafficLight
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listSmartTrafficLight = new JsonArray();

	/**	<br> The entity listSmartTrafficLight
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLightGenPage&fq=entiteVar_enUS_indexed_string:listSmartTrafficLight">Find the entity listSmartTrafficLight in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _listSmartTrafficLight(JsonArray l);

	public JsonArray getListSmartTrafficLight() {
		return listSmartTrafficLight;
	}

	public void setListSmartTrafficLight(JsonArray listSmartTrafficLight) {
		this.listSmartTrafficLight = listSmartTrafficLight;
	}
	@JsonIgnore
	public void setListSmartTrafficLight(String o) {
		this.listSmartTrafficLight = SmartTrafficLightGenPage.staticSetListSmartTrafficLight(siteRequest_, o);
	}
	public static JsonArray staticSetListSmartTrafficLight(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonArray(o);
		}
		return null;
	}
	protected SmartTrafficLightGenPage listSmartTrafficLightInit() {
		_listSmartTrafficLight(listSmartTrafficLight);
		return (SmartTrafficLightGenPage)this;
	}

	public static JsonArray staticSearchListSmartTrafficLight(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o;
	}

	public static String staticSearchStrListSmartTrafficLight(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqListSmartTrafficLight(SiteRequestEnUS siteRequest_, String o) {
		return SmartTrafficLightGenPage.staticSearchStrListSmartTrafficLight(siteRequest_, SmartTrafficLightGenPage.staticSearchListSmartTrafficLight(siteRequest_, SmartTrafficLightGenPage.staticSetListSmartTrafficLight(siteRequest_, o)));
	}

	////////////////////////////
	// smartTrafficLightCount //
	////////////////////////////


	/**	 The entity smartTrafficLightCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer smartTrafficLightCount;

	/**	<br> The entity smartTrafficLightCount
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLightGenPage&fq=entiteVar_enUS_indexed_string:smartTrafficLightCount">Find the entity smartTrafficLightCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _smartTrafficLightCount(Wrap<Integer> w);

	public Integer getSmartTrafficLightCount() {
		return smartTrafficLightCount;
	}

	public void setSmartTrafficLightCount(Integer smartTrafficLightCount) {
		this.smartTrafficLightCount = smartTrafficLightCount;
	}
	@JsonIgnore
	public void setSmartTrafficLightCount(String o) {
		this.smartTrafficLightCount = SmartTrafficLightGenPage.staticSetSmartTrafficLightCount(siteRequest_, o);
	}
	public static Integer staticSetSmartTrafficLightCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected SmartTrafficLightGenPage smartTrafficLightCountInit() {
		Wrap<Integer> smartTrafficLightCountWrap = new Wrap<Integer>().var("smartTrafficLightCount");
		if(smartTrafficLightCount == null) {
			_smartTrafficLightCount(smartTrafficLightCountWrap);
			setSmartTrafficLightCount(smartTrafficLightCountWrap.o);
		}
		return (SmartTrafficLightGenPage)this;
	}

	public static Integer staticSearchSmartTrafficLightCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrSmartTrafficLightCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSmartTrafficLightCount(SiteRequestEnUS siteRequest_, String o) {
		return SmartTrafficLightGenPage.staticSearchStrSmartTrafficLightCount(siteRequest_, SmartTrafficLightGenPage.staticSearchSmartTrafficLightCount(siteRequest_, SmartTrafficLightGenPage.staticSetSmartTrafficLightCount(siteRequest_, o)));
	}

	////////////////////////
	// smartTrafficLight_ //
	////////////////////////


	/**	 The entity smartTrafficLight_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected SmartTrafficLight smartTrafficLight_;

	/**	<br> The entity smartTrafficLight_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLightGenPage&fq=entiteVar_enUS_indexed_string:smartTrafficLight_">Find the entity smartTrafficLight_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _smartTrafficLight_(Wrap<SmartTrafficLight> w);

	public SmartTrafficLight getSmartTrafficLight_() {
		return smartTrafficLight_;
	}

	public void setSmartTrafficLight_(SmartTrafficLight smartTrafficLight_) {
		this.smartTrafficLight_ = smartTrafficLight_;
	}
	public static SmartTrafficLight staticSetSmartTrafficLight_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected SmartTrafficLightGenPage smartTrafficLight_Init() {
		Wrap<SmartTrafficLight> smartTrafficLight_Wrap = new Wrap<SmartTrafficLight>().var("smartTrafficLight_");
		if(smartTrafficLight_ == null) {
			_smartTrafficLight_(smartTrafficLight_Wrap);
			setSmartTrafficLight_(smartTrafficLight_Wrap.o);
		}
		return (SmartTrafficLightGenPage)this;
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLightGenPage&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = SmartTrafficLightGenPage.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SmartTrafficLightGenPage idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			setId(idWrap.o);
		}
		return (SmartTrafficLightGenPage)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return SmartTrafficLightGenPage.staticSearchStrId(siteRequest_, SmartTrafficLightGenPage.staticSearchId(siteRequest_, SmartTrafficLightGenPage.staticSetId(siteRequest_, o)));
	}

	//////////////////////////////
	// pageUriSmartTrafficLight //
	//////////////////////////////


	/**	 The entity pageUriSmartTrafficLight
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUriSmartTrafficLight;

	/**	<br> The entity pageUriSmartTrafficLight
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLightGenPage&fq=entiteVar_enUS_indexed_string:pageUriSmartTrafficLight">Find the entity pageUriSmartTrafficLight in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUriSmartTrafficLight(Wrap<String> c);

	public String getPageUriSmartTrafficLight() {
		return pageUriSmartTrafficLight;
	}
	public void setPageUriSmartTrafficLight(String o) {
		this.pageUriSmartTrafficLight = SmartTrafficLightGenPage.staticSetPageUriSmartTrafficLight(siteRequest_, o);
	}
	public static String staticSetPageUriSmartTrafficLight(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SmartTrafficLightGenPage pageUriSmartTrafficLightInit() {
		Wrap<String> pageUriSmartTrafficLightWrap = new Wrap<String>().var("pageUriSmartTrafficLight");
		if(pageUriSmartTrafficLight == null) {
			_pageUriSmartTrafficLight(pageUriSmartTrafficLightWrap);
			setPageUriSmartTrafficLight(pageUriSmartTrafficLightWrap.o);
		}
		return (SmartTrafficLightGenPage)this;
	}

	public static String staticSearchPageUriSmartTrafficLight(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUriSmartTrafficLight(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUriSmartTrafficLight(SiteRequestEnUS siteRequest_, String o) {
		return SmartTrafficLightGenPage.staticSearchStrPageUriSmartTrafficLight(siteRequest_, SmartTrafficLightGenPage.staticSearchPageUriSmartTrafficLight(siteRequest_, SmartTrafficLightGenPage.staticSetPageUriSmartTrafficLight(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepSmartTrafficLightGenPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepSmartTrafficLightGenPage();
	}

	public Future<Void> promiseDeepSmartTrafficLightGenPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseSmartTrafficLightGenPage(promise2);
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

	public Future<Void> promiseSmartTrafficLightGenPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				searchListSmartTrafficLight_Init();
				listSmartTrafficLightInit();
				smartTrafficLightCountInit();
				smartTrafficLight_Init();
				idInit();
				pageUriSmartTrafficLightInit();
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
		return promiseDeepSmartTrafficLightGenPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestSmartTrafficLightGenPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestMapResultPage(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestSmartTrafficLightGenPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainSmartTrafficLightGenPage(v);
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
	public Object obtainSmartTrafficLightGenPage(String var) {
		SmartTrafficLightGenPage oSmartTrafficLightGenPage = (SmartTrafficLightGenPage)this;
		switch(var) {
			case "searchListSmartTrafficLight_":
				return oSmartTrafficLightGenPage.searchListSmartTrafficLight_;
			case "listSmartTrafficLight":
				return oSmartTrafficLightGenPage.listSmartTrafficLight;
			case "smartTrafficLightCount":
				return oSmartTrafficLightGenPage.smartTrafficLightCount;
			case "smartTrafficLight_":
				return oSmartTrafficLightGenPage.smartTrafficLight_;
			case "id":
				return oSmartTrafficLightGenPage.id;
			case "pageUriSmartTrafficLight":
				return oSmartTrafficLightGenPage.pageUriSmartTrafficLight;
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
				o = relateSmartTrafficLightGenPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateSmartTrafficLightGenPage(String var, Object val) {
		SmartTrafficLightGenPage oSmartTrafficLightGenPage = (SmartTrafficLightGenPage)this;
		switch(var) {
			default:
				return super.relateMapResultPage(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetSmartTrafficLightGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetSmartTrafficLightGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listSmartTrafficLight":
			return SmartTrafficLightGenPage.staticSetListSmartTrafficLight(siteRequest_, o);
		case "smartTrafficLightCount":
			return SmartTrafficLightGenPage.staticSetSmartTrafficLightCount(siteRequest_, o);
		case "id":
			return SmartTrafficLightGenPage.staticSetId(siteRequest_, o);
		case "pageUriSmartTrafficLight":
			return SmartTrafficLightGenPage.staticSetPageUriSmartTrafficLight(siteRequest_, o);
			default:
				return MapResultPage.staticSetMapResultPage(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchSmartTrafficLightGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchSmartTrafficLightGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listSmartTrafficLight":
			return SmartTrafficLightGenPage.staticSearchListSmartTrafficLight(siteRequest_, (JsonArray)o);
		case "smartTrafficLightCount":
			return SmartTrafficLightGenPage.staticSearchSmartTrafficLightCount(siteRequest_, (Integer)o);
		case "id":
			return SmartTrafficLightGenPage.staticSearchId(siteRequest_, (String)o);
		case "pageUriSmartTrafficLight":
			return SmartTrafficLightGenPage.staticSearchPageUriSmartTrafficLight(siteRequest_, (String)o);
			default:
				return MapResultPage.staticSearchMapResultPage(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrSmartTrafficLightGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrSmartTrafficLightGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listSmartTrafficLight":
			return SmartTrafficLightGenPage.staticSearchStrListSmartTrafficLight(siteRequest_, (JsonArray)o);
		case "smartTrafficLightCount":
			return SmartTrafficLightGenPage.staticSearchStrSmartTrafficLightCount(siteRequest_, (Integer)o);
		case "id":
			return SmartTrafficLightGenPage.staticSearchStrId(siteRequest_, (String)o);
		case "pageUriSmartTrafficLight":
			return SmartTrafficLightGenPage.staticSearchStrPageUriSmartTrafficLight(siteRequest_, (String)o);
			default:
				return MapResultPage.staticSearchStrMapResultPage(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqSmartTrafficLightGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqSmartTrafficLightGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listSmartTrafficLight":
			return SmartTrafficLightGenPage.staticSearchFqListSmartTrafficLight(siteRequest_, o);
		case "smartTrafficLightCount":
			return SmartTrafficLightGenPage.staticSearchFqSmartTrafficLightCount(siteRequest_, o);
		case "id":
			return SmartTrafficLightGenPage.staticSearchFqId(siteRequest_, o);
		case "pageUriSmartTrafficLight":
			return SmartTrafficLightGenPage.staticSearchFqPageUriSmartTrafficLight(siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "SmartTrafficLightGenPage";
	public static final String VAR_searchListSmartTrafficLight_ = "searchListSmartTrafficLight_";
	public static final String VAR_listSmartTrafficLight = "listSmartTrafficLight";
	public static final String VAR_smartTrafficLightCount = "smartTrafficLightCount";
	public static final String VAR_smartTrafficLight_ = "smartTrafficLight_";
	public static final String VAR_id = "id";
	public static final String VAR_pageUriSmartTrafficLight = "pageUriSmartTrafficLight";

	public static final String DISPLAY_NAME_searchListSmartTrafficLight_ = "";
	public static final String DISPLAY_NAME_listSmartTrafficLight = "";
	public static final String DISPLAY_NAME_smartTrafficLightCount = "";
	public static final String DISPLAY_NAME_smartTrafficLight_ = "";
	public static final String DISPLAY_NAME_id = "";
	public static final String DISPLAY_NAME_pageUriSmartTrafficLight = "";

	public static String displayNameForClass(String var) {
		return SmartTrafficLightGenPage.displayNameSmartTrafficLightGenPage(var);
	}
	public static String displayNameSmartTrafficLightGenPage(String var) {
		switch(var) {
		case VAR_searchListSmartTrafficLight_:
			return DISPLAY_NAME_searchListSmartTrafficLight_;
		case VAR_listSmartTrafficLight:
			return DISPLAY_NAME_listSmartTrafficLight;
		case VAR_smartTrafficLightCount:
			return DISPLAY_NAME_smartTrafficLightCount;
		case VAR_smartTrafficLight_:
			return DISPLAY_NAME_smartTrafficLight_;
		case VAR_id:
			return DISPLAY_NAME_id;
		case VAR_pageUriSmartTrafficLight:
			return DISPLAY_NAME_pageUriSmartTrafficLight;
		default:
			return MapResultPage.displayNameMapResultPage(var);
		}
	}
}
