package com.havishApp.order.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.havishApp.Exception.DataAlreadyExistsException;
import com.havishApp.Exception.DeleteFailedException;
import com.havishApp.Exception.NoRecordFoundException;
import com.havishApp.Exception.UpdateFailedException;
import com.havishApp.config.BaseDao;
import com.havishApp.model.oder.pojo.UserCart;
import com.havishApp.model.oder.pojo.UserCartList;
@Repository
public class UserCartDao extends BaseDao implements IUserCartDao{

	public void insertUserCart(final UserCart userCart) throws DataAlreadyExistsException {
		StringBuffer sql=new StringBuffer();
		sql.append("insert into ucart ")
			.append("(USER_CART_ID,")
			.append("USER_ID,")
			.append("PRODUCT_ID,")
			.append( "PROD_QUANTITY, ")
			.append("PRICE_RATE, ")
			.append("TOTAL_RATE, ")
			.append("VARIENT_ID, ")
			.append("SAVE_LATER, ")
			.append("RCRE_TIME, ")
			.append("RMOD_TIME) ")
			.append("VALUES (?, ?, ?,?,?, ?, ?,current_date(),current_date()); ");
		
		try {
				jdbcTemplate.update(sql.toString(), new PreparedStatementSetter(){
	
				public void setValues(PreparedStatement ps) throws SQLException {
					ps.setString(1, userCart.getUserCartId());	
					ps.setString(2, userCart.getUserId());
					ps.setString(3, userCart.getProductId());
					ps.setInt(4, userCart.getProdQuantity());
					ps.setDouble(5, userCart.getPriceRate());
					ps.setDouble(6, userCart.getTotalRate());				
					ps.setString(7, userCart.getVariantId());
					ps.setString(8, userCart.getSaveLater());
					
				}
				});
		}catch(DuplicateKeyException e) {
			throw new DataAlreadyExistsException();
		}		
	}

	public void updateUserCart(final UserCart userCart)throws UpdateFailedException {

		StringBuffer sql= new StringBuffer();
		sql.append(" update ucart set ")
			.append(" PRODUCT_ID = ?,PROD_QUANTITY = ?,PRICE_RATE = ?,TOTAL_RATE =? ,VARIENT_ID = ?,RMOD_TIME = current_date() where USER_ID = ? and PRODUCT_ID = ?;");
		int rows=0;
		rows=jdbcTemplate.update(sql.toString(),new PreparedStatementSetter() {

			public void setValues(PreparedStatement ps) throws SQLException {
				
				ps.setString(1, userCart.getProductId());
				ps.setInt(2, userCart.getProdQuantity());
				ps.setDouble(3, userCart.getPriceRate());
				ps.setDouble(4, userCart.getTotalRate());
				ps.setString(5, userCart.getVariantId());
			}		
		});
		
		if(rows==0) {
			throw new UpdateFailedException();
		}
	}

	public List<UserCartList> selectUserCartList(UserCartList userCartList) throws NoRecordFoundException {
		
		
		String sql="select prod_Name,product_id, price_rate, prod_avail, total_rate, user_cart_id,varient_id,product_image,prod_quantity, ucart.rcre_time,ucart.rmod_time,save_later  from ucart inner join  pdlst on  ucart.product_id = pdlst.prod_id where user_id = ?;" ;
		
		 List<UserCartList> userCartlists=jdbcTemplate.query(sql.toString(),new Object[] {userCartList.getUserId()}, new ResultSetExtractor<List<UserCartList>>(){

				public List<UserCartList> extractData(ResultSet rs) throws SQLException, DataAccessException {
					// TODO Auto-generated method stub
					List<UserCartList> userCartlist=new ArrayList<UserCartList>();
					
					while(rs.next()) {
						UserCartList userCart=new UserCartList();
						userCart.setProdName(rs.getString("prod_Name"));
						userCart.setProductId(rs.getString("product_id"));
						userCart.setPriceRate(rs.getDouble(("price_rate")));
						userCart.setProductAvailabilty(rs.getInt("prod_avail"));
						userCart.setTotalRate(rs.getInt("total_rate"));
						userCart.setUserCartId(rs.getString("user_cart_id"));
						userCart.setProductImage(rs.getString("product_image"));
						userCart.setVariantId(rs.getString("varient_id"));
						userCart.setProdQuantity(rs.getInt("prod_quantity"));
						userCart.setrCreTime(rs.getString("ucart.rcre_time"));
						userCart.setRmodTime(rs.getString("ucart.rmod_time"));
						userCart.setSaveLater(rs.getString("save_later"));
						userCartlist.add(userCart);
					}
					return userCartlist;
					}
				});			
			return userCartlists;
	}

	public void deleteUserCart(final UserCart userCart) throws DeleteFailedException {
		
		StringBuffer sql = new StringBuffer();
		sql.append("delete from ucart where user_cart_id = ? ");

		int rows = 0;
		rows = jdbcTemplate.update(sql.toString(), new PreparedStatementSetter() {

			public void setValues(PreparedStatement ps) throws SQLException {

				ps.setString(1,userCart.getUserCartId());				
			}
		});
		if(rows==0) {
			throw new DeleteFailedException();
		}
	}

	@Override
	public void updateUserCartSaveCart(UserCart userCart) throws UpdateFailedException {
		// TODO Auto-generated method stub
		StringBuffer sql= new StringBuffer();
		sql.append(" update ucart set ")
			.append(" SAVE_LATER = ? ,RMOD_TIME = current_date() where USER_CART_ID = ?;");
		int rows=0;
		rows=jdbcTemplate.update(sql.toString(),new PreparedStatementSetter() {

			public void setValues(PreparedStatement ps) throws SQLException {
				
				ps.setString(1, userCart.getSaveLater());
				ps.setString(2, userCart.getUserCartId());
			}		
		});
		
		if(rows==0) {
			throw new UpdateFailedException();
		}
	}

}