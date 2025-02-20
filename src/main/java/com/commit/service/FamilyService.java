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
	
	//	가족 목록 불러오기
	public FamilyVo familySelect(int id) {
		FamilyVo familyVo = familyMapper.familySelect(id);
		return familyVo;
	}
	
	//	가족 목록 추가
	public int familyInsert(FamilyVo family) {
		return familyMapper.familyInsert(family);
	}
	
	//	가족 목록 기본값 추가
	public int familyInsert2(FamilyVo family) {
		return familyMapper.familyInsert2(family);
	}
	
	
//		아이템 수정
//	public FamilyVo updateItem(FamilyVo item) {
//		familyMapper.updateItem(item);
//		return item;
	
//	}
//	
//	//	아이템 삭제
//	public int deleteItem(Integer id) {
//		return familyMapper.deleteItem(id);
//	}	
}
