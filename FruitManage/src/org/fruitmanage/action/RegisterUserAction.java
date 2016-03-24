package org.fruitmanage.action;

import org.fruitmanage.entity.User;
import org.fruitmanage.service.UserService;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterUserAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	private UserService userService;
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String execute(){
		System.out.println("---->xixi");
		userService.savePerson();
		System.out.println(".........");
		System.out.println(user.getUserName());
		System.out.println(user.getPassword());
		userService.register(user);
		return SUCCESS;
	}
}
