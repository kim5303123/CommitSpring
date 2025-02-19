package com.commit.mappers;

import java.util.List;

import com.commit.repository.vo.MypageVo;


public interface MypageMapper {
//	<select id="selectAllItems" resultType="shopItem">
	List<MypageVo> selectAllItems();
	
//	<insert id="insertItem" parameterType="shopItem">
	int insertItem(MypageVo item);
	
//	<select id="selectById" parameterType="int" resultType="shopItem">
	MypageVo selectById(Integer id);
	
//	<update id="updateItem" parameterType="shopItem">
	int updateItem(MypageVo item);
	
//	<delete id="deleteItem" parameterType="int">
	int deleteItem(Integer id);
}