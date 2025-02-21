package com.commit.service;

import java.net.Inet4Address;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commit.mappers.ProfileMapper;
import com.commit.repository.vo.CareerVo;
import com.commit.repository.vo.ProfileVo;


@Service
public class ProfileService {
	
	@Autowired
	private ProfileMapper profileMapper;
	
	//	신상 정보 불러오기
	public ProfileVo profileSelect(int id) {
		ProfileVo profileVo = profileMapper.profileSelect(id);
		return profileVo;
	}
	
	//	신상 정보 추가
	public int profileInsert(ProfileVo profile) {
		return profileMapper.profileInsert(profile);
	}
	
	//	신상 정보 기본값 추가
//	public int profileInsert2(ProfileVo profile) {
//		return profileMapper.profileInsert2(profile);
//	}
	
	//	신상 정보 수정
	public ProfileVo profileUpdate(ProfileVo profile) {
		profileMapper.profileUpdate(profile);
		return profile;
	}
	
//	
//	//	아이템 삭제
//	public int deleteItem(Integer id) {
//		return profileMapper.deleteItem(id);
//	}	
}
