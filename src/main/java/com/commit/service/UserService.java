package com.commit.service;

import org.springframework.stereotype.Service;

import com.commit.mappers.UserMapper;
import com.commit.repository.vo.UserVo;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	// 회원가입 (insertUser)
	public UserVo insertUser(UserVo user) {
		userMapper.insertUser(user);
		return user;
	}
	
	// 로그인 (selectUser)
	public UserVo login(UserVo user) {
        return userMapper.login(user);
	}
}
