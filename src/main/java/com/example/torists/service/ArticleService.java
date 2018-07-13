package com.example.torists.service;

import com.example.torists.bean.Article;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ArticleService {

        /**
         * 查询全部新闻
         * @return
         */
        List<Article> findAllArticle();

        /**
         * 添加新闻
         * @param article
         * @return
         */
        int addArticle(Article article);

        /**
         * 修改新闻
         * @param article
         * @return
         */
        int updateArticle(Article article);

        /**
         * 删除新闻
         * @param article_id
         * @return
         */
        int deleteArticle(int article_id);

        /**
         * 根据新闻类型查询新闻
         * @param articletype_id
         * @return
         */

}
