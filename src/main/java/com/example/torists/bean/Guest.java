package com.example.torists.bean;

import java.io.Serializable;
import java.util.Date;

public class Guest implements Serializable {
    private Integer g_id;//编号id
    private String g_username;//用户名
    private String g_sex;//性别
    private String g_content;//留言内容
    private String g_reply;//管理员回复
    private Date g_posttime;//留言时间
    private Date g_replytime;//回复时间
    private Integer t_id;//客户id
    private Tourists tourists;//留言客户所属对象内容
    public Guest() {

    }

    @Override
    public String toString() {
        return "Guest{" +
                "g_id=" + g_id +
                ", g_username='" + g_username + '\'' +
                ", g_sex='" + g_sex + '\'' +
                ", g_content='" + g_content + '\'' +
                ", g_reply='" + g_reply + '\'' +
                ", g_posttime=" + g_posttime +
                ", g_replytime=" + g_replytime +
                ", t_id=" + t_id +
                ", tourists=" + tourists +
                '}';
    }

    public Integer getG_id() {
        return g_id;
    }

    public void setG_id(Integer g_id) {
        this.g_id = g_id;
    }

    public String getG_username() {
        return g_username;
    }

    public void setG_username(String g_username) {
        this.g_username = g_username;
    }

    public String getG_sex() {
        return g_sex;
    }

    public void setG_sex(String g_sex) {
        this.g_sex = g_sex;
    }

    public String getG_content() {
        return g_content;
    }

    public void setG_content(String g_content) {
        this.g_content = g_content;
    }

    public String getG_reply() {
        return g_reply;
    }

    public void setG_reply(String g_reply) {
        this.g_reply = g_reply;
    }

    public Date getG_posttime() {
        return g_posttime;
    }

    public void setG_posttime(Date g_posttime) {
        this.g_posttime = g_posttime;
    }

    public Date getG_replytime() {
        return g_replytime;
    }

    public void setG_replytime(Date g_replytime) {
        this.g_replytime = g_replytime;
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public Tourists getTourists() {
        return tourists;
    }

    public void setTourists(Tourists tourists) {
        this.tourists = tourists;
    }

    public Guest(Integer g_id, String g_username, String g_sex, String g_content, String g_reply, Date g_posttime, Date g_replytime, Integer t_id, Tourists tourists) {

        this.g_id = g_id;
        this.g_username = g_username;
        this.g_sex = g_sex;
        this.g_content = g_content;
        this.g_reply = g_reply;
        this.g_posttime = g_posttime;
        this.g_replytime = g_replytime;
        this.t_id = t_id;
        this.tourists = tourists;
    }

    public Guest(String g_username, String g_sex, String g_content, String g_reply, Date g_posttime, Date g_replytime, Integer t_id, Tourists tourists) {

        this.g_username = g_username;
        this.g_sex = g_sex;
        this.g_content = g_content;
        this.g_reply = g_reply;
        this.g_posttime = g_posttime;
        this.g_replytime = g_replytime;
        this.t_id = t_id;
        this.tourists = tourists;
    }

    public Guest(Integer g_id) {

        this.g_id = g_id;
    }
}
