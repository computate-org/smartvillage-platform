package org.computate.smartcityview.enus.model.iotnode;

import org.computate.search.wrap.Wrap;
import org.computate.smartcityview.enus.model.base.BaseModel;

import io.vertx.pgclient.data.Point;

/**
 * Model: true
 * Api: true
 * Page: true
 * SuperPage.enUS: BaseModelPage
 * Indexed: true
 * Map.Integer.sqlSort: 2
 * 
 * ApiTag.enUS: IOT Node
 * ApiUri.enUS: /api/iot-node
 * 
 * ApiMethod.enUS: Search
 * ApiMethod: PATCH
 * ApiMethod: POST
 * ApiMethod: PUTImport
 * 
 * ApiMethod.enUS: SearchPage
 * PageSearchPage.enUS: IotNodePage
 * PageSuperSearchPage.enUS: BaseModelPage
 * ApiUriSearchPage.enUS: /iot-node
 * 
 * Role.enUS: SiteAdmin
 * Saves: true
 * 
 * AName.enUS: an IOT node
 * Color: blue
 * IconGroup: duotone
 * IconName: router
 * NameVar.enUS: iot-node
 * Rows: 100
 */
public class IotNode extends IotNodeGen<BaseModel> {

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: node name
	 * HtmlRow: 3
	 * HtmlCell: 1
	 */
	protected void _nodeName(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: node type
	 * HtmlRow: 3
	 * HtmlCell: 2
	 */
	protected void _nodeType(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: node ID
	 * HtmlRow: 3
	 * HtmlCell: 3
	 */
	protected void _nodeId(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: location
	 * HtmlRow: 3
	 * HtmlCell: 3
	 */
	protected void _location(Wrap<Point> w) {
	}

	@Override
	protected void _objectTitle(Wrap<String> w) {
		StringBuilder b = new StringBuilder();
		b.append(nodeName);
		w.o(b.toString());
	}

	@Override
	public String toString() {
		return objectText;
	}
}
