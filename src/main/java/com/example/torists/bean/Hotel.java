package com.example.torists.bean;

import java.io.Serializable;

public class Hotel implements Serializable {
    private Integer hotel_id;//酒店编号id
    private String hotel_name;//酒店名称
    private String hotel_position;//酒店位置
    private String hotel_grade;//酒店星级
    private String hotel_pic1;//酒店图片
    private String hotel_pic2;//酒店图片
    private String hotel_pic3;//酒店图片
    private String hotel_content;//酒店介绍
    private String hotel_zwjg;//酒店周围景观介绍
    private double hotel_price;//酒店价格
    private Hotel_ding hotel_ding;

    public Hotel() {
    }

    public Hotel(Integer hotel_id) {
        this.hotel_id = hotel_id;
    }

    public Hotel(Integer hotel_id, String hotel_name, String hotel_position, String hotel_grade, String hotel_pic1, String hotel_pic2, String hotel_pic3, String hotel_content, String hotel_zwjg, double hotel_price, Hotel_ding hotel_ding) {
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.hotel_position = hotel_position;
        this.hotel_grade = hotel_grade;
        this.hotel_pic1 = hotel_pic1;
        this.hotel_pic2 = hotel_pic2;
        this.hotel_pic3 = hotel_pic3;
        this.hotel_content = hotel_content;
        this.hotel_zwjg = hotel_zwjg;
        this.hotel_price = hotel_price;
        this.hotel_ding = hotel_ding;
    }

    public Integer getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Integer hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public String getHotel_position() {
        return hotel_position;
    }

    public void setHotel_position(String hotel_position) {
        this.hotel_position = hotel_position;
    }

    public String getHotel_grade() {
        return hotel_grade;
    }

    public void setHotel_grade(String hotel_grade) {
        this.hotel_grade = hotel_grade;
    }

    public String getHotel_pic1() {
        return hotel_pic1;
    }

    public void setHotel_pic1(String hotel_pic1) {
        this.hotel_pic1 = hotel_pic1;
    }

    public String getHotel_pic2() {
        return hotel_pic2;
    }

    public void setHotel_pic2(String hotel_pic2) {
        this.hotel_pic2 = hotel_pic2;
    }

    public String getHotel_pic3() {
        return hotel_pic3;
    }

    public void setHotel_pic3(String hotel_pic3) {
        this.hotel_pic3 = hotel_pic3;
    }

    public String getHotel_content() {
        return hotel_content;
    }

    public void setHotel_content(String hotel_content) {
        this.hotel_content = hotel_content;
    }

    public String getHotel_zwjg() {
        return hotel_zwjg;
    }

    public void setHotel_zwjg(String hotel_zwjg) {
        this.hotel_zwjg = hotel_zwjg;
    }

    public double getHotel_price() {
        return hotel_price;
    }

    public void setHotel_price(double hotel_price) {
        this.hotel_price = hotel_price;
    }

    public Hotel_ding getHotel_ding() {
        return hotel_ding;
    }

    public void setHotel_ding(Hotel_ding hotel_ding) {
        this.hotel_ding = hotel_ding;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotel_id=" + hotel_id +
                ", hotel_name='" + hotel_name + '\'' +
                ", hotel_position='" + hotel_position + '\'' +
                ", hotel_grade='" + hotel_grade + '\'' +
                ", hotel_pic1='" + hotel_pic1 + '\'' +
                ", hotel_pic2='" + hotel_pic2 + '\'' +
                ", hotel_pic3='" + hotel_pic3 + '\'' +
                ", hotel_content='" + hotel_content + '\'' +
                ", hotel_zwjg='" + hotel_zwjg + '\'' +
                ", hotel_price=" + hotel_price +
                ", hotel_ding=" + hotel_ding +
                '}';
    }
}
