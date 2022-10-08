package org.computate.smartvillageview.enus.model.traffic.simulation;

import java.math.BigDecimal;
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
 * Map.Integer.sqlSort: 3
 * 
 * ApiTag.enUS: Traffic Simulation
 * ApiUri.enUS: /api/traffic-simulation
 * 
 * ApiMethod.enUS: Search
 * ApiMethod: GET
 * ApiMethod: PATCH
 * ApiMethod: POST
 * ApiMethod: PUTImport
 * ApiContentTypeRequest.PUTImport: application/xml
 * 
 * ApiMethod.enUS: SearchPage
 * Page.SearchPage.enUS: TrafficSimulationPage
 * PageSuper.SearchPage.enUS: BaseModelPage
 * ApiUri.SearchPage.enUS: /traffic-simulation
 * 
 * ApiMethod.enUS: MapSearchPage
 * Page.MapSearchPage.enUS: TrafficSimulationMapPage
 * PageSuper.MapSearchPage.enUS: BaseModelPage
 * ApiUri.MapSearchPage.enUS: /traffic-simulation-map
 * 
 * Role.enUS: SiteAdmin
 * Saves: true
 * 
 * AName.enUS: a traffic simulation
 * Color: blue
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
	 * DisplayName: net file path
	 * HtmlRow: 4
	 * HtmlCell: 1
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
	 * HtmlRow: 5
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
	 * HtmlRow: 5
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
	 * HtmlRow: 5
	 * HtmlCell: 3
	 * Facet: true
	 */
	protected void _stepSeconds(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: floating car data output geo-coordinates
	 * Description: --fcd-output.geo Save the Floating Car Data using geo-coordinates (lon/lat)
	 * HtmlRow: 6
	 * HtmlCell: 1
	 * Facet: true
	 */
	protected void _fcdOutputGeo(Wrap<Boolean> w) {
		w.o(true);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: TLS States paths
	 * Description: The paths to all TLS States files
	 * HtmlRow: 6
	 * HtmlCell: 2
	 * Facet: true
	 */
	protected void _tlsStatesPaths(List<String> l) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: additional file paths
	 * Description: The paths to all the additional SUMO config files
	 * HtmlRow: 6
	 * HtmlCell: 2
	 * Facet: true
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
}
