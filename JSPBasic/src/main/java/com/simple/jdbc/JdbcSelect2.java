package com.simple.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

public class JdbcSelect2 {

	public static void main(String[] args) {
	
		//jdbc연습
		String url = "jdbc:mysql://localhost:3306/jsp?serverTimezone=Asia/Seoul";
		String uid = "jsp";
		String upw = "jsp";
		
		Connection conn = null; //
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//특정ID만 조회
		String sql = "select * from members where id = ?";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//1
			conn = DriverManager.getConnection(url, uid, upw);
			//2.
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "aaa123");
						
			//3. 
			rs = pstmt.executeQuery(); //pk를 통한 조회
			
			if( rs.next() ) { //아이디가 존재하는 경우
				
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				Timestamp regdate = rs.getTimestamp("regdate");
				
				System.out.println(id);
				System.out.println(pw);
				System.out.println(name);
				System.out.println(gender);
				System.out.println(regdate);
				
			} else { //아이디가 없다는 의미
				System.out.println("아이디가 존재하지 않습니다");
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
