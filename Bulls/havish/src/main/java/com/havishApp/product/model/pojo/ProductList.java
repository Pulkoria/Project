package com.havishApp.product.model.pojo;

public class ProductList {
	
	private String productId;
	private String productName;
	private String categryId;
	private String productCatgryId;
	private double price;
	private Integer productAvailabilty;
	private String productDesc;
	private String  rating;
	private String brand;
	private String productAttribute;
	private String productImage;
	private  String prodVarientId;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategryId() {
		return categryId;
	}
	public void setCategryId(String categryId) {
		this.categryId = categryId;
	}
	public String getProductCatgryId() {
		return productCatgryId;
	}
	public void setProductCatgryId(String productCatgryId) {
		this.productCatgryId = productCatgryId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getProductAvailabilty() {
		return productAvailabilty;
	}
	public void setProductAvailabilty(Integer productAvailabilty) {
		this.productAvailabilty = productAvailabilty;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getProductAttribute() {
		return productAttribute;
	}
	public void setProductAttribute(String productAttribute) {
		this.productAttribute = productAttribute;
	}
	public String getProductImage() {
		return productImage;
	}
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getProdVarientId() {
		return prodVarientId;
	}
	public void setProdVarientId(String prodVarientId) {
		this.prodVarientId = prodVarientId;
	}
	@Override
	public String toString() {
		return "ProductList [productId=" + productId + ", productName=" + productName + ", categryId=" + categryId
				+ ", productCatgryId=" + productCatgryId + ", price=" + price + ", productAvailabilty="
				+ productAvailabilty + ", productDesc=" + productDesc + ", rating=" + rating + ", brand=" + brand
				+ ", productAttribute=" + productAttribute + ", productImage=" + productImage + ", prodVarientId="
				+ prodVarientId + "]";
	}
	


}
