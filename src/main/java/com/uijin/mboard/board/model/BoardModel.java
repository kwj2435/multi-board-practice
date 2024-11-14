package com.uijin.mboard.board.model;

import com.uijin.mboard.board.entity.BoardPostEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

public class BoardModel {

  /**
   * 게시글 리스트 Response
   */
  @Getter
  @Builder
  @AllArgsConstructor
  @NoArgsConstructor
  public static class PostPreviewListRes {
    private long boardId;

    private List<BoardPostPreviewDto> boardPostPreviewDtoList;
  }

  /**
   * 게시글 정보 DTO
   */
  @Getter
  @Builder
  @AllArgsConstructor
  @NoArgsConstructor
  public static class BoardPostPreviewDto {
    private long postId;

    private String title;

    private long viewCount;

    private String writer;

    private LocalDateTime createdTime;

    public BoardPostPreviewDto toDto(BoardPostEntity boardPostEntity) {
      return BoardPostPreviewDto.builder()
              .postId(boardPostEntity.getBoardPostId())
              .title(boardPostEntity.getTitle())
              .viewCount(boardPostEntity.getViewCount())
              //fixme 회원 테이블 연관관계 처리후 정보 가져오기
              .writer(String.valueOf(boardPostEntity.getMemberId()))
              .build();
    }
  }

  /**
   * 게시글 등록 Request
   */
  @Getter
  public static class BoardPostRequest {
    private long memberId;

    private String boardTitle;

    private String boardContent;
  }

  /**
   * 게시글 상세 Response
   */

  @Getter
  @Builder
  @AllArgsConstructor
  @NoArgsConstructor
  public static class BoardPostDetailResponse {
    private long boardId;

    private long boardPostId;

    private String title;

    private String boardContent;

    private String writer;

    private long viewCount;

    private LocalDateTime createdTime;

    private LocalDateTime updatedTime;

    public static BoardPostDetailResponse toResponse(BoardPostEntity boardPostEntity) {
      return BoardPostDetailResponse.builder()
              .boardId(boardPostEntity.getBoardId())
              .boardPostId(boardPostEntity.getBoardPostId())
              .title(boardPostEntity.getTitle())
              .boardContent(boardPostEntity.getBoardContent())
              .writer(String.valueOf(boardPostEntity.getMemberId()))
              .viewCount(boardPostEntity.getViewCount())
              .createdTime(boardPostEntity.getCreatedTime())
              .updatedTime(boardPostEntity.getUpdatedTime())
              .build();
    }
  }
}
