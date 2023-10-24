package kr.ph.peach.dao;

import org.apache.ibatis.annotations.Param;

import kr.ph.peach.vo.MemberVO;

public interface MemberDAO {

	MemberVO selectMember(@Param("me_id")String me_id);

}
