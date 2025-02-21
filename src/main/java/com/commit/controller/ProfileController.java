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
	@PostMapping("/insert")
	public ResponseEntity<ProfileVo> createProfile(@RequestBody ProfileVo profile) {
		int result = profileService.profileInsert(profile);
		return ResponseEntity.ok(profile);	
	}
	

	//	PUT : /api/profile/modify/{id} -> 기존 항목 수정
	@PutMapping("/modify/{id}")
	public ResponseEntity<ProfileVo> updateProfile(@RequestBody ProfileVo profile, 
												@PathVariable("id") Integer id) {
		profile.setId(id);
		ProfileVo profileUpdate = profileService.profileUpdate(profile);
		return ResponseEntity.ok(profileUpdate);
	}
	

	
	
	
	
	
	//	POST : /api/profile -> 기본값 생성
//	@PostMapping("/insert2")
//	public ResponseEntity<ProfileVo> createProfile2(@RequestBody ProfileVo profile) {
//		int result = profileService.profileInsert2(profile);
//		return ResponseEntity.ok(profile);	
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
