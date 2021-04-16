package com.sunjon.ScoreManager.controller;

import com.sunjon.ScoreManager.bean.Authority;
import com.sunjon.ScoreManager.mapper.AuthorityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Controller
public class TestController {


    AuthorityMapper authorityMapper;

    @Autowired
    public void setAuthorityMapper(AuthorityMapper authorityMapper) {
        this.authorityMapper = authorityMapper;
    }

    @RequestMapping("/test")
    @ResponseBody
    public List<Authority> test(){
        List<Authority> list =  authorityMapper.getAll();
        return list;
    }
}
