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
import org.computate.smartvillageview.enus.result.map.MapResult;
import java.lang.String;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;
import io.vertx.core.json.JsonObject;

/**	
<ol>
0<h3>Suggestions that can generate more code for you: </h3></ol>
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class BicycleStepGen into the class BicycleStep. 
 * </li><li>You can add a class comment "Model: true" if you wish to persist these BicycleStep objects in a relational PostgreSQL database transactionally in the RESTful API. 
 * The code to persist and query the BicycleStepGen data in the database will then be automatically generated. 
 * </li>
 * <h3>About the BicycleStep class and it's generated class BicycleStepGen&lt;MapResult&gt;: </h3>extends BicycleStepGen
 * <p>
 * This Java class extends a generated Java class BicycleStepGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.bicycle.step.BicycleStep">Find the class BicycleStep in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends BicycleStepGen<MapResult>
 * <p>This <code>class BicycleStep extends BicycleStepGen&lt;MapResult&gt;</code>, which means it extends a newly generated BicycleStepGen. 
 * The generated <code>class BicycleStepGen extends MapResult</code> which means that BicycleStep extends BicycleStepGen which extends MapResult. 
 * This generated inheritance is a powerful feature that allows a lot of boiler plate code to be created for you automatically while still preserving inheritance through the power of Java Generic classes. 
 * </p>
 * <h2>Api: true</h2>
 * <p>This class contains a comment <b>"Api: true"</b>, which means this class will have Java Vert.x API backend code generated for these objects. 
 * </p>
 * <h2>ApiMethode: Search</h2>
 * <p>This class contains a comment <b>"ApiMethod: Search"</b>, which creates an API "Search". 
 * </p>
 * <h2>ApiMethode: GET</h2>
 * <p>This class contains a comment <b>"ApiMethod: GET"</b>, which creates an API "GET". 
 * </p>
 * <h2>ApiMethode: PATCH</h2>
 * <p>This class contains a comment <b>"ApiMethod: PATCH"</b>, which creates an API "PATCH". 
 * </p>
 * <h2>ApiMethode: POST</h2>
 * <p>This class contains a comment <b>"ApiMethod: POST"</b>, which creates an API "POST". 
 * </p>
 * <h2>ApiMethode: PUTImport</h2>
 * <p>This class contains a comment <b>"ApiMethod: PUTImport"</b>, which creates an API "PUTImport". 
 * </p>
 * <h2>ApiMethode: SearchPage</h2>
 * <p>This class contains a comment <b>"ApiMethod: SearchPage"</b>, which creates an API "SearchPage". 
 * </p>
 * <h2>ApiTag.enUS: true</h2>
 * <p>This class contains a comment <b>"ApiTag: Bicycle Step"</b>, which groups all of the OpenAPIs for BicycleStep objects under the tag "Bicycle Step". 
 * </p>
 * <h2>ApiUri.enUS: /api/bicycle-step</h2>
 * <p>This class contains a comment <b>"ApiUri: /api/bicycle-step"</b>, which defines the base API URI for BicycleStep objects as "/api/bicycle-step" in the OpenAPI spec. 
 * </p>
 * <h2>Color: 2017-shaded-spruce</h2>
 * <p>This class contains a comment <b>"Color: 2017-shaded-spruce"</b>, which styles the BicycleStep page "2017-shaded-spruce". 
 * This will reference a CSS class defined by the stylesheets in the project that starts with "w3-". 
 * A css class of "w3-2017-shaded-spruce" is expected to exist in the project stylesheets, and is inspired by W3 CSS colors. 
 * See: <a href="https://www.w3schools.com/w3css/w3css_colors.asp">https://www.w3schools.com/w3css/w3css_colors.asp</a>. 
 * </p>
 * <h2>IconGroup: duotone</h2>
 * <p>This class contains a comment <b>"IconGroup: duotone"</b>, which adds icons on the BicycleStep page with a group of "duotone". 
 * This will reference a Font Awesome icon group that starts with "fa-" followed by the icon group "duotone", together is "fa-duotone". 
 * A Font Awesome icon group of "duotone" is expected to exist. 
 * The Font Awesome groups currently supported include: solid, regular, light, thin, duotone, sharp, and kit. 
 * See: <a href="https://fontawesome.com/docs/web/dig-deeper/styles">https://fontawesome.com/docs/web/dig-deeper/styles</a>. 
 * </p>
 * <h2>IconName: map-location-dot</h2>
 * <p>This class contains a comment <b>"IconName: map-location-dot"</b>, which adds icons on the BicycleStep page with a name of "map-location-dot". 
 * This will reference a Font Awesome icon that starts with the icon group "fa-duotone fa-" followed by the icon name, which is "fa-duotone fa-map-location-dot". 
 * A Font Awesome icon of "fa-duotone fa-map-location-dot" is expected to exist. 
 * See: <a href="https://fontawesome.com/icons">https://fontawesome.com/icons</a>. 
 * </p>
 * <h2>Indexed: true</h2>
 * <p>This class contains a comment <b>"Indexed: true"</b>, which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * <h2>{@inheritDoc}</h2>
 * <p>By adding a class comment "{@inheritDoc}", the BicycleStep class will inherit the helpful inherited class comments from the super class BicycleStepGen. 
 * </p>
 * <h2>Rows: 100</h2>
 * <p>This class contains a comment <b>"Rows: 100"</b>, which means the BicycleStep API will return a default of 100 records instead of 10 by default. 
 * Each API has built in pagination of the search records to ensure a user can query all the data a page at a time without running the application out of memory. 
 * </p>
 * <h2>Order: 16</h2>
 * <p>This class contains a comment <b>"Order: 16"</b>, which means this class will be sorted by the given number 16 ascending when code that relates to multiple classes at the same time is generated. 
 * </p>
 * <h2>Model: true</h2>
 * <h2>Page: true</h2>
 * <p>This class contains a comment <b>"Page: true"</b>, which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.smartvillageview.enus.model.traffic.bicycle.step.BicycleStepPage. 
 * </p>
 * <h2>SuperPage.enUS: MapResultPage</h2>
 * <p>This class contains a comment <b>"SuperPage.enUS: MapResultPage"</b>, which identifies the Java super class of the page code by it's class simple name "MapResultPage". 
 * This means that the newly created class org.computate.smartvillageview.enus.model.traffic.bicycle.step.BicycleStepPage extends org.computate.smartvillageview.enus.result.map.MapResultPage. 
 * </p>
 * <h2>Promise: true</h2>
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the BicycleStep Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * <h2>Role.enUS: SiteAdmin</h2>
 * <p>
 * This class contains a comment <b>"Role.enUS: SiteAdmin"</b>, which identifies the default role name "SiteAdmin" of the OAuth2/OpenID Connect user role required to access this BicycleStep API. 
 * It's possible to reconfigure the roles required to access the BicycleStep API by configuring an environment variable like this: 
 * </p>
 * <pre>AUTH_ROLE_REQUIRED_BicycleStep: ["SiteAdmin"]</pre>
 * <h2>AName.enUS: a bicycle step</h2>
 * <p>This class contains a comment <b>"AName.enUS: a bicycle step"</b>, which identifies the language context to describe a BicycleStep as "a bicycle step". 
 * </p>
 * <p>
 * Delete the class BicycleStep in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.bicycle.step.BicycleStep&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.traffic.bicycle.step in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.bicycle.step&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * Generated: true
 **/
