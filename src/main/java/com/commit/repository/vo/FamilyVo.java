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
	Integer id;
	//	어머니	
	String mother;
	//	아버지	
	String father;
	//	자녀	
	String child;
	//	형제자매	
	String sibling;
	//  사용자ID
	Integer userId;
	 
}
