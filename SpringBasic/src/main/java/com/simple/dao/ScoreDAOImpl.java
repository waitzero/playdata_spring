package com.simple.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.simple.command.ScoreVO;

@Repository("scoreDAO") //컴포넌트스캔, 이름-scoreDAO
public class ScoreDAOImpl implements ScoreDAO {
	
	//DB라고 가정
	List<ScoreVO> list = new ArrayList<>();
		

	@Autowired
	DataSource ds;
	
	
	@Override
	public void scoreRegist(ScoreVO vo) {
		//DB연결처리~
		list.add(vo); //DB인서트
		System.out.println(list.toString());
		
	}

	@Override
	public List<ScoreVO> getList() {
		return list;
	}

	@Override
	public void scoreDelete(int num) {
		list.remove(num); //리스트 삭제  
	}

}
