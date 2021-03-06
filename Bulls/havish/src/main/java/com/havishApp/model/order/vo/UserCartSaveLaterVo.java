package com.havishApp.model.order.vo;

public class UserCartSaveLaterVo {
	
	private String userCartId;
	private String userId;
	private String productId;
	private int prodQuantity;
	private double priceRate;
	private double TotalRate;
	private String variantId;
	private String rCreTime;
	private String rmodTime;
	private String prodName;
	private Integer productAvailabilty;
	private String productImage;
	private String stockAvail;
	private String saveLater;
	
	public String getUserCartId() {
		return userCartId;
	}
	public void setUserCartId(String userCartId) {
		this.userCartId = userCartId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public int getProdQuantity() {
		return prodQuantity;
	}
	public void setProdQuantity(int prodQuantity) {
		this.prodQuantity = prodQuantity;
	}
	public double getPriceRate() {
		return priceRate;
	}
	public void setPriceRate(double priceRate) {
		this.priceRate = priceRate;
	}
	public double getTotalRate() {
		return TotalRate;
	}
	public void setTotalRate(double totalRate) {
		TotalRate = totalRate;
	}
	public String getVariantId() {
		return variantId;
	}
	public void setVariantId(String variantId) {
		this.variantId = variantId;
	}
	public String getrCreTime() {
		return rCreTime;
	}
	public void setrCreTime(String rCreTime) {
		this.rCreTime = rCreTime;
	}
	public String getRmodTime() {
		return rmodTime;
	}
	public void setRmodTime(String rmodTime) {
		this.rmodTime = rmodTime;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public Integer getProductAvailabilty() {
		return productAvailabilty;
	}
	public void setProductAvailabilty(Integer productAvailabilty) {
		this.productAvailabilty = productAvailabilty;
	}
	public String getProductImage() {
		return productImage;
	}
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	public String getStockAvail() {
		return stockAvail;
	}
	public void setStockAvail(String stockAvail) {
		this.stockAvail = stockAvail;
	}
	public String getSaveLater() {
		return saveLater;
	}
	public void setSaveLater(String saveLater) {
		this.saveLater = saveLater;
	}
	
}
