package org.computate.smartvillageview.enus.page;


import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.computate.search.response.solr.SolrResponse;
import org.computate.search.wrap.Wrap;
import org.computate.smartvillageview.enus.config.ConfigKeys;
import org.computate.smartvillageview.enus.model.page.SitePage;
import org.computate.smartvillageview.enus.page.PageLayout;
import org.computate.vertx.search.list.SearchList;

import io.vertx.core.Promise;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

/**
 * Promise: true
 */
public class HomePage extends HomePageGen<PageLayout> {


	/**
	 * {@inheritDoc}
	 * Ignore: true
	 **/
	protected void _searchListSitePage(Promise<SearchList<SitePage>> promise) {
		SearchList<SitePage> l = new SearchList<>();
		l.q("*:*");
		l.sortDesc("courseNum_docvalues_int desc, lessonNum_docvalues_int");
		l.fq(String.format("created_docvalues_date:[* TO %s]", ZonedDateTime.now().toInstant().atOffset(ZoneOffset.UTC).format(DateTimeFormatter.ISO_DATE_TIME)));
		l.setC(SitePage.class);
		l.setStore(true);
		promise.complete(l);
	}

	protected void _pageResponse(Wrap<String> w) {
		if(searchListSitePage != null)
			w.o(JsonObject.mapFrom(searchListSitePage.getResponse()).toString());
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

	protected void _defaultFieldListVars(List<String> l) {
		Optional.ofNullable(searchListSitePage.getFields()).orElse(Arrays.asList()).forEach(varStored -> {
			String varStored2 = varStored;
			if(StringUtils.contains(varStored2, "}"))
				varStored2 = StringUtils.substringAfterLast(varStored2, "}");
			String[] parts = varStored2.split(",");
			for(String part : parts) {
				if(StringUtils.isNotBlank(part)) {
					String var = SitePage.searchVarSitePage(part);
					if(StringUtils.isNotBlank(var))
						l.add(var);
				}
			}
		});
	}

	protected void _defaultStatsVars(List<String> l) {
		Optional.ofNullable(searchListSitePage.getStatsFields()).orElse(Arrays.asList()).forEach(varIndexed -> {
			String varIndexed2 = varIndexed;
			if(StringUtils.contains(varIndexed2, "}"))
				varIndexed2 = StringUtils.substringAfterLast(varIndexed2, "}");
			String[] parts = varIndexed2.split(",");
			for(String part : parts) {
				if(StringUtils.isNotBlank(part)) {
					String var = SitePage.searchVarSitePage(part);
					if(StringUtils.isNotBlank(var))
						l.add(var);
				}
			}
		});
	}

	protected void _defaultPivotVars(List<String> l) {
		Optional.ofNullable(searchListSitePage.getFacetPivots()).orElse(Arrays.asList()).forEach(facetPivot -> {
			String facetPivot2 = facetPivot;
			if(StringUtils.contains(facetPivot2, "}"))
				facetPivot2 = StringUtils.substringAfterLast(facetPivot2, "}");
			String[] parts = facetPivot2.split(",");
			for(String part : parts) {
				if(StringUtils.isNotBlank(part)) {
					String var = SitePage.searchVarSitePage(part);
					if(StringUtils.isNotBlank(var))
						l.add(var);
				}
			}
		});
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _listSitePage(JsonArray l) {
		Optional.ofNullable(searchListSitePage).map(o -> o.getList()).orElse(Arrays.asList()).stream().map(o -> JsonObject.mapFrom(o)).forEach(o -> l.add(o));
	}

	protected void _stats(Wrap<SolrResponse.Stats> w) {
		w.o(searchListSitePage.getResponse().getStats());
	}

	protected void _facetCounts(Wrap<SolrResponse.FacetCounts> w) {
		w.o(searchListSitePage.getResponse().getFacetCounts());
	}

	protected void _sitePageCount(Wrap<Integer> w) {
		w.o(searchListSitePage == null ? 0 : searchListSitePage.size());
	}

	protected void _sitePages(Wrap<List<SitePage>> w) {
			w.o(searchListSitePage.getList());
	}

	@Override
	protected void _pageImageUri(Wrap<String> c) {
			c.o("/png/iot-node-999.png");
	}
}
