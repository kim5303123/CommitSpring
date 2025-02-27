package com.commit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commit.mappers.BoardMapper;
import com.commit.repository.vo.BoardVo;


@Service
public class BoardService {
	
	@Autowired
	private BoardMapper boardMapper;
	
	//	목록 불러오기
	public List<BoardVo> selectAllItems() {
		List<BoardVo> items = 
				boardMapper.selectAllItems();
		return items;
	}
	
	//	수정
	public BoardVo updateItem(BoardVo item) {
		boardMapper.updateItem(item);
		return item;
	}

}