package kr.ph.peach.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.ph.peach.service.MemberService;
import kr.ph.peach.vo.MemberVO;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping(value="/member/login")
	public String login() {
		return "/member/login";
	}
	@PostMapping(value="/member/login")
	public String loginPost(Model model, MemberVO member) {
		//입력받은 회원정보와 일치하는 회원 정보가 있으면 가져오라고 요청
		MemberVO user = memberService.login(member);
		//가져왔으면 => 로그인 성공하면 
		if(user != null) {
			model.addAttribute("user", user);
			model.addAttribute("msg", "로그인 성공!");
			model.addAttribute("url", "");
		}else {
			model.addAttribute("msg", "로그인 실패!");
			model.addAttribute("url", "member/login");
			System.out.println(user);
		}
		return "/member/message";
	}
	
}
