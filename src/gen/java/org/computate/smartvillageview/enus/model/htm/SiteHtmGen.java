package org.computate.smartvillageview.enus.model.htm;

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
import java.lang.String;
import java.lang.Long;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import java.lang.Boolean;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;

/**	
 * <h1>Suggestions that can generate more code for you: </h1>
 * <ol>
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class SiteHtmGen into the class SiteHtm. 
 * </li>
 * <li>You can add a class comment "Model: true" if you wish to persist these SiteHtm objects in a relational PostgreSQL database transactionally in the RESTful API. 
 * The code to persist and query the SiteHtmGen data in the database will then be automatically generated. 
 * </li>
 * <li>You can add a class comment "Rows: 100" if you wish the SiteHtm API to return more or less than 10 records by default. 
 * In this case, the API will return 100 records from the API instead of 10 by default. 
 * Each API has built in pagination of the search records to ensure a user can query all the data a page at a time without running the application out of memory. 
 * </li>
 * </ol>
 * <h1>About the SiteHtm class and it's generated class SiteHtmGen&lt;BaseResult&gt;: </h1>
 * <p>
 * This Java class extends a generated Java class built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm">Find the class SiteHtm in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * <p>This class contains a comment <b>"Indexed: true"</b>, which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * <p>This class contains a comment <b>"Page: true"</b>, which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.smartvillageview.enus.model.htm.SiteHtmPage. 
 * </p>
 * <p>This class contains a comment <b>"SuperPage.enUS: BaseResultPage"</b>, which identifies the Java super class of the page code by it's class simple name "BaseResultPage". 
 * This means that the newly created class org.computate.smartvillageview.enus.model.htm.SiteHtmPage extends org.computate.smartvillageview.enus.result.base.BaseResultPage. 
 * </p>
 * <p>This class contains a comment <b>"Api: true"</b>, which means this class will have Java Vert.x API backend code generated for these objects. 
 * </p>
 * <p>This class contains a comment <b>"ApiTag: HTM"</b>, which groups all of the OpenAPIs for SiteHtm objects under the tag "HTM". 
 * </p>
 * <p>This class contains a comment <b>"ApiUri: /api/htm"</b>, which defines the base API URI for SiteHtm objects as "/api/htm" in the OpenAPI spec. 
 * </p>
 * <p>This class contains a comment <b>"AName.enUS: an HTML"</b>, which identifies the language context to describe a SiteHtm as "an HTML". 
 * </p>
 * <p>This class contains a comment <b>"Color: 2017-navy-peony"</b>, which styles the SiteHtm page "2017-navy-peony". 
 * This will reference a CSS class defined by the stylesheets in the project that starts with "w3-". 
 * A css class of "w3-2017-navy-peony" is expected to exist in the project stylesheets, and is inspired by W3 CSS colors. 
 * See: <a href="https://www.w3schools.com/w3css/w3css_colors.asp">https://www.w3schools.com/w3css/w3css_colors.asp</a>. 
 * </p>
 * <p>This class contains a comment <b>"IconGroup: duotone"</b>, which adds icons on the SiteHtm page with a group of "duotone". 
 * This will reference a Font Awesome icon group defined by the stylesheets in the project that starts with "fa" followed by the first letter of the icon group, which is "fad". 
 * A Font Awesome icon group of "2017-navy-peony" is expected to exist. 
 * The Font Awesome groups currently supported include: solid, thin, duotone. 
 * See: <a href="https://www.w3schools.com/w3css/w3css_colors.asp">https://www.w3schools.com/w3css/w3css_colors.asp</a>. 
 * </p>
 * <p>
 * Delete the class SiteHtm in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.htm in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smart-village-view in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smart\-village\-view&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class SiteHtmGen<DEV> extends BaseResult {
	protected static final Logger LOG = LoggerFactory.getLogger(SiteHtm.class);

	public static final String SiteHtm_Description_enUS = "An HTML part that is indexed in the search engine. ";
	public static final String SiteHtm_AName_enUS = "an HTML";
	public static final String SiteHtm_This_enUS = "this ";
	public static final String SiteHtm_ThisName_enUS = "this HTML";
	public static final String SiteHtm_A_enUS = "a ";
	public static final String SiteHtm_TheName_enUS = "theHTML";
	public static final String SiteHtm_NameSingular_enUS = "HTML";
	public static final String SiteHtm_NamePlural_enUS = "HTMLs";
	public static final String SiteHtm_NameActual_enUS = "current HTML";
	public static final String SiteHtm_AllName_enUS = "all the HTMLs";
	public static final String SiteHtm_SearchAllNameBy_enUS = "search HTMLs by ";
	public static final String SiteHtm_Title_enUS = "HTMLs";
	public static final String SiteHtm_ThePluralName_enUS = "the HTMLs";
	public static final String SiteHtm_NoNameFound_enUS = "no HTML found";
	public static final String SiteHtm_ApiUri_enUS = "/api/htm";
	public static final String SiteHtm_ApiUriSearchPage_enUS = "/htm";
	public static final String SiteHtm_OfName_enUS = "of HTML";
	public static final String SiteHtm_ANameAdjective_enUS = "an HTML";
	public static final String SiteHtm_NameAdjectiveSingular_enUS = "HTML";
	public static final String SiteHtm_NameAdjectivePlural_enUS = "HTMLs";
	public static final String Search_enUS_Uri = "/api/htm";
	public static final String Search_enUS_ImageUri = "/png/api/htm-999.png";
	public static final String GET_enUS_Uri = "/api/htm/{id}";
	public static final String GET_enUS_ImageUri = "/png/api/htm/{id}-999.png";
	public static final String POST_enUS_Uri = "/api/htm";
	public static final String POST_enUS_ImageUri = "/png/api/htm-999.png";
	public static final String PATCH_enUS_Uri = "/api/htm";
	public static final String PATCH_enUS_ImageUri = "/png/api/htm-999.png";
	public static final String PUTImport_enUS_Uri = "/api/htm-import";
	public static final String PUTImport_enUS_ImageUri = "/png/api/htm-import-999.png";
	public static final String SearchPage_enUS_Uri = "/htm";
	public static final String SearchPage_enUS_ImageUri = "/png/htm-999.png";

	public static final String SiteHtm_Color = "2017-navy-peony";
	public static final String SiteHtm_IconGroup = "duotone";
	public static final String SiteHtm_IconName = "code";

	/////////
	// uri //
	/////////

	/**	 The entity uri
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String uri;

	/**	<br> The entity uri
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:uri">Find the entity uri in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _uri(Wrap<String> w);

	public String getUri() {
		return uri;
	}
	public void setUri(String o) {
		this.uri = SiteHtm.staticSetUri(siteRequest_, o);
	}
	public static String staticSetUri(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtm uriInit() {
		Wrap<String> uriWrap = new Wrap<String>().var("uri");
		if(uri == null) {
			_uri(uriWrap);
			setUri(uriWrap.o);
		}
		return (SiteHtm)this;
	}

	public static String staticSearchUri(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrUri(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUri(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrUri(siteRequest_, SiteHtm.staticSearchUri(siteRequest_, SiteHtm.staticSetUri(siteRequest_, o)));
	}

	public String sqlUri() {
		return uri;
	}

	////////////
	// pageId //
	////////////

	/**	 The entity pageId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageId;

	/**	<br> The entity pageId
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:pageId">Find the entity pageId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageId(Wrap<String> w);

	public String getPageId() {
		return pageId;
	}
	public void setPageId(String o) {
		this.pageId = SiteHtm.staticSetPageId(siteRequest_, o);
	}
	public static String staticSetPageId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtm pageIdInit() {
		Wrap<String> pageIdWrap = new Wrap<String>().var("pageId");
		if(pageId == null) {
			_pageId(pageIdWrap);
			setPageId(pageIdWrap.o);
		}
		return (SiteHtm)this;
	}

	public static String staticSearchPageId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageId(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrPageId(siteRequest_, SiteHtm.staticSearchPageId(siteRequest_, SiteHtm.staticSetPageId(siteRequest_, o)));
	}

	public String sqlPageId() {
		return pageId;
	}

	/////////////////
	// sequenceNum //
	/////////////////

	/**	 The entity sequenceNum
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long sequenceNum;

	/**	<br> The entity sequenceNum
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:sequenceNum">Find the entity sequenceNum in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _sequenceNum(Wrap<Long> w);

	public Long getSequenceNum() {
		return sequenceNum;
	}

	public void setSequenceNum(Long sequenceNum) {
		this.sequenceNum = sequenceNum;
	}
	@JsonIgnore
	public void setSequenceNum(String o) {
		this.sequenceNum = SiteHtm.staticSetSequenceNum(siteRequest_, o);
	}
	public static Long staticSetSequenceNum(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected SiteHtm sequenceNumInit() {
		Wrap<Long> sequenceNumWrap = new Wrap<Long>().var("sequenceNum");
		if(sequenceNum == null) {
			_sequenceNum(sequenceNumWrap);
			setSequenceNum(sequenceNumWrap.o);
		}
		return (SiteHtm)this;
	}

	public static Long staticSearchSequenceNum(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrSequenceNum(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSequenceNum(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrSequenceNum(siteRequest_, SiteHtm.staticSearchSequenceNum(siteRequest_, SiteHtm.staticSetSequenceNum(siteRequest_, o)));
	}

	public Long sqlSequenceNum() {
		return sequenceNum;
	}

	//////////////
	// htmGroup //
	//////////////

	/**	 The entity htmGroup
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String htmGroup;

	/**	<br> The entity htmGroup
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:htmGroup">Find the entity htmGroup in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _htmGroup(Wrap<String> w);

	public String getHtmGroup() {
		return htmGroup;
	}
	public void setHtmGroup(String o) {
		this.htmGroup = SiteHtm.staticSetHtmGroup(siteRequest_, o);
	}
	public static String staticSetHtmGroup(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtm htmGroupInit() {
		Wrap<String> htmGroupWrap = new Wrap<String>().var("htmGroup");
		if(htmGroup == null) {
			_htmGroup(htmGroupWrap);
			setHtmGroup(htmGroupWrap.o);
		}
		return (SiteHtm)this;
	}

	public static String staticSearchHtmGroup(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrHtmGroup(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqHtmGroup(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrHtmGroup(siteRequest_, SiteHtm.staticSearchHtmGroup(siteRequest_, SiteHtm.staticSetHtmGroup(siteRequest_, o)));
	}

	public String sqlHtmGroup() {
		return htmGroup;
	}

	////////////
	// labels //
	////////////

	/**	 The entity labels
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> labels = new ArrayList<String>();

	/**	<br> The entity labels
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:labels">Find the entity labels in Solr</a>
	 * <br>
	 * @param w is the entity already constructed. 
	 **/
	protected abstract void _labels(List<String> w);

	public List<String> getLabels() {
		return labels;
	}

	public void setLabels(List<String> labels) {
		this.labels = labels;
	}
	public static String staticSetLabels(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public SiteHtm addLabels(String...objects) {
		for(String o : objects) {
			addLabels(o);
		}
		return (SiteHtm)this;
	}
	public SiteHtm addLabels(String o) {
		if(o != null)
			this.labels.add(o);
		return (SiteHtm)this;
	}
	@JsonIgnore
	public void setLabels(JsonArray objects) {
		labels.clear();
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addLabels(o);
		}
	}
	protected SiteHtm labelsInit() {
		_labels(labels);
		return (SiteHtm)this;
	}

	public static String staticSearchLabels(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrLabels(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqLabels(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrLabels(siteRequest_, SiteHtm.staticSearchLabels(siteRequest_, SiteHtm.staticSetLabels(siteRequest_, o)));
	}

	public List<String> sqlLabels() {
		return labels;
	}

	/////////////
	// eBefore //
	/////////////

	/**	 The entity eBefore
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String eBefore;

	/**	<br> The entity eBefore
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:eBefore">Find the entity eBefore in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _eBefore(Wrap<String> w);

	public String getEBefore() {
		return eBefore;
	}
	public void setEBefore(String o) {
		this.eBefore = SiteHtm.staticSetEBefore(siteRequest_, o);
	}
	public static String staticSetEBefore(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtm eBeforeInit() {
		Wrap<String> eBeforeWrap = new Wrap<String>().var("eBefore");
		if(eBefore == null) {
			_eBefore(eBeforeWrap);
			setEBefore(eBeforeWrap.o);
		}
		return (SiteHtm)this;
	}

	public static String staticSearchEBefore(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrEBefore(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqEBefore(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrEBefore(siteRequest_, SiteHtm.staticSearchEBefore(siteRequest_, SiteHtm.staticSetEBefore(siteRequest_, o)));
	}

	public String sqlEBefore() {
		return eBefore;
	}

	////////////
	// eAfter //
	////////////

	/**	 The entity eAfter
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String eAfter;

	/**	<br> The entity eAfter
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:eAfter">Find the entity eAfter in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _eAfter(Wrap<String> w);

	public String getEAfter() {
		return eAfter;
	}
	public void setEAfter(String o) {
		this.eAfter = SiteHtm.staticSetEAfter(siteRequest_, o);
	}
	public static String staticSetEAfter(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtm eAfterInit() {
		Wrap<String> eAfterWrap = new Wrap<String>().var("eAfter");
		if(eAfter == null) {
			_eAfter(eAfterWrap);
			setEAfter(eAfterWrap.o);
		}
		return (SiteHtm)this;
	}

	public static String staticSearchEAfter(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrEAfter(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqEAfter(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrEAfter(siteRequest_, SiteHtm.staticSearchEAfter(siteRequest_, SiteHtm.staticSetEAfter(siteRequest_, o)));
	}

	public String sqlEAfter() {
		return eAfter;
	}

	///////
	// a //
	///////

	/**	 The entity a
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject a;

	/**	<br> The entity a
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:a">Find the entity a in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _a(Wrap<JsonObject> w);

	public JsonObject getA() {
		return a;
	}

	public void setA(JsonObject a) {
		this.a = a;
	}
	@JsonIgnore
	public void setA(String o) {
		this.a = SiteHtm.staticSetA(siteRequest_, o);
	}
	public static JsonObject staticSetA(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected SiteHtm aInit() {
		Wrap<JsonObject> aWrap = new Wrap<JsonObject>().var("a");
		if(a == null) {
			_a(aWrap);
			setA(aWrap.o);
		}
		return (SiteHtm)this;
	}

	public static JsonObject staticSearchA(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrA(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqA(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrA(siteRequest_, SiteHtm.staticSearchA(siteRequest_, SiteHtm.staticSetA(siteRequest_, o)));
	}

	public JsonObject sqlA() {
		return a;
	}

	//////////
	// text //
	//////////

	/**	 The entity text
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> text = new ArrayList<String>();

	/**	<br> The entity text
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:text">Find the entity text in Solr</a>
	 * <br>
	 * @param w is the entity already constructed. 
	 **/
	protected abstract void _text(List<String> w);

	public List<String> getText() {
		return text;
	}

	public void setText(List<String> text) {
		this.text = text;
	}
	public static String staticSetText(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public SiteHtm addText(String...objects) {
		for(String o : objects) {
			addText(o);
		}
		return (SiteHtm)this;
	}
	public SiteHtm addText(String o) {
		if(o != null)
			this.text.add(o);
		return (SiteHtm)this;
	}
	@JsonIgnore
	public void setText(JsonArray objects) {
		text.clear();
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addText(o);
		}
	}
	protected SiteHtm textInit() {
		_text(text);
		return (SiteHtm)this;
	}

	public static String staticSearchText(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrText(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqText(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrText(siteRequest_, SiteHtm.staticSearchText(siteRequest_, SiteHtm.staticSetText(siteRequest_, o)));
	}

	public List<String> sqlText() {
		return text;
	}

	/////////////
	// comment //
	/////////////

	/**	 The entity comment
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> comment = new ArrayList<String>();

	/**	<br> The entity comment
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:comment">Find the entity comment in Solr</a>
	 * <br>
	 * @param w is the entity already constructed. 
	 **/
	protected abstract void _comment(List<String> w);

	public List<String> getComment() {
		return comment;
	}

	public void setComment(List<String> comment) {
		this.comment = comment;
	}
	public static String staticSetComment(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public SiteHtm addComment(String...objects) {
		for(String o : objects) {
			addComment(o);
		}
		return (SiteHtm)this;
	}
	public SiteHtm addComment(String o) {
		if(o != null)
			this.comment.add(o);
		return (SiteHtm)this;
	}
	@JsonIgnore
	public void setComment(JsonArray objects) {
		comment.clear();
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addComment(o);
		}
	}
	protected SiteHtm commentInit() {
		_comment(comment);
		return (SiteHtm)this;
	}

	public static String staticSearchComment(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrComment(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqComment(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrComment(siteRequest_, SiteHtm.staticSearchComment(siteRequest_, SiteHtm.staticSetComment(siteRequest_, o)));
	}

	public List<String> sqlComment() {
		return comment;
	}

	//////////
	// tabs //
	//////////

	/**	 The entity tabs
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String tabs;

	/**	<br> The entity tabs
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:tabs">Find the entity tabs in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _tabs(Wrap<String> w);

	public String getTabs() {
		return tabs;
	}
	public void setTabs(String o) {
		this.tabs = SiteHtm.staticSetTabs(siteRequest_, o);
	}
	public static String staticSetTabs(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtm tabsInit() {
		Wrap<String> tabsWrap = new Wrap<String>().var("tabs");
		if(tabs == null) {
			_tabs(tabsWrap);
			setTabs(tabsWrap.o);
		}
		return (SiteHtm)this;
	}

	public static String staticSearchTabs(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrTabs(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqTabs(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrTabs(siteRequest_, SiteHtm.staticSearchTabs(siteRequest_, SiteHtm.staticSetTabs(siteRequest_, o)));
	}

	public String sqlTabs() {
		return tabs;
	}

	/////////////
	// newLine //
	/////////////

	/**	 The entity newLine
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Boolean newLine;

	/**	<br> The entity newLine
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:newLine">Find the entity newLine in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _newLine(Wrap<Boolean> w);

	public Boolean getNewLine() {
		return newLine;
	}

	public void setNewLine(Boolean newLine) {
		this.newLine = newLine;
	}
	@JsonIgnore
	public void setNewLine(String o) {
		this.newLine = SiteHtm.staticSetNewLine(siteRequest_, o);
	}
	public static Boolean staticSetNewLine(SiteRequestEnUS siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected SiteHtm newLineInit() {
		Wrap<Boolean> newLineWrap = new Wrap<Boolean>().var("newLine");
		if(newLine == null) {
			_newLine(newLineWrap);
			setNewLine(newLineWrap.o);
		}
		return (SiteHtm)this;
	}

	public static Boolean staticSearchNewLine(SiteRequestEnUS siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrNewLine(SiteRequestEnUS siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqNewLine(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrNewLine(siteRequest_, SiteHtm.staticSearchNewLine(siteRequest_, SiteHtm.staticSetNewLine(siteRequest_, o)));
	}

	public Boolean sqlNewLine() {
		return newLine;
	}

	///////////////
	// htmBefore //
	///////////////

	/**	 The entity htmBefore
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String htmBefore;

	/**	<br> The entity htmBefore
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:htmBefore">Find the entity htmBefore in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _htmBefore(Wrap<String> w);

	public String getHtmBefore() {
		return htmBefore;
	}
	public void setHtmBefore(String o) {
		this.htmBefore = SiteHtm.staticSetHtmBefore(siteRequest_, o);
	}
	public static String staticSetHtmBefore(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtm htmBeforeInit() {
		Wrap<String> htmBeforeWrap = new Wrap<String>().var("htmBefore");
		if(htmBefore == null) {
			_htmBefore(htmBeforeWrap);
			setHtmBefore(htmBeforeWrap.o);
		}
		return (SiteHtm)this;
	}

	public static String staticSearchHtmBefore(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrHtmBefore(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqHtmBefore(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrHtmBefore(siteRequest_, SiteHtm.staticSearchHtmBefore(siteRequest_, SiteHtm.staticSetHtmBefore(siteRequest_, o)));
	}

	public String sqlHtmBefore() {
		return htmBefore;
	}

	//////////////
	// htmAfter //
	//////////////

	/**	 The entity htmAfter
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String htmAfter;

	/**	<br> The entity htmAfter
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:htmAfter">Find the entity htmAfter in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _htmAfter(Wrap<String> w);

	public String getHtmAfter() {
		return htmAfter;
	}
	public void setHtmAfter(String o) {
		this.htmAfter = SiteHtm.staticSetHtmAfter(siteRequest_, o);
	}
	public static String staticSetHtmAfter(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtm htmAfterInit() {
		Wrap<String> htmAfterWrap = new Wrap<String>().var("htmAfter");
		if(htmAfter == null) {
			_htmAfter(htmAfterWrap);
			setHtmAfter(htmAfterWrap.o);
		}
		return (SiteHtm)this;
	}

	public static String staticSearchHtmAfter(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrHtmAfter(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqHtmAfter(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrHtmAfter(siteRequest_, SiteHtm.staticSearchHtmAfter(siteRequest_, SiteHtm.staticSetHtmAfter(siteRequest_, o)));
	}

	public String sqlHtmAfter() {
		return htmAfter;
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepSiteHtm(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepSiteHtm();
	}

	public Future<Void> promiseDeepSiteHtm() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseSiteHtm(promise2);
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

	public Future<Void> promiseSiteHtm(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				uriInit();
				pageIdInit();
				sequenceNumInit();
				htmGroupInit();
				labelsInit();
				eBeforeInit();
				eAfterInit();
				aInit();
				textInit();
				commentInit();
				tabsInit();
				newLineInit();
				htmBeforeInit();
				htmAfterInit();
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
		return promiseDeepSiteHtm(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestSiteHtm(SiteRequestEnUS siteRequest_) {
			super.siteRequestBaseResult(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestSiteHtm(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainSiteHtm(v);
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
	public Object obtainSiteHtm(String var) {
		SiteHtm oSiteHtm = (SiteHtm)this;
		switch(var) {
			case "uri":
				return oSiteHtm.uri;
			case "pageId":
				return oSiteHtm.pageId;
			case "sequenceNum":
				return oSiteHtm.sequenceNum;
			case "htmGroup":
				return oSiteHtm.htmGroup;
			case "labels":
				return oSiteHtm.labels;
			case "eBefore":
				return oSiteHtm.eBefore;
			case "eAfter":
				return oSiteHtm.eAfter;
			case "a":
				return oSiteHtm.a;
			case "text":
				return oSiteHtm.text;
			case "comment":
				return oSiteHtm.comment;
			case "tabs":
				return oSiteHtm.tabs;
			case "newLine":
				return oSiteHtm.newLine;
			case "htmBefore":
				return oSiteHtm.htmBefore;
			case "htmAfter":
				return oSiteHtm.htmAfter;
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
				o = relateSiteHtm(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateSiteHtm(String var, Object val) {
		SiteHtm oSiteHtm = (SiteHtm)this;
		switch(var) {
			default:
				return super.relateBaseResult(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetSiteHtm(entityVar,  siteRequest_, o);
	}
	public static Object staticSetSiteHtm(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "uri":
			return SiteHtm.staticSetUri(siteRequest_, o);
		case "pageId":
			return SiteHtm.staticSetPageId(siteRequest_, o);
		case "sequenceNum":
			return SiteHtm.staticSetSequenceNum(siteRequest_, o);
		case "htmGroup":
			return SiteHtm.staticSetHtmGroup(siteRequest_, o);
		case "labels":
			return SiteHtm.staticSetLabels(siteRequest_, o);
		case "eBefore":
			return SiteHtm.staticSetEBefore(siteRequest_, o);
		case "eAfter":
			return SiteHtm.staticSetEAfter(siteRequest_, o);
		case "a":
			return SiteHtm.staticSetA(siteRequest_, o);
		case "text":
			return SiteHtm.staticSetText(siteRequest_, o);
		case "comment":
			return SiteHtm.staticSetComment(siteRequest_, o);
		case "tabs":
			return SiteHtm.staticSetTabs(siteRequest_, o);
		case "newLine":
			return SiteHtm.staticSetNewLine(siteRequest_, o);
		case "htmBefore":
			return SiteHtm.staticSetHtmBefore(siteRequest_, o);
		case "htmAfter":
			return SiteHtm.staticSetHtmAfter(siteRequest_, o);
			default:
				return BaseResult.staticSetBaseResult(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchSiteHtm(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchSiteHtm(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "uri":
			return SiteHtm.staticSearchUri(siteRequest_, (String)o);
		case "pageId":
			return SiteHtm.staticSearchPageId(siteRequest_, (String)o);
		case "sequenceNum":
			return SiteHtm.staticSearchSequenceNum(siteRequest_, (Long)o);
		case "htmGroup":
			return SiteHtm.staticSearchHtmGroup(siteRequest_, (String)o);
		case "labels":
			return SiteHtm.staticSearchLabels(siteRequest_, (String)o);
		case "eBefore":
			return SiteHtm.staticSearchEBefore(siteRequest_, (String)o);
		case "eAfter":
			return SiteHtm.staticSearchEAfter(siteRequest_, (String)o);
		case "a":
			return SiteHtm.staticSearchA(siteRequest_, (JsonObject)o);
		case "text":
			return SiteHtm.staticSearchText(siteRequest_, (String)o);
		case "comment":
			return SiteHtm.staticSearchComment(siteRequest_, (String)o);
		case "tabs":
			return SiteHtm.staticSearchTabs(siteRequest_, (String)o);
		case "newLine":
			return SiteHtm.staticSearchNewLine(siteRequest_, (Boolean)o);
		case "htmBefore":
			return SiteHtm.staticSearchHtmBefore(siteRequest_, (String)o);
		case "htmAfter":
			return SiteHtm.staticSearchHtmAfter(siteRequest_, (String)o);
			default:
				return BaseResult.staticSearchBaseResult(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrSiteHtm(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrSiteHtm(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "uri":
			return SiteHtm.staticSearchStrUri(siteRequest_, (String)o);
		case "pageId":
			return SiteHtm.staticSearchStrPageId(siteRequest_, (String)o);
		case "sequenceNum":
			return SiteHtm.staticSearchStrSequenceNum(siteRequest_, (Long)o);
		case "htmGroup":
			return SiteHtm.staticSearchStrHtmGroup(siteRequest_, (String)o);
		case "labels":
			return SiteHtm.staticSearchStrLabels(siteRequest_, (String)o);
		case "eBefore":
			return SiteHtm.staticSearchStrEBefore(siteRequest_, (String)o);
		case "eAfter":
			return SiteHtm.staticSearchStrEAfter(siteRequest_, (String)o);
		case "a":
			return SiteHtm.staticSearchStrA(siteRequest_, (JsonObject)o);
		case "text":
			return SiteHtm.staticSearchStrText(siteRequest_, (String)o);
		case "comment":
			return SiteHtm.staticSearchStrComment(siteRequest_, (String)o);
		case "tabs":
			return SiteHtm.staticSearchStrTabs(siteRequest_, (String)o);
		case "newLine":
			return SiteHtm.staticSearchStrNewLine(siteRequest_, (Boolean)o);
		case "htmBefore":
			return SiteHtm.staticSearchStrHtmBefore(siteRequest_, (String)o);
		case "htmAfter":
			return SiteHtm.staticSearchStrHtmAfter(siteRequest_, (String)o);
			default:
				return BaseResult.staticSearchStrBaseResult(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqSiteHtm(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqSiteHtm(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "uri":
			return SiteHtm.staticSearchFqUri(siteRequest_, o);
		case "pageId":
			return SiteHtm.staticSearchFqPageId(siteRequest_, o);
		case "sequenceNum":
			return SiteHtm.staticSearchFqSequenceNum(siteRequest_, o);
		case "htmGroup":
			return SiteHtm.staticSearchFqHtmGroup(siteRequest_, o);
		case "labels":
			return SiteHtm.staticSearchFqLabels(siteRequest_, o);
		case "eBefore":
			return SiteHtm.staticSearchFqEBefore(siteRequest_, o);
		case "eAfter":
			return SiteHtm.staticSearchFqEAfter(siteRequest_, o);
		case "a":
			return SiteHtm.staticSearchFqA(siteRequest_, o);
		case "text":
			return SiteHtm.staticSearchFqText(siteRequest_, o);
		case "comment":
			return SiteHtm.staticSearchFqComment(siteRequest_, o);
		case "tabs":
			return SiteHtm.staticSearchFqTabs(siteRequest_, o);
		case "newLine":
			return SiteHtm.staticSearchFqNewLine(siteRequest_, o);
		case "htmBefore":
			return SiteHtm.staticSearchFqHtmBefore(siteRequest_, o);
		case "htmAfter":
			return SiteHtm.staticSearchFqHtmAfter(siteRequest_, o);
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
					o = persistSiteHtm(v, val);
				else if(o instanceof BaseModel) {
					BaseModel oBaseModel = (BaseModel)o;
					o = oBaseModel.persistForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object persistSiteHtm(String var, Object val) {
		switch(var.toLowerCase()) {
			case "uri":
				if(val instanceof String)
					setUri((String)val);
				saves.add("uri");
				return val;
			case "pageid":
				if(val instanceof String)
					setPageId((String)val);
				saves.add("pageId");
				return val;
			case "sequencenum":
				if(val instanceof Long)
					setSequenceNum((Long)val);
				else if(val instanceof String)
					setSequenceNum((String)val);
				saves.add("sequenceNum");
				return val;
			case "htmgroup":
				if(val instanceof String)
					setHtmGroup((String)val);
				saves.add("htmGroup");
				return val;
			case "labels":
				if(val instanceof List<?>)
					((List<String>)val).stream().forEach(v -> addLabels(v));
				else if(val instanceof JsonArray)
					((JsonArray)val).stream().forEach(v -> addLabels(v.toString()));
				if(!saves.contains("labels"))
					saves.add("labels");
				return val;
			case "ebefore":
				if(val instanceof String)
					setEBefore((String)val);
				saves.add("eBefore");
				return val;
			case "eafter":
				if(val instanceof String)
					setEAfter((String)val);
				saves.add("eAfter");
				return val;
			case "a":
				if(val instanceof String)
					setA((String)val);
				else if(val instanceof JsonObject)
					setA((JsonObject)val);
				saves.add("a");
				return val;
			case "text":
				if(val instanceof List<?>)
					((List<String>)val).stream().forEach(v -> addText(v));
				else if(val instanceof JsonArray)
					((JsonArray)val).stream().forEach(v -> addText(v.toString()));
				if(!saves.contains("text"))
					saves.add("text");
				return val;
			case "comment":
				if(val instanceof List<?>)
					((List<String>)val).stream().forEach(v -> addComment(v));
				else if(val instanceof JsonArray)
					((JsonArray)val).stream().forEach(v -> addComment(v.toString()));
				if(!saves.contains("comment"))
					saves.add("comment");
				return val;
			case "tabs":
				if(val instanceof String)
					setTabs((String)val);
				saves.add("tabs");
				return val;
			case "newline":
				if(val instanceof Boolean)
					setNewLine((Boolean)val);
				else if(val instanceof String)
					setNewLine((String)val);
				saves.add("newLine");
				return val;
			case "htmbefore":
				if(val instanceof String)
					setHtmBefore((String)val);
				saves.add("htmBefore");
				return val;
			case "htmafter":
				if(val instanceof String)
					setHtmAfter((String)val);
				saves.add("htmAfter");
				return val;
			default:
				return super.persistBaseResult(var, val);
		}
	}

	/////////////
	// populate //
	/////////////

	@Override public void populateForClass(SolrResponse.Doc doc) {
		populateSiteHtm(doc);
	}
	public void populateSiteHtm(SolrResponse.Doc doc) {
		SiteHtm oSiteHtm = (SiteHtm)this;
		saves = doc.get("saves_docvalues_strings");
		if(saves != null) {
		}

		super.populateBaseResult(doc);
	}

	public void indexSiteHtm(JsonObject doc) {
		if(uri != null) {
			doc.put("uri_docvalues_string", uri);
		}
		if(pageId != null) {
			doc.put("pageId_docvalues_string", pageId);
		}
		if(sequenceNum != null) {
			doc.put("sequenceNum_docvalues_long", sequenceNum);
		}
		if(htmGroup != null) {
			doc.put("htmGroup_docvalues_string", htmGroup);
		}
		if(labels != null) {
			JsonArray l = new JsonArray();
			doc.put("labels_docvalues_strings", l);
			for(String o : labels) {
				l.add(o);
			}
		}
		if(eBefore != null) {
			doc.put("eBefore_docvalues_string", eBefore);
		}
		if(eAfter != null) {
			doc.put("eAfter_docvalues_string", eAfter);
		}
		if(a != null) {
			doc.put("a_docvalues_string", a.toString());
		}
		if(text != null) {
			JsonArray l = new JsonArray();
			doc.put("text_text_enUS", l);
			for(String o : text) {
				l.add(o);
			}
		}
		if(comment != null) {
			JsonArray l = new JsonArray();
			doc.put("comment_docvalues_strings", l);
			for(String o : comment) {
				l.add(o);
			}
		}
		if(tabs != null) {
			doc.put("tabs_docvalues_string", tabs);
		}
		if(newLine != null) {
			doc.put("newLine_docvalues_boolean", newLine);
		}
		if(htmBefore != null) {
			doc.put("htmBefore_stored_string", htmBefore);
		}
		if(htmAfter != null) {
			doc.put("htmAfter_stored_string", htmAfter);
		}
		super.indexBaseResult(doc);

	}

	public static String varStoredSiteHtm(String entityVar) {
		switch(entityVar) {
			case "uri":
				return "uri_docvalues_string";
			case "pageId":
				return "pageId_docvalues_string";
			case "sequenceNum":
				return "sequenceNum_docvalues_long";
			case "htmGroup":
				return "htmGroup_docvalues_string";
			case "labels":
				return "labels_docvalues_strings";
			case "eBefore":
				return "eBefore_docvalues_string";
			case "eAfter":
				return "eAfter_docvalues_string";
			case "a":
				return "a_docvalues_string";
			case "comment":
				return "comment_docvalues_strings";
			case "tabs":
				return "tabs_docvalues_string";
			case "newLine":
				return "newLine_docvalues_boolean";
			case "htmBefore":
				return "htmBefore_stored_string";
			case "htmAfter":
				return "htmAfter_stored_string";
			default:
				return BaseResult.varStoredBaseResult(entityVar);
		}
	}

	public static String varIndexedSiteHtm(String entityVar) {
		switch(entityVar) {
			case "uri":
				return "uri_docvalues_string";
			case "pageId":
				return "pageId_docvalues_string";
			case "sequenceNum":
				return "sequenceNum_docvalues_long";
			case "htmGroup":
				return "htmGroup_docvalues_string";
			case "labels":
				return "labels_docvalues_strings";
			case "eBefore":
				return "eBefore_docvalues_string";
			case "eAfter":
				return "eAfter_docvalues_string";
			case "a":
				return "a_docvalues_string";
			case "text":
				return "text_text_enUS";
			case "comment":
				return "comment_docvalues_strings";
			case "tabs":
				return "tabs_docvalues_string";
			case "newLine":
				return "newLine_docvalues_boolean";
			default:
				return BaseResult.varIndexedBaseResult(entityVar);
		}
	}

	public static String searchVarSiteHtm(String searchVar) {
		switch(searchVar) {
			case "uri_docvalues_string":
				return "uri";
			case "pageId_docvalues_string":
				return "pageId";
			case "sequenceNum_docvalues_long":
				return "sequenceNum";
			case "htmGroup_docvalues_string":
				return "htmGroup";
			case "labels_docvalues_strings":
				return "labels";
			case "eBefore_docvalues_string":
				return "eBefore";
			case "eAfter_docvalues_string":
				return "eAfter";
			case "a_docvalues_string":
				return "a";
			case "text_text_enUS":
				return "text";
			case "comment_docvalues_strings":
				return "comment";
			case "tabs_docvalues_string":
				return "tabs";
			case "newLine_docvalues_boolean":
				return "newLine";
			default:
				return BaseResult.searchVarBaseResult(searchVar);
		}
	}

	public static String varSearchSiteHtm(String entityVar) {
		switch(entityVar) {
			case "text":
				return "text_text_enUS";
			default:
				return BaseResult.varSearchBaseResult(entityVar);
		}
	}

	public static String varSuggestedSiteHtm(String entityVar) {
		switch(entityVar) {
			default:
				return BaseResult.varSuggestedBaseResult(entityVar);
		}
	}

	/////////////
	// store //
	/////////////

	@Override public void storeForClass(SolrResponse.Doc doc) {
		storeSiteHtm(doc);
	}
	public void storeSiteHtm(SolrResponse.Doc doc) {
		SiteHtm oSiteHtm = (SiteHtm)this;

		oSiteHtm.setUri(Optional.ofNullable(doc.get("uri_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setPageId(Optional.ofNullable(doc.get("pageId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setSequenceNum(Optional.ofNullable(doc.get("sequenceNum_docvalues_long")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setHtmGroup(Optional.ofNullable(doc.get("htmGroup_docvalues_string")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("labels_docvalues_strings")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oSiteHtm.addLabels(v.toString());
		});
		oSiteHtm.setEBefore(Optional.ofNullable(doc.get("eBefore_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setEAfter(Optional.ofNullable(doc.get("eAfter_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setA(Optional.ofNullable(doc.get("a_docvalues_string")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("text_text_enUS")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oSiteHtm.addText(v.toString());
		});
		Optional.ofNullable((List<?>)doc.get("comment_docvalues_strings")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oSiteHtm.addComment(v.toString());
		});
		oSiteHtm.setTabs(Optional.ofNullable(doc.get("tabs_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setNewLine(Optional.ofNullable(doc.get("newLine_docvalues_boolean")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setHtmBefore(Optional.ofNullable(doc.get("htmBefore_stored_string")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setHtmAfter(Optional.ofNullable(doc.get("htmAfter_stored_string")).map(v -> v.toString()).orElse(null));

		super.storeBaseResult(doc);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestSiteHtm() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof SiteHtm) {
			SiteHtm original = (SiteHtm)o;
			if(!Objects.equals(uri, original.getUri()))
				apiRequest.addVars("uri");
			if(!Objects.equals(pageId, original.getPageId()))
				apiRequest.addVars("pageId");
			if(!Objects.equals(sequenceNum, original.getSequenceNum()))
				apiRequest.addVars("sequenceNum");
			if(!Objects.equals(htmGroup, original.getHtmGroup()))
				apiRequest.addVars("htmGroup");
			if(!Objects.equals(labels, original.getLabels()))
				apiRequest.addVars("labels");
			if(!Objects.equals(eBefore, original.getEBefore()))
				apiRequest.addVars("eBefore");
			if(!Objects.equals(eAfter, original.getEAfter()))
				apiRequest.addVars("eAfter");
			if(!Objects.equals(a, original.getA()))
				apiRequest.addVars("a");
			if(!Objects.equals(text, original.getText()))
				apiRequest.addVars("text");
			if(!Objects.equals(comment, original.getComment()))
				apiRequest.addVars("comment");
			if(!Objects.equals(tabs, original.getTabs()))
				apiRequest.addVars("tabs");
			if(!Objects.equals(newLine, original.getNewLine()))
				apiRequest.addVars("newLine");
			if(!Objects.equals(htmBefore, original.getHtmBefore()))
				apiRequest.addVars("htmBefore");
			if(!Objects.equals(htmAfter, original.getHtmAfter()))
				apiRequest.addVars("htmAfter");
			super.apiRequestBaseResult();
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(Optional.ofNullable(uri).map(v -> "uri: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(pageId).map(v -> "pageId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(sequenceNum).map(v -> "sequenceNum: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(htmGroup).map(v -> "htmGroup: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(labels).map(v -> "labels: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(eBefore).map(v -> "eBefore: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(eAfter).map(v -> "eAfter: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(a).map(v -> "a: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(text).map(v -> "text: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(comment).map(v -> "comment: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(tabs).map(v -> "tabs: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(newLine).map(v -> "newLine: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(htmBefore).map(v -> "htmBefore: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(htmAfter).map(v -> "htmAfter: \"" + v + "\"\n" ).orElse(""));
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "SiteHtm";
	public static final String VAR_uri = "uri";
	public static final String VAR_pageId = "pageId";
	public static final String VAR_sequenceNum = "sequenceNum";
	public static final String VAR_htmGroup = "htmGroup";
	public static final String VAR_labels = "labels";
	public static final String VAR_eBefore = "eBefore";
	public static final String VAR_eAfter = "eAfter";
	public static final String VAR_a = "a";
	public static final String VAR_text = "text";
	public static final String VAR_comment = "comment";
	public static final String VAR_tabs = "tabs";
	public static final String VAR_newLine = "newLine";
	public static final String VAR_htmBefore = "htmBefore";
	public static final String VAR_htmAfter = "htmAfter";

	public static List<String> varsQForClass() {
		return SiteHtm.varsQSiteHtm(new ArrayList<String>());
	}
	public static List<String> varsQSiteHtm(List<String> vars) {
		vars.add(VAR_text);
		BaseResult.varsQBaseResult(vars);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return SiteHtm.varsFqSiteHtm(new ArrayList<String>());
	}
	public static List<String> varsFqSiteHtm(List<String> vars) {
		vars.add(VAR_uri);
		vars.add(VAR_pageId);
		vars.add(VAR_sequenceNum);
		BaseResult.varsFqBaseResult(vars);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return SiteHtm.varsRangeSiteHtm(new ArrayList<String>());
	}
	public static List<String> varsRangeSiteHtm(List<String> vars) {
		vars.add(VAR_sequenceNum);
		BaseResult.varsRangeBaseResult(vars);
		return vars;
	}

	public static final String DISPLAY_NAME_uri = "Page URI";
	public static final String DISPLAY_NAME_pageId = "Page ID";
	public static final String DISPLAY_NAME_sequenceNum = "Sequence Number";
	public static final String DISPLAY_NAME_htmGroup = "HTML Group";
	public static final String DISPLAY_NAME_labels = "Labels";
	public static final String DISPLAY_NAME_eBefore = "HTML Element";
	public static final String DISPLAY_NAME_eAfter = "HTML Element";
	public static final String DISPLAY_NAME_a = "HTML Element";
	public static final String DISPLAY_NAME_text = "Text";
	public static final String DISPLAY_NAME_comment = "Text";
	public static final String DISPLAY_NAME_tabs = "Tabs";
	public static final String DISPLAY_NAME_newLine = "Tabs";
	public static final String DISPLAY_NAME_htmBefore = "HTML before";
	public static final String DISPLAY_NAME_htmAfter = "HTML after";

	public static String displayNameForClass(String var) {
		return SiteHtm.displayNameSiteHtm(var);
	}
	public static String displayNameSiteHtm(String var) {
		switch(var) {
		case VAR_uri:
			return DISPLAY_NAME_uri;
		case VAR_pageId:
			return DISPLAY_NAME_pageId;
		case VAR_sequenceNum:
			return DISPLAY_NAME_sequenceNum;
		case VAR_htmGroup:
			return DISPLAY_NAME_htmGroup;
		case VAR_labels:
			return DISPLAY_NAME_labels;
		case VAR_eBefore:
			return DISPLAY_NAME_eBefore;
		case VAR_eAfter:
			return DISPLAY_NAME_eAfter;
		case VAR_a:
			return DISPLAY_NAME_a;
		case VAR_text:
			return DISPLAY_NAME_text;
		case VAR_comment:
			return DISPLAY_NAME_comment;
		case VAR_tabs:
			return DISPLAY_NAME_tabs;
		case VAR_newLine:
			return DISPLAY_NAME_newLine;
		case VAR_htmBefore:
			return DISPLAY_NAME_htmBefore;
		case VAR_htmAfter:
			return DISPLAY_NAME_htmAfter;
		default:
			return BaseResult.displayNameBaseResult(var);
		}
	}

	public static String descriptionSiteHtm(String var) {
		switch(var) {
		case VAR_uri:
			return "The ID for this page. ";
		case VAR_pageId:
			return "The ID for this page. ";
		case VAR_sequenceNum:
			return "The sequence number for this page. ";
		case VAR_htmGroup:
			return "The HTML group. ";
		case VAR_labels:
			return "A list of labels";
		case VAR_eBefore:
			return "The HTML element. ";
		case VAR_eAfter:
			return "The HTML element. ";
		case VAR_a:
			return "The HTML element. ";
		case VAR_text:
			return "The text. ";
		case VAR_comment:
			return "The text. ";
		case VAR_tabs:
			return "The tabs. ";
		case VAR_newLine:
			return "The tabs. ";
		case VAR_htmBefore:
			return "The HTML that comes before the text. ";
		case VAR_htmAfter:
			return "The HTML that comes after the text. ";
			default:
				return BaseResult.descriptionBaseResult(var);
		}
	}

	public static String classSimpleNameSiteHtm(String var) {
		switch(var) {
		case VAR_uri:
			return "String";
		case VAR_pageId:
			return "String";
		case VAR_sequenceNum:
			return "Long";
		case VAR_htmGroup:
			return "String";
		case VAR_labels:
			return "List";
		case VAR_eBefore:
			return "String";
		case VAR_eAfter:
			return "String";
		case VAR_a:
			return "JsonObject";
		case VAR_text:
			return "List";
		case VAR_comment:
			return "List";
		case VAR_tabs:
			return "String";
		case VAR_newLine:
			return "Boolean";
		case VAR_htmBefore:
			return "String";
		case VAR_htmAfter:
			return "String";
			default:
				return BaseResult.classSimpleNameBaseResult(var);
		}
	}

	public static Integer htmlColumnSiteHtm(String var) {
		switch(var) {
		case VAR_uri:
			return 3;
		case VAR_pageId:
			return 3;
		case VAR_sequenceNum:
			return 4;
			default:
				return BaseResult.htmlColumnBaseResult(var);
		}
	}

	public static Integer htmlRowSiteHtm(String var) {
		switch(var) {
		case VAR_uri:
			return 3;
		case VAR_pageId:
			return 3;
		case VAR_sequenceNum:
			return 3;
			default:
				return BaseResult.htmlRowBaseResult(var);
		}
	}

	public static Integer htmlCellSiteHtm(String var) {
		switch(var) {
		case VAR_uri:
			return 1;
		case VAR_pageId:
			return 1;
		case VAR_sequenceNum:
			return 2;
			default:
				return BaseResult.htmlCellBaseResult(var);
		}
	}

	public static Integer lengthMinSiteHtm(String var) {
		switch(var) {
			default:
				return BaseResult.lengthMinBaseResult(var);
		}
	}

	public static Integer lengthMaxSiteHtm(String var) {
		switch(var) {
			default:
				return BaseResult.lengthMaxBaseResult(var);
		}
	}

	public static Integer maxSiteHtm(String var) {
		switch(var) {
			default:
				return BaseResult.maxBaseResult(var);
		}
	}

	public static Integer minSiteHtm(String var) {
		switch(var) {
			default:
				return BaseResult.minBaseResult(var);
		}
	}
}
