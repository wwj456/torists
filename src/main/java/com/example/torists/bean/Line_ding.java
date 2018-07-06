package com.example.torists.bean;

import java.io.Serializable;
import java.util.Date;

public class Line_ding implements Serializable {
    private Integer lined_id;//线路订单id
    private String lined_name;//线路订单名称
    private String lined_chfaplace;
    private String lined_jointime;//开始时间
    private String lined_dhotel;
    private String lined_dplane;
    private String l_name;//订单人姓名
    private String l_tel;//订单人电话
    private String l_conten;
    private String admin_action;
    private Date add_date;
    private Integer line_id;//线路id

    @Override
    public String toString() {
        return "Line_ding{" +
                "lined_id=" + lined_id +
                ", lined_name='" + lined_name + '\'' +
                ", lined_chfaplace='" + lined_chfaplace + '\'' +
                ", lined_jointime='" + lined_jointime + '\'' +
                ", lined_dhotel='" + lined_dhotel + '\'' +
                ", lined_dplane='" + lined_dplane + '\'' +
                ", l_name='" + l_name + '\'' +
                ", l_tel='" + l_tel + '\'' +
                ", l_conten='" + l_conten + '\'' +
                ", admin_action='" + admin_action + '\'' +
                ", add_date=" + add_date +
                ", line_id=" + line_id +
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

    public String getLined_chfaplace() {
        return lined_chfaplace;
    }

    public void setLined_chfaplace(String lined_chfaplace) {
        this.lined_chfaplace = lined_chfaplace;
    }

    public String getLined_jointime() {
        return lined_jointime;
    }

    public void setLined_jointime(String lined_jointime) {
        this.lined_jointime = lined_jointime;
    }

    public String getLined_dhotel() {
        return lined_dhotel;
    }

    public void setLined_dhotel(String lined_dhotel) {
        this.lined_dhotel = lined_dhotel;
    }

    public String getLined_dplane() {
        return lined_dplane;
    }

    public void setLined_dplane(String lined_dplane) {
        this.lined_dplane = lined_dplane;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getL_tel() {
        return l_tel;
    }

    public void setL_tel(String l_tel) {
        this.l_tel = l_tel;
    }

    public String getL_conten() {
        return l_conten;
    }

    public void setL_conten(String l_conten) {
        this.l_conten = l_conten;
    }

    public String getAdmin_action() {
        return admin_action;
    }

    public void setAdmin_action(String admin_action) {
        this.admin_action = admin_action;
    }

    public Date getAdd_date() {
        return add_date;
    }

    public void setAdd_date(Date add_date) {
        this.add_date = add_date;
    }

    public Integer getLine_id() {
        return line_id;
    }

    public void setLine_id(Integer line_id) {
        this.line_id = line_id;
    }

    public Line_ding(Integer lined_id, String lined_name, String lined_chfaplace, String lined_jointime, String lined_dhotel, String lined_dplane, String l_name, String l_tel, String l_conten, String admin_action, Date add_date, Integer line_id) {

        this.lined_id = lined_id;
        this.lined_name = lined_name;
        this.lined_chfaplace = lined_chfaplace;
        this.lined_jointime = lined_jointime;
        this.lined_dhotel = lined_dhotel;
        this.lined_dplane = lined_dplane;
        this.l_name = l_name;
        this.l_tel = l_tel;
        this.l_conten = l_conten;
        this.admin_action = admin_action;
        this.add_date = add_date;
        this.line_id = line_id;
    }

    public Line_ding(String lined_name, String lined_chfaplace, String lined_jointime, String lined_dhotel, String lined_dplane, String l_name, String l_tel, String l_conten, String admin_action, Date add_date, Integer line_id) {

        this.lined_name = lined_name;
        this.lined_chfaplace = lined_chfaplace;
        this.lined_jointime = lined_jointime;
        this.lined_dhotel = lined_dhotel;
        this.lined_dplane = lined_dplane;
        this.l_name = l_name;
        this.l_tel = l_tel;
        this.l_conten = l_conten;
        this.admin_action = admin_action;
        this.add_date = add_date;
        this.line_id = line_id;
    }

    public Line_ding(Integer lined_id) {

        this.lined_id = lined_id;
    }

    public Line_ding() {

    }
}
