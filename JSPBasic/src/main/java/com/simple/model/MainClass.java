package com.simple.model;

public class MainClass {

	public static void main(String[] args) {
	
		MemberDAO dao = MemberDAO.getInstance();
		MemberDAO dao2 = MemberDAO.getInstance();
		System.out.println(dao == dao2);
		
	
		
		
		
		
	}
}
