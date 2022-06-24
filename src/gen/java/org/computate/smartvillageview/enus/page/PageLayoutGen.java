package org.computate.smartvillageview.enus.page;

import org.computate.smartvillageview.enus.request.SiteRequestEnUS;
import org.computate.smartvillageview.enus.model.base.BaseModel;
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
import java.lang.Object;
import java.lang.String;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.api.service.ServiceRequest;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Void;
import io.vertx.core.json.JsonArray;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;

/**	
 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout">Find the class PageLayout in Solr. </a>
 * <br><br>Delete the class PageLayout in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>Delete  the package org.computate.smartvillageview.enus.page in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.page&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>Delete  the project smart-village-view in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smart\-village\-view&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>
 **/
public abstract class PageLayoutGen<DEV> extends Object {
	protected static final Logger LOG = LoggerFactory.getLogger(PageLayout.class);

	//////////////////
	// siteRequest_ //
	//////////////////

	/**	 The entity siteRequest_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SiteRequestEnUS siteRequest_;

	/**	<br> The entity siteRequest_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:siteRequest_">Find the entity siteRequest_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _siteRequest_(Wrap<SiteRequestEnUS> w);

	public SiteRequestEnUS getSiteRequest_() {
		return siteRequest_;
	}

	public void setSiteRequest_(SiteRequestEnUS siteRequest_) {
		this.siteRequest_ = siteRequest_;
	}
	public static SiteRequestEnUS staticSetSiteRequest_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected PageLayout siteRequest_Init() {
		Wrap<SiteRequestEnUS> siteRequest_Wrap = new Wrap<SiteRequestEnUS>().var("siteRequest_");
		if(siteRequest_ == null) {
			_siteRequest_(siteRequest_Wrap);
			setSiteRequest_(siteRequest_Wrap.o);
		}
		return (PageLayout)this;
	}

	//////////
	// lang //
	//////////

	/**	 The entity lang
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String lang;

	/**	<br> The entity lang
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:lang">Find the entity lang in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _lang(Wrap<String> w);

	public String getLang() {
		return lang;
	}
	public void setLang(String o) {
		this.lang = PageLayout.staticSetLang(siteRequest_, o);
	}
	public static String staticSetLang(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PageLayout langInit() {
		Wrap<String> langWrap = new Wrap<String>().var("lang");
		if(lang == null) {
			_lang(langWrap);
			setLang(langWrap.o);
		}
		return (PageLayout)this;
	}

	public static String staticSearchLang(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrLang(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqLang(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrLang(siteRequest_, PageLayout.staticSearchLang(siteRequest_, PageLayout.staticSetLang(siteRequest_, o)));
	}

	/////////////////
	// requestVars //
	/////////////////

	/**	 The entity requestVars
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Map<String, String> requestVars;

	/**	<br> The entity requestVars
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:requestVars">Find the entity requestVars in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _requestVars(Wrap<Map<String, String>> w);

	public Map<String, String> getRequestVars() {
		return requestVars;
	}

	public void setRequestVars(Map<String, String> requestVars) {
		this.requestVars = requestVars;
	}
	public static Map<String, String> staticSetRequestVars(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected PageLayout requestVarsInit() {
		Wrap<Map<String, String>> requestVarsWrap = new Wrap<Map<String, String>>().var("requestVars");
		if(requestVars == null) {
			_requestVars(requestVarsWrap);
			setRequestVars(requestVarsWrap.o);
		}
		return (PageLayout)this;
	}

	////////////
	// config //
	////////////

	/**	 The entity config
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected JsonObject config;

	/**	<br> The entity config
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:config">Find the entity config in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _config(Wrap<JsonObject> w);

	public JsonObject getConfig() {
		return config;
	}

	public void setConfig(JsonObject config) {
		this.config = config;
	}
	@JsonIgnore
	public void setConfig(String o) {
		this.config = PageLayout.staticSetConfig(siteRequest_, o);
	}
	public static JsonObject staticSetConfig(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected PageLayout configInit() {
		Wrap<JsonObject> configWrap = new Wrap<JsonObject>().var("config");
		if(config == null) {
			_config(configWrap);
			setConfig(configWrap.o);
		}
		return (PageLayout)this;
	}

	public static JsonObject staticSearchConfig(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrConfig(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqConfig(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrConfig(siteRequest_, PageLayout.staticSearchConfig(siteRequest_, PageLayout.staticSetConfig(siteRequest_, o)));
	}

	////////////////////
	// serviceRequest //
	////////////////////

	/**	 The entity serviceRequest
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected ServiceRequest serviceRequest;

	/**	<br> The entity serviceRequest
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:serviceRequest">Find the entity serviceRequest in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _serviceRequest(Wrap<ServiceRequest> w);

	public ServiceRequest getServiceRequest() {
		return serviceRequest;
	}

	public void setServiceRequest(ServiceRequest serviceRequest) {
		this.serviceRequest = serviceRequest;
	}
	public static ServiceRequest staticSetServiceRequest(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected PageLayout serviceRequestInit() {
		Wrap<ServiceRequest> serviceRequestWrap = new Wrap<ServiceRequest>().var("serviceRequest");
		if(serviceRequest == null) {
			_serviceRequest(serviceRequestWrap);
			setServiceRequest(serviceRequestWrap.o);
		}
		return (PageLayout)this;
	}

	///////////////////
	// staticBaseUrl //
	///////////////////

	/**	 The entity staticBaseUrl
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String staticBaseUrl;

	/**	<br> The entity staticBaseUrl
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:staticBaseUrl">Find the entity staticBaseUrl in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _staticBaseUrl(Wrap<String> w);

	public String getStaticBaseUrl() {
		return staticBaseUrl;
	}
	public void setStaticBaseUrl(String o) {
		this.staticBaseUrl = PageLayout.staticSetStaticBaseUrl(siteRequest_, o);
	}
	public static String staticSetStaticBaseUrl(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PageLayout staticBaseUrlInit() {
		Wrap<String> staticBaseUrlWrap = new Wrap<String>().var("staticBaseUrl");
		if(staticBaseUrl == null) {
			_staticBaseUrl(staticBaseUrlWrap);
			setStaticBaseUrl(staticBaseUrlWrap.o);
		}
		return (PageLayout)this;
	}

	public static String staticSearchStaticBaseUrl(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrStaticBaseUrl(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqStaticBaseUrl(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrStaticBaseUrl(siteRequest_, PageLayout.staticSearchStaticBaseUrl(siteRequest_, PageLayout.staticSetStaticBaseUrl(siteRequest_, o)));
	}

	/////////////////////
	// STATIC_BASE_URL //
	/////////////////////

	/**	 The entity STATIC_BASE_URL
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String STATIC_BASE_URL;

	/**	<br> The entity STATIC_BASE_URL
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:STATIC_BASE_URL">Find the entity STATIC_BASE_URL in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _STATIC_BASE_URL(Wrap<String> w);

	public String getSTATIC_BASE_URL() {
		return STATIC_BASE_URL;
	}
	public void setSTATIC_BASE_URL(String o) {
		this.STATIC_BASE_URL = PageLayout.staticSetSTATIC_BASE_URL(siteRequest_, o);
	}
	public static String staticSetSTATIC_BASE_URL(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PageLayout STATIC_BASE_URLInit() {
		Wrap<String> STATIC_BASE_URLWrap = new Wrap<String>().var("STATIC_BASE_URL");
		if(STATIC_BASE_URL == null) {
			_STATIC_BASE_URL(STATIC_BASE_URLWrap);
			setSTATIC_BASE_URL(STATIC_BASE_URLWrap.o);
		}
		return (PageLayout)this;
	}

	public static String staticSearchSTATIC_BASE_URL(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSTATIC_BASE_URL(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSTATIC_BASE_URL(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrSTATIC_BASE_URL(siteRequest_, PageLayout.staticSearchSTATIC_BASE_URL(siteRequest_, PageLayout.staticSetSTATIC_BASE_URL(siteRequest_, o)));
	}

	///////////////////
	// SITE_BASE_URL //
	///////////////////

	/**	 The entity SITE_BASE_URL
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String SITE_BASE_URL;

	/**	<br> The entity SITE_BASE_URL
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:SITE_BASE_URL">Find the entity SITE_BASE_URL in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _SITE_BASE_URL(Wrap<String> w);

	public String getSITE_BASE_URL() {
		return SITE_BASE_URL;
	}
	public void setSITE_BASE_URL(String o) {
		this.SITE_BASE_URL = PageLayout.staticSetSITE_BASE_URL(siteRequest_, o);
	}
	public static String staticSetSITE_BASE_URL(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PageLayout SITE_BASE_URLInit() {
		Wrap<String> SITE_BASE_URLWrap = new Wrap<String>().var("SITE_BASE_URL");
		if(SITE_BASE_URL == null) {
			_SITE_BASE_URL(SITE_BASE_URLWrap);
			setSITE_BASE_URL(SITE_BASE_URLWrap.o);
		}
		return (PageLayout)this;
	}

	public static String staticSearchSITE_BASE_URL(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSITE_BASE_URL(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSITE_BASE_URL(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrSITE_BASE_URL(siteRequest_, PageLayout.staticSearchSITE_BASE_URL(siteRequest_, PageLayout.staticSetSITE_BASE_URL(siteRequest_, o)));
	}

	///////////////////
	// SITE_AUTH_URL //
	///////////////////

	/**	 The entity SITE_AUTH_URL
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String SITE_AUTH_URL;

	/**	<br> The entity SITE_AUTH_URL
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:SITE_AUTH_URL">Find the entity SITE_AUTH_URL in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _SITE_AUTH_URL(Wrap<String> w);

	public String getSITE_AUTH_URL() {
		return SITE_AUTH_URL;
	}
	public void setSITE_AUTH_URL(String o) {
		this.SITE_AUTH_URL = PageLayout.staticSetSITE_AUTH_URL(siteRequest_, o);
	}
	public static String staticSetSITE_AUTH_URL(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PageLayout SITE_AUTH_URLInit() {
		Wrap<String> SITE_AUTH_URLWrap = new Wrap<String>().var("SITE_AUTH_URL");
		if(SITE_AUTH_URL == null) {
			_SITE_AUTH_URL(SITE_AUTH_URLWrap);
			setSITE_AUTH_URL(SITE_AUTH_URLWrap.o);
		}
		return (PageLayout)this;
	}

	public static String staticSearchSITE_AUTH_URL(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSITE_AUTH_URL(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSITE_AUTH_URL(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrSITE_AUTH_URL(siteRequest_, PageLayout.staticSearchSITE_AUTH_URL(siteRequest_, PageLayout.staticSetSITE_AUTH_URL(siteRequest_, o)));
	}

	/////////////////////
	// SITE_AUTH_REALM //
	/////////////////////

	/**	 The entity SITE_AUTH_REALM
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String SITE_AUTH_REALM;

	/**	<br> The entity SITE_AUTH_REALM
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:SITE_AUTH_REALM">Find the entity SITE_AUTH_REALM in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _SITE_AUTH_REALM(Wrap<String> w);

	public String getSITE_AUTH_REALM() {
		return SITE_AUTH_REALM;
	}
	public void setSITE_AUTH_REALM(String o) {
		this.SITE_AUTH_REALM = PageLayout.staticSetSITE_AUTH_REALM(siteRequest_, o);
	}
	public static String staticSetSITE_AUTH_REALM(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PageLayout SITE_AUTH_REALMInit() {
		Wrap<String> SITE_AUTH_REALMWrap = new Wrap<String>().var("SITE_AUTH_REALM");
		if(SITE_AUTH_REALM == null) {
			_SITE_AUTH_REALM(SITE_AUTH_REALMWrap);
			setSITE_AUTH_REALM(SITE_AUTH_REALMWrap.o);
		}
		return (PageLayout)this;
	}

	public static String staticSearchSITE_AUTH_REALM(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSITE_AUTH_REALM(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSITE_AUTH_REALM(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrSITE_AUTH_REALM(siteRequest_, PageLayout.staticSearchSITE_AUTH_REALM(siteRequest_, PageLayout.staticSetSITE_AUTH_REALM(siteRequest_, o)));
	}

	/////////////////////
	// FONTAWESOME_KIT //
	/////////////////////

	/**	 The entity FONTAWESOME_KIT
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String FONTAWESOME_KIT;

	/**	<br> The entity FONTAWESOME_KIT
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:FONTAWESOME_KIT">Find the entity FONTAWESOME_KIT in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _FONTAWESOME_KIT(Wrap<String> w);

	public String getFONTAWESOME_KIT() {
		return FONTAWESOME_KIT;
	}
	public void setFONTAWESOME_KIT(String o) {
		this.FONTAWESOME_KIT = PageLayout.staticSetFONTAWESOME_KIT(siteRequest_, o);
	}
	public static String staticSetFONTAWESOME_KIT(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PageLayout FONTAWESOME_KITInit() {
		Wrap<String> FONTAWESOME_KITWrap = new Wrap<String>().var("FONTAWESOME_KIT");
		if(FONTAWESOME_KIT == null) {
			_FONTAWESOME_KIT(FONTAWESOME_KITWrap);
			setFONTAWESOME_KIT(FONTAWESOME_KITWrap.o);
		}
		return (PageLayout)this;
	}

	public static String staticSearchFONTAWESOME_KIT(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrFONTAWESOME_KIT(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqFONTAWESOME_KIT(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrFONTAWESOME_KIT(siteRequest_, PageLayout.staticSearchFONTAWESOME_KIT(siteRequest_, PageLayout.staticSetFONTAWESOME_KIT(siteRequest_, o)));
	}

	/////////////
	// pageUri //
	/////////////

	/**	 The entity pageUri
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUri;

	/**	<br> The entity pageUri
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:pageUri">Find the entity pageUri in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUri(Wrap<String> w);

	public String getPageUri() {
		return pageUri;
	}
	public void setPageUri(String o) {
		this.pageUri = PageLayout.staticSetPageUri(siteRequest_, o);
	}
	public static String staticSetPageUri(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PageLayout pageUriInit() {
		Wrap<String> pageUriWrap = new Wrap<String>().var("pageUri");
		if(pageUri == null) {
			_pageUri(pageUriWrap);
			setPageUri(pageUriWrap.o);
		}
		return (PageLayout)this;
	}

	public static String staticSearchPageUri(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUri(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUri(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrPageUri(siteRequest_, PageLayout.staticSearchPageUri(siteRequest_, PageLayout.staticSetPageUri(siteRequest_, o)));
	}

	////////////
	// apiUri //
	////////////

	/**	 The entity apiUri
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String apiUri;

	/**	<br> The entity apiUri
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:apiUri">Find the entity apiUri in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _apiUri(Wrap<String> w);

	public String getApiUri() {
		return apiUri;
	}
	public void setApiUri(String o) {
		this.apiUri = PageLayout.staticSetApiUri(siteRequest_, o);
	}
	public static String staticSetApiUri(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PageLayout apiUriInit() {
		Wrap<String> apiUriWrap = new Wrap<String>().var("apiUri");
		if(apiUri == null) {
			_apiUri(apiUriWrap);
			setApiUri(apiUriWrap.o);
		}
		return (PageLayout)this;
	}

	public static String staticSearchApiUri(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrApiUri(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqApiUri(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrApiUri(siteRequest_, PageLayout.staticSearchApiUri(siteRequest_, PageLayout.staticSetApiUri(siteRequest_, o)));
	}

	////////////////
	// pageMethod //
	////////////////

	/**	 The entity pageMethod
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageMethod;

	/**	<br> The entity pageMethod
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:pageMethod">Find the entity pageMethod in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageMethod(Wrap<String> w);

	public String getPageMethod() {
		return pageMethod;
	}
	public void setPageMethod(String o) {
		this.pageMethod = PageLayout.staticSetPageMethod(siteRequest_, o);
	}
	public static String staticSetPageMethod(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PageLayout pageMethodInit() {
		Wrap<String> pageMethodWrap = new Wrap<String>().var("pageMethod");
		if(pageMethod == null) {
			_pageMethod(pageMethodWrap);
			setPageMethod(pageMethodWrap.o);
		}
		return (PageLayout)this;
	}

	public static String staticSearchPageMethod(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageMethod(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageMethod(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrPageMethod(siteRequest_, PageLayout.staticSearchPageMethod(siteRequest_, PageLayout.staticSetPageMethod(siteRequest_, o)));
	}

	////////////
	// params //
	////////////

	/**	 The entity params
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject params;

	/**	<br> The entity params
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:params">Find the entity params in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _params(Wrap<JsonObject> w);

	public JsonObject getParams() {
		return params;
	}

	public void setParams(JsonObject params) {
		this.params = params;
	}
	@JsonIgnore
	public void setParams(String o) {
		this.params = PageLayout.staticSetParams(siteRequest_, o);
	}
	public static JsonObject staticSetParams(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected PageLayout paramsInit() {
		Wrap<JsonObject> paramsWrap = new Wrap<JsonObject>().var("params");
		if(params == null) {
			_params(paramsWrap);
			setParams(paramsWrap.o);
		}
		return (PageLayout)this;
	}

	public static JsonObject staticSearchParams(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrParams(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParams(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrParams(siteRequest_, PageLayout.staticSearchParams(siteRequest_, PageLayout.staticSetParams(siteRequest_, o)));
	}

	/////////////
	// userKey //
	/////////////

	/**	 The entity userKey
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long userKey;

	/**	<br> The entity userKey
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:userKey">Find the entity userKey in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _userKey(Wrap<Long> w);

	public Long getUserKey() {
		return userKey;
	}

	public void setUserKey(Long userKey) {
		this.userKey = userKey;
	}
	@JsonIgnore
	public void setUserKey(String o) {
		this.userKey = PageLayout.staticSetUserKey(siteRequest_, o);
	}
	public static Long staticSetUserKey(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected PageLayout userKeyInit() {
		Wrap<Long> userKeyWrap = new Wrap<Long>().var("userKey");
		if(userKey == null) {
			_userKey(userKeyWrap);
			setUserKey(userKeyWrap.o);
		}
		return (PageLayout)this;
	}

	public static Long staticSearchUserKey(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrUserKey(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUserKey(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrUserKey(siteRequest_, PageLayout.staticSearchUserKey(siteRequest_, PageLayout.staticSetUserKey(siteRequest_, o)));
	}

	//////////////////
	// userFullName //
	//////////////////

	/**	 The entity userFullName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String userFullName;

	/**	<br> The entity userFullName
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:userFullName">Find the entity userFullName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _userFullName(Wrap<String> w);

	public String getUserFullName() {
		return userFullName;
	}
	public void setUserFullName(String o) {
		this.userFullName = PageLayout.staticSetUserFullName(siteRequest_, o);
	}
	public static String staticSetUserFullName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PageLayout userFullNameInit() {
		Wrap<String> userFullNameWrap = new Wrap<String>().var("userFullName");
		if(userFullName == null) {
			_userFullName(userFullNameWrap);
			setUserFullName(userFullNameWrap.o);
		}
		return (PageLayout)this;
	}

	public static String staticSearchUserFullName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrUserFullName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUserFullName(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrUserFullName(siteRequest_, PageLayout.staticSearchUserFullName(siteRequest_, PageLayout.staticSetUserFullName(siteRequest_, o)));
	}

	//////////////
	// userName //
	//////////////

	/**	 The entity userName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String userName;

	/**	<br> The entity userName
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:userName">Find the entity userName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _userName(Wrap<String> w);

	public String getUserName() {
		return userName;
	}
	public void setUserName(String o) {
		this.userName = PageLayout.staticSetUserName(siteRequest_, o);
	}
	public static String staticSetUserName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PageLayout userNameInit() {
		Wrap<String> userNameWrap = new Wrap<String>().var("userName");
		if(userName == null) {
			_userName(userNameWrap);
			setUserName(userNameWrap.o);
		}
		return (PageLayout)this;
	}

	public static String staticSearchUserName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrUserName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUserName(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrUserName(siteRequest_, PageLayout.staticSearchUserName(siteRequest_, PageLayout.staticSetUserName(siteRequest_, o)));
	}

	///////////////
	// userEmail //
	///////////////

	/**	 The entity userEmail
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String userEmail;

	/**	<br> The entity userEmail
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:userEmail">Find the entity userEmail in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _userEmail(Wrap<String> w);

	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String o) {
		this.userEmail = PageLayout.staticSetUserEmail(siteRequest_, o);
	}
	public static String staticSetUserEmail(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PageLayout userEmailInit() {
		Wrap<String> userEmailWrap = new Wrap<String>().var("userEmail");
		if(userEmail == null) {
			_userEmail(userEmailWrap);
			setUserEmail(userEmailWrap.o);
		}
		return (PageLayout)this;
	}

	public static String staticSearchUserEmail(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrUserEmail(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUserEmail(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrUserEmail(siteRequest_, PageLayout.staticSearchUserEmail(siteRequest_, PageLayout.staticSetUserEmail(siteRequest_, o)));
	}

	///////////////
	// logoutUrl //
	///////////////

	/**	 The entity logoutUrl
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String logoutUrl;

	/**	<br> The entity logoutUrl
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:logoutUrl">Find the entity logoutUrl in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _logoutUrl(Wrap<String> w);

	public String getLogoutUrl() {
		return logoutUrl;
	}
	public void setLogoutUrl(String o) {
		this.logoutUrl = PageLayout.staticSetLogoutUrl(siteRequest_, o);
	}
	public static String staticSetLogoutUrl(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PageLayout logoutUrlInit() {
		Wrap<String> logoutUrlWrap = new Wrap<String>().var("logoutUrl");
		if(logoutUrl == null) {
			_logoutUrl(logoutUrlWrap);
			setLogoutUrl(logoutUrlWrap.o);
		}
		return (PageLayout)this;
	}

	public static String staticSearchLogoutUrl(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrLogoutUrl(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqLogoutUrl(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrLogoutUrl(siteRequest_, PageLayout.staticSearchLogoutUrl(siteRequest_, PageLayout.staticSetLogoutUrl(siteRequest_, o)));
	}

	///////////
	// long0 //
	///////////

	/**	 The entity long0
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long long0;

	/**	<br> The entity long0
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:long0">Find the entity long0 in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _long0(Wrap<Long> w);

	public Long getLong0() {
		return long0;
	}

	public void setLong0(Long long0) {
		this.long0 = long0;
	}
	@JsonIgnore
	public void setLong0(String o) {
		this.long0 = PageLayout.staticSetLong0(siteRequest_, o);
	}
	public static Long staticSetLong0(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected PageLayout long0Init() {
		Wrap<Long> long0Wrap = new Wrap<Long>().var("long0");
		if(long0 == null) {
			_long0(long0Wrap);
			setLong0(long0Wrap.o);
		}
		return (PageLayout)this;
	}

	public static Long staticSearchLong0(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrLong0(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqLong0(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrLong0(siteRequest_, PageLayout.staticSearchLong0(siteRequest_, PageLayout.staticSetLong0(siteRequest_, o)));
	}

	///////////
	// long1 //
	///////////

	/**	 The entity long1
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long long1;

	/**	<br> The entity long1
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:long1">Find the entity long1 in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _long1(Wrap<Long> w);

	public Long getLong1() {
		return long1;
	}

	public void setLong1(Long long1) {
		this.long1 = long1;
	}
	@JsonIgnore
	public void setLong1(String o) {
		this.long1 = PageLayout.staticSetLong1(siteRequest_, o);
	}
	public static Long staticSetLong1(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected PageLayout long1Init() {
		Wrap<Long> long1Wrap = new Wrap<Long>().var("long1");
		if(long1 == null) {
			_long1(long1Wrap);
			setLong1(long1Wrap.o);
		}
		return (PageLayout)this;
	}

	public static Long staticSearchLong1(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrLong1(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqLong1(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrLong1(siteRequest_, PageLayout.staticSearchLong1(siteRequest_, PageLayout.staticSetLong1(siteRequest_, o)));
	}

	//////////
	// int0 //
	//////////

	/**	 The entity int0
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer int0;

	/**	<br> The entity int0
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:int0">Find the entity int0 in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _int0(Wrap<Integer> w);

	public Integer getInt0() {
		return int0;
	}

	public void setInt0(Integer int0) {
		this.int0 = int0;
	}
	@JsonIgnore
	public void setInt0(String o) {
		this.int0 = PageLayout.staticSetInt0(siteRequest_, o);
	}
	public static Integer staticSetInt0(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected PageLayout int0Init() {
		Wrap<Integer> int0Wrap = new Wrap<Integer>().var("int0");
		if(int0 == null) {
			_int0(int0Wrap);
			setInt0(int0Wrap.o);
		}
		return (PageLayout)this;
	}

	public static Integer staticSearchInt0(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrInt0(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqInt0(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrInt0(siteRequest_, PageLayout.staticSearchInt0(siteRequest_, PageLayout.staticSetInt0(siteRequest_, o)));
	}

	//////////
	// int1 //
	//////////

	/**	 The entity int1
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer int1;

	/**	<br> The entity int1
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:int1">Find the entity int1 in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _int1(Wrap<Integer> w);

	public Integer getInt1() {
		return int1;
	}

	public void setInt1(Integer int1) {
		this.int1 = int1;
	}
	@JsonIgnore
	public void setInt1(String o) {
		this.int1 = PageLayout.staticSetInt1(siteRequest_, o);
	}
	public static Integer staticSetInt1(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected PageLayout int1Init() {
		Wrap<Integer> int1Wrap = new Wrap<Integer>().var("int1");
		if(int1 == null) {
			_int1(int1Wrap);
			setInt1(int1Wrap.o);
		}
		return (PageLayout)this;
	}

	public static Integer staticSearchInt1(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrInt1(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqInt1(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrInt1(siteRequest_, PageLayout.staticSearchInt1(siteRequest_, PageLayout.staticSetInt1(siteRequest_, o)));
	}

	///////////////////
	// promiseBefore //
	///////////////////

	/**	 The entity promiseBefore
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected Void promiseBefore;

	/**	<br> The entity promiseBefore
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:promiseBefore">Find the entity promiseBefore in Solr</a>
	 * <br>
	 * @param promise is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _promiseBefore(Promise<Void> promise);

	public Void getPromiseBefore() {
		return promiseBefore;
	}

	public void setPromiseBefore(Void promiseBefore) {
		this.promiseBefore = promiseBefore;
	}
	public static Void staticSetPromiseBefore(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected Future<Void> promiseBeforePromise() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		_promiseBefore(promise2);
		promise2.future().onSuccess(o -> {
			setPromiseBefore(o);
			promise.complete(o);
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	/////////////////////
	// classSimpleName //
	/////////////////////

	/**	 The entity classSimpleName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String classSimpleName;

	/**	<br> The entity classSimpleName
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:classSimpleName">Find the entity classSimpleName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _classSimpleName(Wrap<String> w);

	public String getClassSimpleName() {
		return classSimpleName;
	}
	public void setClassSimpleName(String o) {
		this.classSimpleName = PageLayout.staticSetClassSimpleName(siteRequest_, o);
	}
	public static String staticSetClassSimpleName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PageLayout classSimpleNameInit() {
		Wrap<String> classSimpleNameWrap = new Wrap<String>().var("classSimpleName");
		if(classSimpleName == null) {
			_classSimpleName(classSimpleNameWrap);
			setClassSimpleName(classSimpleNameWrap.o);
		}
		return (PageLayout)this;
	}

	public static String staticSearchClassSimpleName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrClassSimpleName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqClassSimpleName(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrClassSimpleName(siteRequest_, PageLayout.staticSearchClassSimpleName(siteRequest_, PageLayout.staticSetClassSimpleName(siteRequest_, o)));
	}

	///////////////
	// pageTitle //
	///////////////

	/**	 The entity pageTitle
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageTitle;

	/**	<br> The entity pageTitle
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:pageTitle">Find the entity pageTitle in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageTitle(Wrap<String> w);

	public String getPageTitle() {
		return pageTitle;
	}
	public void setPageTitle(String o) {
		this.pageTitle = PageLayout.staticSetPageTitle(siteRequest_, o);
	}
	public static String staticSetPageTitle(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PageLayout pageTitleInit() {
		Wrap<String> pageTitleWrap = new Wrap<String>().var("pageTitle");
		if(pageTitle == null) {
			_pageTitle(pageTitleWrap);
			setPageTitle(pageTitleWrap.o);
		}
		return (PageLayout)this;
	}

	public static String staticSearchPageTitle(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageTitle(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageTitle(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrPageTitle(siteRequest_, PageLayout.staticSearchPageTitle(siteRequest_, PageLayout.staticSetPageTitle(siteRequest_, o)));
	}

	///////////
	// roles //
	///////////

	/**	 The entity roles
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> roles = new ArrayList<String>();

	/**	<br> The entity roles
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:roles">Find the entity roles in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _roles(List<String> l);

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	public static String staticSetRoles(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public PageLayout addRoles(String...objects) {
		for(String o : objects) {
			addRoles(o);
		}
		return (PageLayout)this;
	}
	public PageLayout addRoles(String o) {
		if(o != null)
			this.roles.add(o);
		return (PageLayout)this;
	}
	@JsonIgnore
	public void setRoles(JsonArray objects) {
		roles.clear();
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addRoles(o);
		}
	}
	protected PageLayout rolesInit() {
		_roles(roles);
		return (PageLayout)this;
	}

	public static String staticSearchRoles(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrRoles(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqRoles(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrRoles(siteRequest_, PageLayout.staticSearchRoles(siteRequest_, PageLayout.staticSetRoles(siteRequest_, o)));
	}

	///////////////////
	// rolesRequired //
	///////////////////

	/**	 The entity rolesRequired
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> rolesRequired = new ArrayList<String>();

	/**	<br> The entity rolesRequired
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:rolesRequired">Find the entity rolesRequired in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _rolesRequired(List<String> l);

	public List<String> getRolesRequired() {
		return rolesRequired;
	}

	public void setRolesRequired(List<String> rolesRequired) {
		this.rolesRequired = rolesRequired;
	}
	public static String staticSetRolesRequired(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public PageLayout addRolesRequired(String...objects) {
		for(String o : objects) {
			addRolesRequired(o);
		}
		return (PageLayout)this;
	}
	public PageLayout addRolesRequired(String o) {
		if(o != null)
			this.rolesRequired.add(o);
		return (PageLayout)this;
	}
	@JsonIgnore
	public void setRolesRequired(JsonArray objects) {
		rolesRequired.clear();
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addRolesRequired(o);
		}
	}
	protected PageLayout rolesRequiredInit() {
		_rolesRequired(rolesRequired);
		return (PageLayout)this;
	}

	public static String staticSearchRolesRequired(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrRolesRequired(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqRolesRequired(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrRolesRequired(siteRequest_, PageLayout.staticSearchRolesRequired(siteRequest_, PageLayout.staticSetRolesRequired(siteRequest_, o)));
	}

	////////////////////
	// authRolesAdmin //
	////////////////////

	/**	 The entity authRolesAdmin
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> authRolesAdmin = new ArrayList<String>();

	/**	<br> The entity authRolesAdmin
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:authRolesAdmin">Find the entity authRolesAdmin in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _authRolesAdmin(List<String> l);

	public List<String> getAuthRolesAdmin() {
		return authRolesAdmin;
	}

	public void setAuthRolesAdmin(List<String> authRolesAdmin) {
		this.authRolesAdmin = authRolesAdmin;
	}
	public static String staticSetAuthRolesAdmin(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public PageLayout addAuthRolesAdmin(String...objects) {
		for(String o : objects) {
			addAuthRolesAdmin(o);
		}
		return (PageLayout)this;
	}
	public PageLayout addAuthRolesAdmin(String o) {
		if(o != null)
			this.authRolesAdmin.add(o);
		return (PageLayout)this;
	}
	@JsonIgnore
	public void setAuthRolesAdmin(JsonArray objects) {
		authRolesAdmin.clear();
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addAuthRolesAdmin(o);
		}
	}
	protected PageLayout authRolesAdminInit() {
		_authRolesAdmin(authRolesAdmin);
		return (PageLayout)this;
	}

	public static String staticSearchAuthRolesAdmin(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrAuthRolesAdmin(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAuthRolesAdmin(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrAuthRolesAdmin(siteRequest_, PageLayout.staticSearchAuthRolesAdmin(siteRequest_, PageLayout.staticSetAuthRolesAdmin(siteRequest_, o)));
	}

	////////////////
	// pagination //
	////////////////

	/**	 The entity pagination
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject pagination = new JsonObject();

	/**	<br> The entity pagination
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:pagination">Find the entity pagination in Solr</a>
	 * <br>
	 * @param pagination is the entity already constructed. 
	 **/
	protected abstract void _pagination(JsonObject pagination);

