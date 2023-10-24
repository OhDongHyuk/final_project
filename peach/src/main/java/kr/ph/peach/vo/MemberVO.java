package kr.ph.peach.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//기본생성자
@NoArgsConstructor
public class MemberVO {
	
	int me_num;
	String me_id;
	String me_date;
	String me_pw;
	
	 public MemberVO(int me_num, String me_id, String me_date, String me_pw) {
	        this.me_num = me_num;
	        this.me_id = me_id;
	        this.me_date = me_date;
	        this.me_pw = me_pw;
	    }
	 
}
