package com.simple.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.simple.command.ScoreVO;
import com.simple.dao.ScoreDAO;
import com.simple.mapper.ScoreMapper;

@Service("scoreService") //컴포넌트 스캔을 이용해서 패키지를 읽게 만든다.
public class ScoreServiceImpl implements ScoreService {

	//멤버변수
//	@Autowired
//	@Qualifier("scoreDAO")
//	private ScoreDAO scoreDAO;
	
	@Autowired
	private ScoreMapper scoreMapper;
	
	
	@Override
	public void scoreRegist(ScoreVO vo) {
		scoreMapper.scoreRegist(vo);
	}


	@Override
	public List<ScoreVO> getList() {
		
		List<ScoreVO> list = scoreMapper.getList();
		return list;
	}


	@Override
	public void scoreDelete(int num) {
		
		scoreMapper.scoreDelete(num);
		
		
	}
	
	
	
	
	
}
