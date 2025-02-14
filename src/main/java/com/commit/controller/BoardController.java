package com.commit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/board")
public class BoardController {

//	@Autowired
//	private CategoryService categoryService;
//	
//	@GetMapping
//	public ResponseEntity<List<CategoryVo>> getAllItems() {
//		
//		List<CategoryVo> items = categoryService.selectAllItems();
//		
//		return ResponseEntity.ok(items);
//	}
	
}
