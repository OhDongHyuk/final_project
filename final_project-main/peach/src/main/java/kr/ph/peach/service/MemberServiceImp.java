package kr.ph.peach.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ph.peach.dao.MemberDAO;

@Service
public class MemberServiceImp implements MemberService{
	
	@Autowired
	private MemberDAO memberDao;

}
