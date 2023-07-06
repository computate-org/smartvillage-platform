package org.computate.smartvillageview.enus.model.traffic.time.step;

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
import org.computate.smartvillageview.enus.model.traffic.time.step.TimeStep;
import io.vertx.core.json.JsonArray;
import java.lang.Integer;
import java.lang.String;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;

/**	
<ol>
0<h3>Suggestions that can generate more code for you: </h3></ol>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these TimeStepGenPage objects in a RESTful API. 
 * </li><li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class TimeStepGenPageGen into the class TimeStepGenPage. 
 * </li>
 * <h3>About the TimeStepGenPage class and it's generated class TimeStepGenPageGen&lt;BaseResultPage&gt;: </h3>extends TimeStepGenPageGen
 * <p>
 * This Java class extends a generated Java class TimeStepGenPageGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="http://localhost:44641/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.time.step.TimeStepGenPage">Find the class TimeStepGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends TimeStepGenPageGen<BaseResultPage>
 * <p>This <code>class TimeStepGenPage extends TimeStepGenPageGen&lt;BaseResultPage&gt;</code>, which means it extends a newly generated TimeStepGenPageGen. 
 * The generated <code>class TimeStepGenPageGen extends BaseResultPage</code> which means that TimeStepGenPage extends TimeStepGenPageGen which extends BaseResultPage. 
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
 * <p>By adding a class comment "{@inheritDoc}", the TimeStepGenPage class will inherit the helpful inherited class comments from the super class TimeStepGenPageGen. 
 * </p>
 * Rows: null
 * Model: true
 * Page: true
 * SuperPage.enUS: null
 * Promise: true
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the TimeStepGenPage Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * Delete the class TimeStepGenPage in Solr: 
 * curl -k 'http://localhost:44641/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.time.step.TimeStepGenPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.traffic.time.step in Solr: 
 * curl -k 'http://localhost:44641/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.time.step&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl -k 'http://localhost:44641/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class TimeStepGenPageGen<DEV> extends BaseResultPage {
	protected static final Logger LOG = LoggerFactory.getLogger(TimeStepGenPage.class);

	/////////////////////////
	// searchListTimeStep_ //
	/////////////////////////


	/**	 The entity searchListTimeStep_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<TimeStep> searchListTimeStep_;

	/**	<br> The entity searchListTimeStep_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:44641/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.time.step.TimeStepGenPage&fq=entiteVar_enUS_indexed_string:searchListTimeStep_">Find the entity searchListTimeStep_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchListTimeStep_(Wrap<SearchList<TimeStep>> w);

	public SearchList<TimeStep> getSearchListTimeStep_() {
		return searchListTimeStep_;
	}

	public void setSearchListTimeStep_(SearchList<TimeStep> searchListTimeStep_) {
		this.searchListTimeStep_ = searchListTimeStep_;
	}
	public static SearchList<TimeStep> staticSetSearchListTimeStep_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected TimeStepGenPage searchListTimeStep_Init() {
		Wrap<SearchList<TimeStep>> searchListTimeStep_Wrap = new Wrap<SearchList<TimeStep>>().var("searchListTimeStep_");
		if(searchListTimeStep_ == null) {
			_searchListTimeStep_(searchListTimeStep_Wrap);
			setSearchListTimeStep_(searchListTimeStep_Wrap.o);
		}
		return (TimeStepGenPage)this;
	}

	//////////////////
	// listTimeStep //
	//////////////////


	/**	 The entity listTimeStep
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listTimeStep = new JsonArray();

	/**	<br> The entity listTimeStep
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:44641/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.time.step.TimeStepGenPage&fq=entiteVar_enUS_indexed_string:listTimeStep">Find the entity listTimeStep in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _listTimeStep(JsonArray l);

	public JsonArray getListTimeStep() {
		return listTimeStep;
	}

	public void setListTimeStep(JsonArray listTimeStep) {
		this.listTimeStep = listTimeStep;
	}
	@JsonIgnore
	public void setListTimeStep(String o) {
		this.listTimeStep = TimeStepGenPage.staticSetListTimeStep(siteRequest_, o);
	}
	public static JsonArray staticSetListTimeStep(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonArray(o);
		}
		return null;
	}
	protected TimeStepGenPage listTimeStepInit() {
		_listTimeStep(listTimeStep);
		return (TimeStepGenPage)this;
	}

	public static JsonArray staticSearchListTimeStep(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o;
	}

	public static String staticSearchStrListTimeStep(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqListTimeStep(SiteRequestEnUS siteRequest_, String o) {
		return TimeStepGenPage.staticSearchStrListTimeStep(siteRequest_, TimeStepGenPage.staticSearchListTimeStep(siteRequest_, TimeStepGenPage.staticSetListTimeStep(siteRequest_, o)));
	}

	///////////////////
	// timeStepCount //
	///////////////////


	/**	 The entity timeStepCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer timeStepCount;

	/**	<br> The entity timeStepCount
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:44641/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.time.step.TimeStepGenPage&fq=entiteVar_enUS_indexed_string:timeStepCount">Find the entity timeStepCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _timeStepCount(Wrap<Integer> w);

	public Integer getTimeStepCount() {
		return timeStepCount;
	}

	public void setTimeStepCount(Integer timeStepCount) {
		this.timeStepCount = timeStepCount;
	}
	@JsonIgnore
	public void setTimeStepCount(String o) {
		this.timeStepCount = TimeStepGenPage.staticSetTimeStepCount(siteRequest_, o);
	}
	public static Integer staticSetTimeStepCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected TimeStepGenPage timeStepCountInit() {
		Wrap<Integer> timeStepCountWrap = new Wrap<Integer>().var("timeStepCount");
		if(timeStepCount == null) {
			_timeStepCount(timeStepCountWrap);
			setTimeStepCount(timeStepCountWrap.o);
		}
		return (TimeStepGenPage)this;
	}

	public static Integer staticSearchTimeStepCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrTimeStepCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqTimeStepCount(SiteRequestEnUS siteRequest_, String o) {
		return TimeStepGenPage.staticSearchStrTimeStepCount(siteRequest_, TimeStepGenPage.staticSearchTimeStepCount(siteRequest_, TimeStepGenPage.staticSetTimeStepCount(siteRequest_, o)));
	}

	///////////////
	// timeStep_ //
	///////////////


	/**	 The entity timeStep_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected TimeStep timeStep_;

	/**	<br> The entity timeStep_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:44641/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.time.step.TimeStepGenPage&fq=entiteVar_enUS_indexed_string:timeStep_">Find the entity timeStep_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _timeStep_(Wrap<TimeStep> w);

	public TimeStep getTimeStep_() {
		return timeStep_;
	}

	public void setTimeStep_(TimeStep timeStep_) {
		this.timeStep_ = timeStep_;
	}
	public static TimeStep staticSetTimeStep_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected TimeStepGenPage timeStep_Init() {
		Wrap<TimeStep> timeStep_Wrap = new Wrap<TimeStep>().var("timeStep_");
		if(timeStep_ == null) {
			_timeStep_(timeStep_Wrap);
			setTimeStep_(timeStep_Wrap.o);
		}
		return (TimeStepGenPage)this;
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
	 * <br><a href="http://localhost:44641/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.time.step.TimeStepGenPage&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = TimeStepGenPage.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TimeStepGenPage idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			setId(idWrap.o);
		}
		return (TimeStepGenPage)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return TimeStepGenPage.staticSearchStrId(siteRequest_, TimeStepGenPage.staticSearchId(siteRequest_, TimeStepGenPage.staticSetId(siteRequest_, o)));
	}

	/////////////////////
	// pageUriTimeStep //
	/////////////////////


	/**	 The entity pageUriTimeStep
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUriTimeStep;

	/**	<br> The entity pageUriTimeStep
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:44641/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.time.step.TimeStepGenPage&fq=entiteVar_enUS_indexed_string:pageUriTimeStep">Find the entity pageUriTimeStep in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUriTimeStep(Wrap<String> c);

	public String getPageUriTimeStep() {
		return pageUriTimeStep;
	}
	public void setPageUriTimeStep(String o) {
		this.pageUriTimeStep = TimeStepGenPage.staticSetPageUriTimeStep(siteRequest_, o);
	}
	public static String staticSetPageUriTimeStep(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TimeStepGenPage pageUriTimeStepInit() {
		Wrap<String> pageUriTimeStepWrap = new Wrap<String>().var("pageUriTimeStep");
		if(pageUriTimeStep == null) {
			_pageUriTimeStep(pageUriTimeStepWrap);
			setPageUriTimeStep(pageUriTimeStepWrap.o);
		}
		return (TimeStepGenPage)this;
	}

	public static String staticSearchPageUriTimeStep(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUriTimeStep(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUriTimeStep(SiteRequestEnUS siteRequest_, String o) {
		return TimeStepGenPage.staticSearchStrPageUriTimeStep(siteRequest_, TimeStepGenPage.staticSearchPageUriTimeStep(siteRequest_, TimeStepGenPage.staticSetPageUriTimeStep(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepTimeStepGenPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepTimeStepGenPage();
	}

	public Future<Void> promiseDeepTimeStepGenPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseTimeStepGenPage(promise2);
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

	public Future<Void> promiseTimeStepGenPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				searchListTimeStep_Init();
				listTimeStepInit();
				timeStepCountInit();
				timeStep_Init();
				idInit();
				pageUriTimeStepInit();
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
		return promiseDeepTimeStepGenPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestTimeStepGenPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestBaseResultPage(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestTimeStepGenPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainTimeStepGenPage(v);
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
	public Object obtainTimeStepGenPage(String var) {
		TimeStepGenPage oTimeStepGenPage = (TimeStepGenPage)this;
		switch(var) {
			case "searchListTimeStep_":
				return oTimeStepGenPage.searchListTimeStep_;
			case "listTimeStep":
				return oTimeStepGenPage.listTimeStep;
			case "timeStepCount":
				return oTimeStepGenPage.timeStepCount;
			case "timeStep_":
				return oTimeStepGenPage.timeStep_;
			case "id":
				return oTimeStepGenPage.id;
			case "pageUriTimeStep":
				return oTimeStepGenPage.pageUriTimeStep;
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
				o = relateTimeStepGenPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateTimeStepGenPage(String var, Object val) {
		TimeStepGenPage oTimeStepGenPage = (TimeStepGenPage)this;
		switch(var) {
			default:
				return super.relateBaseResultPage(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetTimeStepGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetTimeStepGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listTimeStep":
			return TimeStepGenPage.staticSetListTimeStep(siteRequest_, o);
		case "timeStepCount":
			return TimeStepGenPage.staticSetTimeStepCount(siteRequest_, o);
		case "id":
			return TimeStepGenPage.staticSetId(siteRequest_, o);
		case "pageUriTimeStep":
			return TimeStepGenPage.staticSetPageUriTimeStep(siteRequest_, o);
			default:
				return BaseResultPage.staticSetBaseResultPage(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchTimeStepGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchTimeStepGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listTimeStep":
			return TimeStepGenPage.staticSearchListTimeStep(siteRequest_, (JsonArray)o);
		case "timeStepCount":
			return TimeStepGenPage.staticSearchTimeStepCount(siteRequest_, (Integer)o);
		case "id":
			return TimeStepGenPage.staticSearchId(siteRequest_, (String)o);
		case "pageUriTimeStep":
			return TimeStepGenPage.staticSearchPageUriTimeStep(siteRequest_, (String)o);
			default:
				return BaseResultPage.staticSearchBaseResultPage(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrTimeStepGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrTimeStepGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listTimeStep":
			return TimeStepGenPage.staticSearchStrListTimeStep(siteRequest_, (JsonArray)o);
		case "timeStepCount":
			return TimeStepGenPage.staticSearchStrTimeStepCount(siteRequest_, (Integer)o);
		case "id":
			return TimeStepGenPage.staticSearchStrId(siteRequest_, (String)o);
		case "pageUriTimeStep":
			return TimeStepGenPage.staticSearchStrPageUriTimeStep(siteRequest_, (String)o);
			default:
				return BaseResultPage.staticSearchStrBaseResultPage(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqTimeStepGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqTimeStepGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listTimeStep":
			return TimeStepGenPage.staticSearchFqListTimeStep(siteRequest_, o);
		case "timeStepCount":
			return TimeStepGenPage.staticSearchFqTimeStepCount(siteRequest_, o);
		case "id":
			return TimeStepGenPage.staticSearchFqId(siteRequest_, o);
		case "pageUriTimeStep":
			return TimeStepGenPage.staticSearchFqPageUriTimeStep(siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "TimeStepGenPage";
	public static final String VAR_searchListTimeStep_ = "searchListTimeStep_";
	public static final String VAR_listTimeStep = "listTimeStep";
	public static final String VAR_timeStepCount = "timeStepCount";
	public static final String VAR_timeStep_ = "timeStep_";
	public static final String VAR_id = "id";
	public static final String VAR_pageUriTimeStep = "pageUriTimeStep";

	public static final String DISPLAY_NAME_searchListTimeStep_ = "";
	public static final String DISPLAY_NAME_listTimeStep = "";
	public static final String DISPLAY_NAME_timeStepCount = "";
	public static final String DISPLAY_NAME_timeStep_ = "";
	public static final String DISPLAY_NAME_id = "";
	public static final String DISPLAY_NAME_pageUriTimeStep = "";

	public static String displayNameForClass(String var) {
		return TimeStepGenPage.displayNameTimeStepGenPage(var);
	}
	public static String displayNameTimeStepGenPage(String var) {
		switch(var) {
		case VAR_searchListTimeStep_:
			return DISPLAY_NAME_searchListTimeStep_;
		case VAR_listTimeStep:
			return DISPLAY_NAME_listTimeStep;
		case VAR_timeStepCount:
			return DISPLAY_NAME_timeStepCount;
		case VAR_timeStep_:
			return DISPLAY_NAME_timeStep_;
		case VAR_id:
			return DISPLAY_NAME_id;
		case VAR_pageUriTimeStep:
			return DISPLAY_NAME_pageUriTimeStep;
		default:
			return BaseResultPage.displayNameBaseResultPage(var);
		}
	}
}
