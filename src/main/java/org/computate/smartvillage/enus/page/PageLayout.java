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
package org.computate.smartvillage.enus.page;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;
import org.computate.search.tool.SearchTool;
import org.computate.search.wrap.Wrap;
import org.computate.smartvillage.enus.config.ConfigKeys;
import org.computate.smartvillage.enus.page.PageLayoutGen;
import org.computate.smartvillage.enus.request.SiteRequestEnUS;
import org.computate.vertx.config.ComputateConfigKeys;

import io.vertx.core.Promise;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.api.service.ServiceRequest;


/**
 * Keyword: classSimpleNamePageLayout
 * Description: Defines variables to be used when rendering Handlebars template pages
 * Promise: true
 **/
public class PageLayout extends PageLayoutGen<Object> {

	public static DateTimeFormatter FORMATDateTimeShort = DateTimeFormatter.ofPattern("MMM d yyyy h:mm a", Locale.US);

	public static DateTimeFormatter FORMATDateShort = DateTimeFormatter.ofPattern("EEE MMM d yyyy", Locale.US);

	public static DateTimeFormatter FORMATMonthYear = DateTimeFormatter.ofPattern("MMM yyyy", Locale.US);

	public static DateTimeFormatter FORMATDateDisplay = DateTimeFormatter.ofPattern("EEEE MMMM d yyyy", Locale.US);

	public static DateTimeFormatter FORMATDateTimeDisplay = DateTimeFormatter.ofPattern("EEEE MMMM d yyyy h:mm a:ss.SSS", Locale.US);

	public static DateTimeFormatter FORMATZonedDateTimeDisplay = DateTimeFormatter.ofPattern("EEEE MMMM d yyyy H:mm:ss.SSS zz VV", Locale.US);

	public static DateTimeFormatter FORMATTimeDisplay = DateTimeFormatter.ofPattern("h:mm a", Locale.US);

	/**
	 * Ignore: true
	 * Description: The current request object
	**/
	protected void _siteRequest_(Wrap<SiteRequestEnUS> w) {
	}

	/**
	 * Description: The current request language
	 */
	protected void _lang(Wrap<String> w) {
		w.o(siteRequest_.getLang());
	}

	/**
	 * Description: The current request vars
	 */
	protected void _requestVars(Wrap<Map<String, String>> w) {
		w.o(siteRequest_.getRequestVars());
	}

	/**
	 * Description: The current Vert.x service request
	 */
	protected void _serviceRequest(Wrap<ServiceRequest> w) {
		w.o(siteRequest_.getServiceRequest());
	}

	protected void _staticBaseUrl(Wrap<String> w) {
		w.o(siteRequest_.getConfig().getString(ConfigKeys.STATIC_BASE_URL));
	}

	protected void _siteBaseUrl(Wrap<String> w) {
		w.o(siteRequest_.getConfig().getString(ConfigKeys.SITE_BASE_URL));
	}

	protected void _siteAuthUrl(Wrap<String> w) {
		w.o(siteRequest_.getConfig().getString(ConfigKeys.AUTH_URL));
	}

	protected void _siteAuthRealm(Wrap<String> w) {
		w.o(siteRequest_.getConfig().getString(ConfigKeys.AUTH_REALM));
	}

	protected void _fontAwesomeKit(Wrap<String> w) {
		w.o(siteRequest_.getConfig().getString(ConfigKeys.FONTAWESOME_KIT));
	}

	protected void _facebookGraphVersion(Wrap<String> w) {
		w.o(siteRequest_.getConfig().getString(ConfigKeys.FACEBOOK_GRAPH_VERSION));
	}

	protected void _facebookAppId(Wrap<String> w) {
		w.o(siteRequest_.getConfig().getString(ConfigKeys.FACEBOOK_APP_ID));
	}

	/**
	 * Description: The current request URI
	 */
	protected void _pageUri(Wrap<String> w) {
		w.o(Optional.ofNullable(serviceRequest).map(r -> r.getExtra()).map(e -> e.getString("uri")).orElse(null));
	}

	/**
	 * Description: The current page name
	 */
	protected void _pageId(Wrap<String> w) {
		if(pageUri != null)
			w.o(StringUtils.substringAfterLast(pageUri, "/"));
	}

	/**
	 * Description: The API request URI
	 */
	protected void _apiUri(Wrap<String> w) {
	}

	/**
	 * Description: The current request HTTP method
	 */
	protected void _pageMethod(Wrap<String> w) {
		w.o(Optional.ofNullable(serviceRequest).map(r -> r.getExtra()).map(e -> e.getString("method")).orElse(null));
	}

	/**
	 * Description: The current request parameters
	 */
	protected void _params(Wrap<JsonObject> w) {
		w.o(Optional.ofNullable(serviceRequest).map(r -> r.getParams()).orElse(new JsonObject()));
	}

