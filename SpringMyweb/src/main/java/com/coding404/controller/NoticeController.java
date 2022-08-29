package com.coding404.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/trip")
public class NoticeController {

	//목록화면
	@RequestMapping("/notice_list")
	public String notice_list() {
		return "trip/notice_list";
	}
	
	//내용화면
	@RequestMapping("/notice_view")
	public String notice_view() {
		return "trip/notice_view";
	}
	//등록화면
		@RequestMapping("/notice_write")
		public String notice_write() {
			return "trip/notice_write";
		}
}
