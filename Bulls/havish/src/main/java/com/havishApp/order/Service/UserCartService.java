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
import com.havishApp.model.oder.pojo.UserCart;
import com.havishApp.model.oder.pojo.UserCartList;
import com.havishApp.model.order.vo.UserCartListVo;
import com.havishApp.model.order.vo.UserCartMasterVo;
import com.havishApp.model.order.vo.UserCartSaveLaterVo;
import com.havishApp.model.order.vo.UserCartVo;
import com.havishApp.order.dao.IUserCartDao;
import com.havishApp.product.dao.IProdVarientDao;
import com.havishApp.product.model.pojo.ProductVarient;
import com.havishApp.user.dao.IAddressDao;
import com.havishApp.user.model.pojo.Address;
import com.havishApp.user.model.vo.AddressVo;

@Service
public class UserCartService implements IUserCartService{
	@Autowired
	IUserCartDao userCartDao;
	@Autowired
	IProdVarientDao prodVarDao;
	@Autowired
	IAddressDao addressDao;
	
	Logger logger=Logger.getLogger(UserCartService.class);
	
	@Override
	public String saveUserCart(UserCartVo userCartVo) throws DataAlreadyExistsException{
		
		UserCartList userCartpojo=new UserCartList();
		ProductVarient prodVarient = new ProductVarient();
		prodVarient.setVarientId(userCartVo.getVariantId());
		List<ProductVarient> prodVarList = new ArrayList<ProductVarient>();
		try {
			prodVarList = prodVarDao.selectprodVarientList(prodVarient);
			
			logger.debug(prodVarList.get(0).getVarientPrice());
		} catch (NoRecordFoundException e) {
			
		}
		
		userCartpojo.setUserCartId(userCartVo.getUserCartId());
		
		//userCartDao.selectUserCartList(userCartpojo);
		
		userCartpojo.setUserId(userCartVo.getUserId());
		userCartpojo.setProductId(userCartVo.getProductId());//vo
		userCartpojo.setProdQuantity(1);
		userCartpojo.setPriceRate(prodVarList.get(0).getVarientPrice());//varient price
		userCartpojo.setTotalRate(userCartpojo.getProdQuantity() *  prodVarList.get(0).getVarientPrice());//prodq* price
		userCartpojo.setVariantId(userCartVo.getVariantId());//from vo
				
		logger.debug("values inserted:"+userCartVo);
		String status ="";
		//userCartDao.insertUserCart(userCartpojo);
		return  status;
	}

