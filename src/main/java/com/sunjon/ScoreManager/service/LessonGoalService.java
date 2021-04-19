package com.sunjon.ScoreManager.service;

import com.sunjon.ScoreManager.bean.Lesson;
import com.sunjon.ScoreManager.bean.LessonGoal;

import java.util.List;

/**
 * 课程目标管理
 */
public interface LessonGoalService {

    /**
     * 课程目标添加
     */
    Boolean AddLessonGoal(LessonGoal lessonGoal);
    Boolean AddLeassonGoals(List<LessonGoal> lessonGoals);

    /**
     * 课程目标修改
     */
    Boolean UpdateLessonGoal(LessonGoal lessonGoal);

    /**
     * 课程目标删除
     */
    Boolean DeleteLessonGoal(LessonGoal lessonGoal);
    Boolean DeleteLessonGoals(List<LessonGoal> lessonGoals);

    /**
     * 课程目标查询
     */
    List<LessonGoal> ShowLessonGoals(Lesson lesson);
    LessonGoal ShowLessonGoal(Integer id);
}
