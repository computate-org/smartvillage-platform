package org.computate.smartvillageview.enus.model.traffic.person.step;

import java.math.BigDecimal;

import org.computate.search.wrap.Wrap;
import org.computate.smartvillageview.enus.result.map.MapResult;
import org.computate.smartvillageview.enus.tool.HeadingConverter;

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
	 * DisplayName: person ID
	 * HtmlRow: 4
	 * HtmlCell: 3
	 * Facet: true
	 */
	protected void _personId(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: person type
	 * HtmlRow: 4
	 * HtmlCell: 4
	 * Facet: true
	 */
	protected void _personType(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: Angle in degrees
	 * HtmlRow: 5
	 * HtmlCell: 1
	 * Facet: true
	 */
	protected void _angle(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: Speed
	 * HtmlRow: 5
	 * HtmlCell: 2
	 * Facet: true
	 */
	protected void _speed(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: Position
	 * HtmlRow: 5
	 * HtmlCell: 3
	 * Facet: true
	 */
	protected void _pos(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: Slope
	 * HtmlRow: 5
	 * HtmlCell: 4
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
