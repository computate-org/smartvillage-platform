package org.computate.smartvillageview.enus.model.system.event;

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
import org.computate.smartvillageview.enus.model.system.event.SystemEvent;
import io.vertx.core.json.JsonArray;
import java.lang.Integer;
import java.lang.String;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;

/**	
<ol>
<li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these SystemEventGenPage objects in a RESTful API. 
</li>
<li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class SystemEventGenPageGen into the class SystemEventGenPage. 
</li>
0<h3>Suggestions that can generate more code for you: </h3></ol>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these SystemEventGenPage objects in a RESTful API. 
 * </li>
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class SystemEventGenPageGen into the class SystemEventGenPage. 
 * </li>
 * 0<h3>Suggestions that can generate more code for you: </h3>
 * <h3>About the SystemEventGenPage class and it's generated class SystemEventGenPageGen&lt;PageLayout&gt;: </h3>extends SystemEventGenPageGen
 * <p>
 * This Java class extends a generated Java class SystemEventGenPageGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEventGenPage">Find the class SystemEventGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends SystemEventGenPageGen<PageLayout>
 * <p>This <code>class SystemEventGenPage extends SystemEventGenPageGen&lt;PageLayout&gt;</code>, which means it extends a newly generated SystemEventGenPageGen. 
 * The generated <code>class SystemEventGenPageGen extends PageLayout</code> which means that SystemEventGenPage extends SystemEventGenPageGen which extends PageLayout. 
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
 * <p>By adding a class comment "{@inheritDoc}", the SystemEventGenPage class will inherit the helpful inherited class comments from the super class SystemEventGenPageGen. 
 * </p>
 * Rows: null
 * Model: true
 * Page: true
 * SuperPage.enUS: null
 * Promise: true
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the SystemEventGenPage Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * AName: null
 * <p>
 * Delete the class SystemEventGenPage in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEventGenPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.system.event in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class SystemEventGenPageGen<DEV> extends PageLayout {
	protected static final Logger LOG = LoggerFactory.getLogger(SystemEventGenPage.class);

	////////////////////////////
	// searchListSystemEvent_ //
	////////////////////////////


	/**	 The entity searchListSystemEvent_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<SystemEvent> searchListSystemEvent_;

	/**	<br> The entity searchListSystemEvent_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEventGenPage&fq=entiteVar_enUS_indexed_string:searchListSystemEvent_">Find the entity searchListSystemEvent_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchListSystemEvent_(Wrap<SearchList<SystemEvent>> w);

	public SearchList<SystemEvent> getSearchListSystemEvent_() {
		return searchListSystemEvent_;
	}

	public void setSearchListSystemEvent_(SearchList<SystemEvent> searchListSystemEvent_) {
		this.searchListSystemEvent_ = searchListSystemEvent_;
	}
	public static SearchList<SystemEvent> staticSetSearchListSystemEvent_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected SystemEventGenPage searchListSystemEvent_Init() {
		Wrap<SearchList<SystemEvent>> searchListSystemEvent_Wrap = new Wrap<SearchList<SystemEvent>>().var("searchListSystemEvent_");
		if(searchListSystemEvent_ == null) {
			_searchListSystemEvent_(searchListSystemEvent_Wrap);
			setSearchListSystemEvent_(searchListSystemEvent_Wrap.o);
		}
		return (SystemEventGenPage)this;
	}


























	/////////////////////
	// listSystemEvent //
	/////////////////////


	/**	 The entity listSystemEvent
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listSystemEvent = new JsonArray();

	/**	<br> The entity listSystemEvent
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEventGenPage&fq=entiteVar_enUS_indexed_string:listSystemEvent">Find the entity listSystemEvent in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _listSystemEvent(JsonArray l);

	public JsonArray getListSystemEvent() {
		return listSystemEvent;
	}

	public void setListSystemEvent(JsonArray listSystemEvent) {
		this.listSystemEvent = listSystemEvent;
	}
	public static JsonArray staticSetListSystemEvent(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected SystemEventGenPage listSystemEventInit() {
		_listSystemEvent(listSystemEvent);
		return (SystemEventGenPage)this;
	}

	//////////////////////
	// systemEventCount //
	//////////////////////


	/**	 The entity systemEventCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer systemEventCount;

	/**	<br> The entity systemEventCount
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEventGenPage&fq=entiteVar_enUS_indexed_string:systemEventCount">Find the entity systemEventCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _systemEventCount(Wrap<Integer> w);

	public Integer getSystemEventCount() {
		return systemEventCount;
	}

	public void setSystemEventCount(Integer systemEventCount) {
		this.systemEventCount = systemEventCount;
	}
	@JsonIgnore
	public void setSystemEventCount(String o) {
		this.systemEventCount = SystemEventGenPage.staticSetSystemEventCount(siteRequest_, o);
	}
	public static Integer staticSetSystemEventCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected SystemEventGenPage systemEventCountInit() {
		Wrap<Integer> systemEventCountWrap = new Wrap<Integer>().var("systemEventCount");
		if(systemEventCount == null) {
			_systemEventCount(systemEventCountWrap);
			setSystemEventCount(systemEventCountWrap.o);
		}
		return (SystemEventGenPage)this;
	}

	public static Integer staticSearchSystemEventCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrSystemEventCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSystemEventCount(SiteRequestEnUS siteRequest_, String o) {
		return SystemEventGenPage.staticSearchStrSystemEventCount(siteRequest_, SystemEventGenPage.staticSearchSystemEventCount(siteRequest_, SystemEventGenPage.staticSetSystemEventCount(siteRequest_, o)));
	}

	//////////////////
	// systemEvent_ //
	//////////////////


	/**	 The entity systemEvent_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected SystemEvent systemEvent_;

	/**	<br> The entity systemEvent_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEventGenPage&fq=entiteVar_enUS_indexed_string:systemEvent_">Find the entity systemEvent_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _systemEvent_(Wrap<SystemEvent> w);

	public SystemEvent getSystemEvent_() {
		return systemEvent_;
	}

	public void setSystemEvent_(SystemEvent systemEvent_) {
		this.systemEvent_ = systemEvent_;
	}
	public static SystemEvent staticSetSystemEvent_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected SystemEventGenPage systemEvent_Init() {
		Wrap<SystemEvent> systemEvent_Wrap = new Wrap<SystemEvent>().var("systemEvent_");
		if(systemEvent_ == null) {
			_systemEvent_(systemEvent_Wrap);
			setSystemEvent_(systemEvent_Wrap.o);
		}
		return (SystemEventGenPage)this;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEventGenPage&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = SystemEventGenPage.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SystemEventGenPage idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			setId(idWrap.o);
		}
		return (SystemEventGenPage)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return SystemEventGenPage.staticSearchStrId(siteRequest_, SystemEventGenPage.staticSearchId(siteRequest_, SystemEventGenPage.staticSetId(siteRequest_, o)));
	}













	////////////////////////
	// pageUriSystemEvent //
	////////////////////////


	/**	 The entity pageUriSystemEvent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUriSystemEvent;

	/**	<br> The entity pageUriSystemEvent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.system.event.SystemEventGenPage&fq=entiteVar_enUS_indexed_string:pageUriSystemEvent">Find the entity pageUriSystemEvent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUriSystemEvent(Wrap<String> c);

	public String getPageUriSystemEvent() {
		return pageUriSystemEvent;
	}
	public void setPageUriSystemEvent(String o) {
		this.pageUriSystemEvent = SystemEventGenPage.staticSetPageUriSystemEvent(siteRequest_, o);
	}
	public static String staticSetPageUriSystemEvent(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SystemEventGenPage pageUriSystemEventInit() {
		Wrap<String> pageUriSystemEventWrap = new Wrap<String>().var("pageUriSystemEvent");
		if(pageUriSystemEvent == null) {
			_pageUriSystemEvent(pageUriSystemEventWrap);
			setPageUriSystemEvent(pageUriSystemEventWrap.o);
		}
		return (SystemEventGenPage)this;
	}

	public static String staticSearchPageUriSystemEvent(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUriSystemEvent(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUriSystemEvent(SiteRequestEnUS siteRequest_, String o) {
		return SystemEventGenPage.staticSearchStrPageUriSystemEvent(siteRequest_, SystemEventGenPage.staticSearchPageUriSystemEvent(siteRequest_, SystemEventGenPage.staticSetPageUriSystemEvent(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepSystemEventGenPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepSystemEventGenPage();
	}

	public Future<Void> promiseDeepSystemEventGenPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseSystemEventGenPage(promise2);
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

	public Future<Void> promiseSystemEventGenPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				searchListSystemEvent_Init();
				listSystemEventInit();
				systemEventCountInit();
				systemEvent_Init();
				idInit();
				pageUriSystemEventInit();
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
		return promiseDeepSystemEventGenPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestSystemEventGenPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestPageLayout(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestSystemEventGenPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainSystemEventGenPage(v);
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
	public Object obtainSystemEventGenPage(String var) {
		SystemEventGenPage oSystemEventGenPage = (SystemEventGenPage)this;
		switch(var) {
			case "searchListSystemEvent_":
				return oSystemEventGenPage.searchListSystemEvent_;
			case "listSystemEvent":
				return oSystemEventGenPage.listSystemEvent;
			case "systemEventCount":
				return oSystemEventGenPage.systemEventCount;
			case "systemEvent_":
				return oSystemEventGenPage.systemEvent_;
			case "id":
				return oSystemEventGenPage.id;
			case "pageUriSystemEvent":
				return oSystemEventGenPage.pageUriSystemEvent;
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
				o = relateSystemEventGenPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateSystemEventGenPage(String var, Object val) {
		SystemEventGenPage oSystemEventGenPage = (SystemEventGenPage)this;
		switch(var) {
			default:
				return super.relatePageLayout(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetSystemEventGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetSystemEventGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "systemEventCount":
			return SystemEventGenPage.staticSetSystemEventCount(siteRequest_, o);
		case "id":
			return SystemEventGenPage.staticSetId(siteRequest_, o);
		case "pageUriSystemEvent":
			return SystemEventGenPage.staticSetPageUriSystemEvent(siteRequest_, o);
			default:
				return PageLayout.staticSetPageLayout(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchSystemEventGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchSystemEventGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "systemEventCount":
			return SystemEventGenPage.staticSearchSystemEventCount(siteRequest_, (Integer)o);
		case "id":
			return SystemEventGenPage.staticSearchId(siteRequest_, (String)o);
		case "pageUriSystemEvent":
			return SystemEventGenPage.staticSearchPageUriSystemEvent(siteRequest_, (String)o);
			default:
				return PageLayout.staticSearchPageLayout(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrSystemEventGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrSystemEventGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "systemEventCount":
			return SystemEventGenPage.staticSearchStrSystemEventCount(siteRequest_, (Integer)o);
		case "id":
			return SystemEventGenPage.staticSearchStrId(siteRequest_, (String)o);
		case "pageUriSystemEvent":
			return SystemEventGenPage.staticSearchStrPageUriSystemEvent(siteRequest_, (String)o);
			default:
				return PageLayout.staticSearchStrPageLayout(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqSystemEventGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqSystemEventGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "systemEventCount":
			return SystemEventGenPage.staticSearchFqSystemEventCount(siteRequest_, o);
		case "id":
			return SystemEventGenPage.staticSearchFqId(siteRequest_, o);
		case "pageUriSystemEvent":
			return SystemEventGenPage.staticSearchFqPageUriSystemEvent(siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "SystemEventGenPage";
	public static final String VAR_searchListSystemEvent_ = "searchListSystemEvent_";
	public static final String VAR_listSystemEvent = "listSystemEvent";
	public static final String VAR_systemEventCount = "systemEventCount";
	public static final String VAR_systemEvent_ = "systemEvent_";
	public static final String VAR_id = "id";
	public static final String VAR_pageUriSystemEvent = "pageUriSystemEvent";

	public static final String DISPLAY_NAME_searchListSystemEvent_ = "";
	public static final String DISPLAY_NAME_listSystemEvent = "";
	public static final String DISPLAY_NAME_systemEventCount = "";
	public static final String DISPLAY_NAME_systemEvent_ = "";
	public static final String DISPLAY_NAME_id = "";
	public static final String DISPLAY_NAME_pageUriSystemEvent = "";

	public static String displayNameForClass(String var) {
		return SystemEventGenPage.displayNameSystemEventGenPage(var);
	}
	public static String displayNameSystemEventGenPage(String var) {
		switch(var) {
		case VAR_searchListSystemEvent_:
			return DISPLAY_NAME_searchListSystemEvent_;
		case VAR_listSystemEvent:
			return DISPLAY_NAME_listSystemEvent;
		case VAR_systemEventCount:
			return DISPLAY_NAME_systemEventCount;
		case VAR_systemEvent_:
			return DISPLAY_NAME_systemEvent_;
		case VAR_id:
			return DISPLAY_NAME_id;
		case VAR_pageUriSystemEvent:
			return DISPLAY_NAME_pageUriSystemEvent;
		default:
			return PageLayout.displayNamePageLayout(var);
		}
	}
}
