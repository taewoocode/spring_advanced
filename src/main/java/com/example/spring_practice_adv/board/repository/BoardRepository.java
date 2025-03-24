package com.example.spring_practice_adv.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring_practice_adv.board.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
