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
package org.computate.smartvillage.enus.model.traffic.person.step;

import java.math.BigDecimal;

import org.computate.search.wrap.Wrap;
import org.computate.smartvillage.enus.model.traffic.person.step.PersonStepGen;
import org.computate.smartvillage.enus.result.map.MapResult;
import org.computate.smartvillage.enus.tool.HeadingConverter;

import io.vertx.pgclient.data.Point;

/**
 * Api: true
 * Page: true
 * SuperPage.enUS: MapResultPage
 * Indexed: true
 * Order: 14
 * 
 * ApiTag.enUS: Person Step
 * ApiUri.enUS: /api/person-step
 * 
 * ApiMethod: Search
 * ApiMethod: GET
 * ApiMethod: PATCH
 * ApiMethod: POST
 * ApiMethod: PUTImport
 * 
 * ApiMethod: SearchPage
 * Page.SearchPage.enUS: PersonStepPage
 * ApiUri.SearchPage.enUS: /person-step
 * 
 * Role.enUS: SiteAdmin
 * 
 * AName.enUS: a person step
 * Color: 2017-shaded-spruce
 * IconGroup: duotone
 * IconName: map-location-dot
 * Rows: 100
 */
public class PersonStep extends PersonStepGen<MapResult> {

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: simulation name
	 * HtmRow: 3
	 * HtmCell: 1
	 * Facet: true
	 */
	protected void _simulationName(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: sumocfg path
	 * HtmRow: 3
	 * HtmCell: 2
	 * Facet: true
	 */
	protected void _sumocfgPath(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: person ID
	 * HtmRow: 4
	 * HtmCell: 3
	 * Facet: true
	 */
	protected void _personId(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: person type
	 * HtmRow: 4
	 * HtmCell: 4
	 * Facet: true
	 */
	protected void _personType(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: Angle in degrees
	 * HtmRow: 5
	 * HtmCell: 1
	 * Facet: true
	 */
	protected void _angle(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: Speed
	 * HtmRow: 5
	 * HtmCell: 2
	 * Facet: true
	 */
	protected void _speed(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: Position
	 * HtmRow: 5
	 * HtmCell: 3
	 * Facet: true
	 */
	protected void _pos(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: Slope
	 * HtmRow: 5
	 * HtmCell: 4
	 * Facet: true
	 */
	protected void _slope(Wrap<BigDecimal> w) {
	}

	@Override
	protected void _step(Wrap<Boolean> w) {
		w.o(true);
	}

	@Override
	protected void _color(Wrap<String> w) {
		w.o("purple");
	}

	@Override
	protected void _objectTitle(Wrap<String> w) {
		StringBuilder b = new StringBuilder();
		if(personType != null)
			b.append(" ").append(personType);
		if(personId != null)
			b.append(" ").append(personId);
		if(personId != null)
			b.append(" ").append(personId);
		if(speed != null)
			b.append(" ").append(speed).append("kph");
		if(angle != null)
			b.append(" ").append(angle).append("°").append(HeadingConverter.getHeading(angle));
//		if(slope != null)
//			b.append(" ").append(slope).append("° slope");
		w.o(b.toString().trim());
	}
}
