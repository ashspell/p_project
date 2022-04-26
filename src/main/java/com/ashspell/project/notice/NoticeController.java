package com.ashspell.project.notice;



import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ashspell.project.notice.bo.NoticeBO;
import com.ashspell.project.notice.model.Notice;

@Controller
@RequestMapping("/project")
public class NoticeController {
	
	
	@Autowired
	private NoticeBO noticeBO;
	
	@GetMapping("/notice_view")
	public String noticeview(Model model ) {
		

		
		
		List<Notice> noticelist = noticeBO.getnoticelist();
		
		model.addAttribute("noticelist" ,noticelist);
		
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
