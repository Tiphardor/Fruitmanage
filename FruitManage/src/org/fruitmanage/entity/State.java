package org.fruitmanage.entity;

import java.util.HashSet;
import java.util.Set;

public class State {
	private Integer id;
	private String stateDes;
	private Set<Order> orders = new HashSet<Order>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStateDes() {
		return stateDes;
	}
	public void setStateDes(String stateDes) {
		this.stateDes = stateDes;
	}
	public Set<Order> getOrders() {
		return orders;
	}
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
	
}
