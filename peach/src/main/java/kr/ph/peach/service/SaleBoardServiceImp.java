package kr.ph.peach.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ph.peach.dao.SaleBoardDAO;
import kr.ph.peach.vo.MemberVO;
import kr.ph.peach.vo.SaleBoardVO;
import kr.ph.peach.vo.SaleCategoryVO;

@Service
public class SaleBoardServiceImp implements SaleBoardService{
	
	@Autowired
	private SaleBoardDAO saleBoardDao;

	@Override
	public boolean insertBoard(SaleBoardVO saleBoard, MemberVO user) {
		System.out.println(user);
		System.out.println(saleBoard);
		if(user == null) {
			return false;
		}
		if(saleBoard == null || saleBoard.getSb_name() == null) {
			return false;
		}
		LocalDateTime now = LocalDateTime.now();
		String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		saleBoard.setSb_date(formatedNow);
		saleBoard.setSb_me_num(user.getMe_num());
		
		return saleBoardDao.insertBoard(saleBoard);
	}

	@Override
	public List<SaleCategoryVO> selectAllCategory() {
		
		return saleBoardDao.selectAllCategory();
	}

	@Override
	public List<SaleBoardVO> selectAllBoard() {
		
		return saleBoardDao.selectAllBoard();
	}

	@Override
	public String selectMemberNickname(int sb_me_num) {
		if(sb_me_num == 0) {
			return null;
		}
		return saleBoardDao.selectMemberNickname(sb_me_num);
	}

	@Override
	public SaleBoardVO selectBoard(Integer sb_num) {
		if(sb_num == null) {
			return null;
		}
		return saleBoardDao.selectBoard(sb_num);
	}

	@Override
	public String selectCategoryName(int sb_sc_num) {
		if(sb_sc_num == 0) {
			return null;
		}
		return saleBoardDao.selectCategoryName(sb_sc_num);
	}

	@Override
	public int selectMemberSugar(int sb_me_num) {
		if(sb_me_num == 0) {
			return 0;
		}
		return saleBoardDao.selectMemberSugar(sb_me_num);
	}

}
