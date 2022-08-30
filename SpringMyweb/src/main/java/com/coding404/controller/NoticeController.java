package com.coding404.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.coding404.command.TripVO;
import com.coding404.trip.service.TripService;

@Controller
@RequestMapping("/trip")
public class NoticeController {
	
	@Autowired
	@Qualifier("tripService")
	TripService tripService;

	//목록화면
	@RequestMapping("/notice_list")
	public String notice_list(Model model) {
		//조회
		List<TripVO> list = tripService.getList();
		model.addAttribute("list", list);
		return "trip/notice_list";
	}
	
	//내용화면
	@RequestMapping("/notice_view")
	public String notice_view(@RequestParam("tno") int tno,
							 Model model) {
	
		TripVO vo = tripService.getDetail(tno);
		model.addAttribute("vo", vo);
		tripService.upHit(tno);
		return "trip/notice_view";
	}
	//등록화면
		@RequestMapping("/notice_write")
		public String notice_write() {
			return "trip/notice_write";
		}
		
	//등록폼
		@RequestMapping("/noticeRegist")
		public String noticeRegist(TripVO vo, RedirectAttributes RA) {
			int result =tripService.noticeRegist(vo);
				System.out.println("성공 실패:"+ result);
				
				String msg = result == 1 ? "문의 사항 등록이 정상 처리 되었습니다" : "문의 등록에 실패했습니다.";
				RA.addFlashAttribute("msg", msg);
			return "redirect:/trip/notice_list";
		}
		//수정화면(POST방식만 허용)
		@RequestMapping(value="/notice_modify", method=RequestMethod.POST)
		public String notice_modify(@RequestParam("tno")int tno,
													Model model) {
				//tno를 가지고
			TripVO vo = tripService.getDetail(tno);
			model.addAttribute("vo", vo);
			return "trip/notice_modify";
		}
		@RequestMapping("/noticeUpdate")
		public String noticeUpdate(TripVO vo, RedirectAttributes RA) {
				int result =tripService.noticeUpdate(vo);
			/*
			 * 1.화면에 넘어오는 데이터를 vo를 통해서 받으시고
			 * 2.service,mapper에 noticeUpdate메서드를 만들고 update작업을 수행(등록일, 제목 내용)
			 * 3.업데이트가 성공하면 목록화면으로 리다이렉트 시킨다.
			 * msg변수를 이용해서 "글 수정에 성공했습니다"메세지 출력 
			 */
			String msg = result == 1? "글 수정에 성공했습니다" : "수정 실패";
			RA.addFlashAttribute("msg", msg);
			return"redirect:/trip/notice_list";
		}
		@RequestMapping("/deleteForm")
		public String deleteForm(@RequestParam("tno") int tno){
			
			tripService.noticeDelete(tno);
			
			return "redirect:/trip/notice_list";
		}
}
