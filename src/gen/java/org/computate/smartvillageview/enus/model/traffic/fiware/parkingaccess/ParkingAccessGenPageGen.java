/*
 * Copyright (c) 2018-2022 Computate Limited Liability Company in Utah, USA,
 * and the Smarta Byar Smart Village FIWARE IHub. 
 *
 * This program and the accompanying materials are made available under the
 * terms of the GNU GENERAL PUBLIC LICENSE Version 3 which is available at
 * 
 * https://www.gnu.org/licenses/gpl-3.0.en.html
 * 
 * You may not propagate or modify a covered work except as expressly provided 
 * under this License. Any attempt otherwise to propagate or modify it is void, 
 * and will automatically terminate your rights under this License (including 
 * any patent licenses granted under the third paragraph of section 11).
 */
package org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess;

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
import org.computate.smartvillageview.enus.model.base.BaseModelPage;
import org.computate.vertx.search.list.SearchList;
import org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess.ParkingAccess;
import io.vertx.core.json.JsonArray;
import java.lang.Integer;
import java.lang.String;
import java.lang.Long;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;

/**
 * <ol>
<h3>Suggestions that can generate more code for you: </h3> * </ol>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these ParkingAccessGenPage objects in a RESTful API. 
 * </li><li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class ParkingAccessGenPageGen into the class ParkingAccessGenPage. 
 * </li>
 * <h3>About the ParkingAccessGenPage class and it's generated class ParkingAccessGenPageGen&lt;BaseModelPage&gt;: </h3>extends ParkingAccessGenPageGen
 * <p>
 * This Java class extends a generated Java class ParkingAccessGenPageGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess.ParkingAccessGenPage">Find the class ParkingAccessGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends ParkingAccessGenPageGen<BaseModelPage>
 * <p>This <code>class ParkingAccessGenPage extends ParkingAccessGenPageGen&lt;BaseModelPage&gt;</code>, which means it extends a newly generated ParkingAccessGenPageGen. 
 * The generated <code>class ParkingAccessGenPageGen extends BaseModelPage</code> which means that ParkingAccessGenPage extends ParkingAccessGenPageGen which extends BaseModelPage. 
 * This generated inheritance is a powerful feature that allows a lot of boiler plate code to be created for you automatically while still preserving inheritance through the power of Java Generic classes. 
 * </p>
 * <h2>Api: true</h2>
 * <h2>ApiTag.enUS: true</h2>
 * <h2>ApiUri.enUS: null</h2>
 * <h2>Color: null</h2>
 * <h2>IconGroup: null</h2>
 * <h2>IconName: null</h2>
 * <h2>Indexed: true</h2>
 * <h2>{@inheritDoc}</h2>
 * <p>By adding a class comment "{@inheritDoc}", the ParkingAccessGenPage class will inherit the helpful inherited class comments from the super class ParkingAccessGenPageGen. 
 * </p>
 * <h2>Rows: null</h2>
 * <h2>Model: true</h2>
 * <h2>Page: true</h2>
 * <h2>SuperPage.enUS: null</h2>
 * <h2>Promise: true</h2>
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the ParkingAccessGenPage Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * <h2>AName.enUS: null</h2>
 * <p>
 * Delete the class ParkingAccessGenPage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess.ParkingAccessGenPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * Generated: true
 **/
public abstract class ParkingAccessGenPageGen<DEV> extends BaseModelPage {
	protected static final Logger LOG = LoggerFactory.getLogger(ParkingAccessGenPage.class);

	//////////////////////////////
	// searchListParkingAccess_ //
	//////////////////////////////


