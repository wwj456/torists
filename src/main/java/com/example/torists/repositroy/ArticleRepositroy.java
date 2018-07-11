package com.example.torists.repositroy;

import com.example.torists.bean.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ArticleRepositroy {

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
    int addArticle(@Param("a") Article article);

    /**
     * 修改新闻
     * @param article
     * @return
     */
    int updateArticle(@Param("a")Article article);

    /**
     * 删除新闻
     * @param article_id
     * @return
     */
    int deleteArticle(@Param("a")int article_id);


}
