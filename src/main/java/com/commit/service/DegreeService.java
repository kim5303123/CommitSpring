package com.commit.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commit.mappers.DegreeMapper;
import com.commit.repository.vo.DegreeVo;


@Service
public class DegreeService {
	
	@Autowired
	private DegreeMapper degreeMapper;
	
	//	학위 정보 불러오기
	public DegreeVo degreeSelect(int id) {
		DegreeVo degreeVo = degreeMapper.degreeSelect(id);
		return degreeVo;
	}
	
	//	학위 정보 추가
	public int degreeInsert(DegreeVo degree) {	
		return degreeMapper.degreeInsert(degree);
	}
	
	// 	학위 정보 기본값 추가
	public int degreeInsert2(DegreeVo degree) {	
		return degreeMapper.degreeInsert2(degree);
	}
}
