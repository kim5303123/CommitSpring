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
	Integer id;
	//	몸무게
	String weight;
	//	키	
	String height;
	//	성향
	String mbti;
	//	취미
	String hobby;
	//	사진
	String photo;
	//	군복무여부
	String military;
	//	종교
	String religion;
	//	재산
	String wealth;
	//	결혼여부
	String marriage;
	//	질병
	String disease;
	
}
