package org.computate.smartvillageview.enus.model.base;

import java.text.Normalizer;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.computate.search.wrap.Wrap;
import org.computate.vertx.model.base.ComputateVertxBaseModel;

import org.computate.smartvillageview.enus.config.ConfigKeys;
import org.computate.smartvillageview.enus.request.SiteRequestEnUS;

/**
 * Indexed: true
 * Page: true
 * SuperPage: PageLayout
 * Keyword: classSimpleNameBaseModel
 * Description: A reusable base class for all database model classes
 */
public class BaseModel extends BaseModelGen<Object> implements ComputateVertxBaseModel {

	/**
	 * {@inheritDoc}
	 * Ignore: true
	 * Description: The current request object
	 */
	protected void _siteRequest_(Wrap<SiteRequestEnUS> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * PrimaryKey: true
	 * Modify: false
	 * HtmlRow: 1
	 * HtmlCell: 1
	 * DisplayName.enUS: primary key
	 * Description: The primary key of this object in the database
	 */
	protected void _pk(Wrap<Long> w) {}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * InheritPrimaryKey: true
	 * Persist: true
	 * Description: An optional inherited primary key from a legacy system for this object in the database
	 */
	protected void _inheritPk(Wrap<String> w) {}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Modify: false
	 * VarCreated: true
	 * HtmlRow: 1
	 * HtmlCell: 2
	 * HtmlColumn: 2
	 * DisplayName.enUS: created
	 * FormatHtm: MMM d, yyyy h:mm:ss a
	 * A created timestamp for this record in the database
	 */
	protected void _created(Wrap<ZonedDateTime> w) {}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Modify: false
	 * VarModified: true
	 * HtmlRow: 1
	 * HtmlCell: 3
	 * DisplayName.enUS: modified
	 * Description: A modified timestamp for this record in the database
	 */
	protected void _modified(Wrap<ZonedDateTime> w) {
		w.o(ZonedDateTime.now(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 2
	 * HtmlCell: 1
	 * DisplayName.enUS: archived
	 * Description: For archiving this record
	 */
	protected void _archived(Wrap<Boolean> w) {
		w.o(false);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 2
	 * HtmlCell: 2
	 * DisplayName.enUS: deleted
	 * Description: For deleting this record
	 */ 
	protected void _deleted(Wrap<Boolean> w) {
		w.o(false);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Description: the canonical name of this Java class
	 */ 
	protected void _classCanonicalName(Wrap<String> w) {
		w.o(getClass().getCanonicalName());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Description: The simple name of this Java class
	 */ 
	protected void _classSimpleName(Wrap<String> w) {
		w.o(getClass().getSimpleName());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Description: All the inherited canonical names of this Java class
	 */ 
	protected void _classCanonicalNames(List<String> l) { 
		Class<?> cl = getClass();
		if(!cl.equals(BaseModel.class))
			l.add(cl.getCanonicalName());
		l.add(BaseModel.class.getCanonicalName());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Modify: false
	 * Description: The session ID of the user that created this object
	 */  
	protected void _sessionId(Wrap<String> w) {
	}

	/**   
	 * {@inheritDoc}
	 * Var.enUS: userKey
	 * DocValues: true
	 * Persist: true
	 * Modify: false
	 * Description: The primary key of the user that created this record
	 */
	protected void _userKey(Wrap<Long> c) {
	}
	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Saves: true
	 * Description: A list of fields that are saved for this record in the database
	 */ 
	protected void _saves(List<String> l) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * VarTitle: true
	 * HtmlColumn: 2
	 * Description: The title of this object
	 */ 
	protected void _objectTitle(Wrap<String> w) {
		w.o(toString());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * VarId: true
	 * HtmlRow: 1
	 * HtmlCell: 4
	 * DisplayName.enUS: ID
	 * Description: A URL friendly unique ID for this object
	 */ 
	protected void _objectId(Wrap<String> w) {
		if(objectTitle != null) {
			w.o(toId(objectTitle));
		}
		else if(pk != null){
			w.o(pk.toString());
		}
	}

	/**
	 * Description: A helper method for generating a URL friendly unique ID for this object
	 */
	public String toId(String s) {
		if(s != null) {
			s = Normalizer.normalize(s, Normalizer.Form.NFD);
			s = StringUtils.lowerCase(s);
			s = StringUtils.trim(s);
			s = StringUtils.replacePattern(s, "\\s{1,}", "-");
			s = StringUtils.replacePattern(s, "[^\\w-]", "");
			s = StringUtils.replacePattern(s, "-{2,}", "-");
		}

		return s;
	}

	/**
	 * Description: The var that identifies this type of object in the API
	 */
	protected void _objectNameVar(Wrap<String> w) {
		if(objectId != null) {
			Class<?> cl = getClass();

			try {
				String o = toId(StringUtils.join(StringUtils.splitByCharacterTypeCamelCase((String)FieldUtils.getField(cl, cl.getSimpleName() + "_NameVar").get(this)), "-"));
				w.o(o);
			} catch (Exception e) {
				ExceptionUtils.rethrow(e);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * Suggested: true
	 * Description: The indexed field in the search engine for this record while using autosuggest
	 */
	protected void _objectSuggest(Wrap<String> w) { 
		StringBuilder b = new StringBuilder();
		if(pk != null)
			b.append(" ").append(pk);
		if(objectNameVar != null)
			b.append(" ").append(objectNameVar);
		if(objectId != null)
			b.append(" ").append(objectId);
		if(objectTitle != null)
			b.append(" ").append(objectTitle);
		w.o(b.toString());
	}

	/**
	 * {@inheritDoc}
	 * Text: true
	 * DocValues: true
	 * Description: The full text search field in the search engine for this record while using autosuggest
	 */ 
	protected void _objectText(Wrap<String> w) { 
		StringBuilder b = new StringBuilder();
		if(pk != null)
			b.append(" ").append(pk);
		if(objectNameVar != null)
			b.append(" ").append(objectNameVar);
		if(objectId != null)
			b.append(" ").append(objectId);
		if(objectTitle != null)
			b.append(" ").append(objectTitle);
		w.o(b.toString());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * VarUrlId: true
	 * Description: The link by name for this object in the UI
	 */
	protected void _pageUrlId(Wrap<String> w) {
		if(objectId != null) {
			String o = siteRequest_.getConfig().getString(ConfigKeys.SITE_BASE_URL) + "/" + objectNameVar + "/" + objectId;
			w.o(o);
		}
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * VarUrlPk: true
	 * Description: The link by primary key for this object in the UI
	 	 */ 
	protected void _pageUrlPk(Wrap<String> w) {
		if(pk != null) {
			String o = siteRequest_.getConfig().getString(ConfigKeys.SITE_BASE_URL) + "/" + objectNameVar + "/" + pk;
			w.o(o);
		}
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Description: The link to this object in the API
	 **/
	protected void _pageUrlApi(Wrap<String> w)  {
		if(pk != null) {
			String o = siteRequest_.getConfig().getString(ConfigKeys.SITE_BASE_URL) + "/api/" + objectNameVar + "/" + pk;
			w.o(o);
		}
	}

	/**
	 * {@inheritDoc}
	 * UniqueKey: true
	 * Description: The unique key for this record in the search engine
	 */
	protected void _id(Wrap<String> w) {
		if(pk != null)
			w.o(getClass().getSimpleName() + "_" + pk.toString());
	}
}
