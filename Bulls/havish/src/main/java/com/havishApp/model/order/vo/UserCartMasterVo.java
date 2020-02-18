package com.havishApp.model.order.vo;

import java.util.ArrayList;
import java.util.List;

import com.havishApp.user.model.pojo.Address;
import com.havishApp.user.model.vo.AddressVo;

public class UserCartMasterVo {
	
	
	UserCartListVo userCartListVo=new UserCartListVo();
	List<UserCartListVo> userCartListVoList=new ArrayList<UserCartListVo>();
	List<UserCartSaveLaterVo> userCartSaveLaterListVo = new ArrayList<UserCartSaveLaterVo>();
	List<AddressVo> addressListVo = new ArrayList<AddressVo>();
	private Integer NoOfItems;
	private Double totalPrice;
	private Double totalPay;
	private Double offerPrice=800.00;
	private Integer noOfSavedItems;
	
	
	public UserCartListVo getUserCartListVo() {
		return userCartListVo;
	}
	public void setUserCartListVo(UserCartListVo userCartListVo) {
		this.userCartListVo = userCartListVo;
	}
	public List<UserCartListVo> getUserCartListVoList() {
		return userCartListVoList;
	}
	public void setUserCartListVoList(List<UserCartListVo> userCartListVoList) {
		this.userCartListVoList = userCartListVoList;
	}
	public Integer getNoOfItems() {
		return NoOfItems;
	}
	public void setNoOfItems(Integer noOfItems) {
		NoOfItems = noOfItems;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Double getTotalPay() {
		return totalPay;
	}
	public void setTotalPay(Double totalPay) {
		this.totalPay = totalPay;
	}
	public Double getOfferPrice() {
		return offerPrice;
	}
	public void setOfferPrice(Double offerPrice) {
		this.offerPrice = offerPrice;
	}
	public List<UserCartSaveLaterVo> getUserCartSaveLaterListVo() {
		return userCartSaveLaterListVo;
	}
	public void setUserCartSaveLaterListVo(List<UserCartSaveLaterVo> userCartSaveLaterListVo) {
		this.userCartSaveLaterListVo = userCartSaveLaterListVo;
	}
	public Integer getNoOfSavedItems() {
		return noOfSavedItems;
	}
	public void setNoOfSavedItems(Integer noOfSavedItems) {
		this.noOfSavedItems = noOfSavedItems;
	}
	public List<AddressVo> getAddressListVo() {
		return addressListVo;
	}
	public void setAddressListVo(List<AddressVo> addressListVo) {
		this.addressListVo = addressListVo;
	}
	

}
