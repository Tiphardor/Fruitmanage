package org.fruitmanage.action;

import java.util.List;

import org.fruitmanage.entity.Season;
import org.fruitmanage.jfreechar.JFreeCharService;
import org.fruitmanage.service.FruitService;
import org.fruitmanage.service.SeasonService;
import org.fruitmanage.vo.ViewFruit;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import com.opensymphony.xwork2.ActionSupport;

public class ViewEachSeasonTopCharAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private FruitService fruitService;
	private SeasonService seasonService;
	private Integer id;
	private JFreeChart chart;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public JFreeChart getChart() {
		return chart;
	}
	public void setChart(JFreeChart chart) {
		this.chart = chart;
	}
	public void setFruitService(FruitService fruitService) {
		this.fruitService = fruitService;
	}
	public void setSeasonService(SeasonService seasonService) {
		this.seasonService = seasonService;
	}
	
	public String execute(){
		List<ViewFruit> viewFruitList = fruitService.findTopHotFruitBySeasonId(id);
		Season season = seasonService.findSeasonById(id);
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		for(ViewFruit viewFruit : viewFruitList){
			dataset.addValue(viewFruit.getCalCount(), "数量", viewFruit.getFruitName());
		}
		chart = JFreeCharService.createBarChart(season.getSeasonName()+"水果销量Top3", "销量", season.getSeasonName()+"水果", dataset);
		return SUCCESS;
	}

}
