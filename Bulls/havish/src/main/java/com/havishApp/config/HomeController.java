package com.havishApp.config;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.havishApp.Exception.NoDataFoundException;
import com.havishApp.product.model.Vo.CategoryListVo;
import com.havishApp.product.model.Vo.ProdSubCatVo;
import com.havishApp.product.service.IProductListService;

@Controller
public class HomeController {

	@Autowired
	IProductListService productListService;
	
	Logger logger=Logger.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView loadHomePage(HttpSession sdession) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		List<CategoryListVo> catgryVo = new ArrayList<CategoryListVo>();
		try {
			System.out.println("controller  home page method");
			catgryVo = productListService.selectCategoryList();
			
		} catch (NoDataFoundException e) {
		}
		mav.addObject("catgryVo", catgryVo);
		return mav;
	}
	
	/*
	 * @RequestMapping(value = "/catgryList", method = RequestMethod.GET)
	 * public @ResponseBody List<CategoryListVo> selectprodSubCatgry() {
	 * 
	 * 
	 * 
	 * ModelAndView mav = new ModelAndView(); List<CategoryListVo> catgryVo = new
	 * ArrayList<CategoryListVo>(); try {
	 * System.out.println("controller  home page method"); catgryVo =
	 * productListService.selectCategoryList();
	 * 
	 * } catch (NoDataFoundException e) { } mav.setViewName("index");
	 * System.out.println("ajax method called"); return productLstVo; }
	 */
	
	@RequestMapping(value = "/subCatgryList", method = RequestMethod.GET)
	public @ResponseBody List<ProdSubCatVo> selectprodSubCatgry(
	            @RequestParam("subCatgry") String subCatgry) {
	        
	        List<ProdSubCatVo> prodSubCatVo=new ArrayList<ProdSubCatVo>();

	        System.out.println("subCatgry"+subCatgry);
	        //ModelAndView mav = new ModelAndView();
			List<ProdSubCatVo> productLstVo = new ArrayList<ProdSubCatVo>();

			try {
				productLstVo = productListService.selectProdSubCategoryByCategry(subCatgry);
				
				for(int i=0;i<productLstVo.size();i++) {
					System.out.println("sub categories"+productLstVo.get(i).getProdSubCatName() +"id"+productLstVo.get(i).getProdSubCatgryId());
				}
				
				//mav.addObject("catgryVo", productLstVo);
				
			} catch (NoDataFoundException e) {			
			}
			//mav.setViewName("index");
			logger.debug("productCatListVo size"+productLstVo.size());
			logger.debug("productCatList"+productLstVo.get(0).getProdSubCatName());
	        System.out.println("ajax method called");
	        return productLstVo;
	}
	
	@RequestMapping(value = "/catgryList", method = RequestMethod.GET,produces="application/json")
	@ResponseBody public CategoryListResponse getCategoryList() {

		CategoryListResponse response = new CategoryListResponse();
		List<CategoryListVo> catgryVo = new ArrayList<CategoryListVo>();
		try {
			System.out.println("controller  home page method");
			catgryVo = productListService.selectCategoryList();
			response.setCatgryList(catgryVo);
			response.setStatus("success");
			response.setMessage("Data Retrieved Successfully");
		} catch (NoDataFoundException e) {
			response.setStatus("error");
			response.setMessage("No Data Found");
		}	
		return response;
	}
	
	@RequestMapping(value = "/prodSubCatgryList", method = RequestMethod.POST,produces="application/json")
	public @ResponseBody CategoryListResponse selectprodSubCatgry(@RequestBody ProdSubCatVo prodSubCatVo) {
	        
			List<ProdSubCatVo> productLstVo = new ArrayList<ProdSubCatVo>();
			CategoryListResponse response = new CategoryListResponse();

			try {
				productLstVo = productListService.selectProdSubCategoryByCategry(prodSubCatVo.getCatgryId());
				response.setProdSubCatList(productLstVo);
				response.setStatus("success");
				response.setMessage("Data Retrieved Successfully");
			} catch (NoDataFoundException e) {			
				response.setStatus("error");
				response.setMessage("No Data Found");
			}
	       return response;
	}
	
	
	
	
}
