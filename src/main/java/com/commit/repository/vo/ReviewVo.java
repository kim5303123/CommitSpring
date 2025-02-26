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
public class ReviewVo {

	//	ID
	private Integer id;
	//	마이페이지 ID
	private Integer mypageId;
	//	제목
	private String title;
	//	내용
	private String contents;
	//	날짜
	private String regDate;
	//	별점
	private String rating;
	

	//
    // 추가 필드
    private Integer userId;	 
}