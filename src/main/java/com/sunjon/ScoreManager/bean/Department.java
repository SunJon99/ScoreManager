package com.sunjon.ScoreManager.bean;

import org.apache.ibatis.type.Alias;

@Alias("Department")
public class Department {
    private Integer id;//学院编号
    private String name;//学院名称
    private Integer ogID;//组织编号

    public Department(){}

    public Department(Integer id, String name, Integer ogID) {
        this.id = id;
        this.name = name;
        this.ogID = ogID;
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

    public Integer getOgID() {
        return ogID;
    }

    public void setOgID(Integer ogID) {
        this.ogID = ogID;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ogID=" + ogID +
                '}';
    }
}
