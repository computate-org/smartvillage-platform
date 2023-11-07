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
package org.computate.smartvillage.enus.model.user;

import org.computate.smartvillage.enus.request.SiteRequestEnUS;
import org.computate.smartvillage.enus.model.base.BaseModel;
import org.computate.vertx.api.ApiRequest;
import org.computate.smartvillage.enus.config.ConfigKeys;
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
import org.computate.smartvillage.enus.model.base.BaseModelPage;
import org.computate.vertx.search.list.SearchList;
import org.computate.smartvillage.enus.model.user.SiteUser;
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
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these SiteUserGenPage objects in a RESTful API. 
 * </li><li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class SiteUserGenPageGen into the class SiteUserGenPage. 
 * </li>
 * <h3>About the SiteUserGenPage class and it's generated class SiteUserGenPageGen&lt;BaseModelPage&gt;: </h3>extends SiteUserGenPageGen
 * <p>
 * This Java class extends a generated Java class SiteUserGenPageGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.user.SiteUserGenPage">Find the class SiteUserGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends SiteUserGenPageGen<BaseModelPage>
 * <p>This <code>class SiteUserGenPage extends SiteUserGenPageGen&lt;BaseModelPage&gt;</code>, which means it extends a newly generated SiteUserGenPageGen. 
 * The generated <code>class SiteUserGenPageGen extends BaseModelPage</code> which means that SiteUserGenPage extends SiteUserGenPageGen which extends BaseModelPage. 
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
 * <p>By adding a class comment "{@inheritDoc}", the SiteUserGenPage class will inherit the helpful inherited class comments from the super class SiteUserGenPageGen. 
 * </p>
 * <h2>Rows: null</h2>
 * <h2>Model: true</h2>
 * <h2>Page: true</h2>
 * <h2>SuperPage.enUS: null</h2>
 * <h2>Promise: true</h2>
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the SiteUserGenPage Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * Delete the class SiteUserGenPage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.user.SiteUserGenPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillage.enus.model.user in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillage.enus.model.user&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartvillage-platform in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartvillage\-platform&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * Generated: true
 **/
public abstract class SiteUserGenPageGen<DEV> extends BaseModelPage {
	protected static final Logger LOG = LoggerFactory.getLogger(SiteUserGenPage.class);

	/////////////////////////
	// searchListSiteUser_ //
	/////////////////////////


