package com.ashspell.project.post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ashspell.project.post.bo.PostBO;
import com.ashspell.project.post.model.Post;

@Controller
@RequestMapping("/project")
public class PostController {
	
	@Autowired
	private PostBO postBO;
	
	@GetMapping("/main_view")
	public String mainview() {
		return "/project/post/mainview";
	}
	

	
	@GetMapping("/listupload_view")
	public String uploadview() {
		return"/project/post/upload";
	}
	
	@GetMapping("/list_view")
	public String listview(Model model) {
		
		List<Post> postlist = postBO.getpostlist();
		
		model.addAttribute("postlist", postlist);
		
		return "/project/post/list";
	}
	
	@GetMapping("/listdetail_view")
	public String listdetail(@RequestParam("id") int id, Model model) {
		
		Post postdetail = postBO.getpost(id);
		
		model.addAttribute("postdetail", postdetail);
		
		
		return "/project/post/listdetail";
	}
	
	@GetMapping("/listupdate_view")
	public String listupdate(@RequestParam("id") int id, Model model) {
		
		Post postupdate = postBO.getpost(id);
		
		model.addAttribute("postupdate", postupdate);
		
		return "/project/post/listupdate";
	}
	

	

	
	
}
