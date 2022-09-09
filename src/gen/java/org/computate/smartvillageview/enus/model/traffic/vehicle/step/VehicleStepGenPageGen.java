package org.computate.smartvillageview.enus.model.traffic.vehicle.step;

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
import org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStep;
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
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class VehicleStepGenPageGen into the class VehicleStepGenPage. 
 * </li>
 * <li>You can add a class comment "Api: true" if you wish to GET, POST, PATCH or PUT these VehicleStepGenPage objects in a RESTful API. 
 * </li>
 * </ol>
 * <h1>About the VehicleStepGenPage class and it's generated class VehicleStepGenPageGen&lt;PageLayout&gt;: </h1>
 * <p>
 * This Java class extends a generated Java class built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage">Find the class VehicleStepGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * <p>
 * Delete the class VehicleStepGenPage in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.traffic.vehicle.step in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smart-village-view in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smart\-village\-view&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class VehicleStepGenPageGen<DEV> extends PageLayout {
	protected static final Logger LOG = LoggerFactory.getLogger(VehicleStepGenPage.class);

	////////////////////////////
	// searchListVehicleStep_ //
	////////////////////////////

	/**	 The entity searchListVehicleStep_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<VehicleStep> searchListVehicleStep_;

	/**	<br> The entity searchListVehicleStep_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&fq=entiteVar_enUS_indexed_string:searchListVehicleStep_">Find the entity searchListVehicleStep_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchListVehicleStep_(Wrap<SearchList<VehicleStep>> w);

	public SearchList<VehicleStep> getSearchListVehicleStep_() {
		return searchListVehicleStep_;
	}

	public void setSearchListVehicleStep_(SearchList<VehicleStep> searchListVehicleStep_) {
		this.searchListVehicleStep_ = searchListVehicleStep_;
	}
	public static SearchList<VehicleStep> staticSetSearchListVehicleStep_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected VehicleStepGenPage searchListVehicleStep_Init() {
		Wrap<SearchList<VehicleStep>> searchListVehicleStep_Wrap = new Wrap<SearchList<VehicleStep>>().var("searchListVehicleStep_");
		if(searchListVehicleStep_ == null) {
			_searchListVehicleStep_(searchListVehicleStep_Wrap);
			setSearchListVehicleStep_(searchListVehicleStep_Wrap.o);
		}
		return (VehicleStepGenPage)this;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&fq=entiteVar_enUS_indexed_string:pageResponse">Find the entity pageResponse in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageResponse(Wrap<String> w);

	public String getPageResponse() {
		return pageResponse;
	}
	public void setPageResponse(String o) {
		this.pageResponse = VehicleStepGenPage.staticSetPageResponse(siteRequest_, o);
	}
	public static String staticSetPageResponse(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected VehicleStepGenPage pageResponseInit() {
		Wrap<String> pageResponseWrap = new Wrap<String>().var("pageResponse");
		if(pageResponse == null) {
			_pageResponse(pageResponseWrap);
			setPageResponse(pageResponseWrap.o);
		}
		return (VehicleStepGenPage)this;
	}

	public static String staticSearchPageResponse(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageResponse(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageResponse(SiteRequestEnUS siteRequest_, String o) {
		return VehicleStepGenPage.staticSearchStrPageResponse(siteRequest_, VehicleStepGenPage.staticSearchPageResponse(siteRequest_, VehicleStepGenPage.staticSetPageResponse(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&fq=entiteVar_enUS_indexed_string:defaultZoneId">Find the entity defaultZoneId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultZoneId(Wrap<String> w);

	public String getDefaultZoneId() {
		return defaultZoneId;
	}
	public void setDefaultZoneId(String o) {
		this.defaultZoneId = VehicleStepGenPage.staticSetDefaultZoneId(siteRequest_, o);
	}
	public static String staticSetDefaultZoneId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected VehicleStepGenPage defaultZoneIdInit() {
		Wrap<String> defaultZoneIdWrap = new Wrap<String>().var("defaultZoneId");
		if(defaultZoneId == null) {
			_defaultZoneId(defaultZoneIdWrap);
			setDefaultZoneId(defaultZoneIdWrap.o);
		}
		return (VehicleStepGenPage)this;
	}

	public static String staticSearchDefaultZoneId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDefaultZoneId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultZoneId(SiteRequestEnUS siteRequest_, String o) {
		return VehicleStepGenPage.staticSearchStrDefaultZoneId(siteRequest_, VehicleStepGenPage.staticSearchDefaultZoneId(siteRequest_, VehicleStepGenPage.staticSetDefaultZoneId(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&fq=entiteVar_enUS_indexed_string:defaultTimeZone">Find the entity defaultTimeZone in Solr</a>
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
	protected VehicleStepGenPage defaultTimeZoneInit() {
		Wrap<ZoneId> defaultTimeZoneWrap = new Wrap<ZoneId>().var("defaultTimeZone");
		if(defaultTimeZone == null) {
			_defaultTimeZone(defaultTimeZoneWrap);
			setDefaultTimeZone(defaultTimeZoneWrap.o);
		}
		return (VehicleStepGenPage)this;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&fq=entiteVar_enUS_indexed_string:defaultLocaleId">Find the entity defaultLocaleId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultLocaleId(Wrap<String> w);

	public String getDefaultLocaleId() {
		return defaultLocaleId;
	}
	public void setDefaultLocaleId(String o) {
		this.defaultLocaleId = VehicleStepGenPage.staticSetDefaultLocaleId(siteRequest_, o);
	}
	public static String staticSetDefaultLocaleId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected VehicleStepGenPage defaultLocaleIdInit() {
		Wrap<String> defaultLocaleIdWrap = new Wrap<String>().var("defaultLocaleId");
		if(defaultLocaleId == null) {
			_defaultLocaleId(defaultLocaleIdWrap);
			setDefaultLocaleId(defaultLocaleIdWrap.o);
		}
		return (VehicleStepGenPage)this;
	}

	public static String staticSearchDefaultLocaleId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDefaultLocaleId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultLocaleId(SiteRequestEnUS siteRequest_, String o) {
		return VehicleStepGenPage.staticSearchStrDefaultLocaleId(siteRequest_, VehicleStepGenPage.staticSearchDefaultLocaleId(siteRequest_, VehicleStepGenPage.staticSetDefaultLocaleId(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&fq=entiteVar_enUS_indexed_string:defaultLocale">Find the entity defaultLocale in Solr</a>
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
	protected VehicleStepGenPage defaultLocaleInit() {
		Wrap<Locale> defaultLocaleWrap = new Wrap<Locale>().var("defaultLocale");
		if(defaultLocale == null) {
			_defaultLocale(defaultLocaleWrap);
			setDefaultLocale(defaultLocaleWrap.o);
		}
		return (VehicleStepGenPage)this;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&fq=entiteVar_enUS_indexed_string:defaultRangeGap">Find the entity defaultRangeGap in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultRangeGap(Wrap<String> w);

	public String getDefaultRangeGap() {
		return defaultRangeGap;
	}
	public void setDefaultRangeGap(String o) {
		this.defaultRangeGap = VehicleStepGenPage.staticSetDefaultRangeGap(siteRequest_, o);
	}
	public static String staticSetDefaultRangeGap(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected VehicleStepGenPage defaultRangeGapInit() {
		Wrap<String> defaultRangeGapWrap = new Wrap<String>().var("defaultRangeGap");
		if(defaultRangeGap == null) {
			_defaultRangeGap(defaultRangeGapWrap);
			setDefaultRangeGap(defaultRangeGapWrap.o);
		}
		return (VehicleStepGenPage)this;
	}

	public static String staticSearchDefaultRangeGap(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDefaultRangeGap(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultRangeGap(SiteRequestEnUS siteRequest_, String o) {
		return VehicleStepGenPage.staticSearchStrDefaultRangeGap(siteRequest_, VehicleStepGenPage.staticSearchDefaultRangeGap(siteRequest_, VehicleStepGenPage.staticSetDefaultRangeGap(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&fq=entiteVar_enUS_indexed_string:defaultRangeEnd">Find the entity defaultRangeEnd in Solr</a>
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
		this.defaultRangeEnd = VehicleStepGenPage.staticSetDefaultRangeEnd(siteRequest_, o);
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
	protected VehicleStepGenPage defaultRangeEndInit() {
		Wrap<ZonedDateTime> defaultRangeEndWrap = new Wrap<ZonedDateTime>().var("defaultRangeEnd");
		if(defaultRangeEnd == null) {
			_defaultRangeEnd(defaultRangeEndWrap);
			setDefaultRangeEnd(defaultRangeEndWrap.o);
		}
		return (VehicleStepGenPage)this;
	}

	public static Date staticSearchDefaultRangeEnd(SiteRequestEnUS siteRequest_, ZonedDateTime o) {
		return o == null ? null : Date.from(o.toInstant());
	}

	public static String staticSearchStrDefaultRangeEnd(SiteRequestEnUS siteRequest_, Date o) {
		return "\"" + DateTimeFormatter.ISO_DATE_TIME.format(o.toInstant().atOffset(ZoneOffset.UTC)) + "\"";
	}

	public static String staticSearchFqDefaultRangeEnd(SiteRequestEnUS siteRequest_, String o) {
		return VehicleStepGenPage.staticSearchStrDefaultRangeEnd(siteRequest_, VehicleStepGenPage.staticSearchDefaultRangeEnd(siteRequest_, VehicleStepGenPage.staticSetDefaultRangeEnd(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&fq=entiteVar_enUS_indexed_string:defaultRangeStart">Find the entity defaultRangeStart in Solr</a>
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
		this.defaultRangeStart = VehicleStepGenPage.staticSetDefaultRangeStart(siteRequest_, o);
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
	protected VehicleStepGenPage defaultRangeStartInit() {
		Wrap<ZonedDateTime> defaultRangeStartWrap = new Wrap<ZonedDateTime>().var("defaultRangeStart");
		if(defaultRangeStart == null) {
			_defaultRangeStart(defaultRangeStartWrap);
			setDefaultRangeStart(defaultRangeStartWrap.o);
		}
		return (VehicleStepGenPage)this;
	}

	public static Date staticSearchDefaultRangeStart(SiteRequestEnUS siteRequest_, ZonedDateTime o) {
		return o == null ? null : Date.from(o.toInstant());
	}

	public static String staticSearchStrDefaultRangeStart(SiteRequestEnUS siteRequest_, Date o) {
		return "\"" + DateTimeFormatter.ISO_DATE_TIME.format(o.toInstant().atOffset(ZoneOffset.UTC)) + "\"";
	}

	public static String staticSearchFqDefaultRangeStart(SiteRequestEnUS siteRequest_, String o) {
		return VehicleStepGenPage.staticSearchStrDefaultRangeStart(siteRequest_, VehicleStepGenPage.staticSearchDefaultRangeStart(siteRequest_, VehicleStepGenPage.staticSetDefaultRangeStart(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&fq=entiteVar_enUS_indexed_string:defaultRangeVar">Find the entity defaultRangeVar in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultRangeVar(Wrap<String> w);

	public String getDefaultRangeVar() {
		return defaultRangeVar;
	}
	public void setDefaultRangeVar(String o) {
		this.defaultRangeVar = VehicleStepGenPage.staticSetDefaultRangeVar(siteRequest_, o);
	}
	public static String staticSetDefaultRangeVar(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected VehicleStepGenPage defaultRangeVarInit() {
		Wrap<String> defaultRangeVarWrap = new Wrap<String>().var("defaultRangeVar");
		if(defaultRangeVar == null) {
			_defaultRangeVar(defaultRangeVarWrap);
			setDefaultRangeVar(defaultRangeVarWrap.o);
		}
		return (VehicleStepGenPage)this;
	}

	public static String staticSearchDefaultRangeVar(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDefaultRangeVar(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultRangeVar(SiteRequestEnUS siteRequest_, String o) {
		return VehicleStepGenPage.staticSearchStrDefaultRangeVar(siteRequest_, VehicleStepGenPage.staticSearchDefaultRangeVar(siteRequest_, VehicleStepGenPage.staticSetDefaultRangeVar(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&fq=entiteVar_enUS_indexed_string:defaultFacetSort">Find the entity defaultFacetSort in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultFacetSort(Wrap<String> w);

	public String getDefaultFacetSort() {
		return defaultFacetSort;
	}
	public void setDefaultFacetSort(String o) {
		this.defaultFacetSort = VehicleStepGenPage.staticSetDefaultFacetSort(siteRequest_, o);
	}
	public static String staticSetDefaultFacetSort(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected VehicleStepGenPage defaultFacetSortInit() {
		Wrap<String> defaultFacetSortWrap = new Wrap<String>().var("defaultFacetSort");
		if(defaultFacetSort == null) {
			_defaultFacetSort(defaultFacetSortWrap);
			setDefaultFacetSort(defaultFacetSortWrap.o);
		}
		return (VehicleStepGenPage)this;
	}

	public static String staticSearchDefaultFacetSort(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDefaultFacetSort(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultFacetSort(SiteRequestEnUS siteRequest_, String o) {
		return VehicleStepGenPage.staticSearchStrDefaultFacetSort(siteRequest_, VehicleStepGenPage.staticSearchDefaultFacetSort(siteRequest_, VehicleStepGenPage.staticSetDefaultFacetSort(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&fq=entiteVar_enUS_indexed_string:defaultFacetLimit">Find the entity defaultFacetLimit in Solr</a>
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
		this.defaultFacetLimit = VehicleStepGenPage.staticSetDefaultFacetLimit(siteRequest_, o);
	}
	public static Integer staticSetDefaultFacetLimit(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected VehicleStepGenPage defaultFacetLimitInit() {
		Wrap<Integer> defaultFacetLimitWrap = new Wrap<Integer>().var("defaultFacetLimit");
		if(defaultFacetLimit == null) {
			_defaultFacetLimit(defaultFacetLimitWrap);
			setDefaultFacetLimit(defaultFacetLimitWrap.o);
		}
		return (VehicleStepGenPage)this;
	}

	public static Integer staticSearchDefaultFacetLimit(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrDefaultFacetLimit(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultFacetLimit(SiteRequestEnUS siteRequest_, String o) {
		return VehicleStepGenPage.staticSearchStrDefaultFacetLimit(siteRequest_, VehicleStepGenPage.staticSearchDefaultFacetLimit(siteRequest_, VehicleStepGenPage.staticSetDefaultFacetLimit(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&fq=entiteVar_enUS_indexed_string:defaultFacetMinCount">Find the entity defaultFacetMinCount in Solr</a>
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
		this.defaultFacetMinCount = VehicleStepGenPage.staticSetDefaultFacetMinCount(siteRequest_, o);
	}
	public static Integer staticSetDefaultFacetMinCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected VehicleStepGenPage defaultFacetMinCountInit() {
		Wrap<Integer> defaultFacetMinCountWrap = new Wrap<Integer>().var("defaultFacetMinCount");
		if(defaultFacetMinCount == null) {
			_defaultFacetMinCount(defaultFacetMinCountWrap);
			setDefaultFacetMinCount(defaultFacetMinCountWrap.o);
		}
		return (VehicleStepGenPage)this;
	}

	public static Integer staticSearchDefaultFacetMinCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrDefaultFacetMinCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultFacetMinCount(SiteRequestEnUS siteRequest_, String o) {
		return VehicleStepGenPage.staticSearchStrDefaultFacetMinCount(siteRequest_, VehicleStepGenPage.staticSearchDefaultFacetMinCount(siteRequest_, VehicleStepGenPage.staticSetDefaultFacetMinCount(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&fq=entiteVar_enUS_indexed_string:defaultPivotMinCount">Find the entity defaultPivotMinCount in Solr</a>
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
		this.defaultPivotMinCount = VehicleStepGenPage.staticSetDefaultPivotMinCount(siteRequest_, o);
	}
	public static Integer staticSetDefaultPivotMinCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected VehicleStepGenPage defaultPivotMinCountInit() {
		Wrap<Integer> defaultPivotMinCountWrap = new Wrap<Integer>().var("defaultPivotMinCount");
		if(defaultPivotMinCount == null) {
			_defaultPivotMinCount(defaultPivotMinCountWrap);
			setDefaultPivotMinCount(defaultPivotMinCountWrap.o);
		}
		return (VehicleStepGenPage)this;
	}

	public static Integer staticSearchDefaultPivotMinCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrDefaultPivotMinCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultPivotMinCount(SiteRequestEnUS siteRequest_, String o) {
		return VehicleStepGenPage.staticSearchStrDefaultPivotMinCount(siteRequest_, VehicleStepGenPage.staticSearchDefaultPivotMinCount(siteRequest_, VehicleStepGenPage.staticSetDefaultPivotMinCount(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&fq=entiteVar_enUS_indexed_string:DEFAULT_MAP_LOCATION">Find the entity DEFAULT_MAP_LOCATION in Solr</a>
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
		this.DEFAULT_MAP_LOCATION = VehicleStepGenPage.staticSetDEFAULT_MAP_LOCATION(siteRequest_, o);
	}
	public static JsonObject staticSetDEFAULT_MAP_LOCATION(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected VehicleStepGenPage DEFAULT_MAP_LOCATIONInit() {
		Wrap<JsonObject> DEFAULT_MAP_LOCATIONWrap = new Wrap<JsonObject>().var("DEFAULT_MAP_LOCATION");
		if(DEFAULT_MAP_LOCATION == null) {
			_DEFAULT_MAP_LOCATION(DEFAULT_MAP_LOCATIONWrap);
			setDEFAULT_MAP_LOCATION(DEFAULT_MAP_LOCATIONWrap.o);
		}
		return (VehicleStepGenPage)this;
	}

	public static JsonObject staticSearchDEFAULT_MAP_LOCATION(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrDEFAULT_MAP_LOCATION(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDEFAULT_MAP_LOCATION(SiteRequestEnUS siteRequest_, String o) {
		return VehicleStepGenPage.staticSearchStrDEFAULT_MAP_LOCATION(siteRequest_, VehicleStepGenPage.staticSearchDEFAULT_MAP_LOCATION(siteRequest_, VehicleStepGenPage.staticSetDEFAULT_MAP_LOCATION(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&fq=entiteVar_enUS_indexed_string:DEFAULT_MAP_ZOOM">Find the entity DEFAULT_MAP_ZOOM in Solr</a>
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
		this.DEFAULT_MAP_ZOOM = VehicleStepGenPage.staticSetDEFAULT_MAP_ZOOM(siteRequest_, o);
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
	protected VehicleStepGenPage DEFAULT_MAP_ZOOMInit() {
		Wrap<BigDecimal> DEFAULT_MAP_ZOOMWrap = new Wrap<BigDecimal>().var("DEFAULT_MAP_ZOOM");
		if(DEFAULT_MAP_ZOOM == null) {
			_DEFAULT_MAP_ZOOM(DEFAULT_MAP_ZOOMWrap);
			setDEFAULT_MAP_ZOOM(DEFAULT_MAP_ZOOMWrap.o);
		}
		return (VehicleStepGenPage)this;
	}

	public static Double staticSearchDEFAULT_MAP_ZOOM(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrDEFAULT_MAP_ZOOM(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDEFAULT_MAP_ZOOM(SiteRequestEnUS siteRequest_, String o) {
		return VehicleStepGenPage.staticSearchStrDEFAULT_MAP_ZOOM(siteRequest_, VehicleStepGenPage.staticSearchDEFAULT_MAP_ZOOM(siteRequest_, VehicleStepGenPage.staticSetDEFAULT_MAP_ZOOM(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&fq=entiteVar_enUS_indexed_string:defaultFieldListVars">Find the entity defaultFieldListVars in Solr</a>
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
	public VehicleStepGenPage addDefaultFieldListVars(String...objects) {
		for(String o : objects) {
			addDefaultFieldListVars(o);
		}
		return (VehicleStepGenPage)this;
	}
	public VehicleStepGenPage addDefaultFieldListVars(String o) {
		if(o != null)
			this.defaultFieldListVars.add(o);
		return (VehicleStepGenPage)this;
	}
	@JsonIgnore
	public void setDefaultFieldListVars(JsonArray objects) {
		defaultFieldListVars.clear();
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addDefaultFieldListVars(o);
		}
	}
	protected VehicleStepGenPage defaultFieldListVarsInit() {
		_defaultFieldListVars(defaultFieldListVars);
		return (VehicleStepGenPage)this;
	}

	public static String staticSearchDefaultFieldListVars(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDefaultFieldListVars(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultFieldListVars(SiteRequestEnUS siteRequest_, String o) {
		return VehicleStepGenPage.staticSearchStrDefaultFieldListVars(siteRequest_, VehicleStepGenPage.staticSearchDefaultFieldListVars(siteRequest_, VehicleStepGenPage.staticSetDefaultFieldListVars(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&fq=entiteVar_enUS_indexed_string:defaultStatsVars">Find the entity defaultStatsVars in Solr</a>
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
	public VehicleStepGenPage addDefaultStatsVars(String...objects) {
		for(String o : objects) {
			addDefaultStatsVars(o);
		}
		return (VehicleStepGenPage)this;
	}
	public VehicleStepGenPage addDefaultStatsVars(String o) {
		if(o != null)
			this.defaultStatsVars.add(o);
		return (VehicleStepGenPage)this;
	}
	@JsonIgnore
	public void setDefaultStatsVars(JsonArray objects) {
		defaultStatsVars.clear();
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addDefaultStatsVars(o);
		}
	}
	protected VehicleStepGenPage defaultStatsVarsInit() {
		_defaultStatsVars(defaultStatsVars);
		return (VehicleStepGenPage)this;
	}

	public static String staticSearchDefaultStatsVars(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDefaultStatsVars(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultStatsVars(SiteRequestEnUS siteRequest_, String o) {
		return VehicleStepGenPage.staticSearchStrDefaultStatsVars(siteRequest_, VehicleStepGenPage.staticSearchDefaultStatsVars(siteRequest_, VehicleStepGenPage.staticSetDefaultStatsVars(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&fq=entiteVar_enUS_indexed_string:defaultPivotVars">Find the entity defaultPivotVars in Solr</a>
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
	public VehicleStepGenPage addDefaultPivotVars(String...objects) {
		for(String o : objects) {
			addDefaultPivotVars(o);
		}
		return (VehicleStepGenPage)this;
	}
	public VehicleStepGenPage addDefaultPivotVars(String o) {
		if(o != null)
			this.defaultPivotVars.add(o);
		return (VehicleStepGenPage)this;
	}
	@JsonIgnore
	public void setDefaultPivotVars(JsonArray objects) {
		defaultPivotVars.clear();
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addDefaultPivotVars(o);
		}
	}
	protected VehicleStepGenPage defaultPivotVarsInit() {
		_defaultPivotVars(defaultPivotVars);
		return (VehicleStepGenPage)this;
	}

	public static String staticSearchDefaultPivotVars(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDefaultPivotVars(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultPivotVars(SiteRequestEnUS siteRequest_, String o) {
		return VehicleStepGenPage.staticSearchStrDefaultPivotVars(siteRequest_, VehicleStepGenPage.staticSearchDefaultPivotVars(siteRequest_, VehicleStepGenPage.staticSetDefaultPivotVars(siteRequest_, o)));
	}

	/////////////////////
	// listVehicleStep //
	/////////////////////

	/**	 The entity listVehicleStep
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listVehicleStep = new JsonArray();

	/**	<br> The entity listVehicleStep
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&fq=entiteVar_enUS_indexed_string:listVehicleStep">Find the entity listVehicleStep in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _listVehicleStep(JsonArray l);

	public JsonArray getListVehicleStep() {
		return listVehicleStep;
	}

	public void setListVehicleStep(JsonArray listVehicleStep) {
		this.listVehicleStep = listVehicleStep;
	}
	public static JsonArray staticSetListVehicleStep(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected VehicleStepGenPage listVehicleStepInit() {
		_listVehicleStep(listVehicleStep);
		return (VehicleStepGenPage)this;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&fq=entiteVar_enUS_indexed_string:stats">Find the entity stats in Solr</a>
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
	protected VehicleStepGenPage statsInit() {
		Wrap<Stats> statsWrap = new Wrap<Stats>().var("stats");
		if(stats == null) {
			_stats(statsWrap);
			setStats(statsWrap.o);
		}
		return (VehicleStepGenPage)this;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&fq=entiteVar_enUS_indexed_string:facetCounts">Find the entity facetCounts in Solr</a>
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
	protected VehicleStepGenPage facetCountsInit() {
		Wrap<FacetCounts> facetCountsWrap = new Wrap<FacetCounts>().var("facetCounts");
		if(facetCounts == null) {
			_facetCounts(facetCountsWrap);
			setFacetCounts(facetCountsWrap.o);
		}
		return (VehicleStepGenPage)this;
	}

	//////////////////////
	// vehicleStepCount //
	//////////////////////

	/**	 The entity vehicleStepCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer vehicleStepCount;

	/**	<br> The entity vehicleStepCount
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&fq=entiteVar_enUS_indexed_string:vehicleStepCount">Find the entity vehicleStepCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _vehicleStepCount(Wrap<Integer> w);

	public Integer getVehicleStepCount() {
		return vehicleStepCount;
	}

	public void setVehicleStepCount(Integer vehicleStepCount) {
		this.vehicleStepCount = vehicleStepCount;
	}
	@JsonIgnore
	public void setVehicleStepCount(String o) {
		this.vehicleStepCount = VehicleStepGenPage.staticSetVehicleStepCount(siteRequest_, o);
	}
	public static Integer staticSetVehicleStepCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected VehicleStepGenPage vehicleStepCountInit() {
		Wrap<Integer> vehicleStepCountWrap = new Wrap<Integer>().var("vehicleStepCount");
		if(vehicleStepCount == null) {
			_vehicleStepCount(vehicleStepCountWrap);
			setVehicleStepCount(vehicleStepCountWrap.o);
		}
		return (VehicleStepGenPage)this;
	}

	public static Integer staticSearchVehicleStepCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrVehicleStepCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqVehicleStepCount(SiteRequestEnUS siteRequest_, String o) {
		return VehicleStepGenPage.staticSearchStrVehicleStepCount(siteRequest_, VehicleStepGenPage.staticSearchVehicleStepCount(siteRequest_, VehicleStepGenPage.staticSetVehicleStepCount(siteRequest_, o)));
	}

	//////////////////
	// vehicleStep_ //
	//////////////////

	/**	 The entity vehicleStep_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected VehicleStep vehicleStep_;

	/**	<br> The entity vehicleStep_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&fq=entiteVar_enUS_indexed_string:vehicleStep_">Find the entity vehicleStep_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _vehicleStep_(Wrap<VehicleStep> w);

	public VehicleStep getVehicleStep_() {
		return vehicleStep_;
	}

	public void setVehicleStep_(VehicleStep vehicleStep_) {
		this.vehicleStep_ = vehicleStep_;
	}
	public static VehicleStep staticSetVehicleStep_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected VehicleStepGenPage vehicleStep_Init() {
		Wrap<VehicleStep> vehicleStep_Wrap = new Wrap<VehicleStep>().var("vehicleStep_");
		if(vehicleStep_ == null) {
			_vehicleStep_(vehicleStep_Wrap);
			setVehicleStep_(vehicleStep_Wrap.o);
		}
		return (VehicleStepGenPage)this;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = VehicleStepGenPage.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected VehicleStepGenPage idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			setId(idWrap.o);
		}
		return (VehicleStepGenPage)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return VehicleStepGenPage.staticSearchStrId(siteRequest_, VehicleStepGenPage.staticSearchId(siteRequest_, VehicleStepGenPage.staticSetId(siteRequest_, o)));
	}

	////////////////////////
	// pageUriVehicleStep //
	////////////////////////

	/**	 The entity pageUriVehicleStep
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUriVehicleStep;

	/**	<br> The entity pageUriVehicleStep
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.vehicle.step.VehicleStepGenPage&fq=entiteVar_enUS_indexed_string:pageUriVehicleStep">Find the entity pageUriVehicleStep in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUriVehicleStep(Wrap<String> c);

	public String getPageUriVehicleStep() {
		return pageUriVehicleStep;
	}
	public void setPageUriVehicleStep(String o) {
		this.pageUriVehicleStep = VehicleStepGenPage.staticSetPageUriVehicleStep(siteRequest_, o);
	}
	public static String staticSetPageUriVehicleStep(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected VehicleStepGenPage pageUriVehicleStepInit() {
		Wrap<String> pageUriVehicleStepWrap = new Wrap<String>().var("pageUriVehicleStep");
		if(pageUriVehicleStep == null) {
			_pageUriVehicleStep(pageUriVehicleStepWrap);
			setPageUriVehicleStep(pageUriVehicleStepWrap.o);
		}
		return (VehicleStepGenPage)this;
	}

	public static String staticSearchPageUriVehicleStep(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUriVehicleStep(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUriVehicleStep(SiteRequestEnUS siteRequest_, String o) {
		return VehicleStepGenPage.staticSearchStrPageUriVehicleStep(siteRequest_, VehicleStepGenPage.staticSearchPageUriVehicleStep(siteRequest_, VehicleStepGenPage.staticSetPageUriVehicleStep(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepVehicleStepGenPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepVehicleStepGenPage();
	}

	public Future<Void> promiseDeepVehicleStepGenPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseVehicleStepGenPage(promise2);
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

	public Future<Void> promiseVehicleStepGenPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				searchListVehicleStep_Init();
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
				listVehicleStepInit();
				statsInit();
				facetCountsInit();
				vehicleStepCountInit();
				vehicleStep_Init();
				idInit();
				pageUriVehicleStepInit();
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
		return promiseDeepVehicleStepGenPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestVehicleStepGenPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestPageLayout(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestVehicleStepGenPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainVehicleStepGenPage(v);
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
	public Object obtainVehicleStepGenPage(String var) {
		VehicleStepGenPage oVehicleStepGenPage = (VehicleStepGenPage)this;
		switch(var) {
			case "searchListVehicleStep_":
				return oVehicleStepGenPage.searchListVehicleStep_;
			case "pageResponse":
				return oVehicleStepGenPage.pageResponse;
			case "defaultZoneId":
				return oVehicleStepGenPage.defaultZoneId;
			case "defaultTimeZone":
				return oVehicleStepGenPage.defaultTimeZone;
			case "defaultLocaleId":
				return oVehicleStepGenPage.defaultLocaleId;
			case "defaultLocale":
				return oVehicleStepGenPage.defaultLocale;
			case "defaultRangeGap":
				return oVehicleStepGenPage.defaultRangeGap;
			case "defaultRangeEnd":
				return oVehicleStepGenPage.defaultRangeEnd;
			case "defaultRangeStart":
				return oVehicleStepGenPage.defaultRangeStart;
			case "defaultRangeVar":
				return oVehicleStepGenPage.defaultRangeVar;
			case "defaultFacetSort":
				return oVehicleStepGenPage.defaultFacetSort;
			case "defaultFacetLimit":
				return oVehicleStepGenPage.defaultFacetLimit;
			case "defaultFacetMinCount":
				return oVehicleStepGenPage.defaultFacetMinCount;
			case "defaultPivotMinCount":
				return oVehicleStepGenPage.defaultPivotMinCount;
			case "DEFAULT_MAP_LOCATION":
				return oVehicleStepGenPage.DEFAULT_MAP_LOCATION;
			case "DEFAULT_MAP_ZOOM":
				return oVehicleStepGenPage.DEFAULT_MAP_ZOOM;
			case "defaultFieldListVars":
				return oVehicleStepGenPage.defaultFieldListVars;
			case "defaultStatsVars":
				return oVehicleStepGenPage.defaultStatsVars;
			case "defaultPivotVars":
				return oVehicleStepGenPage.defaultPivotVars;
			case "listVehicleStep":
				return oVehicleStepGenPage.listVehicleStep;
			case "stats":
				return oVehicleStepGenPage.stats;
			case "facetCounts":
				return oVehicleStepGenPage.facetCounts;
			case "vehicleStepCount":
				return oVehicleStepGenPage.vehicleStepCount;
			case "vehicleStep_":
				return oVehicleStepGenPage.vehicleStep_;
			case "id":
				return oVehicleStepGenPage.id;
			case "pageUriVehicleStep":
				return oVehicleStepGenPage.pageUriVehicleStep;
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
				o = relateVehicleStepGenPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateVehicleStepGenPage(String var, Object val) {
		VehicleStepGenPage oVehicleStepGenPage = (VehicleStepGenPage)this;
		switch(var) {
			default:
				return super.relatePageLayout(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetVehicleStepGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetVehicleStepGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "pageResponse":
			return VehicleStepGenPage.staticSetPageResponse(siteRequest_, o);
		case "defaultZoneId":
			return VehicleStepGenPage.staticSetDefaultZoneId(siteRequest_, o);
		case "defaultLocaleId":
			return VehicleStepGenPage.staticSetDefaultLocaleId(siteRequest_, o);
		case "defaultRangeGap":
			return VehicleStepGenPage.staticSetDefaultRangeGap(siteRequest_, o);
		case "defaultRangeEnd":
			return VehicleStepGenPage.staticSetDefaultRangeEnd(siteRequest_, o);
		case "defaultRangeStart":
			return VehicleStepGenPage.staticSetDefaultRangeStart(siteRequest_, o);
		case "defaultRangeVar":
			return VehicleStepGenPage.staticSetDefaultRangeVar(siteRequest_, o);
		case "defaultFacetSort":
			return VehicleStepGenPage.staticSetDefaultFacetSort(siteRequest_, o);
		case "defaultFacetLimit":
			return VehicleStepGenPage.staticSetDefaultFacetLimit(siteRequest_, o);
		case "defaultFacetMinCount":
			return VehicleStepGenPage.staticSetDefaultFacetMinCount(siteRequest_, o);
		case "defaultPivotMinCount":
			return VehicleStepGenPage.staticSetDefaultPivotMinCount(siteRequest_, o);
		case "DEFAULT_MAP_LOCATION":
			return VehicleStepGenPage.staticSetDEFAULT_MAP_LOCATION(siteRequest_, o);
		case "DEFAULT_MAP_ZOOM":
			return VehicleStepGenPage.staticSetDEFAULT_MAP_ZOOM(siteRequest_, o);
		case "defaultFieldListVars":
			return VehicleStepGenPage.staticSetDefaultFieldListVars(siteRequest_, o);
		case "defaultStatsVars":
			return VehicleStepGenPage.staticSetDefaultStatsVars(siteRequest_, o);
		case "defaultPivotVars":
			return VehicleStepGenPage.staticSetDefaultPivotVars(siteRequest_, o);
		case "vehicleStepCount":
			return VehicleStepGenPage.staticSetVehicleStepCount(siteRequest_, o);
		case "id":
			return VehicleStepGenPage.staticSetId(siteRequest_, o);
		case "pageUriVehicleStep":
			return VehicleStepGenPage.staticSetPageUriVehicleStep(siteRequest_, o);
			default:
				return PageLayout.staticSetPageLayout(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchVehicleStepGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchVehicleStepGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "pageResponse":
			return VehicleStepGenPage.staticSearchPageResponse(siteRequest_, (String)o);
		case "defaultZoneId":
			return VehicleStepGenPage.staticSearchDefaultZoneId(siteRequest_, (String)o);
		case "defaultLocaleId":
			return VehicleStepGenPage.staticSearchDefaultLocaleId(siteRequest_, (String)o);
		case "defaultRangeGap":
			return VehicleStepGenPage.staticSearchDefaultRangeGap(siteRequest_, (String)o);
		case "defaultRangeEnd":
			return VehicleStepGenPage.staticSearchDefaultRangeEnd(siteRequest_, (ZonedDateTime)o);
		case "defaultRangeStart":
			return VehicleStepGenPage.staticSearchDefaultRangeStart(siteRequest_, (ZonedDateTime)o);
		case "defaultRangeVar":
			return VehicleStepGenPage.staticSearchDefaultRangeVar(siteRequest_, (String)o);
		case "defaultFacetSort":
			return VehicleStepGenPage.staticSearchDefaultFacetSort(siteRequest_, (String)o);
		case "defaultFacetLimit":
			return VehicleStepGenPage.staticSearchDefaultFacetLimit(siteRequest_, (Integer)o);
		case "defaultFacetMinCount":
			return VehicleStepGenPage.staticSearchDefaultFacetMinCount(siteRequest_, (Integer)o);
		case "defaultPivotMinCount":
			return VehicleStepGenPage.staticSearchDefaultPivotMinCount(siteRequest_, (Integer)o);
		case "DEFAULT_MAP_LOCATION":
			return VehicleStepGenPage.staticSearchDEFAULT_MAP_LOCATION(siteRequest_, (JsonObject)o);
		case "DEFAULT_MAP_ZOOM":
			return VehicleStepGenPage.staticSearchDEFAULT_MAP_ZOOM(siteRequest_, (BigDecimal)o);
		case "defaultFieldListVars":
			return VehicleStepGenPage.staticSearchDefaultFieldListVars(siteRequest_, (String)o);
		case "defaultStatsVars":
			return VehicleStepGenPage.staticSearchDefaultStatsVars(siteRequest_, (String)o);
		case "defaultPivotVars":
			return VehicleStepGenPage.staticSearchDefaultPivotVars(siteRequest_, (String)o);
		case "vehicleStepCount":
			return VehicleStepGenPage.staticSearchVehicleStepCount(siteRequest_, (Integer)o);
		case "id":
			return VehicleStepGenPage.staticSearchId(siteRequest_, (String)o);
		case "pageUriVehicleStep":
			return VehicleStepGenPage.staticSearchPageUriVehicleStep(siteRequest_, (String)o);
			default:
				return PageLayout.staticSearchPageLayout(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrVehicleStepGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrVehicleStepGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "pageResponse":
			return VehicleStepGenPage.staticSearchStrPageResponse(siteRequest_, (String)o);
		case "defaultZoneId":
			return VehicleStepGenPage.staticSearchStrDefaultZoneId(siteRequest_, (String)o);
		case "defaultLocaleId":
			return VehicleStepGenPage.staticSearchStrDefaultLocaleId(siteRequest_, (String)o);
		case "defaultRangeGap":
			return VehicleStepGenPage.staticSearchStrDefaultRangeGap(siteRequest_, (String)o);
		case "defaultRangeEnd":
			return VehicleStepGenPage.staticSearchStrDefaultRangeEnd(siteRequest_, (Date)o);
		case "defaultRangeStart":
			return VehicleStepGenPage.staticSearchStrDefaultRangeStart(siteRequest_, (Date)o);
		case "defaultRangeVar":
			return VehicleStepGenPage.staticSearchStrDefaultRangeVar(siteRequest_, (String)o);
		case "defaultFacetSort":
			return VehicleStepGenPage.staticSearchStrDefaultFacetSort(siteRequest_, (String)o);
		case "defaultFacetLimit":
			return VehicleStepGenPage.staticSearchStrDefaultFacetLimit(siteRequest_, (Integer)o);
		case "defaultFacetMinCount":
			return VehicleStepGenPage.staticSearchStrDefaultFacetMinCount(siteRequest_, (Integer)o);
		case "defaultPivotMinCount":
			return VehicleStepGenPage.staticSearchStrDefaultPivotMinCount(siteRequest_, (Integer)o);
		case "DEFAULT_MAP_LOCATION":
			return VehicleStepGenPage.staticSearchStrDEFAULT_MAP_LOCATION(siteRequest_, (JsonObject)o);
		case "DEFAULT_MAP_ZOOM":
			return VehicleStepGenPage.staticSearchStrDEFAULT_MAP_ZOOM(siteRequest_, (Double)o);
		case "defaultFieldListVars":
			return VehicleStepGenPage.staticSearchStrDefaultFieldListVars(siteRequest_, (String)o);
		case "defaultStatsVars":
			return VehicleStepGenPage.staticSearchStrDefaultStatsVars(siteRequest_, (String)o);
		case "defaultPivotVars":
			return VehicleStepGenPage.staticSearchStrDefaultPivotVars(siteRequest_, (String)o);
		case "vehicleStepCount":
			return VehicleStepGenPage.staticSearchStrVehicleStepCount(siteRequest_, (Integer)o);
		case "id":
			return VehicleStepGenPage.staticSearchStrId(siteRequest_, (String)o);
		case "pageUriVehicleStep":
			return VehicleStepGenPage.staticSearchStrPageUriVehicleStep(siteRequest_, (String)o);
			default:
				return PageLayout.staticSearchStrPageLayout(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqVehicleStepGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqVehicleStepGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "pageResponse":
			return VehicleStepGenPage.staticSearchFqPageResponse(siteRequest_, o);
		case "defaultZoneId":
			return VehicleStepGenPage.staticSearchFqDefaultZoneId(siteRequest_, o);
		case "defaultLocaleId":
			return VehicleStepGenPage.staticSearchFqDefaultLocaleId(siteRequest_, o);
		case "defaultRangeGap":
			return VehicleStepGenPage.staticSearchFqDefaultRangeGap(siteRequest_, o);
		case "defaultRangeEnd":
			return VehicleStepGenPage.staticSearchFqDefaultRangeEnd(siteRequest_, o);
		case "defaultRangeStart":
			return VehicleStepGenPage.staticSearchFqDefaultRangeStart(siteRequest_, o);
		case "defaultRangeVar":
			return VehicleStepGenPage.staticSearchFqDefaultRangeVar(siteRequest_, o);
		case "defaultFacetSort":
			return VehicleStepGenPage.staticSearchFqDefaultFacetSort(siteRequest_, o);
		case "defaultFacetLimit":
			return VehicleStepGenPage.staticSearchFqDefaultFacetLimit(siteRequest_, o);
		case "defaultFacetMinCount":
			return VehicleStepGenPage.staticSearchFqDefaultFacetMinCount(siteRequest_, o);
		case "defaultPivotMinCount":
			return VehicleStepGenPage.staticSearchFqDefaultPivotMinCount(siteRequest_, o);
		case "DEFAULT_MAP_LOCATION":
			return VehicleStepGenPage.staticSearchFqDEFAULT_MAP_LOCATION(siteRequest_, o);
		case "DEFAULT_MAP_ZOOM":
			return VehicleStepGenPage.staticSearchFqDEFAULT_MAP_ZOOM(siteRequest_, o);
		case "defaultFieldListVars":
			return VehicleStepGenPage.staticSearchFqDefaultFieldListVars(siteRequest_, o);
		case "defaultStatsVars":
			return VehicleStepGenPage.staticSearchFqDefaultStatsVars(siteRequest_, o);
		case "defaultPivotVars":
			return VehicleStepGenPage.staticSearchFqDefaultPivotVars(siteRequest_, o);
		case "vehicleStepCount":
			return VehicleStepGenPage.staticSearchFqVehicleStepCount(siteRequest_, o);
		case "id":
			return VehicleStepGenPage.staticSearchFqId(siteRequest_, o);
		case "pageUriVehicleStep":
			return VehicleStepGenPage.staticSearchFqPageUriVehicleStep(siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "VehicleStepGenPage";
	public static final String VAR_searchListVehicleStep_ = "searchListVehicleStep_";
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
	public static final String VAR_listVehicleStep = "listVehicleStep";
	public static final String VAR_stats = "stats";
	public static final String VAR_facetCounts = "facetCounts";
	public static final String VAR_vehicleStepCount = "vehicleStepCount";
	public static final String VAR_vehicleStep_ = "vehicleStep_";
	public static final String VAR_id = "id";
	public static final String VAR_pageUriVehicleStep = "pageUriVehicleStep";

	public static final String DISPLAY_NAME_searchListVehicleStep_ = "";
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
	public static final String DISPLAY_NAME_listVehicleStep = "";
	public static final String DISPLAY_NAME_stats = "";
	public static final String DISPLAY_NAME_facetCounts = "";
	public static final String DISPLAY_NAME_vehicleStepCount = "";
	public static final String DISPLAY_NAME_vehicleStep_ = "";
	public static final String DISPLAY_NAME_id = "";
	public static final String DISPLAY_NAME_pageUriVehicleStep = "";

	public static String displayNameForClass(String var) {
		return VehicleStepGenPage.displayNameVehicleStepGenPage(var);
	}
	public static String displayNameVehicleStepGenPage(String var) {
		switch(var) {
		case VAR_searchListVehicleStep_:
			return DISPLAY_NAME_searchListVehicleStep_;
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
		case VAR_listVehicleStep:
			return DISPLAY_NAME_listVehicleStep;
		case VAR_stats:
			return DISPLAY_NAME_stats;
		case VAR_facetCounts:
			return DISPLAY_NAME_facetCounts;
		case VAR_vehicleStepCount:
			return DISPLAY_NAME_vehicleStepCount;
		case VAR_vehicleStep_:
			return DISPLAY_NAME_vehicleStep_;
		case VAR_id:
			return DISPLAY_NAME_id;
		case VAR_pageUriVehicleStep:
			return DISPLAY_NAME_pageUriVehicleStep;
		default:
			return PageLayout.displayNamePageLayout(var);
		}
	}
}
