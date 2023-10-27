package kr.ph.peach.vo;

import java.util.Date;

import lombok.Data;

@Data
public class MemberVO {
	private int me_num;
	private String me_id;
	private String me_pw;
	private String me_name;
	private String me_acc;
	private String me_phone;
	String me_nick;
	
	
	
	//자동 로그인 관련 속성
	String me_session_id;
	Date me_session_limit;
	boolean autoLogin;

}