	/**
	 * Description: The current user's primary key
	 */
	protected void _userKey(Wrap<Long> w) {
		w.o(siteRequest_.getUserKey());
	}

	/**
	 * Description: The current user's full name
	 */
	protected void _userFullName(Wrap<String> w) {
		w.o(siteRequest_.getUserFullName());
	}

	/**
	 * Description: The current user's username
	 */
	protected void _userName(Wrap<String> w) {
		w.o(siteRequest_.getUserName());
	}

	/**
	 * Description: The current user's email
	 */
	protected void _userEmail(Wrap<String> w) {
		w.o(siteRequest_.getUserEmail());
	}

	/**
	 * Description: The current user's email
	 */
	protected void _authClient(Wrap<JsonObject> w) {
		JsonObject config = siteRequest_.getConfig();
		w.o(config.getJsonObject(ConfigKeys.AUTH_CLIENTS).getJsonObject(config.getString(ConfigKeys.AUTH_CLIENT)));
	}

	/**
	 * Description: The logout URL
	 */
	protected void _logoutUrl(Wrap<String> w) {
		try {
		JsonObject config = siteRequest_.getConfig();
			w.o(authClient.getString(ConfigKeys.AUTH_URL) + "/realms/" + authClient.getString(ConfigKeys.AUTH_REALM) + "/protocol/openid-connect/logout?redirect_uri=" + URLEncoder.encode(config.getString(ConfigKeys.SITE_BASE_URL) + authClient.getString(ConfigKeys.AUTH_LOGOUT_URI), "UTF-8"));
		} catch (UnsupportedEncodingException ex) {
			ExceptionUtils.rethrow(ex);
		}
	}

	/**
	 * Description: A helper field for the long number 0
	 */
	protected void _long0(Wrap<Long> w) {
		w.o(0L);
	}

	/**
	 * Description: A helper field for the long number 1
	 */
	protected void _long1(Wrap<Long> w) {
		w.o(1L);
	}

	/**
	 * Description: A helper field for the integer number 0
	 */
	protected void _int0(Wrap<Integer> w) {
		w.o(0);
	}

	/**
	 * Description: A helper field for the integer number 1
	 */
	protected void _int1(Wrap<Integer> w) {
		w.o(1);
	}

	/**
	 * Ignore: true
	 * Description: A method that can be overridden at the start of the request that makes this main template be initialized with a Vert.x promise for reactive initialization
	**/
	protected void _promiseBefore(Promise<Void> promise) {
		promise.complete();
	}

	/**
	 * Description: The simple name of this Java class
	 */
	protected void _classSimpleName(Wrap<String> w) {
	}

	/**
	 * Description: The page title to override
	 */
	protected void _pageTitle(Wrap<String> w) {
	}

	/**
	 * Description: The user's roles
	 */
	protected void _roles(List<String> l) {
		if(siteRequest_ != null) {
			l.addAll(Stream.concat(siteRequest_.getUserResourceRoles().stream(), siteRequest_.getUserResourceRoles().stream()).collect(Collectors.toList()));
		}
	}

	/**
	 * Description: The required roles to access this page
	 */
	protected void _roleForWrite(List<String> l) {
		l.add(siteRequest_.getConfig().getString(ConfigKeys.AUTH_ROLE_ADMIN));
	}

	/**
	 * Description: The required roles to access this page
	 */
	protected void _roleForRead(List<String> l) {
	}

	/**
	 * Description: The admin roles required to access this page
	 */
	protected void _authRoleAdmin(List<String> l) {
		l.add(siteRequest_.getConfig().getString(ConfigKeys.AUTH_ROLE_ADMIN));
	}

	/**
	 * Description: The admin roles required to access this page
	 */
	protected void _authRoleSuperAdmin(List<String> l) {
		l.add(siteRequest_.getConfig().getString(ConfigKeys.AUTH_ROLE_SUPER_ADMIN));
	}

	protected void _stats(Wrap<SolrResponse.Stats> w) {
	}

	protected void _facetCounts(Wrap<SolrResponse.FacetCounts> w) {
	}

	/**
	 * Description: The pagination data about this request
	 */
	protected void _pagination(JsonObject pagination) {
	}

	protected void _defaultFieldListVars(List<String> l) {
	}

	protected void _defaultStatsVars(List<String> l) {
	}

	protected void _defaultPivotVars(List<String> l) {
	}

	protected void _varsQ(JsonObject vars) {
	}

	protected void _varsFq(JsonObject vars) {
	}

	protected void _varsRange(JsonObject vars) {
	}

	/**
	 * Description: The query data about this request
	 */
	protected void _query(JsonObject query) {
	}

	protected void _pageResponse(Wrap<String> w) {
	}

