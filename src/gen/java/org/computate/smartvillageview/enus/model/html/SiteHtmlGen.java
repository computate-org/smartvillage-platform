package org.computate.smartvillageview.enus.model.html;

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
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;
import io.vertx.core.json.JsonObject;

/**	
 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.html.SiteHtml">Find the class SiteHtml in Solr. </a>
 * <br><br>Delete the class SiteHtml in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.html.SiteHtml&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>Delete  the package org.computate.smartvillageview.enus.model.html in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.html&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>Delete  the project smart-village-view in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smart\-village\-view&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>
 **/
public abstract class SiteHtmlGen<DEV> extends Object {
	protected static final Logger LOG = LoggerFactory.getLogger(SiteHtml.class);

	public static final String SiteHtml_Description_enUS = "An HTML part that is indexed in the search engine. ";
	public static final String SiteHtml_AName_enUS = "an HTML";
	public static final String SiteHtml_This_enUS = "this ";
	public static final String SiteHtml_ThisName_enUS = "this HTML";
	public static final String SiteHtml_A_enUS = "a ";
	public static final String SiteHtml_TheName_enUS = "theHTML";
	public static final String SiteHtml_NameSingular_enUS = "HTML";
	public static final String SiteHtml_NamePlural_enUS = "HTMLs";
	public static final String SiteHtml_NameActual_enUS = "current HTML";
	public static final String SiteHtml_AllName_enUS = "all the HTMLs";
	public static final String SiteHtml_SearchAllNameBy_enUS = "search HTMLs by ";
	public static final String SiteHtml_Title_enUS = "HTMLs";
	public static final String SiteHtml_ThePluralName_enUS = "the HTMLs";
	public static final String SiteHtml_NoNameFound_enUS = "no HTML found";
	public static final String SiteHtml_NameVar_enUS = "html";
	public static final String SiteHtml_OfName_enUS = "of HTML";
	public static final String SiteHtml_ANameAdjective_enUS = "an HTML";
	public static final String SiteHtml_NameAdjectiveSingular_enUS = "HTML";
	public static final String SiteHtml_NameAdjectivePlural_enUS = "HTMLs";
	public static final String Search_enUS_Uri = "/api/html";
	public static final String Search_enUS_ImageUri = "/png/api/html-999.png";
	public static final String GET_enUS_Uri = "/api/html/{id}";
	public static final String GET_enUS_ImageUri = "/png/api/html/{id}-999.png";
	public static final String POST_enUS_Uri = "/api/html";
	public static final String POST_enUS_ImageUri = "/png/api/html-999.png";
	public static final String PATCH_enUS_Uri = "/api/html";
	public static final String PATCH_enUS_ImageUri = "/png/api/html-999.png";
	public static final String PUTImport_enUS_Uri = "/api/html-import";
	public static final String PUTImport_enUS_ImageUri = "/png/api/html-import-999.png";
	public static final String SearchPage_enUS_Uri = "/html";
	public static final String SearchPage_enUS_ImageUri = "/png/html-999.png";

