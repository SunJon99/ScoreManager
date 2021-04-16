package com.sunjon.ScoreManager.bean;

public class Teacher extends User{
    private String title;//教师职称
    private Integer dpID;//所属学院ID

    public Teacher(){super();}

    public Teacher(Integer id, String name, String authority, String email, String title, Integer dpID) {
        super(id, name, authority, email);
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
