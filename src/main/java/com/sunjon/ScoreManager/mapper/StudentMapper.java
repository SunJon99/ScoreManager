package com.sunjon.ScoreManager.mapper;

import com.sunjon.ScoreManager.bean.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
/**
 * 学生表的操作
 */
public interface StudentMapper {
    /**
     * 学生信息查询
     */
    List<Student> findAllStudents();
    List<Student> findStudents(Student conditions);
    /**
     * 学生信息修改
     */
    void updateStudent(Student student);
    /**
     * 学生信息删除
     */
    void deleteStudent(Student student);
    /**
     * 学生信息添加
     */
    void addStudent(Student student);
}
