package kr.ph.peach.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ph.peach.dao.ProfileDao;
import kr.ph.peach.pagination.CriteriaProfile;
import kr.ph.peach.vo.ProductsVO;
import kr.ph.peach.vo.ProfileVO;

@Service
public class ProfileServiceImp implements ProfileService{
	
	@Autowired
	private ProfileDao profileDao;

	
}
	
	
	
	
	
	
	
	
	
	
