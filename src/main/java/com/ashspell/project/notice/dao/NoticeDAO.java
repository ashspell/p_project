package com.ashspell.project.notice.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticeDAO {
	

	public int insertAdminPost(
			@Param("noticetitle") String noticetitle,
			@Param("noticecontent") String noticecontent
			);
}
