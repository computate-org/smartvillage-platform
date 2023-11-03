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
package org.computate.smartvillage.enus.model.traffic.bicycle.step;

import org.computate.search.wrap.Wrap;
import org.computate.smartvillage.enus.model.traffic.bicycle.step.BicycleStepGen;
import org.computate.smartvillage.enus.result.map.MapResult;

/**
 * Api: true
 * Page: true
 * SuperPage.enUS: MapResultPage
 * Indexed: true
 * Order: 16
 * 
 * ApiTag.enUS: Bicycle Step
 * ApiUri.enUS: /api/bicycle-step
 * 
 * ApiMethod.enUS: Search
 * ApiMethod: GET
 * ApiMethod: PATCH
 * ApiMethod: POST
 * ApiMethod: PUTImport
 * 
 * ApiMethod.enUS: SearchPage
 * Page.SearchPage.enUS: BicycleStepPage
 * ApiUri.SearchPage.enUS: /bicycle-step
 * 
 * Role.enUS: SiteAdmin
 * 
 * AName.enUS: a bicycle step
 * Color: 2017-shaded-spruce
 * IconGroup: duotone
 * IconName: map-location-dot
 * Rows: 100
 */
public class BicycleStep extends BicycleStepGen<MapResult> {


	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: bicycle ID
	 * HtmRow: 4
	 * HtmCell: 3
	 * Facet: true
	 */
	protected void _bicycleId(Wrap<String> w) {
	}
}
