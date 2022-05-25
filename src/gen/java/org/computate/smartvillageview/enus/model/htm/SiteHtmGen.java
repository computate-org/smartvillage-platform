package org.computate.smartvillageview.enus.model.htm;

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
import java.lang.Object;
import java.lang.Void;
import java.lang.String;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.Instant;
import java.util.Locale;
import java.time.OffsetDateTime;
import java.lang.Boolean;
import io.vertx.core.json.JsonArray;
import java.lang.Long;
import io.vertx.core.json.JsonObject;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;

/**	
 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm">Find the class SiteHtm in Solr. </a>
 * <br><br>Delete the class SiteHtm in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>Delete  the package org.computate.smartvillageview.enus.model.htm in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>Delete  the project smart-village-view in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smart\-village\-view&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>
 **/
public abstract class SiteHtmGen<DEV> extends Object {
	protected static final Logger LOG = LoggerFactory.getLogger(SiteHtm.class);

	public static final String SiteHtm_Description_enUS = "An HTML part that is indexed in the search engine. ";
	public static final String SiteHtm_AName_enUS = "an HTML";
	public static final String SiteHtm_This_enUS = "this ";
	public static final String SiteHtm_ThisName_enUS = "this HTML";
	public static final String SiteHtm_A_enUS = "a ";
	public static final String SiteHtm_TheName_enUS = "theHTML";
	public static final String SiteHtm_NameSingular_enUS = "HTML";
	public static final String SiteHtm_NamePlural_enUS = "HTMLs";
	public static final String SiteHtm_NameActual_enUS = "current HTML";
	public static final String SiteHtm_AllName_enUS = "all the HTMLs";
	public static final String SiteHtm_SearchAllNameBy_enUS = "search HTMLs by ";
	public static final String SiteHtm_Title_enUS = "HTMLs";
	public static final String SiteHtm_ThePluralName_enUS = "the HTMLs";
	public static final String SiteHtm_NoNameFound_enUS = "no HTML found";
	public static final String SiteHtm_NameVar_enUS = "htm";
	public static final String SiteHtm_OfName_enUS = "of HTML";
	public static final String SiteHtm_ANameAdjective_enUS = "an HTML";
	public static final String SiteHtm_NameAdjectiveSingular_enUS = "HTML";
	public static final String SiteHtm_NameAdjectivePlural_enUS = "HTMLs";
	public static final String Search_enUS_Uri = "/api/htm";
	public static final String Search_enUS_ImageUri = "/png/api/htm-999.png";
	public static final String GET_enUS_Uri = "/api/htm/{id}";
	public static final String GET_enUS_ImageUri = "/png/api/htm/{id}-999.png";
	public static final String POST_enUS_Uri = "/api/htm";
	public static final String POST_enUS_ImageUri = "/png/api/htm-999.png";
	public static final String PATCH_enUS_Uri = "/api/htm";
	public static final String PATCH_enUS_ImageUri = "/png/api/htm-999.png";
	public static final String PUTImport_enUS_Uri = "/api/htm-import";
	public static final String PUTImport_enUS_ImageUri = "/png/api/htm-import-999.png";
	public static final String SearchPage_enUS_Uri = "/htm";
	public static final String SearchPage_enUS_ImageUri = "/png/htm-999.png";

	public static final String SiteHtm_Color = "2017-navy-peony";
	public static final String SiteHtm_IconGroup = "duotone";
	public static final String SiteHtm_IconName = "code";

	//////////////////
	// promiseBegin //
	//////////////////