	public JsonObject getPagination() {
		return pagination;
	}

	public void setPagination(JsonObject pagination) {
		this.pagination = pagination;
	}
	@JsonIgnore
	public void setPagination(String o) {
		this.pagination = PageLayout.staticSetPagination(siteRequest_, o);
	}
	public static JsonObject staticSetPagination(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected PageLayout paginationInit() {
		_pagination(pagination);
		return (PageLayout)this;
	}

	public static JsonObject staticSearchPagination(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrPagination(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPagination(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrPagination(siteRequest_, PageLayout.staticSearchPagination(siteRequest_, PageLayout.staticSetPagination(siteRequest_, o)));
	}

	///////////
	// varsQ //
	///////////

	/**	 The entity varsQ
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject varsQ = new JsonObject();

	/**	<br> The entity varsQ
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:varsQ">Find the entity varsQ in Solr</a>
	 * <br>
	 * @param vars is the entity already constructed. 
	 **/
	protected abstract void _varsQ(JsonObject vars);

	public JsonObject getVarsQ() {
		return varsQ;
	}

	public void setVarsQ(JsonObject varsQ) {
		this.varsQ = varsQ;
	}
	@JsonIgnore
	public void setVarsQ(String o) {
		this.varsQ = PageLayout.staticSetVarsQ(siteRequest_, o);
	}
	public static JsonObject staticSetVarsQ(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected PageLayout varsQInit() {
		_varsQ(varsQ);
		return (PageLayout)this;
	}

	public static JsonObject staticSearchVarsQ(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrVarsQ(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqVarsQ(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrVarsQ(siteRequest_, PageLayout.staticSearchVarsQ(siteRequest_, PageLayout.staticSetVarsQ(siteRequest_, o)));
	}

	////////////
	// varsFq //
	////////////

	/**	 The entity varsFq
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject varsFq = new JsonObject();

	/**	<br> The entity varsFq
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:varsFq">Find the entity varsFq in Solr</a>
	 * <br>
	 * @param vars is the entity already constructed. 
	 **/
	protected abstract void _varsFq(JsonObject vars);

	public JsonObject getVarsFq() {
		return varsFq;
	}

	public void setVarsFq(JsonObject varsFq) {
		this.varsFq = varsFq;
	}
	@JsonIgnore
	public void setVarsFq(String o) {
		this.varsFq = PageLayout.staticSetVarsFq(siteRequest_, o);
	}
	public static JsonObject staticSetVarsFq(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected PageLayout varsFqInit() {
		_varsFq(varsFq);
		return (PageLayout)this;
	}

	public static JsonObject staticSearchVarsFq(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrVarsFq(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqVarsFq(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrVarsFq(siteRequest_, PageLayout.staticSearchVarsFq(siteRequest_, PageLayout.staticSetVarsFq(siteRequest_, o)));
	}

	///////////////
	// varsRange //
	///////////////

	/**	 The entity varsRange
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject varsRange = new JsonObject();

	/**	<br> The entity varsRange
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:varsRange">Find the entity varsRange in Solr</a>
	 * <br>
	 * @param vars is the entity already constructed. 
	 **/
	protected abstract void _varsRange(JsonObject vars);

	public JsonObject getVarsRange() {
		return varsRange;
	}

	public void setVarsRange(JsonObject varsRange) {
		this.varsRange = varsRange;
	}
	@JsonIgnore
	public void setVarsRange(String o) {
		this.varsRange = PageLayout.staticSetVarsRange(siteRequest_, o);
	}
	public static JsonObject staticSetVarsRange(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected PageLayout varsRangeInit() {
		_varsRange(varsRange);
		return (PageLayout)this;
	}

	public static JsonObject staticSearchVarsRange(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrVarsRange(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqVarsRange(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrVarsRange(siteRequest_, PageLayout.staticSearchVarsRange(siteRequest_, PageLayout.staticSetVarsRange(siteRequest_, o)));
	}

	///////////
	// query //
	///////////

	/**	 The entity query
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject query = new JsonObject();

	/**	<br> The entity query
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:query">Find the entity query in Solr</a>
	 * <br>
	 * @param query is the entity already constructed. 
	 **/
	protected abstract void _query(JsonObject query);

	public JsonObject getQuery() {
		return query;
	}

	public void setQuery(JsonObject query) {
		this.query = query;
	}
	@JsonIgnore
	public void setQuery(String o) {
		this.query = PageLayout.staticSetQuery(siteRequest_, o);
	}
	public static JsonObject staticSetQuery(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected PageLayout queryInit() {
		_query(query);
		return (PageLayout)this;
	}

	public static JsonObject staticSearchQuery(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrQuery(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqQuery(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrQuery(siteRequest_, PageLayout.staticSearchQuery(siteRequest_, PageLayout.staticSetQuery(siteRequest_, o)));
	}

	//////////////
	// queryStr //
	//////////////

	/**	 The entity queryStr
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String queryStr;

	/**	<br> The entity queryStr
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:queryStr">Find the entity queryStr in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _queryStr(Wrap<String> w);

	public String getQueryStr() {
		return queryStr;
	}
	public void setQueryStr(String o) {
		this.queryStr = PageLayout.staticSetQueryStr(siteRequest_, o);
	}
	public static String staticSetQueryStr(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PageLayout queryStrInit() {
		Wrap<String> queryStrWrap = new Wrap<String>().var("queryStr");
		if(queryStr == null) {
			_queryStr(queryStrWrap);
			setQueryStr(queryStrWrap.o);
		}
		return (PageLayout)this;
	}

	public static String staticSearchQueryStr(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrQueryStr(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqQueryStr(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrQueryStr(siteRequest_, PageLayout.staticSearchQueryStr(siteRequest_, PageLayout.staticSetQueryStr(siteRequest_, o)));
	}

	//////////////////
	// promiseAfter //
	//////////////////

	/**	 The entity promiseAfter
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected Void promiseAfter;

	/**	<br> The entity promiseAfter
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:promiseAfter">Find the entity promiseAfter in Solr</a>
	 * <br>
	 * @param promise is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _promiseAfter(Promise<Void> promise);

	public Void getPromiseAfter() {
		return promiseAfter;
	}

	public void setPromiseAfter(Void promiseAfter) {
		this.promiseAfter = promiseAfter;
	}
	public static Void staticSetPromiseAfter(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected Future<Void> promiseAfterPromise() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		_promiseAfter(promise2);
		promise2.future().onSuccess(o -> {
			setPromiseAfter(o);
			promise.complete(o);
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	//////////////////
	// pageImageUri //
	//////////////////

	/**	 The entity pageImageUri
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageImageUri;

	/**	<br> The entity pageImageUri
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:pageImageUri">Find the entity pageImageUri in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageImageUri(Wrap<String> w);

	public String getPageImageUri() {
		return pageImageUri;
	}
	public void setPageImageUri(String o) {
		this.pageImageUri = PageLayout.staticSetPageImageUri(siteRequest_, o);
	}
	public static String staticSetPageImageUri(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PageLayout pageImageUriInit() {
		Wrap<String> pageImageUriWrap = new Wrap<String>().var("pageImageUri");
		if(pageImageUri == null) {
			_pageImageUri(pageImageUriWrap);
			setPageImageUri(pageImageUriWrap.o);
		}
		return (PageLayout)this;
	}

	public static String staticSearchPageImageUri(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageImageUri(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageImageUri(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrPageImageUri(siteRequest_, PageLayout.staticSearchPageImageUri(siteRequest_, PageLayout.staticSetPageImageUri(siteRequest_, o)));
	}

	////////////////////
	// pageImageWidth //
	////////////////////

	/**	 The entity pageImageWidth
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer pageImageWidth;

	/**	<br> The entity pageImageWidth
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:pageImageWidth">Find the entity pageImageWidth in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageImageWidth(Wrap<Integer> c);

	public Integer getPageImageWidth() {
		return pageImageWidth;
	}

	public void setPageImageWidth(Integer pageImageWidth) {
		this.pageImageWidth = pageImageWidth;
	}
	@JsonIgnore
	public void setPageImageWidth(String o) {
		this.pageImageWidth = PageLayout.staticSetPageImageWidth(siteRequest_, o);
	}
	public static Integer staticSetPageImageWidth(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected PageLayout pageImageWidthInit() {
		Wrap<Integer> pageImageWidthWrap = new Wrap<Integer>().var("pageImageWidth");
		if(pageImageWidth == null) {
			_pageImageWidth(pageImageWidthWrap);
			setPageImageWidth(pageImageWidthWrap.o);
		}
		return (PageLayout)this;
	}

	public static Integer staticSearchPageImageWidth(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrPageImageWidth(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageImageWidth(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrPageImageWidth(siteRequest_, PageLayout.staticSearchPageImageWidth(siteRequest_, PageLayout.staticSetPageImageWidth(siteRequest_, o)));
	}

	/////////////////////
	// pageImageHeight //
	/////////////////////

	/**	 The entity pageImageHeight
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer pageImageHeight;

	/**	<br> The entity pageImageHeight
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:pageImageHeight">Find the entity pageImageHeight in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageImageHeight(Wrap<Integer> c);

	public Integer getPageImageHeight() {
		return pageImageHeight;
	}

	public void setPageImageHeight(Integer pageImageHeight) {
		this.pageImageHeight = pageImageHeight;
	}
	@JsonIgnore
	public void setPageImageHeight(String o) {
		this.pageImageHeight = PageLayout.staticSetPageImageHeight(siteRequest_, o);
	}
	public static Integer staticSetPageImageHeight(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected PageLayout pageImageHeightInit() {
		Wrap<Integer> pageImageHeightWrap = new Wrap<Integer>().var("pageImageHeight");
		if(pageImageHeight == null) {
			_pageImageHeight(pageImageHeightWrap);
			setPageImageHeight(pageImageHeightWrap.o);
		}
		return (PageLayout)this;
	}

	public static Integer staticSearchPageImageHeight(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrPageImageHeight(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageImageHeight(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrPageImageHeight(siteRequest_, PageLayout.staticSearchPageImageHeight(siteRequest_, PageLayout.staticSetPageImageHeight(siteRequest_, o)));
	}

	/////////////////
	// pageVideoId //
	/////////////////

	/**	 The entity pageVideoId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageVideoId;

	/**	<br> The entity pageVideoId
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:pageVideoId">Find the entity pageVideoId in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageVideoId(Wrap<String> c);

	public String getPageVideoId() {
		return pageVideoId;
	}
	public void setPageVideoId(String o) {
		this.pageVideoId = PageLayout.staticSetPageVideoId(siteRequest_, o);
	}
	public static String staticSetPageVideoId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PageLayout pageVideoIdInit() {
		Wrap<String> pageVideoIdWrap = new Wrap<String>().var("pageVideoId");
		if(pageVideoId == null) {
			_pageVideoId(pageVideoIdWrap);
			setPageVideoId(pageVideoIdWrap.o);
		}
		return (PageLayout)this;
	}

	public static String staticSearchPageVideoId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageVideoId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageVideoId(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrPageVideoId(siteRequest_, PageLayout.staticSearchPageVideoId(siteRequest_, PageLayout.staticSetPageVideoId(siteRequest_, o)));
	}

	//////////////////////
	// contextIconGroup //
	//////////////////////

	/**	 The entity contextIconGroup
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String contextIconGroup;

	/**	<br> The entity contextIconGroup
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:contextIconGroup">Find the entity contextIconGroup in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _contextIconGroup(Wrap<String> w);

	public String getContextIconGroup() {
		return contextIconGroup;
	}
	public void setContextIconGroup(String o) {
		this.contextIconGroup = PageLayout.staticSetContextIconGroup(siteRequest_, o);
	}
	public static String staticSetContextIconGroup(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PageLayout contextIconGroupInit() {
		Wrap<String> contextIconGroupWrap = new Wrap<String>().var("contextIconGroup");
		if(contextIconGroup == null) {
			_contextIconGroup(contextIconGroupWrap);
			setContextIconGroup(contextIconGroupWrap.o);
		}
		return (PageLayout)this;
	}

	public static String staticSearchContextIconGroup(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrContextIconGroup(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqContextIconGroup(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrContextIconGroup(siteRequest_, PageLayout.staticSearchContextIconGroup(siteRequest_, PageLayout.staticSetContextIconGroup(siteRequest_, o)));
	}

	/////////////////////
	// contextIconName //
	/////////////////////

	/**	 The entity contextIconName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String contextIconName;

	/**	<br> The entity contextIconName
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:contextIconName">Find the entity contextIconName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _contextIconName(Wrap<String> w);

	public String getContextIconName() {
		return contextIconName;
	}
	public void setContextIconName(String o) {
		this.contextIconName = PageLayout.staticSetContextIconName(siteRequest_, o);
	}
	public static String staticSetContextIconName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PageLayout contextIconNameInit() {
		Wrap<String> contextIconNameWrap = new Wrap<String>().var("contextIconName");
		if(contextIconName == null) {
			_contextIconName(contextIconNameWrap);
			setContextIconName(contextIconNameWrap.o);
		}
		return (PageLayout)this;
	}

	public static String staticSearchContextIconName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrContextIconName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqContextIconName(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrContextIconName(siteRequest_, PageLayout.staticSearchContextIconName(siteRequest_, PageLayout.staticSetContextIconName(siteRequest_, o)));
	}

	///////////////////////////
	// contextIconCssClasses //
	///////////////////////////

	/**	 The entity contextIconCssClasses
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String contextIconCssClasses;

	/**	<br> The entity contextIconCssClasses
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:contextIconCssClasses">Find the entity contextIconCssClasses in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _contextIconCssClasses(Wrap<String> w);

	public String getContextIconCssClasses() {
		return contextIconCssClasses;
	}
	public void setContextIconCssClasses(String o) {
		this.contextIconCssClasses = PageLayout.staticSetContextIconCssClasses(siteRequest_, o);
	}
	public static String staticSetContextIconCssClasses(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PageLayout contextIconCssClassesInit() {
		Wrap<String> contextIconCssClassesWrap = new Wrap<String>().var("contextIconCssClasses");
		if(contextIconCssClasses == null) {
			_contextIconCssClasses(contextIconCssClassesWrap);
			setContextIconCssClasses(contextIconCssClassesWrap.o);
		}
		return (PageLayout)this;
	}

	public static String staticSearchContextIconCssClasses(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrContextIconCssClasses(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqContextIconCssClasses(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrContextIconCssClasses(siteRequest_, PageLayout.staticSearchContextIconCssClasses(siteRequest_, PageLayout.staticSetContextIconCssClasses(siteRequest_, o)));
	}

	/////////////////////
	// pageDescription //
	/////////////////////

	/**	 The entity pageDescription
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageDescription;

	/**	<br> The entity pageDescription
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.PageLayout&fq=entiteVar_enUS_indexed_string:pageDescription">Find the entity pageDescription in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageDescription(Wrap<String> w);

	public String getPageDescription() {
		return pageDescription;
	}
	public void setPageDescription(String o) {
		this.pageDescription = PageLayout.staticSetPageDescription(siteRequest_, o);
	}
	public static String staticSetPageDescription(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PageLayout pageDescriptionInit() {
		Wrap<String> pageDescriptionWrap = new Wrap<String>().var("pageDescription");
		if(pageDescription == null) {
			_pageDescription(pageDescriptionWrap);
			setPageDescription(pageDescriptionWrap.o);
		}
		return (PageLayout)this;
	}

	public static String staticSearchPageDescription(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageDescription(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageDescription(SiteRequestEnUS siteRequest_, String o) {
		return PageLayout.staticSearchStrPageDescription(siteRequest_, PageLayout.staticSearchPageDescription(siteRequest_, PageLayout.staticSetPageDescription(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepPageLayout(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepPageLayout();
	}

	public Future<Void> promiseDeepPageLayout() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promisePageLayout(promise2);
		promise2.future().onSuccess(a -> {
			promise.complete();
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promisePageLayout(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				siteRequest_Init();
				langInit();
				requestVarsInit();
				configInit();
				serviceRequestInit();
				staticBaseUrlInit();
				STATIC_BASE_URLInit();
				SITE_BASE_URLInit();
				SITE_AUTH_URLInit();
				SITE_AUTH_REALMInit();
				FONTAWESOME_KITInit();
				pageUriInit();
				apiUriInit();
				pageMethodInit();
				paramsInit();
				userKeyInit();
				userFullNameInit();
				userNameInit();
				userEmailInit();
				logoutUrlInit();
				long0Init();
				long1Init();
				int0Init();
				int1Init();
				promise2.complete();
			} catch(Exception ex) {
				promise2.fail(ex);
			}
			return promise2.future();
		}).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			promiseBeforePromise().onSuccess(promiseBefore -> {
				promise2.complete();
			}).onFailure(ex -> {
				promise2.fail(ex);
			});
			return promise2.future();
		}).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				classSimpleNameInit();
				pageTitleInit();
				rolesInit();
				rolesRequiredInit();
				authRolesAdminInit();
				paginationInit();
				varsQInit();
				varsFqInit();
				varsRangeInit();
				queryInit();
				queryStrInit();
				promise2.complete();
			} catch(Exception ex) {
				promise2.fail(ex);
			}
			return promise2.future();
		}).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			promiseAfterPromise().onSuccess(promiseAfter -> {
				promise2.complete();
			}).onFailure(ex -> {
				promise2.fail(ex);
			});
			return promise2.future();
		}).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				pageImageUriInit();
				pageImageWidthInit();
				pageImageHeightInit();
				pageVideoIdInit();
				contextIconGroupInit();
				contextIconNameInit();
				contextIconCssClassesInit();
				pageDescriptionInit();
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

	public Future<Void> promiseDeepForClass(SiteRequestEnUS siteRequest_) {
		return promiseDeepPageLayout(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestPageLayout(SiteRequestEnUS siteRequest_) {
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestPageLayout(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainPageLayout(v);
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
	public Object obtainPageLayout(String var) {
		PageLayout oPageLayout = (PageLayout)this;
		switch(var) {
			case "siteRequest_":
				return oPageLayout.siteRequest_;
			case "lang":
				return oPageLayout.lang;
			case "requestVars":
				return oPageLayout.requestVars;
			case "config":
				return oPageLayout.config;
			case "serviceRequest":
				return oPageLayout.serviceRequest;
			case "staticBaseUrl":
				return oPageLayout.staticBaseUrl;
			case "STATIC_BASE_URL":
				return oPageLayout.STATIC_BASE_URL;
			case "SITE_BASE_URL":
				return oPageLayout.SITE_BASE_URL;
			case "SITE_AUTH_URL":
				return oPageLayout.SITE_AUTH_URL;
			case "SITE_AUTH_REALM":
				return oPageLayout.SITE_AUTH_REALM;
			case "FONTAWESOME_KIT":
				return oPageLayout.FONTAWESOME_KIT;
			case "pageUri":
				return oPageLayout.pageUri;
			case "apiUri":
				return oPageLayout.apiUri;
			case "pageMethod":
				return oPageLayout.pageMethod;
			case "params":
				return oPageLayout.params;
			case "userKey":
				return oPageLayout.userKey;
			case "userFullName":
				return oPageLayout.userFullName;
			case "userName":
				return oPageLayout.userName;
			case "userEmail":
				return oPageLayout.userEmail;
			case "logoutUrl":
				return oPageLayout.logoutUrl;
			case "long0":
				return oPageLayout.long0;
			case "long1":
				return oPageLayout.long1;
			case "int0":
				return oPageLayout.int0;
			case "int1":
				return oPageLayout.int1;
			case "promiseBefore":
				return oPageLayout.promiseBefore;
			case "classSimpleName":
				return oPageLayout.classSimpleName;
			case "pageTitle":
				return oPageLayout.pageTitle;
			case "roles":
				return oPageLayout.roles;
			case "rolesRequired":
				return oPageLayout.rolesRequired;
			case "authRolesAdmin":
				return oPageLayout.authRolesAdmin;
			case "pagination":
				return oPageLayout.pagination;
			case "varsQ":
				return oPageLayout.varsQ;
			case "varsFq":
				return oPageLayout.varsFq;
			case "varsRange":
				return oPageLayout.varsRange;
			case "query":
				return oPageLayout.query;
			case "queryStr":
				return oPageLayout.queryStr;
			case "promiseAfter":
				return oPageLayout.promiseAfter;
			case "pageImageUri":
				return oPageLayout.pageImageUri;
			case "pageImageWidth":
				return oPageLayout.pageImageWidth;
			case "pageImageHeight":
				return oPageLayout.pageImageHeight;
			case "pageVideoId":
				return oPageLayout.pageVideoId;
			case "contextIconGroup":
				return oPageLayout.contextIconGroup;
			case "contextIconName":
				return oPageLayout.contextIconName;
			case "contextIconCssClasses":
				return oPageLayout.contextIconCssClasses;
			case "pageDescription":
				return oPageLayout.pageDescription;
			default:
				return null;
		}
	}

	///////////////
	// relate //
	///////////////

	public boolean relateForClass(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = relatePageLayout(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relatePageLayout(String var, Object val) {
		PageLayout oPageLayout = (PageLayout)this;
		switch(var) {
			default:
				return null;
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetPageLayout(entityVar,  siteRequest_, o);
	}
	public static Object staticSetPageLayout(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "lang":
			return PageLayout.staticSetLang(siteRequest_, o);
		case "config":
			return PageLayout.staticSetConfig(siteRequest_, o);
		case "staticBaseUrl":
			return PageLayout.staticSetStaticBaseUrl(siteRequest_, o);
		case "STATIC_BASE_URL":
			return PageLayout.staticSetSTATIC_BASE_URL(siteRequest_, o);
		case "SITE_BASE_URL":
			return PageLayout.staticSetSITE_BASE_URL(siteRequest_, o);
		case "SITE_AUTH_URL":
			return PageLayout.staticSetSITE_AUTH_URL(siteRequest_, o);
		case "SITE_AUTH_REALM":
			return PageLayout.staticSetSITE_AUTH_REALM(siteRequest_, o);
		case "FONTAWESOME_KIT":
			return PageLayout.staticSetFONTAWESOME_KIT(siteRequest_, o);
		case "pageUri":
			return PageLayout.staticSetPageUri(siteRequest_, o);
		case "apiUri":
			return PageLayout.staticSetApiUri(siteRequest_, o);
		case "pageMethod":
			return PageLayout.staticSetPageMethod(siteRequest_, o);
		case "params":
			return PageLayout.staticSetParams(siteRequest_, o);
		case "userKey":
			return PageLayout.staticSetUserKey(siteRequest_, o);
		case "userFullName":
			return PageLayout.staticSetUserFullName(siteRequest_, o);
		case "userName":
			return PageLayout.staticSetUserName(siteRequest_, o);
		case "userEmail":
			return PageLayout.staticSetUserEmail(siteRequest_, o);
		case "logoutUrl":
			return PageLayout.staticSetLogoutUrl(siteRequest_, o);
		case "long0":
			return PageLayout.staticSetLong0(siteRequest_, o);
		case "long1":
			return PageLayout.staticSetLong1(siteRequest_, o);
		case "int0":
			return PageLayout.staticSetInt0(siteRequest_, o);
		case "int1":
			return PageLayout.staticSetInt1(siteRequest_, o);
		case "classSimpleName":
			return PageLayout.staticSetClassSimpleName(siteRequest_, o);
		case "pageTitle":
			return PageLayout.staticSetPageTitle(siteRequest_, o);
		case "roles":
			return PageLayout.staticSetRoles(siteRequest_, o);
		case "rolesRequired":
			return PageLayout.staticSetRolesRequired(siteRequest_, o);
		case "authRolesAdmin":
			return PageLayout.staticSetAuthRolesAdmin(siteRequest_, o);
		case "pagination":
			return PageLayout.staticSetPagination(siteRequest_, o);
		case "varsQ":
			return PageLayout.staticSetVarsQ(siteRequest_, o);
		case "varsFq":
			return PageLayout.staticSetVarsFq(siteRequest_, o);
		case "varsRange":
			return PageLayout.staticSetVarsRange(siteRequest_, o);
		case "query":
			return PageLayout.staticSetQuery(siteRequest_, o);
		case "queryStr":
			return PageLayout.staticSetQueryStr(siteRequest_, o);
		case "pageImageUri":
			return PageLayout.staticSetPageImageUri(siteRequest_, o);
		case "pageImageWidth":
			return PageLayout.staticSetPageImageWidth(siteRequest_, o);
		case "pageImageHeight":
			return PageLayout.staticSetPageImageHeight(siteRequest_, o);
		case "pageVideoId":
			return PageLayout.staticSetPageVideoId(siteRequest_, o);
		case "contextIconGroup":
			return PageLayout.staticSetContextIconGroup(siteRequest_, o);
		case "contextIconName":
			return PageLayout.staticSetContextIconName(siteRequest_, o);
		case "contextIconCssClasses":
			return PageLayout.staticSetContextIconCssClasses(siteRequest_, o);
		case "pageDescription":
			return PageLayout.staticSetPageDescription(siteRequest_, o);
			default:
				return null;
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchPageLayout(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchPageLayout(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "lang":
			return PageLayout.staticSearchLang(siteRequest_, (String)o);
		case "config":
			return PageLayout.staticSearchConfig(siteRequest_, (JsonObject)o);
		case "staticBaseUrl":
			return PageLayout.staticSearchStaticBaseUrl(siteRequest_, (String)o);
		case "STATIC_BASE_URL":
			return PageLayout.staticSearchSTATIC_BASE_URL(siteRequest_, (String)o);
		case "SITE_BASE_URL":
			return PageLayout.staticSearchSITE_BASE_URL(siteRequest_, (String)o);
		case "SITE_AUTH_URL":
			return PageLayout.staticSearchSITE_AUTH_URL(siteRequest_, (String)o);
		case "SITE_AUTH_REALM":
			return PageLayout.staticSearchSITE_AUTH_REALM(siteRequest_, (String)o);
		case "FONTAWESOME_KIT":
			return PageLayout.staticSearchFONTAWESOME_KIT(siteRequest_, (String)o);
		case "pageUri":
			return PageLayout.staticSearchPageUri(siteRequest_, (String)o);
		case "apiUri":
			return PageLayout.staticSearchApiUri(siteRequest_, (String)o);
		case "pageMethod":
			return PageLayout.staticSearchPageMethod(siteRequest_, (String)o);
		case "params":
			return PageLayout.staticSearchParams(siteRequest_, (JsonObject)o);
		case "userKey":
			return PageLayout.staticSearchUserKey(siteRequest_, (Long)o);
		case "userFullName":
			return PageLayout.staticSearchUserFullName(siteRequest_, (String)o);
		case "userName":
			return PageLayout.staticSearchUserName(siteRequest_, (String)o);
		case "userEmail":
			return PageLayout.staticSearchUserEmail(siteRequest_, (String)o);
		case "logoutUrl":
			return PageLayout.staticSearchLogoutUrl(siteRequest_, (String)o);
		case "long0":
			return PageLayout.staticSearchLong0(siteRequest_, (Long)o);
		case "long1":
			return PageLayout.staticSearchLong1(siteRequest_, (Long)o);
		case "int0":
			return PageLayout.staticSearchInt0(siteRequest_, (Integer)o);
		case "int1":
			return PageLayout.staticSearchInt1(siteRequest_, (Integer)o);
		case "classSimpleName":
			return PageLayout.staticSearchClassSimpleName(siteRequest_, (String)o);
		case "pageTitle":
			return PageLayout.staticSearchPageTitle(siteRequest_, (String)o);
		case "roles":
			return PageLayout.staticSearchRoles(siteRequest_, (String)o);
		case "rolesRequired":
			return PageLayout.staticSearchRolesRequired(siteRequest_, (String)o);
		case "authRolesAdmin":
			return PageLayout.staticSearchAuthRolesAdmin(siteRequest_, (String)o);
		case "pagination":
			return PageLayout.staticSearchPagination(siteRequest_, (JsonObject)o);
		case "varsQ":
			return PageLayout.staticSearchVarsQ(siteRequest_, (JsonObject)o);
		case "varsFq":
			return PageLayout.staticSearchVarsFq(siteRequest_, (JsonObject)o);
		case "varsRange":
			return PageLayout.staticSearchVarsRange(siteRequest_, (JsonObject)o);
		case "query":
			return PageLayout.staticSearchQuery(siteRequest_, (JsonObject)o);
		case "queryStr":
			return PageLayout.staticSearchQueryStr(siteRequest_, (String)o);
		case "pageImageUri":
			return PageLayout.staticSearchPageImageUri(siteRequest_, (String)o);
		case "pageImageWidth":
			return PageLayout.staticSearchPageImageWidth(siteRequest_, (Integer)o);
		case "pageImageHeight":
			return PageLayout.staticSearchPageImageHeight(siteRequest_, (Integer)o);
		case "pageVideoId":
			return PageLayout.staticSearchPageVideoId(siteRequest_, (String)o);
		case "contextIconGroup":
			return PageLayout.staticSearchContextIconGroup(siteRequest_, (String)o);
		case "contextIconName":
			return PageLayout.staticSearchContextIconName(siteRequest_, (String)o);
		case "contextIconCssClasses":
			return PageLayout.staticSearchContextIconCssClasses(siteRequest_, (String)o);
		case "pageDescription":
			return PageLayout.staticSearchPageDescription(siteRequest_, (String)o);
			default:
				return null;
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrPageLayout(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrPageLayout(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "lang":
			return PageLayout.staticSearchStrLang(siteRequest_, (String)o);
		case "config":
			return PageLayout.staticSearchStrConfig(siteRequest_, (JsonObject)o);
		case "staticBaseUrl":
			return PageLayout.staticSearchStrStaticBaseUrl(siteRequest_, (String)o);
		case "STATIC_BASE_URL":
			return PageLayout.staticSearchStrSTATIC_BASE_URL(siteRequest_, (String)o);
		case "SITE_BASE_URL":
			return PageLayout.staticSearchStrSITE_BASE_URL(siteRequest_, (String)o);
		case "SITE_AUTH_URL":
			return PageLayout.staticSearchStrSITE_AUTH_URL(siteRequest_, (String)o);
		case "SITE_AUTH_REALM":
			return PageLayout.staticSearchStrSITE_AUTH_REALM(siteRequest_, (String)o);
		case "FONTAWESOME_KIT":
			return PageLayout.staticSearchStrFONTAWESOME_KIT(siteRequest_, (String)o);
		case "pageUri":
			return PageLayout.staticSearchStrPageUri(siteRequest_, (String)o);
		case "apiUri":
			return PageLayout.staticSearchStrApiUri(siteRequest_, (String)o);
		case "pageMethod":
			return PageLayout.staticSearchStrPageMethod(siteRequest_, (String)o);
		case "params":
			return PageLayout.staticSearchStrParams(siteRequest_, (JsonObject)o);
		case "userKey":
			return PageLayout.staticSearchStrUserKey(siteRequest_, (Long)o);
		case "userFullName":
			return PageLayout.staticSearchStrUserFullName(siteRequest_, (String)o);
		case "userName":
			return PageLayout.staticSearchStrUserName(siteRequest_, (String)o);
		case "userEmail":
			return PageLayout.staticSearchStrUserEmail(siteRequest_, (String)o);
		case "logoutUrl":
			return PageLayout.staticSearchStrLogoutUrl(siteRequest_, (String)o);
		case "long0":
			return PageLayout.staticSearchStrLong0(siteRequest_, (Long)o);
		case "long1":
			return PageLayout.staticSearchStrLong1(siteRequest_, (Long)o);
		case "int0":
			return PageLayout.staticSearchStrInt0(siteRequest_, (Integer)o);
		case "int1":
			return PageLayout.staticSearchStrInt1(siteRequest_, (Integer)o);
		case "classSimpleName":
			return PageLayout.staticSearchStrClassSimpleName(siteRequest_, (String)o);
		case "pageTitle":
			return PageLayout.staticSearchStrPageTitle(siteRequest_, (String)o);
		case "roles":
			return PageLayout.staticSearchStrRoles(siteRequest_, (String)o);
		case "rolesRequired":
			return PageLayout.staticSearchStrRolesRequired(siteRequest_, (String)o);
		case "authRolesAdmin":
			return PageLayout.staticSearchStrAuthRolesAdmin(siteRequest_, (String)o);
		case "pagination":
			return PageLayout.staticSearchStrPagination(siteRequest_, (JsonObject)o);
		case "varsQ":
			return PageLayout.staticSearchStrVarsQ(siteRequest_, (JsonObject)o);
		case "varsFq":
			return PageLayout.staticSearchStrVarsFq(siteRequest_, (JsonObject)o);
		case "varsRange":
			return PageLayout.staticSearchStrVarsRange(siteRequest_, (JsonObject)o);
		case "query":
			return PageLayout.staticSearchStrQuery(siteRequest_, (JsonObject)o);
		case "queryStr":
			return PageLayout.staticSearchStrQueryStr(siteRequest_, (String)o);
		case "pageImageUri":
			return PageLayout.staticSearchStrPageImageUri(siteRequest_, (String)o);
		case "pageImageWidth":
			return PageLayout.staticSearchStrPageImageWidth(siteRequest_, (Integer)o);
		case "pageImageHeight":
			return PageLayout.staticSearchStrPageImageHeight(siteRequest_, (Integer)o);
		case "pageVideoId":
			return PageLayout.staticSearchStrPageVideoId(siteRequest_, (String)o);
		case "contextIconGroup":
			return PageLayout.staticSearchStrContextIconGroup(siteRequest_, (String)o);
		case "contextIconName":
			return PageLayout.staticSearchStrContextIconName(siteRequest_, (String)o);
		case "contextIconCssClasses":
			return PageLayout.staticSearchStrContextIconCssClasses(siteRequest_, (String)o);
		case "pageDescription":
			return PageLayout.staticSearchStrPageDescription(siteRequest_, (String)o);
			default:
				return null;
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqPageLayout(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqPageLayout(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "lang":
			return PageLayout.staticSearchFqLang(siteRequest_, o);
		case "config":
			return PageLayout.staticSearchFqConfig(siteRequest_, o);
		case "staticBaseUrl":
			return PageLayout.staticSearchFqStaticBaseUrl(siteRequest_, o);
		case "STATIC_BASE_URL":
			return PageLayout.staticSearchFqSTATIC_BASE_URL(siteRequest_, o);
		case "SITE_BASE_URL":
			return PageLayout.staticSearchFqSITE_BASE_URL(siteRequest_, o);
		case "SITE_AUTH_URL":
			return PageLayout.staticSearchFqSITE_AUTH_URL(siteRequest_, o);
		case "SITE_AUTH_REALM":
			return PageLayout.staticSearchFqSITE_AUTH_REALM(siteRequest_, o);
		case "FONTAWESOME_KIT":
			return PageLayout.staticSearchFqFONTAWESOME_KIT(siteRequest_, o);
		case "pageUri":
			return PageLayout.staticSearchFqPageUri(siteRequest_, o);
		case "apiUri":
			return PageLayout.staticSearchFqApiUri(siteRequest_, o);
		case "pageMethod":
			return PageLayout.staticSearchFqPageMethod(siteRequest_, o);
		case "params":
			return PageLayout.staticSearchFqParams(siteRequest_, o);
		case "userKey":
			return PageLayout.staticSearchFqUserKey(siteRequest_, o);
		case "userFullName":
			return PageLayout.staticSearchFqUserFullName(siteRequest_, o);
		case "userName":
			return PageLayout.staticSearchFqUserName(siteRequest_, o);
		case "userEmail":
			return PageLayout.staticSearchFqUserEmail(siteRequest_, o);
		case "logoutUrl":
			return PageLayout.staticSearchFqLogoutUrl(siteRequest_, o);
		case "long0":
			return PageLayout.staticSearchFqLong0(siteRequest_, o);
		case "long1":
			return PageLayout.staticSearchFqLong1(siteRequest_, o);
		case "int0":
			return PageLayout.staticSearchFqInt0(siteRequest_, o);
		case "int1":
			return PageLayout.staticSearchFqInt1(siteRequest_, o);
		case "classSimpleName":
			return PageLayout.staticSearchFqClassSimpleName(siteRequest_, o);
		case "pageTitle":
			return PageLayout.staticSearchFqPageTitle(siteRequest_, o);
		case "roles":
			return PageLayout.staticSearchFqRoles(siteRequest_, o);
		case "rolesRequired":
			return PageLayout.staticSearchFqRolesRequired(siteRequest_, o);
		case "authRolesAdmin":
			return PageLayout.staticSearchFqAuthRolesAdmin(siteRequest_, o);
		case "pagination":
			return PageLayout.staticSearchFqPagination(siteRequest_, o);
		case "varsQ":
			return PageLayout.staticSearchFqVarsQ(siteRequest_, o);
		case "varsFq":
			return PageLayout.staticSearchFqVarsFq(siteRequest_, o);
		case "varsRange":
			return PageLayout.staticSearchFqVarsRange(siteRequest_, o);
		case "query":
			return PageLayout.staticSearchFqQuery(siteRequest_, o);
		case "queryStr":
			return PageLayout.staticSearchFqQueryStr(siteRequest_, o);
		case "pageImageUri":
			return PageLayout.staticSearchFqPageImageUri(siteRequest_, o);
		case "pageImageWidth":
			return PageLayout.staticSearchFqPageImageWidth(siteRequest_, o);
		case "pageImageHeight":
			return PageLayout.staticSearchFqPageImageHeight(siteRequest_, o);
		case "pageVideoId":
			return PageLayout.staticSearchFqPageVideoId(siteRequest_, o);
		case "contextIconGroup":
			return PageLayout.staticSearchFqContextIconGroup(siteRequest_, o);
		case "contextIconName":
			return PageLayout.staticSearchFqContextIconName(siteRequest_, o);
		case "contextIconCssClasses":
			return PageLayout.staticSearchFqContextIconCssClasses(siteRequest_, o);
		case "pageDescription":
			return PageLayout.staticSearchFqPageDescription(siteRequest_, o);
			default:
				return null;
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "PageLayout";
	public static final String VAR_siteRequest_ = "siteRequest_";
	public static final String VAR_lang = "lang";
	public static final String VAR_requestVars = "requestVars";
	public static final String VAR_config = "config";
	public static final String VAR_serviceRequest = "serviceRequest";
	public static final String VAR_staticBaseUrl = "staticBaseUrl";
	public static final String VAR_STATIC_BASE_URL = "STATIC_BASE_URL";
	public static final String VAR_SITE_BASE_URL = "SITE_BASE_URL";
	public static final String VAR_SITE_AUTH_URL = "SITE_AUTH_URL";
	public static final String VAR_SITE_AUTH_REALM = "SITE_AUTH_REALM";
	public static final String VAR_FONTAWESOME_KIT = "FONTAWESOME_KIT";
	public static final String VAR_pageUri = "pageUri";
	public static final String VAR_apiUri = "apiUri";
	public static final String VAR_pageMethod = "pageMethod";
	public static final String VAR_params = "params";
	public static final String VAR_userKey = "userKey";
	public static final String VAR_userFullName = "userFullName";
	public static final String VAR_userName = "userName";
	public static final String VAR_userEmail = "userEmail";
	public static final String VAR_logoutUrl = "logoutUrl";
	public static final String VAR_long0 = "long0";
	public static final String VAR_long1 = "long1";
	public static final String VAR_int0 = "int0";
	public static final String VAR_int1 = "int1";
	public static final String VAR_promiseBefore = "promiseBefore";
	public static final String VAR_classSimpleName = "classSimpleName";
	public static final String VAR_pageTitle = "pageTitle";
	public static final String VAR_roles = "roles";
	public static final String VAR_rolesRequired = "rolesRequired";
	public static final String VAR_authRolesAdmin = "authRolesAdmin";
	public static final String VAR_pagination = "pagination";
	public static final String VAR_varsQ = "varsQ";
	public static final String VAR_varsFq = "varsFq";
	public static final String VAR_varsRange = "varsRange";
	public static final String VAR_query = "query";
	public static final String VAR_queryStr = "queryStr";
	public static final String VAR_promiseAfter = "promiseAfter";
	public static final String VAR_pageImageUri = "pageImageUri";
	public static final String VAR_pageImageWidth = "pageImageWidth";
	public static final String VAR_pageImageHeight = "pageImageHeight";
	public static final String VAR_pageVideoId = "pageVideoId";
	public static final String VAR_contextIconGroup = "contextIconGroup";
	public static final String VAR_contextIconName = "contextIconName";
	public static final String VAR_contextIconCssClasses = "contextIconCssClasses";
	public static final String VAR_pageDescription = "pageDescription";

	public static final String DISPLAY_NAME_siteRequest_ = "";
	public static final String DISPLAY_NAME_lang = "";
	public static final String DISPLAY_NAME_requestVars = "";
	public static final String DISPLAY_NAME_config = "";
	public static final String DISPLAY_NAME_serviceRequest = "";
	public static final String DISPLAY_NAME_staticBaseUrl = "";
	public static final String DISPLAY_NAME_STATIC_BASE_URL = "";
	public static final String DISPLAY_NAME_SITE_BASE_URL = "";
	public static final String DISPLAY_NAME_SITE_AUTH_URL = "";
	public static final String DISPLAY_NAME_SITE_AUTH_REALM = "";
	public static final String DISPLAY_NAME_FONTAWESOME_KIT = "";
	public static final String DISPLAY_NAME_pageUri = "";
	public static final String DISPLAY_NAME_apiUri = "";
	public static final String DISPLAY_NAME_pageMethod = "";
	public static final String DISPLAY_NAME_params = "";
	public static final String DISPLAY_NAME_userKey = "";
	public static final String DISPLAY_NAME_userFullName = "";
	public static final String DISPLAY_NAME_userName = "";
	public static final String DISPLAY_NAME_userEmail = "";
	public static final String DISPLAY_NAME_logoutUrl = "";
	public static final String DISPLAY_NAME_long0 = "";
	public static final String DISPLAY_NAME_long1 = "";
	public static final String DISPLAY_NAME_int0 = "";
	public static final String DISPLAY_NAME_int1 = "";
	public static final String DISPLAY_NAME_promiseBefore = "";
	public static final String DISPLAY_NAME_classSimpleName = "";
	public static final String DISPLAY_NAME_pageTitle = "";
	public static final String DISPLAY_NAME_roles = "";
	public static final String DISPLAY_NAME_rolesRequired = "";
	public static final String DISPLAY_NAME_authRolesAdmin = "";
	public static final String DISPLAY_NAME_pagination = "";
	public static final String DISPLAY_NAME_varsQ = "";
	public static final String DISPLAY_NAME_varsFq = "";
	public static final String DISPLAY_NAME_varsRange = "";
	public static final String DISPLAY_NAME_query = "";
	public static final String DISPLAY_NAME_queryStr = "";
	public static final String DISPLAY_NAME_promiseAfter = "";
	public static final String DISPLAY_NAME_pageImageUri = "";
	public static final String DISPLAY_NAME_pageImageWidth = "";
	public static final String DISPLAY_NAME_pageImageHeight = "";
	public static final String DISPLAY_NAME_pageVideoId = "";
	public static final String DISPLAY_NAME_contextIconGroup = "";
	public static final String DISPLAY_NAME_contextIconName = "";
	public static final String DISPLAY_NAME_contextIconCssClasses = "";
	public static final String DISPLAY_NAME_pageDescription = "";

	public static String displayNameForClass(String var) {
		return PageLayout.displayNamePageLayout(var);
	}
	public static String displayNamePageLayout(String var) {
		switch(var) {
		case VAR_siteRequest_:
			return DISPLAY_NAME_siteRequest_;
		case VAR_lang:
			return DISPLAY_NAME_lang;
		case VAR_requestVars:
			return DISPLAY_NAME_requestVars;
		case VAR_config:
			return DISPLAY_NAME_config;
		case VAR_serviceRequest:
			return DISPLAY_NAME_serviceRequest;
		case VAR_staticBaseUrl:
			return DISPLAY_NAME_staticBaseUrl;
		case VAR_STATIC_BASE_URL:
			return DISPLAY_NAME_STATIC_BASE_URL;
		case VAR_SITE_BASE_URL:
			return DISPLAY_NAME_SITE_BASE_URL;
		case VAR_SITE_AUTH_URL:
			return DISPLAY_NAME_SITE_AUTH_URL;
		case VAR_SITE_AUTH_REALM:
			return DISPLAY_NAME_SITE_AUTH_REALM;
		case VAR_FONTAWESOME_KIT:
			return DISPLAY_NAME_FONTAWESOME_KIT;
		case VAR_pageUri:
			return DISPLAY_NAME_pageUri;
		case VAR_apiUri:
			return DISPLAY_NAME_apiUri;
		case VAR_pageMethod:
			return DISPLAY_NAME_pageMethod;
		case VAR_params:
			return DISPLAY_NAME_params;
		case VAR_userKey:
			return DISPLAY_NAME_userKey;
		case VAR_userFullName:
			return DISPLAY_NAME_userFullName;
		case VAR_userName:
			return DISPLAY_NAME_userName;
		case VAR_userEmail:
			return DISPLAY_NAME_userEmail;
		case VAR_logoutUrl:
			return DISPLAY_NAME_logoutUrl;
		case VAR_long0:
			return DISPLAY_NAME_long0;
		case VAR_long1:
			return DISPLAY_NAME_long1;
		case VAR_int0:
			return DISPLAY_NAME_int0;
		case VAR_int1:
			return DISPLAY_NAME_int1;
		case VAR_promiseBefore:
			return DISPLAY_NAME_promiseBefore;
		case VAR_classSimpleName:
			return DISPLAY_NAME_classSimpleName;
		case VAR_pageTitle:
			return DISPLAY_NAME_pageTitle;
		case VAR_roles:
			return DISPLAY_NAME_roles;
		case VAR_rolesRequired:
			return DISPLAY_NAME_rolesRequired;
		case VAR_authRolesAdmin:
			return DISPLAY_NAME_authRolesAdmin;
		case VAR_pagination:
			return DISPLAY_NAME_pagination;
		case VAR_varsQ:
			return DISPLAY_NAME_varsQ;
		case VAR_varsFq:
			return DISPLAY_NAME_varsFq;
		case VAR_varsRange:
			return DISPLAY_NAME_varsRange;
		case VAR_query:
			return DISPLAY_NAME_query;
		case VAR_queryStr:
			return DISPLAY_NAME_queryStr;
		case VAR_promiseAfter:
			return DISPLAY_NAME_promiseAfter;
		case VAR_pageImageUri:
			return DISPLAY_NAME_pageImageUri;
		case VAR_pageImageWidth:
			return DISPLAY_NAME_pageImageWidth;
		case VAR_pageImageHeight:
			return DISPLAY_NAME_pageImageHeight;
		case VAR_pageVideoId:
			return DISPLAY_NAME_pageVideoId;
		case VAR_contextIconGroup:
			return DISPLAY_NAME_contextIconGroup;
		case VAR_contextIconName:
			return DISPLAY_NAME_contextIconName;
		case VAR_contextIconCssClasses:
			return DISPLAY_NAME_contextIconCssClasses;
		case VAR_pageDescription:
			return DISPLAY_NAME_pageDescription;
		default:
			return null;
		}
	}
}
