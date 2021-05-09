package com.sunjon.ScoreManager.mapper;

import com.sunjon.ScoreManager.bean.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface StudentMapper {
    List<Student> findAllStudentsByPage(Integer start,Integer limit);
    Integer countStudents();
}
