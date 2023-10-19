package org.computate.smartvillageview.enus.model.traffic.person.step;

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
import org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep;
import io.vertx.core.json.JsonArray;
import java.lang.Integer;
import java.lang.String;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;

/**
 * <ol>
<h3>Suggestions that can generate more code for you: </h3> * </ol>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these PersonStepGenPage objects in a RESTful API. 
 * </li><li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class PersonStepGenPageGen into the class PersonStepGenPage. 
 * </li>
 * <h3>About the PersonStepGenPage class and it's generated class PersonStepGenPageGen&lt;MapResultPage&gt;: </h3>extends PersonStepGenPageGen
 * <p>
 * This Java class extends a generated Java class PersonStepGenPageGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStepGenPage">Find the class PersonStepGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends PersonStepGenPageGen<MapResultPage>
 * <p>This <code>class PersonStepGenPage extends PersonStepGenPageGen&lt;MapResultPage&gt;</code>, which means it extends a newly generated PersonStepGenPageGen. 
 * The generated <code>class PersonStepGenPageGen extends MapResultPage</code> which means that PersonStepGenPage extends PersonStepGenPageGen which extends MapResultPage. 
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
 * <p>By adding a class comment "{@inheritDoc}", the PersonStepGenPage class will inherit the helpful inherited class comments from the super class PersonStepGenPageGen. 
 * </p>
 * <h2>Rows: null</h2>
 * <h2>Model: true</h2>
 * <h2>Page: true</h2>
 * <h2>SuperPage.enUS: null</h2>
 * <h2>Promise: true</h2>
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the PersonStepGenPage Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * Delete the class PersonStepGenPage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStepGenPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.traffic.person.step in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * Generated: true
 **/
public abstract class PersonStepGenPageGen<DEV> extends MapResultPage {
	protected static final Logger LOG = LoggerFactory.getLogger(PersonStepGenPage.class);

	///////////////////////////
	// searchListPersonStep_ //
	///////////////////////////


