package org.computate.smartvillageview.enus.result.base;

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
import org.computate.smartvillageview.enus.page.PageLayout;
import org.computate.vertx.search.list.SearchList;
import org.computate.smartvillageview.enus.result.base.BaseResult;
import java.lang.String;
import java.time.ZoneId;
import java.util.Locale;
import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.lang.Integer;
import io.vertx.core.json.JsonObject;
import java.math.BigDecimal;
import io.vertx.core.json.JsonArray;
import org.computate.search.response.solr.SolrResponse.Stats;
import org.computate.search.response.solr.SolrResponse.FacetCounts;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;

/**	
 * <h1>Suggestions that can generate more code for you: </h1>
 * <ol>
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class BaseResultGenPageGen into the class BaseResultGenPage. 
 * </li>
 * <li>You can add a class comment "Api: true" if you wish to GET, POST, PATCH or PUT these BaseResultGenPage objects in a RESTful API. 
 * </li>
 * </ol>
 * <h1>About the BaseResultGenPage class and it's generated class BaseResultGenPageGen&lt;PageLayout&gt;: </h1>
 * <p>
 * This Java class extends a generated Java class built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage">Find the class BaseResultGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * <p>
 * Delete the class BaseResultGenPage in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.result.base in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.result.base&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smart-village-view in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smart\-village\-view&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class BaseResultGenPageGen<DEV> extends PageLayout {
	protected static final Logger LOG = LoggerFactory.getLogger(BaseResultGenPage.class);

	///////////////////////////
	// searchListBaseResult_ //
	///////////////////////////

	/**	 The entity searchListBaseResult_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<BaseResult> searchListBaseResult_;

	/**	<br> The entity searchListBaseResult_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage&fq=entiteVar_enUS_indexed_string:searchListBaseResult_">Find the entity searchListBaseResult_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchListBaseResult_(Wrap<SearchList<BaseResult>> w);

	public SearchList<BaseResult> getSearchListBaseResult_() {
		return searchListBaseResult_;
	}

	public void setSearchListBaseResult_(SearchList<BaseResult> searchListBaseResult_) {
		this.searchListBaseResult_ = searchListBaseResult_;
	}
	public static SearchList<BaseResult> staticSetSearchListBaseResult_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected BaseResultGenPage searchListBaseResult_Init() {
		Wrap<SearchList<BaseResult>> searchListBaseResult_Wrap = new Wrap<SearchList<BaseResult>>().var("searchListBaseResult_");
		if(searchListBaseResult_ == null) {
			_searchListBaseResult_(searchListBaseResult_Wrap);
			setSearchListBaseResult_(searchListBaseResult_Wrap.o);
		}
		return (BaseResultGenPage)this;
	}

	//////////////////
	// pageResponse //
	//////////////////

	/**	 The entity pageResponse
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageResponse;

	/**	<br> The entity pageResponse
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage&fq=entiteVar_enUS_indexed_string:pageResponse">Find the entity pageResponse in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageResponse(Wrap<String> w);

	public String getPageResponse() {
		return pageResponse;
	}
	public void setPageResponse(String o) {
		this.pageResponse = BaseResultGenPage.staticSetPageResponse(siteRequest_, o);
	}
	public static String staticSetPageResponse(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected BaseResultGenPage pageResponseInit() {
		Wrap<String> pageResponseWrap = new Wrap<String>().var("pageResponse");
		if(pageResponse == null) {
			_pageResponse(pageResponseWrap);
			setPageResponse(pageResponseWrap.o);
		}
		return (BaseResultGenPage)this;
	}

	public static String staticSearchPageResponse(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageResponse(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageResponse(SiteRequestEnUS siteRequest_, String o) {
		return BaseResultGenPage.staticSearchStrPageResponse(siteRequest_, BaseResultGenPage.staticSearchPageResponse(siteRequest_, BaseResultGenPage.staticSetPageResponse(siteRequest_, o)));
	}

	///////////////////
	// defaultZoneId //
	///////////////////

	/**	 The entity defaultZoneId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String defaultZoneId;

	/**	<br> The entity defaultZoneId
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage&fq=entiteVar_enUS_indexed_string:defaultZoneId">Find the entity defaultZoneId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultZoneId(Wrap<String> w);

	public String getDefaultZoneId() {
		return defaultZoneId;
	}
	public void setDefaultZoneId(String o) {
		this.defaultZoneId = BaseResultGenPage.staticSetDefaultZoneId(siteRequest_, o);
	}
	public static String staticSetDefaultZoneId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected BaseResultGenPage defaultZoneIdInit() {
		Wrap<String> defaultZoneIdWrap = new Wrap<String>().var("defaultZoneId");
		if(defaultZoneId == null) {
			_defaultZoneId(defaultZoneIdWrap);
			setDefaultZoneId(defaultZoneIdWrap.o);
		}
		return (BaseResultGenPage)this;
	}

	public static String staticSearchDefaultZoneId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDefaultZoneId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultZoneId(SiteRequestEnUS siteRequest_, String o) {
		return BaseResultGenPage.staticSearchStrDefaultZoneId(siteRequest_, BaseResultGenPage.staticSearchDefaultZoneId(siteRequest_, BaseResultGenPage.staticSetDefaultZoneId(siteRequest_, o)));
	}

	/////////////////////
	// defaultTimeZone //
	/////////////////////

	/**	 The entity defaultTimeZone
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected ZoneId defaultTimeZone;

	/**	<br> The entity defaultTimeZone
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage&fq=entiteVar_enUS_indexed_string:defaultTimeZone">Find the entity defaultTimeZone in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultTimeZone(Wrap<ZoneId> w);

	public ZoneId getDefaultTimeZone() {
		return defaultTimeZone;
	}

	public void setDefaultTimeZone(ZoneId defaultTimeZone) {
		this.defaultTimeZone = defaultTimeZone;
	}
	public static ZoneId staticSetDefaultTimeZone(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected BaseResultGenPage defaultTimeZoneInit() {
		Wrap<ZoneId> defaultTimeZoneWrap = new Wrap<ZoneId>().var("defaultTimeZone");
		if(defaultTimeZone == null) {
			_defaultTimeZone(defaultTimeZoneWrap);
			setDefaultTimeZone(defaultTimeZoneWrap.o);
		}
		return (BaseResultGenPage)this;
	}

	/////////////////////
	// defaultLocaleId //
	/////////////////////

	/**	 The entity defaultLocaleId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String defaultLocaleId;

	/**	<br> The entity defaultLocaleId
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage&fq=entiteVar_enUS_indexed_string:defaultLocaleId">Find the entity defaultLocaleId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultLocaleId(Wrap<String> w);

	public String getDefaultLocaleId() {
		return defaultLocaleId;
	}
	public void setDefaultLocaleId(String o) {
		this.defaultLocaleId = BaseResultGenPage.staticSetDefaultLocaleId(siteRequest_, o);
	}
	public static String staticSetDefaultLocaleId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected BaseResultGenPage defaultLocaleIdInit() {
		Wrap<String> defaultLocaleIdWrap = new Wrap<String>().var("defaultLocaleId");
		if(defaultLocaleId == null) {
			_defaultLocaleId(defaultLocaleIdWrap);
			setDefaultLocaleId(defaultLocaleIdWrap.o);
		}
		return (BaseResultGenPage)this;
	}

	public static String staticSearchDefaultLocaleId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDefaultLocaleId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultLocaleId(SiteRequestEnUS siteRequest_, String o) {
		return BaseResultGenPage.staticSearchStrDefaultLocaleId(siteRequest_, BaseResultGenPage.staticSearchDefaultLocaleId(siteRequest_, BaseResultGenPage.staticSetDefaultLocaleId(siteRequest_, o)));
	}

	///////////////////
	// defaultLocale //
	///////////////////

	/**	 The entity defaultLocale
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected Locale defaultLocale;

	/**	<br> The entity defaultLocale
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage&fq=entiteVar_enUS_indexed_string:defaultLocale">Find the entity defaultLocale in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultLocale(Wrap<Locale> w);

	public Locale getDefaultLocale() {
		return defaultLocale;
	}

	public void setDefaultLocale(Locale defaultLocale) {
		this.defaultLocale = defaultLocale;
	}
	public static Locale staticSetDefaultLocale(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected BaseResultGenPage defaultLocaleInit() {
		Wrap<Locale> defaultLocaleWrap = new Wrap<Locale>().var("defaultLocale");
		if(defaultLocale == null) {
			_defaultLocale(defaultLocaleWrap);
			setDefaultLocale(defaultLocaleWrap.o);
		}
		return (BaseResultGenPage)this;
	}

	/////////////////////
	// defaultRangeGap //
	/////////////////////

	/**	 The entity defaultRangeGap
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String defaultRangeGap;

	/**	<br> The entity defaultRangeGap
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage&fq=entiteVar_enUS_indexed_string:defaultRangeGap">Find the entity defaultRangeGap in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultRangeGap(Wrap<String> w);

	public String getDefaultRangeGap() {
		return defaultRangeGap;
	}
	public void setDefaultRangeGap(String o) {
		this.defaultRangeGap = BaseResultGenPage.staticSetDefaultRangeGap(siteRequest_, o);
	}
	public static String staticSetDefaultRangeGap(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected BaseResultGenPage defaultRangeGapInit() {
		Wrap<String> defaultRangeGapWrap = new Wrap<String>().var("defaultRangeGap");
		if(defaultRangeGap == null) {
			_defaultRangeGap(defaultRangeGapWrap);
			setDefaultRangeGap(defaultRangeGapWrap.o);
		}
		return (BaseResultGenPage)this;
	}

	public static String staticSearchDefaultRangeGap(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDefaultRangeGap(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultRangeGap(SiteRequestEnUS siteRequest_, String o) {
		return BaseResultGenPage.staticSearchStrDefaultRangeGap(siteRequest_, BaseResultGenPage.staticSearchDefaultRangeGap(siteRequest_, BaseResultGenPage.staticSetDefaultRangeGap(siteRequest_, o)));
	}

	/////////////////////
	// defaultRangeEnd //
	/////////////////////

	/**	 The entity defaultRangeEnd
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonDeserialize(using = ComputateZonedDateTimeDeserializer.class)
	@JsonSerialize(using = ComputateZonedDateTimeSerializer.class)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSSV'['VV']'")
	@JsonInclude(Include.NON_NULL)
	protected ZonedDateTime defaultRangeEnd;

	/**	<br> The entity defaultRangeEnd
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage&fq=entiteVar_enUS_indexed_string:defaultRangeEnd">Find the entity defaultRangeEnd in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultRangeEnd(Wrap<ZonedDateTime> w);

	public ZonedDateTime getDefaultRangeEnd() {
		return defaultRangeEnd;
	}

	public void setDefaultRangeEnd(ZonedDateTime defaultRangeEnd) {
		this.defaultRangeEnd = defaultRangeEnd;
	}
	@JsonIgnore
	public void setDefaultRangeEnd(Instant o) {
		this.defaultRangeEnd = o == null ? null : ZonedDateTime.from(o).truncatedTo(ChronoUnit.MILLIS);
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	@JsonIgnore
	public void setDefaultRangeEnd(String o) {
		this.defaultRangeEnd = BaseResultGenPage.staticSetDefaultRangeEnd(siteRequest_, o);
	}
	public static ZonedDateTime staticSetDefaultRangeEnd(SiteRequestEnUS siteRequest_, String o) {
		if(StringUtils.endsWith(o, "]"))
			return o == null ? null : ZonedDateTime.parse(o, ComputateZonedDateTimeSerializer.ZONED_DATE_TIME_FORMATTER);
		else if(StringUtils.endsWith(o, "Z"))
			return o == null ? null : Instant.parse(o).atZone(Optional.ofNullable(siteRequest_).map(r -> r.getConfig()).map(config -> config.getString(ConfigKeys.SITE_ZONE)).map(z -> ZoneId.of(z)).orElse(ZoneId.of("UTC"))).truncatedTo(ChronoUnit.MILLIS);
		else if(StringUtils.contains(o, "T"))
			return o == null ? null : ZonedDateTime.parse(o, DateTimeFormatter.ISO_DATE_TIME).truncatedTo(ChronoUnit.MILLIS);
		else
			return o == null ? null : LocalDate.parse(o, DateTimeFormatter.ISO_DATE).atStartOfDay(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	@JsonIgnore
	public void setDefaultRangeEnd(Date o) {
		this.defaultRangeEnd = o == null ? null : ZonedDateTime.ofInstant(o.toInstant(), ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	protected BaseResultGenPage defaultRangeEndInit() {
		Wrap<ZonedDateTime> defaultRangeEndWrap = new Wrap<ZonedDateTime>().var("defaultRangeEnd");
		if(defaultRangeEnd == null) {
			_defaultRangeEnd(defaultRangeEndWrap);
			setDefaultRangeEnd(defaultRangeEndWrap.o);
		}
		return (BaseResultGenPage)this;
	}

	public static Date staticSearchDefaultRangeEnd(SiteRequestEnUS siteRequest_, ZonedDateTime o) {
		return o == null ? null : Date.from(o.toInstant());
	}

	public static String staticSearchStrDefaultRangeEnd(SiteRequestEnUS siteRequest_, Date o) {
		return "\"" + DateTimeFormatter.ISO_DATE_TIME.format(o.toInstant().atOffset(ZoneOffset.UTC)) + "\"";
	}

	public static String staticSearchFqDefaultRangeEnd(SiteRequestEnUS siteRequest_, String o) {
		return BaseResultGenPage.staticSearchStrDefaultRangeEnd(siteRequest_, BaseResultGenPage.staticSearchDefaultRangeEnd(siteRequest_, BaseResultGenPage.staticSetDefaultRangeEnd(siteRequest_, o)));
	}

	///////////////////////
	// defaultRangeStart //
	///////////////////////

	/**	 The entity defaultRangeStart
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonDeserialize(using = ComputateZonedDateTimeDeserializer.class)
	@JsonSerialize(using = ComputateZonedDateTimeSerializer.class)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSSV'['VV']'")
	@JsonInclude(Include.NON_NULL)
	protected ZonedDateTime defaultRangeStart;

	/**	<br> The entity defaultRangeStart
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage&fq=entiteVar_enUS_indexed_string:defaultRangeStart">Find the entity defaultRangeStart in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultRangeStart(Wrap<ZonedDateTime> w);

	public ZonedDateTime getDefaultRangeStart() {
		return defaultRangeStart;
	}

	public void setDefaultRangeStart(ZonedDateTime defaultRangeStart) {
		this.defaultRangeStart = defaultRangeStart;
	}
	@JsonIgnore
	public void setDefaultRangeStart(Instant o) {
		this.defaultRangeStart = o == null ? null : ZonedDateTime.from(o).truncatedTo(ChronoUnit.MILLIS);
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	@JsonIgnore
	public void setDefaultRangeStart(String o) {
		this.defaultRangeStart = BaseResultGenPage.staticSetDefaultRangeStart(siteRequest_, o);
	}
	public static ZonedDateTime staticSetDefaultRangeStart(SiteRequestEnUS siteRequest_, String o) {
		if(StringUtils.endsWith(o, "]"))
			return o == null ? null : ZonedDateTime.parse(o, ComputateZonedDateTimeSerializer.ZONED_DATE_TIME_FORMATTER);
		else if(StringUtils.endsWith(o, "Z"))
			return o == null ? null : Instant.parse(o).atZone(Optional.ofNullable(siteRequest_).map(r -> r.getConfig()).map(config -> config.getString(ConfigKeys.SITE_ZONE)).map(z -> ZoneId.of(z)).orElse(ZoneId.of("UTC"))).truncatedTo(ChronoUnit.MILLIS);
		else if(StringUtils.contains(o, "T"))
			return o == null ? null : ZonedDateTime.parse(o, DateTimeFormatter.ISO_DATE_TIME).truncatedTo(ChronoUnit.MILLIS);
		else
			return o == null ? null : LocalDate.parse(o, DateTimeFormatter.ISO_DATE).atStartOfDay(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	@JsonIgnore
	public void setDefaultRangeStart(Date o) {
		this.defaultRangeStart = o == null ? null : ZonedDateTime.ofInstant(o.toInstant(), ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	protected BaseResultGenPage defaultRangeStartInit() {
		Wrap<ZonedDateTime> defaultRangeStartWrap = new Wrap<ZonedDateTime>().var("defaultRangeStart");
		if(defaultRangeStart == null) {
			_defaultRangeStart(defaultRangeStartWrap);
			setDefaultRangeStart(defaultRangeStartWrap.o);
		}
		return (BaseResultGenPage)this;
	}

	public static Date staticSearchDefaultRangeStart(SiteRequestEnUS siteRequest_, ZonedDateTime o) {
		return o == null ? null : Date.from(o.toInstant());
	}

	public static String staticSearchStrDefaultRangeStart(SiteRequestEnUS siteRequest_, Date o) {
		return "\"" + DateTimeFormatter.ISO_DATE_TIME.format(o.toInstant().atOffset(ZoneOffset.UTC)) + "\"";
	}

	public static String staticSearchFqDefaultRangeStart(SiteRequestEnUS siteRequest_, String o) {
		return BaseResultGenPage.staticSearchStrDefaultRangeStart(siteRequest_, BaseResultGenPage.staticSearchDefaultRangeStart(siteRequest_, BaseResultGenPage.staticSetDefaultRangeStart(siteRequest_, o)));
	}

	/////////////////////
	// defaultRangeVar //
	/////////////////////

	/**	 The entity defaultRangeVar
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String defaultRangeVar;

	/**	<br> The entity defaultRangeVar
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage&fq=entiteVar_enUS_indexed_string:defaultRangeVar">Find the entity defaultRangeVar in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultRangeVar(Wrap<String> w);

	public String getDefaultRangeVar() {
		return defaultRangeVar;
	}
	public void setDefaultRangeVar(String o) {
		this.defaultRangeVar = BaseResultGenPage.staticSetDefaultRangeVar(siteRequest_, o);
	}
	public static String staticSetDefaultRangeVar(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected BaseResultGenPage defaultRangeVarInit() {
		Wrap<String> defaultRangeVarWrap = new Wrap<String>().var("defaultRangeVar");
		if(defaultRangeVar == null) {
			_defaultRangeVar(defaultRangeVarWrap);
			setDefaultRangeVar(defaultRangeVarWrap.o);
		}
		return (BaseResultGenPage)this;
	}

	public static String staticSearchDefaultRangeVar(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDefaultRangeVar(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultRangeVar(SiteRequestEnUS siteRequest_, String o) {
		return BaseResultGenPage.staticSearchStrDefaultRangeVar(siteRequest_, BaseResultGenPage.staticSearchDefaultRangeVar(siteRequest_, BaseResultGenPage.staticSetDefaultRangeVar(siteRequest_, o)));
	}

	//////////////////////
	// defaultFacetSort //
	//////////////////////

	/**	 The entity defaultFacetSort
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String defaultFacetSort;

	/**	<br> The entity defaultFacetSort
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage&fq=entiteVar_enUS_indexed_string:defaultFacetSort">Find the entity defaultFacetSort in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultFacetSort(Wrap<String> w);

	public String getDefaultFacetSort() {
		return defaultFacetSort;
	}
	public void setDefaultFacetSort(String o) {
		this.defaultFacetSort = BaseResultGenPage.staticSetDefaultFacetSort(siteRequest_, o);
	}
	public static String staticSetDefaultFacetSort(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected BaseResultGenPage defaultFacetSortInit() {
		Wrap<String> defaultFacetSortWrap = new Wrap<String>().var("defaultFacetSort");
		if(defaultFacetSort == null) {
			_defaultFacetSort(defaultFacetSortWrap);
			setDefaultFacetSort(defaultFacetSortWrap.o);
		}
		return (BaseResultGenPage)this;
	}

	public static String staticSearchDefaultFacetSort(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDefaultFacetSort(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultFacetSort(SiteRequestEnUS siteRequest_, String o) {
		return BaseResultGenPage.staticSearchStrDefaultFacetSort(siteRequest_, BaseResultGenPage.staticSearchDefaultFacetSort(siteRequest_, BaseResultGenPage.staticSetDefaultFacetSort(siteRequest_, o)));
	}

	///////////////////////
	// defaultFacetLimit //
	///////////////////////

	/**	 The entity defaultFacetLimit
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer defaultFacetLimit;

	/**	<br> The entity defaultFacetLimit
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage&fq=entiteVar_enUS_indexed_string:defaultFacetLimit">Find the entity defaultFacetLimit in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultFacetLimit(Wrap<Integer> w);

	public Integer getDefaultFacetLimit() {
		return defaultFacetLimit;
	}

	public void setDefaultFacetLimit(Integer defaultFacetLimit) {
		this.defaultFacetLimit = defaultFacetLimit;
	}
	@JsonIgnore
	public void setDefaultFacetLimit(String o) {
		this.defaultFacetLimit = BaseResultGenPage.staticSetDefaultFacetLimit(siteRequest_, o);
	}
	public static Integer staticSetDefaultFacetLimit(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected BaseResultGenPage defaultFacetLimitInit() {
		Wrap<Integer> defaultFacetLimitWrap = new Wrap<Integer>().var("defaultFacetLimit");
		if(defaultFacetLimit == null) {
			_defaultFacetLimit(defaultFacetLimitWrap);
			setDefaultFacetLimit(defaultFacetLimitWrap.o);
		}
		return (BaseResultGenPage)this;
	}

	public static Integer staticSearchDefaultFacetLimit(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrDefaultFacetLimit(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultFacetLimit(SiteRequestEnUS siteRequest_, String o) {
		return BaseResultGenPage.staticSearchStrDefaultFacetLimit(siteRequest_, BaseResultGenPage.staticSearchDefaultFacetLimit(siteRequest_, BaseResultGenPage.staticSetDefaultFacetLimit(siteRequest_, o)));
	}

	//////////////////////////
	// defaultFacetMinCount //
	//////////////////////////

	/**	 The entity defaultFacetMinCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer defaultFacetMinCount;

	/**	<br> The entity defaultFacetMinCount
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage&fq=entiteVar_enUS_indexed_string:defaultFacetMinCount">Find the entity defaultFacetMinCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultFacetMinCount(Wrap<Integer> w);

	public Integer getDefaultFacetMinCount() {
		return defaultFacetMinCount;
	}

	public void setDefaultFacetMinCount(Integer defaultFacetMinCount) {
		this.defaultFacetMinCount = defaultFacetMinCount;
	}
	@JsonIgnore
	public void setDefaultFacetMinCount(String o) {
		this.defaultFacetMinCount = BaseResultGenPage.staticSetDefaultFacetMinCount(siteRequest_, o);
	}
	public static Integer staticSetDefaultFacetMinCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected BaseResultGenPage defaultFacetMinCountInit() {
		Wrap<Integer> defaultFacetMinCountWrap = new Wrap<Integer>().var("defaultFacetMinCount");
		if(defaultFacetMinCount == null) {
			_defaultFacetMinCount(defaultFacetMinCountWrap);
			setDefaultFacetMinCount(defaultFacetMinCountWrap.o);
		}
		return (BaseResultGenPage)this;
	}

	public static Integer staticSearchDefaultFacetMinCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrDefaultFacetMinCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultFacetMinCount(SiteRequestEnUS siteRequest_, String o) {
		return BaseResultGenPage.staticSearchStrDefaultFacetMinCount(siteRequest_, BaseResultGenPage.staticSearchDefaultFacetMinCount(siteRequest_, BaseResultGenPage.staticSetDefaultFacetMinCount(siteRequest_, o)));
	}

	//////////////////////////
	// defaultPivotMinCount //
	//////////////////////////

	/**	 The entity defaultPivotMinCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer defaultPivotMinCount;

	/**	<br> The entity defaultPivotMinCount
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage&fq=entiteVar_enUS_indexed_string:defaultPivotMinCount">Find the entity defaultPivotMinCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultPivotMinCount(Wrap<Integer> w);

	public Integer getDefaultPivotMinCount() {
		return defaultPivotMinCount;
	}

	public void setDefaultPivotMinCount(Integer defaultPivotMinCount) {
		this.defaultPivotMinCount = defaultPivotMinCount;
	}
	@JsonIgnore
	public void setDefaultPivotMinCount(String o) {
		this.defaultPivotMinCount = BaseResultGenPage.staticSetDefaultPivotMinCount(siteRequest_, o);
	}
	public static Integer staticSetDefaultPivotMinCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected BaseResultGenPage defaultPivotMinCountInit() {
		Wrap<Integer> defaultPivotMinCountWrap = new Wrap<Integer>().var("defaultPivotMinCount");
		if(defaultPivotMinCount == null) {
			_defaultPivotMinCount(defaultPivotMinCountWrap);
			setDefaultPivotMinCount(defaultPivotMinCountWrap.o);
		}
		return (BaseResultGenPage)this;
	}

	public static Integer staticSearchDefaultPivotMinCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrDefaultPivotMinCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultPivotMinCount(SiteRequestEnUS siteRequest_, String o) {
		return BaseResultGenPage.staticSearchStrDefaultPivotMinCount(siteRequest_, BaseResultGenPage.staticSearchDefaultPivotMinCount(siteRequest_, BaseResultGenPage.staticSetDefaultPivotMinCount(siteRequest_, o)));
	}

	//////////////////////////
	// DEFAULT_MAP_LOCATION //
	//////////////////////////

	/**	 The entity DEFAULT_MAP_LOCATION
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject DEFAULT_MAP_LOCATION;

	/**	<br> The entity DEFAULT_MAP_LOCATION
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage&fq=entiteVar_enUS_indexed_string:DEFAULT_MAP_LOCATION">Find the entity DEFAULT_MAP_LOCATION in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _DEFAULT_MAP_LOCATION(Wrap<JsonObject> w);

	public JsonObject getDEFAULT_MAP_LOCATION() {
		return DEFAULT_MAP_LOCATION;
	}

	public void setDEFAULT_MAP_LOCATION(JsonObject DEFAULT_MAP_LOCATION) {
		this.DEFAULT_MAP_LOCATION = DEFAULT_MAP_LOCATION;
	}
	@JsonIgnore
	public void setDEFAULT_MAP_LOCATION(String o) {
		this.DEFAULT_MAP_LOCATION = BaseResultGenPage.staticSetDEFAULT_MAP_LOCATION(siteRequest_, o);
	}
	public static JsonObject staticSetDEFAULT_MAP_LOCATION(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected BaseResultGenPage DEFAULT_MAP_LOCATIONInit() {
		Wrap<JsonObject> DEFAULT_MAP_LOCATIONWrap = new Wrap<JsonObject>().var("DEFAULT_MAP_LOCATION");
		if(DEFAULT_MAP_LOCATION == null) {
			_DEFAULT_MAP_LOCATION(DEFAULT_MAP_LOCATIONWrap);
			setDEFAULT_MAP_LOCATION(DEFAULT_MAP_LOCATIONWrap.o);
		}
		return (BaseResultGenPage)this;
	}

	public static JsonObject staticSearchDEFAULT_MAP_LOCATION(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrDEFAULT_MAP_LOCATION(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDEFAULT_MAP_LOCATION(SiteRequestEnUS siteRequest_, String o) {
		return BaseResultGenPage.staticSearchStrDEFAULT_MAP_LOCATION(siteRequest_, BaseResultGenPage.staticSearchDEFAULT_MAP_LOCATION(siteRequest_, BaseResultGenPage.staticSetDEFAULT_MAP_LOCATION(siteRequest_, o)));
	}

	//////////////////////
	// DEFAULT_MAP_ZOOM //
	//////////////////////

	/**	 The entity DEFAULT_MAP_ZOOM
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal DEFAULT_MAP_ZOOM;

	/**	<br> The entity DEFAULT_MAP_ZOOM
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage&fq=entiteVar_enUS_indexed_string:DEFAULT_MAP_ZOOM">Find the entity DEFAULT_MAP_ZOOM in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _DEFAULT_MAP_ZOOM(Wrap<BigDecimal> w);

	public BigDecimal getDEFAULT_MAP_ZOOM() {
		return DEFAULT_MAP_ZOOM;
	}

	public void setDEFAULT_MAP_ZOOM(BigDecimal DEFAULT_MAP_ZOOM) {
		this.DEFAULT_MAP_ZOOM = DEFAULT_MAP_ZOOM;
	}
	@JsonIgnore
	public void setDEFAULT_MAP_ZOOM(String o) {
		this.DEFAULT_MAP_ZOOM = BaseResultGenPage.staticSetDEFAULT_MAP_ZOOM(siteRequest_, o);
	}
	public static BigDecimal staticSetDEFAULT_MAP_ZOOM(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setDEFAULT_MAP_ZOOM(Double o) {
			this.DEFAULT_MAP_ZOOM = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setDEFAULT_MAP_ZOOM(Integer o) {
			this.DEFAULT_MAP_ZOOM = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected BaseResultGenPage DEFAULT_MAP_ZOOMInit() {
		Wrap<BigDecimal> DEFAULT_MAP_ZOOMWrap = new Wrap<BigDecimal>().var("DEFAULT_MAP_ZOOM");
		if(DEFAULT_MAP_ZOOM == null) {
			_DEFAULT_MAP_ZOOM(DEFAULT_MAP_ZOOMWrap);
			setDEFAULT_MAP_ZOOM(DEFAULT_MAP_ZOOMWrap.o);
		}
		return (BaseResultGenPage)this;
	}

	public static Double staticSearchDEFAULT_MAP_ZOOM(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrDEFAULT_MAP_ZOOM(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDEFAULT_MAP_ZOOM(SiteRequestEnUS siteRequest_, String o) {
		return BaseResultGenPage.staticSearchStrDEFAULT_MAP_ZOOM(siteRequest_, BaseResultGenPage.staticSearchDEFAULT_MAP_ZOOM(siteRequest_, BaseResultGenPage.staticSetDEFAULT_MAP_ZOOM(siteRequest_, o)));
	}

	//////////////////////////
	// defaultFieldListVars //
	//////////////////////////

	/**	 The entity defaultFieldListVars
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> defaultFieldListVars = new ArrayList<String>();

	/**	<br> The entity defaultFieldListVars
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage&fq=entiteVar_enUS_indexed_string:defaultFieldListVars">Find the entity defaultFieldListVars in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _defaultFieldListVars(List<String> l);

	public List<String> getDefaultFieldListVars() {
		return defaultFieldListVars;
	}

	public void setDefaultFieldListVars(List<String> defaultFieldListVars) {
		this.defaultFieldListVars = defaultFieldListVars;
	}
	public static String staticSetDefaultFieldListVars(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public BaseResultGenPage addDefaultFieldListVars(String...objects) {
		for(String o : objects) {
			addDefaultFieldListVars(o);
		}
		return (BaseResultGenPage)this;
	}
	public BaseResultGenPage addDefaultFieldListVars(String o) {
		if(o != null)
			this.defaultFieldListVars.add(o);
		return (BaseResultGenPage)this;
	}
	@JsonIgnore
	public void setDefaultFieldListVars(JsonArray objects) {
		defaultFieldListVars.clear();
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addDefaultFieldListVars(o);
		}
	}
	protected BaseResultGenPage defaultFieldListVarsInit() {
		_defaultFieldListVars(defaultFieldListVars);
		return (BaseResultGenPage)this;
	}

	public static String staticSearchDefaultFieldListVars(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDefaultFieldListVars(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultFieldListVars(SiteRequestEnUS siteRequest_, String o) {
		return BaseResultGenPage.staticSearchStrDefaultFieldListVars(siteRequest_, BaseResultGenPage.staticSearchDefaultFieldListVars(siteRequest_, BaseResultGenPage.staticSetDefaultFieldListVars(siteRequest_, o)));
	}

	//////////////////////
	// defaultStatsVars //
	//////////////////////

	/**	 The entity defaultStatsVars
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> defaultStatsVars = new ArrayList<String>();

	/**	<br> The entity defaultStatsVars
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage&fq=entiteVar_enUS_indexed_string:defaultStatsVars">Find the entity defaultStatsVars in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _defaultStatsVars(List<String> l);

	public List<String> getDefaultStatsVars() {
		return defaultStatsVars;
	}

	public void setDefaultStatsVars(List<String> defaultStatsVars) {
		this.defaultStatsVars = defaultStatsVars;
	}
	public static String staticSetDefaultStatsVars(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public BaseResultGenPage addDefaultStatsVars(String...objects) {
		for(String o : objects) {
			addDefaultStatsVars(o);
		}
		return (BaseResultGenPage)this;
	}
	public BaseResultGenPage addDefaultStatsVars(String o) {
		if(o != null)
			this.defaultStatsVars.add(o);
		return (BaseResultGenPage)this;
	}
	@JsonIgnore
	public void setDefaultStatsVars(JsonArray objects) {
		defaultStatsVars.clear();
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addDefaultStatsVars(o);
		}
	}
	protected BaseResultGenPage defaultStatsVarsInit() {
		_defaultStatsVars(defaultStatsVars);
		return (BaseResultGenPage)this;
	}

	public static String staticSearchDefaultStatsVars(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDefaultStatsVars(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultStatsVars(SiteRequestEnUS siteRequest_, String o) {
		return BaseResultGenPage.staticSearchStrDefaultStatsVars(siteRequest_, BaseResultGenPage.staticSearchDefaultStatsVars(siteRequest_, BaseResultGenPage.staticSetDefaultStatsVars(siteRequest_, o)));
	}

	//////////////////////
	// defaultPivotVars //
	//////////////////////

	/**	 The entity defaultPivotVars
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> defaultPivotVars = new ArrayList<String>();

	/**	<br> The entity defaultPivotVars
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage&fq=entiteVar_enUS_indexed_string:defaultPivotVars">Find the entity defaultPivotVars in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _defaultPivotVars(List<String> l);

	public List<String> getDefaultPivotVars() {
		return defaultPivotVars;
	}

	public void setDefaultPivotVars(List<String> defaultPivotVars) {
		this.defaultPivotVars = defaultPivotVars;
	}
	public static String staticSetDefaultPivotVars(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public BaseResultGenPage addDefaultPivotVars(String...objects) {
		for(String o : objects) {
			addDefaultPivotVars(o);
		}
		return (BaseResultGenPage)this;
	}
	public BaseResultGenPage addDefaultPivotVars(String o) {
		if(o != null)
			this.defaultPivotVars.add(o);
		return (BaseResultGenPage)this;
	}
	@JsonIgnore
	public void setDefaultPivotVars(JsonArray objects) {
		defaultPivotVars.clear();
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addDefaultPivotVars(o);
		}
	}
	protected BaseResultGenPage defaultPivotVarsInit() {
		_defaultPivotVars(defaultPivotVars);
		return (BaseResultGenPage)this;
	}

	public static String staticSearchDefaultPivotVars(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDefaultPivotVars(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultPivotVars(SiteRequestEnUS siteRequest_, String o) {
		return BaseResultGenPage.staticSearchStrDefaultPivotVars(siteRequest_, BaseResultGenPage.staticSearchDefaultPivotVars(siteRequest_, BaseResultGenPage.staticSetDefaultPivotVars(siteRequest_, o)));
	}

	////////////////////
	// listBaseResult //
	////////////////////

	/**	 The entity listBaseResult
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listBaseResult = new JsonArray();

	/**	<br> The entity listBaseResult
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage&fq=entiteVar_enUS_indexed_string:listBaseResult">Find the entity listBaseResult in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _listBaseResult(JsonArray l);

	public JsonArray getListBaseResult() {
		return listBaseResult;
	}

	public void setListBaseResult(JsonArray listBaseResult) {
		this.listBaseResult = listBaseResult;
	}
	public static JsonArray staticSetListBaseResult(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected BaseResultGenPage listBaseResultInit() {
		_listBaseResult(listBaseResult);
		return (BaseResultGenPage)this;
	}

	///////////
	// stats //
	///////////

	/**	 The entity stats
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Stats stats;

	/**	<br> The entity stats
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage&fq=entiteVar_enUS_indexed_string:stats">Find the entity stats in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _stats(Wrap<Stats> w);

	public Stats getStats() {
		return stats;
	}

	public void setStats(Stats stats) {
		this.stats = stats;
	}
	public static Stats staticSetStats(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected BaseResultGenPage statsInit() {
		Wrap<Stats> statsWrap = new Wrap<Stats>().var("stats");
		if(stats == null) {
			_stats(statsWrap);
			setStats(statsWrap.o);
		}
		return (BaseResultGenPage)this;
	}

	/////////////////
	// facetCounts //
	/////////////////

	/**	 The entity facetCounts
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected FacetCounts facetCounts;

	/**	<br> The entity facetCounts
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage&fq=entiteVar_enUS_indexed_string:facetCounts">Find the entity facetCounts in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _facetCounts(Wrap<FacetCounts> w);

	public FacetCounts getFacetCounts() {
		return facetCounts;
	}

	public void setFacetCounts(FacetCounts facetCounts) {
		this.facetCounts = facetCounts;
	}
	public static FacetCounts staticSetFacetCounts(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected BaseResultGenPage facetCountsInit() {
		Wrap<FacetCounts> facetCountsWrap = new Wrap<FacetCounts>().var("facetCounts");
		if(facetCounts == null) {
			_facetCounts(facetCountsWrap);
			setFacetCounts(facetCountsWrap.o);
		}
		return (BaseResultGenPage)this;
	}

	/////////////////////
	// baseResultCount //
	/////////////////////

	/**	 The entity baseResultCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer baseResultCount;

	/**	<br> The entity baseResultCount
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage&fq=entiteVar_enUS_indexed_string:baseResultCount">Find the entity baseResultCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _baseResultCount(Wrap<Integer> w);

	public Integer getBaseResultCount() {
		return baseResultCount;
	}

	public void setBaseResultCount(Integer baseResultCount) {
		this.baseResultCount = baseResultCount;
	}
	@JsonIgnore
	public void setBaseResultCount(String o) {
		this.baseResultCount = BaseResultGenPage.staticSetBaseResultCount(siteRequest_, o);
	}
	public static Integer staticSetBaseResultCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected BaseResultGenPage baseResultCountInit() {
		Wrap<Integer> baseResultCountWrap = new Wrap<Integer>().var("baseResultCount");
		if(baseResultCount == null) {
			_baseResultCount(baseResultCountWrap);
			setBaseResultCount(baseResultCountWrap.o);
		}
		return (BaseResultGenPage)this;
	}

	public static Integer staticSearchBaseResultCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrBaseResultCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqBaseResultCount(SiteRequestEnUS siteRequest_, String o) {
		return BaseResultGenPage.staticSearchStrBaseResultCount(siteRequest_, BaseResultGenPage.staticSearchBaseResultCount(siteRequest_, BaseResultGenPage.staticSetBaseResultCount(siteRequest_, o)));
	}

	/////////////////
	// baseResult_ //
	/////////////////

	/**	 The entity baseResult_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected BaseResult baseResult_;

	/**	<br> The entity baseResult_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage&fq=entiteVar_enUS_indexed_string:baseResult_">Find the entity baseResult_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _baseResult_(Wrap<BaseResult> w);

	public BaseResult getBaseResult_() {
		return baseResult_;
	}

	public void setBaseResult_(BaseResult baseResult_) {
		this.baseResult_ = baseResult_;
	}
	public static BaseResult staticSetBaseResult_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected BaseResultGenPage baseResult_Init() {
		Wrap<BaseResult> baseResult_Wrap = new Wrap<BaseResult>().var("baseResult_");
		if(baseResult_ == null) {
			_baseResult_(baseResult_Wrap);
			setBaseResult_(baseResult_Wrap.o);
		}
		return (BaseResultGenPage)this;
	}

	////////
	// id //
	////////

	/**	 The entity id
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String id;

	/**	<br> The entity id
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.base.BaseResultGenPage&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = BaseResultGenPage.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected BaseResultGenPage idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			setId(idWrap.o);
		}
		return (BaseResultGenPage)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return BaseResultGenPage.staticSearchStrId(siteRequest_, BaseResultGenPage.staticSearchId(siteRequest_, BaseResultGenPage.staticSetId(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepBaseResultGenPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepBaseResultGenPage();
	}

	public Future<Void> promiseDeepBaseResultGenPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseBaseResultGenPage(promise2);
		promise2.future().onSuccess(a -> {
			super.promiseDeepPageLayout(siteRequest_).onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseBaseResultGenPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				searchListBaseResult_Init();
				pageResponseInit();
				defaultZoneIdInit();
				defaultTimeZoneInit();
				defaultLocaleIdInit();
				defaultLocaleInit();
				defaultRangeGapInit();
				defaultRangeEndInit();
				defaultRangeStartInit();
				defaultRangeVarInit();
				defaultFacetSortInit();
				defaultFacetLimitInit();
				defaultFacetMinCountInit();
				defaultPivotMinCountInit();
				DEFAULT_MAP_LOCATIONInit();
				DEFAULT_MAP_ZOOMInit();
				defaultFieldListVarsInit();
				defaultStatsVarsInit();
				defaultPivotVarsInit();
				listBaseResultInit();
				statsInit();
				facetCountsInit();
				baseResultCountInit();
				baseResult_Init();
				idInit();
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
		return promiseDeepBaseResultGenPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestBaseResultGenPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestPageLayout(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestBaseResultGenPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainBaseResultGenPage(v);
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
	public Object obtainBaseResultGenPage(String var) {
		BaseResultGenPage oBaseResultGenPage = (BaseResultGenPage)this;
		switch(var) {
			case "searchListBaseResult_":
				return oBaseResultGenPage.searchListBaseResult_;
			case "pageResponse":
				return oBaseResultGenPage.pageResponse;
			case "defaultZoneId":
				return oBaseResultGenPage.defaultZoneId;
			case "defaultTimeZone":
				return oBaseResultGenPage.defaultTimeZone;
			case "defaultLocaleId":
				return oBaseResultGenPage.defaultLocaleId;
			case "defaultLocale":
				return oBaseResultGenPage.defaultLocale;
			case "defaultRangeGap":
				return oBaseResultGenPage.defaultRangeGap;
			case "defaultRangeEnd":
				return oBaseResultGenPage.defaultRangeEnd;
			case "defaultRangeStart":
				return oBaseResultGenPage.defaultRangeStart;
			case "defaultRangeVar":
				return oBaseResultGenPage.defaultRangeVar;
			case "defaultFacetSort":
				return oBaseResultGenPage.defaultFacetSort;
			case "defaultFacetLimit":
				return oBaseResultGenPage.defaultFacetLimit;
			case "defaultFacetMinCount":
				return oBaseResultGenPage.defaultFacetMinCount;
			case "defaultPivotMinCount":
				return oBaseResultGenPage.defaultPivotMinCount;
			case "DEFAULT_MAP_LOCATION":
				return oBaseResultGenPage.DEFAULT_MAP_LOCATION;
			case "DEFAULT_MAP_ZOOM":
				return oBaseResultGenPage.DEFAULT_MAP_ZOOM;
			case "defaultFieldListVars":
				return oBaseResultGenPage.defaultFieldListVars;
			case "defaultStatsVars":
				return oBaseResultGenPage.defaultStatsVars;
			case "defaultPivotVars":
				return oBaseResultGenPage.defaultPivotVars;
			case "listBaseResult":
				return oBaseResultGenPage.listBaseResult;
			case "stats":
				return oBaseResultGenPage.stats;
			case "facetCounts":
				return oBaseResultGenPage.facetCounts;
			case "baseResultCount":
				return oBaseResultGenPage.baseResultCount;
			case "baseResult_":
				return oBaseResultGenPage.baseResult_;
			case "id":
				return oBaseResultGenPage.id;
			default:
				return super.obtainPageLayout(var);
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
				o = relateBaseResultGenPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateBaseResultGenPage(String var, Object val) {
		BaseResultGenPage oBaseResultGenPage = (BaseResultGenPage)this;
		switch(var) {
			default:
				return super.relatePageLayout(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetBaseResultGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetBaseResultGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "pageResponse":
			return BaseResultGenPage.staticSetPageResponse(siteRequest_, o);
		case "defaultZoneId":
			return BaseResultGenPage.staticSetDefaultZoneId(siteRequest_, o);
		case "defaultLocaleId":
			return BaseResultGenPage.staticSetDefaultLocaleId(siteRequest_, o);
		case "defaultRangeGap":
			return BaseResultGenPage.staticSetDefaultRangeGap(siteRequest_, o);
		case "defaultRangeEnd":
			return BaseResultGenPage.staticSetDefaultRangeEnd(siteRequest_, o);
		case "defaultRangeStart":
			return BaseResultGenPage.staticSetDefaultRangeStart(siteRequest_, o);
		case "defaultRangeVar":
			return BaseResultGenPage.staticSetDefaultRangeVar(siteRequest_, o);
		case "defaultFacetSort":
			return BaseResultGenPage.staticSetDefaultFacetSort(siteRequest_, o);
		case "defaultFacetLimit":
			return BaseResultGenPage.staticSetDefaultFacetLimit(siteRequest_, o);
		case "defaultFacetMinCount":
			return BaseResultGenPage.staticSetDefaultFacetMinCount(siteRequest_, o);
		case "defaultPivotMinCount":
			return BaseResultGenPage.staticSetDefaultPivotMinCount(siteRequest_, o);
		case "DEFAULT_MAP_LOCATION":
			return BaseResultGenPage.staticSetDEFAULT_MAP_LOCATION(siteRequest_, o);
		case "DEFAULT_MAP_ZOOM":
			return BaseResultGenPage.staticSetDEFAULT_MAP_ZOOM(siteRequest_, o);
		case "defaultFieldListVars":
			return BaseResultGenPage.staticSetDefaultFieldListVars(siteRequest_, o);
		case "defaultStatsVars":
			return BaseResultGenPage.staticSetDefaultStatsVars(siteRequest_, o);
		case "defaultPivotVars":
			return BaseResultGenPage.staticSetDefaultPivotVars(siteRequest_, o);
		case "baseResultCount":
			return BaseResultGenPage.staticSetBaseResultCount(siteRequest_, o);
		case "id":
			return BaseResultGenPage.staticSetId(siteRequest_, o);
			default:
				return PageLayout.staticSetPageLayout(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchBaseResultGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchBaseResultGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "pageResponse":
			return BaseResultGenPage.staticSearchPageResponse(siteRequest_, (String)o);
		case "defaultZoneId":
			return BaseResultGenPage.staticSearchDefaultZoneId(siteRequest_, (String)o);
		case "defaultLocaleId":
			return BaseResultGenPage.staticSearchDefaultLocaleId(siteRequest_, (String)o);
		case "defaultRangeGap":
			return BaseResultGenPage.staticSearchDefaultRangeGap(siteRequest_, (String)o);
		case "defaultRangeEnd":
			return BaseResultGenPage.staticSearchDefaultRangeEnd(siteRequest_, (ZonedDateTime)o);
		case "defaultRangeStart":
			return BaseResultGenPage.staticSearchDefaultRangeStart(siteRequest_, (ZonedDateTime)o);
		case "defaultRangeVar":
			return BaseResultGenPage.staticSearchDefaultRangeVar(siteRequest_, (String)o);
		case "defaultFacetSort":
			return BaseResultGenPage.staticSearchDefaultFacetSort(siteRequest_, (String)o);
		case "defaultFacetLimit":
			return BaseResultGenPage.staticSearchDefaultFacetLimit(siteRequest_, (Integer)o);
		case "defaultFacetMinCount":
			return BaseResultGenPage.staticSearchDefaultFacetMinCount(siteRequest_, (Integer)o);
		case "defaultPivotMinCount":
			return BaseResultGenPage.staticSearchDefaultPivotMinCount(siteRequest_, (Integer)o);
		case "DEFAULT_MAP_LOCATION":
			return BaseResultGenPage.staticSearchDEFAULT_MAP_LOCATION(siteRequest_, (JsonObject)o);
		case "DEFAULT_MAP_ZOOM":
			return BaseResultGenPage.staticSearchDEFAULT_MAP_ZOOM(siteRequest_, (BigDecimal)o);
		case "defaultFieldListVars":
			return BaseResultGenPage.staticSearchDefaultFieldListVars(siteRequest_, (String)o);
		case "defaultStatsVars":
			return BaseResultGenPage.staticSearchDefaultStatsVars(siteRequest_, (String)o);
		case "defaultPivotVars":
			return BaseResultGenPage.staticSearchDefaultPivotVars(siteRequest_, (String)o);
		case "baseResultCount":
			return BaseResultGenPage.staticSearchBaseResultCount(siteRequest_, (Integer)o);
		case "id":
			return BaseResultGenPage.staticSearchId(siteRequest_, (String)o);
			default:
				return PageLayout.staticSearchPageLayout(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrBaseResultGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrBaseResultGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "pageResponse":
			return BaseResultGenPage.staticSearchStrPageResponse(siteRequest_, (String)o);
		case "defaultZoneId":
			return BaseResultGenPage.staticSearchStrDefaultZoneId(siteRequest_, (String)o);
		case "defaultLocaleId":
			return BaseResultGenPage.staticSearchStrDefaultLocaleId(siteRequest_, (String)o);
		case "defaultRangeGap":
			return BaseResultGenPage.staticSearchStrDefaultRangeGap(siteRequest_, (String)o);
		case "defaultRangeEnd":
			return BaseResultGenPage.staticSearchStrDefaultRangeEnd(siteRequest_, (Date)o);
		case "defaultRangeStart":
			return BaseResultGenPage.staticSearchStrDefaultRangeStart(siteRequest_, (Date)o);
		case "defaultRangeVar":
			return BaseResultGenPage.staticSearchStrDefaultRangeVar(siteRequest_, (String)o);
		case "defaultFacetSort":
			return BaseResultGenPage.staticSearchStrDefaultFacetSort(siteRequest_, (String)o);
		case "defaultFacetLimit":
			return BaseResultGenPage.staticSearchStrDefaultFacetLimit(siteRequest_, (Integer)o);
		case "defaultFacetMinCount":
			return BaseResultGenPage.staticSearchStrDefaultFacetMinCount(siteRequest_, (Integer)o);
		case "defaultPivotMinCount":
			return BaseResultGenPage.staticSearchStrDefaultPivotMinCount(siteRequest_, (Integer)o);
		case "DEFAULT_MAP_LOCATION":
			return BaseResultGenPage.staticSearchStrDEFAULT_MAP_LOCATION(siteRequest_, (JsonObject)o);
		case "DEFAULT_MAP_ZOOM":
			return BaseResultGenPage.staticSearchStrDEFAULT_MAP_ZOOM(siteRequest_, (Double)o);
		case "defaultFieldListVars":
			return BaseResultGenPage.staticSearchStrDefaultFieldListVars(siteRequest_, (String)o);
		case "defaultStatsVars":
			return BaseResultGenPage.staticSearchStrDefaultStatsVars(siteRequest_, (String)o);
		case "defaultPivotVars":
			return BaseResultGenPage.staticSearchStrDefaultPivotVars(siteRequest_, (String)o);
		case "baseResultCount":
			return BaseResultGenPage.staticSearchStrBaseResultCount(siteRequest_, (Integer)o);
		case "id":
			return BaseResultGenPage.staticSearchStrId(siteRequest_, (String)o);
			default:
				return PageLayout.staticSearchStrPageLayout(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqBaseResultGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqBaseResultGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "pageResponse":
			return BaseResultGenPage.staticSearchFqPageResponse(siteRequest_, o);
		case "defaultZoneId":
			return BaseResultGenPage.staticSearchFqDefaultZoneId(siteRequest_, o);
		case "defaultLocaleId":
			return BaseResultGenPage.staticSearchFqDefaultLocaleId(siteRequest_, o);
		case "defaultRangeGap":
			return BaseResultGenPage.staticSearchFqDefaultRangeGap(siteRequest_, o);
		case "defaultRangeEnd":
			return BaseResultGenPage.staticSearchFqDefaultRangeEnd(siteRequest_, o);
		case "defaultRangeStart":
			return BaseResultGenPage.staticSearchFqDefaultRangeStart(siteRequest_, o);
		case "defaultRangeVar":
			return BaseResultGenPage.staticSearchFqDefaultRangeVar(siteRequest_, o);
		case "defaultFacetSort":
			return BaseResultGenPage.staticSearchFqDefaultFacetSort(siteRequest_, o);
		case "defaultFacetLimit":
			return BaseResultGenPage.staticSearchFqDefaultFacetLimit(siteRequest_, o);
		case "defaultFacetMinCount":
			return BaseResultGenPage.staticSearchFqDefaultFacetMinCount(siteRequest_, o);
		case "defaultPivotMinCount":
			return BaseResultGenPage.staticSearchFqDefaultPivotMinCount(siteRequest_, o);
		case "DEFAULT_MAP_LOCATION":
			return BaseResultGenPage.staticSearchFqDEFAULT_MAP_LOCATION(siteRequest_, o);
		case "DEFAULT_MAP_ZOOM":
			return BaseResultGenPage.staticSearchFqDEFAULT_MAP_ZOOM(siteRequest_, o);
		case "defaultFieldListVars":
			return BaseResultGenPage.staticSearchFqDefaultFieldListVars(siteRequest_, o);
		case "defaultStatsVars":
			return BaseResultGenPage.staticSearchFqDefaultStatsVars(siteRequest_, o);
		case "defaultPivotVars":
			return BaseResultGenPage.staticSearchFqDefaultPivotVars(siteRequest_, o);
		case "baseResultCount":
			return BaseResultGenPage.staticSearchFqBaseResultCount(siteRequest_, o);
		case "id":
			return BaseResultGenPage.staticSearchFqId(siteRequest_, o);
			default:
				return PageLayout.staticSearchFqPageLayout(entityVar,  siteRequest_, o);
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "BaseResultGenPage";
	public static final String VAR_searchListBaseResult_ = "searchListBaseResult_";
	public static final String VAR_pageResponse = "pageResponse";
	public static final String VAR_defaultZoneId = "defaultZoneId";
	public static final String VAR_defaultTimeZone = "defaultTimeZone";
	public static final String VAR_defaultLocaleId = "defaultLocaleId";
	public static final String VAR_defaultLocale = "defaultLocale";
	public static final String VAR_defaultRangeGap = "defaultRangeGap";
	public static final String VAR_defaultRangeEnd = "defaultRangeEnd";
	public static final String VAR_defaultRangeStart = "defaultRangeStart";
	public static final String VAR_defaultRangeVar = "defaultRangeVar";
	public static final String VAR_defaultFacetSort = "defaultFacetSort";
	public static final String VAR_defaultFacetLimit = "defaultFacetLimit";
	public static final String VAR_defaultFacetMinCount = "defaultFacetMinCount";
	public static final String VAR_defaultPivotMinCount = "defaultPivotMinCount";
	public static final String VAR_DEFAULT_MAP_LOCATION = "DEFAULT_MAP_LOCATION";
	public static final String VAR_DEFAULT_MAP_ZOOM = "DEFAULT_MAP_ZOOM";
	public static final String VAR_defaultFieldListVars = "defaultFieldListVars";
	public static final String VAR_defaultStatsVars = "defaultStatsVars";
	public static final String VAR_defaultPivotVars = "defaultPivotVars";
	public static final String VAR_listBaseResult = "listBaseResult";
	public static final String VAR_stats = "stats";
	public static final String VAR_facetCounts = "facetCounts";
	public static final String VAR_baseResultCount = "baseResultCount";
	public static final String VAR_baseResult_ = "baseResult_";
	public static final String VAR_id = "id";

	public static final String DISPLAY_NAME_searchListBaseResult_ = "";
	public static final String DISPLAY_NAME_pageResponse = "";
	public static final String DISPLAY_NAME_defaultZoneId = "";
	public static final String DISPLAY_NAME_defaultTimeZone = "";
	public static final String DISPLAY_NAME_defaultLocaleId = "";
	public static final String DISPLAY_NAME_defaultLocale = "";
	public static final String DISPLAY_NAME_defaultRangeGap = "";
	public static final String DISPLAY_NAME_defaultRangeEnd = "";
	public static final String DISPLAY_NAME_defaultRangeStart = "";
	public static final String DISPLAY_NAME_defaultRangeVar = "";
	public static final String DISPLAY_NAME_defaultFacetSort = "";
	public static final String DISPLAY_NAME_defaultFacetLimit = "";
	public static final String DISPLAY_NAME_defaultFacetMinCount = "";
	public static final String DISPLAY_NAME_defaultPivotMinCount = "";
	public static final String DISPLAY_NAME_DEFAULT_MAP_LOCATION = "";
	public static final String DISPLAY_NAME_DEFAULT_MAP_ZOOM = "";
	public static final String DISPLAY_NAME_defaultFieldListVars = "";
	public static final String DISPLAY_NAME_defaultStatsVars = "";
	public static final String DISPLAY_NAME_defaultPivotVars = "";
	public static final String DISPLAY_NAME_listBaseResult = "";
	public static final String DISPLAY_NAME_stats = "";
	public static final String DISPLAY_NAME_facetCounts = "";
	public static final String DISPLAY_NAME_baseResultCount = "";
	public static final String DISPLAY_NAME_baseResult_ = "";
	public static final String DISPLAY_NAME_id = "";

	public static String displayNameForClass(String var) {
		return BaseResultGenPage.displayNameBaseResultGenPage(var);
	}
	public static String displayNameBaseResultGenPage(String var) {
		switch(var) {
		case VAR_searchListBaseResult_:
			return DISPLAY_NAME_searchListBaseResult_;
		case VAR_pageResponse:
			return DISPLAY_NAME_pageResponse;
		case VAR_defaultZoneId:
			return DISPLAY_NAME_defaultZoneId;
		case VAR_defaultTimeZone:
			return DISPLAY_NAME_defaultTimeZone;
		case VAR_defaultLocaleId:
			return DISPLAY_NAME_defaultLocaleId;
		case VAR_defaultLocale:
			return DISPLAY_NAME_defaultLocale;
		case VAR_defaultRangeGap:
			return DISPLAY_NAME_defaultRangeGap;
		case VAR_defaultRangeEnd:
			return DISPLAY_NAME_defaultRangeEnd;
		case VAR_defaultRangeStart:
			return DISPLAY_NAME_defaultRangeStart;
		case VAR_defaultRangeVar:
			return DISPLAY_NAME_defaultRangeVar;
		case VAR_defaultFacetSort:
			return DISPLAY_NAME_defaultFacetSort;
		case VAR_defaultFacetLimit:
			return DISPLAY_NAME_defaultFacetLimit;
		case VAR_defaultFacetMinCount:
			return DISPLAY_NAME_defaultFacetMinCount;
		case VAR_defaultPivotMinCount:
			return DISPLAY_NAME_defaultPivotMinCount;
		case VAR_DEFAULT_MAP_LOCATION:
			return DISPLAY_NAME_DEFAULT_MAP_LOCATION;
		case VAR_DEFAULT_MAP_ZOOM:
			return DISPLAY_NAME_DEFAULT_MAP_ZOOM;
		case VAR_defaultFieldListVars:
			return DISPLAY_NAME_defaultFieldListVars;
		case VAR_defaultStatsVars:
			return DISPLAY_NAME_defaultStatsVars;
		case VAR_defaultPivotVars:
			return DISPLAY_NAME_defaultPivotVars;
		case VAR_listBaseResult:
			return DISPLAY_NAME_listBaseResult;
		case VAR_stats:
			return DISPLAY_NAME_stats;
		case VAR_facetCounts:
			return DISPLAY_NAME_facetCounts;
		case VAR_baseResultCount:
			return DISPLAY_NAME_baseResultCount;
		case VAR_baseResult_:
			return DISPLAY_NAME_baseResult_;
		case VAR_id:
			return DISPLAY_NAME_id;
		default:
			return PageLayout.displayNamePageLayout(var);
		}
	}
}
