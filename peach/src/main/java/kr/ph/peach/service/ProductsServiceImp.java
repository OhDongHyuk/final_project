package kr.ph.peach.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ph.peach.dao.ProductsDAO;

@Service
public class ProductsServiceImp implements ProductsService{
	
	@Autowired
	private ProductsDAO productsDao;


}
