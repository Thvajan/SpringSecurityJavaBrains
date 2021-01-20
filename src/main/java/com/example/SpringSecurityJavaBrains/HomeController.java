package com.example.SpringSecurityJavaBrains;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/")
	@ResponseBody
	public String home() {
//		return "home.html"; 
		return ("<h1>Welcome Home</h1>");
	}
	
	@RequestMapping("/user")
	@ResponseBody
	public String user() {
//		return "home.html";
		return ("<h1>Welcome User</h1>");
	}
	
	@RequestMapping("/admin")
	@ResponseBody
	public String admin() {
//		return "home.html";
		return ("<h1>Welcome Admin</h1>");
	}
	
	@RequestMapping("/login")
	public String loginPage() {
		return "login.html";
	}
	
	@RequestMapping("/logout-done")
	public String logoutPage() {
		return "logout.html";
	}
}
