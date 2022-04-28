package com.ashspell.project.notice;



import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ashspell.project.notice.bo.NoticeBO;

@RestController
@RequestMapping("/project")
public class NoticeRestController {

	
	
	@Autowired
	private NoticeBO noticeBO;
	
	
	@PostMapping("/adminupload")
	
	public Map<String, String> adminupload(
			@RequestParam("noticetitle") String noticetitle,
			@RequestParam("noticecontent") String noticecontent
			) {
		
		
		Map<String, String> result = new HashMap<>();
		
		int count = noticeBO.addAdminPost(noticetitle, noticecontent);
		
		if(count == 1) {
			result.put("result", "success");
		}else {
			result.put("result", "fail");
		}
		
		return result;
	
	}
	
	@
	
	

	
	

}
