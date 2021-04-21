package com.sunjon.ScoreManager.controller;


import com.sunjon.ScoreManager.bean.Organization;

import com.sunjon.ScoreManager.mapper.OrganizationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Controller
public class TestController {
    private OrganizationMapper organizationMapper;

    @Autowired
    public void setOrganizationMapper(OrganizationMapper organizationMapper) {
        this.organizationMapper = organizationMapper;
    }


    @RequestMapping("/login")
    public String login(){
        return "login";
    }

}
