package com.ashspell.project.user.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.ashspell.project.user.model.User;

@Repository
public interface UserDAO {
	
	public int insertUser(
			@Param("loginid") String loginid,
			@Param("password") String password,
			@Param("email") String email,
			@Param("name") String name,
			@Param("hometown") String hometown);
	
	public User selectUser(
			@Param("loginid") String loginid,
			@Param("password") String password);
	
	
	public int selectCountByloginId(@Param("loginid")String loginid);
	
}
