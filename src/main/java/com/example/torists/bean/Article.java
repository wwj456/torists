package com.example.torists.bean;

import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable {
    private Integer article_id;//新闻编号id
    private String article_title;//新闻标题
    private String articel_content;//新闻内容
    private String articel_author;//新闻作者
    private Integer articletype_id;//新闻类型id
    private Date add_date;//添加时间

    public Article() {
    }

    @Override
    public String toString() {
        return "Article{" +
                "article_id=" + article_id +
                ", article_title='" + article_title + '\'' +
                ", articel_content='" + articel_content + '\'' +
                ", articel_author='" + articel_author + '\'' +
                ", articletype_id=" + articletype_id +
                ", add_date=" + add_date +
                '}';
    }

    public Integer getArticle_id() {
        return article_id;
    }

    public void setArticle_id(Integer article_id) {
        this.article_id = article_id;
    }

    public String getArticle_title() {
        return article_title;
    }

    public void setArticle_title(String article_title) {
        this.article_title = article_title;
    }

    public String getArticel_content() {
        return articel_content;
    }

    public void setArticel_content(String articel_content) {
        this.articel_content = articel_content;
    }

    public String getArticel_author() {
        return articel_author;
    }

    public void setArticel_author(String articel_author) {
        this.articel_author = articel_author;
    }

    public Integer getArticletype_id() {
        return articletype_id;
    }

    public void setArticletype_id(Integer articletype_id) {
        this.articletype_id = articletype_id;
    }

    public Date getAdd_date() {
        return add_date;
    }

    public void setAdd_date(Date add_date) {
        this.add_date = add_date;
    }

    public Article(Integer article_id, String article_title, String articel_content, String articel_author, Integer articletype_id, Date add_date) {

        this.article_id = article_id;
        this.article_title = article_title;
        this.articel_content = articel_content;
        this.articel_author = articel_author;
        this.articletype_id = articletype_id;
        this.add_date = add_date;
    }

    public Article(String article_title, String articel_content, String articel_author, Integer articletype_id, Date add_date) {

        this.article_title = article_title;
        this.articel_content = articel_content;
        this.articel_author = articel_author;
        this.articletype_id = articletype_id;
        this.add_date = add_date;
    }

    public Article(Integer article_id) {

        this.article_id = article_id;
    }
}
