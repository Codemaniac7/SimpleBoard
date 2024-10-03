package com.example.simple_board.post.service;

import com.example.simple_board.post.db.PostEntity;
import com.example.simple_board.post.model.PostDTO;
import org.springframework.stereotype.Service;

@Service
public class PostConverter {
    public PostDTO toDTO(PostEntity postEntity) {
        return PostDTO.builder()
                .id(postEntity.getId())          // ID 설정
                .userName(postEntity.getUserName()) // 사용자 이름 설정
                .password(postEntity.getPassword())
                .email(postEntity.getEmail())
                .status(postEntity.getStatus())
                .title(postEntity.getTitle())    // 제목 설정
                .content(postEntity.getContent()) // 내용 설정
                .postedAt(postEntity.getPostedAt())
                .boardId(postEntity.getBoard().getId())
                .build();
    }
}