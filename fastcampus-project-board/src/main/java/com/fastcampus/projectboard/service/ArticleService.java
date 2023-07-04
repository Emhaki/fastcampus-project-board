package com.fastcampus.projectboard.service;

import com.fastcampus.projectboard.domain.Article;
import com.fastcampus.projectboard.domain.type.SearchType;
import com.fastcampus.projectboard.dto.ArticleDto;
import com.fastcampus.projectboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.function.Function;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

//    @Transactional(readOnly = true)
//    public Page<ArticleDto> searchArticles(SearchType title, String search_keyword) {
////        if (search_keyword == null || search_keyword.isBlank()) {
////            return articleRepository.findAll(Pageable.unpaged()).map(ArticleDto::from);
////        }
////        switch () {
////            case TITLE ->
////        }
//    }

    @Transactional(readOnly = true)
    public ArticleDto searchArticle(long l) {
        return null;
    }

    public List<String> getHashtags() {
        return articleRepository.findAllDistincHashtags();
    }
}
