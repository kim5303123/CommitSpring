package com.commit.mappers;

import com.commit.repository.vo.FamilyVo;


public interface FamilyMapper {
	
//	<select id="familySelect" parameterType="familyVo" resultType="familyVo">
	FamilyVo familySelect(Integer id);
	
//	<insert id="familyInsert" parameterType="familyVo">
	int familyInsert(FamilyVo family);
	
//	<insert id="familyInsert2" parameterType="familyVo">
//	int familyInsertNull(@Param("userId") int userId);

//	<update id="familyUpdate" parameterType="familyVo">
	int familyUpdate(FamilyVo family);
}