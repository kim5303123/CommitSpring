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
	public ResponseEntity<String> createProfile(@RequestBody ProfileVo profile) {
		int result = profileService.profileInsert(profile);
		if (result > 0) {
            return ResponseEntity.ok("리뷰가 성공적으로 등록되었습니다.");
        } else {
            return ResponseEntity.badRequest().body("리뷰 등록에 실패했습니다.");
        }
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