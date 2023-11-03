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
package org.computate.smartvillage.enus.model.traffic.fiware.crowdflowobserved;

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
import org.computate.smartvillage.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObserved;
import org.computate.smartvillage.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObservedGenPage;
import org.computate.smartvillage.enus.request.SiteRequestEnUS;

import io.vertx.core.Promise;
import io.vertx.core.Future;

/**
 * <ol>
<h3>Suggestions that can generate more code for you: </h3> * </ol>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these CrowdFlowObservedGenPage objects in a RESTful API. 
 * </li><li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class CrowdFlowObservedGenPageGen into the class CrowdFlowObservedGenPage. 
 * </li>
 * <h3>About the CrowdFlowObservedGenPage class and it's generated class CrowdFlowObservedGenPageGen&lt;BaseModelPage&gt;: </h3>extends CrowdFlowObservedGenPageGen
 * <p>
 * This Java class extends a generated Java class CrowdFlowObservedGenPageGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObservedGenPage">Find the class CrowdFlowObservedGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends CrowdFlowObservedGenPageGen<BaseModelPage>
 * <p>This <code>class CrowdFlowObservedGenPage extends CrowdFlowObservedGenPageGen&lt;BaseModelPage&gt;</code>, which means it extends a newly generated CrowdFlowObservedGenPageGen. 
 * The generated <code>class CrowdFlowObservedGenPageGen extends BaseModelPage</code> which means that CrowdFlowObservedGenPage extends CrowdFlowObservedGenPageGen which extends BaseModelPage. 
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
 * <p>By adding a class comment "{@inheritDoc}", the CrowdFlowObservedGenPage class will inherit the helpful inherited class comments from the super class CrowdFlowObservedGenPageGen. 
 * </p>
 * <h2>Rows: null</h2>
 * <h2>Model: true</h2>
 * <h2>Page: true</h2>
 * <h2>SuperPage.enUS: null</h2>
 * <h2>Promise: true</h2>
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the CrowdFlowObservedGenPage Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * Delete the class CrowdFlowObservedGenPage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObservedGenPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillage.enus.model.traffic.fiware.crowdflowobserved in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillage.enus.model.traffic.fiware.crowdflowobserved&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartvillage-platform in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * Generated: true
 **/
public abstract class CrowdFlowObservedGenPageGen<DEV> extends BaseModelPage {
	protected static final Logger LOG = LoggerFactory.getLogger(CrowdFlowObservedGenPage.class);

	//////////////////////////////////
	// searchListCrowdFlowObserved_ //
	//////////////////////////////////


