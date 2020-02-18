package com.havishApp.product.service;

import java.util.List;

import com.havishApp.Exception.DataAlreadyExistsException;
import com.havishApp.Exception.DeleteFailedException;
import com.havishApp.Exception.NoDataFoundException;
import com.havishApp.Exception.UpdateFailedException;
import com.havishApp.product.model.Vo.ProductVarientVo;

public interface IProductVarientService {

	public void saveProductVarient(ProductVarientVo productVarient)throws DataAlreadyExistsException;
	
	public List<ProductVarientVo> selectProductVarienList() throws NoDataFoundException;
	
	public ProductVarientVo editProductVarient(ProductVarientVo productVarient)throws UpdateFailedException;
	
	public String deleteProductVarient(ProductVarientVo productVarient)throws DeleteFailedException;
	
}
