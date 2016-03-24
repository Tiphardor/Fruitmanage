package org.fruitmanage.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.fruitmanage.service.FruitService;
import org.fruitmanage.service.ShopcarService;
import org.fruitmanage.vo.ViewFruit;
import org.fruitmanage.vo.ViewShopcar;

import com.opensymphony.xwork2.ActionSupport;

public class ViewShopCarAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	private ShopcarService shopcarService;
	private FruitService fruitService;
	private Integer userId;
	private List<ViewShopcar> viewShopcarList;
	private List<ViewFruit> viewFruitList;
	private String loginResult;
	private String commitResult;
	
	public List<ViewShopcar> getViewShopcarList() {
		return viewShopcarList;
	}
	public void setViewShopcarList(List<ViewShopcar> viewShopcarList) {
		this.viewShopcarList = viewShopcarList;
	}
	public List<ViewFruit> getViewFruitList() {
		return viewFruitList;
	}
	public void setViewFruitList(List<ViewFruit> viewFruitList) {
		this.viewFruitList = viewFruitList;
	}
	public void setFruitService(FruitService fruitService) {
		this.fruitService = fruitService;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public void setShopcarService(ShopcarService shopcarService) {
		this.shopcarService = shopcarService;
	}
	public String getLoginResult() {
		return loginResult;
	}
	public void setLoginResult(String loginResult) {
		this.loginResult = loginResult;
	}
	public String getCommitResult() {
		return commitResult;
	}
	public void setCommitResult(String commitResult) {
		this.commitResult = commitResult;
	}
	
	public String execute(){
		HttpSession session = (HttpSession)ServletActionContext.getRequest().getSession();
		userId = (Integer)session.getAttribute("id");
		if(userId == null || !(userId > 0)){
			loginResult = "ÇëÏÈµÇÂ¼£¡";
			return "login";
		}
		viewShopcarList = shopcarService.findShopcarListByUserId(userId);
		return SUCCESS;
	}
}
