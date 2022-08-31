package com.coding404.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Setter
//@Getter
//@ToString
// 3개 묶어서 Data 어노테이션
@Data // setter + getter + ToString
@AllArgsConstructor
@NoArgsConstructor
public class TestVO {

	private String test01;
	private int test02;
	private String test03;
	
}
