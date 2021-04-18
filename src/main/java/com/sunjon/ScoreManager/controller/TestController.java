package com.sunjon.ScoreManager.controller;

import com.sunjon.ScoreManager.bean.Authority;
import com.sunjon.ScoreManager.bean.Lesson;
import com.sunjon.ScoreManager.mapper.AuthorityMapper;
import com.sunjon.ScoreManager.mapper.LessonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {


    private AuthorityMapper authorityMapper;
    private LessonMapper lessonMapper;
    @Autowired
    public void setAuthorityMapper(AuthorityMapper authorityMapper) {
        this.authorityMapper = authorityMapper;
    }

    @Autowired
    public void setLessonMapper(LessonMapper lessonMapper) {
        this.lessonMapper = lessonMapper;
    }

    @RequestMapping("/test")
    @ResponseBody
    public List<Authority> test(){
        List<Authority> list =  authorityMapper.getAll();
        return list;
    }
    @RequestMapping("/testLesson")
    @ResponseBody
    public String testLessonMap(){
        Lesson lesson = new Lesson();
        String[] list = new String[5];
        list[0] = "大学英语A";
        list[1] = "高等数学A";
        list[2] = "高等数学B";
        list[3] = "线性代数";
        list[4] = "大学物理";
        lesson.setCredit(3.0f);
        lesson.setTime("2021_01");
        for (int i = 0; i < 5; i++) {
            lesson.setName(list[i]);
            lessonMapper.addLesson(lesson);
        }
        return "done";
    }
    @RequestMapping("/findLesson")
    @ResponseBody
    public List<Lesson> findLessons(){
        Lesson condition = new Lesson();
        condition.setCredit(-1.0f);
        List<Lesson> list =  lessonMapper.findLesson(condition);
        return list;
    }
}
