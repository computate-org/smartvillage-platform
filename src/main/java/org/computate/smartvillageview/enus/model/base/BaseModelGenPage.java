package org.computate.smartvillageview.enus.model.base;

import org.computate.smartvillageview.enus.model.base.BaseModel;
import org.computate.smartvillageview.enus.request.SiteRequestEnUS;
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.lang.Boolean;
import java.util.List;
import org.computate.smartvillageview.enus.page.PageLayout;
import org.computate.smartvillageview.enus.model.user.SiteUser;
import java.io.IOException;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import org.computate.vertx.search.list.SearchList;
import org.computate.search.wrap.Wrap;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.api.service.ServiceRequest;
import io.vertx.core.json.JsonArray;
import java.net.URLDecoder;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.lang3.StringUtils;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.math.MathContext;
import org.apache.commons.collections.CollectionUtils;
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
public class BaseModelGenPage extends BaseModelGenPageGen<PageLayout> {

	/**
	 * {@inheritDoc}
	 * Ignore: true
	 **/
	protected void _searchListBaseModel_(Wrap<SearchList<BaseModel>> w) {
	}

	protected void _pageResponse(Wrap<String> w) {
		if(searchListBaseModel_ != null)
			w.o(JsonObject.mapFrom(searchListBaseModel_.getQueryResponse()).toString());
	}