	/**	 The entity searchListSiteUser_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<SiteUser> searchListSiteUser_;

	/**	<br> The entity searchListSiteUser_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.user.SiteUserGenPage&fq=entiteVar_enUS_indexed_string:searchListSiteUser_">Find the entity searchListSiteUser_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchListSiteUser_(Wrap<SearchList<SiteUser>> w);

	public SearchList<SiteUser> getSearchListSiteUser_() {
		return searchListSiteUser_;
	}

	public void setSearchListSiteUser_(SearchList<SiteUser> searchListSiteUser_) {
		this.searchListSiteUser_ = searchListSiteUser_;
	}
	public static SearchList<SiteUser> staticSetSearchListSiteUser_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected SiteUserGenPage searchListSiteUser_Init() {
		Wrap<SearchList<SiteUser>> searchListSiteUser_Wrap = new Wrap<SearchList<SiteUser>>().var("searchListSiteUser_");
		if(searchListSiteUser_ == null) {
			_searchListSiteUser_(searchListSiteUser_Wrap);
			Optional.ofNullable(searchListSiteUser_Wrap.getO()).ifPresent(o -> {
				setSearchListSiteUser_(o);
			});
		}
		return (SiteUserGenPage)this;
	}

	//////////////////
	// listSiteUser //
	//////////////////


	/**	 The entity listSiteUser
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listSiteUser = new JsonArray();

	/**	<br> The entity listSiteUser
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.user.SiteUserGenPage&fq=entiteVar_enUS_indexed_string:listSiteUser">Find the entity listSiteUser in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _listSiteUser(JsonArray l);

	public JsonArray getListSiteUser() {
		return listSiteUser;
	}

	public void setListSiteUser(JsonArray listSiteUser) {
		this.listSiteUser = listSiteUser;
	}
	@JsonIgnore
	public void setListSiteUser(String o) {
		this.listSiteUser = SiteUserGenPage.staticSetListSiteUser(siteRequest_, o);
	}
	public static JsonArray staticSetListSiteUser(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonArray(o);
		}
		return null;
	}
	protected SiteUserGenPage listSiteUserInit() {
		_listSiteUser(listSiteUser);
		return (SiteUserGenPage)this;
	}

	public static String staticSearchListSiteUser(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o.toString();
	}

	public static String staticSearchStrListSiteUser(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqListSiteUser(SiteRequestEnUS siteRequest_, String o) {
		return SiteUserGenPage.staticSearchStrListSiteUser(siteRequest_, SiteUserGenPage.staticSearchListSiteUser(siteRequest_, SiteUserGenPage.staticSetListSiteUser(siteRequest_, o)));
	}

	///////////////////
	// siteUserCount //
	///////////////////


	/**	 The entity siteUserCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer siteUserCount;

	/**	<br> The entity siteUserCount
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.user.SiteUserGenPage&fq=entiteVar_enUS_indexed_string:siteUserCount">Find the entity siteUserCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _siteUserCount(Wrap<Integer> w);

	public Integer getSiteUserCount() {
		return siteUserCount;
	}

	public void setSiteUserCount(Integer siteUserCount) {
		this.siteUserCount = siteUserCount;
	}
	@JsonIgnore
	public void setSiteUserCount(String o) {
		this.siteUserCount = SiteUserGenPage.staticSetSiteUserCount(siteRequest_, o);
	}
	public static Integer staticSetSiteUserCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected SiteUserGenPage siteUserCountInit() {
		Wrap<Integer> siteUserCountWrap = new Wrap<Integer>().var("siteUserCount");
		if(siteUserCount == null) {
			_siteUserCount(siteUserCountWrap);
			Optional.ofNullable(siteUserCountWrap.getO()).ifPresent(o -> {
				setSiteUserCount(o);
			});
		}
		return (SiteUserGenPage)this;
	}

	public static Integer staticSearchSiteUserCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrSiteUserCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSiteUserCount(SiteRequestEnUS siteRequest_, String o) {
		return SiteUserGenPage.staticSearchStrSiteUserCount(siteRequest_, SiteUserGenPage.staticSearchSiteUserCount(siteRequest_, SiteUserGenPage.staticSetSiteUserCount(siteRequest_, o)));
	}

	///////////////
	// siteUser_ //
	///////////////


	/**	 The entity siteUser_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected SiteUser siteUser_;

	/**	<br> The entity siteUser_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.user.SiteUserGenPage&fq=entiteVar_enUS_indexed_string:siteUser_">Find the entity siteUser_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _siteUser_(Wrap<SiteUser> w);

	public SiteUser getSiteUser_() {
		return siteUser_;
	}

	public void setSiteUser_(SiteUser siteUser_) {
		this.siteUser_ = siteUser_;
	}
	public static SiteUser staticSetSiteUser_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected SiteUserGenPage siteUser_Init() {
		Wrap<SiteUser> siteUser_Wrap = new Wrap<SiteUser>().var("siteUser_");
		if(siteUser_ == null) {
			_siteUser_(siteUser_Wrap);
			Optional.ofNullable(siteUser_Wrap.getO()).ifPresent(o -> {
				setSiteUser_(o);
			});
		}
		return (SiteUserGenPage)this;
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.user.SiteUserGenPage&fq=entiteVar_enUS_indexed_string:pk">Find the entity pk in Solr</a>
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
		this.pk = SiteUserGenPage.staticSetPk(siteRequest_, o);
	}
	public static Long staticSetPk(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected SiteUserGenPage pkInit() {
		Wrap<Long> pkWrap = new Wrap<Long>().var("pk");
		if(pk == null) {
			_pk(pkWrap);
			Optional.ofNullable(pkWrap.getO()).ifPresent(o -> {
				setPk(o);
			});
		}
		return (SiteUserGenPage)this;
	}

	public static Long staticSearchPk(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrPk(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPk(SiteRequestEnUS siteRequest_, String o) {
		return SiteUserGenPage.staticSearchStrPk(siteRequest_, SiteUserGenPage.staticSearchPk(siteRequest_, SiteUserGenPage.staticSetPk(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.user.SiteUserGenPage&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = SiteUserGenPage.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteUserGenPage idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			Optional.ofNullable(idWrap.getO()).ifPresent(o -> {
				setId(o);
			});
		}
		return (SiteUserGenPage)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return SiteUserGenPage.staticSearchStrId(siteRequest_, SiteUserGenPage.staticSearchId(siteRequest_, SiteUserGenPage.staticSetId(siteRequest_, o)));
	}

	/////////////////////
	// pageUriSiteUser //
	/////////////////////


	/**	 The entity pageUriSiteUser
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUriSiteUser;

	/**	<br> The entity pageUriSiteUser
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.user.SiteUserGenPage&fq=entiteVar_enUS_indexed_string:pageUriSiteUser">Find the entity pageUriSiteUser in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUriSiteUser(Wrap<String> c);

	public String getPageUriSiteUser() {
		return pageUriSiteUser;
	}
	public void setPageUriSiteUser(String o) {
		this.pageUriSiteUser = SiteUserGenPage.staticSetPageUriSiteUser(siteRequest_, o);
	}
	public static String staticSetPageUriSiteUser(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteUserGenPage pageUriSiteUserInit() {
		Wrap<String> pageUriSiteUserWrap = new Wrap<String>().var("pageUriSiteUser");
		if(pageUriSiteUser == null) {
			_pageUriSiteUser(pageUriSiteUserWrap);
			Optional.ofNullable(pageUriSiteUserWrap.getO()).ifPresent(o -> {
				setPageUriSiteUser(o);
			});
		}
		return (SiteUserGenPage)this;
	}

	public static String staticSearchPageUriSiteUser(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUriSiteUser(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUriSiteUser(SiteRequestEnUS siteRequest_, String o) {
		return SiteUserGenPage.staticSearchStrPageUriSiteUser(siteRequest_, SiteUserGenPage.staticSearchPageUriSiteUser(siteRequest_, SiteUserGenPage.staticSetPageUriSiteUser(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepSiteUserGenPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepSiteUserGenPage();
	}

	public Future<Void> promiseDeepSiteUserGenPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseSiteUserGenPage(promise2);
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

	public Future<Void> promiseSiteUserGenPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				searchListSiteUser_Init();
				listSiteUserInit();
				siteUserCountInit();
				siteUser_Init();
				pkInit();
				idInit();
				pageUriSiteUserInit();
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
		return promiseDeepSiteUserGenPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestSiteUserGenPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestBaseModelPage(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestSiteUserGenPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainSiteUserGenPage(v);
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
	public Object obtainSiteUserGenPage(String var) {
		SiteUserGenPage oSiteUserGenPage = (SiteUserGenPage)this;
		switch(var) {
			case "searchListSiteUser_":
				return oSiteUserGenPage.searchListSiteUser_;
			case "listSiteUser":
				return oSiteUserGenPage.listSiteUser;
			case "siteUserCount":
				return oSiteUserGenPage.siteUserCount;
			case "siteUser_":
				return oSiteUserGenPage.siteUser_;
			case "pk":
				return oSiteUserGenPage.pk;
			case "id":
				return oSiteUserGenPage.id;
			case "pageUriSiteUser":
				return oSiteUserGenPage.pageUriSiteUser;
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
				o = relateSiteUserGenPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateSiteUserGenPage(String var, Object val) {
		SiteUserGenPage oSiteUserGenPage = (SiteUserGenPage)this;
		switch(var) {
			default:
				return super.relateBaseModelPage(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetSiteUserGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetSiteUserGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listSiteUser":
			return SiteUserGenPage.staticSetListSiteUser(siteRequest_, o);
		case "siteUserCount":
			return SiteUserGenPage.staticSetSiteUserCount(siteRequest_, o);
		case "pk":
			return SiteUserGenPage.staticSetPk(siteRequest_, o);
		case "id":
			return SiteUserGenPage.staticSetId(siteRequest_, o);
		case "pageUriSiteUser":
			return SiteUserGenPage.staticSetPageUriSiteUser(siteRequest_, o);
			default:
				return BaseModelPage.staticSetBaseModelPage(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchSiteUserGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchSiteUserGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listSiteUser":
			return SiteUserGenPage.staticSearchListSiteUser(siteRequest_, (JsonArray)o);
		case "siteUserCount":
			return SiteUserGenPage.staticSearchSiteUserCount(siteRequest_, (Integer)o);
		case "pk":
			return SiteUserGenPage.staticSearchPk(siteRequest_, (Long)o);
		case "id":
			return SiteUserGenPage.staticSearchId(siteRequest_, (String)o);
		case "pageUriSiteUser":
			return SiteUserGenPage.staticSearchPageUriSiteUser(siteRequest_, (String)o);
			default:
				return BaseModelPage.staticSearchBaseModelPage(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrSiteUserGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrSiteUserGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listSiteUser":
			return SiteUserGenPage.staticSearchStrListSiteUser(siteRequest_, (String)o);
		case "siteUserCount":
			return SiteUserGenPage.staticSearchStrSiteUserCount(siteRequest_, (Integer)o);
		case "pk":
			return SiteUserGenPage.staticSearchStrPk(siteRequest_, (Long)o);
		case "id":
			return SiteUserGenPage.staticSearchStrId(siteRequest_, (String)o);
		case "pageUriSiteUser":
			return SiteUserGenPage.staticSearchStrPageUriSiteUser(siteRequest_, (String)o);
			default:
				return BaseModelPage.staticSearchStrBaseModelPage(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqSiteUserGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqSiteUserGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listSiteUser":
			return SiteUserGenPage.staticSearchFqListSiteUser(siteRequest_, o);
		case "siteUserCount":
			return SiteUserGenPage.staticSearchFqSiteUserCount(siteRequest_, o);
		case "pk":
			return SiteUserGenPage.staticSearchFqPk(siteRequest_, o);
		case "id":
			return SiteUserGenPage.staticSearchFqId(siteRequest_, o);
		case "pageUriSiteUser":
			return SiteUserGenPage.staticSearchFqPageUriSiteUser(siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "SiteUserGenPage";
	public static final String CLASS_API_ADDRESS = "smartvillage-platform-enUS-SiteUserGenPage";
	public static final String VAR_searchListSiteUser_ = "searchListSiteUser_";
	public static final String VAR_listSiteUser = "listSiteUser";
	public static final String VAR_siteUserCount = "siteUserCount";
	public static final String VAR_siteUser_ = "siteUser_";
	public static final String VAR_pk = "pk";
	public static final String VAR_id = "id";
	public static final String VAR_pageUriSiteUser = "pageUriSiteUser";

	public static final String DISPLAY_NAME_searchListSiteUser_ = "";
	public static final String DISPLAY_NAME_listSiteUser = "";
	public static final String DISPLAY_NAME_siteUserCount = "";
	public static final String DISPLAY_NAME_siteUser_ = "";
	public static final String DISPLAY_NAME_pk = "";
	public static final String DISPLAY_NAME_id = "";
	public static final String DISPLAY_NAME_pageUriSiteUser = "";

	public static String displayNameForClass(String var) {
		return SiteUserGenPage.displayNameSiteUserGenPage(var);
	}
	public static String displayNameSiteUserGenPage(String var) {
		switch(var) {
		case VAR_searchListSiteUser_:
			return DISPLAY_NAME_searchListSiteUser_;
		case VAR_listSiteUser:
			return DISPLAY_NAME_listSiteUser;
		case VAR_siteUserCount:
			return DISPLAY_NAME_siteUserCount;
		case VAR_siteUser_:
			return DISPLAY_NAME_siteUser_;
		case VAR_pk:
			return DISPLAY_NAME_pk;
		case VAR_id:
			return DISPLAY_NAME_id;
		case VAR_pageUriSiteUser:
			return DISPLAY_NAME_pageUriSiteUser;
		default:
			return BaseModelPage.displayNameBaseModelPage(var);
		}
	}
}
