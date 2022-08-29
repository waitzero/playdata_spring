package com.simple.mapper;

import java.util.List;

import com.simple.command.ScoreVO;

public interface ScoreMapper {

	public void scoreRegist(ScoreVO vo);
	public List<ScoreVO> getList();
	public void scoreDelete(int num); //삭제
}
