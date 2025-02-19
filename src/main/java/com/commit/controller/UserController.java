package com.commit.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.commit.repository.vo.UserVo;
import com.commit.service.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


@Controller
@RequestMapping("/api/user")

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
    public ResponseEntity<?> login(@RequestBody UserVo user, HttpServletRequest request) {
    	HttpSession session = request.getSession();	//	기존 세션 가져오기
    	session.invalidate();	//	기존 세션 제거 (중복 로그인 방지)
    	
        UserVo loginUser = userService.login(user);
        
        if (loginUser != null) {
        	session = request.getSession(true);	//	새로운 세션 생성
        	session.setAttribute("loginUser", loginUser);	// 로그인한 사용자 정보 저장
            return ResponseEntity.ok(loginUser);
        }
        return ResponseEntity.status(401).body("로그인 실패");
    }

    // GET: /users/logout - 로그아웃
    @GetMapping("/logout")
    public ResponseEntity<?> logout(HttpServletRequest request) {
    	HttpSession session = request.getSession(false);
    	
    	if (session != null) {
    		session.invalidate();	// 세션 삭제 (로그아웃 처리)
    	}
    	
        return ResponseEntity.ok("로그아웃 성공");
	}
	
}