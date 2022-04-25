package com.ashspell.project.post.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PostDAO {

	public int insertPost(
			@Param("postid") int postid,
			@Param("title") String title,
			@Param("hometown") String hometown,
			@Param("content") String content,
			@Param("filepath") String filepath);
	
	
	
}
	
	
	

