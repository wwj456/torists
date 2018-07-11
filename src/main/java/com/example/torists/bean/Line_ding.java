package com.example.torists.bean;

import java.io.Serializable;
import java.util.Date;

public class Line_ding implements Serializable {
    private Integer lined_id;//线路订单id
    private String lined_name;//线路订单名称

    private String lined_jointime;//开始时间
    private Integer t_id;//客户id

    @Override
    public String toString() {
        return "Line_ding{" +
                "lined_id=" + lined_id +
                ", lined_name='" + lined_name + '\'' +
                ", lined_jointime='" + lined_jointime + '\'' +
                ", t_id=" + t_id +
                '}';
    }

    public Integer getLined_id() {
        return lined_id;
    }

    public void setLined_id(Integer lined_id) {
        this.lined_id = lined_id;
    }

    public String getLined_name() {
        return lined_name;
    }

    public void setLined_name(String lined_name) {
        this.lined_name = lined_name;
    }

    public String getLined_jointime() {
        return lined_jointime;
    }

    public void setLined_jointime(String lined_jointime) {
        this.lined_jointime = lined_jointime;
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public Line_ding(Integer lined_id, String lined_name, String lined_jointime, Integer t_id) {

        this.lined_id = lined_id;
        this.lined_name = lined_name;
        this.lined_jointime = lined_jointime;
        this.t_id = t_id;
    }

    public Line_ding(String lined_name, String lined_jointime, Integer t_id) {

        this.lined_name = lined_name;
        this.lined_jointime = lined_jointime;
        this.t_id = t_id;
    }

    public Line_ding(Integer lined_id) {


        this.lined_id = lined_id;
    }

    public Line_ding() {

    }
}
