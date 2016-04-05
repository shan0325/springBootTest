package com.boot.board.module;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.board.Board;
import com.boot.board.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
	List<Post> findByBoard(Board board);
}
