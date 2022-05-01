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

	public List<Notice> selectNoticeList();
	
	public Notice selectnotice (@Param("id") int id);
	
	public int updatenotice(
			@Param("id") int id,
			@Param("noticetitle") String noticetitle,
			@Param("noticecontent") String noticecontent
			);
	
	public int deletenotice(
			@Param("id") int id
			
			);
	
<<<<<<< HEAD
	public int deletenotice(
			@Param("id") int id			
			);
	
=======

>>>>>>> a745e77fefbc687dad9375a6f1d4745e1d2546d1
	
}