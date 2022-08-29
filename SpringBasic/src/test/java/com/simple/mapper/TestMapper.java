package com.simple.mapper;

import java.util.Map;

import com.simple.command.ScoreVO;

public interface TestMapper {
	
	public String getTime(); //실행시킬 추상메서드
	public boolean insertTest(ScoreVO vo); //1. 단일값 전달 가능, 2. VO이용해서 전달가능, 3. map타입가능
	public boolean updateTest(ScoreVO vo); //
	//반환이 1행이면 vo, 여러행이면 List<VO>
	public ScoreVO selectTest(int num); //단일값인 경우는 변수명이 #{이름} 이 됩니다
	public Map<String, Object> selectTest02(int num); 
	public boolean deleteTest(int num); 
	
	
}
