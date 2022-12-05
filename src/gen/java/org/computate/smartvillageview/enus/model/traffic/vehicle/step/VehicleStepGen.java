package org.computate.smartvillageview.enus.model.traffic.vehicle.step;

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
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class VehicleStepGen into the class VehicleStep. 
 * </li><li>You can add a class comment "Model: true" if you wish to persist these VehicleStep objects in a relational PostgreSQL database transactionally in the RESTful API. 
 * The code to persist and query the VehicleStepGen data in the database will then be automatically generated. 
 * </li>
 * <h3>About the VehicleStep class and it's generated class VehicleStepGen&lt;MapResult&gt;: </h3>extends VehicleStepGen
 * <p>
 * This Java class extends a generated Java class VehicleStepGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStep">Find the class VehicleStep in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends VehicleStepGen<MapResult>
 * <p>This <code>class VehicleStep extends VehicleStepGen&lt;MapResult&gt;</code>, which means it extends a newly generated VehicleStepGen. 
 * The generated <code>class VehicleStepGen extends MapResult</code> which means that VehicleStep extends VehicleStepGen which extends MapResult. 
 * This generated inheritance is a powerful feature that allows a lot of boiler plate code to be created for you automatically while still preserving inheritance through the power of Java Generic classes. 
 * </p>
 * Api: true
 * <p>This class contains a comment <b>"Api: true"</b>, which means this class will have Java Vert.x API backend code generated for these objects. 
 * </p>
 * ApiTag.enUS: Vehicle Step
 * <p>This class contains a comment <b>"ApiTag: Vehicle Step"</b>, which groups all of the OpenAPIs for VehicleStep objects under the tag "Vehicle Step". 
 * </p>
 * ApiUri.enUS: /api/vehicle-step
 * <p>This class contains a comment <b>"ApiUri: /api/vehicle-step"</b>, which defines the base API URI for VehicleStep objects as "/api/vehicle-step" in the OpenAPI spec. 
 * </p>
 * Color: 2017-shaded-spruce
 * <p>This class contains a comment <b>"Color: 2017-shaded-spruce"</b>, which styles the VehicleStep page "2017-shaded-spruce". 
 * This will reference a CSS class defined by the stylesheets in the project that starts with "w3-". 
 * A css class of "w3-2017-shaded-spruce" is expected to exist in the project stylesheets, and is inspired by W3 CSS colors. 
 * See: <a href="https://www.w3schools.com/w3css/w3css_colors.asp">https://www.w3schools.com/w3css/w3css_colors.asp</a>. 
 * </p>
 * IconGroup: duotone
 * <p>This class contains a comment <b>"IconGroup: duotone"</b>, which adds icons on the VehicleStep page with a group of "duotone". 
 * This will reference a Font Awesome icon group that starts with "fa-" followed by the icon group "duotone", together is "fa-duotone". 
 * A Font Awesome icon group of "duotone" is expected to exist. 
 * The Font Awesome groups currently supported include: solid, regular, light, thin, duotone, sharp, and kit. 
 * See: <a href="https://fontawesome.com/docs/web/dig-deeper/styles">https://fontawesome.com/docs/web/dig-deeper/styles</a>. 
 * </p>
 * IconName: map-location-dot
 * <p>This class contains a comment <b>"IconName: map-location-dot"</b>, which adds icons on the VehicleStep page with a name of "map-location-dot". 
 * This will reference a Font Awesome icon that starts with the icon group "fa-duotone fa-" followed by the icon name, which is "fa-duotone fa-map-location-dot". 
 * A Font Awesome icon of "fa-duotone fa-map-location-dot" is expected to exist. 
 * See: <a href="https://fontawesome.com/icons">https://fontawesome.com/icons</a>. 
 * </p>
 * Indexed: true
 * <p>This class contains a comment <b>"Indexed: true"</b>, which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * {@inheritDoc}
 * <p>By adding a class comment "{@inheritDoc}", the VehicleStep class will inherit the helpful inherited class comments from the super class VehicleStepGen. 
 * </p>
 * Rows: 100
 * <p>This class contains a comment <b>"Rows: 100"</b>, which means the VehicleStep API will return a default of 100 records instead of 10 by default. 
 * Each API has built in pagination of the search records to ensure a user can query all the data a page at a time without running the application out of memory. 
 * </p>
 * Order: 9
 * <p>This class contains a comment <b>"Order: 9"</b>, which means this class will be sorted by the given number 9 ascending when code that relates to multiple classes at the same time is generated. 
 * </p>
 * Model: true
 * Page: true
 * <p>This class contains a comment <b>"Page: true"</b>, which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepPage. 
 * </p>
 * SuperPage.enUS: MapResultPage
 * <p>This class contains a comment <b>"SuperPage.enUS: MapResultPage"</b>, which identifies the Java super class of the page code by it's class simple name "MapResultPage". 
 * This means that the newly created class org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepPage extends org.computate.smartvillageview.enus.result.map.MapResultPage. 
 * </p>
 * Promise: true
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the VehicleStep Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * This class contains a comment <b>"Role.enUS: SiteAdmin"</b>, which identifies the default role name "SiteAdmin" of the OAuth2/OpenID Connect user role required to access this VehicleStep API. 
 * It's possible to reconfigure the roles required to access the VehicleStep API by configuring an environment variable like this: 
 * </p>
 * <pre>AUTH_ROLES_REQUIRED_VehicleStep: ["SiteAdmin"]</pre>
 * AName.enUS: a vehicle step
 * <p>This class contains a comment <b>"AName.enUS: a vehicle step"</b>, which identifies the language context to describe a VehicleStep as "a vehicle step". 
 * </p>
 * <p>
 * Delete the class VehicleStep in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStep&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.traffic.vehicle.step in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class VehicleStepGen<DEV> extends MapResult {
	protected static final Logger LOG = LoggerFactory.getLogger(VehicleStep.class);

	public static final String VehicleStep_AName_enUS = "a vehicle step";
	public static final String VehicleStep_This_enUS = "this ";
	public static final String VehicleStep_ThisName_enUS = "this vehicle step";
	public static final String VehicleStep_A_enUS = "a ";
	public static final String VehicleStep_TheName_enUS = "the vehicle step";
	public static final String VehicleStep_NameSingular_enUS = "vehicle step";
	public static final String VehicleStep_NamePlural_enUS = "vehicle steps";
	public static final String VehicleStep_NameActual_enUS = "current vehicle step";
	public static final String VehicleStep_AllName_enUS = "all the vehicle steps";
	public static final String VehicleStep_SearchAllNameBy_enUS = "search vehicle steps by ";
	public static final String VehicleStep_Title_enUS = "vehicle steps";
	public static final String VehicleStep_ThePluralName_enUS = "the vehicle steps";
	public static final String VehicleStep_NoNameFound_enUS = "no vehicle step found";
	public static final String VehicleStep_ApiUri_enUS = "/api/vehicle-step";
	public static final String VehicleStep_ApiUriSearchPage_enUS = "/vehicle-step";
	public static final String VehicleStep_OfName_enUS = "of vehicle step";
	public static final String VehicleStep_ANameAdjective_enUS = "a vehicle step";
	public static final String VehicleStep_NameAdjectiveSingular_enUS = "vehicle step";
	public static final String VehicleStep_NameAdjectivePlural_enUS = "vehicle steps";
	public static final String Search_enUS_Uri = "/api/vehicle-step";
	public static final String Search_enUS_ImageUri = "/png/api/vehicle-step-999.png";
	public static final String GET_enUS_Uri = "/api/vehicle-step/{id}";
	public static final String GET_enUS_ImageUri = "/png/api/vehicle-step/{id}-999.png";
	public static final String PATCH_enUS_Uri = "/api/vehicle-step";
	public static final String PATCH_enUS_ImageUri = "/png/api/vehicle-step-999.png";
	public static final String POST_enUS_Uri = "/api/vehicle-step";
	public static final String POST_enUS_ImageUri = "/png/api/vehicle-step-999.png";
	public static final String PUTImport_enUS_Uri = "/api/vehicle-step-import";
	public static final String PUTImport_enUS_ImageUri = "/png/api/vehicle-step-import-999.png";
	public static final String SearchPage_enUS_Uri = "/vehicle-step";
	public static final String SearchPage_enUS_ImageUri = "/png/vehicle-step-999.png";

	public static final String VehicleStep_Color = "2017-shaded-spruce";
	public static final String VehicleStep_IconGroup = "duotone";
	public static final String VehicleStep_IconName = "map-location-dot";
	public static final Integer VehicleStep_Rows = 100;

	///////////////
	// vehicleId //
	///////////////


	/**	 The entity vehicleId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String vehicleId;

	/**	<br> The entity vehicleId
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStep&fq=entiteVar_enUS_indexed_string:vehicleId">Find the entity vehicleId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _vehicleId(Wrap<String> w);

	public String getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(String o) {
		this.vehicleId = VehicleStep.staticSetVehicleId(siteRequest_, o);
	}
	public static String staticSetVehicleId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected VehicleStep vehicleIdInit() {
		Wrap<String> vehicleIdWrap = new Wrap<String>().var("vehicleId");
		if(vehicleId == null) {
			_vehicleId(vehicleIdWrap);
			setVehicleId(vehicleIdWrap.o);
		}
		return (VehicleStep)this;
	}

	public static String staticSearchVehicleId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrVehicleId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqVehicleId(SiteRequestEnUS siteRequest_, String o) {
		return VehicleStep.staticSearchStrVehicleId(siteRequest_, VehicleStep.staticSearchVehicleId(siteRequest_, VehicleStep.staticSetVehicleId(siteRequest_, o)));
	}

	public String sqlVehicleId() {
		return vehicleId;
	}

	/////////////////
	// vehicleType //
	/////////////////


	/**	 The entity vehicleType
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String vehicleType;

	/**	<br> The entity vehicleType
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStep&fq=entiteVar_enUS_indexed_string:vehicleType">Find the entity vehicleType in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _vehicleType(Wrap<String> w);

	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String o) {
		this.vehicleType = VehicleStep.staticSetVehicleType(siteRequest_, o);
	}
	public static String staticSetVehicleType(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected VehicleStep vehicleTypeInit() {
		Wrap<String> vehicleTypeWrap = new Wrap<String>().var("vehicleType");
		if(vehicleType == null) {
			_vehicleType(vehicleTypeWrap);
			setVehicleType(vehicleTypeWrap.o);
		}
		return (VehicleStep)this;
	}

	public static String staticSearchVehicleType(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrVehicleType(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqVehicleType(SiteRequestEnUS siteRequest_, String o) {
		return VehicleStep.staticSearchStrVehicleType(siteRequest_, VehicleStep.staticSearchVehicleType(siteRequest_, VehicleStep.staticSetVehicleType(siteRequest_, o)));
	}

	public String sqlVehicleType() {
		return vehicleType;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStep&fq=entiteVar_enUS_indexed_string:angle">Find the entity angle in Solr</a>
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
		this.angle = VehicleStep.staticSetAngle(siteRequest_, o);
	}
	public static BigDecimal staticSetAngle(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setAngle(Double o) {
			this.angle = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setAngle(Integer o) {
			this.angle = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected VehicleStep angleInit() {
		Wrap<BigDecimal> angleWrap = new Wrap<BigDecimal>().var("angle");
		if(angle == null) {
			_angle(angleWrap);
			setAngle(angleWrap.o);
		}
		return (VehicleStep)this;
	}

	public static Double staticSearchAngle(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrAngle(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAngle(SiteRequestEnUS siteRequest_, String o) {
		return VehicleStep.staticSearchStrAngle(siteRequest_, VehicleStep.staticSearchAngle(siteRequest_, VehicleStep.staticSetAngle(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStep&fq=entiteVar_enUS_indexed_string:speed">Find the entity speed in Solr</a>
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
		this.speed = VehicleStep.staticSetSpeed(siteRequest_, o);
	}
	public static BigDecimal staticSetSpeed(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setSpeed(Double o) {
			this.speed = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setSpeed(Integer o) {
			this.speed = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected VehicleStep speedInit() {
		Wrap<BigDecimal> speedWrap = new Wrap<BigDecimal>().var("speed");
		if(speed == null) {
			_speed(speedWrap);
			setSpeed(speedWrap.o);
		}
		return (VehicleStep)this;
	}

	public static Double staticSearchSpeed(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrSpeed(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSpeed(SiteRequestEnUS siteRequest_, String o) {
		return VehicleStep.staticSearchStrSpeed(siteRequest_, VehicleStep.staticSearchSpeed(siteRequest_, VehicleStep.staticSetSpeed(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStep&fq=entiteVar_enUS_indexed_string:pos">Find the entity pos in Solr</a>
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
		this.pos = VehicleStep.staticSetPos(siteRequest_, o);
	}
	public static BigDecimal staticSetPos(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setPos(Double o) {
			this.pos = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setPos(Integer o) {
			this.pos = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected VehicleStep posInit() {
		Wrap<BigDecimal> posWrap = new Wrap<BigDecimal>().var("pos");
		if(pos == null) {
			_pos(posWrap);
			setPos(posWrap.o);
		}
		return (VehicleStep)this;
	}

	public static Double staticSearchPos(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrPos(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPos(SiteRequestEnUS siteRequest_, String o) {
		return VehicleStep.staticSearchStrPos(siteRequest_, VehicleStep.staticSearchPos(siteRequest_, VehicleStep.staticSetPos(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStep&fq=entiteVar_enUS_indexed_string:slope">Find the entity slope in Solr</a>
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
		this.slope = VehicleStep.staticSetSlope(siteRequest_, o);
	}
	public static BigDecimal staticSetSlope(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setSlope(Double o) {
			this.slope = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setSlope(Integer o) {
			this.slope = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected VehicleStep slopeInit() {
		Wrap<BigDecimal> slopeWrap = new Wrap<BigDecimal>().var("slope");
		if(slope == null) {
			_slope(slopeWrap);
			setSlope(slopeWrap.o);
		}
		return (VehicleStep)this;
	}

	public static Double staticSearchSlope(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrSlope(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSlope(SiteRequestEnUS siteRequest_, String o) {
		return VehicleStep.staticSearchStrSlope(siteRequest_, VehicleStep.staticSearchSlope(siteRequest_, VehicleStep.staticSetSlope(siteRequest_, o)));
	}

	public BigDecimal sqlSlope() {
		return slope;
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepVehicleStep(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepVehicleStep();
	}

	public Future<Void> promiseDeepVehicleStep() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseVehicleStep(promise2);
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

	public Future<Void> promiseVehicleStep(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				vehicleIdInit();
				vehicleTypeInit();
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
		return promiseDeepVehicleStep(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestVehicleStep(SiteRequestEnUS siteRequest_) {
			super.siteRequestMapResult(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestVehicleStep(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainVehicleStep(v);
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
	public Object obtainVehicleStep(String var) {
		VehicleStep oVehicleStep = (VehicleStep)this;
		switch(var) {
			case "vehicleId":
				return oVehicleStep.vehicleId;
			case "vehicleType":
				return oVehicleStep.vehicleType;
			case "angle":
				return oVehicleStep.angle;
			case "speed":
				return oVehicleStep.speed;
			case "pos":
				return oVehicleStep.pos;
			case "slope":
				return oVehicleStep.slope;
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
				o = relateVehicleStep(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateVehicleStep(String var, Object val) {
		VehicleStep oVehicleStep = (VehicleStep)this;
		switch(var) {
			default:
				return super.relateMapResult(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetVehicleStep(entityVar,  siteRequest_, o);
	}
	public static Object staticSetVehicleStep(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "vehicleId":
			return VehicleStep.staticSetVehicleId(siteRequest_, o);
		case "vehicleType":
			return VehicleStep.staticSetVehicleType(siteRequest_, o);
		case "angle":
			return VehicleStep.staticSetAngle(siteRequest_, o);
		case "speed":
			return VehicleStep.staticSetSpeed(siteRequest_, o);
		case "pos":
			return VehicleStep.staticSetPos(siteRequest_, o);
		case "slope":
			return VehicleStep.staticSetSlope(siteRequest_, o);
			default:
				return MapResult.staticSetMapResult(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchVehicleStep(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchVehicleStep(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "vehicleId":
			return VehicleStep.staticSearchVehicleId(siteRequest_, (String)o);
		case "vehicleType":
			return VehicleStep.staticSearchVehicleType(siteRequest_, (String)o);
		case "angle":
			return VehicleStep.staticSearchAngle(siteRequest_, (BigDecimal)o);
		case "speed":
			return VehicleStep.staticSearchSpeed(siteRequest_, (BigDecimal)o);
		case "pos":
			return VehicleStep.staticSearchPos(siteRequest_, (BigDecimal)o);
		case "slope":
			return VehicleStep.staticSearchSlope(siteRequest_, (BigDecimal)o);
			default:
				return MapResult.staticSearchMapResult(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrVehicleStep(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrVehicleStep(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "vehicleId":
			return VehicleStep.staticSearchStrVehicleId(siteRequest_, (String)o);
		case "vehicleType":
			return VehicleStep.staticSearchStrVehicleType(siteRequest_, (String)o);
		case "angle":
			return VehicleStep.staticSearchStrAngle(siteRequest_, (Double)o);
		case "speed":
			return VehicleStep.staticSearchStrSpeed(siteRequest_, (Double)o);
		case "pos":
			return VehicleStep.staticSearchStrPos(siteRequest_, (Double)o);
		case "slope":
			return VehicleStep.staticSearchStrSlope(siteRequest_, (Double)o);
			default:
				return MapResult.staticSearchStrMapResult(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqVehicleStep(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqVehicleStep(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "vehicleId":
			return VehicleStep.staticSearchFqVehicleId(siteRequest_, o);
		case "vehicleType":
			return VehicleStep.staticSearchFqVehicleType(siteRequest_, o);
		case "angle":
			return VehicleStep.staticSearchFqAngle(siteRequest_, o);
		case "speed":
			return VehicleStep.staticSearchFqSpeed(siteRequest_, o);
		case "pos":
			return VehicleStep.staticSearchFqPos(siteRequest_, o);
		case "slope":
			return VehicleStep.staticSearchFqSlope(siteRequest_, o);
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
					o = persistVehicleStep(v, val);
				else if(o instanceof BaseModel) {
					BaseModel oBaseModel = (BaseModel)o;
					o = oBaseModel.persistForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object persistVehicleStep(String var, Object val) {
		String varLower = var.toLowerCase();
			if("vehicleid".equals(varLower)) {
				if(val instanceof String) {
					setVehicleId((String)val);
				}
				saves.add("vehicleId");
				return val;
			} else if("vehicletype".equals(varLower)) {
				if(val instanceof String) {
					setVehicleType((String)val);
				}
				saves.add("vehicleType");
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
		populateVehicleStep(doc);
	}
	public void populateVehicleStep(SolrResponse.Doc doc) {
		VehicleStep oVehicleStep = (VehicleStep)this;
		saves = doc.get("saves_docvalues_strings");
		if(saves != null) {
		}

		super.populateMapResult(doc);
	}

	public void indexVehicleStep(JsonObject doc) {
		if(vehicleId != null) {
			doc.put("vehicleId_docvalues_string", vehicleId);
		}
		if(vehicleType != null) {
			doc.put("vehicleType_docvalues_string", vehicleType);
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

	public static String varStoredVehicleStep(String entityVar) {
		switch(entityVar) {
			case "vehicleId":
				return "vehicleId_docvalues_string";
			case "vehicleType":
				return "vehicleType_docvalues_string";
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

	public static String varIndexedVehicleStep(String entityVar) {
		switch(entityVar) {
			case "vehicleId":
				return "vehicleId_docvalues_string";
			case "vehicleType":
				return "vehicleType_docvalues_string";
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

	public static String searchVarVehicleStep(String searchVar) {
		switch(searchVar) {
			case "vehicleId_docvalues_string":
				return "vehicleId";
			case "vehicleType_docvalues_string":
				return "vehicleType";
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

	public static String varSearchVehicleStep(String entityVar) {
		switch(entityVar) {
			default:
				return MapResult.varSearchMapResult(entityVar);
		}
	}

	public static String varSuggestedVehicleStep(String entityVar) {
		switch(entityVar) {
			default:
				return MapResult.varSuggestedMapResult(entityVar);
		}
	}

	/////////////
	// store //
	/////////////

	@Override public void storeForClass(SolrResponse.Doc doc) {
		storeVehicleStep(doc);
	}
	public void storeVehicleStep(SolrResponse.Doc doc) {
		VehicleStep oVehicleStep = (VehicleStep)this;

		oVehicleStep.setVehicleId(Optional.ofNullable(doc.get("vehicleId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oVehicleStep.setVehicleType(Optional.ofNullable(doc.get("vehicleType_docvalues_string")).map(v -> v.toString()).orElse(null));
		oVehicleStep.setAngle(Optional.ofNullable(doc.get("angle_docvalues_double")).map(v -> v.toString()).orElse(null));
		oVehicleStep.setSpeed(Optional.ofNullable(doc.get("speed_docvalues_double")).map(v -> v.toString()).orElse(null));
		oVehicleStep.setPos(Optional.ofNullable(doc.get("pos_docvalues_double")).map(v -> v.toString()).orElse(null));
		oVehicleStep.setSlope(Optional.ofNullable(doc.get("slope_docvalues_double")).map(v -> v.toString()).orElse(null));

		super.storeMapResult(doc);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestVehicleStep() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof VehicleStep) {
			VehicleStep original = (VehicleStep)o;
			if(!Objects.equals(vehicleId, original.getVehicleId()))
				apiRequest.addVars("vehicleId");
			if(!Objects.equals(vehicleType, original.getVehicleType()))
				apiRequest.addVars("vehicleType");
			if(!Objects.equals(angle, original.getAngle()))
				apiRequest.addVars("angle");
			if(!Objects.equals(speed, original.getSpeed()))
				apiRequest.addVars("speed");
			if(!Objects.equals(pos, original.getPos()))
				apiRequest.addVars("pos");
			if(!Objects.equals(slope, original.getSlope()))
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
		sb.append(Optional.ofNullable(vehicleId).map(v -> "vehicleId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(vehicleType).map(v -> "vehicleType: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(angle).map(v -> "angle: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(speed).map(v -> "speed: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pos).map(v -> "pos: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(slope).map(v -> "slope: " + v + "\n").orElse(""));
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "VehicleStep";
	public static final String VAR_vehicleId = "vehicleId";
	public static final String VAR_vehicleType = "vehicleType";
	public static final String VAR_angle = "angle";
	public static final String VAR_speed = "speed";
	public static final String VAR_pos = "pos";
	public static final String VAR_slope = "slope";

	public static List<String> varsQForClass() {
		return VehicleStep.varsQVehicleStep(new ArrayList<String>());
	}
	public static List<String> varsQVehicleStep(List<String> vars) {
		MapResult.varsQMapResult(vars);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return VehicleStep.varsFqVehicleStep(new ArrayList<String>());
	}
	public static List<String> varsFqVehicleStep(List<String> vars) {
		vars.add(VAR_vehicleId);
		vars.add(VAR_vehicleType);
		vars.add(VAR_angle);
		vars.add(VAR_speed);
		vars.add(VAR_pos);
		vars.add(VAR_slope);
		MapResult.varsFqMapResult(vars);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return VehicleStep.varsRangeVehicleStep(new ArrayList<String>());
	}
	public static List<String> varsRangeVehicleStep(List<String> vars) {
		vars.add(VAR_angle);
		vars.add(VAR_speed);
		vars.add(VAR_pos);
		vars.add(VAR_slope);
		MapResult.varsRangeMapResult(vars);
		return vars;
	}

	public static final String DISPLAY_NAME_vehicleId = "vehicle ID";
	public static final String DISPLAY_NAME_vehicleType = "vehicle type";
	public static final String DISPLAY_NAME_angle = "Angle in degrees";
	public static final String DISPLAY_NAME_speed = "Speed";
	public static final String DISPLAY_NAME_pos = "Position";
	public static final String DISPLAY_NAME_slope = "Slope";

	public static String displayNameForClass(String var) {
		return VehicleStep.displayNameVehicleStep(var);
	}
	public static String displayNameVehicleStep(String var) {
		switch(var) {
		case VAR_vehicleId:
			return DISPLAY_NAME_vehicleId;
		case VAR_vehicleType:
			return DISPLAY_NAME_vehicleType;
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

	public static String descriptionVehicleStep(String var) {
		switch(var) {
			default:
				return MapResult.descriptionMapResult(var);
		}
	}

	public static String classSimpleNameVehicleStep(String var) {
		switch(var) {
		case VAR_vehicleId:
			return "String";
		case VAR_vehicleType:
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

	public static Integer htmlColumnVehicleStep(String var) {
		switch(var) {
			default:
				return MapResult.htmlColumnMapResult(var);
		}
	}

	public static Integer htmlRowVehicleStep(String var) {
		switch(var) {
		case VAR_vehicleId:
			return 4;
		case VAR_vehicleType:
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
				return MapResult.htmlRowMapResult(var);
		}
	}

	public static Integer htmlCellVehicleStep(String var) {
		switch(var) {
		case VAR_vehicleId:
			return 3;
		case VAR_vehicleType:
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
				return MapResult.htmlCellMapResult(var);
		}
	}

	public static Integer lengthMinVehicleStep(String var) {
		switch(var) {
			default:
				return MapResult.lengthMinMapResult(var);
		}
	}

	public static Integer lengthMaxVehicleStep(String var) {
		switch(var) {
			default:
				return MapResult.lengthMaxMapResult(var);
		}
	}

	public static Integer maxVehicleStep(String var) {
		switch(var) {
			default:
				return MapResult.maxMapResult(var);
		}
	}

	public static Integer minVehicleStep(String var) {
		switch(var) {
			default:
				return MapResult.minMapResult(var);
		}
	}
}
