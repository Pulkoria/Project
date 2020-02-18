package com.havishApp.product.model.pojo;

public class ProductVarient {

	private String varientId;
	private String productId;
	private String varientValue;
	private double varientPrice;
	
	public String getVarientId() {
		return varientId;
	}
	public void setVarientId(String varientId) {
		this.varientId = varientId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getVarientValue() {
		return varientValue;
	}
	public void setVarientValue(String varientValue) {
		this.varientValue = varientValue;
	}
	public double getVarientPrice() {
		return varientPrice;
	}
	public void setVarientPrice(double varientPrice) {
		this.varientPrice = varientPrice;
	}
	@Override
	public String toString() {
		return "ProductVarient [varientId=" + varientId + ", productId=" + productId + ", varientValue=" + varientValue
				+ ", varientPrice=" + varientPrice + "]";
	}
	
}
