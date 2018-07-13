package com.example.torists.service.Impl;

import com.example.torists.bean.Admin;
import com.example.torists.bean.Article;
import com.example.torists.repositroy.AdminRepositroy;
import com.example.torists.repositroy.ArticleRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.torists.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleRepositroy articleRepositroy;
    @Override
    public List<Article> findAllArticle() {
        return articleRepositroy.findAllArticle();
    }

    @Override
    public int addArticle(Article article) {
        return articleRepositroy.addArticle(article);
    }

    @Override
    public int updateArticle(Article article) {
        return articleRepositroy.updateArticle(article);
    }

    @Override
    public int deleteArticle(int article_id) {
        return articleRepositroy.deleteArticle(article_id);
    }


}
