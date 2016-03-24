package org.fruitmanage.service;

import java.io.Serializable;
import java.util.List;

import org.fruitmanage.entity.Fruit;
import org.fruitmanage.entity.Season;
import org.fruitmanage.vo.ViewFruit;

public interface FruitService {
	public Serializable addFruit(Fruit fruit);
	public Season findSeasonById(Integer id);
	public List<ViewFruit> findAllFruit();
	public Fruit findFruitById(Integer id);
	public void updateFruit(Fruit fruit);
	public void deleteFruitById(Integer id);
	public ViewFruit findViewFruitById(Integer id);
	public List<ViewFruit> findAllFruitByPage(String sql,int pageNo, int pageSize);
	public List<ViewFruit> findTopHotFruit();
	public Integer countFruitBySeasonId(Integer seasonId);
	public List<ViewFruit> findTopHotFruitBySeasonId(Integer seasonId);
	public Fruit findFruitByFruitId(String fruitId);
}
