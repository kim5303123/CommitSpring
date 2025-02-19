package com.commit.mappers;

import java.util.List;

import com.commit.repository.vo.ProfileVo;


public interface ProfileMapper {
//	<select id="selectAllItems" resultType="shopItem">
	List<ProfileVo> selectAllItems();
	
//	<insert id="insertItem" parameterType="shopItem">
	int insertItem(ProfileVo item);
	
//	<select id="selectById" parameterType="int" resultType="shopItem">
	ProfileVo selectById(Integer id);
	
//	<update id="updateItem" parameterType="shopItem">
	int updateItem(ProfileVo item);
	
//	<delete id="deleteItem" parameterType="int">
	int deleteItem(Integer id);
}