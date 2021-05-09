package com.sunjon.ScoreManager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class StudentViewController {

    /**
     * 响应学生首页
     * @return
     */
    @RequestMapping("/student-index")
    public String studentIndex(){
        return "student/student-index";
    }


    @RequestMapping("/my-score")
    public String myScore(){
        return "student/my-score";
    }

    @RequestMapping("/my-info")
    public String score(){
        return "student/my-info";
    }

    @RequestMapping("/score-account")
    public String scoreAccount(){
        return "score-account";
    }

    @RequestMapping("/score-add")
    public String scoreAdd(){
        return "score-add";
    }

    @RequestMapping("/score-detail")
    public String scoreDetail(){
        return "score-detail";
    }

    @RequestMapping("/score-edit")
    public String scoreEdit(){
        return "score-edit";
    }

    @RequestMapping("/score-list")
    public String scoreList(){
        return "score-list";
    }



}
