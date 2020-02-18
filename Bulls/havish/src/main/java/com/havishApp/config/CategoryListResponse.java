package com.havishApp.config;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.havishApp.product.model.Vo.CategoryListVo;
import com.havishApp.product.model.Vo.ProdSubCatVo;

@JsonInclude(Include.NON_EMPTY)
public class CategoryListResponse {
	
	List<CategoryListVo> catgryList;
	
	List<ProdSubCatVo> prodSubCatList;
	
	String status;
	String message;
	
	public List<CategoryListVo> getCatgryList() {
		return catgryList;
	}
	public void setCatgryList(List<CategoryListVo> catgryList) {
		this.catgryList = catgryList;
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
	public List<ProdSubCatVo> getProdSubCatList() {
		return prodSubCatList;
	}
	public void setProdSubCatList(List<ProdSubCatVo> prodSubCatList) {
		this.prodSubCatList = prodSubCatList;
	}
}
