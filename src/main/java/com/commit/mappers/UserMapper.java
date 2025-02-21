package com.commit.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import com.commit.repository.vo.UserVo;


public interface UserMapper {
//	<insert id="insertUser" parameterType="UserVo">
	void insertUser(UserVo user);

//	<select id="login" parameterType="UserVo" resultType="UserVo">
	UserVo login(UserVo user);	
	
//	<update id="updateUser" parameterType="UserVo">
	void updateUser(UserVo userVo);
	
//	<select id="selectAllUser" parameterType="UserVo" resultType="UserVo">
	UserVo selectAllUser(UserVo userVo);
}
