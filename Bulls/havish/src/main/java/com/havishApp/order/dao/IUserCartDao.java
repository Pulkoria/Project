package com.havishApp.order.dao;

import java.util.List;

import com.havishApp.Exception.DataAlreadyExistsException;
import com.havishApp.Exception.DeleteFailedException;
import com.havishApp.Exception.NoRecordFoundException;
import com.havishApp.Exception.UpdateFailedException;
import com.havishApp.model.oder.pojo.UserCart;
import com.havishApp.model.oder.pojo.UserCartList;

public interface IUserCartDao {

	public void insertUserCart(UserCart userCart)throws DataAlreadyExistsException;
	
	public void  updateUserCart(UserCart userCart)throws UpdateFailedException;
	
	public List<UserCartList> selectUserCartList(UserCartList userCart)throws NoRecordFoundException;
	
	public void  deleteUserCart(UserCart userCart)throws  DeleteFailedException;
	
	public void  updateUserCartSaveCart(UserCart userCart)throws UpdateFailedException;
}
