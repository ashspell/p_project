package com.ashspell.project.user.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO {
	
	public int insertUser(
			@Param("loginId") String loginid,
			@Param("password") String password,
			@Param("email") String email,
			@Param("name") String name,
			@Param("hometown") String hometown);
	
	public int selectUser(
			@Param("loginId") String loginid,
			@Param("password") String password);
	
}
