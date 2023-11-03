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
package org.computate.smartvillageview.enus.model.traffic.vehicle.step;

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
import java.math.BigDecimal;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;
import io.vertx.core.json.JsonObject;

/**
 * <ol>
<h3>Suggestions that can generate more code for you: </h3> * </ol>
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
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStep">Find the class VehicleStep in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends VehicleStepGen<MapResult>
 * <p>This <code>class VehicleStep extends VehicleStepGen&lt;MapResult&gt;</code>, which means it extends a newly generated VehicleStepGen. 
 * The generated <code>class VehicleStepGen extends MapResult</code> which means that VehicleStep extends VehicleStepGen which extends MapResult. 
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
 * <p>This class contains a comment <b>"ApiTag: Vehicle Step"</b>, which groups all of the OpenAPIs for VehicleStep objects under the tag "Vehicle Step". 
 * </p>
 * <h2>ApiUri.enUS: /api/vehicle-step</h2>
 * <p>This class contains a comment <b>"ApiUri: /api/vehicle-step"</b>, which defines the base API URI for VehicleStep objects as "/api/vehicle-step" in the OpenAPI spec. 
 * </p>
 * <h2>Color: 2017-shaded-spruce</h2>
 * <p>This class contains a comment <b>"Color: 2017-shaded-spruce"</b>, which styles the VehicleStep page "2017-shaded-spruce". 
 * This will reference a CSS class defined by the stylesheets in the project that starts with "w3-". 
 * A css class of "w3-2017-shaded-spruce" is expected to exist in the project stylesheets, and is inspired by W3 CSS colors. 
 * See: <a href="https://www.w3schools.com/w3css/w3css_colors.asp">https://www.w3schools.com/w3css/w3css_colors.asp</a>. 
 * </p>
 * <h2>IconGroup: duotone</h2>
 * <p>This class contains a comment <b>"IconGroup: duotone"</b>, which adds icons on the VehicleStep page with a group of "duotone". 
 * This will reference a Font Awesome icon group that starts with "fa-" followed by the icon group "duotone", together is "fa-duotone". 
 * A Font Awesome icon group of "duotone" is expected to exist. 
 * The Font Awesome groups currently supported include: solid, regular, light, thin, duotone, sharp, and kit. 
 * See: <a href="https://fontawesome.com/docs/web/dig-deeper/styles">https://fontawesome.com/docs/web/dig-deeper/styles</a>. 
 * </p>
 * <h2>IconName: map-location-dot</h2>
 * <p>This class contains a comment <b>"IconName: map-location-dot"</b>, which adds icons on the VehicleStep page with a name of "map-location-dot". 
 * This will reference a Font Awesome icon that starts with the icon group "fa-duotone fa-" followed by the icon name, which is "fa-duotone fa-map-location-dot". 
 * A Font Awesome icon of "fa-duotone fa-map-location-dot" is expected to exist. 
 * See: <a href="https://fontawesome.com/icons">https://fontawesome.com/icons</a>. 
 * </p>
 * <h2>Indexed: true</h2>
 * <p>This class contains a comment <b>"Indexed: true"</b>, which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * <h2>{@inheritDoc}</h2>
 * <p>By adding a class comment "{@inheritDoc}", the VehicleStep class will inherit the helpful inherited class comments from the super class VehicleStepGen. 
 * </p>
 * <h2>Rows: 100</h2>
 * <p>This class contains a comment <b>"Rows: 100"</b>, which means the VehicleStep API will return a default of 100 records instead of 10 by default. 
 * Each API has built in pagination of the search records to ensure a user can query all the data a page at a time without running the application out of memory. 
 * </p>
 * <h2>Order: 12</h2>
 * <p>This class contains a comment <b>"Order: 12"</b>, which means this class will be sorted by the given number 12 ascending when code that relates to multiple classes at the same time is generated. 
 * </p>
 * <h2>Model: true</h2>
 * <h2>Page: true</h2>
 * <p>This class contains a comment <b>"Page: true"</b>, which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepPage. 
 * </p>
 * <h2>SuperPage.enUS: MapResultPage</h2>
 * <p>This class contains a comment <b>"SuperPage.enUS: MapResultPage"</b>, which identifies the Java super class of the page code by it's class simple name "MapResultPage". 
 * This means that the newly created class org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepPage extends org.computate.smartvillageview.enus.result.map.MapResultPage. 
 * </p>
 * <h2>Promise: true</h2>
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
 * <h2>Role.enUS: SiteAdmin</h2>
 * <p>
 * This class contains a comment <b>"Role.enUS: SiteAdmin"</b>, which identifies the default role name "SiteAdmin" of the OAuth2/OpenID Connect user role required to access this VehicleStep API. 
 * It's possible to reconfigure the roles required to access the VehicleStep API by configuring an environment variable like this: 
 * </p>
 * <pre>AUTH_ROLE_REQUIRED_VehicleStep: ["SiteAdmin"]</pre>
 * <h2>AName.enUS: a vehicle step</h2>
 * <p>This class contains a comment <b>"AName.enUS: a vehicle step"</b>, which identifies the language context to describe a VehicleStep as "a vehicle step". 
 * </p>
 * <p>
 * Delete the class VehicleStep in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStep&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.traffic.vehicle.step in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * Generated: true
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStep&fq=entiteVar_enUS_indexed_string:simulationName">Find the entity simulationName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _simulationName(Wrap<String> w);

	public String getSimulationName() {
		return simulationName;
	}
	public void setSimulationName(String o) {
		this.simulationName = VehicleStep.staticSetSimulationName(siteRequest_, o);
	}
	public static String staticSetSimulationName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected VehicleStep simulationNameInit() {
		Wrap<String> simulationNameWrap = new Wrap<String>().var("simulationName");
		if(simulationName == null) {
			_simulationName(simulationNameWrap);
			Optional.ofNullable(simulationNameWrap.getO()).ifPresent(o -> {
				setSimulationName(o);
			});
		}
		return (VehicleStep)this;
	}

	public static String staticSearchSimulationName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSimulationName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSimulationName(SiteRequestEnUS siteRequest_, String o) {
		return VehicleStep.staticSearchStrSimulationName(siteRequest_, VehicleStep.staticSearchSimulationName(siteRequest_, VehicleStep.staticSetSimulationName(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStep&fq=entiteVar_enUS_indexed_string:sumocfgPath">Find the entity sumocfgPath in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _sumocfgPath(Wrap<String> w);

	public String getSumocfgPath() {
		return sumocfgPath;
	}
	public void setSumocfgPath(String o) {
		this.sumocfgPath = VehicleStep.staticSetSumocfgPath(siteRequest_, o);
	}
	public static String staticSetSumocfgPath(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected VehicleStep sumocfgPathInit() {
		Wrap<String> sumocfgPathWrap = new Wrap<String>().var("sumocfgPath");
		if(sumocfgPath == null) {
			_sumocfgPath(sumocfgPathWrap);
			Optional.ofNullable(sumocfgPathWrap.getO()).ifPresent(o -> {
				setSumocfgPath(o);
			});
		}
		return (VehicleStep)this;
	}

	public static String staticSearchSumocfgPath(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSumocfgPath(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSumocfgPath(SiteRequestEnUS siteRequest_, String o) {
		return VehicleStep.staticSearchStrSumocfgPath(siteRequest_, VehicleStep.staticSearchSumocfgPath(siteRequest_, VehicleStep.staticSetSumocfgPath(siteRequest_, o)));
	}

	public String sqlSumocfgPath() {
		return sumocfgPath;
	}

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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStep&fq=entiteVar_enUS_indexed_string:vehicleId">Find the entity vehicleId in Solr</a>
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
			Optional.ofNullable(vehicleIdWrap.getO()).ifPresent(o -> {
				setVehicleId(o);
			});
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStep&fq=entiteVar_enUS_indexed_string:vehicleType">Find the entity vehicleType in Solr</a>
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
			Optional.ofNullable(vehicleTypeWrap.getO()).ifPresent(o -> {
				setVehicleType(o);
			});
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStep&fq=entiteVar_enUS_indexed_string:angle">Find the entity angle in Solr</a>
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
	protected VehicleStep angleInit() {
		Wrap<BigDecimal> angleWrap = new Wrap<BigDecimal>().var("angle");
		if(angle == null) {
			_angle(angleWrap);
			Optional.ofNullable(angleWrap.getO()).ifPresent(o -> {
				setAngle(o);
			});
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStep&fq=entiteVar_enUS_indexed_string:speed">Find the entity speed in Solr</a>
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
	protected VehicleStep speedInit() {
		Wrap<BigDecimal> speedWrap = new Wrap<BigDecimal>().var("speed");
		if(speed == null) {
			_speed(speedWrap);
			Optional.ofNullable(speedWrap.getO()).ifPresent(o -> {
				setSpeed(o);
			});
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStep&fq=entiteVar_enUS_indexed_string:pos">Find the entity pos in Solr</a>
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
	protected VehicleStep posInit() {
		Wrap<BigDecimal> posWrap = new Wrap<BigDecimal>().var("pos");
		if(pos == null) {
			_pos(posWrap);
			Optional.ofNullable(posWrap.getO()).ifPresent(o -> {
				setPos(o);
			});
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStep&fq=entiteVar_enUS_indexed_string:slope">Find the entity slope in Solr</a>
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
	protected VehicleStep slopeInit() {
		Wrap<BigDecimal> slopeWrap = new Wrap<BigDecimal>().var("slope");
		if(slope == null) {
			_slope(slopeWrap);
			Optional.ofNullable(slopeWrap.getO()).ifPresent(o -> {
				setSlope(o);
			});
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
				simulationNameInit();
				sumocfgPathInit();
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
			case "simulationName":
				return oVehicleStep.simulationName;
			case "sumocfgPath":
				return oVehicleStep.sumocfgPath;
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
		case "simulationName":
			return VehicleStep.staticSetSimulationName(siteRequest_, o);
		case "sumocfgPath":
			return VehicleStep.staticSetSumocfgPath(siteRequest_, o);
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
		case "simulationName":
			return VehicleStep.staticSearchSimulationName(siteRequest_, (String)o);
		case "sumocfgPath":
			return VehicleStep.staticSearchSumocfgPath(siteRequest_, (String)o);
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
		case "simulationName":
			return VehicleStep.staticSearchStrSimulationName(siteRequest_, (String)o);
		case "sumocfgPath":
			return VehicleStep.staticSearchStrSumocfgPath(siteRequest_, (String)o);
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
		case "simulationName":
			return VehicleStep.staticSearchFqSimulationName(siteRequest_, o);
		case "sumocfgPath":
			return VehicleStep.staticSearchFqSumocfgPath(siteRequest_, o);
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
			} else if("vehicleid".equals(varLower)) {
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
		saves = Optional.ofNullable((ArrayList<String>)doc.get("saves_docvalues_strings")).orElse(new ArrayList<String>());
		if(saves != null) {

			if(saves.contains("simulationName")) {
				String simulationName = (String)doc.get("simulationName_docvalues_string");
				if(simulationName != null)
					oVehicleStep.setSimulationName(simulationName);
			}

			if(saves.contains("sumocfgPath")) {
				String sumocfgPath = (String)doc.get("sumocfgPath_docvalues_string");
				if(sumocfgPath != null)
					oVehicleStep.setSumocfgPath(sumocfgPath);
			}

			if(saves.contains("vehicleId")) {
				String vehicleId = (String)doc.get("vehicleId_docvalues_string");
				if(vehicleId != null)
					oVehicleStep.setVehicleId(vehicleId);
			}

			if(saves.contains("vehicleType")) {
				String vehicleType = (String)doc.get("vehicleType_docvalues_string");
				if(vehicleType != null)
					oVehicleStep.setVehicleType(vehicleType);
			}

			if(saves.contains("angle")) {
				Double angle = (Double)doc.get("angle_docvalues_double");
				if(angle != null)
					oVehicleStep.setAngle(angle);
			}

			if(saves.contains("speed")) {
				Double speed = (Double)doc.get("speed_docvalues_double");
				if(speed != null)
					oVehicleStep.setSpeed(speed);
			}

			if(saves.contains("pos")) {
				Double pos = (Double)doc.get("pos_docvalues_double");
				if(pos != null)
					oVehicleStep.setPos(pos);
			}

			if(saves.contains("slope")) {
				Double slope = (Double)doc.get("slope_docvalues_double");
				if(slope != null)
					oVehicleStep.setSlope(slope);
			}
		}

		super.populateMapResult(doc);
	}

	public void indexVehicleStep(JsonObject doc) {
		if(simulationName != null) {
			doc.put("simulationName_docvalues_string", simulationName);
		}
		if(sumocfgPath != null) {
			doc.put("sumocfgPath_docvalues_string", sumocfgPath);
		}
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
			case "simulationName":
				return "simulationName_docvalues_string";
			case "sumocfgPath":
				return "sumocfgPath_docvalues_string";
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
			case "simulationName":
				return "simulationName_docvalues_string";
			case "sumocfgPath":
				return "sumocfgPath_docvalues_string";
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
			case "simulationName_docvalues_string":
				return "simulationName";
			case "sumocfgPath_docvalues_string":
				return "sumocfgPath";
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
		SiteRequestEnUS siteRequest = oVehicleStep.getSiteRequest_();

		oVehicleStep.setSimulationName(Optional.ofNullable(doc.get("simulationName_docvalues_string")).map(v -> v.toString()).orElse(null));
		oVehicleStep.setSumocfgPath(Optional.ofNullable(doc.get("sumocfgPath_docvalues_string")).map(v -> v.toString()).orElse(null));
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
			if(!Objects.equals(simulationName, original.getSimulationName()))
				apiRequest.addVars("simulationName");
			if(!Objects.equals(sumocfgPath, original.getSumocfgPath()))
				apiRequest.addVars("sumocfgPath");
			if(!Objects.equals(vehicleId, original.getVehicleId()))
				apiRequest.addVars("vehicleId");
			if(!Objects.equals(vehicleType, original.getVehicleType()))
				apiRequest.addVars("vehicleType");
			if(!Objects.equals(angle, original.getAngle()) && angle != null && original.getAngle() != null && angle.compareTo(original.getAngle()) != 0)
				apiRequest.addVars("angle");
			if(!Objects.equals(speed, original.getSpeed()) && speed != null && original.getSpeed() != null && speed.compareTo(original.getSpeed()) != 0)
				apiRequest.addVars("speed");
			if(!Objects.equals(pos, original.getPos()) && pos != null && original.getPos() != null && pos.compareTo(original.getPos()) != 0)
				apiRequest.addVars("pos");
			if(!Objects.equals(slope, original.getSlope()) && slope != null && original.getSlope() != null && slope.compareTo(original.getSlope()) != 0)
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
		sb.append(Optional.ofNullable(vehicleId).map(v -> "vehicleId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(vehicleType).map(v -> "vehicleType: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(angle).map(v -> "angle: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(speed).map(v -> "speed: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pos).map(v -> "pos: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(slope).map(v -> "slope: " + v + "\n").orElse(""));
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "VehicleStep";
	public static final String VAR_simulationName = "simulationName";
	public static final String VAR_sumocfgPath = "sumocfgPath";
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
		vars.add(VAR_simulationName);
		vars.add(VAR_sumocfgPath);
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

	public static final String DISPLAY_NAME_simulationName = "simulation name";
	public static final String DISPLAY_NAME_sumocfgPath = "sumocfg path";
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
		case VAR_simulationName:
			return DISPLAY_NAME_simulationName;
		case VAR_sumocfgPath:
			return DISPLAY_NAME_sumocfgPath;
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
		case VAR_simulationName:
			return "String";
		case VAR_sumocfgPath:
			return "String";
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

	public static Integer htmColumnVehicleStep(String var) {
		switch(var) {
			default:
				return MapResult.htmColumnMapResult(var);
		}
	}

	public static Integer htmRowVehicleStep(String var) {
		switch(var) {
		case VAR_simulationName:
			return 3;
		case VAR_sumocfgPath:
			return 3;
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
				return MapResult.htmRowMapResult(var);
		}
	}

	public static Integer htmCellVehicleStep(String var) {
		switch(var) {
		case VAR_simulationName:
			return 1;
		case VAR_sumocfgPath:
			return 2;
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
				return MapResult.htmCellMapResult(var);
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
