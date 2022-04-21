package com.ashspell.project.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ashspell.project.user.bo.UserBO;
import com.ashspell.project.user.model.User;

@RestController
@RequestMapping("/project")
public class UserRestController {
	
	@Autowired
	private UserBO userBO;
	
	
	@PostMapping("/sign_up")
	
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

	@GetMapping("/duplicateid")
	
	public Map<String, Boolean> duplicateid (
			@RequestParam("loginid")String loginid
			){
		
		boolean duplicateid = userBO.isDuplicateId(loginid);
		
		Map<String, Boolean> isduplicate = new HashMap<>();
		
		isduplicate.put("isDuplicateId", duplicateid);
		
		
		
		return isduplicate;
		
		
	}

	@PostMapping("/signin")
	
	public Map<String, String> signin(
			@RequestParam("loginid") String loginid,
			@RequestParam("password") String password
			) {
		
		User signin = userBO.signin(loginid, password);
		
		 Map<String, String> result = new HashMap<>();
		
		 
		
		return ;
	}
	
	
	
	

}
