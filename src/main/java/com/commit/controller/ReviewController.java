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

import com.commit.repository.vo.ReviewVo;
import com.commit.service.ReviewService;

@RestController
@RequestMapping("/api/review")
public class ReviewController {

	@Autowired
	private ReviewService reviewService;
	
//	GET : /api/review
	@GetMapping
	public ResponseEntity<List<ReviewVo>> getAllItems() {
		List<ReviewVo> items = 
				reviewService.selectAllItems();
		return ResponseEntity.ok(items);
	}
	
	
//	id로 검색
	@GetMapping("/{id}")
    public ResponseEntity<ReviewVo> getItemById(@PathVariable Integer id) {
        ReviewVo item = reviewService.selectById(id);
        if (item != null) {
            return ResponseEntity.ok(item);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
	
	
	// 
	 @PostMapping
	    public ResponseEntity<ReviewVo> createItem(@RequestBody ReviewVo item) {
	        ReviewVo savedItem = reviewService.insertItem(item);
	        return ResponseEntity.ok(savedItem);    
	    }
	
}