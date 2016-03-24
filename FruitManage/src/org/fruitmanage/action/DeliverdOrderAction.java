package org.fruitmanage.action;

import java.util.List;

import org.fruitmanage.service.OrderService;
import org.fruitmanage.vo.ViewOrder;

import com.opensymphony.xwork2.ActionSupport;

public class DeliverdOrderAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private OrderService orderService;
	private List<ViewOrder> viewOrderList;
	public List<ViewOrder> getViewOrderList() {
		return viewOrderList;
	}
	public void setViewOrderList(List<ViewOrder> viewOrderList) {
		this.viewOrderList = viewOrderList;
	}
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	
	public String execute(){
		viewOrderList = orderService.findOrderByStateId(3);
		return SUCCESS;
	}
}
