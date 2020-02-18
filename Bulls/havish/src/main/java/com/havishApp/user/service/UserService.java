package com.havishApp.user.service;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.Random;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.havishApp.Exception.DataAlreadyExistsException;
import com.havishApp.Exception.NoDataFoundException;
import com.havishApp.Exception.NoRecordFoundException;
import com.havishApp.Exception.OTPMisMatchException;
import com.havishApp.user.dao.IUserDao;
import com.havishApp.user.model.pojo.User;
import com.havishApp.user.model.vo.UserVo;


@Service
public class UserService implements IUserService{
	@Autowired
	IUserDao userDao;
	
	Logger logger=Logger.getLogger(UserService.class);

	public UserVo saveUser(UserVo userVo) throws DataAlreadyExistsException{	
		logger.debug("saveUser");
		
		  User user=new User(); user.setUserId(userVo.getUserId());
		  user.setPassword(userVo.getPassword());
		  user.setUserName(userVo.getUserName()); 
		  user.setEmailId(userVo.getEmailId());
		  user.setPhoneNo(userVo.getPhoneNo());
		  user.setOrganisationId(userVo.getOrganisationId());
		  user.setUserCategory(userVo.getUserCategory());
		  user.setUserRole(userVo.getUserRole());
		  userDao.saveNewUser(user);
		return userVo;
	
	}
	
	@Override
	public UserVo restLogIn(UserVo userVo) {
		// TODO Auto-generated method stub
		
		
		User userResult = new User();
		try {
			userResult = userDao.selectUser(userVo.getPhoneNo());
			userVo.setStatus("UVALID");
			 String numbers = "0457456789"; 
			  
		        // Using random method 
		        Random rndm_method = new Random(); 
		        int len=4;
		        char[] otp = new char[len]; 
		        for (int i = 0; i < len; i++) 
		        { 
		            otp[i] =  numbers.charAt(rndm_method.nextInt(numbers.length())); 
		            System.out.println(otp);
		        } 
		        userVo.setOtp(otp);
		} catch (NoRecordFoundException e) {
			userVo.setStatus("UINVALID");
		}
		return userVo;
	}	
	

	//Invalid UserId - ERINU
	
	public UserVo isValidUser(String userId,String password) {
		
		logger.debug("executing isValidUser"+"userName" + userId  + "password" + password);	
		User userResult=new User();
		UserVo userVo=new UserVo();
		
		//userVo.setStatus("ERINU");		
		try {
			userResult	= userDao.selectUser(userId);
			if(userResult.getPassword().equals(password)) {
				userVo.setStatus("SUCCESS");
				
				 System.out.println("Generating OTP using random() : "); 
			        System.out.print("You OTP is : "); 
			  
			        // Using numeric values 
			        String numbers = "0457456789"; 
			  
			        // Using random method 
			        Random rndm_method = new Random(); 
			        int len=4;
			        char[] otp = new char[len]; 

			        if(userVo.getOtp() !=null) {
			        	
			        	System.out.println("in else");
			        	System.out.println("in else OTP"+otp);
			        	userVo.setOtp(userVo.getOtp());
			        }else {
			        	//check old otp and new are same
			        	for (int i = 0; i < len; i++) 
				        { 
			        		
			        		
				            otp[i] =  numbers.charAt(rndm_method.nextInt(numbers.length())); 
				            System.out.println(otp);
				        } 
			        userVo.setOtp(otp);
			        }
				
			}else {
				//Invalid user password-ERINVP
				userVo.setStatus("ERINVP");
			}	
				userVo.setUserId(userResult.getUserId());
				userVo.setPhoneNo(userResult.getPhoneNo());
				userVo.setPassword(userResult.getPassword());
				userVo.setPhoneNo(userResult.getPhoneNo());
				userVo.setEmailId(userResult.getEmailId());
				userVo.setUserCategory(userResult.getUserCategory());
				userVo.setUserRole(userResult.getUserRole());					
		} catch (NoRecordFoundException e) {
			userVo.setStatus("ERINU");
		}	
		logger.debug("user status"+userVo.getStatus());
		return userVo;
	}

	public String resetPassword(String userName, String oldPassword, String newPasswordOne, String newPassword2) {
		//1.select values for username
		User userDetails=new User();
		String status= "sucess";
		if(newPasswordOne.equals(newPassword2)) {
			try {				
				userDetails = userDao.selectUser(userName);				
				if(!userDetails.getPassword().equals(oldPassword)) {
					status= "incorrect old password";
				}else {
					userDao.update(userDetails.getUserId(), oldPassword, newPasswordOne);
				}	
			}catch(NoRecordFoundException e) {			
			}
		}	
		logger.debug("service method ");
		return status;
	}

