package com.sunjon.ScoreManager.mapper;

import com.sunjon.ScoreManager.bean.LessonGoal;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
/**
 * 课程目标表的操作
 * 目标信息的增删查改
 */
public interface LessonGoalMapper {
    /**
     * 课程目标的查询
     */
    List<LessonGoal> findAllLessonGoals();
    List<LessonGoal> findLessonGoals(LessonGoal conditions);
    /**
     * 课程目标的修改
     */
    void updateLessonGoal(LessonGoal lessonGoal);
    /***
     * 课程目标的删除
     */
    void deleteLessonGoal(LessonGoal lessonGoal);
    /**
     * 课程目标的添加
     */
    void addLessonGoal(LessonGoal lessonGoal);
}
