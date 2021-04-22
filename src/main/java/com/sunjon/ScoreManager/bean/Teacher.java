package com.sunjon.ScoreManager.bean;

import org.apache.ibatis.type.Alias;

@Alias("Teacher")
public class Teacher extends User{
    private String title;//教师职称
    private Integer dpID;//所属学院ID

    public Teacher(){super();}

    public Teacher(Integer id, String name, String email, PassWord passWord, String title, Integer dpID) {
        super(id, name, email, passWord);
        this.title = title;
        this.dpID = dpID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getDpID() {
        return dpID;
    }

    public void setDpID(Integer dpID) {
        this.dpID = dpID;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                super.toString()+
                "title='" + title + '\'' +
                ", dpID=" + dpID +
                '}';
    }
}
