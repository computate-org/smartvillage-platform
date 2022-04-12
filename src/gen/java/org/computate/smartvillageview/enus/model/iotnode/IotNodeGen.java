package org.computate.smartvillageview.enus.model.iotnode;

import org.computate.smartvillageview.enus.request.SiteRequestEnUS;
import org.computate.smartvillageview.enus.model.base.BaseModel;
import io.vertx.core.json.JsonObject;
import java.util.Date;
import java.util.Set;
import org.computate.vertx.api.ApiRequest;
import org.computate.smartvillageview.enus.config.ConfigKeys;
import java.util.Optional;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.computate.search.serialize.ComputateLocalDateSerializer;
import org.computate.search.serialize.ComputateLocalDateDeserializer;
import org.computate.search.serialize.ComputateZonedDateTimeSerializer;
import org.computate.search.serialize.ComputateZonedDateTimeDeserializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.math.MathContext;
import org.apache.commons.lang3.math.NumberUtils;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.math.RoundingMode;
import java.util.Map;
import java.lang.String;
import io.vertx.pgclient.data.Point;
import org.computate.vertx.serialize.pgclient.PgClientPointSerializer;
import org.computate.vertx.serialize.pgclient.PgClientPointDeserializer;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;

/**	
 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode">Find the class IotNode in Solr. </a>
 * <br><br>Delete the class IotNode in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>Delete  the package org.computate.smartvillageview.enus.model.iotnode in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>Delete  the project smart-village-view in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smart\-village\-view&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>
 **/
public abstract class IotNodeGen<DEV> extends BaseModel {
	protected static final Logger LOG = LoggerFactory.getLogger(IotNode.class);

	public static final String IotNode_AName = "an IOT node";
	public static final String IotNode_This = "this ";
	public static final String IotNode_ThisName = "this IOT node";
	public static final String IotNode_A = "a ";
	public static final String IotNode_TheName = "theIOT node";
	public static final String IotNode_NameSingular = "IOT node";
	public static final String IotNode_NamePlural = "IOT nodes";
	public static final String IotNode_NameActual = "current IOT node";
	public static final String IotNode_AllName = "all the IOT nodes";
	public static final String IotNode_SearchAllNameBy = "search IOT nodes by ";
	public static final String IotNode_Title = "IOT nodes";
	public static final String IotNode_ThePluralName = "the IOT nodes";
	public static final String IotNode_NoNameFound = "no IOT node found";
	public static final String IotNode_NameVar = "iot-node";
	public static final String IotNode_OfName = "of IOT node";
	public static final String IotNode_ANameAdjective = "an IOT node";
	public static final String IotNode_NameAdjectiveSingular = "IOT node";
	public static final String IotNode_NameAdjectivePlural = "IOT nodes";
	public static final String IotNode_Color = "blue";
	public static final String IotNode_IconGroup = "duotone";
	public static final String IotNode_IconName = "router";
	public static final Integer IotNode_Rows = 100;

	//////////////
	// nodeName //
	//////////////

