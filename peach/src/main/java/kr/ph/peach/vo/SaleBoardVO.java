package kr.ph.peach.vo;

import java.sql.Date;
import java.text.SimpleDateFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SaleBoardVO {
	
	int sb_num;
	String sb_name;
	Date sb_date;
	int sb_me_num;
	int sb_ss_num;
	int sb_sc_num;
	
	public SaleBoardVO(int sb_num, String sb_name, Date sb_date, int sb_me_num, int sb_ss_num, int sb_sc_num) {
        this.sb_num = sb_num;
        this.sb_name = sb_name;
        this.sb_date = sb_date;
        this.sb_me_num = sb_me_num;
        this.sb_ss_num = sb_ss_num;
        this.sb_sc_num = sb_sc_num;
    }
	 public String get_sb_date(Date sb_date) {      
	      SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	      return timeFormat.format(sb_date);
	  }   
}
