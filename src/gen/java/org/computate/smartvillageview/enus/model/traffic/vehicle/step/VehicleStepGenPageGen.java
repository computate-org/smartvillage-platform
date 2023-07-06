package org.computate.smartvillageview.enus.model.traffic.vehicle.step;

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
import org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStep;
import io.vertx.core.json.JsonArray;
import java.lang.Integer;
import java.lang.String;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;

/**	
<ol>
0<h3>Suggestions that can generate more code for you: </h3></ol>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these VehicleStepGenPage objects in a RESTful API. 
 * </li><li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class VehicleStepGenPageGen into the class VehicleStepGenPage. 
 * </li>
 * <h3>About the VehicleStepGenPage class and it's generated class VehicleStepGenPageGen&lt;MapResultPage&gt;: </h3>extends VehicleStepGenPageGen
 * <p>
 * This Java class extends a generated Java class VehicleStepGenPageGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage">Find the class VehicleStepGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends VehicleStepGenPageGen<MapResultPage>
 * <p>This <code>class VehicleStepGenPage extends VehicleStepGenPageGen&lt;MapResultPage&gt;</code>, which means it extends a newly generated VehicleStepGenPageGen. 
 * The generated <code>class VehicleStepGenPageGen extends MapResultPage</code> which means that VehicleStepGenPage extends VehicleStepGenPageGen which extends MapResultPage. 
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
 * <p>By adding a class comment "{@inheritDoc}", the VehicleStepGenPage class will inherit the helpful inherited class comments from the super class VehicleStepGenPageGen. 
 * </p>
 * Rows: null
 * Model: true
 * Page: true
 * SuperPage.enUS: null
 * Promise: true
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the VehicleStepGenPage Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * Delete the class VehicleStepGenPage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.traffic.vehicle.step in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class VehicleStepGenPageGen<DEV> extends MapResultPage {
	protected static final Logger LOG = LoggerFactory.getLogger(VehicleStepGenPage.class);

	////////////////////////////
	// searchListVehicleStep_ //
	////////////////////////////


	/**	 The entity searchListVehicleStep_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<VehicleStep> searchListVehicleStep_;

	/**	<br> The entity searchListVehicleStep_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&fq=entiteVar_enUS_indexed_string:searchListVehicleStep_">Find the entity searchListVehicleStep_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchListVehicleStep_(Wrap<SearchList<VehicleStep>> w);

	public SearchList<VehicleStep> getSearchListVehicleStep_() {
		return searchListVehicleStep_;
	}

	public void setSearchListVehicleStep_(SearchList<VehicleStep> searchListVehicleStep_) {
		this.searchListVehicleStep_ = searchListVehicleStep_;
	}
	public static SearchList<VehicleStep> staticSetSearchListVehicleStep_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected VehicleStepGenPage searchListVehicleStep_Init() {
		Wrap<SearchList<VehicleStep>> searchListVehicleStep_Wrap = new Wrap<SearchList<VehicleStep>>().var("searchListVehicleStep_");
		if(searchListVehicleStep_ == null) {
			_searchListVehicleStep_(searchListVehicleStep_Wrap);
			setSearchListVehicleStep_(searchListVehicleStep_Wrap.o);
		}
		return (VehicleStepGenPage)this;
	}

	/////////////////////
	// listVehicleStep //
	/////////////////////


	/**	 The entity listVehicleStep
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listVehicleStep = new JsonArray();

	/**	<br> The entity listVehicleStep
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&fq=entiteVar_enUS_indexed_string:listVehicleStep">Find the entity listVehicleStep in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _listVehicleStep(JsonArray l);

	public JsonArray getListVehicleStep() {
		return listVehicleStep;
	}

	public void setListVehicleStep(JsonArray listVehicleStep) {
		this.listVehicleStep = listVehicleStep;
	}
	@JsonIgnore
	public void setListVehicleStep(String o) {
		this.listVehicleStep = VehicleStepGenPage.staticSetListVehicleStep(siteRequest_, o);
	}
	public static JsonArray staticSetListVehicleStep(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonArray(o);
		}
		return null;
	}
	protected VehicleStepGenPage listVehicleStepInit() {
		_listVehicleStep(listVehicleStep);
		return (VehicleStepGenPage)this;
	}

	public static String staticSearchListVehicleStep(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o.toString();
	}

	public static String staticSearchStrListVehicleStep(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqListVehicleStep(SiteRequestEnUS siteRequest_, String o) {
		return VehicleStepGenPage.staticSearchStrListVehicleStep(siteRequest_, VehicleStepGenPage.staticSearchListVehicleStep(siteRequest_, VehicleStepGenPage.staticSetListVehicleStep(siteRequest_, o)));
	}

	//////////////////////
	// vehicleStepCount //
	//////////////////////


	/**	 The entity vehicleStepCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer vehicleStepCount;

	/**	<br> The entity vehicleStepCount
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&fq=entiteVar_enUS_indexed_string:vehicleStepCount">Find the entity vehicleStepCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _vehicleStepCount(Wrap<Integer> w);

	public Integer getVehicleStepCount() {
		return vehicleStepCount;
	}

	public void setVehicleStepCount(Integer vehicleStepCount) {
		this.vehicleStepCount = vehicleStepCount;
	}
	@JsonIgnore
	public void setVehicleStepCount(String o) {
		this.vehicleStepCount = VehicleStepGenPage.staticSetVehicleStepCount(siteRequest_, o);
	}
	public static Integer staticSetVehicleStepCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected VehicleStepGenPage vehicleStepCountInit() {
		Wrap<Integer> vehicleStepCountWrap = new Wrap<Integer>().var("vehicleStepCount");
		if(vehicleStepCount == null) {
			_vehicleStepCount(vehicleStepCountWrap);
			setVehicleStepCount(vehicleStepCountWrap.o);
		}
		return (VehicleStepGenPage)this;
	}

	public static Integer staticSearchVehicleStepCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrVehicleStepCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqVehicleStepCount(SiteRequestEnUS siteRequest_, String o) {
		return VehicleStepGenPage.staticSearchStrVehicleStepCount(siteRequest_, VehicleStepGenPage.staticSearchVehicleStepCount(siteRequest_, VehicleStepGenPage.staticSetVehicleStepCount(siteRequest_, o)));
	}

	//////////////////
	// vehicleStep_ //
	//////////////////


	/**	 The entity vehicleStep_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected VehicleStep vehicleStep_;

	/**	<br> The entity vehicleStep_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&fq=entiteVar_enUS_indexed_string:vehicleStep_">Find the entity vehicleStep_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _vehicleStep_(Wrap<VehicleStep> w);

	public VehicleStep getVehicleStep_() {
		return vehicleStep_;
	}

	public void setVehicleStep_(VehicleStep vehicleStep_) {
		this.vehicleStep_ = vehicleStep_;
	}
	public static VehicleStep staticSetVehicleStep_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected VehicleStepGenPage vehicleStep_Init() {
		Wrap<VehicleStep> vehicleStep_Wrap = new Wrap<VehicleStep>().var("vehicleStep_");
		if(vehicleStep_ == null) {
			_vehicleStep_(vehicleStep_Wrap);
			setVehicleStep_(vehicleStep_Wrap.o);
		}
		return (VehicleStepGenPage)this;
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = VehicleStepGenPage.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected VehicleStepGenPage idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			setId(idWrap.o);
		}
		return (VehicleStepGenPage)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return VehicleStepGenPage.staticSearchStrId(siteRequest_, VehicleStepGenPage.staticSearchId(siteRequest_, VehicleStepGenPage.staticSetId(siteRequest_, o)));
	}

	////////////////////////
	// pageUriVehicleStep //
	////////////////////////


	/**	 The entity pageUriVehicleStep
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUriVehicleStep;

	/**	<br> The entity pageUriVehicleStep
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&fq=entiteVar_enUS_indexed_string:pageUriVehicleStep">Find the entity pageUriVehicleStep in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUriVehicleStep(Wrap<String> c);

	public String getPageUriVehicleStep() {
		return pageUriVehicleStep;
	}
	public void setPageUriVehicleStep(String o) {
		this.pageUriVehicleStep = VehicleStepGenPage.staticSetPageUriVehicleStep(siteRequest_, o);
	}
	public static String staticSetPageUriVehicleStep(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected VehicleStepGenPage pageUriVehicleStepInit() {
		Wrap<String> pageUriVehicleStepWrap = new Wrap<String>().var("pageUriVehicleStep");
		if(pageUriVehicleStep == null) {
			_pageUriVehicleStep(pageUriVehicleStepWrap);
			setPageUriVehicleStep(pageUriVehicleStepWrap.o);
		}
		return (VehicleStepGenPage)this;
	}

	public static String staticSearchPageUriVehicleStep(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUriVehicleStep(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUriVehicleStep(SiteRequestEnUS siteRequest_, String o) {
		return VehicleStepGenPage.staticSearchStrPageUriVehicleStep(siteRequest_, VehicleStepGenPage.staticSearchPageUriVehicleStep(siteRequest_, VehicleStepGenPage.staticSetPageUriVehicleStep(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepVehicleStepGenPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepVehicleStepGenPage();
	}

	public Future<Void> promiseDeepVehicleStepGenPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseVehicleStepGenPage(promise2);
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

	public Future<Void> promiseVehicleStepGenPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				searchListVehicleStep_Init();
				listVehicleStepInit();
				vehicleStepCountInit();
				vehicleStep_Init();
				idInit();
				pageUriVehicleStepInit();
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
		return promiseDeepVehicleStepGenPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestVehicleStepGenPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestMapResultPage(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestVehicleStepGenPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainVehicleStepGenPage(v);
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
	public Object obtainVehicleStepGenPage(String var) {
		VehicleStepGenPage oVehicleStepGenPage = (VehicleStepGenPage)this;
		switch(var) {
			case "searchListVehicleStep_":
				return oVehicleStepGenPage.searchListVehicleStep_;
			case "listVehicleStep":
				return oVehicleStepGenPage.listVehicleStep;
			case "vehicleStepCount":
				return oVehicleStepGenPage.vehicleStepCount;
			case "vehicleStep_":
				return oVehicleStepGenPage.vehicleStep_;
			case "id":
				return oVehicleStepGenPage.id;
			case "pageUriVehicleStep":
				return oVehicleStepGenPage.pageUriVehicleStep;
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
				o = relateVehicleStepGenPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateVehicleStepGenPage(String var, Object val) {
		VehicleStepGenPage oVehicleStepGenPage = (VehicleStepGenPage)this;
		switch(var) {
			default:
				return super.relateMapResultPage(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetVehicleStepGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetVehicleStepGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listVehicleStep":
			return VehicleStepGenPage.staticSetListVehicleStep(siteRequest_, o);
		case "vehicleStepCount":
			return VehicleStepGenPage.staticSetVehicleStepCount(siteRequest_, o);
		case "id":
			return VehicleStepGenPage.staticSetId(siteRequest_, o);
		case "pageUriVehicleStep":
			return VehicleStepGenPage.staticSetPageUriVehicleStep(siteRequest_, o);
			default:
				return MapResultPage.staticSetMapResultPage(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchVehicleStepGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchVehicleStepGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listVehicleStep":
			return VehicleStepGenPage.staticSearchListVehicleStep(siteRequest_, (JsonArray)o);
		case "vehicleStepCount":
			return VehicleStepGenPage.staticSearchVehicleStepCount(siteRequest_, (Integer)o);
		case "id":
			return VehicleStepGenPage.staticSearchId(siteRequest_, (String)o);
		case "pageUriVehicleStep":
			return VehicleStepGenPage.staticSearchPageUriVehicleStep(siteRequest_, (String)o);
			default:
				return MapResultPage.staticSearchMapResultPage(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrVehicleStepGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrVehicleStepGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listVehicleStep":
			return VehicleStepGenPage.staticSearchStrListVehicleStep(siteRequest_, (String)o);
		case "vehicleStepCount":
			return VehicleStepGenPage.staticSearchStrVehicleStepCount(siteRequest_, (Integer)o);
		case "id":
			return VehicleStepGenPage.staticSearchStrId(siteRequest_, (String)o);
		case "pageUriVehicleStep":
			return VehicleStepGenPage.staticSearchStrPageUriVehicleStep(siteRequest_, (String)o);
			default:
				return MapResultPage.staticSearchStrMapResultPage(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqVehicleStepGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqVehicleStepGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listVehicleStep":
			return VehicleStepGenPage.staticSearchFqListVehicleStep(siteRequest_, o);
		case "vehicleStepCount":
			return VehicleStepGenPage.staticSearchFqVehicleStepCount(siteRequest_, o);
		case "id":
			return VehicleStepGenPage.staticSearchFqId(siteRequest_, o);
		case "pageUriVehicleStep":
			return VehicleStepGenPage.staticSearchFqPageUriVehicleStep(siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "VehicleStepGenPage";
	public static final String VAR_searchListVehicleStep_ = "searchListVehicleStep_";
	public static final String VAR_listVehicleStep = "listVehicleStep";
	public static final String VAR_vehicleStepCount = "vehicleStepCount";
	public static final String VAR_vehicleStep_ = "vehicleStep_";
	public static final String VAR_id = "id";
	public static final String VAR_pageUriVehicleStep = "pageUriVehicleStep";

	public static final String DISPLAY_NAME_searchListVehicleStep_ = "";
	public static final String DISPLAY_NAME_listVehicleStep = "";
	public static final String DISPLAY_NAME_vehicleStepCount = "";
	public static final String DISPLAY_NAME_vehicleStep_ = "";
	public static final String DISPLAY_NAME_id = "";
	public static final String DISPLAY_NAME_pageUriVehicleStep = "";

	public static String displayNameForClass(String var) {
		return VehicleStepGenPage.displayNameVehicleStepGenPage(var);
	}
	public static String displayNameVehicleStepGenPage(String var) {
		switch(var) {
		case VAR_searchListVehicleStep_:
			return DISPLAY_NAME_searchListVehicleStep_;
		case VAR_listVehicleStep:
			return DISPLAY_NAME_listVehicleStep;
		case VAR_vehicleStepCount:
			return DISPLAY_NAME_vehicleStepCount;
		case VAR_vehicleStep_:
			return DISPLAY_NAME_vehicleStep_;
		case VAR_id:
			return DISPLAY_NAME_id;
		case VAR_pageUriVehicleStep:
			return DISPLAY_NAME_pageUriVehicleStep;
		default:
			return MapResultPage.displayNameMapResultPage(var);
		}
	}
}
