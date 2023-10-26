package kr.ph.peach.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import kr.ph.peach.vo.SaleBoardVO;
import kr.ph.peach.vo.SaleCategoryVO;

public interface SaleBoardDAO {

	boolean insertBoard(@Param("salesBoard")SaleBoardVO salesBoard);

	List<SaleCategoryVO> selectAllCategory();

	List<SaleBoardVO> selectAllBoard();

	String selectMemberNickname(int sb_me_num);

	SaleBoardVO selectBoard(Integer sb_num);

	String selectCategoryName(int sb_sc_num);

	int selectMemberSugar(int sb_me_num);

	void updateBoard(@Param("board")SaleBoardVO board);

	void deleteBoard(Integer sb_num);

}
