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
package org.computate.smartvillageview.enus.page.dynamic;

import java.net.URLDecoder;
import java.time.ZoneId;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.tool.SearchTool;
import org.computate.search.wrap.Wrap;
import org.computate.smartvillageview.enus.config.ConfigKeys;
import org.computate.smartvillageview.enus.model.htm.SiteHtm;
import org.computate.smartvillageview.enus.page.PageLayout;
import org.computate.vertx.search.list.SearchList;

import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.api.service.ServiceRequest;


/**
 * Promise: true
 */
public class DynamicPage extends DynamicPageGen<PageLayout> {

	/**
	 * {@inheritDoc}
	 **/
	protected void _page(Wrap<JsonObject> w) {
	}

	/**
	 * {@inheritDoc}
	 * Ignore: true
	 **/
	protected void _url(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * Ignore: true
	 **/
	protected void _uri(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * Ignore: true
	 **/
	protected void _pageId(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * Ignore: true
	 **/
	protected void _vars(Wrap<Map<String, String>> w) {
		ServiceRequest serviceRequest = siteRequest_.getServiceRequest();
		Map<String, String> requestVars = siteRequest_.getRequestVars();

		serviceRequest.getParams().getJsonObject("query").stream().filter(paramRequest -> "var".equals(paramRequest.getKey()) && paramRequest.getValue() != null).findFirst().ifPresent(paramRequest -> {
			String entityVar = null;
			String valueIndexed = null;
			Object paramValuesObject = paramRequest.getValue();
			JsonArray paramObjects = paramValuesObject instanceof JsonArray ? (JsonArray)paramValuesObject : new JsonArray().add(paramValuesObject);

			try {
				for(Object paramObject : paramObjects) {
					entityVar = StringUtils.trim(StringUtils.substringBefore((String)paramObject, ":"));
					valueIndexed = URLDecoder.decode(StringUtils.trim(StringUtils.substringAfter((String)paramObject, ":")), "UTF-8");
					requestVars.put(entityVar, valueIndexed);
				}
			} catch(Exception ex) {
				LOG.error(String.format("searchSiteHtm failed. "), ex);
				ExceptionUtils.rethrow(ex);
			}
		});
		w.o(requestVars);
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _filterLabel(Wrap<String> w) {
		w.o(vars.get("filterLabel"));
	}

	/**
	 * {@inheritDoc}
	 * Ignore: true
	 **/
	protected void _htmList(Promise<SearchList<SiteHtm>> promise) {
		SearchList<SiteHtm> l = new SearchList<>();
		l.q("*:*");
		l.setC(SiteHtm.class);
		l.fq(String.format("url_docvalues_string:%s", SearchTool.escapeQueryChars(url)));
		if(filterLabel != null)
			l.fq(String.format("labels_docvalues_strings:%s", SearchTool.escapeQueryChars(filterLabel)));
		l.sortAsc("sequenceNum_docvalues_long");
		l.setStore(true);
		promise.complete(l);
	}

	/**
	 * Val.Complete.enUS:Site HTML search list succeeded. 
	 * Val.Fail.enUS:Site HTML search list failed. 
	 */
	@Override
	protected Future<SearchList<SiteHtm>> htmListPromise() {
		Promise<SearchList<SiteHtm>> promise = Promise.promise();
		super.htmListPromise().onComplete(a -> {
			htmListLoop().onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				LOG.error(htmListPromiseFail, ex);
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			LOG.error(htmListPromiseFail, ex);
			promise.fail(ex);
		});
		return promise.future();
	}


	/**
	 * Val.Complete.enUS:Loop site HTML search list succeeded. 
	 * Val.Fail.enUS:Loop site HTML search list failed. 
	 */
	public Future<Void> htmListLoop() {
		Promise<Void> promise = Promise.promise();

		try {
			for(SiteHtm htm : htmList.getList()) {
				String htmGroup = htm.getHtmGroup();
				if(htmGroup != null) {
					Object o = obtainForClass(htmGroup);
					if(o instanceof JsonArray) {
						JsonArray list = (JsonArray)o;
						list.add(JsonObject.mapFrom(htm));
					}
				}
			}
	
			htmList.next().onSuccess(loop -> {
				if(loop) {
					htmListLoop().onSuccess(a -> {
						promise.complete();
					}).onFailure(ex -> {
						LOG.error(htmListLoopFail, ex);
						promise.fail(ex);
					});
				} else {
					promise.complete();
				}
			}).onFailure(ex -> {
				LOG.error(htmListLoopFail, ex);
				promise.fail(ex);
			});
		} catch(Exception ex) {
			LOG.error(htmListLoopFail, ex);
			promise.fail(ex);
		}
		return promise.future();	
	}

	protected void _htmTitle(JsonArray l) {
	}

	protected void _htmMeta(JsonArray l) {
	}

	protected void _htmBody(JsonArray l) {
	}

	protected void _pageResponse(Wrap<String> w) {
	}

	protected void _defaultZoneId(Wrap<String> w) {
		w.o(Optional.ofNullable(siteRequest_.getRequestVars().get(VAR_defaultZoneId)).orElse(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE)));
	}

	/**
	 * Ignore: true
	 **/
	protected void _defaultTimeZone(Wrap<ZoneId> w) {
		w.o(ZoneId.of(defaultZoneId));
	}

	protected void _defaultLocaleId(Wrap<String> w) {
		w.o(Optional.ofNullable(siteRequest_.getRequestHeaders().get("Accept-Language")).map(acceptLanguage -> StringUtils.substringBefore(acceptLanguage, ",")).orElse(siteRequest_.getConfig().getString(ConfigKeys.SITE_LOCALE)));
	}

	/**
	 * Ignore: true
	 **/
	protected void _defaultLocale(Wrap<Locale> w) {
		w.o(Locale.forLanguageTag(defaultLocaleId));
	}

	@Override
	protected void _pageTitle(Wrap<String> c) {
	}

	@Override
	protected void _pageUri(Wrap<String> c) {
		c.o(uri);
	}

	@Override
	protected void _roles(List<String> l) {
		if(siteRequest_ != null) {
			l.addAll(Stream.concat(siteRequest_.getUserResourceRoles().stream(), siteRequest_.getUserRealmRoles().stream()).distinct().collect(Collectors.toList()));
		}
	}

	@Override
	protected void _roleForWrite(List<String> l) {
		l.add(siteRequest_.getConfig().getString(ConfigKeys.AUTH_ROLE_REQUIRED + "_SiteHtm"));
	}

	@Override
	protected void _promiseAfter(Promise<Void> promise) {
		promise.complete();
	}

	@Override
	protected void _pageImageUri(Wrap<String> c) {
	}

	@Override
	protected void _classIconGroup(Wrap<String> c) {
			c.o("duotone");
	}

	@Override
	protected void _classIconName(Wrap<String> c) {
			c.o("router");
	}
}
