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
import java.lang.Long;
import java.lang.String;
import io.vertx.core.json.JsonArray;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.html.SiteHtml&fq=entiteVar_enUS_indexed_string:pk">Find the entity pk in Solr</a>
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
		this.pk = SiteHtml.staticSetPk(siteRequest_, o);
	}
	public static Long staticSetPk(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected SiteHtml pkInit() {
		Wrap<Long> pkWrap = new Wrap<Long>().var("pk");
		if(pk == null) {
			_pk(pkWrap);
			setPk(pkWrap.o);
		}
		return (SiteHtml)this;
	}

	public static Long staticSearchPk(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrPk(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPk(SiteRequestEnUS siteRequest_, String o) {
		return SiteHtml.staticSearchStrPk(siteRequest_, SiteHtml.staticSearchPk(siteRequest_, SiteHtml.staticSetPk(siteRequest_, o)));
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
				pkInit();
				savesInit();
				eInit();
				htmlBeforeInit();
				htmlAfterInit();
				classCanonicalNameInit();
				classSimpleNameInit();
				classCanonicalNamesInit();
				objectTextInit();
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
			case "pk":
				return oSiteHtml.pk;
			case "saves":
				return oSiteHtml.saves;
			case "e":
				return oSiteHtml.e;
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
			case "objectText":
				return oSiteHtml.objectText;
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
		case "pk":
			return SiteHtml.staticSetPk(siteRequest_, o);
		case "saves":
			return SiteHtml.staticSetSaves(siteRequest_, o);
		case "e":
			return SiteHtml.staticSetE(siteRequest_, o);
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
		case "objectText":
			return SiteHtml.staticSetObjectText(siteRequest_, o);
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
		case "pk":
			return SiteHtml.staticSearchPk(siteRequest_, (Long)o);
		case "saves":
			return SiteHtml.staticSearchSaves(siteRequest_, (String)o);
		case "e":
			return SiteHtml.staticSearchE(siteRequest_, (String)o);
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
		case "objectText":
			return SiteHtml.staticSearchObjectText(siteRequest_, (String)o);
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
		case "pk":
			return SiteHtml.staticSearchStrPk(siteRequest_, (Long)o);
		case "saves":
			return SiteHtml.staticSearchStrSaves(siteRequest_, (String)o);
		case "e":
			return SiteHtml.staticSearchStrE(siteRequest_, (String)o);
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
		case "objectText":
			return SiteHtml.staticSearchStrObjectText(siteRequest_, (String)o);
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
		case "pk":
			return SiteHtml.staticSearchFqPk(siteRequest_, o);
		case "saves":
			return SiteHtml.staticSearchFqSaves(siteRequest_, o);
		case "e":
			return SiteHtml.staticSearchFqE(siteRequest_, o);
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
		case "objectText":
			return SiteHtml.staticSearchFqObjectText(siteRequest_, o);
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
		if(pk != null) {
			doc.put("pk_docvalues_long", pk);
		}
		if(saves != null) {
			JsonArray l = new JsonArray();
			doc.put("saves_docvalues_strings", l);
			for(String o : saves) {
				l.add(o);
			}
		}
		if(e != null) {
			doc.put("e_docvalues_string", e);
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
		if(objectText != null) {
			doc.put("objectText_text_enUS", objectText.toString());
			doc.put("objectText_indexed_string", objectText);
		}
		if(id != null) {
			doc.put("id", id);
		}
	}

	public static String varStoredSiteHtml(String entityVar) {
		switch(entityVar) {
			case "pk":
				return "pk_docvalues_long";
			case "saves":
				return "saves_docvalues_strings";
			case "e":
				return "e_docvalues_string";
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
			default:
				return null;
		}
	}

	public static String varIndexedSiteHtml(String entityVar) {
		switch(entityVar) {
			case "pk":
				return "pk_docvalues_long";
			case "saves":
				return "saves_docvalues_strings";
			case "e":
				return "e_docvalues_string";
			case "classCanonicalName":
				return "classCanonicalName_docvalues_string";
			case "classSimpleName":
				return "classSimpleName_docvalues_string";
			case "classCanonicalNames":
				return "classCanonicalNames_docvalues_strings";
			case "objectText":
				return "objectText_text_enUS";
			case "id":
				return "id";
			default:
				return null;
		}
	}

	public static String searchVarSiteHtml(String searchVar) {
		switch(searchVar) {
			case "pk_docvalues_long":
				return "pk";
			case "saves_docvalues_strings":
				return "saves";
			case "e_docvalues_string":
				return "e";
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
			case "objectText_text_enUS":
				return "objectText";
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
			default:
				return null;
		}
	}

	public static String varSuggestedSiteHtml(String entityVar) {
		switch(entityVar) {
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

		oSiteHtml.setPk(Optional.ofNullable(doc.get("pk_docvalues_long")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("saves_docvalues_strings")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oSiteHtml.addSaves(v.toString());
		});
		oSiteHtml.setE(Optional.ofNullable(doc.get("e_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteHtml.setHtmlBefore(Optional.ofNullable(doc.get("htmlBefore_stored_string")).map(v -> v.toString()).orElse(null));
		oSiteHtml.setHtmlAfter(Optional.ofNullable(doc.get("htmlAfter_stored_string")).map(v -> v.toString()).orElse(null));
		oSiteHtml.setClassCanonicalName(Optional.ofNullable(doc.get("classCanonicalName_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteHtml.setClassSimpleName(Optional.ofNullable(doc.get("classSimpleName_docvalues_string")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("classCanonicalNames_docvalues_strings")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oSiteHtml.addClassCanonicalNames(v.toString());
		});
		oSiteHtml.setObjectText(Optional.ofNullable(doc.get("objectText_indexedstored_string")).map(v -> v.toString()).orElse(null));
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
			if(!Objects.equals(pk, original.getPk()))
				apiRequest.addVars("pk");
			if(!Objects.equals(saves, original.getSaves()))
				apiRequest.addVars("saves");
			if(!Objects.equals(e, original.getE()))
				apiRequest.addVars("e");
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
			if(!Objects.equals(objectText, original.getObjectText()))
				apiRequest.addVars("objectText");
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
		sb.append(Optional.ofNullable(saves).map(v -> "saves: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(e).map(v -> "e: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(htmlBefore).map(v -> "htmlBefore: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(htmlAfter).map(v -> "htmlAfter: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(classCanonicalName).map(v -> "classCanonicalName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(classSimpleName).map(v -> "classSimpleName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(classCanonicalNames).map(v -> "classCanonicalNames: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(objectText).map(v -> "objectText: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(id).map(v -> "id: \"" + v + "\"\n" ).orElse(""));
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "SiteHtml";
	public static final String VAR_promiseBegin = "promiseBegin";
	public static final String VAR_siteRequest_ = "siteRequest_";
	public static final String VAR_pk = "pk";
	public static final String VAR_saves = "saves";
	public static final String VAR_e = "e";
	public static final String VAR_htmlBefore = "htmlBefore";
	public static final String VAR_htmlAfter = "htmlAfter";
	public static final String VAR_classCanonicalName = "classCanonicalName";
	public static final String VAR_classSimpleName = "classSimpleName";
	public static final String VAR_classCanonicalNames = "classCanonicalNames";
	public static final String VAR_objectText = "objectText";
	public static final String VAR_id = "id";

	public static List<String> varsQForClass() {
		return SiteHtml.varsQSiteHtml(new ArrayList<String>());
	}
	public static List<String> varsQSiteHtml(List<String> vars) {
		vars.add(VAR_objectText);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return SiteHtml.varsFqSiteHtml(new ArrayList<String>());
	}
	public static List<String> varsFqSiteHtml(List<String> vars) {
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return SiteHtml.varsRangeSiteHtml(new ArrayList<String>());
	}
	public static List<String> varsRangeSiteHtml(List<String> vars) {
		return vars;
	}

	public static final String DISPLAY_NAME_promiseBegin = "";
	public static final String DISPLAY_NAME_siteRequest_ = "";
	public static final String DISPLAY_NAME_pk = "primary key";
	public static final String DISPLAY_NAME_saves = "";
	public static final String DISPLAY_NAME_e = "HTML Element";
	public static final String DISPLAY_NAME_htmlBefore = "HTML before";
	public static final String DISPLAY_NAME_htmlAfter = "HTML after";
	public static final String DISPLAY_NAME_classCanonicalName = "";
	public static final String DISPLAY_NAME_classSimpleName = "";
	public static final String DISPLAY_NAME_classCanonicalNames = "";
	public static final String DISPLAY_NAME_objectText = "text";
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
		case VAR_pk:
			return DISPLAY_NAME_pk;
		case VAR_saves:
			return DISPLAY_NAME_saves;
		case VAR_e:
			return DISPLAY_NAME_e;
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
		case VAR_objectText:
			return DISPLAY_NAME_objectText;
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
		case VAR_pk:
			return "The primary key of this object";
		case VAR_saves:
			return "A list of fields that are saved for this record in the database";
		case VAR_e:
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
		case VAR_objectText:
			return "The full text search field in the search engine for this record while using autosuggest";
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
		case VAR_pk:
			return "Long";
		case VAR_saves:
			return "List";
		case VAR_e:
			return "String";
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
		case VAR_objectText:
			return "String";
		case VAR_id:
			return "String";
			default:
				return null;
		}
	}

	public static Integer htmlColumnSiteHtml(String var) {
		switch(var) {
			default:
				return null;
		}
	}

	public static Integer htmlRowSiteHtml(String var) {
		switch(var) {
			default:
				return null;
		}
	}

	public static Integer htmlCellSiteHtml(String var) {
		switch(var) {
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
