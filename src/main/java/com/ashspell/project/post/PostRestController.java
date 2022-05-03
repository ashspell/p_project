package com.ashspell.project.post;

import java.util.HashMap;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.ashspell.project.post.bo.PostBO;



@RestController
@RequestMapping("/project/post")
public class PostRestController {

	
	@Autowired
	private PostBO postBO;
	
	
	@PostMapping("/upload")
	
	public Map<String, String> upload(
			@RequestParam("postid") String postid,
			@RequestParam("title") String title,
			@RequestParam("hometown") String hometown,
			@RequestParam("content") String content,
			@RequestParam("filepath") String filepath
			) {
		
		
		Map<String, String> result = new HashMap<>();
		
		int count = postBO.addPost(postid, title, hometown, content, filepath);
		
		if(count == 1) {
			result.put("result", "success");
		}else {
			result.put("result", "fail");
		}
		
		return result;
	
	}
	
	
	
	
	
	

}

