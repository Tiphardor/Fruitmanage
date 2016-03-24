package org.fruitmanage.action;

import java.util.Date;

import org.apache.struts2.ServletActionContext;
import org.fruitmanage.entity.Fruit;
import org.fruitmanage.entity.Order;
import org.fruitmanage.entity.User;
import org.fruitmanage.service.FruitService;
import org.fruitmanage.service.OrderService;
import org.fruitmanage.service.UserService;

import com.opensymphony.xwork2.ActionSupport;

public class CommitOrderAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private FruitService fruitService;
	private UserService userService;
	private OrderService orderService;
	private Integer fruitId;
	private Integer count;
	private Float totalPrice;
	private User user;
	private Fruit fruit;
	private String orderResult;
	private String loginResult;
	
	public String getOrderResult() {
		return orderResult;
	}
	public void setOrderResult(String orderResult) {
		this.orderResult = orderResult;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Fruit getFruit() {
		return fruit;
	}
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	public void setFruitService(FruitService fruitService) {
		this.fruitService = fruitService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	public Integer getFruitId() {
		return fruitId;
	}
	public void setFruitId(Integer fruitId) {
		this.fruitId = fruitId;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getLoginResult() {
		return loginResult;
	}
	public void setLoginResult(String loginResult) {
		this.loginResult = loginResult;
	}
	
	public String execute(){
		Integer userId = (Integer)ServletActionContext.getRequest().getSession().getAttribute("id");
		if(userId == null || !(userId > 0)){
			loginResult = "请先登录！";
			return "login";
		}
		user = userService.findUserById(userId);
		fruit = fruitService.findFruitById(fruitId);
		Order order = new Order();
		order.setUser(user);
		order.setFruit(fruit);
		order.setCount(count);
		order.setStateId(1);
		order.setTotalPrice(totalPrice);
		order.setDate(new Date());
		orderService.saveOrder(order);
		fruit.setFruitCount(fruit.getFruitCount() - count);
		fruit.setCalCount(fruit.getCalCount() + count);
		fruitService.updateFruit(fruit);
		setOrderResult("订单提交成功！");
		return SUCCESS;
	}
}
