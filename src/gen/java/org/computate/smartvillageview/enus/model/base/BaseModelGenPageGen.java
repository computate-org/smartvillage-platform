package org.computate.smartvillageview.enus.model.base;

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
import io.vertx.core.json.JsonArray;
import java.lang.Integer;
import java.lang.String;
import java.lang.Long;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;

/**	
<ol>
0<h3>Suggestions that can generate more code for you: </h3></ol>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these BaseModelGenPage objects in a RESTful API. 
 * </li><li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class BaseModelGenPageGen into the class BaseModelGenPage. 
 * </li>
 * <h3>About the BaseModelGenPage class and it's generated class BaseModelGenPageGen&lt;PageLayout&gt;: </h3>extends BaseModelGenPageGen
 * <p>
 * This Java class extends a generated Java class BaseModelGenPageGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.base.BaseModelGenPage">Find the class BaseModelGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends BaseModelGenPageGen<PageLayout>
 * <p>This <code>class BaseModelGenPage extends BaseModelGenPageGen&lt;PageLayout&gt;</code>, which means it extends a newly generated BaseModelGenPageGen. 
 * The generated <code>class BaseModelGenPageGen extends PageLayout</code> which means that BaseModelGenPage extends BaseModelGenPageGen which extends PageLayout. 
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
 * <p>By adding a class comment "{@inheritDoc}", the BaseModelGenPage class will inherit the helpful inherited class comments from the super class BaseModelGenPageGen. 
 * </p>
 * Rows: null
 * Model: true
 * Page: true
 * SuperPage.enUS: null
 * Promise: true
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the BaseModelGenPage Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * Delete the class BaseModelGenPage in Solr: 
 * curl 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.base.BaseModelGenPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.base in Solr: 
 * curl 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.base&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class BaseModelGenPageGen<DEV> extends PageLayout {
	protected static final Logger LOG = LoggerFactory.getLogger(BaseModelGenPage.class);

	//////////////////////////
	// searchListBaseModel_ //
	//////////////////////////


	/**	 The entity searchListBaseModel_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<BaseModel> searchListBaseModel_;

	/**	<br> The entity searchListBaseModel_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.base.BaseModelGenPage&fq=entiteVar_enUS_indexed_string:searchListBaseModel_">Find the entity searchListBaseModel_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchListBaseModel_(Wrap<SearchList<BaseModel>> w);

	public SearchList<BaseModel> getSearchListBaseModel_() {
		return searchListBaseModel_;
	}

	public void setSearchListBaseModel_(SearchList<BaseModel> searchListBaseModel_) {
		this.searchListBaseModel_ = searchListBaseModel_;
	}
	public static SearchList<BaseModel> staticSetSearchListBaseModel_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected BaseModelGenPage searchListBaseModel_Init() {
		Wrap<SearchList<BaseModel>> searchListBaseModel_Wrap = new Wrap<SearchList<BaseModel>>().var("searchListBaseModel_");
		if(searchListBaseModel_ == null) {
			_searchListBaseModel_(searchListBaseModel_Wrap);
			setSearchListBaseModel_(searchListBaseModel_Wrap.o);
		}
		return (BaseModelGenPage)this;
	}

	///////////////////
	// listBaseModel //
	///////////////////


	/**	 The entity listBaseModel
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listBaseModel = new JsonArray();

	/**	<br> The entity listBaseModel
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.base.BaseModelGenPage&fq=entiteVar_enUS_indexed_string:listBaseModel">Find the entity listBaseModel in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _listBaseModel(JsonArray l);

	public JsonArray getListBaseModel() {
		return listBaseModel;
	}

	public void setListBaseModel(JsonArray listBaseModel) {
		this.listBaseModel = listBaseModel;
	}
	@JsonIgnore
	public void setListBaseModel(String o) {
		this.listBaseModel = BaseModelGenPage.staticSetListBaseModel(siteRequest_, o);
	}
	public static JsonArray staticSetListBaseModel(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonArray(o);
		}
		return null;
	}
	protected BaseModelGenPage listBaseModelInit() {
		_listBaseModel(listBaseModel);
		return (BaseModelGenPage)this;
	}

	public static JsonArray staticSearchListBaseModel(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o;
	}

	public static String staticSearchStrListBaseModel(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqListBaseModel(SiteRequestEnUS siteRequest_, String o) {
		return BaseModelGenPage.staticSearchStrListBaseModel(siteRequest_, BaseModelGenPage.staticSearchListBaseModel(siteRequest_, BaseModelGenPage.staticSetListBaseModel(siteRequest_, o)));
	}

	////////////////////
	// baseModelCount //
	////////////////////


	/**	 The entity baseModelCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer baseModelCount;

	/**	<br> The entity baseModelCount
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.base.BaseModelGenPage&fq=entiteVar_enUS_indexed_string:baseModelCount">Find the entity baseModelCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _baseModelCount(Wrap<Integer> w);

	public Integer getBaseModelCount() {
		return baseModelCount;
	}

	public void setBaseModelCount(Integer baseModelCount) {
		this.baseModelCount = baseModelCount;
	}
	@JsonIgnore
	public void setBaseModelCount(String o) {
		this.baseModelCount = BaseModelGenPage.staticSetBaseModelCount(siteRequest_, o);
	}
	public static Integer staticSetBaseModelCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected BaseModelGenPage baseModelCountInit() {
		Wrap<Integer> baseModelCountWrap = new Wrap<Integer>().var("baseModelCount");
		if(baseModelCount == null) {
			_baseModelCount(baseModelCountWrap);
			setBaseModelCount(baseModelCountWrap.o);
		}
		return (BaseModelGenPage)this;
	}

	public static Integer staticSearchBaseModelCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrBaseModelCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqBaseModelCount(SiteRequestEnUS siteRequest_, String o) {
		return BaseModelGenPage.staticSearchStrBaseModelCount(siteRequest_, BaseModelGenPage.staticSearchBaseModelCount(siteRequest_, BaseModelGenPage.staticSetBaseModelCount(siteRequest_, o)));
	}

	////////////////
	// baseModel_ //
	////////////////


	/**	 The entity baseModel_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected BaseModel baseModel_;

	/**	<br> The entity baseModel_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.base.BaseModelGenPage&fq=entiteVar_enUS_indexed_string:baseModel_">Find the entity baseModel_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _baseModel_(Wrap<BaseModel> w);

	public BaseModel getBaseModel_() {
		return baseModel_;
	}

	public void setBaseModel_(BaseModel baseModel_) {
		this.baseModel_ = baseModel_;
	}
	public static BaseModel staticSetBaseModel_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected BaseModelGenPage baseModel_Init() {
		Wrap<BaseModel> baseModel_Wrap = new Wrap<BaseModel>().var("baseModel_");
		if(baseModel_ == null) {
			_baseModel_(baseModel_Wrap);
			setBaseModel_(baseModel_Wrap.o);
		}
		return (BaseModelGenPage)this;
	}

	////////
	// pk //
	////////


	/**	 The entity pk
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long pk;

	/**	<br> The entity pk
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.base.BaseModelGenPage&fq=entiteVar_enUS_indexed_string:pk">Find the entity pk in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pk(Wrap<Long> w);

	public Long getPk() {
		return pk;
	}

	public void setPk(Long pk) {
		this.pk = pk;
	}
	@JsonIgnore
	public void setPk(String o) {
		this.pk = BaseModelGenPage.staticSetPk(siteRequest_, o);
	}
	public static Long staticSetPk(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected BaseModelGenPage pkInit() {
		Wrap<Long> pkWrap = new Wrap<Long>().var("pk");
		if(pk == null) {
			_pk(pkWrap);
			setPk(pkWrap.o);
		}
		return (BaseModelGenPage)this;
	}

	public static Long staticSearchPk(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrPk(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPk(SiteRequestEnUS siteRequest_, String o) {
		return BaseModelGenPage.staticSearchStrPk(siteRequest_, BaseModelGenPage.staticSearchPk(siteRequest_, BaseModelGenPage.staticSetPk(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.base.BaseModelGenPage&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = BaseModelGenPage.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected BaseModelGenPage idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			setId(idWrap.o);
		}
		return (BaseModelGenPage)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return BaseModelGenPage.staticSearchStrId(siteRequest_, BaseModelGenPage.staticSearchId(siteRequest_, BaseModelGenPage.staticSetId(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepBaseModelGenPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepBaseModelGenPage();
	}

	public Future<Void> promiseDeepBaseModelGenPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseBaseModelGenPage(promise2);
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

	public Future<Void> promiseBaseModelGenPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				searchListBaseModel_Init();
				listBaseModelInit();
				baseModelCountInit();
				baseModel_Init();
				pkInit();
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
		return promiseDeepBaseModelGenPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestBaseModelGenPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestPageLayout(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestBaseModelGenPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainBaseModelGenPage(v);
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
	public Object obtainBaseModelGenPage(String var) {
		BaseModelGenPage oBaseModelGenPage = (BaseModelGenPage)this;
		switch(var) {
			case "searchListBaseModel_":
				return oBaseModelGenPage.searchListBaseModel_;
			case "listBaseModel":
				return oBaseModelGenPage.listBaseModel;
			case "baseModelCount":
				return oBaseModelGenPage.baseModelCount;
			case "baseModel_":
				return oBaseModelGenPage.baseModel_;
			case "pk":
				return oBaseModelGenPage.pk;
			case "id":
				return oBaseModelGenPage.id;
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
				o = relateBaseModelGenPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateBaseModelGenPage(String var, Object val) {
		BaseModelGenPage oBaseModelGenPage = (BaseModelGenPage)this;
		switch(var) {
			default:
				return super.relatePageLayout(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetBaseModelGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetBaseModelGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listBaseModel":
			return BaseModelGenPage.staticSetListBaseModel(siteRequest_, o);
		case "baseModelCount":
			return BaseModelGenPage.staticSetBaseModelCount(siteRequest_, o);
		case "pk":
			return BaseModelGenPage.staticSetPk(siteRequest_, o);
		case "id":
			return BaseModelGenPage.staticSetId(siteRequest_, o);
			default:
				return PageLayout.staticSetPageLayout(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchBaseModelGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchBaseModelGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listBaseModel":
			return BaseModelGenPage.staticSearchListBaseModel(siteRequest_, (JsonArray)o);
		case "baseModelCount":
			return BaseModelGenPage.staticSearchBaseModelCount(siteRequest_, (Integer)o);
		case "pk":
			return BaseModelGenPage.staticSearchPk(siteRequest_, (Long)o);
		case "id":
			return BaseModelGenPage.staticSearchId(siteRequest_, (String)o);
			default:
				return PageLayout.staticSearchPageLayout(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrBaseModelGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrBaseModelGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listBaseModel":
			return BaseModelGenPage.staticSearchStrListBaseModel(siteRequest_, (JsonArray)o);
		case "baseModelCount":
			return BaseModelGenPage.staticSearchStrBaseModelCount(siteRequest_, (Integer)o);
		case "pk":
			return BaseModelGenPage.staticSearchStrPk(siteRequest_, (Long)o);
		case "id":
			return BaseModelGenPage.staticSearchStrId(siteRequest_, (String)o);
			default:
				return PageLayout.staticSearchStrPageLayout(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqBaseModelGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqBaseModelGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listBaseModel":
			return BaseModelGenPage.staticSearchFqListBaseModel(siteRequest_, o);
		case "baseModelCount":
			return BaseModelGenPage.staticSearchFqBaseModelCount(siteRequest_, o);
		case "pk":
			return BaseModelGenPage.staticSearchFqPk(siteRequest_, o);
		case "id":
			return BaseModelGenPage.staticSearchFqId(siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "BaseModelGenPage";
	public static final String VAR_searchListBaseModel_ = "searchListBaseModel_";
	public static final String VAR_listBaseModel = "listBaseModel";
	public static final String VAR_baseModelCount = "baseModelCount";
	public static final String VAR_baseModel_ = "baseModel_";
	public static final String VAR_pk = "pk";
	public static final String VAR_id = "id";

	public static final String DISPLAY_NAME_searchListBaseModel_ = "";
	public static final String DISPLAY_NAME_listBaseModel = "";
	public static final String DISPLAY_NAME_baseModelCount = "";
	public static final String DISPLAY_NAME_baseModel_ = "";
	public static final String DISPLAY_NAME_pk = "";
	public static final String DISPLAY_NAME_id = "";

	public static String displayNameForClass(String var) {
		return BaseModelGenPage.displayNameBaseModelGenPage(var);
	}
	public static String displayNameBaseModelGenPage(String var) {
		switch(var) {
		case VAR_searchListBaseModel_:
			return DISPLAY_NAME_searchListBaseModel_;
		case VAR_listBaseModel:
			return DISPLAY_NAME_listBaseModel;
		case VAR_baseModelCount:
			return DISPLAY_NAME_baseModelCount;
		case VAR_baseModel_:
			return DISPLAY_NAME_baseModel_;
		case VAR_pk:
			return DISPLAY_NAME_pk;
		case VAR_id:
			return DISPLAY_NAME_id;
		default:
			return PageLayout.displayNamePageLayout(var);
		}
	}
}
