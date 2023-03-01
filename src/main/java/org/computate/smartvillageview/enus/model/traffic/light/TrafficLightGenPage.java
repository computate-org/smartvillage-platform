package org.computate.smartvillageview.enus.model.traffic.light;

import org.computate.smartvillageview.enus.page.PageLayout;
import org.computate.smartvillageview.enus.result.map.MapResultPage;
import org.computate.smartvillageview.enus.request.SiteRequestEnUS;
import org.computate.smartvillageview.enus.model.user.SiteUser;
import java.io.IOException;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import org.computate.vertx.search.list.SearchList;
import org.computate.search.wrap.Wrap;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.Duration;
import java.time.Instant;
import java.util.Locale;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.api.service.ServiceRequest;
import io.vertx.core.json.JsonArray;
import java.net.URLDecoder;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.lang3.StringUtils;
import java.util.Map;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.math.MathContext;
import java.util.Objects;
import io.vertx.core.Promise;
import org.computate.smartvillageview.enus.config.ConfigKeys;
import org.computate.search.response.solr.SolrResponse;
import java.util.HashMap;
import org.computate.search.tool.TimeTool;
import java.time.ZoneId;


/**
 * Translate: false
 **/
public class TrafficLightGenPage extends TrafficLightGenPageGen<MapResultPage> {

	/**
	 * {@inheritDoc}
	 * Ignore: true
	 **/
	protected void _searchListTrafficLight_(Wrap<SearchList<TrafficLight>> w) {
	}

	@Override
	protected void _pageResponse(Wrap<String> w) {
		if(searchListTrafficLight_ != null)
			w.o(JsonObject.mapFrom(searchListTrafficLight_.getResponse()).toString());
	}

	@Override
	protected void _stats(Wrap<SolrResponse.Stats> w) {
		w.o(searchListTrafficLight_.getResponse().getStats());
	}

	@Override
	protected void _facetCounts(Wrap<SolrResponse.FacetCounts> w) {
		w.o(searchListTrafficLight_.getResponse().getFacetCounts());
	}

	@Override
	protected void _pagination(JsonObject pagination) {
		JsonArray pages = new JsonArray();
		Long start = searchListTrafficLight_.getStart().longValue();
		Long rows = searchListTrafficLight_.getRows().longValue();
		Long foundNum = searchListTrafficLight_.getResponse().getResponse().getNumFound().longValue();
		Long startNum = start + 1L;
		Long endNum = start + rows;
		Long floorMod = (rows == 0L ? 0L : Math.floorMod(foundNum, rows));
		Long last = (rows == 0L ? 0L : Math.floorDiv(foundNum, rows) - (floorMod.equals(0L) ? 1L : 0L) * rows);
		endNum = endNum < foundNum ? endNum : foundNum;
		startNum = foundNum == 0L ? 0L : startNum;
		Long paginationStart = start - 10L * rows;
		if(paginationStart < 0L)
			paginationStart = 0L;
		Long paginationEnd = start + 10L * rows;
		if(paginationEnd > foundNum)
			paginationEnd = foundNum;

		pagination.put("1L", 1L);
		pagination.put("0L", 0L);
		pagination.put("start", start);
		pagination.put("rows", rows);
		pagination.put("rowsPrevious", rows / 2);
		pagination.put("rowsNext", rows * 2);
		pagination.put("startNum", startNum);
		pagination.put("endNum", endNum);
		pagination.put("foundNum", foundNum);
		pagination.put("pageStart", new JsonObject().put("start", 0L).put("pageNumber", 1L));
		if(start > 0L)
			pagination.put("pagePrevious", new JsonObject().put("start", start - rows).put("pageNumber", start - rows + 1L));
		if(start + rows < foundNum)
			pagination.put("pageNext", new JsonObject().put("start", start + rows).put("pageNumber", start + rows + 1L));
		pagination.put("pageEnd", new JsonObject().put("start", last).put("pageNumber", last + 1L));
		pagination.put("pages", pages);
		for(Long i = paginationStart; i < paginationEnd; i += rows) {
			Long pageNumber = Math.floorDiv(i, rows) + 1L;
			JsonObject page = new JsonObject();
			page.put("pageNumber", pageNumber);
			page.put("currentPage", start.equals(i));
			page.put("start", i);
			pages.add(page);
		}
	}

