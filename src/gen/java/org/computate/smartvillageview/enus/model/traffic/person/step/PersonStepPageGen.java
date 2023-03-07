package org.computate.smartvillageview.enus.model.traffic.person.step;

import org.computate.smartvillageview.enus.request.SiteRequestEnUS;
import org.computate.smartvillageview.enus.model.base.BaseModel;
import org.computate.vertx.api.ApiRequest;
import org.computate.smartvillageview.enus.config.ConfigKeys;
import java.util.Optional;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.computate.search.serialize.ComputateLocalDateSerializer;
import org.computate.search.serialize.ComputateLocalDateDeserializer;
import org.computate.search.serialize.ComputateZonedDateTimeSerializer;
import org.computate.search.serialize.ComputateZonedDateTimeDeserializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.math.MathContext;
import org.apache.commons.lang3.math.NumberUtils;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.math.RoundingMode;
import java.util.Map;
import org.computate.smartvillageview.enus.model.traffic.person.step.PersonStepGenPage;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;

/**	
<ol>
0<h3>Suggestions that can generate more code for you: </h3></ol>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these PersonStepPage objects in a RESTful API. 
 * </li><li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class PersonStepPageGen into the class PersonStepPage. 
 * </li>
 * <h3>About the PersonStepPage class and it's generated class PersonStepPageGen&lt;PersonStepGenPage&gt;: </h3>extends PersonStepPageGen
 * <p>
 * This Java class extends a generated Java class PersonStepPageGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStepPage">Find the class PersonStepPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends PersonStepPageGen<PersonStepGenPage>
 * <p>This <code>class PersonStepPage extends PersonStepPageGen&lt;PersonStepGenPage&gt;</code>, which means it extends a newly generated PersonStepPageGen. 
 * The generated <code>class PersonStepPageGen extends PersonStepGenPage</code> which means that PersonStepPage extends PersonStepPageGen which extends PersonStepGenPage. 
 * This generated inheritance is a powerful feature that allows a lot of boiler plate code to be created for you automatically while still preserving inheritance through the power of Java Generic classes. 
 * </p>
 * Api: true
 * ApiTag.enUS: true
 * ApiUri.enUS: null
 * Color: null
 * IconGroup: null
 * IconName: null
 * Indexed: true
 * {@inheritDoc}
 * <p>By adding a class comment "{@inheritDoc}", the PersonStepPage class will inherit the helpful inherited class comments from the super class PersonStepPageGen. 
 * </p>
 * Rows: null
 * Model: true
 * Page: true
 * SuperPage.enUS: null
 * Promise: true
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the PersonStepPage Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
 * </p>
 * <p>
 *   Adding protected void methods beginning with an underscore with a Promise as the only parameter will automatically set `Promise: true`. 
 * </p>
 * <p>
 *   <pre>
 *   
 *   	protected void _promiseBefore(Promise&lt;Void&gt; promise) {
 *   		promise.complete();
 *   	}
 *   </pre>
 * </p>
 * <p>
 *   Java classes with the `Model: true` will automatically set `Promise: true`. 
 * </p>
 * <p>
 *   If a super class of this Java class with `Model: true`, then the child class will also inherit `Promise: true`. 
 * </p>
 * AName.enUS: null
 * <p>
 * Delete the class PersonStepPage in Solr: 
 * curl 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStepPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.traffic.person.step in Solr: 
 * curl 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class PersonStepPageGen<DEV> extends PersonStepGenPage {
	protected static final Logger LOG = LoggerFactory.getLogger(PersonStepPage.class);

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepPersonStepPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepPersonStepPage();
	}

	public Future<Void> promiseDeepPersonStepPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promisePersonStepPage(promise2);
		promise2.future().onSuccess(a -> {
			super.promiseDeepPersonStepGenPage(siteRequest_).onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promisePersonStepPage(Promise<Void> promise) {
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
		return promiseDeepPersonStepPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestPersonStepPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestPersonStepGenPage(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestPersonStepPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainPersonStepPage(v);
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
	public Object obtainPersonStepPage(String var) {
		PersonStepPage oPersonStepPage = (PersonStepPage)this;
		switch(var) {
			default:
				return super.obtainPersonStepGenPage(var);
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
				o = relatePersonStepPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relatePersonStepPage(String var, Object val) {
		PersonStepPage oPersonStepPage = (PersonStepPage)this;
		switch(var) {
			default:
				return super.relatePersonStepGenPage(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetPersonStepPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetPersonStepPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
			default:
				return PersonStepGenPage.staticSetPersonStepGenPage(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchPersonStepPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchPersonStepPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
			default:
				return PersonStepGenPage.staticSearchPersonStepGenPage(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrPersonStepPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrPersonStepPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
			default:
				return PersonStepGenPage.staticSearchStrPersonStepGenPage(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqPersonStepPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqPersonStepPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
			default:
				return PersonStepGenPage.staticSearchFqPersonStepGenPage(entityVar,  siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "PersonStepPage";


	public static String displayNameForClass(String var) {
		return PersonStepPage.displayNamePersonStepPage(var);
	}
	public static String displayNamePersonStepPage(String var) {
		switch(var) {
		default:
			return PersonStepGenPage.displayNamePersonStepGenPage(var);
		}
	}
}
