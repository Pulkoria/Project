package com.havishApp.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.havishApp.Exception.DataAlreadyExistsException;
import com.havishApp.Exception.OTPMisMatchException;
import com.havishApp.user.model.vo.UserLoginResponse;
import com.havishApp.user.model.vo.UserVo;
import com.havishApp.user.service.IUserService;

@Controller
@Scope("session")
public class UserRestController {
	@Autowired
	IUserService userService;
	
	@RequestMapping(value="/newUserReg",method = RequestMethod.POST,produces="application/json")
	@ResponseBody public UserLoginResponse newUserRegistration(@RequestBody UserVo userVo){
		
		UserLoginResponse response = new UserLoginResponse();
		
		try {
			userService.saveUser(userVo);
			response.setStatus("Success");
			response.setMessage("User Registration done successfully");
		} catch (DataAlreadyExistsException e) {
			response.setStatus("Error");
			response.setMessage("User Registration failed,UserName already Exists");
		}
		
		return response;
	}
	
	@RequestMapping(value="/loginUser",method=RequestMethod.POST,produces="application/json")
	@ResponseBody public UserLoginResponse loginUser(@RequestBody UserVo userVo, HttpServletRequest request, HttpSession httpSession) {
		
		
		//setAttribute()/getAttribute()
		
		
		UserLoginResponse response =new UserLoginResponse();
		UserVo userRes = new UserVo();

		userRes = userService.restLogIn(userVo);
		
		if(userRes.getStatus().equals("UVALID")) {
			response.setOtp(userRes.getOtp());
			
			request.getSession().setAttribute("otp", userRes.getOtp());

			response.setStatus("Success");
			response.setMessage("OTP Generated");
		}else if(userRes.getStatus().equals("UINVALID")) {
			response.setStatus("error");
			response.setMessage("Invalid UserId");
		}
		return response;
	}
	
	@RequestMapping(value="/signInOTP",method=RequestMethod.POST,produces="application/json")
	@ResponseBody public UserLoginResponse signInOTPValidation(@RequestBody UserVo userVo, HttpServletRequest request, HttpSession httpSession) {
		
		UserLoginResponse response = new UserLoginResponse();
		UserVo result = new UserVo();
		
		char[] otp = (char[]) request.getSession().getAttribute("otp");	
		System.out.print(otp);
		//56476B07B72C8DFF7B24F0BC208E00B8
		if(String.valueOf(userVo.getOtp()).equals(String.valueOf(otp))) {
			System.out.println("otp is vrified");
			response.setOtp(otp);
			response.setStatus("success");
			response.setMessage("OTP verified Sucessfully");
		}else {
			System.out.println("Not a valid OTP");
			response.setStatus("error");
			response.setMessage("OTP mismatch");
		}
		
		/*
		 * try { result = userService.restSignUp(userVo); response.setUserVo(result);
		 * response.setStatus("Success");
		 * response.setMessage("User created sucessfully"); } catch
		 * (DataAlreadyExistsException e) { response.setStatus("error");
		 * response.setMessage("User Exists"); }
		 */
		return response;
	}

	
	/*
	 * @RequestMapping(value="/loginUser/{userId}/{password}",method=RequestMethod.
	 * POST,produces="application/json")
	 * 
	 * @ResponseBody public UserLoginResponse
	 * loginUser(@PathVariable("userId")String
	 * userId,@PathVariable("password")String password) {
	 * 
	 * UserLoginResponse response =new UserLoginResponse(); UserVo userRes = new
	 * UserVo();
	 * 
	 * userRes = userService.isValidUser(userId, password);
	 * 
	 * if(userRes.getStatus().equals("SUCCESS")) { response.setStatus("Success");
	 * response.setMessage("User login sucessfully"); }else
	 * if(userRes.getStatus().equals("ERINVP")) { response.setStatus("error");
	 * response.setMessage("Invalid User password"); }else
	 * if(userRes.getStatus().equals("ERINU")) { response.setStatus("error");
	 * response.setMessage("Invalid UserId"); } return response; }
	 */
	
	@RequestMapping(value="/signUp",method=RequestMethod.POST,produces="application/json")
	@ResponseBody public UserLoginResponse signUp(@RequestBody UserVo userVo, HttpServletRequest request, HttpSession httpSession) {
		
		UserLoginResponse response = new UserLoginResponse();
		UserVo result = new UserVo();
		try {
			result = userService.restSignUp(userVo);
			request.getSession().setAttribute("signotp", result.getOtp());
			request.getSession().setAttribute("email", result.getEmailId());
			request.getSession().setAttribute("userName", result.getUserName());
			response.setOtp(result.getOtp());
			response.setStatus("Success");			
			response.setMessage("OTP sent");
		} catch (DataAlreadyExistsException e) {
			response.setStatus("error");
			response.setMessage("User Exists");
		}		
		return response;
	}
	@RequestMapping(value="/signUpOTP",method=RequestMethod.POST,produces="application/json")
	@ResponseBody public UserLoginResponse signUpOTPValidation(@RequestBody UserVo userVo,HttpServletRequest request, HttpSession httpSession) {
		
		UserLoginResponse response = new UserLoginResponse();
		UserVo result = new UserVo();
		char[] otp = (char[]) request.getSession().getAttribute("signotp");	
		String email = (String) request.getSession().getAttribute("email");	
		String userName = (String) request.getSession().getAttribute("userName");	
		
		System.out.print(otp);
		
		if(String.valueOf(userVo.getOtp()).equals(String.valueOf(otp))) {
			  userVo.setEmailId(email);
			  userVo.setUserName(userName);
			  result = userService.restSignUpOTPValidation(userVo);
			  response.setUserVo(result);
			  response.setOtp(otp);
			  response.setStatus("Success");
			  response.setMessage("Sucess"); 
		}else {
			 response.setStatus("error");
			 response.setMessage("OTP mistmatch"); 
		  
		}
		return response;
	}
}
