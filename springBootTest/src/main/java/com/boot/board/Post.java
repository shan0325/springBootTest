package com.boot.board;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Post {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;		//게시글 식별번호
	private String author;	//작성자
	private String title;	//제목
	private String content;	//내용
	private Date createdAt; //작성일
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private Board board;	//게시판(게시글을 담게 될...)
	
	protected Post() { }
	
	protected Post(Board board, String author, String title, String content) {
		this.author = author;
		this.title = title;
		this.content = content;
		this.createdAt = new Date();
		
		this.board = board;
	}
	
	public Post update(String author, String title, String content) {
		this.author = author;
		this.title = title;
		this.content = content;
		
		return this;
	}

	public Long getId() {
		return id;
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	protected Board getBoard() {
		return board;
	}
	
	
}
