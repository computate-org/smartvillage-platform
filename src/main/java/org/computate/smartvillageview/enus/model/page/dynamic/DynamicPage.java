package org.computate.smartvillageview.enus.model.page.dynamic;

import java.time.ZoneId;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;
import org.computate.search.tool.SearchTool;
import org.computate.search.wrap.Wrap;
import org.computate.smartvillageview.enus.config.ConfigKeys;
import org.computate.smartvillageview.enus.model.html.SiteHtm;
import org.computate.smartvillageview.enus.page.PageLayout;
import org.computate.vertx.search.list.SearchList;

import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

public class DynamicPage extends DynamicPageGen<PageLayout> {

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
	protected void _htmList(Promise<SearchList<SiteHtm>> promise) {
		SearchList<SiteHtm> l = new SearchList<>();
		l.q("*:*");
		l.setC(SiteHtm.class);
		l.fq(String.format("uri_docvalues_string:%s", SearchTool.escapeQueryChars(uri)));
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
//{{#partial "htmHead"}}{{> htmHeadDynamicPage}}{{/partial}}
//{{#partial "htmTitle"}}{{> htmTitleDynamicPage}}{{/partial}}
//{{#partial "htmMeta"}}{{> htmMetaDynamicPage}}{{/partial}}
//{{#partial "htmStyle"}}{{> htmStyleDynamicPage}}{{/partial}}
//{{#partial "htmScripts"}}{{> htmScriptsDynamicPage}}{{/partial}}
//{{#partial "htmScript"}}{{> htmScriptDynamicPage}}{{/partial}}
//{{#partial "htmBodyStart"}}{{> htmBodyStartDynamicPage}}{{/partial}}
//{{#partial "htmBodyEnd"}}{{> htmBodyEndDynamicPage}}{{/partial}}
//{{#partial "htmBody"}}{{> htmBodyDynamicPage}}{{/partial}}

	protected void _htmTitle(JsonArray l) {
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
		c.o("/iot-node");
	}

	@Override
	protected void _roles(List<String> l) {
		if(siteRequest_ != null) {
			l.addAll(Stream.concat(siteRequest_.getUserResourceRoles().stream(), siteRequest_.getUserRealmRoles().stream()).distinct().collect(Collectors.toList()));
		}
	}

	@Override
	protected void _rolesRequired(List<String> l) {
		l.addAll(Optional.ofNullable(siteRequest_.getConfig().getJsonArray(ConfigKeys.AUTH_ROLES_REQUIRED + "_SiteHtm")).orElse(new JsonArray()).stream().map(o -> o.toString()).collect(Collectors.toList()));
	}

	@Override
	protected void _promiseAfter(Promise<Void> promise) {
		promise.complete();
	}

	@Override
	protected void _pageImageUri(Wrap<String> c) {
			c.o("/png/iot-node-999.png");
	}

	@Override
	protected void _contextIconGroup(Wrap<String> c) {
			c.o("duotone");
	}

	@Override
	protected void _contextIconName(Wrap<String> c) {
			c.o("router");
	}
}
