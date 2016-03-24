package org.fruitmanage.util;

import java.util.Date;

import org.fruitmanage.entity.Order;
import org.fruitmanage.entity.Shopcar;

public class TransShopcarToOrder {
	public static Order transSToO(Shopcar shopcar){
		Order order = new Order();
		order.setUser(shopcar.getUser());
		order.setFruit(shopcar.getFruit());
		order.setCount(shopcar.getCount());
		order.setTotalPrice(shopcar.getTotalPrice());
		order.setDate(new Date());
		order.setStateId(1);
		return order;
	}
}
