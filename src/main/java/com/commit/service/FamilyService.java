package com.commit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commit.mappers.FamilyMapper;
import com.commit.repository.vo.FamilyVo;


@Service
public class FamilyService {
	
	@Autowired
	private FamilyMapper familyMapper;
	
	//	목록 불러오기
	public List<FamilyVo> selectAllItems() {
		List<FamilyVo> items = 
				familyMapper.selectAllItems();
		return items;
	}
	
	//	새 아이템 추가
	public FamilyVo insertItem(FamilyVo item) {
		familyMapper.insertItem(item);
		//	새로 생성된 item의 PK
		Integer id = item.getId();
		return familyMapper.selectById(id);
	}
	
	//	아이템 수정
	public FamilyVo updateItem(FamilyVo item) {
		familyMapper.updateItem(item);
		return item;
	}
	
	//	아이템 삭제
	public int deleteItem(Integer id) {
		return familyMapper.deleteItem(id);
	}	
}
