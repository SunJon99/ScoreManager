package com.sunjon.ScoreManager.controller;

import com.sunjon.ScoreManager.bean.Student;
import com.sunjon.ScoreManager.mapper.StudentMapper;
import com.sunjon.ScoreManager.view.StudentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private StudentMapper studentMapper;

    @Autowired
    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @RequestMapping("/getAllStudents")
    public StudentList getAllStudents(@RequestParam(name = "page",required = false,defaultValue = "1")Integer curr,
                                      @RequestParam(name = "limit",required = false,defaultValue = "10")Integer limit){
        Integer start = (curr-1) * limit;
        Integer count = studentMapper.countStudents();
        List<Student> list = studentMapper.findAllStudentsByPage(start,limit);
        StudentList data = new StudentList();
        data.setData(list);
        data.setCode(0);
        data.setCount(count);
        return data;
    }
}
