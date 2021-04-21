package com.sunjon.ScoreManager.bean;

import org.apache.ibatis.type.Alias;

import java.util.List;

@Alias("Lesson")
public class Lesson {
    private Integer id; //课程ID
    private String name; //课程名
    private Float credit; //课程总学分
    private String time; //课程学年
    private List<LessonGoal> goalList; //课程的课程目标

    public Lesson(){}

    public Lesson(Integer id, String name, Float credit, String time, List<LessonGoal> goalList) {
        this.id = id;
        this.name = name;
        this.credit = credit;
        this.time = time;
        this.goalList = goalList;
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

    public List<LessonGoal> getGoalList() {
        return goalList;
    }

    public void setGoalList(List<LessonGoal> goalList) {
        this.goalList = goalList;
    }

    @Override
    public String  toString() {
        return "Lesson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", credit=" + credit +
                ", time='" + time + '\'' +
                ", goalList=" + goalList +
                '}';
    }
}
