package kr.ph.peach.vo;

import lombok.Data;

@Data
public class ProductsVO {
	
	int sb_num;
	String sb_title;
	String sb_date;
	
	public ProductsVO(int sb_num, String sb_title, String sb_date) {
        this.sb_num = sb_num;
        this.sb_title = sb_title;
        this.sb_date = sb_date;
    }
 
}
