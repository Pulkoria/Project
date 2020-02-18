package com.havishApp.product.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.havishApp.Exception.NoRecordFoundException;
import com.havishApp.config.BaseDao;
import com.havishApp.product.model.pojo.CategoryList;
import com.havishApp.product.model.pojo.ProdSubCat;
import com.havishApp.product.model.pojo.ProductList;

@Repository
public class ProductListDao extends BaseDao implements IProductListDao{
	
	Logger logger=Logger.getLogger(ProductListDao.class);


	public List<ProductList> selectProductListByCategory(String prodCat,int minPrice,int maxPrice,String brand[],String prodSearchString,String order) 
			throws NoRecordFoundException {
		
		 List<Object> data = new ArrayList<Object>();
		
		 StringBuffer sql=new StringBuffer();
		  sql.append(" select PROD_ID,")
		  .append(" PROD_NAME,")
		  .append(" CATEGORY_ID,")
		  .append(" PROD_CAT_ID,")
		  
		  .append(" PROD_PRICE,")
		  .append(" PROD_AVAIL,")
		  .append(" PROD_DESCRIPTION,")
		 
		  .append(" PROD_RATING,")
		  .append(" BRAND,")
		  .append(" PROD_ATTRIBUTE,")
		  .append(" PRODUCT_IMAGE")
		  .append(" from pdlst where ");
		  logger.debug("maximumPrice"+maxPrice +"minimumPrice" +minPrice);
		  if(minPrice > 0 || maxPrice > 0) {
			  sql.append("  prod_price between ? and ?  ");
			  data.add(minPrice);
			  data.add(maxPrice);
			  logger.debug("maxPrice"+maxPrice +"minPrice" +minPrice);
		  }
		  
		  
		  if(prodCat !=null && !prodCat.isEmpty()) {
			  
			  sql.append(" and PROD_CAT_ID = ? ");
				 data.add(prodCat);
			 }
  
		  if(brand == null || brand.length == 0) {
			  
			  logger.debug("brand ");
		  }else {
			  if(brand.length == 1) {
			    sql.append(" and brand in ( ? )");
			    data.add(brand[0]);
			  }else {

				  sql.append(" and brand in ( ?");
				  logger.debug("brand[0]"+brand[0]);
				  data.add(brand[0]);
				 
				  for(int i=1;i<brand.length;i++) {
					 sql.append(" ,?");
					 logger.debug("brand[i]"+brand[i]);
					 data.add(brand[i]);		 
				  }
				  sql.append(" )");
		       }  
				  logger.debug(" else in brand ");
		  }
		  
		  
		  if(prodSearchString !=null && ! prodSearchString.isEmpty()) {
			   sql.append(" and (prod_name like ?");
			   data.add("%" + prodSearchString + "%");
			   sql.append(" or prod_description like ?");
			   data.add("%" + prodSearchString + "%");
			   sql.append(" or brand like ?");
			   data.add("%" + prodSearchString + "%");
			   sql.append(")");
		  }
		  
		  if(order.equals("desc"))
			  sql.append(" order by prod_price desc");
		  else {
			  sql.append(" order by prod_price asc");
		  }
		  
		
		  Object[] array = data.toArray(new Object[data.size()]);
		
		  List<ProductList> prodlists=new ArrayList<ProductList>();
				  
			//try {	  
		  	prodlists = jdbcTemplate.query(sql.toString(),array, new ResultSetExtractor<List<ProductList>>(){
					  
			  public List<ProductList> extractData(ResultSet rs) throws SQLException,DataAccessException {
				 List<ProductList>   prodlist=new ArrayList<ProductList>();
					 
					  while(rs.next()) { ProductList prodList=new ProductList();
					  prodList.setProductId(rs.getString("PROD_ID"));
					  prodList.setProductName(rs.getString("PROD_NAME"));
					  prodList.setCategryId(rs.getString("CATEGORY_ID"));
					  prodList.setProductCatgryId(rs.getString("PROD_CAT_ID"));
					  
					  prodList.setPrice(rs.getDouble("PROD_PRICE"));
					  prodList.setProductAvailabilty(rs.getInt("PROD_AVAIL"));
					  prodList.setProductDesc(rs.getString("PROD_DESCRIPTION"));
					  prodList.setRating(rs.getString("PROD_RATING"));
					  prodList.setBrand(rs.getString("BRAND"));
					  prodList.setProductAttribute(rs.getString("PROD_ATTRIBUTE"));
					  prodList.setProductImage(rs.getString("PRODUCT_IMAGE"));
					  prodlist.add(prodList); } return prodlist; } });
		  	if(prodlists.size()==0) {
		  		throw new NoRecordFoundException();
		  	}
			/*}catch(EmptyResultDataAccessException e) {
				logger.debug("product list size 0");
				
			}*/
			logger.debug("list size"+prodlists.size());
		 
		return prodlists;
	}
	
