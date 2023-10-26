package kr.ph.peach.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import kr.ph.peach.service.SaleBoardService;
import kr.ph.peach.vo.SaleBoardVO;
import pagination.PageMaker;
import pagination.SaleBoardCriteria;

@Controller
public class SaleBoardController {
	
	@Autowired
	SaleBoardService saleBoardService;

	@GetMapping("/sale/{sc_num}")
	public String productsList(@PathVariable("sc_num") int categoryId, Model model, HttpSession session, SaleBoardCriteria cri) {
		List<SaleBoardVO> prList = saleBoardService.getSaleBoardList(cri);
		cri.setSc_num(categoryId);
		//전체 게시글 수 
		int totalCount = saleBoardService.getTotalCount(cri);
		//페이지네이션에서 최대 페이지 개수 
		int displayPageNum = 20;
		PageMaker pm = new PageMaker(displayPageNum, cri, totalCount);
		
		model.addAttribute("categoryId", categoryId);
		model.addAttribute("pm", pm);
		model.addAttribute("prList",prList);
		return "/sale/saleBoard";
	}

}

