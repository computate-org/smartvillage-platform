package org.computate.smartvillageview.enus.result.map;

import java.math.BigDecimal;
import java.util.List;

import org.computate.search.wrap.Wrap;
import org.computate.smartvillageview.enus.result.base.BaseResult;

import io.vertx.pgclient.data.Point;

/**
 * Indexed: true
 * Api: true
 * Page: true
 * SuperPage: BaseResultPage
 * Description: A reusable map class for all non-model search classes on the map
 * Map.Integer.classSort: 4
 * 
 * ApiTag.enUS: Map Result
 * ApiUri.enUS: /api/map-result
 * 
 * ApiMethod.enUS: Search
 * ApiMethod: GET
 * 
 * ApiMethod.enUS: SearchPage
 * Page.SearchPage.enUS: MapResultPage
 * ApiUri.SearchPage.enUS: /map-result
 * 
 * Role.enUS: SiteAdmin
 * Saves: true
 * 
 * AName.enUS: a map result
 * Color: blue
 * IconGroup: duotone
 * IconName: map-location-dot
 * Rows: 100
 */
public class MapResult extends MapResultGen<BaseResult> {

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
	 * DisplayName: Time Step
	 * Description: The time step ID. 
	 */
	protected void _timeStepId(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 4
	 * HtmlCell: 1
	 * Facet: true
	 * DisplayName: Time in seconds
	 * Description: The time in seconds. 
	 */
	protected void _time(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * Persist: true
	 */
	protected void _x(Wrap<Double> w) {
	}

	/**
	 * {@inheritDoc}
	 * Persist: true
	 */
	protected void _y(Wrap<Double> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: location
	 * HtmlRow: 4
	 * HtmlCell: 2
	 * Facet: true
	 */
	protected void _location(Wrap<Point> w) {
		if(x != null && y != null)
			w.o(new Point(y, x));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: color
	 * HtmlRow: 4
	 * HtmlCell: 3
	 * Facet: true
	 * Color: true
	 */
	protected void _color(Wrap<String> w) {
		w.o("magenta");
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: step
	 * HtmlRow: 4
	 * HtmlCell: 1
	 * Facet: true
	 */
	protected void _step(Wrap<Boolean> w) {
		w.o(false);
	}

	@Override
	protected void _classCanonicalNames(List<String> l) { 
		l.add(MapResult.class.getCanonicalName());
		super._classCanonicalNames(l);
	}
}
