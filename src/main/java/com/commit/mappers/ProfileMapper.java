package com.commit.mappers;


import com.commit.repository.vo.ProfileVo;


public interface ProfileMapper {
//	<select id="profileSelect" parameterType="int" resultType="profileVo">
	ProfileVo profileSelect(Integer id);
	
//	<insert id="profileInsert" parameterType="profileVo">
	int profileInsert(ProfileVo profile);
	
//	<insert id="profileInser2t" parameterType="profileVo">
//	int profileInsertNull(@Param("userId") int userId);
	
//	<update id="profileUpdate" parameterType="profileVo">
	int profileUpdate(ProfileVo profile);
	

}