	@Override
	protected void _varsQ(JsonObject vars) {
		TrafficLight.varsQForClass().forEach(var -> {
			JsonObject json = new JsonObject();
			json.put("var", var);
			json.put("displayName", Optional.ofNullable(TrafficLight.displayNameTrafficLight(var)).map(d -> StringUtils.isBlank(d) ? var : d).orElse(var));
			json.put("classSimpleName", Optional.ofNullable(TrafficLight.classSimpleNameTrafficLight(var)).map(d -> StringUtils.isBlank(d) ? var : d).orElse(var));
			json.put("val", Optional.ofNullable(searchListTrafficLight_.getRequest().getQuery()).filter(fq -> fq.startsWith(TrafficLight.varIndexedTrafficLight(var) + ":")).map(s -> StringUtils.substringAfter(s, ":")).orElse(null));
			vars.put(var, json);
		});
	}

	@Override
	protected void _varsFq(JsonObject vars) {
		Map<String, SolrResponse.FacetField> facetFields = Optional.ofNullable(facetCounts).map(c -> c.getFacetFields()).map(f -> f.getFacets()).orElse(new HashMap<String,SolrResponse.FacetField>());
		TrafficLight.varsFqForClass().forEach(var -> {
			String varIndexed = TrafficLight.varIndexedTrafficLight(var);
			String varStored = TrafficLight.varStoredTrafficLight(var);
			JsonObject json = new JsonObject();
			json.put("var", var);
			json.put("varStored", varStored);
			json.put("varIndexed", varIndexed);
			String type = StringUtils.substringAfterLast(varIndexed, "_");
			json.put("displayName", Optional.ofNullable(TrafficLight.displayNameTrafficLight(var)).map(d -> StringUtils.isBlank(d) ? var : d).orElse(var));
			json.put("classSimpleName", Optional.ofNullable(TrafficLight.classSimpleNameTrafficLight(var)).map(d -> StringUtils.isBlank(d) ? var : d).orElse(var));
			json.put("val", searchListTrafficLight_.getRequest().getFilterQueries().stream().filter(fq -> fq.startsWith(TrafficLight.varIndexedTrafficLight(var) + ":")).findFirst().map(s -> StringUtils.substringAfter(s, ":")).orElse(null));
			Optional.ofNullable(stats).map(s -> s.get(varIndexed)).ifPresent(stat -> {
				json.put("stats", JsonObject.mapFrom(stat));
			});
			Optional.ofNullable(facetFields.get(varIndexed)).ifPresent(facetField -> {
				JsonObject facetJson = new JsonObject();
				JsonObject counts = new JsonObject();
				facetJson.put("var", var);
				facetField.getCounts().forEach((val, count) -> {
					counts.put(val, count);
				});
				facetJson.put("counts", counts);
				json.put("facetField", facetJson);
			});
			if(defaultFieldListVars.contains(var)) {
				json.put("fieldList", true);
			}
			if(StringUtils.equalsAny(type, "date") && json.containsKey("stats")) {
				JsonObject stats = json.getJsonObject("stats");
				Instant min = Optional.ofNullable(stats.getString("min")).map(val -> Instant.parse(val.toString())).orElse(Instant.now());
				Instant max = Optional.ofNullable(stats.getString("max")).map(val -> Instant.parse(val.toString())).orElse(Instant.now());
				if(min.equals(max)) {
					min = min.minus(1, ChronoUnit.DAYS);
					max = max.plus(2, ChronoUnit.DAYS);
				}
				Duration duration = Duration.between(min, max);
				String gap = "DAY";
				if(duration.toDays() >= 365)
					gap = "YEAR";
				else if(duration.toDays() >= 28)
					gap = "MONTH";
				else if(duration.toDays() >= 1)
					gap = "DAY";
				else if(duration.toHours() >= 1)
					gap = "HOUR";
				else if(duration.toMinutes() >= 1)
					gap = "MINUTE";
				else if(duration.toMillis() >= 1000)
					gap = "SECOND";
				else if(duration.toMillis() >= 1)
					gap = "MILLI";
				json.put("defaultRangeGap", String.format("+1%s", gap));
				json.put("defaultRangeEnd", max.toString());
				json.put("defaultRangeStart", min.toString());
				json.put("enableCalendar", true);
				setDefaultRangeStats(json);
			}
			json.put("enableStats", !StringUtils.equalsAny(type, "boolean", "location"));
			if(defaultStatsVars.contains(var)) {
				SolrResponse.StatsField varStats = stats.get(varIndexed);
				if(varStats != null)
					json.put("stats", varStats);
			}
			if(defaultPivotVars.contains(var)) {
				json.put("pivot", true);
			}
			vars.put(var, json);
		});
	}

