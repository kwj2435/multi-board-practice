package com.uijin.mboard.board.controller;

import com.uijin.mboard.board.model.BoardModel;
import com.uijin.mboard.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/board")
@RequiredArgsConstructor
public class BoardController {

  private final BoardService boardService;

  /**
   * 게시글 작성
   */
  @PostMapping("/{boardId}")
  public BoardModel.BoardPostDetailResponse addBoardPost(
          @PathVariable("boardId") long boardId,
          @RequestBody BoardModel.BoardPostRequest boardPostRequest) {
    return boardService.addBoardPost(boardId, boardPostRequest);
  }
}
