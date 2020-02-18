package com.havishApp.order.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.havishApp.Exception.DataAlreadyExistsException;
import com.havishApp.model.order.vo.UserCartVo;
import com.havishApp.order.Service.IUserCartService;
import com.havishApp.product.service.IProductListService;
@Controller
public class UserCartRestController {
	@Autowired
	IUserCartService userCartService;
	@Autowired
	IProductListService productListService;
		
	@RequestMapping(value="/addUserCart1",method = RequestMethod.POST,produces="application/json")
	@ResponseBody UserCartVo addNewAddress(HttpServletRequest request,HttpServletResponse response,@RequestParam("prodId")String prodId,@RequestParam("varId")String varientId){
	//@ResponseBody UserCartVo addInUserCart(HttpServletRequest request,HttpServletResponse response,@RequestBody UserCartVo userCartVo){	
		UserCartVo userCartVo = new UserCartVo();
		userCartVo.setUserId("7349087660");
		
		try {
			 userCartService.saveUserCart(userCartVo);	
			} catch (DataAlreadyExistsException e) {			
		}
			return userCartVo;	
		}
		
	

}
