<%@page import="com.simple.bean.PointVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	/*
	1. 폼태그를 처리할 수 있는 빈을 선언합니다. name, kor, eng, math, avg
	2. 폼값을 받아서 평균과 총점을 구합니다.
	3. quiz01_result페이지로 이동해서 
		학생정보와 평균, 총점을 모두 출력하세요.
	
	조건: session (x)
	*/
	request.setCharacterEncoding("utf-8");
	
	String name = request.getParameter("name");
	String kor = request.getParameter("kor");
	String math = request.getParameter("math");
	String eng = request.getParameter("eng");
	
	int a = Integer.parseInt(kor); //형변환
	int b = Integer.parseInt(math); 
	int c = Integer.parseInt(eng);
	
	int sum = a + b + c;
	double avg = sum / 3.0;
	
	PointVO vo = new PointVO(name , kor, eng, math, sum, avg );
	//리퀘스트에 저장
	request.setAttribute("vo", vo);
	//포워드이동
	request.getRequestDispatcher("quiz01_result.jsp").forward(request, response);
	
	
	
%>