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
package org.computate.smartvillage.enus.model.traffic.simulation.report;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.computate.search.wrap.Wrap;
import org.computate.smartvillage.enus.model.base.BaseModel;
import org.computate.smartvillage.enus.model.traffic.fiware.smarttrafficlight.SmartTrafficLight;
import org.computate.smartvillage.enus.model.traffic.simulation.TrafficSimulation;
import org.computate.smartvillage.enus.model.traffic.simulation.report.SimulationReportGen;
import org.computate.vertx.search.list.SearchList;

import io.vertx.core.Promise;
import io.vertx.core.json.JsonArray;
import io.vertx.pgclient.data.Path;
import io.vertx.pgclient.data.Point;

/**
 * {@inheritDoc}
 * Model: true
 * Api: true
 * Page: true
 * SuperPage.enUS: BaseModelPage
 * Indexed: true
 * SqlOrder: 3
 * Order: 9
 * 
 * ApiTag.enUS: SimulationReport
 * ApiUri.enUS: /api/simulation-report
 * 
 * ApiMethod.enUS: Search
 * ApiMethod: GET
 * ApiMethod: PATCH
 * ApiMethod: POST
 * ApiMethod: PUTImport
 * ApiMethod: PUTCopy
 * 
 * ApiMethod: PATCHRunSimulation
 * ApiUri.PATCHRunSimulation.enUS: /api/run-simulation-report
 * 
 * ApiMethod.enUS: SearchPage
 * Page.SearchPage.enUS: SimulationReportPage
 * PageSuper.SearchPage.enUS: BaseModelPage
 * ApiUri.SearchPage.enUS: /simulation-report
 * 
 * Role.enUS: SiteAdmin
 * 
 * AName.enUS: a simulation report
 * Color: 2017-shaded-spruce
 * IconGroup: duotone
 * IconName: file-chart-column
 * Rows: 100
 */
