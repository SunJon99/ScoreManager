package com.sunjon.ScoreManager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ViewController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/my-score")
    public String myScore(){
        return "my-score";
    }

    @RequestMapping("/score")
    public String score(){
        return "score";
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

    @RequestMapping("/student-list")
    public String studenList(){
        return "student-list";
    }

    @RequestMapping("/student-add")
    public String studentAdd(){
        return "student-add";
    }

    @RequestMapping("/student-detail")
    public String studentDetail(){
        return "student-detail";
    }

    @RequestMapping("/student-edit")
    public String studentEdit(){
        return "student-edit";
    }

    @RequestMapping("/student-index")
    public String studentIndex(){
        return "student-index";
    }
}
