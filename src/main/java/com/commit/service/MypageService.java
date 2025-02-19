package com.commit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commit.mappers.MypageMapper;
import com.commit.repository.vo.MypageVo;


@Service
public class MypageService {
	
	@Autowired
	private MypageMapper mypageMapper;
	
	//	목록 불러오기
	public List<MypageVo> selectAllItems() {
		List<MypageVo> items = 
				mypageMapper.selectAllItems();
		return items;
	}
	
	//	새 아이템 추가
	public MypageVo insertItem(MypageVo item) {
		mypageMapper.insertItem(item);
		//	새로 생성된 item의 PK
		Integer id = item.getId();
		return mypageMapper.selectById(id);
	}
	
	//	아이템 수정
	public MypageVo updateItem(MypageVo item) {
		mypageMapper.updateItem(item);
		return item;
	}
	
	//	아이템 삭제
	public int deleteItem(Integer id) {
		return mypageMapper.deleteItem(id);
	}	
}
