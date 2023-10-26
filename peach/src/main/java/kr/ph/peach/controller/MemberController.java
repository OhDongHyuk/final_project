package kr.ph.peach.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ph.peach.service.SaleBoardService;

@Controller
public class MemberController {
	
	@Autowired
	private SaleBoardService memberService;
	
	
}
