package org.fruitmanage.service;

import java.util.List;

import org.fruitmanage.entity.Shopcar;
import org.fruitmanage.vo.ViewShopcar;

public interface ShopcarService {
	public List<ViewShopcar> findShopcarListByUserId(Integer userId);
	public void save(Shopcar shopcar,Integer buyCount,Integer fruitId,Integer userId);
	public Shopcar findShopcarByUserIdAndFruitId(Integer userId,Integer fruitId);
	public void updateShopcar(Shopcar shopcar);
	public void deleteShopcarById(Integer id);
	public Shopcar findShopcarById(Integer id);
	public void deleteShopcar(Shopcar shopcar);
}
