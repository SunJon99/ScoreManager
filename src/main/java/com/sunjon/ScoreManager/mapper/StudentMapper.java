package com.sunjon.ScoreManager.mapper;

import com.sunjon.ScoreManager.bean.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface StudentMapper {
    List<Student> findAllStudentsByPage(Integer start,Integer limit);
    Integer countStudents();
    List<Student> findStudentsByName(String name, Integer start, Integer limit);
    void addStudent(Map<String,Object> map);
    void updateStudent(Student student);
    void deleteStudent(Student student);
}
