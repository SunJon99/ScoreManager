package com.sunjon.ScoreManager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SystemViewController {
    /**
     * 响应系统首页
     * @return
     */
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    /**
     * 响应系统登录页面
     * @return
     */
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

}
