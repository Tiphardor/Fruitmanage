package org.fruitmanage.entity;

import java.util.HashSet;
import java.util.Set;

public class Season {
	private Integer id;
	private String seasonName;
	private Set<Fruit> fruits = new HashSet<Fruit>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSeasonName() {
		return seasonName;
	}
	public void setSeasonName(String seasonName) {
		this.seasonName = seasonName;
	}
	public Set<Fruit> getFruits() {
		return fruits;
	}
	public void setFruits(Set<Fruit> fruits) {
		this.fruits = fruits;
	}
}
