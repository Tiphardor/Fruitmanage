package org.fruitmanage.vo;

import java.util.Date;

public class ViewFruit {
	private Integer id;
	private String fruitId;
	private String fruitName;
	private String fruitLongName;
	private String fruitDes;
	private Integer fruitCount;
	private Float fruitPrice;
	private String season;
	private Integer seasonId;
	private String date;
	private Integer calCount;
	private String imageUrl;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFruitId() {
		return fruitId;
	}
	public void setFruitId(String fruitId) {
		this.fruitId = fruitId;
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
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
