package org.computate.smartvillageview.enus.model.base;

import org.computate.smartvillageview.enus.request.SiteRequestEnUS;
import org.computate.smartvillageview.enus.model.base.BaseModel;
import io.vertx.core.json.JsonObject;
import java.util.Date;
import java.util.Set;
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
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.time.Instant;
import java.util.Locale;
import java.time.OffsetDateTime;
import java.lang.Boolean;
import io.vertx.core.json.JsonArray;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;

/**	
<ol>
0<h3>Suggestions that can generate more code for you: </h3></ol>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these BaseModel objects in a RESTful API. 
 * </li><li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class BaseModelGen into the class BaseModel. 
 * </li><li>You can add a class comment "SqlOrder: " followed by an Integer to sort this class compared when generating the SQL code to create and drop tables. 
 * The Order comment allows you do define which order the SQL code is generated. 
 * </li>
 * <h3>About the BaseModel class and it's generated class BaseModelGen&lt;Object&gt;: </h3>extends BaseModelGen
 * <p>
 * This Java class extends a generated Java class BaseModelGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.base.BaseModel">Find the class BaseModel in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends BaseModelGen<Object>
 * <p>This <code>class BaseModel extends BaseModelGen&lt;Object&gt;</code>, which means it extends a newly generated BaseModelGen. 
 * The generated <code>class BaseModelGen extends Object</code> which means that BaseModel extends BaseModelGen which extends Object. 
 * This generated inheritance is a powerful feature that allows a lot of boiler plate code to be created for you automatically while still preserving inheritance through the power of Java Generic classes. 
 * </p>
 * Api: true
 * ApiTag.enUS: true
 * ApiUri.enUS: null
 * Color: null
 * IconGroup: null
 * IconName: null
 * Indexed: true
 * <p>This class contains a comment <b>"Indexed: true"</b>, which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * {@inheritDoc}
 * <p>By adding a class comment "{@inheritDoc}", the BaseModel class will inherit the helpful inherited class comments from the super class BaseModelGen. 
 * </p>
 * Rows: null
 * Order: 1
 * <p>This class contains a comment <b>"Order: 1"</b>, which means this class will be sorted by the given number 1 ascending when code that relates to multiple classes at the same time is generated. 
 * </p>
 * Model: true
 * <p>This class contains a comment <b>"Model: true"</b>, which means this class will be stored in the database. 
 * Every protected void method that begins with "_" that contains a "Persist: true" comment will be a persisted field in the database table. 
 * </p>
 * Page: true
 * <p>This class contains a comment <b>"Page: true"</b>, which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.smartvillageview.enus.model.base.BaseModelPage. 
 * </p>
 * SuperPage.enUS: PageLayout
 * <p>This class contains a comment <b>"SuperPage.enUS: PageLayout"</b>, which identifies the Java super class of the page code by it's class simple name "PageLayout". 
 * This means that the newly created class org.computate.smartvillageview.enus.model.base.BaseModelPage extends org.computate.smartvillageview.enus.page.PageLayout. 
 * </p>
 * Promise: true
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the BaseModel Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
 * </p>
 * <p>
 *   Adding protected void methods beginning with an underscore with a Promise as the only parameter will automatically set `Promise: true`. 
 * </p>
 * <p>
 *   <pre>
 *   
 *   	protected void _promiseBefore(Promise&lt;Void&gt; promise) {
 *   		promise.complete();
 *   	}
 *   </pre>
 * </p>
 * <p>
 *   Java classes with the `Model: true` will automatically set `Promise: true`. 
 * </p>
 * <p>
 *   If a super class of this Java class with `Model: true`, then the child class will also inherit `Promise: true`. 
 * </p>
 * AName.enUS: null
 * <p>
 * Delete the class BaseModel in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.base.BaseModel&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.base in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.base&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class BaseModelGen<DEV> extends Object {
	protected static final Logger LOG = LoggerFactory.getLogger(BaseModel.class);

	public static final String BaseModel_Description_enUS = "A reusable base class for all database model classes";


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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.base.BaseModel&fq=entiteVar_enUS_indexed_string:siteRequest_">Find the entity siteRequest_ in Solr</a>
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
	protected BaseModel siteRequest_Init() {
		Wrap<SiteRequestEnUS> siteRequest_Wrap = new Wrap<SiteRequestEnUS>().var("siteRequest_");
		if(siteRequest_ == null) {
			_siteRequest_(siteRequest_Wrap);
			Optional.ofNullable(siteRequest_Wrap.getO()).ifPresent(o -> {
				setSiteRequest_(o);
			});
		}
		return (BaseModel)this;
	}

	////////
	// pk //
	////////


	/**	 The entity pk
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long pk;

	/**	<br> The entity pk
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.base.BaseModel&fq=entiteVar_enUS_indexed_string:pk">Find the entity pk in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pk(Wrap<Long> w);

	public Long getPk() {
		return pk;
	}

	public void setPk(Long pk) {
		this.pk = pk;
	}
	@JsonIgnore
	public void setPk(String o) {
		this.pk = BaseModel.staticSetPk(siteRequest_, o);
	}
	public static Long staticSetPk(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected BaseModel pkInit() {
		Wrap<Long> pkWrap = new Wrap<Long>().var("pk");
		if(pk == null) {
			_pk(pkWrap);
			Optional.ofNullable(pkWrap.getO()).ifPresent(o -> {
				setPk(o);
			});
		}
		return (BaseModel)this;
	}

	public static Long staticSearchPk(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrPk(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPk(SiteRequestEnUS siteRequest_, String o) {
		return BaseModel.staticSearchStrPk(siteRequest_, BaseModel.staticSearchPk(siteRequest_, BaseModel.staticSetPk(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.base.BaseModel&fq=entiteVar_enUS_indexed_string:inheritPk">Find the entity inheritPk in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _inheritPk(Wrap<String> w);

	public String getInheritPk() {
		return inheritPk;
	}
	public void setInheritPk(String o) {
		this.inheritPk = BaseModel.staticSetInheritPk(siteRequest_, o);
	}
	public static String staticSetInheritPk(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected BaseModel inheritPkInit() {
		Wrap<String> inheritPkWrap = new Wrap<String>().var("inheritPk");
		if(inheritPk == null) {
			_inheritPk(inheritPkWrap);
			Optional.ofNullable(inheritPkWrap.getO()).ifPresent(o -> {
				setInheritPk(o);
			});
		}
		return (BaseModel)this;
	}

	public static String staticSearchInheritPk(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrInheritPk(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqInheritPk(SiteRequestEnUS siteRequest_, String o) {
		return BaseModel.staticSearchStrInheritPk(siteRequest_, BaseModel.staticSearchInheritPk(siteRequest_, BaseModel.staticSetInheritPk(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.base.BaseModel&fq=entiteVar_enUS_indexed_string:created">Find the entity created in Solr</a>
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
		this.created = BaseModel.staticSetCreated(siteRequest_, o);
	}
	public static ZonedDateTime staticSetCreated(SiteRequestEnUS siteRequest_, String o) {
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
	public void setCreated(Date o) {
		this.created = o == null ? null : ZonedDateTime.ofInstant(o.toInstant(), ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	protected BaseModel createdInit() {
		Wrap<ZonedDateTime> createdWrap = new Wrap<ZonedDateTime>().var("created");
		if(created == null) {
			_created(createdWrap);
			Optional.ofNullable(createdWrap.getO()).ifPresent(o -> {
				setCreated(o);
			});
		}
		return (BaseModel)this;
	}

	public static Date staticSearchCreated(SiteRequestEnUS siteRequest_, ZonedDateTime o) {
		return o == null ? null : Date.from(o.toInstant());
	}

	public static String staticSearchStrCreated(SiteRequestEnUS siteRequest_, Date o) {
		return "\"" + DateTimeFormatter.ISO_DATE_TIME.format(o.toInstant().atOffset(ZoneOffset.UTC)) + "\"";
	}

	public static String staticSearchFqCreated(SiteRequestEnUS siteRequest_, String o) {
		return BaseModel.staticSearchStrCreated(siteRequest_, BaseModel.staticSearchCreated(siteRequest_, BaseModel.staticSetCreated(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.base.BaseModel&fq=entiteVar_enUS_indexed_string:modified">Find the entity modified in Solr</a>
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
		this.modified = BaseModel.staticSetModified(siteRequest_, o);
	}
	public static ZonedDateTime staticSetModified(SiteRequestEnUS siteRequest_, String o) {
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
	public void setModified(Date o) {
		this.modified = o == null ? null : ZonedDateTime.ofInstant(o.toInstant(), ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	protected BaseModel modifiedInit() {
		Wrap<ZonedDateTime> modifiedWrap = new Wrap<ZonedDateTime>().var("modified");
		if(modified == null) {
			_modified(modifiedWrap);
			Optional.ofNullable(modifiedWrap.getO()).ifPresent(o -> {
				setModified(o);
			});
		}
		return (BaseModel)this;
	}

	public static Date staticSearchModified(SiteRequestEnUS siteRequest_, ZonedDateTime o) {
		return o == null ? null : Date.from(o.toInstant());
	}

	public static String staticSearchStrModified(SiteRequestEnUS siteRequest_, Date o) {
		return "\"" + DateTimeFormatter.ISO_DATE_TIME.format(o.toInstant().atOffset(ZoneOffset.UTC)) + "\"";
	}

	public static String staticSearchFqModified(SiteRequestEnUS siteRequest_, String o) {
		return BaseModel.staticSearchStrModified(siteRequest_, BaseModel.staticSearchModified(siteRequest_, BaseModel.staticSetModified(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.base.BaseModel&fq=entiteVar_enUS_indexed_string:archived">Find the entity archived in Solr</a>
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
		this.archived = BaseModel.staticSetArchived(siteRequest_, o);
	}
	public static Boolean staticSetArchived(SiteRequestEnUS siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected BaseModel archivedInit() {
		Wrap<Boolean> archivedWrap = new Wrap<Boolean>().var("archived");
		if(archived == null) {
			_archived(archivedWrap);
			Optional.ofNullable(archivedWrap.getO()).ifPresent(o -> {
				setArchived(o);
			});
		}
		return (BaseModel)this;
	}

	public static Boolean staticSearchArchived(SiteRequestEnUS siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrArchived(SiteRequestEnUS siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqArchived(SiteRequestEnUS siteRequest_, String o) {
		return BaseModel.staticSearchStrArchived(siteRequest_, BaseModel.staticSearchArchived(siteRequest_, BaseModel.staticSetArchived(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.base.BaseModel&fq=entiteVar_enUS_indexed_string:deleted">Find the entity deleted in Solr</a>
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
		this.deleted = BaseModel.staticSetDeleted(siteRequest_, o);
	}
	public static Boolean staticSetDeleted(SiteRequestEnUS siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected BaseModel deletedInit() {
		Wrap<Boolean> deletedWrap = new Wrap<Boolean>().var("deleted");
		if(deleted == null) {
			_deleted(deletedWrap);
			Optional.ofNullable(deletedWrap.getO()).ifPresent(o -> {
				setDeleted(o);
			});
		}
		return (BaseModel)this;
	}

	public static Boolean staticSearchDeleted(SiteRequestEnUS siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrDeleted(SiteRequestEnUS siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDeleted(SiteRequestEnUS siteRequest_, String o) {
		return BaseModel.staticSearchStrDeleted(siteRequest_, BaseModel.staticSearchDeleted(siteRequest_, BaseModel.staticSetDeleted(siteRequest_, o)));
	}

	public Boolean sqlDeleted() {
		return deleted;
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.base.BaseModel&fq=entiteVar_enUS_indexed_string:classCanonicalName">Find the entity classCanonicalName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _classCanonicalName(Wrap<String> w);

	public String getClassCanonicalName() {
		return classCanonicalName;
	}
	public void setClassCanonicalName(String o) {
		this.classCanonicalName = BaseModel.staticSetClassCanonicalName(siteRequest_, o);
	}
	public static String staticSetClassCanonicalName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected BaseModel classCanonicalNameInit() {
		Wrap<String> classCanonicalNameWrap = new Wrap<String>().var("classCanonicalName");
		if(classCanonicalName == null) {
			_classCanonicalName(classCanonicalNameWrap);
			Optional.ofNullable(classCanonicalNameWrap.getO()).ifPresent(o -> {
				setClassCanonicalName(o);
			});
		}
		return (BaseModel)this;
	}

	public static String staticSearchClassCanonicalName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrClassCanonicalName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqClassCanonicalName(SiteRequestEnUS siteRequest_, String o) {
		return BaseModel.staticSearchStrClassCanonicalName(siteRequest_, BaseModel.staticSearchClassCanonicalName(siteRequest_, BaseModel.staticSetClassCanonicalName(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.base.BaseModel&fq=entiteVar_enUS_indexed_string:classSimpleName">Find the entity classSimpleName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _classSimpleName(Wrap<String> w);

	public String getClassSimpleName() {
		return classSimpleName;
	}
	public void setClassSimpleName(String o) {
		this.classSimpleName = BaseModel.staticSetClassSimpleName(siteRequest_, o);
	}
	public static String staticSetClassSimpleName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected BaseModel classSimpleNameInit() {
		Wrap<String> classSimpleNameWrap = new Wrap<String>().var("classSimpleName");
		if(classSimpleName == null) {
			_classSimpleName(classSimpleNameWrap);
			Optional.ofNullable(classSimpleNameWrap.getO()).ifPresent(o -> {
				setClassSimpleName(o);
			});
		}
		return (BaseModel)this;
	}

	public static String staticSearchClassSimpleName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrClassSimpleName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqClassSimpleName(SiteRequestEnUS siteRequest_, String o) {
		return BaseModel.staticSearchStrClassSimpleName(siteRequest_, BaseModel.staticSearchClassSimpleName(siteRequest_, BaseModel.staticSetClassSimpleName(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.base.BaseModel&fq=entiteVar_enUS_indexed_string:classCanonicalNames">Find the entity classCanonicalNames in Solr</a>
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
	public void setClassCanonicalNames(String o) {
		String l = BaseModel.staticSetClassCanonicalNames(siteRequest_, o);
		if(l != null)
			addClassCanonicalNames(l);
	}
	public static String staticSetClassCanonicalNames(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public BaseModel addClassCanonicalNames(String...objects) {
		for(String o : objects) {
			addClassCanonicalNames(o);
		}
		return (BaseModel)this;
	}
	public BaseModel addClassCanonicalNames(String o) {
		if(o != null)
			this.classCanonicalNames.add(o);
		return (BaseModel)this;
	}
	@JsonIgnore
	public void setClassCanonicalNames(JsonArray objects) {
		classCanonicalNames.clear();
		if(objects == null)
			return;
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addClassCanonicalNames(o);
		}
	}
	protected BaseModel classCanonicalNamesInit() {
		_classCanonicalNames(classCanonicalNames);
		return (BaseModel)this;
	}

	public static String staticSearchClassCanonicalNames(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrClassCanonicalNames(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqClassCanonicalNames(SiteRequestEnUS siteRequest_, String o) {
		return BaseModel.staticSearchStrClassCanonicalNames(siteRequest_, BaseModel.staticSearchClassCanonicalNames(siteRequest_, BaseModel.staticSetClassCanonicalNames(siteRequest_, o)));
	}

	///////////////
	// sessionId //
	///////////////


	/**	 The entity sessionId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String sessionId;

	/**	<br> The entity sessionId
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.base.BaseModel&fq=entiteVar_enUS_indexed_string:sessionId">Find the entity sessionId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _sessionId(Wrap<String> w);

	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String o) {
		this.sessionId = BaseModel.staticSetSessionId(siteRequest_, o);
	}
	public static String staticSetSessionId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected BaseModel sessionIdInit() {
		Wrap<String> sessionIdWrap = new Wrap<String>().var("sessionId");
		if(sessionId == null) {
			_sessionId(sessionIdWrap);
			Optional.ofNullable(sessionIdWrap.getO()).ifPresent(o -> {
				setSessionId(o);
			});
		}
		return (BaseModel)this;
	}

	public static String staticSearchSessionId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSessionId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSessionId(SiteRequestEnUS siteRequest_, String o) {
		return BaseModel.staticSearchStrSessionId(siteRequest_, BaseModel.staticSearchSessionId(siteRequest_, BaseModel.staticSetSessionId(siteRequest_, o)));
	}

	public String sqlSessionId() {
		return sessionId;
	}

	/////////////
	// userKey //
	/////////////


	/**	 The entity userKey
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long userKey;

	/**	<br> The entity userKey
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.base.BaseModel&fq=entiteVar_enUS_indexed_string:userKey">Find the entity userKey in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _userKey(Wrap<Long> c);

	public Long getUserKey() {
		return userKey;
	}

	public void setUserKey(Long userKey) {
		this.userKey = userKey;
	}
	@JsonIgnore
	public void setUserKey(String o) {
		this.userKey = BaseModel.staticSetUserKey(siteRequest_, o);
	}
	public static Long staticSetUserKey(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected BaseModel userKeyInit() {
		Wrap<Long> userKeyWrap = new Wrap<Long>().var("userKey");
		if(userKey == null) {
			_userKey(userKeyWrap);
			Optional.ofNullable(userKeyWrap.getO()).ifPresent(o -> {
				setUserKey(o);
			});
		}
		return (BaseModel)this;
	}

	public static Long staticSearchUserKey(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrUserKey(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUserKey(SiteRequestEnUS siteRequest_, String o) {
		return BaseModel.staticSearchStrUserKey(siteRequest_, BaseModel.staticSearchUserKey(siteRequest_, BaseModel.staticSetUserKey(siteRequest_, o)));
	}

	public Long sqlUserKey() {
		return userKey;
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.base.BaseModel&fq=entiteVar_enUS_indexed_string:saves">Find the entity saves in Solr</a>
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
	public void setSaves(String o) {
		String l = BaseModel.staticSetSaves(siteRequest_, o);
		if(l != null)
			addSaves(l);
	}
	public static String staticSetSaves(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public BaseModel addSaves(String...objects) {
		for(String o : objects) {
			addSaves(o);
		}
		return (BaseModel)this;
	}
	public BaseModel addSaves(String o) {
		if(o != null)
			this.saves.add(o);
		return (BaseModel)this;
	}
	@JsonIgnore
	public void setSaves(JsonArray objects) {
		saves.clear();
		if(objects == null)
			return;
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addSaves(o);
		}
	}
	protected BaseModel savesInit() {
		_saves(saves);
		return (BaseModel)this;
	}

	public static String staticSearchSaves(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSaves(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSaves(SiteRequestEnUS siteRequest_, String o) {
		return BaseModel.staticSearchStrSaves(siteRequest_, BaseModel.staticSearchSaves(siteRequest_, BaseModel.staticSetSaves(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.base.BaseModel&fq=entiteVar_enUS_indexed_string:objectTitle">Find the entity objectTitle in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _objectTitle(Wrap<String> w);

	public String getObjectTitle() {
		return objectTitle;
	}
	public void setObjectTitle(String o) {
		this.objectTitle = BaseModel.staticSetObjectTitle(siteRequest_, o);
	}
	public static String staticSetObjectTitle(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected BaseModel objectTitleInit() {
		Wrap<String> objectTitleWrap = new Wrap<String>().var("objectTitle");
		if(objectTitle == null) {
			_objectTitle(objectTitleWrap);
			Optional.ofNullable(objectTitleWrap.getO()).ifPresent(o -> {
				setObjectTitle(o);
			});
		}
		return (BaseModel)this;
	}

	public static String staticSearchObjectTitle(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrObjectTitle(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqObjectTitle(SiteRequestEnUS siteRequest_, String o) {
		return BaseModel.staticSearchStrObjectTitle(siteRequest_, BaseModel.staticSearchObjectTitle(siteRequest_, BaseModel.staticSetObjectTitle(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.base.BaseModel&fq=entiteVar_enUS_indexed_string:objectId">Find the entity objectId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _objectId(Wrap<String> w);

	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String o) {
		this.objectId = BaseModel.staticSetObjectId(siteRequest_, o);
	}
	public static String staticSetObjectId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected BaseModel objectIdInit() {
		Wrap<String> objectIdWrap = new Wrap<String>().var("objectId");
		if(objectId == null) {
			_objectId(objectIdWrap);
			Optional.ofNullable(objectIdWrap.getO()).ifPresent(o -> {
				setObjectId(o);
			});
		}
		return (BaseModel)this;
	}

	public static String staticSearchObjectId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrObjectId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqObjectId(SiteRequestEnUS siteRequest_, String o) {
		return BaseModel.staticSearchStrObjectId(siteRequest_, BaseModel.staticSearchObjectId(siteRequest_, BaseModel.staticSetObjectId(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.base.BaseModel&fq=entiteVar_enUS_indexed_string:objectSuggest">Find the entity objectSuggest in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _objectSuggest(Wrap<String> w);

	public String getObjectSuggest() {
		return objectSuggest;
	}
	public void setObjectSuggest(String o) {
		this.objectSuggest = BaseModel.staticSetObjectSuggest(siteRequest_, o);
	}
	public static String staticSetObjectSuggest(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected BaseModel objectSuggestInit() {
		Wrap<String> objectSuggestWrap = new Wrap<String>().var("objectSuggest");
		if(objectSuggest == null) {
			_objectSuggest(objectSuggestWrap);
			Optional.ofNullable(objectSuggestWrap.getO()).ifPresent(o -> {
				setObjectSuggest(o);
			});
		}
		return (BaseModel)this;
	}

	public static String staticSearchObjectSuggest(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrObjectSuggest(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqObjectSuggest(SiteRequestEnUS siteRequest_, String o) {
		return BaseModel.staticSearchStrObjectSuggest(siteRequest_, BaseModel.staticSearchObjectSuggest(siteRequest_, BaseModel.staticSetObjectSuggest(siteRequest_, o)));
	}

	////////////////
	// objectText //
	////////////////


	/**	 The entity objectText
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> objectText = new ArrayList<String>();

	/**	<br> The entity objectText
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.base.BaseModel&fq=entiteVar_enUS_indexed_string:objectText">Find the entity objectText in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _objectText(List<String> l);

	public List<String> getObjectText() {
		return objectText;
	}

	public void setObjectText(List<String> objectText) {
		this.objectText = objectText;
	}
	public void setObjectText(String o) {
		String l = BaseModel.staticSetObjectText(siteRequest_, o);
		if(l != null)
			addObjectText(l);
	}
	public static String staticSetObjectText(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public BaseModel addObjectText(String...objects) {
		for(String o : objects) {
			addObjectText(o);
		}
		return (BaseModel)this;
	}
	public BaseModel addObjectText(String o) {
		if(o != null)
			this.objectText.add(o);
		return (BaseModel)this;
	}
	@JsonIgnore
	public void setObjectText(JsonArray objects) {
		objectText.clear();
		if(objects == null)
			return;
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addObjectText(o);
		}
	}
	protected BaseModel objectTextInit() {
		_objectText(objectText);
		return (BaseModel)this;
	}

	public static String staticSearchObjectText(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrObjectText(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqObjectText(SiteRequestEnUS siteRequest_, String o) {
		return BaseModel.staticSearchStrObjectText(siteRequest_, BaseModel.staticSearchObjectText(siteRequest_, BaseModel.staticSetObjectText(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.base.BaseModel&fq=entiteVar_enUS_indexed_string:pageUrlId">Find the entity pageUrlId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUrlId(Wrap<String> w);

	public String getPageUrlId() {
		return pageUrlId;
	}
	public void setPageUrlId(String o) {
		this.pageUrlId = BaseModel.staticSetPageUrlId(siteRequest_, o);
	}
	public static String staticSetPageUrlId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected BaseModel pageUrlIdInit() {
		Wrap<String> pageUrlIdWrap = new Wrap<String>().var("pageUrlId");
		if(pageUrlId == null) {
			_pageUrlId(pageUrlIdWrap);
			Optional.ofNullable(pageUrlIdWrap.getO()).ifPresent(o -> {
				setPageUrlId(o);
			});
		}
		return (BaseModel)this;
	}

	public static String staticSearchPageUrlId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUrlId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUrlId(SiteRequestEnUS siteRequest_, String o) {
		return BaseModel.staticSearchStrPageUrlId(siteRequest_, BaseModel.staticSearchPageUrlId(siteRequest_, BaseModel.staticSetPageUrlId(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.base.BaseModel&fq=entiteVar_enUS_indexed_string:pageUrlPk">Find the entity pageUrlPk in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUrlPk(Wrap<String> w);

	public String getPageUrlPk() {
		return pageUrlPk;
	}
	public void setPageUrlPk(String o) {
		this.pageUrlPk = BaseModel.staticSetPageUrlPk(siteRequest_, o);
	}
	public static String staticSetPageUrlPk(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected BaseModel pageUrlPkInit() {
		Wrap<String> pageUrlPkWrap = new Wrap<String>().var("pageUrlPk");
		if(pageUrlPk == null) {
			_pageUrlPk(pageUrlPkWrap);
			Optional.ofNullable(pageUrlPkWrap.getO()).ifPresent(o -> {
				setPageUrlPk(o);
			});
		}
		return (BaseModel)this;
	}

	public static String staticSearchPageUrlPk(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUrlPk(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUrlPk(SiteRequestEnUS siteRequest_, String o) {
		return BaseModel.staticSearchStrPageUrlPk(siteRequest_, BaseModel.staticSearchPageUrlPk(siteRequest_, BaseModel.staticSetPageUrlPk(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.base.BaseModel&fq=entiteVar_enUS_indexed_string:pageUrlApi">Find the entity pageUrlApi in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUrlApi(Wrap<String> w);

	public String getPageUrlApi() {
		return pageUrlApi;
	}
	public void setPageUrlApi(String o) {
		this.pageUrlApi = BaseModel.staticSetPageUrlApi(siteRequest_, o);
	}
	public static String staticSetPageUrlApi(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected BaseModel pageUrlApiInit() {
		Wrap<String> pageUrlApiWrap = new Wrap<String>().var("pageUrlApi");
		if(pageUrlApi == null) {
			_pageUrlApi(pageUrlApiWrap);
			Optional.ofNullable(pageUrlApiWrap.getO()).ifPresent(o -> {
				setPageUrlApi(o);
			});
		}
		return (BaseModel)this;
	}

	public static String staticSearchPageUrlApi(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUrlApi(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUrlApi(SiteRequestEnUS siteRequest_, String o) {
		return BaseModel.staticSearchStrPageUrlApi(siteRequest_, BaseModel.staticSearchPageUrlApi(siteRequest_, BaseModel.staticSetPageUrlApi(siteRequest_, o)));
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
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.base.BaseModel&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = BaseModel.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected BaseModel idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			Optional.ofNullable(idWrap.getO()).ifPresent(o -> {
				setId(o);
			});
		}
		return (BaseModel)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return BaseModel.staticSearchStrId(siteRequest_, BaseModel.staticSearchId(siteRequest_, BaseModel.staticSetId(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepBaseModel(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepBaseModel();
	}

	public Future<Void> promiseDeepBaseModel() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseBaseModel(promise2);
		promise2.future().onSuccess(a -> {
			promise.complete();
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseBaseModel(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				siteRequest_Init();
				pkInit();
				inheritPkInit();
				createdInit();
				modifiedInit();
				archivedInit();
				deletedInit();
				classCanonicalNameInit();
				classSimpleNameInit();
				classCanonicalNamesInit();
				sessionIdInit();
				userKeyInit();
				savesInit();
				objectTitleInit();
				objectIdInit();
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
		return promiseDeepBaseModel(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestBaseModel(SiteRequestEnUS siteRequest_) {
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestBaseModel(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainBaseModel(v);
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
	public Object obtainBaseModel(String var) {
		BaseModel oBaseModel = (BaseModel)this;
		switch(var) {
			case "siteRequest_":
				return oBaseModel.siteRequest_;
			case "pk":
				return oBaseModel.pk;
			case "inheritPk":
				return oBaseModel.inheritPk;
			case "created":
				return oBaseModel.created;
			case "modified":
				return oBaseModel.modified;
			case "archived":
				return oBaseModel.archived;
			case "deleted":
				return oBaseModel.deleted;
			case "classCanonicalName":
				return oBaseModel.classCanonicalName;
			case "classSimpleName":
				return oBaseModel.classSimpleName;
			case "classCanonicalNames":
				return oBaseModel.classCanonicalNames;
			case "sessionId":
				return oBaseModel.sessionId;
			case "userKey":
				return oBaseModel.userKey;
			case "saves":
				return oBaseModel.saves;
			case "objectTitle":
				return oBaseModel.objectTitle;
			case "objectId":
				return oBaseModel.objectId;
			case "objectSuggest":
				return oBaseModel.objectSuggest;
			case "objectText":
				return oBaseModel.objectText;
			case "pageUrlId":
				return oBaseModel.pageUrlId;
			case "pageUrlPk":
				return oBaseModel.pageUrlPk;
			case "pageUrlApi":
				return oBaseModel.pageUrlApi;
			case "id":
				return oBaseModel.id;
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
				o = relateBaseModel(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateBaseModel(String var, Object val) {
		BaseModel oBaseModel = (BaseModel)this;
		switch(var) {
			default:
				return null;
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetBaseModel(entityVar,  siteRequest_, o);
	}
	public static Object staticSetBaseModel(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "pk":
			return BaseModel.staticSetPk(siteRequest_, o);
		case "inheritPk":
			return BaseModel.staticSetInheritPk(siteRequest_, o);
		case "created":
			return BaseModel.staticSetCreated(siteRequest_, o);
		case "modified":
			return BaseModel.staticSetModified(siteRequest_, o);
		case "archived":
			return BaseModel.staticSetArchived(siteRequest_, o);
		case "deleted":
			return BaseModel.staticSetDeleted(siteRequest_, o);
		case "classCanonicalName":
			return BaseModel.staticSetClassCanonicalName(siteRequest_, o);
		case "classSimpleName":
			return BaseModel.staticSetClassSimpleName(siteRequest_, o);
		case "classCanonicalNames":
			return BaseModel.staticSetClassCanonicalNames(siteRequest_, o);
		case "sessionId":
			return BaseModel.staticSetSessionId(siteRequest_, o);
		case "userKey":
			return BaseModel.staticSetUserKey(siteRequest_, o);
		case "saves":
			return BaseModel.staticSetSaves(siteRequest_, o);
		case "objectTitle":
			return BaseModel.staticSetObjectTitle(siteRequest_, o);
		case "objectId":
			return BaseModel.staticSetObjectId(siteRequest_, o);
		case "objectSuggest":
			return BaseModel.staticSetObjectSuggest(siteRequest_, o);
		case "objectText":
			return BaseModel.staticSetObjectText(siteRequest_, o);
		case "pageUrlId":
			return BaseModel.staticSetPageUrlId(siteRequest_, o);
		case "pageUrlPk":
			return BaseModel.staticSetPageUrlPk(siteRequest_, o);
		case "pageUrlApi":
			return BaseModel.staticSetPageUrlApi(siteRequest_, o);
		case "id":
			return BaseModel.staticSetId(siteRequest_, o);
			default:
				return null;
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchBaseModel(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchBaseModel(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "pk":
			return BaseModel.staticSearchPk(siteRequest_, (Long)o);
		case "inheritPk":
			return BaseModel.staticSearchInheritPk(siteRequest_, (String)o);
		case "created":
			return BaseModel.staticSearchCreated(siteRequest_, (ZonedDateTime)o);
		case "modified":
			return BaseModel.staticSearchModified(siteRequest_, (ZonedDateTime)o);
		case "archived":
			return BaseModel.staticSearchArchived(siteRequest_, (Boolean)o);
		case "deleted":
			return BaseModel.staticSearchDeleted(siteRequest_, (Boolean)o);
		case "classCanonicalName":
			return BaseModel.staticSearchClassCanonicalName(siteRequest_, (String)o);
		case "classSimpleName":
			return BaseModel.staticSearchClassSimpleName(siteRequest_, (String)o);
		case "classCanonicalNames":
			return BaseModel.staticSearchClassCanonicalNames(siteRequest_, (String)o);
		case "sessionId":
			return BaseModel.staticSearchSessionId(siteRequest_, (String)o);
		case "userKey":
			return BaseModel.staticSearchUserKey(siteRequest_, (Long)o);
		case "saves":
			return BaseModel.staticSearchSaves(siteRequest_, (String)o);
		case "objectTitle":
			return BaseModel.staticSearchObjectTitle(siteRequest_, (String)o);
		case "objectId":
			return BaseModel.staticSearchObjectId(siteRequest_, (String)o);
		case "objectSuggest":
			return BaseModel.staticSearchObjectSuggest(siteRequest_, (String)o);
		case "objectText":
			return BaseModel.staticSearchObjectText(siteRequest_, (String)o);
		case "pageUrlId":
			return BaseModel.staticSearchPageUrlId(siteRequest_, (String)o);
		case "pageUrlPk":
			return BaseModel.staticSearchPageUrlPk(siteRequest_, (String)o);
		case "pageUrlApi":
			return BaseModel.staticSearchPageUrlApi(siteRequest_, (String)o);
		case "id":
			return BaseModel.staticSearchId(siteRequest_, (String)o);
			default:
				return null;
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrBaseModel(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrBaseModel(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "pk":
			return BaseModel.staticSearchStrPk(siteRequest_, (Long)o);
		case "inheritPk":
			return BaseModel.staticSearchStrInheritPk(siteRequest_, (String)o);
		case "created":
			return BaseModel.staticSearchStrCreated(siteRequest_, (Date)o);
		case "modified":
			return BaseModel.staticSearchStrModified(siteRequest_, (Date)o);
		case "archived":
			return BaseModel.staticSearchStrArchived(siteRequest_, (Boolean)o);
		case "deleted":
			return BaseModel.staticSearchStrDeleted(siteRequest_, (Boolean)o);
		case "classCanonicalName":
			return BaseModel.staticSearchStrClassCanonicalName(siteRequest_, (String)o);
		case "classSimpleName":
			return BaseModel.staticSearchStrClassSimpleName(siteRequest_, (String)o);
		case "classCanonicalNames":
			return BaseModel.staticSearchStrClassCanonicalNames(siteRequest_, (String)o);
		case "sessionId":
			return BaseModel.staticSearchStrSessionId(siteRequest_, (String)o);
		case "userKey":
			return BaseModel.staticSearchStrUserKey(siteRequest_, (Long)o);
		case "saves":
			return BaseModel.staticSearchStrSaves(siteRequest_, (String)o);
		case "objectTitle":
			return BaseModel.staticSearchStrObjectTitle(siteRequest_, (String)o);
		case "objectId":
			return BaseModel.staticSearchStrObjectId(siteRequest_, (String)o);
		case "objectSuggest":
			return BaseModel.staticSearchStrObjectSuggest(siteRequest_, (String)o);
		case "objectText":
			return BaseModel.staticSearchStrObjectText(siteRequest_, (String)o);
		case "pageUrlId":
			return BaseModel.staticSearchStrPageUrlId(siteRequest_, (String)o);
		case "pageUrlPk":
			return BaseModel.staticSearchStrPageUrlPk(siteRequest_, (String)o);
		case "pageUrlApi":
			return BaseModel.staticSearchStrPageUrlApi(siteRequest_, (String)o);
		case "id":
			return BaseModel.staticSearchStrId(siteRequest_, (String)o);
			default:
				return null;
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqBaseModel(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqBaseModel(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "pk":
			return BaseModel.staticSearchFqPk(siteRequest_, o);
		case "inheritPk":
			return BaseModel.staticSearchFqInheritPk(siteRequest_, o);
		case "created":
			return BaseModel.staticSearchFqCreated(siteRequest_, o);
		case "modified":
			return BaseModel.staticSearchFqModified(siteRequest_, o);
		case "archived":
			return BaseModel.staticSearchFqArchived(siteRequest_, o);
		case "deleted":
			return BaseModel.staticSearchFqDeleted(siteRequest_, o);
		case "classCanonicalName":
			return BaseModel.staticSearchFqClassCanonicalName(siteRequest_, o);
		case "classSimpleName":
			return BaseModel.staticSearchFqClassSimpleName(siteRequest_, o);
		case "classCanonicalNames":
			return BaseModel.staticSearchFqClassCanonicalNames(siteRequest_, o);
		case "sessionId":
			return BaseModel.staticSearchFqSessionId(siteRequest_, o);
		case "userKey":
			return BaseModel.staticSearchFqUserKey(siteRequest_, o);
		case "saves":
			return BaseModel.staticSearchFqSaves(siteRequest_, o);
		case "objectTitle":
			return BaseModel.staticSearchFqObjectTitle(siteRequest_, o);
		case "objectId":
			return BaseModel.staticSearchFqObjectId(siteRequest_, o);
		case "objectSuggest":
			return BaseModel.staticSearchFqObjectSuggest(siteRequest_, o);
		case "objectText":
			return BaseModel.staticSearchFqObjectText(siteRequest_, o);
		case "pageUrlId":
			return BaseModel.staticSearchFqPageUrlId(siteRequest_, o);
		case "pageUrlPk":
			return BaseModel.staticSearchFqPageUrlPk(siteRequest_, o);
		case "pageUrlApi":
			return BaseModel.staticSearchFqPageUrlApi(siteRequest_, o);
		case "id":
			return BaseModel.staticSearchFqId(siteRequest_, o);
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
					o = persistBaseModel(v, val);
				else if(o instanceof BaseModel) {
					BaseModel oBaseModel = (BaseModel)o;
					o = oBaseModel.persistForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object persistBaseModel(String var, Object val) {
		String varLower = var.toLowerCase();
			if("inheritpk".equals(varLower)) {
				if(val instanceof String) {
					setInheritPk((String)val);
				}
				saves.add("inheritPk");
				return val;
			} else if("created".equals(varLower)) {
				if(val instanceof String) {
					setCreated((String)val);
				} else if(val instanceof OffsetDateTime) {
					setCreated(((OffsetDateTime)val).atZoneSameInstant(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))));
				}
				saves.add("created");
				return val;
			} else if("archived".equals(varLower)) {
				if(val instanceof Boolean) {
					setArchived((Boolean)val);
				} else {
					setArchived(val == null ? null : val.toString());
				}
				saves.add("archived");
				return val;
			} else if("deleted".equals(varLower)) {
				if(val instanceof Boolean) {
					setDeleted((Boolean)val);
				} else {
					setDeleted(val == null ? null : val.toString());
				}
				saves.add("deleted");
				return val;
			} else if("sessionid".equals(varLower)) {
				if(val instanceof String) {
					setSessionId((String)val);
				}
				saves.add("sessionId");
				return val;
			} else if("userkey".equals(varLower)) {
				if(val instanceof Long) {
					setUserKey((Long)val);
				} else {
					setUserKey(val == null ? null : val.toString());
				}
				saves.add("userKey");
				return val;
		} else {
			return null;
		}
	}

	/////////////
	// populate //
	/////////////

	public void populateForClass(SolrResponse.Doc doc) {
		populateBaseModel(doc);
	}
	public void populateBaseModel(SolrResponse.Doc doc) {
		BaseModel oBaseModel = (BaseModel)this;
		saves = doc.get("saves_docvalues_strings");
		if(saves != null) {

			Long pk = (Long)doc.get("pk_docvalues_long");
			oBaseModel.setPk(pk);

			if(saves.contains("inheritPk")) {
				String inheritPk = (String)doc.get("inheritPk_docvalues_string");
				if(inheritPk != null)
					oBaseModel.setInheritPk(inheritPk);
			}

			if(saves.contains("created")) {
				Date created = (Date)doc.get("created_docvalues_date");
				if(created != null)
					oBaseModel.setCreated(created);
			}

			if(saves.contains("modified")) {
				Date modified = (Date)doc.get("modified_docvalues_date");
				if(modified != null)
					oBaseModel.setModified(modified);
			}

			if(saves.contains("archived")) {
				Boolean archived = (Boolean)doc.get("archived_docvalues_boolean");
				if(archived != null)
					oBaseModel.setArchived(archived);
			}

			if(saves.contains("deleted")) {
				Boolean deleted = (Boolean)doc.get("deleted_docvalues_boolean");
				if(deleted != null)
					oBaseModel.setDeleted(deleted);
			}

			if(saves.contains("classCanonicalName")) {
				String classCanonicalName = (String)doc.get("classCanonicalName_docvalues_string");
				if(classCanonicalName != null)
					oBaseModel.setClassCanonicalName(classCanonicalName);
			}

			if(saves.contains("classSimpleName")) {
				String classSimpleName = (String)doc.get("classSimpleName_docvalues_string");
				if(classSimpleName != null)
					oBaseModel.setClassSimpleName(classSimpleName);
			}

			if(saves.contains("classCanonicalNames")) {
				List<String> classCanonicalNames = (List<String>)doc.get("classCanonicalNames_docvalues_strings");
				if(classCanonicalNames != null)
					oBaseModel.classCanonicalNames.addAll(classCanonicalNames);
			}

			if(saves.contains("sessionId")) {
				String sessionId = (String)doc.get("sessionId_docvalues_string");
				if(sessionId != null)
					oBaseModel.setSessionId(sessionId);
			}

			if(saves.contains("userKey")) {
				Long userKey = (Long)doc.get("userKey_docvalues_long");
				if(userKey != null)
					oBaseModel.setUserKey(userKey);
			}

			if(saves.contains("saves")) {
				List<String> saves = (List<String>)doc.get("saves_docvalues_strings");
				if(saves != null)
					oBaseModel.saves.addAll(saves);
			}

			if(saves.contains("objectTitle")) {
				String objectTitle = (String)doc.get("objectTitle_docvalues_string");
				if(objectTitle != null)
					oBaseModel.setObjectTitle(objectTitle);
			}

			if(saves.contains("objectId")) {
				String objectId = (String)doc.get("objectId_docvalues_string");
				if(objectId != null)
					oBaseModel.setObjectId(objectId);
			}

			if(saves.contains("objectSuggest")) {
				String objectSuggest = (String)doc.get("objectSuggest_suggested");
				oBaseModel.setObjectSuggest(objectSuggest);
			}

			if(saves.contains("pageUrlId")) {
				String pageUrlId = (String)doc.get("pageUrlId_docvalues_string");
				if(pageUrlId != null)
					oBaseModel.setPageUrlId(pageUrlId);
			}

			if(saves.contains("pageUrlPk")) {
				String pageUrlPk = (String)doc.get("pageUrlPk_docvalues_string");
				if(pageUrlPk != null)
					oBaseModel.setPageUrlPk(pageUrlPk);
			}

			if(saves.contains("pageUrlApi")) {
				String pageUrlApi = (String)doc.get("pageUrlApi_docvalues_string");
				if(pageUrlApi != null)
					oBaseModel.setPageUrlApi(pageUrlApi);
			}

			String id = (String)doc.get("id");
			oBaseModel.setId(id);
		}
	}

	public void indexBaseModel(JsonObject doc) {
		if(pk != null) {
			doc.put("pk_docvalues_long", pk);
		}
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
		if(sessionId != null) {
			doc.put("sessionId_docvalues_string", sessionId);
		}
		if(userKey != null) {
			doc.put("userKey_docvalues_long", userKey);
		}
		if(saves != null) {
			JsonArray l = new JsonArray();
			doc.put("saves_docvalues_strings", l);
			for(String o : saves) {
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
			JsonArray l = new JsonArray();
			doc.put("objectText_text_enUS", l);
			for(String o : objectText) {
				l.add(o);
			}
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

	public static String varStoredBaseModel(String entityVar) {
		switch(entityVar) {
			case "pk":
				return "pk_docvalues_long";
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
			case "classCanonicalName":
				return "classCanonicalName_docvalues_string";
			case "classSimpleName":
				return "classSimpleName_docvalues_string";
			case "classCanonicalNames":
				return "classCanonicalNames_docvalues_strings";
			case "sessionId":
				return "sessionId_docvalues_string";
			case "userKey":
				return "userKey_docvalues_long";
			case "saves":
				return "saves_docvalues_strings";
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

	public static String varIndexedBaseModel(String entityVar) {
		switch(entityVar) {
			case "pk":
				return "pk_docvalues_long";
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
			case "classCanonicalName":
				return "classCanonicalName_docvalues_string";
			case "classSimpleName":
				return "classSimpleName_docvalues_string";
			case "classCanonicalNames":
				return "classCanonicalNames_docvalues_strings";
			case "sessionId":
				return "sessionId_docvalues_string";
			case "userKey":
				return "userKey_docvalues_long";
			case "saves":
				return "saves_docvalues_strings";
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

	public static String searchVarBaseModel(String searchVar) {
		switch(searchVar) {
			case "pk_docvalues_long":
				return "pk";
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
			case "classCanonicalName_docvalues_string":
				return "classCanonicalName";
			case "classSimpleName_docvalues_string":
				return "classSimpleName";
			case "classCanonicalNames_docvalues_strings":
				return "classCanonicalNames";
			case "sessionId_docvalues_string":
				return "sessionId";
			case "userKey_docvalues_long":
				return "userKey";
			case "saves_docvalues_strings":
				return "saves";
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

	public static String varSearchBaseModel(String entityVar) {
		switch(entityVar) {
			case "objectText":
				return "objectText_text_enUS";
			case "objectSuggest":
				return "objectSuggest_suggested";
			default:
				return null;
		}
	}

	public static String varSuggestedBaseModel(String entityVar) {
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
		storeBaseModel(doc);
	}
	public void storeBaseModel(SolrResponse.Doc doc) {
		BaseModel oBaseModel = (BaseModel)this;

		oBaseModel.setPk(Optional.ofNullable(doc.get("pk_docvalues_long")).map(v -> v.toString()).orElse(null));
		oBaseModel.setInheritPk(Optional.ofNullable(doc.get("inheritPk_docvalues_string")).map(v -> v.toString()).orElse(null));
		oBaseModel.setCreated(Optional.ofNullable(doc.get("created_docvalues_date")).map(v -> v.toString()).orElse(null));
		oBaseModel.setModified(Optional.ofNullable(doc.get("modified_docvalues_date")).map(v -> v.toString()).orElse(null));
		oBaseModel.setArchived(Optional.ofNullable(doc.get("archived_docvalues_boolean")).map(v -> v.toString()).orElse(null));
		oBaseModel.setDeleted(Optional.ofNullable(doc.get("deleted_docvalues_boolean")).map(v -> v.toString()).orElse(null));
		oBaseModel.setClassCanonicalName(Optional.ofNullable(doc.get("classCanonicalName_docvalues_string")).map(v -> v.toString()).orElse(null));
		oBaseModel.setClassSimpleName(Optional.ofNullable(doc.get("classSimpleName_docvalues_string")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("classCanonicalNames_docvalues_strings")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oBaseModel.addClassCanonicalNames(v.toString());
		});
		oBaseModel.setSessionId(Optional.ofNullable(doc.get("sessionId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oBaseModel.setUserKey(Optional.ofNullable(doc.get("userKey_docvalues_long")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("saves_docvalues_strings")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oBaseModel.addSaves(v.toString());
		});
		oBaseModel.setObjectTitle(Optional.ofNullable(doc.get("objectTitle_docvalues_string")).map(v -> v.toString()).orElse(null));
		oBaseModel.setObjectId(Optional.ofNullable(doc.get("objectId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oBaseModel.setObjectSuggest(Optional.ofNullable(doc.get("objectSuggest_suggested")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("objectText_text_enUS")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oBaseModel.addObjectText(v.toString());
		});
		oBaseModel.setPageUrlId(Optional.ofNullable(doc.get("pageUrlId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oBaseModel.setPageUrlPk(Optional.ofNullable(doc.get("pageUrlPk_docvalues_string")).map(v -> v.toString()).orElse(null));
		oBaseModel.setPageUrlApi(Optional.ofNullable(doc.get("pageUrlApi_docvalues_string")).map(v -> v.toString()).orElse(null));
		String id = (String)doc.get("id");
		oBaseModel.setId(id);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestBaseModel() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof BaseModel) {
			BaseModel original = (BaseModel)o;
			if(!Objects.equals(pk, original.getPk()))
				apiRequest.addVars("pk");
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
			if(!Objects.equals(classCanonicalName, original.getClassCanonicalName()))
				apiRequest.addVars("classCanonicalName");
			if(!Objects.equals(classSimpleName, original.getClassSimpleName()))
				apiRequest.addVars("classSimpleName");
			if(!Objects.equals(classCanonicalNames, original.getClassCanonicalNames()))
				apiRequest.addVars("classCanonicalNames");
			if(!Objects.equals(sessionId, original.getSessionId()))
				apiRequest.addVars("sessionId");
			if(!Objects.equals(userKey, original.getUserKey()))
				apiRequest.addVars("userKey");
			if(!Objects.equals(saves, original.getSaves()))
				apiRequest.addVars("saves");
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
		sb.append(Optional.ofNullable(pk).map(v -> "pk: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(inheritPk).map(v -> "inheritPk: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(created).map(v -> "created: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(modified).map(v -> "modified: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(archived).map(v -> "archived: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(deleted).map(v -> "deleted: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(classCanonicalName).map(v -> "classCanonicalName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(classSimpleName).map(v -> "classSimpleName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(classCanonicalNames).map(v -> "classCanonicalNames: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(sessionId).map(v -> "sessionId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(userKey).map(v -> "userKey: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(saves).map(v -> "saves: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(objectTitle).map(v -> "objectTitle: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(objectId).map(v -> "objectId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(objectSuggest).map(v -> "objectSuggest: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(objectText).map(v -> "objectText: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pageUrlId).map(v -> "pageUrlId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(pageUrlPk).map(v -> "pageUrlPk: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(pageUrlApi).map(v -> "pageUrlApi: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(id).map(v -> "id: \"" + v + "\"\n" ).orElse(""));
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "BaseModel";
	public static final String VAR_siteRequest_ = "siteRequest_";
	public static final String VAR_pk = "pk";
	public static final String VAR_inheritPk = "inheritPk";
	public static final String VAR_created = "created";
	public static final String VAR_modified = "modified";
	public static final String VAR_archived = "archived";
	public static final String VAR_deleted = "deleted";
	public static final String VAR_classCanonicalName = "classCanonicalName";
	public static final String VAR_classSimpleName = "classSimpleName";
	public static final String VAR_classCanonicalNames = "classCanonicalNames";
	public static final String VAR_sessionId = "sessionId";
	public static final String VAR_userKey = "userKey";
	public static final String VAR_saves = "saves";
	public static final String VAR_objectTitle = "objectTitle";
	public static final String VAR_objectId = "objectId";
	public static final String VAR_objectSuggest = "objectSuggest";
	public static final String VAR_objectText = "objectText";
	public static final String VAR_pageUrlId = "pageUrlId";
	public static final String VAR_pageUrlPk = "pageUrlPk";
	public static final String VAR_pageUrlApi = "pageUrlApi";
	public static final String VAR_id = "id";

	public static List<String> varsQForClass() {
		return BaseModel.varsQBaseModel(new ArrayList<String>());
	}
	public static List<String> varsQBaseModel(List<String> vars) {
		vars.add(VAR_objectSuggest);
		vars.add(VAR_objectText);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return BaseModel.varsFqBaseModel(new ArrayList<String>());
	}
	public static List<String> varsFqBaseModel(List<String> vars) {
		vars.add(VAR_pk);
		vars.add(VAR_created);
		vars.add(VAR_modified);
		vars.add(VAR_classSimpleName);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return BaseModel.varsRangeBaseModel(new ArrayList<String>());
	}
	public static List<String> varsRangeBaseModel(List<String> vars) {
		vars.add(VAR_pk);
		vars.add(VAR_created);
		vars.add(VAR_modified);
		return vars;
	}

	public static final String DISPLAY_NAME_siteRequest_ = "";
	public static final String DISPLAY_NAME_pk = "primary key";
	public static final String DISPLAY_NAME_inheritPk = "";
	public static final String DISPLAY_NAME_created = "created";
	public static final String DISPLAY_NAME_modified = "modified";
	public static final String DISPLAY_NAME_archived = "archived";
	public static final String DISPLAY_NAME_deleted = "deleted";
	public static final String DISPLAY_NAME_classCanonicalName = "";
	public static final String DISPLAY_NAME_classSimpleName = "object type";
	public static final String DISPLAY_NAME_classCanonicalNames = "";
	public static final String DISPLAY_NAME_sessionId = "";
	public static final String DISPLAY_NAME_userKey = "";
	public static final String DISPLAY_NAME_saves = "";
	public static final String DISPLAY_NAME_objectTitle = "";
	public static final String DISPLAY_NAME_objectId = "ID";
	public static final String DISPLAY_NAME_objectSuggest = "autosuggest";
	public static final String DISPLAY_NAME_objectText = "text";
	public static final String DISPLAY_NAME_pageUrlId = "";
	public static final String DISPLAY_NAME_pageUrlPk = "";
	public static final String DISPLAY_NAME_pageUrlApi = "";
	public static final String DISPLAY_NAME_id = "";

	public static String displayNameForClass(String var) {
		return BaseModel.displayNameBaseModel(var);
	}
	public static String displayNameBaseModel(String var) {
		switch(var) {
		case VAR_siteRequest_:
			return DISPLAY_NAME_siteRequest_;
		case VAR_pk:
			return DISPLAY_NAME_pk;
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
		case VAR_classCanonicalName:
			return DISPLAY_NAME_classCanonicalName;
		case VAR_classSimpleName:
			return DISPLAY_NAME_classSimpleName;
		case VAR_classCanonicalNames:
			return DISPLAY_NAME_classCanonicalNames;
		case VAR_sessionId:
			return DISPLAY_NAME_sessionId;
		case VAR_userKey:
			return DISPLAY_NAME_userKey;
		case VAR_saves:
			return DISPLAY_NAME_saves;
		case VAR_objectTitle:
			return DISPLAY_NAME_objectTitle;
		case VAR_objectId:
			return DISPLAY_NAME_objectId;
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

	public static String descriptionBaseModel(String var) {
		switch(var) {
		case VAR_siteRequest_:
			return "The current request object";
		case VAR_pk:
			return "The primary key of this object in the database";
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
		case VAR_classCanonicalName:
			return "the canonical name of this Java class";
		case VAR_classSimpleName:
			return "The simple name of this Java class";
		case VAR_classCanonicalNames:
			return "All the inherited canonical names of this Java class";
		case VAR_sessionId:
			return "The session ID of the user that created this object";
		case VAR_userKey:
			return "The primary key of the user that created this record";
		case VAR_saves:
			return "A list of fields that are saved for this record in the database";
		case VAR_objectTitle:
			return "The title of this object";
		case VAR_objectId:
			return "A URL friendly unique ID for this object";
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

	public static String classSimpleNameBaseModel(String var) {
		switch(var) {
		case VAR_siteRequest_:
			return "SiteRequestEnUS";
		case VAR_pk:
			return "Long";
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
		case VAR_classCanonicalName:
			return "String";
		case VAR_classSimpleName:
			return "String";
		case VAR_classCanonicalNames:
			return "List";
		case VAR_sessionId:
			return "String";
		case VAR_userKey:
			return "Long";
		case VAR_saves:
			return "List";
		case VAR_objectTitle:
			return "String";
		case VAR_objectId:
			return "String";
		case VAR_objectSuggest:
			return "String";
		case VAR_objectText:
			return "List";
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

	public static Integer htmColumnBaseModel(String var) {
		switch(var) {
		case VAR_created:
			return 1;
		case VAR_objectTitle:
			return 2;
			default:
				return null;
		}
	}

	public static Integer htmRowBaseModel(String var) {
		switch(var) {
		case VAR_pk:
			return 1;
		case VAR_created:
			return 1;
		case VAR_modified:
			return 1;
		case VAR_archived:
			return 2;
		case VAR_deleted:
			return 2;
		case VAR_objectId:
			return 1;
			default:
				return null;
		}
	}

	public static Integer htmCellBaseModel(String var) {
		switch(var) {
		case VAR_pk:
			return 1;
		case VAR_created:
			return 2;
		case VAR_modified:
			return 3;
		case VAR_archived:
			return 1;
		case VAR_deleted:
			return 2;
		case VAR_objectId:
			return 4;
			default:
				return null;
		}
	}

	public static Integer lengthMinBaseModel(String var) {
		switch(var) {
			default:
				return null;
		}
	}

	public static Integer lengthMaxBaseModel(String var) {
		switch(var) {
			default:
				return null;
		}
	}

	public static Integer maxBaseModel(String var) {
		switch(var) {
			default:
				return null;
		}
	}

	public static Integer minBaseModel(String var) {
		switch(var) {
			default:
				return null;
		}
	}
}
