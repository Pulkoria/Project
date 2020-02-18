package com.havishApp.product.model.Vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class ProductDetailsResponse {
	
	@JsonInclude(Include.NON_EMPTY)
	ProductListVo prodct;
	String status;
	String message;
	
	public ProductListVo getProdct() {
		return prodct;
	}
	public void setProdct(ProductListVo prodct) {
		this.prodct = prodct;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