	/**	 The entity searchListPersonStep_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<PersonStep> searchListPersonStep_;

	/**	<br> The entity searchListPersonStep_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStepGenPage&fq=entiteVar_enUS_indexed_string:searchListPersonStep_">Find the entity searchListPersonStep_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchListPersonStep_(Wrap<SearchList<PersonStep>> w);

	public SearchList<PersonStep> getSearchListPersonStep_() {
		return searchListPersonStep_;
	}

	public void setSearchListPersonStep_(SearchList<PersonStep> searchListPersonStep_) {
		this.searchListPersonStep_ = searchListPersonStep_;
	}
	public static SearchList<PersonStep> staticSetSearchListPersonStep_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected PersonStepGenPage searchListPersonStep_Init() {
		Wrap<SearchList<PersonStep>> searchListPersonStep_Wrap = new Wrap<SearchList<PersonStep>>().var("searchListPersonStep_");
		if(searchListPersonStep_ == null) {
			_searchListPersonStep_(searchListPersonStep_Wrap);
			Optional.ofNullable(searchListPersonStep_Wrap.getO()).ifPresent(o -> {
				setSearchListPersonStep_(o);
			});
		}
		return (PersonStepGenPage)this;
	}

	////////////////////
	// listPersonStep //
	////////////////////


	/**	 The entity listPersonStep
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listPersonStep = new JsonArray();

	/**	<br> The entity listPersonStep
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStepGenPage&fq=entiteVar_enUS_indexed_string:listPersonStep">Find the entity listPersonStep in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _listPersonStep(JsonArray l);

	public JsonArray getListPersonStep() {
		return listPersonStep;
	}

	public void setListPersonStep(JsonArray listPersonStep) {
		this.listPersonStep = listPersonStep;
	}
	@JsonIgnore
	public void setListPersonStep(String o) {
		this.listPersonStep = PersonStepGenPage.staticSetListPersonStep(siteRequest_, o);
	}
	public static JsonArray staticSetListPersonStep(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonArray(o);
		}
		return null;
	}
	protected PersonStepGenPage listPersonStepInit() {
		_listPersonStep(listPersonStep);
		return (PersonStepGenPage)this;
	}

	public static String staticSearchListPersonStep(SiteRequestEnUS siteRequest_, JsonArray o) {
		return o.toString();
	}

	public static String staticSearchStrListPersonStep(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqListPersonStep(SiteRequestEnUS siteRequest_, String o) {
		return PersonStepGenPage.staticSearchStrListPersonStep(siteRequest_, PersonStepGenPage.staticSearchListPersonStep(siteRequest_, PersonStepGenPage.staticSetListPersonStep(siteRequest_, o)));
	}

	/////////////////////
	// personStepCount //
	/////////////////////


	/**	 The entity personStepCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer personStepCount;

	/**	<br> The entity personStepCount
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStepGenPage&fq=entiteVar_enUS_indexed_string:personStepCount">Find the entity personStepCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _personStepCount(Wrap<Integer> w);

	public Integer getPersonStepCount() {
		return personStepCount;
	}

	public void setPersonStepCount(Integer personStepCount) {
		this.personStepCount = personStepCount;
	}
	@JsonIgnore
	public void setPersonStepCount(String o) {
		this.personStepCount = PersonStepGenPage.staticSetPersonStepCount(siteRequest_, o);
	}
	public static Integer staticSetPersonStepCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected PersonStepGenPage personStepCountInit() {
		Wrap<Integer> personStepCountWrap = new Wrap<Integer>().var("personStepCount");
		if(personStepCount == null) {
			_personStepCount(personStepCountWrap);
			Optional.ofNullable(personStepCountWrap.getO()).ifPresent(o -> {
				setPersonStepCount(o);
			});
		}
		return (PersonStepGenPage)this;
	}

	public static Integer staticSearchPersonStepCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrPersonStepCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPersonStepCount(SiteRequestEnUS siteRequest_, String o) {
		return PersonStepGenPage.staticSearchStrPersonStepCount(siteRequest_, PersonStepGenPage.staticSearchPersonStepCount(siteRequest_, PersonStepGenPage.staticSetPersonStepCount(siteRequest_, o)));
	}

	/////////////////
	// personStep_ //
	/////////////////


	/**	 The entity personStep_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected PersonStep personStep_;

	/**	<br> The entity personStep_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStepGenPage&fq=entiteVar_enUS_indexed_string:personStep_">Find the entity personStep_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _personStep_(Wrap<PersonStep> w);

	public PersonStep getPersonStep_() {
		return personStep_;
	}

	public void setPersonStep_(PersonStep personStep_) {
		this.personStep_ = personStep_;
	}
	public static PersonStep staticSetPersonStep_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected PersonStepGenPage personStep_Init() {
		Wrap<PersonStep> personStep_Wrap = new Wrap<PersonStep>().var("personStep_");
		if(personStep_ == null) {
			_personStep_(personStep_Wrap);
			Optional.ofNullable(personStep_Wrap.getO()).ifPresent(o -> {
				setPersonStep_(o);
			});
		}
		return (PersonStepGenPage)this;
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStepGenPage&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = PersonStepGenPage.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PersonStepGenPage idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			Optional.ofNullable(idWrap.getO()).ifPresent(o -> {
				setId(o);
			});
		}
		return (PersonStepGenPage)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return PersonStepGenPage.staticSearchStrId(siteRequest_, PersonStepGenPage.staticSearchId(siteRequest_, PersonStepGenPage.staticSetId(siteRequest_, o)));
	}

	///////////////////////
	// pageUriPersonStep //
	///////////////////////


	/**	 The entity pageUriPersonStep
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUriPersonStep;

	/**	<br> The entity pageUriPersonStep
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStepGenPage&fq=entiteVar_enUS_indexed_string:pageUriPersonStep">Find the entity pageUriPersonStep in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUriPersonStep(Wrap<String> c);

	public String getPageUriPersonStep() {
		return pageUriPersonStep;
	}
	public void setPageUriPersonStep(String o) {
		this.pageUriPersonStep = PersonStepGenPage.staticSetPageUriPersonStep(siteRequest_, o);
	}
	public static String staticSetPageUriPersonStep(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PersonStepGenPage pageUriPersonStepInit() {
		Wrap<String> pageUriPersonStepWrap = new Wrap<String>().var("pageUriPersonStep");
		if(pageUriPersonStep == null) {
			_pageUriPersonStep(pageUriPersonStepWrap);
			Optional.ofNullable(pageUriPersonStepWrap.getO()).ifPresent(o -> {
				setPageUriPersonStep(o);
			});
		}
		return (PersonStepGenPage)this;
	}

	public static String staticSearchPageUriPersonStep(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUriPersonStep(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUriPersonStep(SiteRequestEnUS siteRequest_, String o) {
		return PersonStepGenPage.staticSearchStrPageUriPersonStep(siteRequest_, PersonStepGenPage.staticSearchPageUriPersonStep(siteRequest_, PersonStepGenPage.staticSetPageUriPersonStep(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepPersonStepGenPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepPersonStepGenPage();
	}

	public Future<Void> promiseDeepPersonStepGenPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promisePersonStepGenPage(promise2);
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

	public Future<Void> promisePersonStepGenPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				searchListPersonStep_Init();
				listPersonStepInit();
				personStepCountInit();
				personStep_Init();
				idInit();
				pageUriPersonStepInit();
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
		return promiseDeepPersonStepGenPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestPersonStepGenPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestMapResultPage(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestPersonStepGenPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainPersonStepGenPage(v);
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
	public Object obtainPersonStepGenPage(String var) {
		PersonStepGenPage oPersonStepGenPage = (PersonStepGenPage)this;
		switch(var) {
			case "searchListPersonStep_":
				return oPersonStepGenPage.searchListPersonStep_;
			case "listPersonStep":
				return oPersonStepGenPage.listPersonStep;
			case "personStepCount":
				return oPersonStepGenPage.personStepCount;
			case "personStep_":
				return oPersonStepGenPage.personStep_;
			case "id":
				return oPersonStepGenPage.id;
			case "pageUriPersonStep":
				return oPersonStepGenPage.pageUriPersonStep;
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
				o = relatePersonStepGenPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relatePersonStepGenPage(String var, Object val) {
		PersonStepGenPage oPersonStepGenPage = (PersonStepGenPage)this;
		switch(var) {
			default:
				return super.relateMapResultPage(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetPersonStepGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetPersonStepGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listPersonStep":
			return PersonStepGenPage.staticSetListPersonStep(siteRequest_, o);
		case "personStepCount":
			return PersonStepGenPage.staticSetPersonStepCount(siteRequest_, o);
		case "id":
			return PersonStepGenPage.staticSetId(siteRequest_, o);
		case "pageUriPersonStep":
			return PersonStepGenPage.staticSetPageUriPersonStep(siteRequest_, o);
			default:
				return MapResultPage.staticSetMapResultPage(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchPersonStepGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchPersonStepGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listPersonStep":
			return PersonStepGenPage.staticSearchListPersonStep(siteRequest_, (JsonArray)o);
		case "personStepCount":
			return PersonStepGenPage.staticSearchPersonStepCount(siteRequest_, (Integer)o);
		case "id":
			return PersonStepGenPage.staticSearchId(siteRequest_, (String)o);
		case "pageUriPersonStep":
			return PersonStepGenPage.staticSearchPageUriPersonStep(siteRequest_, (String)o);
			default:
				return MapResultPage.staticSearchMapResultPage(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrPersonStepGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrPersonStepGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "listPersonStep":
			return PersonStepGenPage.staticSearchStrListPersonStep(siteRequest_, (String)o);
		case "personStepCount":
			return PersonStepGenPage.staticSearchStrPersonStepCount(siteRequest_, (Integer)o);
		case "id":
			return PersonStepGenPage.staticSearchStrId(siteRequest_, (String)o);
		case "pageUriPersonStep":
			return PersonStepGenPage.staticSearchStrPageUriPersonStep(siteRequest_, (String)o);
			default:
				return MapResultPage.staticSearchStrMapResultPage(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqPersonStepGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqPersonStepGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "listPersonStep":
			return PersonStepGenPage.staticSearchFqListPersonStep(siteRequest_, o);
		case "personStepCount":
			return PersonStepGenPage.staticSearchFqPersonStepCount(siteRequest_, o);
		case "id":
			return PersonStepGenPage.staticSearchFqId(siteRequest_, o);
		case "pageUriPersonStep":
			return PersonStepGenPage.staticSearchFqPageUriPersonStep(siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "PersonStepGenPage";
	public static final String VAR_searchListPersonStep_ = "searchListPersonStep_";
	public static final String VAR_listPersonStep = "listPersonStep";
	public static final String VAR_personStepCount = "personStepCount";
	public static final String VAR_personStep_ = "personStep_";
	public static final String VAR_id = "id";
	public static final String VAR_pageUriPersonStep = "pageUriPersonStep";

	public static final String DISPLAY_NAME_searchListPersonStep_ = "";
	public static final String DISPLAY_NAME_listPersonStep = "";
	public static final String DISPLAY_NAME_personStepCount = "";
	public static final String DISPLAY_NAME_personStep_ = "";
	public static final String DISPLAY_NAME_id = "";
	public static final String DISPLAY_NAME_pageUriPersonStep = "";

	public static String displayNameForClass(String var) {
		return PersonStepGenPage.displayNamePersonStepGenPage(var);
	}
	public static String displayNamePersonStepGenPage(String var) {
		switch(var) {
		case VAR_searchListPersonStep_:
			return DISPLAY_NAME_searchListPersonStep_;
		case VAR_listPersonStep:
			return DISPLAY_NAME_listPersonStep;
		case VAR_personStepCount:
			return DISPLAY_NAME_personStepCount;
		case VAR_personStep_:
			return DISPLAY_NAME_personStep_;
		case VAR_id:
			return DISPLAY_NAME_id;
		case VAR_pageUriPersonStep:
			return DISPLAY_NAME_pageUriPersonStep;
		default:
			return MapResultPage.displayNameMapResultPage(var);
		}
	}
}
