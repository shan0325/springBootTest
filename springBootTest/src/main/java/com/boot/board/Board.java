package com.boot.board;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Board {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;		//게시판 식별번호
	private String name;	//게시판 이름
	private Date createdAt;	//게시판 생성 날짜
	
	protected Board() {}
	
	public Board(String name) {
		this.name = name;
		this.createdAt = new Date();
	}
	
	public Post write(String author, String title, String content) {
		return new Post(this, author, title, content);
	}

	public String getName() {
		return name;
	}

	public Date getCreatedAt() {
		return createdAt;
	}
	
	
	
	
}
