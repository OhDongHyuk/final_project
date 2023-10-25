package kr.ph.peach.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ph.peach.dao.ProductsDAO;
import kr.ph.peach.vo.ProductsVO;
import pagination.Criteria;
import pagination.ProductsCriteria;

@Service
public class ProductsServiceImp implements ProductsService{

	@Autowired
	ProductsDAO productsDao;

	
	@Override
	public List<ProductsVO> getProductList(Criteria cri) {
		return productsDao.selectProductsList(cri);
	}
	
	@Override
	public int getTotalCount(ProductsCriteria cri) {
		return productsDao.getTotalCount(cri);
	}

	
}
