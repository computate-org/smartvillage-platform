package org.computate.smartvillageview.enus.result.iotnode.step;

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
import org.computate.smartvillageview.enus.model.base.BaseModelPage;
import org.computate.vertx.search.list.SearchList;
import org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStep;
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
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class IotNodeStepGenPageGen into the class IotNodeStepGenPage. 
 * </li>
 * <li>You can add a class comment "Api: true" if you wish to GET, POST, PATCH or PUT these IotNodeStepGenPage objects in a RESTful API. 
 * </li>
 * </ol>
 * <h1>About the IotNodeStepGenPage class and it's generated class IotNodeStepGenPageGen&lt;BaseModelPage&gt;: </h1>
 * <p>
 * This Java class extends a generated Java class built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepGenPage">Find the class IotNodeStepGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * <p>
 * Delete the class IotNodeStepGenPage in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepGenPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.result.iotnode.step in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smart-village-view in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smart\-village\-view&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class IotNodeStepGenPageGen<DEV> extends BaseModelPage {
	protected static final Logger LOG = LoggerFactory.getLogger(IotNodeStepGenPage.class);

	////////////////////////////
	// searchListIotNodeStep_ //
	////////////////////////////

	/**	 The entity searchListIotNodeStep_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<IotNodeStep> searchListIotNodeStep_;

	/**	<br> The entity searchListIotNodeStep_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepGenPage&fq=entiteVar_enUS_indexed_string:searchListIotNodeStep_">Find the entity searchListIotNodeStep_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchListIotNodeStep_(Wrap<SearchList<IotNodeStep>> w);

	public SearchList<IotNodeStep> getSearchListIotNodeStep_() {
		return searchListIotNodeStep_;
	}

	public void setSearchListIotNodeStep_(SearchList<IotNodeStep> searchListIotNodeStep_) {
		this.searchListIotNodeStep_ = searchListIotNodeStep_;
	}
	public static SearchList<IotNodeStep> staticSetSearchListIotNodeStep_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected IotNodeStepGenPage searchListIotNodeStep_Init() {
		Wrap<SearchList<IotNodeStep>> searchListIotNodeStep_Wrap = new Wrap<SearchList<IotNodeStep>>().var("searchListIotNodeStep_");
		if(searchListIotNodeStep_ == null) {
			_searchListIotNodeStep_(searchListIotNodeStep_Wrap);
			setSearchListIotNodeStep_(searchListIotNodeStep_Wrap.o);
		}
		return (IotNodeStepGenPage)this;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepGenPage&fq=entiteVar_enUS_indexed_string:pageResponse">Find the entity pageResponse in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageResponse(Wrap<String> w);

	public String getPageResponse() {
		return pageResponse;
	}
	public void setPageResponse(String o) {
		this.pageResponse = IotNodeStepGenPage.staticSetPageResponse(siteRequest_, o);
	}
	public static String staticSetPageResponse(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected IotNodeStepGenPage pageResponseInit() {
		Wrap<String> pageResponseWrap = new Wrap<String>().var("pageResponse");
		if(pageResponse == null) {
			_pageResponse(pageResponseWrap);
			setPageResponse(pageResponseWrap.o);
		}
		return (IotNodeStepGenPage)this;
	}

	public static String staticSearchPageResponse(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageResponse(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageResponse(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStepGenPage.staticSearchStrPageResponse(siteRequest_, IotNodeStepGenPage.staticSearchPageResponse(siteRequest_, IotNodeStepGenPage.staticSetPageResponse(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepGenPage&fq=entiteVar_enUS_indexed_string:defaultZoneId">Find the entity defaultZoneId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultZoneId(Wrap<String> w);

	public String getDefaultZoneId() {
		return defaultZoneId;
	}
	public void setDefaultZoneId(String o) {
		this.defaultZoneId = IotNodeStepGenPage.staticSetDefaultZoneId(siteRequest_, o);
	}
	public static String staticSetDefaultZoneId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected IotNodeStepGenPage defaultZoneIdInit() {
		Wrap<String> defaultZoneIdWrap = new Wrap<String>().var("defaultZoneId");
		if(defaultZoneId == null) {
			_defaultZoneId(defaultZoneIdWrap);
			setDefaultZoneId(defaultZoneIdWrap.o);
		}
		return (IotNodeStepGenPage)this;
	}

	public static String staticSearchDefaultZoneId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDefaultZoneId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultZoneId(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStepGenPage.staticSearchStrDefaultZoneId(siteRequest_, IotNodeStepGenPage.staticSearchDefaultZoneId(siteRequest_, IotNodeStepGenPage.staticSetDefaultZoneId(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepGenPage&fq=entiteVar_enUS_indexed_string:defaultTimeZone">Find the entity defaultTimeZone in Solr</a>
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
	protected IotNodeStepGenPage defaultTimeZoneInit() {
		Wrap<ZoneId> defaultTimeZoneWrap = new Wrap<ZoneId>().var("defaultTimeZone");
		if(defaultTimeZone == null) {
			_defaultTimeZone(defaultTimeZoneWrap);
			setDefaultTimeZone(defaultTimeZoneWrap.o);
		}
		return (IotNodeStepGenPage)this;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepGenPage&fq=entiteVar_enUS_indexed_string:defaultLocaleId">Find the entity defaultLocaleId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultLocaleId(Wrap<String> w);

	public String getDefaultLocaleId() {
		return defaultLocaleId;
	}
	public void setDefaultLocaleId(String o) {
		this.defaultLocaleId = IotNodeStepGenPage.staticSetDefaultLocaleId(siteRequest_, o);
	}
	public static String staticSetDefaultLocaleId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected IotNodeStepGenPage defaultLocaleIdInit() {
		Wrap<String> defaultLocaleIdWrap = new Wrap<String>().var("defaultLocaleId");
		if(defaultLocaleId == null) {
			_defaultLocaleId(defaultLocaleIdWrap);
			setDefaultLocaleId(defaultLocaleIdWrap.o);
		}
		return (IotNodeStepGenPage)this;
	}

	public static String staticSearchDefaultLocaleId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDefaultLocaleId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultLocaleId(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStepGenPage.staticSearchStrDefaultLocaleId(siteRequest_, IotNodeStepGenPage.staticSearchDefaultLocaleId(siteRequest_, IotNodeStepGenPage.staticSetDefaultLocaleId(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepGenPage&fq=entiteVar_enUS_indexed_string:defaultLocale">Find the entity defaultLocale in Solr</a>
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
	protected IotNodeStepGenPage defaultLocaleInit() {
		Wrap<Locale> defaultLocaleWrap = new Wrap<Locale>().var("defaultLocale");
		if(defaultLocale == null) {
			_defaultLocale(defaultLocaleWrap);
			setDefaultLocale(defaultLocaleWrap.o);
		}
		return (IotNodeStepGenPage)this;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepGenPage&fq=entiteVar_enUS_indexed_string:defaultRangeGap">Find the entity defaultRangeGap in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultRangeGap(Wrap<String> w);

	public String getDefaultRangeGap() {
		return defaultRangeGap;
	}
	public void setDefaultRangeGap(String o) {
		this.defaultRangeGap = IotNodeStepGenPage.staticSetDefaultRangeGap(siteRequest_, o);
	}
	public static String staticSetDefaultRangeGap(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected IotNodeStepGenPage defaultRangeGapInit() {
		Wrap<String> defaultRangeGapWrap = new Wrap<String>().var("defaultRangeGap");
		if(defaultRangeGap == null) {
			_defaultRangeGap(defaultRangeGapWrap);
			setDefaultRangeGap(defaultRangeGapWrap.o);
		}
		return (IotNodeStepGenPage)this;
	}

	public static String staticSearchDefaultRangeGap(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDefaultRangeGap(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultRangeGap(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStepGenPage.staticSearchStrDefaultRangeGap(siteRequest_, IotNodeStepGenPage.staticSearchDefaultRangeGap(siteRequest_, IotNodeStepGenPage.staticSetDefaultRangeGap(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepGenPage&fq=entiteVar_enUS_indexed_string:defaultRangeEnd">Find the entity defaultRangeEnd in Solr</a>
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
		this.defaultRangeEnd = IotNodeStepGenPage.staticSetDefaultRangeEnd(siteRequest_, o);
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
	protected IotNodeStepGenPage defaultRangeEndInit() {
		Wrap<ZonedDateTime> defaultRangeEndWrap = new Wrap<ZonedDateTime>().var("defaultRangeEnd");
		if(defaultRangeEnd == null) {
			_defaultRangeEnd(defaultRangeEndWrap);
			setDefaultRangeEnd(defaultRangeEndWrap.o);
		}
		return (IotNodeStepGenPage)this;
	}

	public static Date staticSearchDefaultRangeEnd(SiteRequestEnUS siteRequest_, ZonedDateTime o) {
		return o == null ? null : Date.from(o.toInstant());
	}

	public static String staticSearchStrDefaultRangeEnd(SiteRequestEnUS siteRequest_, Date o) {
		return "\"" + DateTimeFormatter.ISO_DATE_TIME.format(o.toInstant().atOffset(ZoneOffset.UTC)) + "\"";
	}

	public static String staticSearchFqDefaultRangeEnd(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStepGenPage.staticSearchStrDefaultRangeEnd(siteRequest_, IotNodeStepGenPage.staticSearchDefaultRangeEnd(siteRequest_, IotNodeStepGenPage.staticSetDefaultRangeEnd(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepGenPage&fq=entiteVar_enUS_indexed_string:defaultRangeStart">Find the entity defaultRangeStart in Solr</a>
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
		this.defaultRangeStart = IotNodeStepGenPage.staticSetDefaultRangeStart(siteRequest_, o);
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
	protected IotNodeStepGenPage defaultRangeStartInit() {
		Wrap<ZonedDateTime> defaultRangeStartWrap = new Wrap<ZonedDateTime>().var("defaultRangeStart");
		if(defaultRangeStart == null) {
			_defaultRangeStart(defaultRangeStartWrap);
			setDefaultRangeStart(defaultRangeStartWrap.o);
		}
		return (IotNodeStepGenPage)this;
	}

	public static Date staticSearchDefaultRangeStart(SiteRequestEnUS siteRequest_, ZonedDateTime o) {
		return o == null ? null : Date.from(o.toInstant());
	}

	public static String staticSearchStrDefaultRangeStart(SiteRequestEnUS siteRequest_, Date o) {
		return "\"" + DateTimeFormatter.ISO_DATE_TIME.format(o.toInstant().atOffset(ZoneOffset.UTC)) + "\"";
	}

	public static String staticSearchFqDefaultRangeStart(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStepGenPage.staticSearchStrDefaultRangeStart(siteRequest_, IotNodeStepGenPage.staticSearchDefaultRangeStart(siteRequest_, IotNodeStepGenPage.staticSetDefaultRangeStart(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepGenPage&fq=entiteVar_enUS_indexed_string:defaultRangeVar">Find the entity defaultRangeVar in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultRangeVar(Wrap<String> w);

	public String getDefaultRangeVar() {
		return defaultRangeVar;
	}
	public void setDefaultRangeVar(String o) {
		this.defaultRangeVar = IotNodeStepGenPage.staticSetDefaultRangeVar(siteRequest_, o);
	}
	public static String staticSetDefaultRangeVar(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected IotNodeStepGenPage defaultRangeVarInit() {
		Wrap<String> defaultRangeVarWrap = new Wrap<String>().var("defaultRangeVar");
		if(defaultRangeVar == null) {
			_defaultRangeVar(defaultRangeVarWrap);
			setDefaultRangeVar(defaultRangeVarWrap.o);
		}
		return (IotNodeStepGenPage)this;
	}

	public static String staticSearchDefaultRangeVar(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDefaultRangeVar(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultRangeVar(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStepGenPage.staticSearchStrDefaultRangeVar(siteRequest_, IotNodeStepGenPage.staticSearchDefaultRangeVar(siteRequest_, IotNodeStepGenPage.staticSetDefaultRangeVar(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepGenPage&fq=entiteVar_enUS_indexed_string:defaultFacetSort">Find the entity defaultFacetSort in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultFacetSort(Wrap<String> w);

	public String getDefaultFacetSort() {
		return defaultFacetSort;
	}
	public void setDefaultFacetSort(String o) {
		this.defaultFacetSort = IotNodeStepGenPage.staticSetDefaultFacetSort(siteRequest_, o);
	}
	public static String staticSetDefaultFacetSort(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected IotNodeStepGenPage defaultFacetSortInit() {
		Wrap<String> defaultFacetSortWrap = new Wrap<String>().var("defaultFacetSort");
		if(defaultFacetSort == null) {
			_defaultFacetSort(defaultFacetSortWrap);
			setDefaultFacetSort(defaultFacetSortWrap.o);
		}
		return (IotNodeStepGenPage)this;
	}

	public static String staticSearchDefaultFacetSort(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDefaultFacetSort(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultFacetSort(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStepGenPage.staticSearchStrDefaultFacetSort(siteRequest_, IotNodeStepGenPage.staticSearchDefaultFacetSort(siteRequest_, IotNodeStepGenPage.staticSetDefaultFacetSort(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepGenPage&fq=entiteVar_enUS_indexed_string:defaultFacetLimit">Find the entity defaultFacetLimit in Solr</a>
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
		this.defaultFacetLimit = IotNodeStepGenPage.staticSetDefaultFacetLimit(siteRequest_, o);
	}
	public static Integer staticSetDefaultFacetLimit(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected IotNodeStepGenPage defaultFacetLimitInit() {
		Wrap<Integer> defaultFacetLimitWrap = new Wrap<Integer>().var("defaultFacetLimit");
		if(defaultFacetLimit == null) {
			_defaultFacetLimit(defaultFacetLimitWrap);
			setDefaultFacetLimit(defaultFacetLimitWrap.o);
		}
		return (IotNodeStepGenPage)this;
	}

	public static Integer staticSearchDefaultFacetLimit(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrDefaultFacetLimit(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultFacetLimit(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStepGenPage.staticSearchStrDefaultFacetLimit(siteRequest_, IotNodeStepGenPage.staticSearchDefaultFacetLimit(siteRequest_, IotNodeStepGenPage.staticSetDefaultFacetLimit(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepGenPage&fq=entiteVar_enUS_indexed_string:defaultFacetMinCount">Find the entity defaultFacetMinCount in Solr</a>
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
		this.defaultFacetMinCount = IotNodeStepGenPage.staticSetDefaultFacetMinCount(siteRequest_, o);
	}
	public static Integer staticSetDefaultFacetMinCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected IotNodeStepGenPage defaultFacetMinCountInit() {
		Wrap<Integer> defaultFacetMinCountWrap = new Wrap<Integer>().var("defaultFacetMinCount");
		if(defaultFacetMinCount == null) {
			_defaultFacetMinCount(defaultFacetMinCountWrap);
			setDefaultFacetMinCount(defaultFacetMinCountWrap.o);
		}
		return (IotNodeStepGenPage)this;
	}

	public static Integer staticSearchDefaultFacetMinCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrDefaultFacetMinCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultFacetMinCount(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStepGenPage.staticSearchStrDefaultFacetMinCount(siteRequest_, IotNodeStepGenPage.staticSearchDefaultFacetMinCount(siteRequest_, IotNodeStepGenPage.staticSetDefaultFacetMinCount(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepGenPage&fq=entiteVar_enUS_indexed_string:defaultPivotMinCount">Find the entity defaultPivotMinCount in Solr</a>
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
		this.defaultPivotMinCount = IotNodeStepGenPage.staticSetDefaultPivotMinCount(siteRequest_, o);
	}
	public static Integer staticSetDefaultPivotMinCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected IotNodeStepGenPage defaultPivotMinCountInit() {
		Wrap<Integer> defaultPivotMinCountWrap = new Wrap<Integer>().var("defaultPivotMinCount");
		if(defaultPivotMinCount == null) {
			_defaultPivotMinCount(defaultPivotMinCountWrap);
			setDefaultPivotMinCount(defaultPivotMinCountWrap.o);
		}
		return (IotNodeStepGenPage)this;
	}

	public static Integer staticSearchDefaultPivotMinCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrDefaultPivotMinCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultPivotMinCount(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStepGenPage.staticSearchStrDefaultPivotMinCount(siteRequest_, IotNodeStepGenPage.staticSearchDefaultPivotMinCount(siteRequest_, IotNodeStepGenPage.staticSetDefaultPivotMinCount(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepGenPage&fq=entiteVar_enUS_indexed_string:DEFAULT_MAP_LOCATION">Find the entity DEFAULT_MAP_LOCATION in Solr</a>
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
		this.DEFAULT_MAP_LOCATION = IotNodeStepGenPage.staticSetDEFAULT_MAP_LOCATION(siteRequest_, o);
	}
	public static JsonObject staticSetDEFAULT_MAP_LOCATION(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected IotNodeStepGenPage DEFAULT_MAP_LOCATIONInit() {
		Wrap<JsonObject> DEFAULT_MAP_LOCATIONWrap = new Wrap<JsonObject>().var("DEFAULT_MAP_LOCATION");
		if(DEFAULT_MAP_LOCATION == null) {
			_DEFAULT_MAP_LOCATION(DEFAULT_MAP_LOCATIONWrap);
			setDEFAULT_MAP_LOCATION(DEFAULT_MAP_LOCATIONWrap.o);
		}
		return (IotNodeStepGenPage)this;
	}

	public static JsonObject staticSearchDEFAULT_MAP_LOCATION(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrDEFAULT_MAP_LOCATION(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDEFAULT_MAP_LOCATION(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStepGenPage.staticSearchStrDEFAULT_MAP_LOCATION(siteRequest_, IotNodeStepGenPage.staticSearchDEFAULT_MAP_LOCATION(siteRequest_, IotNodeStepGenPage.staticSetDEFAULT_MAP_LOCATION(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepGenPage&fq=entiteVar_enUS_indexed_string:DEFAULT_MAP_ZOOM">Find the entity DEFAULT_MAP_ZOOM in Solr</a>
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
		this.DEFAULT_MAP_ZOOM = IotNodeStepGenPage.staticSetDEFAULT_MAP_ZOOM(siteRequest_, o);
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
	protected IotNodeStepGenPage DEFAULT_MAP_ZOOMInit() {
		Wrap<BigDecimal> DEFAULT_MAP_ZOOMWrap = new Wrap<BigDecimal>().var("DEFAULT_MAP_ZOOM");
		if(DEFAULT_MAP_ZOOM == null) {
			_DEFAULT_MAP_ZOOM(DEFAULT_MAP_ZOOMWrap);
			setDEFAULT_MAP_ZOOM(DEFAULT_MAP_ZOOMWrap.o);
		}
		return (IotNodeStepGenPage)this;
	}

	public static Double staticSearchDEFAULT_MAP_ZOOM(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrDEFAULT_MAP_ZOOM(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDEFAULT_MAP_ZOOM(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStepGenPage.staticSearchStrDEFAULT_MAP_ZOOM(siteRequest_, IotNodeStepGenPage.staticSearchDEFAULT_MAP_ZOOM(siteRequest_, IotNodeStepGenPage.staticSetDEFAULT_MAP_ZOOM(siteRequest_, o)));
	}

	/////////////////////
	// listIotNodeStep //
	/////////////////////

	/**	 The entity listIotNodeStep
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listIotNodeStep = new JsonArray();

	/**	<br> The entity listIotNodeStep
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepGenPage&fq=entiteVar_enUS_indexed_string:listIotNodeStep">Find the entity listIotNodeStep in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _listIotNodeStep(JsonArray l);

	public JsonArray getListIotNodeStep() {
		return listIotNodeStep;
	}

	public void setListIotNodeStep(JsonArray listIotNodeStep) {
		this.listIotNodeStep = listIotNodeStep;
	}
	public static JsonArray staticSetListIotNodeStep(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected IotNodeStepGenPage listIotNodeStepInit() {
		_listIotNodeStep(listIotNodeStep);
		return (IotNodeStepGenPage)this;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepGenPage&fq=entiteVar_enUS_indexed_string:stats">Find the entity stats in Solr</a>
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
	protected IotNodeStepGenPage statsInit() {
		Wrap<Stats> statsWrap = new Wrap<Stats>().var("stats");
		if(stats == null) {
			_stats(statsWrap);
			setStats(statsWrap.o);
		}
		return (IotNodeStepGenPage)this;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepGenPage&fq=entiteVar_enUS_indexed_string:facetCounts">Find the entity facetCounts in Solr</a>
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
	protected IotNodeStepGenPage facetCountsInit() {
		Wrap<FacetCounts> facetCountsWrap = new Wrap<FacetCounts>().var("facetCounts");
		if(facetCounts == null) {
			_facetCounts(facetCountsWrap);
			setFacetCounts(facetCountsWrap.o);
		}
		return (IotNodeStepGenPage)this;
	}

	//////////////////////
	// iotNodeStepCount //
	//////////////////////

	/**	 The entity iotNodeStepCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer iotNodeStepCount;

	/**	<br> The entity iotNodeStepCount
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepGenPage&fq=entiteVar_enUS_indexed_string:iotNodeStepCount">Find the entity iotNodeStepCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _iotNodeStepCount(Wrap<Integer> w);

	public Integer getIotNodeStepCount() {
		return iotNodeStepCount;
	}

	public void setIotNodeStepCount(Integer iotNodeStepCount) {
		this.iotNodeStepCount = iotNodeStepCount;
	}
	@JsonIgnore
	public void setIotNodeStepCount(String o) {
		this.iotNodeStepCount = IotNodeStepGenPage.staticSetIotNodeStepCount(siteRequest_, o);
	}
	public static Integer staticSetIotNodeStepCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected IotNodeStepGenPage iotNodeStepCountInit() {
		Wrap<Integer> iotNodeStepCountWrap = new Wrap<Integer>().var("iotNodeStepCount");
		if(iotNodeStepCount == null) {
			_iotNodeStepCount(iotNodeStepCountWrap);
			setIotNodeStepCount(iotNodeStepCountWrap.o);
		}
		return (IotNodeStepGenPage)this;
	}

	public static Integer staticSearchIotNodeStepCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrIotNodeStepCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqIotNodeStepCount(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStepGenPage.staticSearchStrIotNodeStepCount(siteRequest_, IotNodeStepGenPage.staticSearchIotNodeStepCount(siteRequest_, IotNodeStepGenPage.staticSetIotNodeStepCount(siteRequest_, o)));
	}

	//////////////////
	// iotNodeStep_ //
	//////////////////

	/**	 The entity iotNodeStep_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected IotNodeStep iotNodeStep_;

	/**	<br> The entity iotNodeStep_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepGenPage&fq=entiteVar_enUS_indexed_string:iotNodeStep_">Find the entity iotNodeStep_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _iotNodeStep_(Wrap<IotNodeStep> w);

	public IotNodeStep getIotNodeStep_() {
		return iotNodeStep_;
	}

	public void setIotNodeStep_(IotNodeStep iotNodeStep_) {
		this.iotNodeStep_ = iotNodeStep_;
	}
	public static IotNodeStep staticSetIotNodeStep_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected IotNodeStepGenPage iotNodeStep_Init() {
		Wrap<IotNodeStep> iotNodeStep_Wrap = new Wrap<IotNodeStep>().var("iotNodeStep_");
		if(iotNodeStep_ == null) {
			_iotNodeStep_(iotNodeStep_Wrap);
			setIotNodeStep_(iotNodeStep_Wrap.o);
		}
		return (IotNodeStepGenPage)this;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepGenPage&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = IotNodeStepGenPage.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected IotNodeStepGenPage idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			setId(idWrap.o);
		}
		return (IotNodeStepGenPage)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStepGenPage.staticSearchStrId(siteRequest_, IotNodeStepGenPage.staticSearchId(siteRequest_, IotNodeStepGenPage.staticSetId(siteRequest_, o)));
	}

	////////////////////////
	// pageUriIotNodeStep //
	////////////////////////

	/**	 The entity pageUriIotNodeStep
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUriIotNodeStep;

	/**	<br> The entity pageUriIotNodeStep
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.result.iotnode.step.IotNodeStepGenPage&fq=entiteVar_enUS_indexed_string:pageUriIotNodeStep">Find the entity pageUriIotNodeStep in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUriIotNodeStep(Wrap<String> c);

	public String getPageUriIotNodeStep() {
		return pageUriIotNodeStep;
	}
	public void setPageUriIotNodeStep(String o) {
		this.pageUriIotNodeStep = IotNodeStepGenPage.staticSetPageUriIotNodeStep(siteRequest_, o);
	}
	public static String staticSetPageUriIotNodeStep(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected IotNodeStepGenPage pageUriIotNodeStepInit() {
		Wrap<String> pageUriIotNodeStepWrap = new Wrap<String>().var("pageUriIotNodeStep");
		if(pageUriIotNodeStep == null) {
			_pageUriIotNodeStep(pageUriIotNodeStepWrap);
			setPageUriIotNodeStep(pageUriIotNodeStepWrap.o);
		}
		return (IotNodeStepGenPage)this;
	}

	public static String staticSearchPageUriIotNodeStep(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUriIotNodeStep(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUriIotNodeStep(SiteRequestEnUS siteRequest_, String o) {
		return IotNodeStepGenPage.staticSearchStrPageUriIotNodeStep(siteRequest_, IotNodeStepGenPage.staticSearchPageUriIotNodeStep(siteRequest_, IotNodeStepGenPage.staticSetPageUriIotNodeStep(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepIotNodeStepGenPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepIotNodeStepGenPage();
	}

	public Future<Void> promiseDeepIotNodeStepGenPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseIotNodeStepGenPage(promise2);
		promise2.future().onSuccess(a -> {
			super.promiseDeepBaseModelPage(siteRequest_).onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseIotNodeStepGenPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				searchListIotNodeStep_Init();
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
				listIotNodeStepInit();
				statsInit();
				facetCountsInit();
				iotNodeStepCountInit();
				iotNodeStep_Init();
				idInit();
				pageUriIotNodeStepInit();
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
		return promiseDeepIotNodeStepGenPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestIotNodeStepGenPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestBaseModelPage(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestIotNodeStepGenPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainIotNodeStepGenPage(v);
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
	public Object obtainIotNodeStepGenPage(String var) {
		IotNodeStepGenPage oIotNodeStepGenPage = (IotNodeStepGenPage)this;
		switch(var) {
			case "searchListIotNodeStep_":
				return oIotNodeStepGenPage.searchListIotNodeStep_;
			case "pageResponse":
				return oIotNodeStepGenPage.pageResponse;
			case "defaultZoneId":
				return oIotNodeStepGenPage.defaultZoneId;
			case "defaultTimeZone":
				return oIotNodeStepGenPage.defaultTimeZone;
			case "defaultLocaleId":
				return oIotNodeStepGenPage.defaultLocaleId;
			case "defaultLocale":
				return oIotNodeStepGenPage.defaultLocale;
			case "defaultRangeGap":
				return oIotNodeStepGenPage.defaultRangeGap;
			case "defaultRangeEnd":
				return oIotNodeStepGenPage.defaultRangeEnd;
			case "defaultRangeStart":
				return oIotNodeStepGenPage.defaultRangeStart;
			case "defaultRangeVar":
				return oIotNodeStepGenPage.defaultRangeVar;
			case "defaultFacetSort":
				return oIotNodeStepGenPage.defaultFacetSort;
			case "defaultFacetLimit":
				return oIotNodeStepGenPage.defaultFacetLimit;
			case "defaultFacetMinCount":
				return oIotNodeStepGenPage.defaultFacetMinCount;
			case "defaultPivotMinCount":
				return oIotNodeStepGenPage.defaultPivotMinCount;
			case "DEFAULT_MAP_LOCATION":
				return oIotNodeStepGenPage.DEFAULT_MAP_LOCATION;
			case "DEFAULT_MAP_ZOOM":
				return oIotNodeStepGenPage.DEFAULT_MAP_ZOOM;
			case "listIotNodeStep":
				return oIotNodeStepGenPage.listIotNodeStep;
			case "stats":
				return oIotNodeStepGenPage.stats;
			case "facetCounts":
				return oIotNodeStepGenPage.facetCounts;
			case "iotNodeStepCount":
				return oIotNodeStepGenPage.iotNodeStepCount;
			case "iotNodeStep_":
				return oIotNodeStepGenPage.iotNodeStep_;
			case "id":
				return oIotNodeStepGenPage.id;
			case "pageUriIotNodeStep":
				return oIotNodeStepGenPage.pageUriIotNodeStep;
			default:
				return super.obtainBaseModelPage(var);
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
				o = relateIotNodeStepGenPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateIotNodeStepGenPage(String var, Object val) {
		IotNodeStepGenPage oIotNodeStepGenPage = (IotNodeStepGenPage)this;
		switch(var) {
			default:
				return super.relateBaseModelPage(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetIotNodeStepGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetIotNodeStepGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "pageResponse":
			return IotNodeStepGenPage.staticSetPageResponse(siteRequest_, o);
		case "defaultZoneId":
			return IotNodeStepGenPage.staticSetDefaultZoneId(siteRequest_, o);
		case "defaultLocaleId":
			return IotNodeStepGenPage.staticSetDefaultLocaleId(siteRequest_, o);
		case "defaultRangeGap":
			return IotNodeStepGenPage.staticSetDefaultRangeGap(siteRequest_, o);
		case "defaultRangeEnd":
			return IotNodeStepGenPage.staticSetDefaultRangeEnd(siteRequest_, o);
		case "defaultRangeStart":
			return IotNodeStepGenPage.staticSetDefaultRangeStart(siteRequest_, o);
		case "defaultRangeVar":
			return IotNodeStepGenPage.staticSetDefaultRangeVar(siteRequest_, o);
		case "defaultFacetSort":
			return IotNodeStepGenPage.staticSetDefaultFacetSort(siteRequest_, o);
		case "defaultFacetLimit":
			return IotNodeStepGenPage.staticSetDefaultFacetLimit(siteRequest_, o);
		case "defaultFacetMinCount":
			return IotNodeStepGenPage.staticSetDefaultFacetMinCount(siteRequest_, o);
		case "defaultPivotMinCount":
			return IotNodeStepGenPage.staticSetDefaultPivotMinCount(siteRequest_, o);
		case "DEFAULT_MAP_LOCATION":
			return IotNodeStepGenPage.staticSetDEFAULT_MAP_LOCATION(siteRequest_, o);
		case "DEFAULT_MAP_ZOOM":
			return IotNodeStepGenPage.staticSetDEFAULT_MAP_ZOOM(siteRequest_, o);
		case "iotNodeStepCount":
			return IotNodeStepGenPage.staticSetIotNodeStepCount(siteRequest_, o);
		case "id":
			return IotNodeStepGenPage.staticSetId(siteRequest_, o);
		case "pageUriIotNodeStep":
			return IotNodeStepGenPage.staticSetPageUriIotNodeStep(siteRequest_, o);
			default:
				return BaseModelPage.staticSetBaseModelPage(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchIotNodeStepGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchIotNodeStepGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "pageResponse":
			return IotNodeStepGenPage.staticSearchPageResponse(siteRequest_, (String)o);
		case "defaultZoneId":
			return IotNodeStepGenPage.staticSearchDefaultZoneId(siteRequest_, (String)o);
		case "defaultLocaleId":
			return IotNodeStepGenPage.staticSearchDefaultLocaleId(siteRequest_, (String)o);
		case "defaultRangeGap":
			return IotNodeStepGenPage.staticSearchDefaultRangeGap(siteRequest_, (String)o);
		case "defaultRangeEnd":
			return IotNodeStepGenPage.staticSearchDefaultRangeEnd(siteRequest_, (ZonedDateTime)o);
		case "defaultRangeStart":
			return IotNodeStepGenPage.staticSearchDefaultRangeStart(siteRequest_, (ZonedDateTime)o);
		case "defaultRangeVar":
			return IotNodeStepGenPage.staticSearchDefaultRangeVar(siteRequest_, (String)o);
		case "defaultFacetSort":
			return IotNodeStepGenPage.staticSearchDefaultFacetSort(siteRequest_, (String)o);
		case "defaultFacetLimit":
			return IotNodeStepGenPage.staticSearchDefaultFacetLimit(siteRequest_, (Integer)o);
		case "defaultFacetMinCount":
			return IotNodeStepGenPage.staticSearchDefaultFacetMinCount(siteRequest_, (Integer)o);
		case "defaultPivotMinCount":
			return IotNodeStepGenPage.staticSearchDefaultPivotMinCount(siteRequest_, (Integer)o);
		case "DEFAULT_MAP_LOCATION":
			return IotNodeStepGenPage.staticSearchDEFAULT_MAP_LOCATION(siteRequest_, (JsonObject)o);
		case "DEFAULT_MAP_ZOOM":
			return IotNodeStepGenPage.staticSearchDEFAULT_MAP_ZOOM(siteRequest_, (BigDecimal)o);
		case "iotNodeStepCount":
			return IotNodeStepGenPage.staticSearchIotNodeStepCount(siteRequest_, (Integer)o);
		case "id":
			return IotNodeStepGenPage.staticSearchId(siteRequest_, (String)o);
		case "pageUriIotNodeStep":
			return IotNodeStepGenPage.staticSearchPageUriIotNodeStep(siteRequest_, (String)o);
			default:
				return BaseModelPage.staticSearchBaseModelPage(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrIotNodeStepGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrIotNodeStepGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "pageResponse":
			return IotNodeStepGenPage.staticSearchStrPageResponse(siteRequest_, (String)o);
		case "defaultZoneId":
			return IotNodeStepGenPage.staticSearchStrDefaultZoneId(siteRequest_, (String)o);
		case "defaultLocaleId":
			return IotNodeStepGenPage.staticSearchStrDefaultLocaleId(siteRequest_, (String)o);
		case "defaultRangeGap":
			return IotNodeStepGenPage.staticSearchStrDefaultRangeGap(siteRequest_, (String)o);
		case "defaultRangeEnd":
			return IotNodeStepGenPage.staticSearchStrDefaultRangeEnd(siteRequest_, (Date)o);
		case "defaultRangeStart":
			return IotNodeStepGenPage.staticSearchStrDefaultRangeStart(siteRequest_, (Date)o);
		case "defaultRangeVar":
			return IotNodeStepGenPage.staticSearchStrDefaultRangeVar(siteRequest_, (String)o);
		case "defaultFacetSort":
			return IotNodeStepGenPage.staticSearchStrDefaultFacetSort(siteRequest_, (String)o);
		case "defaultFacetLimit":
			return IotNodeStepGenPage.staticSearchStrDefaultFacetLimit(siteRequest_, (Integer)o);
		case "defaultFacetMinCount":
			return IotNodeStepGenPage.staticSearchStrDefaultFacetMinCount(siteRequest_, (Integer)o);
		case "defaultPivotMinCount":
			return IotNodeStepGenPage.staticSearchStrDefaultPivotMinCount(siteRequest_, (Integer)o);
		case "DEFAULT_MAP_LOCATION":
			return IotNodeStepGenPage.staticSearchStrDEFAULT_MAP_LOCATION(siteRequest_, (JsonObject)o);
		case "DEFAULT_MAP_ZOOM":
			return IotNodeStepGenPage.staticSearchStrDEFAULT_MAP_ZOOM(siteRequest_, (Double)o);
		case "iotNodeStepCount":
			return IotNodeStepGenPage.staticSearchStrIotNodeStepCount(siteRequest_, (Integer)o);
		case "id":
			return IotNodeStepGenPage.staticSearchStrId(siteRequest_, (String)o);
		case "pageUriIotNodeStep":
			return IotNodeStepGenPage.staticSearchStrPageUriIotNodeStep(siteRequest_, (String)o);
			default:
				return BaseModelPage.staticSearchStrBaseModelPage(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqIotNodeStepGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqIotNodeStepGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "pageResponse":
			return IotNodeStepGenPage.staticSearchFqPageResponse(siteRequest_, o);
		case "defaultZoneId":
			return IotNodeStepGenPage.staticSearchFqDefaultZoneId(siteRequest_, o);
		case "defaultLocaleId":
			return IotNodeStepGenPage.staticSearchFqDefaultLocaleId(siteRequest_, o);
		case "defaultRangeGap":
			return IotNodeStepGenPage.staticSearchFqDefaultRangeGap(siteRequest_, o);
		case "defaultRangeEnd":
			return IotNodeStepGenPage.staticSearchFqDefaultRangeEnd(siteRequest_, o);
		case "defaultRangeStart":
			return IotNodeStepGenPage.staticSearchFqDefaultRangeStart(siteRequest_, o);
		case "defaultRangeVar":
			return IotNodeStepGenPage.staticSearchFqDefaultRangeVar(siteRequest_, o);
		case "defaultFacetSort":
			return IotNodeStepGenPage.staticSearchFqDefaultFacetSort(siteRequest_, o);
		case "defaultFacetLimit":
			return IotNodeStepGenPage.staticSearchFqDefaultFacetLimit(siteRequest_, o);
		case "defaultFacetMinCount":
			return IotNodeStepGenPage.staticSearchFqDefaultFacetMinCount(siteRequest_, o);
		case "defaultPivotMinCount":
			return IotNodeStepGenPage.staticSearchFqDefaultPivotMinCount(siteRequest_, o);
		case "DEFAULT_MAP_LOCATION":
			return IotNodeStepGenPage.staticSearchFqDEFAULT_MAP_LOCATION(siteRequest_, o);
		case "DEFAULT_MAP_ZOOM":
			return IotNodeStepGenPage.staticSearchFqDEFAULT_MAP_ZOOM(siteRequest_, o);
		case "iotNodeStepCount":
			return IotNodeStepGenPage.staticSearchFqIotNodeStepCount(siteRequest_, o);
		case "id":
			return IotNodeStepGenPage.staticSearchFqId(siteRequest_, o);
		case "pageUriIotNodeStep":
			return IotNodeStepGenPage.staticSearchFqPageUriIotNodeStep(siteRequest_, o);
			default:
				return BaseModelPage.staticSearchFqBaseModelPage(entityVar,  siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "IotNodeStepGenPage";
	public static final String VAR_searchListIotNodeStep_ = "searchListIotNodeStep_";
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
	public static final String VAR_listIotNodeStep = "listIotNodeStep";
	public static final String VAR_stats = "stats";
	public static final String VAR_facetCounts = "facetCounts";
	public static final String VAR_iotNodeStepCount = "iotNodeStepCount";
	public static final String VAR_iotNodeStep_ = "iotNodeStep_";
	public static final String VAR_id = "id";
	public static final String VAR_pageUriIotNodeStep = "pageUriIotNodeStep";

	public static final String DISPLAY_NAME_searchListIotNodeStep_ = "";
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
	public static final String DISPLAY_NAME_listIotNodeStep = "";
	public static final String DISPLAY_NAME_stats = "";
	public static final String DISPLAY_NAME_facetCounts = "";
	public static final String DISPLAY_NAME_iotNodeStepCount = "";
	public static final String DISPLAY_NAME_iotNodeStep_ = "";
	public static final String DISPLAY_NAME_id = "";
	public static final String DISPLAY_NAME_pageUriIotNodeStep = "";

	public static String displayNameForClass(String var) {
		return IotNodeStepGenPage.displayNameIotNodeStepGenPage(var);
	}
	public static String displayNameIotNodeStepGenPage(String var) {
		switch(var) {
		case VAR_searchListIotNodeStep_:
			return DISPLAY_NAME_searchListIotNodeStep_;
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
		case VAR_listIotNodeStep:
			return DISPLAY_NAME_listIotNodeStep;
		case VAR_stats:
			return DISPLAY_NAME_stats;
		case VAR_facetCounts:
			return DISPLAY_NAME_facetCounts;
		case VAR_iotNodeStepCount:
			return DISPLAY_NAME_iotNodeStepCount;
		case VAR_iotNodeStep_:
			return DISPLAY_NAME_iotNodeStep_;
		case VAR_id:
			return DISPLAY_NAME_id;
		case VAR_pageUriIotNodeStep:
			return DISPLAY_NAME_pageUriIotNodeStep;
		default:
			return BaseModelPage.displayNameBaseModelPage(var);
		}
	}
}
