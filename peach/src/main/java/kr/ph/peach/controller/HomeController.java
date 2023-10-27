package kr.ph.peach.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ph.peach.service.MemberService;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/")
	public String home(Model model) {
		model.addAttribute("name","abc");
		
		return "/main/home";
	}

}
