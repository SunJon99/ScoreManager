package com.sunjon.ScoreManager.mapper;

import com.sunjon.ScoreManager.bean.Lesson;
import com.sunjon.ScoreManager.bean.Student;
import com.sunjon.ScoreManager.bean.Teacher;
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

    /**
     * 提供不同角色需求的查看课程
     * 1.学生：查看自己的课程表
     * 2.教师：查看自己的课程表
     * 3.学院管理员：查看学院课程表
     * 4.机构管理员：查看机构课程表
     */
    //查询某学生的各种课程
    List<Lesson> findLessonsForStudent(@Param("id") Integer stuID,@Param("conditions") Lesson conditions);
    //查询某教师的各种课程
    List<Lesson> findLessonsForTeacher(@Param("id") Integer tcID,@Param("conditions") Lesson conditions);
    //查询某学院的各种课程
    List<Lesson> findLessonsForDepartment(@Param("id") Integer dpID,@Param("conditions") Lesson conditions);
    //查询某机构的各种课程
    List<Lesson> findLessonsForOrganization(@Param("id") Integer ogID,@Param("conditions") Lesson conditions);

    //查询某个课程的详细信息（包含课程的测试项目等）通过ID的方式。
    Lesson findDetailedLessonByID(Integer id);
}