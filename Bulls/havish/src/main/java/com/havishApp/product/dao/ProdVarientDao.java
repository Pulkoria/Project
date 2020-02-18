package com.havishApp.product.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.havishApp.Exception.DataAlreadyExistsException;
import com.havishApp.Exception.DeleteFailedException;
import com.havishApp.Exception.NoRecordFoundException;
import com.havishApp.Exception.UpdateFailedException;
import com.havishApp.config.BaseDao;
import com.havishApp.product.model.pojo.ProductVarient;

@Repository
public class ProdVarientDao extends BaseDao implements IProdVarientDao{

	public void insertprodVarient(final ProductVarient productVarient)throws DataAlreadyExistsException{
		
		StringBuffer sql = new StringBuffer();
		sql.append(" insert into pdvar(").append(" VARIENT_ID,").append(" PRODUCT_ID,").append(" VARIENT_VALUE,")
				.append(" VARIENT_PRICE)").append(" values( ").append("?, ?, ?, ? )");
		try {
			 jdbcTemplate.update(sql.toString(), new PreparedStatementSetter() {
	
				public void setValues(PreparedStatement ps) throws SQLException {
	
					ps.setString(1, productVarient.getVarientId());
					ps.setString(2, productVarient.getProductId());
					ps.setString(3, productVarient.getVarientValue());	
					ps.setDouble(4, productVarient.getVarientPrice());
				}
			});
		}catch(DuplicateKeyException e) {
			throw new DataAlreadyExistsException();
		}
	}

	public void updateprodVarient(final ProductVarient productVarient)throws UpdateFailedException {
			
		StringBuffer sql = new StringBuffer();
		sql.append("update pdvar set VARIENT_VALUE = ? ,PRODUCT_ID = ?,VARIENT_PRICE where VARIENT_ID = ? ");

		int rows = 0;
		rows = jdbcTemplate.update(sql.toString(), new PreparedStatementSetter() {

			public void setValues(PreparedStatement ps) throws SQLException {

				ps.setString(1, productVarient.getVarientValue());
				ps.setString(2, productVarient.getProductId());
				ps.setString(3, productVarient.getVarientId());			
			}
		});
		if(rows==0) {
			throw new UpdateFailedException();
		}
	}

	public List<ProductVarient> selectprodVarientList(ProductVarient productVarient) throws NoRecordFoundException {
		
		String sql="select VARIENT_ID,PRODUCT_ID,VARIENT_VALUE,VARIENT_PRICE from pdvar" ;
		List<ProductVarient> varientDtls=new  ArrayList<ProductVarient>();
		try {	
			varientDtls = jdbcTemplate.query(
				        sql, new ProductVarientRowMapper());	
			return varientDtls;
		} catch (EmptyResultDataAccessException e) {
			System.out.println("EmptyResultDataAccessException");
			throw new NoRecordFoundException();
		}	
	}

	public void deleteProductVarient(final ProductVarient productVarient)throws DeleteFailedException {
	
		StringBuffer sql = new StringBuffer();
		sql.append("delete from pdvar where VARIENT_ID = ? ");

		int rows = 0;
		
		rows = jdbcTemplate.update(sql.toString(), new PreparedStatementSetter() {

			public void setValues(PreparedStatement ps) throws SQLException {

				ps.setString(1,productVarient.getVarientId());				
			}
		});
		
		if(rows==0) {
			throw new DeleteFailedException();
		}
	}
}
class ProductVarientRowMapper implements RowMapper<ProductVarient>	
{
    public ProductVarient mapRow(ResultSet rs, int rowNum) throws SQLException {
    	ProductVarient productVarient= new ProductVarient();
       
    	productVarient.setVarientId(rs.getString("VARIENT_ID"));
    	productVarient.setProductId(rs.getString("PRODUCT_ID"));
    	productVarient.setVarientValue(rs.getString("VARIENT_VALUE"));     
    	productVarient.setVarientPrice(rs.getDouble("VARIENT_PRICE"));
        return productVarient;
    }
}
