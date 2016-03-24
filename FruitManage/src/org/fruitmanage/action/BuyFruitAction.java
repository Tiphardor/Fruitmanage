package org.fruitmanage.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.fruitmanage.entity.User;
import org.fruitmanage.service.FruitService;
import org.fruitmanage.service.UserService;
import org.fruitmanage.vo.ViewFruit;

import com.opensymphony.xwork2.ActionSupport;

public class BuyFruitAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	private FruitService fruitService;
	private UserService userService;
	private Integer id;
	private Float totalPrice = 0F;
	private Integer buyCount;
	private String loginResult;
	private ViewFruit viewFruit;
	private User user;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBuyCount() {
		return buyCount;
	}
	public void setBuyCount(Integer buyCount) {
		this.buyCount = buyCount;
	}
	public String getLoginResult() {
		return loginResult;
	}
	public void setLoginResult(String loginResult) {
		this.loginResult = loginResult;
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public Float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String execute(){
		HttpSession session = (HttpSession)ServletActionContext.getRequest().getSession();
		Integer userId = (Integer)session.getAttribute("id");
		if(userId == null || !(userId > 0)){
			loginResult = "ÇëÏÈµÇÂ¼£¡";
			return "login";
		}
		System.out.println(id);
		System.out.println(buyCount);
		viewFruit = fruitService.findViewFruitById(id);
		user = userService.findUserById(userId);
		totalPrice = buyCount * viewFruit.getFruitPrice();
		return SUCCESS;
	}
}