	public List<ProductList> selectProductList() {
		// TODO Auto-generated method stub
		StringBuffer sql=new StringBuffer();
		  sql.append(" select PROD_ID,")
		  .append(" PROD_NAME,")
		  		 
		  .append(" CATEGORY_ID,")
		  .append(" PROD_CAT_ID,")
		  
		  .append(" PROD_PRICE,")
		  .append(" PROD_AVAIL,")
		  .append(" PROD_DESCRIPTION,")
		 
		  .append(" PROD_RATING,")
		  .append(" BRAND,")
		  .append(" PROD_ATTRIBUTE,")
		  .append(" PRODUCT_IMAGE")
		  .append(" from pdlst");
		  
		  List<ProductList> prodlists=jdbcTemplate.query(sql.toString(), new ResultSetExtractor<List<ProductList>>(){

			public List<ProductList> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<ProductList> prodlist=new ArrayList<ProductList>();
				
				while(rs.next()) {
					ProductList prodList=new ProductList();
						prodList.setProductId(rs.getString("PROD_ID"));
						prodList.setProductName(rs.getString("PROD_NAME"));
						prodList.setCategryId(rs.getString("CATEGORY_ID"));
						prodList.setProductCatgryId(rs.getString("PROD_CAT_ID"));
						
						prodList.setPrice(rs.getDouble("PROD_PRICE"));
						prodList.setProductAvailabilty(rs.getInt("PROD_AVAIL"));
						prodList.setProductDesc(rs.getString("PROD_DESCRIPTION"));
						prodList.setRating(rs.getString("PROD_RATING"));
						prodList.setBrand(rs.getString("BRAND"));
						prodList.setProductAttribute(rs.getString("PROD_ATTRIBUTE"));
						prodList.setProductImage(rs.getString("PRODUCT_IMAGE"));
					
					prodlist.add(prodList);
				}
				return prodlist;
				}	
		  });
		
		return prodlists;
	}
	
	
	public List<CategoryList> selectCategoryList() throws NoRecordFoundException {
		
		String sql="select category_name,category_id from catg_lst ;";
		logger.debug("dao method sql query"+sql);
		List<CategoryList> lists=new ArrayList<CategoryList>();
		
		lists=	jdbcTemplate.query(sql, new ResultSetExtractor<List<CategoryList>>(){

			public List<CategoryList> extractData(ResultSet rs) throws SQLException, DataAccessException {
				
			List<CategoryList> list=new ArrayList<CategoryList>();
				while(rs.next()) {
					CategoryList catgryLst=new CategoryList();
					catgryLst.setCategoryName(rs.getString("category_name"));
					catgryLst.setCategoryId(rs.getString("category_id"));
					list.add(catgryLst);
				}	
				return list;
			}		
		});		
		if(lists.size()==0) {
			throw new NoRecordFoundException();
		}
	return lists;
}

