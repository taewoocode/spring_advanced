package com.example.spring_practice_adv.board.request;

import lombok.Getter;

@Getter
public class BoardListRequest {
	private String keyword;
	private String category;
}