package com.havishApp.model.order.vo;

public class OrderVo {
	
	private String orderId;
	private String userId;
	private String orderDate;
	private String orderTime;
	private String orderAddress;
	private String orderStatus;
	private String orderPaymentMode;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	public String getOrderAddress() {
		return orderAddress;
	}
	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderPaymentMode() {
		return orderPaymentMode;
	}
	public void setOrderPaymentMode(String orderPaymentMode) {
		this.orderPaymentMode = orderPaymentMode;
	}

}
