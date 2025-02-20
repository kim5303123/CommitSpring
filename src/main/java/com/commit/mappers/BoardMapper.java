package com.commit.mappers;

import java.util.List;

import com.commit.repository.vo.BoardVo;


public interface BoardMapper {
//	<select id="selectAllItems" resultType="boardVo">
	List<BoardVo> selectAllItems();
	
//	<update id="updateItem" parameterType="boardVo">
	int updateItem(BoardVo item);
	
	
	
	
	
	/////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////
	
	
	
	
//	<insert id="insertItem" parameterType="shopItem">
	int insertItem(BoardVo item);
	
//	<select id="selectById" parameterType="int" resultType="shopItem">
	BoardVo selectById(Integer id);
	
	
//	<delete id="deleteItem" parameterType="int">
	int deleteItem(Integer id);
}