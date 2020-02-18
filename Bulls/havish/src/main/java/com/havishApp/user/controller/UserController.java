package com.havishApp.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.havishApp.Exception.DataAlreadyExistsException;
import com.havishApp.user.model.vo.UserLoginResponse;
import com.havishApp.user.model.vo.UserVo;
import com.havishApp.user.service.IUserService;

@Controller
public class UserController {
	@Autowired
	IUserService userService;
	
	Logger logger = Logger.getLogger(UserController.class);
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView loadLoginPage(HttpServletRequest request,HttpServletResponse response,@ModelAttribute("userVo") UserVo userVo,BindingResult br,@ModelAttribute("newUser") UserVo userVos) {
		ModelAndView mav=new ModelAndView();
		ModelMap modelmap=new ModelMap();
		mav.setViewName("login");
		modelmap.put("userVo", userVo);
		modelmap.put("newUser", userVos);
        return mav;
	}
	
	//new login method
	
	@RequestMapping(value="/newlogin",method=RequestMethod.GET,produces="application/json")
	@ResponseBody public UserVo loginUser(@RequestParam("phoneNo")String phoneNo,
			@RequestParam("password")String password){
		UserVo userVo =new UserVo();
		
		userVo=userService.isValidUser(phoneNo,password);
		if(userVo.getStatus()!=null && userVo.getStatus().equals("SUCCESS")) {
    		System.out.println("status of user"+userVo.getStatus());
    		
    		//OTP generted and send append to popup 
    		
    		userVo.setStatus("SUCCESS");
			/*
			 * modelmap.put("status", "SUCCESS"); mav.setViewName("checkOut");
			 */
    	}else {
    		if(userVo.getStatus()!=null && userVo.getStatus().equals("ERINU")) {
        		
		          System.out.println("get status "+userVo.getStatus());
		          userVo.setStatus("ERINU");
		         // modelmap.put("status", "ERINU");
		          //append error message
		          
        	}else if(userVo.getStatus()!=null && userVo.getStatus().equals("ERINVP")) {
        		// modelmap.put("status", "ERINVP");
        		userVo.setStatus("ERINVP");
        		//append invalid password
        	}
			/*
			 * modelmap.put("newUser", newuserVo); mav.addAllObjects(modelmap);
			 * System.out.println("get status "+userVo.getStatus());
			 * mav.setViewName("login");
			 */
    	}	
		return userVo;
	}
	
	@RequestMapping(value="/loginOTPVerify",method=RequestMethod.GET)
	 public ModelAndView loginOTPVerification(@RequestParam("newOTP")String newOTP){
		logger.debug("user login done!!");
		ModelAndView mav =new ModelAndView();
		mav.setViewName("home");
		return mav;
	}

	//sign up first method
	@RequestMapping(value="/userReg",method = RequestMethod.GET,produces="application/json")
	@ResponseBody public UserVo newUserOTPGen(@RequestParam("phoneNo")String phoneNo,@RequestParam("userName")String userName,@RequestParam("email")String email,
			@RequestParam("password")String password){
		
			UserVo userResponse = new UserVo();
			userResponse.setPhoneNo(phoneNo);
			userResponse.setUserName(userName);
			userResponse.setEmailId(email);
			userResponse.setPassword(password);
			
			userResponse = userService.generateOTPforSignUp(userResponse);
			
			logger.debug("");
		return userResponse;
	}
	
	//sign up second  method
	@RequestMapping(value="/signUpinsert",method = RequestMethod.GET,produces="application/json")
	@ResponseBody public UserVo newUserRegistration(@RequestParam("phoneNo")String phoneNo,@RequestParam("userName")String userName,@RequestParam("emailId")String email,
			@RequestParam("password")String password){
			
		 	logger.debug("new user save");
			UserVo userResponse = new UserVo();
			userResponse.setPhoneNo(phoneNo);
			userResponse.setUserName(userName);
			userResponse.setEmailId(email);
			userResponse.setPassword(password);
			
			try {
				userResponse = userService.saveUser(userResponse);
				logger.debug("user created");
				userResponse.setStatus("USRCR");
			} catch (DataAlreadyExistsException e) {
				userResponse.setStatus("USREX");
				logger.debug("user already exists");
			}		
			
		return userResponse;
	}
	

	@RequestMapping(value="/login",method=RequestMethod.POST) 
	public ModelAndView validateUser(HttpServletRequest request,HttpServletResponse response,@Valid @ModelAttribute("userVo") UserVo userVo,BindingResult br) {
		
      		ModelAndView mav=new ModelAndView();
	
		ModelMap modelmap=new ModelMap();
		modelmap.put("userVo", userVo);
		
		UserVo newuserVo=new UserVo();
		
		System.out.print("Binding Result"+br.getFieldErrors());
		if(br.hasErrors()) {  
		  
		  modelmap.put("newUser", newuserVo);
		  mav.addAllObjects(modelmap);
          System.out.println("has errors");
          System.out.println("userName"+userVo.getUserId() + "password" +userVo.getPassword());
          mav.setViewName("login");
			}
        else {  
        	
				userVo=userService.isValidUser(userVo.getUserId(),userVo.getPassword());
				
	        	
	        	if(userVo.getStatus()!=null && userVo.getStatus().equals("SUCCESS")) {
	        		System.out.println("status of user"+userVo.getStatus());
	        		 modelmap.put("status", "SUCCESS");
		        	mav.setViewName("checkOut");
	        	}else {
	        		if(userVo.getStatus()!=null && userVo.getStatus().equals("ERINU")) {
		        		
				          System.out.println("get status "+userVo.getStatus());
				          modelmap.put("status", "ERINU");
				          
		        	}else if(userVo.getStatus()!=null && userVo.getStatus().equals("ERINVP")) {
		        		 modelmap.put("status", "ERINVP");
		        	}
		        		  modelmap.put("newUser", newuserVo);
						  mav.addAllObjects(modelmap);
				          System.out.println("get status "+userVo.getStatus());
				          mav.setViewName("login");  
	        	}
	        	
	        	//Based on status of user	        
			     //catch (NoDataFoundException e) { 
			}  
		return mav;	
        }
		//mav.addObject(modelmap);
		
