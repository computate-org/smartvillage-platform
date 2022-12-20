package org.computate.smartvillageview.enus.model.traffic.time.step;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

import org.computate.search.wrap.Wrap;
import org.computate.smartvillageview.enus.request.SiteRequestEnUS;
import org.computate.smartvillageview.enus.result.base.BaseResult;

import io.vertx.core.Promise;

/**
 * Api: true
 * Page: true
 * SuperPage.enUS: BaseResultPage
 * Indexed: true
 * Order: 7
 * 
 * ApiTag.enUS: Time Step
 * ApiUri.enUS: /api/time-step
 * 
 * ApiMethod.enUS: Search
 * ApiMethod: GET
 * ApiMethod: PATCH
 * ApiMethod: POST
 * ApiMethod: PUTImport
 * 
 * ApiMethod.enUS: SearchPage
 * Page.SearchPage.enUS: TimeStepPage
 * ApiUri.SearchPage.enUS: /time-step
 * 
 * Role.enUS: SiteAdmin
 * 
 * AName.enUS: a time step
 * Color: 2017-shaded-spruce
 * IconGroup: duotone
 * IconName: timer
 * Rows: 100
 */
public class TimeStep extends TimeStepGen<BaseResult> {

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 3
	 * HtmlCell: 1
	 * Facet: true
	 * DisplayName: Simulation
	 * Description: The simulation key. 
	 */
	protected void _simulationKey(Wrap<Long> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 3
	 * HtmlCell: 2
	 * Facet: true
	 * DisplayName: Path
	 * Description: The file path. 
	 */
	protected void _path(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 3
	 * HtmlCell: 3
	 * Facet: true
	 * DisplayName: Time in seconds
	 * Description: The time in seconds. 
	 */
	protected void _time(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 4
	 * HtmlCell: 1
	 * Facet: true
	 * DisplayName: Date and Time in seconds
	 * Description: The date and time in seconds. 
	 */
	protected void _dateTime(Wrap<ZonedDateTime> w) {
	}

	@Override
	protected void _objectTitle(Wrap<String> w) {
		w.o(String.format("%s %s", path, time));
	}
}
