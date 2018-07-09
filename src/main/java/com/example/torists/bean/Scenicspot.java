package com.example.torists.bean;

import java.io.Serializable;
import java.util.Date;

public class Scenicspot implements Serializable {
    private Integer scenicspot_id;//景点编号id
    private String scenicspot_name;//景点名称
    private String scenicspot_content;//景点介绍
    private String add_date;//添加时间
    private Scenicspotpic scenicspotpic;

    public Scenicspot() {
    }

    public Scenicspot(Integer scenicspot_id) {
        this.scenicspot_id = scenicspot_id;
    }

    public Scenicspot(Integer scenicspot_id, String scenicspot_name, String scenicspot_content, String add_date, Scenicspotpic scenicspotpic) {
        this.scenicspot_id = scenicspot_id;
        this.scenicspot_name = scenicspot_name;
        this.scenicspot_content = scenicspot_content;
        this.add_date = add_date;
        this.scenicspotpic = scenicspotpic;
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

    public String getAdd_date() {
        return add_date;
    }

    public void setAdd_date(String add_date) {
        this.add_date = add_date;
    }

    public Scenicspotpic getScenicspotpic() {
        return scenicspotpic;
    }

    public void setScenicspotpic(Scenicspotpic scenicspotpic) {
        this.scenicspotpic = scenicspotpic;
    }

    @Override
    public String toString() {
        return "Scenicspot{" +
                "scenicspot_id=" + scenicspot_id +
                ", scenicspot_name='" + scenicspot_name + '\'' +
                ", scenicspot_content='" + scenicspot_content + '\'' +
                ", add_date='" + add_date + '\'' +
                ", scenicspotpic=" + scenicspotpic +
                '}';
    }
}
