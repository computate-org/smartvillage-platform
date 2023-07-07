package org.computate.smartvillageview.enus.model.traffic.simulation;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.computate.search.wrap.Wrap;
import org.computate.smartvillageview.enus.model.base.BaseModel;

/**
 * {@inheritDoc}
 * Model: true
 * Api: true
 * Page: true
 * SuperPage.enUS: BaseModelPage
 * Indexed: true
 * SqlOrder: 2
 * Order: 8
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
 * Role.enUS: SiteAdmin
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
	 * HtmRow: 6
	 * HtmCell: 1
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
	 */
	protected void _simulationName(Wrap<String> w) {
		super._simulationName(w);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: sumocfg path
	 * HtmRow: 4
	 * HtmCell: 1
	 * Facet: true
	 * Default: /usr/local/src/TLC/input/Veberod_intersection_pedestrian.sumocfg
	 */
	protected void _sumocfgPath(Wrap<String> w) {
		super._sumocfgPath(w);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: Floating Car Data file path
	 * HtmRow: 5
	 * HtmCell: 1
	 * Facet: true
	 * Default: /usr/local/src/TLC/output/veberod-fcd.xml
	 */
	protected void _fcdFilePath(Wrap<String> w) {
		super._fcdFilePath(w);
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
	 * HtmRow: 6
	 * HtmCell: 1
	 * Facet: true
	 * Default: 0
	 */
	protected void _startSeconds(Wrap<BigDecimal> w) {
		super._startSeconds(w);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: end seconds
	 * Description: -e, --end TIME Defines the end time in seconds; The simulation ends at this time
	 * HtmRow: 6
	 * HtmCell: 2
	 * Facet: true
	 * Default: 300
	 */
	protected void _endSeconds(Wrap<BigDecimal> w) {
		super._endSeconds(w);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: step seconds
	 * Description: --step-length TIME Defines the step duration in seconds
	 * HtmRow: 6
	 * HtmCell: 3
	 * Facet: true
	 * Default: 0.1
	 */
	protected void _stepSeconds(Wrap<BigDecimal> w) {
		super._stepSeconds(w);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 7
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: Average vehicle/min from WEST to EAST
	 * Description: 
	 * Min: 1
	 * Max: 30
	 * Default: 10
	 */
	protected void _paramAvgVehiclePerMinFromWestToEast(Wrap<BigDecimal> w) {
		super._paramAvgVehiclePerMinFromWestToEast(w);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 7
	 * HtmCell: 2
	 * Facet: true
	 * DisplayName: Average vehicle/min from SOUTH to NORTH
	 * Description: 
	 * Min: 1
	 * Max: 30
	 * Default: 10
	 */
	protected void _paramAvgVehiclePerMinFromSouthToNorth(Wrap<BigDecimal> w) {
		super._paramAvgVehiclePerMinFromSouthToNorth(w);
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
		super._paramVehicleDemandScalingFactor(w);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
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
		super._paramAvgPedestrianPerMinFromWestToEast(w);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
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
		super._paramAvgPedestrianPerMinFromSouthToNorth(w);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
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
		super._paramPedestrianDemandScalingFactor(w);
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
	 * HtmRow: 9
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: Min GREEN time for WEST-EAST traffic (sec)
	 * Description: 
	 * Min: 1
	 * Max: 50
	 * Default: 20
	 */
	protected void _paramMinGreenTimeSecWestEast(Wrap<BigDecimal> w) {
		super._paramMinGreenTimeSecWestEast(w);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 9
	 * HtmCell: 2
	 * Facet: true
	 * DisplayName: Max GREEN time for WEST-EAST traffic (sec)
	 * Description: 
	 * Min: 1
	 * Max: 100
	 * Default: 30
	 */
	protected void _paramMaxGreenTimeSecWestEast(Wrap<BigDecimal> w) {
		super._paramMaxGreenTimeSecWestEast(w);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 10
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: Min GREEN time for SOUTH-NORTH traffic (sec)
	 * Description: 
	 * Min: 1
	 * Max: 50
	 * Default: 10
	 */
	protected void _paramMinGreenTimeSecSouthNorth(Wrap<BigDecimal> w) {
		super._paramMinGreenTimeSecSouthNorth(w);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 10
	 * HtmCell: 2
	 * Facet: true
	 * DisplayName: Max GREEN time for SOUTH-NORTH traffic (sec)
	 * Description: 
	 * Min: 1
	 * Max: 100
	 * Default: 20
	 */
	protected void _paramMaxGreenTimeSecSouthNorth(Wrap<BigDecimal> w) {
		super._paramMaxGreenTimeSecSouthNorth(w);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
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
		super._paramPedestrianWaitThresholdSecNorthSouth(w);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
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
		super._paramPedestrianWaitThresholdSecWestEast(w);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 12
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: Vehicle queue length threshold between low-high content for WEST-EAST
	 * Description: 
	 * Min: 1
	 * Max: 60
	 * Default: 8
	 */
	protected void _paramVehicleQueueThresholdWestEast(Wrap<BigDecimal> w) {
		super._paramVehicleQueueThresholdWestEast(w);
	}

	/**
	 * {@inheritDocentiteNomAffichage}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 12
	 * HtmCell: 2
	 * Facet: true
	 * DisplayName: Vehicle queue length threshold between low-high content for SOUTH-NORTH
	 * Description: 
	 * Min: 1
	 * Max: 15
	 * Default: 8
	 */
	protected void _paramVehicleQueueThresholdSouthNorth(Wrap<BigDecimal> w) {
		super._paramVehicleQueueThresholdSouthNorth(w);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
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
		super._paramPedestrianQueueThresholdNorthSouth(w);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
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
		super._paramPedestrianQueueThresholdWestEast(w);
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
		super._paramStepSize(w);
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
		super._paramRunTime(w);
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
		super._paramItersPerPar(w);
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
		super._paramTotalIterNum(w);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Relate: SimulationReport.simulationKey
	 * HtmRow: 16
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: simulation reports
	 * Description: The generated reports for this simulation
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
		Optional.ofNullable(simulationName).ifPresent(s -> b.append(" Simulation \"").append(s).append("\""));
		Optional.ofNullable(sumocfgPath).ifPresent(s -> b.append(" in ").append(s));
		w.o(b.toString().trim());
	}

	@Override
	protected void _objectId(Wrap<String> w) {
		if(pk != null)
			w.o(pk.toString());
	}
}
