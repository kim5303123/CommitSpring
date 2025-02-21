package com.commit.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.commit.repository.vo.DegreeVo;


public interface DegreeMapper {

//	<select id="degreeSelect" parameterType="DegreeVo" resultType="DegreeVo">
	DegreeVo degreeSelect(int id);
	
//	<insert id="degreeInsert" parameterType="DegreeVo">
	int degreeInsert(DegreeVo degree);
	
//	<insert id="degreeInsert2" parameterType="DegreeVo">
//	int degreeInsertNull(@Param("userId") int userId);
	
//	<update id="degreeUpdate" parameterType="degreeVo">
	int degreeUpdate(DegreeVo degree);
}