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
package org.computate.smartvillage.enus.model.htm;

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
import org.computate.search.wrap.Wrap;
import org.computate.smartvillage.enus.config.ConfigKeys;
import org.computate.smartvillage.enus.model.base.BaseModel;
import org.computate.smartvillage.enus.model.htm.SiteHtm;
import org.computate.smartvillage.enus.model.htm.SiteHtmGenPage;
import org.computate.smartvillage.enus.request.SiteRequestEnUS;
import org.computate.smartvillage.enus.result.base.BaseResultPage;

import io.vertx.core.Promise;
import io.vertx.core.Future;

/**
 * <ol>
<h3>Suggestions that can generate more code for you: </h3> * </ol>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these SiteHtmGenPage objects in a RESTful API. 
 * </li><li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class SiteHtmGenPageGen into the class SiteHtmGenPage. 
 * </li>
 * <h3>About the SiteHtmGenPage class and it's generated class SiteHtmGenPageGen&lt;BaseResultPage&gt;: </h3>extends SiteHtmGenPageGen
 * <p>
 * This Java class extends a generated Java class SiteHtmGenPageGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.htm.SiteHtmGenPage">Find the class SiteHtmGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends SiteHtmGenPageGen<BaseResultPage>
 * <p>This <code>class SiteHtmGenPage extends SiteHtmGenPageGen&lt;BaseResultPage&gt;</code>, which means it extends a newly generated SiteHtmGenPageGen. 
 * The generated <code>class SiteHtmGenPageGen extends BaseResultPage</code> which means that SiteHtmGenPage extends SiteHtmGenPageGen which extends BaseResultPage. 
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
 * <p>By adding a class comment "{@inheritDoc}", the SiteHtmGenPage class will inherit the helpful inherited class comments from the super class SiteHtmGenPageGen. 
 * </p>
 * <h2>Rows: null</h2>
 * <h2>Model: true</h2>
 * <h2>Page: true</h2>
 * <h2>SuperPage.enUS: null</h2>
 * <h2>Promise: true</h2>
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the SiteHtmGenPage Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * Delete the class SiteHtmGenPage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.htm.SiteHtmGenPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillage.enus.model.htm in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillage.enus.model.htm&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartvillage-platform in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * Generated: true
 **/
public abstract class SiteHtmGenPageGen<DEV> extends BaseResultPage {
	protected static final Logger LOG = LoggerFactory.getLogger(SiteHtmGenPage.class);

	////////////////////////
	// searchListSiteHtm_ //
	////////////////////////


