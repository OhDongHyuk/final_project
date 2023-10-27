package kr.ph.peach.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//기본생성자
@NoArgsConstructor
public class SaleCategoryVO {
	
	int sc_num;
	String sc_name;
	
	 public SaleCategoryVO(int sc_num, String sc_name) {
	        this.sc_num = sc_num;
	        this.sc_name = sc_name;
	    }
	 
}
