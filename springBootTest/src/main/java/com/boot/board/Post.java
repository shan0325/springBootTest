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
	private Long id;		//�Խñ� �ĺ���ȣ
	private String author;	//�ۼ���
	private String title;	//����
	private String content;	//����
	private Date createdAt; //�ۼ���
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private Board board;	//�Խ���(�Խñ��� ��� ��...)
	
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
