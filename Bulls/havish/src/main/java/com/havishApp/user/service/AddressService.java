package com.havishApp.user.service;

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
import com.havishApp.config.CustomSequenceGenerator;
import com.havishApp.config.ICustomSequenceGen;
import com.havishApp.user.dao.IAddressDao;
import com.havishApp.user.model.pojo.Address;
import com.havishApp.user.model.vo.AddressVo;

@Service
public class AddressService implements IAddressService{
	@Autowired
	IAddressDao addressDao;
	@Autowired
	ICustomSequenceGen customSequenceGen;
	
	Logger logger=Logger.getLogger(AddressService.class);

	public void saveAddress(AddressVo addressvo)throws DataAlreadyExistsException {
		
		Address addresspojo=new Address();
		
		
		String cus = customSequenceGen.getSequenceNumber();
		//custom.getSequenceNumber("HVADR00"
		System.out.println("custom"+cus);
		addresspojo.setAddressId(cus);
		addresspojo.setUserId(addressvo.getUserId());
		addresspojo.setStreet(addressvo.getStreet());
		addresspojo.setLandMark(addressvo.getLandMark());
		addresspojo.setCity(addressvo.getCity());
		addresspojo.setState(addressvo.getState());
		addresspojo.setPinCode(addressvo.getPinCode());
		addresspojo.setAddressType(addressvo.getAddressType());
		addressDao.insertAddress(addresspojo);
	}

	public List<AddressVo> selectAddressList() throws NoDataFoundException {
		
		List<Address> addressLst = new ArrayList<Address>();
		Address address = new Address();
		List<AddressVo> addressVo = new ArrayList<AddressVo>();

		try {
			addressLst = addressDao.selectAddressList(address);
			for (Address adress : addressLst) {
				AddressVo addressVO= new AddressVo();
				addressVO.setAddressId(adress.getAddressId());
				addressVO.setStreet(adress.getStreet());
				addressVO.setLandMark(adress.getLandMark());
				addressVO.setCity(adress.getCity());
				addressVO.setState(adress.getState());
				addressVO.setPinCode(adress.getPinCode());
				addressVO.setAddressType(adress.getAddressType());
				addressVO.setUserId(adress.getUserId());
				addressVO.setrCreTime(adress.getrCreTime());
				addressVO.setRmodTime(adress.getRmodTime());
				addressVo.add(addressVO);
			}
		} catch (NoRecordFoundException e) {
		}
		logger.debug("addressLst size" + addressVo.size());

		return addressVo;
	}

	public AddressVo editAddress(AddressVo addressVo)throws UpdateFailedException {

		Address address = new Address();
		AddressVo updatedVo = new AddressVo();

		BeanUtils.copyProperties(addressVo, address);
		addressDao.updateAddress(address);
		logger.debug("data updated sucessfully");
		
		return updatedVo;
	}

	public String deleteAddress(AddressVo addressVo)throws DeleteFailedException {

		Address address = new Address();		
		String staus = "";
		address.setAddressId("ADR005");
		addressDao.deleteUserAddress(address);
		logger.debug("data deleted sucessfully");
		
		return staus;
	}

}
