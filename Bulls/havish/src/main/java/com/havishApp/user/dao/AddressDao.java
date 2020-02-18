package com.havishApp.user.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
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
import com.havishApp.user.model.pojo.Address;

@Repository
public class AddressDao extends BaseDao implements IAddressDao{
	
	Logger logger=Logger.getLogger(Address.class);

	public void insertAddress(final Address address) throws  DataAlreadyExistsException {
		
		StringBuffer sql = new StringBuffer();
		sql.append(" insert into ADDRESS(").append(" ADDRESS_ID,").append(" STREET,").append(" LANDMARK,").append(" CITY,").append(" STATE,").append(" PICODE,").append(" ADDRESSTYPE,").append(" USER_ID,")
				.append(" RCRE_TIME,").append(" RMOD_TIME)").append(" values(").append(" ?,?,?,?,?,?,?,?,current_date(),current_date())");
		
		try {
				jdbcTemplate.update(sql.toString(), new PreparedStatementSetter() {
	
				public void setValues(PreparedStatement ps) throws SQLException {
	
					ps.setString(1, address.getAddressId());
					ps.setString(2, address.getStreet());
					ps.setString(3, address.getLandMark());
					ps.setString(4, address.getCity());
					ps.setString(5, address.getState());
					ps.setString(6, address.getPinCode());
					ps.setString(7, address.getAddressType());
					ps.setString(8, address.getUserId());					
					/*
					 * ps.setString(4, address.getrCreTime());
					 * ps.setString(5,address.getRmodTime());
					 */

				}
			});
		}catch(DuplicateKeyException e) {
			throw new DataAlreadyExistsException();
		}
	}

	public void updateAddress(final Address address) throws UpdateFailedException{
		StringBuffer sql = new StringBuffer();
		sql.append("update uadrs set street = ?,landmark=?,city=?,state=?,picode=?,addressType=?,user_id= ?,rmod_time=current_date() where address_id = ? ");
		
		int rows = jdbcTemplate.update(sql.toString(), new PreparedStatementSetter() {

			public void setValues(PreparedStatement ps) throws SQLException {

				ps.setString(1, address.getStreet());
				ps.setString(2, address.getLandMark());
				ps.setString(3, address.getCity());
				ps.setString(4, address.getState());
				ps.setString(5, address.getPinCode());
				ps.setString(6, address.getAddressType());
				ps.setString(7, address.getUserId());
				
				ps.setString(8, address.getAddressId());				
			}
		});
		if(rows==0) {
			throw new UpdateFailedException();
		}
	}

	public List<Address> selectAddressList(Address address) throws NoRecordFoundException {
		
		String sql="select address_id,street,landmark,city,state,picode,addressType,user_id,rcre_time,rmod_time from uadrs where user_id = ?" ;
		List<Address> userDtls=new  ArrayList<Address>();
		try {	
			userDtls= jdbcTemplate.query(
				        sql,new Object[]{address.getUserId()}, new AddressRowMapper());	
			return userDtls;
		} catch (EmptyResultDataAccessException e) {
			logger.debug("EmptyResultDataAccessException");
			throw new NoRecordFoundException();
		}	
	}

	public void deleteUserAddress(final Address address) throws DeleteFailedException {
		StringBuffer sql = new StringBuffer();
		sql.append("delete from uadrs where address_id = ? ");

			int rows = jdbcTemplate.update(sql.toString(), new PreparedStatementSetter() {

			public void setValues(PreparedStatement ps) throws SQLException {
	
				ps.setString(1,address.getAddressId());				
			}
			});
			if(rows==0) {
			  throw new DeleteFailedException();
			}
	}
}
class AddressRowMapper implements RowMapper<Address>	
{
    public Address mapRow(ResultSet rs, int rowNum) throws SQLException {
    		Address address= new Address();
       
    		address.setAddressId(rs.getString("address_id"));
    		address.setStreet(rs.getString("street"));
    		address.setLandMark(rs.getString("landmark"));
    		address.setCity(rs.getString("city"));
    		address.setState(rs.getString("state"));
    		address.setPinCode(rs.getString("picode"));
    		address.setAddressType(rs.getString("addressType"));
    		address.setUserId(rs.getString("user_id"));     
    		address.setrCreTime(rs.getString("rcre_time"));
    		address.setRmodTime(rs.getString("rmod_time"));
        return address;
    }
}

