package org.fruitmanage.vo;

public class ViewOrder {
	public Integer id;
	public Integer userId;
	public Integer fruitId;
	public String fruitLongName;
	public Integer count;
	public Float fruitPrice;
	public Float totalPrice;
	public Integer stateId;
	public String stateDes;
	public String imageUrl;
	public String date;
	public String userName;
	
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
	public Integer getStateId() {
		return stateId;
	}
	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}
	public String getStateDes() {
		return stateDes;
	}
	public void setStateDes(String stateDes) {
		this.stateDes = stateDes;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
