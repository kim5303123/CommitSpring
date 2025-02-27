package com.commit.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.commit.repository.vo.FamilyVo;
import com.commit.service.FamilyService;

@RestController
@RequestMapping("/api/family")
public class FamilyController {

	@Autowired
	private FamilyService familyService;
	
	//	GET : /api/family
	@GetMapping("/{no}")
	public ResponseEntity<?> getAllItems(@PathVariable("no") int id) {
		FamilyVo familyVo = familyService.familySelect(id);
		if(familyVo == null) {
			return ResponseEntity.status(401).body("테이블을 찾지 못함");
		}
		return ResponseEntity.ok(familyVo);
	}
	
	
	//	POST : /api/family -> 새로운 항목 생성
	@PostMapping("/insert")
	public ResponseEntity<String> createFamily(@RequestBody FamilyVo family) {
		int result = familyService.familyInsert(family);
		if (result > 0) {
            return ResponseEntity.ok("리뷰가 성공적으로 등록되었습니다.");
        } else {
            return ResponseEntity.badRequest().body("리뷰 등록에 실패했습니다.");
        }
		
	}
	
	
	//	PUT : /api/family/modify/{id} -> 기존 항목 수정
	@PutMapping("/modify")
	public ResponseEntity<FamilyVo> updateFamily(@RequestBody FamilyVo family) {

		FamilyVo familyUpdate = familyService.familyUpdate(family);
		return ResponseEntity.ok(familyUpdate);
	}
	
}
