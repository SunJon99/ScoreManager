package com.sunjon.ScoreManager.bean;

import org.apache.ibatis.type.Alias;

import java.util.List;

@Alias("LessonGoal")
public class LessonGoal {
    private Integer id; //课程目标ID
    private String description; //课程目标描述
    private Float proportion; //占比
    private Integer lessonID; //所属课程ID
    private List<TestType> testTypeList;//课程目标的测试类

    public LessonGoal(){}

    public LessonGoal(Integer id, String description, Float proportion, Integer lessonID, List<TestType> testTypeList) {
        this.id = id;
        this.description = description;
        this.proportion = proportion;
        this.lessonID = lessonID;
        this.testTypeList = testTypeList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getProportion() {
        return proportion;
    }

    public void setProportion(Float proportion) {
        this.proportion = proportion;
    }

    public Integer getLessonID() {
        return lessonID;
    }

    public void setLessonID(Integer lessonID) {
        this.lessonID = lessonID;
    }

    public List<TestType> getTestTypeList() {
        return testTypeList;
    }

    public void setTestTypeList(List<TestType> testTypeList) {
        this.testTypeList = testTypeList;
    }

    @Override
    public String toString() {
        return "LessonGoal{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", proportion=" + proportion +
                ", lessonID=" + lessonID +
                ", testTypeList=" + testTypeList +
                '}';
    }
}
