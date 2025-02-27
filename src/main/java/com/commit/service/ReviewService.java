package com.commit.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commit.mappers.MypageMapper;
import com.commit.mappers.ReviewMapper;
import com.commit.repository.vo.MypageVo;
import com.commit.repository.vo.ReviewVo;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewMapper reviewMapper;
	
	@Autowired
	private MypageMapper mypageMapper;
	
	
	
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
	
	public int insertReview(ReviewVo reviewVo) {
        return reviewMapper.insertReview(reviewVo);
    }
	
	public MypageVo selectMyapgeById(Integer id) {
        return mypageMapper.mypageSelect(id);
    }
	
}