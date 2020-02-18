package com.havishApp.product.service;

import java.util.List;

import com.havishApp.Exception.NoDataFoundException;
import com.havishApp.product.model.Vo.CategoryListVo;
import com.havishApp.product.model.Vo.ProdSubCatVo;
import com.havishApp.product.model.Vo.ProductListVo;

public interface IProductListService {

	public List<CategoryListVo> selectCategoryList() throws NoDataFoundException;
		
	public List<ProdSubCatVo> selectAllProdSubCategory()throws NoDataFoundException;
	
	public List<ProdSubCatVo> selectProdSubCategoryByCategry(String catgryId)throws NoDataFoundException;
	
	public List<ProductListVo> selectProductList(String prodCat,int minPrice,int maxPrice,String brand[],String prodSearchString,String order) throws NoDataFoundException;
	
	public ProductListVo selectProductDetails(String prodId)throws NoDataFoundException;
	
	public List<ProductListVo> selectProductDetailsByOrder(String prodCat,String orderBy);
	
	public List<String> selectDistinctBrands(String prodCat);
	
	public List<String> selectDistinctBrandBySearch(String searchKey);
	
}
