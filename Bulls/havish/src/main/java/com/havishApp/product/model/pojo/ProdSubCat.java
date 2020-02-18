package com.havishApp.product.model.pojo;

public class ProdSubCat {
	
	private String prodSubCatgryId;
	private String prodSubCatName;
	private String catgryId;
	private String catgryName;
	
	public String getProdSubCatgryId() {
		return prodSubCatgryId;
	}
	public void setProdSubCatgryId(String prodSubCatgryId) {
		this.prodSubCatgryId = prodSubCatgryId;
	}
	public String getProdSubCatName() {
		return prodSubCatName;
	}
	public void setProdSubCatName(String prodSubCatName) {
		this.prodSubCatName = prodSubCatName;
	}
	public String getCatgryId() {
		return catgryId;
	}
	public void setCatgryId(String catgryId) {
		this.catgryId = catgryId;
	}
	public String getCatgryName() {
		return catgryName;
	}
	public void setCatgryName(String catgryName) {
		this.catgryName = catgryName;
	}
	@Override
	public String toString() {
		return "ProdSubCat [prodSubCatgryId=" + prodSubCatgryId + ", prodSubCatName=" + prodSubCatName + ", catgryId="
				+ catgryId + ", catgryName=" + catgryName + "]";
	}
	
}
