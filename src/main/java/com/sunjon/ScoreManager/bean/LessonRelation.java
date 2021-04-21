package com.sunjon.ScoreManager.bean;

import org.apache.ibatis.type.Alias;

import java.util.List;

/**
 * 课程关系
 */
@Alias("LessonRelation")
public class LessonRelation {
    private Lesson lesson; //课程
    private List<Teacher> teachers; //课程对应的教师
    private List<Grade> grades; //课程对应的班级

    public LessonRelation(){}

    public LessonRelation(Lesson lesson, List<Teacher> teachers, List<Grade> grades) {
        this.lesson = lesson;
        this.teachers = teachers;
        this.grades = grades;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "LessonRelation{" +
                "lesson=" + lesson +
                ", teachers=" + teachers +
                ", grades=" + grades +
                '}';
    }
}
