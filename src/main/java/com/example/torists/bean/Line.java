package com.example.torists.bean;

import java.io.Serializable;

public class Line implements Serializable {
    private Integer line_id;//线路id
    private String line_type;//线路类型
    private String line_name;//线路名称

    private String line_shuoming;//线路说明
    private double line_price;//线路价格
    private String line_pic;//线路图片
    private Integer lined_id;//线路订单id
    private Line_ding line_ding;//线路订单所属对象

    public Line() {
    }

    public Line(Integer line_id) {
        this.line_id = line_id;
    }

    @Override
    public String toString() {
        return "Line{" +
                "line_id=" + line_id +
                ", line_type='" + line_type + '\'' +
                ", line_name='" + line_name + '\'' +
                ", line_shuoming='" + line_shuoming + '\'' +
                ", line_price=" + line_price +
                ", line_pic='" + line_pic + '\'' +
                ", lined_id=" + lined_id +
                ", line_ding=" + line_ding +
                '}';
    }

    public Integer getLine_id() {
        return line_id;
    }

    public void setLine_id(Integer line_id) {
        this.line_id = line_id;
    }

    public String getLine_type() {
        return line_type;
    }

    public void setLine_type(String line_type) {
        this.line_type = line_type;
    }

    public String getLine_name() {
        return line_name;
    }

    public void setLine_name(String line_name) {
        this.line_name = line_name;
    }

    public String getLine_shuoming() {
        return line_shuoming;
    }

    public void setLine_shuoming(String line_shuoming) {
        this.line_shuoming = line_shuoming;
    }

    public double getLine_price() {
        return line_price;
    }

    public void setLine_price(double line_price) {
        this.line_price = line_price;
    }

    public String getLine_pic() {
        return line_pic;
    }

    public void setLine_pic(String line_pic) {
        this.line_pic = line_pic;
    }

    public Integer getLined_id() {
        return lined_id;
    }

    public void setLined_id(Integer lined_id) {
        this.lined_id = lined_id;
    }

    public Line_ding getLine_ding() {
        return line_ding;
    }

    public void setLine_ding(Line_ding line_ding) {
        this.line_ding = line_ding;
    }

    public Line(Integer line_id, String line_type, String line_name, String line_shuoming, double line_price, String line_pic, Integer lined_id, Line_ding line_ding) {

        this.line_id = line_id;
        this.line_type = line_type;
        this.line_name = line_name;
        this.line_shuoming = line_shuoming;
        this.line_price = line_price;
        this.line_pic = line_pic;
        this.lined_id = lined_id;
        this.line_ding = line_ding;
    }

    public Line(String line_type, String line_name, String line_shuoming, double line_price, String line_pic, Integer lined_id, Line_ding line_ding) {

        this.line_type = line_type;
        this.line_name = line_name;
        this.line_shuoming = line_shuoming;
        this.line_price = line_price;
        this.line_pic = line_pic;
        this.lined_id = lined_id;
        this.line_ding = line_ding;
    }
}
