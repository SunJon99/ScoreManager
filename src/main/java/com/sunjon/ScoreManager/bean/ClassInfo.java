package com.sunjon.ScoreManager.bean;

import org.apache.ibatis.type.Alias;

@Alias("ClassInfo")
public class ClassInfo {

    private Integer id;//班级编号
    private String name;//班级名称
    private Integer dpID;//所属学院编号
    private String department;//所属学院名称

    public ClassInfo(){}

    public ClassInfo(Integer id, String name, Integer dpID, String department) {
        this.id = id;
        this.name = name;
        this.dpID = dpID;
        this.department = department;
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

    public Integer getDpID() {
        return dpID;
    }

    public void setDpID(Integer dpID) {
        this.dpID = dpID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
