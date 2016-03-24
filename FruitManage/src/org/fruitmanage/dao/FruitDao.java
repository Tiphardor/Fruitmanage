package org.fruitmanage.dao;

import java.util.List;

import org.common.dao.BaseDao;
import org.fruitmanage.entity.Fruit;

public interface FruitDao extends BaseDao<Fruit>{
	public List<Fruit> findAllFruit();
	public List<Fruit> findHotFruit();
	public Integer countFruitBySI(Integer seasonId);
	public List<Fruit> findHFBySI(Integer seasonId);
	public Fruit findFruitByFI(String fruitId);
}
