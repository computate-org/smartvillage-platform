package org.computate.smartvillageview.enus.result.base;

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
import org.computate.smartvillageview.enus.result.base.BaseResult;
import io.vertx.core.json.JsonArray;
import java.lang.Integer;
import java.lang.String;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;

/**	
<ol>
0<h3>Suggestions that can generate more code for you: </h3></ol>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these BaseResultGenPage objects in a RESTful API. 
 * </li><li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class BaseResultGenPageGen into the class BaseResultGenPage. 
 * </li>
 * <h3>About the BaseResultGenPage class and it's generated class BaseResultGenPageGen&lt;PageLayout&gt;: </h3>extends BaseResultGenPageGen
 * <p>
 * This Java class extends a generated Java class BaseResultGenPageGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage">Find the class BaseResultGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends BaseResultGenPageGen<PageLayout>
 * <p>This <code>class BaseResultGenPage extends BaseResultGenPageGen&lt;PageLayout&gt;</code>, which means it extends a newly generated BaseResultGenPageGen. 
 * The generated <code>class BaseResultGenPageGen extends PageLayout</code> which means that BaseResultGenPage extends BaseResultGenPageGen which extends PageLayout. 
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
 * <p>By adding a class comment "{@inheritDoc}", the BaseResultGenPage class will inherit the helpful inherited class comments from the super class BaseResultGenPageGen. 
 * </p>
 * Rows: null
 * Model: true
 * Page: true
 * SuperPage.enUS: null
 * Promise: true
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the BaseResultGenPage Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * Delete the class BaseResultGenPage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.result.base in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.result.base&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class BaseResultGenPageGen<DEV> extends PageLayout {
	protected static final Logger LOG = LoggerFactory.getLogger(BaseResultGenPage.class);

	///////////////////////////
	// searchListBaseResult_ //
	///////////////////////////


	/**	 The entity searchListBaseResult_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<BaseResult> searchListBaseResult_;

	/**	<br> The entity searchListBaseResult_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage&fq=entiteVar_enUS_indexed_string:searchListBaseResult_">Find the entity searchListBaseResult_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchListBaseResult_(Wrap<SearchList<BaseResult>> w);

	public SearchList<BaseResult> getSearchListBaseResult_() {
		return searchListBaseResult_;
	}

	public void setSearchListBaseResult_(SearchList<BaseResult> searchListBaseResult_) {
		this.searchListBaseResult_ = searchListBaseResult_;
	}
	public static SearchList<BaseResult> staticSetSearchListBaseResult_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected BaseResultGenPage searchListBaseResult_Init() {
		Wrap<SearchList<BaseResult>> searchListBaseResult_Wrap = new Wrap<SearchList<BaseResult>>().var("searchListBaseResult_");
		if(searchListBaseResult_ == null) {
			_searchListBaseResult_(searchListBaseResult_Wrap);
			setSearchListBaseResult_(searchListBaseResult_Wrap.o);
		}
		return (BaseResultGenPage)this;
	}

	////////////////////
	// listBaseResult //
	////////////////////


	/**	 The entity listBaseResult
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listBaseResult = new JsonArray();

	/**	<br> The entity listBaseResult
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage&fq=entiteVar_enUS_indexed_string:listBaseResult">Find the entity listBaseResult in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _listBaseResult(JsonArray l);

	public JsonArray getListBaseResult() {
		return listBaseResult;
	}

	public void setListBaseResult(JsonArray listBaseResult) {
		this.listBaseResult = listBaseResult;
	}
	@JsonIgnore
	public void setListBaseResult(String o) {
		this.listBaseResult = BaseResultGenPage.staticSetListBaseResult(siteRequest_, o);
	}
	public static JsonArray staticSetListBaseResult(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonArray(o);
		}
		return null;
	}
	protected BaseResultGenPage listBaseResultInit() {
		_listBaseResult(listBaseResult);
		return (BaseResultGenPage)this;
	}

	public static JsonArray staticSearchListBaseResult(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o;
	}

	public static String staticSearchStrListBaseResult(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqListBaseResult(SiteRequestEnUS siteRequest_, String o) {
		return BaseResultGenPage.staticSearchStrListBaseResult(siteRequest_, BaseResultGenPage.staticSearchListBaseResult(siteRequest_, BaseResultGenPage.staticSetListBaseResult(siteRequest_, o)));
	}

	/////////////////////
	// baseResultCount //
	/////////////////////


	/**	 The entity baseResultCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer baseResultCount;

	/**	<br> The entity baseResultCount
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage&fq=entiteVar_enUS_indexed_string:baseResultCount">Find the entity baseResultCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _baseResultCount(Wrap<Integer> w);

	public Integer getBaseResultCount() {
		return baseResultCount;
	}

	public void setBaseResultCount(Integer baseResultCount) {
		this.baseResultCount = baseResultCount;
	}
	@JsonIgnore
	public void setBaseResultCount(String o) {
		this.baseResultCount = BaseResultGenPage.staticSetBaseResultCount(siteRequest_, o);
	}
	public static Integer staticSetBaseResultCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected BaseResultGenPage baseResultCountInit() {
		Wrap<Integer> baseResultCountWrap = new Wrap<Integer>().var("baseResultCount");
		if(baseResultCount == null) {
			_baseResultCount(baseResultCountWrap);
			setBaseResultCount(baseResultCountWrap.o);
		}
		return (BaseResultGenPage)this;
	}

	public static Integer staticSearchBaseResultCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrBaseResultCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqBaseResultCount(SiteRequestEnUS siteRequest_, String o) {
		return BaseResultGenPage.staticSearchStrBaseResultCount(siteRequest_, BaseResultGenPage.staticSearchBaseResultCount(siteRequest_, BaseResultGenPage.staticSetBaseResultCount(siteRequest_, o)));
	}

	/////////////////
	// baseResult_ //
	/////////////////


	/**	 The entity baseResult_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected BaseResult baseResult_;

	/**	<br> The entity baseResult_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage&fq=entiteVar_enUS_indexed_string:baseResult_">Find the entity baseResult_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _baseResult_(Wrap<BaseResult> w);

	public BaseResult getBaseResult_() {
		return baseResult_;
	}

	public void setBaseResult_(BaseResult baseResult_) {
		this.baseResult_ = baseResult_;
	}
	public static BaseResult staticSetBaseResult_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected BaseResultGenPage baseResult_Init() {
		Wrap<BaseResult> baseResult_Wrap = new Wrap<BaseResult>().var("baseResult_");
		if(baseResult_ == null) {
			_baseResult_(baseResult_Wrap);
			setBaseResult_(baseResult_Wrap.o);
		}
		return (BaseResultGenPage)this;
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = BaseResultGenPage.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected BaseResultGenPage idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			setId(idWrap.o);
		}
		return (BaseResultGenPage)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return BaseResultGenPage.staticSearchStrId(siteRequest_, BaseResultGenPage.staticSearchId(siteRequest_, BaseResultGenPage.staticSetId(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepBaseResultGenPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepBaseResultGenPage();
	}

	public Future<Void> promiseDeepBaseResultGenPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseBaseResultGenPage(promise2);
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

	public Future<Void> promiseBaseResultGenPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				searchListBaseResult_Init();
				listBaseResultInit();
				baseResultCountInit();
				baseResult_Init();
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
		return promiseDeepBaseResultGenPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestBaseResultGenPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestPageLayout(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestBaseResultGenPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainBaseResultGenPage(v);
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
	public Object obtainBaseResultGenPage(String var) {
		BaseResultGenPage oBaseResultGenPage = (BaseResultGenPage)this;
		switch(var) {
			case "searchListBaseResult_":
				return oBaseResultGenPage.searchListBaseResult_;
			case "listBaseResult":
				return oBaseResultGenPage.listBaseResult;
			case "baseResultCount":
				return oBaseResultGenPage.baseResultCount;
			case "baseResult_":
				return oBaseResultGenPage.baseResult_;
			case "id":
				return oBaseResultGenPage.id;
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
				o = relateBaseResultGenPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateBaseResultGenPage(String var, Object val) {
		BaseResultGenPage oBaseResultGenPage = (BaseResultGenPage)this;
		switch(var) {
			default:
				return super.relatePageLayout(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetBaseResultGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetBaseResultGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listBaseResult":
			return BaseResultGenPage.staticSetListBaseResult(siteRequest_, o);
		case "baseResultCount":
			return BaseResultGenPage.staticSetBaseResultCount(siteRequest_, o);
		case "id":
			return BaseResultGenPage.staticSetId(siteRequest_, o);
			default:
				return PageLayout.staticSetPageLayout(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchBaseResultGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchBaseResultGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listBaseResult":
			return BaseResultGenPage.staticSearchListBaseResult(siteRequest_, (JsonArray)o);
		case "baseResultCount":
			return BaseResultGenPage.staticSearchBaseResultCount(siteRequest_, (Integer)o);
		case "id":
			return BaseResultGenPage.staticSearchId(siteRequest_, (String)o);
			default:
				return PageLayout.staticSearchPageLayout(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrBaseResultGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrBaseResultGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listBaseResult":
			return BaseResultGenPage.staticSearchStrListBaseResult(siteRequest_, (JsonArray)o);
		case "baseResultCount":
			return BaseResultGenPage.staticSearchStrBaseResultCount(siteRequest_, (Integer)o);
		case "id":
			return BaseResultGenPage.staticSearchStrId(siteRequest_, (String)o);
			default:
				return PageLayout.staticSearchStrPageLayout(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqBaseResultGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqBaseResultGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listBaseResult":
			return BaseResultGenPage.staticSearchFqListBaseResult(siteRequest_, o);
		case "baseResultCount":
			return BaseResultGenPage.staticSearchFqBaseResultCount(siteRequest_, o);
		case "id":
			return BaseResultGenPage.staticSearchFqId(siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "BaseResultGenPage";
	public static final String VAR_searchListBaseResult_ = "searchListBaseResult_";
	public static final String VAR_listBaseResult = "listBaseResult";
	public static final String VAR_baseResultCount = "baseResultCount";
	public static final String VAR_baseResult_ = "baseResult_";
	public static final String VAR_id = "id";

	public static final String DISPLAY_NAME_searchListBaseResult_ = "";
	public static final String DISPLAY_NAME_listBaseResult = "";
	public static final String DISPLAY_NAME_baseResultCount = "";
	public static final String DISPLAY_NAME_baseResult_ = "";
	public static final String DISPLAY_NAME_id = "";

	public static String displayNameForClass(String var) {
		return BaseResultGenPage.displayNameBaseResultGenPage(var);
	}
	public static String displayNameBaseResultGenPage(String var) {
		switch(var) {
		case VAR_searchListBaseResult_:
			return DISPLAY_NAME_searchListBaseResult_;
		case VAR_listBaseResult:
			return DISPLAY_NAME_listBaseResult;
		case VAR_baseResultCount:
			return DISPLAY_NAME_baseResultCount;
		case VAR_baseResult_:
			return DISPLAY_NAME_baseResult_;
		case VAR_id:
			return DISPLAY_NAME_id;
		default:
			return PageLayout.displayNamePageLayout(var);
		}
	}
}
