package com.commit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.commit.repository.vo.CareerVo;
import com.commit.repository.vo.DegreeVo;
import com.commit.service.CareerService;

@RestController
@RequestMapping("/api/career")
public class CareerController {

	@Autowired
	private CareerService careerService;
	
	//	GET : /api/career
	@GetMapping("/{no}")
	public ResponseEntity<CareerVo> getAllItems(@PathVariable("no") int id) {
		CareerVo career = careerService.careerSelect(id);
		return ResponseEntity.ok(career);
	}
	
	
	//	POST : /api/career/insert -> 새로운 항목 생성
	@PostMapping("/insert")
	public ResponseEntity<CareerVo> createCareer(@RequestBody CareerVo career) {
		int result = careerService.careerInsert(career);
		return ResponseEntity.ok(career);	
	}
	
	//	POST : /api/career/insert2 -> 기본값 생성
	@PostMapping("/insert2")
	public ResponseEntity<CareerVo> createCareer2(@RequestBody CareerVo career) {
		int result = careerService.careerInsert2(career);
		return ResponseEntity.ok(career);	
	}
	
	
	//	PUT : /api/career/{id} -> 기존 항목 수정
//	@PutMapping("/{id}")
//	public ResponseEntity<CareerVo> updateItem(@RequestBody CareerVo item, @PathVariable("id") Integer id) {
//		item.setId(id);
//		CareerVo careerUpdate = careerService.careerUpdate(item);
//		return ResponseEntity.ok(careerUpdate);
		

	
	
	
	
	

	
	
	
	
	
	
	

	
//	DELETE : /api/board/{id} -> 기존 항목 삭제
//	@DeleteMapping("/{id}")
//	//	Body에 실어 보낼 내용이 없음 -> Void
//	public ResponseEntity<Void> 
//		deleteItem(@PathVariable("id") Integer id) {
//		careerService.deleteItem(id);
//		return ResponseEntity.ok().<Void>build();
//	}
	
}
