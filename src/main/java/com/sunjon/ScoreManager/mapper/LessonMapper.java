package com.sunjon.ScoreManager.mapper;

import com.sunjon.ScoreManager.bean.Lesson;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface LessonMapper {
    void addLesson(Lesson lesson);
    void updateLesson(Lesson lesson);
    void deleteLesson(Lesson lesson);
}
