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

import org.springframework.beans.factory.annotation.Autowired;


@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private DegreeMapper degreeMapper;
	@Autowired
	private FamilyMapper familyMapper;
	@Autowired
	private ProfileMapper profileMapper;
	@Autowired
	private CareerMapper careerMapper;
	
	//	회원가입
	public UserVo insertUser(UserVo user) {
		userMapper.insertUser(user);
		return user;
	}
	
	//	로그인
	public UserVo login(UserVo user) {
        return userMapper.login(user);
	}
	
	//	학위정보 insert
//    public DegreeVo insertDegree(Integer id ) { 
//        degreeMapper.degreeInsert2(id);
//        familyMapper.familyInsert2(id);
//        profileMapper.profileInsert2(id);
//        careerMapper.careerInsert2(id);
//        return degree;
//	}
//    
    //	가족정보 insert
    public FamilyVo insertFamily(FamilyVo family) { 
        familyMapper.familyInsert2(family); 
        return family;
	}
    
    //	신상정보 insert
    public ProfileVo insertProfile(ProfileVo profile) { 
        profileMapper.profileInsert2(profile); 
        return profile;
	}
    
    //	직장정보 insert
    public CareerVo insertCareer(CareerVo career) { 
        careerMapper.careerInsert2(career); 
        return career;
	}
    
}
