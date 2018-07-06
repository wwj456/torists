package com.example.torists.bean;

import java.io.Serializable;

public class Tourists implements Serializable {
    private Integer t_id;//客户id
    private String t_name;//客户姓名
    private String t_tel;//客户电话
    private Integer t_icd;//客户身份证id

    @Override
    public String toString() {
        return "Tourists{" +
                "t_id=" + t_id +
                ", t_name='" + t_name + '\'' +
                ", t_tel='" + t_tel + '\'' +
                ", t_icd=" + t_icd +
                '}';
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public String getT_tel() {
        return t_tel;
    }

    public void setT_tel(String t_tel) {
        this.t_tel = t_tel;
    }

    public Integer getT_icd() {
        return t_icd;
    }

    public void setT_icd(Integer t_icd) {
        this.t_icd = t_icd;
    }

    public Tourists(Integer t_id, String t_name, String t_tel, Integer t_icd) {

        this.t_id = t_id;
        this.t_name = t_name;
        this.t_tel = t_tel;
        this.t_icd = t_icd;
    }

    public Tourists(String t_name, String t_tel, Integer t_icd) {

        this.t_name = t_name;
        this.t_tel = t_tel;
        this.t_icd = t_icd;
    }

    public Tourists(Integer t_id) {

        this.t_id = t_id;
    }

    public Tourists() {


    }
}
