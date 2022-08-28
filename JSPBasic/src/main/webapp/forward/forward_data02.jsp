<%@page import="com.simple.bean.UserVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	//첫번쨰 화면에서 넘어온 데이터
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	System.out.println(id); //사용..
	System.out.println(pw); //사용..
	
	//데이터베이스에서 조회~~> 새로운 데이터를 가지고 나오는 작업
	String newData = "홍길동";
	
	//리퀘스트에 데이터를 강제로 저장
	UserVO vo = new UserVO("aaa123", "1234", "이순신", "서울");
	request.setAttribute("vo", vo);
	request.setAttribute("newData", newData); //★★★★★★★★★★★★★★★★★★★★★★
	//포워드이동
	request.getRequestDispatcher("forward_data03.jsp").forward(request, response);

	
	
%>