package com.example.torists.bean;

import java.io.Serializable;
import java.util.Date;

public class Hotel_ding implements Serializable {
    private Integer hoteldd_id;//酒店房间编号
    private String hoteldd_name;//酒店房间名称
    private String hoteldd_fitype;//房间类型
    private String hoteldd_fjsum;
    private String hoteldd_joinpeople;
    private Date hoteldd_begintim;//入住时间
    private Date hoteldd_endtime;//离开时间
    private String admin_action;//订单状态

    @Override
    public String toString() {
        return "Hotel_ding{" +
                "hoteldd_id=" + hoteldd_id +
                ", hoteldd_name='" + hoteldd_name + '\'' +
                ", hoteldd_fitype='" + hoteldd_fitype + '\'' +
                ", hoteldd_fjsum='" + hoteldd_fjsum + '\'' +
                ", hoteldd_joinpeople='" + hoteldd_joinpeople + '\'' +
                ", hoteldd_begintim=" + hoteldd_begintim +
                ", hoteldd_endtime=" + hoteldd_endtime +
                ", admin_action='" + admin_action + '\'' +
                '}';
    }

    public Integer getHoteldd_id() {
        return hoteldd_id;
    }

    public void setHoteldd_id(Integer hoteldd_id) {
        this.hoteldd_id = hoteldd_id;
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

    public String getHoteldd_fjsum() {
        return hoteldd_fjsum;
    }

    public void setHoteldd_fjsum(String hoteldd_fjsum) {
        this.hoteldd_fjsum = hoteldd_fjsum;
    }

    public String getHoteldd_joinpeople() {
        return hoteldd_joinpeople;
    }

    public void setHoteldd_joinpeople(String hoteldd_joinpeople) {
        this.hoteldd_joinpeople = hoteldd_joinpeople;
    }

    public Date getHoteldd_begintim() {
        return hoteldd_begintim;
    }

    public void setHoteldd_begintim(Date hoteldd_begintim) {
        this.hoteldd_begintim = hoteldd_begintim;
    }

    public Date getHoteldd_endtime() {
        return hoteldd_endtime;
    }

    public void setHoteldd_endtime(Date hoteldd_endtime) {
        this.hoteldd_endtime = hoteldd_endtime;
    }

    public String getAdmin_action() {
        return admin_action;
    }

    public void setAdmin_action(String admin_action) {
        this.admin_action = admin_action;
    }

    public Hotel_ding(Integer hoteldd_id, String hoteldd_name, String hoteldd_fitype, String hoteldd_fjsum, String hoteldd_joinpeople, Date hoteldd_begintim, Date hoteldd_endtime, String admin_action) {

        this.hoteldd_id = hoteldd_id;
        this.hoteldd_name = hoteldd_name;
        this.hoteldd_fitype = hoteldd_fitype;
        this.hoteldd_fjsum = hoteldd_fjsum;
        this.hoteldd_joinpeople = hoteldd_joinpeople;
        this.hoteldd_begintim = hoteldd_begintim;
        this.hoteldd_endtime = hoteldd_endtime;
        this.admin_action = admin_action;
    }

    public Hotel_ding(String hoteldd_name, String hoteldd_fitype, String hoteldd_fjsum, String hoteldd_joinpeople, Date hoteldd_begintim, Date hoteldd_endtime, String admin_action) {

        this.hoteldd_name = hoteldd_name;
        this.hoteldd_fitype = hoteldd_fitype;
        this.hoteldd_fjsum = hoteldd_fjsum;
        this.hoteldd_joinpeople = hoteldd_joinpeople;
        this.hoteldd_begintim = hoteldd_begintim;
        this.hoteldd_endtime = hoteldd_endtime;
        this.admin_action = admin_action;
    }

    public Hotel_ding(Integer hoteldd_id) {

        this.hoteldd_id = hoteldd_id;
    }

    public Hotel_ding() {

    }
}
