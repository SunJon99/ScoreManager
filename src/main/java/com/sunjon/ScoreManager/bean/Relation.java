package com.sunjon.ScoreManager.bean;

import org.apache.ibatis.type.Alias;

@Alias("Relation")
public class Relation {
    private Integer id;
    private Integer classId;
    private String className;
    private Integer lessonId;
    private String lessonName;
    private Integer teacherId;
    private String teacherName;

    public Relation(){}

    public Relation(Integer id, Integer classId, String className, Integer lessonId, String lessonName, Integer teacherId, String teacherName) {
        this.id = id;
        this.classId = classId;
        this.className = className;
        this.lessonId = lessonId;
        this.lessonName = lessonName;
        this.teacherId = teacherId;
        this.teacherName = teacherName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
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

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
