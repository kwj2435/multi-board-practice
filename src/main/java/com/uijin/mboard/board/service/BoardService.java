package com.uijin.mboard.board.service;

import com.uijin.mboard.board.repository.BoardContentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {

  private final BoardContentRepository boardContentRepository;

  private void getBoardList() {

  }
}
