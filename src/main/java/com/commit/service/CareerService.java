package com.commit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commit.mappers.CareerMapper;
import com.commit.repository.vo.CareerVo;


@Service
public class CareerService {
	
	@Autowired
	private CareerMapper careerMapper;
	
	// 직업 정보 불러오기
	public CareerVo careerSelect(int id) {
		CareerVo careerVo = careerMapper.careerSelect(id);
		return careerVo;
	}
	
	// 직업 정보 추가
	public int careerInsert(CareerVo career) {
		return careerMapper.careerInsert(career);
	}
	
}
