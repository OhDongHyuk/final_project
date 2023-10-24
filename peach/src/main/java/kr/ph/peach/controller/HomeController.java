package kr.ph.peach.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ph.peach.vo.MemberVO;

@Controller
public class HomeController {
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home( Model model, String id) {
		return "/main/home";
	}
	
	/*
	@RequestMapping(value = "/")
	public String home(Model model,HttpSession session) {
		
		tempLogin(session);
		
		return "/main/home";
	}
	*/
	/*
	//임시 로그인 정보 저장(로그인 기능 구현 전)
	public void tempLogin(HttpSession session) {
		MemberVO user = new MemberVO(0, null,null);
		user.setMe_num(1);
		user.setMe_id("김돌쇠");
		user.setMe_date("2023-10-20 10:00:00");
		
		session.setAttribute("user", user);
	}
	*/
}



