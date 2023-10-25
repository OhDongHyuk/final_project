package kr.ph.peach.service;

import java.util.List;

import kr.ph.peach.vo.ProductsVO;
import pagination.Criteria;
import pagination.ProductsCriteria;

public interface ProductsService {

	List<ProductsVO> getProductList(Criteria cri);

	int getTotalCount(ProductsCriteria cri);
	
}
