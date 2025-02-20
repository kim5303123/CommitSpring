package com.commit.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commit.mappers.ReviewMapper;
import com.commit.repository.vo.ReviewVo;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewMapper reviewMapper;
	
	private final List<ReviewVo> todos = new ArrayList<>();
	
	//	목록 불러오기
	public List<ReviewVo> selectAllItems() {
		List<ReviewVo> items = 
				reviewMapper.selectAllItems();
		return items;
	}
	
	// 단건 조회
	public ReviewVo selectById(Integer id) {
		return reviewMapper.selectById(id);
	}
	
	//	새 아이템 추가
//	public ReviewVo insertItem(ReviewVo item) {
//		reviewMapper.insertItem(item);
//		//	새로 생성된 item의 PK
//		Integer id = item.getId();
//		return reviewMapper.selectById(id);
//	}
	

	// 테스트 추가
	public ReviewVo insertItem(ReviewVo item) {
        reviewMapper.insertItemWithUserInfo(item);
        return item; // id가 자동으로 설정됩니다.
    }
	
	
	
	
	/////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////
	
	
	
	//	아이템 수정
	public ReviewVo updateItem(ReviewVo item) {
		reviewMapper.updateItem(item);
		return item;
	}
	
	//	아이템 삭제
	public int deleteItem(Integer id) {
		return reviewMapper.deleteItem(id);
	}
	
	
}