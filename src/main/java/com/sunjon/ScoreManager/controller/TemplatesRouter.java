package com.sunjon.ScoreManager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
public class TemplatesRouter {
    @RequestMapping("/login")
    public String login(HttpSession session, RedirectAttributes attributes){
        return "login";
    }

    @RequestMapping("/stuIndex")
    public String stuIndex(){
        return "stuIndex";
    }


}
