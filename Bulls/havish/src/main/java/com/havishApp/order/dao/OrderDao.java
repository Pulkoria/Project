package com.havishApp.order.dao;

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
import com.havishApp.model.oder.pojo.Order;
import com.havishApp.product.model.pojo.ProdSubCat;
import com.havishApp.user.model.pojo.User;

@Repository
public class OrderDao extends BaseDao implements IOrderDao {

	Logger logger = Logger.getLogger(OrderDao.class);

	public void insertOrder(final Order order) throws DataAlreadyExistsException{

		StringBuffer sql = new StringBuffer();
		sql.append(" insert into PROD_ORDER(").append(" ORDER_ID,").append(" USER_ID,").append(" ORDER_DATE,")
				.append(" ORDER_TIME,").append(" ORDER_ADDRESS,").append(" ORDER_PAYMENT_MODE,").append(" RCRE_TIME,")
				.append(" RMOD_TIME)").append(" values(").append(" ?,?,?,?,?,?,?,?)");

		try {
			jdbcTemplate.update(sql.toString(), new PreparedStatementSetter() {
	
				public void setValues(PreparedStatement ps) throws SQLException {
	
					ps.setString(1, order.getOrderId());
					ps.setString(2, order.getUserId());
					ps.setString(3, order.getOrderDate());
					ps.setString(4, order.getOrderTime());
					ps.setString(5, order.getOrderAddress());
					ps.setString(6, order.getOrderPaymentMode());
					ps.setString(7, order.getrCreTime());
					ps.setString(8, order.getrModTime());
				}
			});
		}catch(DuplicateKeyException e) {
			throw new DataAlreadyExistsException();
		}
	}

	public Order selectOrder(final String orderId) throws NoRecordFoundException {

		logger.debug("selecting userId" + orderId);

		String sql = "select PROD_ORDER,ORDER_ID,USER_ID,ORDER_DATE,ORDER_TIME,ORDER_ADDRESS,ORDER_STATUS,ORDER_PAYMENT_MODE,R_CRE_TIME,R_MOD_TIME from poder where order_id = ?";
		Order orderDtls = new Order();
		try {
			orderDtls = jdbcTemplate.queryForObject(sql, new Object[] { orderId }, new OrderRowMapper());
			return orderDtls;
		} catch (EmptyResultDataAccessException e) {
			logger.debug("EmptyResultDataAccessException");
			throw new NoRecordFoundException();
		}
	}

	
	public List<Order> selectOrderList() throws NoRecordFoundException {
		
		String sql = "select PROD_ORDER,ORDER_ID,USER_ID,ORDER_DATE,ORDER_TIME,ORDER_ADDRESS,ORDER_STATUS,ORDER_PAYMENT_MODE,R_CRE_TIME,R_MOD_TIME from poder";
		List<Order> prodSubCatgs=new ArrayList<Order>();
		try {
			  prodSubCatgs= jdbcTemplate.query(sql,new OrderRowMapper());
			  
			  return prodSubCatgs; 	  
			  }catch (EmptyResultDataAccessException e) {
				  
			  logger.debug("EmptyResultDataAccessException"); 
			  throw new  NoRecordFoundException(); 
			}
	}
	
	class OrderRowMapper implements RowMapper<Order> {

		public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
			Order order = new Order();
			order.setOrderId(rs.getString("order_id"));
			order.setUserId(rs.getString("user_Id"));
			order.setOrderDate(rs.getString("order_date"));
			order.setOrderTime(rs.getString("order_time"));
			order.setOrderAddress(rs.getString("order_address"));
			order.setOrderStatus(rs.getString("order_status"));
			order.setOrderPaymentMode(rs.getString("order_payment_mode"));
			order.setrCreTime(rs.getString("r_cre_time"));
			order.setrModTime(rs.getString("r_mod_time"));
			return order;
		}
	}

	public void updateOrder(final Order order)throws UpdateFailedException{
	
		StringBuffer sql= new StringBuffer();
		sql.append(" update poder set  user_Id =? ,order_date =? ,order_time = ?, ")
			.append(" order_address = ?,order_status = ?,order_payment_mode= ?,r_cre_time =?,r_mod_time=? where order_id=? ;");
		
			int rows=0;
	
			rows= jdbcTemplate.update(sql.toString(),new PreparedStatementSetter() {

			public void setValues(PreparedStatement ps) throws SQLException {
				
				ps.setString(1, order.getUserId());
				ps.setString(2, order.getOrderDate());
				ps.setString(3, order.getOrderTime());
				ps.setString(4, order.getOrderAddress());
				ps.setString(5, order.getOrderStatus());
				ps.setString(6, order.getOrderPaymentMode());
				ps.setString(7, order.getrModTime());           
				ps.setString(8, order.getrModTime());
			}		
		});		
		logger.debug("no of updated rows"+rows);	
	}

	public void deleteOrder(final Order order)throws DeleteFailedException {
		
		StringBuffer sql= new StringBuffer();
		sql.append(" delete from poder where order_id=? ;");
		
			int rows=0;
	
			rows= jdbcTemplate.update(sql.toString(),new PreparedStatementSetter() {

			public void setValues(PreparedStatement ps) throws SQLException {				
				ps.setString(1, order.getUserId());				
			}		
		});		
		if(rows==0) {
			throw new DeleteFailedException();
		}
		logger.debug("no of deleted rows"+rows);
	}

}