	@Override
	protected void _varsRange(JsonObject vars) {
		TrafficLight.varsRangeForClass().forEach(var -> {
			String varIndexed = TrafficLight.varIndexedTrafficLight(var);
			JsonObject json = new JsonObject();
			json.put("var", var);
			json.put("displayName", Optional.ofNullable(TrafficLight.displayNameTrafficLight(var)).map(d -> StringUtils.isBlank(d) ? var : d).orElse(var));
			json.put("classSimpleName", Optional.ofNullable(TrafficLight.classSimpleNameTrafficLight(var)).map(d -> StringUtils.isBlank(d) ? var : d).orElse(var));
			json.put("val", searchListTrafficLight_.getRequest().getFilterQueries().stream().filter(fq -> fq.startsWith(TrafficLight.varIndexedTrafficLight(var) + ":")).findFirst().map(s -> StringUtils.substringAfter(s, ":")).orElse(null));
			vars.put(var, json);
		});
	}

	@Override
	protected void _query(JsonObject query) {
		ServiceRequest serviceRequest = siteRequest_.getServiceRequest();
		JsonObject params = serviceRequest.getParams();

		JsonObject queryParams = Optional.ofNullable(serviceRequest).map(ServiceRequest::getParams).map(or -> or.getJsonObject("query")).orElse(new JsonObject());
		Long num = searchListTrafficLight_.getResponse().getResponse().getNumFound().longValue();
		String q = "*:*";
		String q1 = "objectText";
		String q2 = "";
		for(String paramName : queryParams.fieldNames()) {
			String entityVar = null;
			String valueIndexed = null;
			Object paramObjectValues = queryParams.getValue(paramName);
			JsonArray paramObjects = paramObjectValues instanceof JsonArray ? (JsonArray)paramObjectValues : new JsonArray().add(paramObjectValues);

			try {
				for(Object paramObject : paramObjects) {
					switch(paramName) {
					case "q":
						q = (String)paramObject;
						entityVar = StringUtils.trim(StringUtils.substringBefore((String)paramObject, ":"));
						valueIndexed = URLDecoder.decode(StringUtils.trim(StringUtils.substringAfter((String)paramObject, ":")), "UTF-8");
						q1 = entityVar.equals("*") ? q1 : entityVar;
						q2 = valueIndexed;
						q = q1 + ":" + q2;
					}
				}
			} catch(Exception e) {
				ExceptionUtils.rethrow(e);
			}
		}
		query.put("q", q);

		Long rows1 = Optional.ofNullable(searchListTrafficLight_).map(l -> l.getRows()).orElse(10L);
		Long start1 = Optional.ofNullable(searchListTrafficLight_).map(l -> l.getStart()).orElse(1L);
		Long start2 = start1 - rows1;
		Long start3 = start1 + rows1;
		Long rows2 = rows1 / 2;
		Long rows3 = rows1 * 2;
		start2 = start2 < 0 ? 0 : start2;
		JsonObject fqs = new JsonObject();
		for(String fq : Optional.ofNullable(searchListTrafficLight_).map(l -> l.getFilterQueries()).orElse(Arrays.asList())) {
			if(!StringUtils.contains(fq, "(")) {
				String fq1 = TrafficLight.searchVarTrafficLight(StringUtils.substringBefore(fq, ":"));
				String fq2 = StringUtils.substringAfter(fq, ":");
				if(!StringUtils.startsWithAny(fq, "classCanonicalNames_", "archived_", "deleted_", "sessionId", "userKeys"))
					fqs.put(fq1, new JsonObject().put("var", fq1).put("val", fq2).put("displayName", TrafficLight.displayNameForClass(fq1)));
				}
			}
		query.put("fq", fqs);

		JsonArray sorts = new JsonArray();
		for(String sort : Optional.ofNullable(searchListTrafficLight_).map(l -> l.getSorts()).orElse(Arrays.asList())) {
			String sort1 = TrafficLight.searchVarTrafficLight(StringUtils.substringBefore(sort, " "));
			sorts.add(new JsonObject().put("var", sort1).put("order", StringUtils.substringAfter(sort, " ")).put("displayName", TrafficLight.displayNameForClass(sort1)));
		}
		query.put("sort", sorts);
	}

