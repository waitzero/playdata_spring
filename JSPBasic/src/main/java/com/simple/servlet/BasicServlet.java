package com.simple.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//브라우저에서 apple요청이 들어오면 BasicServlet으로 연결
@WebServlet("/apple") 
public class BasicServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L; //별의미없음
	//오버라이딩 //alt + shift + s
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//System.out.println("서블릿 실행됨");
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.println("서블릿 실행됨"); 
		
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
	}
	

	
	
}
