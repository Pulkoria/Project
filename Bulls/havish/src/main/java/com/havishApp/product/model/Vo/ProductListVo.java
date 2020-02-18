package com.havishApp.product.model.Vo;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnore;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ProductListVo {
	
	private String productId;
	private String productName;
	private String categryId;
	private String productCatgryId;
	@JsonInclude(JsonInclude.Include.NON_DEFAULT)
	private double price;
	private Integer productAvailabilty;
	private String productDesc;
	private String  rating;
	private String brand;
	private String productAttribute;
	private String productImage;
	private String stockAvailable;
	private String prodSubCatName;
	private String categoryName;
	private  String prodVarientId;
	
	@JsonIgnore
	private List<String> distinctBrand;
	
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
	public String getStockAvailable() {
		return stockAvailable;
	}
	public void setStockAvailable(String stockAvailable) {
		this.stockAvailable = stockAvailable;
	}
	public String getProdSubCatName() {
		return prodSubCatName;
	}
	public void setProdSubCatName(String prodSubCatName) {
		this.prodSubCatName = prodSubCatName;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public List<String> getDistinctBrand() {
		return distinctBrand;
	}
	public void setDistinctBrand(List<String> distinctBrand) {
		this.distinctBrand = distinctBrand;
	}
	public String getProdVarientId() {
		return prodVarientId;
	}
	public void setProdVarientId(String prodVarientId) {
		this.prodVarientId = prodVarientId;
	}
	
}
