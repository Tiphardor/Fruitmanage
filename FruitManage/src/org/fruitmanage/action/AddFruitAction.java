package org.fruitmanage.action;

import java.io.File;
import java.io.Serializable;
import java.util.Date;

import org.apache.struts2.ServletActionContext;
import org.fruitmanage.entity.Fruit;
import org.fruitmanage.service.FruitService;
import org.fruitmanage.util.UploadImage;

import com.opensymphony.xwork2.ActionSupport;

public class AddFruitAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	private Date date;
	private File uploadImage;
	private String uploadImageFileName;
	private String uploadImageFileContentType;
	private FruitService fruitService;
	private Fruit fruit;
	public void setFruitService(FruitService fruitService) {
		this.fruitService = fruitService;
	}
	public Fruit getFruit() {
		return fruit;
	}
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	public File getUploadImage() {
		return uploadImage;
	}
	public void setUploadImage(File uploadImage) {
		this.uploadImage = uploadImage;
	}
	public String getUploadImageFileName() {
		return uploadImageFileName;
	}
	public void setUploadImageFileName(String uploadImageFileName) {
		this.uploadImageFileName = uploadImageFileName;
	}
	public String getUploadImageFileContentType() {
		return uploadImageFileContentType;
	}
	public void setUploadImageFileContentType(String uploadImageFileContentType) {
		this.uploadImageFileContentType = uploadImageFileContentType;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String execute() throws Exception{
		if(uploadImage != null){
			String directory = "/file";
			//System.out.println("uploadImageFileName------->"+uploadImageFileName);
		
			String targetDirectory = ServletActionContext.getServletContext().getRealPath(directory);
			//System.out.println("targetDirectory------>"+targetDirectory);
			UploadImage.Upload(uploadImage, uploadImageFileName,targetDirectory);
		}
		fruit.setImageUrl(uploadImageFileName);
		fruit.setDate(new Date());
		fruit.setCalCount(0);
		Serializable id = fruitService.addFruit(fruit);
		return SUCCESS;
	}
}
