package com.commit.service;

import org.springframework.stereotype.Service;

import com.commit.mappers.CareerMapper;
import com.commit.mappers.DegreeMapper;
import com.commit.mappers.FamilyMapper;
import com.commit.mappers.ProfileMapper;
import com.commit.mappers.UserMapper;
import com.commit.repository.vo.CareerVo;
import com.commit.repository.vo.DegreeVo;
import com.commit.repository.vo.FamilyVo;
import com.commit.repository.vo.ProfileVo;
import com.commit.repository.vo.UserVo;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


@Service
public class UserService {
	
	// 의미있는 주석임
	
	@Autowired
	private UserMapper userMapper;
//	@Autowired
//	private DegreeMapper degreeMapper;
//	@Autowired
//	private FamilyMapper familyMapper;
//	@Autowired
//	private ProfileMapper profileMapper;
//	@Autowired
//	private CareerMapper careerMapper;
	
	//	회원가입
	public UserVo insertUser(UserVo user) {
		userMapper.insertUser(user);
		return user;
	}
	
	
	//	로그인
	public UserVo login(UserVo user) {
        return userMapper.login(user);
	}
	
	
	// 회원 정보 변경
	public UserVo updateUser(UserVo userVo) {
		userMapper.updateUser(userVo);
		return userVo;
	}
	
	
	// 전체 회원 목록
	public List<UserVo> selectAllUser() {
		return userMapper.selectAllUser();
	}
	
	// 단건 조회
	public UserVo selectById(Integer id) {
		return userMapper.selectById(id);
	}
	
	
	//	유저 정보 삭제
	public int userInfoDelete(Integer id) {
		return userMapper.userInfoDelete(id);
	}

}
