package com.commit.mappers;

import org.apache.ibatis.annotations.Mapper;

import com.commit.repository.vo.PhotoVo;
import com.commit.repository.vo.ProfileVo;

@Mapper
public interface PhotoMapper {
	
	
//	<insert id="insertProfile" parameterType="photoVo">
	void insertPhoto(PhotoVo photo);
	
//	<select id="getProfileById" parameterType="int"	resultType="photoVo">
    PhotoVo getProfileById(Integer id);
}