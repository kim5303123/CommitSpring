package com.commit.repository.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MypageVo {
	
	//	ID
	private Integer id;
	//	포인트
	private String point;
	// 유저 ID
	private Integer userId;

	
}