package com.example.spring_practice_adv.board.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.example.spring_practice_adv.board.entity.Board;
import com.example.spring_practice_adv.board.repository.BoardRepository;
import com.example.spring_practice_adv.board.response.BoardListResponse;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {

	private final BoardRepository boardRepository;

	public List<BoardListResponse> getAllBoards() {
		List<Board> findBoard = boardRepository.findAll();
		Stream<Board> stream = findBoard.stream();
		Stream<BoardListResponse> boardEntity = stream.map(BoardListResponse::fromEntity);
		return boardEntity.collect(Collectors.toList());
	}
}
