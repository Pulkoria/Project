package com.havishApp.order.Service;

import java.util.List;

import com.havishApp.Exception.DataAlreadyExistsException;
import com.havishApp.Exception.DeleteFailedException;
import com.havishApp.Exception.NoDataFoundException;
import com.havishApp.Exception.NoRecordFoundException;
import com.havishApp.Exception.UpdateFailedException;
import com.havishApp.model.order.vo.OrderVo;
import com.havishApp.model.order.vo.UserCartListVo;
import com.havishApp.model.order.vo.UserCartMasterVo;
import com.havishApp.model.order.vo.UserCartVo;

public interface IUserCartService {

	public String saveUserCart(UserCartVo userCartVo)throws DataAlreadyExistsException;
	
	public UserCartMasterVo selectUserCartList(UserCartListVo userCartMasterVo) throws NoDataFoundException;
	
	public UserCartVo editUserCart(UserCartVo userCartVo)throws UpdateFailedException;
	
	public String deleteUserCart(UserCartVo userCartVo)throws DeleteFailedException;
	
	public UserCartVo editUserCartSaveCart(UserCartVo userCartVo)throws UpdateFailedException;
	
}
