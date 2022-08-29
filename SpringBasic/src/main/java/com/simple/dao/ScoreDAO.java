package com.simple.dao;

import java.util.List;

import com.simple.command.ScoreVO;

public interface ScoreDAO {

	public void scoreRegist(ScoreVO vo);
	public List<ScoreVO> getList();
	public void scoreDelete(int num); //삭제
}
