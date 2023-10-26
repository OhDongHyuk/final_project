package kr.ph.peach.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ph.peach.service.MemberService;
import kr.ph.peach.service.SaleBoardService;
import kr.ph.peach.util.Message;
import kr.ph.peach.vo.MemberVO;
import kr.ph.peach.vo.SaleBoardVO;
import kr.ph.peach.vo.SaleCategoryVO;

@Controller
@RequestMapping("/salesboard")
public class SaleBoardController {
	
	@Autowired
	SaleBoardService saleBoardService;
	
	@GetMapping("/insert")
	public String insert(Model model) {
		List<SaleCategoryVO> dbCategory = saleBoardService.selectAllCategory();
		model.addAttribute("dbCategory", dbCategory);
		
		return "/salesboard/insert";
	}
	@PostMapping("/insert")
	public String insertPost(Model model, SaleBoardVO saleBoard, HttpSession session) {
		Message msg;
		MemberVO user = new MemberVO();
		System.out.print(saleBoard);
		user.setMe_num(1);
		if(saleBoardService.insertBoard(saleBoard, user)) {
			msg = new Message("salesboard/list", "게시물이 등록되었습니다.");
		} else {
			msg = new Message("salesboard/insert", "게시물 등록에 실패했습니다.");
		}
		model.addAttribute("msg", msg);
		return "message";
	}

	@GetMapping("/list")
	public String list(Model model) {
		List<SaleBoardVO> dbBoardList = saleBoardService.selectAllBoard();
		for(SaleBoardVO tmp : dbBoardList) {
			dbBoardList.get(dbBoardList.indexOf(tmp)).setSb_me_nickname(saleBoardService.selectMemberNickname(tmp.getSb_me_num()));
		}
		model.addAttribute("dbBoardList", dbBoardList);
		return "/salesboard/list";
	}
	@GetMapping("/detail")
	public String detail(Model model, Integer sb_num, HttpSession session) {
		
		SaleBoardVO board = saleBoardService.selectBoard(sb_num);
		board.setSb_me_nickname(saleBoardService.selectMemberNickname(board.getSb_me_num()));
		board.setSb_sc_name(saleBoardService.selectCategoryName(board.getSb_sc_num()));
		board.setSb_me_sugar(saleBoardService.selectMemberSugar(board.getSb_me_num()));
		model.addAttribute("board", board);
		return "/salesboard/detail";
		
	}
}
