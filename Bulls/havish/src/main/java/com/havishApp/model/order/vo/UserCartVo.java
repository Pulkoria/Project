package com.havishApp.model.order.vo;

public class UserCartVo {
	
	private String userCartId;
	private String userId;
	private String productId;
	private int prodQuantity;
	private double priceRate;
	private double TotalRate;
	private String variantId;
	private String rcreTime;
	private String rmodTIme;
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
	
	public String getRcreTime() {
		return rcreTime;
	}
	public void setRcreTime(String rcreTime) {
		this.rcreTime = rcreTime;
	}
	public String getRmodTIme() {
		return rmodTIme;
	}
	public void setRmodTIme(String rmodTIme) {
		this.rmodTIme = rmodTIme;
	}
	public String getSaveLater() {
		return saveLater;
	}
	public void setSaveLater(String saveLater) {
		this.saveLater = saveLater;
	}
	
}
