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
 * NameVar.enUS: trafficSimulation
 * Rows: 100
 */
public class TrafficSimulation extends TrafficSimulationGen<BaseModel> {

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 6
	 * HtmlCell: 1
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
	 * HtmlRow: 3
	 * HtmlCell: 1
	 * Facet: true
	 */
	protected void _simulationName(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: sumocfg path
	 * HtmlRow: 4
	 * HtmlCell: 1
	 * Facet: true
	 */
	protected void _sumocfgPath(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: Floating Car Data file path
	 * HtmlRow: 5
	 * HtmlCell: 1
	 * Facet: true
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
	 * HtmlRow: 6
	 * HtmlCell: 1
	 * Facet: true
	 */
	protected void _startSeconds(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: end seconds
	 * Description: -e, --end TIME Defines the end time in seconds; The simulation ends at this time
	 * HtmlRow: 6
	 * HtmlCell: 2
	 * Facet: true
	 */
	protected void _endSeconds(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: step seconds
	 * Description: --step-length TIME Defines the step duration in seconds
	 * HtmlRow: 6
	 * HtmlCell: 3
	 * Facet: true
	 */
	protected void _stepSeconds(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 7
	 * HtmlCell: 1
	 * Facet: true
	 * DisplayName: Average vehicle/min from WEST to EAST
	 * Description: 
	 */
	protected void _paramAvgVehiclePerMinFromWestToEast(Wrap<BigDecimal> w) {
		w.o(new BigDecimal(10));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 7
	 * HtmlCell: 2
	 * Facet: true
	 * DisplayName: Average vehicle/min from SOUTH to NORTH
	 * Description: 
	 */
	protected void _paramAvgVehiclePerMinFromSouthToNorth(Wrap<BigDecimal> w) {
		w.o(new BigDecimal(10));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 7
	 * HtmlCell: 3
	 * Facet: true
	 * DisplayName: Demand scaling factor (multiplies all vehicle demands)
	 * Description: 
	 */
	protected void _paramVehicleDemandScalingFactor(Wrap<BigDecimal> w) {
		w.o(new BigDecimal(1));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 8
	 * HtmlCell: 1
	 * Facet: true
	 * DisplayName: Average pedestrian/min from WEST to EAST
	 * Description: 
	 */
	protected void _paramAvgPedestrianPerMinFromWestToEast(Wrap<BigDecimal> w) {
		w.o(new BigDecimal(5));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 8
	 * HtmlCell: 2
	 * Facet: true
	 * DisplayName: Average pedestrian/min from WEST to EAST
	 * Description: 
	 */
	protected void _paramAvgPedestrianPerMinFromSouthToNorth(Wrap<BigDecimal> w) {
		w.o(new BigDecimal(5));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 8
	 * HtmlCell: 3
	 * Facet: true
	 * DisplayName: Demand scaling factor (multiplies all pedestrian demands)
	 * Description: 
	 */
	protected void _paramPedestrianDemandScalingFactor(Wrap<BigDecimal> w) {
		w.o(new BigDecimal(1));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Facet: true
	 * DisplayName: demand scale
	 * Description: 
	 */
	protected void _paramDemandScale(Wrap<BigDecimal> w) {
		w.o(paramVehicleDemandScalingFactor);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 9
	 * HtmlCell: 1
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
	 * HtmlRow: 9
	 * HtmlCell: 2
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
	 * HtmlRow: 10
	 * HtmlCell: 1
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
	 * HtmlRow: 10
	 * HtmlCell: 2
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
	 * HtmlRow: 11
	 * HtmlCell: 1
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
	 * HtmlRow: 11
	 * HtmlCell: 2
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
	 * HtmlRow: 12
	 * HtmlCell: 1
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
	 * HtmlRow: 12
	 * HtmlCell: 2
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
	 * HtmlRow: 13
	 * HtmlCell: 1
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
	 * HtmlRow: 13
	 * HtmlCell: 2
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
	 * HtmlRow: 14
	 * HtmlCell: 2
	 * Facet: true
	 * DisplayName: Simulation time step (sec)
	 * Description: 
	 */
	protected void _paramStepSize(Wrap<BigDecimal> w) {
		w.o(new BigDecimal(1));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Facet: true
	 * DisplayName: update step size
	 * Description: 
	 */
	protected void _paramUpdateStepSize(Wrap<Integer> w) {
		w.o(30);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 14
	 * HtmlCell: 1
	 * Facet: true
	 * DisplayName: time for each round of traffic simulation (sec)
	 * Description: Time duration of each simulated sample path. 
	 */
	protected void _paramRunTime(Wrap<Integer> w) {
		w.o(1000);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 15
	 * HtmlCell: 1
	 * Facet: true
	 * DisplayName: Number of simulation repetitions with same input (for statistical accuracy)
	 * Description: Number of repeats per round. 
	 */
	protected void _paramItersPerPar(Wrap<Integer> w) {
		w.o(5);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 15
	 * HtmlCell: 2
	 * Facet: true
	 * DisplayName: Number of parameter update iterations before output
	 * Description: Total iterations to update performance. 
	 */
	protected void _paramTotalIterNum(Wrap<Integer> w) {
		w.o(10);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Relate: SimulationReport.simulationKey
	 * HtmlRow: 16
	 * HtmlCell: 1
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
