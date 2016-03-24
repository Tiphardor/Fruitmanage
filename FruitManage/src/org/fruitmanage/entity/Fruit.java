package org.fruitmanage.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Fruit {
	private Integer id;
	private String fruitId;
	private String fruitName;
	private String fruitLongName;
	private String fruitDes;
	private Integer fruitCount;
	private Float fruitPrice;
	private Integer seasonId;
	private Date date;
	private Integer calCount;
	private String imageUrl;
	private Set<Shopcar> shopcars = new HashSet<Shopcar>();
	private Set<Order> orders = new HashSet<Order>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public Integer getFruitCount() {
		return fruitCount;
	}
	public void setFruitCount(Integer fruitCount) {
		this.fruitCount = fruitCount;
	}
	public Float getFruitPrice() {
		return fruitPrice;
	}
	public void setFruitPrice(Float fruitPrice) {
		this.fruitPrice = fruitPrice;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getCalCount() {
		return calCount;
	}
	public void setCalCount(Integer calCount) {
		this.calCount = calCount;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getFruitId() {
		return fruitId;
	}
	public void setFruitId(String fruitId) {
		this.fruitId = fruitId;
	}
	public Integer getSeasonId() {
		return seasonId;
	}
	public void setSeasonId(Integer seasonId) {
		this.seasonId = seasonId;
	}
	public String getFruitLongName() {
		return fruitLongName;
	}
	public void setFruitLongName(String fruitLongName) {
		this.fruitLongName = fruitLongName;
	}
	public String getFruitDes() {
		return fruitDes;
	}
	public void setFruitDes(String fruitDes) {
		this.fruitDes = fruitDes;
	}
	public Set<Shopcar> getShopcars() {
		return shopcars;
	}
	public void setShopcars(Set<Shopcar> shopcars) {
		this.shopcars = shopcars;
	}
	public Set<Order> getOrders() {
		return orders;
	}
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
	
}
