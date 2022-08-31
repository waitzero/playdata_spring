package com.coding404.command;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TripVO {

	private int tno;
	private String tripdate;
	private String writer;
	private String title;
	private String content;
	private int hit;
	private LocalDateTime regdate;
	
}
