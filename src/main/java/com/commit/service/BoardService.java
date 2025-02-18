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
	
	//	새 아이템 추가
	public BoardVo insertItem(BoardVo item) {
		boardMapper.insertItem(item);
		//	새로 생성된 item의 PK
		Integer id = item.getId();
		return boardMapper.selectById(id);
	}
	
	//	아이템 수정
	public BoardVo updateItem(BoardVo item) {
		boardMapper.updateItem(item);
		return item;
	}
	
	//	아이템 삭제
	public int deleteItem(Integer id) {
		return boardMapper.deleteItem(id);
	}	
}
