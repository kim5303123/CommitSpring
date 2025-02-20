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

import com.commit.repository.vo.ProfileVo;
import com.commit.service.ProfileService;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {

	@Autowired
	private ProfileService profileService;
	
//	GET : /api/profile
	@GetMapping("/{no}")
	public ResponseEntity<ProfileVo> getAllItems(@PathVariable("no") int id) {
		ProfileVo profileVo = profileService.profileSelect(id);
		return ResponseEntity.ok(profileVo);
	}

//	POST : /api/profile -> 새로운 항목 생성
	@PostMapping
	public ResponseEntity<ProfileVo> createItem(@RequestBody ProfileVo profile) {
		int result = profileService.profileInsert(profile);
		return ResponseEntity.ok(profile);	
	}
	
	
	
//	id로 검색
//	@GetMapping("/{id}")
//	public ResponseEntity<TodoItem> getTodoById(
//			@PathVariable("id") Long id) {
//		Optional<TodoItem> todo = todoRepository.findById(id);
//		return todo.map(ResponseEntity::ok)
//				.orElseGet(() -> ResponseEntity.notFound().build());
//	}
	
	
//	PUT : /api/board/{id} -> 기존 항목 수정
//	@PutMapping("/{id}")
//	public ResponseEntity<ProfileVo> updateItem(@RequestBody ProfileVo item,
//			@PathVariable("id") Integer id) {
//		item.setId(id);
//		ProfileVo updatedItem = profileService.updateItem(item);
//		return ResponseEntity.ok(updatedItem);
//	}
//	
//	DELETE : /api/board/{id} -> 기존 항목 삭제
//	@DeleteMapping("/{id}")
//	//	Body에 실어 보낼 내용이 없음 -> Void
//	public ResponseEntity<Void> 
//		deleteItem(@PathVariable("id") Integer id) {
//		profileService.deleteItem(id);
//		return ResponseEntity.ok().<Void>build();
//	}
	
}
