package org.computate.smartvillageview.enus.model.traffic.simulation.report;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.computate.search.wrap.Wrap;
import org.computate.smartvillageview.enus.model.base.BaseModel;
import org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation;
import org.computate.vertx.search.list.SearchList;

import io.vertx.core.Promise;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

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
	 * Relate: TrafficSimulation.reportKeys
	 * HtmRow: 3
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
	 * DisplayName: report name
	 * HtmRow: 3
	 * HtmCell: 2
	 * Facet: true
	 */
	protected void _reportName(Wrap<String> w) {
	}

	@Override
	protected void _objectTitle(Wrap<String> w) {
		w.o(String.format("%s: %s", simulationName, reportName == null ? String.format("report %s", pk) : reportName));
	}

	@Override
	protected void _objectId(Wrap<String> w) {
		super._objectId(w);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 4
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: Average vehicle/min from WEST to EAST
	 * Description: 
	 */
	protected void _paramAvgVehiclePerMinFromWestToEast(Wrap<BigDecimal> w) {
		if(simulation_ != null)
			w.o(simulation_.getParamAvgVehiclePerMinFromWestToEast());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 4
	 * HtmCell: 2
	 * Facet: true
	 * DisplayName: Average vehicle/min from SOUTH to NORTH
	 * Description: 
	 */
	protected void _paramAvgVehiclePerMinFromSouthToNorth(Wrap<BigDecimal> w) {
		if(simulation_ != null)
			w.o(simulation_.getParamAvgVehiclePerMinFromSouthToNorth());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 4
	 * HtmCell: 3
	 * Facet: true
	 * DisplayName: Demand scaling factor (multiplies all vehicle demands)
	 * Description: 
	 */
	protected void _paramVehicleDemandScalingFactor(Wrap<BigDecimal> w) {
		if(simulation_ != null)
			w.o(simulation_.getParamVehicleDemandScalingFactor());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 5
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: Average pedestrian/min from WEST to EAST
	 * Description: 
	 */
	protected void _paramAvgPedestrianPerMinFromWestToEast(Wrap<BigDecimal> w) {
		if(simulation_ != null)
			w.o(simulation_.getParamAvgPedestrianPerMinFromWestToEast());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 5
	 * HtmCell: 2
	 * Facet: true
	 * DisplayName: Average pedestrian/min from WEST to EAST
	 * Description: 
	 */
	protected void _paramAvgPedestrianPerMinFromSouthToNorth(Wrap<BigDecimal> w) {
		if(simulation_ != null)
			w.o(simulation_.getParamAvgPedestrianPerMinFromSouthToNorth());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 5
	 * HtmCell: 3
	 * Facet: true
	 * DisplayName: Demand scaling factor (multiplies all pedestrian demands)
	 * Description: 
	 */
	protected void _paramPedestrianDemandScalingFactor(Wrap<BigDecimal> w) {
		if(simulation_ != null)
			w.o(simulation_.getParamPedestrianDemandScalingFactor());
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
	 * HtmRow: 6
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: Min GREEN time for WEST-EAST traffic (sec)
	 * Description: 
	 */
	protected void _paramMinGreenTimeSecWestEast(Wrap<BigDecimal> w) {
		w.o(new BigDecimal(10));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 6
	 * HtmCell: 2
	 * Facet: true
	 * DisplayName: Max GREEN time for WEST-EAST traffic (sec)
	 * Description: 
	 */
	protected void _paramMaxGreenTimeSecWestEast(Wrap<BigDecimal> w) {
		w.o(new BigDecimal(20));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 7
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: Min GREEN time for SOUTH-NORTH traffic (sec)
	 * Description: 
	 */
	protected void _paramMinGreenTimeSecSouthNorth(Wrap<BigDecimal> w) {
		w.o(new BigDecimal(30));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 7
	 * HtmCell: 2
	 * Facet: true
	 * DisplayName: Max GREEN time for SOUTH-NORTH traffic (sec)
	 * Description: 
	 */
	protected void _paramMaxGreenTimeSecSouthNorth(Wrap<BigDecimal> w) {
		w.o(new BigDecimal(50));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 8
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: Pedestrian waiting time tolerance threshold for NORTH-SOUTH (sec)
	 * Description: 
	 */
	protected void _paramPedestrianWaitThresholdSecNorthSouth(Wrap<BigDecimal> w) {
		w.o(new BigDecimal(10));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 8
	 * HtmCell: 2
	 * Facet: true
	 * DisplayName: Pedestrian waiting time tolerance threshold for WEST-EAST (sec)
	 * Description: 
	 */
	protected void _paramPedestrianWaitThresholdSecWestEast(Wrap<BigDecimal> w) {
		w.o(new BigDecimal(10));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 9
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: Vehicle queue length threshold between low-high content for WEST-EAST
	 * Description: 
	 */
	protected void _paramVehicleQueueThresholdWestEast(Wrap<BigDecimal> w) {
		w.o(new BigDecimal(8));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 9
	 * HtmCell: 2
	 * Facet: true
	 * DisplayName: Vehicle queue length threshold between low-high content for SOUTH-NORTH
	 * Description: 
	 */
	protected void _paramVehicleQueueThresholdSouthNorth(Wrap<BigDecimal> w) {
		w.o(new BigDecimal(8));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 10
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: Pedestrian queue length threshold between low-high content for NORTH-SOUTH
	 * Description: 
	 */
	protected void _paramPedestrianQueueThresholdNorthSouth(Wrap<BigDecimal> w) {
		w.o(new BigDecimal(5));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 10
	 * HtmCell: 2
	 * Facet: true
	 * DisplayName: Pedestrian queue length threshold between low-high content for WEST-EAST
	 * Description: 
	 */
	protected void _paramPedestrianQueueThresholdWestEast(Wrap<BigDecimal> w) {
		w.o(new BigDecimal(6));
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
		if(simulation_ != null) {
			l.addAll(simulation_.getParamDemandScale());
		}
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
	 * HtmRow: 11
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: Simulation time step (sec)
	 * Description: 
	 */
	protected void _paramStepSize(Wrap<BigDecimal> w) {
		if(simulation_ != null)
			w.o(simulation_.getParamStepSize());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 11
	 * HtmCell: 2
	 * Facet: true
	 * DisplayName: time for each round of traffic simulation (sec)
	 * Description: Time duration of each simulated sample path. 
	 */
	protected void _paramRunTime(Wrap<Integer> w) {
		if(simulation_ != null)
			w.o(simulation_.getParamRunTime());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 12
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: Number of simulation repetitions with same input (for statistical accuracy)
	 * Description: Number of repeats per round. 
	 */
	protected void _paramItersPerPar(Wrap<Integer> w) {
		if(simulation_ != null)
			w.o(simulation_.getParamItersPerPar());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 12
	 * HtmCell: 2
	 * Facet: true
	 * DisplayName: Number of parameter update iterations before output
	 * Description: Total iterations to update performance. 
	 */
	protected void _paramTotalIterNum(Wrap<Integer> w) {
		if(simulation_ != null)
			w.o(simulation_.getParamTotalIterNum());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 12
	 * HtmCell: 3
	 * Facet: true
	 * DisplayName: report status
	 * Description: The current status of the simulation report. 
	 * Val.Stopped.enUS: Stopped
	 * Val.Completed.enUS: Completed
	 * Val.Running.enUS: Running
	 * Val.Error.enUS: Error
	 */
	protected void _reportStatus(Wrap<String> w) {
		w.o(reportStatusStopped_enUS);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 12
	 * HtmCell: 3
	 * Facet: true
	 * DisplayName: report progress
	 * Description: The percent progress of the simulation report. 
	 */
	protected void _reportProgress(Wrap<Integer> w) {
		w.o(0);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 13
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: updated parameters
	 * Description: the resulting updated parameters after a simulation
	 */
	protected void _updatedParameters(Wrap<JsonArray> w) {
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
	 * HtmRow: 15
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: Average waiting time for WEST-EAST vehicles (sec)
	 * Description: 
	 */
	protected void _updatedPerformanceWaitWestEastVehicleSec(Wrap<JsonArray> w) {
		if(updatedPerformance != null && updatedPerformance.size() == 5) {
			w.o(updatedPerformance.getJsonArray(0));
		}
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 16
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: Average waiting time for SOUTH-NORTH vehicles (sec)
	 * Description: 
	 */
	protected void _updatedPerformanceWaitSouthNorthVehicleSec(Wrap<JsonArray> w) {
		if(updatedPerformance != null && updatedPerformance.size() == 5) {
			w.o(updatedPerformance.getJsonArray(1));
		}
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 17
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: Average waiting time for all vehicles (sec)
	 * Description: 
	 */
	protected void _updatedPerformanceWaitAllVehicleSec(Wrap<JsonArray> w) {
		if(updatedPerformance != null && updatedPerformance.size() == 5) {
			w.o(updatedPerformance.getJsonArray(2));
		}
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 18
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: Average waiting time for pedestrians (sec)
	 * Description: 
	 */
	protected void _updatedPerformanceWaitAllPedestrianSec(Wrap<JsonArray> w) {
		if(updatedPerformance != null && updatedPerformance.size() == 5) {
			w.o(updatedPerformance.getJsonArray(3));
		}
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * HtmRow: 18
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: Average waiting time for vehicles and pedestrians (sec)
	 * Description: 
	 */
	protected void _updatedPerformanceWaitAllVehiclePedestrianSec(Wrap<JsonArray> w) {
		if(updatedPerformance != null && updatedPerformance.size() == 5) {
			w.o(updatedPerformance.getJsonArray(4));
		}
	}

	/**
	 * Description: Prepares a message record to be put on the event bus
	 */
	public JsonObject patchSimulationReportFuture(JsonObject exchangeBody) {

		JsonObject params = new JsonObject();
		params.put("body", exchangeBody);
		params.put("cookie", new JsonObject());
		params.put("header", new JsonObject());
		params.put("form", new JsonObject());
		params.put("path", new JsonObject());
		JsonObject query = new JsonObject();
		query.put("softCommit", true);
		query.put("fq", new JsonArray().add(String.format("pk:%s", exchangeBody.getString("pk"))));
		params.put("query", query);
		JsonObject context = new JsonObject().put("params", params);
		JsonObject json = new JsonObject().put("context", context);
		return json;
	}
}
