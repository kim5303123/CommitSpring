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
	
	//	목록 불러오기
	public List<CareerVo> selectAllItems() {
		List<CareerVo> items = 
				careerMapper.selectAllItems();
		return items;
	}
	
	//	새 아이템 추가
	public CareerVo insertItem(CareerVo item) {
		careerMapper.insertItem(item);
		//	새로 생성된 item의 PK
		Integer id = item.getId();
		return careerMapper.selectById(id);
	}
	
	//	아이템 수정
	public CareerVo updateItem(CareerVo item) {
		careerMapper.updateItem(item);
		return item;
	}
	
	//	아이템 삭제
	public int deleteItem(Integer id) {
		return careerMapper.deleteItem(id);
	}	
}
