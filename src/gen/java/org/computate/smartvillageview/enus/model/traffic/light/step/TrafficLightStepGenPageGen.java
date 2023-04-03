package org.computate.smartvillageview.enus.model.traffic.light.step;

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
import org.computate.smartvillageview.enus.model.traffic.light.step.TrafficLightStep;
import io.vertx.core.json.JsonArray;
import java.lang.Integer;
import java.lang.String;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;

/**	
<ol>
0<h3>Suggestions that can generate more code for you: </h3></ol>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these TrafficLightStepGenPage objects in a RESTful API. 
 * </li><li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class TrafficLightStepGenPageGen into the class TrafficLightStepGenPage. 
 * </li>
 * <h3>About the TrafficLightStepGenPage class and it's generated class TrafficLightStepGenPageGen&lt;MapResultPage&gt;: </h3>extends TrafficLightStepGenPageGen
 * <p>
 * This Java class extends a generated Java class TrafficLightStepGenPageGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.step.TrafficLightStepGenPage">Find the class TrafficLightStepGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends TrafficLightStepGenPageGen<MapResultPage>
 * <p>This <code>class TrafficLightStepGenPage extends TrafficLightStepGenPageGen&lt;MapResultPage&gt;</code>, which means it extends a newly generated TrafficLightStepGenPageGen. 
 * The generated <code>class TrafficLightStepGenPageGen extends MapResultPage</code> which means that TrafficLightStepGenPage extends TrafficLightStepGenPageGen which extends MapResultPage. 
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
 * <p>By adding a class comment "{@inheritDoc}", the TrafficLightStepGenPage class will inherit the helpful inherited class comments from the super class TrafficLightStepGenPageGen. 
 * </p>
 * Rows: null
 * Model: true
 * Page: true
 * SuperPage.enUS: null
 * Promise: true
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the TrafficLightStepGenPage Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * Delete the class TrafficLightStepGenPage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.step.TrafficLightStepGenPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.traffic.light.step in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.step&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class TrafficLightStepGenPageGen<DEV> extends MapResultPage {
	protected static final Logger LOG = LoggerFactory.getLogger(TrafficLightStepGenPage.class);

	/////////////////////////////////
	// searchListTrafficLightStep_ //
	/////////////////////////////////


	/**	 The entity searchListTrafficLightStep_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<TrafficLightStep> searchListTrafficLightStep_;

	/**	<br> The entity searchListTrafficLightStep_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.step.TrafficLightStepGenPage&fq=entiteVar_enUS_indexed_string:searchListTrafficLightStep_">Find the entity searchListTrafficLightStep_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchListTrafficLightStep_(Wrap<SearchList<TrafficLightStep>> w);

	public SearchList<TrafficLightStep> getSearchListTrafficLightStep_() {
		return searchListTrafficLightStep_;
	}

	public void setSearchListTrafficLightStep_(SearchList<TrafficLightStep> searchListTrafficLightStep_) {
		this.searchListTrafficLightStep_ = searchListTrafficLightStep_;
	}
	public static SearchList<TrafficLightStep> staticSetSearchListTrafficLightStep_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected TrafficLightStepGenPage searchListTrafficLightStep_Init() {
		Wrap<SearchList<TrafficLightStep>> searchListTrafficLightStep_Wrap = new Wrap<SearchList<TrafficLightStep>>().var("searchListTrafficLightStep_");
		if(searchListTrafficLightStep_ == null) {
			_searchListTrafficLightStep_(searchListTrafficLightStep_Wrap);
			setSearchListTrafficLightStep_(searchListTrafficLightStep_Wrap.o);
		}
		return (TrafficLightStepGenPage)this;
	}

	//////////////////////////
	// listTrafficLightStep //
	//////////////////////////


	/**	 The entity listTrafficLightStep
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listTrafficLightStep = new JsonArray();

	/**	<br> The entity listTrafficLightStep
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.step.TrafficLightStepGenPage&fq=entiteVar_enUS_indexed_string:listTrafficLightStep">Find the entity listTrafficLightStep in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _listTrafficLightStep(JsonArray l);

	public JsonArray getListTrafficLightStep() {
		return listTrafficLightStep;
	}

	public void setListTrafficLightStep(JsonArray listTrafficLightStep) {
		this.listTrafficLightStep = listTrafficLightStep;
	}
	@JsonIgnore
	public void setListTrafficLightStep(String o) {
		this.listTrafficLightStep = TrafficLightStepGenPage.staticSetListTrafficLightStep(siteRequest_, o);
	}
	public static JsonArray staticSetListTrafficLightStep(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonArray(o);
		}
		return null;
	}
	protected TrafficLightStepGenPage listTrafficLightStepInit() {
		_listTrafficLightStep(listTrafficLightStep);
		return (TrafficLightStepGenPage)this;
	}

	public static JsonArray staticSearchListTrafficLightStep(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o;
	}

	public static String staticSearchStrListTrafficLightStep(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqListTrafficLightStep(SiteRequestEnUS siteRequest_, String o) {
		return TrafficLightStepGenPage.staticSearchStrListTrafficLightStep(siteRequest_, TrafficLightStepGenPage.staticSearchListTrafficLightStep(siteRequest_, TrafficLightStepGenPage.staticSetListTrafficLightStep(siteRequest_, o)));
	}

	///////////////////////////
	// trafficLightStepCount //
	///////////////////////////


	/**	 The entity trafficLightStepCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer trafficLightStepCount;

	/**	<br> The entity trafficLightStepCount
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.step.TrafficLightStepGenPage&fq=entiteVar_enUS_indexed_string:trafficLightStepCount">Find the entity trafficLightStepCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _trafficLightStepCount(Wrap<Integer> w);

	public Integer getTrafficLightStepCount() {
		return trafficLightStepCount;
	}

	public void setTrafficLightStepCount(Integer trafficLightStepCount) {
		this.trafficLightStepCount = trafficLightStepCount;
	}
	@JsonIgnore
	public void setTrafficLightStepCount(String o) {
		this.trafficLightStepCount = TrafficLightStepGenPage.staticSetTrafficLightStepCount(siteRequest_, o);
	}
	public static Integer staticSetTrafficLightStepCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected TrafficLightStepGenPage trafficLightStepCountInit() {
		Wrap<Integer> trafficLightStepCountWrap = new Wrap<Integer>().var("trafficLightStepCount");
		if(trafficLightStepCount == null) {
			_trafficLightStepCount(trafficLightStepCountWrap);
			setTrafficLightStepCount(trafficLightStepCountWrap.o);
		}
		return (TrafficLightStepGenPage)this;
	}

	public static Integer staticSearchTrafficLightStepCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrTrafficLightStepCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqTrafficLightStepCount(SiteRequestEnUS siteRequest_, String o) {
		return TrafficLightStepGenPage.staticSearchStrTrafficLightStepCount(siteRequest_, TrafficLightStepGenPage.staticSearchTrafficLightStepCount(siteRequest_, TrafficLightStepGenPage.staticSetTrafficLightStepCount(siteRequest_, o)));
	}

	///////////////////////
	// trafficLightStep_ //
	///////////////////////


	/**	 The entity trafficLightStep_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected TrafficLightStep trafficLightStep_;

	/**	<br> The entity trafficLightStep_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.step.TrafficLightStepGenPage&fq=entiteVar_enUS_indexed_string:trafficLightStep_">Find the entity trafficLightStep_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _trafficLightStep_(Wrap<TrafficLightStep> w);

	public TrafficLightStep getTrafficLightStep_() {
		return trafficLightStep_;
	}

	public void setTrafficLightStep_(TrafficLightStep trafficLightStep_) {
		this.trafficLightStep_ = trafficLightStep_;
	}
	public static TrafficLightStep staticSetTrafficLightStep_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected TrafficLightStepGenPage trafficLightStep_Init() {
		Wrap<TrafficLightStep> trafficLightStep_Wrap = new Wrap<TrafficLightStep>().var("trafficLightStep_");
		if(trafficLightStep_ == null) {
			_trafficLightStep_(trafficLightStep_Wrap);
			setTrafficLightStep_(trafficLightStep_Wrap.o);
		}
		return (TrafficLightStepGenPage)this;
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.step.TrafficLightStepGenPage&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = TrafficLightStepGenPage.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficLightStepGenPage idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			setId(idWrap.o);
		}
		return (TrafficLightStepGenPage)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return TrafficLightStepGenPage.staticSearchStrId(siteRequest_, TrafficLightStepGenPage.staticSearchId(siteRequest_, TrafficLightStepGenPage.staticSetId(siteRequest_, o)));
	}

	/////////////////////////////
	// pageUriTrafficLightStep //
	/////////////////////////////


	/**	 The entity pageUriTrafficLightStep
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUriTrafficLightStep;

	/**	<br> The entity pageUriTrafficLightStep
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.step.TrafficLightStepGenPage&fq=entiteVar_enUS_indexed_string:pageUriTrafficLightStep">Find the entity pageUriTrafficLightStep in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUriTrafficLightStep(Wrap<String> c);

	public String getPageUriTrafficLightStep() {
		return pageUriTrafficLightStep;
	}
	public void setPageUriTrafficLightStep(String o) {
		this.pageUriTrafficLightStep = TrafficLightStepGenPage.staticSetPageUriTrafficLightStep(siteRequest_, o);
	}
	public static String staticSetPageUriTrafficLightStep(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficLightStepGenPage pageUriTrafficLightStepInit() {
		Wrap<String> pageUriTrafficLightStepWrap = new Wrap<String>().var("pageUriTrafficLightStep");
		if(pageUriTrafficLightStep == null) {
			_pageUriTrafficLightStep(pageUriTrafficLightStepWrap);
			setPageUriTrafficLightStep(pageUriTrafficLightStepWrap.o);
		}
		return (TrafficLightStepGenPage)this;
	}

	public static String staticSearchPageUriTrafficLightStep(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUriTrafficLightStep(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUriTrafficLightStep(SiteRequestEnUS siteRequest_, String o) {
		return TrafficLightStepGenPage.staticSearchStrPageUriTrafficLightStep(siteRequest_, TrafficLightStepGenPage.staticSearchPageUriTrafficLightStep(siteRequest_, TrafficLightStepGenPage.staticSetPageUriTrafficLightStep(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepTrafficLightStepGenPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepTrafficLightStepGenPage();
	}

	public Future<Void> promiseDeepTrafficLightStepGenPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseTrafficLightStepGenPage(promise2);
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

	public Future<Void> promiseTrafficLightStepGenPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				searchListTrafficLightStep_Init();
				listTrafficLightStepInit();
				trafficLightStepCountInit();
				trafficLightStep_Init();
				idInit();
				pageUriTrafficLightStepInit();
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
		return promiseDeepTrafficLightStepGenPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestTrafficLightStepGenPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestMapResultPage(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestTrafficLightStepGenPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainTrafficLightStepGenPage(v);
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
	public Object obtainTrafficLightStepGenPage(String var) {
		TrafficLightStepGenPage oTrafficLightStepGenPage = (TrafficLightStepGenPage)this;
		switch(var) {
			case "searchListTrafficLightStep_":
				return oTrafficLightStepGenPage.searchListTrafficLightStep_;
			case "listTrafficLightStep":
				return oTrafficLightStepGenPage.listTrafficLightStep;
			case "trafficLightStepCount":
				return oTrafficLightStepGenPage.trafficLightStepCount;
			case "trafficLightStep_":
				return oTrafficLightStepGenPage.trafficLightStep_;
			case "id":
				return oTrafficLightStepGenPage.id;
			case "pageUriTrafficLightStep":
				return oTrafficLightStepGenPage.pageUriTrafficLightStep;
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
				o = relateTrafficLightStepGenPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateTrafficLightStepGenPage(String var, Object val) {
		TrafficLightStepGenPage oTrafficLightStepGenPage = (TrafficLightStepGenPage)this;
		switch(var) {
			default:
				return super.relateMapResultPage(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetTrafficLightStepGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetTrafficLightStepGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listTrafficLightStep":
			return TrafficLightStepGenPage.staticSetListTrafficLightStep(siteRequest_, o);
		case "trafficLightStepCount":
			return TrafficLightStepGenPage.staticSetTrafficLightStepCount(siteRequest_, o);
		case "id":
			return TrafficLightStepGenPage.staticSetId(siteRequest_, o);
		case "pageUriTrafficLightStep":
			return TrafficLightStepGenPage.staticSetPageUriTrafficLightStep(siteRequest_, o);
			default:
				return MapResultPage.staticSetMapResultPage(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchTrafficLightStepGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchTrafficLightStepGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listTrafficLightStep":
			return TrafficLightStepGenPage.staticSearchListTrafficLightStep(siteRequest_, (JsonArray)o);
		case "trafficLightStepCount":
			return TrafficLightStepGenPage.staticSearchTrafficLightStepCount(siteRequest_, (Integer)o);
		case "id":
			return TrafficLightStepGenPage.staticSearchId(siteRequest_, (String)o);
		case "pageUriTrafficLightStep":
			return TrafficLightStepGenPage.staticSearchPageUriTrafficLightStep(siteRequest_, (String)o);
			default:
				return MapResultPage.staticSearchMapResultPage(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrTrafficLightStepGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrTrafficLightStepGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listTrafficLightStep":
			return TrafficLightStepGenPage.staticSearchStrListTrafficLightStep(siteRequest_, (JsonArray)o);
		case "trafficLightStepCount":
			return TrafficLightStepGenPage.staticSearchStrTrafficLightStepCount(siteRequest_, (Integer)o);
		case "id":
			return TrafficLightStepGenPage.staticSearchStrId(siteRequest_, (String)o);
		case "pageUriTrafficLightStep":
			return TrafficLightStepGenPage.staticSearchStrPageUriTrafficLightStep(siteRequest_, (String)o);
			default:
				return MapResultPage.staticSearchStrMapResultPage(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqTrafficLightStepGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqTrafficLightStepGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listTrafficLightStep":
			return TrafficLightStepGenPage.staticSearchFqListTrafficLightStep(siteRequest_, o);
		case "trafficLightStepCount":
			return TrafficLightStepGenPage.staticSearchFqTrafficLightStepCount(siteRequest_, o);
		case "id":
			return TrafficLightStepGenPage.staticSearchFqId(siteRequest_, o);
		case "pageUriTrafficLightStep":
			return TrafficLightStepGenPage.staticSearchFqPageUriTrafficLightStep(siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "TrafficLightStepGenPage";
	public static final String VAR_searchListTrafficLightStep_ = "searchListTrafficLightStep_";
	public static final String VAR_listTrafficLightStep = "listTrafficLightStep";
	public static final String VAR_trafficLightStepCount = "trafficLightStepCount";
	public static final String VAR_trafficLightStep_ = "trafficLightStep_";
	public static final String VAR_id = "id";
	public static final String VAR_pageUriTrafficLightStep = "pageUriTrafficLightStep";

	public static final String DISPLAY_NAME_searchListTrafficLightStep_ = "";
	public static final String DISPLAY_NAME_listTrafficLightStep = "";
	public static final String DISPLAY_NAME_trafficLightStepCount = "";
	public static final String DISPLAY_NAME_trafficLightStep_ = "";
	public static final String DISPLAY_NAME_id = "";
	public static final String DISPLAY_NAME_pageUriTrafficLightStep = "";

	public static String displayNameForClass(String var) {
		return TrafficLightStepGenPage.displayNameTrafficLightStepGenPage(var);
	}
	public static String displayNameTrafficLightStepGenPage(String var) {
		switch(var) {
		case VAR_searchListTrafficLightStep_:
			return DISPLAY_NAME_searchListTrafficLightStep_;
		case VAR_listTrafficLightStep:
			return DISPLAY_NAME_listTrafficLightStep;
		case VAR_trafficLightStepCount:
			return DISPLAY_NAME_trafficLightStepCount;
		case VAR_trafficLightStep_:
			return DISPLAY_NAME_trafficLightStep_;
		case VAR_id:
			return DISPLAY_NAME_id;
		case VAR_pageUriTrafficLightStep:
			return DISPLAY_NAME_pageUriTrafficLightStep;
		default:
			return MapResultPage.displayNameMapResultPage(var);
		}
	}
}
