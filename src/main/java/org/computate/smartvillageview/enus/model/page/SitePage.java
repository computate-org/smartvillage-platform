package org.computate.smartvillageview.enus.model.page;

import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.imageio.ImageIO;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.wrap.Wrap;
import org.computate.smartvillageview.enus.config.ConfigKeys;
import org.computate.smartvillageview.enus.result.base.BaseResult;

/**
 * Api: true
 * Page: true
 * SuperPage.enUS: BaseResultPage
 * Indexed: true
 * Map.Integer.sqlSort: 100
 * Map.Integer.classSort: 100
 * 
 * ApiTag.enUS: Page
 * ApiUri.enUS: /api/page
 * 
 * ApiMethod.enUS: Search
 * ApiMethod: GET
 * ApiMethod: POST
 * ApiMethod: PATCH
 * ApiMethod: PUTImport
 * 
 * ApiMethod.enUS: SearchPage
 * Page.SearchPage.enUS: SitePagePage
 * ApiUri.SearchPage.enUS: /page
 * 
 * AName.enUS: an article
 * Color: 2017-navy-peony
 * IconGroup: duotone
 * IconName: newspaper
 * NameVar: page
 * 
 * Sort.asc: courseNum
 * Sort.asc: lessonNum
 * 
 * PublicRead: true
 * Role.enUS: SiteAdmin
 * Description: An article in the site. 
 */
public class SitePage extends SitePageGen<BaseResult> {

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
	 * HtmlRow: 3
	 * HtmlCell: 2
	 * HtmlColumn: 4
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
	 * HtmlRow: 3
	 * HtmlCell: 1
	 * Facet: true
	 * DisplayName: Page ID
	 * Description: The ID for this page. 
	 */
	protected void _pageId(Wrap<String> w) {
		if(uri != null)
			w.o(StringUtils.substringAfterLast(uri, "/"));
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
	 * HtmlRow: 3
	 * HtmlCell: 3
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
	 * HtmlRow: 4
	 * HtmlCell: 1
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
}
