package com.example.article;

import com.example.article.dto.ArticleDto;
import com.example.article.entity.ArticleEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j @RequiredArgsConstructor
@RestController @RequestMapping("/articles")
public class ArticleController {
    private final ArticleService service;

    // POST /articles
    @PostMapping("")
    public ArticleDto create(@RequestBody ArticleDto dto) {
        return service.createArticle(dto);
    }

    // GET /articles
    @GetMapping("")
    public List<ArticleDto> readAll() {
        return service.readArticleAll();
    }

    // GET /articles/{id}
    @GetMapping("/{id}")
    public ArticleDto read(@PathVariable("id") Long id) {
        return service.readArticle(id);
    }

    // PUT /articles/{id}
    @PutMapping("/{id}")
    public ArticleDto update(@PathVariable("id") Long id,
                             @RequestBody ArticleDto dto) {
        return service.updateArticle(id, dto);
    }

    // DELETE /articles/{id}
    @DeleteMapping("/{id}")
    public void delete(
            @PathVariable("id") Long id
    ) {
        service.deleteArticle(id);
    }

    @GetMapping("/page-test")
    public Page<ArticleDto> readPageTest() {
        return service.readArticlePaged();
    }
}
