package com.uijin.mboard.board.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PostStatus {
  NORMAL("정상"),
  HIDDEN("숨김"),
  DELETE("삭제");

  private String description;

}
