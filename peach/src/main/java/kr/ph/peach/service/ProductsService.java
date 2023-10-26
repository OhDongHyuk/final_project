package kr.ph.peach.service;

import java.util.List;

import kr.ph.peach.vo.ProductsVO;
import kr.ph.peach.vo.SaleCategoryVO;

public interface ProductsService {

	List<ProductsVO> getProductsById(int me_num, int state);

	List<SaleCategoryVO> getProductsByCTNum(int sb_sc_num);


}
