package kr.ph.peach.service;

import java.util.List;


import kr.ph.peach.vo.SaleBoardVO;
import pagination.Criteria;
import pagination.SaleBoardCriteria;


public interface SaleBoardService {

	List<SaleBoardVO> getSaleBoardList(Criteria cri);
	int getTotalCount(SaleBoardCriteria cri);


}
