package kr.ph.peach.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import kr.ph.peach.service.ProductsService;
import kr.ph.peach.vo.ProductsVO;
import pagination.PageMaker;
import pagination.ProductsCriteria;

@Controller
public class ProductsController {
	
	@Autowired
	ProductsService productsService;
	
	/*
	@RequestMapping("/sale/products")
	public String products(Model model) {
		
		return "/sale/products";
	}*/
	
	@GetMapping("/sale/{sc_num}")
	public String productsList(@PathVariable("sc_num") int categoryId, Model model, HttpSession session, ProductsCriteria cri) {
		List<ProductsVO> prList = productsService.getProductList(cri);
		cri.setSc_num(categoryId);
		//전체 게시글 수 
		int totalCount = productsService.getTotalCount(cri);
		//페이지네이션에서 최대 페이지 개수 
		int displayPageNum = 20;
		PageMaker pm = new PageMaker(displayPageNum, cri, totalCount);
		
		model.addAttribute("categoryId", categoryId);
		model.addAttribute("pm", pm);
		model.addAttribute("prList",prList);
		return "/sale/products";
	}
	/*
	@GetMapping("/sale/products")
	public String productsList(Model model, HttpSession session, Criteria cri) {
		List<ProductsVO> prList = productsService.getProductList(cri);
		//전체 게시글 수 
		int totalCount = productsService.getTotalCount();
		//페이지네이션에서 최대 페이지 개수 
		int displayPageNum = 20;
		PageMaker pm = new PageMaker(displayPageNum, cri, totalCount);
		
		model.addAttribute("pm", pm);
		model.addAttribute("prList",prList);
		return "/sale/products";
	}
	*/


}


