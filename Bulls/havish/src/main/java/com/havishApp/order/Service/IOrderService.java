package com.havishApp.order.Service;

import java.util.List;

import com.havishApp.Exception.DataAlreadyExistsException;
import com.havishApp.Exception.DeleteFailedException;
import com.havishApp.Exception.NoDataFoundException;
import com.havishApp.Exception.UpdateFailedException;
import com.havishApp.model.order.vo.OrderVo;
import com.havishApp.user.model.vo.AddressVo;

public interface IOrderService {
	
	public void saveOrder(OrderVo orderVo)throws DataAlreadyExistsException;
	
	public List<OrderVo> selectOrderList()throws NoDataFoundException;
	
	public OrderVo editOrder(OrderVo orderVo)throws UpdateFailedException;
	
	public String deleteOrder(OrderVo orderVo)throws DeleteFailedException;

}
