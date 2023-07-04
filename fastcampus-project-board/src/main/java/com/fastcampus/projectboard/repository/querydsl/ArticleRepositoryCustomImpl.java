package com.fastcampus.projectboard.repository.querydsl;

import com.fastcampus.projectboard.domain.Article;
import com.fastcampus.projectboard.repository.ArticleRepository;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

public class ArticleRepositoryCustomImpl extends QuerydslRepositorySupport implements ArticleRepositoryCustom {

    public ArticleRepositoryCustomImpl() {
        super(Article.class);
    }

//    @Override
//    public List<String> findAllDistinctHashtags() {
////        Article article = Article.article;
////
////        JPQLQuery<String> query = from(article)
////                .distinct()
//    }

    @Override
    public List<String> findAllDistincHashtags() {
        return null;
    }
}
