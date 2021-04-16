package com.sunjon.ScoreManager.bean;

/**
 * 课程考核类别（课程目标的下面一级）
 */
public class TestType {
    private Integer id; //考核类别ID
    private String name; //考核类别名称
    private Float proportion; //考核类别占比
    private Integer lgID; //课程目标ID

    public TestType() {
    }

    public TestType(Integer id, String name, Float proportion, Integer lgID) {
        this.id = id;
        this.name = name;
        this.proportion = proportion;
        this.lgID = lgID;
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

    @Override
    public String toString() {
        return "TestType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", proportion=" + proportion +
                ", lgID=" + lgID +
                '}';
    }
}
