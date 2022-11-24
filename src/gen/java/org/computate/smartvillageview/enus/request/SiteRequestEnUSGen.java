package org.computate.smartvillageview.enus.request;

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
import java.lang.Object;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.client.WebClient;
import io.vertx.ext.web.api.service.ServiceRequest;
import io.vertx.ext.auth.User;
import java.lang.String;
import java.lang.Long;
import io.vertx.core.json.JsonArray;
import org.computate.smartvillageview.enus.model.user.SiteUser;
import io.vertx.sqlclient.SqlConnection;
import io.vertx.core.MultiMap;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;

/**	
<ol>
0<h3>Suggestions that can generate more code for you: </h3></ol>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these SiteRequestEnUS objects in a RESTful API. 
 * </li><li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class SiteRequestEnUSGen into the class SiteRequestEnUS. 
 * </li>
 * <h3>About the SiteRequestEnUS class and it's generated class SiteRequestEnUSGen&lt;Object&gt;: </h3>extends SiteRequestEnUSGen
 * <p>
 * This Java class extends a generated Java class SiteRequestEnUSGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.request.SiteRequestEnUS">Find the class SiteRequestEnUS in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends SiteRequestEnUSGen<Object>
 * <p>This <code>class SiteRequestEnUS extends SiteRequestEnUSGen&lt;Object&gt;</code>, which means it extends a newly generated SiteRequestEnUSGen. 
 * The generated <code>class SiteRequestEnUSGen extends Object</code> which means that SiteRequestEnUS extends SiteRequestEnUSGen which extends Object. 
 * This generated inheritance is a powerful feature that allows a lot of boiler plate code to be created for you automatically while still preserving inheritance through the power of Java Generic classes. 
 * </p>
 * Api: true
 * ApiTag.enUS: true
 * ApiUri.enUS: null
 * Color: null
 * IconGroup: null
 * IconName: null
 * Indexed: true
 * {@inheritDoc}
 * <p>By adding a class comment "{@inheritDoc}", the SiteRequestEnUS class will inherit the helpful inherited class comments from the super class SiteRequestEnUSGen. 
 * </p>
 * Rows: null
 * Model: true
 * Page: true
 * SuperPage.enUS: null
 * Promise: true
 * AName.enUS: null
 * <p>
 * Delete the class SiteRequestEnUS in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.request.SiteRequestEnUS&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.request in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.request&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class SiteRequestEnUSGen<DEV> extends Object {
	protected static final Logger LOG = LoggerFactory.getLogger(SiteRequestEnUS.class);

	////////////
	// config //
	////////////


	/**	 The entity config
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject config;

	/**	<br> The entity config
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.request.SiteRequestEnUS&fq=entiteVar_enUS_indexed_string:config">Find the entity config in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _config(Wrap<JsonObject> c);

	public JsonObject getConfig() {
		return config;
	}

	public void setConfig(JsonObject config) {
		this.config = config;
	}
	@JsonIgnore
	public void setConfig(String o) {
		this.config = SiteRequestEnUS.staticSetConfig(siteRequest_, o);
	}
	public static JsonObject staticSetConfig(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected SiteRequestEnUS configInit() {
		Wrap<JsonObject> configWrap = new Wrap<JsonObject>().var("config");
		if(config == null) {
			_config(configWrap);
			setConfig(configWrap.o);
		}
		return (SiteRequestEnUS)this;
	}

	public static JsonObject staticSearchConfig(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrConfig(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqConfig(SiteRequestEnUS siteRequest_, String o) {
		return SiteRequestEnUS.staticSearchStrConfig(siteRequest_, SiteRequestEnUS.staticSearchConfig(siteRequest_, SiteRequestEnUS.staticSetConfig(siteRequest_, o)));
	}

	//////////////////
	// siteRequest_ //
	//////////////////


	/**	 The entity siteRequest_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected SiteRequestEnUS siteRequest_;

	/**	<br> The entity siteRequest_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.request.SiteRequestEnUS&fq=entiteVar_enUS_indexed_string:siteRequest_">Find the entity siteRequest_ in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _siteRequest_(Wrap<SiteRequestEnUS> c);

	public SiteRequestEnUS getSiteRequest_() {
		return siteRequest_;
	}

	public void setSiteRequest_(SiteRequestEnUS siteRequest_) {
		this.siteRequest_ = siteRequest_;
	}
	public static SiteRequestEnUS staticSetSiteRequest_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected SiteRequestEnUS siteRequest_Init() {
		Wrap<SiteRequestEnUS> siteRequest_Wrap = new Wrap<SiteRequestEnUS>().var("siteRequest_");
		if(siteRequest_ == null) {
			_siteRequest_(siteRequest_Wrap);
			setSiteRequest_(siteRequest_Wrap.o);
		}
		return (SiteRequestEnUS)this;
	}

	///////////////
	// webClient //
	///////////////


	/**	 The entity webClient
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected WebClient webClient;

	/**	<br> The entity webClient
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.request.SiteRequestEnUS&fq=entiteVar_enUS_indexed_string:webClient">Find the entity webClient in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _webClient(Wrap<WebClient> c);

	public WebClient getWebClient() {
		return webClient;
	}

	public void setWebClient(WebClient webClient) {
		this.webClient = webClient;
	}
	public static WebClient staticSetWebClient(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected SiteRequestEnUS webClientInit() {
		Wrap<WebClient> webClientWrap = new Wrap<WebClient>().var("webClient");
		if(webClient == null) {
			_webClient(webClientWrap);
			setWebClient(webClientWrap.o);
		}
		return (SiteRequestEnUS)this;
	}

	/////////////////
	// apiRequest_ //
	/////////////////


	/**	 The entity apiRequest_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected ApiRequest apiRequest_;

	/**	<br> The entity apiRequest_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.request.SiteRequestEnUS&fq=entiteVar_enUS_indexed_string:apiRequest_">Find the entity apiRequest_ in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _apiRequest_(Wrap<ApiRequest> c);

	public ApiRequest getApiRequest_() {
		return apiRequest_;
	}

	public void setApiRequest_(ApiRequest apiRequest_) {
		this.apiRequest_ = apiRequest_;
	}
	public static ApiRequest staticSetApiRequest_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected SiteRequestEnUS apiRequest_Init() {
		Wrap<ApiRequest> apiRequest_Wrap = new Wrap<ApiRequest>().var("apiRequest_");
		if(apiRequest_ == null) {
			_apiRequest_(apiRequest_Wrap);
			setApiRequest_(apiRequest_Wrap.o);
		}
		return (SiteRequestEnUS)this;
	}

	////////////////
	// jsonObject //
	////////////////


	/**	 The entity jsonObject
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject jsonObject;

	/**	<br> The entity jsonObject
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.request.SiteRequestEnUS&fq=entiteVar_enUS_indexed_string:jsonObject">Find the entity jsonObject in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _jsonObject(Wrap<JsonObject> c);

	public JsonObject getJsonObject() {
		return jsonObject;
	}

	public void setJsonObject(JsonObject jsonObject) {
		this.jsonObject = jsonObject;
	}
	@JsonIgnore
	public void setJsonObject(String o) {
		this.jsonObject = SiteRequestEnUS.staticSetJsonObject(siteRequest_, o);
	}
	public static JsonObject staticSetJsonObject(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected SiteRequestEnUS jsonObjectInit() {
		Wrap<JsonObject> jsonObjectWrap = new Wrap<JsonObject>().var("jsonObject");
		if(jsonObject == null) {
			_jsonObject(jsonObjectWrap);
			setJsonObject(jsonObjectWrap.o);
		}
		return (SiteRequestEnUS)this;
	}

	public static JsonObject staticSearchJsonObject(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrJsonObject(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJsonObject(SiteRequestEnUS siteRequest_, String o) {
		return SiteRequestEnUS.staticSearchStrJsonObject(siteRequest_, SiteRequestEnUS.staticSearchJsonObject(siteRequest_, SiteRequestEnUS.staticSetJsonObject(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.request.SiteRequestEnUS&fq=entiteVar_enUS_indexed_string:serviceRequest">Find the entity serviceRequest in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _serviceRequest(Wrap<ServiceRequest> c);

	public ServiceRequest getServiceRequest() {
		return serviceRequest;
	}

	public void setServiceRequest(ServiceRequest serviceRequest) {
		this.serviceRequest = serviceRequest;
	}
	public static ServiceRequest staticSetServiceRequest(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected SiteRequestEnUS serviceRequestInit() {
		Wrap<ServiceRequest> serviceRequestWrap = new Wrap<ServiceRequest>().var("serviceRequest");
		if(serviceRequest == null) {
			_serviceRequest(serviceRequestWrap);
			setServiceRequest(serviceRequestWrap.o);
		}
		return (SiteRequestEnUS)this;
	}

	//////////
	// user //
	//////////


	/**	 The entity user
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected User user;

	/**	<br> The entity user
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.request.SiteRequestEnUS&fq=entiteVar_enUS_indexed_string:user">Find the entity user in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _user(Wrap<User> c);

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public static User staticSetUser(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected SiteRequestEnUS userInit() {
		Wrap<User> userWrap = new Wrap<User>().var("user");
		if(user == null) {
			_user(userWrap);
			setUser(userWrap.o);
		}
		return (SiteRequestEnUS)this;
	}

	///////////////////
	// userPrincipal //
	///////////////////


	/**	 The entity userPrincipal
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject userPrincipal;

	/**	<br> The entity userPrincipal
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.request.SiteRequestEnUS&fq=entiteVar_enUS_indexed_string:userPrincipal">Find the entity userPrincipal in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _userPrincipal(Wrap<JsonObject> w);

	public JsonObject getUserPrincipal() {
		return userPrincipal;
	}

	public void setUserPrincipal(JsonObject userPrincipal) {
		this.userPrincipal = userPrincipal;
	}
	@JsonIgnore
	public void setUserPrincipal(String o) {
		this.userPrincipal = SiteRequestEnUS.staticSetUserPrincipal(siteRequest_, o);
	}
	public static JsonObject staticSetUserPrincipal(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected SiteRequestEnUS userPrincipalInit() {
		Wrap<JsonObject> userPrincipalWrap = new Wrap<JsonObject>().var("userPrincipal");
		if(userPrincipal == null) {
			_userPrincipal(userPrincipalWrap);
			setUserPrincipal(userPrincipalWrap.o);
		}
		return (SiteRequestEnUS)this;
	}

	public static JsonObject staticSearchUserPrincipal(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrUserPrincipal(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUserPrincipal(SiteRequestEnUS siteRequest_, String o) {
		return SiteRequestEnUS.staticSearchStrUserPrincipal(siteRequest_, SiteRequestEnUS.staticSearchUserPrincipal(siteRequest_, SiteRequestEnUS.staticSetUserPrincipal(siteRequest_, o)));
	}

	////////////
	// userId //
	////////////


	/**	 The entity userId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String userId;

	/**	<br> The entity userId
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.request.SiteRequestEnUS&fq=entiteVar_enUS_indexed_string:userId">Find the entity userId in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _userId(Wrap<String> c);

	public String getUserId() {
		return userId;
	}
	public void setUserId(String o) {
		this.userId = SiteRequestEnUS.staticSetUserId(siteRequest_, o);
	}
	public static String staticSetUserId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteRequestEnUS userIdInit() {
		Wrap<String> userIdWrap = new Wrap<String>().var("userId");
		if(userId == null) {
			_userId(userIdWrap);
			setUserId(userIdWrap.o);
		}
		return (SiteRequestEnUS)this;
	}

	public static String staticSearchUserId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrUserId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUserId(SiteRequestEnUS siteRequest_, String o) {
		return SiteRequestEnUS.staticSearchStrUserId(siteRequest_, SiteRequestEnUS.staticSearchUserId(siteRequest_, SiteRequestEnUS.staticSetUserId(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.request.SiteRequestEnUS&fq=entiteVar_enUS_indexed_string:userKey">Find the entity userKey in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _userKey(Wrap<Long> c);

	public Long getUserKey() {
		return userKey;
	}

	public void setUserKey(Long userKey) {
		this.userKey = userKey;
	}
	@JsonIgnore
	public void setUserKey(String o) {
		this.userKey = SiteRequestEnUS.staticSetUserKey(siteRequest_, o);
	}
	public static Long staticSetUserKey(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected SiteRequestEnUS userKeyInit() {
		Wrap<Long> userKeyWrap = new Wrap<Long>().var("userKey");
		if(userKey == null) {
			_userKey(userKeyWrap);
			setUserKey(userKeyWrap.o);
		}
		return (SiteRequestEnUS)this;
	}

	public static Long staticSearchUserKey(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrUserKey(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUserKey(SiteRequestEnUS siteRequest_, String o) {
		return SiteRequestEnUS.staticSearchStrUserKey(siteRequest_, SiteRequestEnUS.staticSearchUserKey(siteRequest_, SiteRequestEnUS.staticSetUserKey(siteRequest_, o)));
	}

	///////////////
	// sessionId //
	///////////////


	/**	 The entity sessionId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String sessionId;

	/**	<br> The entity sessionId
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.request.SiteRequestEnUS&fq=entiteVar_enUS_indexed_string:sessionId">Find the entity sessionId in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _sessionId(Wrap<String> c);

	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String o) {
		this.sessionId = SiteRequestEnUS.staticSetSessionId(siteRequest_, o);
	}
	public static String staticSetSessionId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteRequestEnUS sessionIdInit() {
		Wrap<String> sessionIdWrap = new Wrap<String>().var("sessionId");
		if(sessionId == null) {
			_sessionId(sessionIdWrap);
			setSessionId(sessionIdWrap.o);
		}
		return (SiteRequestEnUS)this;
	}

	public static String staticSearchSessionId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSessionId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSessionId(SiteRequestEnUS siteRequest_, String o) {
		return SiteRequestEnUS.staticSearchStrSessionId(siteRequest_, SiteRequestEnUS.staticSearchSessionId(siteRequest_, SiteRequestEnUS.staticSetSessionId(siteRequest_, o)));
	}

	/////////////////////
	// sessionIdBefore //
	/////////////////////


	/**	 The entity sessionIdBefore
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String sessionIdBefore;

	/**	<br> The entity sessionIdBefore
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.request.SiteRequestEnUS&fq=entiteVar_enUS_indexed_string:sessionIdBefore">Find the entity sessionIdBefore in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _sessionIdBefore(Wrap<String> c);

	public String getSessionIdBefore() {
		return sessionIdBefore;
	}
	public void setSessionIdBefore(String o) {
		this.sessionIdBefore = SiteRequestEnUS.staticSetSessionIdBefore(siteRequest_, o);
	}
	public static String staticSetSessionIdBefore(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteRequestEnUS sessionIdBeforeInit() {
		Wrap<String> sessionIdBeforeWrap = new Wrap<String>().var("sessionIdBefore");
		if(sessionIdBefore == null) {
			_sessionIdBefore(sessionIdBeforeWrap);
			setSessionIdBefore(sessionIdBeforeWrap.o);
		}
		return (SiteRequestEnUS)this;
	}

	public static String staticSearchSessionIdBefore(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSessionIdBefore(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSessionIdBefore(SiteRequestEnUS siteRequest_, String o) {
		return SiteRequestEnUS.staticSearchStrSessionIdBefore(siteRequest_, SiteRequestEnUS.staticSearchSessionIdBefore(siteRequest_, SiteRequestEnUS.staticSetSessionIdBefore(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.request.SiteRequestEnUS&fq=entiteVar_enUS_indexed_string:userName">Find the entity userName in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _userName(Wrap<String> c);

	public String getUserName() {
		return userName;
	}
	public void setUserName(String o) {
		this.userName = SiteRequestEnUS.staticSetUserName(siteRequest_, o);
	}
	public static String staticSetUserName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteRequestEnUS userNameInit() {
		Wrap<String> userNameWrap = new Wrap<String>().var("userName");
		if(userName == null) {
			_userName(userNameWrap);
			setUserName(userNameWrap.o);
		}
		return (SiteRequestEnUS)this;
	}

	public static String staticSearchUserName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrUserName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUserName(SiteRequestEnUS siteRequest_, String o) {
		return SiteRequestEnUS.staticSearchStrUserName(siteRequest_, SiteRequestEnUS.staticSearchUserName(siteRequest_, SiteRequestEnUS.staticSetUserName(siteRequest_, o)));
	}

	//////////////////
	// userLastName //
	//////////////////


	/**	 The entity userLastName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String userLastName;

	/**	<br> The entity userLastName
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.request.SiteRequestEnUS&fq=entiteVar_enUS_indexed_string:userLastName">Find the entity userLastName in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _userLastName(Wrap<String> c);

	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String o) {
		this.userLastName = SiteRequestEnUS.staticSetUserLastName(siteRequest_, o);
	}
	public static String staticSetUserLastName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteRequestEnUS userLastNameInit() {
		Wrap<String> userLastNameWrap = new Wrap<String>().var("userLastName");
		if(userLastName == null) {
			_userLastName(userLastNameWrap);
			setUserLastName(userLastNameWrap.o);
		}
		return (SiteRequestEnUS)this;
	}

	public static String staticSearchUserLastName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrUserLastName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUserLastName(SiteRequestEnUS siteRequest_, String o) {
		return SiteRequestEnUS.staticSearchStrUserLastName(siteRequest_, SiteRequestEnUS.staticSearchUserLastName(siteRequest_, SiteRequestEnUS.staticSetUserLastName(siteRequest_, o)));
	}

	///////////////////
	// userFirstName //
	///////////////////


	/**	 The entity userFirstName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String userFirstName;

	/**	<br> The entity userFirstName
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.request.SiteRequestEnUS&fq=entiteVar_enUS_indexed_string:userFirstName">Find the entity userFirstName in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _userFirstName(Wrap<String> c);

	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String o) {
		this.userFirstName = SiteRequestEnUS.staticSetUserFirstName(siteRequest_, o);
	}
	public static String staticSetUserFirstName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteRequestEnUS userFirstNameInit() {
		Wrap<String> userFirstNameWrap = new Wrap<String>().var("userFirstName");
		if(userFirstName == null) {
			_userFirstName(userFirstNameWrap);
			setUserFirstName(userFirstNameWrap.o);
		}
		return (SiteRequestEnUS)this;
	}

	public static String staticSearchUserFirstName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrUserFirstName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUserFirstName(SiteRequestEnUS siteRequest_, String o) {
		return SiteRequestEnUS.staticSearchStrUserFirstName(siteRequest_, SiteRequestEnUS.staticSearchUserFirstName(siteRequest_, SiteRequestEnUS.staticSetUserFirstName(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.request.SiteRequestEnUS&fq=entiteVar_enUS_indexed_string:userFullName">Find the entity userFullName in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _userFullName(Wrap<String> c);

	public String getUserFullName() {
		return userFullName;
	}
	public void setUserFullName(String o) {
		this.userFullName = SiteRequestEnUS.staticSetUserFullName(siteRequest_, o);
	}
	public static String staticSetUserFullName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteRequestEnUS userFullNameInit() {
		Wrap<String> userFullNameWrap = new Wrap<String>().var("userFullName");
		if(userFullName == null) {
			_userFullName(userFullNameWrap);
			setUserFullName(userFullNameWrap.o);
		}
		return (SiteRequestEnUS)this;
	}

	public static String staticSearchUserFullName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrUserFullName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUserFullName(SiteRequestEnUS siteRequest_, String o) {
		return SiteRequestEnUS.staticSearchStrUserFullName(siteRequest_, SiteRequestEnUS.staticSearchUserFullName(siteRequest_, SiteRequestEnUS.staticSetUserFullName(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.request.SiteRequestEnUS&fq=entiteVar_enUS_indexed_string:userEmail">Find the entity userEmail in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _userEmail(Wrap<String> c);

	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String o) {
		this.userEmail = SiteRequestEnUS.staticSetUserEmail(siteRequest_, o);
	}
	public static String staticSetUserEmail(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteRequestEnUS userEmailInit() {
		Wrap<String> userEmailWrap = new Wrap<String>().var("userEmail");
		if(userEmail == null) {
			_userEmail(userEmailWrap);
			setUserEmail(userEmailWrap.o);
		}
		return (SiteRequestEnUS)this;
	}

	public static String staticSearchUserEmail(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrUserEmail(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUserEmail(SiteRequestEnUS siteRequest_, String o) {
		return SiteRequestEnUS.staticSearchStrUserEmail(siteRequest_, SiteRequestEnUS.staticSearchUserEmail(siteRequest_, SiteRequestEnUS.staticSetUserEmail(siteRequest_, o)));
	}

	////////////////////
	// userRealmRoles //
	////////////////////


	/**	 The entity userRealmRoles
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> userRealmRoles = new ArrayList<String>();

	/**	<br> The entity userRealmRoles
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.request.SiteRequestEnUS&fq=entiteVar_enUS_indexed_string:userRealmRoles">Find the entity userRealmRoles in Solr</a>
	 * <br>
	 * @param o is the entity already constructed. 
	 **/
	protected abstract void _userRealmRoles(List<String> o);

	public List<String> getUserRealmRoles() {
		return userRealmRoles;
	}

	public void setUserRealmRoles(List<String> userRealmRoles) {
		this.userRealmRoles = userRealmRoles;
	}
	public static String staticSetUserRealmRoles(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public SiteRequestEnUS addUserRealmRoles(String...objects) {
		for(String o : objects) {
			addUserRealmRoles(o);
		}
		return (SiteRequestEnUS)this;
	}
	public SiteRequestEnUS addUserRealmRoles(String o) {
		if(o != null)
			this.userRealmRoles.add(o);
		return (SiteRequestEnUS)this;
	}
	@JsonIgnore
	public void setUserRealmRoles(JsonArray objects) {
		userRealmRoles.clear();
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addUserRealmRoles(o);
		}
	}
	protected SiteRequestEnUS userRealmRolesInit() {
		_userRealmRoles(userRealmRoles);
		return (SiteRequestEnUS)this;
	}

	public static String staticSearchUserRealmRoles(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrUserRealmRoles(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUserRealmRoles(SiteRequestEnUS siteRequest_, String o) {
		return SiteRequestEnUS.staticSearchStrUserRealmRoles(siteRequest_, SiteRequestEnUS.staticSearchUserRealmRoles(siteRequest_, SiteRequestEnUS.staticSetUserRealmRoles(siteRequest_, o)));
	}

	//////////////////
	// userResource //
	//////////////////


	/**	 The entity userResource
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject userResource;

	/**	<br> The entity userResource
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.request.SiteRequestEnUS&fq=entiteVar_enUS_indexed_string:userResource">Find the entity userResource in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _userResource(Wrap<JsonObject> c);

	public JsonObject getUserResource() {
		return userResource;
	}

	public void setUserResource(JsonObject userResource) {
		this.userResource = userResource;
	}
	@JsonIgnore
	public void setUserResource(String o) {
		this.userResource = SiteRequestEnUS.staticSetUserResource(siteRequest_, o);
	}
	public static JsonObject staticSetUserResource(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected SiteRequestEnUS userResourceInit() {
		Wrap<JsonObject> userResourceWrap = new Wrap<JsonObject>().var("userResource");
		if(userResource == null) {
			_userResource(userResourceWrap);
			setUserResource(userResourceWrap.o);
		}
		return (SiteRequestEnUS)this;
	}

	public static JsonObject staticSearchUserResource(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrUserResource(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUserResource(SiteRequestEnUS siteRequest_, String o) {
		return SiteRequestEnUS.staticSearchStrUserResource(siteRequest_, SiteRequestEnUS.staticSearchUserResource(siteRequest_, SiteRequestEnUS.staticSetUserResource(siteRequest_, o)));
	}

	///////////////////////
	// userResourceRoles //
	///////////////////////


	/**	 The entity userResourceRoles
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> userResourceRoles = new ArrayList<String>();

	/**	<br> The entity userResourceRoles
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.request.SiteRequestEnUS&fq=entiteVar_enUS_indexed_string:userResourceRoles">Find the entity userResourceRoles in Solr</a>
	 * <br>
	 * @param o is the entity already constructed. 
	 **/
	protected abstract void _userResourceRoles(List<String> o);

	public List<String> getUserResourceRoles() {
		return userResourceRoles;
	}

	public void setUserResourceRoles(List<String> userResourceRoles) {
		this.userResourceRoles = userResourceRoles;
	}
	public static String staticSetUserResourceRoles(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public SiteRequestEnUS addUserResourceRoles(String...objects) {
		for(String o : objects) {
			addUserResourceRoles(o);
		}
		return (SiteRequestEnUS)this;
	}
	public SiteRequestEnUS addUserResourceRoles(String o) {
		if(o != null)
			this.userResourceRoles.add(o);
		return (SiteRequestEnUS)this;
	}
	@JsonIgnore
	public void setUserResourceRoles(JsonArray objects) {
		userResourceRoles.clear();
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addUserResourceRoles(o);
		}
	}
	protected SiteRequestEnUS userResourceRolesInit() {
		_userResourceRoles(userResourceRoles);
		return (SiteRequestEnUS)this;
	}

	public static String staticSearchUserResourceRoles(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrUserResourceRoles(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUserResourceRoles(SiteRequestEnUS siteRequest_, String o) {
		return SiteRequestEnUS.staticSearchStrUserResourceRoles(siteRequest_, SiteRequestEnUS.staticSearchUserResourceRoles(siteRequest_, SiteRequestEnUS.staticSetUserResourceRoles(siteRequest_, o)));
	}

	///////////////
	// siteUser_ //
	///////////////


	/**	 The entity siteUser_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected SiteUser siteUser_;

	/**	<br> The entity siteUser_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.request.SiteRequestEnUS&fq=entiteVar_enUS_indexed_string:siteUser_">Find the entity siteUser_ in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _siteUser_(Wrap<SiteUser> c);

	public SiteUser getSiteUser_() {
		return siteUser_;
	}

	public void setSiteUser_(SiteUser siteUser_) {
		this.siteUser_ = siteUser_;
	}
	public static SiteUser staticSetSiteUser_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected SiteRequestEnUS siteUser_Init() {
		Wrap<SiteUser> siteUser_Wrap = new Wrap<SiteUser>().var("siteUser_");
		if(siteUser_ == null) {
			_siteUser_(siteUser_Wrap);
			setSiteUser_(siteUser_Wrap.o);
		}
		return (SiteRequestEnUS)this;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.request.SiteRequestEnUS&fq=entiteVar_enUS_indexed_string:lang">Find the entity lang in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _lang(Wrap<String> w);

	public String getLang() {
		return lang;
	}
	public void setLang(String o) {
		this.lang = SiteRequestEnUS.staticSetLang(siteRequest_, o);
	}
	public static String staticSetLang(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteRequestEnUS langInit() {
		Wrap<String> langWrap = new Wrap<String>().var("lang");
		if(lang == null) {
			_lang(langWrap);
			setLang(langWrap.o);
		}
		return (SiteRequestEnUS)this;
	}

	public static String staticSearchLang(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrLang(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqLang(SiteRequestEnUS siteRequest_, String o) {
		return SiteRequestEnUS.staticSearchStrLang(siteRequest_, SiteRequestEnUS.staticSearchLang(siteRequest_, SiteRequestEnUS.staticSetLang(siteRequest_, o)));
	}

	///////////////
	// requestPk //
	///////////////


	/**	 The entity requestPk
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long requestPk;

	/**	<br> The entity requestPk
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.request.SiteRequestEnUS&fq=entiteVar_enUS_indexed_string:requestPk">Find the entity requestPk in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _requestPk(Wrap<Long> c);

	public Long getRequestPk() {
		return requestPk;
	}

	public void setRequestPk(Long requestPk) {
		this.requestPk = requestPk;
	}
	@JsonIgnore
	public void setRequestPk(String o) {
		this.requestPk = SiteRequestEnUS.staticSetRequestPk(siteRequest_, o);
	}
	public static Long staticSetRequestPk(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected SiteRequestEnUS requestPkInit() {
		Wrap<Long> requestPkWrap = new Wrap<Long>().var("requestPk");
		if(requestPk == null) {
			_requestPk(requestPkWrap);
			setRequestPk(requestPkWrap.o);
		}
		return (SiteRequestEnUS)this;
	}

	public static Long staticSearchRequestPk(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrRequestPk(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqRequestPk(SiteRequestEnUS siteRequest_, String o) {
		return SiteRequestEnUS.staticSearchStrRequestPk(siteRequest_, SiteRequestEnUS.staticSearchRequestPk(siteRequest_, SiteRequestEnUS.staticSetRequestPk(siteRequest_, o)));
	}

	////////////////
	// requestUri //
	////////////////


	/**	 The entity requestUri
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String requestUri;

	/**	<br> The entity requestUri
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.request.SiteRequestEnUS&fq=entiteVar_enUS_indexed_string:requestUri">Find the entity requestUri in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _requestUri(Wrap<String> c);

	public String getRequestUri() {
		return requestUri;
	}
	public void setRequestUri(String o) {
		this.requestUri = SiteRequestEnUS.staticSetRequestUri(siteRequest_, o);
	}
	public static String staticSetRequestUri(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteRequestEnUS requestUriInit() {
		Wrap<String> requestUriWrap = new Wrap<String>().var("requestUri");
		if(requestUri == null) {
			_requestUri(requestUriWrap);
			setRequestUri(requestUriWrap.o);
		}
		return (SiteRequestEnUS)this;
	}

	public static String staticSearchRequestUri(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrRequestUri(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqRequestUri(SiteRequestEnUS siteRequest_, String o) {
		return SiteRequestEnUS.staticSearchStrRequestUri(siteRequest_, SiteRequestEnUS.staticSearchRequestUri(siteRequest_, SiteRequestEnUS.staticSetRequestUri(siteRequest_, o)));
	}

	///////////////////
	// requestMethod //
	///////////////////


	/**	 The entity requestMethod
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String requestMethod;

	/**	<br> The entity requestMethod
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.request.SiteRequestEnUS&fq=entiteVar_enUS_indexed_string:requestMethod">Find the entity requestMethod in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _requestMethod(Wrap<String> c);

	public String getRequestMethod() {
		return requestMethod;
	}
	public void setRequestMethod(String o) {
		this.requestMethod = SiteRequestEnUS.staticSetRequestMethod(siteRequest_, o);
	}
	public static String staticSetRequestMethod(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteRequestEnUS requestMethodInit() {
		Wrap<String> requestMethodWrap = new Wrap<String>().var("requestMethod");
		if(requestMethod == null) {
			_requestMethod(requestMethodWrap);
			setRequestMethod(requestMethodWrap.o);
		}
		return (SiteRequestEnUS)this;
	}

	public static String staticSearchRequestMethod(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrRequestMethod(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqRequestMethod(SiteRequestEnUS siteRequest_, String o) {
		return SiteRequestEnUS.staticSearchStrRequestMethod(siteRequest_, SiteRequestEnUS.staticSearchRequestMethod(siteRequest_, SiteRequestEnUS.staticSetRequestMethod(siteRequest_, o)));
	}

	///////////////////
	// sqlConnection //
	///////////////////


	/**	 The entity sqlConnection
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected SqlConnection sqlConnection;

	/**	<br> The entity sqlConnection
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.request.SiteRequestEnUS&fq=entiteVar_enUS_indexed_string:sqlConnection">Find the entity sqlConnection in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _sqlConnection(Wrap<SqlConnection> c);

	public SqlConnection getSqlConnection() {
		return sqlConnection;
	}

	public void setSqlConnection(SqlConnection sqlConnection) {
		this.sqlConnection = sqlConnection;
	}
	public static SqlConnection staticSetSqlConnection(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected SiteRequestEnUS sqlConnectionInit() {
		Wrap<SqlConnection> sqlConnectionWrap = new Wrap<SqlConnection>().var("sqlConnection");
		if(sqlConnection == null) {
			_sqlConnection(sqlConnectionWrap);
			setSqlConnection(sqlConnectionWrap.o);
		}
		return (SiteRequestEnUS)this;
	}

	////////////////////
	// requestHeaders //
	////////////////////


	/**	 The entity requestHeaders
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected MultiMap requestHeaders;

	/**	<br> The entity requestHeaders
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.request.SiteRequestEnUS&fq=entiteVar_enUS_indexed_string:requestHeaders">Find the entity requestHeaders in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _requestHeaders(Wrap<MultiMap> c);

	public MultiMap getRequestHeaders() {
		return requestHeaders;
	}

	public void setRequestHeaders(MultiMap requestHeaders) {
		this.requestHeaders = requestHeaders;
	}
	public static MultiMap staticSetRequestHeaders(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected SiteRequestEnUS requestHeadersInit() {
		Wrap<MultiMap> requestHeadersWrap = new Wrap<MultiMap>().var("requestHeaders");
		if(requestHeaders == null) {
			_requestHeaders(requestHeadersWrap);
			setRequestHeaders(requestHeadersWrap.o);
		}
		return (SiteRequestEnUS)this;
	}

	/////////////////
	// requestVars //
	/////////////////


	/**	 The entity requestVars
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Map<String, String> requestVars = new HashMap<String, String>();

	/**	<br> The entity requestVars
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.request.SiteRequestEnUS&fq=entiteVar_enUS_indexed_string:requestVars">Find the entity requestVars in Solr</a>
	 * <br>
	 * @param m is the entity already constructed. 
	 **/
	protected abstract void _requestVars(Map<String, String> m);

	public Map<String, String> getRequestVars() {
		return requestVars;
	}

	public void setRequestVars(Map<String, String> requestVars) {
		this.requestVars = requestVars;
	}
	public static Map<String, String> staticSetRequestVars(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected SiteRequestEnUS requestVarsInit() {
		_requestVars(requestVars);
		return (SiteRequestEnUS)this;
	}

	//////////////
	// initDeep //
	//////////////

	public SiteRequestEnUS initDeepSiteRequestEnUS(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		initDeepSiteRequestEnUS();
		return (SiteRequestEnUS)this;
	}

	public void initDeepSiteRequestEnUS() {
		initSiteRequestEnUS();
	}

	public void initSiteRequestEnUS() {
				configInit();
				siteRequest_Init();
				webClientInit();
				apiRequest_Init();
				jsonObjectInit();
				serviceRequestInit();
				userInit();
				userPrincipalInit();
				userIdInit();
				userKeyInit();
				sessionIdInit();
				sessionIdBeforeInit();
				userNameInit();
				userLastNameInit();
				userFirstNameInit();
				userFullNameInit();
				userEmailInit();
				userRealmRolesInit();
				userResourceInit();
				userResourceRolesInit();
				siteUser_Init();
				langInit();
				requestPkInit();
				requestUriInit();
				requestMethodInit();
				sqlConnectionInit();
				requestHeadersInit();
				requestVarsInit();
	}

	public void initDeepForClass(SiteRequestEnUS siteRequest_) {
		initDeepSiteRequestEnUS(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestSiteRequestEnUS(SiteRequestEnUS siteRequest_) {
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestSiteRequestEnUS(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainSiteRequestEnUS(v);
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
	public Object obtainSiteRequestEnUS(String var) {
		SiteRequestEnUS oSiteRequestEnUS = (SiteRequestEnUS)this;
		switch(var) {
			case "config":
				return oSiteRequestEnUS.config;
			case "siteRequest_":
				return oSiteRequestEnUS.siteRequest_;
			case "webClient":
				return oSiteRequestEnUS.webClient;
			case "apiRequest_":
				return oSiteRequestEnUS.apiRequest_;
			case "jsonObject":
				return oSiteRequestEnUS.jsonObject;
			case "serviceRequest":
				return oSiteRequestEnUS.serviceRequest;
			case "user":
				return oSiteRequestEnUS.user;
			case "userPrincipal":
				return oSiteRequestEnUS.userPrincipal;
			case "userId":
				return oSiteRequestEnUS.userId;
			case "userKey":
				return oSiteRequestEnUS.userKey;
			case "sessionId":
				return oSiteRequestEnUS.sessionId;
			case "sessionIdBefore":
				return oSiteRequestEnUS.sessionIdBefore;
			case "userName":
				return oSiteRequestEnUS.userName;
			case "userLastName":
				return oSiteRequestEnUS.userLastName;
			case "userFirstName":
				return oSiteRequestEnUS.userFirstName;
			case "userFullName":
				return oSiteRequestEnUS.userFullName;
			case "userEmail":
				return oSiteRequestEnUS.userEmail;
			case "userRealmRoles":
				return oSiteRequestEnUS.userRealmRoles;
			case "userResource":
				return oSiteRequestEnUS.userResource;
			case "userResourceRoles":
				return oSiteRequestEnUS.userResourceRoles;
			case "siteUser_":
				return oSiteRequestEnUS.siteUser_;
			case "lang":
				return oSiteRequestEnUS.lang;
			case "requestPk":
				return oSiteRequestEnUS.requestPk;
			case "requestUri":
				return oSiteRequestEnUS.requestUri;
			case "requestMethod":
				return oSiteRequestEnUS.requestMethod;
			case "sqlConnection":
				return oSiteRequestEnUS.sqlConnection;
			case "requestHeaders":
				return oSiteRequestEnUS.requestHeaders;
			case "requestVars":
				return oSiteRequestEnUS.requestVars;
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
				o = relateSiteRequestEnUS(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateSiteRequestEnUS(String var, Object val) {
		SiteRequestEnUS oSiteRequestEnUS = (SiteRequestEnUS)this;
		switch(var) {
			default:
				return null;
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetSiteRequestEnUS(entityVar,  siteRequest_, o);
	}
	public static Object staticSetSiteRequestEnUS(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "config":
			return SiteRequestEnUS.staticSetConfig(siteRequest_, o);
		case "jsonObject":
			return SiteRequestEnUS.staticSetJsonObject(siteRequest_, o);
		case "userPrincipal":
			return SiteRequestEnUS.staticSetUserPrincipal(siteRequest_, o);
		case "userId":
			return SiteRequestEnUS.staticSetUserId(siteRequest_, o);
		case "userKey":
			return SiteRequestEnUS.staticSetUserKey(siteRequest_, o);
		case "sessionId":
			return SiteRequestEnUS.staticSetSessionId(siteRequest_, o);
		case "sessionIdBefore":
			return SiteRequestEnUS.staticSetSessionIdBefore(siteRequest_, o);
		case "userName":
			return SiteRequestEnUS.staticSetUserName(siteRequest_, o);
		case "userLastName":
			return SiteRequestEnUS.staticSetUserLastName(siteRequest_, o);
		case "userFirstName":
			return SiteRequestEnUS.staticSetUserFirstName(siteRequest_, o);
		case "userFullName":
			return SiteRequestEnUS.staticSetUserFullName(siteRequest_, o);
		case "userEmail":
			return SiteRequestEnUS.staticSetUserEmail(siteRequest_, o);
		case "userRealmRoles":
			return SiteRequestEnUS.staticSetUserRealmRoles(siteRequest_, o);
		case "userResource":
			return SiteRequestEnUS.staticSetUserResource(siteRequest_, o);
		case "userResourceRoles":
			return SiteRequestEnUS.staticSetUserResourceRoles(siteRequest_, o);
		case "lang":
			return SiteRequestEnUS.staticSetLang(siteRequest_, o);
		case "requestPk":
			return SiteRequestEnUS.staticSetRequestPk(siteRequest_, o);
		case "requestUri":
			return SiteRequestEnUS.staticSetRequestUri(siteRequest_, o);
		case "requestMethod":
			return SiteRequestEnUS.staticSetRequestMethod(siteRequest_, o);
			default:
				return null;
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchSiteRequestEnUS(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchSiteRequestEnUS(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "config":
			return SiteRequestEnUS.staticSearchConfig(siteRequest_, (JsonObject)o);
		case "jsonObject":
			return SiteRequestEnUS.staticSearchJsonObject(siteRequest_, (JsonObject)o);
		case "userPrincipal":
			return SiteRequestEnUS.staticSearchUserPrincipal(siteRequest_, (JsonObject)o);
		case "userId":
			return SiteRequestEnUS.staticSearchUserId(siteRequest_, (String)o);
		case "userKey":
			return SiteRequestEnUS.staticSearchUserKey(siteRequest_, (Long)o);
		case "sessionId":
			return SiteRequestEnUS.staticSearchSessionId(siteRequest_, (String)o);
		case "sessionIdBefore":
			return SiteRequestEnUS.staticSearchSessionIdBefore(siteRequest_, (String)o);
		case "userName":
			return SiteRequestEnUS.staticSearchUserName(siteRequest_, (String)o);
		case "userLastName":
			return SiteRequestEnUS.staticSearchUserLastName(siteRequest_, (String)o);
		case "userFirstName":
			return SiteRequestEnUS.staticSearchUserFirstName(siteRequest_, (String)o);
		case "userFullName":
			return SiteRequestEnUS.staticSearchUserFullName(siteRequest_, (String)o);
		case "userEmail":
			return SiteRequestEnUS.staticSearchUserEmail(siteRequest_, (String)o);
		case "userRealmRoles":
			return SiteRequestEnUS.staticSearchUserRealmRoles(siteRequest_, (String)o);
		case "userResource":
			return SiteRequestEnUS.staticSearchUserResource(siteRequest_, (JsonObject)o);
		case "userResourceRoles":
			return SiteRequestEnUS.staticSearchUserResourceRoles(siteRequest_, (String)o);
		case "lang":
			return SiteRequestEnUS.staticSearchLang(siteRequest_, (String)o);
		case "requestPk":
			return SiteRequestEnUS.staticSearchRequestPk(siteRequest_, (Long)o);
		case "requestUri":
			return SiteRequestEnUS.staticSearchRequestUri(siteRequest_, (String)o);
		case "requestMethod":
			return SiteRequestEnUS.staticSearchRequestMethod(siteRequest_, (String)o);
			default:
				return null;
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrSiteRequestEnUS(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrSiteRequestEnUS(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "config":
			return SiteRequestEnUS.staticSearchStrConfig(siteRequest_, (JsonObject)o);
		case "jsonObject":
			return SiteRequestEnUS.staticSearchStrJsonObject(siteRequest_, (JsonObject)o);
		case "userPrincipal":
			return SiteRequestEnUS.staticSearchStrUserPrincipal(siteRequest_, (JsonObject)o);
		case "userId":
			return SiteRequestEnUS.staticSearchStrUserId(siteRequest_, (String)o);
		case "userKey":
			return SiteRequestEnUS.staticSearchStrUserKey(siteRequest_, (Long)o);
		case "sessionId":
			return SiteRequestEnUS.staticSearchStrSessionId(siteRequest_, (String)o);
		case "sessionIdBefore":
			return SiteRequestEnUS.staticSearchStrSessionIdBefore(siteRequest_, (String)o);
		case "userName":
			return SiteRequestEnUS.staticSearchStrUserName(siteRequest_, (String)o);
		case "userLastName":
			return SiteRequestEnUS.staticSearchStrUserLastName(siteRequest_, (String)o);
		case "userFirstName":
			return SiteRequestEnUS.staticSearchStrUserFirstName(siteRequest_, (String)o);
		case "userFullName":
			return SiteRequestEnUS.staticSearchStrUserFullName(siteRequest_, (String)o);
		case "userEmail":
			return SiteRequestEnUS.staticSearchStrUserEmail(siteRequest_, (String)o);
		case "userRealmRoles":
			return SiteRequestEnUS.staticSearchStrUserRealmRoles(siteRequest_, (String)o);
		case "userResource":
			return SiteRequestEnUS.staticSearchStrUserResource(siteRequest_, (JsonObject)o);
		case "userResourceRoles":
			return SiteRequestEnUS.staticSearchStrUserResourceRoles(siteRequest_, (String)o);
		case "lang":
			return SiteRequestEnUS.staticSearchStrLang(siteRequest_, (String)o);
		case "requestPk":
			return SiteRequestEnUS.staticSearchStrRequestPk(siteRequest_, (Long)o);
		case "requestUri":
			return SiteRequestEnUS.staticSearchStrRequestUri(siteRequest_, (String)o);
		case "requestMethod":
			return SiteRequestEnUS.staticSearchStrRequestMethod(siteRequest_, (String)o);
			default:
				return null;
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqSiteRequestEnUS(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqSiteRequestEnUS(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "config":
			return SiteRequestEnUS.staticSearchFqConfig(siteRequest_, o);
		case "jsonObject":
			return SiteRequestEnUS.staticSearchFqJsonObject(siteRequest_, o);
		case "userPrincipal":
			return SiteRequestEnUS.staticSearchFqUserPrincipal(siteRequest_, o);
		case "userId":
			return SiteRequestEnUS.staticSearchFqUserId(siteRequest_, o);
		case "userKey":
			return SiteRequestEnUS.staticSearchFqUserKey(siteRequest_, o);
		case "sessionId":
			return SiteRequestEnUS.staticSearchFqSessionId(siteRequest_, o);
		case "sessionIdBefore":
			return SiteRequestEnUS.staticSearchFqSessionIdBefore(siteRequest_, o);
		case "userName":
			return SiteRequestEnUS.staticSearchFqUserName(siteRequest_, o);
		case "userLastName":
			return SiteRequestEnUS.staticSearchFqUserLastName(siteRequest_, o);
		case "userFirstName":
			return SiteRequestEnUS.staticSearchFqUserFirstName(siteRequest_, o);
		case "userFullName":
			return SiteRequestEnUS.staticSearchFqUserFullName(siteRequest_, o);
		case "userEmail":
			return SiteRequestEnUS.staticSearchFqUserEmail(siteRequest_, o);
		case "userRealmRoles":
			return SiteRequestEnUS.staticSearchFqUserRealmRoles(siteRequest_, o);
		case "userResource":
			return SiteRequestEnUS.staticSearchFqUserResource(siteRequest_, o);
		case "userResourceRoles":
			return SiteRequestEnUS.staticSearchFqUserResourceRoles(siteRequest_, o);
		case "lang":
			return SiteRequestEnUS.staticSearchFqLang(siteRequest_, o);
		case "requestPk":
			return SiteRequestEnUS.staticSearchFqRequestPk(siteRequest_, o);
		case "requestUri":
			return SiteRequestEnUS.staticSearchFqRequestUri(siteRequest_, o);
		case "requestMethod":
			return SiteRequestEnUS.staticSearchFqRequestMethod(siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "SiteRequestEnUS";
	public static final String VAR_config = "config";
	public static final String VAR_siteRequest_ = "siteRequest_";
	public static final String VAR_webClient = "webClient";
	public static final String VAR_apiRequest_ = "apiRequest_";
	public static final String VAR_jsonObject = "jsonObject";
	public static final String VAR_serviceRequest = "serviceRequest";
	public static final String VAR_user = "user";
	public static final String VAR_userPrincipal = "userPrincipal";
	public static final String VAR_userId = "userId";
	public static final String VAR_userKey = "userKey";
	public static final String VAR_sessionId = "sessionId";
	public static final String VAR_sessionIdBefore = "sessionIdBefore";
	public static final String VAR_userName = "userName";
	public static final String VAR_userLastName = "userLastName";
	public static final String VAR_userFirstName = "userFirstName";
	public static final String VAR_userFullName = "userFullName";
	public static final String VAR_userEmail = "userEmail";
	public static final String VAR_userRealmRoles = "userRealmRoles";
	public static final String VAR_userResource = "userResource";
	public static final String VAR_userResourceRoles = "userResourceRoles";
	public static final String VAR_siteUser_ = "siteUser_";
	public static final String VAR_lang = "lang";
	public static final String VAR_requestPk = "requestPk";
	public static final String VAR_requestUri = "requestUri";
	public static final String VAR_requestMethod = "requestMethod";
	public static final String VAR_sqlConnection = "sqlConnection";
	public static final String VAR_requestHeaders = "requestHeaders";
	public static final String VAR_requestVars = "requestVars";

	public static final String DISPLAY_NAME_config = "";
	public static final String DISPLAY_NAME_siteRequest_ = "";
	public static final String DISPLAY_NAME_webClient = "";
	public static final String DISPLAY_NAME_apiRequest_ = "";
	public static final String DISPLAY_NAME_jsonObject = "";
	public static final String DISPLAY_NAME_serviceRequest = "";
	public static final String DISPLAY_NAME_user = "";
	public static final String DISPLAY_NAME_userPrincipal = "";
	public static final String DISPLAY_NAME_userId = "";
	public static final String DISPLAY_NAME_userKey = "";
	public static final String DISPLAY_NAME_sessionId = "";
	public static final String DISPLAY_NAME_sessionIdBefore = "";
	public static final String DISPLAY_NAME_userName = "";
	public static final String DISPLAY_NAME_userLastName = "";
	public static final String DISPLAY_NAME_userFirstName = "";
	public static final String DISPLAY_NAME_userFullName = "";
	public static final String DISPLAY_NAME_userEmail = "";
	public static final String DISPLAY_NAME_userRealmRoles = "";
	public static final String DISPLAY_NAME_userResource = "";
	public static final String DISPLAY_NAME_userResourceRoles = "";
	public static final String DISPLAY_NAME_siteUser_ = "";
	public static final String DISPLAY_NAME_lang = "";
	public static final String DISPLAY_NAME_requestPk = "";
	public static final String DISPLAY_NAME_requestUri = "";
	public static final String DISPLAY_NAME_requestMethod = "";
	public static final String DISPLAY_NAME_sqlConnection = "";
	public static final String DISPLAY_NAME_requestHeaders = "";
	public static final String DISPLAY_NAME_requestVars = "";

	public static String displayNameForClass(String var) {
		return SiteRequestEnUS.displayNameSiteRequestEnUS(var);
	}
	public static String displayNameSiteRequestEnUS(String var) {
		switch(var) {
		case VAR_config:
			return DISPLAY_NAME_config;
		case VAR_siteRequest_:
			return DISPLAY_NAME_siteRequest_;
		case VAR_webClient:
			return DISPLAY_NAME_webClient;
		case VAR_apiRequest_:
			return DISPLAY_NAME_apiRequest_;
		case VAR_jsonObject:
			return DISPLAY_NAME_jsonObject;
		case VAR_serviceRequest:
			return DISPLAY_NAME_serviceRequest;
		case VAR_user:
			return DISPLAY_NAME_user;
		case VAR_userPrincipal:
			return DISPLAY_NAME_userPrincipal;
		case VAR_userId:
			return DISPLAY_NAME_userId;
		case VAR_userKey:
			return DISPLAY_NAME_userKey;
		case VAR_sessionId:
			return DISPLAY_NAME_sessionId;
		case VAR_sessionIdBefore:
			return DISPLAY_NAME_sessionIdBefore;
		case VAR_userName:
			return DISPLAY_NAME_userName;
		case VAR_userLastName:
			return DISPLAY_NAME_userLastName;
		case VAR_userFirstName:
			return DISPLAY_NAME_userFirstName;
		case VAR_userFullName:
			return DISPLAY_NAME_userFullName;
		case VAR_userEmail:
			return DISPLAY_NAME_userEmail;
		case VAR_userRealmRoles:
			return DISPLAY_NAME_userRealmRoles;
		case VAR_userResource:
			return DISPLAY_NAME_userResource;
		case VAR_userResourceRoles:
			return DISPLAY_NAME_userResourceRoles;
		case VAR_siteUser_:
			return DISPLAY_NAME_siteUser_;
		case VAR_lang:
			return DISPLAY_NAME_lang;
		case VAR_requestPk:
			return DISPLAY_NAME_requestPk;
		case VAR_requestUri:
			return DISPLAY_NAME_requestUri;
		case VAR_requestMethod:
			return DISPLAY_NAME_requestMethod;
		case VAR_sqlConnection:
			return DISPLAY_NAME_sqlConnection;
		case VAR_requestHeaders:
			return DISPLAY_NAME_requestHeaders;
		case VAR_requestVars:
			return DISPLAY_NAME_requestVars;
		default:
			return null;
		}
	}
}
