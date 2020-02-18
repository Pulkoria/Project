package com.havishApp.order.dao;

import java.util.List;

import com.havishApp.Exception.DataAlreadyExistsException;
import com.havishApp.Exception.DeleteFailedException;
import com.havishApp.Exception.NoRecordFoundException;
import com.havishApp.Exception.UpdateFailedException;
import com.havishApp.model.oder.pojo.Order;

public interface IOrderDao {
	
	public void insertOrder(Order order)throws DataAlreadyExistsException;
	
	public Order selectOrder(final String orderId) throws NoRecordFoundException;
	
	public List<Order> selectOrderList() throws NoRecordFoundException;
	
	public void updateOrder(Order order)throws UpdateFailedException;
	
	public void  deleteOrder(Order order)throws DeleteFailedException;

}
