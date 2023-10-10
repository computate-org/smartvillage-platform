package org.computate.smartvillageview.enus.model.traffic.simulation.report;

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
import org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport;
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
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these SimulationReportGenPage objects in a RESTful API. 
 * </li><li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class SimulationReportGenPageGen into the class SimulationReportGenPage. 
 * </li>
 * <h3>About the SimulationReportGenPage class and it's generated class SimulationReportGenPageGen&lt;BaseModelPage&gt;: </h3>extends SimulationReportGenPageGen
 * <p>
 * This Java class extends a generated Java class SimulationReportGenPageGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReportGenPage">Find the class SimulationReportGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends SimulationReportGenPageGen<BaseModelPage>
 * <p>This <code>class SimulationReportGenPage extends SimulationReportGenPageGen&lt;BaseModelPage&gt;</code>, which means it extends a newly generated SimulationReportGenPageGen. 
 * The generated <code>class SimulationReportGenPageGen extends BaseModelPage</code> which means that SimulationReportGenPage extends SimulationReportGenPageGen which extends BaseModelPage. 
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
 * <p>By adding a class comment "{@inheritDoc}", the SimulationReportGenPage class will inherit the helpful inherited class comments from the super class SimulationReportGenPageGen. 
 * </p>
 * <h2>Rows: null</h2>
 * <h2>Model: true</h2>
 * <h2>Page: true</h2>
 * <h2>SuperPage.enUS: null</h2>
 * <h2>Promise: true</h2>
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the SimulationReportGenPage Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * Delete the class SimulationReportGenPage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReportGenPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.traffic.simulation.report in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * Generated: true
 **/
public abstract class SimulationReportGenPageGen<DEV> extends BaseModelPage {
	protected static final Logger LOG = LoggerFactory.getLogger(SimulationReportGenPage.class);

	/////////////////////////////////
	// searchListSimulationReport_ //
	/////////////////////////////////


