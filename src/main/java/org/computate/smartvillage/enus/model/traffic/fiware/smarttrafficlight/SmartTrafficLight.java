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
package org.computate.smartvillage.enus.model.traffic.fiware.smarttrafficlight;


import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.computate.search.wrap.Wrap;
import org.computate.smartvillage.enus.model.base.BaseModel;
import org.computate.smartvillage.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLightGen;
import org.computate.smartvillage.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved;
import org.computate.vertx.search.list.SearchList;

import io.vertx.core.Promise;

/**
 * {@inheritDoc}
 * Fiware: true
 * 
 * Api: true
 * Model: true
 * Page: true
 * SuperPage.enUS: BaseModelPage
 * Indexed: true
 * Order: 8
 * 
 * ApiTag.enUS: Smart Traffic Light
 * ApiUri.enUS: /api/smart-traffic-light
 * 
 * ApiMethod: Search
 * ApiMethod: GET
 * ApiMethod: PATCH
 * ApiMethod: POST
 * ApiMethod: PUTImport
 * 
 * ApiMethod: SearchPage
 * Page.SearchPage.enUS: SmartTrafficLightPage
 * ApiUri.SearchPage.enUS: /smart-traffic-light
 * 
 * Role.enUS: SiteAdmin
 * Saves: true
 * 
 * AName.enUS: a smart traffic light
 * Color: 2017-shaded-spruce
 * IconGroup: duotone
 * IconName: traffic-light-stop
 * Rows: 100
 */
