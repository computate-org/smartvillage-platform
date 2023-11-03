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
package org.computate.smartvillage.enus.model.traffic.time.step;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

import org.computate.search.wrap.Wrap;
import org.computate.smartvillage.enus.model.traffic.time.step.TimeStepGen;
import org.computate.smartvillage.enus.request.SiteRequestEnUS;
import org.computate.smartvillage.enus.result.base.BaseResult;

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
 * ApiMethod: Search
 * ApiMethod: GET
 * ApiMethod: PATCH
 * ApiMethod: POST
 * ApiMethod: PUTImport
 * 
 * ApiMethod: SearchPage
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
	 * HtmRow: 3
	 * HtmCell: 1
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
	 * HtmRow: 3
	 * HtmCell: 2
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
	 * HtmRow: 3
	 * HtmCell: 3
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
