package com.ashspell.project.post.model;

import java.util.Date;

public class News {

	private String newspath;
	
	private String newscontent;
	
	private Date createdAt;
	
	private Date updatedAt;

	public String getNewspath() {
		return newspath;
	}

	public void setNewspath(String newspath) {
		this.newspath = newspath;
	}

	public String getNewscontent() {
		return newscontent;
	}

	public void setNewscontent(String newscontent) {
		this.newscontent = newscontent;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	
}
