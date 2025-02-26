package com.commit.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

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
	// TODO : result에 담아놓고 쓰지 않은 이유 : 나중에 확인하기 위한 선조치 ( 확인할것 )
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
	
}