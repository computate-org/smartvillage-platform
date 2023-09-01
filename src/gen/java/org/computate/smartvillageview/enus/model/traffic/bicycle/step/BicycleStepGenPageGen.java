package org.computate.smartvillageview.enus.model.traffic.bicycle.step;

import org.computate.smartvillageview.enus.request.SiteRequestEnUS;
import org.computate.smartvillageview.enus.model.base.BaseModel;
import org.computate.vertx.api.ApiRequest;
import org.computate.smartvillageview.enus.config.ConfigKeys;
import java.util.Optional;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
import org.computate.smartvillageview.enus.model.traffic.bicycle.step.BicycleStep;
import io.vertx.core.json.JsonArray;
import java.lang.Integer;
import java.lang.String;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;

/**	
<ol>
0<h3>Suggestions that can generate more code for you: </h3></ol>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these BicycleStepGenPage objects in a RESTful API. 
 * </li><li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class BicycleStepGenPageGen into the class BicycleStepGenPage. 
 * </li>
 * <h3>About the BicycleStepGenPage class and it's generated class BicycleStepGenPageGen&lt;MapResultPage&gt;: </h3>extends BicycleStepGenPageGen
 * <p>
 * This Java class extends a generated Java class BicycleStepGenPageGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.bicycle.step.BicycleStepGenPage">Find the class BicycleStepGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends BicycleStepGenPageGen<MapResultPage>
 * <p>This <code>class BicycleStepGenPage extends BicycleStepGenPageGen&lt;MapResultPage&gt;</code>, which means it extends a newly generated BicycleStepGenPageGen. 
 * The generated <code>class BicycleStepGenPageGen extends MapResultPage</code> which means that BicycleStepGenPage extends BicycleStepGenPageGen which extends MapResultPage. 
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
 * <p>By adding a class comment "{@inheritDoc}", the BicycleStepGenPage class will inherit the helpful inherited class comments from the super class BicycleStepGenPageGen. 
 * </p>
 * Rows: null
 * Model: true
 * Page: true
 * SuperPage.enUS: null
 * Promise: true
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the BicycleStepGenPage Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * Delete the class BicycleStepGenPage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.bicycle.step.BicycleStepGenPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.traffic.bicycle.step in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.bicycle.step&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class BicycleStepGenPageGen<DEV> extends MapResultPage {
	protected static final Logger LOG = LoggerFactory.getLogger(BicycleStepGenPage.class);

	////////////////////////////
	// searchListBicycleStep_ //
	////////////////////////////


	/**	 The entity searchListBicycleStep_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<BicycleStep> searchListBicycleStep_;

	/**	<br> The entity searchListBicycleStep_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.bicycle.step.BicycleStepGenPage&fq=entiteVar_enUS_indexed_string:searchListBicycleStep_">Find the entity searchListBicycleStep_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchListBicycleStep_(Wrap<SearchList<BicycleStep>> w);

	public SearchList<BicycleStep> getSearchListBicycleStep_() {
		return searchListBicycleStep_;
	}

	public void setSearchListBicycleStep_(SearchList<BicycleStep> searchListBicycleStep_) {
		this.searchListBicycleStep_ = searchListBicycleStep_;
	}
	public static SearchList<BicycleStep> staticSetSearchListBicycleStep_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected BicycleStepGenPage searchListBicycleStep_Init() {
		Wrap<SearchList<BicycleStep>> searchListBicycleStep_Wrap = new Wrap<SearchList<BicycleStep>>().var("searchListBicycleStep_");
		if(searchListBicycleStep_ == null) {
			_searchListBicycleStep_(searchListBicycleStep_Wrap);
			Optional.ofNullable(searchListBicycleStep_Wrap.getO()).ifPresent(o -> {
				setSearchListBicycleStep_(o);
			});
		}
		return (BicycleStepGenPage)this;
	}

	/////////////////////
	// listBicycleStep //
	/////////////////////


	/**	 The entity listBicycleStep
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listBicycleStep = new JsonArray();

	/**	<br> The entity listBicycleStep
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.bicycle.step.BicycleStepGenPage&fq=entiteVar_enUS_indexed_string:listBicycleStep">Find the entity listBicycleStep in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _listBicycleStep(JsonArray l);

	public JsonArray getListBicycleStep() {
		return listBicycleStep;
	}

	public void setListBicycleStep(JsonArray listBicycleStep) {
		this.listBicycleStep = listBicycleStep;
	}
	@JsonIgnore
	public void setListBicycleStep(String o) {
		this.listBicycleStep = BicycleStepGenPage.staticSetListBicycleStep(siteRequest_, o);
	}
	public static JsonArray staticSetListBicycleStep(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonArray(o);
		}
		return null;
	}
	protected BicycleStepGenPage listBicycleStepInit() {
		_listBicycleStep(listBicycleStep);
		return (BicycleStepGenPage)this;
	}

	public static String staticSearchListBicycleStep(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o.toString();
	}

	public static String staticSearchStrListBicycleStep(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqListBicycleStep(SiteRequestEnUS siteRequest_, String o) {
		return BicycleStepGenPage.staticSearchStrListBicycleStep(siteRequest_, BicycleStepGenPage.staticSearchListBicycleStep(siteRequest_, BicycleStepGenPage.staticSetListBicycleStep(siteRequest_, o)));
	}

	//////////////////////
	// bicycleStepCount //
	//////////////////////


	/**	 The entity bicycleStepCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer bicycleStepCount;

	/**	<br> The entity bicycleStepCount
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.bicycle.step.BicycleStepGenPage&fq=entiteVar_enUS_indexed_string:bicycleStepCount">Find the entity bicycleStepCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _bicycleStepCount(Wrap<Integer> w);

	public Integer getBicycleStepCount() {
		return bicycleStepCount;
	}

	public void setBicycleStepCount(Integer bicycleStepCount) {
		this.bicycleStepCount = bicycleStepCount;
	}
	@JsonIgnore
	public void setBicycleStepCount(String o) {
		this.bicycleStepCount = BicycleStepGenPage.staticSetBicycleStepCount(siteRequest_, o);
	}
	public static Integer staticSetBicycleStepCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected BicycleStepGenPage bicycleStepCountInit() {
		Wrap<Integer> bicycleStepCountWrap = new Wrap<Integer>().var("bicycleStepCount");
		if(bicycleStepCount == null) {
			_bicycleStepCount(bicycleStepCountWrap);
			Optional.ofNullable(bicycleStepCountWrap.getO()).ifPresent(o -> {
				setBicycleStepCount(o);
			});
		}
		return (BicycleStepGenPage)this;
	}

	public static Integer staticSearchBicycleStepCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrBicycleStepCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqBicycleStepCount(SiteRequestEnUS siteRequest_, String o) {
		return BicycleStepGenPage.staticSearchStrBicycleStepCount(siteRequest_, BicycleStepGenPage.staticSearchBicycleStepCount(siteRequest_, BicycleStepGenPage.staticSetBicycleStepCount(siteRequest_, o)));
	}

	//////////////////
	// bicycleStep_ //
	//////////////////


	/**	 The entity bicycleStep_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected BicycleStep bicycleStep_;

	/**	<br> The entity bicycleStep_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.bicycle.step.BicycleStepGenPage&fq=entiteVar_enUS_indexed_string:bicycleStep_">Find the entity bicycleStep_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _bicycleStep_(Wrap<BicycleStep> w);

	public BicycleStep getBicycleStep_() {
		return bicycleStep_;
	}

	public void setBicycleStep_(BicycleStep bicycleStep_) {
		this.bicycleStep_ = bicycleStep_;
	}
	public static BicycleStep staticSetBicycleStep_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected BicycleStepGenPage bicycleStep_Init() {
		Wrap<BicycleStep> bicycleStep_Wrap = new Wrap<BicycleStep>().var("bicycleStep_");
		if(bicycleStep_ == null) {
			_bicycleStep_(bicycleStep_Wrap);
			Optional.ofNullable(bicycleStep_Wrap.getO()).ifPresent(o -> {
				setBicycleStep_(o);
			});
		}
		return (BicycleStepGenPage)this;
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.bicycle.step.BicycleStepGenPage&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = BicycleStepGenPage.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected BicycleStepGenPage idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			Optional.ofNullable(idWrap.getO()).ifPresent(o -> {
				setId(o);
			});
		}
		return (BicycleStepGenPage)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return BicycleStepGenPage.staticSearchStrId(siteRequest_, BicycleStepGenPage.staticSearchId(siteRequest_, BicycleStepGenPage.staticSetId(siteRequest_, o)));
	}

	////////////////////////
	// pageUriBicycleStep //
	////////////////////////


	/**	 The entity pageUriBicycleStep
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUriBicycleStep;

	/**	<br> The entity pageUriBicycleStep
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.bicycle.step.BicycleStepGenPage&fq=entiteVar_enUS_indexed_string:pageUriBicycleStep">Find the entity pageUriBicycleStep in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUriBicycleStep(Wrap<String> c);

	public String getPageUriBicycleStep() {
		return pageUriBicycleStep;
	}
	public void setPageUriBicycleStep(String o) {
		this.pageUriBicycleStep = BicycleStepGenPage.staticSetPageUriBicycleStep(siteRequest_, o);
	}
	public static String staticSetPageUriBicycleStep(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected BicycleStepGenPage pageUriBicycleStepInit() {
		Wrap<String> pageUriBicycleStepWrap = new Wrap<String>().var("pageUriBicycleStep");
		if(pageUriBicycleStep == null) {
			_pageUriBicycleStep(pageUriBicycleStepWrap);
			Optional.ofNullable(pageUriBicycleStepWrap.getO()).ifPresent(o -> {
				setPageUriBicycleStep(o);
			});
		}
		return (BicycleStepGenPage)this;
	}

	public static String staticSearchPageUriBicycleStep(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUriBicycleStep(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUriBicycleStep(SiteRequestEnUS siteRequest_, String o) {
		return BicycleStepGenPage.staticSearchStrPageUriBicycleStep(siteRequest_, BicycleStepGenPage.staticSearchPageUriBicycleStep(siteRequest_, BicycleStepGenPage.staticSetPageUriBicycleStep(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepBicycleStepGenPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepBicycleStepGenPage();
	}

	public Future<Void> promiseDeepBicycleStepGenPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseBicycleStepGenPage(promise2);
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

	public Future<Void> promiseBicycleStepGenPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				searchListBicycleStep_Init();
				listBicycleStepInit();
				bicycleStepCountInit();
				bicycleStep_Init();
				idInit();
				pageUriBicycleStepInit();
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
		return promiseDeepBicycleStepGenPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestBicycleStepGenPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestMapResultPage(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestBicycleStepGenPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainBicycleStepGenPage(v);
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
	public Object obtainBicycleStepGenPage(String var) {
		BicycleStepGenPage oBicycleStepGenPage = (BicycleStepGenPage)this;
		switch(var) {
			case "searchListBicycleStep_":
				return oBicycleStepGenPage.searchListBicycleStep_;
			case "listBicycleStep":
				return oBicycleStepGenPage.listBicycleStep;
			case "bicycleStepCount":
				return oBicycleStepGenPage.bicycleStepCount;
			case "bicycleStep_":
				return oBicycleStepGenPage.bicycleStep_;
			case "id":
				return oBicycleStepGenPage.id;
			case "pageUriBicycleStep":
				return oBicycleStepGenPage.pageUriBicycleStep;
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
				o = relateBicycleStepGenPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateBicycleStepGenPage(String var, Object val) {
		BicycleStepGenPage oBicycleStepGenPage = (BicycleStepGenPage)this;
		switch(var) {
			default:
				return super.relateMapResultPage(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetBicycleStepGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetBicycleStepGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listBicycleStep":
			return BicycleStepGenPage.staticSetListBicycleStep(siteRequest_, o);
		case "bicycleStepCount":
			return BicycleStepGenPage.staticSetBicycleStepCount(siteRequest_, o);
		case "id":
			return BicycleStepGenPage.staticSetId(siteRequest_, o);
		case "pageUriBicycleStep":
			return BicycleStepGenPage.staticSetPageUriBicycleStep(siteRequest_, o);
			default:
				return MapResultPage.staticSetMapResultPage(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchBicycleStepGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchBicycleStepGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listBicycleStep":
			return BicycleStepGenPage.staticSearchListBicycleStep(siteRequest_, (JsonArray)o);
		case "bicycleStepCount":
			return BicycleStepGenPage.staticSearchBicycleStepCount(siteRequest_, (Integer)o);
		case "id":
			return BicycleStepGenPage.staticSearchId(siteRequest_, (String)o);
		case "pageUriBicycleStep":
			return BicycleStepGenPage.staticSearchPageUriBicycleStep(siteRequest_, (String)o);
			default:
				return MapResultPage.staticSearchMapResultPage(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrBicycleStepGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrBicycleStepGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listBicycleStep":
			return BicycleStepGenPage.staticSearchStrListBicycleStep(siteRequest_, (String)o);
		case "bicycleStepCount":
			return BicycleStepGenPage.staticSearchStrBicycleStepCount(siteRequest_, (Integer)o);
		case "id":
			return BicycleStepGenPage.staticSearchStrId(siteRequest_, (String)o);
		case "pageUriBicycleStep":
			return BicycleStepGenPage.staticSearchStrPageUriBicycleStep(siteRequest_, (String)o);
			default:
				return MapResultPage.staticSearchStrMapResultPage(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqBicycleStepGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqBicycleStepGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listBicycleStep":
			return BicycleStepGenPage.staticSearchFqListBicycleStep(siteRequest_, o);
		case "bicycleStepCount":
			return BicycleStepGenPage.staticSearchFqBicycleStepCount(siteRequest_, o);
		case "id":
			return BicycleStepGenPage.staticSearchFqId(siteRequest_, o);
		case "pageUriBicycleStep":
			return BicycleStepGenPage.staticSearchFqPageUriBicycleStep(siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "BicycleStepGenPage";
	public static final String VAR_searchListBicycleStep_ = "searchListBicycleStep_";
	public static final String VAR_listBicycleStep = "listBicycleStep";
	public static final String VAR_bicycleStepCount = "bicycleStepCount";
	public static final String VAR_bicycleStep_ = "bicycleStep_";
	public static final String VAR_id = "id";
	public static final String VAR_pageUriBicycleStep = "pageUriBicycleStep";

	public static final String DISPLAY_NAME_searchListBicycleStep_ = "";
	public static final String DISPLAY_NAME_listBicycleStep = "";
	public static final String DISPLAY_NAME_bicycleStepCount = "";
	public static final String DISPLAY_NAME_bicycleStep_ = "";
	public static final String DISPLAY_NAME_id = "";
	public static final String DISPLAY_NAME_pageUriBicycleStep = "";

	public static String displayNameForClass(String var) {
		return BicycleStepGenPage.displayNameBicycleStepGenPage(var);
	}
	public static String displayNameBicycleStepGenPage(String var) {
		switch(var) {
		case VAR_searchListBicycleStep_:
			return DISPLAY_NAME_searchListBicycleStep_;
		case VAR_listBicycleStep:
			return DISPLAY_NAME_listBicycleStep;
		case VAR_bicycleStepCount:
			return DISPLAY_NAME_bicycleStepCount;
		case VAR_bicycleStep_:
			return DISPLAY_NAME_bicycleStep_;
		case VAR_id:
			return DISPLAY_NAME_id;
		case VAR_pageUriBicycleStep:
			return DISPLAY_NAME_pageUriBicycleStep;
		default:
			return MapResultPage.displayNameMapResultPage(var);
		}
	}
}