	public static final String SiteHtml_Color = "2017-navy-peony";
	public static final String SiteHtml_IconGroup = "duotone";
	public static final String SiteHtml_IconName = "code";

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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.html.SiteHtml&fq=entiteVar_enUS_indexed_string:promiseBegin">Find the entity promiseBegin in Solr</a>
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.html.SiteHtml&fq=entiteVar_enUS_indexed_string:siteRequest_">Find the entity siteRequest_ in Solr</a>
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
	protected SiteHtml siteRequest_Init() {
		Wrap<SiteRequestEnUS> siteRequest_Wrap = new Wrap<SiteRequestEnUS>().var("siteRequest_");
		if(siteRequest_ == null) {
			_siteRequest_(siteRequest_Wrap);
			setSiteRequest_(siteRequest_Wrap.o);
		}
		return (SiteHtml)this;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.html.SiteHtml&fq=entiteVar_enUS_indexed_string:inheritPk">Find the entity inheritPk in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _inheritPk(Wrap<String> w);

	public String getInheritPk() {
		return inheritPk;
	}
	public void setInheritPk(String o) {
		this.inheritPk = SiteHtml.staticSetInheritPk(siteRequest_, o);
	}
	public static String staticSetInheritPk(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtml inheritPkInit() {
		Wrap<String> inheritPkWrap = new Wrap<String>().var("inheritPk");
		if(inheritPk == null) {
			_inheritPk(inheritPkWrap);
			setInheritPk(inheritPkWrap.o);
		}
		return (SiteHtml)this;
	}

	public static String staticSearchInheritPk(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrInheritPk(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqInheritPk(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtml.staticSearchStrInheritPk(siteRequest_, SiteHtml.staticSearchInheritPk(siteRequest_, SiteHtml.staticSetInheritPk(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.html.SiteHtml&fq=entiteVar_enUS_indexed_string:created">Find the entity created in Solr</a>
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
		this.created = SiteHtml.staticSetCreated(siteRequest_, o);
	}
	public static ZonedDateTime staticSetCreated(SiteRequestEnUS siteRequest_, String o) {
		if(StringUtils.endsWith(o, "]"))
			return o == null ? null : ZonedDateTime.parse(o, ComputateZonedDateTimeSerializer.ZONED_DATE_TIME_FORMATTER);
		if(StringUtils.endsWith(o, "Z"))
			return o == null ? null : Instant.parse(o).atZone(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
		if(StringUtils.contains(o, "T"))
			return o == null ? null : ZonedDateTime.parse(o, DateTimeFormatter.ISO_DATE_TIME).truncatedTo(ChronoUnit.MILLIS);
		else
			return o == null ? null : LocalDate.parse(o, DateTimeFormatter.ISO_DATE).atStartOfDay(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	@JsonIgnore
	public void setCreated(Date o) {
		this.created = o == null ? null : ZonedDateTime.ofInstant(o.toInstant(), ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	protected SiteHtml createdInit() {
		Wrap<ZonedDateTime> createdWrap = new Wrap<ZonedDateTime>().var("created");
		if(created == null) {
			_created(createdWrap);
			setCreated(createdWrap.o);
		}
		return (SiteHtml)this;
	}

	public static Date staticSearchCreated(SiteRequestEnUS siteRequest_, ZonedDateTime o) {
		return o == null ? null : Date.from(o.toInstant());
	}

	public static String staticSearchStrCreated(SiteRequestEnUS siteRequest_, Date o) {
		return "\"" + DateTimeFormatter.ISO_DATE_TIME.format(o.toInstant().atOffset(ZoneOffset.UTC)) + "\"";
	}

	public static String staticSearchFqCreated(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtml.staticSearchStrCreated(siteRequest_, SiteHtml.staticSearchCreated(siteRequest_, SiteHtml.staticSetCreated(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.html.SiteHtml&fq=entiteVar_enUS_indexed_string:modified">Find the entity modified in Solr</a>
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
		this.modified = SiteHtml.staticSetModified(siteRequest_, o);
	}
	public static ZonedDateTime staticSetModified(SiteRequestEnUS siteRequest_, String o) {
		if(StringUtils.endsWith(o, "]"))
			return o == null ? null : ZonedDateTime.parse(o, ComputateZonedDateTimeSerializer.ZONED_DATE_TIME_FORMATTER);
		if(StringUtils.endsWith(o, "Z"))
			return o == null ? null : Instant.parse(o).atZone(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
		if(StringUtils.contains(o, "T"))
			return o == null ? null : ZonedDateTime.parse(o, DateTimeFormatter.ISO_DATE_TIME).truncatedTo(ChronoUnit.MILLIS);
		else
			return o == null ? null : LocalDate.parse(o, DateTimeFormatter.ISO_DATE).atStartOfDay(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	@JsonIgnore
	public void setModified(Date o) {
		this.modified = o == null ? null : ZonedDateTime.ofInstant(o.toInstant(), ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	protected SiteHtml modifiedInit() {
		Wrap<ZonedDateTime> modifiedWrap = new Wrap<ZonedDateTime>().var("modified");
		if(modified == null) {
			_modified(modifiedWrap);
			setModified(modifiedWrap.o);
		}
		return (SiteHtml)this;
	}

	public static Date staticSearchModified(SiteRequestEnUS siteRequest_, ZonedDateTime o) {
		return o == null ? null : Date.from(o.toInstant());
	}

	public static String staticSearchStrModified(SiteRequestEnUS siteRequest_, Date o) {
		return "\"" + DateTimeFormatter.ISO_DATE_TIME.format(o.toInstant().atOffset(ZoneOffset.UTC)) + "\"";
	}

	public static String staticSearchFqModified(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtml.staticSearchStrModified(siteRequest_, SiteHtml.staticSearchModified(siteRequest_, SiteHtml.staticSetModified(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.html.SiteHtml&fq=entiteVar_enUS_indexed_string:archived">Find the entity archived in Solr</a>
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
		this.archived = SiteHtml.staticSetArchived(siteRequest_, o);
	}
	public static Boolean staticSetArchived(SiteRequestEnUS siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected SiteHtml archivedInit() {
		Wrap<Boolean> archivedWrap = new Wrap<Boolean>().var("archived");
		if(archived == null) {
			_archived(archivedWrap);
			setArchived(archivedWrap.o);
		}
		return (SiteHtml)this;
	}

	public static Boolean staticSearchArchived(SiteRequestEnUS siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrArchived(SiteRequestEnUS siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqArchived(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtml.staticSearchStrArchived(siteRequest_, SiteHtml.staticSearchArchived(siteRequest_, SiteHtml.staticSetArchived(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.html.SiteHtml&fq=entiteVar_enUS_indexed_string:deleted">Find the entity deleted in Solr</a>
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
		this.deleted = SiteHtml.staticSetDeleted(siteRequest_, o);
	}
	public static Boolean staticSetDeleted(SiteRequestEnUS siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected SiteHtml deletedInit() {
		Wrap<Boolean> deletedWrap = new Wrap<Boolean>().var("deleted");
		if(deleted == null) {
			_deleted(deletedWrap);
			setDeleted(deletedWrap.o);
		}
		return (SiteHtml)this;
	}

	public static Boolean staticSearchDeleted(SiteRequestEnUS siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrDeleted(SiteRequestEnUS siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDeleted(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtml.staticSearchStrDeleted(siteRequest_, SiteHtml.staticSearchDeleted(siteRequest_, SiteHtml.staticSetDeleted(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.html.SiteHtml&fq=entiteVar_enUS_indexed_string:saves">Find the entity saves in Solr</a>
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
	public SiteHtml addSaves(String...objets) {
		for(String o : objets) {
			addSaves(o);
		}
		return (SiteHtml)this;
	}
	public SiteHtml addSaves(String o) {
		if(o != null)
			this.saves.add(o);
		return (SiteHtml)this;
	}
	@JsonIgnore
	public void setSaves(JsonArray objets) {
		saves.clear();
		for(int i = 0; i < objets.size(); i++) {
			String o = objets.getString(i);
			addSaves(o);
		}
	}
	protected SiteHtml savesInit() {
		_saves(saves);
		return (SiteHtml)this;
	}

	public static String staticSearchSaves(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSaves(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSaves(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtml.staticSearchStrSaves(siteRequest_, SiteHtml.staticSearchSaves(siteRequest_, SiteHtml.staticSetSaves(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.html.SiteHtml&fq=entiteVar_enUS_indexed_string:pageId">Find the entity pageId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageId(Wrap<String> w);

	public String getPageId() {
		return pageId;
	}
	public void setPageId(String o) {
		this.pageId = SiteHtml.staticSetPageId(siteRequest_, o);
	}
	public static String staticSetPageId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtml pageIdInit() {
		Wrap<String> pageIdWrap = new Wrap<String>().var("pageId");
		if(pageId == null) {
			_pageId(pageIdWrap);
			setPageId(pageIdWrap.o);
		}
		return (SiteHtml)this;
	}

	public static String staticSearchPageId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageId(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtml.staticSearchStrPageId(siteRequest_, SiteHtml.staticSearchPageId(siteRequest_, SiteHtml.staticSetPageId(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.html.SiteHtml&fq=entiteVar_enUS_indexed_string:sequenceNum">Find the entity sequenceNum in Solr</a>
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
		this.sequenceNum = SiteHtml.staticSetSequenceNum(siteRequest_, o);
	}
	public static Long staticSetSequenceNum(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected SiteHtml sequenceNumInit() {
		Wrap<Long> sequenceNumWrap = new Wrap<Long>().var("sequenceNum");
		if(sequenceNum == null) {
			_sequenceNum(sequenceNumWrap);
			setSequenceNum(sequenceNumWrap.o);
		}
		return (SiteHtml)this;
	}

	public static Long staticSearchSequenceNum(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrSequenceNum(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSequenceNum(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtml.staticSearchStrSequenceNum(siteRequest_, SiteHtml.staticSearchSequenceNum(siteRequest_, SiteHtml.staticSetSequenceNum(siteRequest_, o)));
	}

	public Long sqlSequenceNum() {
		return sequenceNum;
	}

	///////////////
	// htmlGroup //
	///////////////

	/**	 The entity htmlGroup
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String htmlGroup;

	/**	<br> The entity htmlGroup
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.html.SiteHtml&fq=entiteVar_enUS_indexed_string:htmlGroup">Find the entity htmlGroup in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _htmlGroup(Wrap<String> w);

	public String getHtmlGroup() {
		return htmlGroup;
	}
	public void setHtmlGroup(String o) {
		this.htmlGroup = SiteHtml.staticSetHtmlGroup(siteRequest_, o);
	}
	public static String staticSetHtmlGroup(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtml htmlGroupInit() {
		Wrap<String> htmlGroupWrap = new Wrap<String>().var("htmlGroup");
		if(htmlGroup == null) {
			_htmlGroup(htmlGroupWrap);
			setHtmlGroup(htmlGroupWrap.o);
		}
		return (SiteHtml)this;
	}

	public static String staticSearchHtmlGroup(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrHtmlGroup(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqHtmlGroup(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtml.staticSearchStrHtmlGroup(siteRequest_, SiteHtml.staticSearchHtmlGroup(siteRequest_, SiteHtml.staticSetHtmlGroup(siteRequest_, o)));
	}

	public String sqlHtmlGroup() {
		return htmlGroup;
	}

	///////
	// e //
	///////

	/**	 The entity e
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String e;

	/**	<br> The entity e
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.html.SiteHtml&fq=entiteVar_enUS_indexed_string:e">Find the entity e in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _e(Wrap<String> w);

	public String getE() {
		return e;
	}
	public void setE(String o) {
		this.e = SiteHtml.staticSetE(siteRequest_, o);
	}
	public static String staticSetE(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtml eInit() {
		Wrap<String> eWrap = new Wrap<String>().var("e");
		if(e == null) {
			_e(eWrap);
			setE(eWrap.o);
		}
		return (SiteHtml)this;
	}

	public static String staticSearchE(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrE(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqE(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtml.staticSearchStrE(siteRequest_, SiteHtml.staticSearchE(siteRequest_, SiteHtml.staticSetE(siteRequest_, o)));
	}

	public String sqlE() {
		return e;
	}

	///////
	// a //
	///////

	/**	 The entity a
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> a = new ArrayList<String>();

	/**	<br> The entity a
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.html.SiteHtml&fq=entiteVar_enUS_indexed_string:a">Find the entity a in Solr</a>
	 * <br>
	 * @param w is the entity already constructed. 
	 **/
	protected abstract void _a(List<String> w);

	public List<String> getA() {
		return a;
	}

	public void setA(List<String> a) {
		this.a = a;
	}
	public static String staticSetA(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public SiteHtml addA(String...objets) {
		for(String o : objets) {
			addA(o);
		}
		return (SiteHtml)this;
	}
	public SiteHtml addA(String o) {
		if(o != null)
			this.a.add(o);
		return (SiteHtml)this;
	}
	@JsonIgnore
	public void setA(JsonArray objets) {
		a.clear();
		for(int i = 0; i < objets.size(); i++) {
			String o = objets.getString(i);
			addA(o);
		}
	}
	protected SiteHtml aInit() {
		_a(a);
		return (SiteHtml)this;
	}

	public static String staticSearchA(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrA(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqA(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtml.staticSearchStrA(siteRequest_, SiteHtml.staticSearchA(siteRequest_, SiteHtml.staticSetA(siteRequest_, o)));
	}

	public List<String> sqlA() {
		return a;
	}

	////////////////
	// htmlBefore //
	////////////////

	/**	 The entity htmlBefore
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String htmlBefore;

	/**	<br> The entity htmlBefore
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.html.SiteHtml&fq=entiteVar_enUS_indexed_string:htmlBefore">Find the entity htmlBefore in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _htmlBefore(Wrap<String> w);

	public String getHtmlBefore() {
		return htmlBefore;
	}
	public void setHtmlBefore(String o) {
		this.htmlBefore = SiteHtml.staticSetHtmlBefore(siteRequest_, o);
	}
	public static String staticSetHtmlBefore(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtml htmlBeforeInit() {
		Wrap<String> htmlBeforeWrap = new Wrap<String>().var("htmlBefore");
		if(htmlBefore == null) {
			_htmlBefore(htmlBeforeWrap);
			setHtmlBefore(htmlBeforeWrap.o);
		}
		return (SiteHtml)this;
	}

	public static String staticSearchHtmlBefore(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrHtmlBefore(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqHtmlBefore(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtml.staticSearchStrHtmlBefore(siteRequest_, SiteHtml.staticSearchHtmlBefore(siteRequest_, SiteHtml.staticSetHtmlBefore(siteRequest_, o)));
	}

	public String sqlHtmlBefore() {
		return htmlBefore;
	}

	///////////////
	// htmlAfter //
	///////////////

	/**	 The entity htmlAfter
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String htmlAfter;

	/**	<br> The entity htmlAfter
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.html.SiteHtml&fq=entiteVar_enUS_indexed_string:htmlAfter">Find the entity htmlAfter in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _htmlAfter(Wrap<String> w);

	public String getHtmlAfter() {
		return htmlAfter;
	}
	public void setHtmlAfter(String o) {
		this.htmlAfter = SiteHtml.staticSetHtmlAfter(siteRequest_, o);
	}
	public static String staticSetHtmlAfter(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtml htmlAfterInit() {
		Wrap<String> htmlAfterWrap = new Wrap<String>().var("htmlAfter");
		if(htmlAfter == null) {
			_htmlAfter(htmlAfterWrap);
			setHtmlAfter(htmlAfterWrap.o);
		}
		return (SiteHtml)this;
	}

	public static String staticSearchHtmlAfter(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrHtmlAfter(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqHtmlAfter(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtml.staticSearchStrHtmlAfter(siteRequest_, SiteHtml.staticSearchHtmlAfter(siteRequest_, SiteHtml.staticSetHtmlAfter(siteRequest_, o)));
	}

	public String sqlHtmlAfter() {
		return htmlAfter;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.html.SiteHtml&fq=entiteVar_enUS_indexed_string:classCanonicalName">Find the entity classCanonicalName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _classCanonicalName(Wrap<String> w);

	public String getClassCanonicalName() {
		return classCanonicalName;
	}
	public void setClassCanonicalName(String o) {
		this.classCanonicalName = SiteHtml.staticSetClassCanonicalName(siteRequest_, o);
	}
	public static String staticSetClassCanonicalName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtml classCanonicalNameInit() {
		Wrap<String> classCanonicalNameWrap = new Wrap<String>().var("classCanonicalName");
		if(classCanonicalName == null) {
			_classCanonicalName(classCanonicalNameWrap);
			setClassCanonicalName(classCanonicalNameWrap.o);
		}
		return (SiteHtml)this;
	}

	public static String staticSearchClassCanonicalName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrClassCanonicalName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqClassCanonicalName(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtml.staticSearchStrClassCanonicalName(siteRequest_, SiteHtml.staticSearchClassCanonicalName(siteRequest_, SiteHtml.staticSetClassCanonicalName(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.html.SiteHtml&fq=entiteVar_enUS_indexed_string:classSimpleName">Find the entity classSimpleName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _classSimpleName(Wrap<String> w);

	public String getClassSimpleName() {
		return classSimpleName;
	}
	public void setClassSimpleName(String o) {
		this.classSimpleName = SiteHtml.staticSetClassSimpleName(siteRequest_, o);
	}
	public static String staticSetClassSimpleName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtml classSimpleNameInit() {
		Wrap<String> classSimpleNameWrap = new Wrap<String>().var("classSimpleName");
		if(classSimpleName == null) {
			_classSimpleName(classSimpleNameWrap);
			setClassSimpleName(classSimpleNameWrap.o);
		}
		return (SiteHtml)this;
	}

	public static String staticSearchClassSimpleName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrClassSimpleName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqClassSimpleName(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtml.staticSearchStrClassSimpleName(siteRequest_, SiteHtml.staticSearchClassSimpleName(siteRequest_, SiteHtml.staticSetClassSimpleName(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.html.SiteHtml&fq=entiteVar_enUS_indexed_string:classCanonicalNames">Find the entity classCanonicalNames in Solr</a>
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
	public SiteHtml addClassCanonicalNames(String...objets) {
		for(String o : objets) {
			addClassCanonicalNames(o);
		}
		return (SiteHtml)this;
	}
	public SiteHtml addClassCanonicalNames(String o) {
		if(o != null)
			this.classCanonicalNames.add(o);
		return (SiteHtml)this;
	}
	@JsonIgnore
	public void setClassCanonicalNames(JsonArray objets) {
		classCanonicalNames.clear();
		for(int i = 0; i < objets.size(); i++) {
			String o = objets.getString(i);
			addClassCanonicalNames(o);
		}
	}
	protected SiteHtml classCanonicalNamesInit() {
		_classCanonicalNames(classCanonicalNames);
		return (SiteHtml)this;
	}

	public static String staticSearchClassCanonicalNames(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrClassCanonicalNames(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqClassCanonicalNames(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtml.staticSearchStrClassCanonicalNames(siteRequest_, SiteHtml.staticSearchClassCanonicalNames(siteRequest_, SiteHtml.staticSetClassCanonicalNames(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.html.SiteHtml&fq=entiteVar_enUS_indexed_string:objectTitle">Find the entity objectTitle in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _objectTitle(Wrap<String> w);

	public String getObjectTitle() {
		return objectTitle;
	}
	public void setObjectTitle(String o) {
		this.objectTitle = SiteHtml.staticSetObjectTitle(siteRequest_, o);
	}
	public static String staticSetObjectTitle(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtml objectTitleInit() {
		Wrap<String> objectTitleWrap = new Wrap<String>().var("objectTitle");
		if(objectTitle == null) {
			_objectTitle(objectTitleWrap);
			setObjectTitle(objectTitleWrap.o);
		}
		return (SiteHtml)this;
	}

	public static String staticSearchObjectTitle(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrObjectTitle(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqObjectTitle(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtml.staticSearchStrObjectTitle(siteRequest_, SiteHtml.staticSearchObjectTitle(siteRequest_, SiteHtml.staticSetObjectTitle(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.html.SiteHtml&fq=entiteVar_enUS_indexed_string:objectId">Find the entity objectId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _objectId(Wrap<String> w);

	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String o) {
		this.objectId = SiteHtml.staticSetObjectId(siteRequest_, o);
	}
	public static String staticSetObjectId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtml objectIdInit() {
		Wrap<String> objectIdWrap = new Wrap<String>().var("objectId");
		if(objectId == null) {
			_objectId(objectIdWrap);
			setObjectId(objectIdWrap.o);
		}
		return (SiteHtml)this;
	}

	public static String staticSearchObjectId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrObjectId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqObjectId(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtml.staticSearchStrObjectId(siteRequest_, SiteHtml.staticSearchObjectId(siteRequest_, SiteHtml.staticSetObjectId(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.html.SiteHtml&fq=entiteVar_enUS_indexed_string:objectNameVar">Find the entity objectNameVar in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _objectNameVar(Wrap<String> w);

	public String getObjectNameVar() {
		return objectNameVar;
	}
	public void setObjectNameVar(String o) {
		this.objectNameVar = SiteHtml.staticSetObjectNameVar(siteRequest_, o);
	}
	public static String staticSetObjectNameVar(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtml objectNameVarInit() {
		Wrap<String> objectNameVarWrap = new Wrap<String>().var("objectNameVar");
		if(objectNameVar == null) {
			_objectNameVar(objectNameVarWrap);
			setObjectNameVar(objectNameVarWrap.o);
		}
		return (SiteHtml)this;
	}

	public static String staticSearchObjectNameVar(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrObjectNameVar(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqObjectNameVar(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtml.staticSearchStrObjectNameVar(siteRequest_, SiteHtml.staticSearchObjectNameVar(siteRequest_, SiteHtml.staticSetObjectNameVar(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.html.SiteHtml&fq=entiteVar_enUS_indexed_string:objectSuggest">Find the entity objectSuggest in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _objectSuggest(Wrap<String> w);

	public String getObjectSuggest() {
		return objectSuggest;
	}
	public void setObjectSuggest(String o) {
		this.objectSuggest = SiteHtml.staticSetObjectSuggest(siteRequest_, o);
	}
	public static String staticSetObjectSuggest(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtml objectSuggestInit() {
		Wrap<String> objectSuggestWrap = new Wrap<String>().var("objectSuggest");
		if(objectSuggest == null) {
			_objectSuggest(objectSuggestWrap);
			setObjectSuggest(objectSuggestWrap.o);
		}
		return (SiteHtml)this;
	}

	public static String staticSearchObjectSuggest(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrObjectSuggest(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqObjectSuggest(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtml.staticSearchStrObjectSuggest(siteRequest_, SiteHtml.staticSearchObjectSuggest(siteRequest_, SiteHtml.staticSetObjectSuggest(siteRequest_, o)));
	}

	////////////////
	// objectText //
	////////////////

	/**	 The entity objectText
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String objectText;

	/**	<br> The entity objectText
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.html.SiteHtml&fq=entiteVar_enUS_indexed_string:objectText">Find the entity objectText in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _objectText(Wrap<String> w);

	public String getObjectText() {
		return objectText;
	}
	public void setObjectText(String o) {
		this.objectText = SiteHtml.staticSetObjectText(siteRequest_, o);
	}
	public static String staticSetObjectText(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtml objectTextInit() {
		Wrap<String> objectTextWrap = new Wrap<String>().var("objectText");
		if(objectText == null) {
			_objectText(objectTextWrap);
			setObjectText(objectTextWrap.o);
		}
		return (SiteHtml)this;
	}

	public static String staticSearchObjectText(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrObjectText(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqObjectText(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtml.staticSearchStrObjectText(siteRequest_, SiteHtml.staticSearchObjectText(siteRequest_, SiteHtml.staticSetObjectText(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.html.SiteHtml&fq=entiteVar_enUS_indexed_string:pageUrlId">Find the entity pageUrlId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUrlId(Wrap<String> w);

	public String getPageUrlId() {
		return pageUrlId;
	}
	public void setPageUrlId(String o) {
		this.pageUrlId = SiteHtml.staticSetPageUrlId(siteRequest_, o);
	}
	public static String staticSetPageUrlId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtml pageUrlIdInit() {
		Wrap<String> pageUrlIdWrap = new Wrap<String>().var("pageUrlId");
		if(pageUrlId == null) {
			_pageUrlId(pageUrlIdWrap);
			setPageUrlId(pageUrlIdWrap.o);
		}
		return (SiteHtml)this;
	}

	public static String staticSearchPageUrlId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUrlId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUrlId(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtml.staticSearchStrPageUrlId(siteRequest_, SiteHtml.staticSearchPageUrlId(siteRequest_, SiteHtml.staticSetPageUrlId(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.html.SiteHtml&fq=entiteVar_enUS_indexed_string:pageUrlPk">Find the entity pageUrlPk in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUrlPk(Wrap<String> w);

	public String getPageUrlPk() {
		return pageUrlPk;
	}
	public void setPageUrlPk(String o) {
		this.pageUrlPk = SiteHtml.staticSetPageUrlPk(siteRequest_, o);
	}
	public static String staticSetPageUrlPk(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtml pageUrlPkInit() {
		Wrap<String> pageUrlPkWrap = new Wrap<String>().var("pageUrlPk");
		if(pageUrlPk == null) {
			_pageUrlPk(pageUrlPkWrap);
			setPageUrlPk(pageUrlPkWrap.o);
		}
		return (SiteHtml)this;
	}

	public static String staticSearchPageUrlPk(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUrlPk(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUrlPk(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtml.staticSearchStrPageUrlPk(siteRequest_, SiteHtml.staticSearchPageUrlPk(siteRequest_, SiteHtml.staticSetPageUrlPk(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.html.SiteHtml&fq=entiteVar_enUS_indexed_string:pageUrlApi">Find the entity pageUrlApi in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUrlApi(Wrap<String> w);

	public String getPageUrlApi() {
		return pageUrlApi;
	}
	public void setPageUrlApi(String o) {
		this.pageUrlApi = SiteHtml.staticSetPageUrlApi(siteRequest_, o);
	}
	public static String staticSetPageUrlApi(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtml pageUrlApiInit() {
		Wrap<String> pageUrlApiWrap = new Wrap<String>().var("pageUrlApi");
		if(pageUrlApi == null) {
			_pageUrlApi(pageUrlApiWrap);
			setPageUrlApi(pageUrlApiWrap.o);
		}
		return (SiteHtml)this;
	}

	public static String staticSearchPageUrlApi(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUrlApi(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUrlApi(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtml.staticSearchStrPageUrlApi(siteRequest_, SiteHtml.staticSearchPageUrlApi(siteRequest_, SiteHtml.staticSetPageUrlApi(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.html.SiteHtml&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = SiteHtml.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteHtml idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			setId(idWrap.o);
		}
		return (SiteHtml)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtml.staticSearchStrId(siteRequest_, SiteHtml.staticSearchId(siteRequest_, SiteHtml.staticSetId(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepSiteHtml(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepSiteHtml();
	}

	public Future<Void> promiseDeepSiteHtml() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseSiteHtml(promise2);
		promise2.future().onSuccess(a -> {
			promise.complete();
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseSiteHtml(Promise<Void> promise) {
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
				pageIdInit();
				sequenceNumInit();
				htmlGroupInit();
				eInit();
				aInit();
				htmlBeforeInit();
				htmlAfterInit();
				classCanonicalNameInit();
				classSimpleNameInit();
				classCanonicalNamesInit();
				objectTitleInit();
				objectIdInit();
				objectNameVarInit();
				objectSuggestInit();
				objectTextInit();
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
		return promiseDeepSiteHtml(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestSiteHtml(SiteRequestEnUS siteRequest_) {
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestSiteHtml(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainSiteHtml(v);
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
	public Object obtainSiteHtml(String var) {
		SiteHtml oSiteHtml = (SiteHtml)this;
		switch(var) {
			case "promiseBegin":
				return oSiteHtml.promiseBegin;
			case "siteRequest_":
				return oSiteHtml.siteRequest_;
			case "inheritPk":
				return oSiteHtml.inheritPk;
			case "created":
				return oSiteHtml.created;
			case "modified":
				return oSiteHtml.modified;
			case "archived":
				return oSiteHtml.archived;
			case "deleted":
				return oSiteHtml.deleted;
			case "saves":
				return oSiteHtml.saves;
			case "pageId":
				return oSiteHtml.pageId;
			case "sequenceNum":
				return oSiteHtml.sequenceNum;
			case "htmlGroup":
				return oSiteHtml.htmlGroup;
			case "e":
				return oSiteHtml.e;
			case "a":
				return oSiteHtml.a;
			case "htmlBefore":
				return oSiteHtml.htmlBefore;
			case "htmlAfter":
				return oSiteHtml.htmlAfter;
			case "classCanonicalName":
				return oSiteHtml.classCanonicalName;
			case "classSimpleName":
				return oSiteHtml.classSimpleName;
			case "classCanonicalNames":
				return oSiteHtml.classCanonicalNames;
			case "objectTitle":
				return oSiteHtml.objectTitle;
			case "objectId":
				return oSiteHtml.objectId;
			case "objectNameVar":
				return oSiteHtml.objectNameVar;
			case "objectSuggest":
				return oSiteHtml.objectSuggest;
			case "objectText":
				return oSiteHtml.objectText;
			case "pageUrlId":
				return oSiteHtml.pageUrlId;
			case "pageUrlPk":
				return oSiteHtml.pageUrlPk;
			case "pageUrlApi":
				return oSiteHtml.pageUrlApi;
			case "id":
				return oSiteHtml.id;
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
				o = relateSiteHtml(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateSiteHtml(String var, Object val) {
		SiteHtml oSiteHtml = (SiteHtml)this;
		switch(var) {
			default:
				return null;
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetSiteHtml(entityVar,  siteRequest_, o);
	}
	public static Object staticSetSiteHtml(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "inheritPk":
			return SiteHtml.staticSetInheritPk(siteRequest_, o);
		case "created":
			return SiteHtml.staticSetCreated(siteRequest_, o);
		case "modified":
			return SiteHtml.staticSetModified(siteRequest_, o);
		case "archived":
			return SiteHtml.staticSetArchived(siteRequest_, o);
		case "deleted":
			return SiteHtml.staticSetDeleted(siteRequest_, o);
		case "saves":
			return SiteHtml.staticSetSaves(siteRequest_, o);
		case "pageId":
			return SiteHtml.staticSetPageId(siteRequest_, o);
		case "sequenceNum":
			return SiteHtml.staticSetSequenceNum(siteRequest_, o);
		case "htmlGroup":
			return SiteHtml.staticSetHtmlGroup(siteRequest_, o);
		case "e":
			return SiteHtml.staticSetE(siteRequest_, o);
		case "a":
			return SiteHtml.staticSetA(siteRequest_, o);
		case "htmlBefore":
			return SiteHtml.staticSetHtmlBefore(siteRequest_, o);
		case "htmlAfter":
			return SiteHtml.staticSetHtmlAfter(siteRequest_, o);
		case "classCanonicalName":
			return SiteHtml.staticSetClassCanonicalName(siteRequest_, o);
		case "classSimpleName":
			return SiteHtml.staticSetClassSimpleName(siteRequest_, o);
		case "classCanonicalNames":
			return SiteHtml.staticSetClassCanonicalNames(siteRequest_, o);
		case "objectTitle":
			return SiteHtml.staticSetObjectTitle(siteRequest_, o);
		case "objectId":
			return SiteHtml.staticSetObjectId(siteRequest_, o);
		case "objectNameVar":
			return SiteHtml.staticSetObjectNameVar(siteRequest_, o);
		case "objectSuggest":
			return SiteHtml.staticSetObjectSuggest(siteRequest_, o);
		case "objectText":
			return SiteHtml.staticSetObjectText(siteRequest_, o);
		case "pageUrlId":
			return SiteHtml.staticSetPageUrlId(siteRequest_, o);
		case "pageUrlPk":
			return SiteHtml.staticSetPageUrlPk(siteRequest_, o);
		case "pageUrlApi":
			return SiteHtml.staticSetPageUrlApi(siteRequest_, o);
		case "id":
			return SiteHtml.staticSetId(siteRequest_, o);
			default:
				return null;
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchSiteHtml(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchSiteHtml(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "inheritPk":
			return SiteHtml.staticSearchInheritPk(siteRequest_, (String)o);
		case "created":
			return SiteHtml.staticSearchCreated(siteRequest_, (ZonedDateTime)o);
		case "modified":
			return SiteHtml.staticSearchModified(siteRequest_, (ZonedDateTime)o);
		case "archived":
			return SiteHtml.staticSearchArchived(siteRequest_, (Boolean)o);
		case "deleted":
			return SiteHtml.staticSearchDeleted(siteRequest_, (Boolean)o);
		case "saves":
			return SiteHtml.staticSearchSaves(siteRequest_, (String)o);
		case "pageId":
			return SiteHtml.staticSearchPageId(siteRequest_, (String)o);
		case "sequenceNum":
			return SiteHtml.staticSearchSequenceNum(siteRequest_, (Long)o);
		case "htmlGroup":
			return SiteHtml.staticSearchHtmlGroup(siteRequest_, (String)o);
		case "e":
			return SiteHtml.staticSearchE(siteRequest_, (String)o);
		case "a":
			return SiteHtml.staticSearchA(siteRequest_, (String)o);
		case "htmlBefore":
			return SiteHtml.staticSearchHtmlBefore(siteRequest_, (String)o);
		case "htmlAfter":
			return SiteHtml.staticSearchHtmlAfter(siteRequest_, (String)o);
		case "classCanonicalName":
			return SiteHtml.staticSearchClassCanonicalName(siteRequest_, (String)o);
		case "classSimpleName":
			return SiteHtml.staticSearchClassSimpleName(siteRequest_, (String)o);
		case "classCanonicalNames":
			return SiteHtml.staticSearchClassCanonicalNames(siteRequest_, (String)o);
		case "objectTitle":
			return SiteHtml.staticSearchObjectTitle(siteRequest_, (String)o);
		case "objectId":
			return SiteHtml.staticSearchObjectId(siteRequest_, (String)o);
		case "objectNameVar":
			return SiteHtml.staticSearchObjectNameVar(siteRequest_, (String)o);
		case "objectSuggest":
			return SiteHtml.staticSearchObjectSuggest(siteRequest_, (String)o);
		case "objectText":
			return SiteHtml.staticSearchObjectText(siteRequest_, (String)o);
		case "pageUrlId":
			return SiteHtml.staticSearchPageUrlId(siteRequest_, (String)o);
		case "pageUrlPk":
			return SiteHtml.staticSearchPageUrlPk(siteRequest_, (String)o);
		case "pageUrlApi":
			return SiteHtml.staticSearchPageUrlApi(siteRequest_, (String)o);
		case "id":
			return SiteHtml.staticSearchId(siteRequest_, (String)o);
			default:
				return null;
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrSiteHtml(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrSiteHtml(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "inheritPk":
			return SiteHtml.staticSearchStrInheritPk(siteRequest_, (String)o);
		case "created":
			return SiteHtml.staticSearchStrCreated(siteRequest_, (Date)o);
		case "modified":
			return SiteHtml.staticSearchStrModified(siteRequest_, (Date)o);
		case "archived":
			return SiteHtml.staticSearchStrArchived(siteRequest_, (Boolean)o);
		case "deleted":
			return SiteHtml.staticSearchStrDeleted(siteRequest_, (Boolean)o);
		case "saves":
			return SiteHtml.staticSearchStrSaves(siteRequest_, (String)o);
		case "pageId":
			return SiteHtml.staticSearchStrPageId(siteRequest_, (String)o);
		case "sequenceNum":
			return SiteHtml.staticSearchStrSequenceNum(siteRequest_, (Long)o);
		case "htmlGroup":
			return SiteHtml.staticSearchStrHtmlGroup(siteRequest_, (String)o);
		case "e":
			return SiteHtml.staticSearchStrE(siteRequest_, (String)o);
		case "a":
			return SiteHtml.staticSearchStrA(siteRequest_, (String)o);
		case "htmlBefore":
			return SiteHtml.staticSearchStrHtmlBefore(siteRequest_, (String)o);
		case "htmlAfter":
			return SiteHtml.staticSearchStrHtmlAfter(siteRequest_, (String)o);
		case "classCanonicalName":
			return SiteHtml.staticSearchStrClassCanonicalName(siteRequest_, (String)o);
		case "classSimpleName":
			return SiteHtml.staticSearchStrClassSimpleName(siteRequest_, (String)o);
		case "classCanonicalNames":
			return SiteHtml.staticSearchStrClassCanonicalNames(siteRequest_, (String)o);
		case "objectTitle":
			return SiteHtml.staticSearchStrObjectTitle(siteRequest_, (String)o);
		case "objectId":
			return SiteHtml.staticSearchStrObjectId(siteRequest_, (String)o);
		case "objectNameVar":
			return SiteHtml.staticSearchStrObjectNameVar(siteRequest_, (String)o);
		case "objectSuggest":
			return SiteHtml.staticSearchStrObjectSuggest(siteRequest_, (String)o);
		case "objectText":
			return SiteHtml.staticSearchStrObjectText(siteRequest_, (String)o);
		case "pageUrlId":
			return SiteHtml.staticSearchStrPageUrlId(siteRequest_, (String)o);
		case "pageUrlPk":
			return SiteHtml.staticSearchStrPageUrlPk(siteRequest_, (String)o);
		case "pageUrlApi":
			return SiteHtml.staticSearchStrPageUrlApi(siteRequest_, (String)o);
		case "id":
			return SiteHtml.staticSearchStrId(siteRequest_, (String)o);
			default:
				return null;
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqSiteHtml(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqSiteHtml(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "inheritPk":
			return SiteHtml.staticSearchFqInheritPk(siteRequest_, o);
		case "created":
			return SiteHtml.staticSearchFqCreated(siteRequest_, o);
		case "modified":
			return SiteHtml.staticSearchFqModified(siteRequest_, o);
		case "archived":
			return SiteHtml.staticSearchFqArchived(siteRequest_, o);
		case "deleted":
			return SiteHtml.staticSearchFqDeleted(siteRequest_, o);
		case "saves":
			return SiteHtml.staticSearchFqSaves(siteRequest_, o);
		case "pageId":
			return SiteHtml.staticSearchFqPageId(siteRequest_, o);
		case "sequenceNum":
			return SiteHtml.staticSearchFqSequenceNum(siteRequest_, o);
		case "htmlGroup":
			return SiteHtml.staticSearchFqHtmlGroup(siteRequest_, o);
		case "e":
			return SiteHtml.staticSearchFqE(siteRequest_, o);
		case "a":
			return SiteHtml.staticSearchFqA(siteRequest_, o);
		case "htmlBefore":
			return SiteHtml.staticSearchFqHtmlBefore(siteRequest_, o);
		case "htmlAfter":
			return SiteHtml.staticSearchFqHtmlAfter(siteRequest_, o);
		case "classCanonicalName":
			return SiteHtml.staticSearchFqClassCanonicalName(siteRequest_, o);
		case "classSimpleName":
			return SiteHtml.staticSearchFqClassSimpleName(siteRequest_, o);
		case "classCanonicalNames":
			return SiteHtml.staticSearchFqClassCanonicalNames(siteRequest_, o);
		case "objectTitle":
			return SiteHtml.staticSearchFqObjectTitle(siteRequest_, o);
		case "objectId":
			return SiteHtml.staticSearchFqObjectId(siteRequest_, o);
		case "objectNameVar":
			return SiteHtml.staticSearchFqObjectNameVar(siteRequest_, o);
		case "objectSuggest":
			return SiteHtml.staticSearchFqObjectSuggest(siteRequest_, o);
		case "objectText":
			return SiteHtml.staticSearchFqObjectText(siteRequest_, o);
		case "pageUrlId":
			return SiteHtml.staticSearchFqPageUrlId(siteRequest_, o);
		case "pageUrlPk":
			return SiteHtml.staticSearchFqPageUrlPk(siteRequest_, o);
		case "pageUrlApi":
			return SiteHtml.staticSearchFqPageUrlApi(siteRequest_, o);
		case "id":
			return SiteHtml.staticSearchFqId(siteRequest_, o);
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
					o = persistSiteHtml(v, val);
				else if(o instanceof BaseModel) {
					BaseModel oBaseModel = (BaseModel)o;
					o = oBaseModel.persistForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object persistSiteHtml(String var, Object val) {
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
			case "htmlgroup":
				if(val instanceof String)
					setHtmlGroup((String)val);
				saves.add("htmlGroup");
				return val;
			case "e":
				if(val instanceof String)
					setE((String)val);
				saves.add("e");
				return val;
			case "a":
				if(val instanceof List<?>)
					((List<String>)val).stream().forEach(v -> addA(v));
				if(!saves.contains("a"))
					saves.add("a");
				return val;
			case "htmlbefore":
				if(val instanceof String)
					setHtmlBefore((String)val);
				saves.add("htmlBefore");
				return val;
			case "htmlafter":
				if(val instanceof String)
					setHtmlAfter((String)val);
				saves.add("htmlAfter");
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
		populateSiteHtml(doc);
	}
	public void populateSiteHtml(SolrResponse.Doc doc) {
		SiteHtml oSiteHtml = (SiteHtml)this;
		saves = doc.get("saves_docvalues_strings");
		if(saves != null) {
		}
	}

	public void indexSiteHtml(JsonObject doc) {
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
		if(pageId != null) {
			doc.put("pageId_docvalues_string", pageId);
		}
		if(sequenceNum != null) {
			doc.put("sequenceNum_docvalues_long", sequenceNum);
		}
		if(htmlGroup != null) {
			doc.put("htmlGroup_docvalues_string", htmlGroup);
		}
		if(e != null) {
			doc.put("e_docvalues_string", e);
		}
		if(a != null) {
			JsonArray l = new JsonArray();
			doc.put("a_docvalues_strings", l);
			for(String o : a) {
				l.add(o);
			}
		}
		if(htmlBefore != null) {
			doc.put("htmlBefore_stored_string", htmlBefore);
		}
		if(htmlAfter != null) {
			doc.put("htmlAfter_stored_string", htmlAfter);
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
		if(objectText != null) {
			doc.put("objectText_text_enUS", objectText.toString());
			doc.put("objectText_docvalues_string", objectText);
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

	public static String varStoredSiteHtml(String entityVar) {
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
			case "pageId":
				return "pageId_docvalues_string";
			case "sequenceNum":
				return "sequenceNum_docvalues_long";
			case "htmlGroup":
				return "htmlGroup_docvalues_string";
			case "e":
				return "e_docvalues_string";
			case "a":
				return "a_docvalues_strings";
			case "htmlBefore":
				return "htmlBefore_stored_string";
			case "htmlAfter":
				return "htmlAfter_stored_string";
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
			case "objectText":
				return "objectText_docvalues_string";
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

	public static String varIndexedSiteHtml(String entityVar) {
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
			case "pageId":
				return "pageId_docvalues_string";
			case "sequenceNum":
				return "sequenceNum_docvalues_long";
			case "htmlGroup":
				return "htmlGroup_docvalues_string";
			case "e":
				return "e_docvalues_string";
			case "a":
				return "a_docvalues_strings";
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
			case "objectText":
				return "objectText_text_enUS";
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

	public static String searchVarSiteHtml(String searchVar) {
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
			case "pageId_docvalues_string":
				return "pageId";
			case "sequenceNum_docvalues_long":
				return "sequenceNum";
			case "htmlGroup_docvalues_string":
				return "htmlGroup";
			case "e_docvalues_string":
				return "e";
			case "a_docvalues_strings":
				return "a";
			case "htmlBefore_stored_string":
				return "htmlBefore";
			case "htmlAfter_stored_string":
				return "htmlAfter";
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
			case "objectText_text_enUS":
				return "objectText";
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

	public static String varSearchSiteHtml(String entityVar) {
		switch(entityVar) {
			case "objectText":
				return "objectText_text_enUS";
			case "objectSuggest":
				return "objectSuggest_suggested";
			default:
				return null;
		}
	}

	public static String varSuggestedSiteHtml(String entityVar) {
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
		storeSiteHtml(doc);
	}
	public void storeSiteHtml(SolrResponse.Doc doc) {
		SiteHtml oSiteHtml = (SiteHtml)this;

		oSiteHtml.setInheritPk(Optional.ofNullable(doc.get("inheritPk_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteHtml.setCreated(Optional.ofNullable(doc.get("created_docvalues_date")).map(v -> v.toString()).orElse(null));
		oSiteHtml.setModified(Optional.ofNullable(doc.get("modified_docvalues_date")).map(v -> v.toString()).orElse(null));
		oSiteHtml.setArchived(Optional.ofNullable(doc.get("archived_docvalues_boolean")).map(v -> v.toString()).orElse(null));
		oSiteHtml.setDeleted(Optional.ofNullable(doc.get("deleted_docvalues_boolean")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("saves_docvalues_strings")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oSiteHtml.addSaves(v.toString());
		});
		oSiteHtml.setPageId(Optional.ofNullable(doc.get("pageId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteHtml.setSequenceNum(Optional.ofNullable(doc.get("sequenceNum_docvalues_long")).map(v -> v.toString()).orElse(null));
		oSiteHtml.setHtmlGroup(Optional.ofNullable(doc.get("htmlGroup_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteHtml.setE(Optional.ofNullable(doc.get("e_docvalues_string")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("a_docvalues_strings")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oSiteHtml.addA(v.toString());
		});
		oSiteHtml.setHtmlBefore(Optional.ofNullable(doc.get("htmlBefore_stored_string")).map(v -> v.toString()).orElse(null));
		oSiteHtml.setHtmlAfter(Optional.ofNullable(doc.get("htmlAfter_stored_string")).map(v -> v.toString()).orElse(null));
		oSiteHtml.setClassCanonicalName(Optional.ofNullable(doc.get("classCanonicalName_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteHtml.setClassSimpleName(Optional.ofNullable(doc.get("classSimpleName_docvalues_string")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("classCanonicalNames_docvalues_strings")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oSiteHtml.addClassCanonicalNames(v.toString());
		});
		oSiteHtml.setObjectTitle(Optional.ofNullable(doc.get("objectTitle_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteHtml.setObjectId(Optional.ofNullable(doc.get("objectId_docvalues_string")).map(v -> v.toString()).orElse(null));
		String objectSuggest = (String)doc.get("objectSuggest_suggested");
		oSiteHtml.setObjectSuggest(objectSuggest);
		oSiteHtml.setObjectText(Optional.ofNullable(doc.get("objectText_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteHtml.setPageUrlId(Optional.ofNullable(doc.get("pageUrlId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteHtml.setPageUrlPk(Optional.ofNullable(doc.get("pageUrlPk_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteHtml.setPageUrlApi(Optional.ofNullable(doc.get("pageUrlApi_docvalues_string")).map(v -> v.toString()).orElse(null));
		String id = (String)doc.get("id");
		oSiteHtml.setId(id);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestSiteHtml() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof SiteHtml) {
			SiteHtml original = (SiteHtml)o;
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
			if(!Objects.equals(pageId, original.getPageId()))
				apiRequest.addVars("pageId");
			if(!Objects.equals(sequenceNum, original.getSequenceNum()))
				apiRequest.addVars("sequenceNum");
			if(!Objects.equals(htmlGroup, original.getHtmlGroup()))
				apiRequest.addVars("htmlGroup");
			if(!Objects.equals(e, original.getE()))
				apiRequest.addVars("e");
			if(!Objects.equals(a, original.getA()))
				apiRequest.addVars("a");
			if(!Objects.equals(htmlBefore, original.getHtmlBefore()))
				apiRequest.addVars("htmlBefore");
			if(!Objects.equals(htmlAfter, original.getHtmlAfter()))
				apiRequest.addVars("htmlAfter");
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
			if(!Objects.equals(objectText, original.getObjectText()))
				apiRequest.addVars("objectText");
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
		sb.append(Optional.ofNullable(pageId).map(v -> "pageId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(sequenceNum).map(v -> "sequenceNum: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(htmlGroup).map(v -> "htmlGroup: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(e).map(v -> "e: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(a).map(v -> "a: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(htmlBefore).map(v -> "htmlBefore: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(htmlAfter).map(v -> "htmlAfter: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(classCanonicalName).map(v -> "classCanonicalName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(classSimpleName).map(v -> "classSimpleName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(classCanonicalNames).map(v -> "classCanonicalNames: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(objectTitle).map(v -> "objectTitle: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(objectId).map(v -> "objectId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(objectSuggest).map(v -> "objectSuggest: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(objectText).map(v -> "objectText: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(pageUrlId).map(v -> "pageUrlId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(pageUrlPk).map(v -> "pageUrlPk: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(pageUrlApi).map(v -> "pageUrlApi: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(id).map(v -> "id: \"" + v + "\"\n" ).orElse(""));
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "SiteHtml";
	public static final String VAR_promiseBegin = "promiseBegin";
	public static final String VAR_siteRequest_ = "siteRequest_";
	public static final String VAR_inheritPk = "inheritPk";
	public static final String VAR_created = "created";
	public static final String VAR_modified = "modified";
	public static final String VAR_archived = "archived";
	public static final String VAR_deleted = "deleted";
	public static final String VAR_saves = "saves";
	public static final String VAR_pageId = "pageId";
	public static final String VAR_sequenceNum = "sequenceNum";
	public static final String VAR_htmlGroup = "htmlGroup";
	public static final String VAR_e = "e";
	public static final String VAR_a = "a";
	public static final String VAR_htmlBefore = "htmlBefore";
	public static final String VAR_htmlAfter = "htmlAfter";
	public static final String VAR_classCanonicalName = "classCanonicalName";
	public static final String VAR_classSimpleName = "classSimpleName";
	public static final String VAR_classCanonicalNames = "classCanonicalNames";
	public static final String VAR_objectTitle = "objectTitle";
	public static final String VAR_objectId = "objectId";
	public static final String VAR_objectNameVar = "objectNameVar";
	public static final String VAR_objectSuggest = "objectSuggest";
	public static final String VAR_objectText = "objectText";
	public static final String VAR_pageUrlId = "pageUrlId";
	public static final String VAR_pageUrlPk = "pageUrlPk";
	public static final String VAR_pageUrlApi = "pageUrlApi";
	public static final String VAR_id = "id";

	public static List<String> varsQForClass() {
		return SiteHtml.varsQSiteHtml(new ArrayList<String>());
	}
	public static List<String> varsQSiteHtml(List<String> vars) {
		vars.add(VAR_objectSuggest);
		vars.add(VAR_objectText);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return SiteHtml.varsFqSiteHtml(new ArrayList<String>());
	}
	public static List<String> varsFqSiteHtml(List<String> vars) {
		vars.add(VAR_created);
		vars.add(VAR_pageId);
		vars.add(VAR_sequenceNum);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return SiteHtml.varsRangeSiteHtml(new ArrayList<String>());
	}
	public static List<String> varsRangeSiteHtml(List<String> vars) {
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
	public static final String DISPLAY_NAME_pageId = "Page ID";
	public static final String DISPLAY_NAME_sequenceNum = "Sequence Number";
	public static final String DISPLAY_NAME_htmlGroup = "HTML Group";
	public static final String DISPLAY_NAME_e = "HTML Element";
	public static final String DISPLAY_NAME_a = "HTML Element";
	public static final String DISPLAY_NAME_htmlBefore = "HTML before";
	public static final String DISPLAY_NAME_htmlAfter = "HTML after";
	public static final String DISPLAY_NAME_classCanonicalName = "";
	public static final String DISPLAY_NAME_classSimpleName = "";
	public static final String DISPLAY_NAME_classCanonicalNames = "";
	public static final String DISPLAY_NAME_objectTitle = "";
	public static final String DISPLAY_NAME_objectId = "ID";
	public static final String DISPLAY_NAME_objectNameVar = "";
	public static final String DISPLAY_NAME_objectSuggest = "autosuggest";
	public static final String DISPLAY_NAME_objectText = "text";
	public static final String DISPLAY_NAME_pageUrlId = "";
	public static final String DISPLAY_NAME_pageUrlPk = "";
	public static final String DISPLAY_NAME_pageUrlApi = "";
	public static final String DISPLAY_NAME_id = "";

	public static String displayNameForClass(String var) {
		return SiteHtml.displayNameSiteHtml(var);
	}
	public static String displayNameSiteHtml(String var) {
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
		case VAR_pageId:
			return DISPLAY_NAME_pageId;
		case VAR_sequenceNum:
			return DISPLAY_NAME_sequenceNum;
		case VAR_htmlGroup:
			return DISPLAY_NAME_htmlGroup;
		case VAR_e:
			return DISPLAY_NAME_e;
		case VAR_a:
			return DISPLAY_NAME_a;
		case VAR_htmlBefore:
			return DISPLAY_NAME_htmlBefore;
		case VAR_htmlAfter:
			return DISPLAY_NAME_htmlAfter;
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
		case VAR_objectText:
			return DISPLAY_NAME_objectText;
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

	public static String descriptionSiteHtml(String var) {
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
		case VAR_pageId:
			return "The ID for this page. ";
		case VAR_sequenceNum:
			return "The sequence number for this page. ";
		case VAR_htmlGroup:
			return "The HTML group. ";
		case VAR_e:
			return "The HTML element. ";
		case VAR_a:
			return "The HTML element. ";
		case VAR_htmlBefore:
			return "The HTML that comes before the text. ";
		case VAR_htmlAfter:
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
		case VAR_objectText:
			return "The full text search field in the search engine for this record while using autosuggest";
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

	public static String classSimpleNameSiteHtml(String var) {
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
		case VAR_pageId:
			return "String";
		case VAR_sequenceNum:
			return "Long";
		case VAR_htmlGroup:
			return "String";
		case VAR_e:
			return "String";
		case VAR_a:
			return "List";
		case VAR_htmlBefore:
			return "String";
		case VAR_htmlAfter:
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
		case VAR_objectText:
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

	public static Integer htmlColumnSiteHtml(String var) {
		switch(var) {
		case VAR_created:
			return 1;
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

	public static Integer htmlRowSiteHtml(String var) {
		switch(var) {
		case VAR_created:
			return 1;
		case VAR_modified:
			return 1;
		case VAR_archived:
			return 2;
		case VAR_deleted:
			return 2;
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

	public static Integer htmlCellSiteHtml(String var) {
		switch(var) {
		case VAR_created:
			return 2;
		case VAR_modified:
			return 3;
		case VAR_archived:
			return 1;
		case VAR_deleted:
			return 2;
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

	public static Integer lengthMinSiteHtml(String var) {
		switch(var) {
			default:
				return null;
		}
	}

	public static Integer lengthMaxSiteHtml(String var) {
		switch(var) {
			default:
				return null;
		}
	}

	public static Integer maxSiteHtml(String var) {
		switch(var) {
			default:
				return null;
		}
	}

	public static Integer minSiteHtml(String var) {
		switch(var) {
			default:
				return null;
		}
	}
}
