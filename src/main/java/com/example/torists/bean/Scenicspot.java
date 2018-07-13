package com.example.torists.bean;

import java.io.Serializable;
import java.util.Date;

public class Scenicspot implements Serializable {
    private Integer scenicspot_id;//景点编号id
    private String scenicspot_name;//景点名称
    private String scenicspot_content;//景点介绍
    private String scenicspot_pic;//图片

    public Scenicspot() {
    }

    public Scenicspot(Integer scenicspot_id) {
        this.scenicspot_id = scenicspot_id;
    }

    @Override
    public String toString() {
        return "Scenicspot{" +
                "scenicspot_id=" + scenicspot_id +
                ", scenicspot_name='" + scenicspot_name + '\'' +
                ", scenicspot_content='" + scenicspot_content + '\'' +
                ", scenicspot_pic='" + scenicspot_pic + '\'' +
                '}';
    }

    public Integer getScenicspot_id() {
        return scenicspot_id;
    }

    public void setScenicspot_id(Integer scenicspot_id) {
        this.scenicspot_id = scenicspot_id;
    }

    public String getScenicspot_name() {
        return scenicspot_name;
    }

    public void setScenicspot_name(String scenicspot_name) {
        this.scenicspot_name = scenicspot_name;
    }

    public String getScenicspot_content() {
        return scenicspot_content;
    }

    public void setScenicspot_content(String scenicspot_content) {
        this.scenicspot_content = scenicspot_content;
    }

    public String getScenicspot_pic() {
        return scenicspot_pic;
    }

    public void setScenicspot_pic(String scenicspot_pic) {
        this.scenicspot_pic = scenicspot_pic;
    }

    public Scenicspot(Integer scenicspot_id, String scenicspot_name, String scenicspot_content, String scenicspot_pic) {

        this.scenicspot_id = scenicspot_id;
        this.scenicspot_name = scenicspot_name;
        this.scenicspot_content = scenicspot_content;
        this.scenicspot_pic = scenicspot_pic;
    }

    public Scenicspot(String scenicspot_name, String scenicspot_content, String scenicspot_pic) {

        this.scenicspot_name = scenicspot_name;
        this.scenicspot_content = scenicspot_content;
        this.scenicspot_pic = scenicspot_pic;
    }
}
