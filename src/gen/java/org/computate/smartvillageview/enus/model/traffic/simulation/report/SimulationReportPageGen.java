package org.computate.smartvillageview.enus.model.traffic.simulation.report;

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
import org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReportGenPage;
import java.lang.String;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;

/**	
<ol>
0<h3>Suggestions that can generate more code for you: </h3></ol>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these SimulationReportPage objects in a RESTful API. 
 * </li><li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class SimulationReportPageGen into the class SimulationReportPage. 
 * </li>
 * <h3>About the SimulationReportPage class and it's generated class SimulationReportPageGen&lt;SimulationReportGenPage&gt;: </h3>extends SimulationReportPageGen
 * <p>
 * This Java class extends a generated Java class SimulationReportPageGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReportPage">Find the class SimulationReportPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends SimulationReportPageGen<SimulationReportGenPage>
 * <p>This <code>class SimulationReportPage extends SimulationReportPageGen&lt;SimulationReportGenPage&gt;</code>, which means it extends a newly generated SimulationReportPageGen. 
 * The generated <code>class SimulationReportPageGen extends SimulationReportGenPage</code> which means that SimulationReportPage extends SimulationReportPageGen which extends SimulationReportGenPage. 
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
 * <p>By adding a class comment "{@inheritDoc}", the SimulationReportPage class will inherit the helpful inherited class comments from the super class SimulationReportPageGen. 
 * </p>
 * Rows: null
 * Model: true
 * Page: true
 * SuperPage.enUS: null
 * Promise: true
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the SimulationReportPage Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * Delete the class SimulationReportPage in Solr: 
 * curl 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReportPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.traffic.simulation.report in Solr: 
 * curl 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class SimulationReportPageGen<DEV> extends SimulationReportGenPage {
	protected static final Logger LOG = LoggerFactory.getLogger(SimulationReportPage.class);

	/////////////////////
	// plotPerformance //
	/////////////////////


	/**	 The entity plotPerformance
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String plotPerformance;

	/**	<br> The entity plotPerformance
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReportPage&fq=entiteVar_enUS_indexed_string:plotPerformance">Find the entity plotPerformance in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _plotPerformance(Wrap<String> w);

	public String getPlotPerformance() {
		return plotPerformance;
	}
	public void setPlotPerformance(String o) {
		this.plotPerformance = SimulationReportPage.staticSetPlotPerformance(siteRequest_, o);
	}
	public static String staticSetPlotPerformance(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SimulationReportPage plotPerformanceInit() {
		Wrap<String> plotPerformanceWrap = new Wrap<String>().var("plotPerformance");
		if(plotPerformance == null) {
			_plotPerformance(plotPerformanceWrap);
			setPlotPerformance(plotPerformanceWrap.o);
		}
		return (SimulationReportPage)this;
	}

	public static String staticSearchPlotPerformance(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPlotPerformance(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPlotPerformance(SiteRequestEnUS siteRequest_, String o) {
		return SimulationReportPage.staticSearchStrPlotPerformance(siteRequest_, SimulationReportPage.staticSearchPlotPerformance(siteRequest_, SimulationReportPage.staticSetPlotPerformance(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepSimulationReportPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepSimulationReportPage();
	}

	public Future<Void> promiseDeepSimulationReportPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseSimulationReportPage(promise2);
		promise2.future().onSuccess(a -> {
			super.promiseDeepSimulationReportGenPage(siteRequest_).onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseSimulationReportPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				plotPerformanceInit();
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
		return promiseDeepSimulationReportPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestSimulationReportPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestSimulationReportGenPage(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestSimulationReportPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainSimulationReportPage(v);
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
	public Object obtainSimulationReportPage(String var) {
		SimulationReportPage oSimulationReportPage = (SimulationReportPage)this;
		switch(var) {
			case "plotPerformance":
				return oSimulationReportPage.plotPerformance;
			default:
				return super.obtainSimulationReportGenPage(var);
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
				o = relateSimulationReportPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateSimulationReportPage(String var, Object val) {
		SimulationReportPage oSimulationReportPage = (SimulationReportPage)this;
		switch(var) {
			default:
				return super.relateSimulationReportGenPage(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetSimulationReportPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetSimulationReportPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "plotPerformance":
			return SimulationReportPage.staticSetPlotPerformance(siteRequest_, o);
			default:
				return SimulationReportGenPage.staticSetSimulationReportGenPage(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchSimulationReportPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchSimulationReportPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "plotPerformance":
			return SimulationReportPage.staticSearchPlotPerformance(siteRequest_, (String)o);
			default:
				return SimulationReportGenPage.staticSearchSimulationReportGenPage(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrSimulationReportPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrSimulationReportPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "plotPerformance":
			return SimulationReportPage.staticSearchStrPlotPerformance(siteRequest_, (String)o);
			default:
				return SimulationReportGenPage.staticSearchStrSimulationReportGenPage(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqSimulationReportPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqSimulationReportPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "plotPerformance":
			return SimulationReportPage.staticSearchFqPlotPerformance(siteRequest_, o);
			default:
				return SimulationReportGenPage.staticSearchFqSimulationReportGenPage(entityVar,  siteRequest_, o);
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(Optional.ofNullable(plotPerformance).map(v -> "plotPerformance: \"" + v + "\"\n" ).orElse(""));
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "SimulationReportPage";
	public static final String VAR_plotPerformance = "plotPerformance";

	public static final String DISPLAY_NAME_plotPerformance = "";

	public static String displayNameForClass(String var) {
		return SimulationReportPage.displayNameSimulationReportPage(var);
	}
	public static String displayNameSimulationReportPage(String var) {
		switch(var) {
		case VAR_plotPerformance:
			return DISPLAY_NAME_plotPerformance;
		default:
			return SimulationReportGenPage.displayNameSimulationReportGenPage(var);
		}
	}
}
