package kr.ph.peach.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ph.peach.dao.ProductsDAO;
import kr.ph.peach.vo.ProductsVO;
import kr.ph.peach.vo.SaleCategoryVO;

@Service
public class ProductsServiceImp implements ProductsService{
	
	@Autowired
	private ProductsDAO productsDao;
	
	String uploadPath = "D:\\uploadfiles";

	@Override
	public List<ProductsVO> getProductsById(int me_num, int state) {
		System.out.println(me_num);
		 List<ProductsVO> products = productsDao.getProductsById(me_num, state);
		System.out.println(products);
		  return products;
	}

	@Override
	public List<SaleCategoryVO> getProductsByCTNum(int sb_sc_num) {
		 List<SaleCategoryVO> category = productsDao.getCategoriesByScNum(sb_sc_num);
		 System.out.println("saleCategory"+category);
		    return category;
	}
	
	
}
