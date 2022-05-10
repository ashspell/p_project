package com.ashspell.project.post;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ashspell.project.post.bo.PostBO;




@RestController
@RequestMapping("/project")
public class PostRestController {

	
	@Autowired
	private PostBO postBO;
	
	
	@PostMapping("/upload")
	
	public Map<String, String> upload(
			@RequestParam("title") String title,
			@RequestParam("content") String content,
			HttpServletRequest request
			) {
		
		
		HttpSession session = request.getSession();
		
		String hometown = (String)session.getAttribute("hometown");
		
		
		Map<String, String> result = new HashMap<>();
		
		
		int count = postBO.addPost(title, hometown,content);
		
		if(count == 1) {
			result.put("result", "success");
		}else {
			result.put("result", "fail");
		}
		
		return result;
	
	}
	
	
		@PostMapping("/updatepost")
	
			public Map<String, String> updatenotice(
				@RequestParam("id") int id,
				@RequestParam("title") String title,
			    @RequestParam("content") String content
			) {
		
		
		Map<String, String> result = new HashMap<>();
		
		int count = postBO.updatepost(id, title, content, content);
		
		if(count == 1) {
			result.put("result", "success");
		}else {
			result.put("result", "fail");
		}
		
		return result;
	
	}
	
		@GetMapping("/deletepost")
		
		public Map<String, String> deletepost(
				@RequestParam("id") int id,
				HttpServletRequest request
				) {
			
			Map<String, String> result = new HashMap<>();
			
			HttpSession session = request.getSession();
			
			int count = postBO.deletepost(id);
			
			
			if(count == 1) {
				result.put("result", "success");
			}else {
				result.put("result", "fail");
			}
			
			return result;
		}
		
		
		
		
	
	

}

