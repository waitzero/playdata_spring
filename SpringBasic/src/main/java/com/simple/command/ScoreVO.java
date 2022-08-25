package com.simple.command;

public class ScoreVO {
	private String name;
	private String kor;
	private String eng;
	private String math;
	public ScoreVO() {
		// TODO Auto-generated constructor stub
	}
	public ScoreVO(String name, String kor, String eng, String math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	@Override
	public String toString() {
		return "ScoreVO [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKor() {
		return kor;
	}
	public void setKor(String kor) {
		this.kor = kor;
	}
	public String getEng() {
		return eng;
	}
	public void setEng(String eng) {
		this.eng = eng;
	}
	public String getMath() {
		return math;
	}
	public void setMath(String math) {
		this.math = math;
	}
	
}
