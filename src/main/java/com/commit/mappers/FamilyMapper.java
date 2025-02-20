package com.commit.mappers;

import java.util.List;

import com.commit.repository.vo.FamilyVo;


public interface FamilyMapper {
	
//	<select id="familySelect" parameterType="familyVo" resultType="familyVo">
	FamilyVo familySelect(Integer id);
	
//	<insert id="familyInsert" parameterType="familyVo">
	int familyInsert(FamilyVo family);

}