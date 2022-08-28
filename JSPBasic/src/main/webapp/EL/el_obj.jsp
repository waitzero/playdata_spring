<%@page import="com.simple.bean.UserVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	//세션
	session.setAttribute("aaa", "홍길동님");



	//포워드방법으로 ok페이지에 vo를 전달
	UserVO vo = new UserVO("aaa", "1234", "서울시", "22");
	//리퀘스트에 저장
	request.setAttribute("vo", vo);

	//포워드이동
	request.getRequestDispatcher("el_obj_ok.jsp").forward(request, response);
	
%>