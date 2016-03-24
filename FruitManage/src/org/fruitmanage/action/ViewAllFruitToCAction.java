package org.fruitmanage.action;

import java.util.List;

import org.fruitmanage.service.FruitService;
import org.fruitmanage.vo.ViewFruit;

import com.opensymphony.xwork2.ActionSupport;

public class ViewAllFruitToCAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private FruitService fruitService;
	private List<ViewFruit> viewFruitList;
	private List<ViewFruit> hotViewFruitList;
	private String addShopcarResult;
	private String orderResult;
	
	public List<ViewFruit> getHotViewFruitList() {
		return hotViewFruitList;
	}
	public void setHotViewFruitList(List<ViewFruit> hotViewFruitList) {
		this.hotViewFruitList = hotViewFruitList;
	}
	public List<ViewFruit> getViewFruitList() {
		return viewFruitList;
	}
	public void setViewFruitList(List<ViewFruit> viewFruitList) {
		this.viewFruitList = viewFruitList;
	}
	public void setFruitService(FruitService fruitService) {
		this.fruitService = fruitService;
	}
	public String getAddShopcarResult() {
		return addShopcarResult;
	}
	public void setAddShopcarResult(String addShopcarResult) {
		this.addShopcarResult = addShopcarResult;
	}
	public String getOrderResult() {
		return orderResult;
	}
	public void setOrderResult(String orderResult) {
		this.orderResult = orderResult;
	}
	
	public String execute(){
		String sql = "from Fruit";
		int pageNo = 1;
		int pageSize = 20;
		viewFruitList = fruitService.findAllFruitByPage(sql, pageNo, pageSize);
		hotViewFruitList = fruitService.findTopHotFruit();
		return SUCCESS;
	}
}
