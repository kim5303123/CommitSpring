package com.commit.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.commit.repository.vo.ReviewVo;



public interface ReviewMapper {
//	<select id="selectAllItems" resultType="shopItem">
	List<ReviewVo> selectAllItems();
	
//	<insert id="insertItem" parameterType="shopItem">
	int insertItem(ReviewVo item);
	
//	<select id="selectById" parameterType="int" resultType="shopItem">
	ReviewVo selectById(Integer id);
	
//	<update id="updateItem" parameterType="shopItem">
	int updateItem(ReviewVo item);
	
//	<delete id="deleteItem" parameterType="int">
	int deleteItem(Integer id);
}