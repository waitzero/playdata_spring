package com.simple.command;

import java.util.List;

public class MemberVO {
	private String id;
	private String pw;
	private List<String> inter;
	//기본 생성자
	public MemberVO() {
		// TODO Auto-generated constructor stub
	}
	//맴버 생성자
	public MemberVO(String id, String pw, List<String> inter) {
		super();
		this.id = id;
		this.pw = pw;
		this.inter = inter;
	}
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pw=" + pw + ", inter=" + inter + "]";
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public List<String> getInter() {
		return inter;
	}
	public void setInter(List<String> inter) {
		this.inter = inter;
	}

}
