package kr.ph.peach.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ph.peach.service.MemberService;

@Controller
@RequestMapping("/salesboard")
public class SalesBoardController {
	
	@RequestMapping("/insert")
	public String insert(Model model) {
		
		return "/salesboard/insert";
	}

}
