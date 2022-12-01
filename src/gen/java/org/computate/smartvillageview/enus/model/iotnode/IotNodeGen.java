package org.computate.smartvillageview.enus.model.iotnode;

import org.computate.smartvillageview.enus.request.SiteRequestEnUS;
import org.computate.smartvillageview.enus.model.base.BaseModel;
import org.computate.vertx.api.ApiRequest;
import org.computate.vertx.config.ComputateConfigKeys;
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
import org.computate.smartvillageview.enus.result.base.BaseResult;
import io.vertx.core.json.JsonObject;
import java.lang.String;
import io.vertx.pgclient.data.Point;
import org.computate.vertx.serialize.pgclient.PgClientPointSerializer;
import org.computate.vertx.serialize.pgclient.PgClientPointDeserializer;
import java.math.BigDecimal;
import java.lang.Boolean;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;

/**	
<ol>
0<h3>Suggestions that can generate more code for you: </h3></ol>
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class IotNodeGen into the class IotNode. 
 * </li><li>You can add a class comment "Model: true" if you wish to persist these IotNode objects in a relational PostgreSQL database transactionally in the RESTful API. 
 * The code to persist and query the IotNodeGen data in the database will then be automatically generated. 
 * </li>
 * <h3>About the IotNode class and it's generated class IotNodeGen&lt;BaseResult&gt;: </h3>extends IotNodeGen
 * <p>
 * This Java class extends a generated Java class IotNodeGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode">Find the class IotNode in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends IotNodeGen<BaseResult>
 * <p>This <code>class IotNode extends IotNodeGen&lt;BaseResult&gt;</code>, which means it extends a newly generated IotNodeGen. 
 * The generated <code>class IotNodeGen extends BaseResult</code> which means that IotNode extends IotNodeGen which extends BaseResult. 
 * This generated inheritance is a powerful feature that allows a lot of boiler plate code to be created for you automatically while still preserving inheritance through the power of Java Generic classes. 
 * </p>
 * Api: true
 * <p>This class contains a comment <b>"Api: true"</b>, which means this class will have Java Vert.x API backend code generated for these objects. 
 * </p>
 * ApiMethode.enUS: true
 * <p>This class contains a comment <b>"ApiTag: IOT Node"</b>, which groups all of the OpenAPIs for IotNode objects under the tag "IOT Node". 
 * </p>
 * ApiMethode.enUS: true
 * <p>This class contains a comment <b>"ApiTag: IOT Node"</b>, which groups all of the OpenAPIs for IotNode objects under the tag "IOT Node". 
 * </p>
 * ApiMethode.enUS: true
 * <p>This class contains a comment <b>"ApiTag: IOT Node"</b>, which groups all of the OpenAPIs for IotNode objects under the tag "IOT Node". 
 * </p>
 * ApiMethode.enUS: true
 * <p>This class contains a comment <b>"ApiTag: IOT Node"</b>, which groups all of the OpenAPIs for IotNode objects under the tag "IOT Node". 
 * </p>
 * ApiMethode.enUS: true
 * <p>This class contains a comment <b>"ApiTag: IOT Node"</b>, which groups all of the OpenAPIs for IotNode objects under the tag "IOT Node". 
 * </p>
 * ApiMethode.enUS: true
 * <p>This class contains a comment <b>"ApiTag: IOT Node"</b>, which groups all of the OpenAPIs for IotNode objects under the tag "IOT Node". 
 * </p>
 * ApiTag.enUS: true
 * <p>This class contains a comment <b>"ApiTag: IOT Node"</b>, which groups all of the OpenAPIs for IotNode objects under the tag "IOT Node". 
 * </p>
 * ApiUri.enUS: /api/iot-node
 * <p>This class contains a comment <b>"ApiUri: /api/iot-node"</b>, which defines the base API URI for IotNode objects as "/api/iot-node" in the OpenAPI spec. 
 * </p>
 * Color: 2017-shaded-spruce
 * <p>This class contains a comment <b>"Color: 2017-shaded-spruce"</b>, which styles the IotNode page "2017-shaded-spruce". 
 * This will reference a CSS class defined by the stylesheets in the project that starts with "w3-". 
 * A css class of "w3-2017-shaded-spruce" is expected to exist in the project stylesheets, and is inspired by W3 CSS colors. 
 * See: <a href="https://www.w3schools.com/w3css/w3css_colors.asp">https://www.w3schools.com/w3css/w3css_colors.asp</a>. 
 * </p>
 * IconGroup: duotone
 * <p>This class contains a comment <b>"IconGroup: duotone"</b>, which adds icons on the IotNode page with a group of "duotone". 
 * This will reference a Font Awesome icon group that starts with "fa-" followed by the icon group "duotone", together is "fa-duotone". 
 * A Font Awesome icon group of "duotone" is expected to exist. 
 * The Font Awesome groups currently supported include: solid, regular, light, thin, duotone, sharp, and kit. 
 * See: <a href="https://fontawesome.com/docs/web/dig-deeper/styles">https://fontawesome.com/docs/web/dig-deeper/styles</a>. 
 * </p>
 * IconName: router
 * <p>This class contains a comment <b>"IconName: router"</b>, which adds icons on the IotNode page with a name of "router". 
 * This will reference a Font Awesome icon that starts with the icon group "fa-duotone fa-" followed by the icon name, which is "fa-duotone fa-router". 
 * A Font Awesome icon of "fa-duotone fa-router" is expected to exist. 
 * See: <a href="https://fontawesome.com/icons">https://fontawesome.com/icons</a>. 
 * </p>
 * Indexed: true
 * <p>This class contains a comment <b>"Indexed: true"</b>, which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * {@inheritDoc}
 * <p>By adding a class comment "{@inheritDoc}", the IotNode class will inherit the helpful inherited class comments from the super class IotNodeGen. 
 * </p>
 * Rows: 100
 * <p>This class contains a comment <b>"Rows: 100"</b>, which means the IotNode API will return a default of 100 records instead of 10 by default. 
 * Each API has built in pagination of the search records to ensure a user can query all the data a page at a time without running the application out of memory. 
 * </p>
 * Order: 12
 * <p>This class contains a comment <b>"Order: 12"</b>, which means this class will be sorted by the given number 12 ascending when code that relates to multiple classes at the same time is generated. 
 * </p>
 * Model: true
 * Page: true
 * <p>This class contains a comment <b>"Page: true"</b>, which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.smartvillageview.enus.model.iotnode.IotNodePage. 
 * </p>
 * SuperPage.enUS: MapResultPage
 * <p>This class contains a comment <b>"SuperPage.enUS: MapResultPage"</b>, which identifies the Java super class of the page code by it's class simple name "MapResultPage". 
 * This means that the newly created class org.computate.smartvillageview.enus.model.iotnode.IotNodePage extends org.computate.smartvillageview.enus.result.map.MapResultPage. 
 * </p>
 * Promise: true
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the IotNode Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
 * </p>
 * <p>
 *   Adding protected void methods beginning with an underscore with a Promise as the only parameter will automatically set `Promise: true`. 
 * </p>
 * <p>
 *   <pre>
 *   
 *   	protected void _promiseBefore(Promise&lt;Void&gt; promise) {
 *   		promise.complete();
 *   	}
 *   </pre>
 * </p>
 * <p>
 *   Java classes with the `Model: true` will automatically set `Promise: true`. 
 * </p>
 * <p>
 *   If a super class of this Java class with `Model: true`, then the child class will also inherit `Promise: true`. 
 * </p>
 * Role.enUS: SiteAdmin
 * <p>
 * This class contains a comment <b>"Role.enUS: SiteAdmin"</b>, which identifies the default role name "SiteAdmin" of the OAuth2/OpenID Connect user role required to access this IotNode API. 
 * It's possible to reconfigure the roles required to access the IotNode API by configuring an environment variable like this: 
 * </p>
 * <pre>AUTH_ROLES_REQUIRED_IotNode: ["SiteAdmin"]</pre>
 * AName.enUS: an IOT node
 * <p>This class contains a comment <b>"AName.enUS: an IOT node"</b>, which identifies the language context to describe a IotNode as "an IOT node". 
 * </p>
 * <p>
 * Delete the class IotNode in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.iotnode in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class IotNodeGen<DEV> extends BaseResult {
	protected static final Logger LOG = LoggerFactory.getLogger(IotNode.class);

	public static final String IotNode_AName_enUS = "an IOT node";
	public static final String IotNode_This_enUS = "this ";
	public static final String IotNode_ThisName_enUS = "this IOT node";
	public static final String IotNode_A_enUS = "a ";
	public static final String IotNode_TheName_enUS = "theIOT node";
	public static final String IotNode_NameSingular_enUS = "IOT node";
	public static final String IotNode_NamePlural_enUS = "IOT nodes";
	public static final String IotNode_NameActual_enUS = "current IOT node";
	public static final String IotNode_AllName_enUS = "all the IOT nodes";
	public static final String IotNode_SearchAllNameBy_enUS = "search IOT nodes by ";
	public static final String IotNode_Title_enUS = "IOT nodes";
	public static final String IotNode_ThePluralName_enUS = "the IOT nodes";
	public static final String IotNode_NoNameFound_enUS = "no IOT node found";
	public static final String IotNode_ApiUri_enUS = "/api/iot-node";
	public static final String IotNode_ApiUriSearchPage_enUS = "/iot-node";
	public static final String IotNode_OfName_enUS = "of IOT node";
	public static final String IotNode_ANameAdjective_enUS = "an IOT node";
	public static final String IotNode_NameAdjectiveSingular_enUS = "IOT node";
	public static final String IotNode_NameAdjectivePlural_enUS = "IOT nodes";
	public static final String Search_enUS_Uri = "/api/iot-node";
	public static final String Search_enUS_ImageUri = "/png/api/iot-node-999.png";
	public static final String GET_enUS_Uri = "/api/iot-node/{id}";
	public static final String GET_enUS_ImageUri = "/png/api/iot-node/{id}-999.png";
	public static final String PATCH_enUS_Uri = "/api/iot-node";
	public static final String PATCH_enUS_ImageUri = "/png/api/iot-node-999.png";
	public static final String POST_enUS_Uri = "/api/iot-node";
	public static final String POST_enUS_ImageUri = "/png/api/iot-node-999.png";
	public static final String PUTImport_enUS_Uri = "/api/iot-node-import";
	public static final String PUTImport_enUS_ImageUri = "/png/api/iot-node-import-999.png";
	public static final String SearchPage_enUS_Uri = "/iot-node";
	public static final String SearchPage_enUS_ImageUri = "/png/iot-node-999.png";

	public static final String IotNode_Color = "2017-shaded-spruce";
	public static final String IotNode_IconGroup = "duotone";
	public static final String IotNode_IconName = "router";
	public static final Integer IotNode_Rows = 100;

	//////////
	// json //
	//////////


	/**	 The entity json
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject json;

	/**	<br> The entity json
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json">Find the entity json in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json(Wrap<JsonObject> w);

	public JsonObject getJson() {
		return json;
	}

	public void setJson(JsonObject json) {
		this.json = json;
	}
	@JsonIgnore
	public void setJson(String o) {
		this.json = IotNode.staticSetJson(siteRequest_, o);
	}
	public static JsonObject staticSetJson(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected IotNode jsonInit() {
		Wrap<JsonObject> jsonWrap = new Wrap<JsonObject>().var("json");
		if(json == null) {
			_json(jsonWrap);
			setJson(jsonWrap.o);
		}
		return (IotNode)this;
	}

	public static JsonObject staticSearchJson(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrJson(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson(siteRequest_, IotNode.staticSearchJson(siteRequest_, IotNode.staticSetJson(siteRequest_, o)));
	}

	public JsonObject sqlJson() {
		return json;
	}

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

	///////////////////
	// json_moisture //
	///////////////////


	/**	 The entity json_moisture
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal json_moisture;

	/**	<br> The entity json_moisture
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_moisture">Find the entity json_moisture in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_moisture(Wrap<BigDecimal> w);

	public BigDecimal getJson_moisture() {
		return json_moisture;
	}

	public void setJson_moisture(BigDecimal json_moisture) {
		this.json_moisture = json_moisture;
	}
	@JsonIgnore
	public void setJson_moisture(String o) {
		this.json_moisture = IotNode.staticSetJson_moisture(siteRequest_, o);
	}
	public static BigDecimal staticSetJson_moisture(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setJson_moisture(Double o) {
			this.json_moisture = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setJson_moisture(Integer o) {
			this.json_moisture = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected IotNode json_moistureInit() {
		Wrap<BigDecimal> json_moistureWrap = new Wrap<BigDecimal>().var("json_moisture");
		if(json_moisture == null) {
			_json_moisture(json_moistureWrap);
			setJson_moisture(json_moistureWrap.o);
		}
		return (IotNode)this;
	}

	public static Double staticSearchJson_moisture(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_moisture(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_moisture(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_moisture(siteRequest_, IotNode.staticSearchJson_moisture(siteRequest_, IotNode.staticSetJson_moisture(siteRequest_, o)));
	}

	////////////////////
	// json_moisture0 //
	////////////////////


	/**	 The entity json_moisture0
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal json_moisture0;

	/**	<br> The entity json_moisture0
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_moisture0">Find the entity json_moisture0 in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_moisture0(Wrap<BigDecimal> w);

	public BigDecimal getJson_moisture0() {
		return json_moisture0;
	}

	public void setJson_moisture0(BigDecimal json_moisture0) {
		this.json_moisture0 = json_moisture0;
	}
	@JsonIgnore
	public void setJson_moisture0(String o) {
		this.json_moisture0 = IotNode.staticSetJson_moisture0(siteRequest_, o);
	}
	public static BigDecimal staticSetJson_moisture0(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setJson_moisture0(Double o) {
			this.json_moisture0 = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setJson_moisture0(Integer o) {
			this.json_moisture0 = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected IotNode json_moisture0Init() {
		Wrap<BigDecimal> json_moisture0Wrap = new Wrap<BigDecimal>().var("json_moisture0");
		if(json_moisture0 == null) {
			_json_moisture0(json_moisture0Wrap);
			setJson_moisture0(json_moisture0Wrap.o);
		}
		return (IotNode)this;
	}

	public static Double staticSearchJson_moisture0(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_moisture0(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_moisture0(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_moisture0(siteRequest_, IotNode.staticSearchJson_moisture0(siteRequest_, IotNode.staticSetJson_moisture0(siteRequest_, o)));
	}

	////////////////////
	// json_moisture1 //
	////////////////////


	/**	 The entity json_moisture1
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal json_moisture1;

	/**	<br> The entity json_moisture1
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_moisture1">Find the entity json_moisture1 in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_moisture1(Wrap<BigDecimal> w);

	public BigDecimal getJson_moisture1() {
		return json_moisture1;
	}

	public void setJson_moisture1(BigDecimal json_moisture1) {
		this.json_moisture1 = json_moisture1;
	}
	@JsonIgnore
	public void setJson_moisture1(String o) {
		this.json_moisture1 = IotNode.staticSetJson_moisture1(siteRequest_, o);
	}
	public static BigDecimal staticSetJson_moisture1(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setJson_moisture1(Double o) {
			this.json_moisture1 = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setJson_moisture1(Integer o) {
			this.json_moisture1 = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected IotNode json_moisture1Init() {
		Wrap<BigDecimal> json_moisture1Wrap = new Wrap<BigDecimal>().var("json_moisture1");
		if(json_moisture1 == null) {
			_json_moisture1(json_moisture1Wrap);
			setJson_moisture1(json_moisture1Wrap.o);
		}
		return (IotNode)this;
	}

	public static Double staticSearchJson_moisture1(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_moisture1(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_moisture1(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_moisture1(siteRequest_, IotNode.staticSearchJson_moisture1(siteRequest_, IotNode.staticSetJson_moisture1(siteRequest_, o)));
	}

	//////////////////////
	// json_temperature //
	//////////////////////


	/**	 The entity json_temperature
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal json_temperature;

	/**	<br> The entity json_temperature
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_temperature">Find the entity json_temperature in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_temperature(Wrap<BigDecimal> w);

	public BigDecimal getJson_temperature() {
		return json_temperature;
	}

	public void setJson_temperature(BigDecimal json_temperature) {
		this.json_temperature = json_temperature;
	}
	@JsonIgnore
	public void setJson_temperature(String o) {
		this.json_temperature = IotNode.staticSetJson_temperature(siteRequest_, o);
	}
	public static BigDecimal staticSetJson_temperature(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setJson_temperature(Double o) {
			this.json_temperature = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setJson_temperature(Integer o) {
			this.json_temperature = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected IotNode json_temperatureInit() {
		Wrap<BigDecimal> json_temperatureWrap = new Wrap<BigDecimal>().var("json_temperature");
		if(json_temperature == null) {
			_json_temperature(json_temperatureWrap);
			setJson_temperature(json_temperatureWrap.o);
		}
		return (IotNode)this;
	}

	public static Double staticSearchJson_temperature(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_temperature(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_temperature(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_temperature(siteRequest_, IotNode.staticSearchJson_temperature(siteRequest_, IotNode.staticSetJson_temperature(siteRequest_, o)));
	}

	///////////////////////
	// json_temperature0 //
	///////////////////////


	/**	 The entity json_temperature0
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal json_temperature0;

	/**	<br> The entity json_temperature0
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_temperature0">Find the entity json_temperature0 in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_temperature0(Wrap<BigDecimal> w);

	public BigDecimal getJson_temperature0() {
		return json_temperature0;
	}

	public void setJson_temperature0(BigDecimal json_temperature0) {
		this.json_temperature0 = json_temperature0;
	}
	@JsonIgnore
	public void setJson_temperature0(String o) {
		this.json_temperature0 = IotNode.staticSetJson_temperature0(siteRequest_, o);
	}
	public static BigDecimal staticSetJson_temperature0(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setJson_temperature0(Double o) {
			this.json_temperature0 = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setJson_temperature0(Integer o) {
			this.json_temperature0 = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected IotNode json_temperature0Init() {
		Wrap<BigDecimal> json_temperature0Wrap = new Wrap<BigDecimal>().var("json_temperature0");
		if(json_temperature0 == null) {
			_json_temperature0(json_temperature0Wrap);
			setJson_temperature0(json_temperature0Wrap.o);
		}
		return (IotNode)this;
	}

	public static Double staticSearchJson_temperature0(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_temperature0(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_temperature0(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_temperature0(siteRequest_, IotNode.staticSearchJson_temperature0(siteRequest_, IotNode.staticSetJson_temperature0(siteRequest_, o)));
	}

	/////////////////////////////
	// json_temperatureAverage //
	/////////////////////////////


	/**	 The entity json_temperatureAverage
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal json_temperatureAverage;

	/**	<br> The entity json_temperatureAverage
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_temperatureAverage">Find the entity json_temperatureAverage in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_temperatureAverage(Wrap<BigDecimal> w);

	public BigDecimal getJson_temperatureAverage() {
		return json_temperatureAverage;
	}

	public void setJson_temperatureAverage(BigDecimal json_temperatureAverage) {
		this.json_temperatureAverage = json_temperatureAverage;
	}
	@JsonIgnore
	public void setJson_temperatureAverage(String o) {
		this.json_temperatureAverage = IotNode.staticSetJson_temperatureAverage(siteRequest_, o);
	}
	public static BigDecimal staticSetJson_temperatureAverage(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setJson_temperatureAverage(Double o) {
			this.json_temperatureAverage = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setJson_temperatureAverage(Integer o) {
			this.json_temperatureAverage = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected IotNode json_temperatureAverageInit() {
		Wrap<BigDecimal> json_temperatureAverageWrap = new Wrap<BigDecimal>().var("json_temperatureAverage");
		if(json_temperatureAverage == null) {
			_json_temperatureAverage(json_temperatureAverageWrap);
			setJson_temperatureAverage(json_temperatureAverageWrap.o);
		}
		return (IotNode)this;
	}

	public static Double staticSearchJson_temperatureAverage(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_temperatureAverage(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_temperatureAverage(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_temperatureAverage(siteRequest_, IotNode.staticSearchJson_temperatureAverage(siteRequest_, IotNode.staticSetJson_temperatureAverage(siteRequest_, o)));
	}

	///////////////////////////////
	// json_badConditionsCounter //
	///////////////////////////////


	/**	 The entity json_badConditionsCounter
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal json_badConditionsCounter;

	/**	<br> The entity json_badConditionsCounter
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_badConditionsCounter">Find the entity json_badConditionsCounter in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_badConditionsCounter(Wrap<BigDecimal> w);

	public BigDecimal getJson_badConditionsCounter() {
		return json_badConditionsCounter;
	}

	public void setJson_badConditionsCounter(BigDecimal json_badConditionsCounter) {
		this.json_badConditionsCounter = json_badConditionsCounter;
	}
	@JsonIgnore
	public void setJson_badConditionsCounter(String o) {
		this.json_badConditionsCounter = IotNode.staticSetJson_badConditionsCounter(siteRequest_, o);
	}
	public static BigDecimal staticSetJson_badConditionsCounter(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setJson_badConditionsCounter(Double o) {
			this.json_badConditionsCounter = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setJson_badConditionsCounter(Integer o) {
			this.json_badConditionsCounter = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected IotNode json_badConditionsCounterInit() {
		Wrap<BigDecimal> json_badConditionsCounterWrap = new Wrap<BigDecimal>().var("json_badConditionsCounter");
		if(json_badConditionsCounter == null) {
			_json_badConditionsCounter(json_badConditionsCounterWrap);
			setJson_badConditionsCounter(json_badConditionsCounterWrap.o);
		}
		return (IotNode)this;
	}

	public static Double staticSearchJson_badConditionsCounter(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_badConditionsCounter(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_badConditionsCounter(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_badConditionsCounter(siteRequest_, IotNode.staticSearchJson_badConditionsCounter(siteRequest_, IotNode.staticSetJson_badConditionsCounter(siteRequest_, o)));
	}

	///////////////
	// json_door //
	///////////////


	/**	 The entity json_door
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String json_door;

	/**	<br> The entity json_door
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_door">Find the entity json_door in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_door(Wrap<String> w);

	public String getJson_door() {
		return json_door;
	}
	public void setJson_door(String o) {
		this.json_door = IotNode.staticSetJson_door(siteRequest_, o);
	}
	public static String staticSetJson_door(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected IotNode json_doorInit() {
		Wrap<String> json_doorWrap = new Wrap<String>().var("json_door");
		if(json_door == null) {
			_json_door(json_doorWrap);
			setJson_door(json_doorWrap.o);
		}
		return (IotNode)this;
	}

	public static String staticSearchJson_door(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrJson_door(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_door(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_door(siteRequest_, IotNode.staticSearchJson_door(siteRequest_, IotNode.staticSetJson_door(siteRequest_, o)));
	}

	////////////////////
	// json_alarmDoor //
	////////////////////


	/**	 The entity json_alarmDoor
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Boolean json_alarmDoor;

	/**	<br> The entity json_alarmDoor
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_alarmDoor">Find the entity json_alarmDoor in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_alarmDoor(Wrap<Boolean> w);

	public Boolean getJson_alarmDoor() {
		return json_alarmDoor;
	}

	public void setJson_alarmDoor(Boolean json_alarmDoor) {
		this.json_alarmDoor = json_alarmDoor;
	}
	@JsonIgnore
	public void setJson_alarmDoor(String o) {
		this.json_alarmDoor = IotNode.staticSetJson_alarmDoor(siteRequest_, o);
	}
	public static Boolean staticSetJson_alarmDoor(SiteRequestEnUS siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected IotNode json_alarmDoorInit() {
		Wrap<Boolean> json_alarmDoorWrap = new Wrap<Boolean>().var("json_alarmDoor");
		if(json_alarmDoor == null) {
			_json_alarmDoor(json_alarmDoorWrap);
			setJson_alarmDoor(json_alarmDoorWrap.o);
		}
		return (IotNode)this;
	}

	public static Boolean staticSearchJson_alarmDoor(SiteRequestEnUS siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrJson_alarmDoor(SiteRequestEnUS siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_alarmDoor(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_alarmDoor(siteRequest_, IotNode.staticSearchJson_alarmDoor(siteRequest_, IotNode.staticSetJson_alarmDoor(siteRequest_, o)));
	}

	////////////////
	// json_flood //
	////////////////


	/**	 The entity json_flood
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal json_flood;

	/**	<br> The entity json_flood
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_flood">Find the entity json_flood in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_flood(Wrap<BigDecimal> w);

	public BigDecimal getJson_flood() {
		return json_flood;
	}

	public void setJson_flood(BigDecimal json_flood) {
		this.json_flood = json_flood;
	}
	@JsonIgnore
	public void setJson_flood(String o) {
		this.json_flood = IotNode.staticSetJson_flood(siteRequest_, o);
	}
	public static BigDecimal staticSetJson_flood(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setJson_flood(Double o) {
			this.json_flood = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setJson_flood(Integer o) {
			this.json_flood = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected IotNode json_floodInit() {
		Wrap<BigDecimal> json_floodWrap = new Wrap<BigDecimal>().var("json_flood");
		if(json_flood == null) {
			_json_flood(json_floodWrap);
			setJson_flood(json_floodWrap.o);
		}
		return (IotNode)this;
	}

	public static Double staticSearchJson_flood(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_flood(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_flood(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_flood(siteRequest_, IotNode.staticSearchJson_flood(siteRequest_, IotNode.staticSetJson_flood(siteRequest_, o)));
	}

	/////////////////////
	// json_alarmFlood //
	/////////////////////


	/**	 The entity json_alarmFlood
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Boolean json_alarmFlood;

	/**	<br> The entity json_alarmFlood
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_alarmFlood">Find the entity json_alarmFlood in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_alarmFlood(Wrap<Boolean> w);

	public Boolean getJson_alarmFlood() {
		return json_alarmFlood;
	}

	public void setJson_alarmFlood(Boolean json_alarmFlood) {
		this.json_alarmFlood = json_alarmFlood;
	}
	@JsonIgnore
	public void setJson_alarmFlood(String o) {
		this.json_alarmFlood = IotNode.staticSetJson_alarmFlood(siteRequest_, o);
	}
	public static Boolean staticSetJson_alarmFlood(SiteRequestEnUS siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected IotNode json_alarmFloodInit() {
		Wrap<Boolean> json_alarmFloodWrap = new Wrap<Boolean>().var("json_alarmFlood");
		if(json_alarmFlood == null) {
			_json_alarmFlood(json_alarmFloodWrap);
			setJson_alarmFlood(json_alarmFloodWrap.o);
		}
		return (IotNode)this;
	}

	public static Boolean staticSearchJson_alarmFlood(SiteRequestEnUS siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrJson_alarmFlood(SiteRequestEnUS siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_alarmFlood(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_alarmFlood(siteRequest_, IotNode.staticSearchJson_alarmFlood(siteRequest_, IotNode.staticSetJson_alarmFlood(siteRequest_, o)));
	}

	///////////////
	// json_lux2 //
	///////////////


	/**	 The entity json_lux2
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal json_lux2;

	/**	<br> The entity json_lux2
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_lux2">Find the entity json_lux2 in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_lux2(Wrap<BigDecimal> w);

	public BigDecimal getJson_lux2() {
		return json_lux2;
	}

	public void setJson_lux2(BigDecimal json_lux2) {
		this.json_lux2 = json_lux2;
	}
	@JsonIgnore
	public void setJson_lux2(String o) {
		this.json_lux2 = IotNode.staticSetJson_lux2(siteRequest_, o);
	}
	public static BigDecimal staticSetJson_lux2(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setJson_lux2(Double o) {
			this.json_lux2 = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setJson_lux2(Integer o) {
			this.json_lux2 = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected IotNode json_lux2Init() {
		Wrap<BigDecimal> json_lux2Wrap = new Wrap<BigDecimal>().var("json_lux2");
		if(json_lux2 == null) {
			_json_lux2(json_lux2Wrap);
			setJson_lux2(json_lux2Wrap.o);
		}
		return (IotNode)this;
	}

	public static Double staticSearchJson_lux2(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_lux2(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_lux2(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_lux2(siteRequest_, IotNode.staticSearchJson_lux2(siteRequest_, IotNode.staticSetJson_lux2(siteRequest_, o)));
	}

	//////////////////////
	// json_illuminance //
	//////////////////////


	/**	 The entity json_illuminance
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal json_illuminance;

	/**	<br> The entity json_illuminance
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_illuminance">Find the entity json_illuminance in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_illuminance(Wrap<BigDecimal> w);

	public BigDecimal getJson_illuminance() {
		return json_illuminance;
	}

	public void setJson_illuminance(BigDecimal json_illuminance) {
		this.json_illuminance = json_illuminance;
	}
	@JsonIgnore
	public void setJson_illuminance(String o) {
		this.json_illuminance = IotNode.staticSetJson_illuminance(siteRequest_, o);
	}
	public static BigDecimal staticSetJson_illuminance(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setJson_illuminance(Double o) {
			this.json_illuminance = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setJson_illuminance(Integer o) {
			this.json_illuminance = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected IotNode json_illuminanceInit() {
		Wrap<BigDecimal> json_illuminanceWrap = new Wrap<BigDecimal>().var("json_illuminance");
		if(json_illuminance == null) {
			_json_illuminance(json_illuminanceWrap);
			setJson_illuminance(json_illuminanceWrap.o);
		}
		return (IotNode)this;
	}

	public static Double staticSearchJson_illuminance(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_illuminance(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_illuminance(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_illuminance(siteRequest_, IotNode.staticSearchJson_illuminance(siteRequest_, IotNode.staticSetJson_illuminance(siteRequest_, o)));
	}

	//////////////////////
	// json_resistance0 //
	//////////////////////


	/**	 The entity json_resistance0
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal json_resistance0;

	/**	<br> The entity json_resistance0
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_resistance0">Find the entity json_resistance0 in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_resistance0(Wrap<BigDecimal> w);

	public BigDecimal getJson_resistance0() {
		return json_resistance0;
	}

	public void setJson_resistance0(BigDecimal json_resistance0) {
		this.json_resistance0 = json_resistance0;
	}
	@JsonIgnore
	public void setJson_resistance0(String o) {
		this.json_resistance0 = IotNode.staticSetJson_resistance0(siteRequest_, o);
	}
	public static BigDecimal staticSetJson_resistance0(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setJson_resistance0(Double o) {
			this.json_resistance0 = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setJson_resistance0(Integer o) {
			this.json_resistance0 = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected IotNode json_resistance0Init() {
		Wrap<BigDecimal> json_resistance0Wrap = new Wrap<BigDecimal>().var("json_resistance0");
		if(json_resistance0 == null) {
			_json_resistance0(json_resistance0Wrap);
			setJson_resistance0(json_resistance0Wrap.o);
		}
		return (IotNode)this;
	}

	public static Double staticSearchJson_resistance0(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_resistance0(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_resistance0(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_resistance0(siteRequest_, IotNode.staticSearchJson_resistance0(siteRequest_, IotNode.staticSetJson_resistance0(siteRequest_, o)));
	}

	//////////////////////
	// json_resistance1 //
	//////////////////////


	/**	 The entity json_resistance1
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal json_resistance1;

	/**	<br> The entity json_resistance1
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_resistance1">Find the entity json_resistance1 in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_resistance1(Wrap<BigDecimal> w);

	public BigDecimal getJson_resistance1() {
		return json_resistance1;
	}

	public void setJson_resistance1(BigDecimal json_resistance1) {
		this.json_resistance1 = json_resistance1;
	}
	@JsonIgnore
	public void setJson_resistance1(String o) {
		this.json_resistance1 = IotNode.staticSetJson_resistance1(siteRequest_, o);
	}
	public static BigDecimal staticSetJson_resistance1(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setJson_resistance1(Double o) {
			this.json_resistance1 = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setJson_resistance1(Integer o) {
			this.json_resistance1 = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected IotNode json_resistance1Init() {
		Wrap<BigDecimal> json_resistance1Wrap = new Wrap<BigDecimal>().var("json_resistance1");
		if(json_resistance1 == null) {
			_json_resistance1(json_resistance1Wrap);
			setJson_resistance1(json_resistance1Wrap.o);
		}
		return (IotNode)this;
	}

	public static Double staticSearchJson_resistance1(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_resistance1(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_resistance1(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_resistance1(siteRequest_, IotNode.staticSearchJson_resistance1(siteRequest_, IotNode.staticSetJson_resistance1(siteRequest_, o)));
	}

	////////////////////
	// json_frequency //
	////////////////////


	/**	 The entity json_frequency
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal json_frequency;

	/**	<br> The entity json_frequency
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_frequency">Find the entity json_frequency in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_frequency(Wrap<BigDecimal> w);

	public BigDecimal getJson_frequency() {
		return json_frequency;
	}

	public void setJson_frequency(BigDecimal json_frequency) {
		this.json_frequency = json_frequency;
	}
	@JsonIgnore
	public void setJson_frequency(String o) {
		this.json_frequency = IotNode.staticSetJson_frequency(siteRequest_, o);
	}
	public static BigDecimal staticSetJson_frequency(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setJson_frequency(Double o) {
			this.json_frequency = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setJson_frequency(Integer o) {
			this.json_frequency = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected IotNode json_frequencyInit() {
		Wrap<BigDecimal> json_frequencyWrap = new Wrap<BigDecimal>().var("json_frequency");
		if(json_frequency == null) {
			_json_frequency(json_frequencyWrap);
			setJson_frequency(json_frequencyWrap.o);
		}
		return (IotNode)this;
	}

	public static Double staticSearchJson_frequency(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_frequency(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_frequency(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_frequency(siteRequest_, IotNode.staticSearchJson_frequency(siteRequest_, IotNode.staticSetJson_frequency(siteRequest_, o)));
	}

	/////////////////
	// json_devEui //
	/////////////////


	/**	 The entity json_devEui
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String json_devEui;

	/**	<br> The entity json_devEui
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_devEui">Find the entity json_devEui in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_devEui(Wrap<String> w);

	public String getJson_devEui() {
		return json_devEui;
	}
	public void setJson_devEui(String o) {
		this.json_devEui = IotNode.staticSetJson_devEui(siteRequest_, o);
	}
	public static String staticSetJson_devEui(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected IotNode json_devEuiInit() {
		Wrap<String> json_devEuiWrap = new Wrap<String>().var("json_devEui");
		if(json_devEui == null) {
			_json_devEui(json_devEuiWrap);
			setJson_devEui(json_devEuiWrap.o);
		}
		return (IotNode)this;
	}

	public static String staticSearchJson_devEui(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrJson_devEui(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_devEui(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_devEui(siteRequest_, IotNode.staticSearchJson_devEui(siteRequest_, IotNode.staticSetJson_devEui(siteRequest_, o)));
	}

	////////////////////
	// json_bandwidth //
	////////////////////


	/**	 The entity json_bandwidth
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String json_bandwidth;

	/**	<br> The entity json_bandwidth
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_bandwidth">Find the entity json_bandwidth in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_bandwidth(Wrap<String> w);

	public String getJson_bandwidth() {
		return json_bandwidth;
	}
	public void setJson_bandwidth(String o) {
		this.json_bandwidth = IotNode.staticSetJson_bandwidth(siteRequest_, o);
	}
	public static String staticSetJson_bandwidth(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected IotNode json_bandwidthInit() {
		Wrap<String> json_bandwidthWrap = new Wrap<String>().var("json_bandwidth");
		if(json_bandwidth == null) {
			_json_bandwidth(json_bandwidthWrap);
			setJson_bandwidth(json_bandwidthWrap.o);
		}
		return (IotNode)this;
	}

	public static String staticSearchJson_bandwidth(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrJson_bandwidth(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_bandwidth(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_bandwidth(siteRequest_, IotNode.staticSearchJson_bandwidth(siteRequest_, IotNode.staticSetJson_bandwidth(siteRequest_, o)));
	}

	///////////////////
	// json_dataRate //
	///////////////////


	/**	 The entity json_dataRate
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal json_dataRate;

	/**	<br> The entity json_dataRate
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_dataRate">Find the entity json_dataRate in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_dataRate(Wrap<BigDecimal> w);

	public BigDecimal getJson_dataRate() {
		return json_dataRate;
	}

	public void setJson_dataRate(BigDecimal json_dataRate) {
		this.json_dataRate = json_dataRate;
	}
	@JsonIgnore
	public void setJson_dataRate(String o) {
		this.json_dataRate = IotNode.staticSetJson_dataRate(siteRequest_, o);
	}
	public static BigDecimal staticSetJson_dataRate(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setJson_dataRate(Double o) {
			this.json_dataRate = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setJson_dataRate(Integer o) {
			this.json_dataRate = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected IotNode json_dataRateInit() {
		Wrap<BigDecimal> json_dataRateWrap = new Wrap<BigDecimal>().var("json_dataRate");
		if(json_dataRate == null) {
			_json_dataRate(json_dataRateWrap);
			setJson_dataRate(json_dataRateWrap.o);
		}
		return (IotNode)this;
	}

	public static Double staticSearchJson_dataRate(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_dataRate(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_dataRate(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_dataRate(siteRequest_, IotNode.staticSearchJson_dataRate(siteRequest_, IotNode.staticSetJson_dataRate(siteRequest_, o)));
	}

	/////////////////////
	// json_frameCount //
	/////////////////////


	/**	 The entity json_frameCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal json_frameCount;

	/**	<br> The entity json_frameCount
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_frameCount">Find the entity json_frameCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_frameCount(Wrap<BigDecimal> w);

	public BigDecimal getJson_frameCount() {
		return json_frameCount;
	}

	public void setJson_frameCount(BigDecimal json_frameCount) {
		this.json_frameCount = json_frameCount;
	}
	@JsonIgnore
	public void setJson_frameCount(String o) {
		this.json_frameCount = IotNode.staticSetJson_frameCount(siteRequest_, o);
	}
	public static BigDecimal staticSetJson_frameCount(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setJson_frameCount(Double o) {
			this.json_frameCount = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setJson_frameCount(Integer o) {
			this.json_frameCount = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected IotNode json_frameCountInit() {
		Wrap<BigDecimal> json_frameCountWrap = new Wrap<BigDecimal>().var("json_frameCount");
		if(json_frameCount == null) {
			_json_frameCount(json_frameCountWrap);
			setJson_frameCount(json_frameCountWrap.o);
		}
		return (IotNode)this;
	}

	public static Double staticSearchJson_frameCount(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_frameCount(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_frameCount(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_frameCount(siteRequest_, IotNode.staticSearchJson_frameCount(siteRequest_, IotNode.staticSetJson_frameCount(siteRequest_, o)));
	}

	/////////////////////
	// json_maxPayload //
	/////////////////////


	/**	 The entity json_maxPayload
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal json_maxPayload;

	/**	<br> The entity json_maxPayload
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_maxPayload">Find the entity json_maxPayload in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_maxPayload(Wrap<BigDecimal> w);

	public BigDecimal getJson_maxPayload() {
		return json_maxPayload;
	}

	public void setJson_maxPayload(BigDecimal json_maxPayload) {
		this.json_maxPayload = json_maxPayload;
	}
	@JsonIgnore
	public void setJson_maxPayload(String o) {
		this.json_maxPayload = IotNode.staticSetJson_maxPayload(siteRequest_, o);
	}
	public static BigDecimal staticSetJson_maxPayload(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setJson_maxPayload(Double o) {
			this.json_maxPayload = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setJson_maxPayload(Integer o) {
			this.json_maxPayload = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected IotNode json_maxPayloadInit() {
		Wrap<BigDecimal> json_maxPayloadWrap = new Wrap<BigDecimal>().var("json_maxPayload");
		if(json_maxPayload == null) {
			_json_maxPayload(json_maxPayloadWrap);
			setJson_maxPayload(json_maxPayloadWrap.o);
		}
		return (IotNode)this;
	}

	public static Double staticSearchJson_maxPayload(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_maxPayload(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_maxPayload(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_maxPayload(siteRequest_, IotNode.staticSearchJson_maxPayload(siteRequest_, IotNode.staticSetJson_maxPayload(siteRequest_, o)));
	}

	////////////////////////
	// json_bitsPerSecond //
	////////////////////////


	/**	 The entity json_bitsPerSecond
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal json_bitsPerSecond;

	/**	<br> The entity json_bitsPerSecond
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_bitsPerSecond">Find the entity json_bitsPerSecond in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_bitsPerSecond(Wrap<BigDecimal> w);

	public BigDecimal getJson_bitsPerSecond() {
		return json_bitsPerSecond;
	}

	public void setJson_bitsPerSecond(BigDecimal json_bitsPerSecond) {
		this.json_bitsPerSecond = json_bitsPerSecond;
	}
	@JsonIgnore
	public void setJson_bitsPerSecond(String o) {
		this.json_bitsPerSecond = IotNode.staticSetJson_bitsPerSecond(siteRequest_, o);
	}
	public static BigDecimal staticSetJson_bitsPerSecond(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setJson_bitsPerSecond(Double o) {
			this.json_bitsPerSecond = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setJson_bitsPerSecond(Integer o) {
			this.json_bitsPerSecond = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected IotNode json_bitsPerSecondInit() {
		Wrap<BigDecimal> json_bitsPerSecondWrap = new Wrap<BigDecimal>().var("json_bitsPerSecond");
		if(json_bitsPerSecond == null) {
			_json_bitsPerSecond(json_bitsPerSecondWrap);
			setJson_bitsPerSecond(json_bitsPerSecondWrap.o);
		}
		return (IotNode)this;
	}

	public static Double staticSearchJson_bitsPerSecond(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_bitsPerSecond(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_bitsPerSecond(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_bitsPerSecond(siteRequest_, IotNode.staticSearchJson_bitsPerSecond(siteRequest_, IotNode.staticSetJson_bitsPerSecond(siteRequest_, o)));
	}

	/////////////////////////
	// json_batteryVoltage //
	/////////////////////////


	/**	 The entity json_batteryVoltage
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal json_batteryVoltage;

	/**	<br> The entity json_batteryVoltage
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_batteryVoltage">Find the entity json_batteryVoltage in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_batteryVoltage(Wrap<BigDecimal> w);

	public BigDecimal getJson_batteryVoltage() {
		return json_batteryVoltage;
	}

	public void setJson_batteryVoltage(BigDecimal json_batteryVoltage) {
		this.json_batteryVoltage = json_batteryVoltage;
	}
	@JsonIgnore
	public void setJson_batteryVoltage(String o) {
		this.json_batteryVoltage = IotNode.staticSetJson_batteryVoltage(siteRequest_, o);
	}
	public static BigDecimal staticSetJson_batteryVoltage(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setJson_batteryVoltage(Double o) {
			this.json_batteryVoltage = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setJson_batteryVoltage(Integer o) {
			this.json_batteryVoltage = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected IotNode json_batteryVoltageInit() {
		Wrap<BigDecimal> json_batteryVoltageWrap = new Wrap<BigDecimal>().var("json_batteryVoltage");
		if(json_batteryVoltage == null) {
			_json_batteryVoltage(json_batteryVoltageWrap);
			setJson_batteryVoltage(json_batteryVoltageWrap.o);
		}
		return (IotNode)this;
	}

	public static Double staticSearchJson_batteryVoltage(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_batteryVoltage(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_batteryVoltage(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_batteryVoltage(siteRequest_, IotNode.staticSearchJson_batteryVoltage(siteRequest_, IotNode.staticSetJson_batteryVoltage(siteRequest_, o)));
	}

	//////////////////////////
	// json_spreadingFactor //
	//////////////////////////


	/**	 The entity json_spreadingFactor
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal json_spreadingFactor;

	/**	<br> The entity json_spreadingFactor
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_spreadingFactor">Find the entity json_spreadingFactor in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_spreadingFactor(Wrap<BigDecimal> w);

	public BigDecimal getJson_spreadingFactor() {
		return json_spreadingFactor;
	}

	public void setJson_spreadingFactor(BigDecimal json_spreadingFactor) {
		this.json_spreadingFactor = json_spreadingFactor;
	}
	@JsonIgnore
	public void setJson_spreadingFactor(String o) {
		this.json_spreadingFactor = IotNode.staticSetJson_spreadingFactor(siteRequest_, o);
	}
	public static BigDecimal staticSetJson_spreadingFactor(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setJson_spreadingFactor(Double o) {
			this.json_spreadingFactor = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setJson_spreadingFactor(Integer o) {
			this.json_spreadingFactor = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected IotNode json_spreadingFactorInit() {
		Wrap<BigDecimal> json_spreadingFactorWrap = new Wrap<BigDecimal>().var("json_spreadingFactor");
		if(json_spreadingFactor == null) {
			_json_spreadingFactor(json_spreadingFactorWrap);
			setJson_spreadingFactor(json_spreadingFactorWrap.o);
		}
		return (IotNode)this;
	}

	public static Double staticSearchJson_spreadingFactor(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_spreadingFactor(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_spreadingFactor(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_spreadingFactor(siteRequest_, IotNode.staticSearchJson_spreadingFactor(siteRequest_, IotNode.staticSetJson_spreadingFactor(siteRequest_, o)));
	}

	///////////////////////////
	// json_dataRateAdaptive //
	///////////////////////////


	/**	 The entity json_dataRateAdaptive
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Boolean json_dataRateAdaptive;

	/**	<br> The entity json_dataRateAdaptive
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_dataRateAdaptive">Find the entity json_dataRateAdaptive in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_dataRateAdaptive(Wrap<Boolean> w);

	public Boolean getJson_dataRateAdaptive() {
		return json_dataRateAdaptive;
	}

	public void setJson_dataRateAdaptive(Boolean json_dataRateAdaptive) {
		this.json_dataRateAdaptive = json_dataRateAdaptive;
	}
	@JsonIgnore
	public void setJson_dataRateAdaptive(String o) {
		this.json_dataRateAdaptive = IotNode.staticSetJson_dataRateAdaptive(siteRequest_, o);
	}
	public static Boolean staticSetJson_dataRateAdaptive(SiteRequestEnUS siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected IotNode json_dataRateAdaptiveInit() {
		Wrap<Boolean> json_dataRateAdaptiveWrap = new Wrap<Boolean>().var("json_dataRateAdaptive");
		if(json_dataRateAdaptive == null) {
			_json_dataRateAdaptive(json_dataRateAdaptiveWrap);
			setJson_dataRateAdaptive(json_dataRateAdaptiveWrap.o);
		}
		return (IotNode)this;
	}

	public static Boolean staticSearchJson_dataRateAdaptive(SiteRequestEnUS siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrJson_dataRateAdaptive(SiteRequestEnUS siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_dataRateAdaptive(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_dataRateAdaptive(siteRequest_, IotNode.staticSearchJson_dataRateAdaptive(siteRequest_, IotNode.staticSetJson_dataRateAdaptive(siteRequest_, o)));
	}

	////////////////////
	// json_swversion //
	////////////////////


	/**	 The entity json_swversion
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String json_swversion;

	/**	<br> The entity json_swversion
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_swversion">Find the entity json_swversion in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_swversion(Wrap<String> w);

	public String getJson_swversion() {
		return json_swversion;
	}
	public void setJson_swversion(String o) {
		this.json_swversion = IotNode.staticSetJson_swversion(siteRequest_, o);
	}
	public static String staticSetJson_swversion(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected IotNode json_swversionInit() {
		Wrap<String> json_swversionWrap = new Wrap<String>().var("json_swversion");
		if(json_swversion == null) {
			_json_swversion(json_swversionWrap);
			setJson_swversion(json_swversionWrap.o);
		}
		return (IotNode)this;
	}

	public static String staticSearchJson_swversion(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrJson_swversion(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_swversion(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_swversion(siteRequest_, IotNode.staticSearchJson_swversion(siteRequest_, IotNode.staticSetJson_swversion(siteRequest_, o)));
	}

	///////////////////////
	// json_batteryLevel //
	///////////////////////


	/**	 The entity json_batteryLevel
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal json_batteryLevel;

	/**	<br> The entity json_batteryLevel
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_batteryLevel">Find the entity json_batteryLevel in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_batteryLevel(Wrap<BigDecimal> w);

	public BigDecimal getJson_batteryLevel() {
		return json_batteryLevel;
	}

	public void setJson_batteryLevel(BigDecimal json_batteryLevel) {
		this.json_batteryLevel = json_batteryLevel;
	}
	@JsonIgnore
	public void setJson_batteryLevel(String o) {
		this.json_batteryLevel = IotNode.staticSetJson_batteryLevel(siteRequest_, o);
	}
	public static BigDecimal staticSetJson_batteryLevel(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setJson_batteryLevel(Double o) {
			this.json_batteryLevel = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setJson_batteryLevel(Integer o) {
			this.json_batteryLevel = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected IotNode json_batteryLevelInit() {
		Wrap<BigDecimal> json_batteryLevelWrap = new Wrap<BigDecimal>().var("json_batteryLevel");
		if(json_batteryLevel == null) {
			_json_batteryLevel(json_batteryLevelWrap);
			setJson_batteryLevel(json_batteryLevelWrap.o);
		}
		return (IotNode)this;
	}

	public static Double staticSearchJson_batteryLevel(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_batteryLevel(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_batteryLevel(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_batteryLevel(siteRequest_, IotNode.staticSearchJson_batteryLevel(siteRequest_, IotNode.staticSetJson_batteryLevel(siteRequest_, o)));
	}

	///////////////////////
	// json_startUpCount //
	///////////////////////


	/**	 The entity json_startUpCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal json_startUpCount;

	/**	<br> The entity json_startUpCount
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_startUpCount">Find the entity json_startUpCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_startUpCount(Wrap<BigDecimal> w);

	public BigDecimal getJson_startUpCount() {
		return json_startUpCount;
	}

	public void setJson_startUpCount(BigDecimal json_startUpCount) {
		this.json_startUpCount = json_startUpCount;
	}
	@JsonIgnore
	public void setJson_startUpCount(String o) {
		this.json_startUpCount = IotNode.staticSetJson_startUpCount(siteRequest_, o);
	}
	public static BigDecimal staticSetJson_startUpCount(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setJson_startUpCount(Double o) {
			this.json_startUpCount = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setJson_startUpCount(Integer o) {
			this.json_startUpCount = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected IotNode json_startUpCountInit() {
		Wrap<BigDecimal> json_startUpCountWrap = new Wrap<BigDecimal>().var("json_startUpCount");
		if(json_startUpCount == null) {
			_json_startUpCount(json_startUpCountWrap);
			setJson_startUpCount(json_startUpCountWrap.o);
		}
		return (IotNode)this;
	}

	public static Double staticSearchJson_startUpCount(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_startUpCount(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_startUpCount(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_startUpCount(siteRequest_, IotNode.staticSearchJson_startUpCount(siteRequest_, IotNode.staticSetJson_startUpCount(siteRequest_, o)));
	}

	////////////////////////
	// json_watchdogCount //
	////////////////////////


	/**	 The entity json_watchdogCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal json_watchdogCount;

	/**	<br> The entity json_watchdogCount
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_watchdogCount">Find the entity json_watchdogCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_watchdogCount(Wrap<BigDecimal> w);

	public BigDecimal getJson_watchdogCount() {
		return json_watchdogCount;
	}

	public void setJson_watchdogCount(BigDecimal json_watchdogCount) {
		this.json_watchdogCount = json_watchdogCount;
	}
	@JsonIgnore
	public void setJson_watchdogCount(String o) {
		this.json_watchdogCount = IotNode.staticSetJson_watchdogCount(siteRequest_, o);
	}
	public static BigDecimal staticSetJson_watchdogCount(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setJson_watchdogCount(Double o) {
			this.json_watchdogCount = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setJson_watchdogCount(Integer o) {
			this.json_watchdogCount = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected IotNode json_watchdogCountInit() {
		Wrap<BigDecimal> json_watchdogCountWrap = new Wrap<BigDecimal>().var("json_watchdogCount");
		if(json_watchdogCount == null) {
			_json_watchdogCount(json_watchdogCountWrap);
			setJson_watchdogCount(json_watchdogCountWrap.o);
		}
		return (IotNode)this;
	}

	public static Double staticSearchJson_watchdogCount(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_watchdogCount(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_watchdogCount(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_watchdogCount(siteRequest_, IotNode.staticSearchJson_watchdogCount(siteRequest_, IotNode.staticSetJson_watchdogCount(siteRequest_, o)));
	}

	//////////////////////////
	// json_historySequence //
	//////////////////////////


	/**	 The entity json_historySequence
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal json_historySequence;

	/**	<br> The entity json_historySequence
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_historySequence">Find the entity json_historySequence in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_historySequence(Wrap<BigDecimal> w);

	public BigDecimal getJson_historySequence() {
		return json_historySequence;
	}

	public void setJson_historySequence(BigDecimal json_historySequence) {
		this.json_historySequence = json_historySequence;
	}
	@JsonIgnore
	public void setJson_historySequence(String o) {
		this.json_historySequence = IotNode.staticSetJson_historySequence(siteRequest_, o);
	}
	public static BigDecimal staticSetJson_historySequence(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setJson_historySequence(Double o) {
			this.json_historySequence = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setJson_historySequence(Integer o) {
			this.json_historySequence = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected IotNode json_historySequenceInit() {
		Wrap<BigDecimal> json_historySequenceWrap = new Wrap<BigDecimal>().var("json_historySequence");
		if(json_historySequence == null) {
			_json_historySequence(json_historySequenceWrap);
			setJson_historySequence(json_historySequenceWrap.o);
		}
		return (IotNode)this;
	}

	public static Double staticSearchJson_historySequence(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_historySequence(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_historySequence(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_historySequence(siteRequest_, IotNode.staticSearchJson_historySequence(siteRequest_, IotNode.staticSetJson_historySequence(siteRequest_, o)));
	}

	//////////////////////////
	// json_versionFirmware //
	//////////////////////////


	/**	 The entity json_versionFirmware
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String json_versionFirmware;

	/**	<br> The entity json_versionFirmware
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_versionFirmware">Find the entity json_versionFirmware in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_versionFirmware(Wrap<String> w);

	public String getJson_versionFirmware() {
		return json_versionFirmware;
	}
	public void setJson_versionFirmware(String o) {
		this.json_versionFirmware = IotNode.staticSetJson_versionFirmware(siteRequest_, o);
	}
	public static String staticSetJson_versionFirmware(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected IotNode json_versionFirmwareInit() {
		Wrap<String> json_versionFirmwareWrap = new Wrap<String>().var("json_versionFirmware");
		if(json_versionFirmware == null) {
			_json_versionFirmware(json_versionFirmwareWrap);
			setJson_versionFirmware(json_versionFirmwareWrap.o);
		}
		return (IotNode)this;
	}

	public static String staticSearchJson_versionFirmware(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrJson_versionFirmware(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_versionFirmware(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_versionFirmware(siteRequest_, IotNode.staticSearchJson_versionFirmware(siteRequest_, IotNode.staticSetJson_versionFirmware(siteRequest_, o)));
	}

	/////////////////////////////////
	// json_stackTxFailRebootCount //
	/////////////////////////////////


	/**	 The entity json_stackTxFailRebootCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal json_stackTxFailRebootCount;

	/**	<br> The entity json_stackTxFailRebootCount
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_stackTxFailRebootCount">Find the entity json_stackTxFailRebootCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_stackTxFailRebootCount(Wrap<BigDecimal> w);

	public BigDecimal getJson_stackTxFailRebootCount() {
		return json_stackTxFailRebootCount;
	}

	public void setJson_stackTxFailRebootCount(BigDecimal json_stackTxFailRebootCount) {
		this.json_stackTxFailRebootCount = json_stackTxFailRebootCount;
	}
	@JsonIgnore
	public void setJson_stackTxFailRebootCount(String o) {
		this.json_stackTxFailRebootCount = IotNode.staticSetJson_stackTxFailRebootCount(siteRequest_, o);
	}
	public static BigDecimal staticSetJson_stackTxFailRebootCount(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setJson_stackTxFailRebootCount(Double o) {
			this.json_stackTxFailRebootCount = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setJson_stackTxFailRebootCount(Integer o) {
			this.json_stackTxFailRebootCount = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected IotNode json_stackTxFailRebootCountInit() {
		Wrap<BigDecimal> json_stackTxFailRebootCountWrap = new Wrap<BigDecimal>().var("json_stackTxFailRebootCount");
		if(json_stackTxFailRebootCount == null) {
			_json_stackTxFailRebootCount(json_stackTxFailRebootCountWrap);
			setJson_stackTxFailRebootCount(json_stackTxFailRebootCountWrap.o);
		}
		return (IotNode)this;
	}

	public static Double staticSearchJson_stackTxFailRebootCount(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_stackTxFailRebootCount(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_stackTxFailRebootCount(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_stackTxFailRebootCount(siteRequest_, IotNode.staticSearchJson_stackTxFailRebootCount(siteRequest_, IotNode.staticSetJson_stackTxFailRebootCount(siteRequest_, o)));
	}

	//////////////////////////////////
	// json_historySequencePrevious //
	//////////////////////////////////


	/**	 The entity json_historySequencePrevious
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal json_historySequencePrevious;

	/**	<br> The entity json_historySequencePrevious
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_historySequencePrevious">Find the entity json_historySequencePrevious in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_historySequencePrevious(Wrap<BigDecimal> w);

	public BigDecimal getJson_historySequencePrevious() {
		return json_historySequencePrevious;
	}

	public void setJson_historySequencePrevious(BigDecimal json_historySequencePrevious) {
		this.json_historySequencePrevious = json_historySequencePrevious;
	}
	@JsonIgnore
	public void setJson_historySequencePrevious(String o) {
		this.json_historySequencePrevious = IotNode.staticSetJson_historySequencePrevious(siteRequest_, o);
	}
	public static BigDecimal staticSetJson_historySequencePrevious(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setJson_historySequencePrevious(Double o) {
			this.json_historySequencePrevious = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setJson_historySequencePrevious(Integer o) {
			this.json_historySequencePrevious = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected IotNode json_historySequencePreviousInit() {
		Wrap<BigDecimal> json_historySequencePreviousWrap = new Wrap<BigDecimal>().var("json_historySequencePrevious");
		if(json_historySequencePrevious == null) {
			_json_historySequencePrevious(json_historySequencePreviousWrap);
			setJson_historySequencePrevious(json_historySequencePreviousWrap.o);
		}
		return (IotNode)this;
	}

	public static Double staticSearchJson_historySequencePrevious(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_historySequencePrevious(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_historySequencePrevious(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_historySequencePrevious(siteRequest_, IotNode.staticSearchJson_historySequencePrevious(siteRequest_, IotNode.staticSetJson_historySequencePrevious(siteRequest_, o)));
	}

	//////////////
	// json_snr //
	//////////////


	/**	 The entity json_snr
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal json_snr;

	/**	<br> The entity json_snr
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_snr">Find the entity json_snr in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_snr(Wrap<BigDecimal> w);

	public BigDecimal getJson_snr() {
		return json_snr;
	}

	public void setJson_snr(BigDecimal json_snr) {
		this.json_snr = json_snr;
	}
	@JsonIgnore
	public void setJson_snr(String o) {
		this.json_snr = IotNode.staticSetJson_snr(siteRequest_, o);
	}
	public static BigDecimal staticSetJson_snr(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setJson_snr(Double o) {
			this.json_snr = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setJson_snr(Integer o) {
			this.json_snr = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected IotNode json_snrInit() {
		Wrap<BigDecimal> json_snrWrap = new Wrap<BigDecimal>().var("json_snr");
		if(json_snr == null) {
			_json_snr(json_snrWrap);
			setJson_snr(json_snrWrap.o);
		}
		return (IotNode)this;
	}

	public static Double staticSearchJson_snr(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_snr(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_snr(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_snr(siteRequest_, IotNode.staticSearchJson_snr(siteRequest_, IotNode.staticSetJson_snr(siteRequest_, o)));
	}

	///////////////
	// json_rssi //
	///////////////


	/**	 The entity json_rssi
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal json_rssi;

	/**	<br> The entity json_rssi
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.iotnode.IotNode&fq=entiteVar_enUS_indexed_string:json_rssi">Find the entity json_rssi in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_rssi(Wrap<BigDecimal> w);

	public BigDecimal getJson_rssi() {
		return json_rssi;
	}

	public void setJson_rssi(BigDecimal json_rssi) {
		this.json_rssi = json_rssi;
	}
	@JsonIgnore
	public void setJson_rssi(String o) {
		this.json_rssi = IotNode.staticSetJson_rssi(siteRequest_, o);
	}
	public static BigDecimal staticSetJson_rssi(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setJson_rssi(Double o) {
			this.json_rssi = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setJson_rssi(Integer o) {
			this.json_rssi = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected IotNode json_rssiInit() {
		Wrap<BigDecimal> json_rssiWrap = new Wrap<BigDecimal>().var("json_rssi");
		if(json_rssi == null) {
			_json_rssi(json_rssiWrap);
			setJson_rssi(json_rssiWrap.o);
		}
		return (IotNode)this;
	}

	public static Double staticSearchJson_rssi(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_rssi(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_rssi(SiteRequestEnUS siteRequest_, String o) {
		return IotNode.staticSearchStrJson_rssi(siteRequest_, IotNode.staticSearchJson_rssi(siteRequest_, IotNode.staticSetJson_rssi(siteRequest_, o)));
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
			super.promiseDeepBaseResult(siteRequest_).onSuccess(b -> {
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
				jsonInit();
				nodeNameInit();
				nodeTypeInit();
				nodeIdInit();
				locationInit();
				json_moistureInit();
				json_moisture0Init();
				json_moisture1Init();
				json_temperatureInit();
				json_temperature0Init();
				json_temperatureAverageInit();
				json_badConditionsCounterInit();
				json_doorInit();
				json_alarmDoorInit();
				json_floodInit();
				json_alarmFloodInit();
				json_lux2Init();
				json_illuminanceInit();
				json_resistance0Init();
				json_resistance1Init();
				json_frequencyInit();
				json_devEuiInit();
				json_bandwidthInit();
				json_dataRateInit();
				json_frameCountInit();
				json_maxPayloadInit();
				json_bitsPerSecondInit();
				json_batteryVoltageInit();
				json_spreadingFactorInit();
				json_dataRateAdaptiveInit();
				json_swversionInit();
				json_batteryLevelInit();
				json_startUpCountInit();
				json_watchdogCountInit();
				json_historySequenceInit();
				json_versionFirmwareInit();
				json_stackTxFailRebootCountInit();
				json_historySequencePreviousInit();
				json_snrInit();
				json_rssiInit();
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
			super.siteRequestBaseResult(siteRequest_);
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
			case "json":
				return oIotNode.json;
			case "nodeName":
				return oIotNode.nodeName;
			case "nodeType":
				return oIotNode.nodeType;
			case "nodeId":
				return oIotNode.nodeId;
			case "location":
				return oIotNode.location;
			case "json_moisture":
				return oIotNode.json_moisture;
			case "json_moisture0":
				return oIotNode.json_moisture0;
			case "json_moisture1":
				return oIotNode.json_moisture1;
			case "json_temperature":
				return oIotNode.json_temperature;
			case "json_temperature0":
				return oIotNode.json_temperature0;
			case "json_temperatureAverage":
				return oIotNode.json_temperatureAverage;
			case "json_badConditionsCounter":
				return oIotNode.json_badConditionsCounter;
			case "json_door":
				return oIotNode.json_door;
			case "json_alarmDoor":
				return oIotNode.json_alarmDoor;
			case "json_flood":
				return oIotNode.json_flood;
			case "json_alarmFlood":
				return oIotNode.json_alarmFlood;
			case "json_lux2":
				return oIotNode.json_lux2;
			case "json_illuminance":
				return oIotNode.json_illuminance;
			case "json_resistance0":
				return oIotNode.json_resistance0;
			case "json_resistance1":
				return oIotNode.json_resistance1;
			case "json_frequency":
				return oIotNode.json_frequency;
			case "json_devEui":
				return oIotNode.json_devEui;
			case "json_bandwidth":
				return oIotNode.json_bandwidth;
			case "json_dataRate":
				return oIotNode.json_dataRate;
			case "json_frameCount":
				return oIotNode.json_frameCount;
			case "json_maxPayload":
				return oIotNode.json_maxPayload;
			case "json_bitsPerSecond":
				return oIotNode.json_bitsPerSecond;
			case "json_batteryVoltage":
				return oIotNode.json_batteryVoltage;
			case "json_spreadingFactor":
				return oIotNode.json_spreadingFactor;
			case "json_dataRateAdaptive":
				return oIotNode.json_dataRateAdaptive;
			case "json_swversion":
				return oIotNode.json_swversion;
			case "json_batteryLevel":
				return oIotNode.json_batteryLevel;
			case "json_startUpCount":
				return oIotNode.json_startUpCount;
			case "json_watchdogCount":
				return oIotNode.json_watchdogCount;
			case "json_historySequence":
				return oIotNode.json_historySequence;
			case "json_versionFirmware":
				return oIotNode.json_versionFirmware;
			case "json_stackTxFailRebootCount":
				return oIotNode.json_stackTxFailRebootCount;
			case "json_historySequencePrevious":
				return oIotNode.json_historySequencePrevious;
			case "json_snr":
				return oIotNode.json_snr;
			case "json_rssi":
				return oIotNode.json_rssi;
			default:
				return super.obtainBaseResult(var);
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
				return super.relateBaseResult(var, val);
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
		case "json":
			return IotNode.staticSetJson(siteRequest_, o);
		case "nodeName":
			return IotNode.staticSetNodeName(siteRequest_, o);
		case "nodeType":
			return IotNode.staticSetNodeType(siteRequest_, o);
		case "nodeId":
			return IotNode.staticSetNodeId(siteRequest_, o);
		case "location":
			return IotNode.staticSetLocation(siteRequest_, o);
		case "json_moisture":
			return IotNode.staticSetJson_moisture(siteRequest_, o);
		case "json_moisture0":
			return IotNode.staticSetJson_moisture0(siteRequest_, o);
		case "json_moisture1":
			return IotNode.staticSetJson_moisture1(siteRequest_, o);
		case "json_temperature":
			return IotNode.staticSetJson_temperature(siteRequest_, o);
		case "json_temperature0":
			return IotNode.staticSetJson_temperature0(siteRequest_, o);
		case "json_temperatureAverage":
			return IotNode.staticSetJson_temperatureAverage(siteRequest_, o);
		case "json_badConditionsCounter":
			return IotNode.staticSetJson_badConditionsCounter(siteRequest_, o);
		case "json_door":
			return IotNode.staticSetJson_door(siteRequest_, o);
		case "json_alarmDoor":
			return IotNode.staticSetJson_alarmDoor(siteRequest_, o);
		case "json_flood":
			return IotNode.staticSetJson_flood(siteRequest_, o);
		case "json_alarmFlood":
			return IotNode.staticSetJson_alarmFlood(siteRequest_, o);
		case "json_lux2":
			return IotNode.staticSetJson_lux2(siteRequest_, o);
		case "json_illuminance":
			return IotNode.staticSetJson_illuminance(siteRequest_, o);
		case "json_resistance0":
			return IotNode.staticSetJson_resistance0(siteRequest_, o);
		case "json_resistance1":
			return IotNode.staticSetJson_resistance1(siteRequest_, o);
		case "json_frequency":
			return IotNode.staticSetJson_frequency(siteRequest_, o);
		case "json_devEui":
			return IotNode.staticSetJson_devEui(siteRequest_, o);
		case "json_bandwidth":
			return IotNode.staticSetJson_bandwidth(siteRequest_, o);
		case "json_dataRate":
			return IotNode.staticSetJson_dataRate(siteRequest_, o);
		case "json_frameCount":
			return IotNode.staticSetJson_frameCount(siteRequest_, o);
		case "json_maxPayload":
			return IotNode.staticSetJson_maxPayload(siteRequest_, o);
		case "json_bitsPerSecond":
			return IotNode.staticSetJson_bitsPerSecond(siteRequest_, o);
		case "json_batteryVoltage":
			return IotNode.staticSetJson_batteryVoltage(siteRequest_, o);
		case "json_spreadingFactor":
			return IotNode.staticSetJson_spreadingFactor(siteRequest_, o);
		case "json_dataRateAdaptive":
			return IotNode.staticSetJson_dataRateAdaptive(siteRequest_, o);
		case "json_swversion":
			return IotNode.staticSetJson_swversion(siteRequest_, o);
		case "json_batteryLevel":
			return IotNode.staticSetJson_batteryLevel(siteRequest_, o);
		case "json_startUpCount":
			return IotNode.staticSetJson_startUpCount(siteRequest_, o);
		case "json_watchdogCount":
			return IotNode.staticSetJson_watchdogCount(siteRequest_, o);
		case "json_historySequence":
			return IotNode.staticSetJson_historySequence(siteRequest_, o);
		case "json_versionFirmware":
			return IotNode.staticSetJson_versionFirmware(siteRequest_, o);
		case "json_stackTxFailRebootCount":
			return IotNode.staticSetJson_stackTxFailRebootCount(siteRequest_, o);
		case "json_historySequencePrevious":
			return IotNode.staticSetJson_historySequencePrevious(siteRequest_, o);
		case "json_snr":
			return IotNode.staticSetJson_snr(siteRequest_, o);
		case "json_rssi":
			return IotNode.staticSetJson_rssi(siteRequest_, o);
			default:
				return BaseResult.staticSetBaseResult(entityVar,  siteRequest_, o);
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
		case "json":
			return IotNode.staticSearchJson(siteRequest_, (JsonObject)o);
		case "nodeName":
			return IotNode.staticSearchNodeName(siteRequest_, (String)o);
		case "nodeType":
			return IotNode.staticSearchNodeType(siteRequest_, (String)o);
		case "nodeId":
			return IotNode.staticSearchNodeId(siteRequest_, (String)o);
		case "location":
			return IotNode.staticSearchLocation(siteRequest_, (Point)o);
		case "json_moisture":
			return IotNode.staticSearchJson_moisture(siteRequest_, (BigDecimal)o);
		case "json_moisture0":
			return IotNode.staticSearchJson_moisture0(siteRequest_, (BigDecimal)o);
		case "json_moisture1":
			return IotNode.staticSearchJson_moisture1(siteRequest_, (BigDecimal)o);
		case "json_temperature":
			return IotNode.staticSearchJson_temperature(siteRequest_, (BigDecimal)o);
		case "json_temperature0":
			return IotNode.staticSearchJson_temperature0(siteRequest_, (BigDecimal)o);
		case "json_temperatureAverage":
			return IotNode.staticSearchJson_temperatureAverage(siteRequest_, (BigDecimal)o);
		case "json_badConditionsCounter":
			return IotNode.staticSearchJson_badConditionsCounter(siteRequest_, (BigDecimal)o);
		case "json_door":
			return IotNode.staticSearchJson_door(siteRequest_, (String)o);
		case "json_alarmDoor":
			return IotNode.staticSearchJson_alarmDoor(siteRequest_, (Boolean)o);
		case "json_flood":
			return IotNode.staticSearchJson_flood(siteRequest_, (BigDecimal)o);
		case "json_alarmFlood":
			return IotNode.staticSearchJson_alarmFlood(siteRequest_, (Boolean)o);
		case "json_lux2":
			return IotNode.staticSearchJson_lux2(siteRequest_, (BigDecimal)o);
		case "json_illuminance":
			return IotNode.staticSearchJson_illuminance(siteRequest_, (BigDecimal)o);
		case "json_resistance0":
			return IotNode.staticSearchJson_resistance0(siteRequest_, (BigDecimal)o);
		case "json_resistance1":
			return IotNode.staticSearchJson_resistance1(siteRequest_, (BigDecimal)o);
		case "json_frequency":
			return IotNode.staticSearchJson_frequency(siteRequest_, (BigDecimal)o);
		case "json_devEui":
			return IotNode.staticSearchJson_devEui(siteRequest_, (String)o);
		case "json_bandwidth":
			return IotNode.staticSearchJson_bandwidth(siteRequest_, (String)o);
		case "json_dataRate":
			return IotNode.staticSearchJson_dataRate(siteRequest_, (BigDecimal)o);
		case "json_frameCount":
			return IotNode.staticSearchJson_frameCount(siteRequest_, (BigDecimal)o);
		case "json_maxPayload":
			return IotNode.staticSearchJson_maxPayload(siteRequest_, (BigDecimal)o);
		case "json_bitsPerSecond":
			return IotNode.staticSearchJson_bitsPerSecond(siteRequest_, (BigDecimal)o);
		case "json_batteryVoltage":
			return IotNode.staticSearchJson_batteryVoltage(siteRequest_, (BigDecimal)o);
		case "json_spreadingFactor":
			return IotNode.staticSearchJson_spreadingFactor(siteRequest_, (BigDecimal)o);
		case "json_dataRateAdaptive":
			return IotNode.staticSearchJson_dataRateAdaptive(siteRequest_, (Boolean)o);
		case "json_swversion":
			return IotNode.staticSearchJson_swversion(siteRequest_, (String)o);
		case "json_batteryLevel":
			return IotNode.staticSearchJson_batteryLevel(siteRequest_, (BigDecimal)o);
		case "json_startUpCount":
			return IotNode.staticSearchJson_startUpCount(siteRequest_, (BigDecimal)o);
		case "json_watchdogCount":
			return IotNode.staticSearchJson_watchdogCount(siteRequest_, (BigDecimal)o);
		case "json_historySequence":
			return IotNode.staticSearchJson_historySequence(siteRequest_, (BigDecimal)o);
		case "json_versionFirmware":
			return IotNode.staticSearchJson_versionFirmware(siteRequest_, (String)o);
		case "json_stackTxFailRebootCount":
			return IotNode.staticSearchJson_stackTxFailRebootCount(siteRequest_, (BigDecimal)o);
		case "json_historySequencePrevious":
			return IotNode.staticSearchJson_historySequencePrevious(siteRequest_, (BigDecimal)o);
		case "json_snr":
			return IotNode.staticSearchJson_snr(siteRequest_, (BigDecimal)o);
		case "json_rssi":
			return IotNode.staticSearchJson_rssi(siteRequest_, (BigDecimal)o);
			default:
				return BaseResult.staticSearchBaseResult(entityVar,  siteRequest_, o);
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
		case "json":
			return IotNode.staticSearchStrJson(siteRequest_, (JsonObject)o);
		case "nodeName":
			return IotNode.staticSearchStrNodeName(siteRequest_, (String)o);
		case "nodeType":
			return IotNode.staticSearchStrNodeType(siteRequest_, (String)o);
		case "nodeId":
			return IotNode.staticSearchStrNodeId(siteRequest_, (String)o);
		case "location":
			return IotNode.staticSearchStrLocation(siteRequest_, (Point)o);
		case "json_moisture":
			return IotNode.staticSearchStrJson_moisture(siteRequest_, (Double)o);
		case "json_moisture0":
			return IotNode.staticSearchStrJson_moisture0(siteRequest_, (Double)o);
		case "json_moisture1":
			return IotNode.staticSearchStrJson_moisture1(siteRequest_, (Double)o);
		case "json_temperature":
			return IotNode.staticSearchStrJson_temperature(siteRequest_, (Double)o);
		case "json_temperature0":
			return IotNode.staticSearchStrJson_temperature0(siteRequest_, (Double)o);
		case "json_temperatureAverage":
			return IotNode.staticSearchStrJson_temperatureAverage(siteRequest_, (Double)o);
		case "json_badConditionsCounter":
			return IotNode.staticSearchStrJson_badConditionsCounter(siteRequest_, (Double)o);
		case "json_door":
			return IotNode.staticSearchStrJson_door(siteRequest_, (String)o);
		case "json_alarmDoor":
			return IotNode.staticSearchStrJson_alarmDoor(siteRequest_, (Boolean)o);
		case "json_flood":
			return IotNode.staticSearchStrJson_flood(siteRequest_, (Double)o);
		case "json_alarmFlood":
			return IotNode.staticSearchStrJson_alarmFlood(siteRequest_, (Boolean)o);
		case "json_lux2":
			return IotNode.staticSearchStrJson_lux2(siteRequest_, (Double)o);
		case "json_illuminance":
			return IotNode.staticSearchStrJson_illuminance(siteRequest_, (Double)o);
		case "json_resistance0":
			return IotNode.staticSearchStrJson_resistance0(siteRequest_, (Double)o);
		case "json_resistance1":
			return IotNode.staticSearchStrJson_resistance1(siteRequest_, (Double)o);
		case "json_frequency":
			return IotNode.staticSearchStrJson_frequency(siteRequest_, (Double)o);
		case "json_devEui":
			return IotNode.staticSearchStrJson_devEui(siteRequest_, (String)o);
		case "json_bandwidth":
			return IotNode.staticSearchStrJson_bandwidth(siteRequest_, (String)o);
		case "json_dataRate":
			return IotNode.staticSearchStrJson_dataRate(siteRequest_, (Double)o);
		case "json_frameCount":
			return IotNode.staticSearchStrJson_frameCount(siteRequest_, (Double)o);
		case "json_maxPayload":
			return IotNode.staticSearchStrJson_maxPayload(siteRequest_, (Double)o);
		case "json_bitsPerSecond":
			return IotNode.staticSearchStrJson_bitsPerSecond(siteRequest_, (Double)o);
		case "json_batteryVoltage":
			return IotNode.staticSearchStrJson_batteryVoltage(siteRequest_, (Double)o);
		case "json_spreadingFactor":
			return IotNode.staticSearchStrJson_spreadingFactor(siteRequest_, (Double)o);
		case "json_dataRateAdaptive":
			return IotNode.staticSearchStrJson_dataRateAdaptive(siteRequest_, (Boolean)o);
		case "json_swversion":
			return IotNode.staticSearchStrJson_swversion(siteRequest_, (String)o);
		case "json_batteryLevel":
			return IotNode.staticSearchStrJson_batteryLevel(siteRequest_, (Double)o);
		case "json_startUpCount":
			return IotNode.staticSearchStrJson_startUpCount(siteRequest_, (Double)o);
		case "json_watchdogCount":
			return IotNode.staticSearchStrJson_watchdogCount(siteRequest_, (Double)o);
		case "json_historySequence":
			return IotNode.staticSearchStrJson_historySequence(siteRequest_, (Double)o);
		case "json_versionFirmware":
			return IotNode.staticSearchStrJson_versionFirmware(siteRequest_, (String)o);
		case "json_stackTxFailRebootCount":
			return IotNode.staticSearchStrJson_stackTxFailRebootCount(siteRequest_, (Double)o);
		case "json_historySequencePrevious":
			return IotNode.staticSearchStrJson_historySequencePrevious(siteRequest_, (Double)o);
		case "json_snr":
			return IotNode.staticSearchStrJson_snr(siteRequest_, (Double)o);
		case "json_rssi":
			return IotNode.staticSearchStrJson_rssi(siteRequest_, (Double)o);
			default:
				return BaseResult.staticSearchStrBaseResult(entityVar,  siteRequest_, o);
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
		case "json":
			return IotNode.staticSearchFqJson(siteRequest_, o);
		case "nodeName":
			return IotNode.staticSearchFqNodeName(siteRequest_, o);
		case "nodeType":
			return IotNode.staticSearchFqNodeType(siteRequest_, o);
		case "nodeId":
			return IotNode.staticSearchFqNodeId(siteRequest_, o);
		case "location":
			return IotNode.staticSearchFqLocation(siteRequest_, o);
		case "json_moisture":
			return IotNode.staticSearchFqJson_moisture(siteRequest_, o);
		case "json_moisture0":
			return IotNode.staticSearchFqJson_moisture0(siteRequest_, o);
		case "json_moisture1":
			return IotNode.staticSearchFqJson_moisture1(siteRequest_, o);
		case "json_temperature":
			return IotNode.staticSearchFqJson_temperature(siteRequest_, o);
		case "json_temperature0":
			return IotNode.staticSearchFqJson_temperature0(siteRequest_, o);
		case "json_temperatureAverage":
			return IotNode.staticSearchFqJson_temperatureAverage(siteRequest_, o);
		case "json_badConditionsCounter":
			return IotNode.staticSearchFqJson_badConditionsCounter(siteRequest_, o);
		case "json_door":
			return IotNode.staticSearchFqJson_door(siteRequest_, o);
		case "json_alarmDoor":
			return IotNode.staticSearchFqJson_alarmDoor(siteRequest_, o);
		case "json_flood":
			return IotNode.staticSearchFqJson_flood(siteRequest_, o);
		case "json_alarmFlood":
			return IotNode.staticSearchFqJson_alarmFlood(siteRequest_, o);
		case "json_lux2":
			return IotNode.staticSearchFqJson_lux2(siteRequest_, o);
		case "json_illuminance":
			return IotNode.staticSearchFqJson_illuminance(siteRequest_, o);
		case "json_resistance0":
			return IotNode.staticSearchFqJson_resistance0(siteRequest_, o);
		case "json_resistance1":
			return IotNode.staticSearchFqJson_resistance1(siteRequest_, o);
		case "json_frequency":
			return IotNode.staticSearchFqJson_frequency(siteRequest_, o);
		case "json_devEui":
			return IotNode.staticSearchFqJson_devEui(siteRequest_, o);
		case "json_bandwidth":
			return IotNode.staticSearchFqJson_bandwidth(siteRequest_, o);
		case "json_dataRate":
			return IotNode.staticSearchFqJson_dataRate(siteRequest_, o);
		case "json_frameCount":
			return IotNode.staticSearchFqJson_frameCount(siteRequest_, o);
		case "json_maxPayload":
			return IotNode.staticSearchFqJson_maxPayload(siteRequest_, o);
		case "json_bitsPerSecond":
			return IotNode.staticSearchFqJson_bitsPerSecond(siteRequest_, o);
		case "json_batteryVoltage":
			return IotNode.staticSearchFqJson_batteryVoltage(siteRequest_, o);
		case "json_spreadingFactor":
			return IotNode.staticSearchFqJson_spreadingFactor(siteRequest_, o);
		case "json_dataRateAdaptive":
			return IotNode.staticSearchFqJson_dataRateAdaptive(siteRequest_, o);
		case "json_swversion":
			return IotNode.staticSearchFqJson_swversion(siteRequest_, o);
		case "json_batteryLevel":
			return IotNode.staticSearchFqJson_batteryLevel(siteRequest_, o);
		case "json_startUpCount":
			return IotNode.staticSearchFqJson_startUpCount(siteRequest_, o);
		case "json_watchdogCount":
			return IotNode.staticSearchFqJson_watchdogCount(siteRequest_, o);
		case "json_historySequence":
			return IotNode.staticSearchFqJson_historySequence(siteRequest_, o);
		case "json_versionFirmware":
			return IotNode.staticSearchFqJson_versionFirmware(siteRequest_, o);
		case "json_stackTxFailRebootCount":
			return IotNode.staticSearchFqJson_stackTxFailRebootCount(siteRequest_, o);
		case "json_historySequencePrevious":
			return IotNode.staticSearchFqJson_historySequencePrevious(siteRequest_, o);
		case "json_snr":
			return IotNode.staticSearchFqJson_snr(siteRequest_, o);
		case "json_rssi":
			return IotNode.staticSearchFqJson_rssi(siteRequest_, o);
			default:
				return BaseResult.staticSearchFqBaseResult(entityVar,  siteRequest_, o);
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
		String varLower = var.toLowerCase();
			if("json".equals(varLower)) {
				if(val instanceof String) {
					setJson((String)val);
				} else if(val instanceof JsonObject) {
					setJson((JsonObject)val);
				}
				saves.add("json");
				return val;
			} else if("nodename".equals(varLower)) {
				if(val instanceof String) {
					setNodeName((String)val);
				}
				saves.add("nodeName");
				return val;
			} else if("nodetype".equals(varLower)) {
				if(val instanceof String) {
					setNodeType((String)val);
				}
				saves.add("nodeType");
				return val;
			} else if("nodeid".equals(varLower)) {
				if(val instanceof String) {
					setNodeId((String)val);
				}
				saves.add("nodeId");
				return val;
			} else if("location".equals(varLower)) {
				if(val instanceof String) {
					setLocation((String)val);
				} else if(val instanceof Point) {
					setLocation((Point)val);
				}
				saves.add("location");
				return val;
		} else {
			return super.persistBaseResult(var, val);
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

		super.populateBaseResult(doc);
	}

	public void indexIotNode(JsonObject doc) {
		if(json != null) {
			doc.put("json_docvalues_string", json.toString());
		}
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
		if(json_moisture != null) {
			doc.put("json_moisture_docvalues_double", json_moisture.doubleValue());
		}
		if(json_moisture0 != null) {
			doc.put("json_moisture0_docvalues_double", json_moisture0.doubleValue());
		}
		if(json_moisture1 != null) {
			doc.put("json_moisture1_docvalues_double", json_moisture1.doubleValue());
		}
		if(json_temperature != null) {
			doc.put("json_temperature_docvalues_double", json_temperature.doubleValue());
		}
		if(json_temperature0 != null) {
			doc.put("json_temperature0_docvalues_double", json_temperature0.doubleValue());
		}
		if(json_temperatureAverage != null) {
			doc.put("json_temperatureAverage_docvalues_double", json_temperatureAverage.doubleValue());
		}
		if(json_badConditionsCounter != null) {
			doc.put("json_badConditionsCounter_docvalues_double", json_badConditionsCounter.doubleValue());
		}
		if(json_door != null) {
			doc.put("json_door_docvalues_string", json_door);
		}
		if(json_alarmDoor != null) {
			doc.put("json_alarmDoor_docvalues_boolean", json_alarmDoor);
		}
		if(json_flood != null) {
			doc.put("json_flood_docvalues_double", json_flood.doubleValue());
		}
		if(json_alarmFlood != null) {
			doc.put("json_alarmFlood_docvalues_boolean", json_alarmFlood);
		}
		if(json_lux2 != null) {
			doc.put("json_lux2_docvalues_double", json_lux2.doubleValue());
		}
		if(json_illuminance != null) {
			doc.put("json_illuminance_docvalues_double", json_illuminance.doubleValue());
		}
		if(json_resistance0 != null) {
			doc.put("json_resistance0_docvalues_double", json_resistance0.doubleValue());
		}
		if(json_resistance1 != null) {
			doc.put("json_resistance1_docvalues_double", json_resistance1.doubleValue());
		}
		if(json_frequency != null) {
			doc.put("json_frequency_docvalues_double", json_frequency.doubleValue());
		}
		if(json_devEui != null) {
			doc.put("json_devEui_docvalues_string", json_devEui);
		}
		if(json_bandwidth != null) {
			doc.put("json_bandwidth_docvalues_string", json_bandwidth);
		}
		if(json_dataRate != null) {
			doc.put("json_dataRate_docvalues_double", json_dataRate.doubleValue());
		}
		if(json_frameCount != null) {
			doc.put("json_frameCount_docvalues_double", json_frameCount.doubleValue());
		}
		if(json_maxPayload != null) {
			doc.put("json_maxPayload_docvalues_double", json_maxPayload.doubleValue());
		}
		if(json_bitsPerSecond != null) {
			doc.put("json_bitsPerSecond_docvalues_double", json_bitsPerSecond.doubleValue());
		}
		if(json_batteryVoltage != null) {
			doc.put("json_batteryVoltage_docvalues_double", json_batteryVoltage.doubleValue());
		}
		if(json_spreadingFactor != null) {
			doc.put("json_spreadingFactor_docvalues_double", json_spreadingFactor.doubleValue());
		}
		if(json_dataRateAdaptive != null) {
			doc.put("json_dataRateAdaptive_docvalues_boolean", json_dataRateAdaptive);
		}
		if(json_swversion != null) {
			doc.put("json_swversion_docvalues_string", json_swversion);
		}
		if(json_batteryLevel != null) {
			doc.put("json_batteryLevel_docvalues_double", json_batteryLevel.doubleValue());
		}
		if(json_startUpCount != null) {
			doc.put("json_startUpCount_docvalues_double", json_startUpCount.doubleValue());
		}
		if(json_watchdogCount != null) {
			doc.put("json_watchdogCount_docvalues_double", json_watchdogCount.doubleValue());
		}
		if(json_historySequence != null) {
			doc.put("json_historySequence_docvalues_double", json_historySequence.doubleValue());
		}
		if(json_versionFirmware != null) {
			doc.put("json_versionFirmware_docvalues_string", json_versionFirmware);
		}
		if(json_stackTxFailRebootCount != null) {
			doc.put("json_stackTxFailRebootCount_docvalues_double", json_stackTxFailRebootCount.doubleValue());
		}
		if(json_historySequencePrevious != null) {
			doc.put("json_historySequencePrevious_docvalues_double", json_historySequencePrevious.doubleValue());
		}
		if(json_snr != null) {
			doc.put("json_snr_docvalues_double", json_snr.doubleValue());
		}
		if(json_rssi != null) {
			doc.put("json_rssi_docvalues_double", json_rssi.doubleValue());
		}
		super.indexBaseResult(doc);

	}

	public static String varStoredIotNode(String entityVar) {
		switch(entityVar) {
			case "json":
				return "json_docvalues_string";
			case "nodeName":
				return "nodeName_docvalues_string";
			case "nodeType":
				return "nodeType_docvalues_string";
			case "nodeId":
				return "nodeId_docvalues_string";
			case "location":
				return "location_docvalues_location";
			case "json_moisture":
				return "json_moisture_docvalues_double";
			case "json_moisture0":
				return "json_moisture0_docvalues_double";
			case "json_moisture1":
				return "json_moisture1_docvalues_double";
			case "json_temperature":
				return "json_temperature_docvalues_double";
			case "json_temperature0":
				return "json_temperature0_docvalues_double";
			case "json_temperatureAverage":
				return "json_temperatureAverage_docvalues_double";
			case "json_badConditionsCounter":
				return "json_badConditionsCounter_docvalues_double";
			case "json_door":
				return "json_door_docvalues_string";
			case "json_alarmDoor":
				return "json_alarmDoor_docvalues_boolean";
			case "json_flood":
				return "json_flood_docvalues_double";
			case "json_alarmFlood":
				return "json_alarmFlood_docvalues_boolean";
			case "json_lux2":
				return "json_lux2_docvalues_double";
			case "json_illuminance":
				return "json_illuminance_docvalues_double";
			case "json_resistance0":
				return "json_resistance0_docvalues_double";
			case "json_resistance1":
				return "json_resistance1_docvalues_double";
			case "json_frequency":
				return "json_frequency_docvalues_double";
			case "json_devEui":
				return "json_devEui_docvalues_string";
			case "json_bandwidth":
				return "json_bandwidth_docvalues_string";
			case "json_dataRate":
				return "json_dataRate_docvalues_double";
			case "json_frameCount":
				return "json_frameCount_docvalues_double";
			case "json_maxPayload":
				return "json_maxPayload_docvalues_double";
			case "json_bitsPerSecond":
				return "json_bitsPerSecond_docvalues_double";
			case "json_batteryVoltage":
				return "json_batteryVoltage_docvalues_double";
			case "json_spreadingFactor":
				return "json_spreadingFactor_docvalues_double";
			case "json_dataRateAdaptive":
				return "json_dataRateAdaptive_docvalues_boolean";
			case "json_swversion":
				return "json_swversion_docvalues_string";
			case "json_batteryLevel":
				return "json_batteryLevel_docvalues_double";
			case "json_startUpCount":
				return "json_startUpCount_docvalues_double";
			case "json_watchdogCount":
				return "json_watchdogCount_docvalues_double";
			case "json_historySequence":
				return "json_historySequence_docvalues_double";
			case "json_versionFirmware":
				return "json_versionFirmware_docvalues_string";
			case "json_stackTxFailRebootCount":
				return "json_stackTxFailRebootCount_docvalues_double";
			case "json_historySequencePrevious":
				return "json_historySequencePrevious_docvalues_double";
			case "json_snr":
				return "json_snr_docvalues_double";
			case "json_rssi":
				return "json_rssi_docvalues_double";
			default:
				return BaseResult.varStoredBaseResult(entityVar);
		}
	}

	public static String varIndexedIotNode(String entityVar) {
		switch(entityVar) {
			case "json":
				return "json_docvalues_string";
			case "nodeName":
				return "nodeName_docvalues_string";
			case "nodeType":
				return "nodeType_docvalues_string";
			case "nodeId":
				return "nodeId_docvalues_string";
			case "location":
				return "location_docvalues_location";
			case "json_moisture":
				return "json_moisture_docvalues_double";
			case "json_moisture0":
				return "json_moisture0_docvalues_double";
			case "json_moisture1":
				return "json_moisture1_docvalues_double";
			case "json_temperature":
				return "json_temperature_docvalues_double";
			case "json_temperature0":
				return "json_temperature0_docvalues_double";
			case "json_temperatureAverage":
				return "json_temperatureAverage_docvalues_double";
			case "json_badConditionsCounter":
				return "json_badConditionsCounter_docvalues_double";
			case "json_door":
				return "json_door_docvalues_string";
			case "json_alarmDoor":
				return "json_alarmDoor_docvalues_boolean";
			case "json_flood":
				return "json_flood_docvalues_double";
			case "json_alarmFlood":
				return "json_alarmFlood_docvalues_boolean";
			case "json_lux2":
				return "json_lux2_docvalues_double";
			case "json_illuminance":
				return "json_illuminance_docvalues_double";
			case "json_resistance0":
				return "json_resistance0_docvalues_double";
			case "json_resistance1":
				return "json_resistance1_docvalues_double";
			case "json_frequency":
				return "json_frequency_docvalues_double";
			case "json_devEui":
				return "json_devEui_docvalues_string";
			case "json_bandwidth":
				return "json_bandwidth_docvalues_string";
			case "json_dataRate":
				return "json_dataRate_docvalues_double";
			case "json_frameCount":
				return "json_frameCount_docvalues_double";
			case "json_maxPayload":
				return "json_maxPayload_docvalues_double";
			case "json_bitsPerSecond":
				return "json_bitsPerSecond_docvalues_double";
			case "json_batteryVoltage":
				return "json_batteryVoltage_docvalues_double";
			case "json_spreadingFactor":
				return "json_spreadingFactor_docvalues_double";
			case "json_dataRateAdaptive":
				return "json_dataRateAdaptive_docvalues_boolean";
			case "json_swversion":
				return "json_swversion_docvalues_string";
			case "json_batteryLevel":
				return "json_batteryLevel_docvalues_double";
			case "json_startUpCount":
				return "json_startUpCount_docvalues_double";
			case "json_watchdogCount":
				return "json_watchdogCount_docvalues_double";
			case "json_historySequence":
				return "json_historySequence_docvalues_double";
			case "json_versionFirmware":
				return "json_versionFirmware_docvalues_string";
			case "json_stackTxFailRebootCount":
				return "json_stackTxFailRebootCount_docvalues_double";
			case "json_historySequencePrevious":
				return "json_historySequencePrevious_docvalues_double";
			case "json_snr":
				return "json_snr_docvalues_double";
			case "json_rssi":
				return "json_rssi_docvalues_double";
			default:
				return BaseResult.varIndexedBaseResult(entityVar);
		}
	}

	public static String searchVarIotNode(String searchVar) {
		switch(searchVar) {
			case "json_docvalues_string":
				return "json";
			case "nodeName_docvalues_string":
				return "nodeName";
			case "nodeType_docvalues_string":
				return "nodeType";
			case "nodeId_docvalues_string":
				return "nodeId";
			case "location_docvalues_location":
				return "location";
			case "json_moisture_docvalues_double":
				return "json_moisture";
			case "json_moisture0_docvalues_double":
				return "json_moisture0";
			case "json_moisture1_docvalues_double":
				return "json_moisture1";
			case "json_temperature_docvalues_double":
				return "json_temperature";
			case "json_temperature0_docvalues_double":
				return "json_temperature0";
			case "json_temperatureAverage_docvalues_double":
				return "json_temperatureAverage";
			case "json_badConditionsCounter_docvalues_double":
				return "json_badConditionsCounter";
			case "json_door_docvalues_string":
				return "json_door";
			case "json_alarmDoor_docvalues_boolean":
				return "json_alarmDoor";
			case "json_flood_docvalues_double":
				return "json_flood";
			case "json_alarmFlood_docvalues_boolean":
				return "json_alarmFlood";
			case "json_lux2_docvalues_double":
				return "json_lux2";
			case "json_illuminance_docvalues_double":
				return "json_illuminance";
			case "json_resistance0_docvalues_double":
				return "json_resistance0";
			case "json_resistance1_docvalues_double":
				return "json_resistance1";
			case "json_frequency_docvalues_double":
				return "json_frequency";
			case "json_devEui_docvalues_string":
				return "json_devEui";
			case "json_bandwidth_docvalues_string":
				return "json_bandwidth";
			case "json_dataRate_docvalues_double":
				return "json_dataRate";
			case "json_frameCount_docvalues_double":
				return "json_frameCount";
			case "json_maxPayload_docvalues_double":
				return "json_maxPayload";
			case "json_bitsPerSecond_docvalues_double":
				return "json_bitsPerSecond";
			case "json_batteryVoltage_docvalues_double":
				return "json_batteryVoltage";
			case "json_spreadingFactor_docvalues_double":
				return "json_spreadingFactor";
			case "json_dataRateAdaptive_docvalues_boolean":
				return "json_dataRateAdaptive";
			case "json_swversion_docvalues_string":
				return "json_swversion";
			case "json_batteryLevel_docvalues_double":
				return "json_batteryLevel";
			case "json_startUpCount_docvalues_double":
				return "json_startUpCount";
			case "json_watchdogCount_docvalues_double":
				return "json_watchdogCount";
			case "json_historySequence_docvalues_double":
				return "json_historySequence";
			case "json_versionFirmware_docvalues_string":
				return "json_versionFirmware";
			case "json_stackTxFailRebootCount_docvalues_double":
				return "json_stackTxFailRebootCount";
			case "json_historySequencePrevious_docvalues_double":
				return "json_historySequencePrevious";
			case "json_snr_docvalues_double":
				return "json_snr";
			case "json_rssi_docvalues_double":
				return "json_rssi";
			default:
				return BaseResult.searchVarBaseResult(searchVar);
		}
	}

	public static String varSearchIotNode(String entityVar) {
		switch(entityVar) {
			default:
				return BaseResult.varSearchBaseResult(entityVar);
		}
	}

	public static String varSuggestedIotNode(String entityVar) {
		switch(entityVar) {
			default:
				return BaseResult.varSuggestedBaseResult(entityVar);
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

		oIotNode.setJson(Optional.ofNullable(doc.get("json_docvalues_string")).map(v -> v.toString()).orElse(null));
		oIotNode.setNodeName(Optional.ofNullable(doc.get("nodeName_docvalues_string")).map(v -> v.toString()).orElse(null));
		oIotNode.setNodeType(Optional.ofNullable(doc.get("nodeType_docvalues_string")).map(v -> v.toString()).orElse(null));
		oIotNode.setNodeId(Optional.ofNullable(doc.get("nodeId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oIotNode.setLocation(Optional.ofNullable(doc.get("location_docvalues_location")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_moisture(Optional.ofNullable(doc.get("json_moisture_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_moisture0(Optional.ofNullable(doc.get("json_moisture0_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_moisture1(Optional.ofNullable(doc.get("json_moisture1_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_temperature(Optional.ofNullable(doc.get("json_temperature_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_temperature0(Optional.ofNullable(doc.get("json_temperature0_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_temperatureAverage(Optional.ofNullable(doc.get("json_temperatureAverage_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_badConditionsCounter(Optional.ofNullable(doc.get("json_badConditionsCounter_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_door(Optional.ofNullable(doc.get("json_door_docvalues_string")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_alarmDoor(Optional.ofNullable(doc.get("json_alarmDoor_docvalues_boolean")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_flood(Optional.ofNullable(doc.get("json_flood_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_alarmFlood(Optional.ofNullable(doc.get("json_alarmFlood_docvalues_boolean")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_lux2(Optional.ofNullable(doc.get("json_lux2_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_illuminance(Optional.ofNullable(doc.get("json_illuminance_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_resistance0(Optional.ofNullable(doc.get("json_resistance0_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_resistance1(Optional.ofNullable(doc.get("json_resistance1_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_frequency(Optional.ofNullable(doc.get("json_frequency_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_devEui(Optional.ofNullable(doc.get("json_devEui_docvalues_string")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_bandwidth(Optional.ofNullable(doc.get("json_bandwidth_docvalues_string")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_dataRate(Optional.ofNullable(doc.get("json_dataRate_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_frameCount(Optional.ofNullable(doc.get("json_frameCount_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_maxPayload(Optional.ofNullable(doc.get("json_maxPayload_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_bitsPerSecond(Optional.ofNullable(doc.get("json_bitsPerSecond_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_batteryVoltage(Optional.ofNullable(doc.get("json_batteryVoltage_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_spreadingFactor(Optional.ofNullable(doc.get("json_spreadingFactor_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_dataRateAdaptive(Optional.ofNullable(doc.get("json_dataRateAdaptive_docvalues_boolean")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_swversion(Optional.ofNullable(doc.get("json_swversion_docvalues_string")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_batteryLevel(Optional.ofNullable(doc.get("json_batteryLevel_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_startUpCount(Optional.ofNullable(doc.get("json_startUpCount_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_watchdogCount(Optional.ofNullable(doc.get("json_watchdogCount_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_historySequence(Optional.ofNullable(doc.get("json_historySequence_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_versionFirmware(Optional.ofNullable(doc.get("json_versionFirmware_docvalues_string")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_stackTxFailRebootCount(Optional.ofNullable(doc.get("json_stackTxFailRebootCount_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_historySequencePrevious(Optional.ofNullable(doc.get("json_historySequencePrevious_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_snr(Optional.ofNullable(doc.get("json_snr_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNode.setJson_rssi(Optional.ofNullable(doc.get("json_rssi_docvalues_double")).map(v -> v.toString()).orElse(null));

		super.storeBaseResult(doc);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestIotNode() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof IotNode) {
			IotNode original = (IotNode)o;
			if(!Objects.equals(json, original.getJson()))
				apiRequest.addVars("json");
			if(!Objects.equals(nodeName, original.getNodeName()))
				apiRequest.addVars("nodeName");
			if(!Objects.equals(nodeType, original.getNodeType()))
				apiRequest.addVars("nodeType");
			if(!Objects.equals(nodeId, original.getNodeId()))
				apiRequest.addVars("nodeId");
			if(!Objects.equals(location, original.getLocation()))
				apiRequest.addVars("location");
			if(!Objects.equals(json_moisture, original.getJson_moisture()))
				apiRequest.addVars("json_moisture");
			if(!Objects.equals(json_moisture0, original.getJson_moisture0()))
				apiRequest.addVars("json_moisture0");
			if(!Objects.equals(json_moisture1, original.getJson_moisture1()))
				apiRequest.addVars("json_moisture1");
			if(!Objects.equals(json_temperature, original.getJson_temperature()))
				apiRequest.addVars("json_temperature");
			if(!Objects.equals(json_temperature0, original.getJson_temperature0()))
				apiRequest.addVars("json_temperature0");
			if(!Objects.equals(json_temperatureAverage, original.getJson_temperatureAverage()))
				apiRequest.addVars("json_temperatureAverage");
			if(!Objects.equals(json_badConditionsCounter, original.getJson_badConditionsCounter()))
				apiRequest.addVars("json_badConditionsCounter");
			if(!Objects.equals(json_door, original.getJson_door()))
				apiRequest.addVars("json_door");
			if(!Objects.equals(json_alarmDoor, original.getJson_alarmDoor()))
				apiRequest.addVars("json_alarmDoor");
			if(!Objects.equals(json_flood, original.getJson_flood()))
				apiRequest.addVars("json_flood");
			if(!Objects.equals(json_alarmFlood, original.getJson_alarmFlood()))
				apiRequest.addVars("json_alarmFlood");
			if(!Objects.equals(json_lux2, original.getJson_lux2()))
				apiRequest.addVars("json_lux2");
			if(!Objects.equals(json_illuminance, original.getJson_illuminance()))
				apiRequest.addVars("json_illuminance");
			if(!Objects.equals(json_resistance0, original.getJson_resistance0()))
				apiRequest.addVars("json_resistance0");
			if(!Objects.equals(json_resistance1, original.getJson_resistance1()))
				apiRequest.addVars("json_resistance1");
			if(!Objects.equals(json_frequency, original.getJson_frequency()))
				apiRequest.addVars("json_frequency");
			if(!Objects.equals(json_devEui, original.getJson_devEui()))
				apiRequest.addVars("json_devEui");
			if(!Objects.equals(json_bandwidth, original.getJson_bandwidth()))
				apiRequest.addVars("json_bandwidth");
			if(!Objects.equals(json_dataRate, original.getJson_dataRate()))
				apiRequest.addVars("json_dataRate");
			if(!Objects.equals(json_frameCount, original.getJson_frameCount()))
				apiRequest.addVars("json_frameCount");
			if(!Objects.equals(json_maxPayload, original.getJson_maxPayload()))
				apiRequest.addVars("json_maxPayload");
			if(!Objects.equals(json_bitsPerSecond, original.getJson_bitsPerSecond()))
				apiRequest.addVars("json_bitsPerSecond");
			if(!Objects.equals(json_batteryVoltage, original.getJson_batteryVoltage()))
				apiRequest.addVars("json_batteryVoltage");
			if(!Objects.equals(json_spreadingFactor, original.getJson_spreadingFactor()))
				apiRequest.addVars("json_spreadingFactor");
			if(!Objects.equals(json_dataRateAdaptive, original.getJson_dataRateAdaptive()))
				apiRequest.addVars("json_dataRateAdaptive");
			if(!Objects.equals(json_swversion, original.getJson_swversion()))
				apiRequest.addVars("json_swversion");
			if(!Objects.equals(json_batteryLevel, original.getJson_batteryLevel()))
				apiRequest.addVars("json_batteryLevel");
			if(!Objects.equals(json_startUpCount, original.getJson_startUpCount()))
				apiRequest.addVars("json_startUpCount");
			if(!Objects.equals(json_watchdogCount, original.getJson_watchdogCount()))
				apiRequest.addVars("json_watchdogCount");
			if(!Objects.equals(json_historySequence, original.getJson_historySequence()))
				apiRequest.addVars("json_historySequence");
			if(!Objects.equals(json_versionFirmware, original.getJson_versionFirmware()))
				apiRequest.addVars("json_versionFirmware");
			if(!Objects.equals(json_stackTxFailRebootCount, original.getJson_stackTxFailRebootCount()))
				apiRequest.addVars("json_stackTxFailRebootCount");
			if(!Objects.equals(json_historySequencePrevious, original.getJson_historySequencePrevious()))
				apiRequest.addVars("json_historySequencePrevious");
			if(!Objects.equals(json_snr, original.getJson_snr()))
				apiRequest.addVars("json_snr");
			if(!Objects.equals(json_rssi, original.getJson_rssi()))
				apiRequest.addVars("json_rssi");
			super.apiRequestBaseResult();
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(Optional.ofNullable(json).map(v -> "json: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(nodeName).map(v -> "nodeName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(nodeType).map(v -> "nodeType: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(nodeId).map(v -> "nodeId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(location).map(v -> "location: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(json_moisture).map(v -> "json_moisture: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(json_moisture0).map(v -> "json_moisture0: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(json_moisture1).map(v -> "json_moisture1: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(json_temperature).map(v -> "json_temperature: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(json_temperature0).map(v -> "json_temperature0: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(json_temperatureAverage).map(v -> "json_temperatureAverage: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(json_badConditionsCounter).map(v -> "json_badConditionsCounter: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(json_door).map(v -> "json_door: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(json_alarmDoor).map(v -> "json_alarmDoor: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(json_flood).map(v -> "json_flood: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(json_alarmFlood).map(v -> "json_alarmFlood: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(json_lux2).map(v -> "json_lux2: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(json_illuminance).map(v -> "json_illuminance: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(json_resistance0).map(v -> "json_resistance0: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(json_resistance1).map(v -> "json_resistance1: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(json_frequency).map(v -> "json_frequency: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(json_devEui).map(v -> "json_devEui: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(json_bandwidth).map(v -> "json_bandwidth: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(json_dataRate).map(v -> "json_dataRate: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(json_frameCount).map(v -> "json_frameCount: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(json_maxPayload).map(v -> "json_maxPayload: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(json_bitsPerSecond).map(v -> "json_bitsPerSecond: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(json_batteryVoltage).map(v -> "json_batteryVoltage: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(json_spreadingFactor).map(v -> "json_spreadingFactor: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(json_dataRateAdaptive).map(v -> "json_dataRateAdaptive: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(json_swversion).map(v -> "json_swversion: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(json_batteryLevel).map(v -> "json_batteryLevel: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(json_startUpCount).map(v -> "json_startUpCount: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(json_watchdogCount).map(v -> "json_watchdogCount: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(json_historySequence).map(v -> "json_historySequence: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(json_versionFirmware).map(v -> "json_versionFirmware: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(json_stackTxFailRebootCount).map(v -> "json_stackTxFailRebootCount: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(json_historySequencePrevious).map(v -> "json_historySequencePrevious: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(json_snr).map(v -> "json_snr: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(json_rssi).map(v -> "json_rssi: " + v + "\n").orElse(""));
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "IotNode";
	public static final String VAR_json = "json";
	public static final String VAR_nodeName = "nodeName";
	public static final String VAR_nodeType = "nodeType";
	public static final String VAR_nodeId = "nodeId";
	public static final String VAR_location = "location";
	public static final String VAR_json_moisture = "json_moisture";
	public static final String VAR_json_moisture0 = "json_moisture0";
	public static final String VAR_json_moisture1 = "json_moisture1";
	public static final String VAR_json_temperature = "json_temperature";
	public static final String VAR_json_temperature0 = "json_temperature0";
	public static final String VAR_json_temperatureAverage = "json_temperatureAverage";
	public static final String VAR_json_badConditionsCounter = "json_badConditionsCounter";
	public static final String VAR_json_door = "json_door";
	public static final String VAR_json_alarmDoor = "json_alarmDoor";
	public static final String VAR_json_flood = "json_flood";
	public static final String VAR_json_alarmFlood = "json_alarmFlood";
	public static final String VAR_json_lux2 = "json_lux2";
	public static final String VAR_json_illuminance = "json_illuminance";
	public static final String VAR_json_resistance0 = "json_resistance0";
	public static final String VAR_json_resistance1 = "json_resistance1";
	public static final String VAR_json_frequency = "json_frequency";
	public static final String VAR_json_devEui = "json_devEui";
	public static final String VAR_json_bandwidth = "json_bandwidth";
	public static final String VAR_json_dataRate = "json_dataRate";
	public static final String VAR_json_frameCount = "json_frameCount";
	public static final String VAR_json_maxPayload = "json_maxPayload";
	public static final String VAR_json_bitsPerSecond = "json_bitsPerSecond";
	public static final String VAR_json_batteryVoltage = "json_batteryVoltage";
	public static final String VAR_json_spreadingFactor = "json_spreadingFactor";
	public static final String VAR_json_dataRateAdaptive = "json_dataRateAdaptive";
	public static final String VAR_json_swversion = "json_swversion";
	public static final String VAR_json_batteryLevel = "json_batteryLevel";
	public static final String VAR_json_startUpCount = "json_startUpCount";
	public static final String VAR_json_watchdogCount = "json_watchdogCount";
	public static final String VAR_json_historySequence = "json_historySequence";
	public static final String VAR_json_versionFirmware = "json_versionFirmware";
	public static final String VAR_json_stackTxFailRebootCount = "json_stackTxFailRebootCount";
	public static final String VAR_json_historySequencePrevious = "json_historySequencePrevious";
	public static final String VAR_json_snr = "json_snr";
	public static final String VAR_json_rssi = "json_rssi";

	public static List<String> varsQForClass() {
		return IotNode.varsQIotNode(new ArrayList<String>());
	}
	public static List<String> varsQIotNode(List<String> vars) {
		BaseResult.varsQBaseResult(vars);
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
		vars.add(VAR_json_moisture);
		vars.add(VAR_json_moisture0);
		vars.add(VAR_json_moisture1);
		vars.add(VAR_json_temperature);
		vars.add(VAR_json_temperature0);
		vars.add(VAR_json_temperatureAverage);
		vars.add(VAR_json_badConditionsCounter);
		vars.add(VAR_json_door);
		vars.add(VAR_json_alarmDoor);
		vars.add(VAR_json_flood);
		vars.add(VAR_json_alarmFlood);
		vars.add(VAR_json_lux2);
		vars.add(VAR_json_illuminance);
		vars.add(VAR_json_resistance0);
		vars.add(VAR_json_resistance1);
		vars.add(VAR_json_frequency);
		vars.add(VAR_json_devEui);
		vars.add(VAR_json_bandwidth);
		vars.add(VAR_json_dataRate);
		vars.add(VAR_json_frameCount);
		vars.add(VAR_json_maxPayload);
		vars.add(VAR_json_bitsPerSecond);
		vars.add(VAR_json_batteryVoltage);
		vars.add(VAR_json_spreadingFactor);
		vars.add(VAR_json_dataRateAdaptive);
		vars.add(VAR_json_swversion);
		vars.add(VAR_json_batteryLevel);
		vars.add(VAR_json_startUpCount);
		vars.add(VAR_json_watchdogCount);
		vars.add(VAR_json_historySequence);
		vars.add(VAR_json_versionFirmware);
		vars.add(VAR_json_stackTxFailRebootCount);
		vars.add(VAR_json_historySequencePrevious);
		vars.add(VAR_json_snr);
		vars.add(VAR_json_rssi);
		BaseResult.varsFqBaseResult(vars);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return IotNode.varsRangeIotNode(new ArrayList<String>());
	}
	public static List<String> varsRangeIotNode(List<String> vars) {
		vars.add(VAR_location);
		vars.add(VAR_json_moisture);
		vars.add(VAR_json_moisture0);
		vars.add(VAR_json_moisture1);
		vars.add(VAR_json_temperature);
		vars.add(VAR_json_temperature0);
		vars.add(VAR_json_temperatureAverage);
		vars.add(VAR_json_badConditionsCounter);
		vars.add(VAR_json_flood);
		vars.add(VAR_json_lux2);
		vars.add(VAR_json_illuminance);
		vars.add(VAR_json_resistance0);
		vars.add(VAR_json_resistance1);
		vars.add(VAR_json_frequency);
		vars.add(VAR_json_dataRate);
		vars.add(VAR_json_frameCount);
		vars.add(VAR_json_maxPayload);
		vars.add(VAR_json_bitsPerSecond);
		vars.add(VAR_json_batteryVoltage);
		vars.add(VAR_json_spreadingFactor);
		vars.add(VAR_json_batteryLevel);
		vars.add(VAR_json_startUpCount);
		vars.add(VAR_json_watchdogCount);
		vars.add(VAR_json_historySequence);
		vars.add(VAR_json_stackTxFailRebootCount);
		vars.add(VAR_json_historySequencePrevious);
		vars.add(VAR_json_snr);
		vars.add(VAR_json_rssi);
		BaseResult.varsRangeBaseResult(vars);
		return vars;
	}

	public static final String DISPLAY_NAME_json = "json";
	public static final String DISPLAY_NAME_nodeName = "node name";
	public static final String DISPLAY_NAME_nodeType = "node type";
	public static final String DISPLAY_NAME_nodeId = "node ID";
	public static final String DISPLAY_NAME_location = "location";
	public static final String DISPLAY_NAME_json_moisture = "moisture";
	public static final String DISPLAY_NAME_json_moisture0 = "moisture0";
	public static final String DISPLAY_NAME_json_moisture1 = "moisture1";
	public static final String DISPLAY_NAME_json_temperature = "temperature";
	public static final String DISPLAY_NAME_json_temperature0 = "temperature0";
	public static final String DISPLAY_NAME_json_temperatureAverage = "average temperature";
	public static final String DISPLAY_NAME_json_badConditionsCounter = "bad conditions counter";
	public static final String DISPLAY_NAME_json_door = "door";
	public static final String DISPLAY_NAME_json_alarmDoor = "alarm door";
	public static final String DISPLAY_NAME_json_flood = "flood";
	public static final String DISPLAY_NAME_json_alarmFlood = "alarm flood";
	public static final String DISPLAY_NAME_json_lux2 = "lux2";
	public static final String DISPLAY_NAME_json_illuminance = "illuminance";
	public static final String DISPLAY_NAME_json_resistance0 = "resistance0";
	public static final String DISPLAY_NAME_json_resistance1 = "resistance1";
	public static final String DISPLAY_NAME_json_frequency = "frequency";
	public static final String DISPLAY_NAME_json_devEui = "extended unique identifier";
	public static final String DISPLAY_NAME_json_bandwidth = "bandwidth";
	public static final String DISPLAY_NAME_json_dataRate = "frequency";
	public static final String DISPLAY_NAME_json_frameCount = "frame count";
	public static final String DISPLAY_NAME_json_maxPayload = "max payload";
	public static final String DISPLAY_NAME_json_bitsPerSecond = "bits per second";
	public static final String DISPLAY_NAME_json_batteryVoltage = "battery voltage";
	public static final String DISPLAY_NAME_json_spreadingFactor = "spreading factor";
	public static final String DISPLAY_NAME_json_dataRateAdaptive = "adaptive data rate";
	public static final String DISPLAY_NAME_json_swversion = "swversion";
	public static final String DISPLAY_NAME_json_batteryLevel = "battery level";
	public static final String DISPLAY_NAME_json_startUpCount = "startup count";
	public static final String DISPLAY_NAME_json_watchdogCount = "watchdog count";
	public static final String DISPLAY_NAME_json_historySequence = "history sequence";
	public static final String DISPLAY_NAME_json_versionFirmware = "firmware version";
	public static final String DISPLAY_NAME_json_stackTxFailRebootCount = "stack tx fail reboot count";
	public static final String DISPLAY_NAME_json_historySequencePrevious = "history sequence previous";
	public static final String DISPLAY_NAME_json_snr = "signal-to-noise ratio";
	public static final String DISPLAY_NAME_json_rssi = "received signal strength indicator";

	public static String displayNameForClass(String var) {
		return IotNode.displayNameIotNode(var);
	}
	public static String displayNameIotNode(String var) {
		switch(var) {
		case VAR_json:
			return DISPLAY_NAME_json;
		case VAR_nodeName:
			return DISPLAY_NAME_nodeName;
		case VAR_nodeType:
			return DISPLAY_NAME_nodeType;
		case VAR_nodeId:
			return DISPLAY_NAME_nodeId;
		case VAR_location:
			return DISPLAY_NAME_location;
		case VAR_json_moisture:
			return DISPLAY_NAME_json_moisture;
		case VAR_json_moisture0:
			return DISPLAY_NAME_json_moisture0;
		case VAR_json_moisture1:
			return DISPLAY_NAME_json_moisture1;
		case VAR_json_temperature:
			return DISPLAY_NAME_json_temperature;
		case VAR_json_temperature0:
			return DISPLAY_NAME_json_temperature0;
		case VAR_json_temperatureAverage:
			return DISPLAY_NAME_json_temperatureAverage;
		case VAR_json_badConditionsCounter:
			return DISPLAY_NAME_json_badConditionsCounter;
		case VAR_json_door:
			return DISPLAY_NAME_json_door;
		case VAR_json_alarmDoor:
			return DISPLAY_NAME_json_alarmDoor;
		case VAR_json_flood:
			return DISPLAY_NAME_json_flood;
		case VAR_json_alarmFlood:
			return DISPLAY_NAME_json_alarmFlood;
		case VAR_json_lux2:
			return DISPLAY_NAME_json_lux2;
		case VAR_json_illuminance:
			return DISPLAY_NAME_json_illuminance;
		case VAR_json_resistance0:
			return DISPLAY_NAME_json_resistance0;
		case VAR_json_resistance1:
			return DISPLAY_NAME_json_resistance1;
		case VAR_json_frequency:
			return DISPLAY_NAME_json_frequency;
		case VAR_json_devEui:
			return DISPLAY_NAME_json_devEui;
		case VAR_json_bandwidth:
			return DISPLAY_NAME_json_bandwidth;
		case VAR_json_dataRate:
			return DISPLAY_NAME_json_dataRate;
		case VAR_json_frameCount:
			return DISPLAY_NAME_json_frameCount;
		case VAR_json_maxPayload:
			return DISPLAY_NAME_json_maxPayload;
		case VAR_json_bitsPerSecond:
			return DISPLAY_NAME_json_bitsPerSecond;
		case VAR_json_batteryVoltage:
			return DISPLAY_NAME_json_batteryVoltage;
		case VAR_json_spreadingFactor:
			return DISPLAY_NAME_json_spreadingFactor;
		case VAR_json_dataRateAdaptive:
			return DISPLAY_NAME_json_dataRateAdaptive;
		case VAR_json_swversion:
			return DISPLAY_NAME_json_swversion;
		case VAR_json_batteryLevel:
			return DISPLAY_NAME_json_batteryLevel;
		case VAR_json_startUpCount:
			return DISPLAY_NAME_json_startUpCount;
		case VAR_json_watchdogCount:
			return DISPLAY_NAME_json_watchdogCount;
		case VAR_json_historySequence:
			return DISPLAY_NAME_json_historySequence;
		case VAR_json_versionFirmware:
			return DISPLAY_NAME_json_versionFirmware;
		case VAR_json_stackTxFailRebootCount:
			return DISPLAY_NAME_json_stackTxFailRebootCount;
		case VAR_json_historySequencePrevious:
			return DISPLAY_NAME_json_historySequencePrevious;
		case VAR_json_snr:
			return DISPLAY_NAME_json_snr;
		case VAR_json_rssi:
			return DISPLAY_NAME_json_rssi;
		default:
			return BaseResult.displayNameBaseResult(var);
		}
	}

	public static String descriptionIotNode(String var) {
		switch(var) {
		case VAR_json_door:
			return "Door open or closed. ";
		case VAR_json_illuminance:
			return "The amount of luminous flux per unit area. ";
		case VAR_json_devEui:
			return "The DevEUI is a 64-bit globally-unique Extended Unique Identifier (EUI-64) assigned by the manufacturer, or the owner, of the end-device. ";
		case VAR_json_bandwidth:
			return "A range of frequencies within a given band, in particular that used for transmitting a signal. ";
		case VAR_json_dataRate:
			return "The speed at which data is transferred within the computer or between a peripheral device and the computer, measured in bytes per second. ";
		case VAR_json_frameCount:
			return "The number of frames that have been displayed since the reading started. ";
		case VAR_json_spreadingFactor:
			return "Spreading factors plays a significant role in enabling multiple long-range receptions of packets with every packet assigned a different spreading factor. ";
		case VAR_json_dataRateAdaptive:
			return "Adaptive Data Rate (ADR) is a mechanism for optimizing data rates, airtime and energy consumption in the network. ";
		case VAR_json_snr:
			return "SNR is defined as the ratio of signal power to the noise power, often expressed in decibels. ";
		case VAR_json_rssi:
			return "RSSI is a measurement of how well your device can hear a signal from an access point or router. ";
			default:
				return BaseResult.descriptionBaseResult(var);
		}
	}

	public static String classSimpleNameIotNode(String var) {
		switch(var) {
		case VAR_json:
			return "JsonObject";
		case VAR_nodeName:
			return "String";
		case VAR_nodeType:
			return "String";
		case VAR_nodeId:
			return "String";
		case VAR_location:
			return "Point";
		case VAR_json_moisture:
			return "BigDecimal";
		case VAR_json_moisture0:
			return "BigDecimal";
		case VAR_json_moisture1:
			return "BigDecimal";
		case VAR_json_temperature:
			return "BigDecimal";
		case VAR_json_temperature0:
			return "BigDecimal";
		case VAR_json_temperatureAverage:
			return "BigDecimal";
		case VAR_json_badConditionsCounter:
			return "BigDecimal";
		case VAR_json_door:
			return "String";
		case VAR_json_alarmDoor:
			return "Boolean";
		case VAR_json_flood:
			return "BigDecimal";
		case VAR_json_alarmFlood:
			return "Boolean";
		case VAR_json_lux2:
			return "BigDecimal";
		case VAR_json_illuminance:
			return "BigDecimal";
		case VAR_json_resistance0:
			return "BigDecimal";
		case VAR_json_resistance1:
			return "BigDecimal";
		case VAR_json_frequency:
			return "BigDecimal";
		case VAR_json_devEui:
			return "String";
		case VAR_json_bandwidth:
			return "String";
		case VAR_json_dataRate:
			return "BigDecimal";
		case VAR_json_frameCount:
			return "BigDecimal";
		case VAR_json_maxPayload:
			return "BigDecimal";
		case VAR_json_bitsPerSecond:
			return "BigDecimal";
		case VAR_json_batteryVoltage:
			return "BigDecimal";
		case VAR_json_spreadingFactor:
			return "BigDecimal";
		case VAR_json_dataRateAdaptive:
			return "Boolean";
		case VAR_json_swversion:
			return "String";
		case VAR_json_batteryLevel:
			return "BigDecimal";
		case VAR_json_startUpCount:
			return "BigDecimal";
		case VAR_json_watchdogCount:
			return "BigDecimal";
		case VAR_json_historySequence:
			return "BigDecimal";
		case VAR_json_versionFirmware:
			return "String";
		case VAR_json_stackTxFailRebootCount:
			return "BigDecimal";
		case VAR_json_historySequencePrevious:
			return "BigDecimal";
		case VAR_json_snr:
			return "BigDecimal";
		case VAR_json_rssi:
			return "BigDecimal";
			default:
				return BaseResult.classSimpleNameBaseResult(var);
		}
	}

	public static Integer htmlColumnIotNode(String var) {
		switch(var) {
			default:
				return BaseResult.htmlColumnBaseResult(var);
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
			return 4;
		case VAR_json_moisture:
			return 4;
		case VAR_json_moisture0:
			return 4;
		case VAR_json_moisture1:
			return 4;
		case VAR_json_temperature:
			return 5;
		case VAR_json_temperature0:
			return 5;
		case VAR_json_temperatureAverage:
			return 5;
		case VAR_json_badConditionsCounter:
			return 5;
		case VAR_json_door:
			return 6;
		case VAR_json_alarmDoor:
			return 6;
		case VAR_json_flood:
			return 6;
		case VAR_json_alarmFlood:
			return 6;
		case VAR_json_lux2:
			return 7;
		case VAR_json_illuminance:
			return 7;
		case VAR_json_resistance0:
			return 7;
		case VAR_json_resistance1:
			return 7;
		case VAR_json_frequency:
			return 8;
		case VAR_json_devEui:
			return 8;
		case VAR_json_bandwidth:
			return 8;
		case VAR_json_dataRate:
			return 8;
		case VAR_json_frameCount:
			return 9;
		case VAR_json_maxPayload:
			return 9;
		case VAR_json_bitsPerSecond:
			return 9;
		case VAR_json_batteryVoltage:
			return 9;
		case VAR_json_spreadingFactor:
			return 10;
		case VAR_json_dataRateAdaptive:
			return 10;
		case VAR_json_swversion:
			return 10;
		case VAR_json_batteryLevel:
			return 10;
		case VAR_json_startUpCount:
			return 11;
		case VAR_json_watchdogCount:
			return 11;
		case VAR_json_historySequence:
			return 11;
		case VAR_json_versionFirmware:
			return 11;
		case VAR_json_stackTxFailRebootCount:
			return 12;
		case VAR_json_historySequencePrevious:
			return 12;
		case VAR_json_snr:
			return 12;
		case VAR_json_rssi:
			return 12;
			default:
				return BaseResult.htmlRowBaseResult(var);
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
			return 1;
		case VAR_json_moisture:
			return 2;
		case VAR_json_moisture0:
			return 3;
		case VAR_json_moisture1:
			return 4;
		case VAR_json_temperature:
			return 1;
		case VAR_json_temperature0:
			return 2;
		case VAR_json_temperatureAverage:
			return 3;
		case VAR_json_badConditionsCounter:
			return 4;
		case VAR_json_door:
			return 1;
		case VAR_json_alarmDoor:
			return 2;
		case VAR_json_flood:
			return 3;
		case VAR_json_alarmFlood:
			return 4;
		case VAR_json_lux2:
			return 1;
		case VAR_json_illuminance:
			return 2;
		case VAR_json_resistance0:
			return 3;
		case VAR_json_resistance1:
			return 4;
		case VAR_json_frequency:
			return 1;
		case VAR_json_devEui:
			return 2;
		case VAR_json_bandwidth:
			return 3;
		case VAR_json_dataRate:
			return 4;
		case VAR_json_frameCount:
			return 1;
		case VAR_json_maxPayload:
			return 2;
		case VAR_json_bitsPerSecond:
			return 3;
		case VAR_json_batteryVoltage:
			return 4;
		case VAR_json_spreadingFactor:
			return 1;
		case VAR_json_dataRateAdaptive:
			return 2;
		case VAR_json_swversion:
			return 3;
		case VAR_json_batteryLevel:
			return 4;
		case VAR_json_startUpCount:
			return 1;
		case VAR_json_watchdogCount:
			return 2;
		case VAR_json_historySequence:
			return 3;
		case VAR_json_versionFirmware:
			return 4;
		case VAR_json_stackTxFailRebootCount:
			return 1;
		case VAR_json_historySequencePrevious:
			return 2;
		case VAR_json_snr:
			return 3;
		case VAR_json_rssi:
			return 4;
			default:
				return BaseResult.htmlCellBaseResult(var);
		}
	}

	public static Integer lengthMinIotNode(String var) {
		switch(var) {
			default:
				return BaseResult.lengthMinBaseResult(var);
		}
	}

	public static Integer lengthMaxIotNode(String var) {
		switch(var) {
			default:
				return BaseResult.lengthMaxBaseResult(var);
		}
	}

	public static Integer maxIotNode(String var) {
		switch(var) {
			default:
				return BaseResult.maxBaseResult(var);
		}
	}

	public static Integer minIotNode(String var) {
		switch(var) {
			default:
				return BaseResult.minBaseResult(var);
		}
	}
}
