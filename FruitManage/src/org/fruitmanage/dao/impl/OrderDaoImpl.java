package org.fruitmanage.dao.impl;

import java.util.List;

import org.common.dao.impl.BaseDaoHibernate4;
import org.fruitmanage.dao.OrderDao;
import org.fruitmanage.entity.Order;
import org.fruitmanage.entity.State;
import org.fruitmanage.entity.User;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class OrderDaoImpl extends BaseDaoHibernate4<Order> implements OrderDao{

	@Override
	public List<Order> findOLByUOrderBySIAsc(User user) {
		// TODO Auto-generated method stub
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Order.class);
		criteria.add(Restrictions.eq("user",user));
		criteria.addOrder(org.hibernate.criterion.Order.asc("stateId"));
		@SuppressWarnings("unchecked")
		List<Order> orderList = criteria.list();
		return orderList;
	}

	@Override
	public List<Order> findOrderBySI(Integer id) {
		// TODO Auto-generated method stub
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Order.class);
		criteria.add(Restrictions.eq("stateId", id));
		@SuppressWarnings("unchecked")
		List<Order> orderList = criteria.list();
		return orderList;
	}
}
