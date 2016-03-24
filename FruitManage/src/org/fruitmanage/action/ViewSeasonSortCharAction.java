package org.fruitmanage.action;

import java.util.ArrayList;
import java.util.List;

import org.fruitmanage.jfreechar.JFreeCharService;
import org.fruitmanage.service.FruitService;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import com.opensymphony.xwork2.ActionSupport;

public class ViewSeasonSortCharAction extends ActionSupport {
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
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1;i<=5;i++){
			list.add(fruitService.countFruitBySeasonId(i));
		}
	    DefaultPieDataset data = new DefaultPieDataset();
		data.setValue("´º¼¾", list.get(0));
		data.setValue("ÏÄ¼¾", list.get(1));
		data.setValue("Çï¼¾", list.get(2));
		data.setValue("¶¬¼¾", list.get(3));
		data.setValue("È«¼¾", list.get(4));
		chart = JFreeCharService.createPieChart("¼¾½ÚË®¹û±ÈÀýÍ¼", data);
		return SUCCESS;
	}
}
