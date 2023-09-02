package org.computate.smartvillageview.enus.request;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.computate.search.wrap.Wrap;
import org.computate.vertx.api.ApiRequest;
import org.computate.vertx.model.user.ComputateSiteUser;
import org.computate.vertx.request.ComputateSiteRequest;
import org.computate.smartvillageview.enus.model.user.SiteUser;

import io.vertx.core.MultiMap;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.auth.User;
import io.vertx.ext.web.api.service.ServiceRequest;
import io.vertx.ext.web.client.WebClient;
import io.vertx.sqlclient.SqlConnection;

/**
 * Keyword: classSimpleNameSiteRequest
 * Description: Java class to store information about a given API request to use in building the responses to API and UI requests 
 */
public class SiteRequestEnUS extends SiteRequestEnUSGen<Object> implements ComputateSiteRequest, Serializable {

	private static final Pattern PATTERN_SESSION = Pattern.compile(".*vertx-web.session=(\\w+).*");

	/**
	 * {@inheritDoc}
	 * Description: The site configuration variables
	 **/
	protected void _config(Wrap<JsonObject> c) {
	}

	/**
	 * {@inheritDoc}
	 * Description: A reference to this site request itself
	 **/
	protected void _siteRequest_(Wrap<SiteRequestEnUS> c) { 
		c.o(this);
	}

	/**
	 * {@inheritDoc}
	 * Description: A Vert.x web client for making HTTP REST calls
	 **/
	protected void _webClient(Wrap<WebClient> c) { 
	}

	/**
	 * {@inheritDoc}
	 * Description: An API request object for returning information through websockets about API changes
	 **/
	protected void _apiRequest_(Wrap<ApiRequest> c) { 
	}

	/**
	 * {@inheritDoc}
	 * Description: The JSON object if passed into the request
	 **/
	protected void _jsonObject(Wrap<JsonObject> c) {
	}

	/**
	 * {@inheritDoc}
	 * Description: The Vert.x service request
	 **/
	protected void _serviceRequest(Wrap<ServiceRequest> c) {
	}

	/**
	 * {@inheritDoc}
	 * Description: The authenticated user object
	 **/
	protected void _user(Wrap<User> c) {
	}

	/**
	 * {@inheritDoc}
	 * Description: The authenticated user principal
	 **/
	protected void _userPrincipal(Wrap<JsonObject> w) {
	}

	/**
	 * {@inheritDoc}
	 * Description: The unique ID of the authenticated user in the SSO application
	 **/
	protected void _userId(Wrap<String> c) {
		if(user != null) {
			String o = user.attributes().getString("sub");
			c.o(o);
		}
	}

	/**
	 * {@inheritDoc}
	 * Description: The primary key of the user in the database
	 **/
	protected void _userKey(Wrap<Long> c) {
	}

