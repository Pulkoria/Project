package com.havishApp.product.service;

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
import com.havishApp.product.dao.IProdVarientDao;
import com.havishApp.product.model.Vo.ProductVarientVo;
import com.havishApp.product.model.pojo.ProductVarient;
import com.havishApp.user.model.pojo.Address;
import com.havishApp.user.model.vo.AddressVo;
import com.havishApp.user.service.AddressService;

@Service
public class ProductVarientService implements IProductVarientService{
	
	@Autowired
	IProdVarientDao prodVarientDao;
	
	Logger logger=Logger.getLogger(ProductVarientService.class);

	@Override
	public void saveProductVarient(ProductVarientVo productVarientVo) {
		
		ProductVarient productVarient=new ProductVarient();
		productVarient.setVarientId(productVarientVo.getVarientId());
		productVarient.setProductId(productVarientVo.getProductId());
		productVarient.setVarientValue(productVarientVo.getVarientValue());
		productVarient.setVarientPrice(productVarientVo.getVarientPrice());
		
		productVarient.setVarientId("HVAR005");
		productVarient.setProductId("PROD009");
		productVarient.setVarientValue("200ml");
		productVarient.setVarientPrice(13.86);
		
			try {
				prodVarientDao.insertprodVarient(productVarient);
				
			} catch (DataAlreadyExistsException e) {				
				
			}
	}

	@Override
	public List<ProductVarientVo> selectProductVarienList() throws NoDataFoundException {
		
		List<ProductVarient> productVarLst = new ArrayList<ProductVarient>();
		ProductVarient prodVarient = new ProductVarient();
		List<ProductVarientVo> prodVarVos = new ArrayList<ProductVarientVo>();

		try {
			productVarLst = prodVarientDao.selectprodVarientList(prodVarient);
			for (ProductVarient productVar : productVarLst) {
				ProductVarientVo prodVarientVO= new ProductVarientVo();
				prodVarientVO.setVarientId(productVar.getVarientId());
				prodVarientVO.setProductId(productVar.getProductId());
				prodVarientVO.setVarientValue(productVar.getVarientValue());
				prodVarientVO.setVarientPrice(productVar.getVarientPrice());
				prodVarVos.add(prodVarientVO);
			}
		} catch (NoRecordFoundException e) {
		}
		logger.debug("addressLst size" + prodVarVos.size());

		return prodVarVos;
	}

	@Override
	public ProductVarientVo editProductVarient(ProductVarientVo productVarientVo) {
		
		ProductVarient productVar = new ProductVarient();
		ProductVarientVo productVarVo = new ProductVarientVo();
		
		BeanUtils.copyProperties(productVarientVo, productVar);
		
		try {
			prodVarientDao.updateprodVarient(productVar);
			logger.debug("data updated sucessfully");
			
			//select method if to refresh a list
			
		} catch (com.havishApp.Exception.UpdateFailedException e) {
			
		}
		return productVarVo;
	}

	@Override
	public String deleteProductVarient(ProductVarientVo productVarientVo) {
		
		ProductVarient prodVarient = new ProductVarient();
		ProductVarientVo updatedVo = new ProductVarientVo();
		
		prodVarient.setVarientId(productVarientVo.getVarientId());
		String staus = "";
		
		try {
			prodVarientDao.deleteProductVarient(prodVarient);
			logger.debug("data deleted sucessfully");
		} catch (DeleteFailedException e) {
			e.printStackTrace();
		}
		return staus;
	}
	
}
