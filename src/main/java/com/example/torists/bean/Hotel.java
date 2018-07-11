package com.example.torists.bean;

import java.io.Serializable;

public class Hotel implements Serializable {
    private Integer hotel_id;//酒店编号id
    private String hotel_name;//酒店名称
    private String hotel_position;//酒店位置
    private String hotel_pic;//酒店图片
    private String hotel_content;//酒店介绍
    private double hotel_price;//酒店价格
    private Integer order_id;//酒店订单id
    private Hotel_ding hotel_ding;//酒店所属对象内容

    public Hotel() {
    }

    public Hotel(Integer hotel_id) {
        this.hotel_id = hotel_id;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotel_id=" + hotel_id +
                ", hotel_name='" + hotel_name + '\'' +
                ", hotel_position='" + hotel_position + '\'' +
                ", hotel_pic='" + hotel_pic + '\'' +
                ", hotel_content='" + hotel_content + '\'' +
                ", hotel_price=" + hotel_price +
                ", order_id=" + order_id +
                ", hotel_ding=" + hotel_ding +
                '}';
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

    public String getHotel_pic() {
        return hotel_pic;
    }

    public void setHotel_pic(String hotel_pic) {
        this.hotel_pic = hotel_pic;
    }

    public String getHotel_content() {
        return hotel_content;
    }

    public void setHotel_content(String hotel_content) {
        this.hotel_content = hotel_content;
    }

    public double getHotel_price() {
        return hotel_price;
    }

    public void setHotel_price(double hotel_price) {
        this.hotel_price = hotel_price;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Hotel_ding getHotel_ding() {
        return hotel_ding;
    }

    public void setHotel_ding(Hotel_ding hotel_ding) {
        this.hotel_ding = hotel_ding;
    }

    public Hotel(Integer hotel_id, String hotel_name, String hotel_position, String hotel_pic, String hotel_content, double hotel_price, Integer order_id, Hotel_ding hotel_ding) {

        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.hotel_position = hotel_position;
        this.hotel_pic = hotel_pic;
        this.hotel_content = hotel_content;
        this.hotel_price = hotel_price;
        this.order_id = order_id;
        this.hotel_ding = hotel_ding;
    }

    public Hotel(String hotel_name, String hotel_position, String hotel_pic, String hotel_content, double hotel_price, Integer order_id, Hotel_ding hotel_ding) {

        this.hotel_name = hotel_name;
        this.hotel_position = hotel_position;
        this.hotel_pic = hotel_pic;
        this.hotel_content = hotel_content;
        this.hotel_price = hotel_price;
        this.order_id = order_id;
        this.hotel_ding = hotel_ding;
    }
}
