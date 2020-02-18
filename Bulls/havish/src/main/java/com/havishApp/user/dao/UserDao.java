package com.havishApp.user.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.log4j.Logger;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.havishApp.Exception.DataAlreadyExistsException;
import com.havishApp.Exception.NoDataFoundException;
import com.havishApp.Exception.NoRecordFoundException;
import com.havishApp.config.BaseDao;
import com.havishApp.user.model.pojo.User;

@Repository
public class UserDao  extends BaseDao implements IUserDao {
	
	Logger logger=Logger.getLogger(UserDao.class);

	public void saveNewUser(final User user) throws DataAlreadyExistsException {
		
		
		StringBuffer sql=new StringBuffer();
		sql.append("insert into user ")
			.append("(USER_ID,")
			.append("PASSWORD,")
			.append( "USER_NAME, ")
			.append("EMAIL_ID, ")
			.append("PHONE_NUMBER, ")
			.append("USER_ROLE, ")
			.append("USER_CATEGORY, ")
			.append("ORGANISATION_ID, ")
			.append("R_CRE_TIME, ")
			.append("R_MOD_TIME) ")
			.append("VALUES (?, ?, ?,?,?, ?, ?,?,current_date(),current_date()); ");
		
		try {
				jdbcTemplate.update(sql.toString(), new PreparedStatementSetter(){
	
				public void setValues(PreparedStatement ps) throws SQLException {
					
					ps.setString(1, user.getUserId());
					ps.setString(2, user.getPassword());
					ps.setString(3, user.getUserName());
					ps.setString(4, user.getEmailId());
					ps.setString(5, user.getPhoneNo());
					ps.setString(6, user.getUserRole());				
					ps.setString(7, user.getUserCategory());
					ps.setString(8, user.getOrganisationId());
				}
				});
		}catch(DuplicateKeyException e) {
			throw new DataAlreadyExistsException();
		}		
	}

	public User selectUser(final String phoneNo) throws NoRecordFoundException{
		
		logger.debug("executing validateUser"+phoneNo);
		
		String sql="select user_id,password,user_name,email_id,phone_number,user_role,user_category,organisation_id from user where phone_number = ?" ;
		logger.debug("sql"+sql);
		User userDtls=new  User();
		try {	
			userDtls= jdbcTemplate.queryForObject(
				        sql,new Object[] {phoneNo}, new UserRowMapper());	
			
		} catch (EmptyResultDataAccessException e) {
			logger.debug("EmptyResultDataAccessException");
			throw new NoRecordFoundException();
		}
		if(userDtls != null) {
			logger.debug(userDtls);
		}
		return userDtls;
	}

	public void update(final String userId, final String oldPassword, final String newPassword) {
		
		StringBuffer sql= new StringBuffer();
		sql.append(" update user set ")
			.append(" password = ?,r_mod_time = 'curDate()' where user_id = ? and password= ? ;");
		
		jdbcTemplate.update(sql.toString(),new PreparedStatementSetter() {

			public void setValues(PreparedStatement ps) throws SQLException {
				
				ps.setString(1, newPassword);
				ps.setString(2, userId);
				ps.setString(3, oldPassword);
			}		
		});
	}

	public void updateUserProfile(final User user) {
		
		StringBuffer sql= new StringBuffer();
		sql.append(" update user set user_name=?,email_id = ?,phone_number = ? ,user_role = ?, ")
			.append(" user_category = ?,organisation_id = ?,r_mod_time= ? where user_id = ? ;");
		
		int rows=0;
	
			rows= jdbcTemplate.update(sql.toString(),new PreparedStatementSetter() {

			public void setValues(PreparedStatement ps) throws SQLException {
				
				ps.setString(1, user.getUserName());
				ps.setString(2, user.getEmailId());
				ps.setString(3, user.getPhoneNo());
				ps.setString(4, user.getUserRole());
				ps.setString(5, user.getUserCategory());
				ps.setString(6, user.getOrganisationId());
				ps.setString(7, user.getrModTime());           
				ps.setString(8, user.getUserId());
			}		
		});		
		logger.debug("no of updated rows"+rows);
	}
}
 class UserRowMapper implements RowMapper<User>	
{
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
    		User user= new User();
       
	        user.setUserId(rs.getString("user_id"));
	        user.setPassword(rs.getString("password"));
	        user.setUserName(rs.getString("user_name"));
	        user.setEmailId(rs.getString("email_id"));
	        user.setPhoneNo(rs.getString("phone_number"));
	        user.setUserRole(rs.getString("user_role"));
	        user.setUserCategory(rs.getString("user_category"));
	        user.setOrganisationId(rs.getString("organisation_id"));        
        return user;
    }
}

