package com.example.torists.bean;

import java.io.Serializable;

public class Articletype implements Serializable {
    private Integer articletype_id;//新闻类型id
    private String articletype_name;//新闻类型名称

    @Override
    public String toString() {
        return "Articletype{" +
                "articletype_id=" + articletype_id +
                ", articletype_name='" + articletype_name + '\'' +
                '}';
    }

    public Integer getArticletype_id() {
        return articletype_id;
    }

    public void setArticletype_id(Integer articletype_id) {
        this.articletype_id = articletype_id;
    }

    public String getArticletype_name() {
        return articletype_name;
    }

    public void setArticletype_name(String articletype_name) {
        this.articletype_name = articletype_name;
    }

    public Articletype(Integer articletype_id, String articletype_name) {

        this.articletype_id = articletype_id;
        this.articletype_name = articletype_name;
    }

    public Articletype(String articletype_name) {

        this.articletype_name = articletype_name;
    }

    public Articletype(Integer articletype_id) {

        this.articletype_id = articletype_id;
    }

    public Articletype() {

    }
}
