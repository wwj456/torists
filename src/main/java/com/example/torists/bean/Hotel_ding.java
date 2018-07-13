package com.example.torists.bean;

import java.io.Serializable;
import java.util.Date;

public class Hotel_ding implements Serializable {
    private Integer order_id;//酒店房间编号
    private String hoteldd_name;//酒店房间名称
    private String hoteldd_fitype;//房间类型
    private String hoteldd_begintim;//入住时间
    private String hoteldd_endtime;//离开时间
    private String admin_action;//订单状态

    public Hotel_ding() {

    }

    @Override
    public String toString() {
        return "Hotel_ding{" +
                "order_id=" + order_id +
                ", hoteldd_name='" + hoteldd_name + '\'' +
                ", hoteldd_fitype='" + hoteldd_fitype + '\'' +
                ", hoteldd_begintim='" + hoteldd_begintim + '\'' +
                ", hoteldd_endtime='" + hoteldd_endtime + '\'' +
                ", admin_action='" + admin_action + '\'' +
                '}';
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public String getHoteldd_name() {
        return hoteldd_name;
    }

    public void setHoteldd_name(String hoteldd_name) {
        this.hoteldd_name = hoteldd_name;
    }

    public String getHoteldd_fitype() {
        return hoteldd_fitype;
    }

    public void setHoteldd_fitype(String hoteldd_fitype) {
        this.hoteldd_fitype = hoteldd_fitype;
    }

    public String getHoteldd_begintim() {
        return hoteldd_begintim;
    }

    public void setHoteldd_begintim(String hoteldd_begintim) {
        this.hoteldd_begintim = hoteldd_begintim;
    }

    public String getHoteldd_endtime() {
        return hoteldd_endtime;
    }

    public void setHoteldd_endtime(String hoteldd_endtime) {
        this.hoteldd_endtime = hoteldd_endtime;
    }

    public String getAdmin_action() {
        return admin_action;
    }

    public void setAdmin_action(String admin_action) {
        this.admin_action = admin_action;
    }

    public Hotel_ding(Integer order_id, String hoteldd_name, String hoteldd_fitype, String hoteldd_begintim, String hoteldd_endtime, String admin_action) {

        this.order_id = order_id;
        this.hoteldd_name = hoteldd_name;
        this.hoteldd_fitype = hoteldd_fitype;
        this.hoteldd_begintim = hoteldd_begintim;
        this.hoteldd_endtime = hoteldd_endtime;
        this.admin_action = admin_action;
    }

    public Hotel_ding(String hoteldd_name, String hoteldd_fitype, String hoteldd_begintim, String hoteldd_endtime, String admin_action) {

        this.hoteldd_name = hoteldd_name;
        this.hoteldd_fitype = hoteldd_fitype;
        this.hoteldd_begintim = hoteldd_begintim;
        this.hoteldd_endtime = hoteldd_endtime;
        this.admin_action = admin_action;
    }

    public Hotel_ding(Integer order_id) {

        this.order_id = order_id;
    }
}
