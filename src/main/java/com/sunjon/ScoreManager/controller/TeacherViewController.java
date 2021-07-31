package com.sunjon.ScoreManager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TeacherViewController {

    @RequestMapping("/teacher-index")
    public String teacherIndex(){
        return "teacher/teacher-index";
    }

    @RequestMapping("/my-lesson")
    public String myLesson(){
        return "teacher/my-lesson";
    }

    @RequestMapping("/score-edit")
    public String editScore(){
        return "teacher/score-edit";
    }

    @RequestMapping("/lesson-detail")
    public String lessonDetail(){
        return "teacher/lesson-detail";
    }
}
