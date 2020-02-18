package com.havishApp.product.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.havishApp.Exception.NoDataFoundException;
import com.havishApp.product.model.Vo.ProductDetailsResponse;
import com.havishApp.product.model.Vo.ProductListResponse;
import com.havishApp.product.model.Vo.ProductListVo;
import com.havishApp.product.service.IProductListService;

@RestController
public class ProductRestController {
	
	@Autowired
	IProductListService prodListService;
	
	Logger logger = Logger.getLogger(ProductRestController.class);

	/*
	 * @RequestMapping(value="/prodDtls/{productId}",method=RequestMethod.GET,
	 * produces="application/json") public ProductDetailsResponse
	 * selectProductDetails(@PathVariable("productId") String productId) {
	 * 
	 * ProductListVo prodLstVo = new ProductListVo(); ProductDetailsResponse
	 * productResponse=new ProductDetailsResponse();
	 * 
	 * try { prodLstVo = prodListService.selectProductDetails(productId);
	 * productResponse.setProdct(prodLstVo); productResponse.setStatus("Sucess");
	 * productResponse.setMessage("Data retrieved"); } catch (NoDataFoundException
	 * e) { productResponse.setStatus("Error");
	 * productResponse.setMessage("No product details available for this id"); }
	 * 
	 * return productResponse; }
	 * 
	 * @RequestMapping(value="/prodListbyCatgry/{subCatgry}",method =
	 * RequestMethod.GET,produces="application/json") public ProductListResponse
	 * selectProductListByCatgry(@PathVariable("subCatgry") String prodSubCatgry) {
	 * ProductListResponse reponse = new ProductListResponse(); List<ProductListVo>
	 * list=new ArrayList<ProductListVo>(); int minPrice =0; int maxPrice=99999999;
	 * 
	 * try { list = prodListService.selectProductList(prodSubCatgry, minPrice,
	 * maxPrice, null, null); reponse.setProdListVo(list);
	 * reponse.setStatus("success");
	 * reponse.setMessage("Data retrieved successfully"); } catch
	 * (NoDataFoundException e) { reponse.setStatus("error");
	 * reponse.setMessage("No Data Found"); } return reponse; }
	 * 
	 * @RequestMapping(value="/prodListbySearch/{searchKey}",method =
	 * RequestMethod.GET,produces="application/json") public ProductListResponse
	 * selectProductListBySearch(@PathVariable("searchKey") String searchKey) {
	 * ProductListResponse reponse = new ProductListResponse(); List<ProductListVo>
	 * list=new ArrayList<ProductListVo>(); int minPrice =0; int maxPrice=99999999;
	 * 
	 * try { list = prodListService.selectProductList(null, minPrice,
	 * maxPrice,null,searchKey); reponse.setProdListVo(list);
	 * reponse.setStatus("success");
	 * reponse.setMessage("Data retrieved successfully"); } catch
	 * (NoDataFoundException e) { reponse.setStatus("error");
	 * reponse.setMessage("No Data Found"); } return reponse; }
	 * 
	 * @RequestMapping(value=
	 * "/prodListbySearchPrice/{searchKey}/{minValue}/{maxValue}/",method =
	 * RequestMethod.GET,produces="application/json") public ProductListResponse
	 * selectProductListBySearchPrice(@PathVariable("searchKey") String
	 * searchKey,@PathVariable("minValue") int minPrice,
	 * 
	 * @PathVariable("maxValue")int maxPrice) { ProductListResponse reponse = new
	 * ProductListResponse(); List<ProductListVo> list=new
	 * ArrayList<ProductListVo>();
	 * 
	 * try { list = prodListService.selectProductList(null, minPrice,
	 * maxPrice,null,searchKey); reponse.setProdListVo(list);
	 * reponse.setStatus("success");
	 * reponse.setMessage("Data retrieved successfully"); } catch
	 * (NoDataFoundException e) { reponse.setStatus("error");
	 * reponse.setMessage("No Data Found"); } return reponse; }
	 * 
	 * @RequestMapping(value=
	 * "/prodListbySearchPriceBrands/{searchKey}/{minValue}/{maxValue}/{brands}",
	 * method = RequestMethod.GET,produces="application/json") public
	 * ProductListResponse
	 * selectProductListBySearchPriceBrands(@PathVariable("searchKey") String
	 * searchKey,@PathVariable("minValue") int minPrice,
	 * 
	 * @PathVariable("maxValue")int maxPrice,@PathVariable("brands") String
	 * brands[]) { ProductListResponse reponse = new ProductListResponse();
	 * List<ProductListVo> list=new ArrayList<ProductListVo>();
	 * logger.debug("brands"+brands[0]); try { list =
	 * prodListService.selectProductList(null, minPrice, maxPrice,brands,searchKey);
	 * reponse.setProdListVo(list); reponse.setStatus("success");
	 * reponse.setMessage("Data retrieved successfully"); } catch
	 * (NoDataFoundException e) { reponse.setStatus("error");
	 * reponse.setMessage("No Data Found"); } return reponse; }
	 * 
	 * @RequestMapping(value=
	 * "/prodListbyCatgryPrice/{subCatgry}/{minValue}/{maxValue}",method =
	 * RequestMethod.GET,produces="application/json") public ProductListResponse
	 * selectProductListBySCatgryPrice(@PathVariable("subCatgry") String
	 * subCatgry,@PathVariable("minValue") int minPrice,
	 * 
	 * @PathVariable("maxValue")int maxPrice) { ProductListResponse reponse = new
	 * ProductListResponse(); List<ProductListVo> list=new
	 * ArrayList<ProductListVo>();
	 * 
	 * try { list = prodListService.selectProductList(subCatgry, minPrice,
	 * maxPrice,null,null); reponse.setProdListVo(list);
	 * reponse.setStatus("success");
	 * reponse.setMessage("Data retrieved successfully"); } catch
	 * (NoDataFoundException e) { reponse.setStatus("error");
	 * reponse.setMessage("No Data Found"); } return reponse; }
	 * 
	 * 
	 * @RequestMapping(value=
	 * "/prodListbyCatgryPriceBrands/{subCatgry}/{minValue}/{maxValue}/{brands}",
	 * method = RequestMethod.GET,produces="application/json") public
	 * ProductListResponse
	 * selectProductListByCatgryPriceBrands(@PathVariable("subCatgry") String
	 * subCatgry,@PathVariable("minValue") int minPrice,
	 * 
	 * @PathVariable("maxValue")int maxPrice,@PathVariable("brands") String
	 * brands[]) { ProductListResponse reponse = new ProductListResponse();
	 * List<ProductListVo> list=new ArrayList<ProductListVo>();
	 * logger.debug("brands"+brands[0]); try { list =
	 * prodListService.selectProductList(subCatgry, minPrice, maxPrice,brands,null);
	 * reponse.setProdListVo(list); reponse.setStatus("success");
	 * reponse.setMessage("Data retrieved successfully"); } catch
	 * (NoDataFoundException e) { reponse.setStatus("error");
	 * reponse.setMessage("No Data Found"); } return reponse; }
	 * 
	 */
}
