package com.havishApp.user.service;

import java.util.List;

import com.havishApp.Exception.DataAlreadyExistsException;
import com.havishApp.Exception.DeleteFailedException;
import com.havishApp.Exception.NoDataFoundException;
import com.havishApp.Exception.UpdateFailedException;
import com.havishApp.user.model.vo.AddressVo;

public interface IAddressService {

	public void saveAddress(AddressVo address)throws DataAlreadyExistsException;
	
	public List<AddressVo> selectAddressList() throws NoDataFoundException;
	
	public AddressVo editAddress(AddressVo address)throws UpdateFailedException;
	
	public String deleteAddress(AddressVo address)throws DeleteFailedException;
	
}
