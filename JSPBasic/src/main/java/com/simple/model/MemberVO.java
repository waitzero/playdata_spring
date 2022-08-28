package com.simple.model;

import java.sql.Timestamp;

public class MemberVO {
	
	//vo(DTO)클래스는 데이터베이스와 값을 전달하기 위한 클래스
	//데이터베이스 컬럼명에 맞추어 멤버변수를 선언합니다 (자바빈이랑 같음)
	private String id;
	private String pw;
	private String name;
	private String gender;
	private Timestamp regdate;
	//생성자
	public MemberVO() {
	}
	//생성자 alt +shift + s
	public MemberVO(String id, String pw, String name, String gender, Timestamp regdate) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.gender = gender;
		this.regdate = regdate;
	}
	
	//getter, setter
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Timestamp getRegdate() {
		return regdate;
	}
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	
	
	
	
	
	
	
	
}
