package org.computate.smartvillageview.enus.model.traffic.light;

import java.math.BigDecimal;

import org.computate.search.wrap.Wrap;
import org.computate.smartvillageview.enus.result.map.MapResult;

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
