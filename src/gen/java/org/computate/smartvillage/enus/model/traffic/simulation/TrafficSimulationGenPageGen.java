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
package org.computate.smartvillage.enus.model.traffic.simulation;

import org.computate.vertx.api.ApiRequest;

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

import org.computate.vertx.search.list.SearchList;

import io.vertx.core.json.JsonArray;
import java.lang.Integer;
import java.lang.String;
import java.lang.Long;
import org.computate.search.wrap.Wrap;
import org.computate.smartvillage.enus.config.ConfigKeys;
import org.computate.smartvillage.enus.model.base.BaseModel;
import org.computate.smartvillage.enus.model.base.BaseModelPage;
import org.computate.smartvillage.enus.model.traffic.simulation.TrafficSimulation;
import org.computate.smartvillage.enus.model.traffic.simulation.TrafficSimulationGenPage;
import org.computate.smartvillage.enus.request.SiteRequestEnUS;

import io.vertx.core.Promise;
import io.vertx.core.Future;

/**
 * <ol>
<h3>Suggestions that can generate more code for you: </h3> * </ol>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these TrafficSimulationGenPage objects in a RESTful API. 
 * </li><li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class TrafficSimulationGenPageGen into the class TrafficSimulationGenPage. 
 * </li>
 * <h3>About the TrafficSimulationGenPage class and it's generated class TrafficSimulationGenPageGen&lt;BaseModelPage&gt;: </h3>extends TrafficSimulationGenPageGen
 * <p>
 * This Java class extends a generated Java class TrafficSimulationGenPageGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.traffic.simulation.TrafficSimulationGenPage">Find the class TrafficSimulationGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends TrafficSimulationGenPageGen<BaseModelPage>
 * <p>This <code>class TrafficSimulationGenPage extends TrafficSimulationGenPageGen&lt;BaseModelPage&gt;</code>, which means it extends a newly generated TrafficSimulationGenPageGen. 
 * The generated <code>class TrafficSimulationGenPageGen extends BaseModelPage</code> which means that TrafficSimulationGenPage extends TrafficSimulationGenPageGen which extends BaseModelPage. 
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
 * <p>By adding a class comment "{@inheritDoc}", the TrafficSimulationGenPage class will inherit the helpful inherited class comments from the super class TrafficSimulationGenPageGen. 
 * </p>
 * <h2>Rows: null</h2>
 * <h2>Model: true</h2>
 * <h2>Page: true</h2>
 * <h2>SuperPage.enUS: null</h2>
 * <h2>Promise: true</h2>
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the TrafficSimulationGenPage Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * Delete the class TrafficSimulationGenPage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.traffic.simulation.TrafficSimulationGenPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillage.enus.model.traffic.simulation in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillage.enus.model.traffic.simulation&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartvillage-platform in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * Generated: true
 **/
public abstract class TrafficSimulationGenPageGen<DEV> extends BaseModelPage {
	protected static final Logger LOG = LoggerFactory.getLogger(TrafficSimulationGenPage.class);

	//////////////////////////////////
	// searchListTrafficSimulation_ //
	//////////////////////////////////


