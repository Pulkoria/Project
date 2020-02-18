package com.havishApp.order.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.havishApp.Exception.DataAlreadyExistsException;
import com.havishApp.Exception.DeleteFailedException;
import com.havishApp.Exception.NoDataFoundException;
import com.havishApp.Exception.UpdateFailedException;
import com.havishApp.model.order.vo.OrderVo;
import com.havishApp.model.order.vo.UserCartListVo;
import com.havishApp.model.order.vo.UserCartMasterVo;
import com.havishApp.model.order.vo.UserCartVo;
import com.havishApp.order.Service.IUserCartService;
import com.havishApp.product.model.Vo.CategoryListVo;
import com.havishApp.product.service.IProductListService;
import com.havishApp.user.model.vo.AddressVo;

@Controller
public class UserCartController {
	
	@Autowired
	IUserCartService userCartService;
	@Autowired
	IProductListService productListService;
	
	Logger logger = Logger.getLogger(UserCartController.class);
	
	@RequestMapping(value = "/userCart", method = RequestMethod.GET)
	public ModelAndView loadUserCart(HttpServletRequest request,HttpServletResponse response,@ModelAttribute("cartListVo")UserCartMasterVo userCartVo,
			@RequestParam("userId")String userId,@ModelAttribute("catgryVo") CategoryListVo catgryVos) {
		ModelAndView mav = new ModelAndView();
		List<CategoryListVo> catgryVo = new ArrayList<CategoryListVo>();
		try {
			System.out.println("controller  home page method");
			catgryVo = productListService.selectCategoryList();
			
		} catch (NoDataFoundException e) {
		}
		mav.addObject("catgryVo", catgryVo);
		//UserCartMasterVo userCartVo =new UserCartMasterVo();
		List<UserCartVo> userCartListVo = new ArrayList<UserCartVo>();
		UserCartListVo userCart = new UserCartListVo();
		
		mav.setViewName("cart");
		userCart.setUserId(userId);
		try {
			System.out.println("Cart page");
			userCartVo = userCartService.selectUserCartList(userCart);
			mav.addObject("savedcartListVo", userCartVo.getUserCartSaveLaterListVo());
			mav.addObject("cartListVo", userCartVo.getUserCartListVoList());
			mav.addObject("noOfSavedItems",userCartVo.getNoOfSavedItems());
			mav.addObject("NoOfItems", userCartVo.getNoOfItems());
			mav.addObject("totalPrice", userCartVo.getTotalPrice());
			mav.addObject("totalPay", userCartVo.getTotalPay());
			mav.addObject("offerPrice", userCartVo.getOfferPrice());
			mav.addObject("addressList", userCartVo.getAddressListVo());
		} catch (NoDataFoundException e) {
			mav.setViewName("error");
		}
		return mav;
	}
	
	/*
	 * @RequestMapping(value="/getUserCartList",method =
	 * RequestMethod.GET,produces="application/json")
	 * 
	 * @ResponseBody String getUserCartList(){
	 * 
	 * List<UserCartVo> userCartListVo = new ArrayList<UserCartVo>(); String message
	 * = ""; try { userCartListVo = userCartService.selectUserCartList();
	 * 
	 * } catch (NoDataFoundException e) { } return message; }
	 */
	@RequestMapping(value="/addUserCart",method = RequestMethod.POST,produces="application/json")
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
	
	@RequestMapping(value="/editUserCartSaveCart",method = RequestMethod.GET)
	public String editUserCartSaveCart(@RequestParam("userCartId")String userCartId,@RequestParam("savelater")String savelater){
		
		UserCartVo userCartVo =new UserCartVo();
		logger.debug("userCartId"+userCartId);
		logger.debug("savelater"+savelater);
		userCartVo.setUserCartId(userCartId);
		userCartVo.setSaveLater(savelater);
		String userId = "7349087660";
			try {
				userCartService.editUserCartSaveCart(userCartVo);
				logger.debug("updated saved flag");
			} catch (UpdateFailedException e) {		
				logger.debug("update failed");
			}
		return "redirect:userCart?GET" +"&userId=" + userId;	
	}
	
	@RequestMapping(value="/editUserCart",method = RequestMethod.GET,produces="application/json")
	@ResponseBody String updateAddress(UserCartVo userCartVo){
		
		String message = "";
		try {
			userCartService.editUserCart(userCartVo);
		} catch (UpdateFailedException e) {			
		}
		return message;	
	}
	
	@RequestMapping(value="/deleteUserCart",method = RequestMethod.GET)
	public String  deleteAddress(@RequestParam("userCartId") String userCartId){
		
		UserCartVo userCart=new UserCartVo();
		userCart.setUserCartId(userCartId);
		String userId = "7349087660";
		
		try {
			userCartService.deleteUserCart(userCart);
			logger.debug("userCartId"+userCartId);
			logger.debug("success");
		} catch (DeleteFailedException e) {	
			logger.debug("delete failed");
		}
		return "redirect:userCart?GET" +"&userId=" + userId;	
	}

}
