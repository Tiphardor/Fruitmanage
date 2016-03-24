package org.fruitmanage.action;

import org.fruitmanage.entity.Fruit;
import org.fruitmanage.service.FruitService;
import org.fruitmanage.service.ShopcarService;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteShopcarAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	private ShopcarService shopcarService;
	private FruitService fruitService;
	private Integer id;
	private Integer fruitId;
	private Fruit fruit;
	private Integer buyCount;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getFruitId() {
		return fruitId;
	}
	public void setFruitId(Integer fruitId) {
		this.fruitId = fruitId;
	}
	public void setShopcarService(ShopcarService shopcarService) {
		this.shopcarService = shopcarService;
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
	public Integer getBuyCount() {
		return buyCount;
	}
	public void setBuyCount(Integer buyCount) {
		this.buyCount = buyCount;
	}
	
	public String execute(){
		System.out.println("id--->"+id);
		System.out.println("fruitId--->"+fruitId);
		fruit = fruitService.findFruitById(fruitId);
		fruit.setFruitCount(fruit.getFruitCount() + buyCount);
		fruitService.updateFruit(fruit);
		shopcarService.deleteShopcarById(id);
		return SUCCESS;
	}
}
