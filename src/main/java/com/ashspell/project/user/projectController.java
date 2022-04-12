package com.ashspell.project.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/project")
public class projectController {
	
	@GetMapping("/signin_view")
	public String loginview() {
		return "/project/signin";
	}
	
	@GetMapping("/signup_view")
	public String signupview() {
		return "/project/signup";
	}
	
	@GetMapping("/upload_view")
	public String uploadview() {
		return "/project/upload";
	}
}
