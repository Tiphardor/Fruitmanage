package org.fruitmanage.action;

import java.util.ArrayList;
import java.util.List;

import org.fruitmanage.jfreechar.JFreeCharService;
import org.fruitmanage.service.FruitService;
import org.fruitmanage.vo.ViewFruit;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import com.opensymphony.xwork2.ActionSupport;

public class ViewTopFruitCharAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private FruitService fruitService;
	private JFreeChart chart;
	
	public void setFruitService(FruitService fruitService) {
		this.fruitService = fruitService;
	}
	public JFreeChart getChart() {
		return chart;
	}
	public void setChart(JFreeChart chart) {
		this.chart = chart;
	}
	
	public String execute(){
		List<ViewFruit> viewFruitList = fruitService.findTopHotFruit();
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		for(ViewFruit viewFruit : viewFruitList){
			dataset.addValue(viewFruit.getCalCount(), "数量", viewFruit.getFruitName());
		}
		chart = JFreeCharService.createBarChart("水果销量Top10", "销量", "水果", dataset);
		return SUCCESS;
	}
}
