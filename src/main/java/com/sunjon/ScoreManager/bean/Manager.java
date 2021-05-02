package com.sunjon.ScoreManager.bean;

import org.apache.ibatis.type.Alias;

@Alias("Manager")
public class Manager {
    private Integer id; //管理员编号
    private String name;//管理员姓名
    private String email;//管理员邮箱
    private String organization;//所属学院名称

    public Manager(){}

    public Manager(Integer id, String name, String email, String organization) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.organization = organization;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }
}
