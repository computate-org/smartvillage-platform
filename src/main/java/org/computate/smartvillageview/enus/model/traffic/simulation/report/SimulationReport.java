package org.computate.smartvillageview.enus.model.traffic.simulation.report;

import java.math.BigDecimal;
import java.util.List;

import org.computate.search.wrap.Wrap;
import org.computate.smartvillageview.enus.model.base.BaseModel;
import org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation;
import org.computate.vertx.search.list.SearchList;

import io.vertx.core.Promise;

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
	 * HtmlRow: 3
	 * HtmlCell: 1
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
	 * HtmlRow: 3
	 * HtmlCell: 2
	 * Facet: true
	 */
	protected void _simulationName(Wrap<String> w) {
		if(simulation_ != null)
			w.o(simulation_.getSimulationName());
	}

	@Override
	protected void _objectTitle(Wrap<String> w) {
		StringBuilder b = new StringBuilder();
		w.o(b.toString().trim());
	}

	@Override
	protected void _objectId(Wrap<String> w) {
		if(pk != null)
			w.o(pk.toString());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 4
	 * HtmlCell: 1
	 * Facet: true
	 * DisplayName: initial params
	 * Description: 
	 */
	protected void _paramInitialPar(List<BigDecimal> l) {
		if(simulation_ != null && l.isEmpty())
			l.addAll(simulation_.getParamInitialPar());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 5
	 * HtmlCell: 1
	 * Facet: true
	 * DisplayName: Traffic Demand
	 * Description: 
	 */
	protected void _paramLam(List<BigDecimal> l) {
		if(simulation_ != null && l.isEmpty())
			l.addAll(simulation_.getParamLam());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 6
	 * HtmlCell: 1
	 * Facet: true
	 * DisplayName: demand scale
	 * Description: 
	 */
	protected void _paramDemandScale(Wrap<BigDecimal> w) {
		if(simulation_ != null)
			w.o(simulation_.getParamDemandScale());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 6
	 * HtmlCell: 2
	 * Facet: true
	 * DisplayName: step size
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
	 * HtmlRow: 6
	 * HtmlCell: 3
	 * Facet: true
	 * DisplayName: update step size
	 * Description: 
	 */
	protected void _paramUpdateStepSize(Wrap<Integer> w) {
		if(simulation_ != null)
			w.o(simulation_.getParamUpdateStepSize());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 7
	 * HtmlCell: 1
	 * Facet: true
	 * DisplayName: run time
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
	 * HtmlRow: 7
	 * HtmlCell: 2
	 * Facet: true
	 * DisplayName: total iterations
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
	 * HtmlRow: 7
	 * HtmlCell: 3
	 * Facet: true
	 * DisplayName: iteration repetitions
	 * Description: Number of repeats per round. 
	 */
	protected void _paramItersPerPar(Wrap<Integer> w) {
		if(simulation_ != null)
			w.o(simulation_.getParamItersPerPar());
	}
}
