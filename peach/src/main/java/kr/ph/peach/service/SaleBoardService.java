package kr.ph.peach.service;

import java.util.List;

import kr.ph.peach.pagination.Criteria;
import kr.ph.peach.vo.SaleBoardVO;

public interface SaleBoardService {

	List<SaleBoardVO> getSaleBoardList(Criteria cri);

	int getTotalCount(Criteria cri);

}
