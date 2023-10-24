package kr.ph.peach.service;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ph.peach.dao.MemberDAO;
import kr.ph.peach.vo.MemberVO;

@Service
public class MemberServiceImp implements MemberService{
	
	@Autowired
	private MemberDAO memberDao;

	@Override
	public MemberVO login(MemberVO member) {
		
		//아이디와 일치하는 회원 정보
		System.out.println("member : " + member);
		MemberVO user = memberDao.selectMember(member.getMe_id());
		System.out.println("user : " + user);
		
		//아이디와 일치하는 회원 정보가 있으면
		if(user != null) {
			return user;
		}
		return null;
	}

}
