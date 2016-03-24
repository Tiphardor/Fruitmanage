package org.fruitmanage.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.fruitmanage.service.OrderService;
import org.fruitmanage.vo.ViewOrder;

import com.opensymphony.xwork2.ActionSupport;

public class ViewOrderAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private OrderService orderService;
	private List<ViewOrder> viewOrderList;
	private String loginResult;
	private Integer target;
	
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	public List<ViewOrder> getViewOrderList() {
		return viewOrderList;
	}
	public void setViewOrderList(List<ViewOrder> viewOrderList) {
		this.viewOrderList = viewOrderList;
	}
	public String getLoginResult() {
		return loginResult;
	}
	public void setLoginResult(String loginResult) {
		this.loginResult = loginResult;
	}
	public Integer getTarget() {
		return target;
	}
	public void setTarget(Integer target) {
		this.target = target;
	}
	
	public String execute(){
		Integer userId = (Integer)ServletActionContext.getRequest().getSession().getAttribute("id");
		if(userId == null || !(userId > 0)){
			loginResult = "请先登录！";
			if(target != null && target == 1){
				return "loginToM";
			}else{
				return "login";
			}	
		}
		if(target != null && target == 1){
			viewOrderList = orderService.findAllOrder();
			System.out.println("viewOrderList的个数----->"+viewOrderList.size());
			return "viewAllOrder";
		}else{
			viewOrderList = orderService.findOrderListByUserIdOrderByStateId(userId);
			return SUCCESS;
		}
	}
}
