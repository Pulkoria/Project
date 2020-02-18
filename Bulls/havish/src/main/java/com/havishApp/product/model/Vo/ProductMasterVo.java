package com.havishApp.product.model.Vo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductMasterVo {
	
	List<ProductListVo> prodListVo =  new ArrayList<ProductListVo>();
 	
	String[] distinctBrands = new String[] {};

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

	@Override
	public String toString() {
		return "ProductMasterVo [prodListVo=" + prodListVo + ", distinctBrands=" + Arrays.toString(distinctBrands)
				+ ", getProdListVo()=" + getProdListVo() + ", getDistinctBrands()="
				+ Arrays.toString(getDistinctBrands()) + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

 }
