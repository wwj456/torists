package com.example.torists.bean;

import java.io.Serializable;
import java.util.Date;

public class Guest implements Serializable {
    private Integer g_userid;//编号id
    private String g_username;//游客用户名
    private String g_userfrom;//来自哪里
    private String g_sex;//性别
    private String g_qq;//qq
    private String g_email;//eamil
    private String g_content;//留言内容
    private String g_reply;//管理员回复
    private String g_imageAddress;//头像
    private Date g_posttime;//留言时间
    private Date g_replytime;//回复时间

    @Override
    public String toString() {
        return "Guest{" +
                "g_userid=" + g_userid +
                ", g_username='" + g_username + '\'' +
                ", g_userfrom='" + g_userfrom + '\'' +
                ", g_sex='" + g_sex + '\'' +
                ", g_qq='" + g_qq + '\'' +
                ", g_email='" + g_email + '\'' +
                ", g_content='" + g_content + '\'' +
                ", g_reply='" + g_reply + '\'' +
                ", g_imageAddress='" + g_imageAddress + '\'' +
                ", g_posttime=" + g_posttime +
                ", g_replytime=" + g_replytime +
                '}';
    }

    public Integer getG_userid() {
        return g_userid;
    }

    public void setG_userid(Integer g_userid) {
        this.g_userid = g_userid;
    }

    public String getG_username() {
        return g_username;
    }

    public void setG_username(String g_username) {
        this.g_username = g_username;
    }

    public String getG_userfrom() {
        return g_userfrom;
    }

    public void setG_userfrom(String g_userfrom) {
        this.g_userfrom = g_userfrom;
    }

    public String getG_sex() {
        return g_sex;
    }

    public void setG_sex(String g_sex) {
        this.g_sex = g_sex;
    }

    public String getG_qq() {
        return g_qq;
    }

    public void setG_qq(String g_qq) {
        this.g_qq = g_qq;
    }

    public String getG_email() {
        return g_email;
    }

    public void setG_email(String g_email) {
        this.g_email = g_email;
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

    public String getG_imageAddress() {
        return g_imageAddress;
    }

    public void setG_imageAddress(String g_imageAddress) {
        this.g_imageAddress = g_imageAddress;
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

    public Guest(Integer g_userid, String g_username, String g_userfrom, String g_sex, String g_qq, String g_email, String g_content, String g_reply, String g_imageAddress, Date g_posttime, Date g_replytime) {

        this.g_userid = g_userid;
        this.g_username = g_username;
        this.g_userfrom = g_userfrom;
        this.g_sex = g_sex;
        this.g_qq = g_qq;
        this.g_email = g_email;
        this.g_content = g_content;
        this.g_reply = g_reply;
        this.g_imageAddress = g_imageAddress;
        this.g_posttime = g_posttime;
        this.g_replytime = g_replytime;
    }

    public Guest(String g_username, String g_userfrom, String g_sex, String g_qq, String g_email, String g_content, String g_reply, String g_imageAddress, Date g_posttime, Date g_replytime) {

        this.g_username = g_username;
        this.g_userfrom = g_userfrom;
        this.g_sex = g_sex;
        this.g_qq = g_qq;
        this.g_email = g_email;
        this.g_content = g_content;
        this.g_reply = g_reply;
        this.g_imageAddress = g_imageAddress;
        this.g_posttime = g_posttime;
        this.g_replytime = g_replytime;
    }

    public Guest(Integer g_userid) {

        this.g_userid = g_userid;
    }

    public Guest() {

    }
}
