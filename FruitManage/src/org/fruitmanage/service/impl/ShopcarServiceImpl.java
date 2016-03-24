package org.fruitmanage.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.fruitmanage.dao.FruitDao;
import org.fruitmanage.dao.SeasonDao;
import org.fruitmanage.dao.ShopcarDao;
import org.fruitmanage.dao.UserDao;
import org.fruitmanage.entity.Fruit;
import org.fruitmanage.entity.Shopcar;
import org.fruitmanage.entity.User;
import org.fruitmanage.service.ShopcarService;
import org.fruitmanage.vo.ViewShopcar;

public class ShopcarServiceImpl implements ShopcarService{
	
	private UserDao userDao;
	private FruitDao fruitDao;
	private SeasonDao seasonDao;
	private ShopcarDao shopcarDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void setShopcarDao(ShopcarDao shopcarDao) {
		this.shopcarDao = shopcarDao;
	}
	public void setFruitDao(FruitDao fruitDao) {
		this.fruitDao = fruitDao;
	}
	public void setSeasonDao(SeasonDao seasonDao) {
		this.seasonDao = seasonDao;
	}

	@Override
	public List<ViewShopcar> findShopcarListByUserId(Integer userId) {
		// TODO Auto-generated method stub
		User user = userDao.get(User.class, userId);
		List<Shopcar> shopcarList = shopcarDao.findShopcarListByUser(user);
		List<ViewShopcar> viewShopcarList = new ArrayList<ViewShopcar>();
		for(Shopcar shopcar : shopcarList){
			viewShopcarList.add(initShopcar(shopcar));
		}
		return viewShopcarList;
	}

	@Override
	public void save(Shopcar shopcar, Integer buyCount,Integer fruitId,Integer userId) {
		// TODO Auto-generated method stub
		User user = userDao.get(User.class, userId);
		Fruit fruit = fruitDao.get(Fruit.class, fruitId);
		if(shopcar == null){
			shopcar = new Shopcar();
		}
		if(buyCount == null || !(buyCount > 0)){
			buyCount = 1;
		}
		shopcar.setTotalPrice(buyCount * fruit.getFruitPrice());
		shopcar.setCount(buyCount);
		shopcar.setDate(new Date());
		shopcar.setUser(user);
		shopcar.setFruit(fruit);
		shopcarDao.save(shopcar);
	}
	
	@Override
	public Shopcar findShopcarByUserIdAndFruitId(Integer userId, Integer fruitId) {
		// TODO Auto-generated method stub
		User user = userDao.get(User.class, userId);
		Fruit fruit = fruitDao.get(Fruit.class, fruitId);
		Shopcar shopcar = shopcarDao.findShopcarByUAndF(user, fruit);
		return shopcar;
	}
	
	@Override
	public void updateShopcar(Shopcar shopcar) {
		// TODO Auto-generated method stub
		shopcarDao.update(shopcar);
	}
	
	@Override
	public void deleteShopcarById(Integer id) {
		// TODO Auto-generated method stub
		Shopcar shopcar = shopcarDao.get(Shopcar.class, id);
		if(shopcar != null && shopcar.getId() > 0){
			shopcarDao.delete(shopcar);
		}
	}
	
	@Override
	public Shopcar findShopcarById(Integer id) {
		// TODO Auto-generated method stub
		Shopcar shopcar = shopcarDao.get(Shopcar.class, id);
		return shopcar;
	}
	
	@Override
	public void deleteShopcar(Shopcar shopcar) {
		// TODO Auto-generated method stub
		shopcarDao.delete(shopcar);
	}
	
	public ViewShopcar initShopcar(Shopcar shopcar){
		ViewShopcar viewShopcar = new ViewShopcar();
		viewShopcar.setId(shopcar.getId());
		viewShopcar.setFruitId(shopcar.getFruit().getId());
		viewShopcar.setUserId(shopcar.getUser().getId());
		viewShopcar.setCount(shopcar.getCount());
		viewShopcar.setFruitPrice(shopcar.getFruit().getFruitPrice());
		viewShopcar.setTotalPrice(shopcar.getTotalPrice());
		viewShopcar.setDate(shopcar.getDate());
		viewShopcar.setImageUrl(shopcar.getFruit().getImageUrl());
		viewShopcar.setFruitLongName(shopcar.getFruit().getFruitLongName());
		return viewShopcar;
	}
	
}
