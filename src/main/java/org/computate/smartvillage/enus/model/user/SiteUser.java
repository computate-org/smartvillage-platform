/*
 * Copyright (c) 2018-2022 Computate Limited Liability Company in Utah, USA,
 * and the Smarta Byar Smart Village FIWARE IHub. 
 *
 * This program and the accompanying materials are made available under the
 * terms of the GNU GENERAL PUBLIC LICENSE Version 3 which is available at
 * 
 * https://www.gnu.org/licenses/gpl-3.0.en.html
 * 
 * You may not propagate or modify a covered work except as expressly provided 
 * under this License. Any attempt otherwise to propagate or modify it is void, 
 * and will automatically terminate your rights under this License (including 
 * any patent licenses granted under the third paragraph of section 11).
 */
package org.computate.smartvillage.enus.model.user;

import java.util.List;
import org.computate.search.wrap.Wrap;
import org.computate.smartvillage.enus.model.base.BaseModel;
import org.computate.smartvillage.enus.model.user.SiteUserGen;
import org.computate.smartvillage.enus.request.SiteRequestEnUS;
import org.computate.vertx.model.user.ComputateSiteUser;
import org.computate.vertx.request.ComputateSiteRequest;

/**
 * Model: true
 * Api: true
 * Page: true
 * SuperPage.enUS: BaseModelPage
 * Indexed: true
 * SqlOrder: 1
 * Order: 3
 * 
 * ApiTag.enUS: User
 * ApiUri.enUS: /api/user
 * 
 * ApiMethod: Search
 * ApiMethod: PATCH
 * ApiMethod: POST
 * ApiMethod: PUTImport
 * 
 * ApiMethod: SearchPage
 * Page.SearchPage.enUS: SiteUserPage
 * PageSuper.SearchPage.enUS: BaseModelPage
 * ApiUri.SearchPage.enUS: /user
 * 
 * Keyword: classSimpleNameSiteUser
 * Role.enUS: SiteAdmin
 * Filter: userId
 * 
 * AName.enUS: a site user
 * Color: 2017-shaded-spruce
 * IconGroup: regular
 * IconName: user-cog
 * 
 * RoleUser: true
 * Role.enUS: SiteAdmin
 * Description: A user record for each site user
 */
public class SiteUser extends SiteUserGen<BaseModel> implements ComputateSiteUser {

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Description: User keys that relate to this user
	 */
	protected void _userKeys(List<Long> l) {
		l.add(pk);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Description: The unique user ID from the SSO server
	 */
	protected void _userId(Wrap<String> c) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Description: The user's username
	 */
	protected void _userName(Wrap<String> c) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Description: The user's email
	 */
	protected void _userEmail(Wrap<String> c) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Description: The user's first name
	 */
	protected void _userFirstName(Wrap<String> c) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Description: The user's last name
	 */
	protected void _userLastName(Wrap<String> c) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Description: The user's full name
	 */
	protected void _userFullName(Wrap<String> c) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 3
	 * HtmCell: 2
	 * DisplayName.enUS: see archived
	 * Description: A user field allowing a user to see archived records
	 */
	protected void _seeArchived(Wrap<Boolean> c) {
		c.o(false);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 3
	 * HtmCell: 3
	 * DisplayName.enUS: see deleted
	 * Description: A user field allowing a user to see deleted records
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
	public <T extends ComputateSiteRequest> void setSiteRequest_(T siteRequest) {
		siteRequest_ = (SiteRequestEnUS)siteRequest;
	}

	/**
	 * Description: An implementation for the interface to create a new API request object
	 */
	@Override
	public void apiRequestSiteUser() {
		super.apiRequestSiteUser();
	}

}
