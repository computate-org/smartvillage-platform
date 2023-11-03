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
package org.computate.smartvillage.enus.model.traffic.fiware.trafficflowobserved;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.computate.search.wrap.Wrap;
import org.computate.smartvillage.enus.model.base.BaseModel;
import org.computate.smartvillage.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight;
import org.computate.smartvillage.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObservedGen;
import org.computate.smartvillage.enus.model.traffic.simulation.TrafficSimulation;
import org.computate.smartvillage.enus.result.map.MapResult;
import org.computate.vertx.search.list.SearchList;

import io.vertx.core.Promise;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.pgclient.data.Path;
import io.vertx.pgclient.data.Point;

/**
 * SmartDataModel: TrafficFlowObserved - Transportation - Smart Cities
 * Fiware: true
 * 
 * Model: true
 * SqlOrder: 3
 * Api: true
 * Page: true
 * SuperPage.enUS: BaseModelPage
 * Indexed: true
 * Order: 18
 * Description: A device for watching vehicles in a lane of traffic on a road. 
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
public class TrafficFlowObserved extends TrafficFlowObservedGen<BaseModel> {

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: color
	 * HtmRow: 3
	 * HtmCell: 3
	 * Facet: true
	 * Color: true
	 */
	protected void _color(Wrap<String> w) {
		w.o("magenta");
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: entity ID
	 * Description: A unique ID for this Smart Data Model
	 * HtmRow: 5
	 * HtmCell: 1
	 * Facet: true
	 */
	protected void _entityId(Wrap<String> w) {}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: traffic simulation ID
	 * Description: The Traffic Simulation ID
	 * HtmRow: 5
	 * HtmCell: 2
	 * Facet: true
	 */
	protected void _trafficSimulationId(Wrap<String> w) {
	}

	/**
	 * Ignore: true
	 */
	protected void _trafficSimulationSearch(Promise<SearchList<TrafficSimulation>> promise) {
		SearchList<TrafficSimulation> l = new SearchList<>();
		if(trafficSimulationId != null) {
			l.setC(TrafficSimulation.class);
			l.q("*:*");
			l.fq(String.format(TrafficSimulation.VAR_entityId + "_docvalues_string:%s", trafficSimulationId));
			l.setStore(true);
		}
		promise.complete(l);
	}

	/**
	 * Ignore: true
	 */
	protected void _trafficSimulation_(Wrap<TrafficSimulation> w) {
		w.o(trafficSimulationSearch.first());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: lane area detector ID
	 * Description: The unique ID of the lane area detector in SUMO. 
	 * HtmRow: 15
	 * HtmCell: 1
	 * Facet: true
	 */
	protected void _laneAreaDetectorId(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * FiwareType: geo:point
	 * DocValues: true
	 * Persist: true
	 * DisplayName: map location
	 * HtmRow: 4
	 * HtmCell: 2
	 * Facet: true
	 */
	protected void _location(Wrap<Point> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: simulation name
	 * HtmRow: 5
	 * HtmCell: 2
	 * Facet: true
	 */
	protected void _simulationName(Wrap<String> w) {
		if(trafficSimulation_ != null)
			w.o(trafficSimulation_.getSimulationName());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: sumocfg path
	 * Facet: true
	 */
	protected void _sumocfgPath(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: traffic light ID
	 * Description: The Smart Traffic Light ID
	 * HtmRow: 17
	 * HtmCell: 3
	 * Facet: true
	 */
	protected void _customTrafficLightId(Wrap<String> w) {
	}

	/**
	 * Ignore: true
	 */
	protected void _smartTrafficLightSearch(Promise<SearchList<SmartTrafficLight>> promise) {
		SearchList<SmartTrafficLight> l = new SearchList<>();
		if(customTrafficLightId != null) {
			l.setC(SmartTrafficLight.class);
			l.q("*:*");
			l.fq(String.format(SmartTrafficLight.VAR_entityId + "_docvalues_string:%s", customTrafficLightId));
			l.setStore(true);
		}
		promise.complete(l);
	}

	/**
	 * Ignore: true
	 */
	protected void _smartTrafficLight_(Wrap<SmartTrafficLight> w) {
		w.o(smartTrafficLightSearch.first());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: address
	 * Description: The mailing address
	 * HtmRow: 5
	 * HtmCell: 3
	 * Facet: true
	 * FiwareContext: https://smartdatamodels.org/dataModel.Transportation/address
	 */
	protected void _address(Wrap<JsonObject> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: alternate name
	 * Description: An alternative name for this item
	 * HtmRow: 5
	 * HtmCell: 4
	 * Facet: true
	 */
	protected void _alternateName(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * FiwareType: geo:linestring
	 * Location: true
	 * DisplayName: area served
	 * Description: The geographic area where a service or offered item is provided. Geojson reference to the item. It can be Point, LineString, Polygon, MultiPoint, MultiLineString or MultiPolygon. 
	 * Required: true
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 6
	 * HtmCell: 1
	 * Facet: true
	 */
	protected void _areaServed(Wrap<Path> w) {
		if(trafficSimulation_ != null && laneAreaDetectorId != null) {
			Integer i = trafficSimulation_.getLaneAreaDetectorIds().indexOf(laneAreaDetectorId);
			if(i != null) {
				JsonArray detectorLanes = trafficSimulation_.getLaneAreaDetectorLanes().getJsonArray(i);
				if(detectorLanes != null) {
					Path path = new Path();

					for(Integer j = 0; j < detectorLanes.size(); j++) {
//					for(Integer j = detectorLanes.size() - 1; j >= 0; j--) {
						JsonObject lane = detectorLanes.getJsonObject(j);
						JsonArray coordinates = lane.getJsonArray("coordinates");

						for(Integer k = 0; k < coordinates.size(); k++) {
//						for(Integer k = coordinates.size() - 1; k >= 0; k--) {
							JsonArray coordinate = (JsonArray)coordinates.getJsonArray(k);

							path.addPoint(new Point(Double.parseDouble(coordinate.getString(0))
									, Double.parseDouble(coordinate.getString(1))));
						}
					}
					w.o(path);
				}
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: average gap distance
	 * Description: Average gap distance between consecutive vehicles
	 * HtmRow: 6
	 * HtmCell: 2
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
	 * HtmRow: 6
	 * HtmCell: 3
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
	 * HtmRow: 7
	 * HtmCell: 1
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
	 * HtmRow: 7
	 * HtmCell: 2
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
	 * HtmRow: 7
	 * HtmCell: 3
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
	 * HtmRow: 7
	 * HtmCell: 4
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
	 * HtmRow: 8
	 * HtmCell: 1
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
	 * HtmRow: 8
	 * HtmCell: 2
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
	 * HtmRow: 8
	 * HtmCell: 3
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
	 * HtmRow: 9
	 * HtmCell: 1
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
	 * HtmRow: 9
	 * HtmCell: 2
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
	 * HtmRow: 9
	 * HtmCell: 3
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
//	 * HtmRow: 10
//	 * HtmCell: 1
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
	 * HtmRow: 10
	 * HtmCell: 2
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
	 * HtmRow: 10
	 * HtmCell: 3
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
	 * HtmRow: 11
	 * HtmCell: 1
	 * Facet: true
	 */
	protected void _laneId(Wrap<Integer> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: name
	 * Description: The name of this item.
	 * HtmRow: 11
	 * HtmCell: 3
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
	 * HtmRow: 12
	 * HtmCell: 1
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
	 * HtmRow: 12
	 * HtmCell: 2
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
	 * HtmRow: 12
	 * HtmCell: 3
	 * Facet: true
	 * FiwareContext: https://smartdatamodels.org/dataModel.Transportation/refRoadSegment
	 */
	protected void _refRoadSegment(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: reversed lane
	 * Description: Flags whether traffic in the lane was reversed during the observation period. The absence of this attribute means no lane reversion
	 * HtmRow: 13
	 * HtmCell: 1
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
	 * HtmRow: 13
	 * HtmCell: 2
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
	 * HtmRow: 13
	 * HtmCell: 3
	 * Facet: true
	 */
	protected void _source(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: vehicle sub type
	 * Description: It allows to specify a sub type of `vehicleType`, eg if the `vehicleType` is set to `Lorry` the `vehicleSubType` may be `OGV1` or `OGV2` to convey more information about the exact type of vehicle.
	 * HtmRow: 14
	 * HtmCell: 2
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
	 * HtmRow: 14
	 * HtmCell: 3
	 * Facet: true
	 */
	protected void _vehicleType(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: sigma
	 * Description: The driver imperfection as a floating point number [0,1] (0 denotes perfect driving). 
	 * HtmRow: 15
	 * HtmCell: 1
	 * Facet: true
	 */
	protected void _customSigma(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: acceleration
	 * Description: The acceleration ability of vehicles of this type (in m/s^2). 
	 * HtmRow: 15
	 * HtmCell: 2
	 * Facet: true
	 */
	protected void _customAcceleration(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: deceleration
	 * Description: The deceleration ability of vehicles of this type (in m/s^2). 
	 * HtmRow: 15
	 * HtmCell: 3
	 * Facet: true
	 */
	protected void _customDeceleration(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: min green time
	 * Description: Min green time for the traffic light in seconds [1, 50]. 
	 * HtmRow: 16
	 * HtmCell: 1
	 * Facet: true
	 */
	protected void _customMinGreenTime(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: max green time
	 * Description: Max green time for the traffic light in seconds [1, 50]. 
	 * HtmRow: 16
	 * HtmCell: 2
	 * Facet: true
	 */
	protected void _customMaxGreenTime(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: average vehicles/minute
	 * Description: Average vehicle/min [1, 30]. 
	 * HtmRow: 16
	 * HtmCell: 3
	 * Facet: true
	 */
	protected void _customAverageVehiclesPerMinute(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: demand scaling factor
	 * Description: Demand scaling factor (multiplies all vehicle demands) [1, 2]. 
	 * HtmRow: 17
	 * HtmCell: 1
	 * Facet: true
	 */
	protected void _customDemandScalingFactor(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: queue length threshold
	 * Description: Demand scaling factor (multiplies all vehicle demands) [1, 2]. 
	 * HtmRow: 17
	 * HtmCell: 2
	 * Facet: true
	 */
	protected void _customQueueLengthThreshold(Wrap<BigDecimal> w) {
	}

	@Override
	protected void _objectTitle(Wrap<String> w) {
		StringBuilder b = new StringBuilder();
		b.append(Optional.ofNullable(entityId).orElse(pk.toString()));
		w.o(b.toString().trim());
	}

	@Override
	protected void _objectId(Wrap<String> w) {
		if(entityId != null)
			w.o(entityId);
	}

	@Override
	protected void _classCanonicalNames(List<String> l) { 
//		l.add(MapResult.class.getCanonicalName());
		super._classCanonicalNames(l);
	}
}
