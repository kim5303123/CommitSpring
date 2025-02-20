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
public class DegreeVo {

	//	id
	Integer id;
	//	중학교
	String middleSchool;
	//	고등학교
	String highSchool;
	//	고등학교 전공
	String highMajor;
	//	대학교
	String university;
	//	대학교 전공
	String universityMajor;
	//	대학원 
	String graduateSchool;
	//	대학원 전공
	String graduateMajor;
	//  사용자ID
	Integer userId;
	 
}
