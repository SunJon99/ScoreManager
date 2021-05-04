package com.sunjon.ScoreManager.mapper;

import com.sunjon.ScoreManager.bean.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface TeacherMapper {

    //获取所有在职的教师
    List<Teacher> findAllTeachersByPage(Integer start,Integer limit);
    //获取在职教师数量
    Integer countTeachers();
    //通过名字搜索教师
    List<Teacher> findTeachersByName(String name,Integer start,Integer limit);
    //删除教师信息
    void deleteTeacher(Teacher teacher);
    void addTeacher(Map<String,Object> map);
    void updateTeacher(Teacher teacher);
}
