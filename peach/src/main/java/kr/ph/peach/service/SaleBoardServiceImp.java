package kr.ph.peach.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ph.peach.dao.SaleBoardDAO;
import kr.ph.peach.vo.SaleBoardVO;
import pagination.Criteria;
import pagination.SaleBoardCriteria;

@Service
public class SaleBoardServiceImp implements SaleBoardService{

	@Autowired
	SaleBoardDAO productsDao;

	@Resource
	String uploadPath;

	@Resource
	String uploadImgPath;
	
	@Override
	public List<SaleBoardVO> getSaleBoardList(Criteria cri) {
		return productsDao.selectSaleBoardList(cri);
	}
	
	@Override
	public int getTotalCount(SaleBoardCriteria cri) {
		return productsDao.getTotalCount(cri);
	}

	
}
