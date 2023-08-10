package com.example.tdd;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class ArticleRepositoryTests {
    @Autowired
    private ArticleRepository articleRepository;

    @Test
    public void articleRepositoryIsNotNull() {
        assertThat(articleRepository).isNotNull();
    }

    @Test
    public void createArticle() {
        // given: 기본배경
        Article article = new Article();
        article.setTitle("Hello!");
        article.setContent("TDD is hard");

        // when: 테스트하고 싶은 기능
        article = articleRepository.save(article);

        // then: 테스트의 동작이 기대한 대로 이뤄졌는지
        assertThat(article).isNotNull();
        assertThat(article.getId()).isNotNull();
        assertEquals("Hello!", article.getTitle());
        assertEquals("TDD is hard", article.getContent());
    }

    @Test
    public void findByTitleContains() {
        // given
        Article article = new Article();
        article.setTitle("Hello!");
        articleRepository.save(article);

        article = new Article();
        article.setTitle("Yellow");
        articleRepository.save(article);

        // when
        List<Article> res1
                = articleRepository.findAllByTitleContains("ell");
        List<Article> res2
                = articleRepository.findAllByTitleContains("He");
        List<Article> res3
                = articleRepository.findAllByTitleContains("A");

        // then
        assertEquals(2, res1.size());
        assertEquals(1, res2.size());
        assertEquals(0, res3.size());
    }
}
