package com.uijin.mboard.board.service;

import com.uijin.mboard.board.entity.BoardPostEntity;
import com.uijin.mboard.board.model.BoardModel;
import com.uijin.mboard.board.repository.BoardPostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {

  private final BoardPostRepository boardPostRepository;

  public BoardModel.BoardPostDetailResponse addBoardPost(
          long boardId,
          BoardModel.BoardPostRequest boardPostRequest) {
    BoardPostEntity boardPostEntity = BoardPostEntity.toEntity(boardId, boardPostRequest);
    BoardPostEntity savedBoardPostEntity = boardPostRepository.save(boardPostEntity);

    return BoardModel.BoardPostDetailResponse.toResponse(savedBoardPostEntity);
  }
}
