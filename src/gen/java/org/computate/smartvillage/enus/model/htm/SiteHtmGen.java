/*
 * Copyright (c) 2018-2022 Computate Limited Liability Company in Utah, USA,
 * and the Smarta Byar Smart Village FIWARE IHub. 
 *
 * This program and the accompanying materials are made available under the
 * terms of the GNU GENERAL PUBLIC LICENSE Version 3 which is available at
 * 
 * https://www.gnu.org/licenses/gpl-3.0.en.html
 * 
 * You may not propagate or modify a covered work except as expressly provided 
 * under this License. Any attempt otherwise to propagate or modify it is void, 
 * and will automatically terminate your rights under this License (including 
 * any patent licenses granted under the third paragraph of section 11).
 */
package org.computate.smartvillage.enus.model.htm;

import org.computate.smartvillage.enus.request.SiteRequestEnUS;
import org.computate.smartvillage.enus.result.base.BaseResult;
import org.computate.smartvillage.enus.model.base.BaseModel;
import org.computate.vertx.api.ApiRequest;
import org.computate.smartvillage.enus.config.ConfigKeys;
import java.util.Optional;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
 * <ol>
<h3>Suggestions that can generate more code for you: </h3> * </ol>
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class SiteHtmGen into the class SiteHtm. 
 * </li><li>You can add a class comment "Rows: 100" if you wish the SiteHtm API to return more or less than 10 records by default. 
 * In this case, the API will return 100 records from the API instead of 10 by default. 
 * Each API has built in pagination of the search records to ensure a user can query all the data a page at a time without running the application out of memory. 
 * </li><li>You can add a class comment "Model: true" if you wish to persist these SiteHtm objects in a relational PostgreSQL database transactionally in the RESTful API. 
 * The code to persist and query the SiteHtmGen data in the database will then be automatically generated. 
 * </li>
 * <h3>About the SiteHtm class and it's generated class SiteHtmGen&lt;BaseResult&gt;: </h3>extends SiteHtmGen
 * <p>
 * This Java class extends a generated Java class SiteHtmGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.htm.SiteHtm">Find the class SiteHtm in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends SiteHtmGen<BaseResult>
 * <p>This <code>class SiteHtm extends SiteHtmGen&lt;BaseResult&gt;</code>, which means it extends a newly generated SiteHtmGen. 
 * The generated <code>class SiteHtmGen extends BaseResult</code> which means that SiteHtm extends SiteHtmGen which extends BaseResult. 
 * This generated inheritance is a powerful feature that allows a lot of boiler plate code to be created for you automatically while still preserving inheritance through the power of Java Generic classes. 
 * </p>
 * <h2>Api: true</h2>
 * <p>This class contains a comment <b>"Api: true"</b>, which means this class will have Java Vert.x API backend code generated for these objects. 
 * </p>
 * <h2>ApiMethode: Search</h2>
 * <p>This class contains a comment <b>"ApiMethod: Search"</b>, which creates an API "Search". 
 * </p>
 * <h2>ApiMethode: GET</h2>
 * <p>This class contains a comment <b>"ApiMethod: GET"</b>, which creates an API "GET". 
 * </p>
 * <h2>ApiMethode: POST</h2>
 * <p>This class contains a comment <b>"ApiMethod: POST"</b>, which creates an API "POST". 
 * </p>
 * <h2>ApiMethode: PATCH</h2>
 * <p>This class contains a comment <b>"ApiMethod: PATCH"</b>, which creates an API "PATCH". 
 * </p>
 * <h2>ApiMethode: PUTImport</h2>
 * <p>This class contains a comment <b>"ApiMethod: PUTImport"</b>, which creates an API "PUTImport". 
 * </p>
 * <h2>ApiMethode: SearchPage</h2>
 * <p>This class contains a comment <b>"ApiMethod: SearchPage"</b>, which creates an API "SearchPage". 
 * </p>
 * <h2>ApiTag.enUS: true</h2>
 * <p>This class contains a comment <b>"ApiTag: HTM"</b>, which groups all of the OpenAPIs for SiteHtm objects under the tag "HTM". 
 * </p>
 * <h2>ApiUri.enUS: /api/htm</h2>
 * <p>This class contains a comment <b>"ApiUri: /api/htm"</b>, which defines the base API URI for SiteHtm objects as "/api/htm" in the OpenAPI spec. 
 * </p>
 * <h2>Color: 2017-shaded-spruce</h2>
 * <p>This class contains a comment <b>"Color: 2017-shaded-spruce"</b>, which styles the SiteHtm page "2017-shaded-spruce". 
 * This will reference a CSS class defined by the stylesheets in the project that starts with "w3-". 
 * A css class of "w3-2017-shaded-spruce" is expected to exist in the project stylesheets, and is inspired by W3 CSS colors. 
 * See: <a href="https://www.w3schools.com/w3css/w3css_colors.asp">https://www.w3schools.com/w3css/w3css_colors.asp</a>. 
 * </p>
 * <h2>IconGroup: duotone</h2>
 * <p>This class contains a comment <b>"IconGroup: duotone"</b>, which adds icons on the SiteHtm page with a group of "duotone". 
 * This will reference a Font Awesome icon group that starts with "fa-" followed by the icon group "duotone", together is "fa-duotone". 
 * A Font Awesome icon group of "duotone" is expected to exist. 
 * The Font Awesome groups currently supported include: solid, regular, light, thin, duotone, sharp, and kit. 
 * See: <a href="https://fontawesome.com/docs/web/dig-deeper/styles">https://fontawesome.com/docs/web/dig-deeper/styles</a>. 
 * </p>
 * <h2>IconName: code</h2>
 * <p>This class contains a comment <b>"IconName: code"</b>, which adds icons on the SiteHtm page with a name of "code". 
 * This will reference a Font Awesome icon that starts with the icon group "fa-duotone fa-" followed by the icon name, which is "fa-duotone fa-code". 
 * A Font Awesome icon of "fa-duotone fa-code" is expected to exist. 
 * See: <a href="https://fontawesome.com/icons">https://fontawesome.com/icons</a>. 
 * </p>
 * <h2>Indexed: true</h2>
 * <p>This class contains a comment <b>"Indexed: true"</b>, which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * <h2>{@inheritDoc}</h2>
 * <p>By adding a class comment "{@inheritDoc}", the SiteHtm class will inherit the helpful inherited class comments from the super class SiteHtmGen. 
 * </p>
 * <h2>Rows: null</h2>
 * <h2>Order: 101</h2>
 * <p>This class contains a comment <b>"Order: 101"</b>, which means this class will be sorted by the given number 101 ascending when code that relates to multiple classes at the same time is generated. 
 * </p>
 * <h2>SqlOrder: 101</h2>
 * <p>This class contains a comment <b>"SqlOrder: 101"</b>, which means this class will be sorted by the given number 101 ascending when SQL code to create and drop the tables is generated. 
 * </p>
 * <h2>Model: true</h2>
 * <h2>Page: true</h2>
 * <p>This class contains a comment <b>"Page: true"</b>, which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.smartvillage.enus.model.htm.SiteHtmPage. 
 * </p>
 * <h2>SuperPage.enUS: BaseResultPage</h2>
 * <p>This class contains a comment <b>"SuperPage.enUS: BaseResultPage"</b>, which identifies the Java super class of the page code by it's class simple name "BaseResultPage". 
 * This means that the newly created class org.computate.smartvillage.enus.model.htm.SiteHtmPage extends org.computate.smartvillage.enus.result.base.BaseResultPage. 
 * </p>
 * <h2>Promise: true</h2>
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the SiteHtm Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * <h2>Role.enUS: SiteAdmin</h2>
 * <p>
 * This class contains a comment <b>"Role.enUS: SiteAdmin"</b>, which identifies the default role name "SiteAdmin" of the OAuth2/OpenID Connect user role required to access this SiteHtm API. 
 * It's possible to reconfigure the roles required to access the SiteHtm API by configuring an environment variable like this: 
 * </p>
 * <pre>AUTH_ROLE_REQUIRED_SiteHtm: ["SiteAdmin"]</pre>
 * <h2>AName.enUS: an HTML</h2>
 * <p>This class contains a comment <b>"AName.enUS: an HTML"</b>, which identifies the language context to describe a SiteHtm as "an HTML". 
 * </p>
 * <p>
 * Delete the class SiteHtm in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.htm.SiteHtm&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillage.enus.model.htm in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillage.enus.model.htm&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartvillage-platform in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartvillage\-platform&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * Generated: true
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

	public static final String SiteHtm_Color = "2017-shaded-spruce";
	public static final String SiteHtm_IconGroup = "duotone";
	public static final String SiteHtm_IconName = "code";

	/////////
	// url //
	/////////


	/**	 The entity url
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String url;

	/**	<br> The entity url
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:url">Find the entity url in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _url(Wrap<String> w);

	public String getUrl() {
		return url;
	}
	public void setUrl(String o) {
		this.url = SiteHtm.staticSetUrl(siteRequest_, o);
	}
	public static String staticSetUrl(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtm urlInit() {
		Wrap<String> urlWrap = new Wrap<String>().var("url");
		if(url == null) {
			_url(urlWrap);
			Optional.ofNullable(urlWrap.getO()).ifPresent(o -> {
				setUrl(o);
			});
		}
		return (SiteHtm)this;
	}

	public static String staticSearchUrl(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrUrl(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUrl(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchUrl(siteRequest_, SiteHtm.staticSetUrl(siteRequest_, o)).toString();
	}

	public String sqlUrl() {
		return url;
	}

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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:uri">Find the entity uri in Solr</a>
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
			Optional.ofNullable(uriWrap.getO()).ifPresent(o -> {
				setUri(o);
			});
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
		return SiteHtm.staticSearchUri(siteRequest_, SiteHtm.staticSetUri(siteRequest_, o)).toString();
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:pageId">Find the entity pageId in Solr</a>
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
			Optional.ofNullable(pageIdWrap.getO()).ifPresent(o -> {
				setPageId(o);
			});
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
		return SiteHtm.staticSearchPageId(siteRequest_, SiteHtm.staticSetPageId(siteRequest_, o)).toString();
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:sequenceNum">Find the entity sequenceNum in Solr</a>
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
			Optional.ofNullable(sequenceNumWrap.getO()).ifPresent(o -> {
				setSequenceNum(o);
			});
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
		return SiteHtm.staticSearchSequenceNum(siteRequest_, SiteHtm.staticSetSequenceNum(siteRequest_, o)).toString();
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:htmGroup">Find the entity htmGroup in Solr</a>
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
			Optional.ofNullable(htmGroupWrap.getO()).ifPresent(o -> {
				setHtmGroup(o);
			});
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
		return SiteHtm.staticSearchHtmGroup(siteRequest_, SiteHtm.staticSetHtmGroup(siteRequest_, o)).toString();
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:labels">Find the entity labels in Solr</a>
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
	public void setLabels(String o) {
		String l = SiteHtm.staticSetLabels(siteRequest_, o);
		if(l != null)
			addLabels(l);
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
		if(objects == null)
			return;
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
		return SiteHtm.staticSearchLabels(siteRequest_, SiteHtm.staticSetLabels(siteRequest_, o)).toString();
	}

	public String[] sqlLabels() {
		return labels.stream().map(v -> (String)v).toArray(String[]::new);
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:eBefore">Find the entity eBefore in Solr</a>
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
			Optional.ofNullable(eBeforeWrap.getO()).ifPresent(o -> {
				setEBefore(o);
			});
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
		return SiteHtm.staticSearchEBefore(siteRequest_, SiteHtm.staticSetEBefore(siteRequest_, o)).toString();
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:eAfter">Find the entity eAfter in Solr</a>
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
			Optional.ofNullable(eAfterWrap.getO()).ifPresent(o -> {
				setEAfter(o);
			});
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
		return SiteHtm.staticSearchEAfter(siteRequest_, SiteHtm.staticSetEAfter(siteRequest_, o)).toString();
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:a">Find the entity a in Solr</a>
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
			Optional.ofNullable(aWrap.getO()).ifPresent(o -> {
				setA(o);
			});
		}
		return (SiteHtm)this;
	}

	public static String staticSearchA(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o.toString();
	}

	public static String staticSearchStrA(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqA(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchA(siteRequest_, SiteHtm.staticSetA(siteRequest_, o)).toString();
	}

	public JsonObject sqlA() {
		return a;
	}

	//////////
	// text //
	//////////

	public static final String text_markdown1_enUS = "markdown";
	public static final String text_markdown_enUS = text_markdown1_enUS;

	/**	 The entity text
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> text = new ArrayList<String>();

	/**	<br> The entity text
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:text">Find the entity text in Solr</a>
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
	public void setText(String o) {
		String l = SiteHtm.staticSetText(siteRequest_, o);
		if(l != null)
			addText(l);
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
		if(objects == null)
			return;
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
		return SiteHtm.staticSearchText(siteRequest_, SiteHtm.staticSetText(siteRequest_, o)).toString();
	}

	public String[] sqlText() {
		return text.stream().map(v -> (String)v).toArray(String[]::new);
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:comment">Find the entity comment in Solr</a>
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
	public void setComment(String o) {
		String l = SiteHtm.staticSetComment(siteRequest_, o);
		if(l != null)
			addComment(l);
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
		if(objects == null)
			return;
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
		return SiteHtm.staticSearchComment(siteRequest_, SiteHtm.staticSetComment(siteRequest_, o)).toString();
	}

	public String[] sqlComment() {
		return comment.stream().map(v -> (String)v).toArray(String[]::new);
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:tabs">Find the entity tabs in Solr</a>
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
			Optional.ofNullable(tabsWrap.getO()).ifPresent(o -> {
				setTabs(o);
			});
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
		return SiteHtm.staticSearchTabs(siteRequest_, SiteHtm.staticSetTabs(siteRequest_, o)).toString();
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:newLine">Find the entity newLine in Solr</a>
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
			Optional.ofNullable(newLineWrap.getO()).ifPresent(o -> {
				setNewLine(o);
			});
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
		return SiteHtm.staticSearchNewLine(siteRequest_, SiteHtm.staticSetNewLine(siteRequest_, o)).toString();
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:htmBefore">Find the entity htmBefore in Solr</a>
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
			Optional.ofNullable(htmBeforeWrap.getO()).ifPresent(o -> {
				setHtmBefore(o);
			});
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
		return SiteHtm.staticSearchHtmBefore(siteRequest_, SiteHtm.staticSetHtmBefore(siteRequest_, o)).toString();
	}

	public String sqlHtmBefore() {
		return htmBefore;
	}

	///////////////
	// htmMiddle //
	///////////////


	/**	 The entity htmMiddle
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> htmMiddle = new ArrayList<String>();

	/**	<br> The entity htmMiddle
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:htmMiddle">Find the entity htmMiddle in Solr</a>
	 * <br>
	 * @param w is the entity already constructed. 
	 **/
	protected abstract void _htmMiddle(List<String> w);

	public List<String> getHtmMiddle() {
		return htmMiddle;
	}

	public void setHtmMiddle(List<String> htmMiddle) {
		this.htmMiddle = htmMiddle;
	}
	public void setHtmMiddle(String o) {
		String l = SiteHtm.staticSetHtmMiddle(siteRequest_, o);
		if(l != null)
			addHtmMiddle(l);
	}
	public static String staticSetHtmMiddle(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public SiteHtm addHtmMiddle(String...objects) {
		for(String o : objects) {
			addHtmMiddle(o);
		}
		return (SiteHtm)this;
	}
	public SiteHtm addHtmMiddle(String o) {
		if(o != null)
			this.htmMiddle.add(o);
		return (SiteHtm)this;
	}
	@JsonIgnore
	public void setHtmMiddle(JsonArray objects) {
		htmMiddle.clear();
		if(objects == null)
			return;
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addHtmMiddle(o);
		}
	}
	protected SiteHtm htmMiddleInit() {
		_htmMiddle(htmMiddle);
		return (SiteHtm)this;
	}

	public static String staticSearchHtmMiddle(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrHtmMiddle(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqHtmMiddle(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchHtmMiddle(siteRequest_, SiteHtm.staticSetHtmMiddle(siteRequest_, o)).toString();
	}

	public String[] sqlHtmMiddle() {
		return htmMiddle.stream().map(v -> (String)v).toArray(String[]::new);
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillage.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:htmAfter">Find the entity htmAfter in Solr</a>
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
			Optional.ofNullable(htmAfterWrap.getO()).ifPresent(o -> {
				setHtmAfter(o);
			});
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
		return SiteHtm.staticSearchHtmAfter(siteRequest_, SiteHtm.staticSetHtmAfter(siteRequest_, o)).toString();
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
				urlInit();
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
				htmMiddleInit();
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
			case "url":
				return oSiteHtm.url;
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
			case "htmMiddle":
				return oSiteHtm.htmMiddle;
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
		case "url":
			return SiteHtm.staticSetUrl(siteRequest_, o);
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
		case "htmMiddle":
			return SiteHtm.staticSetHtmMiddle(siteRequest_, o);
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
		case "url":
			return SiteHtm.staticSearchUrl(siteRequest_, (String)o);
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
		case "htmMiddle":
			return SiteHtm.staticSearchHtmMiddle(siteRequest_, (String)o);
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
		case "url":
			return SiteHtm.staticSearchStrUrl(siteRequest_, (String)o);
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
			return SiteHtm.staticSearchStrA(siteRequest_, (String)o);
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
		case "htmMiddle":
			return SiteHtm.staticSearchStrHtmMiddle(siteRequest_, (String)o);
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
		case "url":
			return SiteHtm.staticSearchFqUrl(siteRequest_, o);
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
		case "htmMiddle":
			return SiteHtm.staticSearchFqHtmMiddle(siteRequest_, o);
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
		String varLower = var.toLowerCase();
			if("url".equals(varLower)) {
				if(val instanceof String) {
					setUrl((String)val);
				}
				saves.add("url");
				return val;
			} else if("uri".equals(varLower)) {
				if(val instanceof String) {
					setUri((String)val);
				}
				saves.add("uri");
				return val;
			} else if("pageid".equals(varLower)) {
				if(val instanceof String) {
					setPageId((String)val);
				}
				saves.add("pageId");
				return val;
			} else if("sequencenum".equals(varLower)) {
				if(val instanceof Long) {
					setSequenceNum((Long)val);
				} else {
					setSequenceNum(val == null ? null : val.toString());
				}
				saves.add("sequenceNum");
				return val;
			} else if("htmgroup".equals(varLower)) {
				if(val instanceof String) {
					setHtmGroup((String)val);
				}
				saves.add("htmGroup");
				return val;
			} else if("labels".equals(varLower)) {
				if(val instanceof List<?>) {
					((List<String>)val).stream().forEach(v -> addLabels(v));
				} else if(val instanceof JsonArray) {
					((JsonArray)val).stream().forEach(v -> addLabels(staticSetLabels(siteRequest_, v.toString())));
				} else if(val instanceof String[]) {
					Arrays.asList((String[])val).stream().forEach(v -> addLabels((String)v));
				}
				if(!saves.contains("labels")) {
					saves.add("labels");
				}
				return val;
			} else if("ebefore".equals(varLower)) {
				if(val instanceof String) {
					setEBefore((String)val);
				}
				saves.add("eBefore");
				return val;
			} else if("eafter".equals(varLower)) {
				if(val instanceof String) {
					setEAfter((String)val);
				}
				saves.add("eAfter");
				return val;
			} else if("a".equals(varLower)) {
				if(val instanceof String) {
					setA((String)val);
				} else if(val instanceof JsonObject) {
					setA((JsonObject)val);
				}
				saves.add("a");
				return val;
			} else if("text".equals(varLower)) {
				if(val instanceof List<?>) {
					((List<String>)val).stream().forEach(v -> addText(v));
				} else if(val instanceof JsonArray) {
					((JsonArray)val).stream().forEach(v -> addText(staticSetText(siteRequest_, v.toString())));
				} else if(val instanceof String[]) {
					Arrays.asList((String[])val).stream().forEach(v -> addText((String)v));
				}
				if(!saves.contains("text")) {
					saves.add("text");
				}
				return val;
			} else if("comment".equals(varLower)) {
				if(val instanceof List<?>) {
					((List<String>)val).stream().forEach(v -> addComment(v));
				} else if(val instanceof JsonArray) {
					((JsonArray)val).stream().forEach(v -> addComment(staticSetComment(siteRequest_, v.toString())));
				} else if(val instanceof String[]) {
					Arrays.asList((String[])val).stream().forEach(v -> addComment((String)v));
				}
				if(!saves.contains("comment")) {
					saves.add("comment");
				}
				return val;
			} else if("tabs".equals(varLower)) {
				if(val instanceof String) {
					setTabs((String)val);
				}
				saves.add("tabs");
				return val;
			} else if("newline".equals(varLower)) {
				if(val instanceof Boolean) {
					setNewLine((Boolean)val);
				} else {
					setNewLine(val == null ? null : val.toString());
				}
				saves.add("newLine");
				return val;
			} else if("htmbefore".equals(varLower)) {
				if(val instanceof String) {
					setHtmBefore((String)val);
				}
				saves.add("htmBefore");
				return val;
			} else if("htmmiddle".equals(varLower)) {
				if(val instanceof List<?>) {
					((List<String>)val).stream().forEach(v -> addHtmMiddle(v));
				} else if(val instanceof JsonArray) {
					((JsonArray)val).stream().forEach(v -> addHtmMiddle(staticSetHtmMiddle(siteRequest_, v.toString())));
				} else if(val instanceof String[]) {
					Arrays.asList((String[])val).stream().forEach(v -> addHtmMiddle((String)v));
				}
				if(!saves.contains("htmMiddle")) {
					saves.add("htmMiddle");
				}
				return val;
			} else if("htmafter".equals(varLower)) {
				if(val instanceof String) {
					setHtmAfter((String)val);
				}
				saves.add("htmAfter");
				return val;
		} else {
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
		saves = Optional.ofNullable((ArrayList<String>)doc.get("saves_docvalues_strings")).orElse(new ArrayList<String>());
		if(saves != null) {

			if(saves.contains("url")) {
				String url = (String)doc.get("url_docvalues_string");
				if(url != null)
					oSiteHtm.setUrl(url);
			}

			if(saves.contains("uri")) {
				String uri = (String)doc.get("uri_docvalues_string");
				if(uri != null)
					oSiteHtm.setUri(uri);
			}

			if(saves.contains("pageId")) {
				String pageId = (String)doc.get("pageId_docvalues_string");
				if(pageId != null)
					oSiteHtm.setPageId(pageId);
			}

			if(saves.contains("sequenceNum")) {
				Long sequenceNum = (Long)doc.get("sequenceNum_docvalues_long");
				if(sequenceNum != null)
					oSiteHtm.setSequenceNum(sequenceNum);
			}

			if(saves.contains("htmGroup")) {
				String htmGroup = (String)doc.get("htmGroup_docvalues_string");
				if(htmGroup != null)
					oSiteHtm.setHtmGroup(htmGroup);
			}

			if(saves.contains("labels")) {
				List<String> labels = (List<String>)doc.get("labels_docvalues_strings");
				if(labels != null)
					oSiteHtm.labels.addAll(labels);
			}

			if(saves.contains("eBefore")) {
				String eBefore = (String)doc.get("eBefore_docvalues_string");
				if(eBefore != null)
					oSiteHtm.setEBefore(eBefore);
			}

			if(saves.contains("eAfter")) {
				String eAfter = (String)doc.get("eAfter_docvalues_string");
				if(eAfter != null)
					oSiteHtm.setEAfter(eAfter);
			}

			if(saves.contains("a")) {
				String a = (String)doc.get("a_docvalues_string");
				if(a != null)
					oSiteHtm.setA(a);
			}

			if(saves.contains("comment")) {
				List<String> comment = (List<String>)doc.get("comment_docvalues_strings");
				if(comment != null)
					oSiteHtm.comment.addAll(comment);
			}

			if(saves.contains("tabs")) {
				String tabs = (String)doc.get("tabs_docvalues_string");
				if(tabs != null)
					oSiteHtm.setTabs(tabs);
			}

			if(saves.contains("newLine")) {
				Boolean newLine = (Boolean)doc.get("newLine_docvalues_boolean");
				if(newLine != null)
					oSiteHtm.setNewLine(newLine);
			}

			if(saves.contains("htmBefore")) {
				String htmBefore = (String)doc.get("htmBefore_stored_string");
				if(htmBefore != null)
					oSiteHtm.setHtmBefore(htmBefore);
			}

			if(saves.contains("htmAfter")) {
				String htmAfter = (String)doc.get("htmAfter_stored_string");
				if(htmAfter != null)
					oSiteHtm.setHtmAfter(htmAfter);
			}
		}

		super.populateBaseResult(doc);
	}

	public void indexSiteHtm(JsonObject doc) {
		if(url != null) {
			doc.put("url_docvalues_string", url);
		}
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
		if(htmMiddle != null) {
			JsonArray l = new JsonArray();
			doc.put("htmMiddle_text_enUS", l);
			for(String o : htmMiddle) {
				l.add(o);
			}
		}
		if(htmAfter != null) {
			doc.put("htmAfter_stored_string", htmAfter);
		}
		super.indexBaseResult(doc);

	}

	public static String varStoredSiteHtm(String entityVar) {
		switch(entityVar) {
			case "url":
				return "url_docvalues_string";
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
			case "url":
				return "url_docvalues_string";
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
			case "htmMiddle":
				return "htmMiddle_text_enUS";
			default:
				return BaseResult.varIndexedBaseResult(entityVar);
		}
	}

	public static String searchVarSiteHtm(String searchVar) {
		switch(searchVar) {
			case "url_docvalues_string":
				return "url";
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
			case "htmMiddle_text_enUS":
				return "htmMiddle";
			default:
				return BaseResult.searchVarBaseResult(searchVar);
		}
	}

	public static String varSearchSiteHtm(String entityVar) {
		switch(entityVar) {
			case "text":
				return "text_text_enUS";
			case "htmMiddle":
				return "htmMiddle_text_enUS";
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
		SiteRequestEnUS siteRequest = oSiteHtm.getSiteRequest_();

		oSiteHtm.setUrl(Optional.ofNullable(doc.get("url_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setUri(Optional.ofNullable(doc.get("uri_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setPageId(Optional.ofNullable(doc.get("pageId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setSequenceNum(Optional.ofNullable(doc.get("sequenceNum_docvalues_long")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setHtmGroup(Optional.ofNullable(doc.get("htmGroup_docvalues_string")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("labels_docvalues_strings")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oSiteHtm.addLabels(SiteHtm.staticSetLabels(siteRequest, v.toString()));
		});
		oSiteHtm.setEBefore(Optional.ofNullable(doc.get("eBefore_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setEAfter(Optional.ofNullable(doc.get("eAfter_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setA(Optional.ofNullable(doc.get("a_docvalues_string")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("text_text_enUS")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oSiteHtm.addText(SiteHtm.staticSetText(siteRequest, v.toString()));
		});
		Optional.ofNullable((List<?>)doc.get("comment_docvalues_strings")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oSiteHtm.addComment(SiteHtm.staticSetComment(siteRequest, v.toString()));
		});
		oSiteHtm.setTabs(Optional.ofNullable(doc.get("tabs_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setNewLine(Optional.ofNullable(doc.get("newLine_docvalues_boolean")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setHtmBefore(Optional.ofNullable(doc.get("htmBefore_stored_string")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("htmMiddle_text_enUS")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oSiteHtm.addHtmMiddle(SiteHtm.staticSetHtmMiddle(siteRequest, v.toString()));
		});
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
			if(!Objects.equals(url, original.getUrl()))
				apiRequest.addVars("url");
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
			if(!Objects.equals(htmMiddle, original.getHtmMiddle()))
				apiRequest.addVars("htmMiddle");
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
		sb.append(Optional.ofNullable(url).map(v -> "url: \"" + v + "\"\n" ).orElse(""));
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
		sb.append(Optional.ofNullable(htmMiddle).map(v -> "htmMiddle: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(htmAfter).map(v -> "htmAfter: \"" + v + "\"\n" ).orElse(""));
		return sb.toString();
	}

	public static final String[] SiteHtmVals = new String[] { text_markdown1_enUS };

	public static final String CLASS_SIMPLE_NAME = "SiteHtm";
	public static final String CLASS_API_ADDRESS_SiteHtm = "smartvillage-platform-enUS-SiteHtm";
	public static String getClassApiAddress() {
		return CLASS_API_ADDRESS_SiteHtm;
	}
	public static final String VAR_url = "url";
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
	public static final String VAR_htmMiddle = "htmMiddle";
	public static final String VAR_htmAfter = "htmAfter";

	public static List<String> varsQForClass() {
		return SiteHtm.varsQSiteHtm(new ArrayList<String>());
	}
	public static List<String> varsQSiteHtm(List<String> vars) {
		vars.add(VAR_text);
		vars.add(VAR_htmMiddle);
		BaseResult.varsQBaseResult(vars);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return SiteHtm.varsFqSiteHtm(new ArrayList<String>());
	}
	public static List<String> varsFqSiteHtm(List<String> vars) {
		vars.add(VAR_url);
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

	public static final String DISPLAY_NAME_url = "Page URL";
	public static final String DISPLAY_NAME_uri = "URI";
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
	public static final String DISPLAY_NAME_htmMiddle = "HTML middle";
	public static final String DISPLAY_NAME_htmAfter = "HTML after";

	public static String displayNameForClass(String var) {
		return SiteHtm.displayNameSiteHtm(var);
	}
	public static String displayNameSiteHtm(String var) {
		switch(var) {
		case VAR_url:
			return DISPLAY_NAME_url;
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
		case VAR_htmMiddle:
			return DISPLAY_NAME_htmMiddle;
		case VAR_htmAfter:
			return DISPLAY_NAME_htmAfter;
		default:
			return BaseResult.displayNameBaseResult(var);
		}
	}

	public static String descriptionSiteHtm(String var) {
		switch(var) {
		case VAR_url:
			return "The URL for this page. ";
		case VAR_uri:
			return "The relative URI for this page. ";
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
		case VAR_htmMiddle:
			return "The HTML that comes in the middle. ";
		case VAR_htmAfter:
			return "The HTML that comes after the text. ";
			default:
				return BaseResult.descriptionBaseResult(var);
		}
	}

	public static String classSimpleNameSiteHtm(String var) {
		switch(var) {
		case VAR_url:
			return "String";
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
		case VAR_htmMiddle:
			return "List";
		case VAR_htmAfter:
			return "String";
			default:
				return BaseResult.classSimpleNameBaseResult(var);
		}
	}

	public static Integer htmColumnSiteHtm(String var) {
		switch(var) {
		case VAR_url:
			return 3;
		case VAR_uri:
			return 4;
		case VAR_pageId:
			return 4;
		case VAR_sequenceNum:
			return 5;
			default:
				return BaseResult.htmColumnBaseResult(var);
		}
	}

	public static Integer htmRowSiteHtm(String var) {
		switch(var) {
		case VAR_url:
			return 3;
		case VAR_uri:
			return 3;
		case VAR_pageId:
			return 3;
		case VAR_sequenceNum:
			return 3;
			default:
				return BaseResult.htmRowBaseResult(var);
		}
	}

	public static Integer htmCellSiteHtm(String var) {
		switch(var) {
		case VAR_url:
			return 1;
		case VAR_uri:
			return 2;
		case VAR_pageId:
			return 2;
		case VAR_sequenceNum:
			return 3;
			default:
				return BaseResult.htmCellBaseResult(var);
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
