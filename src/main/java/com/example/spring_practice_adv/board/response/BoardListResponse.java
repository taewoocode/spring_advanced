package com.example.spring_practice_adv.board.response;

import java.time.LocalDateTime;

import com.example.spring_practice_adv.board.entity.Board;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BoardListResponse {
	private Long id;
	private String title;
	private String categoryName;
	private String writerName;
	private LocalDateTime createdAt;

	public static BoardListResponse fromEntity(Board board) {
		BoardListResponse response = new BoardListResponse();
		response.id = board.getId();
		response.title = board.getTitle();
		response.categoryName = "board";
		response.writerName = "taewoo";
		response.createdAt = board.getCreatedAt();
		return response;
	}
}