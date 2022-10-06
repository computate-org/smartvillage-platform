package org.computate.smartvillageview.enus.model.traffic.vehicle.step;

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
 * 
 * ApiTag.enUS: Vehicle Step
 * ApiUri.enUS: /api/vehicle-step
 * 
 * ApiMethod.enUS: Search
 * ApiMethod: GET
 * ApiMethod: PATCH
 * ApiMethod: POST
 * ApiMethod: PUTImport
 * 
 * ApiMethod.enUS: SearchPage
 * Page.SearchPage.enUS: VehicleStepPage
 * ApiUri.SearchPage.enUS: /vehicle-step
 * 
 * Role.enUS: SiteAdmin
 * Saves: true
 * 
 * AName.enUS: a vehicle step
 * Color: blue
 * IconGroup: duotone
 * IconName: map-location-dot
 * Rows: 100
 */
public class VehicleStep extends VehicleStepGen<MapResult> {

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: vehicle ID
	 * HtmlRow: 4
	 * HtmlCell: 3
	 * Facet: true
	 */
	protected void _vehicleId(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: vehicle type
	 * HtmlRow: 4
	 * HtmlCell: 4
	 * Facet: true
	 */
	protected void _vehicleType(Wrap<String> w) {
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

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: Color
	 * HtmlRow: 6
	 * HtmlCell: 1
	 * Facet: true
	 */
	protected void _color(Wrap<String> w) {
		w.o("black");
	}

	@Override
	protected void _objectTitle(Wrap<String> w) {
		StringBuilder b = new StringBuilder();
		if(vehicleType != null)
			b.append(" ").append(vehicleType);
		if(vehicleId != null)
			b.append(" ").append(vehicleId);
		if(vehicleId != null)
			b.append(" ").append(vehicleId);
		if(speed != null)
			b.append(" ").append(speed).append("kph");
		if(angle != null)
			b.append(" ").append(angle).append("°").append(HeadingConverter.getHeading(angle));
//		if(slope != null)
//			b.append(" ").append(slope).append("° slope");
		w.o(b.toString().trim());
	}
}
