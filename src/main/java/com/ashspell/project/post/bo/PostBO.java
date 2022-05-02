package com.ashspell.project.post.bo;






import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashspell.project.post.dao.PostDAO;
import com.ashspell.project.post.model.Post;

@Service
public class PostBO {
	
	@Autowired
	private PostDAO postDAO;
	
	public int addPost(
			 String postid,
			 String title,
			 String hometown,
			 String content,
			 String filepath) {
		
		
		
		return postDAO.insertPost(postid, title, hometown, content, filepath);
		
	}
	
	public List<Post> getpostlist() {
		
		return postDAO.selectPostList();	
		
	}
	
	public Post getpost(int id) {
		
		return postDAO.selectpost(id);
	}
	

	
	

		
	
}
