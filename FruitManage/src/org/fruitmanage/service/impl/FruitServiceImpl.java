package org.fruitmanage.service.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.fruitmanage.dao.FruitDao;
import org.fruitmanage.dao.SeasonDao;
import org.fruitmanage.entity.Fruit;
import org.fruitmanage.entity.Season;
import org.fruitmanage.service.FruitService;
import org.fruitmanage.vo.ViewFruit;

public class FruitServiceImpl implements FruitService{

	private FruitDao fruitDao;
	private SeasonDao seasonDao;
	public void setFruitDao(FruitDao fruitDao) {
		this.fruitDao = fruitDao;
	}
	public void setSeasonDao(SeasonDao seasonDao) {
		this.seasonDao = seasonDao;
	}

	@Override
	public Serializable addFruit(Fruit fruit) {
		// TODO Auto-generated method stub
		Serializable serialiable = fruitDao.save(fruit);
		return serialiable;
	}

	@Override
	public Season findSeasonById(Integer id) {
		// TODO Auto-generated method stub
		Season season = seasonDao.get(Season.class, id);
		return season;
	}
	@Override
	public List<ViewFruit> findAllFruit() {
		// TODO Auto-generated method stub
		List<Fruit> fruitList = fruitDao.findAll(Fruit.class);
		List<ViewFruit> viewFruitList = new ArrayList<ViewFruit>();
		for(Fruit fruit : fruitList){
			viewFruitList.add(initFruit(fruit));
		}
		return viewFruitList;
	}

	@Override
	public Fruit findFruitById(Integer id) {
		// TODO Auto-generated method stub
		Fruit fruit = fruitDao.get(Fruit.class, id);
		return fruit;
	}
	
	@Override
	public void updateFruit(Fruit fruit) {
		// TODO Auto-generated method stub
		fruitDao.update(fruit);
	}
	
	@Override
	public void deleteFruitById(Integer id) {
		// TODO Auto-generated method stub
		fruitDao.delete(Fruit.class, id);
	}
	
	@Override
	public List<ViewFruit> findAllFruitByPage(String sql,int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		List<Fruit> fruitList = fruitDao.findByPage(sql, pageNo, pageSize);
		List<ViewFruit> viewFruitList = new ArrayList<ViewFruit>();
		for(Fruit fruit : fruitList){
			viewFruitList.add(initFruit(fruit));
		}
		return viewFruitList;
	}
	
	@Override
	public ViewFruit findViewFruitById(Integer id) {
		// TODO Auto-generated method stub
		Fruit fruit = fruitDao.get(Fruit.class, id);
		ViewFruit viewFruit = initFruit(fruit);
		return viewFruit;
	}
	
	@Override
	public List<ViewFruit> findTopHotFruit() {
		// TODO Auto-generated method stub
		List<Fruit> fruitList = fruitDao.findHotFruit();
		List<ViewFruit> hotViewFruitList = new ArrayList<ViewFruit>();
		for(Fruit fruit : fruitList){
			hotViewFruitList.add(initFruit(fruit));
			if(hotViewFruitList.size() >= 10){
				break;
			}
		}
		return hotViewFruitList;
	}
	
	@Override
	public Integer countFruitBySeasonId(Integer seasonId) {
		// TODO Auto-generated method stub
		Integer count = fruitDao.countFruitBySI(seasonId);
		return count;
	}
	
	@Override
	public List<ViewFruit> findTopHotFruitBySeasonId(Integer seasonId) {
		// TODO Auto-generated method stub
		List<Fruit> fruitEachList = fruitDao.findHFBySI(seasonId);
		List<ViewFruit> hotViewEachFruitList = new ArrayList<ViewFruit>();
		for(Fruit fruitEach : fruitEachList){
			hotViewEachFruitList.add(initFruit(fruitEach));
			if(hotViewEachFruitList.size() >= 3){
				break;
			}
		}
		return hotViewEachFruitList;
	}
	
	@Override
	public Fruit findFruitByFruitId(String fruitId) {
		// TODO Auto-generated method stub
		Fruit fruit = fruitDao.findFruitByFI(fruitId);
		return fruit;
	}
	
	public ViewFruit initFruit(Fruit fruit){
		ViewFruit viewFruit = new ViewFruit();
		viewFruit.setId(fruit.getId());
		viewFruit.setFruitId(fruit.getFruitId());
		viewFruit.setFruitName(fruit.getFruitName());
		viewFruit.setFruitLongName(fruit.getFruitLongName());
		viewFruit.setFruitDes(fruit.getFruitDes());
		viewFruit.setFruitCount(fruit.getFruitCount());
		Date date = fruit.getDate();
		if(date != null){
			String [] dates = date.toString().split(" ");
			viewFruit.setDate(dates[0]);
		}else{
			viewFruit.setDate("-");
		}
		viewFruit.setCalCount(fruit.getCalCount());
		viewFruit.setFruitPrice(fruit.getFruitPrice());
		viewFruit.setImageUrl(fruit.getImageUrl());
		if(fruit.getSeasonId() != null){
			Integer id = fruit.getSeasonId();
			Season season = seasonDao.get(Season.class, id);
			viewFruit.setSeason(season.getSeasonName());
			viewFruit.setSeasonId(id);
		}
		return viewFruit;
	}
	
}
