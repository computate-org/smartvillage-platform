package org.computate.smartvillageview.enus.model.iotnode;

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
import org.computate.smartvillageview.enus.model.base.BaseModelPage;
import org.computate.vertx.search.list.SearchList;
import org.computate.smartvillageview.enus.model.iotnode.IotNode;
import io.vertx.core.json.JsonArray;
import java.lang.Integer;
import java.lang.String;
import java.lang.Long;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;

/**	
 * <h1>Suggestions that can generate more code for you: </h1>
 * <ol>
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class IotNodeGenPageGen into the class IotNodeGenPage. 
 * </li>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these IotNodeGenPage objects in a RESTful API. 
 * </li>
 * </ol>
 * <h1>About the IotNodeGenPage class and it's generated class IotNodeGenPageGen&lt;BaseModelPage&gt;: </h1>
 * <p>
 * This Java class extends a generated Java class built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNodeGenPage">Find the class IotNodeGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * <p>
 * Delete the class IotNodeGenPage in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNodeGenPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.iotnode in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smart-village-view in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smart\-village\-view&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class IotNodeGenPageGen<DEV> extends BaseModelPage {
	protected static final Logger LOG = LoggerFactory.getLogger(IotNodeGenPage.class);

	////////////////////////
	// searchListIotNode_ //
	////////////////////////

	/**	 The entity searchListIotNode_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<IotNode> searchListIotNode_;

	/**	<br> The entity searchListIotNode_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNodeGenPage&fq=entiteVar_enUS_indexed_string:searchListIotNode_">Find the entity searchListIotNode_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchListIotNode_(Wrap<SearchList<IotNode>> w);

	public SearchList<IotNode> getSearchListIotNode_() {
		return searchListIotNode_;
	}

	public void setSearchListIotNode_(SearchList<IotNode> searchListIotNode_) {
		this.searchListIotNode_ = searchListIotNode_;
	}
	public static SearchList<IotNode> staticSetSearchListIotNode_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected IotNodeGenPage searchListIotNode_Init() {
		Wrap<SearchList<IotNode>> searchListIotNode_Wrap = new Wrap<SearchList<IotNode>>().var("searchListIotNode_");
		if(searchListIotNode_ == null) {
			_searchListIotNode_(searchListIotNode_Wrap);
			setSearchListIotNode_(searchListIotNode_Wrap.o);
		}
		return (IotNodeGenPage)this;
	}

	/////////////////
	// listIotNode //
	/////////////////

	/**	 The entity listIotNode
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listIotNode = new JsonArray();

	/**	<br> The entity listIotNode
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNodeGenPage&fq=entiteVar_enUS_indexed_string:listIotNode">Find the entity listIotNode in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _listIotNode(JsonArray l);

	public JsonArray getListIotNode() {
		return listIotNode;
	}

	public void setListIotNode(JsonArray listIotNode) {
		this.listIotNode = listIotNode;
	}
	public static JsonArray staticSetListIotNode(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected IotNodeGenPage listIotNodeInit() {
		_listIotNode(listIotNode);
		return (IotNodeGenPage)this;
	}

	//////////////////
	// iotNodeCount //
	//////////////////

	/**	 The entity iotNodeCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer iotNodeCount;

	/**	<br> The entity iotNodeCount
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNodeGenPage&fq=entiteVar_enUS_indexed_string:iotNodeCount">Find the entity iotNodeCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _iotNodeCount(Wrap<Integer> w);

	public Integer getIotNodeCount() {
		return iotNodeCount;
	}

	public void setIotNodeCount(Integer iotNodeCount) {
		this.iotNodeCount = iotNodeCount;
	}
	@JsonIgnore
	public void setIotNodeCount(String o) {
		this.iotNodeCount = IotNodeGenPage.staticSetIotNodeCount(siteRequest_, o);
	}
	public static Integer staticSetIotNodeCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected IotNodeGenPage iotNodeCountInit() {
		Wrap<Integer> iotNodeCountWrap = new Wrap<Integer>().var("iotNodeCount");
		if(iotNodeCount == null) {
			_iotNodeCount(iotNodeCountWrap);
			setIotNodeCount(iotNodeCountWrap.o);
		}
		return (IotNodeGenPage)this;
	}

	public static Integer staticSearchIotNodeCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrIotNodeCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqIotNodeCount(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeGenPage.staticSearchStrIotNodeCount(siteRequest_, IotNodeGenPage.staticSearchIotNodeCount(siteRequest_, IotNodeGenPage.staticSetIotNodeCount(siteRequest_, o)));
	}

	//////////////
	// iotNode_ //
	//////////////

	/**	 The entity iotNode_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected IotNode iotNode_;

	/**	<br> The entity iotNode_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNodeGenPage&fq=entiteVar_enUS_indexed_string:iotNode_">Find the entity iotNode_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _iotNode_(Wrap<IotNode> w);

	public IotNode getIotNode_() {
		return iotNode_;
	}

	public void setIotNode_(IotNode iotNode_) {
		this.iotNode_ = iotNode_;
	}
	public static IotNode staticSetIotNode_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected IotNodeGenPage iotNode_Init() {
		Wrap<IotNode> iotNode_Wrap = new Wrap<IotNode>().var("iotNode_");
		if(iotNode_ == null) {
			_iotNode_(iotNode_Wrap);
			setIotNode_(iotNode_Wrap.o);
		}
		return (IotNodeGenPage)this;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNodeGenPage&fq=entiteVar_enUS_indexed_string:pk">Find the entity pk in Solr</a>
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
		this.pk = IotNodeGenPage.staticSetPk(siteRequest_, o);
	}
	public static Long staticSetPk(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected IotNodeGenPage pkInit() {
		Wrap<Long> pkWrap = new Wrap<Long>().var("pk");
		if(pk == null) {
			_pk(pkWrap);
			setPk(pkWrap.o);
		}
		return (IotNodeGenPage)this;
	}

	public static Long staticSearchPk(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrPk(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPk(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeGenPage.staticSearchStrPk(siteRequest_, IotNodeGenPage.staticSearchPk(siteRequest_, IotNodeGenPage.staticSetPk(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNodeGenPage&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = IotNodeGenPage.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected IotNodeGenPage idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			setId(idWrap.o);
		}
		return (IotNodeGenPage)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeGenPage.staticSearchStrId(siteRequest_, IotNodeGenPage.staticSearchId(siteRequest_, IotNodeGenPage.staticSetId(siteRequest_, o)));
	}

	////////////////////
	// pageUriIotNode //
	////////////////////

	/**	 The entity pageUriIotNode
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUriIotNode;

	/**	<br> The entity pageUriIotNode
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNodeGenPage&fq=entiteVar_enUS_indexed_string:pageUriIotNode">Find the entity pageUriIotNode in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUriIotNode(Wrap<String> c);

	public String getPageUriIotNode() {
		return pageUriIotNode;
	}
	public void setPageUriIotNode(String o) {
		this.pageUriIotNode = IotNodeGenPage.staticSetPageUriIotNode(siteRequest_, o);
	}
	public static String staticSetPageUriIotNode(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected IotNodeGenPage pageUriIotNodeInit() {
		Wrap<String> pageUriIotNodeWrap = new Wrap<String>().var("pageUriIotNode");
		if(pageUriIotNode == null) {
			_pageUriIotNode(pageUriIotNodeWrap);
			setPageUriIotNode(pageUriIotNodeWrap.o);
		}
		return (IotNodeGenPage)this;
	}

	public static String staticSearchPageUriIotNode(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUriIotNode(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUriIotNode(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeGenPage.staticSearchStrPageUriIotNode(siteRequest_, IotNodeGenPage.staticSearchPageUriIotNode(siteRequest_, IotNodeGenPage.staticSetPageUriIotNode(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepIotNodeGenPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepIotNodeGenPage();
	}

	public Future<Void> promiseDeepIotNodeGenPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseIotNodeGenPage(promise2);
		promise2.future().onSuccess(a -> {
			super.promiseDeepBaseModelPage(siteRequest_).onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseIotNodeGenPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				searchListIotNode_Init();
				listIotNodeInit();
				iotNodeCountInit();
				iotNode_Init();
				pkInit();
				idInit();
				pageUriIotNodeInit();
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
		return promiseDeepIotNodeGenPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestIotNodeGenPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestBaseModelPage(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestIotNodeGenPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainIotNodeGenPage(v);
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
	public Object obtainIotNodeGenPage(String var) {
		IotNodeGenPage oIotNodeGenPage = (IotNodeGenPage)this;
		switch(var) {
			case "searchListIotNode_":
				return oIotNodeGenPage.searchListIotNode_;
			case "listIotNode":
				return oIotNodeGenPage.listIotNode;
			case "iotNodeCount":
				return oIotNodeGenPage.iotNodeCount;
			case "iotNode_":
				return oIotNodeGenPage.iotNode_;
			case "pk":
				return oIotNodeGenPage.pk;
			case "id":
				return oIotNodeGenPage.id;
			case "pageUriIotNode":
				return oIotNodeGenPage.pageUriIotNode;
			default:
				return super.obtainBaseModelPage(var);
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
				o = relateIotNodeGenPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateIotNodeGenPage(String var, Object val) {
		IotNodeGenPage oIotNodeGenPage = (IotNodeGenPage)this;
		switch(var) {
			default:
				return super.relateBaseModelPage(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetIotNodeGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetIotNodeGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "iotNodeCount":
			return IotNodeGenPage.staticSetIotNodeCount(siteRequest_, o);
		case "pk":
			return IotNodeGenPage.staticSetPk(siteRequest_, o);
		case "id":
			return IotNodeGenPage.staticSetId(siteRequest_, o);
		case "pageUriIotNode":
			return IotNodeGenPage.staticSetPageUriIotNode(siteRequest_, o);
			default:
				return BaseModelPage.staticSetBaseModelPage(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchIotNodeGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchIotNodeGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "iotNodeCount":
			return IotNodeGenPage.staticSearchIotNodeCount(siteRequest_, (Integer)o);
		case "pk":
			return IotNodeGenPage.staticSearchPk(siteRequest_, (Long)o);
		case "id":
			return IotNodeGenPage.staticSearchId(siteRequest_, (String)o);
		case "pageUriIotNode":
			return IotNodeGenPage.staticSearchPageUriIotNode(siteRequest_, (String)o);
			default:
				return BaseModelPage.staticSearchBaseModelPage(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrIotNodeGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrIotNodeGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "iotNodeCount":
			return IotNodeGenPage.staticSearchStrIotNodeCount(siteRequest_, (Integer)o);
		case "pk":
			return IotNodeGenPage.staticSearchStrPk(siteRequest_, (Long)o);
		case "id":
			return IotNodeGenPage.staticSearchStrId(siteRequest_, (String)o);
		case "pageUriIotNode":
			return IotNodeGenPage.staticSearchStrPageUriIotNode(siteRequest_, (String)o);
			default:
				return BaseModelPage.staticSearchStrBaseModelPage(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqIotNodeGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqIotNodeGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "iotNodeCount":
			return IotNodeGenPage.staticSearchFqIotNodeCount(siteRequest_, o);
		case "pk":
			return IotNodeGenPage.staticSearchFqPk(siteRequest_, o);
		case "id":
			return IotNodeGenPage.staticSearchFqId(siteRequest_, o);
		case "pageUriIotNode":
			return IotNodeGenPage.staticSearchFqPageUriIotNode(siteRequest_, o);
			default:
				return BaseModelPage.staticSearchFqBaseModelPage(entityVar,  siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "IotNodeGenPage";
	public static final String VAR_searchListIotNode_ = "searchListIotNode_";
	public static final String VAR_listIotNode = "listIotNode";
	public static final String VAR_iotNodeCount = "iotNodeCount";
	public static final String VAR_iotNode_ = "iotNode_";
	public static final String VAR_pk = "pk";
	public static final String VAR_id = "id";
	public static final String VAR_pageUriIotNode = "pageUriIotNode";

	public static final String DISPLAY_NAME_searchListIotNode_ = "";
	public static final String DISPLAY_NAME_listIotNode = "";
	public static final String DISPLAY_NAME_iotNodeCount = "";
	public static final String DISPLAY_NAME_iotNode_ = "";
	public static final String DISPLAY_NAME_pk = "";
	public static final String DISPLAY_NAME_id = "";
	public static final String DISPLAY_NAME_pageUriIotNode = "";

	public static String displayNameForClass(String var) {
		return IotNodeGenPage.displayNameIotNodeGenPage(var);
	}
	public static String displayNameIotNodeGenPage(String var) {
		switch(var) {
		case VAR_searchListIotNode_:
			return DISPLAY_NAME_searchListIotNode_;
		case VAR_listIotNode:
			return DISPLAY_NAME_listIotNode;
		case VAR_iotNodeCount:
			return DISPLAY_NAME_iotNodeCount;
		case VAR_iotNode_:
			return DISPLAY_NAME_iotNode_;
		case VAR_pk:
			return DISPLAY_NAME_pk;
		case VAR_id:
			return DISPLAY_NAME_id;
		case VAR_pageUriIotNode:
			return DISPLAY_NAME_pageUriIotNode;
		default:
			return BaseModelPage.displayNameBaseModelPage(var);
		}
	}
}
