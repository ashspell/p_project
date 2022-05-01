package com.ashspell.project.notice;




import java.util.HashMap;
import java.util.Map;

<<<<<<< HEAD
import org.apache.ibatis.annotations.Param;
=======
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

>>>>>>> a745e77fefbc687dad9375a6f1d4745e1d2546d1
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ashspell.project.notice.bo.NoticeBO;
import com.ashspell.project.notice.model.Notice;
import com.mysql.cj.xdevapi.Result;

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
	
	
<<<<<<< HEAD
	@GetMapping("/delete")
	
	public Map<String,String> deletenotice(@RequestParam("id") int id) {
		
		int count = noticeBO.deletenotice(id);
		
		Map<String, String> result = new HashMap<>();
		
		if(count == 1) {
			result.put("result", "fail");
		}else {
			result.put("result", "fail");
			
=======
	@GetMapping("/deletenotice")
	
	public Map<String, String> deletenotice(
			@RequestParam("id") int id,
			HttpServletRequest request
			) {
		
		Map<String, String> result = new HashMap<>();
		
		HttpSession session = request.getSession();
		
		int count = noticeBO.deletenotice(id);
		
		
		if(count == 1) {
			result.put("result", "success");
		}else {
			result.put("result", "fail");
		}
		
		return result;
	}
	
	@PostMapping("/updatenotice")
	
	public Map<String, String> updatenotice(
			@RequestParam("id") int id,
			@RequestParam("noticetitle") String noticetitle,
			@RequestParam("noticecontent") String noticecontent,
			HttpServletRequest request
			) {
		
		Map <String, String> result = new HashMap<>();
		
		HttpSession session = request.getSession();
		
		int count = noticeBO.updatenotice(id, noticetitle, noticecontent);
		
		if(count == 1) {
			result.put("result", "success");
		}else {
			result.put("result", "success");
>>>>>>> a745e77fefbc687dad9375a6f1d4745e1d2546d1
		}
		
		return result;
	}
	
	
	

	
	

}