	/**	 The entity nodeName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String nodeName;

	/**	<br> The entity nodeName
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:nodeName">Find the entity nodeName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _nodeName(Wrap<String> w);

	public String getNodeName() {
		return nodeName;
	}
	public void setNodeName(String o) {
		this.nodeName = IotNode.staticSetNodeName(siteRequest_, o);
	}
	public static String staticSetNodeName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected IotNode nodeNameInit() {
		Wrap<String> nodeNameWrap = new Wrap<String>().var("nodeName");
		if(nodeName == null) {
			_nodeName(nodeNameWrap);
			setNodeName(nodeNameWrap.o);
		}
		return (IotNode)this;
	}

	public static String staticSearchNodeName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrNodeName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqNodeName(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrNodeName(siteRequest_, IotNode.staticSearchNodeName(siteRequest_, IotNode.staticSetNodeName(siteRequest_, o)));
	}

	public String sqlNodeName() {
		return nodeName;
	}

	//////////////
	// nodeType //
	//////////////

	/**	 The entity nodeType
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String nodeType;

	/**	<br> The entity nodeType
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:nodeType">Find the entity nodeType in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _nodeType(Wrap<String> w);

	public String getNodeType() {
		return nodeType;
	}
	public void setNodeType(String o) {
		this.nodeType = IotNode.staticSetNodeType(siteRequest_, o);
	}
	public static String staticSetNodeType(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected IotNode nodeTypeInit() {
		Wrap<String> nodeTypeWrap = new Wrap<String>().var("nodeType");
		if(nodeType == null) {
			_nodeType(nodeTypeWrap);
			setNodeType(nodeTypeWrap.o);
		}
		return (IotNode)this;
	}

	public static String staticSearchNodeType(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrNodeType(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqNodeType(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrNodeType(siteRequest_, IotNode.staticSearchNodeType(siteRequest_, IotNode.staticSetNodeType(siteRequest_, o)));
	}

	public String sqlNodeType() {
		return nodeType;
	}

	////////////
	// nodeId //
	////////////

	/**	 The entity nodeId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String nodeId;

	/**	<br> The entity nodeId
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:nodeId">Find the entity nodeId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _nodeId(Wrap<String> w);

	public String getNodeId() {
		return nodeId;
	}
	public void setNodeId(String o) {
		this.nodeId = IotNode.staticSetNodeId(siteRequest_, o);
	}
	public static String staticSetNodeId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected IotNode nodeIdInit() {
		Wrap<String> nodeIdWrap = new Wrap<String>().var("nodeId");
		if(nodeId == null) {
			_nodeId(nodeIdWrap);
			setNodeId(nodeIdWrap.o);
		}
		return (IotNode)this;
	}

	public static String staticSearchNodeId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrNodeId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqNodeId(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrNodeId(siteRequest_, IotNode.staticSearchNodeId(siteRequest_, IotNode.staticSetNodeId(siteRequest_, o)));
	}

	public String sqlNodeId() {
		return nodeId;
	}

	//////////////
	// location //
	//////////////

	/**	 The entity location
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonDeserialize(using = PgClientPointDeserializer.class)
	@JsonSerialize(using = PgClientPointSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Point location;

	/**	<br> The entity location
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:location">Find the entity location in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _location(Wrap<Point> w);

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point location) {
		this.location = location;
	}
	@JsonIgnore
	public void setLocation(String o) {
		this.location = IotNode.staticSetLocation(siteRequest_, o);
	}
	public static Point staticSetLocation(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
			String[] vals = o.split(",");
			if(vals.length == 2 && NumberUtils.isParsable(vals[0]) && NumberUtils.isParsable(vals[1]))
				return new Point(Double.parseDouble(vals[0]), Double.parseDouble(vals[1]));
		}
		return null;
	}
	protected IotNode locationInit() {
		Wrap<Point> locationWrap = new Wrap<Point>().var("location");
		if(location == null) {
			_location(locationWrap);
			setLocation(locationWrap.o);
		}
		return (IotNode)this;
	}

	public static Point staticSearchLocation(SiteRequestEnUS siteRequest_, Point o) {
		return o;
	}

	public static String staticSearchStrLocation(SiteRequestEnUS siteRequest_, Point o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqLocation(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrLocation(siteRequest_, IotNode.staticSearchLocation(siteRequest_, IotNode.staticSetLocation(siteRequest_, o)));
	}

	public Point sqlLocation() {
		return location;
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepIotNode(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepIotNode();
	}

	public Future<Void> promiseDeepIotNode() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseIotNode(promise2);
		promise2.future().onSuccess(a -> {
			super.promiseDeepBaseModel(siteRequest_).onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseIotNode(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				nodeNameInit();
				nodeTypeInit();
				nodeIdInit();
				locationInit();
				promise2.complete();
			} catch(Exception ex) {
				promise2.fail(ex);
			}
			return promise2.future();
		}).onSuccess(a -> {
			promise.complete();
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	@Override public Future<Void> promiseDeepForClass(SiteRequestEnUS siteRequest_) {
		return promiseDeepIotNode(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestIotNode(SiteRequestEnUS siteRequest_) {
			super.siteRequestBaseModel(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestIotNode(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainIotNode(v);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.obtainForClass(v);
			}
			else if(o instanceof Map) {
				Map<?, ?> map = (Map<?, ?>)o;
				o = map.get(v);
			}
		}
		return o;
	}
	public Object obtainIotNode(String var) {
		IotNode oIotNode = (IotNode)this;
		switch(var) {
			case "nodeName":
				return oIotNode.nodeName;
			case "nodeType":
				return oIotNode.nodeType;
			case "nodeId":
				return oIotNode.nodeId;
			case "location":
				return oIotNode.location;
			default:
				return super.obtainBaseModel(var);
		}
	}

	///////////////
	// relate //
	///////////////

	@Override public boolean relateForClass(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = relateIotNode(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateIotNode(String var, Object val) {
		IotNode oIotNode = (IotNode)this;
		switch(var) {
			default:
				return super.relateBaseModel(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetIotNode(entityVar,  siteRequest_, o);
	}
	public static Object staticSetIotNode(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "nodeName":
			return IotNode.staticSetNodeName(siteRequest_, o);
		case "nodeType":
			return IotNode.staticSetNodeType(siteRequest_, o);
		case "nodeId":
			return IotNode.staticSetNodeId(siteRequest_, o);
		case "location":
			return IotNode.staticSetLocation(siteRequest_, o);
			default:
				return BaseModel.staticSetBaseModel(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchIotNode(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchIotNode(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "nodeName":
			return IotNode.staticSearchNodeName(siteRequest_, (String)o);
		case "nodeType":
			return IotNode.staticSearchNodeType(siteRequest_, (String)o);
		case "nodeId":
			return IotNode.staticSearchNodeId(siteRequest_, (String)o);
		case "location":
			return IotNode.staticSearchLocation(siteRequest_, (Point)o);
			default:
				return BaseModel.staticSearchBaseModel(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrIotNode(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrIotNode(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "nodeName":
			return IotNode.staticSearchStrNodeName(siteRequest_, (String)o);
		case "nodeType":
			return IotNode.staticSearchStrNodeType(siteRequest_, (String)o);
		case "nodeId":
			return IotNode.staticSearchStrNodeId(siteRequest_, (String)o);
		case "location":
			return IotNode.staticSearchStrLocation(siteRequest_, (Point)o);
			default:
				return BaseModel.staticSearchStrBaseModel(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqIotNode(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqIotNode(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "nodeName":
			return IotNode.staticSearchFqNodeName(siteRequest_, o);
		case "nodeType":
			return IotNode.staticSearchFqNodeType(siteRequest_, o);
		case "nodeId":
			return IotNode.staticSearchFqNodeId(siteRequest_, o);
		case "location":
			return IotNode.staticSearchFqLocation(siteRequest_, o);
			default:
				return BaseModel.staticSearchFqBaseModel(entityVar,  siteRequest_, o);
		}
	}

	/////////////
	// persist //
	/////////////

	@Override public boolean persistForClass(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		if(val != null) {
			for(String v : vars) {
				if(o == null)
					o = persistIotNode(v, val);
				else if(o instanceof BaseModel) {
					BaseModel oBaseModel = (BaseModel)o;
					o = oBaseModel.persistForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object persistIotNode(String var, Object val) {
		switch(var.toLowerCase()) {
			case "nodename":
				if(val instanceof String)
					setNodeName((String)val);
				saves.add("nodeName");
				return val;
			case "nodetype":
				if(val instanceof String)
					setNodeType((String)val);
				saves.add("nodeType");
				return val;
			case "nodeid":
				if(val instanceof String)
					setNodeId((String)val);
				saves.add("nodeId");
				return val;
			case "location":
				if(val instanceof String)
					setLocation((String)val);
				else if(val instanceof Point)
					setLocation((Point)val);
				saves.add("location");
				return val;
			default:
				return super.persistBaseModel(var, val);
		}
	}

	/////////////
	// populate //
	/////////////

	@Override public void populateForClass(SolrResponse.Doc doc) {
		populateIotNode(doc);
	}
	public void populateIotNode(SolrResponse.Doc doc) {
		IotNode oIotNode = (IotNode)this;
		saves = doc.get("saves_docvalues_strings");
		if(saves != null) {
		}

		super.populateBaseModel(doc);
	}

	public void indexIotNode(JsonObject doc) {
		if(nodeName != null) {
			doc.put("nodeName_docvalues_string", nodeName);
		}
		if(nodeType != null) {
			doc.put("nodeType_docvalues_string", nodeType);
		}
		if(nodeId != null) {
			doc.put("nodeId_docvalues_string", nodeId);
		}
		if(location != null) {
			doc.put("location_docvalues_location", String.format("%s,%s", location.getX(), location.getY()));
		}
		super.indexBaseModel(doc);

	}

	public static String varStoredIotNode(String entityVar) {
		switch(entityVar) {
			case "nodeName":
				return "nodeName_docvalues_string";
			case "nodeType":
				return "nodeType_docvalues_string";
			case "nodeId":
				return "nodeId_docvalues_string";
			case "location":
				return "location_docvalues_location";
			default:
				return BaseModel.varStoredBaseModel(entityVar);
		}
	}

	public static String varIndexedIotNode(String entityVar) {
		switch(entityVar) {
			case "nodeName":
				return "nodeName_docvalues_string";
			case "nodeType":
				return "nodeType_docvalues_string";
			case "nodeId":
				return "nodeId_docvalues_string";
			case "location":
				return "location_docvalues_location";
			default:
				return BaseModel.varIndexedBaseModel(entityVar);
		}
	}

	public static String varSearchIotNode(String entityVar) {
		switch(entityVar) {
			default:
				return BaseModel.varSearchBaseModel(entityVar);
		}
	}

	public static String varSuggestedIotNode(String entityVar) {
		switch(entityVar) {
			default:
				return BaseModel.varSuggestedBaseModel(entityVar);
		}
	}

	/////////////
	// store //
	/////////////

	@Override public void storeForClass(SolrResponse.Doc doc) {
		storeIotNode(doc);
	}
	public void storeIotNode(SolrResponse.Doc doc) {
		IotNode oIotNode = (IotNode)this;

		oIotNode.setNodeName(Optional.ofNullable(doc.get("nodeName_docvalues_string")).map(v -> v.toString()).orElse(null));
		oIotNode.setNodeType(Optional.ofNullable(doc.get("nodeType_docvalues_string")).map(v -> v.toString()).orElse(null));
		oIotNode.setNodeId(Optional.ofNullable(doc.get("nodeId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oIotNode.setLocation(Optional.ofNullable(doc.get("location_docvalues_location")).map(v -> v.toString()).orElse(null));

		super.storeBaseModel(doc);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestIotNode() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof IotNode) {
			IotNode original = (IotNode)o;
			if(!Objects.equals(nodeName, original.getNodeName()))
				apiRequest.addVars("nodeName");
			if(!Objects.equals(nodeType, original.getNodeType()))
				apiRequest.addVars("nodeType");
			if(!Objects.equals(nodeId, original.getNodeId()))
				apiRequest.addVars("nodeId");
			if(!Objects.equals(location, original.getLocation()))
				apiRequest.addVars("location");
			super.apiRequestBaseModel();
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(Optional.ofNullable(nodeName).map(v -> "nodeName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(nodeType).map(v -> "nodeType: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(nodeId).map(v -> "nodeId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(location).map(v -> "location: " + v + "\n").orElse(""));
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "IotNode";
	public static final String VAR_nodeName = "nodeName";
	public static final String VAR_nodeType = "nodeType";
	public static final String VAR_nodeId = "nodeId";
	public static final String VAR_location = "location";

	public static List<String> varsQForClass() {
		return IotNode.varsQIotNode(new ArrayList<String>());
	}
	public static List<String> varsQIotNode(List<String> vars) {
		BaseModel.varsQBaseModel(vars);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return IotNode.varsFqIotNode(new ArrayList<String>());
	}
	public static List<String> varsFqIotNode(List<String> vars) {
		vars.add(VAR_nodeName);
		vars.add(VAR_nodeType);
		vars.add(VAR_nodeId);
		vars.add(VAR_location);
		BaseModel.varsFqBaseModel(vars);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return IotNode.varsRangeIotNode(new ArrayList<String>());
	}
	public static List<String> varsRangeIotNode(List<String> vars) {
		vars.add(VAR_location);
		BaseModel.varsRangeBaseModel(vars);
		return vars;
	}

	public static final String DISPLAY_NAME_nodeName = "node name";
	public static final String DISPLAY_NAME_nodeType = "node type";
	public static final String DISPLAY_NAME_nodeId = "node ID";
	public static final String DISPLAY_NAME_location = "location";

	public static String displayNameForClass(String var) {
		return IotNode.displayNameIotNode(var);
	}
	public static String displayNameIotNode(String var) {
		switch(var) {
		case VAR_nodeName:
			return DISPLAY_NAME_nodeName;
		case VAR_nodeType:
			return DISPLAY_NAME_nodeType;
		case VAR_nodeId:
			return DISPLAY_NAME_nodeId;
		case VAR_location:
			return DISPLAY_NAME_location;
		default:
			return BaseModel.displayNameBaseModel(var);
		}
	}

	public static String descriptionIotNode(String var) {
		switch(var) {
			default:
				return BaseModel.descriptionBaseModel(var);
		}
	}

	public static String classSimpleNameIotNode(String var) {
		switch(var) {
		case VAR_nodeName:
			return "String";
		case VAR_nodeType:
			return "String";
		case VAR_nodeId:
			return "String";
		case VAR_location:
			return "Point";
			default:
				return BaseModel.classSimpleNameBaseModel(var);
		}
	}

	public static Integer htmlColumnIotNode(String var) {
		switch(var) {
			default:
				return BaseModel.htmlColumnBaseModel(var);
		}
	}

	public static Integer htmlRowIotNode(String var) {
		switch(var) {
		case VAR_nodeName:
			return 3;
		case VAR_nodeType:
			return 3;
		case VAR_nodeId:
			return 3;
		case VAR_location:
			return 3;
			default:
				return BaseModel.htmlRowBaseModel(var);
		}
	}

	public static Integer htmlCellIotNode(String var) {
		switch(var) {
		case VAR_nodeName:
			return 1;
		case VAR_nodeType:
			return 2;
		case VAR_nodeId:
			return 3;
		case VAR_location:
			return 3;
			default:
				return BaseModel.htmlCellBaseModel(var);
		}
	}

	public static Integer lengthMinIotNode(String var) {
		switch(var) {
			default:
				return BaseModel.lengthMinBaseModel(var);
		}
	}

	public static Integer lengthMaxIotNode(String var) {
		switch(var) {
			default:
				return BaseModel.lengthMaxBaseModel(var);
		}
	}

	public static Integer maxIotNode(String var) {
		switch(var) {
			default:
				return BaseModel.maxBaseModel(var);
		}
	}

	public static Integer minIotNode(String var) {
		switch(var) {
			default:
				return BaseModel.minBaseModel(var);
		}
	}
}
