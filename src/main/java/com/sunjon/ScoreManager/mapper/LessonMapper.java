package com.sunjon.ScoreManager.mapper;

import com.sunjon.ScoreManager.bean.Lesson;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface LessonMapper {
    List<Lesson> findAllLessonsByPage(Integer start, Integer limit);
    Integer countLessons();
    List<Lesson> findLessonsByName(String name,Integer start,Integer limit);
    void addLesson(Map<String,Object> map);
    void deleteLesson(Lesson lesson);
    void updateLesson(Lesson lesson);
}