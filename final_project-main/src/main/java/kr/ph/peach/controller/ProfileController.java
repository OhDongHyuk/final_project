package kr.ph.peach.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {
    @GetMapping("/board/profile")
    public String showProfilePage(Model model) {
        return "/board/profile"; 
    }
}