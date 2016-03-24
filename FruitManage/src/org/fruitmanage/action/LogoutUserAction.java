package org.fruitmanage.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class LogoutUserAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	public String execute(){
		ServletActionContext.getRequest().getSession().removeAttribute("id");
		ServletActionContext.getRequest().getSession().removeAttribute("userName");
		return SUCCESS;
	}
}
