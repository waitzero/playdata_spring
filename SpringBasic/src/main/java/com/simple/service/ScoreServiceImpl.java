package com.simple.service;

import org.springframework.stereotype.Service;

import com.simple.command.ScoreVO;

@Service("xxx")//컴포넌트 스캔을 이용해서 패키지를 읽게 만든다.
public class ScoreServiceImpl implements ScoreService{

	@Override
	public void scoreRegist(ScoreVO vo) {
		System.out.println("실행됨");
		
	}

}