public abstract class BicycleStepGen<DEV> extends MapResult {
	protected static final Logger LOG = LoggerFactory.getLogger(BicycleStep.class);

	public static final String BicycleStep_AName_enUS = "a bicycle step";
	public static final String BicycleStep_This_enUS = "this ";
	public static final String BicycleStep_ThisName_enUS = "this bicycle step";
	public static final String BicycleStep_A_enUS = "a ";
	public static final String BicycleStep_TheName_enUS = "the bicycle step";
	public static final String BicycleStep_NameSingular_enUS = "bicycle step";
	public static final String BicycleStep_NamePlural_enUS = "bicycle steps";
	public static final String BicycleStep_NameActual_enUS = "current bicycle step";
	public static final String BicycleStep_AllName_enUS = "all the bicycle steps";
	public static final String BicycleStep_SearchAllNameBy_enUS = "search bicycle steps by ";
	public static final String BicycleStep_Title_enUS = "bicycle steps";
	public static final String BicycleStep_ThePluralName_enUS = "the bicycle steps";
	public static final String BicycleStep_NoNameFound_enUS = "no bicycle step found";
	public static final String BicycleStep_ApiUri_enUS = "/api/bicycle-step";
	public static final String BicycleStep_ApiUriSearchPage_enUS = "/bicycle-step";
	public static final String BicycleStep_OfName_enUS = "of bicycle step";
	public static final String BicycleStep_ANameAdjective_enUS = "a bicycle step";
	public static final String BicycleStep_NameAdjectiveSingular_enUS = "bicycle step";
	public static final String BicycleStep_NameAdjectivePlural_enUS = "bicycle steps";
	public static final String Search_enUS_Uri = "/api/bicycle-step";
	public static final String Search_enUS_ImageUri = "/png/api/bicycle-step-999.png";
	public static final String GET_enUS_Uri = "/api/bicycle-step/{id}";
	public static final String GET_enUS_ImageUri = "/png/api/bicycle-step/{id}-999.png";
	public static final String PATCH_enUS_Uri = "/api/bicycle-step";
	public static final String PATCH_enUS_ImageUri = "/png/api/bicycle-step-999.png";
	public static final String POST_enUS_Uri = "/api/bicycle-step";
	public static final String POST_enUS_ImageUri = "/png/api/bicycle-step-999.png";
	public static final String PUTImport_enUS_Uri = "/api/bicycle-step-import";
	public static final String PUTImport_enUS_ImageUri = "/png/api/bicycle-step-import-999.png";
	public static final String SearchPage_enUS_Uri = "/bicycle-step";
	public static final String SearchPage_enUS_ImageUri = "/png/bicycle-step-999.png";

