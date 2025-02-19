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
	
}
