package org.computate.smartvillageview.enus.model.traffic.person.step;

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
import org.computate.smartvillageview.enus.result.map.MapResult;
import java.lang.String;
import java.math.BigDecimal;
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
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class PersonStepGen into the class PersonStep. 
 * </li><li>You can add a class comment "Model: true" if you wish to persist these PersonStep objects in a relational PostgreSQL database transactionally in the RESTful API. 
 * The code to persist and query the PersonStepGen data in the database will then be automatically generated. 
 * </li>
 * <h3>About the PersonStep class and it's generated class PersonStepGen&lt;MapResult&gt;: </h3>extends PersonStepGen
 * <p>
 * This Java class extends a generated Java class PersonStepGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep">Find the class PersonStep in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends PersonStepGen<MapResult>
 * <p>This <code>class PersonStep extends PersonStepGen&lt;MapResult&gt;</code>, which means it extends a newly generated PersonStepGen. 
 * The generated <code>class PersonStepGen extends MapResult</code> which means that PersonStep extends PersonStepGen which extends MapResult. 
 * This generated inheritance is a powerful feature that allows a lot of boiler plate code to be created for you automatically while still preserving inheritance through the power of Java Generic classes. 
 * </p>
 * Api: true
 * <p>This class contains a comment <b>"Api: true"</b>, which means this class will have Java Vert.x API backend code generated for these objects. 
 * </p>
 * ApiMethode: Search
 * <p>This class contains a comment <b>"ApiMethod: Search"</b>, which creates an API "Search". 
 * </p>
 * ApiMethode: GET
 * <p>This class contains a comment <b>"ApiMethod: GET"</b>, which creates an API "GET". 
 * </p>
 * ApiMethode: PATCH
 * <p>This class contains a comment <b>"ApiMethod: PATCH"</b>, which creates an API "PATCH". 
 * </p>
 * ApiMethode: POST
 * <p>This class contains a comment <b>"ApiMethod: POST"</b>, which creates an API "POST". 
 * </p>
 * ApiMethode: PUTImport
 * <p>This class contains a comment <b>"ApiMethod: PUTImport"</b>, which creates an API "PUTImport". 
 * </p>
 * ApiMethode: SearchPage
 * <p>This class contains a comment <b>"ApiMethod: SearchPage"</b>, which creates an API "SearchPage". 
 * </p>
 * ApiTag.enUS: true
 * <p>This class contains a comment <b>"ApiTag: Person Step"</b>, which groups all of the OpenAPIs for PersonStep objects under the tag "Person Step". 
 * </p>
 * ApiUri.enUS: /api/person-step
 * <p>This class contains a comment <b>"ApiUri: /api/person-step"</b>, which defines the base API URI for PersonStep objects as "/api/person-step" in the OpenAPI spec. 
 * </p>
 * Color: 2017-shaded-spruce
 * <p>This class contains a comment <b>"Color: 2017-shaded-spruce"</b>, which styles the PersonStep page "2017-shaded-spruce". 
 * This will reference a CSS class defined by the stylesheets in the project that starts with "w3-". 
 * A css class of "w3-2017-shaded-spruce" is expected to exist in the project stylesheets, and is inspired by W3 CSS colors. 
 * See: <a href="https://www.w3schools.com/w3css/w3css_colors.asp">https://www.w3schools.com/w3css/w3css_colors.asp</a>. 
 * </p>
 * IconGroup: duotone
 * <p>This class contains a comment <b>"IconGroup: duotone"</b>, which adds icons on the PersonStep page with a group of "duotone". 
 * This will reference a Font Awesome icon group that starts with "fa-" followed by the icon group "duotone", together is "fa-duotone". 
 * A Font Awesome icon group of "duotone" is expected to exist. 
 * The Font Awesome groups currently supported include: solid, regular, light, thin, duotone, sharp, and kit. 
 * See: <a href="https://fontawesome.com/docs/web/dig-deeper/styles">https://fontawesome.com/docs/web/dig-deeper/styles</a>. 
 * </p>
 * IconName: map-location-dot
 * <p>This class contains a comment <b>"IconName: map-location-dot"</b>, which adds icons on the PersonStep page with a name of "map-location-dot". 
 * This will reference a Font Awesome icon that starts with the icon group "fa-duotone fa-" followed by the icon name, which is "fa-duotone fa-map-location-dot". 
 * A Font Awesome icon of "fa-duotone fa-map-location-dot" is expected to exist. 
 * See: <a href="https://fontawesome.com/icons">https://fontawesome.com/icons</a>. 
 * </p>
 * Indexed: true
 * <p>This class contains a comment <b>"Indexed: true"</b>, which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * {@inheritDoc}
 * <p>By adding a class comment "{@inheritDoc}", the PersonStep class will inherit the helpful inherited class comments from the super class PersonStepGen. 
 * </p>
 * Rows: 100
 * <p>This class contains a comment <b>"Rows: 100"</b>, which means the PersonStep API will return a default of 100 records instead of 10 by default. 
 * Each API has built in pagination of the search records to ensure a user can query all the data a page at a time without running the application out of memory. 
 * </p>
 * Order: 14
 * <p>This class contains a comment <b>"Order: 14"</b>, which means this class will be sorted by the given number 14 ascending when code that relates to multiple classes at the same time is generated. 
 * </p>
 * Model: true
 * Page: true
 * <p>This class contains a comment <b>"Page: true"</b>, which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.smartvillageview.enus.model.traffic.person.step.PersonStepPage. 
 * </p>
 * SuperPage.enUS: MapResultPage
 * <p>This class contains a comment <b>"SuperPage.enUS: MapResultPage"</b>, which identifies the Java super class of the page code by it's class simple name "MapResultPage". 
 * This means that the newly created class org.computate.smartvillageview.enus.model.traffic.person.step.PersonStepPage extends org.computate.smartvillageview.enus.result.map.MapResultPage. 
 * </p>
 * Promise: true
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the PersonStep Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * Role.enUS: SiteAdmin
 * <p>
 * This class contains a comment <b>"Role.enUS: SiteAdmin"</b>, which identifies the default role name "SiteAdmin" of the OAuth2/OpenID Connect user role required to access this PersonStep API. 
 * It's possible to reconfigure the roles required to access the PersonStep API by configuring an environment variable like this: 
 * </p>
 * <pre>AUTH_ROLE_REQUIRED_PersonStep: ["SiteAdmin"]</pre>
 * AName.enUS: a person step
 * <p>This class contains a comment <b>"AName.enUS: a person step"</b>, which identifies the language context to describe a PersonStep as "a person step". 
 * </p>
 * <p>
 * Delete the class PersonStep in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.traffic.person.step in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class PersonStepGen<DEV> extends MapResult {
	protected static final Logger LOG = LoggerFactory.getLogger(PersonStep.class);

	public static final String PersonStep_AName_enUS = "a person step";
	public static final String PersonStep_This_enUS = "this ";
	public static final String PersonStep_ThisName_enUS = "this person step";
	public static final String PersonStep_A_enUS = "a ";
	public static final String PersonStep_TheName_enUS = "the person step";
	public static final String PersonStep_NameSingular_enUS = "person step";
	public static final String PersonStep_NamePlural_enUS = "person steps";
	public static final String PersonStep_NameActual_enUS = "current person step";
	public static final String PersonStep_AllName_enUS = "all the person steps";
	public static final String PersonStep_SearchAllNameBy_enUS = "search person steps by ";
	public static final String PersonStep_Title_enUS = "person steps";
	public static final String PersonStep_ThePluralName_enUS = "the person steps";
	public static final String PersonStep_NoNameFound_enUS = "no person step found";
	public static final String PersonStep_ApiUri_enUS = "/api/person-step";
	public static final String PersonStep_ApiUriSearchPage_enUS = "/person-step";
	public static final String PersonStep_OfName_enUS = "of person step";
	public static final String PersonStep_ANameAdjective_enUS = "a person step";
	public static final String PersonStep_NameAdjectiveSingular_enUS = "person step";
	public static final String PersonStep_NameAdjectivePlural_enUS = "person steps";
	public static final String Search_enUS_Uri = "/api/person-step";
	public static final String Search_enUS_ImageUri = "/png/api/person-step-999.png";
	public static final String GET_enUS_Uri = "/api/person-step/{id}";
	public static final String GET_enUS_ImageUri = "/png/api/person-step/{id}-999.png";
	public static final String PATCH_enUS_Uri = "/api/person-step";
	public static final String PATCH_enUS_ImageUri = "/png/api/person-step-999.png";
	public static final String POST_enUS_Uri = "/api/person-step";
	public static final String POST_enUS_ImageUri = "/png/api/person-step-999.png";
	public static final String PUTImport_enUS_Uri = "/api/person-step-import";
	public static final String PUTImport_enUS_ImageUri = "/png/api/person-step-import-999.png";
	public static final String SearchPage_enUS_Uri = "/person-step";
	public static final String SearchPage_enUS_ImageUri = "/png/person-step-999.png";

	public static final String PersonStep_Color = "2017-shaded-spruce";
	public static final String PersonStep_IconGroup = "duotone";
	public static final String PersonStep_IconName = "map-location-dot";
	public static final Integer PersonStep_Rows = 100;

	////////////////////
	// simulationName //
	////////////////////


	/**	 The entity simulationName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String simulationName;

	/**	<br> The entity simulationName
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:simulationName">Find the entity simulationName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _simulationName(Wrap<String> w);

	public String getSimulationName() {
		return simulationName;
	}
	public void setSimulationName(String o) {
		this.simulationName = PersonStep.staticSetSimulationName(siteRequest_, o);
	}
	public static String staticSetSimulationName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PersonStep simulationNameInit() {
		Wrap<String> simulationNameWrap = new Wrap<String>().var("simulationName");
		if(simulationName == null) {
			_simulationName(simulationNameWrap);
			Optional.ofNullable(simulationNameWrap.getO()).ifPresent(o -> {
				setSimulationName(o);
			});
		}
		return (PersonStep)this;
	}

	public static String staticSearchSimulationName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSimulationName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSimulationName(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrSimulationName(siteRequest_, PersonStep.staticSearchSimulationName(siteRequest_, PersonStep.staticSetSimulationName(siteRequest_, o)));
	}

	public String sqlSimulationName() {
		return simulationName;
	}

	/////////////////
	// sumocfgPath //
	/////////////////


	/**	 The entity sumocfgPath
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String sumocfgPath;

	/**	<br> The entity sumocfgPath
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:sumocfgPath">Find the entity sumocfgPath in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _sumocfgPath(Wrap<String> w);

	public String getSumocfgPath() {
		return sumocfgPath;
	}
	public void setSumocfgPath(String o) {
		this.sumocfgPath = PersonStep.staticSetSumocfgPath(siteRequest_, o);
	}
	public static String staticSetSumocfgPath(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PersonStep sumocfgPathInit() {
		Wrap<String> sumocfgPathWrap = new Wrap<String>().var("sumocfgPath");
		if(sumocfgPath == null) {
			_sumocfgPath(sumocfgPathWrap);
			Optional.ofNullable(sumocfgPathWrap.getO()).ifPresent(o -> {
				setSumocfgPath(o);
			});
		}
		return (PersonStep)this;
	}

	public static String staticSearchSumocfgPath(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSumocfgPath(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSumocfgPath(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrSumocfgPath(siteRequest_, PersonStep.staticSearchSumocfgPath(siteRequest_, PersonStep.staticSetSumocfgPath(siteRequest_, o)));
	}

	public String sqlSumocfgPath() {
		return sumocfgPath;
	}

	//////////////
	// personId //
	//////////////


	/**	 The entity personId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String personId;

	/**	<br> The entity personId
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:personId">Find the entity personId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _personId(Wrap<String> w);

	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String o) {
		this.personId = PersonStep.staticSetPersonId(siteRequest_, o);
	}
	public static String staticSetPersonId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PersonStep personIdInit() {
		Wrap<String> personIdWrap = new Wrap<String>().var("personId");
		if(personId == null) {
			_personId(personIdWrap);
			Optional.ofNullable(personIdWrap.getO()).ifPresent(o -> {
				setPersonId(o);
			});
		}
		return (PersonStep)this;
	}

	public static String staticSearchPersonId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPersonId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPersonId(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrPersonId(siteRequest_, PersonStep.staticSearchPersonId(siteRequest_, PersonStep.staticSetPersonId(siteRequest_, o)));
	}

	public String sqlPersonId() {
		return personId;
	}

	////////////////
	// personType //
	////////////////


	/**	 The entity personType
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String personType;

	/**	<br> The entity personType
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:personType">Find the entity personType in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _personType(Wrap<String> w);

	public String getPersonType() {
		return personType;
	}
	public void setPersonType(String o) {
		this.personType = PersonStep.staticSetPersonType(siteRequest_, o);
	}
	public static String staticSetPersonType(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PersonStep personTypeInit() {
		Wrap<String> personTypeWrap = new Wrap<String>().var("personType");
		if(personType == null) {
			_personType(personTypeWrap);
			Optional.ofNullable(personTypeWrap.getO()).ifPresent(o -> {
				setPersonType(o);
			});
		}
		return (PersonStep)this;
	}

	public static String staticSearchPersonType(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPersonType(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPersonType(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrPersonType(siteRequest_, PersonStep.staticSearchPersonType(siteRequest_, PersonStep.staticSetPersonType(siteRequest_, o)));
	}

	public String sqlPersonType() {
		return personType;
	}

	///////////
	// angle //
	///////////


	/**	 The entity angle
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal angle;

	/**	<br> The entity angle
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:angle">Find the entity angle in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _angle(Wrap<BigDecimal> w);

	public BigDecimal getAngle() {
		return angle;
	}

	public void setAngle(BigDecimal angle) {
		this.angle = angle;
	}
	@JsonIgnore
	public void setAngle(String o) {
		this.angle = PersonStep.staticSetAngle(siteRequest_, o);
	}
	public static BigDecimal staticSetAngle(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setAngle(Double o) {
		setAngle(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setAngle(Integer o) {
		setAngle(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setAngle(Number o) {
		setAngle(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected PersonStep angleInit() {
		Wrap<BigDecimal> angleWrap = new Wrap<BigDecimal>().var("angle");
		if(angle == null) {
			_angle(angleWrap);
			Optional.ofNullable(angleWrap.getO()).ifPresent(o -> {
				setAngle(o);
			});
		}
		return (PersonStep)this;
	}

	public static Double staticSearchAngle(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrAngle(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAngle(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrAngle(siteRequest_, PersonStep.staticSearchAngle(siteRequest_, PersonStep.staticSetAngle(siteRequest_, o)));
	}

	public BigDecimal sqlAngle() {
		return angle;
	}

	///////////
	// speed //
	///////////


	/**	 The entity speed
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal speed;

	/**	<br> The entity speed
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:speed">Find the entity speed in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _speed(Wrap<BigDecimal> w);

	public BigDecimal getSpeed() {
		return speed;
	}

	public void setSpeed(BigDecimal speed) {
		this.speed = speed;
	}
	@JsonIgnore
	public void setSpeed(String o) {
		this.speed = PersonStep.staticSetSpeed(siteRequest_, o);
	}
	public static BigDecimal staticSetSpeed(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setSpeed(Double o) {
		setSpeed(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setSpeed(Integer o) {
		setSpeed(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setSpeed(Number o) {
		setSpeed(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected PersonStep speedInit() {
		Wrap<BigDecimal> speedWrap = new Wrap<BigDecimal>().var("speed");
		if(speed == null) {
			_speed(speedWrap);
			Optional.ofNullable(speedWrap.getO()).ifPresent(o -> {
				setSpeed(o);
			});
		}
		return (PersonStep)this;
	}

	public static Double staticSearchSpeed(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrSpeed(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSpeed(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrSpeed(siteRequest_, PersonStep.staticSearchSpeed(siteRequest_, PersonStep.staticSetSpeed(siteRequest_, o)));
	}

	public BigDecimal sqlSpeed() {
		return speed;
	}

	/////////
	// pos //
	/////////


	/**	 The entity pos
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal pos;

	/**	<br> The entity pos
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:pos">Find the entity pos in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pos(Wrap<BigDecimal> w);

	public BigDecimal getPos() {
		return pos;
	}

	public void setPos(BigDecimal pos) {
		this.pos = pos;
	}
	@JsonIgnore
	public void setPos(String o) {
		this.pos = PersonStep.staticSetPos(siteRequest_, o);
	}
	public static BigDecimal staticSetPos(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setPos(Double o) {
		setPos(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setPos(Integer o) {
		setPos(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setPos(Number o) {
		setPos(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected PersonStep posInit() {
		Wrap<BigDecimal> posWrap = new Wrap<BigDecimal>().var("pos");
		if(pos == null) {
			_pos(posWrap);
			Optional.ofNullable(posWrap.getO()).ifPresent(o -> {
				setPos(o);
			});
		}
		return (PersonStep)this;
	}

	public static Double staticSearchPos(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrPos(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPos(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrPos(siteRequest_, PersonStep.staticSearchPos(siteRequest_, PersonStep.staticSetPos(siteRequest_, o)));
	}

	public BigDecimal sqlPos() {
		return pos;
	}

	///////////
	// slope //
	///////////


	/**	 The entity slope
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal slope;

	/**	<br> The entity slope
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:slope">Find the entity slope in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _slope(Wrap<BigDecimal> w);

	public BigDecimal getSlope() {
		return slope;
	}

	public void setSlope(BigDecimal slope) {
		this.slope = slope;
	}
	@JsonIgnore
	public void setSlope(String o) {
		this.slope = PersonStep.staticSetSlope(siteRequest_, o);
	}
	public static BigDecimal staticSetSlope(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setSlope(Double o) {
		setSlope(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setSlope(Integer o) {
		setSlope(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setSlope(Number o) {
		setSlope(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected PersonStep slopeInit() {
		Wrap<BigDecimal> slopeWrap = new Wrap<BigDecimal>().var("slope");
		if(slope == null) {
			_slope(slopeWrap);
			Optional.ofNullable(slopeWrap.getO()).ifPresent(o -> {
				setSlope(o);
			});
		}
		return (PersonStep)this;
	}

	public static Double staticSearchSlope(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrSlope(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSlope(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrSlope(siteRequest_, PersonStep.staticSearchSlope(siteRequest_, PersonStep.staticSetSlope(siteRequest_, o)));
	}

	public BigDecimal sqlSlope() {
		return slope;
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepPersonStep(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepPersonStep();
	}

	public Future<Void> promiseDeepPersonStep() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promisePersonStep(promise2);
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

	public Future<Void> promisePersonStep(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				simulationNameInit();
				sumocfgPathInit();
				personIdInit();
				personTypeInit();
				angleInit();
				speedInit();
				posInit();
				slopeInit();
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
		return promiseDeepPersonStep(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestPersonStep(SiteRequestEnUS siteRequest_) {
			super.siteRequestMapResult(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestPersonStep(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainPersonStep(v);
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
	public Object obtainPersonStep(String var) {
		PersonStep oPersonStep = (PersonStep)this;
		switch(var) {
			case "simulationName":
				return oPersonStep.simulationName;
			case "sumocfgPath":
				return oPersonStep.sumocfgPath;
			case "personId":
				return oPersonStep.personId;
			case "personType":
				return oPersonStep.personType;
			case "angle":
				return oPersonStep.angle;
			case "speed":
				return oPersonStep.speed;
			case "pos":
				return oPersonStep.pos;
			case "slope":
				return oPersonStep.slope;
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
				o = relatePersonStep(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relatePersonStep(String var, Object val) {
		PersonStep oPersonStep = (PersonStep)this;
		switch(var) {
			default:
				return super.relateMapResult(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetPersonStep(entityVar,  siteRequest_, o);
	}
	public static Object staticSetPersonStep(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "simulationName":
			return PersonStep.staticSetSimulationName(siteRequest_, o);
		case "sumocfgPath":
			return PersonStep.staticSetSumocfgPath(siteRequest_, o);
		case "personId":
			return PersonStep.staticSetPersonId(siteRequest_, o);
		case "personType":
			return PersonStep.staticSetPersonType(siteRequest_, o);
		case "angle":
			return PersonStep.staticSetAngle(siteRequest_, o);
		case "speed":
			return PersonStep.staticSetSpeed(siteRequest_, o);
		case "pos":
			return PersonStep.staticSetPos(siteRequest_, o);
		case "slope":
			return PersonStep.staticSetSlope(siteRequest_, o);
			default:
				return MapResult.staticSetMapResult(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchPersonStep(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchPersonStep(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "simulationName":
			return PersonStep.staticSearchSimulationName(siteRequest_, (String)o);
		case "sumocfgPath":
			return PersonStep.staticSearchSumocfgPath(siteRequest_, (String)o);
		case "personId":
			return PersonStep.staticSearchPersonId(siteRequest_, (String)o);
		case "personType":
			return PersonStep.staticSearchPersonType(siteRequest_, (String)o);
		case "angle":
			return PersonStep.staticSearchAngle(siteRequest_, (BigDecimal)o);
		case "speed":
			return PersonStep.staticSearchSpeed(siteRequest_, (BigDecimal)o);
		case "pos":
			return PersonStep.staticSearchPos(siteRequest_, (BigDecimal)o);
		case "slope":
			return PersonStep.staticSearchSlope(siteRequest_, (BigDecimal)o);
			default:
				return MapResult.staticSearchMapResult(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrPersonStep(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrPersonStep(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "simulationName":
			return PersonStep.staticSearchStrSimulationName(siteRequest_, (String)o);
		case "sumocfgPath":
			return PersonStep.staticSearchStrSumocfgPath(siteRequest_, (String)o);
		case "personId":
			return PersonStep.staticSearchStrPersonId(siteRequest_, (String)o);
		case "personType":
			return PersonStep.staticSearchStrPersonType(siteRequest_, (String)o);
		case "angle":
			return PersonStep.staticSearchStrAngle(siteRequest_, (Double)o);
		case "speed":
			return PersonStep.staticSearchStrSpeed(siteRequest_, (Double)o);
		case "pos":
			return PersonStep.staticSearchStrPos(siteRequest_, (Double)o);
		case "slope":
			return PersonStep.staticSearchStrSlope(siteRequest_, (Double)o);
			default:
				return MapResult.staticSearchStrMapResult(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqPersonStep(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqPersonStep(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "simulationName":
			return PersonStep.staticSearchFqSimulationName(siteRequest_, o);
		case "sumocfgPath":
			return PersonStep.staticSearchFqSumocfgPath(siteRequest_, o);
		case "personId":
			return PersonStep.staticSearchFqPersonId(siteRequest_, o);
		case "personType":
			return PersonStep.staticSearchFqPersonType(siteRequest_, o);
		case "angle":
			return PersonStep.staticSearchFqAngle(siteRequest_, o);
		case "speed":
			return PersonStep.staticSearchFqSpeed(siteRequest_, o);
		case "pos":
			return PersonStep.staticSearchFqPos(siteRequest_, o);
		case "slope":
			return PersonStep.staticSearchFqSlope(siteRequest_, o);
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
					o = persistPersonStep(v, val);
				else if(o instanceof BaseModel) {
					BaseModel oBaseModel = (BaseModel)o;
					o = oBaseModel.persistForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object persistPersonStep(String var, Object val) {
		String varLower = var.toLowerCase();
			if("simulationname".equals(varLower)) {
				if(val instanceof String) {
					setSimulationName((String)val);
				}
				saves.add("simulationName");
				return val;
			} else if("sumocfgpath".equals(varLower)) {
				if(val instanceof String) {
					setSumocfgPath((String)val);
				}
				saves.add("sumocfgPath");
				return val;
			} else if("personid".equals(varLower)) {
				if(val instanceof String) {
					setPersonId((String)val);
				}
				saves.add("personId");
				return val;
			} else if("persontype".equals(varLower)) {
				if(val instanceof String) {
					setPersonType((String)val);
				}
				saves.add("personType");
				return val;
			} else if("angle".equals(varLower)) {
				if(val instanceof String) {
					setAngle((String)val);
				} else if(val instanceof Number) {
					setAngle(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("angle");
				return val;
			} else if("speed".equals(varLower)) {
				if(val instanceof String) {
					setSpeed((String)val);
				} else if(val instanceof Number) {
					setSpeed(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("speed");
				return val;
			} else if("pos".equals(varLower)) {
				if(val instanceof String) {
					setPos((String)val);
				} else if(val instanceof Number) {
					setPos(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("pos");
				return val;
			} else if("slope".equals(varLower)) {
				if(val instanceof String) {
					setSlope((String)val);
				} else if(val instanceof Number) {
					setSlope(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("slope");
				return val;
		} else {
			return super.persistMapResult(var, val);
		}
	}

	/////////////
	// populate //
	/////////////

	@Override public void populateForClass(SolrResponse.Doc doc) {
		populatePersonStep(doc);
	}
	public void populatePersonStep(SolrResponse.Doc doc) {
		PersonStep oPersonStep = (PersonStep)this;
		saves = doc.get("saves_docvalues_strings");
		if(saves != null) {

			if(saves.contains("simulationName")) {
				String simulationName = (String)doc.get("simulationName_docvalues_string");
				if(simulationName != null)
					oPersonStep.setSimulationName(simulationName);
			}

			if(saves.contains("sumocfgPath")) {
				String sumocfgPath = (String)doc.get("sumocfgPath_docvalues_string");
				if(sumocfgPath != null)
					oPersonStep.setSumocfgPath(sumocfgPath);
			}

			if(saves.contains("personId")) {
				String personId = (String)doc.get("personId_docvalues_string");
				if(personId != null)
					oPersonStep.setPersonId(personId);
			}

			if(saves.contains("personType")) {
				String personType = (String)doc.get("personType_docvalues_string");
				if(personType != null)
					oPersonStep.setPersonType(personType);
			}

			if(saves.contains("angle")) {
				Double angle = (Double)doc.get("angle_docvalues_double");
				if(angle != null)
					oPersonStep.setAngle(angle);
			}

			if(saves.contains("speed")) {
				Double speed = (Double)doc.get("speed_docvalues_double");
				if(speed != null)
					oPersonStep.setSpeed(speed);
			}

			if(saves.contains("pos")) {
				Double pos = (Double)doc.get("pos_docvalues_double");
				if(pos != null)
					oPersonStep.setPos(pos);
			}

			if(saves.contains("slope")) {
				Double slope = (Double)doc.get("slope_docvalues_double");
				if(slope != null)
					oPersonStep.setSlope(slope);
			}
		}

		super.populateMapResult(doc);
	}

	public void indexPersonStep(JsonObject doc) {
		if(simulationName != null) {
			doc.put("simulationName_docvalues_string", simulationName);
		}
		if(sumocfgPath != null) {
			doc.put("sumocfgPath_docvalues_string", sumocfgPath);
		}
		if(personId != null) {
			doc.put("personId_docvalues_string", personId);
		}
		if(personType != null) {
			doc.put("personType_docvalues_string", personType);
		}
		if(angle != null) {
			doc.put("angle_docvalues_double", angle.doubleValue());
		}
		if(speed != null) {
			doc.put("speed_docvalues_double", speed.doubleValue());
		}
		if(pos != null) {
			doc.put("pos_docvalues_double", pos.doubleValue());
		}
		if(slope != null) {
			doc.put("slope_docvalues_double", slope.doubleValue());
		}
		super.indexMapResult(doc);

	}

	public static String varStoredPersonStep(String entityVar) {
		switch(entityVar) {
			case "simulationName":
				return "simulationName_docvalues_string";
			case "sumocfgPath":
				return "sumocfgPath_docvalues_string";
			case "personId":
				return "personId_docvalues_string";
			case "personType":
				return "personType_docvalues_string";
			case "angle":
				return "angle_docvalues_double";
			case "speed":
				return "speed_docvalues_double";
			case "pos":
				return "pos_docvalues_double";
			case "slope":
				return "slope_docvalues_double";
			default:
				return MapResult.varStoredMapResult(entityVar);
		}
	}

	public static String varIndexedPersonStep(String entityVar) {
		switch(entityVar) {
			case "simulationName":
				return "simulationName_docvalues_string";
			case "sumocfgPath":
				return "sumocfgPath_docvalues_string";
			case "personId":
				return "personId_docvalues_string";
			case "personType":
				return "personType_docvalues_string";
			case "angle":
				return "angle_docvalues_double";
			case "speed":
				return "speed_docvalues_double";
			case "pos":
				return "pos_docvalues_double";
			case "slope":
				return "slope_docvalues_double";
			default:
				return MapResult.varIndexedMapResult(entityVar);
		}
	}

	public static String searchVarPersonStep(String searchVar) {
		switch(searchVar) {
			case "simulationName_docvalues_string":
				return "simulationName";
			case "sumocfgPath_docvalues_string":
				return "sumocfgPath";
			case "personId_docvalues_string":
				return "personId";
			case "personType_docvalues_string":
				return "personType";
			case "angle_docvalues_double":
				return "angle";
			case "speed_docvalues_double":
				return "speed";
			case "pos_docvalues_double":
				return "pos";
			case "slope_docvalues_double":
				return "slope";
			default:
				return MapResult.searchVarMapResult(searchVar);
		}
	}

	public static String varSearchPersonStep(String entityVar) {
		switch(entityVar) {
			default:
				return MapResult.varSearchMapResult(entityVar);
		}
	}

	public static String varSuggestedPersonStep(String entityVar) {
		switch(entityVar) {
			default:
				return MapResult.varSuggestedMapResult(entityVar);
		}
	}

	/////////////
	// store //
	/////////////

	@Override public void storeForClass(SolrResponse.Doc doc) {
		storePersonStep(doc);
	}
	public void storePersonStep(SolrResponse.Doc doc) {
		PersonStep oPersonStep = (PersonStep)this;

		oPersonStep.setSimulationName(Optional.ofNullable(doc.get("simulationName_docvalues_string")).map(v -> v.toString()).orElse(null));
		oPersonStep.setSumocfgPath(Optional.ofNullable(doc.get("sumocfgPath_docvalues_string")).map(v -> v.toString()).orElse(null));
		oPersonStep.setPersonId(Optional.ofNullable(doc.get("personId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oPersonStep.setPersonType(Optional.ofNullable(doc.get("personType_docvalues_string")).map(v -> v.toString()).orElse(null));
		oPersonStep.setAngle(Optional.ofNullable(doc.get("angle_docvalues_double")).map(v -> v.toString()).orElse(null));
		oPersonStep.setSpeed(Optional.ofNullable(doc.get("speed_docvalues_double")).map(v -> v.toString()).orElse(null));
		oPersonStep.setPos(Optional.ofNullable(doc.get("pos_docvalues_double")).map(v -> v.toString()).orElse(null));
		oPersonStep.setSlope(Optional.ofNullable(doc.get("slope_docvalues_double")).map(v -> v.toString()).orElse(null));

		super.storeMapResult(doc);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestPersonStep() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof PersonStep) {
			PersonStep original = (PersonStep)o;
			if(!Objects.equals(simulationName, original.getSimulationName()))
				apiRequest.addVars("simulationName");
			if(!Objects.equals(sumocfgPath, original.getSumocfgPath()))
				apiRequest.addVars("sumocfgPath");
			if(!Objects.equals(personId, original.getPersonId()))
				apiRequest.addVars("personId");
			if(!Objects.equals(personType, original.getPersonType()))
				apiRequest.addVars("personType");
			if(!Objects.equals(angle, original.getAngle()) && angle != null && angle.compareTo(original.getAngle()) != 0)
				apiRequest.addVars("angle");
			if(!Objects.equals(speed, original.getSpeed()) && speed != null && speed.compareTo(original.getSpeed()) != 0)
				apiRequest.addVars("speed");
			if(!Objects.equals(pos, original.getPos()) && pos != null && pos.compareTo(original.getPos()) != 0)
				apiRequest.addVars("pos");
			if(!Objects.equals(slope, original.getSlope()) && slope != null && slope.compareTo(original.getSlope()) != 0)
				apiRequest.addVars("slope");
			super.apiRequestMapResult();
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(Optional.ofNullable(simulationName).map(v -> "simulationName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(sumocfgPath).map(v -> "sumocfgPath: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(personId).map(v -> "personId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(personType).map(v -> "personType: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(angle).map(v -> "angle: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(speed).map(v -> "speed: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pos).map(v -> "pos: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(slope).map(v -> "slope: " + v + "\n").orElse(""));
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "PersonStep";
	public static final String VAR_simulationName = "simulationName";
	public static final String VAR_sumocfgPath = "sumocfgPath";
	public static final String VAR_personId = "personId";
	public static final String VAR_personType = "personType";
	public static final String VAR_angle = "angle";
	public static final String VAR_speed = "speed";
	public static final String VAR_pos = "pos";
	public static final String VAR_slope = "slope";

	public static List<String> varsQForClass() {
		return PersonStep.varsQPersonStep(new ArrayList<String>());
	}
	public static List<String> varsQPersonStep(List<String> vars) {
		MapResult.varsQMapResult(vars);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return PersonStep.varsFqPersonStep(new ArrayList<String>());
	}
	public static List<String> varsFqPersonStep(List<String> vars) {
		vars.add(VAR_simulationName);
		vars.add(VAR_sumocfgPath);
		vars.add(VAR_personId);
		vars.add(VAR_personType);
		vars.add(VAR_angle);
		vars.add(VAR_speed);
		vars.add(VAR_pos);
		vars.add(VAR_slope);
		MapResult.varsFqMapResult(vars);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return PersonStep.varsRangePersonStep(new ArrayList<String>());
	}
	public static List<String> varsRangePersonStep(List<String> vars) {
		vars.add(VAR_angle);
		vars.add(VAR_speed);
		vars.add(VAR_pos);
		vars.add(VAR_slope);
		MapResult.varsRangeMapResult(vars);
		return vars;
	}

	public static final String DISPLAY_NAME_simulationName = "simulation name";
	public static final String DISPLAY_NAME_sumocfgPath = "sumocfg path";
	public static final String DISPLAY_NAME_personId = "person ID";
	public static final String DISPLAY_NAME_personType = "person type";
	public static final String DISPLAY_NAME_angle = "Angle in degrees";
	public static final String DISPLAY_NAME_speed = "Speed";
	public static final String DISPLAY_NAME_pos = "Position";
	public static final String DISPLAY_NAME_slope = "Slope";

	public static String displayNameForClass(String var) {
		return PersonStep.displayNamePersonStep(var);
	}
	public static String displayNamePersonStep(String var) {
		switch(var) {
		case VAR_simulationName:
			return DISPLAY_NAME_simulationName;
		case VAR_sumocfgPath:
			return DISPLAY_NAME_sumocfgPath;
		case VAR_personId:
			return DISPLAY_NAME_personId;
		case VAR_personType:
			return DISPLAY_NAME_personType;
		case VAR_angle:
			return DISPLAY_NAME_angle;
		case VAR_speed:
			return DISPLAY_NAME_speed;
		case VAR_pos:
			return DISPLAY_NAME_pos;
		case VAR_slope:
			return DISPLAY_NAME_slope;
		default:
			return MapResult.displayNameMapResult(var);
		}
	}

	public static String descriptionPersonStep(String var) {
		switch(var) {
			default:
				return MapResult.descriptionMapResult(var);
		}
	}

	public static String classSimpleNamePersonStep(String var) {
		switch(var) {
		case VAR_simulationName:
			return "String";
		case VAR_sumocfgPath:
			return "String";
		case VAR_personId:
			return "String";
		case VAR_personType:
			return "String";
		case VAR_angle:
			return "BigDecimal";
		case VAR_speed:
			return "BigDecimal";
		case VAR_pos:
			return "BigDecimal";
		case VAR_slope:
			return "BigDecimal";
			default:
				return MapResult.classSimpleNameMapResult(var);
		}
	}

	public static Integer htmColumnPersonStep(String var) {
		switch(var) {
			default:
				return MapResult.htmColumnMapResult(var);
		}
	}

	public static Integer htmRowPersonStep(String var) {
		switch(var) {
		case VAR_simulationName:
			return 3;
		case VAR_sumocfgPath:
			return 3;
		case VAR_personId:
			return 4;
		case VAR_personType:
			return 4;
		case VAR_angle:
			return 5;
		case VAR_speed:
			return 5;
		case VAR_pos:
			return 5;
		case VAR_slope:
			return 5;
			default:
				return MapResult.htmRowMapResult(var);
		}
	}

	public static Integer htmCellPersonStep(String var) {
		switch(var) {
		case VAR_simulationName:
			return 1;
		case VAR_sumocfgPath:
			return 2;
		case VAR_personId:
			return 3;
		case VAR_personType:
			return 4;
		case VAR_angle:
			return 1;
		case VAR_speed:
			return 2;
		case VAR_pos:
			return 3;
		case VAR_slope:
			return 4;
			default:
				return MapResult.htmCellMapResult(var);
		}
	}

	public static Integer lengthMinPersonStep(String var) {
		switch(var) {
			default:
				return MapResult.lengthMinMapResult(var);
		}
	}

	public static Integer lengthMaxPersonStep(String var) {
		switch(var) {
			default:
				return MapResult.lengthMaxMapResult(var);
		}
	}

	public static Integer maxPersonStep(String var) {
		switch(var) {
			default:
				return MapResult.maxMapResult(var);
		}
	}

	public static Integer minPersonStep(String var) {
		switch(var) {
			default:
				return MapResult.minMapResult(var);
		}
	}
}
