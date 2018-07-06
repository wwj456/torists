package com.example.torists.bean;

import java.io.Serializable;

public class Admin implements Serializable {

    private Integer id;//用户管理员id
    private String user_name;//用户名
    private String user_pwd;//用户密码

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                ", user_pwd='" + user_pwd + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    public Admin(Integer id, String user_name, String user_pwd) {

        this.id = id;
        this.user_name = user_name;
        this.user_pwd = user_pwd;
    }

    public Admin(String user_name, String user_pwd) {

        this.user_name = user_name;
        this.user_pwd = user_pwd;
    }

    public Admin(Integer id) {

        this.id = id;
    }

    public Admin() {

    }
}
