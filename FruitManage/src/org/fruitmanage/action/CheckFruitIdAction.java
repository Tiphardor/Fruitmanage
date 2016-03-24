package org.fruitmanage.action;

import org.fruitmanage.entity.Fruit;
import org.fruitmanage.service.FruitService;

import com.opensymphony.xwork2.ActionSupport;

public class CheckFruitIdAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	private String fruitId;
	private Fruit fruit;
	private FruitService fruitService;
	
	public Fruit getFruit() {
		return fruit;
	}
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	public String getFruitId() {
		return fruitId;
	}
	public void setFruitId(String fruitId) {
		this.fruitId = fruitId;
	}
	public void setFruitService(FruitService fruitService) {
		this.fruitService = fruitService;
	}
	
	public String execute(){
		fruit = fruitService.findFruitByFruitId(fruitId);
		return SUCCESS;
	}

}
