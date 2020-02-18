package com.havishApp.order.Service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.havishApp.Exception.DataAlreadyExistsException;
import com.havishApp.Exception.DeleteFailedException;
import com.havishApp.Exception.NoDataFoundException;
import com.havishApp.Exception.NoRecordFoundException;
import com.havishApp.Exception.UpdateFailedException;
import com.havishApp.model.oder.pojo.Order;
import com.havishApp.model.order.vo.OrderVo;
import com.havishApp.order.dao.IOrderDao;
import com.havishApp.user.model.pojo.Address;
import com.havishApp.user.model.vo.AddressVo;
import com.havishApp.user.service.AddressService;

@Service
public class OrderService implements IOrderService{

	@Autowired
	IOrderDao orderDao;
	
	Logger logger=Logger.getLogger(OrderService.class);
	
	@Override
	public void saveOrder(OrderVo orderVo) throws DataAlreadyExistsException{
		
		Order orderpojo=new Order();
		orderpojo.setOrderId(orderVo.getOrderId());
		orderpojo.setUserId(orderVo.getUserId());
		orderpojo.setOrderDate(orderVo.getOrderDate());
		orderpojo.setOrderTime(orderVo.getOrderTime());
		orderpojo.setOrderAddress(orderVo.getOrderDate());
		orderpojo.setOrderStatus(orderVo.getOrderStatus());
		orderpojo.setOrderPaymentMode(orderVo.getOrderPaymentMode());
	
		orderDao.insertOrder(orderpojo);
		logger.debug("values inserted:"+orderpojo);
	}

	@Override
	public List<OrderVo> selectOrderList() throws NoDataFoundException{
		
		List<Order> orderLst = new ArrayList<Order>();
		
		List<OrderVo> orderVolst = new ArrayList<OrderVo>();

		try {
			orderLst = orderDao.selectOrderList();
			logger.debug("selected list size"+orderLst.size());
			for (Order order : orderLst) {
				OrderVo orderVo= new OrderVo();
				orderVo.setOrderId(orderVo.getOrderId());
				orderVo.setUserId(order.getUserId());
				orderVo.setOrderDate(order.getOrderDate());
				orderVo.setOrderTime(order.getOrderTime());
				orderVo.setOrderAddress(order.getOrderAddress());
				orderVo.setOrderStatus(order.getOrderStatus());
				orderVo.setOrderPaymentMode(order.getOrderPaymentMode());
				
				orderVolst.add(orderVo);
			}
		} catch (NoRecordFoundException e) {
			throw new NoDataFoundException();
		}
		logger.debug("addressLst size" + orderVolst.size());

		return orderVolst;
	}

	@Override
	public OrderVo editOrder(OrderVo orderVo)throws UpdateFailedException{
		
		OrderVo orderVonew = new OrderVo();
		Order orderpojo = new Order();
		BeanUtils.copyProperties(orderVo, orderpojo);

		orderDao.updateOrder(orderpojo);
		logger.debug("data updated sucessfully");
		
		return orderVonew;
	}

	@Override
	public String deleteOrder(OrderVo orderVo)throws DeleteFailedException {
		
		Order orderPojo = new Order();
		orderPojo.setOrderId(orderVo.getOrderId());
		
		String staus = "";

		orderDao.deleteOrder(orderPojo);
		logger.debug("data deleted sucessfully");
		
		return staus;
	}	

}
