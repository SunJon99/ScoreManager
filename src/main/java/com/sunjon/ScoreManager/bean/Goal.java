package com.sunjon.ScoreManager.bean;

import org.apache.ibatis.type.Alias;

@Alias("Goal")
public class Goal {
    private Integer id;//id of goal
    private String name;//name of goal
    private String description;//description of this goal
    private Float proportion;//the proportion of this goal in the lesson
    private Integer lessonId;//the id of a lesson what is this goal belong to
    private String lessonName;//a name of the lesson

    public Goal(){}

    public Goal(Integer id, String name, String description, Float proportion, Integer lessonId, String lessonName) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.proportion = proportion;
        this.lessonId = lessonId;
        this.lessonName = lessonName;
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

    public Integer getLessonId() {
        return lessonId;
    }

    public void setLessonId(Integer lessonId) {
        this.lessonId = lessonId;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }
}
