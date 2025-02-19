package com.commit.mappers;

import java.util.List;

import com.commit.repository.vo.CareerVo;


public interface CareerMapper {
	
//	<select id="careerSelect" parameterType="int" resultType="CareerVo">
	CareerVo careerSelect(int id);
	
//	<insert id="careerInsert" parameterType="CareerVo">
	int careerInsert(CareerVo career);
	
	
}