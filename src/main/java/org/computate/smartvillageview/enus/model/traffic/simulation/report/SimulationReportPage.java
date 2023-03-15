package org.computate.smartvillageview.enus.model.traffic.simulation.report;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Base64;

import javax.imageio.ImageIO;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.wrap.Wrap;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.ui.RectangleInsets;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.json.JsonArray;

/**
 * Translate: false
 **/
public class SimulationReportPage extends SimulationReportPageGen<SimulationReportGenPage> {

	/**   
	 * {@inheritDoc}
	 * Stored: true
	 */ 
	protected void _plotPerformance(Wrap<String> w) {
		try {
			JsonArray updatedParameters = simulationReport_.getUpdatedParameters();
			JsonArray updatedPerformance = simulationReport_.getUpdatedPerformance();
			if(updatedPerformance != null && updatedPerformance.size() >= 3 && simulationReport_ != null && updatedParameters != null && updatedPerformance != null) {
				Integer size = updatedPerformance.size();

				XYSeries series = new XYSeries("vehicle and pedestrian");
				for(int i = 0; i < updatedPerformance.getJsonArray(0).size(); i++) {
					series.add(i + 1, updatedPerformance.getJsonArray(size-1).getDouble(i));
				}
				XYSeriesCollection dataset = new XYSeriesCollection(series);
				XYSeries series2 = new XYSeries("only vehicle");
				for(int i = 0; i < updatedPerformance.getJsonArray(0).size(); i++) {
					series2.add(i + 1, updatedPerformance.getJsonArray(size-3).getDouble(i));
				}
				dataset.addSeries(series2);
				XYSeries series3 = new XYSeries("only pedestrian");
				for(int i = 0; i < updatedPerformance.getJsonArray(0).size(); i++) {
					series3.add(i + 1, updatedPerformance.getJsonArray(size-2).getDouble(i));
				}
				dataset.addSeries(series3);

//				JFreeChart chart = ChartFactory.createXYLineChart(
//						"Performance" // chart title
//						, "iterations" // x axis label
//						, "average waiting time(s)" // y axis label
//						, dataset // data
//						, PlotOrientation.VERTICAL
//						, true // include legend
//						, true // tooltips
//						, false // urls
//						);

				// create plot...
				NumberAxis xAxis = new NumberAxis("iterations");
				xAxis.setAutoRangeIncludesZero(false);
				NumberAxis yAxis = new NumberAxis("average waiting time(s)");
				yAxis.setAutoRangeIncludesZero(false);
	
				XYItemRenderer renderer1 = new XYLineAndShapeRenderer();
				renderer1.setSeriesPaint(0, Color.yellow);
				renderer1.setSeriesPaint(1, Color.red);
				renderer1.setSeriesPaint(2, Color.pink);

				XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer1);
//				XYPlot plot = (XYPlot)chart.getPlot();
//				plot.setBackgroundPaint(Color.WHITE);
//				plot.setDomainGridlinePaint(Color.LIGHT_GRAY);
//				plot.setRangeGridlinePaint(Color.LIGHT_GRAY);
				plot.setDomainPannable(true);
				plot.setRangePannable(false);
				plot.setDomainCrosshairVisible(true);
				plot.setRangeCrosshairVisible(true);
				plot.setAxisOffset(new RectangleInsets(4, 4, 4, 4));
	
				// create and return the chart panel...
				JFreeChart chart = new JFreeChart("Performance", JFreeChart.DEFAULT_TITLE_FONT, plot, true);
				ChartUtils.applyCurrentTheme(chart);
	
				ChartRenderingInfo chartRenderingInfo = new ChartRenderingInfo(new StandardEntityCollection());
				BufferedImage image = chart.createBufferedImage(600, 400, chartRenderingInfo);
	
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				ImageIO.write(image, "png", baos);
				baos.flush();
				byte[] imageInByte = baos.toByteArray();
				baos.close();
	
				String imageStr = new String(Base64.getEncoder().encode(imageInByte), Charset.forName("UTF-8"));
				w.o(imageStr);
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
