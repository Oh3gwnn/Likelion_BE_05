package com.example.article;

import com.example.article.dto.CommentDto;
import com.example.article.entity.CommentEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service @RequiredArgsConstructor
public class CommentService {
    private final ArticleRepository articleRepository;
    private final CommentRepository commentRepository;

    public CommentDto createComment(Long articleId, CommentDto dto) {
        // articleId를 ID로 가진 ArticleEntity 존재하는지?
        if (!articleRepository.existsById(articleId))
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        CommentEntity newComment = new CommentEntity();
        newComment.setWriter(dto.getWriter());
        newComment.setContent(dto.getContent());
        newComment.setArticleId(dto.getArticleId());
        newComment = commentRepository.save(newComment);
        return CommentDto.fromEntity(newComment);
    }

    // TODO 게시글 댓글 전체 조회
    public List<CommentDto> readCommentAll(Long articleId) {
        List<CommentEntity> commentEntities = commentRepository.findAllByArticleId(articleId);
        List<CommentDto> commentList = new ArrayList<>();
        for (CommentEntity entity : commentEntities) {
            commentList.add(CommentDto.fromEntity(entity));
        }
        return commentList;
    }

    // TODO 게시글 댓글 수정
    // TODO 게시글 댓글 삭제
}
