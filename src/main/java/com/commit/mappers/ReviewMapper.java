package com.commit.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.commit.repository.vo.ReviewVo;



public interface ReviewMapper {
//	<select id="selectAllItems" resultType="reviewVo">
	List<ReviewVo> selectAllItems();
	
//	<insert id="insertItem" parameterType="map">
	int insertItem(ReviewVo item);
	
//	<select id="selectById" parameterType="int" resultType="reviewVo">
	ReviewVo selectById(Integer id);
	
//	<insert id="insertItemWithUserInfo" parameterType="map">
	int insertItemWithUserInfo(ReviewVo item);

	
	//////////////////////////////////////////////////
	////// 아래 소스는 삭제 예정
	//////////////////////////////////////////////////
	
	
//	<update id="updateItem" parameterType="shopItem">
	int updateItem(ReviewVo item);
	
//	<delete id="deleteItem" parameterType="int">
	int deleteItem(Integer id);
}