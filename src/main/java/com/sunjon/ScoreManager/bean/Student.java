package com.sunjon.ScoreManager.bean;

import org.apache.ibatis.type.Alias;

@Alias("Student")
public class Student{
    private Integer id;//编号
    private String name;//名字
    private String email;//邮箱
    private String gender;//性别
    private String className;//班级名称
    private String department;//学院名称
    private Integer dpID;//学院编号
    private Integer classID;//班级编号

    public Student(){}

    public Student(Integer id, String name, String email, String gender,
                   String className, String department, Integer dpID,
                   Integer classID) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.className = className;
        this.department = department;
        this.dpID = dpID;
        this.classID = classID;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
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

    public Integer getClassID() {
        return classID;
    }

    public void setClassID(Integer classID) {
        this.classID = classID;
    }
}
