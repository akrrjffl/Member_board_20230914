package com.icia.member.repository;

import com.icia.member.dto.BoardDTO;
import com.icia.member.dto.CommentDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CommentRepository {
    @Autowired
    private SqlSessionTemplate sql;

    public int save(BoardDTO boardDTO) {
        return sql.insert("Comment.save", boardDTO);
    }

    public List<BoardDTO> findAll(Long id) {
        return sql.selectList("Comment.findAll", id);
    }


}
