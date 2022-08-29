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

	//화면처리
	@RequestMapping("/res_ex01")
	public String res_ex01() {
		return "response/res_ex01";
	}
	
	//화면처리
	@RequestMapping("/res_ex02")
	public String res_ex02(Model model) {
		
		model.addAttribute("name", "홍길동"); //키, 값
		model.addAttribute("time", LocalDate.now() ); //현재시간
		
		return "response/res_ex02";
	}
	
	//화면처리
	//모델엔 뷰는 화면과 데이터에 대한 정보를 같이 담을 수 있습니다.
	@RequestMapping("/res_ex03")
	public ModelAndView res_ex03() {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "이순신"); //데이터를 담는다.
		mv.addObject("age", 12); 
		
		mv.setViewName("response/res_ex03"); //뷰에 대한 정보
		
		return mv; //디스패처서블릿으로 반환
	}
	
	//모델어트리뷰트 어노테이션
	//리퀘스트 + model이 합쳐진 형태
	@RequestMapping("/res_ex04")
	public String res_ex04(@ModelAttribute("id") String id) {
		System.out.println(id);
		return "response/res_ex04";
	}
	
	//info이름으로 다음화면에서 사용할 수 있습니다.
	@RequestMapping("/res_ex05")
	public String res_ex05(@ModelAttribute("info") MemberVO vo) {
		
		System.out.println(vo.toString());
		
		return "response/res_ex05";
	}
	
	
	///////////////////////////////////////////////
	///리다이렉트 사용///
	//화면처리
	@RequestMapping("/res_redirect")
	public void redirect() {
		
	}
	
	//성공페이지
	@RequestMapping("/res_redirect_ok")
	public void redriect_ok() {
		System.out.println("스윽~");
	}
	
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String login(@RequestParam("id") String id, 
						@RequestParam("pw") String pw,
						RedirectAttributes RA ) {
		
		if(id.equals(pw)) { //로그인 성공->
			
			//스프링 기본적으로 forward형식인데
			//다시 컨트롤러를 태워서 나가고 싶을 때 redirect:/절대경로 
			//리다이렉트 시에 1회 사용가능
			RA.addFlashAttribute("msg", "스윽!!!");
			return "redirect:/response/res_redirect_ok"; //성공페이지
		} else { //로그인실패->
			
			return "response/res_redirect"; //다시 로그인화면
		}
		
	}
	
	
	
	
	
}








