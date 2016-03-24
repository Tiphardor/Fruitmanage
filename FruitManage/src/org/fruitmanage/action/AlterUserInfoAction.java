package org.fruitmanage.action;

import org.fruitmanage.entity.User;
import org.fruitmanage.service.UserService;
import org.fruitmanage.util.TransUserToViewUser;
import org.fruitmanage.vo.ViewUser;

import com.opensymphony.xwork2.ActionSupport;

public class AlterUserInfoAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private UserService userService;
	private Integer id;
	private String phone;
	private String address;
	private String postcode;
	private User user;
	private ViewUser viewUser;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public ViewUser getViewUser() {
		return viewUser;
	}
	public void setViewUser(ViewUser viewUser) {
		this.viewUser = viewUser;
	}
	
	public String execute(){
		System.out.println(id+" "+phone+" "+address+" "+postcode);
		User u = userService.findUserById(id);
		u.setPhone(phone);
		u.setAddress(address);
		u.setPostcode(postcode);
		userService.updateUser(u);
		user = (userService.findUserById(id));
		setViewUser(TransUserToViewUser.transUToV(user));
		return SUCCESS;
	}
}
