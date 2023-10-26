package kr.ph.peach.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import kr.ph.peach.vo.SaleBoardVO;
import pagination.Criteria;
import pagination.SaleBoardCriteria;

public interface SaleBoardDAO {

	int getTotalCount(@Param("cri")SaleBoardCriteria cri);

	List<SaleBoardVO> selectSaleBoardList(@Param("cri")Criteria cri);


}
