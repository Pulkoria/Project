package com.havishApp.config;

import org.apache.log4j.Logger;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Repository;

import com.havishApp.Exception.NoRecordFoundException;


@Repository
public class CustomSequenceDao extends BaseDao implements ICustomSequenceDao{
	
	Logger logger=Logger.getLogger(CustomSequenceDao.class);

	@Override
	public String userCartIdSeq() throws NoRecordFoundException {
		// TODO Auto-generated method stub
		String sql="SELECT  address_id  from uadrs ORDER BY  address_id DESC LIMIT 1;" ;
		logger.debug("sql"+sql);
		String userCartId = "";
		try {
			userCartId = (String) jdbcTemplate.queryForObject(
		            sql,String.class);
		}catch(EmptyResultDataAccessException e) {
			throw new NoRecordFoundException();
		}
		logger.debug("userCartId"+userCartId);
		return userCartId;
	}
	
}
