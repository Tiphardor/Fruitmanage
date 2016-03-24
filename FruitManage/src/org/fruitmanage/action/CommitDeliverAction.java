package org.fruitmanage.action;

import org.fruitmanage.entity.Order;
import org.fruitmanage.service.OrderService;

import com.opensymphony.xwork2.ActionSupport;

public class CommitDeliverAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private OrderService orderService;
	private Integer id;

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String execute(){
		Order order = orderService.findOrderById(id);
		order.setStateId(3);
		orderService.updateOrder(order);
		
		return SUCCESS;
	}
}
