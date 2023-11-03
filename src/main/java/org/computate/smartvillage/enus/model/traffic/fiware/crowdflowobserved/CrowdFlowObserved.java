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
package org.computate.smartvillage.enus.model.traffic.fiware.crowdflowobserved;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.computate.search.wrap.Wrap;
import org.computate.smartvillage.enus.model.base.BaseModel;
import org.computate.smartvillage.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObservedGen;
import org.computate.smartvillage.enus.model.traffic.simulation.TrafficSimulation;
import org.computate.smartvillage.enus.result.map.MapResult;
import org.computate.vertx.search.list.SearchList;

import io.vertx.core.Promise;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.pgclient.data.Point;
import io.vertx.pgclient.data.Polygon;

/**
* SmartDataModel: CrowdFlowObserved - Transportation - SmartCities
* Fiware: true
* 
* Model: true
* SqlOrder: 1
* Api: true
* Page: true
* SuperPage.enUS: BaseModelPage
* Indexed: true
* Order: 1
* Description: 
* ApiTag.enUS: CrowdFlowObserved
* ApiUri.enUS: /api/crowd-flow-observed

* ApiMethod.enUS: Search
* ApiMethod: GET
* ApiMethod: PATCH
* ApiMethod: POST
* ApiMethod: PUTImport

* ApiMethod.enUS: SearchPage
* Page.SearchPage.enUS: CrowdFlowObservedPage
* ApiUri.SearchPage.enUS: /crowd-flow-observed

* Role.enUS: SiteAdmin

* AName.enUS: a CrowdFlowObserved
* Color: 2017-shaded-spruce
* IconGroup: duotone
* IconName: map-location-dot
* Rows: 100
**/
public class CrowdFlowObserved extends CrowdFlowObservedGen<BaseModel> {

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
	* {@inheritDoc}}
	* DocValues: true
	* Persist: true
	* DisplayName: walking area ID
	* Description: The walking area ID of pedestrians in SUMO
	* HtmRow: 3
	* HtmCell: 1
	* Facet: true
	**/
	protected void _walkingAreaId(Wrap<String> w) {}
	
	/**
	* {@inheritDoc}}
	* DocValues: true
	* Persist: true
	* DisplayName: alternate name
	* Description: An alternative name for this item
	* HtmRow: 3
	* HtmCell: 2
	* Facet: true
	**/
	protected void _alternateName(Wrap<String> w) {}
	
	/**
	* {@inheritDoc}}
	* FiwareType: geo:linestring
	* Location: true
	* DocValues: true
	* Persist: true
	* DisplayName: area served
	* Description: The geographic area where a service or offered item is provided
	* HtmRow: 3
	* HtmCell: 3
	* Facet: true
	**/
	protected void _areaServed(Wrap<Polygon> w) {
		if(trafficSimulation_ != null && walkingAreaId != null) {
			Integer i = trafficSimulation_.getWalkingAreaIds().indexOf(walkingAreaId);
			if(i != null) {
				JsonObject walkingAreaLane = trafficSimulation_.getWalkingAreaLanes().getJsonObject(i);
				JsonArray coordinates = walkingAreaLane.getJsonArray("coordinates");
				Polygon polygon = new Polygon();

				for(Integer k = 0; k < coordinates.size(); k++) {
//						for(Integer k = coordinates.size() - 1; k >= 0; k--) {
					JsonArray coordinate = (JsonArray)coordinates.getJsonArray(k);

					polygon.addPoint(new Point(Double.parseDouble(coordinate.getString(0))
							, Double.parseDouble(coordinate.getString(1))));
				}
				w.o(polygon);
			}
		}
	}
	
	/**
	* {@inheritDoc}}
	* DocValues: true
	* Persist: true
	* DisplayName: average crowd speed
	* Description: Average speed of the crowd transiting during the observation period
	* HtmRow: 4
	* HtmCell: 1
	* Facet: true
	**/
	protected void _averageCrowdSpeed(Wrap<BigDecimal> w) {}
	
	/**
	* {@inheritDoc}}
	* DocValues: true
	* Persist: true
	* DisplayName: average headway time
	* Description: Average headway time. Headway time is the time elapsed between two consecutive persons
	* HtmRow: 4
	* HtmCell: 2
	* Facet: true
	**/
	protected void _averageHeadwayTime(Wrap<BigDecimal> w) {}
	
	/**
	* {@inheritDoc}}
	* DocValues: true
	* Persist: true
	* DisplayName: congested
	* Description: Flags whether there was a crowd congestion during the observation period in the referred walkway. The absence of this attribute means no crowd congestion
	* HtmRow: 4
	* HtmCell: 3
	* Facet: true
	**/
	protected void _congested(Wrap<Boolean> w) {}
	
	/**
	* {@inheritDoc}}
	* DocValues: true
	* Persist: true
	* DisplayName: data provider
	* Description: A sequence of characters identifying the provider of the harmonised data entity.
	* HtmRow: 5
	* HtmCell: 1
	* Facet: true
	**/
	protected void _dataProvider(Wrap<String> w) {}
	
	/**
	* {@inheritDoc}}
	* DocValues: true
	* Persist: true
	* DisplayName: date created
	* Description: Entity creation timestamp. This will usually be allocated by the storage platform.
	* HtmRow: 5
	* HtmCell: 2
	* Facet: true
	**/
	protected void _dateCreated(Wrap<String> w) {}
	
	/**
	* {@inheritDoc}}
	* DocValues: true
	* Persist: true
	* DisplayName: date modified
	* Description: Timestamp of the last modification of the entity. This will usually be allocated by the storage platform.
	* HtmRow: 5
	* HtmCell: 3
	* Facet: true
	**/
	protected void _dateModified(Wrap<String> w) {}
	
	/**
	* {@inheritDoc}}
	* DocValues: true
	* Persist: true
	* DisplayName: date observed
	* Description: The date and time of this observation in ISO8601 UTC format. It can be represented by an specific time instant or by an ISO8601 interval. As a workaround for the lack of support of Orion Context Broker for datetime intervals, it can be used two separate attributes: `dateObservedFrom`, `dateObservedTo`
	* HtmRow: 6
	* HtmCell: 1
	* Facet: true
	**/
	protected void _dateObserved(Wrap<String> w) {}
	
	/**
	* {@inheritDoc}}
	* DocValues: true
	* Persist: true
	* DisplayName: date observed from
	* Description: Observation period start date and time. See `dateObserved`.
	* HtmRow: 6
	* HtmCell: 2
	* Facet: true
	**/
	protected void _dateObservedFrom(Wrap<String> w) {}
	
	/**
	* {@inheritDoc}}
	* DocValues: true
	* Persist: true
	* DisplayName: date observed to
	* Description: Observation period end date and time. See `dateObserved`.
	* HtmRow: 6
	* HtmCell: 3
	* Facet: true
	**/
	protected void _dateObservedTo(Wrap<String> w) {}
	
	/**
	* {@inheritDoc}}
	* DocValues: true
	* Persist: true
	* DisplayName: description
	* Description: A description of this item
	* HtmRow: 7
	* HtmCell: 1
	* Facet: true
	**/
	protected void _description(Wrap<String> w) {}
	
	/**
	* {@inheritDoc}}
	* DocValues: true
	* Persist: true
	* DisplayName: direction
	* Description: Usual direction of travel in the walkway referred by this observation with respect to the city center. Enum:'inbound, outbound'
	* HtmRow: 7
	* HtmCell: 2
	* Facet: true
	**/
	protected void _direction(Wrap<String> w) {}
	
	/**
	* {@inheritDoc}}
	* FiwareType: geo:point
	* DocValues: true
	* Persist: true
	* DisplayName: location
	* Description: Geojson reference to the item. It can be Point, LineString, Polygon, MultiPoint, MultiLineString or MultiPolygon
	* HtmRow: 7
	* HtmCell: 3
	* Facet: true
	**/
	protected void _location(Wrap<Point> w) {}
	
	/**
	* {@inheritDoc}}
	* DocValues: true
	* Persist: true
	* DisplayName: name
	* Description: The name of this item.
	* HtmRow: 8
	* HtmCell: 1
	* Facet: true
	**/
	protected void _name(Wrap<String> w) {}
	
	/**
	* {@inheritDoc}}
	* DocValues: true
	* Persist: true
	* DisplayName: occupancy
	* Description: Fraction of the observation time where a person has been occupying the observed walkway
	* HtmRow: 8
	* HtmCell: 2
	* Facet: true
	**/
	protected void _occupancy(Wrap<BigDecimal> w) {}
	
	/**
	* {@inheritDoc}}
	* DocValues: true
	* Persist: true
	* DisplayName: owner
	* Description: A List containing a JSON encoded sequence of characters referencing the unique Ids of the owner(s)
	* HtmRow: 8
	* HtmCell: 3
	* Facet: true
	**/
	protected void _owner(Wrap<JsonObject> w) {}
	
	/**
	* {@inheritDoc}}
	* DocValues: true
	* Persist: true
	* DisplayName: people count
	* Description: Total number of people detected during this observation.
	* HtmRow: 9
	* HtmCell: 1
	* Facet: true
	**/
	protected void _peopleCount(Wrap<Integer> w) {}
	
	/**
	* {@inheritDoc}}
	* DocValues: true
	* Persist: true
	* DisplayName: ref road segment
	* Description: Concerned road segment on which the observation has been made
	* HtmRow: 9
	* HtmCell: 2
	* Facet: true
	**/
	protected void _refRoadSegment(Wrap<JsonObject> w) {}
	
	/**
	* {@inheritDoc}}
	* DocValues: true
	* Persist: true
	* DisplayName: see also
	* Description: list of uri pointing to additional resources about the item
	* HtmRow: 9
	* HtmCell: 3
	* Facet: true
	**/
	protected void _seeAlso(Wrap<JsonObject> w) {}
	
	/**
	* {@inheritDoc}}
	* DocValues: true
	* Persist: true
	* DisplayName: source
	* Description: A sequence of characters giving the original source of the entity data as a URL. Recommended to be the fully qualified domain name of the source provider, or the URL to the source object.
	* HtmRow: 10
	* HtmCell: 1
	* Facet: true
	**/
	protected void _source(Wrap<String> w) {}

	@Override
	protected void _objectTitle(Wrap<String> w) {
		StringBuilder b = new StringBuilder();
		b.append(Optional.ofNullable(entityId).orElse(Optional.ofNullable(pk).map(v -> v.toString()).orElse(null)));
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
