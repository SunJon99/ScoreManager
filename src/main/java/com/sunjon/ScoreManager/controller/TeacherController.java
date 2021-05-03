package com.sunjon.ScoreManager.controller;

import com.sunjon.ScoreManager.bean.Teacher;
import com.sunjon.ScoreManager.mapper.TeacherMapper;
import com.sunjon.ScoreManager.view.TeacherList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("teacher")
public class TeacherController {
    private TeacherMapper teacherMapper;

    @Autowired
    public void setTeacherMapper(TeacherMapper teacherMapper) {
        this.teacherMapper = teacherMapper;
    }

    @RequestMapping("getAllTeachers")
    public TeacherList getAllTeachers(@RequestParam(required = false,defaultValue = "1")Integer curr,
                                      @RequestParam(required = false,defaultValue = "10")Integer limit){
        Integer start = (curr-1) * limit;
        Integer count = teacherMapper.countTeachers();
        List<Teacher> list = teacherMapper.findAllTeachersByPage(start,limit);
        TeacherList data = new TeacherList();
        data.setData(list);
        data.setCode(0);
        data.setCount(count);
        return data;
    }

}
