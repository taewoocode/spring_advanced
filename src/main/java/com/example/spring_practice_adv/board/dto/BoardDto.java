package com.example.spring_practice_adv.board.dto;

import com.example.spring_practice_adv.board.entity.Board;
import com.example.spring_practice_adv.board.entity.Category;

public class BoardDto {

	private Long id;
	private String title;
	private String content;
	private Long writerId;
	private Category category;

	public static BoardDto fromEntity(Board board) {
		BoardDto dto = new BoardDto();
		dto.id = board.getId();
		dto.title = board.getTitle();
		dto.content = board.getContent();
		dto.writerId = board.getWriterId();
		dto.category = board.getCategory();
		return dto;
	}
}
