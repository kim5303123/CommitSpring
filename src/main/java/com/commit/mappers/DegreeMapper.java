package com.commit.mappers;

import java.util.List;

import com.commit.repository.vo.DegreeVo;


public interface DegreeMapper {

//	<select id="degreeSelect" parameterType="DegreeVo" resultType="DegreeVo">
	DegreeVo degreeSelect(int id);
	
//	<insert id="degreeInsert" parameterType="DegreeVo">
	int degreeInsert(DegreeVo degree);
	
//	<insert id="degreeInsert2" parameterType="DegreeVo">
	int degreeInsert2(DegreeVo degree);
}