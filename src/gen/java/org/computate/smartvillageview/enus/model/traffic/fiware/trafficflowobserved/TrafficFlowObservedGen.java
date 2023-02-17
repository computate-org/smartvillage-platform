package org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved;

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
import io.vertx.core.json.JsonObject;
import java.lang.String;
import java.math.BigDecimal;
import java.lang.Boolean;
import java.lang.Integer;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;

/**	
<ol>
0<h3>Suggestions that can generate more code for you: </h3></ol>
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class TrafficFlowObservedGen into the class TrafficFlowObserved. 
 * </li><li>You can add a class comment "Model: true" if you wish to persist these TrafficFlowObserved objects in a relational PostgreSQL database transactionally in the RESTful API. 
 * The code to persist and query the TrafficFlowObservedGen data in the database will then be automatically generated. 
 * </li>
 * <h3>About the TrafficFlowObserved class and it's generated class TrafficFlowObservedGen&lt;MapResult&gt;: </h3>extends TrafficFlowObservedGen
 * <p>
 * This Java class extends a generated Java class TrafficFlowObservedGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved">Find the class TrafficFlowObserved in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends TrafficFlowObservedGen<MapResult>
 * <p>This <code>class TrafficFlowObserved extends TrafficFlowObservedGen&lt;MapResult&gt;</code>, which means it extends a newly generated TrafficFlowObservedGen. 
 * The generated <code>class TrafficFlowObservedGen extends MapResult</code> which means that TrafficFlowObserved extends TrafficFlowObservedGen which extends MapResult. 
 * This generated inheritance is a powerful feature that allows a lot of boiler plate code to be created for you automatically while still preserving inheritance through the power of Java Generic classes. 
 * </p>
 * Api: true
 * <p>This class contains a comment <b>"Api: true"</b>, which means this class will have Java Vert.x API backend code generated for these objects. 
 * </p>
 * ApiTag.enUS: Traffic Flow Observed
 * <p>This class contains a comment <b>"ApiTag: Traffic Flow Observed"</b>, which groups all of the OpenAPIs for TrafficFlowObserved objects under the tag "Traffic Flow Observed". 
 * </p>
 * ApiUri.enUS: /api/traffic-flow-observed
 * <p>This class contains a comment <b>"ApiUri: /api/traffic-flow-observed"</b>, which defines the base API URI for TrafficFlowObserved objects as "/api/traffic-flow-observed" in the OpenAPI spec. 
 * </p>
 * Color: 2017-shaded-spruce
 * <p>This class contains a comment <b>"Color: 2017-shaded-spruce"</b>, which styles the TrafficFlowObserved page "2017-shaded-spruce". 
 * This will reference a CSS class defined by the stylesheets in the project that starts with "w3-". 
 * A css class of "w3-2017-shaded-spruce" is expected to exist in the project stylesheets, and is inspired by W3 CSS colors. 
 * See: <a href="https://www.w3schools.com/w3css/w3css_colors.asp">https://www.w3schools.com/w3css/w3css_colors.asp</a>. 
 * </p>
 * IconGroup: duotone
 * <p>This class contains a comment <b>"IconGroup: duotone"</b>, which adds icons on the TrafficFlowObserved page with a group of "duotone". 
 * This will reference a Font Awesome icon group that starts with "fa-" followed by the icon group "duotone", together is "fa-duotone". 
 * A Font Awesome icon group of "duotone" is expected to exist. 
 * The Font Awesome groups currently supported include: solid, regular, light, thin, duotone, sharp, and kit. 
 * See: <a href="https://fontawesome.com/docs/web/dig-deeper/styles">https://fontawesome.com/docs/web/dig-deeper/styles</a>. 
 * </p>
 * IconName: map-location-dot
 * <p>This class contains a comment <b>"IconName: map-location-dot"</b>, which adds icons on the TrafficFlowObserved page with a name of "map-location-dot". 
 * This will reference a Font Awesome icon that starts with the icon group "fa-duotone fa-" followed by the icon name, which is "fa-duotone fa-map-location-dot". 
 * A Font Awesome icon of "fa-duotone fa-map-location-dot" is expected to exist. 
 * See: <a href="https://fontawesome.com/icons">https://fontawesome.com/icons</a>. 
 * </p>
 * Indexed: true
 * <p>This class contains a comment <b>"Indexed: true"</b>, which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * {@inheritDoc}
 * <p>By adding a class comment "{@inheritDoc}", the TrafficFlowObserved class will inherit the helpful inherited class comments from the super class TrafficFlowObservedGen. 
 * </p>
 * Rows: 100
 * <p>This class contains a comment <b>"Rows: 100"</b>, which means the TrafficFlowObserved API will return a default of 100 records instead of 10 by default. 
 * Each API has built in pagination of the search records to ensure a user can query all the data a page at a time without running the application out of memory. 
 * </p>
 * Order: 18
 * <p>This class contains a comment <b>"Order: 18"</b>, which means this class will be sorted by the given number 18 ascending when code that relates to multiple classes at the same time is generated. 
 * </p>
 * Model: true
 * Page: true
 * <p>This class contains a comment <b>"Page: true"</b>, which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObservedPage. 
 * </p>
 * SuperPage.enUS: MapResultPage
 * <p>This class contains a comment <b>"SuperPage.enUS: MapResultPage"</b>, which identifies the Java super class of the page code by it's class simple name "MapResultPage". 
 * This means that the newly created class org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObservedPage extends org.computate.smartvillageview.enus.result.map.MapResultPage. 
 * </p>
 * Promise: true
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the TrafficFlowObserved Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * This class contains a comment <b>"Role.enUS: SiteAdmin"</b>, which identifies the default role name "SiteAdmin" of the OAuth2/OpenID Connect user role required to access this TrafficFlowObserved API. 
 * It's possible to reconfigure the roles required to access the TrafficFlowObserved API by configuring an environment variable like this: 
 * </p>
 * <pre>AUTH_ROLE_REQUIRED_TrafficFlowObserved: ["SiteAdmin"]</pre>
 * AName.enUS: a traffic flow observed
 * <p>This class contains a comment <b>"AName.enUS: a traffic flow observed"</b>, which identifies the language context to describe a TrafficFlowObserved as "a traffic flow observed". 
 * </p>
 * <p>
 * Delete the class TrafficFlowObserved in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class TrafficFlowObservedGen<DEV> extends MapResult {

	/* FIWARE SmartDataModel fields: */
