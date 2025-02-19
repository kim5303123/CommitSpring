package com.commit.controller;

import java.lang.System.Logger;
import java.net.URI;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.commit.repository.vo.UserVo;
import com.commit.service.UserService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
    // GET: /users/join - 회원가입 시작 페이지 (약관 동의 폼)
    @GetMapping("/join")
    public ResponseEntity<String> joinStart() {
        return ResponseEntity.ok("약관 동의 페이지");
    }

    // POST: /users/join/agreement - 약관 동의 처리
    @PostMapping("/join/agreement")
    public ResponseEntity<UserVo> joinAgreement(@RequestBody UserVo userVo) {
    	UserVo savedUserVo = userService.insertUser(userVo);
//        if ("동의".equals(agreementStatus) ) {
//        	return ResponseEntity.status(HttpStatus.FOUND)
//                    .location(URI.create("/api/users/join/info")) // 가입 정보 입력 폼으로 리다이렉트
//                    .build();
//        } else {
//        	return ResponseEntity.status(HttpStatus.BAD_REQUEST)
//        			.body("약관 동의 필수");
//        }
    	return ResponseEntity.ok(savedUserVo);
    }

    // GET: /users/join/info - 가입정보 입력 폼
    @GetMapping("/join/info")
    public ResponseEntity<String> joinInfoForm() {
        return ResponseEntity.ok("회원 정보 입력 페이지");
    }

    // POST: /users/join/info - 가입정보 입력 처리
    @PostMapping("/join/info")
    public ResponseEntity<UserVo> joinInfo(@RequestBody UserVo user) {
        UserVo registeredUser = userService.insertUser(user);
        return ResponseEntity.ok(registeredUser);
    }

    // GET: /users/joinsuccess - 가입 성공 화면
    @GetMapping("/joinsuccess")
    public ResponseEntity<String> joinSuccess() {
        return ResponseEntity.ok("회원가입 성공 페이지");
    }

    // GET: /users/login - 로그인 폼
    @GetMapping("/login")
    public ResponseEntity<String> loginForm() {
        return ResponseEntity.ok("로그인 페이지");
    }

    // POST: /users/login - 로그인 처리
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserVo user) {
        UserVo loginUser = userService.login(user);
        if (loginUser != null) {
            return ResponseEntity.ok(loginUser);
        }
        return ResponseEntity.status(401).body("로그인 실패");
    }

    // GET: /users/logout - 로그아웃
    @GetMapping("/logout")
    public ResponseEntity<String> logout() {
        return ResponseEntity.ok("로그아웃 성공");
	
	//
	
	}
	
}
