package kr.ph.peach.vo;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class ProductsVO {
	private int sb_num;
	private String sb_name;
	private Integer sb_price;
	private String sb_info;
	private Date sb_date;
	private int sb_wish;
	private int sb_me_num;
	private int sb_ss_num;
	private int sb_sc_num;
	
	private List<ImageVO> imageVOList;
}
