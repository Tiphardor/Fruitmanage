package org.fruitmanage.vo;

import java.util.Date;

public class ViewShopcar {
	private Integer id;
	private Integer userId;
	private Integer fruitId;
	private String fruitLongName;
	private String imageUrl;
	private Integer count;
	private Float fruitPrice;
	private Float totalPrice;
	private Date date;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getFruitId() {
		return fruitId;
	}
	public void setFruitId(Integer fruitId) {
		this.fruitId = fruitId;
	}
	public String getFruitLongName() {
		return fruitLongName;
	}
	public void setFruitLongName(String fruitLongName) {
		this.fruitLongName = fruitLongName;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Float getFruitPrice() {
		return fruitPrice;
	}
	public void setFruitPrice(Float fruitPrice) {
		this.fruitPrice = fruitPrice;
	}
	public Float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
}