public List<ProdSubCat> selectAllProductCategoryList() throws NoRecordFoundException{
	
	String sql= "select prod_subcatgry_id,prod_subcatgry_name,category_id from prod_sbct;";
	
	List<ProdSubCat> prodSubCatlists = new ArrayList<ProdSubCat>();
	prodSubCatlists = jdbcTemplate.query(sql, new ResultSetExtractor<List<ProdSubCat>>(){

		public List<ProdSubCat> extractData(ResultSet rs) throws SQLException, DataAccessException {
			
			List<ProdSubCat> list=new ArrayList<ProdSubCat>();
			while(rs.next()) {
				
				ProdSubCat prodCatgryLst=new ProdSubCat();
				prodCatgryLst.setProdSubCatgryId(rs.getString("prod_subcatgry_id"));
				prodCatgryLst.setProdSubCatName(rs.getString("prod_subcatgry_name"));
				prodCatgryLst.setCatgryId(rs.getString("category_id"));
				list.add(prodCatgryLst);
			}	
			return list;
		}		
	});
	if(prodSubCatlists.size()==0) {
		throw new NoRecordFoundException();
	}
	return prodSubCatlists;
}

	public List<ProdSubCat> selectSingleProductCategoryList(String prodCatId) throws NoRecordFoundException {
		
		
		//String sql= "select prod_subcatgry_id,prod_subcatgry_name,category_id from prod_sbct where category_id= ?;";
		
		/*
		 * List<ProdSubCat> prodSubCatgs=new ArrayList<ProdSubCat>(); try {
		 * prodSubCatgs= jdbcTemplate.query(sql, new Object[] {prodCatId},new
		 * ProductCategoryListRowMapper());
		 * 
		 * return prodSubCatgs; }catch (EmptyResultDataAccessException e) {
		 * logger.debug("EmptyResultDataAccessException"); throw new
		 * NoRecordFoundException(); }
		 */
	
		String sql= "select prod_subcatgry_id,prod_subcatgry_name,category_id from prod_sbct where category_id= ?;";
		
		List<ProdSubCat> prodSubCatgs=new  ArrayList<ProdSubCat>();
			prodSubCatgs= jdbcTemplate.query(sql, new Object[] {prodCatId},new ProductCategoryListRowMapper());	
			
			
			logger.debug("EmptyResultDataAccessException");
			if(prodSubCatgs.size()==0) {
				throw new NoRecordFoundException();
			}
			return prodSubCatgs;
	}
		
class ProductCategoryListRowMapper implements RowMapper<ProdSubCat>	
{
    public ProdSubCat mapRow(ResultSet rs, int rowNum) throws SQLException {
    	ProdSubCat prodSubCat= new ProdSubCat();     
    	prodSubCat.setProdSubCatgryId(rs.getString("prod_subcatgry_id"));
    	prodSubCat.setProdSubCatName(rs.getString("prod_subcatgry_name"));
    	prodSubCat.setCatgryId(rs.getString("category_id"));
    	
        return prodSubCat;
    }
}

public ProductList selectProductDetails(String productId) throws NoRecordFoundException {
	
	String sql = "select prod_id,prod_name,category_id,prod_cat_id,prod_description,prod_price,prod_avail,brand,prod_rating,prod_attribute,product_image from pdlst where prod_id= ? ;";
	ProductList prodLst = new ProductList();
	try {
		prodLst = jdbcTemplate.queryForObject(sql,new Object[]{productId},new ProductDtlsRowMapper());
	}catch(EmptyResultDataAccessException e) {
		throw new NoRecordFoundException();
	}
	return prodLst;
}

public ProdSubCat selectProdCategoriesAndSubCat(String prodCatId) {
	
	StringBuffer sql =new StringBuffer( "select PROD_SUBCATGRY_ID,PROD_SUBCATGRY_NAME,CATEGORY_NAME,prod_sbct.CATEGORY_ID from prod_sbct ")
						.append(" inner join catg_lst on prod_sbct.CATEGORY_ID = catg_lst.CATEGORY_ID where prod_sbct.PROD_SUBCATGRY_ID = ? ;");
	ProdSubCat prodLst = new ProdSubCat();
	try {
		prodLst = jdbcTemplate.queryForObject(sql.toString(), new Object[]{prodCatId},new  ProductCatgryDtlsRowMapper());
	}catch(EmptyResultDataAccessException e) {
		
	}
	return prodLst;
}