	public UserVo forgotPassword(String userId) {
		
		logger.debug("forgotPassword for userId"+userId);
		User userProfile=new User();
		UserVo userVo=new UserVo();
		userVo.setStatus("Error");
		try {
			userProfile = userDao.selectUser(userId);
			userVo.setPassword(userProfile.getOrganisationId());	
			userVo.setUserId(userId);
			userVo.setStatus("sucesss");
			
		} catch (NoRecordFoundException e) {	
		}					
		return userVo;
	}

	public UserVo editProfile(UserVo userVo) {
		
		User user = new User();
		BeanUtils.copyProperties(userVo, user);
		user.setUserId("dafin");
		userDao.updateUserProfile(user);
		logger.debug("data updated sucessfully");
		//select data after update
		User userdata =  new User();
		try {
			userdata = userDao.selectUser(userVo.getUserId());
			BeanUtils.copyProperties(userdata, userVo);
			logger.debug("userdata after update"+userdata.toString());
		} catch (NoRecordFoundException e) {	
			
		}
		
		return userVo;
	}

	@Override
	public UserVo selectUserProfile(UserVo userVo) {

		User user=new User();
		
		try {
			user = userDao.selectUser(userVo.getUserId());
			BeanUtils.copyProperties(user, userVo);
			logger.debug("selected values"+user);
		} catch (NoRecordFoundException e) {
			
		}
		return userVo;
	}

	@Override
	public UserVo resteditProfile(UserVo userVo) {
		// TODO Auto-generated method stub
		/*
		 * UserVo userVo = new UserVo(); User user = new User();
		 * 
		 * user = userDao.selectUser(userVo); return null;
		 */
		
		return userVo;
		
	}
	
	@Override
	public UserVo restSignUpOTPValidation(UserVo userVo) {
		// TODO Auto-generated method stub
		 User user=new User();
		 User userDtls =new User();
		 BeanUtils.copyProperties(userVo,user);
		 try {
			 userDao.saveNewUser(user);
		} catch (DataAlreadyExistsException e) {
			
		}	 
		return userVo;
	}


	@Override
	public UserVo restSignUp(UserVo userVo) throws DataAlreadyExistsException {
		
		User user = new User();
		BeanUtils.copyProperties(userVo,user);
		
		try {
			user = userDao.selectUser(userVo.getPhoneNo());
			
			throw new DataAlreadyExistsException();
			  
			
		} catch (NoRecordFoundException e) {
			
			System.out.println("Generating OTP using random() : "); 
	        System.out.print("You OTP is : "); 
	  
	        // Using numeric values 
	        String numbers = "0457456789"; 
	  
	        // Using random method 
	        Random rndm_method = new Random(); 
	        int len=4;
	        char[] otp = new char[len]; 
	        for (int i = 0; i < len; i++) 
	        { 
        		
        		
	            otp[i] =  numbers.charAt(rndm_method.nextInt(numbers.length())); 
	            System.out.println(otp);
	        } 
	        userVo.setOtp(otp);
		
		}
		

	      
		/*
		 * if(userVo.getOtp() !=null) {
		 * 
		 * System.out.println("in else"); //if(genOTP.equals(userOTP)) { //throw new
		 * OTPMisMatchException(); //} //save user
		 * System.out.println("in else OTP"+otp); userVo.setOtp(userVo.getOtp());
		 * userDao.saveNewUser(user); }else {
		 */
	        	//check old otp and new are same
	        	
	        /*Plivo.init();
	        try {
				Message.creator("7349087550", Collections.singletonList("9988050140"), "Hello, world!")
				.create();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (PlivoRestException e) {
				e.printStackTrace();
			}
	        
	        }*/
	        
			/*
			 * Plivo.init("auth_id", "auth_token"); try { MessageCreateResponse response =
			 * Message.creator(Collections.singletonList("+917349087550"),
			 * "Hello, this is test message", "your_powerpack_uuid").url(new
			 * URL("http://foo.com/sms_status/")) .create(); System.out.println(response);
			 * // Prints only the message_uuid
			 * System.out.println(response.getMessageUuid()); }
			 * 
			 * catch (PlivoRestException | IOException e) { e.printStackTrace(); }
			 */
	       // }
	   return userVo;
	}

	@Override
	public UserVo generateOTPforSignUp(UserVo userVo) {
		// TODO Auto-generated method stub
		
		 System.out.println("Generating OTP using random() : "); 
	      System.out.print("You OTP is : "); 
	  
	        // Using numeric values 
	        String numbers = "0457456789"; 
	        // Using random method 
	        Random rndm_method = new Random(); 
	        int len=4;
	        char[] otp = new char[len]; 

	        	for (int i = 0; i < len; i++) 
		        { 
	        		
	        		
		            otp[i] =  numbers.charAt(rndm_method.nextInt(numbers.length())); 
		            System.out.println(otp);
		        } 
	      userVo.setOtp(otp);
		
		
		return userVo;
	}

	
	/*
	 * @Override public UserVo restLoginOTPValidation(UserVo userVo) {
	 * 
	 * 
	 * 
	 * 
	 * 
	 * return null; }
	 */
}
