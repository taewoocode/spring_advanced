package com.example.spring_practice_adv.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_practice_adv.board.entity.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
}
