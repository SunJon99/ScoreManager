package com.sunjon.ScoreManager.bean;

import org.apache.ibatis.type.Alias;

import java.util.List;

/**
 * 课程考核类别（课程目标的下面一级）
 */
@Alias("TestType")
public class TestType {
    private Integer id; //考核类别ID
    private String name; //考核类别名称
    private Float proportion; //考核类别占比
    private Integer lgID; //课程目标ID
    private List<Test> testList;//考核类别的测试项目

    public TestType() {
    }

    public TestType(Integer id, String name, Float proportion, Integer lgID, List<Test> testList) {
        this.id = id;
        this.name = name;
        this.proportion = proportion;
        this.lgID = lgID;
        this.testList = testList;
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

    public Integer getLgID() {
        return lgID;
    }

    public void setLgID(Integer lgID) {
        this.lgID = lgID;
    }

    public List<Test> getTestList() {
        return testList;
    }

    public void setTestList(List<Test> testList) {
        this.testList = testList;
    }

    @Override
    public String toString() {
        return "TestType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", proportion=" + proportion +
                ", lgID=" + lgID +
                ", testList=" + testList +
                '}';
    }
}
