package com.uijin.mboard.board.entity;

import com.uijin.mboard.board.enums.PostStatus;
import com.uijin.mboard.board.model.BoardModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "BOARD_POST")
public class BoardPostEntity {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "BOARD_POST_ID")
  private Long boardPostId;

  @Column(name = "BOARD_ID")
  private long boardId;

  @Column(name = "TITLE")
  private String title;

  @Column(name = "BOARD_CONTENT")
  private String boardContent;

  @Column(name = "MEMBER_ID")
  private long memberId;

  @Column(name = "POST_STATUS")
  @Enumerated(EnumType.STRING)
  private PostStatus postStatus;

  @Column(name = "VIEW_COUNT")
  private long viewCount;

  @Column(name = "CREATED_TIME")
  private LocalDateTime createdTime;

  @Column(name = "UPDATED_TIME")
  private LocalDateTime updatedTime;

  public static BoardPostEntity toEntity(long boardId, BoardModel.BoardPostRequest boardPostRequest) {
    return BoardPostEntity.builder()
            .boardId(boardId)
            .title(boardPostRequest.getBoardTitle())
            .boardContent(boardPostRequest.getBoardContent())
            .memberId(boardPostRequest.getMemberId())
            .postStatus(PostStatus.NORMAL)
            .build();
  }
}
