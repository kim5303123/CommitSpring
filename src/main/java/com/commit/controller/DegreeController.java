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

import com.commit.repository.vo.BoardVo;
import com.commit.repository.vo.DegreeVo;
import com.commit.service.DegreeService;

@RestController
@RequestMapping("/api/degree")
public class DegreeController {

	@Autowired
	private DegreeService degreeService;
	
	//GET : /api/degree
	@GetMapping("/{no}")
	public ResponseEntity<DegreeVo> getAllItems(@PathVariable("no") int id) {
		DegreeVo degree = degreeService.degreeSelect(id);
		return ResponseEntity.ok(degree);
	}
	
	//POST : /api/degree
	@PostMapping
	public ResponseEntity<DegreeVo> createDegree(@RequestBody DegreeVo degree) {
		int result = degreeService.degreeInsert(degree);
		return ResponseEntity.ok(degree);
	}
}
