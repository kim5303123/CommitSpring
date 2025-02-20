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
import com.commit.service.BoardService;

@RestController
@RequestMapping("/api/board")
public class BoardController {

	@Autowired
	private BoardService boardService;
	
//	GET : /api/board
	@GetMapping
	public ResponseEntity<List<BoardVo>> getAllItems() {
		List<BoardVo> items = 
				boardService.selectAllItems();
		return ResponseEntity.ok(items);
	}
	
	
	
//	PUT : /api/board/{id} -> 기존 항목 수정
	@PutMapping("/{id}")
	public ResponseEntity<BoardVo> updateItem(@RequestBody BoardVo item,
			@PathVariable("id") Integer id) {
		item.setId(id);
		BoardVo updatedItem = boardService.updateItem(item);
		return ResponseEntity.ok(updatedItem);
	}
	
	
	
	
	
	
	
	
	
	
	
//	id로 검색
//	@GetMapping("/{id}")
//	public ResponseEntity<TodoItem> getTodoById(
//			@PathVariable("id") Long id) {
//		Optional<TodoItem> todo = todoRepository.findById(id);
//		return todo.map(ResponseEntity::ok)
//				.orElseGet(() -> ResponseEntity.notFound().build());
//	}
	
	
//	POST : /api/board -> 새로운 항목 생성
	@PostMapping
	public ResponseEntity<BoardVo> createItem(@RequestBody BoardVo item) {
		BoardVo savedItem = boardService.insertItem(item);
		return ResponseEntity.ok(savedItem);	
	}
	
//	DELETE : /api/board/{id} -> 기존 항목 삭제
	@DeleteMapping("/{id}")
	//	Body에 실어 보낼 내용이 없음 -> Void
	public ResponseEntity<Void> 
		deleteItem(@PathVariable("id") Integer id) {
		boardService.deleteItem(id);
		return ResponseEntity.ok().<Void>build();
	}
	
}