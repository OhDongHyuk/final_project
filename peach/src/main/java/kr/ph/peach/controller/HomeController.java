package kr.ph.peach.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ph.peach.pagination.Criteria;
import kr.ph.peach.pagination.PageMaker;
import kr.ph.peach.service.SaleCategoryService;
import kr.ph.peach.vo.SaleCategoryVO;

@Controller
public class HomeController {
	
	@Autowired
	SaleCategoryService saleCategoryService;
	
	@RequestMapping(value = "/")
	public String home(Model model) {
		
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
