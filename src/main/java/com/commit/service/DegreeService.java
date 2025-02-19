package com.commit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commit.mappers.DegreeMapper;
import com.commit.repository.vo.DegreeVo;


@Service
public class DegreeService {
	
	@Autowired
	private DegreeMapper degreeMapper;
	
	//	목록 불러오기
	public List<DegreeVo> selectAllItems() {
		List<DegreeVo> items = 
				degreeMapper.selectAllItems();
		return items;
	}
	
	//	새 아이템 추가
	public DegreeVo insertItem(DegreeVo item) {
		degreeMapper.insertItem(item);
		//	새로 생성된 item의 PK
		Integer id = item.getId();
		return degreeMapper.selectById(id);
	}
	
	//	아이템 수정
	public DegreeVo updateItem(DegreeVo item) {
		degreeMapper.updateItem(item);
		return item;
	}
	
	//	아이템 삭제
	public int deleteItem(Integer id) {
		return degreeMapper.deleteItem(id);
	}	
}