	protected void _defaultPivotVars(List<String> l) {
		Optional.ofNullable(searchListBaseModel_.getFacetPivots()).orElse(Arrays.asList()).forEach(facetPivot -> {
			String facetPivot2 = facetPivot;
			if(StringUtils.contains(facetPivot2, "}"))
				facetPivot2 = StringUtils.substringAfterLast(facetPivot2, "}");
			String[] parts = facetPivot2.split(",");
			for(String part : parts) {
				if(StringUtils.isNotBlank(part)) {
					String var = StringUtils.substringBefore(part, "_");
					if(StringUtils.isNotBlank(var))
						l.add(var);
				}
			}
		});
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _listBaseModel(JsonArray l) {
		Optional.ofNullable(searchListBaseModel_).map(o -> o.getList()).orElse(Arrays.asList()).stream().map(o -> JsonObject.mapFrom(o)).forEach(o -> l.add(o));
	}

	protected void _facetCounts(Wrap<SolrResponse.FacetCounts> w) {
		w.o(searchListBaseModel_.getQueryResponse().getFacetCounts());
	}

	protected void _baseModelCount(Wrap<Integer> w) {
		w.o(searchListBaseModel_ == null ? 0 : searchListBaseModel_.size());
	}

	protected void _baseModel_(Wrap<BaseModel> w) {
		if(baseModelCount == 1)
			w.o(searchListBaseModel_.get(0));
	}

	protected void _pk(Wrap<Long> w) {
		if(baseModelCount == 1)
			w.o(baseModel_.getPk());
	}

	protected void _id(Wrap<String> w) {
		if(baseModelCount == 1)
			w.o(baseModel_.getId());
	}

	@Override
	protected void _promiseBefore(Promise<Void> promise) {
		promise.complete();
	}

	@Override
	protected void _classSimpleName(Wrap<String> w) {
		w.o("BaseModel");
	}

	@Override
	protected void _pageTitle(Wrap<String> c) {
		if(baseModel_ != null && baseModel_.getObjectTitle() != null)
			c.o(baseModel_.getObjectTitle());
		else if(baseModel_ != null)
			c.o("");
		else if(searchListBaseModel_ == null || baseModelCount == 0)
			c.o("");
	}

	@Override
	protected void _pageUri(Wrap<String> c) {
		c.o("");
	}

	@Override
	protected void _roles(List<String> l) {
		if(siteRequest_ != null) {
			l.addAll(Stream.concat(siteRequest_.getUserResourceRoles().stream(), siteRequest_.getUserRealmRoles().stream()).distinct().collect(Collectors.toList()));
		}
	}

	@Override
	protected void _pagination(JsonObject pagination) {
		JsonArray pages = new JsonArray();
		Long start = searchListBaseModel_.getStart().longValue();
		Long rows = searchListBaseModel_.getRows().longValue();
		Long foundNum = searchListBaseModel_.getQueryResponse().getResponse().getNumFound().longValue();
		Long startNum = start + 1L;
		Long endNum = start + rows;
		Long floorMod = Math.floorMod(foundNum, rows);
		Long last = Math.floorDiv(foundNum, rows) - (floorMod.equals(0L) ? 1L : 0L) * rows;
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
		BaseModel.varsQForClass().forEach(var -> {
			JsonObject json = new JsonObject();
			json.put("var", var);
			json.put("displayName", Optional.ofNullable(BaseModel.displayNameBaseModel(var)).map(d -> StringUtils.isBlank(d) ? var : d).orElse(var));
			json.put("classSimpleName", Optional.ofNullable(BaseModel.classSimpleNameBaseModel(var)).map(d -> StringUtils.isBlank(d) ? var : d).orElse(var));
			json.put("val", Optional.ofNullable(searchListBaseModel_.getRequest().getQuery()).filter(fq -> fq.startsWith(BaseModel.varIndexedBaseModel(var) + ":")).map(s -> StringUtils.substringAfter(s, ":")).orElse(null));
			vars.put(var, json);
		});
	}

	@Override
	protected void _varsFq(JsonObject vars) {
		Map<String, SolrResponse.FacetField> facetFields = Optional.ofNullable(facetCounts).map(c -> c.getFacetFields()).map(f -> f.getFacets()).orElse(new HashMap<String,SolrResponse.FacetField>());
		BaseModel.varsFqForClass().forEach(var -> {
			String varIndexed = BaseModel.varIndexedBaseModel(var);
			String varStored = BaseModel.varStoredBaseModel(var);
			JsonObject json = new JsonObject();
			json.put("var", var);
			json.put("varStored", varStored);
			json.put("varIndexed", varIndexed);
			json.put("displayName", Optional.ofNullable(BaseModel.displayNameBaseModel(var)).map(d -> StringUtils.isBlank(d) ? var : d).orElse(var));
			json.put("classSimpleName", Optional.ofNullable(BaseModel.classSimpleNameBaseModel(var)).map(d -> StringUtils.isBlank(d) ? var : d).orElse(var));
			json.put("val", searchListBaseModel_.getRequest().getFilterQueries().stream().filter(fq -> fq.startsWith(BaseModel.varIndexedBaseModel(var) + ":")).findFirst().map(s -> StringUtils.substringAfter(s, ":")).orElse(null));
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
			if(defaultPivotVars.contains(var)) {
				json.put("pivot", true);
			}
			vars.put(var, json);
		});
	}

	@Override
	protected void _varsRange(JsonObject vars) {
		BaseModel.varsRangeForClass().forEach(var -> {
			String varIndexed = BaseModel.varIndexedBaseModel(var);
			JsonObject json = new JsonObject();
			json.put("var", var);
			json.put("displayName", Optional.ofNullable(BaseModel.displayNameBaseModel(var)).map(d -> StringUtils.isBlank(d) ? var : d).orElse(var));
			json.put("classSimpleName", Optional.ofNullable(BaseModel.classSimpleNameBaseModel(var)).map(d -> StringUtils.isBlank(d) ? var : d).orElse(var));
			json.put("val", searchListBaseModel_.getRequest().getFilterQueries().stream().filter(fq -> fq.startsWith(BaseModel.varIndexedBaseModel(var) + ":")).findFirst().map(s -> StringUtils.substringAfter(s, ":")).orElse(null));
			vars.put(var, json);
		});
	}

	@Override
	protected void _query(JsonObject query) {
		ServiceRequest serviceRequest = siteRequest_.getServiceRequest();
		JsonObject params = serviceRequest.getParams();

		JsonObject queryParams = Optional.ofNullable(serviceRequest).map(ServiceRequest::getParams).map(or -> or.getJsonObject("query")).orElse(new JsonObject());
		Long num = searchListBaseModel_.getQueryResponse().getResponse().getNumFound().longValue();
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

		Long rows1 = Optional.ofNullable(searchListBaseModel_).map(l -> l.getRows()).orElse(10L);
		Long start1 = Optional.ofNullable(searchListBaseModel_).map(l -> l.getStart()).orElse(1L);
		Long start2 = start1 - rows1;
		Long start3 = start1 + rows1;
		Long rows2 = rows1 / 2;
		Long rows3 = rows1 * 2;
		start2 = start2 < 0 ? 0 : start2;
		JsonObject fqs = new JsonObject();
		for(String fq : Optional.ofNullable(searchListBaseModel_).map(l -> l.getFilterQueries()).orElse(Arrays.asList())) {
			if(!StringUtils.contains(fq, "(")) {
				String fq1 = StringUtils.substringBefore(fq, "_");
				String fq2 = StringUtils.substringAfter(fq, ":");
				if(!StringUtils.startsWithAny(fq, "classCanonicalNames_", "archived_", "deleted_", "sessionId", "userKeys"))
					fqs.put(fq1, new JsonObject().put("var", fq1).put("val", fq2).put("displayName", BaseModel.displayNameForClass(fq1)));
				}
			}
		query.put("fq", fqs);

		JsonArray sorts = new JsonArray();
		for(String sort : Optional.ofNullable(searchListBaseModel_).map(l -> l.getSorts()).orElse(Arrays.asList())) {
			String sort1 = StringUtils.substringBefore(sort, "_");
			sorts.add(new JsonObject().put("var", sort1).put("order", StringUtils.substringAfter(sort, " ")).put("displayName", BaseModel.displayNameForClass(sort1)));
		}
		query.put("sort", sorts);
	}

	@Override
	protected void _promiseAfter(Promise<Void> promise) {
		promise.complete();
	}

	@Override
	protected void _pageDescription(Wrap<String> c) {
			c.o("A reusable base class for all database model classes");
	}

	@Override
	protected void _pageImageUri(Wrap<String> c) {
			c.o("/png-999.png");
	}
}