	public static final String BicycleStep_Color = "2017-shaded-spruce";
	public static final String BicycleStep_IconGroup = "duotone";
	public static final String BicycleStep_IconName = "map-location-dot";
	public static final Integer BicycleStep_Rows = 100;

	///////////////
	// bicycleId //
	///////////////


	/**	 The entity bicycleId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String bicycleId;

	/**	<br> The entity bicycleId
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.bicycle.step.BicycleStep&fq=entiteVar_enUS_indexed_string:bicycleId">Find the entity bicycleId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _bicycleId(Wrap<String> w);

	public String getBicycleId() {
		return bicycleId;
	}
	public void setBicycleId(String o) {
		this.bicycleId = BicycleStep.staticSetBicycleId(siteRequest_, o);
	}
	public static String staticSetBicycleId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected BicycleStep bicycleIdInit() {
		Wrap<String> bicycleIdWrap = new Wrap<String>().var("bicycleId");
		if(bicycleId == null) {
			_bicycleId(bicycleIdWrap);
			Optional.ofNullable(bicycleIdWrap.getO()).ifPresent(o -> {
				setBicycleId(o);
			});
		}
		return (BicycleStep)this;
	}

	public static String staticSearchBicycleId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrBicycleId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqBicycleId(SiteRequestEnUS siteRequest_, String o) {
		return BicycleStep.staticSearchStrBicycleId(siteRequest_, BicycleStep.staticSearchBicycleId(siteRequest_, BicycleStep.staticSetBicycleId(siteRequest_, o)));
	}

	public String sqlBicycleId() {
		return bicycleId;
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepBicycleStep(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepBicycleStep();
	}

	public Future<Void> promiseDeepBicycleStep() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseBicycleStep(promise2);
		promise2.future().onSuccess(a -> {
			super.promiseDeepMapResult(siteRequest_).onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseBicycleStep(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				bicycleIdInit();
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
		return promiseDeepBicycleStep(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestBicycleStep(SiteRequestEnUS siteRequest_) {
			super.siteRequestMapResult(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestBicycleStep(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainBicycleStep(v);
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
	public Object obtainBicycleStep(String var) {
		BicycleStep oBicycleStep = (BicycleStep)this;
		switch(var) {
			case "bicycleId":
				return oBicycleStep.bicycleId;
			default:
				return super.obtainMapResult(var);
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
				o = relateBicycleStep(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateBicycleStep(String var, Object val) {
		BicycleStep oBicycleStep = (BicycleStep)this;
		switch(var) {
			default:
				return super.relateMapResult(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetBicycleStep(entityVar,  siteRequest_, o);
	}
	public static Object staticSetBicycleStep(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "bicycleId":
			return BicycleStep.staticSetBicycleId(siteRequest_, o);
			default:
				return MapResult.staticSetMapResult(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchBicycleStep(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchBicycleStep(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "bicycleId":
			return BicycleStep.staticSearchBicycleId(siteRequest_, (String)o);
			default:
				return MapResult.staticSearchMapResult(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrBicycleStep(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrBicycleStep(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "bicycleId":
			return BicycleStep.staticSearchStrBicycleId(siteRequest_, (String)o);
			default:
				return MapResult.staticSearchStrMapResult(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqBicycleStep(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqBicycleStep(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "bicycleId":
			return BicycleStep.staticSearchFqBicycleId(siteRequest_, o);
			default:
				return MapResult.staticSearchFqMapResult(entityVar,  siteRequest_, o);
		}
	}

	/////////////
	// persist //
	/////////////

	@Override public boolean persistForClass(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		if(val != null) {
			for(String v : vars) {
				if(o == null)
					o = persistBicycleStep(v, val);
				else if(o instanceof BaseModel) {
					BaseModel oBaseModel = (BaseModel)o;
					o = oBaseModel.persistForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object persistBicycleStep(String var, Object val) {
		String varLower = var.toLowerCase();
			if("bicycleid".equals(varLower)) {
				if(val instanceof String) {
					setBicycleId((String)val);
				}
				saves.add("bicycleId");
				return val;
		} else {
			return super.persistMapResult(var, val);
		}
	}

	/////////////
	// populate //
	/////////////

	@Override public void populateForClass(SolrResponse.Doc doc) {
		populateBicycleStep(doc);
	}
	public void populateBicycleStep(SolrResponse.Doc doc) {
		BicycleStep oBicycleStep = (BicycleStep)this;
		saves = doc.get("saves_docvalues_strings");
		if(saves != null) {

			if(saves.contains("bicycleId")) {
				String bicycleId = (String)doc.get("bicycleId_docvalues_string");
				if(bicycleId != null)
					oBicycleStep.setBicycleId(bicycleId);
			}
		}

		super.populateMapResult(doc);
	}

	public void indexBicycleStep(JsonObject doc) {
		if(bicycleId != null) {
			doc.put("bicycleId_docvalues_string", bicycleId);
		}
		super.indexMapResult(doc);

	}

	public static String varStoredBicycleStep(String entityVar) {
		switch(entityVar) {
			case "bicycleId":
				return "bicycleId_docvalues_string";
			default:
				return MapResult.varStoredMapResult(entityVar);
		}
	}

	public static String varIndexedBicycleStep(String entityVar) {
		switch(entityVar) {
			case "bicycleId":
				return "bicycleId_docvalues_string";
			default:
				return MapResult.varIndexedMapResult(entityVar);
		}
	}

	public static String searchVarBicycleStep(String searchVar) {
		switch(searchVar) {
			case "bicycleId_docvalues_string":
				return "bicycleId";
			default:
				return MapResult.searchVarMapResult(searchVar);
		}
	}

	public static String varSearchBicycleStep(String entityVar) {
		switch(entityVar) {
			default:
				return MapResult.varSearchMapResult(entityVar);
		}
	}

	public static String varSuggestedBicycleStep(String entityVar) {
		switch(entityVar) {
			default:
				return MapResult.varSuggestedMapResult(entityVar);
		}
	}

	/////////////
	// store //
	/////////////

	@Override public void storeForClass(SolrResponse.Doc doc) {
		storeBicycleStep(doc);
	}
	public void storeBicycleStep(SolrResponse.Doc doc) {
		BicycleStep oBicycleStep = (BicycleStep)this;

		oBicycleStep.setBicycleId(Optional.ofNullable(doc.get("bicycleId_docvalues_string")).map(v -> v.toString()).orElse(null));

		super.storeMapResult(doc);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestBicycleStep() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof BicycleStep) {
			BicycleStep original = (BicycleStep)o;
			if(!Objects.equals(bicycleId, original.getBicycleId()))
				apiRequest.addVars("bicycleId");
			super.apiRequestMapResult();
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(Optional.ofNullable(bicycleId).map(v -> "bicycleId: \"" + v + "\"\n" ).orElse(""));
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "BicycleStep";
	public static final String VAR_bicycleId = "bicycleId";

	public static List<String> varsQForClass() {
		return BicycleStep.varsQBicycleStep(new ArrayList<String>());
	}
	public static List<String> varsQBicycleStep(List<String> vars) {
		MapResult.varsQMapResult(vars);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return BicycleStep.varsFqBicycleStep(new ArrayList<String>());
	}
	public static List<String> varsFqBicycleStep(List<String> vars) {
		vars.add(VAR_bicycleId);
		MapResult.varsFqMapResult(vars);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return BicycleStep.varsRangeBicycleStep(new ArrayList<String>());
	}
	public static List<String> varsRangeBicycleStep(List<String> vars) {
		MapResult.varsRangeMapResult(vars);
		return vars;
	}

	public static final String DISPLAY_NAME_bicycleId = "bicycle ID";

	public static String displayNameForClass(String var) {
		return BicycleStep.displayNameBicycleStep(var);
	}
	public static String displayNameBicycleStep(String var) {
		switch(var) {
		case VAR_bicycleId:
			return DISPLAY_NAME_bicycleId;
		default:
			return MapResult.displayNameMapResult(var);
		}
	}

	public static String descriptionBicycleStep(String var) {
		switch(var) {
			default:
				return MapResult.descriptionMapResult(var);
		}
	}

	public static String classSimpleNameBicycleStep(String var) {
		switch(var) {
		case VAR_bicycleId:
			return "String";
			default:
				return MapResult.classSimpleNameMapResult(var);
		}
	}

	public static Integer htmColumnBicycleStep(String var) {
		switch(var) {
			default:
				return MapResult.htmColumnMapResult(var);
		}
	}

	public static Integer htmRowBicycleStep(String var) {
		switch(var) {
		case VAR_bicycleId:
			return 4;
			default:
				return MapResult.htmRowMapResult(var);
		}
	}

	public static Integer htmCellBicycleStep(String var) {
		switch(var) {
		case VAR_bicycleId:
			return 3;
			default:
				return MapResult.htmCellMapResult(var);
		}
	}

	public static Integer lengthMinBicycleStep(String var) {
		switch(var) {
			default:
				return MapResult.lengthMinMapResult(var);
		}
	}

	public static Integer lengthMaxBicycleStep(String var) {
		switch(var) {
			default:
				return MapResult.lengthMaxMapResult(var);
		}
	}

	public static Integer maxBicycleStep(String var) {
		switch(var) {
			default:
				return MapResult.maxMapResult(var);
		}
	}

	public static Integer minBicycleStep(String var) {
		switch(var) {
			default:
				return MapResult.minMapResult(var);
		}
	}
}
