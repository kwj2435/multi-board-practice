package com.uijin.mboard.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardViewController {

  @GetMapping("/list")
  public String getBoardList(Model model) {

    return "/board/boardList";
  }
}
