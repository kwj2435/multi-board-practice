package com.uijin.mboard.board.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
public class BoardContentEntity {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long boardContentId;

  private long boardId;

  private String title;

  private String boardContent;

  private long memberId;

  private String contentStatus;

  private LocalDateTime createdTime;

  private LocalDateTime updatedTime;
}
