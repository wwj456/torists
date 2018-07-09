package com.example.torists.bean;

import java.io.Serializable;

public class Line implements Serializable {
    private Integer line_id;//线路id
    private String line_type;//线路类型
    private String line_name;//线路名称
    private String line_xingcheng;//线路行程
    private String line_baojia;//线路报价
    private String line_anpai;//线路安排
    private String line_shuoming;//线路说明
    private double line_price;//线路价格
    private String line_pic;//线路图片
    private String line_picname;//线路图片名称
    private Line_ding line_ding;

    public Line() {
    }

    public Line(Integer line_id) {
        this.line_id = line_id;
    }

    public Line(Integer line_id, String line_type, String line_name, String line_xingcheng, String line_baojia, String line_anpai, String line_shuoming, double line_price, String line_pic, String line_picname, Line_ding line_ding) {
        this.line_id = line_id;
        this.line_type = line_type;
        this.line_name = line_name;
        this.line_xingcheng = line_xingcheng;
        this.line_baojia = line_baojia;
        this.line_anpai = line_anpai;
        this.line_shuoming = line_shuoming;
        this.line_price = line_price;
        this.line_pic = line_pic;
        this.line_picname = line_picname;
        this.line_ding = line_ding;
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

    public String getLine_xingcheng() {
        return line_xingcheng;
    }

    public void setLine_xingcheng(String line_xingcheng) {
        this.line_xingcheng = line_xingcheng;
    }

    public String getLine_baojia() {
        return line_baojia;
    }

    public void setLine_baojia(String line_baojia) {
        this.line_baojia = line_baojia;
    }

    public String getLine_anpai() {
        return line_anpai;
    }

    public void setLine_anpai(String line_anpai) {
        this.line_anpai = line_anpai;
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

    public String getLine_picname() {
        return line_picname;
    }

    public void setLine_picname(String line_picname) {
        this.line_picname = line_picname;
    }

    public Line_ding getLine_ding() {
        return line_ding;
    }

    public void setLine_ding(Line_ding line_ding) {
        this.line_ding = line_ding;
    }

    @Override
    public String toString() {
        return "Line{" +
                "line_id=" + line_id +
                ", line_type='" + line_type + '\'' +
                ", line_name='" + line_name + '\'' +
                ", line_xingcheng='" + line_xingcheng + '\'' +
                ", line_baojia='" + line_baojia + '\'' +
                ", line_anpai='" + line_anpai + '\'' +
                ", line_shuoming='" + line_shuoming + '\'' +
                ", line_price=" + line_price +
                ", line_pic='" + line_pic + '\'' +
                ", line_picname='" + line_picname + '\'' +
                ", line_ding=" + line_ding +
                '}';
    }
}
