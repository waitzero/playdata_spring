package com.simple.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.MemberVO;

@Controller
@RequestMapping("/response")
public class ResponseController {

	@RequestMapping("/res_ex01")
	public String res_ex01() {
		return "response/res_ex01";
	}
	@RequestMapping("/res_ex02")
	public String res_ex02(Model model) {
		model.addAttribute("name", "홍길동");//키, 값
		model.addAttribute("time", LocalDate.now()); //현재 시간
		
		return "response/res_ex02";
	}
	@RequestMapping("/res_ex03")
	public ModelAndView res_ex03() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "이순신");
		mv.addObject("age", "20");
		mv.setViewName("response/res_ex03");
		return mv;
	}
	
	
	@RequestMapping("/res_ex04")
	public String res_ex04(@ModelAttribute("id")String id) {
		return "response/res_ex04";
	}
	
	
	//info이름으로 다음화면에서 사용할 수 있습니다.
	@RequestMapping("/res_ex05")
	public String res_ex05(@ModelAttribute("info") MemberVO vo) {
	System.out.println(vo.toString());
		return "response/res_ex05";
	}
	
	
	@RequestMapping("/res_redirect")
	public void redirect() {
		
	}
	@RequestMapping("/res_redirect_ok")
	public void redirect_ok() {
		System.out.println("스윽~");
	}
	
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String login(@RequestParam("id") String id,
					    @RequestParam("pw") String pw,
					   	RedirectAttributes RA) {
	if(id.equals(pw)) {
		//스프링 기본적으로forward형식
		//다시 컨트롤러를 태워서 나가고 싶을 때 redirect:/절대경로
		RA.addAttribute("msg", "스윽!!!");
		return "redirect:/response/res_rediredct_ok";//성공 페이지
	}else {
		return "response/res_redirect";
	}
	}
	
		
}
