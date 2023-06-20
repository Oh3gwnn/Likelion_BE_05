package com.example.http.dto;

import lombok.Data;

import java.util.List;

//{
//    "title": "JSON",
//    "content": "Javascript Object Notation",
//    "writer": "John",
//    "comments": [
//        "hello",
//        "nice job",
//        "have a good day"
//    ]
//}

@Data
public class ArticleWithCommentsDto {
    private String title;
    private String content;
    private String writer;
    private List<String> comments;
}
