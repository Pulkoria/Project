package com.havishApp.product.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.havishApp.Exception.DataAlreadyExistsException;
import com.havishApp.Exception.DeleteFailedException;
import com.havishApp.Exception.NoDataFoundException;
import com.havishApp.Exception.UpdateFailedException;
import com.havishApp.product.model.Vo.ProductVarientResponse;
import com.havishApp.product.model.Vo.ProductVarientVo;
import com.havishApp.product.service.IProductVarientService;

@Controller
public class ProductVarientController {

	@Autowired
	IProductVarientService productVarientService;
	
	@RequestMapping(value="/getProdVarList",method = RequestMethod.GET,produces="application/json")
	@ResponseBody ProductVarientResponse getProdVarientList(){
		ProductVarientResponse response = new ProductVarientResponse();
		
		List<ProductVarientVo> prodarListVo = new ArrayList<ProductVarientVo>();
		try {
			prodarListVo = productVarientService.selectProductVarienList();
			response.setAddressListObj(prodarListVo);
			response.setSucessCode("HV40001");
			response.setSuccessMessage("Data Retrieved Succesfully");
		} catch (NoDataFoundException e) {		
			response.setErrorCode("HV4000");
			response.setErrorMessage("No Record Found!!");
		}
		return response;	
	}
	
	@RequestMapping(value="/addProdVar",method = RequestMethod.GET,produces="application/json")
	@ResponseBody ProductVarientResponse addNewAddress(ProductVarientVo productVarientVo){
		
		ProductVarientResponse response = new ProductVarientResponse();
		try {
			productVarientService.saveProductVarient(productVarientVo);
			response.setSucessCode("HV40001");
			response.setSuccessMessage("Data added Sucessfully");
		} catch (DataAlreadyExistsException e) {	
			
			response.setErrorCode("No Record Found!!");
			response.setErrorMessage("HV40004");
		}
		return response;	
	}
	
	@RequestMapping(value="/editProdVar",method = RequestMethod.GET,produces="application/json")
	@ResponseBody ProductVarientResponse updateAddress(ProductVarientVo productVarientVo){
		
		ProductVarientResponse response = new ProductVarientResponse();
		
		try {
			productVarientService.editProductVarient(productVarientVo);
			response.setSucessCode("HV40001");
			response.setSuccessMessage("Data updated Sucessfully");
		} catch (UpdateFailedException e) {	
			response.setErrorCode("HV40005");
			response.setErrorMessage("Update Failed");
		}
		return response;	
	}
	
	@RequestMapping(value="/deleteProdVar",method = RequestMethod.GET,produces="application/json")
	@ResponseBody ProductVarientResponse deleteAddress(ProductVarientVo productVarientVo){
		
		ProductVarientResponse response = new ProductVarientResponse();
		
		try {
			productVarientService.deleteProductVarient(productVarientVo);	
			response.setSucessCode("HV40001");
			response.setSuccessMessage("Data updated Sucessfully");
		} catch (DeleteFailedException e) {	
			response.setErrorCode("HV40006");
			response.setErrorMessage("delete Failed");
		}
		return response;	
	}
	
}
