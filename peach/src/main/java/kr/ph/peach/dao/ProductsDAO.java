package kr.ph.peach.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import kr.ph.peach.vo.ProductsVO;
import kr.ph.peach.vo.SaleCategoryVO;

public interface ProductsDAO {

	List<ProductsVO> getProductsById(@Param("me_num") int me_num, @Param("state")int state);

	List<SaleCategoryVO> getCategoriesByScNum(@Param("sb_sc_num") int sb_sc_num);


}
