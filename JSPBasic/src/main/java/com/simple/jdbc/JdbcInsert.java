package com.simple.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcInsert {

	public static void main(String[] args) {
		
		//jdbc연습
		String url = "jdbc:mysql://localhost:3306/jsp?serverTimezone=Asia/Seoul";
		String uid = "jsp";
		String upw = "jsp";
		
		Connection conn = null; //
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//insert, update, delete는 유형이 같습니다.
		String sql = "insert into members(id, pw, name, gender) values(?, ?, ?, ?)";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//1
			conn = DriverManager.getConnection(url, uid, upw);
			//2
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "kkk123" );
			pstmt.setString(2, "1234");
			pstmt.setString(3, "신사임당");
			pstmt.setString(4, "n");
			
			//3. executeUpdate는 성공시 1, 실패시 0을 반환
			int result = pstmt.executeUpdate();
			
			if(result == 1) {
				System.out.println("인서트 성공");
			} else {
				System.out.println("인서트 실패");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) conn.close();
				if (pstmt != null) pstmt.close();
				if (rs != null) rs.close();
			} catch (Exception e2) {
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
}
