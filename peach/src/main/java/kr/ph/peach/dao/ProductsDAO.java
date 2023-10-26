package kr.ph.peach.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import kr.ph.peach.vo.ProductsVO;
import pagination.Criteria;
import pagination.ProductsCriteria;

public interface ProductsDAO {

	int getTotalCount(@Param("cri")ProductsCriteria cri);

	List<ProductsVO> selectProductsList(@Param("cri")Criteria cri);

}
