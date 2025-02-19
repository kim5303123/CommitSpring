package com.commit.mappers;

import java.util.List;

import com.commit.repository.vo.FamilyVo;


public interface FamilyMapper {
//	<select id="selectAllItems" resultType="shopItem">
	List<FamilyVo> selectAllItems();
	
//	<insert id="insertItem" parameterType="shopItem">
	int insertItem(FamilyVo item);
	
//	<select id="selectById" parameterType="int" resultType="shopItem">
	FamilyVo selectById(Integer id);
	
//	<update id="updateItem" parameterType="shopItem">
	int updateItem(FamilyVo item);
	
//	<delete id="deleteItem" parameterType="int">
	int deleteItem(Integer id);
}