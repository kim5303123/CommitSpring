package com.commit.mappers;


import com.commit.repository.vo.CareerVo;


public interface CareerMapper {
	
//	<select id="careerSelect" parameterType="int" resultType="CareerVo">
	CareerVo careerSelect(int id);
	
//	<insert id="careerInsert" parameterType="CareerVo">
	int careerInsert(CareerVo career);
	
//	<insert id="careerInsert2" parameterType="CareerVo">
//	int careerInsertNull(@Param("userId") int userId);
	
//	<update id="careerUpdate" parameterType="CareerVo">
	int careerUpdate(CareerVo career);
}