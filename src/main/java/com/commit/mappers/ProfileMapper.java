package com.commit.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

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
	
//	<insert id="insertProfile" parameterType="profileVo">
	void insertProfile(ProfileVo profile);
	
//	<select id="getProfileById" parameterType="int" resultType="profileVo">
    ProfileVo getProfileById(Integer id);
}