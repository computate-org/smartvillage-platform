package org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved;

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
import org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved;
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
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these TrafficFlowObservedGenPage objects in a RESTful API. 
 * </li><li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class TrafficFlowObservedGenPageGen into the class TrafficFlowObservedGenPage. 
 * </li>
 * <h3>About the TrafficFlowObservedGenPage class and it's generated class TrafficFlowObservedGenPageGen&lt;BaseModelPage&gt;: </h3>extends TrafficFlowObservedGenPageGen
 * <p>
 * This Java class extends a generated Java class TrafficFlowObservedGenPageGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObservedGenPage">Find the class TrafficFlowObservedGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends TrafficFlowObservedGenPageGen<BaseModelPage>
 * <p>This <code>class TrafficFlowObservedGenPage extends TrafficFlowObservedGenPageGen&lt;BaseModelPage&gt;</code>, which means it extends a newly generated TrafficFlowObservedGenPageGen. 
 * The generated <code>class TrafficFlowObservedGenPageGen extends BaseModelPage</code> which means that TrafficFlowObservedGenPage extends TrafficFlowObservedGenPageGen which extends BaseModelPage. 
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
 * <p>By adding a class comment "{@inheritDoc}", the TrafficFlowObservedGenPage class will inherit the helpful inherited class comments from the super class TrafficFlowObservedGenPageGen. 
 * </p>
 * <h2>Rows: null</h2>
 * <h2>Model: true</h2>
 * <h2>Page: true</h2>
 * <h2>SuperPage.enUS: null</h2>
 * <h2>Promise: true</h2>
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the TrafficFlowObservedGenPage Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * Delete the class TrafficFlowObservedGenPage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObservedGenPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * Generated: true
 **/
public abstract class TrafficFlowObservedGenPageGen<DEV> extends BaseModelPage {
	protected static final Logger LOG = LoggerFactory.getLogger(TrafficFlowObservedGenPage.class);

	////////////////////////////////////
	// searchListTrafficFlowObserved_ //
	////////////////////////////////////


