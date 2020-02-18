package com.havishApp.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDao {
	@Autowired
	  public JdbcTemplate jdbcTemplate;
	  
	  public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		  this.jdbcTemplate =jdbcTemplate; }
	  
	  public JdbcTemplate getJdbcTemplate() { 
		  
		  return jdbcTemplate; 
		}
	 
	
}