	protected void _defaultZoneId(Wrap<String> w) {
		w.o(Optional.ofNullable(siteRequest_.getRequestVars().get(VAR_defaultZoneId)).orElse(siteRequest_.getConfig().getString(ComputateConfigKeys.SITE_ZONE)));
	}

	/**
	 * Ignore: true
	 **/
	protected void _defaultTimeZone(Wrap<ZoneId> w) {
		w.o(ZoneId.of(defaultZoneId));
	}

	protected void _defaultLocaleId(Wrap<String> w) {
		w.o(Optional.ofNullable(siteRequest_.getRequestHeaders().get("Accept-Language")).map(acceptLanguage -> StringUtils.substringBefore(acceptLanguage, ",")).orElse(siteRequest_.getConfig().getString(ComputateConfigKeys.SITE_LOCALE)));
	}

	protected void _rows(Wrap<Long> w) {
	}

	protected void _start(Wrap<Long> w) {
	}

	/**
	 * Ignore: true
	 **/
	protected void _defaultLocale(Wrap<Locale> w) {
		w.o(Locale.forLanguageTag(defaultLocaleId));
	}

	protected void _rangeGap(Wrap<String> w) {
	}

	protected void _rangeEnd(Wrap<ZonedDateTime> w) {
	}

	protected void _rangeStart(Wrap<ZonedDateTime> w) {
	}

	protected void _defaultRangeStats(Wrap<JsonObject> w) {
	}

	protected void _defaultRangeGap(Wrap<String> w) {
	}

	protected void _defaultRangeEnd(Wrap<ZonedDateTime> w) {
	}

	protected void _defaultRangeStart(Wrap<ZonedDateTime> w) {
	}

	protected void _defaultRangeVar(Wrap<String> w) {
	}

	protected void _defaultFacetSort(Wrap<String> w) {
	}

	protected void _defaultFacetLimit(Wrap<Integer> w) {
	}

	protected void _defaultFacetMinCount(Wrap<Integer> w) {
	}

	protected void _defaultPivotMinCount(Wrap<Integer> w) {
	}

	protected void _DEFAULT_MAP_LOCATION(Wrap<JsonObject> w) {
	}

	protected void _DEFAULT_MAP_ZOOM(Wrap<BigDecimal> w) {
	}

	/**
	 * Description: The query String for this request
	 */
	protected void _queryStr(Wrap<String> w) {
		ServiceRequest serviceRequest = siteRequest_.getServiceRequest();
		JsonObject params = serviceRequest.getParams();
		List<String> paramList = new ArrayList<>();

		JsonObject queryParams = Optional.ofNullable(serviceRequest).map(ServiceRequest::getParams).map(or -> or.getJsonObject("query")).orElse(new JsonObject());
		for(String paramName : queryParams.fieldNames()) {
			Object paramObjectValues = queryParams.getValue(paramName);
			JsonArray paramObjects = paramObjectValues instanceof JsonArray ? (JsonArray)paramObjectValues : new JsonArray().add(paramObjectValues);

			try {
				for(Object paramObject : paramObjects) {
					if(paramObject != null)
						paramList.add(String.format("%s=%s", paramName, SearchTool.urlEncode(paramObject.toString())));
				}
			} catch(Exception e) {
				ExceptionUtils.rethrow(e);
			}
		}
		if(params.size() == 0)
			w.o("");
		else
			w.o(String.format("?%s", StringUtils.join(paramList, "&")));
	}

	/**
	 * Ignore: true
	 * Description: A method that can be overridden at the end of the request that makes this main template be initialized with a Vert.x promise for reactive initialization
	**/
	protected void _promiseAfter(Promise<Void> promise) {
		promise.complete();
	}

	/**
	 * Description: The image URI for this page
	 */
	protected void _pageImageUri(Wrap<String> w) {
	}

	/**
	 * Description: The image width
	 */
	protected void _pageImageWidth(Wrap<Integer> c) {
	}

	/**
	 * Description: The image height
	 */
	protected void _pageImageHeight(Wrap<Integer> c) {
	}

	/**
	 * Description: The video ID for this page
	 */
	protected void _pageVideoId(Wrap<String> c) {
	}

	/**
	 * Description: The icon group for this page
	 */
	protected void _classIconGroup(Wrap<String> w) {
	}

	/**
	 * Description: The icon name for this page
	 */
	protected void _classIconName(Wrap<String> w) {
	}

	/**
	 * Description: The icon CSS classes for this page
	 */
	protected void _classIconCssClasses(Wrap<String> w) {
		if(classIconGroup != null && classIconName != null) {
			w.o(String.format("fa-%s fa-%s ", classIconGroup, classIconName));
		}
	}

	/**
	 * Description: An optional description field for the page
	 */
	protected void _pageDescription(Wrap<String> w) {
	}
}
