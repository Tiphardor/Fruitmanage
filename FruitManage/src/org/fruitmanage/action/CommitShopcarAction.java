package org.fruitmanage.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.fruitmanage.entity.Fruit;
import org.fruitmanage.entity.Order;
import org.fruitmanage.entity.Shopcar;
import org.fruitmanage.entity.User;
import org.fruitmanage.service.OrderService;
import org.fruitmanage.service.ShopcarService;
import org.fruitmanage.service.UserService;
import org.fruitmanage.util.TransShopcarToOrder;

import com.opensymphony.xwork2.ActionSupport;

public class CommitShopcarAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	private OrderService orderService;
	private UserService userService;
	private ShopcarService shopcarService;
	private String idString;
	private Fruit fruit;
	private User user;
	private Shopcar shopcar;
	private String loginResult;
	private String commitResult;
	
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	public void setShopcarService(ShopcarService shopcarService) {
		this.shopcarService = shopcarService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public Shopcar getShopcar() {
		return shopcar;
	}
	public void setShopcar(Shopcar shopcar) {
		this.shopcar = shopcar;
	}
	public Fruit getFruit() {
		return fruit;
	}
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getIdString() {
		return idString;
	}
	public void setIdString(String idString) {
		this.idString = idString;
	}
	public String getLoginResult() {
		return loginResult;
	}
	public void setLoginResult(String loginResult) {
		this.loginResult = loginResult;
	}
	public String getCommitResult() {
		return commitResult;
	}
	public void setCommitResult(String commitResult) {
		this.commitResult = commitResult;
	}
	
	public String execute(){
		Integer userId = (Integer)ServletActionContext.getRequest().getSession().getAttribute("id");
		if(userId == null || !(userId > 0)){
			loginResult = "请先登录！";
			return "login";
		}
		user = userService.findUserById(userId);
		if(idString != null && !(idString.equals(""))){
			List<Integer> ids = new ArrayList<Integer>();
			String [] idsString = idString.split(",");
			for(String id : idsString){
				if(!(id.equals(""))){
					ids.add(Integer.valueOf(id));
				}
			}
			for(Integer id : ids){
				Shopcar shopcar = shopcarService.findShopcarById(id);
				Order order = TransShopcarToOrder.transSToO(shopcar);
				orderService.saveOrder(order);
				shopcarService.deleteShopcar(shopcar);
			}
		}
		commitResult = "结算成功！";
		return SUCCESS;
	}
}
