package com.fastcampus.projectboard.domain;

import java.time.LocalDateTime;

public class Article {
    private Long id;
    private String title;
    private String hashtag;

    private LocalDateTime createdAt;
    private String createBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;

    public static Article of(String newArticle, String newContent, String hashtag) {
        return null;
    }
}