	/**	 The entity searchListCrowdFlowObserved_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<CrowdFlowObserved> searchListCrowdFlowObserved_;

	/**	<br> The entity searchListCrowdFlowObserved_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObservedGenPage&fq=entiteVar_enUS_indexed_string:searchListCrowdFlowObserved_">Find the entity searchListCrowdFlowObserved_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchListCrowdFlowObserved_(Wrap<SearchList<CrowdFlowObserved>> w);

	public SearchList<CrowdFlowObserved> getSearchListCrowdFlowObserved_() {
		return searchListCrowdFlowObserved_;
	}

	public void setSearchListCrowdFlowObserved_(SearchList<CrowdFlowObserved> searchListCrowdFlowObserved_) {
		this.searchListCrowdFlowObserved_ = searchListCrowdFlowObserved_;
	}
	public static SearchList<CrowdFlowObserved> staticSetSearchListCrowdFlowObserved_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected CrowdFlowObservedGenPage searchListCrowdFlowObserved_Init() {
		Wrap<SearchList<CrowdFlowObserved>> searchListCrowdFlowObserved_Wrap = new Wrap<SearchList<CrowdFlowObserved>>().var("searchListCrowdFlowObserved_");
		if(searchListCrowdFlowObserved_ == null) {
			_searchListCrowdFlowObserved_(searchListCrowdFlowObserved_Wrap);
			Optional.ofNullable(searchListCrowdFlowObserved_Wrap.getO()).ifPresent(o -> {
				setSearchListCrowdFlowObserved_(o);
			});
		}
		return (CrowdFlowObservedGenPage)this;
	}

	///////////////////////////
	// listCrowdFlowObserved //
	///////////////////////////


	/**	 The entity listCrowdFlowObserved
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listCrowdFlowObserved = new JsonArray();

	/**	<br> The entity listCrowdFlowObserved
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObservedGenPage&fq=entiteVar_enUS_indexed_string:listCrowdFlowObserved">Find the entity listCrowdFlowObserved in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _listCrowdFlowObserved(JsonArray l);

	public JsonArray getListCrowdFlowObserved() {
		return listCrowdFlowObserved;
	}

	public void setListCrowdFlowObserved(JsonArray listCrowdFlowObserved) {
		this.listCrowdFlowObserved = listCrowdFlowObserved;
	}
	@JsonIgnore
	public void setListCrowdFlowObserved(String o) {
		this.listCrowdFlowObserved = CrowdFlowObservedGenPage.staticSetListCrowdFlowObserved(siteRequest_, o);
	}
	public static JsonArray staticSetListCrowdFlowObserved(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonArray(o);
		}
		return null;
	}
	protected CrowdFlowObservedGenPage listCrowdFlowObservedInit() {
		_listCrowdFlowObserved(listCrowdFlowObserved);
		return (CrowdFlowObservedGenPage)this;
	}

	public static String staticSearchListCrowdFlowObserved(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o.toString();
	}

	public static String staticSearchStrListCrowdFlowObserved(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqListCrowdFlowObserved(SiteRequestEnUS siteRequest_, String o) {
		return CrowdFlowObservedGenPage.staticSearchStrListCrowdFlowObserved(siteRequest_, CrowdFlowObservedGenPage.staticSearchListCrowdFlowObserved(siteRequest_, CrowdFlowObservedGenPage.staticSetListCrowdFlowObserved(siteRequest_, o)));
	}

	////////////////////////////
	// crowdFlowObservedCount //
	////////////////////////////


	/**	 The entity crowdFlowObservedCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer crowdFlowObservedCount;

	/**	<br> The entity crowdFlowObservedCount
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObservedGenPage&fq=entiteVar_enUS_indexed_string:crowdFlowObservedCount">Find the entity crowdFlowObservedCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _crowdFlowObservedCount(Wrap<Integer> w);

	public Integer getCrowdFlowObservedCount() {
		return crowdFlowObservedCount;
	}

	public void setCrowdFlowObservedCount(Integer crowdFlowObservedCount) {
		this.crowdFlowObservedCount = crowdFlowObservedCount;
	}
	@JsonIgnore
	public void setCrowdFlowObservedCount(String o) {
		this.crowdFlowObservedCount = CrowdFlowObservedGenPage.staticSetCrowdFlowObservedCount(siteRequest_, o);
	}
	public static Integer staticSetCrowdFlowObservedCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected CrowdFlowObservedGenPage crowdFlowObservedCountInit() {
		Wrap<Integer> crowdFlowObservedCountWrap = new Wrap<Integer>().var("crowdFlowObservedCount");
		if(crowdFlowObservedCount == null) {
			_crowdFlowObservedCount(crowdFlowObservedCountWrap);
			Optional.ofNullable(crowdFlowObservedCountWrap.getO()).ifPresent(o -> {
				setCrowdFlowObservedCount(o);
			});
		}
		return (CrowdFlowObservedGenPage)this;
	}

	public static Integer staticSearchCrowdFlowObservedCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrCrowdFlowObservedCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqCrowdFlowObservedCount(SiteRequestEnUS siteRequest_, String o) {
		return CrowdFlowObservedGenPage.staticSearchStrCrowdFlowObservedCount(siteRequest_, CrowdFlowObservedGenPage.staticSearchCrowdFlowObservedCount(siteRequest_, CrowdFlowObservedGenPage.staticSetCrowdFlowObservedCount(siteRequest_, o)));
	}

	////////////////////////
	// crowdFlowObserved_ //
	////////////////////////


	/**	 The entity crowdFlowObserved_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected CrowdFlowObserved crowdFlowObserved_;

	/**	<br> The entity crowdFlowObserved_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObservedGenPage&fq=entiteVar_enUS_indexed_string:crowdFlowObserved_">Find the entity crowdFlowObserved_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _crowdFlowObserved_(Wrap<CrowdFlowObserved> w);

	public CrowdFlowObserved getCrowdFlowObserved_() {
		return crowdFlowObserved_;
	}

	public void setCrowdFlowObserved_(CrowdFlowObserved crowdFlowObserved_) {
		this.crowdFlowObserved_ = crowdFlowObserved_;
	}
	public static CrowdFlowObserved staticSetCrowdFlowObserved_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected CrowdFlowObservedGenPage crowdFlowObserved_Init() {
		Wrap<CrowdFlowObserved> crowdFlowObserved_Wrap = new Wrap<CrowdFlowObserved>().var("crowdFlowObserved_");
		if(crowdFlowObserved_ == null) {
			_crowdFlowObserved_(crowdFlowObserved_Wrap);
			Optional.ofNullable(crowdFlowObserved_Wrap.getO()).ifPresent(o -> {
				setCrowdFlowObserved_(o);
			});
		}
		return (CrowdFlowObservedGenPage)this;
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObservedGenPage&fq=entiteVar_enUS_indexed_string:pk">Find the entity pk in Solr</a>
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
		this.pk = CrowdFlowObservedGenPage.staticSetPk(siteRequest_, o);
	}
	public static Long staticSetPk(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected CrowdFlowObservedGenPage pkInit() {
		Wrap<Long> pkWrap = new Wrap<Long>().var("pk");
		if(pk == null) {
			_pk(pkWrap);
			Optional.ofNullable(pkWrap.getO()).ifPresent(o -> {
				setPk(o);
			});
		}
		return (CrowdFlowObservedGenPage)this;
	}

	public static Long staticSearchPk(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrPk(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPk(SiteRequestEnUS siteRequest_, String o) {
		return CrowdFlowObservedGenPage.staticSearchStrPk(siteRequest_, CrowdFlowObservedGenPage.staticSearchPk(siteRequest_, CrowdFlowObservedGenPage.staticSetPk(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObservedGenPage&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = CrowdFlowObservedGenPage.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected CrowdFlowObservedGenPage idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			Optional.ofNullable(idWrap.getO()).ifPresent(o -> {
				setId(o);
			});
		}
		return (CrowdFlowObservedGenPage)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return CrowdFlowObservedGenPage.staticSearchStrId(siteRequest_, CrowdFlowObservedGenPage.staticSearchId(siteRequest_, CrowdFlowObservedGenPage.staticSetId(siteRequest_, o)));
	}

	//////////////////////////////
	// pageUriCrowdFlowObserved //
	//////////////////////////////


	/**	 The entity pageUriCrowdFlowObserved
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUriCrowdFlowObserved;

	/**	<br> The entity pageUriCrowdFlowObserved
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObservedGenPage&fq=entiteVar_enUS_indexed_string:pageUriCrowdFlowObserved">Find the entity pageUriCrowdFlowObserved in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUriCrowdFlowObserved(Wrap<String> c);

	public String getPageUriCrowdFlowObserved() {
		return pageUriCrowdFlowObserved;
	}
	public void setPageUriCrowdFlowObserved(String o) {
		this.pageUriCrowdFlowObserved = CrowdFlowObservedGenPage.staticSetPageUriCrowdFlowObserved(siteRequest_, o);
	}
	public static String staticSetPageUriCrowdFlowObserved(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected CrowdFlowObservedGenPage pageUriCrowdFlowObservedInit() {
		Wrap<String> pageUriCrowdFlowObservedWrap = new Wrap<String>().var("pageUriCrowdFlowObserved");
		if(pageUriCrowdFlowObserved == null) {
			_pageUriCrowdFlowObserved(pageUriCrowdFlowObservedWrap);
			Optional.ofNullable(pageUriCrowdFlowObservedWrap.getO()).ifPresent(o -> {
				setPageUriCrowdFlowObserved(o);
			});
		}
		return (CrowdFlowObservedGenPage)this;
	}

	public static String staticSearchPageUriCrowdFlowObserved(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUriCrowdFlowObserved(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUriCrowdFlowObserved(SiteRequestEnUS siteRequest_, String o) {
		return CrowdFlowObservedGenPage.staticSearchStrPageUriCrowdFlowObserved(siteRequest_, CrowdFlowObservedGenPage.staticSearchPageUriCrowdFlowObserved(siteRequest_, CrowdFlowObservedGenPage.staticSetPageUriCrowdFlowObserved(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepCrowdFlowObservedGenPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepCrowdFlowObservedGenPage();
	}

	public Future<Void> promiseDeepCrowdFlowObservedGenPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseCrowdFlowObservedGenPage(promise2);
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

	public Future<Void> promiseCrowdFlowObservedGenPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				searchListCrowdFlowObserved_Init();
				listCrowdFlowObservedInit();
				crowdFlowObservedCountInit();
				crowdFlowObserved_Init();
				pkInit();
				idInit();
				pageUriCrowdFlowObservedInit();
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
		return promiseDeepCrowdFlowObservedGenPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestCrowdFlowObservedGenPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestBaseModelPage(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestCrowdFlowObservedGenPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainCrowdFlowObservedGenPage(v);
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
	public Object obtainCrowdFlowObservedGenPage(String var) {
		CrowdFlowObservedGenPage oCrowdFlowObservedGenPage = (CrowdFlowObservedGenPage)this;
		switch(var) {
			case "searchListCrowdFlowObserved_":
				return oCrowdFlowObservedGenPage.searchListCrowdFlowObserved_;
			case "listCrowdFlowObserved":
				return oCrowdFlowObservedGenPage.listCrowdFlowObserved;
			case "crowdFlowObservedCount":
				return oCrowdFlowObservedGenPage.crowdFlowObservedCount;
			case "crowdFlowObserved_":
				return oCrowdFlowObservedGenPage.crowdFlowObserved_;
			case "pk":
				return oCrowdFlowObservedGenPage.pk;
			case "id":
				return oCrowdFlowObservedGenPage.id;
			case "pageUriCrowdFlowObserved":
				return oCrowdFlowObservedGenPage.pageUriCrowdFlowObserved;
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
				o = relateCrowdFlowObservedGenPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateCrowdFlowObservedGenPage(String var, Object val) {
		CrowdFlowObservedGenPage oCrowdFlowObservedGenPage = (CrowdFlowObservedGenPage)this;
		switch(var) {
			default:
				return super.relateBaseModelPage(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetCrowdFlowObservedGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetCrowdFlowObservedGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listCrowdFlowObserved":
			return CrowdFlowObservedGenPage.staticSetListCrowdFlowObserved(siteRequest_, o);
		case "crowdFlowObservedCount":
			return CrowdFlowObservedGenPage.staticSetCrowdFlowObservedCount(siteRequest_, o);
		case "pk":
			return CrowdFlowObservedGenPage.staticSetPk(siteRequest_, o);
		case "id":
			return CrowdFlowObservedGenPage.staticSetId(siteRequest_, o);
		case "pageUriCrowdFlowObserved":
			return CrowdFlowObservedGenPage.staticSetPageUriCrowdFlowObserved(siteRequest_, o);
			default:
				return BaseModelPage.staticSetBaseModelPage(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchCrowdFlowObservedGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchCrowdFlowObservedGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listCrowdFlowObserved":
			return CrowdFlowObservedGenPage.staticSearchListCrowdFlowObserved(siteRequest_, (JsonArray)o);
		case "crowdFlowObservedCount":
			return CrowdFlowObservedGenPage.staticSearchCrowdFlowObservedCount(siteRequest_, (Integer)o);
		case "pk":
			return CrowdFlowObservedGenPage.staticSearchPk(siteRequest_, (Long)o);
		case "id":
			return CrowdFlowObservedGenPage.staticSearchId(siteRequest_, (String)o);
		case "pageUriCrowdFlowObserved":
			return CrowdFlowObservedGenPage.staticSearchPageUriCrowdFlowObserved(siteRequest_, (String)o);
			default:
				return BaseModelPage.staticSearchBaseModelPage(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrCrowdFlowObservedGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrCrowdFlowObservedGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listCrowdFlowObserved":
			return CrowdFlowObservedGenPage.staticSearchStrListCrowdFlowObserved(siteRequest_, (String)o);
		case "crowdFlowObservedCount":
			return CrowdFlowObservedGenPage.staticSearchStrCrowdFlowObservedCount(siteRequest_, (Integer)o);
		case "pk":
			return CrowdFlowObservedGenPage.staticSearchStrPk(siteRequest_, (Long)o);
		case "id":
			return CrowdFlowObservedGenPage.staticSearchStrId(siteRequest_, (String)o);
		case "pageUriCrowdFlowObserved":
			return CrowdFlowObservedGenPage.staticSearchStrPageUriCrowdFlowObserved(siteRequest_, (String)o);
			default:
				return BaseModelPage.staticSearchStrBaseModelPage(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqCrowdFlowObservedGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqCrowdFlowObservedGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listCrowdFlowObserved":
			return CrowdFlowObservedGenPage.staticSearchFqListCrowdFlowObserved(siteRequest_, o);
		case "crowdFlowObservedCount":
			return CrowdFlowObservedGenPage.staticSearchFqCrowdFlowObservedCount(siteRequest_, o);
		case "pk":
			return CrowdFlowObservedGenPage.staticSearchFqPk(siteRequest_, o);
		case "id":
			return CrowdFlowObservedGenPage.staticSearchFqId(siteRequest_, o);
		case "pageUriCrowdFlowObserved":
			return CrowdFlowObservedGenPage.staticSearchFqPageUriCrowdFlowObserved(siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "CrowdFlowObservedGenPage";
	public static final String VAR_searchListCrowdFlowObserved_ = "searchListCrowdFlowObserved_";
	public static final String VAR_listCrowdFlowObserved = "listCrowdFlowObserved";
	public static final String VAR_crowdFlowObservedCount = "crowdFlowObservedCount";
	public static final String VAR_crowdFlowObserved_ = "crowdFlowObserved_";
	public static final String VAR_pk = "pk";
	public static final String VAR_id = "id";
	public static final String VAR_pageUriCrowdFlowObserved = "pageUriCrowdFlowObserved";

	public static final String DISPLAY_NAME_searchListCrowdFlowObserved_ = "";
	public static final String DISPLAY_NAME_listCrowdFlowObserved = "";
	public static final String DISPLAY_NAME_crowdFlowObservedCount = "";
	public static final String DISPLAY_NAME_crowdFlowObserved_ = "";
	public static final String DISPLAY_NAME_pk = "";
	public static final String DISPLAY_NAME_id = "";
	public static final String DISPLAY_NAME_pageUriCrowdFlowObserved = "";

	public static String displayNameForClass(String var) {
		return CrowdFlowObservedGenPage.displayNameCrowdFlowObservedGenPage(var);
	}
	public static String displayNameCrowdFlowObservedGenPage(String var) {
		switch(var) {
		case VAR_searchListCrowdFlowObserved_:
			return DISPLAY_NAME_searchListCrowdFlowObserved_;
		case VAR_listCrowdFlowObserved:
			return DISPLAY_NAME_listCrowdFlowObserved;
		case VAR_crowdFlowObservedCount:
			return DISPLAY_NAME_crowdFlowObservedCount;
		case VAR_crowdFlowObserved_:
			return DISPLAY_NAME_crowdFlowObserved_;
		case VAR_pk:
			return DISPLAY_NAME_pk;
		case VAR_id:
			return DISPLAY_NAME_id;
		case VAR_pageUriCrowdFlowObserved:
			return DISPLAY_NAME_pageUriCrowdFlowObserved;
		default:
			return BaseModelPage.displayNameBaseModelPage(var);
		}
	}
}
