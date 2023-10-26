package kr.ph.peach.vo;

import java.text.DecimalFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SaleBoardVO {
	private int sb_num, sb_wish, sb_price, sb_me_num, sb_ss_num, sb_sc_num, sb_me_sugar;
	private String sb_name, sb_info, sb_date, sb_me_nickname, sb_sc_name;
	
	public SaleBoardVO(String sb_name, int sb_price, String sb_info, int sb_sc_num) {
		this.sb_name = sb_name;
		this.sb_price = sb_price;
		this.sb_info = sb_info;
		this.sb_sc_num = sb_sc_num;
	}
	
	public String get_sb_price(int sb_price) {
		DecimalFormat decFormat = new DecimalFormat("###,###");
		return decFormat.format(sb_price);
	}

}
