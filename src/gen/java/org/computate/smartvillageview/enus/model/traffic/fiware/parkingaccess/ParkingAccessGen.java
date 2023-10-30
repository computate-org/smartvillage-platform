package org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess;

import org.computate.smartvillageview.enus.request.SiteRequestEnUS;
import org.computate.smartvillageview.enus.model.base.BaseModel;
import io.vertx.core.json.JsonObject;
import java.util.Date;
import java.util.Set;
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
import java.lang.String;
import io.vertx.pgclient.data.Polygon;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.BeanDescription;
import java.util.stream.Collectors;
import io.vertx.core.json.Json;
import io.vertx.pgclient.data.Point;
import org.computate.vertx.serialize.pgclient.PgClientPolygonSerializer;
import org.computate.vertx.serialize.pgclient.PgClientPolygonDeserializer;
import java.math.BigDecimal;
import io.vertx.pgclient.data.Path;
import org.computate.vertx.serialize.pgclient.PgClientPathSerializer;
import org.computate.vertx.serialize.pgclient.PgClientPathDeserializer;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;

/**
 * <ol>
<h3>Suggestions that can generate more code for you: </h3> * </ol>
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class ParkingAccessGen into the class ParkingAccess. 
 * </li>
 * <h3>About the ParkingAccess class and it's generated class ParkingAccessGen&lt;BaseModel&gt;: </h3>extends ParkingAccessGen
 * <p>
 * This Java class extends a generated Java class ParkingAccessGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess.ParkingAccess">Find the class ParkingAccess in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends ParkingAccessGen<BaseModel>
 * <p>This <code>class ParkingAccess extends ParkingAccessGen&lt;BaseModel&gt;</code>, which means it extends a newly generated ParkingAccessGen. 
 * The generated <code>class ParkingAccessGen extends BaseModel</code> which means that ParkingAccess extends ParkingAccessGen which extends BaseModel. 
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
 * <p>This class contains a comment <b>"ApiTag: ParkingAccess"</b>, which groups all of the OpenAPIs for ParkingAccess objects under the tag "ParkingAccess". 
 * </p>
 * <h2>ApiUri.enUS: /api/parking-access</h2>
 * <p>This class contains a comment <b>"ApiUri: /api/parking-access"</b>, which defines the base API URI for ParkingAccess objects as "/api/parking-access" in the OpenAPI spec. 
 * </p>
 * <h2>Color: 2017-shaded-spruce</h2>
 * <p>This class contains a comment <b>"Color: 2017-shaded-spruce"</b>, which styles the ParkingAccess page "2017-shaded-spruce". 
 * This will reference a CSS class defined by the stylesheets in the project that starts with "w3-". 
 * A css class of "w3-2017-shaded-spruce" is expected to exist in the project stylesheets, and is inspired by W3 CSS colors. 
 * See: <a href="https://www.w3schools.com/w3css/w3css_colors.asp">https://www.w3schools.com/w3css/w3css_colors.asp</a>. 
 * </p>
 * <h2>IconGroup: duotone</h2>
 * <p>This class contains a comment <b>"IconGroup: duotone"</b>, which adds icons on the ParkingAccess page with a group of "duotone". 
 * This will reference a Font Awesome icon group that starts with "fa-" followed by the icon group "duotone", together is "fa-duotone". 
 * A Font Awesome icon group of "duotone" is expected to exist. 
 * The Font Awesome groups currently supported include: solid, regular, light, thin, duotone, sharp, and kit. 
 * See: <a href="https://fontawesome.com/docs/web/dig-deeper/styles">https://fontawesome.com/docs/web/dig-deeper/styles</a>. 
 * </p>
 * <h2>IconName: map-location-dot</h2>
 * <p>This class contains a comment <b>"IconName: map-location-dot"</b>, which adds icons on the ParkingAccess page with a name of "map-location-dot". 
 * This will reference a Font Awesome icon that starts with the icon group "fa-duotone fa-" followed by the icon name, which is "fa-duotone fa-map-location-dot". 
 * A Font Awesome icon of "fa-duotone fa-map-location-dot" is expected to exist. 
 * See: <a href="https://fontawesome.com/icons">https://fontawesome.com/icons</a>. 
 * </p>
 * <h2>Indexed: true</h2>
 * <p>This class contains a comment <b>"Indexed: true"</b>, which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * <h2>{@inheritDoc}</h2>
 * <p>By adding a class comment "{@inheritDoc}", the ParkingAccess class will inherit the helpful inherited class comments from the super class ParkingAccessGen. 
 * </p>
 * <h2>Rows: 100</h2>
 * <p>This class contains a comment <b>"Rows: 100"</b>, which means the ParkingAccess API will return a default of 100 records instead of 10 by default. 
 * Each API has built in pagination of the search records to ensure a user can query all the data a page at a time without running the application out of memory. 
 * </p>
 * <h2>Order: 1</h2>
 * <p>This class contains a comment <b>"Order: 1"</b>, which means this class will be sorted by the given number 1 ascending when code that relates to multiple classes at the same time is generated. 
 * </p>
 * <h2>SqlOrder: 1</h2>
 * <p>This class contains a comment <b>"SqlOrder: 1"</b>, which means this class will be sorted by the given number 1 ascending when SQL code to create and drop the tables is generated. 
 * </p>
 * <h2>Model: true</h2>
 * <p>This class contains a comment <b>"Model: true"</b>, which means this class will be stored in the database. 
 * Every protected void method that begins with "_" that contains a "Persist: true" comment will be a persisted field in the database table. 
 * </p>
 * <h2>Page: true</h2>
 * <p>This class contains a comment <b>"Page: true"</b>, which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess.ParkingAccessPage. 
 * </p>
 * <h2>SuperPage.enUS: BaseModelPage</h2>
 * <p>This class contains a comment <b>"SuperPage.enUS: BaseModelPage"</b>, which identifies the Java super class of the page code by it's class simple name "BaseModelPage". 
 * This means that the newly created class org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess.ParkingAccessPage extends org.computate.smartvillageview.enus.model.base.BaseModelPage. 
 * </p>
 * <h2>Promise: true</h2>
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the ParkingAccess Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * This class contains a comment <b>"Role.enUS: SiteAdmin"</b>, which identifies the default role name "SiteAdmin" of the OAuth2/OpenID Connect user role required to access this ParkingAccess API. 
 * It's possible to reconfigure the roles required to access the ParkingAccess API by configuring an environment variable like this: 
 * </p>
 * <pre>AUTH_ROLE_REQUIRED_ParkingAccess: ["SiteAdmin"]</pre>
 * <h2>AName.enUS: a ParkingAccess</h2>
 * <p>This class contains a comment <b>"AName.enUS: a ParkingAccess"</b>, which identifies the language context to describe a ParkingAccess as "a ParkingAccess". 
 * </p>
 * <p>
 * Delete the class ParkingAccess in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess.ParkingAccess&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * Generated: true
 **/
public abstract class ParkingAccessGen<DEV> extends BaseModel {
	protected static final Logger LOG = LoggerFactory.getLogger(ParkingAccess.class);

	public static final String ParkingAccess_Description_enUS = "ApiTag.enUS: ParkingAccess";
	public static final String ParkingAccess_AName_enUS = "a ParkingAccess";
	public static final String ParkingAccess_This_enUS = "this ";
	public static final String ParkingAccess_ThisName_enUS = "this ParkingAccess";
	public static final String ParkingAccess_A_enUS = "a ";
	public static final String ParkingAccess_TheName_enUS = "the ParkingAccess";
	public static final String ParkingAccess_NameSingular_enUS = "ParkingAccess";
	public static final String ParkingAccess_NamePlural_enUS = "ParkingAccesss";
	public static final String ParkingAccess_NameActual_enUS = "current ParkingAccess";
	public static final String ParkingAccess_AllName_enUS = "all the ParkingAccesss";
	public static final String ParkingAccess_SearchAllNameBy_enUS = "search ParkingAccesss by ";
	public static final String ParkingAccess_Title_enUS = "ParkingAccesss";
	public static final String ParkingAccess_ThePluralName_enUS = "the ParkingAccesss";
	public static final String ParkingAccess_NoNameFound_enUS = "no ParkingAccess found";
	public static final String ParkingAccess_ApiUri_enUS = "/api/parking-access";
	public static final String ParkingAccess_ApiUriSearchPage_enUS = "/parking-access";
	public static final String ParkingAccess_OfName_enUS = "of ParkingAccess";
	public static final String ParkingAccess_ANameAdjective_enUS = "a ParkingAccess";
	public static final String ParkingAccess_NameAdjectiveSingular_enUS = "ParkingAccess";
	public static final String ParkingAccess_NameAdjectivePlural_enUS = "ParkingAccesss";
	public static final String Search_enUS_Uri = "/api/parking-access";
	public static final String Search_enUS_ImageUri = "/png/api/parking-access-999.png";
	public static final String GET_enUS_Uri = "/api/parking-access/{id}";
	public static final String GET_enUS_ImageUri = "/png/api/parking-access/{id}-999.png";
	public static final String PATCH_enUS_Uri = "/api/parking-access";
	public static final String PATCH_enUS_ImageUri = "/png/api/parking-access-999.png";
	public static final String POST_enUS_Uri = "/api/parking-access";
	public static final String POST_enUS_ImageUri = "/png/api/parking-access-999.png";
	public static final String PUTImport_enUS_Uri = "/api/parking-access-import";
	public static final String PUTImport_enUS_ImageUri = "/png/api/parking-access-import-999.png";
	public static final String SearchPage_enUS_Uri = "/parking-access";
	public static final String SearchPage_enUS_ImageUri = "/png/parking-access-999.png";

	public static final String ParkingAccess_Color = "2017-shaded-spruce";
	public static final String ParkingAccess_IconGroup = "duotone";
	public static final String ParkingAccess_IconName = "map-location-dot";
	public static final Integer ParkingAccess_Rows = 100;

