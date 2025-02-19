package com.commit.mappers;

import java.util.List;

import com.commit.repository.vo.CareerVo;


public interface CareerMapper {
//	<select id="selectAllItems" resultType="shopItem">
	List<CareerVo> selectAllItems();
	
//	<insert id="insertItem" parameterType="shopItem">
	int insertItem(CareerVo item);
	
//	<select id="selectById" parameterType="int" resultType="shopItem">
	CareerVo selectById(Integer id);
	
//	<update id="updateItem" parameterType="shopItem">
	int updateItem(CareerVo item);
	
//	<delete id="deleteItem" parameterType="int">
	int deleteItem(Integer id);
}