package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.register.Register;
import com.stud.register.StudentRegister;

@Controller
public class HomeController {	//controller class

	@RequestMapping("/")	//refers to the http://localhost:8080/spring_MVC
	public String showMessage() {	//controller method
		return "index";	//Logical view
	}
	@GetMapping("greet")
	public String sayHello(ModelMap m) {
		//m.addAttribute("message","Welcome to Spring 5.x !");
		m.put("message","Welcome to Spring 5.x !");		//key, value pair
		m.put("test","a simple test");
		
		return "welcome";
	}
	
	@GetMapping("register")
	public String createNewAcc() {
		return "register";
	}
	
	/*
	@GetMapping("registerform")
	public String showData(HttpServletRequest request, ModelMap m) {
		//capture the data entered by the user from the request object
		String userName = request.getParameter("userName");			//pass the parameter from register.jsp file
		String userMobNo = request.getParameter("userMobNo");
		//inject the above data into the ModelMap
		m.put("name", userName);
		m.put("mobile", userMobNo);
		return "welcome";	//welcome.jsp file name
	}
	*/
/*	
	@GetMapping("registerform")
	public String showData(@RequestParam("userName")String user,@RequestParam("userMobNo")Integer userMobNo,ModelMap m) {
		
		m.put("name", user);
		m.put("mobile", userMobNo);
		return"welcome";
		
	}
*/
	
	//Injecting values into bean
	@GetMapping("registerform")
	public String beanStore(@RequestParam("userName")String user,@RequestParam("userMobNo")String userMob,ModelMap m) {
		
		Register r = new Register();
		r.setUserName(user);
		r.setUserMob(userMob);
		m.put("user1", r);
		return"welcome";
		
	}
	
	
	//Login authentication
	@GetMapping("login")
	public String userLogin() {
		
		return "login";
	}
	@GetMapping("loginform")
	public String Auth(@RequestParam("uname")String uname,@RequestParam("upass")String pass,ModelMap m) {
		if(uname.equalsIgnoreCase("nikhil") && pass.equals("1234")) {
			return "success";
		}
		else {
			m.put("message", "Enter correct username and password");
			return "login";
		}

	}
	
	//Student registration form code
	@GetMapping("stud_reg")
	public String showStudRegPage(Model m) {
		
		StudentRegister sr = new StudentRegister();
		m.addAttribute("stud", sr); 	//This is identical with studentregister.jsp file modelAttribute ID
		
		return "studentregister";
	}

	@PostMapping("studform")
	public String showRegistrationData(@ModelAttribute("stud")StudentRegister sr,Model m) {
		
		m.addAttribute("sr",sr);
		return "studentdata";
		
	}
	
	
	
	
	

}











