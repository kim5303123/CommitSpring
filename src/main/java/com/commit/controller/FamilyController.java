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
	// TODO : result에 담아놓고 쓰지 않은 이유 : 나중에 확인하기 위한 선조치 ( 확인할것 )
	@PostMapping("/insert")
	public ResponseEntity<FamilyVo> createFamily(@RequestBody FamilyVo family) {
		int result = familyService.familyInsert(family);
		return ResponseEntity.ok(family);	
	}
	
	
	//	PUT : /api/family/modify/{id} -> 기존 항목 수정
	@PutMapping("/modify")
	public ResponseEntity<FamilyVo> updateFamily(@RequestBody FamilyVo family) {

		FamilyVo familyUpdate = familyService.familyUpdate(family);
		return ResponseEntity.ok(familyUpdate);
	}
	
	
	//////////////////////////////////////////////////
	////// 아래 소스는 삭제 예정
	//////////////////////////////////////////////////
	
	
	
	
	
	//	POST : /api/family/insert2 -> 기본값 생성
//	@PostMapping("/insert2")
//	public ResponseEntity<FamilyVo> createFamily2(@RequestBody FamilyVo family) {
//		int result = familyService.familyInsert2(family);
//		return ResponseEntity.ok(family);	
//	}
	
	
//	
//	DELETE : /api/board/{id} -> 기존 항목 삭제
//	@DeleteMapping("/{id}")
//	//	Body에 실어 보낼 내용이 없음 -> Void
//	public ResponseEntity<Void> 
//		deleteItem(@PathVariable("id") Integer id) {
//		familyService.deleteItem(id);
//		return ResponseEntity.ok().<Void>build();
//	}
	
}
