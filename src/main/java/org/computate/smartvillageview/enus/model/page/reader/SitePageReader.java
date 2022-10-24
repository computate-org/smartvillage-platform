package org.computate.smartvillageview.enus.model.page.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.Normalizer;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Stack;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.serialize.ComputateZonedDateTimeSerializer;
import org.computate.search.tool.XmlTool;
import org.computate.search.wrap.Wrap;
import org.computate.smartvillageview.enus.config.ConfigKeys;
import org.computate.smartvillageview.enus.request.SiteRequestEnUS;
import org.computate.smartvillageview.enus.model.page.SitePage;
import org.computate.smartvillageview.enus.model.htm.SiteHtm;
import org.computate.vertx.config.ComputateConfigKeys;

import com.github.jknack.handlebars.Context;
import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;

import io.vertx.config.yaml.YamlProcessor;
import io.vertx.core.CompositeFuture;
import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.WorkerExecutor;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.client.WebClient;
import io.vertx.ext.web.templ.handlebars.HandlebarsTemplateEngine;

public class SitePageReader extends SitePageReaderGen<Object> {

	private Pattern PATTERN_HEADER = Pattern.compile("^h\\d+$");

	public SitePageReader(Vertx vertx, WorkerExecutor workerExecutor, SiteRequestEnUS siteRequest, JsonObject config) {
		super();
		setSiteRequest_(siteRequest);
		setConfig(config);
		setVertx(vertx);
		setWorkerExecutor(workerExecutor);
	}

	public SitePageReader() {
	}

	/**
	 * {@inheritDoc}
	 * Ignore: true
	 * Description: The current request object
	 */
	protected void _siteRequest_(Wrap<SiteRequestEnUS> w) {
	}

	protected void _config(Wrap<JsonObject> w) {
		w.o(siteRequest_.getConfig());
	}

	protected void _webClient(Wrap<WebClient> w) {
		w.o(siteRequest_.getWebClient());
	}

	protected void _vertx(Wrap<Vertx> w) {
	}

	protected void _workerExecutor(Wrap<WorkerExecutor> w) {
	}

	protected void _templateEngine(Wrap<HandlebarsTemplateEngine> w) {
	}

	protected void _handlebars(Wrap<Handlebars> w) {
	}

	/**
	 * Description: Import Site HTML data
	 * Val.Complete.enUS:Importing %s data completed. 
	 * Val.Fail.enUS:Importing %s data failed. 
	 */
	public Future<JsonObject> i18nGenerator() {
		Promise<JsonObject> promise = Promise.promise();
		List<String> i18nPaths = Optional.ofNullable(config.getValue(ConfigKeys.I18N_PATHS)).map(v -> v instanceof JsonArray ? (JsonArray)v : new JsonArray(v.toString())).orElse(new JsonArray()).stream().map(o -> o.toString()).collect(Collectors.toList());
		JsonObject i18n = new JsonObject();
		YamlProcessor yamlProcessor = new YamlProcessor();

		i18nGeneratorPath(i18n, yamlProcessor, i18nPaths, 0).onSuccess(i18n2 -> {
			promise.complete(i18n2);
		}).onFailure(ex -> {
			LOG.error(String.format(i18nGeneratorFail, SitePage.CLASS_SIMPLE_NAME), ex);
			promise.fail(ex);
		});
		return promise.future();
	}

	/**
	 * Description: Import page
	 * Val.Complete.enUS:Importing page %s completed. 
	 * Val.Fail.enUS:Importing page %s failed. 
	 */
	private Future<JsonObject> i18nGeneratorPath(JsonObject i18n, YamlProcessor yamlProcessor, List<String> i18nPaths, Integer i) {
		Promise<JsonObject> promise = Promise.promise();
		if(i < i18nPaths.size()) {
			String i18nPath = i18nPaths.get(i);
			vertx.fileSystem().readFile(i18nPath).onSuccess(i18nBuffer -> {
				yamlProcessor.process(vertx, null, i18nBuffer).onSuccess(i18n2 -> {
					JsonObject i18n3 = i18n.copy().mergeIn(i18n2, true);
					i18nGeneratorPath(i18n3, yamlProcessor, i18nPaths, i + 1).onSuccess(i18n4 -> {
						promise.complete(i18n4);
					}).onFailure(ex -> {
						LOG.error(String.format(importSitePageFail, SitePage.CLASS_SIMPLE_NAME), ex);
						promise.fail(ex);
					});
				}).onFailure(ex -> {
					LOG.error(String.format(importSitePageFail, SitePage.CLASS_SIMPLE_NAME), ex);
					promise.fail(ex);
				});
			}).onFailure(ex -> {
				LOG.error(String.format(importSitePageFail, SitePage.CLASS_SIMPLE_NAME), ex);
				promise.fail(ex);
			});
		} else {
			promise.complete(i18n);
		}
		return promise.future();
	}

