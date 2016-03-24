package org.fruitmanage.dao.impl;

import java.util.List;

import org.common.dao.impl.BaseDaoHibernate4;
import org.fruitmanage.dao.ShopcarDao;
import org.fruitmanage.entity.Fruit;
import org.fruitmanage.entity.Shopcar;
import org.fruitmanage.entity.User;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class ShopcarDaoImpl extends BaseDaoHibernate4<Shopcar> implements ShopcarDao{

	@Override
	public List<Shopcar> findShopcarListByUser(User user) {
		// TODO Auto-generated method stub
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Shopcar.class);
		criteria.add(Restrictions.eq("user",user));
		@SuppressWarnings("unchecked")
		List<Shopcar> shopcarList = criteria.list();
		return shopcarList;
	}

	@Override
	public Shopcar findShopcarByUAndF(User user, Fruit fruit) {
		// TODO Auto-generated method stub
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Shopcar.class)
				//.createCriteria("fruit")
				.add(Restrictions.eq("fruit",fruit))
				//.createCriteria("user")
				.add(Restrictions.eq("user",user));
		Shopcar shopcar = (Shopcar)criteria.uniqueResult();
		return shopcar;
	}

}