	/**	 The entity searchListSiteHtm_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<SiteHtm> searchListSiteHtm_;

	/**	<br> The entity searchListSiteHtm_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.htm.SiteHtmGenPage&fq=entiteVar_enUS_indexed_string:searchListSiteHtm_">Find the entity searchListSiteHtm_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchListSiteHtm_(Wrap<SearchList<SiteHtm>> w);

	public SearchList<SiteHtm> getSearchListSiteHtm_() {
		return searchListSiteHtm_;
	}

	public void setSearchListSiteHtm_(SearchList<SiteHtm> searchListSiteHtm_) {
		this.searchListSiteHtm_ = searchListSiteHtm_;
	}
	public static SearchList<SiteHtm> staticSetSearchListSiteHtm_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected SiteHtmGenPage searchListSiteHtm_Init() {
		Wrap<SearchList<SiteHtm>> searchListSiteHtm_Wrap = new Wrap<SearchList<SiteHtm>>().var("searchListSiteHtm_");
		if(searchListSiteHtm_ == null) {
			_searchListSiteHtm_(searchListSiteHtm_Wrap);
			Optional.ofNullable(searchListSiteHtm_Wrap.getO()).ifPresent(o -> {
				setSearchListSiteHtm_(o);
			});
		}
		return (SiteHtmGenPage)this;
	}

	/////////////////
	// listSiteHtm //
	/////////////////


	/**	 The entity listSiteHtm
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listSiteHtm = new JsonArray();

	/**	<br> The entity listSiteHtm
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.htm.SiteHtmGenPage&fq=entiteVar_enUS_indexed_string:listSiteHtm">Find the entity listSiteHtm in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _listSiteHtm(JsonArray l);

	public JsonArray getListSiteHtm() {
		return listSiteHtm;
	}

	public void setListSiteHtm(JsonArray listSiteHtm) {
		this.listSiteHtm = listSiteHtm;
	}
	@JsonIgnore
	public void setListSiteHtm(String o) {
		this.listSiteHtm = SiteHtmGenPage.staticSetListSiteHtm(siteRequest_, o);
	}
	public static JsonArray staticSetListSiteHtm(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonArray(o);
		}
		return null;
	}
	protected SiteHtmGenPage listSiteHtmInit() {
		_listSiteHtm(listSiteHtm);
		return (SiteHtmGenPage)this;
	}

	public static String staticSearchListSiteHtm(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o.toString();
	}

	public static String staticSearchStrListSiteHtm(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqListSiteHtm(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtmGenPage.staticSearchStrListSiteHtm(siteRequest_, SiteHtmGenPage.staticSearchListSiteHtm(siteRequest_, SiteHtmGenPage.staticSetListSiteHtm(siteRequest_, o)));
	}

	//////////////////
	// siteHtmCount //
	//////////////////


	/**	 The entity siteHtmCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer siteHtmCount;

	/**	<br> The entity siteHtmCount
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.htm.SiteHtmGenPage&fq=entiteVar_enUS_indexed_string:siteHtmCount">Find the entity siteHtmCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _siteHtmCount(Wrap<Integer> w);

	public Integer getSiteHtmCount() {
		return siteHtmCount;
	}

	public void setSiteHtmCount(Integer siteHtmCount) {
		this.siteHtmCount = siteHtmCount;
	}
	@JsonIgnore
	public void setSiteHtmCount(String o) {
		this.siteHtmCount = SiteHtmGenPage.staticSetSiteHtmCount(siteRequest_, o);
	}
	public static Integer staticSetSiteHtmCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected SiteHtmGenPage siteHtmCountInit() {
		Wrap<Integer> siteHtmCountWrap = new Wrap<Integer>().var("siteHtmCount");
		if(siteHtmCount == null) {
			_siteHtmCount(siteHtmCountWrap);
			Optional.ofNullable(siteHtmCountWrap.getO()).ifPresent(o -> {
				setSiteHtmCount(o);
			});
		}
		return (SiteHtmGenPage)this;
	}

	public static Integer staticSearchSiteHtmCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrSiteHtmCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSiteHtmCount(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtmGenPage.staticSearchStrSiteHtmCount(siteRequest_, SiteHtmGenPage.staticSearchSiteHtmCount(siteRequest_, SiteHtmGenPage.staticSetSiteHtmCount(siteRequest_, o)));
	}

	//////////////
	// siteHtm_ //
	//////////////


	/**	 The entity siteHtm_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected SiteHtm siteHtm_;

	/**	<br> The entity siteHtm_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.htm.SiteHtmGenPage&fq=entiteVar_enUS_indexed_string:siteHtm_">Find the entity siteHtm_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _siteHtm_(Wrap<SiteHtm> w);

	public SiteHtm getSiteHtm_() {
		return siteHtm_;
	}

	public void setSiteHtm_(SiteHtm siteHtm_) {
		this.siteHtm_ = siteHtm_;
	}
	public static SiteHtm staticSetSiteHtm_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected SiteHtmGenPage siteHtm_Init() {
		Wrap<SiteHtm> siteHtm_Wrap = new Wrap<SiteHtm>().var("siteHtm_");
		if(siteHtm_ == null) {
			_siteHtm_(siteHtm_Wrap);
			Optional.ofNullable(siteHtm_Wrap.getO()).ifPresent(o -> {
				setSiteHtm_(o);
			});
		}
		return (SiteHtmGenPage)this;
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.htm.SiteHtmGenPage&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = SiteHtmGenPage.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtmGenPage idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			Optional.ofNullable(idWrap.getO()).ifPresent(o -> {
				setId(o);
			});
		}
		return (SiteHtmGenPage)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtmGenPage.staticSearchStrId(siteRequest_, SiteHtmGenPage.staticSearchId(siteRequest_, SiteHtmGenPage.staticSetId(siteRequest_, o)));
	}

	////////////////////
	// pageUriSiteHtm //
	////////////////////


	/**	 The entity pageUriSiteHtm
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUriSiteHtm;

	/**	<br> The entity pageUriSiteHtm
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.htm.SiteHtmGenPage&fq=entiteVar_enUS_indexed_string:pageUriSiteHtm">Find the entity pageUriSiteHtm in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUriSiteHtm(Wrap<String> c);

	public String getPageUriSiteHtm() {
		return pageUriSiteHtm;
	}
	public void setPageUriSiteHtm(String o) {
		this.pageUriSiteHtm = SiteHtmGenPage.staticSetPageUriSiteHtm(siteRequest_, o);
	}
	public static String staticSetPageUriSiteHtm(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtmGenPage pageUriSiteHtmInit() {
		Wrap<String> pageUriSiteHtmWrap = new Wrap<String>().var("pageUriSiteHtm");
		if(pageUriSiteHtm == null) {
			_pageUriSiteHtm(pageUriSiteHtmWrap);
			Optional.ofNullable(pageUriSiteHtmWrap.getO()).ifPresent(o -> {
				setPageUriSiteHtm(o);
			});
		}
		return (SiteHtmGenPage)this;
	}

	public static String staticSearchPageUriSiteHtm(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUriSiteHtm(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUriSiteHtm(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtmGenPage.staticSearchStrPageUriSiteHtm(siteRequest_, SiteHtmGenPage.staticSearchPageUriSiteHtm(siteRequest_, SiteHtmGenPage.staticSetPageUriSiteHtm(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepSiteHtmGenPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepSiteHtmGenPage();
	}

	public Future<Void> promiseDeepSiteHtmGenPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseSiteHtmGenPage(promise2);
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

	public Future<Void> promiseSiteHtmGenPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				searchListSiteHtm_Init();
				listSiteHtmInit();
				siteHtmCountInit();
				siteHtm_Init();
				idInit();
				pageUriSiteHtmInit();
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
		return promiseDeepSiteHtmGenPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestSiteHtmGenPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestBaseResultPage(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestSiteHtmGenPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainSiteHtmGenPage(v);
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
	public Object obtainSiteHtmGenPage(String var) {
		SiteHtmGenPage oSiteHtmGenPage = (SiteHtmGenPage)this;
		switch(var) {
			case "searchListSiteHtm_":
				return oSiteHtmGenPage.searchListSiteHtm_;
			case "listSiteHtm":
				return oSiteHtmGenPage.listSiteHtm;
			case "siteHtmCount":
				return oSiteHtmGenPage.siteHtmCount;
			case "siteHtm_":
				return oSiteHtmGenPage.siteHtm_;
			case "id":
				return oSiteHtmGenPage.id;
			case "pageUriSiteHtm":
				return oSiteHtmGenPage.pageUriSiteHtm;
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
				o = relateSiteHtmGenPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateSiteHtmGenPage(String var, Object val) {
		SiteHtmGenPage oSiteHtmGenPage = (SiteHtmGenPage)this;
		switch(var) {
			default:
				return super.relateBaseResultPage(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetSiteHtmGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetSiteHtmGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listSiteHtm":
			return SiteHtmGenPage.staticSetListSiteHtm(siteRequest_, o);
		case "siteHtmCount":
			return SiteHtmGenPage.staticSetSiteHtmCount(siteRequest_, o);
		case "id":
			return SiteHtmGenPage.staticSetId(siteRequest_, o);
		case "pageUriSiteHtm":
			return SiteHtmGenPage.staticSetPageUriSiteHtm(siteRequest_, o);
			default:
				return BaseResultPage.staticSetBaseResultPage(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchSiteHtmGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchSiteHtmGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listSiteHtm":
			return SiteHtmGenPage.staticSearchListSiteHtm(siteRequest_, (JsonArray)o);
		case "siteHtmCount":
			return SiteHtmGenPage.staticSearchSiteHtmCount(siteRequest_, (Integer)o);
		case "id":
			return SiteHtmGenPage.staticSearchId(siteRequest_, (String)o);
		case "pageUriSiteHtm":
			return SiteHtmGenPage.staticSearchPageUriSiteHtm(siteRequest_, (String)o);
			default:
				return BaseResultPage.staticSearchBaseResultPage(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrSiteHtmGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrSiteHtmGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listSiteHtm":
			return SiteHtmGenPage.staticSearchStrListSiteHtm(siteRequest_, (String)o);
		case "siteHtmCount":
			return SiteHtmGenPage.staticSearchStrSiteHtmCount(siteRequest_, (Integer)o);
		case "id":
			return SiteHtmGenPage.staticSearchStrId(siteRequest_, (String)o);
		case "pageUriSiteHtm":
			return SiteHtmGenPage.staticSearchStrPageUriSiteHtm(siteRequest_, (String)o);
			default:
				return BaseResultPage.staticSearchStrBaseResultPage(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqSiteHtmGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqSiteHtmGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listSiteHtm":
			return SiteHtmGenPage.staticSearchFqListSiteHtm(siteRequest_, o);
		case "siteHtmCount":
			return SiteHtmGenPage.staticSearchFqSiteHtmCount(siteRequest_, o);
		case "id":
			return SiteHtmGenPage.staticSearchFqId(siteRequest_, o);
		case "pageUriSiteHtm":
			return SiteHtmGenPage.staticSearchFqPageUriSiteHtm(siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "SiteHtmGenPage";
	public static final String VAR_searchListSiteHtm_ = "searchListSiteHtm_";
	public static final String VAR_listSiteHtm = "listSiteHtm";
	public static final String VAR_siteHtmCount = "siteHtmCount";
	public static final String VAR_siteHtm_ = "siteHtm_";
	public static final String VAR_id = "id";
	public static final String VAR_pageUriSiteHtm = "pageUriSiteHtm";

	public static final String DISPLAY_NAME_searchListSiteHtm_ = "";
	public static final String DISPLAY_NAME_listSiteHtm = "";
	public static final String DISPLAY_NAME_siteHtmCount = "";
	public static final String DISPLAY_NAME_siteHtm_ = "";
	public static final String DISPLAY_NAME_id = "";
	public static final String DISPLAY_NAME_pageUriSiteHtm = "";

	public static String displayNameForClass(String var) {
		return SiteHtmGenPage.displayNameSiteHtmGenPage(var);
	}
	public static String displayNameSiteHtmGenPage(String var) {
		switch(var) {
		case VAR_searchListSiteHtm_:
			return DISPLAY_NAME_searchListSiteHtm_;
		case VAR_listSiteHtm:
			return DISPLAY_NAME_listSiteHtm;
		case VAR_siteHtmCount:
			return DISPLAY_NAME_siteHtmCount;
		case VAR_siteHtm_:
			return DISPLAY_NAME_siteHtm_;
		case VAR_id:
			return DISPLAY_NAME_id;
		case VAR_pageUriSiteHtm:
			return DISPLAY_NAME_pageUriSiteHtm;
		default:
			return BaseResultPage.displayNameBaseResultPage(var);
		}
	}
}
