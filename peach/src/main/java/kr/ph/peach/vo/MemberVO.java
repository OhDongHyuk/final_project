package kr.ph.peach.vo;

import java.sql.Date;
import java.text.SimpleDateFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//기본생성자
@NoArgsConstructor
public class MemberVO {
	
	int me_num;
	String me_id;
	Date me_date;
	String me_pw;
	int me_sugar;
	
	 public MemberVO(int me_num, String me_id, Date me_date, String me_pw, int me_sugar) {
	        this.me_num = me_num;
	        this.me_id = me_id;
	        this.me_date = me_date;
	        this.me_pw = me_pw;
	        this.me_sugar = me_sugar;
	    }
	 
	 public String get_me_date(Date me_date) {      
	      SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	      return timeFormat.format(me_date);
	  } 
	 
}
