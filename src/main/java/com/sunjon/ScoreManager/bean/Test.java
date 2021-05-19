package com.sunjon.ScoreManager.bean;

import org.apache.ibatis.type.Alias;

@Alias("Test")
public class Test {
    private Integer id; //考核项目ID
    private String name; //考核项目名称
    private Float totalScore; //考核项目总分
    private Integer ttId; //考核类别ID
    private String ttName;// the name of TestType
    private Integer goalId;// the id of goal
    private String goalName;//the name of goal

    public Test(){}

    public Test(Integer id, String name, Float totalScore, Integer ttId, String ttName, Integer goalId, String goalName) {
        this.id = id;
        this.name = name;
        this.totalScore = totalScore;
        this.ttId = ttId;
        this.ttName = ttName;
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

    public Float getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Float totalScore) {
        this.totalScore = totalScore;
    }

    public Integer getTtId() {
        return ttId;
    }

    public void setTtId(Integer ttId) {
        this.ttId = ttId;
    }

    public String getTtName() {
        return ttName;
    }

    public void setTtName(String ttName) {
        this.ttName = ttName;
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
