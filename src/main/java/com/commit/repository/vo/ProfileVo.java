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
public class ProfileVo {
	
	//	ID
	private Integer id;
	// 유저 ID
	private Integer userId;
	//	몸무게
	private String weight;
	//	키	
	private String height;
	//	성향
	private String mbti;
	//	취미
	private String hobby;
	//	사진
	private String photo;
	//	군복무여부
	private String military;
	//	종교
	private String religion;
	//	재산
	private String wealth;
	//	결혼여부
	private String marriage;
	//	질병
	private String disease;
	
}