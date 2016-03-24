package org.fruitmanage.entity;

import java.util.HashSet;
import java.util.Set;

public class User {
	private Integer id;
	private String userName;
	private String realName;
	private String password;
	private String postcode;
	private String phone;
	private String email;
	private Integer gender;
	private String address;
	private Integer style;
	private Set<Shopcar> shopcars = new HashSet<Shopcar>();
	private Set<Order> orders = new HashSet<Order>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
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
	public Integer getStyle() {
		return style;
	}
	public void setStyle(Integer style) {
		this.style = style;
	}
	
}
