package com.sunjon.ScoreManager.bean;

public class Lesson {
    private Integer id; //课程ID
    private String name; //课程名
    private Float credit; //课程总学分
    private String time; //课程学年

    public Lesson(){}

    public Lesson(Integer id, String name, Float credit, String time) {
        this.id = id;
        this.name = name;
        this.credit = credit;
        this.time = time;
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

    public Float getCredit() {
        return credit;
    }

    public void setCredit(Float credit) {
        this.credit = credit;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", credit=" + credit +
                ", time='" + time + '\'' +
                '}';
    }
}
