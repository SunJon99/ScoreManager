package com.sunjon.ScoreManager.bean;

import org.apache.ibatis.type.Alias;

@Alias("Teacher")
public class Teacher{
    private Integer id ;//教师编号
    private String name;//教师姓名
    private String title;//教师职称
    private String email;//教师邮箱
    private String department;//学院名称
    private Integer dpID;//所属学院ID

    public Teacher(){}

    public Teacher(Integer id, String name,
                   String title, String email,
                   String department, Integer dpID) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.email = email;
        this.department = department;
        this.dpID = dpID;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getDpID() {
        return dpID;
    }

    public void setDpID(Integer dpID) {
        this.dpID = dpID;
    }
}
