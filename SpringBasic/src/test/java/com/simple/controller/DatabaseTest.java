package com.simple.controller;

import java.sql.Connection;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.simple.command.ScoreVO;
import com.simple.mapper.TestMapper;

@RunWith(SpringJUnit4ClassRunner.class  ) //실행환경을 junit(단위테스트) 실행
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/**/root-context.xml") //실행시킬 스프링 설정파일 경로
public class DatabaseTest {

//	@Autowired
//	DataSource ds;
//
//	@Autowired
//	SqlSessionFactory sf;
	
//	@Test
//	public void testCode01() {
//		try {
//			Connection conn = ds.getConnection();
//			System.out.println("커넥션객체:" + conn);
//			//테스트코드가 성공했다? -> 개발코드 옴겨도 됨
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	@Test
//	public void testCode02() {
//		System.out.println("마이바티스 설정 객체:" + sf);
//	}
	
	
	
	@Autowired
	TestMapper testMapper;
	
//	@Test
//	public void testCode03() {
//		String result = testMapper.getTime();
//		System.out.println(result);
//	}
	
//	@Test
//	public void testCode04() {
//		for(int i = 1; i <= 10; i++) {
//			int ran = (int)(Math.random() * 100 ) + 1; 
//			ScoreVO vo = new ScoreVO();
//			vo.setName("admin" + i);
//			vo.setKor(ran + "");
//			vo.setEng(ran + "");
//			vo.setMath(ran + "");
//			
//			testMapper.insertTest(vo); //호출
//		}
//		
//	}
	
//	@Test
//	public void testCode05() {
//		
//		ScoreVO vo = new ScoreVO(5, "이순신", "100", "100", "100");
//		
//		boolean result = testMapper.updateTest(vo);
//		
//		System.out.println("성공실패여부:" + result);
//		
//	}
	
	@Test
	public void testCode06() {
		
		ScoreVO vo = testMapper.selectTest(5);
		System.out.println(vo.toString());
		
		//특별한경우 -> 조인이 여러번 들어가서 처리하기가 까다로운 경우에 사용
		//Map<String, Object> map = testMapper.selectTest02(5);
		//System.out.println(map.toString());
		
	}
	
	
//	@Test
//	public void testCode07() {
//		
//		boolean result = testMapper.deleteTest(6);
//		System.out.println("성공실패여부:" + result);
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
