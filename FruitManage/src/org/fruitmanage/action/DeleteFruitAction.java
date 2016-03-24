package org.fruitmanage.action;

import org.apache.struts2.ServletActionContext;
import org.fruitmanage.entity.Fruit;
import org.fruitmanage.service.FruitService;
import org.fruitmanage.util.DeleteImage;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteFruitAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private FruitService fruitService;
	private Integer id;
	private String deleteImageName;
	private String deleteResult;
	private Fruit fruit;
	public void setFruitService(FruitService fruitService) {
		this.fruitService = fruitService;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDeleteResult() {
		return deleteResult;
	}
	public void setDeleteResult(String deleteResult) {
		this.deleteResult = deleteResult;
	}
	public String getDeleteImageName() {
		return deleteImageName;
	}
	public void setDeleteImageName(String deleteImageName) {
		this.deleteImageName = deleteImageName;
	}
	public Fruit getFruit() {
		return fruit;
	}
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	
	public String execute(){
		fruit = fruitService.findFruitById(id);
		if(fruit.getImageUrl() != null && !(fruit.getImageUrl().equals(""))){
			deleteImageName = fruit.getImageUrl();
			String directory = "/file";
			String targetDirectory = ServletActionContext.getServletContext().getRealPath(directory);
			System.out.println(targetDirectory);
			DeleteImage.Delete(deleteImageName,targetDirectory);
		}
		fruitService.deleteFruitById(id);
		setDeleteResult("É¾³ý³É¹¦£¡");
		return SUCCESS;
	}
}
