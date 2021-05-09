package com.sunjon.ScoreManager.service;

import com.sunjon.ScoreManager.bean.Lesson;
import com.sunjon.ScoreManager.bean.Student;
import com.sunjon.ScoreManager.bean.Teacher;

import java.util.List;

/**
 * 管理课程信息
 */
public interface LessonService {
    /**
     * 添加
     */
    Boolean AddLesson(Lesson lesson);
    Boolean AddLessons(List<Lesson> lessons);

    /**
     * 修改课程信息
     */
    Boolean UpdateLesson(Lesson lesson);

    /**
     * 删除课程信息
     */
    Boolean DeleteLesson(Lesson lesson);
    Boolean DeleteLessons(List<Lesson> lessons);

    /**
     * 查询课程信息
     * */
    List<Lesson> ShowAllLessons();
    Lesson ShowLessonByID(Integer id);
    List<Lesson> ShowLessonsByName(String name);
    //通过教师查询课程 -----> 教师录入成绩的时候需要课程列表
    List<Lesson> ShowLessonsByTeacher(Teacher teacher);
    //通过学生查询课程 -----> 学生查看成绩的时候需要课程列表
    List<Lesson> ShowLessonsByStudent(Student student);
}