	@Override
	protected void _defaultZoneId(Wrap<String> w) {
		w.o(Optional.ofNullable(siteRequest_.getRequestVars().get(VAR_defaultZoneId)).orElse(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE)));
	}

	/**
	 * Ignore: true
	 **/
	@Override
	protected void _defaultTimeZone(Wrap<ZoneId> w) {
		w.o(ZoneId.of(defaultZoneId));
	}

	@Override
	protected void _defaultLocaleId(Wrap<String> w) {
		w.o(Optional.ofNullable(siteRequest_.getRequestHeaders().get("Accept-Language")).map(acceptLanguage -> StringUtils.substringBefore(acceptLanguage, ",")).orElse(siteRequest_.getConfig().getString(ConfigKeys.SITE_LOCALE)));
	}

	/**
	 * Ignore: true
	 **/
	@Override
	protected void _defaultLocale(Wrap<Locale> w) {
		w.o(Locale.forLanguageTag(defaultLocaleId));
	}

	@Override
	protected void _rangeGap(Wrap<String> w) {
		if(serviceRequest.getParams().getJsonObject("query").getString("facet.range.gap", null) != null)
			w.o(Optional.ofNullable(searchListTrafficLight_.getFacetRangeGap()).orElse(null));
	}

	@Override
	protected void _rangeEnd(Wrap<ZonedDateTime> w) {
		if(serviceRequest.getParams().getJsonObject("query").getString("facet.range.end", null) != null)
			w.o(Optional.ofNullable(searchListTrafficLight_.getFacetRangeEnd()).map(s -> TimeTool.parseZonedDateTime(defaultTimeZone, s)).orElse(null));
	}

	@Override
	protected void _rangeStart(Wrap<ZonedDateTime> w) {
		if(serviceRequest.getParams().getJsonObject("query").getString("facet.range.start", null) != null)
			w.o(Optional.ofNullable(searchListTrafficLight_.getFacetRangeStart()).map(s -> TimeTool.parseZonedDateTime(defaultTimeZone, s)).orElse(null));
	}

	@Override
	protected void _defaultRangeGap(Wrap<String> w) {
		w.o(Optional.ofNullable(rangeGap).orElse(Optional.ofNullable(defaultRangeStats).map(s -> s.getString("defaultRangeGap")).orElse("+1DAY")));
	}

	@Override
	protected void _defaultRangeEnd(Wrap<ZonedDateTime> w) {
		w.o(Optional.ofNullable(rangeEnd).orElse(Optional.ofNullable(defaultRangeStats).map(s -> Instant.parse(s.getString("defaultRangeEnd")).atZone(defaultTimeZone)).orElse(ZonedDateTime.now(defaultTimeZone).toLocalDate().atStartOfDay(defaultTimeZone).plusDays(1))));
	}

	@Override
	protected void _defaultRangeStart(Wrap<ZonedDateTime> w) {
		w.o(Optional.ofNullable(rangeStart).orElse(Optional.ofNullable(defaultRangeStats).map(s -> Instant.parse(s.getString("defaultRangeStart")).atZone(defaultTimeZone)).orElse(defaultRangeEnd.minusDays(7).toLocalDate().atStartOfDay(defaultTimeZone))));
	}

	@Override
	protected void _defaultRangeVar(Wrap<String> w) {
		w.o(Optional.ofNullable(searchListTrafficLight_.getFacetRanges()).orElse(Optional.ofNullable(defaultRangeStats).map(s -> Arrays.asList(s.getString("defaultRangeVar"))).orElse(Arrays.asList())).stream().findFirst().map(v -> { if(v.contains("}")) return StringUtils.substringBefore(StringUtils.substringAfterLast(v, "}"), "_"); else return TrafficLight.searchVarTrafficLight(v); }).orElse("created"));
	}

	@Override
	protected void _defaultFacetSort(Wrap<String> w) {
		w.o(Optional.ofNullable(searchListTrafficLight_.getFacetSort()).orElse("index"));
	}

	@Override
	protected void _defaultFacetLimit(Wrap<Integer> w) {
		w.o(Optional.ofNullable(searchListTrafficLight_.getFacetLimit()).orElse(1));
	}

	@Override
	protected void _defaultFacetMinCount(Wrap<Integer> w) {
		w.o(Optional.ofNullable(searchListTrafficLight_.getFacetMinCount()).orElse(1));
	}

	@Override
	protected void _defaultPivotMinCount(Wrap<Integer> w) {
		w.o(Optional.ofNullable(searchListTrafficLight_.getFacetPivotMinCount()).orElse(0));
	}

	@Override
	protected void _DEFAULT_MAP_LOCATION(Wrap<JsonObject> w) {
		String pointStr = Optional.ofNullable(siteRequest_.getRequestVars().get(VAR_DEFAULT_MAP_LOCATION)).orElse(siteRequest_.getConfig().getString(ConfigKeys.DEFAULT_MAP_LOCATION));
		if(pointStr != null) {
			String[] parts = pointStr.replace("[", "").replace("]", "").replace("\"", "").split(",");
			JsonObject point = new JsonObject().put("lat", Double.parseDouble(parts[0])).put("lon", Double.parseDouble(parts[1]));
			w.o(point);
		}
	}

	@Override
	protected void _DEFAULT_MAP_ZOOM(Wrap<BigDecimal> w) {
		String s = Optional.ofNullable(siteRequest_.getRequestVars().get(VAR_DEFAULT_MAP_ZOOM)).orElse(siteRequest_.getConfig().getString(ConfigKeys.DEFAULT_MAP_ZOOM));
		if(s != null)
			w.o(new BigDecimal(s));
	}

	@Override
	protected void _defaultFieldListVars(List<String> l) {
		Optional.ofNullable(searchListTrafficLight_.getFields()).orElse(Arrays.asList()).forEach(varStored -> {
			String varStored2 = varStored;
			if(StringUtils.contains(varStored2, "}"))
				varStored2 = StringUtils.substringAfterLast(varStored2, "}");
			String[] parts = varStored2.split(",");
			for(String part : parts) {
				if(StringUtils.isNotBlank(part)) {
					String var = TrafficLight.searchVarTrafficLight(part);
					if(StringUtils.isNotBlank(var))
						l.add(var);
				}
			}
		});
	}

	@Override
	protected void _defaultStatsVars(List<String> l) {
		Optional.ofNullable(searchListTrafficLight_.getStatsFields()).orElse(Arrays.asList()).forEach(varIndexed -> {
			String varIndexed2 = varIndexed;
			if(StringUtils.contains(varIndexed2, "}"))
				varIndexed2 = StringUtils.substringAfterLast(varIndexed2, "}");
			String[] parts = varIndexed2.split(",");
			for(String part : parts) {
				if(StringUtils.isNotBlank(part)) {
					String var = TrafficLight.searchVarTrafficLight(part);
					if(StringUtils.isNotBlank(var))
						l.add(var);
				}
			}
		});
	}

	@Override
	protected void _defaultPivotVars(List<String> l) {
		Optional.ofNullable(searchListTrafficLight_.getFacetPivots()).orElse(Arrays.asList()).forEach(facetPivot -> {
			String facetPivot2 = facetPivot;
			if(StringUtils.contains(facetPivot2, "}"))
				facetPivot2 = StringUtils.substringAfterLast(facetPivot2, "}");
			String[] parts = facetPivot2.split(",");
			for(String part : parts) {
				if(StringUtils.isNotBlank(part)) {
					String var = TrafficLight.searchVarTrafficLight(part);
					if(StringUtils.isNotBlank(var))
						l.add(var);
				}
			}
		});
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _listTrafficLight(JsonArray l) {
		Optional.ofNullable(searchListTrafficLight_).map(o -> o.getList()).orElse(Arrays.asList()).stream().map(o -> JsonObject.mapFrom(o)).forEach(o -> l.add(o));
	}

	protected void _trafficLightCount(Wrap<Integer> w) {
		w.o(searchListTrafficLight_ == null ? 0 : searchListTrafficLight_.size());
	}

	protected void _trafficLight_(Wrap<TrafficLight> w) {
		if(trafficLightCount == 1)
			w.o(searchListTrafficLight_.get(0));
	}

	protected void _id(Wrap<String> w) {
		if(trafficLightCount == 1)
			w.o(trafficLight_.getId());
	}

	@Override
	protected void _promiseBefore(Promise<Void> promise) {
		promise.complete();
	}

	@Override
	protected void _classSimpleName(Wrap<String> w) {
		w.o("TrafficLight");
	}

	@Override
	protected void _pageTitle(Wrap<String> c) {
		if(trafficLight_ != null && trafficLight_.getObjectTitle() != null)
			c.o(trafficLight_.getObjectTitle());
		else if(trafficLight_ != null)
			c.o("traffic lights");
		else if(searchListTrafficLight_ == null || trafficLightCount == 0)
			c.o("no traffic light found");
		else
			c.o("traffic lights");
	}

	@Override
	protected void _pageUri(Wrap<String> c) {
		c.o("/traffic-light");
	}

	@Override
	protected void _apiUri(Wrap<String> c) {
		c.o("/api/traffic-light");
	}

	@Override
	protected void _roles(List<String> l) {
		if(siteRequest_ != null) {
			l.addAll(Stream.concat(siteRequest_.getUserResourceRoles().stream(), siteRequest_.getUserRealmRoles().stream()).distinct().collect(Collectors.toList()));
		}
	}

	@Override
	protected void _roleRequired(List<String> l) {
		l.add(siteRequest_.getConfig().getString(ConfigKeys.AUTH_ROLE_REQUIRED + "_TrafficLight"));
	}

	@Override
	protected void _promiseAfter(Promise<Void> promise) {
		promise.complete();
	}

	@Override
	protected void _pageImageUri(Wrap<String> c) {
			c.o("/png/traffic-light-999.png");
	}

	@Override
	protected void _classIconGroup(Wrap<String> c) {
			c.o("duotone");
	}

	@Override
	protected void _classIconName(Wrap<String> c) {
			c.o("map-location-dot");
	}

	protected void _pageUriTrafficLight(Wrap<String> c) {
			c.o("/traffic-light");
	}
}
