package com.havishApp.user.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.havishApp.Exception.DataAlreadyExistsException;
import com.havishApp.Exception.DeleteFailedException;
import com.havishApp.Exception.NoDataFoundException;
import com.havishApp.Exception.UpdateFailedException;
import com.havishApp.model.order.vo.OrderVo;
import com.havishApp.user.model.vo.AddressResponse;
import com.havishApp.user.model.vo.AddressVo;
import com.havishApp.user.service.IAddressService;

@Controller
public class AddressController {

	@Autowired
	IAddressService addressService;
	
	Logger logger=Logger.getLogger(AddressController.class);
	
	@RequestMapping(value="/getAllCusAddress",method = RequestMethod.GET,produces="application/json")
	@ResponseBody public AddressResponse getAllAddress(){
		
		AddressResponse response = new AddressResponse();
		List<AddressVo> addressListVo = new ArrayList<AddressVo>();
		
		try {
			addressListVo = addressService.selectAddressList();
			response.setStatus("HV0001");
			response.setMessage("Data retrived Sucessfully");
			response.setAddressListObj(addressListVo);
		} catch (NoDataFoundException e) {		
			response.setMessage("No Record Found!!");
			response.setStatus("HV40004");
		}
		return response;	
	}
	
	@RequestMapping(value="/addCusAddress",method = RequestMethod.POST,produces="application/json")
	@ResponseBody public AddressResponse addNewAddress(@RequestBody AddressVo addressVo){
		
		AddressResponse response = new AddressResponse();

		try {
			addressService.saveAddress(addressVo);
			response.setStatus("HV40001");
			response.setMessage("Data added Sucessfully");
		} catch (DataAlreadyExistsException e) {			
			response.setMessage("Data Already Exists");
			response.setStatus("HV40003");
		}
		return response;	
	}
	
	@RequestMapping(value="/editCusAddress",method = RequestMethod.POST,produces="application/json")
	@ResponseBody public AddressResponse updateAddress(@RequestBody AddressVo addressVo){
		
		AddressResponse response = new AddressResponse();
		try {
			addressService.editAddress(addressVo);		
			response.setStatus("HV40001");
			response.setMessage("Data updated Sucessfully");
		} catch (UpdateFailedException e) {	
			response.setMessage("Update Failed");
			response.setStatus("HV40005");
		}
		return response;	
	}
	
	@RequestMapping(value="/deleteCusAddress/{adrsId}",method = RequestMethod.POST,produces="application/json")
	@ResponseBody public AddressResponse deleteAddress(@PathVariable("adrsId") String adrsId){
		
		AddressResponse response = new AddressResponse();
		AddressVo addressVo=new AddressVo();
		try {
			addressVo.setAddressId(adrsId);
			addressService.deleteAddress(addressVo);		
			response.setStatus("HV40001");
			response.setMessage("Data Deleted Sucessfully");
		} catch (DeleteFailedException e) {	
			response.setMessage("Delete Failed");
			response.setStatus("HV40006");
		}
		return response;	
	}
}
