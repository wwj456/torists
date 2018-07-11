package com.example.torists.bean;

import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable {
    private Integer article_id;//新闻编号id
    private String article_title;//新闻标题
    private String articel_content;//新闻内容
    private Date add_date;//添加时间

    public Article() {
    }

    public Article(Integer article_id) {
        this.article_id = article_id;
    }

    public Article(Integer article_id, String article_title, String articel_content, Date add_date) {
        this.article_id = article_id;
        this.article_title = article_title;
        this.articel_content = articel_content;
        this.add_date = add_date;
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



    public Date getAdd_date() {
        return add_date;
    }

    public void setAdd_date(Date add_date) {
        this.add_date = add_date;
    }

    @Override
    public String toString() {
        return "Article{" +
                "article_id=" + article_id +
                ", article_title='" + article_title + '\'' +
                ", articel_content='" + articel_content + '\'' +
                ", add_date=" + add_date +
                '}';
    }
}
