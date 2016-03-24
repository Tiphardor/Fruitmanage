package org.fruitmanage.service;

import java.util.List;

import org.fruitmanage.entity.Order;
import org.fruitmanage.vo.ViewOrder;

public interface OrderService {
	public void saveOrder(Order order);
	public List<ViewOrder> findOrderListByUserIdOrderByStateId(Integer userId);
	public List<ViewOrder> findAllOrder();
	public List<ViewOrder> findOrderByStateId(Integer stateId);
	public Order findOrderById(Integer id);
	public void updateOrder(Order order);
}
