package org.fruitmanage.action;

import org.fruitmanage.service.FruitService;
import org.fruitmanage.vo.ViewFruit;

import com.opensymphony.xwork2.ActionSupport;

public class TransToFruitToC extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private FruitService fruitService;
	private ViewFruit viewFruit;
	private Integer id;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public ViewFruit getViewFruit() {
		return viewFruit;
	}
	public void setViewFruit(ViewFruit viewFruit) {
		this.viewFruit = viewFruit;
	}
	public void setFruitService(FruitService fruitService) {
		this.fruitService = fruitService;
	}
	
	public String execute(){
		System.out.println("id------->"+id);
		viewFruit = fruitService.findViewFruitById(id);
		return SUCCESS;
	}
}
