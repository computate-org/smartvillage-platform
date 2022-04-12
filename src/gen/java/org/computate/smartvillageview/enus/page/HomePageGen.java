package org.computate.smartvillageview.enus.page;

import org.computate.smartvillageview.enus.model.base.BaseModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
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
import org.computate.smartvillageview.enus.page.PageLayout;
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
 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.HomePage">Find the class HomePage in Solr. </a>
 * <br><br>Delete the class HomePage in Solr. </a>
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '<add><delete><query>fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.page.HomePage</query></delete></add>'</pre>
 * <br>
 **/
public abstract class HomePageGen<DEV> extends PageLayout {
	protected static final Logger LOG = LoggerFactory.getLogger(HomePage.class);

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepHomePage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepHomePage();
	}

	public Future<Void> promiseDeepHomePage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseHomePage(promise2);
		promise2.future().onSuccess(a -> {
			super.promiseDeepPageLayout(siteRequest_).onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseHomePage(Promise<Void> promise) {
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
		return promiseDeepHomePage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestHomePage(SiteRequestEnUS siteRequest_) {
			super.siteRequestPageLayout(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestHomePage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainHomePage(v);
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
	public Object obtainHomePage(String var) {
		HomePage oHomePage = (HomePage)this;
		switch(var) {
			default:
				return super.obtainPageLayout(var);
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
				o = relateHomePage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateHomePage(String var, Object val) {
		HomePage oHomePage = (HomePage)this;
		switch(var) {
			default:
				return super.relatePageLayout(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetHomePage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetHomePage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
			default:
				return PageLayout.staticSetPageLayout(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchHomePage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchHomePage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
			default:
				return PageLayout.staticSearchPageLayout(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrHomePage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrHomePage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
			default:
				return PageLayout.staticSearchStrPageLayout(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqHomePage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqHomePage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
			default:
				return PageLayout.staticSearchFqPageLayout(entityVar,  siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "HomePage";


	public static String displayNameForClass(String var) {
		return HomePage.displayNameHomePage(var);
	}
	public static String displayNameHomePage(String var) {
		switch(var) {
		default:
			return PageLayout.displayNamePageLayout(var);
		}
	}
}
