package com.sunjon.ScoreManager.controller;

import com.sunjon.ScoreManager.view.VResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping("/manager")
    @ResponseBody
    public VResult managerLogin(){
        return new VResult();
    }

    @RequestMapping("/teacher")
    @ResponseBody
    public VResult teacherLogin(){
        return new VResult();
    }
    @RequestMapping("student")
    @ResponseBody
    public VResult studentLogin(){
        return new VResult();
    }





}
