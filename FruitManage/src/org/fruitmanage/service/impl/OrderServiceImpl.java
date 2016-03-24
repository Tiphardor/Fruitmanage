package org.fruitmanage.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.fruitmanage.dao.OrderDao;
import org.fruitmanage.dao.StateDao;
import org.fruitmanage.dao.UserDao;
import org.fruitmanage.entity.Order;
import org.fruitmanage.entity.State;
import org.fruitmanage.entity.User;
import org.fruitmanage.service.OrderService;
import org.fruitmanage.vo.ViewOrder;


public class OrderServiceImpl implements OrderService{
	
	private OrderDao orderDao;
	private StateDao stateDao;
	private UserDao userDao;
	
	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}
	public void setStateDao(StateDao stateDao) {
		this.stateDao = stateDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public void saveOrder(Order order) {
		// TODO Auto-generated method stub
		orderDao.save(order);
	}
	@Override
	public List<ViewOrder> findOrderListByUserIdOrderByStateId(Integer userId) {
		// TODO Auto-generated method stub
		User user = userDao.get(User.class, userId);
		List<Order> orderList = orderDao.findOLByUOrderBySIAsc(user);
		List<ViewOrder> viewOrderList = new ArrayList<ViewOrder>();
		for(Order order : orderList){
			viewOrderList.add(initOrder(order));
		}
		return viewOrderList;
	}
	
	@Override
	public List<ViewOrder> findAllOrder() {
		// TODO Auto-generated method stub
		List<Order> orderList = orderDao.findAll(Order.class);
		List<ViewOrder> viewOrderList = new ArrayList<ViewOrder>();
		for(Order order : orderList){
			viewOrderList.add(initOrder(order));
		}
		return viewOrderList;
	}
	
	@Override
	public List<ViewOrder> findOrderByStateId(Integer stateId) {
		// TODO Auto-generated method stub
		List<Order> orderList = orderDao.findOrderBySI(stateId);
		List<ViewOrder> viewOrderList = new ArrayList<ViewOrder>();
		for(Order order : orderList){
			viewOrderList.add(initOrder(order));
		}
		return viewOrderList;
	}
	
	@Override
	public Order findOrderById(Integer id) {
		// TODO Auto-generated method stub
		Order order = orderDao.get(Order.class, id);
		return order;
	}
	
	@Override
	public void updateOrder(Order order) {
		// TODO Auto-generated method stub
		orderDao.update(order);
	}
	
	public ViewOrder initOrder(Order order){
		ViewOrder viewOrder = new ViewOrder();
		viewOrder.setId(order.getId());
		viewOrder.setUserId(order.getUser().getId());
		viewOrder.setFruitId(order.getFruit().getId());
		viewOrder.setStateId(order.getStateId());
		viewOrder.setFruitLongName(order.getFruit().getFruitLongName());
		viewOrder.setFruitPrice(order.getFruit().getFruitPrice());
		viewOrder.setCount(order.getCount());
		viewOrder.setTotalPrice(order.getTotalPrice());
		State state = stateDao.get(State.class, order.getStateId());
		viewOrder.setStateDes(state.getStateDes());
		viewOrder.setImageUrl(order.getFruit().getImageUrl());
		Date date = order.getDate();
		if(date != null){
			String [] dates = date.toString().split(" ");
			viewOrder.setDate(dates[0]);
		}else{
			viewOrder.setDate("-");
		}
		viewOrder.setUserName(order.getUser().getUserName());
		return viewOrder; 
	}
	
}