	@Override
	public UserCartMasterVo selectUserCartList(UserCartListVo userCartListVo) throws NoDataFoundException{
		
		List<UserCartList> userCartLst = new ArrayList<UserCartList>();
		
		UserCartList userCartPojo=new UserCartList();
		BeanUtils.copyProperties(userCartListVo, userCartPojo);
		
		List<UserCartListVo> orderVolst = new ArrayList<UserCartListVo>();
		List<UserCartSaveLaterVo> saveorderVolst = new ArrayList<UserCartSaveLaterVo>();
		UserCartMasterVo userCartMasterVo =new UserCartMasterVo();
		
		try {
			userCartLst = userCartDao.selectUserCartList(userCartPojo);
			Double totalPrice =0.00;
			logger.debug("selected list size"+userCartLst.size());
			int noOfItems=0;
			int noOfSavedItems=0;
			for (UserCartList userCart : userCartLst) {
				if(userCart.getSaveLater().equals("N")) {
					noOfItems = noOfItems +1;
					UserCartListVo userVo= new UserCartListVo();
					userVo.setUserCartId(userCart.getUserCartId());
					userVo.setUserId(userCart.getUserId());
					userVo.setProductId(userCart.getProductId());
					userVo.setProdQuantity(userCart.getProdQuantity());
					userVo.setPriceRate(userCart.getPriceRate());
					userVo.setTotalRate(userCart.getTotalRate());
					userVo.setVariantId(userCart.getVariantId());
					userVo.setProductId(userCart.getProductId());
					userVo.setProdName(userCart.getProdName());
					userVo.setProductImage(userCart.getProductImage());
					userVo.setSaveLater(userCart.getSaveLater());
					if (userCart.getProductAvailabilty() > 0)
						userVo.setStockAvail("In Stock");
					else
						userVo.setStockAvail("Out Of Stock");
					
					orderVolst.add(userVo);
				}else {
					noOfSavedItems = noOfSavedItems+1;
					UserCartSaveLaterVo cartSaveLaterVo = new UserCartSaveLaterVo();
					cartSaveLaterVo.setUserCartId(userCart.getUserCartId());
					cartSaveLaterVo.setUserId(userCart.getUserId());
					cartSaveLaterVo.setProductId(userCart.getProductId());
					cartSaveLaterVo.setProdQuantity(userCart.getProdQuantity());
					cartSaveLaterVo.setPriceRate(userCart.getPriceRate());
					cartSaveLaterVo.setTotalRate(userCart.getTotalRate());
					cartSaveLaterVo.setVariantId(userCart.getVariantId());
					cartSaveLaterVo.setProductId(userCart.getProductId());
					cartSaveLaterVo.setProdName(userCart.getProdName());
					cartSaveLaterVo.setProductImage(userCart.getProductImage());
					cartSaveLaterVo.setSaveLater(userCart.getSaveLater());
					
					if (userCart.getProductAvailabilty() > 0)
						cartSaveLaterVo.setStockAvail("In Stock");
					else
						cartSaveLaterVo.setStockAvail("Out Of Stock");
					saveorderVolst.add(cartSaveLaterVo);
				}
			}
			 List<Address> addressList = new ArrayList<Address>();
			 List<AddressVo> addressListVo = new ArrayList<AddressVo>();
			 Address address = new Address();
			 
			try {
				address.setUserId(userCartListVo.getUserId());
				addressList = addressDao.selectAddressList(address);
				for(Address addrs:addressList) {
					AddressVo addressVo =new AddressVo();
					addressVo.setAddressId(addrs.getAddressId());
					addressVo.setStreet(addrs.getStreet().concat(addrs.getLandMark()).concat(addrs.getCity()));
					addressListVo.add(addressVo);
				}
			}catch(NoRecordFoundException e) {
				
				System.out.println("No Data Found");
			}
			userCartMasterVo.setAddressListVo(addressListVo);
			userCartMasterVo.setNoOfSavedItems(noOfSavedItems);
			userCartMasterVo.setUserCartSaveLaterListVo(saveorderVolst);
			userCartMasterVo.setNoOfItems(noOfItems);
			userCartMasterVo.setOfferPrice(800.00);
			userCartMasterVo.setTotalPrice(totalPrice);
			userCartMasterVo.setTotalPay(totalPrice -userCartMasterVo.getOfferPrice());
		} catch (NoRecordFoundException e) {
			new NoDataFoundException();
		}
		userCartMasterVo.setUserCartListVoList(orderVolst);
		logger.debug("addressLst size" + userCartLst.size());
		return userCartMasterVo;
	}

	@Override
	public UserCartVo editUserCart(UserCartVo userCartVo){
		
		UserCartVo userCartVO = new UserCartVo();
		UserCart usercartpojo = new UserCart();
		BeanUtils.copyProperties(userCartVo, usercartpojo);
		
		try {
			userCartDao.updateUserCart(usercartpojo);
			logger.debug("data updated sucessfully");
		} catch (com.havishApp.Exception.UpdateFailedException e) {
		}
		return userCartVO;
	}

	@Override
	public String deleteUserCart(UserCartVo userCartVo){
		
		UserCart usercartpojo = new UserCart();
		usercartpojo.setUserCartId(userCartVo.getUserCartId());
		String staus = "";
		try {
			
			userCartDao.deleteUserCart(usercartpojo);
			logger.debug("data deleted sucessfully");
		} catch (DeleteFailedException e) {
			e.printStackTrace();
		}
		return staus;
	}

	@Override
	public UserCartVo editUserCartSaveCart(UserCartVo userCartVo) throws UpdateFailedException {

		UserCart user = new UserCart();
		BeanUtils.copyProperties(userCartVo, user);
		try {
			userCartDao.updateUserCartSaveCart(user);
			logger.debug("data updated sucessfully");
		} catch (com.havishApp.Exception.UpdateFailedException e) {
			logger.debug("update failed");
		}
		
		return userCartVo;
	}
}
