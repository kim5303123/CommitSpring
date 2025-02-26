package com.commit.mappers;

import java.util.List;

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
	List<UserVo> selectAllUser();
	
//	<select id="selectById" parameterType="int"	resultType="UserVo">
	UserVo selectById(Integer id);
	
//	<delete id="userInfoDelete" parameterType="int">
	int userInfoDelete(Integer id);
}
