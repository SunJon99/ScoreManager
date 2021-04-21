package com.sunjon.ScoreManager.bean;

import org.apache.ibatis.type.Alias;

@Alias("Test")
public class Test {
    private Integer id; //考核项目ID
    private String name; //考核项目名称
    private Float totalScore; //考核项目总分
    private Integer ttID; //考核类别ID

    public Test(){}

    public Test(Integer id, String name, Float totalScore, Integer ttID) {
        this.id = id;
        this.name = name;
        this.totalScore = totalScore;
        this.ttID = ttID;
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

    public Integer getTtID() {
        return ttID;
    }

    public void setTtID(Integer ttID) {
        this.ttID = ttID;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", totalScore=" + totalScore +
                ", ttID=" + ttID +
                '}';
    }

}
