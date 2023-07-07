package org.computate.smartvillageview.enus.result.iotnode.step;

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
import org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep;
import io.vertx.core.json.JsonArray;
import java.lang.Integer;
import java.lang.String;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;

/**	
<ol>
0<h3>Suggestions that can generate more code for you: </h3></ol>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these IotNodeStepGenPage objects in a RESTful API. 
 * </li><li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class IotNodeStepGenPageGen into the class IotNodeStepGenPage. 
 * </li>
 * <h3>About the IotNodeStepGenPage class and it's generated class IotNodeStepGenPageGen&lt;BaseResultPage&gt;: </h3>extends IotNodeStepGenPageGen
 * <p>
 * This Java class extends a generated Java class IotNodeStepGenPageGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepGenPage">Find the class IotNodeStepGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends IotNodeStepGenPageGen<BaseResultPage>
 * <p>This <code>class IotNodeStepGenPage extends IotNodeStepGenPageGen&lt;BaseResultPage&gt;</code>, which means it extends a newly generated IotNodeStepGenPageGen. 
 * The generated <code>class IotNodeStepGenPageGen extends BaseResultPage</code> which means that IotNodeStepGenPage extends IotNodeStepGenPageGen which extends BaseResultPage. 
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
 * <p>By adding a class comment "{@inheritDoc}", the IotNodeStepGenPage class will inherit the helpful inherited class comments from the super class IotNodeStepGenPageGen. 
 * </p>
 * Rows: null
 * Model: true
 * Page: true
 * SuperPage.enUS: null
 * Promise: true
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the IotNodeStepGenPage Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * Delete the class IotNodeStepGenPage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepGenPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.result.iotnode.step in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class IotNodeStepGenPageGen<DEV> extends BaseResultPage {
	protected static final Logger LOG = LoggerFactory.getLogger(IotNodeStepGenPage.class);

	////////////////////////////
	// searchListIotNodeStep_ //
	////////////////////////////


	/**	 The entity searchListIotNodeStep_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<IotNodeStep> searchListIotNodeStep_;

	/**	<br> The entity searchListIotNodeStep_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepGenPage&fq=entiteVar_enUS_indexed_string:searchListIotNodeStep_">Find the entity searchListIotNodeStep_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchListIotNodeStep_(Wrap<SearchList<IotNodeStep>> w);

	public SearchList<IotNodeStep> getSearchListIotNodeStep_() {
		return searchListIotNodeStep_;
	}

	public void setSearchListIotNodeStep_(SearchList<IotNodeStep> searchListIotNodeStep_) {
		this.searchListIotNodeStep_ = searchListIotNodeStep_;
	}
	public static SearchList<IotNodeStep> staticSetSearchListIotNodeStep_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected IotNodeStepGenPage searchListIotNodeStep_Init() {
		Wrap<SearchList<IotNodeStep>> searchListIotNodeStep_Wrap = new Wrap<SearchList<IotNodeStep>>().var("searchListIotNodeStep_");
		if(searchListIotNodeStep_ == null) {
			_searchListIotNodeStep_(searchListIotNodeStep_Wrap);
			Optional.ofNullable(searchListIotNodeStep_Wrap.getO()).ifPresent(o -> {
				setSearchListIotNodeStep_(o);
			});
		}
		return (IotNodeStepGenPage)this;
	}

	/////////////////////
	// listIotNodeStep //
	/////////////////////


	/**	 The entity listIotNodeStep
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listIotNodeStep = new JsonArray();

	/**	<br> The entity listIotNodeStep
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepGenPage&fq=entiteVar_enUS_indexed_string:listIotNodeStep">Find the entity listIotNodeStep in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _listIotNodeStep(JsonArray l);

	public JsonArray getListIotNodeStep() {
		return listIotNodeStep;
	}

	public void setListIotNodeStep(JsonArray listIotNodeStep) {
		this.listIotNodeStep = listIotNodeStep;
	}
	@JsonIgnore
	public void setListIotNodeStep(String o) {
		this.listIotNodeStep = IotNodeStepGenPage.staticSetListIotNodeStep(siteRequest_, o);
	}
	public static JsonArray staticSetListIotNodeStep(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonArray(o);
		}
		return null;
	}
	protected IotNodeStepGenPage listIotNodeStepInit() {
		_listIotNodeStep(listIotNodeStep);
		return (IotNodeStepGenPage)this;
	}

	public static String staticSearchListIotNodeStep(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o.toString();
	}

	public static String staticSearchStrListIotNodeStep(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqListIotNodeStep(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStepGenPage.staticSearchStrListIotNodeStep(siteRequest_, IotNodeStepGenPage.staticSearchListIotNodeStep(siteRequest_, IotNodeStepGenPage.staticSetListIotNodeStep(siteRequest_, o)));
	}

	//////////////////////
	// iotNodeStepCount //
	//////////////////////


	/**	 The entity iotNodeStepCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer iotNodeStepCount;

	/**	<br> The entity iotNodeStepCount
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepGenPage&fq=entiteVar_enUS_indexed_string:iotNodeStepCount">Find the entity iotNodeStepCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _iotNodeStepCount(Wrap<Integer> w);

	public Integer getIotNodeStepCount() {
		return iotNodeStepCount;
	}

	public void setIotNodeStepCount(Integer iotNodeStepCount) {
		this.iotNodeStepCount = iotNodeStepCount;
	}
	@JsonIgnore
	public void setIotNodeStepCount(String o) {
		this.iotNodeStepCount = IotNodeStepGenPage.staticSetIotNodeStepCount(siteRequest_, o);
	}
	public static Integer staticSetIotNodeStepCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected IotNodeStepGenPage iotNodeStepCountInit() {
		Wrap<Integer> iotNodeStepCountWrap = new Wrap<Integer>().var("iotNodeStepCount");
		if(iotNodeStepCount == null) {
			_iotNodeStepCount(iotNodeStepCountWrap);
			Optional.ofNullable(iotNodeStepCountWrap.getO()).ifPresent(o -> {
				setIotNodeStepCount(o);
			});
		}
		return (IotNodeStepGenPage)this;
	}

	public static Integer staticSearchIotNodeStepCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrIotNodeStepCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqIotNodeStepCount(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStepGenPage.staticSearchStrIotNodeStepCount(siteRequest_, IotNodeStepGenPage.staticSearchIotNodeStepCount(siteRequest_, IotNodeStepGenPage.staticSetIotNodeStepCount(siteRequest_, o)));
	}

	//////////////////
	// iotNodeStep_ //
	//////////////////


	/**	 The entity iotNodeStep_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected IotNodeStep iotNodeStep_;

	/**	<br> The entity iotNodeStep_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepGenPage&fq=entiteVar_enUS_indexed_string:iotNodeStep_">Find the entity iotNodeStep_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _iotNodeStep_(Wrap<IotNodeStep> w);

	public IotNodeStep getIotNodeStep_() {
		return iotNodeStep_;
	}

	public void setIotNodeStep_(IotNodeStep iotNodeStep_) {
		this.iotNodeStep_ = iotNodeStep_;
	}
	public static IotNodeStep staticSetIotNodeStep_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected IotNodeStepGenPage iotNodeStep_Init() {
		Wrap<IotNodeStep> iotNodeStep_Wrap = new Wrap<IotNodeStep>().var("iotNodeStep_");
		if(iotNodeStep_ == null) {
			_iotNodeStep_(iotNodeStep_Wrap);
			Optional.ofNullable(iotNodeStep_Wrap.getO()).ifPresent(o -> {
				setIotNodeStep_(o);
			});
		}
		return (IotNodeStepGenPage)this;
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepGenPage&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = IotNodeStepGenPage.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected IotNodeStepGenPage idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			Optional.ofNullable(idWrap.getO()).ifPresent(o -> {
				setId(o);
			});
		}
		return (IotNodeStepGenPage)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStepGenPage.staticSearchStrId(siteRequest_, IotNodeStepGenPage.staticSearchId(siteRequest_, IotNodeStepGenPage.staticSetId(siteRequest_, o)));
	}

	////////////////////////
	// pageUriIotNodeStep //
	////////////////////////


	/**	 The entity pageUriIotNodeStep
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUriIotNodeStep;

	/**	<br> The entity pageUriIotNodeStep
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepGenPage&fq=entiteVar_enUS_indexed_string:pageUriIotNodeStep">Find the entity pageUriIotNodeStep in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUriIotNodeStep(Wrap<String> c);

	public String getPageUriIotNodeStep() {
		return pageUriIotNodeStep;
	}
	public void setPageUriIotNodeStep(String o) {
		this.pageUriIotNodeStep = IotNodeStepGenPage.staticSetPageUriIotNodeStep(siteRequest_, o);
	}
	public static String staticSetPageUriIotNodeStep(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected IotNodeStepGenPage pageUriIotNodeStepInit() {
		Wrap<String> pageUriIotNodeStepWrap = new Wrap<String>().var("pageUriIotNodeStep");
		if(pageUriIotNodeStep == null) {
			_pageUriIotNodeStep(pageUriIotNodeStepWrap);
			Optional.ofNullable(pageUriIotNodeStepWrap.getO()).ifPresent(o -> {
				setPageUriIotNodeStep(o);
			});
		}
		return (IotNodeStepGenPage)this;
	}

	public static String staticSearchPageUriIotNodeStep(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUriIotNodeStep(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUriIotNodeStep(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStepGenPage.staticSearchStrPageUriIotNodeStep(siteRequest_, IotNodeStepGenPage.staticSearchPageUriIotNodeStep(siteRequest_, IotNodeStepGenPage.staticSetPageUriIotNodeStep(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepIotNodeStepGenPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepIotNodeStepGenPage();
	}

	public Future<Void> promiseDeepIotNodeStepGenPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseIotNodeStepGenPage(promise2);
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

	public Future<Void> promiseIotNodeStepGenPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				searchListIotNodeStep_Init();
				listIotNodeStepInit();
				iotNodeStepCountInit();
				iotNodeStep_Init();
				idInit();
				pageUriIotNodeStepInit();
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
		return promiseDeepIotNodeStepGenPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestIotNodeStepGenPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestBaseResultPage(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestIotNodeStepGenPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainIotNodeStepGenPage(v);
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
	public Object obtainIotNodeStepGenPage(String var) {
		IotNodeStepGenPage oIotNodeStepGenPage = (IotNodeStepGenPage)this;
		switch(var) {
			case "searchListIotNodeStep_":
				return oIotNodeStepGenPage.searchListIotNodeStep_;
			case "listIotNodeStep":
				return oIotNodeStepGenPage.listIotNodeStep;
			case "iotNodeStepCount":
				return oIotNodeStepGenPage.iotNodeStepCount;
			case "iotNodeStep_":
				return oIotNodeStepGenPage.iotNodeStep_;
			case "id":
				return oIotNodeStepGenPage.id;
			case "pageUriIotNodeStep":
				return oIotNodeStepGenPage.pageUriIotNodeStep;
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
				o = relateIotNodeStepGenPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateIotNodeStepGenPage(String var, Object val) {
		IotNodeStepGenPage oIotNodeStepGenPage = (IotNodeStepGenPage)this;
		switch(var) {
			default:
				return super.relateBaseResultPage(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetIotNodeStepGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetIotNodeStepGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listIotNodeStep":
			return IotNodeStepGenPage.staticSetListIotNodeStep(siteRequest_, o);
		case "iotNodeStepCount":
			return IotNodeStepGenPage.staticSetIotNodeStepCount(siteRequest_, o);
		case "id":
			return IotNodeStepGenPage.staticSetId(siteRequest_, o);
		case "pageUriIotNodeStep":
			return IotNodeStepGenPage.staticSetPageUriIotNodeStep(siteRequest_, o);
			default:
				return BaseResultPage.staticSetBaseResultPage(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchIotNodeStepGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchIotNodeStepGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listIotNodeStep":
			return IotNodeStepGenPage.staticSearchListIotNodeStep(siteRequest_, (JsonArray)o);
		case "iotNodeStepCount":
			return IotNodeStepGenPage.staticSearchIotNodeStepCount(siteRequest_, (Integer)o);
		case "id":
			return IotNodeStepGenPage.staticSearchId(siteRequest_, (String)o);
		case "pageUriIotNodeStep":
			return IotNodeStepGenPage.staticSearchPageUriIotNodeStep(siteRequest_, (String)o);
			default:
				return BaseResultPage.staticSearchBaseResultPage(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrIotNodeStepGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrIotNodeStepGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listIotNodeStep":
			return IotNodeStepGenPage.staticSearchStrListIotNodeStep(siteRequest_, (String)o);
		case "iotNodeStepCount":
			return IotNodeStepGenPage.staticSearchStrIotNodeStepCount(siteRequest_, (Integer)o);
		case "id":
			return IotNodeStepGenPage.staticSearchStrId(siteRequest_, (String)o);
		case "pageUriIotNodeStep":
			return IotNodeStepGenPage.staticSearchStrPageUriIotNodeStep(siteRequest_, (String)o);
			default:
				return BaseResultPage.staticSearchStrBaseResultPage(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqIotNodeStepGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqIotNodeStepGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listIotNodeStep":
			return IotNodeStepGenPage.staticSearchFqListIotNodeStep(siteRequest_, o);
		case "iotNodeStepCount":
			return IotNodeStepGenPage.staticSearchFqIotNodeStepCount(siteRequest_, o);
		case "id":
			return IotNodeStepGenPage.staticSearchFqId(siteRequest_, o);
		case "pageUriIotNodeStep":
			return IotNodeStepGenPage.staticSearchFqPageUriIotNodeStep(siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "IotNodeStepGenPage";
	public static final String VAR_searchListIotNodeStep_ = "searchListIotNodeStep_";
	public static final String VAR_listIotNodeStep = "listIotNodeStep";
	public static final String VAR_iotNodeStepCount = "iotNodeStepCount";
	public static final String VAR_iotNodeStep_ = "iotNodeStep_";
	public static final String VAR_id = "id";
	public static final String VAR_pageUriIotNodeStep = "pageUriIotNodeStep";

	public static final String DISPLAY_NAME_searchListIotNodeStep_ = "";
	public static final String DISPLAY_NAME_listIotNodeStep = "";
	public static final String DISPLAY_NAME_iotNodeStepCount = "";
	public static final String DISPLAY_NAME_iotNodeStep_ = "";
	public static final String DISPLAY_NAME_id = "";
	public static final String DISPLAY_NAME_pageUriIotNodeStep = "";

	public static String displayNameForClass(String var) {
		return IotNodeStepGenPage.displayNameIotNodeStepGenPage(var);
	}
	public static String displayNameIotNodeStepGenPage(String var) {
		switch(var) {
		case VAR_searchListIotNodeStep_:
			return DISPLAY_NAME_searchListIotNodeStep_;
		case VAR_listIotNodeStep:
			return DISPLAY_NAME_listIotNodeStep;
		case VAR_iotNodeStepCount:
			return DISPLAY_NAME_iotNodeStepCount;
		case VAR_iotNodeStep_:
			return DISPLAY_NAME_iotNodeStep_;
		case VAR_id:
			return DISPLAY_NAME_id;
		case VAR_pageUriIotNodeStep:
			return DISPLAY_NAME_pageUriIotNodeStep;
		default:
			return BaseResultPage.displayNameBaseResultPage(var);
		}
	}
}
