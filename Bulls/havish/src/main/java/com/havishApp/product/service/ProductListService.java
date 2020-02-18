package com.havishApp.product.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.havishApp.Exception.NoDataFoundException;
import com.havishApp.Exception.NoRecordFoundException;
import com.havishApp.product.dao.IProductListDao;
import com.havishApp.product.model.Vo.CategoryListVo;
import com.havishApp.product.model.Vo.ProdSubCatVo;
import com.havishApp.product.model.Vo.ProductListVo;
import com.havishApp.product.model.pojo.CategoryList;
import com.havishApp.product.model.pojo.ProdSubCat;
import com.havishApp.product.model.pojo.ProductList;

@Service
public class ProductListService implements IProductListService {

	@Autowired
	IProductListDao productListDao;

	Logger logger = Logger.getLogger(ProductListService.class);

public List<CategoryListVo> selectCategoryList() throws NoDataFoundException {
		
		logger.debug("selectCategoryList");
		List<CategoryList> productCatList = new ArrayList<CategoryList>();
		List<CategoryListVo> categoryListVos = new ArrayList<CategoryListVo>();

		try {
			productCatList = productListDao.selectCategoryList();
			for (CategoryList catgrylist : productCatList) {
				CategoryListVo categoryList = new CategoryListVo();
				categoryList.setCategoryId(catgrylist.getCategoryId());
				categoryList.setCategoryName(catgrylist.getCategoryName());
				logger.debug("service method" + categoryList.getCategoryId());
				categoryListVos.add(categoryList);
			}
		} catch (NoRecordFoundException e) {
			throw new NoDataFoundException();
		}
		logger.debug("after completion");
		return categoryListVos;
	}

	public List<ProdSubCatVo> selectAllProdSubCategory() throws NoDataFoundException {
		
		List<ProdSubCat> productCatList = new ArrayList<ProdSubCat>();
		ProdSubCatVo prodSubCatVo = new ProdSubCatVo();
		List<ProdSubCatVo> prodSubCatVos = new ArrayList<ProdSubCatVo>();

		try {
			productCatList = productListDao.selectAllProductCategoryList();
			for (ProdSubCat prodSubCat : productCatList) {

				prodSubCatVo.setProdSubCatgryId(prodSubCat.getProdSubCatgryId());
				prodSubCatVo.setProdSubCatName(prodSubCat.getProdSubCatName());
				prodSubCatVo.setCatgryId(prodSubCat.getCatgryId());
				prodSubCatVos.add(prodSubCatVo);
			}
		} catch (NoRecordFoundException e) {
			throw new NoDataFoundException();
		}
		logger.debug("productCatList" + productCatList.size());
		return prodSubCatVos;
	}

	public List<ProductListVo> selectProductList(String prodCat, int minPrice, int maxPrice, String brand[],
			String prodSearchString,String order) throws NoDataFoundException {

		List<ProductList> productList = new ArrayList<ProductList>();
		List<ProductListVo> productListVos = new ArrayList<ProductListVo>();
		ProdSubCat prodSubCat = new ProdSubCat();
		/*
		 * String brand[] =new String[]{"ClassMate"}; String prodSearchString =
		 * "ClassMate";
		 */

		// if(!prodCat.equals("")) {
		try {
			productList = productListDao.selectProductListByCategory(prodCat, minPrice, maxPrice, brand, prodSearchString,order);
			prodSubCat = productListDao.selectProdCategoriesAndSubCat(prodCat);
		
		logger.debug("productList" + productList.size());

		for (int i = 0; i < productList.size(); i++) {

			ProductListVo productListVo = new ProductListVo();
			productListVo.setProductId(productList.get(i).getProductId());
			productListVo.setProductName(productList.get(i).getProductName());
			productListVo.setCategryId(productList.get(i).getCategryId());
			productListVo.setProductCatgryId(productList.get(i).getProductCatgryId());
			productListVo.setPrice(productList.get(i).getPrice());
			productListVo.setProductAvailabilty(productList.get(i).getProductAvailabilty());
			productListVo.setProductDesc(productList.get(i).getProductDesc());
			productListVo.setRating(productList.get(i).getRating());
			productListVo.setBrand(productList.get(i).getBrand());
			productListVo.setProductAttribute(productList.get(i).getProductAttribute());
			productListVo.setProductImage(productList.get(i).getProductImage());
			productListVo.setCategoryName(prodSubCat.getCatgryName());
			productListVo.setProdSubCatName(prodSubCat.getProdSubCatName());
			productListVo.setProdVarientId(productList.get(i).getProdVarientId());
			productListVos.add(productListVo);
		}
		}catch(NoRecordFoundException e) {
			throw new NoDataFoundException();
		}
		
		return productListVos;
	}

