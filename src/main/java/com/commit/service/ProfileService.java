package com.commit.service;

import java.net.Inet4Address;
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
	public ProfileVo profileSelect(int id) {
		ProfileVo profileVo = profileMapper.profileSelect(id);
		return profileVo;
	}
	
	//	새 아이템 추가
	public int profileInsert(ProfileVo profile) {
		return profileMapper.profileInsert(profile);
	}
	
//	//	아이템 수정
//	public ProfileVo updateItem(ProfileVo item) {
//		profileMapper.updateItem(item);
//		return item;
//	}
//	
//	//	아이템 삭제
//	public int deleteItem(Integer id) {
//		return profileMapper.deleteItem(id);
//	}	
}
