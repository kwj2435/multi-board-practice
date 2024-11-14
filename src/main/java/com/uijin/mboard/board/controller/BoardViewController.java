package com.uijin.mboard.board.controller;

import com.uijin.mboard.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardViewController {

  private final BoardService boardService;

  @GetMapping("/list")
  public String getBoardList(Model model) {

    return "/board/boardList";
  }
}
