package org.fruitmanage.action;

import java.util.List;

import org.fruitmanage.service.FruitService;
import org.fruitmanage.vo.ViewFruit;

import com.opensymphony.xwork2.ActionSupport;

public class ViewAllFruit extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private FruitService fruitService;
	private List<ViewFruit> viewFruitList;
	private String alterResult;
	private String deleteResult;
	private String addResult;
	public void setFruitService(FruitService fruitService) {
		this.fruitService = fruitService;
	}
	public List<ViewFruit> getViewFruitList() {
		return viewFruitList;
	}
	public void setViewFruitList(List<ViewFruit> viewFruitList) {
		this.viewFruitList = viewFruitList;
	}
	public String getAlterResult() {
		return alterResult;
	}
	public void setAlterResult(String alterResult) {
		this.alterResult = alterResult;
	}
	public String getDeleteResult() {
		return deleteResult;
	}
	public void setDeleteResult(String deleteResult) {
		this.deleteResult = deleteResult;
	}
	public String getAddResult() {
		return addResult;
	}
	public void setAddResult(String addResult) {
		this.addResult = addResult;
	}
	
	public String execute(){
		viewFruitList = fruitService.findAllFruit();
		return SUCCESS;
	}
}
