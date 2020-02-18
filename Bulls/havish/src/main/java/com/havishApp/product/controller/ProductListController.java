package com.havishApp.product.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.havishApp.Exception.NoDataFoundException;
import com.havishApp.product.dao.IProdVarientDao;
import com.havishApp.product.model.Vo.CategoryListVo;
import com.havishApp.product.model.Vo.ProdSubCatVo;
import com.havishApp.product.model.Vo.ProductListVo;
import com.havishApp.product.model.Vo.ProductMasterVo;
import com.havishApp.product.service.IProductListService;

@Controller
public class ProductListController {
	@Autowired
	IProductListService productListService;
	@Autowired
	IProdVarientDao prodVarDao;
	// Selecting all products and all product list

	Logger logger = Logger.getLogger(ProductListController.class);

	@RequestMapping(value = "/productSubCat", method = RequestMethod.GET)
	public ModelAndView selectProdSubCategory(@RequestParam String catgryId, HttpServletRequest request,
			HttpServletResponse response) {

		ModelAndView mav = new ModelAndView();
		List<ProdSubCatVo> productLstVo = new ArrayList<ProdSubCatVo>();
		Map<String, String> mapResult = new HashMap();

		try {
			productLstVo = productListService.selectProdSubCategoryByCategry(catgryId);
			for (ProdSubCatVo prodVo : productLstVo) {
				mapResult.put(prodVo.getProdSubCatgryId(), prodVo.getProdSubCatName());
			}
			mav.addObject(productLstVo);

		} catch (NoDataFoundException e) {
		}
		mav.setViewName("index");
		return mav;
	}

	// selecting product list based on sub category
	@RequestMapping(value = "/productsList", method = RequestMethod.GET)
	public ModelAndView selectProdBasedOnSubCategory(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("prodlst") ProductListVo productListVo,@ModelAttribute("catgryVo") CategoryListVo categoryListVo) {

		ModelAndView mav = new ModelAndView();
		
		List<CategoryListVo> catgryVo = new ArrayList<CategoryListVo>();
		try {
			System.out.println("controller  home page method");
			catgryVo = productListService.selectCategoryList();
			
		} catch (NoDataFoundException e) {
		}
		mav.addObject("catgryVo", catgryVo);


		List<ProductListVo> productListVos = new ArrayList<ProductListVo>();
		List<String> brandsList = new ArrayList<String>();
		int minPrice = 1;
		int maxPrice = 99999999;
		String[] brand = new String[0];
		String prodSearchString = "";

		String prodCat = request.getParameter("prodCatg");
		
		

		try {

			productListVos = productListService.selectProductList(prodCat, minPrice, maxPrice, brand, prodSearchString,"asc");
			
			brandsList = productListService.selectDistinctBrands(prodCat);
			
			mav.addObject("prodlst", productListVos);
			mav.addObject("catgryName", productListVos.get(0).getCategoryName());
			mav.addObject("subcatgryId", productListVos.get(0).getProductCatgryId());
			mav.addObject("prodCatgryName", productListVos.get(0).getProdSubCatName());
			mav.addObject("distinctBrands", brandsList);
			mav.addObject("SearchString", prodSearchString);

			System.out.println("product brands" + productListVos.get(0).getDistinctBrand());
			for (ProductListVo vo : productListVos) {
				System.out.println("vo values" + vo.getBrand().toString());
				System.out.println("vo values product Id" + vo.getProductId().toString());
				System.out.println("vo brandsList" + brandsList);
			}
			mav.setViewName("productList");
			mav.addObject("prodlst", productListVos);
		} catch (NoDataFoundException e) {
			mav.setViewName("error");
		}
		return mav;
	}

	// method for product details
	@RequestMapping(value = "/productsDtls", method = RequestMethod.GET)
	public ModelAndView selectProdDetails(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("prodlst") ProductListVo productListVo, @RequestParam("productId") String prodId) {

		ProductListVo prodlst = new ProductListVo();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("product_details");
		try {

			// String prodId = request.getParameter("productId");
			System.out.println("select a product" + prodId);
			prodlst = productListService.selectProductDetails(prodId);
			mav.addObject("prodlst", prodlst);
		} catch (NoDataFoundException e) {
			mav.addObject("");
		}
		return mav;
	}

