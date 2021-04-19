package com.sunjon.ScoreManager.controller;

import com.sunjon.ScoreManager.bean.Authority;
import com.sunjon.ScoreManager.bean.Lesson;
import com.sunjon.ScoreManager.bean.Organization;
import com.sunjon.ScoreManager.mapper.AuthorityMapper;
import com.sunjon.ScoreManager.mapper.LessonMapper;
import com.sunjon.ScoreManager.mapper.OrganizationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class TestController {
    private OrganizationMapper organizationMapper;

    @Autowired
    public void setOrganizationMapper(OrganizationMapper organizationMapper) {
        this.organizationMapper = organizationMapper;
    }

    @RequestMapping("/test")
    @ResponseBody
    public List<Organization> test(){
        Organization organization = new Organization();
        organization.setId(4);
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        Date t = null;
        try{
            t = ft.parse("2022-01-01");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        organization.setEndTime(t);
        List<Organization> list = organizationMapper.findOrganizations(organization);
        return list;
    }

}
