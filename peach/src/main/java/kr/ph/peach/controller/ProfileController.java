package kr.ph.peach.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import kr.ph.peach.service.ProfileService;
import kr.ph.peach.vo.MemberVO;
import kr.ph.peach.vo.ProductsVO;

@Controller
public class ProfileController {
	
	@Autowired
	ProfileService profileService;
	
    @GetMapping("/board/profile")
    public String showProfilePage(Model model) {
        return "/board/profile"; 
    }
    
    @GetMapping("/board/profile_management")
    public String showProfileMangementPage(Model model) {
        return "/board/profile_management"; 
    }
    
    @PostMapping("/board/profile_management")
	public String insertPost(Model model, MemberVO user, HttpSession session) {
    	
		return "/board/profile_management";
	}
}