	public ProductListVo selectProductDetails(String prodId) throws NoDataFoundException {

		ProductList productList = new ProductList();
		ProductListVo productListVo = new ProductListVo();

		try {
			productList = productListDao.selectProductDetails(prodId);
			productListVo.setProductId(productList.getProductId());
			productListVo.setProductName(productList.getProductName());
			productListVo.setCategryId(productList.getCategryId());
			productListVo.setProductCatgryId(productList.getProductCatgryId());
			productListVo.setPrice(productList.getPrice());
			productListVo.setProductDesc(productList.getProductDesc());
			productListVo.setProductAvailabilty(productList.getProductAvailabilty());
			if (productList.getProductAvailabilty() > 0)
				productListVo.setStockAvailable("In Stock");
			else
				productListVo.setStockAvailable("Out Of Stock");
			productListVo.setBrand(productList.getBrand());
			productListVo.setRating(productList.getRating());
			productListVo.setProductAttribute(productList.getProductAttribute());
			productListVo.setProductImage(productList.getProductImage());
			
			ProdSubCat prodSub = productListDao.selectProdCategoriesAndSubCat(productList.getProductCatgryId());
			productListVo.setCategoryName(prodSub.getCatgryName());
			productListVo.setProdSubCatName(prodSub.getProdSubCatName());
			productListVo.setProdVarientId(productList.getProdVarientId());
			
			System.out.println("category name"+productListVo.getCategoryName() + "" +productListVo.getProdSubCatName());

		} catch (NoRecordFoundException e) {
			logger.debug("Data Not Fpund");
			throw new NoDataFoundException();
		}
		
		//catgrylist = productListDao.selectCategoryList();
		
			
		

		//System.out.println("system index"+catgName);
		
		//String catId=productList.getProductCatgryId();
		/*
		  Map<String,String> categoryLst = new HashMap<String,String>(); 
		  for(int i=0;i<catgrylist.size();i++) {
			  categoryLst.put(catgrylist.get(i).getCategoryId(),catgrylist.get(i).getCategoryName());
		  }
		  categoryLst.forEach((key,value)->{
			     System.out.println("Key: "+key + " value: "+value);
			     if(key.equals(catId)) {
			    	 System.out.println("category name"+catId);
			     }
		});
		  */
		  

		return productListVo;
	}

	public List<ProdSubCatVo> selectProdSubCategoryByCategry(String catgryId) throws NoDataFoundException {

		List<ProdSubCat> productCatList = new ArrayList<ProdSubCat>();
		List<ProdSubCatVo> prodSubCatVos = new ArrayList<ProdSubCatVo>();

		try {
			productCatList = productListDao.selectSingleProductCategoryList(catgryId);
			for (ProdSubCat prodSubCat : productCatList) {
				ProdSubCatVo prodSubCatVo = new ProdSubCatVo();
				prodSubCatVo.setProdSubCatgryId(prodSubCat.getProdSubCatgryId());
				prodSubCatVo.setProdSubCatName(prodSubCat.getProdSubCatName());
				prodSubCatVo.setCatgryId(prodSubCat.getCatgryId());
				prodSubCatVos.add(prodSubCatVo);
			}
		} catch (NoRecordFoundException e) {
			throw new NoDataFoundException();
		}
		

		return prodSubCatVos;
	}

	public List<ProductListVo> selectProductDetailsByOrder(String prodCat, String orderBy) {

		List<ProductList> productList = new LinkedList<ProductList>();
		List<ProductListVo> productListVos = new ArrayList<ProductListVo>();
		ProdSubCat prodSubCat = new ProdSubCat();
		ProductListVo productLstVo = new ProductListVo();
		logger.debug("select by category");
		productList = productListDao.selectProductListByPrice(prodCat, orderBy);
		prodSubCat = productListDao.selectProdCategoriesAndSubCat(prodCat);
		logger.debug("productList" + productList.size());

		for (int i = 0; i < productList.size(); i++) {
			ProductListVo productListVo = new ProductListVo();
			System.out.println("in service vo values" + productList.get(i).getProductId());
			System.out.println("vo first values product Id" + productList.get(i).getBrand());
			productListVo.setProductId(productList.get(i).getProductId());
			productListVo.setProductName(productList.get(i).getProductName());
			productListVo.setCategryId(productList.get(i).getCategryId());
			productListVo.setProductCatgryId(productList.get(i).getProductCatgryId());
			productListVo.setPrice(productList.get(i).getPrice());
			productListVo.setProductAvailabilty(productList.get(i).getProductAvailabilty());
			productListVo.setProductDesc(productList.get(i).getProductDesc());
			productListVo.setRating(productList.get(i).getRating());
			productListVo.setBrand(productList.get(i).getBrand());
			productListVo.setProductAttribute(productList.get(i).getProductAttribute());
			productListVo.setProductImage(productList.get(i).getProductImage());
			productListVo.setCategoryName(prodSubCat.getCatgryName());
			productListVo.setProdSubCatName(prodSubCat.getProdSubCatName());
			productListVos.add(productListVo);
		}
		productListVos.add(productLstVo);
		/*
		 * System.out.println("distinct products" +
		 * productListVos.get(1).getDistinctBrand()); for (ProductListVo vo :
		 * productListVos) { System.out.println("in service vo values" +
		 * vo.getBrand().toString()); System.out.println("vo values product Id" +
		 * vo.getProductId().toString()); }
		 */
		return productListVos;
	}

	public List<String> selectDistinctBrands(String prodCat) {
		
		List<String> brandsList = new ArrayList<String>();
		
		brandsList = productListDao.selectBrands(prodCat);
		
		logger.debug("prodCat is"+prodCat);
		return brandsList;
	}
	public List<String> selectDistinctBrandBySearch(String searchKey) {
		
		List<String> brandsList = new ArrayList<String>();
		try {
			brandsList = productListDao.selectBrandBySearch(searchKey);
		} catch (NoRecordFoundException e) {
			
		}		
		return brandsList;
	}
}
