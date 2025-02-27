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

import com.commit.repository.vo.CareerVo;
import com.commit.service.CareerService;

@RestController
@RequestMapping("/api/career")
public class CareerController {

	@Autowired
	private CareerService careerService;
	
	//	GET : /api/career/{id}
	@GetMapping("/{no}")
	public ResponseEntity<CareerVo> getAllItems(@PathVariable("no") int id) {
		CareerVo career = careerService.careerSelect(id);
		return ResponseEntity.ok(career);
	}
	
	
	//	POST : /api/career/insert -> 새로운 항목 생성
	@PostMapping("/insert")
	public ResponseEntity<String> createCareer(@RequestBody CareerVo career) {
		int result = careerService.careerInsert(career);		
		if (result > 0) {
            return ResponseEntity.ok("리뷰가 성공적으로 등록되었습니다.");
        } else {
            return ResponseEntity.badRequest().body("리뷰 등록에 실패했습니다.");
        }	
	}
	

	//	PUT : /api/career/modify/{id} -> 기존 항목 수정
	@PutMapping("/modify")
	public ResponseEntity<CareerVo> updateCareer(@RequestBody CareerVo career) {
		CareerVo careerUpdate = careerService.careerUpdate(career);
		return ResponseEntity.ok(careerUpdate);
	}
	
	 @GetMapping("/all")
	    public ResponseEntity<?> getCareers() {
	    	List<CareerVo> CareerList = careerService.selectAllCareer();
	    	if (CareerList == null) {
				return ResponseEntity.status(401).body("유저를 못가져왔어요");
			}
	        return ResponseEntity.ok(CareerList);
	    }
	
}