	/**
	 * Description: Import Site HTML data
	 * Val.Complete.enUS:Importing %s data completed. 
	 * Val.Fail.enUS:Importing %s data failed. 
	 */
	public Future<Void> importDataSitePage() {
		Promise<Void> promise = Promise.promise();
		ZonedDateTime now = ZonedDateTime.now(ZoneId.of(config.getString(ConfigKeys.SITE_ZONE)));
		i18nGenerator().onSuccess(i18n -> {
			List<String> dynamicPagePaths = Optional.ofNullable(config.getValue(ConfigKeys.DYNAMIC_PAGE_PATHS)).map(v -> v instanceof JsonArray ? (JsonArray)v : new JsonArray(v.toString())).orElse(new JsonArray()).stream().map(o -> o.toString()).collect(Collectors.toList());
			List<String> pagePaths = new ArrayList<>();
			dynamicPagePaths.forEach(dynamicPagePath -> {
				try {
					try(Stream<Path> stream = Files.walk(Paths.get(dynamicPagePath))) {
						stream.filter(Files::isRegularFile).filter(p -> p.getFileName().toString().endsWith(".yml")).forEach(path -> {
							pagePaths.add(path.toAbsolutePath().toString());
						});
					}
				} catch(Exception ex) {
					ExceptionUtils.rethrow(ex);
				}
			});
			List<Future> futures = new ArrayList<>();
			YamlProcessor yamlProcessor = new YamlProcessor();
	
			for(String pagePath : pagePaths) {
				futures.add(importSitePage(i18n, yamlProcessor, pagePath));
			}
			CompositeFuture.all(futures).onSuccess(a -> {
				String solrHostName = config.getString(ComputateConfigKeys.SOLR_HOST_NAME);
				Integer solrPort = config.getInteger(ComputateConfigKeys.SOLR_PORT);
				String solrCollection = config.getString(ComputateConfigKeys.SOLR_COLLECTION);
				String solrRequestUri = String.format("/solr/%s/update%s", solrCollection, "?commitWithin=1000&overwrite=true&wt=json");
				String deleteQuery = String.format("classSimpleName_docvalues_string:(%s %s) AND created_docvalues_date:[* TO %s]", SitePage.CLASS_SIMPLE_NAME, SiteHtm.CLASS_SIMPLE_NAME, SiteHtm.staticSearchStrCreated(null, SiteHtm.staticSearchCreated(null, now)));
				String deleteXml = String.format("<delete><query>%s</query></delete>", deleteQuery);
				webClient.post(solrPort, solrHostName, solrRequestUri)
						.putHeader("Content-Type", "text/xml")
						.sendBuffer(Buffer.buffer().appendString(deleteXml))
						.onSuccess(d -> {
					try {
						LOG.info(String.format(importDataSitePageComplete, SitePage.CLASS_SIMPLE_NAME));
						promise.complete();
					} catch(Exception ex) {
						LOG.error(String.format("Could not read response from Solr: http://%s:%s%s", solrHostName, solrPort, solrRequestUri), ex);
						promise.fail(ex);
					}
				}).onFailure(ex -> {
					LOG.error(String.format("Search failed. "), new RuntimeException(ex));
					promise.fail(ex);
				});
			}).onFailure(ex -> {
				LOG.error(String.format(importDataSitePageFail, SitePage.CLASS_SIMPLE_NAME), ex);
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			LOG.error(String.format(importDataSitePageFail, SitePage.CLASS_SIMPLE_NAME), ex);
			promise.fail(ex);
		});
		return promise.future();
	}

	/**
	 * Description: Import page
	 * Val.Complete.enUS:Importing page %s completed. 
	 * Val.Fail.enUS:Importing page %s failed. 
	 */
	private Future<Void> importSitePage(JsonObject i18n, YamlProcessor yamlProcessor, String path) {
		Promise<Void> promise = Promise.promise();
		vertx.fileSystem().readFile(path).onSuccess(buffer -> {
			yamlProcessor.process(vertx, null, buffer).onSuccess(json -> {
				try {
					json.put("i18n", i18n);
					String pageId = StringUtils.substringBeforeLast(StringUtils.substringAfterLast(path, "/"), ".");
					SiteRequestEnUS siteRequest = new SiteRequestEnUS();
					siteRequest.setConfig(config);
					siteRequest.setWebClient(webClient);
					siteRequest.initDeepSiteRequestEnUS(siteRequest);

					json.put("page", new JsonObject()
							.put(SitePage.VAR_siteName, config.getString(ConfigKeys.SITE_NAME))
							.put(SitePage.VAR_siteDisplayName, config.getString(ConfigKeys.SITE_DISPLAY_NAME))
							);

					String[] fieldNames = json.fieldNames().toArray(new String[json.fieldNames().size()]);
					for(Integer i = 0; i < json.size(); i++) {
						String key = fieldNames[i];
						Object o = json.getValue(key);
						if(o instanceof String) {
							try {
								Template template = handlebars.compileInline((String)o);
								Context engineContext = Context.newBuilder(json.getMap()).resolver(templateEngine.getResolvers()).build();
								json.put(key, Buffer.buffer(template.apply(engineContext)).toString());
							} catch (IOException ex) {
								ExceptionUtils.rethrow(ex);
							}
						}
					}

					SitePage page = new SitePage();
					page.setSiteRequest_(siteRequest);
					page.persistForClass(SitePage.VAR_pageId, pageId);
					page.persistForClass(SitePage.VAR_objectTitle, json.getString("title"));
					page.persistForClass(SitePage.VAR_created, ZonedDateTime.now(ZoneId.of(config.getString(ConfigKeys.SITE_ZONE))));
					page.persistForClass(SitePage.VAR_modified, json.getString("created"));
					page.persistForClass(SitePage.VAR_courseNum, json.getInteger(SitePage.VAR_courseNum));
					page.persistForClass(SitePage.VAR_lessonNum, json.getInteger(SitePage.VAR_lessonNum));
					page.persistForClass(SitePage.VAR_author, json.getString("author"));
					page.persistForClass(SitePage.VAR_uri, json.getString("uri"));
					page.persistForClass(SitePage.VAR_pageImageUri, json.getString(SitePage.VAR_pageImageUri));
					page.promiseDeepForClass(siteRequest).onSuccess(a -> {
						try {
							JsonObject importBody = new JsonObject();
							JsonArray importItems = new JsonArray();
							List<Future> futures = new ArrayList<>();
							Stack<String> stack = new Stack<>();
							JsonObject pageBody1 = JsonObject.mapFrom(page);
							json.put("page", pageBody1);

							Optional.ofNullable(json.getString("h1")).ifPresent(val -> {
								try {
									Template template = handlebars.compileInline(val);
									Context engineContext = Context.newBuilder(json.getMap()).resolver(templateEngine.getResolvers()).build();
									page.setH1(Buffer.buffer(template.apply(engineContext)).toString());
								} catch (IOException ex) {
									ExceptionUtils.rethrow(ex);
								}
							});
							Optional.ofNullable(json.getString("h2")).ifPresent(val -> {
								try {
									Template template = handlebars.compileInline(val);
									Context engineContext = Context.newBuilder(json.getMap()).resolver(templateEngine.getResolvers()).build();
									page.setH2(Buffer.buffer(template.apply(engineContext)).toString());
								} catch (IOException ex) {
									ExceptionUtils.rethrow(ex);
								}
							});
			
							stack.push("html");
							stack.push("body");
							Long sequenceNum = 0L;
							for(String htmGroup : json.fieldNames()) {
								if(StringUtils.startsWith(htmGroup, "htm")) {
									JsonArray pageItems = json.getJsonArray(htmGroup);
									sequenceNum = importSiteHtm(page, json, new JsonArray(), stack, pageId, htmGroup, pageItems, futures, sequenceNum);
								}
							}
							JsonObject pageBody2 = JsonObject.mapFrom(page);
							json.put("page", pageBody2);

							CompositeFuture.all(futures).onSuccess(b -> {
								JsonObject pageParams = new JsonObject();
								pageParams.put("body", pageBody2);
								pageParams.put("path", new JsonObject());
								pageParams.put("cookie", new JsonObject());
								pageParams.put("query", new JsonObject().put("commitWithin", 1000).put("q", "*:*").put("var", new JsonArray().add("refresh:false")));
								JsonObject pageContext = new JsonObject().put("params", pageParams);
								JsonObject pageRequest = new JsonObject().put("context", pageContext);
								vertx.eventBus().request(String.format("smartabyar-smartvillage-enUS-%s", SitePage.CLASS_SIMPLE_NAME), pageRequest, new DeliveryOptions().addHeader("action", String.format("putimport%sFuture", SitePage.CLASS_SIMPLE_NAME))).onSuccess(c -> {
									LOG.info(String.format(importSitePageComplete, SitePage.CLASS_SIMPLE_NAME));
									promise.complete();
								}).onFailure(ex -> {
									LOG.error(String.format(importSitePageFail, SitePage.CLASS_SIMPLE_NAME), ex);
									promise.fail(ex);
								});
							}).onFailure(ex -> {
								LOG.error(String.format(importSitePageFail, SitePage.CLASS_SIMPLE_NAME), ex);
								promise.fail(ex);
							});
						} catch(Exception ex) {
							LOG.error(String.format(importSitePageFail, SitePage.CLASS_SIMPLE_NAME), ex);
							promise.fail(ex);
						}
					}).onFailure(ex -> {
						LOG.error(String.format(importSitePageFail, SitePage.CLASS_SIMPLE_NAME), ex);
						promise.fail(ex);
					});
				} catch(Exception ex) {
					LOG.error(String.format(importSitePageFail, SitePage.CLASS_SIMPLE_NAME), ex);
					promise.fail(ex);
				}
			}).onFailure(ex -> {
				LOG.error(String.format(importSitePageFail, SitePage.CLASS_SIMPLE_NAME), ex);
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			LOG.error(String.format(importSitePageFail, SitePage.CLASS_SIMPLE_NAME), ex);
			promise.fail(ex);
		});
		return promise.future();
	}

	private Long importSiteHtm(SitePage page, JsonObject json, JsonArray labels, Stack<String> stack, String pageId, String htmGroup, JsonArray pageItems, List<Future> futures, Long sequenceNum) throws Exception {
		Double sort = 0D;
		for(Integer i = 0; i < pageItems.size(); i++) {
			// Process a page item, one at a time
			JsonObject pageItem = (JsonObject)pageItems.getValue(i);
			String uri = json.getString(SiteHtm.VAR_uri);
			Object in = pageItem.getValue("in");
			String e = pageItem.getString("e");
			JsonArray labels2 = Optional.ofNullable(pageItem.getValue("label")).map(o -> o instanceof JsonArray ? (JsonArray)o : new JsonArray().add(o)).orElse(null);
			JsonArray labels3 = new JsonArray();
			String each = pageItem.getString("each");
			Boolean eNoWrapParent = false;
			Boolean eNoWrap = false;
			String tabs = "";
			String comment = pageItem.getString(SiteHtm.VAR_comment);
			JsonObject a = Optional.ofNullable(pageItem.getJsonObject(SiteHtm.VAR_a)).orElse(new JsonObject());
			Optional.ofNullable(pageItem.getString("class")).ifPresent(val -> a.put("class", val));
			Optional.ofNullable(pageItem.getString("id")).ifPresent(val -> a.put("id", val));
			Optional.ofNullable(pageItem.getString("style")).ifPresent(val -> a.put("style", val));
			Optional.ofNullable(pageItem.getString("src")).ifPresent(val -> a.put("src", val));
			Optional.ofNullable(pageItem.getString("href")).ifPresent(val -> a.put("href", val));

			Boolean addId = false;
			if(e != null) {
				if(e != null && PATTERN_HEADER.matcher(e).find() && a.getString("id") == null) {
					addId = true;
				} else if(stack.size() > 0 && e.equals("span") && PATTERN_HEADER.matcher(stack.peek()).find() && a.getString("id") == null) {
					addId = true;
					e = "a";
				}
			}

			if(e != null) {
				// Stack the element and determine element name, wrap and tabs
				String localNameParent = stack.isEmpty() ? null : stack.peek();
				eNoWrapParent = localNameParent == null || XmlTool.HTML_ELEMENTS_NO_WRAP.contains(localNameParent);
				eNoWrap = localNameParent == null || XmlTool.HTML_ELEMENTS_NO_WRAP.contains(e);
				tabs = String.join("", Collections.nCopies(stack.size(), "\t"));
				stack.push(e);
			} else if(comment != null) {
				tabs = String.join("", Collections.nCopies(stack.size(), "\t"));
			}

			{
				// Import the start of the element
				sequenceNum++;
				JsonObject importItem = new JsonObject();
				if(e != null)
					importItem.put(SiteHtm.VAR_eBefore, e);

				if(comment != null) {
					// Split text by lines and index each line as it's own value
					Template template = handlebars.compileInline(comment);
					Context engineContext = Context.newBuilder(json.getMap()).resolver(templateEngine.getResolvers()).build();
					Buffer buffer = Buffer.buffer(template.apply(engineContext));
					String[] strs = buffer.toString().split("\r?\n");
					importItem.put(SiteHtm.VAR_comment, new JsonArray().addAll(new JsonArray(Arrays.asList(strs))));
					page.addObjectText(strs);
				}

				String text = pageItem.getString(SiteHtm.VAR_text);
				if(text != null) {
					// Split text by lines and index each line as it's own value
					Template template = handlebars.compileInline(text);
					Context engineContext = Context.newBuilder(json.getMap()).resolver(templateEngine.getResolvers()).build();
					Buffer buffer = Buffer.buffer(template.apply(engineContext));
					String text2 = buffer.toString();
					if(text2.contains("{{")) {
						Template template2 = handlebars.compileInline(text2);
						Context engineContext2 = Context.newBuilder(json.getMap()).resolver(templateEngine.getResolvers()).build();
						Buffer buffer2 = Buffer.buffer(template2.apply(engineContext2));
						text2 = buffer2.toString();
					}
					String[] strs = text2.split("\r?\n");
					importItem.put(SiteHtm.VAR_text, new JsonArray().addAll(new JsonArray(Arrays.asList(strs))));
					page.addObjectText(strs);
				}

				if(addId && StringUtils.isNotBlank(text)) {
					String id = toId(text);
					a.put("id", id);
					if("a".equals(e)) {
						a.put("href", String.format("#%s", id));
					}
				}

				String htm = pageItem.getString("htm");
				if(htm != null) {
					// Split text by lines and index each line as it's own value
					Template template = handlebars.compileInline(htm);
					Context engineContext = Context.newBuilder(json.getMap()).resolver(templateEngine.getResolvers()).build();
					Buffer buffer = Buffer.buffer(template.apply(engineContext));
					String htm2 = buffer.toString();
					if(htm2.contains("{{")) {
						Template template2 = handlebars.compileInline(htm2);
						Context engineContext2 = Context.newBuilder(json.getMap()).resolver(templateEngine.getResolvers()).build();
						Buffer buffer2 = Buffer.buffer(template2.apply(engineContext2));
						htm2 = buffer2.toString();
					}
					importItem.put(SiteHtm.VAR_htmBefore, htm2);
				}

				labels3.addAll(labels);
				if(labels2 != null) {
					labels3.addAll(labels2);
				}
				if(labels3.size() > 0) {
					importItem.put(SiteHtm.VAR_labels, labels3);
				}

				if(!eNoWrapParent && !tabs.isEmpty()) {
					importItem.put(SiteHtm.VAR_tabs, tabs);
				}
				if(!eNoWrap) {
					importItem.put(SiteHtm.VAR_newLine, true);
				}
				importItem.put(SiteHtm.VAR_saves, new JsonArray()
						.add(SiteHtm.VAR_eBefore)
						.add(SiteHtm.VAR_a)
						.add(SiteHtm.VAR_htmBefore)
						.add(SiteHtm.VAR_sequenceNum)
						.add(SiteHtm.VAR_htmGroup)
						.add(SiteHtm.VAR_pageId)
						.add(SiteHtm.VAR_tabs)
						.add(SiteHtm.VAR_uri)
						.add(SiteHtm.VAR_text)
						.add(SiteHtm.VAR_labels)
						.add(SiteHtm.VAR_inheritPk)
						);
				importItem.put(SiteHtm.VAR_created, ComputateZonedDateTimeSerializer.ZONED_DATE_TIME_FORMATTER.format(ZonedDateTime.now()));
				importItem.put(SiteHtm.VAR_pageId, pageId);
				importItem.put(SiteHtm.VAR_htmGroup, htmGroup);
				importItem.put(SiteHtm.VAR_sequenceNum, sequenceNum);
				importItem.put(SiteHtm.VAR_uri, uri);
				if(a != null) {
					// Process element attributes
					JsonObject attrs = new JsonObject();
					for(String field : a.fieldNames()) {
						// Get the value of the attribute and process template values before indexing the attribute
						String val = a.getString(field);
						if(val != null) {
							Template template = handlebars.compileInline(val);
							Context engineContext = Context.newBuilder(json.getMap()).resolver(templateEngine.getResolvers()).build();
							Buffer buffer = Buffer.buffer(template.apply(engineContext));
							String val2 = buffer.toString();
							if(val2.contains("{{")) {
								Template template2 = handlebars.compileInline(val2);
								Context engineContext2 = Context.newBuilder(json.getMap()).resolver(templateEngine.getResolvers()).build();
								Buffer buffer2 = Buffer.buffer(template2.apply(engineContext2));
								val2 = buffer2.toString();
							}
							attrs.put(field, val2);
						}
					}
					importItem.put(SiteHtm.VAR_a, attrs);
				}
				importItem.put(SiteHtm.VAR_id, String.format("%s_%s", SiteHtm.CLASS_SIMPLE_NAME, pageId, sequenceNum));
				for(Integer j=1; j <= stack.size(); j++) {
					// Add sort values for the element at each level of the stack
					importItem.put("sort" + j, stack.get(j - 1));
				}
	
				// Add this element import to the list of futures that will all be requested in a CompositeFuture
				JsonObject htmParams = new JsonObject();
				htmParams.put("body", importItem);
				htmParams.put("path", new JsonObject());
				htmParams.put("cookie", new JsonObject());
				htmParams.put("query", new JsonObject().put("commitWithin", 1000).put("q", "*:*").put("var", new JsonArray().add("refresh:false")));
				JsonObject htmContext = new JsonObject().put("params", htmParams);
				JsonObject htmRequest = new JsonObject().put("context", htmContext);
				futures.add(vertx.eventBus().request(String.format("smartabyar-smartvillage-enUS-%s", SiteHtm.CLASS_SIMPLE_NAME), htmRequest, new DeliveryOptions().addHeader("action", String.format("putimport%sFuture", SiteHtm.CLASS_SIMPLE_NAME))));
			}

			if(each != null) {
				// Process the "each" element by evaluating the template and processing the values
				Template template = handlebars.compileInline(String.format("{{json %s }}", each));
				Context engineContext = Context.newBuilder(json.getMap()).resolver(templateEngine.getResolvers()).build();
				String str = template.apply(engineContext);
				String eachVar = pageItem.getString("eachVar", "item");
				String indexVar = pageItem.getString("indexVar", "@index");

				if(in != null) {
					if(StringUtils.startsWith(str, "[")) {
						JsonArray eachArray = new JsonArray(Buffer.buffer(str));
						for(Integer j=0; j < eachArray.size(); j++) {
							JsonObject eachJson = eachArray.getJsonObject(j);
							JsonObject json2 = json.copy();
							json2.put(eachVar, eachJson);
							json2.put(indexVar, j);
							// Process nested elements of the "in" value
							if(in instanceof JsonObject) {
								// Process the nested JsonObject of the "in" value
								sequenceNum = importSiteHtm(page, json2, labels3, stack, pageId, htmGroup, new JsonArray().add(in), futures, sequenceNum);
							} else if(in instanceof JsonArray) {
								// Process the each of the nested JsonObjects in the array of the "in" value
								sequenceNum = importSiteHtm(page, json2, labels3, stack, pageId, htmGroup, (JsonArray)in, futures, sequenceNum);
							}
						}
					} else if(StringUtils.startsWith(str, "{")) {
						JsonObject eachObject = new JsonObject(Buffer.buffer(str)).getJsonObject("map");
						String[] keys = eachObject.fieldNames().toArray(new String[eachObject.fieldNames().size()]);
						for(Integer j=0; j < eachObject.size(); j++) {
							String key = keys[j];
							JsonObject eachJson = eachObject.getJsonObject(key);
							JsonObject json2 = json.copy();
							json2.put(eachVar, new JsonObject().put("key", key).put("value", eachJson));
							json2.put(indexVar, j);
							// Process nested elements of the "in" value
							if(in instanceof JsonObject) {
								// Process the nested JsonObject of the "in" value
								sequenceNum = importSiteHtm(page, json2, labels3, stack, pageId, htmGroup, new JsonArray().add(in), futures, sequenceNum);
							} else if(in instanceof JsonArray) {
								// Process the each of the nested JsonObjects in the array of the "in" value
								sequenceNum = importSiteHtm(page, json2, labels3, stack, pageId, htmGroup, (JsonArray)in, futures, sequenceNum);
							}
						}
					}
				}
				json.remove(eachVar);
			} else {
				if(in != null) {
					// Process nested elements of the "block" value
					if(in instanceof JsonObject) {
						// Process the nested JsonObject of the "block" value
						sequenceNum = importSiteHtm(page, json, labels3, stack, pageId, htmGroup, new JsonArray().add(in), futures, sequenceNum);
					} else if(in instanceof JsonArray) {
						// Process the each of the nested JsonObjects in the array of the "block" value
						sequenceNum = importSiteHtm(page, json, labels3, stack, pageId, htmGroup, (JsonArray)in, futures, sequenceNum);
					}
				}
			}

			if(e != null) {
				// Import the end of the element
				sequenceNum++;
				JsonObject importItem = new JsonObject();
				importItem.put(SiteHtm.VAR_eAfter, e);
				if(!eNoWrap && !tabs.isEmpty()) {
					importItem.put(SiteHtm.VAR_tabs, tabs);
				}
				if(!eNoWrapParent) {
					importItem.put(SiteHtm.VAR_newLine, true);
				}
				if(labels3.size() > 0) {
					importItem.put(SiteHtm.VAR_labels, labels3);
				}
				importItem.put(SiteHtm.VAR_saves, new JsonArray()
						.add(SiteHtm.VAR_eAfter)
						.add(SiteHtm.VAR_htmAfter)
						.add(SiteHtm.VAR_sequenceNum)
						.add(SiteHtm.VAR_htmGroup)
						.add(SiteHtm.VAR_pageId)
						.add(SiteHtm.VAR_tabs)
						.add(SiteHtm.VAR_uri)
						.add(SiteHtm.VAR_labels)
						);
				importItem.put(SiteHtm.VAR_created, ComputateZonedDateTimeSerializer.ZONED_DATE_TIME_FORMATTER.format(ZonedDateTime.now()));
				importItem.put(SiteHtm.VAR_pageId, pageId);
				importItem.put(SiteHtm.VAR_htmGroup, htmGroup);
				importItem.put(SiteHtm.VAR_sequenceNum, sequenceNum);
				importItem.put(SiteHtm.VAR_uri, uri);
				importItem.put(SiteHtm.VAR_id, String.format("%s_%s_%s", SiteHtm.CLASS_SIMPLE_NAME, pageId, sequenceNum));
				for(Integer j=1; j <= stack.size(); j++) {
					importItem.put("sort" + j, stack.get(j - 1));
				}
	
				JsonObject htmParams = new JsonObject();
				htmParams.put("body", importItem);
				htmParams.put("path", new JsonObject());
				htmParams.put("cookie", new JsonObject());
				htmParams.put("query", new JsonObject().put("commitWithin", 1000).put("q", "*:*").put("var", new JsonArray().add("refresh:false")));
				JsonObject htmContext = new JsonObject().put("params", htmParams);
				JsonObject htmRequest = new JsonObject().put("context", htmContext);
				futures.add(vertx.eventBus().request(String.format("smartabyar-smartvillage-enUS-%s", SiteHtm.CLASS_SIMPLE_NAME), htmRequest, new DeliveryOptions().addHeader("action", String.format("putimport%sFuture", SiteHtm.CLASS_SIMPLE_NAME))));
			}

			if(e != null) {
				stack.pop();
			}
		}
		return sequenceNum;
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
}
