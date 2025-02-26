package com.commit.mappers;

import org.apache.ibatis.annotations.Mapper;

import com.commit.repository.vo.PhotoVo;
import com.commit.repository.vo.ProfileVo;

@Mapper
public interface PhotoMapper {
	
	
//	<insert id="insertOrUpdatePhoto" parameterType="photoVo">
	void insertOrUpdatePhoto(PhotoVo photo);
	
//	<select id="getProfileById" parameterType="int"	resultType="photoVo">
    PhotoVo getProfileById(Integer id);
}