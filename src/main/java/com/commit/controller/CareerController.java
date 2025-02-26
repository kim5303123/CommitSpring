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
	// TODO : result에 담아놓고 쓰지 않은 이유 : 나중에 확인하기 위한 선조치 ( 확인할것 )
	@PostMapping("/insert")
	public ResponseEntity<CareerVo> createCareer(@RequestBody CareerVo career) {
		int result = careerService.careerInsert(career);
		return ResponseEntity.ok(career);	
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
