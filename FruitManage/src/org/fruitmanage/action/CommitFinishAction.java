package org.fruitmanage.action;

import org.fruitmanage.entity.Order;
import org.fruitmanage.service.OrderService;

import com.opensymphony.xwork2.ActionSupport;

public class CommitFinishAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private OrderService orderService;
	private Integer id;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	
	public String execute(){
		Order order = orderService.findOrderById(id);
		order.setStateId(5);
		orderService.updateOrder(order);
		return SUCCESS;
	}
	
}
