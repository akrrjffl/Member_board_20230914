package com.icia.member.service;

import com.icia.member.dto.BoardDTO;
import com.icia.member.dto.CommentDTO;
import com.icia.member.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public boolean save(BoardDTO boardDTO) {
        int result = commentRepository.save(boardDTO);
        if (result > 0) {
            return true;
        } else {
            return false;
        }
    }

    public List<BoardDTO> findAll(Long id) {
        return commentRepository.findAll(id);
    }


}
