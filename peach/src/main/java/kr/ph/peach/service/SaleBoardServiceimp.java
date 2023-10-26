package kr.ph.peach.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ph.peach.dao.SaleBoardDAO;
import kr.ph.peach.pagination.Criteria;
import kr.ph.peach.vo.SaleBoardVO;

@Service
public class SaleBoardServiceimp implements SaleBoardService {
	
	@Autowired
	SaleBoardDAO saleBoardDao;

	@Override
	public List<SaleBoardVO> getSaleBoardList(Criteria cri) {
		if(cri == null) {
			cri = new Criteria();
		}
		return saleBoardDao.selectSaleBoardList(cri);
	}

	@Override
	public int getTotalCount(Criteria cri) {
		if(cri == null) {
			cri = new Criteria();
		}
		return saleBoardDao.selectSaleBoardCount(cri);
		
	}

}
