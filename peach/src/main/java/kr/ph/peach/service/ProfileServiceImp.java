package kr.ph.peach.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.ph.peach.dao.ProfileDao;
import kr.ph.peach.vo.ProfileVO;

@Service
public class ProfileServiceImp implements ProfileService{
	
	@Autowired
	private ProfileDao profileDao;
	
	String uploadPath = "D:\\uploadfiles";

	
}
	
	
	
	
	
	
	
	
	
	
