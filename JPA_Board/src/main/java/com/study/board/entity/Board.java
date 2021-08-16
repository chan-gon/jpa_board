package com.study.board.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter

//해당 클래스의 기본 생성자를 생성. access 속성을 이용해 동일 패키지 내의 클래스에서만 객체를 생성할 수 있도록 제어한다.
@NoArgsConstructor(access = AccessLevel.PROTECTED) 
@Entity
public class Board { // Entity 클래스
	
	/*
	 * @Setter가 없는 이유
	 * Entity 클래스는 테이블 그 자체. 각 멤버 변수는 해당 테이블의 칼럼이다. 
	 * 칼럼에 대한 setter를 무작정 생성 할 경우 객체의 값이 어느 시점에 변경되었는지 알 수가 없다.
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String content;
	private String writer;
	private int hits;
	private char deleteYn;
	private LocalDateTime createdDate = LocalDateTime.now();
	private LocalDateTime modifiedDate;
	
	@Builder // 생성자 대신 이용하는 패턴
	public Board(String title, String content, String writer, int hits, char deleteYn) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.hits = hits;
		this.deleteYn = deleteYn;
	}
}
