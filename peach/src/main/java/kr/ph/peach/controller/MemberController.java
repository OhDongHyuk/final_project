package kr.ph.peach.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ph.peach.service.MemberService;
import kr.ph.peach.util.Message;
import kr.ph.peach.vo.MemberVO;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/signup")
	public String signup() {
		
		return "/member/signup";
	}
	
	@PostMapping(value="/signup")
	public String signupPost(MemberVO member, Model model) {
		Message msg = new Message("/member/signup", "회원 가입에 실패했습니다.");
		
		if(memberService.signup(member)) {
			msg = new Message("/", "회원 가입에 성공했습니다.");
		}
		model.addAttribute("msg", msg);
		return "message";
	}
	
}
