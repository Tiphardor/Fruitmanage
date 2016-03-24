package org.fruitmanage.dao;

import java.util.List;

import org.common.dao.BaseDao;
import org.fruitmanage.entity.Order;
import org.fruitmanage.entity.User;

public interface OrderDao extends BaseDao<Order>{
	public List<Order> findOLByUOrderBySIAsc(User user);
	public List<Order> findOrderBySI(Integer id);
}
