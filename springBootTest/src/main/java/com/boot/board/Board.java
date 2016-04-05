package com.boot.board;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Board {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;		//�Խ��� �ĺ���ȣ
	private String name;	//�Խ��� �̸�
	private Date createdAt;	//�Խ��� ���� ��¥
	
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
