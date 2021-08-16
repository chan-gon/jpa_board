package com.study.board.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> { // 테이블의 CRUD 쿼리를 자동으로 생성

	/*
	 * Entity 클래스와 Repository 인터페이스는 반드시 같은 패키지 내에 위치해야 한다.
	 * Jpa의 Repository는 MyBatis의 Mapper와 유사하다.
	 * JpaRepository<Entity 클래스 타입, PK 데이터 타입>
	 */
}