	/**	 The entity searchListTrafficSimulation_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<TrafficSimulation> searchListTrafficSimulation_;

	/**	<br> The entity searchListTrafficSimulation_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.traffic.simulation.TrafficSimulationGenPage&fq=entiteVar_enUS_indexed_string:searchListTrafficSimulation_">Find the entity searchListTrafficSimulation_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchListTrafficSimulation_(Wrap<SearchList<TrafficSimulation>> w);

	public SearchList<TrafficSimulation> getSearchListTrafficSimulation_() {
		return searchListTrafficSimulation_;
	}

	public void setSearchListTrafficSimulation_(SearchList<TrafficSimulation> searchListTrafficSimulation_) {
		this.searchListTrafficSimulation_ = searchListTrafficSimulation_;
	}
	public static SearchList<TrafficSimulation> staticSetSearchListTrafficSimulation_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected TrafficSimulationGenPage searchListTrafficSimulation_Init() {
		Wrap<SearchList<TrafficSimulation>> searchListTrafficSimulation_Wrap = new Wrap<SearchList<TrafficSimulation>>().var("searchListTrafficSimulation_");
		if(searchListTrafficSimulation_ == null) {
			_searchListTrafficSimulation_(searchListTrafficSimulation_Wrap);
			Optional.ofNullable(searchListTrafficSimulation_Wrap.getO()).ifPresent(o -> {
				setSearchListTrafficSimulation_(o);
			});
		}
		return (TrafficSimulationGenPage)this;
	}

	///////////////////////////
	// listTrafficSimulation //
	///////////////////////////


	/**	 The entity listTrafficSimulation
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listTrafficSimulation = new JsonArray();

	/**	<br> The entity listTrafficSimulation
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.traffic.simulation.TrafficSimulationGenPage&fq=entiteVar_enUS_indexed_string:listTrafficSimulation">Find the entity listTrafficSimulation in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _listTrafficSimulation(JsonArray l);

	public JsonArray getListTrafficSimulation() {
		return listTrafficSimulation;
	}

	public void setListTrafficSimulation(JsonArray listTrafficSimulation) {
		this.listTrafficSimulation = listTrafficSimulation;
	}
	@JsonIgnore
	public void setListTrafficSimulation(String o) {
		this.listTrafficSimulation = TrafficSimulationGenPage.staticSetListTrafficSimulation(siteRequest_, o);
	}
	public static JsonArray staticSetListTrafficSimulation(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonArray(o);
		}
		return null;
	}
	protected TrafficSimulationGenPage listTrafficSimulationInit() {
		_listTrafficSimulation(listTrafficSimulation);
		return (TrafficSimulationGenPage)this;
	}

	public static String staticSearchListTrafficSimulation(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o.toString();
	}

	public static String staticSearchStrListTrafficSimulation(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqListTrafficSimulation(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulationGenPage.staticSearchStrListTrafficSimulation(siteRequest_, TrafficSimulationGenPage.staticSearchListTrafficSimulation(siteRequest_, TrafficSimulationGenPage.staticSetListTrafficSimulation(siteRequest_, o)));
	}

	////////////////////////////
	// trafficSimulationCount //
	////////////////////////////


	/**	 The entity trafficSimulationCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer trafficSimulationCount;

	/**	<br> The entity trafficSimulationCount
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.traffic.simulation.TrafficSimulationGenPage&fq=entiteVar_enUS_indexed_string:trafficSimulationCount">Find the entity trafficSimulationCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _trafficSimulationCount(Wrap<Integer> w);

	public Integer getTrafficSimulationCount() {
		return trafficSimulationCount;
	}

	public void setTrafficSimulationCount(Integer trafficSimulationCount) {
		this.trafficSimulationCount = trafficSimulationCount;
	}
	@JsonIgnore
	public void setTrafficSimulationCount(String o) {
		this.trafficSimulationCount = TrafficSimulationGenPage.staticSetTrafficSimulationCount(siteRequest_, o);
	}
	public static Integer staticSetTrafficSimulationCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected TrafficSimulationGenPage trafficSimulationCountInit() {
		Wrap<Integer> trafficSimulationCountWrap = new Wrap<Integer>().var("trafficSimulationCount");
		if(trafficSimulationCount == null) {
			_trafficSimulationCount(trafficSimulationCountWrap);
			Optional.ofNullable(trafficSimulationCountWrap.getO()).ifPresent(o -> {
				setTrafficSimulationCount(o);
			});
		}
		return (TrafficSimulationGenPage)this;
	}

	public static Integer staticSearchTrafficSimulationCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrTrafficSimulationCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqTrafficSimulationCount(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulationGenPage.staticSearchStrTrafficSimulationCount(siteRequest_, TrafficSimulationGenPage.staticSearchTrafficSimulationCount(siteRequest_, TrafficSimulationGenPage.staticSetTrafficSimulationCount(siteRequest_, o)));
	}

	////////////////////////
	// trafficSimulation_ //
	////////////////////////


	/**	 The entity trafficSimulation_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected TrafficSimulation trafficSimulation_;

	/**	<br> The entity trafficSimulation_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.traffic.simulation.TrafficSimulationGenPage&fq=entiteVar_enUS_indexed_string:trafficSimulation_">Find the entity trafficSimulation_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _trafficSimulation_(Wrap<TrafficSimulation> w);

	public TrafficSimulation getTrafficSimulation_() {
		return trafficSimulation_;
	}

	public void setTrafficSimulation_(TrafficSimulation trafficSimulation_) {
		this.trafficSimulation_ = trafficSimulation_;
	}
	public static TrafficSimulation staticSetTrafficSimulation_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected TrafficSimulationGenPage trafficSimulation_Init() {
		Wrap<TrafficSimulation> trafficSimulation_Wrap = new Wrap<TrafficSimulation>().var("trafficSimulation_");
		if(trafficSimulation_ == null) {
			_trafficSimulation_(trafficSimulation_Wrap);
			Optional.ofNullable(trafficSimulation_Wrap.getO()).ifPresent(o -> {
				setTrafficSimulation_(o);
			});
		}
		return (TrafficSimulationGenPage)this;
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.traffic.simulation.TrafficSimulationGenPage&fq=entiteVar_enUS_indexed_string:pk">Find the entity pk in Solr</a>
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
		this.pk = TrafficSimulationGenPage.staticSetPk(siteRequest_, o);
	}
	public static Long staticSetPk(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected TrafficSimulationGenPage pkInit() {
		Wrap<Long> pkWrap = new Wrap<Long>().var("pk");
		if(pk == null) {
			_pk(pkWrap);
			Optional.ofNullable(pkWrap.getO()).ifPresent(o -> {
				setPk(o);
			});
		}
		return (TrafficSimulationGenPage)this;
	}

	public static Long staticSearchPk(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrPk(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPk(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulationGenPage.staticSearchStrPk(siteRequest_, TrafficSimulationGenPage.staticSearchPk(siteRequest_, TrafficSimulationGenPage.staticSetPk(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.traffic.simulation.TrafficSimulationGenPage&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = TrafficSimulationGenPage.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficSimulationGenPage idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			Optional.ofNullable(idWrap.getO()).ifPresent(o -> {
				setId(o);
			});
		}
		return (TrafficSimulationGenPage)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulationGenPage.staticSearchStrId(siteRequest_, TrafficSimulationGenPage.staticSearchId(siteRequest_, TrafficSimulationGenPage.staticSetId(siteRequest_, o)));
	}

	//////////////////////////////
	// pageUriTrafficSimulation //
	//////////////////////////////


	/**	 The entity pageUriTrafficSimulation
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUriTrafficSimulation;

	/**	<br> The entity pageUriTrafficSimulation
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.traffic.simulation.TrafficSimulationGenPage&fq=entiteVar_enUS_indexed_string:pageUriTrafficSimulation">Find the entity pageUriTrafficSimulation in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUriTrafficSimulation(Wrap<String> c);

	public String getPageUriTrafficSimulation() {
		return pageUriTrafficSimulation;
	}
	public void setPageUriTrafficSimulation(String o) {
		this.pageUriTrafficSimulation = TrafficSimulationGenPage.staticSetPageUriTrafficSimulation(siteRequest_, o);
	}
	public static String staticSetPageUriTrafficSimulation(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficSimulationGenPage pageUriTrafficSimulationInit() {
		Wrap<String> pageUriTrafficSimulationWrap = new Wrap<String>().var("pageUriTrafficSimulation");
		if(pageUriTrafficSimulation == null) {
			_pageUriTrafficSimulation(pageUriTrafficSimulationWrap);
			Optional.ofNullable(pageUriTrafficSimulationWrap.getO()).ifPresent(o -> {
				setPageUriTrafficSimulation(o);
			});
		}
		return (TrafficSimulationGenPage)this;
	}

	public static String staticSearchPageUriTrafficSimulation(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUriTrafficSimulation(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUriTrafficSimulation(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulationGenPage.staticSearchStrPageUriTrafficSimulation(siteRequest_, TrafficSimulationGenPage.staticSearchPageUriTrafficSimulation(siteRequest_, TrafficSimulationGenPage.staticSetPageUriTrafficSimulation(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepTrafficSimulationGenPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepTrafficSimulationGenPage();
	}

	public Future<Void> promiseDeepTrafficSimulationGenPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseTrafficSimulationGenPage(promise2);
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

	public Future<Void> promiseTrafficSimulationGenPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				searchListTrafficSimulation_Init();
				listTrafficSimulationInit();
				trafficSimulationCountInit();
				trafficSimulation_Init();
				pkInit();
				idInit();
				pageUriTrafficSimulationInit();
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
		return promiseDeepTrafficSimulationGenPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestTrafficSimulationGenPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestBaseModelPage(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestTrafficSimulationGenPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainTrafficSimulationGenPage(v);
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
	public Object obtainTrafficSimulationGenPage(String var) {
		TrafficSimulationGenPage oTrafficSimulationGenPage = (TrafficSimulationGenPage)this;
		switch(var) {
			case "searchListTrafficSimulation_":
				return oTrafficSimulationGenPage.searchListTrafficSimulation_;
			case "listTrafficSimulation":
				return oTrafficSimulationGenPage.listTrafficSimulation;
			case "trafficSimulationCount":
				return oTrafficSimulationGenPage.trafficSimulationCount;
			case "trafficSimulation_":
				return oTrafficSimulationGenPage.trafficSimulation_;
			case "pk":
				return oTrafficSimulationGenPage.pk;
			case "id":
				return oTrafficSimulationGenPage.id;
			case "pageUriTrafficSimulation":
				return oTrafficSimulationGenPage.pageUriTrafficSimulation;
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
				o = relateTrafficSimulationGenPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateTrafficSimulationGenPage(String var, Object val) {
		TrafficSimulationGenPage oTrafficSimulationGenPage = (TrafficSimulationGenPage)this;
		switch(var) {
			default:
				return super.relateBaseModelPage(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetTrafficSimulationGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetTrafficSimulationGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listTrafficSimulation":
			return TrafficSimulationGenPage.staticSetListTrafficSimulation(siteRequest_, o);
		case "trafficSimulationCount":
			return TrafficSimulationGenPage.staticSetTrafficSimulationCount(siteRequest_, o);
		case "pk":
			return TrafficSimulationGenPage.staticSetPk(siteRequest_, o);
		case "id":
			return TrafficSimulationGenPage.staticSetId(siteRequest_, o);
		case "pageUriTrafficSimulation":
			return TrafficSimulationGenPage.staticSetPageUriTrafficSimulation(siteRequest_, o);
			default:
				return BaseModelPage.staticSetBaseModelPage(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchTrafficSimulationGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchTrafficSimulationGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listTrafficSimulation":
			return TrafficSimulationGenPage.staticSearchListTrafficSimulation(siteRequest_, (JsonArray)o);
		case "trafficSimulationCount":
			return TrafficSimulationGenPage.staticSearchTrafficSimulationCount(siteRequest_, (Integer)o);
		case "pk":
			return TrafficSimulationGenPage.staticSearchPk(siteRequest_, (Long)o);
		case "id":
			return TrafficSimulationGenPage.staticSearchId(siteRequest_, (String)o);
		case "pageUriTrafficSimulation":
			return TrafficSimulationGenPage.staticSearchPageUriTrafficSimulation(siteRequest_, (String)o);
			default:
				return BaseModelPage.staticSearchBaseModelPage(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrTrafficSimulationGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrTrafficSimulationGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listTrafficSimulation":
			return TrafficSimulationGenPage.staticSearchStrListTrafficSimulation(siteRequest_, (String)o);
		case "trafficSimulationCount":
			return TrafficSimulationGenPage.staticSearchStrTrafficSimulationCount(siteRequest_, (Integer)o);
		case "pk":
			return TrafficSimulationGenPage.staticSearchStrPk(siteRequest_, (Long)o);
		case "id":
			return TrafficSimulationGenPage.staticSearchStrId(siteRequest_, (String)o);
		case "pageUriTrafficSimulation":
			return TrafficSimulationGenPage.staticSearchStrPageUriTrafficSimulation(siteRequest_, (String)o);
			default:
				return BaseModelPage.staticSearchStrBaseModelPage(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqTrafficSimulationGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqTrafficSimulationGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listTrafficSimulation":
			return TrafficSimulationGenPage.staticSearchFqListTrafficSimulation(siteRequest_, o);
		case "trafficSimulationCount":
			return TrafficSimulationGenPage.staticSearchFqTrafficSimulationCount(siteRequest_, o);
		case "pk":
			return TrafficSimulationGenPage.staticSearchFqPk(siteRequest_, o);
		case "id":
			return TrafficSimulationGenPage.staticSearchFqId(siteRequest_, o);
		case "pageUriTrafficSimulation":
			return TrafficSimulationGenPage.staticSearchFqPageUriTrafficSimulation(siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "TrafficSimulationGenPage";
	public static final String VAR_searchListTrafficSimulation_ = "searchListTrafficSimulation_";
	public static final String VAR_listTrafficSimulation = "listTrafficSimulation";
	public static final String VAR_trafficSimulationCount = "trafficSimulationCount";
	public static final String VAR_trafficSimulation_ = "trafficSimulation_";
	public static final String VAR_pk = "pk";
	public static final String VAR_id = "id";
	public static final String VAR_pageUriTrafficSimulation = "pageUriTrafficSimulation";

	public static final String DISPLAY_NAME_searchListTrafficSimulation_ = "";
	public static final String DISPLAY_NAME_listTrafficSimulation = "";
	public static final String DISPLAY_NAME_trafficSimulationCount = "";
	public static final String DISPLAY_NAME_trafficSimulation_ = "";
	public static final String DISPLAY_NAME_pk = "";
	public static final String DISPLAY_NAME_id = "";
	public static final String DISPLAY_NAME_pageUriTrafficSimulation = "";

	public static String displayNameForClass(String var) {
		return TrafficSimulationGenPage.displayNameTrafficSimulationGenPage(var);
	}
	public static String displayNameTrafficSimulationGenPage(String var) {
		switch(var) {
		case VAR_searchListTrafficSimulation_:
			return DISPLAY_NAME_searchListTrafficSimulation_;
		case VAR_listTrafficSimulation:
			return DISPLAY_NAME_listTrafficSimulation;
		case VAR_trafficSimulationCount:
			return DISPLAY_NAME_trafficSimulationCount;
		case VAR_trafficSimulation_:
			return DISPLAY_NAME_trafficSimulation_;
		case VAR_pk:
			return DISPLAY_NAME_pk;
		case VAR_id:
			return DISPLAY_NAME_id;
		case VAR_pageUriTrafficSimulation:
			return DISPLAY_NAME_pageUriTrafficSimulation;
		default:
			return BaseModelPage.displayNameBaseModelPage(var);
		}
	}
}
