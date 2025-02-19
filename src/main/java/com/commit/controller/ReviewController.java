package com.commit.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	
//	POST : /api/review -> 새로운 항목 생성
//	@PostMapping
//	public ResponseEntity<ReviewVo> createItem(@RequestBody ReviewVo item) {
//		ReviewVo savedItem = reviewService.insertItem(item);
//		return ResponseEntity.ok(savedItem);	
//	}
	
	
	
	// 테스트 추가
	 @PostMapping
	    public ResponseEntity<ReviewVo> createItem(@RequestBody ReviewVo item) {
	        ReviewVo savedItem = reviewService.insertItem(item);
	        return ResponseEntity.ok(savedItem);    
	    }
	
	
	
	
	
	/////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////
	
	
	
	
	
	
	
	
	
//	PUT : /api/board/{id} -> 기존 항목 수정
	@PutMapping("/{id}")
	public ResponseEntity<ReviewVo> updateItem(@RequestBody ReviewVo item,
			@PathVariable("id") Integer id) {
		item.setId(id);
		ReviewVo updatedItem = reviewService.updateItem(item);
		return ResponseEntity.ok(updatedItem);
	}
	
//	DELETE : /api/board/{id} -> 기존 항목 삭제
	@DeleteMapping("/{id}")
	//	Body에 실어 보낼 내용이 없음 -> Void
	public ResponseEntity<Void> 
		deleteItem(@PathVariable("id") Integer id) {
		reviewService.deleteItem(id);
		return ResponseEntity.ok().<Void>build();
	}
	
}