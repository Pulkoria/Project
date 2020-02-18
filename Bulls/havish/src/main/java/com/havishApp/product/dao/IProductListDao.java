package com.havishApp.product.dao;

import java.util.List;

import com.havishApp.Exception.NoRecordFoundException;
import com.havishApp.product.model.pojo.CategoryList;
import com.havishApp.product.model.pojo.ProdSubCat;
import com.havishApp.product.model.pojo.ProductList;
import com.havishApp.user.model.pojo.User;

public interface IProductListDao {

	public List<ProductList> selectProductList();
	
	public List<ProductList> selectProductListByCategory(String prodCat,int minPrice,int maxPrice,String brand[],String prodSearchString,String order)throws NoRecordFoundException;
	
	public List<CategoryList> selectCategoryList()throws NoRecordFoundException;
	
	public List<ProdSubCat> selectAllProductCategoryList()throws NoRecordFoundException;
	
	public List<ProdSubCat> selectSingleProductCategoryList(String prodCatId)throws NoRecordFoundException;
	
	public ProductList selectProductDetails(String productId)throws NoRecordFoundException;

	public ProdSubCat selectProdCategoriesAndSubCat(String prodCatId);
	
	public List<ProductList> selectProductListByPrice(String prodCatId,String orderBy);
	
	public List<String> selectBrands(String prodCatId);
	
	public List<String> selectBrandBySearch(String searchKey)throws NoRecordFoundException;
	
	
	//public List<ProductList> selectProductListByCategory(String prodCat,int minPrice,int maxPrice);
}
