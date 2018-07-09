package com.example.torists.bean;

import java.io.Serializable;
import java.util.Date;

public class Scenicspotpic implements Serializable {

        private Integer pic_id;//景点图片编号id
        private String pic_url;//景点图片路径
        private String pic_name;//景点图片名称
        private Date add_date;//添加时间
        private Integer scenicspot_id;//景点id

    public Scenicspotpic() {
    }

    public Scenicspotpic(Integer pic_id) {
        this.pic_id = pic_id;
    }

    public Scenicspotpic(Integer pic_id, String pic_url, String pic_name, Date add_date, Integer scenicspot_id) {
        this.pic_id = pic_id;
        this.pic_url = pic_url;
        this.pic_name = pic_name;
        this.add_date = add_date;
        this.scenicspot_id = scenicspot_id;
    }

    public Integer getPic_id() {
        return pic_id;
    }

    public void setPic_id(Integer pic_id) {
        this.pic_id = pic_id;
    }

    public String getPic_url() {
        return pic_url;
    }

    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }

    public String getPic_name() {
        return pic_name;
    }

    public void setPic_name(String pic_name) {
        this.pic_name = pic_name;
    }

    public Date getAdd_date() {
        return add_date;
    }

    public void setAdd_date(Date add_date) {
        this.add_date = add_date;
    }

    public Integer getScenicspot_id() {
        return scenicspot_id;
    }

    public void setScenicspot_id(Integer scenicspot_id) {
        this.scenicspot_id = scenicspot_id;
    }

    @Override
    public String toString() {
        return "Scenicspotpic{" +
                "pic_id=" + pic_id +
                ", pic_url='" + pic_url + '\'' +
                ", pic_name='" + pic_name + '\'' +
                ", add_date=" + add_date +
                ", scenicspot_id=" + scenicspot_id +
                '}';
    }
}