	@RequestMapping(value = "/prodByPriceRange", method = RequestMethod.GET)
	@ResponseBody
	public ProductMasterVo selectProdListByPriceRange(HttpServletRequest request, HttpSession httpSession,
			@RequestParam("valueMin")String valueMin,@RequestParam("valueMax")String valueMax,
			@RequestParam("subCatgry")String subCatgry,@RequestParam("searchString")String searchString,@RequestParam("order")String order) {

		// filter search
		ProductMasterVo masterVo = new ProductMasterVo();
		List<ProductListVo> prodlst = new ArrayList<ProductListVo>();
		
		/*
		 * String min = request.getParameter("minValue"); String max =
		 * request.getParameter("maxValue");
		 * 
		 * int minPrice = (int) Double.parseDouble(min); int maxPrice = (int)
		 * Double.parseDouble(max);
		 */
		int min = (int) Double.parseDouble(valueMin); 
		int max = (int) Double.parseDouble(valueMax);
		
		logger.debug("minimum value"+min);
		logger.debug("maximum value"+max);
			
		String[] brand = (String[]) request.getSession().getAttribute("brandSession");
		
		String orderBy = (String) request.getSession().getAttribute("order");
		
		request.getSession().setAttribute("valueMinSes", min);
		request.getSession().setAttribute("valueMaxSes", max);
		
		
		
		logger.debug("brand"+brand);
		if(!subCatgry.contentEquals("")) {
			String searchString1 =(String)request.getSession().getAttribute("searchKey1");
			logger.debug("search string in by price"+searchString1);

		}else {
			searchString =null;
			logger.debug("searchstr");
		}
		
		logger.debug("order passed" +order);
		  try { 
			  System.out.println("select a product");
		 
			  prodlst = productListService.selectProductList(subCatgry, min, max, brand, searchString,order); 
			  logger.debug("prodlst size"+prodlst.size());
			  masterVo.setProdListVo(prodlst); 
			  } 
		  catch (NoDataFoundException e) {
			  logger.debug("Nodata found");
		  }
		 
		return masterVo;
	}

	/*
	 * @RequestMapping(value="/prodByPriceRange",method=RequestMethod.GET) public
	 * ModelAndView selectProdListByPriceRange(HttpServletRequest
	 * request,HttpServletResponse response,String prodCatId,
	 * 
	 * @ModelAttribute("productListVo")ProductListVo productListVo) {
	 * 
	 * //filter search
	 * 
	 * List<ProductListVo> prodlst =new ArrayList<ProductListVo>(); ModelAndView mav
	 * = new ModelAndView(); String min = request.getParameter("minValue"); String
	 * max =request.getParameter("maxValue");
	 * 
	 * int minPrice = (int) Double.parseDouble(min); int maxPrice =
	 * (int)Double.parseDouble(max);
	 * 
	 * System.out.println("minPrice"+minPrice);
	 * System.out.println("maxPrice"+maxPrice);
	 * 
	 * int minPrice = 20; int maxPrice = 350;
	 * 
	 * 
	 * String[] brand=new String[0]; String prodSearchString="";
	 * 
	 * System.out.println("minPrice"+minPrice+"maxPrice"+maxPrice);
	 * mav.setViewName("productList"); try { System.out.println("select a product");
	 * String prodCat = "SBCT005"; prodlst =
	 * productListService.selectProductList(prodCat,minPrice,maxPrice,brand,
	 * prodSearchString); mav.addObject("prodlst",prodlst); } catch
	 * (NoDataFoundException e) { mav.addObject(""); } return mav; }
	 */

