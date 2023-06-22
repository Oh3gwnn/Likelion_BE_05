package com.example.article;

import com.example.article.dto.CommentDto;
import com.example.article.entity.CommentEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        newComment.setArticleId(articleId);
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
    // 수정하고자 하는 댓글이 지정한 게시글에 있는지 확인할 목적으로 articleId도 첨부
    public CommentDto updateComment(
            Long articleId, Long commentId, CommentDto dto) {
        // 요청 댓글 존재 유무
        Optional<CommentEntity> optionalComment = commentRepository.findById(commentId);

        // 존재 X -> exception
        if (optionalComment.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        // 대상 댓글 == 대상 게시글의 댓글인지
        CommentEntity comment = optionalComment.get();
        if (!articleId.equals(comment.getArticleId()))
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);

        comment.setContent(dto.getContent());
        comment.setWriter(dto.getWriter());
        return CommentDto.fromEntity(commentRepository.save(comment));
    }

    // TODO 게시글 댓글 삭제
    public void deleteComment(Long articleId, Long commentId) {
        Optional<CommentEntity> optionalComment = commentRepository.findById(commentId);

        if (optionalComment.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        CommentEntity comment = optionalComment.get();
        if (!articleId.equals(comment.getArticleId()))
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);

        commentRepository.deleteById(commentId);
    }
}
