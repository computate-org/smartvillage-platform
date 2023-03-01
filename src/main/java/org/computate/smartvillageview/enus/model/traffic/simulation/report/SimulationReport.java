package org.computate.smartvillageview.enus.model.traffic.simulation.report;

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
	 * Persist: true
	 * DisplayName: simulation name
	 * HtmlRow: 3
	 * HtmlCell: 1
	 * Facet: true
	 */
	protected void _simulationName(Wrap<String> w) {
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
}
