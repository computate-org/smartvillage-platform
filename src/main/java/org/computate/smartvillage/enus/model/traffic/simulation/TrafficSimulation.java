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
package org.computate.smartvillage.enus.model.traffic.simulation;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Optional;

import org.computate.search.wrap.Wrap;
import org.computate.smartvillage.enus.model.base.BaseModel;
import org.computate.smartvillage.enus.model.traffic.fiware.crowdflowobserved.CrowdFlowObserved;
import org.computate.smartvillage.enus.model.traffic.fiware.trafficflowobserved.TrafficFlowObserved;
import org.computate.smartvillage.enus.model.traffic.simulation.TrafficSimulationGen;
import org.computate.vertx.search.list.SearchList;

import io.vertx.core.Promise;
import io.vertx.core.json.JsonArray;
import io.vertx.pgclient.data.Path;
import io.vertx.pgclient.data.Point;

/**
 * {@inheritDoc}
 * Fiware: true
 * 
 * Model: true
 * Api: true
 * Page: true
 * SuperPage.enUS: BaseModelPage
 * Indexed: true
 * SqlOrder: 2
 * Order: 8
 * Description: A SUMO Traffic Simulation
 * 
 * ApiTag.enUS: Traffic Simulation
 * ApiUri.enUS: /api/traffic-simulation
 * 
 * ApiMethod: Search
 * ApiMethod: GET
 * ApiMethod: PATCH
 * ApiMethod: POST
 * ApiMethod: PUTImport
 * 
 * ApiMethod: SearchPage
 * Page.SearchPage.enUS: TrafficSimulationPage
 * PageSuper.SearchPage.enUS: BaseModelPage
 * ApiUri.SearchPage.enUS: /traffic-simulation
 * 
 * ApiMethod: MapSearchPage
 * Page.MapSearchPage.enUS: TrafficSimulationMapPage
 * PageSuper.MapSearchPage.enUS: BaseModelPage
 * ApiUri.MapSearchPage.enUS: /traffic-simulation-map
 * 
 * Role.enUS: SuperAdmin
 * RoleRead.enUS: SiteAdmin
 * Saves: true
 * 
 * AName.enUS: a traffic simulation
 * Color: 2017-shaded-spruce
 * IconGroup: duotone
 * IconName: traffic-light-stop
 * Rows: 100
 */
