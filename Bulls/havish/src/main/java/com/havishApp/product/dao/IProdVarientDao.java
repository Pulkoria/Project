package com.havishApp.product.dao;

import java.util.List;

import com.havishApp.Exception.DataAlreadyExistsException;
import com.havishApp.Exception.DeleteFailedException;
import com.havishApp.Exception.NoRecordFoundException;
import com.havishApp.Exception.UpdateFailedException;
import com.havishApp.product.model.pojo.ProductVarient;

public interface IProdVarientDao {

	 	public void insertprodVarient(ProductVarient productVarient)throws DataAlreadyExistsException;
		
		public void  updateprodVarient(ProductVarient ProductVarient)throws UpdateFailedException;
		
		public List<ProductVarient> selectprodVarientList(ProductVarient productVarient)throws NoRecordFoundException;
		
		public void  deleteProductVarient(ProductVarient productVarient)throws DeleteFailedException;
	
}
