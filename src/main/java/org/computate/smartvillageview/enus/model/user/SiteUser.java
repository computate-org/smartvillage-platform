package org.computate.smartvillageview.enus.model.user;

import java.util.List;

import org.computate.search.wrap.Wrap;
import org.computate.vertx.model.user.ComputateVertxSiteUser;
import org.computate.vertx.request.ComputateVertxSiteRequest;
import org.computate.smartvillageview.enus.model.base.BaseModel;
import org.computate.smartvillageview.enus.request.SiteRequestEnUS;

/**
 * Model: true
 * Api: true
 * Page: true
 * SuperPage.enUS: BaseModelPage
 * Indexed: true
 * Map.Integer.sqlSort: 1
 * 
 * ApiTag.enUS: User
 * ApiUri.enUS: /api/user
 * 
 * ApiMethod.enUS: Search
 * ApiMethod: PATCH
 * ApiMethod: POST
 * ApiMethod: PUTImport
 * 
 * ApiMethod.enUS: SearchPage
 * PageSearchPage.enUS: SiteUserPage
 * PageSuperSearchPage.enUS: BaseModelPage
 * ApiUriSearchPage.enUS: /user
 * 
 * Keyword: classSimpleNameSiteUser
 * Role.enUS: SiteAdmin
 * Filter: userId
 * Saves: true
 * 
 * AName.enUS: a site user
 * Color: gray
 * IconGroup: regular
 * IconName: user-cog
 * NameVar.enUS: user
 * 
 * RoleUser: true
 * Role.enUS: SiteAdmin
 */
public class SiteUser extends SiteUserGen<BaseModel> implements ComputateVertxSiteUser {

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 */
	protected void _userKeys(List<Long> l) {
		l.add(pk);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 */
	protected void _userId(Wrap<String> c) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 */
	protected void _userName(Wrap<String> c) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 */
	protected void _userEmail(Wrap<String> c) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 */
	protected void _userFirstName(Wrap<String> c) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 */
	protected void _userLastName(Wrap<String> c) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 */
	protected void _userFullName(Wrap<String> c) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 3
	 * HtmlCell: 2
	 * DisplayName.enUS: see archived
	 */
	protected void _seeArchived(Wrap<Boolean> c) {
		c.o(false);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 3
	 * HtmlCell: 3
	 * DisplayName.enUS: see deleted
	 */
	protected void _seeDeleted(Wrap<Boolean> c) {
		c.o(false);
	}

	/**
	 * Description: An implementation for the interface for the object title
	 */
	@Override
	protected void _objectTitle(Wrap<String> c) {
		c.o(String.format("%s (%s) <%s>", userFullName, userName, userEmail));
	}

	/**
	 * Description: An implementation for the interface to set the request object
	 */
	@Override
	public <T extends ComputateVertxSiteRequest> void setSiteRequest_(T siteRequest) {
		siteRequest_ = (SiteRequestEnUS)siteRequest;
	}

	/**
	 * Description: An implementation for the interface to create a new API request object
	 */
	@Override
	public void apiRequestSiteUser() {
		apiRequestSiteUser();
	}
}
