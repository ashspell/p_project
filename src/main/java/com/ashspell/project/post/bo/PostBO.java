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
			 String title,
			String hometown,
			 String content
			 ) {
		
		
		
		return postDAO.insertpost(title,  hometown, content);
		
	}
	
	public List<Post> getpostlist() {
		
		return postDAO.selectPostList();	
		
	}
	
	public Post getpost(int id) {
		
		return postDAO.selectpost(id);
	}
	
	public int deletepost(int id) {
		
		return postDAO.deletepost(id);
	}
	
	public int updatepost(int id, String title, String content, String filepath) {
		
		return postDAO.updatepost(id, title, content, filepath);
	}
	
	public List<Post> hometownpost(String hometown) {
		
		return postDAO.hometownpost(hometown);
	}
 
	
	

		
	
}