public class SmartTrafficLight extends SmartTrafficLightGen<BaseModel> {

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: entity ID
	 * Description: A unique ID for this Smart Data Model
	 * HtmRow: 5
	 * HtmCell: 1
	 * Facet: true
	 * Required: true
	 */
	protected void _entityId(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: smart traffic light name
	 * HtmRow: 5
	 * HtmCell: 2
	 * Facet: true
	 */
	protected void _smartTrafficLightName(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: route IDs
	 * HtmRow: 6
	 * HtmCell: 2
	 * Facet: true
	 */
	protected void _routeIds(List<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: route ID North
	 * HtmRow: 6
	 * HtmCell: 2
	 * Facet: true
	 */
	protected void _routeIdNorth(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: route ID East
	 * HtmRow: 6
	 * HtmCell: 3
	 * Facet: true
	 */
	protected void _routeIdEast(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Facet: true
	 * DisplayName: TrafficFlowObserveds
	 * Description: The related TrafficFlowObserved entities
	 */
	protected void _trafficFlowObservedIds(List<String> w) {
	}

	/**
	 * Ignore: true
	 */
	protected void _trafficFlowObservedSearch(Promise<SearchList<TrafficFlowObserved>> promise) {
		SearchList<TrafficFlowObserved> l = new SearchList<>();
		if(entityId != null) {
			l.setC(TrafficFlowObserved.class);
			l.q("*:*");
			l.rows(100);
			l.fq(String.format("customTrafficLightId_docvalues_string:%s", entityId));
			l.setStore(true);
		}
		promise.complete(l);
	}

	/**
	 * Ignore: true
	 */
	protected void _trafficFlowObserveds(List<TrafficFlowObserved> l) {
//		l.addAll(trafficFlowObservedSearch.getList());
//		l.forEach(o -> {
//			if(routeIdNorth != null && routeIdNorth.equals(o.getCustomRouteId()))
//				setTrafficFlowObservedNorth_(o);
//			if(routeIdEast != null && routeIdEast.equals(o.getCustomRouteId()))
//				setTrafficFlowObservedEast_(o);
//			trafficFlowObservedIds.add(o.getId());
//		});
	}

	/**
	 * Ignore: true
	 */
	protected void _trafficFlowObservedNorth_(Wrap<TrafficFlowObserved> w) {
	}

	/**
	 * Ignore: true
	 */
	protected void _trafficFlowObservedEast_(Wrap<TrafficFlowObserved> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 7
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: Average vehicle/min from WEST to EAST
	 * Description: 
	 * Min: 1
	 * Max: 30
	 */
	protected void _paramAvgVehiclePerMinFromWestToEast(Wrap<BigDecimal> w) {
		if(trafficFlowObservedEast_ != null)
			w.o(trafficFlowObservedEast_.getCustomAverageVehiclesPerMinute());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 7
	 * HtmCell: 2
	 * Facet: true
	 * DisplayName: Average vehicle/min from SOUTH to NORTH
	 * Description: 
	 * Min: 1
	 * Max: 30
	 */
	protected void _paramAvgVehiclePerMinFromSouthToNorth(Wrap<BigDecimal> w) {
		if(trafficFlowObservedNorth_ != null)
			w.o(trafficFlowObservedNorth_.getCustomAverageVehiclesPerMinute());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 7
	 * HtmCell: 3
	 * Facet: true
	 * DisplayName: Demand scaling factor (multiplies all vehicle demands)
	 * Description: 
	 * Min: 1
	 * Max: 2
	 * Default: 1
	 */
	protected void _paramVehicleDemandScalingFactor(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 8
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: Average pedestrian/min from WEST to EAST
	 * Description: 
	 * Min: 1
	 * Max: 30
	 * Default: 5
	 */
	protected void _paramAvgPedestrianPerMinFromWestToEast(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 8
	 * HtmCell: 2
	 * Facet: true
	 * DisplayName: Average pedestrian/min from WEST to EAST
	 * Description: 
	 * Min: 1
	 * Max: 30
	 * Default: 5
	 */
	protected void _paramAvgPedestrianPerMinFromSouthToNorth(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 8
	 * HtmCell: 3
	 * Facet: true
	 * DisplayName: Demand scaling factor (multiplies all pedestrian demands)
	 * Description: 
	 * Min: 1
	 * Max: 2
	 * Default: 1
	 */
	protected void _paramPedestrianDemandScalingFactor(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Facet: true
	 * DisplayName: demand scale
	 * Description: 
	 */
	protected void _paramDemandScale(List<BigDecimal> l) {
		l.add(paramVehicleDemandScalingFactor);
		l.add(paramPedestrianDemandScalingFactor);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 9
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: Min GREEN time for WEST-EAST traffic (sec)
	 * Description: 
	 * Min: 1
	 * Max: 50
	 */
	protected void _paramMinGreenTimeSecWestEast(Wrap<BigDecimal> w) {
		if(trafficFlowObservedEast_ != null)
			w.o(trafficFlowObservedEast_.getCustomMinGreenTime());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 9
	 * HtmCell: 2
	 * Facet: true
	 * DisplayName: Max GREEN time for WEST-EAST traffic (sec)
	 * Description: 
	 * Min: 1
	 * Max: 100
	 */
	protected void _paramMaxGreenTimeSecWestEast(Wrap<BigDecimal> w) {
		if(trafficFlowObservedEast_ != null)
			w.o(trafficFlowObservedEast_.getCustomMaxGreenTime());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 10
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: Min GREEN time for SOUTH-NORTH traffic (sec)
	 * Description: 
	 * Min: 1
	 * Max: 50
	 */
	protected void _paramMinGreenTimeSecSouthNorth(Wrap<BigDecimal> w) {
		if(trafficFlowObservedNorth_ != null)
			w.o(trafficFlowObservedNorth_.getCustomMinGreenTime());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 10
	 * HtmCell: 2
	 * Facet: true
	 * DisplayName: Max GREEN time for SOUTH-NORTH traffic (sec)
	 * Description: 
	 * Min: 1
	 * Max: 100
	 */
	protected void _paramMaxGreenTimeSecSouthNorth(Wrap<BigDecimal> w) {
		if(trafficFlowObservedNorth_ != null)
			w.o(trafficFlowObservedNorth_.getCustomMaxGreenTime());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 11
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: Pedestrian waiting time tolerance threshold for NORTH-SOUTH (sec)
	 * Description: 
	 * Min: 1
	 * Max: 60
	 * Default: 10
	 */
	protected void _paramPedestrianWaitThresholdSecNorthSouth(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 11
	 * HtmCell: 2
	 * Facet: true
	 * DisplayName: Pedestrian waiting time tolerance threshold for WEST-EAST (sec)
	 * Description: 
	 * Min: 1
	 * Max: 60
	 * Default: 10
	 */
	protected void _paramPedestrianWaitThresholdSecWestEast(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 12
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: Vehicle queue length threshold between low-high content for WEST-EAST
	 * Description: 
	 * Min: 1
	 * Max: 60
	 */
	protected void _paramVehicleQueueThresholdWestEast(Wrap<BigDecimal> w) {
		if(trafficFlowObservedEast_ != null)
			w.o(trafficFlowObservedEast_.getCustomQueueLengthThreshold());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 12
	 * HtmCell: 2
	 * Facet: true
	 * DisplayName: Vehicle queue length threshold between low-high content for SOUTH-NORTH
	 * Description: 
	 * Min: 1
	 * Max: 15
	 */
	protected void _paramVehicleQueueThresholdSouthNorth(Wrap<BigDecimal> w) {
		if(trafficFlowObservedNorth_ != null)
			w.o(trafficFlowObservedNorth_.getCustomQueueLengthThreshold());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 13
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: Pedestrian queue length threshold between low-high content for NORTH-SOUTH
	 * Description: 
	 * Min: 1
	 * Max: 15
	 * Default: 6
	 */
	protected void _paramPedestrianQueueThresholdNorthSouth(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 13
	 * HtmCell: 2
	 * Facet: true
	 * DisplayName: Pedestrian queue length threshold between low-high content for WEST-EAST
	 * Description: 
	 * Min: 1
	 * Max: 15
	 * Default: 6
	 */
	protected void _paramPedestrianQueueThresholdWestEast(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 14
	 * HtmCell: 2
	 * Facet: true
	 * DisplayName: Simulation time step (sec)
	 * Description: 
	 * Min: 0.5
	 * Max: 2
	 * Default: 1
	 */
	protected void _paramStepSize(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 14
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: time for each round of traffic simulation (sec)
	 * Description: Time duration of each simulated sample path. 
	 * Min: 500
	 * Max: 3600
	 * Default: 1000
	 */
	protected void _paramRunTime(Wrap<Integer> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 15
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: Number of simulation repetitions with same input (for statistical accuracy)
	 * Description: Number of repeats per round. 
	 * Min: 1
	 * Max: 30
	 * Default: 3
	 */
	protected void _paramItersPerPar(Wrap<Integer> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 15
	 * HtmCell: 2
	 * Facet: true
	 * DisplayName: Number of parameter update iterations before output
	 * Description: Total iterations to update performance. 
	 * Min: 1
	 * Max: 30
	 * Default: 5
	 */
	protected void _paramTotalIterNum(Wrap<Integer> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Relate: SimulationReport.smartTrafficLightKey
	 * HtmRow: 16
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: simulation reports
	 * Description: The generated reports for this smart traffic light
	 */
	protected void _reportKeys(List<Long> w) {
	}

	/**
	 * {@inheritDoc}
	 * DisplayName: TLS States paths
	 * Description: The paths to all TLS States files
	 */
	protected void _tlsStatesPaths(List<String> l) {
	}

	/**
	 * {@inheritDoc}
	 * DisplayName: additional file paths
	 * Description: The paths to all the additional SUMO config files
	 */
	protected void _additionalFilePaths(List<String> l) {
	}

	@Override
	protected void _objectTitle(Wrap<String> w) {
		StringBuilder b = new StringBuilder();
		Optional.ofNullable(smartTrafficLightName).ifPresent(s -> b.append(" Smart Traffic Light \"").append(s).append("\""));
		if(b.length() == 0)
			b.append(id);
		w.o(b.toString().trim());
	}

	@Override
	protected void _objectId(Wrap<String> w) {
		if(objectTitle != null) {
			w.o(toId(smartTrafficLightName));
		}
		else if(id != null){
			w.o(id.toString());
		}
	}
}
