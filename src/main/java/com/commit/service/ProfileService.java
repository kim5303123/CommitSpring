package com.commit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commit.mappers.ProfileMapper;
import com.commit.repository.vo.ProfileVo;


@Service
public class ProfileService {
	
	@Autowired
	private ProfileMapper profileMapper;
	
	//	목록 불러오기
	public List<ProfileVo> selectAllItems() {
		List<ProfileVo> items = 
				profileMapper.selectAllItems();
		return items;
	}
	
	//	새 아이템 추가
	public ProfileVo insertItem(ProfileVo item) {
		profileMapper.insertItem(item);
		//	새로 생성된 item의 PK
		Integer id = item.getId();
		return profileMapper.selectById(id);
	}
	
	//	아이템 수정
	public ProfileVo updateItem(ProfileVo item) {
		profileMapper.updateItem(item);
		return item;
	}
	
	//	아이템 삭제
	public int deleteItem(Integer id) {
		return profileMapper.deleteItem(id);
	}	
}
