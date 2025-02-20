package com.commit.mappers;

import java.util.List;

import com.commit.repository.vo.ProfileVo;


public interface ProfileMapper {
//	<select id="profileSelect" parameterType="int" resultType="profileVo">
	ProfileVo profileSelect(Integer id);
	
//	<insert id="profileInsert" parameterType="profileVo">
	int profileInsert(ProfileVo profile);
	
//	<select id="selectById" parameterType="int" resultType="shopItem">
//	ProfileVo selectById(Integer id);
	
//	<update id="updateItem" parameterType="shopItem">
//	int updateItem(ProfileVo item);
	
//	<delete id="deleteItem" parameterType="int">
//	int deleteItem(Integer id);
}