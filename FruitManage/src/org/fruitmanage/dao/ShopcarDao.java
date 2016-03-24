package org.fruitmanage.dao;

import java.util.List;

import org.common.dao.BaseDao;
import org.fruitmanage.entity.Fruit;
import org.fruitmanage.entity.Shopcar;
import org.fruitmanage.entity.User;

public interface ShopcarDao extends BaseDao<Shopcar>{
	public List<Shopcar> findShopcarListByUser(User user);
	public Shopcar findShopcarByUAndF(User user,Fruit fruit);
}
