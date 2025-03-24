package com.example.spring_practice_adv.board.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Board {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 255)
	private String title;

	@Column(nullable = false, columnDefinition = "TEXT")
	private String content;

	@Column(name = "WRITER_ID", nullable = false)
	private Long writerId;

	/**
	 * Board (N): 여러 개의 게시글(Board)이 존재할 수 있습니다.
	 * Category는 다대일 관계를 맺습니다.
	 * Board 테이블에서 CATEGORY_ID를 외래키로 사용합니다.
	 * 이 컬럼이 Category 테이블의 id 컬럼을 참조하도록 합니다.
	 */
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "CATEGORY_ID", nullable = false)
	private Category category;

	@CreationTimestamp
	@Column(name = "CREATED_AT", updatable = false, nullable = false)
	private LocalDateTime createdAt;

	@UpdateTimestamp
	@Column(name = "UPDATED_AT", nullable = false)
	private LocalDateTime updatedAt;

	@Builder
	public Board(String title, String content, Long writerId, Category category) {
		this.title = title;
		this.content = content;
		this.writerId = writerId;
		this.category = category;
	}
}
