package com.havishApp.user.dao;

import java.util.List;

import com.havishApp.Exception.DataAlreadyExistsException;
import com.havishApp.Exception.DeleteFailedException;
import com.havishApp.Exception.NoRecordFoundException;
import com.havishApp.Exception.UpdateFailedException;
import com.havishApp.user.model.pojo.Address;

public interface IAddressDao {
	
    public void insertAddress(Address address)throws DataAlreadyExistsException;
	
	public void  updateAddress(Address address)throws UpdateFailedException;
	
	public List<Address> selectAddressList(Address address)throws NoRecordFoundException;

	public void  deleteUserAddress(Address address)throws DeleteFailedException;

}
