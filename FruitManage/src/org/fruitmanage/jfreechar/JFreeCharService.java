package org.fruitmanage.jfreechar;

import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

public class JFreeCharService {
	
	public static JFreeChart createPieChart(String title,DefaultPieDataset data){
		JFreeChart pieChart = ChartFactory.createPieChart3D(title, data, true, true, false);
		PiePlot3D piePlot = (PiePlot3D)pieChart.getPlot();
	    piePlot.setBackgroundPaint(Color.WHITE);
		piePlot.setLabelFont(new Font("黑体",Font.BOLD,15));
		resetPlot(piePlot);
		pieChart.getLegend().setItemFont(new Font("黑体",Font.BOLD,15));  //设置引用标签字体
		pieChart.getTitle().setFont(new Font("华文行楷",Font.BOLD,32));	  
		return pieChart;
	}
	
	private static void resetPlot(PiePlot3D pieplot){
		String unitStyle = "{0}={1}({2})";
		pieplot.setNoDataMessage("没有对应的数据，请重新查询");
		pieplot.setNoDataMessageFont(new Font("华文行楷",Font.BOLD,21));
		pieplot.setNoDataMessagePaint(Color.BLUE);
		  
		//设置图例显示样式
		pieplot.setLabelGenerator(new StandardPieSectionLabelGenerator(unitStyle,
				NumberFormat.getNumberInstance(),new DecimalFormat("0.00%")));
		//设置引用标签显示样式
		pieplot.setLegendLabelGenerator(new StandardPieSectionLabelGenerator(unitStyle,
		        NumberFormat.getNumberInstance(),new DecimalFormat("0.00%")));
		 }
	
	public static JFreeChart createBarChart(String title,String categoryAxisLabel,String valueAxisLabel, 
			CategoryDataset dataset){
		JFreeChart barChart = ChartFactory.createBarChart3D(title, categoryAxisLabel, valueAxisLabel, dataset, PlotOrientation.VERTICAL, true, true, false);
		//CategoryPlot plot=(CategoryPlot) barChart.getPlot();
		//Font f = new Font("SansSerif", Font.BOLD, 12);
		//plot.getRangeAxis().setLabelFont(f);
		//plot.getDomainAxis().setLabelFont(f);
		//plot.getDomainAxis().setTickLabelFont(f);
		//barChart.getTitle().setFont(f);
		//barChart.getLegend().setItemFont(f);
		CategoryPlot barPlot = (CategoryPlot)barChart.getPlot();
		barPlot.setBackgroundPaint(Color.WHITE);
		// 设置字体，否则会显示乱码
		Font font = new Font("华文行楷",Font.BOLD,30);
		Font font1 = new Font("宋体",Font.CENTER_BASELINE,15);
		Font font2 = new Font("宋体",Font.CENTER_BASELINE,10);
		TextTitle title1 = barChart.getTitle();
		// 设置标题字体
		title1.setFont(font);
		// 行线的颜色
		barPlot.setRangeGridlinePaint(Color.BLACK);
		// 刻度字体
		barPlot.getDomainAxis().setTickLabelFont(font2);
		// X轴名称字体
		barPlot.getDomainAxis().setLabelFont(font1);
		NumberAxis rangeAxis = (NumberAxis) barPlot.getRangeAxis();
		rangeAxis.setLabelFont(font1);
		barChart.getLegend().setItemFont(font1);
		return barChart;
	}
}
