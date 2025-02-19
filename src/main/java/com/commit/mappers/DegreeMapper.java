package com.commit.mappers;

import java.util.List;

import com.commit.repository.vo.DegreeVo;


public interface DegreeMapper {
//	<select id="selectAllItems" resultType="shopItem">
	List<DegreeVo> selectAllItems();
	
//	<insert id="insertItem" parameterType="shopItem">
	int insertItem(DegreeVo item);
	
//	<select id="selectById" parameterType="int" resultType="shopItem">
	DegreeVo selectById(Integer id);
	
//	<update id="updateItem" parameterType="shopItem">
	int updateItem(DegreeVo item);
	
//	<delete id="deleteItem" parameterType="int">
	int deleteItem(Integer id);
}