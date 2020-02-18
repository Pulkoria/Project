package com.havishApp.user.dao;

import com.havishApp.Exception.DataAlreadyExistsException;
import com.havishApp.Exception.NoRecordFoundException;
import com.havishApp.user.model.pojo.User;

public interface IUserDao {
	
	public void saveNewUser(User user)throws DataAlreadyExistsException;
	
	public User selectUser(String userName)throws NoRecordFoundException;
		
	public void update(String username,String oldPassword,String newPassword);
	
	public void updateUserProfile(User user);
}
