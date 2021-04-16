package com.sunjon.ScoreManager.bean;

/**
 * 班级
 */
public class Grade {
    private Integer id; //班级编号
    private String name; //班级名称
    private Integer dpID; //学院编号

    public Grade(){}

    public Grade(Integer id, String name, Integer dpID) {
        this.id = id;
        this.name = name;
        this.dpID = dpID;
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

    public Integer getDpID() {
        return dpID;
    }

    public void setDpID(Integer dpID) {
        this.dpID = dpID;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dpID=" + dpID +
                '}';
    }
}
