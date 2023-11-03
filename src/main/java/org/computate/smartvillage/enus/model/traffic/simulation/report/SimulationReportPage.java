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
package org.computate.smartvillage.enus.model.traffic.simulation.report;

import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.font.TextAttribute;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.AttributedString;
import java.text.MessageFormat;
import java.util.Base64;

import javax.imageio.ImageIO;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.wrap.Wrap;
import org.computate.smartvillage.enus.model.traffic.simulation.report.SimulationReportPageGen;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.XYSeriesLabelGenerator;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.ui.RectangleInsets;
import org.jfree.chart.util.Args;
import org.jfree.chart.util.ShapeUtils;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.json.JsonArray;

/**
 * Promise: true
 **/
public class SimulationReportPage extends SimulationReportPageGen<SimulationReportGenPage> {

	/**
	 * {@inheritDoc}
	 * Stored: true
	 */ 
	protected void _plotPerformance(Wrap<String> w) {
		try {
			if(simulationReport_ != null) {
				JsonArray updatedParameters = simulationReport_.getUpdatedParameters();
				JsonArray updatedPerformance = simulationReport_.getUpdatedPerformance();
				if(updatedPerformance != null && updatedPerformance.size() >= 3 && simulationReport_ != null && updatedParameters != null && updatedPerformance != null) {
					Integer size = updatedPerformance.size();
	
					XYSeries series = new XYSeries("vehicle and pedestrian");
					for(int i = 0; i < updatedPerformance.getJsonArray(0).size(); i++) {
						series.add(i + 1, updatedPerformance.getJsonArray(4).getDouble(i));
					}
					XYSeriesCollection dataset = new XYSeriesCollection(series);
					XYSeries series2 = new XYSeries("only vehicle");
					for(int i = 0; i < updatedPerformance.getJsonArray(0).size(); i++) {
						series2.add(i + 1, updatedPerformance.getJsonArray(2).getDouble(i));
					}
					dataset.addSeries(series2);
					XYSeries series3 = new XYSeries("only pedestrian");
					for(int i = 0; i < updatedPerformance.getJsonArray(0).size(); i++) {
						series3.add(i + 1, updatedPerformance.getJsonArray(3).getDouble(i));
					}
					dataset.addSeries(series3);
	
					// create plot...
					NumberAxis xAxis = new NumberAxis("iterations");
					xAxis.setAutoRangeIncludesZero(false);
					xAxis.setTickUnit(new NumberTickUnit(1));
					NumberAxis yAxis = new NumberAxis("average waiting time(s)");
					yAxis.setAutoRangeIncludesZero(false);
		
					XYLineAndShapeRenderer renderer1 = new XYLineAndShapeRenderer();
					renderer1.setLegendLine(new Line2D.Double(-20.0D, 0.0D, 20.0D, 0.0D));

					renderer1.setSeriesStroke(0, new BasicStroke(2));
					renderer1.setSeriesPaint(0, new Color(31, 119, 180));
					renderer1.setSeriesShape(0, new Ellipse2D.Double(-3, -3, 6, 6));

					renderer1.setSeriesStroke(1, new BasicStroke(2));
					renderer1.setSeriesPaint(1, new Color(255, 127, 14));
					renderer1.setSeriesShape(1, ShapeUtils.createDownTriangle(4));

					renderer1.setSeriesStroke(2, new BasicStroke(2));
					renderer1.setSeriesPaint(2, new Color(44, 160, 44));
					renderer1.setSeriesShape(2, ShapeUtils.createRegularCross(5, 1));
	
					XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer1);
					plot.setBackgroundPaint(Color.WHITE);
					plot.setDomainGridlinePaint(Color.GRAY);
					plot.setRangeGridlinePaint(Color.GRAY);
					plot.setDomainPannable(true);
					plot.setRangePannable(false);
					plot.setDomainCrosshairVisible(true);
					plot.setRangeCrosshairVisible(true);
					plot.setAxisOffset(new RectangleInsets(4, 4, 4, 4));
		
					// create and return the chart panel...
					JFreeChart chart = new JFreeChart("Performance", JFreeChart.DEFAULT_TITLE_FONT, plot, true);
		
					ChartRenderingInfo chartRenderingInfo = new ChartRenderingInfo(new StandardEntityCollection());
					BufferedImage image = chart.createBufferedImage(552, 400, chartRenderingInfo);
		
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					ImageIO.write(image, "png", baos);
					baos.flush();
					byte[] imageInByte = baos.toByteArray();
					baos.close();
		
					String imageStr = new String(Base64.getEncoder().encode(imageInByte), Charset.forName("UTF-8"));
					w.o(imageStr);
				}
			}
		} catch (IOException ex) {
			ExceptionUtils.rethrow(ex);
		}
	}

	/**
	 * {@inheritDoc}
	 * Stored: true
	 */ 
	protected void _plotQueueLengthThreshold(Wrap<String> w) {
		try {
			if(simulationReport_ != null) {
				JsonArray updatedParameters = simulationReport_.getUpdatedParameters();
				JsonArray updatedPerformance = simulationReport_.getUpdatedPerformance();
				if(updatedParameters != null && updatedParameters.size() >= 10 && simulationReport_ != null && updatedParameters != null && updatedPerformance != null) {
					Integer size = updatedPerformance.size();
	
					XYSeries series = new XYSeries("vehicle(West-East)");
					for(int i = 0; i < updatedParameters.getJsonArray(0).size(); i++) {
						series.add(i + 1, updatedParameters.getJsonArray(6).getDouble(i));
					}
					XYSeriesCollection dataset = new XYSeriesCollection(series);
					XYSeries series2 = new XYSeries("vehicle(South-North)");
					for(int i = 0; i < updatedParameters.getJsonArray(0).size(); i++) {
						series2.add(i + 1, updatedParameters.getJsonArray(7).getDouble(i));
					}
					dataset.addSeries(series2);
					XYSeries series3 = new XYSeries("pedestrian(South-North)");
					for(int i = 0; i < updatedParameters.getJsonArray(0).size(); i++) {
						series3.add(i + 1, updatedParameters.getJsonArray(8).getDouble(i));
					}
					dataset.addSeries(series3);
					XYSeries series4 = new XYSeries("pedestrian(West-East)");
					for(int i = 0; i < updatedParameters.getJsonArray(0).size(); i++) {
						series4.add(i + 1, updatedParameters.getJsonArray(9).getDouble(i));
					}
					dataset.addSeries(series4);
	
					// create plot...
					NumberAxis xAxis = new NumberAxis("iterations");
					xAxis.setAutoRangeIncludesZero(false);
					xAxis.setTickUnit(new NumberTickUnit(1));
					NumberAxis yAxis = new NumberAxis("queue content threshold");
					yAxis.setAutoRangeIncludesZero(false);
		
					XYLineAndShapeRenderer renderer1 = new XYLineAndShapeRenderer();
					renderer1.setLegendLine(new Line2D.Double(-20.0D, 0.0D, 20.0D, 0.0D));

					renderer1.setSeriesStroke(0, new BasicStroke(2));
					renderer1.setSeriesPaint(0, new Color(31, 119, 180));
					renderer1.setSeriesShape(0, new Ellipse2D.Double(-3, -3, 6, 6));

					renderer1.setSeriesStroke(1, new BasicStroke(2));
					renderer1.setSeriesPaint(1, new Color(255, 127, 14));
					renderer1.setSeriesShape(1, ShapeUtils.createRegularCross(5, 1));

					renderer1.setSeriesStroke(2, new BasicStroke(2));
					renderer1.setSeriesPaint(2, new Color(44, 160, 44));
					renderer1.setSeriesShape(2, ShapeUtils.createDownTriangle(4));

					renderer1.setSeriesStroke(3, new BasicStroke(2));
					renderer1.setSeriesPaint(3, new Color(214, 39, 40));
					renderer1.setSeriesShape(3, new Ellipse2D.Double(0, 0, 0, 0));
	
					XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer1);
					plot.setBackgroundPaint(Color.WHITE);
					plot.setDomainGridlinePaint(Color.GRAY);
					plot.setRangeGridlinePaint(Color.GRAY);
					plot.setDomainPannable(true);
					plot.setRangePannable(false);
					plot.setDomainCrosshairVisible(true);
					plot.setRangeCrosshairVisible(true);
					plot.setAxisOffset(new RectangleInsets(4, 4, 4, 4));
		
					// create and return the chart panel...
					JFreeChart chart = new JFreeChart("Queue Content Threshold", JFreeChart.DEFAULT_TITLE_FONT, plot, true);
		
					ChartRenderingInfo chartRenderingInfo = new ChartRenderingInfo(new StandardEntityCollection());
					BufferedImage image = chart.createBufferedImage(552, 400, chartRenderingInfo);
		
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					ImageIO.write(image, "png", baos);
					baos.flush();
					byte[] imageInByte = baos.toByteArray();
					baos.close();
		
					String imageStr = new String(Base64.getEncoder().encode(imageInByte), Charset.forName("UTF-8"));
					w.o(imageStr);
				}
			}
		} catch (IOException ex) {
			ExceptionUtils.rethrow(ex);
		}
	}

	/**
	 * {@inheritDoc}
	 * Stored: true
	 */ 
	protected void _plotGreenLengthThresholdVehicle(Wrap<String> w) {
		try {
			if(simulationReport_ != null) {
				JsonArray updatedParameters = simulationReport_.getUpdatedParameters();
				JsonArray updatedPerformance = simulationReport_.getUpdatedPerformance();
				if(updatedParameters != null && updatedParameters.size() >= 4 && simulationReport_ != null && updatedParameters != null && updatedPerformance != null) {
					Integer size = updatedPerformance.size();
	
					AttributedString as = new AttributedString("θ1min");
					as.addAttribute(TextAttribute.SUPERSCRIPT, TextAttribute.SUPERSCRIPT_SUB, 1, 2);
					as.addAttribute(TextAttribute.SUPERSCRIPT, TextAttribute.SUPERSCRIPT_SUPER, 2, 5);
					XYSeries series = new XYSeries("vehicle(West-East)_min");
					for(int i = 0; i < updatedParameters.getJsonArray(0).size(); i++) {
						series.add(i + 1, updatedParameters.getJsonArray(0).getDouble(i));
					}
					XYSeriesCollection dataset = new XYSeriesCollection(series);
					XYSeries series2 = new XYSeries("vehicle(West-East)_max");
					for(int i = 0; i < updatedParameters.getJsonArray(0).size(); i++) {
						series2.add(i + 1, updatedParameters.getJsonArray(1).getDouble(i));
					}
					dataset.addSeries(series2);
					XYSeries series3 = new XYSeries("vehicle(South-North)_min");
					for(int i = 0; i < updatedParameters.getJsonArray(0).size(); i++) {
						series3.add(i + 1, updatedParameters.getJsonArray(2).getDouble(i));
					}
					dataset.addSeries(series3);
					XYSeries series4 = new XYSeries("vehicle(South-North)_max");
					for(int i = 0; i < updatedParameters.getJsonArray(0).size(); i++) {
						series4.add(i + 1, updatedParameters.getJsonArray(3).getDouble(i));
					}
					dataset.addSeries(series4);
	
					// create plot...
					NumberAxis xAxis = new NumberAxis("iterations");
					xAxis.setAutoRangeIncludesZero(false);
					xAxis.setTickUnit(new NumberTickUnit(1));
					NumberAxis yAxis = new NumberAxis("GREEN length threshold");
					yAxis.setAutoRangeIncludesZero(false);
		
					XYLineAndShapeRenderer renderer1 = new XYLineAndShapeRenderer();
					renderer1.setLegendLine(new Line2D.Double(-20.0D, 0.0D, 20.0D, 0.0D));
					LegendItemCollection legendItems = renderer1.getLegendItems();
					legendItems.add(new LegendItem(as, null, null, null,
							new Line2D.Double(2, 0.0, 2, 0.0), 
							new BasicStroke(1), 
							Color.BLUE));

					renderer1.setSeriesStroke(0, new BasicStroke(
							2.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
							, 1.0f, new float[] { 6.0f, 6.0f }, 0.0f)
							);
					renderer1.setSeriesPaint(0, new Color(214, 39, 40));
					renderer1.setSeriesShape(0, new Ellipse2D.Double(0, 0, 0, 0));

					renderer1.setSeriesStroke(1, new BasicStroke(2));
					renderer1.setSeriesPaint(1, new Color(214, 39, 40));
					renderer1.setSeriesShape(1, new Ellipse2D.Double(0, 0, 0, 0));

					renderer1.setSeriesStroke(2, new BasicStroke(
							2.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
							, 1.0f, new float[] { 6.0f, 6.0f }, 0.0f)
							);
					renderer1.setSeriesPaint(2, new Color(44, 160, 44));
					renderer1.setSeriesShape(2, ShapeUtils.createRegularCross(5, 1));

					renderer1.setSeriesStroke(3, new BasicStroke(2));
					renderer1.setSeriesPaint(3, new Color(44, 160, 44));
					renderer1.setSeriesShape(3, ShapeUtils.createRegularCross(5, 1));
	
					XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer1);
					plot.setBackgroundPaint(Color.WHITE);
					plot.setDomainGridlinePaint(Color.GRAY);
					plot.setRangeGridlinePaint(Color.GRAY);
					plot.setDomainPannable(true);
					plot.setRangePannable(false);
					plot.setDomainCrosshairVisible(true);
					plot.setRangeCrosshairVisible(true);
					plot.setAxisOffset(new RectangleInsets(4, 4, 4, 4));
		
					// create and return the chart panel...
					JFreeChart chart = new JFreeChart("Green Length Threshold Vehicle", JFreeChart.DEFAULT_TITLE_FONT, plot, true);
		
					ChartRenderingInfo chartRenderingInfo = new ChartRenderingInfo(new StandardEntityCollection());
					BufferedImage image = chart.createBufferedImage(552, 400, chartRenderingInfo);
		
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					ImageIO.write(image, "png", baos);
					baos.flush();
					byte[] imageInByte = baos.toByteArray();
					baos.close();
		
					String imageStr = new String(Base64.getEncoder().encode(imageInByte), Charset.forName("UTF-8"));
					w.o(imageStr);
				}
			}
		} catch (IOException ex) {
			ExceptionUtils.rethrow(ex);
		}
	}

	/**
	 * {@inheritDoc}
	 * Stored: true
	 */ 
	protected void _plotGreenLengthThresholdPedestrian(Wrap<String> w) {
		try {
			if(simulationReport_ != null) {
				JsonArray updatedParameters = simulationReport_.getUpdatedParameters();
				JsonArray updatedPerformance = simulationReport_.getUpdatedPerformance();
				if(updatedParameters != null && updatedParameters.size() >= 6 && simulationReport_ != null && updatedParameters != null && updatedPerformance != null) {
					Integer size = updatedPerformance.size();
	
					XYSeries series = new XYSeries("pedestrian(South-North)");
					for(int i = 0; i < updatedParameters.getJsonArray(0).size(); i++) {
						series.add(i + 1, updatedParameters.getJsonArray(4).getDouble(i));
					}
					XYSeriesCollection dataset = new XYSeriesCollection(series);
					XYSeries series2 = new XYSeries("pedestrian(West-East)");
					for(int i = 0; i < updatedParameters.getJsonArray(0).size(); i++) {
						series2.add(i + 1, updatedParameters.getJsonArray(5).getDouble(i));
					}
					dataset.addSeries(series2);
	
					// create plot...
					NumberAxis xAxis = new NumberAxis("iterations");
					xAxis.setAutoRangeIncludesZero(false);
					xAxis.setTickUnit(new NumberTickUnit(1));
					NumberAxis yAxis = new NumberAxis("GREEN length threshold");
					yAxis.setAutoRangeIncludesZero(false);
		
					XYLineAndShapeRenderer renderer1 = new XYLineAndShapeRenderer();
					renderer1.setLegendLine(new Line2D.Double(-20.0D, 0.0D, 20.0D, 0.0D));

					renderer1.setSeriesStroke(0, new BasicStroke(2));
					renderer1.setSeriesPaint(0, new Color(31, 119, 180));
					renderer1.setSeriesShape(0, new Ellipse2D.Double(-3, -3, 6, 6));

					renderer1.setSeriesStroke(1, new BasicStroke(2));
					renderer1.setSeriesPaint(1, new Color(255, 127, 14));
					renderer1.setSeriesShape(1, ShapeUtils.createDownTriangle(4));
	
					XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer1);
					plot.setBackgroundPaint(Color.WHITE);
					plot.setDomainGridlinePaint(Color.GRAY);
					plot.setRangeGridlinePaint(Color.GRAY);
					plot.setDomainPannable(true);
					plot.setRangePannable(false);
					plot.setDomainCrosshairVisible(true);
					plot.setRangeCrosshairVisible(true);
					plot.setAxisOffset(new RectangleInsets(4, 4, 4, 4));
		
					// create and return the chart panel...
					JFreeChart chart = new JFreeChart("Green Length Threshold Pedestrian", JFreeChart.DEFAULT_TITLE_FONT, plot, true);
		
					ChartRenderingInfo chartRenderingInfo = new ChartRenderingInfo(new StandardEntityCollection());
					BufferedImage image = chart.createBufferedImage(552, 400, chartRenderingInfo);
		
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					ImageIO.write(image, "png", baos);
					baos.flush();
					byte[] imageInByte = baos.toByteArray();
					baos.close();
		
					String imageStr = new String(Base64.getEncoder().encode(imageInByte), Charset.forName("UTF-8"));
					w.o(imageStr);
				}
			}
		} catch (IOException ex) {
			ExceptionUtils.rethrow(ex);
		}
	}

	@Override
	public Future<Void> promiseDeepSimulationReportPage() {
		Promise<Void> promise = Promise.promise();
		super.promiseDeepSimulationReportGenPage(siteRequest_).onSuccess(b -> {
			Promise<Void> promise2 = Promise.promise();
			promiseSimulationReportPage(promise2);
			promise2.future().onSuccess(a -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}
}
