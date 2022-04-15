package com.ashspell.project.user.bo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.ashspell.project.user.dao.UserDAO;
import com.ashspell.project.user.model.User;

@Service
public class UserBO {
	
	@Autowired
	private UserDAO userDAO;
	

	
	public int addUser(
			String loginid,
			String password,
			String email,
			String name,
			String hometown) {
		
		return userDAO.insertUser(loginid, password, email, name, hometown);
		
	}
	
	public User getuser(
			String loginid ,
			String password
			) {
	
	
		

		return userDAO.selectUser(loginid, password);
	}
	
	
}
