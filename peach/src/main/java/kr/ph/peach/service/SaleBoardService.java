package kr.ph.peach.service;

import java.util.List;

import kr.ph.peach.vo.MemberVO;
import kr.ph.peach.vo.SaleBoardVO;
import kr.ph.peach.vo.SaleCategoryVO;

public interface SaleBoardService {

	boolean insertBoard(SaleBoardVO saleBoard, MemberVO user);

	List<SaleCategoryVO> selectAllCategory();

	List<SaleBoardVO> selectAllBoard();

	String selectMemberNickname(int sb_me_num);

	SaleBoardVO selectBoard(Integer sb_num);

	String selectCategoryName(int sb_sc_num);

	int selectMemberSugar(int sb_me_num);

	
}
