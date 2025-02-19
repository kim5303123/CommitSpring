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
public class CareerVo {

	//	id
	Integer id;
	//	연봉
	String salary;
	//	직업
	String job;
	 
	Integer userId;
}
