package com.ashspell.project.post.bo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashspell.project.post.dao.PostDAO;

@Service
public class PostBO {
	
	@Autowired
	private PostDAO postDAO;
	
	public int addPost(
			 int postid,
			 String title,
			 String hometown,
			 String content,
			 String filepath) {
		
		
		
		return postDAO.insertPost(postid, title, hometown, content, filepath);
		
		
	}
	

	
	

		
	
}
