package com.havishApp.user.service;

import com.havishApp.Exception.DataAlreadyExistsException;
import com.havishApp.user.model.vo.UserVo;

public interface IUserService {

	public UserVo saveUser(UserVo userVo) throws DataAlreadyExistsException;
	
	public UserVo isValidUser(String userName,String password); 
	
	public String resetPassword(String userName,String oldPassword,String newPasswordOne,String newPassword2);
	
	public UserVo forgotPassword(String userName);
	
	public UserVo editProfile(UserVo userVo);
	
	public UserVo selectUserProfile(UserVo UserVo);
	
	public UserVo resteditProfile(UserVo userVo);
	
	public UserVo restSignUp(UserVo userVo)throws DataAlreadyExistsException;
	
	public UserVo generateOTPforSignUp(UserVo userVo);
		
	public UserVo restLogIn(UserVo userVo);
	
	public UserVo restSignUpOTPValidation(UserVo userVo);
}
