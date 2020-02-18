package com.havishApp.user.model.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class AddressResponse {
	@JsonInclude(Include.NON_EMPTY)
	List<AddressVo> addressListObj;
	
	String status;
	String message;
	
	public List<AddressVo> getAddressListObj() {
		return addressListObj;
	}
	public void setAddressListObj(List<AddressVo> addressListObj) {
		this.addressListObj = addressListObj;
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
