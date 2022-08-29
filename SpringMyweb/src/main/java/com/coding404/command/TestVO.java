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
@Data//setter+getter+toString
@AllArgsConstructor//모든 생성자
@NoArgsConstructor//기본 생성자
public class TestVO {
	private String test01;
	private int test02;
}
