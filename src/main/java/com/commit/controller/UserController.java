package com.commit.controller;



import java.lang.System.Logger;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.commit.repository.vo.UserVo;
import com.commit.service.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


@RestController
@RequestMapping("/api/user")

public class UserController {

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
    
    //	GET: /user/join -> 회원가입 폼
    @GetMapping("/join")
    public ResponseEntity<String> joinInfoForm() {
        return ResponseEntity.ok("회원 정보 입력 페이지");
    }
    
    
    //	POST: /user/join -> 회원가입 처리
    @PostMapping("/join")
    public ResponseEntity<UserVo> joinAgreement(@RequestBody UserVo userVo) {
    	UserVo savedUserVo = userService.insertUser(userVo);
    	return ResponseEntity.ok(savedUserVo);
    }

    
    //	POST: /user/join/info -> 가입정보 입력 처리
//    @PostMapping("/join/info")
//    public ResponseEntity<UserVo> joinInfo(@RequestBody UserVo user) {
//        UserVo registeredUser = userService.insertUser(user);
//        return ResponseEntity.ok(registeredUser);
//    }

    
    //	GET: /user/joinsuccess -> 가입 성공 화면
    @GetMapping("/joinsuccess")
    public ResponseEntity<String> joinSuccess() {
        return ResponseEntity.ok("회원가입 성공 페이지");
    }

//	id로 검색
	@GetMapping("/{id}")
    public ResponseEntity<UserVo> getItemById(@PathVariable Integer id) {
        UserVo item = userService.selectById(id);
        if (item != null) {
            return ResponseEntity.ok(item);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    
    // DELETE: /user/{id}	->	유저 정보 삭제
	// CASCADE 설정할 것
	@DeleteMapping("/{id}")
	public ResponseEntity<?> userInfoDelete(@PathVariable("id") Integer id) {
	    try {
	        int deletedCount = userService.userInfoDelete(id);
	        if (deletedCount > 0) {
	            return ResponseEntity.ok().build();
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    } catch (DataIntegrityViolationException e) {
	        return ResponseEntity.status(HttpStatus.CONFLICT)
	            .body("사용자와 연결된 데이터가 있어 삭제할 수 없습니다.");
	    } catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
	            .body("삭제 중 오류 발생: " + e.getMessage());
	    }
	}
    
    
    //	GET: /user/login -> 로그인 폼
    @GetMapping("/login")
    public ResponseEntity<String> loginForm() {
        return ResponseEntity.ok("로그인 페이지");
    }

    
    //	POST: /user/login -> 로그인 처리
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserVo user, HttpServletRequest request) {
    	HttpSession session = request.getSession();	//	기존 세션 가져오기
    	session.invalidate();	//	기존 세션 제거 (중복 로그인 방지)
    	
        UserVo loginUser = userService.login(user);
        
        if (loginUser != null) {
        	session = request.getSession(true);	//	새로운 세션 생성
        	session.setAttribute("loginUser", loginUser);	// 로그인한 사용자 정보 저장
        	System.out.println(session.getAttribute("loginUser"));
            return ResponseEntity.ok(loginUser);
        }
        return ResponseEntity.status(401).body("로그인 실패");
}

    
    //	GET: /user/logout -> 로그아웃
    @GetMapping("/logout")
    public ResponseEntity<?> logout(HttpServletRequest request) {
    	HttpSession session = request.getSession(false);
    	
    	if (session != null) {
    		session.invalidate();	// 세션 삭제 (로그아웃 처리)
    	}
        return ResponseEntity.ok("로그아웃 성공");
	}
    

    // GET: /user/session
    @GetMapping("/session")
    public ResponseEntity<?> getUserSession(HttpSession session) {
    	UserVo vo = (UserVo)session.getAttribute("loginUser");
    	System.out.println(session.getAttribute("loginUser"));
    	
    	if (vo == null) {
			return ResponseEntity.status(401).body("세션을 못가져왔어요");
		}
        return ResponseEntity.ok(vo);
    }
    
 // GET: /user/session
    @GetMapping("/all")
    public ResponseEntity<?> getUsers() {
    	List<UserVo> Userlist = userService.selectAllUser();
    	if (Userlist == null) {
			return ResponseEntity.status(401).body("유저를 못가져왔어요");
		}
        return ResponseEntity.ok(Userlist);
    }


}