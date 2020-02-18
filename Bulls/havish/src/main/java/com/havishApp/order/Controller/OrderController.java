package com.havishApp.order.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.havishApp.Exception.DataAlreadyExistsException;
import com.havishApp.Exception.DeleteFailedException;
import com.havishApp.Exception.NoDataFoundException;
import com.havishApp.Exception.UpdateFailedException;
import com.havishApp.model.order.vo.OrderVo;
import com.havishApp.order.Service.IOrderService;

@Controller
public class OrderController {
	
	@Autowired
	IOrderService orderService;
	
	Logger logger = Logger.getLogger(OrderController.class);
	
	//select list of orders
	@RequestMapping(value="/getOrderlist",method = RequestMethod.GET,produces="application/json")
	@ResponseBody List<OrderVo> getAllOrder(){
		
		ModelAndView mav = new ModelAndView();
		List<OrderVo> orderVoList = new ArrayList<OrderVo>();
		
		try {
			orderVoList = orderService.selectOrderList();

		} catch (NoDataFoundException e) {			
		}
		mav.setViewName("index");
		return orderVoList;	
	}
	
	//add new order
	@RequestMapping(value="/addOrder",method = RequestMethod.GET,produces="application/json")
	@ResponseBody String addNewOrder(){
		
		OrderVo orderVo = new OrderVo();
		String message = "";
		try {
			orderService.saveOrder(orderVo);

		} catch (DataAlreadyExistsException e) {			
		}
		return message;	
	}
	
	//update new Order
	@RequestMapping(value="/updateOrder",method = RequestMethod.GET,produces="application/json")
	@ResponseBody String updateOrder(OrderVo orderVo){
		
		OrderVo orderVos = new OrderVo();
		String message = "";
		try {
			orderService.editOrder(orderVo);
		} catch (UpdateFailedException e) {			
		}
		return message;	
	}

	@RequestMapping(value="/deleteOrder",method = RequestMethod.GET,produces="application/json")
	@ResponseBody String deleteOrder(OrderVo orderVo){
		
		OrderVo orderVos = new OrderVo();
		String message = "";
		try {
			orderService.deleteOrder(orderVo);
		} catch (DeleteFailedException e) {			
		}
		return message;	
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST,params="loginClick")
	public String loginControlMethod() {
		return "redirect:/editPersonalInfo.htm";
	}
	
	@RequestMapping(value="/editPersonalInfo", method=RequestMethod.POST,params="saveClick")
	public String editPersonalInfo() {
		return "redirect:/editPersonalInfoSuccess.htm";
	}
	
	public ModelAndView getEditPageView() {
		return null;
	}
}