	/**	 The entity searchListParkingAccess_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<ParkingAccess> searchListParkingAccess_;

	/**	<br> The entity searchListParkingAccess_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess.ParkingAccessGenPage&fq=entiteVar_enUS_indexed_string:searchListParkingAccess_">Find the entity searchListParkingAccess_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchListParkingAccess_(Wrap<SearchList<ParkingAccess>> w);

	public SearchList<ParkingAccess> getSearchListParkingAccess_() {
		return searchListParkingAccess_;
	}

	public void setSearchListParkingAccess_(SearchList<ParkingAccess> searchListParkingAccess_) {
		this.searchListParkingAccess_ = searchListParkingAccess_;
	}
	public static SearchList<ParkingAccess> staticSetSearchListParkingAccess_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected ParkingAccessGenPage searchListParkingAccess_Init() {
		Wrap<SearchList<ParkingAccess>> searchListParkingAccess_Wrap = new Wrap<SearchList<ParkingAccess>>().var("searchListParkingAccess_");
		if(searchListParkingAccess_ == null) {
			_searchListParkingAccess_(searchListParkingAccess_Wrap);
			Optional.ofNullable(searchListParkingAccess_Wrap.getO()).ifPresent(o -> {
				setSearchListParkingAccess_(o);
			});
		}
		return (ParkingAccessGenPage)this;
	}

	///////////////////////
	// listParkingAccess //
	///////////////////////


	/**	 The entity listParkingAccess
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listParkingAccess = new JsonArray();

	/**	<br> The entity listParkingAccess
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess.ParkingAccessGenPage&fq=entiteVar_enUS_indexed_string:listParkingAccess">Find the entity listParkingAccess in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _listParkingAccess(JsonArray l);

	public JsonArray getListParkingAccess() {
		return listParkingAccess;
	}

	public void setListParkingAccess(JsonArray listParkingAccess) {
		this.listParkingAccess = listParkingAccess;
	}
	@JsonIgnore
	public void setListParkingAccess(String o) {
		this.listParkingAccess = ParkingAccessGenPage.staticSetListParkingAccess(siteRequest_, o);
	}
	public static JsonArray staticSetListParkingAccess(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonArray(o);
		}
		return null;
	}
	protected ParkingAccessGenPage listParkingAccessInit() {
		_listParkingAccess(listParkingAccess);
		return (ParkingAccessGenPage)this;
	}

	public static String staticSearchListParkingAccess(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o.toString();
	}

	public static String staticSearchStrListParkingAccess(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqListParkingAccess(SiteRequestEnUS siteRequest_, String o) {
		return ParkingAccessGenPage.staticSearchStrListParkingAccess(siteRequest_, ParkingAccessGenPage.staticSearchListParkingAccess(siteRequest_, ParkingAccessGenPage.staticSetListParkingAccess(siteRequest_, o)));
	}

	////////////////////////
	// parkingAccessCount //
	////////////////////////


	/**	 The entity parkingAccessCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer parkingAccessCount;

	/**	<br> The entity parkingAccessCount
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess.ParkingAccessGenPage&fq=entiteVar_enUS_indexed_string:parkingAccessCount">Find the entity parkingAccessCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _parkingAccessCount(Wrap<Integer> w);

	public Integer getParkingAccessCount() {
		return parkingAccessCount;
	}

	public void setParkingAccessCount(Integer parkingAccessCount) {
		this.parkingAccessCount = parkingAccessCount;
	}
	@JsonIgnore
	public void setParkingAccessCount(String o) {
		this.parkingAccessCount = ParkingAccessGenPage.staticSetParkingAccessCount(siteRequest_, o);
	}
	public static Integer staticSetParkingAccessCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected ParkingAccessGenPage parkingAccessCountInit() {
		Wrap<Integer> parkingAccessCountWrap = new Wrap<Integer>().var("parkingAccessCount");
		if(parkingAccessCount == null) {
			_parkingAccessCount(parkingAccessCountWrap);
			Optional.ofNullable(parkingAccessCountWrap.getO()).ifPresent(o -> {
				setParkingAccessCount(o);
			});
		}
		return (ParkingAccessGenPage)this;
	}

	public static Integer staticSearchParkingAccessCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrParkingAccessCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParkingAccessCount(SiteRequestEnUS siteRequest_, String o) {
		return ParkingAccessGenPage.staticSearchStrParkingAccessCount(siteRequest_, ParkingAccessGenPage.staticSearchParkingAccessCount(siteRequest_, ParkingAccessGenPage.staticSetParkingAccessCount(siteRequest_, o)));
	}

	////////////////////
	// parkingAccess_ //
	////////////////////


	/**	 The entity parkingAccess_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected ParkingAccess parkingAccess_;

	/**	<br> The entity parkingAccess_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess.ParkingAccessGenPage&fq=entiteVar_enUS_indexed_string:parkingAccess_">Find the entity parkingAccess_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _parkingAccess_(Wrap<ParkingAccess> w);

	public ParkingAccess getParkingAccess_() {
		return parkingAccess_;
	}

	public void setParkingAccess_(ParkingAccess parkingAccess_) {
		this.parkingAccess_ = parkingAccess_;
	}
	public static ParkingAccess staticSetParkingAccess_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected ParkingAccessGenPage parkingAccess_Init() {
		Wrap<ParkingAccess> parkingAccess_Wrap = new Wrap<ParkingAccess>().var("parkingAccess_");
		if(parkingAccess_ == null) {
			_parkingAccess_(parkingAccess_Wrap);
			Optional.ofNullable(parkingAccess_Wrap.getO()).ifPresent(o -> {
				setParkingAccess_(o);
			});
		}
		return (ParkingAccessGenPage)this;
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess.ParkingAccessGenPage&fq=entiteVar_enUS_indexed_string:pk">Find the entity pk in Solr</a>
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
		this.pk = ParkingAccessGenPage.staticSetPk(siteRequest_, o);
	}
	public static Long staticSetPk(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ParkingAccessGenPage pkInit() {
		Wrap<Long> pkWrap = new Wrap<Long>().var("pk");
		if(pk == null) {
			_pk(pkWrap);
			Optional.ofNullable(pkWrap.getO()).ifPresent(o -> {
				setPk(o);
			});
		}
		return (ParkingAccessGenPage)this;
	}

	public static Long staticSearchPk(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrPk(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPk(SiteRequestEnUS siteRequest_, String o) {
		return ParkingAccessGenPage.staticSearchStrPk(siteRequest_, ParkingAccessGenPage.staticSearchPk(siteRequest_, ParkingAccessGenPage.staticSetPk(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess.ParkingAccessGenPage&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = ParkingAccessGenPage.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected ParkingAccessGenPage idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			Optional.ofNullable(idWrap.getO()).ifPresent(o -> {
				setId(o);
			});
		}
		return (ParkingAccessGenPage)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return ParkingAccessGenPage.staticSearchStrId(siteRequest_, ParkingAccessGenPage.staticSearchId(siteRequest_, ParkingAccessGenPage.staticSetId(siteRequest_, o)));
	}

	//////////////////////////
	// pageUriParkingAccess //
	//////////////////////////


	/**	 The entity pageUriParkingAccess
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUriParkingAccess;

	/**	<br> The entity pageUriParkingAccess
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess.ParkingAccessGenPage&fq=entiteVar_enUS_indexed_string:pageUriParkingAccess">Find the entity pageUriParkingAccess in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUriParkingAccess(Wrap<String> c);

	public String getPageUriParkingAccess() {
		return pageUriParkingAccess;
	}
	public void setPageUriParkingAccess(String o) {
		this.pageUriParkingAccess = ParkingAccessGenPage.staticSetPageUriParkingAccess(siteRequest_, o);
	}
	public static String staticSetPageUriParkingAccess(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected ParkingAccessGenPage pageUriParkingAccessInit() {
		Wrap<String> pageUriParkingAccessWrap = new Wrap<String>().var("pageUriParkingAccess");
		if(pageUriParkingAccess == null) {
			_pageUriParkingAccess(pageUriParkingAccessWrap);
			Optional.ofNullable(pageUriParkingAccessWrap.getO()).ifPresent(o -> {
				setPageUriParkingAccess(o);
			});
		}
		return (ParkingAccessGenPage)this;
	}

	public static String staticSearchPageUriParkingAccess(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUriParkingAccess(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUriParkingAccess(SiteRequestEnUS siteRequest_, String o) {
		return ParkingAccessGenPage.staticSearchStrPageUriParkingAccess(siteRequest_, ParkingAccessGenPage.staticSearchPageUriParkingAccess(siteRequest_, ParkingAccessGenPage.staticSetPageUriParkingAccess(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepParkingAccessGenPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepParkingAccessGenPage();
	}

	public Future<Void> promiseDeepParkingAccessGenPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseParkingAccessGenPage(promise2);
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

	public Future<Void> promiseParkingAccessGenPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				searchListParkingAccess_Init();
				listParkingAccessInit();
				parkingAccessCountInit();
				parkingAccess_Init();
				pkInit();
				idInit();
				pageUriParkingAccessInit();
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
		return promiseDeepParkingAccessGenPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestParkingAccessGenPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestBaseModelPage(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestParkingAccessGenPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainParkingAccessGenPage(v);
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
	public Object obtainParkingAccessGenPage(String var) {
		ParkingAccessGenPage oParkingAccessGenPage = (ParkingAccessGenPage)this;
		switch(var) {
			case "searchListParkingAccess_":
				return oParkingAccessGenPage.searchListParkingAccess_;
			case "listParkingAccess":
				return oParkingAccessGenPage.listParkingAccess;
			case "parkingAccessCount":
				return oParkingAccessGenPage.parkingAccessCount;
			case "parkingAccess_":
				return oParkingAccessGenPage.parkingAccess_;
			case "pk":
				return oParkingAccessGenPage.pk;
			case "id":
				return oParkingAccessGenPage.id;
			case "pageUriParkingAccess":
				return oParkingAccessGenPage.pageUriParkingAccess;
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
				o = relateParkingAccessGenPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateParkingAccessGenPage(String var, Object val) {
		ParkingAccessGenPage oParkingAccessGenPage = (ParkingAccessGenPage)this;
		switch(var) {
			default:
				return super.relateBaseModelPage(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetParkingAccessGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetParkingAccessGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listParkingAccess":
			return ParkingAccessGenPage.staticSetListParkingAccess(siteRequest_, o);
		case "parkingAccessCount":
			return ParkingAccessGenPage.staticSetParkingAccessCount(siteRequest_, o);
		case "pk":
			return ParkingAccessGenPage.staticSetPk(siteRequest_, o);
		case "id":
			return ParkingAccessGenPage.staticSetId(siteRequest_, o);
		case "pageUriParkingAccess":
			return ParkingAccessGenPage.staticSetPageUriParkingAccess(siteRequest_, o);
			default:
				return BaseModelPage.staticSetBaseModelPage(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchParkingAccessGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchParkingAccessGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listParkingAccess":
			return ParkingAccessGenPage.staticSearchListParkingAccess(siteRequest_, (JsonArray)o);
		case "parkingAccessCount":
			return ParkingAccessGenPage.staticSearchParkingAccessCount(siteRequest_, (Integer)o);
		case "pk":
			return ParkingAccessGenPage.staticSearchPk(siteRequest_, (Long)o);
		case "id":
			return ParkingAccessGenPage.staticSearchId(siteRequest_, (String)o);
		case "pageUriParkingAccess":
			return ParkingAccessGenPage.staticSearchPageUriParkingAccess(siteRequest_, (String)o);
			default:
				return BaseModelPage.staticSearchBaseModelPage(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrParkingAccessGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrParkingAccessGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listParkingAccess":
			return ParkingAccessGenPage.staticSearchStrListParkingAccess(siteRequest_, (String)o);
		case "parkingAccessCount":
			return ParkingAccessGenPage.staticSearchStrParkingAccessCount(siteRequest_, (Integer)o);
		case "pk":
			return ParkingAccessGenPage.staticSearchStrPk(siteRequest_, (Long)o);
		case "id":
			return ParkingAccessGenPage.staticSearchStrId(siteRequest_, (String)o);
		case "pageUriParkingAccess":
			return ParkingAccessGenPage.staticSearchStrPageUriParkingAccess(siteRequest_, (String)o);
			default:
				return BaseModelPage.staticSearchStrBaseModelPage(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqParkingAccessGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqParkingAccessGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listParkingAccess":
			return ParkingAccessGenPage.staticSearchFqListParkingAccess(siteRequest_, o);
		case "parkingAccessCount":
			return ParkingAccessGenPage.staticSearchFqParkingAccessCount(siteRequest_, o);
		case "pk":
			return ParkingAccessGenPage.staticSearchFqPk(siteRequest_, o);
		case "id":
			return ParkingAccessGenPage.staticSearchFqId(siteRequest_, o);
		case "pageUriParkingAccess":
			return ParkingAccessGenPage.staticSearchFqPageUriParkingAccess(siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "ParkingAccessGenPage";
	public static final String VAR_searchListParkingAccess_ = "searchListParkingAccess_";
	public static final String VAR_listParkingAccess = "listParkingAccess";
	public static final String VAR_parkingAccessCount = "parkingAccessCount";
	public static final String VAR_parkingAccess_ = "parkingAccess_";
	public static final String VAR_pk = "pk";
	public static final String VAR_id = "id";
	public static final String VAR_pageUriParkingAccess = "pageUriParkingAccess";

	public static final String DISPLAY_NAME_searchListParkingAccess_ = "";
	public static final String DISPLAY_NAME_listParkingAccess = "";
	public static final String DISPLAY_NAME_parkingAccessCount = "";
	public static final String DISPLAY_NAME_parkingAccess_ = "";
	public static final String DISPLAY_NAME_pk = "";
	public static final String DISPLAY_NAME_id = "";
	public static final String DISPLAY_NAME_pageUriParkingAccess = "";

	public static String displayNameForClass(String var) {
		return ParkingAccessGenPage.displayNameParkingAccessGenPage(var);
	}
	public static String displayNameParkingAccessGenPage(String var) {
		switch(var) {
		case VAR_searchListParkingAccess_:
			return DISPLAY_NAME_searchListParkingAccess_;
		case VAR_listParkingAccess:
			return DISPLAY_NAME_listParkingAccess;
		case VAR_parkingAccessCount:
			return DISPLAY_NAME_parkingAccessCount;
		case VAR_parkingAccess_:
			return DISPLAY_NAME_parkingAccess_;
		case VAR_pk:
			return DISPLAY_NAME_pk;
		case VAR_id:
			return DISPLAY_NAME_id;
		case VAR_pageUriParkingAccess:
			return DISPLAY_NAME_pageUriParkingAccess;
		default:
			return BaseModelPage.displayNameBaseModelPage(var);
		}
	}
}
