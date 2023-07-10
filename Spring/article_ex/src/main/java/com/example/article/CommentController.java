package com.example.article;

import com.example.article.dto.CommentDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/articles/{articleId}/comments")
public class CommentController {
    private final CommentService service;

    // TODO 게시글 작성
    @PostMapping
    public CommentDto create(@PathVariable("articleId") Long articleId,
                             @RequestBody CommentDto dto) {
        return service.createComment(articleId, dto);
    }

    // TODO 게시글 댓글 전체 조회
    @GetMapping
    public List<CommentDto> readAll(@PathVariable("articleId") Long articleId) {
        return service.readCommentAll(articleId);
    }

    // TODO 게시글 댓글 수정
    @PutMapping("/{commentId}")
    public CommentDto updateAll(
            @PathVariable("articleId") Long articleId,
            @PathVariable("commentId") Long commentId,
            @RequestBody CommentDto dto
            ) {
        return service.updateComment(articleId, commentId, dto);
    }
    // TODO 게시글 댓글 삭제
    @DeleteMapping("/{commentId}")
    public void deleteComment(
            @PathVariable("articleId") Long articleId,
            @PathVariable("commentId") Long commentId) {
        service.deleteComment(articleId, commentId);
    }
}
