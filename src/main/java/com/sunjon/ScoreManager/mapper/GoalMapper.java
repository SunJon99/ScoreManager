package com.sunjon.ScoreManager.mapper;

import com.sunjon.ScoreManager.bean.Goal;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface GoalMapper {
    List<Goal> findGoal4Lesson(Integer lessonId);
    void addGoal4Lesson(Map<String,Object> map);
    void deleteGoal(Goal goal);
    void deleteGoal(Integer lessonId);
    void updateGoal(Goal goal);
}
