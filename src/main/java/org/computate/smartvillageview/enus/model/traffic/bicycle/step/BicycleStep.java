package org.computate.smartvillageview.enus.model.traffic.bicycle.step;

import org.computate.search.wrap.Wrap;
import org.computate.smartvillageview.enus.result.map.MapResult;

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
	 * HtmlRow: 4
	 * HtmlCell: 3
	 * Facet: true
	 */
	protected void _bicycleId(Wrap<String> w) {
	}
}
