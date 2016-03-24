package org.fruitmanage.action;

import java.io.File;

import org.apache.struts2.ServletActionContext;
import org.fruitmanage.entity.Fruit;
import org.fruitmanage.service.FruitService;
import org.fruitmanage.util.AlterFruit;
import org.fruitmanage.util.UploadImage;

import com.opensymphony.xwork2.ActionSupport;

public class AlterFruitAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	private FruitService fruitService;
	private Fruit fruit;
	private Integer id;
	private String fruitName;
	private Integer seasonId;
	private Float fruitPrice;
	
	private File uploadImage;
	private String uploadImageFileName;
	private String uploadImageFileContentType;
	
	private String result;
	public void setFruitService(FruitService fruitService) {
		this.fruitService = fruitService;
	}
	public Fruit getFruit() {
		return fruit;
	}
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public Integer getSeasonId() {
		return seasonId;
	}
	public void setSeasonId(Integer seasonId) {
		this.seasonId = seasonId;
	}
	public Float getFruitPrice() {
		return fruitPrice;
	}
	public void setFruitPrice(Float fruitPrice) {
		this.fruitPrice = fruitPrice;
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
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	public String execute() throws Exception{
		fruit = fruitService.findFruitById(id);
		fruit = AlterFruit.JudgeFruitParams(fruit, fruitName, seasonId, fruitPrice, uploadImageFileName);
		if(uploadImage != null){
			String directory = "/file";
			String targetDirectory = ServletActionContext.getServletContext().getRealPath(directory);
			UploadImage.Upload(uploadImage, uploadImageFileName,targetDirectory);
		}
		fruitService.updateFruit(fruit);
		setResult("ÐÞ¸Ä³É¹¦£¡");
		return SUCCESS;
	}
}
