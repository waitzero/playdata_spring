package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/service")
public class BoardController {
	
	
	@RequestMapping("/boardRegister")
	public String boardRegister(){
		return "boardRegister";
	}
	
	
	@RequestMapping("/boardList")
	public String BoardList(){
		return "board/boardList";
	}
	
	
	
	@RequestMapping(value="/boardJoin", method =RequestMethod.POST)
	public String BoardResult(@RequestParam("id") String id,
			@RequestParam("name") String name,
			@RequestParam("title") String title,
			@RequestParam("content") String content,
			@RequestParam("ex") String ex){
		return "board/boardResult";
	}
}
