package com.uijin.mboard.board.repository;

import com.uijin.mboard.board.entity.BoardPostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardPostRepository extends JpaRepository<BoardPostEntity, Long> {

}
