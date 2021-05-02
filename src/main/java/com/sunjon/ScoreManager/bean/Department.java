package com.sunjon.ScoreManager.bean;

import org.apache.ibatis.type.Alias;

@Alias("Department")
public class Department {
    private Integer id;//学院编号
    private String name;//学院名称
    private Integer stNum;//学院学生人数
    private Integer tcNum;//学院教师人数

    public Department(){}

    public Department(Integer id, String name, Integer stNum, Integer tcNum) {
        this.id = id;
        this.name = name;
        this.stNum = stNum;
        this.tcNum = tcNum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStNum() {
        return stNum;
    }

    public void setStNum(Integer stNum) {
        this.stNum = stNum;
    }

    public Integer getTcNum() {
        return tcNum;
    }

    public void setTcNum(Integer tcNum) {
        this.tcNum = tcNum;
    }
}
