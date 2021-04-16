package com.sunjon.ScoreManager.bean;

public class Student extends User{
    private String gender;//性别
    private Integer classID;//班级编号

    public Student(){super();}

    public Student(Integer id, String name, String authority, String email, String gender, Integer classID) {
        super(id, name, authority, email);
        this.gender = gender;
        this.classID = classID;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getClassID() {
        return classID;
    }

    public void setClassID(Integer classID) {
        this.classID = classID;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString()+
                "gender='" + gender + '\'' +
                ", classID=" + classID +
                '}';
    }
}
