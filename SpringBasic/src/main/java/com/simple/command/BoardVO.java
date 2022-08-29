package com.simple.command;

public class BoardVO {
	private String id;
	private String name;
	private String title;
	private String content;
	private String ex;
	
	public BoardVO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BoardVO [id=" + id + ", name=" + name + ", title=" + title + ", content=" + content + ", ex=" + ex
				+ "]";
	}

	public BoardVO(String id, String name, String title, String content, String ex) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
		this.content = content;
		this.ex = ex;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getEx() {
		return ex;
	}

	public void setEx(String ex) {
		this.ex = ex;
	}
	
}
