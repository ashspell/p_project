package com.ashspell.project.post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.ashspell.project.post.bo.PostBO;

@Controller
@RequestMapping("/project")
public class PostController {
	
	@Autowired
	private PostBO postBO;
	
	@GetMapping("/main_view")
	public String mainview() {
		return "/project/post/mainview";
	}
	

	
	@GetMapping("/upload_view")
	public String uploadview() {
		return"/project/post/upload";
	}
	
	@GetMapping("/list_view")
	public String listview() {
		
	
		return "/project/post/list";
	}
	

	
	
}