//
//	/**
//	 * {@inheritDoc}
//	 * DocValues: true
//	 * Persist: true
//	 * DisplayName: address
//	 * Description: The mailing address
//	 * HtmlRow: 3
//	 * HtmlCell: 1
//	 * Facet: true
//	 */
//	protected void _address(Wrap<JsonObject> w) {
//	}
//
//	/**
//	 * {@inheritDoc}
//	 * DocValues: true
//	 * Persist: true
//	 * DisplayName: alternate name
//	 * Description: An alternative name for this item
//	 * HtmlRow: 3
//	 * HtmlCell: 2
//	 * Facet: true
//	 */
//	protected void _alternateName(Wrap<String> w) {
//	}
//
//	/**
//	 * {@inheritDoc}
//	 * DocValues: true
//	 * Persist: true
//	 * DisplayName: area served
//	 * Description: The geographic area where a service or offered item is provided
//	 * HtmlRow: 3
//	 * HtmlCell: 3
//	 * Facet: true
//	 */
//	protected void _areaServed(Wrap<String> w) {
//	}
//
//	/**
//	 * {@inheritDoc}
//	 * DocValues: true
//	 * Persist: true
//	 * DisplayName: average gap distance
//	 * Description: Average gap distance between consecutive vehicles
//	 * HtmlRow: 4
//	 * HtmlCell: 1
//	 * Facet: true
//	 */
//	protected void _averageGapDistance(Wrap<BigDecimal> w) {
//	}
//
//	/**
//	 * {@inheritDoc}
//	 * DocValues: true
//	 * Persist: true
//	 * DisplayName: average headway time
//	 * Description: Average headway time. Headway time is the time ellapsed between two consecutive vehicles
//	 * HtmlRow: 4
//	 * HtmlCell: 2
//	 * Facet: true
//	 */
//	protected void _averageHeadwayTime(Wrap<BigDecimal> w) {
//	}
//
//	/**
//	 * {@inheritDoc}
//	 * DocValues: true
//	 * Persist: true
//	 * DisplayName: average vehicle length
//	 * Description: Average length of the vehicles transiting during     the observation period
//	 * HtmlRow: 4
//	 * HtmlCell: 3
//	 * Facet: true
//	 */
//	protected void _averageVehicleLength(Wrap<BigDecimal> w) {
//	}
//
//	/**
//	 * {@inheritDoc}
//	 * DocValues: true
//	 * Persist: true
//	 * DisplayName: average vehicle speed
//	 * Description: Average speed of the vehicles transiting during the observation period
//	 * HtmlRow: 5
//	 * HtmlCell: 1
//	 * Facet: true
//	 */
//	protected void _averageVehicleSpeed(Wrap<BigDecimal> w) {
//	}
//
//	/**
//	 * {@inheritDoc}
//	 * DocValues: true
//	 * Persist: true
//	 * DisplayName: congested
//	 * Description:  Flags whether there was a traffic congestion during the observation period in the referred lane. The absence of this attribute means no traffic congestion
//	 * HtmlRow: 5
//	 * HtmlCell: 2
//	 * Facet: true
//	 */
//	protected void _congested(Wrap<Boolean> w) {
//	}
//
//	/**
//	 * {@inheritDoc}
//	 * DocValues: true
//	 * Persist: true
//	 * DisplayName: data provider
//	 * Description: A sequence of characters identifying the provider of the harmonised data entity.
//	 * HtmlRow: 5
//	 * HtmlCell: 3
//	 * Facet: true
//	 */
//	protected void _dataProvider(Wrap<String> w) {
//	}
//
//	/**
//	 * {@inheritDoc}
//	 * DocValues: true
//	 * Persist: true
//	 * DisplayName: date created
//	 * Description: Entity creation timestamp. This will usually be allocated by the storage platform.
//	 * HtmlRow: 6
//	 * HtmlCell: 1
//	 * Facet: true
//	 */
//	protected void _dateCreated(Wrap<String> w) {
//	}
//
//	/**
//	 * {@inheritDoc}
//	 * DocValues: true
//	 * Persist: true
//	 * DisplayName: date modified
//	 * Description: Timestamp of the last modification of the entity. This will usually be allocated by the storage platform.
//	 * HtmlRow: 6
//	 * HtmlCell: 2
//	 * Facet: true
//	 */
//	protected void _dateModified(Wrap<String> w) {
//	}
//
//	/**
//	 * {@inheritDoc}
//	 * DocValues: true
//	 * Persist: true
//	 * DisplayName: date observed
//	 * Description: The date and time of this observation in ISO8601 UTC format. It can be represented by an specific time instant or by an ISO8601 interval. As a workaround for the lack of support of Orion Context Broker for datetime intervals, it can be used two separate attributes: `dateObservedFrom`, `dateObservedTo`. [DateTime](https://schema.org/DateTime) or an ISO8601 interval represented as [Text](https://schema.org/Text)
//	 * HtmlRow: 6
//	 * HtmlCell: 3
//	 * Facet: true
//	 */
//	protected void _dateObserved(Wrap<String> w) {
//	}
//
//	/**
//	 * {@inheritDoc}
//	 * DocValues: true
//	 * Persist: true
//	 * DisplayName: date observed from
//	 * Description: Observation period start date and time. See `dateObserved`
//	 * HtmlRow: 7
//	 * HtmlCell: 1
//	 * Facet: true
//	 */
//	protected void _dateObservedFrom(Wrap<String> w) {
//	}
//
//	/**
//	 * {@inheritDoc}
//	 * DocValues: true
//	 * Persist: true
//	 * DisplayName: date observed to
//	 * Description: Observation period end date and time. See `dateObserved`
//	 * HtmlRow: 7
//	 * HtmlCell: 2
//	 * Facet: true
//	 */
//	protected void _dateObservedTo(Wrap<String> w) {
//	}
//
//	/**
//	 * {@inheritDoc}
//	 * DocValues: true
//	 * Persist: true
//	 * DisplayName: description
//	 * Description: A description of this item
//	 * HtmlRow: 7
//	 * HtmlCell: 3
//	 * Facet: true
//	 */
//	protected void _description(Wrap<String> w) {
//	}
//
//	/**
//	 * {@inheritDoc}
//	 * DocValues: true
//	 * Persist: true
//	 * DisplayName: id
//	 * Description: Unique identifier of the entity
//	 * HtmlRow: 8
//	 * HtmlCell: 1
//	 * Facet: true
//	 */
//	protected void _id(Wrap<JsonObject> w) {
//	}
//
//	/**
//	 * {@inheritDoc}
//	 * DocValues: true
//	 * Persist: true
//	 * DisplayName: intensity
//	 * Description: Total number of vehicles detected during this observation period
//	 * HtmlRow: 8
//	 * HtmlCell: 2
//	 * Facet: true
//	 */
//	protected void _intensity(Wrap<BigDecimal> w) {
//	}
//
//	/**
//	 * {@inheritDoc}
//	 * DocValues: true
//	 * Persist: true
//	 * DisplayName: lane direction
//	 * Description: Usual direction of travel in the lane referred by this observation. This attribute is useful when the observation is not referencing any road segment, allowing to know the direction of travel of the traffic flow observed. Enum:forward, backward'. See RoadSegment for a description of the semantics of these values.
//	 * HtmlRow: 8
//	 * HtmlCell: 3
//	 * Facet: true
//	 */
//	protected void _laneDirection(Wrap<String> w) {
//	}
//
//	/**
//	 * {@inheritDoc}
//	 * DocValues: true
//	 * Persist: true
//	 * DisplayName: lane id
//	 * Description: Lane identifier. Lane identification is done using the conventions defined by RoadSegment entity which are based on [OpenStreetMap](http://wiki.openstreetmap.org/wiki/Forward_%26_backward,_left_%26_right).
//	 * HtmlRow: 9
//	 * HtmlCell: 1
//	 * Facet: true
//	 */
//	protected void _laneId(Wrap<Integer> w) {
//	}
//
//	/**
//	 * {@inheritDoc}
//	 * DocValues: true
//	 * Persist: true
//	 * DisplayName: location
//	 * Description: Geojson reference to the item. It can be Point, LineString, Polygon, MultiPoint, MultiLineString or MultiPolygon
//	 * HtmlRow: 9
//	 * HtmlCell: 2
//	 * Facet: true
//	 */
//	protected void _location(Wrap<JsonObject> w) {
//	}
//
//	/**
//	 * {@inheritDoc}
//	 * DocValues: true
//	 * Persist: true
//	 * DisplayName: name
//	 * Description: The name of this item.
//	 * HtmlRow: 9
//	 * HtmlCell: 3
//	 * Facet: true
//	 */
//	protected void _name(Wrap<String> w) {
//	}
//
//	/**
//	 * {@inheritDoc}
//	 * DocValues: true
//	 * Persist: true
//	 * DisplayName: occupancy
//	 * Description: Fraction of the observation time where a vehicle has been occupying the observed lane
//	 * HtmlRow: 10
//	 * HtmlCell: 1
//	 * Facet: true
//	 */
//	protected void _occupancy(Wrap<BigDecimal> w) {
//	}
//
//	/**
//	 * {@inheritDoc}
//	 * DocValues: true
//	 * Persist: true
//	 * DisplayName: owner
//	 * Description: A List containing a JSON encoded sequence of characters referencing the unique Ids of the owner(s)
//	 * HtmlRow: 10
//	 * HtmlCell: 2
//	 * Facet: true
//	 */
//	protected void _owner(Wrap<JsonObject> w) {
//	}
//
//	/**
//	 * {@inheritDoc}
//	 * DocValues: true
//	 * Persist: true
//	 * DisplayName: ref road segment
//	 * Description: Concerned road segment on which the observation has been made. Reference to an entity of type RoadSegment
//	 * HtmlRow: 10
//	 * HtmlCell: 3
//	 * Facet: true
//	 */
//	protected void _refRoadSegment(Wrap<String> w) {
//	}
//
//	/**
//	 * {@inheritDoc}
//	 * DocValues: true
//	 * Persist: true
//	 * DisplayName: reversed lane
//	 * Description: Flags whether traffic in the lane was reversed during the observation period. The absence of this attribute means no lane reversion
//	 * HtmlRow: 11
//	 * HtmlCell: 1
//	 * Facet: true
//	 */
//	protected void _reversedLane(Wrap<Boolean> w) {
//	}
//
//	/**
//	 * {@inheritDoc}
//	 * DocValues: true
//	 * Persist: true
//	 * DisplayName: see also
//	 * Description: list of uri pointing to additional resources about the item
//	 * HtmlRow: 11
//	 * HtmlCell: 2
//	 * Facet: true
//	 */
//	protected void _seeAlso(Wrap<JsonObject> w) {
//	}
//
//	/**
//	 * {@inheritDoc}
//	 * DocValues: true
//	 * Persist: true
//	 * DisplayName: source
//	 * Description: A sequence of characters giving the original source of the entity data as a URL. Recommended to be the fully qualified domain name of the source provider, or the URL to the source object.
//	 * HtmlRow: 11
//	 * HtmlCell: 3
//	 * Facet: true
//	 */
//	protected void _source(Wrap<String> w) {
//	}
//
//	/**
//	 * {@inheritDoc}
//	 * DocValues: true
//	 * Persist: true
//	 * DisplayName: type
//	 * Description: NGSI Entity type. It has to be TrafficFlowObserved
//	 * HtmlRow: 12
//	 * HtmlCell: 1
//	 * Facet: true
//	 */
//	protected void _type(Wrap<String> w) {
//	}
//
//	/**
//	 * {@inheritDoc}
//	 * DocValues: true
//	 * Persist: true
//	 * DisplayName: vehicle sub type
//	 * Description: It allows to specify a sub type of `vehicleType`, eg if the `vehicleType` is set to `Lorry` the `vehicleSubType` may be `OGV1` or `OGV2` to convey more information about the exact type of vehicle.
//	 * HtmlRow: 12
//	 * HtmlCell: 2
//	 * Facet: true
//	 */
//	protected void _vehicleSubType(Wrap<String> w) {
//	}
//
//	/**
//	 * {@inheritDoc}
//	 * DocValues: true
//	 * Persist: true
//	 * DisplayName: vehicle type
//	 * Description: Type of vehicle from the point of view of its structural characteristics. Enum:'agriculturalVehicle, bicycle, bus, minibus, car, caravan, tram, tanker, carWithCaravan, carWithTrailer, lorry, moped, motorcycle, motorcycleWithSideCar, motorscooter, trailer, van, constructionOrMaintenanceVehicle, trolley, binTrolley, sweepingMachine, cleaningTrolley'
//	 * HtmlRow: 12
//	 * HtmlCell: 3
//	 * Facet: true
//	 */
//	protected void _vehicleType(Wrap<String> w) {
//	}

	protected static final Logger LOG = LoggerFactory.getLogger(TrafficFlowObserved.class);

	public static final String TrafficFlowObserved_AName_enUS = "a traffic flow observed";
	public static final String TrafficFlowObserved_This_enUS = "this ";
	public static final String TrafficFlowObserved_ThisName_enUS = "this traffic flow observed";
	public static final String TrafficFlowObserved_A_enUS = "a ";
	public static final String TrafficFlowObserved_TheName_enUS = "the traffic flow observed";
	public static final String TrafficFlowObserved_NameSingular_enUS = "traffic flow observed";
	public static final String TrafficFlowObserved_NamePlural_enUS = "traffic flow observeds";
	public static final String TrafficFlowObserved_NameActual_enUS = "current traffic flow observed";
	public static final String TrafficFlowObserved_AllName_enUS = "all the traffic flow observeds";
	public static final String TrafficFlowObserved_SearchAllNameBy_enUS = "search traffic flow observeds by ";
	public static final String TrafficFlowObserved_Title_enUS = "traffic flow observeds";
	public static final String TrafficFlowObserved_ThePluralName_enUS = "the traffic flow observeds";
	public static final String TrafficFlowObserved_NoNameFound_enUS = "no traffic flow observed found";
	public static final String TrafficFlowObserved_ApiUri_enUS = "/api/traffic-flow-observed";
	public static final String TrafficFlowObserved_ApiUriSearchPage_enUS = "/traffic-flow-observed";
	public static final String TrafficFlowObserved_OfName_enUS = "of traffic flow observed";
	public static final String TrafficFlowObserved_ANameAdjective_enUS = "a traffic flow observed";
	public static final String TrafficFlowObserved_NameAdjectiveSingular_enUS = "traffic flow observed";
	public static final String TrafficFlowObserved_NameAdjectivePlural_enUS = "traffic flow observeds";
	public static final String Search_enUS_Uri = "/api/traffic-flow-observed";
	public static final String Search_enUS_ImageUri = "/png/api/traffic-flow-observed-999.png";
	public static final String GET_enUS_Uri = "/api/traffic-flow-observed/{id}";
	public static final String GET_enUS_ImageUri = "/png/api/traffic-flow-observed/{id}-999.png";
	public static final String PATCH_enUS_Uri = "/api/traffic-flow-observed";
	public static final String PATCH_enUS_ImageUri = "/png/api/traffic-flow-observed-999.png";
	public static final String POST_enUS_Uri = "/api/traffic-flow-observed";
	public static final String POST_enUS_ImageUri = "/png/api/traffic-flow-observed-999.png";
	public static final String PUTImport_enUS_Uri = "/api/traffic-flow-observed-import";
	public static final String PUTImport_enUS_ImageUri = "/png/api/traffic-flow-observed-import-999.png";
	public static final String SearchPage_enUS_Uri = "/traffic-flow-observed";
	public static final String SearchPage_enUS_ImageUri = "/png/traffic-flow-observed-999.png";

	public static final String TrafficFlowObserved_Color = "2017-shaded-spruce";
	public static final String TrafficFlowObserved_IconGroup = "duotone";
	public static final String TrafficFlowObserved_IconName = "map-location-dot";
	public static final Integer TrafficFlowObserved_Rows = 100;

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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved&fq=entiteVar_enUS_indexed_string:address">Find the entity address in Solr</a>
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
		this.address = TrafficFlowObserved.staticSetAddress(siteRequest_, o);
	}
	public static JsonObject staticSetAddress(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected TrafficFlowObserved addressInit() {
		Wrap<JsonObject> addressWrap = new Wrap<JsonObject>().var("address");
		if(address == null) {
			_address(addressWrap);
			setAddress(addressWrap.o);
		}
		return (TrafficFlowObserved)this;
	}

	public static JsonObject staticSearchAddress(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrAddress(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAddress(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFlowObserved.staticSearchStrAddress(siteRequest_, TrafficFlowObserved.staticSearchAddress(siteRequest_, TrafficFlowObserved.staticSetAddress(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved&fq=entiteVar_enUS_indexed_string:alternateName">Find the entity alternateName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _alternateName(Wrap<String> w);

	public String getAlternateName() {
		return alternateName;
	}
	public void setAlternateName(String o) {
		this.alternateName = TrafficFlowObserved.staticSetAlternateName(siteRequest_, o);
	}
	public static String staticSetAlternateName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficFlowObserved alternateNameInit() {
		Wrap<String> alternateNameWrap = new Wrap<String>().var("alternateName");
		if(alternateName == null) {
			_alternateName(alternateNameWrap);
			setAlternateName(alternateNameWrap.o);
		}
		return (TrafficFlowObserved)this;
	}

	public static String staticSearchAlternateName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrAlternateName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAlternateName(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFlowObserved.staticSearchStrAlternateName(siteRequest_, TrafficFlowObserved.staticSearchAlternateName(siteRequest_, TrafficFlowObserved.staticSetAlternateName(siteRequest_, o)));
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
	@JsonInclude(Include.NON_NULL)
	protected String areaServed;

	/**	<br> The entity areaServed
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved&fq=entiteVar_enUS_indexed_string:areaServed">Find the entity areaServed in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _areaServed(Wrap<String> w);

	public String getAreaServed() {
		return areaServed;
	}
	public void setAreaServed(String o) {
		this.areaServed = TrafficFlowObserved.staticSetAreaServed(siteRequest_, o);
	}
	public static String staticSetAreaServed(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficFlowObserved areaServedInit() {
		Wrap<String> areaServedWrap = new Wrap<String>().var("areaServed");
		if(areaServed == null) {
			_areaServed(areaServedWrap);
			setAreaServed(areaServedWrap.o);
		}
		return (TrafficFlowObserved)this;
	}

	public static String staticSearchAreaServed(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrAreaServed(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAreaServed(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFlowObserved.staticSearchStrAreaServed(siteRequest_, TrafficFlowObserved.staticSearchAreaServed(siteRequest_, TrafficFlowObserved.staticSetAreaServed(siteRequest_, o)));
	}

	public String sqlAreaServed() {
		return areaServed;
	}

	////////////////////////
	// averageGapDistance //
	////////////////////////


	/**	 The entity averageGapDistance
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal averageGapDistance;

	/**	<br> The entity averageGapDistance
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved&fq=entiteVar_enUS_indexed_string:averageGapDistance">Find the entity averageGapDistance in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _averageGapDistance(Wrap<BigDecimal> w);

	public BigDecimal getAverageGapDistance() {
		return averageGapDistance;
	}

	public void setAverageGapDistance(BigDecimal averageGapDistance) {
		this.averageGapDistance = averageGapDistance;
	}
	@JsonIgnore
	public void setAverageGapDistance(String o) {
		this.averageGapDistance = TrafficFlowObserved.staticSetAverageGapDistance(siteRequest_, o);
	}
	public static BigDecimal staticSetAverageGapDistance(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setAverageGapDistance(Double o) {
			this.averageGapDistance = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setAverageGapDistance(Integer o) {
			this.averageGapDistance = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected TrafficFlowObserved averageGapDistanceInit() {
		Wrap<BigDecimal> averageGapDistanceWrap = new Wrap<BigDecimal>().var("averageGapDistance");
		if(averageGapDistance == null) {
			_averageGapDistance(averageGapDistanceWrap);
			setAverageGapDistance(averageGapDistanceWrap.o);
		}
		return (TrafficFlowObserved)this;
	}

	public static Double staticSearchAverageGapDistance(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrAverageGapDistance(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAverageGapDistance(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFlowObserved.staticSearchStrAverageGapDistance(siteRequest_, TrafficFlowObserved.staticSearchAverageGapDistance(siteRequest_, TrafficFlowObserved.staticSetAverageGapDistance(siteRequest_, o)));
	}

	public BigDecimal sqlAverageGapDistance() {
		return averageGapDistance;
	}

	////////////////////////
	// averageHeadwayTime //
	////////////////////////


	/**	 The entity averageHeadwayTime
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal averageHeadwayTime;

	/**	<br> The entity averageHeadwayTime
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved&fq=entiteVar_enUS_indexed_string:averageHeadwayTime">Find the entity averageHeadwayTime in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _averageHeadwayTime(Wrap<BigDecimal> w);

	public BigDecimal getAverageHeadwayTime() {
		return averageHeadwayTime;
	}

	public void setAverageHeadwayTime(BigDecimal averageHeadwayTime) {
		this.averageHeadwayTime = averageHeadwayTime;
	}
	@JsonIgnore
	public void setAverageHeadwayTime(String o) {
		this.averageHeadwayTime = TrafficFlowObserved.staticSetAverageHeadwayTime(siteRequest_, o);
	}
	public static BigDecimal staticSetAverageHeadwayTime(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setAverageHeadwayTime(Double o) {
			this.averageHeadwayTime = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setAverageHeadwayTime(Integer o) {
			this.averageHeadwayTime = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected TrafficFlowObserved averageHeadwayTimeInit() {
		Wrap<BigDecimal> averageHeadwayTimeWrap = new Wrap<BigDecimal>().var("averageHeadwayTime");
		if(averageHeadwayTime == null) {
			_averageHeadwayTime(averageHeadwayTimeWrap);
			setAverageHeadwayTime(averageHeadwayTimeWrap.o);
		}
		return (TrafficFlowObserved)this;
	}

	public static Double staticSearchAverageHeadwayTime(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrAverageHeadwayTime(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAverageHeadwayTime(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFlowObserved.staticSearchStrAverageHeadwayTime(siteRequest_, TrafficFlowObserved.staticSearchAverageHeadwayTime(siteRequest_, TrafficFlowObserved.staticSetAverageHeadwayTime(siteRequest_, o)));
	}

	public BigDecimal sqlAverageHeadwayTime() {
		return averageHeadwayTime;
	}

	//////////////////////////
	// averageVehicleLength //
	//////////////////////////


	/**	 The entity averageVehicleLength
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal averageVehicleLength;

	/**	<br> The entity averageVehicleLength
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved&fq=entiteVar_enUS_indexed_string:averageVehicleLength">Find the entity averageVehicleLength in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _averageVehicleLength(Wrap<BigDecimal> w);

	public BigDecimal getAverageVehicleLength() {
		return averageVehicleLength;
	}

	public void setAverageVehicleLength(BigDecimal averageVehicleLength) {
		this.averageVehicleLength = averageVehicleLength;
	}
	@JsonIgnore
	public void setAverageVehicleLength(String o) {
		this.averageVehicleLength = TrafficFlowObserved.staticSetAverageVehicleLength(siteRequest_, o);
	}
	public static BigDecimal staticSetAverageVehicleLength(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setAverageVehicleLength(Double o) {
			this.averageVehicleLength = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setAverageVehicleLength(Integer o) {
			this.averageVehicleLength = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected TrafficFlowObserved averageVehicleLengthInit() {
		Wrap<BigDecimal> averageVehicleLengthWrap = new Wrap<BigDecimal>().var("averageVehicleLength");
		if(averageVehicleLength == null) {
			_averageVehicleLength(averageVehicleLengthWrap);
			setAverageVehicleLength(averageVehicleLengthWrap.o);
		}
		return (TrafficFlowObserved)this;
	}

	public static Double staticSearchAverageVehicleLength(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrAverageVehicleLength(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAverageVehicleLength(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFlowObserved.staticSearchStrAverageVehicleLength(siteRequest_, TrafficFlowObserved.staticSearchAverageVehicleLength(siteRequest_, TrafficFlowObserved.staticSetAverageVehicleLength(siteRequest_, o)));
	}

	public BigDecimal sqlAverageVehicleLength() {
		return averageVehicleLength;
	}

	/////////////////////////
	// averageVehicleSpeed //
	/////////////////////////


	/**	 The entity averageVehicleSpeed
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal averageVehicleSpeed;

	/**	<br> The entity averageVehicleSpeed
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved&fq=entiteVar_enUS_indexed_string:averageVehicleSpeed">Find the entity averageVehicleSpeed in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _averageVehicleSpeed(Wrap<BigDecimal> w);

	public BigDecimal getAverageVehicleSpeed() {
		return averageVehicleSpeed;
	}

	public void setAverageVehicleSpeed(BigDecimal averageVehicleSpeed) {
		this.averageVehicleSpeed = averageVehicleSpeed;
	}
	@JsonIgnore
	public void setAverageVehicleSpeed(String o) {
		this.averageVehicleSpeed = TrafficFlowObserved.staticSetAverageVehicleSpeed(siteRequest_, o);
	}
	public static BigDecimal staticSetAverageVehicleSpeed(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setAverageVehicleSpeed(Double o) {
			this.averageVehicleSpeed = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setAverageVehicleSpeed(Integer o) {
			this.averageVehicleSpeed = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected TrafficFlowObserved averageVehicleSpeedInit() {
		Wrap<BigDecimal> averageVehicleSpeedWrap = new Wrap<BigDecimal>().var("averageVehicleSpeed");
		if(averageVehicleSpeed == null) {
			_averageVehicleSpeed(averageVehicleSpeedWrap);
			setAverageVehicleSpeed(averageVehicleSpeedWrap.o);
		}
		return (TrafficFlowObserved)this;
	}

	public static Double staticSearchAverageVehicleSpeed(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrAverageVehicleSpeed(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAverageVehicleSpeed(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFlowObserved.staticSearchStrAverageVehicleSpeed(siteRequest_, TrafficFlowObserved.staticSearchAverageVehicleSpeed(siteRequest_, TrafficFlowObserved.staticSetAverageVehicleSpeed(siteRequest_, o)));
	}

	public BigDecimal sqlAverageVehicleSpeed() {
		return averageVehicleSpeed;
	}

	///////////////
	// congested //
	///////////////


	/**	 The entity congested
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Boolean congested;

	/**	<br> The entity congested
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved&fq=entiteVar_enUS_indexed_string:congested">Find the entity congested in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _congested(Wrap<Boolean> w);

	public Boolean getCongested() {
		return congested;
	}

	public void setCongested(Boolean congested) {
		this.congested = congested;
	}
	@JsonIgnore
	public void setCongested(String o) {
		this.congested = TrafficFlowObserved.staticSetCongested(siteRequest_, o);
	}
	public static Boolean staticSetCongested(SiteRequestEnUS siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected TrafficFlowObserved congestedInit() {
		Wrap<Boolean> congestedWrap = new Wrap<Boolean>().var("congested");
		if(congested == null) {
			_congested(congestedWrap);
			setCongested(congestedWrap.o);
		}
		return (TrafficFlowObserved)this;
	}

	public static Boolean staticSearchCongested(SiteRequestEnUS siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrCongested(SiteRequestEnUS siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqCongested(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFlowObserved.staticSearchStrCongested(siteRequest_, TrafficFlowObserved.staticSearchCongested(siteRequest_, TrafficFlowObserved.staticSetCongested(siteRequest_, o)));
	}

	public Boolean sqlCongested() {
		return congested;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved&fq=entiteVar_enUS_indexed_string:dataProvider">Find the entity dataProvider in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _dataProvider(Wrap<String> w);

	public String getDataProvider() {
		return dataProvider;
	}
	public void setDataProvider(String o) {
		this.dataProvider = TrafficFlowObserved.staticSetDataProvider(siteRequest_, o);
	}
	public static String staticSetDataProvider(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficFlowObserved dataProviderInit() {
		Wrap<String> dataProviderWrap = new Wrap<String>().var("dataProvider");
		if(dataProvider == null) {
			_dataProvider(dataProviderWrap);
			setDataProvider(dataProviderWrap.o);
		}
		return (TrafficFlowObserved)this;
	}

	public static String staticSearchDataProvider(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDataProvider(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDataProvider(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFlowObserved.staticSearchStrDataProvider(siteRequest_, TrafficFlowObserved.staticSearchDataProvider(siteRequest_, TrafficFlowObserved.staticSetDataProvider(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved&fq=entiteVar_enUS_indexed_string:dateCreated">Find the entity dateCreated in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _dateCreated(Wrap<String> w);

	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String o) {
		this.dateCreated = TrafficFlowObserved.staticSetDateCreated(siteRequest_, o);
	}
	public static String staticSetDateCreated(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficFlowObserved dateCreatedInit() {
		Wrap<String> dateCreatedWrap = new Wrap<String>().var("dateCreated");
		if(dateCreated == null) {
			_dateCreated(dateCreatedWrap);
			setDateCreated(dateCreatedWrap.o);
		}
		return (TrafficFlowObserved)this;
	}

	public static String staticSearchDateCreated(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDateCreated(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDateCreated(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFlowObserved.staticSearchStrDateCreated(siteRequest_, TrafficFlowObserved.staticSearchDateCreated(siteRequest_, TrafficFlowObserved.staticSetDateCreated(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved&fq=entiteVar_enUS_indexed_string:dateModified">Find the entity dateModified in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _dateModified(Wrap<String> w);

	public String getDateModified() {
		return dateModified;
	}
	public void setDateModified(String o) {
		this.dateModified = TrafficFlowObserved.staticSetDateModified(siteRequest_, o);
	}
	public static String staticSetDateModified(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficFlowObserved dateModifiedInit() {
		Wrap<String> dateModifiedWrap = new Wrap<String>().var("dateModified");
		if(dateModified == null) {
			_dateModified(dateModifiedWrap);
			setDateModified(dateModifiedWrap.o);
		}
		return (TrafficFlowObserved)this;
	}

	public static String staticSearchDateModified(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDateModified(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDateModified(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFlowObserved.staticSearchStrDateModified(siteRequest_, TrafficFlowObserved.staticSearchDateModified(siteRequest_, TrafficFlowObserved.staticSetDateModified(siteRequest_, o)));
	}

	public String sqlDateModified() {
		return dateModified;
	}

	//////////////////
	// dateObserved //
	//////////////////


	/**	 The entity dateObserved
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String dateObserved;

	/**	<br> The entity dateObserved
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved&fq=entiteVar_enUS_indexed_string:dateObserved">Find the entity dateObserved in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _dateObserved(Wrap<String> w);

	public String getDateObserved() {
		return dateObserved;
	}
	public void setDateObserved(String o) {
		this.dateObserved = TrafficFlowObserved.staticSetDateObserved(siteRequest_, o);
	}
	public static String staticSetDateObserved(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficFlowObserved dateObservedInit() {
		Wrap<String> dateObservedWrap = new Wrap<String>().var("dateObserved");
		if(dateObserved == null) {
			_dateObserved(dateObservedWrap);
			setDateObserved(dateObservedWrap.o);
		}
		return (TrafficFlowObserved)this;
	}

	public static String staticSearchDateObserved(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDateObserved(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDateObserved(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFlowObserved.staticSearchStrDateObserved(siteRequest_, TrafficFlowObserved.staticSearchDateObserved(siteRequest_, TrafficFlowObserved.staticSetDateObserved(siteRequest_, o)));
	}

	public String sqlDateObserved() {
		return dateObserved;
	}

	//////////////////////
	// dateObservedFrom //
	//////////////////////


	/**	 The entity dateObservedFrom
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String dateObservedFrom;

	/**	<br> The entity dateObservedFrom
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved&fq=entiteVar_enUS_indexed_string:dateObservedFrom">Find the entity dateObservedFrom in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _dateObservedFrom(Wrap<String> w);

	public String getDateObservedFrom() {
		return dateObservedFrom;
	}
	public void setDateObservedFrom(String o) {
		this.dateObservedFrom = TrafficFlowObserved.staticSetDateObservedFrom(siteRequest_, o);
	}
	public static String staticSetDateObservedFrom(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficFlowObserved dateObservedFromInit() {
		Wrap<String> dateObservedFromWrap = new Wrap<String>().var("dateObservedFrom");
		if(dateObservedFrom == null) {
			_dateObservedFrom(dateObservedFromWrap);
			setDateObservedFrom(dateObservedFromWrap.o);
		}
		return (TrafficFlowObserved)this;
	}

	public static String staticSearchDateObservedFrom(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDateObservedFrom(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDateObservedFrom(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFlowObserved.staticSearchStrDateObservedFrom(siteRequest_, TrafficFlowObserved.staticSearchDateObservedFrom(siteRequest_, TrafficFlowObserved.staticSetDateObservedFrom(siteRequest_, o)));
	}

	public String sqlDateObservedFrom() {
		return dateObservedFrom;
	}

	////////////////////
	// dateObservedTo //
	////////////////////


	/**	 The entity dateObservedTo
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String dateObservedTo;

	/**	<br> The entity dateObservedTo
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved&fq=entiteVar_enUS_indexed_string:dateObservedTo">Find the entity dateObservedTo in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _dateObservedTo(Wrap<String> w);

	public String getDateObservedTo() {
		return dateObservedTo;
	}
	public void setDateObservedTo(String o) {
		this.dateObservedTo = TrafficFlowObserved.staticSetDateObservedTo(siteRequest_, o);
	}
	public static String staticSetDateObservedTo(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficFlowObserved dateObservedToInit() {
		Wrap<String> dateObservedToWrap = new Wrap<String>().var("dateObservedTo");
		if(dateObservedTo == null) {
			_dateObservedTo(dateObservedToWrap);
			setDateObservedTo(dateObservedToWrap.o);
		}
		return (TrafficFlowObserved)this;
	}

	public static String staticSearchDateObservedTo(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDateObservedTo(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDateObservedTo(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFlowObserved.staticSearchStrDateObservedTo(siteRequest_, TrafficFlowObserved.staticSearchDateObservedTo(siteRequest_, TrafficFlowObserved.staticSetDateObservedTo(siteRequest_, o)));
	}

	public String sqlDateObservedTo() {
		return dateObservedTo;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved&fq=entiteVar_enUS_indexed_string:description">Find the entity description in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _description(Wrap<String> w);

	public String getDescription() {
		return description;
	}
	public void setDescription(String o) {
		this.description = TrafficFlowObserved.staticSetDescription(siteRequest_, o);
	}
	public static String staticSetDescription(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficFlowObserved descriptionInit() {
		Wrap<String> descriptionWrap = new Wrap<String>().var("description");
		if(description == null) {
			_description(descriptionWrap);
			setDescription(descriptionWrap.o);
		}
		return (TrafficFlowObserved)this;
	}

	public static String staticSearchDescription(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDescription(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDescription(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFlowObserved.staticSearchStrDescription(siteRequest_, TrafficFlowObserved.staticSearchDescription(siteRequest_, TrafficFlowObserved.staticSetDescription(siteRequest_, o)));
	}

	public String sqlDescription() {
		return description;
	}

	///////////////
	// intensity //
	///////////////


	/**	 The entity intensity
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal intensity;

	/**	<br> The entity intensity
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved&fq=entiteVar_enUS_indexed_string:intensity">Find the entity intensity in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _intensity(Wrap<BigDecimal> w);

	public BigDecimal getIntensity() {
		return intensity;
	}

	public void setIntensity(BigDecimal intensity) {
		this.intensity = intensity;
	}
	@JsonIgnore
	public void setIntensity(String o) {
		this.intensity = TrafficFlowObserved.staticSetIntensity(siteRequest_, o);
	}
	public static BigDecimal staticSetIntensity(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setIntensity(Double o) {
			this.intensity = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setIntensity(Integer o) {
			this.intensity = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected TrafficFlowObserved intensityInit() {
		Wrap<BigDecimal> intensityWrap = new Wrap<BigDecimal>().var("intensity");
		if(intensity == null) {
			_intensity(intensityWrap);
			setIntensity(intensityWrap.o);
		}
		return (TrafficFlowObserved)this;
	}

	public static Double staticSearchIntensity(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrIntensity(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqIntensity(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFlowObserved.staticSearchStrIntensity(siteRequest_, TrafficFlowObserved.staticSearchIntensity(siteRequest_, TrafficFlowObserved.staticSetIntensity(siteRequest_, o)));
	}

	public BigDecimal sqlIntensity() {
		return intensity;
	}

	///////////////////
	// laneDirection //
	///////////////////


	/**	 The entity laneDirection
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String laneDirection;

	/**	<br> The entity laneDirection
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved&fq=entiteVar_enUS_indexed_string:laneDirection">Find the entity laneDirection in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _laneDirection(Wrap<String> w);

	public String getLaneDirection() {
		return laneDirection;
	}
	public void setLaneDirection(String o) {
		this.laneDirection = TrafficFlowObserved.staticSetLaneDirection(siteRequest_, o);
	}
	public static String staticSetLaneDirection(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficFlowObserved laneDirectionInit() {
		Wrap<String> laneDirectionWrap = new Wrap<String>().var("laneDirection");
		if(laneDirection == null) {
			_laneDirection(laneDirectionWrap);
			setLaneDirection(laneDirectionWrap.o);
		}
		return (TrafficFlowObserved)this;
	}

	public static String staticSearchLaneDirection(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrLaneDirection(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqLaneDirection(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFlowObserved.staticSearchStrLaneDirection(siteRequest_, TrafficFlowObserved.staticSearchLaneDirection(siteRequest_, TrafficFlowObserved.staticSetLaneDirection(siteRequest_, o)));
	}

	public String sqlLaneDirection() {
		return laneDirection;
	}

	////////////
	// laneId //
	////////////


	/**	 The entity laneId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer laneId;

	/**	<br> The entity laneId
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved&fq=entiteVar_enUS_indexed_string:laneId">Find the entity laneId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _laneId(Wrap<Integer> w);

	public Integer getLaneId() {
		return laneId;
	}

	public void setLaneId(Integer laneId) {
		this.laneId = laneId;
	}
	@JsonIgnore
	public void setLaneId(String o) {
		this.laneId = TrafficFlowObserved.staticSetLaneId(siteRequest_, o);
	}
	public static Integer staticSetLaneId(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected TrafficFlowObserved laneIdInit() {
		Wrap<Integer> laneIdWrap = new Wrap<Integer>().var("laneId");
		if(laneId == null) {
			_laneId(laneIdWrap);
			setLaneId(laneIdWrap.o);
		}
		return (TrafficFlowObserved)this;
	}

	public static Integer staticSearchLaneId(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrLaneId(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqLaneId(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFlowObserved.staticSearchStrLaneId(siteRequest_, TrafficFlowObserved.staticSearchLaneId(siteRequest_, TrafficFlowObserved.staticSetLaneId(siteRequest_, o)));
	}

	public Integer sqlLaneId() {
		return laneId;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved&fq=entiteVar_enUS_indexed_string:name">Find the entity name in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _name(Wrap<String> w);

	public String getName() {
		return name;
	}
	public void setName(String o) {
		this.name = TrafficFlowObserved.staticSetName(siteRequest_, o);
	}
	public static String staticSetName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficFlowObserved nameInit() {
		Wrap<String> nameWrap = new Wrap<String>().var("name");
		if(name == null) {
			_name(nameWrap);
			setName(nameWrap.o);
		}
		return (TrafficFlowObserved)this;
	}

	public static String staticSearchName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqName(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFlowObserved.staticSearchStrName(siteRequest_, TrafficFlowObserved.staticSearchName(siteRequest_, TrafficFlowObserved.staticSetName(siteRequest_, o)));
	}

	public String sqlName() {
		return name;
	}

	///////////////
	// occupancy //
	///////////////


	/**	 The entity occupancy
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal occupancy;

	/**	<br> The entity occupancy
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved&fq=entiteVar_enUS_indexed_string:occupancy">Find the entity occupancy in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _occupancy(Wrap<BigDecimal> w);

	public BigDecimal getOccupancy() {
		return occupancy;
	}

	public void setOccupancy(BigDecimal occupancy) {
		this.occupancy = occupancy;
	}
	@JsonIgnore
	public void setOccupancy(String o) {
		this.occupancy = TrafficFlowObserved.staticSetOccupancy(siteRequest_, o);
	}
	public static BigDecimal staticSetOccupancy(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setOccupancy(Double o) {
			this.occupancy = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setOccupancy(Integer o) {
			this.occupancy = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected TrafficFlowObserved occupancyInit() {
		Wrap<BigDecimal> occupancyWrap = new Wrap<BigDecimal>().var("occupancy");
		if(occupancy == null) {
			_occupancy(occupancyWrap);
			setOccupancy(occupancyWrap.o);
		}
		return (TrafficFlowObserved)this;
	}

	public static Double staticSearchOccupancy(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrOccupancy(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqOccupancy(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFlowObserved.staticSearchStrOccupancy(siteRequest_, TrafficFlowObserved.staticSearchOccupancy(siteRequest_, TrafficFlowObserved.staticSetOccupancy(siteRequest_, o)));
	}

	public BigDecimal sqlOccupancy() {
		return occupancy;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved&fq=entiteVar_enUS_indexed_string:owner">Find the entity owner in Solr</a>
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
		this.owner = TrafficFlowObserved.staticSetOwner(siteRequest_, o);
	}
	public static JsonObject staticSetOwner(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected TrafficFlowObserved ownerInit() {
		Wrap<JsonObject> ownerWrap = new Wrap<JsonObject>().var("owner");
		if(owner == null) {
			_owner(ownerWrap);
			setOwner(ownerWrap.o);
		}
		return (TrafficFlowObserved)this;
	}

	public static JsonObject staticSearchOwner(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrOwner(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqOwner(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFlowObserved.staticSearchStrOwner(siteRequest_, TrafficFlowObserved.staticSearchOwner(siteRequest_, TrafficFlowObserved.staticSetOwner(siteRequest_, o)));
	}

	public JsonObject sqlOwner() {
		return owner;
	}

	////////////////////
	// refRoadSegment //
	////////////////////


	/**	 The entity refRoadSegment
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String refRoadSegment;

	/**	<br> The entity refRoadSegment
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved&fq=entiteVar_enUS_indexed_string:refRoadSegment">Find the entity refRoadSegment in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _refRoadSegment(Wrap<String> w);

	public String getRefRoadSegment() {
		return refRoadSegment;
	}
	public void setRefRoadSegment(String o) {
		this.refRoadSegment = TrafficFlowObserved.staticSetRefRoadSegment(siteRequest_, o);
	}
	public static String staticSetRefRoadSegment(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficFlowObserved refRoadSegmentInit() {
		Wrap<String> refRoadSegmentWrap = new Wrap<String>().var("refRoadSegment");
		if(refRoadSegment == null) {
			_refRoadSegment(refRoadSegmentWrap);
			setRefRoadSegment(refRoadSegmentWrap.o);
		}
		return (TrafficFlowObserved)this;
	}

	public static String staticSearchRefRoadSegment(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrRefRoadSegment(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqRefRoadSegment(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFlowObserved.staticSearchStrRefRoadSegment(siteRequest_, TrafficFlowObserved.staticSearchRefRoadSegment(siteRequest_, TrafficFlowObserved.staticSetRefRoadSegment(siteRequest_, o)));
	}

	public String sqlRefRoadSegment() {
		return refRoadSegment;
	}

	//////////////////
	// reversedLane //
	//////////////////


	/**	 The entity reversedLane
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Boolean reversedLane;

	/**	<br> The entity reversedLane
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved&fq=entiteVar_enUS_indexed_string:reversedLane">Find the entity reversedLane in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _reversedLane(Wrap<Boolean> w);

	public Boolean getReversedLane() {
		return reversedLane;
	}

	public void setReversedLane(Boolean reversedLane) {
		this.reversedLane = reversedLane;
	}
	@JsonIgnore
	public void setReversedLane(String o) {
		this.reversedLane = TrafficFlowObserved.staticSetReversedLane(siteRequest_, o);
	}
	public static Boolean staticSetReversedLane(SiteRequestEnUS siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected TrafficFlowObserved reversedLaneInit() {
		Wrap<Boolean> reversedLaneWrap = new Wrap<Boolean>().var("reversedLane");
		if(reversedLane == null) {
			_reversedLane(reversedLaneWrap);
			setReversedLane(reversedLaneWrap.o);
		}
		return (TrafficFlowObserved)this;
	}

	public static Boolean staticSearchReversedLane(SiteRequestEnUS siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrReversedLane(SiteRequestEnUS siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqReversedLane(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFlowObserved.staticSearchStrReversedLane(siteRequest_, TrafficFlowObserved.staticSearchReversedLane(siteRequest_, TrafficFlowObserved.staticSetReversedLane(siteRequest_, o)));
	}

	public Boolean sqlReversedLane() {
		return reversedLane;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved&fq=entiteVar_enUS_indexed_string:seeAlso">Find the entity seeAlso in Solr</a>
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
		this.seeAlso = TrafficFlowObserved.staticSetSeeAlso(siteRequest_, o);
	}
	public static JsonObject staticSetSeeAlso(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected TrafficFlowObserved seeAlsoInit() {
		Wrap<JsonObject> seeAlsoWrap = new Wrap<JsonObject>().var("seeAlso");
		if(seeAlso == null) {
			_seeAlso(seeAlsoWrap);
			setSeeAlso(seeAlsoWrap.o);
		}
		return (TrafficFlowObserved)this;
	}

	public static JsonObject staticSearchSeeAlso(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrSeeAlso(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSeeAlso(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFlowObserved.staticSearchStrSeeAlso(siteRequest_, TrafficFlowObserved.staticSearchSeeAlso(siteRequest_, TrafficFlowObserved.staticSetSeeAlso(siteRequest_, o)));
	}

	public JsonObject sqlSeeAlso() {
		return seeAlso;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved&fq=entiteVar_enUS_indexed_string:source">Find the entity source in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _source(Wrap<String> w);

	public String getSource() {
		return source;
	}
	public void setSource(String o) {
		this.source = TrafficFlowObserved.staticSetSource(siteRequest_, o);
	}
	public static String staticSetSource(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficFlowObserved sourceInit() {
		Wrap<String> sourceWrap = new Wrap<String>().var("source");
		if(source == null) {
			_source(sourceWrap);
			setSource(sourceWrap.o);
		}
		return (TrafficFlowObserved)this;
	}

	public static String staticSearchSource(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSource(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSource(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFlowObserved.staticSearchStrSource(siteRequest_, TrafficFlowObserved.staticSearchSource(siteRequest_, TrafficFlowObserved.staticSetSource(siteRequest_, o)));
	}

	public String sqlSource() {
		return source;
	}

	//////////
	// type //
	//////////


	/**	 The entity type
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String type;

	/**	<br> The entity type
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved&fq=entiteVar_enUS_indexed_string:type">Find the entity type in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _type(Wrap<String> w);

	public String getType() {
		return type;
	}
	public void setType(String o) {
		this.type = TrafficFlowObserved.staticSetType(siteRequest_, o);
	}
	public static String staticSetType(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficFlowObserved typeInit() {
		Wrap<String> typeWrap = new Wrap<String>().var("type");
		if(type == null) {
			_type(typeWrap);
			setType(typeWrap.o);
		}
		return (TrafficFlowObserved)this;
	}

	public static String staticSearchType(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrType(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqType(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFlowObserved.staticSearchStrType(siteRequest_, TrafficFlowObserved.staticSearchType(siteRequest_, TrafficFlowObserved.staticSetType(siteRequest_, o)));
	}

	public String sqlType() {
		return type;
	}

	////////////////////
	// vehicleSubType //
	////////////////////


	/**	 The entity vehicleSubType
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String vehicleSubType;

	/**	<br> The entity vehicleSubType
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved&fq=entiteVar_enUS_indexed_string:vehicleSubType">Find the entity vehicleSubType in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _vehicleSubType(Wrap<String> w);

	public String getVehicleSubType() {
		return vehicleSubType;
	}
	public void setVehicleSubType(String o) {
		this.vehicleSubType = TrafficFlowObserved.staticSetVehicleSubType(siteRequest_, o);
	}
	public static String staticSetVehicleSubType(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficFlowObserved vehicleSubTypeInit() {
		Wrap<String> vehicleSubTypeWrap = new Wrap<String>().var("vehicleSubType");
		if(vehicleSubType == null) {
			_vehicleSubType(vehicleSubTypeWrap);
			setVehicleSubType(vehicleSubTypeWrap.o);
		}
		return (TrafficFlowObserved)this;
	}

	public static String staticSearchVehicleSubType(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrVehicleSubType(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqVehicleSubType(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFlowObserved.staticSearchStrVehicleSubType(siteRequest_, TrafficFlowObserved.staticSearchVehicleSubType(siteRequest_, TrafficFlowObserved.staticSetVehicleSubType(siteRequest_, o)));
	}

	public String sqlVehicleSubType() {
		return vehicleSubType;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved&fq=entiteVar_enUS_indexed_string:vehicleType">Find the entity vehicleType in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _vehicleType(Wrap<String> w);

	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String o) {
		this.vehicleType = TrafficFlowObserved.staticSetVehicleType(siteRequest_, o);
	}
	public static String staticSetVehicleType(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficFlowObserved vehicleTypeInit() {
		Wrap<String> vehicleTypeWrap = new Wrap<String>().var("vehicleType");
		if(vehicleType == null) {
			_vehicleType(vehicleTypeWrap);
			setVehicleType(vehicleTypeWrap.o);
		}
		return (TrafficFlowObserved)this;
	}

	public static String staticSearchVehicleType(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrVehicleType(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqVehicleType(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFlowObserved.staticSearchStrVehicleType(siteRequest_, TrafficFlowObserved.staticSearchVehicleType(siteRequest_, TrafficFlowObserved.staticSetVehicleType(siteRequest_, o)));
	}

	public String sqlVehicleType() {
		return vehicleType;
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepTrafficFlowObserved(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepTrafficFlowObserved();
	}

	public Future<Void> promiseDeepTrafficFlowObserved() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseTrafficFlowObserved(promise2);
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

	public Future<Void> promiseTrafficFlowObserved(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				addressInit();
				alternateNameInit();
				areaServedInit();
				averageGapDistanceInit();
				averageHeadwayTimeInit();
				averageVehicleLengthInit();
				averageVehicleSpeedInit();
				congestedInit();
				dataProviderInit();
				dateCreatedInit();
				dateModifiedInit();
				dateObservedInit();
				dateObservedFromInit();
				dateObservedToInit();
				descriptionInit();
				intensityInit();
				laneDirectionInit();
				laneIdInit();
				nameInit();
				occupancyInit();
				ownerInit();
				refRoadSegmentInit();
				reversedLaneInit();
				seeAlsoInit();
				sourceInit();
				typeInit();
				vehicleSubTypeInit();
				vehicleTypeInit();
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
		return promiseDeepTrafficFlowObserved(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestTrafficFlowObserved(SiteRequestEnUS siteRequest_) {
			super.siteRequestMapResult(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestTrafficFlowObserved(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainTrafficFlowObserved(v);
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
	public Object obtainTrafficFlowObserved(String var) {
		TrafficFlowObserved oTrafficFlowObserved = (TrafficFlowObserved)this;
		switch(var) {
			case "address":
				return oTrafficFlowObserved.address;
			case "alternateName":
				return oTrafficFlowObserved.alternateName;
			case "areaServed":
				return oTrafficFlowObserved.areaServed;
			case "averageGapDistance":
				return oTrafficFlowObserved.averageGapDistance;
			case "averageHeadwayTime":
				return oTrafficFlowObserved.averageHeadwayTime;
			case "averageVehicleLength":
				return oTrafficFlowObserved.averageVehicleLength;
			case "averageVehicleSpeed":
				return oTrafficFlowObserved.averageVehicleSpeed;
			case "congested":
				return oTrafficFlowObserved.congested;
			case "dataProvider":
				return oTrafficFlowObserved.dataProvider;
			case "dateCreated":
				return oTrafficFlowObserved.dateCreated;
			case "dateModified":
				return oTrafficFlowObserved.dateModified;
			case "dateObserved":
				return oTrafficFlowObserved.dateObserved;
			case "dateObservedFrom":
				return oTrafficFlowObserved.dateObservedFrom;
			case "dateObservedTo":
				return oTrafficFlowObserved.dateObservedTo;
			case "description":
				return oTrafficFlowObserved.description;
			case "intensity":
				return oTrafficFlowObserved.intensity;
			case "laneDirection":
				return oTrafficFlowObserved.laneDirection;
			case "laneId":
				return oTrafficFlowObserved.laneId;
			case "name":
				return oTrafficFlowObserved.name;
			case "occupancy":
				return oTrafficFlowObserved.occupancy;
			case "owner":
				return oTrafficFlowObserved.owner;
			case "refRoadSegment":
				return oTrafficFlowObserved.refRoadSegment;
			case "reversedLane":
				return oTrafficFlowObserved.reversedLane;
			case "seeAlso":
				return oTrafficFlowObserved.seeAlso;
			case "source":
				return oTrafficFlowObserved.source;
			case "type":
				return oTrafficFlowObserved.type;
			case "vehicleSubType":
				return oTrafficFlowObserved.vehicleSubType;
			case "vehicleType":
				return oTrafficFlowObserved.vehicleType;
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
				o = relateTrafficFlowObserved(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateTrafficFlowObserved(String var, Object val) {
		TrafficFlowObserved oTrafficFlowObserved = (TrafficFlowObserved)this;
		switch(var) {
			default:
				return super.relateMapResult(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetTrafficFlowObserved(entityVar,  siteRequest_, o);
	}
	public static Object staticSetTrafficFlowObserved(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "address":
			return TrafficFlowObserved.staticSetAddress(siteRequest_, o);
		case "alternateName":
			return TrafficFlowObserved.staticSetAlternateName(siteRequest_, o);
		case "areaServed":
			return TrafficFlowObserved.staticSetAreaServed(siteRequest_, o);
		case "averageGapDistance":
			return TrafficFlowObserved.staticSetAverageGapDistance(siteRequest_, o);
		case "averageHeadwayTime":
			return TrafficFlowObserved.staticSetAverageHeadwayTime(siteRequest_, o);
		case "averageVehicleLength":
			return TrafficFlowObserved.staticSetAverageVehicleLength(siteRequest_, o);
		case "averageVehicleSpeed":
			return TrafficFlowObserved.staticSetAverageVehicleSpeed(siteRequest_, o);
		case "congested":
			return TrafficFlowObserved.staticSetCongested(siteRequest_, o);
		case "dataProvider":
			return TrafficFlowObserved.staticSetDataProvider(siteRequest_, o);
		case "dateCreated":
			return TrafficFlowObserved.staticSetDateCreated(siteRequest_, o);
		case "dateModified":
			return TrafficFlowObserved.staticSetDateModified(siteRequest_, o);
		case "dateObserved":
			return TrafficFlowObserved.staticSetDateObserved(siteRequest_, o);
		case "dateObservedFrom":
			return TrafficFlowObserved.staticSetDateObservedFrom(siteRequest_, o);
		case "dateObservedTo":
			return TrafficFlowObserved.staticSetDateObservedTo(siteRequest_, o);
		case "description":
			return TrafficFlowObserved.staticSetDescription(siteRequest_, o);
		case "intensity":
			return TrafficFlowObserved.staticSetIntensity(siteRequest_, o);
		case "laneDirection":
			return TrafficFlowObserved.staticSetLaneDirection(siteRequest_, o);
		case "laneId":
			return TrafficFlowObserved.staticSetLaneId(siteRequest_, o);
		case "name":
			return TrafficFlowObserved.staticSetName(siteRequest_, o);
		case "occupancy":
			return TrafficFlowObserved.staticSetOccupancy(siteRequest_, o);
		case "owner":
			return TrafficFlowObserved.staticSetOwner(siteRequest_, o);
		case "refRoadSegment":
			return TrafficFlowObserved.staticSetRefRoadSegment(siteRequest_, o);
		case "reversedLane":
			return TrafficFlowObserved.staticSetReversedLane(siteRequest_, o);
		case "seeAlso":
			return TrafficFlowObserved.staticSetSeeAlso(siteRequest_, o);
		case "source":
			return TrafficFlowObserved.staticSetSource(siteRequest_, o);
		case "type":
			return TrafficFlowObserved.staticSetType(siteRequest_, o);
		case "vehicleSubType":
			return TrafficFlowObserved.staticSetVehicleSubType(siteRequest_, o);
		case "vehicleType":
			return TrafficFlowObserved.staticSetVehicleType(siteRequest_, o);
			default:
				return MapResult.staticSetMapResult(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchTrafficFlowObserved(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchTrafficFlowObserved(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "address":
			return TrafficFlowObserved.staticSearchAddress(siteRequest_, (JsonObject)o);
		case "alternateName":
			return TrafficFlowObserved.staticSearchAlternateName(siteRequest_, (String)o);
		case "areaServed":
			return TrafficFlowObserved.staticSearchAreaServed(siteRequest_, (String)o);
		case "averageGapDistance":
			return TrafficFlowObserved.staticSearchAverageGapDistance(siteRequest_, (BigDecimal)o);
		case "averageHeadwayTime":
			return TrafficFlowObserved.staticSearchAverageHeadwayTime(siteRequest_, (BigDecimal)o);
		case "averageVehicleLength":
			return TrafficFlowObserved.staticSearchAverageVehicleLength(siteRequest_, (BigDecimal)o);
		case "averageVehicleSpeed":
			return TrafficFlowObserved.staticSearchAverageVehicleSpeed(siteRequest_, (BigDecimal)o);
		case "congested":
			return TrafficFlowObserved.staticSearchCongested(siteRequest_, (Boolean)o);
		case "dataProvider":
			return TrafficFlowObserved.staticSearchDataProvider(siteRequest_, (String)o);
		case "dateCreated":
			return TrafficFlowObserved.staticSearchDateCreated(siteRequest_, (String)o);
		case "dateModified":
			return TrafficFlowObserved.staticSearchDateModified(siteRequest_, (String)o);
		case "dateObserved":
			return TrafficFlowObserved.staticSearchDateObserved(siteRequest_, (String)o);
		case "dateObservedFrom":
			return TrafficFlowObserved.staticSearchDateObservedFrom(siteRequest_, (String)o);
		case "dateObservedTo":
			return TrafficFlowObserved.staticSearchDateObservedTo(siteRequest_, (String)o);
		case "description":
			return TrafficFlowObserved.staticSearchDescription(siteRequest_, (String)o);
		case "intensity":
			return TrafficFlowObserved.staticSearchIntensity(siteRequest_, (BigDecimal)o);
		case "laneDirection":
			return TrafficFlowObserved.staticSearchLaneDirection(siteRequest_, (String)o);
		case "laneId":
			return TrafficFlowObserved.staticSearchLaneId(siteRequest_, (Integer)o);
		case "name":
			return TrafficFlowObserved.staticSearchName(siteRequest_, (String)o);
		case "occupancy":
			return TrafficFlowObserved.staticSearchOccupancy(siteRequest_, (BigDecimal)o);
		case "owner":
			return TrafficFlowObserved.staticSearchOwner(siteRequest_, (JsonObject)o);
		case "refRoadSegment":
			return TrafficFlowObserved.staticSearchRefRoadSegment(siteRequest_, (String)o);
		case "reversedLane":
			return TrafficFlowObserved.staticSearchReversedLane(siteRequest_, (Boolean)o);
		case "seeAlso":
			return TrafficFlowObserved.staticSearchSeeAlso(siteRequest_, (JsonObject)o);
		case "source":
			return TrafficFlowObserved.staticSearchSource(siteRequest_, (String)o);
		case "type":
			return TrafficFlowObserved.staticSearchType(siteRequest_, (String)o);
		case "vehicleSubType":
			return TrafficFlowObserved.staticSearchVehicleSubType(siteRequest_, (String)o);
		case "vehicleType":
			return TrafficFlowObserved.staticSearchVehicleType(siteRequest_, (String)o);
			default:
				return MapResult.staticSearchMapResult(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrTrafficFlowObserved(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrTrafficFlowObserved(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "address":
			return TrafficFlowObserved.staticSearchStrAddress(siteRequest_, (JsonObject)o);
		case "alternateName":
			return TrafficFlowObserved.staticSearchStrAlternateName(siteRequest_, (String)o);
		case "areaServed":
			return TrafficFlowObserved.staticSearchStrAreaServed(siteRequest_, (String)o);
		case "averageGapDistance":
			return TrafficFlowObserved.staticSearchStrAverageGapDistance(siteRequest_, (Double)o);
		case "averageHeadwayTime":
			return TrafficFlowObserved.staticSearchStrAverageHeadwayTime(siteRequest_, (Double)o);
		case "averageVehicleLength":
			return TrafficFlowObserved.staticSearchStrAverageVehicleLength(siteRequest_, (Double)o);
		case "averageVehicleSpeed":
			return TrafficFlowObserved.staticSearchStrAverageVehicleSpeed(siteRequest_, (Double)o);
		case "congested":
			return TrafficFlowObserved.staticSearchStrCongested(siteRequest_, (Boolean)o);
		case "dataProvider":
			return TrafficFlowObserved.staticSearchStrDataProvider(siteRequest_, (String)o);
		case "dateCreated":
			return TrafficFlowObserved.staticSearchStrDateCreated(siteRequest_, (String)o);
		case "dateModified":
			return TrafficFlowObserved.staticSearchStrDateModified(siteRequest_, (String)o);
		case "dateObserved":
			return TrafficFlowObserved.staticSearchStrDateObserved(siteRequest_, (String)o);
		case "dateObservedFrom":
			return TrafficFlowObserved.staticSearchStrDateObservedFrom(siteRequest_, (String)o);
		case "dateObservedTo":
			return TrafficFlowObserved.staticSearchStrDateObservedTo(siteRequest_, (String)o);
		case "description":
			return TrafficFlowObserved.staticSearchStrDescription(siteRequest_, (String)o);
		case "intensity":
			return TrafficFlowObserved.staticSearchStrIntensity(siteRequest_, (Double)o);
		case "laneDirection":
			return TrafficFlowObserved.staticSearchStrLaneDirection(siteRequest_, (String)o);
		case "laneId":
			return TrafficFlowObserved.staticSearchStrLaneId(siteRequest_, (Integer)o);
		case "name":
			return TrafficFlowObserved.staticSearchStrName(siteRequest_, (String)o);
		case "occupancy":
			return TrafficFlowObserved.staticSearchStrOccupancy(siteRequest_, (Double)o);
		case "owner":
			return TrafficFlowObserved.staticSearchStrOwner(siteRequest_, (JsonObject)o);
		case "refRoadSegment":
			return TrafficFlowObserved.staticSearchStrRefRoadSegment(siteRequest_, (String)o);
		case "reversedLane":
			return TrafficFlowObserved.staticSearchStrReversedLane(siteRequest_, (Boolean)o);
		case "seeAlso":
			return TrafficFlowObserved.staticSearchStrSeeAlso(siteRequest_, (JsonObject)o);
		case "source":
			return TrafficFlowObserved.staticSearchStrSource(siteRequest_, (String)o);
		case "type":
			return TrafficFlowObserved.staticSearchStrType(siteRequest_, (String)o);
		case "vehicleSubType":
			return TrafficFlowObserved.staticSearchStrVehicleSubType(siteRequest_, (String)o);
		case "vehicleType":
			return TrafficFlowObserved.staticSearchStrVehicleType(siteRequest_, (String)o);
			default:
				return MapResult.staticSearchStrMapResult(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqTrafficFlowObserved(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqTrafficFlowObserved(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "address":
			return TrafficFlowObserved.staticSearchFqAddress(siteRequest_, o);
		case "alternateName":
			return TrafficFlowObserved.staticSearchFqAlternateName(siteRequest_, o);
		case "areaServed":
			return TrafficFlowObserved.staticSearchFqAreaServed(siteRequest_, o);
		case "averageGapDistance":
			return TrafficFlowObserved.staticSearchFqAverageGapDistance(siteRequest_, o);
		case "averageHeadwayTime":
			return TrafficFlowObserved.staticSearchFqAverageHeadwayTime(siteRequest_, o);
		case "averageVehicleLength":
			return TrafficFlowObserved.staticSearchFqAverageVehicleLength(siteRequest_, o);
		case "averageVehicleSpeed":
			return TrafficFlowObserved.staticSearchFqAverageVehicleSpeed(siteRequest_, o);
		case "congested":
			return TrafficFlowObserved.staticSearchFqCongested(siteRequest_, o);
		case "dataProvider":
			return TrafficFlowObserved.staticSearchFqDataProvider(siteRequest_, o);
		case "dateCreated":
			return TrafficFlowObserved.staticSearchFqDateCreated(siteRequest_, o);
		case "dateModified":
			return TrafficFlowObserved.staticSearchFqDateModified(siteRequest_, o);
		case "dateObserved":
			return TrafficFlowObserved.staticSearchFqDateObserved(siteRequest_, o);
		case "dateObservedFrom":
			return TrafficFlowObserved.staticSearchFqDateObservedFrom(siteRequest_, o);
		case "dateObservedTo":
			return TrafficFlowObserved.staticSearchFqDateObservedTo(siteRequest_, o);
		case "description":
			return TrafficFlowObserved.staticSearchFqDescription(siteRequest_, o);
		case "intensity":
			return TrafficFlowObserved.staticSearchFqIntensity(siteRequest_, o);
		case "laneDirection":
			return TrafficFlowObserved.staticSearchFqLaneDirection(siteRequest_, o);
		case "laneId":
			return TrafficFlowObserved.staticSearchFqLaneId(siteRequest_, o);
		case "name":
			return TrafficFlowObserved.staticSearchFqName(siteRequest_, o);
		case "occupancy":
			return TrafficFlowObserved.staticSearchFqOccupancy(siteRequest_, o);
		case "owner":
			return TrafficFlowObserved.staticSearchFqOwner(siteRequest_, o);
		case "refRoadSegment":
			return TrafficFlowObserved.staticSearchFqRefRoadSegment(siteRequest_, o);
		case "reversedLane":
			return TrafficFlowObserved.staticSearchFqReversedLane(siteRequest_, o);
		case "seeAlso":
			return TrafficFlowObserved.staticSearchFqSeeAlso(siteRequest_, o);
		case "source":
			return TrafficFlowObserved.staticSearchFqSource(siteRequest_, o);
		case "type":
			return TrafficFlowObserved.staticSearchFqType(siteRequest_, o);
		case "vehicleSubType":
			return TrafficFlowObserved.staticSearchFqVehicleSubType(siteRequest_, o);
		case "vehicleType":
			return TrafficFlowObserved.staticSearchFqVehicleType(siteRequest_, o);
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
					o = persistTrafficFlowObserved(v, val);
				else if(o instanceof BaseModel) {
					BaseModel oBaseModel = (BaseModel)o;
					o = oBaseModel.persistForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object persistTrafficFlowObserved(String var, Object val) {
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
				if(val instanceof String) {
					setAreaServed((String)val);
				}
				saves.add("areaServed");
				return val;
			} else if("averagegapdistance".equals(varLower)) {
				if(val instanceof String) {
					setAverageGapDistance((String)val);
				} else if(val instanceof Number) {
					setAverageGapDistance(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("averageGapDistance");
				return val;
			} else if("averageheadwaytime".equals(varLower)) {
				if(val instanceof String) {
					setAverageHeadwayTime((String)val);
				} else if(val instanceof Number) {
					setAverageHeadwayTime(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("averageHeadwayTime");
				return val;
			} else if("averagevehiclelength".equals(varLower)) {
				if(val instanceof String) {
					setAverageVehicleLength((String)val);
				} else if(val instanceof Number) {
					setAverageVehicleLength(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("averageVehicleLength");
				return val;
			} else if("averagevehiclespeed".equals(varLower)) {
				if(val instanceof String) {
					setAverageVehicleSpeed((String)val);
				} else if(val instanceof Number) {
					setAverageVehicleSpeed(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("averageVehicleSpeed");
				return val;
			} else if("congested".equals(varLower)) {
				if(val instanceof Boolean) {
					setCongested((Boolean)val);
				} else {
					setCongested(val == null ? null : val.toString());
				}
				saves.add("congested");
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
			} else if("dateobserved".equals(varLower)) {
				if(val instanceof String) {
					setDateObserved((String)val);
				}
				saves.add("dateObserved");
				return val;
			} else if("dateobservedfrom".equals(varLower)) {
				if(val instanceof String) {
					setDateObservedFrom((String)val);
				}
				saves.add("dateObservedFrom");
				return val;
			} else if("dateobservedto".equals(varLower)) {
				if(val instanceof String) {
					setDateObservedTo((String)val);
				}
				saves.add("dateObservedTo");
				return val;
			} else if("description".equals(varLower)) {
				if(val instanceof String) {
					setDescription((String)val);
				}
				saves.add("description");
				return val;
			} else if("intensity".equals(varLower)) {
				if(val instanceof String) {
					setIntensity((String)val);
				} else if(val instanceof Number) {
					setIntensity(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("intensity");
				return val;
			} else if("lanedirection".equals(varLower)) {
				if(val instanceof String) {
					setLaneDirection((String)val);
				}
				saves.add("laneDirection");
				return val;
			} else if("laneid".equals(varLower)) {
				if(val instanceof Integer) {
					setLaneId((Integer)val);
				} else {
					setLaneId(val == null ? null : val.toString());
				}
				saves.add("laneId");
				return val;
			} else if("name".equals(varLower)) {
				if(val instanceof String) {
					setName((String)val);
				}
				saves.add("name");
				return val;
			} else if("occupancy".equals(varLower)) {
				if(val instanceof String) {
					setOccupancy((String)val);
				} else if(val instanceof Number) {
					setOccupancy(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("occupancy");
				return val;
			} else if("owner".equals(varLower)) {
				if(val instanceof String) {
					setOwner((String)val);
				} else if(val instanceof JsonObject) {
					setOwner((JsonObject)val);
				}
				saves.add("owner");
				return val;
			} else if("refroadsegment".equals(varLower)) {
				if(val instanceof String) {
					setRefRoadSegment((String)val);
				}
				saves.add("refRoadSegment");
				return val;
			} else if("reversedlane".equals(varLower)) {
				if(val instanceof Boolean) {
					setReversedLane((Boolean)val);
				} else {
					setReversedLane(val == null ? null : val.toString());
				}
				saves.add("reversedLane");
				return val;
			} else if("seealso".equals(varLower)) {
				if(val instanceof String) {
					setSeeAlso((String)val);
				} else if(val instanceof JsonObject) {
					setSeeAlso((JsonObject)val);
				}
				saves.add("seeAlso");
				return val;
			} else if("source".equals(varLower)) {
				if(val instanceof String) {
					setSource((String)val);
				}
				saves.add("source");
				return val;
			} else if("type".equals(varLower)) {
				if(val instanceof String) {
					setType((String)val);
				}
				saves.add("type");
				return val;
			} else if("vehiclesubtype".equals(varLower)) {
				if(val instanceof String) {
					setVehicleSubType((String)val);
				}
				saves.add("vehicleSubType");
				return val;
			} else if("vehicletype".equals(varLower)) {
				if(val instanceof String) {
					setVehicleType((String)val);
				}
				saves.add("vehicleType");
				return val;
		} else {
			return super.persistMapResult(var, val);
		}
	}

	/////////////
	// populate //
	/////////////

	@Override public void populateForClass(SolrResponse.Doc doc) {
		populateTrafficFlowObserved(doc);
	}
	public void populateTrafficFlowObserved(SolrResponse.Doc doc) {
		TrafficFlowObserved oTrafficFlowObserved = (TrafficFlowObserved)this;
		saves = doc.get("saves_docvalues_strings");
		if(saves != null) {
		}

		super.populateMapResult(doc);
	}

	public void indexTrafficFlowObserved(JsonObject doc) {
		if(address != null) {
			doc.put("address_docvalues_string", address.toString());
		}
		if(alternateName != null) {
			doc.put("alternateName_docvalues_string", alternateName);
		}
		if(areaServed != null) {
			doc.put("areaServed_docvalues_string", areaServed);
		}
		if(averageGapDistance != null) {
			doc.put("averageGapDistance_docvalues_double", averageGapDistance.doubleValue());
		}
		if(averageHeadwayTime != null) {
			doc.put("averageHeadwayTime_docvalues_double", averageHeadwayTime.doubleValue());
		}
		if(averageVehicleLength != null) {
			doc.put("averageVehicleLength_docvalues_double", averageVehicleLength.doubleValue());
		}
		if(averageVehicleSpeed != null) {
			doc.put("averageVehicleSpeed_docvalues_double", averageVehicleSpeed.doubleValue());
		}
		if(congested != null) {
			doc.put("congested_docvalues_boolean", congested);
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
		if(dateObserved != null) {
			doc.put("dateObserved_docvalues_string", dateObserved);
		}
		if(dateObservedFrom != null) {
			doc.put("dateObservedFrom_docvalues_string", dateObservedFrom);
		}
		if(dateObservedTo != null) {
			doc.put("dateObservedTo_docvalues_string", dateObservedTo);
		}
		if(description != null) {
			doc.put("description_docvalues_string", description);
		}
		if(intensity != null) {
			doc.put("intensity_docvalues_double", intensity.doubleValue());
		}
		if(laneDirection != null) {
			doc.put("laneDirection_docvalues_string", laneDirection);
		}
		if(laneId != null) {
			doc.put("laneId_docvalues_int", laneId);
		}
		if(name != null) {
			doc.put("name_docvalues_string", name);
		}
		if(occupancy != null) {
			doc.put("occupancy_docvalues_double", occupancy.doubleValue());
		}
		if(owner != null) {
			doc.put("owner_docvalues_string", owner.toString());
		}
		if(refRoadSegment != null) {
			doc.put("refRoadSegment_docvalues_string", refRoadSegment);
		}
		if(reversedLane != null) {
			doc.put("reversedLane_docvalues_boolean", reversedLane);
		}
		if(seeAlso != null) {
			doc.put("seeAlso_docvalues_string", seeAlso.toString());
		}
		if(source != null) {
			doc.put("source_docvalues_string", source);
		}
		if(type != null) {
			doc.put("type_docvalues_string", type);
		}
		if(vehicleSubType != null) {
			doc.put("vehicleSubType_docvalues_string", vehicleSubType);
		}
		if(vehicleType != null) {
			doc.put("vehicleType_docvalues_string", vehicleType);
		}
		super.indexMapResult(doc);

	}

	public static String varStoredTrafficFlowObserved(String entityVar) {
		switch(entityVar) {
			case "address":
				return "address_docvalues_string";
			case "alternateName":
				return "alternateName_docvalues_string";
			case "areaServed":
				return "areaServed_docvalues_string";
			case "averageGapDistance":
				return "averageGapDistance_docvalues_double";
			case "averageHeadwayTime":
				return "averageHeadwayTime_docvalues_double";
			case "averageVehicleLength":
				return "averageVehicleLength_docvalues_double";
			case "averageVehicleSpeed":
				return "averageVehicleSpeed_docvalues_double";
			case "congested":
				return "congested_docvalues_boolean";
			case "dataProvider":
				return "dataProvider_docvalues_string";
			case "dateCreated":
				return "dateCreated_docvalues_string";
			case "dateModified":
				return "dateModified_docvalues_string";
			case "dateObserved":
				return "dateObserved_docvalues_string";
			case "dateObservedFrom":
				return "dateObservedFrom_docvalues_string";
			case "dateObservedTo":
				return "dateObservedTo_docvalues_string";
			case "description":
				return "description_docvalues_string";
			case "intensity":
				return "intensity_docvalues_double";
			case "laneDirection":
				return "laneDirection_docvalues_string";
			case "laneId":
				return "laneId_docvalues_int";
			case "name":
				return "name_docvalues_string";
			case "occupancy":
				return "occupancy_docvalues_double";
			case "owner":
				return "owner_docvalues_string";
			case "refRoadSegment":
				return "refRoadSegment_docvalues_string";
			case "reversedLane":
				return "reversedLane_docvalues_boolean";
			case "seeAlso":
				return "seeAlso_docvalues_string";
			case "source":
				return "source_docvalues_string";
			case "type":
				return "type_docvalues_string";
			case "vehicleSubType":
				return "vehicleSubType_docvalues_string";
			case "vehicleType":
				return "vehicleType_docvalues_string";
			default:
				return MapResult.varStoredMapResult(entityVar);
		}
	}

	public static String varIndexedTrafficFlowObserved(String entityVar) {
		switch(entityVar) {
			case "address":
				return "address_docvalues_string";
			case "alternateName":
				return "alternateName_docvalues_string";
			case "areaServed":
				return "areaServed_docvalues_string";
			case "averageGapDistance":
				return "averageGapDistance_docvalues_double";
			case "averageHeadwayTime":
				return "averageHeadwayTime_docvalues_double";
			case "averageVehicleLength":
				return "averageVehicleLength_docvalues_double";
			case "averageVehicleSpeed":
				return "averageVehicleSpeed_docvalues_double";
			case "congested":
				return "congested_docvalues_boolean";
			case "dataProvider":
				return "dataProvider_docvalues_string";
			case "dateCreated":
				return "dateCreated_docvalues_string";
			case "dateModified":
				return "dateModified_docvalues_string";
			case "dateObserved":
				return "dateObserved_docvalues_string";
			case "dateObservedFrom":
				return "dateObservedFrom_docvalues_string";
			case "dateObservedTo":
				return "dateObservedTo_docvalues_string";
			case "description":
				return "description_docvalues_string";
			case "intensity":
				return "intensity_docvalues_double";
			case "laneDirection":
				return "laneDirection_docvalues_string";
			case "laneId":
				return "laneId_docvalues_int";
			case "name":
				return "name_docvalues_string";
			case "occupancy":
				return "occupancy_docvalues_double";
			case "owner":
				return "owner_docvalues_string";
			case "refRoadSegment":
				return "refRoadSegment_docvalues_string";
			case "reversedLane":
				return "reversedLane_docvalues_boolean";
			case "seeAlso":
				return "seeAlso_docvalues_string";
			case "source":
				return "source_docvalues_string";
			case "type":
				return "type_docvalues_string";
			case "vehicleSubType":
				return "vehicleSubType_docvalues_string";
			case "vehicleType":
				return "vehicleType_docvalues_string";
			default:
				return MapResult.varIndexedMapResult(entityVar);
		}
	}

	public static String searchVarTrafficFlowObserved(String searchVar) {
		switch(searchVar) {
			case "address_docvalues_string":
				return "address";
			case "alternateName_docvalues_string":
				return "alternateName";
			case "areaServed_docvalues_string":
				return "areaServed";
			case "averageGapDistance_docvalues_double":
				return "averageGapDistance";
			case "averageHeadwayTime_docvalues_double":
				return "averageHeadwayTime";
			case "averageVehicleLength_docvalues_double":
				return "averageVehicleLength";
			case "averageVehicleSpeed_docvalues_double":
				return "averageVehicleSpeed";
			case "congested_docvalues_boolean":
				return "congested";
			case "dataProvider_docvalues_string":
				return "dataProvider";
			case "dateCreated_docvalues_string":
				return "dateCreated";
			case "dateModified_docvalues_string":
				return "dateModified";
			case "dateObserved_docvalues_string":
				return "dateObserved";
			case "dateObservedFrom_docvalues_string":
				return "dateObservedFrom";
			case "dateObservedTo_docvalues_string":
				return "dateObservedTo";
			case "description_docvalues_string":
				return "description";
			case "intensity_docvalues_double":
				return "intensity";
			case "laneDirection_docvalues_string":
				return "laneDirection";
			case "laneId_docvalues_int":
				return "laneId";
			case "name_docvalues_string":
				return "name";
			case "occupancy_docvalues_double":
				return "occupancy";
			case "owner_docvalues_string":
				return "owner";
			case "refRoadSegment_docvalues_string":
				return "refRoadSegment";
			case "reversedLane_docvalues_boolean":
				return "reversedLane";
			case "seeAlso_docvalues_string":
				return "seeAlso";
			case "source_docvalues_string":
				return "source";
			case "type_docvalues_string":
				return "type";
			case "vehicleSubType_docvalues_string":
				return "vehicleSubType";
			case "vehicleType_docvalues_string":
				return "vehicleType";
			default:
				return MapResult.searchVarMapResult(searchVar);
		}
	}

	public static String varSearchTrafficFlowObserved(String entityVar) {
		switch(entityVar) {
			default:
				return MapResult.varSearchMapResult(entityVar);
		}
	}

	public static String varSuggestedTrafficFlowObserved(String entityVar) {
		switch(entityVar) {
			default:
				return MapResult.varSuggestedMapResult(entityVar);
		}
	}

	/////////////
	// store //
	/////////////

	@Override public void storeForClass(SolrResponse.Doc doc) {
		storeTrafficFlowObserved(doc);
	}
	public void storeTrafficFlowObserved(SolrResponse.Doc doc) {
		TrafficFlowObserved oTrafficFlowObserved = (TrafficFlowObserved)this;

		oTrafficFlowObserved.setAddress(Optional.ofNullable(doc.get("address_docvalues_string")).map(v -> v.toString()).orElse(null));
		oTrafficFlowObserved.setAlternateName(Optional.ofNullable(doc.get("alternateName_docvalues_string")).map(v -> v.toString()).orElse(null));
		oTrafficFlowObserved.setAreaServed(Optional.ofNullable(doc.get("areaServed_docvalues_string")).map(v -> v.toString()).orElse(null));
		oTrafficFlowObserved.setAverageGapDistance(Optional.ofNullable(doc.get("averageGapDistance_docvalues_double")).map(v -> v.toString()).orElse(null));
		oTrafficFlowObserved.setAverageHeadwayTime(Optional.ofNullable(doc.get("averageHeadwayTime_docvalues_double")).map(v -> v.toString()).orElse(null));
		oTrafficFlowObserved.setAverageVehicleLength(Optional.ofNullable(doc.get("averageVehicleLength_docvalues_double")).map(v -> v.toString()).orElse(null));
		oTrafficFlowObserved.setAverageVehicleSpeed(Optional.ofNullable(doc.get("averageVehicleSpeed_docvalues_double")).map(v -> v.toString()).orElse(null));
		oTrafficFlowObserved.setCongested(Optional.ofNullable(doc.get("congested_docvalues_boolean")).map(v -> v.toString()).orElse(null));
		oTrafficFlowObserved.setDataProvider(Optional.ofNullable(doc.get("dataProvider_docvalues_string")).map(v -> v.toString()).orElse(null));
		oTrafficFlowObserved.setDateCreated(Optional.ofNullable(doc.get("dateCreated_docvalues_string")).map(v -> v.toString()).orElse(null));
		oTrafficFlowObserved.setDateModified(Optional.ofNullable(doc.get("dateModified_docvalues_string")).map(v -> v.toString()).orElse(null));
		oTrafficFlowObserved.setDateObserved(Optional.ofNullable(doc.get("dateObserved_docvalues_string")).map(v -> v.toString()).orElse(null));
		oTrafficFlowObserved.setDateObservedFrom(Optional.ofNullable(doc.get("dateObservedFrom_docvalues_string")).map(v -> v.toString()).orElse(null));
		oTrafficFlowObserved.setDateObservedTo(Optional.ofNullable(doc.get("dateObservedTo_docvalues_string")).map(v -> v.toString()).orElse(null));
		oTrafficFlowObserved.setDescription(Optional.ofNullable(doc.get("description_docvalues_string")).map(v -> v.toString()).orElse(null));
		oTrafficFlowObserved.setIntensity(Optional.ofNullable(doc.get("intensity_docvalues_double")).map(v -> v.toString()).orElse(null));
		oTrafficFlowObserved.setLaneDirection(Optional.ofNullable(doc.get("laneDirection_docvalues_string")).map(v -> v.toString()).orElse(null));
		oTrafficFlowObserved.setLaneId(Optional.ofNullable(doc.get("laneId_docvalues_int")).map(v -> v.toString()).orElse(null));
		oTrafficFlowObserved.setName(Optional.ofNullable(doc.get("name_docvalues_string")).map(v -> v.toString()).orElse(null));
		oTrafficFlowObserved.setOccupancy(Optional.ofNullable(doc.get("occupancy_docvalues_double")).map(v -> v.toString()).orElse(null));
		oTrafficFlowObserved.setOwner(Optional.ofNullable(doc.get("owner_docvalues_string")).map(v -> v.toString()).orElse(null));
		oTrafficFlowObserved.setRefRoadSegment(Optional.ofNullable(doc.get("refRoadSegment_docvalues_string")).map(v -> v.toString()).orElse(null));
		oTrafficFlowObserved.setReversedLane(Optional.ofNullable(doc.get("reversedLane_docvalues_boolean")).map(v -> v.toString()).orElse(null));
		oTrafficFlowObserved.setSeeAlso(Optional.ofNullable(doc.get("seeAlso_docvalues_string")).map(v -> v.toString()).orElse(null));
		oTrafficFlowObserved.setSource(Optional.ofNullable(doc.get("source_docvalues_string")).map(v -> v.toString()).orElse(null));
		oTrafficFlowObserved.setType(Optional.ofNullable(doc.get("type_docvalues_string")).map(v -> v.toString()).orElse(null));
		oTrafficFlowObserved.setVehicleSubType(Optional.ofNullable(doc.get("vehicleSubType_docvalues_string")).map(v -> v.toString()).orElse(null));
		oTrafficFlowObserved.setVehicleType(Optional.ofNullable(doc.get("vehicleType_docvalues_string")).map(v -> v.toString()).orElse(null));

		super.storeMapResult(doc);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestTrafficFlowObserved() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof TrafficFlowObserved) {
			TrafficFlowObserved original = (TrafficFlowObserved)o;
			if(!Objects.equals(address, original.getAddress()))
				apiRequest.addVars("address");
			if(!Objects.equals(alternateName, original.getAlternateName()))
				apiRequest.addVars("alternateName");
			if(!Objects.equals(areaServed, original.getAreaServed()))
				apiRequest.addVars("areaServed");
			if(!Objects.equals(averageGapDistance, original.getAverageGapDistance()))
				apiRequest.addVars("averageGapDistance");
			if(!Objects.equals(averageHeadwayTime, original.getAverageHeadwayTime()))
				apiRequest.addVars("averageHeadwayTime");
			if(!Objects.equals(averageVehicleLength, original.getAverageVehicleLength()))
				apiRequest.addVars("averageVehicleLength");
			if(!Objects.equals(averageVehicleSpeed, original.getAverageVehicleSpeed()))
				apiRequest.addVars("averageVehicleSpeed");
			if(!Objects.equals(congested, original.getCongested()))
				apiRequest.addVars("congested");
			if(!Objects.equals(dataProvider, original.getDataProvider()))
				apiRequest.addVars("dataProvider");
			if(!Objects.equals(dateCreated, original.getDateCreated()))
				apiRequest.addVars("dateCreated");
			if(!Objects.equals(dateModified, original.getDateModified()))
				apiRequest.addVars("dateModified");
			if(!Objects.equals(dateObserved, original.getDateObserved()))
				apiRequest.addVars("dateObserved");
			if(!Objects.equals(dateObservedFrom, original.getDateObservedFrom()))
				apiRequest.addVars("dateObservedFrom");
			if(!Objects.equals(dateObservedTo, original.getDateObservedTo()))
				apiRequest.addVars("dateObservedTo");
			if(!Objects.equals(description, original.getDescription()))
				apiRequest.addVars("description");
			if(!Objects.equals(intensity, original.getIntensity()))
				apiRequest.addVars("intensity");
			if(!Objects.equals(laneDirection, original.getLaneDirection()))
				apiRequest.addVars("laneDirection");
			if(!Objects.equals(laneId, original.getLaneId()))
				apiRequest.addVars("laneId");
			if(!Objects.equals(name, original.getName()))
				apiRequest.addVars("name");
			if(!Objects.equals(occupancy, original.getOccupancy()))
				apiRequest.addVars("occupancy");
			if(!Objects.equals(owner, original.getOwner()))
				apiRequest.addVars("owner");
			if(!Objects.equals(refRoadSegment, original.getRefRoadSegment()))
				apiRequest.addVars("refRoadSegment");
			if(!Objects.equals(reversedLane, original.getReversedLane()))
				apiRequest.addVars("reversedLane");
			if(!Objects.equals(seeAlso, original.getSeeAlso()))
				apiRequest.addVars("seeAlso");
			if(!Objects.equals(source, original.getSource()))
				apiRequest.addVars("source");
			if(!Objects.equals(type, original.getType()))
				apiRequest.addVars("type");
			if(!Objects.equals(vehicleSubType, original.getVehicleSubType()))
				apiRequest.addVars("vehicleSubType");
			if(!Objects.equals(vehicleType, original.getVehicleType()))
				apiRequest.addVars("vehicleType");
			super.apiRequestMapResult();
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
		sb.append(Optional.ofNullable(areaServed).map(v -> "areaServed: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(averageGapDistance).map(v -> "averageGapDistance: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(averageHeadwayTime).map(v -> "averageHeadwayTime: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(averageVehicleLength).map(v -> "averageVehicleLength: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(averageVehicleSpeed).map(v -> "averageVehicleSpeed: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(congested).map(v -> "congested: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(dataProvider).map(v -> "dataProvider: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(dateCreated).map(v -> "dateCreated: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(dateModified).map(v -> "dateModified: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(dateObserved).map(v -> "dateObserved: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(dateObservedFrom).map(v -> "dateObservedFrom: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(dateObservedTo).map(v -> "dateObservedTo: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(description).map(v -> "description: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(intensity).map(v -> "intensity: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(laneDirection).map(v -> "laneDirection: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(laneId).map(v -> "laneId: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(name).map(v -> "name: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(occupancy).map(v -> "occupancy: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(owner).map(v -> "owner: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(refRoadSegment).map(v -> "refRoadSegment: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(reversedLane).map(v -> "reversedLane: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(seeAlso).map(v -> "seeAlso: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(source).map(v -> "source: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(type).map(v -> "type: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(vehicleSubType).map(v -> "vehicleSubType: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(vehicleType).map(v -> "vehicleType: \"" + v + "\"\n" ).orElse(""));
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "TrafficFlowObserved";
	public static final String VAR_address = "address";
	public static final String VAR_alternateName = "alternateName";
	public static final String VAR_areaServed = "areaServed";
	public static final String VAR_averageGapDistance = "averageGapDistance";
	public static final String VAR_averageHeadwayTime = "averageHeadwayTime";
	public static final String VAR_averageVehicleLength = "averageVehicleLength";
	public static final String VAR_averageVehicleSpeed = "averageVehicleSpeed";
	public static final String VAR_congested = "congested";
	public static final String VAR_dataProvider = "dataProvider";
	public static final String VAR_dateCreated = "dateCreated";
	public static final String VAR_dateModified = "dateModified";
	public static final String VAR_dateObserved = "dateObserved";
	public static final String VAR_dateObservedFrom = "dateObservedFrom";
	public static final String VAR_dateObservedTo = "dateObservedTo";
	public static final String VAR_description = "description";
	public static final String VAR_intensity = "intensity";
	public static final String VAR_laneDirection = "laneDirection";
	public static final String VAR_laneId = "laneId";
	public static final String VAR_name = "name";
	public static final String VAR_occupancy = "occupancy";
	public static final String VAR_owner = "owner";
	public static final String VAR_refRoadSegment = "refRoadSegment";
	public static final String VAR_reversedLane = "reversedLane";
	public static final String VAR_seeAlso = "seeAlso";
	public static final String VAR_source = "source";
	public static final String VAR_type = "type";
	public static final String VAR_vehicleSubType = "vehicleSubType";
	public static final String VAR_vehicleType = "vehicleType";

	public static List<String> varsQForClass() {
		return TrafficFlowObserved.varsQTrafficFlowObserved(new ArrayList<String>());
	}
	public static List<String> varsQTrafficFlowObserved(List<String> vars) {
		MapResult.varsQMapResult(vars);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return TrafficFlowObserved.varsFqTrafficFlowObserved(new ArrayList<String>());
	}
	public static List<String> varsFqTrafficFlowObserved(List<String> vars) {
		vars.add(VAR_address);
		vars.add(VAR_alternateName);
		vars.add(VAR_areaServed);
		vars.add(VAR_averageGapDistance);
		vars.add(VAR_averageHeadwayTime);
		vars.add(VAR_averageVehicleLength);
		vars.add(VAR_averageVehicleSpeed);
		vars.add(VAR_congested);
		vars.add(VAR_dataProvider);
		vars.add(VAR_dateCreated);
		vars.add(VAR_dateModified);
		vars.add(VAR_dateObserved);
		vars.add(VAR_dateObservedFrom);
		vars.add(VAR_dateObservedTo);
		vars.add(VAR_description);
		vars.add(VAR_intensity);
		vars.add(VAR_laneDirection);
		vars.add(VAR_laneId);
		vars.add(VAR_name);
		vars.add(VAR_occupancy);
		vars.add(VAR_owner);
		vars.add(VAR_refRoadSegment);
		vars.add(VAR_reversedLane);
		vars.add(VAR_seeAlso);
		vars.add(VAR_source);
		vars.add(VAR_type);
		vars.add(VAR_vehicleSubType);
		vars.add(VAR_vehicleType);
		MapResult.varsFqMapResult(vars);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return TrafficFlowObserved.varsRangeTrafficFlowObserved(new ArrayList<String>());
	}
	public static List<String> varsRangeTrafficFlowObserved(List<String> vars) {
		vars.add(VAR_address);
		vars.add(VAR_averageGapDistance);
		vars.add(VAR_averageHeadwayTime);
		vars.add(VAR_averageVehicleLength);
		vars.add(VAR_averageVehicleSpeed);
		vars.add(VAR_intensity);
		vars.add(VAR_laneId);
		vars.add(VAR_occupancy);
		vars.add(VAR_owner);
		vars.add(VAR_seeAlso);
		MapResult.varsRangeMapResult(vars);
		return vars;
	}

	public static final String DISPLAY_NAME_address = "address";
	public static final String DISPLAY_NAME_alternateName = "alternate name";
	public static final String DISPLAY_NAME_areaServed = "area served";
	public static final String DISPLAY_NAME_averageGapDistance = "average gap distance";
	public static final String DISPLAY_NAME_averageHeadwayTime = "average headway time";
	public static final String DISPLAY_NAME_averageVehicleLength = "average vehicle length";
	public static final String DISPLAY_NAME_averageVehicleSpeed = "average vehicle speed";
	public static final String DISPLAY_NAME_congested = "congested";
	public static final String DISPLAY_NAME_dataProvider = "data provider";
	public static final String DISPLAY_NAME_dateCreated = "date created";
	public static final String DISPLAY_NAME_dateModified = "date modified";
	public static final String DISPLAY_NAME_dateObserved = "date observed";
	public static final String DISPLAY_NAME_dateObservedFrom = "date observed from";
	public static final String DISPLAY_NAME_dateObservedTo = "date observed to";
	public static final String DISPLAY_NAME_description = "description";
	public static final String DISPLAY_NAME_intensity = "intensity";
	public static final String DISPLAY_NAME_laneDirection = "lane direction";
	public static final String DISPLAY_NAME_laneId = "lane id";
	public static final String DISPLAY_NAME_name = "name";
	public static final String DISPLAY_NAME_occupancy = "occupancy";
	public static final String DISPLAY_NAME_owner = "owner";
	public static final String DISPLAY_NAME_refRoadSegment = "ref road segment";
	public static final String DISPLAY_NAME_reversedLane = "reversed lane";
	public static final String DISPLAY_NAME_seeAlso = "see also";
	public static final String DISPLAY_NAME_source = "source";
	public static final String DISPLAY_NAME_type = "type";
	public static final String DISPLAY_NAME_vehicleSubType = "vehicle sub type";
	public static final String DISPLAY_NAME_vehicleType = "vehicle type";

	public static String displayNameForClass(String var) {
		return TrafficFlowObserved.displayNameTrafficFlowObserved(var);
	}
	public static String displayNameTrafficFlowObserved(String var) {
		switch(var) {
		case VAR_address:
			return DISPLAY_NAME_address;
		case VAR_alternateName:
			return DISPLAY_NAME_alternateName;
		case VAR_areaServed:
			return DISPLAY_NAME_areaServed;
		case VAR_averageGapDistance:
			return DISPLAY_NAME_averageGapDistance;
		case VAR_averageHeadwayTime:
			return DISPLAY_NAME_averageHeadwayTime;
		case VAR_averageVehicleLength:
			return DISPLAY_NAME_averageVehicleLength;
		case VAR_averageVehicleSpeed:
			return DISPLAY_NAME_averageVehicleSpeed;
		case VAR_congested:
			return DISPLAY_NAME_congested;
		case VAR_dataProvider:
			return DISPLAY_NAME_dataProvider;
		case VAR_dateCreated:
			return DISPLAY_NAME_dateCreated;
		case VAR_dateModified:
			return DISPLAY_NAME_dateModified;
		case VAR_dateObserved:
			return DISPLAY_NAME_dateObserved;
		case VAR_dateObservedFrom:
			return DISPLAY_NAME_dateObservedFrom;
		case VAR_dateObservedTo:
			return DISPLAY_NAME_dateObservedTo;
		case VAR_description:
			return DISPLAY_NAME_description;
		case VAR_intensity:
			return DISPLAY_NAME_intensity;
		case VAR_laneDirection:
			return DISPLAY_NAME_laneDirection;
		case VAR_laneId:
			return DISPLAY_NAME_laneId;
		case VAR_name:
			return DISPLAY_NAME_name;
		case VAR_occupancy:
			return DISPLAY_NAME_occupancy;
		case VAR_owner:
			return DISPLAY_NAME_owner;
		case VAR_refRoadSegment:
			return DISPLAY_NAME_refRoadSegment;
		case VAR_reversedLane:
			return DISPLAY_NAME_reversedLane;
		case VAR_seeAlso:
			return DISPLAY_NAME_seeAlso;
		case VAR_source:
			return DISPLAY_NAME_source;
		case VAR_type:
			return DISPLAY_NAME_type;
		case VAR_vehicleSubType:
			return DISPLAY_NAME_vehicleSubType;
		case VAR_vehicleType:
			return DISPLAY_NAME_vehicleType;
		default:
			return MapResult.displayNameMapResult(var);
		}
	}

	public static String descriptionTrafficFlowObserved(String var) {
		switch(var) {
		case VAR_address:
			return "The mailing address";
		case VAR_alternateName:
			return "An alternative name for this item";
		case VAR_areaServed:
			return "The geographic area where a service or offered item is provided";
		case VAR_averageGapDistance:
			return "Average gap distance between consecutive vehicles";
		case VAR_averageHeadwayTime:
			return "Average headway time. Headway time is the time ellapsed between two consecutive vehicles";
		case VAR_averageVehicleLength:
			return "Average length of the vehicles transiting during     the observation period";
		case VAR_averageVehicleSpeed:
			return "Average speed of the vehicles transiting during the observation period";
		case VAR_congested:
			return "Flags whether there was a traffic congestion during the observation period in the referred lane. The absence of this attribute means no traffic congestion";
		case VAR_dataProvider:
			return "A sequence of characters identifying the provider of the harmonised data entity.";
		case VAR_dateCreated:
			return "Entity creation timestamp. This will usually be allocated by the storage platform.";
		case VAR_dateModified:
			return "Timestamp of the last modification of the entity. This will usually be allocated by the storage platform.";
		case VAR_dateObserved:
			return "The date and time of this observation in ISO8601 UTC format. It can be represented by an specific time instant or by an ISO8601 interval. As a workaround for the lack of support of Orion Context Broker for datetime intervals, it can be used two separate attributes: `dateObservedFrom`, `dateObservedTo`. [DateTime](https://schema.org/DateTime) or an ISO8601 interval represented as [Text](https://schema.org/Text)";
		case VAR_dateObservedFrom:
			return "Observation period start date and time. See `dateObserved`";
		case VAR_dateObservedTo:
			return "Observation period end date and time. See `dateObserved`";
		case VAR_description:
			return "A description of this item";
		case VAR_intensity:
			return "Total number of vehicles detected during this observation period";
		case VAR_laneDirection:
			return "Usual direction of travel in the lane referred by this observation. This attribute is useful when the observation is not referencing any road segment, allowing to know the direction of travel of the traffic flow observed. Enum:forward, backward'. See RoadSegment for a description of the semantics of these values.";
		case VAR_laneId:
			return "Lane identifier. Lane identification is done using the conventions defined by RoadSegment entity which are based on [OpenStreetMap](http://wiki.openstreetmap.org/wiki/Forward_%26_backward,_left_%26_right).";
		case VAR_name:
			return "The name of this item.";
		case VAR_occupancy:
			return "Fraction of the observation time where a vehicle has been occupying the observed lane";
		case VAR_owner:
			return "A List containing a JSON encoded sequence of characters referencing the unique Ids of the owner(s)";
		case VAR_refRoadSegment:
			return "Concerned road segment on which the observation has been made. Reference to an entity of type RoadSegment";
		case VAR_reversedLane:
			return "Flags whether traffic in the lane was reversed during the observation period. The absence of this attribute means no lane reversion";
		case VAR_seeAlso:
			return "list of uri pointing to additional resources about the item";
		case VAR_source:
			return "A sequence of characters giving the original source of the entity data as a URL. Recommended to be the fully qualified domain name of the source provider, or the URL to the source object.";
		case VAR_type:
			return "NGSI Entity type. It has to be TrafficFlowObserved";
		case VAR_vehicleSubType:
			return "It allows to specify a sub type of `vehicleType`, eg if the `vehicleType` is set to `Lorry` the `vehicleSubType` may be `OGV1` or `OGV2` to convey more information about the exact type of vehicle.";
		case VAR_vehicleType:
			return "Type of vehicle from the point of view of its structural characteristics. Enum:'agriculturalVehicle, bicycle, bus, minibus, car, caravan, tram, tanker, carWithCaravan, carWithTrailer, lorry, moped, motorcycle, motorcycleWithSideCar, motorscooter, trailer, van, constructionOrMaintenanceVehicle, trolley, binTrolley, sweepingMachine, cleaningTrolley'";
			default:
				return MapResult.descriptionMapResult(var);
		}
	}

	public static String classSimpleNameTrafficFlowObserved(String var) {
		switch(var) {
		case VAR_address:
			return "JsonObject";
		case VAR_alternateName:
			return "String";
		case VAR_areaServed:
			return "String";
		case VAR_averageGapDistance:
			return "BigDecimal";
		case VAR_averageHeadwayTime:
			return "BigDecimal";
		case VAR_averageVehicleLength:
			return "BigDecimal";
		case VAR_averageVehicleSpeed:
			return "BigDecimal";
		case VAR_congested:
			return "Boolean";
		case VAR_dataProvider:
			return "String";
		case VAR_dateCreated:
			return "String";
		case VAR_dateModified:
			return "String";
		case VAR_dateObserved:
			return "String";
		case VAR_dateObservedFrom:
			return "String";
		case VAR_dateObservedTo:
			return "String";
		case VAR_description:
			return "String";
		case VAR_intensity:
			return "BigDecimal";
		case VAR_laneDirection:
			return "String";
		case VAR_laneId:
			return "Integer";
		case VAR_name:
			return "String";
		case VAR_occupancy:
			return "BigDecimal";
		case VAR_owner:
			return "JsonObject";
		case VAR_refRoadSegment:
			return "String";
		case VAR_reversedLane:
			return "Boolean";
		case VAR_seeAlso:
			return "JsonObject";
		case VAR_source:
			return "String";
		case VAR_type:
			return "String";
		case VAR_vehicleSubType:
			return "String";
		case VAR_vehicleType:
			return "String";
			default:
				return MapResult.classSimpleNameMapResult(var);
		}
	}

	public static Integer htmlColumnTrafficFlowObserved(String var) {
		switch(var) {
			default:
				return MapResult.htmlColumnMapResult(var);
		}
	}

	public static Integer htmlRowTrafficFlowObserved(String var) {
		switch(var) {
		case VAR_address:
			return 3;
		case VAR_alternateName:
			return 3;
		case VAR_areaServed:
			return 3;
		case VAR_averageGapDistance:
			return 4;
		case VAR_averageHeadwayTime:
			return 4;
		case VAR_averageVehicleLength:
			return 4;
		case VAR_averageVehicleSpeed:
			return 5;
		case VAR_congested:
			return 5;
		case VAR_dataProvider:
			return 5;
		case VAR_dateCreated:
			return 6;
		case VAR_dateModified:
			return 6;
		case VAR_dateObserved:
			return 6;
		case VAR_dateObservedFrom:
			return 7;
		case VAR_dateObservedTo:
			return 7;
		case VAR_description:
			return 7;
		case VAR_intensity:
			return 8;
		case VAR_laneDirection:
			return 8;
		case VAR_laneId:
			return 9;
		case VAR_name:
			return 9;
		case VAR_occupancy:
			return 10;
		case VAR_owner:
			return 10;
		case VAR_refRoadSegment:
			return 10;
		case VAR_reversedLane:
			return 11;
		case VAR_seeAlso:
			return 11;
		case VAR_source:
			return 11;
		case VAR_type:
			return 12;
		case VAR_vehicleSubType:
			return 12;
		case VAR_vehicleType:
			return 12;
			default:
				return MapResult.htmlRowMapResult(var);
		}
	}

	public static Integer htmlCellTrafficFlowObserved(String var) {
		switch(var) {
		case VAR_address:
			return 1;
		case VAR_alternateName:
			return 2;
		case VAR_areaServed:
			return 3;
		case VAR_averageGapDistance:
			return 1;
		case VAR_averageHeadwayTime:
			return 2;
		case VAR_averageVehicleLength:
			return 3;
		case VAR_averageVehicleSpeed:
			return 1;
		case VAR_congested:
			return 2;
		case VAR_dataProvider:
			return 3;
		case VAR_dateCreated:
			return 1;
		case VAR_dateModified:
			return 2;
		case VAR_dateObserved:
			return 3;
		case VAR_dateObservedFrom:
			return 1;
		case VAR_dateObservedTo:
			return 2;
		case VAR_description:
			return 3;
		case VAR_intensity:
			return 2;
		case VAR_laneDirection:
			return 3;
		case VAR_laneId:
			return 1;
		case VAR_name:
			return 3;
		case VAR_occupancy:
			return 1;
		case VAR_owner:
			return 2;
		case VAR_refRoadSegment:
			return 3;
		case VAR_reversedLane:
			return 1;
		case VAR_seeAlso:
			return 2;
		case VAR_source:
			return 3;
		case VAR_type:
			return 1;
		case VAR_vehicleSubType:
			return 2;
		case VAR_vehicleType:
			return 3;
			default:
				return MapResult.htmlCellMapResult(var);
		}
	}

	public static Integer lengthMinTrafficFlowObserved(String var) {
		switch(var) {
			default:
				return MapResult.lengthMinMapResult(var);
		}
	}

	public static Integer lengthMaxTrafficFlowObserved(String var) {
		switch(var) {
			default:
				return MapResult.lengthMaxMapResult(var);
		}
	}

	public static Integer maxTrafficFlowObserved(String var) {
		switch(var) {
			default:
				return MapResult.maxMapResult(var);
		}
	}

	public static Integer minTrafficFlowObserved(String var) {
		switch(var) {
			default:
				return MapResult.minMapResult(var);
		}
	}
}