	/**	 The entity promiseBegin
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected Void promiseBegin;

	/**	<br> The entity promiseBegin
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:promiseBegin">Find the entity promiseBegin in Solr</a>
	 * <br>
	 * @param promise is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _promiseBegin(Promise<Void> promise);

	public Void getPromiseBegin() {
		return promiseBegin;
	}

	public void setPromiseBegin(Void promiseBegin) {
		this.promiseBegin = promiseBegin;
	}
	public static Void staticSetPromiseBegin(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected Future<Void> promiseBeginPromise() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		_promiseBegin(promise2);
		promise2.future().onSuccess(o -> {
			setPromiseBegin(o);
			promise.complete(o);
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	//////////////////
	// siteRequest_ //
	//////////////////

	/**	 The entity siteRequest_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SiteRequestEnUS siteRequest_;

	/**	<br> The entity siteRequest_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:siteRequest_">Find the entity siteRequest_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _siteRequest_(Wrap<SiteRequestEnUS> w);

	public SiteRequestEnUS getSiteRequest_() {
		return siteRequest_;
	}

	public void setSiteRequest_(SiteRequestEnUS siteRequest_) {
		this.siteRequest_ = siteRequest_;
	}
	public static SiteRequestEnUS staticSetSiteRequest_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected SiteHtm siteRequest_Init() {
		Wrap<SiteRequestEnUS> siteRequest_Wrap = new Wrap<SiteRequestEnUS>().var("siteRequest_");
		if(siteRequest_ == null) {
			_siteRequest_(siteRequest_Wrap);
			setSiteRequest_(siteRequest_Wrap.o);
		}
		return (SiteHtm)this;
	}

	///////////////
	// inheritPk //
	///////////////

	/**	 The entity inheritPk
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String inheritPk;

	/**	<br> The entity inheritPk
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:inheritPk">Find the entity inheritPk in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _inheritPk(Wrap<String> w);

	public String getInheritPk() {
		return inheritPk;
	}
	public void setInheritPk(String o) {
		this.inheritPk = SiteHtm.staticSetInheritPk(siteRequest_, o);
	}
	public static String staticSetInheritPk(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtm inheritPkInit() {
		Wrap<String> inheritPkWrap = new Wrap<String>().var("inheritPk");
		if(inheritPk == null) {
			_inheritPk(inheritPkWrap);
			setInheritPk(inheritPkWrap.o);
		}
		return (SiteHtm)this;
	}

	public static String staticSearchInheritPk(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrInheritPk(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqInheritPk(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrInheritPk(siteRequest_, SiteHtm.staticSearchInheritPk(siteRequest_, SiteHtm.staticSetInheritPk(siteRequest_, o)));
	}

	public String sqlInheritPk() {
		return inheritPk;
	}

	/////////////
	// created //
	/////////////

	/**	 The entity created
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonDeserialize(using = ComputateZonedDateTimeDeserializer.class)
	@JsonSerialize(using = ComputateZonedDateTimeSerializer.class)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSSV'['VV']'")
	@JsonInclude(Include.NON_NULL)
	protected ZonedDateTime created;

	/**	<br> The entity created
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:created">Find the entity created in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _created(Wrap<ZonedDateTime> w);

	public ZonedDateTime getCreated() {
		return created;
	}

	public void setCreated(ZonedDateTime created) {
		this.created = created;
	}
	@JsonIgnore
	public void setCreated(Instant o) {
		this.created = o == null ? null : ZonedDateTime.from(o).truncatedTo(ChronoUnit.MILLIS);
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	@JsonIgnore
	public void setCreated(String o) {
		this.created = SiteHtm.staticSetCreated(siteRequest_, o);
	}
	public static ZonedDateTime staticSetCreated(SiteRequestEnUS siteRequest_, String o) {
		if(StringUtils.endsWith(o, "]"))
			return o == null ? null : ZonedDateTime.parse(o, ComputateZonedDateTimeSerializer.ZONED_DATE_TIME_FORMATTER);
		else if(StringUtils.endsWith(o, "Z"))
			return o == null ? null : Instant.parse(o).atZone(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
		else if(StringUtils.contains(o, "T"))
			return o == null ? null : ZonedDateTime.parse(o, DateTimeFormatter.ISO_DATE_TIME).truncatedTo(ChronoUnit.MILLIS);
		else
			return o == null ? null : LocalDate.parse(o, DateTimeFormatter.ISO_DATE).atStartOfDay(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	@JsonIgnore
	public void setCreated(Date o) {
		this.created = o == null ? null : ZonedDateTime.ofInstant(o.toInstant(), ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	protected SiteHtm createdInit() {
		Wrap<ZonedDateTime> createdWrap = new Wrap<ZonedDateTime>().var("created");
		if(created == null) {
			_created(createdWrap);
			setCreated(createdWrap.o);
		}
		return (SiteHtm)this;
	}

	public static Date staticSearchCreated(SiteRequestEnUS siteRequest_, ZonedDateTime o) {
		return o == null ? null : Date.from(o.toInstant());
	}

	public static String staticSearchStrCreated(SiteRequestEnUS siteRequest_, Date o) {
		return "\"" + DateTimeFormatter.ISO_DATE_TIME.format(o.toInstant().atOffset(ZoneOffset.UTC)) + "\"";
	}

	public static String staticSearchFqCreated(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrCreated(siteRequest_, SiteHtm.staticSearchCreated(siteRequest_, SiteHtm.staticSetCreated(siteRequest_, o)));
	}

	public OffsetDateTime sqlCreated() {
		return created == null ? null : created.toOffsetDateTime();
	}

	//////////////
	// modified //
	//////////////

	/**	 The entity modified
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonDeserialize(using = ComputateZonedDateTimeDeserializer.class)
	@JsonSerialize(using = ComputateZonedDateTimeSerializer.class)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSSV'['VV']'")
	@JsonInclude(Include.NON_NULL)
	protected ZonedDateTime modified;

	/**	<br> The entity modified
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:modified">Find the entity modified in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _modified(Wrap<ZonedDateTime> w);

	public ZonedDateTime getModified() {
		return modified;
	}

	public void setModified(ZonedDateTime modified) {
		this.modified = modified;
	}
	@JsonIgnore
	public void setModified(Instant o) {
		this.modified = o == null ? null : ZonedDateTime.from(o).truncatedTo(ChronoUnit.MILLIS);
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	@JsonIgnore
	public void setModified(String o) {
		this.modified = SiteHtm.staticSetModified(siteRequest_, o);
	}
	public static ZonedDateTime staticSetModified(SiteRequestEnUS siteRequest_, String o) {
		if(StringUtils.endsWith(o, "]"))
			return o == null ? null : ZonedDateTime.parse(o, ComputateZonedDateTimeSerializer.ZONED_DATE_TIME_FORMATTER);
		else if(StringUtils.endsWith(o, "Z"))
			return o == null ? null : Instant.parse(o).atZone(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
		else if(StringUtils.contains(o, "T"))
			return o == null ? null : ZonedDateTime.parse(o, DateTimeFormatter.ISO_DATE_TIME).truncatedTo(ChronoUnit.MILLIS);
		else
			return o == null ? null : LocalDate.parse(o, DateTimeFormatter.ISO_DATE).atStartOfDay(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	@JsonIgnore
	public void setModified(Date o) {
		this.modified = o == null ? null : ZonedDateTime.ofInstant(o.toInstant(), ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	protected SiteHtm modifiedInit() {
		Wrap<ZonedDateTime> modifiedWrap = new Wrap<ZonedDateTime>().var("modified");
		if(modified == null) {
			_modified(modifiedWrap);
			setModified(modifiedWrap.o);
		}
		return (SiteHtm)this;
	}

	public static Date staticSearchModified(SiteRequestEnUS siteRequest_, ZonedDateTime o) {
		return o == null ? null : Date.from(o.toInstant());
	}

	public static String staticSearchStrModified(SiteRequestEnUS siteRequest_, Date o) {
		return "\"" + DateTimeFormatter.ISO_DATE_TIME.format(o.toInstant().atOffset(ZoneOffset.UTC)) + "\"";
	}

	public static String staticSearchFqModified(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrModified(siteRequest_, SiteHtm.staticSearchModified(siteRequest_, SiteHtm.staticSetModified(siteRequest_, o)));
	}

	//////////////
	// archived //
	//////////////

	/**	 The entity archived
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Boolean archived;

	/**	<br> The entity archived
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:archived">Find the entity archived in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _archived(Wrap<Boolean> w);

	public Boolean getArchived() {
		return archived;
	}

	public void setArchived(Boolean archived) {
		this.archived = archived;
	}
	@JsonIgnore
	public void setArchived(String o) {
		this.archived = SiteHtm.staticSetArchived(siteRequest_, o);
	}
	public static Boolean staticSetArchived(SiteRequestEnUS siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected SiteHtm archivedInit() {
		Wrap<Boolean> archivedWrap = new Wrap<Boolean>().var("archived");
		if(archived == null) {
			_archived(archivedWrap);
			setArchived(archivedWrap.o);
		}
		return (SiteHtm)this;
	}

	public static Boolean staticSearchArchived(SiteRequestEnUS siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrArchived(SiteRequestEnUS siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqArchived(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrArchived(siteRequest_, SiteHtm.staticSearchArchived(siteRequest_, SiteHtm.staticSetArchived(siteRequest_, o)));
	}

	public Boolean sqlArchived() {
		return archived;
	}

	/////////////
	// deleted //
	/////////////

	/**	 The entity deleted
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Boolean deleted;

	/**	<br> The entity deleted
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:deleted">Find the entity deleted in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _deleted(Wrap<Boolean> w);

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	@JsonIgnore
	public void setDeleted(String o) {
		this.deleted = SiteHtm.staticSetDeleted(siteRequest_, o);
	}
	public static Boolean staticSetDeleted(SiteRequestEnUS siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected SiteHtm deletedInit() {
		Wrap<Boolean> deletedWrap = new Wrap<Boolean>().var("deleted");
		if(deleted == null) {
			_deleted(deletedWrap);
			setDeleted(deletedWrap.o);
		}
		return (SiteHtm)this;
	}

	public static Boolean staticSearchDeleted(SiteRequestEnUS siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrDeleted(SiteRequestEnUS siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDeleted(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrDeleted(siteRequest_, SiteHtm.staticSearchDeleted(siteRequest_, SiteHtm.staticSetDeleted(siteRequest_, o)));
	}

	public Boolean sqlDeleted() {
		return deleted;
	}

	///////////
	// saves //
	///////////

	/**	 The entity saves
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> saves = new ArrayList<String>();

	/**	<br> The entity saves
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:saves">Find the entity saves in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _saves(List<String> l);

	public List<String> getSaves() {
		return saves;
	}

	public void setSaves(List<String> saves) {
		this.saves = saves;
	}
	public static String staticSetSaves(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public SiteHtm addSaves(String...objets) {
		for(String o : objets) {
			addSaves(o);
		}
		return (SiteHtm)this;
	}
	public SiteHtm addSaves(String o) {
		if(o != null)
			this.saves.add(o);
		return (SiteHtm)this;
	}
	@JsonIgnore
	public void setSaves(JsonArray objets) {
		saves.clear();
		for(int i = 0; i < objets.size(); i++) {
			String o = objets.getString(i);
			addSaves(o);
		}
	}
	protected SiteHtm savesInit() {
		_saves(saves);
		return (SiteHtm)this;
	}

	public static String staticSearchSaves(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSaves(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSaves(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrSaves(siteRequest_, SiteHtm.staticSearchSaves(siteRequest_, SiteHtm.staticSetSaves(siteRequest_, o)));
	}

	/////////
	// uri //
	/////////

	/**	 The entity uri
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String uri;

	/**	<br> The entity uri
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:uri">Find the entity uri in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _uri(Wrap<String> w);

	public String getUri() {
		return uri;
	}
	public void setUri(String o) {
		this.uri = SiteHtm.staticSetUri(siteRequest_, o);
	}
	public static String staticSetUri(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtm uriInit() {
		Wrap<String> uriWrap = new Wrap<String>().var("uri");
		if(uri == null) {
			_uri(uriWrap);
			setUri(uriWrap.o);
		}
		return (SiteHtm)this;
	}

	public static String staticSearchUri(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrUri(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUri(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrUri(siteRequest_, SiteHtm.staticSearchUri(siteRequest_, SiteHtm.staticSetUri(siteRequest_, o)));
	}

	public String sqlUri() {
		return uri;
	}

	////////////
	// pageId //
	////////////

	/**	 The entity pageId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageId;

	/**	<br> The entity pageId
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:pageId">Find the entity pageId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageId(Wrap<String> w);

	public String getPageId() {
		return pageId;
	}
	public void setPageId(String o) {
		this.pageId = SiteHtm.staticSetPageId(siteRequest_, o);
	}
	public static String staticSetPageId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtm pageIdInit() {
		Wrap<String> pageIdWrap = new Wrap<String>().var("pageId");
		if(pageId == null) {
			_pageId(pageIdWrap);
			setPageId(pageIdWrap.o);
		}
		return (SiteHtm)this;
	}

	public static String staticSearchPageId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageId(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrPageId(siteRequest_, SiteHtm.staticSearchPageId(siteRequest_, SiteHtm.staticSetPageId(siteRequest_, o)));
	}

	public String sqlPageId() {
		return pageId;
	}

	/////////////////
	// sequenceNum //
	/////////////////

	/**	 The entity sequenceNum
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long sequenceNum;

	/**	<br> The entity sequenceNum
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:sequenceNum">Find the entity sequenceNum in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _sequenceNum(Wrap<Long> w);

	public Long getSequenceNum() {
		return sequenceNum;
	}

	public void setSequenceNum(Long sequenceNum) {
		this.sequenceNum = sequenceNum;
	}
	@JsonIgnore
	public void setSequenceNum(String o) {
		this.sequenceNum = SiteHtm.staticSetSequenceNum(siteRequest_, o);
	}
	public static Long staticSetSequenceNum(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected SiteHtm sequenceNumInit() {
		Wrap<Long> sequenceNumWrap = new Wrap<Long>().var("sequenceNum");
		if(sequenceNum == null) {
			_sequenceNum(sequenceNumWrap);
			setSequenceNum(sequenceNumWrap.o);
		}
		return (SiteHtm)this;
	}

	public static Long staticSearchSequenceNum(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrSequenceNum(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSequenceNum(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrSequenceNum(siteRequest_, SiteHtm.staticSearchSequenceNum(siteRequest_, SiteHtm.staticSetSequenceNum(siteRequest_, o)));
	}

	public Long sqlSequenceNum() {
		return sequenceNum;
	}

	//////////////
	// htmGroup //
	//////////////

	/**	 The entity htmGroup
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String htmGroup;

	/**	<br> The entity htmGroup
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:htmGroup">Find the entity htmGroup in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _htmGroup(Wrap<String> w);

	public String getHtmGroup() {
		return htmGroup;
	}
	public void setHtmGroup(String o) {
		this.htmGroup = SiteHtm.staticSetHtmGroup(siteRequest_, o);
	}
	public static String staticSetHtmGroup(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtm htmGroupInit() {
		Wrap<String> htmGroupWrap = new Wrap<String>().var("htmGroup");
		if(htmGroup == null) {
			_htmGroup(htmGroupWrap);
			setHtmGroup(htmGroupWrap.o);
		}
		return (SiteHtm)this;
	}

	public static String staticSearchHtmGroup(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrHtmGroup(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqHtmGroup(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrHtmGroup(siteRequest_, SiteHtm.staticSearchHtmGroup(siteRequest_, SiteHtm.staticSetHtmGroup(siteRequest_, o)));
	}

	public String sqlHtmGroup() {
		return htmGroup;
	}

	/////////////
	// eBefore //
	/////////////

	/**	 The entity eBefore
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String eBefore;

	/**	<br> The entity eBefore
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:eBefore">Find the entity eBefore in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _eBefore(Wrap<String> w);

	public String getEBefore() {
		return eBefore;
	}
	public void setEBefore(String o) {
		this.eBefore = SiteHtm.staticSetEBefore(siteRequest_, o);
	}
	public static String staticSetEBefore(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtm eBeforeInit() {
		Wrap<String> eBeforeWrap = new Wrap<String>().var("eBefore");
		if(eBefore == null) {
			_eBefore(eBeforeWrap);
			setEBefore(eBeforeWrap.o);
		}
		return (SiteHtm)this;
	}

	public static String staticSearchEBefore(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrEBefore(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqEBefore(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrEBefore(siteRequest_, SiteHtm.staticSearchEBefore(siteRequest_, SiteHtm.staticSetEBefore(siteRequest_, o)));
	}

	public String sqlEBefore() {
		return eBefore;
	}

	////////////
	// eAfter //
	////////////

	/**	 The entity eAfter
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String eAfter;

	/**	<br> The entity eAfter
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:eAfter">Find the entity eAfter in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _eAfter(Wrap<String> w);

	public String getEAfter() {
		return eAfter;
	}
	public void setEAfter(String o) {
		this.eAfter = SiteHtm.staticSetEAfter(siteRequest_, o);
	}
	public static String staticSetEAfter(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtm eAfterInit() {
		Wrap<String> eAfterWrap = new Wrap<String>().var("eAfter");
		if(eAfter == null) {
			_eAfter(eAfterWrap);
			setEAfter(eAfterWrap.o);
		}
		return (SiteHtm)this;
	}

	public static String staticSearchEAfter(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrEAfter(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqEAfter(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrEAfter(siteRequest_, SiteHtm.staticSearchEAfter(siteRequest_, SiteHtm.staticSetEAfter(siteRequest_, o)));
	}

	public String sqlEAfter() {
		return eAfter;
	}

	///////
	// a //
	///////

	/**	 The entity a
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject a;

	/**	<br> The entity a
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:a">Find the entity a in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _a(Wrap<JsonObject> w);

	public JsonObject getA() {
		return a;
	}

	public void setA(JsonObject a) {
		this.a = a;
	}
	@JsonIgnore
	public void setA(String o) {
		this.a = SiteHtm.staticSetA(siteRequest_, o);
	}
	public static JsonObject staticSetA(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected SiteHtm aInit() {
		Wrap<JsonObject> aWrap = new Wrap<JsonObject>().var("a");
		if(a == null) {
			_a(aWrap);
			setA(aWrap.o);
		}
		return (SiteHtm)this;
	}

	public static JsonObject staticSearchA(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrA(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqA(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrA(siteRequest_, SiteHtm.staticSearchA(siteRequest_, SiteHtm.staticSetA(siteRequest_, o)));
	}

	public JsonObject sqlA() {
		return a;
	}

	//////////
	// text //
	//////////

	/**	 The entity text
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> text = new ArrayList<String>();

	/**	<br> The entity text
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:text">Find the entity text in Solr</a>
	 * <br>
	 * @param w is the entity already constructed. 
	 **/
	protected abstract void _text(List<String> w);

