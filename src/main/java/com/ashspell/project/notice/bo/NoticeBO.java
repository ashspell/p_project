package com.ashspell.project.notice.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashspell.project.notice.dao.NoticeDAO;

@Service
public class NoticeBO {
	
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	public int addAdminPost(
			
			String noticetitle,
			String noticecontent
			
			
			
			) {
		
		return noticeDAO.insertAdminPost(noticetitle, noticecontent);
	}
}
