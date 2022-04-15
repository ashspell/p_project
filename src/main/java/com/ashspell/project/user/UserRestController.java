package com.ashspell.project.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ashspell.project.user.bo.UserBO;

@RestController
@RequestMapping("/project")
public class UserRestController {
	
	@Autowired
	private UserBO userBO;
	
	@GetMapping("/sign_up")
	
	public Map <String, String> signup(
			@RequestParam("loginid") String loginid,
			@RequestParam("password") String password,
			@RequestParam("email") String email,
			@RequestParam("name") String name,
			@RequestParam("hometown") String hometown) {
		
		int count = userBO.addUser(loginid, password, email, name, hometown);
		
		Map <String, String> signup = new HashMap<>();
		
		if(count == 1) {
			signup.put("result", "success");
		} else {
			signup.put("result", "fail");
		}
		
		
		return signup ;
	}
}
