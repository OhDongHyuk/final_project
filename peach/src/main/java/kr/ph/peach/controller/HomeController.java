package kr.ph.peach.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.ph.peach.service.SaleCategoryService;
import kr.ph.peach.vo.SaleCategoryVO;



@Controller
public class HomeController {
	
	@Autowired
	SaleCategoryService saleCategoryService;
	
	@GetMapping("/")
	public String saleCategoryList(Model model) {
		List<SaleCategoryVO> scgList = saleCategoryService.getSaleCategoryList();
	
		model.addAttribute("scgList",scgList);
		return "/main/home";
	}
}
