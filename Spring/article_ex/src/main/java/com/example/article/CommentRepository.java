package com.example.article;

import com.example.article.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// JpaRepository<Select entity, ID type>
public interface CommentRepository extends JpaRepository<CommentEntity, Long> {
    // CommentEntity 중 articleId가 id인 CommentEntity만 반환하는 메서드
    List<CommentEntity> findAllByArticleId(Long id);
}
