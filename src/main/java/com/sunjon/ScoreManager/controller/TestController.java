package com.sunjon.ScoreManager.controller;


import com.sunjon.ScoreManager.bean.Organization;

import com.sunjon.ScoreManager.mapper.OrganizationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.text.ParseException;
import java.text.SimpleDateFormat;
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
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        Date t = null;
        try{
            t = ft.parse("2023-01-01");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        organization.setEndTime(t);
        organizationMapper.updateOrganization(organization);

        return organizationMapper.findAllOrganizations();
    }

}
