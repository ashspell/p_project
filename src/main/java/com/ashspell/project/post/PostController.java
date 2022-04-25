package com.ashspell.project.post;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/project")
public class PostController {
	
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
