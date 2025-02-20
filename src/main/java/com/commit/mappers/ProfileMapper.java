package com.commit.mappers;

import java.util.List;

import com.commit.repository.vo.ProfileVo;


public interface ProfileMapper {
//	<select id="profileSelect" parameterType="int" resultType="profileVo">
	ProfileVo profileSelect(Integer id);
	
//	<insert id="profileInsert" parameterType="profileVo">
	int profileInsert(ProfileVo profile);
	
//	<insert id="profileInser2t" parameterType="profileVo">
	int profileInsert2(ProfileVo profile);
	
//	<update id="updateItem" parameterType="shopItem">
//	int updateItem(ProfileVo item);
}