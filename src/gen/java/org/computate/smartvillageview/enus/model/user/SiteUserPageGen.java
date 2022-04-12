package org.computate.smartvillageview.enus.model.user;

import org.computate.smartvillageview.enus.model.base.BaseModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.computate.smartvillageview.enus.model.user.SiteUserGenPage;
import org.slf4j.LoggerFactory;
import org.computate.search.serialize.ComputateLocalDateDeserializer;
import java.util.HashMap;
import org.apache.commons.lang3.StringUtils;
import java.text.NumberFormat;
import java.util.ArrayList;
import org.computate.vertx.api.ApiRequest;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.math.RoundingMode;
import org.slf4j.Logger;
import java.math.MathContext;
import io.vertx.core.Promise;
import org.computate.smartvillageview.enus.config.ConfigKeys;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.vertx.core.Future;
import org.computate.search.serialize.ComputateZonedDateTimeDeserializer;
import java.util.Objects;
import org.computate.search.serialize.ComputateLocalDateSerializer;
import io.vertx.core.json.JsonArray;
import java.util.List;
import org.computate.search.wrap.Wrap;
import org.apache.commons.lang3.math.NumberUtils;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.computate.search.serialize.ComputateZonedDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.computate.smartvillageview.enus.request.SiteRequestEnUS;

/**	
 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.user.SiteUserPage">Find the class SiteUserPage in Solr. </a>
 * <br><br>Delete the class SiteUserPage in Solr. </a>
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '<add><delete><query>fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.user.SiteUserPage</query></delete></add>'</pre>
 * <br>
 **/
public abstract class SiteUserPageGen<DEV> extends SiteUserGenPage {
	protected static final Logger LOG = LoggerFactory.getLogger(SiteUserPage.class);

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepSiteUserPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepSiteUserPage();
	}

	public Future<Void> promiseDeepSiteUserPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseSiteUserPage(promise2);
		promise2.future().onSuccess(a -> {
			super.promiseDeepSiteUserGenPage(siteRequest_).onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseSiteUserPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
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

	@Override public Future<Void> promiseDeepForClass(SiteRequestEnUS siteRequest_) {
		return promiseDeepSiteUserPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestSiteUserPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestSiteUserGenPage(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestSiteUserPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainSiteUserPage(v);
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
	public Object obtainSiteUserPage(String var) {
		SiteUserPage oSiteUserPage = (SiteUserPage)this;
		switch(var) {
			default:
				return super.obtainSiteUserGenPage(var);
		}
	}

	///////////////
	// relate //
	///////////////

	@Override public boolean relateForClass(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = relateSiteUserPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateSiteUserPage(String var, Object val) {
		SiteUserPage oSiteUserPage = (SiteUserPage)this;
		switch(var) {
			default:
				return super.relateSiteUserGenPage(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetSiteUserPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetSiteUserPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
			default:
				return SiteUserGenPage.staticSetSiteUserGenPage(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchSiteUserPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchSiteUserPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
			default:
				return SiteUserGenPage.staticSearchSiteUserGenPage(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrSiteUserPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrSiteUserPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
			default:
				return SiteUserGenPage.staticSearchStrSiteUserGenPage(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqSiteUserPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqSiteUserPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
			default:
				return SiteUserGenPage.staticSearchFqSiteUserGenPage(entityVar,  siteRequest_, o);
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "SiteUserPage";


	public static String displayNameForClass(String var) {
		return SiteUserPage.displayNameSiteUserPage(var);
	}
	public static String displayNameSiteUserPage(String var) {
		switch(var) {
		default:
			return SiteUserGenPage.displayNameSiteUserGenPage(var);
		}
	}
}
