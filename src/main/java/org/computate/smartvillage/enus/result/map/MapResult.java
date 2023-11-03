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
package org.computate.smartvillage.enus.result.map;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;

import org.computate.search.wrap.Wrap;
import org.computate.smartvillage.enus.result.base.BaseResult;
import org.computate.smartvillage.enus.result.map.MapResultGen;

import io.vertx.pgclient.data.Point;

/**
 * Indexed: true
 * Api: true
 * Page: true
 * SuperPage: BaseResultPage
 * Description: A reusable map class for all non-model search classes on the map
 * Order: 4
 * 
 * ApiTag.enUS: Map Result
 * ApiUri.enUS: /api/map-result
 * 
 * ApiMethod: Search
 * ApiMethod: GET
 * 
 * ApiMethod: SearchPage
 * Page.SearchPage.enUS: MapResultPage
 * ApiUri.SearchPage.enUS: /map-result
 * 
 * Role.enUS: SiteAdmin
 * 
 * AName.enUS: a map result
 * Color: 2017-shaded-spruce
 * IconGroup: duotone
 * IconName: map-location-dot
 * Rows: 100
 */
public class MapResult extends MapResultGen<BaseResult> {

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: Time Step
	 * Description: The time step ID. 
	 */
	protected void _timeStepId(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 4
	 * HtmCell: 1
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
	 * HtmRow: 4
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: Date and Time
	 * Description: The date and time. 
	 */
	protected void _dateTime(Wrap<ZonedDateTime> w) {
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
	 * DisplayName: map location
	 * HtmRow: 4
	 * HtmCell: 2
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
	 * HtmRow: 4
	 * HtmCell: 3
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
	 * HtmRow: 4
	 * HtmCell: 1
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