public class SimulationReport extends SimulationReportGen<BaseModel> {

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: report name
	 * HtmRow: 3
	 * HtmCell: 1
	 * Facet: true
	 */
	protected void _reportName(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: map location
	 * HtmRow: 3
	 * HtmCell: 2
	 * Facet: true
	 */
	protected void _location(Wrap<Point> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Relate: TrafficSimulation.reportKeys
	 * HtmRow: 4
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: traffic simulation
	 * Description: The traffic simulation for this report. 
	 */
	protected void _simulationKey(Wrap<Long> w) {
	}

	/**
	 * Ignore: true
	 */
	protected void _simulationSearch(Promise<SearchList<TrafficSimulation>> promise) {
		SearchList<TrafficSimulation> l = new SearchList<>();
		if(simulationKey != null) {
			l.setC(TrafficSimulation.class);
			l.q("*:*");
			l.fq(String.format("pk_docvalues_long:%s", simulationKey));
			l.setStore(true);
		}
		promise.complete(l);
	}

	/**
	 * Ignore: true
	 */
	protected void _simulation_(Wrap<TrafficSimulation> w) {
		w.o(simulationSearch.first());
	}

	/**
	 * {@inheritDoc}
	 * Location: true
	 * DocValues: true
	 */
	protected void _areaServed(List<Path> l) {
		if(simulation_ != null)
			l.addAll(simulation_.getAreaServed());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Relate: SmartTrafficLight.reportKeys
	 * HtmRow: 4
	 * HtmCell: 2
	 * Facet: true
	 * DisplayName: smart traffic light
	 * Description: The smart traffic light for this report. 
	 */
	protected void _smartTrafficLightKey(Wrap<Long> w) {
	}

	/**
	 * Ignore: true
	 */
	protected void _smartTrafficLightSearch(Promise<SearchList<SmartTrafficLight>> promise) {
		SearchList<SmartTrafficLight> l = new SearchList<>();
		if(smartTrafficLightKey != null) {
			l.setC(SmartTrafficLight.class);
			l.q("*:*");
			l.fq(String.format("pk_docvalues_long:%s", smartTrafficLightKey));
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
	 * DisplayName: simulation name
	 * Facet: true
	 */
	protected void _simulationName(Wrap<String> w) {
		if(simulation_ != null)
			w.o(simulation_.getSimulationName());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: smart traffic light name
	 * Facet: true
	 */
	protected void _smartTrafficLightId(Wrap<String> w) {
		if(smartTrafficLight_ != null)
			w.o(smartTrafficLight_.getEntityId());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: smart traffic light name
	 * Facet: true
	 */
	protected void _smartTrafficLightName(Wrap<String> w) {
		if(smartTrafficLight_ != null)
			w.o(smartTrafficLight_.getSmartTrafficLightName());
	}

	@Override
	protected void _objectTitle(Wrap<String> w) {
		if(simulationName != null)
			w.o(String.format("%s: %s", simulationName, reportName == null ? String.format("report %s", pk) : reportName));
		else if(smartTrafficLightName != null)
			w.o(String.format("%s: %s", smartTrafficLightName, reportName == null ? String.format("report %s", pk) : reportName));
	}

	@Override
	protected void _objectId(Wrap<String> w) {
		super._objectId(w);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRowTitle: Vehicle traffic demand
	 * HtmRowVertical: true
	 * HtmRow: 5
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: Average vehicle/min from WEST to EAST
	 * Description: [1, 30] corresponding to 1st value in list
	 */
	protected void _paramAvgVehiclePerMinFromWestToEast(Wrap<BigDecimal> w) {
		if(simulation_ != null)
			w.o(simulation_.getParamAvgVehiclePerMinFromWestToEast());
		else if(smartTrafficLight_ != null)
			w.o(smartTrafficLight_.getParamAvgVehiclePerMinFromWestToEast());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 5
	 * HtmCell: 2
	 * Facet: true
	 * DisplayName: Average vehicle/min from SOUTH to NORTH
	 * Description: [1, 30] corresponding to 2nd value in list
	 */
	protected void _paramAvgVehiclePerMinFromSouthToNorth(Wrap<BigDecimal> w) {
		if(simulation_ != null)
			w.o(simulation_.getParamAvgVehiclePerMinFromSouthToNorth());
		else if(smartTrafficLight_ != null)
			w.o(smartTrafficLight_.getParamAvgVehiclePerMinFromSouthToNorth());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 5
	 * HtmCell: 3
	 * Facet: true
	 * DisplayName: Demand scaling factor (multiplies all vehicle demands)
	 * Description: [1, 2] corresponding to "demand scale"
	 */
	protected void _paramVehicleDemandScalingFactor(Wrap<BigDecimal> w) {
		if(simulation_ != null)
			w.o(simulation_.getParamVehicleDemandScalingFactor());
		else if(smartTrafficLight_ != null)
			w.o(smartTrafficLight_.getParamVehicleDemandScalingFactor());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRowTitle: Pedestrian traffic demand
	 * HtmRow: 6
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: Average pedestrian/min from WEST to EAST
	 * Description: [1, 30] corresponding to 3rd value in list
	 */
	protected void _paramAvgPedestrianPerMinFromWestToEast(Wrap<BigDecimal> w) {
		if(simulation_ != null)
			w.o(simulation_.getParamAvgPedestrianPerMinFromWestToEast());
		else if(smartTrafficLight_ != null)
			w.o(smartTrafficLight_.getParamAvgPedestrianPerMinFromWestToEast());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 6
	 * HtmCell: 2
	 * Facet: true
	 * DisplayName: Average pedestrian/min from WEST to EAST
	 * Description: [1, 30] corresponding to 4th value in list
	 */
	protected void _paramAvgPedestrianPerMinFromSouthToNorth(Wrap<BigDecimal> w) {
		if(simulation_ != null)
			w.o(simulation_.getParamAvgPedestrianPerMinFromSouthToNorth());
		else if(smartTrafficLight_ != null)
			w.o(smartTrafficLight_.getParamAvgPedestrianPerMinFromSouthToNorth());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 6
	 * HtmCell: 3
	 * Facet: true
	 * DisplayName: Demand scaling factor (multiplies all pedestrian demands)
	 * Description: [1, 2] corresponding to "demand scale"
	 */
	protected void _paramPedestrianDemandScalingFactor(Wrap<BigDecimal> w) {
		if(simulation_ != null)
			w.o(simulation_.getParamPedestrianDemandScalingFactor());
		else if(smartTrafficLight_ != null)
			w.o(smartTrafficLight_.getParamPedestrianDemandScalingFactor());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Facet: true
	 * DisplayName: traffic demand
	 * Description: 
	 */
	protected void _paramLam(List<BigDecimal> l) {
		l.addAll(Arrays.asList(
				paramAvgVehiclePerMinFromWestToEast
				, paramAvgVehiclePerMinFromSouthToNorth
				, paramAvgPedestrianPerMinFromWestToEast
				, paramAvgPedestrianPerMinFromSouthToNorth
				));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRowTitle: Initial Traffic Light Control parameters
	 * HtmRow: 7
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: Min GREEN time for WEST-EAST traffic (sec)
	 * Description: [1, 50]
	 */
	protected void _paramMinGreenTimeSecWestEast(Wrap<BigDecimal> w) {
		if(simulation_ != null)
			w.o(simulation_.getParamMinGreenTimeSecWestEast());
		else if(smartTrafficLight_ != null)
			w.o(smartTrafficLight_.getParamMinGreenTimeSecWestEast());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 7
	 * HtmCell: 2
	 * Facet: true
	 * DisplayName: Max GREEN time for WEST-EAST traffic (sec)
	 * Description: [1, 100], also greater than min value
	 */
	protected void _paramMaxGreenTimeSecWestEast(Wrap<BigDecimal> w) {
		if(simulation_ != null)
			w.o(simulation_.getParamMaxGreenTimeSecWestEast());
		else if(smartTrafficLight_ != null)
			w.o(smartTrafficLight_.getParamMaxGreenTimeSecWestEast());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 7
	 * HtmCell: 3
	 * Facet: true
	 * DisplayName: Min GREEN time for SOUTH-NORTH traffic (sec)
	 * Description: [1, 50]
	 */
	protected void _paramMinGreenTimeSecSouthNorth(Wrap<BigDecimal> w) {
		if(simulation_ != null)
			w.o(simulation_.getParamMinGreenTimeSecSouthNorth());
		else if(smartTrafficLight_ != null)
			w.o(smartTrafficLight_.getParamMinGreenTimeSecSouthNorth());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 7
	 * HtmCell: 4
	 * Facet: true
	 * DisplayName: Max GREEN time for SOUTH-NORTH traffic (sec)
	 * Description: [1, 100], also greater than min value
	 */
	protected void _paramMaxGreenTimeSecSouthNorth(Wrap<BigDecimal> w) {
		if(simulation_ != null)
			w.o(simulation_.getParamMaxGreenTimeSecSouthNorth());
		else if(smartTrafficLight_ != null)
			w.o(smartTrafficLight_.getParamMaxGreenTimeSecSouthNorth());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 7
	 * HtmCell: 5
	 * Facet: true
	 * DisplayName: Pedestrian waiting time tolerance threshold for NORTH-SOUTH (sec)
	 * Description: [1, 60]
	 */
	protected void _paramPedestrianWaitThresholdSecNorthSouth(Wrap<BigDecimal> w) {
		if(simulation_ != null)
			w.o(simulation_.getParamPedestrianWaitThresholdSecNorthSouth());
		else if(smartTrafficLight_ != null)
			w.o(smartTrafficLight_.getParamPedestrianWaitThresholdSecNorthSouth());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 7
	 * HtmCell: 6
	 * Facet: true
	 * DisplayName: Pedestrian waiting time tolerance threshold for WEST-EAST (sec)
	 * Description: [1, 60]
	 */
	protected void _paramPedestrianWaitThresholdSecWestEast(Wrap<BigDecimal> w) {
		if(simulation_ != null)
			w.o(simulation_.getParamPedestrianWaitThresholdSecWestEast());
		else if(smartTrafficLight_ != null)
			w.o(smartTrafficLight_.getParamPedestrianWaitThresholdSecWestEast());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 7
	 * HtmCell: 7
	 * Facet: true
	 * DisplayName: Vehicle queue length threshold between low-high content for WEST-EAST
	 * Description: [1, 15]
	 */
	protected void _paramVehicleQueueThresholdWestEast(Wrap<BigDecimal> w) {
		if(simulation_ != null)
			w.o(simulation_.getParamVehicleQueueThresholdWestEast());
		else if(smartTrafficLight_ != null)
			w.o(smartTrafficLight_.getParamVehicleQueueThresholdWestEast());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 7
	 * HtmCell: 8
	 * Facet: true
	 * DisplayName: Vehicle queue length threshold between low-high content for SOUTH-NORTH
	 * Description: [1, 15]
	 */
	protected void _paramVehicleQueueThresholdSouthNorth(Wrap<BigDecimal> w) {
		if(simulation_ != null)
			w.o(simulation_.getParamVehicleQueueThresholdSouthNorth());
		else if(smartTrafficLight_ != null)
			w.o(smartTrafficLight_.getParamVehicleQueueThresholdSouthNorth());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 7
	 * HtmCell: 9
	 * Facet: true
	 * DisplayName: Pedestrian queue length threshold between low-high content for NORTH-SOUTH
	 * Description: [1, 15]
	 */
	protected void _paramPedestrianQueueThresholdNorthSouth(Wrap<BigDecimal> w) {
		if(simulation_ != null)
			w.o(simulation_.getParamPedestrianQueueThresholdNorthSouth());
		else if(smartTrafficLight_ != null)
			w.o(smartTrafficLight_.getParamPedestrianQueueThresholdNorthSouth());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 7
	 * HtmCell: 10
	 * Facet: true
	 * DisplayName: Pedestrian queue length threshold between low-high content for WEST-EAST
	 * Description: [1, 15]
	 */
	protected void _paramPedestrianQueueThresholdWestEast(Wrap<BigDecimal> w) {
		if(simulation_ != null)
			w.o(simulation_.getParamPedestrianQueueThresholdWestEast());
		else if(smartTrafficLight_ != null)
			w.o(smartTrafficLight_.getParamPedestrianQueueThresholdWestEast());
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
		if(simulation_ != null)
			l.addAll(simulation_.getParamDemandScale());
		else if(smartTrafficLight_ != null)
			l.addAll(smartTrafficLight_.getParamDemandScale());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Facet: true
	 * DisplayName: initial params
	 * Description: 
	 */
	protected void _paramInitialPar(List<BigDecimal> l) {
		l.addAll(Arrays.asList(
				paramMinGreenTimeSecWestEast
				, paramMaxGreenTimeSecWestEast
				, paramMinGreenTimeSecSouthNorth
				, paramMaxGreenTimeSecSouthNorth
				, paramPedestrianWaitThresholdSecNorthSouth
				, paramPedestrianWaitThresholdSecWestEast
				, paramVehicleQueueThresholdWestEast
				, paramVehicleQueueThresholdSouthNorth
				, paramPedestrianQueueThresholdNorthSouth
				, paramPedestrianQueueThresholdWestEast
				));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRowTitle: Time and iterations
	 * HtmRow: 12
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: Simulation time step (sec)
	 * Description: [0.5, 2.0]
	 */
	protected void _paramStepSize(Wrap<BigDecimal> w) {
		if(simulation_ != null)
			w.o(simulation_.getParamStepSize());
		else if(smartTrafficLight_ != null)
			w.o(smartTrafficLight_.getParamStepSize());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 12
	 * HtmCell: 2
	 * Facet: true
	 * DisplayName: time for each round of traffic simulation (sec)
	 * Description: [500, 3600]
	 */
	protected void _paramRunTime(Wrap<Integer> w) {
		if(simulation_ != null)
			w.o(simulation_.getParamRunTime());
		else if(smartTrafficLight_ != null)
			w.o(smartTrafficLight_.getParamRunTime());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 12
	 * HtmCell: 3
	 * Facet: true
	 * DisplayName: Number of simulation repetitions with same input (for statistical accuracy)
	 * Description: [1, 30]
	 */
	protected void _paramItersPerPar(Wrap<Integer> w) {
		if(simulation_ != null)
			w.o(simulation_.getParamItersPerPar());
		else if(smartTrafficLight_ != null)
			w.o(smartTrafficLight_.getParamItersPerPar());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 12
	 * HtmCell: 4
	 * Facet: true
	 * DisplayName: Number of parameter update iterations before output
	 * Description: [1, 30]
	 */
	protected void _paramTotalIterNum(Wrap<Integer> w) {
		if(simulation_ != null)
			w.o(simulation_.getParamTotalIterNum());
		else if(smartTrafficLight_ != null)
			w.o(smartTrafficLight_.getParamTotalIterNum());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Facet: true
	 * DisplayName: updated parameters
	 * Description: the resulting updated parameters after a simulation
	 */
	protected void _updatedParameters(Wrap<JsonArray> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRowTitle: Updated parameters
	 * HtmRowHeaderExpression: iter {{numberAdd @index 1}}
	 * HtmRow: 14
	 * HtmCell: 1
	 * DisplayName: Min GREEN time for WEST-EAST traffic (sec)
	 * Description: 
	 */
	protected void _updatedParameters1(Wrap<JsonArray> w) {
		if(updatedParameters != null && updatedParameters.size() == 10) {
			w.o(updatedParameters.getJsonArray(0));
		}
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 14
	 * HtmCell: 2
	 * DisplayName: Max GREEN time for WEST-EAST traffic (sec)
	 * Description: 
	 */
	protected void _updatedParameters2(Wrap<JsonArray> w) {
		if(updatedParameters != null && updatedParameters.size() == 10) {
			w.o(updatedParameters.getJsonArray(1));
		}
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 14
	 * HtmCell: 3
	 * DisplayName: Min GREEN time for SOUTH-NORTH traffic (sec)
	 * Description: 
	 */
	protected void _updatedParameters3(Wrap<JsonArray> w) {
		if(updatedParameters != null && updatedParameters.size() == 10) {
			w.o(updatedParameters.getJsonArray(2));
		}
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 14
	 * HtmCell: 4
	 * DisplayName: Max GREEN time for SOUTH-NORTH traffic (sec)
	 * Description: 
	 */
	protected void _updatedParameters4(Wrap<JsonArray> w) {
		if(updatedParameters != null && updatedParameters.size() == 10) {
			w.o(updatedParameters.getJsonArray(3));
		}
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 14
	 * HtmCell: 5
	 * DisplayName: Pedestrian waiting time tolerance threshold for NORTH-SOUTH (sec)
	 * Description: 
	 */
	protected void _updatedParameters5(Wrap<JsonArray> w) {
		if(updatedParameters != null && updatedParameters.size() == 10) {
			w.o(updatedParameters.getJsonArray(4));
		}
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 14
	 * HtmCell: 6
	 * DisplayName: Pedestrian waiting time tolerance threshold for WEST-EAST (sec)
	 * Description: 
	 */
	protected void _updatedParameters6(Wrap<JsonArray> w) {
		if(updatedParameters != null && updatedParameters.size() == 10) {
			w.o(updatedParameters.getJsonArray(5));
		}
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 14
	 * HtmCell: 7
	 * DisplayName: Vehicle queue length threshold between low-high content for WEST-EAST
	 * Description: 
	 */
	protected void _updatedParameters7(Wrap<JsonArray> w) {
		if(updatedParameters != null && updatedParameters.size() == 10) {
			w.o(updatedParameters.getJsonArray(6));
		}
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 14
	 * HtmCell: 8
	 * DisplayName: Vehicle queue length threshold between low-high content for SOUTH-NORTH
	 * Description: 
	 */
	protected void _updatedParameters8(Wrap<JsonArray> w) {
		if(updatedParameters != null && updatedParameters.size() == 10) {
			w.o(updatedParameters.getJsonArray(7));
		}
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 14
	 * HtmCell: 9
	 * DisplayName: Pedestrian queue length threshold between low-high content for NORTH-SOUTH
	 * Description: 
	 */
	protected void _updatedParameters9(Wrap<JsonArray> w) {
		if(updatedParameters != null && updatedParameters.size() == 10) {
			w.o(updatedParameters.getJsonArray(8));
		}
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 14
	 * HtmCell: 10
	 * DisplayName: Pedestrian queue length threshold between low-high content for WEST-EAST
	 * Description: 
	 */
	protected void _updatedParameters10(Wrap<JsonArray> w) {
		if(updatedParameters != null && updatedParameters.size() == 10) {
			w.o(updatedParameters.getJsonArray(9));
		}
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Facet: true
	 * DisplayName: updated performance
	 * Description: the resulting updated performance after a simulation
	 */
	protected void _updatedPerformance(Wrap<JsonArray> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Facet: true
	 * DisplayName: Average queue length
	 */
	protected void _averageQueueLength(Wrap<JsonArray> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRowTitle: Updated performance
	 * HtmRowHeaderExpression: iter {{numberAdd @index 1}}
	 * HtmRow: 16
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: Average waiting time for WEST-EAST vehicles (sec)
	 * Description: 
	 */
	protected void _updatedPerformanceWaitWestEastVehicleSec(Wrap<JsonArray> w) {
		if(updatedPerformance != null && updatedPerformance.size() == 9) {
			w.o(updatedPerformance.getJsonArray(0));
		}
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 16
	 * HtmCell: 2
	 * Facet: true
	 * DisplayName: Average waiting time for SOUTH-NORTH vehicles (sec)
	 * Description: 
	 */
	protected void _updatedPerformanceWaitSouthNorthVehicleSec(Wrap<JsonArray> w) {
		if(updatedPerformance != null && updatedPerformance.size() == 9) {
			w.o(updatedPerformance.getJsonArray(1));
		}
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 16
	 * HtmCell: 3
	 * Facet: true
	 * DisplayName: Average waiting time for all vehicles (sec)
	 * Description: 
	 */
	protected void _updatedPerformanceWaitAllVehicleSec(Wrap<JsonArray> w) {
		if(updatedPerformance != null && updatedPerformance.size() == 9) {
			w.o(updatedPerformance.getJsonArray(2));
		}
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 16
	 * HtmCell: 4
	 * Facet: true
	 * DisplayName: Average waiting time for pedestrians (sec)
	 * Description: 
	 */
	protected void _updatedPerformanceWaitAllPedestrianSec(Wrap<JsonArray> w) {
		if(updatedPerformance != null && updatedPerformance.size() == 9) {
			w.o(updatedPerformance.getJsonArray(3));
		}
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 16
	 * HtmCell: 5
	 * Facet: true
	 * DisplayName: Average waiting time for vehicles and pedestrians (sec)
	 * Description: 
	 */
	protected void _updatedPerformanceWaitAllVehiclePedestrianSec(Wrap<JsonArray> w) {
		if(updatedPerformance != null && updatedPerformance.size() == 9) {
			w.o(updatedPerformance.getJsonArray(4));
		}
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRowTitle: Average queue length
	 * HtmRowHeaderExpression: iter {{numberAdd @index 1}}
	 * HtmRow: 17
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: Average queue length for WEST-EAST vehicle
	 * Description: 
	 */
	protected void _avgQueueLengthWestEastVehicle(Wrap<JsonArray> w) {
		if(updatedPerformance != null && updatedPerformance.size() == 9) {
			w.o(updatedPerformance.getJsonArray(5));
		}
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 17
	 * HtmCell: 2
	 * Facet: true
	 * DisplayName: Average queue length for SOUTH-NORTH vehicle
	 * Description: 
	 */
	protected void _avgQueueLengthSouthNorthVehicle(Wrap<JsonArray> w) {
		if(updatedPerformance != null && updatedPerformance.size() == 9) {
			w.o(updatedPerformance.getJsonArray(6));
		}
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 17
	 * HtmCell: 3
	 * Facet: true
	 * DisplayName: Average queue length for NORTH-SOUTH pedestrian
	 * Description: 
	 */
	protected void _avgQueueLengthNorthSouthPedestrian(Wrap<JsonArray> w) {
		if(updatedPerformance != null && updatedPerformance.size() == 9) {
			w.o(updatedPerformance.getJsonArray(7));
		}
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 17
	 * HtmCell: 4
	 * Facet: true
	 * DisplayName: Average queue length for WEST-EAST pedestrian
	 * Description: 
	 */
	protected void _avgQueueLengthWestEastPedestrian(Wrap<JsonArray> w) {
		if(updatedPerformance != null && updatedPerformance.size() == 9) {
			w.o(updatedPerformance.getJsonArray(8));
		}
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRowTitle: Report status and actions
	 * HtmRow: 18
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: report status
	 * Description: The current status of the simulation report. 
	 * Val.Stop.enUS:Stop
	 * Val.Stopped.enUS:Stopped
	 * Val.Completed.enUS:Completed
	 * Val.Run.enUS:Run
	 * Val.Running.enUS:Running
	 * Val.Error.enUS:Error
	 */
	protected void _reportStatus(Wrap<String> w) {
		w.o(reportStatusStopped_enUS);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 18
	 * HtmCell: 2
	 * Facet: true
	 * DisplayName: report progress
	 * Description: The percent progress of the simulation report. 
	 * Modify: false
	 */
	protected void _reportProgress(Wrap<Integer> w) {
		w.o(0);
	}
}
