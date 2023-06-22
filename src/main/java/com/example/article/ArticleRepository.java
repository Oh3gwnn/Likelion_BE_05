package com.example.article;

import com.example.article.entity.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository
        extends JpaRepository<ArticleEntity, Long> {
    // ID 큰 순서대로 최상위 20개
    List<ArticleEntity> findTop20ByOrderByIdDesc();
}
