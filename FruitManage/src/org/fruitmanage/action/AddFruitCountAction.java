package org.fruitmanage.action;

import org.fruitmanage.entity.Fruit;
import org.fruitmanage.service.FruitService;

import com.opensymphony.xwork2.ActionSupport;

public class AddFruitCountAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private FruitService fruitService;
	private Integer id;
	private Integer fruitCount;
	private Fruit fruit;
	private String addResult;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getFruitCount() {
		return fruitCount;
	}
	public void setFruitCount(Integer fruitCount) {
		this.fruitCount = fruitCount;
	}
	public void setFruitService(FruitService fruitService) {
		this.fruitService = fruitService;
	}
	public Fruit getFruit() {
		return fruit;
	}
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	public String getAddResult() {
		return addResult;
	}
	public void setAddResult(String addResult) {
		this.addResult = addResult;
	}
	
	public String execute(){
		fruit = fruitService.findFruitById(id);
		if(fruitCount != null && !(fruitCount.equals(""))){
			fruit.setFruitCount(fruit.getFruitCount() + fruitCount);
			fruitService.updateFruit(fruit);
			setAddResult("添加余量成功!");
		}
		return SUCCESS;
	}
}