public List<ProductList> selectProductListByPrice(String prodCatId, String orderBy) {
	
	StringBuffer sql=new StringBuffer();
	  sql.append(" select PROD_ID,")
	  .append(" PROD_NAME,")
	  .append(" CATEGORY_ID,")
	  .append(" PROD_CAT_ID,")
	  
	  .append(" PROD_PRICE,")
	  .append(" PROD_AVAIL,")
	  .append(" PROD_DESCRIPTION,")
	 
	  .append(" PROD_RATING,")
	  .append(" BRAND,")
	  .append(" PROD_ATTRIBUTE,")
	  .append(" PRODUCT_IMAGE")
	  .append(" from pdlst where PROD_CAT_ID = ? order by PROD_PRICE " + orderBy + " ; " );

	  List<ProductList> prodlists=jdbcTemplate.query(sql.toString(),new Object[] {prodCatId}, new ResultSetExtractor<List<ProductList>>(){

		public List<ProductList> extractData(ResultSet rs) throws SQLException, DataAccessException {
			// TODO Auto-generated method stub
			List<ProductList> prodlist=new ArrayList<ProductList>();
			
			while(rs.next()) {
				ProductList prodList=new ProductList();
				prodList.setProductId(rs.getString("PROD_ID"));
				prodList.setProductName(rs.getString("PROD_NAME"));
				prodList.setCategryId(rs.getString("CATEGORY_ID"));
				prodList.setProductCatgryId(rs.getString("PROD_CAT_ID"));
				prodList.setPrice(rs.getDouble("PROD_PRICE"));
				prodList.setProductAvailabilty(rs.getInt("PROD_AVAIL"));
				prodList.setProductDesc(rs.getString("PROD_DESCRIPTION"));
				prodList.setRating(rs.getString("PROD_RATING"));
				prodList.setBrand(rs.getString("BRAND"));
				prodList.setProductAttribute(rs.getString("PROD_ATTRIBUTE"));
				prodList.setProductImage(rs.getString("PRODUCT_IMAGE"));	
				prodlist.add(prodList);
			}
			return prodlist;
			}
		});			
	return prodlists;
}


@SuppressWarnings("unchecked")
public List<String> selectBrands(String prodCatId) {

	@SuppressWarnings("unused")
	List<String> brandList= new ArrayList<String>();
	
	String sql = "select distinct(brand) from pdlst where prod_cat_id = ?;";
	brandList = jdbcTemplate.query(sql, new Object[] {prodCatId}, new RowMapper() {
		public Object mapRow(ResultSet resultSet, int i) throws SQLException {
	        return resultSet.getString(1);
	      }
	});

	return brandList;
}

@SuppressWarnings("unchecked")
@Override
public List<String> selectBrandBySearch(String searchKey) throws NoRecordFoundException {
	// TODO Auto-generated method stub
	List<String> brandList= new ArrayList<String>();
	
	StringBuffer sql = new StringBuffer("select distinct(brand) from pdlst where ");
	List<Object> data = new ArrayList<Object>();
	
	
	if(searchKey !=null) {
		   sql.append("  prod_name like ?");
		   data.add("%" + searchKey + "%");
		   sql.append(" or prod_description like ?");
		   data.add("%" + searchKey + "%");
		   sql.append(" or brand like ?");
		   data.add("%" + searchKey + "%");
	  }
	Object[] array = data.toArray(new Object[data.size()]);	
	
	brandList = jdbcTemplate.query(sql.toString(), array, new RowMapper() {
		public Object mapRow(ResultSet resultSet, int i) throws SQLException {
	        return resultSet.getString(1);
	      }
	});

	return brandList;
}
}
class ProductDtlsRowMapper implements RowMapper<ProductList>{

	public ProductList mapRow(ResultSet rs, int rowNum) throws SQLException {

		ProductList prod = new ProductList();
		prod.setProductId(rs.getString("prod_id"));
		prod.setProductName(rs.getString("prod_name"));
		prod.setCategryId(rs.getString("category_id"));
		prod.setProductCatgryId(rs.getString("prod_cat_id"));
		prod.setProductDesc(rs.getString("prod_description"));
		prod.setPrice(rs.getDouble("prod_price"));
		prod.setProductAvailabilty(rs.getInt("prod_avail"));
		prod.setBrand(rs.getString("brand"));
		prod.setRating(rs.getString("prod_rating"));
		prod.setProductAttribute(rs.getString("prod_attribute"));
		prod.setProductImage(rs.getString("product_image"));
		return prod;
	}	
}
class ProductCatgryDtlsRowMapper implements RowMapper<ProdSubCat>{

	public ProdSubCat mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		
		ProdSubCat prodSubCat = new ProdSubCat();
		prodSubCat.setProdSubCatgryId(rs.getString("PROD_SUBCATGRY_ID"));
		prodSubCat.setProdSubCatName(rs.getString("PROD_SUBCATGRY_NAME"));
		prodSubCat.setCatgryName(rs.getString("CATEGORY_NAME"));
		prodSubCat.setCatgryId(rs.getString("CATEGORY_ID"));
		return prodSubCat;
	}
}