	@RequestMapping(value = "/prodListByBrand", method = RequestMethod.GET)
	@ResponseBody
	public ProductMasterVo selectProdListByBrand(@RequestParam("myArray[]") List<String> myArray,
			@RequestParam("subCatgry") String subCatgry, @RequestParam("searchString") String searchString,
				HttpServletRequest request, HttpSession httpSession) {

		//int minPrice = 0;
		//int maxPrice = 999999;

		logger.debug("subCatgry in searchby br" + subCatgry);

		logger.debug("subCatgry in searchString br" + searchString);

		List<String> brandsList = new ArrayList<String>();
		List<ProductListVo> prodlst = new ArrayList<ProductListVo>();

		String[] brand = myArray.toArray(new String[myArray.size()]);
		request.getSession().setAttribute("brandSession", brand);
		
		int minPrice = (int) request.getSession().getAttribute("valueMinSes");
		int maxPrice = (int) request.getSession().getAttribute("valueMaxSes");
		
		logger.debug("brand array" + brand);
		logger.debug("minPrice array" + minPrice);
		logger.debug("maxPrice" + maxPrice);
		//ModelAndView mav = new ModelAndView();
		//mav.setViewName("productList");
		
		String searchString1 =(String)request.getSession().getAttribute("searchKey1");
		logger.debug("search string in by price"+searchString1);

		try {
			prodlst = productListService.selectProductList(subCatgry, minPrice, maxPrice, brand, searchString1,"asc");
		} catch (NoDataFoundException e) {

		}
		logger.debug("search string searchString" + searchString);

		// when subcategory is available then

		if (searchString != null || !searchString.equals("")) {
			brandsList = productListService.selectDistinctBrands(subCatgry);
		} else {

			brandsList = productListService.selectDistinctBrandBySearch(searchString);
		}

		ProductMasterVo prodMasterVo = new ProductMasterVo();
		prodMasterVo.setProdListVo(prodlst);
		prodMasterVo.setDistinctBrands(brandsList.toArray(new String[brandsList.size()]));

		/*
		 * mav.addObject("distinctBrands",brandsList); mav.addObject("prodlst",prodlst);
		 */

		return prodMasterVo;
	}

	@RequestMapping(value = "/prodBySearchKey", method = RequestMethod.GET)
	public ModelAndView selectProdListBySearch(HttpServletRequest request, HttpServletResponse response,
			String searchKey, @ModelAttribute("productListVo") ProductListVo productListVo,@ModelAttribute("catgryVo") CategoryListVo categoryListVo) {

		ModelAndView mav = new ModelAndView();
		
		List<CategoryListVo> catgryVo = new ArrayList<CategoryListVo>();
		try {
			System.out.println("controller  home page method");
			catgryVo = productListService.selectCategoryList();
			
		} catch (NoDataFoundException e) {
		}
		mav.addObject("catgryVo", catgryVo);

		List<ProductListVo> prodlst = new ArrayList<ProductListVo>();
	
		List<String> brandsList = new ArrayList<String>();

		int minPrice = 0;
		int maxPrice = 999999;
		String[] brand = new String[0];
		mav.setViewName("productList");
		try {
			System.out.println("select a product");
			prodlst = productListService.selectProductList(null, minPrice, maxPrice, brand, searchKey,"asc");

			Set<String> brands = new LinkedHashSet<String>();
			for (int i = 0; i < prodlst.size(); i++) {
				brands.add(prodlst.get(i).getBrand());
			}

			for (String t : brands)
				brandsList.add(t);
			/*
			 * String[] prodCaArr= new String[prodlst.size()]; for(int
			 * i=0;i<prodlst.size();i++) { prodCaArr[i] =
			 * prodlst.get(i).getProductCatgryId(); }
			 * 
			 * brandsList = productListService.selectDistinctBrands(prodCaArr);
			 */

			System.out.println("brands in search method" + brandsList);
			// mav.addObject("catgryName",prodlst.get(0).getCategoryName());
			// mav.addObject("subcatgryId",productListVos.get(0).getProductCatgryId());
			// mav.addObject("prodCatgryName",productListVos.get(0).getProdSubCatName());
			
			request.getSession().setAttribute("searchKey1", searchKey);
			mav.addObject("searchKey", searchKey);
			mav.addObject("distinctBrands", brands);
			mav.addObject("prodlst", prodlst);
		} catch (NoDataFoundException e) {
			mav.addObject("", prodlst);
		}
		return mav;
	}

	@RequestMapping(value = "/productsListByPrice", method = RequestMethod.GET)
	public @ResponseBody List<ProductListVo> selectProductListByPrice(@RequestParam("subCatgry") String subCatgry,
			@RequestParam("order") String order,HttpServletRequest request,HttpSession session) {
		String response = "";
		List<ProductListVo> prodListVo = new ArrayList<ProductListVo>();

		System.out.println("subCatgry" + subCatgry + "order" + order);
		request.getSession().setAttribute("order", order);
		prodListVo = productListService.selectProductDetailsByOrder(subCatgry, order);
		
		System.out.println("ajax method called");
		return prodListVo;
	}

}
