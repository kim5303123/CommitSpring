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
	Integer id;
	//	마이페이지 ID
	Integer mypage_id;
	//	제목
	String title;
	//	내용
	String contents;
	//	날짜
	String regDate;
	//	별점
	String rating;
	 
}
