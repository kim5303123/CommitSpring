package com.commit.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.commit.repository.vo.CareerVo;
import com.commit.repository.vo.DegreeVo;
import com.commit.service.DegreeService;

@RestController
@RequestMapping("/api/degree")
public class DegreeController {

	@Autowired
	private DegreeService degreeService;
	
	//	GET : /api/degree
	@GetMapping("/{no}")
	public ResponseEntity<DegreeVo> getAllItems(@PathVariable("no") int id) {
		DegreeVo degree = degreeService.degreeSelect(id);
		return ResponseEntity.ok(degree);
	}
	
	
	//	POST : /api/degree/insert -> 새로운 항목 생성
	@PostMapping("/insert")
	public ResponseEntity<DegreeVo> createDegree(@RequestBody DegreeVo degree) {
		int result = degreeService.degreeInsert(degree);
		return ResponseEntity.ok(degree);
	}
	
	
	
	
	
	
	
	
	
	
	//	PUT : /api/degree/modify/{id} -> 기존 항목 수정
//	@PostMapping("/modify/{id}")
//	public ResponseEntity<DegreeVo> updateDegree(@RequestBody DegreeVo degree,
//												@PathVariable("id") Integer id) {
//		degree.setId(id);
//		DegreeVo degreeUpdate = degreeService.degreeUpdate(degree);
//		return ResponseEntity.ok(degreeUpdate);
//	}
	
	//	POST : /api/degree/insert2 -> 기본값 생성
//	@PostMapping("/insert2")
//	public ResponseEntity<DegreeVo> createDegree2(@RequestBody DegreeVo degree) {
//		int result = degreeService.degreeInsert2(degree);
//		return ResponseEntity.ok(degree);
//	}
}
