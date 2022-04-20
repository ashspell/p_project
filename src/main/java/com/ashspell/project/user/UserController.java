package com.ashspell.project.user;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/project")
public class UserController {
	
	@GetMapping("/signin_view")
	public String loginview() {
		return "project/user/signin";
	}
	
	@GetMapping("/signup_view")
	public String signupview() {
		return "project/user/signup";
	}
	
	@GetMapping("/sign_out") 
	public String signout (HttpServletRequest request) {
			
		HttpSession session = request.getSession();
		
		session.removeAttribute("id");
		session.removeAttribute("loginid");
		session.removeAttribute("name");
	
		return "redirect:/project/sign_out";
		
	}
	
	
	
}
