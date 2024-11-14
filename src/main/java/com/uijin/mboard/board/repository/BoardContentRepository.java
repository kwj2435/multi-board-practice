package com.uijin.mboard.board.repository;

import com.uijin.mboard.board.entity.BoardContentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardContentRepository extends JpaRepository<BoardContentEntity, Long> {

}
