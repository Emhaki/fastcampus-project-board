package com.fastcampus.projectboard.dto;

import com.fastcampus.projectboard.domain.Article;

import java.io.Serializable;
import java.time.LocalDateTime;

public record ArticleDto(
) implements Serializable {
    public static ArticleDto of(LocalDateTime createdAt, String createdBy, String title, String content, String hashtag) {
        return new ArticleDto();
    }

//    public static ArticleDto from(Article entity) {
//        return new ArticleDto(
//
//        )
//    }
}