		//modelmap.put("userVo", userVo);
	
	//Not required now
		
	/*
	 * @RequestMapping(value="/new_user",method=RequestMethod.GET) public
	 * ModelAndView loadNewUser(HttpServletRequest request,HttpServletResponse
	 * response,@ModelAttribute("newUser")UserVo userVo,BindingResult result) {
	 * 
	 * ModelAndView mav=new ModelAndView("new_user"); return mav; }
	 */
	
	
	/*
	 * @RequestMapping(value="/new_user",method=RequestMethod.POST) public String
	 * newUserRegistration(HttpServletRequest request,HttpServletResponse
	 * response,@ModelAttribute("new_user")UserVo userVo) {
	 * 
	 * ModelAndView mav=new ModelAndView("new_user"); userService.saveUser(userVo);
	 * return "redirect:login.htm?"; }
	 */
	
	//new user sign up
	@RequestMapping(value="/newUser", method=RequestMethod.POST)
	public ModelAndView newUserRegistration(HttpServletRequest request,HttpServletResponse response,@Valid @ModelAttribute("newUser")UserVo newuserVo,BindingResult result) {
		
		ModelAndView mav=new ModelAndView();
		ModelMap modelmap=new ModelMap();
		
		modelmap.put("newUser", newuserVo);
		mav.setViewName("userProfile");
			try {
				userService.saveUser(newuserVo);
			} catch (DataAlreadyExistsException e) {
				
			}		
		return mav;
	}
	
	//after sign up new page
	  @RequestMapping(value="/userProfilelogin",method=RequestMethod.GET) 
	  public ModelAndView userProfile(HttpServletRequest request,HttpServletResponse response) {
			
			ModelAndView mav=new ModelAndView("userProfile");
			return mav;
		}
	
	//Reset Password
	
	@RequestMapping(value="/resetPass",method=RequestMethod.GET)
	public ModelAndView loadResetPassword(HttpServletRequest request) {
		
		ModelAndView mav=new ModelAndView("reset_password");
		return mav;
	}
	
	@RequestMapping(value="/resetPassword", method = RequestMethod.POST)
	public String resetPassword(HttpServletRequest request,HttpServletResponse response) {
		
		  ModelAndView mav = new ModelAndView("reset_password");
		  String userName=request.getParameter("userName"); 
		  String oldPassword=request.getParameter("oldPassword"); 
		  String newPasswordOne=request.getParameter("newPassword1"); 
		  String newPasswordTwo=request.getParameter("newPassword2");
		 
		  userService.resetPassword(userName, oldPassword, newPasswordOne, newPasswordTwo);
				
		return "redirect:login.htm?";	
	}
	
	//Forget Password
	
	@RequestMapping(value="/forgotPass",method=RequestMethod.GET)
	public ModelAndView loadForgotPassword(HttpServletRequest request) {
		
		ModelAndView mav=new ModelAndView("forgot_password");
		return mav;
	}

	@RequestMapping(value="/forgotPassword", method = RequestMethod.POST)
	public ModelAndView forgotPassword(HttpServletRequest request,HttpServletResponse response) {

		ModelAndView mav = new ModelAndView("forgot_password");			
		String userName=request.getParameter("userName");		 
		userService.forgotPassword(userName);	
		return mav;	
	}	
	
	//Edit Profile
	
	@RequestMapping(value="/userProfile",method=RequestMethod.GET) 
	  public ModelAndView loadeditProfile(HttpServletRequest request,HttpServletResponse response,@ModelAttribute UserVo userVo) {
			
			ModelAndView mav=new ModelAndView();
			
			UserVo userVos = userService.selectUserProfile(userVo);
			
			logger.debug("selected values for user"+ userVos);
			mav.setViewName("userProfile");
			mav.addObject("userVo",userVo);
			return mav;
		}
	
	
	@RequestMapping(value="/editProfie",method = RequestMethod.POST)
	public ModelAndView editProfile(HttpServletRequest request,HttpServletResponse response,@ModelAttribute UserVo userVo) {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("userProfile");
		
		userVo.setOrganisationId("XYZ");
		userVo.setUserRole("User");
		userVo.setUserCategory("Business User");
		userVo.setUserId("swathi");
		
		UserVo updatedValues = userService.editProfile(userVo);
		mav.setViewName("userProfile");
		mav.addObject("userVo",userVo);
		
		logger.debug("profile edited");
		
		return mav;	
	}
}
