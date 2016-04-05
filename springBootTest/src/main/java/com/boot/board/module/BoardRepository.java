package com.boot.board.module;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.board.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
	Board findByName(String name);
}
