package org.computate.smartvillageview.enus.result.iotnode.step;

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
 * <h1>Suggestions that can generate more code for you: </h1>
 * <ol>
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class IotNodeStepGen into the class IotNodeStep. 
 * </li>
 * <li>You can add a class comment "Model: true" if you wish to persist these IotNodeStep objects in a relational PostgreSQL database transactionally in the RESTful API. 
 * The code to persist and query the IotNodeStepGen data in the database will then be automatically generated. 
 * </li>
 * </ol>
 * <h1>About the IotNodeStep class and it's generated class IotNodeStepGen&lt;BaseResult&gt;: </h1>
 * <p>
 * This Java class extends a generated Java class built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep">Find the class IotNodeStep in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * <p>This class contains a comment <b>"Indexed: true"</b>, which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * <p>This class contains a comment <b>"Page: true"</b>, which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepPage. 
 * </p>
 * <p>This class contains a comment <b>"SuperPage.enUS: BaseResultPage"</b>, which identifies the Java super class of the page code by it's class simple name "BaseResultPage". 
 * This means that the newly created class org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepPage extends org.computate.smartvillageview.enus.result.base.BaseResultPage. 
 * </p>
 * <p>This class contains a comment <b>"Api: true"</b>, which means this class will have Java Vert.x API backend code generated for these objects. 
 * </p>
 * <p>This class contains a comment <b>"ApiTag: IOT Node Step"</b>, which groups all of the OpenAPIs for IotNodeStep objects under the tag "IOT Node Step". 
 * </p>
 * <p>This class contains a comment <b>"ApiUri: /api/iot-node-step"</b>, which defines the base API URI for IotNodeStep objects as "/api/iot-node-step" in the OpenAPI spec. 
 * </p>
 * <p>This class contains a comment <b>"Rows: 100"</b>, which means the IotNodeStep API will return a default of 100 records instead of 10 by default. 
 * Each API has built in pagination of the search records to ensure a user can query all the data a page at a time without running the application out of memory. 
 * </p>
 * <p>This class contains a comment <b>"AName.enUS: an IOT node step"</b>, which identifies the language context to describe a IotNodeStep as "an IOT node step". 
 * </p>
 * <p>This class contains a comment <b>"Color: blue"</b>, which styles the IotNodeStep page "blue". 
 * This will reference a CSS class defined by the stylesheets in the project that starts with "w3-". 
 * A css class of "w3-blue" is expected to exist in the project stylesheets, and is inspired by W3 CSS colors. 
 * See: <a href="https://www.w3schools.com/w3css/w3css_colors.asp">https://www.w3schools.com/w3css/w3css_colors.asp</a>. 
 * </p>
 * <p>This class contains a comment <b>"IconGroup: duotone"</b>, which adds icons on the IotNodeStep page with a group of "duotone". 
 * This will reference a Font Awesome icon group defined by the stylesheets in the project that starts with "fa" followed by the first letter of the icon group, which is "fad". 
 * A Font Awesome icon group of "blue" is expected to exist. 
 * The Font Awesome groups currently supported include: solid, thin, duotone. 
 * See: <a href="https://www.w3schools.com/w3css/w3css_colors.asp">https://www.w3schools.com/w3css/w3css_colors.asp</a>. 
 * </p>
 * <p>
 * Delete the class IotNodeStep in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.result.iotnode.step in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class IotNodeStepGen<DEV> extends BaseResult {
	protected static final Logger LOG = LoggerFactory.getLogger(IotNodeStep.class);

	public static final String IotNodeStep_AName_enUS = "an IOT node step";
	public static final String IotNodeStep_This_enUS = "this ";
	public static final String IotNodeStep_ThisName_enUS = "this IOT node step";
	public static final String IotNodeStep_A_enUS = "a ";
	public static final String IotNodeStep_TheName_enUS = "theIOT node step";
	public static final String IotNodeStep_NameSingular_enUS = "IOT node step";
	public static final String IotNodeStep_NamePlural_enUS = "IOT node steps";
	public static final String IotNodeStep_NameActual_enUS = "current IOT node step";
	public static final String IotNodeStep_AllName_enUS = "all the IOT node steps";
	public static final String IotNodeStep_SearchAllNameBy_enUS = "search IOT node steps by ";
	public static final String IotNodeStep_Title_enUS = "IOT node steps";
	public static final String IotNodeStep_ThePluralName_enUS = "the IOT node steps";
	public static final String IotNodeStep_NoNameFound_enUS = "no IOT node step found";
	public static final String IotNodeStep_ApiUri_enUS = "/api/iot-node-step";
	public static final String IotNodeStep_ApiUriSearchPage_enUS = "/iot-node-step";
	public static final String IotNodeStep_OfName_enUS = "of IOT node step";
	public static final String IotNodeStep_ANameAdjective_enUS = "an IOT node step";
	public static final String IotNodeStep_NameAdjectiveSingular_enUS = "IOT node step";
	public static final String IotNodeStep_NameAdjectivePlural_enUS = "IOT node steps";
	public static final String Search_enUS_Uri = "/api/iot-node-step";
	public static final String Search_enUS_ImageUri = "/png/api/iot-node-step-999.png";
	public static final String GET_enUS_Uri = "/api/iot-node-step/{id}";
	public static final String GET_enUS_ImageUri = "/png/api/iot-node-step/{id}-999.png";
	public static final String PATCH_enUS_Uri = "/api/iot-node-step";
	public static final String PATCH_enUS_ImageUri = "/png/api/iot-node-step-999.png";
	public static final String POST_enUS_Uri = "/api/iot-node-step";
	public static final String POST_enUS_ImageUri = "/png/api/iot-node-step-999.png";
	public static final String PUTImport_enUS_Uri = "/api/iot-node-step-import";
	public static final String PUTImport_enUS_ImageUri = "/png/api/iot-node-step-import-999.png";
	public static final String SearchPage_enUS_Uri = "/iot-node-step";
	public static final String SearchPage_enUS_ImageUri = "/png/iot-node-step-999.png";

	public static final String IotNodeStep_Color = "blue";
	public static final String IotNodeStep_IconGroup = "duotone";
	public static final String IotNodeStep_IconName = "router";
	public static final Integer IotNodeStep_Rows = 100;

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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json">Find the entity json in Solr</a>
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
		this.json = IotNodeStep.staticSetJson(siteRequest_, o);
	}
	public static JsonObject staticSetJson(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected IotNodeStep jsonInit() {
		Wrap<JsonObject> jsonWrap = new Wrap<JsonObject>().var("json");
		if(json == null) {
			_json(jsonWrap);
			setJson(jsonWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static JsonObject staticSearchJson(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrJson(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson(siteRequest_, IotNodeStep.staticSearchJson(siteRequest_, IotNodeStep.staticSetJson(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:nodeName">Find the entity nodeName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _nodeName(Wrap<String> w);

	public String getNodeName() {
		return nodeName;
	}
	public void setNodeName(String o) {
		this.nodeName = IotNodeStep.staticSetNodeName(siteRequest_, o);
	}
	public static String staticSetNodeName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected IotNodeStep nodeNameInit() {
		Wrap<String> nodeNameWrap = new Wrap<String>().var("nodeName");
		if(nodeName == null) {
			_nodeName(nodeNameWrap);
			setNodeName(nodeNameWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static String staticSearchNodeName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrNodeName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqNodeName(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrNodeName(siteRequest_, IotNodeStep.staticSearchNodeName(siteRequest_, IotNodeStep.staticSetNodeName(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:nodeType">Find the entity nodeType in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _nodeType(Wrap<String> w);

	public String getNodeType() {
		return nodeType;
	}
	public void setNodeType(String o) {
		this.nodeType = IotNodeStep.staticSetNodeType(siteRequest_, o);
	}
	public static String staticSetNodeType(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected IotNodeStep nodeTypeInit() {
		Wrap<String> nodeTypeWrap = new Wrap<String>().var("nodeType");
		if(nodeType == null) {
			_nodeType(nodeTypeWrap);
			setNodeType(nodeTypeWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static String staticSearchNodeType(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrNodeType(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqNodeType(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrNodeType(siteRequest_, IotNodeStep.staticSearchNodeType(siteRequest_, IotNodeStep.staticSetNodeType(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:nodeId">Find the entity nodeId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _nodeId(Wrap<String> w);

	public String getNodeId() {
		return nodeId;
	}
	public void setNodeId(String o) {
		this.nodeId = IotNodeStep.staticSetNodeId(siteRequest_, o);
	}
	public static String staticSetNodeId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected IotNodeStep nodeIdInit() {
		Wrap<String> nodeIdWrap = new Wrap<String>().var("nodeId");
		if(nodeId == null) {
			_nodeId(nodeIdWrap);
			setNodeId(nodeIdWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static String staticSearchNodeId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrNodeId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqNodeId(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrNodeId(siteRequest_, IotNodeStep.staticSearchNodeId(siteRequest_, IotNodeStep.staticSetNodeId(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:location">Find the entity location in Solr</a>
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
		this.location = IotNodeStep.staticSetLocation(siteRequest_, o);
	}
	public static Point staticSetLocation(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
			String[] vals = o.split(",");
			if(vals.length == 2 && NumberUtils.isParsable(vals[0]) && NumberUtils.isParsable(vals[1]))
				return new Point(Double.parseDouble(vals[0]), Double.parseDouble(vals[1]));
		}
		return null;
	}
	protected IotNodeStep locationInit() {
		Wrap<Point> locationWrap = new Wrap<Point>().var("location");
		if(location == null) {
			_location(locationWrap);
			setLocation(locationWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static Point staticSearchLocation(SiteRequestEnUS siteRequest_, Point o) {
		return o;
	}

	public static String staticSearchStrLocation(SiteRequestEnUS siteRequest_, Point o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqLocation(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrLocation(siteRequest_, IotNodeStep.staticSearchLocation(siteRequest_, IotNodeStep.staticSetLocation(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_moisture">Find the entity json_moisture in Solr</a>
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
		this.json_moisture = IotNodeStep.staticSetJson_moisture(siteRequest_, o);
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
	protected IotNodeStep json_moistureInit() {
		Wrap<BigDecimal> json_moistureWrap = new Wrap<BigDecimal>().var("json_moisture");
		if(json_moisture == null) {
			_json_moisture(json_moistureWrap);
			setJson_moisture(json_moistureWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static Double staticSearchJson_moisture(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_moisture(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_moisture(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_moisture(siteRequest_, IotNodeStep.staticSearchJson_moisture(siteRequest_, IotNodeStep.staticSetJson_moisture(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_moisture0">Find the entity json_moisture0 in Solr</a>
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
		this.json_moisture0 = IotNodeStep.staticSetJson_moisture0(siteRequest_, o);
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
	protected IotNodeStep json_moisture0Init() {
		Wrap<BigDecimal> json_moisture0Wrap = new Wrap<BigDecimal>().var("json_moisture0");
		if(json_moisture0 == null) {
			_json_moisture0(json_moisture0Wrap);
			setJson_moisture0(json_moisture0Wrap.o);
		}
		return (IotNodeStep)this;
	}

	public static Double staticSearchJson_moisture0(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_moisture0(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_moisture0(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_moisture0(siteRequest_, IotNodeStep.staticSearchJson_moisture0(siteRequest_, IotNodeStep.staticSetJson_moisture0(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_moisture1">Find the entity json_moisture1 in Solr</a>
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
		this.json_moisture1 = IotNodeStep.staticSetJson_moisture1(siteRequest_, o);
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
	protected IotNodeStep json_moisture1Init() {
		Wrap<BigDecimal> json_moisture1Wrap = new Wrap<BigDecimal>().var("json_moisture1");
		if(json_moisture1 == null) {
			_json_moisture1(json_moisture1Wrap);
			setJson_moisture1(json_moisture1Wrap.o);
		}
		return (IotNodeStep)this;
	}

	public static Double staticSearchJson_moisture1(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_moisture1(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_moisture1(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_moisture1(siteRequest_, IotNodeStep.staticSearchJson_moisture1(siteRequest_, IotNodeStep.staticSetJson_moisture1(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_temperature">Find the entity json_temperature in Solr</a>
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
		this.json_temperature = IotNodeStep.staticSetJson_temperature(siteRequest_, o);
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
	protected IotNodeStep json_temperatureInit() {
		Wrap<BigDecimal> json_temperatureWrap = new Wrap<BigDecimal>().var("json_temperature");
		if(json_temperature == null) {
			_json_temperature(json_temperatureWrap);
			setJson_temperature(json_temperatureWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static Double staticSearchJson_temperature(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_temperature(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_temperature(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_temperature(siteRequest_, IotNodeStep.staticSearchJson_temperature(siteRequest_, IotNodeStep.staticSetJson_temperature(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_temperature0">Find the entity json_temperature0 in Solr</a>
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
		this.json_temperature0 = IotNodeStep.staticSetJson_temperature0(siteRequest_, o);
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
	protected IotNodeStep json_temperature0Init() {
		Wrap<BigDecimal> json_temperature0Wrap = new Wrap<BigDecimal>().var("json_temperature0");
		if(json_temperature0 == null) {
			_json_temperature0(json_temperature0Wrap);
			setJson_temperature0(json_temperature0Wrap.o);
		}
		return (IotNodeStep)this;
	}

	public static Double staticSearchJson_temperature0(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_temperature0(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_temperature0(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_temperature0(siteRequest_, IotNodeStep.staticSearchJson_temperature0(siteRequest_, IotNodeStep.staticSetJson_temperature0(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_temperatureAverage">Find the entity json_temperatureAverage in Solr</a>
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
		this.json_temperatureAverage = IotNodeStep.staticSetJson_temperatureAverage(siteRequest_, o);
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
	protected IotNodeStep json_temperatureAverageInit() {
		Wrap<BigDecimal> json_temperatureAverageWrap = new Wrap<BigDecimal>().var("json_temperatureAverage");
		if(json_temperatureAverage == null) {
			_json_temperatureAverage(json_temperatureAverageWrap);
			setJson_temperatureAverage(json_temperatureAverageWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static Double staticSearchJson_temperatureAverage(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_temperatureAverage(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_temperatureAverage(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_temperatureAverage(siteRequest_, IotNodeStep.staticSearchJson_temperatureAverage(siteRequest_, IotNodeStep.staticSetJson_temperatureAverage(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_badConditionsCounter">Find the entity json_badConditionsCounter in Solr</a>
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
		this.json_badConditionsCounter = IotNodeStep.staticSetJson_badConditionsCounter(siteRequest_, o);
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
	protected IotNodeStep json_badConditionsCounterInit() {
		Wrap<BigDecimal> json_badConditionsCounterWrap = new Wrap<BigDecimal>().var("json_badConditionsCounter");
		if(json_badConditionsCounter == null) {
			_json_badConditionsCounter(json_badConditionsCounterWrap);
			setJson_badConditionsCounter(json_badConditionsCounterWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static Double staticSearchJson_badConditionsCounter(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_badConditionsCounter(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_badConditionsCounter(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_badConditionsCounter(siteRequest_, IotNodeStep.staticSearchJson_badConditionsCounter(siteRequest_, IotNodeStep.staticSetJson_badConditionsCounter(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_door">Find the entity json_door in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_door(Wrap<String> w);

	public String getJson_door() {
		return json_door;
	}
	public void setJson_door(String o) {
		this.json_door = IotNodeStep.staticSetJson_door(siteRequest_, o);
	}
	public static String staticSetJson_door(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected IotNodeStep json_doorInit() {
		Wrap<String> json_doorWrap = new Wrap<String>().var("json_door");
		if(json_door == null) {
			_json_door(json_doorWrap);
			setJson_door(json_doorWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static String staticSearchJson_door(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrJson_door(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_door(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_door(siteRequest_, IotNodeStep.staticSearchJson_door(siteRequest_, IotNodeStep.staticSetJson_door(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_alarmDoor">Find the entity json_alarmDoor in Solr</a>
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
		this.json_alarmDoor = IotNodeStep.staticSetJson_alarmDoor(siteRequest_, o);
	}
	public static Boolean staticSetJson_alarmDoor(SiteRequestEnUS siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected IotNodeStep json_alarmDoorInit() {
		Wrap<Boolean> json_alarmDoorWrap = new Wrap<Boolean>().var("json_alarmDoor");
		if(json_alarmDoor == null) {
			_json_alarmDoor(json_alarmDoorWrap);
			setJson_alarmDoor(json_alarmDoorWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static Boolean staticSearchJson_alarmDoor(SiteRequestEnUS siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrJson_alarmDoor(SiteRequestEnUS siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_alarmDoor(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_alarmDoor(siteRequest_, IotNodeStep.staticSearchJson_alarmDoor(siteRequest_, IotNodeStep.staticSetJson_alarmDoor(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_flood">Find the entity json_flood in Solr</a>
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
		this.json_flood = IotNodeStep.staticSetJson_flood(siteRequest_, o);
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
	protected IotNodeStep json_floodInit() {
		Wrap<BigDecimal> json_floodWrap = new Wrap<BigDecimal>().var("json_flood");
		if(json_flood == null) {
			_json_flood(json_floodWrap);
			setJson_flood(json_floodWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static Double staticSearchJson_flood(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_flood(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_flood(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_flood(siteRequest_, IotNodeStep.staticSearchJson_flood(siteRequest_, IotNodeStep.staticSetJson_flood(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_alarmFlood">Find the entity json_alarmFlood in Solr</a>
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
		this.json_alarmFlood = IotNodeStep.staticSetJson_alarmFlood(siteRequest_, o);
	}
	public static Boolean staticSetJson_alarmFlood(SiteRequestEnUS siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected IotNodeStep json_alarmFloodInit() {
		Wrap<Boolean> json_alarmFloodWrap = new Wrap<Boolean>().var("json_alarmFlood");
		if(json_alarmFlood == null) {
			_json_alarmFlood(json_alarmFloodWrap);
			setJson_alarmFlood(json_alarmFloodWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static Boolean staticSearchJson_alarmFlood(SiteRequestEnUS siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrJson_alarmFlood(SiteRequestEnUS siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_alarmFlood(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_alarmFlood(siteRequest_, IotNodeStep.staticSearchJson_alarmFlood(siteRequest_, IotNodeStep.staticSetJson_alarmFlood(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_lux2">Find the entity json_lux2 in Solr</a>
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
		this.json_lux2 = IotNodeStep.staticSetJson_lux2(siteRequest_, o);
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
	protected IotNodeStep json_lux2Init() {
		Wrap<BigDecimal> json_lux2Wrap = new Wrap<BigDecimal>().var("json_lux2");
		if(json_lux2 == null) {
			_json_lux2(json_lux2Wrap);
			setJson_lux2(json_lux2Wrap.o);
		}
		return (IotNodeStep)this;
	}

	public static Double staticSearchJson_lux2(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_lux2(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_lux2(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_lux2(siteRequest_, IotNodeStep.staticSearchJson_lux2(siteRequest_, IotNodeStep.staticSetJson_lux2(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_illuminance">Find the entity json_illuminance in Solr</a>
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
		this.json_illuminance = IotNodeStep.staticSetJson_illuminance(siteRequest_, o);
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
	protected IotNodeStep json_illuminanceInit() {
		Wrap<BigDecimal> json_illuminanceWrap = new Wrap<BigDecimal>().var("json_illuminance");
		if(json_illuminance == null) {
			_json_illuminance(json_illuminanceWrap);
			setJson_illuminance(json_illuminanceWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static Double staticSearchJson_illuminance(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_illuminance(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_illuminance(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_illuminance(siteRequest_, IotNodeStep.staticSearchJson_illuminance(siteRequest_, IotNodeStep.staticSetJson_illuminance(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_resistance0">Find the entity json_resistance0 in Solr</a>
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
		this.json_resistance0 = IotNodeStep.staticSetJson_resistance0(siteRequest_, o);
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
	protected IotNodeStep json_resistance0Init() {
		Wrap<BigDecimal> json_resistance0Wrap = new Wrap<BigDecimal>().var("json_resistance0");
		if(json_resistance0 == null) {
			_json_resistance0(json_resistance0Wrap);
			setJson_resistance0(json_resistance0Wrap.o);
		}
		return (IotNodeStep)this;
	}

	public static Double staticSearchJson_resistance0(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_resistance0(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_resistance0(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_resistance0(siteRequest_, IotNodeStep.staticSearchJson_resistance0(siteRequest_, IotNodeStep.staticSetJson_resistance0(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_resistance1">Find the entity json_resistance1 in Solr</a>
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
		this.json_resistance1 = IotNodeStep.staticSetJson_resistance1(siteRequest_, o);
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
	protected IotNodeStep json_resistance1Init() {
		Wrap<BigDecimal> json_resistance1Wrap = new Wrap<BigDecimal>().var("json_resistance1");
		if(json_resistance1 == null) {
			_json_resistance1(json_resistance1Wrap);
			setJson_resistance1(json_resistance1Wrap.o);
		}
		return (IotNodeStep)this;
	}

	public static Double staticSearchJson_resistance1(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_resistance1(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_resistance1(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_resistance1(siteRequest_, IotNodeStep.staticSearchJson_resistance1(siteRequest_, IotNodeStep.staticSetJson_resistance1(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_frequency">Find the entity json_frequency in Solr</a>
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
		this.json_frequency = IotNodeStep.staticSetJson_frequency(siteRequest_, o);
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
	protected IotNodeStep json_frequencyInit() {
		Wrap<BigDecimal> json_frequencyWrap = new Wrap<BigDecimal>().var("json_frequency");
		if(json_frequency == null) {
			_json_frequency(json_frequencyWrap);
			setJson_frequency(json_frequencyWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static Double staticSearchJson_frequency(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_frequency(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_frequency(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_frequency(siteRequest_, IotNodeStep.staticSearchJson_frequency(siteRequest_, IotNodeStep.staticSetJson_frequency(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_devEui">Find the entity json_devEui in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_devEui(Wrap<String> w);

	public String getJson_devEui() {
		return json_devEui;
	}
	public void setJson_devEui(String o) {
		this.json_devEui = IotNodeStep.staticSetJson_devEui(siteRequest_, o);
	}
	public static String staticSetJson_devEui(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected IotNodeStep json_devEuiInit() {
		Wrap<String> json_devEuiWrap = new Wrap<String>().var("json_devEui");
		if(json_devEui == null) {
			_json_devEui(json_devEuiWrap);
			setJson_devEui(json_devEuiWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static String staticSearchJson_devEui(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrJson_devEui(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_devEui(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_devEui(siteRequest_, IotNodeStep.staticSearchJson_devEui(siteRequest_, IotNodeStep.staticSetJson_devEui(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_bandwidth">Find the entity json_bandwidth in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_bandwidth(Wrap<String> w);

	public String getJson_bandwidth() {
		return json_bandwidth;
	}
	public void setJson_bandwidth(String o) {
		this.json_bandwidth = IotNodeStep.staticSetJson_bandwidth(siteRequest_, o);
	}
	public static String staticSetJson_bandwidth(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected IotNodeStep json_bandwidthInit() {
		Wrap<String> json_bandwidthWrap = new Wrap<String>().var("json_bandwidth");
		if(json_bandwidth == null) {
			_json_bandwidth(json_bandwidthWrap);
			setJson_bandwidth(json_bandwidthWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static String staticSearchJson_bandwidth(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrJson_bandwidth(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_bandwidth(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_bandwidth(siteRequest_, IotNodeStep.staticSearchJson_bandwidth(siteRequest_, IotNodeStep.staticSetJson_bandwidth(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_dataRate">Find the entity json_dataRate in Solr</a>
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
		this.json_dataRate = IotNodeStep.staticSetJson_dataRate(siteRequest_, o);
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
	protected IotNodeStep json_dataRateInit() {
		Wrap<BigDecimal> json_dataRateWrap = new Wrap<BigDecimal>().var("json_dataRate");
		if(json_dataRate == null) {
			_json_dataRate(json_dataRateWrap);
			setJson_dataRate(json_dataRateWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static Double staticSearchJson_dataRate(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_dataRate(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_dataRate(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_dataRate(siteRequest_, IotNodeStep.staticSearchJson_dataRate(siteRequest_, IotNodeStep.staticSetJson_dataRate(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_frameCount">Find the entity json_frameCount in Solr</a>
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
		this.json_frameCount = IotNodeStep.staticSetJson_frameCount(siteRequest_, o);
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
	protected IotNodeStep json_frameCountInit() {
		Wrap<BigDecimal> json_frameCountWrap = new Wrap<BigDecimal>().var("json_frameCount");
		if(json_frameCount == null) {
			_json_frameCount(json_frameCountWrap);
			setJson_frameCount(json_frameCountWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static Double staticSearchJson_frameCount(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_frameCount(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_frameCount(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_frameCount(siteRequest_, IotNodeStep.staticSearchJson_frameCount(siteRequest_, IotNodeStep.staticSetJson_frameCount(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_maxPayload">Find the entity json_maxPayload in Solr</a>
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
		this.json_maxPayload = IotNodeStep.staticSetJson_maxPayload(siteRequest_, o);
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
	protected IotNodeStep json_maxPayloadInit() {
		Wrap<BigDecimal> json_maxPayloadWrap = new Wrap<BigDecimal>().var("json_maxPayload");
		if(json_maxPayload == null) {
			_json_maxPayload(json_maxPayloadWrap);
			setJson_maxPayload(json_maxPayloadWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static Double staticSearchJson_maxPayload(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_maxPayload(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_maxPayload(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_maxPayload(siteRequest_, IotNodeStep.staticSearchJson_maxPayload(siteRequest_, IotNodeStep.staticSetJson_maxPayload(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_bitsPerSecond">Find the entity json_bitsPerSecond in Solr</a>
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
		this.json_bitsPerSecond = IotNodeStep.staticSetJson_bitsPerSecond(siteRequest_, o);
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
	protected IotNodeStep json_bitsPerSecondInit() {
		Wrap<BigDecimal> json_bitsPerSecondWrap = new Wrap<BigDecimal>().var("json_bitsPerSecond");
		if(json_bitsPerSecond == null) {
			_json_bitsPerSecond(json_bitsPerSecondWrap);
			setJson_bitsPerSecond(json_bitsPerSecondWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static Double staticSearchJson_bitsPerSecond(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_bitsPerSecond(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_bitsPerSecond(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_bitsPerSecond(siteRequest_, IotNodeStep.staticSearchJson_bitsPerSecond(siteRequest_, IotNodeStep.staticSetJson_bitsPerSecond(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_batteryVoltage">Find the entity json_batteryVoltage in Solr</a>
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
		this.json_batteryVoltage = IotNodeStep.staticSetJson_batteryVoltage(siteRequest_, o);
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
	protected IotNodeStep json_batteryVoltageInit() {
		Wrap<BigDecimal> json_batteryVoltageWrap = new Wrap<BigDecimal>().var("json_batteryVoltage");
		if(json_batteryVoltage == null) {
			_json_batteryVoltage(json_batteryVoltageWrap);
			setJson_batteryVoltage(json_batteryVoltageWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static Double staticSearchJson_batteryVoltage(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_batteryVoltage(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_batteryVoltage(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_batteryVoltage(siteRequest_, IotNodeStep.staticSearchJson_batteryVoltage(siteRequest_, IotNodeStep.staticSetJson_batteryVoltage(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_spreadingFactor">Find the entity json_spreadingFactor in Solr</a>
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
		this.json_spreadingFactor = IotNodeStep.staticSetJson_spreadingFactor(siteRequest_, o);
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
	protected IotNodeStep json_spreadingFactorInit() {
		Wrap<BigDecimal> json_spreadingFactorWrap = new Wrap<BigDecimal>().var("json_spreadingFactor");
		if(json_spreadingFactor == null) {
			_json_spreadingFactor(json_spreadingFactorWrap);
			setJson_spreadingFactor(json_spreadingFactorWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static Double staticSearchJson_spreadingFactor(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_spreadingFactor(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_spreadingFactor(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_spreadingFactor(siteRequest_, IotNodeStep.staticSearchJson_spreadingFactor(siteRequest_, IotNodeStep.staticSetJson_spreadingFactor(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_dataRateAdaptive">Find the entity json_dataRateAdaptive in Solr</a>
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
		this.json_dataRateAdaptive = IotNodeStep.staticSetJson_dataRateAdaptive(siteRequest_, o);
	}
	public static Boolean staticSetJson_dataRateAdaptive(SiteRequestEnUS siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected IotNodeStep json_dataRateAdaptiveInit() {
		Wrap<Boolean> json_dataRateAdaptiveWrap = new Wrap<Boolean>().var("json_dataRateAdaptive");
		if(json_dataRateAdaptive == null) {
			_json_dataRateAdaptive(json_dataRateAdaptiveWrap);
			setJson_dataRateAdaptive(json_dataRateAdaptiveWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static Boolean staticSearchJson_dataRateAdaptive(SiteRequestEnUS siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrJson_dataRateAdaptive(SiteRequestEnUS siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_dataRateAdaptive(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_dataRateAdaptive(siteRequest_, IotNodeStep.staticSearchJson_dataRateAdaptive(siteRequest_, IotNodeStep.staticSetJson_dataRateAdaptive(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_swversion">Find the entity json_swversion in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_swversion(Wrap<String> w);

	public String getJson_swversion() {
		return json_swversion;
	}
	public void setJson_swversion(String o) {
		this.json_swversion = IotNodeStep.staticSetJson_swversion(siteRequest_, o);
	}
	public static String staticSetJson_swversion(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected IotNodeStep json_swversionInit() {
		Wrap<String> json_swversionWrap = new Wrap<String>().var("json_swversion");
		if(json_swversion == null) {
			_json_swversion(json_swversionWrap);
			setJson_swversion(json_swversionWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static String staticSearchJson_swversion(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrJson_swversion(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_swversion(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_swversion(siteRequest_, IotNodeStep.staticSearchJson_swversion(siteRequest_, IotNodeStep.staticSetJson_swversion(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_batteryLevel">Find the entity json_batteryLevel in Solr</a>
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
		this.json_batteryLevel = IotNodeStep.staticSetJson_batteryLevel(siteRequest_, o);
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
	protected IotNodeStep json_batteryLevelInit() {
		Wrap<BigDecimal> json_batteryLevelWrap = new Wrap<BigDecimal>().var("json_batteryLevel");
		if(json_batteryLevel == null) {
			_json_batteryLevel(json_batteryLevelWrap);
			setJson_batteryLevel(json_batteryLevelWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static Double staticSearchJson_batteryLevel(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_batteryLevel(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_batteryLevel(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_batteryLevel(siteRequest_, IotNodeStep.staticSearchJson_batteryLevel(siteRequest_, IotNodeStep.staticSetJson_batteryLevel(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_startUpCount">Find the entity json_startUpCount in Solr</a>
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
		this.json_startUpCount = IotNodeStep.staticSetJson_startUpCount(siteRequest_, o);
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
	protected IotNodeStep json_startUpCountInit() {
		Wrap<BigDecimal> json_startUpCountWrap = new Wrap<BigDecimal>().var("json_startUpCount");
		if(json_startUpCount == null) {
			_json_startUpCount(json_startUpCountWrap);
			setJson_startUpCount(json_startUpCountWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static Double staticSearchJson_startUpCount(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_startUpCount(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_startUpCount(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_startUpCount(siteRequest_, IotNodeStep.staticSearchJson_startUpCount(siteRequest_, IotNodeStep.staticSetJson_startUpCount(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_watchdogCount">Find the entity json_watchdogCount in Solr</a>
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
		this.json_watchdogCount = IotNodeStep.staticSetJson_watchdogCount(siteRequest_, o);
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
	protected IotNodeStep json_watchdogCountInit() {
		Wrap<BigDecimal> json_watchdogCountWrap = new Wrap<BigDecimal>().var("json_watchdogCount");
		if(json_watchdogCount == null) {
			_json_watchdogCount(json_watchdogCountWrap);
			setJson_watchdogCount(json_watchdogCountWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static Double staticSearchJson_watchdogCount(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_watchdogCount(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_watchdogCount(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_watchdogCount(siteRequest_, IotNodeStep.staticSearchJson_watchdogCount(siteRequest_, IotNodeStep.staticSetJson_watchdogCount(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_historySequence">Find the entity json_historySequence in Solr</a>
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
		this.json_historySequence = IotNodeStep.staticSetJson_historySequence(siteRequest_, o);
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
	protected IotNodeStep json_historySequenceInit() {
		Wrap<BigDecimal> json_historySequenceWrap = new Wrap<BigDecimal>().var("json_historySequence");
		if(json_historySequence == null) {
			_json_historySequence(json_historySequenceWrap);
			setJson_historySequence(json_historySequenceWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static Double staticSearchJson_historySequence(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_historySequence(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_historySequence(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_historySequence(siteRequest_, IotNodeStep.staticSearchJson_historySequence(siteRequest_, IotNodeStep.staticSetJson_historySequence(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_versionFirmware">Find the entity json_versionFirmware in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _json_versionFirmware(Wrap<String> w);

	public String getJson_versionFirmware() {
		return json_versionFirmware;
	}
	public void setJson_versionFirmware(String o) {
		this.json_versionFirmware = IotNodeStep.staticSetJson_versionFirmware(siteRequest_, o);
	}
	public static String staticSetJson_versionFirmware(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected IotNodeStep json_versionFirmwareInit() {
		Wrap<String> json_versionFirmwareWrap = new Wrap<String>().var("json_versionFirmware");
		if(json_versionFirmware == null) {
			_json_versionFirmware(json_versionFirmwareWrap);
			setJson_versionFirmware(json_versionFirmwareWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static String staticSearchJson_versionFirmware(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrJson_versionFirmware(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_versionFirmware(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_versionFirmware(siteRequest_, IotNodeStep.staticSearchJson_versionFirmware(siteRequest_, IotNodeStep.staticSetJson_versionFirmware(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_stackTxFailRebootCount">Find the entity json_stackTxFailRebootCount in Solr</a>
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
		this.json_stackTxFailRebootCount = IotNodeStep.staticSetJson_stackTxFailRebootCount(siteRequest_, o);
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
	protected IotNodeStep json_stackTxFailRebootCountInit() {
		Wrap<BigDecimal> json_stackTxFailRebootCountWrap = new Wrap<BigDecimal>().var("json_stackTxFailRebootCount");
		if(json_stackTxFailRebootCount == null) {
			_json_stackTxFailRebootCount(json_stackTxFailRebootCountWrap);
			setJson_stackTxFailRebootCount(json_stackTxFailRebootCountWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static Double staticSearchJson_stackTxFailRebootCount(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_stackTxFailRebootCount(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_stackTxFailRebootCount(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_stackTxFailRebootCount(siteRequest_, IotNodeStep.staticSearchJson_stackTxFailRebootCount(siteRequest_, IotNodeStep.staticSetJson_stackTxFailRebootCount(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_historySequencePrevious">Find the entity json_historySequencePrevious in Solr</a>
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
		this.json_historySequencePrevious = IotNodeStep.staticSetJson_historySequencePrevious(siteRequest_, o);
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
	protected IotNodeStep json_historySequencePreviousInit() {
		Wrap<BigDecimal> json_historySequencePreviousWrap = new Wrap<BigDecimal>().var("json_historySequencePrevious");
		if(json_historySequencePrevious == null) {
			_json_historySequencePrevious(json_historySequencePreviousWrap);
			setJson_historySequencePrevious(json_historySequencePreviousWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static Double staticSearchJson_historySequencePrevious(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_historySequencePrevious(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_historySequencePrevious(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_historySequencePrevious(siteRequest_, IotNodeStep.staticSearchJson_historySequencePrevious(siteRequest_, IotNodeStep.staticSetJson_historySequencePrevious(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_snr">Find the entity json_snr in Solr</a>
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
		this.json_snr = IotNodeStep.staticSetJson_snr(siteRequest_, o);
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
	protected IotNodeStep json_snrInit() {
		Wrap<BigDecimal> json_snrWrap = new Wrap<BigDecimal>().var("json_snr");
		if(json_snr == null) {
			_json_snr(json_snrWrap);
			setJson_snr(json_snrWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static Double staticSearchJson_snr(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_snr(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_snr(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_snr(siteRequest_, IotNodeStep.staticSearchJson_snr(siteRequest_, IotNodeStep.staticSetJson_snr(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep&fq=entiteVar_enUS_indexed_string:json_rssi">Find the entity json_rssi in Solr</a>
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
		this.json_rssi = IotNodeStep.staticSetJson_rssi(siteRequest_, o);
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
	protected IotNodeStep json_rssiInit() {
		Wrap<BigDecimal> json_rssiWrap = new Wrap<BigDecimal>().var("json_rssi");
		if(json_rssi == null) {
			_json_rssi(json_rssiWrap);
			setJson_rssi(json_rssiWrap.o);
		}
		return (IotNodeStep)this;
	}

	public static Double staticSearchJson_rssi(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrJson_rssi(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJson_rssi(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStep.staticSearchStrJson_rssi(siteRequest_, IotNodeStep.staticSearchJson_rssi(siteRequest_, IotNodeStep.staticSetJson_rssi(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepIotNodeStep(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepIotNodeStep();
	}

	public Future<Void> promiseDeepIotNodeStep() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseIotNodeStep(promise2);
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

	public Future<Void> promiseIotNodeStep(Promise<Void> promise) {
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
		return promiseDeepIotNodeStep(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestIotNodeStep(SiteRequestEnUS siteRequest_) {
			super.siteRequestBaseResult(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestIotNodeStep(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainIotNodeStep(v);
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
	public Object obtainIotNodeStep(String var) {
		IotNodeStep oIotNodeStep = (IotNodeStep)this;
		switch(var) {
			case "json":
				return oIotNodeStep.json;
			case "nodeName":
				return oIotNodeStep.nodeName;
			case "nodeType":
				return oIotNodeStep.nodeType;
			case "nodeId":
				return oIotNodeStep.nodeId;
			case "location":
				return oIotNodeStep.location;
			case "json_moisture":
				return oIotNodeStep.json_moisture;
			case "json_moisture0":
				return oIotNodeStep.json_moisture0;
			case "json_moisture1":
				return oIotNodeStep.json_moisture1;
			case "json_temperature":
				return oIotNodeStep.json_temperature;
			case "json_temperature0":
				return oIotNodeStep.json_temperature0;
			case "json_temperatureAverage":
				return oIotNodeStep.json_temperatureAverage;
			case "json_badConditionsCounter":
				return oIotNodeStep.json_badConditionsCounter;
			case "json_door":
				return oIotNodeStep.json_door;
			case "json_alarmDoor":
				return oIotNodeStep.json_alarmDoor;
			case "json_flood":
				return oIotNodeStep.json_flood;
			case "json_alarmFlood":
				return oIotNodeStep.json_alarmFlood;
			case "json_lux2":
				return oIotNodeStep.json_lux2;
			case "json_illuminance":
				return oIotNodeStep.json_illuminance;
			case "json_resistance0":
				return oIotNodeStep.json_resistance0;
			case "json_resistance1":
				return oIotNodeStep.json_resistance1;
			case "json_frequency":
				return oIotNodeStep.json_frequency;
			case "json_devEui":
				return oIotNodeStep.json_devEui;
			case "json_bandwidth":
				return oIotNodeStep.json_bandwidth;
			case "json_dataRate":
				return oIotNodeStep.json_dataRate;
			case "json_frameCount":
				return oIotNodeStep.json_frameCount;
			case "json_maxPayload":
				return oIotNodeStep.json_maxPayload;
			case "json_bitsPerSecond":
				return oIotNodeStep.json_bitsPerSecond;
			case "json_batteryVoltage":
				return oIotNodeStep.json_batteryVoltage;
			case "json_spreadingFactor":
				return oIotNodeStep.json_spreadingFactor;
			case "json_dataRateAdaptive":
				return oIotNodeStep.json_dataRateAdaptive;
			case "json_swversion":
				return oIotNodeStep.json_swversion;
			case "json_batteryLevel":
				return oIotNodeStep.json_batteryLevel;
			case "json_startUpCount":
				return oIotNodeStep.json_startUpCount;
			case "json_watchdogCount":
				return oIotNodeStep.json_watchdogCount;
			case "json_historySequence":
				return oIotNodeStep.json_historySequence;
			case "json_versionFirmware":
				return oIotNodeStep.json_versionFirmware;
			case "json_stackTxFailRebootCount":
				return oIotNodeStep.json_stackTxFailRebootCount;
			case "json_historySequencePrevious":
				return oIotNodeStep.json_historySequencePrevious;
			case "json_snr":
				return oIotNodeStep.json_snr;
			case "json_rssi":
				return oIotNodeStep.json_rssi;
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
				o = relateIotNodeStep(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateIotNodeStep(String var, Object val) {
		IotNodeStep oIotNodeStep = (IotNodeStep)this;
		switch(var) {
			default:
				return super.relateBaseResult(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetIotNodeStep(entityVar,  siteRequest_, o);
	}
	public static Object staticSetIotNodeStep(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "json":
			return IotNodeStep.staticSetJson(siteRequest_, o);
		case "nodeName":
			return IotNodeStep.staticSetNodeName(siteRequest_, o);
		case "nodeType":
			return IotNodeStep.staticSetNodeType(siteRequest_, o);
		case "nodeId":
			return IotNodeStep.staticSetNodeId(siteRequest_, o);
		case "location":
			return IotNodeStep.staticSetLocation(siteRequest_, o);
		case "json_moisture":
			return IotNodeStep.staticSetJson_moisture(siteRequest_, o);
		case "json_moisture0":
			return IotNodeStep.staticSetJson_moisture0(siteRequest_, o);
		case "json_moisture1":
			return IotNodeStep.staticSetJson_moisture1(siteRequest_, o);
		case "json_temperature":
			return IotNodeStep.staticSetJson_temperature(siteRequest_, o);
		case "json_temperature0":
			return IotNodeStep.staticSetJson_temperature0(siteRequest_, o);
		case "json_temperatureAverage":
			return IotNodeStep.staticSetJson_temperatureAverage(siteRequest_, o);
		case "json_badConditionsCounter":
			return IotNodeStep.staticSetJson_badConditionsCounter(siteRequest_, o);
		case "json_door":
			return IotNodeStep.staticSetJson_door(siteRequest_, o);
		case "json_alarmDoor":
			return IotNodeStep.staticSetJson_alarmDoor(siteRequest_, o);
		case "json_flood":
			return IotNodeStep.staticSetJson_flood(siteRequest_, o);
		case "json_alarmFlood":
			return IotNodeStep.staticSetJson_alarmFlood(siteRequest_, o);
		case "json_lux2":
			return IotNodeStep.staticSetJson_lux2(siteRequest_, o);
		case "json_illuminance":
			return IotNodeStep.staticSetJson_illuminance(siteRequest_, o);
		case "json_resistance0":
			return IotNodeStep.staticSetJson_resistance0(siteRequest_, o);
		case "json_resistance1":
			return IotNodeStep.staticSetJson_resistance1(siteRequest_, o);
		case "json_frequency":
			return IotNodeStep.staticSetJson_frequency(siteRequest_, o);
		case "json_devEui":
			return IotNodeStep.staticSetJson_devEui(siteRequest_, o);
		case "json_bandwidth":
			return IotNodeStep.staticSetJson_bandwidth(siteRequest_, o);
		case "json_dataRate":
			return IotNodeStep.staticSetJson_dataRate(siteRequest_, o);
		case "json_frameCount":
			return IotNodeStep.staticSetJson_frameCount(siteRequest_, o);
		case "json_maxPayload":
			return IotNodeStep.staticSetJson_maxPayload(siteRequest_, o);
		case "json_bitsPerSecond":
			return IotNodeStep.staticSetJson_bitsPerSecond(siteRequest_, o);
		case "json_batteryVoltage":
			return IotNodeStep.staticSetJson_batteryVoltage(siteRequest_, o);
		case "json_spreadingFactor":
			return IotNodeStep.staticSetJson_spreadingFactor(siteRequest_, o);
		case "json_dataRateAdaptive":
			return IotNodeStep.staticSetJson_dataRateAdaptive(siteRequest_, o);
		case "json_swversion":
			return IotNodeStep.staticSetJson_swversion(siteRequest_, o);
		case "json_batteryLevel":
			return IotNodeStep.staticSetJson_batteryLevel(siteRequest_, o);
		case "json_startUpCount":
			return IotNodeStep.staticSetJson_startUpCount(siteRequest_, o);
		case "json_watchdogCount":
			return IotNodeStep.staticSetJson_watchdogCount(siteRequest_, o);
		case "json_historySequence":
			return IotNodeStep.staticSetJson_historySequence(siteRequest_, o);
		case "json_versionFirmware":
			return IotNodeStep.staticSetJson_versionFirmware(siteRequest_, o);
		case "json_stackTxFailRebootCount":
			return IotNodeStep.staticSetJson_stackTxFailRebootCount(siteRequest_, o);
		case "json_historySequencePrevious":
			return IotNodeStep.staticSetJson_historySequencePrevious(siteRequest_, o);
		case "json_snr":
			return IotNodeStep.staticSetJson_snr(siteRequest_, o);
		case "json_rssi":
			return IotNodeStep.staticSetJson_rssi(siteRequest_, o);
			default:
				return BaseResult.staticSetBaseResult(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchIotNodeStep(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchIotNodeStep(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "json":
			return IotNodeStep.staticSearchJson(siteRequest_, (JsonObject)o);
		case "nodeName":
			return IotNodeStep.staticSearchNodeName(siteRequest_, (String)o);
		case "nodeType":
			return IotNodeStep.staticSearchNodeType(siteRequest_, (String)o);
		case "nodeId":
			return IotNodeStep.staticSearchNodeId(siteRequest_, (String)o);
		case "location":
			return IotNodeStep.staticSearchLocation(siteRequest_, (Point)o);
		case "json_moisture":
			return IotNodeStep.staticSearchJson_moisture(siteRequest_, (BigDecimal)o);
		case "json_moisture0":
			return IotNodeStep.staticSearchJson_moisture0(siteRequest_, (BigDecimal)o);
		case "json_moisture1":
			return IotNodeStep.staticSearchJson_moisture1(siteRequest_, (BigDecimal)o);
		case "json_temperature":
			return IotNodeStep.staticSearchJson_temperature(siteRequest_, (BigDecimal)o);
		case "json_temperature0":
			return IotNodeStep.staticSearchJson_temperature0(siteRequest_, (BigDecimal)o);
		case "json_temperatureAverage":
			return IotNodeStep.staticSearchJson_temperatureAverage(siteRequest_, (BigDecimal)o);
		case "json_badConditionsCounter":
			return IotNodeStep.staticSearchJson_badConditionsCounter(siteRequest_, (BigDecimal)o);
		case "json_door":
			return IotNodeStep.staticSearchJson_door(siteRequest_, (String)o);
		case "json_alarmDoor":
			return IotNodeStep.staticSearchJson_alarmDoor(siteRequest_, (Boolean)o);
		case "json_flood":
			return IotNodeStep.staticSearchJson_flood(siteRequest_, (BigDecimal)o);
		case "json_alarmFlood":
			return IotNodeStep.staticSearchJson_alarmFlood(siteRequest_, (Boolean)o);
		case "json_lux2":
			return IotNodeStep.staticSearchJson_lux2(siteRequest_, (BigDecimal)o);
		case "json_illuminance":
			return IotNodeStep.staticSearchJson_illuminance(siteRequest_, (BigDecimal)o);
		case "json_resistance0":
			return IotNodeStep.staticSearchJson_resistance0(siteRequest_, (BigDecimal)o);
		case "json_resistance1":
			return IotNodeStep.staticSearchJson_resistance1(siteRequest_, (BigDecimal)o);
		case "json_frequency":
			return IotNodeStep.staticSearchJson_frequency(siteRequest_, (BigDecimal)o);
		case "json_devEui":
			return IotNodeStep.staticSearchJson_devEui(siteRequest_, (String)o);
		case "json_bandwidth":
			return IotNodeStep.staticSearchJson_bandwidth(siteRequest_, (String)o);
		case "json_dataRate":
			return IotNodeStep.staticSearchJson_dataRate(siteRequest_, (BigDecimal)o);
		case "json_frameCount":
			return IotNodeStep.staticSearchJson_frameCount(siteRequest_, (BigDecimal)o);
		case "json_maxPayload":
			return IotNodeStep.staticSearchJson_maxPayload(siteRequest_, (BigDecimal)o);
		case "json_bitsPerSecond":
			return IotNodeStep.staticSearchJson_bitsPerSecond(siteRequest_, (BigDecimal)o);
		case "json_batteryVoltage":
			return IotNodeStep.staticSearchJson_batteryVoltage(siteRequest_, (BigDecimal)o);
		case "json_spreadingFactor":
			return IotNodeStep.staticSearchJson_spreadingFactor(siteRequest_, (BigDecimal)o);
		case "json_dataRateAdaptive":
			return IotNodeStep.staticSearchJson_dataRateAdaptive(siteRequest_, (Boolean)o);
		case "json_swversion":
			return IotNodeStep.staticSearchJson_swversion(siteRequest_, (String)o);
		case "json_batteryLevel":
			return IotNodeStep.staticSearchJson_batteryLevel(siteRequest_, (BigDecimal)o);
		case "json_startUpCount":
			return IotNodeStep.staticSearchJson_startUpCount(siteRequest_, (BigDecimal)o);
		case "json_watchdogCount":
			return IotNodeStep.staticSearchJson_watchdogCount(siteRequest_, (BigDecimal)o);
		case "json_historySequence":
			return IotNodeStep.staticSearchJson_historySequence(siteRequest_, (BigDecimal)o);
		case "json_versionFirmware":
			return IotNodeStep.staticSearchJson_versionFirmware(siteRequest_, (String)o);
		case "json_stackTxFailRebootCount":
			return IotNodeStep.staticSearchJson_stackTxFailRebootCount(siteRequest_, (BigDecimal)o);
		case "json_historySequencePrevious":
			return IotNodeStep.staticSearchJson_historySequencePrevious(siteRequest_, (BigDecimal)o);
		case "json_snr":
			return IotNodeStep.staticSearchJson_snr(siteRequest_, (BigDecimal)o);
		case "json_rssi":
			return IotNodeStep.staticSearchJson_rssi(siteRequest_, (BigDecimal)o);
			default:
				return BaseResult.staticSearchBaseResult(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrIotNodeStep(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrIotNodeStep(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "json":
			return IotNodeStep.staticSearchStrJson(siteRequest_, (JsonObject)o);
		case "nodeName":
			return IotNodeStep.staticSearchStrNodeName(siteRequest_, (String)o);
		case "nodeType":
			return IotNodeStep.staticSearchStrNodeType(siteRequest_, (String)o);
		case "nodeId":
			return IotNodeStep.staticSearchStrNodeId(siteRequest_, (String)o);
		case "location":
			return IotNodeStep.staticSearchStrLocation(siteRequest_, (Point)o);
		case "json_moisture":
			return IotNodeStep.staticSearchStrJson_moisture(siteRequest_, (Double)o);
		case "json_moisture0":
			return IotNodeStep.staticSearchStrJson_moisture0(siteRequest_, (Double)o);
		case "json_moisture1":
			return IotNodeStep.staticSearchStrJson_moisture1(siteRequest_, (Double)o);
		case "json_temperature":
			return IotNodeStep.staticSearchStrJson_temperature(siteRequest_, (Double)o);
		case "json_temperature0":
			return IotNodeStep.staticSearchStrJson_temperature0(siteRequest_, (Double)o);
		case "json_temperatureAverage":
			return IotNodeStep.staticSearchStrJson_temperatureAverage(siteRequest_, (Double)o);
		case "json_badConditionsCounter":
			return IotNodeStep.staticSearchStrJson_badConditionsCounter(siteRequest_, (Double)o);
		case "json_door":
			return IotNodeStep.staticSearchStrJson_door(siteRequest_, (String)o);
		case "json_alarmDoor":
			return IotNodeStep.staticSearchStrJson_alarmDoor(siteRequest_, (Boolean)o);
		case "json_flood":
			return IotNodeStep.staticSearchStrJson_flood(siteRequest_, (Double)o);
		case "json_alarmFlood":
			return IotNodeStep.staticSearchStrJson_alarmFlood(siteRequest_, (Boolean)o);
		case "json_lux2":
			return IotNodeStep.staticSearchStrJson_lux2(siteRequest_, (Double)o);
		case "json_illuminance":
			return IotNodeStep.staticSearchStrJson_illuminance(siteRequest_, (Double)o);
		case "json_resistance0":
			return IotNodeStep.staticSearchStrJson_resistance0(siteRequest_, (Double)o);
		case "json_resistance1":
			return IotNodeStep.staticSearchStrJson_resistance1(siteRequest_, (Double)o);
		case "json_frequency":
			return IotNodeStep.staticSearchStrJson_frequency(siteRequest_, (Double)o);
		case "json_devEui":
			return IotNodeStep.staticSearchStrJson_devEui(siteRequest_, (String)o);
		case "json_bandwidth":
			return IotNodeStep.staticSearchStrJson_bandwidth(siteRequest_, (String)o);
		case "json_dataRate":
			return IotNodeStep.staticSearchStrJson_dataRate(siteRequest_, (Double)o);
		case "json_frameCount":
			return IotNodeStep.staticSearchStrJson_frameCount(siteRequest_, (Double)o);
		case "json_maxPayload":
			return IotNodeStep.staticSearchStrJson_maxPayload(siteRequest_, (Double)o);
		case "json_bitsPerSecond":
			return IotNodeStep.staticSearchStrJson_bitsPerSecond(siteRequest_, (Double)o);
		case "json_batteryVoltage":
			return IotNodeStep.staticSearchStrJson_batteryVoltage(siteRequest_, (Double)o);
		case "json_spreadingFactor":
			return IotNodeStep.staticSearchStrJson_spreadingFactor(siteRequest_, (Double)o);
		case "json_dataRateAdaptive":
			return IotNodeStep.staticSearchStrJson_dataRateAdaptive(siteRequest_, (Boolean)o);
		case "json_swversion":
			return IotNodeStep.staticSearchStrJson_swversion(siteRequest_, (String)o);
		case "json_batteryLevel":
			return IotNodeStep.staticSearchStrJson_batteryLevel(siteRequest_, (Double)o);
		case "json_startUpCount":
			return IotNodeStep.staticSearchStrJson_startUpCount(siteRequest_, (Double)o);
		case "json_watchdogCount":
			return IotNodeStep.staticSearchStrJson_watchdogCount(siteRequest_, (Double)o);
		case "json_historySequence":
			return IotNodeStep.staticSearchStrJson_historySequence(siteRequest_, (Double)o);
		case "json_versionFirmware":
			return IotNodeStep.staticSearchStrJson_versionFirmware(siteRequest_, (String)o);
		case "json_stackTxFailRebootCount":
			return IotNodeStep.staticSearchStrJson_stackTxFailRebootCount(siteRequest_, (Double)o);
		case "json_historySequencePrevious":
			return IotNodeStep.staticSearchStrJson_historySequencePrevious(siteRequest_, (Double)o);
		case "json_snr":
			return IotNodeStep.staticSearchStrJson_snr(siteRequest_, (Double)o);
		case "json_rssi":
			return IotNodeStep.staticSearchStrJson_rssi(siteRequest_, (Double)o);
			default:
				return BaseResult.staticSearchStrBaseResult(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqIotNodeStep(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqIotNodeStep(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "json":
			return IotNodeStep.staticSearchFqJson(siteRequest_, o);
		case "nodeName":
			return IotNodeStep.staticSearchFqNodeName(siteRequest_, o);
		case "nodeType":
			return IotNodeStep.staticSearchFqNodeType(siteRequest_, o);
		case "nodeId":
			return IotNodeStep.staticSearchFqNodeId(siteRequest_, o);
		case "location":
			return IotNodeStep.staticSearchFqLocation(siteRequest_, o);
		case "json_moisture":
			return IotNodeStep.staticSearchFqJson_moisture(siteRequest_, o);
		case "json_moisture0":
			return IotNodeStep.staticSearchFqJson_moisture0(siteRequest_, o);
		case "json_moisture1":
			return IotNodeStep.staticSearchFqJson_moisture1(siteRequest_, o);
		case "json_temperature":
			return IotNodeStep.staticSearchFqJson_temperature(siteRequest_, o);
		case "json_temperature0":
			return IotNodeStep.staticSearchFqJson_temperature0(siteRequest_, o);
		case "json_temperatureAverage":
			return IotNodeStep.staticSearchFqJson_temperatureAverage(siteRequest_, o);
		case "json_badConditionsCounter":
			return IotNodeStep.staticSearchFqJson_badConditionsCounter(siteRequest_, o);
		case "json_door":
			return IotNodeStep.staticSearchFqJson_door(siteRequest_, o);
		case "json_alarmDoor":
			return IotNodeStep.staticSearchFqJson_alarmDoor(siteRequest_, o);
		case "json_flood":
			return IotNodeStep.staticSearchFqJson_flood(siteRequest_, o);
		case "json_alarmFlood":
			return IotNodeStep.staticSearchFqJson_alarmFlood(siteRequest_, o);
		case "json_lux2":
			return IotNodeStep.staticSearchFqJson_lux2(siteRequest_, o);
		case "json_illuminance":
			return IotNodeStep.staticSearchFqJson_illuminance(siteRequest_, o);
		case "json_resistance0":
			return IotNodeStep.staticSearchFqJson_resistance0(siteRequest_, o);
		case "json_resistance1":
			return IotNodeStep.staticSearchFqJson_resistance1(siteRequest_, o);
		case "json_frequency":
			return IotNodeStep.staticSearchFqJson_frequency(siteRequest_, o);
		case "json_devEui":
			return IotNodeStep.staticSearchFqJson_devEui(siteRequest_, o);
		case "json_bandwidth":
			return IotNodeStep.staticSearchFqJson_bandwidth(siteRequest_, o);
		case "json_dataRate":
			return IotNodeStep.staticSearchFqJson_dataRate(siteRequest_, o);
		case "json_frameCount":
			return IotNodeStep.staticSearchFqJson_frameCount(siteRequest_, o);
		case "json_maxPayload":
			return IotNodeStep.staticSearchFqJson_maxPayload(siteRequest_, o);
		case "json_bitsPerSecond":
			return IotNodeStep.staticSearchFqJson_bitsPerSecond(siteRequest_, o);
		case "json_batteryVoltage":
			return IotNodeStep.staticSearchFqJson_batteryVoltage(siteRequest_, o);
		case "json_spreadingFactor":
			return IotNodeStep.staticSearchFqJson_spreadingFactor(siteRequest_, o);
		case "json_dataRateAdaptive":
			return IotNodeStep.staticSearchFqJson_dataRateAdaptive(siteRequest_, o);
		case "json_swversion":
			return IotNodeStep.staticSearchFqJson_swversion(siteRequest_, o);
		case "json_batteryLevel":
			return IotNodeStep.staticSearchFqJson_batteryLevel(siteRequest_, o);
		case "json_startUpCount":
			return IotNodeStep.staticSearchFqJson_startUpCount(siteRequest_, o);
		case "json_watchdogCount":
			return IotNodeStep.staticSearchFqJson_watchdogCount(siteRequest_, o);
		case "json_historySequence":
			return IotNodeStep.staticSearchFqJson_historySequence(siteRequest_, o);
		case "json_versionFirmware":
			return IotNodeStep.staticSearchFqJson_versionFirmware(siteRequest_, o);
		case "json_stackTxFailRebootCount":
			return IotNodeStep.staticSearchFqJson_stackTxFailRebootCount(siteRequest_, o);
		case "json_historySequencePrevious":
			return IotNodeStep.staticSearchFqJson_historySequencePrevious(siteRequest_, o);
		case "json_snr":
			return IotNodeStep.staticSearchFqJson_snr(siteRequest_, o);
		case "json_rssi":
			return IotNodeStep.staticSearchFqJson_rssi(siteRequest_, o);
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
					o = persistIotNodeStep(v, val);
				else if(o instanceof BaseModel) {
					BaseModel oBaseModel = (BaseModel)o;
					o = oBaseModel.persistForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object persistIotNodeStep(String var, Object val) {
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
		populateIotNodeStep(doc);
	}
	public void populateIotNodeStep(SolrResponse.Doc doc) {
		IotNodeStep oIotNodeStep = (IotNodeStep)this;
		saves = doc.get("saves_docvalues_strings");
		if(saves != null) {
		}

		super.populateBaseResult(doc);
	}

	public void indexIotNodeStep(JsonObject doc) {
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

	public static String varStoredIotNodeStep(String entityVar) {
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

	public static String varIndexedIotNodeStep(String entityVar) {
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

	public static String searchVarIotNodeStep(String searchVar) {
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

	public static String varSearchIotNodeStep(String entityVar) {
		switch(entityVar) {
			default:
				return BaseResult.varSearchBaseResult(entityVar);
		}
	}

	public static String varSuggestedIotNodeStep(String entityVar) {
		switch(entityVar) {
			default:
				return BaseResult.varSuggestedBaseResult(entityVar);
		}
	}

	/////////////
	// store //
	/////////////

	@Override public void storeForClass(SolrResponse.Doc doc) {
		storeIotNodeStep(doc);
	}
	public void storeIotNodeStep(SolrResponse.Doc doc) {
		IotNodeStep oIotNodeStep = (IotNodeStep)this;

		oIotNodeStep.setJson(Optional.ofNullable(doc.get("json_docvalues_string")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setNodeName(Optional.ofNullable(doc.get("nodeName_docvalues_string")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setNodeType(Optional.ofNullable(doc.get("nodeType_docvalues_string")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setNodeId(Optional.ofNullable(doc.get("nodeId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setLocation(Optional.ofNullable(doc.get("location_docvalues_location")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_moisture(Optional.ofNullable(doc.get("json_moisture_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_moisture0(Optional.ofNullable(doc.get("json_moisture0_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_moisture1(Optional.ofNullable(doc.get("json_moisture1_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_temperature(Optional.ofNullable(doc.get("json_temperature_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_temperature0(Optional.ofNullable(doc.get("json_temperature0_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_temperatureAverage(Optional.ofNullable(doc.get("json_temperatureAverage_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_badConditionsCounter(Optional.ofNullable(doc.get("json_badConditionsCounter_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_door(Optional.ofNullable(doc.get("json_door_docvalues_string")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_alarmDoor(Optional.ofNullable(doc.get("json_alarmDoor_docvalues_boolean")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_flood(Optional.ofNullable(doc.get("json_flood_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_alarmFlood(Optional.ofNullable(doc.get("json_alarmFlood_docvalues_boolean")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_lux2(Optional.ofNullable(doc.get("json_lux2_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_illuminance(Optional.ofNullable(doc.get("json_illuminance_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_resistance0(Optional.ofNullable(doc.get("json_resistance0_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_resistance1(Optional.ofNullable(doc.get("json_resistance1_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_frequency(Optional.ofNullable(doc.get("json_frequency_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_devEui(Optional.ofNullable(doc.get("json_devEui_docvalues_string")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_bandwidth(Optional.ofNullable(doc.get("json_bandwidth_docvalues_string")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_dataRate(Optional.ofNullable(doc.get("json_dataRate_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_frameCount(Optional.ofNullable(doc.get("json_frameCount_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_maxPayload(Optional.ofNullable(doc.get("json_maxPayload_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_bitsPerSecond(Optional.ofNullable(doc.get("json_bitsPerSecond_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_batteryVoltage(Optional.ofNullable(doc.get("json_batteryVoltage_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_spreadingFactor(Optional.ofNullable(doc.get("json_spreadingFactor_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_dataRateAdaptive(Optional.ofNullable(doc.get("json_dataRateAdaptive_docvalues_boolean")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_swversion(Optional.ofNullable(doc.get("json_swversion_docvalues_string")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_batteryLevel(Optional.ofNullable(doc.get("json_batteryLevel_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_startUpCount(Optional.ofNullable(doc.get("json_startUpCount_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_watchdogCount(Optional.ofNullable(doc.get("json_watchdogCount_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_historySequence(Optional.ofNullable(doc.get("json_historySequence_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_versionFirmware(Optional.ofNullable(doc.get("json_versionFirmware_docvalues_string")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_stackTxFailRebootCount(Optional.ofNullable(doc.get("json_stackTxFailRebootCount_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_historySequencePrevious(Optional.ofNullable(doc.get("json_historySequencePrevious_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_snr(Optional.ofNullable(doc.get("json_snr_docvalues_double")).map(v -> v.toString()).orElse(null));
		oIotNodeStep.setJson_rssi(Optional.ofNullable(doc.get("json_rssi_docvalues_double")).map(v -> v.toString()).orElse(null));

		super.storeBaseResult(doc);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestIotNodeStep() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof IotNodeStep) {
			IotNodeStep original = (IotNodeStep)o;
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

	public static final String CLASS_SIMPLE_NAME = "IotNodeStep";
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
		return IotNodeStep.varsQIotNodeStep(new ArrayList<String>());
	}
	public static List<String> varsQIotNodeStep(List<String> vars) {
		BaseResult.varsQBaseResult(vars);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return IotNodeStep.varsFqIotNodeStep(new ArrayList<String>());
	}
	public static List<String> varsFqIotNodeStep(List<String> vars) {
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
		return IotNodeStep.varsRangeIotNodeStep(new ArrayList<String>());
	}
	public static List<String> varsRangeIotNodeStep(List<String> vars) {
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
		return IotNodeStep.displayNameIotNodeStep(var);
	}
	public static String displayNameIotNodeStep(String var) {
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

	public static String descriptionIotNodeStep(String var) {
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

	public static String classSimpleNameIotNodeStep(String var) {
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

	public static Integer htmlColumnIotNodeStep(String var) {
		switch(var) {
			default:
				return BaseResult.htmlColumnBaseResult(var);
		}
	}

	public static Integer htmlRowIotNodeStep(String var) {
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

	public static Integer htmlCellIotNodeStep(String var) {
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

	public static Integer lengthMinIotNodeStep(String var) {
		switch(var) {
			default:
				return BaseResult.lengthMinBaseResult(var);
		}
	}

	public static Integer lengthMaxIotNodeStep(String var) {
		switch(var) {
			default:
				return BaseResult.lengthMaxBaseResult(var);
		}
	}

	public static Integer maxIotNodeStep(String var) {
		switch(var) {
			default:
				return BaseResult.maxBaseResult(var);
		}
	}

	public static Integer minIotNodeStep(String var) {
		switch(var) {
			default:
				return BaseResult.minBaseResult(var);
		}
	}
}