	public List<String> getText() {
		return text;
	}

	public void setText(List<String> text) {
		this.text = text;
	}
	public static String staticSetText(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public SiteHtm addText(String...objets) {
		for(String o : objets) {
			addText(o);
		}
		return (SiteHtm)this;
	}
	public SiteHtm addText(String o) {
		if(o != null)
			this.text.add(o);
		return (SiteHtm)this;
	}
	@JsonIgnore
	public void setText(JsonArray objets) {
		text.clear();
		for(int i = 0; i < objets.size(); i++) {
			String o = objets.getString(i);
			addText(o);
		}
	}
	protected SiteHtm textInit() {
		_text(text);
		return (SiteHtm)this;
	}

	public static String staticSearchText(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrText(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqText(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrText(siteRequest_, SiteHtm.staticSearchText(siteRequest_, SiteHtm.staticSetText(siteRequest_, o)));
	}

	public List<String> sqlText() {
		return text;
	}

	//////////
	// tabs //
	//////////

	/**	 The entity tabs
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String tabs;

	/**	<br> The entity tabs
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:tabs">Find the entity tabs in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _tabs(Wrap<String> w);

	public String getTabs() {
		return tabs;
	}
	public void setTabs(String o) {
		this.tabs = SiteHtm.staticSetTabs(siteRequest_, o);
	}
	public static String staticSetTabs(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtm tabsInit() {
		Wrap<String> tabsWrap = new Wrap<String>().var("tabs");
		if(tabs == null) {
			_tabs(tabsWrap);
			setTabs(tabsWrap.o);
		}
		return (SiteHtm)this;
	}

	public static String staticSearchTabs(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrTabs(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqTabs(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrTabs(siteRequest_, SiteHtm.staticSearchTabs(siteRequest_, SiteHtm.staticSetTabs(siteRequest_, o)));
	}

	public String sqlTabs() {
		return tabs;
	}

	/////////////
	// newLine //
	/////////////

	/**	 The entity newLine
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Boolean newLine;

	/**	<br> The entity newLine
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:newLine">Find the entity newLine in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _newLine(Wrap<Boolean> w);

	public Boolean getNewLine() {
		return newLine;
	}

	public void setNewLine(Boolean newLine) {
		this.newLine = newLine;
	}
	@JsonIgnore
	public void setNewLine(String o) {
		this.newLine = SiteHtm.staticSetNewLine(siteRequest_, o);
	}
	public static Boolean staticSetNewLine(SiteRequestEnUS siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected SiteHtm newLineInit() {
		Wrap<Boolean> newLineWrap = new Wrap<Boolean>().var("newLine");
		if(newLine == null) {
			_newLine(newLineWrap);
			setNewLine(newLineWrap.o);
		}
		return (SiteHtm)this;
	}

	public static Boolean staticSearchNewLine(SiteRequestEnUS siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrNewLine(SiteRequestEnUS siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqNewLine(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrNewLine(siteRequest_, SiteHtm.staticSearchNewLine(siteRequest_, SiteHtm.staticSetNewLine(siteRequest_, o)));
	}

	public Boolean sqlNewLine() {
		return newLine;
	}

	///////////////
	// htmBefore //
	///////////////

	/**	 The entity htmBefore
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String htmBefore;

	/**	<br> The entity htmBefore
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:htmBefore">Find the entity htmBefore in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _htmBefore(Wrap<String> w);

	public String getHtmBefore() {
		return htmBefore;
	}
	public void setHtmBefore(String o) {
		this.htmBefore = SiteHtm.staticSetHtmBefore(siteRequest_, o);
	}
	public static String staticSetHtmBefore(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtm htmBeforeInit() {
		Wrap<String> htmBeforeWrap = new Wrap<String>().var("htmBefore");
		if(htmBefore == null) {
			_htmBefore(htmBeforeWrap);
			setHtmBefore(htmBeforeWrap.o);
		}
		return (SiteHtm)this;
	}

	public static String staticSearchHtmBefore(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrHtmBefore(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqHtmBefore(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrHtmBefore(siteRequest_, SiteHtm.staticSearchHtmBefore(siteRequest_, SiteHtm.staticSetHtmBefore(siteRequest_, o)));
	}

	public String sqlHtmBefore() {
		return htmBefore;
	}

	//////////////
	// htmAfter //
	//////////////

	/**	 The entity htmAfter
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String htmAfter;

	/**	<br> The entity htmAfter
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:htmAfter">Find the entity htmAfter in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _htmAfter(Wrap<String> w);

	public String getHtmAfter() {
		return htmAfter;
	}
	public void setHtmAfter(String o) {
		this.htmAfter = SiteHtm.staticSetHtmAfter(siteRequest_, o);
	}
	public static String staticSetHtmAfter(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtm htmAfterInit() {
		Wrap<String> htmAfterWrap = new Wrap<String>().var("htmAfter");
		if(htmAfter == null) {
			_htmAfter(htmAfterWrap);
			setHtmAfter(htmAfterWrap.o);
		}
		return (SiteHtm)this;
	}

	public static String staticSearchHtmAfter(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrHtmAfter(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqHtmAfter(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrHtmAfter(siteRequest_, SiteHtm.staticSearchHtmAfter(siteRequest_, SiteHtm.staticSetHtmAfter(siteRequest_, o)));
	}

	public String sqlHtmAfter() {
		return htmAfter;
	}

	////////////////////////
	// classCanonicalName //
	////////////////////////

	/**	 The entity classCanonicalName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String classCanonicalName;

	/**	<br> The entity classCanonicalName
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:classCanonicalName">Find the entity classCanonicalName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _classCanonicalName(Wrap<String> w);

	public String getClassCanonicalName() {
		return classCanonicalName;
	}
	public void setClassCanonicalName(String o) {
		this.classCanonicalName = SiteHtm.staticSetClassCanonicalName(siteRequest_, o);
	}
	public static String staticSetClassCanonicalName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtm classCanonicalNameInit() {
		Wrap<String> classCanonicalNameWrap = new Wrap<String>().var("classCanonicalName");
		if(classCanonicalName == null) {
			_classCanonicalName(classCanonicalNameWrap);
			setClassCanonicalName(classCanonicalNameWrap.o);
		}
		return (SiteHtm)this;
	}

	public static String staticSearchClassCanonicalName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrClassCanonicalName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqClassCanonicalName(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrClassCanonicalName(siteRequest_, SiteHtm.staticSearchClassCanonicalName(siteRequest_, SiteHtm.staticSetClassCanonicalName(siteRequest_, o)));
	}

	/////////////////////
	// classSimpleName //
	/////////////////////

	/**	 The entity classSimpleName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String classSimpleName;

	/**	<br> The entity classSimpleName
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:classSimpleName">Find the entity classSimpleName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _classSimpleName(Wrap<String> w);

	public String getClassSimpleName() {
		return classSimpleName;
	}
	public void setClassSimpleName(String o) {
		this.classSimpleName = SiteHtm.staticSetClassSimpleName(siteRequest_, o);
	}
	public static String staticSetClassSimpleName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtm classSimpleNameInit() {
		Wrap<String> classSimpleNameWrap = new Wrap<String>().var("classSimpleName");
		if(classSimpleName == null) {
			_classSimpleName(classSimpleNameWrap);
			setClassSimpleName(classSimpleNameWrap.o);
		}
		return (SiteHtm)this;
	}

	public static String staticSearchClassSimpleName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrClassSimpleName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqClassSimpleName(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrClassSimpleName(siteRequest_, SiteHtm.staticSearchClassSimpleName(siteRequest_, SiteHtm.staticSetClassSimpleName(siteRequest_, o)));
	}

	/////////////////////////
	// classCanonicalNames //
	/////////////////////////

	/**	 The entity classCanonicalNames
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> classCanonicalNames = new ArrayList<String>();

	/**	<br> The entity classCanonicalNames
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:classCanonicalNames">Find the entity classCanonicalNames in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _classCanonicalNames(List<String> l);

	public List<String> getClassCanonicalNames() {
		return classCanonicalNames;
	}

	public void setClassCanonicalNames(List<String> classCanonicalNames) {
		this.classCanonicalNames = classCanonicalNames;
	}
	public static String staticSetClassCanonicalNames(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public SiteHtm addClassCanonicalNames(String...objets) {
		for(String o : objets) {
			addClassCanonicalNames(o);
		}
		return (SiteHtm)this;
	}
	public SiteHtm addClassCanonicalNames(String o) {
		if(o != null)
			this.classCanonicalNames.add(o);
		return (SiteHtm)this;
	}
	@JsonIgnore
	public void setClassCanonicalNames(JsonArray objets) {
		classCanonicalNames.clear();
		for(int i = 0; i < objets.size(); i++) {
			String o = objets.getString(i);
			addClassCanonicalNames(o);
		}
	}
	protected SiteHtm classCanonicalNamesInit() {
		_classCanonicalNames(classCanonicalNames);
		return (SiteHtm)this;
	}

	public static String staticSearchClassCanonicalNames(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrClassCanonicalNames(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqClassCanonicalNames(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrClassCanonicalNames(siteRequest_, SiteHtm.staticSearchClassCanonicalNames(siteRequest_, SiteHtm.staticSetClassCanonicalNames(siteRequest_, o)));
	}

	/////////////////
	// objectTitle //
	/////////////////

	/**	 The entity objectTitle
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String objectTitle;

	/**	<br> The entity objectTitle
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:objectTitle">Find the entity objectTitle in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _objectTitle(Wrap<String> w);

	public String getObjectTitle() {
		return objectTitle;
	}
	public void setObjectTitle(String o) {
		this.objectTitle = SiteHtm.staticSetObjectTitle(siteRequest_, o);
	}
	public static String staticSetObjectTitle(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtm objectTitleInit() {
		Wrap<String> objectTitleWrap = new Wrap<String>().var("objectTitle");
		if(objectTitle == null) {
			_objectTitle(objectTitleWrap);
			setObjectTitle(objectTitleWrap.o);
		}
		return (SiteHtm)this;
	}

	public static String staticSearchObjectTitle(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrObjectTitle(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqObjectTitle(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrObjectTitle(siteRequest_, SiteHtm.staticSearchObjectTitle(siteRequest_, SiteHtm.staticSetObjectTitle(siteRequest_, o)));
	}

	//////////////
	// objectId //
	//////////////

	/**	 The entity objectId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String objectId;

	/**	<br> The entity objectId
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:objectId">Find the entity objectId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _objectId(Wrap<String> w);

	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String o) {
		this.objectId = SiteHtm.staticSetObjectId(siteRequest_, o);
	}
	public static String staticSetObjectId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtm objectIdInit() {
		Wrap<String> objectIdWrap = new Wrap<String>().var("objectId");
		if(objectId == null) {
			_objectId(objectIdWrap);
			setObjectId(objectIdWrap.o);
		}
		return (SiteHtm)this;
	}

	public static String staticSearchObjectId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrObjectId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqObjectId(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrObjectId(siteRequest_, SiteHtm.staticSearchObjectId(siteRequest_, SiteHtm.staticSetObjectId(siteRequest_, o)));
	}

	public String sqlObjectId() {
		return objectId;
	}

	///////////////////
	// objectNameVar //
	///////////////////

	/**	 The entity objectNameVar
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String objectNameVar;

	/**	<br> The entity objectNameVar
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:objectNameVar">Find the entity objectNameVar in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _objectNameVar(Wrap<String> w);

	public String getObjectNameVar() {
		return objectNameVar;
	}
	public void setObjectNameVar(String o) {
		this.objectNameVar = SiteHtm.staticSetObjectNameVar(siteRequest_, o);
	}
	public static String staticSetObjectNameVar(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtm objectNameVarInit() {
		Wrap<String> objectNameVarWrap = new Wrap<String>().var("objectNameVar");
		if(objectNameVar == null) {
			_objectNameVar(objectNameVarWrap);
			setObjectNameVar(objectNameVarWrap.o);
		}
		return (SiteHtm)this;
	}

	public static String staticSearchObjectNameVar(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrObjectNameVar(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqObjectNameVar(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrObjectNameVar(siteRequest_, SiteHtm.staticSearchObjectNameVar(siteRequest_, SiteHtm.staticSetObjectNameVar(siteRequest_, o)));
	}

	///////////////////
	// objectSuggest //
	///////////////////

	/**	 The entity objectSuggest
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String objectSuggest;

	/**	<br> The entity objectSuggest
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:objectSuggest">Find the entity objectSuggest in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _objectSuggest(Wrap<String> w);

	public String getObjectSuggest() {
		return objectSuggest;
	}
	public void setObjectSuggest(String o) {
		this.objectSuggest = SiteHtm.staticSetObjectSuggest(siteRequest_, o);
	}
	public static String staticSetObjectSuggest(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtm objectSuggestInit() {
		Wrap<String> objectSuggestWrap = new Wrap<String>().var("objectSuggest");
		if(objectSuggest == null) {
			_objectSuggest(objectSuggestWrap);
			setObjectSuggest(objectSuggestWrap.o);
		}
		return (SiteHtm)this;
	}

	public static String staticSearchObjectSuggest(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrObjectSuggest(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqObjectSuggest(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrObjectSuggest(siteRequest_, SiteHtm.staticSearchObjectSuggest(siteRequest_, SiteHtm.staticSetObjectSuggest(siteRequest_, o)));
	}

	///////////////
	// pageUrlId //
	///////////////

	/**	 The entity pageUrlId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUrlId;

	/**	<br> The entity pageUrlId
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:pageUrlId">Find the entity pageUrlId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUrlId(Wrap<String> w);

	public String getPageUrlId() {
		return pageUrlId;
	}
	public void setPageUrlId(String o) {
		this.pageUrlId = SiteHtm.staticSetPageUrlId(siteRequest_, o);
	}
	public static String staticSetPageUrlId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtm pageUrlIdInit() {
		Wrap<String> pageUrlIdWrap = new Wrap<String>().var("pageUrlId");
		if(pageUrlId == null) {
			_pageUrlId(pageUrlIdWrap);
			setPageUrlId(pageUrlIdWrap.o);
		}
		return (SiteHtm)this;
	}

	public static String staticSearchPageUrlId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUrlId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUrlId(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrPageUrlId(siteRequest_, SiteHtm.staticSearchPageUrlId(siteRequest_, SiteHtm.staticSetPageUrlId(siteRequest_, o)));
	}

	///////////////
	// pageUrlPk //
	///////////////

	/**	 The entity pageUrlPk
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUrlPk;

	/**	<br> The entity pageUrlPk
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:pageUrlPk">Find the entity pageUrlPk in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUrlPk(Wrap<String> w);

	public String getPageUrlPk() {
		return pageUrlPk;
	}
	public void setPageUrlPk(String o) {
		this.pageUrlPk = SiteHtm.staticSetPageUrlPk(siteRequest_, o);
	}
	public static String staticSetPageUrlPk(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtm pageUrlPkInit() {
		Wrap<String> pageUrlPkWrap = new Wrap<String>().var("pageUrlPk");
		if(pageUrlPk == null) {
			_pageUrlPk(pageUrlPkWrap);
			setPageUrlPk(pageUrlPkWrap.o);
		}
		return (SiteHtm)this;
	}

	public static String staticSearchPageUrlPk(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUrlPk(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUrlPk(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrPageUrlPk(siteRequest_, SiteHtm.staticSearchPageUrlPk(siteRequest_, SiteHtm.staticSetPageUrlPk(siteRequest_, o)));
	}

	////////////////
	// pageUrlApi //
	////////////////

	/**	 The entity pageUrlApi
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUrlApi;

	/**	<br> The entity pageUrlApi
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:pageUrlApi">Find the entity pageUrlApi in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUrlApi(Wrap<String> w);

	public String getPageUrlApi() {
		return pageUrlApi;
	}
	public void setPageUrlApi(String o) {
		this.pageUrlApi = SiteHtm.staticSetPageUrlApi(siteRequest_, o);
	}
	public static String staticSetPageUrlApi(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtm pageUrlApiInit() {
		Wrap<String> pageUrlApiWrap = new Wrap<String>().var("pageUrlApi");
		if(pageUrlApi == null) {
			_pageUrlApi(pageUrlApiWrap);
			setPageUrlApi(pageUrlApiWrap.o);
		}
		return (SiteHtm)this;
	}

	public static String staticSearchPageUrlApi(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUrlApi(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUrlApi(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrPageUrlApi(siteRequest_, SiteHtm.staticSearchPageUrlApi(siteRequest_, SiteHtm.staticSetPageUrlApi(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.htm.SiteHtm&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = SiteHtm.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtm idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			setId(idWrap.o);
		}
		return (SiteHtm)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtm.staticSearchStrId(siteRequest_, SiteHtm.staticSearchId(siteRequest_, SiteHtm.staticSetId(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepSiteHtm(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepSiteHtm();
	}

	public Future<Void> promiseDeepSiteHtm() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseSiteHtm(promise2);
		promise2.future().onSuccess(a -> {
			promise.complete();
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseSiteHtm(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				promise2.complete();
			} catch(Exception ex) {
				promise2.fail(ex);
			}
			return promise2.future();
		}).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			promiseBeginPromise().onSuccess(promiseBegin -> {
				promise2.complete();
			}).onFailure(ex -> {
				promise2.fail(ex);
			});
			return promise2.future();
		}).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				siteRequest_Init();
				inheritPkInit();
				createdInit();
				modifiedInit();
				archivedInit();
				deletedInit();
				savesInit();
				uriInit();
				pageIdInit();
				sequenceNumInit();
				htmGroupInit();
				eBeforeInit();
				eAfterInit();
				aInit();
				textInit();
				tabsInit();
				newLineInit();
				htmBeforeInit();
				htmAfterInit();
				classCanonicalNameInit();
				classSimpleNameInit();
				classCanonicalNamesInit();
				objectTitleInit();
				objectIdInit();
				objectNameVarInit();
				objectSuggestInit();
				pageUrlIdInit();
				pageUrlPkInit();
				pageUrlApiInit();
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

	public Future<Void> promiseDeepForClass(SiteRequestEnUS siteRequest_) {
		return promiseDeepSiteHtm(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestSiteHtm(SiteRequestEnUS siteRequest_) {
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestSiteHtm(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainSiteHtm(v);
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
	public Object obtainSiteHtm(String var) {
		SiteHtm oSiteHtm = (SiteHtm)this;
		switch(var) {
			case "promiseBegin":
				return oSiteHtm.promiseBegin;
			case "siteRequest_":
				return oSiteHtm.siteRequest_;
			case "inheritPk":
				return oSiteHtm.inheritPk;
			case "created":
				return oSiteHtm.created;
			case "modified":
				return oSiteHtm.modified;
			case "archived":
				return oSiteHtm.archived;
			case "deleted":
				return oSiteHtm.deleted;
			case "saves":
				return oSiteHtm.saves;
			case "uri":
				return oSiteHtm.uri;
			case "pageId":
				return oSiteHtm.pageId;
			case "sequenceNum":
				return oSiteHtm.sequenceNum;
			case "htmGroup":
				return oSiteHtm.htmGroup;
			case "eBefore":
				return oSiteHtm.eBefore;
			case "eAfter":
				return oSiteHtm.eAfter;
			case "a":
				return oSiteHtm.a;
			case "text":
				return oSiteHtm.text;
			case "tabs":
				return oSiteHtm.tabs;
			case "newLine":
				return oSiteHtm.newLine;
			case "htmBefore":
				return oSiteHtm.htmBefore;
			case "htmAfter":
				return oSiteHtm.htmAfter;
			case "classCanonicalName":
				return oSiteHtm.classCanonicalName;
			case "classSimpleName":
				return oSiteHtm.classSimpleName;
			case "classCanonicalNames":
				return oSiteHtm.classCanonicalNames;
			case "objectTitle":
				return oSiteHtm.objectTitle;
			case "objectId":
				return oSiteHtm.objectId;
			case "objectNameVar":
				return oSiteHtm.objectNameVar;
			case "objectSuggest":
				return oSiteHtm.objectSuggest;
			case "pageUrlId":
				return oSiteHtm.pageUrlId;
			case "pageUrlPk":
				return oSiteHtm.pageUrlPk;
			case "pageUrlApi":
				return oSiteHtm.pageUrlApi;
			case "id":
				return oSiteHtm.id;
			default:
				return null;
		}
	}

	///////////////
	// relate //
	///////////////

	public boolean relateForClass(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = relateSiteHtm(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateSiteHtm(String var, Object val) {
		SiteHtm oSiteHtm = (SiteHtm)this;
		switch(var) {
			default:
				return null;
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetSiteHtm(entityVar,  siteRequest_, o);
	}
	public static Object staticSetSiteHtm(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "inheritPk":
			return SiteHtm.staticSetInheritPk(siteRequest_, o);
		case "created":
			return SiteHtm.staticSetCreated(siteRequest_, o);
		case "modified":
			return SiteHtm.staticSetModified(siteRequest_, o);
		case "archived":
			return SiteHtm.staticSetArchived(siteRequest_, o);
		case "deleted":
			return SiteHtm.staticSetDeleted(siteRequest_, o);
		case "saves":
			return SiteHtm.staticSetSaves(siteRequest_, o);
		case "uri":
			return SiteHtm.staticSetUri(siteRequest_, o);
		case "pageId":
			return SiteHtm.staticSetPageId(siteRequest_, o);
		case "sequenceNum":
			return SiteHtm.staticSetSequenceNum(siteRequest_, o);
		case "htmGroup":
			return SiteHtm.staticSetHtmGroup(siteRequest_, o);
		case "eBefore":
			return SiteHtm.staticSetEBefore(siteRequest_, o);
		case "eAfter":
			return SiteHtm.staticSetEAfter(siteRequest_, o);
		case "a":
			return SiteHtm.staticSetA(siteRequest_, o);
		case "text":
			return SiteHtm.staticSetText(siteRequest_, o);
		case "tabs":
			return SiteHtm.staticSetTabs(siteRequest_, o);
		case "newLine":
			return SiteHtm.staticSetNewLine(siteRequest_, o);
		case "htmBefore":
			return SiteHtm.staticSetHtmBefore(siteRequest_, o);
		case "htmAfter":
			return SiteHtm.staticSetHtmAfter(siteRequest_, o);
		case "classCanonicalName":
			return SiteHtm.staticSetClassCanonicalName(siteRequest_, o);
		case "classSimpleName":
			return SiteHtm.staticSetClassSimpleName(siteRequest_, o);
		case "classCanonicalNames":
			return SiteHtm.staticSetClassCanonicalNames(siteRequest_, o);
		case "objectTitle":
			return SiteHtm.staticSetObjectTitle(siteRequest_, o);
		case "objectId":
			return SiteHtm.staticSetObjectId(siteRequest_, o);
		case "objectNameVar":
			return SiteHtm.staticSetObjectNameVar(siteRequest_, o);
		case "objectSuggest":
			return SiteHtm.staticSetObjectSuggest(siteRequest_, o);
		case "pageUrlId":
			return SiteHtm.staticSetPageUrlId(siteRequest_, o);
		case "pageUrlPk":
			return SiteHtm.staticSetPageUrlPk(siteRequest_, o);
		case "pageUrlApi":
			return SiteHtm.staticSetPageUrlApi(siteRequest_, o);
		case "id":
			return SiteHtm.staticSetId(siteRequest_, o);
			default:
				return null;
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchSiteHtm(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchSiteHtm(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "inheritPk":
			return SiteHtm.staticSearchInheritPk(siteRequest_, (String)o);
		case "created":
			return SiteHtm.staticSearchCreated(siteRequest_, (ZonedDateTime)o);
		case "modified":
			return SiteHtm.staticSearchModified(siteRequest_, (ZonedDateTime)o);
		case "archived":
			return SiteHtm.staticSearchArchived(siteRequest_, (Boolean)o);
		case "deleted":
			return SiteHtm.staticSearchDeleted(siteRequest_, (Boolean)o);
		case "saves":
			return SiteHtm.staticSearchSaves(siteRequest_, (String)o);
		case "uri":
			return SiteHtm.staticSearchUri(siteRequest_, (String)o);
		case "pageId":
			return SiteHtm.staticSearchPageId(siteRequest_, (String)o);
		case "sequenceNum":
			return SiteHtm.staticSearchSequenceNum(siteRequest_, (Long)o);
		case "htmGroup":
			return SiteHtm.staticSearchHtmGroup(siteRequest_, (String)o);
		case "eBefore":
			return SiteHtm.staticSearchEBefore(siteRequest_, (String)o);
		case "eAfter":
			return SiteHtm.staticSearchEAfter(siteRequest_, (String)o);
		case "a":
			return SiteHtm.staticSearchA(siteRequest_, (JsonObject)o);
		case "text":
			return SiteHtm.staticSearchText(siteRequest_, (String)o);
		case "tabs":
			return SiteHtm.staticSearchTabs(siteRequest_, (String)o);
		case "newLine":
			return SiteHtm.staticSearchNewLine(siteRequest_, (Boolean)o);
		case "htmBefore":
			return SiteHtm.staticSearchHtmBefore(siteRequest_, (String)o);
		case "htmAfter":
			return SiteHtm.staticSearchHtmAfter(siteRequest_, (String)o);
		case "classCanonicalName":
			return SiteHtm.staticSearchClassCanonicalName(siteRequest_, (String)o);
		case "classSimpleName":
			return SiteHtm.staticSearchClassSimpleName(siteRequest_, (String)o);
		case "classCanonicalNames":
			return SiteHtm.staticSearchClassCanonicalNames(siteRequest_, (String)o);
		case "objectTitle":
			return SiteHtm.staticSearchObjectTitle(siteRequest_, (String)o);
		case "objectId":
			return SiteHtm.staticSearchObjectId(siteRequest_, (String)o);
		case "objectNameVar":
			return SiteHtm.staticSearchObjectNameVar(siteRequest_, (String)o);
		case "objectSuggest":
			return SiteHtm.staticSearchObjectSuggest(siteRequest_, (String)o);
		case "pageUrlId":
			return SiteHtm.staticSearchPageUrlId(siteRequest_, (String)o);
		case "pageUrlPk":
			return SiteHtm.staticSearchPageUrlPk(siteRequest_, (String)o);
		case "pageUrlApi":
			return SiteHtm.staticSearchPageUrlApi(siteRequest_, (String)o);
		case "id":
			return SiteHtm.staticSearchId(siteRequest_, (String)o);
			default:
				return null;
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrSiteHtm(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrSiteHtm(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "inheritPk":
			return SiteHtm.staticSearchStrInheritPk(siteRequest_, (String)o);
		case "created":
			return SiteHtm.staticSearchStrCreated(siteRequest_, (Date)o);
		case "modified":
			return SiteHtm.staticSearchStrModified(siteRequest_, (Date)o);
		case "archived":
			return SiteHtm.staticSearchStrArchived(siteRequest_, (Boolean)o);
		case "deleted":
			return SiteHtm.staticSearchStrDeleted(siteRequest_, (Boolean)o);
		case "saves":
			return SiteHtm.staticSearchStrSaves(siteRequest_, (String)o);
		case "uri":
			return SiteHtm.staticSearchStrUri(siteRequest_, (String)o);
		case "pageId":
			return SiteHtm.staticSearchStrPageId(siteRequest_, (String)o);
		case "sequenceNum":
			return SiteHtm.staticSearchStrSequenceNum(siteRequest_, (Long)o);
		case "htmGroup":
			return SiteHtm.staticSearchStrHtmGroup(siteRequest_, (String)o);
		case "eBefore":
			return SiteHtm.staticSearchStrEBefore(siteRequest_, (String)o);
		case "eAfter":
			return SiteHtm.staticSearchStrEAfter(siteRequest_, (String)o);
		case "a":
			return SiteHtm.staticSearchStrA(siteRequest_, (JsonObject)o);
		case "text":
			return SiteHtm.staticSearchStrText(siteRequest_, (String)o);
		case "tabs":
			return SiteHtm.staticSearchStrTabs(siteRequest_, (String)o);
		case "newLine":
			return SiteHtm.staticSearchStrNewLine(siteRequest_, (Boolean)o);
		case "htmBefore":
			return SiteHtm.staticSearchStrHtmBefore(siteRequest_, (String)o);
		case "htmAfter":
			return SiteHtm.staticSearchStrHtmAfter(siteRequest_, (String)o);
		case "classCanonicalName":
			return SiteHtm.staticSearchStrClassCanonicalName(siteRequest_, (String)o);
		case "classSimpleName":
			return SiteHtm.staticSearchStrClassSimpleName(siteRequest_, (String)o);
		case "classCanonicalNames":
			return SiteHtm.staticSearchStrClassCanonicalNames(siteRequest_, (String)o);
		case "objectTitle":
			return SiteHtm.staticSearchStrObjectTitle(siteRequest_, (String)o);
		case "objectId":
			return SiteHtm.staticSearchStrObjectId(siteRequest_, (String)o);
		case "objectNameVar":
			return SiteHtm.staticSearchStrObjectNameVar(siteRequest_, (String)o);
		case "objectSuggest":
			return SiteHtm.staticSearchStrObjectSuggest(siteRequest_, (String)o);
		case "pageUrlId":
			return SiteHtm.staticSearchStrPageUrlId(siteRequest_, (String)o);
		case "pageUrlPk":
			return SiteHtm.staticSearchStrPageUrlPk(siteRequest_, (String)o);
		case "pageUrlApi":
			return SiteHtm.staticSearchStrPageUrlApi(siteRequest_, (String)o);
		case "id":
			return SiteHtm.staticSearchStrId(siteRequest_, (String)o);
			default:
				return null;
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqSiteHtm(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqSiteHtm(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "inheritPk":
			return SiteHtm.staticSearchFqInheritPk(siteRequest_, o);
		case "created":
			return SiteHtm.staticSearchFqCreated(siteRequest_, o);
		case "modified":
			return SiteHtm.staticSearchFqModified(siteRequest_, o);
		case "archived":
			return SiteHtm.staticSearchFqArchived(siteRequest_, o);
		case "deleted":
			return SiteHtm.staticSearchFqDeleted(siteRequest_, o);
		case "saves":
			return SiteHtm.staticSearchFqSaves(siteRequest_, o);
		case "uri":
			return SiteHtm.staticSearchFqUri(siteRequest_, o);
		case "pageId":
			return SiteHtm.staticSearchFqPageId(siteRequest_, o);
		case "sequenceNum":
			return SiteHtm.staticSearchFqSequenceNum(siteRequest_, o);
		case "htmGroup":
			return SiteHtm.staticSearchFqHtmGroup(siteRequest_, o);
		case "eBefore":
			return SiteHtm.staticSearchFqEBefore(siteRequest_, o);
		case "eAfter":
			return SiteHtm.staticSearchFqEAfter(siteRequest_, o);
		case "a":
			return SiteHtm.staticSearchFqA(siteRequest_, o);
		case "text":
			return SiteHtm.staticSearchFqText(siteRequest_, o);
		case "tabs":
			return SiteHtm.staticSearchFqTabs(siteRequest_, o);
		case "newLine":
			return SiteHtm.staticSearchFqNewLine(siteRequest_, o);
		case "htmBefore":
			return SiteHtm.staticSearchFqHtmBefore(siteRequest_, o);
		case "htmAfter":
			return SiteHtm.staticSearchFqHtmAfter(siteRequest_, o);
		case "classCanonicalName":
			return SiteHtm.staticSearchFqClassCanonicalName(siteRequest_, o);
		case "classSimpleName":
			return SiteHtm.staticSearchFqClassSimpleName(siteRequest_, o);
		case "classCanonicalNames":
			return SiteHtm.staticSearchFqClassCanonicalNames(siteRequest_, o);
		case "objectTitle":
			return SiteHtm.staticSearchFqObjectTitle(siteRequest_, o);
		case "objectId":
			return SiteHtm.staticSearchFqObjectId(siteRequest_, o);
		case "objectNameVar":
			return SiteHtm.staticSearchFqObjectNameVar(siteRequest_, o);
		case "objectSuggest":
			return SiteHtm.staticSearchFqObjectSuggest(siteRequest_, o);
		case "pageUrlId":
			return SiteHtm.staticSearchFqPageUrlId(siteRequest_, o);
		case "pageUrlPk":
			return SiteHtm.staticSearchFqPageUrlPk(siteRequest_, o);
		case "pageUrlApi":
			return SiteHtm.staticSearchFqPageUrlApi(siteRequest_, o);
		case "id":
			return SiteHtm.staticSearchFqId(siteRequest_, o);
			default:
				return null;
		}
	}

	/////////////
	// persist //
	/////////////

	public boolean persistForClass(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		if(val != null) {
			for(String v : vars) {
				if(o == null)
					o = persistSiteHtm(v, val);
				else if(o instanceof BaseModel) {
					BaseModel oBaseModel = (BaseModel)o;
					o = oBaseModel.persistForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object persistSiteHtm(String var, Object val) {
		switch(var.toLowerCase()) {
			case "inheritpk":
				if(val instanceof String)
					setInheritPk((String)val);
				saves.add("inheritPk");
				return val;
			case "created":
				if(val instanceof ZonedDateTime)
					setCreated((ZonedDateTime)val);
				else if(val instanceof String)
					setCreated((String)val);
				else if(val instanceof OffsetDateTime)
					setCreated(((OffsetDateTime)val).atZoneSameInstant(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))));
				saves.add("created");
				return val;
			case "archived":
				if(val instanceof Boolean)
					setArchived((Boolean)val);
				else if(val instanceof String)
					setArchived((String)val);
				saves.add("archived");
				return val;
			case "deleted":
				if(val instanceof Boolean)
					setDeleted((Boolean)val);
				else if(val instanceof String)
					setDeleted((String)val);
				saves.add("deleted");
				return val;
			case "uri":
				if(val instanceof String)
					setUri((String)val);
				saves.add("uri");
				return val;
			case "pageid":
				if(val instanceof String)
					setPageId((String)val);
				saves.add("pageId");
				return val;
			case "sequencenum":
				if(val instanceof Long)
					setSequenceNum((Long)val);
				else if(val instanceof String)
					setSequenceNum((String)val);
				saves.add("sequenceNum");
				return val;
			case "htmgroup":
				if(val instanceof String)
					setHtmGroup((String)val);
				saves.add("htmGroup");
				return val;
			case "ebefore":
				if(val instanceof String)
					setEBefore((String)val);
				saves.add("eBefore");
				return val;
			case "eafter":
				if(val instanceof String)
					setEAfter((String)val);
				saves.add("eAfter");
				return val;
			case "a":
				if(val instanceof String)
					setA((String)val);
				else if(val instanceof JsonObject)
					setA((JsonObject)val);
				saves.add("a");
				return val;
			case "text":
				if(val instanceof List<?>)
					((List<String>)val).stream().forEach(v -> addText(v));
				else if(val instanceof JsonArray)
					((JsonArray)val).stream().forEach(v -> addText(v.toString()));
				if(!saves.contains("text"))
					saves.add("text");
				return val;
			case "tabs":
				if(val instanceof String)
					setTabs((String)val);
				saves.add("tabs");
				return val;
			case "newline":
				if(val instanceof Boolean)
					setNewLine((Boolean)val);
				else if(val instanceof String)
					setNewLine((String)val);
				saves.add("newLine");
				return val;
			case "htmbefore":
				if(val instanceof String)
					setHtmBefore((String)val);
				saves.add("htmBefore");
				return val;
			case "htmafter":
				if(val instanceof String)
					setHtmAfter((String)val);
				saves.add("htmAfter");
				return val;
			case "objectid":
				if(val instanceof String)
					setObjectId((String)val);
				saves.add("objectId");
				return val;
			default:
				return null;
		}
	}

	/////////////
	// populate //
	/////////////

	public void populateForClass(SolrResponse.Doc doc) {
		populateSiteHtm(doc);
	}
	public void populateSiteHtm(SolrResponse.Doc doc) {
		SiteHtm oSiteHtm = (SiteHtm)this;
		saves = doc.get("saves_docvalues_strings");
		if(saves != null) {
		}
	}

	public void indexSiteHtm(JsonObject doc) {
		if(inheritPk != null) {
			doc.put("inheritPk_docvalues_string", inheritPk);
		}
		if(created != null) {
			doc.put("created_docvalues_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(ZonedDateTime.ofInstant(created.toInstant(), ZoneId.of("UTC"))));
		}
		if(modified != null) {
			doc.put("modified_docvalues_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(ZonedDateTime.ofInstant(modified.toInstant(), ZoneId.of("UTC"))));
		}
		if(archived != null) {
			doc.put("archived_docvalues_boolean", archived);
		}
		if(deleted != null) {
			doc.put("deleted_docvalues_boolean", deleted);
		}
		if(saves != null) {
			JsonArray l = new JsonArray();
			doc.put("saves_docvalues_strings", l);
			for(String o : saves) {
				l.add(o);
			}
		}
		if(uri != null) {
			doc.put("uri_docvalues_string", uri);
		}
		if(pageId != null) {
			doc.put("pageId_docvalues_string", pageId);
		}
		if(sequenceNum != null) {
			doc.put("sequenceNum_docvalues_long", sequenceNum);
		}
		if(htmGroup != null) {
			doc.put("htmGroup_docvalues_string", htmGroup);
		}
		if(eBefore != null) {
			doc.put("eBefore_docvalues_string", eBefore);
		}
		if(eAfter != null) {
			doc.put("eAfter_docvalues_string", eAfter);
		}
		if(a != null) {
			doc.put("a_docvalues_string", a.toString());
		}
		if(text != null) {
			JsonArray l = new JsonArray();
			doc.put("text_text_enUS", l);
			for(String o : text) {
				l.add(o);
			}
		}
		if(tabs != null) {
			doc.put("tabs_docvalues_string", tabs);
		}
		if(newLine != null) {
			doc.put("newLine_docvalues_boolean", newLine);
		}
		if(htmBefore != null) {
			doc.put("htmBefore_stored_string", htmBefore);
		}
		if(htmAfter != null) {
			doc.put("htmAfter_stored_string", htmAfter);
		}
		if(classCanonicalName != null) {
			doc.put("classCanonicalName_docvalues_string", classCanonicalName);
		}
		if(classSimpleName != null) {
			doc.put("classSimpleName_docvalues_string", classSimpleName);
		}
		if(classCanonicalNames != null) {
			JsonArray l = new JsonArray();
			doc.put("classCanonicalNames_docvalues_strings", l);
			for(String o : classCanonicalNames) {
				l.add(o);
			}
		}
		if(objectTitle != null) {
			doc.put("objectTitle_docvalues_string", objectTitle);
		}
		if(objectId != null) {
			doc.put("objectId_docvalues_string", objectId);
		}
		if(objectSuggest != null) {
			doc.put("objectSuggest_suggested", objectSuggest);
		}
		if(pageUrlId != null) {
			doc.put("pageUrlId_docvalues_string", pageUrlId);
		}
		if(pageUrlPk != null) {
			doc.put("pageUrlPk_docvalues_string", pageUrlPk);
		}
		if(pageUrlApi != null) {
			doc.put("pageUrlApi_docvalues_string", pageUrlApi);
		}
		if(id != null) {
			doc.put("id", id);
		}
	}

	public static String varStoredSiteHtm(String entityVar) {
		switch(entityVar) {
			case "inheritPk":
				return "inheritPk_docvalues_string";
			case "created":
				return "created_docvalues_date";
			case "modified":
				return "modified_docvalues_date";
			case "archived":
				return "archived_docvalues_boolean";
			case "deleted":
				return "deleted_docvalues_boolean";
			case "saves":
				return "saves_docvalues_strings";
			case "uri":
				return "uri_docvalues_string";
			case "pageId":
				return "pageId_docvalues_string";
			case "sequenceNum":
				return "sequenceNum_docvalues_long";
			case "htmGroup":
				return "htmGroup_docvalues_string";
			case "eBefore":
				return "eBefore_docvalues_string";
			case "eAfter":
				return "eAfter_docvalues_string";
			case "a":
				return "a_docvalues_string";
			case "tabs":
				return "tabs_docvalues_string";
			case "newLine":
				return "newLine_docvalues_boolean";
			case "htmBefore":
				return "htmBefore_stored_string";
			case "htmAfter":
				return "htmAfter_stored_string";
			case "classCanonicalName":
				return "classCanonicalName_docvalues_string";
			case "classSimpleName":
				return "classSimpleName_docvalues_string";
			case "classCanonicalNames":
				return "classCanonicalNames_docvalues_strings";
			case "objectTitle":
				return "objectTitle_docvalues_string";
			case "objectId":
				return "objectId_docvalues_string";
			case "pageUrlId":
				return "pageUrlId_docvalues_string";
			case "pageUrlPk":
				return "pageUrlPk_docvalues_string";
			case "pageUrlApi":
				return "pageUrlApi_docvalues_string";
			default:
				return null;
		}
	}

	public static String varIndexedSiteHtm(String entityVar) {
		switch(entityVar) {
			case "inheritPk":
				return "inheritPk_docvalues_string";
			case "created":
				return "created_docvalues_date";
			case "modified":
				return "modified_docvalues_date";
			case "archived":
				return "archived_docvalues_boolean";
			case "deleted":
				return "deleted_docvalues_boolean";
			case "saves":
				return "saves_docvalues_strings";
			case "uri":
				return "uri_docvalues_string";
			case "pageId":
				return "pageId_docvalues_string";
			case "sequenceNum":
				return "sequenceNum_docvalues_long";
			case "htmGroup":
				return "htmGroup_docvalues_string";
			case "eBefore":
				return "eBefore_docvalues_string";
			case "eAfter":
				return "eAfter_docvalues_string";
			case "a":
				return "a_docvalues_string";
			case "text":
				return "text_text_enUS";
			case "tabs":
				return "tabs_docvalues_string";
			case "newLine":
				return "newLine_docvalues_boolean";
			case "classCanonicalName":
				return "classCanonicalName_docvalues_string";
			case "classSimpleName":
				return "classSimpleName_docvalues_string";
			case "classCanonicalNames":
				return "classCanonicalNames_docvalues_strings";
			case "objectTitle":
				return "objectTitle_docvalues_string";
			case "objectId":
				return "objectId_docvalues_string";
			case "objectSuggest":
				return "objectSuggest_suggested";
			case "pageUrlId":
				return "pageUrlId_docvalues_string";
			case "pageUrlPk":
				return "pageUrlPk_docvalues_string";
			case "pageUrlApi":
				return "pageUrlApi_docvalues_string";
			case "id":
				return "id";
			default:
				return null;
		}
	}

	public static String searchVarSiteHtm(String searchVar) {
		switch(searchVar) {
			case "inheritPk_docvalues_string":
				return "inheritPk";
			case "created_docvalues_date":
				return "created";
			case "modified_docvalues_date":
				return "modified";
			case "archived_docvalues_boolean":
				return "archived";
			case "deleted_docvalues_boolean":
				return "deleted";
			case "saves_docvalues_strings":
				return "saves";
			case "uri_docvalues_string":
				return "uri";
			case "pageId_docvalues_string":
				return "pageId";
			case "sequenceNum_docvalues_long":
				return "sequenceNum";
			case "htmGroup_docvalues_string":
				return "htmGroup";
			case "eBefore_docvalues_string":
				return "eBefore";
			case "eAfter_docvalues_string":
				return "eAfter";
			case "a_docvalues_string":
				return "a";
			case "text_text_enUS":
				return "text";
			case "tabs_docvalues_string":
				return "tabs";
			case "newLine_docvalues_boolean":
				return "newLine";
			case "htmBefore_stored_string":
				return "htmBefore";
			case "htmAfter_stored_string":
				return "htmAfter";
			case "classCanonicalName_docvalues_string":
				return "classCanonicalName";
			case "classSimpleName_docvalues_string":
				return "classSimpleName";
			case "classCanonicalNames_docvalues_strings":
				return "classCanonicalNames";
			case "objectTitle_docvalues_string":
				return "objectTitle";
			case "objectId_docvalues_string":
				return "objectId";
			case "objectSuggest_suggested":
				return "objectSuggest";
			case "pageUrlId_docvalues_string":
				return "pageUrlId";
			case "pageUrlPk_docvalues_string":
				return "pageUrlPk";
			case "pageUrlApi_docvalues_string":
				return "pageUrlApi";
			case "id":
				return "id";
			default:
				return null;
		}
	}

	public static String varSearchSiteHtm(String entityVar) {
		switch(entityVar) {
			case "text":
				return "text_text_enUS";
			case "objectSuggest":
				return "objectSuggest_suggested";
			default:
				return null;
		}
	}

	public static String varSuggestedSiteHtm(String entityVar) {
		switch(entityVar) {
			case "objectSuggest":
				return "objectSuggest_suggested";
			default:
				return null;
		}
	}

	/////////////
	// store //
	/////////////

	public void storeForClass(SolrResponse.Doc doc) {
		storeSiteHtm(doc);
	}
	public void storeSiteHtm(SolrResponse.Doc doc) {
		SiteHtm oSiteHtm = (SiteHtm)this;

		oSiteHtm.setInheritPk(Optional.ofNullable(doc.get("inheritPk_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setCreated(Optional.ofNullable(doc.get("created_docvalues_date")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setModified(Optional.ofNullable(doc.get("modified_docvalues_date")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setArchived(Optional.ofNullable(doc.get("archived_docvalues_boolean")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setDeleted(Optional.ofNullable(doc.get("deleted_docvalues_boolean")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("saves_docvalues_strings")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oSiteHtm.addSaves(v.toString());
		});
		oSiteHtm.setUri(Optional.ofNullable(doc.get("uri_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setPageId(Optional.ofNullable(doc.get("pageId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setSequenceNum(Optional.ofNullable(doc.get("sequenceNum_docvalues_long")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setHtmGroup(Optional.ofNullable(doc.get("htmGroup_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setEBefore(Optional.ofNullable(doc.get("eBefore_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setEAfter(Optional.ofNullable(doc.get("eAfter_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setA(Optional.ofNullable(doc.get("a_docvalues_string")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("text_text_enUS")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oSiteHtm.addText(v.toString());
		});
		oSiteHtm.setTabs(Optional.ofNullable(doc.get("tabs_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setNewLine(Optional.ofNullable(doc.get("newLine_docvalues_boolean")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setHtmBefore(Optional.ofNullable(doc.get("htmBefore_stored_string")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setHtmAfter(Optional.ofNullable(doc.get("htmAfter_stored_string")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setClassCanonicalName(Optional.ofNullable(doc.get("classCanonicalName_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setClassSimpleName(Optional.ofNullable(doc.get("classSimpleName_docvalues_string")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("classCanonicalNames_docvalues_strings")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oSiteHtm.addClassCanonicalNames(v.toString());
		});
		oSiteHtm.setObjectTitle(Optional.ofNullable(doc.get("objectTitle_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setObjectId(Optional.ofNullable(doc.get("objectId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setObjectSuggest(Optional.ofNullable(doc.get("objectSuggest_suggested")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setPageUrlId(Optional.ofNullable(doc.get("pageUrlId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setPageUrlPk(Optional.ofNullable(doc.get("pageUrlPk_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteHtm.setPageUrlApi(Optional.ofNullable(doc.get("pageUrlApi_docvalues_string")).map(v -> v.toString()).orElse(null));
		String id = (String)doc.get("id");
		oSiteHtm.setId(id);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestSiteHtm() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof SiteHtm) {
			SiteHtm original = (SiteHtm)o;
			if(!Objects.equals(inheritPk, original.getInheritPk()))
				apiRequest.addVars("inheritPk");
			if(!Objects.equals(created, original.getCreated()))
				apiRequest.addVars("created");
			if(!Objects.equals(modified, original.getModified()))
				apiRequest.addVars("modified");
			if(!Objects.equals(archived, original.getArchived()))
				apiRequest.addVars("archived");
			if(!Objects.equals(deleted, original.getDeleted()))
				apiRequest.addVars("deleted");
			if(!Objects.equals(saves, original.getSaves()))
				apiRequest.addVars("saves");
			if(!Objects.equals(uri, original.getUri()))
				apiRequest.addVars("uri");
			if(!Objects.equals(pageId, original.getPageId()))
				apiRequest.addVars("pageId");
			if(!Objects.equals(sequenceNum, original.getSequenceNum()))
				apiRequest.addVars("sequenceNum");
			if(!Objects.equals(htmGroup, original.getHtmGroup()))
				apiRequest.addVars("htmGroup");
			if(!Objects.equals(eBefore, original.getEBefore()))
				apiRequest.addVars("eBefore");
			if(!Objects.equals(eAfter, original.getEAfter()))
				apiRequest.addVars("eAfter");
			if(!Objects.equals(a, original.getA()))
				apiRequest.addVars("a");
			if(!Objects.equals(text, original.getText()))
				apiRequest.addVars("text");
			if(!Objects.equals(tabs, original.getTabs()))
				apiRequest.addVars("tabs");
			if(!Objects.equals(newLine, original.getNewLine()))
				apiRequest.addVars("newLine");
			if(!Objects.equals(htmBefore, original.getHtmBefore()))
				apiRequest.addVars("htmBefore");
			if(!Objects.equals(htmAfter, original.getHtmAfter()))
				apiRequest.addVars("htmAfter");
			if(!Objects.equals(classCanonicalName, original.getClassCanonicalName()))
				apiRequest.addVars("classCanonicalName");
			if(!Objects.equals(classSimpleName, original.getClassSimpleName()))
				apiRequest.addVars("classSimpleName");
			if(!Objects.equals(classCanonicalNames, original.getClassCanonicalNames()))
				apiRequest.addVars("classCanonicalNames");
			if(!Objects.equals(objectTitle, original.getObjectTitle()))
				apiRequest.addVars("objectTitle");
			if(!Objects.equals(objectId, original.getObjectId()))
				apiRequest.addVars("objectId");
			if(!Objects.equals(objectSuggest, original.getObjectSuggest()))
				apiRequest.addVars("objectSuggest");
			if(!Objects.equals(pageUrlId, original.getPageUrlId()))
				apiRequest.addVars("pageUrlId");
			if(!Objects.equals(pageUrlPk, original.getPageUrlPk()))
				apiRequest.addVars("pageUrlPk");
			if(!Objects.equals(pageUrlApi, original.getPageUrlApi()))
				apiRequest.addVars("pageUrlApi");
			if(!Objects.equals(id, original.getId()))
				apiRequest.addVars("id");
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Optional.ofNullable(inheritPk).map(v -> "inheritPk: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(created).map(v -> "created: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(modified).map(v -> "modified: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(archived).map(v -> "archived: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(deleted).map(v -> "deleted: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(saves).map(v -> "saves: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(uri).map(v -> "uri: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(pageId).map(v -> "pageId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(sequenceNum).map(v -> "sequenceNum: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(htmGroup).map(v -> "htmGroup: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(eBefore).map(v -> "eBefore: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(eAfter).map(v -> "eAfter: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(a).map(v -> "a: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(text).map(v -> "text: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(tabs).map(v -> "tabs: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(newLine).map(v -> "newLine: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(htmBefore).map(v -> "htmBefore: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(htmAfter).map(v -> "htmAfter: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(classCanonicalName).map(v -> "classCanonicalName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(classSimpleName).map(v -> "classSimpleName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(classCanonicalNames).map(v -> "classCanonicalNames: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(objectTitle).map(v -> "objectTitle: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(objectId).map(v -> "objectId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(objectSuggest).map(v -> "objectSuggest: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(pageUrlId).map(v -> "pageUrlId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(pageUrlPk).map(v -> "pageUrlPk: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(pageUrlApi).map(v -> "pageUrlApi: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(id).map(v -> "id: \"" + v + "\"\n" ).orElse(""));
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "SiteHtm";
	public static final String VAR_promiseBegin = "promiseBegin";
	public static final String VAR_siteRequest_ = "siteRequest_";
	public static final String VAR_inheritPk = "inheritPk";
	public static final String VAR_created = "created";
	public static final String VAR_modified = "modified";
	public static final String VAR_archived = "archived";
	public static final String VAR_deleted = "deleted";
	public static final String VAR_saves = "saves";
	public static final String VAR_uri = "uri";
	public static final String VAR_pageId = "pageId";
	public static final String VAR_sequenceNum = "sequenceNum";
	public static final String VAR_htmGroup = "htmGroup";
	public static final String VAR_eBefore = "eBefore";
	public static final String VAR_eAfter = "eAfter";
	public static final String VAR_a = "a";
	public static final String VAR_text = "text";
	public static final String VAR_tabs = "tabs";
	public static final String VAR_newLine = "newLine";
	public static final String VAR_htmBefore = "htmBefore";
	public static final String VAR_htmAfter = "htmAfter";
	public static final String VAR_classCanonicalName = "classCanonicalName";
	public static final String VAR_classSimpleName = "classSimpleName";
	public static final String VAR_classCanonicalNames = "classCanonicalNames";
	public static final String VAR_objectTitle = "objectTitle";
	public static final String VAR_objectId = "objectId";
	public static final String VAR_objectNameVar = "objectNameVar";
	public static final String VAR_objectSuggest = "objectSuggest";
	public static final String VAR_pageUrlId = "pageUrlId";
	public static final String VAR_pageUrlPk = "pageUrlPk";
	public static final String VAR_pageUrlApi = "pageUrlApi";
	public static final String VAR_id = "id";

	public static List<String> varsQForClass() {
		return SiteHtm.varsQSiteHtm(new ArrayList<String>());
	}
	public static List<String> varsQSiteHtm(List<String> vars) {
		vars.add(VAR_text);
		vars.add(VAR_objectSuggest);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return SiteHtm.varsFqSiteHtm(new ArrayList<String>());
	}
	public static List<String> varsFqSiteHtm(List<String> vars) {
		vars.add(VAR_created);
		vars.add(VAR_uri);
		vars.add(VAR_pageId);
		vars.add(VAR_sequenceNum);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return SiteHtm.varsRangeSiteHtm(new ArrayList<String>());
	}
	public static List<String> varsRangeSiteHtm(List<String> vars) {
		vars.add(VAR_created);
		vars.add(VAR_sequenceNum);
		return vars;
	}

	public static final String DISPLAY_NAME_promiseBegin = "";
	public static final String DISPLAY_NAME_siteRequest_ = "";
	public static final String DISPLAY_NAME_inheritPk = "";
	public static final String DISPLAY_NAME_created = "created";
	public static final String DISPLAY_NAME_modified = "modified";
	public static final String DISPLAY_NAME_archived = "archived";
	public static final String DISPLAY_NAME_deleted = "deleted";
	public static final String DISPLAY_NAME_saves = "";
	public static final String DISPLAY_NAME_uri = "Page ID";
	public static final String DISPLAY_NAME_pageId = "Page ID";
	public static final String DISPLAY_NAME_sequenceNum = "Sequence Number";
	public static final String DISPLAY_NAME_htmGroup = "HTML Group";
	public static final String DISPLAY_NAME_eBefore = "HTML Element";
	public static final String DISPLAY_NAME_eAfter = "HTML Element";
	public static final String DISPLAY_NAME_a = "HTML Element";
	public static final String DISPLAY_NAME_text = "Text";
	public static final String DISPLAY_NAME_tabs = "Tabs";
	public static final String DISPLAY_NAME_newLine = "Tabs";
	public static final String DISPLAY_NAME_htmBefore = "HTML before";
	public static final String DISPLAY_NAME_htmAfter = "HTML after";
	public static final String DISPLAY_NAME_classCanonicalName = "";
	public static final String DISPLAY_NAME_classSimpleName = "";
	public static final String DISPLAY_NAME_classCanonicalNames = "";
	public static final String DISPLAY_NAME_objectTitle = "";
	public static final String DISPLAY_NAME_objectId = "ID";
	public static final String DISPLAY_NAME_objectNameVar = "";
	public static final String DISPLAY_NAME_objectSuggest = "autosuggest";
	public static final String DISPLAY_NAME_pageUrlId = "";
	public static final String DISPLAY_NAME_pageUrlPk = "";
	public static final String DISPLAY_NAME_pageUrlApi = "";
	public static final String DISPLAY_NAME_id = "";

	public static String displayNameForClass(String var) {
		return SiteHtm.displayNameSiteHtm(var);
	}
	public static String displayNameSiteHtm(String var) {
		switch(var) {
		case VAR_promiseBegin:
			return DISPLAY_NAME_promiseBegin;
		case VAR_siteRequest_:
			return DISPLAY_NAME_siteRequest_;
		case VAR_inheritPk:
			return DISPLAY_NAME_inheritPk;
		case VAR_created:
			return DISPLAY_NAME_created;
		case VAR_modified:
			return DISPLAY_NAME_modified;
		case VAR_archived:
			return DISPLAY_NAME_archived;
		case VAR_deleted:
			return DISPLAY_NAME_deleted;
		case VAR_saves:
			return DISPLAY_NAME_saves;
		case VAR_uri:
			return DISPLAY_NAME_uri;
		case VAR_pageId:
			return DISPLAY_NAME_pageId;
		case VAR_sequenceNum:
			return DISPLAY_NAME_sequenceNum;
		case VAR_htmGroup:
			return DISPLAY_NAME_htmGroup;
		case VAR_eBefore:
			return DISPLAY_NAME_eBefore;
		case VAR_eAfter:
			return DISPLAY_NAME_eAfter;
		case VAR_a:
			return DISPLAY_NAME_a;
		case VAR_text:
			return DISPLAY_NAME_text;
		case VAR_tabs:
			return DISPLAY_NAME_tabs;
		case VAR_newLine:
			return DISPLAY_NAME_newLine;
		case VAR_htmBefore:
			return DISPLAY_NAME_htmBefore;
		case VAR_htmAfter:
			return DISPLAY_NAME_htmAfter;
		case VAR_classCanonicalName:
			return DISPLAY_NAME_classCanonicalName;
		case VAR_classSimpleName:
			return DISPLAY_NAME_classSimpleName;
		case VAR_classCanonicalNames:
			return DISPLAY_NAME_classCanonicalNames;
		case VAR_objectTitle:
			return DISPLAY_NAME_objectTitle;
		case VAR_objectId:
			return DISPLAY_NAME_objectId;
		case VAR_objectNameVar:
			return DISPLAY_NAME_objectNameVar;
		case VAR_objectSuggest:
			return DISPLAY_NAME_objectSuggest;
		case VAR_pageUrlId:
			return DISPLAY_NAME_pageUrlId;
		case VAR_pageUrlPk:
			return DISPLAY_NAME_pageUrlPk;
		case VAR_pageUrlApi:
			return DISPLAY_NAME_pageUrlApi;
		case VAR_id:
			return DISPLAY_NAME_id;
		default:
			return null;
		}
	}

	public static String descriptionSiteHtm(String var) {
		switch(var) {
		case VAR_promiseBegin:
			return "An asynchronous method for searching for related problems to this message";
		case VAR_siteRequest_:
			return "The current request object";
		case VAR_inheritPk:
			return "An optional inherited primary key from a legacy system for this object in the database";
		case VAR_created:
			return "A created timestamp for this record in the database";
		case VAR_modified:
			return "A modified timestamp for this record in the database";
		case VAR_archived:
			return "For archiving this record";
		case VAR_deleted:
			return "For deleting this record";
		case VAR_saves:
			return "A list of fields that are saved for this record in the database";
		case VAR_uri:
			return "The ID for this page. ";
		case VAR_pageId:
			return "The ID for this page. ";
		case VAR_sequenceNum:
			return "The sequence number for this page. ";
		case VAR_htmGroup:
			return "The HTML group. ";
		case VAR_eBefore:
			return "The HTML element. ";
		case VAR_eAfter:
			return "The HTML element. ";
		case VAR_a:
			return "The HTML element. ";
		case VAR_text:
			return "The text. ";
		case VAR_tabs:
			return "The tabs. ";
		case VAR_newLine:
			return "The tabs. ";
		case VAR_htmBefore:
			return "The HTML that comes before the text. ";
		case VAR_htmAfter:
			return "The HTML that comes after the text. ";
		case VAR_classCanonicalName:
			return "the canonical name of this Java class";
		case VAR_classSimpleName:
			return "The simple name of this Java class";
		case VAR_classCanonicalNames:
			return "All the inherited canonical names of this Java class";
		case VAR_objectTitle:
			return "The title of this object";
		case VAR_objectId:
			return "A URL friendly unique ID for this object";
		case VAR_objectNameVar:
			return "The var that identifies this type of object in the API";
		case VAR_objectSuggest:
			return "The indexed field in the search engine for this record while using autosuggest";
		case VAR_pageUrlId:
			return "The link by name for this object in the UI";
		case VAR_pageUrlPk:
			return "The link by primary key for this object in the UI";
		case VAR_pageUrlApi:
			return "The link to this object in the API";
		case VAR_id:
			return "The unique key for this record in the search engine";
			default:
				return null;
		}
	}

	public static String classSimpleNameSiteHtm(String var) {
		switch(var) {
		case VAR_promiseBegin:
			return "Void";
		case VAR_siteRequest_:
			return "SiteRequestEnUS";
		case VAR_inheritPk:
			return "String";
		case VAR_created:
			return "ZonedDateTime";
		case VAR_modified:
			return "ZonedDateTime";
		case VAR_archived:
			return "Boolean";
		case VAR_deleted:
			return "Boolean";
		case VAR_saves:
			return "List";
		case VAR_uri:
			return "String";
		case VAR_pageId:
			return "String";
		case VAR_sequenceNum:
			return "Long";
		case VAR_htmGroup:
			return "String";
		case VAR_eBefore:
			return "String";
		case VAR_eAfter:
			return "String";
		case VAR_a:
			return "JsonObject";
		case VAR_text:
			return "List";
		case VAR_tabs:
			return "String";
		case VAR_newLine:
			return "Boolean";
		case VAR_htmBefore:
			return "String";
		case VAR_htmAfter:
			return "String";
		case VAR_classCanonicalName:
			return "String";
		case VAR_classSimpleName:
			return "String";
		case VAR_classCanonicalNames:
			return "List";
		case VAR_objectTitle:
			return "String";
		case VAR_objectId:
			return "String";
		case VAR_objectNameVar:
			return "String";
		case VAR_objectSuggest:
			return "String";
		case VAR_pageUrlId:
			return "String";
		case VAR_pageUrlPk:
			return "String";
		case VAR_pageUrlApi:
			return "String";
		case VAR_id:
			return "String";
			default:
				return null;
		}
	}

	public static Integer htmlColumnSiteHtm(String var) {
		switch(var) {
		case VAR_created:
			return 1;
		case VAR_uri:
			return 3;
		case VAR_pageId:
			return 3;
		case VAR_sequenceNum:
			return 4;
		case VAR_objectTitle:
			return 2;
			default:
				return null;
		}
	}

	public static Integer htmlRowSiteHtm(String var) {
		switch(var) {
		case VAR_created:
			return 1;
		case VAR_modified:
			return 1;
		case VAR_archived:
			return 2;
		case VAR_deleted:
			return 2;
		case VAR_uri:
			return 3;
		case VAR_pageId:
			return 3;
		case VAR_sequenceNum:
			return 3;
		case VAR_objectId:
			return 1;
			default:
				return null;
		}
	}

	public static Integer htmlCellSiteHtm(String var) {
		switch(var) {
		case VAR_created:
			return 2;
		case VAR_modified:
			return 3;
		case VAR_archived:
			return 1;
		case VAR_deleted:
			return 2;
		case VAR_uri:
			return 1;
		case VAR_pageId:
			return 1;
		case VAR_sequenceNum:
			return 2;
		case VAR_objectId:
			return 4;
			default:
				return null;
		}
	}

	public static Integer lengthMinSiteHtm(String var) {
		switch(var) {
			default:
				return null;
		}
	}

	public static Integer lengthMaxSiteHtm(String var) {
		switch(var) {
			default:
				return null;
		}
	}

	public static Integer maxSiteHtm(String var) {
		switch(var) {
			default:
				return null;
		}
	}

	public static Integer minSiteHtm(String var) {
		switch(var) {
			default:
				return null;
		}
	}
}
