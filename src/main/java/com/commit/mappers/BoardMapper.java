package com.commit.mappers;

import java.util.List;

import com.commit.repository.vo.BoardVo;


public interface BoardMapper {
//	<select id="selectAllItems" resultType="shopItem">
	List<BoardVo> selectAllItems();
	
//	<insert id="insertItem" parameterType="shopItem">
	int insertItem(BoardVo item);
	
//	<select id="selectById" parameterType="int" resultType="shopItem">
	BoardVo selectById(Integer id);
	
//	<update id="updateItem" parameterType="shopItem">
	int updateItem(BoardVo item);
	
//	<delete id="deleteItem" parameterType="int">
	int deleteItem(Integer id);
}
