package com.ashspell.project.notice.dao;



import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


import com.ashspell.project.notice.model.Notice;

@Repository
public interface NoticeDAO {
	

	public int insertAdminPost(
			@Param("noticetitle") String noticetitle,
			@Param("noticecontent") String noticecontent
			);

	public List<Notice> selectNoticeList(
			
			);
	
}