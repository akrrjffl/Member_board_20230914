package com.icia.member.controller;
import com.icia.member.dto.BoardDTO;
import com.icia.member.dto.CommentDTO;
import com.icia.member.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/board")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("/save")
    public String saveForm() {
        return "/boardPages/boardSave";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute BoardDTO boardDTO) {
        boolean result = commentService.save(boardDTO);
        if (result) {
            return "/memberPages/memberMain";
        } else {
            return "/memberPages/memberMain";
        }
    }
}
