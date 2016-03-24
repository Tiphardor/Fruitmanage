package org.fruitmanage.action;

import org.apache.struts2.ServletActionContext;
import org.fruitmanage.entity.User;
import org.fruitmanage.service.UserService;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private UserService userService;
	private String userName;
	private String password;
	private User user;
	private String loginErrorResult;
	private Integer manageTarget;
	private Integer style;
	public void setUserService(UserService userService) {
		this.userService = userService;
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getLoginErrorResult() {
		return loginErrorResult;
	}
	public void setLoginErrorResult(String loginErrorResult) {
		this.loginErrorResult = loginErrorResult;
	}
	public Integer getManageTarget() {
		return manageTarget;
	}
	public void setManageTarget(Integer manageTarget) {
		this.manageTarget = manageTarget;
	}
	public Integer getStyle() {
		return style;
	}
	public void setStyle(Integer style) {
		this.style = style;
	}
	
	public String execute(){
		System.out.println(userName);
		System.out.println(password);
		user = userService.findUserByUserNameAndPasswordStyle(userName, password,style);
		if(user != null && user.getId() > 0){
			System.out.println(user.getId());
			ServletActionContext.getRequest().getSession().setAttribute("id",user.getId());
			ServletActionContext.getRequest().getSession().setAttribute("userName",user.getUserName());
			if((manageTarget != null && manageTarget == 1) || style == 1){
				return "successToM";
			}else{
				return SUCCESS;
			}
		}else{
			loginErrorResult = "用户名或密码错误，请重新登入！";
			if(manageTarget != null && manageTarget == 1 || style == 1){
				return "loginToM";
			}else{
				return "login";
			}	
		}
		
	}
	
}
