package com.sunjon.ScoreManager.mapper;

import com.sunjon.ScoreManager.bean.Lesson;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface LessonMapper {
    //添加一个课程信息(其中除了ID和update_time,其他的元素都是必须的)
    void addLesson(Lesson lesson);

    //可以只更新name、credit、time 其中一个，当执行更新操作时就会刷新 update_time
    void updateLesson(Lesson lesson);

    //可以根据 id 或者 name 或者 time 其中一个进行删除
    void deleteLesson(Lesson lesson);

    //可以根据 ID 或 name 或 time 进行查询
    List<Lesson> findLesson(Lesson lesson);
}