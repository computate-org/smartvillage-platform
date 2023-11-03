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
package org.computate.smartvillage.enus.model.traffic.light;

import java.math.BigDecimal;

import org.computate.search.wrap.Wrap;
import org.computate.smartvillage.enus.model.traffic.light.TrafficLightGen;
import org.computate.smartvillage.enus.result.map.MapResult;

/**
 * Api: true
 * Page: true
 * SuperPage.enUS: MapResultPage
 * Indexed: true
 * Order: 9
 * 
 * ApiTag.enUS: Traffic Light
 * ApiUri.enUS: /api/traffic-light
 * 
 * ApiMethod: Search
 * ApiMethod: GET
 * ApiMethod: PATCH
 * ApiMethod: POST
 * ApiMethod: PUTImport
 * 
 * ApiMethod: SearchPage
 * Page.SearchPage.enUS: TrafficLightPage
 * ApiUri.SearchPage.enUS: /traffic-light
 * 
 * Role.enUS: SiteAdmin
 * 
 * AName.enUS: a traffic light
 * Color: 2017-shaded-spruce
 * IconGroup: duotone
 * IconName: map-location-dot
 * Rows: 100
 */
public class TrafficLight extends TrafficLightGen<MapResult> {

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
	 * DisplayName: traffic light ID
	 * HtmRow: 4
	 * HtmCell: 3
	 * Facet: true
	 */
	protected void _trafficLightId(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: traffic light type
	 * HtmRow: 4
	 * HtmCell: 4
	 * Facet: true
	 */
	protected void _trafficLightType(Wrap<String> w) {
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
	 * DisplayName: Color
	 * HtmRow: 6
	 * HtmCell: 1
	 * Facet: true
	 */
	protected void _color(Wrap<String> w) {
		w.o("black");
	}

	@Override
	protected void _objectTitle(Wrap<String> w) {
		StringBuilder b = new StringBuilder();
		if(trafficLightType != null)
			b.append(" ").append(trafficLightType);
		if(trafficLightId != null)
			b.append(" ").append(trafficLightId);
		if(trafficLightId != null)
			b.append(" ").append(trafficLightId);
		w.o(b.toString().trim());
	}
}
