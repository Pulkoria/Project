package com.havishApp.product.model.Vo;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_EMPTY)
public class ProductListResponse {
	
	
	List<ProductListVo> prodListVo;
	
	String[] distinctBrands = new String[] {};
	
	String status;
	String message;
	
	public List<ProductListVo> getProdListVo() {
		return prodListVo;
	}
	public void setProdListVo(List<ProductListVo> prodListVo) {
		this.prodListVo = prodListVo;
	}
	public String[] getDistinctBrands() {
		return distinctBrands;
	}
	public void setDistinctBrands(String[] distinctBrands) {
		this.distinctBrands = distinctBrands;
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
	
	@Override
	public String toString() {
		return "ProductListRespone [prodListVo=" + prodListVo + ", distinctBrands=" + Arrays.toString(distinctBrands)
				+ ", status=" + status + ", message=" + message + "]";
	}
}
