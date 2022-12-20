package org.computate.smartvillageview.enus.model.traffic.fiware.trafficflowobserved;

import java.math.BigDecimal;

import org.computate.search.wrap.Wrap;
import org.computate.smartvillageview.enus.result.map.MapResult;

import io.vertx.core.json.JsonObject;

/**
 * SmartDataModel: TrafficFlowObserved - Transportation - Smart Cities
 * Api: true
 * Page: true
 * SuperPage.enUS: MapResultPage
 * Indexed: true
 * Order: 18
 * 
 * ApiTag.enUS: Traffic Flow Observed
 * ApiUri.enUS: /api/traffic-flow-observed
 * 
 * ApiMethod.enUS: Search
 * ApiMethod: GET
 * ApiMethod: PATCH
 * ApiMethod: POST
 * ApiMethod: PUTImport
 * 
 * ApiMethod.enUS: SearchPage
 * Page.SearchPage.enUS: TrafficFlowObservedPage
 * ApiUri.SearchPage.enUS: /traffic-flow-observed
 * 
 * Role.enUS: SiteAdmin
 * 
 * AName.enUS: a traffic flow observed
 * Color: 2017-shaded-spruce
 * IconGroup: duotone
 * IconName: map-location-dot
 * Rows: 100
 */
public class TrafficFlowObserved extends TrafficFlowObservedGen<MapResult> {

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: address
	 * Description: The mailing address
	 * HtmlRow: 3
	 * HtmlCell: 1
	 * Facet: true
	 */
	protected void _address(Wrap<JsonObject> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: alternate name
	 * Description: An alternative name for this item
	 * HtmlRow: 3
	 * HtmlCell: 2
	 * Facet: true
	 */
	protected void _alternateName(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: area served
	 * Description: The geographic area where a service or offered item is provided
	 * HtmlRow: 3
	 * HtmlCell: 3
	 * Facet: true
	 */
	protected void _areaServed(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: average gap distance
	 * Description: Average gap distance between consecutive vehicles
	 * HtmlRow: 4
	 * HtmlCell: 1
	 * Facet: true
	 */
	protected void _averageGapDistance(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: average headway time
	 * Description: Average headway time. Headway time is the time ellapsed between two consecutive vehicles
	 * HtmlRow: 4
	 * HtmlCell: 2
	 * Facet: true
	 */
	protected void _averageHeadwayTime(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: average vehicle length
	 * Description: Average length of the vehicles transiting during     the observation period
	 * HtmlRow: 4
	 * HtmlCell: 3
	 * Facet: true
	 */
	protected void _averageVehicleLength(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: average vehicle speed
	 * Description: Average speed of the vehicles transiting during the observation period
	 * HtmlRow: 5
	 * HtmlCell: 1
	 * Facet: true
	 */
	protected void _averageVehicleSpeed(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: congested
	 * Description:  Flags whether there was a traffic congestion during the observation period in the referred lane. The absence of this attribute means no traffic congestion
	 * HtmlRow: 5
	 * HtmlCell: 2
	 * Facet: true
	 */
	protected void _congested(Wrap<Boolean> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: data provider
	 * Description: A sequence of characters identifying the provider of the harmonised data entity.
	 * HtmlRow: 5
	 * HtmlCell: 3
	 * Facet: true
	 */
	protected void _dataProvider(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: date created
	 * Description: Entity creation timestamp. This will usually be allocated by the storage platform.
	 * HtmlRow: 6
	 * HtmlCell: 1
	 * Facet: true
	 */
	protected void _dateCreated(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: date modified
	 * Description: Timestamp of the last modification of the entity. This will usually be allocated by the storage platform.
	 * HtmlRow: 6
	 * HtmlCell: 2
	 * Facet: true
	 */
	protected void _dateModified(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: date observed
	 * Description: The date and time of this observation in ISO8601 UTC format. It can be represented by an specific time instant or by an ISO8601 interval. As a workaround for the lack of support of Orion Context Broker for datetime intervals, it can be used two separate attributes: `dateObservedFrom`, `dateObservedTo`. [DateTime](https://schema.org/DateTime) or an ISO8601 interval represented as [Text](https://schema.org/Text)
	 * HtmlRow: 6
	 * HtmlCell: 3
	 * Facet: true
	 */
	protected void _dateObserved(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: date observed from
	 * Description: Observation period start date and time. See `dateObserved`
	 * HtmlRow: 7
	 * HtmlCell: 1
	 * Facet: true
	 */
	protected void _dateObservedFrom(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: date observed to
	 * Description: Observation period end date and time. See `dateObserved`
	 * HtmlRow: 7
	 * HtmlCell: 2
	 * Facet: true
	 */
	protected void _dateObservedTo(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: description
	 * Description: A description of this item
	 * HtmlRow: 7
	 * HtmlCell: 3
	 * Facet: true
	 */
	protected void _description(Wrap<String> w) {
	}

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

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: intensity
	 * Description: Total number of vehicles detected during this observation period
	 * HtmlRow: 8
	 * HtmlCell: 2
	 * Facet: true
	 */
	protected void _intensity(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: lane direction
	 * Description: Usual direction of travel in the lane referred by this observation. This attribute is useful when the observation is not referencing any road segment, allowing to know the direction of travel of the traffic flow observed. Enum:forward, backward'. See RoadSegment for a description of the semantics of these values.
	 * HtmlRow: 8
	 * HtmlCell: 3
	 * Facet: true
	 */
	protected void _laneDirection(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: lane id
	 * Description: Lane identifier. Lane identification is done using the conventions defined by RoadSegment entity which are based on [OpenStreetMap](http://wiki.openstreetmap.org/wiki/Forward_%26_backward,_left_%26_right).
	 * HtmlRow: 9
	 * HtmlCell: 1
	 * Facet: true
	 */
	protected void _laneId(Wrap<Integer> w) {
	}

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

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: name
	 * Description: The name of this item.
	 * HtmlRow: 9
	 * HtmlCell: 3
	 * Facet: true
	 */
	protected void _name(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: occupancy
	 * Description: Fraction of the observation time where a vehicle has been occupying the observed lane
	 * HtmlRow: 10
	 * HtmlCell: 1
	 * Facet: true
	 */
	protected void _occupancy(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: owner
	 * Description: A List containing a JSON encoded sequence of characters referencing the unique Ids of the owner(s)
	 * HtmlRow: 10
	 * HtmlCell: 2
	 * Facet: true
	 */
	protected void _owner(Wrap<JsonObject> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: ref road segment
	 * Description: Concerned road segment on which the observation has been made. Reference to an entity of type RoadSegment
	 * HtmlRow: 10
	 * HtmlCell: 3
	 * Facet: true
	 */
	protected void _refRoadSegment(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: reversed lane
	 * Description: Flags whether traffic in the lane was reversed during the observation period. The absence of this attribute means no lane reversion
	 * HtmlRow: 11
	 * HtmlCell: 1
	 * Facet: true
	 */
	protected void _reversedLane(Wrap<Boolean> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: see also
	 * Description: list of uri pointing to additional resources about the item
	 * HtmlRow: 11
	 * HtmlCell: 2
	 * Facet: true
	 */
	protected void _seeAlso(Wrap<JsonObject> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: source
	 * Description: A sequence of characters giving the original source of the entity data as a URL. Recommended to be the fully qualified domain name of the source provider, or the URL to the source object.
	 * HtmlRow: 11
	 * HtmlCell: 3
	 * Facet: true
	 */
	protected void _source(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: type
	 * Description: NGSI Entity type. It has to be TrafficFlowObserved
	 * HtmlRow: 12
	 * HtmlCell: 1
	 * Facet: true
	 */
	protected void _type(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: vehicle sub type
	 * Description: It allows to specify a sub type of `vehicleType`, eg if the `vehicleType` is set to `Lorry` the `vehicleSubType` may be `OGV1` or `OGV2` to convey more information about the exact type of vehicle.
	 * HtmlRow: 12
	 * HtmlCell: 2
	 * Facet: true
	 */
	protected void _vehicleSubType(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: vehicle type
	 * Description: Type of vehicle from the point of view of its structural characteristics. Enum:'agriculturalVehicle, bicycle, bus, minibus, car, caravan, tram, tanker, carWithCaravan, carWithTrailer, lorry, moped, motorcycle, motorcycleWithSideCar, motorscooter, trailer, van, constructionOrMaintenanceVehicle, trolley, binTrolley, sweepingMachine, cleaningTrolley'
	 * HtmlRow: 12
	 * HtmlCell: 3
	 * Facet: true
	 */
	protected void _vehicleType(Wrap<String> w) {
	}
}
