package com.sunjon.ScoreManager.bean;

import org.apache.ibatis.type.Alias;

/**
 * 课程考核类别（课程目标的下面一级）
 */
@Alias("TestType")
public class TestType {
    private Integer id; //考核类别ID
    private String name; //考核类别名称
    private Float proportion; //考核类别占比
    private Integer goalId; //课程目标ID
    private String goalName;//a name of the goal

    public TestType() {
    }


    public TestType(Integer id, String name, Float proportion,
                    Integer goalId, String goalName) {
        this.id = id;
        this.name = name;
        this.proportion = proportion;
        this.goalId = goalId;
        this.goalName = goalName;
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

    public Float getProportion() {
        return proportion;
    }

    public void setProportion(Float proportion) {
        this.proportion = proportion;
    }

    public Integer getGoalId() {
        return goalId;
    }

    public void setGoalId(Integer goalId) {
        this.goalId = goalId;
    }

    public String getGoalName() {
        return goalName;
    }

    public void setGoalName(String goalName) {
        this.goalName = goalName;
    }
}
