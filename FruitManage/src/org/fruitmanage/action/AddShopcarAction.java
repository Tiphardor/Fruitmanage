package org.fruitmanage.action;

import java.util.Date;

import org.apache.struts2.ServletActionContext;
import org.fruitmanage.entity.Fruit;
import org.fruitmanage.entity.Shopcar;
import org.fruitmanage.service.FruitService;
import org.fruitmanage.service.ShopcarService;

import com.opensymphony.xwork2.ActionSupport;

public class AddShopcarAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	private ShopcarService shopcarService;
	private FruitService fruitService;
	private Integer fruitId;
	private Fruit fruit;
	private Shopcar shopcar;
	private Integer buyCount;
	private String loginResult;
	private String addShopcarResult;
	
	public void setShopcarService(ShopcarService shopcarService) {
		this.shopcarService = shopcarService;
	}
	public void setFruitService(FruitService fruitService) {
		this.fruitService = fruitService;
	}

	public Integer getFruitId() {
		return fruitId;
	}
	public void setFruitId(Integer fruitId) {
		this.fruitId = fruitId;
	}
	public Shopcar getShopcar() {
		return shopcar;
	}
	public void setShopcar(Shopcar shopcar) {
		this.shopcar = shopcar;
	}
	public Integer getBuyCount() {
		return buyCount;
	}
	public void setBuyCount(Integer buyCount) {
		this.buyCount = buyCount;
	}
	public Fruit getFruit() {
		return fruit;
	}
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	public String getLoginResult() {
		return loginResult;
	}
	public void setLoginResult(String loginResult) {
		this.loginResult = loginResult;
	}
	public String getAddShopcarResult() {
		return addShopcarResult;
	}
	public void setAddShopcarResult(String addShopcarResult) {
		this.addShopcarResult = addShopcarResult;
	}
	
	public String execute(){
		System.out.println("fruitId------>"+fruitId);
		Integer userId = (Integer)ServletActionContext.getRequest().getSession().getAttribute("id");
		if(userId == null || !(userId > 0)){
			loginResult = "请先登录！";
			return "login";
		}
		System.out.println("userId------>"+userId);
		shopcar = shopcarService.findShopcarByUserIdAndFruitId(userId, fruitId);
		if(shopcar == null || shopcar.getId() <= 0){
			shopcarService.save(shopcar, buyCount,fruitId, userId);
			fruit = fruitService.findFruitById(fruitId);
			fruit.setFruitCount(fruit.getFruitCount() - buyCount);
			fruit.setCalCount(fruit.getCalCount() + buyCount);
			fruitService.updateFruit(fruit);
		}else{
			shopcar.setDate(new Date());
			if(buyCount == null || !(buyCount > 0)){
				buyCount = 1;
			}
			shopcar.setCount(shopcar.getCount() + buyCount);
			fruit = fruitService.findFruitById(fruitId);
			shopcar.setTotalPrice(shopcar.getCount() * fruit.getFruitPrice());
			shopcarService.updateShopcar(shopcar);
			fruit.setFruitCount(fruit.getFruitCount() - buyCount);
			fruit.setCalCount(fruit.getCalCount() + buyCount);
			fruitService.updateFruit(fruit);
		}
		addShopcarResult="成功添加到购物车！";
		return SUCCESS;
	}
}
