package com.simple.service;

import java.util.List;

import com.simple.command.ScoreVO;

public interface ScoreService {

	//반환유형-> 컨트롤러로 결과를 받을 타입, 매개변수-> 전달타입
	public void scoreRegist(ScoreVO vo); //등록
	public List<ScoreVO> getList(); //조회
	public void scoreDelete(int num); //삭제
	
}
