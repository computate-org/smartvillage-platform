package org.computate.smartvillageview.enus.model.iotnode;

import org.computate.search.wrap.Wrap;
import org.computate.smartvillageview.enus.model.base.BaseModel;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
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
 * ApiMethod: GET
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
 * NameVar.enUS: iotNode
 * Rows: 100
 */
public class IotNode extends IotNodeGen<BaseModel> {

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: json
	 */
	protected void _json(Wrap<JsonObject> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: node name
	 * HtmlRow: 3
	 * HtmlCell: 1
	 */
	protected void _nodeName(Wrap<String> w) {
		w.o(json.getString("name"));
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
		w.o(json.getString("nodeType"));
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
		w.o(json.getString("_id"));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: location
	 * HtmlRow: 4
	 * HtmlCell: 1
	 */
	protected void _location(Wrap<Point> w) {
		JsonArray latlng = json.getJsonArray("latlng");
		if(latlng != null && latlng.size() == 2) {
			w.o(new Point(latlng.getDouble(0), latlng.getDouble(1)));
		}
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
