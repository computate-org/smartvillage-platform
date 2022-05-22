package org.computate.smartvillageview.enus.model.html;

import java.text.Normalizer;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.computate.search.tool.XmlTool;
import org.computate.search.wrap.Wrap;
import org.computate.smartvillageview.enus.config.ConfigKeys;
import org.computate.smartvillageview.enus.request.SiteRequestEnUS;

import io.vertx.core.Promise;
import io.vertx.core.json.JsonObject;

/**
 * Api: true
 * Page: true
 * SuperPage.enUS: PageLayout
 * Indexed: true
 * 
 * ApiTag.enUS: HTM
 * ApiUri.enUS: /api/htm
 * 
 * ApiMethod.enUS: Search
 * ApiMethod: GET
 * ApiMethod: POST
 * ApiMethod: PATCH
 * ApiMethod: PUTImport
 * 
 * ApiMethod.enUS: SearchPage
 * PageSearchPage.enUS: SiteHtmlPage
 * PageSuperSearchPage.enUS: BaseModelPage
 * ApiUriSearchPage.enUS: /htm
 * 
 * AName.enUS: an HTML
 * Color: 2017-navy-peony
 * IconGroup: duotone
 * IconName: code
 * NameVar: htm
 * 
 * RoleAll: true
 * Description: An HTML part that is indexed in the search engine. 
 */
public class SiteHtm extends SiteHtmGen<Object> {

	/**
	 * {@inheritDoc}
	 * Ignore: true
	 * Description: An asynchronous method for searching for related problems to this message
	 */
	protected void _promiseBegin(Promise<Void> promise) {
		promise.complete();
	}

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
	 * HtmlColumn: 1
	 * Facet: true
	 * DisplayName.enUS: created
	 * FormatHtm: MMM d, yyyy h:mm:ss a
	 * Description: A created timestamp for this record in the database
	 */
	protected void _created(Wrap<ZonedDateTime> w) {
	}

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
	 * Saves: true
	 * Description: A list of fields that are saved for this record in the database
	 */
	protected void _saves(List<String> l) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 3
	 * HtmlCell: 1
	 * HtmlColumn: 3
	 * Facet: true
	 * DisplayName: Page ID
	 * Description: The ID for this page. 
	 */
	protected void _uri(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 3
	 * HtmlCell: 1
	 * HtmlColumn: 3
	 * Facet: true
	 * DisplayName: Page ID
	 * Description: The ID for this page. 
	 */
	protected void _pageId(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 3
	 * HtmlCell: 2
	 * HtmlColumn: 4
	 * Facet: true
	 * DisplayName: Sequence Number
	 * Description: The sequence number for this page. 
	 */
	protected void _sequenceNum(Wrap<Long> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: HTML Group
	 * Description: The HTML group. 
	 */
	protected void _htmGroup(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: HTML Element
	 * Description: The HTML element. 
	 */
	protected void _eBefore(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: HTML Element
	 * Description: The HTML element. 
	 */
	protected void _eAfter(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * Persist: true
	 * DocValues: true
	 * DisplayName: HTML Element
	 * Description: The HTML element. 
	 */
	protected void _a(Wrap<JsonObject> w) {
	}

	/**
	 * {@inheritDoc}
	 * Text: true
	 * Persist: true
	 * DisplayName: Text
	 * Description: The text. 
	 */
	protected void _text(List<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * Persist: true
	 * DocValues: true
	 * DisplayName: Tabs
	 * Description: The tabs. 
	 */
	protected void _tabs(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * Persist: true
	 * DocValues: true
	 * DisplayName: Tabs
	 * Description: The tabs. 
	 */
	protected void _newLine(Wrap<Boolean> w) {
		w.o(false);
	}

	/**
	 * {@inheritDoc}
	 * Stored: true
	 * Persist: true
	 * DisplayName: HTML before
	 * Description: The HTML that comes before the text. 
	 */
	protected void _htmBefore(Wrap<String> w) {
		if(eBefore != null) {
			StringBuilder b = new StringBuilder();
			if(tabs != null)
				b.append(tabs);
			b.append("<").append(eBefore);
			if(a != null) {
				for(String attr : a.fieldNames()) {
					String val = XmlTool.escapeInQuotes(a.getString(attr));
					b.append(" ").append(attr).append("=\"").append(val).append("\"");
				}
			}
			if(XmlTool.HTML_ELEMENTS_CLOSED.contains(eBefore)) {
				b.append("/>");
			} else {
				b.append(">");
			}
			if(newLine) {
				b.append("\n");
			}
			w.o(b.toString());
		}
	}

	/**
	 * {@inheritDoc}
	 * Stored: true
	 * Persist: true
	 * DisplayName: HTML after
	 * Description: The HTML that comes after the text. 
	 */
	protected void _htmAfter(Wrap<String> w) {
		if(eAfter != null && !XmlTool.HTML_ELEMENTS_CLOSED.contains(eAfter)) {
			StringBuilder b = new StringBuilder();
			if(tabs != null) {
				b.append(tabs);
			}
			b.append("</").append(eAfter).append(">");
			if(newLine) {
				b.append("\n");
			}
			w.o(b.toString());
		}
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
		l.add(cl.getCanonicalName());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * VarTitle: true
	 * HtmlColumn: 2
	 * Description: The title of this object
	 */
	protected void _objectTitle(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * VarId: true
	 * HtmlRow: 1
	 * HtmlCell: 4
	 * DisplayName.enUS: ID
	 * Description: A URL friendly unique ID for this object
	 */
	protected void _objectId(Wrap<String> w) {
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
				String o = toId(StringUtils.join(StringUtils.splitByCharacterTypeCamelCase((String)FieldUtils.getField(cl, cl.getSimpleName() + "_NameVar_enUS").get(this)), "-"));
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
	 * DisplayName: autosuggest
	 */
	protected void _objectSuggest(Wrap<String> w) { 
		StringBuilder b = new StringBuilder();
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
		w.o(pageUrlId);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Description: The link to this object in the API
	 */
	protected void _pageUrlApi(Wrap<String> w) {
		String o = siteRequest_.getConfig().getString(ConfigKeys.SITE_BASE_URL) + "/api/" + objectNameVar + "/" + objectId;
		w.o(o);
	}

	/**
	 * {@inheritDoc}
	 * UniqueKey: true
	 * Description: The unique key for this record in the search engine
	 */
	protected void _id(Wrap<String> w) {
		w.o(String.format("%s_%s", pageId, sequenceNum));
	}
}