	/**	 The entity searchListTrafficFlowObserved_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<TrafficFlowObserved> searchListTrafficFlowObserved_;

	/**	<br> The entity searchListTrafficFlowObserved_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObservedGenPage&fq=entiteVar_enUS_indexed_string:searchListTrafficFlowObserved_">Find the entity searchListTrafficFlowObserved_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchListTrafficFlowObserved_(Wrap<SearchList<TrafficFlowObserved>> w);

	public SearchList<TrafficFlowObserved> getSearchListTrafficFlowObserved_() {
		return searchListTrafficFlowObserved_;
	}

	public void setSearchListTrafficFlowObserved_(SearchList<TrafficFlowObserved> searchListTrafficFlowObserved_) {
		this.searchListTrafficFlowObserved_ = searchListTrafficFlowObserved_;
	}
	public static SearchList<TrafficFlowObserved> staticSetSearchListTrafficFlowObserved_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected TrafficFlowObservedGenPage searchListTrafficFlowObserved_Init() {
		Wrap<SearchList<TrafficFlowObserved>> searchListTrafficFlowObserved_Wrap = new Wrap<SearchList<TrafficFlowObserved>>().var("searchListTrafficFlowObserved_");
		if(searchListTrafficFlowObserved_ == null) {
			_searchListTrafficFlowObserved_(searchListTrafficFlowObserved_Wrap);
			Optional.ofNullable(searchListTrafficFlowObserved_Wrap.getO()).ifPresent(o -> {
				setSearchListTrafficFlowObserved_(o);
			});
		}
		return (TrafficFlowObservedGenPage)this;
	}

	/////////////////////////////
	// listTrafficFlowObserved //
	/////////////////////////////


	/**	 The entity listTrafficFlowObserved
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listTrafficFlowObserved = new JsonArray();

	/**	<br> The entity listTrafficFlowObserved
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObservedGenPage&fq=entiteVar_enUS_indexed_string:listTrafficFlowObserved">Find the entity listTrafficFlowObserved in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _listTrafficFlowObserved(JsonArray l);

	public JsonArray getListTrafficFlowObserved() {
		return listTrafficFlowObserved;
	}

	public void setListTrafficFlowObserved(JsonArray listTrafficFlowObserved) {
		this.listTrafficFlowObserved = listTrafficFlowObserved;
	}
	@JsonIgnore
	public void setListTrafficFlowObserved(String o) {
		this.listTrafficFlowObserved = TrafficFlowObservedGenPage.staticSetListTrafficFlowObserved(siteRequest_, o);
	}
	public static JsonArray staticSetListTrafficFlowObserved(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonArray(o);
		}
		return null;
	}
	protected TrafficFlowObservedGenPage listTrafficFlowObservedInit() {
		_listTrafficFlowObserved(listTrafficFlowObserved);
		return (TrafficFlowObservedGenPage)this;
	}

	public static String staticSearchListTrafficFlowObserved(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o.toString();
	}

	public static String staticSearchStrListTrafficFlowObserved(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqListTrafficFlowObserved(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFlowObservedGenPage.staticSearchStrListTrafficFlowObserved(siteRequest_, TrafficFlowObservedGenPage.staticSearchListTrafficFlowObserved(siteRequest_, TrafficFlowObservedGenPage.staticSetListTrafficFlowObserved(siteRequest_, o)));
	}

	//////////////////////////////
	// trafficFlowObservedCount //
	//////////////////////////////


	/**	 The entity trafficFlowObservedCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer trafficFlowObservedCount;

	/**	<br> The entity trafficFlowObservedCount
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObservedGenPage&fq=entiteVar_enUS_indexed_string:trafficFlowObservedCount">Find the entity trafficFlowObservedCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _trafficFlowObservedCount(Wrap<Integer> w);

	public Integer getTrafficFlowObservedCount() {
		return trafficFlowObservedCount;
	}

	public void setTrafficFlowObservedCount(Integer trafficFlowObservedCount) {
		this.trafficFlowObservedCount = trafficFlowObservedCount;
	}
	@JsonIgnore
	public void setTrafficFlowObservedCount(String o) {
		this.trafficFlowObservedCount = TrafficFlowObservedGenPage.staticSetTrafficFlowObservedCount(siteRequest_, o);
	}
	public static Integer staticSetTrafficFlowObservedCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected TrafficFlowObservedGenPage trafficFlowObservedCountInit() {
		Wrap<Integer> trafficFlowObservedCountWrap = new Wrap<Integer>().var("trafficFlowObservedCount");
		if(trafficFlowObservedCount == null) {
			_trafficFlowObservedCount(trafficFlowObservedCountWrap);
			Optional.ofNullable(trafficFlowObservedCountWrap.getO()).ifPresent(o -> {
				setTrafficFlowObservedCount(o);
			});
		}
		return (TrafficFlowObservedGenPage)this;
	}

	public static Integer staticSearchTrafficFlowObservedCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrTrafficFlowObservedCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqTrafficFlowObservedCount(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFlowObservedGenPage.staticSearchStrTrafficFlowObservedCount(siteRequest_, TrafficFlowObservedGenPage.staticSearchTrafficFlowObservedCount(siteRequest_, TrafficFlowObservedGenPage.staticSetTrafficFlowObservedCount(siteRequest_, o)));
	}

	//////////////////////////
	// trafficFlowObserved_ //
	//////////////////////////


	/**	 The entity trafficFlowObserved_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected TrafficFlowObserved trafficFlowObserved_;

	/**	<br> The entity trafficFlowObserved_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObservedGenPage&fq=entiteVar_enUS_indexed_string:trafficFlowObserved_">Find the entity trafficFlowObserved_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _trafficFlowObserved_(Wrap<TrafficFlowObserved> w);

	public TrafficFlowObserved getTrafficFlowObserved_() {
		return trafficFlowObserved_;
	}

	public void setTrafficFlowObserved_(TrafficFlowObserved trafficFlowObserved_) {
		this.trafficFlowObserved_ = trafficFlowObserved_;
	}
	public static TrafficFlowObserved staticSetTrafficFlowObserved_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected TrafficFlowObservedGenPage trafficFlowObserved_Init() {
		Wrap<TrafficFlowObserved> trafficFlowObserved_Wrap = new Wrap<TrafficFlowObserved>().var("trafficFlowObserved_");
		if(trafficFlowObserved_ == null) {
			_trafficFlowObserved_(trafficFlowObserved_Wrap);
			Optional.ofNullable(trafficFlowObserved_Wrap.getO()).ifPresent(o -> {
				setTrafficFlowObserved_(o);
			});
		}
		return (TrafficFlowObservedGenPage)this;
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObservedGenPage&fq=entiteVar_enUS_indexed_string:pk">Find the entity pk in Solr</a>
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
		this.pk = TrafficFlowObservedGenPage.staticSetPk(siteRequest_, o);
	}
	public static Long staticSetPk(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected TrafficFlowObservedGenPage pkInit() {
		Wrap<Long> pkWrap = new Wrap<Long>().var("pk");
		if(pk == null) {
			_pk(pkWrap);
			Optional.ofNullable(pkWrap.getO()).ifPresent(o -> {
				setPk(o);
			});
		}
		return (TrafficFlowObservedGenPage)this;
	}

	public static Long staticSearchPk(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrPk(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPk(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFlowObservedGenPage.staticSearchStrPk(siteRequest_, TrafficFlowObservedGenPage.staticSearchPk(siteRequest_, TrafficFlowObservedGenPage.staticSetPk(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObservedGenPage&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = TrafficFlowObservedGenPage.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficFlowObservedGenPage idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			Optional.ofNullable(idWrap.getO()).ifPresent(o -> {
				setId(o);
			});
		}
		return (TrafficFlowObservedGenPage)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFlowObservedGenPage.staticSearchStrId(siteRequest_, TrafficFlowObservedGenPage.staticSearchId(siteRequest_, TrafficFlowObservedGenPage.staticSetId(siteRequest_, o)));
	}

	////////////////////////////////
	// pageUriTrafficFlowObserved //
	////////////////////////////////


	/**	 The entity pageUriTrafficFlowObserved
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUriTrafficFlowObserved;

	/**	<br> The entity pageUriTrafficFlowObserved
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObservedGenPage&fq=entiteVar_enUS_indexed_string:pageUriTrafficFlowObserved">Find the entity pageUriTrafficFlowObserved in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUriTrafficFlowObserved(Wrap<String> c);

	public String getPageUriTrafficFlowObserved() {
		return pageUriTrafficFlowObserved;
	}
	public void setPageUriTrafficFlowObserved(String o) {
		this.pageUriTrafficFlowObserved = TrafficFlowObservedGenPage.staticSetPageUriTrafficFlowObserved(siteRequest_, o);
	}
	public static String staticSetPageUriTrafficFlowObserved(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficFlowObservedGenPage pageUriTrafficFlowObservedInit() {
		Wrap<String> pageUriTrafficFlowObservedWrap = new Wrap<String>().var("pageUriTrafficFlowObserved");
		if(pageUriTrafficFlowObserved == null) {
			_pageUriTrafficFlowObserved(pageUriTrafficFlowObservedWrap);
			Optional.ofNullable(pageUriTrafficFlowObservedWrap.getO()).ifPresent(o -> {
				setPageUriTrafficFlowObserved(o);
			});
		}
		return (TrafficFlowObservedGenPage)this;
	}

	public static String staticSearchPageUriTrafficFlowObserved(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUriTrafficFlowObserved(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUriTrafficFlowObserved(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFlowObservedGenPage.staticSearchStrPageUriTrafficFlowObserved(siteRequest_, TrafficFlowObservedGenPage.staticSearchPageUriTrafficFlowObserved(siteRequest_, TrafficFlowObservedGenPage.staticSetPageUriTrafficFlowObserved(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepTrafficFlowObservedGenPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepTrafficFlowObservedGenPage();
	}

	public Future<Void> promiseDeepTrafficFlowObservedGenPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseTrafficFlowObservedGenPage(promise2);
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

	public Future<Void> promiseTrafficFlowObservedGenPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				searchListTrafficFlowObserved_Init();
				listTrafficFlowObservedInit();
				trafficFlowObservedCountInit();
				trafficFlowObserved_Init();
				pkInit();
				idInit();
				pageUriTrafficFlowObservedInit();
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
		return promiseDeepTrafficFlowObservedGenPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestTrafficFlowObservedGenPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestBaseModelPage(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestTrafficFlowObservedGenPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainTrafficFlowObservedGenPage(v);
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
	public Object obtainTrafficFlowObservedGenPage(String var) {
		TrafficFlowObservedGenPage oTrafficFlowObservedGenPage = (TrafficFlowObservedGenPage)this;
		switch(var) {
			case "searchListTrafficFlowObserved_":
				return oTrafficFlowObservedGenPage.searchListTrafficFlowObserved_;
			case "listTrafficFlowObserved":
				return oTrafficFlowObservedGenPage.listTrafficFlowObserved;
			case "trafficFlowObservedCount":
				return oTrafficFlowObservedGenPage.trafficFlowObservedCount;
			case "trafficFlowObserved_":
				return oTrafficFlowObservedGenPage.trafficFlowObserved_;
			case "pk":
				return oTrafficFlowObservedGenPage.pk;
			case "id":
				return oTrafficFlowObservedGenPage.id;
			case "pageUriTrafficFlowObserved":
				return oTrafficFlowObservedGenPage.pageUriTrafficFlowObserved;
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
				o = relateTrafficFlowObservedGenPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateTrafficFlowObservedGenPage(String var, Object val) {
		TrafficFlowObservedGenPage oTrafficFlowObservedGenPage = (TrafficFlowObservedGenPage)this;
		switch(var) {
			default:
				return super.relateBaseModelPage(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetTrafficFlowObservedGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetTrafficFlowObservedGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listTrafficFlowObserved":
			return TrafficFlowObservedGenPage.staticSetListTrafficFlowObserved(siteRequest_, o);
		case "trafficFlowObservedCount":
			return TrafficFlowObservedGenPage.staticSetTrafficFlowObservedCount(siteRequest_, o);
		case "pk":
			return TrafficFlowObservedGenPage.staticSetPk(siteRequest_, o);
		case "id":
			return TrafficFlowObservedGenPage.staticSetId(siteRequest_, o);
		case "pageUriTrafficFlowObserved":
			return TrafficFlowObservedGenPage.staticSetPageUriTrafficFlowObserved(siteRequest_, o);
			default:
				return BaseModelPage.staticSetBaseModelPage(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchTrafficFlowObservedGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchTrafficFlowObservedGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listTrafficFlowObserved":
			return TrafficFlowObservedGenPage.staticSearchListTrafficFlowObserved(siteRequest_, (JsonArray)o);
		case "trafficFlowObservedCount":
			return TrafficFlowObservedGenPage.staticSearchTrafficFlowObservedCount(siteRequest_, (Integer)o);
		case "pk":
			return TrafficFlowObservedGenPage.staticSearchPk(siteRequest_, (Long)o);
		case "id":
			return TrafficFlowObservedGenPage.staticSearchId(siteRequest_, (String)o);
		case "pageUriTrafficFlowObserved":
			return TrafficFlowObservedGenPage.staticSearchPageUriTrafficFlowObserved(siteRequest_, (String)o);
			default:
				return BaseModelPage.staticSearchBaseModelPage(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrTrafficFlowObservedGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrTrafficFlowObservedGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listTrafficFlowObserved":
			return TrafficFlowObservedGenPage.staticSearchStrListTrafficFlowObserved(siteRequest_, (String)o);
		case "trafficFlowObservedCount":
			return TrafficFlowObservedGenPage.staticSearchStrTrafficFlowObservedCount(siteRequest_, (Integer)o);
		case "pk":
			return TrafficFlowObservedGenPage.staticSearchStrPk(siteRequest_, (Long)o);
		case "id":
			return TrafficFlowObservedGenPage.staticSearchStrId(siteRequest_, (String)o);
		case "pageUriTrafficFlowObserved":
			return TrafficFlowObservedGenPage.staticSearchStrPageUriTrafficFlowObserved(siteRequest_, (String)o);
			default:
				return BaseModelPage.staticSearchStrBaseModelPage(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqTrafficFlowObservedGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqTrafficFlowObservedGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listTrafficFlowObserved":
			return TrafficFlowObservedGenPage.staticSearchFqListTrafficFlowObserved(siteRequest_, o);
		case "trafficFlowObservedCount":
			return TrafficFlowObservedGenPage.staticSearchFqTrafficFlowObservedCount(siteRequest_, o);
		case "pk":
			return TrafficFlowObservedGenPage.staticSearchFqPk(siteRequest_, o);
		case "id":
			return TrafficFlowObservedGenPage.staticSearchFqId(siteRequest_, o);
		case "pageUriTrafficFlowObserved":
			return TrafficFlowObservedGenPage.staticSearchFqPageUriTrafficFlowObserved(siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "TrafficFlowObservedGenPage";
	public static final String VAR_searchListTrafficFlowObserved_ = "searchListTrafficFlowObserved_";
	public static final String VAR_listTrafficFlowObserved = "listTrafficFlowObserved";
	public static final String VAR_trafficFlowObservedCount = "trafficFlowObservedCount";
	public static final String VAR_trafficFlowObserved_ = "trafficFlowObserved_";
	public static final String VAR_pk = "pk";
	public static final String VAR_id = "id";
	public static final String VAR_pageUriTrafficFlowObserved = "pageUriTrafficFlowObserved";

	public static final String DISPLAY_NAME_searchListTrafficFlowObserved_ = "";
	public static final String DISPLAY_NAME_listTrafficFlowObserved = "";
	public static final String DISPLAY_NAME_trafficFlowObservedCount = "";
	public static final String DISPLAY_NAME_trafficFlowObserved_ = "";
	public static final String DISPLAY_NAME_pk = "";
	public static final String DISPLAY_NAME_id = "";
	public static final String DISPLAY_NAME_pageUriTrafficFlowObserved = "";

	public static String displayNameForClass(String var) {
		return TrafficFlowObservedGenPage.displayNameTrafficFlowObservedGenPage(var);
	}
	public static String displayNameTrafficFlowObservedGenPage(String var) {
		switch(var) {
		case VAR_searchListTrafficFlowObserved_:
			return DISPLAY_NAME_searchListTrafficFlowObserved_;
		case VAR_listTrafficFlowObserved:
			return DISPLAY_NAME_listTrafficFlowObserved;
		case VAR_trafficFlowObservedCount:
			return DISPLAY_NAME_trafficFlowObservedCount;
		case VAR_trafficFlowObserved_:
			return DISPLAY_NAME_trafficFlowObserved_;
		case VAR_pk:
			return DISPLAY_NAME_pk;
		case VAR_id:
			return DISPLAY_NAME_id;
		case VAR_pageUriTrafficFlowObserved:
			return DISPLAY_NAME_pageUriTrafficFlowObserved;
		default:
			return BaseModelPage.displayNameBaseModelPage(var);
		}
	}
}