	/**	 The entity searchListSimulationReport_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<SimulationReport> searchListSimulationReport_;

	/**	<br> The entity searchListSimulationReport_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReportGenPage&fq=entiteVar_enUS_indexed_string:searchListSimulationReport_">Find the entity searchListSimulationReport_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchListSimulationReport_(Wrap<SearchList<SimulationReport>> w);

	public SearchList<SimulationReport> getSearchListSimulationReport_() {
		return searchListSimulationReport_;
	}

	public void setSearchListSimulationReport_(SearchList<SimulationReport> searchListSimulationReport_) {
		this.searchListSimulationReport_ = searchListSimulationReport_;
	}
	public static SearchList<SimulationReport> staticSetSearchListSimulationReport_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected SimulationReportGenPage searchListSimulationReport_Init() {
		Wrap<SearchList<SimulationReport>> searchListSimulationReport_Wrap = new Wrap<SearchList<SimulationReport>>().var("searchListSimulationReport_");
		if(searchListSimulationReport_ == null) {
			_searchListSimulationReport_(searchListSimulationReport_Wrap);
			Optional.ofNullable(searchListSimulationReport_Wrap.getO()).ifPresent(o -> {
				setSearchListSimulationReport_(o);
			});
		}
		return (SimulationReportGenPage)this;
	}

	//////////////////////////
	// listSimulationReport //
	//////////////////////////


	/**	 The entity listSimulationReport
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listSimulationReport = new JsonArray();

	/**	<br> The entity listSimulationReport
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReportGenPage&fq=entiteVar_enUS_indexed_string:listSimulationReport">Find the entity listSimulationReport in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _listSimulationReport(JsonArray l);

	public JsonArray getListSimulationReport() {
		return listSimulationReport;
	}

	public void setListSimulationReport(JsonArray listSimulationReport) {
		this.listSimulationReport = listSimulationReport;
	}
	@JsonIgnore
	public void setListSimulationReport(String o) {
		this.listSimulationReport = SimulationReportGenPage.staticSetListSimulationReport(siteRequest_, o);
	}
	public static JsonArray staticSetListSimulationReport(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonArray(o);
		}
		return null;
	}
	protected SimulationReportGenPage listSimulationReportInit() {
		_listSimulationReport(listSimulationReport);
		return (SimulationReportGenPage)this;
	}

	public static String staticSearchListSimulationReport(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o.toString();
	}

	public static String staticSearchStrListSimulationReport(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqListSimulationReport(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReportGenPage.staticSearchStrListSimulationReport(siteRequest_, SimulationReportGenPage.staticSearchListSimulationReport(siteRequest_, SimulationReportGenPage.staticSetListSimulationReport(siteRequest_, o)));
	}

	///////////////////////////
	// simulationReportCount //
	///////////////////////////


	/**	 The entity simulationReportCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer simulationReportCount;

	/**	<br> The entity simulationReportCount
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReportGenPage&fq=entiteVar_enUS_indexed_string:simulationReportCount">Find the entity simulationReportCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _simulationReportCount(Wrap<Integer> w);

	public Integer getSimulationReportCount() {
		return simulationReportCount;
	}

	public void setSimulationReportCount(Integer simulationReportCount) {
		this.simulationReportCount = simulationReportCount;
	}
	@JsonIgnore
	public void setSimulationReportCount(String o) {
		this.simulationReportCount = SimulationReportGenPage.staticSetSimulationReportCount(siteRequest_, o);
	}
	public static Integer staticSetSimulationReportCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected SimulationReportGenPage simulationReportCountInit() {
		Wrap<Integer> simulationReportCountWrap = new Wrap<Integer>().var("simulationReportCount");
		if(simulationReportCount == null) {
			_simulationReportCount(simulationReportCountWrap);
			Optional.ofNullable(simulationReportCountWrap.getO()).ifPresent(o -> {
				setSimulationReportCount(o);
			});
		}
		return (SimulationReportGenPage)this;
	}

	public static Integer staticSearchSimulationReportCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrSimulationReportCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSimulationReportCount(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReportGenPage.staticSearchStrSimulationReportCount(siteRequest_, SimulationReportGenPage.staticSearchSimulationReportCount(siteRequest_, SimulationReportGenPage.staticSetSimulationReportCount(siteRequest_, o)));
	}

	///////////////////////
	// simulationReport_ //
	///////////////////////


	/**	 The entity simulationReport_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected SimulationReport simulationReport_;

	/**	<br> The entity simulationReport_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReportGenPage&fq=entiteVar_enUS_indexed_string:simulationReport_">Find the entity simulationReport_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _simulationReport_(Wrap<SimulationReport> w);

	public SimulationReport getSimulationReport_() {
		return simulationReport_;
	}

	public void setSimulationReport_(SimulationReport simulationReport_) {
		this.simulationReport_ = simulationReport_;
	}
	public static SimulationReport staticSetSimulationReport_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected SimulationReportGenPage simulationReport_Init() {
		Wrap<SimulationReport> simulationReport_Wrap = new Wrap<SimulationReport>().var("simulationReport_");
		if(simulationReport_ == null) {
			_simulationReport_(simulationReport_Wrap);
			Optional.ofNullable(simulationReport_Wrap.getO()).ifPresent(o -> {
				setSimulationReport_(o);
			});
		}
		return (SimulationReportGenPage)this;
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReportGenPage&fq=entiteVar_enUS_indexed_string:pk">Find the entity pk in Solr</a>
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
		this.pk = SimulationReportGenPage.staticSetPk(siteRequest_, o);
	}
	public static Long staticSetPk(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected SimulationReportGenPage pkInit() {
		Wrap<Long> pkWrap = new Wrap<Long>().var("pk");
		if(pk == null) {
			_pk(pkWrap);
			Optional.ofNullable(pkWrap.getO()).ifPresent(o -> {
				setPk(o);
			});
		}
		return (SimulationReportGenPage)this;
	}

	public static Long staticSearchPk(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrPk(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPk(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReportGenPage.staticSearchStrPk(siteRequest_, SimulationReportGenPage.staticSearchPk(siteRequest_, SimulationReportGenPage.staticSetPk(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReportGenPage&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = SimulationReportGenPage.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SimulationReportGenPage idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			Optional.ofNullable(idWrap.getO()).ifPresent(o -> {
				setId(o);
			});
		}
		return (SimulationReportGenPage)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReportGenPage.staticSearchStrId(siteRequest_, SimulationReportGenPage.staticSearchId(siteRequest_, SimulationReportGenPage.staticSetId(siteRequest_, o)));
	}

	/////////////////////////////
	// pageUriSimulationReport //
	/////////////////////////////


	/**	 The entity pageUriSimulationReport
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUriSimulationReport;

	/**	<br> The entity pageUriSimulationReport
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReportGenPage&fq=entiteVar_enUS_indexed_string:pageUriSimulationReport">Find the entity pageUriSimulationReport in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUriSimulationReport(Wrap<String> c);

	public String getPageUriSimulationReport() {
		return pageUriSimulationReport;
	}
	public void setPageUriSimulationReport(String o) {
		this.pageUriSimulationReport = SimulationReportGenPage.staticSetPageUriSimulationReport(siteRequest_, o);
	}
	public static String staticSetPageUriSimulationReport(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SimulationReportGenPage pageUriSimulationReportInit() {
		Wrap<String> pageUriSimulationReportWrap = new Wrap<String>().var("pageUriSimulationReport");
		if(pageUriSimulationReport == null) {
			_pageUriSimulationReport(pageUriSimulationReportWrap);
			Optional.ofNullable(pageUriSimulationReportWrap.getO()).ifPresent(o -> {
				setPageUriSimulationReport(o);
			});
		}
		return (SimulationReportGenPage)this;
	}

	public static String staticSearchPageUriSimulationReport(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUriSimulationReport(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUriSimulationReport(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReportGenPage.staticSearchStrPageUriSimulationReport(siteRequest_, SimulationReportGenPage.staticSearchPageUriSimulationReport(siteRequest_, SimulationReportGenPage.staticSetPageUriSimulationReport(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepSimulationReportGenPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepSimulationReportGenPage();
	}

	public Future<Void> promiseDeepSimulationReportGenPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseSimulationReportGenPage(promise2);
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

	public Future<Void> promiseSimulationReportGenPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				searchListSimulationReport_Init();
				listSimulationReportInit();
				simulationReportCountInit();
				simulationReport_Init();
				pkInit();
				idInit();
				pageUriSimulationReportInit();
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
		return promiseDeepSimulationReportGenPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestSimulationReportGenPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestBaseModelPage(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestSimulationReportGenPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainSimulationReportGenPage(v);
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
	public Object obtainSimulationReportGenPage(String var) {
		SimulationReportGenPage oSimulationReportGenPage = (SimulationReportGenPage)this;
		switch(var) {
			case "searchListSimulationReport_":
				return oSimulationReportGenPage.searchListSimulationReport_;
			case "listSimulationReport":
				return oSimulationReportGenPage.listSimulationReport;
			case "simulationReportCount":
				return oSimulationReportGenPage.simulationReportCount;
			case "simulationReport_":
				return oSimulationReportGenPage.simulationReport_;
			case "pk":
				return oSimulationReportGenPage.pk;
			case "id":
				return oSimulationReportGenPage.id;
			case "pageUriSimulationReport":
				return oSimulationReportGenPage.pageUriSimulationReport;
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
				o = relateSimulationReportGenPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateSimulationReportGenPage(String var, Object val) {
		SimulationReportGenPage oSimulationReportGenPage = (SimulationReportGenPage)this;
		switch(var) {
			default:
				return super.relateBaseModelPage(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetSimulationReportGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetSimulationReportGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listSimulationReport":
			return SimulationReportGenPage.staticSetListSimulationReport(siteRequest_, o);
		case "simulationReportCount":
			return SimulationReportGenPage.staticSetSimulationReportCount(siteRequest_, o);
		case "pk":
			return SimulationReportGenPage.staticSetPk(siteRequest_, o);
		case "id":
			return SimulationReportGenPage.staticSetId(siteRequest_, o);
		case "pageUriSimulationReport":
			return SimulationReportGenPage.staticSetPageUriSimulationReport(siteRequest_, o);
			default:
				return BaseModelPage.staticSetBaseModelPage(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchSimulationReportGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchSimulationReportGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listSimulationReport":
			return SimulationReportGenPage.staticSearchListSimulationReport(siteRequest_, (JsonArray)o);
		case "simulationReportCount":
			return SimulationReportGenPage.staticSearchSimulationReportCount(siteRequest_, (Integer)o);
		case "pk":
			return SimulationReportGenPage.staticSearchPk(siteRequest_, (Long)o);
		case "id":
			return SimulationReportGenPage.staticSearchId(siteRequest_, (String)o);
		case "pageUriSimulationReport":
			return SimulationReportGenPage.staticSearchPageUriSimulationReport(siteRequest_, (String)o);
			default:
				return BaseModelPage.staticSearchBaseModelPage(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrSimulationReportGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrSimulationReportGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listSimulationReport":
			return SimulationReportGenPage.staticSearchStrListSimulationReport(siteRequest_, (String)o);
		case "simulationReportCount":
			return SimulationReportGenPage.staticSearchStrSimulationReportCount(siteRequest_, (Integer)o);
		case "pk":
			return SimulationReportGenPage.staticSearchStrPk(siteRequest_, (Long)o);
		case "id":
			return SimulationReportGenPage.staticSearchStrId(siteRequest_, (String)o);
		case "pageUriSimulationReport":
			return SimulationReportGenPage.staticSearchStrPageUriSimulationReport(siteRequest_, (String)o);
			default:
				return BaseModelPage.staticSearchStrBaseModelPage(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqSimulationReportGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqSimulationReportGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listSimulationReport":
			return SimulationReportGenPage.staticSearchFqListSimulationReport(siteRequest_, o);
		case "simulationReportCount":
			return SimulationReportGenPage.staticSearchFqSimulationReportCount(siteRequest_, o);
		case "pk":
			return SimulationReportGenPage.staticSearchFqPk(siteRequest_, o);
		case "id":
			return SimulationReportGenPage.staticSearchFqId(siteRequest_, o);
		case "pageUriSimulationReport":
			return SimulationReportGenPage.staticSearchFqPageUriSimulationReport(siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "SimulationReportGenPage";
	public static final String VAR_searchListSimulationReport_ = "searchListSimulationReport_";
	public static final String VAR_listSimulationReport = "listSimulationReport";
	public static final String VAR_simulationReportCount = "simulationReportCount";
	public static final String VAR_simulationReport_ = "simulationReport_";
	public static final String VAR_pk = "pk";
	public static final String VAR_id = "id";
	public static final String VAR_pageUriSimulationReport = "pageUriSimulationReport";

	public static final String DISPLAY_NAME_searchListSimulationReport_ = "";
	public static final String DISPLAY_NAME_listSimulationReport = "";
	public static final String DISPLAY_NAME_simulationReportCount = "";
	public static final String DISPLAY_NAME_simulationReport_ = "";
	public static final String DISPLAY_NAME_pk = "";
	public static final String DISPLAY_NAME_id = "";
	public static final String DISPLAY_NAME_pageUriSimulationReport = "";

	public static String displayNameForClass(String var) {
		return SimulationReportGenPage.displayNameSimulationReportGenPage(var);
	}
	public static String displayNameSimulationReportGenPage(String var) {
		switch(var) {
		case VAR_searchListSimulationReport_:
			return DISPLAY_NAME_searchListSimulationReport_;
		case VAR_listSimulationReport:
			return DISPLAY_NAME_listSimulationReport;
		case VAR_simulationReportCount:
			return DISPLAY_NAME_simulationReportCount;
		case VAR_simulationReport_:
			return DISPLAY_NAME_simulationReport_;
		case VAR_pk:
			return DISPLAY_NAME_pk;
		case VAR_id:
			return DISPLAY_NAME_id;
		case VAR_pageUriSimulationReport:
			return DISPLAY_NAME_pageUriSimulationReport;
		default:
			return BaseModelPage.displayNameBaseModelPage(var);
		}
	}
}
