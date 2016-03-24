package org.fruitmanage.dao.impl;

import java.util.List;

import org.common.dao.impl.BaseDaoHibernate4;
import org.fruitmanage.dao.FruitDao;
import org.fruitmanage.entity.Fruit;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class FruitDaoImpl extends BaseDaoHibernate4<Fruit> implements FruitDao{

	@Override
	public List<Fruit> findAllFruit() {
		// TODO Auto-generated method stub
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Fruit.class);
		@SuppressWarnings("unchecked")
		List<Fruit> fruitList = criteria.list();
		return fruitList;
	}

	@Override
	public List<Fruit> findHotFruit() {
		// TODO Auto-generated method stub
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Fruit.class);
		criteria.addOrder(Order.desc("calCount"));
		@SuppressWarnings("unchecked")
		List<Fruit> hotFruitList = criteria.list();
		return hotFruitList;
	}

	@Override
	public Integer countFruitBySI(Integer seasonId) {
		// TODO Auto-generated method stub
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Fruit.class);
		criteria.add(Restrictions.eq("seasonId", seasonId));
		Integer count = criteria.list().size();
		return count;
	}

	@Override
	public List<Fruit> findHFBySI(Integer seasonId) {
		// TODO Auto-generated method stub
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Fruit.class);
		criteria.add(Restrictions.eq("seasonId", seasonId));
		criteria.addOrder(Order.desc("calCount"));
		@SuppressWarnings("unchecked")
		List<Fruit> hotFruitEachList = criteria.list();
		return hotFruitEachList;
	}

	@Override
	public Fruit findFruitByFI(String fruitId) {
		// TODO Auto-generated method stub
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Fruit.class);
		criteria.add(Restrictions.eq("fruitId", fruitId));
		Fruit fruit = (Fruit)criteria.uniqueResult();
		return fruit;
	}

}
