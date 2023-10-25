package kr.ph.peach.vo;

import java.util.Date;

import lombok.Data;

@Data
public class SaleBoardVO {

	private String sb_name, sb_info;
	private int sb_num, sb_price, sb_wish, sb_me_num, sb_ss_num, sb_sc_num;
	private Date sb_date;
	
}
