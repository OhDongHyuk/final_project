package kr.ph.peach.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ph.peach.pagination.Criteria;
import kr.ph.peach.pagination.PageMaker;
import kr.ph.peach.service.SaleBoardService;
import kr.ph.peach.service.SaleCategoryService;
import kr.ph.peach.vo.SaleBoardVO;
import kr.ph.peach.vo.SaleCategoryVO;

@Controller
public class HomeController {
	
	@Autowired
	SaleCategoryService saleCategoryService;
	
	@Autowired
	SaleBoardService saleBoardService;
	
	@RequestMapping(value = "/")
	public String home(Model model, Criteria cri) {
		
		List<SaleCategoryVO> categoryList = saleCategoryService.getSaleCategoryList();
		cri.setPerPageNum(8);
		//현재 페이지에 맞는 게시글을 가져와야함
		List<SaleBoardVO> list = saleBoardService.getSaleBoardList(cri);
		int totalCount = saleBoardService.getTotalCount(cri);
		
		
		PageMaker pm = new PageMaker(8, cri, totalCount);
		System.out.println(pm);
		System.out.println(categoryList);
		model.addAttribute("pm", pm);
		model.addAttribute("list", list);
		model.addAttribute("categoryList", categoryList);
		
		return "/main/home";
	}

	
//	
//	@GetMapping("/")
//	public String list(Model model, Criteria cri) {
//		//현재 페이지에 맞는 카테고리을 가져와야함
//		List<SaleCategoryVO> categoryList = saleCategoryService.getSaleCategoryList();
////		int totalCount = saleCategoryService.getTotalCount(cri);
////		PageMaker pm = new PageMaker(4, cri, totalCount);
////		
////		model.addAttribute("pm", pm);
//		System.out.println(categoryList);
//		model.addAttribute("category", categoryList);
//		return "/main home";
//	}
	
}
