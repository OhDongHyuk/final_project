package kr.ph.peach.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import kr.ph.peach.pagination.Criteria;
import kr.ph.peach.vo.SaleBoardVO;

public interface SaleBoardDAO {

	List<SaleBoardVO> selectSaleBoardList(@Param("cri")Criteria cri);

	int selectSaleBoardCount(@Param("cri")Criteria cri);

}
