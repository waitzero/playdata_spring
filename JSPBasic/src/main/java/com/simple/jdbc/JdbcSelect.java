package com.simple.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

public class JdbcSelect {

	public static void main(String[] args) {
		
		//jdbc연습
		String url = "jdbc:mysql://localhost:3306/jsp?serverTimezone=Asia/Seoul";
		String uid = "jsp";
		String upw = "jsp";
		
		Connection conn = null; //
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		String sql = "select * from members order by regdate desc";
		
		
		try {
			//1. 커넥터 드라이버 로드(준비)
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. 연결객체 생성
			conn = DriverManager.getConnection(url, uid, upw);
			
			//3. 커넥션으로부터 pstmt을 구합니다.
			pstmt = conn.prepareStatement(sql);
			
			//4. sql실행
			//select구문은 executeQuery(), insert, update, delete는 executeUpdate() 으로실행
			rs = pstmt.executeQuery(); //rs에 데이터 저장 
			
			//5. sql처리
			while( rs.next() ) {
				//getString, getInt, getDouble, getTimestamp
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
