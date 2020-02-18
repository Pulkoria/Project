package com.havishApp.product.model.pojo;

public class CategoryList {

	private String categoryName;
	private String categoryId;
	
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	@Override
	public String toString() {
		return "CategoryList [categoryName=" + categoryName + ", categoryId=" + categoryId + "]";
	}
	
	
}
