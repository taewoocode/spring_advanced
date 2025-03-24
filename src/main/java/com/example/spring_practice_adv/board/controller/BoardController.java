package com.example.spring_practice_adv.board.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_practice_adv.board.dto.BoardDto;
import com.example.spring_practice_adv.board.response.BoardListResponse;
import com.example.spring_practice_adv.board.service.BoardService;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
@Slf4j
public class BoardController {

	private final BoardService boardService;

	/**
	 * 게시판 상세 조회
	 */
	@Operation(summary = "게시판 상세조회", description = "게시판 목록을 상세조회한다.")
	@GetMapping("/{id}")
	public ResponseEntity<BoardDto> getBoardById(@PathVariable Long id) {
		return null;
	}

	/**
	 * 게시판 목록 조회
	 */
	@Operation(summary = "게시판 목록조회", description = "게시판 목록을 목록을 조회한다.")
	@GetMapping
	public ResponseEntity<List<BoardListResponse>> getBoards() {
		List<BoardListResponse> boards = boardService.getAllBoards();
		return ResponseEntity.ok(boards);
	}

	/**
	 * 게시글 수정
	 */
	@PutMapping("/{id}")
	@Operation(summary = "게시글 수정", description = "게시글을 수정한다.")
	public ResponseEntity<BoardDto> updateBoard(@PathVariable Long id) {
		return null;
	}

	/**
	 * 게시글 삭제
	 */
	@DeleteMapping("{id}")
	@Operation(summary = "게시글 삭제", description = "게시글을 삭제한다.")
	public ResponseEntity<Void> deleteBoard(@PathVariable Long id) {
		return null;
	}
}
