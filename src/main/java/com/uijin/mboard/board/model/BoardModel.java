package com.uijin.mboard.board.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BoardModel {

  public static class PostInfo {
    private String postId;

    private String title;

    private long viewCount;

    private String writer;

    private LocalDateTime createdTime;
  }
}