	/**
	 * {@inheritDoc}
	 * Description: The session ID of the user's session
	 **/
	protected void _sessionId(Wrap<String> c) {
		if(serviceRequest != null) {
			String cookie = serviceRequest.getHeaders().get("Cookie");
			if(StringUtils.isNotBlank(cookie)) {
				Matcher m = PATTERN_SESSION.matcher(cookie);
				if(m.matches()) {
					c.o(m.group(1));
				}
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * Description: The session ID of the user before the user logged in
	 **/
	protected void _sessionIdBefore(Wrap<String> c) {
		if(serviceRequest != null) {
			c.o(serviceRequest.getParams().getJsonObject("cookie").getString("sessionIdBefore"));
		}
	}

	/**
	 * {@inheritDoc}
	 * Description: The username of the user
	 **/
	protected void _userName(Wrap<String> c) {
		c.o(Optional.ofNullable(user).map(u -> u.attributes()).map(a -> a.getJsonObject("accessToken")).map(a -> a.getString("preferred_username")).orElse(null));
	}

	/**
	 * {@inheritDoc}
	 * Description: The last name of the user
	 **/
	protected void _userLastName(Wrap<String> c) {
		c.o(Optional.ofNullable(user).map(u -> u.attributes()).map(a -> a.getJsonObject("accessToken")).map(a -> a.getString("family_name")).orElse(null));
	}

	/**
	 * {@inheritDoc}
	 * Description: The first name of the user
	 **/
	protected void _userFirstName(Wrap<String> c) { 
		c.o(Optional.ofNullable(user).map(u -> u.attributes()).map(a -> a.getJsonObject("accessToken")).map(a -> a.getString("given_name")).orElse(null));
	}

	/**
	 * {@inheritDoc}
	 * Description: The full name of the user
	 **/
	protected void _userFullName(Wrap<String> c) {
		c.o(Optional.ofNullable(user).map(u -> u.attributes()).map(a -> a.getJsonObject("accessToken")).map(a -> a.getString("name")).orElse(null));
	}

	/**
	 * {@inheritDoc}
	 * Description: The user email
	 **/
	protected void _userEmail(Wrap<String> c) {
		c.o(Optional.ofNullable(user).map(u -> u.attributes()).map(a -> a.getJsonObject("accessToken")).map(a -> a.getString("email")).orElse(null));
	}

	/**
	 * {@inheritDoc}
	 * Description: The user's roles within the SSO realm
	 **/
	protected void _userRealmRoles(List<String> o) {
		JsonArray roles = Optional.ofNullable(user).map(user -> user.attributes()).map(attributes -> attributes.getJsonObject("accessToken")).map(o1 -> o1.getJsonObject("realm_access")).map(o2 -> o2.getJsonArray("roles")).orElse(new JsonArray());
		roles.stream().forEach(r -> {
			addUserRealmRoles((String)r);
		});
	}

	/**
	 * {@inheritDoc}
	 * Description: The authenticated user's auth resource data
	 **/
	protected void _userResource(Wrap<JsonObject> c) {
		String authResource = config.getString("authResource");
		JsonObject o = Optional.ofNullable(user).map(user -> user.attributes()).map(p -> p.getJsonObject("resource_access")).map(o1 -> o1.getJsonObject(authResource)).orElse(new JsonObject());
		c.o(o);
	}

	/**
	 * {@inheritDoc}
	 * Description: The user's roles for the resource
	 **/
	protected void _userResourceRoles(List<String> o) {
		JsonArray roles = Optional.ofNullable(userResource).map(o2 -> o2.getJsonArray("roles")).orElse(new JsonArray());
		roles.stream().forEach(r -> {
			addUserResourceRoles((String)r);
		});
	}

	/**
	 * {@inheritDoc}
	 * Description: The site user object of the authenticated user
	 **/
	protected void _siteUser_(Wrap<SiteUser> c) { 
		if(userId != null) {
			SiteUser o = new SiteUser();
			o.setUserName(userName);
			o.setUserFirstName(userFirstName);
			o.setUserLastName(userLastName);
			o.setUserId(userId);
			c.o(o);
		}
	}

	/**
	 * Description: The request language. 
	 */
	protected void _lang(Wrap<String> w) {
		w.o("enUS");
	}

	/**
	 * Description: The primary key of object of the request
	 */
	protected void _requestPk(Wrap<Long> c) {
	}

	/**
	 * Description: The relative URI of the incoming request
	 */
	protected void _requestUri(Wrap<String> c) {
		c.o(Optional.ofNullable(serviceRequest).map(r -> r.getExtra()).map(extra -> extra.getString("uri")).orElse(null));
	}

	/**
	 * Description: The HTTP method of the incoming request
	 */
	protected void _requestMethod(Wrap<String> c) {
		c.o(Optional.ofNullable(serviceRequest).map(r -> r.getExtra()).map(extra -> extra.getString("method")).orElse(null));
	}

	/**
	 * Description: The current SQL connection if present during the request
	 */
	protected void _sqlConnection(Wrap<SqlConnection> c) {
	}

	/**
	 * Description: The request headers
	 */
	protected void _requestHeaders(Wrap<MultiMap> c) {
	}

	/**
	 * Description: Extra variables sent in the request with the var query parameter
	 */
	protected void _requestVars(Map<String, String> m) {
	}

	/**
	 * Description: A helper method to duplicate this object
	 */
	public SiteRequestEnUS copy() {
		SiteRequestEnUS o = new SiteRequestEnUS();
		o.setJsonObject(jsonObject); // for copying the original data in the request
		o.setConfig(config); // for site configuration info
		o.setWebClient(webClient); // for performing searches
		o.setServiceRequest(serviceRequest);  // for info about the original request
		o.setUser(user); // The user
		o.setUserPrincipal(userPrincipal); // The user principal
		o.setUserKey(userKey); // The user primary key
		o.setUserId(userId); // The user identifier in the authentication system
		o.setApiRequest_(apiRequest_); // The current API request information
		o.initDeepForClass();
		return o;
	}

	/**
	 * Description: An implementation method of the interface to initialize this object
	 */
	@Override
	public void initDeepForClass() {
		initDeepForClass(siteRequest_);
	}

	/**
	 * Description: An implementation of the interface to set the site request
	 */
	@Override
	public <T extends ComputateSiteRequest> void setSiteRequest_(T siteRequest) {
		this.siteRequest_ = (SiteRequestEnUS)siteRequest;
	}

	/**
	 * Description: An implementation of the interface to get the site user object
	 */
	@Override
	public <T extends ComputateSiteUser> T getSiteUser_(Class<T> clazz) {
		return (T)siteUser_;
	}

	/**
	 * Description: An implementation of the interface to set the site user object
	 */
	@Override
	public <T extends ComputateSiteUser> void setSiteUser(T siteUser_) {
		setSiteUser_((SiteUser)siteUser_);
	}
}
