package kr.ph.peach.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import kr.ph.peach.service.ProductsService;
import kr.ph.peach.service.ProfileService;
import kr.ph.peach.vo.MemberVO;
import kr.ph.peach.vo.ProductsVO;

@Controller
public class ProfileController {
	
	@Autowired
	ProfileService profileService;
	
	@Autowired
	ProductsService productsService;
	
    @GetMapping("/board/profile")
    public String showProfilePage(Model model, HttpSession session) {
    	MemberVO user = (MemberVO) session.getAttribute("user");
    	
        if (user != null) {
            // 모델에 유저 정보 추가
            model.addAttribute("user", user);
            // 모델에 상품 정보 추가
            System.out.println("확인용1");
            // 접속한 아이디에 따른 프로필 불러오기
            List<ProductsVO> products = productsService.getProductsById(user.getMe_num());
            System.out.println("확인용2");
            model.addAttribute("products", products);
        } else {
        	model.addAttribute("msg", "로그인을 필요로 합니다.");
        	model.addAttribute("url", "member/login");
        	System.out.println(user);
        	return "/member/message";
        }
        
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