public class TrafficSimulation extends TrafficSimulationGen<BaseModel> {

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Facet: true
	 * DisplayName: Start date and Time
	 * Description: The start date and time. 
	 */
	protected void _startDateTime(Wrap<ZonedDateTime> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: simulation name
	 * HtmRow: 3
	 * HtmCell: 1
	 * Facet: true
	 * Default: Veberöd intersection
	 * Required: true
	 */
	protected void _simulationName(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: entity ID
	 * Description: A unique ID for this Smart Data Model
	 * HtmRow: 3
	 * HtmCell: 2
	 * Facet: true
	 */
	protected void _entityId(Wrap<String> w) {}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Relate: SimulationReport.simulationKey
	 * Facet: true
	 * DisplayName: simulation reports
	 * Description: The generated reports for this simulation
	 * HtmRow: 4
	 * HtmCell: 1
	 */
	protected void _reportKeys(List<Long> w) {
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
	 * Ignore: true
	 */
	protected void _observedSearch(Promise<SearchList<BaseModel>> promise) {
		SearchList<BaseModel> l = new SearchList<>();
		if(entityId != null) {
			l.setC(BaseModel.class);
			l.q("*:*");
			l.fq(String.format("trafficSimulationId_docvalues_string:%s", entityId));
			l.fq(String.format(BaseModel.VAR_classSimpleName + "_docvalues_string:(%s OR %s)", TrafficFlowObserved.CLASS_SIMPLE_NAME, CrowdFlowObserved.CLASS_SIMPLE_NAME));
			l.setStore(true);
		}
		promise.complete(l);
	}

	/**
	 * {@inheritDoc}
	 * Location: true
	 * DocValues: true
	 */
	protected void _areaServed(List<Path> l) {
		observedSearch.getList().forEach(baseModel -> {
			if(baseModel instanceof TrafficFlowObserved) {
				Path path = new Path();
				((TrafficFlowObserved)baseModel).getAreaServed().getPoints().forEach(point -> {
					path.addPoint(point);
				});
				l.add(path);
			} else if(baseModel instanceof CrowdFlowObserved) {
				Path path = new Path();
				((CrowdFlowObserved)baseModel).getAreaServed().getPoints().forEach(point -> {
					path.addPoint(point);
				});
				path.addPoint(path.getPoints().get(0));
				l.add(path);
			}
		});
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: sumocfg path
	 * Facet: true
	 * Default: /usr/local/src/TLC/input/Veberod_intersection_pedestrian.sumocfg
	 */
	protected void _sumocfgPath(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: Floating Car Data file path
	 * Facet: true
	 * Default: /usr/local/src/TLC/output/veberod-fcd.xml
	 */
	protected void _fcdFilePath(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: net file path
	 * Facet: true
	 */
	protected void _netFilePath(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: start seconds
	 * Description: -b, --begin TIME Defines the begin time in seconds; The simulation starts at this time
	 * Facet: true
	 * Default: 0
	 */
	protected void _startSeconds(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: end seconds
	 * Description: -e, --end TIME Defines the end time in seconds; The simulation ends at this time
	 * Facet: true
	 * Default: 300
	 */
	protected void _endSeconds(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: step seconds
	 * Description: --step-length TIME Defines the step duration in seconds
	 * Facet: true
	 * Default: 0.1
	 */
	protected void _stepSeconds(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Facet: true
	 * DisplayName: Average vehicle/min from WEST to EAST
	 * Description: 
	 * Min: 1
	 * Max: 30
	 * Default: 10
	 */
	protected void _paramAvgVehiclePerMinFromWestToEast(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Facet: true
	 * DisplayName: Average vehicle/min from SOUTH to NORTH
	 * Description: 
	 * Min: 1
	 * Max: 30
	 * Default: 10
	 */
	protected void _paramAvgVehiclePerMinFromSouthToNorth(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
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
	 * Persist: true
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
	 * Persist: true
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
	 * Persist: true
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
	 * Persist: true
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
	 * Persist: true
	 * Facet: true
	 * DisplayName: Min GREEN time for WEST-EAST traffic (sec)
	 * Description: 
	 * Min: 1
	 * Max: 50
	 * Default: 20
	 */
	protected void _paramMinGreenTimeSecWestEast(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Facet: true
	 * DisplayName: Max GREEN time for WEST-EAST traffic (sec)
	 * Description: 
	 * Min: 1
	 * Max: 100
	 * Default: 30
	 */
	protected void _paramMaxGreenTimeSecWestEast(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Facet: true
	 * DisplayName: Min GREEN time for SOUTH-NORTH traffic (sec)
	 * Description: 
	 * Min: 1
	 * Max: 50
	 * Default: 10
	 */
	protected void _paramMinGreenTimeSecSouthNorth(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Facet: true
	 * DisplayName: Max GREEN time for SOUTH-NORTH traffic (sec)
	 * Description: 
	 * Min: 1
	 * Max: 100
	 * Default: 20
	 */
	protected void _paramMaxGreenTimeSecSouthNorth(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
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
	 * Persist: true
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
	 * Persist: true
	 * Facet: true
	 * DisplayName: Vehicle queue length threshold between low-high content for WEST-EAST
	 * Description: 
	 * Min: 1
	 * Max: 60
	 * Default: 8
	 */
	protected void _paramVehicleQueueThresholdWestEast(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDocentiteNomAffichage}
	 * DocValues: true
	 * Persist: true
	 * Facet: true
	 * DisplayName: Vehicle queue length threshold between low-high content for SOUTH-NORTH
	 * Description: 
	 * Min: 1
	 * Max: 15
	 * Default: 8
	 */
	protected void _paramVehicleQueueThresholdSouthNorth(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
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
	 * Persist: true
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

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Facet: true
	 */
	protected void _laneAreaDetectorIds(List<String> l) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Facet: true
	 */
	protected void _laneAreaDetectorLanes(Wrap<JsonArray> l) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Facet: true
	 */
	protected void _laneAreaDetectorPaths(List<String> l) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Facet: true
	 */
	protected void _e1DetectorIds(List<String> l) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Facet: true
	 */
	protected void _e1DetectorLanes(List<String> l) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Facet: true
	 */
	protected void _e1DetectorPaths(List<String> l) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Facet: true
	 */
	protected void _walkingAreaIds(List<String> l) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Facet: true
	 */
	protected void _walkingAreaLanes(JsonArray l) {
	}

	@Override
	protected void _objectTitle(Wrap<String> w) {
		StringBuilder b = new StringBuilder();
		Optional.ofNullable(simulationName).ifPresent(s -> b.append(" Simulation \"").append(s).append("\""));
		w.o(b.toString().trim());
	}

	@Override
	protected void _objectId(Wrap<String> w) {
		super._objectId(w);
	}
}
