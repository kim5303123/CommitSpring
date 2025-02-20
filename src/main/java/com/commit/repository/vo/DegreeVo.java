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
	private Integer id;
	//	중학교
	private String middleSchool;
	//	고등학교
	private String highSchool;
	//	고등학교 전공
	private String highMajor;
	//	대학교
	private String university;
	//	대학교 전공
	private String universityMajor;
	//	대학원 
	private String graduateSchool;
	//	대학원 전공
	private String graduateMajor;
	
	private Integer userId;
	 
}