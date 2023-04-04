package org.computate.smartvillageview.enus.model.page;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.Normalizer;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

import javax.imageio.ImageIO;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.computate.search.wrap.Wrap;
import org.computate.smartvillageview.enus.config.ConfigKeys;
import org.computate.smartvillageview.enus.model.base.BaseModel;
import org.computate.smartvillageview.enus.result.base.BaseResult;
import org.computate.smartvillageview.enus.request.SiteRequestEnUS;

import io.vertx.core.Promise;


/**
 * Api: true
 * Page: true
 * SuperPage.enUS: BaseResultPage
 * Indexed: true
 * SqlOrder: 100
 * Order: 100
 * 
 * ApiTag.enUS: Page
 * ApiUri.enUS: /api/page
 * 
 * ApiMethod: Search
 * ApiMethod: GET
 * ApiMethod: POST
 * ApiMethod: PATCH
 * ApiMethod: PUTImport
 * 
 * ApiMethod: SearchPage
 * Page.SearchPage.enUS: SitePagePage
 * ApiUri.SearchPage.enUS: /page
 * 
 * AName.enUS: an article
 * Color: 2017-shaded-spruce
 * IconGroup: duotone
 * IconName: newspaper
 * 
 * Sort.desc: courseNum
 * Sort.desc: lessonNum
 * 
 * PublicRead: true
 * Role.enUS: SiteAdmin
 * Description: An article in the site. 
 */
public class SitePage extends SitePageGen<BaseResult> {

	/**
	 * {@inheritDoc}
	 */
	protected void _githubOrg(Wrap<String> w) {
		w.o(siteRequest_.getConfig().getString(ConfigKeys.GITHUB_ORG));
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _siteName(Wrap<String> w) {
		w.o(siteRequest_.getConfig().getString(ConfigKeys.SITE_NAME));
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _siteDisplayName(Wrap<String> w) {
		w.o(siteRequest_.getConfig().getString(ConfigKeys.SITE_DISPLAY_NAME));
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _sitePublicUrl(Wrap<String> w) {
		w.o(siteRequest_.getConfig().getString(ConfigKeys.SITE_PUBLIC_URL));
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _mailingListUrl(Wrap<String> w) {
		w.o(siteRequest_.getConfig().getString(ConfigKeys.MAILING_LIST_URL));
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _quayioOrg(Wrap<String> w) {
		w.o(siteRequest_.getConfig().getString(ConfigKeys.QUAYIO_ORG));
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _sitePomGroupId(Wrap<String> w) {
		w.o(siteRequest_.getConfig().getString(ConfigKeys.SITE_POM_GROUP_ID));
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _staticBaseUrl(Wrap<String> w) {
		w.o(siteRequest_.getConfig().getString(ConfigKeys.STATIC_BASE_URL));
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _staticPath(Wrap<String> w) {
		w.o(siteRequest_.getConfig().getString(ConfigKeys.STATIC_PATH));
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _siteBaseUrl(Wrap<String> w) {
		w.o(siteRequest_.getConfig().getString(ConfigKeys.SITE_BASE_URL));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Facet: true
	 * DisplayName: Course Number
	 * Description: The course number for this page. 
	 */
	protected void _courseNum(Wrap<Integer> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Facet: true
	 * DisplayName: Lesson Number
	 * Description: The lesson number for this page. 
	 */
	protected void _lessonNum(Wrap<Integer> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 3
	 * HtmCell: 2
	 * HtmColumn: 4
	 * Facet: true
	 * DisplayName: URL
	 * Description: The URL for this page. 
	 */
	protected void _url(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 3
	 * HtmCell: 2
	 * Facet: true
	 * DisplayName: URI
	 * Description: The relative URI for this page. 
	 */
	protected void _uri(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 3
	 * HtmCell: 1
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
	 * DisplayName: header 1
	 * Description: The 1st header of this page. 
	 */
	protected void _h1(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: header 2
	 * Description: The 2nd header of this page. 
	 */
	protected void _h2(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 3
	 * HtmCell: 3
	 * Facet: true
	 * DisplayName.enUS: author
	 * Description: The author
	 */
	protected void _author(Wrap<String> w) {
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

	@Override
	protected void _objectTitle(Wrap<String> w) {
		StringBuilder b = new StringBuilder();
		if(h1 != null)
			b.append(" ").append(h1);
		if(h2 != null)
			b.append(" ").append(h2);
		w.o(b.toString());
	}

	@Override
	protected void _objectId(Wrap<String> w) {
		w.o(String.format("%s_%s", SitePage.CLASS_SIMPLE_NAME, pageId));
	}

	@Override
	protected void _id(Wrap<String> w) {
		w.o(String.format("%s_%s", SitePage.CLASS_SIMPLE_NAME, pageId));
	}

	@Override
	protected void _pageUrlId(Wrap<String> w) {
		w.o(url);
	}

	@Override
	protected void _pageUrlPk(Wrap<String> w) {
		w.o(url);
	}
}
