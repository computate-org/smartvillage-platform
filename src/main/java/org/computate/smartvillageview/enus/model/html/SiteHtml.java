package org.computate.smartvillageview.enus.model.html;

import java.util.List;

import org.computate.search.wrap.Wrap;
import org.computate.smartvillageview.enus.request.SiteRequestEnUS;

import io.vertx.core.Promise;

/**
 * Api: true
 * Page: true
 * SuperPage.enUS: PageLayout
 * Indexed: true
 * 
 * ApiTag.enUS: HTML
 * ApiUri.enUS: /api/html
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
 * ApiUriSearchPage.enUS: /html
 * 
 * AName.enUS: an HTML
 * Color: 2017-navy-peony
 * IconGroup: duotone
 * IconName: code
 * NameVar: html
 * 
 * RoleAll: true
 * Description: An HTML part that is indexed in the search engine. 
 */
public class SiteHtml extends SiteHtmlGen<Object> {

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
	 * DisplayName.enUS: primary key
	 * Description: The primary key of this object
	 */
	protected void _pk(Wrap<Long> w) {}

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
	 * DisplayName: HTML Element
	 * Description: The HTML element. 
	 */
	protected void _e(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * Stored: true
	 * DisplayName: HTML before
	 * Description: The HTML that comes before the text. 
	 */
	protected void _htmlBefore(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * Stored: true
	 * DisplayName: HTML after
	 * Description: The HTML that comes after the text. 
	 */
	protected void _htmlAfter(Wrap<String> w) {
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
	 * Text: true
	 * Description: The full text search field in the search engine for this record while using autosuggest
	 * DisplayName: text
	 */
	protected void _objectText(Wrap<String> w) { 
	}

	/**
	 * {@inheritDoc}
	 * UniqueKey: true
	 * Description: The unique key for this record in the search engine
	 */
	protected void _id(Wrap<String> w) {
		w.o(String.format("%s_%s", getClass().getSimpleName(), pk));
	}
}
