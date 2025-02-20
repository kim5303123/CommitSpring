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
public class FamilyVo {

	//	ID
	private Integer id;
	//	어머니	
	private String mother;
	//	아버지	
	private String father;
	//	자녀	
	private String child;
	//	형제자매	
	private String sibling;
	
	private Integer userId;
	 
}