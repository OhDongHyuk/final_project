package kr.ph.peach.controller;



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


}



