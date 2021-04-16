package com.sunjon.ScoreManager.service;

import com.sunjon.ScoreManager.bean.Grade;
import com.sunjon.ScoreManager.bean.Lesson;
import com.sunjon.ScoreManager.bean.LessonRelation;
import com.sunjon.ScoreManager.bean.Teacher;

import java.util.List;

public interface LessonRelationManager {
    /**
     * 课程关系添加
     */
    Boolean AddRelation(LessonRelation relation);
    Boolean AddRelationList(List<LessonRelation> relationList);
    /**
     * 课程关系删除
     */
    Boolean DeleteRelation(LessonRelation relation);
    Boolean DeleteRelationList(List<LessonRelation> relationList);
    /**
     * 课程关系查看
     */
    LessonRelation ShowRelationByID(Integer id);//通过课程关系ID显示
    LessonRelation ShowRelationByLesson(Lesson lesson);//通过课程显示课程关系
    List<LessonRelation> ShowRelationsByTeacher(Teacher teacher);//通过教师显示课程关系
    List<LessonRelation> ShowRelationsByGrade(Grade grade);//通过班级显示课程关系

}
