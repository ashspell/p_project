package com.ashspell.project.notice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/project")
public class NoticeController {
	
	@GetMapping("/notice_view")
	public String noticeview() {
		return"/project/post/notice";
	}
	
	@GetMapping("/noticeupload_view")
	public String noticeupload() {
		return"/project/post/noticeupload";
	}
	
	@GetMapping("/noticedetail_view")
	public String noticedetail() {
		return "/project/post/notice_detail";
	}
}
