package com.havishApp.product.model.Vo;

import java.util.ArrayList;
import java.util.List;

public class ProductVarientResponse {

	List<ProductVarientVo> addressListObj = new ArrayList<ProductVarientVo>();
	
	String errorCode;
	String errorMessage;
	String sucessCode;
	String successMessage;
	
	public List<ProductVarientVo> getAddressListObj() {
		return addressListObj;
	}
	public void setAddressListObj(List<ProductVarientVo> addressListObj) {
		this.addressListObj = addressListObj;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getSucessCode() {
		return sucessCode;
	}
	public void setSucessCode(String sucessCode) {
		this.sucessCode = sucessCode;
	}
	public String getSuccessMessage() {
		return successMessage;
	}
	public void setSuccessMessage(String successMessage) {
		this.successMessage = successMessage;
	}
	@Override
	public String toString() {
		return "ProductVarientResponse [addressListObj=" + addressListObj + ", errorCode=" + errorCode
				+ ", errorMessage=" + errorMessage + ", sucessCode=" + sucessCode + ", successMessage=" + successMessage
				+ "]";
	}
}
