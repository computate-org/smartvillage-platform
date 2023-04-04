package org.computate.smartvillageview.enus.model.system.event;

import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.Normalizer;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import javax.imageio.ImageIO;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.computate.search.wrap.Wrap;
import org.computate.smartvillageview.enus.config.ConfigKeys;
import org.computate.smartvillageview.enus.model.base.BaseModel;
import org.computate.smartvillageview.enus.request.SiteRequestEnUS;
import io.vertx.core.Promise;

/**
 * Api: true
 * Page: true
 * SuperPage.enUS: PageLayout
 * Indexed: true
 * SqlOrder: 102
 * Order: 102
 * 
 * ApiTag.enUS: System Event
 * ApiUri.enUS: /api/system-event
 * 
 * ApiMethod: Search
 * ApiMethod: GET
 * ApiMethod: POST
 * ApiMethod: PATCH
 * ApiMethod: PUTImport
 * 
 * ApiMethod: SearchPage
 * Page.SearchPage.enUS: SystemEventPage
 * ApiUri.SearchPage.enUS: /system-event
 * 
 * AName.enUS: a system event
 * Color: 2017-shaded-spruce
 * IconGroup: duotone
 * IconName: square-terminal
 * NameVar: systemEvent
 * 
 * PublicRead: true
 * Role.enUS: SiteAdmin
 * Description: A system event
 */
public class SystemEvent extends SystemEventGen<Object> {

	/**
	 * {@inheritDoc}
	 * Ignore: true
	 * Description: The current request object
	 */
	protected void _siteRequest_(Wrap<SiteRequestEnUS> w) {
	}

	/**
	 * {@inheritDoc}
	 * Ignore: true
	 * Description: An asynchronous method for searching for a computer related to this message
	 */
	protected void _promiseBefore(Promise<Void> promise) {
		promise.complete();
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: type
	 * Description: The system event type
	 * HtmRow: 3
	 * HtmCell: 1
	 * HtmColumn: 2
	 */
	protected void _type(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * Stored: true
	 * Persist: true
	 * DisplayName: message
	 * Description: The system event message
	 * HtmRow: 3
	 * HtmCell: 2
	 * HtmColumn: 3
	 */
	protected void _message(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * Stored: true
	 * Persist: true
	 * DisplayName: message
	 * Description: The system event message
	 * HtmRow: 3
	 * HtmCell: 2
	 * HtmColumn: 3
	 * Val.Started.enUS:Started
	 * Val.Completed.enUS:Completed
	 * Val.Error.enUS:Error
	 */
	protected void _status(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 3
	 * HtmCell: 3
	 * HtmColumn: 4
	 * Facet: true
	 * DisplayName.enUS: completed
	 * FormatHtm: MMM d, yyyy h:mm:ss a
	 * Description: An optional time this event completed
	 */
	protected void _completed(Wrap<ZonedDateTime> w) {
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
	 * HtmRow: 1
	 * HtmCell: 4
	 * HtmColumn: 1
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
	 * HtmRow: 1
	 * HtmCell: 3
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
	 * HtmRow: 4
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName.enUS: imageUri
	 * Description: The page image URI
	 */
	protected void _pageImageUri(Wrap<String> w) {
	}

	/**
	 * Description: The image width
	 */
	protected void _pageImageWidth(Wrap<Integer> w) {
		if(pageImageUri != null) {
			Path path = Paths.get(siteRequest_.getConfig().getString(ConfigKeys.STATIC_PATH), pageImageUri);
			File file = path.toFile();
			if(file.exists()) {
				try {
					BufferedImage img = ImageIO.read(file);
					w.o(img.getWidth());
					setPageImageHeight(img.getHeight());
					setPageImageType(Files.probeContentType(path));
				} catch (Exception ex) {
					ExceptionUtils.rethrow(ex);
				}
			}
		}
	}

	/**
	 * Description: The image height
	 */
	protected void _pageImageHeight(Wrap<Integer> c) {
	}

	/**
	 * Description: The image height
	 */
	protected void _pageImageType(Wrap<String> c) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 2
	 * HtmCell: 1
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
	 * HtmRow: 2
	 * HtmCell: 2
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
	 * DisplayName.enUS: object type
	 * Facet: true
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
	 * HtmColumn: 2
	 * Description: The title of this object
	 */
	protected void _objectTitle(Wrap<String> w) {
		StringBuilder b = new StringBuilder();
		if(message != null)
			b.append(" ").append(message);
		w.o(b.toString());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * VarId: true
	 * HtmRow: 1
	 * HtmCell: 4
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
	 * {@inheritDoc}
	 * Suggested: true
	 * Description: The indexed field in the search engine for this record while using autosuggest
	 * DisplayName: autosuggest
	 */
	protected void _objectSuggest(Wrap<String> w) { 
		StringBuilder b = new StringBuilder();
		if(objectId != null)
			b.append(" ").append(objectId);
		if(objectTitle != null)
			b.append(" ").append(objectTitle);
		w.o(b.toString());
	}

	/**
	 * {@inheritDoc}
	 * Text: true
	 * Persist: true
	 * Description: The full text search field in the search engine for this record while using autosuggest
	 * DisplayName: text
	 */
	protected void _objectText(List<String> l) { 
		if(objectId != null)
			l.add(objectId);
		if(objectTitle != null)
			l.add(objectTitle);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * VarUrlId: true
	 * Description: The link by name for this object in the UI
	 */
	protected void _pageUrlId(Wrap<String> w) {
		if(objectId != null) {
			w.o(String.format("%s", id));
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
		w.o(pageUrlId);
	}

	/**
	 * {@inheritDoc}
	 * UniqueKey: true
	 * Description: The unique key for this record in the search engine
	 */
	protected void _id(Wrap<String> w) {
		w.o(objectId);
	}
}