	/////////////
	// address //
	/////////////


	/**	 The entity address
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject address;

	/**	<br> The entity address
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess.ParkingAccess&fq=entiteVar_enUS_indexed_string:address">Find the entity address in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _address(Wrap<JsonObject> w);

	public JsonObject getAddress() {
		return address;
	}

	public void setAddress(JsonObject address) {
		this.address = address;
	}
	@JsonIgnore
	public void setAddress(String o) {
		this.address = ParkingAccess.staticSetAddress(siteRequest_, o);
	}
	public static JsonObject staticSetAddress(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected ParkingAccess addressInit() {
		Wrap<JsonObject> addressWrap = new Wrap<JsonObject>().var("address");
		if(address == null) {
			_address(addressWrap);
			Optional.ofNullable(addressWrap.getO()).ifPresent(o -> {
				setAddress(o);
			});
		}
		return (ParkingAccess)this;
	}

	public static String staticSearchAddress(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o.toString();
	}

	public static String staticSearchStrAddress(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAddress(SiteRequestEnUS siteRequest_, String o) {
		return ParkingAccess.staticSearchStrAddress(siteRequest_, ParkingAccess.staticSearchAddress(siteRequest_, ParkingAccess.staticSetAddress(siteRequest_, o)));
	}

	public JsonObject sqlAddress() {
		return address;
	}

	///////////////////
	// alternateName //
	///////////////////


	/**	 The entity alternateName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String alternateName;

	/**	<br> The entity alternateName
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess.ParkingAccess&fq=entiteVar_enUS_indexed_string:alternateName">Find the entity alternateName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _alternateName(Wrap<String> w);

	public String getAlternateName() {
		return alternateName;
	}
	public void setAlternateName(String o) {
		this.alternateName = ParkingAccess.staticSetAlternateName(siteRequest_, o);
	}
	public static String staticSetAlternateName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected ParkingAccess alternateNameInit() {
		Wrap<String> alternateNameWrap = new Wrap<String>().var("alternateName");
		if(alternateName == null) {
			_alternateName(alternateNameWrap);
			Optional.ofNullable(alternateNameWrap.getO()).ifPresent(o -> {
				setAlternateName(o);
			});
		}
		return (ParkingAccess)this;
	}

	public static String staticSearchAlternateName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrAlternateName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAlternateName(SiteRequestEnUS siteRequest_, String o) {
		return ParkingAccess.staticSearchStrAlternateName(siteRequest_, ParkingAccess.staticSearchAlternateName(siteRequest_, ParkingAccess.staticSetAlternateName(siteRequest_, o)));
	}

	public String sqlAlternateName() {
		return alternateName;
	}

	////////////////
	// areaServed //
	////////////////


	/**	 The entity areaServed
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonDeserialize(using = PgClientPolygonDeserializer.class)
	@JsonSerialize(using = PgClientPolygonSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Polygon areaServed;

	/**	<br> The entity areaServed
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess.ParkingAccess&fq=entiteVar_enUS_indexed_string:areaServed">Find the entity areaServed in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _areaServed(Wrap<Polygon> w);

	public Polygon getAreaServed() {
		return areaServed;
	}

	public void setAreaServed(Polygon areaServed) {
		this.areaServed = areaServed;
	}
	@JsonIgnore
	public void setAreaServed(String o) {
		this.areaServed = ParkingAccess.staticSetAreaServed(siteRequest_, o);
	}
	public static Polygon staticSetAreaServed(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
			try {
				Polygon shape = null;
				if(StringUtils.isNotBlank(o)) {
					ObjectMapper objectMapper = new ObjectMapper();
					SimpleModule module = new SimpleModule();
					module.setDeserializerModifier(new BeanDeserializerModifier() {
						@Override
						public JsonDeserializer<?> modifyDeserializer(DeserializationConfig config, BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
							if (beanDesc.getBeanClass() == Polygon.class) {
								return new PgClientPolygonDeserializer();
							}
							return deserializer;
						}
					});
					objectMapper.registerModule(module);
					shape = objectMapper.readValue(Json.encode(o), Polygon.class);
				}
				return shape;
			} catch(Exception ex) {
				ExceptionUtils.rethrow(ex);
			}
		}
		return null;
	}
	public void setAreaServed(JsonObject o) {
		this.areaServed = ParkingAccess.staticSetAreaServed(siteRequest_, o);
	}
	public static Polygon staticSetAreaServed(SiteRequestEnUS siteRequest_, JsonObject o) {
		if(o != null) {
			try {
				Polygon shape = new Polygon();
				o.getJsonArray("coordinates").stream().map(a -> (JsonArray)a).forEach(g -> {
					g.stream().map(a -> (JsonArray)a).forEach(points -> {
						shape.addPoint(new Point(Double.parseDouble(points.getString(0)), Double.parseDouble(points.getString(1))));
					});
				});
				return shape;
			} catch(Exception ex) {
				ExceptionUtils.rethrow(ex);
			}
		}
		return null;
	}
	protected ParkingAccess areaServedInit() {
		Wrap<Polygon> areaServedWrap = new Wrap<Polygon>().var("areaServed");
		if(areaServed == null) {
			_areaServed(areaServedWrap);
			Optional.ofNullable(areaServedWrap.getO()).ifPresent(o -> {
				setAreaServed(o);
			});
		}
		return (ParkingAccess)this;
	}

	public static Polygon staticSearchAreaServed(SiteRequestEnUS siteRequest_, Polygon o) {
		return o;
	}

	public static String staticSearchStrAreaServed(SiteRequestEnUS siteRequest_, Polygon o) {
		JsonArray pointsArray = new JsonArray();
		o.getPoints().stream().map(point -> new JsonArray().add(Double.valueOf(point.getX())).add(Double.valueOf(point.getY()))).collect(Collectors.toList()).forEach(pointArray -> pointsArray.add(pointArray));
		return new JsonObject().put("type", "LineString").put("coordinates", pointsArray).toString();
	}

	public static String staticSearchFqAreaServed(SiteRequestEnUS siteRequest_, String o) {
		return ParkingAccess.staticSearchStrAreaServed(siteRequest_, ParkingAccess.staticSearchAreaServed(siteRequest_, ParkingAccess.staticSetAreaServed(siteRequest_, o)));
	}

	public Polygon sqlAreaServed() {
		return areaServed;
	}

	//////////////
	// category //
	//////////////


	/**	 The entity category
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject category;

	/**	<br> The entity category
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess.ParkingAccess&fq=entiteVar_enUS_indexed_string:category">Find the entity category in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _category(Wrap<JsonObject> w);

	public JsonObject getCategory() {
		return category;
	}

	public void setCategory(JsonObject category) {
		this.category = category;
	}
	@JsonIgnore
	public void setCategory(String o) {
		this.category = ParkingAccess.staticSetCategory(siteRequest_, o);
	}
	public static JsonObject staticSetCategory(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected ParkingAccess categoryInit() {
		Wrap<JsonObject> categoryWrap = new Wrap<JsonObject>().var("category");
		if(category == null) {
			_category(categoryWrap);
			Optional.ofNullable(categoryWrap.getO()).ifPresent(o -> {
				setCategory(o);
			});
		}
		return (ParkingAccess)this;
	}

	public static String staticSearchCategory(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o.toString();
	}

	public static String staticSearchStrCategory(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqCategory(SiteRequestEnUS siteRequest_, String o) {
		return ParkingAccess.staticSearchStrCategory(siteRequest_, ParkingAccess.staticSearchCategory(siteRequest_, ParkingAccess.staticSetCategory(siteRequest_, o)));
	}

	public JsonObject sqlCategory() {
		return category;
	}

	//////////////////
	// dataProvider //
	//////////////////


	/**	 The entity dataProvider
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String dataProvider;

	/**	<br> The entity dataProvider
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess.ParkingAccess&fq=entiteVar_enUS_indexed_string:dataProvider">Find the entity dataProvider in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _dataProvider(Wrap<String> w);

	public String getDataProvider() {
		return dataProvider;
	}
	public void setDataProvider(String o) {
		this.dataProvider = ParkingAccess.staticSetDataProvider(siteRequest_, o);
	}
	public static String staticSetDataProvider(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected ParkingAccess dataProviderInit() {
		Wrap<String> dataProviderWrap = new Wrap<String>().var("dataProvider");
		if(dataProvider == null) {
			_dataProvider(dataProviderWrap);
			Optional.ofNullable(dataProviderWrap.getO()).ifPresent(o -> {
				setDataProvider(o);
			});
		}
		return (ParkingAccess)this;
	}

	public static String staticSearchDataProvider(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDataProvider(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDataProvider(SiteRequestEnUS siteRequest_, String o) {
		return ParkingAccess.staticSearchStrDataProvider(siteRequest_, ParkingAccess.staticSearchDataProvider(siteRequest_, ParkingAccess.staticSetDataProvider(siteRequest_, o)));
	}

	public String sqlDataProvider() {
		return dataProvider;
	}

	/////////////////
	// dateCreated //
	/////////////////


	/**	 The entity dateCreated
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String dateCreated;

	/**	<br> The entity dateCreated
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess.ParkingAccess&fq=entiteVar_enUS_indexed_string:dateCreated">Find the entity dateCreated in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _dateCreated(Wrap<String> w);

	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String o) {
		this.dateCreated = ParkingAccess.staticSetDateCreated(siteRequest_, o);
	}
	public static String staticSetDateCreated(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected ParkingAccess dateCreatedInit() {
		Wrap<String> dateCreatedWrap = new Wrap<String>().var("dateCreated");
		if(dateCreated == null) {
			_dateCreated(dateCreatedWrap);
			Optional.ofNullable(dateCreatedWrap.getO()).ifPresent(o -> {
				setDateCreated(o);
			});
		}
		return (ParkingAccess)this;
	}

	public static String staticSearchDateCreated(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDateCreated(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDateCreated(SiteRequestEnUS siteRequest_, String o) {
		return ParkingAccess.staticSearchStrDateCreated(siteRequest_, ParkingAccess.staticSearchDateCreated(siteRequest_, ParkingAccess.staticSetDateCreated(siteRequest_, o)));
	}

	public String sqlDateCreated() {
		return dateCreated;
	}

	//////////////////
	// dateModified //
	//////////////////


	/**	 The entity dateModified
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String dateModified;

	/**	<br> The entity dateModified
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess.ParkingAccess&fq=entiteVar_enUS_indexed_string:dateModified">Find the entity dateModified in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _dateModified(Wrap<String> w);

	public String getDateModified() {
		return dateModified;
	}
	public void setDateModified(String o) {
		this.dateModified = ParkingAccess.staticSetDateModified(siteRequest_, o);
	}
	public static String staticSetDateModified(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected ParkingAccess dateModifiedInit() {
		Wrap<String> dateModifiedWrap = new Wrap<String>().var("dateModified");
		if(dateModified == null) {
			_dateModified(dateModifiedWrap);
			Optional.ofNullable(dateModifiedWrap.getO()).ifPresent(o -> {
				setDateModified(o);
			});
		}
		return (ParkingAccess)this;
	}

	public static String staticSearchDateModified(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDateModified(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDateModified(SiteRequestEnUS siteRequest_, String o) {
		return ParkingAccess.staticSearchStrDateModified(siteRequest_, ParkingAccess.staticSearchDateModified(siteRequest_, ParkingAccess.staticSetDateModified(siteRequest_, o)));
	}

	public String sqlDateModified() {
		return dateModified;
	}

	/////////////////
	// description //
	/////////////////


	/**	 The entity description
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String description;

	/**	<br> The entity description
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess.ParkingAccess&fq=entiteVar_enUS_indexed_string:description">Find the entity description in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _description(Wrap<String> w);

	public String getDescription() {
		return description;
	}
	public void setDescription(String o) {
		this.description = ParkingAccess.staticSetDescription(siteRequest_, o);
	}
	public static String staticSetDescription(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected ParkingAccess descriptionInit() {
		Wrap<String> descriptionWrap = new Wrap<String>().var("description");
		if(description == null) {
			_description(descriptionWrap);
			Optional.ofNullable(descriptionWrap.getO()).ifPresent(o -> {
				setDescription(o);
			});
		}
		return (ParkingAccess)this;
	}

	public static String staticSearchDescription(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDescription(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDescription(SiteRequestEnUS siteRequest_, String o) {
		return ParkingAccess.staticSearchStrDescription(siteRequest_, ParkingAccess.staticSearchDescription(siteRequest_, ParkingAccess.staticSetDescription(siteRequest_, o)));
	}

	public String sqlDescription() {
		return description;
	}

	//////////////
	// features //
	//////////////


	/**	 The entity features
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject features;

	/**	<br> The entity features
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess.ParkingAccess&fq=entiteVar_enUS_indexed_string:features">Find the entity features in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _features(Wrap<JsonObject> w);

	public JsonObject getFeatures() {
		return features;
	}

	public void setFeatures(JsonObject features) {
		this.features = features;
	}
	@JsonIgnore
	public void setFeatures(String o) {
		this.features = ParkingAccess.staticSetFeatures(siteRequest_, o);
	}
	public static JsonObject staticSetFeatures(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected ParkingAccess featuresInit() {
		Wrap<JsonObject> featuresWrap = new Wrap<JsonObject>().var("features");
		if(features == null) {
			_features(featuresWrap);
			Optional.ofNullable(featuresWrap.getO()).ifPresent(o -> {
				setFeatures(o);
			});
		}
		return (ParkingAccess)this;
	}

	public static String staticSearchFeatures(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o.toString();
	}

	public static String staticSearchStrFeatures(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqFeatures(SiteRequestEnUS siteRequest_, String o) {
		return ParkingAccess.staticSearchStrFeatures(siteRequest_, ParkingAccess.staticSearchFeatures(siteRequest_, ParkingAccess.staticSetFeatures(siteRequest_, o)));
	}

	public JsonObject sqlFeatures() {
		return features;
	}

	////////////
	// height //
	////////////


	/**	 The entity height
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal height;

	/**	<br> The entity height
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess.ParkingAccess&fq=entiteVar_enUS_indexed_string:height">Find the entity height in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _height(Wrap<BigDecimal> w);

	public BigDecimal getHeight() {
		return height;
	}

	public void setHeight(BigDecimal height) {
		this.height = height;
	}
	@JsonIgnore
	public void setHeight(String o) {
		this.height = ParkingAccess.staticSetHeight(siteRequest_, o);
	}
	public static BigDecimal staticSetHeight(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setHeight(Double o) {
		setHeight(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setHeight(Integer o) {
		setHeight(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setHeight(Number o) {
		setHeight(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected ParkingAccess heightInit() {
		Wrap<BigDecimal> heightWrap = new Wrap<BigDecimal>().var("height");
		if(height == null) {
			_height(heightWrap);
			Optional.ofNullable(heightWrap.getO()).ifPresent(o -> {
				setHeight(o);
			});
		}
		return (ParkingAccess)this;
	}

	public static Double staticSearchHeight(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrHeight(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqHeight(SiteRequestEnUS siteRequest_, String o) {
		return ParkingAccess.staticSearchStrHeight(siteRequest_, ParkingAccess.staticSearchHeight(siteRequest_, ParkingAccess.staticSetHeight(siteRequest_, o)));
	}

	public BigDecimal sqlHeight() {
		return height;
	}

	//////////////
	// location //
	//////////////


	/**	 The entity location
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonDeserialize(using = PgClientPathDeserializer.class)
	@JsonSerialize(using = PgClientPathSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Path location;

	/**	<br> The entity location
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess.ParkingAccess&fq=entiteVar_enUS_indexed_string:location">Find the entity location in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _location(Wrap<Path> w);

	public Path getLocation() {
		return location;
	}

	public void setLocation(Path location) {
		this.location = location;
	}
	@JsonIgnore
	public void setLocation(String o) {
		this.location = ParkingAccess.staticSetLocation(siteRequest_, o);
	}
	public static Path staticSetLocation(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
			try {
				Path shape = null;
				if(StringUtils.isNotBlank(o)) {
					ObjectMapper objectMapper = new ObjectMapper();
					SimpleModule module = new SimpleModule();
					module.setDeserializerModifier(new BeanDeserializerModifier() {
						@Override
						public JsonDeserializer<?> modifyDeserializer(DeserializationConfig config, BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
							if (beanDesc.getBeanClass() == Path.class) {
								return new PgClientPathDeserializer();
							}
							return deserializer;
						}
					});
					objectMapper.registerModule(module);
					shape = objectMapper.readValue(Json.encode(o), Path.class);
				}
				return shape;
			} catch(Exception ex) {
				ExceptionUtils.rethrow(ex);
			}
		}
		return null;
	}
	public void setLocation(JsonObject o) {
		this.location = ParkingAccess.staticSetLocation(siteRequest_, o);
	}
	public static Path staticSetLocation(SiteRequestEnUS siteRequest_, JsonObject o) {
		if(o != null) {
			try {
				Path shape = new Path();
				o.getJsonArray("coordinates").stream().map(a -> (JsonArray)a).forEach(g -> {
					g.stream().map(a -> (JsonArray)a).forEach(points -> {
						shape.addPoint(new Point(Double.parseDouble(points.getString(0)), Double.parseDouble(points.getString(1))));
					});
				});
				return shape;
			} catch(Exception ex) {
				ExceptionUtils.rethrow(ex);
			}
		}
		return null;
	}
	protected ParkingAccess locationInit() {
		Wrap<Path> locationWrap = new Wrap<Path>().var("location");
		if(location == null) {
			_location(locationWrap);
			Optional.ofNullable(locationWrap.getO()).ifPresent(o -> {
				setLocation(o);
			});
		}
		return (ParkingAccess)this;
	}

	public static Path staticSearchLocation(SiteRequestEnUS siteRequest_, Path o) {
		return o;
	}

	public static String staticSearchStrLocation(SiteRequestEnUS siteRequest_, Path o) {
		JsonArray pointsArray = new JsonArray();
		o.getPoints().stream().map(point -> new JsonArray().add(Double.valueOf(point.getX())).add(Double.valueOf(point.getY()))).collect(Collectors.toList()).forEach(pointArray -> pointsArray.add(pointArray));
		return new JsonObject().put("type", "LineString").put("coordinates", pointsArray).toString();
	}

	public static String staticSearchFqLocation(SiteRequestEnUS siteRequest_, String o) {
		return ParkingAccess.staticSearchStrLocation(siteRequest_, ParkingAccess.staticSearchLocation(siteRequest_, ParkingAccess.staticSetLocation(siteRequest_, o)));
	}

	public Path sqlLocation() {
		return location;
	}

	//////////
	// name //
	//////////


	/**	 The entity name
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String name;

	/**	<br> The entity name
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess.ParkingAccess&fq=entiteVar_enUS_indexed_string:name">Find the entity name in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _name(Wrap<String> w);

	public String getName() {
		return name;
	}
	public void setName(String o) {
		this.name = ParkingAccess.staticSetName(siteRequest_, o);
	}
	public static String staticSetName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected ParkingAccess nameInit() {
		Wrap<String> nameWrap = new Wrap<String>().var("name");
		if(name == null) {
			_name(nameWrap);
			Optional.ofNullable(nameWrap.getO()).ifPresent(o -> {
				setName(o);
			});
		}
		return (ParkingAccess)this;
	}

	public static String staticSearchName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqName(SiteRequestEnUS siteRequest_, String o) {
		return ParkingAccess.staticSearchStrName(siteRequest_, ParkingAccess.staticSearchName(siteRequest_, ParkingAccess.staticSetName(siteRequest_, o)));
	}

	public String sqlName() {
		return name;
	}

	///////////
	// owner //
	///////////


	/**	 The entity owner
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject owner;

	/**	<br> The entity owner
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess.ParkingAccess&fq=entiteVar_enUS_indexed_string:owner">Find the entity owner in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _owner(Wrap<JsonObject> w);

	public JsonObject getOwner() {
		return owner;
	}

	public void setOwner(JsonObject owner) {
		this.owner = owner;
	}
	@JsonIgnore
	public void setOwner(String o) {
		this.owner = ParkingAccess.staticSetOwner(siteRequest_, o);
	}
	public static JsonObject staticSetOwner(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected ParkingAccess ownerInit() {
		Wrap<JsonObject> ownerWrap = new Wrap<JsonObject>().var("owner");
		if(owner == null) {
			_owner(ownerWrap);
			Optional.ofNullable(ownerWrap.getO()).ifPresent(o -> {
				setOwner(o);
			});
		}
		return (ParkingAccess)this;
	}

	public static String staticSearchOwner(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o.toString();
	}

	public static String staticSearchStrOwner(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqOwner(SiteRequestEnUS siteRequest_, String o) {
		return ParkingAccess.staticSearchStrOwner(siteRequest_, ParkingAccess.staticSearchOwner(siteRequest_, ParkingAccess.staticSetOwner(siteRequest_, o)));
	}

	public JsonObject sqlOwner() {
		return owner;
	}

	/////////////////////////
	// refOffStreetParking //
	/////////////////////////


	/**	 The entity refOffStreetParking
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject refOffStreetParking;

	/**	<br> The entity refOffStreetParking
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess.ParkingAccess&fq=entiteVar_enUS_indexed_string:refOffStreetParking">Find the entity refOffStreetParking in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _refOffStreetParking(Wrap<JsonObject> w);

	public JsonObject getRefOffStreetParking() {
		return refOffStreetParking;
	}

	public void setRefOffStreetParking(JsonObject refOffStreetParking) {
		this.refOffStreetParking = refOffStreetParking;
	}
	@JsonIgnore
	public void setRefOffStreetParking(String o) {
		this.refOffStreetParking = ParkingAccess.staticSetRefOffStreetParking(siteRequest_, o);
	}
	public static JsonObject staticSetRefOffStreetParking(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected ParkingAccess refOffStreetParkingInit() {
		Wrap<JsonObject> refOffStreetParkingWrap = new Wrap<JsonObject>().var("refOffStreetParking");
		if(refOffStreetParking == null) {
			_refOffStreetParking(refOffStreetParkingWrap);
			Optional.ofNullable(refOffStreetParkingWrap.getO()).ifPresent(o -> {
				setRefOffStreetParking(o);
			});
		}
		return (ParkingAccess)this;
	}

	public static String staticSearchRefOffStreetParking(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o.toString();
	}

	public static String staticSearchStrRefOffStreetParking(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqRefOffStreetParking(SiteRequestEnUS siteRequest_, String o) {
		return ParkingAccess.staticSearchStrRefOffStreetParking(siteRequest_, ParkingAccess.staticSearchRefOffStreetParking(siteRequest_, ParkingAccess.staticSetRefOffStreetParking(siteRequest_, o)));
	}

	public JsonObject sqlRefOffStreetParking() {
		return refOffStreetParking;
	}

	/////////////
	// seeAlso //
	/////////////


	/**	 The entity seeAlso
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject seeAlso;

	/**	<br> The entity seeAlso
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess.ParkingAccess&fq=entiteVar_enUS_indexed_string:seeAlso">Find the entity seeAlso in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _seeAlso(Wrap<JsonObject> w);

	public JsonObject getSeeAlso() {
		return seeAlso;
	}

	public void setSeeAlso(JsonObject seeAlso) {
		this.seeAlso = seeAlso;
	}
	@JsonIgnore
	public void setSeeAlso(String o) {
		this.seeAlso = ParkingAccess.staticSetSeeAlso(siteRequest_, o);
	}
	public static JsonObject staticSetSeeAlso(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected ParkingAccess seeAlsoInit() {
		Wrap<JsonObject> seeAlsoWrap = new Wrap<JsonObject>().var("seeAlso");
		if(seeAlso == null) {
			_seeAlso(seeAlsoWrap);
			Optional.ofNullable(seeAlsoWrap.getO()).ifPresent(o -> {
				setSeeAlso(o);
			});
		}
		return (ParkingAccess)this;
	}

	public static String staticSearchSeeAlso(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o.toString();
	}

	public static String staticSearchStrSeeAlso(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSeeAlso(SiteRequestEnUS siteRequest_, String o) {
		return ParkingAccess.staticSearchStrSeeAlso(siteRequest_, ParkingAccess.staticSearchSeeAlso(siteRequest_, ParkingAccess.staticSetSeeAlso(siteRequest_, o)));
	}

	public JsonObject sqlSeeAlso() {
		return seeAlso;
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess.ParkingAccess&fq=entiteVar_enUS_indexed_string:slope">Find the entity slope in Solr</a>
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
		this.slope = ParkingAccess.staticSetSlope(siteRequest_, o);
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
	protected ParkingAccess slopeInit() {
		Wrap<BigDecimal> slopeWrap = new Wrap<BigDecimal>().var("slope");
		if(slope == null) {
			_slope(slopeWrap);
			Optional.ofNullable(slopeWrap.getO()).ifPresent(o -> {
				setSlope(o);
			});
		}
		return (ParkingAccess)this;
	}

	public static Double staticSearchSlope(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrSlope(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSlope(SiteRequestEnUS siteRequest_, String o) {
		return ParkingAccess.staticSearchStrSlope(siteRequest_, ParkingAccess.staticSearchSlope(siteRequest_, ParkingAccess.staticSetSlope(siteRequest_, o)));
	}

	public BigDecimal sqlSlope() {
		return slope;
	}

	////////////
	// source //
	////////////


	/**	 The entity source
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String source;

	/**	<br> The entity source
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess.ParkingAccess&fq=entiteVar_enUS_indexed_string:source">Find the entity source in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _source(Wrap<String> w);

	public String getSource() {
		return source;
	}
	public void setSource(String o) {
		this.source = ParkingAccess.staticSetSource(siteRequest_, o);
	}
	public static String staticSetSource(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected ParkingAccess sourceInit() {
		Wrap<String> sourceWrap = new Wrap<String>().var("source");
		if(source == null) {
			_source(sourceWrap);
			Optional.ofNullable(sourceWrap.getO()).ifPresent(o -> {
				setSource(o);
			});
		}
		return (ParkingAccess)this;
	}

	public static String staticSearchSource(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSource(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSource(SiteRequestEnUS siteRequest_, String o) {
		return ParkingAccess.staticSearchStrSource(siteRequest_, ParkingAccess.staticSearchSource(siteRequest_, ParkingAccess.staticSetSource(siteRequest_, o)));
	}

	public String sqlSource() {
		return source;
	}

	///////////
	// width //
	///////////


	/**	 The entity width
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal width;

	/**	<br> The entity width
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.parkingaccess.ParkingAccess&fq=entiteVar_enUS_indexed_string:width">Find the entity width in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _width(Wrap<BigDecimal> w);

	public BigDecimal getWidth() {
		return width;
	}

	public void setWidth(BigDecimal width) {
		this.width = width;
	}
	@JsonIgnore
	public void setWidth(String o) {
		this.width = ParkingAccess.staticSetWidth(siteRequest_, o);
	}
	public static BigDecimal staticSetWidth(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setWidth(Double o) {
		setWidth(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setWidth(Integer o) {
		setWidth(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setWidth(Number o) {
		setWidth(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected ParkingAccess widthInit() {
		Wrap<BigDecimal> widthWrap = new Wrap<BigDecimal>().var("width");
		if(width == null) {
			_width(widthWrap);
			Optional.ofNullable(widthWrap.getO()).ifPresent(o -> {
				setWidth(o);
			});
		}
		return (ParkingAccess)this;
	}

	public static Double staticSearchWidth(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrWidth(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqWidth(SiteRequestEnUS siteRequest_, String o) {
		return ParkingAccess.staticSearchStrWidth(siteRequest_, ParkingAccess.staticSearchWidth(siteRequest_, ParkingAccess.staticSetWidth(siteRequest_, o)));
	}

	public BigDecimal sqlWidth() {
		return width;
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepParkingAccess(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepParkingAccess();
	}

	public Future<Void> promiseDeepParkingAccess() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseParkingAccess(promise2);
		promise2.future().onSuccess(a -> {
			super.promiseDeepBaseModel(siteRequest_).onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseParkingAccess(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				addressInit();
				alternateNameInit();
				areaServedInit();
				categoryInit();
				dataProviderInit();
				dateCreatedInit();
				dateModifiedInit();
				descriptionInit();
				featuresInit();
				heightInit();
				locationInit();
				nameInit();
				ownerInit();
				refOffStreetParkingInit();
				seeAlsoInit();
				slopeInit();
				sourceInit();
				widthInit();
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
		return promiseDeepParkingAccess(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestParkingAccess(SiteRequestEnUS siteRequest_) {
			super.siteRequestBaseModel(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestParkingAccess(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainParkingAccess(v);
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
	public Object obtainParkingAccess(String var) {
		ParkingAccess oParkingAccess = (ParkingAccess)this;
		switch(var) {
			case "address":
				return oParkingAccess.address;
			case "alternateName":
				return oParkingAccess.alternateName;
			case "areaServed":
				return oParkingAccess.areaServed;
			case "category":
				return oParkingAccess.category;
			case "dataProvider":
				return oParkingAccess.dataProvider;
			case "dateCreated":
				return oParkingAccess.dateCreated;
			case "dateModified":
				return oParkingAccess.dateModified;
			case "description":
				return oParkingAccess.description;
			case "features":
				return oParkingAccess.features;
			case "height":
				return oParkingAccess.height;
			case "location":
				return oParkingAccess.location;
			case "name":
				return oParkingAccess.name;
			case "owner":
				return oParkingAccess.owner;
			case "refOffStreetParking":
				return oParkingAccess.refOffStreetParking;
			case "seeAlso":
				return oParkingAccess.seeAlso;
			case "slope":
				return oParkingAccess.slope;
			case "source":
				return oParkingAccess.source;
			case "width":
				return oParkingAccess.width;
			default:
				return super.obtainBaseModel(var);
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
				o = relateParkingAccess(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateParkingAccess(String var, Object val) {
		ParkingAccess oParkingAccess = (ParkingAccess)this;
		switch(var) {
			default:
				return super.relateBaseModel(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetParkingAccess(entityVar,  siteRequest_, o);
	}
	public static Object staticSetParkingAccess(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "address":
			return ParkingAccess.staticSetAddress(siteRequest_, o);
		case "alternateName":
			return ParkingAccess.staticSetAlternateName(siteRequest_, o);
		case "areaServed":
			return ParkingAccess.staticSetAreaServed(siteRequest_, o);
		case "category":
			return ParkingAccess.staticSetCategory(siteRequest_, o);
		case "dataProvider":
			return ParkingAccess.staticSetDataProvider(siteRequest_, o);
		case "dateCreated":
			return ParkingAccess.staticSetDateCreated(siteRequest_, o);
		case "dateModified":
			return ParkingAccess.staticSetDateModified(siteRequest_, o);
		case "description":
			return ParkingAccess.staticSetDescription(siteRequest_, o);
		case "features":
			return ParkingAccess.staticSetFeatures(siteRequest_, o);
		case "height":
			return ParkingAccess.staticSetHeight(siteRequest_, o);
		case "location":
			return ParkingAccess.staticSetLocation(siteRequest_, o);
		case "name":
			return ParkingAccess.staticSetName(siteRequest_, o);
		case "owner":
			return ParkingAccess.staticSetOwner(siteRequest_, o);
		case "refOffStreetParking":
			return ParkingAccess.staticSetRefOffStreetParking(siteRequest_, o);
		case "seeAlso":
			return ParkingAccess.staticSetSeeAlso(siteRequest_, o);
		case "slope":
			return ParkingAccess.staticSetSlope(siteRequest_, o);
		case "source":
			return ParkingAccess.staticSetSource(siteRequest_, o);
		case "width":
			return ParkingAccess.staticSetWidth(siteRequest_, o);
			default:
				return BaseModel.staticSetBaseModel(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchParkingAccess(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchParkingAccess(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "address":
			return ParkingAccess.staticSearchAddress(siteRequest_, (JsonObject)o);
		case "alternateName":
			return ParkingAccess.staticSearchAlternateName(siteRequest_, (String)o);
		case "areaServed":
			return ParkingAccess.staticSearchAreaServed(siteRequest_, (Polygon)o);
		case "category":
			return ParkingAccess.staticSearchCategory(siteRequest_, (JsonObject)o);
		case "dataProvider":
			return ParkingAccess.staticSearchDataProvider(siteRequest_, (String)o);
		case "dateCreated":
			return ParkingAccess.staticSearchDateCreated(siteRequest_, (String)o);
		case "dateModified":
			return ParkingAccess.staticSearchDateModified(siteRequest_, (String)o);
		case "description":
			return ParkingAccess.staticSearchDescription(siteRequest_, (String)o);
		case "features":
			return ParkingAccess.staticSearchFeatures(siteRequest_, (JsonObject)o);
		case "height":
			return ParkingAccess.staticSearchHeight(siteRequest_, (BigDecimal)o);
		case "location":
			return ParkingAccess.staticSearchLocation(siteRequest_, (Path)o);
		case "name":
			return ParkingAccess.staticSearchName(siteRequest_, (String)o);
		case "owner":
			return ParkingAccess.staticSearchOwner(siteRequest_, (JsonObject)o);
		case "refOffStreetParking":
			return ParkingAccess.staticSearchRefOffStreetParking(siteRequest_, (JsonObject)o);
		case "seeAlso":
			return ParkingAccess.staticSearchSeeAlso(siteRequest_, (JsonObject)o);
		case "slope":
			return ParkingAccess.staticSearchSlope(siteRequest_, (BigDecimal)o);
		case "source":
			return ParkingAccess.staticSearchSource(siteRequest_, (String)o);
		case "width":
			return ParkingAccess.staticSearchWidth(siteRequest_, (BigDecimal)o);
			default:
				return BaseModel.staticSearchBaseModel(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrParkingAccess(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrParkingAccess(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "address":
			return ParkingAccess.staticSearchStrAddress(siteRequest_, (String)o);
		case "alternateName":
			return ParkingAccess.staticSearchStrAlternateName(siteRequest_, (String)o);
		case "areaServed":
			return ParkingAccess.staticSearchStrAreaServed(siteRequest_, (Polygon)o);
		case "category":
			return ParkingAccess.staticSearchStrCategory(siteRequest_, (String)o);
		case "dataProvider":
			return ParkingAccess.staticSearchStrDataProvider(siteRequest_, (String)o);
		case "dateCreated":
			return ParkingAccess.staticSearchStrDateCreated(siteRequest_, (String)o);
		case "dateModified":
			return ParkingAccess.staticSearchStrDateModified(siteRequest_, (String)o);
		case "description":
			return ParkingAccess.staticSearchStrDescription(siteRequest_, (String)o);
		case "features":
			return ParkingAccess.staticSearchStrFeatures(siteRequest_, (String)o);
		case "height":
			return ParkingAccess.staticSearchStrHeight(siteRequest_, (Double)o);
		case "location":
			return ParkingAccess.staticSearchStrLocation(siteRequest_, (Path)o);
		case "name":
			return ParkingAccess.staticSearchStrName(siteRequest_, (String)o);
		case "owner":
			return ParkingAccess.staticSearchStrOwner(siteRequest_, (String)o);
		case "refOffStreetParking":
			return ParkingAccess.staticSearchStrRefOffStreetParking(siteRequest_, (String)o);
		case "seeAlso":
			return ParkingAccess.staticSearchStrSeeAlso(siteRequest_, (String)o);
		case "slope":
			return ParkingAccess.staticSearchStrSlope(siteRequest_, (Double)o);
		case "source":
			return ParkingAccess.staticSearchStrSource(siteRequest_, (String)o);
		case "width":
			return ParkingAccess.staticSearchStrWidth(siteRequest_, (Double)o);
			default:
				return BaseModel.staticSearchStrBaseModel(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqParkingAccess(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqParkingAccess(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "address":
			return ParkingAccess.staticSearchFqAddress(siteRequest_, o);
		case "alternateName":
			return ParkingAccess.staticSearchFqAlternateName(siteRequest_, o);
		case "areaServed":
			return ParkingAccess.staticSearchFqAreaServed(siteRequest_, o);
		case "category":
			return ParkingAccess.staticSearchFqCategory(siteRequest_, o);
		case "dataProvider":
			return ParkingAccess.staticSearchFqDataProvider(siteRequest_, o);
		case "dateCreated":
			return ParkingAccess.staticSearchFqDateCreated(siteRequest_, o);
		case "dateModified":
			return ParkingAccess.staticSearchFqDateModified(siteRequest_, o);
		case "description":
			return ParkingAccess.staticSearchFqDescription(siteRequest_, o);
		case "features":
			return ParkingAccess.staticSearchFqFeatures(siteRequest_, o);
		case "height":
			return ParkingAccess.staticSearchFqHeight(siteRequest_, o);
		case "location":
			return ParkingAccess.staticSearchFqLocation(siteRequest_, o);
		case "name":
			return ParkingAccess.staticSearchFqName(siteRequest_, o);
		case "owner":
			return ParkingAccess.staticSearchFqOwner(siteRequest_, o);
		case "refOffStreetParking":
			return ParkingAccess.staticSearchFqRefOffStreetParking(siteRequest_, o);
		case "seeAlso":
			return ParkingAccess.staticSearchFqSeeAlso(siteRequest_, o);
		case "slope":
			return ParkingAccess.staticSearchFqSlope(siteRequest_, o);
		case "source":
			return ParkingAccess.staticSearchFqSource(siteRequest_, o);
		case "width":
			return ParkingAccess.staticSearchFqWidth(siteRequest_, o);
			default:
				return BaseModel.staticSearchFqBaseModel(entityVar,  siteRequest_, o);
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
					o = persistParkingAccess(v, val);
				else if(o instanceof BaseModel) {
					BaseModel oBaseModel = (BaseModel)o;
					o = oBaseModel.persistForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object persistParkingAccess(String var, Object val) {
		String varLower = var.toLowerCase();
			if("address".equals(varLower)) {
				if(val instanceof String) {
					setAddress((String)val);
				} else if(val instanceof JsonObject) {
					setAddress((JsonObject)val);
				}
				saves.add("address");
				return val;
			} else if("alternatename".equals(varLower)) {
				if(val instanceof String) {
					setAlternateName((String)val);
				}
				saves.add("alternateName");
				return val;
			} else if("areaserved".equals(varLower)) {
				if(val instanceof Polygon) {
					setAreaServed((Polygon)val);
				} else {
					setAreaServed(val == null ? null : val.toString());
				}
				saves.add("areaServed");
				return val;
			} else if("category".equals(varLower)) {
				if(val instanceof String) {
					setCategory((String)val);
				} else if(val instanceof JsonObject) {
					setCategory((JsonObject)val);
				}
				saves.add("category");
				return val;
			} else if("dataprovider".equals(varLower)) {
				if(val instanceof String) {
					setDataProvider((String)val);
				}
				saves.add("dataProvider");
				return val;
			} else if("datecreated".equals(varLower)) {
				if(val instanceof String) {
					setDateCreated((String)val);
				}
				saves.add("dateCreated");
				return val;
			} else if("datemodified".equals(varLower)) {
				if(val instanceof String) {
					setDateModified((String)val);
				}
				saves.add("dateModified");
				return val;
			} else if("description".equals(varLower)) {
				if(val instanceof String) {
					setDescription((String)val);
				}
				saves.add("description");
				return val;
			} else if("features".equals(varLower)) {
				if(val instanceof String) {
					setFeatures((String)val);
				} else if(val instanceof JsonObject) {
					setFeatures((JsonObject)val);
				}
				saves.add("features");
				return val;
			} else if("height".equals(varLower)) {
				if(val instanceof String) {
					setHeight((String)val);
				} else if(val instanceof Number) {
					setHeight(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("height");
				return val;
			} else if("location".equals(varLower)) {
				if(val instanceof Path) {
					setLocation((Path)val);
				} else {
					setLocation(val == null ? null : val.toString());
				}
				saves.add("location");
				return val;
			} else if("name".equals(varLower)) {
				if(val instanceof String) {
					setName((String)val);
				}
				saves.add("name");
				return val;
			} else if("owner".equals(varLower)) {
				if(val instanceof String) {
					setOwner((String)val);
				} else if(val instanceof JsonObject) {
					setOwner((JsonObject)val);
				}
				saves.add("owner");
				return val;
			} else if("refoffstreetparking".equals(varLower)) {
				if(val instanceof String) {
					setRefOffStreetParking((String)val);
				} else if(val instanceof JsonObject) {
					setRefOffStreetParking((JsonObject)val);
				}
				saves.add("refOffStreetParking");
				return val;
			} else if("seealso".equals(varLower)) {
				if(val instanceof String) {
					setSeeAlso((String)val);
				} else if(val instanceof JsonObject) {
					setSeeAlso((JsonObject)val);
				}
				saves.add("seeAlso");
				return val;
			} else if("slope".equals(varLower)) {
				if(val instanceof String) {
					setSlope((String)val);
				} else if(val instanceof Number) {
					setSlope(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("slope");
				return val;
			} else if("source".equals(varLower)) {
				if(val instanceof String) {
					setSource((String)val);
				}
				saves.add("source");
				return val;
			} else if("width".equals(varLower)) {
				if(val instanceof String) {
					setWidth((String)val);
				} else if(val instanceof Number) {
					setWidth(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("width");
				return val;
		} else {
			return super.persistBaseModel(var, val);
		}
	}

	/////////////
	// populate //
	/////////////

	@Override public void populateForClass(SolrResponse.Doc doc) {
		populateParkingAccess(doc);
	}
	public void populateParkingAccess(SolrResponse.Doc doc) {
		ParkingAccess oParkingAccess = (ParkingAccess)this;
		saves = Optional.ofNullable((ArrayList<String>)doc.get("saves_docvalues_strings")).orElse(new ArrayList<String>());
		if(saves != null) {

			if(saves.contains("address")) {
				String address = (String)doc.get("address_docvalues_string");
				if(address != null)
					oParkingAccess.setAddress(address);
			}

			if(saves.contains("alternateName")) {
				String alternateName = (String)doc.get("alternateName_docvalues_string");
				if(alternateName != null)
					oParkingAccess.setAlternateName(alternateName);
			}

			if(saves.contains("areaServed")) {
				Polygon areaServed = (Polygon)doc.get("areaServed_docvalues_location");
				if(areaServed != null)
					oParkingAccess.setAreaServed(areaServed);
			}

			if(saves.contains("category")) {
				String category = (String)doc.get("category_docvalues_string");
				if(category != null)
					oParkingAccess.setCategory(category);
			}

			if(saves.contains("dataProvider")) {
				String dataProvider = (String)doc.get("dataProvider_docvalues_string");
				if(dataProvider != null)
					oParkingAccess.setDataProvider(dataProvider);
			}

			if(saves.contains("dateCreated")) {
				String dateCreated = (String)doc.get("dateCreated_docvalues_string");
				if(dateCreated != null)
					oParkingAccess.setDateCreated(dateCreated);
			}

			if(saves.contains("dateModified")) {
				String dateModified = (String)doc.get("dateModified_docvalues_string");
				if(dateModified != null)
					oParkingAccess.setDateModified(dateModified);
			}

			if(saves.contains("description")) {
				String description = (String)doc.get("description_docvalues_string");
				if(description != null)
					oParkingAccess.setDescription(description);
			}

			if(saves.contains("features")) {
				String features = (String)doc.get("features_docvalues_string");
				if(features != null)
					oParkingAccess.setFeatures(features);
			}

			if(saves.contains("height")) {
				Double height = (Double)doc.get("height_docvalues_double");
				if(height != null)
					oParkingAccess.setHeight(height);
			}

			if(saves.contains("location")) {
				Path location = (Path)doc.get("location_docvalues_location");
				if(location != null)
					oParkingAccess.setLocation(location);
			}

			if(saves.contains("name")) {
				String name = (String)doc.get("name_docvalues_string");
				if(name != null)
					oParkingAccess.setName(name);
			}

			if(saves.contains("owner")) {
				String owner = (String)doc.get("owner_docvalues_string");
				if(owner != null)
					oParkingAccess.setOwner(owner);
			}

			if(saves.contains("refOffStreetParking")) {
				String refOffStreetParking = (String)doc.get("refOffStreetParking_docvalues_string");
				if(refOffStreetParking != null)
					oParkingAccess.setRefOffStreetParking(refOffStreetParking);
			}

			if(saves.contains("seeAlso")) {
				String seeAlso = (String)doc.get("seeAlso_docvalues_string");
				if(seeAlso != null)
					oParkingAccess.setSeeAlso(seeAlso);
			}

			if(saves.contains("slope")) {
				Double slope = (Double)doc.get("slope_docvalues_double");
				if(slope != null)
					oParkingAccess.setSlope(slope);
			}

			if(saves.contains("source")) {
				String source = (String)doc.get("source_docvalues_string");
				if(source != null)
					oParkingAccess.setSource(source);
			}

			if(saves.contains("width")) {
				Double width = (Double)doc.get("width_docvalues_double");
				if(width != null)
					oParkingAccess.setWidth(width);
			}
		}

		super.populateBaseModel(doc);
	}

	public void indexParkingAccess(JsonObject doc) {
		if(address != null) {
			doc.put("address_docvalues_string", address.toString());
		}
		if(alternateName != null) {
			doc.put("alternateName_docvalues_string", alternateName);
		}
		if(areaServed != null) {
			JsonArray pointsArray = new JsonArray();
			areaServed.getPoints().stream().map(point -> new JsonArray().add(Double.valueOf(point.getX())).add(Double.valueOf(point.getY()))).collect(Collectors.toList()).forEach(pointArray -> pointsArray.add(pointArray));
			doc.put("areaServed_docvalues_location", new JsonObject().put("type", "LineString").put("coordinates", pointsArray).toString());
		}
		if(category != null) {
			doc.put("category_docvalues_string", category.toString());
		}
		if(dataProvider != null) {
			doc.put("dataProvider_docvalues_string", dataProvider);
		}
		if(dateCreated != null) {
			doc.put("dateCreated_docvalues_string", dateCreated);
		}
		if(dateModified != null) {
			doc.put("dateModified_docvalues_string", dateModified);
		}
		if(description != null) {
			doc.put("description_docvalues_string", description);
		}
		if(features != null) {
			doc.put("features_docvalues_string", features.toString());
		}
		if(height != null) {
			doc.put("height_docvalues_double", height.doubleValue());
		}
		if(location != null) {
			JsonArray pointsArray = new JsonArray();
			location.getPoints().stream().map(point -> new JsonArray().add(Double.valueOf(point.getX())).add(Double.valueOf(point.getY()))).collect(Collectors.toList()).forEach(pointArray -> pointsArray.add(pointArray));
			doc.put("location_docvalues_location", new JsonObject().put("type", "LineString").put("coordinates", pointsArray).toString());
		}
		if(name != null) {
			doc.put("name_docvalues_string", name);
		}
		if(owner != null) {
			doc.put("owner_docvalues_string", owner.toString());
		}
		if(refOffStreetParking != null) {
			doc.put("refOffStreetParking_docvalues_string", refOffStreetParking.toString());
		}
		if(seeAlso != null) {
			doc.put("seeAlso_docvalues_string", seeAlso.toString());
		}
		if(slope != null) {
			doc.put("slope_docvalues_double", slope.doubleValue());
		}
		if(source != null) {
			doc.put("source_docvalues_string", source);
		}
		if(width != null) {
			doc.put("width_docvalues_double", width.doubleValue());
		}
		super.indexBaseModel(doc);

	}

	public static String varStoredParkingAccess(String entityVar) {
		switch(entityVar) {
			case "address":
				return "address_docvalues_string";
			case "alternateName":
				return "alternateName_docvalues_string";
			case "areaServed":
				return "areaServed_docvalues_location";
			case "category":
				return "category_docvalues_string";
			case "dataProvider":
				return "dataProvider_docvalues_string";
			case "dateCreated":
				return "dateCreated_docvalues_string";
			case "dateModified":
				return "dateModified_docvalues_string";
			case "description":
				return "description_docvalues_string";
			case "features":
				return "features_docvalues_string";
			case "height":
				return "height_docvalues_double";
			case "location":
				return "location_docvalues_location";
			case "name":
				return "name_docvalues_string";
			case "owner":
				return "owner_docvalues_string";
			case "refOffStreetParking":
				return "refOffStreetParking_docvalues_string";
			case "seeAlso":
				return "seeAlso_docvalues_string";
			case "slope":
				return "slope_docvalues_double";
			case "source":
				return "source_docvalues_string";
			case "width":
				return "width_docvalues_double";
			default:
				return BaseModel.varStoredBaseModel(entityVar);
		}
	}

	public static String varIndexedParkingAccess(String entityVar) {
		switch(entityVar) {
			case "address":
				return "address_docvalues_string";
			case "alternateName":
				return "alternateName_docvalues_string";
			case "areaServed":
				return "areaServed_docvalues_location";
			case "category":
				return "category_docvalues_string";
			case "dataProvider":
				return "dataProvider_docvalues_string";
			case "dateCreated":
				return "dateCreated_docvalues_string";
			case "dateModified":
				return "dateModified_docvalues_string";
			case "description":
				return "description_docvalues_string";
			case "features":
				return "features_docvalues_string";
			case "height":
				return "height_docvalues_double";
			case "location":
				return "location_docvalues_location";
			case "name":
				return "name_docvalues_string";
			case "owner":
				return "owner_docvalues_string";
			case "refOffStreetParking":
				return "refOffStreetParking_docvalues_string";
			case "seeAlso":
				return "seeAlso_docvalues_string";
			case "slope":
				return "slope_docvalues_double";
			case "source":
				return "source_docvalues_string";
			case "width":
				return "width_docvalues_double";
			default:
				return BaseModel.varIndexedBaseModel(entityVar);
		}
	}

	public static String searchVarParkingAccess(String searchVar) {
		switch(searchVar) {
			case "address_docvalues_string":
				return "address";
			case "alternateName_docvalues_string":
				return "alternateName";
			case "areaServed_docvalues_location":
				return "areaServed";
			case "category_docvalues_string":
				return "category";
			case "dataProvider_docvalues_string":
				return "dataProvider";
			case "dateCreated_docvalues_string":
				return "dateCreated";
			case "dateModified_docvalues_string":
				return "dateModified";
			case "description_docvalues_string":
				return "description";
			case "features_docvalues_string":
				return "features";
			case "height_docvalues_double":
				return "height";
			case "location_docvalues_location":
				return "location";
			case "name_docvalues_string":
				return "name";
			case "owner_docvalues_string":
				return "owner";
			case "refOffStreetParking_docvalues_string":
				return "refOffStreetParking";
			case "seeAlso_docvalues_string":
				return "seeAlso";
			case "slope_docvalues_double":
				return "slope";
			case "source_docvalues_string":
				return "source";
			case "width_docvalues_double":
				return "width";
			default:
				return BaseModel.searchVarBaseModel(searchVar);
		}
	}

	public static String varSearchParkingAccess(String entityVar) {
		switch(entityVar) {
			default:
				return BaseModel.varSearchBaseModel(entityVar);
		}
	}

	public static String varSuggestedParkingAccess(String entityVar) {
		switch(entityVar) {
			default:
				return BaseModel.varSuggestedBaseModel(entityVar);
		}
	}

	/////////////
	// store //
	/////////////

	@Override public void storeForClass(SolrResponse.Doc doc) {
		storeParkingAccess(doc);
	}
	public void storeParkingAccess(SolrResponse.Doc doc) {
		ParkingAccess oParkingAccess = (ParkingAccess)this;
		SiteRequestEnUS siteRequest = oParkingAccess.getSiteRequest_();

		oParkingAccess.setAddress(Optional.ofNullable(doc.get("address_docvalues_string")).map(v -> v.toString()).orElse(null));
		oParkingAccess.setAlternateName(Optional.ofNullable(doc.get("alternateName_docvalues_string")).map(v -> v.toString()).orElse(null));
		oParkingAccess.setAreaServed(Optional.ofNullable(doc.get("areaServed_docvalues_location")).map(v -> v.toString()).orElse(null));
		oParkingAccess.setCategory(Optional.ofNullable(doc.get("category_docvalues_string")).map(v -> v.toString()).orElse(null));
		oParkingAccess.setDataProvider(Optional.ofNullable(doc.get("dataProvider_docvalues_string")).map(v -> v.toString()).orElse(null));
		oParkingAccess.setDateCreated(Optional.ofNullable(doc.get("dateCreated_docvalues_string")).map(v -> v.toString()).orElse(null));
		oParkingAccess.setDateModified(Optional.ofNullable(doc.get("dateModified_docvalues_string")).map(v -> v.toString()).orElse(null));
		oParkingAccess.setDescription(Optional.ofNullable(doc.get("description_docvalues_string")).map(v -> v.toString()).orElse(null));
		oParkingAccess.setFeatures(Optional.ofNullable(doc.get("features_docvalues_string")).map(v -> v.toString()).orElse(null));
		oParkingAccess.setHeight(Optional.ofNullable(doc.get("height_docvalues_double")).map(v -> v.toString()).orElse(null));
		oParkingAccess.setLocation(Optional.ofNullable(doc.get("location_docvalues_location")).map(v -> v.toString()).orElse(null));
		oParkingAccess.setName(Optional.ofNullable(doc.get("name_docvalues_string")).map(v -> v.toString()).orElse(null));
		oParkingAccess.setOwner(Optional.ofNullable(doc.get("owner_docvalues_string")).map(v -> v.toString()).orElse(null));
		oParkingAccess.setRefOffStreetParking(Optional.ofNullable(doc.get("refOffStreetParking_docvalues_string")).map(v -> v.toString()).orElse(null));
		oParkingAccess.setSeeAlso(Optional.ofNullable(doc.get("seeAlso_docvalues_string")).map(v -> v.toString()).orElse(null));
		oParkingAccess.setSlope(Optional.ofNullable(doc.get("slope_docvalues_double")).map(v -> v.toString()).orElse(null));
		oParkingAccess.setSource(Optional.ofNullable(doc.get("source_docvalues_string")).map(v -> v.toString()).orElse(null));
		oParkingAccess.setWidth(Optional.ofNullable(doc.get("width_docvalues_double")).map(v -> v.toString()).orElse(null));

		super.storeBaseModel(doc);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestParkingAccess() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof ParkingAccess) {
			ParkingAccess original = (ParkingAccess)o;
			if(!Objects.equals(address, original.getAddress()))
				apiRequest.addVars("address");
			if(!Objects.equals(alternateName, original.getAlternateName()))
				apiRequest.addVars("alternateName");
			if(!Objects.equals(areaServed, original.getAreaServed()))
				apiRequest.addVars("areaServed");
			if(!Objects.equals(category, original.getCategory()))
				apiRequest.addVars("category");
			if(!Objects.equals(dataProvider, original.getDataProvider()))
				apiRequest.addVars("dataProvider");
			if(!Objects.equals(dateCreated, original.getDateCreated()))
				apiRequest.addVars("dateCreated");
			if(!Objects.equals(dateModified, original.getDateModified()))
				apiRequest.addVars("dateModified");
			if(!Objects.equals(description, original.getDescription()))
				apiRequest.addVars("description");
			if(!Objects.equals(features, original.getFeatures()))
				apiRequest.addVars("features");
			if(!Objects.equals(height, original.getHeight()) && height != null && original.getHeight() != null && height.compareTo(original.getHeight()) != 0)
				apiRequest.addVars("height");
			if(!Objects.equals(location, original.getLocation()))
				apiRequest.addVars("location");
			if(!Objects.equals(name, original.getName()))
				apiRequest.addVars("name");
			if(!Objects.equals(owner, original.getOwner()))
				apiRequest.addVars("owner");
			if(!Objects.equals(refOffStreetParking, original.getRefOffStreetParking()))
				apiRequest.addVars("refOffStreetParking");
			if(!Objects.equals(seeAlso, original.getSeeAlso()))
				apiRequest.addVars("seeAlso");
			if(!Objects.equals(slope, original.getSlope()) && slope != null && original.getSlope() != null && slope.compareTo(original.getSlope()) != 0)
				apiRequest.addVars("slope");
			if(!Objects.equals(source, original.getSource()))
				apiRequest.addVars("source");
			if(!Objects.equals(width, original.getWidth()) && width != null && original.getWidth() != null && width.compareTo(original.getWidth()) != 0)
				apiRequest.addVars("width");
			super.apiRequestBaseModel();
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(Optional.ofNullable(address).map(v -> "address: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(alternateName).map(v -> "alternateName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(areaServed).map(v -> "areaServed: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(category).map(v -> "category: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(dataProvider).map(v -> "dataProvider: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(dateCreated).map(v -> "dateCreated: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(dateModified).map(v -> "dateModified: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(description).map(v -> "description: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(features).map(v -> "features: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(height).map(v -> "height: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(location).map(v -> "location: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(name).map(v -> "name: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(owner).map(v -> "owner: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(refOffStreetParking).map(v -> "refOffStreetParking: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(seeAlso).map(v -> "seeAlso: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(slope).map(v -> "slope: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(source).map(v -> "source: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(width).map(v -> "width: " + v + "\n").orElse(""));
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "ParkingAccess";
	public static final String VAR_address = "address";
	public static final String VAR_alternateName = "alternateName";
	public static final String VAR_areaServed = "areaServed";
	public static final String VAR_category = "category";
	public static final String VAR_dataProvider = "dataProvider";
	public static final String VAR_dateCreated = "dateCreated";
	public static final String VAR_dateModified = "dateModified";
	public static final String VAR_description = "description";
	public static final String VAR_features = "features";
	public static final String VAR_height = "height";
	public static final String VAR_location = "location";
	public static final String VAR_name = "name";
	public static final String VAR_owner = "owner";
	public static final String VAR_refOffStreetParking = "refOffStreetParking";
	public static final String VAR_seeAlso = "seeAlso";
	public static final String VAR_slope = "slope";
	public static final String VAR_source = "source";
	public static final String VAR_width = "width";

	public static List<String> varsQForClass() {
		return ParkingAccess.varsQParkingAccess(new ArrayList<String>());
	}
	public static List<String> varsQParkingAccess(List<String> vars) {
		BaseModel.varsQBaseModel(vars);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return ParkingAccess.varsFqParkingAccess(new ArrayList<String>());
	}
	public static List<String> varsFqParkingAccess(List<String> vars) {
		vars.add(VAR_address);
		vars.add(VAR_alternateName);
		vars.add(VAR_areaServed);
		vars.add(VAR_category);
		vars.add(VAR_dataProvider);
		vars.add(VAR_dateCreated);
		vars.add(VAR_dateModified);
		vars.add(VAR_description);
		vars.add(VAR_features);
		vars.add(VAR_height);
		vars.add(VAR_location);
		vars.add(VAR_name);
		vars.add(VAR_owner);
		vars.add(VAR_refOffStreetParking);
		vars.add(VAR_seeAlso);
		vars.add(VAR_slope);
		vars.add(VAR_source);
		vars.add(VAR_width);
		BaseModel.varsFqBaseModel(vars);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return ParkingAccess.varsRangeParkingAccess(new ArrayList<String>());
	}
	public static List<String> varsRangeParkingAccess(List<String> vars) {
		vars.add(VAR_address);
		vars.add(VAR_category);
		vars.add(VAR_features);
		vars.add(VAR_height);
		vars.add(VAR_owner);
		vars.add(VAR_refOffStreetParking);
		vars.add(VAR_seeAlso);
		vars.add(VAR_slope);
		vars.add(VAR_width);
		BaseModel.varsRangeBaseModel(vars);
		return vars;
	}

	public static final String DISPLAY_NAME_address = "address";
	public static final String DISPLAY_NAME_alternateName = "alternate name";
	public static final String DISPLAY_NAME_areaServed = "area served";
	public static final String DISPLAY_NAME_category = "category";
	public static final String DISPLAY_NAME_dataProvider = "data provider";
	public static final String DISPLAY_NAME_dateCreated = "date created";
	public static final String DISPLAY_NAME_dateModified = "date modified";
	public static final String DISPLAY_NAME_description = "description";
	public static final String DISPLAY_NAME_features = "features";
	public static final String DISPLAY_NAME_height = "height";
	public static final String DISPLAY_NAME_location = "location";
	public static final String DISPLAY_NAME_name = "name";
	public static final String DISPLAY_NAME_owner = "owner";
	public static final String DISPLAY_NAME_refOffStreetParking = "ref off street parking";
	public static final String DISPLAY_NAME_seeAlso = "see also";
	public static final String DISPLAY_NAME_slope = "slope";
	public static final String DISPLAY_NAME_source = "source";
	public static final String DISPLAY_NAME_width = "width";

	public static String displayNameForClass(String var) {
		return ParkingAccess.displayNameParkingAccess(var);
	}
	public static String displayNameParkingAccess(String var) {
		switch(var) {
		case VAR_address:
			return DISPLAY_NAME_address;
		case VAR_alternateName:
			return DISPLAY_NAME_alternateName;
		case VAR_areaServed:
			return DISPLAY_NAME_areaServed;
		case VAR_category:
			return DISPLAY_NAME_category;
		case VAR_dataProvider:
			return DISPLAY_NAME_dataProvider;
		case VAR_dateCreated:
			return DISPLAY_NAME_dateCreated;
		case VAR_dateModified:
			return DISPLAY_NAME_dateModified;
		case VAR_description:
			return DISPLAY_NAME_description;
		case VAR_features:
			return DISPLAY_NAME_features;
		case VAR_height:
			return DISPLAY_NAME_height;
		case VAR_location:
			return DISPLAY_NAME_location;
		case VAR_name:
			return DISPLAY_NAME_name;
		case VAR_owner:
			return DISPLAY_NAME_owner;
		case VAR_refOffStreetParking:
			return DISPLAY_NAME_refOffStreetParking;
		case VAR_seeAlso:
			return DISPLAY_NAME_seeAlso;
		case VAR_slope:
			return DISPLAY_NAME_slope;
		case VAR_source:
			return DISPLAY_NAME_source;
		case VAR_width:
			return DISPLAY_NAME_width;
		default:
			return BaseModel.displayNameBaseModel(var);
		}
	}

	public static String descriptionParkingAccess(String var) {
		switch(var) {
		case VAR_address:
			return "The mailing address";
		case VAR_alternateName:
			return "An alternative name for this item";
		case VAR_areaServed:
			return "The geographic area where a service or offered item is provided";
		case VAR_category:
			return "Category of the access point (entrance, exit, etc.). Allowed values: Those specified by the DATEX II _AccessCategoryEnum_ or other values meaningful to the application.";
		case VAR_dataProvider:
			return "A sequence of characters identifying the provider of the harmonised data entity.";
		case VAR_dateCreated:
			return "Entity creation timestamp. This will usually be allocated by the storage platform.";
		case VAR_dateModified:
			return "Timestamp of the last modification of the entity. This will usually be allocated by the storage platform.";
		case VAR_description:
			return "A description of this item";
		case VAR_features:
			return "Those specified by the DATEX II _essEquipmentEnum_ and by _AccessibilityEnum_ or other values meaningful to the application.";
		case VAR_height:
			return "Height of the access point";
		case VAR_location:
			return "Geojson reference to the item. It can be Point, LineString, Polygon, MultiPoint, MultiLineString or MultiPolygon";
		case VAR_name:
			return "The name of this item.";
		case VAR_owner:
			return "A List containing a JSON encoded sequence of characters referencing the unique Ids of the owner(s)";
		case VAR_refOffStreetParking:
			return "The offstreet parking site this access point gives access to.";
		case VAR_seeAlso:
			return "list of uri pointing to additional resources about the item";
		case VAR_slope:
			return "Slope of the access point (in relative terms)";
		case VAR_source:
			return "A sequence of characters giving the original source of the entity data as a URL. Recommended to be the fully qualified domain name of the source provider, or the URL to the source object.";
		case VAR_width:
			return "Width of the access point";
			default:
				return BaseModel.descriptionBaseModel(var);
		}
	}

	public static String classSimpleNameParkingAccess(String var) {
		switch(var) {
		case VAR_address:
			return "JsonObject";
		case VAR_alternateName:
			return "String";
		case VAR_areaServed:
			return "Polygon";
		case VAR_category:
			return "JsonObject";
		case VAR_dataProvider:
			return "String";
		case VAR_dateCreated:
			return "String";
		case VAR_dateModified:
			return "String";
		case VAR_description:
			return "String";
		case VAR_features:
			return "JsonObject";
		case VAR_height:
			return "BigDecimal";
		case VAR_location:
			return "Path";
		case VAR_name:
			return "String";
		case VAR_owner:
			return "JsonObject";
		case VAR_refOffStreetParking:
			return "JsonObject";
		case VAR_seeAlso:
			return "JsonObject";
		case VAR_slope:
			return "BigDecimal";
		case VAR_source:
			return "String";
		case VAR_width:
			return "BigDecimal";
			default:
				return BaseModel.classSimpleNameBaseModel(var);
		}
	}

	public static Integer htmColumnParkingAccess(String var) {
		switch(var) {
			default:
				return BaseModel.htmColumnBaseModel(var);
		}
	}

	public static Integer htmRowParkingAccess(String var) {
		switch(var) {
		case VAR_address:
			return 3;
		case VAR_alternateName:
			return 3;
		case VAR_areaServed:
			return 3;
		case VAR_category:
			return 4;
		case VAR_dataProvider:
			return 4;
		case VAR_dateCreated:
			return 4;
		case VAR_dateModified:
			return 5;
		case VAR_description:
			return 5;
		case VAR_features:
			return 5;
		case VAR_height:
			return 6;
		case VAR_location:
			return 6;
		case VAR_name:
			return 6;
		case VAR_owner:
			return 7;
		case VAR_refOffStreetParking:
			return 7;
		case VAR_seeAlso:
			return 7;
		case VAR_slope:
			return 8;
		case VAR_source:
			return 8;
		case VAR_width:
			return 8;
			default:
				return BaseModel.htmRowBaseModel(var);
		}
	}

	public static Integer htmCellParkingAccess(String var) {
		switch(var) {
		case VAR_address:
			return 1;
		case VAR_alternateName:
			return 2;
		case VAR_areaServed:
			return 3;
		case VAR_category:
			return 1;
		case VAR_dataProvider:
			return 2;
		case VAR_dateCreated:
			return 3;
		case VAR_dateModified:
			return 1;
		case VAR_description:
			return 2;
		case VAR_features:
			return 3;
		case VAR_height:
			return 1;
		case VAR_location:
			return 2;
		case VAR_name:
			return 3;
		case VAR_owner:
			return 1;
		case VAR_refOffStreetParking:
			return 2;
		case VAR_seeAlso:
			return 3;
		case VAR_slope:
			return 1;
		case VAR_source:
			return 2;
		case VAR_width:
			return 3;
			default:
				return BaseModel.htmCellBaseModel(var);
		}
	}

	public static Integer lengthMinParkingAccess(String var) {
		switch(var) {
			default:
				return BaseModel.lengthMinBaseModel(var);
		}
	}

	public static Integer lengthMaxParkingAccess(String var) {
		switch(var) {
			default:
				return BaseModel.lengthMaxBaseModel(var);
		}
	}

	public static Integer maxParkingAccess(String var) {
		switch(var) {
			default:
				return BaseModel.maxBaseModel(var);
		}
	}

	public static Integer minParkingAccess(String var) {
		switch(var) {
			default:
				return BaseModel.minBaseModel(var);
		}
	}
}
