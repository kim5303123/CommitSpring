package com.commit.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.commit.repository.vo.DegreeVo;
import com.commit.service.DegreeService;

@RestController
@RequestMapping("/api/degree")
public class DegreeController {

	@Autowired
	private DegreeService degreeService;
	
//	GET : /api/degree
	@GetMapping("/{no}")
	public ResponseEntity<?> getAllItems(@PathVariable("no") int id) {
		DegreeVo degree = degreeService.degreeSelect(id);
		if(degree == null) {
			return ResponseEntity.status(401).body("테이블을 찾지 못함");
		}
		return ResponseEntity.ok(degree);
	}
	
	
	//	POST : /api/degree/insert -> 새로운 항목 생성
	// TODO : result에 담아놓고 쓰지 않은 이유 : 나중에 확인하기 위한 선조치 ( 확인할것 )
	@PostMapping("/insert")
	public ResponseEntity<DegreeVo> createDegree(@RequestBody DegreeVo degree) {
		int result = degreeService.degreeInsert(degree);
		return ResponseEntity.ok(degree);
	}

	
	// GET: /user/session
    @GetMapping("/all")
    public ResponseEntity<?> getDegrees() {
    	List<DegreeVo> degreeList = degreeService.selectAllDegree();
    	if (degreeList == null) {
			return ResponseEntity.status(401).body("유저를 못가져왔어요");
		}
        return ResponseEntity.ok(degreeList);
    }
}
